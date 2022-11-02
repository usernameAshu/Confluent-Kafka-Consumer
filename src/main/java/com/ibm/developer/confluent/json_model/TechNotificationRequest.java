package com.ibm.developer.confluent.json_model;

public class TechNotificationRequest {
	private String dispatcherCallId;
	private String correlationId;
	private String techId;
	private String priority;
	private String action;
	private String priorityDesc;
	private String addressLine1;
	
	public String getDispatcherCallId() {
		return dispatcherCallId;
	}
	public void setDispatcherCallId(String dispatcherCallId) {
		this.dispatcherCallId = dispatcherCallId;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		this.techId = techId;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getPriorityDesc() {
		return priorityDesc;
	}
	public void setPriorityDesc(String priorityDesc) {
		this.priorityDesc = priorityDesc;
	}

	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	@Override
	public String toString() {
		return "TechNotificationRequest [dispatcherCallId=" + dispatcherCallId + ", correlationId=" + correlationId
				+ ", techId=" + techId + ", priority=" + priority + ", action=" + action + ", priorityDesc="
				+ priorityDesc + ", addressLine1=" + addressLine1 + "]";
	}
	
}
