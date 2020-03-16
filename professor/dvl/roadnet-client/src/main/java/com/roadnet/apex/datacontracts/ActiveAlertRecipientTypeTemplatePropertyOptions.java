
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ActiveAlertRecipientTypeTemplatePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ActiveAlertRecipientTypeTemplatePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveAlertMessageTypeFlags_MessageType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NotificationMethod_NotificationMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveAlertRecipientTypeTemplatePropertyOptions", propOrder = {
    "activeAlertMessageTypeFlagsMessageType",
    "body",
    "notificationMethodNotificationMethod",
    "subject"
})
public class ActiveAlertRecipientTypeTemplatePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "ActiveAlertMessageTypeFlags_MessageType")
    protected Boolean activeAlertMessageTypeFlagsMessageType;
    @XmlElement(name = "Body")
    protected Boolean body;
    @XmlElement(name = "NotificationMethod_NotificationMethod")
    protected Boolean notificationMethodNotificationMethod;
    @XmlElement(name = "Subject")
    protected Boolean subject;

    /**
     * Obtém o valor da propriedade activeAlertMessageTypeFlagsMessageType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveAlertMessageTypeFlagsMessageType() {
        return activeAlertMessageTypeFlagsMessageType;
    }

    /**
     * Define o valor da propriedade activeAlertMessageTypeFlagsMessageType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveAlertMessageTypeFlagsMessageType(Boolean value) {
        this.activeAlertMessageTypeFlagsMessageType = value;
    }

    /**
     * Obtém o valor da propriedade body.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBody(Boolean value) {
        this.body = value;
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
     * Obtém o valor da propriedade subject.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubject() {
        return subject;
    }

    /**
     * Define o valor da propriedade subject.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubject(Boolean value) {
        this.subject = value;
    }

}
