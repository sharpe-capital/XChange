package org.knowm.xchange.dto.marketdata;

import java.math.BigDecimal;

public class KLine {

  private final Long timestamp;
  private final BigDecimal open;
  private final BigDecimal high;
  private final BigDecimal low;
  private final BigDecimal close;
  private final BigDecimal amount;
  private final BigDecimal volume;
  private final BigDecimal vwap;

  public KLine(
      Long timestamp,
      BigDecimal open,
      BigDecimal high,
      BigDecimal low,
      BigDecimal close,
      BigDecimal amount,
      BigDecimal volume,
      BigDecimal vwap) {
    this.timestamp = timestamp;
    this.open = open;
    this.high = high;
    this.low = low;
    this.close = close;
    this.amount = amount;
    this.volume = volume;
    this.vwap = vwap;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public BigDecimal getOpen() {
    return open;
  }

  public BigDecimal getHigh() {
    return high;
  }

  public BigDecimal getLow() {
    return low;
  }

  public BigDecimal getClose() {
    return close;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public BigDecimal getVolume() {
    return volume;
  }

  public BigDecimal getVwap() {
    return vwap;
  }
}
