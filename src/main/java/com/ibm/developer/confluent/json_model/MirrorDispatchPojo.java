package com.ibm.developer.confluent.json_model;

public class MirrorDispatchPojo {
	private String correlationId;
	private String callId;
	private String marketUnit;
	private String wireCenter;
	private String orderType;
	private String productType;
	private String reasonCode;
	private String taskStatus;
	private String techId;
	private String subReasonCode;
	private String billingSystem;
	private String statusComments;
	private String customerType;
	private String customerName;
	private String custName;
	private String contactNumber;
	private String altTrkNumber;
	private String groomingFlag;
	private String originatingSystem;
	private String dispatcherCallId;
	private String altCorrelationId;
	
	public String getCallId() {
		return callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	public String getMarketUnit() {
		return marketUnit;
	}

	public void setMarketUnit(String marketUnit) {
		this.marketUnit = marketUnit;
	}

	public String getWireCenter() {
		return wireCenter;
	}

	public void setWireCenter(String wireCenter) {
		this.wireCenter = wireCenter;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTechId() {
		return techId;
	}

	public void setTechId(String techId) {
		this.techId = techId;
	}

	public String getSubReasonCode() {
		return subReasonCode;
	}

	public void setSubReasonCode(String subReasonCode) {
		this.subReasonCode = subReasonCode;
	}

	public String getBillingSystem() {
		return billingSystem;
	}

	public void setBillingSystem(String billingSystem) {
		this.billingSystem = billingSystem;
	}

	public String getStatusComments() {
		return statusComments;
	}

	public void setStatusComments(String statusComments) {
		this.statusComments = statusComments;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAltTrkNumber() {
		return altTrkNumber;
	}

	public void setAltTrkNumber(String altTrkNumber) {
		this.altTrkNumber = altTrkNumber;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public String getGroomingFlag() {
		return groomingFlag;
	}

	public void setGroomingFlag(String groomingFlag) {
		this.groomingFlag = groomingFlag;
	}

	public String getOriginatingSystem() {
		return originatingSystem;
	}

	public void setOriginatingSystem(String originatingSystem) {
		this.originatingSystem = originatingSystem;
	}

	public String getDispatcherCallId() {
		return dispatcherCallId;
	}

	public void setDispatcherCallId(String dispatcherCallId) {
		this.dispatcherCallId = dispatcherCallId;
	}

	public String getAltCorrelationId() {
		return altCorrelationId;
	}

	public void setAltCorrelationId(String altCorrelationId) {
		this.altCorrelationId = altCorrelationId;
	}

	@Override
	public String toString() {
		return "MirrorDispatchPojo [" + (correlationId != null ? "correlationId=" + correlationId + ", " : "")
				+ (callId != null ? "callId=" + callId + ", " : "")
				+ (marketUnit != null ? "marketUnit=" + marketUnit + ", " : "")
				+ (wireCenter != null ? "wireCenter=" + wireCenter + ", " : "")
				+ (orderType != null ? "orderType=" + orderType + ", " : "")
				+ (productType != null ? "productType=" + productType + ", " : "")
				+ (reasonCode != null ? "reasonCode=" + reasonCode + ", " : "")
				+ (taskStatus != null ? "taskStatus=" + taskStatus + ", " : "")
				+ (techId != null ? "techId=" + techId + ", " : "")
				+ (subReasonCode != null ? "subReasonCode=" + subReasonCode + ", " : "")
				+ (billingSystem != null ? "billingSystem=" + billingSystem + ", " : "")
				+ (statusComments != null ? "statusComments=" + statusComments + ", " : "")
				+ (customerType != null ? "customerType=" + customerType + ", " : "")
				+ (customerName != null ? "customerName=" + customerName + ", " : "")
				+ (custName != null ? "custName=" + custName + ", " : "")
				+ (contactNumber != null ? "contactNumber=" + contactNumber + ", " : "")
				+ (altTrkNumber != null ? "altTrkNumber=" + altTrkNumber : "") + "]";
	}
}
