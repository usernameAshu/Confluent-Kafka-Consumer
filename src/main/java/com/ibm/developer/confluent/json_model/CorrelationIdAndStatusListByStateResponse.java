package com.ibm.developer.confluent.json_model;

import java.util.List;

public class CorrelationIdAndStatusListByStateResponse {

	private BaseResponse baseResponse;
	private List<JobList> jobList;

	public BaseResponse getBaseResponse() {
		return baseResponse;
	}

	public void setBaseResponse(BaseResponse baseResponse) {
		this.baseResponse = baseResponse;
	}

	public List<JobList> getJobList() {
		return jobList;
	}

	public void setJobList(List<JobList> jobList) {
		this.jobList = jobList;
	}

}
