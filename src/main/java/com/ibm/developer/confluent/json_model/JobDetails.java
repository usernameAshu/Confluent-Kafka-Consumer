package com.ibm.developer.confluent.json_model;

import java.util.LinkedHashMap;
import java.util.List;

public class JobDetails {
	private Long priority;
	private String status;
	private String reasonCode;
	private String subReasonCode;
	private String openDate;
	private String id;
	private String groupId;
	private String groupParent;
	private String alternateTrackingNumber;
	private String hostTrackingNumber;
	private String businessUnit;
	private DispatchInfo dispatchInfo;
	private Appoinment appointment;
	private List<TaskInfo> taskInfo;
	private CustomerInfo customerInfo;
	private Location location;
	private String productType;
	private String orderType;
	private String installType;
	private List<Repair> repair;
	private List<Feature> feature;
	private List<Remark> remark;
	private String wireCenter;
	private String technology;
	private String downstreamRate;
	private QservQualificationResponse getQualificationResponse;
	private String[] submarkets;
	private String outageId;
	private String switchgateActivationStatus;
	private String relatedOrderId;
	private String taskType;
	private String taskTypeDescription;
	private LinkedHashMap<String, Object> orderRepositoryServiceResponse;
	private MultipleRelatedOrderId relatedOrderIdInfo;
	private List<ServiceOrderHistory> serviceOrderHistory;
	private String projectName;
	private String engineerName;
	private String engineerNumber;
	private String alternateCorrelationId;
	private String techId;
	private String onhold;
	private String statusComments;
	private String reassignCount;
	private String aggregationId;
	private DispatchCompletionInfo dispatchCompletionInfo;
	private List<AssociatedDispatches> associatedDispatches;
	private String rontaId;
	private LmosDetails lmosDetails;
	private WfaDetails wfaDetails;
	private String cktALocn;
	private String cktZLocn;
	private String jepCode;
	private String jepCodeDesc;
	private String custContFlag;
	private String problem;
	private String condition;
	private String reason;
	private String resolution;
	private String missedCommitment;
	private List<DispatchHistory> dispatchHistoryList;
	private String selfAssignFlag;
	private String selfAssignTimestamp;
	private IwmpDetails iwmpDetails;
	private LoopQualDropResponse loopQualDropResponse;
	private TechETAETRDetails techETAETRDetails;
	private String tCompanyCode;
	private String wireCenter8;
	private Boolean outageExclusionId;
	private String ASVal;
	private String isJobOnly;
	private String trunkGroupAccessCd;
	private String cktAction;
	private String originatingCenter;
	private String reportCategory;
	private String serviceAppointmentNumber;
	private String billingSystem;
	private String dispatchSystem;
	private String originatingSystem;
	private String serviceApptId;
	private String workTypeName;
	private String workOrderId;
	private String inJeopardy;
	private String troubleType;
	private String statusUpdateTimestamp;
	private List<HourWorked> hoursWorked;
	private List<JobDetails> jobsStatusHistory;
	private List<FacilityCableDetails> facilityCableDetails;
	private List<FacilityDetails> facilityDetails;
	private String PercentCompleted;

//	Drools decision table specific fields
	private String action;
	private String actionComments;

	/*
	 * private TroubleTicketsList troubleTicketsList; private SearchResourceResponse
	 * facilitiesResponse;
	 * 
	 * private ProductInfoResponse productInfoResponse; private
	 * EquipmentSummaryResponse equipmentSummaryResponse;
	 * 
	 * private QFFacilities fiberFacilities; private ResponseT
	 * wordDocInquiryResponse; private OrderChangesResponse orderChangesResponse;
	 * 
	 * private WFA wfa; private IMG img; private FoTs fomsOrderImages;
	 */

	public String getWorkTypeName() {
		return workTypeName;
	}

	public void setWorkTypeName(String workTypeName) {
		this.workTypeName = workTypeName;
	}

	public String getServiceApptId() {
		return serviceApptId;
	}

	public void setServiceApptId(String serviceApptId) {
		this.serviceApptId = serviceApptId;
	}

	public String getWorkOrderId() {
		return workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}

	public String getInJeopardy() {
		return inJeopardy;
	}

	public void setInJeopardy(String inJeopardy) {
		this.inJeopardy = inJeopardy;
	}

	public String getServiceAppointmentNumber() {
		return serviceAppointmentNumber;
	}

	public void setServiceAppointmentNumber(String serviceAppointmentNumber) {
		this.serviceAppointmentNumber = serviceAppointmentNumber;
	}

	public String getBillingSystem() {
		return billingSystem;
	}

	public void setBillingSystem(String billingSystem) {
		this.billingSystem = billingSystem;
	}

