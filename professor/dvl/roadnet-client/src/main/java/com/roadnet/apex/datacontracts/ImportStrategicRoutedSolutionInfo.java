
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ImportStrategicRoutedSolutionInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportStrategicRoutedSolutionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveWeeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedPerUnitServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AnchorDaysRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AnchorWeeksRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateOverride" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="CurrentServicePatternEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_PreviousDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Driver1EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Driver2EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Equipment1EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Equipment2EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FridayQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FridayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Helper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsConsideredForAssignDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MondayQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MondayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfDaysToShift" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskOpenCloseOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Paid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PostRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreviousDeliveryWeeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousOriginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTerritoryIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousWeek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RequiredRouteOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Selector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskServiceWindowOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="SessionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorWeeks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SundayQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SundayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Week" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportStrategicRoutedSolutionInfo", propOrder = {
    "activeWeeks",
    "adjustedFixedServiceTime",
    "adjustedPerUnitServiceTime",
    "anchorDaysRange",
    "anchorWeeksRange",
    "coordinateOverride",
    "currentServicePatternEntityKey",
    "day",
    "dayOfWeekFlagsPreviousDays",
    "days",
    "deliveryQuantities",
    "driver1EntityKey",
    "driver2EntityKey",
    "duration",
    "equipment1EntityKey",
    "equipment2EntityKey",
    "forceBulkServiceTime",
    "fridayQty",
    "fridayStopSequenceNumber",
    "helper",
    "isConsideredForAssignDays",
    "lastStopIsDestination",
    "mondayQty",
    "mondayStopSequenceNumber",
    "numberOfDaysToShift",
    "openCloseOverrides",
    "orderClassEntityKey",
    "orderIdentifier",
    "originDepotEntityKey",
    "paid",
    "pickupQuantities",
    "postRouteTime",
    "preRouteTime",
    "previousDeliveryWeeks",
    "previousOriginId",
    "previousTerritoryIds",
    "previousWeek",
    "requiredRouteOriginEntityKey",
    "routeDescription",
    "routeIdentifier",
    "routeStartTime",
    "saturdayQty",
    "saturdayStopSequenceNumber",
    "selector",
    "serviceLocationEntityKey",
    "servicePatternSetEntityKey",
    "serviceWindowOverrides",
    "sessionDate",
    "shouldUseAnchorDays",
    "shouldUseAnchorWeeks",
    "stopSequenceNumber",
    "sundayQty",
    "sundayStopSequenceNumber",
    "territoryDescription",
    "territoryIdentifier",
    "thursdayQty",
    "thursdayStopSequenceNumber",
    "tuesdayQty",
    "tuesdayStopSequenceNumber",
    "uploadSelector",
    "wednesdayQty",
    "wednesdayStopSequenceNumber",
    "week"
})
public class ImportStrategicRoutedSolutionInfo
    extends AggregateRootEntity
{

    @XmlElementRef(name = "ActiveWeeks", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeWeeks;
    @XmlElementRef(name = "AdjustedFixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> adjustedFixedServiceTime;
    @XmlElementRef(name = "AdjustedPerUnitServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> adjustedPerUnitServiceTime;
    @XmlElement(name = "AnchorDaysRange")
    protected Integer anchorDaysRange;
    @XmlElement(name = "AnchorWeeksRange")
    protected Integer anchorWeeksRange;
    @XmlElementRef(name = "CoordinateOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinateOverride;
    @XmlElementRef(name = "CurrentServicePatternEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> currentServicePatternEntityKey;
    @XmlElementRef(name = "Day", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> day;
    @XmlElementRef(name = "DayOfWeekFlags_PreviousDays", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsPreviousDays;
    @XmlElementRef(name = "Days", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> days;
    @XmlElementRef(name = "DeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryQuantities;
    @XmlElementRef(name = "Driver1EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> driver1EntityKey;
    @XmlElementRef(name = "Driver2EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> driver2EntityKey;
    @XmlElementRef(name = "Duration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> duration;
    @XmlElementRef(name = "Equipment1EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipment1EntityKey;
    @XmlElementRef(name = "Equipment2EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipment2EntityKey;
    @XmlElement(name = "ForceBulkServiceTime")
    protected Boolean forceBulkServiceTime;
    @XmlElement(name = "FridayQty")
    protected Double fridayQty;
    @XmlElement(name = "FridayStopSequenceNumber")
    protected Integer fridayStopSequenceNumber;
    @XmlElement(name = "Helper")
    protected Boolean helper;
    @XmlElement(name = "IsConsideredForAssignDays")
    protected Boolean isConsideredForAssignDays;
    @XmlElement(name = "LastStopIsDestination")
    protected Boolean lastStopIsDestination;
    @XmlElement(name = "MondayQty")
    protected Double mondayQty;
    @XmlElement(name = "MondayStopSequenceNumber")
    protected Integer mondayStopSequenceNumber;
    @XmlElement(name = "NumberOfDaysToShift")
    protected Integer numberOfDaysToShift;
    @XmlElementRef(name = "OpenCloseOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> openCloseOverrides;
    @XmlElement(name = "OrderClassEntityKey")
    protected Long orderClassEntityKey;
    @XmlElementRef(name = "OrderIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderIdentifier;
    @XmlElement(name = "OriginDepotEntityKey")
    protected Long originDepotEntityKey;
    @XmlElementRef(name = "Paid", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> paid;
    @XmlElementRef(name = "PickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupQuantities;
    @XmlElement(name = "PostRouteTime")
    protected Duration postRouteTime;
    @XmlElement(name = "PreRouteTime")
    protected Duration preRouteTime;
    @XmlElementRef(name = "PreviousDeliveryWeeks", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousDeliveryWeeks;
    @XmlElementRef(name = "PreviousOriginId", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousOriginId;
    @XmlElementRef(name = "PreviousTerritoryIds", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousTerritoryIds;
    @XmlElement(name = "PreviousWeek")
    protected Integer previousWeek;
    @XmlElementRef(name = "RequiredRouteOriginEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requiredRouteOriginEntityKey;
    @XmlElementRef(name = "RouteDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeDescription;
    @XmlElementRef(name = "RouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeIdentifier;
    @XmlElementRef(name = "RouteStartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> routeStartTime;
    @XmlElement(name = "SaturdayQty")
    protected Double saturdayQty;
    @XmlElement(name = "SaturdayStopSequenceNumber")
    protected Integer saturdayStopSequenceNumber;
    @XmlElementRef(name = "Selector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> selector;
    @XmlElementRef(name = "ServiceLocationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceLocationEntityKey;
    @XmlElementRef(name = "ServicePatternSetEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> servicePatternSetEntityKey;
    @XmlElementRef(name = "ServiceWindowOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> serviceWindowOverrides;
    @XmlElementRef(name = "SessionDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sessionDate;
    @XmlElement(name = "ShouldUseAnchorDays")
    protected Boolean shouldUseAnchorDays;
    @XmlElement(name = "ShouldUseAnchorWeeks")
    protected Boolean shouldUseAnchorWeeks;
    @XmlElement(name = "StopSequenceNumber")
    protected Integer stopSequenceNumber;
    @XmlElement(name = "SundayQty")
    protected Double sundayQty;
    @XmlElement(name = "SundayStopSequenceNumber")
    protected Integer sundayStopSequenceNumber;
    @XmlElementRef(name = "TerritoryDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> territoryDescription;
    @XmlElementRef(name = "TerritoryIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> territoryIdentifier;
    @XmlElement(name = "ThursdayQty")
    protected Double thursdayQty;
    @XmlElement(name = "ThursdayStopSequenceNumber")
    protected Integer thursdayStopSequenceNumber;
    @XmlElement(name = "TuesdayQty")
    protected Double tuesdayQty;
    @XmlElement(name = "TuesdayStopSequenceNumber")
    protected Integer tuesdayStopSequenceNumber;
    @XmlElementRef(name = "UploadSelector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uploadSelector;
    @XmlElement(name = "WednesdayQty")
    protected Double wednesdayQty;
    @XmlElement(name = "WednesdayStopSequenceNumber")
    protected Integer wednesdayStopSequenceNumber;
    @XmlElement(name = "Week")
    protected Integer week;

    /**
     * Obtém o valor da propriedade activeWeeks.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveWeeks() {
        return activeWeeks;
    }

    /**
     * Define o valor da propriedade activeWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveWeeks(JAXBElement<String> value) {
        this.activeWeeks = value;
    }

    /**
     * Obtém o valor da propriedade adjustedFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getAdjustedFixedServiceTime() {
        return adjustedFixedServiceTime;
    }

    /**
     * Define o valor da propriedade adjustedFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setAdjustedFixedServiceTime(JAXBElement<Duration> value) {
        this.adjustedFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade adjustedPerUnitServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getAdjustedPerUnitServiceTime() {
        return adjustedPerUnitServiceTime;
    }

    /**
     * Define o valor da propriedade adjustedPerUnitServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setAdjustedPerUnitServiceTime(JAXBElement<Duration> value) {
        this.adjustedPerUnitServiceTime = value;
    }

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
     * Obtém o valor da propriedade coordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinateOverride() {
        return coordinateOverride;
    }

    /**
     * Define o valor da propriedade coordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinateOverride(JAXBElement<Coordinate> value) {
        this.coordinateOverride = value;
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
     * Obtém o valor da propriedade day.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDay() {
        return day;
    }

    /**
     * Define o valor da propriedade day.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDay(JAXBElement<String> value) {
        this.day = value;
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
     * Obtém o valor da propriedade days.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDays() {
        return days;
    }

    /**
     * Define o valor da propriedade days.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDays(JAXBElement<String> value) {
        this.days = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryQuantities() {
        return deliveryQuantities;
    }

    /**
     * Define o valor da propriedade deliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryQuantities(JAXBElement<Quantities> value) {
        this.deliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade driver1EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDriver1EntityKey() {
        return driver1EntityKey;
    }

    /**
     * Define o valor da propriedade driver1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDriver1EntityKey(JAXBElement<Long> value) {
        this.driver1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade driver2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDriver2EntityKey() {
        return driver2EntityKey;
    }

    /**
     * Define o valor da propriedade driver2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDriver2EntityKey(JAXBElement<Long> value) {
        this.driver2EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade duration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getDuration() {
        return duration;
    }

    /**
     * Define o valor da propriedade duration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setDuration(JAXBElement<Duration> value) {
        this.duration = value;
    }

    /**
     * Obtém o valor da propriedade equipment1EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipment1EntityKey() {
        return equipment1EntityKey;
    }

    /**
     * Define o valor da propriedade equipment1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipment1EntityKey(JAXBElement<Long> value) {
        this.equipment1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipment2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipment2EntityKey() {
        return equipment2EntityKey;
    }

    /**
     * Define o valor da propriedade equipment2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipment2EntityKey(JAXBElement<Long> value) {
        this.equipment2EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade forceBulkServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceBulkServiceTime() {
        return forceBulkServiceTime;
    }

    /**
     * Define o valor da propriedade forceBulkServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceBulkServiceTime(Boolean value) {
        this.forceBulkServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade fridayQty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFridayQty() {
        return fridayQty;
    }

    /**
     * Define o valor da propriedade fridayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFridayQty(Double value) {
        this.fridayQty = value;
    }

    /**
     * Obtém o valor da propriedade fridayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFridayStopSequenceNumber() {
        return fridayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade fridayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFridayStopSequenceNumber(Integer value) {
        this.fridayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade helper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHelper() {
        return helper;
    }

    /**
     * Define o valor da propriedade helper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHelper(Boolean value) {
        this.helper = value;
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
     * Obtém o valor da propriedade lastStopIsDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastStopIsDestination() {
        return lastStopIsDestination;
    }

    /**
     * Define o valor da propriedade lastStopIsDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastStopIsDestination(Boolean value) {
        this.lastStopIsDestination = value;
    }

    /**
     * Obtém o valor da propriedade mondayQty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMondayQty() {
        return mondayQty;
    }

    /**
     * Define o valor da propriedade mondayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMondayQty(Double value) {
        this.mondayQty = value;
    }

    /**
     * Obtém o valor da propriedade mondayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMondayStopSequenceNumber() {
        return mondayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade mondayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMondayStopSequenceNumber(Integer value) {
        this.mondayStopSequenceNumber = value;
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
     * Obtém o valor da propriedade openCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskOpenCloseOverrideDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> getOpenCloseOverrides() {
        return openCloseOverrides;
    }

    /**
     * Define o valor da propriedade openCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskOpenCloseOverrideDetail }{@code >}
     *     
     */
    public void setOpenCloseOverrides(JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> value) {
        this.openCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade orderClassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderClassEntityKey() {
        return orderClassEntityKey;
    }

    /**
     * Define o valor da propriedade orderClassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderClassEntityKey(Long value) {
        this.orderClassEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderIdentifier() {
        return orderIdentifier;
    }

    /**
     * Define o valor da propriedade orderIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderIdentifier(JAXBElement<String> value) {
        this.orderIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade originDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginDepotEntityKey() {
        return originDepotEntityKey;
    }

    /**
     * Define o valor da propriedade originDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginDepotEntityKey(Long value) {
        this.originDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade paid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPaid() {
        return paid;
    }

    /**
     * Define o valor da propriedade paid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPaid(JAXBElement<Boolean> value) {
        this.paid = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupQuantities() {
        return pickupQuantities;
    }

    /**
     * Define o valor da propriedade pickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupQuantities(JAXBElement<Quantities> value) {
        this.pickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade postRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPostRouteTime() {
        return postRouteTime;
    }

    /**
     * Define o valor da propriedade postRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPostRouteTime(Duration value) {
        this.postRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreRouteTime() {
        return preRouteTime;
    }

    /**
     * Define o valor da propriedade preRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreRouteTime(Duration value) {
        this.preRouteTime = value;
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
     * Obtém o valor da propriedade requiredRouteOriginEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequiredRouteOriginEntityKey() {
        return requiredRouteOriginEntityKey;
    }

    /**
     * Define o valor da propriedade requiredRouteOriginEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequiredRouteOriginEntityKey(JAXBElement<Long> value) {
        this.requiredRouteOriginEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteDescription() {
        return routeDescription;
    }

    /**
     * Define o valor da propriedade routeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteDescription(JAXBElement<String> value) {
        this.routeDescription = value;
    }

    /**
     * Obtém o valor da propriedade routeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteIdentifier() {
        return routeIdentifier;
    }

    /**
     * Define o valor da propriedade routeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteIdentifier(JAXBElement<String> value) {
        this.routeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade routeStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRouteStartTime() {
        return routeStartTime;
    }

    /**
     * Define o valor da propriedade routeStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRouteStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.routeStartTime = value;
    }

    /**
     * Obtém o valor da propriedade saturdayQty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaturdayQty() {
        return saturdayQty;
    }

    /**
     * Define o valor da propriedade saturdayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaturdayQty(Double value) {
        this.saturdayQty = value;
    }

    /**
     * Obtém o valor da propriedade saturdayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaturdayStopSequenceNumber() {
        return saturdayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade saturdayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaturdayStopSequenceNumber(Integer value) {
        this.saturdayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade selector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSelector() {
        return selector;
    }

    /**
     * Define o valor da propriedade selector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSelector(JAXBElement<Integer> value) {
        this.selector = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceLocationEntityKey() {
        return serviceLocationEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceLocationEntityKey(JAXBElement<Long> value) {
        this.serviceLocationEntityKey = value;
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
     * Obtém o valor da propriedade serviceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskServiceWindowOverrideDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> getServiceWindowOverrides() {
        return serviceWindowOverrides;
    }

    /**
     * Define o valor da propriedade serviceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskServiceWindowOverrideDetail }{@code >}
     *     
     */
    public void setServiceWindowOverrides(JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> value) {
        this.serviceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade sessionDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSessionDate() {
        return sessionDate;
    }

    /**
     * Define o valor da propriedade sessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSessionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.sessionDate = value;
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
     * Obtém o valor da propriedade stopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStopSequenceNumber() {
        return stopSequenceNumber;
    }

    /**
     * Define o valor da propriedade stopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStopSequenceNumber(Integer value) {
        this.stopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade sundayQty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSundayQty() {
        return sundayQty;
    }

    /**
     * Define o valor da propriedade sundayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSundayQty(Double value) {
        this.sundayQty = value;
    }

    /**
     * Obtém o valor da propriedade sundayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSundayStopSequenceNumber() {
        return sundayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade sundayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSundayStopSequenceNumber(Integer value) {
        this.sundayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade territoryDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerritoryDescription() {
        return territoryDescription;
    }

    /**
     * Define o valor da propriedade territoryDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerritoryDescription(JAXBElement<String> value) {
        this.territoryDescription = value;
    }

    /**
     * Obtém o valor da propriedade territoryIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerritoryIdentifier() {
        return territoryIdentifier;
    }

    /**
     * Define o valor da propriedade territoryIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerritoryIdentifier(JAXBElement<String> value) {
        this.territoryIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade thursdayQty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThursdayQty() {
        return thursdayQty;
    }

    /**
     * Define o valor da propriedade thursdayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThursdayQty(Double value) {
        this.thursdayQty = value;
    }

    /**
     * Obtém o valor da propriedade thursdayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThursdayStopSequenceNumber() {
        return thursdayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade thursdayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThursdayStopSequenceNumber(Integer value) {
        this.thursdayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade tuesdayQty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTuesdayQty() {
        return tuesdayQty;
    }

    /**
     * Define o valor da propriedade tuesdayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTuesdayQty(Double value) {
        this.tuesdayQty = value;
    }

    /**
     * Obtém o valor da propriedade tuesdayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTuesdayStopSequenceNumber() {
        return tuesdayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade tuesdayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTuesdayStopSequenceNumber(Integer value) {
        this.tuesdayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade uploadSelector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUploadSelector() {
        return uploadSelector;
    }

    /**
     * Define o valor da propriedade uploadSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUploadSelector(JAXBElement<Integer> value) {
        this.uploadSelector = value;
    }

    /**
     * Obtém o valor da propriedade wednesdayQty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWednesdayQty() {
        return wednesdayQty;
    }

    /**
     * Define o valor da propriedade wednesdayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWednesdayQty(Double value) {
        this.wednesdayQty = value;
    }

    /**
     * Obtém o valor da propriedade wednesdayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWednesdayStopSequenceNumber() {
        return wednesdayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade wednesdayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWednesdayStopSequenceNumber(Integer value) {
        this.wednesdayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade week.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeek() {
        return week;
    }

    /**
     * Define o valor da propriedade week.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeek(Integer value) {
        this.week = value;
    }

}
