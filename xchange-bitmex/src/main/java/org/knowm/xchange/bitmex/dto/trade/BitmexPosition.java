package org.knowm.xchange.bitmex.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.knowm.xchange.bitmex.AbstractHttpResponseAware;

public class BitmexPosition extends AbstractHttpResponseAware {

  @JsonProperty("account")
  private Integer account;

  @JsonProperty("symbol")
  private String symbol;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("underlying")
  private String underlying;

  @JsonProperty("quoteCurrency")
  private String quoteCurrency;

  @JsonProperty("commission")
  private BigDecimal commission;

  @JsonProperty("initMarginReq")
  private BigDecimal initMarginReq;

  @JsonProperty("maintMarginReq")
  private BigDecimal maintMarginReq;

  @JsonProperty("riskLimit")
  private BigDecimal riskLimit;

  @JsonProperty("leverage")
  private BigDecimal leverage;

  @JsonProperty("crossMargin")
  private Boolean crossMargin;

  @JsonProperty("deleveragePercentile")
  private BigDecimal deleveragePercentile;

  @JsonProperty("rebalancedPnl")
  private BigDecimal rebalancedPnl;

  @JsonProperty("prevRealisedPnl")
  private BigDecimal prevRealisedPnl;

  @JsonProperty("prevUnrealisedPnl")
  private BigDecimal prevUnrealisedPnl;

  @JsonProperty("prevClosePrice")
  private BigDecimal prevClosePrice;

  @JsonProperty("openingTimestamp")
  private String openingTimestamp;

  @JsonProperty("openingQty")
  private BigDecimal openingQty;

  @JsonProperty("openingCost")
  private BigDecimal openingCost;

  @JsonProperty("openingComm")
  private BigDecimal openingComm;

  @JsonProperty("openOrderBuyQty")
  private BigDecimal openOrderBuyQty;

  @JsonProperty("openOrderBuyCost")
  private BigDecimal openOrderBuyCost;

  @JsonProperty("openOrderBuyPremium")
  private BigDecimal openOrderBuyPremium;

  @JsonProperty("openOrderSellQty")
  private BigDecimal openOrderSellQty;

  @JsonProperty("openOrderSellCost")
  private BigDecimal openOrderSellCost;

  @JsonProperty("openOrderSellPremium")
  private BigDecimal openOrderSellPremium;

  @JsonProperty("execBuyQty")
  private BigDecimal execBuyQty;

  @JsonProperty("execBuyCost")
  private BigDecimal execBuyCost;

  @JsonProperty("execSellQty")
  private BigDecimal execSellQty;

  @JsonProperty("execSellCost")
  private BigDecimal execSellCost;

  @JsonProperty("execQty")
  private BigDecimal execQty;

  @JsonProperty("execCost")
  private BigDecimal execCost;

  @JsonProperty("execComm")
  private BigDecimal execComm;

  @JsonProperty("currentTimestamp")
  private String currentTimestamp;

  @JsonProperty("currentQty")
  private BigDecimal currentQty;

  @JsonProperty("currentCost")
  private BigDecimal currentCost;

  @JsonProperty("currentComm")
  private BigDecimal currentComm;

  @JsonProperty("realisedCost")
  private BigDecimal realisedCost;

  @JsonProperty("unrealisedCost")
  private BigDecimal unrealisedCost;

  @JsonProperty("grossOpenCost")
  private BigDecimal grossOpenCost;

  @JsonProperty("grossOpenPremium")
  private BigDecimal grossOpenPremium;

  @JsonProperty("grossExecCost")
  private BigDecimal grossExecCost;

  @JsonProperty("isOpen")
  private Boolean isOpen;

  @JsonProperty("markPrice")
  private BigDecimal markPrice;

  @JsonProperty("markValue")
  private BigDecimal markValue;

  @JsonProperty("riskValue")
  private BigDecimal riskValue;

  @JsonProperty("homeNotional")
  private BigDecimal homeNotional;

  @JsonProperty("foreignNotional")
  private BigDecimal foreignNotional;

  @JsonProperty("posState")
  private String posState;

  @JsonProperty("posCost")
  private BigDecimal posCost;

  @JsonProperty("posCost2")
  private BigDecimal posCost2;

