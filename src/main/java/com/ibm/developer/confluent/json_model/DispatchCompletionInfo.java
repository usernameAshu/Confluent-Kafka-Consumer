package com.ibm.developer.confluent.json_model;

public class DispatchCompletionInfo {
private String depositionCodeDescription;
private String causeCodeDescription;
private String dispositionCode;
private String causeCode;

/**
 * @return the depositionCodeDescription
 */
public String getDepositionCodeDescription() {
	return depositionCodeDescription;
}
/**
 * @param depositionCodeDescription the depositionCodeDescription to set
 */
public void setDepositionCodeDescription(String depositionCodeDescription) {
	this.depositionCodeDescription = depositionCodeDescription;
}
/**
 * @return the causeCodeDescription
 */
public String getCauseCodeDescription() {
	return causeCodeDescription;
}
/**
 * @param causeCodeDescription the causeCodeDescription to set
 */
public void setCauseCodeDescription(String causeCodeDescription) {
	this.causeCodeDescription = causeCodeDescription;
}
/**
 * @return the causeCode
 */
public String getCauseCode() {
	return causeCode;
}
/**
 * @param causeCode the causeCode to set
 */
public void setCauseCode(String causeCode) {
	this.causeCode = causeCode;
}
/**
 * @return the dispositionCode
 */
public String getDispositionCode() {
	return dispositionCode;
}
/**
 * @param dispositionCode the dispositionCode to set
 */
public void setDispositionCode(String dispositionCode) {
	this.dispositionCode = dispositionCode;
}

}
