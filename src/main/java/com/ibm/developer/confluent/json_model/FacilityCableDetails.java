package com.ibm.developer.confluent.json_model;

public class FacilityCableDetails {

	private String category;
	private String accessPoint;
	private String cable;
	private String pair;
	private String createDateStr;
	private String bindingPost;
	private String tiePair;
	private String wireIndicator;
	private String outBindingPost;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAccessPoint() {
		return accessPoint;
	}

	public void setAccessPoint(String accessPoint) {
		this.accessPoint = accessPoint;
	}

	public String getCable() {
		return cable;
	}

	public void setCable(String cable) {
		this.cable = cable;
	}

	public String getPair() {
		return pair;
	}

	public void setPair(String pair) {
		this.pair = pair;
	}

	public String getCreateDateStr() {
		return createDateStr;
	}

	public void setCreateDateStr(String createDateStr) {
		this.createDateStr = createDateStr;
	}

	public String getBindingPost() {
		return bindingPost;
	}

	public void setBindingPost(String bindingPost) {
		this.bindingPost = bindingPost;
	}

	public String getTiePair() {
		return tiePair;
	}

	public void setTiePair(String tiePair) {
		this.tiePair = tiePair;
	}

	public String getWireIndicator() {
		return wireIndicator;
	}

	public void setWireIndicator(String wireIndicator) {
		this.wireIndicator = wireIndicator;
	}

	public String getOutBindingPost() {
		return outBindingPost;
	}

	public void setOutBindingPost(String outBindingPost) {
		this.outBindingPost = outBindingPost;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FacilityCableDetails [category=");
		builder.append(category);
		builder.append(", accessPoint=");
		builder.append(accessPoint);
		builder.append(", cable=");
		builder.append(cable);
		builder.append(", pair=");
		builder.append(pair);
		builder.append(", createDateStr=");
		builder.append(createDateStr);
		builder.append(", bindingPost=");
		builder.append(bindingPost);
		builder.append(", tiePair=");
		builder.append(tiePair);
		builder.append(", wireIndicator=");
		builder.append(wireIndicator);
		builder.append(", outBindingPost=");
		builder.append(outBindingPost);
		builder.append("]");
		return builder.toString();
	}

}
