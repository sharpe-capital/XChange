package org.knowm.xchange.dto;

import java.math.BigDecimal;

public class Position {
  private final BigDecimal quantity;
  private final BigDecimal price;

  public Position(BigDecimal quantity, BigDecimal price) {
    this.quantity = quantity;
    this.price = price;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public BigDecimal getPrice() {
    return price;
  }
}
