
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de BusinessUnit.ExternalDataFeedSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessUnit.ExternalDataFeedSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessUnit_DataFeedMessageContentType_MessageContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataFeedUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnableAuthorization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExternalDataFeedEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessUnit.ExternalDataFeedSettings", propOrder = {
    "businessUnitDataFeedMessageContentTypeMessageContentType",
    "dataFeedUrl",
    "enableAuthorization",
    "externalDataFeedEnabled",
    "password",
    "username"
})
public class BusinessUnitExternalDataFeedSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "BusinessUnit_DataFeedMessageContentType_MessageContentType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnitDataFeedMessageContentTypeMessageContentType;
    @XmlElementRef(name = "DataFeedUrl", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataFeedUrl;
    @XmlElement(name = "EnableAuthorization")
    protected Boolean enableAuthorization;
    @XmlElement(name = "ExternalDataFeedEnabled")
    protected Boolean externalDataFeedEnabled;
    @XmlElementRef(name = "Password", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "Username", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> username;

    /**
     * Obtém o valor da propriedade businessUnitDataFeedMessageContentTypeMessageContentType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessUnitDataFeedMessageContentTypeMessageContentType() {
        return businessUnitDataFeedMessageContentTypeMessageContentType;
    }

    /**
     * Define o valor da propriedade businessUnitDataFeedMessageContentTypeMessageContentType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessUnitDataFeedMessageContentTypeMessageContentType(JAXBElement<String> value) {
        this.businessUnitDataFeedMessageContentTypeMessageContentType = value;
    }

    /**
     * Obtém o valor da propriedade dataFeedUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataFeedUrl() {
        return dataFeedUrl;
    }

    /**
     * Define o valor da propriedade dataFeedUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataFeedUrl(JAXBElement<String> value) {
        this.dataFeedUrl = value;
    }

    /**
     * Obtém o valor da propriedade enableAuthorization.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAuthorization() {
        return enableAuthorization;
    }

    /**
     * Define o valor da propriedade enableAuthorization.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAuthorization(Boolean value) {
        this.enableAuthorization = value;
    }

    /**
     * Obtém o valor da propriedade externalDataFeedEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalDataFeedEnabled() {
        return externalDataFeedEnabled;
    }

    /**
     * Define o valor da propriedade externalDataFeedEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalDataFeedEnabled(Boolean value) {
        this.externalDataFeedEnabled = value;
    }

    /**
     * Obtém o valor da propriedade password.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Define o valor da propriedade password.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Obtém o valor da propriedade username.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername() {
        return username;
    }

    /**
     * Define o valor da propriedade username.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername(JAXBElement<String> value) {
        this.username = value;
    }

}
