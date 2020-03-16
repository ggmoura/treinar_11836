
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de StopPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StopPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Actions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ActionsOptions" type="{http://roadnet.com/apex/DataContracts/}StopActionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedFixedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedPerUnitServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTimeDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CancelNeedsAttention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CancelledReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CancelledReasonCodeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CancelledTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CellEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Consignee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_ServiceLocationDeliveryDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DelayLocationDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DelayLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DelayLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTimeDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotServiceAreaOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotServiceRadiusOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeviceStopId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToPercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EngineIdleTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EngineRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EngineRunTimeTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FuelUsedTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_DepotGeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_LayoverLocationGeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_ServiceLocationGeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAttentionReason_DepotGeocodeAttentionReason" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAttentionReason_ServiceLocationGeocodeAttentionReason" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeMethod_DepotGeocodeMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeMethod_ServiceLocationGeocodeMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GroupStopEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasBeenArrivedAt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasBeenDepartedFrom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasCoordinateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasPreferredRouteIdentifierOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasPriorityOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InternalScoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InternalScoringOptions" type="{http://roadnet.com/apex/DataContracts/}StopScoresPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="IsCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRedelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsUnserviceable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationAccountEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationAlternateContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationFixedFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationServiceAreaOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationStandardInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_LoadAction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManipulationSource_CancelSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxUrgency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedOpenCloseEarlyDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedOpenCloseLateDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowsEarlyDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowsLateDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowType_MissedTimeWindowDurationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowType_PlannedMissedTimeWindowDurationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileQuantityItemSource_Source" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NearbyPOI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseDetailsOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrdersLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Paid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlacementType_Placement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlanVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDistanceTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedIndex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedOpenCloseEarlyDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedOpenCloseLateDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedServiceWindowsEarlyDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedServiceWindowsLateDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedTimeWindowDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedRunningQuantityAfter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedServiceStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTravelTimeTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReloadTimeOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedLocationAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedLocationDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedLocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RunningQuantityAfter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Selectors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAccountEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAlternateContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationBuildingDeliverySequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCustomProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEquipmentTypeRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPriority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationServiceAreaOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationServiceRadiusOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationServiceTimeTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationStandardInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationTimeWindowTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetailsOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SignatureCaptureEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SkipSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopAlertFlags_Alerts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopReasonCodeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopState_State" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowImportance_ServiceLocationTimeWindowImportance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryDamagedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryOverQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantitiesDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantitiesPercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryShortQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalFixedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupDamagedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupOverQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantitiesDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantitiesPercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupShortQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedFixedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedVariableServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTimeDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalVariableServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelTimeTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnknownNeedsAttention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnserviceableReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnserviceableReasonCodeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelectors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPropertyOptions", propOrder = {
    "actions",
    "actionsOptions",
    "address",
    "adjustedFixedServiceTime",
    "adjustedPerUnitServiceTime",
    "arrivalTime",
    "arrivalTimeDifference",
    "arrivalTimePercentageDifference",
    "beginDate",
    "cancelNeedsAttention",
    "cancelledReasonCodeEntityKey",
    "cancelledReasonCodeIdentifier",
    "cancelledTime",
    "cellEntityKey",
    "consignee",
    "coordinate",
    "dayOfWeekFlagsServiceLocationDeliveryDays",
    "delayLocationDescription",
    "delayLocationEntityKey",
    "delayLocationIdentifier",
    "departure",
    "departureTime",
    "departureTimeDifference",
    "departureTimePercentageDifference",
    "depotAddress",
    "depotCoordinate",
    "depotDescription",
    "depotEntityKey",
    "depotIdentifier",
    "depotServiceAreaOverride",
    "depotServiceRadiusOverride",
    "deviceStopId",
    "distance",
    "distanceTo",
    "distanceToDifference",
    "distanceToPercentageDifference",
    "endDate",
    "engineIdleTime",
    "engineRunTime",
    "engineRunTimeTo",
    "fuelUsed",
    "fuelUsedTo",
    "geocodeAccuracyDepotGeocodeAccuracy",
    "geocodeAccuracyLayoverLocationGeocodeAccuracy",
    "geocodeAccuracyServiceLocationGeocodeAccuracy",
    "geocodeAttentionReasonDepotGeocodeAttentionReason",
    "geocodeAttentionReasonServiceLocationGeocodeAttentionReason",
    "geocodeMethodDepotGeocodeMethod",
    "geocodeMethodServiceLocationGeocodeMethod",
    "groupStopEntityKey",
    "hasBeenArrivedAt",
    "hasBeenDepartedFrom",
    "hasCoordinateOverride",
    "hasPreferredRouteIdentifierOverride",
    "hasPriorityOverride",
    "hasSignature",
    "index",
    "internalScoring",
    "internalScoringOptions",
    "isCancelled",
    "isRedelivery",
    "isSuspended",
    "isUnserviceable",
    "layoverLocationAccountEntityKey",
    "layoverLocationAddress",
    "layoverLocationAlternateContact",
    "layoverLocationContact",
    "layoverLocationDescription",
    "layoverLocationEntityKey",
    "layoverLocationFixedFee",
    "layoverLocationIdentifier",
    "layoverLocationIsDeleted",
    "layoverLocationPhoneNumber",
    "layoverLocationServiceAreaOverride",
    "layoverLocationStandardInstructions",
    "loadActionLoadAction",
    "manipulationSourceCancelSource",
    "maxUrgency",
    "missedOpenCloseEarlyDuration",
    "missedOpenCloseLateDuration",
    "missedServiceWindowsEarlyDuration",
    "missedServiceWindowsLateDuration",
    "missedTimeWindowDuration",
    "missedTimeWindowTypeMissedTimeWindowDurationType",
    "missedTimeWindowTypePlannedMissedTimeWindowDurationType",
    "mobileQuantityItemSourceSource",
    "nearbyPOI",
    "netRevenue",
    "numberOfOrders",
    "openCloseDetails",
    "openCloseDetailsOptions",
    "orderClassEntityKeys",
    "ordersLocked",
    "paid",
    "placementTypePlacement",
    "planVersion",
    "plannedArrivalTime",
    "plannedDepartureTime",
    "plannedDistance",
    "plannedDistanceTo",
    "plannedIndex",
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
    "plannedTravelTimeTo",
    "preferredRouteIdentifier",
    "priority",
    "reloadTimeOverride",
    "restrictedLocationAddress",
    "restrictedLocationDescription",
    "restrictedLocationEntityKey",
    "restrictedLocationIdentifier",
    "restrictedLocationIsDeleted",
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
    "serviceWindowDetailsOptions",
    "signature",
    "signatureCaptureEntityKey",
    "skipSignature",
    "specialInstructions",
    "stopAlertFlagsAlerts",
    "stopReasonCodeDescription",
    "stopReasonCodeEntityKey",
    "stopReasonCodeIdentifier",
    "stopStateState",
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
    "travelTimeTo",
    "unknownNeedsAttention",
    "unserviceableReasonCodeEntityKey",
    "unserviceableReasonCodeIdentifier",
    "uploadSelectors",
    "worldTimeZoneTimeZone"
})
public class StopPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Actions")
    protected Boolean actions;
    @XmlElementRef(name = "ActionsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StopActionPropertyOptions> actionsOptions;
    @XmlElement(name = "Address")
    protected Boolean address;
    @XmlElement(name = "AdjustedFixedServiceTime")
    protected Boolean adjustedFixedServiceTime;
    @XmlElement(name = "AdjustedPerUnitServiceTime")
    protected Boolean adjustedPerUnitServiceTime;
    @XmlElement(name = "ArrivalTime")
    protected Boolean arrivalTime;
    @XmlElement(name = "ArrivalTimeDifference")
    protected Boolean arrivalTimeDifference;
    @XmlElement(name = "ArrivalTimePercentageDifference")
    protected Boolean arrivalTimePercentageDifference;
    @XmlElement(name = "BeginDate")
    protected Boolean beginDate;
    @XmlElement(name = "CancelNeedsAttention")
    protected Boolean cancelNeedsAttention;
    @XmlElement(name = "CancelledReasonCodeEntityKey")
    protected Boolean cancelledReasonCodeEntityKey;
    @XmlElement(name = "CancelledReasonCodeIdentifier")
    protected Boolean cancelledReasonCodeIdentifier;
    @XmlElement(name = "CancelledTime")
    protected Boolean cancelledTime;
    @XmlElement(name = "CellEntityKey")
    protected Boolean cellEntityKey;
    @XmlElement(name = "Consignee")
    protected Boolean consignee;
    @XmlElement(name = "Coordinate")
    protected Boolean coordinate;
    @XmlElement(name = "DayOfWeekFlags_ServiceLocationDeliveryDays")
    protected Boolean dayOfWeekFlagsServiceLocationDeliveryDays;
    @XmlElement(name = "DelayLocationDescription")
    protected Boolean delayLocationDescription;
    @XmlElement(name = "DelayLocationEntityKey")
    protected Boolean delayLocationEntityKey;
    @XmlElement(name = "DelayLocationIdentifier")
    protected Boolean delayLocationIdentifier;
    @XmlElement(name = "Departure")
    protected Boolean departure;
    @XmlElement(name = "DepartureTime")
    protected Boolean departureTime;
    @XmlElement(name = "DepartureTimeDifference")
    protected Boolean departureTimeDifference;
    @XmlElement(name = "DepartureTimePercentageDifference")
    protected Boolean departureTimePercentageDifference;
    @XmlElement(name = "DepotAddress")
    protected Boolean depotAddress;
    @XmlElement(name = "DepotCoordinate")
    protected Boolean depotCoordinate;
    @XmlElement(name = "DepotDescription")
    protected Boolean depotDescription;
    @XmlElement(name = "DepotEntityKey")
    protected Boolean depotEntityKey;
    @XmlElement(name = "DepotIdentifier")
    protected Boolean depotIdentifier;
    @XmlElement(name = "DepotServiceAreaOverride")
    protected Boolean depotServiceAreaOverride;
    @XmlElement(name = "DepotServiceRadiusOverride")
    protected Boolean depotServiceRadiusOverride;
    @XmlElement(name = "DeviceStopId")
    protected Boolean deviceStopId;
    @XmlElement(name = "Distance")
    protected Boolean distance;
    @XmlElement(name = "DistanceTo")
    protected Boolean distanceTo;
    @XmlElement(name = "DistanceToDifference")
    protected Boolean distanceToDifference;
    @XmlElement(name = "DistanceToPercentageDifference")
    protected Boolean distanceToPercentageDifference;
    @XmlElement(name = "EndDate")
    protected Boolean endDate;
    @XmlElement(name = "EngineIdleTime")
    protected Boolean engineIdleTime;
    @XmlElement(name = "EngineRunTime")
    protected Boolean engineRunTime;
    @XmlElement(name = "EngineRunTimeTo")
    protected Boolean engineRunTimeTo;
    @XmlElement(name = "FuelUsed")
    protected Boolean fuelUsed;
    @XmlElement(name = "FuelUsedTo")
    protected Boolean fuelUsedTo;
    @XmlElement(name = "GeocodeAccuracy_DepotGeocodeAccuracy")
    protected Boolean geocodeAccuracyDepotGeocodeAccuracy;
    @XmlElement(name = "GeocodeAccuracy_LayoverLocationGeocodeAccuracy")
    protected Boolean geocodeAccuracyLayoverLocationGeocodeAccuracy;
    @XmlElement(name = "GeocodeAccuracy_ServiceLocationGeocodeAccuracy")
    protected Boolean geocodeAccuracyServiceLocationGeocodeAccuracy;
    @XmlElement(name = "GeocodeAttentionReason_DepotGeocodeAttentionReason")
    protected Boolean geocodeAttentionReasonDepotGeocodeAttentionReason;
    @XmlElement(name = "GeocodeAttentionReason_ServiceLocationGeocodeAttentionReason")
    protected Boolean geocodeAttentionReasonServiceLocationGeocodeAttentionReason;
    @XmlElement(name = "GeocodeMethod_DepotGeocodeMethod")
    protected Boolean geocodeMethodDepotGeocodeMethod;
    @XmlElement(name = "GeocodeMethod_ServiceLocationGeocodeMethod")
    protected Boolean geocodeMethodServiceLocationGeocodeMethod;
    @XmlElement(name = "GroupStopEntityKey")
    protected Boolean groupStopEntityKey;
    @XmlElement(name = "HasBeenArrivedAt")
    protected Boolean hasBeenArrivedAt;
    @XmlElement(name = "HasBeenDepartedFrom")
    protected Boolean hasBeenDepartedFrom;
    @XmlElement(name = "HasCoordinateOverride")
    protected Boolean hasCoordinateOverride;
    @XmlElement(name = "HasPreferredRouteIdentifierOverride")
    protected Boolean hasPreferredRouteIdentifierOverride;
    @XmlElement(name = "HasPriorityOverride")
    protected Boolean hasPriorityOverride;
    @XmlElement(name = "HasSignature")
    protected Boolean hasSignature;
    @XmlElement(name = "Index")
    protected Boolean index;
    @XmlElement(name = "InternalScoring")
    protected Boolean internalScoring;
    @XmlElementRef(name = "InternalScoringOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StopScoresPropertyOptions> internalScoringOptions;
    @XmlElement(name = "IsCancelled")
    protected Boolean isCancelled;
    @XmlElement(name = "IsRedelivery")
    protected Boolean isRedelivery;
    @XmlElement(name = "IsSuspended")
    protected Boolean isSuspended;
    @XmlElement(name = "IsUnserviceable")
    protected Boolean isUnserviceable;
    @XmlElement(name = "LayoverLocationAccountEntityKey")
    protected Boolean layoverLocationAccountEntityKey;
    @XmlElement(name = "LayoverLocationAddress")
    protected Boolean layoverLocationAddress;
    @XmlElement(name = "LayoverLocationAlternateContact")
    protected Boolean layoverLocationAlternateContact;
    @XmlElement(name = "LayoverLocationContact")
    protected Boolean layoverLocationContact;
    @XmlElement(name = "LayoverLocationDescription")
    protected Boolean layoverLocationDescription;
    @XmlElement(name = "LayoverLocationEntityKey")
    protected Boolean layoverLocationEntityKey;
    @XmlElement(name = "LayoverLocationFixedFee")
    protected Boolean layoverLocationFixedFee;
    @XmlElement(name = "LayoverLocationIdentifier")
    protected Boolean layoverLocationIdentifier;
    @XmlElement(name = "LayoverLocationIsDeleted")
    protected Boolean layoverLocationIsDeleted;
    @XmlElement(name = "LayoverLocationPhoneNumber")
    protected Boolean layoverLocationPhoneNumber;
    @XmlElement(name = "LayoverLocationServiceAreaOverride")
    protected Boolean layoverLocationServiceAreaOverride;
    @XmlElement(name = "LayoverLocationStandardInstructions")
    protected Boolean layoverLocationStandardInstructions;
    @XmlElement(name = "LoadAction_LoadAction")
    protected Boolean loadActionLoadAction;
    @XmlElement(name = "ManipulationSource_CancelSource")
    protected Boolean manipulationSourceCancelSource;
    @XmlElement(name = "MaxUrgency")
    protected Boolean maxUrgency;
    @XmlElement(name = "MissedOpenCloseEarlyDuration")
    protected Boolean missedOpenCloseEarlyDuration;
    @XmlElement(name = "MissedOpenCloseLateDuration")
    protected Boolean missedOpenCloseLateDuration;
    @XmlElement(name = "MissedServiceWindowsEarlyDuration")
    protected Boolean missedServiceWindowsEarlyDuration;
    @XmlElement(name = "MissedServiceWindowsLateDuration")
    protected Boolean missedServiceWindowsLateDuration;
    @XmlElement(name = "MissedTimeWindowDuration")
    protected Boolean missedTimeWindowDuration;
    @XmlElement(name = "MissedTimeWindowType_MissedTimeWindowDurationType")
    protected Boolean missedTimeWindowTypeMissedTimeWindowDurationType;
    @XmlElement(name = "MissedTimeWindowType_PlannedMissedTimeWindowDurationType")
    protected Boolean missedTimeWindowTypePlannedMissedTimeWindowDurationType;
    @XmlElement(name = "MobileQuantityItemSource_Source")
    protected Boolean mobileQuantityItemSourceSource;
    @XmlElement(name = "NearbyPOI")
    protected Boolean nearbyPOI;
    @XmlElement(name = "NetRevenue")
    protected Boolean netRevenue;
    @XmlElement(name = "NumberOfOrders")
    protected Boolean numberOfOrders;
    @XmlElement(name = "OpenCloseDetails")
    protected Boolean openCloseDetails;
    @XmlElementRef(name = "OpenCloseDetailsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> openCloseDetailsOptions;
    @XmlElement(name = "OrderClassEntityKeys")
    protected Boolean orderClassEntityKeys;
    @XmlElement(name = "OrdersLocked")
    protected Boolean ordersLocked;
    @XmlElement(name = "Paid")
    protected Boolean paid;
    @XmlElement(name = "PlacementType_Placement")
    protected Boolean placementTypePlacement;
    @XmlElement(name = "PlanVersion")
    protected Boolean planVersion;
    @XmlElement(name = "PlannedArrivalTime")
    protected Boolean plannedArrivalTime;
    @XmlElement(name = "PlannedDepartureTime")
    protected Boolean plannedDepartureTime;
    @XmlElement(name = "PlannedDistance")
    protected Boolean plannedDistance;
    @XmlElement(name = "PlannedDistanceTo")
    protected Boolean plannedDistanceTo;
    @XmlElement(name = "PlannedIndex")
    protected Boolean plannedIndex;
    @XmlElement(name = "PlannedMissedOpenCloseEarlyDuration")
    protected Boolean plannedMissedOpenCloseEarlyDuration;
    @XmlElement(name = "PlannedMissedOpenCloseLateDuration")
    protected Boolean plannedMissedOpenCloseLateDuration;
    @XmlElement(name = "PlannedMissedServiceWindowsEarlyDuration")
    protected Boolean plannedMissedServiceWindowsEarlyDuration;
    @XmlElement(name = "PlannedMissedServiceWindowsLateDuration")
    protected Boolean plannedMissedServiceWindowsLateDuration;
    @XmlElement(name = "PlannedMissedTimeWindowDuration")
    protected Boolean plannedMissedTimeWindowDuration;
    @XmlElement(name = "PlannedRunningQuantityAfter")
    protected Boolean plannedRunningQuantityAfter;
    @XmlElement(name = "PlannedSequenceNumber")
    protected Boolean plannedSequenceNumber;
    @XmlElement(name = "PlannedServiceStartTime")
    protected Boolean plannedServiceStartTime;
    @XmlElement(name = "PlannedTotalDeliveryCategory1Quantities")
    protected Boolean plannedTotalDeliveryCategory1Quantities;
    @XmlElement(name = "PlannedTotalDeliveryCategory2Quantities")
    protected Boolean plannedTotalDeliveryCategory2Quantities;
    @XmlElement(name = "PlannedTotalDeliveryCategory3Quantities")
    protected Boolean plannedTotalDeliveryCategory3Quantities;
    @XmlElement(name = "PlannedTotalPickupCategory1Quantities")
    protected Boolean plannedTotalPickupCategory1Quantities;
    @XmlElement(name = "PlannedTotalPickupCategory2Quantities")
    protected Boolean plannedTotalPickupCategory2Quantities;
    @XmlElement(name = "PlannedTotalPickupCategory3Quantities")
    protected Boolean plannedTotalPickupCategory3Quantities;
    @XmlElement(name = "PlannedTravelTimeTo")
    protected Boolean plannedTravelTimeTo;
    @XmlElement(name = "PreferredRouteIdentifier")
    protected Boolean preferredRouteIdentifier;
    @XmlElement(name = "Priority")
    protected Boolean priority;
    @XmlElement(name = "ReloadTimeOverride")
    protected Boolean reloadTimeOverride;
    @XmlElement(name = "RestrictedLocationAddress")
    protected Boolean restrictedLocationAddress;
    @XmlElement(name = "RestrictedLocationDescription")
    protected Boolean restrictedLocationDescription;
    @XmlElement(name = "RestrictedLocationEntityKey")
    protected Boolean restrictedLocationEntityKey;
    @XmlElement(name = "RestrictedLocationIdentifier")
    protected Boolean restrictedLocationIdentifier;
    @XmlElement(name = "RestrictedLocationIsDeleted")
    protected Boolean restrictedLocationIsDeleted;
    @XmlElement(name = "RouteIdentifier")
    protected Boolean routeIdentifier;
    @XmlElement(name = "RunningQuantityAfter")
    protected Boolean runningQuantityAfter;
    @XmlElement(name = "Selectors")
    protected Boolean selectors;
    @XmlElement(name = "SequenceNumber")
    protected Boolean sequenceNumber;
    @XmlElement(name = "ServiceLocationAccountEntityKey")
    protected Boolean serviceLocationAccountEntityKey;
    @XmlElement(name = "ServiceLocationAddress")
    protected Boolean serviceLocationAddress;
    @XmlElement(name = "ServiceLocationAlternateContact")
    protected Boolean serviceLocationAlternateContact;
    @XmlElement(name = "ServiceLocationBuildingDeliverySequence")
    protected Boolean serviceLocationBuildingDeliverySequence;
    @XmlElement(name = "ServiceLocationCategoryEntityKey")
    protected Boolean serviceLocationCategoryEntityKey;
    @XmlElement(name = "ServiceLocationContact")
    protected Boolean serviceLocationContact;
    @XmlElement(name = "ServiceLocationCustomProperties")
    protected Boolean serviceLocationCustomProperties;
    @XmlElement(name = "ServiceLocationDescription")
    protected Boolean serviceLocationDescription;
    @XmlElement(name = "ServiceLocationEntityKey")
    protected Boolean serviceLocationEntityKey;
    @XmlElement(name = "ServiceLocationEquipmentTypeRestrictions")
    protected Boolean serviceLocationEquipmentTypeRestrictions;
    @XmlElement(name = "ServiceLocationIdentifier")
    protected Boolean serviceLocationIdentifier;
    @XmlElement(name = "ServiceLocationIsDeleted")
    protected Boolean serviceLocationIsDeleted;
    @XmlElement(name = "ServiceLocationPhoneNumber")
    protected Boolean serviceLocationPhoneNumber;
    @XmlElement(name = "ServiceLocationPreferredRouteIdentifier")
    protected Boolean serviceLocationPreferredRouteIdentifier;
    @XmlElement(name = "ServiceLocationPriority")
    protected Boolean serviceLocationPriority;
    @XmlElement(name = "ServiceLocationServiceAreaOverride")
    protected Boolean serviceLocationServiceAreaOverride;
    @XmlElement(name = "ServiceLocationServiceRadiusOverride")
    protected Boolean serviceLocationServiceRadiusOverride;
    @XmlElement(name = "ServiceLocationServiceTimeTypeEntityKey")
    protected Boolean serviceLocationServiceTimeTypeEntityKey;
    @XmlElement(name = "ServiceLocationStandardInstructions")
    protected Boolean serviceLocationStandardInstructions;
    @XmlElement(name = "ServiceLocationTimeWindowTypeEntityKey")
    protected Boolean serviceLocationTimeWindowTypeEntityKey;
    @XmlElement(name = "ServiceLocationZone")
    protected Boolean serviceLocationZone;
    @XmlElement(name = "ServiceStartTime")
    protected Boolean serviceStartTime;
    @XmlElement(name = "ServiceWindowDetails")
    protected Boolean serviceWindowDetails;
    @XmlElementRef(name = "ServiceWindowDetailsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceWindowDetailPropertyOptions> serviceWindowDetailsOptions;
    @XmlElement(name = "Signature")
    protected Boolean signature;
    @XmlElement(name = "SignatureCaptureEntityKey")
    protected Boolean signatureCaptureEntityKey;
    @XmlElement(name = "SkipSignature")
    protected Boolean skipSignature;
    @XmlElement(name = "SpecialInstructions")
    protected Boolean specialInstructions;
    @XmlElement(name = "StopAlertFlags_Alerts")
    protected Boolean stopAlertFlagsAlerts;
    @XmlElement(name = "StopReasonCodeDescription")
    protected Boolean stopReasonCodeDescription;
    @XmlElement(name = "StopReasonCodeEntityKey")
    protected Boolean stopReasonCodeEntityKey;
    @XmlElement(name = "StopReasonCodeIdentifier")
    protected Boolean stopReasonCodeIdentifier;
    @XmlElement(name = "StopState_State")
    protected Boolean stopStateState;
    @XmlElement(name = "TimeWindowImportance_ServiceLocationTimeWindowImportance")
    protected Boolean timeWindowImportanceServiceLocationTimeWindowImportance;
    @XmlElement(name = "TotalDeliveryDamagedQuantities")
    protected Boolean totalDeliveryDamagedQuantities;
    @XmlElement(name = "TotalDeliveryOverQuantities")
    protected Boolean totalDeliveryOverQuantities;
    @XmlElement(name = "TotalDeliveryQuantities")
    protected Boolean totalDeliveryQuantities;
    @XmlElement(name = "TotalDeliveryQuantitiesDifference")
    protected Boolean totalDeliveryQuantitiesDifference;
    @XmlElement(name = "TotalDeliveryQuantitiesPercentageDifference")
    protected Boolean totalDeliveryQuantitiesPercentageDifference;
    @XmlElement(name = "TotalDeliveryShortQuantities")
    protected Boolean totalDeliveryShortQuantities;
    @XmlElement(name = "TotalFee")
    protected Boolean totalFee;
    @XmlElement(name = "TotalFixedServiceTime")
    protected Boolean totalFixedServiceTime;
    @XmlElement(name = "TotalPickupDamagedQuantities")
    protected Boolean totalPickupDamagedQuantities;
    @XmlElement(name = "TotalPickupOverQuantities")
    protected Boolean totalPickupOverQuantities;
    @XmlElement(name = "TotalPickupQuantities")
    protected Boolean totalPickupQuantities;
    @XmlElement(name = "TotalPickupQuantitiesDifference")
    protected Boolean totalPickupQuantitiesDifference;
    @XmlElement(name = "TotalPickupQuantitiesPercentageDifference")
    protected Boolean totalPickupQuantitiesPercentageDifference;
    @XmlElement(name = "TotalPickupShortQuantities")
    protected Boolean totalPickupShortQuantities;
    @XmlElement(name = "TotalPlannedDeliveryQuantities")
    protected Boolean totalPlannedDeliveryQuantities;
    @XmlElement(name = "TotalPlannedFee")
    protected Boolean totalPlannedFee;
    @XmlElement(name = "TotalPlannedFixedServiceTime")
    protected Boolean totalPlannedFixedServiceTime;
    @XmlElement(name = "TotalPlannedPickupQuantities")
    protected Boolean totalPlannedPickupQuantities;
    @XmlElement(name = "TotalPlannedServiceTime")
    protected Boolean totalPlannedServiceTime;
    @XmlElement(name = "TotalPlannedVariableServiceTime")
    protected Boolean totalPlannedVariableServiceTime;
    @XmlElement(name = "TotalServiceTime")
    protected Boolean totalServiceTime;
    @XmlElement(name = "TotalServiceTimeDifference")
    protected Boolean totalServiceTimeDifference;
    @XmlElement(name = "TotalServiceTimePercentageDifference")
    protected Boolean totalServiceTimePercentageDifference;
    @XmlElement(name = "TotalVariableServiceTime")
    protected Boolean totalVariableServiceTime;
    @XmlElement(name = "TravelTimeTo")
    protected Boolean travelTimeTo;
    @XmlElement(name = "UnknownNeedsAttention")
    protected Boolean unknownNeedsAttention;
    @XmlElement(name = "UnserviceableReasonCodeEntityKey")
    protected Boolean unserviceableReasonCodeEntityKey;
    @XmlElement(name = "UnserviceableReasonCodeIdentifier")
    protected Boolean unserviceableReasonCodeIdentifier;
    @XmlElement(name = "UploadSelectors")
    protected Boolean uploadSelectors;
    @XmlElement(name = "WorldTimeZone_TimeZone")
    protected Boolean worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade actions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActions() {
        return actions;
    }

    /**
     * Define o valor da propriedade actions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActions(Boolean value) {
        this.actions = value;
    }

    /**
     * Obtém o valor da propriedade actionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopActionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<StopActionPropertyOptions> getActionsOptions() {
        return actionsOptions;
    }

    /**
     * Define o valor da propriedade actionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopActionPropertyOptions }{@code >}
     *     
     */
    public void setActionsOptions(JAXBElement<StopActionPropertyOptions> value) {
        this.actionsOptions = value;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddress(Boolean value) {
        this.address = value;
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
     * Obtém o valor da propriedade arrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrivalTime() {
        return arrivalTime;
    }

    /**
     * Define o valor da propriedade arrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrivalTime(Boolean value) {
        this.arrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade arrivalTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrivalTimeDifference() {
        return arrivalTimeDifference;
    }

    /**
     * Define o valor da propriedade arrivalTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrivalTimeDifference(Boolean value) {
        this.arrivalTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade arrivalTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrivalTimePercentageDifference() {
        return arrivalTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade arrivalTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrivalTimePercentageDifference(Boolean value) {
        this.arrivalTimePercentageDifference = value;
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
     * Obtém o valor da propriedade cancelNeedsAttention.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelNeedsAttention() {
        return cancelNeedsAttention;
    }

    /**
     * Define o valor da propriedade cancelNeedsAttention.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelNeedsAttention(Boolean value) {
        this.cancelNeedsAttention = value;
    }

    /**
     * Obtém o valor da propriedade cancelledReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelledReasonCodeEntityKey() {
        return cancelledReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade cancelledReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelledReasonCodeEntityKey(Boolean value) {
        this.cancelledReasonCodeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade cancelledReasonCodeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelledReasonCodeIdentifier() {
        return cancelledReasonCodeIdentifier;
    }

    /**
     * Define o valor da propriedade cancelledReasonCodeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelledReasonCodeIdentifier(Boolean value) {
        this.cancelledReasonCodeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade cancelledTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelledTime() {
        return cancelledTime;
    }

    /**
     * Define o valor da propriedade cancelledTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelledTime(Boolean value) {
        this.cancelledTime = value;
    }

    /**
     * Obtém o valor da propriedade cellEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCellEntityKey() {
        return cellEntityKey;
    }

    /**
     * Define o valor da propriedade cellEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCellEntityKey(Boolean value) {
        this.cellEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade consignee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsignee() {
        return consignee;
    }

    /**
     * Define o valor da propriedade consignee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsignee(Boolean value) {
        this.consignee = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoordinate(Boolean value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsServiceLocationDeliveryDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayOfWeekFlagsServiceLocationDeliveryDays() {
        return dayOfWeekFlagsServiceLocationDeliveryDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsServiceLocationDeliveryDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayOfWeekFlagsServiceLocationDeliveryDays(Boolean value) {
        this.dayOfWeekFlagsServiceLocationDeliveryDays = value;
    }

    /**
     * Obtém o valor da propriedade delayLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelayLocationDescription() {
        return delayLocationDescription;
    }

    /**
     * Define o valor da propriedade delayLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelayLocationDescription(Boolean value) {
        this.delayLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade delayLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelayLocationEntityKey() {
        return delayLocationEntityKey;
    }

    /**
     * Define o valor da propriedade delayLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelayLocationEntityKey(Boolean value) {
        this.delayLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade delayLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelayLocationIdentifier() {
        return delayLocationIdentifier;
    }

    /**
     * Define o valor da propriedade delayLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelayLocationIdentifier(Boolean value) {
        this.delayLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade departure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeparture() {
        return departure;
    }

    /**
     * Define o valor da propriedade departure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeparture(Boolean value) {
        this.departure = value;
    }

    /**
     * Obtém o valor da propriedade departureTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepartureTime() {
        return departureTime;
    }

    /**
     * Define o valor da propriedade departureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepartureTime(Boolean value) {
        this.departureTime = value;
    }

    /**
     * Obtém o valor da propriedade departureTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepartureTimeDifference() {
        return departureTimeDifference;
    }

    /**
     * Define o valor da propriedade departureTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepartureTimeDifference(Boolean value) {
        this.departureTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade departureTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepartureTimePercentageDifference() {
        return departureTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade departureTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepartureTimePercentageDifference(Boolean value) {
        this.departureTimePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade depotAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotAddress() {
        return depotAddress;
    }

    /**
     * Define o valor da propriedade depotAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotAddress(Boolean value) {
        this.depotAddress = value;
    }

    /**
     * Obtém o valor da propriedade depotCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotCoordinate() {
        return depotCoordinate;
    }

    /**
     * Define o valor da propriedade depotCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotCoordinate(Boolean value) {
        this.depotCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade depotDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotDescription() {
        return depotDescription;
    }

    /**
     * Define o valor da propriedade depotDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotDescription(Boolean value) {
        this.depotDescription = value;
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
     * Obtém o valor da propriedade depotIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotIdentifier() {
        return depotIdentifier;
    }

    /**
     * Define o valor da propriedade depotIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotIdentifier(Boolean value) {
        this.depotIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade depotServiceAreaOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotServiceAreaOverride() {
        return depotServiceAreaOverride;
    }

    /**
     * Define o valor da propriedade depotServiceAreaOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotServiceAreaOverride(Boolean value) {
        this.depotServiceAreaOverride = value;
    }

    /**
     * Obtém o valor da propriedade depotServiceRadiusOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotServiceRadiusOverride() {
        return depotServiceRadiusOverride;
    }

    /**
     * Define o valor da propriedade depotServiceRadiusOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotServiceRadiusOverride(Boolean value) {
        this.depotServiceRadiusOverride = value;
    }

    /**
     * Obtém o valor da propriedade deviceStopId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviceStopId() {
        return deviceStopId;
    }

    /**
     * Define o valor da propriedade deviceStopId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviceStopId(Boolean value) {
        this.deviceStopId = value;
    }

    /**
     * Obtém o valor da propriedade distance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistance() {
        return distance;
    }

    /**
     * Define o valor da propriedade distance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistance(Boolean value) {
        this.distance = value;
    }

    /**
     * Obtém o valor da propriedade distanceTo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceTo() {
        return distanceTo;
    }

    /**
     * Define o valor da propriedade distanceTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceTo(Boolean value) {
        this.distanceTo = value;
    }

    /**
     * Obtém o valor da propriedade distanceToDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceToDifference() {
        return distanceToDifference;
    }

    /**
     * Define o valor da propriedade distanceToDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceToDifference(Boolean value) {
        this.distanceToDifference = value;
    }

    /**
     * Obtém o valor da propriedade distanceToPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceToPercentageDifference() {
        return distanceToPercentageDifference;
    }

    /**
     * Define o valor da propriedade distanceToPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceToPercentageDifference(Boolean value) {
        this.distanceToPercentageDifference = value;
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
     * Obtém o valor da propriedade engineIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEngineIdleTime() {
        return engineIdleTime;
    }

    /**
     * Define o valor da propriedade engineIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEngineIdleTime(Boolean value) {
        this.engineIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade engineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEngineRunTime() {
        return engineRunTime;
    }

    /**
     * Define o valor da propriedade engineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEngineRunTime(Boolean value) {
        this.engineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade engineRunTimeTo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEngineRunTimeTo() {
        return engineRunTimeTo;
    }

    /**
     * Define o valor da propriedade engineRunTimeTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEngineRunTimeTo(Boolean value) {
        this.engineRunTimeTo = value;
    }

    /**
     * Obtém o valor da propriedade fuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuelUsed() {
        return fuelUsed;
    }

    /**
     * Define o valor da propriedade fuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuelUsed(Boolean value) {
        this.fuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade fuelUsedTo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuelUsedTo() {
        return fuelUsedTo;
    }

    /**
     * Define o valor da propriedade fuelUsedTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuelUsedTo(Boolean value) {
        this.fuelUsedTo = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyDepotGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAccuracyDepotGeocodeAccuracy() {
        return geocodeAccuracyDepotGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyDepotGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAccuracyDepotGeocodeAccuracy(Boolean value) {
        this.geocodeAccuracyDepotGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyLayoverLocationGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAccuracyLayoverLocationGeocodeAccuracy() {
        return geocodeAccuracyLayoverLocationGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyLayoverLocationGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAccuracyLayoverLocationGeocodeAccuracy(Boolean value) {
        this.geocodeAccuracyLayoverLocationGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyServiceLocationGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAccuracyServiceLocationGeocodeAccuracy() {
        return geocodeAccuracyServiceLocationGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyServiceLocationGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAccuracyServiceLocationGeocodeAccuracy(Boolean value) {
        this.geocodeAccuracyServiceLocationGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAttentionReasonDepotGeocodeAttentionReason.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAttentionReasonDepotGeocodeAttentionReason() {
        return geocodeAttentionReasonDepotGeocodeAttentionReason;
    }

    /**
     * Define o valor da propriedade geocodeAttentionReasonDepotGeocodeAttentionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAttentionReasonDepotGeocodeAttentionReason(Boolean value) {
        this.geocodeAttentionReasonDepotGeocodeAttentionReason = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAttentionReasonServiceLocationGeocodeAttentionReason.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAttentionReasonServiceLocationGeocodeAttentionReason() {
        return geocodeAttentionReasonServiceLocationGeocodeAttentionReason;
    }

    /**
     * Define o valor da propriedade geocodeAttentionReasonServiceLocationGeocodeAttentionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAttentionReasonServiceLocationGeocodeAttentionReason(Boolean value) {
        this.geocodeAttentionReasonServiceLocationGeocodeAttentionReason = value;
    }

    /**
     * Obtém o valor da propriedade geocodeMethodDepotGeocodeMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeMethodDepotGeocodeMethod() {
        return geocodeMethodDepotGeocodeMethod;
    }

    /**
     * Define o valor da propriedade geocodeMethodDepotGeocodeMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeMethodDepotGeocodeMethod(Boolean value) {
        this.geocodeMethodDepotGeocodeMethod = value;
    }

    /**
     * Obtém o valor da propriedade geocodeMethodServiceLocationGeocodeMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeMethodServiceLocationGeocodeMethod() {
        return geocodeMethodServiceLocationGeocodeMethod;
    }

    /**
     * Define o valor da propriedade geocodeMethodServiceLocationGeocodeMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeMethodServiceLocationGeocodeMethod(Boolean value) {
        this.geocodeMethodServiceLocationGeocodeMethod = value;
    }

    /**
     * Obtém o valor da propriedade groupStopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupStopEntityKey() {
        return groupStopEntityKey;
    }

    /**
     * Define o valor da propriedade groupStopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupStopEntityKey(Boolean value) {
        this.groupStopEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade hasBeenArrivedAt.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBeenArrivedAt() {
        return hasBeenArrivedAt;
    }

    /**
     * Define o valor da propriedade hasBeenArrivedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBeenArrivedAt(Boolean value) {
        this.hasBeenArrivedAt = value;
    }

    /**
     * Obtém o valor da propriedade hasBeenDepartedFrom.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBeenDepartedFrom() {
        return hasBeenDepartedFrom;
    }

    /**
     * Define o valor da propriedade hasBeenDepartedFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBeenDepartedFrom(Boolean value) {
        this.hasBeenDepartedFrom = value;
    }

    /**
     * Obtém o valor da propriedade hasCoordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasCoordinateOverride() {
        return hasCoordinateOverride;
    }

    /**
     * Define o valor da propriedade hasCoordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCoordinateOverride(Boolean value) {
        this.hasCoordinateOverride = value;
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
     * Obtém o valor da propriedade index.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndex() {
        return index;
    }

    /**
     * Define o valor da propriedade index.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndex(Boolean value) {
        this.index = value;
    }

    /**
     * Obtém o valor da propriedade internalScoring.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternalScoring() {
        return internalScoring;
    }

    /**
     * Define o valor da propriedade internalScoring.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternalScoring(Boolean value) {
        this.internalScoring = value;
    }

    /**
     * Obtém o valor da propriedade internalScoringOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopScoresPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<StopScoresPropertyOptions> getInternalScoringOptions() {
        return internalScoringOptions;
    }

    /**
     * Define o valor da propriedade internalScoringOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopScoresPropertyOptions }{@code >}
     *     
     */
    public void setInternalScoringOptions(JAXBElement<StopScoresPropertyOptions> value) {
        this.internalScoringOptions = value;
    }

    /**
     * Obtém o valor da propriedade isCancelled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelled() {
        return isCancelled;
    }

    /**
     * Define o valor da propriedade isCancelled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelled(Boolean value) {
        this.isCancelled = value;
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
     * Obtém o valor da propriedade layoverLocationAccountEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationAccountEntityKey() {
        return layoverLocationAccountEntityKey;
    }

    /**
     * Define o valor da propriedade layoverLocationAccountEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationAccountEntityKey(Boolean value) {
        this.layoverLocationAccountEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationAddress() {
        return layoverLocationAddress;
    }

    /**
     * Define o valor da propriedade layoverLocationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationAddress(Boolean value) {
        this.layoverLocationAddress = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationAlternateContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationAlternateContact() {
        return layoverLocationAlternateContact;
    }

    /**
     * Define o valor da propriedade layoverLocationAlternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationAlternateContact(Boolean value) {
        this.layoverLocationAlternateContact = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationContact() {
        return layoverLocationContact;
    }

    /**
     * Define o valor da propriedade layoverLocationContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationContact(Boolean value) {
        this.layoverLocationContact = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationDescription() {
        return layoverLocationDescription;
    }

    /**
     * Define o valor da propriedade layoverLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationDescription(Boolean value) {
        this.layoverLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationEntityKey() {
        return layoverLocationEntityKey;
    }

    /**
     * Define o valor da propriedade layoverLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationEntityKey(Boolean value) {
        this.layoverLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationFixedFee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationFixedFee() {
        return layoverLocationFixedFee;
    }

    /**
     * Define o valor da propriedade layoverLocationFixedFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationFixedFee(Boolean value) {
        this.layoverLocationFixedFee = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationIdentifier() {
        return layoverLocationIdentifier;
    }

    /**
     * Define o valor da propriedade layoverLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationIdentifier(Boolean value) {
        this.layoverLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationIsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationIsDeleted() {
        return layoverLocationIsDeleted;
    }

    /**
     * Define o valor da propriedade layoverLocationIsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationIsDeleted(Boolean value) {
        this.layoverLocationIsDeleted = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationPhoneNumber() {
        return layoverLocationPhoneNumber;
    }

    /**
     * Define o valor da propriedade layoverLocationPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationPhoneNumber(Boolean value) {
        this.layoverLocationPhoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationServiceAreaOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationServiceAreaOverride() {
        return layoverLocationServiceAreaOverride;
    }

    /**
     * Define o valor da propriedade layoverLocationServiceAreaOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationServiceAreaOverride(Boolean value) {
        this.layoverLocationServiceAreaOverride = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationStandardInstructions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationStandardInstructions() {
        return layoverLocationStandardInstructions;
    }

    /**
     * Define o valor da propriedade layoverLocationStandardInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationStandardInstructions(Boolean value) {
        this.layoverLocationStandardInstructions = value;
    }

    /**
     * Obtém o valor da propriedade loadActionLoadAction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadActionLoadAction() {
        return loadActionLoadAction;
    }

    /**
     * Define o valor da propriedade loadActionLoadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadActionLoadAction(Boolean value) {
        this.loadActionLoadAction = value;
    }

    /**
     * Obtém o valor da propriedade manipulationSourceCancelSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManipulationSourceCancelSource() {
        return manipulationSourceCancelSource;
    }

    /**
     * Define o valor da propriedade manipulationSourceCancelSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManipulationSourceCancelSource(Boolean value) {
        this.manipulationSourceCancelSource = value;
    }

    /**
     * Obtém o valor da propriedade maxUrgency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxUrgency() {
        return maxUrgency;
    }

    /**
     * Define o valor da propriedade maxUrgency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxUrgency(Boolean value) {
        this.maxUrgency = value;
    }

    /**
     * Obtém o valor da propriedade missedOpenCloseEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedOpenCloseEarlyDuration() {
        return missedOpenCloseEarlyDuration;
    }

    /**
     * Define o valor da propriedade missedOpenCloseEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedOpenCloseEarlyDuration(Boolean value) {
        this.missedOpenCloseEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedOpenCloseLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedOpenCloseLateDuration() {
        return missedOpenCloseLateDuration;
    }

    /**
     * Define o valor da propriedade missedOpenCloseLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedOpenCloseLateDuration(Boolean value) {
        this.missedOpenCloseLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedServiceWindowsEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedServiceWindowsEarlyDuration() {
        return missedServiceWindowsEarlyDuration;
    }

    /**
     * Define o valor da propriedade missedServiceWindowsEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedServiceWindowsEarlyDuration(Boolean value) {
        this.missedServiceWindowsEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedServiceWindowsLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedServiceWindowsLateDuration() {
        return missedServiceWindowsLateDuration;
    }

    /**
     * Define o valor da propriedade missedServiceWindowsLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedServiceWindowsLateDuration(Boolean value) {
        this.missedServiceWindowsLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedTimeWindowDuration() {
        return missedTimeWindowDuration;
    }

    /**
     * Define o valor da propriedade missedTimeWindowDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedTimeWindowDuration(Boolean value) {
        this.missedTimeWindowDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowTypeMissedTimeWindowDurationType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedTimeWindowTypeMissedTimeWindowDurationType() {
        return missedTimeWindowTypeMissedTimeWindowDurationType;
    }

    /**
     * Define o valor da propriedade missedTimeWindowTypeMissedTimeWindowDurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedTimeWindowTypeMissedTimeWindowDurationType(Boolean value) {
        this.missedTimeWindowTypeMissedTimeWindowDurationType = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowTypePlannedMissedTimeWindowDurationType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedTimeWindowTypePlannedMissedTimeWindowDurationType() {
        return missedTimeWindowTypePlannedMissedTimeWindowDurationType;
    }

    /**
     * Define o valor da propriedade missedTimeWindowTypePlannedMissedTimeWindowDurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedTimeWindowTypePlannedMissedTimeWindowDurationType(Boolean value) {
        this.missedTimeWindowTypePlannedMissedTimeWindowDurationType = value;
    }

    /**
     * Obtém o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileQuantityItemSourceSource() {
        return mobileQuantityItemSourceSource;
    }

    /**
     * Define o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileQuantityItemSourceSource(Boolean value) {
        this.mobileQuantityItemSourceSource = value;
    }

    /**
     * Obtém o valor da propriedade nearbyPOI.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNearbyPOI() {
        return nearbyPOI;
    }

    /**
     * Define o valor da propriedade nearbyPOI.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNearbyPOI(Boolean value) {
        this.nearbyPOI = value;
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
     * Obtém o valor da propriedade numberOfOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfOrders() {
        return numberOfOrders;
    }

    /**
     * Define o valor da propriedade numberOfOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfOrders(Boolean value) {
        this.numberOfOrders = value;
    }

    /**
     * Obtém o valor da propriedade openCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenCloseDetails() {
        return openCloseDetails;
    }

    /**
     * Define o valor da propriedade openCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenCloseDetails(Boolean value) {
        this.openCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade openCloseDetailsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpenCloseDetailPropertyOptions> getOpenCloseDetailsOptions() {
        return openCloseDetailsOptions;
    }

    /**
     * Define o valor da propriedade openCloseDetailsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setOpenCloseDetailsOptions(JAXBElement<OpenCloseDetailPropertyOptions> value) {
        this.openCloseDetailsOptions = value;
    }

    /**
     * Obtém o valor da propriedade orderClassEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderClassEntityKeys() {
        return orderClassEntityKeys;
    }

    /**
     * Define o valor da propriedade orderClassEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderClassEntityKeys(Boolean value) {
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
     * Obtém o valor da propriedade placementTypePlacement.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlacementTypePlacement() {
        return placementTypePlacement;
    }

    /**
     * Define o valor da propriedade placementTypePlacement.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlacementTypePlacement(Boolean value) {
        this.placementTypePlacement = value;
    }

    /**
     * Obtém o valor da propriedade planVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanVersion() {
        return planVersion;
    }

    /**
     * Define o valor da propriedade planVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanVersion(Boolean value) {
        this.planVersion = value;
    }

    /**
     * Obtém o valor da propriedade plannedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedArrivalTime() {
        return plannedArrivalTime;
    }

    /**
     * Define o valor da propriedade plannedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedArrivalTime(Boolean value) {
        this.plannedArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDepartureTime() {
        return plannedDepartureTime;
    }

    /**
     * Define o valor da propriedade plannedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDepartureTime(Boolean value) {
        this.plannedDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDistance() {
        return plannedDistance;
    }

    /**
     * Define o valor da propriedade plannedDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDistance(Boolean value) {
        this.plannedDistance = value;
    }

    /**
     * Obtém o valor da propriedade plannedDistanceTo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDistanceTo() {
        return plannedDistanceTo;
    }

    /**
     * Define o valor da propriedade plannedDistanceTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDistanceTo(Boolean value) {
        this.plannedDistanceTo = value;
    }

    /**
     * Obtém o valor da propriedade plannedIndex.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedIndex() {
        return plannedIndex;
    }

    /**
     * Define o valor da propriedade plannedIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedIndex(Boolean value) {
        this.plannedIndex = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedOpenCloseEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedMissedOpenCloseEarlyDuration() {
        return plannedMissedOpenCloseEarlyDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedOpenCloseEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedMissedOpenCloseEarlyDuration(Boolean value) {
        this.plannedMissedOpenCloseEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedOpenCloseLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedMissedOpenCloseLateDuration() {
        return plannedMissedOpenCloseLateDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedOpenCloseLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedMissedOpenCloseLateDuration(Boolean value) {
        this.plannedMissedOpenCloseLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedServiceWindowsEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedMissedServiceWindowsEarlyDuration() {
        return plannedMissedServiceWindowsEarlyDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedServiceWindowsEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedMissedServiceWindowsEarlyDuration(Boolean value) {
        this.plannedMissedServiceWindowsEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedServiceWindowsLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedMissedServiceWindowsLateDuration() {
        return plannedMissedServiceWindowsLateDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedServiceWindowsLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedMissedServiceWindowsLateDuration(Boolean value) {
        this.plannedMissedServiceWindowsLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedTimeWindowDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedMissedTimeWindowDuration() {
        return plannedMissedTimeWindowDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedTimeWindowDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedMissedTimeWindowDuration(Boolean value) {
        this.plannedMissedTimeWindowDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedRunningQuantityAfter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedRunningQuantityAfter() {
        return plannedRunningQuantityAfter;
    }

    /**
     * Define o valor da propriedade plannedRunningQuantityAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedRunningQuantityAfter(Boolean value) {
        this.plannedRunningQuantityAfter = value;
    }

    /**
     * Obtém o valor da propriedade plannedSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedSequenceNumber() {
        return plannedSequenceNumber;
    }

    /**
     * Define o valor da propriedade plannedSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedSequenceNumber(Boolean value) {
        this.plannedSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade plannedServiceStartTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedServiceStartTime() {
        return plannedServiceStartTime;
    }

    /**
     * Define o valor da propriedade plannedServiceStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedServiceStartTime(Boolean value) {
        this.plannedServiceStartTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalDeliveryCategory1Quantities() {
        return plannedTotalDeliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalDeliveryCategory1Quantities(Boolean value) {
        this.plannedTotalDeliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalDeliveryCategory2Quantities() {
        return plannedTotalDeliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalDeliveryCategory2Quantities(Boolean value) {
        this.plannedTotalDeliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalDeliveryCategory3Quantities() {
        return plannedTotalDeliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalDeliveryCategory3Quantities(Boolean value) {
        this.plannedTotalDeliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalPickupCategory1Quantities() {
        return plannedTotalPickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalPickupCategory1Quantities(Boolean value) {
        this.plannedTotalPickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalPickupCategory2Quantities() {
        return plannedTotalPickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalPickupCategory2Quantities(Boolean value) {
        this.plannedTotalPickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalPickupCategory3Quantities() {
        return plannedTotalPickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalPickupCategory3Quantities(Boolean value) {
        this.plannedTotalPickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTravelTimeTo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTravelTimeTo() {
        return plannedTravelTimeTo;
    }

    /**
     * Define o valor da propriedade plannedTravelTimeTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTravelTimeTo(Boolean value) {
        this.plannedTravelTimeTo = value;
    }

    /**
     * Obtém o valor da propriedade preferredRouteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredRouteIdentifier() {
        return preferredRouteIdentifier;
    }

    /**
     * Define o valor da propriedade preferredRouteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredRouteIdentifier(Boolean value) {
        this.preferredRouteIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriority(Boolean value) {
        this.priority = value;
    }

    /**
     * Obtém o valor da propriedade reloadTimeOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReloadTimeOverride() {
        return reloadTimeOverride;
    }

    /**
     * Define o valor da propriedade reloadTimeOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReloadTimeOverride(Boolean value) {
        this.reloadTimeOverride = value;
    }

    /**
     * Obtém o valor da propriedade restrictedLocationAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedLocationAddress() {
        return restrictedLocationAddress;
    }

    /**
     * Define o valor da propriedade restrictedLocationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedLocationAddress(Boolean value) {
        this.restrictedLocationAddress = value;
    }

    /**
     * Obtém o valor da propriedade restrictedLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedLocationDescription() {
        return restrictedLocationDescription;
    }

    /**
     * Define o valor da propriedade restrictedLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedLocationDescription(Boolean value) {
        this.restrictedLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade restrictedLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedLocationEntityKey() {
        return restrictedLocationEntityKey;
    }

    /**
     * Define o valor da propriedade restrictedLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedLocationEntityKey(Boolean value) {
        this.restrictedLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade restrictedLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedLocationIdentifier() {
        return restrictedLocationIdentifier;
    }

    /**
     * Define o valor da propriedade restrictedLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedLocationIdentifier(Boolean value) {
        this.restrictedLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade restrictedLocationIsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedLocationIsDeleted() {
        return restrictedLocationIsDeleted;
    }

    /**
     * Define o valor da propriedade restrictedLocationIsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedLocationIsDeleted(Boolean value) {
        this.restrictedLocationIsDeleted = value;
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
     * Obtém o valor da propriedade runningQuantityAfter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunningQuantityAfter() {
        return runningQuantityAfter;
    }

    /**
     * Define o valor da propriedade runningQuantityAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunningQuantityAfter(Boolean value) {
        this.runningQuantityAfter = value;
    }

    /**
     * Obtém o valor da propriedade selectors.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectors() {
        return selectors;
    }

    /**
     * Define o valor da propriedade selectors.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectors(Boolean value) {
        this.selectors = value;
    }

    /**
     * Obtém o valor da propriedade sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Define o valor da propriedade sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSequenceNumber(Boolean value) {
        this.sequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAccountEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationAccountEntityKey() {
        return serviceLocationAccountEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationAccountEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationAccountEntityKey(Boolean value) {
        this.serviceLocationAccountEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationAddress() {
        return serviceLocationAddress;
    }

    /**
     * Define o valor da propriedade serviceLocationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationAddress(Boolean value) {
        this.serviceLocationAddress = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAlternateContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationAlternateContact() {
        return serviceLocationAlternateContact;
    }

    /**
     * Define o valor da propriedade serviceLocationAlternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationAlternateContact(Boolean value) {
        this.serviceLocationAlternateContact = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationBuildingDeliverySequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationBuildingDeliverySequence() {
        return serviceLocationBuildingDeliverySequence;
    }

    /**
     * Define o valor da propriedade serviceLocationBuildingDeliverySequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationBuildingDeliverySequence(Boolean value) {
        this.serviceLocationBuildingDeliverySequence = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationCategoryEntityKey() {
        return serviceLocationCategoryEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationCategoryEntityKey(Boolean value) {
        this.serviceLocationCategoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationContact() {
        return serviceLocationContact;
    }

    /**
     * Define o valor da propriedade serviceLocationContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationContact(Boolean value) {
        this.serviceLocationContact = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationCustomProperties() {
        return serviceLocationCustomProperties;
    }

    /**
     * Define o valor da propriedade serviceLocationCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationCustomProperties(Boolean value) {
        this.serviceLocationCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationDescription() {
        return serviceLocationDescription;
    }

    /**
     * Define o valor da propriedade serviceLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationDescription(Boolean value) {
        this.serviceLocationDescription = value;
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
     * Obtém o valor da propriedade serviceLocationEquipmentTypeRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationEquipmentTypeRestrictions() {
        return serviceLocationEquipmentTypeRestrictions;
    }

    /**
     * Define o valor da propriedade serviceLocationEquipmentTypeRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationEquipmentTypeRestrictions(Boolean value) {
        this.serviceLocationEquipmentTypeRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationIdentifier() {
        return serviceLocationIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationIdentifier(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationPhoneNumber() {
        return serviceLocationPhoneNumber;
    }

    /**
     * Define o valor da propriedade serviceLocationPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationPhoneNumber(Boolean value) {
        this.serviceLocationPhoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationPreferredRouteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationPreferredRouteIdentifier() {
        return serviceLocationPreferredRouteIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationPreferredRouteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationPreferredRouteIdentifier(Boolean value) {
        this.serviceLocationPreferredRouteIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationPriority.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationPriority() {
        return serviceLocationPriority;
    }

    /**
     * Define o valor da propriedade serviceLocationPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationPriority(Boolean value) {
        this.serviceLocationPriority = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationServiceAreaOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationServiceAreaOverride() {
        return serviceLocationServiceAreaOverride;
    }

    /**
     * Define o valor da propriedade serviceLocationServiceAreaOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationServiceAreaOverride(Boolean value) {
        this.serviceLocationServiceAreaOverride = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationServiceRadiusOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationServiceRadiusOverride() {
        return serviceLocationServiceRadiusOverride;
    }

    /**
     * Define o valor da propriedade serviceLocationServiceRadiusOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationServiceRadiusOverride(Boolean value) {
        this.serviceLocationServiceRadiusOverride = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationServiceTimeTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationServiceTimeTypeEntityKey() {
        return serviceLocationServiceTimeTypeEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationServiceTimeTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationServiceTimeTypeEntityKey(Boolean value) {
        this.serviceLocationServiceTimeTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationStandardInstructions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationStandardInstructions() {
        return serviceLocationStandardInstructions;
    }

    /**
     * Define o valor da propriedade serviceLocationStandardInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationStandardInstructions(Boolean value) {
        this.serviceLocationStandardInstructions = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationTimeWindowTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationTimeWindowTypeEntityKey() {
        return serviceLocationTimeWindowTypeEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationTimeWindowTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationTimeWindowTypeEntityKey(Boolean value) {
        this.serviceLocationTimeWindowTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationZone() {
        return serviceLocationZone;
    }

    /**
     * Define o valor da propriedade serviceLocationZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationZone(Boolean value) {
        this.serviceLocationZone = value;
    }

    /**
     * Obtém o valor da propriedade serviceStartTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceStartTime() {
        return serviceStartTime;
    }

    /**
     * Define o valor da propriedade serviceStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceStartTime(Boolean value) {
        this.serviceStartTime = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceWindowDetails() {
        return serviceWindowDetails;
    }

    /**
     * Define o valor da propriedade serviceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceWindowDetails(Boolean value) {
        this.serviceWindowDetails = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetailsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceWindowDetailPropertyOptions> getServiceWindowDetailsOptions() {
        return serviceWindowDetailsOptions;
    }

    /**
     * Define o valor da propriedade serviceWindowDetailsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceWindowDetailsOptions(JAXBElement<ServiceWindowDetailPropertyOptions> value) {
        this.serviceWindowDetailsOptions = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignature(Boolean value) {
        this.signature = value;
    }

    /**
     * Obtém o valor da propriedade signatureCaptureEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignatureCaptureEntityKey() {
        return signatureCaptureEntityKey;
    }

    /**
     * Define o valor da propriedade signatureCaptureEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignatureCaptureEntityKey(Boolean value) {
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
     * Obtém o valor da propriedade stopAlertFlagsAlerts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopAlertFlagsAlerts() {
        return stopAlertFlagsAlerts;
    }

    /**
     * Define o valor da propriedade stopAlertFlagsAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopAlertFlagsAlerts(Boolean value) {
        this.stopAlertFlagsAlerts = value;
    }

    /**
     * Obtém o valor da propriedade stopReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopReasonCodeDescription() {
        return stopReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade stopReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopReasonCodeDescription(Boolean value) {
        this.stopReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade stopReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopReasonCodeEntityKey() {
        return stopReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade stopReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopReasonCodeEntityKey(Boolean value) {
        this.stopReasonCodeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade stopReasonCodeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopReasonCodeIdentifier() {
        return stopReasonCodeIdentifier;
    }

    /**
     * Define o valor da propriedade stopReasonCodeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopReasonCodeIdentifier(Boolean value) {
        this.stopReasonCodeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade stopStateState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopStateState() {
        return stopStateState;
    }

    /**
     * Define o valor da propriedade stopStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopStateState(Boolean value) {
        this.stopStateState = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowImportanceServiceLocationTimeWindowImportance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeWindowImportanceServiceLocationTimeWindowImportance() {
        return timeWindowImportanceServiceLocationTimeWindowImportance;
    }

    /**
     * Define o valor da propriedade timeWindowImportanceServiceLocationTimeWindowImportance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeWindowImportanceServiceLocationTimeWindowImportance(Boolean value) {
        this.timeWindowImportanceServiceLocationTimeWindowImportance = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryDamagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDeliveryDamagedQuantities() {
        return totalDeliveryDamagedQuantities;
    }

    /**
     * Define o valor da propriedade totalDeliveryDamagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDeliveryDamagedQuantities(Boolean value) {
        this.totalDeliveryDamagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryOverQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDeliveryOverQuantities() {
        return totalDeliveryOverQuantities;
    }

    /**
     * Define o valor da propriedade totalDeliveryOverQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDeliveryOverQuantities(Boolean value) {
        this.totalDeliveryOverQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDeliveryQuantities() {
        return totalDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade totalDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDeliveryQuantities(Boolean value) {
        this.totalDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryQuantitiesDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDeliveryQuantitiesDifference() {
        return totalDeliveryQuantitiesDifference;
    }

    /**
     * Define o valor da propriedade totalDeliveryQuantitiesDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDeliveryQuantitiesDifference(Boolean value) {
        this.totalDeliveryQuantitiesDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryQuantitiesPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDeliveryQuantitiesPercentageDifference() {
        return totalDeliveryQuantitiesPercentageDifference;
    }

    /**
     * Define o valor da propriedade totalDeliveryQuantitiesPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDeliveryQuantitiesPercentageDifference(Boolean value) {
        this.totalDeliveryQuantitiesPercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryShortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDeliveryShortQuantities() {
        return totalDeliveryShortQuantities;
    }

    /**
     * Define o valor da propriedade totalDeliveryShortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDeliveryShortQuantities(Boolean value) {
        this.totalDeliveryShortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalFee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalFee() {
        return totalFee;
    }

    /**
     * Define o valor da propriedade totalFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalFee(Boolean value) {
        this.totalFee = value;
    }

    /**
     * Obtém o valor da propriedade totalFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalFixedServiceTime() {
        return totalFixedServiceTime;
    }

    /**
     * Define o valor da propriedade totalFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalFixedServiceTime(Boolean value) {
        this.totalFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupDamagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPickupDamagedQuantities() {
        return totalPickupDamagedQuantities;
    }

    /**
     * Define o valor da propriedade totalPickupDamagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPickupDamagedQuantities(Boolean value) {
        this.totalPickupDamagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupOverQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPickupOverQuantities() {
        return totalPickupOverQuantities;
    }

    /**
     * Define o valor da propriedade totalPickupOverQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPickupOverQuantities(Boolean value) {
        this.totalPickupOverQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPickupQuantities() {
        return totalPickupQuantities;
    }

    /**
     * Define o valor da propriedade totalPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPickupQuantities(Boolean value) {
        this.totalPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupQuantitiesDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPickupQuantitiesDifference() {
        return totalPickupQuantitiesDifference;
    }

    /**
     * Define o valor da propriedade totalPickupQuantitiesDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPickupQuantitiesDifference(Boolean value) {
        this.totalPickupQuantitiesDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupQuantitiesPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPickupQuantitiesPercentageDifference() {
        return totalPickupQuantitiesPercentageDifference;
    }

    /**
     * Define o valor da propriedade totalPickupQuantitiesPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPickupQuantitiesPercentageDifference(Boolean value) {
        this.totalPickupQuantitiesPercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupShortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPickupShortQuantities() {
        return totalPickupShortQuantities;
    }

    /**
     * Define o valor da propriedade totalPickupShortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPickupShortQuantities(Boolean value) {
        this.totalPickupShortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedDeliveryQuantities() {
        return totalPlannedDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade totalPlannedDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedDeliveryQuantities(Boolean value) {
        this.totalPlannedDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedFee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedFee() {
        return totalPlannedFee;
    }

    /**
     * Define o valor da propriedade totalPlannedFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedFee(Boolean value) {
        this.totalPlannedFee = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedFixedServiceTime() {
        return totalPlannedFixedServiceTime;
    }

    /**
     * Define o valor da propriedade totalPlannedFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedFixedServiceTime(Boolean value) {
        this.totalPlannedFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedPickupQuantities() {
        return totalPlannedPickupQuantities;
    }

    /**
     * Define o valor da propriedade totalPlannedPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedPickupQuantities(Boolean value) {
        this.totalPlannedPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedServiceTime() {
        return totalPlannedServiceTime;
    }

    /**
     * Define o valor da propriedade totalPlannedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedServiceTime(Boolean value) {
        this.totalPlannedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedVariableServiceTime() {
        return totalPlannedVariableServiceTime;
    }

    /**
     * Define o valor da propriedade totalPlannedVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedVariableServiceTime(Boolean value) {
        this.totalPlannedVariableServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalServiceTime() {
        return totalServiceTime;
    }

    /**
     * Define o valor da propriedade totalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalServiceTime(Boolean value) {
        this.totalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalServiceTimeDifference() {
        return totalServiceTimeDifference;
    }

    /**
     * Define o valor da propriedade totalServiceTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalServiceTimeDifference(Boolean value) {
        this.totalServiceTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalServiceTimePercentageDifference() {
        return totalServiceTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade totalServiceTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalServiceTimePercentageDifference(Boolean value) {
        this.totalServiceTimePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalVariableServiceTime() {
        return totalVariableServiceTime;
    }

    /**
     * Define o valor da propriedade totalVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalVariableServiceTime(Boolean value) {
        this.totalVariableServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade travelTimeTo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelTimeTo() {
        return travelTimeTo;
    }

    /**
     * Define o valor da propriedade travelTimeTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelTimeTo(Boolean value) {
        this.travelTimeTo = value;
    }

    /**
     * Obtém o valor da propriedade unknownNeedsAttention.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnknownNeedsAttention() {
        return unknownNeedsAttention;
    }

    /**
     * Define o valor da propriedade unknownNeedsAttention.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnknownNeedsAttention(Boolean value) {
        this.unknownNeedsAttention = value;
    }

    /**
     * Obtém o valor da propriedade unserviceableReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnserviceableReasonCodeEntityKey() {
        return unserviceableReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade unserviceableReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnserviceableReasonCodeEntityKey(Boolean value) {
        this.unserviceableReasonCodeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade unserviceableReasonCodeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnserviceableReasonCodeIdentifier() {
        return unserviceableReasonCodeIdentifier;
    }

    /**
     * Define o valor da propriedade unserviceableReasonCodeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnserviceableReasonCodeIdentifier(Boolean value) {
        this.unserviceableReasonCodeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade uploadSelectors.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUploadSelectors() {
        return uploadSelectors;
    }

    /**
     * Define o valor da propriedade uploadSelectors.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUploadSelectors(Boolean value) {
        this.uploadSelectors = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneTimeZone(Boolean value) {
        this.worldTimeZoneTimeZone = value;
    }

}
