package com.ibm.developer.confluent.json_model;

public class Payload {
	
	private JobDetails jobDetails;

	public JobDetails getJobDetails() {
		return jobDetails;
	}

	public void setJobDetails(JobDetails jobDetails) {
		this.jobDetails = jobDetails;
	}

	@Override
	public String toString() {
		return "Payload [jobDetails=" + jobDetails + "]";
	}

}
