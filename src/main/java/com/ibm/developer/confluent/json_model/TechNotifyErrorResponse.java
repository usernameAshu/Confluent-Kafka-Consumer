package com.ibm.developer.confluent.json_model;

public class TechNotifyErrorResponse {
	private boolean isErrored = false;
	private String errorStep;
	private String errorReason;
	private int errorCode;
	
	public boolean isErrored() {
		return isErrored;
	}
	public void setErrored(boolean isErrored) {
		this.isErrored = isErrored;
	}
	public String getErrorStep() {
		return errorStep;
	}
	public void setErrorStep(String errorStep) {
		this.errorStep = errorStep;
	}
	public String getErrorReason() {
		return errorReason;
	}
	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	@Override
	public String toString() {
		return "TechNotifyErrorResponse [isErrored=" + isErrored + ", errorStep=" + errorStep + ", errorReason="
				+ errorReason + ", errorCode=" + errorCode + "]";
	}

}
