package org.knowm.xchange.bitmex.dto.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.knowm.xchange.bitmex.AbstractHttpResponseAware;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "account",
  "currency",
  "riskLimit",
  "prevState",
  "state",
  "action",
  "amount",
  "pendingCredit",
  "pendingDebit",
  "confirmedDebit",
  "prevRealisedPnl",
  "prevUnrealisedPnl",
  "grossComm",
  "grossOpenCost",
  "grossOpenPremium",
  "grossExecCost",
  "grossMarkValue",
  "riskValue",
  "taxableMargin",
  "initMargin",
  "maintMargin",
  "sessionMargin",
  "targetExcessMargin",
  "varMargin",
  "realisedPnl",
  "unrealisedPnl",
  "indicativeTax",
  "unrealisedProfit",
  "syntheticMargin",
  "walletBalance",
  "marginBalance",
  "marginBalancePcnt",
  "marginLeverage",
  "marginUsedPcnt",
  "excessMargin",
  "excessMarginPcnt",
  "availableMargin",
  "withdrawableMargin",
  "timestamp",
  "grossLastValue",
  "commission"
})
public final class BitmexMarginAccount extends AbstractHttpResponseAware {

  @JsonProperty("account")
  public Integer account;

  @JsonProperty("currency")
  public String currency;

  @JsonProperty("riskLimit")
  public BigDecimal riskLimit;

  @JsonProperty("prevState")
  public String prevState;

  @JsonProperty("state")
  public String state;

  @JsonProperty("action")
  public String action;

  @JsonProperty("amount")
  public BigDecimal amount;

  @JsonProperty("pendingCredit")
  public BigDecimal pendingCredit;

  @JsonProperty("pendingDebit")
  public BigDecimal pendingDebit;

  @JsonProperty("confirmedDebit")
  public BigDecimal confirmedDebit;

  @JsonProperty("prevRealisedPnl")
  public BigDecimal prevRealisedPnl;

  @JsonProperty("prevUnrealisedPnl")
  public BigDecimal prevUnrealisedPnl;

  @JsonProperty("grossComm")
  public BigDecimal grossComm;

  @JsonProperty("grossOpenCost")
  public BigDecimal grossOpenCost;

  @JsonProperty("grossOpenPremium")
  public BigDecimal grossOpenPremium;

  @JsonProperty("grossExecCost")
  public BigDecimal grossExecCost;

  @JsonProperty("grossMarkValue")
  public BigDecimal grossMarkValue;

  @JsonProperty("riskValue")
  public BigDecimal riskValue;

  @JsonProperty("taxableMargin")
  public BigDecimal taxableMargin;

  @JsonProperty("initMargin")
  public BigDecimal initMargin;

  @JsonProperty("maintMargin")
  public BigDecimal maintMargin;

  @JsonProperty("sessionMargin")
  public BigDecimal sessionMargin;

  @JsonProperty("targetExcessMargin")
  public BigDecimal targetExcessMargin;

  @JsonProperty("varMargin")
  public BigDecimal varMargin;

  @JsonProperty("realisedPnl")
  public BigDecimal realisedPnl;

  @JsonProperty("unrealisedPnl")
  public BigDecimal unrealisedPnl;

  @JsonProperty("indicativeTax")
  public BigDecimal indicativeTax;

  @JsonProperty("unrealisedProfit")
  public BigDecimal unrealisedProfit;

  @JsonProperty("syntheticMargin")
  public BigDecimal syntheticMargin;

  @JsonProperty("walletBalance")
  public BigDecimal walletBalance;

  @JsonProperty("marginBalance")
  public BigDecimal marginBalance;

  @JsonProperty("marginBalancePcnt")
  public BigDecimal marginBalancePcnt;

  @JsonProperty("marginLeverage")
  public BigDecimal marginLeverage;

  @JsonProperty("marginUsedPcnt")
  public BigDecimal marginUsedPcnt;

  @JsonProperty("excessMargin")
  public BigDecimal excessMargin;

  @JsonProperty("excessMarginPcnt")
  public BigDecimal excessMarginPcnt;

  @JsonProperty("availableMargin")
  public BigDecimal availableMargin;

  @JsonProperty("withdrawableMargin")
  public BigDecimal withdrawableMargin;

  @JsonProperty("timestamp")
  public String timestamp;

  @JsonProperty("grossLastValue")
  public BigDecimal grossLastValue;

  @JsonProperty("commission")
  public BigDecimal commission;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<>();

  public Integer getAccount() {
    return account;
  }

  public String getCurrency() {
    return currency;
  }

  public BigDecimal getRiskLimit() {
    return riskLimit;
  }

  public String getPrevState() {
    return prevState;
  }

  public String getState() {
    return state;
  }

