
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CustomerClientApplicationVersionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerClientApplicationVersionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowPriorVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationOptions" type="{http://roadnet.com/apex/DataContracts/}ClientApplicationPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerClientApplicationVersionOptions" type="{http://roadnet.com/apex/DataContracts/}ClientApplicationVersionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerClientApplicationVersionPropertyOptions", propOrder = {
    "allowPriorVersion",
    "clientApplication",
    "clientApplicationOptions",
    "clientApplicationVersion",
    "customerClientApplicationVersionOptions",
    "customerEntityKey",
    "minimumApplicationVersion"
})
public class CustomerClientApplicationVersionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AllowPriorVersion")
    protected Boolean allowPriorVersion;
    @XmlElement(name = "ClientApplication")
    protected Boolean clientApplication;
    @XmlElementRef(name = "ClientApplicationOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientApplicationPropertyOptions> clientApplicationOptions;
    @XmlElement(name = "ClientApplicationVersion")
    protected Boolean clientApplicationVersion;
    @XmlElementRef(name = "CustomerClientApplicationVersionOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientApplicationVersionPropertyOptions> customerClientApplicationVersionOptions;
    @XmlElement(name = "CustomerEntityKey")
    protected Boolean customerEntityKey;
    @XmlElement(name = "MinimumApplicationVersion")
    protected Boolean minimumApplicationVersion;

    /**
     * Obtém o valor da propriedade allowPriorVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPriorVersion() {
        return allowPriorVersion;
    }

    /**
     * Define o valor da propriedade allowPriorVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPriorVersion(Boolean value) {
        this.allowPriorVersion = value;
    }

    /**
     * Obtém o valor da propriedade clientApplication.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientApplication() {
        return clientApplication;
    }

    /**
     * Define o valor da propriedade clientApplication.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientApplication(Boolean value) {
        this.clientApplication = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ClientApplicationPropertyOptions> getClientApplicationOptions() {
        return clientApplicationOptions;
    }

    /**
     * Define o valor da propriedade clientApplicationOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationPropertyOptions }{@code >}
     *     
     */
    public void setClientApplicationOptions(JAXBElement<ClientApplicationPropertyOptions> value) {
        this.clientApplicationOptions = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientApplicationVersion() {
        return clientApplicationVersion;
    }

    /**
     * Define o valor da propriedade clientApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientApplicationVersion(Boolean value) {
        this.clientApplicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade customerClientApplicationVersionOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationVersionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ClientApplicationVersionPropertyOptions> getCustomerClientApplicationVersionOptions() {
        return customerClientApplicationVersionOptions;
    }

    /**
     * Define o valor da propriedade customerClientApplicationVersionOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationVersionPropertyOptions }{@code >}
     *     
     */
    public void setCustomerClientApplicationVersionOptions(JAXBElement<ClientApplicationVersionPropertyOptions> value) {
        this.customerClientApplicationVersionOptions = value;
    }

    /**
     * Obtém o valor da propriedade customerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerEntityKey() {
        return customerEntityKey;
    }

    /**
     * Define o valor da propriedade customerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerEntityKey(Boolean value) {
        this.customerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade minimumApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumApplicationVersion() {
        return minimumApplicationVersion;
    }

    /**
     * Define o valor da propriedade minimumApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumApplicationVersion(Boolean value) {
        this.minimumApplicationVersion = value;
    }

}
