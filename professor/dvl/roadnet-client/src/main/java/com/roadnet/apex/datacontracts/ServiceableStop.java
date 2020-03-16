
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de ServiceableStop complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceableStop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Stop"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Actions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfStopAction" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedPerUnitServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CancelledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Consignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_ServiceLocationDeliveryDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_ServiceLocationGeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAttentionReason_ServiceLocationGeocodeAttentionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeMethod_ServiceLocationGeocodeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupStopEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="HasPreferredRouteIdentifierOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasPriorityOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InternalScoring" type="{http://roadnet.com/apex/DataContracts/}StopScores" minOccurs="0"/&gt;
 *         &lt;element name="IsRedelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsUnserviceable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxUrgency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MissedOpenCloseEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedOpenCloseLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowsEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowsLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowType_MissedTimeWindowDurationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowType_PlannedMissedTimeWindowDurationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileQuantityItemSource_Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOrders" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceableStopOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="OrdersLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedOpenCloseEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedOpenCloseLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedServiceWindowsEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedServiceWindowsLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedTimeWindowDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedRunningQuantityAfter" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedServiceStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RunningQuantityAfter" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Selectors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAccountEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAlternateContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationBuildingDeliverySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEquipmentTypeRestrictions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceLocationEquipmentTypeRestriction" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationServiceAreaOverride" type="{http://roadnet.com/apex/DataContracts/}ServiceAreaBase" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationServiceRadiusOverride" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationServiceTimeTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationStandardInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationTimeWindowTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceStartTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceableStopServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="SignatureCaptureEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SkipSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopAlertFlags_Alerts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowImportance_ServiceLocationTimeWindowImportance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryDamagedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryOverQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantitiesDifference" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantitiesPercentageDifference" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryShortQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupDamagedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupOverQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantitiesDifference" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantitiesPercentageDifference" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupShortQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedVariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTimeDifference" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalVariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="UnserviceableReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UnserviceableReasonCodeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelectors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceableStop", propOrder = {
    "actions",
    "adjustedFixedServiceTime",
    "adjustedPerUnitServiceTime",
    "beginDate",
    "cancelledTime",
    "consignee",
    "dayOfWeekFlagsServiceLocationDeliveryDays",
    "endDate",
    "geocodeAccuracyServiceLocationGeocodeAccuracy",
    "geocodeAttentionReasonServiceLocationGeocodeAttentionReason",
    "geocodeMethodServiceLocationGeocodeMethod",
    "groupStopEntityKey",
    "hasPreferredRouteIdentifierOverride",
    "hasPriorityOverride",
    "hasSignature",
    "internalScoring",
    "isRedelivery",
    "isSuspended",
    "isUnserviceable",
    "maxUrgency",
    "missedOpenCloseEarlyDuration",
    "missedOpenCloseLateDuration",
    "missedServiceWindowsEarlyDuration",
    "missedServiceWindowsLateDuration",
    "missedTimeWindowDuration",
    "missedTimeWindowTypeMissedTimeWindowDurationType",
    "missedTimeWindowTypePlannedMissedTimeWindowDurationType",
    "mobileQuantityItemSourceSource",
    "netRevenue",
    "numberOfOrders",
    "openCloseDetails",
    "orderClassEntityKeys",
    "ordersLocked",
    "plannedMissedOpenCloseEarlyDuration",
    "plannedMissedOpenCloseLateDuration",
    "plannedMissedServiceWindowsEarlyDuration",
    "plannedMissedServiceWindowsLateDuration",
    "plannedMissedTimeWindowDuration",
    "plannedRunningQuantityAfter",
    "plannedSequenceNumber",
    "plannedServiceStartTime",
    "plannedTotalDeliveryCategory1Quantities",
    "plannedTotalDeliveryCategory2Quantities",
    "plannedTotalDeliveryCategory3Quantities",
    "plannedTotalPickupCategory1Quantities",
    "plannedTotalPickupCategory2Quantities",
    "plannedTotalPickupCategory3Quantities",
    "preferredRouteIdentifier",
    "priority",
    "routeIdentifier",
    "runningQuantityAfter",
    "selectors",
    "sequenceNumber",
    "serviceLocationAccountEntityKey",
    "serviceLocationAddress",
    "serviceLocationAlternateContact",
    "serviceLocationBuildingDeliverySequence",
    "serviceLocationCategoryEntityKey",
    "serviceLocationContact",
    "serviceLocationCustomProperties",
    "serviceLocationDescription",
    "serviceLocationEntityKey",
    "serviceLocationEquipmentTypeRestrictions",
    "serviceLocationIdentifier",
    "serviceLocationIsDeleted",
    "serviceLocationPhoneNumber",
    "serviceLocationPreferredRouteIdentifier",
    "serviceLocationPriority",
    "serviceLocationServiceAreaOverride",
    "serviceLocationServiceRadiusOverride",
    "serviceLocationServiceTimeTypeEntityKey",
    "serviceLocationStandardInstructions",
    "serviceLocationTimeWindowTypeEntityKey",
    "serviceLocationZone",
    "serviceStartTime",
    "serviceWindowDetails",
    "signature",
    "signatureCaptureEntityKey",
    "skipSignature",
    "specialInstructions",
    "stopAlertFlagsAlerts",
    "timeWindowImportanceServiceLocationTimeWindowImportance",
    "totalDeliveryDamagedQuantities",
    "totalDeliveryOverQuantities",
    "totalDeliveryQuantities",
    "totalDeliveryQuantitiesDifference",
    "totalDeliveryQuantitiesPercentageDifference",
    "totalDeliveryShortQuantities",
    "totalFee",
    "totalFixedServiceTime",
    "totalPickupDamagedQuantities",
    "totalPickupOverQuantities",
    "totalPickupQuantities",
    "totalPickupQuantitiesDifference",
    "totalPickupQuantitiesPercentageDifference",
    "totalPickupShortQuantities",
    "totalPlannedDeliveryQuantities",
    "totalPlannedFee",
    "totalPlannedFixedServiceTime",
    "totalPlannedPickupQuantities",
    "totalPlannedServiceTime",
    "totalPlannedVariableServiceTime",
    "totalServiceTime",
    "totalServiceTimeDifference",
    "totalServiceTimePercentageDifference",
    "totalVariableServiceTime",
    "unserviceableReasonCodeEntityKey",
    "unserviceableReasonCodeIdentifier",
    "uploadSelectors"
})
public class ServiceableStop
    extends Stop
{

    @XmlElementRef(name = "Actions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStopAction> actions;
    @XmlElementRef(name = "AdjustedFixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> adjustedFixedServiceTime;
    @XmlElementRef(name = "AdjustedPerUnitServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> adjustedPerUnitServiceTime;
    @XmlElementRef(name = "BeginDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> beginDate;
    @XmlElementRef(name = "CancelledTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> cancelledTime;
    @XmlElementRef(name = "Consignee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consignee;
    @XmlElementRef(name = "DayOfWeekFlags_ServiceLocationDeliveryDays", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsServiceLocationDeliveryDays;
    @XmlElementRef(name = "EndDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "GeocodeAccuracy_ServiceLocationGeocodeAccuracy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAccuracyServiceLocationGeocodeAccuracy;
    @XmlElementRef(name = "GeocodeAttentionReason_ServiceLocationGeocodeAttentionReason", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAttentionReasonServiceLocationGeocodeAttentionReason;
    @XmlElementRef(name = "GeocodeMethod_ServiceLocationGeocodeMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeMethodServiceLocationGeocodeMethod;
    @XmlElementRef(name = "GroupStopEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> groupStopEntityKey;
    @XmlElement(name = "HasPreferredRouteIdentifierOverride")
    protected Boolean hasPreferredRouteIdentifierOverride;
    @XmlElement(name = "HasPriorityOverride")
    protected Boolean hasPriorityOverride;
    @XmlElement(name = "HasSignature")
    protected Boolean hasSignature;
    @XmlElementRef(name = "InternalScoring", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StopScores> internalScoring;
    @XmlElement(name = "IsRedelivery")
    protected Boolean isRedelivery;
    @XmlElement(name = "IsSuspended")
    protected Boolean isSuspended;
    @XmlElement(name = "IsUnserviceable")
    protected Boolean isUnserviceable;
    @XmlElement(name = "MaxUrgency")
    protected Integer maxUrgency;
    @XmlElementRef(name = "MissedOpenCloseEarlyDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> missedOpenCloseEarlyDuration;
    @XmlElementRef(name = "MissedOpenCloseLateDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> missedOpenCloseLateDuration;
    @XmlElementRef(name = "MissedServiceWindowsEarlyDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> missedServiceWindowsEarlyDuration;
    @XmlElementRef(name = "MissedServiceWindowsLateDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> missedServiceWindowsLateDuration;
    @XmlElementRef(name = "MissedTimeWindowDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> missedTimeWindowDuration;
    @XmlElementRef(name = "MissedTimeWindowType_MissedTimeWindowDurationType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> missedTimeWindowTypeMissedTimeWindowDurationType;
    @XmlElementRef(name = "MissedTimeWindowType_PlannedMissedTimeWindowDurationType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> missedTimeWindowTypePlannedMissedTimeWindowDurationType;
    @XmlElementRef(name = "MobileQuantityItemSource_Source", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileQuantityItemSourceSource;
    @XmlElementRef(name = "NetRevenue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> netRevenue;
    @XmlElement(name = "NumberOfOrders")
    protected Integer numberOfOrders;
    @XmlElementRef(name = "OpenCloseDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceableStopOpenCloseDetail> openCloseDetails;
    @XmlElementRef(name = "OrderClassEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> orderClassEntityKeys;
    @XmlElement(name = "OrdersLocked")
    protected Boolean ordersLocked;
    @XmlElementRef(name = "PlannedMissedOpenCloseEarlyDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedMissedOpenCloseEarlyDuration;
    @XmlElementRef(name = "PlannedMissedOpenCloseLateDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedMissedOpenCloseLateDuration;
    @XmlElementRef(name = "PlannedMissedServiceWindowsEarlyDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedMissedServiceWindowsEarlyDuration;
    @XmlElementRef(name = "PlannedMissedServiceWindowsLateDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedMissedServiceWindowsLateDuration;
    @XmlElementRef(name = "PlannedMissedTimeWindowDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedMissedTimeWindowDuration;
    @XmlElementRef(name = "PlannedRunningQuantityAfter", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedRunningQuantityAfter;
    @XmlElementRef(name = "PlannedSequenceNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedSequenceNumber;
    @XmlElementRef(name = "PlannedServiceStartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedServiceStartTime;
    @XmlElementRef(name = "PlannedTotalDeliveryCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalDeliveryCategory1Quantities;
    @XmlElementRef(name = "PlannedTotalDeliveryCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalDeliveryCategory2Quantities;
    @XmlElementRef(name = "PlannedTotalDeliveryCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalDeliveryCategory3Quantities;
    @XmlElementRef(name = "PlannedTotalPickupCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalPickupCategory1Quantities;
    @XmlElementRef(name = "PlannedTotalPickupCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalPickupCategory2Quantities;
    @XmlElementRef(name = "PlannedTotalPickupCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalPickupCategory3Quantities;
    @XmlElementRef(name = "PreferredRouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredRouteIdentifier;
    @XmlElement(name = "Priority")
    protected Integer priority;
    @XmlElementRef(name = "RouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeIdentifier;
    @XmlElementRef(name = "RunningQuantityAfter", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> runningQuantityAfter;
    @XmlElementRef(name = "Selectors", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectors;
    @XmlElementRef(name = "SequenceNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sequenceNumber;
    @XmlElementRef(name = "ServiceLocationAccountEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceLocationAccountEntityKey;
    @XmlElementRef(name = "ServiceLocationAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> serviceLocationAddress;
    @XmlElementRef(name = "ServiceLocationAlternateContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> serviceLocationAlternateContact;
    @XmlElement(name = "ServiceLocationBuildingDeliverySequence")
    protected Integer serviceLocationBuildingDeliverySequence;
    @XmlElementRef(name = "ServiceLocationCategoryEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceLocationCategoryEntityKey;
    @XmlElementRef(name = "ServiceLocationContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> serviceLocationContact;
    @XmlElementRef(name = "ServiceLocationCustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> serviceLocationCustomProperties;
    @XmlElementRef(name = "ServiceLocationDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationDescription;
    @XmlElement(name = "ServiceLocationEntityKey")
    protected Long serviceLocationEntityKey;
    @XmlElementRef(name = "ServiceLocationEquipmentTypeRestrictions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> serviceLocationEquipmentTypeRestrictions;
    @XmlElementRef(name = "ServiceLocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationIdentifier;
    @XmlElement(name = "ServiceLocationIsDeleted")
    protected Boolean serviceLocationIsDeleted;
    @XmlElementRef(name = "ServiceLocationPhoneNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationPhoneNumber;
    @XmlElementRef(name = "ServiceLocationPreferredRouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationPreferredRouteIdentifier;
    @XmlElement(name = "ServiceLocationPriority")
    protected Integer serviceLocationPriority;
    @XmlElementRef(name = "ServiceLocationServiceAreaOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceAreaBase> serviceLocationServiceAreaOverride;
    @XmlElementRef(name = "ServiceLocationServiceRadiusOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> serviceLocationServiceRadiusOverride;
    @XmlElementRef(name = "ServiceLocationServiceTimeTypeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceLocationServiceTimeTypeEntityKey;
    @XmlElementRef(name = "ServiceLocationStandardInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationStandardInstructions;
    @XmlElementRef(name = "ServiceLocationTimeWindowTypeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceLocationTimeWindowTypeEntityKey;
    @XmlElementRef(name = "ServiceLocationZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationZone;
    @XmlElementRef(name = "ServiceStartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> serviceStartTime;
    @XmlElementRef(name = "ServiceWindowDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceableStopServiceWindowDetail> serviceWindowDetails;
    @XmlElementRef(name = "Signature", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> signature;
    @XmlElementRef(name = "SignatureCaptureEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> signatureCaptureEntityKey;
    @XmlElement(name = "SkipSignature")
    protected Boolean skipSignature;
    @XmlElementRef(name = "SpecialInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialInstructions;
    @XmlElementRef(name = "StopAlertFlags_Alerts", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopAlertFlagsAlerts;
    @XmlElementRef(name = "TimeWindowImportance_ServiceLocationTimeWindowImportance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeWindowImportanceServiceLocationTimeWindowImportance;
    @XmlElementRef(name = "TotalDeliveryDamagedQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryDamagedQuantities;
    @XmlElementRef(name = "TotalDeliveryOverQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryOverQuantities;
    @XmlElementRef(name = "TotalDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryQuantities;
    @XmlElementRef(name = "TotalDeliveryQuantitiesDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryQuantitiesDifference;
    @XmlElementRef(name = "TotalDeliveryQuantitiesPercentageDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryQuantitiesPercentageDifference;
    @XmlElementRef(name = "TotalDeliveryShortQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryShortQuantities;
    @XmlElementRef(name = "TotalFee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalFee;
    @XmlElementRef(name = "TotalFixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalFixedServiceTime;
    @XmlElementRef(name = "TotalPickupDamagedQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupDamagedQuantities;
    @XmlElementRef(name = "TotalPickupOverQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupOverQuantities;
    @XmlElementRef(name = "TotalPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupQuantities;
    @XmlElementRef(name = "TotalPickupQuantitiesDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupQuantitiesDifference;
    @XmlElementRef(name = "TotalPickupQuantitiesPercentageDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupQuantitiesPercentageDifference;
    @XmlElementRef(name = "TotalPickupShortQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupShortQuantities;
    @XmlElementRef(name = "TotalPlannedDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPlannedDeliveryQuantities;
    @XmlElementRef(name = "TotalPlannedFee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalPlannedFee;
    @XmlElementRef(name = "TotalPlannedFixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedFixedServiceTime;
    @XmlElementRef(name = "TotalPlannedPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPlannedPickupQuantities;
    @XmlElementRef(name = "TotalPlannedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedServiceTime;
    @XmlElementRef(name = "TotalPlannedVariableServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedVariableServiceTime;
    @XmlElementRef(name = "TotalServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalServiceTime;
    @XmlElement(name = "TotalServiceTimeDifference")
    protected Duration totalServiceTimeDifference;
    @XmlElement(name = "TotalServiceTimePercentageDifference")
    protected Double totalServiceTimePercentageDifference;
    @XmlElementRef(name = "TotalVariableServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalVariableServiceTime;
    @XmlElementRef(name = "UnserviceableReasonCodeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> unserviceableReasonCodeEntityKey;
    @XmlElementRef(name = "UnserviceableReasonCodeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unserviceableReasonCodeIdentifier;
    @XmlElementRef(name = "UploadSelectors", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uploadSelectors;

    /**
     * Obtém o valor da propriedade actions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopAction }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStopAction> getActions() {
        return actions;
    }

    /**
     * Define o valor da propriedade actions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopAction }{@code >}
     *     
     */
    public void setActions(JAXBElement<ArrayOfStopAction> value) {
        this.actions = value;
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
     * Obtém o valor da propriedade beginDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBeginDate() {
        return beginDate;
    }

    /**
     * Define o valor da propriedade beginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBeginDate(JAXBElement<XMLGregorianCalendar> value) {
        this.beginDate = value;
    }

    /**
     * Obtém o valor da propriedade cancelledTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCancelledTime() {
        return cancelledTime;
    }

    /**
     * Define o valor da propriedade cancelledTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCancelledTime(JAXBElement<XMLGregorianCalendar> value) {
        this.cancelledTime = value;
    }

    /**
     * Obtém o valor da propriedade consignee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsignee() {
        return consignee;
    }

    /**
     * Define o valor da propriedade consignee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsignee(JAXBElement<String> value) {
        this.consignee = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsServiceLocationDeliveryDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlagsServiceLocationDeliveryDays() {
        return dayOfWeekFlagsServiceLocationDeliveryDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsServiceLocationDeliveryDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlagsServiceLocationDeliveryDays(JAXBElement<String> value) {
        this.dayOfWeekFlagsServiceLocationDeliveryDays = value;
    }

    /**
     * Obtém o valor da propriedade endDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Define o valor da propriedade endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyServiceLocationGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeAccuracyServiceLocationGeocodeAccuracy() {
        return geocodeAccuracyServiceLocationGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyServiceLocationGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeAccuracyServiceLocationGeocodeAccuracy(JAXBElement<String> value) {
        this.geocodeAccuracyServiceLocationGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAttentionReasonServiceLocationGeocodeAttentionReason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeAttentionReasonServiceLocationGeocodeAttentionReason() {
        return geocodeAttentionReasonServiceLocationGeocodeAttentionReason;
    }

    /**
     * Define o valor da propriedade geocodeAttentionReasonServiceLocationGeocodeAttentionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeAttentionReasonServiceLocationGeocodeAttentionReason(JAXBElement<String> value) {
        this.geocodeAttentionReasonServiceLocationGeocodeAttentionReason = value;
    }

    /**
     * Obtém o valor da propriedade geocodeMethodServiceLocationGeocodeMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeMethodServiceLocationGeocodeMethod() {
        return geocodeMethodServiceLocationGeocodeMethod;
    }

    /**
     * Define o valor da propriedade geocodeMethodServiceLocationGeocodeMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeMethodServiceLocationGeocodeMethod(JAXBElement<String> value) {
        this.geocodeMethodServiceLocationGeocodeMethod = value;
    }

    /**
     * Obtém o valor da propriedade groupStopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getGroupStopEntityKey() {
        return groupStopEntityKey;
    }

    /**
     * Define o valor da propriedade groupStopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setGroupStopEntityKey(JAXBElement<Long> value) {
        this.groupStopEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade hasPreferredRouteIdentifierOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPreferredRouteIdentifierOverride() {
        return hasPreferredRouteIdentifierOverride;
    }

    /**
     * Define o valor da propriedade hasPreferredRouteIdentifierOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPreferredRouteIdentifierOverride(Boolean value) {
        this.hasPreferredRouteIdentifierOverride = value;
    }

    /**
     * Obtém o valor da propriedade hasPriorityOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPriorityOverride() {
        return hasPriorityOverride;
    }

    /**
     * Define o valor da propriedade hasPriorityOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPriorityOverride(Boolean value) {
        this.hasPriorityOverride = value;
    }

    /**
     * Obtém o valor da propriedade hasSignature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSignature() {
        return hasSignature;
    }

    /**
     * Define o valor da propriedade hasSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSignature(Boolean value) {
        this.hasSignature = value;
    }

    /**
     * Obtém o valor da propriedade internalScoring.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopScores }{@code >}
     *     
     */
    public JAXBElement<StopScores> getInternalScoring() {
        return internalScoring;
    }

    /**
     * Define o valor da propriedade internalScoring.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopScores }{@code >}
     *     
     */
    public void setInternalScoring(JAXBElement<StopScores> value) {
        this.internalScoring = value;
    }

    /**
     * Obtém o valor da propriedade isRedelivery.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRedelivery() {
        return isRedelivery;
    }

    /**
     * Define o valor da propriedade isRedelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRedelivery(Boolean value) {
        this.isRedelivery = value;
    }

    /**
     * Obtém o valor da propriedade isSuspended.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSuspended() {
        return isSuspended;
    }

    /**
     * Define o valor da propriedade isSuspended.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSuspended(Boolean value) {
        this.isSuspended = value;
    }

    /**
     * Obtém o valor da propriedade isUnserviceable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnserviceable() {
        return isUnserviceable;
    }

    /**
     * Define o valor da propriedade isUnserviceable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnserviceable(Boolean value) {
        this.isUnserviceable = value;
    }

    /**
     * Obtém o valor da propriedade maxUrgency.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxUrgency() {
        return maxUrgency;
    }

    /**
     * Define o valor da propriedade maxUrgency.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxUrgency(Integer value) {
        this.maxUrgency = value;
    }

    /**
     * Obtém o valor da propriedade missedOpenCloseEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMissedOpenCloseEarlyDuration() {
        return missedOpenCloseEarlyDuration;
    }

    /**
     * Define o valor da propriedade missedOpenCloseEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMissedOpenCloseEarlyDuration(JAXBElement<Duration> value) {
        this.missedOpenCloseEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedOpenCloseLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMissedOpenCloseLateDuration() {
        return missedOpenCloseLateDuration;
    }

    /**
     * Define o valor da propriedade missedOpenCloseLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMissedOpenCloseLateDuration(JAXBElement<Duration> value) {
        this.missedOpenCloseLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedServiceWindowsEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMissedServiceWindowsEarlyDuration() {
        return missedServiceWindowsEarlyDuration;
    }

    /**
     * Define o valor da propriedade missedServiceWindowsEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMissedServiceWindowsEarlyDuration(JAXBElement<Duration> value) {
        this.missedServiceWindowsEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedServiceWindowsLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMissedServiceWindowsLateDuration() {
        return missedServiceWindowsLateDuration;
    }

    /**
     * Define o valor da propriedade missedServiceWindowsLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMissedServiceWindowsLateDuration(JAXBElement<Duration> value) {
        this.missedServiceWindowsLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMissedTimeWindowDuration() {
        return missedTimeWindowDuration;
    }

    /**
     * Define o valor da propriedade missedTimeWindowDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMissedTimeWindowDuration(JAXBElement<Duration> value) {
        this.missedTimeWindowDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowTypeMissedTimeWindowDurationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMissedTimeWindowTypeMissedTimeWindowDurationType() {
        return missedTimeWindowTypeMissedTimeWindowDurationType;
    }

    /**
     * Define o valor da propriedade missedTimeWindowTypeMissedTimeWindowDurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMissedTimeWindowTypeMissedTimeWindowDurationType(JAXBElement<String> value) {
        this.missedTimeWindowTypeMissedTimeWindowDurationType = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowTypePlannedMissedTimeWindowDurationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMissedTimeWindowTypePlannedMissedTimeWindowDurationType() {
        return missedTimeWindowTypePlannedMissedTimeWindowDurationType;
    }

    /**
     * Define o valor da propriedade missedTimeWindowTypePlannedMissedTimeWindowDurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMissedTimeWindowTypePlannedMissedTimeWindowDurationType(JAXBElement<String> value) {
        this.missedTimeWindowTypePlannedMissedTimeWindowDurationType = value;
    }

    /**
     * Obtém o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileQuantityItemSourceSource() {
        return mobileQuantityItemSourceSource;
    }

    /**
     * Define o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileQuantityItemSourceSource(JAXBElement<String> value) {
        this.mobileQuantityItemSourceSource = value;
    }

    /**
     * Obtém o valor da propriedade netRevenue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNetRevenue() {
        return netRevenue;
    }

    /**
     * Define o valor da propriedade netRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNetRevenue(JAXBElement<Double> value) {
        this.netRevenue = value;
    }

    /**
     * Obtém o valor da propriedade numberOfOrders.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfOrders() {
        return numberOfOrders;
    }

    /**
     * Define o valor da propriedade numberOfOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfOrders(Integer value) {
        this.numberOfOrders = value;
    }

    /**
     * Obtém o valor da propriedade openCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceableStopOpenCloseDetail> getOpenCloseDetails() {
        return openCloseDetails;
    }

    /**
     * Define o valor da propriedade openCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopOpenCloseDetail }{@code >}
     *     
     */
    public void setOpenCloseDetails(JAXBElement<ArrayOfServiceableStopOpenCloseDetail> value) {
        this.openCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade orderClassEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getOrderClassEntityKeys() {
        return orderClassEntityKeys;
    }

    /**
     * Define o valor da propriedade orderClassEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setOrderClassEntityKeys(JAXBElement<ArrayOflong> value) {
        this.orderClassEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade ordersLocked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrdersLocked() {
        return ordersLocked;
    }

    /**
     * Define o valor da propriedade ordersLocked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrdersLocked(Boolean value) {
        this.ordersLocked = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedOpenCloseEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedMissedOpenCloseEarlyDuration() {
        return plannedMissedOpenCloseEarlyDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedOpenCloseEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedMissedOpenCloseEarlyDuration(JAXBElement<Duration> value) {
        this.plannedMissedOpenCloseEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedOpenCloseLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedMissedOpenCloseLateDuration() {
        return plannedMissedOpenCloseLateDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedOpenCloseLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedMissedOpenCloseLateDuration(JAXBElement<Duration> value) {
        this.plannedMissedOpenCloseLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedServiceWindowsEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedMissedServiceWindowsEarlyDuration() {
        return plannedMissedServiceWindowsEarlyDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedServiceWindowsEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedMissedServiceWindowsEarlyDuration(JAXBElement<Duration> value) {
        this.plannedMissedServiceWindowsEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedServiceWindowsLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedMissedServiceWindowsLateDuration() {
        return plannedMissedServiceWindowsLateDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedServiceWindowsLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedMissedServiceWindowsLateDuration(JAXBElement<Duration> value) {
        this.plannedMissedServiceWindowsLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedTimeWindowDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedMissedTimeWindowDuration() {
        return plannedMissedTimeWindowDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedTimeWindowDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedMissedTimeWindowDuration(JAXBElement<Duration> value) {
        this.plannedMissedTimeWindowDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedRunningQuantityAfter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedRunningQuantityAfter() {
        return plannedRunningQuantityAfter;
    }

    /**
     * Define o valor da propriedade plannedRunningQuantityAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedRunningQuantityAfter(JAXBElement<Quantities> value) {
        this.plannedRunningQuantityAfter = value;
    }

    /**
     * Obtém o valor da propriedade plannedSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedSequenceNumber() {
        return plannedSequenceNumber;
    }

    /**
     * Define o valor da propriedade plannedSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedSequenceNumber(JAXBElement<Integer> value) {
        this.plannedSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade plannedServiceStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedServiceStartTime() {
        return plannedServiceStartTime;
    }

    /**
     * Define o valor da propriedade plannedServiceStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedServiceStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedServiceStartTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalDeliveryCategory1Quantities() {
        return plannedTotalDeliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalDeliveryCategory1Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalDeliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalDeliveryCategory2Quantities() {
        return plannedTotalDeliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalDeliveryCategory2Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalDeliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalDeliveryCategory3Quantities() {
        return plannedTotalDeliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalDeliveryCategory3Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalDeliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalPickupCategory1Quantities() {
        return plannedTotalPickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalPickupCategory1Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalPickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalPickupCategory2Quantities() {
        return plannedTotalPickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalPickupCategory2Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalPickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalPickupCategory3Quantities() {
        return plannedTotalPickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalPickupCategory3Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalPickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade preferredRouteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredRouteIdentifier() {
        return preferredRouteIdentifier;
    }

    /**
     * Define o valor da propriedade preferredRouteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredRouteIdentifier(JAXBElement<String> value) {
        this.preferredRouteIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
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
     * Obtém o valor da propriedade runningQuantityAfter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getRunningQuantityAfter() {
        return runningQuantityAfter;
    }

    /**
     * Define o valor da propriedade runningQuantityAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setRunningQuantityAfter(JAXBElement<Quantities> value) {
        this.runningQuantityAfter = value;
    }

    /**
     * Obtém o valor da propriedade selectors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectors() {
        return selectors;
    }

    /**
     * Define o valor da propriedade selectors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectors(JAXBElement<String> value) {
        this.selectors = value;
    }

    /**
     * Obtém o valor da propriedade sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Define o valor da propriedade sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSequenceNumber(JAXBElement<Integer> value) {
        this.sequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAccountEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceLocationAccountEntityKey() {
        return serviceLocationAccountEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationAccountEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceLocationAccountEntityKey(JAXBElement<Long> value) {
        this.serviceLocationAccountEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getServiceLocationAddress() {
        return serviceLocationAddress;
    }

    /**
     * Define o valor da propriedade serviceLocationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setServiceLocationAddress(JAXBElement<Address> value) {
        this.serviceLocationAddress = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAlternateContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getServiceLocationAlternateContact() {
        return serviceLocationAlternateContact;
    }

    /**
     * Define o valor da propriedade serviceLocationAlternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setServiceLocationAlternateContact(JAXBElement<PersonName> value) {
        this.serviceLocationAlternateContact = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationBuildingDeliverySequence.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceLocationBuildingDeliverySequence() {
        return serviceLocationBuildingDeliverySequence;
    }

    /**
     * Define o valor da propriedade serviceLocationBuildingDeliverySequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceLocationBuildingDeliverySequence(Integer value) {
        this.serviceLocationBuildingDeliverySequence = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceLocationCategoryEntityKey() {
        return serviceLocationCategoryEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceLocationCategoryEntityKey(JAXBElement<Long> value) {
        this.serviceLocationCategoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getServiceLocationContact() {
        return serviceLocationContact;
    }

    /**
     * Define o valor da propriedade serviceLocationContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setServiceLocationContact(JAXBElement<PersonName> value) {
        this.serviceLocationContact = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getServiceLocationCustomProperties() {
        return serviceLocationCustomProperties;
    }

    /**
     * Define o valor da propriedade serviceLocationCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setServiceLocationCustomProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.serviceLocationCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationDescription() {
        return serviceLocationDescription;
    }

    /**
     * Define o valor da propriedade serviceLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationDescription(JAXBElement<String> value) {
        this.serviceLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceLocationEntityKey() {
        return serviceLocationEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceLocationEntityKey(Long value) {
        this.serviceLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationEquipmentTypeRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationEquipmentTypeRestriction }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> getServiceLocationEquipmentTypeRestrictions() {
        return serviceLocationEquipmentTypeRestrictions;
    }

    /**
     * Define o valor da propriedade serviceLocationEquipmentTypeRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationEquipmentTypeRestriction }{@code >}
     *     
     */
    public void setServiceLocationEquipmentTypeRestrictions(JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> value) {
        this.serviceLocationEquipmentTypeRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationIdentifier() {
        return serviceLocationIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationIdentifier(JAXBElement<String> value) {
        this.serviceLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationIsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationIsDeleted() {
        return serviceLocationIsDeleted;
    }

    /**
     * Define o valor da propriedade serviceLocationIsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationIsDeleted(Boolean value) {
        this.serviceLocationIsDeleted = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationPhoneNumber() {
        return serviceLocationPhoneNumber;
    }

    /**
     * Define o valor da propriedade serviceLocationPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationPhoneNumber(JAXBElement<String> value) {
        this.serviceLocationPhoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationPreferredRouteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationPreferredRouteIdentifier() {
        return serviceLocationPreferredRouteIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationPreferredRouteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationPreferredRouteIdentifier(JAXBElement<String> value) {
        this.serviceLocationPreferredRouteIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationPriority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceLocationPriority() {
        return serviceLocationPriority;
    }

    /**
     * Define o valor da propriedade serviceLocationPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceLocationPriority(Integer value) {
        this.serviceLocationPriority = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationServiceAreaOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceAreaBase }{@code >}
     *     
     */
    public JAXBElement<ServiceAreaBase> getServiceLocationServiceAreaOverride() {
        return serviceLocationServiceAreaOverride;
    }

    /**
     * Define o valor da propriedade serviceLocationServiceAreaOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceAreaBase }{@code >}
     *     
     */
    public void setServiceLocationServiceAreaOverride(JAXBElement<ServiceAreaBase> value) {
        this.serviceLocationServiceAreaOverride = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationServiceRadiusOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getServiceLocationServiceRadiusOverride() {
        return serviceLocationServiceRadiusOverride;
    }

    /**
     * Define o valor da propriedade serviceLocationServiceRadiusOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setServiceLocationServiceRadiusOverride(JAXBElement<Distance> value) {
        this.serviceLocationServiceRadiusOverride = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationServiceTimeTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceLocationServiceTimeTypeEntityKey() {
        return serviceLocationServiceTimeTypeEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationServiceTimeTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceLocationServiceTimeTypeEntityKey(JAXBElement<Long> value) {
        this.serviceLocationServiceTimeTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationStandardInstructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationStandardInstructions() {
        return serviceLocationStandardInstructions;
    }

    /**
     * Define o valor da propriedade serviceLocationStandardInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationStandardInstructions(JAXBElement<String> value) {
        this.serviceLocationStandardInstructions = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationTimeWindowTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceLocationTimeWindowTypeEntityKey() {
        return serviceLocationTimeWindowTypeEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationTimeWindowTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceLocationTimeWindowTypeEntityKey(JAXBElement<Long> value) {
        this.serviceLocationTimeWindowTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationZone() {
        return serviceLocationZone;
    }

    /**
     * Define o valor da propriedade serviceLocationZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationZone(JAXBElement<String> value) {
        this.serviceLocationZone = value;
    }

    /**
     * Obtém o valor da propriedade serviceStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getServiceStartTime() {
        return serviceStartTime;
    }

    /**
     * Define o valor da propriedade serviceStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setServiceStartTime(JAXBElement<QualityPairedDateTime> value) {
        this.serviceStartTime = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopServiceWindowDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceableStopServiceWindowDetail> getServiceWindowDetails() {
        return serviceWindowDetails;
    }

    /**
     * Define o valor da propriedade serviceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopServiceWindowDetail }{@code >}
     *     
     */
    public void setServiceWindowDetails(JAXBElement<ArrayOfServiceableStopServiceWindowDetail> value) {
        this.serviceWindowDetails = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSignature(JAXBElement<byte[]> value) {
        this.signature = value;
    }

    /**
     * Obtém o valor da propriedade signatureCaptureEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSignatureCaptureEntityKey() {
        return signatureCaptureEntityKey;
    }

    /**
     * Define o valor da propriedade signatureCaptureEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSignatureCaptureEntityKey(JAXBElement<Long> value) {
        this.signatureCaptureEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade skipSignature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipSignature() {
        return skipSignature;
    }

    /**
     * Define o valor da propriedade skipSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipSignature(Boolean value) {
        this.skipSignature = value;
    }

    /**
     * Obtém o valor da propriedade specialInstructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Define o valor da propriedade specialInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialInstructions(JAXBElement<String> value) {
        this.specialInstructions = value;
    }

    /**
     * Obtém o valor da propriedade stopAlertFlagsAlerts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopAlertFlagsAlerts() {
        return stopAlertFlagsAlerts;
    }

    /**
     * Define o valor da propriedade stopAlertFlagsAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopAlertFlagsAlerts(JAXBElement<String> value) {
        this.stopAlertFlagsAlerts = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowImportanceServiceLocationTimeWindowImportance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeWindowImportanceServiceLocationTimeWindowImportance() {
        return timeWindowImportanceServiceLocationTimeWindowImportance;
    }

    /**
     * Define o valor da propriedade timeWindowImportanceServiceLocationTimeWindowImportance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeWindowImportanceServiceLocationTimeWindowImportance(JAXBElement<String> value) {
        this.timeWindowImportanceServiceLocationTimeWindowImportance = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryDamagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalDeliveryDamagedQuantities() {
        return totalDeliveryDamagedQuantities;
    }

    /**
     * Define o valor da propriedade totalDeliveryDamagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalDeliveryDamagedQuantities(JAXBElement<Quantities> value) {
        this.totalDeliveryDamagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryOverQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalDeliveryOverQuantities() {
        return totalDeliveryOverQuantities;
    }

    /**
     * Define o valor da propriedade totalDeliveryOverQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalDeliveryOverQuantities(JAXBElement<Quantities> value) {
        this.totalDeliveryOverQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalDeliveryQuantities() {
        return totalDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade totalDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalDeliveryQuantities(JAXBElement<Quantities> value) {
        this.totalDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryQuantitiesDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalDeliveryQuantitiesDifference() {
        return totalDeliveryQuantitiesDifference;
    }

    /**
     * Define o valor da propriedade totalDeliveryQuantitiesDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalDeliveryQuantitiesDifference(JAXBElement<Quantities> value) {
        this.totalDeliveryQuantitiesDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryQuantitiesPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalDeliveryQuantitiesPercentageDifference() {
        return totalDeliveryQuantitiesPercentageDifference;
    }

    /**
     * Define o valor da propriedade totalDeliveryQuantitiesPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalDeliveryQuantitiesPercentageDifference(JAXBElement<Quantities> value) {
        this.totalDeliveryQuantitiesPercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryShortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalDeliveryShortQuantities() {
        return totalDeliveryShortQuantities;
    }

    /**
     * Define o valor da propriedade totalDeliveryShortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalDeliveryShortQuantities(JAXBElement<Quantities> value) {
        this.totalDeliveryShortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalFee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalFee() {
        return totalFee;
    }

    /**
     * Define o valor da propriedade totalFee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalFee(JAXBElement<Double> value) {
        this.totalFee = value;
    }

    /**
     * Obtém o valor da propriedade totalFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalFixedServiceTime() {
        return totalFixedServiceTime;
    }

    /**
     * Define o valor da propriedade totalFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalFixedServiceTime(JAXBElement<Duration> value) {
        this.totalFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupDamagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPickupDamagedQuantities() {
        return totalPickupDamagedQuantities;
    }

    /**
     * Define o valor da propriedade totalPickupDamagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPickupDamagedQuantities(JAXBElement<Quantities> value) {
        this.totalPickupDamagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupOverQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPickupOverQuantities() {
        return totalPickupOverQuantities;
    }

    /**
     * Define o valor da propriedade totalPickupOverQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPickupOverQuantities(JAXBElement<Quantities> value) {
        this.totalPickupOverQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPickupQuantities() {
        return totalPickupQuantities;
    }

    /**
     * Define o valor da propriedade totalPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPickupQuantities(JAXBElement<Quantities> value) {
        this.totalPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupQuantitiesDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPickupQuantitiesDifference() {
        return totalPickupQuantitiesDifference;
    }

    /**
     * Define o valor da propriedade totalPickupQuantitiesDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPickupQuantitiesDifference(JAXBElement<Quantities> value) {
        this.totalPickupQuantitiesDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupQuantitiesPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPickupQuantitiesPercentageDifference() {
        return totalPickupQuantitiesPercentageDifference;
    }

    /**
     * Define o valor da propriedade totalPickupQuantitiesPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPickupQuantitiesPercentageDifference(JAXBElement<Quantities> value) {
        this.totalPickupQuantitiesPercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupShortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPickupShortQuantities() {
        return totalPickupShortQuantities;
    }

    /**
     * Define o valor da propriedade totalPickupShortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPickupShortQuantities(JAXBElement<Quantities> value) {
        this.totalPickupShortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPlannedDeliveryQuantities() {
        return totalPlannedDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade totalPlannedDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPlannedDeliveryQuantities(JAXBElement<Quantities> value) {
        this.totalPlannedDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedFee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalPlannedFee() {
        return totalPlannedFee;
    }

    /**
     * Define o valor da propriedade totalPlannedFee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalPlannedFee(JAXBElement<Double> value) {
        this.totalPlannedFee = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedFixedServiceTime() {
        return totalPlannedFixedServiceTime;
    }

    /**
     * Define o valor da propriedade totalPlannedFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedFixedServiceTime(JAXBElement<Duration> value) {
        this.totalPlannedFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPlannedPickupQuantities() {
        return totalPlannedPickupQuantities;
    }

    /**
     * Define o valor da propriedade totalPlannedPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPlannedPickupQuantities(JAXBElement<Quantities> value) {
        this.totalPlannedPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedServiceTime() {
        return totalPlannedServiceTime;
    }

    /**
     * Define o valor da propriedade totalPlannedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedServiceTime(JAXBElement<Duration> value) {
        this.totalPlannedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedVariableServiceTime() {
        return totalPlannedVariableServiceTime;
    }

    /**
     * Define o valor da propriedade totalPlannedVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedVariableServiceTime(JAXBElement<Duration> value) {
        this.totalPlannedVariableServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalServiceTime() {
        return totalServiceTime;
    }

    /**
     * Define o valor da propriedade totalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalServiceTime(JAXBElement<Duration> value) {
        this.totalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalServiceTimeDifference() {
        return totalServiceTimeDifference;
    }

    /**
     * Define o valor da propriedade totalServiceTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalServiceTimeDifference(Duration value) {
        this.totalServiceTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalServiceTimePercentageDifference() {
        return totalServiceTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade totalServiceTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalServiceTimePercentageDifference(Double value) {
        this.totalServiceTimePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalVariableServiceTime() {
        return totalVariableServiceTime;
    }

    /**
     * Define o valor da propriedade totalVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalVariableServiceTime(JAXBElement<Duration> value) {
        this.totalVariableServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade unserviceableReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUnserviceableReasonCodeEntityKey() {
        return unserviceableReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade unserviceableReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUnserviceableReasonCodeEntityKey(JAXBElement<Long> value) {
        this.unserviceableReasonCodeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade unserviceableReasonCodeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnserviceableReasonCodeIdentifier() {
        return unserviceableReasonCodeIdentifier;
    }

    /**
     * Define o valor da propriedade unserviceableReasonCodeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnserviceableReasonCodeIdentifier(JAXBElement<String> value) {
        this.unserviceableReasonCodeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade uploadSelectors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUploadSelectors() {
        return uploadSelectors;
    }

    /**
     * Define o valor da propriedade uploadSelectors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUploadSelectors(JAXBElement<String> value) {
        this.uploadSelectors = value;
    }

}
