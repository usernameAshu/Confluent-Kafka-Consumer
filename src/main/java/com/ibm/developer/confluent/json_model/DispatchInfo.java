package com.ibm.developer.confluent.json_model;

public class DispatchInfo {
	private String dispatchType;
	private Long duration;
	private Long dispatchCorrelationId;
	private String estimatedTimeOfArrival;

	public String getDispatchType() {
		return dispatchType;
	}

	public void setDispatchType(String dispatchType) {
		this.dispatchType = dispatchType;
	}
	public Long getDuration() {
		return duration;
	}
	
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Long getDispatchCorrelationId() {
		return dispatchCorrelationId;
	}

	public void setDispatchCorrelationId(Long dispatchCorrelationId) {
		this.dispatchCorrelationId = dispatchCorrelationId;
	}
	public String getEstimatedTimeOfArrival() {
		return estimatedTimeOfArrival;
	}

	public void setEstimatedTimeOfArrival(String estimatedTimeOfArrival) {
		this.estimatedTimeOfArrival = estimatedTimeOfArrival;
	}

}
