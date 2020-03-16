
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ImportOrderInfoPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportOrderInfoPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AnchorDaysRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AnchorWeeksRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentServicePattern" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentServicePatternOptions" type="{http://roadnet.com/apex/DataContracts/}ServicePatternPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="CycleNumberOfTimeUnits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_PreviousDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryIncreaseQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EntryMethod_EntryMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsConsideredForAssignDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemTypeDefault_LineItemPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemsOptions" type="{http://roadnet.com/apex/DataContracts/}LineItemPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ManagedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxDaysServiceGap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinDaysServiceGap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfDaysToShift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupIncreaseQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifierOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousDeliveryWeeks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousOriginId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTerritoryIds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousVisitDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousWeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PriorityOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequiredRouteDestinationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequiredRouteOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Selector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldConsiderPreviousVisit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorWeeks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TakenBy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Territories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_CycleTimeUnitType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferDeliveryAdditionalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferDeliveryLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferDeliveryLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferDeliveryOpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferDeliveryOpenCloseOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="TransferDeliveryServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferDeliveryServiceWindowOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="TransferIncreaseQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferPickupAdditionalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferPickupLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferPickupLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferPickupOpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferPickupOpenCloseOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="TransferPickupServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferPickupServiceWindowOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="TransferQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UrgencyIncrease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportOrderInfoPropertyOptions", propOrder = {
    "additionalServiceTime",
    "anchorDaysRange",
    "anchorWeeksRange",
    "beginDate",
    "coordinateOverride",
    "currentServicePattern",
    "currentServicePatternOptions",
    "cycleNumberOfTimeUnits",
    "dayOfWeekFlagsPreviousDays",
    "deliveryCategory1Quantities",
    "deliveryCategory2Quantities",
    "deliveryCategory3Quantities",
    "deliveryIncreaseQuantities",
    "deliveryQuantities",
    "endDate",
    "entryMethodEntryMethod",
    "forceBulkServiceTime",
    "identifier",
    "isConsideredForAssignDays",
    "lineItemTypeDefaultLineItemPreference",
    "lineItems",
    "lineItemsOptions",
    "managedByUserEntityKey",
    "maxDaysServiceGap",
    "minDaysServiceGap",
    "netRevenue",
    "numberOfDaysToShift",
    "openCloseOverrides",
    "openCloseOverridesOptions",
    "orderClassEntityKey",
    "orderType",
    "pickupCategory1Quantities",
    "pickupCategory2Quantities",
    "pickupCategory3Quantities",
    "pickupIncreaseQuantities",
    "pickupQuantities",
    "preferredRouteIdentifierOverride",
    "previousDeliveryWeeks",
    "previousOriginId",
    "previousTerritoryIds",
    "previousVisitDate",
    "previousWeek",
    "priorityOverride",
    "requiredRouteDestinationEntityKey",
    "requiredRouteOriginEntityKey",
    "selector",
    "serviceLocationEntityKey",
    "servicePatternSetEntityKey",
    "serviceWindowOverrides",
    "serviceWindowOverridesOptions",
    "sessionEntityKey",
    "shouldConsiderPreviousVisit",
    "shouldUseAnchorDays",
    "shouldUseAnchorWeeks",
    "specialInstructions",
    "takenBy",
    "territories",
    "timeUnitCycleTimeUnitType",
    "transferDeliveryAdditionalServiceTime",
    "transferDeliveryLocationEntityKey",
    "transferDeliveryLocationIdentifier",
    "transferDeliveryOpenCloseOverrides",
    "transferDeliveryOpenCloseOverridesOptions",
    "transferDeliveryServiceWindowOverrides",
    "transferDeliveryServiceWindowOverridesOptions",
    "transferIncreaseQuantities",
    "transferPickupAdditionalServiceTime",
    "transferPickupLocationEntityKey",
    "transferPickupLocationIdentifier",
    "transferPickupOpenCloseOverrides",
    "transferPickupOpenCloseOverridesOptions",
    "transferPickupServiceWindowOverrides",
    "transferPickupServiceWindowOverridesOptions",
    "transferQuantities",
    "urgency",
    "urgencyIncrease"
})
public class ImportOrderInfoPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AdditionalServiceTime")
    protected Boolean additionalServiceTime;
    @XmlElement(name = "AnchorDaysRange")
    protected Boolean anchorDaysRange;
    @XmlElement(name = "AnchorWeeksRange")
    protected Boolean anchorWeeksRange;
    @XmlElement(name = "BeginDate")
    protected Boolean beginDate;
    @XmlElement(name = "CoordinateOverride")
    protected Boolean coordinateOverride;
    @XmlElement(name = "CurrentServicePattern")
    protected Boolean currentServicePattern;
    @XmlElementRef(name = "CurrentServicePatternOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicePatternPropertyOptions> currentServicePatternOptions;
    @XmlElement(name = "CycleNumberOfTimeUnits")
    protected Boolean cycleNumberOfTimeUnits;
    @XmlElement(name = "DayOfWeekFlags_PreviousDays")
    protected Boolean dayOfWeekFlagsPreviousDays;
    @XmlElement(name = "DeliveryCategory1Quantities")
    protected Boolean deliveryCategory1Quantities;
    @XmlElement(name = "DeliveryCategory2Quantities")
    protected Boolean deliveryCategory2Quantities;
    @XmlElement(name = "DeliveryCategory3Quantities")
    protected Boolean deliveryCategory3Quantities;
    @XmlElement(name = "DeliveryIncreaseQuantities")
    protected Boolean deliveryIncreaseQuantities;
    @XmlElement(name = "DeliveryQuantities")
    protected Boolean deliveryQuantities;
    @XmlElement(name = "EndDate")
    protected Boolean endDate;
    @XmlElement(name = "EntryMethod_EntryMethod")
    protected Boolean entryMethodEntryMethod;
    @XmlElement(name = "ForceBulkServiceTime")
    protected Boolean forceBulkServiceTime;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsConsideredForAssignDays")
    protected Boolean isConsideredForAssignDays;
    @XmlElement(name = "LineItemTypeDefault_LineItemPreference")
    protected Boolean lineItemTypeDefaultLineItemPreference;
    @XmlElement(name = "LineItems")
    protected Boolean lineItems;
    @XmlElementRef(name = "LineItemsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LineItemPropertyOptions> lineItemsOptions;
    @XmlElement(name = "ManagedByUserEntityKey")
    protected Boolean managedByUserEntityKey;
    @XmlElement(name = "MaxDaysServiceGap")
    protected Boolean maxDaysServiceGap;
    @XmlElement(name = "MinDaysServiceGap")
    protected Boolean minDaysServiceGap;
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
    @XmlElement(name = "OrderType")
    protected Boolean orderType;
    @XmlElement(name = "PickupCategory1Quantities")
    protected Boolean pickupCategory1Quantities;
    @XmlElement(name = "PickupCategory2Quantities")
    protected Boolean pickupCategory2Quantities;
    @XmlElement(name = "PickupCategory3Quantities")
    protected Boolean pickupCategory3Quantities;
    @XmlElement(name = "PickupIncreaseQuantities")
    protected Boolean pickupIncreaseQuantities;
    @XmlElement(name = "PickupQuantities")
    protected Boolean pickupQuantities;
    @XmlElement(name = "PreferredRouteIdentifierOverride")
    protected Boolean preferredRouteIdentifierOverride;
    @XmlElement(name = "PreviousDeliveryWeeks")
    protected Boolean previousDeliveryWeeks;
    @XmlElement(name = "PreviousOriginId")
    protected Boolean previousOriginId;
    @XmlElement(name = "PreviousTerritoryIds")
    protected Boolean previousTerritoryIds;
    @XmlElement(name = "PreviousVisitDate")
    protected Boolean previousVisitDate;
    @XmlElement(name = "PreviousWeek")
    protected Boolean previousWeek;
    @XmlElement(name = "PriorityOverride")
    protected Boolean priorityOverride;
    @XmlElement(name = "RequiredRouteDestinationEntityKey")
    protected Boolean requiredRouteDestinationEntityKey;
    @XmlElement(name = "RequiredRouteOriginEntityKey")
    protected Boolean requiredRouteOriginEntityKey;
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
    @XmlElement(name = "SessionEntityKey")
    protected Boolean sessionEntityKey;
    @XmlElement(name = "ShouldConsiderPreviousVisit")
    protected Boolean shouldConsiderPreviousVisit;
    @XmlElement(name = "ShouldUseAnchorDays")
    protected Boolean shouldUseAnchorDays;
    @XmlElement(name = "ShouldUseAnchorWeeks")
    protected Boolean shouldUseAnchorWeeks;
    @XmlElement(name = "SpecialInstructions")
    protected Boolean specialInstructions;
    @XmlElement(name = "TakenBy")
    protected Boolean takenBy;
    @XmlElement(name = "Territories")
    protected Boolean territories;
    @XmlElement(name = "TimeUnit_CycleTimeUnitType")
    protected Boolean timeUnitCycleTimeUnitType;
    @XmlElement(name = "TransferDeliveryAdditionalServiceTime")
    protected Boolean transferDeliveryAdditionalServiceTime;
    @XmlElement(name = "TransferDeliveryLocationEntityKey")
    protected Boolean transferDeliveryLocationEntityKey;
    @XmlElement(name = "TransferDeliveryLocationIdentifier")
    protected Boolean transferDeliveryLocationIdentifier;
    @XmlElement(name = "TransferDeliveryOpenCloseOverrides")
    protected Boolean transferDeliveryOpenCloseOverrides;
    @XmlElementRef(name = "TransferDeliveryOpenCloseOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> transferDeliveryOpenCloseOverridesOptions;
    @XmlElement(name = "TransferDeliveryServiceWindowOverrides")
    protected Boolean transferDeliveryServiceWindowOverrides;
    @XmlElementRef(name = "TransferDeliveryServiceWindowOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceWindowDetailPropertyOptions> transferDeliveryServiceWindowOverridesOptions;
    @XmlElement(name = "TransferIncreaseQuantities")
    protected Boolean transferIncreaseQuantities;
    @XmlElement(name = "TransferPickupAdditionalServiceTime")
    protected Boolean transferPickupAdditionalServiceTime;
    @XmlElement(name = "TransferPickupLocationEntityKey")
    protected Boolean transferPickupLocationEntityKey;
    @XmlElement(name = "TransferPickupLocationIdentifier")
    protected Boolean transferPickupLocationIdentifier;
    @XmlElement(name = "TransferPickupOpenCloseOverrides")
    protected Boolean transferPickupOpenCloseOverrides;
    @XmlElementRef(name = "TransferPickupOpenCloseOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> transferPickupOpenCloseOverridesOptions;
    @XmlElement(name = "TransferPickupServiceWindowOverrides")
    protected Boolean transferPickupServiceWindowOverrides;
    @XmlElementRef(name = "TransferPickupServiceWindowOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceWindowDetailPropertyOptions> transferPickupServiceWindowOverridesOptions;
    @XmlElement(name = "TransferQuantities")
    protected Boolean transferQuantities;
    @XmlElement(name = "Urgency")
    protected Boolean urgency;
    @XmlElement(name = "UrgencyIncrease")
    protected Boolean urgencyIncrease;

    /**
     * Obtém o valor da propriedade additionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalServiceTime() {
        return additionalServiceTime;
    }

    /**
     * Define o valor da propriedade additionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalServiceTime(Boolean value) {
        this.additionalServiceTime = value;
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
     * Obtém o valor da propriedade beginDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeginDate() {
        return beginDate;
    }

    /**
     * Define o valor da propriedade beginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeginDate(Boolean value) {
        this.beginDate = value;
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
     * Obtém o valor da propriedade currentServicePattern.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentServicePattern() {
        return currentServicePattern;
    }

    /**
     * Define o valor da propriedade currentServicePattern.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentServicePattern(Boolean value) {
        this.currentServicePattern = value;
    }

    /**
     * Obtém o valor da propriedade currentServicePatternOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePatternPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServicePatternPropertyOptions> getCurrentServicePatternOptions() {
        return currentServicePatternOptions;
    }

    /**
     * Define o valor da propriedade currentServicePatternOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePatternPropertyOptions }{@code >}
     *     
     */
    public void setCurrentServicePatternOptions(JAXBElement<ServicePatternPropertyOptions> value) {
        this.currentServicePatternOptions = value;
    }

    /**
     * Obtém o valor da propriedade cycleNumberOfTimeUnits.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCycleNumberOfTimeUnits() {
        return cycleNumberOfTimeUnits;
    }

    /**
     * Define o valor da propriedade cycleNumberOfTimeUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCycleNumberOfTimeUnits(Boolean value) {
        this.cycleNumberOfTimeUnits = value;
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
     * Obtém o valor da propriedade deliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryCategory1Quantities() {
        return deliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade deliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryCategory1Quantities(Boolean value) {
        this.deliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade deliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryCategory2Quantities() {
        return deliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade deliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryCategory2Quantities(Boolean value) {
        this.deliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade deliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryCategory3Quantities() {
        return deliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade deliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryCategory3Quantities(Boolean value) {
        this.deliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade deliveryIncreaseQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryIncreaseQuantities() {
        return deliveryIncreaseQuantities;
    }

    /**
     * Define o valor da propriedade deliveryIncreaseQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryIncreaseQuantities(Boolean value) {
        this.deliveryIncreaseQuantities = value;
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
     * Obtém o valor da propriedade endDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndDate() {
        return endDate;
    }

    /**
     * Define o valor da propriedade endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndDate(Boolean value) {
        this.endDate = value;
    }

    /**
     * Obtém o valor da propriedade entryMethodEntryMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntryMethodEntryMethod() {
        return entryMethodEntryMethod;
    }

    /**
     * Define o valor da propriedade entryMethodEntryMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntryMethodEntryMethod(Boolean value) {
        this.entryMethodEntryMethod = value;
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
     * Obtém o valor da propriedade lineItemTypeDefaultLineItemPreference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemTypeDefaultLineItemPreference() {
        return lineItemTypeDefaultLineItemPreference;
    }

    /**
     * Define o valor da propriedade lineItemTypeDefaultLineItemPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemTypeDefaultLineItemPreference(Boolean value) {
        this.lineItemTypeDefaultLineItemPreference = value;
    }

    /**
     * Obtém o valor da propriedade lineItems.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItems() {
        return lineItems;
    }

    /**
     * Define o valor da propriedade lineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItems(Boolean value) {
        this.lineItems = value;
    }

    /**
     * Obtém o valor da propriedade lineItemsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineItemPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<LineItemPropertyOptions> getLineItemsOptions() {
        return lineItemsOptions;
    }

    /**
     * Define o valor da propriedade lineItemsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineItemPropertyOptions }{@code >}
     *     
     */
    public void setLineItemsOptions(JAXBElement<LineItemPropertyOptions> value) {
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
     * Obtém o valor da propriedade maxDaysServiceGap.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxDaysServiceGap() {
        return maxDaysServiceGap;
    }

    /**
     * Define o valor da propriedade maxDaysServiceGap.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxDaysServiceGap(Boolean value) {
        this.maxDaysServiceGap = value;
    }

    /**
     * Obtém o valor da propriedade minDaysServiceGap.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinDaysServiceGap() {
        return minDaysServiceGap;
    }

    /**
     * Define o valor da propriedade minDaysServiceGap.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinDaysServiceGap(Boolean value) {
        this.minDaysServiceGap = value;
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
     * Obtém o valor da propriedade orderType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderType() {
        return orderType;
    }

    /**
     * Define o valor da propriedade orderType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderType(Boolean value) {
        this.orderType = value;
    }

    /**
     * Obtém o valor da propriedade pickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupCategory1Quantities() {
        return pickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade pickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupCategory1Quantities(Boolean value) {
        this.pickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupCategory2Quantities() {
        return pickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade pickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupCategory2Quantities(Boolean value) {
        this.pickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupCategory3Quantities() {
        return pickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade pickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupCategory3Quantities(Boolean value) {
        this.pickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupIncreaseQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupIncreaseQuantities() {
        return pickupIncreaseQuantities;
    }

    /**
     * Define o valor da propriedade pickupIncreaseQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupIncreaseQuantities(Boolean value) {
        this.pickupIncreaseQuantities = value;
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
     * Obtém o valor da propriedade previousVisitDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousVisitDate() {
        return previousVisitDate;
    }

    /**
     * Define o valor da propriedade previousVisitDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousVisitDate(Boolean value) {
        this.previousVisitDate = value;
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
     * Obtém o valor da propriedade priorityOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriorityOverride() {
        return priorityOverride;
    }

    /**
     * Define o valor da propriedade priorityOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriorityOverride(Boolean value) {
        this.priorityOverride = value;
    }

    /**
     * Obtém o valor da propriedade requiredRouteDestinationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredRouteDestinationEntityKey() {
        return requiredRouteDestinationEntityKey;
    }

    /**
     * Define o valor da propriedade requiredRouteDestinationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredRouteDestinationEntityKey(Boolean value) {
        this.requiredRouteDestinationEntityKey = value;
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
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionEntityKey(Boolean value) {
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
     * Obtém o valor da propriedade specialInstructions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Define o valor da propriedade specialInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialInstructions(Boolean value) {
        this.specialInstructions = value;
    }

    /**
     * Obtém o valor da propriedade takenBy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTakenBy() {
        return takenBy;
    }

    /**
     * Define o valor da propriedade takenBy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTakenBy(Boolean value) {
        this.takenBy = value;
    }

    /**
     * Obtém o valor da propriedade territories.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerritories() {
        return territories;
    }

    /**
     * Define o valor da propriedade territories.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerritories(Boolean value) {
        this.territories = value;
    }

    /**
     * Obtém o valor da propriedade timeUnitCycleTimeUnitType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeUnitCycleTimeUnitType() {
        return timeUnitCycleTimeUnitType;
    }

    /**
     * Define o valor da propriedade timeUnitCycleTimeUnitType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeUnitCycleTimeUnitType(Boolean value) {
        this.timeUnitCycleTimeUnitType = value;
    }

    /**
     * Obtém o valor da propriedade transferDeliveryAdditionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferDeliveryAdditionalServiceTime() {
        return transferDeliveryAdditionalServiceTime;
    }

    /**
     * Define o valor da propriedade transferDeliveryAdditionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferDeliveryAdditionalServiceTime(Boolean value) {
        this.transferDeliveryAdditionalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade transferDeliveryLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferDeliveryLocationEntityKey() {
        return transferDeliveryLocationEntityKey;
    }

    /**
     * Define o valor da propriedade transferDeliveryLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferDeliveryLocationEntityKey(Boolean value) {
        this.transferDeliveryLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade transferDeliveryLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferDeliveryLocationIdentifier() {
        return transferDeliveryLocationIdentifier;
    }

    /**
     * Define o valor da propriedade transferDeliveryLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferDeliveryLocationIdentifier(Boolean value) {
        this.transferDeliveryLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade transferDeliveryOpenCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferDeliveryOpenCloseOverrides() {
        return transferDeliveryOpenCloseOverrides;
    }

    /**
     * Define o valor da propriedade transferDeliveryOpenCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferDeliveryOpenCloseOverrides(Boolean value) {
        this.transferDeliveryOpenCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade transferDeliveryOpenCloseOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpenCloseDetailPropertyOptions> getTransferDeliveryOpenCloseOverridesOptions() {
        return transferDeliveryOpenCloseOverridesOptions;
    }

    /**
     * Define o valor da propriedade transferDeliveryOpenCloseOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setTransferDeliveryOpenCloseOverridesOptions(JAXBElement<OpenCloseDetailPropertyOptions> value) {
        this.transferDeliveryOpenCloseOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade transferDeliveryServiceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferDeliveryServiceWindowOverrides() {
        return transferDeliveryServiceWindowOverrides;
    }

    /**
     * Define o valor da propriedade transferDeliveryServiceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferDeliveryServiceWindowOverrides(Boolean value) {
        this.transferDeliveryServiceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade transferDeliveryServiceWindowOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceWindowDetailPropertyOptions> getTransferDeliveryServiceWindowOverridesOptions() {
        return transferDeliveryServiceWindowOverridesOptions;
    }

    /**
     * Define o valor da propriedade transferDeliveryServiceWindowOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setTransferDeliveryServiceWindowOverridesOptions(JAXBElement<ServiceWindowDetailPropertyOptions> value) {
        this.transferDeliveryServiceWindowOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade transferIncreaseQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferIncreaseQuantities() {
        return transferIncreaseQuantities;
    }

    /**
     * Define o valor da propriedade transferIncreaseQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferIncreaseQuantities(Boolean value) {
        this.transferIncreaseQuantities = value;
    }

    /**
     * Obtém o valor da propriedade transferPickupAdditionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferPickupAdditionalServiceTime() {
        return transferPickupAdditionalServiceTime;
    }

    /**
     * Define o valor da propriedade transferPickupAdditionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferPickupAdditionalServiceTime(Boolean value) {
        this.transferPickupAdditionalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade transferPickupLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferPickupLocationEntityKey() {
        return transferPickupLocationEntityKey;
    }

    /**
     * Define o valor da propriedade transferPickupLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferPickupLocationEntityKey(Boolean value) {
        this.transferPickupLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade transferPickupLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferPickupLocationIdentifier() {
        return transferPickupLocationIdentifier;
    }

    /**
     * Define o valor da propriedade transferPickupLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferPickupLocationIdentifier(Boolean value) {
        this.transferPickupLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade transferPickupOpenCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferPickupOpenCloseOverrides() {
        return transferPickupOpenCloseOverrides;
    }

    /**
     * Define o valor da propriedade transferPickupOpenCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferPickupOpenCloseOverrides(Boolean value) {
        this.transferPickupOpenCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade transferPickupOpenCloseOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpenCloseDetailPropertyOptions> getTransferPickupOpenCloseOverridesOptions() {
        return transferPickupOpenCloseOverridesOptions;
    }

    /**
     * Define o valor da propriedade transferPickupOpenCloseOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setTransferPickupOpenCloseOverridesOptions(JAXBElement<OpenCloseDetailPropertyOptions> value) {
        this.transferPickupOpenCloseOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade transferPickupServiceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferPickupServiceWindowOverrides() {
        return transferPickupServiceWindowOverrides;
    }

    /**
     * Define o valor da propriedade transferPickupServiceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferPickupServiceWindowOverrides(Boolean value) {
        this.transferPickupServiceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade transferPickupServiceWindowOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceWindowDetailPropertyOptions> getTransferPickupServiceWindowOverridesOptions() {
        return transferPickupServiceWindowOverridesOptions;
    }

    /**
     * Define o valor da propriedade transferPickupServiceWindowOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setTransferPickupServiceWindowOverridesOptions(JAXBElement<ServiceWindowDetailPropertyOptions> value) {
        this.transferPickupServiceWindowOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade transferQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferQuantities() {
        return transferQuantities;
    }

    /**
     * Define o valor da propriedade transferQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferQuantities(Boolean value) {
        this.transferQuantities = value;
    }

    /**
     * Obtém o valor da propriedade urgency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgency() {
        return urgency;
    }

    /**
     * Define o valor da propriedade urgency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgency(Boolean value) {
        this.urgency = value;
    }

    /**
     * Obtém o valor da propriedade urgencyIncrease.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgencyIncrease() {
        return urgencyIncrease;
    }

    /**
     * Define o valor da propriedade urgencyIncrease.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgencyIncrease(Boolean value) {
        this.urgencyIncrease = value;
    }

}
