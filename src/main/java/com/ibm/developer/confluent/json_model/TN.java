package com.ibm.developer.confluent.json_model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TN {
	
	private String nPA;

	private String nXX;

	private String lineNumber;


	 // Getter Methods 

	 @JsonProperty("nPA")
	 public String getNPA() {
	  return nPA;
	 }

	 @JsonProperty("nXX")
	 public String getNXX() {
	  return nXX;
	 }

	 @JsonProperty("lineNumber")
	 public String getLineNumber() {
	  return lineNumber;
	 }

	 // Setter Methods 

	 
	 public void setNPA(String nPA) {
	  this.nPA = nPA;
	 }

	 public void setNXX(String nXX) {
	  this.nXX = nXX;
	 }

	 public void setLineNumber(String lineNumber) {
	  this.lineNumber = lineNumber;
	 }
	}
