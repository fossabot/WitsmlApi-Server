package com.hashmapinc.tempus.witsml.server.api.model.cap.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obj_capServers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obj_capServers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capServer" type="{http://www.witsml.org/api/131}obj_capServer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.witsml.org/api/131}str16" fixed="1.3.1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_capServers", propOrder = {
    "capServer"
})
public class ObjCapServers {

    protected ObjCapServer capServer;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the capServer property.
     * 
     * @return
     *     possible object is
     *     {@link ObjCapServer }
     *     
     */
    public ObjCapServer getCapServer() {
        return capServer;
    }

    /**
     * Sets the value of the capServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCapServer }
     *     
     */
    public void setCapServer(ObjCapServer value) {
        this.capServer = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.3.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}