  @JsonProperty("posCross")
  private BigDecimal posCross;

  @JsonProperty("posInit")
  private BigDecimal posInit;

  @JsonProperty("posComm")
  private BigDecimal posComm;

  @JsonProperty("posLoss")
  private BigDecimal posLoss;

  @JsonProperty("posMargin")
  private BigDecimal posMargin;

  @JsonProperty("posMaint")
  private BigDecimal posMaint;

  @JsonProperty("posAllowance")
  private BigDecimal posAllowance;

  @JsonProperty("taxableMargin")
  private BigDecimal taxableMargin;

  @JsonProperty("initMargin")
  private BigDecimal initMargin;

  @JsonProperty("maintMargin")
  private BigDecimal maintMargin;

  @JsonProperty("sessionMargin")
  private BigDecimal sessionMargin;

  @JsonProperty("targetExcessMargin")
  private BigDecimal targetExcessMargin;

  @JsonProperty("varMargin")
  private BigDecimal varMargin;

  @JsonProperty("realisedGrossPnl")
  private BigDecimal realisedGrossPnl;

  @JsonProperty("realisedTax")
  private BigDecimal realisedTax;

  @JsonProperty("realisedPnl")
  private BigDecimal realisedPnl;

  @JsonProperty("unrealisedGrossPnl")
  private BigDecimal unrealisedGrossPnl;

  @JsonProperty("longBankrupt")
  private BigDecimal longBankrupt;

  @JsonProperty("shortBankrupt")
  private BigDecimal shortBankrupt;

  @JsonProperty("taxBase")
  private BigDecimal taxBase;

  @JsonProperty("indicativeTaxRate")
  private BigDecimal indicativeTaxRate;

  @JsonProperty("indicativeTax")
  private BigDecimal indicativeTax;

  @JsonProperty("unrealisedTax")
  private BigDecimal unrealisedTax;

  @JsonProperty("unrealisedPnl")
  private BigDecimal unrealisedPnl;

  @JsonProperty("unrealisedPnlPcnt")
  private BigDecimal unrealisedPnlPcnt;

  @JsonProperty("unrealisedRoePcnt")
  private BigDecimal unrealisedRoePcnt;

  @JsonProperty("simpleQty")
  private BigDecimal simpleQty;

  @JsonProperty("simpleCost")
  private BigDecimal simpleCost;

  @JsonProperty("simpleValue")
  private BigDecimal simpleValue;

  @JsonProperty("simplePnl")
  private BigDecimal simplePnl;

  @JsonProperty("simplePnlPcnt")
  private BigDecimal simplePnlPcnt;

  @JsonProperty("avgCostPrice")
  private BigDecimal avgCostPrice;

  @JsonProperty("avgEntryPrice")
  private BigDecimal avgEntryPrice;

  @JsonProperty("breakEvenPrice")
  private BigDecimal breakEvenPrice;

  @JsonProperty("marginCallPrice")
  private BigDecimal marginCallPrice;

  @JsonProperty("liquidationPrice")
  private BigDecimal liquidationPrice;

  @JsonProperty("bankruptPrice")
  private BigDecimal bankruptPrice;

  @JsonProperty("timestamp")
  private String timestamp;

  @JsonProperty("lastPrice")
  private BigDecimal lastPrice;

  @JsonProperty("lastValue")
  private BigDecimal lastValue;

