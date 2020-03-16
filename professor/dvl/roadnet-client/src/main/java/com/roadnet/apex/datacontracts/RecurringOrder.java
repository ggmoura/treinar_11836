
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de RecurringOrder complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RecurringOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}OrderBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnchorDaysRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AnchorWeeksRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CurrentServicePatternEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CycleNumberOfTimeUnits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_PreviousDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedNumberOfStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="IsConsideredForAssignDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxDaysServiceGap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinDaysServiceGap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfDaysToShift" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="PreviousDeliveryWeeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousOriginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTerritoryIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousVisitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PreviousWeek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ShouldConsiderPreviousVisit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorWeeks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_CycleTimeUnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringOrder", propOrder = {
    "anchorDaysRange",
    "anchorWeeksRange",
    "currentServicePatternEntityKey",
    "cycleNumberOfTimeUnits",
    "dayOfWeekFlagsPreviousDays",
    "estimatedNumberOfStops",
    "estimatedServiceTime",
    "isConsideredForAssignDays",
    "maxDaysServiceGap",
    "minDaysServiceGap",
    "numberOfDaysToShift",
    "openCloseDetails",
    "previousDeliveryWeeks",
    "previousOriginId",
    "previousTerritoryIds",
    "previousVisitDate",
    "previousWeek",
    "servicePatternSetEntityKey",
    "serviceWindowDetails",
    "sessionEntityKey",
    "shouldConsiderPreviousVisit",
    "shouldUseAnchorDays",
    "shouldUseAnchorWeeks",
    "territoryEntityKeys",
    "timeUnitCycleTimeUnitType"
})
public class RecurringOrder
    extends OrderBase
{

    @XmlElement(name = "AnchorDaysRange")
    protected Integer anchorDaysRange;
    @XmlElement(name = "AnchorWeeksRange")
    protected Integer anchorWeeksRange;
    @XmlElementRef(name = "CurrentServicePatternEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> currentServicePatternEntityKey;
    @XmlElement(name = "CycleNumberOfTimeUnits")
    protected Integer cycleNumberOfTimeUnits;
    @XmlElementRef(name = "DayOfWeekFlags_PreviousDays", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsPreviousDays;
    @XmlElement(name = "EstimatedNumberOfStops")
    protected Integer estimatedNumberOfStops;
    @XmlElement(name = "EstimatedServiceTime")
    protected Duration estimatedServiceTime;
    @XmlElement(name = "IsConsideredForAssignDays")
    protected Boolean isConsideredForAssignDays;
    @XmlElement(name = "MaxDaysServiceGap")
    protected Integer maxDaysServiceGap;
    @XmlElement(name = "MinDaysServiceGap")
    protected Integer minDaysServiceGap;
    @XmlElement(name = "NumberOfDaysToShift")
    protected Integer numberOfDaysToShift;
    @XmlElementRef(name = "OpenCloseDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderOpenCloseDetail> openCloseDetails;
    @XmlElementRef(name = "PreviousDeliveryWeeks", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousDeliveryWeeks;
    @XmlElementRef(name = "PreviousOriginId", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousOriginId;
    @XmlElementRef(name = "PreviousTerritoryIds", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousTerritoryIds;
    @XmlElementRef(name = "PreviousVisitDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> previousVisitDate;
    @XmlElement(name = "PreviousWeek")
    protected Integer previousWeek;
    @XmlElementRef(name = "ServicePatternSetEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> servicePatternSetEntityKey;
    @XmlElementRef(name = "ServiceWindowDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderServiceWindowDetail> serviceWindowDetails;
    @XmlElement(name = "SessionEntityKey")
    protected Long sessionEntityKey;
    @XmlElement(name = "ShouldConsiderPreviousVisit")
    protected Boolean shouldConsiderPreviousVisit;
    @XmlElement(name = "ShouldUseAnchorDays")
    protected Boolean shouldUseAnchorDays;
    @XmlElement(name = "ShouldUseAnchorWeeks")
    protected Boolean shouldUseAnchorWeeks;
    @XmlElementRef(name = "TerritoryEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> territoryEntityKeys;
    @XmlElementRef(name = "TimeUnit_CycleTimeUnitType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeUnitCycleTimeUnitType;

    /**
     * Obtém o valor da propriedade anchorDaysRange.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnchorDaysRange() {
        return anchorDaysRange;
    }

    /**
     * Define o valor da propriedade anchorDaysRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnchorDaysRange(Integer value) {
        this.anchorDaysRange = value;
    }

    /**
     * Obtém o valor da propriedade anchorWeeksRange.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnchorWeeksRange() {
        return anchorWeeksRange;
    }

    /**
     * Define o valor da propriedade anchorWeeksRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnchorWeeksRange(Integer value) {
        this.anchorWeeksRange = value;
    }

    /**
     * Obtém o valor da propriedade currentServicePatternEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCurrentServicePatternEntityKey() {
        return currentServicePatternEntityKey;
    }

    /**
     * Define o valor da propriedade currentServicePatternEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCurrentServicePatternEntityKey(JAXBElement<Long> value) {
        this.currentServicePatternEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade cycleNumberOfTimeUnits.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCycleNumberOfTimeUnits() {
        return cycleNumberOfTimeUnits;
    }

    /**
     * Define o valor da propriedade cycleNumberOfTimeUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCycleNumberOfTimeUnits(Integer value) {
        this.cycleNumberOfTimeUnits = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsPreviousDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlagsPreviousDays() {
        return dayOfWeekFlagsPreviousDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsPreviousDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlagsPreviousDays(JAXBElement<String> value) {
        this.dayOfWeekFlagsPreviousDays = value;
    }

    /**
     * Obtém o valor da propriedade estimatedNumberOfStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstimatedNumberOfStops() {
        return estimatedNumberOfStops;
    }

    /**
     * Define o valor da propriedade estimatedNumberOfStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstimatedNumberOfStops(Integer value) {
        this.estimatedNumberOfStops = value;
    }

    /**
     * Obtém o valor da propriedade estimatedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedServiceTime() {
        return estimatedServiceTime;
    }

    /**
     * Define o valor da propriedade estimatedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEstimatedServiceTime(Duration value) {
        this.estimatedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade isConsideredForAssignDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConsideredForAssignDays() {
        return isConsideredForAssignDays;
    }

    /**
     * Define o valor da propriedade isConsideredForAssignDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConsideredForAssignDays(Boolean value) {
        this.isConsideredForAssignDays = value;
    }

    /**
     * Obtém o valor da propriedade maxDaysServiceGap.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDaysServiceGap() {
        return maxDaysServiceGap;
    }

    /**
     * Define o valor da propriedade maxDaysServiceGap.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDaysServiceGap(Integer value) {
        this.maxDaysServiceGap = value;
    }

    /**
     * Obtém o valor da propriedade minDaysServiceGap.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinDaysServiceGap() {
        return minDaysServiceGap;
    }

    /**
     * Define o valor da propriedade minDaysServiceGap.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinDaysServiceGap(Integer value) {
        this.minDaysServiceGap = value;
    }

    /**
     * Obtém o valor da propriedade numberOfDaysToShift.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDaysToShift() {
        return numberOfDaysToShift;
    }

    /**
     * Define o valor da propriedade numberOfDaysToShift.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDaysToShift(Integer value) {
        this.numberOfDaysToShift = value;
    }

    /**
     * Obtém o valor da propriedade openCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderOpenCloseDetail> getOpenCloseDetails() {
        return openCloseDetails;
    }

    /**
     * Define o valor da propriedade openCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderOpenCloseDetail }{@code >}
     *     
     */
    public void setOpenCloseDetails(JAXBElement<ArrayOfOrderOpenCloseDetail> value) {
        this.openCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade previousDeliveryWeeks.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousDeliveryWeeks() {
        return previousDeliveryWeeks;
    }

    /**
     * Define o valor da propriedade previousDeliveryWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousDeliveryWeeks(JAXBElement<String> value) {
        this.previousDeliveryWeeks = value;
    }

    /**
     * Obtém o valor da propriedade previousOriginId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousOriginId() {
        return previousOriginId;
    }

    /**
     * Define o valor da propriedade previousOriginId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousOriginId(JAXBElement<String> value) {
        this.previousOriginId = value;
    }

    /**
     * Obtém o valor da propriedade previousTerritoryIds.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousTerritoryIds() {
        return previousTerritoryIds;
    }

    /**
     * Define o valor da propriedade previousTerritoryIds.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousTerritoryIds(JAXBElement<String> value) {
        this.previousTerritoryIds = value;
    }

    /**
     * Obtém o valor da propriedade previousVisitDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPreviousVisitDate() {
        return previousVisitDate;
    }

    /**
     * Define o valor da propriedade previousVisitDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPreviousVisitDate(JAXBElement<XMLGregorianCalendar> value) {
        this.previousVisitDate = value;
    }

    /**
     * Obtém o valor da propriedade previousWeek.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousWeek() {
        return previousWeek;
    }

    /**
     * Define o valor da propriedade previousWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousWeek(Integer value) {
        this.previousWeek = value;
    }

    /**
     * Obtém o valor da propriedade servicePatternSetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServicePatternSetEntityKey() {
        return servicePatternSetEntityKey;
    }

    /**
     * Define o valor da propriedade servicePatternSetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServicePatternSetEntityKey(JAXBElement<Long> value) {
        this.servicePatternSetEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderServiceWindowDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderServiceWindowDetail> getServiceWindowDetails() {
        return serviceWindowDetails;
    }

    /**
     * Define o valor da propriedade serviceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderServiceWindowDetail }{@code >}
     *     
     */
    public void setServiceWindowDetails(JAXBElement<ArrayOfOrderServiceWindowDetail> value) {
        this.serviceWindowDetails = value;
    }

    /**
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionEntityKey(Long value) {
        this.sessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade shouldConsiderPreviousVisit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldConsiderPreviousVisit() {
        return shouldConsiderPreviousVisit;
    }

    /**
     * Define o valor da propriedade shouldConsiderPreviousVisit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldConsiderPreviousVisit(Boolean value) {
        this.shouldConsiderPreviousVisit = value;
    }

    /**
     * Obtém o valor da propriedade shouldUseAnchorDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldUseAnchorDays() {
        return shouldUseAnchorDays;
    }

    /**
     * Define o valor da propriedade shouldUseAnchorDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldUseAnchorDays(Boolean value) {
        this.shouldUseAnchorDays = value;
    }

    /**
     * Obtém o valor da propriedade shouldUseAnchorWeeks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldUseAnchorWeeks() {
        return shouldUseAnchorWeeks;
    }

    /**
     * Define o valor da propriedade shouldUseAnchorWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldUseAnchorWeeks(Boolean value) {
        this.shouldUseAnchorWeeks = value;
    }

    /**
     * Obtém o valor da propriedade territoryEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getTerritoryEntityKeys() {
        return territoryEntityKeys;
    }

    /**
     * Define o valor da propriedade territoryEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setTerritoryEntityKeys(JAXBElement<ArrayOflong> value) {
        this.territoryEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade timeUnitCycleTimeUnitType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeUnitCycleTimeUnitType() {
        return timeUnitCycleTimeUnitType;
    }

    /**
     * Define o valor da propriedade timeUnitCycleTimeUnitType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeUnitCycleTimeUnitType(JAXBElement<String> value) {
        this.timeUnitCycleTimeUnitType = value;
    }

}
