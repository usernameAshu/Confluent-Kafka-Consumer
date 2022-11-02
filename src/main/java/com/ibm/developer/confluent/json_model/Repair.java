package com.ibm.developer.confluent.json_model;

import java.util.List;

public class Repair {
	private String troubleType;
	private List<UrlList> UrlList;

	public List<UrlList> getUrlList() {
		return UrlList;
	}

	public void setUrlList(List<UrlList> urlList) {
		UrlList = urlList;
	}

	public String getTroubleType() {
		return troubleType;
	}

	public void setTroubleType(String troubleType) {
		this.troubleType = troubleType;
	}

}
