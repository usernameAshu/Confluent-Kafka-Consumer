package com.ibm.developer.confluent.json_model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class SoOrder {
	private List<ServiceOrderHistory> orderHistory;

	/**
	 * @return the serviceOrderHistory
	 */
	public List<ServiceOrderHistory> getServiceOrderHistory() {
		return orderHistory;
	}

	/**
	 * @param serviceOrderHistory
	 *            the serviceOrderHistory to set
	 */
	public void setServiceOrderHistory(List<ServiceOrderHistory> orderHistory) {
		this.orderHistory = orderHistory;
	}
}
