package com.ibm.developer.confluent.json_model;

import java.sql.Timestamp;

public class AutoCompleteInfo {
	
	private String dispositionCode;
	private String causeCode;
	private Timestamp statusUpdateTimestamp;
	private String techId;
	
	private boolean autoCompleteFlag;
	
	private boolean cancelledFlag;
	
	private String upstreamStatus;
	private String statusComments;

	public String getDispositionCode() {
		return dispositionCode;
	}
	public void setDispositionCode(String dispositionCode) {
		this.dispositionCode = dispositionCode;
	}
	public String getCauseCode() {
		return causeCode;
	}
	public void setCauseCode(String causeCode) {
		this.causeCode = causeCode;
	}
	public boolean isAutoCompleteFlag() {
		return autoCompleteFlag;
	}
	public void setAutoCompleteFlag(boolean autoCompleteFlag) {
		this.autoCompleteFlag = autoCompleteFlag;
	}
	public boolean isCancelledFlag() {
		return cancelledFlag;
	}
	public void setCancelledFlag(boolean cancelledFlag) {
		this.cancelledFlag = cancelledFlag;
	}
	public String getUpstreamStatus() {
		return upstreamStatus;
	}
	public void setUpstreamStatus(String upstreamStatus) {
		this.upstreamStatus = upstreamStatus;
	}
	public Timestamp getStatusUpdateTimestamp() {
		return statusUpdateTimestamp;
	}
	public void setStatusUpdateTimestamp(Timestamp statusUpdateTimestamp) {
		this.statusUpdateTimestamp = statusUpdateTimestamp;
	}
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		this.techId = techId;
	}
	public String getStatusComments() {
		return statusComments;
	}
	public void setStatusComments(String statusComments) {
		this.statusComments = statusComments;
	}
	
}
