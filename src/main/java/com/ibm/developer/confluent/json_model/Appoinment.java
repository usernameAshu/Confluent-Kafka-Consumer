package com.ibm.developer.confluent.json_model;

public class Appoinment {

	private String appointmentStartDateTime;
	private String appointmentEndDateTime;
	private String dueDate;
	private String accessAfterDateTime;
	private String accessBeforeDateTime;
	private String techName;
	private String statusComments;
	private String appointmentOrderId;
	private String inquiryReservationNumber;
	private String appointmentEarlyStartTime;

	public String getAppointmentStartDateTime() {
		return appointmentStartDateTime;
	}

	public void setAppointmentStartDateTime(String appointmentStartDateTime) {
		this.appointmentStartDateTime = appointmentStartDateTime;
	}

	public String getAppointmentEndDateTime() {
		return appointmentEndDateTime;
	}

	public void setAppointmentEndDateTime(String appointmentEndDateTime) {
		this.appointmentEndDateTime = appointmentEndDateTime;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getAccessAfterDateTime() {
		return accessAfterDateTime;
	}

	public void setAccessAfterDateTime(String accessAfterDateTime) {
		this.accessAfterDateTime = accessAfterDateTime;
	}

	public String getAccessBeforeDateTime() {
		return accessBeforeDateTime;
	}

	public void setAccessBeforeDateTime(String accessBeforeDateTime) {
		this.accessBeforeDateTime = accessBeforeDateTime;
	}

	/**
	 * @return the techName
	 */
	public String getTechName() {
		return techName;
	}

	/**
	 * @param techName the techName to set
	 */
	public void setTechName(String techName) {
		this.techName = techName;
	}

	/**
	 * @return the statusComments
	 */
	public String getStatusComments() {
		return statusComments;
	}

	/**
	 * @param statusComments the statusComments to set
	 */
	public void setStatusComments(String statusComments) {
		this.statusComments = statusComments;
	}

	public String getAppointmentOrderId() {
		return appointmentOrderId;
	}

	public void setAppointmentOrderId(String appointmentOrderId) {
		this.appointmentOrderId = appointmentOrderId;
	}

	public String getInquiryReservationNumber() {
		return inquiryReservationNumber;
	}

	public void setInquiryReservationNumber(String inquiryReservationNumber) {
		this.inquiryReservationNumber = inquiryReservationNumber;
	}

	public String getAppointmentEarlyStartTime() {
		return appointmentEarlyStartTime;
	}

	public void setAppointmentEarlyStartTime(String appointmentEarlyStartTime) {
		this.appointmentEarlyStartTime = appointmentEarlyStartTime;
	}

}