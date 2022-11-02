package com.ibm.developer.confluent.json_model;

import java.sql.Timestamp;
import java.util.Date;

public class JobDetailsPayload {
	
	private String messageId;
	private Timestamp messageTime;
	private String messageType;
	private String messageName;
	private String responseName;
	private String pattern;
	private String version;
	private String source;
	private String uniqueId;
	private String correlationId;
	private Payload payload;
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public Timestamp getMessageTime() {
		return messageTime;
	}
	public void setMessageTime(Timestamp messageTime) {
		this.messageTime = messageTime;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	public String getResponseName() {
		return responseName;
	}
	public void setResponseName(String responseName) {
		this.responseName = responseName;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public Payload getPayload() {
		return payload;
	}
	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	@Override
	public String toString() {
		return "JobDetailsPayload [messageId=" + messageId + ", messageTime=" + messageTime + ", messageType="
				+ messageType + ", messageName=" + messageName + ", responseName=" + responseName + ", pattern="
				+ pattern + ", version=" + version + ", source=" + source + ", uniqueId=" + uniqueId
				+ ", correlationId=" + correlationId + ", payload=" + payload + "]";
	}

}
