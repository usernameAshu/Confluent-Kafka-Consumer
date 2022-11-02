package com.ibm.developer.confluent.json_model;

public class DgwJobDetailsResponse {
	private BaseResponse baseResponse;
	private JobDetails jobDetails;

	public JobDetails getJobDetails() {
		return jobDetails;
	}

	public void setJobDetails(JobDetails jobDetails) {
		this.jobDetails = jobDetails;
	}

	public BaseResponse getBaseResponse() {
		return baseResponse;
	}

	public void setBaseResponse(BaseResponse baseResponse) {
		this.baseResponse = baseResponse;
	}
}
