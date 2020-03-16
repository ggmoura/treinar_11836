
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de EquipmentProfile complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnableMobileSpeedingAlerts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExcessiveOverSpeedMinimumDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ExcessiveOverSpeedThreshold" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxCooldownTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MaxWarmupTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinCooldownTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinWarmupTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MobileSpeedingAlertMaxRepeats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MobileSpeedingAlertRepeatInterval" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OverSpeedMinimumDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OverSpeedThreshold" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentProfile", propOrder = {
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
public class EquipmentProfile
    extends VisibleInMultipleRegionsAggregateRootEntity
{

    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "EnableMobileSpeedingAlerts")
    protected Boolean enableMobileSpeedingAlerts;
    @XmlElement(name = "ExcessiveOverSpeedMinimumDuration")
    protected Duration excessiveOverSpeedMinimumDuration;
    @XmlElementRef(name = "ExcessiveOverSpeedThreshold", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> excessiveOverSpeedThreshold;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "MaxCooldownTime")
    protected Duration maxCooldownTime;
    @XmlElement(name = "MaxWarmupTime")
    protected Duration maxWarmupTime;
    @XmlElement(name = "MinCooldownTime")
    protected Duration minCooldownTime;
    @XmlElement(name = "MinWarmupTime")
    protected Duration minWarmupTime;
    @XmlElement(name = "MobileSpeedingAlertMaxRepeats")
    protected Integer mobileSpeedingAlertMaxRepeats;
    @XmlElement(name = "MobileSpeedingAlertRepeatInterval")
    protected Duration mobileSpeedingAlertRepeatInterval;
    @XmlElement(name = "OverSpeedMinimumDuration")
    protected Duration overSpeedMinimumDuration;
    @XmlElementRef(name = "OverSpeedThreshold", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> overSpeedThreshold;

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
     *     {@link Duration }
     *     
     */
    public Duration getExcessiveOverSpeedMinimumDuration() {
        return excessiveOverSpeedMinimumDuration;
    }

    /**
     * Define o valor da propriedade excessiveOverSpeedMinimumDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExcessiveOverSpeedMinimumDuration(Duration value) {
        this.excessiveOverSpeedMinimumDuration = value;
    }

    /**
     * Obtém o valor da propriedade excessiveOverSpeedThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getExcessiveOverSpeedThreshold() {
        return excessiveOverSpeedThreshold;
    }

    /**
     * Define o valor da propriedade excessiveOverSpeedThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setExcessiveOverSpeedThreshold(JAXBElement<Speed> value) {
        this.excessiveOverSpeedThreshold = value;
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
     * Obtém o valor da propriedade maxCooldownTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaxCooldownTime() {
        return maxCooldownTime;
    }

    /**
     * Define o valor da propriedade maxCooldownTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaxCooldownTime(Duration value) {
        this.maxCooldownTime = value;
    }

    /**
     * Obtém o valor da propriedade maxWarmupTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaxWarmupTime() {
        return maxWarmupTime;
    }

    /**
     * Define o valor da propriedade maxWarmupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaxWarmupTime(Duration value) {
        this.maxWarmupTime = value;
    }

    /**
     * Obtém o valor da propriedade minCooldownTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinCooldownTime() {
        return minCooldownTime;
    }

    /**
     * Define o valor da propriedade minCooldownTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinCooldownTime(Duration value) {
        this.minCooldownTime = value;
    }

    /**
     * Obtém o valor da propriedade minWarmupTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinWarmupTime() {
        return minWarmupTime;
    }

    /**
     * Define o valor da propriedade minWarmupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinWarmupTime(Duration value) {
        this.minWarmupTime = value;
    }

    /**
     * Obtém o valor da propriedade mobileSpeedingAlertMaxRepeats.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMobileSpeedingAlertMaxRepeats() {
        return mobileSpeedingAlertMaxRepeats;
    }

    /**
     * Define o valor da propriedade mobileSpeedingAlertMaxRepeats.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMobileSpeedingAlertMaxRepeats(Integer value) {
        this.mobileSpeedingAlertMaxRepeats = value;
    }

    /**
     * Obtém o valor da propriedade mobileSpeedingAlertRepeatInterval.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMobileSpeedingAlertRepeatInterval() {
        return mobileSpeedingAlertRepeatInterval;
    }

    /**
     * Define o valor da propriedade mobileSpeedingAlertRepeatInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMobileSpeedingAlertRepeatInterval(Duration value) {
        this.mobileSpeedingAlertRepeatInterval = value;
    }

    /**
     * Obtém o valor da propriedade overSpeedMinimumDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOverSpeedMinimumDuration() {
        return overSpeedMinimumDuration;
    }

    /**
     * Define o valor da propriedade overSpeedMinimumDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOverSpeedMinimumDuration(Duration value) {
        this.overSpeedMinimumDuration = value;
    }

    /**
     * Obtém o valor da propriedade overSpeedThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getOverSpeedThreshold() {
        return overSpeedThreshold;
    }

    /**
     * Define o valor da propriedade overSpeedThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setOverSpeedThreshold(JAXBElement<Speed> value) {
        this.overSpeedThreshold = value;
    }

}
