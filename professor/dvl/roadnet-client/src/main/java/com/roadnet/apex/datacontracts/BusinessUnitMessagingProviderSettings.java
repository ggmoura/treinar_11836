
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de BusinessUnit.MessagingProviderSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessUnit.MessagingProviderSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessUnit_MessagingProviderType_ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetPhoneNumbersFromAPI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessUnit.MessagingProviderSettings", propOrder = {
    "accountKey",
    "accountToken",
    "businessUnitMessagingProviderTypeProviderType",
    "getPhoneNumbersFromAPI",
    "phoneNumbers"
})
public class BusinessUnitMessagingProviderSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "AccountKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountKey;
    @XmlElementRef(name = "AccountToken", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountToken;
    @XmlElementRef(name = "BusinessUnit_MessagingProviderType_ProviderType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnitMessagingProviderTypeProviderType;
    @XmlElement(name = "GetPhoneNumbersFromAPI")
    protected Boolean getPhoneNumbersFromAPI;
    @XmlElementRef(name = "PhoneNumbers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumbers;

    /**
     * Obtém o valor da propriedade accountKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountKey() {
        return accountKey;
    }

    /**
     * Define o valor da propriedade accountKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountKey(JAXBElement<String> value) {
        this.accountKey = value;
    }

    /**
     * Obtém o valor da propriedade accountToken.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountToken() {
        return accountToken;
    }

    /**
     * Define o valor da propriedade accountToken.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountToken(JAXBElement<String> value) {
        this.accountToken = value;
    }

    /**
     * Obtém o valor da propriedade businessUnitMessagingProviderTypeProviderType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessUnitMessagingProviderTypeProviderType() {
        return businessUnitMessagingProviderTypeProviderType;
    }

    /**
     * Define o valor da propriedade businessUnitMessagingProviderTypeProviderType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessUnitMessagingProviderTypeProviderType(JAXBElement<String> value) {
        this.businessUnitMessagingProviderTypeProviderType = value;
    }

    /**
     * Obtém o valor da propriedade getPhoneNumbersFromAPI.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetPhoneNumbersFromAPI() {
        return getPhoneNumbersFromAPI;
    }

    /**
     * Define o valor da propriedade getPhoneNumbersFromAPI.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetPhoneNumbersFromAPI(Boolean value) {
        this.getPhoneNumbersFromAPI = value;
    }

    /**
     * Obtém o valor da propriedade phoneNumbers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Define o valor da propriedade phoneNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumbers(JAXBElement<String> value) {
        this.phoneNumbers = value;
    }

}
