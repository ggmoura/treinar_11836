
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ClientInstallInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ClientInstallInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuildType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CultureUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CultureVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ClientInstallInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", propOrder = {
    "buildType",
    "cultureUrl",
    "cultureVersion",
    "url",
    "version"
})
public class ClientInstallInfo {

    @XmlElementRef(name = "BuildType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buildType;
    @XmlElementRef(name = "CultureUrl", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cultureUrl;
    @XmlElementRef(name = "CultureVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cultureVersion;
    @XmlElementRef(name = "Url", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;
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
     * Obtém o valor da propriedade cultureUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCultureUrl() {
        return cultureUrl;
    }

    /**
     * Define o valor da propriedade cultureUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCultureUrl(JAXBElement<String> value) {
        this.cultureUrl = value;
    }

    /**
     * Obtém o valor da propriedade cultureVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCultureVersion() {
        return cultureVersion;
    }

    /**
     * Define o valor da propriedade cultureVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCultureVersion(JAXBElement<String> value) {
        this.cultureVersion = value;
    }

    /**
     * Obtém o valor da propriedade url.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl() {
        return url;
    }

    /**
     * Define o valor da propriedade url.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl(JAXBElement<String> value) {
        this.url = value;
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
