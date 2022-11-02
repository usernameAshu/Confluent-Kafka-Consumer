package com.ibm.developer.confluent.json_model;

public class FacilityDetails {

	private String accessPointLocation;
	private String aid;
	private String aidDeviceName;
	private String dslAid;
	private String dslAidDeviceName;
	private String lineEquipment;
	private String cotDeviceName;
	private String clli;
	private String tnCktId;
	private String npanxx;
	private String originatingEquipment;
	private String otherNumMeetPoints;
	
	
	public String getAccessPointLocation() {
		return accessPointLocation;
	}
	public void setAccessPointLocation(String accessPointLocation) {
		this.accessPointLocation = accessPointLocation;
	}
	
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	
	public String getAidDeviceName() {
		return aidDeviceName;
	}
	public void setAidDeviceName(String aidDeviceName) {
		this.aidDeviceName = aidDeviceName;
	}
	
	public String getDslAid() {
		return dslAid;
	}
	public void setDslAid(String dslAid) {
		this.dslAid = dslAid;
	}
	
	public String getDslAidDeviceName() {
		return dslAidDeviceName;
	}
	public void setDslAidDeviceName(String dslAidDeviceName) {
		this.dslAidDeviceName = dslAidDeviceName;
	}
	
	public String getLineEquipment() {
		return lineEquipment;
	}
	public void setLineEquipment(String lineEquipment) {
		this.lineEquipment = lineEquipment;
	}
	
	public String getCotDeviceName() {
		return cotDeviceName;
	}
	public void setCotDeviceName(String cotDeviceName) {
		this.cotDeviceName = cotDeviceName;
	}
	
	public String getClli() {
		return clli;
	}
	public void setClli(String clli) {
		this.clli = clli;
	}
	
	public String getTnCktId() {
		return tnCktId;
	}
	public void setTnCktId(String tnCktId) {
		this.tnCktId = tnCktId;
	}
	
	public String getNpanxx() {
		return npanxx;
	}
	public void setNpanxx(String npanxx) {
		this.npanxx = npanxx;
	}
	
	public String getOriginatingEquipment() {
		return originatingEquipment;
	}
	public void setOriginatingEquipment(String originatingEquipment) {
		this.originatingEquipment = originatingEquipment;
	}
	
	public String getOtherNumMeetPoints() {
		return otherNumMeetPoints;
	}
	public void setOtherNumMeetPoints(String otherNumMeetPoints) {
		this.otherNumMeetPoints = otherNumMeetPoints;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FacilityDetails  [accessPointLocation=");
		builder.append(accessPointLocation);
		builder.append(", aid=");
		builder.append(aid);
		builder.append(", aidDeviceName=");
		builder.append(aidDeviceName);
		builder.append(", dslAid=");
		builder.append(dslAid);
		builder.append(", dslAidDeviceName=");
		builder.append(dslAidDeviceName);
		builder.append(", lineEquipment=");
		builder.append(lineEquipment);
		builder.append(", cotDeviceName=");
		builder.append(cotDeviceName);
		builder.append(", clli=");
		builder.append(clli);
		builder.append(", tnCktId=");
		builder.append(tnCktId);
		builder.append(", npanxx=");
		builder.append(npanxx);
		builder.append(", originatingEquipment=");
		builder.append(originatingEquipment);
		builder.append(", otherNumMeetPoints=");
		builder.append(otherNumMeetPoints);
		builder.append("]");
		return builder.toString();
	}
	
	

}
