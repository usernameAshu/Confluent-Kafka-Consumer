
package com.ibm.developer.confluent.json_model;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="ProcessInfoAttributeGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.qwest.com/XMLSchema}ProcessInfoAttribute" maxOccurs="unbounded" minOccurs="0"/>
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
    "processInfoAttributeGroupName",
    "processInfoAttribute"
})
@XmlRootElement(name = "ProcessInfoAttributeGroup")
@JsonInclude(Include.NON_NULL)
public class ProcessInfoAttributeGroup {

    @XmlElement(name = "ProcessInfoAttributeGroupName")
    protected String processInfoAttributeGroupName;
    @XmlElement(name = "ProcessInfoAttribute")
    protected List<ProcessInfoAttribute> processInfoAttribute;

    /**
     * Gets the value of the processInfoAttributeGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessInfoAttributeGroupName() {
        return processInfoAttributeGroupName;
    }

    /**
     * Sets the value of the processInfoAttributeGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessInfoAttributeGroupName(String value) {
        this.processInfoAttributeGroupName = value;
    }

    /**
     * Gets the value of the processInfoAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processInfoAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessInfoAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessInfoAttribute }
     * 
     * 
     */
    public List<ProcessInfoAttribute> getProcessInfoAttribute() {
        if (processInfoAttribute == null) {
            processInfoAttribute = new ArrayList<ProcessInfoAttribute>();
        }
        return this.processInfoAttribute;
    }

}
