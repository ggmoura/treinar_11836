
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ImportStrategicRoutedSolutionInfoPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportStrategicRoutedSolutionInfoPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveWeeks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedFixedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedPerUnitServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AnchorDaysRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AnchorWeeksRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentServicePatternEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_PreviousDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Days" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Driver1EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Driver2EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Equipment1EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Equipment2EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FridayQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FridayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Helper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsConsideredForAssignDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemsOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManagedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MondayQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MondayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfDaysToShift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Paid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PostRouteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreRouteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifierOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousDeliveryWeeks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousOriginId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTerritoryIds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousWeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequiredRouteOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Selector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="SessionDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorWeeks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SundayQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SundayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Week" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportStrategicRoutedSolutionInfoPropertyOptions", propOrder = {
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
    "lineItemsOptions",
    "managedByUserEntityKey",
    "mondayQty",
    "mondayStopSequenceNumber",
    "netRevenue",
    "numberOfDaysToShift",
    "openCloseOverrides",
    "openCloseOverridesOptions",
    "orderClassEntityKey",
    "orderIdentifier",
    "originDepotEntityKey",
    "paid",
    "pickupQuantities",
    "postRouteTime",
    "preRouteTime",
    "preferredRouteIdentifierOverride",
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
    "serviceWindowOverridesOptions",
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
public class ImportStrategicRoutedSolutionInfoPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "ActiveWeeks")
    protected Boolean activeWeeks;
    @XmlElement(name = "AdjustedFixedServiceTime")
    protected Boolean adjustedFixedServiceTime;
    @XmlElement(name = "AdjustedPerUnitServiceTime")
    protected Boolean adjustedPerUnitServiceTime;
    @XmlElement(name = "AnchorDaysRange")
    protected Boolean anchorDaysRange;
    @XmlElement(name = "AnchorWeeksRange")
    protected Boolean anchorWeeksRange;
    @XmlElement(name = "CoordinateOverride")
    protected Boolean coordinateOverride;
    @XmlElement(name = "CurrentServicePatternEntityKey")
    protected Boolean currentServicePatternEntityKey;
    @XmlElement(name = "Day")
    protected Boolean day;
    @XmlElement(name = "DayOfWeekFlags_PreviousDays")
    protected Boolean dayOfWeekFlagsPreviousDays;
    @XmlElement(name = "Days")
    protected Boolean days;
    @XmlElement(name = "DeliveryQuantities")
    protected Boolean deliveryQuantities;
    @XmlElement(name = "Driver1EntityKey")
    protected Boolean driver1EntityKey;
    @XmlElement(name = "Driver2EntityKey")
    protected Boolean driver2EntityKey;
    @XmlElement(name = "Duration")
    protected Boolean duration;
    @XmlElement(name = "Equipment1EntityKey")
    protected Boolean equipment1EntityKey;
    @XmlElement(name = "Equipment2EntityKey")
    protected Boolean equipment2EntityKey;
    @XmlElement(name = "ForceBulkServiceTime")
    protected Boolean forceBulkServiceTime;
    @XmlElement(name = "FridayQty")
    protected Boolean fridayQty;
    @XmlElement(name = "FridayStopSequenceNumber")
    protected Boolean fridayStopSequenceNumber;
    @XmlElement(name = "Helper")
    protected Boolean helper;
    @XmlElement(name = "IsConsideredForAssignDays")
    protected Boolean isConsideredForAssignDays;
    @XmlElement(name = "LastStopIsDestination")
    protected Boolean lastStopIsDestination;
    @XmlElement(name = "LineItemsOptions")
    protected Boolean lineItemsOptions;
    @XmlElement(name = "ManagedByUserEntityKey")
    protected Boolean managedByUserEntityKey;
    @XmlElement(name = "MondayQty")
    protected Boolean mondayQty;
    @XmlElement(name = "MondayStopSequenceNumber")
    protected Boolean mondayStopSequenceNumber;
    @XmlElement(name = "NetRevenue")
    protected Boolean netRevenue;
    @XmlElement(name = "NumberOfDaysToShift")
    protected Boolean numberOfDaysToShift;
    @XmlElement(name = "OpenCloseOverrides")
    protected Boolean openCloseOverrides;
    @XmlElementRef(name = "OpenCloseOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> openCloseOverridesOptions;
    @XmlElement(name = "OrderClassEntityKey")
    protected Boolean orderClassEntityKey;
    @XmlElement(name = "OrderIdentifier")
    protected Boolean orderIdentifier;
    @XmlElement(name = "OriginDepotEntityKey")
    protected Boolean originDepotEntityKey;
    @XmlElement(name = "Paid")
    protected Boolean paid;
    @XmlElement(name = "PickupQuantities")
    protected Boolean pickupQuantities;
    @XmlElement(name = "PostRouteTime")
    protected Boolean postRouteTime;
    @XmlElement(name = "PreRouteTime")
    protected Boolean preRouteTime;
    @XmlElement(name = "PreferredRouteIdentifierOverride")
    protected Boolean preferredRouteIdentifierOverride;
    @XmlElement(name = "PreviousDeliveryWeeks")
    protected Boolean previousDeliveryWeeks;
    @XmlElement(name = "PreviousOriginId")
    protected Boolean previousOriginId;
    @XmlElement(name = "PreviousTerritoryIds")
    protected Boolean previousTerritoryIds;
    @XmlElement(name = "PreviousWeek")
    protected Boolean previousWeek;
    @XmlElement(name = "RequiredRouteOriginEntityKey")
    protected Boolean requiredRouteOriginEntityKey;
    @XmlElement(name = "RouteDescription")
    protected Boolean routeDescription;
    @XmlElement(name = "RouteIdentifier")
    protected Boolean routeIdentifier;
    @XmlElement(name = "RouteStartTime")
    protected Boolean routeStartTime;
    @XmlElement(name = "SaturdayQty")
    protected Boolean saturdayQty;
    @XmlElement(name = "SaturdayStopSequenceNumber")
    protected Boolean saturdayStopSequenceNumber;
    @XmlElement(name = "Selector")
    protected Boolean selector;
    @XmlElement(name = "ServiceLocationEntityKey")
    protected Boolean serviceLocationEntityKey;
    @XmlElement(name = "ServicePatternSetEntityKey")
    protected Boolean servicePatternSetEntityKey;
    @XmlElement(name = "ServiceWindowOverrides")
    protected Boolean serviceWindowOverrides;
    @XmlElementRef(name = "ServiceWindowOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceWindowDetailPropertyOptions> serviceWindowOverridesOptions;
    @XmlElement(name = "SessionDate")
    protected Boolean sessionDate;
    @XmlElement(name = "ShouldUseAnchorDays")
    protected Boolean shouldUseAnchorDays;
    @XmlElement(name = "ShouldUseAnchorWeeks")
    protected Boolean shouldUseAnchorWeeks;
    @XmlElement(name = "StopSequenceNumber")
    protected Boolean stopSequenceNumber;
    @XmlElement(name = "SundayQty")
    protected Boolean sundayQty;
    @XmlElement(name = "SundayStopSequenceNumber")
    protected Boolean sundayStopSequenceNumber;
    @XmlElement(name = "TerritoryDescription")
    protected Boolean territoryDescription;
    @XmlElement(name = "TerritoryIdentifier")
    protected Boolean territoryIdentifier;
    @XmlElement(name = "ThursdayQty")
    protected Boolean thursdayQty;
    @XmlElement(name = "ThursdayStopSequenceNumber")
    protected Boolean thursdayStopSequenceNumber;
    @XmlElement(name = "TuesdayQty")
    protected Boolean tuesdayQty;
    @XmlElement(name = "TuesdayStopSequenceNumber")
    protected Boolean tuesdayStopSequenceNumber;
    @XmlElement(name = "UploadSelector")
    protected Boolean uploadSelector;
    @XmlElement(name = "WednesdayQty")
    protected Boolean wednesdayQty;
    @XmlElement(name = "WednesdayStopSequenceNumber")
    protected Boolean wednesdayStopSequenceNumber;
    @XmlElement(name = "Week")
    protected Boolean week;

    /**
     * Obtém o valor da propriedade activeWeeks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveWeeks() {
        return activeWeeks;
    }

    /**
     * Define o valor da propriedade activeWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveWeeks(Boolean value) {
        this.activeWeeks = value;
    }

    /**
     * Obtém o valor da propriedade adjustedFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustedFixedServiceTime() {
        return adjustedFixedServiceTime;
    }

    /**
     * Define o valor da propriedade adjustedFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedFixedServiceTime(Boolean value) {
        this.adjustedFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade adjustedPerUnitServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustedPerUnitServiceTime() {
        return adjustedPerUnitServiceTime;
    }

    /**
     * Define o valor da propriedade adjustedPerUnitServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustedPerUnitServiceTime(Boolean value) {
        this.adjustedPerUnitServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade anchorDaysRange.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnchorDaysRange() {
        return anchorDaysRange;
    }

    /**
     * Define o valor da propriedade anchorDaysRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnchorDaysRange(Boolean value) {
        this.anchorDaysRange = value;
    }

    /**
     * Obtém o valor da propriedade anchorWeeksRange.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnchorWeeksRange() {
        return anchorWeeksRange;
    }

    /**
     * Define o valor da propriedade anchorWeeksRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnchorWeeksRange(Boolean value) {
        this.anchorWeeksRange = value;
    }

    /**
     * Obtém o valor da propriedade coordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoordinateOverride() {
        return coordinateOverride;
    }

    /**
     * Define o valor da propriedade coordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoordinateOverride(Boolean value) {
        this.coordinateOverride = value;
    }

    /**
     * Obtém o valor da propriedade currentServicePatternEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentServicePatternEntityKey() {
        return currentServicePatternEntityKey;
    }

    /**
     * Define o valor da propriedade currentServicePatternEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentServicePatternEntityKey(Boolean value) {
        this.currentServicePatternEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade day.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDay() {
        return day;
    }

    /**
     * Define o valor da propriedade day.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDay(Boolean value) {
        this.day = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsPreviousDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayOfWeekFlagsPreviousDays() {
        return dayOfWeekFlagsPreviousDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsPreviousDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayOfWeekFlagsPreviousDays(Boolean value) {
        this.dayOfWeekFlagsPreviousDays = value;
    }

    /**
     * Obtém o valor da propriedade days.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDays() {
        return days;
    }

    /**
     * Define o valor da propriedade days.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDays(Boolean value) {
        this.days = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryQuantities() {
        return deliveryQuantities;
    }

    /**
     * Define o valor da propriedade deliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryQuantities(Boolean value) {
        this.deliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade driver1EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDriver1EntityKey() {
        return driver1EntityKey;
    }

    /**
     * Define o valor da propriedade driver1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriver1EntityKey(Boolean value) {
        this.driver1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade driver2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDriver2EntityKey() {
        return driver2EntityKey;
    }

    /**
     * Define o valor da propriedade driver2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriver2EntityKey(Boolean value) {
        this.driver2EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade duration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuration() {
        return duration;
    }

    /**
     * Define o valor da propriedade duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuration(Boolean value) {
        this.duration = value;
    }

    /**
     * Obtém o valor da propriedade equipment1EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipment1EntityKey() {
        return equipment1EntityKey;
    }

    /**
     * Define o valor da propriedade equipment1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipment1EntityKey(Boolean value) {
        this.equipment1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipment2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipment2EntityKey() {
        return equipment2EntityKey;
    }

    /**
     * Define o valor da propriedade equipment2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipment2EntityKey(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isFridayQty() {
        return fridayQty;
    }

    /**
     * Define o valor da propriedade fridayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFridayQty(Boolean value) {
        this.fridayQty = value;
    }

    /**
     * Obtém o valor da propriedade fridayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFridayStopSequenceNumber() {
        return fridayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade fridayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFridayStopSequenceNumber(Boolean value) {
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
     * Obtém o valor da propriedade lineItemsOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemsOptions() {
        return lineItemsOptions;
    }

    /**
     * Define o valor da propriedade lineItemsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemsOptions(Boolean value) {
        this.lineItemsOptions = value;
    }

    /**
     * Obtém o valor da propriedade managedByUserEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManagedByUserEntityKey() {
        return managedByUserEntityKey;
    }

    /**
     * Define o valor da propriedade managedByUserEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagedByUserEntityKey(Boolean value) {
        this.managedByUserEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mondayQty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMondayQty() {
        return mondayQty;
    }

    /**
     * Define o valor da propriedade mondayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMondayQty(Boolean value) {
        this.mondayQty = value;
    }

    /**
     * Obtém o valor da propriedade mondayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMondayStopSequenceNumber() {
        return mondayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade mondayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMondayStopSequenceNumber(Boolean value) {
        this.mondayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade netRevenue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetRevenue() {
        return netRevenue;
    }

    /**
     * Define o valor da propriedade netRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetRevenue(Boolean value) {
        this.netRevenue = value;
    }

    /**
     * Obtém o valor da propriedade numberOfDaysToShift.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfDaysToShift() {
        return numberOfDaysToShift;
    }

    /**
     * Define o valor da propriedade numberOfDaysToShift.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfDaysToShift(Boolean value) {
        this.numberOfDaysToShift = value;
    }

    /**
     * Obtém o valor da propriedade openCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenCloseOverrides() {
        return openCloseOverrides;
    }

    /**
     * Define o valor da propriedade openCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenCloseOverrides(Boolean value) {
        this.openCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade openCloseOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpenCloseDetailPropertyOptions> getOpenCloseOverridesOptions() {
        return openCloseOverridesOptions;
    }

    /**
     * Define o valor da propriedade openCloseOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setOpenCloseOverridesOptions(JAXBElement<OpenCloseDetailPropertyOptions> value) {
        this.openCloseOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade orderClassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderClassEntityKey() {
        return orderClassEntityKey;
    }

    /**
     * Define o valor da propriedade orderClassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderClassEntityKey(Boolean value) {
        this.orderClassEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderIdentifier() {
        return orderIdentifier;
    }

    /**
     * Define o valor da propriedade orderIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderIdentifier(Boolean value) {
        this.orderIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade originDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginDepotEntityKey() {
        return originDepotEntityKey;
    }

    /**
     * Define o valor da propriedade originDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginDepotEntityKey(Boolean value) {
        this.originDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade paid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaid() {
        return paid;
    }

    /**
     * Define o valor da propriedade paid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaid(Boolean value) {
        this.paid = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupQuantities() {
        return pickupQuantities;
    }

    /**
     * Define o valor da propriedade pickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupQuantities(Boolean value) {
        this.pickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade postRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostRouteTime() {
        return postRouteTime;
    }

    /**
     * Define o valor da propriedade postRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostRouteTime(Boolean value) {
        this.postRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreRouteTime() {
        return preRouteTime;
    }

    /**
     * Define o valor da propriedade preRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreRouteTime(Boolean value) {
        this.preRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preferredRouteIdentifierOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredRouteIdentifierOverride() {
        return preferredRouteIdentifierOverride;
    }

    /**
     * Define o valor da propriedade preferredRouteIdentifierOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredRouteIdentifierOverride(Boolean value) {
        this.preferredRouteIdentifierOverride = value;
    }

    /**
     * Obtém o valor da propriedade previousDeliveryWeeks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousDeliveryWeeks() {
        return previousDeliveryWeeks;
    }

    /**
     * Define o valor da propriedade previousDeliveryWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousDeliveryWeeks(Boolean value) {
        this.previousDeliveryWeeks = value;
    }

    /**
     * Obtém o valor da propriedade previousOriginId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousOriginId() {
        return previousOriginId;
    }

    /**
     * Define o valor da propriedade previousOriginId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousOriginId(Boolean value) {
        this.previousOriginId = value;
    }

    /**
     * Obtém o valor da propriedade previousTerritoryIds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousTerritoryIds() {
        return previousTerritoryIds;
    }

    /**
     * Define o valor da propriedade previousTerritoryIds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousTerritoryIds(Boolean value) {
        this.previousTerritoryIds = value;
    }

    /**
     * Obtém o valor da propriedade previousWeek.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousWeek() {
        return previousWeek;
    }

    /**
     * Define o valor da propriedade previousWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousWeek(Boolean value) {
        this.previousWeek = value;
    }

    /**
     * Obtém o valor da propriedade requiredRouteOriginEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredRouteOriginEntityKey() {
        return requiredRouteOriginEntityKey;
    }

    /**
     * Define o valor da propriedade requiredRouteOriginEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredRouteOriginEntityKey(Boolean value) {
        this.requiredRouteOriginEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteDescription() {
        return routeDescription;
    }

    /**
     * Define o valor da propriedade routeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteDescription(Boolean value) {
        this.routeDescription = value;
    }

    /**
     * Obtém o valor da propriedade routeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteIdentifier() {
        return routeIdentifier;
    }

    /**
     * Define o valor da propriedade routeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteIdentifier(Boolean value) {
        this.routeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade routeStartTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteStartTime() {
        return routeStartTime;
    }

    /**
     * Define o valor da propriedade routeStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteStartTime(Boolean value) {
        this.routeStartTime = value;
    }

    /**
     * Obtém o valor da propriedade saturdayQty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturdayQty() {
        return saturdayQty;
    }

    /**
     * Define o valor da propriedade saturdayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturdayQty(Boolean value) {
        this.saturdayQty = value;
    }

    /**
     * Obtém o valor da propriedade saturdayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturdayStopSequenceNumber() {
        return saturdayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade saturdayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturdayStopSequenceNumber(Boolean value) {
        this.saturdayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade selector.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelector() {
        return selector;
    }

    /**
     * Define o valor da propriedade selector.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelector(Boolean value) {
        this.selector = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationEntityKey() {
        return serviceLocationEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationEntityKey(Boolean value) {
        this.serviceLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade servicePatternSetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServicePatternSetEntityKey() {
        return servicePatternSetEntityKey;
    }

    /**
     * Define o valor da propriedade servicePatternSetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServicePatternSetEntityKey(Boolean value) {
        this.servicePatternSetEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceWindowOverrides() {
        return serviceWindowOverrides;
    }

    /**
     * Define o valor da propriedade serviceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceWindowOverrides(Boolean value) {
        this.serviceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceWindowDetailPropertyOptions> getServiceWindowOverridesOptions() {
        return serviceWindowOverridesOptions;
    }

    /**
     * Define o valor da propriedade serviceWindowOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceWindowOverridesOptions(JAXBElement<ServiceWindowDetailPropertyOptions> value) {
        this.serviceWindowOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade sessionDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionDate() {
        return sessionDate;
    }

    /**
     * Define o valor da propriedade sessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionDate(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isStopSequenceNumber() {
        return stopSequenceNumber;
    }

    /**
     * Define o valor da propriedade stopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopSequenceNumber(Boolean value) {
        this.stopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade sundayQty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSundayQty() {
        return sundayQty;
    }

    /**
     * Define o valor da propriedade sundayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSundayQty(Boolean value) {
        this.sundayQty = value;
    }

    /**
     * Obtém o valor da propriedade sundayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSundayStopSequenceNumber() {
        return sundayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade sundayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSundayStopSequenceNumber(Boolean value) {
        this.sundayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade territoryDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerritoryDescription() {
        return territoryDescription;
    }

    /**
     * Define o valor da propriedade territoryDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerritoryDescription(Boolean value) {
        this.territoryDescription = value;
    }

    /**
     * Obtém o valor da propriedade territoryIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerritoryIdentifier() {
        return territoryIdentifier;
    }

    /**
     * Define o valor da propriedade territoryIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerritoryIdentifier(Boolean value) {
        this.territoryIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade thursdayQty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThursdayQty() {
        return thursdayQty;
    }

    /**
     * Define o valor da propriedade thursdayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThursdayQty(Boolean value) {
        this.thursdayQty = value;
    }

    /**
     * Obtém o valor da propriedade thursdayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThursdayStopSequenceNumber() {
        return thursdayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade thursdayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThursdayStopSequenceNumber(Boolean value) {
        this.thursdayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade tuesdayQty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTuesdayQty() {
        return tuesdayQty;
    }

    /**
     * Define o valor da propriedade tuesdayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTuesdayQty(Boolean value) {
        this.tuesdayQty = value;
    }

    /**
     * Obtém o valor da propriedade tuesdayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTuesdayStopSequenceNumber() {
        return tuesdayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade tuesdayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTuesdayStopSequenceNumber(Boolean value) {
        this.tuesdayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade uploadSelector.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUploadSelector() {
        return uploadSelector;
    }

    /**
     * Define o valor da propriedade uploadSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUploadSelector(Boolean value) {
        this.uploadSelector = value;
    }

    /**
     * Obtém o valor da propriedade wednesdayQty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWednesdayQty() {
        return wednesdayQty;
    }

    /**
     * Define o valor da propriedade wednesdayQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWednesdayQty(Boolean value) {
        this.wednesdayQty = value;
    }

    /**
     * Obtém o valor da propriedade wednesdayStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWednesdayStopSequenceNumber() {
        return wednesdayStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade wednesdayStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWednesdayStopSequenceNumber(Boolean value) {
        this.wednesdayStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade week.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeek() {
        return week;
    }

    /**
     * Define o valor da propriedade week.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeek(Boolean value) {
        this.week = value;
    }

}