  public String getAction() {
    return action;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public BigDecimal getPendingCredit() {
    return pendingCredit;
  }

  public BigDecimal getPendingDebit() {
    return pendingDebit;
  }

  public BigDecimal getConfirmedDebit() {
    return confirmedDebit;
  }

  public BigDecimal getPrevRealisedPnl() {
    return prevRealisedPnl;
  }

  public BigDecimal getPrevUnrealisedPnl() {
    return prevUnrealisedPnl;
  }

  public BigDecimal getGrossComm() {
    return grossComm;
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

  public BigDecimal getGrossMarkValue() {
    return grossMarkValue;
  }

  public BigDecimal getRiskValue() {
    return riskValue;
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

  public BigDecimal getRealisedPnl() {
    return realisedPnl;
  }

  public BigDecimal getUnrealisedPnl() {
    return unrealisedPnl;
  }

  public BigDecimal getIndicativeTax() {
    return indicativeTax;
  }

  public BigDecimal getUnrealisedProfit() {
    return unrealisedProfit;
  }

  public BigDecimal getSyntheticMargin() {
    return syntheticMargin;
  }

  public BigDecimal getWalletBalance() {
    return walletBalance;
  }

  public BigDecimal getMarginBalance() {
    return marginBalance;
  }

  public BigDecimal getMarginBalancePcnt() {
    return marginBalancePcnt;
  }

  public BigDecimal getMarginLeverage() {
    return marginLeverage;
  }

  public BigDecimal getMarginUsedPcnt() {
    return marginUsedPcnt;
  }

  public BigDecimal getExcessMargin() {
    return excessMargin;
  }

  public BigDecimal getExcessMarginPcnt() {
    return excessMarginPcnt;
  }

  public BigDecimal getAvailableMargin() {
    return availableMargin;
  }

  public BigDecimal getWithdrawableMargin() {
    return withdrawableMargin;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public BigDecimal getGrossLastValue() {
    return grossLastValue;
  }

  public BigDecimal getCommission() {
    return commission;
  }

  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAccount(Integer account) {
    this.account = account;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public void setRiskLimit(BigDecimal riskLimit) {
    this.riskLimit = riskLimit;
  }

  public void setPrevState(String prevState) {
    this.prevState = prevState;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public void setPendingCredit(BigDecimal pendingCredit) {
    this.pendingCredit = pendingCredit;
  }

  public void setPendingDebit(BigDecimal pendingDebit) {
    this.pendingDebit = pendingDebit;
  }

  public void setConfirmedDebit(BigDecimal confirmedDebit) {
    this.confirmedDebit = confirmedDebit;
  }

  public void setPrevRealisedPnl(BigDecimal prevRealisedPnl) {
    this.prevRealisedPnl = prevRealisedPnl;
  }

  public void setPrevUnrealisedPnl(BigDecimal prevUnrealisedPnl) {
    this.prevUnrealisedPnl = prevUnrealisedPnl;
  }

  public void setGrossComm(BigDecimal grossComm) {
    this.grossComm = grossComm;
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

  public void setGrossMarkValue(BigDecimal grossMarkValue) {
    this.grossMarkValue = grossMarkValue;
  }

  public void setRiskValue(BigDecimal riskValue) {
    this.riskValue = riskValue;
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

  public void setRealisedPnl(BigDecimal realisedPnl) {
    this.realisedPnl = realisedPnl;
  }

  public void setUnrealisedPnl(BigDecimal unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
  }

  public void setIndicativeTax(BigDecimal indicativeTax) {
    this.indicativeTax = indicativeTax;
  }

  public void setUnrealisedProfit(BigDecimal unrealisedProfit) {
    this.unrealisedProfit = unrealisedProfit;
  }

  public void setSyntheticMargin(BigDecimal syntheticMargin) {
    this.syntheticMargin = syntheticMargin;
  }

  public void setWalletBalance(BigDecimal walletBalance) {
    this.walletBalance = walletBalance;
  }

  public void setMarginBalance(BigDecimal marginBalance) {
    this.marginBalance = marginBalance;
  }

  public void setMarginBalancePcnt(BigDecimal marginBalancePcnt) {
    this.marginBalancePcnt = marginBalancePcnt;
  }

  public void setMarginLeverage(BigDecimal marginLeverage) {
    this.marginLeverage = marginLeverage;
  }

  public void setMarginUsedPcnt(BigDecimal marginUsedPcnt) {
    this.marginUsedPcnt = marginUsedPcnt;
  }

  public void setExcessMargin(BigDecimal excessMargin) {
    this.excessMargin = excessMargin;
  }

  public void setExcessMarginPcnt(BigDecimal excessMarginPcnt) {
    this.excessMarginPcnt = excessMarginPcnt;
  }

  public void setAvailableMargin(BigDecimal availableMargin) {
    this.availableMargin = availableMargin;
  }

  public void setWithdrawableMargin(BigDecimal withdrawableMargin) {
    this.withdrawableMargin = withdrawableMargin;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public void setGrossLastValue(BigDecimal grossLastValue) {
    this.grossLastValue = grossLastValue;
  }

  public void setCommission(BigDecimal commission) {
    this.commission = commission;
  }
}
