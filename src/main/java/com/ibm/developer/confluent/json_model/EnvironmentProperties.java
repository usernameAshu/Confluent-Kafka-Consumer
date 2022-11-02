package com.ibm.developer.confluent.json_model;

public class EnvironmentProperties {
	private boolean appendRequestXml;
	private boolean storeErrorResponse;
	private String schedulerDelay;
	private String dvarnotReadyDispatchUrl;
	private String notReadyschedulerDelay;
	private boolean validateRequestXml;
	private String fudgeTime;
	private String upstreamDeleteDelay;
	private String armorTicketCreationUrl;
	private String dgwStatusBackUrl;
	private String assignedJobEventUrl;
	private String customerNotificationUrl;
	private String armorVersionUrl;
	private String updateAvgDurationUrl;
	private String qfmUpdateUrl;


	public String getSchedulerDelay() {
		return schedulerDelay;
	}

	public void setSchedulerDelay(String schedulerDelay) {
		this.schedulerDelay = schedulerDelay;
	}

	public boolean isStoreErrorResponse() {
		return storeErrorResponse;
	}

	public void setStoreErrorResponse(boolean storeErrorResponse) {
		this.storeErrorResponse = storeErrorResponse;
	}

	public boolean isAppendRequestXml() {
		return appendRequestXml;
	}

	public void setAppendRequestXml(boolean appendRequestXml) {
		this.appendRequestXml = appendRequestXml;
	}
	
	public String getDvarnotReadyDispatchUrl() {
		return dvarnotReadyDispatchUrl;
	}

	public void setDvarnotReadyDispatchUrl(String dvarnotReadyDispatchUrl) {
		this.dvarnotReadyDispatchUrl = dvarnotReadyDispatchUrl;
	}
	public String getNotReadyschedulerDelay() {
		return notReadyschedulerDelay;
	}

	public void setNotReadyschedulerDelay(String notReadyschedulerDelay) {
		this.notReadyschedulerDelay = notReadyschedulerDelay;
	}
	
	public boolean isValidateRequestXml() {
		return validateRequestXml;
	}

	public void setValidateRequestXml(boolean validateRequestXml) {
		this.validateRequestXml = validateRequestXml;
	}

	public String getFudgeTime() {
		return fudgeTime;
	}

	public void setFudgeTime(String fudgeTime) {
		this.fudgeTime = fudgeTime;
	}
	
	public String getUpstreamDeleteDelay() {
		return upstreamDeleteDelay;
	}

	public void setUpstreamDeleteDelay(String upstreamDeleteDelay) {
		this.upstreamDeleteDelay = upstreamDeleteDelay;
	}

	public String getArmorTicketCreationUrl() {
		return armorTicketCreationUrl;
	}

	public void setArmorTicketCreationUrl(String armorTicketCreationUrl) {
		this.armorTicketCreationUrl = armorTicketCreationUrl;
	}

	public String getDgwStatusBackUrl() {
		return dgwStatusBackUrl;
	}

	public void setDgwStatusBackUrl(String dgwStatusBackUrl) {
		this.dgwStatusBackUrl = dgwStatusBackUrl;
	}

	public String getAssignedJobEventUrl() {
		return assignedJobEventUrl;
	}

	public void setAssignedJobEventUrl(String assignedJobEventUrl) {
		this.assignedJobEventUrl = assignedJobEventUrl;
	}

	public String toString() {
		return String.format("\n\nENVIRONMENT PROPERTIES\n\nappendRequestXml:%s\nstoreErrorResponse:%s\nschedulerDelay:%s\ndvarnotReadyDispatchUrl:%s\nnotReadyschedulerDelay:%s\nupstreamDeleteDelay:%s\narmorTicketCreationUrl:%s\ndgwStatusBackUrl:%s\nassignedJobEventUrl:%s\n", 
				appendRequestXml, storeErrorResponse, schedulerDelay,dvarnotReadyDispatchUrl,notReadyschedulerDelay,upstreamDeleteDelay,armorTicketCreationUrl,dgwStatusBackUrl,assignedJobEventUrl);
	}
	public String getCustomerNotificationUrl() {
		return customerNotificationUrl;
	}

	public void setCustomerNotificationUrl(String customerNotificationUrl) {
		this.customerNotificationUrl = customerNotificationUrl;
	}

	public String getArmorVersionUrl() {
		return armorVersionUrl;
	}

	public void setArmorVersionUrl(String armorVersionUrl) {
		this.armorVersionUrl = armorVersionUrl;
	}

	public String getUpdateAvgDurationUrl() {
		return updateAvgDurationUrl;
	}

	public void setUpdateAvgDurationUrl(String updateAvgDurationUrl) {
		this.updateAvgDurationUrl = updateAvgDurationUrl;
	}
	
	public String getQfmUpdateUrl() {
		return qfmUpdateUrl;
	}

	public void setQfmUpdateUrl(String qfmUpdateUrl) {
		this.qfmUpdateUrl = qfmUpdateUrl;
	}
}