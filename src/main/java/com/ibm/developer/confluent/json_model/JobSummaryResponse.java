package com.ibm.developer.confluent.json_model;

import java.util.List;

public class JobSummaryResponse {

	private BaseResponse baseResponse;
	private String technicianId;
	private List<JobDetails> listJobSummary;

	public BaseResponse getBaseResponse() {
		return baseResponse;
	}

	public void setBaseResponse(BaseResponse baseResponse) {
		this.baseResponse = baseResponse;
	}

	public String getTechnicianId() {
		return technicianId;
	}

	public void setTechnicianId(String technicianId) {
		this.technicianId = technicianId;
	}

	public List<JobDetails> getListJobSummary() {
		return listJobSummary;
	}

	public void setListJobSummary(List<JobDetails> listDispatchSummary) {
		this.listJobSummary = listDispatchSummary;
	}

}
