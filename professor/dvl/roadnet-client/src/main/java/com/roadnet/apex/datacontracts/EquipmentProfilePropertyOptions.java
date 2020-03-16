
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EquipmentProfilePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentProfilePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableMobileSpeedingAlerts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExcessiveOverSpeedMinimumDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExcessiveOverSpeedThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxCooldownTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxWarmupTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinCooldownTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinWarmupTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileSpeedingAlertMaxRepeats" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileSpeedingAlertRepeatInterval" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverSpeedMinimumDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverSpeedThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentProfilePropertyOptions", propOrder = {
    "description",
    "enableMobileSpeedingAlerts",
    "excessiveOverSpeedMinimumDuration",
    "excessiveOverSpeedThreshold",
    "identifier",
    "isDeleted",
    "maxCooldownTime",
    "maxWarmupTime",
    "minCooldownTime",
    "minWarmupTime",
    "mobileSpeedingAlertMaxRepeats",
    "mobileSpeedingAlertRepeatInterval",
    "overSpeedMinimumDuration",
    "overSpeedThreshold"
})
public class EquipmentProfilePropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EnableMobileSpeedingAlerts")
    protected Boolean enableMobileSpeedingAlerts;
    @XmlElement(name = "ExcessiveOverSpeedMinimumDuration")
    protected Boolean excessiveOverSpeedMinimumDuration;
    @XmlElement(name = "ExcessiveOverSpeedThreshold")
    protected Boolean excessiveOverSpeedThreshold;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "MaxCooldownTime")
    protected Boolean maxCooldownTime;
    @XmlElement(name = "MaxWarmupTime")
    protected Boolean maxWarmupTime;
    @XmlElement(name = "MinCooldownTime")
    protected Boolean minCooldownTime;
    @XmlElement(name = "MinWarmupTime")
    protected Boolean minWarmupTime;
    @XmlElement(name = "MobileSpeedingAlertMaxRepeats")
    protected Boolean mobileSpeedingAlertMaxRepeats;
    @XmlElement(name = "MobileSpeedingAlertRepeatInterval")
    protected Boolean mobileSpeedingAlertRepeatInterval;
    @XmlElement(name = "OverSpeedMinimumDuration")
    protected Boolean overSpeedMinimumDuration;
    @XmlElement(name = "OverSpeedThreshold")
    protected Boolean overSpeedThreshold;

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
     * Obtém o valor da propriedade enableMobileSpeedingAlerts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableMobileSpeedingAlerts() {
        return enableMobileSpeedingAlerts;
    }

    /**
     * Define o valor da propriedade enableMobileSpeedingAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableMobileSpeedingAlerts(Boolean value) {
        this.enableMobileSpeedingAlerts = value;
    }

    /**
     * Obtém o valor da propriedade excessiveOverSpeedMinimumDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcessiveOverSpeedMinimumDuration() {
        return excessiveOverSpeedMinimumDuration;
    }

    /**
     * Define o valor da propriedade excessiveOverSpeedMinimumDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcessiveOverSpeedMinimumDuration(Boolean value) {
        this.excessiveOverSpeedMinimumDuration = value;
    }

    /**
     * Obtém o valor da propriedade excessiveOverSpeedThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcessiveOverSpeedThreshold() {
        return excessiveOverSpeedThreshold;
    }

    /**
     * Define o valor da propriedade excessiveOverSpeedThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcessiveOverSpeedThreshold(Boolean value) {
        this.excessiveOverSpeedThreshold = value;
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
     * Obtém o valor da propriedade maxCooldownTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxCooldownTime() {
        return maxCooldownTime;
    }

    /**
     * Define o valor da propriedade maxCooldownTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxCooldownTime(Boolean value) {
        this.maxCooldownTime = value;
    }

    /**
     * Obtém o valor da propriedade maxWarmupTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxWarmupTime() {
        return maxWarmupTime;
    }

    /**
     * Define o valor da propriedade maxWarmupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxWarmupTime(Boolean value) {
        this.maxWarmupTime = value;
    }

    /**
     * Obtém o valor da propriedade minCooldownTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinCooldownTime() {
        return minCooldownTime;
    }

    /**
     * Define o valor da propriedade minCooldownTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinCooldownTime(Boolean value) {
        this.minCooldownTime = value;
    }

    /**
     * Obtém o valor da propriedade minWarmupTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinWarmupTime() {
        return minWarmupTime;
    }

    /**
     * Define o valor da propriedade minWarmupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinWarmupTime(Boolean value) {
        this.minWarmupTime = value;
    }

    /**
     * Obtém o valor da propriedade mobileSpeedingAlertMaxRepeats.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileSpeedingAlertMaxRepeats() {
        return mobileSpeedingAlertMaxRepeats;
    }

    /**
     * Define o valor da propriedade mobileSpeedingAlertMaxRepeats.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileSpeedingAlertMaxRepeats(Boolean value) {
        this.mobileSpeedingAlertMaxRepeats = value;
    }

    /**
     * Obtém o valor da propriedade mobileSpeedingAlertRepeatInterval.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileSpeedingAlertRepeatInterval() {
        return mobileSpeedingAlertRepeatInterval;
    }

    /**
     * Define o valor da propriedade mobileSpeedingAlertRepeatInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileSpeedingAlertRepeatInterval(Boolean value) {
        this.mobileSpeedingAlertRepeatInterval = value;
    }

    /**
     * Obtém o valor da propriedade overSpeedMinimumDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverSpeedMinimumDuration() {
        return overSpeedMinimumDuration;
    }

    /**
     * Define o valor da propriedade overSpeedMinimumDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverSpeedMinimumDuration(Boolean value) {
        this.overSpeedMinimumDuration = value;
    }

    /**
     * Obtém o valor da propriedade overSpeedThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverSpeedThreshold() {
        return overSpeedThreshold;
    }

    /**
     * Define o valor da propriedade overSpeedThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverSpeedThreshold(Boolean value) {
        this.overSpeedThreshold = value;
    }

}
