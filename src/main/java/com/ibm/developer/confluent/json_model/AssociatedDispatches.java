package com.ibm.developer.confluent.json_model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_EMPTY)
public class AssociatedDispatches {
	private CustomerInfo customerInfo;
	private Location location;
	private DispatchInfo dispatchInfo;
	private Appoinment appointment;
	private String techId;
	private String techName;
	private String status;
	private String reasonCode;
	private String statusUpdateTimestamp;
	private String statusComments;
	private String taskType;
	private String taskTypeDescription;
	private String category;
	private String region;
	private String dispatchCallId;
	private String hostTrackingNumber;
	private String alternateTrackingNumber;

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the customerInfo
	 */
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	/**
	 * @param customerInfo
	 *            the customerInfo to set
	 */
	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * @return the dispatchInfo
	 */
	public DispatchInfo getDispatchInfo() {
		return dispatchInfo;
	}

	/**
	 * @param dispatchInfo
	 *            the dispatchInfo to set
	 */
	public void setDispatchInfo(DispatchInfo dispatchInfo) {
		this.dispatchInfo = dispatchInfo;
	}

	/**
	 * @return the appointment
	 */
	public Appoinment getAppointment() {
		return appointment;
	}

	/**
	 * @param appointment
	 *            the appointment to set
	 */
	public void setAppointment(Appoinment appointment) {
		this.appointment = appointment;
	}

	/**
	 * @return the techId
	 */
	public String getTechId() {
		return techId;
	}

	/**
	 * @param techId
	 *            the techId to set
	 */
	public void setTechId(String techId) {
		this.techId = techId;
	}

	/**
	 * @return the techName
	 */
	public String getTechName() {
		return techName;
	}

	/**
	 * @param techName
	 *            the techName to set
	 */
	public void setTechName(String techName) {
		this.techName = techName;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the reasonCode
	 */
	public String getReasonCode() {
		return reasonCode;
	}

	/**
	 * @param reasonCode
	 *            the reasonCode to set
	 */
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	/**
	 * @return the statusUpdateTimestamp
	 */
	public String getStatusUpdateTimestamp() {
		return statusUpdateTimestamp;
	}

	/**
	 * @param statusUpdateTimestamp
	 *            the statusUpdateTimestamp to set
	 */
	public void setStatusUpdateTimestamp(String statusUpdateTimestamp) {
		this.statusUpdateTimestamp = statusUpdateTimestamp;
	}

	/**
	 * @return the statusComments
	 */
	public String getStatusComments() {
		return statusComments;
	}

	/**
	 * @param statusComments
	 *            the statusComments to set
	 */
	public void setStatusComments(String statusComments) {
		this.statusComments = statusComments;
	}

	/**
	 * @return the taskType
	 */
	public String getTaskType() {
		return taskType;
	}

	/**
	 * @param taskType
	 *            the taskType to set
	 */
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	/**
	 * @return the taskTypeDescription
	 */
	public String getTaskTypeDescription() {
		return taskTypeDescription;
	}

	/**
	 * @param taskTypeDescription
	 *            the taskTypeDescription to set
	 */
	public void setTaskTypeDescription(String taskTypeDescription) {
		this.taskTypeDescription = taskTypeDescription;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the dispatchCallId
	 */
	public String getDispatchCallId() {
		return dispatchCallId;
	}

	/**
	 * @param dispatchCallId the dispatchCallId to set
	 */
	public void setDispatchCallId(String dispatchCallId) {
		this.dispatchCallId = dispatchCallId;
	}

	/**
	 * @return the hostTrackingNumber
	 */
	public String getHostTrackingNumber() {
		return hostTrackingNumber;
	}

	/**
	 * @param hostTrackingNumber the hostTrackingNumber to set
	 */
	public void setHostTrackingNumber(String hostTrackingNumber) {
		this.hostTrackingNumber = hostTrackingNumber;
	}

	/**
	 * @return the alternateTrackingNumber
	 */
	public String getAlternateTrackingNumber() {
		return alternateTrackingNumber;
	}

	/**
	 * @param alternateTrackingNumber the alternateTrackingNumber to set
	 */
	public void setAlternateTrackingNumber(String alternateTrackingNumber) {
		this.alternateTrackingNumber = alternateTrackingNumber;
	}

}
