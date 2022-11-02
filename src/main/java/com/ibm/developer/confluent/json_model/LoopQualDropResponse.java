package com.ibm.developer.confluent.json_model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class LoopQualDropResponse {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoopQualDropResponse that = (LoopQualDropResponse) o;
        return Objects.equals(jobDropId, that.jobDropId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobDropId);
    }

    private BigDecimal jobDropId;
    @JsonProperty("addressDropDetailsList")
    private List<AddressDetailsResponse> addressDetailsResponse;

    public BigDecimal getJobDropId() {
        return jobDropId;
    }

    public void setJobDropId(BigDecimal jobDropId) {
        this.jobDropId = jobDropId;
    }

    public List<AddressDetailsResponse> getAddressDetailsResponse() {
        return addressDetailsResponse;
    }

    public void setAddressDetailsResponse(List<AddressDetailsResponse> addressDetailsResponse) {
        this.addressDetailsResponse = addressDetailsResponse;
    }
}
