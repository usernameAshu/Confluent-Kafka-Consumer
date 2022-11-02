package com.ibm.developer.confluent.json_model;

public class Feature {
	private String featureCode;
	private long featureQuantity;
	private String featureAction;
	private String description;

	public String getFeatureCode() {
		return featureCode;
	}

	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	public long getFeatureQuantity() {
		return featureQuantity;
	}

	public void setFeatureQuantity(long featureQuantity) {
		this.featureQuantity = featureQuantity;
	}

	public String getFeatureAction() {
		return featureAction;
	}

	public void setFeatureAction(String featureAction) {
		this.featureAction = featureAction;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
