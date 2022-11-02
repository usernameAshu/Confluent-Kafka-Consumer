package com.ibm.developer.confluent.json_model;

import java.util.ArrayList;
import java.util.List;

public class ClientResponseModel {

	String message;
	private List<String> correlationIdList = new ArrayList<String>();

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getCorrelationIdList() {
		return correlationIdList;
	}

	public void setCorrelationIdList(List<String> correlationIdList) {
		this.correlationIdList = correlationIdList;
	}

}
