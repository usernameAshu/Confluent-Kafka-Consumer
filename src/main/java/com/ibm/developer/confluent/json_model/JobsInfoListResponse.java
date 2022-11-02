package com.ibm.developer.confluent.json_model;

import java.util.List;

public class JobsInfoListResponse {

	private BaseResponse baseResponse;
	private List<JobInfo> jobsInfoList;

	public BaseResponse getBaseResponse() {
		return baseResponse;
	}

	public void setBaseResponse(BaseResponse baseResponse) {
		this.baseResponse = baseResponse;
	}

	public List<JobInfo> getJobsInfoList() {
		return jobsInfoList;
	}

	public void setJobsInfoList(List<JobInfo> jobsList) {
		this.jobsInfoList = jobsList;
	}
}
