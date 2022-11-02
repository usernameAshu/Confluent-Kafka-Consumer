package com.ibm.developer.confluent.json_model;

public class QualificationData {
	 TN tN;
	 SvcAddress SvcAddress;
	 private String requestType;
	 private String network;


	 // Getter Methods 

	 public TN gettN() {
			return tN;
		}

	 public SvcAddress getSvcAddress() {
	  return SvcAddress;
	 }

	
	public String getRequestType() {
	  return requestType;
	 }

	 public String getNetwork() {
	  return network;
	 }

	 // Setter Methods 


		public void settN(TN tN) {
			this.tN = tN;
		}


	 public void setSvcAddress(SvcAddress svcAddressObject) {
	  this.SvcAddress = svcAddressObject;
	 }

	 public void setRequestType(String requestType) {
	  this.requestType = requestType;
	 }

	 public void setNetwork(String network) {
	  this.network = network;
	 }
	}
