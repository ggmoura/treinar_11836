
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de CustomerClientApplicationVersion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerClientApplicationVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowPriorVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplication" type="{http://roadnet.com/apex/DataContracts/}ClientApplication" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationVersion" type="{http://roadnet.com/apex/DataContracts/}ClientApplicationVersion" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MinimumApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerClientApplicationVersion", propOrder = {
    "allowPriorVersion",
    "clientApplication",
    "clientApplicationVersion",
    "customerEntityKey",
    "minimumApplicationVersion"
})
public class CustomerClientApplicationVersion
    extends DomainEntity
{

    @XmlElement(name = "AllowPriorVersion")
    protected Boolean allowPriorVersion;
    @XmlElementRef(name = "ClientApplication", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientApplication> clientApplication;
    @XmlElementRef(name = "ClientApplicationVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientApplicationVersion> clientApplicationVersion;
    @XmlElement(name = "CustomerEntityKey")
    protected Long customerEntityKey;
    @XmlElementRef(name = "MinimumApplicationVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minimumApplicationVersion;

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
     *     {@link JAXBElement }{@code <}{@link ClientApplication }{@code >}
     *     
     */
    public JAXBElement<ClientApplication> getClientApplication() {
        return clientApplication;
    }

    /**
     * Define o valor da propriedade clientApplication.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientApplication }{@code >}
     *     
     */
    public void setClientApplication(JAXBElement<ClientApplication> value) {
        this.clientApplication = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationVersion }{@code >}
     *     
     */
    public JAXBElement<ClientApplicationVersion> getClientApplicationVersion() {
        return clientApplicationVersion;
    }

    /**
     * Define o valor da propriedade clientApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationVersion }{@code >}
     *     
     */
    public void setClientApplicationVersion(JAXBElement<ClientApplicationVersion> value) {
        this.clientApplicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade customerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerEntityKey() {
        return customerEntityKey;
    }

    /**
     * Define o valor da propriedade customerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerEntityKey(Long value) {
        this.customerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade minimumApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinimumApplicationVersion() {
        return minimumApplicationVersion;
    }

    /**
     * Define o valor da propriedade minimumApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinimumApplicationVersion(JAXBElement<String> value) {
        this.minimumApplicationVersion = value;
    }

}
