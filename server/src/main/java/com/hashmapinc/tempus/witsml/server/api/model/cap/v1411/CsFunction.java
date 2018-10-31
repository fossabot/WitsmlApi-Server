package com.hashmapinc.tempus.witsml.server.api.model.cap.v1411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cs_function complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cs_function">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DDataObject" type="{http://www.witsml.org/api/141}objectWithConstraint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.witsml.org/api/141}str64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_function", propOrder = {
    "dataObject"
})
public class CsFunction {

    protected List<ObjectWithConstraint> dataObject;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the DDataObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the DDataObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectWithConstraint }
     * 
     * 
     */
    public List<ObjectWithConstraint> getDataObject() {
        if (dataObject == null) {
            dataObject = new ArrayList<ObjectWithConstraint>();
        }
        return this.dataObject;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}