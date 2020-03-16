
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de LocationCommentPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LocationCommentPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Approved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerAlertTriggerProximity_AlertProximity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCommentPropertyOptions", propOrder = {
    "active",
    "approved",
    "content",
    "parentLocationEntityKey",
    "sender",
    "timestamp",
    "workerAlertTriggerProximityAlertProximity"
})
public class LocationCommentPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "Approved")
    protected Boolean approved;
    @XmlElement(name = "Content")
    protected Boolean content;
    @XmlElement(name = "ParentLocationEntityKey")
    protected Boolean parentLocationEntityKey;
    @XmlElement(name = "Sender")
    protected Boolean sender;
    @XmlElement(name = "Timestamp")
    protected Boolean timestamp;
    @XmlElement(name = "WorkerAlertTriggerProximity_AlertProximity")
    protected Boolean workerAlertTriggerProximityAlertProximity;

    /**
     * Obtém o valor da propriedade active.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Define o valor da propriedade active.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Obtém o valor da propriedade approved.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproved() {
        return approved;
    }

    /**
     * Define o valor da propriedade approved.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproved(Boolean value) {
        this.approved = value;
    }

    /**
     * Obtém o valor da propriedade content.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContent() {
        return content;
    }

    /**
     * Define o valor da propriedade content.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContent(Boolean value) {
        this.content = value;
    }

    /**
     * Obtém o valor da propriedade parentLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParentLocationEntityKey() {
        return parentLocationEntityKey;
    }

    /**
     * Define o valor da propriedade parentLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParentLocationEntityKey(Boolean value) {
        this.parentLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sender.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSender() {
        return sender;
    }

    /**
     * Define o valor da propriedade sender.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSender(Boolean value) {
        this.sender = value;
    }

    /**
     * Obtém o valor da propriedade timestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimestamp() {
        return timestamp;
    }

    /**
     * Define o valor da propriedade timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimestamp(Boolean value) {
        this.timestamp = value;
    }

    /**
     * Obtém o valor da propriedade workerAlertTriggerProximityAlertProximity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerAlertTriggerProximityAlertProximity() {
        return workerAlertTriggerProximityAlertProximity;
    }

    /**
     * Define o valor da propriedade workerAlertTriggerProximityAlertProximity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerAlertTriggerProximityAlertProximity(Boolean value) {
        this.workerAlertTriggerProximityAlertProximity = value;
    }

}