	public String getDispatchSystem() {
		return dispatchSystem;
	}

	public void setDispatchSystem(String dispatchSystem) {
		this.dispatchSystem = dispatchSystem;
	}

	public String getOriginatingSystem() {
		return originatingSystem;
	}

	public void setOriginatingSystem(String originatingSystem) {
		this.originatingSystem = originatingSystem;
	}

	public Boolean getOutageExclusionId() {
		return outageExclusionId;
	}

	public void setOutageExclusionId(Boolean outageExclusionId) {
		this.outageExclusionId = outageExclusionId;
	}

	public String getASVal() {
		return ASVal;
	}

	public void setASVal(String ASVal) {
		this.ASVal = ASVal;
	}

	/**
	 * @return the dispatchCompletionInfo
	 */
	public DispatchCompletionInfo getDispatchCompletionInfo() {
		return dispatchCompletionInfo;
	}

	/**
	 * @param dispatchCompletionInfo the dispatchCompletionInfo to set
	 */
	public void setDispatchCompletionInfo(DispatchCompletionInfo dispatchCompletionInfo) {
		this.dispatchCompletionInfo = dispatchCompletionInfo;
	}

	/**
	 * @return the serviceOrderHistory
	 */
	public List<ServiceOrderHistory> getServiceOrderHistory() {
		return serviceOrderHistory;
	}

	/**
	 * @param serviceOrderHistory the serviceOrderHistory to set
	 */
	public void setServiceOrderHistory(List<ServiceOrderHistory> serviceOrderHistory) {
		this.serviceOrderHistory = serviceOrderHistory;
	}

	/**
	 * @return the orderRepositoryServiceResponse
	 */
	public LinkedHashMap<String, Object> getOrderRepositoryServiceResponse() {
		return orderRepositoryServiceResponse;
	}

	/**
	 * @param orderRepositoryServiceResponse the orderRepositoryServiceResponse to
	 *                                       set
	 */
	public void setOrderRepositoryServiceResponse(LinkedHashMap<String, Object> orderRepositoryServiceResponse) {
		this.orderRepositoryServiceResponse = orderRepositoryServiceResponse;
	}

	public TechETAETRDetails getTechETAETRDetails() {
		return techETAETRDetails;
	}

