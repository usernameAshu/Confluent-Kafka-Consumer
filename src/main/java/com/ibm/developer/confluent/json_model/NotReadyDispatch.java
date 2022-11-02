package com.ibm.developer.confluent.json_model;

import java.sql.Timestamp;

public class NotReadyDispatch {
	
	//private boolean notReadyCreateFlag;
	private long upstreamStatusPublishId;
	private String taskStatus;
	private String reasonCode;
	private String altCorrelationId;
	private long correlationId;
	private String callId;
	private String dispatcherCallId;
	private Timestamp statusUpdateTimestamp;
	private String statusComments;
	private String techId;
	private Timestamp jobCompletionTimestamp;
	private String hostTrkNumber;
	private String dispositionCode;
	private String causeCode;
	private Timestamp assignmentStart;
	private String callingSystem;
	private String originatingSystem;
	private String statusBackSystem;
	private String transactionId;
	

	/*
	 * public boolean isNotReadyCreateFlag() { return notReadyCreateFlag; }
	 * 
	 * public void setNotReadyCreateFlag(boolean notReadyCreateFlag) {
	 * this.notReadyCreateFlag = notReadyCreateFlag; }
	 */

	public long getUpstreamStatusPublishId() {
		return upstreamStatusPublishId;
	}

	public void setUpstreamStatusPublishId(long upstreamStatusPublishId) {
		this.upstreamStatusPublishId = upstreamStatusPublishId;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getAltCorrelationId() {
		return altCorrelationId;
	}

	public void setAltCorrelationId(String altCorrelationId) {
		this.altCorrelationId = altCorrelationId;
	}

	public long getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(long correlationId) {
		this.correlationId = correlationId;
	}

	public String getCallId() {
		return callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	public String getDispatcherCallId() {
		return dispatcherCallId;
	}

	public void setDispatcherCallId(String dispatcherCallId) {
		this.dispatcherCallId = dispatcherCallId;
	}

	public Timestamp getStatusUpdateTimestamp() {
		return statusUpdateTimestamp;
	}

	public void setStatusUpdateTimestamp(Timestamp statusUpdateTimestamp) {
		this.statusUpdateTimestamp = statusUpdateTimestamp;
	}

	public String getStatusComments() {
		return statusComments;
	}

	public void setStatusComments(String statusComments) {
		this.statusComments = statusComments;
	}

	public String getTechId() {
		return techId;
	}

	public void setTechId(String techId) {
		this.techId = techId;
	}

	public Timestamp getJobCompletionTimestamp() {
		return jobCompletionTimestamp;
	}

	public void setJobCompletionTimestamp(Timestamp jobCompletionTimestamp) {
		this.jobCompletionTimestamp = jobCompletionTimestamp;
	}

	public String getHostTrkNumber() {
		return hostTrkNumber;
	}

	public void setHostTrkNumber(String hostTrkNumber) {
		this.hostTrkNumber = hostTrkNumber;
	}

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

	public Timestamp getAssignmentStart() {
		return assignmentStart;
	}

	public void setAssignmentStart(Timestamp assignmentStart) {
		this.assignmentStart = assignmentStart;
	}

	public String getCallingSystem() {
		return callingSystem;
	}

	public void setCallingSystem(String callingSystem) {
		this.callingSystem = callingSystem;
	}

	public String getOriginatingSystem() {
		return originatingSystem;
	}

	public void setOriginatingSystem(String originatingSystem) {
		this.originatingSystem = originatingSystem;
	}

	public String getStatusBackSystem() {
		return statusBackSystem;
	}

	public void setStatusBackSystem(String statusBackSystem) {
		this.statusBackSystem = statusBackSystem;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
}
