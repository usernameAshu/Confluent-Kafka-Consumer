package com.ibm.developer.confluent.json_model;

public class ArmorTicketResponse {
	private BaseResponse baseResponse;
	private String ticket;
	private String armorTicketStatus;
	
	public String getArmorTicketStatus() {
		return armorTicketStatus;
	}
	public void setArmorTicketStatus(String armorTicketStatus) {
		this.armorTicketStatus = armorTicketStatus;
	}
	public BaseResponse getBaseResponse() {
		return baseResponse;
	}
	public void setBaseResponse(BaseResponse baseResponse) {
		this.baseResponse = baseResponse;
	}
	
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	@Override
	public String toString() {
		return "ArmorTicketResponse [" + (baseResponse != null ? "baseResponse=" + baseResponse + ", " : "")
				+ (ticket != null ? "ticket=" + ticket + ", " : "")
				+ (armorTicketStatus != null ? "armorTicketStatus=" + armorTicketStatus : "") + "]";
	}
}
