package com.ibm.developer.confluent.json_model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class DispatchHistory {
	private Long correlationId;
	private String techId;
	private String techName;
	private String taskType;
	private String taskTypeDescription;
	private String hostTrkNmbr;
	private String callID;
	private String taskStatus;
	private String statusComments;
	private String problem;
	private String condition;
	private String reason;
	private String resolution;
	private String dispositionCode;
	private String dispositionCodeStr;
	private String causeCode;
	private String causeCodeStr;
	private String statusUpdateDate;
	private String customerName;
	private String primaryContactName;
	private String secondaryContactName;
	private String primaryContactNumber;
	private String secondaryContactNumber;
	private String service_type;
	private String product_type;
	private String trouble_type;
	private String reasonCode;
	private String circuitId;
	private String missed_commitment;
	private String group_id;
	private String groupParentFlag;
	public Long getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(Long correlationId) {
		this.correlationId = correlationId;
	}
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskTypeDescription() {
		return taskTypeDescription;
	}
	public void setTaskTypeDescription(String taskTypeDescription) {
		this.taskTypeDescription = taskTypeDescription;
	}
	public String getHostTrkNmbr() {
		return hostTrkNmbr;
	}
	public void setHostTrkNmbr(String hostTrkNmbr) {
		this.hostTrkNmbr = hostTrkNmbr;
	}
	public String getCallID() {
		return callID;
	}
	public void setCallID(String callID) {
		this.callID = callID;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getStatusComments() {
		return statusComments;
	}
	public void setStatusComments(String statusComments) {
		this.statusComments = statusComments;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getDispositionCode() {
		return dispositionCode;
	}
	public void setDispositionCode(String dispositionCode) {
		this.dispositionCode = dispositionCode;
	}
	public String getDispositionCodeStr() {
		return dispositionCodeStr;
	}
	public void setDispositionCodeStr(String dispositionCodeStr) {
		this.dispositionCodeStr = dispositionCodeStr;
	}
	public String getCauseCode() {
		return causeCode;
	}
	public void setCauseCode(String causeCode) {
		this.causeCode = causeCode;
	}
	public String getCauseCodeStr() {
		return causeCodeStr;
	}
	public void setCauseCodeStr(String causeCodeStr) {
		this.causeCodeStr = causeCodeStr;
	}
	public String getStatusUpdateDate() {
		return statusUpdateDate;
	}
	public void setStatusUpdateDate(String statusUpdateDate) {
		this.statusUpdateDate = statusUpdateDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPrimaryContactName() {
		return primaryContactName;
	}
	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}
	public String getSecondaryContactName() {
		return secondaryContactName;
	}
	public void setSecondaryContactName(String secondaryContactName) {
		this.secondaryContactName = secondaryContactName;
	}
	public String getPrimaryContactNumber() {
		return primaryContactNumber;
	}
	public void setPrimaryContactNumber(String primaryContactNumber) {
		this.primaryContactNumber = primaryContactNumber;
	}
	public String getSecondaryContactNumber() {
		return secondaryContactNumber;
	}
	public void setSecondaryContactNumber(String secondaryContactNumber) {
		this.secondaryContactNumber = secondaryContactNumber;
	}
	public String getService_type() {
		return service_type;
	}
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public String getTrouble_type() {
		return trouble_type;
	}
	public void setTrouble_type(String trouble_type) {
		this.trouble_type = trouble_type;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getCircuitId() {
		return circuitId;
	}
	public void setCircuitId(String circuitId) {
		this.circuitId = circuitId;
	}
	public String getMissed_commitment() {
		return missed_commitment;
	}
	public void setMissed_commitment(String missed_commitment) {
		this.missed_commitment = missed_commitment;
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public String getGroupParentFlag() {
		return groupParentFlag;
	}
	public void setGroupParentFlag(String groupParentFlag) {
		this.groupParentFlag = groupParentFlag;
	}
	
	@Override
	public String toString() {
		return "DispatchHistory [correlationId=" + correlationId + ", techId=" + techId + ", techName=" + techName
				+ ", taskType=" + taskType + ", taskTypeDescription=" + taskTypeDescription + ", hostTrkNmbr="
				+ hostTrkNmbr + ", callID=" + callID + ", taskStatus=" + taskStatus + ", statusComments="
				+ statusComments + ", problem=" + problem + ", condition=" + condition + ", reason=" + reason
				+ ", resolution=" + resolution + ", dispositionCode=" + dispositionCode + ", dispositionCodeStr="
				+ dispositionCodeStr + ", causeCode=" + causeCode + ", causeCodeStr=" + causeCodeStr
				+ ", statusUpdateDate=" + statusUpdateDate + ", customerName=" + customerName + ", primaryContactName="
				+ primaryContactName + ", secondaryContactName=" + secondaryContactName + ", primaryContactNumber="
				+ primaryContactNumber + ", secondaryContactNumber=" + secondaryContactNumber + ", service_type="
				+ service_type + ", product_type=" + product_type + ", trouble_type=" + trouble_type + ", reasonCode="
				+ reasonCode + ", circuitId=" + circuitId + ", missed_commitment=" + missed_commitment + ", group_id="
				+ group_id + ", groupParentFlag=" + groupParentFlag + ", updateDate="+ "]";
	}
}
