package com.ibm.developer.confluent.json_model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_EMPTY)
public class DsHistory {
	private List<DispatchHistory> dispatchHistory;

	public List<DispatchHistory> getDispatchHistoryList() {
		return dispatchHistory;
	}

	public void setDispatchHistoryList(List<DispatchHistory> dispatchHistory) {
		this.dispatchHistory = dispatchHistory;
	}
}
