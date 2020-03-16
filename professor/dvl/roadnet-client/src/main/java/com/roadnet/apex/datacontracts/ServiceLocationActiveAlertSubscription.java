
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de ServiceLocationActiveAlertSubscription complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocationActiveAlertSubscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveAlertMessageTypeFlags_MessageTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeforeServiceStartTimePeriod" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="NotificationMethod_NotificationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Recipients" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocationActiveAlertSubscription", propOrder = {
    "activeAlertMessageTypeFlagsMessageTypes",
    "beforeServiceStartTimePeriod",
    "notificationMethodNotificationMethod",
    "recipientTypeEntityKey",
    "recipients"
})
public class ServiceLocationActiveAlertSubscription
    extends DomainEntity
{

    @XmlElementRef(name = "ActiveAlertMessageTypeFlags_MessageTypes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeAlertMessageTypeFlagsMessageTypes;
    @XmlElement(name = "BeforeServiceStartTimePeriod")
    protected Duration beforeServiceStartTimePeriod;
    @XmlElementRef(name = "NotificationMethod_NotificationMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationMethodNotificationMethod;
    @XmlElement(name = "RecipientTypeEntityKey")
    protected Long recipientTypeEntityKey;
    @XmlElementRef(name = "Recipients", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recipients;

    /**
     * Obtém o valor da propriedade activeAlertMessageTypeFlagsMessageTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveAlertMessageTypeFlagsMessageTypes() {
        return activeAlertMessageTypeFlagsMessageTypes;
    }

    /**
     * Define o valor da propriedade activeAlertMessageTypeFlagsMessageTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveAlertMessageTypeFlagsMessageTypes(JAXBElement<String> value) {
        this.activeAlertMessageTypeFlagsMessageTypes = value;
    }

    /**
     * Obtém o valor da propriedade beforeServiceStartTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBeforeServiceStartTimePeriod() {
        return beforeServiceStartTimePeriod;
    }

    /**
     * Define o valor da propriedade beforeServiceStartTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBeforeServiceStartTimePeriod(Duration value) {
        this.beforeServiceStartTimePeriod = value;
    }

    /**
     * Obtém o valor da propriedade notificationMethodNotificationMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationMethodNotificationMethod() {
        return notificationMethodNotificationMethod;
    }

    /**
     * Define o valor da propriedade notificationMethodNotificationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationMethodNotificationMethod(JAXBElement<String> value) {
        this.notificationMethodNotificationMethod = value;
    }

    /**
     * Obtém o valor da propriedade recipientTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecipientTypeEntityKey() {
        return recipientTypeEntityKey;
    }

    /**
     * Define o valor da propriedade recipientTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecipientTypeEntityKey(Long value) {
        this.recipientTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade recipients.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecipients() {
        return recipients;
    }

    /**
     * Define o valor da propriedade recipients.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecipients(JAXBElement<String> value) {
        this.recipients = value;
    }

}
