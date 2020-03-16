
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ClientApplicationInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ClientApplicationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuildType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationIdentifier" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="UseApplicationVersionBackwardsCompatibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseApplicationVersionForwardCompatibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientApplicationInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", propOrder = {
    "buildType",
    "clientApplicationIdentifier",
    "useApplicationVersionBackwardsCompatibility",
    "useApplicationVersionForwardCompatibility",
    "version"
})
public class ClientApplicationInfo {

    @XmlElementRef(name = "BuildType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buildType;
    @XmlElement(name = "ClientApplicationIdentifier")
    protected String clientApplicationIdentifier;
    @XmlElement(name = "UseApplicationVersionBackwardsCompatibility")
    protected Boolean useApplicationVersionBackwardsCompatibility;
    @XmlElement(name = "UseApplicationVersionForwardCompatibility")
    protected Boolean useApplicationVersionForwardCompatibility;
    @XmlElementRef(name = "Version", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", type = JAXBElement.class, required = false)
    protected JAXBElement<String> version;

    /**
     * Obtém o valor da propriedade buildType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildType() {
        return buildType;
    }

    /**
     * Define o valor da propriedade buildType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildType(JAXBElement<String> value) {
        this.buildType = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientApplicationIdentifier() {
        return clientApplicationIdentifier;
    }

    /**
     * Define o valor da propriedade clientApplicationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientApplicationIdentifier(String value) {
        this.clientApplicationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade useApplicationVersionBackwardsCompatibility.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseApplicationVersionBackwardsCompatibility() {
        return useApplicationVersionBackwardsCompatibility;
    }

    /**
     * Define o valor da propriedade useApplicationVersionBackwardsCompatibility.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseApplicationVersionBackwardsCompatibility(Boolean value) {
        this.useApplicationVersionBackwardsCompatibility = value;
    }

    /**
     * Obtém o valor da propriedade useApplicationVersionForwardCompatibility.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseApplicationVersionForwardCompatibility() {
        return useApplicationVersionForwardCompatibility;
    }

    /**
     * Define o valor da propriedade useApplicationVersionForwardCompatibility.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseApplicationVersionForwardCompatibility(Boolean value) {
        this.useApplicationVersionForwardCompatibility = value;
    }

    /**
     * Obtém o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersion(JAXBElement<String> value) {
        this.version = value;
    }

}
