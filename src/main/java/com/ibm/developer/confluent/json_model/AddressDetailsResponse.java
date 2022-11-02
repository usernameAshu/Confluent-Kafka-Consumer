package com.ibm.developer.confluent.json_model;

import java.math.BigDecimal;

public class AddressDetailsResponse {
	private String baseAddressIndicator;
	private BigDecimal addressDropId;
	private String addressId;
	private String houseNumber;
	private String streetName;
	private String community;
	private String stateCode;
	private String zipCode;
	private String serviceWireExists;
	private String serviceWireType;
	private String serviceWirePlcmtEnv;
	private String placementMethod;
	private String circuitIdentifier;
	private String dropSize;
	private String dropGuage;
	private BigDecimal dropCount;
	private String estmFootage;

	public BigDecimal getAddressDropId() {
		return addressDropId;
	}

	public void setAddressDropId(BigDecimal addressDropId) {
		this.addressDropId = addressDropId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getCircuitIdentifier() {
		return circuitIdentifier;
	}

	public void setCircuitIdentifier(String circuitIdentifier) {
		this.circuitIdentifier = circuitIdentifier;
	}

	public String getDropSize() {
		return dropSize;
	}

	public void setDropSize(String dropSize) {
		this.dropSize = dropSize;
	}

	public String getDropGuage() {
		return dropGuage;
	}

	public void setDropGuage(String dropGuage) {
		this.dropGuage = dropGuage;
	}

	public BigDecimal getDropCount() {
		return dropCount;
	}

	public void setDropCount(BigDecimal dropCount) {
		this.dropCount = dropCount;
	}

	public String getBaseAddressIndicator() {
		return baseAddressIndicator;
	}

	public void setBaseAddressIndicator(String baseAddressIndicator) {
		this.baseAddressIndicator = baseAddressIndicator;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getServiceWireExists() {
		return serviceWireExists;
	}

	public void setServiceWireExists(String serviceWireExists) {
		this.serviceWireExists = serviceWireExists;
	}

	public String getServiceWireType() {
		return serviceWireType;
	}

	public void setServiceWireType(String serviceWireType) {
		this.serviceWireType = serviceWireType;
	}

	public String getServiceWirePlcmtEnv() {
		return serviceWirePlcmtEnv;
	}

	public void setServiceWirePlcmtEnv(String serviceWirePlcmtEnv) {
		this.serviceWirePlcmtEnv = serviceWirePlcmtEnv;
	}

	public String getPlacementMethod() {
		return placementMethod;
	}

	public void setPlacementMethod(String placementMethod) {
		this.placementMethod = placementMethod;
	}

	public String getEstmFootage() {
		return estmFootage;
	}

	public void setEstmFootage(String estmFootage) {
		this.estmFootage = estmFootage;
	}
}
