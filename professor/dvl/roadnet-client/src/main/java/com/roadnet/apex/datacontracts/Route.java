
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
 * <p>Classe Java de Route complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Route"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrivalTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTimeDifference" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Capacity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="CellEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://roadnet.com/apex/DataContracts/}Color" minOccurs="0"/&gt;
 *         &lt;element name="CompartmentContents" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCompartmentContents" minOccurs="0"/&gt;
 *         &lt;element name="CompleteTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="CompleteTimeDifference" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="CompleteTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Costs" type="{http://roadnet.com/apex/DataContracts/}RouteCosts" minOccurs="0"/&gt;
 *         &lt;element name="DataCommunicationsType_TelematicsDeviceCurrentDataComms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTimeDifference" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDepotCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDepotDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationEngineIdleTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="DestinationEngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="DestinationFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="DeviceLoadTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DispatcherEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DispatcherEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DispatcherName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistanceByJurisdictionHasBeenCalculated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToDestination" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDistance" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToFirstStop" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="EngineRunTimeToDestination" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Equipment" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteEquipmentBase" minOccurs="0"/&gt;
 *         &lt;element name="FirstStopIsOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FuelEconomy" type="{http://roadnet.com/apex/DataContracts/}FuelEconomy" minOccurs="0"/&gt;
 *         &lt;element name="FuelUsedToDestination" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="GroupStops" type="{http://roadnet.com/apex/DataContracts/}ArrayOfGroupStop" minOccurs="0"/&gt;
 *         &lt;element name="HasPositionHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Helper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreErrorsDuringMobileMessageProcessing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InternalScoring" type="{http://roadnet.com/apex/DataContracts/}RouteScores" minOccurs="0"/&gt;
 *         &lt;element name="IsLoadedToDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLoadedToMobileDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLoadedToTelematicsDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPlannedOptimalValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsReadyToLoadToDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Jurisdictions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteJurisdiction" minOccurs="0"/&gt;
 *         &lt;element name="KeepRelativeSequenceOfLockedStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastContactTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPosition" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPositionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPositionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastMessageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_OriginLoadAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxRunningQuantity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="MaximumRuntime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedOpenCloseEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedOpenCloseLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowsEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowsLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceBatteryState" type="{http://roadnet.com/apex/DataContracts/}BatteryState" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfCancelledStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfCompletedServiceableStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfLayoverStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfLockedStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMidRouteDepotStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMissedOpenCloseEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMissedOpenCloseLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMissedServiceWindows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMissedServiceWindowsEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMissedServiceWindowsLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfNavigationEvents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfNonServiceableStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOrders" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfServiceableStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfUnacknowledgedExceptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfUnacknowledgedNotes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfUnknownStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OptimizationSuggestions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteOptimizationSuggestion" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginEngineIdleTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OriginEngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OriginFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="OutOfSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassCompartmentRoutingIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassMultiDayRoutingIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassRecalculateBreaksAfterRouteCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassRecalculateLayoversAfterRouteCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedBusinessOptimalCosts" type="{http://roadnet.com/apex/DataContracts/}RouteCosts" minOccurs="0"/&gt;
 *         &lt;element name="PlannedCompleteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedCosts" type="{http://roadnet.com/apex/DataContracts/}RouteCosts" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDistanceToDestination" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMaxRunningQuantity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedOpenCloseEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedOpenCloseLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedServiceWindowsEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedServiceWindowsLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedTimeWindowDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfLayoverStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMidRouteDepotStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMissedOpenCloseEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMissedOpenCloseLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMissedServiceWindows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMissedServiceWindowsEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfMissedServiceWindowsLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfNonServiceableStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfServiceableStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPostRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPreRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedRunningQuantityAfterOrigin" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTravelTimeToDestination" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTrueOptimalCosts" type="{http://roadnet.com/apex/DataContracts/}RouteCosts" minOccurs="0"/&gt;
 *         &lt;element name="PostRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PostStartDelay" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreStartDelay" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRuntime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Profit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedNumberOfMissedServiceWindows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedNumberOfMissedServiceWindowsEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedNumberOfMissedServiceWindowsLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Published" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResourceEventsEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteAlertFlags_Alerts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteAutonomousDispatchState_AutonomousDispatchAssignOrdersState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteAutonomousDispatchState_AutonomousDispatchResequenceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteAutonomousDispatchState_AutonomousDispatchState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteConstraintFlags_BrokenConstraints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteCreationMethod_CreationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoutePhase_Phase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteState_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteStatus_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenderState_TenderState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenders" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteTender" minOccurs="0"/&gt;
 *         &lt;element name="RouterEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouterName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RunningQuantityAfterOrigin" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="SessionMode_RoutingSessionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShouldTreatAsTemplateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeDifference" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StartTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Stops" type="{http://roadnet.com/apex/DataContracts/}ArrayOfStop" minOccurs="0"/&gt;
 *         &lt;element name="TeamSplit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalBreakTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryDamagedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryOverQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryShortQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalDepotServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalDestinationDepotFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TotalDistanceDifference" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TotalDistancePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineIdleTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="TotalLayoverTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumberOfExceptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalOriginDepotFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalPaidBreakTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPaidLayoverTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPaidTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupDamagedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupOverQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupShortQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedBreakTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedBusinessOptimalDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedBusinessOptimalTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDepotServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDestinationDepotFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedLayoverTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedOriginDepotFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedPaidBreakTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedPaidLayoverTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedTrueOptimalDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedTrueOptimalTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedUnpaidBreakTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedUnpaidLayoverTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedVariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedWaitTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalStopDelayTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalStopEngineIdleTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalUnpaidBreakTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalUnpaidLayoverTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalUnpaidTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalVariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalWaitTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TravelPathChangedVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TravelTimeToDestination" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Workers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteWorker" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_DestinationDepotTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_OriginDepotTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Route", propOrder = {
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
    "firstStopIsOrigin",
    "fuelEconomy",
    "fuelUsedToDestination",
    "groupStops",
    "hasPositionHistory",
    "helper",
    "identifier",
    "ignoreErrorsDuringMobileMessageProcessing",
    "internalScoring",
    "isLoadedToDevice",
    "isLoadedToMobileDevice",
    "isLoadedToTelematicsDevice",
    "isPlannedOptimalValid",
    "isReadyToLoadToDevice",
    "jurisdictions",
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
    "plannedCompleteTime",
    "plannedCosts",
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
    "worldTimeZoneDestinationDepotTimeZone",
    "worldTimeZoneOriginDepotTimeZone"
})
public class Route
    extends RegionBasedAggregateRootEntity
{

    @XmlElementRef(name = "ArrivalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> arrivalTime;
    @XmlElement(name = "ArrivalTimeDifference")
    protected Duration arrivalTimeDifference;
    @XmlElement(name = "ArrivalTimePercentageDifference")
    protected Double arrivalTimePercentageDifference;
    @XmlElementRef(name = "Capacity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> capacity;
    @XmlElementRef(name = "CellEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cellEntityKey;
    @XmlElementRef(name = "Color", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Color> color;
    @XmlElementRef(name = "CompartmentContents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCompartmentContents> compartmentContents;
    @XmlElementRef(name = "CompleteTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> completeTime;
    @XmlElement(name = "CompleteTimeDifference")
    protected Duration completeTimeDifference;
    @XmlElement(name = "CompleteTimePercentageDifference")
    protected Double completeTimePercentageDifference;
    @XmlElementRef(name = "Costs", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteCosts> costs;
    @XmlElementRef(name = "DataCommunicationsType_TelematicsDeviceCurrentDataComms", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCommunicationsTypeTelematicsDeviceCurrentDataComms;
    @XmlElementRef(name = "DepartureTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> departureTime;
    @XmlElement(name = "DepartureTimeDifference")
    protected Duration departureTimeDifference;
    @XmlElement(name = "DepartureTimePercentageDifference")
    protected Double departureTimePercentageDifference;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DestinationDepotCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> destinationDepotCoordinate;
    @XmlElementRef(name = "DestinationDepotDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationDepotDescription;
    @XmlElementRef(name = "DestinationDepotEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> destinationDepotEntityKey;
    @XmlElementRef(name = "DestinationDepotIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationDepotIdentifier;
    @XmlElementRef(name = "DestinationEngineIdleTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> destinationEngineIdleTime;
    @XmlElementRef(name = "DestinationEngineRunTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> destinationEngineRunTime;
    @XmlElementRef(name = "DestinationFuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> destinationFuelUsed;
    @XmlElementRef(name = "DeviceLoadTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> deviceLoadTime;
    @XmlElementRef(name = "DispatcherEmailAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispatcherEmailAddress;
    @XmlElement(name = "DispatcherEntityKey")
    protected Long dispatcherEntityKey;
    @XmlElementRef(name = "DispatcherName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> dispatcherName;
    @XmlElementRef(name = "DisplayName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayName;
    @XmlElement(name = "DistanceByJurisdictionHasBeenCalculated")
    protected Boolean distanceByJurisdictionHasBeenCalculated;
    @XmlElementRef(name = "DistanceToDestination", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDistance> distanceToDestination;
    @XmlElementRef(name = "DistanceToFirstStop", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distanceToFirstStop;
    @XmlElementRef(name = "EngineRunTimeToDestination", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> engineRunTimeToDestination;
    @XmlElementRef(name = "Equipment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteEquipmentBase> equipment;
    @XmlElement(name = "FirstStopIsOrigin")
    protected Boolean firstStopIsOrigin;
    @XmlElementRef(name = "FuelEconomy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<FuelEconomy> fuelEconomy;
    @XmlElementRef(name = "FuelUsedToDestination", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> fuelUsedToDestination;
    @XmlElementRef(name = "GroupStops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGroupStop> groupStops;
    @XmlElement(name = "HasPositionHistory")
    protected Boolean hasPositionHistory;
    @XmlElement(name = "Helper")
    protected Boolean helper;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IgnoreErrorsDuringMobileMessageProcessing")
    protected Boolean ignoreErrorsDuringMobileMessageProcessing;
    @XmlElementRef(name = "InternalScoring", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteScores> internalScoring;
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
    @XmlElementRef(name = "Jurisdictions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteJurisdiction> jurisdictions;
    @XmlElement(name = "KeepRelativeSequenceOfLockedStops")
    protected Boolean keepRelativeSequenceOfLockedStops;
    @XmlElementRef(name = "LastContactTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastContactTime;
    @XmlElementRef(name = "LastKnownPosition", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> lastKnownPosition;
    @XmlElementRef(name = "LastKnownPositionText", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastKnownPositionText;
    @XmlElementRef(name = "LastKnownPositionTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastKnownPositionTime;
    @XmlElement(name = "LastMessageId")
    protected Integer lastMessageId;
    @XmlElement(name = "LastStopIsDestination")
    protected Boolean lastStopIsDestination;
    @XmlElementRef(name = "LoadAction_OriginLoadAction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loadActionOriginLoadAction;
    @XmlElementRef(name = "MaxRunningQuantity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> maxRunningQuantity;
    @XmlElement(name = "MaximumRuntime")
    protected Duration maximumRuntime;
    @XmlElementRef(name = "MaximumTravelTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> maximumTravelTime;
    @XmlElement(name = "MissedOpenCloseEarlyDuration")
    protected Duration missedOpenCloseEarlyDuration;
    @XmlElement(name = "MissedOpenCloseLateDuration")
    protected Duration missedOpenCloseLateDuration;
    @XmlElement(name = "MissedServiceWindowsEarlyDuration")
    protected Duration missedServiceWindowsEarlyDuration;
    @XmlElement(name = "MissedServiceWindowsLateDuration")
    protected Duration missedServiceWindowsLateDuration;
    @XmlElement(name = "MissedTimeWindowDuration")
    protected Duration missedTimeWindowDuration;
    @XmlElementRef(name = "MobileDeviceBatteryState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BatteryState> mobileDeviceBatteryState;
    @XmlElementRef(name = "MobileDeviceDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileDeviceDescription;
    @XmlElementRef(name = "MobileDeviceEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mobileDeviceEntityKey;
    @XmlElementRef(name = "MobileDeviceIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileDeviceIdentifier;
    @XmlElementRef(name = "NetRevenue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> netRevenue;
    @XmlElement(name = "NumberOfCancelledStops")
    protected Integer numberOfCancelledStops;
    @XmlElement(name = "NumberOfCompletedServiceableStops")
    protected Integer numberOfCompletedServiceableStops;
    @XmlElement(name = "NumberOfLayoverStops")
    protected Integer numberOfLayoverStops;
    @XmlElement(name = "NumberOfLockedStops")
    protected Integer numberOfLockedStops;
    @XmlElement(name = "NumberOfMidRouteDepotStops")
    protected Integer numberOfMidRouteDepotStops;
    @XmlElement(name = "NumberOfMissedOpenCloseEarly")
    protected Integer numberOfMissedOpenCloseEarly;
    @XmlElement(name = "NumberOfMissedOpenCloseLate")
    protected Integer numberOfMissedOpenCloseLate;
    @XmlElement(name = "NumberOfMissedServiceWindows")
    protected Integer numberOfMissedServiceWindows;
    @XmlElement(name = "NumberOfMissedServiceWindowsEarly")
    protected Integer numberOfMissedServiceWindowsEarly;
    @XmlElement(name = "NumberOfMissedServiceWindowsLate")
    protected Integer numberOfMissedServiceWindowsLate;
    @XmlElement(name = "NumberOfNavigationEvents")
    protected Integer numberOfNavigationEvents;
    @XmlElement(name = "NumberOfNonServiceableStops")
    protected Integer numberOfNonServiceableStops;
    @XmlElement(name = "NumberOfOrders")
    protected Integer numberOfOrders;
    @XmlElement(name = "NumberOfServiceableStops")
    protected Integer numberOfServiceableStops;
    @XmlElement(name = "NumberOfUnacknowledgedExceptions")
    protected Integer numberOfUnacknowledgedExceptions;
    @XmlElement(name = "NumberOfUnacknowledgedNotes")
    protected Integer numberOfUnacknowledgedNotes;
    @XmlElement(name = "NumberOfUnknownStops")
    protected Integer numberOfUnknownStops;
    @XmlElementRef(name = "OptimizationSuggestions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteOptimizationSuggestion> optimizationSuggestions;
    @XmlElementRef(name = "OriginDepotCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> originDepotCoordinate;
    @XmlElementRef(name = "OriginDepotDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originDepotDescription;
    @XmlElement(name = "OriginDepotEntityKey")
    protected Long originDepotEntityKey;
    @XmlElementRef(name = "OriginDepotIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originDepotIdentifier;
    @XmlElementRef(name = "OriginEngineIdleTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> originEngineIdleTime;
    @XmlElementRef(name = "OriginEngineRunTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> originEngineRunTime;
    @XmlElementRef(name = "OriginFuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> originFuelUsed;
    @XmlElement(name = "OutOfSequence")
    protected Boolean outOfSequence;
    @XmlElement(name = "PassCompartmentRoutingIsEnabled")
    protected Boolean passCompartmentRoutingIsEnabled;
    @XmlElementRef(name = "PassDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passDescription;
    @XmlElement(name = "PassEntityKey")
    protected Long passEntityKey;
    @XmlElementRef(name = "PassIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passIdentifier;
    @XmlElement(name = "PassMultiDayRoutingIsEnabled")
    protected Boolean passMultiDayRoutingIsEnabled;
    @XmlElement(name = "PassRecalculateBreaksAfterRouteCreation")
    protected Boolean passRecalculateBreaksAfterRouteCreation;
    @XmlElement(name = "PassRecalculateLayoversAfterRouteCreation")
    protected Boolean passRecalculateLayoversAfterRouteCreation;
    @XmlElementRef(name = "PlannedArrivalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedArrivalTime;
    @XmlElementRef(name = "PlannedBusinessOptimalCosts", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteCosts> plannedBusinessOptimalCosts;
    @XmlElementRef(name = "PlannedCompleteTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedCompleteTime;
    @XmlElementRef(name = "PlannedCosts", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteCosts> plannedCosts;
    @XmlElementRef(name = "PlannedDepartureTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedDepartureTime;
    @XmlElementRef(name = "PlannedDistanceToDestination", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> plannedDistanceToDestination;
    @XmlElementRef(name = "PlannedMaxRunningQuantity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedMaxRunningQuantity;
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
    @XmlElementRef(name = "PlannedNumberOfLayoverStops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedNumberOfLayoverStops;
    @XmlElementRef(name = "PlannedNumberOfMidRouteDepotStops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedNumberOfMidRouteDepotStops;
    @XmlElementRef(name = "PlannedNumberOfMissedOpenCloseEarly", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedNumberOfMissedOpenCloseEarly;
    @XmlElementRef(name = "PlannedNumberOfMissedOpenCloseLate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedNumberOfMissedOpenCloseLate;
    @XmlElementRef(name = "PlannedNumberOfMissedServiceWindows", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedNumberOfMissedServiceWindows;
    @XmlElementRef(name = "PlannedNumberOfMissedServiceWindowsEarly", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedNumberOfMissedServiceWindowsEarly;
    @XmlElementRef(name = "PlannedNumberOfMissedServiceWindowsLate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedNumberOfMissedServiceWindowsLate;
    @XmlElementRef(name = "PlannedNumberOfNonServiceableStops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedNumberOfNonServiceableStops;
    @XmlElementRef(name = "PlannedNumberOfServiceableStops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedNumberOfServiceableStops;
    @XmlElementRef(name = "PlannedPostRouteTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedPostRouteTime;
    @XmlElementRef(name = "PlannedPreRouteTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedPreRouteTime;
    @XmlElementRef(name = "PlannedRunningQuantityAfterOrigin", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedRunningQuantityAfterOrigin;
    @XmlElementRef(name = "PlannedStartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedStartTime;
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
    @XmlElementRef(name = "PlannedTravelTimeToDestination", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedTravelTimeToDestination;
    @XmlElementRef(name = "PlannedTrueOptimalCosts", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteCosts> plannedTrueOptimalCosts;
    @XmlElement(name = "PostRouteTime")
    protected Duration postRouteTime;
    @XmlElementRef(name = "PostStartDelay", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> postStartDelay;
    @XmlElement(name = "PreRouteTime")
    protected Duration preRouteTime;
    @XmlElementRef(name = "PreStartDelay", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> preStartDelay;
    @XmlElement(name = "PreferredRuntime")
    protected Duration preferredRuntime;
    @XmlElementRef(name = "Profit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> profit;
    @XmlElement(name = "ProjectedNumberOfMissedServiceWindows")
    protected Integer projectedNumberOfMissedServiceWindows;
    @XmlElement(name = "ProjectedNumberOfMissedServiceWindowsEarly")
    protected Integer projectedNumberOfMissedServiceWindowsEarly;
    @XmlElement(name = "ProjectedNumberOfMissedServiceWindowsLate")
    protected Integer projectedNumberOfMissedServiceWindowsLate;
    @XmlElement(name = "Published")
    protected Boolean published;
    @XmlElementRef(name = "RegionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionDescription;
    @XmlElementRef(name = "RegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionIdentifier;
    @XmlElementRef(name = "ResourceEventsEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> resourceEventsEntityKey;
    @XmlElementRef(name = "RouteAlertFlags_Alerts", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeAlertFlagsAlerts;
    @XmlElementRef(name = "RouteAutonomousDispatchState_AutonomousDispatchAssignOrdersState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeAutonomousDispatchStateAutonomousDispatchAssignOrdersState;
    @XmlElementRef(name = "RouteAutonomousDispatchState_AutonomousDispatchResequenceState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeAutonomousDispatchStateAutonomousDispatchResequenceState;
    @XmlElementRef(name = "RouteAutonomousDispatchState_AutonomousDispatchState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeAutonomousDispatchStateAutonomousDispatchState;
    @XmlElementRef(name = "RouteConstraintFlags_BrokenConstraints", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeConstraintFlagsBrokenConstraints;
    @XmlElementRef(name = "RouteCreationMethod_CreationMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeCreationMethodCreationMethod;
    @XmlElementRef(name = "RoutePhase_Phase", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routePhasePhase;
    @XmlElementRef(name = "RouteState_State", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeStateState;
    @XmlElementRef(name = "RouteStatus_Status", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeStatusStatus;
    @XmlElementRef(name = "RouteTenderState_TenderState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeTenderStateTenderState;
    @XmlElementRef(name = "RouteTenders", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteTender> routeTenders;
    @XmlElement(name = "RouterEntityKey")
    protected Long routerEntityKey;
    @XmlElementRef(name = "RouterName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> routerName;
    @XmlElementRef(name = "RoutingSessionDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> routingSessionDate;
    @XmlElementRef(name = "RoutingSessionDepotEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routingSessionDepotEntityKey;
    @XmlElementRef(name = "RoutingSessionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routingSessionDescription;
    @XmlElement(name = "RoutingSessionEntityKey")
    protected Long routingSessionEntityKey;
    @XmlElementRef(name = "RunningQuantityAfterOrigin", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> runningQuantityAfterOrigin;
    @XmlElementRef(name = "SessionMode_RoutingSessionMode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionModeRoutingSessionMode;
    @XmlElement(name = "ShouldTreatAsTemplateOverride")
    protected Boolean shouldTreatAsTemplateOverride;
    @XmlElementRef(name = "StartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> startTime;
    @XmlElement(name = "StartTimeDifference")
    protected Duration startTimeDifference;
    @XmlElement(name = "StartTimePercentageDifference")
    protected Double startTimePercentageDifference;
    @XmlElementRef(name = "Stops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStop> stops;
    @XmlElement(name = "TeamSplit")
    protected Boolean teamSplit;
    @XmlElementRef(name = "TelematicsDeviceEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> telematicsDeviceEntityKey;
    @XmlElementRef(name = "TelematicsDeviceIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telematicsDeviceIdentifier;
    @XmlElementRef(name = "TerritoryEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> territoryEntityKey;
    @XmlElement(name = "TotalBreakTime")
    protected Duration totalBreakTime;
    @XmlElementRef(name = "TotalDeliveryDamagedQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryDamagedQuantities;
    @XmlElementRef(name = "TotalDeliveryOverQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryOverQuantities;
    @XmlElementRef(name = "TotalDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryQuantities;
    @XmlElementRef(name = "TotalDeliveryShortQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryShortQuantities;
    @XmlElement(name = "TotalDepotServiceTime")
    protected Duration totalDepotServiceTime;
    @XmlElementRef(name = "TotalDestinationDepotFee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalDestinationDepotFee;
    @XmlElementRef(name = "TotalDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> totalDistance;
    @XmlElementRef(name = "TotalDistanceDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> totalDistanceDifference;
    @XmlElement(name = "TotalDistancePercentageDifference")
    protected Double totalDistancePercentageDifference;
    @XmlElementRef(name = "TotalEngineIdleTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalEngineIdleTime;
    @XmlElementRef(name = "TotalEngineRunTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalEngineRunTime;
    @XmlElement(name = "TotalFee")
    protected Double totalFee;
    @XmlElementRef(name = "TotalFixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalFixedServiceTime;
    @XmlElementRef(name = "TotalFuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> totalFuelUsed;
    @XmlElement(name = "TotalLayoverTime")
    protected Duration totalLayoverTime;
    @XmlElement(name = "TotalNumberOfExceptions")
    protected Integer totalNumberOfExceptions;
    @XmlElement(name = "TotalOriginDepotFee")
    protected Double totalOriginDepotFee;
    @XmlElement(name = "TotalPaidBreakTime")
    protected Duration totalPaidBreakTime;
    @XmlElement(name = "TotalPaidLayoverTime")
    protected Duration totalPaidLayoverTime;
    @XmlElement(name = "TotalPaidTime")
    protected Duration totalPaidTime;
    @XmlElementRef(name = "TotalPickupDamagedQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupDamagedQuantities;
    @XmlElementRef(name = "TotalPickupOverQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupOverQuantities;
    @XmlElementRef(name = "TotalPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupQuantities;
    @XmlElementRef(name = "TotalPickupShortQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupShortQuantities;
    @XmlElementRef(name = "TotalPlannedBreakTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedBreakTime;
    @XmlElementRef(name = "TotalPlannedBusinessOptimalDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> totalPlannedBusinessOptimalDistance;
    @XmlElementRef(name = "TotalPlannedBusinessOptimalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedBusinessOptimalTime;
    @XmlElementRef(name = "TotalPlannedDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPlannedDeliveryQuantities;
    @XmlElementRef(name = "TotalPlannedDepotServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedDepotServiceTime;
    @XmlElementRef(name = "TotalPlannedDestinationDepotFee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalPlannedDestinationDepotFee;
    @XmlElementRef(name = "TotalPlannedDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> totalPlannedDistance;
    @XmlElementRef(name = "TotalPlannedFee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalPlannedFee;
    @XmlElementRef(name = "TotalPlannedFixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedFixedServiceTime;
    @XmlElementRef(name = "TotalPlannedLayoverTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedLayoverTime;
    @XmlElementRef(name = "TotalPlannedOriginDepotFee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalPlannedOriginDepotFee;
    @XmlElementRef(name = "TotalPlannedPaidBreakTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedPaidBreakTime;
    @XmlElementRef(name = "TotalPlannedPaidLayoverTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedPaidLayoverTime;
    @XmlElementRef(name = "TotalPlannedPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPlannedPickupQuantities;
    @XmlElementRef(name = "TotalPlannedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedServiceTime;
    @XmlElementRef(name = "TotalPlannedTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedTime;
    @XmlElementRef(name = "TotalPlannedTravelTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedTravelTime;
    @XmlElementRef(name = "TotalPlannedTrueOptimalDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> totalPlannedTrueOptimalDistance;
    @XmlElementRef(name = "TotalPlannedTrueOptimalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedTrueOptimalTime;
    @XmlElementRef(name = "TotalPlannedUnpaidBreakTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedUnpaidBreakTime;
    @XmlElementRef(name = "TotalPlannedUnpaidLayoverTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedUnpaidLayoverTime;
    @XmlElementRef(name = "TotalPlannedVariableServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedVariableServiceTime;
    @XmlElementRef(name = "TotalPlannedWaitTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedWaitTime;
    @XmlElement(name = "TotalServiceTime")
    protected Duration totalServiceTime;
    @XmlElementRef(name = "TotalStopDelayTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalStopDelayTime;
    @XmlElementRef(name = "TotalStopEngineIdleTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalStopEngineIdleTime;
    @XmlElement(name = "TotalTime")
    protected Duration totalTime;
    @XmlElement(name = "TotalTravelTime")
    protected Duration totalTravelTime;
    @XmlElement(name = "TotalUnpaidBreakTime")
    protected Duration totalUnpaidBreakTime;
    @XmlElement(name = "TotalUnpaidLayoverTime")
    protected Duration totalUnpaidLayoverTime;
    @XmlElement(name = "TotalUnpaidTime")
    protected Duration totalUnpaidTime;
    @XmlElementRef(name = "TotalVariableServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalVariableServiceTime;
    @XmlElement(name = "TotalWaitTime")
    protected Duration totalWaitTime;
    @XmlElement(name = "TravelPathChangedVersion")
    protected Long travelPathChangedVersion;
    @XmlElement(name = "TravelTimeToDestination")
    protected Duration travelTimeToDestination;
    @XmlElementRef(name = "Workers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteWorker> workers;
    @XmlElementRef(name = "WorldTimeZone_DestinationDepotTimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneDestinationDepotTimeZone;
    @XmlElementRef(name = "WorldTimeZone_OriginDepotTimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneOriginDepotTimeZone;

    /**
     * Obtém o valor da propriedade arrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Define o valor da propriedade arrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setArrivalTime(JAXBElement<QualityPairedDateTime> value) {
        this.arrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade arrivalTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getArrivalTimeDifference() {
        return arrivalTimeDifference;
    }

    /**
     * Define o valor da propriedade arrivalTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setArrivalTimeDifference(Duration value) {
        this.arrivalTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade arrivalTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getArrivalTimePercentageDifference() {
        return arrivalTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade arrivalTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setArrivalTimePercentageDifference(Double value) {
        this.arrivalTimePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade capacity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getCapacity() {
        return capacity;
    }

    /**
     * Define o valor da propriedade capacity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setCapacity(JAXBElement<Quantities> value) {
        this.capacity = value;
    }

    /**
     * Obtém o valor da propriedade cellEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCellEntityKey() {
        return cellEntityKey;
    }

    /**
     * Define o valor da propriedade cellEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCellEntityKey(JAXBElement<Long> value) {
        this.cellEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public JAXBElement<Color> getColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public void setColor(JAXBElement<Color> value) {
        this.color = value;
    }

    /**
     * Obtém o valor da propriedade compartmentContents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompartmentContents }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCompartmentContents> getCompartmentContents() {
        return compartmentContents;
    }

    /**
     * Define o valor da propriedade compartmentContents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompartmentContents }{@code >}
     *     
     */
    public void setCompartmentContents(JAXBElement<ArrayOfCompartmentContents> value) {
        this.compartmentContents = value;
    }

    /**
     * Obtém o valor da propriedade completeTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getCompleteTime() {
        return completeTime;
    }

    /**
     * Define o valor da propriedade completeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setCompleteTime(JAXBElement<QualityPairedDateTime> value) {
        this.completeTime = value;
    }

    /**
     * Obtém o valor da propriedade completeTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCompleteTimeDifference() {
        return completeTimeDifference;
    }

    /**
     * Define o valor da propriedade completeTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCompleteTimeDifference(Duration value) {
        this.completeTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade completeTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompleteTimePercentageDifference() {
        return completeTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade completeTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompleteTimePercentageDifference(Double value) {
        this.completeTimePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade costs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteCosts }{@code >}
     *     
     */
    public JAXBElement<RouteCosts> getCosts() {
        return costs;
    }

    /**
     * Define o valor da propriedade costs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteCosts }{@code >}
     *     
     */
    public void setCosts(JAXBElement<RouteCosts> value) {
        this.costs = value;
    }

    /**
     * Obtém o valor da propriedade dataCommunicationsTypeTelematicsDeviceCurrentDataComms.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCommunicationsTypeTelematicsDeviceCurrentDataComms() {
        return dataCommunicationsTypeTelematicsDeviceCurrentDataComms;
    }

    /**
     * Define o valor da propriedade dataCommunicationsTypeTelematicsDeviceCurrentDataComms.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCommunicationsTypeTelematicsDeviceCurrentDataComms(JAXBElement<String> value) {
        this.dataCommunicationsTypeTelematicsDeviceCurrentDataComms = value;
    }

    /**
     * Obtém o valor da propriedade departureTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getDepartureTime() {
        return departureTime;
    }

    /**
     * Define o valor da propriedade departureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setDepartureTime(JAXBElement<QualityPairedDateTime> value) {
        this.departureTime = value;
    }

    /**
     * Obtém o valor da propriedade departureTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDepartureTimeDifference() {
        return departureTimeDifference;
    }

    /**
     * Define o valor da propriedade departureTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDepartureTimeDifference(Duration value) {
        this.departureTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade departureTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepartureTimePercentageDifference() {
        return departureTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade departureTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepartureTimePercentageDifference(Double value) {
        this.departureTimePercentageDifference = value;
    }

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
     * Obtém o valor da propriedade destinationDepotCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getDestinationDepotCoordinate() {
        return destinationDepotCoordinate;
    }

    /**
     * Define o valor da propriedade destinationDepotCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setDestinationDepotCoordinate(JAXBElement<Coordinate> value) {
        this.destinationDepotCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade destinationDepotDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationDepotDescription() {
        return destinationDepotDescription;
    }

    /**
     * Define o valor da propriedade destinationDepotDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationDepotDescription(JAXBElement<String> value) {
        this.destinationDepotDescription = value;
    }

    /**
     * Obtém o valor da propriedade destinationDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDestinationDepotEntityKey() {
        return destinationDepotEntityKey;
    }

    /**
     * Define o valor da propriedade destinationDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDestinationDepotEntityKey(JAXBElement<Long> value) {
        this.destinationDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade destinationDepotIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationDepotIdentifier() {
        return destinationDepotIdentifier;
    }

    /**
     * Define o valor da propriedade destinationDepotIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationDepotIdentifier(JAXBElement<String> value) {
        this.destinationDepotIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade destinationEngineIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getDestinationEngineIdleTime() {
        return destinationEngineIdleTime;
    }

    /**
     * Define o valor da propriedade destinationEngineIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setDestinationEngineIdleTime(JAXBElement<Duration> value) {
        this.destinationEngineIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade destinationEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getDestinationEngineRunTime() {
        return destinationEngineRunTime;
    }

    /**
     * Define o valor da propriedade destinationEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setDestinationEngineRunTime(JAXBElement<Duration> value) {
        this.destinationEngineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade destinationFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getDestinationFuelUsed() {
        return destinationFuelUsed;
    }

    /**
     * Define o valor da propriedade destinationFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setDestinationFuelUsed(JAXBElement<LiquidVolume> value) {
        this.destinationFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade deviceLoadTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDeviceLoadTime() {
        return deviceLoadTime;
    }

    /**
     * Define o valor da propriedade deviceLoadTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDeviceLoadTime(JAXBElement<XMLGregorianCalendar> value) {
        this.deviceLoadTime = value;
    }

    /**
     * Obtém o valor da propriedade dispatcherEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispatcherEmailAddress() {
        return dispatcherEmailAddress;
    }

    /**
     * Define o valor da propriedade dispatcherEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispatcherEmailAddress(JAXBElement<String> value) {
        this.dispatcherEmailAddress = value;
    }

    /**
     * Obtém o valor da propriedade dispatcherEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDispatcherEntityKey() {
        return dispatcherEntityKey;
    }

    /**
     * Define o valor da propriedade dispatcherEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDispatcherEntityKey(Long value) {
        this.dispatcherEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade dispatcherName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getDispatcherName() {
        return dispatcherName;
    }

    /**
     * Define o valor da propriedade dispatcherName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setDispatcherName(JAXBElement<PersonName> value) {
        this.dispatcherName = value;
    }

    /**
     * Obtém o valor da propriedade displayName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Define o valor da propriedade displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link QualityPairedDistance }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDistance> getDistanceToDestination() {
        return distanceToDestination;
    }

    /**
     * Define o valor da propriedade distanceToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDistance }{@code >}
     *     
     */
    public void setDistanceToDestination(JAXBElement<QualityPairedDistance> value) {
        this.distanceToDestination = value;
    }

    /**
     * Obtém o valor da propriedade distanceToFirstStop.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistanceToFirstStop() {
        return distanceToFirstStop;
    }

    /**
     * Define o valor da propriedade distanceToFirstStop.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistanceToFirstStop(JAXBElement<Distance> value) {
        this.distanceToFirstStop = value;
    }

    /**
     * Obtém o valor da propriedade engineRunTimeToDestination.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getEngineRunTimeToDestination() {
        return engineRunTimeToDestination;
    }

    /**
     * Define o valor da propriedade engineRunTimeToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setEngineRunTimeToDestination(JAXBElement<Duration> value) {
        this.engineRunTimeToDestination = value;
    }

    /**
     * Obtém o valor da propriedade equipment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteEquipmentBase }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteEquipmentBase> getEquipment() {
        return equipment;
    }

    /**
     * Define o valor da propriedade equipment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteEquipmentBase }{@code >}
     *     
     */
    public void setEquipment(JAXBElement<ArrayOfRouteEquipmentBase> value) {
        this.equipment = value;
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
     *     {@link JAXBElement }{@code <}{@link FuelEconomy }{@code >}
     *     
     */
    public JAXBElement<FuelEconomy> getFuelEconomy() {
        return fuelEconomy;
    }

    /**
     * Define o valor da propriedade fuelEconomy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FuelEconomy }{@code >}
     *     
     */
    public void setFuelEconomy(JAXBElement<FuelEconomy> value) {
        this.fuelEconomy = value;
    }

    /**
     * Obtém o valor da propriedade fuelUsedToDestination.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getFuelUsedToDestination() {
        return fuelUsedToDestination;
    }

    /**
     * Define o valor da propriedade fuelUsedToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setFuelUsedToDestination(JAXBElement<LiquidVolume> value) {
        this.fuelUsedToDestination = value;
    }

    /**
     * Obtém o valor da propriedade groupStops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGroupStop }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGroupStop> getGroupStops() {
        return groupStops;
    }

    /**
     * Define o valor da propriedade groupStops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGroupStop }{@code >}
     *     
     */
    public void setGroupStops(JAXBElement<ArrayOfGroupStop> value) {
        this.groupStops = value;
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
     *     {@link JAXBElement }{@code <}{@link RouteScores }{@code >}
     *     
     */
    public JAXBElement<RouteScores> getInternalScoring() {
        return internalScoring;
    }

    /**
     * Define o valor da propriedade internalScoring.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteScores }{@code >}
     *     
     */
    public void setInternalScoring(JAXBElement<RouteScores> value) {
        this.internalScoring = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteJurisdiction }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteJurisdiction> getJurisdictions() {
        return jurisdictions;
    }

    /**
     * Define o valor da propriedade jurisdictions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteJurisdiction }{@code >}
     *     
     */
    public void setJurisdictions(JAXBElement<ArrayOfRouteJurisdiction> value) {
        this.jurisdictions = value;
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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastContactTime() {
        return lastContactTime;
    }

    /**
     * Define o valor da propriedade lastContactTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastContactTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastContactTime = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPosition.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getLastKnownPosition() {
        return lastKnownPosition;
    }

    /**
     * Define o valor da propriedade lastKnownPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setLastKnownPosition(JAXBElement<Coordinate> value) {
        this.lastKnownPosition = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPositionText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastKnownPositionText() {
        return lastKnownPositionText;
    }

    /**
     * Define o valor da propriedade lastKnownPositionText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastKnownPositionText(JAXBElement<String> value) {
        this.lastKnownPositionText = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPositionTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastKnownPositionTime() {
        return lastKnownPositionTime;
    }

    /**
     * Define o valor da propriedade lastKnownPositionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastKnownPositionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastKnownPositionTime = value;
    }

    /**
     * Obtém o valor da propriedade lastMessageId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastMessageId() {
        return lastMessageId;
    }

    /**
     * Define o valor da propriedade lastMessageId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastMessageId(Integer value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoadActionOriginLoadAction() {
        return loadActionOriginLoadAction;
    }

    /**
     * Define o valor da propriedade loadActionOriginLoadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoadActionOriginLoadAction(JAXBElement<String> value) {
        this.loadActionOriginLoadAction = value;
    }

    /**
     * Obtém o valor da propriedade maxRunningQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getMaxRunningQuantity() {
        return maxRunningQuantity;
    }

    /**
     * Define o valor da propriedade maxRunningQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setMaxRunningQuantity(JAXBElement<Quantities> value) {
        this.maxRunningQuantity = value;
    }

    /**
     * Obtém o valor da propriedade maximumRuntime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumRuntime() {
        return maximumRuntime;
    }

    /**
     * Define o valor da propriedade maximumRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumRuntime(Duration value) {
        this.maximumRuntime = value;
    }

    /**
     * Obtém o valor da propriedade maximumTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMaximumTravelTime() {
        return maximumTravelTime;
    }

    /**
     * Define o valor da propriedade maximumTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMaximumTravelTime(JAXBElement<Duration> value) {
        this.maximumTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade missedOpenCloseEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMissedOpenCloseEarlyDuration() {
        return missedOpenCloseEarlyDuration;
    }

    /**
     * Define o valor da propriedade missedOpenCloseEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMissedOpenCloseEarlyDuration(Duration value) {
        this.missedOpenCloseEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedOpenCloseLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMissedOpenCloseLateDuration() {
        return missedOpenCloseLateDuration;
    }

    /**
     * Define o valor da propriedade missedOpenCloseLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMissedOpenCloseLateDuration(Duration value) {
        this.missedOpenCloseLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedServiceWindowsEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMissedServiceWindowsEarlyDuration() {
        return missedServiceWindowsEarlyDuration;
    }

    /**
     * Define o valor da propriedade missedServiceWindowsEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMissedServiceWindowsEarlyDuration(Duration value) {
        this.missedServiceWindowsEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedServiceWindowsLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMissedServiceWindowsLateDuration() {
        return missedServiceWindowsLateDuration;
    }

    /**
     * Define o valor da propriedade missedServiceWindowsLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMissedServiceWindowsLateDuration(Duration value) {
        this.missedServiceWindowsLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMissedTimeWindowDuration() {
        return missedTimeWindowDuration;
    }

    /**
     * Define o valor da propriedade missedTimeWindowDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMissedTimeWindowDuration(Duration value) {
        this.missedTimeWindowDuration = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceBatteryState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BatteryState }{@code >}
     *     
     */
    public JAXBElement<BatteryState> getMobileDeviceBatteryState() {
        return mobileDeviceBatteryState;
    }

    /**
     * Define o valor da propriedade mobileDeviceBatteryState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BatteryState }{@code >}
     *     
     */
    public void setMobileDeviceBatteryState(JAXBElement<BatteryState> value) {
        this.mobileDeviceBatteryState = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileDeviceDescription() {
        return mobileDeviceDescription;
    }

    /**
     * Define o valor da propriedade mobileDeviceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileDeviceDescription(JAXBElement<String> value) {
        this.mobileDeviceDescription = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMobileDeviceEntityKey() {
        return mobileDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade mobileDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMobileDeviceEntityKey(JAXBElement<Long> value) {
        this.mobileDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileDeviceIdentifier() {
        return mobileDeviceIdentifier;
    }

    /**
     * Define o valor da propriedade mobileDeviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileDeviceIdentifier(JAXBElement<String> value) {
        this.mobileDeviceIdentifier = value;
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
     * Obtém o valor da propriedade numberOfCancelledStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfCancelledStops() {
        return numberOfCancelledStops;
    }

    /**
     * Define o valor da propriedade numberOfCancelledStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfCancelledStops(Integer value) {
        this.numberOfCancelledStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfCompletedServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfCompletedServiceableStops() {
        return numberOfCompletedServiceableStops;
    }

    /**
     * Define o valor da propriedade numberOfCompletedServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfCompletedServiceableStops(Integer value) {
        this.numberOfCompletedServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfLayoverStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfLayoverStops() {
        return numberOfLayoverStops;
    }

    /**
     * Define o valor da propriedade numberOfLayoverStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfLayoverStops(Integer value) {
        this.numberOfLayoverStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfLockedStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfLockedStops() {
        return numberOfLockedStops;
    }

    /**
     * Define o valor da propriedade numberOfLockedStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfLockedStops(Integer value) {
        this.numberOfLockedStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMidRouteDepotStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfMidRouteDepotStops() {
        return numberOfMidRouteDepotStops;
    }

    /**
     * Define o valor da propriedade numberOfMidRouteDepotStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfMidRouteDepotStops(Integer value) {
        this.numberOfMidRouteDepotStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMissedOpenCloseEarly.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfMissedOpenCloseEarly() {
        return numberOfMissedOpenCloseEarly;
    }

    /**
     * Define o valor da propriedade numberOfMissedOpenCloseEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfMissedOpenCloseEarly(Integer value) {
        this.numberOfMissedOpenCloseEarly = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMissedOpenCloseLate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfMissedOpenCloseLate() {
        return numberOfMissedOpenCloseLate;
    }

    /**
     * Define o valor da propriedade numberOfMissedOpenCloseLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfMissedOpenCloseLate(Integer value) {
        this.numberOfMissedOpenCloseLate = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMissedServiceWindows.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfMissedServiceWindows() {
        return numberOfMissedServiceWindows;
    }

    /**
     * Define o valor da propriedade numberOfMissedServiceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfMissedServiceWindows(Integer value) {
        this.numberOfMissedServiceWindows = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMissedServiceWindowsEarly.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfMissedServiceWindowsEarly() {
        return numberOfMissedServiceWindowsEarly;
    }

    /**
     * Define o valor da propriedade numberOfMissedServiceWindowsEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfMissedServiceWindowsEarly(Integer value) {
        this.numberOfMissedServiceWindowsEarly = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMissedServiceWindowsLate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfMissedServiceWindowsLate() {
        return numberOfMissedServiceWindowsLate;
    }

    /**
     * Define o valor da propriedade numberOfMissedServiceWindowsLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfMissedServiceWindowsLate(Integer value) {
        this.numberOfMissedServiceWindowsLate = value;
    }

    /**
     * Obtém o valor da propriedade numberOfNavigationEvents.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfNavigationEvents() {
        return numberOfNavigationEvents;
    }

    /**
     * Define o valor da propriedade numberOfNavigationEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfNavigationEvents(Integer value) {
        this.numberOfNavigationEvents = value;
    }

    /**
     * Obtém o valor da propriedade numberOfNonServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfNonServiceableStops() {
        return numberOfNonServiceableStops;
    }

    /**
     * Define o valor da propriedade numberOfNonServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfNonServiceableStops(Integer value) {
        this.numberOfNonServiceableStops = value;
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
     * Obtém o valor da propriedade numberOfServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfServiceableStops() {
        return numberOfServiceableStops;
    }

    /**
     * Define o valor da propriedade numberOfServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfServiceableStops(Integer value) {
        this.numberOfServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfUnacknowledgedExceptions.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfUnacknowledgedExceptions() {
        return numberOfUnacknowledgedExceptions;
    }

    /**
     * Define o valor da propriedade numberOfUnacknowledgedExceptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfUnacknowledgedExceptions(Integer value) {
        this.numberOfUnacknowledgedExceptions = value;
    }

    /**
     * Obtém o valor da propriedade numberOfUnacknowledgedNotes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfUnacknowledgedNotes() {
        return numberOfUnacknowledgedNotes;
    }

    /**
     * Define o valor da propriedade numberOfUnacknowledgedNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfUnacknowledgedNotes(Integer value) {
        this.numberOfUnacknowledgedNotes = value;
    }

    /**
     * Obtém o valor da propriedade numberOfUnknownStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfUnknownStops() {
        return numberOfUnknownStops;
    }

    /**
     * Define o valor da propriedade numberOfUnknownStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfUnknownStops(Integer value) {
        this.numberOfUnknownStops = value;
    }

    /**
     * Obtém o valor da propriedade optimizationSuggestions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteOptimizationSuggestion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteOptimizationSuggestion> getOptimizationSuggestions() {
        return optimizationSuggestions;
    }

    /**
     * Define o valor da propriedade optimizationSuggestions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteOptimizationSuggestion }{@code >}
     *     
     */
    public void setOptimizationSuggestions(JAXBElement<ArrayOfRouteOptimizationSuggestion> value) {
        this.optimizationSuggestions = value;
    }

    /**
     * Obtém o valor da propriedade originDepotCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getOriginDepotCoordinate() {
        return originDepotCoordinate;
    }

    /**
     * Define o valor da propriedade originDepotCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setOriginDepotCoordinate(JAXBElement<Coordinate> value) {
        this.originDepotCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade originDepotDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginDepotDescription() {
        return originDepotDescription;
    }

    /**
     * Define o valor da propriedade originDepotDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginDepotDescription(JAXBElement<String> value) {
        this.originDepotDescription = value;
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
     * Obtém o valor da propriedade originDepotIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginDepotIdentifier() {
        return originDepotIdentifier;
    }

    /**
     * Define o valor da propriedade originDepotIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginDepotIdentifier(JAXBElement<String> value) {
        this.originDepotIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade originEngineIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getOriginEngineIdleTime() {
        return originEngineIdleTime;
    }

    /**
     * Define o valor da propriedade originEngineIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setOriginEngineIdleTime(JAXBElement<Duration> value) {
        this.originEngineIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade originEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getOriginEngineRunTime() {
        return originEngineRunTime;
    }

    /**
     * Define o valor da propriedade originEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setOriginEngineRunTime(JAXBElement<Duration> value) {
        this.originEngineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade originFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getOriginFuelUsed() {
        return originFuelUsed;
    }

    /**
     * Define o valor da propriedade originFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setOriginFuelUsed(JAXBElement<LiquidVolume> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassDescription() {
        return passDescription;
    }

    /**
     * Define o valor da propriedade passDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassDescription(JAXBElement<String> value) {
        this.passDescription = value;
    }

    /**
     * Obtém o valor da propriedade passEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassEntityKey() {
        return passEntityKey;
    }

    /**
     * Define o valor da propriedade passEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassEntityKey(Long value) {
        this.passEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade passIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassIdentifier() {
        return passIdentifier;
    }

    /**
     * Define o valor da propriedade passIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassIdentifier(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedArrivalTime() {
        return plannedArrivalTime;
    }

    /**
     * Define o valor da propriedade plannedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedArrivalTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedBusinessOptimalCosts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteCosts }{@code >}
     *     
     */
    public JAXBElement<RouteCosts> getPlannedBusinessOptimalCosts() {
        return plannedBusinessOptimalCosts;
    }

    /**
     * Define o valor da propriedade plannedBusinessOptimalCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteCosts }{@code >}
     *     
     */
    public void setPlannedBusinessOptimalCosts(JAXBElement<RouteCosts> value) {
        this.plannedBusinessOptimalCosts = value;
    }

    /**
     * Obtém o valor da propriedade plannedCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedCompleteTime() {
        return plannedCompleteTime;
    }

    /**
     * Define o valor da propriedade plannedCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedCompleteTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedCompleteTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedCosts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteCosts }{@code >}
     *     
     */
    public JAXBElement<RouteCosts> getPlannedCosts() {
        return plannedCosts;
    }

    /**
     * Define o valor da propriedade plannedCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteCosts }{@code >}
     *     
     */
    public void setPlannedCosts(JAXBElement<RouteCosts> value) {
        this.plannedCosts = value;
    }

    /**
     * Obtém o valor da propriedade plannedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedDepartureTime() {
        return plannedDepartureTime;
    }

    /**
     * Define o valor da propriedade plannedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedDepartureTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedDistanceToDestination.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getPlannedDistanceToDestination() {
        return plannedDistanceToDestination;
    }

    /**
     * Define o valor da propriedade plannedDistanceToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setPlannedDistanceToDestination(JAXBElement<Distance> value) {
        this.plannedDistanceToDestination = value;
    }

    /**
     * Obtém o valor da propriedade plannedMaxRunningQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedMaxRunningQuantity() {
        return plannedMaxRunningQuantity;
    }

    /**
     * Define o valor da propriedade plannedMaxRunningQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedMaxRunningQuantity(JAXBElement<Quantities> value) {
        this.plannedMaxRunningQuantity = value;
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
     * Obtém o valor da propriedade plannedNumberOfLayoverStops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedNumberOfLayoverStops() {
        return plannedNumberOfLayoverStops;
    }

    /**
     * Define o valor da propriedade plannedNumberOfLayoverStops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedNumberOfLayoverStops(JAXBElement<Integer> value) {
        this.plannedNumberOfLayoverStops = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMidRouteDepotStops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedNumberOfMidRouteDepotStops() {
        return plannedNumberOfMidRouteDepotStops;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMidRouteDepotStops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedNumberOfMidRouteDepotStops(JAXBElement<Integer> value) {
        this.plannedNumberOfMidRouteDepotStops = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMissedOpenCloseEarly.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedNumberOfMissedOpenCloseEarly() {
        return plannedNumberOfMissedOpenCloseEarly;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMissedOpenCloseEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedNumberOfMissedOpenCloseEarly(JAXBElement<Integer> value) {
        this.plannedNumberOfMissedOpenCloseEarly = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMissedOpenCloseLate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedNumberOfMissedOpenCloseLate() {
        return plannedNumberOfMissedOpenCloseLate;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMissedOpenCloseLate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedNumberOfMissedOpenCloseLate(JAXBElement<Integer> value) {
        this.plannedNumberOfMissedOpenCloseLate = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMissedServiceWindows.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedNumberOfMissedServiceWindows() {
        return plannedNumberOfMissedServiceWindows;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMissedServiceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedNumberOfMissedServiceWindows(JAXBElement<Integer> value) {
        this.plannedNumberOfMissedServiceWindows = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMissedServiceWindowsEarly.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedNumberOfMissedServiceWindowsEarly() {
        return plannedNumberOfMissedServiceWindowsEarly;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMissedServiceWindowsEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedNumberOfMissedServiceWindowsEarly(JAXBElement<Integer> value) {
        this.plannedNumberOfMissedServiceWindowsEarly = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfMissedServiceWindowsLate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedNumberOfMissedServiceWindowsLate() {
        return plannedNumberOfMissedServiceWindowsLate;
    }

    /**
     * Define o valor da propriedade plannedNumberOfMissedServiceWindowsLate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedNumberOfMissedServiceWindowsLate(JAXBElement<Integer> value) {
        this.plannedNumberOfMissedServiceWindowsLate = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfNonServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedNumberOfNonServiceableStops() {
        return plannedNumberOfNonServiceableStops;
    }

    /**
     * Define o valor da propriedade plannedNumberOfNonServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedNumberOfNonServiceableStops(JAXBElement<Integer> value) {
        this.plannedNumberOfNonServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedNumberOfServiceableStops() {
        return plannedNumberOfServiceableStops;
    }

    /**
     * Define o valor da propriedade plannedNumberOfServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedNumberOfServiceableStops(JAXBElement<Integer> value) {
        this.plannedNumberOfServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade plannedPostRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedPostRouteTime() {
        return plannedPostRouteTime;
    }

    /**
     * Define o valor da propriedade plannedPostRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedPostRouteTime(JAXBElement<Duration> value) {
        this.plannedPostRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedPreRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedPreRouteTime() {
        return plannedPreRouteTime;
    }

    /**
     * Define o valor da propriedade plannedPreRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedPreRouteTime(JAXBElement<Duration> value) {
        this.plannedPreRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedRunningQuantityAfterOrigin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedRunningQuantityAfterOrigin() {
        return plannedRunningQuantityAfterOrigin;
    }

    /**
     * Define o valor da propriedade plannedRunningQuantityAfterOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedRunningQuantityAfterOrigin(JAXBElement<Quantities> value) {
        this.plannedRunningQuantityAfterOrigin = value;
    }

    /**
     * Obtém o valor da propriedade plannedStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedStartTime() {
        return plannedStartTime;
    }

    /**
     * Define o valor da propriedade plannedStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedStartTime = value;
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
     * Obtém o valor da propriedade plannedTravelTimeToDestination.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedTravelTimeToDestination() {
        return plannedTravelTimeToDestination;
    }

    /**
     * Define o valor da propriedade plannedTravelTimeToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedTravelTimeToDestination(JAXBElement<Duration> value) {
        this.plannedTravelTimeToDestination = value;
    }

    /**
     * Obtém o valor da propriedade plannedTrueOptimalCosts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteCosts }{@code >}
     *     
     */
    public JAXBElement<RouteCosts> getPlannedTrueOptimalCosts() {
        return plannedTrueOptimalCosts;
    }

    /**
     * Define o valor da propriedade plannedTrueOptimalCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteCosts }{@code >}
     *     
     */
    public void setPlannedTrueOptimalCosts(JAXBElement<RouteCosts> value) {
        this.plannedTrueOptimalCosts = value;
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
     * Obtém o valor da propriedade postStartDelay.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPostStartDelay() {
        return postStartDelay;
    }

    /**
     * Define o valor da propriedade postStartDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPostStartDelay(JAXBElement<Duration> value) {
        this.postStartDelay = value;
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
     * Obtém o valor da propriedade preStartDelay.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPreStartDelay() {
        return preStartDelay;
    }

    /**
     * Define o valor da propriedade preStartDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPreStartDelay(JAXBElement<Duration> value) {
        this.preStartDelay = value;
    }

    /**
     * Obtém o valor da propriedade preferredRuntime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreferredRuntime() {
        return preferredRuntime;
    }

    /**
     * Define o valor da propriedade preferredRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreferredRuntime(Duration value) {
        this.preferredRuntime = value;
    }

    /**
     * Obtém o valor da propriedade profit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getProfit() {
        return profit;
    }

    /**
     * Define o valor da propriedade profit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setProfit(JAXBElement<Double> value) {
        this.profit = value;
    }

    /**
     * Obtém o valor da propriedade projectedNumberOfMissedServiceWindows.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectedNumberOfMissedServiceWindows() {
        return projectedNumberOfMissedServiceWindows;
    }

    /**
     * Define o valor da propriedade projectedNumberOfMissedServiceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectedNumberOfMissedServiceWindows(Integer value) {
        this.projectedNumberOfMissedServiceWindows = value;
    }

    /**
     * Obtém o valor da propriedade projectedNumberOfMissedServiceWindowsEarly.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectedNumberOfMissedServiceWindowsEarly() {
        return projectedNumberOfMissedServiceWindowsEarly;
    }

    /**
     * Define o valor da propriedade projectedNumberOfMissedServiceWindowsEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectedNumberOfMissedServiceWindowsEarly(Integer value) {
        this.projectedNumberOfMissedServiceWindowsEarly = value;
    }

    /**
     * Obtém o valor da propriedade projectedNumberOfMissedServiceWindowsLate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectedNumberOfMissedServiceWindowsLate() {
        return projectedNumberOfMissedServiceWindowsLate;
    }

    /**
     * Define o valor da propriedade projectedNumberOfMissedServiceWindowsLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectedNumberOfMissedServiceWindowsLate(Integer value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionDescription() {
        return regionDescription;
    }

    /**
     * Define o valor da propriedade regionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionDescription(JAXBElement<String> value) {
        this.regionDescription = value;
    }

    /**
     * Obtém o valor da propriedade regionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionIdentifier() {
        return regionIdentifier;
    }

    /**
     * Define o valor da propriedade regionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionIdentifier(JAXBElement<String> value) {
        this.regionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade resourceEventsEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getResourceEventsEntityKey() {
        return resourceEventsEntityKey;
    }

    /**
     * Define o valor da propriedade resourceEventsEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setResourceEventsEntityKey(JAXBElement<Long> value) {
        this.resourceEventsEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeAlertFlagsAlerts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteAlertFlagsAlerts() {
        return routeAlertFlagsAlerts;
    }

    /**
     * Define o valor da propriedade routeAlertFlagsAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteAlertFlagsAlerts(JAXBElement<String> value) {
        this.routeAlertFlagsAlerts = value;
    }

    /**
     * Obtém o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchAssignOrdersState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteAutonomousDispatchStateAutonomousDispatchAssignOrdersState() {
        return routeAutonomousDispatchStateAutonomousDispatchAssignOrdersState;
    }

    /**
     * Define o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchAssignOrdersState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteAutonomousDispatchStateAutonomousDispatchAssignOrdersState(JAXBElement<String> value) {
        this.routeAutonomousDispatchStateAutonomousDispatchAssignOrdersState = value;
    }

    /**
     * Obtém o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchResequenceState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteAutonomousDispatchStateAutonomousDispatchResequenceState() {
        return routeAutonomousDispatchStateAutonomousDispatchResequenceState;
    }

    /**
     * Define o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchResequenceState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteAutonomousDispatchStateAutonomousDispatchResequenceState(JAXBElement<String> value) {
        this.routeAutonomousDispatchStateAutonomousDispatchResequenceState = value;
    }

    /**
     * Obtém o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteAutonomousDispatchStateAutonomousDispatchState() {
        return routeAutonomousDispatchStateAutonomousDispatchState;
    }

    /**
     * Define o valor da propriedade routeAutonomousDispatchStateAutonomousDispatchState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteAutonomousDispatchStateAutonomousDispatchState(JAXBElement<String> value) {
        this.routeAutonomousDispatchStateAutonomousDispatchState = value;
    }

    /**
     * Obtém o valor da propriedade routeConstraintFlagsBrokenConstraints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteConstraintFlagsBrokenConstraints() {
        return routeConstraintFlagsBrokenConstraints;
    }

    /**
     * Define o valor da propriedade routeConstraintFlagsBrokenConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteConstraintFlagsBrokenConstraints(JAXBElement<String> value) {
        this.routeConstraintFlagsBrokenConstraints = value;
    }

    /**
     * Obtém o valor da propriedade routeCreationMethodCreationMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteCreationMethodCreationMethod() {
        return routeCreationMethodCreationMethod;
    }

    /**
     * Define o valor da propriedade routeCreationMethodCreationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteCreationMethodCreationMethod(JAXBElement<String> value) {
        this.routeCreationMethodCreationMethod = value;
    }

    /**
     * Obtém o valor da propriedade routePhasePhase.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutePhasePhase() {
        return routePhasePhase;
    }

    /**
     * Define o valor da propriedade routePhasePhase.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutePhasePhase(JAXBElement<String> value) {
        this.routePhasePhase = value;
    }

    /**
     * Obtém o valor da propriedade routeStateState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteStateState() {
        return routeStateState;
    }

    /**
     * Define o valor da propriedade routeStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteStateState(JAXBElement<String> value) {
        this.routeStateState = value;
    }

    /**
     * Obtém o valor da propriedade routeStatusStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteStatusStatus() {
        return routeStatusStatus;
    }

    /**
     * Define o valor da propriedade routeStatusStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteStatusStatus(JAXBElement<String> value) {
        this.routeStatusStatus = value;
    }

    /**
     * Obtém o valor da propriedade routeTenderStateTenderState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteTenderStateTenderState() {
        return routeTenderStateTenderState;
    }

    /**
     * Define o valor da propriedade routeTenderStateTenderState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteTenderStateTenderState(JAXBElement<String> value) {
        this.routeTenderStateTenderState = value;
    }

    /**
     * Obtém o valor da propriedade routeTenders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteTender }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteTender> getRouteTenders() {
        return routeTenders;
    }

    /**
     * Define o valor da propriedade routeTenders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteTender }{@code >}
     *     
     */
    public void setRouteTenders(JAXBElement<ArrayOfRouteTender> value) {
        this.routeTenders = value;
    }

    /**
     * Obtém o valor da propriedade routerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRouterEntityKey() {
        return routerEntityKey;
    }

    /**
     * Define o valor da propriedade routerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRouterEntityKey(Long value) {
        this.routerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routerName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getRouterName() {
        return routerName;
    }

    /**
     * Define o valor da propriedade routerName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setRouterName(JAXBElement<PersonName> value) {
        this.routerName = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRoutingSessionDate() {
        return routingSessionDate;
    }

    /**
     * Define o valor da propriedade routingSessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRoutingSessionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.routingSessionDate = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRoutingSessionDepotEntityKey() {
        return routingSessionDepotEntityKey;
    }

    /**
     * Define o valor da propriedade routingSessionDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRoutingSessionDepotEntityKey(JAXBElement<Long> value) {
        this.routingSessionDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutingSessionDescription() {
        return routingSessionDescription;
    }

    /**
     * Define o valor da propriedade routingSessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutingSessionDescription(JAXBElement<String> value) {
        this.routingSessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoutingSessionEntityKey() {
        return routingSessionEntityKey;
    }

    /**
     * Define o valor da propriedade routingSessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoutingSessionEntityKey(Long value) {
        this.routingSessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade runningQuantityAfterOrigin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getRunningQuantityAfterOrigin() {
        return runningQuantityAfterOrigin;
    }

    /**
     * Define o valor da propriedade runningQuantityAfterOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setRunningQuantityAfterOrigin(JAXBElement<Quantities> value) {
        this.runningQuantityAfterOrigin = value;
    }

    /**
     * Obtém o valor da propriedade sessionModeRoutingSessionMode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionModeRoutingSessionMode() {
        return sessionModeRoutingSessionMode;
    }

    /**
     * Define o valor da propriedade sessionModeRoutingSessionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionModeRoutingSessionMode(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<QualityPairedDateTime> value) {
        this.startTime = value;
    }

    /**
     * Obtém o valor da propriedade startTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStartTimeDifference() {
        return startTimeDifference;
    }

    /**
     * Define o valor da propriedade startTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStartTimeDifference(Duration value) {
        this.startTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade startTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartTimePercentageDifference() {
        return startTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade startTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartTimePercentageDifference(Double value) {
        this.startTimePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade stops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStop }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStop> getStops() {
        return stops;
    }

    /**
     * Define o valor da propriedade stops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStop }{@code >}
     *     
     */
    public void setStops(JAXBElement<ArrayOfStop> value) {
        this.stops = value;
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
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTelematicsDeviceEntityKey() {
        return telematicsDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTelematicsDeviceEntityKey(JAXBElement<Long> value) {
        this.telematicsDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelematicsDeviceIdentifier() {
        return telematicsDeviceIdentifier;
    }

    /**
     * Define o valor da propriedade telematicsDeviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelematicsDeviceIdentifier(JAXBElement<String> value) {
        this.telematicsDeviceIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade territoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTerritoryEntityKey() {
        return territoryEntityKey;
    }

    /**
     * Define o valor da propriedade territoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTerritoryEntityKey(JAXBElement<Long> value) {
        this.territoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade totalBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalBreakTime() {
        return totalBreakTime;
    }

    /**
     * Define o valor da propriedade totalBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalBreakTime(Duration value) {
        this.totalBreakTime = value;
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
     * Obtém o valor da propriedade totalDepotServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalDepotServiceTime() {
        return totalDepotServiceTime;
    }

    /**
     * Define o valor da propriedade totalDepotServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalDepotServiceTime(Duration value) {
        this.totalDepotServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalDestinationDepotFee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalDestinationDepotFee() {
        return totalDestinationDepotFee;
    }

    /**
     * Define o valor da propriedade totalDestinationDepotFee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalDestinationDepotFee(JAXBElement<Double> value) {
        this.totalDestinationDepotFee = value;
    }

    /**
     * Obtém o valor da propriedade totalDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getTotalDistance() {
        return totalDistance;
    }

    /**
     * Define o valor da propriedade totalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setTotalDistance(JAXBElement<Distance> value) {
        this.totalDistance = value;
    }

    /**
     * Obtém o valor da propriedade totalDistanceDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getTotalDistanceDifference() {
        return totalDistanceDifference;
    }

    /**
     * Define o valor da propriedade totalDistanceDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setTotalDistanceDifference(JAXBElement<Distance> value) {
        this.totalDistanceDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalDistancePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalDistancePercentageDifference() {
        return totalDistancePercentageDifference;
    }

    /**
     * Define o valor da propriedade totalDistancePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalDistancePercentageDifference(Double value) {
        this.totalDistancePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade totalEngineIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalEngineIdleTime() {
        return totalEngineIdleTime;
    }

    /**
     * Define o valor da propriedade totalEngineIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalEngineIdleTime(JAXBElement<Duration> value) {
        this.totalEngineIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade totalEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalEngineRunTime() {
        return totalEngineRunTime;
    }

    /**
     * Define o valor da propriedade totalEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalEngineRunTime(JAXBElement<Duration> value) {
        this.totalEngineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade totalFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFee() {
        return totalFee;
    }

    /**
     * Define o valor da propriedade totalFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFee(Double value) {
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
     * Obtém o valor da propriedade totalFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getTotalFuelUsed() {
        return totalFuelUsed;
    }

    /**
     * Define o valor da propriedade totalFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setTotalFuelUsed(JAXBElement<LiquidVolume> value) {
        this.totalFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade totalLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalLayoverTime() {
        return totalLayoverTime;
    }

    /**
     * Define o valor da propriedade totalLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalLayoverTime(Duration value) {
        this.totalLayoverTime = value;
    }

    /**
     * Obtém o valor da propriedade totalNumberOfExceptions.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfExceptions() {
        return totalNumberOfExceptions;
    }

    /**
     * Define o valor da propriedade totalNumberOfExceptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfExceptions(Integer value) {
        this.totalNumberOfExceptions = value;
    }

    /**
     * Obtém o valor da propriedade totalOriginDepotFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalOriginDepotFee() {
        return totalOriginDepotFee;
    }

    /**
     * Define o valor da propriedade totalOriginDepotFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalOriginDepotFee(Double value) {
        this.totalOriginDepotFee = value;
    }

    /**
     * Obtém o valor da propriedade totalPaidBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalPaidBreakTime() {
        return totalPaidBreakTime;
    }

    /**
     * Define o valor da propriedade totalPaidBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalPaidBreakTime(Duration value) {
        this.totalPaidBreakTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPaidLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalPaidLayoverTime() {
        return totalPaidLayoverTime;
    }

    /**
     * Define o valor da propriedade totalPaidLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalPaidLayoverTime(Duration value) {
        this.totalPaidLayoverTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPaidTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalPaidTime() {
        return totalPaidTime;
    }

    /**
     * Define o valor da propriedade totalPaidTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalPaidTime(Duration value) {
        this.totalPaidTime = value;
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
     * Obtém o valor da propriedade totalPlannedBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedBreakTime() {
        return totalPlannedBreakTime;
    }

    /**
     * Define o valor da propriedade totalPlannedBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedBreakTime(JAXBElement<Duration> value) {
        this.totalPlannedBreakTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedBusinessOptimalDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getTotalPlannedBusinessOptimalDistance() {
        return totalPlannedBusinessOptimalDistance;
    }

    /**
     * Define o valor da propriedade totalPlannedBusinessOptimalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setTotalPlannedBusinessOptimalDistance(JAXBElement<Distance> value) {
        this.totalPlannedBusinessOptimalDistance = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedBusinessOptimalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedBusinessOptimalTime() {
        return totalPlannedBusinessOptimalTime;
    }

    /**
     * Define o valor da propriedade totalPlannedBusinessOptimalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedBusinessOptimalTime(JAXBElement<Duration> value) {
        this.totalPlannedBusinessOptimalTime = value;
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
     * Obtém o valor da propriedade totalPlannedDepotServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedDepotServiceTime() {
        return totalPlannedDepotServiceTime;
    }

    /**
     * Define o valor da propriedade totalPlannedDepotServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedDepotServiceTime(JAXBElement<Duration> value) {
        this.totalPlannedDepotServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedDestinationDepotFee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalPlannedDestinationDepotFee() {
        return totalPlannedDestinationDepotFee;
    }

    /**
     * Define o valor da propriedade totalPlannedDestinationDepotFee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalPlannedDestinationDepotFee(JAXBElement<Double> value) {
        this.totalPlannedDestinationDepotFee = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getTotalPlannedDistance() {
        return totalPlannedDistance;
    }

    /**
     * Define o valor da propriedade totalPlannedDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setTotalPlannedDistance(JAXBElement<Distance> value) {
        this.totalPlannedDistance = value;
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
     * Obtém o valor da propriedade totalPlannedLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedLayoverTime() {
        return totalPlannedLayoverTime;
    }

    /**
     * Define o valor da propriedade totalPlannedLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedLayoverTime(JAXBElement<Duration> value) {
        this.totalPlannedLayoverTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedOriginDepotFee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalPlannedOriginDepotFee() {
        return totalPlannedOriginDepotFee;
    }

    /**
     * Define o valor da propriedade totalPlannedOriginDepotFee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalPlannedOriginDepotFee(JAXBElement<Double> value) {
        this.totalPlannedOriginDepotFee = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedPaidBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedPaidBreakTime() {
        return totalPlannedPaidBreakTime;
    }

    /**
     * Define o valor da propriedade totalPlannedPaidBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedPaidBreakTime(JAXBElement<Duration> value) {
        this.totalPlannedPaidBreakTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedPaidLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedPaidLayoverTime() {
        return totalPlannedPaidLayoverTime;
    }

    /**
     * Define o valor da propriedade totalPlannedPaidLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedPaidLayoverTime(JAXBElement<Duration> value) {
        this.totalPlannedPaidLayoverTime = value;
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
     * Obtém o valor da propriedade totalPlannedTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedTime() {
        return totalPlannedTime;
    }

    /**
     * Define o valor da propriedade totalPlannedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedTime(JAXBElement<Duration> value) {
        this.totalPlannedTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedTravelTime() {
        return totalPlannedTravelTime;
    }

    /**
     * Define o valor da propriedade totalPlannedTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedTravelTime(JAXBElement<Duration> value) {
        this.totalPlannedTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedTrueOptimalDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getTotalPlannedTrueOptimalDistance() {
        return totalPlannedTrueOptimalDistance;
    }

    /**
     * Define o valor da propriedade totalPlannedTrueOptimalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setTotalPlannedTrueOptimalDistance(JAXBElement<Distance> value) {
        this.totalPlannedTrueOptimalDistance = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedTrueOptimalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedTrueOptimalTime() {
        return totalPlannedTrueOptimalTime;
    }

    /**
     * Define o valor da propriedade totalPlannedTrueOptimalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedTrueOptimalTime(JAXBElement<Duration> value) {
        this.totalPlannedTrueOptimalTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedUnpaidBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedUnpaidBreakTime() {
        return totalPlannedUnpaidBreakTime;
    }

    /**
     * Define o valor da propriedade totalPlannedUnpaidBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedUnpaidBreakTime(JAXBElement<Duration> value) {
        this.totalPlannedUnpaidBreakTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedUnpaidLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedUnpaidLayoverTime() {
        return totalPlannedUnpaidLayoverTime;
    }

    /**
     * Define o valor da propriedade totalPlannedUnpaidLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedUnpaidLayoverTime(JAXBElement<Duration> value) {
        this.totalPlannedUnpaidLayoverTime = value;
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
     * Obtém o valor da propriedade totalPlannedWaitTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedWaitTime() {
        return totalPlannedWaitTime;
    }

    /**
     * Define o valor da propriedade totalPlannedWaitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedWaitTime(JAXBElement<Duration> value) {
        this.totalPlannedWaitTime = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalServiceTime() {
        return totalServiceTime;
    }

    /**
     * Define o valor da propriedade totalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalServiceTime(Duration value) {
        this.totalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalStopDelayTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalStopDelayTime() {
        return totalStopDelayTime;
    }

    /**
     * Define o valor da propriedade totalStopDelayTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalStopDelayTime(JAXBElement<Duration> value) {
        this.totalStopDelayTime = value;
    }

    /**
     * Obtém o valor da propriedade totalStopEngineIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalStopEngineIdleTime() {
        return totalStopEngineIdleTime;
    }

    /**
     * Define o valor da propriedade totalStopEngineIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalStopEngineIdleTime(JAXBElement<Duration> value) {
        this.totalStopEngineIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade totalTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalTime() {
        return totalTime;
    }

    /**
     * Define o valor da propriedade totalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalTime(Duration value) {
        this.totalTime = value;
    }

    /**
     * Obtém o valor da propriedade totalTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalTravelTime() {
        return totalTravelTime;
    }

    /**
     * Define o valor da propriedade totalTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalTravelTime(Duration value) {
        this.totalTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade totalUnpaidBreakTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalUnpaidBreakTime() {
        return totalUnpaidBreakTime;
    }

    /**
     * Define o valor da propriedade totalUnpaidBreakTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalUnpaidBreakTime(Duration value) {
        this.totalUnpaidBreakTime = value;
    }

    /**
     * Obtém o valor da propriedade totalUnpaidLayoverTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalUnpaidLayoverTime() {
        return totalUnpaidLayoverTime;
    }

    /**
     * Define o valor da propriedade totalUnpaidLayoverTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalUnpaidLayoverTime(Duration value) {
        this.totalUnpaidLayoverTime = value;
    }

    /**
     * Obtém o valor da propriedade totalUnpaidTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalUnpaidTime() {
        return totalUnpaidTime;
    }

    /**
     * Define o valor da propriedade totalUnpaidTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalUnpaidTime(Duration value) {
        this.totalUnpaidTime = value;
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
     * Obtém o valor da propriedade totalWaitTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalWaitTime() {
        return totalWaitTime;
    }

    /**
     * Define o valor da propriedade totalWaitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalWaitTime(Duration value) {
        this.totalWaitTime = value;
    }

    /**
     * Obtém o valor da propriedade travelPathChangedVersion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTravelPathChangedVersion() {
        return travelPathChangedVersion;
    }

    /**
     * Define o valor da propriedade travelPathChangedVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTravelPathChangedVersion(Long value) {
        this.travelPathChangedVersion = value;
    }

    /**
     * Obtém o valor da propriedade travelTimeToDestination.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTravelTimeToDestination() {
        return travelTimeToDestination;
    }

    /**
     * Define o valor da propriedade travelTimeToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTravelTimeToDestination(Duration value) {
        this.travelTimeToDestination = value;
    }

    /**
     * Obtém o valor da propriedade workers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteWorker }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteWorker> getWorkers() {
        return workers;
    }

    /**
     * Define o valor da propriedade workers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteWorker }{@code >}
     *     
     */
    public void setWorkers(JAXBElement<ArrayOfRouteWorker> value) {
        this.workers = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneDestinationDepotTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneDestinationDepotTimeZone() {
        return worldTimeZoneDestinationDepotTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneDestinationDepotTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneDestinationDepotTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneDestinationDepotTimeZone = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneOriginDepotTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneOriginDepotTimeZone() {
        return worldTimeZoneOriginDepotTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneOriginDepotTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneOriginDepotTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneOriginDepotTimeZone = value;
    }

}
