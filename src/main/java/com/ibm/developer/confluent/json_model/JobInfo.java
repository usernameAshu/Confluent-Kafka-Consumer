package com.ibm.developer.confluent.json_model;

public class JobInfo {

	private String status;
	private String state;
	private String region;
	private Long correlationId;
	private String handlingCode;
	private String assignmentStartDate;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Long getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(Long correlationId) {
		this.correlationId = correlationId;
	}

	public String getHandlingCode() {
		return handlingCode;
	}

	public void setHandlingCode(String handlingCode) {
		this.handlingCode = handlingCode;
	}

	public String getAssignmentStartDate() {
		return assignmentStartDate;
	}

	public void setAssignmentStartDate(String assignmentStartDate) {
		this.assignmentStartDate = assignmentStartDate;
	}
}
