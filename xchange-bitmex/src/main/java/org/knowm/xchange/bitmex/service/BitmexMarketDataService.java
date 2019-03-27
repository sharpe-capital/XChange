package org.knowm.xchange.bitmex.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import org.knowm.xchange.bitmex.BitmexAdapters;
import org.knowm.xchange.bitmex.BitmexExchange;
import org.knowm.xchange.bitmex.dto.account.BitmexTicker;
import org.knowm.xchange.bitmex.dto.marketdata.BitmexKline;
import org.knowm.xchange.bitmex.dto.marketdata.BitmexPublicTrade;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.KLine;
import org.knowm.xchange.dto.marketdata.OrderBook;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.dto.marketdata.Trades;
import org.knowm.xchange.exceptions.ExchangeException;
import org.knowm.xchange.service.marketdata.MarketDataService;

/**
 * Implementation of the market data service for Bitmex
 *
 * <ul>
 *   <li>Provides access to various market data values
 * </ul>
 */
public class BitmexMarketDataService extends BitmexMarketDataServiceRaw
    implements MarketDataService {

  private static final DateTimeFormatter KLINES_DATE_FORMATTER =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
  /**
   * Constructor
   *
   * @param exchange
   */
  public BitmexMarketDataService(BitmexExchange exchange) {

    super(exchange);
  }

  @Override
  public Ticker getTicker(CurrencyPair currencyPair, Object... args) throws IOException {

    String bitmexSymbol = BitmexAdapters.adaptCurrencyPairToSymbol(currencyPair);
    List<BitmexTicker> bitmexTickers = getTicker(bitmexSymbol);

    if (bitmexTickers.isEmpty()) {
      return null;
    }

    BitmexTicker bitmexTicker = bitmexTickers.get(0);
    Ticker ticker =
        new Ticker.Builder()
            .currencyPair(currencyPair)
            .open(bitmexTicker.getOpenValue())
            .last(bitmexTicker.getLastPrice())
            .bid(bitmexTicker.getBidPrice())
            .ask(bitmexTicker.getAskPrice())
            .high(bitmexTicker.getHighPrice())
            .low(bitmexTicker.getLowPrice())
            .vwap(new BigDecimal(bitmexTicker.getVwap()))
            .volume(bitmexTicker.getVolume24h())
            .quoteVolume(null)
            .timestamp(bitmexTicker.getTimestamp())
            .build();

    return ticker;
  }

  @Override
  public OrderBook getOrderBook(CurrencyPair currencyPair, Object... args) throws IOException {
    String bitmexSymbol = BitmexAdapters.adaptCurrencyPairToSymbol(currencyPair);
    return BitmexAdapters.adaptOrderBook(getBitmexDepth(bitmexSymbol), currencyPair);
  }

  @Override
  public Trades getTrades(CurrencyPair currencyPair, Object... args) throws IOException {

    Integer limit = null;
    Long start = null;

    if (args.length > 0) {
      Object arg1 = args[0];
      if (arg1 instanceof Integer) {
        limit = (Integer) arg1;
      } else {
        throw new ExchangeException("args[0] must be of type Integer!");
      }
    }
    if (args.length > 1) {
      Object arg2 = args[1];
      if (arg2 instanceof Long) {
        start = (Long) arg2;
      } else {
        throw new ExchangeException("args[1] must be of type Long!");
      }
    }

    String bitmexSymbol = BitmexAdapters.adaptCurrencyPairToSymbol(currencyPair);
    List<BitmexPublicTrade> trades = getBitmexTrades(bitmexSymbol, limit, start);
    return BitmexAdapters.adaptTrades(trades, currencyPair);
  }

  @Override
  public List<KLine> getKLines(CurrencyPair currencyPair, Object... args) throws IOException {
    String binSize = getFromArgs(0, String.class, args);
    boolean partial = getFromArgs(1, Boolean.class, args);
    long count = getFromArgs(3, Long.class, args);
    boolean reverse = getFromArgs(4, Boolean.class, args);

    List<BitmexKline> bitmexKLines =
        getBucketedTrades(binSize, partial, currencyPair, count, reverse);

    return bitmexKLines.stream()
        .map(
            bitmexKLine -> {
              LocalDateTime time =
                  LocalDateTime.parse(bitmexKLine.getTimestamp(), KLINES_DATE_FORMATTER);
              Long timestamp = time.atOffset(ZoneOffset.UTC).toInstant().toEpochMilli();

              return new KLine(
                  timestamp,
                  bitmexKLine.getOpen(),
                  bitmexKLine.getHigh(),
                  bitmexKLine.getLow(),
                  bitmexKLine.getClose(),
                  BigDecimal.valueOf(bitmexKLine.getTurnover()),
                  bitmexKLine.getVolume(),
                  bitmexKLine.getVwap());
            })
        .collect(Collectors.toList());
  }
}
