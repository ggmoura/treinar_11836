
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServicePatternPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServicePatternPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeekFlags_DaysOfWeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTimeUnitsInPattern" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfVisits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfWeeksInPattern" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PercentQuantitiesPerVisit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternType_PatternType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "ServicePatternPropertyOptions", propOrder = {
    "dayOfWeekFlagsDaysOfWeek",
    "description",
    "identifier",
    "isDeleted",
    "numberOfTimeUnitsInPattern",
    "numberOfVisits",
    "numberOfWeeksInPattern",
    "percentQuantitiesPerVisit",
    "servicePatternTypePatternType",
    "timeUnitTimeUnitType"
})
public class ServicePatternPropertyOptions
    extends BusinessUnitBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "DayOfWeekFlags_DaysOfWeek")
    protected Boolean dayOfWeekFlagsDaysOfWeek;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "NumberOfTimeUnitsInPattern")
    protected Boolean numberOfTimeUnitsInPattern;
    @XmlElement(name = "NumberOfVisits")
    protected Boolean numberOfVisits;
    @XmlElement(name = "NumberOfWeeksInPattern")
    protected Boolean numberOfWeeksInPattern;
    @XmlElement(name = "PercentQuantitiesPerVisit")
    protected Boolean percentQuantitiesPerVisit;
    @XmlElement(name = "ServicePatternType_PatternType")
    protected Boolean servicePatternTypePatternType;
    @XmlElement(name = "TimeUnit_TimeUnitType")
    protected Boolean timeUnitTimeUnitType;

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsDaysOfWeek.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayOfWeekFlagsDaysOfWeek() {
        return dayOfWeekFlagsDaysOfWeek;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsDaysOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayOfWeekFlagsDaysOfWeek(Boolean value) {
        this.dayOfWeekFlagsDaysOfWeek = value;
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
     * Obtém o valor da propriedade numberOfTimeUnitsInPattern.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfTimeUnitsInPattern() {
        return numberOfTimeUnitsInPattern;
    }

    /**
     * Define o valor da propriedade numberOfTimeUnitsInPattern.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfTimeUnitsInPattern(Boolean value) {
        this.numberOfTimeUnitsInPattern = value;
    }

    /**
     * Obtém o valor da propriedade numberOfVisits.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfVisits() {
        return numberOfVisits;
    }

    /**
     * Define o valor da propriedade numberOfVisits.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfVisits(Boolean value) {
        this.numberOfVisits = value;
    }

    /**
     * Obtém o valor da propriedade numberOfWeeksInPattern.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfWeeksInPattern() {
        return numberOfWeeksInPattern;
    }

    /**
     * Define o valor da propriedade numberOfWeeksInPattern.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfWeeksInPattern(Boolean value) {
        this.numberOfWeeksInPattern = value;
    }

    /**
     * Obtém o valor da propriedade percentQuantitiesPerVisit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPercentQuantitiesPerVisit() {
        return percentQuantitiesPerVisit;
    }

    /**
     * Define o valor da propriedade percentQuantitiesPerVisit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPercentQuantitiesPerVisit(Boolean value) {
        this.percentQuantitiesPerVisit = value;
    }

    /**
     * Obtém o valor da propriedade servicePatternTypePatternType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServicePatternTypePatternType() {
        return servicePatternTypePatternType;
    }

    /**
     * Define o valor da propriedade servicePatternTypePatternType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServicePatternTypePatternType(Boolean value) {
        this.servicePatternTypePatternType = value;
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
