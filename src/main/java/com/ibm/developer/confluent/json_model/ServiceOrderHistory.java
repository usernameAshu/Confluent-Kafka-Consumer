package com.ibm.developer.confluent.json_model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ServiceOrderHistory {
	private String correlationId;
	private String soNumber;
	private String soDate;
	private String wirecenter;
	private String tnckid;
	private List<Remark> remark;
	private List<Feature> feature;

	/**
	 * @return the correlationId
	 */
	public String getCorrelationId() {
		return correlationId;
	}

	/**
	 * @param correlationId
	 *            the correlationId to set
	 */
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	/**
	 * @return the soNumber
	 */
	public String getSoNumber() {
		return soNumber;
	}

	/**
	 * @param soNumber
	 *            the soNumber to set
	 */
	public void setSoNumber(String soNumber) {
		this.soNumber = soNumber;
	}

	/**
	 * @return the soDate
	 */
	public String getSoDate() {
		return soDate;
	}

	/**
	 * @param soDate
	 *            the soDate to set
	 */
	public void setSoDate(String soDate) {
		this.soDate = soDate;
	}

	/**
	 * @return the wirecenter
	 */
	public String getWirecenter() {
		return wirecenter;
	}

	/**
	 * @param wirecenter
	 *            the wirecenter to set
	 */
	public void setWirecenter(String wirecenter) {
		this.wirecenter = wirecenter;
	}

	/**
	 * @return the remark
	 */
	public List<Remark> getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(List<Remark> remark) {
		this.remark = remark;
	}

	/**
	 * @return the feature
	 */
	public List<Feature> getFeature() {
		return feature;
	}

	/**
	 * @param feature
	 *            the feature to set
	 */
	public void setFeature(List<Feature> feature) {
		this.feature = feature;
	}

	public String getTnckid() {
		return tnckid;
	}

	public void setTnckid(String tnckid) {
		this.tnckid = tnckid;
	}
}
