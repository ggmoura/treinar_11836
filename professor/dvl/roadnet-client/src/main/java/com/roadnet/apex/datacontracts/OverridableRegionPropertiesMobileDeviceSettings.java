
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.MobileDeviceSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.MobileDeviceSettings"&gt;
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
 *         &lt;element name="ComplianceCachedLoginTimeLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompliancePaperLogModeActivationTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceReenableBTWaitTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAgreement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultWorkerAddedCommentsToInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryImageRequiredWhenSignatureSkipped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DesignateUnplannedBreaksAsPaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisableAppDriveSpeedTrigger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisableAppWhileDriving" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisableGpsTrackingDuringBreaksAndLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayCancelReasonCodeConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayGroupCheckOffConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayOrderAndLineItemDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayQuantityReasonCodesOnSignatureScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayRouteDetailsOnStopList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DoubleScanAlertEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DriverStatsMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
 *         &lt;element name="InMotionSpeedThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
 *         &lt;element name="LineItemCustomProperty1EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperty2EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperty3EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperty4EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperty5EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperty6EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty1EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty2EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty3EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty4EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty5EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationCustomProperty6EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoggingLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumPercentAbovePlannedSize1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumPercentAbovePlannedSize2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumPercentAbovePlannedSize3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumQuantitySize1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumQuantitySize2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumQuantitySize3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NewSignatureRequiredForQuantityChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty1EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty2EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty3EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty4EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty5EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperty6EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PollRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreDeliveryScanRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReasonCodeRequiredQuantityTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequireUpdateEquipmentBeforeDepartingRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictTrailerDropHookToServiceableStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAlias" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty1EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty2EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty3EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty4EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty5EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteCustomProperty6EntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScanOffRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScanOnRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScanningOption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SendGPSByDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SendGPSByTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationSearchRadius" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
 *         &lt;element name="WorkerSelectRouteFromFutureDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "OverridableRegionProperties.MobileDeviceSettings", propOrder = {
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
    "complianceCachedLoginTimeLimit",
    "compliancePaperLogModeActivationTime",
    "complianceReenableBTWaitTime",
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
    "driverStatsMetric",
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
    "loggingLevel",
    "maximumPercentAbovePlannedSize1",
    "maximumPercentAbovePlannedSize2",
    "maximumPercentAbovePlannedSize3",
    "maximumQuantitySize1",
    "maximumQuantitySize2",
    "maximumQuantitySize3",
    "newSignatureRequiredForQuantityChanges",
    "orderCustomProperty1EntityKey",
    "orderCustomProperty2EntityKey",
    "orderCustomProperty3EntityKey",
    "orderCustomProperty4EntityKey",
    "orderCustomProperty5EntityKey",
    "orderCustomProperty6EntityKey",
    "pollRate",
    "preDeliveryScanRequired",
    "reasonCodeRequiredQuantityTypes",
    "requireUpdateEquipmentBeforeDepartingRoute",
    "restrictTrailerDropHookToServiceableStop",
    "routeAlias",
    "routeCustomProperty1EntityKey",
    "routeCustomProperty2EntityKey",
    "routeCustomProperty3EntityKey",
    "routeCustomProperty4EntityKey",
    "routeCustomProperty5EntityKey",
    "routeCustomProperty6EntityKey",
    "scanOffRequired",
    "scanOnRequired",
    "scanningOption",
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
public class OverridableRegionPropertiesMobileDeviceSettings
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
    @XmlElement(name = "ComplianceCachedLoginTimeLimit")
    protected Boolean complianceCachedLoginTimeLimit;
    @XmlElement(name = "CompliancePaperLogModeActivationTime")
    protected Boolean compliancePaperLogModeActivationTime;
    @XmlElement(name = "ComplianceReenableBTWaitTime")
    protected Boolean complianceReenableBTWaitTime;
    @XmlElement(name = "ConsigneeRequired")
    protected Boolean consigneeRequired;
    @XmlElement(name = "CustomerAgreement")
    protected Boolean customerAgreement;
    @XmlElement(name = "DefaultWorkerAddedCommentsToInactive")
    protected Boolean defaultWorkerAddedCommentsToInactive;
    @XmlElement(name = "DeliveryImageRequiredWhenSignatureSkipped")
    protected Boolean deliveryImageRequiredWhenSignatureSkipped;
    @XmlElement(name = "DesignateUnplannedBreaksAsPaid")
    protected Boolean designateUnplannedBreaksAsPaid;
    @XmlElement(name = "DisableAppDriveSpeedTrigger")
    protected Boolean disableAppDriveSpeedTrigger;
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
    @XmlElement(name = "DriverStatsMetric")
    protected Boolean driverStatsMetric;
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
    @XmlElement(name = "InMotionSpeedThreshold")
    protected Boolean inMotionSpeedThreshold;
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
    @XmlElement(name = "LineItemCustomProperty1EntityKey")
    protected Boolean lineItemCustomProperty1EntityKey;
    @XmlElement(name = "LineItemCustomProperty2EntityKey")
    protected Boolean lineItemCustomProperty2EntityKey;
    @XmlElement(name = "LineItemCustomProperty3EntityKey")
    protected Boolean lineItemCustomProperty3EntityKey;
    @XmlElement(name = "LineItemCustomProperty4EntityKey")
    protected Boolean lineItemCustomProperty4EntityKey;
    @XmlElement(name = "LineItemCustomProperty5EntityKey")
    protected Boolean lineItemCustomProperty5EntityKey;
    @XmlElement(name = "LineItemCustomProperty6EntityKey")
    protected Boolean lineItemCustomProperty6EntityKey;
    @XmlElement(name = "LocationCustomProperty1EntityKey")
    protected Boolean locationCustomProperty1EntityKey;
    @XmlElement(name = "LocationCustomProperty2EntityKey")
    protected Boolean locationCustomProperty2EntityKey;
    @XmlElement(name = "LocationCustomProperty3EntityKey")
    protected Boolean locationCustomProperty3EntityKey;
    @XmlElement(name = "LocationCustomProperty4EntityKey")
    protected Boolean locationCustomProperty4EntityKey;
    @XmlElement(name = "LocationCustomProperty5EntityKey")
    protected Boolean locationCustomProperty5EntityKey;
    @XmlElement(name = "LocationCustomProperty6EntityKey")
    protected Boolean locationCustomProperty6EntityKey;
    @XmlElement(name = "LoggingLevel")
    protected Boolean loggingLevel;
    @XmlElement(name = "MaximumPercentAbovePlannedSize1")
    protected Boolean maximumPercentAbovePlannedSize1;
    @XmlElement(name = "MaximumPercentAbovePlannedSize2")
    protected Boolean maximumPercentAbovePlannedSize2;
    @XmlElement(name = "MaximumPercentAbovePlannedSize3")
    protected Boolean maximumPercentAbovePlannedSize3;
    @XmlElement(name = "MaximumQuantitySize1")
    protected Boolean maximumQuantitySize1;
    @XmlElement(name = "MaximumQuantitySize2")
    protected Boolean maximumQuantitySize2;
    @XmlElement(name = "MaximumQuantitySize3")
    protected Boolean maximumQuantitySize3;
    @XmlElement(name = "NewSignatureRequiredForQuantityChanges")
    protected Boolean newSignatureRequiredForQuantityChanges;
    @XmlElement(name = "OrderCustomProperty1EntityKey")
    protected Boolean orderCustomProperty1EntityKey;
    @XmlElement(name = "OrderCustomProperty2EntityKey")
    protected Boolean orderCustomProperty2EntityKey;
    @XmlElement(name = "OrderCustomProperty3EntityKey")
    protected Boolean orderCustomProperty3EntityKey;
    @XmlElement(name = "OrderCustomProperty4EntityKey")
    protected Boolean orderCustomProperty4EntityKey;
    @XmlElement(name = "OrderCustomProperty5EntityKey")
    protected Boolean orderCustomProperty5EntityKey;
    @XmlElement(name = "OrderCustomProperty6EntityKey")
    protected Boolean orderCustomProperty6EntityKey;
    @XmlElement(name = "PollRate")
    protected Boolean pollRate;
    @XmlElement(name = "PreDeliveryScanRequired")
    protected Boolean preDeliveryScanRequired;
    @XmlElement(name = "ReasonCodeRequiredQuantityTypes")
    protected Boolean reasonCodeRequiredQuantityTypes;
    @XmlElement(name = "RequireUpdateEquipmentBeforeDepartingRoute")
    protected Boolean requireUpdateEquipmentBeforeDepartingRoute;
    @XmlElement(name = "RestrictTrailerDropHookToServiceableStop")
    protected Boolean restrictTrailerDropHookToServiceableStop;
    @XmlElement(name = "RouteAlias")
    protected Boolean routeAlias;
    @XmlElement(name = "RouteCustomProperty1EntityKey")
    protected Boolean routeCustomProperty1EntityKey;
    @XmlElement(name = "RouteCustomProperty2EntityKey")
    protected Boolean routeCustomProperty2EntityKey;
    @XmlElement(name = "RouteCustomProperty3EntityKey")
    protected Boolean routeCustomProperty3EntityKey;
    @XmlElement(name = "RouteCustomProperty4EntityKey")
    protected Boolean routeCustomProperty4EntityKey;
    @XmlElement(name = "RouteCustomProperty5EntityKey")
    protected Boolean routeCustomProperty5EntityKey;
    @XmlElement(name = "RouteCustomProperty6EntityKey")
    protected Boolean routeCustomProperty6EntityKey;
    @XmlElement(name = "ScanOffRequired")
    protected Boolean scanOffRequired;
    @XmlElement(name = "ScanOnRequired")
    protected Boolean scanOnRequired;
    @XmlElement(name = "ScanningOption")
    protected Boolean scanningOption;
    @XmlElement(name = "SendGPSByDistance")
    protected Boolean sendGPSByDistance;
    @XmlElement(name = "SendGPSByTime")
    protected Boolean sendGPSByTime;
    @XmlElement(name = "ServiceLocationSearchRadius")
    protected Boolean serviceLocationSearchRadius;
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
    protected Boolean workerSelectRouteFromFutureDays;
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
     * Obtém o valor da propriedade complianceCachedLoginTimeLimit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplianceCachedLoginTimeLimit() {
        return complianceCachedLoginTimeLimit;
    }

    /**
     * Define o valor da propriedade complianceCachedLoginTimeLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplianceCachedLoginTimeLimit(Boolean value) {
        this.complianceCachedLoginTimeLimit = value;
    }

    /**
     * Obtém o valor da propriedade compliancePaperLogModeActivationTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompliancePaperLogModeActivationTime() {
        return compliancePaperLogModeActivationTime;
    }

    /**
     * Define o valor da propriedade compliancePaperLogModeActivationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompliancePaperLogModeActivationTime(Boolean value) {
        this.compliancePaperLogModeActivationTime = value;
    }

    /**
     * Obtém o valor da propriedade complianceReenableBTWaitTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplianceReenableBTWaitTime() {
        return complianceReenableBTWaitTime;
    }

    /**
     * Define o valor da propriedade complianceReenableBTWaitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplianceReenableBTWaitTime(Boolean value) {
        this.complianceReenableBTWaitTime = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerAgreement() {
        return customerAgreement;
    }

    /**
     * Define o valor da propriedade customerAgreement.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerAgreement(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableAppDriveSpeedTrigger() {
        return disableAppDriveSpeedTrigger;
    }

    /**
     * Define o valor da propriedade disableAppDriveSpeedTrigger.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableAppDriveSpeedTrigger(Boolean value) {
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
     * Obtém o valor da propriedade driverStatsMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDriverStatsMetric() {
        return driverStatsMetric;
    }

    /**
     * Define o valor da propriedade driverStatsMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriverStatsMetric(Boolean value) {
        this.driverStatsMetric = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isInMotionSpeedThreshold() {
        return inMotionSpeedThreshold;
    }

    /**
     * Define o valor da propriedade inMotionSpeedThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInMotionSpeedThreshold(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemCustomProperty1EntityKey() {
        return lineItemCustomProperty1EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemCustomProperty1EntityKey(Boolean value) {
        this.lineItemCustomProperty1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperty2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemCustomProperty2EntityKey() {
        return lineItemCustomProperty2EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemCustomProperty2EntityKey(Boolean value) {
        this.lineItemCustomProperty2EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperty3EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemCustomProperty3EntityKey() {
        return lineItemCustomProperty3EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty3EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemCustomProperty3EntityKey(Boolean value) {
        this.lineItemCustomProperty3EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperty4EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemCustomProperty4EntityKey() {
        return lineItemCustomProperty4EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty4EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemCustomProperty4EntityKey(Boolean value) {
        this.lineItemCustomProperty4EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperty5EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemCustomProperty5EntityKey() {
        return lineItemCustomProperty5EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty5EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemCustomProperty5EntityKey(Boolean value) {
        this.lineItemCustomProperty5EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperty6EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemCustomProperty6EntityKey() {
        return lineItemCustomProperty6EntityKey;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperty6EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemCustomProperty6EntityKey(Boolean value) {
        this.lineItemCustomProperty6EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty1EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationCustomProperty1EntityKey() {
        return locationCustomProperty1EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationCustomProperty1EntityKey(Boolean value) {
        this.locationCustomProperty1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationCustomProperty2EntityKey() {
        return locationCustomProperty2EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationCustomProperty2EntityKey(Boolean value) {
        this.locationCustomProperty2EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty3EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationCustomProperty3EntityKey() {
        return locationCustomProperty3EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty3EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationCustomProperty3EntityKey(Boolean value) {
        this.locationCustomProperty3EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty4EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationCustomProperty4EntityKey() {
        return locationCustomProperty4EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty4EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationCustomProperty4EntityKey(Boolean value) {
        this.locationCustomProperty4EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty5EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationCustomProperty5EntityKey() {
        return locationCustomProperty5EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty5EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationCustomProperty5EntityKey(Boolean value) {
        this.locationCustomProperty5EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationCustomProperty6EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationCustomProperty6EntityKey() {
        return locationCustomProperty6EntityKey;
    }

    /**
     * Define o valor da propriedade locationCustomProperty6EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationCustomProperty6EntityKey(Boolean value) {
        this.locationCustomProperty6EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade loggingLevel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoggingLevel() {
        return loggingLevel;
    }

    /**
     * Define o valor da propriedade loggingLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoggingLevel(Boolean value) {
        this.loggingLevel = value;
    }

    /**
     * Obtém o valor da propriedade maximumPercentAbovePlannedSize1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPercentAbovePlannedSize1() {
        return maximumPercentAbovePlannedSize1;
    }

    /**
     * Define o valor da propriedade maximumPercentAbovePlannedSize1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPercentAbovePlannedSize1(Boolean value) {
        this.maximumPercentAbovePlannedSize1 = value;
    }

    /**
     * Obtém o valor da propriedade maximumPercentAbovePlannedSize2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPercentAbovePlannedSize2() {
        return maximumPercentAbovePlannedSize2;
    }

    /**
     * Define o valor da propriedade maximumPercentAbovePlannedSize2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPercentAbovePlannedSize2(Boolean value) {
        this.maximumPercentAbovePlannedSize2 = value;
    }

    /**
     * Obtém o valor da propriedade maximumPercentAbovePlannedSize3.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPercentAbovePlannedSize3() {
        return maximumPercentAbovePlannedSize3;
    }

    /**
     * Define o valor da propriedade maximumPercentAbovePlannedSize3.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPercentAbovePlannedSize3(Boolean value) {
        this.maximumPercentAbovePlannedSize3 = value;
    }

    /**
     * Obtém o valor da propriedade maximumQuantitySize1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumQuantitySize1() {
        return maximumQuantitySize1;
    }

    /**
     * Define o valor da propriedade maximumQuantitySize1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumQuantitySize1(Boolean value) {
        this.maximumQuantitySize1 = value;
    }

    /**
     * Obtém o valor da propriedade maximumQuantitySize2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumQuantitySize2() {
        return maximumQuantitySize2;
    }

    /**
     * Define o valor da propriedade maximumQuantitySize2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumQuantitySize2(Boolean value) {
        this.maximumQuantitySize2 = value;
    }

    /**
     * Obtém o valor da propriedade maximumQuantitySize3.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumQuantitySize3() {
        return maximumQuantitySize3;
    }

    /**
     * Define o valor da propriedade maximumQuantitySize3.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumQuantitySize3(Boolean value) {
        this.maximumQuantitySize3 = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCustomProperty1EntityKey() {
        return orderCustomProperty1EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCustomProperty1EntityKey(Boolean value) {
        this.orderCustomProperty1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperty2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCustomProperty2EntityKey() {
        return orderCustomProperty2EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCustomProperty2EntityKey(Boolean value) {
        this.orderCustomProperty2EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperty3EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCustomProperty3EntityKey() {
        return orderCustomProperty3EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty3EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCustomProperty3EntityKey(Boolean value) {
        this.orderCustomProperty3EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperty4EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCustomProperty4EntityKey() {
        return orderCustomProperty4EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty4EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCustomProperty4EntityKey(Boolean value) {
        this.orderCustomProperty4EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperty5EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCustomProperty5EntityKey() {
        return orderCustomProperty5EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty5EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCustomProperty5EntityKey(Boolean value) {
        this.orderCustomProperty5EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperty6EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCustomProperty6EntityKey() {
        return orderCustomProperty6EntityKey;
    }

    /**
     * Define o valor da propriedade orderCustomProperty6EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCustomProperty6EntityKey(Boolean value) {
        this.orderCustomProperty6EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade pollRate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPollRate() {
        return pollRate;
    }

    /**
     * Define o valor da propriedade pollRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPollRate(Boolean value) {
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
     * Obtém o valor da propriedade reasonCodeRequiredQuantityTypes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReasonCodeRequiredQuantityTypes() {
        return reasonCodeRequiredQuantityTypes;
    }

    /**
     * Define o valor da propriedade reasonCodeRequiredQuantityTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReasonCodeRequiredQuantityTypes(Boolean value) {
        this.reasonCodeRequiredQuantityTypes = value;
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
     * Obtém o valor da propriedade routeAlias.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteAlias() {
        return routeAlias;
    }

    /**
     * Define o valor da propriedade routeAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteAlias(Boolean value) {
        this.routeAlias = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty1EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteCustomProperty1EntityKey() {
        return routeCustomProperty1EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty1EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteCustomProperty1EntityKey(Boolean value) {
        this.routeCustomProperty1EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty2EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteCustomProperty2EntityKey() {
        return routeCustomProperty2EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty2EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteCustomProperty2EntityKey(Boolean value) {
        this.routeCustomProperty2EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty3EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteCustomProperty3EntityKey() {
        return routeCustomProperty3EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty3EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteCustomProperty3EntityKey(Boolean value) {
        this.routeCustomProperty3EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty4EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteCustomProperty4EntityKey() {
        return routeCustomProperty4EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty4EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteCustomProperty4EntityKey(Boolean value) {
        this.routeCustomProperty4EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty5EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteCustomProperty5EntityKey() {
        return routeCustomProperty5EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty5EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteCustomProperty5EntityKey(Boolean value) {
        this.routeCustomProperty5EntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeCustomProperty6EntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteCustomProperty6EntityKey() {
        return routeCustomProperty6EntityKey;
    }

    /**
     * Define o valor da propriedade routeCustomProperty6EntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteCustomProperty6EntityKey(Boolean value) {
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
     * Obtém o valor da propriedade scanningOption.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScanningOption() {
        return scanningOption;
    }

    /**
     * Define o valor da propriedade scanningOption.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScanningOption(Boolean value) {
        this.scanningOption = value;
    }

    /**
     * Obtém o valor da propriedade sendGPSByDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendGPSByDistance() {
        return sendGPSByDistance;
    }

    /**
     * Define o valor da propriedade sendGPSByDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendGPSByDistance(Boolean value) {
        this.sendGPSByDistance = value;
    }

    /**
     * Obtém o valor da propriedade sendGPSByTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendGPSByTime() {
        return sendGPSByTime;
    }

    /**
     * Define o valor da propriedade sendGPSByTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendGPSByTime(Boolean value) {
        this.sendGPSByTime = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationSearchRadius.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationSearchRadius() {
        return serviceLocationSearchRadius;
    }

    /**
     * Define o valor da propriedade serviceLocationSearchRadius.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationSearchRadius(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerSelectRouteFromFutureDays() {
        return workerSelectRouteFromFutureDays;
    }

    /**
     * Define o valor da propriedade workerSelectRouteFromFutureDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerSelectRouteFromFutureDays(Boolean value) {
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