	public void setTechETAETRDetails(TechETAETRDetails techETAETRDetails) {
		this.techETAETRDetails = techETAETRDetails;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	// @ApiModelProperty(value = "Dispatch info", dataType = "dispatchInfo")
	public DispatchInfo getDispatchInfo() {
		return dispatchInfo;
	}

	public void setDispatchInfo(DispatchInfo dispatchInfo) {
		this.dispatchInfo = dispatchInfo;
	}

	// @ApiModelProperty(value = "Customer info", dataType = "CustomerInfo")
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

//	@ApiModelProperty(value = "Appoinment info", dataType = "appoinmentInfo")
	public Appoinment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appoinment appointment) {
		this.appointment = appointment;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	// @ApiModelProperty(value = "Job location info", dataType = "jobLocation")
	public Location getLocation() {
		return location;
	}

	public LoopQualDropResponse getLoopQualDropResponse() {
		return loopQualDropResponse;
	}

	public void setLoopQualDropResponse(LoopQualDropResponse loopQualDropResponse) {
		this.loopQualDropResponse = loopQualDropResponse;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getWireCenter() {
		return wireCenter;
	}

	public void setWireCenter(String wireCenter) {
		this.wireCenter = wireCenter;
	}

	public String getTechnology() {
		return technology;
	}

	public String getProductType() {
		return productType;
	}

	public String getInstallType() {
		return installType;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public void setInstallType(String installType) {
		this.installType = installType;
	}

	public String getDownstreamRate() {
		return downstreamRate;
	}

	public void setDownstreamRate(String downstreamRate) {
		this.downstreamRate = downstreamRate;
	}

	// @ApiModelProperty(value = "Feature info", dataType = "List")
	public List<Feature> getFeature() {
		return feature;
	}

	public void setFeature(List<Feature> feature) {
		this.feature = feature;
	}

	// @ApiModelProperty(value = "Task info", dataType = "List")
	public List<TaskInfo> getTaskInfo() {
		return taskInfo;
	}

	public void setTaskInfo(List<TaskInfo> taskInfo) {
		this.taskInfo = taskInfo;
	}

	public String getOrderType() {
		return orderType;
	}

	// @ApiModelProperty(value = "Repair", dataType = "List")
	public List<Repair> getRepair() {
		return repair;
	}

	public void setRepair(List<Repair> repair) {
		this.repair = repair;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	// @ApiModelProperty(value = "Remark info", dataType = "List")
	public List<Remark> getRemark() {
		return remark;
	}

	public void setRemark(List<Remark> remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAlternateTrackingNumber() {
		return alternateTrackingNumber;
	}

	public void setAlternateTrackingNumber(String alternateTrackingNumber) {
		this.alternateTrackingNumber = alternateTrackingNumber;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupParent() {
		return groupParent;
	}

	public void setGroupParent(String groupParent) {
		this.groupParent = groupParent;
	}

	public Long getPriority() {
		return priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getHostTrackingNumber() {
		return hostTrackingNumber;
	}

	public void setHostTrackingNumber(String hostTrackingNumber) {
		this.hostTrackingNumber = hostTrackingNumber;
	}

	// @ApiModelProperty(value = "Submarket details", dataType = "Array")
	public String[] getSubmarkets() {
		return submarkets;
	}

	public void setSubmarkets(String[] submarkets) {
		this.submarkets = submarkets;
	}

	public String getOutageId() {
		return outageId;
	}

	public void setOutageId(String outageId) {
		this.outageId = outageId;
	}

	/**
	 * @return the switchgateActivationStatus
	 */
	public String getSwitchgateActivationStatus() {
		return switchgateActivationStatus;
	}

	/**
	 * @param switchgateActivationStatus the switchgateActivationStatus to set
	 */
	public void setSwitchgateActivationStatus(String switchgateActivationStatus) {
		this.switchgateActivationStatus = switchgateActivationStatus;
	}

	public String getRelatedOrderId() {
		return relatedOrderId;
	}

	public void setRelatedOrderId(String relatedOrderId) {
		this.relatedOrderId = relatedOrderId;
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

	public MultipleRelatedOrderId getRelatedOrderIdInfo() {
		return relatedOrderIdInfo;
	}

	public void setRelatedOrderIdInfo(MultipleRelatedOrderId relatedOrderIdInfo) {
		this.relatedOrderIdInfo = relatedOrderIdInfo;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getEngineerName() {
		return engineerName;
	}

	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}

	public String getEngineerNumber() {
		return engineerNumber;
	}

	public void setEngineerNumber(String engineerNumber) {
		this.engineerNumber = engineerNumber;
	}

	public String getAlternateCorrelationId() {
		return alternateCorrelationId;
	}

	public void setAlternateCorrelationId(String alternateCorrelationId) {
		this.alternateCorrelationId = alternateCorrelationId;
	}

	public String getSubReasonCode() {
		return subReasonCode;
	}

	public void setSubReasonCode(String subReasonCode) {
		this.subReasonCode = subReasonCode;
	}

	public String getRontaId() {
		return rontaId;
	}

	public void setRontaId(String rontaId) {
		this.rontaId = rontaId;
	}

	/**
	 * @return the techId
	 */
	public String getTechId() {
		return techId;
	}

	/**
	 * @param techId the techId to set
	 */
	public void setTechId(String techId) {
		this.techId = techId;
	}

	/**
	 * @return the onhold
	 */
	public String getOnhold() {
		return onhold;
	}

	/**
	 * @param onhold the onhold to set
	 */
	public void setOnhold(String onhold) {
		this.onhold = onhold;
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

	/**
	 * @return the reassignCount
	 */
	public String getReassignCount() {
		return reassignCount;
	}

	/**
	 * @param reassignCount the reassignCount to set
	 */
	public void setReassignCount(String reassignCount) {
		this.reassignCount = reassignCount;
	}

	/**
	 * @return the getQualificationResponse
	 */
	public QservQualificationResponse getGetQualificationResponse() {
		return getQualificationResponse;
	}

	/**
	 * @param getQualificationResponse the getQualificationResponse to set
	 */
	public void setGetQualificationResponse(QservQualificationResponse getQualificationResponse) {
		this.getQualificationResponse = getQualificationResponse;
	}

	public String getAggregationId() {
		return aggregationId;
	}

	public void setAggregationId(String aggregationId) {
		this.aggregationId = aggregationId;
	}

	/**
	 * @return the associatedDispatches
	 */
	public List<AssociatedDispatches> getAssociatedDispatches() {
		return associatedDispatches;
	}

	/**
	 * @param associatedDispatches the associatedDispatches to set
	 */
	public void setAssociatedDispatches(List<AssociatedDispatches> associatedDispatches) {
		this.associatedDispatches = associatedDispatches;
	}

	// @ApiModelProperty(value = "Wfa Details", dataType = "WfaDetails")
	public WfaDetails getWfaDetails() {
		return wfaDetails;
	}

	public void setWfaDetails(WfaDetails wfaDetails) {
		this.wfaDetails = wfaDetails;
	}

	// @ApiModelProperty(value = "Lmos Details", dataType = "LmosDetails")
	public LmosDetails getLmosDetails() {
		return lmosDetails;
	}

	public void setLmosDetails(LmosDetails lmosDetails) {
		this.lmosDetails = lmosDetails;
	}

	public String getCktALocn() {
		return cktALocn;
	}

	public void setCktALocn(String cktALocn) {
		this.cktALocn = cktALocn;
	}

	public String getCktZLocn() {
		return cktZLocn;
	}

	public void setCktZLocn(String cktZLocn) {
		this.cktZLocn = cktZLocn;
	}

	public String getJepCode() {
		return jepCode;
	}

	public void setJepCode(String jepCode) {
		this.jepCode = jepCode;
	}

	public String getJepCodeDesc() {
		return jepCodeDesc;
	}

	public void setJepCodeDesc(String jepCodeDesc) {
		this.jepCodeDesc = jepCodeDesc;
	}

	public String getCustContFlag() {
		return custContFlag;
	}

	public void setCustContFlag(String custContFlag) {
		this.custContFlag = custContFlag;
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

	public String getMissedCommitment() {
		return missedCommitment;
	}

	public void setMissedCommitment(String missedCommitment) {
		this.missedCommitment = missedCommitment;
	}

	public List<DispatchHistory> getDispatchHistoryList() {
		return dispatchHistoryList;
	}

	public void setDispatchHistoryList(List<DispatchHistory> dispatchHistoryList) {
		this.dispatchHistoryList = dispatchHistoryList;
	}

	public String getSelfAssignTimestamp() {
		return selfAssignTimestamp;
	}

	public void setSelfAssignTimestamp(String selfAssignTimestamp) {
		this.selfAssignTimestamp = selfAssignTimestamp;
	}

	public String getSelfAssignFlag() {
		return selfAssignFlag;
	}

	public void setSelfAssignFlag(String selfAssignFlag) {
		this.selfAssignFlag = selfAssignFlag;
	}

	public IwmpDetails getIwmpDetails() {
		return iwmpDetails;
	}

	public void setIwmpDetails(IwmpDetails iwmpDetails) {
		this.iwmpDetails = iwmpDetails;
	}

	public String gettCompanyCode() {
		return tCompanyCode;
	}

	public void settCompanyCode(String tCompanyCode) {
		this.tCompanyCode = tCompanyCode;
	}

	public String getWireCenter8() {
		return wireCenter8;
	}

	public void setWireCenter8(String wireCenter8) {
		this.wireCenter8 = wireCenter8;
	}

	public String getIsJobOnly() {
		return isJobOnly;
	}

	public void setIsJobOnly(String isJobOnly) {
		this.isJobOnly = isJobOnly;
	}

	public String getTrunkGroupAccessCd() {
		return trunkGroupAccessCd;
	}

	public void setTrunkGroupAccessCd(String trunkGroupAccessCd) {
		this.trunkGroupAccessCd = trunkGroupAccessCd;
	}

	public String getCktAction() {
		return cktAction;
	}

	public void setCktAction(String cktAction) {
		this.cktAction = cktAction;
	}

	public String getOriginatingCenter() {
		return originatingCenter;
	}

	public void setOriginatingCenter(String originatingCenter) {
		this.originatingCenter = originatingCenter;
	}

	public String getReportCategory() {
		return reportCategory;
	}

	public void setReportCategory(String reportCategory) {
		this.reportCategory = reportCategory;
	}

	public List<HourWorked> getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(List<HourWorked> hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String getTroubleType() {
		return troubleType;
	}

	public void setTroubleType(String troubleType) {
		this.troubleType = troubleType;
	}

	public List<JobDetails> getJobsStatusHistory() {
		return jobsStatusHistory;
	}

	public void setJobsStatusHistory(List<JobDetails> jobsStatusHistory) {
		this.jobsStatusHistory = jobsStatusHistory;
	}

	public List<FacilityCableDetails> getFacilityCableDetails() {
		return facilityCableDetails;
	}

	public void setFacilityCableDetails(List<FacilityCableDetails> facilityCableDetails) {
		this.facilityCableDetails = facilityCableDetails;
	}

	public List<FacilityDetails> getFacilityDetails() {
		return facilityDetails;
	}

	public void setFacilityDetails(List<FacilityDetails> facilityDetails) {
		this.facilityDetails = facilityDetails;
	}

	public String getStatusUpdateTimestamp() {
		return statusUpdateTimestamp;
	}

	public void setStatusUpdateTimestamp(String statusUpdateTimestamp) {
		this.statusUpdateTimestamp = statusUpdateTimestamp;
	}

	public String getPercentCompleted() {
		return PercentCompleted;
	}

	public void setPercentCompleted(String percentCompleted) {
		PercentCompleted = percentCompleted;
	}

}
