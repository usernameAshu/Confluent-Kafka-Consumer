package com.ibm.developer.confluent.json_model;

public class CustomerInfo {
	private String customerName;
	private String PrimaryContactName;
	private String PrimaryContactNumber;
	private String SecondaryContactName;
	private String SecondaryContactNumber;
	// Added for US210315
	private String customerEmail;
	private String accountNumber;
	private String maintenancePlan;
	private String serviceClass;
	// Added for US102359 in Sprint 220
	private String banBTN;
	private String circuitId;
	private String customerType;
	private String marketUnit;
	private String billingSystem;
	// Added for US205606
	private String purchaseOrderNumber;

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the primaryContactName
	 */
	public String getPrimaryContactName() {
		return PrimaryContactName;
	}

	/**
	 * @param primaryContactName the primaryContactName to set
	 */
	public void setPrimaryContactName(String primaryContactName) {
		PrimaryContactName = primaryContactName;
	}

	/**
	 * @return the primaryContactNumber
	 */
	public String getPrimaryContactNumber() {
		return PrimaryContactNumber;
	}

	/**
	 * @param primaryContactNumber the primaryContactNumber to set
	 */
	public void setPrimaryContactNumber(String primaryContactNumber) {
		PrimaryContactNumber = primaryContactNumber;
	}

	/**
	 * @return the secondaryContactName
	 */
	public String getSecondaryContactName() {
		return SecondaryContactName;
	}

	/**
	 * @param secondaryContactName the secondaryContactName to set
	 */

	public void setSecondaryContactName(String secondaryContactName) {
		SecondaryContactName = secondaryContactName;
	}

	/**
	 * @return the secondaryContactNumber
	 */
	public String getSecondaryContactNumber() {
		return SecondaryContactNumber;
	}

	/**
	 * @param secondaryContactNumber the secondaryContactNumber to set
	 */
	public void setSecondaryContactNumber(String secondaryContactNumber) {
		SecondaryContactNumber = secondaryContactNumber;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the maintenancePlan
	 */
	public String getMaintenancePlan() {
		return maintenancePlan;
	}

	/**
	 * @param maintenancePlan the maintenancePlan to set
	 */
	public void setMaintenancePlan(String maintenancePlan) {
		this.maintenancePlan = maintenancePlan;
	}

	/**
	 * @return the serviceclass
	 */
	public String getServiceClass() {
		return serviceClass;
	}

	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	public String getBanBTN() {
		return banBTN;
	}

	public void setBanBTN(String banBTN) {
		this.banBTN = banBTN;
	}

	public String getCircuitId() {
		return circuitId;
	}

	public void setCircuitId(String circuitId) {
		this.circuitId = circuitId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getMarketUnit() {
		return marketUnit;
	}

	public void setMarketUnit(String marketUnit) {
		this.marketUnit = marketUnit;
	}

	public String getBillingSystem() {
		return billingSystem;
	}

	public void setBillingSystem(String billingSystem) {
		this.billingSystem = billingSystem;
	}

	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

}
