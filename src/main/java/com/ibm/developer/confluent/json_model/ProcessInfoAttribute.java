
package com.ibm.developer.confluent.json_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessInfoAttributeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessInfoAttributeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processInfoAttributeName",
    "processInfoAttributeValue"
})
@XmlRootElement(name = "ProcessInfoAttribute")
@JsonInclude(Include.NON_NULL)
public class ProcessInfoAttribute {

    @XmlElement(name = "ProcessInfoAttributeName", required = true)
    protected String processInfoAttributeName;
    @XmlElement(name = "ProcessInfoAttributeValue", required = true)
    protected String processInfoAttributeValue;

    /**
     * Gets the value of the processInfoAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessInfoAttributeName() {
        return processInfoAttributeName;
    }

    /**
     * Sets the value of the processInfoAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessInfoAttributeName(String value) {
        this.processInfoAttributeName = value;
    }

    /**
     * Gets the value of the processInfoAttributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessInfoAttributeValue() {
        return processInfoAttributeValue;
    }

    /**
     * Sets the value of the processInfoAttributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessInfoAttributeValue(String value) {
        this.processInfoAttributeValue = value;
    }

}
