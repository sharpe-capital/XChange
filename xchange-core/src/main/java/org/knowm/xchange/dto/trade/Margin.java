package org.knowm.xchange.dto.trade;

import java.math.BigDecimal;

public class Margin {
  private BigDecimal availableMargin;
  private BigDecimal marginBalance;
  private BigDecimal walletBalance;
  private BigDecimal unrealisedPnl;

  public Margin(
      BigDecimal availableMargin,
      BigDecimal marginBalance,
      BigDecimal walletBalance,
      BigDecimal unrealisedPnl) {
    this.availableMargin = availableMargin;
    this.marginBalance = marginBalance;
    this.walletBalance = walletBalance;
    this.unrealisedPnl = unrealisedPnl;
  }

  public BigDecimal getAvailableMargin() {
    return availableMargin;
  }

  public BigDecimal getMarginBalance() {
    return marginBalance;
  }

  public BigDecimal getWalletBalance() {
    return walletBalance;
  }

  public BigDecimal getUnrealisedPnl() {
    return unrealisedPnl;
  }
}
