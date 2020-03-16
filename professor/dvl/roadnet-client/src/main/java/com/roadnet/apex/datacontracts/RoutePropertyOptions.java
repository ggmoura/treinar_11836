
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoutePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTimeDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CellEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompartmentContents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompleteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompleteTimeDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompleteTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Costs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CostsOptions" type="{http://roadnet.com/apex/DataContracts/}RouteCostsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="DataCommunicationsType_TelematicsDeviceCurrentDataComms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTimeDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDepotCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDepotDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationEngineIdleTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationEngineRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationFuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeviceLoadTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DispatcherEmailAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DispatcherEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DispatcherName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceByJurisdictionHasBeenCalculated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToFirstStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EngineRunTimeToDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Equipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentOptions" type="{http://roadnet.com/apex/DataContracts/}RouteEquipmentPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="FirstStopIsOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FuelEconomy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FuelUsedToDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GroupStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GroupStopsOptions" type="{http://roadnet.com/apex/DataContracts/}GroupStopPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="HasPositionHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Helper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreErrorsDuringMobileMessageProcessing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InternalScoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InternalScoringOptions" type="{http://roadnet.com/apex/DataContracts/}RouteScoresPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="IsLoadedToDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLoadedToMobileDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLoadedToTelematicsDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPlannedOptimalValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsReadyToLoadToDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Jurisdictions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="JurisdictionsOptions" type="{http://roadnet.com/apex/DataContracts/}RouteJurisdictionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="KeepRelativeSequenceOfLockedStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastContactTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPosition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPositionText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPositionTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastMessageId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_OriginLoadAction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxRunningQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumRuntime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTravelTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedOpenCloseEarlyDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedOpenCloseLateDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowsEarlyDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowsLateDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceBatteryState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfCancelledStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfCompletedServiceableStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfLayoverStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfLockedStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMidRouteDepotStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMissedOpenCloseEarly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMissedOpenCloseLate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMissedServiceWindows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMissedServiceWindowsEarly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMissedServiceWindowsLate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfNavigationEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfNonServiceableStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfServiceableStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfUnacknowledgedExceptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfUnacknowledgedNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfUnknownStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OptimizationSuggestions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OptimizationSuggestionsOptions" type="{http://roadnet.com/apex/DataContracts/}RouteOptimizationSuggestionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginEngineIdleTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginEngineRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginFuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OutOfSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassCompartmentRoutingIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassMultiDayRoutingIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassRecalculateBreaksAfterRouteCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassRecalculateLayoversAfterRouteCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedBusinessOptimalCosts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedBusinessOptimalCostsOptions" type="{http://roadnet.com/apex/DataContracts/}RouteCostsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="PlannedCompleteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedCosts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedCostsOptions" type="{http://roadnet.com/apex/DataContracts/}RouteCostsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDistanceToDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMaxRunningQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedOpenCloseEarlyDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedOpenCloseLateDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedServiceWindowsEarlyDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedServiceWindowsLateDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedTimeWindowDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfLayoverStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMidRouteDepotStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMissedOpenCloseEarly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMissedOpenCloseLate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMissedServiceWindows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMissedServiceWindowsEarly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMissedServiceWindowsLate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfNonServiceableStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfServiceableStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPostRouteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPreRouteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedRunningQuantityAfterOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTravelTimeToDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTrueOptimalCosts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTrueOptimalCostsOptions" type="{http://roadnet.com/apex/DataContracts/}RouteCostsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PostRouteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PostStartDelay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreRouteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreStartDelay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRuntime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Profit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedNumberOfMissedServiceWindows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedNumberOfMissedServiceWindowsEarly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedNumberOfMissedServiceWindowsLate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Published" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResourceEventsEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAlertFlags_Alerts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAutonomousDispatchState_AutonomousDispatchAssignOrdersState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAutonomousDispatchState_AutonomousDispatchResequenceState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAutonomousDispatchState_AutonomousDispatchState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteConstraintFlags_BrokenConstraints" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteCreationMethod_CreationMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoutePhase_Phase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteState_State" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteStatus_Status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenderState_TenderState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteTendersOptions" type="{http://roadnet.com/apex/DataContracts/}RouteTenderPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RouterEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouterName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RunningQuantityAfterOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionMode_RoutingSessionMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldTreatAsTemplateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Stops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopsOptions" type="{http://roadnet.com/apex/DataContracts/}StopPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="TeamSplit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalBreakTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryDamagedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryOverQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryShortQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDepotServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDestinationDepotFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDistanceDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDistancePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineIdleTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalFixedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalFuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalLayoverTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumberOfExceptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalOriginDepotFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPaidBreakTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPaidLayoverTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPaidTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupDamagedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupOverQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupShortQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedBreakTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedBusinessOptimalDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedBusinessOptimalTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDepotServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDestinationDepotFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedFixedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedLayoverTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedOriginDepotFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedPaidBreakTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedPaidLayoverTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedTravelTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedTrueOptimalDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedTrueOptimalTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedUnpaidBreakTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedUnpaidLayoverTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedVariableServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedWaitTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalStopDelayTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalStopEngineIdleTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalTravelTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalUnpaidBreakTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalUnpaidLayoverTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalUnpaidTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalVariableServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalWaitTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelPathChangedVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelTimeToDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Workers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkersOptions" type="{http://roadnet.com/apex/DataContracts/}RouteWorkerPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_DestinationDepotTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_OriginDepotTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePropertyOptions", propOrder = {
    "arrivalTime",
    "arrivalTimeDifference",
    "arrivalTimePercentageDifference",
    "capacity",
    "cellEntityKey",
    "color",
    "compartmentContents",
    "completeTime",
    "completeTimeDifference",
    "completeTimePercentageDifference",
    "costs",
    "costsOptions",
    "dataCommunicationsTypeTelematicsDeviceCurrentDataComms",
    "departureTime",
    "departureTimeDifference",
    "departureTimePercentageDifference",
    "description",
    "destinationDepotCoordinate",
    "destinationDepotDescription",
    "destinationDepotEntityKey",
    "destinationDepotIdentifier",
    "destinationEngineIdleTime",
    "destinationEngineRunTime",
    "destinationFuelUsed",
    "deviceLoadTime",
    "dispatcherEmailAddress",
    "dispatcherEntityKey",
    "dispatcherName",
    "displayName",
    "distanceByJurisdictionHasBeenCalculated",
    "distanceToDestination",
    "distanceToFirstStop",
    "engineRunTimeToDestination",
    "equipment",
    "equipmentOptions",
    "firstStopIsOrigin",
    "fuelEconomy",
    "fuelUsedToDestination",
    "groupStops",
    "groupStopsOptions",
    "hasPositionHistory",
    "helper",
    "identifier",
    "ignoreErrorsDuringMobileMessageProcessing",
    "internalScoring",
    "internalScoringOptions",
    "isLoadedToDevice",
    "isLoadedToMobileDevice",
    "isLoadedToTelematicsDevice",
    "isPlannedOptimalValid",
    "isReadyToLoadToDevice",
    "jurisdictions",
    "jurisdictionsOptions",
    "keepRelativeSequenceOfLockedStops",
    "lastContactTime",
    "lastKnownPosition",
    "lastKnownPositionText",
    "lastKnownPositionTime",
    "lastMessageId",
    "lastStopIsDestination",
    "loadActionOriginLoadAction",
    "maxRunningQuantity",
    "maximumRuntime",
    "maximumTravelTime",
    "missedOpenCloseEarlyDuration",
    "missedOpenCloseLateDuration",
    "missedServiceWindowsEarlyDuration",
    "missedServiceWindowsLateDuration",
    "missedTimeWindowDuration",
    "mobileDeviceBatteryState",
    "mobileDeviceDescription",
    "mobileDeviceEntityKey",
    "mobileDeviceIdentifier",
    "netRevenue",
    "numberOfCancelledStops",
    "numberOfCompletedServiceableStops",
    "numberOfLayoverStops",
    "numberOfLockedStops",
    "numberOfMidRouteDepotStops",
    "numberOfMissedOpenCloseEarly",
    "numberOfMissedOpenCloseLate",
    "numberOfMissedServiceWindows",
    "numberOfMissedServiceWindowsEarly",
    "numberOfMissedServiceWindowsLate",
    "numberOfNavigationEvents",
    "numberOfNonServiceableStops",
    "numberOfOrders",
    "numberOfServiceableStops",
    "numberOfUnacknowledgedExceptions",
    "numberOfUnacknowledgedNotes",
    "numberOfUnknownStops",
    "optimizationSuggestions",
    "optimizationSuggestionsOptions",
    "originDepotCoordinate",
    "originDepotDescription",
    "originDepotEntityKey",
    "originDepotIdentifier",
    "originEngineIdleTime",
    "originEngineRunTime",
    "originFuelUsed",
    "outOfSequence",
    "passCompartmentRoutingIsEnabled",
    "passDescription",
    "passEntityKey",
    "passIdentifier",
    "passMultiDayRoutingIsEnabled",
    "passRecalculateBreaksAfterRouteCreation",
    "passRecalculateLayoversAfterRouteCreation",
    "plannedArrivalTime",
    "plannedBusinessOptimalCosts",
    "plannedBusinessOptimalCostsOptions",
    "plannedCompleteTime",
    "plannedCosts",
    "plannedCostsOptions",
    "plannedDepartureTime",
    "plannedDistanceToDestination",
    "plannedMaxRunningQuantity",
    "plannedMissedOpenCloseEarlyDuration",
    "plannedMissedOpenCloseLateDuration",
    "plannedMissedServiceWindowsEarlyDuration",
    "plannedMissedServiceWindowsLateDuration",
    "plannedMissedTimeWindowDuration",
    "plannedNumberOfLayoverStops",
    "plannedNumberOfMidRouteDepotStops",
    "plannedNumberOfMissedOpenCloseEarly",
    "plannedNumberOfMissedOpenCloseLate",
    "plannedNumberOfMissedServiceWindows",
    "plannedNumberOfMissedServiceWindowsEarly",
    "plannedNumberOfMissedServiceWindowsLate",
    "plannedNumberOfNonServiceableStops",
    "plannedNumberOfServiceableStops",
    "plannedPostRouteTime",
    "plannedPreRouteTime",
    "plannedRunningQuantityAfterOrigin",
    "plannedStartTime",
    "plannedTotalDeliveryCategory1Quantities",
    "plannedTotalDeliveryCategory2Quantities",
    "plannedTotalDeliveryCategory3Quantities",
    "plannedTotalPickupCategory1Quantities",
    "plannedTotalPickupCategory2Quantities",
    "plannedTotalPickupCategory3Quantities",
    "plannedTravelTimeToDestination",
    "plannedTrueOptimalCosts",
    "plannedTrueOptimalCostsOptions",
    "position",
    "postRouteTime",
    "postStartDelay",
    "preRouteTime",
    "preStartDelay",
    "preferredRuntime",
    "profit",
    "projectedNumberOfMissedServiceWindows",
    "projectedNumberOfMissedServiceWindowsEarly",
    "projectedNumberOfMissedServiceWindowsLate",
    "published",
    "regionDescription",
    "regionIdentifier",
    "resourceEventsEntityKey",
    "routeAlertFlagsAlerts",
    "routeAutonomousDispatchStateAutonomousDispatchAssignOrdersState",
    "routeAutonomousDispatchStateAutonomousDispatchResequenceState",
    "routeAutonomousDispatchStateAutonomousDispatchState",
    "routeConstraintFlagsBrokenConstraints",
    "routeCreationMethodCreationMethod",
    "routePhasePhase",
    "routeStateState",
    "routeStatusStatus",
    "routeTenderStateTenderState",
    "routeTenders",
    "routeTendersOptions",
    "routerEntityKey",
    "routerName",
    "routingSessionDate",
    "routingSessionDepotEntityKey",
    "routingSessionDescription",
    "routingSessionEntityKey",
    "runningQuantityAfterOrigin",
    "sessionModeRoutingSessionMode",
    "shouldTreatAsTemplateOverride",
    "startTime",
    "startTimeDifference",
    "startTimePercentageDifference",
    "stops",
    "stopsOptions",
    "teamSplit",
    "telematicsDeviceEntityKey",
    "telematicsDeviceIdentifier",
    "territoryEntityKey",
    "totalBreakTime",
    "totalDeliveryDamagedQuantities",
    "totalDeliveryOverQuantities",
    "totalDeliveryQuantities",
    "totalDeliveryShortQuantities",
    "totalDepotServiceTime",
    "totalDestinationDepotFee",
    "totalDistance",
    "totalDistanceDifference",
    "totalDistancePercentageDifference",
    "totalEngineIdleTime",
    "totalEngineRunTime",
    "totalFee",
    "totalFixedServiceTime",
    "totalFuelUsed",
    "totalLayoverTime",
    "totalNumberOfExceptions",
    "totalOriginDepotFee",
    "totalPaidBreakTime",
    "totalPaidLayoverTime",
    "totalPaidTime",
    "totalPickupDamagedQuantities",
    "totalPickupOverQuantities",
    "totalPickupQuantities",
    "totalPickupShortQuantities",
    "totalPlannedBreakTime",
    "totalPlannedBusinessOptimalDistance",
    "totalPlannedBusinessOptimalTime",
    "totalPlannedDeliveryQuantities",
    "totalPlannedDepotServiceTime",
    "totalPlannedDestinationDepotFee",
    "totalPlannedDistance",
    "totalPlannedFee",
    "totalPlannedFixedServiceTime",
    "totalPlannedLayoverTime",
    "totalPlannedOriginDepotFee",
    "totalPlannedPaidBreakTime",
    "totalPlannedPaidLayoverTime",
    "totalPlannedPickupQuantities",
    "totalPlannedServiceTime",
    "totalPlannedTime",
    "totalPlannedTravelTime",
    "totalPlannedTrueOptimalDistance",
    "totalPlannedTrueOptimalTime",
    "totalPlannedUnpaidBreakTime",
    "totalPlannedUnpaidLayoverTime",
    "totalPlannedVariableServiceTime",
    "totalPlannedWaitTime",
    "totalServiceTime",
    "totalStopDelayTime",
    "totalStopEngineIdleTime",
    "totalTime",
    "totalTravelTime",
    "totalUnpaidBreakTime",
    "totalUnpaidLayoverTime",
    "totalUnpaidTime",
    "totalVariableServiceTime",
    "totalWaitTime",
    "travelPathChangedVersion",
    "travelTimeToDestination",
    "workers",
    "workersOptions",
    "worldTimeZoneDestinationDepotTimeZone",
    "worldTimeZoneOriginDepotTimeZone"
})
public class RoutePropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "ArrivalTime")
    protected Boolean arrivalTime;
    @XmlElement(name = "ArrivalTimeDifference")
    protected Boolean arrivalTimeDifference;
    @XmlElement(name = "ArrivalTimePercentageDifference")
    protected Boolean arrivalTimePercentageDifference;
    @XmlElement(name = "Capacity")
    protected Boolean capacity;
    @XmlElement(name = "CellEntityKey")
    protected Boolean cellEntityKey;
    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "CompartmentContents")
    protected Boolean compartmentContents;
    @XmlElement(name = "CompleteTime")
    protected Boolean completeTime;
    @XmlElement(name = "CompleteTimeDifference")
    protected Boolean completeTimeDifference;
    @XmlElement(name = "CompleteTimePercentageDifference")
    protected Boolean completeTimePercentageDifference;
    @XmlElement(name = "Costs")
    protected Boolean costs;
    @XmlElementRef(name = "CostsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteCostsPropertyOptions> costsOptions;
    @XmlElement(name = "DataCommunicationsType_TelematicsDeviceCurrentDataComms")
    protected Boolean dataCommunicationsTypeTelematicsDeviceCurrentDataComms;
    @XmlElement(name = "DepartureTime")
    protected Boolean departureTime;
    @XmlElement(name = "DepartureTimeDifference")
    protected Boolean departureTimeDifference;
    @XmlElement(name = "DepartureTimePercentageDifference")
    protected Boolean departureTimePercentageDifference;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "DestinationDepotCoordinate")
    protected Boolean destinationDepotCoordinate;
    @XmlElement(name = "DestinationDepotDescription")
    protected Boolean destinationDepotDescription;
    @XmlElement(name = "DestinationDepotEntityKey")
    protected Boolean destinationDepotEntityKey;
    @XmlElement(name = "DestinationDepotIdentifier")
    protected Boolean destinationDepotIdentifier;
    @XmlElement(name = "DestinationEngineIdleTime")
    protected Boolean destinationEngineIdleTime;
    @XmlElement(name = "DestinationEngineRunTime")
    protected Boolean destinationEngineRunTime;
    @XmlElement(name = "DestinationFuelUsed")
    protected Boolean destinationFuelUsed;
    @XmlElement(name = "DeviceLoadTime")
    protected Boolean deviceLoadTime;
    @XmlElement(name = "DispatcherEmailAddress")
    protected Boolean dispatcherEmailAddress;
    @XmlElement(name = "DispatcherEntityKey")
    protected Boolean dispatcherEntityKey;
    @XmlElement(name = "DispatcherName")
    protected Boolean dispatcherName;
    @XmlElement(name = "DisplayName")
    protected Boolean displayName;
    @XmlElement(name = "DistanceByJurisdictionHasBeenCalculated")
    protected Boolean distanceByJurisdictionHasBeenCalculated;
    @XmlElement(name = "DistanceToDestination")
    protected Boolean distanceToDestination;
    @XmlElement(name = "DistanceToFirstStop")
    protected Boolean distanceToFirstStop;
    @XmlElement(name = "EngineRunTimeToDestination")
    protected Boolean engineRunTimeToDestination;
    @XmlElement(name = "Equipment")
    protected Boolean equipment;
    @XmlElementRef(name = "EquipmentOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteEquipmentPropertyOptions> equipmentOptions;
    @XmlElement(name = "FirstStopIsOrigin")
    protected Boolean firstStopIsOrigin;
    @XmlElement(name = "FuelEconomy")
    protected Boolean fuelEconomy;
    @XmlElement(name = "FuelUsedToDestination")
    protected Boolean fuelUsedToDestination;
    @XmlElement(name = "GroupStops")
    protected Boolean groupStops;
    @XmlElementRef(name = "GroupStopsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<GroupStopPropertyOptions> groupStopsOptions;
    @XmlElement(name = "HasPositionHistory")
    protected Boolean hasPositionHistory;
    @XmlElement(name = "Helper")
    protected Boolean helper;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IgnoreErrorsDuringMobileMessageProcessing")
    protected Boolean ignoreErrorsDuringMobileMessageProcessing;
    @XmlElement(name = "InternalScoring")
    protected Boolean internalScoring;
    @XmlElementRef(name = "InternalScoringOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteScoresPropertyOptions> internalScoringOptions;
    @XmlElement(name = "IsLoadedToDevice")
    protected Boolean isLoadedToDevice;
    @XmlElement(name = "IsLoadedToMobileDevice")
    protected Boolean isLoadedToMobileDevice;
    @XmlElement(name = "IsLoadedToTelematicsDevice")
    protected Boolean isLoadedToTelematicsDevice;
    @XmlElement(name = "IsPlannedOptimalValid")
    protected Boolean isPlannedOptimalValid;
    @XmlElement(name = "IsReadyToLoadToDevice")
    protected Boolean isReadyToLoadToDevice;
    @XmlElement(name = "Jurisdictions")
    protected Boolean jurisdictions;
    @XmlElementRef(name = "JurisdictionsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteJurisdictionPropertyOptions> jurisdictionsOptions;
    @XmlElement(name = "KeepRelativeSequenceOfLockedStops")
    protected Boolean keepRelativeSequenceOfLockedStops;
    @XmlElement(name = "LastContactTime")
    protected Boolean lastContactTime;
    @XmlElement(name = "LastKnownPosition")
    protected Boolean lastKnownPosition;
    @XmlElement(name = "LastKnownPositionText")
    protected Boolean lastKnownPositionText;
    @XmlElement(name = "LastKnownPositionTime")
    protected Boolean lastKnownPositionTime;
    @XmlElement(name = "LastMessageId")
    protected Boolean lastMessageId;
    @XmlElement(name = "LastStopIsDestination")
    protected Boolean lastStopIsDestination;
    @XmlElement(name = "LoadAction_OriginLoadAction")
    protected Boolean loadActionOriginLoadAction;
    @XmlElement(name = "MaxRunningQuantity")
    protected Boolean maxRunningQuantity;
    @XmlElement(name = "MaximumRuntime")
    protected Boolean maximumRuntime;
    @XmlElement(name = "MaximumTravelTime")
    protected Boolean maximumTravelTime;
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
    @XmlElement(name = "MobileDeviceBatteryState")
    protected Boolean mobileDeviceBatteryState;
    @XmlElement(name = "MobileDeviceDescription")
    protected Boolean mobileDeviceDescription;
    @XmlElement(name = "MobileDeviceEntityKey")
    protected Boolean mobileDeviceEntityKey;
    @XmlElement(name = "MobileDeviceIdentifier")
    protected Boolean mobileDeviceIdentifier;
    @XmlElement(name = "NetRevenue")
    protected Boolean netRevenue;
    @XmlElement(name = "NumberOfCancelledStops")
    protected Boolean numberOfCancelledStops;
    @XmlElement(name = "NumberOfCompletedServiceableStops")
    protected Boolean numberOfCompletedServiceableStops;
    @XmlElement(name = "NumberOfLayoverStops")
    protected Boolean numberOfLayoverStops;
    @XmlElement(name = "NumberOfLockedStops")
    protected Boolean numberOfLockedStops;
    @XmlElement(name = "NumberOfMidRouteDepotStops")
    protected Boolean numberOfMidRouteDepotStops;
    @XmlElement(name = "NumberOfMissedOpenCloseEarly")
    protected Boolean numberOfMissedOpenCloseEarly;
    @XmlElement(name = "NumberOfMissedOpenCloseLate")
    protected Boolean numberOfMissedOpenCloseLate;
    @XmlElement(name = "NumberOfMissedServiceWindows")
    protected Boolean numberOfMissedServiceWindows;
    @XmlElement(name = "NumberOfMissedServiceWindowsEarly")
    protected Boolean numberOfMissedServiceWindowsEarly;
    @XmlElement(name = "NumberOfMissedServiceWindowsLate")
    protected Boolean numberOfMissedServiceWindowsLate;
    @XmlElement(name = "NumberOfNavigationEvents")
    protected Boolean numberOfNavigationEvents;
    @XmlElement(name = "NumberOfNonServiceableStops")
    protected Boolean numberOfNonServiceableStops;
    @XmlElement(name = "NumberOfOrders")
    protected Boolean numberOfOrders;
    @XmlElement(name = "NumberOfServiceableStops")
    protected Boolean numberOfServiceableStops;
    @XmlElement(name = "NumberOfUnacknowledgedExceptions")
    protected Boolean numberOfUnacknowledgedExceptions;
    @XmlElement(name = "NumberOfUnacknowledgedNotes")
    protected Boolean numberOfUnacknowledgedNotes;
    @XmlElement(name = "NumberOfUnknownStops")
    protected Boolean numberOfUnknownStops;
    @XmlElement(name = "OptimizationSuggestions")
    protected Boolean optimizationSuggestions;
    @XmlElementRef(name = "OptimizationSuggestionsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteOptimizationSuggestionPropertyOptions> optimizationSuggestionsOptions;
    @XmlElement(name = "OriginDepotCoordinate")
    protected Boolean originDepotCoordinate;
    @XmlElement(name = "OriginDepotDescription")
    protected Boolean originDepotDescription;
    @XmlElement(name = "OriginDepotEntityKey")
    protected Boolean originDepotEntityKey;
    @XmlElement(name = "OriginDepotIdentifier")
    protected Boolean originDepotIdentifier;
    @XmlElement(name = "OriginEngineIdleTime")
    protected Boolean originEngineIdleTime;
    @XmlElement(name = "OriginEngineRunTime")
    protected Boolean originEngineRunTime;
    @XmlElement(name = "OriginFuelUsed")
    protected Boolean originFuelUsed;
    @XmlElement(name = "OutOfSequence")
    protected Boolean outOfSequence;
    @XmlElement(name = "PassCompartmentRoutingIsEnabled")
    protected Boolean passCompartmentRoutingIsEnabled;
    @XmlElement(name = "PassDescription")
    protected Boolean passDescription;
    @XmlElement(name = "PassEntityKey")
    protected Boolean passEntityKey;
    @XmlElement(name = "PassIdentifier")
    protected Boolean passIdentifier;
    @XmlElement(name = "PassMultiDayRoutingIsEnabled")
    protected Boolean passMultiDayRoutingIsEnabled;
    @XmlElement(name = "PassRecalculateBreaksAfterRouteCreation")
    protected Boolean passRecalculateBreaksAfterRouteCreation;
    @XmlElement(name = "PassRecalculateLayoversAfterRouteCreation")
    protected Boolean passRecalculateLayoversAfterRouteCreation;
    @XmlElement(name = "PlannedArrivalTime")
    protected Boolean plannedArrivalTime;
    @XmlElement(name = "PlannedBusinessOptimalCosts")
    protected Boolean plannedBusinessOptimalCosts;
    @XmlElementRef(name = "PlannedBusinessOptimalCostsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteCostsPropertyOptions> plannedBusinessOptimalCostsOptions;
    @XmlElement(name = "PlannedCompleteTime")
    protected Boolean plannedCompleteTime;
    @XmlElement(name = "PlannedCosts")
    protected Boolean plannedCosts;
    @XmlElementRef(name = "PlannedCostsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteCostsPropertyOptions> plannedCostsOptions;
    @XmlElement(name = "PlannedDepartureTime")
    protected Boolean plannedDepartureTime;
    @XmlElement(name = "PlannedDistanceToDestination")
    protected Boolean plannedDistanceToDestination;
    @XmlElement(name = "PlannedMaxRunningQuantity")
    protected Boolean plannedMaxRunningQuantity;
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
    @XmlElement(name = "PlannedNumberOfLayoverStops")
    protected Boolean plannedNumberOfLayoverStops;
    @XmlElement(name = "PlannedNumberOfMidRouteDepotStops")
    protected Boolean plannedNumberOfMidRouteDepotStops;
    @XmlElement(name = "PlannedNumberOfMissedOpenCloseEarly")
    protected Boolean plannedNumberOfMissedOpenCloseEarly;
    @XmlElement(name = "PlannedNumberOfMissedOpenCloseLate")
    protected Boolean plannedNumberOfMissedOpenCloseLate;
    @XmlElement(name = "PlannedNumberOfMissedServiceWindows")
    protected Boolean plannedNumberOfMissedServiceWindows;
    @XmlElement(name = "PlannedNumberOfMissedServiceWindowsEarly")
    protected Boolean plannedNumberOfMissedServiceWindowsEarly;
    @XmlElement(name = "PlannedNumberOfMissedServiceWindowsLate")
    protected Boolean plannedNumberOfMissedServiceWindowsLate;
    @XmlElement(name = "PlannedNumberOfNonServiceableStops")
    protected Boolean plannedNumberOfNonServiceableStops;
    @XmlElement(name = "PlannedNumberOfServiceableStops")
    protected Boolean plannedNumberOfServiceableStops;
    @XmlElement(name = "PlannedPostRouteTime")
    protected Boolean plannedPostRouteTime;
    @XmlElement(name = "PlannedPreRouteTime")
    protected Boolean plannedPreRouteTime;
    @XmlElement(name = "PlannedRunningQuantityAfterOrigin")
    protected Boolean plannedRunningQuantityAfterOrigin;
    @XmlElement(name = "PlannedStartTime")
    protected Boolean plannedStartTime;
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
    @XmlElement(name = "PlannedTravelTimeToDestination")
    protected Boolean plannedTravelTimeToDestination;
    @XmlElement(name = "PlannedTrueOptimalCosts")
    protected Boolean plannedTrueOptimalCosts;
    @XmlElementRef(name = "PlannedTrueOptimalCostsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteCostsPropertyOptions> plannedTrueOptimalCostsOptions;
    @XmlElement(name = "Position")
    protected Boolean position;
    @XmlElement(name = "PostRouteTime")
    protected Boolean postRouteTime;
    @XmlElement(name = "PostStartDelay")
    protected Boolean postStartDelay;
    @XmlElement(name = "PreRouteTime")
    protected Boolean preRouteTime;
    @XmlElement(name = "PreStartDelay")
    protected Boolean preStartDelay;
    @XmlElement(name = "PreferredRuntime")
    protected Boolean preferredRuntime;
    @XmlElement(name = "Profit")
    protected Boolean profit;
    @XmlElement(name = "ProjectedNumberOfMissedServiceWindows")
    protected Boolean projectedNumberOfMissedServiceWindows;
    @XmlElement(name = "ProjectedNumberOfMissedServiceWindowsEarly")
    protected Boolean projectedNumberOfMissedServiceWindowsEarly;
    @XmlElement(name = "ProjectedNumberOfMissedServiceWindowsLate")
    protected Boolean projectedNumberOfMissedServiceWindowsLate;
    @XmlElement(name = "Published")
    protected Boolean published;
    @XmlElement(name = "RegionDescription")
    protected Boolean regionDescription;
    @XmlElement(name = "RegionIdentifier")
    protected Boolean regionIdentifier;
    @XmlElement(name = "ResourceEventsEntityKey")
    protected Boolean resourceEventsEntityKey;
    @XmlElement(name = "RouteAlertFlags_Alerts")
    protected Boolean routeAlertFlagsAlerts;
    @XmlElement(name = "RouteAutonomousDispatchState_AutonomousDispatchAssignOrdersState")
    protected Boolean routeAutonomousDispatchStateAutonomousDispatchAssignOrdersState;
    @XmlElement(name = "RouteAutonomousDispatchState_AutonomousDispatchResequenceState")
    protected Boolean routeAutonomousDispatchStateAutonomousDispatchResequenceState;
    @XmlElement(name = "RouteAutonomousDispatchState_AutonomousDispatchState")
    protected Boolean routeAutonomousDispatchStateAutonomousDispatchState;
    @XmlElement(name = "RouteConstraintFlags_BrokenConstraints")
    protected Boolean routeConstraintFlagsBrokenConstraints;
    @XmlElement(name = "RouteCreationMethod_CreationMethod")
    protected Boolean routeCreationMethodCreationMethod;
    @XmlElement(name = "RoutePhase_Phase")
    protected Boolean routePhasePhase;
    @XmlElement(name = "RouteState_State")
    protected Boolean routeStateState;
    @XmlElement(name = "RouteStatus_Status")
    protected Boolean routeStatusStatus;
    @XmlElement(name = "RouteTenderState_TenderState")
    protected Boolean routeTenderStateTenderState;
    @XmlElement(name = "RouteTenders")
    protected Boolean routeTenders;
    @XmlElementRef(name = "RouteTendersOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteTenderPropertyOptions> routeTendersOptions;
    @XmlElement(name = "RouterEntityKey")
    protected Boolean routerEntityKey;
    @XmlElement(name = "RouterName")
    protected Boolean routerName;
    @XmlElement(name = "RoutingSessionDate")
    protected Boolean routingSessionDate;
    @XmlElement(name = "RoutingSessionDepotEntityKey")
    protected Boolean routingSessionDepotEntityKey;
    @XmlElement(name = "RoutingSessionDescription")
    protected Boolean routingSessionDescription;
    @XmlElement(name = "RoutingSessionEntityKey")
    protected Boolean routingSessionEntityKey;
    @XmlElement(name = "RunningQuantityAfterOrigin")
    protected Boolean runningQuantityAfterOrigin;
    @XmlElement(name = "SessionMode_RoutingSessionMode")
    protected Boolean sessionModeRoutingSessionMode;
    @XmlElement(name = "ShouldTreatAsTemplateOverride")
    protected Boolean shouldTreatAsTemplateOverride;
    @XmlElement(name = "StartTime")
    protected Boolean startTime;
    @XmlElement(name = "StartTimeDifference")
    protected Boolean startTimeDifference;
    @XmlElement(name = "StartTimePercentageDifference")
    protected Boolean startTimePercentageDifference;
    @XmlElement(name = "Stops")
    protected Boolean stops;
    @XmlElementRef(name = "StopsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StopPropertyOptions> stopsOptions;
    @XmlElement(name = "TeamSplit")
    protected Boolean teamSplit;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Boolean telematicsDeviceEntityKey;
    @XmlElement(name = "TelematicsDeviceIdentifier")
    protected Boolean telematicsDeviceIdentifier;
    @XmlElement(name = "TerritoryEntityKey")
    protected Boolean territoryEntityKey;
    @XmlElement(name = "TotalBreakTime")
    protected Boolean totalBreakTime;
    @XmlElement(name = "TotalDeliveryDamagedQuantities")
    protected Boolean totalDeliveryDamagedQuantities;
    @XmlElement(name = "TotalDeliveryOverQuantities")
    protected Boolean totalDeliveryOverQuantities;
    @XmlElement(name = "TotalDeliveryQuantities")
    protected Boolean totalDeliveryQuantities;
    @XmlElement(name = "TotalDeliveryShortQuantities")
    protected Boolean totalDeliveryShortQuantities;
    @XmlElement(name = "TotalDepotServiceTime")
    protected Boolean totalDepotServiceTime;
    @XmlElement(name = "TotalDestinationDepotFee")
    protected Boolean totalDestinationDepotFee;
    @XmlElement(name = "TotalDistance")
    protected Boolean totalDistance;
    @XmlElement(name = "TotalDistanceDifference")
    protected Boolean totalDistanceDifference;
    @XmlElement(name = "TotalDistancePercentageDifference")
    protected Boolean totalDistancePercentageDifference;
    @XmlElement(name = "TotalEngineIdleTime")
    protected Boolean totalEngineIdleTime;
    @XmlElement(name = "TotalEngineRunTime")
    protected Boolean totalEngineRunTime;
    @XmlElement(name = "TotalFee")
    protected Boolean totalFee;
    @XmlElement(name = "TotalFixedServiceTime")
    protected Boolean totalFixedServiceTime;
    @XmlElement(name = "TotalFuelUsed")
    protected Boolean totalFuelUsed;
    @XmlElement(name = "TotalLayoverTime")
    protected Boolean totalLayoverTime;
    @XmlElement(name = "TotalNumberOfExceptions")
    protected Boolean totalNumberOfExceptions;
    @XmlElement(name = "TotalOriginDepotFee")
    protected Boolean totalOriginDepotFee;
    @XmlElement(name = "TotalPaidBreakTime")
    protected Boolean totalPaidBreakTime;
    @XmlElement(name = "TotalPaidLayoverTime")
    protected Boolean totalPaidLayoverTime;
    @XmlElement(name = "TotalPaidTime")
    protected Boolean totalPaidTime;
    @XmlElement(name = "TotalPickupDamagedQuantities")
    protected Boolean totalPickupDamagedQuantities;
    @XmlElement(name = "TotalPickupOverQuantities")
    protected Boolean totalPickupOverQuantities;
    @XmlElement(name = "TotalPickupQuantities")
    protected Boolean totalPickupQuantities;
    @XmlElement(name = "TotalPickupShortQuantities")
    protected Boolean totalPickupShortQuantities;
    @XmlElement(name = "TotalPlannedBreakTime")
    protected Boolean totalPlannedBreakTime;
    @XmlElement(name = "TotalPlannedBusinessOptimalDistance")
    protected Boolean totalPlannedBusinessOptimalDistance;
    @XmlElement(name = "TotalPlannedBusinessOptimalTime")
    protected Boolean totalPlannedBusinessOptimalTime;
    @XmlElement(name = "TotalPlannedDeliveryQuantities")
    protected Boolean totalPlannedDeliveryQuantities;
    @XmlElement(name = "TotalPlannedDepotServiceTime")
    protected Boolean totalPlannedDepotServiceTime;
    @XmlElement(name = "TotalPlannedDestinationDepotFee")
    protected Boolean totalPlannedDestinationDepotFee;
    @XmlElement(name = "TotalPlannedDistance")
    protected Boolean totalPlannedDistance;
    @XmlElement(name = "TotalPlannedFee")
    protected Boolean totalPlannedFee;
    @XmlElement(name = "TotalPlannedFixedServiceTime")
    protected Boolean totalPlannedFixedServiceTime;
    @XmlElement(name = "TotalPlannedLayoverTime")
    protected Boolean totalPlannedLayoverTime;
    @XmlElement(name = "TotalPlannedOriginDepotFee")
    protected Boolean totalPlannedOriginDepotFee;
    @XmlElement(name = "TotalPlannedPaidBreakTime")
    protected Boolean totalPlannedPaidBreakTime;
    @XmlElement(name = "TotalPlannedPaidLayoverTime")
    protected Boolean totalPlannedPaidLayoverTime;
    @XmlElement(name = "TotalPlannedPickupQuantities")
    protected Boolean totalPlannedPickupQuantities;
    @XmlElement(name = "TotalPlannedServiceTime")
    protected Boolean totalPlannedServiceTime;
    @XmlElement(name = "TotalPlannedTime")
    protected Boolean totalPlannedTime;
    @XmlElement(name = "TotalPlannedTravelTime")
    protected Boolean totalPlannedTravelTime;
    @XmlElement(name = "TotalPlannedTrueOptimalDistance")
    protected Boolean totalPlannedTrueOptimalDistance;
    @XmlElement(name = "TotalPlannedTrueOptimalTime")
    protected Boolean totalPlannedTrueOptimalTime;
    @XmlElement(name = "TotalPlannedUnpaidBreakTime")
    protected Boolean totalPlannedUnpaidBreakTime;
    @XmlElement(name = "TotalPlannedUnpaidLayoverTime")
    protected Boolean totalPlannedUnpaidLayoverTime;
    @XmlElement(name = "TotalPlannedVariableServiceTime")
    protected Boolean totalPlannedVariableServiceTime;
    @XmlElement(name = "TotalPlannedWaitTime")
    protected Boolean totalPlannedWaitTime;
    @XmlElement(name = "TotalServiceTime")
    protected Boolean totalServiceTime;
    @XmlElement(name = "TotalStopDelayTime")
    protected Boolean totalStopDelayTime;
    @XmlElement(name = "TotalStopEngineIdleTime")
    protected Boolean totalStopEngineIdleTime;
    @XmlElement(name = "TotalTime")
    protected Boolean totalTime;
    @XmlElement(name = "TotalTravelTime")
    protected Boolean totalTravelTime;
    @XmlElement(name = "TotalUnpaidBreakTime")
    protected Boolean totalUnpaidBreakTime;
    @XmlElement(name = "TotalUnpaidLayoverTime")
    protected Boolean totalUnpaidLayoverTime;
    @XmlElement(name = "TotalUnpaidTime")
    protected Boolean totalUnpaidTime;
    @XmlElement(name = "TotalVariableServiceTime")
    protected Boolean totalVariableServiceTime;
    @XmlElement(name = "TotalWaitTime")
    protected Boolean totalWaitTime;
    @XmlElement(name = "TravelPathChangedVersion")
    protected Boolean travelPathChangedVersion;
    @XmlElement(name = "TravelTimeToDestination")
    protected Boolean travelTimeToDestination;
    @XmlElement(name = "Workers")
    protected Boolean workers;
    @XmlElementRef(name = "WorkersOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteWorkerPropertyOptions> workersOptions;
    @XmlElement(name = "WorldTimeZone_DestinationDepotTimeZone")
    protected Boolean worldTimeZoneDestinationDepotTimeZone;
    @XmlElement(name = "WorldTimeZone_OriginDepotTimeZone")
    protected Boolean worldTimeZoneOriginDepotTimeZone;

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
     * Obtém o valor da propriedade capacity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCapacity() {
        return capacity;
    }

    /**
     * Define o valor da propriedade capacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCapacity(Boolean value) {
        this.capacity = value;
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
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColor(Boolean value) {
        this.color = value;
    }

    /**
     * Obtém o valor da propriedade compartmentContents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompartmentContents() {
        return compartmentContents;
    }

    /**
     * Define o valor da propriedade compartmentContents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompartmentContents(Boolean value) {
        this.compartmentContents = value;
    }

    /**
     * Obtém o valor da propriedade completeTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleteTime() {
        return completeTime;
    }

    /**
     * Define o valor da propriedade completeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleteTime(Boolean value) {
        this.completeTime = value;
    }

    /**
     * Obtém o valor da propriedade completeTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleteTimeDifference() {
        return completeTimeDifference;
    }

    /**
     * Define o valor da propriedade completeTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleteTimeDifference(Boolean value) {
        this.completeTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade completeTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleteTimePercentageDifference() {
        return completeTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade completeTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleteTimePercentageDifference(Boolean value) {
        this.completeTimePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade costs.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCosts() {
        return costs;
    }

    /**
     * Define o valor da propriedade costs.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCosts(Boolean value) {
        this.costs = value;
    }

    /**
     * Obtém o valor da propriedade costsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteCostsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteCostsPropertyOptions> getCostsOptions() {
        return costsOptions;
    }

    /**
     * Define o valor da propriedade costsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteCostsPropertyOptions }{@code >}
     *     
     */
    public void setCostsOptions(JAXBElement<RouteCostsPropertyOptions> value) {
        this.costsOptions = value;
    }

    /**
     * Obtém o valor da propriedade dataCommunicationsTypeTelematicsDeviceCurrentDataComms.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataCommunicationsTypeTelematicsDeviceCurrentDataComms() {
        return dataCommunicationsTypeTelematicsDeviceCurrentDataComms;
    }

    /**
     * Define o valor da propriedade dataCommunicationsTypeTelematicsDeviceCurrentDataComms.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataCommunicationsTypeTelematicsDeviceCurrentDataComms(Boolean value) {
        this.dataCommunicationsTypeTelematicsDeviceCurrentDataComms = value;
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
     * Obtém o valor da propriedade destinationDepotCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationDepotCoordinate() {
        return destinationDepotCoordinate;
    }

    /**
     * Define o valor da propriedade destinationDepotCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationDepotCoordinate(Boolean value) {
        this.destinationDepotCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade destinationDepotDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationDepotDescription() {
        return destinationDepotDescription;
    }

    /**
     * Define o valor da propriedade destinationDepotDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationDepotDescription(Boolean value) {
        this.destinationDepotDescription = value;
    }

    /**
     * Obtém o valor da propriedade destinationDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationDepotEntityKey() {
        return destinationDepotEntityKey;
    }

    /**
     * Define o valor da propriedade destinationDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationDepotEntityKey(Boolean value) {
        this.destinationDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade destinationDepotIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationDepotIdentifier() {
        return destinationDepotIdentifier;
    }

    /**
     * Define o valor da propriedade destinationDepotIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationDepotIdentifier(Boolean value) {
        this.destinationDepotIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade destinationEngineIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationEngineIdleTime() {
        return destinationEngineIdleTime;
    }

    /**
     * Define o valor da propriedade destinationEngineIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationEngineIdleTime(Boolean value) {
        this.destinationEngineIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade destinationEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationEngineRunTime() {
        return destinationEngineRunTime;
    }

    /**
     * Define o valor da propriedade destinationEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationEngineRunTime(Boolean value) {
        this.destinationEngineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade destinationFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationFuelUsed() {
        return destinationFuelUsed;
    }

    /**
     * Define o valor da propriedade destinationFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationFuelUsed(Boolean value) {
        this.destinationFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade deviceLoadTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviceLoadTime() {
        return deviceLoadTime;
    }

    /**
     * Define o valor da propriedade deviceLoadTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviceLoadTime(Boolean value) {
        this.deviceLoadTime = value;
    }

    /**
     * Obtém o valor da propriedade dispatcherEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispatcherEmailAddress() {
        return dispatcherEmailAddress;
    }

    /**
     * Define o valor da propriedade dispatcherEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispatcherEmailAddress(Boolean value) {
        this.dispatcherEmailAddress = value;
    }

    /**
     * Obtém o valor da propriedade dispatcherEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispatcherEntityKey() {
        return dispatcherEntityKey;
    }

    /**
     * Define o valor da propriedade dispatcherEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispatcherEntityKey(Boolean value) {
        this.dispatcherEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade dispatcherName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispatcherName() {
        return dispatcherName;
    }

    /**
     * Define o valor da propriedade dispatcherName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispatcherName(Boolean value) {
        this.dispatcherName = value;
    }

    /**
     * Obtém o valor da propriedade displayName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayName() {
        return displayName;
    }

    /**
     * Define o valor da propriedade displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayName(Boolean value) {
        this.displayName = value;
    }

    /**
     * Obtém o valor da propriedade distanceByJurisdictionHasBeenCalculated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceByJurisdictionHasBeenCalculated() {
        return distanceByJurisdictionHasBeenCalculated;
    }

    /**
     * Define o valor da propriedade distanceByJurisdictionHasBeenCalculated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceByJurisdictionHasBeenCalculated(Boolean value) {
        this.distanceByJurisdictionHasBeenCalculated = value;
    }

    /**
     * Obtém o valor da propriedade distanceToDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceToDestination() {
        return distanceToDestination;
    }

    /**
     * Define o valor da propriedade distanceToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceToDestination(Boolean value) {
        this.distanceToDestination = value;
    }

    /**
     * Obtém o valor da propriedade distanceToFirstStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceToFirstStop() {
        return distanceToFirstStop;
    }

    /**
     * Define o valor da propriedade distanceToFirstStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceToFirstStop(Boolean value) {
        this.distanceToFirstStop = value;
    }

    /**
     * Obtém o valor da propriedade engineRunTimeToDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEngineRunTimeToDestination() {
        return engineRunTimeToDestination;
    }

    /**
     * Define o valor da propriedade engineRunTimeToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEngineRunTimeToDestination(Boolean value) {
        this.engineRunTimeToDestination = value;
    }

    /**
     * Obtém o valor da propriedade equipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipment() {
        return equipment;
    }

    /**
     * Define o valor da propriedade equipment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipment(Boolean value) {
        this.equipment = value;
    }

    /**
     * Obtém o valor da propriedade equipmentOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteEquipmentPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteEquipmentPropertyOptions> getEquipmentOptions() {
        return equipmentOptions;
    }

    /**
     * Define o valor da propriedade equipmentOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteEquipmentPropertyOptions }{@code >}
     *     
     */
    public void setEquipmentOptions(JAXBElement<RouteEquipmentPropertyOptions> value) {
        this.equipmentOptions = value;
    }

    /**
     * Obtém o valor da propriedade firstStopIsOrigin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstStopIsOrigin() {
        return firstStopIsOrigin;
    }

    /**
     * Define o valor da propriedade firstStopIsOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstStopIsOrigin(Boolean value) {
        this.firstStopIsOrigin = value;
    }

    /**
     * Obtém o valor da propriedade fuelEconomy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuelEconomy() {
        return fuelEconomy;
    }

    /**
     * Define o valor da propriedade fuelEconomy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuelEconomy(Boolean value) {
        this.fuelEconomy = value;
    }

    /**
     * Obtém o valor da propriedade fuelUsedToDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuelUsedToDestination() {
        return fuelUsedToDestination;
    }

    /**
     * Define o valor da propriedade fuelUsedToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuelUsedToDestination(Boolean value) {
        this.fuelUsedToDestination = value;
    }

    /**
     * Obtém o valor da propriedade groupStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupStops() {
        return groupStops;
    }

    /**
     * Define o valor da propriedade groupStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupStops(Boolean value) {
        this.groupStops = value;
    }

    /**
     * Obtém o valor da propriedade groupStopsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupStopPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<GroupStopPropertyOptions> getGroupStopsOptions() {
        return groupStopsOptions;
    }

    /**
     * Define o valor da propriedade groupStopsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupStopPropertyOptions }{@code >}
     *     
     */
    public void setGroupStopsOptions(JAXBElement<GroupStopPropertyOptions> value) {
        this.groupStopsOptions = value;
    }

    /**
     * Obtém o valor da propriedade hasPositionHistory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPositionHistory() {
        return hasPositionHistory;
    }

    /**
     * Define o valor da propriedade hasPositionHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPositionHistory(Boolean value) {
        this.hasPositionHistory = value;
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
     * Obtém o valor da propriedade ignoreErrorsDuringMobileMessageProcessing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreErrorsDuringMobileMessageProcessing() {
        return ignoreErrorsDuringMobileMessageProcessing;
    }

    /**
     * Define o valor da propriedade ignoreErrorsDuringMobileMessageProcessing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreErrorsDuringMobileMessageProcessing(Boolean value) {
        this.ignoreErrorsDuringMobileMessageProcessing = value;
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
     *     {@link JAXBElement }{@code <}{@link RouteScoresPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteScoresPropertyOptions> getInternalScoringOptions() {
        return internalScoringOptions;
    }

    /**
     * Define o valor da propriedade internalScoringOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteScoresPropertyOptions }{@code >}
     *     
     */
    public void setInternalScoringOptions(JAXBElement<RouteScoresPropertyOptions> value) {
        this.internalScoringOptions = value;
    }

    /**
     * Obtém o valor da propriedade isLoadedToDevice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoadedToDevice() {
        return isLoadedToDevice;
    }

    /**
     * Define o valor da propriedade isLoadedToDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoadedToDevice(Boolean value) {
        this.isLoadedToDevice = value;
    }

    /**
     * Obtém o valor da propriedade isLoadedToMobileDevice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoadedToMobileDevice() {
        return isLoadedToMobileDevice;
    }

    /**
     * Define o valor da propriedade isLoadedToMobileDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoadedToMobileDevice(Boolean value) {
        this.isLoadedToMobileDevice = value;
    }

    /**
     * Obtém o valor da propriedade isLoadedToTelematicsDevice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoadedToTelematicsDevice() {
        return isLoadedToTelematicsDevice;
    }

    /**
     * Define o valor da propriedade isLoadedToTelematicsDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoadedToTelematicsDevice(Boolean value) {
        this.isLoadedToTelematicsDevice = value;
    }

    /**
     * Obtém o valor da propriedade isPlannedOptimalValid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPlannedOptimalValid() {
        return isPlannedOptimalValid;
    }

    /**
     * Define o valor da propriedade isPlannedOptimalValid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPlannedOptimalValid(Boolean value) {
        this.isPlannedOptimalValid = value;
    }

    /**
     * Obtém o valor da propriedade isReadyToLoadToDevice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadyToLoadToDevice() {
        return isReadyToLoadToDevice;
    }

    /**
     * Define o valor da propriedade isReadyToLoadToDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadyToLoadToDevice(Boolean value) {
        this.isReadyToLoadToDevice = value;
    }

    /**
     * Obtém o valor da propriedade jurisdictions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJurisdictions() {
        return jurisdictions;
    }

    /**
     * Define o valor da propriedade jurisdictions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJurisdictions(Boolean value) {
        this.jurisdictions = value;
    }

    /**
     * Obtém o valor da propriedade jurisdictionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteJurisdictionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteJurisdictionPropertyOptions> getJurisdictionsOptions() {
        return jurisdictionsOptions;
    }

    /**
     * Define o valor da propriedade jurisdictionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteJurisdictionPropertyOptions }{@code >}
     *     
     */
    public void setJurisdictionsOptions(JAXBElement<RouteJurisdictionPropertyOptions> value) {
        this.jurisdictionsOptions = value;
    }

    /**
     * Obtém o valor da propriedade keepRelativeSequenceOfLockedStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepRelativeSequenceOfLockedStops() {
        return keepRelativeSequenceOfLockedStops;
    }

    /**
     * Define o valor da propriedade keepRelativeSequenceOfLockedStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepRelativeSequenceOfLockedStops(Boolean value) {
        this.keepRelativeSequenceOfLockedStops = value;
    }

    /**
     * Obtém o valor da propriedade lastContactTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastContactTime() {
        return lastContactTime;
    }

    /**
     * Define o valor da propriedade lastContactTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastContactTime(Boolean value) {
        this.lastContactTime = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPosition.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastKnownPosition() {
        return lastKnownPosition;
    }

    /**
     * Define o valor da propriedade lastKnownPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastKnownPosition(Boolean value) {
        this.lastKnownPosition = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPositionText.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastKnownPositionText() {
        return lastKnownPositionText;
    }

    /**
     * Define o valor da propriedade lastKnownPositionText.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastKnownPositionText(Boolean value) {
        this.lastKnownPositionText = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPositionTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastKnownPositionTime() {
        return lastKnownPositionTime;
    }

    /**
     * Define o valor da propriedade lastKnownPositionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastKnownPositionTime(Boolean value) {
        this.lastKnownPositionTime = value;
    }

    /**
     * Obtém o valor da propriedade lastMessageId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastMessageId() {
        return lastMessageId;
    }

    /**
     * Define o valor da propriedade lastMessageId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastMessageId(Boolean value) {
        this.lastMessageId = value;
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
     * Obtém o valor da propriedade loadActionOriginLoadAction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadActionOriginLoadAction() {
        return loadActionOriginLoadAction;
    }

    /**
     * Define o valor da propriedade loadActionOriginLoadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadActionOriginLoadAction(Boolean value) {
        this.loadActionOriginLoadAction = value;
    }

    /**
     * Obtém o valor da propriedade maxRunningQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxRunningQuantity() {
        return maxRunningQuantity;
    }

    /**
     * Define o valor da propriedade maxRunningQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxRunningQuantity(Boolean value) {
        this.maxRunningQuantity = value;
    }

    /**
     * Obtém o valor da propriedade maximumRuntime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumRuntime() {
        return maximumRuntime;
    }

    /**
     * Define o valor da propriedade maximumRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumRuntime(Boolean value) {
        this.maximumRuntime = value;
    }

    /**
     * Obtém o valor da propriedade maximumTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumTravelTime() {
        return maximumTravelTime;
    }

    /**
     * Define o valor da propriedade maximumTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumTravelTime(Boolean value) {
        this.maximumTravelTime = value;
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
     * Obtém o valor da propriedade mobileDeviceBatteryState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileDeviceBatteryState() {
        return mobileDeviceBatteryState;
    }

    /**
     * Define o valor da propriedade mobileDeviceBatteryState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileDeviceBatteryState(Boolean value) {
        this.mobileDeviceBatteryState = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileDeviceDescription() {
        return mobileDeviceDescription;
    }

    /**
     * Define o valor da propriedade mobileDeviceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileDeviceDescription(Boolean value) {
        this.mobileDeviceDescription = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileDeviceEntityKey() {
        return mobileDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade mobileDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileDeviceEntityKey(Boolean value) {
        this.mobileDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileDeviceIdentifier() {
        return mobileDeviceIdentifier;
    }

    /**
     * Define o valor da propriedade mobileDeviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileDeviceIdentifier(Boolean value) {
        this.mobileDeviceIdentifier = value;
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
     * Obtém o valor da propriedade numberOfCancelledStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfCancelledStops() {
        return numberOfCancelledStops;
    }

    /**
     * Define o valor da propriedade numberOfCancelledStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfCancelledStops(Boolean value) {
        this.numberOfCancelledStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfCompletedServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfCompletedServiceableStops() {
        return numberOfCompletedServiceableStops;
    }

    /**
     * Define o valor da propriedade numberOfCompletedServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfCompletedServiceableStops(Boolean value) {
        this.numberOfCompletedServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfLayoverStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfLayoverStops() {
        return numberOfLayoverStops;
    }

    /**
     * Define o valor da propriedade numberOfLayoverStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfLayoverStops(Boolean value) {
        this.numberOfLayoverStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfLockedStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfLockedStops() {
        return numberOfLockedStops;
    }

    /**
     * Define o valor da propriedade numberOfLockedStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfLockedStops(Boolean value) {
        this.numberOfLockedStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMidRouteDepotStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfMidRouteDepotStops() {
        return numberOfMidRouteDepotStops;
    }

    /**
     * Define o valor da propriedade numberOfMidRouteDepotStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfMidRouteDepotStops(Boolean value) {
        this.numberOfMidRouteDepotStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMissedOpenCloseEarly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfMissedOpenCloseEarly() {
        return numberOfMissedOpenCloseEarly;
    }

    /**
     * Define o valor da propriedade numberOfMissedOpenCloseEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfMissedOpenCloseEarly(Boolean value) {
        this.numberOfMissedOpenCloseEarly = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMissedOpenCloseLate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfMissedOpenCloseLate() {
        return numberOfMissedOpenCloseLate;
    }

    /**
     * Define o valor da propriedade numberOfMissedOpenCloseLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfMissedOpenCloseLate(Boolean value) {
        this.numberOfMissedOpenCloseLate = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMissedServiceWindows.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfMissedServiceWindows() {
        return numberOfMissedServiceWindows;
    }

    /**
     * Define o valor da propriedade numberOfMissedServiceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfMissedServiceWindows(Boolean value) {
        this.numberOfMissedServiceWindows = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMissedServiceWindowsEarly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfMissedServiceWindowsEarly() {
        return numberOfMissedServiceWindowsEarly;
    }

    /**
     * Define o valor da propriedade numberOfMissedServiceWindowsEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfMissedServiceWindowsEarly(Boolean value) {
        this.numberOfMissedServiceWindowsEarly = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMissedServiceWindowsLate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfMissedServiceWindowsLate() {
        return numberOfMissedServiceWindowsLate;
    }

    /**
     * Define o valor da propriedade numberOfMissedServiceWindowsLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfMissedServiceWindowsLate(Boolean value) {
        this.numberOfMissedServiceWindowsLate = value;
    }

    /**
     * Obtém o valor da propriedade numberOfNavigationEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfNavigationEvents() {
        return numberOfNavigationEvents;
    }

    /**
     * Define o valor da propriedade numberOfNavigationEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfNavigationEvents(Boolean value) {
        this.numberOfNavigationEvents = value;
    }

    /**
     * Obtém o valor da propriedade numberOfNonServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfNonServiceableStops() {
        return numberOfNonServiceableStops;
    }

    /**
     * Define o valor da propriedade numberOfNonServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfNonServiceableStops(Boolean value) {
        this.numberOfNonServiceableStops = value;
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
     * Obtém o valor da propriedade numberOfServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfServiceableStops() {
        return numberOfServiceableStops;
    }

    /**
     * Define o valor da propriedade numberOfServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfServiceableStops(Boolean value) {
        this.numberOfServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfUnacknowledgedExceptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfUnacknowledgedExceptions() {
        return numberOfUnacknowledgedExceptions;
    }

    /**
     * Define o valor da propriedade numberOfUnacknowledgedExceptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfUnacknowledgedExceptions(Boolean value) {
        this.numberOfUnacknowledgedExceptions = value;
    }

    /**
     * Obtém o valor da propriedade numberOfUnacknowledgedNotes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfUnacknowledgedNotes() {
        return numberOfUnacknowledgedNotes;
    }

    /**
     * Define o valor da propriedade numberOfUnacknowledgedNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfUnacknowledgedNotes(Boolean value) {
        this.numberOfUnacknowledgedNotes = value;
    }

    /**
     * Obtém o valor da propriedade numberOfUnknownStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfUnknownStops() {
        return numberOfUnknownStops;
    }

    /**
     * Define o valor da propriedade numberOfUnknownStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfUnknownStops(Boolean value) {
        this.numberOfUnknownStops = value;
    }

    /**
     * Obtém o valor da propriedade optimizationSuggestions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimizationSuggestions() {
        return optimizationSuggestions;
    }

    /**
     * Define o valor da propriedade optimizationSuggestions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimizationSuggestions(Boolean value) {
        this.optimizationSuggestions = value;
    }

    /**
     * Obtém o valor da propriedade optimizationSuggestionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteOptimizationSuggestionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteOptimizationSuggestionPropertyOptions> getOptimizationSuggestionsOptions() {
        return optimizationSuggestionsOptions;
    }

    /**
     * Define o valor da propriedade optimizationSuggestionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteOptimizationSuggestionPropertyOptions }{@code >}
     *     
     */
    public void setOptimizationSuggestionsOptions(JAXBElement<RouteOptimizationSuggestionPropertyOptions> value) {
        this.optimizationSuggestionsOptions = value;
    }

    /**
     * Obtém o valor da propriedade originDepotCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginDepotCoordinate() {
        return originDepotCoordinate;
    }

    /**
     * Define o valor da propriedade originDepotCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginDepotCoordinate(Boolean value) {
        this.originDepotCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade originDepotDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginDepotDescription() {
        return originDepotDescription;
    }

    /**
     * Define o valor da propriedade originDepotDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginDepotDescription(Boolean value) {
        this.originDepotDescription = value;
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
     * Obtém o valor da propriedade originDepotIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginDepotIdentifier() {
        return originDepotIdentifier;
    }

    /**
     * Define o valor da propriedade originDepotIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginDepotIdentifier(Boolean value) {
        this.originDepotIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade originEngineIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginEngineIdleTime() {
        return originEngineIdleTime;
    }

    /**
     * Define o valor da propriedade originEngineIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginEngineIdleTime(Boolean value) {
        this.originEngineIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade originEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginEngineRunTime() {
        return originEngineRunTime;
    }

    /**
     * Define o valor da propriedade originEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginEngineRunTime(Boolean value) {
        this.originEngineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade originFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginFuelUsed() {
        return originFuelUsed;
    }

    /**
     * Define o valor da propriedade originFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginFuelUsed(Boolean value) {
        this.originFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade outOfSequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutOfSequence() {
        return outOfSequence;
    }

    /**
     * Define o valor da propriedade outOfSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutOfSequence(Boolean value) {
        this.outOfSequence = value;
    }

    /**
     * Obtém o valor da propriedade passCompartmentRoutingIsEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassCompartmentRoutingIsEnabled() {
        return passCompartmentRoutingIsEnabled;
    }

    /**
     * Define o valor da propriedade passCompartmentRoutingIsEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassCompartmentRoutingIsEnabled(Boolean value) {
        this.passCompartmentRoutingIsEnabled = value;
    }

    /**
     * Obtém o valor da propriedade passDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassDescription() {
        return passDescription;
    }

    /**
     * Define o valor da propriedade passDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassDescription(Boolean value) {
        this.passDescription = value;
    }

    /**
     * Obtém o valor da propriedade passEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassEntityKey() {
        return passEntityKey;
    }

    /**
     * Define o valor da propriedade passEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassEntityKey(Boolean value) {
        this.passEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade passIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassIdentifier() {
        return passIdentifier;
    }

    /**
     * Define o valor da propriedade passIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassIdentifier(Boolean value) {
        this.passIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade passMultiDayRoutingIsEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassMultiDayRoutingIsEnabled() {
        return passMultiDayRoutingIsEnabled;
    }

    /**
     * Define o valor da propriedade passMultiDayRoutingIsEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassMultiDayRoutingIsEnabled(Boolean value) {
        this.passMultiDayRoutingIsEnabled = value;
    }

    /**
     * Obtém o valor da propriedade passRecalculateBreaksAfterRouteCreation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassRecalculateBreaksAfterRouteCreation() {
        return passRecalculateBreaksAfterRouteCreation;
    }

    /**
     * Define o valor da propriedade passRecalculateBreaksAfterRouteCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassRecalculateBreaksAfterRouteCreation(Boolean value) {
        this.passRecalculateBreaksAfterRouteCreation = value;
    }

    /**
     * Obtém o valor da propriedade passRecalculateLayoversAfterRouteCreation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassRecalculateLayoversAfterRouteCreation() {
        return passRecalculateLayoversAfterRouteCreation;
    }

    /**
     * Define o valor da propriedade passRecalculateLayoversAfterRouteCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassRecalculateLayoversAfterRouteCreation(Boolean value) {
        this.passRecalculateLayoversAfterRouteCreation = value;
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
     * Obtém o valor da propriedade plannedBusinessOptimalCosts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedBusinessOptimalCosts() {
        return plannedBusinessOptimalCosts;
    }

    /**
     * Define o valor da propriedade plannedBusinessOptimalCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedBusinessOptimalCosts(Boolean value) {
        this.plannedBusinessOptimalCosts = value;
    }

    /**
     * Obtém o valor da propriedade plannedBusinessOptimalCostsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteCostsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteCostsPropertyOptions> getPlannedBusinessOptimalCostsOptions() {
        return plannedBusinessOptimalCostsOptions;
    }

    /**
     * Define o valor da propriedade plannedBusinessOptimalCostsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteCostsPropertyOptions }{@code >}
     *     
     */
    public void setPlannedBusinessOptimalCostsOptions(JAXBElement<RouteCostsPropertyOptions> value) {
        this.plannedBusinessOptimalCostsOptions = value;
    }

    /**
     * Obtém o valor da propriedade plannedCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedCompleteTime() {
        return plannedCompleteTime;
    }

    /**
     * Define o valor da propriedade plannedCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedCompleteTime(Boolean value) {
        this.plannedCompleteTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedCosts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedCosts() {
        return plannedCosts;
    }

    /**
     * Define o valor da propriedade plannedCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedCosts(Boolean value) {
        this.plannedCosts = value;
    }

    /**
     * Obtém o valor da propriedade plannedCostsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteCostsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteCostsPropertyOptions> getPlannedCostsOptions() {
        return plannedCostsOptions;
    }

    /**
     * Define o valor da propriedade plannedCostsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteCostsPropertyOptions }{@code >}
     *     
     */
    public void setPlannedCostsOptions(JAXBElement<RouteCostsPropertyOptions> value) {
        this.plannedCostsOptions = value;
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
     * Obtém o valor da propriedade plannedDistanceToDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDistanceToDestination() {
        return plannedDistanceToDestination;
    }

    /**
     * Define o valor da propriedade plannedDistanceToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDistanceToDestination(Boolean value) {
        this.plannedDistanceToDestination = value;
    }

    /**
     * Obtém o valor da propriedade plannedMaxRunningQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedMaxRunningQuantity() {
        return plannedMaxRunningQuantity;
    }

    /**
     * Define o valor da propriedade plannedMaxRunningQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedMaxRunningQuantity(Boolean value) {
        this.plannedMaxRunningQuantity = value;
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
     * Obtém o valor da propriedade plannedNumberOfLayoverStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedNumberOfLayoverStops() {
        return plannedNumberOfLayoverStops;
    }

    /**
     * Define o valor da propriedade plannedNumberOfLayoverStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedNumberOfLayoverStops(Boolean value) {
        this.plannedNumberOfLayoverStops = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMidRouteDepotStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedNumberOfMidRouteDepotStops() {
        return plannedNumberOfMidRouteDepotStops;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMidRouteDepotStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedNumberOfMidRouteDepotStops(Boolean value) {
        this.plannedNumberOfMidRouteDepotStops = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMissedOpenCloseEarly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedNumberOfMissedOpenCloseEarly() {
        return plannedNumberOfMissedOpenCloseEarly;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMissedOpenCloseEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedNumberOfMissedOpenCloseEarly(Boolean value) {
        this.plannedNumberOfMissedOpenCloseEarly = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMissedOpenCloseLate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedNumberOfMissedOpenCloseLate() {
        return plannedNumberOfMissedOpenCloseLate;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMissedOpenCloseLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedNumberOfMissedOpenCloseLate(Boolean value) {
        this.plannedNumberOfMissedOpenCloseLate = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMissedServiceWindows.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedNumberOfMissedServiceWindows() {
        return plannedNumberOfMissedServiceWindows;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMissedServiceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedNumberOfMissedServiceWindows(Boolean value) {
        this.plannedNumberOfMissedServiceWindows = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMissedServiceWindowsEarly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedNumberOfMissedServiceWindowsEarly() {
        return plannedNumberOfMissedServiceWindowsEarly;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMissedServiceWindowsEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedNumberOfMissedServiceWindowsEarly(Boolean value) {
        this.plannedNumberOfMissedServiceWindowsEarly = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMissedServiceWindowsLate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedNumberOfMissedServiceWindowsLate() {
        return plannedNumberOfMissedServiceWindowsLate;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMissedServiceWindowsLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedNumberOfMissedServiceWindowsLate(Boolean value) {
        this.plannedNumberOfMissedServiceWindowsLate = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfNonServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedNumberOfNonServiceableStops() {
        return plannedNumberOfNonServiceableStops;
    }

    /**
     * Define o valor da propriedade plannedNumberOfNonServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedNumberOfNonServiceableStops(Boolean value) {
        this.plannedNumberOfNonServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedNumberOfServiceableStops() {
        return plannedNumberOfServiceableStops;
    }

    /**
     * Define o valor da propriedade plannedNumberOfServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedNumberOfServiceableStops(Boolean value) {
        this.plannedNumberOfServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade plannedPostRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedPostRouteTime() {
        return plannedPostRouteTime;
    }

    /**
     * Define o valor da propriedade plannedPostRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedPostRouteTime(Boolean value) {
        this.plannedPostRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedPreRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedPreRouteTime() {
        return plannedPreRouteTime;
    }

    /**
     * Define o valor da propriedade plannedPreRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedPreRouteTime(Boolean value) {
        this.plannedPreRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedRunningQuantityAfterOrigin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedRunningQuantityAfterOrigin() {
        return plannedRunningQuantityAfterOrigin;
    }

    /**
     * Define o valor da propriedade plannedRunningQuantityAfterOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedRunningQuantityAfterOrigin(Boolean value) {
        this.plannedRunningQuantityAfterOrigin = value;
    }

    /**
     * Obtém o valor da propriedade plannedStartTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedStartTime() {
        return plannedStartTime;
    }

    /**
     * Define o valor da propriedade plannedStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedStartTime(Boolean value) {
        this.plannedStartTime = value;
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
     * Obtém o valor da propriedade plannedTravelTimeToDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTravelTimeToDestination() {
        return plannedTravelTimeToDestination;
    }

    /**
     * Define o valor da propriedade plannedTravelTimeToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTravelTimeToDestination(Boolean value) {
        this.plannedTravelTimeToDestination = value;
    }

    /**
     * Obtém o valor da propriedade plannedTrueOptimalCosts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTrueOptimalCosts() {
        return plannedTrueOptimalCosts;
    }

    /**
     * Define o valor da propriedade plannedTrueOptimalCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTrueOptimalCosts(Boolean value) {
        this.plannedTrueOptimalCosts = value;
    }

    /**
     * Obtém o valor da propriedade plannedTrueOptimalCostsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteCostsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteCostsPropertyOptions> getPlannedTrueOptimalCostsOptions() {
        return plannedTrueOptimalCostsOptions;
    }

    /**
     * Define o valor da propriedade plannedTrueOptimalCostsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteCostsPropertyOptions }{@code >}
     *     
     */
    public void setPlannedTrueOptimalCostsOptions(JAXBElement<RouteCostsPropertyOptions> value) {
        this.plannedTrueOptimalCostsOptions = value;
    }

    /**
     * Obtém o valor da propriedade position.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPosition() {
        return position;
    }

    /**
     * Define o valor da propriedade position.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPosition(Boolean value) {
        this.position = value;
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
     * Obtém o valor da propriedade postStartDelay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostStartDelay() {
        return postStartDelay;
    }

    /**
     * Define o valor da propriedade postStartDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostStartDelay(Boolean value) {
        this.postStartDelay = value;
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
     * Obtém o valor da propriedade preStartDelay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreStartDelay() {
        return preStartDelay;
    }

    /**
     * Define o valor da propriedade preStartDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreStartDelay(Boolean value) {
        this.preStartDelay = value;
    }

    /**
     * Obtém o valor da propriedade preferredRuntime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredRuntime() {
        return preferredRuntime;
    }

    /**
     * Define o valor da propriedade preferredRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredRuntime(Boolean value) {
        this.preferredRuntime = value;
    }

    /**
     * Obtém o valor da propriedade profit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProfit() {
        return profit;
    }

    /**
     * Define o valor da propriedade profit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfit(Boolean value) {
        this.profit = value;
    }

    /**
     * Obtém o valor da propriedade projectedNumberOfMissedServiceWindows.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProjectedNumberOfMissedServiceWindows() {
        return projectedNumberOfMissedServiceWindows;
    }

    /**
     * Define o valor da propriedade projectedNumberOfMissedServiceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProjectedNumberOfMissedServiceWindows(Boolean value) {
        this.projectedNumberOfMissedServiceWindows = value;
    }

    /**
     * Obtém o valor da propriedade projectedNumberOfMissedServiceWindowsEarly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProjectedNumberOfMissedServiceWindowsEarly() {
        return projectedNumberOfMissedServiceWindowsEarly;
    }

    /**
     * Define o valor da propriedade projectedNumberOfMissedServiceWindowsEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProjectedNumberOfMissedServiceWindowsEarly(Boolean value) {
        this.projectedNumberOfMissedServiceWindowsEarly = value;
    }

    /**
     * Obtém o valor da propriedade projectedNumberOfMissedServiceWindowsLate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProjectedNumberOfMissedServiceWindowsLate() {
        return projectedNumberOfMissedServiceWindowsLate;
    }

    /**
     * Define o valor da propriedade projectedNumberOfMissedServiceWindowsLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProjectedNumberOfMissedServiceWindowsLate(Boolean value) {
        this.projectedNumberOfMissedServiceWindowsLate = value;
    }

    /**
     * Obtém o valor da propriedade published.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublished() {
        return published;
    }

    /**
     * Define o valor da propriedade published.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublished(Boolean value) {
        this.published = value;
    }

    /**
     * Obtém o valor da propriedade regionDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegionDescription() {
        return regionDescription;
    }

    /**
     * Define o valor da propriedade regionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegionDescription(Boolean value) {
        this.regionDescription = value;
    }

    /**
     * Obtém o valor da propriedade regionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegionIdentifier() {
        return regionIdentifier;
    }

    /**
     * Define o valor da propriedade regionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegionIdentifier(Boolean value) {
        this.regionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade resourceEventsEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResourceEventsEntityKey() {
        return resourceEventsEntityKey;
    }

    /**
     * Define o valor da propriedade resourceEventsEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResourceEventsEntityKey(Boolean value) {
        this.resourceEventsEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeAlertFlagsAlerts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteAlertFlagsAlerts() {
        return routeAlertFlagsAlerts;
    }

    /**
     * Define o valor da propriedade routeAlertFlagsAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteAlertFlagsAlerts(Boolean value) {
        this.routeAlertFlagsAlerts = value;
    }

    /**
     * Obtém o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchAssignOrdersState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteAutonomousDispatchStateAutonomousDispatchAssignOrdersState() {
        return routeAutonomousDispatchStateAutonomousDispatchAssignOrdersState;
    }

    /**
     * Define o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchAssignOrdersState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteAutonomousDispatchStateAutonomousDispatchAssignOrdersState(Boolean value) {
        this.routeAutonomousDispatchStateAutonomousDispatchAssignOrdersState = value;
    }

    /**
     * Obtém o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchResequenceState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteAutonomousDispatchStateAutonomousDispatchResequenceState() {
        return routeAutonomousDispatchStateAutonomousDispatchResequenceState;
    }

    /**
     * Define o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchResequenceState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteAutonomousDispatchStateAutonomousDispatchResequenceState(Boolean value) {
        this.routeAutonomousDispatchStateAutonomousDispatchResequenceState = value;
    }

    /**
     * Obtém o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteAutonomousDispatchStateAutonomousDispatchState() {
        return routeAutonomousDispatchStateAutonomousDispatchState;
    }

    /**
     * Define o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteAutonomousDispatchStateAutonomousDispatchState(Boolean value) {
        this.routeAutonomousDispatchStateAutonomousDispatchState = value;
    }

    /**
     * Obtém o valor da propriedade routeConstraintFlagsBrokenConstraints.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteConstraintFlagsBrokenConstraints() {
        return routeConstraintFlagsBrokenConstraints;
    }

    /**
     * Define o valor da propriedade routeConstraintFlagsBrokenConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteConstraintFlagsBrokenConstraints(Boolean value) {
        this.routeConstraintFlagsBrokenConstraints = value;
    }

    /**
     * Obtém o valor da propriedade routeCreationMethodCreationMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteCreationMethodCreationMethod() {
        return routeCreationMethodCreationMethod;
    }

    /**
     * Define o valor da propriedade routeCreationMethodCreationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteCreationMethodCreationMethod(Boolean value) {
        this.routeCreationMethodCreationMethod = value;
    }

    /**
     * Obtém o valor da propriedade routePhasePhase.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutePhasePhase() {
        return routePhasePhase;
    }

    /**
     * Define o valor da propriedade routePhasePhase.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutePhasePhase(Boolean value) {
        this.routePhasePhase = value;
    }

    /**
     * Obtém o valor da propriedade routeStateState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteStateState() {
        return routeStateState;
    }

    /**
     * Define o valor da propriedade routeStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteStateState(Boolean value) {
        this.routeStateState = value;
    }

    /**
     * Obtém o valor da propriedade routeStatusStatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteStatusStatus() {
        return routeStatusStatus;
    }

    /**
     * Define o valor da propriedade routeStatusStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteStatusStatus(Boolean value) {
        this.routeStatusStatus = value;
    }

    /**
     * Obtém o valor da propriedade routeTenderStateTenderState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteTenderStateTenderState() {
        return routeTenderStateTenderState;
    }

    /**
     * Define o valor da propriedade routeTenderStateTenderState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteTenderStateTenderState(Boolean value) {
        this.routeTenderStateTenderState = value;
    }

    /**
     * Obtém o valor da propriedade routeTenders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteTenders() {
        return routeTenders;
    }

    /**
     * Define o valor da propriedade routeTenders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteTenders(Boolean value) {
        this.routeTenders = value;
    }

    /**
     * Obtém o valor da propriedade routeTendersOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteTenderPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteTenderPropertyOptions> getRouteTendersOptions() {
        return routeTendersOptions;
    }

    /**
     * Define o valor da propriedade routeTendersOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteTenderPropertyOptions }{@code >}
     *     
     */
    public void setRouteTendersOptions(JAXBElement<RouteTenderPropertyOptions> value) {
        this.routeTendersOptions = value;
    }

    /**
     * Obtém o valor da propriedade routerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouterEntityKey() {
        return routerEntityKey;
    }

    /**
     * Define o valor da propriedade routerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouterEntityKey(Boolean value) {
        this.routerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routerName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouterName() {
        return routerName;
    }

    /**
     * Define o valor da propriedade routerName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouterName(Boolean value) {
        this.routerName = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutingSessionDate() {
        return routingSessionDate;
    }

    /**
     * Define o valor da propriedade routingSessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutingSessionDate(Boolean value) {
        this.routingSessionDate = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutingSessionDepotEntityKey() {
        return routingSessionDepotEntityKey;
    }

    /**
     * Define o valor da propriedade routingSessionDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutingSessionDepotEntityKey(Boolean value) {
        this.routingSessionDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutingSessionDescription() {
        return routingSessionDescription;
    }

    /**
     * Define o valor da propriedade routingSessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutingSessionDescription(Boolean value) {
        this.routingSessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutingSessionEntityKey() {
        return routingSessionEntityKey;
    }

    /**
     * Define o valor da propriedade routingSessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutingSessionEntityKey(Boolean value) {
        this.routingSessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade runningQuantityAfterOrigin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunningQuantityAfterOrigin() {
        return runningQuantityAfterOrigin;
    }

    /**
     * Define o valor da propriedade runningQuantityAfterOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunningQuantityAfterOrigin(Boolean value) {
        this.runningQuantityAfterOrigin = value;
    }

    /**
     * Obtém o valor da propriedade sessionModeRoutingSessionMode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionModeRoutingSessionMode() {
        return sessionModeRoutingSessionMode;
    }

    /**
     * Define o valor da propriedade sessionModeRoutingSessionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionModeRoutingSessionMode(Boolean value) {
        this.sessionModeRoutingSessionMode = value;
    }

    /**
     * Obtém o valor da propriedade shouldTreatAsTemplateOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldTreatAsTemplateOverride() {
        return shouldTreatAsTemplateOverride;
    }

    /**
     * Define o valor da propriedade shouldTreatAsTemplateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldTreatAsTemplateOverride(Boolean value) {
        this.shouldTreatAsTemplateOverride = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTime(Boolean value) {
        this.startTime = value;
    }

    /**
     * Obtém o valor da propriedade startTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTimeDifference() {
        return startTimeDifference;
    }

    /**
     * Define o valor da propriedade startTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTimeDifference(Boolean value) {
        this.startTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade startTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTimePercentageDifference() {
        return startTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade startTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTimePercentageDifference(Boolean value) {
        this.startTimePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade stops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStops() {
        return stops;
    }

    /**
     * Define o valor da propriedade stops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStops(Boolean value) {
        this.stops = value;
    }

    /**
     * Obtém o valor da propriedade stopsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<StopPropertyOptions> getStopsOptions() {
        return stopsOptions;
    }

    /**
     * Define o valor da propriedade stopsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPropertyOptions }{@code >}
     *     
     */
    public void setStopsOptions(JAXBElement<StopPropertyOptions> value) {
        this.stopsOptions = value;
    }

    /**
     * Obtém o valor da propriedade teamSplit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeamSplit() {
        return teamSplit;
    }

    /**
     * Define o valor da propriedade teamSplit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeamSplit(Boolean value) {
        this.teamSplit = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceEntityKey() {
        return telematicsDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceEntityKey(Boolean value) {
        this.telematicsDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceIdentifier() {
        return telematicsDeviceIdentifier;
    }

    /**
     * Define o valor da propriedade telematicsDeviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceIdentifier(Boolean value) {
        this.telematicsDeviceIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade territoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerritoryEntityKey() {
        return territoryEntityKey;
    }

    /**
     * Define o valor da propriedade territoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerritoryEntityKey(Boolean value) {
        this.territoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade totalBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalBreakTime() {
        return totalBreakTime;
    }

    /**
     * Define o valor da propriedade totalBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalBreakTime(Boolean value) {
        this.totalBreakTime = value;
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
     * Obtém o valor da propriedade totalDepotServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDepotServiceTime() {
        return totalDepotServiceTime;
    }

    /**
     * Define o valor da propriedade totalDepotServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDepotServiceTime(Boolean value) {
        this.totalDepotServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalDestinationDepotFee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDestinationDepotFee() {
        return totalDestinationDepotFee;
    }

    /**
     * Define o valor da propriedade totalDestinationDepotFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDestinationDepotFee(Boolean value) {
        this.totalDestinationDepotFee = value;
    }

    /**
     * Obtém o valor da propriedade totalDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDistance() {
        return totalDistance;
    }

    /**
     * Define o valor da propriedade totalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDistance(Boolean value) {
        this.totalDistance = value;
    }

    /**
     * Obtém o valor da propriedade totalDistanceDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDistanceDifference() {
        return totalDistanceDifference;
    }

    /**
     * Define o valor da propriedade totalDistanceDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDistanceDifference(Boolean value) {
        this.totalDistanceDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalDistancePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDistancePercentageDifference() {
        return totalDistancePercentageDifference;
    }

    /**
     * Define o valor da propriedade totalDistancePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDistancePercentageDifference(Boolean value) {
        this.totalDistancePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalEngineIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalEngineIdleTime() {
        return totalEngineIdleTime;
    }

    /**
     * Define o valor da propriedade totalEngineIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalEngineIdleTime(Boolean value) {
        this.totalEngineIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade totalEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalEngineRunTime() {
        return totalEngineRunTime;
    }

    /**
     * Define o valor da propriedade totalEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalEngineRunTime(Boolean value) {
        this.totalEngineRunTime = value;
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
     * Obtém o valor da propriedade totalFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalFuelUsed() {
        return totalFuelUsed;
    }

    /**
     * Define o valor da propriedade totalFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalFuelUsed(Boolean value) {
        this.totalFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade totalLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalLayoverTime() {
        return totalLayoverTime;
    }

    /**
     * Define o valor da propriedade totalLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalLayoverTime(Boolean value) {
        this.totalLayoverTime = value;
    }

    /**
     * Obtém o valor da propriedade totalNumberOfExceptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalNumberOfExceptions() {
        return totalNumberOfExceptions;
    }

    /**
     * Define o valor da propriedade totalNumberOfExceptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalNumberOfExceptions(Boolean value) {
        this.totalNumberOfExceptions = value;
    }

    /**
     * Obtém o valor da propriedade totalOriginDepotFee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalOriginDepotFee() {
        return totalOriginDepotFee;
    }

    /**
     * Define o valor da propriedade totalOriginDepotFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalOriginDepotFee(Boolean value) {
        this.totalOriginDepotFee = value;
    }

    /**
     * Obtém o valor da propriedade totalPaidBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPaidBreakTime() {
        return totalPaidBreakTime;
    }

    /**
     * Define o valor da propriedade totalPaidBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPaidBreakTime(Boolean value) {
        this.totalPaidBreakTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPaidLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPaidLayoverTime() {
        return totalPaidLayoverTime;
    }

    /**
     * Define o valor da propriedade totalPaidLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPaidLayoverTime(Boolean value) {
        this.totalPaidLayoverTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPaidTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPaidTime() {
        return totalPaidTime;
    }

    /**
     * Define o valor da propriedade totalPaidTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPaidTime(Boolean value) {
        this.totalPaidTime = value;
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
     * Obtém o valor da propriedade totalPlannedBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedBreakTime() {
        return totalPlannedBreakTime;
    }

    /**
     * Define o valor da propriedade totalPlannedBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedBreakTime(Boolean value) {
        this.totalPlannedBreakTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedBusinessOptimalDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedBusinessOptimalDistance() {
        return totalPlannedBusinessOptimalDistance;
    }

    /**
     * Define o valor da propriedade totalPlannedBusinessOptimalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedBusinessOptimalDistance(Boolean value) {
        this.totalPlannedBusinessOptimalDistance = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedBusinessOptimalTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedBusinessOptimalTime() {
        return totalPlannedBusinessOptimalTime;
    }

    /**
     * Define o valor da propriedade totalPlannedBusinessOptimalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedBusinessOptimalTime(Boolean value) {
        this.totalPlannedBusinessOptimalTime = value;
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
     * Obtém o valor da propriedade totalPlannedDepotServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedDepotServiceTime() {
        return totalPlannedDepotServiceTime;
    }

    /**
     * Define o valor da propriedade totalPlannedDepotServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedDepotServiceTime(Boolean value) {
        this.totalPlannedDepotServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedDestinationDepotFee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedDestinationDepotFee() {
        return totalPlannedDestinationDepotFee;
    }

    /**
     * Define o valor da propriedade totalPlannedDestinationDepotFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedDestinationDepotFee(Boolean value) {
        this.totalPlannedDestinationDepotFee = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedDistance() {
        return totalPlannedDistance;
    }

    /**
     * Define o valor da propriedade totalPlannedDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedDistance(Boolean value) {
        this.totalPlannedDistance = value;
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
     * Obtém o valor da propriedade totalPlannedLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedLayoverTime() {
        return totalPlannedLayoverTime;
    }

    /**
     * Define o valor da propriedade totalPlannedLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedLayoverTime(Boolean value) {
        this.totalPlannedLayoverTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedOriginDepotFee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedOriginDepotFee() {
        return totalPlannedOriginDepotFee;
    }

    /**
     * Define o valor da propriedade totalPlannedOriginDepotFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedOriginDepotFee(Boolean value) {
        this.totalPlannedOriginDepotFee = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedPaidBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedPaidBreakTime() {
        return totalPlannedPaidBreakTime;
    }

    /**
     * Define o valor da propriedade totalPlannedPaidBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedPaidBreakTime(Boolean value) {
        this.totalPlannedPaidBreakTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedPaidLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedPaidLayoverTime() {
        return totalPlannedPaidLayoverTime;
    }

    /**
     * Define o valor da propriedade totalPlannedPaidLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedPaidLayoverTime(Boolean value) {
        this.totalPlannedPaidLayoverTime = value;
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
     * Obtém o valor da propriedade totalPlannedTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedTime() {
        return totalPlannedTime;
    }

    /**
     * Define o valor da propriedade totalPlannedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedTime(Boolean value) {
        this.totalPlannedTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedTravelTime() {
        return totalPlannedTravelTime;
    }

    /**
     * Define o valor da propriedade totalPlannedTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedTravelTime(Boolean value) {
        this.totalPlannedTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedTrueOptimalDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedTrueOptimalDistance() {
        return totalPlannedTrueOptimalDistance;
    }

    /**
     * Define o valor da propriedade totalPlannedTrueOptimalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedTrueOptimalDistance(Boolean value) {
        this.totalPlannedTrueOptimalDistance = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedTrueOptimalTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedTrueOptimalTime() {
        return totalPlannedTrueOptimalTime;
    }

    /**
     * Define o valor da propriedade totalPlannedTrueOptimalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedTrueOptimalTime(Boolean value) {
        this.totalPlannedTrueOptimalTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedUnpaidBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedUnpaidBreakTime() {
        return totalPlannedUnpaidBreakTime;
    }

    /**
     * Define o valor da propriedade totalPlannedUnpaidBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedUnpaidBreakTime(Boolean value) {
        this.totalPlannedUnpaidBreakTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedUnpaidLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedUnpaidLayoverTime() {
        return totalPlannedUnpaidLayoverTime;
    }

    /**
     * Define o valor da propriedade totalPlannedUnpaidLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedUnpaidLayoverTime(Boolean value) {
        this.totalPlannedUnpaidLayoverTime = value;
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
     * Obtém o valor da propriedade totalPlannedWaitTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPlannedWaitTime() {
        return totalPlannedWaitTime;
    }

    /**
     * Define o valor da propriedade totalPlannedWaitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPlannedWaitTime(Boolean value) {
        this.totalPlannedWaitTime = value;
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
     * Obtém o valor da propriedade totalStopDelayTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalStopDelayTime() {
        return totalStopDelayTime;
    }

    /**
     * Define o valor da propriedade totalStopDelayTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalStopDelayTime(Boolean value) {
        this.totalStopDelayTime = value;
    }

    /**
     * Obtém o valor da propriedade totalStopEngineIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalStopEngineIdleTime() {
        return totalStopEngineIdleTime;
    }

    /**
     * Define o valor da propriedade totalStopEngineIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalStopEngineIdleTime(Boolean value) {
        this.totalStopEngineIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade totalTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalTime() {
        return totalTime;
    }

    /**
     * Define o valor da propriedade totalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalTime(Boolean value) {
        this.totalTime = value;
    }

    /**
     * Obtém o valor da propriedade totalTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalTravelTime() {
        return totalTravelTime;
    }

    /**
     * Define o valor da propriedade totalTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalTravelTime(Boolean value) {
        this.totalTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade totalUnpaidBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalUnpaidBreakTime() {
        return totalUnpaidBreakTime;
    }

    /**
     * Define o valor da propriedade totalUnpaidBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalUnpaidBreakTime(Boolean value) {
        this.totalUnpaidBreakTime = value;
    }

    /**
     * Obtém o valor da propriedade totalUnpaidLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalUnpaidLayoverTime() {
        return totalUnpaidLayoverTime;
    }

    /**
     * Define o valor da propriedade totalUnpaidLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalUnpaidLayoverTime(Boolean value) {
        this.totalUnpaidLayoverTime = value;
    }

    /**
     * Obtém o valor da propriedade totalUnpaidTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalUnpaidTime() {
        return totalUnpaidTime;
    }

    /**
     * Define o valor da propriedade totalUnpaidTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalUnpaidTime(Boolean value) {
        this.totalUnpaidTime = value;
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
     * Obtém o valor da propriedade totalWaitTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalWaitTime() {
        return totalWaitTime;
    }

    /**
     * Define o valor da propriedade totalWaitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalWaitTime(Boolean value) {
        this.totalWaitTime = value;
    }

    /**
     * Obtém o valor da propriedade travelPathChangedVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelPathChangedVersion() {
        return travelPathChangedVersion;
    }

    /**
     * Define o valor da propriedade travelPathChangedVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelPathChangedVersion(Boolean value) {
        this.travelPathChangedVersion = value;
    }

    /**
     * Obtém o valor da propriedade travelTimeToDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelTimeToDestination() {
        return travelTimeToDestination;
    }

    /**
     * Define o valor da propriedade travelTimeToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelTimeToDestination(Boolean value) {
        this.travelTimeToDestination = value;
    }

    /**
     * Obtém o valor da propriedade workers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkers() {
        return workers;
    }

    /**
     * Define o valor da propriedade workers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkers(Boolean value) {
        this.workers = value;
    }

    /**
     * Obtém o valor da propriedade workersOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteWorkerPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteWorkerPropertyOptions> getWorkersOptions() {
        return workersOptions;
    }

    /**
     * Define o valor da propriedade workersOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteWorkerPropertyOptions }{@code >}
     *     
     */
    public void setWorkersOptions(JAXBElement<RouteWorkerPropertyOptions> value) {
        this.workersOptions = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneDestinationDepotTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneDestinationDepotTimeZone() {
        return worldTimeZoneDestinationDepotTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneDestinationDepotTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneDestinationDepotTimeZone(Boolean value) {
        this.worldTimeZoneDestinationDepotTimeZone = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneOriginDepotTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneOriginDepotTimeZone() {
        return worldTimeZoneOriginDepotTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneOriginDepotTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneOriginDepotTimeZone(Boolean value) {
        this.worldTimeZoneOriginDepotTimeZone = value;
    }

}
