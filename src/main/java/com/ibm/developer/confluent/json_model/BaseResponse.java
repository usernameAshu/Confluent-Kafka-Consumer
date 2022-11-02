package com.ibm.developer.confluent.json_model;

public class BaseResponse {
	private String message;
	private ResponseStatusValues responseStatus;
	private int reasonCode;

	public enum ResponseStatusValues {
		Success, Failure, Informational, Warning, Retry, Expired, Error
	};

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ResponseStatusValues getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatusValues responseStatus) {
		this.responseStatus = responseStatus;
	}

	public int getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(int reasonCode) {
		this.reasonCode = reasonCode;
	}

}
