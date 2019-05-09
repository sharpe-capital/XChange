package org.knowm.xchange.dto.trade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.knowm.xchange.dto.Order;

/**
 * DTO representing filled orders
 *
 * <p>Filled orders are orders that you have placed with the exchange and have been matched to a
 * counter-party.
 */
public final class FilledOrders implements Serializable {

  private final List<LimitOrder> filledOrders;
  private final List<? extends Order> hiddenOrders;

  /**
   * Constructor
   *
   * @param filledOrders The list of filled orders
   */
  public FilledOrders(List<LimitOrder> filledOrders) {
    this.filledOrders = filledOrders;
    this.hiddenOrders = Collections.emptyList();
  }

  /**
   * Constructor
   *
   * @param filledOrders The list of filled orders
   * @param hiddenOrders The list of orders which are active but hidden from the order book.
   */
  public FilledOrders(List<LimitOrder> filledOrders, List<Order> hiddenOrders) {
    this.filledOrders = filledOrders;
    this.hiddenOrders = hiddenOrders;
  }

  /** @return LimitOrders which are shown on the order book. */
  public List<LimitOrder> getFilledOrders() {
    return filledOrders;
  }

  /** @return All Filled Orders */
  public List<Order> getAllFilledOrders() {
    List<Order> allFilledOrders = new ArrayList<>(filledOrders);
    allFilledOrders.addAll(hiddenOrders);
    return allFilledOrders;
  }

  /** @return Orders which are not shown on the order book, such as untriggered stop orders. */
  public List<? extends Order> getHiddenOrders() {
    return hiddenOrders;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    addToToString(sb, getFilledOrders(), "Filled orders");
    addToToString(sb, getHiddenOrders(), "Hidden orders");
    return sb.toString();
  }

  private void addToToString(StringBuilder sb, List<? extends Order> orders, String description) {
    sb.append(description);
    sb.append(": ");
    if (orders.isEmpty()) {
      sb.append("None\n");
    } else {
      sb.append("\n");
      for (Order order : orders) {
        sb.append("  [order=");
        sb.append(order.toString());
        sb.append("]\n");
      }
    }
  }
}
