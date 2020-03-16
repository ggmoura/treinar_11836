
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ResourceExceptionRuleFunction;


/**
 * <p>Classe Java de ResourceExceptionRule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResourceExceptionRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Color" type="{http://roadnet.com/apex/DataContracts/}Color" minOccurs="0"/&gt;
 *         &lt;element name="Conditions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfResourceExceptionRuleCondition" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailRecipients" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastProcessed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MapDisplayCharacter" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="NotificationsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProcessOnEventFlags_ProcessActions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcessPeriodically" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProcessTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="Recipients" type="{http://roadnet.com/apex/DataContracts/}ArrayOfResourceExceptionRecipientDetails" minOccurs="0"/&gt;
 *         &lt;element name="RequiresAcknowledgement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RuleType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialFunction" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionRuleFunction" minOccurs="0"/&gt;
 *         &lt;element name="TextMessageRecipients" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceExceptionRule", propOrder = {
    "color",
    "conditions",
    "description",
    "emailRecipients",
    "identifier",
    "isDeleted",
    "isEnabled",
    "lastProcessed",
    "mapDisplayCharacter",
    "notificationsEnabled",
    "processOnEventFlagsProcessActions",
    "processPeriodically",
    "processTime",
    "recipients",
    "requiresAcknowledgement",
    "ruleTypeType",
    "specialFunction",
    "textMessageRecipients",
    "worldTimeZoneTimeZone"
})
public class ResourceExceptionRule
    extends RegionBasedAggregateRootEntity
{

    @XmlElementRef(name = "Color", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Color> color;
    @XmlElementRef(name = "Conditions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResourceExceptionRuleCondition> conditions;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EmailRecipients", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> emailRecipients;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlElementRef(name = "LastProcessed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastProcessed;
    @XmlElement(name = "MapDisplayCharacter")
    protected Integer mapDisplayCharacter;
    @XmlElement(name = "NotificationsEnabled")
    protected Boolean notificationsEnabled;
    @XmlElementRef(name = "ProcessOnEventFlags_ProcessActions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processOnEventFlagsProcessActions;
    @XmlElement(name = "ProcessPeriodically")
    protected Boolean processPeriodically;
    @XmlElementRef(name = "ProcessTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> processTime;
    @XmlElementRef(name = "Recipients", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResourceExceptionRecipientDetails> recipients;
    @XmlElement(name = "RequiresAcknowledgement")
    protected Boolean requiresAcknowledgement;
    @XmlElementRef(name = "RuleType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ruleTypeType;
    @XmlElementRef(name = "SpecialFunction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceExceptionRuleFunction> specialFunction;
    @XmlElementRef(name = "TextMessageRecipients", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> textMessageRecipients;
    @XmlElementRef(name = "WorldTimeZone_TimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public JAXBElement<Color> getColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public void setColor(JAXBElement<Color> value) {
        this.color = value;
    }

    /**
     * Obtém o valor da propriedade conditions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResourceExceptionRuleCondition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResourceExceptionRuleCondition> getConditions() {
        return conditions;
    }

    /**
     * Define o valor da propriedade conditions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResourceExceptionRuleCondition }{@code >}
     *     
     */
    public void setConditions(JAXBElement<ArrayOfResourceExceptionRuleCondition> value) {
        this.conditions = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade emailRecipients.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getEmailRecipients() {
        return emailRecipients;
    }

    /**
     * Define o valor da propriedade emailRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setEmailRecipients(JAXBElement<ArrayOfstring> value) {
        this.emailRecipients = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade isEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Define o valor da propriedade isEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    /**
     * Obtém o valor da propriedade lastProcessed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastProcessed() {
        return lastProcessed;
    }

    /**
     * Define o valor da propriedade lastProcessed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastProcessed(JAXBElement<XMLGregorianCalendar> value) {
        this.lastProcessed = value;
    }

    /**
     * Obtém o valor da propriedade mapDisplayCharacter.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMapDisplayCharacter() {
        return mapDisplayCharacter;
    }

    /**
     * Define o valor da propriedade mapDisplayCharacter.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMapDisplayCharacter(Integer value) {
        this.mapDisplayCharacter = value;
    }

    /**
     * Obtém o valor da propriedade notificationsEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotificationsEnabled() {
        return notificationsEnabled;
    }

    /**
     * Define o valor da propriedade notificationsEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotificationsEnabled(Boolean value) {
        this.notificationsEnabled = value;
    }

    /**
     * Obtém o valor da propriedade processOnEventFlagsProcessActions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessOnEventFlagsProcessActions() {
        return processOnEventFlagsProcessActions;
    }

    /**
     * Define o valor da propriedade processOnEventFlagsProcessActions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessOnEventFlagsProcessActions(JAXBElement<String> value) {
        this.processOnEventFlagsProcessActions = value;
    }

    /**
     * Obtém o valor da propriedade processPeriodically.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessPeriodically() {
        return processPeriodically;
    }

    /**
     * Define o valor da propriedade processPeriodically.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessPeriodically(Boolean value) {
        this.processPeriodically = value;
    }

    /**
     * Obtém o valor da propriedade processTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProcessTime() {
        return processTime;
    }

    /**
     * Define o valor da propriedade processTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProcessTime(JAXBElement<XMLGregorianCalendar> value) {
        this.processTime = value;
    }

    /**
     * Obtém o valor da propriedade recipients.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResourceExceptionRecipientDetails }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResourceExceptionRecipientDetails> getRecipients() {
        return recipients;
    }

    /**
     * Define o valor da propriedade recipients.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResourceExceptionRecipientDetails }{@code >}
     *     
     */
    public void setRecipients(JAXBElement<ArrayOfResourceExceptionRecipientDetails> value) {
        this.recipients = value;
    }

    /**
     * Obtém o valor da propriedade requiresAcknowledgement.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresAcknowledgement() {
        return requiresAcknowledgement;
    }

    /**
     * Define o valor da propriedade requiresAcknowledgement.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresAcknowledgement(Boolean value) {
        this.requiresAcknowledgement = value;
    }

    /**
     * Obtém o valor da propriedade ruleTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRuleTypeType() {
        return ruleTypeType;
    }

    /**
     * Define o valor da propriedade ruleTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRuleTypeType(JAXBElement<String> value) {
        this.ruleTypeType = value;
    }

    /**
     * Obtém o valor da propriedade specialFunction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceExceptionRuleFunction }{@code >}
     *     
     */
    public JAXBElement<ResourceExceptionRuleFunction> getSpecialFunction() {
        return specialFunction;
    }

    /**
     * Define o valor da propriedade specialFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceExceptionRuleFunction }{@code >}
     *     
     */
    public void setSpecialFunction(JAXBElement<ResourceExceptionRuleFunction> value) {
        this.specialFunction = value;
    }

    /**
     * Obtém o valor da propriedade textMessageRecipients.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getTextMessageRecipients() {
        return textMessageRecipients;
    }

    /**
     * Define o valor da propriedade textMessageRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setTextMessageRecipients(JAXBElement<ArrayOfstring> value) {
        this.textMessageRecipients = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneTimeZone = value;
    }

}
