
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.MobileDeviceSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.MobileDeviceSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccumulateDistanceOnlyWhileInTransit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowStopEtaDisplay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowTextMessagesWhileDriving" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowTrackingWorkerToAddStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToAddBreaks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToAddDelays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToAddFreeformReasonCodes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToAddLineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToAddOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToAddOrdersAndLineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToAddPictures" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToAddServiceableStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToArriveAndWait" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToAssignEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToAssociateUnknownStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToCallLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToCancelOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToCancelStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToCheckUncheckDeliveryGroups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToCreateGroupStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToDropHookTrailer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToEditDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToGeocodeLocations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToLoadRouteWithEquipmentInUse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToManuallyCheckOffQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToNavigate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToRedeliverStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToResequenceStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToReverseChainedStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToSelectRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToSkipSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToSuspendRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToSuspendStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToTransferStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToUndeliverStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowWorkerToViewLocationComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlwaysRedeliverUndeliveredStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoFixupDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoLogOffWorkerOnRouteCompletion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoNavigateOnPrimaryDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoNavigateOnSecondaryDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceAllowAutomaticSoftwareUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAgreement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultWorkerAddedCommentsToInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryImageRequiredWhenSignatureSkipped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DesignateUnplannedBreaksAsPaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisableAppDriveSpeedTrigger" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DisableAppWhileDriving" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisableGpsTrackingDuringBreaksAndLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayCancelReasonCodeConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayGroupCheckOffConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayOrderAndLineItemDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayQuantityReasonCodesOnSignatureScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayRouteDetailsOnStopList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DoubleScanAlertEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DriverStatsMetric_DriverStatsMetric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmptyOrdersRequireAction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableEndOfServiceForStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableGroupStopSignatures" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableNavTriggeredAutoArrive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOSDQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOrderSignatures" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnablePreDeliveryScan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableQuantitiesOnDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableRatioMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableRoutePreview" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableRouteSync" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableRouteTendering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableScanOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableScanOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HideQuantitySize1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HideQuantitySize2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HideQuantitySize3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreQuantityValidationIfZeroPlanned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InMotionSpeedThreshold" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="InMotionTriggersNavigateToNextStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLineItemCustomProperty1VisibleOnVerifyOrderScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLineItemCustomProperty2VisibleOnVerifyOrderScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLineItemCustomProperty3VisibleOnVerifyOrderScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOrderCustomProperty1VisibleOnVerifyOrderScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOrderCustomProperty2VisibleOnVerifyOrderScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOrderCustomProperty3VisibleOnVerifyOrderScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsQuickAddOrderAndLineItemEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRouteCustomProperty1VisibleOnLoadRouteScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRouteSharingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperty1EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperty2EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperty3EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperty4EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperty5EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperty6EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty1EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty2EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty3EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty4EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty5EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty6EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MaximumPercentAbovePlannedSize1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaximumPercentAbovePlannedSize2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaximumPercentAbovePlannedSize3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaximumQuantitySize1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaximumQuantitySize2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaximumQuantitySize3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MobileComplianceCachedLoginTimeLimit_ComplianceCachedLoginTimeLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileCompliancePaperLogModeActivationTime_CompliancePaperLogModeActivationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileComplianceReenableBTWaitTime_ComplianceReenableBTWaitTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileLoggingLevel_LoggingLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileScanningOption_ScanningOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewSignatureRequiredForQuantityChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty1EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty2EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty3EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty4EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty5EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty6EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PollRate" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreDeliveryScanRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantityType_ReasonCodeRequiredQuantityTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequireUpdateEquipmentBeforeDepartingRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictTrailerDropHookToServiceableStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAlias_RouteAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty1EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty2EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty3EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty4EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty5EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty6EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ScanOffRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScanOnRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SendGPSByDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="SendGPSByTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationSearchRadius" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="ShowBreakType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowConfirmationBoxes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowConsigneeHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowPlannedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowPlannedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowPlannedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowPlannedTimesOnPreview" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SignatureCaptureRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Tracing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ValidateQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VerifyByException" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerSelectRouteExcludeRoutesAssignedToOtherWorkers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerSelectRouteExcludeUnassignedRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerSelectRouteFromFutureDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WorkerSelectRouteIncludeRoutesAssignedToWorkersEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.MobileDeviceSettings", propOrder = {
    "accumulateDistanceOnlyWhileInTransit",
    "allowStopEtaDisplay",
    "allowTextMessagesWhileDriving",
    "allowTrackingWorkerToAddStops",
    "allowWorkerToAddBreaks",
    "allowWorkerToAddDelays",
    "allowWorkerToAddFreeformReasonCodes",
    "allowWorkerToAddLineItems",
    "allowWorkerToAddOrders",
    "allowWorkerToAddOrdersAndLineItems",
    "allowWorkerToAddPictures",
    "allowWorkerToAddServiceableStops",
    "allowWorkerToArriveAndWait",
    "allowWorkerToAssignEquipment",
    "allowWorkerToAssociateUnknownStops",
    "allowWorkerToCallLocation",
    "allowWorkerToCancelOrders",
    "allowWorkerToCancelStops",
    "allowWorkerToCheckUncheckDeliveryGroups",
    "allowWorkerToCreateGroupStops",
    "allowWorkerToDropHookTrailer",
    "allowWorkerToEditDetails",
    "allowWorkerToGeocodeLocations",
    "allowWorkerToLoadRouteWithEquipmentInUse",
    "allowWorkerToManuallyCheckOffQuantities",
    "allowWorkerToNavigate",
    "allowWorkerToRedeliverStops",
    "allowWorkerToResequenceStops",
    "allowWorkerToReverseChainedStops",
    "allowWorkerToSelectRoute",
    "allowWorkerToSkipSignature",
    "allowWorkerToSuspendRoute",
    "allowWorkerToSuspendStops",
    "allowWorkerToTransferStops",
    "allowWorkerToUndeliverStops",
    "allowWorkerToViewLocationComments",
    "alwaysRedeliverUndeliveredStops",
    "autoFixupDetails",
    "autoLogOffWorkerOnRouteCompletion",
    "autoNavigateOnPrimaryDevice",
    "autoNavigateOnSecondaryDevice",
    "complianceAllowAutomaticSoftwareUpdate",
    "consigneeRequired",
    "customerAgreement",
    "defaultWorkerAddedCommentsToInactive",
    "deliveryImageRequiredWhenSignatureSkipped",
    "designateUnplannedBreaksAsPaid",
    "disableAppDriveSpeedTrigger",
    "disableAppWhileDriving",
    "disableGpsTrackingDuringBreaksAndLayovers",
    "displayCancelReasonCodeConfirmation",
    "displayGroupCheckOffConfirmation",
    "displayOrderAndLineItemDetails",
    "displayQuantityReasonCodesOnSignatureScreen",
    "displayRouteDetailsOnStopList",
    "doubleScanAlertEnabled",
    "driverStatsMetricDriverStatsMetric",
    "emptyOrdersRequireAction",
    "enableEndOfServiceForStops",
    "enableGroupStopSignatures",
    "enableNavTriggeredAutoArrive",
    "enableOSDQuantities",
    "enableOrderSignatures",
    "enablePreDeliveryScan",
    "enableQuantitiesOnDevice",
    "enableRatioMode",
    "enableRoutePreview",
    "enableRouteSync",
    "enableRouteTendering",
    "enableScanOff",
    "enableScanOn",
    "hideQuantitySize1",
    "hideQuantitySize2",
    "hideQuantitySize3",
    "ignoreQuantityValidationIfZeroPlanned",
    "inMotionSpeedThreshold",
    "inMotionTriggersNavigateToNextStop",
    "isLineItemCustomProperty1VisibleOnVerifyOrderScreen",
    "isLineItemCustomProperty2VisibleOnVerifyOrderScreen",
    "isLineItemCustomProperty3VisibleOnVerifyOrderScreen",
    "isOrderCustomProperty1VisibleOnVerifyOrderScreen",
    "isOrderCustomProperty2VisibleOnVerifyOrderScreen",
    "isOrderCustomProperty3VisibleOnVerifyOrderScreen",
    "isQuickAddOrderAndLineItemEnabled",
    "isRouteCustomProperty1VisibleOnLoadRouteScreen",
    "isRouteSharingEnabled",
    "lineItemCustomProperty1EntityKey",
    "lineItemCustomProperty2EntityKey",
    "lineItemCustomProperty3EntityKey",
    "lineItemCustomProperty4EntityKey",
    "lineItemCustomProperty5EntityKey",
    "lineItemCustomProperty6EntityKey",
    "locationCustomProperty1EntityKey",
    "locationCustomProperty2EntityKey",
    "locationCustomProperty3EntityKey",
    "locationCustomProperty4EntityKey",
    "locationCustomProperty5EntityKey",
    "locationCustomProperty6EntityKey",
    "maximumPercentAbovePlannedSize1",
    "maximumPercentAbovePlannedSize2",
    "maximumPercentAbovePlannedSize3",
    "maximumQuantitySize1",
    "maximumQuantitySize2",
    "maximumQuantitySize3",
    "mobileComplianceCachedLoginTimeLimitComplianceCachedLoginTimeLimit",
    "mobileCompliancePaperLogModeActivationTimeCompliancePaperLogModeActivationTime",
    "mobileComplianceReenableBTWaitTimeComplianceReenableBTWaitTime",
    "mobileLoggingLevelLoggingLevel",
    "mobileScanningOptionScanningOption",
    "newSignatureRequiredForQuantityChanges",
    "orderCustomProperty1EntityKey",
    "orderCustomProperty2EntityKey",
    "orderCustomProperty3EntityKey",
    "orderCustomProperty4EntityKey",
    "orderCustomProperty5EntityKey",
    "orderCustomProperty6EntityKey",
    "pollRate",
    "preDeliveryScanRequired",
    "quantityTypeReasonCodeRequiredQuantityTypes",
    "requireUpdateEquipmentBeforeDepartingRoute",
    "restrictTrailerDropHookToServiceableStop",
    "routeAliasRouteAlias",
    "routeCustomProperty1EntityKey",
    "routeCustomProperty2EntityKey",
    "routeCustomProperty3EntityKey",
    "routeCustomProperty4EntityKey",
    "routeCustomProperty5EntityKey",
    "routeCustomProperty6EntityKey",
    "scanOffRequired",
    "scanOnRequired",
    "sendGPSByDistance",
    "sendGPSByTime",
    "serviceLocationSearchRadius",
    "showBreakType",
    "showConfirmationBoxes",
    "showConsigneeHistory",
    "showPlannedArrivalTime",
    "showPlannedDepartureTime",
    "showPlannedServiceTime",
    "showPlannedTimesOnPreview",
    "signatureCaptureRequired",
    "tracing",
    "validateQuantities",
    "verifyByException",
    "workerSelectRouteExcludeRoutesAssignedToOtherWorkers",
    "workerSelectRouteExcludeUnassignedRoutes",
    "workerSelectRouteFromFutureDays",
    "workerSelectRouteIncludeRoutesAssignedToWorkersEquipment"
})
public class RegionMobileDeviceSettings
    extends DataTransferObject
{

    @XmlElement(name = "AccumulateDistanceOnlyWhileInTransit")
    protected Boolean accumulateDistanceOnlyWhileInTransit;
    @XmlElement(name = "AllowStopEtaDisplay")
    protected Boolean allowStopEtaDisplay;
    @XmlElement(name = "AllowTextMessagesWhileDriving")
    protected Boolean allowTextMessagesWhileDriving;
    @XmlElement(name = "AllowTrackingWorkerToAddStops")
    protected Boolean allowTrackingWorkerToAddStops;
    @XmlElement(name = "AllowWorkerToAddBreaks")
    protected Boolean allowWorkerToAddBreaks;
    @XmlElement(name = "AllowWorkerToAddDelays")
    protected Boolean allowWorkerToAddDelays;
    @XmlElement(name = "AllowWorkerToAddFreeformReasonCodes")
    protected Boolean allowWorkerToAddFreeformReasonCodes;
    @XmlElement(name = "AllowWorkerToAddLineItems")
    protected Boolean allowWorkerToAddLineItems;
    @XmlElement(name = "AllowWorkerToAddOrders")
    protected Boolean allowWorkerToAddOrders;
    @XmlElement(name = "AllowWorkerToAddOrdersAndLineItems")
    protected Boolean allowWorkerToAddOrdersAndLineItems;
    @XmlElement(name = "AllowWorkerToAddPictures")
    protected Boolean allowWorkerToAddPictures;
    @XmlElement(name = "AllowWorkerToAddServiceableStops")
    protected Boolean allowWorkerToAddServiceableStops;
    @XmlElement(name = "AllowWorkerToArriveAndWait")
    protected Boolean allowWorkerToArriveAndWait;
    @XmlElement(name = "AllowWorkerToAssignEquipment")
    protected Boolean allowWorkerToAssignEquipment;
    @XmlElement(name = "AllowWorkerToAssociateUnknownStops")
    protected Boolean allowWorkerToAssociateUnknownStops;
    @XmlElement(name = "AllowWorkerToCallLocation")
    protected Boolean allowWorkerToCallLocation;
    @XmlElement(name = "AllowWorkerToCancelOrders")
    protected Boolean allowWorkerToCancelOrders;
    @XmlElement(name = "AllowWorkerToCancelStops")
    protected Boolean allowWorkerToCancelStops;
    @XmlElement(name = "AllowWorkerToCheckUncheckDeliveryGroups")
    protected Boolean allowWorkerToCheckUncheckDeliveryGroups;
    @XmlElement(name = "AllowWorkerToCreateGroupStops")
    protected Boolean allowWorkerToCreateGroupStops;
    @XmlElement(name = "AllowWorkerToDropHookTrailer")
    protected Boolean allowWorkerToDropHookTrailer;
    @XmlElement(name = "AllowWorkerToEditDetails")
    protected Boolean allowWorkerToEditDetails;
    @XmlElement(name = "AllowWorkerToGeocodeLocations")
    protected Boolean allowWorkerToGeocodeLocations;
    @XmlElement(name = "AllowWorkerToLoadRouteWithEquipmentInUse")
    protected Boolean allowWorkerToLoadRouteWithEquipmentInUse;
    @XmlElement(name = "AllowWorkerToManuallyCheckOffQuantities")
    protected Boolean allowWorkerToManuallyCheckOffQuantities;
    @XmlElement(name = "AllowWorkerToNavigate")
    protected Boolean allowWorkerToNavigate;
    @XmlElement(name = "AllowWorkerToRedeliverStops")
    protected Boolean allowWorkerToRedeliverStops;
    @XmlElement(name = "AllowWorkerToResequenceStops")
    protected Boolean allowWorkerToResequenceStops;
    @XmlElement(name = "AllowWorkerToReverseChainedStops")
    protected Boolean allowWorkerToReverseChainedStops;
    @XmlElement(name = "AllowWorkerToSelectRoute")
    protected Boolean allowWorkerToSelectRoute;
    @XmlElement(name = "AllowWorkerToSkipSignature")
    protected Boolean allowWorkerToSkipSignature;
    @XmlElement(name = "AllowWorkerToSuspendRoute")
    protected Boolean allowWorkerToSuspendRoute;
    @XmlElement(name = "AllowWorkerToSuspendStops")
    protected Boolean allowWorkerToSuspendStops;
    @XmlElement(name = "AllowWorkerToTransferStops")
    protected Boolean allowWorkerToTransferStops;
    @XmlElement(name = "AllowWorkerToUndeliverStops")
    protected Boolean allowWorkerToUndeliverStops;
    @XmlElement(name = "AllowWorkerToViewLocationComments")
    protected Boolean allowWorkerToViewLocationComments;
    @XmlElement(name = "AlwaysRedeliverUndeliveredStops")
    protected Boolean alwaysRedeliverUndeliveredStops;
    @XmlElement(name = "AutoFixupDetails")
    protected Boolean autoFixupDetails;
    @XmlElement(name = "AutoLogOffWorkerOnRouteCompletion")
    protected Boolean autoLogOffWorkerOnRouteCompletion;
    @XmlElement(name = "AutoNavigateOnPrimaryDevice")
    protected Boolean autoNavigateOnPrimaryDevice;
    @XmlElement(name = "AutoNavigateOnSecondaryDevice")
    protected Boolean autoNavigateOnSecondaryDevice;
    @XmlElement(name = "ComplianceAllowAutomaticSoftwareUpdate")
    protected Boolean complianceAllowAutomaticSoftwareUpdate;
    @XmlElement(name = "ConsigneeRequired")
    protected Boolean consigneeRequired;
    @XmlElementRef(name = "CustomerAgreement", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerAgreement;
    @XmlElement(name = "DefaultWorkerAddedCommentsToInactive")
    protected Boolean defaultWorkerAddedCommentsToInactive;
    @XmlElement(name = "DeliveryImageRequiredWhenSignatureSkipped")
    protected Boolean deliveryImageRequiredWhenSignatureSkipped;
    @XmlElement(name = "DesignateUnplannedBreaksAsPaid")
    protected Boolean designateUnplannedBreaksAsPaid;
    @XmlElement(name = "DisableAppDriveSpeedTrigger")
    protected Integer disableAppDriveSpeedTrigger;
    @XmlElement(name = "DisableAppWhileDriving")
    protected Boolean disableAppWhileDriving;
    @XmlElement(name = "DisableGpsTrackingDuringBreaksAndLayovers")
    protected Boolean disableGpsTrackingDuringBreaksAndLayovers;
    @XmlElement(name = "DisplayCancelReasonCodeConfirmation")
    protected Boolean displayCancelReasonCodeConfirmation;
    @XmlElement(name = "DisplayGroupCheckOffConfirmation")
    protected Boolean displayGroupCheckOffConfirmation;
    @XmlElement(name = "DisplayOrderAndLineItemDetails")
    protected Boolean displayOrderAndLineItemDetails;
    @XmlElement(name = "DisplayQuantityReasonCodesOnSignatureScreen")
    protected Boolean displayQuantityReasonCodesOnSignatureScreen;
    @XmlElement(name = "DisplayRouteDetailsOnStopList")
    protected Boolean displayRouteDetailsOnStopList;
    @XmlElement(name = "DoubleScanAlertEnabled")
    protected Boolean doubleScanAlertEnabled;
    @XmlElementRef(name = "DriverStatsMetric_DriverStatsMetric", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> driverStatsMetricDriverStatsMetric;
    @XmlElement(name = "EmptyOrdersRequireAction")
    protected Boolean emptyOrdersRequireAction;
    @XmlElement(name = "EnableEndOfServiceForStops")
    protected Boolean enableEndOfServiceForStops;
    @XmlElement(name = "EnableGroupStopSignatures")
    protected Boolean enableGroupStopSignatures;
    @XmlElement(name = "EnableNavTriggeredAutoArrive")
    protected Boolean enableNavTriggeredAutoArrive;
    @XmlElement(name = "EnableOSDQuantities")
    protected Boolean enableOSDQuantities;
    @XmlElement(name = "EnableOrderSignatures")
    protected Boolean enableOrderSignatures;
    @XmlElement(name = "EnablePreDeliveryScan")
    protected Boolean enablePreDeliveryScan;
    @XmlElement(name = "EnableQuantitiesOnDevice")
    protected Boolean enableQuantitiesOnDevice;
    @XmlElement(name = "EnableRatioMode")
    protected Boolean enableRatioMode;
    @XmlElement(name = "EnableRoutePreview")
    protected Boolean enableRoutePreview;
    @XmlElement(name = "EnableRouteSync")
    protected Boolean enableRouteSync;
    @XmlElement(name = "EnableRouteTendering")
    protected Boolean enableRouteTendering;
    @XmlElement(name = "EnableScanOff")
    protected Boolean enableScanOff;
    @XmlElement(name = "EnableScanOn")
    protected Boolean enableScanOn;
    @XmlElement(name = "HideQuantitySize1")
    protected Boolean hideQuantitySize1;
    @XmlElement(name = "HideQuantitySize2")
    protected Boolean hideQuantitySize2;
    @XmlElement(name = "HideQuantitySize3")
    protected Boolean hideQuantitySize3;
    @XmlElement(name = "IgnoreQuantityValidationIfZeroPlanned")
    protected Boolean ignoreQuantityValidationIfZeroPlanned;
    @XmlElementRef(name = "InMotionSpeedThreshold", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> inMotionSpeedThreshold;
    @XmlElement(name = "InMotionTriggersNavigateToNextStop")
    protected Boolean inMotionTriggersNavigateToNextStop;
    @XmlElement(name = "IsLineItemCustomProperty1VisibleOnVerifyOrderScreen")
    protected Boolean isLineItemCustomProperty1VisibleOnVerifyOrderScreen;
    @XmlElement(name = "IsLineItemCustomProperty2VisibleOnVerifyOrderScreen")
    protected Boolean isLineItemCustomProperty2VisibleOnVerifyOrderScreen;
    @XmlElement(name = "IsLineItemCustomProperty3VisibleOnVerifyOrderScreen")
    protected Boolean isLineItemCustomProperty3VisibleOnVerifyOrderScreen;
    @XmlElement(name = "IsOrderCustomProperty1VisibleOnVerifyOrderScreen")
    protected Boolean isOrderCustomProperty1VisibleOnVerifyOrderScreen;
    @XmlElement(name = "IsOrderCustomProperty2VisibleOnVerifyOrderScreen")
    protected Boolean isOrderCustomProperty2VisibleOnVerifyOrderScreen;
    @XmlElement(name = "IsOrderCustomProperty3VisibleOnVerifyOrderScreen")
    protected Boolean isOrderCustomProperty3VisibleOnVerifyOrderScreen;
    @XmlElement(name = "IsQuickAddOrderAndLineItemEnabled")
    protected Boolean isQuickAddOrderAndLineItemEnabled;
    @XmlElement(name = "IsRouteCustomProperty1VisibleOnLoadRouteScreen")
    protected Boolean isRouteCustomProperty1VisibleOnLoadRouteScreen;
    @XmlElement(name = "IsRouteSharingEnabled")
    protected Boolean isRouteSharingEnabled;
    @XmlElementRef(name = "LineItemCustomProperty1EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lineItemCustomProperty1EntityKey;
    @XmlElementRef(name = "LineItemCustomProperty2EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lineItemCustomProperty2EntityKey;
    @XmlElementRef(name = "LineItemCustomProperty3EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lineItemCustomProperty3EntityKey;
    @XmlElementRef(name = "LineItemCustomProperty4EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lineItemCustomProperty4EntityKey;
    @XmlElementRef(name = "LineItemCustomProperty5EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lineItemCustomProperty5EntityKey;
    @XmlElementRef(name = "LineItemCustomProperty6EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lineItemCustomProperty6EntityKey;
    @XmlElementRef(name = "LocationCustomProperty1EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> locationCustomProperty1EntityKey;
    @XmlElementRef(name = "LocationCustomProperty2EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> locationCustomProperty2EntityKey;
    @XmlElementRef(name = "LocationCustomProperty3EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> locationCustomProperty3EntityKey;
    @XmlElementRef(name = "LocationCustomProperty4EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> locationCustomProperty4EntityKey;
    @XmlElementRef(name = "LocationCustomProperty5EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> locationCustomProperty5EntityKey;
    @XmlElementRef(name = "LocationCustomProperty6EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> locationCustomProperty6EntityKey;
    @XmlElementRef(name = "MaximumPercentAbovePlannedSize1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumPercentAbovePlannedSize1;
    @XmlElementRef(name = "MaximumPercentAbovePlannedSize2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumPercentAbovePlannedSize2;
    @XmlElementRef(name = "MaximumPercentAbovePlannedSize3", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumPercentAbovePlannedSize3;
    @XmlElementRef(name = "MaximumQuantitySize1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumQuantitySize1;
    @XmlElementRef(name = "MaximumQuantitySize2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumQuantitySize2;
    @XmlElementRef(name = "MaximumQuantitySize3", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumQuantitySize3;
    @XmlElementRef(name = "MobileComplianceCachedLoginTimeLimit_ComplianceCachedLoginTimeLimit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileComplianceCachedLoginTimeLimitComplianceCachedLoginTimeLimit;
    @XmlElementRef(name = "MobileCompliancePaperLogModeActivationTime_CompliancePaperLogModeActivationTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileCompliancePaperLogModeActivationTimeCompliancePaperLogModeActivationTime;
    @XmlElementRef(name = "MobileComplianceReenableBTWaitTime_ComplianceReenableBTWaitTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileComplianceReenableBTWaitTimeComplianceReenableBTWaitTime;
    @XmlElementRef(name = "MobileLoggingLevel_LoggingLevel", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileLoggingLevelLoggingLevel;
    @XmlElementRef(name = "MobileScanningOption_ScanningOption", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileScanningOptionScanningOption;
    @XmlElement(name = "NewSignatureRequiredForQuantityChanges")
    protected Boolean newSignatureRequiredForQuantityChanges;
    @XmlElementRef(name = "OrderCustomProperty1EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderCustomProperty1EntityKey;
    @XmlElementRef(name = "OrderCustomProperty2EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderCustomProperty2EntityKey;
    @XmlElementRef(name = "OrderCustomProperty3EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderCustomProperty3EntityKey;
    @XmlElementRef(name = "OrderCustomProperty4EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderCustomProperty4EntityKey;
    @XmlElementRef(name = "OrderCustomProperty5EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderCustomProperty5EntityKey;
    @XmlElementRef(name = "OrderCustomProperty6EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderCustomProperty6EntityKey;
    @XmlElement(name = "PollRate")
    protected Duration pollRate;
    @XmlElement(name = "PreDeliveryScanRequired")
    protected Boolean preDeliveryScanRequired;
    @XmlElementRef(name = "QuantityType_ReasonCodeRequiredQuantityTypes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantityTypeReasonCodeRequiredQuantityTypes;
    @XmlElement(name = "RequireUpdateEquipmentBeforeDepartingRoute")
    protected Boolean requireUpdateEquipmentBeforeDepartingRoute;
    @XmlElement(name = "RestrictTrailerDropHookToServiceableStop")
    protected Boolean restrictTrailerDropHookToServiceableStop;
    @XmlElementRef(name = "RouteAlias_RouteAlias", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeAliasRouteAlias;
    @XmlElementRef(name = "RouteCustomProperty1EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeCustomProperty1EntityKey;
    @XmlElementRef(name = "RouteCustomProperty2EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeCustomProperty2EntityKey;
    @XmlElementRef(name = "RouteCustomProperty3EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeCustomProperty3EntityKey;
    @XmlElementRef(name = "RouteCustomProperty4EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeCustomProperty4EntityKey;
    @XmlElementRef(name = "RouteCustomProperty5EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeCustomProperty5EntityKey;
    @XmlElementRef(name = "RouteCustomProperty6EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeCustomProperty6EntityKey;
    @XmlElement(name = "ScanOffRequired")
    protected Boolean scanOffRequired;
    @XmlElement(name = "ScanOnRequired")
    protected Boolean scanOnRequired;
    @XmlElementRef(name = "SendGPSByDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> sendGPSByDistance;
    @XmlElement(name = "SendGPSByTime")
    protected Duration sendGPSByTime;
    @XmlElementRef(name = "ServiceLocationSearchRadius", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> serviceLocationSearchRadius;
    @XmlElement(name = "ShowBreakType")
    protected Boolean showBreakType;
    @XmlElement(name = "ShowConfirmationBoxes")
    protected Boolean showConfirmationBoxes;
    @XmlElement(name = "ShowConsigneeHistory")
    protected Boolean showConsigneeHistory;
    @XmlElement(name = "ShowPlannedArrivalTime")
    protected Boolean showPlannedArrivalTime;
    @XmlElement(name = "ShowPlannedDepartureTime")
    protected Boolean showPlannedDepartureTime;
    @XmlElement(name = "ShowPlannedServiceTime")
    protected Boolean showPlannedServiceTime;
    @XmlElement(name = "ShowPlannedTimesOnPreview")
    protected Boolean showPlannedTimesOnPreview;
    @XmlElement(name = "SignatureCaptureRequired")
    protected Boolean signatureCaptureRequired;
    @XmlElement(name = "Tracing")
    protected Boolean tracing;
    @XmlElement(name = "ValidateQuantities")
    protected Boolean validateQuantities;
    @XmlElement(name = "VerifyByException")
    protected Boolean verifyByException;
    @XmlElement(name = "WorkerSelectRouteExcludeRoutesAssignedToOtherWorkers")
    protected Boolean workerSelectRouteExcludeRoutesAssignedToOtherWorkers;
    @XmlElement(name = "WorkerSelectRouteExcludeUnassignedRoutes")
    protected Boolean workerSelectRouteExcludeUnassignedRoutes;
    @XmlElement(name = "WorkerSelectRouteFromFutureDays")
    protected Integer workerSelectRouteFromFutureDays;
    @XmlElement(name = "WorkerSelectRouteIncludeRoutesAssignedToWorkersEquipment")
    protected Boolean workerSelectRouteIncludeRoutesAssignedToWorkersEquipment;

    /**
     * Obtém o valor da propriedade accumulateDistanceOnlyWhileInTransit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccumulateDistanceOnlyWhileInTransit() {
        return accumulateDistanceOnlyWhileInTransit;
    }

    /**
     * Define o valor da propriedade accumulateDistanceOnlyWhileInTransit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccumulateDistanceOnlyWhileInTransit(Boolean value) {
        this.accumulateDistanceOnlyWhileInTransit = value;
    }

    /**
     * Obtém o valor da propriedade allowStopEtaDisplay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowStopEtaDisplay() {
        return allowStopEtaDisplay;
    }

    /**
     * Define o valor da propriedade allowStopEtaDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowStopEtaDisplay(Boolean value) {
        this.allowStopEtaDisplay = value;
    }

    /**
     * Obtém o valor da propriedade allowTextMessagesWhileDriving.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowTextMessagesWhileDriving() {
        return allowTextMessagesWhileDriving;
    }

    /**
     * Define o valor da propriedade allowTextMessagesWhileDriving.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowTextMessagesWhileDriving(Boolean value) {
        this.allowTextMessagesWhileDriving = value;
    }

    /**
     * Obtém o valor da propriedade allowTrackingWorkerToAddStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowTrackingWorkerToAddStops() {
        return allowTrackingWorkerToAddStops;
    }

    /**
     * Define o valor da propriedade allowTrackingWorkerToAddStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowTrackingWorkerToAddStops(Boolean value) {
        this.allowTrackingWorkerToAddStops = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToAddBreaks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToAddBreaks() {
        return allowWorkerToAddBreaks;
    }

    /**
     * Define o valor da propriedade allowWorkerToAddBreaks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToAddBreaks(Boolean value) {
        this.allowWorkerToAddBreaks = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToAddDelays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToAddDelays() {
        return allowWorkerToAddDelays;
    }

    /**
     * Define o valor da propriedade allowWorkerToAddDelays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToAddDelays(Boolean value) {
        this.allowWorkerToAddDelays = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToAddFreeformReasonCodes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToAddFreeformReasonCodes() {
        return allowWorkerToAddFreeformReasonCodes;
    }

    /**
     * Define o valor da propriedade allowWorkerToAddFreeformReasonCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToAddFreeformReasonCodes(Boolean value) {
        this.allowWorkerToAddFreeformReasonCodes = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToAddLineItems.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToAddLineItems() {
        return allowWorkerToAddLineItems;
    }

    /**
     * Define o valor da propriedade allowWorkerToAddLineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToAddLineItems(Boolean value) {
        this.allowWorkerToAddLineItems = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToAddOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToAddOrders() {
        return allowWorkerToAddOrders;
    }

    /**
     * Define o valor da propriedade allowWorkerToAddOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToAddOrders(Boolean value) {
        this.allowWorkerToAddOrders = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToAddOrdersAndLineItems.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToAddOrdersAndLineItems() {
        return allowWorkerToAddOrdersAndLineItems;
    }

    /**
     * Define o valor da propriedade allowWorkerToAddOrdersAndLineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToAddOrdersAndLineItems(Boolean value) {
        this.allowWorkerToAddOrdersAndLineItems = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToAddPictures.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToAddPictures() {
        return allowWorkerToAddPictures;
    }

    /**
     * Define o valor da propriedade allowWorkerToAddPictures.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToAddPictures(Boolean value) {
        this.allowWorkerToAddPictures = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToAddServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToAddServiceableStops() {
        return allowWorkerToAddServiceableStops;
    }

    /**
     * Define o valor da propriedade allowWorkerToAddServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToAddServiceableStops(Boolean value) {
        this.allowWorkerToAddServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToArriveAndWait.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToArriveAndWait() {
        return allowWorkerToArriveAndWait;
    }

    /**
     * Define o valor da propriedade allowWorkerToArriveAndWait.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToArriveAndWait(Boolean value) {
        this.allowWorkerToArriveAndWait = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToAssignEquipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToAssignEquipment() {
        return allowWorkerToAssignEquipment;
    }

    /**
     * Define o valor da propriedade allowWorkerToAssignEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToAssignEquipment(Boolean value) {
        this.allowWorkerToAssignEquipment = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToAssociateUnknownStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToAssociateUnknownStops() {
        return allowWorkerToAssociateUnknownStops;
    }

    /**
     * Define o valor da propriedade allowWorkerToAssociateUnknownStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToAssociateUnknownStops(Boolean value) {
        this.allowWorkerToAssociateUnknownStops = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToCallLocation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToCallLocation() {
        return allowWorkerToCallLocation;
    }

    /**
     * Define o valor da propriedade allowWorkerToCallLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToCallLocation(Boolean value) {
        this.allowWorkerToCallLocation = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToCancelOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToCancelOrders() {
        return allowWorkerToCancelOrders;
    }

    /**
     * Define o valor da propriedade allowWorkerToCancelOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToCancelOrders(Boolean value) {
        this.allowWorkerToCancelOrders = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToCancelStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToCancelStops() {
        return allowWorkerToCancelStops;
    }

    /**
     * Define o valor da propriedade allowWorkerToCancelStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToCancelStops(Boolean value) {
        this.allowWorkerToCancelStops = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToCheckUncheckDeliveryGroups.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToCheckUncheckDeliveryGroups() {
        return allowWorkerToCheckUncheckDeliveryGroups;
    }

    /**
     * Define o valor da propriedade allowWorkerToCheckUncheckDeliveryGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToCheckUncheckDeliveryGroups(Boolean value) {
        this.allowWorkerToCheckUncheckDeliveryGroups = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToCreateGroupStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToCreateGroupStops() {
        return allowWorkerToCreateGroupStops;
    }

    /**
     * Define o valor da propriedade allowWorkerToCreateGroupStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToCreateGroupStops(Boolean value) {
        this.allowWorkerToCreateGroupStops = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToDropHookTrailer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToDropHookTrailer() {
        return allowWorkerToDropHookTrailer;
    }

    /**
     * Define o valor da propriedade allowWorkerToDropHookTrailer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToDropHookTrailer(Boolean value) {
        this.allowWorkerToDropHookTrailer = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToEditDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToEditDetails() {
        return allowWorkerToEditDetails;
    }

    /**
     * Define o valor da propriedade allowWorkerToEditDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToEditDetails(Boolean value) {
        this.allowWorkerToEditDetails = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToGeocodeLocations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToGeocodeLocations() {
        return allowWorkerToGeocodeLocations;
    }

    /**
     * Define o valor da propriedade allowWorkerToGeocodeLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToGeocodeLocations(Boolean value) {
        this.allowWorkerToGeocodeLocations = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToLoadRouteWithEquipmentInUse.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToLoadRouteWithEquipmentInUse() {
        return allowWorkerToLoadRouteWithEquipmentInUse;
    }

    /**
     * Define o valor da propriedade allowWorkerToLoadRouteWithEquipmentInUse.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToLoadRouteWithEquipmentInUse(Boolean value) {
        this.allowWorkerToLoadRouteWithEquipmentInUse = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToManuallyCheckOffQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToManuallyCheckOffQuantities() {
        return allowWorkerToManuallyCheckOffQuantities;
    }

    /**
     * Define o valor da propriedade allowWorkerToManuallyCheckOffQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToManuallyCheckOffQuantities(Boolean value) {
        this.allowWorkerToManuallyCheckOffQuantities = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToNavigate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToNavigate() {
        return allowWorkerToNavigate;
    }

    /**
     * Define o valor da propriedade allowWorkerToNavigate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToNavigate(Boolean value) {
        this.allowWorkerToNavigate = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToRedeliverStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToRedeliverStops() {
        return allowWorkerToRedeliverStops;
    }

    /**
     * Define o valor da propriedade allowWorkerToRedeliverStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToRedeliverStops(Boolean value) {
        this.allowWorkerToRedeliverStops = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToResequenceStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToResequenceStops() {
        return allowWorkerToResequenceStops;
    }

    /**
     * Define o valor da propriedade allowWorkerToResequenceStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToResequenceStops(Boolean value) {
        this.allowWorkerToResequenceStops = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToReverseChainedStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToReverseChainedStops() {
        return allowWorkerToReverseChainedStops;
    }

    /**
     * Define o valor da propriedade allowWorkerToReverseChainedStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToReverseChainedStops(Boolean value) {
        this.allowWorkerToReverseChainedStops = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToSelectRoute.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToSelectRoute() {
        return allowWorkerToSelectRoute;
    }

    /**
     * Define o valor da propriedade allowWorkerToSelectRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToSelectRoute(Boolean value) {
        this.allowWorkerToSelectRoute = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToSkipSignature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToSkipSignature() {
        return allowWorkerToSkipSignature;
    }

    /**
     * Define o valor da propriedade allowWorkerToSkipSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToSkipSignature(Boolean value) {
        this.allowWorkerToSkipSignature = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToSuspendRoute.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToSuspendRoute() {
        return allowWorkerToSuspendRoute;
    }

    /**
     * Define o valor da propriedade allowWorkerToSuspendRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToSuspendRoute(Boolean value) {
        this.allowWorkerToSuspendRoute = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToSuspendStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToSuspendStops() {
        return allowWorkerToSuspendStops;
    }

    /**
     * Define o valor da propriedade allowWorkerToSuspendStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToSuspendStops(Boolean value) {
        this.allowWorkerToSuspendStops = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToTransferStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToTransferStops() {
        return allowWorkerToTransferStops;
    }

    /**
     * Define o valor da propriedade allowWorkerToTransferStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToTransferStops(Boolean value) {
        this.allowWorkerToTransferStops = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToUndeliverStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToUndeliverStops() {
        return allowWorkerToUndeliverStops;
    }

    /**
     * Define o valor da propriedade allowWorkerToUndeliverStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToUndeliverStops(Boolean value) {
        this.allowWorkerToUndeliverStops = value;
    }

    /**
     * Obtém o valor da propriedade allowWorkerToViewLocationComments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWorkerToViewLocationComments() {
        return allowWorkerToViewLocationComments;
    }

    /**
     * Define o valor da propriedade allowWorkerToViewLocationComments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWorkerToViewLocationComments(Boolean value) {
        this.allowWorkerToViewLocationComments = value;
    }

    /**
     * Obtém o valor da propriedade alwaysRedeliverUndeliveredStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysRedeliverUndeliveredStops() {
        return alwaysRedeliverUndeliveredStops;
    }

    /**
     * Define o valor da propriedade alwaysRedeliverUndeliveredStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysRedeliverUndeliveredStops(Boolean value) {
        this.alwaysRedeliverUndeliveredStops = value;
    }

    /**
     * Obtém o valor da propriedade autoFixupDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoFixupDetails() {
        return autoFixupDetails;
    }

    /**
     * Define o valor da propriedade autoFixupDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoFixupDetails(Boolean value) {
        this.autoFixupDetails = value;
    }

    /**
     * Obtém o valor da propriedade autoLogOffWorkerOnRouteCompletion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoLogOffWorkerOnRouteCompletion() {
        return autoLogOffWorkerOnRouteCompletion;
    }

    /**
     * Define o valor da propriedade autoLogOffWorkerOnRouteCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoLogOffWorkerOnRouteCompletion(Boolean value) {
        this.autoLogOffWorkerOnRouteCompletion = value;
    }

    /**
     * Obtém o valor da propriedade autoNavigateOnPrimaryDevice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoNavigateOnPrimaryDevice() {
        return autoNavigateOnPrimaryDevice;
    }

    /**
     * Define o valor da propriedade autoNavigateOnPrimaryDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoNavigateOnPrimaryDevice(Boolean value) {
        this.autoNavigateOnPrimaryDevice = value;
    }

    /**
     * Obtém o valor da propriedade autoNavigateOnSecondaryDevice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoNavigateOnSecondaryDevice() {
        return autoNavigateOnSecondaryDevice;
    }

    /**
     * Define o valor da propriedade autoNavigateOnSecondaryDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoNavigateOnSecondaryDevice(Boolean value) {
        this.autoNavigateOnSecondaryDevice = value;
    }

    /**
     * Obtém o valor da propriedade complianceAllowAutomaticSoftwareUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplianceAllowAutomaticSoftwareUpdate() {
        return complianceAllowAutomaticSoftwareUpdate;
    }

    /**
     * Define o valor da propriedade complianceAllowAutomaticSoftwareUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplianceAllowAutomaticSoftwareUpdate(Boolean value) {
        this.complianceAllowAutomaticSoftwareUpdate = value;
    }

    /**
     * Obtém o valor da propriedade consigneeRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsigneeRequired() {
        return consigneeRequired;
    }

    /**
     * Define o valor da propriedade consigneeRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsigneeRequired(Boolean value) {
        this.consigneeRequired = value;
    }

    /**
     * Obtém o valor da propriedade customerAgreement.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerAgreement() {
        return customerAgreement;
    }

    /**
     * Define o valor da propriedade customerAgreement.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerAgreement(JAXBElement<String> value) {
        this.customerAgreement = value;
    }

    /**
     * Obtém o valor da propriedade defaultWorkerAddedCommentsToInactive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultWorkerAddedCommentsToInactive() {
        return defaultWorkerAddedCommentsToInactive;
    }

    /**
     * Define o valor da propriedade defaultWorkerAddedCommentsToInactive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultWorkerAddedCommentsToInactive(Boolean value) {
        this.defaultWorkerAddedCommentsToInactive = value;
    }

    /**
     * Obtém o valor da propriedade deliveryImageRequiredWhenSignatureSkipped.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryImageRequiredWhenSignatureSkipped() {
        return deliveryImageRequiredWhenSignatureSkipped;
    }

    /**
     * Define o valor da propriedade deliveryImageRequiredWhenSignatureSkipped.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryImageRequiredWhenSignatureSkipped(Boolean value) {
        this.deliveryImageRequiredWhenSignatureSkipped = value;
    }

    /**
     * Obtém o valor da propriedade designateUnplannedBreaksAsPaid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDesignateUnplannedBreaksAsPaid() {
        return designateUnplannedBreaksAsPaid;
    }

    /**
     * Define o valor da propriedade designateUnplannedBreaksAsPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDesignateUnplannedBreaksAsPaid(Boolean value) {
        this.designateUnplannedBreaksAsPaid = value;
    }

    /**
     * Obtém o valor da propriedade disableAppDriveSpeedTrigger.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisableAppDriveSpeedTrigger() {
        return disableAppDriveSpeedTrigger;
    }

    /**
     * Define o valor da propriedade disableAppDriveSpeedTrigger.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisableAppDriveSpeedTrigger(Integer value) {
        this.disableAppDriveSpeedTrigger = value;
    }

    /**
     * Obtém o valor da propriedade disableAppWhileDriving.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableAppWhileDriving() {
        return disableAppWhileDriving;
    }

    /**
     * Define o valor da propriedade disableAppWhileDriving.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableAppWhileDriving(Boolean value) {
        this.disableAppWhileDriving = value;
    }

    /**
     * Obtém o valor da propriedade disableGpsTrackingDuringBreaksAndLayovers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableGpsTrackingDuringBreaksAndLayovers() {
        return disableGpsTrackingDuringBreaksAndLayovers;
    }

    /**
     * Define o valor da propriedade disableGpsTrackingDuringBreaksAndLayovers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableGpsTrackingDuringBreaksAndLayovers(Boolean value) {
        this.disableGpsTrackingDuringBreaksAndLayovers = value;
    }

    /**
     * Obtém o valor da propriedade displayCancelReasonCodeConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayCancelReasonCodeConfirmation() {
        return displayCancelReasonCodeConfirmation;
    }

    /**
     * Define o valor da propriedade displayCancelReasonCodeConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayCancelReasonCodeConfirmation(Boolean value) {
        this.displayCancelReasonCodeConfirmation = value;
    }

    /**
     * Obtém o valor da propriedade displayGroupCheckOffConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayGroupCheckOffConfirmation() {
        return displayGroupCheckOffConfirmation;
    }

    /**
     * Define o valor da propriedade displayGroupCheckOffConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayGroupCheckOffConfirmation(Boolean value) {
        this.displayGroupCheckOffConfirmation = value;
    }

    /**
     * Obtém o valor da propriedade displayOrderAndLineItemDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayOrderAndLineItemDetails() {
        return displayOrderAndLineItemDetails;
    }

    /**
     * Define o valor da propriedade displayOrderAndLineItemDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayOrderAndLineItemDetails(Boolean value) {
        this.displayOrderAndLineItemDetails = value;
    }

    /**
     * Obtém o valor da propriedade displayQuantityReasonCodesOnSignatureScreen.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayQuantityReasonCodesOnSignatureScreen() {
        return displayQuantityReasonCodesOnSignatureScreen;
    }

    /**
     * Define o valor da propriedade displayQuantityReasonCodesOnSignatureScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayQuantityReasonCodesOnSignatureScreen(Boolean value) {
        this.displayQuantityReasonCodesOnSignatureScreen = value;
    }

    /**
     * Obtém o valor da propriedade displayRouteDetailsOnStopList.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayRouteDetailsOnStopList() {
        return displayRouteDetailsOnStopList;
    }

    /**
     * Define o valor da propriedade displayRouteDetailsOnStopList.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayRouteDetailsOnStopList(Boolean value) {
        this.displayRouteDetailsOnStopList = value;
    }

    /**
     * Obtém o valor da propriedade doubleScanAlertEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoubleScanAlertEnabled() {
        return doubleScanAlertEnabled;
    }

    /**
     * Define o valor da propriedade doubleScanAlertEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoubleScanAlertEnabled(Boolean value) {
        this.doubleScanAlertEnabled = value;
    }

    /**
     * Obtém o valor da propriedade driverStatsMetricDriverStatsMetric.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDriverStatsMetricDriverStatsMetric() {
        return driverStatsMetricDriverStatsMetric;
    }

    /**
     * Define o valor da propriedade driverStatsMetricDriverStatsMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDriverStatsMetricDriverStatsMetric(JAXBElement<String> value) {
        this.driverStatsMetricDriverStatsMetric = value;
    }

    /**
     * Obtém o valor da propriedade emptyOrdersRequireAction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmptyOrdersRequireAction() {
        return emptyOrdersRequireAction;
    }

    /**
     * Define o valor da propriedade emptyOrdersRequireAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmptyOrdersRequireAction(Boolean value) {
        this.emptyOrdersRequireAction = value;
    }

    /**
     * Obtém o valor da propriedade enableEndOfServiceForStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableEndOfServiceForStops() {
        return enableEndOfServiceForStops;
    }

    /**
     * Define o valor da propriedade enableEndOfServiceForStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableEndOfServiceForStops(Boolean value) {
        this.enableEndOfServiceForStops = value;
    }

    /**
     * Obtém o valor da propriedade enableGroupStopSignatures.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableGroupStopSignatures() {
        return enableGroupStopSignatures;
    }

    /**
     * Define o valor da propriedade enableGroupStopSignatures.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableGroupStopSignatures(Boolean value) {
        this.enableGroupStopSignatures = value;
    }

    /**
     * Obtém o valor da propriedade enableNavTriggeredAutoArrive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableNavTriggeredAutoArrive() {
        return enableNavTriggeredAutoArrive;
    }

    /**
     * Define o valor da propriedade enableNavTriggeredAutoArrive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableNavTriggeredAutoArrive(Boolean value) {
        this.enableNavTriggeredAutoArrive = value;
    }

    /**
     * Obtém o valor da propriedade enableOSDQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableOSDQuantities() {
        return enableOSDQuantities;
    }

    /**
     * Define o valor da propriedade enableOSDQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableOSDQuantities(Boolean value) {
        this.enableOSDQuantities = value;
    }

    /**
     * Obtém o valor da propriedade enableOrderSignatures.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableOrderSignatures() {
        return enableOrderSignatures;
    }

    /**
     * Define o valor da propriedade enableOrderSignatures.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableOrderSignatures(Boolean value) {
        this.enableOrderSignatures = value;
    }

    /**
     * Obtém o valor da propriedade enablePreDeliveryScan.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnablePreDeliveryScan() {
        return enablePreDeliveryScan;
    }

    /**
     * Define o valor da propriedade enablePreDeliveryScan.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablePreDeliveryScan(Boolean value) {
        this.enablePreDeliveryScan = value;
    }

    /**
     * Obtém o valor da propriedade enableQuantitiesOnDevice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableQuantitiesOnDevice() {
        return enableQuantitiesOnDevice;
    }

    /**
     * Define o valor da propriedade enableQuantitiesOnDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableQuantitiesOnDevice(Boolean value) {
        this.enableQuantitiesOnDevice = value;
    }

    /**
     * Obtém o valor da propriedade enableRatioMode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRatioMode() {
        return enableRatioMode;
    }

    /**
     * Define o valor da propriedade enableRatioMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRatioMode(Boolean value) {
        this.enableRatioMode = value;
    }

    /**
     * Obtém o valor da propriedade enableRoutePreview.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRoutePreview() {
        return enableRoutePreview;
    }

    /**
     * Define o valor da propriedade enableRoutePreview.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRoutePreview(Boolean value) {
        this.enableRoutePreview = value;
    }

    /**
     * Obtém o valor da propriedade enableRouteSync.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRouteSync() {
        return enableRouteSync;
    }

    /**
     * Define o valor da propriedade enableRouteSync.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRouteSync(Boolean value) {
        this.enableRouteSync = value;
    }

    /**
     * Obtém o valor da propriedade enableRouteTendering.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRouteTendering() {
        return enableRouteTendering;
    }

    /**
     * Define o valor da propriedade enableRouteTendering.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRouteTendering(Boolean value) {
        this.enableRouteTendering = value;
    }

    /**
     * Obtém o valor da propriedade enableScanOff.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableScanOff() {
        return enableScanOff;
    }

    /**
     * Define o valor da propriedade enableScanOff.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableScanOff(Boolean value) {
        this.enableScanOff = value;
    }

    /**
     * Obtém o valor da propriedade enableScanOn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableScanOn() {
        return enableScanOn;
    }

    /**
     * Define o valor da propriedade enableScanOn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableScanOn(Boolean value) {
        this.enableScanOn = value;
    }

    /**
     * Obtém o valor da propriedade hideQuantitySize1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideQuantitySize1() {
        return hideQuantitySize1;
    }

    /**
     * Define o valor da propriedade hideQuantitySize1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideQuantitySize1(Boolean value) {
        this.hideQuantitySize1 = value;
    }

    /**
     * Obtém o valor da propriedade hideQuantitySize2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideQuantitySize2() {
        return hideQuantitySize2;
    }

    /**
     * Define o valor da propriedade hideQuantitySize2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideQuantitySize2(Boolean value) {
        this.hideQuantitySize2 = value;
    }

    /**
     * Obtém o valor da propriedade hideQuantitySize3.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideQuantitySize3() {
        return hideQuantitySize3;
    }

    /**
     * Define o valor da propriedade hideQuantitySize3.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideQuantitySize3(Boolean value) {
        this.hideQuantitySize3 = value;
    }

    /**
     * Obtém o valor da propriedade ignoreQuantityValidationIfZeroPlanned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreQuantityValidationIfZeroPlanned() {
        return ignoreQuantityValidationIfZeroPlanned;
    }

    /**
     * Define o valor da propriedade ignoreQuantityValidationIfZeroPlanned.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreQuantityValidationIfZeroPlanned(Boolean value) {
        this.ignoreQuantityValidationIfZeroPlanned = value;
    }

    /**
     * Obtém o valor da propriedade inMotionSpeedThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getInMotionSpeedThreshold() {
        return inMotionSpeedThreshold;
    }

    /**
     * Define o valor da propriedade inMotionSpeedThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setInMotionSpeedThreshold(JAXBElement<Speed> value) {
        this.inMotionSpeedThreshold = value;
    }

    /**
     * Obtém o valor da propriedade inMotionTriggersNavigateToNextStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInMotionTriggersNavigateToNextStop() {
        return inMotionTriggersNavigateToNextStop;
    }

    /**
     * Define o valor da propriedade inMotionTriggersNavigateToNextStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInMotionTriggersNavigateToNextStop(Boolean value) {
        this.inMotionTriggersNavigateToNextStop = value;
    }

    /**
     * Obtém o valor da propriedade isLineItemCustomProperty1VisibleOnVerifyOrderScreen.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLineItemCustomProperty1VisibleOnVerifyOrderScreen() {
        return isLineItemCustomProperty1VisibleOnVerifyOrderScreen;
    }

    /**
     * Define o valor da propriedade isLineItemCustomProperty1VisibleOnVerifyOrderScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLineItemCustomProperty1VisibleOnVerifyOrderScreen(Boolean value) {
        this.isLineItemCustomProperty1VisibleOnVerifyOrderScreen = value;
    }

    /**
     * Obtém o valor da propriedade isLineItemCustomProperty2VisibleOnVerifyOrderScreen.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLineItemCustomProperty2VisibleOnVerifyOrderScreen() {
        return isLineItemCustomProperty2VisibleOnVerifyOrderScreen;
    }

    /**
     * Define o valor da propriedade isLineItemCustomProperty2VisibleOnVerifyOrderScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLineItemCustomProperty2VisibleOnVerifyOrderScreen(Boolean value) {
        this.isLineItemCustomProperty2VisibleOnVerifyOrderScreen = value;
    }

    /**
     * Obtém o valor da propriedade isLineItemCustomProperty3VisibleOnVerifyOrderScreen.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLineItemCustomProperty3VisibleOnVerifyOrderScreen() {
        return isLineItemCustomProperty3VisibleOnVerifyOrderScreen;
    }

    /**
     * Define o valor da propriedade isLineItemCustomProperty3VisibleOnVerifyOrderScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLineItemCustomProperty3VisibleOnVerifyOrderScreen(Boolean value) {
        this.isLineItemCustomProperty3VisibleOnVerifyOrderScreen = value;
    }

    /**
     * Obtém o valor da propriedade isOrderCustomProperty1VisibleOnVerifyOrderScreen.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOrderCustomProperty1VisibleOnVerifyOrderScreen() {
        return isOrderCustomProperty1VisibleOnVerifyOrderScreen;
    }

    /**
     * Define o valor da propriedade isOrderCustomProperty1VisibleOnVerifyOrderScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOrderCustomProperty1VisibleOnVerifyOrderScreen(Boolean value) {
        this.isOrderCustomProperty1VisibleOnVerifyOrderScreen = value;
    }

    /**
     * Obtém o valor da propriedade isOrderCustomProperty2VisibleOnVerifyOrderScreen.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOrderCustomProperty2VisibleOnVerifyOrderScreen() {
        return isOrderCustomProperty2VisibleOnVerifyOrderScreen;
    }

    /**
     * Define o valor da propriedade isOrderCustomProperty2VisibleOnVerifyOrderScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOrderCustomProperty2VisibleOnVerifyOrderScreen(Boolean value) {
        this.isOrderCustomProperty2VisibleOnVerifyOrderScreen = value;
    }

    /**
     * Obtém o valor da propriedade isOrderCustomProperty3VisibleOnVerifyOrderScreen.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOrderCustomProperty3VisibleOnVerifyOrderScreen() {
        return isOrderCustomProperty3VisibleOnVerifyOrderScreen;
    }

    /**
     * Define o valor da propriedade isOrderCustomProperty3VisibleOnVerifyOrderScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOrderCustomProperty3VisibleOnVerifyOrderScreen(Boolean value) {
        this.isOrderCustomProperty3VisibleOnVerifyOrderScreen = value;
    }

    /**
     * Obtém o valor da propriedade isQuickAddOrderAndLineItemEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuickAddOrderAndLineItemEnabled() {
        return isQuickAddOrderAndLineItemEnabled;
    }

    /**
     * Define o valor da propriedade isQuickAddOrderAndLineItemEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuickAddOrderAndLineItemEnabled(Boolean value) {
        this.isQuickAddOrderAndLineItemEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isRouteCustomProperty1VisibleOnLoadRouteScreen.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRouteCustomProperty1VisibleOnLoadRouteScreen() {
        return isRouteCustomProperty1VisibleOnLoadRouteScreen;
    }

    /**
     * Define o valor da propriedade isRouteCustomProperty1VisibleOnLoadRouteScreen.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRouteCustomProperty1VisibleOnLoadRouteScreen(Boolean value) {
        this.isRouteCustomProperty1VisibleOnLoadRouteScreen = value;
    }

    /**
     * Obtém o valor da propriedade isRouteSharingEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRouteSharingEnabled() {
        return isRouteSharingEnabled;
    }

    /**
     * Define o valor da propriedade isRouteSharingEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRouteSharingEnabled(Boolean value) {
        this.isRouteSharingEnabled = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperty1EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLineItemCustomProperty1EntityKey() {
        return lineItemCustomProperty1EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLineItemCustomProperty1EntityKey(JAXBElement<Long> value) {
        this.lineItemCustomProperty1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperty2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLineItemCustomProperty2EntityKey() {
        return lineItemCustomProperty2EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLineItemCustomProperty2EntityKey(JAXBElement<Long> value) {
        this.lineItemCustomProperty2EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperty3EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLineItemCustomProperty3EntityKey() {
        return lineItemCustomProperty3EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty3EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLineItemCustomProperty3EntityKey(JAXBElement<Long> value) {
        this.lineItemCustomProperty3EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperty4EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLineItemCustomProperty4EntityKey() {
        return lineItemCustomProperty4EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty4EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLineItemCustomProperty4EntityKey(JAXBElement<Long> value) {
        this.lineItemCustomProperty4EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperty5EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLineItemCustomProperty5EntityKey() {
        return lineItemCustomProperty5EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty5EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLineItemCustomProperty5EntityKey(JAXBElement<Long> value) {
        this.lineItemCustomProperty5EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperty6EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLineItemCustomProperty6EntityKey() {
        return lineItemCustomProperty6EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty6EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLineItemCustomProperty6EntityKey(JAXBElement<Long> value) {
        this.lineItemCustomProperty6EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty1EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationCustomProperty1EntityKey() {
        return locationCustomProperty1EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationCustomProperty1EntityKey(JAXBElement<Long> value) {
        this.locationCustomProperty1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationCustomProperty2EntityKey() {
        return locationCustomProperty2EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationCustomProperty2EntityKey(JAXBElement<Long> value) {
        this.locationCustomProperty2EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty3EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationCustomProperty3EntityKey() {
        return locationCustomProperty3EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty3EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationCustomProperty3EntityKey(JAXBElement<Long> value) {
        this.locationCustomProperty3EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty4EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationCustomProperty4EntityKey() {
        return locationCustomProperty4EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty4EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationCustomProperty4EntityKey(JAXBElement<Long> value) {
        this.locationCustomProperty4EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty5EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationCustomProperty5EntityKey() {
        return locationCustomProperty5EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty5EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationCustomProperty5EntityKey(JAXBElement<Long> value) {
        this.locationCustomProperty5EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty6EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationCustomProperty6EntityKey() {
        return locationCustomProperty6EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty6EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationCustomProperty6EntityKey(JAXBElement<Long> value) {
        this.locationCustomProperty6EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade maximumPercentAbovePlannedSize1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumPercentAbovePlannedSize1() {
        return maximumPercentAbovePlannedSize1;
    }

    /**
     * Define o valor da propriedade maximumPercentAbovePlannedSize1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumPercentAbovePlannedSize1(JAXBElement<Integer> value) {
        this.maximumPercentAbovePlannedSize1 = value;
    }

    /**
     * Obtém o valor da propriedade maximumPercentAbovePlannedSize2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumPercentAbovePlannedSize2() {
        return maximumPercentAbovePlannedSize2;
    }

    /**
     * Define o valor da propriedade maximumPercentAbovePlannedSize2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumPercentAbovePlannedSize2(JAXBElement<Integer> value) {
        this.maximumPercentAbovePlannedSize2 = value;
    }

    /**
     * Obtém o valor da propriedade maximumPercentAbovePlannedSize3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumPercentAbovePlannedSize3() {
        return maximumPercentAbovePlannedSize3;
    }

    /**
     * Define o valor da propriedade maximumPercentAbovePlannedSize3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumPercentAbovePlannedSize3(JAXBElement<Integer> value) {
        this.maximumPercentAbovePlannedSize3 = value;
    }

    /**
     * Obtém o valor da propriedade maximumQuantitySize1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumQuantitySize1() {
        return maximumQuantitySize1;
    }

    /**
     * Define o valor da propriedade maximumQuantitySize1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumQuantitySize1(JAXBElement<Integer> value) {
        this.maximumQuantitySize1 = value;
    }

    /**
     * Obtém o valor da propriedade maximumQuantitySize2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumQuantitySize2() {
        return maximumQuantitySize2;
    }

    /**
     * Define o valor da propriedade maximumQuantitySize2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumQuantitySize2(JAXBElement<Integer> value) {
        this.maximumQuantitySize2 = value;
    }

    /**
     * Obtém o valor da propriedade maximumQuantitySize3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumQuantitySize3() {
        return maximumQuantitySize3;
    }

    /**
     * Define o valor da propriedade maximumQuantitySize3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumQuantitySize3(JAXBElement<Integer> value) {
        this.maximumQuantitySize3 = value;
    }

    /**
     * Obtém o valor da propriedade mobileComplianceCachedLoginTimeLimitComplianceCachedLoginTimeLimit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileComplianceCachedLoginTimeLimitComplianceCachedLoginTimeLimit() {
        return mobileComplianceCachedLoginTimeLimitComplianceCachedLoginTimeLimit;
    }

    /**
     * Define o valor da propriedade mobileComplianceCachedLoginTimeLimitComplianceCachedLoginTimeLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileComplianceCachedLoginTimeLimitComplianceCachedLoginTimeLimit(JAXBElement<String> value) {
        this.mobileComplianceCachedLoginTimeLimitComplianceCachedLoginTimeLimit = value;
    }

    /**
     * Obtém o valor da propriedade mobileCompliancePaperLogModeActivationTimeCompliancePaperLogModeActivationTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileCompliancePaperLogModeActivationTimeCompliancePaperLogModeActivationTime() {
        return mobileCompliancePaperLogModeActivationTimeCompliancePaperLogModeActivationTime;
    }

    /**
     * Define o valor da propriedade mobileCompliancePaperLogModeActivationTimeCompliancePaperLogModeActivationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileCompliancePaperLogModeActivationTimeCompliancePaperLogModeActivationTime(JAXBElement<String> value) {
        this.mobileCompliancePaperLogModeActivationTimeCompliancePaperLogModeActivationTime = value;
    }

    /**
     * Obtém o valor da propriedade mobileComplianceReenableBTWaitTimeComplianceReenableBTWaitTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileComplianceReenableBTWaitTimeComplianceReenableBTWaitTime() {
        return mobileComplianceReenableBTWaitTimeComplianceReenableBTWaitTime;
    }

    /**
     * Define o valor da propriedade mobileComplianceReenableBTWaitTimeComplianceReenableBTWaitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileComplianceReenableBTWaitTimeComplianceReenableBTWaitTime(JAXBElement<String> value) {
        this.mobileComplianceReenableBTWaitTimeComplianceReenableBTWaitTime = value;
    }

    /**
     * Obtém o valor da propriedade mobileLoggingLevelLoggingLevel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileLoggingLevelLoggingLevel() {
        return mobileLoggingLevelLoggingLevel;
    }

    /**
     * Define o valor da propriedade mobileLoggingLevelLoggingLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileLoggingLevelLoggingLevel(JAXBElement<String> value) {
        this.mobileLoggingLevelLoggingLevel = value;
    }

    /**
     * Obtém o valor da propriedade mobileScanningOptionScanningOption.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileScanningOptionScanningOption() {
        return mobileScanningOptionScanningOption;
    }

    /**
     * Define o valor da propriedade mobileScanningOptionScanningOption.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileScanningOptionScanningOption(JAXBElement<String> value) {
        this.mobileScanningOptionScanningOption = value;
    }

    /**
     * Obtém o valor da propriedade newSignatureRequiredForQuantityChanges.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewSignatureRequiredForQuantityChanges() {
        return newSignatureRequiredForQuantityChanges;
    }

    /**
     * Define o valor da propriedade newSignatureRequiredForQuantityChanges.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewSignatureRequiredForQuantityChanges(Boolean value) {
        this.newSignatureRequiredForQuantityChanges = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperty1EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderCustomProperty1EntityKey() {
        return orderCustomProperty1EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderCustomProperty1EntityKey(JAXBElement<Long> value) {
        this.orderCustomProperty1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperty2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderCustomProperty2EntityKey() {
        return orderCustomProperty2EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderCustomProperty2EntityKey(JAXBElement<Long> value) {
        this.orderCustomProperty2EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperty3EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderCustomProperty3EntityKey() {
        return orderCustomProperty3EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty3EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderCustomProperty3EntityKey(JAXBElement<Long> value) {
        this.orderCustomProperty3EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperty4EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderCustomProperty4EntityKey() {
        return orderCustomProperty4EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty4EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderCustomProperty4EntityKey(JAXBElement<Long> value) {
        this.orderCustomProperty4EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperty5EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderCustomProperty5EntityKey() {
        return orderCustomProperty5EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty5EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderCustomProperty5EntityKey(JAXBElement<Long> value) {
        this.orderCustomProperty5EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperty6EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderCustomProperty6EntityKey() {
        return orderCustomProperty6EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty6EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderCustomProperty6EntityKey(JAXBElement<Long> value) {
        this.orderCustomProperty6EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade pollRate.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPollRate() {
        return pollRate;
    }

    /**
     * Define o valor da propriedade pollRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPollRate(Duration value) {
        this.pollRate = value;
    }

    /**
     * Obtém o valor da propriedade preDeliveryScanRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreDeliveryScanRequired() {
        return preDeliveryScanRequired;
    }

    /**
     * Define o valor da propriedade preDeliveryScanRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreDeliveryScanRequired(Boolean value) {
        this.preDeliveryScanRequired = value;
    }

    /**
     * Obtém o valor da propriedade quantityTypeReasonCodeRequiredQuantityTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantityTypeReasonCodeRequiredQuantityTypes() {
        return quantityTypeReasonCodeRequiredQuantityTypes;
    }

    /**
     * Define o valor da propriedade quantityTypeReasonCodeRequiredQuantityTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantityTypeReasonCodeRequiredQuantityTypes(JAXBElement<String> value) {
        this.quantityTypeReasonCodeRequiredQuantityTypes = value;
    }

    /**
     * Obtém o valor da propriedade requireUpdateEquipmentBeforeDepartingRoute.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireUpdateEquipmentBeforeDepartingRoute() {
        return requireUpdateEquipmentBeforeDepartingRoute;
    }

    /**
     * Define o valor da propriedade requireUpdateEquipmentBeforeDepartingRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireUpdateEquipmentBeforeDepartingRoute(Boolean value) {
        this.requireUpdateEquipmentBeforeDepartingRoute = value;
    }

    /**
     * Obtém o valor da propriedade restrictTrailerDropHookToServiceableStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictTrailerDropHookToServiceableStop() {
        return restrictTrailerDropHookToServiceableStop;
    }

    /**
     * Define o valor da propriedade restrictTrailerDropHookToServiceableStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictTrailerDropHookToServiceableStop(Boolean value) {
        this.restrictTrailerDropHookToServiceableStop = value;
    }

    /**
     * Obtém o valor da propriedade routeAliasRouteAlias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteAliasRouteAlias() {
        return routeAliasRouteAlias;
    }

    /**
     * Define o valor da propriedade routeAliasRouteAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteAliasRouteAlias(JAXBElement<String> value) {
        this.routeAliasRouteAlias = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty1EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteCustomProperty1EntityKey() {
        return routeCustomProperty1EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteCustomProperty1EntityKey(JAXBElement<Long> value) {
        this.routeCustomProperty1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteCustomProperty2EntityKey() {
        return routeCustomProperty2EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteCustomProperty2EntityKey(JAXBElement<Long> value) {
        this.routeCustomProperty2EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty3EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteCustomProperty3EntityKey() {
        return routeCustomProperty3EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty3EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteCustomProperty3EntityKey(JAXBElement<Long> value) {
        this.routeCustomProperty3EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty4EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteCustomProperty4EntityKey() {
        return routeCustomProperty4EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty4EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteCustomProperty4EntityKey(JAXBElement<Long> value) {
        this.routeCustomProperty4EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty5EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteCustomProperty5EntityKey() {
        return routeCustomProperty5EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty5EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteCustomProperty5EntityKey(JAXBElement<Long> value) {
        this.routeCustomProperty5EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty6EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteCustomProperty6EntityKey() {
        return routeCustomProperty6EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty6EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteCustomProperty6EntityKey(JAXBElement<Long> value) {
        this.routeCustomProperty6EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade scanOffRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScanOffRequired() {
        return scanOffRequired;
    }

    /**
     * Define o valor da propriedade scanOffRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScanOffRequired(Boolean value) {
        this.scanOffRequired = value;
    }

    /**
     * Obtém o valor da propriedade scanOnRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScanOnRequired() {
        return scanOnRequired;
    }

    /**
     * Define o valor da propriedade scanOnRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScanOnRequired(Boolean value) {
        this.scanOnRequired = value;
    }

    /**
     * Obtém o valor da propriedade sendGPSByDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getSendGPSByDistance() {
        return sendGPSByDistance;
    }

    /**
     * Define o valor da propriedade sendGPSByDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setSendGPSByDistance(JAXBElement<Distance> value) {
        this.sendGPSByDistance = value;
    }

    /**
     * Obtém o valor da propriedade sendGPSByTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSendGPSByTime() {
        return sendGPSByTime;
    }

    /**
     * Define o valor da propriedade sendGPSByTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSendGPSByTime(Duration value) {
        this.sendGPSByTime = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationSearchRadius.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getServiceLocationSearchRadius() {
        return serviceLocationSearchRadius;
    }

    /**
     * Define o valor da propriedade serviceLocationSearchRadius.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setServiceLocationSearchRadius(JAXBElement<Distance> value) {
        this.serviceLocationSearchRadius = value;
    }

    /**
     * Obtém o valor da propriedade showBreakType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowBreakType() {
        return showBreakType;
    }

    /**
     * Define o valor da propriedade showBreakType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowBreakType(Boolean value) {
        this.showBreakType = value;
    }

    /**
     * Obtém o valor da propriedade showConfirmationBoxes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowConfirmationBoxes() {
        return showConfirmationBoxes;
    }

    /**
     * Define o valor da propriedade showConfirmationBoxes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowConfirmationBoxes(Boolean value) {
        this.showConfirmationBoxes = value;
    }

    /**
     * Obtém o valor da propriedade showConsigneeHistory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowConsigneeHistory() {
        return showConsigneeHistory;
    }

    /**
     * Define o valor da propriedade showConsigneeHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowConsigneeHistory(Boolean value) {
        this.showConsigneeHistory = value;
    }

    /**
     * Obtém o valor da propriedade showPlannedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPlannedArrivalTime() {
        return showPlannedArrivalTime;
    }

    /**
     * Define o valor da propriedade showPlannedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPlannedArrivalTime(Boolean value) {
        this.showPlannedArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade showPlannedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPlannedDepartureTime() {
        return showPlannedDepartureTime;
    }

    /**
     * Define o valor da propriedade showPlannedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPlannedDepartureTime(Boolean value) {
        this.showPlannedDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade showPlannedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPlannedServiceTime() {
        return showPlannedServiceTime;
    }

    /**
     * Define o valor da propriedade showPlannedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPlannedServiceTime(Boolean value) {
        this.showPlannedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade showPlannedTimesOnPreview.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPlannedTimesOnPreview() {
        return showPlannedTimesOnPreview;
    }

    /**
     * Define o valor da propriedade showPlannedTimesOnPreview.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPlannedTimesOnPreview(Boolean value) {
        this.showPlannedTimesOnPreview = value;
    }

    /**
     * Obtém o valor da propriedade signatureCaptureRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignatureCaptureRequired() {
        return signatureCaptureRequired;
    }

    /**
     * Define o valor da propriedade signatureCaptureRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignatureCaptureRequired(Boolean value) {
        this.signatureCaptureRequired = value;
    }

    /**
     * Obtém o valor da propriedade tracing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTracing() {
        return tracing;
    }

    /**
     * Define o valor da propriedade tracing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTracing(Boolean value) {
        this.tracing = value;
    }

    /**
     * Obtém o valor da propriedade validateQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidateQuantities() {
        return validateQuantities;
    }

    /**
     * Define o valor da propriedade validateQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateQuantities(Boolean value) {
        this.validateQuantities = value;
    }

    /**
     * Obtém o valor da propriedade verifyByException.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifyByException() {
        return verifyByException;
    }

    /**
     * Define o valor da propriedade verifyByException.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifyByException(Boolean value) {
        this.verifyByException = value;
    }

    /**
     * Obtém o valor da propriedade workerSelectRouteExcludeRoutesAssignedToOtherWorkers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerSelectRouteExcludeRoutesAssignedToOtherWorkers() {
        return workerSelectRouteExcludeRoutesAssignedToOtherWorkers;
    }

    /**
     * Define o valor da propriedade workerSelectRouteExcludeRoutesAssignedToOtherWorkers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerSelectRouteExcludeRoutesAssignedToOtherWorkers(Boolean value) {
        this.workerSelectRouteExcludeRoutesAssignedToOtherWorkers = value;
    }

    /**
     * Obtém o valor da propriedade workerSelectRouteExcludeUnassignedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerSelectRouteExcludeUnassignedRoutes() {
        return workerSelectRouteExcludeUnassignedRoutes;
    }

    /**
     * Define o valor da propriedade workerSelectRouteExcludeUnassignedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerSelectRouteExcludeUnassignedRoutes(Boolean value) {
        this.workerSelectRouteExcludeUnassignedRoutes = value;
    }

    /**
     * Obtém o valor da propriedade workerSelectRouteFromFutureDays.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkerSelectRouteFromFutureDays() {
        return workerSelectRouteFromFutureDays;
    }

    /**
     * Define o valor da propriedade workerSelectRouteFromFutureDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkerSelectRouteFromFutureDays(Integer value) {
        this.workerSelectRouteFromFutureDays = value;
    }

    /**
     * Obtém o valor da propriedade workerSelectRouteIncludeRoutesAssignedToWorkersEquipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerSelectRouteIncludeRoutesAssignedToWorkersEquipment() {
        return workerSelectRouteIncludeRoutesAssignedToWorkersEquipment;
    }

    /**
     * Define o valor da propriedade workerSelectRouteIncludeRoutesAssignedToWorkersEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerSelectRouteIncludeRoutesAssignedToWorkersEquipment(Boolean value) {
        this.workerSelectRouteIncludeRoutesAssignedToWorkersEquipment = value;
    }

}