  public Integer getAccount() {
    return account;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getCurrency() {
    return currency;
  }

  public String getUnderlying() {
    return underlying;
  }

  public String getQuoteCurrency() {
    return quoteCurrency;
  }

  public BigDecimal getCommission() {
    return commission;
  }

  public BigDecimal getInitMarginReq() {
    return initMarginReq;
  }

  public BigDecimal getMaintMarginReq() {
    return maintMarginReq;
  }

  public BigDecimal getRiskLimit() {
    return riskLimit;
  }

  public BigDecimal getLeverage() {
    return leverage;
  }

  public Boolean getCrossMargin() {
    return crossMargin;
  }

  public BigDecimal getDeleveragePercentile() {
    return deleveragePercentile;
  }

  public BigDecimal getRebalancedPnl() {
    return rebalancedPnl;
  }

  public BigDecimal getPrevRealisedPnl() {
    return prevRealisedPnl;
  }

  public BigDecimal getPrevUnrealisedPnl() {
    return prevUnrealisedPnl;
  }

  public BigDecimal getPrevClosePrice() {
    return prevClosePrice;
  }

  public String getOpeningTimestamp() {
    return openingTimestamp;
  }

  public BigDecimal getOpeningQty() {
    return openingQty;
  }

  public BigDecimal getOpeningCost() {
    return openingCost;
  }

  public BigDecimal getOpeningComm() {
    return openingComm;
  }

  public BigDecimal getOpenOrderBuyQty() {
    return openOrderBuyQty;
  }

  public BigDecimal getOpenOrderBuyCost() {
    return openOrderBuyCost;
  }

  public BigDecimal getOpenOrderBuyPremium() {
    return openOrderBuyPremium;
  }

  public BigDecimal getOpenOrderSellQty() {
    return openOrderSellQty;
  }

  public BigDecimal getOpenOrderSellCost() {
    return openOrderSellCost;
  }

  public BigDecimal getOpenOrderSellPremium() {
    return openOrderSellPremium;
  }

  public BigDecimal getExecBuyQty() {
    return execBuyQty;
  }

  public BigDecimal getExecBuyCost() {
    return execBuyCost;
  }

  public BigDecimal getExecSellQty() {
    return execSellQty;
  }

  public BigDecimal getExecSellCost() {
    return execSellCost;
  }

  public BigDecimal getExecQty() {
    return execQty;
  }

  public BigDecimal getExecCost() {
    return execCost;
  }

  public BigDecimal getExecComm() {
    return execComm;
  }

  public String getCurrentTimestamp() {
    return currentTimestamp;
  }

  public BigDecimal getCurrentQty() {
    return currentQty;
  }

  public BigDecimal getCurrentCost() {
    return currentCost;
  }

  public BigDecimal getCurrentComm() {
    return currentComm;
  }

  public BigDecimal getRealisedCost() {
    return realisedCost;
  }

  public BigDecimal getUnrealisedCost() {
    return unrealisedCost;
  }

  public BigDecimal getGrossOpenCost() {
    return grossOpenCost;
  }

  public BigDecimal getGrossOpenPremium() {
    return grossOpenPremium;
  }

  public BigDecimal getGrossExecCost() {
    return grossExecCost;
  }

  public Boolean getOpen() {
    return isOpen;
  }

  public BigDecimal getMarkPrice() {
    return markPrice;
  }

  public BigDecimal getMarkValue() {
    return markValue;
  }

  public BigDecimal getRiskValue() {
    return riskValue;
  }

  public BigDecimal getHomeNotional() {
    return homeNotional;
  }

  public BigDecimal getForeignNotional() {
    return foreignNotional;
  }

  public String getPosState() {
    return posState;
  }

  public BigDecimal getPosCost() {
    return posCost;
  }

  public BigDecimal getPosCost2() {
    return posCost2;
  }

  public BigDecimal getPosCross() {
    return posCross;
  }

  public BigDecimal getPosInit() {
    return posInit;
  }

  public BigDecimal getPosComm() {
    return posComm;
  }

  public BigDecimal getPosLoss() {
    return posLoss;
  }

  public BigDecimal getPosMargin() {
    return posMargin;
  }

  public BigDecimal getPosMaint() {
    return posMaint;
  }

  public BigDecimal getPosAllowance() {
    return posAllowance;
  }

  public BigDecimal getTaxableMargin() {
    return taxableMargin;
  }

  public BigDecimal getInitMargin() {
    return initMargin;
  }

  public BigDecimal getMaintMargin() {
    return maintMargin;
  }

  public BigDecimal getSessionMargin() {
    return sessionMargin;
  }

  public BigDecimal getTargetExcessMargin() {
    return targetExcessMargin;
  }

  public BigDecimal getVarMargin() {
    return varMargin;
  }

  public BigDecimal getRealisedGrossPnl() {
    return realisedGrossPnl;
  }

  public BigDecimal getRealisedTax() {
    return realisedTax;
  }

  public BigDecimal getRealisedPnl() {
    return realisedPnl;
  }

  public BigDecimal getUnrealisedGrossPnl() {
    return unrealisedGrossPnl;
  }

  public BigDecimal getLongBankrupt() {
    return longBankrupt;
  }

  public BigDecimal getShortBankrupt() {
    return shortBankrupt;
  }

  public BigDecimal getTaxBase() {
    return taxBase;
  }

  public BigDecimal getIndicativeTaxRate() {
    return indicativeTaxRate;
  }

  public BigDecimal getIndicativeTax() {
    return indicativeTax;
  }

  public BigDecimal getUnrealisedTax() {
    return unrealisedTax;
  }

  public BigDecimal getUnrealisedPnl() {
    return unrealisedPnl;
  }

  public BigDecimal getUnrealisedPnlPcnt() {
    return unrealisedPnlPcnt;
  }

  public BigDecimal getUnrealisedRoePcnt() {
    return unrealisedRoePcnt;
  }

  public BigDecimal getSimpleQty() {
    return simpleQty;
  }

  public BigDecimal getSimpleCost() {
    return simpleCost;
  }

  public BigDecimal getSimpleValue() {
    return simpleValue;
  }

  public BigDecimal getSimplePnl() {
    return simplePnl;
  }

  public BigDecimal getSimplePnlPcnt() {
    return simplePnlPcnt;
  }

  public BigDecimal getAvgCostPrice() {
    return avgCostPrice;
  }

  public BigDecimal getAvgEntryPrice() {
    return avgEntryPrice;
  }

  public BigDecimal getBreakEvenPrice() {
    return breakEvenPrice;
  }

  public BigDecimal getMarginCallPrice() {
    return marginCallPrice;
  }

  public BigDecimal getLiquidationPrice() {
    return liquidationPrice;
  }

  public BigDecimal getBankruptPrice() {
    return bankruptPrice;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public BigDecimal getLastPrice() {
    return lastPrice;
  }

  public BigDecimal getLastValue() {
    return lastValue;
  }

  @Override
  public String toString() {
    return "BitmexPosition{"
        + "account="
        + account
        + ", symbol='"
        + symbol
        + '\''
        + ", currency='"
        + currency
        + '\''
        + ", underlying='"
        + underlying
        + '\''
        + ", quoteCurrency='"
        + quoteCurrency
        + '\''
        + ", commission="
        + commission
        + ", initMarginReq="
        + initMarginReq
        + ", maintMarginReq="
        + maintMarginReq
        + ", riskLimit="
        + riskLimit
        + ", leverage="
        + leverage
        + ", crossMargin="
        + crossMargin
        + ", deleveragePercentile="
        + deleveragePercentile
        + ", rebalancedPnl="
        + rebalancedPnl
        + ", prevRealisedPnl="
        + prevRealisedPnl
        + ", prevUnrealisedPnl="
        + prevUnrealisedPnl
        + ", prevClosePrice="
        + prevClosePrice
        + ", openingTimestamp='"
        + openingTimestamp
        + '\''
        + ", openingQty="
        + openingQty
        + ", openingCost="
        + openingCost
        + ", openingComm="
        + openingComm
        + ", openOrderBuyQty="
        + openOrderBuyQty
        + ", openOrderBuyCost="
        + openOrderBuyCost
        + ", openOrderBuyPremium="
        + openOrderBuyPremium
        + ", openOrderSellQty="
        + openOrderSellQty
        + ", openOrderSellCost="
        + openOrderSellCost
        + ", openOrderSellPremium="
        + openOrderSellPremium
        + ", execBuyQty="
        + execBuyQty
        + ", execBuyCost="
        + execBuyCost
        + ", execSellQty="
        + execSellQty
        + ", execSellCost="
        + execSellCost
        + ", execQty="
        + execQty
        + ", execCost="
        + execCost
        + ", execComm="
        + execComm
        + ", currentTimestamp='"
        + currentTimestamp
        + '\''
        + ", currentQty="
        + currentQty
        + ", currentCost="
        + currentCost
        + ", currentComm="
        + currentComm
        + ", realisedCost="
        + realisedCost
        + ", unrealisedCost="
        + unrealisedCost
        + ", grossOpenCost="
        + grossOpenCost
        + ", grossOpenPremium="
        + grossOpenPremium
        + ", grossExecCost="
        + grossExecCost
        + ", isOpen="
        + isOpen
        + ", markPrice="
        + markPrice
        + ", markValue="
        + markValue
        + ", riskValue="
        + riskValue
        + ", homeNotional="
        + homeNotional
        + ", foreignNotional="
        + foreignNotional
        + ", posState='"
        + posState
        + '\''
        + ", posCost="
        + posCost
        + ", posCost2="
        + posCost2
        + ", posCross="
        + posCross
        + ", posInit="
        + posInit
        + ", posComm="
        + posComm
        + ", posLoss="
        + posLoss
        + ", posMargin="
        + posMargin
        + ", posMaint="
        + posMaint
        + ", posAllowance="
        + posAllowance
        + ", taxableMargin="
        + taxableMargin
        + ", initMargin="
        + initMargin
        + ", maintMargin="
        + maintMargin
        + ", sessionMargin="
        + sessionMargin
        + ", targetExcessMargin="
        + targetExcessMargin
        + ", varMargin="
        + varMargin
        + ", realisedGrossPnl="
        + realisedGrossPnl
        + ", realisedTax="
        + realisedTax
        + ", realisedPnl="
        + realisedPnl
        + ", unrealisedGrossPnl="
        + unrealisedGrossPnl
        + ", longBankrupt="
        + longBankrupt
        + ", shortBankrupt="
        + shortBankrupt
        + ", taxBase="
        + taxBase
        + ", indicativeTaxRate="
        + indicativeTaxRate
        + ", indicativeTax="
        + indicativeTax
        + ", unrealisedTax="
        + unrealisedTax
        + ", unrealisedPnl="
        + unrealisedPnl
        + ", unrealisedPnlPcnt="
        + unrealisedPnlPcnt
        + ", unrealisedRoePcnt="
        + unrealisedRoePcnt
        + ", simpleQty="
        + simpleQty
        + ", simpleCost="
        + simpleCost
        + ", simpleValue="
        + simpleValue
        + ", simplePnl="
        + simplePnl
        + ", simplePnlPcnt="
        + simplePnlPcnt
        + ", avgCostPrice="
        + avgCostPrice
        + ", avgEntryPrice="
        + avgEntryPrice
        + ", breakEvenPrice="
        + breakEvenPrice
        + ", marginCallPrice="
        + marginCallPrice
        + ", liquidationPrice="
        + liquidationPrice
        + ", bankruptPrice="
        + bankruptPrice
        + ", timestamp='"
        + timestamp
        + '\''
        + ", lastPrice="
        + lastPrice
        + ", lastValue="
        + lastValue
        + '}';
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public void setUnderlying(String underlying) {
    this.underlying = underlying;
  }

  public void setQuoteCurrency(String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
  }

  public void setCommission(BigDecimal commission) {
    this.commission = commission;
  }

  public void setInitMarginReq(BigDecimal initMarginReq) {
    this.initMarginReq = initMarginReq;
  }

  public void setMaintMarginReq(BigDecimal maintMarginReq) {
    this.maintMarginReq = maintMarginReq;
  }

  public void setRiskLimit(BigDecimal riskLimit) {
    this.riskLimit = riskLimit;
  }

  public void setLeverage(BigDecimal leverage) {
    this.leverage = leverage;
  }

  public void setCrossMargin(Boolean crossMargin) {
    this.crossMargin = crossMargin;
  }

  public void setDeleveragePercentile(BigDecimal deleveragePercentile) {
    this.deleveragePercentile = deleveragePercentile;
  }

  public void setRebalancedPnl(BigDecimal rebalancedPnl) {
    this.rebalancedPnl = rebalancedPnl;
  }

  public void setPrevRealisedPnl(BigDecimal prevRealisedPnl) {
    this.prevRealisedPnl = prevRealisedPnl;
  }

  public void setPrevUnrealisedPnl(BigDecimal prevUnrealisedPnl) {
    this.prevUnrealisedPnl = prevUnrealisedPnl;
  }

  public void setPrevClosePrice(BigDecimal prevClosePrice) {
    this.prevClosePrice = prevClosePrice;
  }

  public void setOpeningTimestamp(String openingTimestamp) {
    this.openingTimestamp = openingTimestamp;
  }

  public void setOpeningQty(BigDecimal openingQty) {
    this.openingQty = openingQty;
  }

  public void setOpeningCost(BigDecimal openingCost) {
    this.openingCost = openingCost;
  }

  public void setOpeningComm(BigDecimal openingComm) {
    this.openingComm = openingComm;
  }

  public void setOpenOrderBuyQty(BigDecimal openOrderBuyQty) {
    this.openOrderBuyQty = openOrderBuyQty;
  }

  public void setOpenOrderBuyCost(BigDecimal openOrderBuyCost) {
    this.openOrderBuyCost = openOrderBuyCost;
  }

  public void setOpenOrderBuyPremium(BigDecimal openOrderBuyPremium) {
    this.openOrderBuyPremium = openOrderBuyPremium;
  }

  public void setOpenOrderSellQty(BigDecimal openOrderSellQty) {
    this.openOrderSellQty = openOrderSellQty;
  }

  public void setOpenOrderSellCost(BigDecimal openOrderSellCost) {
    this.openOrderSellCost = openOrderSellCost;
  }

  public void setOpenOrderSellPremium(BigDecimal openOrderSellPremium) {
    this.openOrderSellPremium = openOrderSellPremium;
  }

  public void setExecBuyQty(BigDecimal execBuyQty) {
    this.execBuyQty = execBuyQty;
  }

  public void setExecBuyCost(BigDecimal execBuyCost) {
    this.execBuyCost = execBuyCost;
  }

  public void setExecSellQty(BigDecimal execSellQty) {
    this.execSellQty = execSellQty;
  }

  public void setExecSellCost(BigDecimal execSellCost) {
    this.execSellCost = execSellCost;
  }

  public void setExecQty(BigDecimal execQty) {
    this.execQty = execQty;
  }

  public void setExecCost(BigDecimal execCost) {
    this.execCost = execCost;
  }

  public void setExecComm(BigDecimal execComm) {
    this.execComm = execComm;
  }

  public void setCurrentTimestamp(String currentTimestamp) {
    this.currentTimestamp = currentTimestamp;
  }

  public void setCurrentQty(BigDecimal currentQty) {
    this.currentQty = currentQty;
  }

  public void setCurrentCost(BigDecimal currentCost) {
    this.currentCost = currentCost;
  }

  public void setCurrentComm(BigDecimal currentComm) {
    this.currentComm = currentComm;
  }

  public void setRealisedCost(BigDecimal realisedCost) {
    this.realisedCost = realisedCost;
  }

  public void setUnrealisedCost(BigDecimal unrealisedCost) {
    this.unrealisedCost = unrealisedCost;
  }

  public void setGrossOpenCost(BigDecimal grossOpenCost) {
    this.grossOpenCost = grossOpenCost;
  }

  public void setGrossOpenPremium(BigDecimal grossOpenPremium) {
    this.grossOpenPremium = grossOpenPremium;
  }

  public void setGrossExecCost(BigDecimal grossExecCost) {
    this.grossExecCost = grossExecCost;
  }

  public void setOpen(Boolean open) {
    isOpen = open;
  }

  public void setMarkPrice(BigDecimal markPrice) {
    this.markPrice = markPrice;
  }

  public void setMarkValue(BigDecimal markValue) {
    this.markValue = markValue;
  }

  public void setRiskValue(BigDecimal riskValue) {
    this.riskValue = riskValue;
  }

  public void setHomeNotional(BigDecimal homeNotional) {
    this.homeNotional = homeNotional;
  }

  public void setForeignNotional(BigDecimal foreignNotional) {
    this.foreignNotional = foreignNotional;
  }

  public void setPosState(String posState) {
    this.posState = posState;
  }

  public void setPosCost(BigDecimal posCost) {
    this.posCost = posCost;
  }

  public void setPosCost2(BigDecimal posCost2) {
    this.posCost2 = posCost2;
  }

  public void setPosCross(BigDecimal posCross) {
    this.posCross = posCross;
  }

  public void setPosInit(BigDecimal posInit) {
    this.posInit = posInit;
  }

  public void setPosComm(BigDecimal posComm) {
    this.posComm = posComm;
  }

  public void setPosLoss(BigDecimal posLoss) {
    this.posLoss = posLoss;
  }

  public void setPosMargin(BigDecimal posMargin) {
    this.posMargin = posMargin;
  }

  public void setPosMaint(BigDecimal posMaint) {
    this.posMaint = posMaint;
  }

  public void setPosAllowance(BigDecimal posAllowance) {
    this.posAllowance = posAllowance;
  }

  public void setTaxableMargin(BigDecimal taxableMargin) {
    this.taxableMargin = taxableMargin;
  }

  public void setInitMargin(BigDecimal initMargin) {
    this.initMargin = initMargin;
  }

  public void setMaintMargin(BigDecimal maintMargin) {
    this.maintMargin = maintMargin;
  }

  public void setSessionMargin(BigDecimal sessionMargin) {
    this.sessionMargin = sessionMargin;
  }

  public void setTargetExcessMargin(BigDecimal targetExcessMargin) {
    this.targetExcessMargin = targetExcessMargin;
  }

  public void setVarMargin(BigDecimal varMargin) {
    this.varMargin = varMargin;
  }

  public void setRealisedGrossPnl(BigDecimal realisedGrossPnl) {
    this.realisedGrossPnl = realisedGrossPnl;
  }

  public void setRealisedTax(BigDecimal realisedTax) {
    this.realisedTax = realisedTax;
  }

  public void setRealisedPnl(BigDecimal realisedPnl) {
    this.realisedPnl = realisedPnl;
  }

  public void setUnrealisedGrossPnl(BigDecimal unrealisedGrossPnl) {
    this.unrealisedGrossPnl = unrealisedGrossPnl;
  }

  public void setLongBankrupt(BigDecimal longBankrupt) {
    this.longBankrupt = longBankrupt;
  }

  public void setShortBankrupt(BigDecimal shortBankrupt) {
    this.shortBankrupt = shortBankrupt;
  }

  public void setTaxBase(BigDecimal taxBase) {
    this.taxBase = taxBase;
  }

  public void setIndicativeTaxRate(BigDecimal indicativeTaxRate) {
    this.indicativeTaxRate = indicativeTaxRate;
  }

  public void setIndicativeTax(BigDecimal indicativeTax) {
    this.indicativeTax = indicativeTax;
  }

  public void setUnrealisedTax(BigDecimal unrealisedTax) {
    this.unrealisedTax = unrealisedTax;
  }

  public void setUnrealisedPnl(BigDecimal unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
  }

  public void setUnrealisedPnlPcnt(BigDecimal unrealisedPnlPcnt) {
    this.unrealisedPnlPcnt = unrealisedPnlPcnt;
  }

  public void setUnrealisedRoePcnt(BigDecimal unrealisedRoePcnt) {
    this.unrealisedRoePcnt = unrealisedRoePcnt;
  }

  public void setSimpleQty(BigDecimal simpleQty) {
    this.simpleQty = simpleQty;
  }

  public void setSimpleCost(BigDecimal simpleCost) {
    this.simpleCost = simpleCost;
  }

  public void setSimpleValue(BigDecimal simpleValue) {
    this.simpleValue = simpleValue;
  }

  public void setSimplePnl(BigDecimal simplePnl) {
    this.simplePnl = simplePnl;
  }

  public void setSimplePnlPcnt(BigDecimal simplePnlPcnt) {
    this.simplePnlPcnt = simplePnlPcnt;
  }

  public void setAvgCostPrice(BigDecimal avgCostPrice) {
    this.avgCostPrice = avgCostPrice;
  }

  public void setAvgEntryPrice(BigDecimal avgEntryPrice) {
    this.avgEntryPrice = avgEntryPrice;
  }

  public void setBreakEvenPrice(BigDecimal breakEvenPrice) {
    this.breakEvenPrice = breakEvenPrice;
  }

  public void setMarginCallPrice(BigDecimal marginCallPrice) {
    this.marginCallPrice = marginCallPrice;
  }

  public void setLiquidationPrice(BigDecimal liquidationPrice) {
    this.liquidationPrice = liquidationPrice;
  }

  public void setBankruptPrice(BigDecimal bankruptPrice) {
    this.bankruptPrice = bankruptPrice;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public void setLastPrice(BigDecimal lastPrice) {
    this.lastPrice = lastPrice;
  }

  public void setLastValue(BigDecimal lastValue) {
    this.lastValue = lastValue;
  }

  public void setAccount(Integer account) {

    this.account = account;
  }
}
