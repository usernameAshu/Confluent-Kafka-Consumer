package com.ibm.developer.confluent.json_model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MultipleRelatedOrderId {
private String mirrorDispatchId;
private String agrregationId;
private String relatedOrderId;
/**
 * @return the mirrorDispatchId
 */
public String getMirrorDispatchId() {
	return mirrorDispatchId;
}
/**
 * @param mirrorDispatchId the mirrorDispatchId to set
 */
public void setMirrorDispatchId(String mirrorDispatchId) {
	this.mirrorDispatchId = mirrorDispatchId;
}
/**
 * @return the agrregationId
 */
public String getAgrregationId() {
	return agrregationId;
}
/**
 * @param agrregationId the agrregationId to set
 */
public void setAgrregationId(String agrregationId) {
	this.agrregationId = agrregationId;
}
/**
 * @return the relatedOrderId
 */
public String getRelatedOrderId() {
	return relatedOrderId;
}
/**
 * @param relatedOrderId the relatedOrderId to set
 */
public void setRelatedOrderId(String relatedOrderId) {
	this.relatedOrderId = relatedOrderId;
}
}