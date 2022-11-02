package com.ibm.developer.confluent.json_model;

public class DispatchJobsVersionResponse {

	private BaseResponse baseResponse;
	private String version;
	private String buildTimeStamp;
	private String builtBy;
	private String buildJdk;
	private String dbConnectivityStatus;

	public BaseResponse getBaseResponse() {
		return baseResponse;
	}

	public void setBaseResponse(BaseResponse baseResponse) {
		this.baseResponse = baseResponse;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getBuildTimeStamp() {
		return buildTimeStamp;
	}

	public void setBuildTimeStamp(String buildTimeStamp) {
		this.buildTimeStamp = buildTimeStamp;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public String getBuildJdk() {
		return buildJdk;
	}

	public void setBuildJdk(String buildJdk) {
		this.buildJdk = buildJdk;
	}

	public String getDbConnectivityStatus() {
		return dbConnectivityStatus;
	}

	public void setDbConnectivityStatus(String dbConnectivityStatus) {
		this.dbConnectivityStatus = dbConnectivityStatus;
	}

}
