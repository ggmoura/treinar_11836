
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ComplianceAlertPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ComplianceAlertPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlertTypeOptions_AlertType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceAlertXrsSid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EmailSubject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyOptions_Frequency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PriorityOptions_Priority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceAlertPropertyOptions", propOrder = {
    "alertTypeOptionsAlertType",
    "complianceAlertXrsSid",
    "description",
    "emailSubject",
    "frequencyOptionsFrequency",
    "identifier",
    "isEnabled",
    "notes",
    "options",
    "priorityOptionsPriority",
    "userEntityKeys",
    "workerEntityKeys"
})
public class ComplianceAlertPropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "AlertTypeOptions_AlertType")
    protected Boolean alertTypeOptionsAlertType;
    @XmlElement(name = "ComplianceAlertXrsSid")
    protected Boolean complianceAlertXrsSid;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EmailSubject")
    protected Boolean emailSubject;
    @XmlElement(name = "FrequencyOptions_Frequency")
    protected Boolean frequencyOptionsFrequency;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlElement(name = "Notes")
    protected Boolean notes;
    @XmlElement(name = "Options")
    protected Boolean options;
    @XmlElement(name = "PriorityOptions_Priority")
    protected Boolean priorityOptionsPriority;
    @XmlElement(name = "UserEntityKeys")
    protected Boolean userEntityKeys;
    @XmlElement(name = "WorkerEntityKeys")
    protected Boolean workerEntityKeys;

    /**
     * Obtém o valor da propriedade alertTypeOptionsAlertType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertTypeOptionsAlertType() {
        return alertTypeOptionsAlertType;
    }

    /**
     * Define o valor da propriedade alertTypeOptionsAlertType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertTypeOptionsAlertType(Boolean value) {
        this.alertTypeOptionsAlertType = value;
    }

    /**
     * Obtém o valor da propriedade complianceAlertXrsSid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplianceAlertXrsSid() {
        return complianceAlertXrsSid;
    }

    /**
     * Define o valor da propriedade complianceAlertXrsSid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplianceAlertXrsSid(Boolean value) {
        this.complianceAlertXrsSid = value;
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
     * Obtém o valor da propriedade emailSubject.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailSubject() {
        return emailSubject;
    }

    /**
     * Define o valor da propriedade emailSubject.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailSubject(Boolean value) {
        this.emailSubject = value;
    }

    /**
     * Obtém o valor da propriedade frequencyOptionsFrequency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrequencyOptionsFrequency() {
        return frequencyOptionsFrequency;
    }

    /**
     * Define o valor da propriedade frequencyOptionsFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrequencyOptionsFrequency(Boolean value) {
        this.frequencyOptionsFrequency = value;
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
     * Obtém o valor da propriedade notes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotes() {
        return notes;
    }

    /**
     * Define o valor da propriedade notes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotes(Boolean value) {
        this.notes = value;
    }

    /**
     * Obtém o valor da propriedade options.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptions() {
        return options;
    }

    /**
     * Define o valor da propriedade options.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptions(Boolean value) {
        this.options = value;
    }

    /**
     * Obtém o valor da propriedade priorityOptionsPriority.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriorityOptionsPriority() {
        return priorityOptionsPriority;
    }

    /**
     * Define o valor da propriedade priorityOptionsPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriorityOptionsPriority(Boolean value) {
        this.priorityOptionsPriority = value;
    }

    /**
     * Obtém o valor da propriedade userEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserEntityKeys() {
        return userEntityKeys;
    }

    /**
     * Define o valor da propriedade userEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserEntityKeys(Boolean value) {
        this.userEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerEntityKeys() {
        return workerEntityKeys;
    }

    /**
     * Define o valor da propriedade workerEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerEntityKeys(Boolean value) {
        this.workerEntityKeys = value;
    }

}
