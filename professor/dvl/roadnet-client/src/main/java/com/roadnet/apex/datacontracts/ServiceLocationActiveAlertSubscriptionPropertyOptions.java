
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ServiceLocationActiveAlertSubscriptionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocationActiveAlertSubscriptionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveAlertMessageTypeFlags_MessageTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BeforeServiceStartTimePeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NotificationMethod_NotificationMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecipientTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Recipients" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocationActiveAlertSubscriptionPropertyOptions", propOrder = {
    "activeAlertMessageTypeFlagsMessageTypes",
    "beforeServiceStartTimePeriod",
    "notificationMethodNotificationMethod",
    "recipientTypeEntityKey",
    "recipients"
})
public class ServiceLocationActiveAlertSubscriptionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "ActiveAlertMessageTypeFlags_MessageTypes")
    protected Boolean activeAlertMessageTypeFlagsMessageTypes;
    @XmlElement(name = "BeforeServiceStartTimePeriod")
    protected Boolean beforeServiceStartTimePeriod;
    @XmlElement(name = "NotificationMethod_NotificationMethod")
    protected Boolean notificationMethodNotificationMethod;
    @XmlElement(name = "RecipientTypeEntityKey")
    protected Boolean recipientTypeEntityKey;
    @XmlElement(name = "Recipients")
    protected Boolean recipients;

    /**
     * Obtém o valor da propriedade activeAlertMessageTypeFlagsMessageTypes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveAlertMessageTypeFlagsMessageTypes() {
        return activeAlertMessageTypeFlagsMessageTypes;
    }

    /**
     * Define o valor da propriedade activeAlertMessageTypeFlagsMessageTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveAlertMessageTypeFlagsMessageTypes(Boolean value) {
        this.activeAlertMessageTypeFlagsMessageTypes = value;
    }

    /**
     * Obtém o valor da propriedade beforeServiceStartTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeforeServiceStartTimePeriod() {
        return beforeServiceStartTimePeriod;
    }

    /**
     * Define o valor da propriedade beforeServiceStartTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeforeServiceStartTimePeriod(Boolean value) {
        this.beforeServiceStartTimePeriod = value;
    }

    /**
     * Obtém o valor da propriedade notificationMethodNotificationMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotificationMethodNotificationMethod() {
        return notificationMethodNotificationMethod;
    }

    /**
     * Define o valor da propriedade notificationMethodNotificationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotificationMethodNotificationMethod(Boolean value) {
        this.notificationMethodNotificationMethod = value;
    }

    /**
     * Obtém o valor da propriedade recipientTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecipientTypeEntityKey() {
        return recipientTypeEntityKey;
    }

    /**
     * Define o valor da propriedade recipientTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecipientTypeEntityKey(Boolean value) {
        this.recipientTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade recipients.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecipients() {
        return recipients;
    }

    /**
     * Define o valor da propriedade recipients.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecipients(Boolean value) {
        this.recipients = value;
    }

}
