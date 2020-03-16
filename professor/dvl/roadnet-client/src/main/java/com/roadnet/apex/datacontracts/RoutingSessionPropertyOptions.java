
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoutingSessionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutingSessionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeekFlags_BusinessWeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasBusinessWeekOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTimeUnits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionMode_Mode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_TimeUnitType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingSessionPropertyOptions", propOrder = {
    "dayOfWeekFlagsBusinessWeek",
    "depotEntityKey",
    "description",
    "hasBusinessWeekOverride",
    "numberOfTimeUnits",
    "sessionModeMode",
    "startDate",
    "timeUnitTimeUnitType"
})
@XmlSeeAlso({
    StrategicRoutingSessionPropertyOptions.class,
    DailyRoutingSessionPropertyOptions.class
})
public class RoutingSessionPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "DayOfWeekFlags_BusinessWeek")
    protected Boolean dayOfWeekFlagsBusinessWeek;
    @XmlElement(name = "DepotEntityKey")
    protected Boolean depotEntityKey;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "HasBusinessWeekOverride")
    protected Boolean hasBusinessWeekOverride;
    @XmlElement(name = "NumberOfTimeUnits")
    protected Boolean numberOfTimeUnits;
    @XmlElement(name = "SessionMode_Mode")
    protected Boolean sessionModeMode;
    @XmlElement(name = "StartDate")
    protected Boolean startDate;
    @XmlElement(name = "TimeUnit_TimeUnitType")
    protected Boolean timeUnitTimeUnitType;

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsBusinessWeek.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayOfWeekFlagsBusinessWeek() {
        return dayOfWeekFlagsBusinessWeek;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsBusinessWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayOfWeekFlagsBusinessWeek(Boolean value) {
        this.dayOfWeekFlagsBusinessWeek = value;
    }

    /**
     * Obtém o valor da propriedade depotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotEntityKey() {
        return depotEntityKey;
    }

    /**
     * Define o valor da propriedade depotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotEntityKey(Boolean value) {
        this.depotEntityKey = value;
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
     * Obtém o valor da propriedade hasBusinessWeekOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBusinessWeekOverride() {
        return hasBusinessWeekOverride;
    }

    /**
     * Define o valor da propriedade hasBusinessWeekOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBusinessWeekOverride(Boolean value) {
        this.hasBusinessWeekOverride = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTimeUnits.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfTimeUnits() {
        return numberOfTimeUnits;
    }

    /**
     * Define o valor da propriedade numberOfTimeUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfTimeUnits(Boolean value) {
        this.numberOfTimeUnits = value;
    }

    /**
     * Obtém o valor da propriedade sessionModeMode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionModeMode() {
        return sessionModeMode;
    }

    /**
     * Define o valor da propriedade sessionModeMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionModeMode(Boolean value) {
        this.sessionModeMode = value;
    }

    /**
     * Obtém o valor da propriedade startDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartDate() {
        return startDate;
    }

    /**
     * Define o valor da propriedade startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartDate(Boolean value) {
        this.startDate = value;
    }

    /**
     * Obtém o valor da propriedade timeUnitTimeUnitType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeUnitTimeUnitType() {
        return timeUnitTimeUnitType;
    }

    /**
     * Define o valor da propriedade timeUnitTimeUnitType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeUnitTimeUnitType(Boolean value) {
        this.timeUnitTimeUnitType = value;
    }

}
