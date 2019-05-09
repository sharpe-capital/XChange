package org.knowm.xchange.dto;

import java.math.BigDecimal;
import org.knowm.xchange.currency.CurrencyPair;

public class UpdateOrder extends Order {
  private final BigDecimal price;

  public UpdateOrder(
      BigDecimal originalAmount, CurrencyPair currencyPair, String id, BigDecimal price) {
    super(null, originalAmount, currencyPair, id, null);
    this.price = price;
  }

  public BigDecimal getPrice() {

    return price;
  }
}
