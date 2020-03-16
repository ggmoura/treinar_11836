
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResourceExceptionRulePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResourceExceptionRulePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Conditions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConditionsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceExceptionRuleConditionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EmailRecipients" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastProcessed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MapDisplayCharacter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NotificationsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProcessOnEventFlags_ProcessActions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProcessPeriodically" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProcessTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Recipients" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecipientsPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceExceptionRecipientDetailsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RequiresAcknowledgement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RuleType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpecialFunction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TextMessageRecipients" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceExceptionRulePropertyOptions", propOrder = {
    "color",
    "conditions",
    "conditionsOptions",
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
    "recipientsPropertyOptions",
    "requiresAcknowledgement",
    "ruleTypeType",
    "specialFunction",
    "textMessageRecipients",
    "worldTimeZoneTimeZone"
})
public class ResourceExceptionRulePropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "Conditions")
    protected Boolean conditions;
    @XmlElementRef(name = "ConditionsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceExceptionRuleConditionPropertyOptions> conditionsOptions;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EmailRecipients")
    protected Boolean emailRecipients;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlElement(name = "LastProcessed")
    protected Boolean lastProcessed;
    @XmlElement(name = "MapDisplayCharacter")
    protected Boolean mapDisplayCharacter;
    @XmlElement(name = "NotificationsEnabled")
    protected Boolean notificationsEnabled;
    @XmlElement(name = "ProcessOnEventFlags_ProcessActions")
    protected Boolean processOnEventFlagsProcessActions;
    @XmlElement(name = "ProcessPeriodically")
    protected Boolean processPeriodically;
    @XmlElement(name = "ProcessTime")
    protected Boolean processTime;
    @XmlElement(name = "Recipients")
    protected Boolean recipients;
    @XmlElementRef(name = "RecipientsPropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceExceptionRecipientDetailsPropertyOptions> recipientsPropertyOptions;
    @XmlElement(name = "RequiresAcknowledgement")
    protected Boolean requiresAcknowledgement;
    @XmlElement(name = "RuleType_Type")
    protected Boolean ruleTypeType;
    @XmlElement(name = "SpecialFunction")
    protected Boolean specialFunction;
    @XmlElement(name = "TextMessageRecipients")
    protected Boolean textMessageRecipients;
    @XmlElement(name = "WorldTimeZone_TimeZone")
    protected Boolean worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColor(Boolean value) {
        this.color = value;
    }

    /**
     * Obtém o valor da propriedade conditions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConditions() {
        return conditions;
    }

    /**
     * Define o valor da propriedade conditions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConditions(Boolean value) {
        this.conditions = value;
    }

    /**
     * Obtém o valor da propriedade conditionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceExceptionRuleConditionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceExceptionRuleConditionPropertyOptions> getConditionsOptions() {
        return conditionsOptions;
    }

    /**
     * Define o valor da propriedade conditionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceExceptionRuleConditionPropertyOptions }{@code >}
     *     
     */
    public void setConditionsOptions(JAXBElement<ResourceExceptionRuleConditionPropertyOptions> value) {
        this.conditionsOptions = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade emailRecipients.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailRecipients() {
        return emailRecipients;
    }

    /**
     * Define o valor da propriedade emailRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailRecipients(Boolean value) {
        this.emailRecipients = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isLastProcessed() {
        return lastProcessed;
    }

    /**
     * Define o valor da propriedade lastProcessed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastProcessed(Boolean value) {
        this.lastProcessed = value;
    }

    /**
     * Obtém o valor da propriedade mapDisplayCharacter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMapDisplayCharacter() {
        return mapDisplayCharacter;
    }

    /**
     * Define o valor da propriedade mapDisplayCharacter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMapDisplayCharacter(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessOnEventFlagsProcessActions() {
        return processOnEventFlagsProcessActions;
    }

    /**
     * Define o valor da propriedade processOnEventFlagsProcessActions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessOnEventFlagsProcessActions(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessTime() {
        return processTime;
    }

    /**
     * Define o valor da propriedade processTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessTime(Boolean value) {
        this.processTime = value;
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

    /**
     * Obtém o valor da propriedade recipientsPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceExceptionRecipientDetailsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceExceptionRecipientDetailsPropertyOptions> getRecipientsPropertyOptions() {
        return recipientsPropertyOptions;
    }

    /**
     * Define o valor da propriedade recipientsPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceExceptionRecipientDetailsPropertyOptions }{@code >}
     *     
     */
    public void setRecipientsPropertyOptions(JAXBElement<ResourceExceptionRecipientDetailsPropertyOptions> value) {
        this.recipientsPropertyOptions = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isRuleTypeType() {
        return ruleTypeType;
    }

    /**
     * Define o valor da propriedade ruleTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuleTypeType(Boolean value) {
        this.ruleTypeType = value;
    }

    /**
     * Obtém o valor da propriedade specialFunction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialFunction() {
        return specialFunction;
    }

    /**
     * Define o valor da propriedade specialFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialFunction(Boolean value) {
        this.specialFunction = value;
    }

    /**
     * Obtém o valor da propriedade textMessageRecipients.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextMessageRecipients() {
        return textMessageRecipients;
    }

    /**
     * Define o valor da propriedade textMessageRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextMessageRecipients(Boolean value) {
        this.textMessageRecipients = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneTimeZone(Boolean value) {
        this.worldTimeZoneTimeZone = value;
    }

}
