
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.roadnet.apex.datacontracts.Address;
import com.roadnet.apex.datacontracts.Angle;
import com.roadnet.apex.datacontracts.ArrayOfCell;
import com.roadnet.apex.datacontracts.ArrayOfDailyStopPosition;
import com.roadnet.apex.datacontracts.ArrayOfDomainInstance;
import com.roadnet.apex.datacontracts.ArrayOfEquipmentDescriptor;
import com.roadnet.apex.datacontracts.ArrayOfFormControlResponse;
import com.roadnet.apex.datacontracts.ArrayOfRecurringOrder;
import com.roadnet.apex.datacontracts.ArrayOfRoute;
import com.roadnet.apex.datacontracts.ArrayOfRouteResult;
import com.roadnet.apex.datacontracts.ArrayOfRouteTemplateEquipmentBase;
import com.roadnet.apex.datacontracts.ArrayOfRouteTemplateWorker;
import com.roadnet.apex.datacontracts.ArrayOfStopIdentity;
import com.roadnet.apex.datacontracts.ArrayOfTerritory;
import com.roadnet.apex.datacontracts.ArrayOfWorkerDescriptor;
import com.roadnet.apex.datacontracts.BatteryState;
import com.roadnet.apex.datacontracts.CellSet;
import com.roadnet.apex.datacontracts.Color;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Depot;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.DomainInstance;
import com.roadnet.apex.datacontracts.EntityExportTemplate;
import com.roadnet.apex.datacontracts.EntitySendOrderTemplate;
import com.roadnet.apex.datacontracts.EquipmentDescriptor;
import com.roadnet.apex.datacontracts.FuelEconomy;
import com.roadnet.apex.datacontracts.GroupStopIdentity;
import com.roadnet.apex.datacontracts.LayoverDeparture;
import com.roadnet.apex.datacontracts.Length;
import com.roadnet.apex.datacontracts.LiquidVolume;
import com.roadnet.apex.datacontracts.PropertySendOrderTemplate;
import com.roadnet.apex.datacontracts.QualityPairedDateTime;
import com.roadnet.apex.datacontracts.QualityPairedDistance;
import com.roadnet.apex.datacontracts.Quantities;
import com.roadnet.apex.datacontracts.RoutePropertyOptions;
import com.roadnet.apex.datacontracts.RouteResult;
import com.roadnet.apex.datacontracts.RouteTemplate;
import com.roadnet.apex.datacontracts.SaveErrorInfo;
import com.roadnet.apex.datacontracts.SaveNonServiceableStopArgs;
import com.roadnet.apex.datacontracts.SaveOptions;
import com.roadnet.apex.datacontracts.Speed;
import com.roadnet.apex.datacontracts.StopIdentity;
import com.roadnet.apex.datacontracts.StrategicRoutingSession;
import com.roadnet.apex.datacontracts.Temperature;
import com.roadnet.apex.datacontracts.TransferErrorCode;
import com.roadnet.apex.datacontracts.TransmissionGearState;
import com.roadnet.apex.datacontracts.UserSettings;
import com.roadnet.apex.datacontracts.UserSettingsPropertyOptions;
import com.roadnet.apex.datacontracts.Weight;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.SimpleExpressionBase;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OnStopPlacementInfoOnStopPlacementStopType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnStopPlacementInfo.OnStopPlacementStopType");
    private final static QName _SendOrdersPropertyResultErrorType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendOrdersPropertyResult.ErrorType");
    private final static QName _SaveRouteTemplateFromRouteResultOperationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveRouteTemplateFromRouteResult.OperationResult");
    private final static QName _SendSmsResultStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendSmsResult.Status");
    private final static QName _SuggestRouteTemplateCandidatesEntityType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SuggestRouteTemplateCandidates.EntityType");
    private final static QName _RouteRetrievalType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteRetrievalType");
    private final static QName _FlashStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "FlashStatus");
    private final static QName _LampStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LampStatus");
    private final static QName _NonServiceableStopType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NonServiceableStopType");
    private final static QName _NonServiceableStopPlacementMethodType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NonServiceableStopPlacementMethodType");
    private final static QName _ActiveTroubleCodesUpdateActionTroubleCodeState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ActiveTroubleCodesUpdateAction.TroubleCodeState");
    private final static QName _MoveRecurringOrderOptionsPlacementMethodType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MoveRecurringOrderOptions.PlacementMethodType");
    private final static QName _NavClientRecalculationReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientRecalculationReason");
    private final static QName _OnTerritoryPlacementPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnTerritoryPlacement.Position");
    private final static QName _RecurringOrderPlacementPlacementMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RecurringOrderPlacement.PlacementMethod");
    private final static QName _SaveStopFromPointArgsStopCreationMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveStopFromPointArgs.StopCreationMethod");
    private final static QName _HarshDrivingType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "HarshDrivingType");
    private final static QName _AutomaticPlacementAutomaticPlacementGoal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AutomaticPlacement.AutomaticPlacementGoal");
    private final static QName _AutomaticPlacementIgnoreFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AutomaticPlacement.IgnoreFlags");
    private final static QName _OnRoutePlacementPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnRoutePlacement.Position");
    private final static QName _OnRouteTemplatePlacementPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnRouteTemplatePlacement.Position");
    private final static QName _OnStopPlacementPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnStopPlacement.Position");
    private final static QName _OnStopTemplatePlacementPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnStopTemplatePlacement.Position");
    private final static QName _SaveRouteTemplateFromRouteArgsUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveRouteTemplateFromRouteArgs.UpdateAction");
    private final static QName _BuildSameDayMatricesOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "BuildSameDayMatricesOptions");
    private final static QName _NavClientActivationCodeRefreshStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientActivationCodeRefreshStatus");
    private final static QName _NavClientActivationCodeRefreshStatusErrorType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientActivationCodeRefreshStatus.ErrorType");
    private final static QName _NavDeviceStatusDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavDeviceStatusDto");
    private final static QName _SaveRoutePlanOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveRoutePlanOptions");
    private final static QName _DayShiftOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DayShiftOptions");
    private final static QName _SaveRoutePlanRouteArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveRoutePlanRouteArgs");
    private final static QName _ManipulationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ManipulationResult");
    private final static QName _ArrayOfManipulationResultManipulationError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfManipulationResult.ManipulationError");
    private final static QName _ManipulationResultManipulationError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ManipulationResult.ManipulationError");
    private final static QName _RecurringOrderManipulationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RecurringOrderManipulationResult");
    private final static QName _MoveUnassignedOrderGroupsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MoveUnassignedOrderGroupsOptions");
    private final static QName _SaveRoutePlanStopArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveRoutePlanStopArgs");
    private final static QName _PreviewRouteOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PreviewRouteOptions");
    private final static QName _UnplannedOriginParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UnplannedOriginParameters");
    private final static QName _CopyRouteToSessionOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CopyRouteToSessionOptions");
    private final static QName _RetrieveRoutesOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RetrieveRoutesOptions");
    private final static QName _ServiceConfirmationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceConfirmationInfo");
    private final static QName _ArrayOfServiceConfirmationActionOrderIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfServiceConfirmationAction.OrderIdentity");
    private final static QName _ServiceConfirmationActionOrderIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceConfirmationAction.OrderIdentity");
    private final static QName _VehicleBusComponent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleBusComponent");
    private final static QName _CustomFormResponseInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CustomFormResponseInfo");
    private final static QName _DailyDistribution_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DailyDistribution");
    private final static QName _LocationCommentParam_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LocationCommentParam");
    private final static QName _MoveRecurringOrderOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MoveRecurringOrderOptions");
    private final static QName _RecurringOrderPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RecurringOrderPlacement");
    private final static QName _OnManualLoadDistributionPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnManualLoadDistributionPlacement");
    private final static QName _ArrayOfDailyDistribution_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfDailyDistribution");
    private final static QName _OnSwitchServicePatternPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnSwitchServicePatternPlacement");
    private final static QName _CreateRouteFromPointsArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CreateRouteFromPointsArgs");
    private final static QName _ArrayOfSaveStopFromPointArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfSaveStopFromPointArgs");
    private final static QName _SaveStopFromPointArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveStopFromPointArgs");
    private final static QName _ScheduleEquipmentMaintenanceArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ScheduleEquipmentMaintenanceArgs");
    private final static QName _SuggestLayoverResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SuggestLayoverResult");
    private final static QName _ArrayOfSuggestLayoverResultSuggestion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfSuggestLayoverResult.Suggestion");
    private final static QName _SuggestLayoverResultSuggestion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SuggestLayoverResult.Suggestion");
    private final static QName _UpdateRouteFromPointsArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UpdateRouteFromPointsArgs");
    private final static QName _OnStopPlacementInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnStopPlacementInfo");
    private final static QName _CreateCellsFromRoutesOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CreateCellsFromRoutesOptions");
    private final static QName _SendSmsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendSmsResult");
    private final static QName _AutomaticPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AutomaticPlacement");
    private final static QName _OnTerritoryAutomaticPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnTerritoryAutomaticPlacement");
    private final static QName _OnRouteAutomaticPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnRouteAutomaticPlacement");
    private final static QName _DrivingDirectionsStep_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DrivingDirectionsStep");
    private final static QName _LineItemActuals_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LineItemActuals");
    private final static QName _LoadRouteOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LoadRouteOptions");
    private final static QName _RouteDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteDescriptor");
    private final static QName _MobileDeviceAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MobileDeviceAction");
    private final static QName _RemoveStopsAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RemoveStopsAction");
    private final static QName _DiagnosticTroubleCodeUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DiagnosticTroubleCodeUpdateAction");
    private final static QName _ActiveTroubleCodesUpdateActionDiagnosticTroubleCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ActiveTroubleCodesUpdateAction.DiagnosticTroubleCode");
    private final static QName _ActiveTroubleCodesUpdateActionJ1587TroubleCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ActiveTroubleCodesUpdateAction.J1587TroubleCode");
    private final static QName _ActiveTroubleCodesUpdateActionJ1939TroubleCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ActiveTroubleCodesUpdateAction.J1939TroubleCode");
    private final static QName _ActiveTroubleCodesUpdateActionOBD2TroubleCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ActiveTroubleCodesUpdateAction.OBD2TroubleCode");
    private final static QName _LogOffAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LogOffAction");
    private final static QName _LogOnAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LogOnAction");
    private final static QName _ReportClientApplicationInfoAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ReportClientApplicationInfoAction");
    private final static QName _GroupStopBasedAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "GroupStopBasedAction");
    private final static QName _ArriveGroupStopAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArriveGroupStopAction");
    private final static QName _DepartGroupStopAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DepartGroupStopAction");
    private final static QName _RouteOptimizationResponseAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteOptimizationResponseAction");
    private final static QName _SendCompressedDataSetAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendCompressedDataSetAction");
    private final static QName _StationaryEndAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StationaryEndAction");
    private final static QName _StationaryStartAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StationaryStartAction");
    private final static QName _EquipmentDropHookAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EquipmentDropHookAction");
    private final static QName _TelematicsDeviceCommsStatusUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TelematicsDeviceCommsStatusUpdateAction");
    private final static QName _TelematicsDeviceIgnitionKillSwitchResponseAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TelematicsDeviceIgnitionKillSwitchResponseAction");
    private final static QName _TelematicsDeviceOutputChangeResponseAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TelematicsDeviceOutputChangeResponseAction");
    private final static QName _ServiceConfirmationAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceConfirmationAction");
    private final static QName _ArrayOfServiceConfirmationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfServiceConfirmationInfo");
    private final static QName _VehicleBusInfoUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleBusInfoUpdateAction");
    private final static QName _ArrayOfVehicleBusComponent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfVehicleBusComponent");
    private final static QName _ActiveTroubleCodesUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ActiveTroubleCodesUpdateAction");
    private final static QName _ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfActiveTroubleCodesUpdateAction.DiagnosticTroubleCode");
    private final static QName _AddNonServiceableStopAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AddNonServiceableStopAction");
    private final static QName _AssociateStationaryEventAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AssociateStationaryEventAction");
    private final static QName _LineItemAddOrUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LineItemAddOrUpdateAction");
    private final static QName _LocationCommentsDeleteAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LocationCommentsDeleteAction");
    private final static QName _LocationCommentsSaveAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LocationCommentsSaveAction");
    private final static QName _ArrayOfLocationCommentParam_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfLocationCommentParam");
    private final static QName _NavClientAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientAction");
    private final static QName _NavClientRoutePathDeviationAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientRoutePathDeviationAction");
    private final static QName _NavClientApplicationStateChangedAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientApplicationStateChangedAction");
    private final static QName _NavClientDestinationArrivalAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientDestinationArrivalAction");
    private final static QName _NavClientRecalculationAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientRecalculationAction");
    private final static QName _NavClientSpeedAlertAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientSpeedAlertAction");
    private final static QName _NavClientStartRouteAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientStartRouteAction");
    private final static QName _NavClientWorkerChangedAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientWorkerChangedAction");
    private final static QName _TelematicsDeviceInputChangedAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TelematicsDeviceInputChangedAction");
    private final static QName _PanicButtonTriggeredAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PanicButtonTriggeredAction");
    private final static QName _WorkerStatusUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "WorkerStatusUpdateAction");
    private final static QName _CustomFormResponseAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CustomFormResponseAction");
    private final static QName _ArrayOfCustomFormResponseInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfCustomFormResponseInfo");
    private final static QName _LineItemUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LineItemUpdateAction");
    private final static QName _OrderUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OrderUpdateAction");
    private final static QName _StopBasedActionDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopBasedActionDto");
    private final static QName _DetailItemVerificationAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DetailItemVerificationAction");
    private final static QName _ArrayOfDetailItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfDetailItem");
    private final static QName _DetailItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DetailItem");
    private final static QName _DeliveryDetailsUpdateActionOrderDetailItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeliveryDetailsUpdateAction.OrderDetailItem");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeliveryDetailsUpdateAction.DetailItemQuantities");
    private final static QName _StopManipulationAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopManipulationAction");
    private final static QName _Placement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Placement");
    private final static QName _OnStopPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnStopPlacement");
    private final static QName _OnRoutePlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnRoutePlacement");
    private final static QName _OnDeviceStopPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnDeviceStopPlacement");
    private final static QName _OnRouteByIndicesPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnRouteByIndicesPlacement");
    private final static QName _ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfOnRouteByIndicesPlacement.TaskTypeToIndex");
    private final static QName _OnRouteByIndicesPlacementTaskTypeToIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnRouteByIndicesPlacement.TaskTypeToIndex");
    private final static QName _DepartStopAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DepartStopAction");
    private final static QName _GeocodeStopAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "GeocodeStopAction");
    private final static QName _ReserviceStopAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ReserviceStopAction");
    private final static QName _ServiceStopAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceStopAction");
    private final static QName _ArriveStopAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArriveStopAction");
    private final static QName _StopSignatureAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopSignatureAction");
    private final static QName _IgnitionStateChangedAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "IgnitionStateChangedAction");
    private final static QName _VehicleStatusUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleStatusUpdateAction");
    private final static QName _TelematicsDeviceDiagnosticsUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TelematicsDeviceDiagnosticsUpdateAction");
    private final static QName _HarshDrivingAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "HarshDrivingAction");
    private final static QName _AddServiceableStopAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AddServiceableStopAction");
    private final static QName _EndBreakAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EndBreakAction");
    private final static QName _EndWorkAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EndWorkAction");
    private final static QName _ResequencePendingStopsAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ResequencePendingStopsAction");
    private final static QName _StartBreakAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StartBreakAction");
    private final static QName _StartWorkAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StartWorkAction");
    private final static QName _BatteryDiagnosticsUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "BatteryDiagnosticsUpdateAction");
    private final static QName _PositionUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PositionUpdateAction");
    private final static QName _UpdateNonServiceableStopAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UpdateNonServiceableStopAction");
    private final static QName _ArriveDestinationAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArriveDestinationAction");
    private final static QName _RemoveStopOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RemoveStopOptions");
    private final static QName _CancelStopsAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CancelStopsAction");
    private final static QName _CompleteRouteAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CompleteRouteAction");
    private final static QName _DepartOriginAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DepartOriginAction");
    private final static QName _ResequenceStopAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ResequenceStopAction");
    private final static QName _SendNoteAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendNoteAction");
    private final static QName _SendNoteActionRouteNoteMessageArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendNoteAction.RouteNoteMessageArgs");
    private final static QName _SendNoteActionStopNoteMessageArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendNoteAction.StopNoteMessageArgs");
    private final static QName _SendNoteActionOrderNoteMessageArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendNoteAction.OrderNoteMessageArgs");
    private final static QName _SendNoteActionLineItemNoteMessageArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendNoteAction.LineItemNoteMessageArgs");
    private final static QName _StartRouteAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StartRouteAction");
    private final static QName _DeliveryDetailsUpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeliveryDetailsUpdateAction");
    private final static QName _OptimizeResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OptimizeResult");
    private final static QName _OrderActuals_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OrderActuals");
    private final static QName _ArrayOfLineItemActuals_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfLineItemActuals");
    private final static QName _OnTerritoryPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnTerritoryPlacement");
    private final static QName _OnTerritoryAndRoutesPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnTerritoryAndRoutesPlacement");
    private final static QName _RemoveOrderOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RemoveOrderOptions");
    private final static QName _RouteActuals_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteActuals");
    private final static QName _ArrayOfStopActuals_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfStopActuals");
    private final static QName _StopActuals_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopActuals");
    private final static QName _ServiceableStopActuals_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceableStopActuals");
    private final static QName _ArrayOfOrderActuals_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfOrderActuals");
    private final static QName _ServiceTimeAdjustmentOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceTimeAdjustmentOptions");
    private final static QName _ServiceTimeAdjustToConstantOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceTimeAdjustToConstantOptions");
    private final static QName _ServiceTimeAdjustByPercentageOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceTimeAdjustByPercentageOptions");
    private final static QName _ServiceTimeRemoveAdjustmentOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceTimeRemoveAdjustmentOptions");
    private final static QName _SuggestRouteTemplateResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SuggestRouteTemplateResult");
    private final static QName _ArrayOfSuggestRouteTemplateResultSuggestion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfSuggestRouteTemplateResult.Suggestion");
    private final static QName _SuggestRouteTemplateResultSuggestion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SuggestRouteTemplateResult.Suggestion");
    private final static QName _TemplatePlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TemplatePlacement");
    private final static QName _OnStopTemplatePlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnStopTemplatePlacement");
    private final static QName _OnRouteTemplatePlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnRouteTemplatePlacement");
    private final static QName _ShortestPathCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ShortestPathCriteria");
    private final static QName _DeliveryDetailsUpdateActionLineItemDetailItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeliveryDetailsUpdateAction.LineItemDetailItem");
    private final static QName _ArrayOfSaveRoutePlanStopArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfSaveRoutePlanStopArgs");
    private final static QName _UndeleteEntityOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UndeleteEntityOptions");
    private final static QName _ArrayOfUndeleteEntityResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfUndeleteEntityResult");
    private final static QName _UndeleteEntityResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UndeleteEntityResult");
    private final static QName _ResumeDataFeedOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ResumeDataFeedOptions");
    private final static QName _ResumeDataFeedResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ResumeDataFeedResult");
    private final static QName _UpdateUserSettingsParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UpdateUserSettingsParameters");
    private final static QName _UpdateRouteTenderOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UpdateRouteTenderOptions");
    private final static QName _MoveToRouteParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MoveToRouteParameters");
    private final static QName _ArrayOfRouteStopInstances_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfRouteStopInstances");
    private final static QName _RouteStopInstances_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteStopInstances");
    private final static QName _ArrayOfRouteStopTaskInstances_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfRouteStopTaskInstances");
    private final static QName _RouteStopTaskInstances_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteStopTaskInstances");
    private final static QName _ArrayOfManipulationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfManipulationResult");
    private final static QName _SaveRouteResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveRouteResult");
    private final static QName _ArrayOfSaveRouteResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfSaveRouteResult");
    private final static QName _SuggestLayoverOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SuggestLayoverOptions");
    private final static QName _CreateCellsFromRoutesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CreateCellsFromRoutesResult");
    private final static QName _ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfCreateCellsFromRoutesResult.CreateCellsFromRoutesError");
    private final static QName _CreateCellsFromRoutesResultCreateCellsFromRoutesError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CreateCellsFromRoutesResult.CreateCellsFromRoutesError");
    private final static QName _CalculateRoutesArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CalculateRoutesArgs");
    private final static QName _ArrayOfCalculateRouteResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfCalculateRouteResult");
    private final static QName _CalculateRouteResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CalculateRouteResult");
    private final static QName _AutoCompleteRouteOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AutoCompleteRouteOptions");
    private final static QName _AutoCompleteRouteStopOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AutoCompleteRouteStopOptions");
    private final static QName _SaveOrderOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveOrderOptions");
    private final static QName _SaveTerritoryResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveTerritoryResult");
    private final static QName _ArrayOfSaveTerritoryResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfSaveTerritoryResult");
    private final static QName _ExportPlanningSolutionJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ExportPlanningSolutionJobParameters");
    private final static QName _ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ExportPlanningSolutionJobParameters.ExportPlanningSolutionWeeksOutputFormat");
    private final static QName _ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ExportPlanningSolutionJobParameters.ExportPlanningSolutionDaysOutputFormat");
    private final static QName _ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ExportPlanningSolutionJobParameters.ExportPlanningSolutionTimeZoneOption");
    private final static QName _ExportPlanningSolutionJobParametersStopNumberFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ExportPlanningSolutionJobParameters.StopNumberFormat");
    private final static QName _ExportPlanningSolutionJobParametersVariableServiceTimeFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ExportPlanningSolutionJobParameters.VariableServiceTimeFormat");
    private final static QName _ArrayOfScheduleEquipmentMaintenanceArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfScheduleEquipmentMaintenanceArgs");
    private final static QName _MoveStrategicStopsParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MoveStrategicStopsParameters");
    private final static QName _SwitchRecurringOrderServicePatternParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SwitchRecurringOrderServicePatternParameters");
    private final static QName _LockOrderOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LockOrderOptions");
    private final static QName _LockOrderResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LockOrderResults");
    private final static QName _ArrayOfLockOrderResultsLockOrderFailure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfLockOrderResults.LockOrderFailure");
    private final static QName _LockOrderResultsLockOrderFailure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LockOrderResults.LockOrderFailure");
    private final static QName _LockOrderResultsLockOrderFailureLockOrderErrorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LockOrderResults.LockOrderFailure.LockOrderErrorCode");
    private final static QName _LockOrderResultsLockOrdersForStopFailure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LockOrderResults.LockOrdersForStopFailure");
    private final static QName _LockOrderResultsLockOrdersForRouteFailure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LockOrderResults.LockOrdersForRouteFailure");
    private final static QName _ArrayOfMobileDeviceAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfMobileDeviceAction");
    private final static QName _ArrayOfSendSmsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfSendSmsResult");
    private final static QName _ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo");
    private final static QName _UpgradeRoadnetTelematicsDeviceConfigurationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UpgradeRoadnetTelematicsDeviceConfigurationInfo");
    private final static QName _ArrayOfNavDeviceStatusDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfNavDeviceStatusDto");
    private final static QName _SaveRouteTemplateArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveRouteTemplateArgs");
    private final static QName _ArrayOfSaveRouteTemplateArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfSaveRouteTemplateArgs");
    private final static QName _SaveMidRouteDepotStopTemplateArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveMidRouteDepotStopTemplateArgs");
    private final static QName _SaveLayoverStopTemplateArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveLayoverStopTemplateArgs");
    private final static QName _SuggestLayoverTemplateOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SuggestLayoverTemplateOptions");
    private final static QName _SuggestRouteTemplateCandidates_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SuggestRouteTemplateCandidates");
    private final static QName _SaveRouteTemplateFromRouteArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveRouteTemplateFromRouteArgs");
    private final static QName _ArrayOfSaveRouteTemplateFromRouteResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfSaveRouteTemplateFromRouteResult");
    private final static QName _SaveRouteTemplateFromRouteResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveRouteTemplateFromRouteResult");
    private final static QName _SendOrdersParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendOrdersParameters");
    private final static QName _SendOrdersParametersStopNumberFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendOrdersParameters.StopNumberFormat");
    private final static QName _SendOrdersParametersVariableServiceTimeFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendOrdersParameters.VariableServiceTimeFormat");
    private final static QName _SendOrdersParametersSendOrdersTimeZoneOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendOrdersParameters.SendOrdersTimeZoneOption");
    private final static QName _SendOrdersResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendOrdersResults");
    private final static QName _ArrayOfSendOrdersPropertyResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrayOfSendOrdersPropertyResult");
    private final static QName _SendOrdersPropertyResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendOrdersPropertyResult");
    private final static QName _GenerateRouteTravelPathOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "GenerateRouteTravelPathOptions");
    private final static QName _GenerateRoutePathOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "GenerateRoutePathOptions");
    private final static QName _GenerateRouteTemplateTravelPathOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "GenerateRouteTemplateTravelPathOptions");
    private final static QName _AdvancedLoggingOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AdvancedLoggingOptions");
    private final static QName _OptimizingGoal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "OptimizingGoal");
    private final static QName _OptimizeOptionsIgnoreFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "OptimizeOptions.IgnoreFlags");
    private final static QName _SequencingGoal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "SequencingGoal");
    private final static QName _SequenceOptionsIgnoreFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "SequenceOptions.IgnoreFlags");
    private final static QName _OptimizeOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "OptimizeOptions");
    private final static QName _SequenceOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "SequenceOptions");
    private final static QName _ArrayOfRouteRetrievalOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "ArrayOfRouteRetrievalOptions");
    private final static QName _RouteRetrievalOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "RouteRetrievalOptions");
    private final static QName _AssociateStationaryResourceEventWithStopsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "AssociateStationaryResourceEventWithStopsOptions");
    private final static QName _AddStopsUsingStationaryResourceEventOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "AddStopsUsingStationaryResourceEventOptions");
    private final static QName _MarkStopAsUnserviceableOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "MarkStopAsUnserviceableOptions");
    private final static QName _DeleteRoutesJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteRoutes", "DeleteRoutesJobParameters");
    private final static QName _CalculateOptimalRouteMetricsParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.CalculateOptimal", "CalculateOptimalRouteMetricsParameters");
    private final static QName _MoveUnassignedOrdersToSessionJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.MoveUnassignedOrdersToSession", "MoveUnassignedOrdersToSessionJobParameters");
    private final static QName _DeleteTerritoriesJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteTerritories", "DeleteTerritoriesJobParameters");
    private final static QName _UpdateDailyRoutesJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.UpdateDailyRoutes", "UpdateDailyRoutesJobParameters");
    private final static QName _ShiftDaysJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ShiftDays", "ShiftDaysJobParameters");
    private final static QName _TransferRecurringOrdersParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", "TransferRecurringOrdersParameters");
    private final static QName _DeleteStrategicRoutingSessionJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteStrategicRoutingSession", "DeleteStrategicRoutingSessionJobParameters");
    private final static QName _SaveSessionAsJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", "SaveSessionAsJobParameters");
    private final static QName _PrepareForNextDayJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.PrepareForNextDay", "PrepareForNextDayJobParameters");
    private final static QName _UpdateStrategicPlanningSessionCacheJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Routing", "UpdateStrategicPlanningSessionCacheJobParameters");
    private final static QName _ExportCustomFormsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Import", "ExportCustomFormsOptions");
    private final static QName _ExportCustomFormsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Import", "ExportCustomFormsResult");
    private final static QName _SuggestRouteParametersSuggestIgnoreFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "SuggestRouteParameters.SuggestIgnoreFlags");
    private final static QName _SuggestRouteParametersSuggestRouteGoal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "SuggestRouteParameters.SuggestRouteGoal");
    private final static QName _SuggestRouteParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "SuggestRouteParameters");
    private final static QName _SuggestRouteResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "SuggestRouteResult");
    private final static QName _ArrayOfSuggestRouteResultSuggestion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "ArrayOfSuggestRouteResult.Suggestion");
    private final static QName _SuggestRouteResultSuggestion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "SuggestRouteResult.Suggestion");
    private final static QName _UpdateServiceTimeParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", "UpdateServiceTimeParameters");
    private final static QName _UpdateServiceTimeParametersServiceItemType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", "UpdateServiceTimeParameters.ServiceItemType");
    private final static QName _ClientDiagnosticsInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", "ClientDiagnosticsInformation");
    private final static QName _LogFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", "LogFile");
    private final static QName _ArrayOfClientDiagnosticsInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", "ArrayOfClientDiagnosticsInformation");
    private final static QName _LogFileFileData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", "FileData");
    private final static QName _LogFileFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", "FileName");
    private final static QName _LogFileUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", "Username");
    private final static QName _SuggestRouteResultSuggestionImpact_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "Impact");
    private final static QName _SuggestRouteResultSuggestionPlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "Placement");
    private final static QName _SendOrdersPropertyResultErrorTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ErrorType_Type");
    private final static QName _SendOrdersPropertyResultProperty_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Property");
    private final static QName _SaveRouteTemplateFromRouteResultError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Error");
    private final static QName _SaveRouteTemplateFromRouteResultOperationResultResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OperationResult_Result");
    private final static QName _SaveRouteTemplateFromRouteResultRouteTemplate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteTemplate");
    private final static QName _UpgradeRoadnetTelematicsDeviceConfigurationInfoConfigVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ConfigVersion");
    private final static QName _UpgradeRoadnetTelematicsDeviceConfigurationInfoFirmwareVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "FirmwareVersion");
    private final static QName _UpgradeRoadnetTelematicsDeviceConfigurationInfoScriptVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ScriptVersion");
    private final static QName _UpgradeRoadnetTelematicsDeviceConfigurationInfoVehicleDatabaseVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleDatabaseVersion");
    private final static QName _UpgradeRoadnetTelematicsDeviceConfigurationInfoVehicleInterfaceFirmwareVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleInterfaceFirmwareVersion");
    private final static QName _LockOrderResultsLockOrdersForRouteFailureRouteInstance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteInstance");
    private final static QName _LockOrderResultsLockOrdersForStopFailureStopEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopEntityKey");
    private final static QName _CreateCellsFromRoutesResultCreateCellsFromRoutesErrorEntityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EntityName");
    private final static QName _CreateCellsFromRoutesResultCreateCellsFromRoutesErrorIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Identifier");
    private final static QName _RouteStopTaskInstancesOwningRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OwningRoute");
    private final static QName _RouteStopTaskInstancesTaskEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TaskEntityKeys");
    private final static QName _RouteStopInstancesStopEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopEntityKeys");
    private final static QName _DetailItemOrderCancelReasonCodeEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OrderCancelReasonCodeEntityKey");
    private final static QName _DeliveryDetailsUpdateActionLineItemDetailItemOrderIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OrderIdentifier");
    private final static QName _DeliveryDetailsUpdateActionLineItemDetailItemQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Quantities");
    private final static QName _ShortestPathCriteriaEndPoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EndPoint");
    private final static QName _ShortestPathCriteriaStartPoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StartPoint");
    private final static QName _TemplatePlacementRouteTemplateInstance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteTemplateInstance");
    private final static QName _OnRouteTemplatePlacementPositionPlace_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Position_Place");
    private final static QName _SuggestRouteTemplateResultSuggestionDeltaDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeltaDistance");
    private final static QName _StopActualsDistanceTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DistanceTo");
    private final static QName _ServiceableStopActualsOrders_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Orders");
    private final static QName _PlacementTargetServicePatternEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TargetServicePatternEntityKey");
    private final static QName _OnTerritoryAndRoutesPlacementRoutePlacements_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RoutePlacements");
    private final static QName _OnTerritoryAndRoutesPlacementServicePatternEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServicePatternEntityKey");
    private final static QName _OnTerritoryPlacementPositionPositionOnRoutes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Position_PositionOnRoutes");
    private final static QName _OrderActualsDeliveryDamagedQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeliveryDamagedQuantity");
    private final static QName _OrderActualsDeliveryOverQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeliveryOverQuantity");
    private final static QName _OrderActualsDeliveryQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeliveryQuantity");
    private final static QName _OrderActualsDeliveryShortQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeliveryShortQuantity");
    private final static QName _OrderActualsLineItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LineItems");
    private final static QName _OrderActualsPickupDamagedQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PickupDamagedQuantity");
    private final static QName _OrderActualsPickupOverQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PickupOverQuantity");
    private final static QName _OrderActualsPickupQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PickupQuantity");
    private final static QName _OrderActualsPickupShortQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PickupShortQuantity");
    private final static QName _MobileDeviceActionDataCommunicationsTypeDataCommunicationsType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DataCommunicationsType_DataCommunicationsType");
    private final static QName _MobileDeviceActionMessageId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MessageId");
    private final static QName _DeliveryDetailsUpdateActionDetailItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DetailItems");
    private final static QName _DeliveryDetailsUpdateActionStopKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopKey");
    private final static QName _StartRouteActionStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StartTime");
    private final static QName _SendNoteActionRouteNoteMessageArgsImage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Image");
    private final static QName _SendNoteActionRouteNoteMessageArgsMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Message");
    private final static QName _SendNoteActionMessageArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MessageArgs");
    private final static QName _DepartOriginActionDepartureTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DepartureTime");
    private final static QName _CompleteRouteActionCompletionTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CompletionTime");
    private final static QName _CompleteRouteActionDistanceToDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DistanceToDestination");
    private final static QName _CancelStopsActionCancelTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CancelTime");
    private final static QName _CancelStopsActionStopKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopKeys");
    private final static QName _ArriveDestinationActionArrivalTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ArrivalTime");
    private final static QName _UpdateNonServiceableStopActionNonServiceableStopArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NonServiceableStopArgs");
    private final static QName _UpdateNonServiceableStopActionNonServiceableStopPlacementMethodTypePlacementMethodType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NonServiceableStopPlacementMethodType_PlacementMethodType");
    private final static QName _UpdateNonServiceableStopActionNonServiceableStopTypeStopType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NonServiceableStopType_StopType");
    private final static QName _UpdateNonServiceableStopActionRelatedStopKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RelatedStopKey");
    private final static QName _UpdateNonServiceableStopActionStopReasonCodeEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopReasonCodeEntityKey");
    private final static QName _PositionUpdateActionCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Coordinate");
    private final static QName _PositionUpdateActionGPSSpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "GPSSpeed");
    private final static QName _PositionUpdateActionHeading_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Heading");
    private final static QName _PositionUpdateActionHorizontalDilutionOfPrecision_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "HorizontalDilutionOfPrecision");
    private final static QName _PositionUpdateActionNumberOfSatellitesUsed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NumberOfSatellitesUsed");
    private final static QName _PositionUpdateActionOBDSpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OBDSpeed");
    private final static QName _BatteryDiagnosticsUpdateActionBatteryState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "BatteryState");
    private final static QName _StartWorkActionOriginCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OriginCoordinate");
    private final static QName _StartWorkActionOriginDepotEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OriginDepotEntityKey");
    private final static QName _ResequencePendingStopsActionStops_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Stops");
    private final static QName _EndWorkActionDestinationDepotEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DestinationDepotEntityKey");
    private final static QName _EndWorkActionEndTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EndTime");
    private final static QName _HarshDrivingActionForwardGForce_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ForwardGForce");
    private final static QName _HarshDrivingActionHarshDrivingTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "HarshDrivingType_Type");
    private final static QName _HarshDrivingActionLateralGForce_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LateralGForce");
    private final static QName _HarshDrivingActionVerticalGForce_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VerticalGForce");
    private final static QName _TelematicsDeviceDiagnosticsUpdateActionApplicationIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ApplicationIdentifier");
    private final static QName _TelematicsDeviceDiagnosticsUpdateActionDeviceFirmwareVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeviceFirmwareVersion");
    private final static QName _TelematicsDeviceDiagnosticsUpdateActionDevicePhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DevicePhoneNumber");
    private final static QName _TelematicsDeviceDiagnosticsUpdateActionSatelliteModemIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SatelliteModemIdentifier");
    private final static QName _TelematicsDeviceDiagnosticsUpdateActionVehicleIdentificationNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleIdentificationNumber");
    private final static QName _TelematicsDeviceDiagnosticsUpdateActionVehicleInterfaceRoadnetTelematicsVehicleInterface_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleInterface_RoadnetTelematicsVehicleInterface");
    private final static QName _TelematicsDeviceDiagnosticsUpdateActionVehicleTopGearValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleTopGearValue");
    private final static QName _VehicleStatusUpdateActionAcceleratorPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AcceleratorPosition");
    private final static QName _VehicleStatusUpdateActionAmbientAirTemperature_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AmbientAirTemperature");
    private final static QName _VehicleStatusUpdateActionBatteryVoltage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "BatteryVoltage");
    private final static QName _VehicleStatusUpdateActionCoolantLevelPercentage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CoolantLevelPercentage");
    private final static QName _VehicleStatusUpdateActionCoolantTemperatureValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CoolantTemperatureValue");
    private final static QName _VehicleStatusUpdateActionCruiseControlStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CruiseControlStatus");
    private final static QName _VehicleStatusUpdateActionDeviceCalculatedEngineRunTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeviceCalculatedEngineRunTime");
    private final static QName _VehicleStatusUpdateActionDeviceCalculatedOdometer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeviceCalculatedOdometer");
    private final static QName _VehicleStatusUpdateActionECMSpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ECMSpeed");
    private final static QName _VehicleStatusUpdateActionEngineAverageFuelEconomy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EngineAverageFuelEconomy");
    private final static QName _VehicleStatusUpdateActionEngineOilLevelPercentage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EngineOilLevelPercentage");
    private final static QName _VehicleStatusUpdateActionEngineOilTemperature_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EngineOilTemperature");
    private final static QName _VehicleStatusUpdateActionEngineRPM_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EngineRPM");
    private final static QName _VehicleStatusUpdateActionEngineTotalIdleFuelUsed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EngineTotalIdleFuelUsed");
    private final static QName _VehicleStatusUpdateActionEngineTotalIdleHours_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EngineTotalIdleHours");
    private final static QName _VehicleStatusUpdateActionGearState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "GearState");
    private final static QName _VehicleStatusUpdateActionIgnitionStateIgnitionState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "IgnitionState_IgnitionState");
    private final static QName _VehicleStatusUpdateActionInput0Value_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Input0Value");
    private final static QName _VehicleStatusUpdateActionInput1Value_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Input1Value");
    private final static QName _VehicleStatusUpdateActionInput2Value_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Input2Value");
    private final static QName _VehicleStatusUpdateActionInput3Value_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Input3Value");
    private final static QName _VehicleStatusUpdateActionInput4Value_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Input4Value");
    private final static QName _VehicleStatusUpdateActionInput5Value_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Input5Value");
    private final static QName _VehicleStatusUpdateActionInput6Value_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Input6Value");
    private final static QName _VehicleStatusUpdateActionInput7Value_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Input7Value");
    private final static QName _VehicleStatusUpdateActionOdometer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Odometer");
    private final static QName _VehicleStatusUpdateActionParkBrakeStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ParkBrakeStatus");
    private final static QName _VehicleStatusUpdateActionPowerTakeOffStatePowerTakeOffState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PowerTakeOffState_PowerTakeOffState");
    private final static QName _VehicleStatusUpdateActionReceivedSignalStrengthIndicator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ReceivedSignalStrengthIndicator");
    private final static QName _VehicleStatusUpdateActionTemperatureSensorValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TemperatureSensorValue");
    private final static QName _VehicleStatusUpdateActionTotalEngineRunTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TotalEngineRunTime");
    private final static QName _VehicleStatusUpdateActionTotalFuelUsed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TotalFuelUsed");
    private final static QName _VehicleStatusUpdateActionVehicleBusReportedBatteryVoltage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleBusReportedBatteryVoltage");
    private final static QName _StopSignatureActionConsignee_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Consignee");
    private final static QName _StopSignatureActionSignature_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Signature");
    private final static QName _ServiceStopActionServiceStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceStartTime");
    private final static QName _ReserviceStopActionReserviceAsDeviceStopId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ReserviceAsDeviceStopId");
    private final static QName _ReserviceStopActionStopIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopIndex");
    private final static QName _DepartStopActionGroupStopDeviceId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "GroupStopDeviceId");
    private final static QName _DepartStopActionReservicePlacement_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ReservicePlacement");
    private final static QName _DepartStopActionUnserviceableReasonCodeEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UnserviceableReasonCodeEntityKey");
    private final static QName _OnRouteByIndicesPlacementTaskTypeToIndexStopPlacementInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopPlacementInfo");
    private final static QName _OnRouteByIndicesPlacementTaskTypeToIndexTaskTypeTaskType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TaskType_TaskType");
    private final static QName _OnRouteByIndicesPlacementTaskIndices_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TaskIndices");
    private final static QName _OnDeviceStopPlacementOnStopPlacementPositionPlace_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnStopPlacement_Position_Place");
    private final static QName _OnRoutePlacementOnRoutePlacementPositionPlace_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnRoutePlacement_Position_Place");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesDamagedQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DamagedQuantities");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesDamagedReasonCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DamagedReasonCode");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesFreeformDamagedReasonCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "FreeformDamagedReasonCode");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesFreeformOverReasonCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "FreeformOverReasonCode");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesFreeformQuantityReasonCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "FreeformQuantityReasonCode");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesFreeformShortReasonCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "FreeformShortReasonCode");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesInputTimestamp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "InputTimestamp");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesOverQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OverQuantities");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesOverReasonCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OverReasonCode");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesQuantityInputQualityInputQuality_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "QuantityInputQuality_InputQuality");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesQuantityReasonCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "QuantityReasonCode");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesShortQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ShortQuantities");
    private final static QName _DeliveryDetailsUpdateActionDetailItemQuantitiesShortReasonCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ShortReasonCode");
    private final static QName _DeliveryDetailsUpdateActionOrderDetailItemDeliveryQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeliveryQuantities");
    private final static QName _DeliveryDetailsUpdateActionOrderDetailItemPickupQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PickupQuantities");
    private final static QName _DetailItemVerificationActionVerificationLocationTypeVerificationLocationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VerificationLocationType_VerificationLocationType");
    private final static QName _DetailItemVerificationActionVerificationTypeVerificationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VerificationType_VerificationType");
    private final static QName _OrderUpdateActionOrderCustomProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OrderCustomProperties");
    private final static QName _OrderUpdateActionTaskTypeOrderType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TaskType_OrderType");
    private final static QName _LineItemUpdateActionLineItemCustomProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LineItemCustomProperties");
    private final static QName _LineItemUpdateActionLineItemIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LineItemIdentifier");
    private final static QName _CustomFormResponseActionResponses_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Responses");
    private final static QName _NavClientActionClientMessageID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ClientMessageID");
    private final static QName _NavClientActionMapVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MapVersion");
    private final static QName _NavClientActionNavClientVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientVersion");
    private final static QName _NavClientWorkerChangedActionWorkerId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "WorkerId");
    private final static QName _NavClientSpeedAlertActionActualSpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ActualSpeed");
    private final static QName _NavClientSpeedAlertActionDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Distance");
    private final static QName _NavClientSpeedAlertActionLastCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LastCoordinate");
    private final static QName _NavClientSpeedAlertActionOverLimitThreshold_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OverLimitThreshold");
    private final static QName _NavClientSpeedAlertActionPostedSpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PostedSpeed");
    private final static QName _NavClientRecalculationActionCalculationDuration_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CalculationDuration");
    private final static QName _NavClientRecalculationActionDestinationAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DestinationAddress");
    private final static QName _NavClientRecalculationActionDestinationCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DestinationCoordinate");
    private final static QName _NavClientRecalculationActionDetourDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DetourDistance");
    private final static QName _NavClientRecalculationActionGrossVehicleWeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "GrossVehicleWeight");
    private final static QName _NavClientRecalculationActionLeftTurnsExtraTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LeftTurnsExtraTime");
    private final static QName _NavClientRecalculationActionLeftTurnsPenalty_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LeftTurnsPenalty");
    private final static QName _NavClientRecalculationActionNavClientRecalculationReasonReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NavClientRecalculationReason_Reason");
    private final static QName _NavClientRecalculationActionNetworkHazmatTypeFlagsHazmatTypeFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NetworkHazmatTypeFlags_HazmatTypeFlags");
    private final static QName _NavClientRecalculationActionRemainingDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RemainingDistance");
    private final static QName _NavClientRecalculationActionRemainingDuration_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RemainingDuration");
    private final static QName _NavClientRecalculationActionRightTurnsExtraTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RightTurnsExtraTime");
    private final static QName _NavClientRecalculationActionRightTurnsPenalty_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RightTurnsPenalty");
    private final static QName _NavClientRecalculationActionVehicleHeading_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleHeading");
    private final static QName _NavClientRecalculationActionVehicleHeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleHeight");
    private final static QName _NavClientRecalculationActionVehicleLength_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleLength");
    private final static QName _NavClientRecalculationActionVehicleWidth_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleWidth");
    private final static QName _NavClientDestinationArrivalActionDestinationIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DestinationIdentifier");
    private final static QName _NavClientRoutePathDeviationActionDeviationDistanceThreshold_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeviationDistanceThreshold");
    private final static QName _NavClientRoutePathDeviationActionEndDeviationPoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EndDeviationPoint");
    private final static QName _NavClientRoutePathDeviationActionMaxDeviationDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MaxDeviationDistance");
    private final static QName _LocationCommentsSaveActionComments_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Comments");
    private final static QName _LocationCommentsDeleteActionCommentKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CommentKeys");
    private final static QName _AssociateStationaryEventActionEventCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EventCoordinate");
    private final static QName _AssociateStationaryEventActionStopIdentities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopIdentities");
    private final static QName _ActiveTroubleCodesUpdateActionDiagnosticTroubleCodes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DiagnosticTroubleCodes");
    private final static QName _VehicleBusInfoUpdateActionVehicleBusComponents_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VehicleBusComponents");
    private final static QName _ServiceConfirmationActionServiceConfirmationInfos_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceConfirmationInfos");
    private final static QName _TelematicsDeviceCommsStatusUpdateActionIsVehicleBusDetected_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "IsVehicleBusDetected");
    private final static QName _EquipmentDropHookActionEquipment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Equipment");
    private final static QName _SendCompressedDataSetActionCompressedDataSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CompressedDataSet");
    private final static QName _RouteOptimizationResponseActionRejectionReasonCodeEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RejectionReasonCodeEntityKey");
    private final static QName _RouteOptimizationResponseActionRouteSuggestionStatusSuggestionStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteSuggestionStatus_SuggestionStatus");
    private final static QName _GroupStopBasedActionGroupStopKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "GroupStopKey");
    private final static QName _ReportClientApplicationInfoActionVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Version");
    private final static QName _LogOnActionIsCoDriver_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "IsCoDriver");
    private final static QName _LogOnActionWorkerEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "WorkerEntityKey");
    private final static QName _ActiveTroubleCodesUpdateActionOBD2TroubleCodeTroubleCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TroubleCode");
    private final static QName _ActiveTroubleCodesUpdateActionOBD2TroubleCodeTroubleCodeStateTroubleCodeState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "TroubleCodeState_TroubleCodeState");
    private final static QName _ActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusAmberWarningFlashStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "FlashStatus_AmberWarningFlashStatus");
    private final static QName _ActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusMalfunctionIndicatorFlashStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "FlashStatus_MalfunctionIndicatorFlashStatus");
    private final static QName _ActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusProtectFlashStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "FlashStatus_ProtectFlashStatus");
    private final static QName _ActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusRedStopFlashStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "FlashStatus_RedStopFlashStatus");
    private final static QName _ActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusAmberWarningLampStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LampStatus_AmberWarningLampStatus");
    private final static QName _ActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusMalfunctionIndicatorLampStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LampStatus_MalfunctionIndicatorLampStatus");
    private final static QName _ActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusProtectLampStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LampStatus_ProtectLampStatus");
    private final static QName _ActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusRedStopLampStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LampStatus_RedStopLampStatus");
    private final static QName _ActiveTroubleCodesUpdateActionJ1587TroubleCodeParameterIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ParameterIdentifier");
    private final static QName _ActiveTroubleCodesUpdateActionJ1587TroubleCodeSubsystemIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SubsystemIdentifier");
    private final static QName _DiagnosticTroubleCodeUpdateActionDiagnosticTroubleCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DiagnosticTroubleCode");
    private final static QName _RouteDescriptorEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EntityKey");
    private final static QName _RouteDescriptorRoutingSessionDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RoutingSessionDate");
    private final static QName _DrivingDirectionsStepDirectionText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DirectionText");
    private final static QName _DrivingDirectionsStepElapsedDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ElapsedDistance");
    private final static QName _AutomaticPlacementAutomaticPlacementGoalGoal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AutomaticPlacementGoal_Goal");
    private final static QName _AutomaticPlacementIgnoreFlagsRouteExceptionsToIgnore_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "IgnoreFlags_RouteExceptionsToIgnore");
    private final static QName _SendSmsResultMobileDeviceIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MobileDeviceIdentifier");
    private final static QName _SendSmsResultSendSmsResultStatusResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendSmsResult_Status_Result");
    private final static QName _OnStopPlacementInfoLocationDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LocationDescription");
    private final static QName _OnStopPlacementInfoLocationIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LocationIdentifier");
    private final static QName _OnStopPlacementInfoOnStopPlacementStopTypeStopType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OnStopPlacementStopType_StopType");
    private final static QName _OnStopPlacementInfoSequenceNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SequenceNumber");
    private final static QName _SuggestLayoverResultSuggestionAdditionalDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AdditionalDistance");
    private final static QName _SuggestLayoverResultSuggestionLayoverLocationDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LayoverLocationDescription");
    private final static QName _SuggestLayoverResultSuggestionLayoverLocationIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LayoverLocationIdentifier");
    private final static QName _SuggestLayoverResultSuggestionWorldTimeZoneLayoverLocationTimeZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "WorldTimeZone_LayoverLocationTimeZone");
    private final static QName _ScheduleEquipmentMaintenanceArgsScheduledDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ScheduledDate");
    private final static QName _SaveStopFromPointArgsAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Address");
    private final static QName _SaveStopFromPointArgsServiceLocationEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceLocationEntityKey");
    private final static QName _SaveStopFromPointArgsStopCreationMethodCreationMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopCreationMethod_CreationMethod");
    private final static QName _RecurringOrderPlacementAutomaticPlacementIgnoreFlagsRouteExceptionsToIgnore_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AutomaticPlacement_IgnoreFlags_RouteExceptionsToIgnore");
    private final static QName _RecurringOrderPlacementPlacementMethodRoutePlacementMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PlacementMethod_RoutePlacementMethod");
    private final static QName _OnManualLoadDistributionPlacementDailyDistributions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DailyDistributions");
    private final static QName _MoveRecurringOrderOptionsPlacementMethodTypeOrderPlacementMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PlacementMethodType_OrderPlacementMethod");
    private final static QName _MoveRecurringOrderOptionsRequiredTimeUnitNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RequiredTimeUnitNumber");
    private final static QName _LocationCommentParamCommentKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CommentKey");
    private final static QName _LocationCommentParamContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Content");
    private final static QName _LocationCommentParamLocationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LocationId");
    private final static QName _LocationCommentParamLocationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LocationType");
    private final static QName _LocationCommentParamSender_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Sender");
    private final static QName _DailyDistributionDayOfWeekDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DayOfWeek_Day");
    private final static QName _CustomFormResponseInfoCustomFormIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "CustomFormIdentifier");
    private final static QName _CustomFormResponseInfoEquipmentEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EquipmentEntityKey");
    private final static QName _CustomFormResponseInfoPerformedAtPerformedAt_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PerformedAt_PerformedAt");
    private final static QName _CustomFormResponseInfoRouteEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteEntityKey");
    private final static QName _VehicleBusComponentComponentIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ComponentIdentifier");
    private final static QName _VehicleBusComponentSoftwareVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SoftwareVersion");
    private final static QName _ServiceConfirmationInfoAppliesToOrders_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AppliesToOrders");
    private final static QName _ServiceConfirmationInfoAppliesToStops_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AppliesToStops");
    private final static QName _ServiceConfirmationInfoDeliveryImage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DeliveryImage");
    private final static QName _ServiceConfirmationInfoSignatureImage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SignatureImage");
    private final static QName _SaveRoutePlanStopArgsServiceLocationDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceLocationDescription");
    private final static QName _SaveRoutePlanStopArgsServiceLocationIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ServiceLocationIdentifier");
    private final static QName _ManipulationResultManipulationErrorMatchingPatternEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MatchingPatternEntityKeys");
    private final static QName _ManipulationResultManipulationErrorOrderEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "OrderEntityKey");
    private final static QName _ManipulationResultManipulationErrorReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Reason");
    private final static QName _DayShiftOptionsDayOfWeekFlagsValidDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DayOfWeekFlags_ValidDays");
    private final static QName _DayShiftOptionsShiftByOverride_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ShiftByOverride");
    private final static QName _NavDeviceStatusDtoActivationCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ActivationCode");
    private final static QName _UpdateServiceTimeParametersEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", "EndDate");
    private final static QName _UpdateServiceTimeParametersFixedTimeMaxVariance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", "FixedTimeMaxVariance");
    private final static QName _UpdateServiceTimeParametersStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", "StartDate");
    private final static QName _UpdateServiceTimeParametersVariableTimeMaxVariancePercentage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", "VariableTimeMaxVariancePercentage");
    private final static QName _SuggestRouteResultRouteConstraintFlagsConstraintsEncountered_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "RouteConstraintFlags_ConstraintsEncountered");
    private final static QName _SuggestRouteResultSuggestions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "Suggestions");
    private final static QName _SuggestRouteParametersDefaultRoutingSessionEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "DefaultRoutingSessionEntityKey");
    private final static QName _SuggestRouteParametersMinimumTravelTimeToConsiderBeforeNextStop_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "MinimumTravelTimeToConsiderBeforeNextStop");
    private final static QName _SuggestRouteParametersRouteEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "RouteEntityKeys");
    private final static QName _SuggestRouteParametersRouteExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "RouteExpression");
    private final static QName _SuggestRouteParametersSuggestIgnoreFlagsIgnoreFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "SuggestIgnoreFlags_IgnoreFlags");
    private final static QName _SuggestRouteParametersSuggestRouteGoalGoal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", "SuggestRouteGoal_Goal");
    private final static QName _SendOrdersResultsErrors_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Errors");
    private final static QName _SendOrdersResultsFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "File");
    private final static QName _SendOrdersResultsLockOrderErrors_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LockOrderErrors");
    private final static QName _SendOrdersResultsRouteKeyList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteKeyList");
    private final static QName _SendOrdersParametersExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Expression");
    private final static QName _SendOrdersParametersLatLongPrecision_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LatLongPrecision");
    private final static QName _SendOrdersParametersRoutes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Routes");
    private final static QName _SendOrdersParametersSendOrdersTimeZoneOptionTimeZoneOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SendOrdersTimeZoneOption_TimeZoneOption");
    private final static QName _SendOrdersParametersStopNumberFormatAssignStopNumbersBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopNumberFormat_AssignStopNumbersBy");
    private final static QName _SendOrdersParametersTemplate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Template");
    private final static QName _SendOrdersParametersVariableServiceTimeFormatServiceTimeFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "VariableServiceTimeFormat_ServiceTimeFormat");
    private final static QName _SendOrdersParametersWorldTimeZoneTimeZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "WorldTimeZone_TimeZone");
    private final static QName _SaveRouteTemplateFromRouteArgsRouteInstances_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteInstances");
    private final static QName _SaveRouteTemplateFromRouteArgsUpdateActionIfTemplateExists_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UpdateAction_IfTemplateExists");
    private final static QName _SuggestRouteTemplateResultSuggestions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Suggestions");
    private final static QName _SuggestRouteTemplateCandidatesEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EntityKeys");
    private final static QName _SuggestRouteTemplateCandidatesSuggestRouteTemplateCandidatesEntityTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SuggestRouteTemplateCandidates_EntityType_Type");
    private final static QName _SuggestLayoverTemplateOptionsAdditionalLayoverLocationEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "AdditionalLayoverLocationEntityKeys");
    private final static QName _SuggestLayoverTemplateOptionsDepartureType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DepartureType");
    private final static QName _SaveLayoverStopTemplateArgsDeparture_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Departure");
    private final static QName _SaveLayoverStopTemplateArgsLayoverLocationEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LayoverLocationEntityKey");
    private final static QName _SaveMidRouteDepotStopTemplateArgsLoadActionLoadAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LoadAction_LoadAction");
    private final static QName _SaveMidRouteDepotStopTemplateArgsReloadTimeOverride_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ReloadTimeOverride");
    private final static QName _SaveRouteTemplateArgsColor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Color");
    private final static QName _SaveRouteTemplateArgsDayOfWeekFlagsDeliveryDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DayOfWeekFlags_DeliveryDays");
    private final static QName _SaveRouteTemplateArgsDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Description");
    private final static QName _SaveRouteTemplateArgsDispatcherEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "DispatcherEntityKey");
    private final static QName _SaveRouteTemplateArgsInstance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Instance");
    private final static QName _SaveRouteTemplateArgsLoadActionOriginLoadAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LoadAction_OriginLoadAction");
    private final static QName _SaveRouteTemplateArgsMaximumRuntime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MaximumRuntime");
    private final static QName _SaveRouteTemplateArgsMaximumTravelTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "MaximumTravelTime");
    private final static QName _SaveRouteTemplateArgsPostRouteTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PostRouteTime");
    private final static QName _SaveRouteTemplateArgsPreRouteTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PreRouteTime");
    private final static QName _SaveRouteTemplateArgsPreferredRuntime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PreferredRuntime");
    private final static QName _SaveRouteTemplateArgsRouterEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouterEntityKey");
    private final static QName _SaveRouteTemplateArgsWorkers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Workers");
    private final static QName _NavClientActivationCodeRefreshStatusErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ErrorMessage");
    private final static QName _PreviewRouteOptionsPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PropertyOptions");
    private final static QName _RetrieveRoutesOptionsEquipmentList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EquipmentList");
    private final static QName _RetrieveRoutesOptionsParentRouteDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ParentRouteDescriptor");
    private final static QName _RetrieveRoutesOptionsRouteRetrievalTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteRetrievalType_Type");
    private final static QName _RetrieveRoutesOptionsWorkerList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "WorkerList");
    private final static QName _LoadRouteOptionsUnplannedOriginLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UnplannedOriginLocation");
    private final static QName _LockOrderResultsFailures_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Failures");
    private final static QName _LockOrderOptionsKeepRelativeSequenceOfLockedStops_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "KeepRelativeSequenceOfLockedStops");
    private final static QName _ExportCustomFormsResultFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Import", "File");
    private final static QName _ExportCustomFormsOptionsEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Import", "EntityKeys");
    private final static QName _CopyRouteToSessionOptionsReturnPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ReturnPropertyOptions");
    private final static QName _PrepareForNextDayJobParametersRoutingSessionDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.PrepareForNextDay", "RoutingSessionDescription");
    private final static QName _SaveSessionAsJobParametersRoutingSessionDepot_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", "RoutingSessionDepot");
    private final static QName _SaveSessionAsJobParametersRoutingSessionDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", "RoutingSessionDescription");
    private final static QName _SaveSessionAsJobParametersRoutingSessionStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", "RoutingSessionStartDate");
    private final static QName _DeleteStrategicRoutingSessionJobParametersSessionEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteStrategicRoutingSession", "SessionEntityKeys");
    private final static QName _TransferRecurringOrdersParametersDestinationStrategicSessionEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", "DestinationStrategicSessionEntityKeys");
    private final static QName _TransferRecurringOrdersParametersRecurringOrderEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", "RecurringOrderEntityKeys");
    private final static QName _TransferRecurringOrdersParametersSetAssignDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", "SetAssignDays");
    private final static QName _TransferRecurringOrdersParametersTerritoryEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", "TerritoryEntityKeys");
    private final static QName _ShiftDaysJobParametersOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ShiftDays", "Options");
    private final static QName _ShiftDaysJobParametersRecurringOrders_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ShiftDays", "RecurringOrders");
    private final static QName _UpdateDailyRoutesJobParametersRouteKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.UpdateDailyRoutes", "RouteKeys");
    private final static QName _UpdateDailyRoutesJobParametersSessionDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.UpdateDailyRoutes", "SessionDescription");
    private final static QName _SwitchRecurringOrderServicePatternParametersRecurringOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RecurringOrder");
    private final static QName _ManipulationResultRouteConstraintFlagsConstraintsEncountered_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteConstraintFlags_ConstraintsEncountered");
    private final static QName _RecurringOrderManipulationResultRecurringOrders_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RecurringOrders");
    private final static QName _RecurringOrderManipulationResultTerritories_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Territories");
    private final static QName _BuildSameDayMatricesOptionsRoutingSessionEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RoutingSessionEntityKey");
    private final static QName _ExportPlanningSolutionJobParametersActiveWeeks_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ActiveWeeks");
    private final static QName _ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormatDaysOutputFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ExportPlanningSolutionDaysOutputFormat_DaysOutputFormat");
    private final static QName _ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOptionTimeZoneOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ExportPlanningSolutionTimeZoneOption_TimeZoneOption");
    private final static QName _ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormatWeeksOutputFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "ExportPlanningSolutionWeeksOutputFormat_WeeksOutputFormat");
    private final static QName _ExportPlanningSolutionJobParametersLatLongPercision_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "LatLongPercision");
    private final static QName _ExportPlanningSolutionJobParametersPlanningSession_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "PlanningSession");
    private final static QName _DeleteTerritoriesJobParametersTerritoryKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteTerritories", "TerritoryKeys");
    private final static QName _SaveOrderOptionsSaveOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveOptions");
    private final static QName _CalculateOptimalRouteMetricsParametersRouteInstances_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.CalculateOptimal", "RouteInstances");
    private final static QName _CalculateRoutesArgsSessionEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SessionEntityKey");
    private final static QName _CreateCellsFromRoutesResultSavedCellSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SavedCellSet");
    private final static QName _CreateCellsFromRoutesResultSavedCells_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SavedCells");
    private final static QName _CreateCellsFromRoutesOptionsNewCellSetID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "NewCellSetID");
    private final static QName _DeleteRoutesJobParametersRouteKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteRoutes", "RouteKeys");
    private final static QName _RemoveStopOptionsStopCancelReasonCodeEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "StopCancelReasonCodeEntityKey");
    private final static QName _SequenceOptionsIgnoreFlagsRouteExceptionsToIgnore_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "IgnoreFlags_RouteExceptionsToIgnore");
    private final static QName _SequenceOptionsSequencingGoalGoal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "SequencingGoal_Goal");
    private final static QName _OptimizeResultRouteResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteResults");
    private final static QName _OptimizeOptionsOptimizingGoalGoal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "OptimizingGoal_Goal");
    private final static QName _MoveToRouteParametersUnassignedOrderGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UnassignedOrderGroups");
    private final static QName _RouteRetrievalOptionsPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", "PropertyOptions");
    private final static QName _UpdateRouteTenderOptionsRouteTenderReasonCodeEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteTenderReasonCodeEntityKey");
    private final static QName _UpdateUserSettingsParametersUserSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "UserSettings");
    private final static QName _UndeleteEntityOptionsEntityType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EntityType");
    private final static QName _UpdateRouteFromPointsArgsSaveStopFromPointArgsList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "SaveStopFromPointArgsList");
    private final static QName _CreateRouteFromPointsArgsRouteDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteDescription");
    private final static QName _CreateRouteFromPointsArgsRouteIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "RouteIdentifier");
    private final static QName _SaveRoutePlanRouteArgsEquipmentEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EquipmentEntityKeys");
    private final static QName _SaveRoutePlanRouteArgsEquipmentIdentifiers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "EquipmentIdentifiers");
    private final static QName _SaveRoutePlanRouteArgsRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "Route");
    private final static QName _SaveRoutePlanRouteArgsWorkerIdentifiers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", "WorkerIdentifiers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveRoutePlanRouteArgs }
     * 
     */
    public SaveRoutePlanRouteArgs createSaveRoutePlanRouteArgs() {
        return new SaveRoutePlanRouteArgs();
    }

    /**
     * Create an instance of {@link SaveRoutePlanOptions }
     * 
     */
    public SaveRoutePlanOptions createSaveRoutePlanOptions() {
        return new SaveRoutePlanOptions();
    }

    /**
     * Create an instance of {@link CreateRouteFromPointsArgs }
     * 
     */
    public CreateRouteFromPointsArgs createCreateRouteFromPointsArgs() {
        return new CreateRouteFromPointsArgs();
    }

    /**
     * Create an instance of {@link UpdateRouteFromPointsArgs }
     * 
     */
    public UpdateRouteFromPointsArgs createUpdateRouteFromPointsArgs() {
        return new UpdateRouteFromPointsArgs();
    }

    /**
     * Create an instance of {@link UndeleteEntityOptions }
     * 
     */
    public UndeleteEntityOptions createUndeleteEntityOptions() {
        return new UndeleteEntityOptions();
    }

    /**
     * Create an instance of {@link ArrayOfUndeleteEntityResult }
     * 
     */
    public ArrayOfUndeleteEntityResult createArrayOfUndeleteEntityResult() {
        return new ArrayOfUndeleteEntityResult();
    }

    /**
     * Create an instance of {@link ResumeDataFeedOptions }
     * 
     */
    public ResumeDataFeedOptions createResumeDataFeedOptions() {
        return new ResumeDataFeedOptions();
    }

    /**
     * Create an instance of {@link ResumeDataFeedResult }
     * 
     */
    public ResumeDataFeedResult createResumeDataFeedResult() {
        return new ResumeDataFeedResult();
    }

    /**
     * Create an instance of {@link UpdateUserSettingsParameters }
     * 
     */
    public UpdateUserSettingsParameters createUpdateUserSettingsParameters() {
        return new UpdateUserSettingsParameters();
    }

    /**
     * Create an instance of {@link UpdateRouteTenderOptions }
     * 
     */
    public UpdateRouteTenderOptions createUpdateRouteTenderOptions() {
        return new UpdateRouteTenderOptions();
    }

    /**
     * Create an instance of {@link ArrayOfRouteRetrievalOptions }
     * 
     */
    public ArrayOfRouteRetrievalOptions createArrayOfRouteRetrievalOptions() {
        return new ArrayOfRouteRetrievalOptions();
    }

    /**
     * Create an instance of {@link ManipulationResult }
     * 
     */
    public ManipulationResult createManipulationResult() {
        return new ManipulationResult();
    }

    /**
     * Create an instance of {@link RouteRetrievalOptions }
     * 
     */
    public RouteRetrievalOptions createRouteRetrievalOptions() {
        return new RouteRetrievalOptions();
    }

    /**
     * Create an instance of {@link Placement }
     * 
     */
    public Placement createPlacement() {
        return new Placement();
    }

    /**
     * Create an instance of {@link AutomaticPlacement }
     * 
     */
    public AutomaticPlacement createAutomaticPlacement() {
        return new AutomaticPlacement();
    }

    /**
     * Create an instance of {@link MoveToRouteParameters }
     * 
     */
    public MoveToRouteParameters createMoveToRouteParameters() {
        return new MoveToRouteParameters();
    }

    /**
     * Create an instance of {@link OptimizeOptions }
     * 
     */
    public OptimizeOptions createOptimizeOptions() {
        return new OptimizeOptions();
    }

    /**
     * Create an instance of {@link OptimizeResult }
     * 
     */
    public OptimizeResult createOptimizeResult() {
        return new OptimizeResult();
    }

    /**
     * Create an instance of {@link SequenceOptions }
     * 
     */
    public SequenceOptions createSequenceOptions() {
        return new SequenceOptions();
    }

    /**
     * Create an instance of {@link RemoveOrderOptions }
     * 
     */
    public RemoveOrderOptions createRemoveOrderOptions() {
        return new RemoveOrderOptions();
    }

    /**
     * Create an instance of {@link ArrayOfRouteStopInstances }
     * 
     */
    public ArrayOfRouteStopInstances createArrayOfRouteStopInstances() {
        return new ArrayOfRouteStopInstances();
    }

    /**
     * Create an instance of {@link RemoveStopOptions }
     * 
     */
    public RemoveStopOptions createRemoveStopOptions() {
        return new RemoveStopOptions();
    }

    /**
     * Create an instance of {@link ArrayOfRouteStopTaskInstances }
     * 
     */
    public ArrayOfRouteStopTaskInstances createArrayOfRouteStopTaskInstances() {
        return new ArrayOfRouteStopTaskInstances();
    }

    /**
     * Create an instance of {@link MoveUnassignedOrderGroupsOptions }
     * 
     */
    public MoveUnassignedOrderGroupsOptions createMoveUnassignedOrderGroupsOptions() {
        return new MoveUnassignedOrderGroupsOptions();
    }

    /**
     * Create an instance of {@link ArrayOfManipulationResult }
     * 
     */
    public ArrayOfManipulationResult createArrayOfManipulationResult() {
        return new ArrayOfManipulationResult();
    }

    /**
     * Create an instance of {@link DeleteRoutesJobParameters }
     * 
     */
    public DeleteRoutesJobParameters createDeleteRoutesJobParameters() {
        return new DeleteRoutesJobParameters();
    }

    /**
     * Create an instance of {@link SaveRouteResult }
     * 
     */
    public SaveRouteResult createSaveRouteResult() {
        return new SaveRouteResult();
    }

    /**
     * Create an instance of {@link ArrayOfSaveRouteResult }
     * 
     */
    public ArrayOfSaveRouteResult createArrayOfSaveRouteResult() {
        return new ArrayOfSaveRouteResult();
    }

    /**
     * Create an instance of {@link SuggestLayoverOptions }
     * 
     */
    public SuggestLayoverOptions createSuggestLayoverOptions() {
        return new SuggestLayoverOptions();
    }

    /**
     * Create an instance of {@link SuggestLayoverResult }
     * 
     */
    public SuggestLayoverResult createSuggestLayoverResult() {
        return new SuggestLayoverResult();
    }

    /**
     * Create an instance of {@link ServiceTimeAdjustmentOptions }
     * 
     */
    public ServiceTimeAdjustmentOptions createServiceTimeAdjustmentOptions() {
        return new ServiceTimeAdjustmentOptions();
    }

    /**
     * Create an instance of {@link CreateCellsFromRoutesOptions }
     * 
     */
    public CreateCellsFromRoutesOptions createCreateCellsFromRoutesOptions() {
        return new CreateCellsFromRoutesOptions();
    }

    /**
     * Create an instance of {@link CreateCellsFromRoutesResult }
     * 
     */
    public CreateCellsFromRoutesResult createCreateCellsFromRoutesResult() {
        return new CreateCellsFromRoutesResult();
    }

    /**
     * Create an instance of {@link CalculateRoutesArgs }
     * 
     */
    public CalculateRoutesArgs createCalculateRoutesArgs() {
        return new CalculateRoutesArgs();
    }

    /**
     * Create an instance of {@link ArrayOfCalculateRouteResult }
     * 
     */
    public ArrayOfCalculateRouteResult createArrayOfCalculateRouteResult() {
        return new ArrayOfCalculateRouteResult();
    }

    /**
     * Create an instance of {@link AutoCompleteRouteOptions }
     * 
     */
    public AutoCompleteRouteOptions createAutoCompleteRouteOptions() {
        return new AutoCompleteRouteOptions();
    }

    /**
     * Create an instance of {@link RouteActuals }
     * 
     */
    public RouteActuals createRouteActuals() {
        return new RouteActuals();
    }

    /**
     * Create an instance of {@link AssociateStationaryResourceEventWithStopsOptions }
     * 
     */
    public AssociateStationaryResourceEventWithStopsOptions createAssociateStationaryResourceEventWithStopsOptions() {
        return new AssociateStationaryResourceEventWithStopsOptions();
    }

    /**
     * Create an instance of {@link AddStopsUsingStationaryResourceEventOptions }
     * 
     */
    public AddStopsUsingStationaryResourceEventOptions createAddStopsUsingStationaryResourceEventOptions() {
        return new AddStopsUsingStationaryResourceEventOptions();
    }

    /**
     * Create an instance of {@link MarkStopAsUnserviceableOptions }
     * 
     */
    public MarkStopAsUnserviceableOptions createMarkStopAsUnserviceableOptions() {
        return new MarkStopAsUnserviceableOptions();
    }

    /**
     * Create an instance of {@link CalculateOptimalRouteMetricsParameters }
     * 
     */
    public CalculateOptimalRouteMetricsParameters createCalculateOptimalRouteMetricsParameters() {
        return new CalculateOptimalRouteMetricsParameters();
    }

    /**
     * Create an instance of {@link SaveOrderOptions }
     * 
     */
    public SaveOrderOptions createSaveOrderOptions() {
        return new SaveOrderOptions();
    }

    /**
     * Create an instance of {@link MoveUnassignedOrdersToSessionJobParameters }
     * 
     */
    public MoveUnassignedOrdersToSessionJobParameters createMoveUnassignedOrdersToSessionJobParameters() {
        return new MoveUnassignedOrdersToSessionJobParameters();
    }

    /**
     * Create an instance of {@link SaveTerritoryResult }
     * 
     */
    public SaveTerritoryResult createSaveTerritoryResult() {
        return new SaveTerritoryResult();
    }

    /**
     * Create an instance of {@link ArrayOfSaveTerritoryResult }
     * 
     */
    public ArrayOfSaveTerritoryResult createArrayOfSaveTerritoryResult() {
        return new ArrayOfSaveTerritoryResult();
    }

    /**
     * Create an instance of {@link DeleteTerritoriesJobParameters }
     * 
     */
    public DeleteTerritoriesJobParameters createDeleteTerritoriesJobParameters() {
        return new DeleteTerritoriesJobParameters();
    }

    /**
     * Create an instance of {@link ExportPlanningSolutionJobParameters }
     * 
     */
    public ExportPlanningSolutionJobParameters createExportPlanningSolutionJobParameters() {
        return new ExportPlanningSolutionJobParameters();
    }

    /**
     * Create an instance of {@link BuildSameDayMatricesOptions }
     * 
     */
    public BuildSameDayMatricesOptions createBuildSameDayMatricesOptions() {
        return new BuildSameDayMatricesOptions();
    }

    /**
     * Create an instance of {@link ArrayOfScheduleEquipmentMaintenanceArgs }
     * 
     */
    public ArrayOfScheduleEquipmentMaintenanceArgs createArrayOfScheduleEquipmentMaintenanceArgs() {
        return new ArrayOfScheduleEquipmentMaintenanceArgs();
    }

    /**
     * Create an instance of {@link MoveStrategicStopsParameters }
     * 
     */
    public MoveStrategicStopsParameters createMoveStrategicStopsParameters() {
        return new MoveStrategicStopsParameters();
    }

    /**
     * Create an instance of {@link RecurringOrderManipulationResult }
     * 
     */
    public RecurringOrderManipulationResult createRecurringOrderManipulationResult() {
        return new RecurringOrderManipulationResult();
    }

    /**
     * Create an instance of {@link SwitchRecurringOrderServicePatternParameters }
     * 
     */
    public SwitchRecurringOrderServicePatternParameters createSwitchRecurringOrderServicePatternParameters() {
        return new SwitchRecurringOrderServicePatternParameters();
    }

    /**
     * Create an instance of {@link RecurringOrderPlacement }
     * 
     */
    public RecurringOrderPlacement createRecurringOrderPlacement() {
        return new RecurringOrderPlacement();
    }

    /**
     * Create an instance of {@link UpdateDailyRoutesJobParameters }
     * 
     */
    public UpdateDailyRoutesJobParameters createUpdateDailyRoutesJobParameters() {
        return new UpdateDailyRoutesJobParameters();
    }

    /**
     * Create an instance of {@link ShiftDaysJobParameters }
     * 
     */
    public ShiftDaysJobParameters createShiftDaysJobParameters() {
        return new ShiftDaysJobParameters();
    }

    /**
     * Create an instance of {@link TransferRecurringOrdersParameters }
     * 
     */
    public TransferRecurringOrdersParameters createTransferRecurringOrdersParameters() {
        return new TransferRecurringOrdersParameters();
    }

    /**
     * Create an instance of {@link DeleteStrategicRoutingSessionJobParameters }
     * 
     */
    public DeleteStrategicRoutingSessionJobParameters createDeleteStrategicRoutingSessionJobParameters() {
        return new DeleteStrategicRoutingSessionJobParameters();
    }

    /**
     * Create an instance of {@link SaveSessionAsJobParameters }
     * 
     */
    public SaveSessionAsJobParameters createSaveSessionAsJobParameters() {
        return new SaveSessionAsJobParameters();
    }

    /**
     * Create an instance of {@link PrepareForNextDayJobParameters }
     * 
     */
    public PrepareForNextDayJobParameters createPrepareForNextDayJobParameters() {
        return new PrepareForNextDayJobParameters();
    }

    /**
     * Create an instance of {@link CopyRouteToSessionOptions }
     * 
     */
    public CopyRouteToSessionOptions createCopyRouteToSessionOptions() {
        return new CopyRouteToSessionOptions();
    }

    /**
     * Create an instance of {@link UpdateStrategicPlanningSessionCacheJobParameters }
     * 
     */
    public UpdateStrategicPlanningSessionCacheJobParameters createUpdateStrategicPlanningSessionCacheJobParameters() {
        return new UpdateStrategicPlanningSessionCacheJobParameters();
    }

    /**
     * Create an instance of {@link ExportCustomFormsOptions }
     * 
     */
    public ExportCustomFormsOptions createExportCustomFormsOptions() {
        return new ExportCustomFormsOptions();
    }

    /**
     * Create an instance of {@link ExportCustomFormsResult }
     * 
     */
    public ExportCustomFormsResult createExportCustomFormsResult() {
        return new ExportCustomFormsResult();
    }

    /**
     * Create an instance of {@link LockOrderOptions }
     * 
     */
    public LockOrderOptions createLockOrderOptions() {
        return new LockOrderOptions();
    }

    /**
     * Create an instance of {@link LockOrderResults }
     * 
     */
    public LockOrderResults createLockOrderResults() {
        return new LockOrderResults();
    }

    /**
     * Create an instance of {@link LoadRouteOptions }
     * 
     */
    public LoadRouteOptions createLoadRouteOptions() {
        return new LoadRouteOptions();
    }

    /**
     * Create an instance of {@link RetrieveRoutesOptions }
     * 
     */
    public RetrieveRoutesOptions createRetrieveRoutesOptions() {
        return new RetrieveRoutesOptions();
    }

    /**
     * Create an instance of {@link PreviewRouteOptions }
     * 
     */
    public PreviewRouteOptions createPreviewRouteOptions() {
        return new PreviewRouteOptions();
    }

    /**
     * Create an instance of {@link ArrayOfMobileDeviceAction }
     * 
     */
    public ArrayOfMobileDeviceAction createArrayOfMobileDeviceAction() {
        return new ArrayOfMobileDeviceAction();
    }

    /**
     * Create an instance of {@link ArrayOfSendSmsResult }
     * 
     */
    public ArrayOfSendSmsResult createArrayOfSendSmsResult() {
        return new ArrayOfSendSmsResult();
    }

    /**
     * Create an instance of {@link ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo }
     * 
     */
    public ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo createArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo() {
        return new ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo();
    }

    /**
     * Create an instance of {@link NavClientActivationCodeRefreshStatus }
     * 
     */
    public NavClientActivationCodeRefreshStatus createNavClientActivationCodeRefreshStatus() {
        return new NavClientActivationCodeRefreshStatus();
    }

    /**
     * Create an instance of {@link ArrayOfNavDeviceStatusDto }
     * 
     */
    public ArrayOfNavDeviceStatusDto createArrayOfNavDeviceStatusDto() {
        return new ArrayOfNavDeviceStatusDto();
    }

    /**
     * Create an instance of {@link SaveRouteTemplateArgs }
     * 
     */
    public SaveRouteTemplateArgs createSaveRouteTemplateArgs() {
        return new SaveRouteTemplateArgs();
    }

    /**
     * Create an instance of {@link ArrayOfSaveRouteTemplateArgs }
     * 
     */
    public ArrayOfSaveRouteTemplateArgs createArrayOfSaveRouteTemplateArgs() {
        return new ArrayOfSaveRouteTemplateArgs();
    }

    /**
     * Create an instance of {@link TemplatePlacement }
     * 
     */
    public TemplatePlacement createTemplatePlacement() {
        return new TemplatePlacement();
    }

    /**
     * Create an instance of {@link SaveMidRouteDepotStopTemplateArgs }
     * 
     */
    public SaveMidRouteDepotStopTemplateArgs createSaveMidRouteDepotStopTemplateArgs() {
        return new SaveMidRouteDepotStopTemplateArgs();
    }

    /**
     * Create an instance of {@link SaveLayoverStopTemplateArgs }
     * 
     */
    public SaveLayoverStopTemplateArgs createSaveLayoverStopTemplateArgs() {
        return new SaveLayoverStopTemplateArgs();
    }

    /**
     * Create an instance of {@link SuggestLayoverTemplateOptions }
     * 
     */
    public SuggestLayoverTemplateOptions createSuggestLayoverTemplateOptions() {
        return new SuggestLayoverTemplateOptions();
    }

    /**
     * Create an instance of {@link SuggestRouteTemplateCandidates }
     * 
     */
    public SuggestRouteTemplateCandidates createSuggestRouteTemplateCandidates() {
        return new SuggestRouteTemplateCandidates();
    }

    /**
     * Create an instance of {@link SuggestRouteTemplateResult }
     * 
     */
    public SuggestRouteTemplateResult createSuggestRouteTemplateResult() {
        return new SuggestRouteTemplateResult();
    }

    /**
     * Create an instance of {@link SaveRouteTemplateFromRouteArgs }
     * 
     */
    public SaveRouteTemplateFromRouteArgs createSaveRouteTemplateFromRouteArgs() {
        return new SaveRouteTemplateFromRouteArgs();
    }

    /**
     * Create an instance of {@link ArrayOfSaveRouteTemplateFromRouteResult }
     * 
     */
    public ArrayOfSaveRouteTemplateFromRouteResult createArrayOfSaveRouteTemplateFromRouteResult() {
        return new ArrayOfSaveRouteTemplateFromRouteResult();
    }

    /**
     * Create an instance of {@link SendOrdersParameters }
     * 
     */
    public SendOrdersParameters createSendOrdersParameters() {
        return new SendOrdersParameters();
    }

    /**
     * Create an instance of {@link SendOrdersResults }
     * 
     */
    public SendOrdersResults createSendOrdersResults() {
        return new SendOrdersResults();
    }

    /**
     * Create an instance of {@link SuggestRouteParameters }
     * 
     */
    public SuggestRouteParameters createSuggestRouteParameters() {
        return new SuggestRouteParameters();
    }

    /**
     * Create an instance of {@link SuggestRouteResult }
     * 
     */
    public SuggestRouteResult createSuggestRouteResult() {
        return new SuggestRouteResult();
    }

    /**
     * Create an instance of {@link GenerateRouteTravelPathOptions }
     * 
     */
    public GenerateRouteTravelPathOptions createGenerateRouteTravelPathOptions() {
        return new GenerateRouteTravelPathOptions();
    }

    /**
     * Create an instance of {@link GenerateRoutePathOptions }
     * 
     */
    public GenerateRoutePathOptions createGenerateRoutePathOptions() {
        return new GenerateRoutePathOptions();
    }

    /**
     * Create an instance of {@link GenerateRouteTemplateTravelPathOptions }
     * 
     */
    public GenerateRouteTemplateTravelPathOptions createGenerateRouteTemplateTravelPathOptions() {
        return new GenerateRouteTemplateTravelPathOptions();
    }

    /**
     * Create an instance of {@link AdvancedLoggingOptions }
     * 
     */
    public AdvancedLoggingOptions createAdvancedLoggingOptions() {
        return new AdvancedLoggingOptions();
    }

    /**
     * Create an instance of {@link UpdateServiceTimeParameters }
     * 
     */
    public UpdateServiceTimeParameters createUpdateServiceTimeParameters() {
        return new UpdateServiceTimeParameters();
    }

    /**
     * Create an instance of {@link ClientDiagnosticsInformation }
     * 
     */
    public ClientDiagnosticsInformation createClientDiagnosticsInformation() {
        return new ClientDiagnosticsInformation();
    }

    /**
     * Create an instance of {@link ArrayOfClientDiagnosticsInformation }
     * 
     */
    public ArrayOfClientDiagnosticsInformation createArrayOfClientDiagnosticsInformation() {
        return new ArrayOfClientDiagnosticsInformation();
    }

    /**
     * Create an instance of {@link NavDeviceStatusDto }
     * 
     */
    public NavDeviceStatusDto createNavDeviceStatusDto() {
        return new NavDeviceStatusDto();
    }

    /**
     * Create an instance of {@link DayShiftOptions }
     * 
     */
    public DayShiftOptions createDayShiftOptions() {
        return new DayShiftOptions();
    }

    /**
     * Create an instance of {@link ArrayOfManipulationResultManipulationError }
     * 
     */
    public ArrayOfManipulationResultManipulationError createArrayOfManipulationResultManipulationError() {
        return new ArrayOfManipulationResultManipulationError();
    }

    /**
     * Create an instance of {@link ManipulationResultManipulationError }
     * 
     */
    public ManipulationResultManipulationError createManipulationResultManipulationError() {
        return new ManipulationResultManipulationError();
    }

    /**
     * Create an instance of {@link SaveRoutePlanStopArgs }
     * 
     */
    public SaveRoutePlanStopArgs createSaveRoutePlanStopArgs() {
        return new SaveRoutePlanStopArgs();
    }

    /**
     * Create an instance of {@link UnplannedOriginParameters }
     * 
     */
    public UnplannedOriginParameters createUnplannedOriginParameters() {
        return new UnplannedOriginParameters();
    }

    /**
     * Create an instance of {@link ServiceConfirmationInfo }
     * 
     */
    public ServiceConfirmationInfo createServiceConfirmationInfo() {
        return new ServiceConfirmationInfo();
    }

    /**
     * Create an instance of {@link ArrayOfServiceConfirmationActionOrderIdentity }
     * 
     */
    public ArrayOfServiceConfirmationActionOrderIdentity createArrayOfServiceConfirmationActionOrderIdentity() {
        return new ArrayOfServiceConfirmationActionOrderIdentity();
    }

    /**
     * Create an instance of {@link ServiceConfirmationActionOrderIdentity }
     * 
     */
    public ServiceConfirmationActionOrderIdentity createServiceConfirmationActionOrderIdentity() {
        return new ServiceConfirmationActionOrderIdentity();
    }

    /**
     * Create an instance of {@link VehicleBusComponent }
     * 
     */
    public VehicleBusComponent createVehicleBusComponent() {
        return new VehicleBusComponent();
    }

    /**
     * Create an instance of {@link CustomFormResponseInfo }
     * 
     */
    public CustomFormResponseInfo createCustomFormResponseInfo() {
        return new CustomFormResponseInfo();
    }

    /**
     * Create an instance of {@link DailyDistribution }
     * 
     */
    public DailyDistribution createDailyDistribution() {
        return new DailyDistribution();
    }

    /**
     * Create an instance of {@link LocationCommentParam }
     * 
     */
    public LocationCommentParam createLocationCommentParam() {
        return new LocationCommentParam();
    }

    /**
     * Create an instance of {@link MoveRecurringOrderOptions }
     * 
     */
    public MoveRecurringOrderOptions createMoveRecurringOrderOptions() {
        return new MoveRecurringOrderOptions();
    }

    /**
     * Create an instance of {@link OnManualLoadDistributionPlacement }
     * 
     */
    public OnManualLoadDistributionPlacement createOnManualLoadDistributionPlacement() {
        return new OnManualLoadDistributionPlacement();
    }

    /**
     * Create an instance of {@link ArrayOfDailyDistribution }
     * 
     */
    public ArrayOfDailyDistribution createArrayOfDailyDistribution() {
        return new ArrayOfDailyDistribution();
    }

    /**
     * Create an instance of {@link OnSwitchServicePatternPlacement }
     * 
     */
    public OnSwitchServicePatternPlacement createOnSwitchServicePatternPlacement() {
        return new OnSwitchServicePatternPlacement();
    }

    /**
     * Create an instance of {@link ArrayOfSaveStopFromPointArgs }
     * 
     */
    public ArrayOfSaveStopFromPointArgs createArrayOfSaveStopFromPointArgs() {
        return new ArrayOfSaveStopFromPointArgs();
    }

    /**
     * Create an instance of {@link SaveStopFromPointArgs }
     * 
     */
    public SaveStopFromPointArgs createSaveStopFromPointArgs() {
        return new SaveStopFromPointArgs();
    }

    /**
     * Create an instance of {@link ScheduleEquipmentMaintenanceArgs }
     * 
     */
    public ScheduleEquipmentMaintenanceArgs createScheduleEquipmentMaintenanceArgs() {
        return new ScheduleEquipmentMaintenanceArgs();
    }

    /**
     * Create an instance of {@link ArrayOfSuggestLayoverResultSuggestion }
     * 
     */
    public ArrayOfSuggestLayoverResultSuggestion createArrayOfSuggestLayoverResultSuggestion() {
        return new ArrayOfSuggestLayoverResultSuggestion();
    }

    /**
     * Create an instance of {@link SuggestLayoverResultSuggestion }
     * 
     */
    public SuggestLayoverResultSuggestion createSuggestLayoverResultSuggestion() {
        return new SuggestLayoverResultSuggestion();
    }

    /**
     * Create an instance of {@link OnStopPlacementInfo }
     * 
     */
    public OnStopPlacementInfo createOnStopPlacementInfo() {
        return new OnStopPlacementInfo();
    }

    /**
     * Create an instance of {@link SendSmsResult }
     * 
     */
    public SendSmsResult createSendSmsResult() {
        return new SendSmsResult();
    }

    /**
     * Create an instance of {@link OnTerritoryAutomaticPlacement }
     * 
     */
    public OnTerritoryAutomaticPlacement createOnTerritoryAutomaticPlacement() {
        return new OnTerritoryAutomaticPlacement();
    }

    /**
     * Create an instance of {@link OnRouteAutomaticPlacement }
     * 
     */
    public OnRouteAutomaticPlacement createOnRouteAutomaticPlacement() {
        return new OnRouteAutomaticPlacement();
    }

    /**
     * Create an instance of {@link DrivingDirectionsStep }
     * 
     */
    public DrivingDirectionsStep createDrivingDirectionsStep() {
        return new DrivingDirectionsStep();
    }

    /**
     * Create an instance of {@link LineItemActuals }
     * 
     */
    public LineItemActuals createLineItemActuals() {
        return new LineItemActuals();
    }

    /**
     * Create an instance of {@link RouteDescriptor }
     * 
     */
    public RouteDescriptor createRouteDescriptor() {
        return new RouteDescriptor();
    }

    /**
     * Create an instance of {@link MobileDeviceAction }
     * 
     */
    public MobileDeviceAction createMobileDeviceAction() {
        return new MobileDeviceAction();
    }

    /**
     * Create an instance of {@link RemoveStopsAction }
     * 
     */
    public RemoveStopsAction createRemoveStopsAction() {
        return new RemoveStopsAction();
    }

    /**
     * Create an instance of {@link DiagnosticTroubleCodeUpdateAction }
     * 
     */
    public DiagnosticTroubleCodeUpdateAction createDiagnosticTroubleCodeUpdateAction() {
        return new DiagnosticTroubleCodeUpdateAction();
    }

    /**
     * Create an instance of {@link ActiveTroubleCodesUpdateActionDiagnosticTroubleCode }
     * 
     */
    public ActiveTroubleCodesUpdateActionDiagnosticTroubleCode createActiveTroubleCodesUpdateActionDiagnosticTroubleCode() {
        return new ActiveTroubleCodesUpdateActionDiagnosticTroubleCode();
    }

    /**
     * Create an instance of {@link ActiveTroubleCodesUpdateActionJ1587TroubleCode }
     * 
     */
    public ActiveTroubleCodesUpdateActionJ1587TroubleCode createActiveTroubleCodesUpdateActionJ1587TroubleCode() {
        return new ActiveTroubleCodesUpdateActionJ1587TroubleCode();
    }

    /**
     * Create an instance of {@link ActiveTroubleCodesUpdateActionJ1939TroubleCode }
     * 
     */
    public ActiveTroubleCodesUpdateActionJ1939TroubleCode createActiveTroubleCodesUpdateActionJ1939TroubleCode() {
        return new ActiveTroubleCodesUpdateActionJ1939TroubleCode();
    }

    /**
     * Create an instance of {@link ActiveTroubleCodesUpdateActionOBD2TroubleCode }
     * 
     */
    public ActiveTroubleCodesUpdateActionOBD2TroubleCode createActiveTroubleCodesUpdateActionOBD2TroubleCode() {
        return new ActiveTroubleCodesUpdateActionOBD2TroubleCode();
    }

    /**
     * Create an instance of {@link LogOffAction }
     * 
     */
    public LogOffAction createLogOffAction() {
        return new LogOffAction();
    }

    /**
     * Create an instance of {@link LogOnAction }
     * 
     */
    public LogOnAction createLogOnAction() {
        return new LogOnAction();
    }

    /**
     * Create an instance of {@link ReportClientApplicationInfoAction }
     * 
     */
    public ReportClientApplicationInfoAction createReportClientApplicationInfoAction() {
        return new ReportClientApplicationInfoAction();
    }

    /**
     * Create an instance of {@link GroupStopBasedAction }
     * 
     */
    public GroupStopBasedAction createGroupStopBasedAction() {
        return new GroupStopBasedAction();
    }

    /**
     * Create an instance of {@link ArriveGroupStopAction }
     * 
     */
    public ArriveGroupStopAction createArriveGroupStopAction() {
        return new ArriveGroupStopAction();
    }

    /**
     * Create an instance of {@link DepartGroupStopAction }
     * 
     */
    public DepartGroupStopAction createDepartGroupStopAction() {
        return new DepartGroupStopAction();
    }

    /**
     * Create an instance of {@link RouteOptimizationResponseAction }
     * 
     */
    public RouteOptimizationResponseAction createRouteOptimizationResponseAction() {
        return new RouteOptimizationResponseAction();
    }

    /**
     * Create an instance of {@link SendCompressedDataSetAction }
     * 
     */
    public SendCompressedDataSetAction createSendCompressedDataSetAction() {
        return new SendCompressedDataSetAction();
    }

    /**
     * Create an instance of {@link StationaryEndAction }
     * 
     */
    public StationaryEndAction createStationaryEndAction() {
        return new StationaryEndAction();
    }

    /**
     * Create an instance of {@link StationaryStartAction }
     * 
     */
    public StationaryStartAction createStationaryStartAction() {
        return new StationaryStartAction();
    }

    /**
     * Create an instance of {@link EquipmentDropHookAction }
     * 
     */
    public EquipmentDropHookAction createEquipmentDropHookAction() {
        return new EquipmentDropHookAction();
    }

    /**
     * Create an instance of {@link TelematicsDeviceCommsStatusUpdateAction }
     * 
     */
    public TelematicsDeviceCommsStatusUpdateAction createTelematicsDeviceCommsStatusUpdateAction() {
        return new TelematicsDeviceCommsStatusUpdateAction();
    }

    /**
     * Create an instance of {@link TelematicsDeviceIgnitionKillSwitchResponseAction }
     * 
     */
    public TelematicsDeviceIgnitionKillSwitchResponseAction createTelematicsDeviceIgnitionKillSwitchResponseAction() {
        return new TelematicsDeviceIgnitionKillSwitchResponseAction();
    }

    /**
     * Create an instance of {@link TelematicsDeviceOutputChangeResponseAction }
     * 
     */
    public TelematicsDeviceOutputChangeResponseAction createTelematicsDeviceOutputChangeResponseAction() {
        return new TelematicsDeviceOutputChangeResponseAction();
    }

    /**
     * Create an instance of {@link ServiceConfirmationAction }
     * 
     */
    public ServiceConfirmationAction createServiceConfirmationAction() {
        return new ServiceConfirmationAction();
    }

    /**
     * Create an instance of {@link ArrayOfServiceConfirmationInfo }
     * 
     */
    public ArrayOfServiceConfirmationInfo createArrayOfServiceConfirmationInfo() {
        return new ArrayOfServiceConfirmationInfo();
    }

    /**
     * Create an instance of {@link VehicleBusInfoUpdateAction }
     * 
     */
    public VehicleBusInfoUpdateAction createVehicleBusInfoUpdateAction() {
        return new VehicleBusInfoUpdateAction();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleBusComponent }
     * 
     */
    public ArrayOfVehicleBusComponent createArrayOfVehicleBusComponent() {
        return new ArrayOfVehicleBusComponent();
    }

    /**
     * Create an instance of {@link ActiveTroubleCodesUpdateAction }
     * 
     */
    public ActiveTroubleCodesUpdateAction createActiveTroubleCodesUpdateAction() {
        return new ActiveTroubleCodesUpdateAction();
    }

    /**
     * Create an instance of {@link ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode }
     * 
     */
    public ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode createArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode() {
        return new ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode();
    }

    /**
     * Create an instance of {@link AddNonServiceableStopAction }
     * 
     */
    public AddNonServiceableStopAction createAddNonServiceableStopAction() {
        return new AddNonServiceableStopAction();
    }

    /**
     * Create an instance of {@link AssociateStationaryEventAction }
     * 
     */
    public AssociateStationaryEventAction createAssociateStationaryEventAction() {
        return new AssociateStationaryEventAction();
    }

    /**
     * Create an instance of {@link LineItemAddOrUpdateAction }
     * 
     */
    public LineItemAddOrUpdateAction createLineItemAddOrUpdateAction() {
        return new LineItemAddOrUpdateAction();
    }

    /**
     * Create an instance of {@link LocationCommentsDeleteAction }
     * 
     */
    public LocationCommentsDeleteAction createLocationCommentsDeleteAction() {
        return new LocationCommentsDeleteAction();
    }

    /**
     * Create an instance of {@link LocationCommentsSaveAction }
     * 
     */
    public LocationCommentsSaveAction createLocationCommentsSaveAction() {
        return new LocationCommentsSaveAction();
    }

    /**
     * Create an instance of {@link ArrayOfLocationCommentParam }
     * 
     */
    public ArrayOfLocationCommentParam createArrayOfLocationCommentParam() {
        return new ArrayOfLocationCommentParam();
    }

    /**
     * Create an instance of {@link NavClientAction }
     * 
     */
    public NavClientAction createNavClientAction() {
        return new NavClientAction();
    }

    /**
     * Create an instance of {@link NavClientRoutePathDeviationAction }
     * 
     */
    public NavClientRoutePathDeviationAction createNavClientRoutePathDeviationAction() {
        return new NavClientRoutePathDeviationAction();
    }

    /**
     * Create an instance of {@link NavClientApplicationStateChangedAction }
     * 
     */
    public NavClientApplicationStateChangedAction createNavClientApplicationStateChangedAction() {
        return new NavClientApplicationStateChangedAction();
    }

    /**
     * Create an instance of {@link NavClientDestinationArrivalAction }
     * 
     */
    public NavClientDestinationArrivalAction createNavClientDestinationArrivalAction() {
        return new NavClientDestinationArrivalAction();
    }

    /**
     * Create an instance of {@link NavClientRecalculationAction }
     * 
     */
    public NavClientRecalculationAction createNavClientRecalculationAction() {
        return new NavClientRecalculationAction();
    }

    /**
     * Create an instance of {@link NavClientSpeedAlertAction }
     * 
     */
    public NavClientSpeedAlertAction createNavClientSpeedAlertAction() {
        return new NavClientSpeedAlertAction();
    }

    /**
     * Create an instance of {@link NavClientStartRouteAction }
     * 
     */
    public NavClientStartRouteAction createNavClientStartRouteAction() {
        return new NavClientStartRouteAction();
    }

    /**
     * Create an instance of {@link NavClientWorkerChangedAction }
     * 
     */
    public NavClientWorkerChangedAction createNavClientWorkerChangedAction() {
        return new NavClientWorkerChangedAction();
    }

    /**
     * Create an instance of {@link TelematicsDeviceInputChangedAction }
     * 
     */
    public TelematicsDeviceInputChangedAction createTelematicsDeviceInputChangedAction() {
        return new TelematicsDeviceInputChangedAction();
    }

    /**
     * Create an instance of {@link PanicButtonTriggeredAction }
     * 
     */
    public PanicButtonTriggeredAction createPanicButtonTriggeredAction() {
        return new PanicButtonTriggeredAction();
    }

    /**
     * Create an instance of {@link WorkerStatusUpdateAction }
     * 
     */
    public WorkerStatusUpdateAction createWorkerStatusUpdateAction() {
        return new WorkerStatusUpdateAction();
    }

    /**
     * Create an instance of {@link CustomFormResponseAction }
     * 
     */
    public CustomFormResponseAction createCustomFormResponseAction() {
        return new CustomFormResponseAction();
    }

    /**
     * Create an instance of {@link ArrayOfCustomFormResponseInfo }
     * 
     */
    public ArrayOfCustomFormResponseInfo createArrayOfCustomFormResponseInfo() {
        return new ArrayOfCustomFormResponseInfo();
    }

    /**
     * Create an instance of {@link LineItemUpdateAction }
     * 
     */
    public LineItemUpdateAction createLineItemUpdateAction() {
        return new LineItemUpdateAction();
    }

    /**
     * Create an instance of {@link OrderUpdateAction }
     * 
     */
    public OrderUpdateAction createOrderUpdateAction() {
        return new OrderUpdateAction();
    }

    /**
     * Create an instance of {@link StopBasedActionDto }
     * 
     */
    public StopBasedActionDto createStopBasedActionDto() {
        return new StopBasedActionDto();
    }

    /**
     * Create an instance of {@link DetailItemVerificationAction }
     * 
     */
    public DetailItemVerificationAction createDetailItemVerificationAction() {
        return new DetailItemVerificationAction();
    }

    /**
     * Create an instance of {@link ArrayOfDetailItem }
     * 
     */
    public ArrayOfDetailItem createArrayOfDetailItem() {
        return new ArrayOfDetailItem();
    }

    /**
     * Create an instance of {@link DetailItem }
     * 
     */
    public DetailItem createDetailItem() {
        return new DetailItem();
    }

    /**
     * Create an instance of {@link DeliveryDetailsUpdateActionOrderDetailItem }
     * 
     */
    public DeliveryDetailsUpdateActionOrderDetailItem createDeliveryDetailsUpdateActionOrderDetailItem() {
        return new DeliveryDetailsUpdateActionOrderDetailItem();
    }

    /**
     * Create an instance of {@link DeliveryDetailsUpdateActionDetailItemQuantities }
     * 
     */
    public DeliveryDetailsUpdateActionDetailItemQuantities createDeliveryDetailsUpdateActionDetailItemQuantities() {
        return new DeliveryDetailsUpdateActionDetailItemQuantities();
    }

    /**
     * Create an instance of {@link StopManipulationAction }
     * 
     */
    public StopManipulationAction createStopManipulationAction() {
        return new StopManipulationAction();
    }

    /**
     * Create an instance of {@link OnStopPlacement }
     * 
     */
    public OnStopPlacement createOnStopPlacement() {
        return new OnStopPlacement();
    }

    /**
     * Create an instance of {@link OnRoutePlacement }
     * 
     */
    public OnRoutePlacement createOnRoutePlacement() {
        return new OnRoutePlacement();
    }

    /**
     * Create an instance of {@link OnDeviceStopPlacement }
     * 
     */
    public OnDeviceStopPlacement createOnDeviceStopPlacement() {
        return new OnDeviceStopPlacement();
    }

    /**
     * Create an instance of {@link OnRouteByIndicesPlacement }
     * 
     */
    public OnRouteByIndicesPlacement createOnRouteByIndicesPlacement() {
        return new OnRouteByIndicesPlacement();
    }

    /**
     * Create an instance of {@link ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex }
     * 
     */
    public ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex createArrayOfOnRouteByIndicesPlacementTaskTypeToIndex() {
        return new ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex();
    }

    /**
     * Create an instance of {@link OnRouteByIndicesPlacementTaskTypeToIndex }
     * 
     */
    public OnRouteByIndicesPlacementTaskTypeToIndex createOnRouteByIndicesPlacementTaskTypeToIndex() {
        return new OnRouteByIndicesPlacementTaskTypeToIndex();
    }

    /**
     * Create an instance of {@link DepartStopAction }
     * 
     */
    public DepartStopAction createDepartStopAction() {
        return new DepartStopAction();
    }

    /**
     * Create an instance of {@link GeocodeStopAction }
     * 
     */
    public GeocodeStopAction createGeocodeStopAction() {
        return new GeocodeStopAction();
    }

    /**
     * Create an instance of {@link ReserviceStopAction }
     * 
     */
    public ReserviceStopAction createReserviceStopAction() {
        return new ReserviceStopAction();
    }

    /**
     * Create an instance of {@link ServiceStopAction }
     * 
     */
    public ServiceStopAction createServiceStopAction() {
        return new ServiceStopAction();
    }

    /**
     * Create an instance of {@link ArriveStopAction }
     * 
     */
    public ArriveStopAction createArriveStopAction() {
        return new ArriveStopAction();
    }

    /**
     * Create an instance of {@link StopSignatureAction }
     * 
     */
    public StopSignatureAction createStopSignatureAction() {
        return new StopSignatureAction();
    }

    /**
     * Create an instance of {@link IgnitionStateChangedAction }
     * 
     */
    public IgnitionStateChangedAction createIgnitionStateChangedAction() {
        return new IgnitionStateChangedAction();
    }

    /**
     * Create an instance of {@link VehicleStatusUpdateAction }
     * 
     */
    public VehicleStatusUpdateAction createVehicleStatusUpdateAction() {
        return new VehicleStatusUpdateAction();
    }

    /**
     * Create an instance of {@link TelematicsDeviceDiagnosticsUpdateAction }
     * 
     */
    public TelematicsDeviceDiagnosticsUpdateAction createTelematicsDeviceDiagnosticsUpdateAction() {
        return new TelematicsDeviceDiagnosticsUpdateAction();
    }

    /**
     * Create an instance of {@link HarshDrivingAction }
     * 
     */
    public HarshDrivingAction createHarshDrivingAction() {
        return new HarshDrivingAction();
    }

    /**
     * Create an instance of {@link AddServiceableStopAction }
     * 
     */
    public AddServiceableStopAction createAddServiceableStopAction() {
        return new AddServiceableStopAction();
    }

    /**
     * Create an instance of {@link EndBreakAction }
     * 
     */
    public EndBreakAction createEndBreakAction() {
        return new EndBreakAction();
    }

    /**
     * Create an instance of {@link EndWorkAction }
     * 
     */
    public EndWorkAction createEndWorkAction() {
        return new EndWorkAction();
    }

    /**
     * Create an instance of {@link ResequencePendingStopsAction }
     * 
     */
    public ResequencePendingStopsAction createResequencePendingStopsAction() {
        return new ResequencePendingStopsAction();
    }

    /**
     * Create an instance of {@link StartBreakAction }
     * 
     */
    public StartBreakAction createStartBreakAction() {
        return new StartBreakAction();
    }

    /**
     * Create an instance of {@link StartWorkAction }
     * 
     */
    public StartWorkAction createStartWorkAction() {
        return new StartWorkAction();
    }

    /**
     * Create an instance of {@link BatteryDiagnosticsUpdateAction }
     * 
     */
    public BatteryDiagnosticsUpdateAction createBatteryDiagnosticsUpdateAction() {
        return new BatteryDiagnosticsUpdateAction();
    }

    /**
     * Create an instance of {@link PositionUpdateAction }
     * 
     */
    public PositionUpdateAction createPositionUpdateAction() {
        return new PositionUpdateAction();
    }

    /**
     * Create an instance of {@link UpdateNonServiceableStopAction }
     * 
     */
    public UpdateNonServiceableStopAction createUpdateNonServiceableStopAction() {
        return new UpdateNonServiceableStopAction();
    }

    /**
     * Create an instance of {@link ArriveDestinationAction }
     * 
     */
    public ArriveDestinationAction createArriveDestinationAction() {
        return new ArriveDestinationAction();
    }

    /**
     * Create an instance of {@link CancelStopsAction }
     * 
     */
    public CancelStopsAction createCancelStopsAction() {
        return new CancelStopsAction();
    }

    /**
     * Create an instance of {@link CompleteRouteAction }
     * 
     */
    public CompleteRouteAction createCompleteRouteAction() {
        return new CompleteRouteAction();
    }

    /**
     * Create an instance of {@link DepartOriginAction }
     * 
     */
    public DepartOriginAction createDepartOriginAction() {
        return new DepartOriginAction();
    }

    /**
     * Create an instance of {@link ResequenceStopAction }
     * 
     */
    public ResequenceStopAction createResequenceStopAction() {
        return new ResequenceStopAction();
    }

    /**
     * Create an instance of {@link SendNoteAction }
     * 
     */
    public SendNoteAction createSendNoteAction() {
        return new SendNoteAction();
    }

    /**
     * Create an instance of {@link SendNoteActionRouteNoteMessageArgs }
     * 
     */
    public SendNoteActionRouteNoteMessageArgs createSendNoteActionRouteNoteMessageArgs() {
        return new SendNoteActionRouteNoteMessageArgs();
    }

    /**
     * Create an instance of {@link SendNoteActionStopNoteMessageArgs }
     * 
     */
    public SendNoteActionStopNoteMessageArgs createSendNoteActionStopNoteMessageArgs() {
        return new SendNoteActionStopNoteMessageArgs();
    }

    /**
     * Create an instance of {@link SendNoteActionOrderNoteMessageArgs }
     * 
     */
    public SendNoteActionOrderNoteMessageArgs createSendNoteActionOrderNoteMessageArgs() {
        return new SendNoteActionOrderNoteMessageArgs();
    }

    /**
     * Create an instance of {@link SendNoteActionLineItemNoteMessageArgs }
     * 
     */
    public SendNoteActionLineItemNoteMessageArgs createSendNoteActionLineItemNoteMessageArgs() {
        return new SendNoteActionLineItemNoteMessageArgs();
    }

    /**
     * Create an instance of {@link StartRouteAction }
     * 
     */
    public StartRouteAction createStartRouteAction() {
        return new StartRouteAction();
    }

    /**
     * Create an instance of {@link DeliveryDetailsUpdateAction }
     * 
     */
    public DeliveryDetailsUpdateAction createDeliveryDetailsUpdateAction() {
        return new DeliveryDetailsUpdateAction();
    }

    /**
     * Create an instance of {@link OrderActuals }
     * 
     */
    public OrderActuals createOrderActuals() {
        return new OrderActuals();
    }

    /**
     * Create an instance of {@link ArrayOfLineItemActuals }
     * 
     */
    public ArrayOfLineItemActuals createArrayOfLineItemActuals() {
        return new ArrayOfLineItemActuals();
    }

    /**
     * Create an instance of {@link OnTerritoryPlacement }
     * 
     */
    public OnTerritoryPlacement createOnTerritoryPlacement() {
        return new OnTerritoryPlacement();
    }

    /**
     * Create an instance of {@link OnTerritoryAndRoutesPlacement }
     * 
     */
    public OnTerritoryAndRoutesPlacement createOnTerritoryAndRoutesPlacement() {
        return new OnTerritoryAndRoutesPlacement();
    }

    /**
     * Create an instance of {@link ArrayOfStopActuals }
     * 
     */
    public ArrayOfStopActuals createArrayOfStopActuals() {
        return new ArrayOfStopActuals();
    }

    /**
     * Create an instance of {@link StopActuals }
     * 
     */
    public StopActuals createStopActuals() {
        return new StopActuals();
    }

    /**
     * Create an instance of {@link ServiceableStopActuals }
     * 
     */
    public ServiceableStopActuals createServiceableStopActuals() {
        return new ServiceableStopActuals();
    }

    /**
     * Create an instance of {@link ArrayOfOrderActuals }
     * 
     */
    public ArrayOfOrderActuals createArrayOfOrderActuals() {
        return new ArrayOfOrderActuals();
    }

    /**
     * Create an instance of {@link ServiceTimeAdjustToConstantOptions }
     * 
     */
    public ServiceTimeAdjustToConstantOptions createServiceTimeAdjustToConstantOptions() {
        return new ServiceTimeAdjustToConstantOptions();
    }

    /**
     * Create an instance of {@link ServiceTimeAdjustByPercentageOptions }
     * 
     */
    public ServiceTimeAdjustByPercentageOptions createServiceTimeAdjustByPercentageOptions() {
        return new ServiceTimeAdjustByPercentageOptions();
    }

    /**
     * Create an instance of {@link ServiceTimeRemoveAdjustmentOptions }
     * 
     */
    public ServiceTimeRemoveAdjustmentOptions createServiceTimeRemoveAdjustmentOptions() {
        return new ServiceTimeRemoveAdjustmentOptions();
    }

    /**
     * Create an instance of {@link ArrayOfSuggestRouteTemplateResultSuggestion }
     * 
     */
    public ArrayOfSuggestRouteTemplateResultSuggestion createArrayOfSuggestRouteTemplateResultSuggestion() {
        return new ArrayOfSuggestRouteTemplateResultSuggestion();
    }

    /**
     * Create an instance of {@link SuggestRouteTemplateResultSuggestion }
     * 
     */
    public SuggestRouteTemplateResultSuggestion createSuggestRouteTemplateResultSuggestion() {
        return new SuggestRouteTemplateResultSuggestion();
    }

    /**
     * Create an instance of {@link OnStopTemplatePlacement }
     * 
     */
    public OnStopTemplatePlacement createOnStopTemplatePlacement() {
        return new OnStopTemplatePlacement();
    }

    /**
     * Create an instance of {@link OnRouteTemplatePlacement }
     * 
     */
    public OnRouteTemplatePlacement createOnRouteTemplatePlacement() {
        return new OnRouteTemplatePlacement();
    }

    /**
     * Create an instance of {@link ShortestPathCriteria }
     * 
     */
    public ShortestPathCriteria createShortestPathCriteria() {
        return new ShortestPathCriteria();
    }

    /**
     * Create an instance of {@link DeliveryDetailsUpdateActionLineItemDetailItem }
     * 
     */
    public DeliveryDetailsUpdateActionLineItemDetailItem createDeliveryDetailsUpdateActionLineItemDetailItem() {
        return new DeliveryDetailsUpdateActionLineItemDetailItem();
    }

    /**
     * Create an instance of {@link ArrayOfSaveRoutePlanStopArgs }
     * 
     */
    public ArrayOfSaveRoutePlanStopArgs createArrayOfSaveRoutePlanStopArgs() {
        return new ArrayOfSaveRoutePlanStopArgs();
    }

    /**
     * Create an instance of {@link UndeleteEntityResult }
     * 
     */
    public UndeleteEntityResult createUndeleteEntityResult() {
        return new UndeleteEntityResult();
    }

    /**
     * Create an instance of {@link RouteStopInstances }
     * 
     */
    public RouteStopInstances createRouteStopInstances() {
        return new RouteStopInstances();
    }

    /**
     * Create an instance of {@link RouteStopTaskInstances }
     * 
     */
    public RouteStopTaskInstances createRouteStopTaskInstances() {
        return new RouteStopTaskInstances();
    }

    /**
     * Create an instance of {@link ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError }
     * 
     */
    public ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError createArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError() {
        return new ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError();
    }

    /**
     * Create an instance of {@link CreateCellsFromRoutesResultCreateCellsFromRoutesError }
     * 
     */
    public CreateCellsFromRoutesResultCreateCellsFromRoutesError createCreateCellsFromRoutesResultCreateCellsFromRoutesError() {
        return new CreateCellsFromRoutesResultCreateCellsFromRoutesError();
    }

    /**
     * Create an instance of {@link CalculateRouteResult }
     * 
     */
    public CalculateRouteResult createCalculateRouteResult() {
        return new CalculateRouteResult();
    }

    /**
     * Create an instance of {@link ArrayOfLockOrderResultsLockOrderFailure }
     * 
     */
    public ArrayOfLockOrderResultsLockOrderFailure createArrayOfLockOrderResultsLockOrderFailure() {
        return new ArrayOfLockOrderResultsLockOrderFailure();
    }

    /**
     * Create an instance of {@link LockOrderResultsLockOrderFailure }
     * 
     */
    public LockOrderResultsLockOrderFailure createLockOrderResultsLockOrderFailure() {
        return new LockOrderResultsLockOrderFailure();
    }

    /**
     * Create an instance of {@link LockOrderResultsLockOrdersForStopFailure }
     * 
     */
    public LockOrderResultsLockOrdersForStopFailure createLockOrderResultsLockOrdersForStopFailure() {
        return new LockOrderResultsLockOrdersForStopFailure();
    }

    /**
     * Create an instance of {@link LockOrderResultsLockOrdersForRouteFailure }
     * 
     */
    public LockOrderResultsLockOrdersForRouteFailure createLockOrderResultsLockOrdersForRouteFailure() {
        return new LockOrderResultsLockOrdersForRouteFailure();
    }

    /**
     * Create an instance of {@link UpgradeRoadnetTelematicsDeviceConfigurationInfo }
     * 
     */
    public UpgradeRoadnetTelematicsDeviceConfigurationInfo createUpgradeRoadnetTelematicsDeviceConfigurationInfo() {
        return new UpgradeRoadnetTelematicsDeviceConfigurationInfo();
    }

    /**
     * Create an instance of {@link SaveRouteTemplateFromRouteResult }
     * 
     */
    public SaveRouteTemplateFromRouteResult createSaveRouteTemplateFromRouteResult() {
        return new SaveRouteTemplateFromRouteResult();
    }

    /**
     * Create an instance of {@link ArrayOfSendOrdersPropertyResult }
     * 
     */
    public ArrayOfSendOrdersPropertyResult createArrayOfSendOrdersPropertyResult() {
        return new ArrayOfSendOrdersPropertyResult();
    }

    /**
     * Create an instance of {@link SendOrdersPropertyResult }
     * 
     */
    public SendOrdersPropertyResult createSendOrdersPropertyResult() {
        return new SendOrdersPropertyResult();
    }

    /**
     * Create an instance of {@link ArrayOfSuggestRouteResultSuggestion }
     * 
     */
    public ArrayOfSuggestRouteResultSuggestion createArrayOfSuggestRouteResultSuggestion() {
        return new ArrayOfSuggestRouteResultSuggestion();
    }

    /**
     * Create an instance of {@link SuggestRouteResultSuggestion }
     * 
     */
    public SuggestRouteResultSuggestion createSuggestRouteResultSuggestion() {
        return new SuggestRouteResultSuggestion();
    }

    /**
     * Create an instance of {@link LogFile }
     * 
     */
    public LogFile createLogFile() {
        return new LogFile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnStopPlacementInfoOnStopPlacementStopType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnStopPlacementInfo.OnStopPlacementStopType")
    public JAXBElement<OnStopPlacementInfoOnStopPlacementStopType> createOnStopPlacementInfoOnStopPlacementStopType(OnStopPlacementInfoOnStopPlacementStopType value) {
        return new JAXBElement<OnStopPlacementInfoOnStopPlacementStopType>(_OnStopPlacementInfoOnStopPlacementStopType_QNAME, OnStopPlacementInfoOnStopPlacementStopType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOrdersPropertyResultErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendOrdersPropertyResult.ErrorType")
    public JAXBElement<SendOrdersPropertyResultErrorType> createSendOrdersPropertyResultErrorType(SendOrdersPropertyResultErrorType value) {
        return new JAXBElement<SendOrdersPropertyResultErrorType>(_SendOrdersPropertyResultErrorType_QNAME, SendOrdersPropertyResultErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteTemplateFromRouteResultOperationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveRouteTemplateFromRouteResult.OperationResult")
    public JAXBElement<SaveRouteTemplateFromRouteResultOperationResult> createSaveRouteTemplateFromRouteResultOperationResult(SaveRouteTemplateFromRouteResultOperationResult value) {
        return new JAXBElement<SaveRouteTemplateFromRouteResultOperationResult>(_SaveRouteTemplateFromRouteResultOperationResult_QNAME, SaveRouteTemplateFromRouteResultOperationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsResultStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendSmsResult.Status")
    public JAXBElement<SendSmsResultStatus> createSendSmsResultStatus(SendSmsResultStatus value) {
        return new JAXBElement<SendSmsResultStatus>(_SendSmsResultStatus_QNAME, SendSmsResultStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteTemplateCandidatesEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SuggestRouteTemplateCandidates.EntityType")
    public JAXBElement<SuggestRouteTemplateCandidatesEntityType> createSuggestRouteTemplateCandidatesEntityType(SuggestRouteTemplateCandidatesEntityType value) {
        return new JAXBElement<SuggestRouteTemplateCandidatesEntityType>(_SuggestRouteTemplateCandidatesEntityType_QNAME, SuggestRouteTemplateCandidatesEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteRetrievalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteRetrievalType")
    public JAXBElement<RouteRetrievalType> createRouteRetrievalType(RouteRetrievalType value) {
        return new JAXBElement<RouteRetrievalType>(_RouteRetrievalType_QNAME, RouteRetrievalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlashStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "FlashStatus")
    public JAXBElement<FlashStatus> createFlashStatus(FlashStatus value) {
        return new JAXBElement<FlashStatus>(_FlashStatus_QNAME, FlashStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LampStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LampStatus")
    public JAXBElement<LampStatus> createLampStatus(LampStatus value) {
        return new JAXBElement<LampStatus>(_LampStatus_QNAME, LampStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonServiceableStopType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NonServiceableStopType")
    public JAXBElement<NonServiceableStopType> createNonServiceableStopType(NonServiceableStopType value) {
        return new JAXBElement<NonServiceableStopType>(_NonServiceableStopType_QNAME, NonServiceableStopType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonServiceableStopPlacementMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NonServiceableStopPlacementMethodType")
    public JAXBElement<NonServiceableStopPlacementMethodType> createNonServiceableStopPlacementMethodType(NonServiceableStopPlacementMethodType value) {
        return new JAXBElement<NonServiceableStopPlacementMethodType>(_NonServiceableStopPlacementMethodType_QNAME, NonServiceableStopPlacementMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActiveTroubleCodesUpdateActionTroubleCodeState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ActiveTroubleCodesUpdateAction.TroubleCodeState")
    public JAXBElement<ActiveTroubleCodesUpdateActionTroubleCodeState> createActiveTroubleCodesUpdateActionTroubleCodeState(ActiveTroubleCodesUpdateActionTroubleCodeState value) {
        return new JAXBElement<ActiveTroubleCodesUpdateActionTroubleCodeState>(_ActiveTroubleCodesUpdateActionTroubleCodeState_QNAME, ActiveTroubleCodesUpdateActionTroubleCodeState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveRecurringOrderOptionsPlacementMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MoveRecurringOrderOptions.PlacementMethodType")
    public JAXBElement<MoveRecurringOrderOptionsPlacementMethodType> createMoveRecurringOrderOptionsPlacementMethodType(MoveRecurringOrderOptionsPlacementMethodType value) {
        return new JAXBElement<MoveRecurringOrderOptionsPlacementMethodType>(_MoveRecurringOrderOptionsPlacementMethodType_QNAME, MoveRecurringOrderOptionsPlacementMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientRecalculationReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientRecalculationReason")
    public JAXBElement<NavClientRecalculationReason> createNavClientRecalculationReason(NavClientRecalculationReason value) {
        return new JAXBElement<NavClientRecalculationReason>(_NavClientRecalculationReason_QNAME, NavClientRecalculationReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnTerritoryPlacementPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnTerritoryPlacement.Position")
    public JAXBElement<OnTerritoryPlacementPosition> createOnTerritoryPlacementPosition(OnTerritoryPlacementPosition value) {
        return new JAXBElement<OnTerritoryPlacementPosition>(_OnTerritoryPlacementPosition_QNAME, OnTerritoryPlacementPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringOrderPlacementPlacementMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RecurringOrderPlacement.PlacementMethod")
    public JAXBElement<RecurringOrderPlacementPlacementMethod> createRecurringOrderPlacementPlacementMethod(RecurringOrderPlacementPlacementMethod value) {
        return new JAXBElement<RecurringOrderPlacementPlacementMethod>(_RecurringOrderPlacementPlacementMethod_QNAME, RecurringOrderPlacementPlacementMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveStopFromPointArgsStopCreationMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveStopFromPointArgs.StopCreationMethod")
    public JAXBElement<SaveStopFromPointArgsStopCreationMethod> createSaveStopFromPointArgsStopCreationMethod(SaveStopFromPointArgsStopCreationMethod value) {
        return new JAXBElement<SaveStopFromPointArgsStopCreationMethod>(_SaveStopFromPointArgsStopCreationMethod_QNAME, SaveStopFromPointArgsStopCreationMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HarshDrivingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "HarshDrivingType")
    public JAXBElement<HarshDrivingType> createHarshDrivingType(HarshDrivingType value) {
        return new JAXBElement<HarshDrivingType>(_HarshDrivingType_QNAME, HarshDrivingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutomaticPlacementAutomaticPlacementGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AutomaticPlacement.AutomaticPlacementGoal")
    public JAXBElement<AutomaticPlacementAutomaticPlacementGoal> createAutomaticPlacementAutomaticPlacementGoal(AutomaticPlacementAutomaticPlacementGoal value) {
        return new JAXBElement<AutomaticPlacementAutomaticPlacementGoal>(_AutomaticPlacementAutomaticPlacementGoal_QNAME, AutomaticPlacementAutomaticPlacementGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AutomaticPlacement.IgnoreFlags")
    public JAXBElement<List<String>> createAutomaticPlacementIgnoreFlags(List<String> value) {
        return new JAXBElement<List<String>>(_AutomaticPlacementIgnoreFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnRoutePlacementPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnRoutePlacement.Position")
    public JAXBElement<OnRoutePlacementPosition> createOnRoutePlacementPosition(OnRoutePlacementPosition value) {
        return new JAXBElement<OnRoutePlacementPosition>(_OnRoutePlacementPosition_QNAME, OnRoutePlacementPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnRouteTemplatePlacementPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnRouteTemplatePlacement.Position")
    public JAXBElement<OnRouteTemplatePlacementPosition> createOnRouteTemplatePlacementPosition(OnRouteTemplatePlacementPosition value) {
        return new JAXBElement<OnRouteTemplatePlacementPosition>(_OnRouteTemplatePlacementPosition_QNAME, OnRouteTemplatePlacementPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnStopPlacementPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnStopPlacement.Position")
    public JAXBElement<OnStopPlacementPosition> createOnStopPlacementPosition(OnStopPlacementPosition value) {
        return new JAXBElement<OnStopPlacementPosition>(_OnStopPlacementPosition_QNAME, OnStopPlacementPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnStopTemplatePlacementPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnStopTemplatePlacement.Position")
    public JAXBElement<OnStopTemplatePlacementPosition> createOnStopTemplatePlacementPosition(OnStopTemplatePlacementPosition value) {
        return new JAXBElement<OnStopTemplatePlacementPosition>(_OnStopTemplatePlacementPosition_QNAME, OnStopTemplatePlacementPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteTemplateFromRouteArgsUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveRouteTemplateFromRouteArgs.UpdateAction")
    public JAXBElement<SaveRouteTemplateFromRouteArgsUpdateAction> createSaveRouteTemplateFromRouteArgsUpdateAction(SaveRouteTemplateFromRouteArgsUpdateAction value) {
        return new JAXBElement<SaveRouteTemplateFromRouteArgsUpdateAction>(_SaveRouteTemplateFromRouteArgsUpdateAction_QNAME, SaveRouteTemplateFromRouteArgsUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildSameDayMatricesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "BuildSameDayMatricesOptions")
    public JAXBElement<BuildSameDayMatricesOptions> createBuildSameDayMatricesOptions(BuildSameDayMatricesOptions value) {
        return new JAXBElement<BuildSameDayMatricesOptions>(_BuildSameDayMatricesOptions_QNAME, BuildSameDayMatricesOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientActivationCodeRefreshStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientActivationCodeRefreshStatus")
    public JAXBElement<NavClientActivationCodeRefreshStatus> createNavClientActivationCodeRefreshStatus(NavClientActivationCodeRefreshStatus value) {
        return new JAXBElement<NavClientActivationCodeRefreshStatus>(_NavClientActivationCodeRefreshStatus_QNAME, NavClientActivationCodeRefreshStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientActivationCodeRefreshStatusErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientActivationCodeRefreshStatus.ErrorType")
    public JAXBElement<NavClientActivationCodeRefreshStatusErrorType> createNavClientActivationCodeRefreshStatusErrorType(NavClientActivationCodeRefreshStatusErrorType value) {
        return new JAXBElement<NavClientActivationCodeRefreshStatusErrorType>(_NavClientActivationCodeRefreshStatusErrorType_QNAME, NavClientActivationCodeRefreshStatusErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavDeviceStatusDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavDeviceStatusDto")
    public JAXBElement<NavDeviceStatusDto> createNavDeviceStatusDto(NavDeviceStatusDto value) {
        return new JAXBElement<NavDeviceStatusDto>(_NavDeviceStatusDto_QNAME, NavDeviceStatusDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRoutePlanOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveRoutePlanOptions")
    public JAXBElement<SaveRoutePlanOptions> createSaveRoutePlanOptions(SaveRoutePlanOptions value) {
        return new JAXBElement<SaveRoutePlanOptions>(_SaveRoutePlanOptions_QNAME, SaveRoutePlanOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayShiftOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DayShiftOptions")
    public JAXBElement<DayShiftOptions> createDayShiftOptions(DayShiftOptions value) {
        return new JAXBElement<DayShiftOptions>(_DayShiftOptions_QNAME, DayShiftOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRoutePlanRouteArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveRoutePlanRouteArgs")
    public JAXBElement<SaveRoutePlanRouteArgs> createSaveRoutePlanRouteArgs(SaveRoutePlanRouteArgs value) {
        return new JAXBElement<SaveRoutePlanRouteArgs>(_SaveRoutePlanRouteArgs_QNAME, SaveRoutePlanRouteArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ManipulationResult")
    public JAXBElement<ManipulationResult> createManipulationResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_ManipulationResult_QNAME, ManipulationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManipulationResultManipulationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfManipulationResult.ManipulationError")
    public JAXBElement<ArrayOfManipulationResultManipulationError> createArrayOfManipulationResultManipulationError(ArrayOfManipulationResultManipulationError value) {
        return new JAXBElement<ArrayOfManipulationResultManipulationError>(_ArrayOfManipulationResultManipulationError_QNAME, ArrayOfManipulationResultManipulationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResultManipulationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ManipulationResult.ManipulationError")
    public JAXBElement<ManipulationResultManipulationError> createManipulationResultManipulationError(ManipulationResultManipulationError value) {
        return new JAXBElement<ManipulationResultManipulationError>(_ManipulationResultManipulationError_QNAME, ManipulationResultManipulationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringOrderManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RecurringOrderManipulationResult")
    public JAXBElement<RecurringOrderManipulationResult> createRecurringOrderManipulationResult(RecurringOrderManipulationResult value) {
        return new JAXBElement<RecurringOrderManipulationResult>(_RecurringOrderManipulationResult_QNAME, RecurringOrderManipulationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveUnassignedOrderGroupsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MoveUnassignedOrderGroupsOptions")
    public JAXBElement<MoveUnassignedOrderGroupsOptions> createMoveUnassignedOrderGroupsOptions(MoveUnassignedOrderGroupsOptions value) {
        return new JAXBElement<MoveUnassignedOrderGroupsOptions>(_MoveUnassignedOrderGroupsOptions_QNAME, MoveUnassignedOrderGroupsOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRoutePlanStopArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveRoutePlanStopArgs")
    public JAXBElement<SaveRoutePlanStopArgs> createSaveRoutePlanStopArgs(SaveRoutePlanStopArgs value) {
        return new JAXBElement<SaveRoutePlanStopArgs>(_SaveRoutePlanStopArgs_QNAME, SaveRoutePlanStopArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreviewRouteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PreviewRouteOptions")
    public JAXBElement<PreviewRouteOptions> createPreviewRouteOptions(PreviewRouteOptions value) {
        return new JAXBElement<PreviewRouteOptions>(_PreviewRouteOptions_QNAME, PreviewRouteOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnplannedOriginParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UnplannedOriginParameters")
    public JAXBElement<UnplannedOriginParameters> createUnplannedOriginParameters(UnplannedOriginParameters value) {
        return new JAXBElement<UnplannedOriginParameters>(_UnplannedOriginParameters_QNAME, UnplannedOriginParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyRouteToSessionOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CopyRouteToSessionOptions")
    public JAXBElement<CopyRouteToSessionOptions> createCopyRouteToSessionOptions(CopyRouteToSessionOptions value) {
        return new JAXBElement<CopyRouteToSessionOptions>(_CopyRouteToSessionOptions_QNAME, CopyRouteToSessionOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRoutesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RetrieveRoutesOptions")
    public JAXBElement<RetrieveRoutesOptions> createRetrieveRoutesOptions(RetrieveRoutesOptions value) {
        return new JAXBElement<RetrieveRoutesOptions>(_RetrieveRoutesOptions_QNAME, RetrieveRoutesOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceConfirmationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceConfirmationInfo")
    public JAXBElement<ServiceConfirmationInfo> createServiceConfirmationInfo(ServiceConfirmationInfo value) {
        return new JAXBElement<ServiceConfirmationInfo>(_ServiceConfirmationInfo_QNAME, ServiceConfirmationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceConfirmationActionOrderIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfServiceConfirmationAction.OrderIdentity")
    public JAXBElement<ArrayOfServiceConfirmationActionOrderIdentity> createArrayOfServiceConfirmationActionOrderIdentity(ArrayOfServiceConfirmationActionOrderIdentity value) {
        return new JAXBElement<ArrayOfServiceConfirmationActionOrderIdentity>(_ArrayOfServiceConfirmationActionOrderIdentity_QNAME, ArrayOfServiceConfirmationActionOrderIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceConfirmationActionOrderIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceConfirmationAction.OrderIdentity")
    public JAXBElement<ServiceConfirmationActionOrderIdentity> createServiceConfirmationActionOrderIdentity(ServiceConfirmationActionOrderIdentity value) {
        return new JAXBElement<ServiceConfirmationActionOrderIdentity>(_ServiceConfirmationActionOrderIdentity_QNAME, ServiceConfirmationActionOrderIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleBusComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleBusComponent")
    public JAXBElement<VehicleBusComponent> createVehicleBusComponent(VehicleBusComponent value) {
        return new JAXBElement<VehicleBusComponent>(_VehicleBusComponent_QNAME, VehicleBusComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomFormResponseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CustomFormResponseInfo")
    public JAXBElement<CustomFormResponseInfo> createCustomFormResponseInfo(CustomFormResponseInfo value) {
        return new JAXBElement<CustomFormResponseInfo>(_CustomFormResponseInfo_QNAME, CustomFormResponseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DailyDistribution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DailyDistribution")
    public JAXBElement<DailyDistribution> createDailyDistribution(DailyDistribution value) {
        return new JAXBElement<DailyDistribution>(_DailyDistribution_QNAME, DailyDistribution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCommentParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LocationCommentParam")
    public JAXBElement<LocationCommentParam> createLocationCommentParam(LocationCommentParam value) {
        return new JAXBElement<LocationCommentParam>(_LocationCommentParam_QNAME, LocationCommentParam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveRecurringOrderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MoveRecurringOrderOptions")
    public JAXBElement<MoveRecurringOrderOptions> createMoveRecurringOrderOptions(MoveRecurringOrderOptions value) {
        return new JAXBElement<MoveRecurringOrderOptions>(_MoveRecurringOrderOptions_QNAME, MoveRecurringOrderOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringOrderPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RecurringOrderPlacement")
    public JAXBElement<RecurringOrderPlacement> createRecurringOrderPlacement(RecurringOrderPlacement value) {
        return new JAXBElement<RecurringOrderPlacement>(_RecurringOrderPlacement_QNAME, RecurringOrderPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnManualLoadDistributionPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnManualLoadDistributionPlacement")
    public JAXBElement<OnManualLoadDistributionPlacement> createOnManualLoadDistributionPlacement(OnManualLoadDistributionPlacement value) {
        return new JAXBElement<OnManualLoadDistributionPlacement>(_OnManualLoadDistributionPlacement_QNAME, OnManualLoadDistributionPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDailyDistribution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfDailyDistribution")
    public JAXBElement<ArrayOfDailyDistribution> createArrayOfDailyDistribution(ArrayOfDailyDistribution value) {
        return new JAXBElement<ArrayOfDailyDistribution>(_ArrayOfDailyDistribution_QNAME, ArrayOfDailyDistribution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnSwitchServicePatternPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnSwitchServicePatternPlacement")
    public JAXBElement<OnSwitchServicePatternPlacement> createOnSwitchServicePatternPlacement(OnSwitchServicePatternPlacement value) {
        return new JAXBElement<OnSwitchServicePatternPlacement>(_OnSwitchServicePatternPlacement_QNAME, OnSwitchServicePatternPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRouteFromPointsArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CreateRouteFromPointsArgs")
    public JAXBElement<CreateRouteFromPointsArgs> createCreateRouteFromPointsArgs(CreateRouteFromPointsArgs value) {
        return new JAXBElement<CreateRouteFromPointsArgs>(_CreateRouteFromPointsArgs_QNAME, CreateRouteFromPointsArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveStopFromPointArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfSaveStopFromPointArgs")
    public JAXBElement<ArrayOfSaveStopFromPointArgs> createArrayOfSaveStopFromPointArgs(ArrayOfSaveStopFromPointArgs value) {
        return new JAXBElement<ArrayOfSaveStopFromPointArgs>(_ArrayOfSaveStopFromPointArgs_QNAME, ArrayOfSaveStopFromPointArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveStopFromPointArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveStopFromPointArgs")
    public JAXBElement<SaveStopFromPointArgs> createSaveStopFromPointArgs(SaveStopFromPointArgs value) {
        return new JAXBElement<SaveStopFromPointArgs>(_SaveStopFromPointArgs_QNAME, SaveStopFromPointArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleEquipmentMaintenanceArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ScheduleEquipmentMaintenanceArgs")
    public JAXBElement<ScheduleEquipmentMaintenanceArgs> createScheduleEquipmentMaintenanceArgs(ScheduleEquipmentMaintenanceArgs value) {
        return new JAXBElement<ScheduleEquipmentMaintenanceArgs>(_ScheduleEquipmentMaintenanceArgs_QNAME, ScheduleEquipmentMaintenanceArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestLayoverResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SuggestLayoverResult")
    public JAXBElement<SuggestLayoverResult> createSuggestLayoverResult(SuggestLayoverResult value) {
        return new JAXBElement<SuggestLayoverResult>(_SuggestLayoverResult_QNAME, SuggestLayoverResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSuggestLayoverResultSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfSuggestLayoverResult.Suggestion")
    public JAXBElement<ArrayOfSuggestLayoverResultSuggestion> createArrayOfSuggestLayoverResultSuggestion(ArrayOfSuggestLayoverResultSuggestion value) {
        return new JAXBElement<ArrayOfSuggestLayoverResultSuggestion>(_ArrayOfSuggestLayoverResultSuggestion_QNAME, ArrayOfSuggestLayoverResultSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestLayoverResultSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SuggestLayoverResult.Suggestion")
    public JAXBElement<SuggestLayoverResultSuggestion> createSuggestLayoverResultSuggestion(SuggestLayoverResultSuggestion value) {
        return new JAXBElement<SuggestLayoverResultSuggestion>(_SuggestLayoverResultSuggestion_QNAME, SuggestLayoverResultSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRouteFromPointsArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UpdateRouteFromPointsArgs")
    public JAXBElement<UpdateRouteFromPointsArgs> createUpdateRouteFromPointsArgs(UpdateRouteFromPointsArgs value) {
        return new JAXBElement<UpdateRouteFromPointsArgs>(_UpdateRouteFromPointsArgs_QNAME, UpdateRouteFromPointsArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnStopPlacementInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnStopPlacementInfo")
    public JAXBElement<OnStopPlacementInfo> createOnStopPlacementInfo(OnStopPlacementInfo value) {
        return new JAXBElement<OnStopPlacementInfo>(_OnStopPlacementInfo_QNAME, OnStopPlacementInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCellsFromRoutesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CreateCellsFromRoutesOptions")
    public JAXBElement<CreateCellsFromRoutesOptions> createCreateCellsFromRoutesOptions(CreateCellsFromRoutesOptions value) {
        return new JAXBElement<CreateCellsFromRoutesOptions>(_CreateCellsFromRoutesOptions_QNAME, CreateCellsFromRoutesOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendSmsResult")
    public JAXBElement<SendSmsResult> createSendSmsResult(SendSmsResult value) {
        return new JAXBElement<SendSmsResult>(_SendSmsResult_QNAME, SendSmsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutomaticPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AutomaticPlacement")
    public JAXBElement<AutomaticPlacement> createAutomaticPlacement(AutomaticPlacement value) {
        return new JAXBElement<AutomaticPlacement>(_AutomaticPlacement_QNAME, AutomaticPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnTerritoryAutomaticPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnTerritoryAutomaticPlacement")
    public JAXBElement<OnTerritoryAutomaticPlacement> createOnTerritoryAutomaticPlacement(OnTerritoryAutomaticPlacement value) {
        return new JAXBElement<OnTerritoryAutomaticPlacement>(_OnTerritoryAutomaticPlacement_QNAME, OnTerritoryAutomaticPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnRouteAutomaticPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnRouteAutomaticPlacement")
    public JAXBElement<OnRouteAutomaticPlacement> createOnRouteAutomaticPlacement(OnRouteAutomaticPlacement value) {
        return new JAXBElement<OnRouteAutomaticPlacement>(_OnRouteAutomaticPlacement_QNAME, OnRouteAutomaticPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DrivingDirectionsStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DrivingDirectionsStep")
    public JAXBElement<DrivingDirectionsStep> createDrivingDirectionsStep(DrivingDirectionsStep value) {
        return new JAXBElement<DrivingDirectionsStep>(_DrivingDirectionsStep_QNAME, DrivingDirectionsStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LineItemActuals")
    public JAXBElement<LineItemActuals> createLineItemActuals(LineItemActuals value) {
        return new JAXBElement<LineItemActuals>(_LineItemActuals_QNAME, LineItemActuals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadRouteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LoadRouteOptions")
    public JAXBElement<LoadRouteOptions> createLoadRouteOptions(LoadRouteOptions value) {
        return new JAXBElement<LoadRouteOptions>(_LoadRouteOptions_QNAME, LoadRouteOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteDescriptor")
    public JAXBElement<RouteDescriptor> createRouteDescriptor(RouteDescriptor value) {
        return new JAXBElement<RouteDescriptor>(_RouteDescriptor_QNAME, RouteDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileDeviceAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MobileDeviceAction")
    public JAXBElement<MobileDeviceAction> createMobileDeviceAction(MobileDeviceAction value) {
        return new JAXBElement<MobileDeviceAction>(_MobileDeviceAction_QNAME, MobileDeviceAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStopsAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RemoveStopsAction")
    public JAXBElement<RemoveStopsAction> createRemoveStopsAction(RemoveStopsAction value) {
        return new JAXBElement<RemoveStopsAction>(_RemoveStopsAction_QNAME, RemoveStopsAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticTroubleCodeUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DiagnosticTroubleCodeUpdateAction")
    public JAXBElement<DiagnosticTroubleCodeUpdateAction> createDiagnosticTroubleCodeUpdateAction(DiagnosticTroubleCodeUpdateAction value) {
        return new JAXBElement<DiagnosticTroubleCodeUpdateAction>(_DiagnosticTroubleCodeUpdateAction_QNAME, DiagnosticTroubleCodeUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActiveTroubleCodesUpdateActionDiagnosticTroubleCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ActiveTroubleCodesUpdateAction.DiagnosticTroubleCode")
    public JAXBElement<ActiveTroubleCodesUpdateActionDiagnosticTroubleCode> createActiveTroubleCodesUpdateActionDiagnosticTroubleCode(ActiveTroubleCodesUpdateActionDiagnosticTroubleCode value) {
        return new JAXBElement<ActiveTroubleCodesUpdateActionDiagnosticTroubleCode>(_ActiveTroubleCodesUpdateActionDiagnosticTroubleCode_QNAME, ActiveTroubleCodesUpdateActionDiagnosticTroubleCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActiveTroubleCodesUpdateActionJ1587TroubleCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ActiveTroubleCodesUpdateAction.J1587TroubleCode")
    public JAXBElement<ActiveTroubleCodesUpdateActionJ1587TroubleCode> createActiveTroubleCodesUpdateActionJ1587TroubleCode(ActiveTroubleCodesUpdateActionJ1587TroubleCode value) {
        return new JAXBElement<ActiveTroubleCodesUpdateActionJ1587TroubleCode>(_ActiveTroubleCodesUpdateActionJ1587TroubleCode_QNAME, ActiveTroubleCodesUpdateActionJ1587TroubleCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActiveTroubleCodesUpdateActionJ1939TroubleCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ActiveTroubleCodesUpdateAction.J1939TroubleCode")
    public JAXBElement<ActiveTroubleCodesUpdateActionJ1939TroubleCode> createActiveTroubleCodesUpdateActionJ1939TroubleCode(ActiveTroubleCodesUpdateActionJ1939TroubleCode value) {
        return new JAXBElement<ActiveTroubleCodesUpdateActionJ1939TroubleCode>(_ActiveTroubleCodesUpdateActionJ1939TroubleCode_QNAME, ActiveTroubleCodesUpdateActionJ1939TroubleCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActiveTroubleCodesUpdateActionOBD2TroubleCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ActiveTroubleCodesUpdateAction.OBD2TroubleCode")
    public JAXBElement<ActiveTroubleCodesUpdateActionOBD2TroubleCode> createActiveTroubleCodesUpdateActionOBD2TroubleCode(ActiveTroubleCodesUpdateActionOBD2TroubleCode value) {
        return new JAXBElement<ActiveTroubleCodesUpdateActionOBD2TroubleCode>(_ActiveTroubleCodesUpdateActionOBD2TroubleCode_QNAME, ActiveTroubleCodesUpdateActionOBD2TroubleCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogOffAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LogOffAction")
    public JAXBElement<LogOffAction> createLogOffAction(LogOffAction value) {
        return new JAXBElement<LogOffAction>(_LogOffAction_QNAME, LogOffAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogOnAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LogOnAction")
    public JAXBElement<LogOnAction> createLogOnAction(LogOnAction value) {
        return new JAXBElement<LogOnAction>(_LogOnAction_QNAME, LogOnAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportClientApplicationInfoAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ReportClientApplicationInfoAction")
    public JAXBElement<ReportClientApplicationInfoAction> createReportClientApplicationInfoAction(ReportClientApplicationInfoAction value) {
        return new JAXBElement<ReportClientApplicationInfoAction>(_ReportClientApplicationInfoAction_QNAME, ReportClientApplicationInfoAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupStopBasedAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "GroupStopBasedAction")
    public JAXBElement<GroupStopBasedAction> createGroupStopBasedAction(GroupStopBasedAction value) {
        return new JAXBElement<GroupStopBasedAction>(_GroupStopBasedAction_QNAME, GroupStopBasedAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArriveGroupStopAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArriveGroupStopAction")
    public JAXBElement<ArriveGroupStopAction> createArriveGroupStopAction(ArriveGroupStopAction value) {
        return new JAXBElement<ArriveGroupStopAction>(_ArriveGroupStopAction_QNAME, ArriveGroupStopAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartGroupStopAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DepartGroupStopAction")
    public JAXBElement<DepartGroupStopAction> createDepartGroupStopAction(DepartGroupStopAction value) {
        return new JAXBElement<DepartGroupStopAction>(_DepartGroupStopAction_QNAME, DepartGroupStopAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteOptimizationResponseAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteOptimizationResponseAction")
    public JAXBElement<RouteOptimizationResponseAction> createRouteOptimizationResponseAction(RouteOptimizationResponseAction value) {
        return new JAXBElement<RouteOptimizationResponseAction>(_RouteOptimizationResponseAction_QNAME, RouteOptimizationResponseAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCompressedDataSetAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendCompressedDataSetAction")
    public JAXBElement<SendCompressedDataSetAction> createSendCompressedDataSetAction(SendCompressedDataSetAction value) {
        return new JAXBElement<SendCompressedDataSetAction>(_SendCompressedDataSetAction_QNAME, SendCompressedDataSetAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationaryEndAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StationaryEndAction")
    public JAXBElement<StationaryEndAction> createStationaryEndAction(StationaryEndAction value) {
        return new JAXBElement<StationaryEndAction>(_StationaryEndAction_QNAME, StationaryEndAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationaryStartAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StationaryStartAction")
    public JAXBElement<StationaryStartAction> createStationaryStartAction(StationaryStartAction value) {
        return new JAXBElement<StationaryStartAction>(_StationaryStartAction_QNAME, StationaryStartAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDropHookAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EquipmentDropHookAction")
    public JAXBElement<EquipmentDropHookAction> createEquipmentDropHookAction(EquipmentDropHookAction value) {
        return new JAXBElement<EquipmentDropHookAction>(_EquipmentDropHookAction_QNAME, EquipmentDropHookAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceCommsStatusUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TelematicsDeviceCommsStatusUpdateAction")
    public JAXBElement<TelematicsDeviceCommsStatusUpdateAction> createTelematicsDeviceCommsStatusUpdateAction(TelematicsDeviceCommsStatusUpdateAction value) {
        return new JAXBElement<TelematicsDeviceCommsStatusUpdateAction>(_TelematicsDeviceCommsStatusUpdateAction_QNAME, TelematicsDeviceCommsStatusUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceIgnitionKillSwitchResponseAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TelematicsDeviceIgnitionKillSwitchResponseAction")
    public JAXBElement<TelematicsDeviceIgnitionKillSwitchResponseAction> createTelematicsDeviceIgnitionKillSwitchResponseAction(TelematicsDeviceIgnitionKillSwitchResponseAction value) {
        return new JAXBElement<TelematicsDeviceIgnitionKillSwitchResponseAction>(_TelematicsDeviceIgnitionKillSwitchResponseAction_QNAME, TelematicsDeviceIgnitionKillSwitchResponseAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceOutputChangeResponseAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TelematicsDeviceOutputChangeResponseAction")
    public JAXBElement<TelematicsDeviceOutputChangeResponseAction> createTelematicsDeviceOutputChangeResponseAction(TelematicsDeviceOutputChangeResponseAction value) {
        return new JAXBElement<TelematicsDeviceOutputChangeResponseAction>(_TelematicsDeviceOutputChangeResponseAction_QNAME, TelematicsDeviceOutputChangeResponseAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceConfirmationAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceConfirmationAction")
    public JAXBElement<ServiceConfirmationAction> createServiceConfirmationAction(ServiceConfirmationAction value) {
        return new JAXBElement<ServiceConfirmationAction>(_ServiceConfirmationAction_QNAME, ServiceConfirmationAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceConfirmationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfServiceConfirmationInfo")
    public JAXBElement<ArrayOfServiceConfirmationInfo> createArrayOfServiceConfirmationInfo(ArrayOfServiceConfirmationInfo value) {
        return new JAXBElement<ArrayOfServiceConfirmationInfo>(_ArrayOfServiceConfirmationInfo_QNAME, ArrayOfServiceConfirmationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleBusInfoUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleBusInfoUpdateAction")
    public JAXBElement<VehicleBusInfoUpdateAction> createVehicleBusInfoUpdateAction(VehicleBusInfoUpdateAction value) {
        return new JAXBElement<VehicleBusInfoUpdateAction>(_VehicleBusInfoUpdateAction_QNAME, VehicleBusInfoUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVehicleBusComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfVehicleBusComponent")
    public JAXBElement<ArrayOfVehicleBusComponent> createArrayOfVehicleBusComponent(ArrayOfVehicleBusComponent value) {
        return new JAXBElement<ArrayOfVehicleBusComponent>(_ArrayOfVehicleBusComponent_QNAME, ArrayOfVehicleBusComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActiveTroubleCodesUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ActiveTroubleCodesUpdateAction")
    public JAXBElement<ActiveTroubleCodesUpdateAction> createActiveTroubleCodesUpdateAction(ActiveTroubleCodesUpdateAction value) {
        return new JAXBElement<ActiveTroubleCodesUpdateAction>(_ActiveTroubleCodesUpdateAction_QNAME, ActiveTroubleCodesUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfActiveTroubleCodesUpdateAction.DiagnosticTroubleCode")
    public JAXBElement<ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode> createArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode(ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode value) {
        return new JAXBElement<ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode>(_ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode_QNAME, ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNonServiceableStopAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AddNonServiceableStopAction")
    public JAXBElement<AddNonServiceableStopAction> createAddNonServiceableStopAction(AddNonServiceableStopAction value) {
        return new JAXBElement<AddNonServiceableStopAction>(_AddNonServiceableStopAction_QNAME, AddNonServiceableStopAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateStationaryEventAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AssociateStationaryEventAction")
    public JAXBElement<AssociateStationaryEventAction> createAssociateStationaryEventAction(AssociateStationaryEventAction value) {
        return new JAXBElement<AssociateStationaryEventAction>(_AssociateStationaryEventAction_QNAME, AssociateStationaryEventAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemAddOrUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LineItemAddOrUpdateAction")
    public JAXBElement<LineItemAddOrUpdateAction> createLineItemAddOrUpdateAction(LineItemAddOrUpdateAction value) {
        return new JAXBElement<LineItemAddOrUpdateAction>(_LineItemAddOrUpdateAction_QNAME, LineItemAddOrUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCommentsDeleteAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LocationCommentsDeleteAction")
    public JAXBElement<LocationCommentsDeleteAction> createLocationCommentsDeleteAction(LocationCommentsDeleteAction value) {
        return new JAXBElement<LocationCommentsDeleteAction>(_LocationCommentsDeleteAction_QNAME, LocationCommentsDeleteAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCommentsSaveAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LocationCommentsSaveAction")
    public JAXBElement<LocationCommentsSaveAction> createLocationCommentsSaveAction(LocationCommentsSaveAction value) {
        return new JAXBElement<LocationCommentsSaveAction>(_LocationCommentsSaveAction_QNAME, LocationCommentsSaveAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationCommentParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfLocationCommentParam")
    public JAXBElement<ArrayOfLocationCommentParam> createArrayOfLocationCommentParam(ArrayOfLocationCommentParam value) {
        return new JAXBElement<ArrayOfLocationCommentParam>(_ArrayOfLocationCommentParam_QNAME, ArrayOfLocationCommentParam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientAction")
    public JAXBElement<NavClientAction> createNavClientAction(NavClientAction value) {
        return new JAXBElement<NavClientAction>(_NavClientAction_QNAME, NavClientAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientRoutePathDeviationAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientRoutePathDeviationAction")
    public JAXBElement<NavClientRoutePathDeviationAction> createNavClientRoutePathDeviationAction(NavClientRoutePathDeviationAction value) {
        return new JAXBElement<NavClientRoutePathDeviationAction>(_NavClientRoutePathDeviationAction_QNAME, NavClientRoutePathDeviationAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientApplicationStateChangedAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientApplicationStateChangedAction")
    public JAXBElement<NavClientApplicationStateChangedAction> createNavClientApplicationStateChangedAction(NavClientApplicationStateChangedAction value) {
        return new JAXBElement<NavClientApplicationStateChangedAction>(_NavClientApplicationStateChangedAction_QNAME, NavClientApplicationStateChangedAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientDestinationArrivalAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientDestinationArrivalAction")
    public JAXBElement<NavClientDestinationArrivalAction> createNavClientDestinationArrivalAction(NavClientDestinationArrivalAction value) {
        return new JAXBElement<NavClientDestinationArrivalAction>(_NavClientDestinationArrivalAction_QNAME, NavClientDestinationArrivalAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientRecalculationAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientRecalculationAction")
    public JAXBElement<NavClientRecalculationAction> createNavClientRecalculationAction(NavClientRecalculationAction value) {
        return new JAXBElement<NavClientRecalculationAction>(_NavClientRecalculationAction_QNAME, NavClientRecalculationAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientSpeedAlertAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientSpeedAlertAction")
    public JAXBElement<NavClientSpeedAlertAction> createNavClientSpeedAlertAction(NavClientSpeedAlertAction value) {
        return new JAXBElement<NavClientSpeedAlertAction>(_NavClientSpeedAlertAction_QNAME, NavClientSpeedAlertAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientStartRouteAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientStartRouteAction")
    public JAXBElement<NavClientStartRouteAction> createNavClientStartRouteAction(NavClientStartRouteAction value) {
        return new JAXBElement<NavClientStartRouteAction>(_NavClientStartRouteAction_QNAME, NavClientStartRouteAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientWorkerChangedAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientWorkerChangedAction")
    public JAXBElement<NavClientWorkerChangedAction> createNavClientWorkerChangedAction(NavClientWorkerChangedAction value) {
        return new JAXBElement<NavClientWorkerChangedAction>(_NavClientWorkerChangedAction_QNAME, NavClientWorkerChangedAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceInputChangedAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TelematicsDeviceInputChangedAction")
    public JAXBElement<TelematicsDeviceInputChangedAction> createTelematicsDeviceInputChangedAction(TelematicsDeviceInputChangedAction value) {
        return new JAXBElement<TelematicsDeviceInputChangedAction>(_TelematicsDeviceInputChangedAction_QNAME, TelematicsDeviceInputChangedAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PanicButtonTriggeredAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PanicButtonTriggeredAction")
    public JAXBElement<PanicButtonTriggeredAction> createPanicButtonTriggeredAction(PanicButtonTriggeredAction value) {
        return new JAXBElement<PanicButtonTriggeredAction>(_PanicButtonTriggeredAction_QNAME, PanicButtonTriggeredAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerStatusUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "WorkerStatusUpdateAction")
    public JAXBElement<WorkerStatusUpdateAction> createWorkerStatusUpdateAction(WorkerStatusUpdateAction value) {
        return new JAXBElement<WorkerStatusUpdateAction>(_WorkerStatusUpdateAction_QNAME, WorkerStatusUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomFormResponseAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CustomFormResponseAction")
    public JAXBElement<CustomFormResponseAction> createCustomFormResponseAction(CustomFormResponseAction value) {
        return new JAXBElement<CustomFormResponseAction>(_CustomFormResponseAction_QNAME, CustomFormResponseAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomFormResponseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfCustomFormResponseInfo")
    public JAXBElement<ArrayOfCustomFormResponseInfo> createArrayOfCustomFormResponseInfo(ArrayOfCustomFormResponseInfo value) {
        return new JAXBElement<ArrayOfCustomFormResponseInfo>(_ArrayOfCustomFormResponseInfo_QNAME, ArrayOfCustomFormResponseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LineItemUpdateAction")
    public JAXBElement<LineItemUpdateAction> createLineItemUpdateAction(LineItemUpdateAction value) {
        return new JAXBElement<LineItemUpdateAction>(_LineItemUpdateAction_QNAME, LineItemUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderUpdateAction")
    public JAXBElement<OrderUpdateAction> createOrderUpdateAction(OrderUpdateAction value) {
        return new JAXBElement<OrderUpdateAction>(_OrderUpdateAction_QNAME, OrderUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopBasedActionDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopBasedActionDto")
    public JAXBElement<StopBasedActionDto> createStopBasedActionDto(StopBasedActionDto value) {
        return new JAXBElement<StopBasedActionDto>(_StopBasedActionDto_QNAME, StopBasedActionDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailItemVerificationAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DetailItemVerificationAction")
    public JAXBElement<DetailItemVerificationAction> createDetailItemVerificationAction(DetailItemVerificationAction value) {
        return new JAXBElement<DetailItemVerificationAction>(_DetailItemVerificationAction_QNAME, DetailItemVerificationAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetailItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfDetailItem")
    public JAXBElement<ArrayOfDetailItem> createArrayOfDetailItem(ArrayOfDetailItem value) {
        return new JAXBElement<ArrayOfDetailItem>(_ArrayOfDetailItem_QNAME, ArrayOfDetailItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DetailItem")
    public JAXBElement<DetailItem> createDetailItem(DetailItem value) {
        return new JAXBElement<DetailItem>(_DetailItem_QNAME, DetailItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDetailsUpdateActionOrderDetailItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryDetailsUpdateAction.OrderDetailItem")
    public JAXBElement<DeliveryDetailsUpdateActionOrderDetailItem> createDeliveryDetailsUpdateActionOrderDetailItem(DeliveryDetailsUpdateActionOrderDetailItem value) {
        return new JAXBElement<DeliveryDetailsUpdateActionOrderDetailItem>(_DeliveryDetailsUpdateActionOrderDetailItem_QNAME, DeliveryDetailsUpdateActionOrderDetailItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDetailsUpdateActionDetailItemQuantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryDetailsUpdateAction.DetailItemQuantities")
    public JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities> createDeliveryDetailsUpdateActionDetailItemQuantities(DeliveryDetailsUpdateActionDetailItemQuantities value) {
        return new JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities>(_DeliveryDetailsUpdateActionDetailItemQuantities_QNAME, DeliveryDetailsUpdateActionDetailItemQuantities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopManipulationAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopManipulationAction")
    public JAXBElement<StopManipulationAction> createStopManipulationAction(StopManipulationAction value) {
        return new JAXBElement<StopManipulationAction>(_StopManipulationAction_QNAME, StopManipulationAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Placement")
    public JAXBElement<Placement> createPlacement(Placement value) {
        return new JAXBElement<Placement>(_Placement_QNAME, Placement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnStopPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnStopPlacement")
    public JAXBElement<OnStopPlacement> createOnStopPlacement(OnStopPlacement value) {
        return new JAXBElement<OnStopPlacement>(_OnStopPlacement_QNAME, OnStopPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnRoutePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnRoutePlacement")
    public JAXBElement<OnRoutePlacement> createOnRoutePlacement(OnRoutePlacement value) {
        return new JAXBElement<OnRoutePlacement>(_OnRoutePlacement_QNAME, OnRoutePlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnDeviceStopPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnDeviceStopPlacement")
    public JAXBElement<OnDeviceStopPlacement> createOnDeviceStopPlacement(OnDeviceStopPlacement value) {
        return new JAXBElement<OnDeviceStopPlacement>(_OnDeviceStopPlacement_QNAME, OnDeviceStopPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnRouteByIndicesPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnRouteByIndicesPlacement")
    public JAXBElement<OnRouteByIndicesPlacement> createOnRouteByIndicesPlacement(OnRouteByIndicesPlacement value) {
        return new JAXBElement<OnRouteByIndicesPlacement>(_OnRouteByIndicesPlacement_QNAME, OnRouteByIndicesPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfOnRouteByIndicesPlacement.TaskTypeToIndex")
    public JAXBElement<ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex> createArrayOfOnRouteByIndicesPlacementTaskTypeToIndex(ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex value) {
        return new JAXBElement<ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex>(_ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex_QNAME, ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnRouteByIndicesPlacementTaskTypeToIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnRouteByIndicesPlacement.TaskTypeToIndex")
    public JAXBElement<OnRouteByIndicesPlacementTaskTypeToIndex> createOnRouteByIndicesPlacementTaskTypeToIndex(OnRouteByIndicesPlacementTaskTypeToIndex value) {
        return new JAXBElement<OnRouteByIndicesPlacementTaskTypeToIndex>(_OnRouteByIndicesPlacementTaskTypeToIndex_QNAME, OnRouteByIndicesPlacementTaskTypeToIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartStopAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DepartStopAction")
    public JAXBElement<DepartStopAction> createDepartStopAction(DepartStopAction value) {
        return new JAXBElement<DepartStopAction>(_DepartStopAction_QNAME, DepartStopAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeStopAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "GeocodeStopAction")
    public JAXBElement<GeocodeStopAction> createGeocodeStopAction(GeocodeStopAction value) {
        return new JAXBElement<GeocodeStopAction>(_GeocodeStopAction_QNAME, GeocodeStopAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserviceStopAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ReserviceStopAction")
    public JAXBElement<ReserviceStopAction> createReserviceStopAction(ReserviceStopAction value) {
        return new JAXBElement<ReserviceStopAction>(_ReserviceStopAction_QNAME, ReserviceStopAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceStopAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceStopAction")
    public JAXBElement<ServiceStopAction> createServiceStopAction(ServiceStopAction value) {
        return new JAXBElement<ServiceStopAction>(_ServiceStopAction_QNAME, ServiceStopAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArriveStopAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArriveStopAction")
    public JAXBElement<ArriveStopAction> createArriveStopAction(ArriveStopAction value) {
        return new JAXBElement<ArriveStopAction>(_ArriveStopAction_QNAME, ArriveStopAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopSignatureAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopSignatureAction")
    public JAXBElement<StopSignatureAction> createStopSignatureAction(StopSignatureAction value) {
        return new JAXBElement<StopSignatureAction>(_StopSignatureAction_QNAME, StopSignatureAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IgnitionStateChangedAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "IgnitionStateChangedAction")
    public JAXBElement<IgnitionStateChangedAction> createIgnitionStateChangedAction(IgnitionStateChangedAction value) {
        return new JAXBElement<IgnitionStateChangedAction>(_IgnitionStateChangedAction_QNAME, IgnitionStateChangedAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleStatusUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleStatusUpdateAction")
    public JAXBElement<VehicleStatusUpdateAction> createVehicleStatusUpdateAction(VehicleStatusUpdateAction value) {
        return new JAXBElement<VehicleStatusUpdateAction>(_VehicleStatusUpdateAction_QNAME, VehicleStatusUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceDiagnosticsUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TelematicsDeviceDiagnosticsUpdateAction")
    public JAXBElement<TelematicsDeviceDiagnosticsUpdateAction> createTelematicsDeviceDiagnosticsUpdateAction(TelematicsDeviceDiagnosticsUpdateAction value) {
        return new JAXBElement<TelematicsDeviceDiagnosticsUpdateAction>(_TelematicsDeviceDiagnosticsUpdateAction_QNAME, TelematicsDeviceDiagnosticsUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HarshDrivingAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "HarshDrivingAction")
    public JAXBElement<HarshDrivingAction> createHarshDrivingAction(HarshDrivingAction value) {
        return new JAXBElement<HarshDrivingAction>(_HarshDrivingAction_QNAME, HarshDrivingAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddServiceableStopAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AddServiceableStopAction")
    public JAXBElement<AddServiceableStopAction> createAddServiceableStopAction(AddServiceableStopAction value) {
        return new JAXBElement<AddServiceableStopAction>(_AddServiceableStopAction_QNAME, AddServiceableStopAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndBreakAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EndBreakAction")
    public JAXBElement<EndBreakAction> createEndBreakAction(EndBreakAction value) {
        return new JAXBElement<EndBreakAction>(_EndBreakAction_QNAME, EndBreakAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndWorkAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EndWorkAction")
    public JAXBElement<EndWorkAction> createEndWorkAction(EndWorkAction value) {
        return new JAXBElement<EndWorkAction>(_EndWorkAction_QNAME, EndWorkAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResequencePendingStopsAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ResequencePendingStopsAction")
    public JAXBElement<ResequencePendingStopsAction> createResequencePendingStopsAction(ResequencePendingStopsAction value) {
        return new JAXBElement<ResequencePendingStopsAction>(_ResequencePendingStopsAction_QNAME, ResequencePendingStopsAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartBreakAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StartBreakAction")
    public JAXBElement<StartBreakAction> createStartBreakAction(StartBreakAction value) {
        return new JAXBElement<StartBreakAction>(_StartBreakAction_QNAME, StartBreakAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartWorkAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StartWorkAction")
    public JAXBElement<StartWorkAction> createStartWorkAction(StartWorkAction value) {
        return new JAXBElement<StartWorkAction>(_StartWorkAction_QNAME, StartWorkAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatteryDiagnosticsUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "BatteryDiagnosticsUpdateAction")
    public JAXBElement<BatteryDiagnosticsUpdateAction> createBatteryDiagnosticsUpdateAction(BatteryDiagnosticsUpdateAction value) {
        return new JAXBElement<BatteryDiagnosticsUpdateAction>(_BatteryDiagnosticsUpdateAction_QNAME, BatteryDiagnosticsUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PositionUpdateAction")
    public JAXBElement<PositionUpdateAction> createPositionUpdateAction(PositionUpdateAction value) {
        return new JAXBElement<PositionUpdateAction>(_PositionUpdateAction_QNAME, PositionUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNonServiceableStopAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UpdateNonServiceableStopAction")
    public JAXBElement<UpdateNonServiceableStopAction> createUpdateNonServiceableStopAction(UpdateNonServiceableStopAction value) {
        return new JAXBElement<UpdateNonServiceableStopAction>(_UpdateNonServiceableStopAction_QNAME, UpdateNonServiceableStopAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArriveDestinationAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArriveDestinationAction")
    public JAXBElement<ArriveDestinationAction> createArriveDestinationAction(ArriveDestinationAction value) {
        return new JAXBElement<ArriveDestinationAction>(_ArriveDestinationAction_QNAME, ArriveDestinationAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStopOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RemoveStopOptions")
    public JAXBElement<RemoveStopOptions> createRemoveStopOptions(RemoveStopOptions value) {
        return new JAXBElement<RemoveStopOptions>(_RemoveStopOptions_QNAME, RemoveStopOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelStopsAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CancelStopsAction")
    public JAXBElement<CancelStopsAction> createCancelStopsAction(CancelStopsAction value) {
        return new JAXBElement<CancelStopsAction>(_CancelStopsAction_QNAME, CancelStopsAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRouteAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CompleteRouteAction")
    public JAXBElement<CompleteRouteAction> createCompleteRouteAction(CompleteRouteAction value) {
        return new JAXBElement<CompleteRouteAction>(_CompleteRouteAction_QNAME, CompleteRouteAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartOriginAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DepartOriginAction")
    public JAXBElement<DepartOriginAction> createDepartOriginAction(DepartOriginAction value) {
        return new JAXBElement<DepartOriginAction>(_DepartOriginAction_QNAME, DepartOriginAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResequenceStopAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ResequenceStopAction")
    public JAXBElement<ResequenceStopAction> createResequenceStopAction(ResequenceStopAction value) {
        return new JAXBElement<ResequenceStopAction>(_ResequenceStopAction_QNAME, ResequenceStopAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNoteAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendNoteAction")
    public JAXBElement<SendNoteAction> createSendNoteAction(SendNoteAction value) {
        return new JAXBElement<SendNoteAction>(_SendNoteAction_QNAME, SendNoteAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNoteActionRouteNoteMessageArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendNoteAction.RouteNoteMessageArgs")
    public JAXBElement<SendNoteActionRouteNoteMessageArgs> createSendNoteActionRouteNoteMessageArgs(SendNoteActionRouteNoteMessageArgs value) {
        return new JAXBElement<SendNoteActionRouteNoteMessageArgs>(_SendNoteActionRouteNoteMessageArgs_QNAME, SendNoteActionRouteNoteMessageArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNoteActionStopNoteMessageArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendNoteAction.StopNoteMessageArgs")
    public JAXBElement<SendNoteActionStopNoteMessageArgs> createSendNoteActionStopNoteMessageArgs(SendNoteActionStopNoteMessageArgs value) {
        return new JAXBElement<SendNoteActionStopNoteMessageArgs>(_SendNoteActionStopNoteMessageArgs_QNAME, SendNoteActionStopNoteMessageArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNoteActionOrderNoteMessageArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendNoteAction.OrderNoteMessageArgs")
    public JAXBElement<SendNoteActionOrderNoteMessageArgs> createSendNoteActionOrderNoteMessageArgs(SendNoteActionOrderNoteMessageArgs value) {
        return new JAXBElement<SendNoteActionOrderNoteMessageArgs>(_SendNoteActionOrderNoteMessageArgs_QNAME, SendNoteActionOrderNoteMessageArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNoteActionLineItemNoteMessageArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendNoteAction.LineItemNoteMessageArgs")
    public JAXBElement<SendNoteActionLineItemNoteMessageArgs> createSendNoteActionLineItemNoteMessageArgs(SendNoteActionLineItemNoteMessageArgs value) {
        return new JAXBElement<SendNoteActionLineItemNoteMessageArgs>(_SendNoteActionLineItemNoteMessageArgs_QNAME, SendNoteActionLineItemNoteMessageArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartRouteAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StartRouteAction")
    public JAXBElement<StartRouteAction> createStartRouteAction(StartRouteAction value) {
        return new JAXBElement<StartRouteAction>(_StartRouteAction_QNAME, StartRouteAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDetailsUpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryDetailsUpdateAction")
    public JAXBElement<DeliveryDetailsUpdateAction> createDeliveryDetailsUpdateAction(DeliveryDetailsUpdateAction value) {
        return new JAXBElement<DeliveryDetailsUpdateAction>(_DeliveryDetailsUpdateAction_QNAME, DeliveryDetailsUpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptimizeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OptimizeResult")
    public JAXBElement<OptimizeResult> createOptimizeResult(OptimizeResult value) {
        return new JAXBElement<OptimizeResult>(_OptimizeResult_QNAME, OptimizeResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderActuals")
    public JAXBElement<OrderActuals> createOrderActuals(OrderActuals value) {
        return new JAXBElement<OrderActuals>(_OrderActuals_QNAME, OrderActuals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineItemActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfLineItemActuals")
    public JAXBElement<ArrayOfLineItemActuals> createArrayOfLineItemActuals(ArrayOfLineItemActuals value) {
        return new JAXBElement<ArrayOfLineItemActuals>(_ArrayOfLineItemActuals_QNAME, ArrayOfLineItemActuals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnTerritoryPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnTerritoryPlacement")
    public JAXBElement<OnTerritoryPlacement> createOnTerritoryPlacement(OnTerritoryPlacement value) {
        return new JAXBElement<OnTerritoryPlacement>(_OnTerritoryPlacement_QNAME, OnTerritoryPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnTerritoryAndRoutesPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnTerritoryAndRoutesPlacement")
    public JAXBElement<OnTerritoryAndRoutesPlacement> createOnTerritoryAndRoutesPlacement(OnTerritoryAndRoutesPlacement value) {
        return new JAXBElement<OnTerritoryAndRoutesPlacement>(_OnTerritoryAndRoutesPlacement_QNAME, OnTerritoryAndRoutesPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveOrderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RemoveOrderOptions")
    public JAXBElement<RemoveOrderOptions> createRemoveOrderOptions(RemoveOrderOptions value) {
        return new JAXBElement<RemoveOrderOptions>(_RemoveOrderOptions_QNAME, RemoveOrderOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteActuals")
    public JAXBElement<RouteActuals> createRouteActuals(RouteActuals value) {
        return new JAXBElement<RouteActuals>(_RouteActuals_QNAME, RouteActuals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStopActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfStopActuals")
    public JAXBElement<ArrayOfStopActuals> createArrayOfStopActuals(ArrayOfStopActuals value) {
        return new JAXBElement<ArrayOfStopActuals>(_ArrayOfStopActuals_QNAME, ArrayOfStopActuals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopActuals")
    public JAXBElement<StopActuals> createStopActuals(StopActuals value) {
        return new JAXBElement<StopActuals>(_StopActuals_QNAME, StopActuals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceableStopActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceableStopActuals")
    public JAXBElement<ServiceableStopActuals> createServiceableStopActuals(ServiceableStopActuals value) {
        return new JAXBElement<ServiceableStopActuals>(_ServiceableStopActuals_QNAME, ServiceableStopActuals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfOrderActuals")
    public JAXBElement<ArrayOfOrderActuals> createArrayOfOrderActuals(ArrayOfOrderActuals value) {
        return new JAXBElement<ArrayOfOrderActuals>(_ArrayOfOrderActuals_QNAME, ArrayOfOrderActuals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTimeAdjustmentOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceTimeAdjustmentOptions")
    public JAXBElement<ServiceTimeAdjustmentOptions> createServiceTimeAdjustmentOptions(ServiceTimeAdjustmentOptions value) {
        return new JAXBElement<ServiceTimeAdjustmentOptions>(_ServiceTimeAdjustmentOptions_QNAME, ServiceTimeAdjustmentOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTimeAdjustToConstantOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceTimeAdjustToConstantOptions")
    public JAXBElement<ServiceTimeAdjustToConstantOptions> createServiceTimeAdjustToConstantOptions(ServiceTimeAdjustToConstantOptions value) {
        return new JAXBElement<ServiceTimeAdjustToConstantOptions>(_ServiceTimeAdjustToConstantOptions_QNAME, ServiceTimeAdjustToConstantOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTimeAdjustByPercentageOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceTimeAdjustByPercentageOptions")
    public JAXBElement<ServiceTimeAdjustByPercentageOptions> createServiceTimeAdjustByPercentageOptions(ServiceTimeAdjustByPercentageOptions value) {
        return new JAXBElement<ServiceTimeAdjustByPercentageOptions>(_ServiceTimeAdjustByPercentageOptions_QNAME, ServiceTimeAdjustByPercentageOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTimeRemoveAdjustmentOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceTimeRemoveAdjustmentOptions")
    public JAXBElement<ServiceTimeRemoveAdjustmentOptions> createServiceTimeRemoveAdjustmentOptions(ServiceTimeRemoveAdjustmentOptions value) {
        return new JAXBElement<ServiceTimeRemoveAdjustmentOptions>(_ServiceTimeRemoveAdjustmentOptions_QNAME, ServiceTimeRemoveAdjustmentOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteTemplateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SuggestRouteTemplateResult")
    public JAXBElement<SuggestRouteTemplateResult> createSuggestRouteTemplateResult(SuggestRouteTemplateResult value) {
        return new JAXBElement<SuggestRouteTemplateResult>(_SuggestRouteTemplateResult_QNAME, SuggestRouteTemplateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSuggestRouteTemplateResultSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfSuggestRouteTemplateResult.Suggestion")
    public JAXBElement<ArrayOfSuggestRouteTemplateResultSuggestion> createArrayOfSuggestRouteTemplateResultSuggestion(ArrayOfSuggestRouteTemplateResultSuggestion value) {
        return new JAXBElement<ArrayOfSuggestRouteTemplateResultSuggestion>(_ArrayOfSuggestRouteTemplateResultSuggestion_QNAME, ArrayOfSuggestRouteTemplateResultSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteTemplateResultSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SuggestRouteTemplateResult.Suggestion")
    public JAXBElement<SuggestRouteTemplateResultSuggestion> createSuggestRouteTemplateResultSuggestion(SuggestRouteTemplateResultSuggestion value) {
        return new JAXBElement<SuggestRouteTemplateResultSuggestion>(_SuggestRouteTemplateResultSuggestion_QNAME, SuggestRouteTemplateResultSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TemplatePlacement")
    public JAXBElement<TemplatePlacement> createTemplatePlacement(TemplatePlacement value) {
        return new JAXBElement<TemplatePlacement>(_TemplatePlacement_QNAME, TemplatePlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnStopTemplatePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnStopTemplatePlacement")
    public JAXBElement<OnStopTemplatePlacement> createOnStopTemplatePlacement(OnStopTemplatePlacement value) {
        return new JAXBElement<OnStopTemplatePlacement>(_OnStopTemplatePlacement_QNAME, OnStopTemplatePlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnRouteTemplatePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnRouteTemplatePlacement")
    public JAXBElement<OnRouteTemplatePlacement> createOnRouteTemplatePlacement(OnRouteTemplatePlacement value) {
        return new JAXBElement<OnRouteTemplatePlacement>(_OnRouteTemplatePlacement_QNAME, OnRouteTemplatePlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShortestPathCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ShortestPathCriteria")
    public JAXBElement<ShortestPathCriteria> createShortestPathCriteria(ShortestPathCriteria value) {
        return new JAXBElement<ShortestPathCriteria>(_ShortestPathCriteria_QNAME, ShortestPathCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDetailsUpdateActionLineItemDetailItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryDetailsUpdateAction.LineItemDetailItem")
    public JAXBElement<DeliveryDetailsUpdateActionLineItemDetailItem> createDeliveryDetailsUpdateActionLineItemDetailItem(DeliveryDetailsUpdateActionLineItemDetailItem value) {
        return new JAXBElement<DeliveryDetailsUpdateActionLineItemDetailItem>(_DeliveryDetailsUpdateActionLineItemDetailItem_QNAME, DeliveryDetailsUpdateActionLineItemDetailItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRoutePlanStopArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfSaveRoutePlanStopArgs")
    public JAXBElement<ArrayOfSaveRoutePlanStopArgs> createArrayOfSaveRoutePlanStopArgs(ArrayOfSaveRoutePlanStopArgs value) {
        return new JAXBElement<ArrayOfSaveRoutePlanStopArgs>(_ArrayOfSaveRoutePlanStopArgs_QNAME, ArrayOfSaveRoutePlanStopArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndeleteEntityOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UndeleteEntityOptions")
    public JAXBElement<UndeleteEntityOptions> createUndeleteEntityOptions(UndeleteEntityOptions value) {
        return new JAXBElement<UndeleteEntityOptions>(_UndeleteEntityOptions_QNAME, UndeleteEntityOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUndeleteEntityResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfUndeleteEntityResult")
    public JAXBElement<ArrayOfUndeleteEntityResult> createArrayOfUndeleteEntityResult(ArrayOfUndeleteEntityResult value) {
        return new JAXBElement<ArrayOfUndeleteEntityResult>(_ArrayOfUndeleteEntityResult_QNAME, ArrayOfUndeleteEntityResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndeleteEntityResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UndeleteEntityResult")
    public JAXBElement<UndeleteEntityResult> createUndeleteEntityResult(UndeleteEntityResult value) {
        return new JAXBElement<UndeleteEntityResult>(_UndeleteEntityResult_QNAME, UndeleteEntityResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeDataFeedOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ResumeDataFeedOptions")
    public JAXBElement<ResumeDataFeedOptions> createResumeDataFeedOptions(ResumeDataFeedOptions value) {
        return new JAXBElement<ResumeDataFeedOptions>(_ResumeDataFeedOptions_QNAME, ResumeDataFeedOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeDataFeedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ResumeDataFeedResult")
    public JAXBElement<ResumeDataFeedResult> createResumeDataFeedResult(ResumeDataFeedResult value) {
        return new JAXBElement<ResumeDataFeedResult>(_ResumeDataFeedResult_QNAME, ResumeDataFeedResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserSettingsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UpdateUserSettingsParameters")
    public JAXBElement<UpdateUserSettingsParameters> createUpdateUserSettingsParameters(UpdateUserSettingsParameters value) {
        return new JAXBElement<UpdateUserSettingsParameters>(_UpdateUserSettingsParameters_QNAME, UpdateUserSettingsParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRouteTenderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UpdateRouteTenderOptions")
    public JAXBElement<UpdateRouteTenderOptions> createUpdateRouteTenderOptions(UpdateRouteTenderOptions value) {
        return new JAXBElement<UpdateRouteTenderOptions>(_UpdateRouteTenderOptions_QNAME, UpdateRouteTenderOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveToRouteParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MoveToRouteParameters")
    public JAXBElement<MoveToRouteParameters> createMoveToRouteParameters(MoveToRouteParameters value) {
        return new JAXBElement<MoveToRouteParameters>(_MoveToRouteParameters_QNAME, MoveToRouteParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteStopInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfRouteStopInstances")
    public JAXBElement<ArrayOfRouteStopInstances> createArrayOfRouteStopInstances(ArrayOfRouteStopInstances value) {
        return new JAXBElement<ArrayOfRouteStopInstances>(_ArrayOfRouteStopInstances_QNAME, ArrayOfRouteStopInstances.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteStopInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteStopInstances")
    public JAXBElement<RouteStopInstances> createRouteStopInstances(RouteStopInstances value) {
        return new JAXBElement<RouteStopInstances>(_RouteStopInstances_QNAME, RouteStopInstances.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteStopTaskInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfRouteStopTaskInstances")
    public JAXBElement<ArrayOfRouteStopTaskInstances> createArrayOfRouteStopTaskInstances(ArrayOfRouteStopTaskInstances value) {
        return new JAXBElement<ArrayOfRouteStopTaskInstances>(_ArrayOfRouteStopTaskInstances_QNAME, ArrayOfRouteStopTaskInstances.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteStopTaskInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteStopTaskInstances")
    public JAXBElement<RouteStopTaskInstances> createRouteStopTaskInstances(RouteStopTaskInstances value) {
        return new JAXBElement<RouteStopTaskInstances>(_RouteStopTaskInstances_QNAME, RouteStopTaskInstances.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfManipulationResult")
    public JAXBElement<ArrayOfManipulationResult> createArrayOfManipulationResult(ArrayOfManipulationResult value) {
        return new JAXBElement<ArrayOfManipulationResult>(_ArrayOfManipulationResult_QNAME, ArrayOfManipulationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveRouteResult")
    public JAXBElement<SaveRouteResult> createSaveRouteResult(SaveRouteResult value) {
        return new JAXBElement<SaveRouteResult>(_SaveRouteResult_QNAME, SaveRouteResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfSaveRouteResult")
    public JAXBElement<ArrayOfSaveRouteResult> createArrayOfSaveRouteResult(ArrayOfSaveRouteResult value) {
        return new JAXBElement<ArrayOfSaveRouteResult>(_ArrayOfSaveRouteResult_QNAME, ArrayOfSaveRouteResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestLayoverOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SuggestLayoverOptions")
    public JAXBElement<SuggestLayoverOptions> createSuggestLayoverOptions(SuggestLayoverOptions value) {
        return new JAXBElement<SuggestLayoverOptions>(_SuggestLayoverOptions_QNAME, SuggestLayoverOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCellsFromRoutesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CreateCellsFromRoutesResult")
    public JAXBElement<CreateCellsFromRoutesResult> createCreateCellsFromRoutesResult(CreateCellsFromRoutesResult value) {
        return new JAXBElement<CreateCellsFromRoutesResult>(_CreateCellsFromRoutesResult_QNAME, CreateCellsFromRoutesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfCreateCellsFromRoutesResult.CreateCellsFromRoutesError")
    public JAXBElement<ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError> createArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError(ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError value) {
        return new JAXBElement<ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError>(_ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError_QNAME, ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCellsFromRoutesResultCreateCellsFromRoutesError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CreateCellsFromRoutesResult.CreateCellsFromRoutesError")
    public JAXBElement<CreateCellsFromRoutesResultCreateCellsFromRoutesError> createCreateCellsFromRoutesResultCreateCellsFromRoutesError(CreateCellsFromRoutesResultCreateCellsFromRoutesError value) {
        return new JAXBElement<CreateCellsFromRoutesResultCreateCellsFromRoutesError>(_CreateCellsFromRoutesResultCreateCellsFromRoutesError_QNAME, CreateCellsFromRoutesResultCreateCellsFromRoutesError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateRoutesArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CalculateRoutesArgs")
    public JAXBElement<CalculateRoutesArgs> createCalculateRoutesArgs(CalculateRoutesArgs value) {
        return new JAXBElement<CalculateRoutesArgs>(_CalculateRoutesArgs_QNAME, CalculateRoutesArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCalculateRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfCalculateRouteResult")
    public JAXBElement<ArrayOfCalculateRouteResult> createArrayOfCalculateRouteResult(ArrayOfCalculateRouteResult value) {
        return new JAXBElement<ArrayOfCalculateRouteResult>(_ArrayOfCalculateRouteResult_QNAME, ArrayOfCalculateRouteResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CalculateRouteResult")
    public JAXBElement<CalculateRouteResult> createCalculateRouteResult(CalculateRouteResult value) {
        return new JAXBElement<CalculateRouteResult>(_CalculateRouteResult_QNAME, CalculateRouteResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCompleteRouteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AutoCompleteRouteOptions")
    public JAXBElement<AutoCompleteRouteOptions> createAutoCompleteRouteOptions(AutoCompleteRouteOptions value) {
        return new JAXBElement<AutoCompleteRouteOptions>(_AutoCompleteRouteOptions_QNAME, AutoCompleteRouteOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCompleteRouteStopOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AutoCompleteRouteStopOptions")
    public JAXBElement<AutoCompleteRouteStopOptions> createAutoCompleteRouteStopOptions(AutoCompleteRouteStopOptions value) {
        return new JAXBElement<AutoCompleteRouteStopOptions>(_AutoCompleteRouteStopOptions_QNAME, AutoCompleteRouteStopOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOrderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveOrderOptions")
    public JAXBElement<SaveOrderOptions> createSaveOrderOptions(SaveOrderOptions value) {
        return new JAXBElement<SaveOrderOptions>(_SaveOrderOptions_QNAME, SaveOrderOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTerritoryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveTerritoryResult")
    public JAXBElement<SaveTerritoryResult> createSaveTerritoryResult(SaveTerritoryResult value) {
        return new JAXBElement<SaveTerritoryResult>(_SaveTerritoryResult_QNAME, SaveTerritoryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveTerritoryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfSaveTerritoryResult")
    public JAXBElement<ArrayOfSaveTerritoryResult> createArrayOfSaveTerritoryResult(ArrayOfSaveTerritoryResult value) {
        return new JAXBElement<ArrayOfSaveTerritoryResult>(_ArrayOfSaveTerritoryResult_QNAME, ArrayOfSaveTerritoryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportPlanningSolutionJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ExportPlanningSolutionJobParameters")
    public JAXBElement<ExportPlanningSolutionJobParameters> createExportPlanningSolutionJobParameters(ExportPlanningSolutionJobParameters value) {
        return new JAXBElement<ExportPlanningSolutionJobParameters>(_ExportPlanningSolutionJobParameters_QNAME, ExportPlanningSolutionJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ExportPlanningSolutionJobParameters.ExportPlanningSolutionWeeksOutputFormat")
    public JAXBElement<ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat> createExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat(ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat value) {
        return new JAXBElement<ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat>(_ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat_QNAME, ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ExportPlanningSolutionJobParameters.ExportPlanningSolutionDaysOutputFormat")
    public JAXBElement<ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat> createExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat(ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat value) {
        return new JAXBElement<ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat>(_ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat_QNAME, ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ExportPlanningSolutionJobParameters.ExportPlanningSolutionTimeZoneOption")
    public JAXBElement<ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption> createExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption(ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption value) {
        return new JAXBElement<ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption>(_ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption_QNAME, ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportPlanningSolutionJobParametersStopNumberFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ExportPlanningSolutionJobParameters.StopNumberFormat")
    public JAXBElement<ExportPlanningSolutionJobParametersStopNumberFormat> createExportPlanningSolutionJobParametersStopNumberFormat(ExportPlanningSolutionJobParametersStopNumberFormat value) {
        return new JAXBElement<ExportPlanningSolutionJobParametersStopNumberFormat>(_ExportPlanningSolutionJobParametersStopNumberFormat_QNAME, ExportPlanningSolutionJobParametersStopNumberFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportPlanningSolutionJobParametersVariableServiceTimeFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ExportPlanningSolutionJobParameters.VariableServiceTimeFormat")
    public JAXBElement<ExportPlanningSolutionJobParametersVariableServiceTimeFormat> createExportPlanningSolutionJobParametersVariableServiceTimeFormat(ExportPlanningSolutionJobParametersVariableServiceTimeFormat value) {
        return new JAXBElement<ExportPlanningSolutionJobParametersVariableServiceTimeFormat>(_ExportPlanningSolutionJobParametersVariableServiceTimeFormat_QNAME, ExportPlanningSolutionJobParametersVariableServiceTimeFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfScheduleEquipmentMaintenanceArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfScheduleEquipmentMaintenanceArgs")
    public JAXBElement<ArrayOfScheduleEquipmentMaintenanceArgs> createArrayOfScheduleEquipmentMaintenanceArgs(ArrayOfScheduleEquipmentMaintenanceArgs value) {
        return new JAXBElement<ArrayOfScheduleEquipmentMaintenanceArgs>(_ArrayOfScheduleEquipmentMaintenanceArgs_QNAME, ArrayOfScheduleEquipmentMaintenanceArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveStrategicStopsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MoveStrategicStopsParameters")
    public JAXBElement<MoveStrategicStopsParameters> createMoveStrategicStopsParameters(MoveStrategicStopsParameters value) {
        return new JAXBElement<MoveStrategicStopsParameters>(_MoveStrategicStopsParameters_QNAME, MoveStrategicStopsParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwitchRecurringOrderServicePatternParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SwitchRecurringOrderServicePatternParameters")
    public JAXBElement<SwitchRecurringOrderServicePatternParameters> createSwitchRecurringOrderServicePatternParameters(SwitchRecurringOrderServicePatternParameters value) {
        return new JAXBElement<SwitchRecurringOrderServicePatternParameters>(_SwitchRecurringOrderServicePatternParameters_QNAME, SwitchRecurringOrderServicePatternParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LockOrderOptions")
    public JAXBElement<LockOrderOptions> createLockOrderOptions(LockOrderOptions value) {
        return new JAXBElement<LockOrderOptions>(_LockOrderOptions_QNAME, LockOrderOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LockOrderResults")
    public JAXBElement<LockOrderResults> createLockOrderResults(LockOrderResults value) {
        return new JAXBElement<LockOrderResults>(_LockOrderResults_QNAME, LockOrderResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLockOrderResultsLockOrderFailure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfLockOrderResults.LockOrderFailure")
    public JAXBElement<ArrayOfLockOrderResultsLockOrderFailure> createArrayOfLockOrderResultsLockOrderFailure(ArrayOfLockOrderResultsLockOrderFailure value) {
        return new JAXBElement<ArrayOfLockOrderResultsLockOrderFailure>(_ArrayOfLockOrderResultsLockOrderFailure_QNAME, ArrayOfLockOrderResultsLockOrderFailure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderResultsLockOrderFailure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LockOrderResults.LockOrderFailure")
    public JAXBElement<LockOrderResultsLockOrderFailure> createLockOrderResultsLockOrderFailure(LockOrderResultsLockOrderFailure value) {
        return new JAXBElement<LockOrderResultsLockOrderFailure>(_LockOrderResultsLockOrderFailure_QNAME, LockOrderResultsLockOrderFailure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderResultsLockOrderFailureLockOrderErrorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LockOrderResults.LockOrderFailure.LockOrderErrorCode")
    public JAXBElement<LockOrderResultsLockOrderFailureLockOrderErrorCode> createLockOrderResultsLockOrderFailureLockOrderErrorCode(LockOrderResultsLockOrderFailureLockOrderErrorCode value) {
        return new JAXBElement<LockOrderResultsLockOrderFailureLockOrderErrorCode>(_LockOrderResultsLockOrderFailureLockOrderErrorCode_QNAME, LockOrderResultsLockOrderFailureLockOrderErrorCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderResultsLockOrdersForStopFailure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LockOrderResults.LockOrdersForStopFailure")
    public JAXBElement<LockOrderResultsLockOrdersForStopFailure> createLockOrderResultsLockOrdersForStopFailure(LockOrderResultsLockOrdersForStopFailure value) {
        return new JAXBElement<LockOrderResultsLockOrdersForStopFailure>(_LockOrderResultsLockOrdersForStopFailure_QNAME, LockOrderResultsLockOrdersForStopFailure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderResultsLockOrdersForRouteFailure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LockOrderResults.LockOrdersForRouteFailure")
    public JAXBElement<LockOrderResultsLockOrdersForRouteFailure> createLockOrderResultsLockOrdersForRouteFailure(LockOrderResultsLockOrdersForRouteFailure value) {
        return new JAXBElement<LockOrderResultsLockOrdersForRouteFailure>(_LockOrderResultsLockOrdersForRouteFailure_QNAME, LockOrderResultsLockOrdersForRouteFailure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMobileDeviceAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfMobileDeviceAction")
    public JAXBElement<ArrayOfMobileDeviceAction> createArrayOfMobileDeviceAction(ArrayOfMobileDeviceAction value) {
        return new JAXBElement<ArrayOfMobileDeviceAction>(_ArrayOfMobileDeviceAction_QNAME, ArrayOfMobileDeviceAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSendSmsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfSendSmsResult")
    public JAXBElement<ArrayOfSendSmsResult> createArrayOfSendSmsResult(ArrayOfSendSmsResult value) {
        return new JAXBElement<ArrayOfSendSmsResult>(_ArrayOfSendSmsResult_QNAME, ArrayOfSendSmsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo")
    public JAXBElement<ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo> createArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo(ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo value) {
        return new JAXBElement<ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo>(_ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo_QNAME, ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpgradeRoadnetTelematicsDeviceConfigurationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UpgradeRoadnetTelematicsDeviceConfigurationInfo")
    public JAXBElement<UpgradeRoadnetTelematicsDeviceConfigurationInfo> createUpgradeRoadnetTelematicsDeviceConfigurationInfo(UpgradeRoadnetTelematicsDeviceConfigurationInfo value) {
        return new JAXBElement<UpgradeRoadnetTelematicsDeviceConfigurationInfo>(_UpgradeRoadnetTelematicsDeviceConfigurationInfo_QNAME, UpgradeRoadnetTelematicsDeviceConfigurationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNavDeviceStatusDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfNavDeviceStatusDto")
    public JAXBElement<ArrayOfNavDeviceStatusDto> createArrayOfNavDeviceStatusDto(ArrayOfNavDeviceStatusDto value) {
        return new JAXBElement<ArrayOfNavDeviceStatusDto>(_ArrayOfNavDeviceStatusDto_QNAME, ArrayOfNavDeviceStatusDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteTemplateArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveRouteTemplateArgs")
    public JAXBElement<SaveRouteTemplateArgs> createSaveRouteTemplateArgs(SaveRouteTemplateArgs value) {
        return new JAXBElement<SaveRouteTemplateArgs>(_SaveRouteTemplateArgs_QNAME, SaveRouteTemplateArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteTemplateArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfSaveRouteTemplateArgs")
    public JAXBElement<ArrayOfSaveRouteTemplateArgs> createArrayOfSaveRouteTemplateArgs(ArrayOfSaveRouteTemplateArgs value) {
        return new JAXBElement<ArrayOfSaveRouteTemplateArgs>(_ArrayOfSaveRouteTemplateArgs_QNAME, ArrayOfSaveRouteTemplateArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMidRouteDepotStopTemplateArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveMidRouteDepotStopTemplateArgs")
    public JAXBElement<SaveMidRouteDepotStopTemplateArgs> createSaveMidRouteDepotStopTemplateArgs(SaveMidRouteDepotStopTemplateArgs value) {
        return new JAXBElement<SaveMidRouteDepotStopTemplateArgs>(_SaveMidRouteDepotStopTemplateArgs_QNAME, SaveMidRouteDepotStopTemplateArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveLayoverStopTemplateArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveLayoverStopTemplateArgs")
    public JAXBElement<SaveLayoverStopTemplateArgs> createSaveLayoverStopTemplateArgs(SaveLayoverStopTemplateArgs value) {
        return new JAXBElement<SaveLayoverStopTemplateArgs>(_SaveLayoverStopTemplateArgs_QNAME, SaveLayoverStopTemplateArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestLayoverTemplateOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SuggestLayoverTemplateOptions")
    public JAXBElement<SuggestLayoverTemplateOptions> createSuggestLayoverTemplateOptions(SuggestLayoverTemplateOptions value) {
        return new JAXBElement<SuggestLayoverTemplateOptions>(_SuggestLayoverTemplateOptions_QNAME, SuggestLayoverTemplateOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteTemplateCandidates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SuggestRouteTemplateCandidates")
    public JAXBElement<SuggestRouteTemplateCandidates> createSuggestRouteTemplateCandidates(SuggestRouteTemplateCandidates value) {
        return new JAXBElement<SuggestRouteTemplateCandidates>(_SuggestRouteTemplateCandidates_QNAME, SuggestRouteTemplateCandidates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteTemplateFromRouteArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveRouteTemplateFromRouteArgs")
    public JAXBElement<SaveRouteTemplateFromRouteArgs> createSaveRouteTemplateFromRouteArgs(SaveRouteTemplateFromRouteArgs value) {
        return new JAXBElement<SaveRouteTemplateFromRouteArgs>(_SaveRouteTemplateFromRouteArgs_QNAME, SaveRouteTemplateFromRouteArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteTemplateFromRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfSaveRouteTemplateFromRouteResult")
    public JAXBElement<ArrayOfSaveRouteTemplateFromRouteResult> createArrayOfSaveRouteTemplateFromRouteResult(ArrayOfSaveRouteTemplateFromRouteResult value) {
        return new JAXBElement<ArrayOfSaveRouteTemplateFromRouteResult>(_ArrayOfSaveRouteTemplateFromRouteResult_QNAME, ArrayOfSaveRouteTemplateFromRouteResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteTemplateFromRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveRouteTemplateFromRouteResult")
    public JAXBElement<SaveRouteTemplateFromRouteResult> createSaveRouteTemplateFromRouteResult(SaveRouteTemplateFromRouteResult value) {
        return new JAXBElement<SaveRouteTemplateFromRouteResult>(_SaveRouteTemplateFromRouteResult_QNAME, SaveRouteTemplateFromRouteResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOrdersParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendOrdersParameters")
    public JAXBElement<SendOrdersParameters> createSendOrdersParameters(SendOrdersParameters value) {
        return new JAXBElement<SendOrdersParameters>(_SendOrdersParameters_QNAME, SendOrdersParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOrdersParametersStopNumberFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendOrdersParameters.StopNumberFormat")
    public JAXBElement<SendOrdersParametersStopNumberFormat> createSendOrdersParametersStopNumberFormat(SendOrdersParametersStopNumberFormat value) {
        return new JAXBElement<SendOrdersParametersStopNumberFormat>(_SendOrdersParametersStopNumberFormat_QNAME, SendOrdersParametersStopNumberFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOrdersParametersVariableServiceTimeFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendOrdersParameters.VariableServiceTimeFormat")
    public JAXBElement<SendOrdersParametersVariableServiceTimeFormat> createSendOrdersParametersVariableServiceTimeFormat(SendOrdersParametersVariableServiceTimeFormat value) {
        return new JAXBElement<SendOrdersParametersVariableServiceTimeFormat>(_SendOrdersParametersVariableServiceTimeFormat_QNAME, SendOrdersParametersVariableServiceTimeFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOrdersParametersSendOrdersTimeZoneOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendOrdersParameters.SendOrdersTimeZoneOption")
    public JAXBElement<SendOrdersParametersSendOrdersTimeZoneOption> createSendOrdersParametersSendOrdersTimeZoneOption(SendOrdersParametersSendOrdersTimeZoneOption value) {
        return new JAXBElement<SendOrdersParametersSendOrdersTimeZoneOption>(_SendOrdersParametersSendOrdersTimeZoneOption_QNAME, SendOrdersParametersSendOrdersTimeZoneOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOrdersResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendOrdersResults")
    public JAXBElement<SendOrdersResults> createSendOrdersResults(SendOrdersResults value) {
        return new JAXBElement<SendOrdersResults>(_SendOrdersResults_QNAME, SendOrdersResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSendOrdersPropertyResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrayOfSendOrdersPropertyResult")
    public JAXBElement<ArrayOfSendOrdersPropertyResult> createArrayOfSendOrdersPropertyResult(ArrayOfSendOrdersPropertyResult value) {
        return new JAXBElement<ArrayOfSendOrdersPropertyResult>(_ArrayOfSendOrdersPropertyResult_QNAME, ArrayOfSendOrdersPropertyResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOrdersPropertyResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendOrdersPropertyResult")
    public JAXBElement<SendOrdersPropertyResult> createSendOrdersPropertyResult(SendOrdersPropertyResult value) {
        return new JAXBElement<SendOrdersPropertyResult>(_SendOrdersPropertyResult_QNAME, SendOrdersPropertyResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateRouteTravelPathOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "GenerateRouteTravelPathOptions")
    public JAXBElement<GenerateRouteTravelPathOptions> createGenerateRouteTravelPathOptions(GenerateRouteTravelPathOptions value) {
        return new JAXBElement<GenerateRouteTravelPathOptions>(_GenerateRouteTravelPathOptions_QNAME, GenerateRouteTravelPathOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateRoutePathOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "GenerateRoutePathOptions")
    public JAXBElement<GenerateRoutePathOptions> createGenerateRoutePathOptions(GenerateRoutePathOptions value) {
        return new JAXBElement<GenerateRoutePathOptions>(_GenerateRoutePathOptions_QNAME, GenerateRoutePathOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateRouteTemplateTravelPathOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "GenerateRouteTemplateTravelPathOptions")
    public JAXBElement<GenerateRouteTemplateTravelPathOptions> createGenerateRouteTemplateTravelPathOptions(GenerateRouteTemplateTravelPathOptions value) {
        return new JAXBElement<GenerateRouteTemplateTravelPathOptions>(_GenerateRouteTemplateTravelPathOptions_QNAME, GenerateRouteTemplateTravelPathOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvancedLoggingOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AdvancedLoggingOptions")
    public JAXBElement<AdvancedLoggingOptions> createAdvancedLoggingOptions(AdvancedLoggingOptions value) {
        return new JAXBElement<AdvancedLoggingOptions>(_AdvancedLoggingOptions_QNAME, AdvancedLoggingOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptimizingGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "OptimizingGoal")
    public JAXBElement<OptimizingGoal> createOptimizingGoal(OptimizingGoal value) {
        return new JAXBElement<OptimizingGoal>(_OptimizingGoal_QNAME, OptimizingGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "OptimizeOptions.IgnoreFlags")
    public JAXBElement<List<String>> createOptimizeOptionsIgnoreFlags(List<String> value) {
        return new JAXBElement<List<String>>(_OptimizeOptionsIgnoreFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequencingGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "SequencingGoal")
    public JAXBElement<SequencingGoal> createSequencingGoal(SequencingGoal value) {
        return new JAXBElement<SequencingGoal>(_SequencingGoal_QNAME, SequencingGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "SequenceOptions.IgnoreFlags")
    public JAXBElement<List<String>> createSequenceOptionsIgnoreFlags(List<String> value) {
        return new JAXBElement<List<String>>(_SequenceOptionsIgnoreFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptimizeOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "OptimizeOptions")
    public JAXBElement<OptimizeOptions> createOptimizeOptions(OptimizeOptions value) {
        return new JAXBElement<OptimizeOptions>(_OptimizeOptions_QNAME, OptimizeOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "SequenceOptions")
    public JAXBElement<SequenceOptions> createSequenceOptions(SequenceOptions value) {
        return new JAXBElement<SequenceOptions>(_SequenceOptions_QNAME, SequenceOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "ArrayOfRouteRetrievalOptions")
    public JAXBElement<ArrayOfRouteRetrievalOptions> createArrayOfRouteRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_ArrayOfRouteRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "RouteRetrievalOptions")
    public JAXBElement<RouteRetrievalOptions> createRouteRetrievalOptions(RouteRetrievalOptions value) {
        return new JAXBElement<RouteRetrievalOptions>(_RouteRetrievalOptions_QNAME, RouteRetrievalOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateStationaryResourceEventWithStopsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "AssociateStationaryResourceEventWithStopsOptions")
    public JAXBElement<AssociateStationaryResourceEventWithStopsOptions> createAssociateStationaryResourceEventWithStopsOptions(AssociateStationaryResourceEventWithStopsOptions value) {
        return new JAXBElement<AssociateStationaryResourceEventWithStopsOptions>(_AssociateStationaryResourceEventWithStopsOptions_QNAME, AssociateStationaryResourceEventWithStopsOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStopsUsingStationaryResourceEventOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "AddStopsUsingStationaryResourceEventOptions")
    public JAXBElement<AddStopsUsingStationaryResourceEventOptions> createAddStopsUsingStationaryResourceEventOptions(AddStopsUsingStationaryResourceEventOptions value) {
        return new JAXBElement<AddStopsUsingStationaryResourceEventOptions>(_AddStopsUsingStationaryResourceEventOptions_QNAME, AddStopsUsingStationaryResourceEventOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkStopAsUnserviceableOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "MarkStopAsUnserviceableOptions")
    public JAXBElement<MarkStopAsUnserviceableOptions> createMarkStopAsUnserviceableOptions(MarkStopAsUnserviceableOptions value) {
        return new JAXBElement<MarkStopAsUnserviceableOptions>(_MarkStopAsUnserviceableOptions_QNAME, MarkStopAsUnserviceableOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRoutesJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteRoutes", name = "DeleteRoutesJobParameters")
    public JAXBElement<DeleteRoutesJobParameters> createDeleteRoutesJobParameters(DeleteRoutesJobParameters value) {
        return new JAXBElement<DeleteRoutesJobParameters>(_DeleteRoutesJobParameters_QNAME, DeleteRoutesJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateOptimalRouteMetricsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.CalculateOptimal", name = "CalculateOptimalRouteMetricsParameters")
    public JAXBElement<CalculateOptimalRouteMetricsParameters> createCalculateOptimalRouteMetricsParameters(CalculateOptimalRouteMetricsParameters value) {
        return new JAXBElement<CalculateOptimalRouteMetricsParameters>(_CalculateOptimalRouteMetricsParameters_QNAME, CalculateOptimalRouteMetricsParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveUnassignedOrdersToSessionJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.MoveUnassignedOrdersToSession", name = "MoveUnassignedOrdersToSessionJobParameters")
    public JAXBElement<MoveUnassignedOrdersToSessionJobParameters> createMoveUnassignedOrdersToSessionJobParameters(MoveUnassignedOrdersToSessionJobParameters value) {
        return new JAXBElement<MoveUnassignedOrdersToSessionJobParameters>(_MoveUnassignedOrdersToSessionJobParameters_QNAME, MoveUnassignedOrdersToSessionJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTerritoriesJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteTerritories", name = "DeleteTerritoriesJobParameters")
    public JAXBElement<DeleteTerritoriesJobParameters> createDeleteTerritoriesJobParameters(DeleteTerritoriesJobParameters value) {
        return new JAXBElement<DeleteTerritoriesJobParameters>(_DeleteTerritoriesJobParameters_QNAME, DeleteTerritoriesJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDailyRoutesJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.UpdateDailyRoutes", name = "UpdateDailyRoutesJobParameters")
    public JAXBElement<UpdateDailyRoutesJobParameters> createUpdateDailyRoutesJobParameters(UpdateDailyRoutesJobParameters value) {
        return new JAXBElement<UpdateDailyRoutesJobParameters>(_UpdateDailyRoutesJobParameters_QNAME, UpdateDailyRoutesJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShiftDaysJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ShiftDays", name = "ShiftDaysJobParameters")
    public JAXBElement<ShiftDaysJobParameters> createShiftDaysJobParameters(ShiftDaysJobParameters value) {
        return new JAXBElement<ShiftDaysJobParameters>(_ShiftDaysJobParameters_QNAME, ShiftDaysJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferRecurringOrdersParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", name = "TransferRecurringOrdersParameters")
    public JAXBElement<TransferRecurringOrdersParameters> createTransferRecurringOrdersParameters(TransferRecurringOrdersParameters value) {
        return new JAXBElement<TransferRecurringOrdersParameters>(_TransferRecurringOrdersParameters_QNAME, TransferRecurringOrdersParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStrategicRoutingSessionJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteStrategicRoutingSession", name = "DeleteStrategicRoutingSessionJobParameters")
    public JAXBElement<DeleteStrategicRoutingSessionJobParameters> createDeleteStrategicRoutingSessionJobParameters(DeleteStrategicRoutingSessionJobParameters value) {
        return new JAXBElement<DeleteStrategicRoutingSessionJobParameters>(_DeleteStrategicRoutingSessionJobParameters_QNAME, DeleteStrategicRoutingSessionJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveSessionAsJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", name = "SaveSessionAsJobParameters")
    public JAXBElement<SaveSessionAsJobParameters> createSaveSessionAsJobParameters(SaveSessionAsJobParameters value) {
        return new JAXBElement<SaveSessionAsJobParameters>(_SaveSessionAsJobParameters_QNAME, SaveSessionAsJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareForNextDayJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.PrepareForNextDay", name = "PrepareForNextDayJobParameters")
    public JAXBElement<PrepareForNextDayJobParameters> createPrepareForNextDayJobParameters(PrepareForNextDayJobParameters value) {
        return new JAXBElement<PrepareForNextDayJobParameters>(_PrepareForNextDayJobParameters_QNAME, PrepareForNextDayJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStrategicPlanningSessionCacheJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Routing", name = "UpdateStrategicPlanningSessionCacheJobParameters")
    public JAXBElement<UpdateStrategicPlanningSessionCacheJobParameters> createUpdateStrategicPlanningSessionCacheJobParameters(UpdateStrategicPlanningSessionCacheJobParameters value) {
        return new JAXBElement<UpdateStrategicPlanningSessionCacheJobParameters>(_UpdateStrategicPlanningSessionCacheJobParameters_QNAME, UpdateStrategicPlanningSessionCacheJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCustomFormsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Import", name = "ExportCustomFormsOptions")
    public JAXBElement<ExportCustomFormsOptions> createExportCustomFormsOptions(ExportCustomFormsOptions value) {
        return new JAXBElement<ExportCustomFormsOptions>(_ExportCustomFormsOptions_QNAME, ExportCustomFormsOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCustomFormsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Import", name = "ExportCustomFormsResult")
    public JAXBElement<ExportCustomFormsResult> createExportCustomFormsResult(ExportCustomFormsResult value) {
        return new JAXBElement<ExportCustomFormsResult>(_ExportCustomFormsResult_QNAME, ExportCustomFormsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "SuggestRouteParameters.SuggestIgnoreFlags")
    public JAXBElement<List<String>> createSuggestRouteParametersSuggestIgnoreFlags(List<String> value) {
        return new JAXBElement<List<String>>(_SuggestRouteParametersSuggestIgnoreFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteParametersSuggestRouteGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "SuggestRouteParameters.SuggestRouteGoal")
    public JAXBElement<SuggestRouteParametersSuggestRouteGoal> createSuggestRouteParametersSuggestRouteGoal(SuggestRouteParametersSuggestRouteGoal value) {
        return new JAXBElement<SuggestRouteParametersSuggestRouteGoal>(_SuggestRouteParametersSuggestRouteGoal_QNAME, SuggestRouteParametersSuggestRouteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "SuggestRouteParameters")
    public JAXBElement<SuggestRouteParameters> createSuggestRouteParameters(SuggestRouteParameters value) {
        return new JAXBElement<SuggestRouteParameters>(_SuggestRouteParameters_QNAME, SuggestRouteParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "SuggestRouteResult")
    public JAXBElement<SuggestRouteResult> createSuggestRouteResult(SuggestRouteResult value) {
        return new JAXBElement<SuggestRouteResult>(_SuggestRouteResult_QNAME, SuggestRouteResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSuggestRouteResultSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "ArrayOfSuggestRouteResult.Suggestion")
    public JAXBElement<ArrayOfSuggestRouteResultSuggestion> createArrayOfSuggestRouteResultSuggestion(ArrayOfSuggestRouteResultSuggestion value) {
        return new JAXBElement<ArrayOfSuggestRouteResultSuggestion>(_ArrayOfSuggestRouteResultSuggestion_QNAME, ArrayOfSuggestRouteResultSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteResultSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "SuggestRouteResult.Suggestion")
    public JAXBElement<SuggestRouteResultSuggestion> createSuggestRouteResultSuggestion(SuggestRouteResultSuggestion value) {
        return new JAXBElement<SuggestRouteResultSuggestion>(_SuggestRouteResultSuggestion_QNAME, SuggestRouteResultSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateServiceTimeParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", name = "UpdateServiceTimeParameters")
    public JAXBElement<UpdateServiceTimeParameters> createUpdateServiceTimeParameters(UpdateServiceTimeParameters value) {
        return new JAXBElement<UpdateServiceTimeParameters>(_UpdateServiceTimeParameters_QNAME, UpdateServiceTimeParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateServiceTimeParametersServiceItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", name = "UpdateServiceTimeParameters.ServiceItemType")
    public JAXBElement<UpdateServiceTimeParametersServiceItemType> createUpdateServiceTimeParametersServiceItemType(UpdateServiceTimeParametersServiceItemType value) {
        return new JAXBElement<UpdateServiceTimeParametersServiceItemType>(_UpdateServiceTimeParametersServiceItemType_QNAME, UpdateServiceTimeParametersServiceItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDiagnosticsInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", name = "ClientDiagnosticsInformation")
    public JAXBElement<ClientDiagnosticsInformation> createClientDiagnosticsInformation(ClientDiagnosticsInformation value) {
        return new JAXBElement<ClientDiagnosticsInformation>(_ClientDiagnosticsInformation_QNAME, ClientDiagnosticsInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", name = "LogFile")
    public JAXBElement<LogFile> createLogFile(LogFile value) {
        return new JAXBElement<LogFile>(_LogFile_QNAME, LogFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClientDiagnosticsInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", name = "ArrayOfClientDiagnosticsInformation")
    public JAXBElement<ArrayOfClientDiagnosticsInformation> createArrayOfClientDiagnosticsInformation(ArrayOfClientDiagnosticsInformation value) {
        return new JAXBElement<ArrayOfClientDiagnosticsInformation>(_ArrayOfClientDiagnosticsInformation_QNAME, ArrayOfClientDiagnosticsInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", name = "FileData", scope = LogFile.class)
    public JAXBElement<byte[]> createLogFileFileData(byte[] value) {
        return new JAXBElement<byte[]>(_LogFileFileData_QNAME, byte[].class, LogFile.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", name = "FileName", scope = LogFile.class)
    public JAXBElement<String> createLogFileFileName(String value) {
        return new JAXBElement<String>(_LogFileFileName_QNAME, String.class, LogFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", name = "Username", scope = LogFile.class)
    public JAXBElement<String> createLogFileUsername(String value) {
        return new JAXBElement<String>(_LogFileUsername_QNAME, String.class, LogFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "Impact", scope = SuggestRouteResultSuggestion.class)
    public JAXBElement<RouteResult> createSuggestRouteResultSuggestionImpact(RouteResult value) {
        return new JAXBElement<RouteResult>(_SuggestRouteResultSuggestionImpact_QNAME, RouteResult.class, SuggestRouteResultSuggestion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "Placement", scope = SuggestRouteResultSuggestion.class)
    public JAXBElement<Placement> createSuggestRouteResultSuggestionPlacement(Placement value) {
        return new JAXBElement<Placement>(_SuggestRouteResultSuggestionPlacement_QNAME, Placement.class, SuggestRouteResultSuggestion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ErrorType_Type", scope = SendOrdersPropertyResult.class)
    public JAXBElement<String> createSendOrdersPropertyResultErrorTypeType(String value) {
        return new JAXBElement<String>(_SendOrdersPropertyResultErrorTypeType_QNAME, String.class, SendOrdersPropertyResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertySendOrderTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Property", scope = SendOrdersPropertyResult.class)
    public JAXBElement<PropertySendOrderTemplate> createSendOrdersPropertyResultProperty(PropertySendOrderTemplate value) {
        return new JAXBElement<PropertySendOrderTemplate>(_SendOrdersPropertyResultProperty_QNAME, PropertySendOrderTemplate.class, SendOrdersPropertyResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Error", scope = SaveRouteTemplateFromRouteResult.class)
    public JAXBElement<SaveErrorInfo> createSaveRouteTemplateFromRouteResultError(SaveErrorInfo value) {
        return new JAXBElement<SaveErrorInfo>(_SaveRouteTemplateFromRouteResultError_QNAME, SaveErrorInfo.class, SaveRouteTemplateFromRouteResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OperationResult_Result", scope = SaveRouteTemplateFromRouteResult.class)
    public JAXBElement<String> createSaveRouteTemplateFromRouteResultOperationResultResult(String value) {
        return new JAXBElement<String>(_SaveRouteTemplateFromRouteResultOperationResultResult_QNAME, String.class, SaveRouteTemplateFromRouteResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteTemplate", scope = SaveRouteTemplateFromRouteResult.class)
    public JAXBElement<RouteTemplate> createSaveRouteTemplateFromRouteResultRouteTemplate(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_SaveRouteTemplateFromRouteResultRouteTemplate_QNAME, RouteTemplate.class, SaveRouteTemplateFromRouteResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ConfigVersion", scope = UpgradeRoadnetTelematicsDeviceConfigurationInfo.class)
    public JAXBElement<String> createUpgradeRoadnetTelematicsDeviceConfigurationInfoConfigVersion(String value) {
        return new JAXBElement<String>(_UpgradeRoadnetTelematicsDeviceConfigurationInfoConfigVersion_QNAME, String.class, UpgradeRoadnetTelematicsDeviceConfigurationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "FirmwareVersion", scope = UpgradeRoadnetTelematicsDeviceConfigurationInfo.class)
    public JAXBElement<String> createUpgradeRoadnetTelematicsDeviceConfigurationInfoFirmwareVersion(String value) {
        return new JAXBElement<String>(_UpgradeRoadnetTelematicsDeviceConfigurationInfoFirmwareVersion_QNAME, String.class, UpgradeRoadnetTelematicsDeviceConfigurationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ScriptVersion", scope = UpgradeRoadnetTelematicsDeviceConfigurationInfo.class)
    public JAXBElement<String> createUpgradeRoadnetTelematicsDeviceConfigurationInfoScriptVersion(String value) {
        return new JAXBElement<String>(_UpgradeRoadnetTelematicsDeviceConfigurationInfoScriptVersion_QNAME, String.class, UpgradeRoadnetTelematicsDeviceConfigurationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleDatabaseVersion", scope = UpgradeRoadnetTelematicsDeviceConfigurationInfo.class)
    public JAXBElement<String> createUpgradeRoadnetTelematicsDeviceConfigurationInfoVehicleDatabaseVersion(String value) {
        return new JAXBElement<String>(_UpgradeRoadnetTelematicsDeviceConfigurationInfoVehicleDatabaseVersion_QNAME, String.class, UpgradeRoadnetTelematicsDeviceConfigurationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleInterfaceFirmwareVersion", scope = UpgradeRoadnetTelematicsDeviceConfigurationInfo.class)
    public JAXBElement<String> createUpgradeRoadnetTelematicsDeviceConfigurationInfoVehicleInterfaceFirmwareVersion(String value) {
        return new JAXBElement<String>(_UpgradeRoadnetTelematicsDeviceConfigurationInfoVehicleInterfaceFirmwareVersion_QNAME, String.class, UpgradeRoadnetTelematicsDeviceConfigurationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteInstance", scope = LockOrderResultsLockOrdersForRouteFailure.class)
    public JAXBElement<DomainInstance> createLockOrderResultsLockOrdersForRouteFailureRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_LockOrderResultsLockOrdersForRouteFailureRouteInstance_QNAME, DomainInstance.class, LockOrderResultsLockOrdersForRouteFailure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopEntityKey", scope = LockOrderResultsLockOrdersForStopFailure.class)
    public JAXBElement<Long> createLockOrderResultsLockOrdersForStopFailureStopEntityKey(Long value) {
        return new JAXBElement<Long>(_LockOrderResultsLockOrdersForStopFailureStopEntityKey_QNAME, Long.class, LockOrderResultsLockOrdersForStopFailure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Error", scope = CalculateRouteResult.class)
    public JAXBElement<SaveErrorInfo> createCalculateRouteResultError(SaveErrorInfo value) {
        return new JAXBElement<SaveErrorInfo>(_SaveRouteTemplateFromRouteResultError_QNAME, SaveErrorInfo.class, CalculateRouteResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EntityName", scope = CreateCellsFromRoutesResultCreateCellsFromRoutesError.class)
    public JAXBElement<String> createCreateCellsFromRoutesResultCreateCellsFromRoutesErrorEntityName(String value) {
        return new JAXBElement<String>(_CreateCellsFromRoutesResultCreateCellsFromRoutesErrorEntityName_QNAME, String.class, CreateCellsFromRoutesResultCreateCellsFromRoutesError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Identifier", scope = CreateCellsFromRoutesResultCreateCellsFromRoutesError.class)
    public JAXBElement<String> createCreateCellsFromRoutesResultCreateCellsFromRoutesErrorIdentifier(String value) {
        return new JAXBElement<String>(_CreateCellsFromRoutesResultCreateCellsFromRoutesErrorIdentifier_QNAME, String.class, CreateCellsFromRoutesResultCreateCellsFromRoutesError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OwningRoute", scope = RouteStopTaskInstances.class)
    public JAXBElement<DomainInstance> createRouteStopTaskInstancesOwningRoute(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_RouteStopTaskInstancesOwningRoute_QNAME, DomainInstance.class, RouteStopTaskInstances.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TaskEntityKeys", scope = RouteStopTaskInstances.class)
    public JAXBElement<ArrayOflong> createRouteStopTaskInstancesTaskEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RouteStopTaskInstancesTaskEntityKeys_QNAME, ArrayOflong.class, RouteStopTaskInstances.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OwningRoute", scope = RouteStopInstances.class)
    public JAXBElement<DomainInstance> createRouteStopInstancesOwningRoute(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_RouteStopTaskInstancesOwningRoute_QNAME, DomainInstance.class, RouteStopInstances.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopEntityKeys", scope = RouteStopInstances.class)
    public JAXBElement<ArrayOflong> createRouteStopInstancesStopEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RouteStopInstancesStopEntityKeys_QNAME, ArrayOflong.class, RouteStopInstances.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Error", scope = UndeleteEntityResult.class)
    public JAXBElement<TransferErrorCode> createUndeleteEntityResultError(TransferErrorCode value) {
        return new JAXBElement<TransferErrorCode>(_SaveRouteTemplateFromRouteResultError_QNAME, TransferErrorCode.class, UndeleteEntityResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Identifier", scope = DetailItem.class)
    public JAXBElement<String> createDetailItemIdentifier(String value) {
        return new JAXBElement<String>(_CreateCellsFromRoutesResultCreateCellsFromRoutesErrorIdentifier_QNAME, String.class, DetailItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderCancelReasonCodeEntityKey", scope = DetailItem.class)
    public JAXBElement<Long> createDetailItemOrderCancelReasonCodeEntityKey(Long value) {
        return new JAXBElement<Long>(_DetailItemOrderCancelReasonCodeEntityKey_QNAME, Long.class, DetailItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderIdentifier", scope = DeliveryDetailsUpdateActionLineItemDetailItem.class)
    public JAXBElement<String> createDeliveryDetailsUpdateActionLineItemDetailItemOrderIdentifier(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionLineItemDetailItemOrderIdentifier_QNAME, String.class, DeliveryDetailsUpdateActionLineItemDetailItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDetailsUpdateActionDetailItemQuantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Quantities", scope = DeliveryDetailsUpdateActionLineItemDetailItem.class)
    public JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities> createDeliveryDetailsUpdateActionLineItemDetailItemQuantities(DeliveryDetailsUpdateActionDetailItemQuantities value) {
        return new JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities>(_DeliveryDetailsUpdateActionLineItemDetailItemQuantities_QNAME, DeliveryDetailsUpdateActionDetailItemQuantities.class, DeliveryDetailsUpdateActionLineItemDetailItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EndPoint", scope = ShortestPathCriteria.class)
    public JAXBElement<Coordinate> createShortestPathCriteriaEndPoint(Coordinate value) {
        return new JAXBElement<Coordinate>(_ShortestPathCriteriaEndPoint_QNAME, Coordinate.class, ShortestPathCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StartPoint", scope = ShortestPathCriteria.class)
    public JAXBElement<Coordinate> createShortestPathCriteriaStartPoint(Coordinate value) {
        return new JAXBElement<Coordinate>(_ShortestPathCriteriaStartPoint_QNAME, Coordinate.class, ShortestPathCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteTemplateInstance", scope = TemplatePlacement.class)
    public JAXBElement<DomainInstance> createTemplatePlacementRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_TemplatePlacementRouteTemplateInstance_QNAME, DomainInstance.class, TemplatePlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Position_Place", scope = OnRouteTemplatePlacement.class)
    public JAXBElement<String> createOnRouteTemplatePlacementPositionPlace(String value) {
        return new JAXBElement<String>(_OnRouteTemplatePlacementPositionPlace_QNAME, String.class, OnRouteTemplatePlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Position_Place", scope = OnStopTemplatePlacement.class)
    public JAXBElement<String> createOnStopTemplatePlacementPositionPlace(String value) {
        return new JAXBElement<String>(_OnRouteTemplatePlacementPositionPlace_QNAME, String.class, OnStopTemplatePlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeltaDistance", scope = SuggestRouteTemplateResultSuggestion.class)
    public JAXBElement<Distance> createSuggestRouteTemplateResultSuggestionDeltaDistance(Distance value) {
        return new JAXBElement<Distance>(_SuggestRouteTemplateResultSuggestionDeltaDistance_QNAME, Distance.class, SuggestRouteTemplateResultSuggestion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Placement", scope = SuggestRouteTemplateResultSuggestion.class)
    public JAXBElement<TemplatePlacement> createSuggestRouteTemplateResultSuggestionPlacement(TemplatePlacement value) {
        return new JAXBElement<TemplatePlacement>(_Placement_QNAME, TemplatePlacement.class, SuggestRouteTemplateResultSuggestion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DistanceTo", scope = StopActuals.class)
    public JAXBElement<Distance> createStopActualsDistanceTo(Distance value) {
        return new JAXBElement<Distance>(_StopActualsDistanceTo_QNAME, Distance.class, StopActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Orders", scope = ServiceableStopActuals.class)
    public JAXBElement<ArrayOfOrderActuals> createServiceableStopActualsOrders(ArrayOfOrderActuals value) {
        return new JAXBElement<ArrayOfOrderActuals>(_ServiceableStopActualsOrders_QNAME, ArrayOfOrderActuals.class, ServiceableStopActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteInstance", scope = Placement.class)
    public JAXBElement<DomainInstance> createPlacementRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_LockOrderResultsLockOrdersForRouteFailureRouteInstance_QNAME, DomainInstance.class, Placement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TargetServicePatternEntityKey", scope = Placement.class)
    public JAXBElement<Long> createPlacementTargetServicePatternEntityKey(Long value) {
        return new JAXBElement<Long>(_PlacementTargetServicePatternEntityKey_QNAME, Long.class, Placement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDailyStopPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RoutePlacements", scope = OnTerritoryAndRoutesPlacement.class)
    public JAXBElement<ArrayOfDailyStopPosition> createOnTerritoryAndRoutesPlacementRoutePlacements(ArrayOfDailyStopPosition value) {
        return new JAXBElement<ArrayOfDailyStopPosition>(_OnTerritoryAndRoutesPlacementRoutePlacements_QNAME, ArrayOfDailyStopPosition.class, OnTerritoryAndRoutesPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServicePatternEntityKey", scope = OnTerritoryAndRoutesPlacement.class)
    public JAXBElement<Long> createOnTerritoryAndRoutesPlacementServicePatternEntityKey(Long value) {
        return new JAXBElement<Long>(_OnTerritoryAndRoutesPlacementServicePatternEntityKey_QNAME, Long.class, OnTerritoryAndRoutesPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveRecurringOrderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MoveRecurringOrderOptions", scope = OnTerritoryPlacement.class)
    public JAXBElement<MoveRecurringOrderOptions> createOnTerritoryPlacementMoveRecurringOrderOptions(MoveRecurringOrderOptions value) {
        return new JAXBElement<MoveRecurringOrderOptions>(_MoveRecurringOrderOptions_QNAME, MoveRecurringOrderOptions.class, OnTerritoryPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Position_PositionOnRoutes", scope = OnTerritoryPlacement.class)
    public JAXBElement<String> createOnTerritoryPlacementPositionPositionOnRoutes(String value) {
        return new JAXBElement<String>(_OnTerritoryPlacementPositionPositionOnRoutes_QNAME, String.class, OnTerritoryPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryDamagedQuantity", scope = OrderActuals.class)
    public JAXBElement<Quantities> createOrderActualsDeliveryDamagedQuantity(Quantities value) {
        return new JAXBElement<Quantities>(_OrderActualsDeliveryDamagedQuantity_QNAME, Quantities.class, OrderActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryOverQuantity", scope = OrderActuals.class)
    public JAXBElement<Quantities> createOrderActualsDeliveryOverQuantity(Quantities value) {
        return new JAXBElement<Quantities>(_OrderActualsDeliveryOverQuantity_QNAME, Quantities.class, OrderActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryQuantity", scope = OrderActuals.class)
    public JAXBElement<Quantities> createOrderActualsDeliveryQuantity(Quantities value) {
        return new JAXBElement<Quantities>(_OrderActualsDeliveryQuantity_QNAME, Quantities.class, OrderActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryShortQuantity", scope = OrderActuals.class)
    public JAXBElement<Quantities> createOrderActualsDeliveryShortQuantity(Quantities value) {
        return new JAXBElement<Quantities>(_OrderActualsDeliveryShortQuantity_QNAME, Quantities.class, OrderActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineItemActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LineItems", scope = OrderActuals.class)
    public JAXBElement<ArrayOfLineItemActuals> createOrderActualsLineItems(ArrayOfLineItemActuals value) {
        return new JAXBElement<ArrayOfLineItemActuals>(_OrderActualsLineItems_QNAME, ArrayOfLineItemActuals.class, OrderActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PickupDamagedQuantity", scope = OrderActuals.class)
    public JAXBElement<Quantities> createOrderActualsPickupDamagedQuantity(Quantities value) {
        return new JAXBElement<Quantities>(_OrderActualsPickupDamagedQuantity_QNAME, Quantities.class, OrderActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PickupOverQuantity", scope = OrderActuals.class)
    public JAXBElement<Quantities> createOrderActualsPickupOverQuantity(Quantities value) {
        return new JAXBElement<Quantities>(_OrderActualsPickupOverQuantity_QNAME, Quantities.class, OrderActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PickupQuantity", scope = OrderActuals.class)
    public JAXBElement<Quantities> createOrderActualsPickupQuantity(Quantities value) {
        return new JAXBElement<Quantities>(_OrderActualsPickupQuantity_QNAME, Quantities.class, OrderActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PickupShortQuantity", scope = OrderActuals.class)
    public JAXBElement<Quantities> createOrderActualsPickupShortQuantity(Quantities value) {
        return new JAXBElement<Quantities>(_OrderActualsPickupShortQuantity_QNAME, Quantities.class, OrderActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DataCommunicationsType_DataCommunicationsType", scope = MobileDeviceAction.class)
    public JAXBElement<String> createMobileDeviceActionDataCommunicationsTypeDataCommunicationsType(String value) {
        return new JAXBElement<String>(_MobileDeviceActionDataCommunicationsTypeDataCommunicationsType_QNAME, String.class, MobileDeviceAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MessageId", scope = MobileDeviceAction.class)
    public JAXBElement<Integer> createMobileDeviceActionMessageId(Integer value) {
        return new JAXBElement<Integer>(_MobileDeviceActionMessageId_QNAME, Integer.class, MobileDeviceAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetailItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DetailItems", scope = DeliveryDetailsUpdateAction.class)
    public JAXBElement<ArrayOfDetailItem> createDeliveryDetailsUpdateActionDetailItems(ArrayOfDetailItem value) {
        return new JAXBElement<ArrayOfDetailItem>(_DeliveryDetailsUpdateActionDetailItems_QNAME, ArrayOfDetailItem.class, DeliveryDetailsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = DeliveryDetailsUpdateAction.class)
    public JAXBElement<StopIdentity> createDeliveryDetailsUpdateActionStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, DeliveryDetailsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StartTime", scope = StartRouteAction.class)
    public JAXBElement<QualityPairedDateTime> createStartRouteActionStartTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_StartRouteActionStartTime_QNAME, QualityPairedDateTime.class, StartRouteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Image", scope = SendNoteActionRouteNoteMessageArgs.class)
    public JAXBElement<byte[]> createSendNoteActionRouteNoteMessageArgsImage(byte[] value) {
        return new JAXBElement<byte[]>(_SendNoteActionRouteNoteMessageArgsImage_QNAME, byte[].class, SendNoteActionRouteNoteMessageArgs.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Message", scope = SendNoteActionRouteNoteMessageArgs.class)
    public JAXBElement<String> createSendNoteActionRouteNoteMessageArgsMessage(String value) {
        return new JAXBElement<String>(_SendNoteActionRouteNoteMessageArgsMessage_QNAME, String.class, SendNoteActionRouteNoteMessageArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = SendNoteActionStopNoteMessageArgs.class)
    public JAXBElement<StopIdentity> createSendNoteActionStopNoteMessageArgsStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, SendNoteActionStopNoteMessageArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNoteActionRouteNoteMessageArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MessageArgs", scope = SendNoteAction.class)
    public JAXBElement<SendNoteActionRouteNoteMessageArgs> createSendNoteActionMessageArgs(SendNoteActionRouteNoteMessageArgs value) {
        return new JAXBElement<SendNoteActionRouteNoteMessageArgs>(_SendNoteActionMessageArgs_QNAME, SendNoteActionRouteNoteMessageArgs.class, SendNoteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Placement", scope = ResequenceStopAction.class)
    public JAXBElement<Placement> createResequenceStopActionPlacement(Placement value) {
        return new JAXBElement<Placement>(_Placement_QNAME, Placement.class, ResequenceStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = ResequenceStopAction.class)
    public JAXBElement<StopIdentity> createResequenceStopActionStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, ResequenceStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DepartureTime", scope = DepartOriginAction.class)
    public JAXBElement<QualityPairedDateTime> createDepartOriginActionDepartureTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_DepartOriginActionDepartureTime_QNAME, QualityPairedDateTime.class, DepartOriginAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CompletionTime", scope = CompleteRouteAction.class)
    public JAXBElement<QualityPairedDateTime> createCompleteRouteActionCompletionTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_CompleteRouteActionCompletionTime_QNAME, QualityPairedDateTime.class, CompleteRouteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDistance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DistanceToDestination", scope = CompleteRouteAction.class)
    public JAXBElement<QualityPairedDistance> createCompleteRouteActionDistanceToDestination(QualityPairedDistance value) {
        return new JAXBElement<QualityPairedDistance>(_CompleteRouteActionDistanceToDestination_QNAME, QualityPairedDistance.class, CompleteRouteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CancelTime", scope = CancelStopsAction.class)
    public JAXBElement<XMLGregorianCalendar> createCancelStopsActionCancelTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CancelStopsActionCancelTime_QNAME, XMLGregorianCalendar.class, CancelStopsAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStopOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RemoveStopOptions", scope = CancelStopsAction.class)
    public JAXBElement<RemoveStopOptions> createCancelStopsActionRemoveStopOptions(RemoveStopOptions value) {
        return new JAXBElement<RemoveStopOptions>(_RemoveStopOptions_QNAME, RemoveStopOptions.class, CancelStopsAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKeys", scope = CancelStopsAction.class)
    public JAXBElement<ArrayOfStopIdentity> createCancelStopsActionStopKeys(ArrayOfStopIdentity value) {
        return new JAXBElement<ArrayOfStopIdentity>(_CancelStopsActionStopKeys_QNAME, ArrayOfStopIdentity.class, CancelStopsAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrivalTime", scope = ArriveDestinationAction.class)
    public JAXBElement<QualityPairedDateTime> createArriveDestinationActionArrivalTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_ArriveDestinationActionArrivalTime_QNAME, QualityPairedDateTime.class, ArriveDestinationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStopOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RemoveStopOptions", scope = ArriveDestinationAction.class)
    public JAXBElement<RemoveStopOptions> createArriveDestinationActionRemoveStopOptions(RemoveStopOptions value) {
        return new JAXBElement<RemoveStopOptions>(_RemoveStopOptions_QNAME, RemoveStopOptions.class, ArriveDestinationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNonServiceableStopArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NonServiceableStopArgs", scope = UpdateNonServiceableStopAction.class)
    public JAXBElement<SaveNonServiceableStopArgs> createUpdateNonServiceableStopActionNonServiceableStopArgs(SaveNonServiceableStopArgs value) {
        return new JAXBElement<SaveNonServiceableStopArgs>(_UpdateNonServiceableStopActionNonServiceableStopArgs_QNAME, SaveNonServiceableStopArgs.class, UpdateNonServiceableStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NonServiceableStopPlacementMethodType_PlacementMethodType", scope = UpdateNonServiceableStopAction.class)
    public JAXBElement<String> createUpdateNonServiceableStopActionNonServiceableStopPlacementMethodTypePlacementMethodType(String value) {
        return new JAXBElement<String>(_UpdateNonServiceableStopActionNonServiceableStopPlacementMethodTypePlacementMethodType_QNAME, String.class, UpdateNonServiceableStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NonServiceableStopType_StopType", scope = UpdateNonServiceableStopAction.class)
    public JAXBElement<String> createUpdateNonServiceableStopActionNonServiceableStopTypeStopType(String value) {
        return new JAXBElement<String>(_UpdateNonServiceableStopActionNonServiceableStopTypeStopType_QNAME, String.class, UpdateNonServiceableStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Placement", scope = UpdateNonServiceableStopAction.class)
    public JAXBElement<Placement> createUpdateNonServiceableStopActionPlacement(Placement value) {
        return new JAXBElement<Placement>(_Placement_QNAME, Placement.class, UpdateNonServiceableStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RelatedStopKey", scope = UpdateNonServiceableStopAction.class)
    public JAXBElement<StopIdentity> createUpdateNonServiceableStopActionRelatedStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_UpdateNonServiceableStopActionRelatedStopKey_QNAME, StopIdentity.class, UpdateNonServiceableStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = UpdateNonServiceableStopAction.class)
    public JAXBElement<StopIdentity> createUpdateNonServiceableStopActionStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, UpdateNonServiceableStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopReasonCodeEntityKey", scope = UpdateNonServiceableStopAction.class)
    public JAXBElement<Long> createUpdateNonServiceableStopActionStopReasonCodeEntityKey(Long value) {
        return new JAXBElement<Long>(_UpdateNonServiceableStopActionStopReasonCodeEntityKey_QNAME, Long.class, UpdateNonServiceableStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Coordinate", scope = PositionUpdateAction.class)
    public JAXBElement<Coordinate> createPositionUpdateActionCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_PositionUpdateActionCoordinate_QNAME, Coordinate.class, PositionUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "GPSSpeed", scope = PositionUpdateAction.class)
    public JAXBElement<Speed> createPositionUpdateActionGPSSpeed(Speed value) {
        return new JAXBElement<Speed>(_PositionUpdateActionGPSSpeed_QNAME, Speed.class, PositionUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Heading", scope = PositionUpdateAction.class)
    public JAXBElement<Integer> createPositionUpdateActionHeading(Integer value) {
        return new JAXBElement<Integer>(_PositionUpdateActionHeading_QNAME, Integer.class, PositionUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "HorizontalDilutionOfPrecision", scope = PositionUpdateAction.class)
    public JAXBElement<Double> createPositionUpdateActionHorizontalDilutionOfPrecision(Double value) {
        return new JAXBElement<Double>(_PositionUpdateActionHorizontalDilutionOfPrecision_QNAME, Double.class, PositionUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NumberOfSatellitesUsed", scope = PositionUpdateAction.class)
    public JAXBElement<Integer> createPositionUpdateActionNumberOfSatellitesUsed(Integer value) {
        return new JAXBElement<Integer>(_PositionUpdateActionNumberOfSatellitesUsed_QNAME, Integer.class, PositionUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OBDSpeed", scope = PositionUpdateAction.class)
    public JAXBElement<Speed> createPositionUpdateActionOBDSpeed(Speed value) {
        return new JAXBElement<Speed>(_PositionUpdateActionOBDSpeed_QNAME, Speed.class, PositionUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatteryState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "BatteryState", scope = BatteryDiagnosticsUpdateAction.class)
    public JAXBElement<BatteryState> createBatteryDiagnosticsUpdateActionBatteryState(BatteryState value) {
        return new JAXBElement<BatteryState>(_BatteryDiagnosticsUpdateActionBatteryState_QNAME, BatteryState.class, BatteryDiagnosticsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OriginCoordinate", scope = StartWorkAction.class)
    public JAXBElement<Coordinate> createStartWorkActionOriginCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_StartWorkActionOriginCoordinate_QNAME, Coordinate.class, StartWorkAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OriginDepotEntityKey", scope = StartWorkAction.class)
    public JAXBElement<Long> createStartWorkActionOriginDepotEntityKey(Long value) {
        return new JAXBElement<Long>(_StartWorkActionOriginDepotEntityKey_QNAME, Long.class, StartWorkAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StartTime", scope = StartWorkAction.class)
    public JAXBElement<QualityPairedDateTime> createStartWorkActionStartTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_StartRouteActionStartTime_QNAME, QualityPairedDateTime.class, StartWorkAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StartTime", scope = StartBreakAction.class)
    public JAXBElement<QualityPairedDateTime> createStartBreakActionStartTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_StartRouteActionStartTime_QNAME, QualityPairedDateTime.class, StartBreakAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Stops", scope = ResequencePendingStopsAction.class)
    public JAXBElement<ArrayOfStopIdentity> createResequencePendingStopsActionStops(ArrayOfStopIdentity value) {
        return new JAXBElement<ArrayOfStopIdentity>(_ResequencePendingStopsActionStops_QNAME, ArrayOfStopIdentity.class, ResequencePendingStopsAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DestinationDepotEntityKey", scope = EndWorkAction.class)
    public JAXBElement<Long> createEndWorkActionDestinationDepotEntityKey(Long value) {
        return new JAXBElement<Long>(_EndWorkActionDestinationDepotEntityKey_QNAME, Long.class, EndWorkAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EndTime", scope = EndWorkAction.class)
    public JAXBElement<QualityPairedDateTime> createEndWorkActionEndTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_EndWorkActionEndTime_QNAME, QualityPairedDateTime.class, EndWorkAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EndTime", scope = EndBreakAction.class)
    public JAXBElement<QualityPairedDateTime> createEndBreakActionEndTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_EndWorkActionEndTime_QNAME, QualityPairedDateTime.class, EndBreakAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = AddServiceableStopAction.class)
    public JAXBElement<StopIdentity> createAddServiceableStopActionStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, AddServiceableStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Coordinate", scope = HarshDrivingAction.class)
    public JAXBElement<Coordinate> createHarshDrivingActionCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_PositionUpdateActionCoordinate_QNAME, Coordinate.class, HarshDrivingAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ForwardGForce", scope = HarshDrivingAction.class)
    public JAXBElement<Double> createHarshDrivingActionForwardGForce(Double value) {
        return new JAXBElement<Double>(_HarshDrivingActionForwardGForce_QNAME, Double.class, HarshDrivingAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "GPSSpeed", scope = HarshDrivingAction.class)
    public JAXBElement<Speed> createHarshDrivingActionGPSSpeed(Speed value) {
        return new JAXBElement<Speed>(_PositionUpdateActionGPSSpeed_QNAME, Speed.class, HarshDrivingAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "HarshDrivingType_Type", scope = HarshDrivingAction.class)
    public JAXBElement<String> createHarshDrivingActionHarshDrivingTypeType(String value) {
        return new JAXBElement<String>(_HarshDrivingActionHarshDrivingTypeType_QNAME, String.class, HarshDrivingAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Heading", scope = HarshDrivingAction.class)
    public JAXBElement<Integer> createHarshDrivingActionHeading(Integer value) {
        return new JAXBElement<Integer>(_PositionUpdateActionHeading_QNAME, Integer.class, HarshDrivingAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "HorizontalDilutionOfPrecision", scope = HarshDrivingAction.class)
    public JAXBElement<Double> createHarshDrivingActionHorizontalDilutionOfPrecision(Double value) {
        return new JAXBElement<Double>(_PositionUpdateActionHorizontalDilutionOfPrecision_QNAME, Double.class, HarshDrivingAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LateralGForce", scope = HarshDrivingAction.class)
    public JAXBElement<Double> createHarshDrivingActionLateralGForce(Double value) {
        return new JAXBElement<Double>(_HarshDrivingActionLateralGForce_QNAME, Double.class, HarshDrivingAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NumberOfSatellitesUsed", scope = HarshDrivingAction.class)
    public JAXBElement<Integer> createHarshDrivingActionNumberOfSatellitesUsed(Integer value) {
        return new JAXBElement<Integer>(_PositionUpdateActionNumberOfSatellitesUsed_QNAME, Integer.class, HarshDrivingAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VerticalGForce", scope = HarshDrivingAction.class)
    public JAXBElement<Double> createHarshDrivingActionVerticalGForce(Double value) {
        return new JAXBElement<Double>(_HarshDrivingActionVerticalGForce_QNAME, Double.class, HarshDrivingAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ApplicationIdentifier", scope = TelematicsDeviceDiagnosticsUpdateAction.class)
    public JAXBElement<String> createTelematicsDeviceDiagnosticsUpdateActionApplicationIdentifier(String value) {
        return new JAXBElement<String>(_TelematicsDeviceDiagnosticsUpdateActionApplicationIdentifier_QNAME, String.class, TelematicsDeviceDiagnosticsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeviceFirmwareVersion", scope = TelematicsDeviceDiagnosticsUpdateAction.class)
    public JAXBElement<String> createTelematicsDeviceDiagnosticsUpdateActionDeviceFirmwareVersion(String value) {
        return new JAXBElement<String>(_TelematicsDeviceDiagnosticsUpdateActionDeviceFirmwareVersion_QNAME, String.class, TelematicsDeviceDiagnosticsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DevicePhoneNumber", scope = TelematicsDeviceDiagnosticsUpdateAction.class)
    public JAXBElement<String> createTelematicsDeviceDiagnosticsUpdateActionDevicePhoneNumber(String value) {
        return new JAXBElement<String>(_TelematicsDeviceDiagnosticsUpdateActionDevicePhoneNumber_QNAME, String.class, TelematicsDeviceDiagnosticsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SatelliteModemIdentifier", scope = TelematicsDeviceDiagnosticsUpdateAction.class)
    public JAXBElement<String> createTelematicsDeviceDiagnosticsUpdateActionSatelliteModemIdentifier(String value) {
        return new JAXBElement<String>(_TelematicsDeviceDiagnosticsUpdateActionSatelliteModemIdentifier_QNAME, String.class, TelematicsDeviceDiagnosticsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ScriptVersion", scope = TelematicsDeviceDiagnosticsUpdateAction.class)
    public JAXBElement<String> createTelematicsDeviceDiagnosticsUpdateActionScriptVersion(String value) {
        return new JAXBElement<String>(_UpgradeRoadnetTelematicsDeviceConfigurationInfoScriptVersion_QNAME, String.class, TelematicsDeviceDiagnosticsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleDatabaseVersion", scope = TelematicsDeviceDiagnosticsUpdateAction.class)
    public JAXBElement<String> createTelematicsDeviceDiagnosticsUpdateActionVehicleDatabaseVersion(String value) {
        return new JAXBElement<String>(_UpgradeRoadnetTelematicsDeviceConfigurationInfoVehicleDatabaseVersion_QNAME, String.class, TelematicsDeviceDiagnosticsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleIdentificationNumber", scope = TelematicsDeviceDiagnosticsUpdateAction.class)
    public JAXBElement<String> createTelematicsDeviceDiagnosticsUpdateActionVehicleIdentificationNumber(String value) {
        return new JAXBElement<String>(_TelematicsDeviceDiagnosticsUpdateActionVehicleIdentificationNumber_QNAME, String.class, TelematicsDeviceDiagnosticsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleInterfaceFirmwareVersion", scope = TelematicsDeviceDiagnosticsUpdateAction.class)
    public JAXBElement<String> createTelematicsDeviceDiagnosticsUpdateActionVehicleInterfaceFirmwareVersion(String value) {
        return new JAXBElement<String>(_UpgradeRoadnetTelematicsDeviceConfigurationInfoVehicleInterfaceFirmwareVersion_QNAME, String.class, TelematicsDeviceDiagnosticsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleInterface_RoadnetTelematicsVehicleInterface", scope = TelematicsDeviceDiagnosticsUpdateAction.class)
    public JAXBElement<String> createTelematicsDeviceDiagnosticsUpdateActionVehicleInterfaceRoadnetTelematicsVehicleInterface(String value) {
        return new JAXBElement<String>(_TelematicsDeviceDiagnosticsUpdateActionVehicleInterfaceRoadnetTelematicsVehicleInterface_QNAME, String.class, TelematicsDeviceDiagnosticsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleTopGearValue", scope = TelematicsDeviceDiagnosticsUpdateAction.class)
    public JAXBElement<Integer> createTelematicsDeviceDiagnosticsUpdateActionVehicleTopGearValue(Integer value) {
        return new JAXBElement<Integer>(_TelematicsDeviceDiagnosticsUpdateActionVehicleTopGearValue_QNAME, Integer.class, TelematicsDeviceDiagnosticsUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AcceleratorPosition", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Double> createVehicleStatusUpdateActionAcceleratorPosition(Double value) {
        return new JAXBElement<Double>(_VehicleStatusUpdateActionAcceleratorPosition_QNAME, Double.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AmbientAirTemperature", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Temperature> createVehicleStatusUpdateActionAmbientAirTemperature(Temperature value) {
        return new JAXBElement<Temperature>(_VehicleStatusUpdateActionAmbientAirTemperature_QNAME, Temperature.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "BatteryVoltage", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Double> createVehicleStatusUpdateActionBatteryVoltage(Double value) {
        return new JAXBElement<Double>(_VehicleStatusUpdateActionBatteryVoltage_QNAME, Double.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CoolantLevelPercentage", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Double> createVehicleStatusUpdateActionCoolantLevelPercentage(Double value) {
        return new JAXBElement<Double>(_VehicleStatusUpdateActionCoolantLevelPercentage_QNAME, Double.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CoolantTemperatureValue", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Temperature> createVehicleStatusUpdateActionCoolantTemperatureValue(Temperature value) {
        return new JAXBElement<Temperature>(_VehicleStatusUpdateActionCoolantTemperatureValue_QNAME, Temperature.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CruiseControlStatus", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Boolean> createVehicleStatusUpdateActionCruiseControlStatus(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleStatusUpdateActionCruiseControlStatus_QNAME, Boolean.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeviceCalculatedEngineRunTime", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Duration> createVehicleStatusUpdateActionDeviceCalculatedEngineRunTime(Duration value) {
        return new JAXBElement<Duration>(_VehicleStatusUpdateActionDeviceCalculatedEngineRunTime_QNAME, Duration.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeviceCalculatedOdometer", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Distance> createVehicleStatusUpdateActionDeviceCalculatedOdometer(Distance value) {
        return new JAXBElement<Distance>(_VehicleStatusUpdateActionDeviceCalculatedOdometer_QNAME, Distance.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ECMSpeed", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Speed> createVehicleStatusUpdateActionECMSpeed(Speed value) {
        return new JAXBElement<Speed>(_VehicleStatusUpdateActionECMSpeed_QNAME, Speed.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuelEconomy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EngineAverageFuelEconomy", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<FuelEconomy> createVehicleStatusUpdateActionEngineAverageFuelEconomy(FuelEconomy value) {
        return new JAXBElement<FuelEconomy>(_VehicleStatusUpdateActionEngineAverageFuelEconomy_QNAME, FuelEconomy.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EngineOilLevelPercentage", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Double> createVehicleStatusUpdateActionEngineOilLevelPercentage(Double value) {
        return new JAXBElement<Double>(_VehicleStatusUpdateActionEngineOilLevelPercentage_QNAME, Double.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EngineOilTemperature", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Temperature> createVehicleStatusUpdateActionEngineOilTemperature(Temperature value) {
        return new JAXBElement<Temperature>(_VehicleStatusUpdateActionEngineOilTemperature_QNAME, Temperature.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EngineRPM", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Integer> createVehicleStatusUpdateActionEngineRPM(Integer value) {
        return new JAXBElement<Integer>(_VehicleStatusUpdateActionEngineRPM_QNAME, Integer.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EngineTotalIdleFuelUsed", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<LiquidVolume> createVehicleStatusUpdateActionEngineTotalIdleFuelUsed(LiquidVolume value) {
        return new JAXBElement<LiquidVolume>(_VehicleStatusUpdateActionEngineTotalIdleFuelUsed_QNAME, LiquidVolume.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EngineTotalIdleHours", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Duration> createVehicleStatusUpdateActionEngineTotalIdleHours(Duration value) {
        return new JAXBElement<Duration>(_VehicleStatusUpdateActionEngineTotalIdleHours_QNAME, Duration.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransmissionGearState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "GearState", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<TransmissionGearState> createVehicleStatusUpdateActionGearState(TransmissionGearState value) {
        return new JAXBElement<TransmissionGearState>(_VehicleStatusUpdateActionGearState_QNAME, TransmissionGearState.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "IgnitionState_IgnitionState", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<String> createVehicleStatusUpdateActionIgnitionStateIgnitionState(String value) {
        return new JAXBElement<String>(_VehicleStatusUpdateActionIgnitionStateIgnitionState_QNAME, String.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Input0Value", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Boolean> createVehicleStatusUpdateActionInput0Value(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleStatusUpdateActionInput0Value_QNAME, Boolean.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Input1Value", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Boolean> createVehicleStatusUpdateActionInput1Value(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleStatusUpdateActionInput1Value_QNAME, Boolean.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Input2Value", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Boolean> createVehicleStatusUpdateActionInput2Value(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleStatusUpdateActionInput2Value_QNAME, Boolean.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Input3Value", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Boolean> createVehicleStatusUpdateActionInput3Value(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleStatusUpdateActionInput3Value_QNAME, Boolean.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Input4Value", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Boolean> createVehicleStatusUpdateActionInput4Value(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleStatusUpdateActionInput4Value_QNAME, Boolean.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Input5Value", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Boolean> createVehicleStatusUpdateActionInput5Value(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleStatusUpdateActionInput5Value_QNAME, Boolean.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Input6Value", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Boolean> createVehicleStatusUpdateActionInput6Value(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleStatusUpdateActionInput6Value_QNAME, Boolean.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Input7Value", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Boolean> createVehicleStatusUpdateActionInput7Value(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleStatusUpdateActionInput7Value_QNAME, Boolean.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Odometer", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Distance> createVehicleStatusUpdateActionOdometer(Distance value) {
        return new JAXBElement<Distance>(_VehicleStatusUpdateActionOdometer_QNAME, Distance.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ParkBrakeStatus", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Boolean> createVehicleStatusUpdateActionParkBrakeStatus(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleStatusUpdateActionParkBrakeStatus_QNAME, Boolean.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PowerTakeOffState_PowerTakeOffState", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<String> createVehicleStatusUpdateActionPowerTakeOffStatePowerTakeOffState(String value) {
        return new JAXBElement<String>(_VehicleStatusUpdateActionPowerTakeOffStatePowerTakeOffState_QNAME, String.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ReceivedSignalStrengthIndicator", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Double> createVehicleStatusUpdateActionReceivedSignalStrengthIndicator(Double value) {
        return new JAXBElement<Double>(_VehicleStatusUpdateActionReceivedSignalStrengthIndicator_QNAME, Double.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TemperatureSensorValue", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Temperature> createVehicleStatusUpdateActionTemperatureSensorValue(Temperature value) {
        return new JAXBElement<Temperature>(_VehicleStatusUpdateActionTemperatureSensorValue_QNAME, Temperature.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TotalEngineRunTime", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Duration> createVehicleStatusUpdateActionTotalEngineRunTime(Duration value) {
        return new JAXBElement<Duration>(_VehicleStatusUpdateActionTotalEngineRunTime_QNAME, Duration.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TotalFuelUsed", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<LiquidVolume> createVehicleStatusUpdateActionTotalFuelUsed(LiquidVolume value) {
        return new JAXBElement<LiquidVolume>(_VehicleStatusUpdateActionTotalFuelUsed_QNAME, LiquidVolume.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleBusReportedBatteryVoltage", scope = VehicleStatusUpdateAction.class)
    public JAXBElement<Double> createVehicleStatusUpdateActionVehicleBusReportedBatteryVoltage(Double value) {
        return new JAXBElement<Double>(_VehicleStatusUpdateActionVehicleBusReportedBatteryVoltage_QNAME, Double.class, VehicleStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "IgnitionState_IgnitionState", scope = IgnitionStateChangedAction.class)
    public JAXBElement<String> createIgnitionStateChangedActionIgnitionStateIgnitionState(String value) {
        return new JAXBElement<String>(_VehicleStatusUpdateActionIgnitionStateIgnitionState_QNAME, String.class, IgnitionStateChangedAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = StopBasedActionDto.class)
    public JAXBElement<StopIdentity> createStopBasedActionDtoStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, StopBasedActionDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Consignee", scope = StopSignatureAction.class)
    public JAXBElement<String> createStopSignatureActionConsignee(String value) {
        return new JAXBElement<String>(_StopSignatureActionConsignee_QNAME, String.class, StopSignatureAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Signature", scope = StopSignatureAction.class)
    public JAXBElement<byte[]> createStopSignatureActionSignature(byte[] value) {
        return new JAXBElement<byte[]>(_StopSignatureActionSignature_QNAME, byte[].class, StopSignatureAction.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrivalTime", scope = ArriveStopAction.class)
    public JAXBElement<QualityPairedDateTime> createArriveStopActionArrivalTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_ArriveDestinationActionArrivalTime_QNAME, QualityPairedDateTime.class, ArriveStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceStartTime", scope = ServiceStopAction.class)
    public JAXBElement<QualityPairedDateTime> createServiceStopActionServiceStartTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_ServiceStopActionServiceStartTime_QNAME, QualityPairedDateTime.class, ServiceStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ReserviceAsDeviceStopId", scope = ReserviceStopAction.class)
    public JAXBElement<Long> createReserviceStopActionReserviceAsDeviceStopId(Long value) {
        return new JAXBElement<Long>(_ReserviceStopActionReserviceAsDeviceStopId_QNAME, Long.class, ReserviceStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopIndex", scope = ReserviceStopAction.class)
    public JAXBElement<Integer> createReserviceStopActionStopIndex(Integer value) {
        return new JAXBElement<Integer>(_ReserviceStopActionStopIndex_QNAME, Integer.class, ReserviceStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Coordinate", scope = GeocodeStopAction.class)
    public JAXBElement<Coordinate> createGeocodeStopActionCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_PositionUpdateActionCoordinate_QNAME, Coordinate.class, GeocodeStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Consignee", scope = DepartStopAction.class)
    public JAXBElement<String> createDepartStopActionConsignee(String value) {
        return new JAXBElement<String>(_StopSignatureActionConsignee_QNAME, String.class, DepartStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DepartureTime", scope = DepartStopAction.class)
    public JAXBElement<QualityPairedDateTime> createDepartStopActionDepartureTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_DepartOriginActionDepartureTime_QNAME, QualityPairedDateTime.class, DepartStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDistance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DistanceTo", scope = DepartStopAction.class)
    public JAXBElement<QualityPairedDistance> createDepartStopActionDistanceTo(QualityPairedDistance value) {
        return new JAXBElement<QualityPairedDistance>(_StopActualsDistanceTo_QNAME, QualityPairedDistance.class, DepartStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "GroupStopDeviceId", scope = DepartStopAction.class)
    public JAXBElement<Long> createDepartStopActionGroupStopDeviceId(Long value) {
        return new JAXBElement<Long>(_DepartStopActionGroupStopDeviceId_QNAME, Long.class, DepartStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ReserviceAsDeviceStopId", scope = DepartStopAction.class)
    public JAXBElement<Long> createDepartStopActionReserviceAsDeviceStopId(Long value) {
        return new JAXBElement<Long>(_ReserviceStopActionReserviceAsDeviceStopId_QNAME, Long.class, DepartStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ReservicePlacement", scope = DepartStopAction.class)
    public JAXBElement<Placement> createDepartStopActionReservicePlacement(Placement value) {
        return new JAXBElement<Placement>(_DepartStopActionReservicePlacement_QNAME, Placement.class, DepartStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UnserviceableReasonCodeEntityKey", scope = DepartStopAction.class)
    public JAXBElement<Long> createDepartStopActionUnserviceableReasonCodeEntityKey(Long value) {
        return new JAXBElement<Long>(_DepartStopActionUnserviceableReasonCodeEntityKey_QNAME, Long.class, DepartStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnStopPlacementInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopPlacementInfo", scope = OnRouteByIndicesPlacementTaskTypeToIndex.class)
    public JAXBElement<OnStopPlacementInfo> createOnRouteByIndicesPlacementTaskTypeToIndexStopPlacementInfo(OnStopPlacementInfo value) {
        return new JAXBElement<OnStopPlacementInfo>(_OnRouteByIndicesPlacementTaskTypeToIndexStopPlacementInfo_QNAME, OnStopPlacementInfo.class, OnRouteByIndicesPlacementTaskTypeToIndex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TaskType_TaskType", scope = OnRouteByIndicesPlacementTaskTypeToIndex.class)
    public JAXBElement<String> createOnRouteByIndicesPlacementTaskTypeToIndexTaskTypeTaskType(String value) {
        return new JAXBElement<String>(_OnRouteByIndicesPlacementTaskTypeToIndexTaskTypeTaskType_QNAME, String.class, OnRouteByIndicesPlacementTaskTypeToIndex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TaskIndices", scope = OnRouteByIndicesPlacement.class)
    public JAXBElement<ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex> createOnRouteByIndicesPlacementTaskIndices(ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex value) {
        return new JAXBElement<ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex>(_OnRouteByIndicesPlacementTaskIndices_QNAME, ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex.class, OnRouteByIndicesPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnStopPlacement_Position_Place", scope = OnDeviceStopPlacement.class)
    public JAXBElement<String> createOnDeviceStopPlacementOnStopPlacementPositionPlace(String value) {
        return new JAXBElement<String>(_OnDeviceStopPlacementOnStopPlacementPositionPlace_QNAME, String.class, OnDeviceStopPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnRoutePlacement_Position_Place", scope = OnRoutePlacement.class)
    public JAXBElement<String> createOnRoutePlacementOnRoutePlacementPositionPlace(String value) {
        return new JAXBElement<String>(_OnRoutePlacementOnRoutePlacementPositionPlace_QNAME, String.class, OnRoutePlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Position_Place", scope = OnStopPlacement.class)
    public JAXBElement<String> createOnStopPlacementPositionPlace(String value) {
        return new JAXBElement<String>(_OnRouteTemplatePlacementPositionPlace_QNAME, String.class, OnStopPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnStopPlacementInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopPlacementInfo", scope = OnStopPlacement.class)
    public JAXBElement<OnStopPlacementInfo> createOnStopPlacementStopPlacementInfo(OnStopPlacementInfo value) {
        return new JAXBElement<OnStopPlacementInfo>(_OnRouteByIndicesPlacementTaskTypeToIndexStopPlacementInfo_QNAME, OnStopPlacementInfo.class, OnStopPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Placement", scope = StopManipulationAction.class)
    public JAXBElement<Placement> createStopManipulationActionPlacement(Placement value) {
        return new JAXBElement<Placement>(_Placement_QNAME, Placement.class, StopManipulationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DamagedQuantities", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<Quantities> createDeliveryDetailsUpdateActionDetailItemQuantitiesDamagedQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionDetailItemQuantitiesDamagedQuantities_QNAME, Quantities.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DamagedReasonCode", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<String> createDeliveryDetailsUpdateActionDetailItemQuantitiesDamagedReasonCode(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionDetailItemQuantitiesDamagedReasonCode_QNAME, String.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "FreeformDamagedReasonCode", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<String> createDeliveryDetailsUpdateActionDetailItemQuantitiesFreeformDamagedReasonCode(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionDetailItemQuantitiesFreeformDamagedReasonCode_QNAME, String.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "FreeformOverReasonCode", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<String> createDeliveryDetailsUpdateActionDetailItemQuantitiesFreeformOverReasonCode(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionDetailItemQuantitiesFreeformOverReasonCode_QNAME, String.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "FreeformQuantityReasonCode", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<String> createDeliveryDetailsUpdateActionDetailItemQuantitiesFreeformQuantityReasonCode(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionDetailItemQuantitiesFreeformQuantityReasonCode_QNAME, String.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "FreeformShortReasonCode", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<String> createDeliveryDetailsUpdateActionDetailItemQuantitiesFreeformShortReasonCode(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionDetailItemQuantitiesFreeformShortReasonCode_QNAME, String.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "InputTimestamp", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<XMLGregorianCalendar> createDeliveryDetailsUpdateActionDetailItemQuantitiesInputTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DeliveryDetailsUpdateActionDetailItemQuantitiesInputTimestamp_QNAME, XMLGregorianCalendar.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OverQuantities", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<Quantities> createDeliveryDetailsUpdateActionDetailItemQuantitiesOverQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionDetailItemQuantitiesOverQuantities_QNAME, Quantities.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OverReasonCode", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<String> createDeliveryDetailsUpdateActionDetailItemQuantitiesOverReasonCode(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionDetailItemQuantitiesOverReasonCode_QNAME, String.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Quantities", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<Quantities> createDeliveryDetailsUpdateActionDetailItemQuantitiesQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionLineItemDetailItemQuantities_QNAME, Quantities.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "QuantityInputQuality_InputQuality", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<String> createDeliveryDetailsUpdateActionDetailItemQuantitiesQuantityInputQualityInputQuality(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionDetailItemQuantitiesQuantityInputQualityInputQuality_QNAME, String.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "QuantityReasonCode", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<String> createDeliveryDetailsUpdateActionDetailItemQuantitiesQuantityReasonCode(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionDetailItemQuantitiesQuantityReasonCode_QNAME, String.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ShortQuantities", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<Quantities> createDeliveryDetailsUpdateActionDetailItemQuantitiesShortQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionDetailItemQuantitiesShortQuantities_QNAME, Quantities.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ShortReasonCode", scope = DeliveryDetailsUpdateActionDetailItemQuantities.class)
    public JAXBElement<String> createDeliveryDetailsUpdateActionDetailItemQuantitiesShortReasonCode(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionDetailItemQuantitiesShortReasonCode_QNAME, String.class, DeliveryDetailsUpdateActionDetailItemQuantities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDetailsUpdateActionDetailItemQuantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryQuantities", scope = DeliveryDetailsUpdateActionOrderDetailItem.class)
    public JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities> createDeliveryDetailsUpdateActionOrderDetailItemDeliveryQuantities(DeliveryDetailsUpdateActionDetailItemQuantities value) {
        return new JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities>(_DeliveryDetailsUpdateActionOrderDetailItemDeliveryQuantities_QNAME, DeliveryDetailsUpdateActionDetailItemQuantities.class, DeliveryDetailsUpdateActionOrderDetailItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDetailsUpdateActionDetailItemQuantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PickupQuantities", scope = DeliveryDetailsUpdateActionOrderDetailItem.class)
    public JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities> createDeliveryDetailsUpdateActionOrderDetailItemPickupQuantities(DeliveryDetailsUpdateActionDetailItemQuantities value) {
        return new JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities>(_DeliveryDetailsUpdateActionOrderDetailItemPickupQuantities_QNAME, DeliveryDetailsUpdateActionDetailItemQuantities.class, DeliveryDetailsUpdateActionOrderDetailItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetailItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DetailItems", scope = DetailItemVerificationAction.class)
    public JAXBElement<ArrayOfDetailItem> createDetailItemVerificationActionDetailItems(ArrayOfDetailItem value) {
        return new JAXBElement<ArrayOfDetailItem>(_DeliveryDetailsUpdateActionDetailItems_QNAME, ArrayOfDetailItem.class, DetailItemVerificationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VerificationLocationType_VerificationLocationType", scope = DetailItemVerificationAction.class)
    public JAXBElement<String> createDetailItemVerificationActionVerificationLocationTypeVerificationLocationType(String value) {
        return new JAXBElement<String>(_DetailItemVerificationActionVerificationLocationTypeVerificationLocationType_QNAME, String.class, DetailItemVerificationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VerificationType_VerificationType", scope = DetailItemVerificationAction.class)
    public JAXBElement<String> createDetailItemVerificationActionVerificationTypeVerificationType(String value) {
        return new JAXBElement<String>(_DetailItemVerificationActionVerificationTypeVerificationType_QNAME, String.class, DetailItemVerificationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderCustomProperties", scope = OrderUpdateAction.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createOrderUpdateActionOrderCustomProperties(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_OrderUpdateActionOrderCustomProperties_QNAME, ArrayOfKeyValueOfstringanyType.class, OrderUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderIdentifier", scope = OrderUpdateAction.class)
    public JAXBElement<String> createOrderUpdateActionOrderIdentifier(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionLineItemDetailItemOrderIdentifier_QNAME, String.class, OrderUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = OrderUpdateAction.class)
    public JAXBElement<StopIdentity> createOrderUpdateActionStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, OrderUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TaskType_OrderType", scope = OrderUpdateAction.class)
    public JAXBElement<String> createOrderUpdateActionTaskTypeOrderType(String value) {
        return new JAXBElement<String>(_OrderUpdateActionTaskTypeOrderType_QNAME, String.class, OrderUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LineItemCustomProperties", scope = LineItemUpdateAction.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createLineItemUpdateActionLineItemCustomProperties(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_LineItemUpdateActionLineItemCustomProperties_QNAME, ArrayOfKeyValueOfstringanyType.class, LineItemUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LineItemIdentifier", scope = LineItemUpdateAction.class)
    public JAXBElement<String> createLineItemUpdateActionLineItemIdentifier(String value) {
        return new JAXBElement<String>(_LineItemUpdateActionLineItemIdentifier_QNAME, String.class, LineItemUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderIdentifier", scope = LineItemUpdateAction.class)
    public JAXBElement<String> createLineItemUpdateActionOrderIdentifier(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionLineItemDetailItemOrderIdentifier_QNAME, String.class, LineItemUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = LineItemUpdateAction.class)
    public JAXBElement<StopIdentity> createLineItemUpdateActionStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, LineItemUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomFormResponseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Responses", scope = CustomFormResponseAction.class)
    public JAXBElement<ArrayOfCustomFormResponseInfo> createCustomFormResponseActionResponses(ArrayOfCustomFormResponseInfo value) {
        return new JAXBElement<ArrayOfCustomFormResponseInfo>(_CustomFormResponseActionResponses_QNAME, ArrayOfCustomFormResponseInfo.class, CustomFormResponseAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = CustomFormResponseAction.class)
    public JAXBElement<StopIdentity> createCustomFormResponseActionStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, CustomFormResponseAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Coordinate", scope = PanicButtonTriggeredAction.class)
    public JAXBElement<Coordinate> createPanicButtonTriggeredActionCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_PositionUpdateActionCoordinate_QNAME, Coordinate.class, PanicButtonTriggeredAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ClientMessageID", scope = NavClientAction.class)
    public JAXBElement<String> createNavClientActionClientMessageID(String value) {
        return new JAXBElement<String>(_NavClientActionClientMessageID_QNAME, String.class, NavClientAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Coordinate", scope = NavClientAction.class)
    public JAXBElement<Coordinate> createNavClientActionCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_PositionUpdateActionCoordinate_QNAME, Coordinate.class, NavClientAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MapVersion", scope = NavClientAction.class)
    public JAXBElement<String> createNavClientActionMapVersion(String value) {
        return new JAXBElement<String>(_NavClientActionMapVersion_QNAME, String.class, NavClientAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientVersion", scope = NavClientAction.class)
    public JAXBElement<String> createNavClientActionNavClientVersion(String value) {
        return new JAXBElement<String>(_NavClientActionNavClientVersion_QNAME, String.class, NavClientAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "WorkerId", scope = NavClientWorkerChangedAction.class)
    public JAXBElement<String> createNavClientWorkerChangedActionWorkerId(String value) {
        return new JAXBElement<String>(_NavClientWorkerChangedActionWorkerId_QNAME, String.class, NavClientWorkerChangedAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ActualSpeed", scope = NavClientSpeedAlertAction.class)
    public JAXBElement<Speed> createNavClientSpeedAlertActionActualSpeed(Speed value) {
        return new JAXBElement<Speed>(_NavClientSpeedAlertActionActualSpeed_QNAME, Speed.class, NavClientSpeedAlertAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Distance", scope = NavClientSpeedAlertAction.class)
    public JAXBElement<Distance> createNavClientSpeedAlertActionDistance(Distance value) {
        return new JAXBElement<Distance>(_NavClientSpeedAlertActionDistance_QNAME, Distance.class, NavClientSpeedAlertAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LastCoordinate", scope = NavClientSpeedAlertAction.class)
    public JAXBElement<Coordinate> createNavClientSpeedAlertActionLastCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_NavClientSpeedAlertActionLastCoordinate_QNAME, Coordinate.class, NavClientSpeedAlertAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OverLimitThreshold", scope = NavClientSpeedAlertAction.class)
    public JAXBElement<Speed> createNavClientSpeedAlertActionOverLimitThreshold(Speed value) {
        return new JAXBElement<Speed>(_NavClientSpeedAlertActionOverLimitThreshold_QNAME, Speed.class, NavClientSpeedAlertAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PostedSpeed", scope = NavClientSpeedAlertAction.class)
    public JAXBElement<Speed> createNavClientSpeedAlertActionPostedSpeed(Speed value) {
        return new JAXBElement<Speed>(_NavClientSpeedAlertActionPostedSpeed_QNAME, Speed.class, NavClientSpeedAlertAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CalculationDuration", scope = NavClientRecalculationAction.class)
    public JAXBElement<String> createNavClientRecalculationActionCalculationDuration(String value) {
        return new JAXBElement<String>(_NavClientRecalculationActionCalculationDuration_QNAME, String.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DestinationAddress", scope = NavClientRecalculationAction.class)
    public JAXBElement<Address> createNavClientRecalculationActionDestinationAddress(Address value) {
        return new JAXBElement<Address>(_NavClientRecalculationActionDestinationAddress_QNAME, Address.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DestinationCoordinate", scope = NavClientRecalculationAction.class)
    public JAXBElement<Coordinate> createNavClientRecalculationActionDestinationCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_NavClientRecalculationActionDestinationCoordinate_QNAME, Coordinate.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DetourDistance", scope = NavClientRecalculationAction.class)
    public JAXBElement<Distance> createNavClientRecalculationActionDetourDistance(Distance value) {
        return new JAXBElement<Distance>(_NavClientRecalculationActionDetourDistance_QNAME, Distance.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Weight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "GrossVehicleWeight", scope = NavClientRecalculationAction.class)
    public JAXBElement<Weight> createNavClientRecalculationActionGrossVehicleWeight(Weight value) {
        return new JAXBElement<Weight>(_NavClientRecalculationActionGrossVehicleWeight_QNAME, Weight.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LeftTurnsExtraTime", scope = NavClientRecalculationAction.class)
    public JAXBElement<String> createNavClientRecalculationActionLeftTurnsExtraTime(String value) {
        return new JAXBElement<String>(_NavClientRecalculationActionLeftTurnsExtraTime_QNAME, String.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LeftTurnsPenalty", scope = NavClientRecalculationAction.class)
    public JAXBElement<String> createNavClientRecalculationActionLeftTurnsPenalty(String value) {
        return new JAXBElement<String>(_NavClientRecalculationActionLeftTurnsPenalty_QNAME, String.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NavClientRecalculationReason_Reason", scope = NavClientRecalculationAction.class)
    public JAXBElement<String> createNavClientRecalculationActionNavClientRecalculationReasonReason(String value) {
        return new JAXBElement<String>(_NavClientRecalculationActionNavClientRecalculationReasonReason_QNAME, String.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NetworkHazmatTypeFlags_HazmatTypeFlags", scope = NavClientRecalculationAction.class)
    public JAXBElement<String> createNavClientRecalculationActionNetworkHazmatTypeFlagsHazmatTypeFlags(String value) {
        return new JAXBElement<String>(_NavClientRecalculationActionNetworkHazmatTypeFlagsHazmatTypeFlags_QNAME, String.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OriginCoordinate", scope = NavClientRecalculationAction.class)
    public JAXBElement<Coordinate> createNavClientRecalculationActionOriginCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_StartWorkActionOriginCoordinate_QNAME, Coordinate.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RemainingDistance", scope = NavClientRecalculationAction.class)
    public JAXBElement<Distance> createNavClientRecalculationActionRemainingDistance(Distance value) {
        return new JAXBElement<Distance>(_NavClientRecalculationActionRemainingDistance_QNAME, Distance.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RemainingDuration", scope = NavClientRecalculationAction.class)
    public JAXBElement<String> createNavClientRecalculationActionRemainingDuration(String value) {
        return new JAXBElement<String>(_NavClientRecalculationActionRemainingDuration_QNAME, String.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RightTurnsExtraTime", scope = NavClientRecalculationAction.class)
    public JAXBElement<String> createNavClientRecalculationActionRightTurnsExtraTime(String value) {
        return new JAXBElement<String>(_NavClientRecalculationActionRightTurnsExtraTime_QNAME, String.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RightTurnsPenalty", scope = NavClientRecalculationAction.class)
    public JAXBElement<String> createNavClientRecalculationActionRightTurnsPenalty(String value) {
        return new JAXBElement<String>(_NavClientRecalculationActionRightTurnsPenalty_QNAME, String.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Angle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleHeading", scope = NavClientRecalculationAction.class)
    public JAXBElement<Angle> createNavClientRecalculationActionVehicleHeading(Angle value) {
        return new JAXBElement<Angle>(_NavClientRecalculationActionVehicleHeading_QNAME, Angle.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Length }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleHeight", scope = NavClientRecalculationAction.class)
    public JAXBElement<Length> createNavClientRecalculationActionVehicleHeight(Length value) {
        return new JAXBElement<Length>(_NavClientRecalculationActionVehicleHeight_QNAME, Length.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Length }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleLength", scope = NavClientRecalculationAction.class)
    public JAXBElement<Length> createNavClientRecalculationActionVehicleLength(Length value) {
        return new JAXBElement<Length>(_NavClientRecalculationActionVehicleLength_QNAME, Length.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Length }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleWidth", scope = NavClientRecalculationAction.class)
    public JAXBElement<Length> createNavClientRecalculationActionVehicleWidth(Length value) {
        return new JAXBElement<Length>(_NavClientRecalculationActionVehicleWidth_QNAME, Length.class, NavClientRecalculationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DestinationIdentifier", scope = NavClientDestinationArrivalAction.class)
    public JAXBElement<String> createNavClientDestinationArrivalActionDestinationIdentifier(String value) {
        return new JAXBElement<String>(_NavClientDestinationArrivalActionDestinationIdentifier_QNAME, String.class, NavClientDestinationArrivalAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeviationDistanceThreshold", scope = NavClientRoutePathDeviationAction.class)
    public JAXBElement<Distance> createNavClientRoutePathDeviationActionDeviationDistanceThreshold(Distance value) {
        return new JAXBElement<Distance>(_NavClientRoutePathDeviationActionDeviationDistanceThreshold_QNAME, Distance.class, NavClientRoutePathDeviationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EndDeviationPoint", scope = NavClientRoutePathDeviationAction.class)
    public JAXBElement<Coordinate> createNavClientRoutePathDeviationActionEndDeviationPoint(Coordinate value) {
        return new JAXBElement<Coordinate>(_NavClientRoutePathDeviationActionEndDeviationPoint_QNAME, Coordinate.class, NavClientRoutePathDeviationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MaxDeviationDistance", scope = NavClientRoutePathDeviationAction.class)
    public JAXBElement<Distance> createNavClientRoutePathDeviationActionMaxDeviationDistance(Distance value) {
        return new JAXBElement<Distance>(_NavClientRoutePathDeviationActionMaxDeviationDistance_QNAME, Distance.class, NavClientRoutePathDeviationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationCommentParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Comments", scope = LocationCommentsSaveAction.class)
    public JAXBElement<ArrayOfLocationCommentParam> createLocationCommentsSaveActionComments(ArrayOfLocationCommentParam value) {
        return new JAXBElement<ArrayOfLocationCommentParam>(_LocationCommentsSaveActionComments_QNAME, ArrayOfLocationCommentParam.class, LocationCommentsSaveAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CommentKeys", scope = LocationCommentsDeleteAction.class)
    public JAXBElement<ArrayOflong> createLocationCommentsDeleteActionCommentKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_LocationCommentsDeleteActionCommentKeys_QNAME, ArrayOflong.class, LocationCommentsDeleteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LineItemCustomProperties", scope = LineItemAddOrUpdateAction.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createLineItemAddOrUpdateActionLineItemCustomProperties(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_LineItemUpdateActionLineItemCustomProperties_QNAME, ArrayOfKeyValueOfstringanyType.class, LineItemAddOrUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LineItemIdentifier", scope = LineItemAddOrUpdateAction.class)
    public JAXBElement<String> createLineItemAddOrUpdateActionLineItemIdentifier(String value) {
        return new JAXBElement<String>(_LineItemUpdateActionLineItemIdentifier_QNAME, String.class, LineItemAddOrUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderIdentifier", scope = LineItemAddOrUpdateAction.class)
    public JAXBElement<String> createLineItemAddOrUpdateActionOrderIdentifier(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionLineItemDetailItemOrderIdentifier_QNAME, String.class, LineItemAddOrUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = LineItemAddOrUpdateAction.class)
    public JAXBElement<StopIdentity> createLineItemAddOrUpdateActionStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, LineItemAddOrUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TaskType_TaskType", scope = LineItemAddOrUpdateAction.class)
    public JAXBElement<String> createLineItemAddOrUpdateActionTaskTypeTaskType(String value) {
        return new JAXBElement<String>(_OnRouteByIndicesPlacementTaskTypeToIndexTaskTypeTaskType_QNAME, String.class, LineItemAddOrUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EventCoordinate", scope = AssociateStationaryEventAction.class)
    public JAXBElement<Coordinate> createAssociateStationaryEventActionEventCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_AssociateStationaryEventActionEventCoordinate_QNAME, Coordinate.class, AssociateStationaryEventAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopIdentities", scope = AssociateStationaryEventAction.class)
    public JAXBElement<ArrayOfStopIdentity> createAssociateStationaryEventActionStopIdentities(ArrayOfStopIdentity value) {
        return new JAXBElement<ArrayOfStopIdentity>(_AssociateStationaryEventActionStopIdentities_QNAME, ArrayOfStopIdentity.class, AssociateStationaryEventAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNonServiceableStopArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NonServiceableStopArgs", scope = AddNonServiceableStopAction.class)
    public JAXBElement<SaveNonServiceableStopArgs> createAddNonServiceableStopActionNonServiceableStopArgs(SaveNonServiceableStopArgs value) {
        return new JAXBElement<SaveNonServiceableStopArgs>(_UpdateNonServiceableStopActionNonServiceableStopArgs_QNAME, SaveNonServiceableStopArgs.class, AddNonServiceableStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Placement", scope = AddNonServiceableStopAction.class)
    public JAXBElement<Placement> createAddNonServiceableStopActionPlacement(Placement value) {
        return new JAXBElement<Placement>(_Placement_QNAME, Placement.class, AddNonServiceableStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = AddNonServiceableStopAction.class)
    public JAXBElement<StopIdentity> createAddNonServiceableStopActionStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, AddNonServiceableStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DiagnosticTroubleCodes", scope = ActiveTroubleCodesUpdateAction.class)
    public JAXBElement<ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode> createActiveTroubleCodesUpdateActionDiagnosticTroubleCodes(ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode value) {
        return new JAXBElement<ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode>(_ActiveTroubleCodesUpdateActionDiagnosticTroubleCodes_QNAME, ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode.class, ActiveTroubleCodesUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVehicleBusComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VehicleBusComponents", scope = VehicleBusInfoUpdateAction.class)
    public JAXBElement<ArrayOfVehicleBusComponent> createVehicleBusInfoUpdateActionVehicleBusComponents(ArrayOfVehicleBusComponent value) {
        return new JAXBElement<ArrayOfVehicleBusComponent>(_VehicleBusInfoUpdateActionVehicleBusComponents_QNAME, ArrayOfVehicleBusComponent.class, VehicleBusInfoUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceConfirmationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceConfirmationInfos", scope = ServiceConfirmationAction.class)
    public JAXBElement<ArrayOfServiceConfirmationInfo> createServiceConfirmationActionServiceConfirmationInfos(ArrayOfServiceConfirmationInfo value) {
        return new JAXBElement<ArrayOfServiceConfirmationInfo>(_ServiceConfirmationActionServiceConfirmationInfos_QNAME, ArrayOfServiceConfirmationInfo.class, ServiceConfirmationAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "IsVehicleBusDetected", scope = TelematicsDeviceCommsStatusUpdateAction.class)
    public JAXBElement<Boolean> createTelematicsDeviceCommsStatusUpdateActionIsVehicleBusDetected(Boolean value) {
        return new JAXBElement<Boolean>(_TelematicsDeviceCommsStatusUpdateActionIsVehicleBusDetected_QNAME, Boolean.class, TelematicsDeviceCommsStatusUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Equipment", scope = EquipmentDropHookAction.class)
    public JAXBElement<EquipmentDescriptor> createEquipmentDropHookActionEquipment(EquipmentDescriptor value) {
        return new JAXBElement<EquipmentDescriptor>(_EquipmentDropHookActionEquipment_QNAME, EquipmentDescriptor.class, EquipmentDropHookAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = EquipmentDropHookAction.class)
    public JAXBElement<StopIdentity> createEquipmentDropHookActionStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, EquipmentDropHookAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Coordinate", scope = StationaryStartAction.class)
    public JAXBElement<Coordinate> createStationaryStartActionCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_PositionUpdateActionCoordinate_QNAME, Coordinate.class, StationaryStartAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Coordinate", scope = StationaryEndAction.class)
    public JAXBElement<Coordinate> createStationaryEndActionCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_PositionUpdateActionCoordinate_QNAME, Coordinate.class, StationaryEndAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CompressedDataSet", scope = SendCompressedDataSetAction.class)
    public JAXBElement<byte[]> createSendCompressedDataSetActionCompressedDataSet(byte[] value) {
        return new JAXBElement<byte[]>(_SendCompressedDataSetActionCompressedDataSet_QNAME, byte[].class, SendCompressedDataSetAction.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RejectionReasonCodeEntityKey", scope = RouteOptimizationResponseAction.class)
    public JAXBElement<Long> createRouteOptimizationResponseActionRejectionReasonCodeEntityKey(Long value) {
        return new JAXBElement<Long>(_RouteOptimizationResponseActionRejectionReasonCodeEntityKey_QNAME, Long.class, RouteOptimizationResponseAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteSuggestionStatus_SuggestionStatus", scope = RouteOptimizationResponseAction.class)
    public JAXBElement<String> createRouteOptimizationResponseActionRouteSuggestionStatusSuggestionStatus(String value) {
        return new JAXBElement<String>(_RouteOptimizationResponseActionRouteSuggestionStatusSuggestionStatus_QNAME, String.class, RouteOptimizationResponseAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupStopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "GroupStopKey", scope = GroupStopBasedAction.class)
    public JAXBElement<GroupStopIdentity> createGroupStopBasedActionGroupStopKey(GroupStopIdentity value) {
        return new JAXBElement<GroupStopIdentity>(_GroupStopBasedActionGroupStopKey_QNAME, GroupStopIdentity.class, GroupStopBasedAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DepartureTime", scope = DepartGroupStopAction.class)
    public JAXBElement<QualityPairedDateTime> createDepartGroupStopActionDepartureTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_DepartOriginActionDepartureTime_QNAME, QualityPairedDateTime.class, DepartGroupStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ArrivalTime", scope = ArriveGroupStopAction.class)
    public JAXBElement<QualityPairedDateTime> createArriveGroupStopActionArrivalTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_ArriveDestinationActionArrivalTime_QNAME, QualityPairedDateTime.class, ArriveGroupStopAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Version", scope = ReportClientApplicationInfoAction.class)
    public JAXBElement<String> createReportClientApplicationInfoActionVersion(String value) {
        return new JAXBElement<String>(_ReportClientApplicationInfoActionVersion_QNAME, String.class, ReportClientApplicationInfoAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "IsCoDriver", scope = LogOnAction.class)
    public JAXBElement<Boolean> createLogOnActionIsCoDriver(Boolean value) {
        return new JAXBElement<Boolean>(_LogOnActionIsCoDriver_QNAME, Boolean.class, LogOnAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "WorkerEntityKey", scope = LogOnAction.class)
    public JAXBElement<Long> createLogOnActionWorkerEntityKey(Long value) {
        return new JAXBElement<Long>(_LogOnActionWorkerEntityKey_QNAME, Long.class, LogOnAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "WorkerEntityKey", scope = LogOffAction.class)
    public JAXBElement<Long> createLogOffActionWorkerEntityKey(Long value) {
        return new JAXBElement<Long>(_LogOnActionWorkerEntityKey_QNAME, Long.class, LogOffAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TroubleCode", scope = ActiveTroubleCodesUpdateActionOBD2TroubleCode.class)
    public JAXBElement<String> createActiveTroubleCodesUpdateActionOBD2TroubleCodeTroubleCode(String value) {
        return new JAXBElement<String>(_ActiveTroubleCodesUpdateActionOBD2TroubleCodeTroubleCode_QNAME, String.class, ActiveTroubleCodesUpdateActionOBD2TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "TroubleCodeState_TroubleCodeState", scope = ActiveTroubleCodesUpdateActionOBD2TroubleCode.class)
    public JAXBElement<String> createActiveTroubleCodesUpdateActionOBD2TroubleCodeTroubleCodeStateTroubleCodeState(String value) {
        return new JAXBElement<String>(_ActiveTroubleCodesUpdateActionOBD2TroubleCodeTroubleCodeStateTroubleCodeState_QNAME, String.class, ActiveTroubleCodesUpdateActionOBD2TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "FlashStatus_AmberWarningFlashStatus", scope = ActiveTroubleCodesUpdateActionJ1939TroubleCode.class)
    public JAXBElement<String> createActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusAmberWarningFlashStatus(String value) {
        return new JAXBElement<String>(_ActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusAmberWarningFlashStatus_QNAME, String.class, ActiveTroubleCodesUpdateActionJ1939TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "FlashStatus_MalfunctionIndicatorFlashStatus", scope = ActiveTroubleCodesUpdateActionJ1939TroubleCode.class)
    public JAXBElement<String> createActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusMalfunctionIndicatorFlashStatus(String value) {
        return new JAXBElement<String>(_ActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusMalfunctionIndicatorFlashStatus_QNAME, String.class, ActiveTroubleCodesUpdateActionJ1939TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "FlashStatus_ProtectFlashStatus", scope = ActiveTroubleCodesUpdateActionJ1939TroubleCode.class)
    public JAXBElement<String> createActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusProtectFlashStatus(String value) {
        return new JAXBElement<String>(_ActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusProtectFlashStatus_QNAME, String.class, ActiveTroubleCodesUpdateActionJ1939TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "FlashStatus_RedStopFlashStatus", scope = ActiveTroubleCodesUpdateActionJ1939TroubleCode.class)
    public JAXBElement<String> createActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusRedStopFlashStatus(String value) {
        return new JAXBElement<String>(_ActiveTroubleCodesUpdateActionJ1939TroubleCodeFlashStatusRedStopFlashStatus_QNAME, String.class, ActiveTroubleCodesUpdateActionJ1939TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LampStatus_AmberWarningLampStatus", scope = ActiveTroubleCodesUpdateActionJ1939TroubleCode.class)
    public JAXBElement<String> createActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusAmberWarningLampStatus(String value) {
        return new JAXBElement<String>(_ActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusAmberWarningLampStatus_QNAME, String.class, ActiveTroubleCodesUpdateActionJ1939TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LampStatus_MalfunctionIndicatorLampStatus", scope = ActiveTroubleCodesUpdateActionJ1939TroubleCode.class)
    public JAXBElement<String> createActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusMalfunctionIndicatorLampStatus(String value) {
        return new JAXBElement<String>(_ActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusMalfunctionIndicatorLampStatus_QNAME, String.class, ActiveTroubleCodesUpdateActionJ1939TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LampStatus_ProtectLampStatus", scope = ActiveTroubleCodesUpdateActionJ1939TroubleCode.class)
    public JAXBElement<String> createActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusProtectLampStatus(String value) {
        return new JAXBElement<String>(_ActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusProtectLampStatus_QNAME, String.class, ActiveTroubleCodesUpdateActionJ1939TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LampStatus_RedStopLampStatus", scope = ActiveTroubleCodesUpdateActionJ1939TroubleCode.class)
    public JAXBElement<String> createActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusRedStopLampStatus(String value) {
        return new JAXBElement<String>(_ActiveTroubleCodesUpdateActionJ1939TroubleCodeLampStatusRedStopLampStatus_QNAME, String.class, ActiveTroubleCodesUpdateActionJ1939TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ParameterIdentifier", scope = ActiveTroubleCodesUpdateActionJ1587TroubleCode.class)
    public JAXBElement<Integer> createActiveTroubleCodesUpdateActionJ1587TroubleCodeParameterIdentifier(Integer value) {
        return new JAXBElement<Integer>(_ActiveTroubleCodesUpdateActionJ1587TroubleCodeParameterIdentifier_QNAME, Integer.class, ActiveTroubleCodesUpdateActionJ1587TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SubsystemIdentifier", scope = ActiveTroubleCodesUpdateActionJ1587TroubleCode.class)
    public JAXBElement<Integer> createActiveTroubleCodesUpdateActionJ1587TroubleCodeSubsystemIdentifier(Integer value) {
        return new JAXBElement<Integer>(_ActiveTroubleCodesUpdateActionJ1587TroubleCodeSubsystemIdentifier_QNAME, Integer.class, ActiveTroubleCodesUpdateActionJ1587TroubleCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActiveTroubleCodesUpdateActionDiagnosticTroubleCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DiagnosticTroubleCode", scope = DiagnosticTroubleCodeUpdateAction.class)
    public JAXBElement<ActiveTroubleCodesUpdateActionDiagnosticTroubleCode> createDiagnosticTroubleCodeUpdateActionDiagnosticTroubleCode(ActiveTroubleCodesUpdateActionDiagnosticTroubleCode value) {
        return new JAXBElement<ActiveTroubleCodesUpdateActionDiagnosticTroubleCode>(_DiagnosticTroubleCodeUpdateActionDiagnosticTroubleCode_QNAME, ActiveTroubleCodesUpdateActionDiagnosticTroubleCode.class, DiagnosticTroubleCodeUpdateAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKeys", scope = RemoveStopsAction.class)
    public JAXBElement<ArrayOfStopIdentity> createRemoveStopsActionStopKeys(ArrayOfStopIdentity value) {
        return new JAXBElement<ArrayOfStopIdentity>(_CancelStopsActionStopKeys_QNAME, ArrayOfStopIdentity.class, RemoveStopsAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EntityKey", scope = RouteDescriptor.class)
    public JAXBElement<Long> createRouteDescriptorEntityKey(Long value) {
        return new JAXBElement<Long>(_RouteDescriptorEntityKey_QNAME, Long.class, RouteDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Identifier", scope = RouteDescriptor.class)
    public JAXBElement<String> createRouteDescriptorIdentifier(String value) {
        return new JAXBElement<String>(_CreateCellsFromRoutesResultCreateCellsFromRoutesErrorIdentifier_QNAME, String.class, RouteDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RoutingSessionDate", scope = RouteDescriptor.class)
    public JAXBElement<XMLGregorianCalendar> createRouteDescriptorRoutingSessionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RouteDescriptorRoutingSessionDate_QNAME, XMLGregorianCalendar.class, RouteDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DamagedQuantities", scope = LineItemActuals.class)
    public JAXBElement<Quantities> createLineItemActualsDamagedQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionDetailItemQuantitiesDamagedQuantities_QNAME, Quantities.class, LineItemActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OverQuantities", scope = LineItemActuals.class)
    public JAXBElement<Quantities> createLineItemActualsOverQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionDetailItemQuantitiesOverQuantities_QNAME, Quantities.class, LineItemActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Quantities", scope = LineItemActuals.class)
    public JAXBElement<Quantities> createLineItemActualsQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionLineItemDetailItemQuantities_QNAME, Quantities.class, LineItemActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ShortQuantities", scope = LineItemActuals.class)
    public JAXBElement<Quantities> createLineItemActualsShortQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionDetailItemQuantitiesShortQuantities_QNAME, Quantities.class, LineItemActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DirectionText", scope = DrivingDirectionsStep.class)
    public JAXBElement<String> createDrivingDirectionsStepDirectionText(String value) {
        return new JAXBElement<String>(_DrivingDirectionsStepDirectionText_QNAME, String.class, DrivingDirectionsStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ElapsedDistance", scope = DrivingDirectionsStep.class)
    public JAXBElement<Distance> createDrivingDirectionsStepElapsedDistance(Distance value) {
        return new JAXBElement<Distance>(_DrivingDirectionsStepElapsedDistance_QNAME, Distance.class, DrivingDirectionsStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StartPoint", scope = DrivingDirectionsStep.class)
    public JAXBElement<Coordinate> createDrivingDirectionsStepStartPoint(Coordinate value) {
        return new JAXBElement<Coordinate>(_ShortestPathCriteriaStartPoint_QNAME, Coordinate.class, DrivingDirectionsStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AutomaticPlacementGoal_Goal", scope = AutomaticPlacement.class)
    public JAXBElement<String> createAutomaticPlacementAutomaticPlacementGoalGoal(String value) {
        return new JAXBElement<String>(_AutomaticPlacementAutomaticPlacementGoalGoal_QNAME, String.class, AutomaticPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "IgnoreFlags_RouteExceptionsToIgnore", scope = AutomaticPlacement.class)
    public JAXBElement<String> createAutomaticPlacementIgnoreFlagsRouteExceptionsToIgnore(String value) {
        return new JAXBElement<String>(_AutomaticPlacementIgnoreFlagsRouteExceptionsToIgnore_QNAME, String.class, AutomaticPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteInstance", scope = AutomaticPlacement.class)
    public JAXBElement<DomainInstance> createAutomaticPlacementRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_LockOrderResultsLockOrdersForRouteFailureRouteInstance_QNAME, DomainInstance.class, AutomaticPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveRecurringOrderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MoveRecurringOrderOptions", scope = OnTerritoryAutomaticPlacement.class)
    public JAXBElement<MoveRecurringOrderOptions> createOnTerritoryAutomaticPlacementMoveRecurringOrderOptions(MoveRecurringOrderOptions value) {
        return new JAXBElement<MoveRecurringOrderOptions>(_MoveRecurringOrderOptions_QNAME, MoveRecurringOrderOptions.class, OnTerritoryAutomaticPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MobileDeviceIdentifier", scope = SendSmsResult.class)
    public JAXBElement<String> createSendSmsResultMobileDeviceIdentifier(String value) {
        return new JAXBElement<String>(_SendSmsResultMobileDeviceIdentifier_QNAME, String.class, SendSmsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendSmsResult_Status_Result", scope = SendSmsResult.class)
    public JAXBElement<String> createSendSmsResultSendSmsResultStatusResult(String value) {
        return new JAXBElement<String>(_SendSmsResultSendSmsResultStatusResult_QNAME, String.class, SendSmsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LocationDescription", scope = OnStopPlacementInfo.class)
    public JAXBElement<String> createOnStopPlacementInfoLocationDescription(String value) {
        return new JAXBElement<String>(_OnStopPlacementInfoLocationDescription_QNAME, String.class, OnStopPlacementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LocationIdentifier", scope = OnStopPlacementInfo.class)
    public JAXBElement<String> createOnStopPlacementInfoLocationIdentifier(String value) {
        return new JAXBElement<String>(_OnStopPlacementInfoLocationIdentifier_QNAME, String.class, OnStopPlacementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OnStopPlacementStopType_StopType", scope = OnStopPlacementInfo.class)
    public JAXBElement<String> createOnStopPlacementInfoOnStopPlacementStopTypeStopType(String value) {
        return new JAXBElement<String>(_OnStopPlacementInfoOnStopPlacementStopTypeStopType_QNAME, String.class, OnStopPlacementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SequenceNumber", scope = OnStopPlacementInfo.class)
    public JAXBElement<Integer> createOnStopPlacementInfoSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_OnStopPlacementInfoSequenceNumber_QNAME, Integer.class, OnStopPlacementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AdditionalDistance", scope = SuggestLayoverResultSuggestion.class)
    public JAXBElement<Distance> createSuggestLayoverResultSuggestionAdditionalDistance(Distance value) {
        return new JAXBElement<Distance>(_SuggestLayoverResultSuggestionAdditionalDistance_QNAME, Distance.class, SuggestLayoverResultSuggestion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LayoverLocationDescription", scope = SuggestLayoverResultSuggestion.class)
    public JAXBElement<String> createSuggestLayoverResultSuggestionLayoverLocationDescription(String value) {
        return new JAXBElement<String>(_SuggestLayoverResultSuggestionLayoverLocationDescription_QNAME, String.class, SuggestLayoverResultSuggestion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LayoverLocationIdentifier", scope = SuggestLayoverResultSuggestion.class)
    public JAXBElement<String> createSuggestLayoverResultSuggestionLayoverLocationIdentifier(String value) {
        return new JAXBElement<String>(_SuggestLayoverResultSuggestionLayoverLocationIdentifier_QNAME, String.class, SuggestLayoverResultSuggestion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "WorldTimeZone_LayoverLocationTimeZone", scope = SuggestLayoverResultSuggestion.class)
    public JAXBElement<String> createSuggestLayoverResultSuggestionWorldTimeZoneLayoverLocationTimeZone(String value) {
        return new JAXBElement<String>(_SuggestLayoverResultSuggestionWorldTimeZoneLayoverLocationTimeZone_QNAME, String.class, SuggestLayoverResultSuggestion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ScheduledDate", scope = ScheduleEquipmentMaintenanceArgs.class)
    public JAXBElement<XMLGregorianCalendar> createScheduleEquipmentMaintenanceArgsScheduledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ScheduleEquipmentMaintenanceArgsScheduledDate_QNAME, XMLGregorianCalendar.class, ScheduleEquipmentMaintenanceArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Address", scope = SaveStopFromPointArgs.class)
    public JAXBElement<Address> createSaveStopFromPointArgsAddress(Address value) {
        return new JAXBElement<Address>(_SaveStopFromPointArgsAddress_QNAME, Address.class, SaveStopFromPointArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Coordinate", scope = SaveStopFromPointArgs.class)
    public JAXBElement<Coordinate> createSaveStopFromPointArgsCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_PositionUpdateActionCoordinate_QNAME, Coordinate.class, SaveStopFromPointArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceLocationEntityKey", scope = SaveStopFromPointArgs.class)
    public JAXBElement<Long> createSaveStopFromPointArgsServiceLocationEntityKey(Long value) {
        return new JAXBElement<Long>(_SaveStopFromPointArgsServiceLocationEntityKey_QNAME, Long.class, SaveStopFromPointArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopCreationMethod_CreationMethod", scope = SaveStopFromPointArgs.class)
    public JAXBElement<String> createSaveStopFromPointArgsStopCreationMethodCreationMethod(String value) {
        return new JAXBElement<String>(_SaveStopFromPointArgsStopCreationMethodCreationMethod_QNAME, String.class, SaveStopFromPointArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AutomaticPlacement_IgnoreFlags_RouteExceptionsToIgnore", scope = RecurringOrderPlacement.class)
    public JAXBElement<String> createRecurringOrderPlacementAutomaticPlacementIgnoreFlagsRouteExceptionsToIgnore(String value) {
        return new JAXBElement<String>(_RecurringOrderPlacementAutomaticPlacementIgnoreFlagsRouteExceptionsToIgnore_QNAME, String.class, RecurringOrderPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PlacementMethod_RoutePlacementMethod", scope = RecurringOrderPlacement.class)
    public JAXBElement<String> createRecurringOrderPlacementPlacementMethodRoutePlacementMethod(String value) {
        return new JAXBElement<String>(_RecurringOrderPlacementPlacementMethodRoutePlacementMethod_QNAME, String.class, RecurringOrderPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryQuantities", scope = OnSwitchServicePatternPlacement.class)
    public JAXBElement<Quantities> createOnSwitchServicePatternPlacementDeliveryQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionOrderDetailItemDeliveryQuantities_QNAME, Quantities.class, OnSwitchServicePatternPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDailyDistribution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DailyDistributions", scope = OnManualLoadDistributionPlacement.class)
    public JAXBElement<ArrayOfDailyDistribution> createOnManualLoadDistributionPlacementDailyDistributions(ArrayOfDailyDistribution value) {
        return new JAXBElement<ArrayOfDailyDistribution>(_OnManualLoadDistributionPlacementDailyDistributions_QNAME, ArrayOfDailyDistribution.class, OnManualLoadDistributionPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryQuantities", scope = OnManualLoadDistributionPlacement.class)
    public JAXBElement<Quantities> createOnManualLoadDistributionPlacementDeliveryQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionOrderDetailItemDeliveryQuantities_QNAME, Quantities.class, OnManualLoadDistributionPlacement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PlacementMethodType_OrderPlacementMethod", scope = MoveRecurringOrderOptions.class)
    public JAXBElement<String> createMoveRecurringOrderOptionsPlacementMethodTypeOrderPlacementMethod(String value) {
        return new JAXBElement<String>(_MoveRecurringOrderOptionsPlacementMethodTypeOrderPlacementMethod_QNAME, String.class, MoveRecurringOrderOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RequiredTimeUnitNumber", scope = MoveRecurringOrderOptions.class)
    public JAXBElement<Integer> createMoveRecurringOrderOptionsRequiredTimeUnitNumber(Integer value) {
        return new JAXBElement<Integer>(_MoveRecurringOrderOptionsRequiredTimeUnitNumber_QNAME, Integer.class, MoveRecurringOrderOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CommentKey", scope = LocationCommentParam.class)
    public JAXBElement<Long> createLocationCommentParamCommentKey(Long value) {
        return new JAXBElement<Long>(_LocationCommentParamCommentKey_QNAME, Long.class, LocationCommentParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Content", scope = LocationCommentParam.class)
    public JAXBElement<String> createLocationCommentParamContent(String value) {
        return new JAXBElement<String>(_LocationCommentParamContent_QNAME, String.class, LocationCommentParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LocationId", scope = LocationCommentParam.class)
    public JAXBElement<String> createLocationCommentParamLocationId(String value) {
        return new JAXBElement<String>(_LocationCommentParamLocationId_QNAME, String.class, LocationCommentParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LocationType", scope = LocationCommentParam.class)
    public JAXBElement<String> createLocationCommentParamLocationType(String value) {
        return new JAXBElement<String>(_LocationCommentParamLocationType_QNAME, String.class, LocationCommentParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Sender", scope = LocationCommentParam.class)
    public JAXBElement<String> createLocationCommentParamSender(String value) {
        return new JAXBElement<String>(_LocationCommentParamSender_QNAME, String.class, LocationCommentParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DayOfWeek_Day", scope = DailyDistribution.class)
    public JAXBElement<String> createDailyDistributionDayOfWeekDay(String value) {
        return new JAXBElement<String>(_DailyDistributionDayOfWeekDay_QNAME, String.class, DailyDistribution.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryQuantities", scope = DailyDistribution.class)
    public JAXBElement<Quantities> createDailyDistributionDeliveryQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionOrderDetailItemDeliveryQuantities_QNAME, Quantities.class, DailyDistribution.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "CustomFormIdentifier", scope = CustomFormResponseInfo.class)
    public JAXBElement<String> createCustomFormResponseInfoCustomFormIdentifier(String value) {
        return new JAXBElement<String>(_CustomFormResponseInfoCustomFormIdentifier_QNAME, String.class, CustomFormResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EquipmentEntityKey", scope = CustomFormResponseInfo.class)
    public JAXBElement<Long> createCustomFormResponseInfoEquipmentEntityKey(Long value) {
        return new JAXBElement<Long>(_CustomFormResponseInfoEquipmentEntityKey_QNAME, Long.class, CustomFormResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LineItemIdentifier", scope = CustomFormResponseInfo.class)
    public JAXBElement<String> createCustomFormResponseInfoLineItemIdentifier(String value) {
        return new JAXBElement<String>(_LineItemUpdateActionLineItemIdentifier_QNAME, String.class, CustomFormResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderIdentifier", scope = CustomFormResponseInfo.class)
    public JAXBElement<String> createCustomFormResponseInfoOrderIdentifier(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionLineItemDetailItemOrderIdentifier_QNAME, String.class, CustomFormResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PerformedAt_PerformedAt", scope = CustomFormResponseInfo.class)
    public JAXBElement<String> createCustomFormResponseInfoPerformedAtPerformedAt(String value) {
        return new JAXBElement<String>(_CustomFormResponseInfoPerformedAtPerformedAt_QNAME, String.class, CustomFormResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFormControlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Responses", scope = CustomFormResponseInfo.class)
    public JAXBElement<ArrayOfFormControlResponse> createCustomFormResponseInfoResponses(ArrayOfFormControlResponse value) {
        return new JAXBElement<ArrayOfFormControlResponse>(_CustomFormResponseActionResponses_QNAME, ArrayOfFormControlResponse.class, CustomFormResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteEntityKey", scope = CustomFormResponseInfo.class)
    public JAXBElement<Long> createCustomFormResponseInfoRouteEntityKey(Long value) {
        return new JAXBElement<Long>(_CustomFormResponseInfoRouteEntityKey_QNAME, Long.class, CustomFormResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopEntityKey", scope = CustomFormResponseInfo.class)
    public JAXBElement<Long> createCustomFormResponseInfoStopEntityKey(Long value) {
        return new JAXBElement<Long>(_LockOrderResultsLockOrdersForStopFailureStopEntityKey_QNAME, Long.class, CustomFormResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "WorkerEntityKey", scope = CustomFormResponseInfo.class)
    public JAXBElement<Long> createCustomFormResponseInfoWorkerEntityKey(Long value) {
        return new JAXBElement<Long>(_LogOnActionWorkerEntityKey_QNAME, Long.class, CustomFormResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ComponentIdentifier", scope = VehicleBusComponent.class)
    public JAXBElement<String> createVehicleBusComponentComponentIdentifier(String value) {
        return new JAXBElement<String>(_VehicleBusComponentComponentIdentifier_QNAME, String.class, VehicleBusComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SoftwareVersion", scope = VehicleBusComponent.class)
    public JAXBElement<String> createVehicleBusComponentSoftwareVersion(String value) {
        return new JAXBElement<String>(_VehicleBusComponentSoftwareVersion_QNAME, String.class, VehicleBusComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderIdentifier", scope = ServiceConfirmationActionOrderIdentity.class)
    public JAXBElement<String> createServiceConfirmationActionOrderIdentityOrderIdentifier(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionLineItemDetailItemOrderIdentifier_QNAME, String.class, ServiceConfirmationActionOrderIdentity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopKey", scope = ServiceConfirmationActionOrderIdentity.class)
    public JAXBElement<StopIdentity> createServiceConfirmationActionOrderIdentityStopKey(StopIdentity value) {
        return new JAXBElement<StopIdentity>(_DeliveryDetailsUpdateActionStopKey_QNAME, StopIdentity.class, ServiceConfirmationActionOrderIdentity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceConfirmationActionOrderIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AppliesToOrders", scope = ServiceConfirmationInfo.class)
    public JAXBElement<ArrayOfServiceConfirmationActionOrderIdentity> createServiceConfirmationInfoAppliesToOrders(ArrayOfServiceConfirmationActionOrderIdentity value) {
        return new JAXBElement<ArrayOfServiceConfirmationActionOrderIdentity>(_ServiceConfirmationInfoAppliesToOrders_QNAME, ArrayOfServiceConfirmationActionOrderIdentity.class, ServiceConfirmationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AppliesToStops", scope = ServiceConfirmationInfo.class)
    public JAXBElement<ArrayOfStopIdentity> createServiceConfirmationInfoAppliesToStops(ArrayOfStopIdentity value) {
        return new JAXBElement<ArrayOfStopIdentity>(_ServiceConfirmationInfoAppliesToStops_QNAME, ArrayOfStopIdentity.class, ServiceConfirmationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Consignee", scope = ServiceConfirmationInfo.class)
    public JAXBElement<String> createServiceConfirmationInfoConsignee(String value) {
        return new JAXBElement<String>(_StopSignatureActionConsignee_QNAME, String.class, ServiceConfirmationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DeliveryImage", scope = ServiceConfirmationInfo.class)
    public JAXBElement<byte[]> createServiceConfirmationInfoDeliveryImage(byte[] value) {
        return new JAXBElement<byte[]>(_ServiceConfirmationInfoDeliveryImage_QNAME, byte[].class, ServiceConfirmationInfo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SignatureImage", scope = ServiceConfirmationInfo.class)
    public JAXBElement<byte[]> createServiceConfirmationInfoSignatureImage(byte[] value) {
        return new JAXBElement<byte[]>(_ServiceConfirmationInfoSignatureImage_QNAME, byte[].class, ServiceConfirmationInfo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Coordinate", scope = UnplannedOriginParameters.class)
    public JAXBElement<Coordinate> createUnplannedOriginParametersCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_PositionUpdateActionCoordinate_QNAME, Coordinate.class, UnplannedOriginParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteEntityKey", scope = UnplannedOriginParameters.class)
    public JAXBElement<Long> createUnplannedOriginParametersRouteEntityKey(Long value) {
        return new JAXBElement<Long>(_CustomFormResponseInfoRouteEntityKey_QNAME, Long.class, UnplannedOriginParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Address", scope = SaveRoutePlanStopArgs.class)
    public JAXBElement<Address> createSaveRoutePlanStopArgsAddress(Address value) {
        return new JAXBElement<Address>(_SaveStopFromPointArgsAddress_QNAME, Address.class, SaveRoutePlanStopArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Coordinate", scope = SaveRoutePlanStopArgs.class)
    public JAXBElement<Coordinate> createSaveRoutePlanStopArgsCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_PositionUpdateActionCoordinate_QNAME, Coordinate.class, SaveRoutePlanStopArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderIdentifier", scope = SaveRoutePlanStopArgs.class)
    public JAXBElement<String> createSaveRoutePlanStopArgsOrderIdentifier(String value) {
        return new JAXBElement<String>(_DeliveryDetailsUpdateActionLineItemDetailItemOrderIdentifier_QNAME, String.class, SaveRoutePlanStopArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Quantities", scope = SaveRoutePlanStopArgs.class)
    public JAXBElement<Quantities> createSaveRoutePlanStopArgsQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_DeliveryDetailsUpdateActionLineItemDetailItemQuantities_QNAME, Quantities.class, SaveRoutePlanStopArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceLocationDescription", scope = SaveRoutePlanStopArgs.class)
    public JAXBElement<String> createSaveRoutePlanStopArgsServiceLocationDescription(String value) {
        return new JAXBElement<String>(_SaveRoutePlanStopArgsServiceLocationDescription_QNAME, String.class, SaveRoutePlanStopArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceLocationEntityKey", scope = SaveRoutePlanStopArgs.class)
    public JAXBElement<Long> createSaveRoutePlanStopArgsServiceLocationEntityKey(Long value) {
        return new JAXBElement<Long>(_SaveStopFromPointArgsServiceLocationEntityKey_QNAME, Long.class, SaveRoutePlanStopArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ServiceLocationIdentifier", scope = SaveRoutePlanStopArgs.class)
    public JAXBElement<String> createSaveRoutePlanStopArgsServiceLocationIdentifier(String value) {
        return new JAXBElement<String>(_SaveRoutePlanStopArgsServiceLocationIdentifier_QNAME, String.class, SaveRoutePlanStopArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MatchingPatternEntityKeys", scope = ManipulationResultManipulationError.class)
    public JAXBElement<ArrayOflong> createManipulationResultManipulationErrorMatchingPatternEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ManipulationResultManipulationErrorMatchingPatternEntityKeys_QNAME, ArrayOflong.class, ManipulationResultManipulationError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OrderEntityKey", scope = ManipulationResultManipulationError.class)
    public JAXBElement<Long> createManipulationResultManipulationErrorOrderEntityKey(Long value) {
        return new JAXBElement<Long>(_ManipulationResultManipulationErrorOrderEntityKey_QNAME, Long.class, ManipulationResultManipulationError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Reason", scope = ManipulationResultManipulationError.class)
    public JAXBElement<TransferErrorCode> createManipulationResultManipulationErrorReason(TransferErrorCode value) {
        return new JAXBElement<TransferErrorCode>(_ManipulationResultManipulationErrorReason_QNAME, TransferErrorCode.class, ManipulationResultManipulationError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopEntityKey", scope = ManipulationResultManipulationError.class)
    public JAXBElement<Long> createManipulationResultManipulationErrorStopEntityKey(Long value) {
        return new JAXBElement<Long>(_LockOrderResultsLockOrdersForStopFailureStopEntityKey_QNAME, Long.class, ManipulationResultManipulationError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DayOfWeekFlags_ValidDays", scope = DayShiftOptions.class)
    public JAXBElement<String> createDayShiftOptionsDayOfWeekFlagsValidDays(String value) {
        return new JAXBElement<String>(_DayShiftOptionsDayOfWeekFlagsValidDays_QNAME, String.class, DayShiftOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ShiftByOverride", scope = DayShiftOptions.class)
    public JAXBElement<Integer> createDayShiftOptionsShiftByOverride(Integer value) {
        return new JAXBElement<Integer>(_DayShiftOptionsShiftByOverride_QNAME, Integer.class, DayShiftOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ActivationCode", scope = NavDeviceStatusDto.class)
    public JAXBElement<String> createNavDeviceStatusDtoActivationCode(String value) {
        return new JAXBElement<String>(_NavDeviceStatusDtoActivationCode_QNAME, String.class, NavDeviceStatusDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", name = "LogFile", scope = ClientDiagnosticsInformation.class)
    public JAXBElement<LogFile> createClientDiagnosticsInformationLogFile(LogFile value) {
        return new JAXBElement<LogFile>(_LogFile_QNAME, LogFile.class, ClientDiagnosticsInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", name = "EndDate", scope = UpdateServiceTimeParameters.class)
    public JAXBElement<XMLGregorianCalendar> createUpdateServiceTimeParametersEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateServiceTimeParametersEndDate_QNAME, XMLGregorianCalendar.class, UpdateServiceTimeParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", name = "FixedTimeMaxVariance", scope = UpdateServiceTimeParameters.class)
    public JAXBElement<Duration> createUpdateServiceTimeParametersFixedTimeMaxVariance(Duration value) {
        return new JAXBElement<Duration>(_UpdateServiceTimeParametersFixedTimeMaxVariance_QNAME, Duration.class, UpdateServiceTimeParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", name = "StartDate", scope = UpdateServiceTimeParameters.class)
    public JAXBElement<XMLGregorianCalendar> createUpdateServiceTimeParametersStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateServiceTimeParametersStartDate_QNAME, XMLGregorianCalendar.class, UpdateServiceTimeParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", name = "VariableTimeMaxVariancePercentage", scope = UpdateServiceTimeParameters.class)
    public JAXBElement<Double> createUpdateServiceTimeParametersVariableTimeMaxVariancePercentage(Double value) {
        return new JAXBElement<Double>(_UpdateServiceTimeParametersVariableTimeMaxVariancePercentage_QNAME, Double.class, UpdateServiceTimeParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteTemplateInstance", scope = GenerateRouteTemplateTravelPathOptions.class)
    public JAXBElement<DomainInstance> createGenerateRouteTemplateTravelPathOptionsRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_TemplatePlacementRouteTemplateInstance_QNAME, DomainInstance.class, GenerateRouteTemplateTravelPathOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteInstance", scope = GenerateRoutePathOptions.class)
    public JAXBElement<DomainInstance> createGenerateRoutePathOptionsRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_LockOrderResultsLockOrdersForRouteFailureRouteInstance_QNAME, DomainInstance.class, GenerateRoutePathOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteInstance", scope = GenerateRouteTravelPathOptions.class)
    public JAXBElement<DomainInstance> createGenerateRouteTravelPathOptionsRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_LockOrderResultsLockOrdersForRouteFailureRouteInstance_QNAME, DomainInstance.class, GenerateRouteTravelPathOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "RouteConstraintFlags_ConstraintsEncountered", scope = SuggestRouteResult.class)
    public JAXBElement<String> createSuggestRouteResultRouteConstraintFlagsConstraintsEncountered(String value) {
        return new JAXBElement<String>(_SuggestRouteResultRouteConstraintFlagsConstraintsEncountered_QNAME, String.class, SuggestRouteResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSuggestRouteResultSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "Suggestions", scope = SuggestRouteResult.class)
    public JAXBElement<ArrayOfSuggestRouteResultSuggestion> createSuggestRouteResultSuggestions(ArrayOfSuggestRouteResultSuggestion value) {
        return new JAXBElement<ArrayOfSuggestRouteResultSuggestion>(_SuggestRouteResultSuggestions_QNAME, ArrayOfSuggestRouteResultSuggestion.class, SuggestRouteResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "DefaultRoutingSessionEntityKey", scope = SuggestRouteParameters.class)
    public JAXBElement<Long> createSuggestRouteParametersDefaultRoutingSessionEntityKey(Long value) {
        return new JAXBElement<Long>(_SuggestRouteParametersDefaultRoutingSessionEntityKey_QNAME, Long.class, SuggestRouteParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "MinimumTravelTimeToConsiderBeforeNextStop", scope = SuggestRouteParameters.class)
    public JAXBElement<Duration> createSuggestRouteParametersMinimumTravelTimeToConsiderBeforeNextStop(Duration value) {
        return new JAXBElement<Duration>(_SuggestRouteParametersMinimumTravelTimeToConsiderBeforeNextStop_QNAME, Duration.class, SuggestRouteParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "RouteEntityKeys", scope = SuggestRouteParameters.class)
    public JAXBElement<ArrayOflong> createSuggestRouteParametersRouteEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SuggestRouteParametersRouteEntityKeys_QNAME, ArrayOflong.class, SuggestRouteParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "RouteExpression", scope = SuggestRouteParameters.class)
    public JAXBElement<SimpleExpressionBase> createSuggestRouteParametersRouteExpression(SimpleExpressionBase value) {
        return new JAXBElement<SimpleExpressionBase>(_SuggestRouteParametersRouteExpression_QNAME, SimpleExpressionBase.class, SuggestRouteParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "SuggestIgnoreFlags_IgnoreFlags", scope = SuggestRouteParameters.class)
    public JAXBElement<String> createSuggestRouteParametersSuggestIgnoreFlagsIgnoreFlags(String value) {
        return new JAXBElement<String>(_SuggestRouteParametersSuggestIgnoreFlagsIgnoreFlags_QNAME, String.class, SuggestRouteParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", name = "SuggestRouteGoal_Goal", scope = SuggestRouteParameters.class)
    public JAXBElement<String> createSuggestRouteParametersSuggestRouteGoalGoal(String value) {
        return new JAXBElement<String>(_SuggestRouteParametersSuggestRouteGoalGoal_QNAME, String.class, SuggestRouteParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSendOrdersPropertyResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Errors", scope = SendOrdersResults.class)
    public JAXBElement<ArrayOfSendOrdersPropertyResult> createSendOrdersResultsErrors(ArrayOfSendOrdersPropertyResult value) {
        return new JAXBElement<ArrayOfSendOrdersPropertyResult>(_SendOrdersResultsErrors_QNAME, ArrayOfSendOrdersPropertyResult.class, SendOrdersResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "File", scope = SendOrdersResults.class)
    public JAXBElement<byte[]> createSendOrdersResultsFile(byte[] value) {
        return new JAXBElement<byte[]>(_SendOrdersResultsFile_QNAME, byte[].class, SendOrdersResults.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LockOrderErrors", scope = SendOrdersResults.class)
    public JAXBElement<LockOrderResults> createSendOrdersResultsLockOrderErrors(LockOrderResults value) {
        return new JAXBElement<LockOrderResults>(_SendOrdersResultsLockOrderErrors_QNAME, LockOrderResults.class, SendOrdersResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteKeyList", scope = SendOrdersResults.class)
    public JAXBElement<ArrayOflong> createSendOrdersResultsRouteKeyList(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SendOrdersResultsRouteKeyList_QNAME, ArrayOflong.class, SendOrdersResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Expression", scope = SendOrdersParameters.class)
    public JAXBElement<SimpleExpressionBase> createSendOrdersParametersExpression(SimpleExpressionBase value) {
        return new JAXBElement<SimpleExpressionBase>(_SendOrdersParametersExpression_QNAME, SimpleExpressionBase.class, SendOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LatLongPrecision", scope = SendOrdersParameters.class)
    public JAXBElement<Integer> createSendOrdersParametersLatLongPrecision(Integer value) {
        return new JAXBElement<Integer>(_SendOrdersParametersLatLongPrecision_QNAME, Integer.class, SendOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Routes", scope = SendOrdersParameters.class)
    public JAXBElement<ArrayOfDomainInstance> createSendOrdersParametersRoutes(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_SendOrdersParametersRoutes_QNAME, ArrayOfDomainInstance.class, SendOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SendOrdersTimeZoneOption_TimeZoneOption", scope = SendOrdersParameters.class)
    public JAXBElement<String> createSendOrdersParametersSendOrdersTimeZoneOptionTimeZoneOption(String value) {
        return new JAXBElement<String>(_SendOrdersParametersSendOrdersTimeZoneOptionTimeZoneOption_QNAME, String.class, SendOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopNumberFormat_AssignStopNumbersBy", scope = SendOrdersParameters.class)
    public JAXBElement<String> createSendOrdersParametersStopNumberFormatAssignStopNumbersBy(String value) {
        return new JAXBElement<String>(_SendOrdersParametersStopNumberFormatAssignStopNumbersBy_QNAME, String.class, SendOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntitySendOrderTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Template", scope = SendOrdersParameters.class)
    public JAXBElement<EntitySendOrderTemplate> createSendOrdersParametersTemplate(EntitySendOrderTemplate value) {
        return new JAXBElement<EntitySendOrderTemplate>(_SendOrdersParametersTemplate_QNAME, EntitySendOrderTemplate.class, SendOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VariableServiceTimeFormat_ServiceTimeFormat", scope = SendOrdersParameters.class)
    public JAXBElement<String> createSendOrdersParametersVariableServiceTimeFormatServiceTimeFormat(String value) {
        return new JAXBElement<String>(_SendOrdersParametersVariableServiceTimeFormatServiceTimeFormat_QNAME, String.class, SendOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "WorldTimeZone_TimeZone", scope = SendOrdersParameters.class)
    public JAXBElement<String> createSendOrdersParametersWorldTimeZoneTimeZone(String value) {
        return new JAXBElement<String>(_SendOrdersParametersWorldTimeZoneTimeZone_QNAME, String.class, SendOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteInstances", scope = SaveRouteTemplateFromRouteArgs.class)
    public JAXBElement<ArrayOfDomainInstance> createSaveRouteTemplateFromRouteArgsRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_SaveRouteTemplateFromRouteArgsRouteInstances_QNAME, ArrayOfDomainInstance.class, SaveRouteTemplateFromRouteArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UpdateAction_IfTemplateExists", scope = SaveRouteTemplateFromRouteArgs.class)
    public JAXBElement<String> createSaveRouteTemplateFromRouteArgsUpdateActionIfTemplateExists(String value) {
        return new JAXBElement<String>(_SaveRouteTemplateFromRouteArgsUpdateActionIfTemplateExists_QNAME, String.class, SaveRouteTemplateFromRouteArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSuggestRouteTemplateResultSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Suggestions", scope = SuggestRouteTemplateResult.class)
    public JAXBElement<ArrayOfSuggestRouteTemplateResultSuggestion> createSuggestRouteTemplateResultSuggestions(ArrayOfSuggestRouteTemplateResultSuggestion value) {
        return new JAXBElement<ArrayOfSuggestRouteTemplateResultSuggestion>(_SuggestRouteTemplateResultSuggestions_QNAME, ArrayOfSuggestRouteTemplateResultSuggestion.class, SuggestRouteTemplateResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EntityKeys", scope = SuggestRouteTemplateCandidates.class)
    public JAXBElement<ArrayOflong> createSuggestRouteTemplateCandidatesEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SuggestRouteTemplateCandidatesEntityKeys_QNAME, ArrayOflong.class, SuggestRouteTemplateCandidates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SuggestRouteTemplateCandidates_EntityType_Type", scope = SuggestRouteTemplateCandidates.class)
    public JAXBElement<String> createSuggestRouteTemplateCandidatesSuggestRouteTemplateCandidatesEntityTypeType(String value) {
        return new JAXBElement<String>(_SuggestRouteTemplateCandidatesSuggestRouteTemplateCandidatesEntityTypeType_QNAME, String.class, SuggestRouteTemplateCandidates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AdditionalLayoverLocationEntityKeys", scope = SuggestLayoverTemplateOptions.class)
    public JAXBElement<ArrayOflong> createSuggestLayoverTemplateOptionsAdditionalLayoverLocationEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SuggestLayoverTemplateOptionsAdditionalLayoverLocationEntityKeys_QNAME, ArrayOflong.class, SuggestLayoverTemplateOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayoverDeparture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DepartureType", scope = SuggestLayoverTemplateOptions.class)
    public JAXBElement<LayoverDeparture> createSuggestLayoverTemplateOptionsDepartureType(LayoverDeparture value) {
        return new JAXBElement<LayoverDeparture>(_SuggestLayoverTemplateOptionsDepartureType_QNAME, LayoverDeparture.class, SuggestLayoverTemplateOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Placement", scope = SuggestLayoverTemplateOptions.class)
    public JAXBElement<TemplatePlacement> createSuggestLayoverTemplateOptionsPlacement(TemplatePlacement value) {
        return new JAXBElement<TemplatePlacement>(_Placement_QNAME, TemplatePlacement.class, SuggestLayoverTemplateOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayoverDeparture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Departure", scope = SaveLayoverStopTemplateArgs.class)
    public JAXBElement<LayoverDeparture> createSaveLayoverStopTemplateArgsDeparture(LayoverDeparture value) {
        return new JAXBElement<LayoverDeparture>(_SaveLayoverStopTemplateArgsDeparture_QNAME, LayoverDeparture.class, SaveLayoverStopTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EntityKey", scope = SaveLayoverStopTemplateArgs.class)
    public JAXBElement<Long> createSaveLayoverStopTemplateArgsEntityKey(Long value) {
        return new JAXBElement<Long>(_RouteDescriptorEntityKey_QNAME, Long.class, SaveLayoverStopTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LayoverLocationEntityKey", scope = SaveLayoverStopTemplateArgs.class)
    public JAXBElement<Long> createSaveLayoverStopTemplateArgsLayoverLocationEntityKey(Long value) {
        return new JAXBElement<Long>(_SaveLayoverStopTemplateArgsLayoverLocationEntityKey_QNAME, Long.class, SaveLayoverStopTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EntityKey", scope = SaveMidRouteDepotStopTemplateArgs.class)
    public JAXBElement<Long> createSaveMidRouteDepotStopTemplateArgsEntityKey(Long value) {
        return new JAXBElement<Long>(_RouteDescriptorEntityKey_QNAME, Long.class, SaveMidRouteDepotStopTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LoadAction_LoadAction", scope = SaveMidRouteDepotStopTemplateArgs.class)
    public JAXBElement<String> createSaveMidRouteDepotStopTemplateArgsLoadActionLoadAction(String value) {
        return new JAXBElement<String>(_SaveMidRouteDepotStopTemplateArgsLoadActionLoadAction_QNAME, String.class, SaveMidRouteDepotStopTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ReloadTimeOverride", scope = SaveMidRouteDepotStopTemplateArgs.class)
    public JAXBElement<Duration> createSaveMidRouteDepotStopTemplateArgsReloadTimeOverride(Duration value) {
        return new JAXBElement<Duration>(_SaveMidRouteDepotStopTemplateArgsReloadTimeOverride_QNAME, Duration.class, SaveMidRouteDepotStopTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Color }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Color", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<Color> createSaveRouteTemplateArgsColor(Color value) {
        return new JAXBElement<Color>(_SaveRouteTemplateArgsColor_QNAME, Color.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DayOfWeekFlags_DeliveryDays", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<String> createSaveRouteTemplateArgsDayOfWeekFlagsDeliveryDays(String value) {
        return new JAXBElement<String>(_SaveRouteTemplateArgsDayOfWeekFlagsDeliveryDays_QNAME, String.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Description", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<String> createSaveRouteTemplateArgsDescription(String value) {
        return new JAXBElement<String>(_SaveRouteTemplateArgsDescription_QNAME, String.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DestinationDepotEntityKey", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<Long> createSaveRouteTemplateArgsDestinationDepotEntityKey(Long value) {
        return new JAXBElement<Long>(_EndWorkActionDestinationDepotEntityKey_QNAME, Long.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DispatcherEntityKey", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<Long> createSaveRouteTemplateArgsDispatcherEntityKey(Long value) {
        return new JAXBElement<Long>(_SaveRouteTemplateArgsDispatcherEntityKey_QNAME, Long.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteTemplateEquipmentBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Equipment", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<ArrayOfRouteTemplateEquipmentBase> createSaveRouteTemplateArgsEquipment(ArrayOfRouteTemplateEquipmentBase value) {
        return new JAXBElement<ArrayOfRouteTemplateEquipmentBase>(_EquipmentDropHookActionEquipment_QNAME, ArrayOfRouteTemplateEquipmentBase.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Identifier", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<String> createSaveRouteTemplateArgsIdentifier(String value) {
        return new JAXBElement<String>(_CreateCellsFromRoutesResultCreateCellsFromRoutesErrorIdentifier_QNAME, String.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Instance", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<DomainInstance> createSaveRouteTemplateArgsInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SaveRouteTemplateArgsInstance_QNAME, DomainInstance.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LoadAction_OriginLoadAction", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<String> createSaveRouteTemplateArgsLoadActionOriginLoadAction(String value) {
        return new JAXBElement<String>(_SaveRouteTemplateArgsLoadActionOriginLoadAction_QNAME, String.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MaximumRuntime", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<Duration> createSaveRouteTemplateArgsMaximumRuntime(Duration value) {
        return new JAXBElement<Duration>(_SaveRouteTemplateArgsMaximumRuntime_QNAME, Duration.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "MaximumTravelTime", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<Duration> createSaveRouteTemplateArgsMaximumTravelTime(Duration value) {
        return new JAXBElement<Duration>(_SaveRouteTemplateArgsMaximumTravelTime_QNAME, Duration.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PostRouteTime", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<Duration> createSaveRouteTemplateArgsPostRouteTime(Duration value) {
        return new JAXBElement<Duration>(_SaveRouteTemplateArgsPostRouteTime_QNAME, Duration.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PreRouteTime", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<Duration> createSaveRouteTemplateArgsPreRouteTime(Duration value) {
        return new JAXBElement<Duration>(_SaveRouteTemplateArgsPreRouteTime_QNAME, Duration.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PreferredRuntime", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<Duration> createSaveRouteTemplateArgsPreferredRuntime(Duration value) {
        return new JAXBElement<Duration>(_SaveRouteTemplateArgsPreferredRuntime_QNAME, Duration.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouterEntityKey", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<Long> createSaveRouteTemplateArgsRouterEntityKey(Long value) {
        return new JAXBElement<Long>(_SaveRouteTemplateArgsRouterEntityKey_QNAME, Long.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StartTime", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<XMLGregorianCalendar> createSaveRouteTemplateArgsStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartRouteActionStartTime_QNAME, XMLGregorianCalendar.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteTemplateWorker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Workers", scope = SaveRouteTemplateArgs.class)
    public JAXBElement<ArrayOfRouteTemplateWorker> createSaveRouteTemplateArgsWorkers(ArrayOfRouteTemplateWorker value) {
        return new JAXBElement<ArrayOfRouteTemplateWorker>(_SaveRouteTemplateArgsWorkers_QNAME, ArrayOfRouteTemplateWorker.class, SaveRouteTemplateArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ActivationCode", scope = NavClientActivationCodeRefreshStatus.class)
    public JAXBElement<String> createNavClientActivationCodeRefreshStatusActivationCode(String value) {
        return new JAXBElement<String>(_NavDeviceStatusDtoActivationCode_QNAME, String.class, NavClientActivationCodeRefreshStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ErrorMessage", scope = NavClientActivationCodeRefreshStatus.class)
    public JAXBElement<String> createNavClientActivationCodeRefreshStatusErrorMessage(String value) {
        return new JAXBElement<String>(_NavClientActivationCodeRefreshStatusErrorMessage_QNAME, String.class, NavClientActivationCodeRefreshStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PropertyOptions", scope = PreviewRouteOptions.class)
    public JAXBElement<PropertyOptions> createPreviewRouteOptionsPropertyOptions(PropertyOptions value) {
        return new JAXBElement<PropertyOptions>(_PreviewRouteOptionsPropertyOptions_QNAME, PropertyOptions.class, PreviewRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteInstance", scope = PreviewRouteOptions.class)
    public JAXBElement<DomainInstance> createPreviewRouteOptionsRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_LockOrderResultsLockOrdersForRouteFailureRouteInstance_QNAME, DomainInstance.class, PreviewRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnplannedOriginParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UnplannedOriginParameters", scope = PreviewRouteOptions.class)
    public JAXBElement<UnplannedOriginParameters> createPreviewRouteOptionsUnplannedOriginParameters(UnplannedOriginParameters value) {
        return new JAXBElement<UnplannedOriginParameters>(_UnplannedOriginParameters_QNAME, UnplannedOriginParameters.class, PreviewRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EquipmentList", scope = RetrieveRoutesOptions.class)
    public JAXBElement<ArrayOfEquipmentDescriptor> createRetrieveRoutesOptionsEquipmentList(ArrayOfEquipmentDescriptor value) {
        return new JAXBElement<ArrayOfEquipmentDescriptor>(_RetrieveRoutesOptionsEquipmentList_QNAME, ArrayOfEquipmentDescriptor.class, RetrieveRoutesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ParentRouteDescriptor", scope = RetrieveRoutesOptions.class)
    public JAXBElement<RouteDescriptor> createRetrieveRoutesOptionsParentRouteDescriptor(RouteDescriptor value) {
        return new JAXBElement<RouteDescriptor>(_RetrieveRoutesOptionsParentRouteDescriptor_QNAME, RouteDescriptor.class, RetrieveRoutesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PropertyOptions", scope = RetrieveRoutesOptions.class)
    public JAXBElement<PropertyOptions> createRetrieveRoutesOptionsPropertyOptions(PropertyOptions value) {
        return new JAXBElement<PropertyOptions>(_PreviewRouteOptionsPropertyOptions_QNAME, PropertyOptions.class, RetrieveRoutesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteRetrievalType_Type", scope = RetrieveRoutesOptions.class)
    public JAXBElement<String> createRetrieveRoutesOptionsRouteRetrievalTypeType(String value) {
        return new JAXBElement<String>(_RetrieveRoutesOptionsRouteRetrievalTypeType_QNAME, String.class, RetrieveRoutesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnplannedOriginParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UnplannedOriginParameters", scope = RetrieveRoutesOptions.class)
    public JAXBElement<UnplannedOriginParameters> createRetrieveRoutesOptionsUnplannedOriginParameters(UnplannedOriginParameters value) {
        return new JAXBElement<UnplannedOriginParameters>(_UnplannedOriginParameters_QNAME, UnplannedOriginParameters.class, RetrieveRoutesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkerDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "WorkerList", scope = RetrieveRoutesOptions.class)
    public JAXBElement<ArrayOfWorkerDescriptor> createRetrieveRoutesOptionsWorkerList(ArrayOfWorkerDescriptor value) {
        return new JAXBElement<ArrayOfWorkerDescriptor>(_RetrieveRoutesOptionsWorkerList_QNAME, ArrayOfWorkerDescriptor.class, RetrieveRoutesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EquipmentList", scope = LoadRouteOptions.class)
    public JAXBElement<ArrayOfEquipmentDescriptor> createLoadRouteOptionsEquipmentList(ArrayOfEquipmentDescriptor value) {
        return new JAXBElement<ArrayOfEquipmentDescriptor>(_RetrieveRoutesOptionsEquipmentList_QNAME, ArrayOfEquipmentDescriptor.class, LoadRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PropertyOptions", scope = LoadRouteOptions.class)
    public JAXBElement<PropertyOptions> createLoadRouteOptionsPropertyOptions(PropertyOptions value) {
        return new JAXBElement<PropertyOptions>(_PreviewRouteOptionsPropertyOptions_QNAME, PropertyOptions.class, LoadRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteDescriptor", scope = LoadRouteOptions.class)
    public JAXBElement<RouteDescriptor> createLoadRouteOptionsRouteDescriptor(RouteDescriptor value) {
        return new JAXBElement<RouteDescriptor>(_RouteDescriptor_QNAME, RouteDescriptor.class, LoadRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteInstance", scope = LoadRouteOptions.class)
    public JAXBElement<DomainInstance> createLoadRouteOptionsRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_LockOrderResultsLockOrdersForRouteFailureRouteInstance_QNAME, DomainInstance.class, LoadRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnplannedOriginParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UnplannedOriginLocation", scope = LoadRouteOptions.class)
    public JAXBElement<UnplannedOriginParameters> createLoadRouteOptionsUnplannedOriginLocation(UnplannedOriginParameters value) {
        return new JAXBElement<UnplannedOriginParameters>(_LoadRouteOptionsUnplannedOriginLocation_QNAME, UnplannedOriginParameters.class, LoadRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkerDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "WorkerList", scope = LoadRouteOptions.class)
    public JAXBElement<ArrayOfWorkerDescriptor> createLoadRouteOptionsWorkerList(ArrayOfWorkerDescriptor value) {
        return new JAXBElement<ArrayOfWorkerDescriptor>(_RetrieveRoutesOptionsWorkerList_QNAME, ArrayOfWorkerDescriptor.class, LoadRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLockOrderResultsLockOrderFailure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Failures", scope = LockOrderResults.class)
    public JAXBElement<ArrayOfLockOrderResultsLockOrderFailure> createLockOrderResultsFailures(ArrayOfLockOrderResultsLockOrderFailure value) {
        return new JAXBElement<ArrayOfLockOrderResultsLockOrderFailure>(_LockOrderResultsFailures_QNAME, ArrayOfLockOrderResultsLockOrderFailure.class, LockOrderResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "KeepRelativeSequenceOfLockedStops", scope = LockOrderOptions.class)
    public JAXBElement<Boolean> createLockOrderOptionsKeepRelativeSequenceOfLockedStops(Boolean value) {
        return new JAXBElement<Boolean>(_LockOrderOptionsKeepRelativeSequenceOfLockedStops_QNAME, Boolean.class, LockOrderOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Import", name = "File", scope = ExportCustomFormsResult.class)
    public JAXBElement<byte[]> createExportCustomFormsResultFile(byte[] value) {
        return new JAXBElement<byte[]>(_ExportCustomFormsResultFile_QNAME, byte[].class, ExportCustomFormsResult.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Import", name = "EntityKeys", scope = ExportCustomFormsOptions.class)
    public JAXBElement<ArrayOflong> createExportCustomFormsOptionsEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ExportCustomFormsOptionsEntityKeys_QNAME, ArrayOflong.class, ExportCustomFormsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ReturnPropertyOptions", scope = CopyRouteToSessionOptions.class)
    public JAXBElement<PropertyOptions> createCopyRouteToSessionOptionsReturnPropertyOptions(PropertyOptions value) {
        return new JAXBElement<PropertyOptions>(_CopyRouteToSessionOptionsReturnPropertyOptions_QNAME, PropertyOptions.class, CopyRouteToSessionOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.PrepareForNextDay", name = "RoutingSessionDescription", scope = PrepareForNextDayJobParameters.class)
    public JAXBElement<String> createPrepareForNextDayJobParametersRoutingSessionDescription(String value) {
        return new JAXBElement<String>(_PrepareForNextDayJobParametersRoutingSessionDescription_QNAME, String.class, PrepareForNextDayJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Depot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", name = "RoutingSessionDepot", scope = SaveSessionAsJobParameters.class)
    public JAXBElement<Depot> createSaveSessionAsJobParametersRoutingSessionDepot(Depot value) {
        return new JAXBElement<Depot>(_SaveSessionAsJobParametersRoutingSessionDepot_QNAME, Depot.class, SaveSessionAsJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", name = "RoutingSessionDescription", scope = SaveSessionAsJobParameters.class)
    public JAXBElement<String> createSaveSessionAsJobParametersRoutingSessionDescription(String value) {
        return new JAXBElement<String>(_SaveSessionAsJobParametersRoutingSessionDescription_QNAME, String.class, SaveSessionAsJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", name = "RoutingSessionStartDate", scope = SaveSessionAsJobParameters.class)
    public JAXBElement<XMLGregorianCalendar> createSaveSessionAsJobParametersRoutingSessionStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SaveSessionAsJobParametersRoutingSessionStartDate_QNAME, XMLGregorianCalendar.class, SaveSessionAsJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteStrategicRoutingSession", name = "SessionEntityKeys", scope = DeleteStrategicRoutingSessionJobParameters.class)
    public JAXBElement<ArrayOflong> createDeleteStrategicRoutingSessionJobParametersSessionEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_DeleteStrategicRoutingSessionJobParametersSessionEntityKeys_QNAME, ArrayOflong.class, DeleteStrategicRoutingSessionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", name = "DestinationStrategicSessionEntityKeys", scope = TransferRecurringOrdersParameters.class)
    public JAXBElement<ArrayOflong> createTransferRecurringOrdersParametersDestinationStrategicSessionEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_TransferRecurringOrdersParametersDestinationStrategicSessionEntityKeys_QNAME, ArrayOflong.class, TransferRecurringOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", name = "RecurringOrderEntityKeys", scope = TransferRecurringOrdersParameters.class)
    public JAXBElement<ArrayOflong> createTransferRecurringOrdersParametersRecurringOrderEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_TransferRecurringOrdersParametersRecurringOrderEntityKeys_QNAME, ArrayOflong.class, TransferRecurringOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", name = "SetAssignDays", scope = TransferRecurringOrdersParameters.class)
    public JAXBElement<Boolean> createTransferRecurringOrdersParametersSetAssignDays(Boolean value) {
        return new JAXBElement<Boolean>(_TransferRecurringOrdersParametersSetAssignDays_QNAME, Boolean.class, TransferRecurringOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", name = "TerritoryEntityKeys", scope = TransferRecurringOrdersParameters.class)
    public JAXBElement<ArrayOflong> createTransferRecurringOrdersParametersTerritoryEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_TransferRecurringOrdersParametersTerritoryEntityKeys_QNAME, ArrayOflong.class, TransferRecurringOrdersParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayShiftOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ShiftDays", name = "Options", scope = ShiftDaysJobParameters.class)
    public JAXBElement<DayShiftOptions> createShiftDaysJobParametersOptions(DayShiftOptions value) {
        return new JAXBElement<DayShiftOptions>(_ShiftDaysJobParametersOptions_QNAME, DayShiftOptions.class, ShiftDaysJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ShiftDays", name = "RecurringOrders", scope = ShiftDaysJobParameters.class)
    public JAXBElement<ArrayOfDomainInstance> createShiftDaysJobParametersRecurringOrders(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_ShiftDaysJobParametersRecurringOrders_QNAME, ArrayOfDomainInstance.class, ShiftDaysJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.UpdateDailyRoutes", name = "RouteKeys", scope = UpdateDailyRoutesJobParameters.class)
    public JAXBElement<ArrayOflong> createUpdateDailyRoutesJobParametersRouteKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_UpdateDailyRoutesJobParametersRouteKeys_QNAME, ArrayOflong.class, UpdateDailyRoutesJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.UpdateDailyRoutes", name = "SessionDescription", scope = UpdateDailyRoutesJobParameters.class)
    public JAXBElement<String> createUpdateDailyRoutesJobParametersSessionDescription(String value) {
        return new JAXBElement<String>(_UpdateDailyRoutesJobParametersSessionDescription_QNAME, String.class, UpdateDailyRoutesJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RecurringOrder", scope = SwitchRecurringOrderServicePatternParameters.class)
    public JAXBElement<DomainInstance> createSwitchRecurringOrderServicePatternParametersRecurringOrder(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SwitchRecurringOrderServicePatternParametersRecurringOrder_QNAME, DomainInstance.class, SwitchRecurringOrderServicePatternParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManipulationResultManipulationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Errors", scope = ManipulationResult.class)
    public JAXBElement<ArrayOfManipulationResultManipulationError> createManipulationResultErrors(ArrayOfManipulationResultManipulationError value) {
        return new JAXBElement<ArrayOfManipulationResultManipulationError>(_SendOrdersResultsErrors_QNAME, ArrayOfManipulationResultManipulationError.class, ManipulationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteConstraintFlags_ConstraintsEncountered", scope = ManipulationResult.class)
    public JAXBElement<String> createManipulationResultRouteConstraintFlagsConstraintsEncountered(String value) {
        return new JAXBElement<String>(_ManipulationResultRouteConstraintFlagsConstraintsEncountered_QNAME, String.class, ManipulationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Routes", scope = ManipulationResult.class)
    public JAXBElement<ArrayOfRoute> createManipulationResultRoutes(ArrayOfRoute value) {
        return new JAXBElement<ArrayOfRoute>(_SendOrdersParametersRoutes_QNAME, ArrayOfRoute.class, ManipulationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecurringOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RecurringOrders", scope = RecurringOrderManipulationResult.class)
    public JAXBElement<ArrayOfRecurringOrder> createRecurringOrderManipulationResultRecurringOrders(ArrayOfRecurringOrder value) {
        return new JAXBElement<ArrayOfRecurringOrder>(_RecurringOrderManipulationResultRecurringOrders_QNAME, ArrayOfRecurringOrder.class, RecurringOrderManipulationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTerritory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Territories", scope = RecurringOrderManipulationResult.class)
    public JAXBElement<ArrayOfTerritory> createRecurringOrderManipulationResultTerritories(ArrayOfTerritory value) {
        return new JAXBElement<ArrayOfTerritory>(_RecurringOrderManipulationResultTerritories_QNAME, ArrayOfTerritory.class, RecurringOrderManipulationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteStopInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Stops", scope = MoveStrategicStopsParameters.class)
    public JAXBElement<ArrayOfRouteStopInstances> createMoveStrategicStopsParametersStops(ArrayOfRouteStopInstances value) {
        return new JAXBElement<ArrayOfRouteStopInstances>(_ResequencePendingStopsActionStops_QNAME, ArrayOfRouteStopInstances.class, MoveStrategicStopsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RoutingSessionEntityKey", scope = BuildSameDayMatricesOptions.class)
    public JAXBElement<Long> createBuildSameDayMatricesOptionsRoutingSessionEntityKey(Long value) {
        return new JAXBElement<Long>(_BuildSameDayMatricesOptionsRoutingSessionEntityKey_QNAME, Long.class, BuildSameDayMatricesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ActiveWeeks", scope = ExportPlanningSolutionJobParameters.class)
    public JAXBElement<ArrayOfint> createExportPlanningSolutionJobParametersActiveWeeks(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ExportPlanningSolutionJobParametersActiveWeeks_QNAME, ArrayOfint.class, ExportPlanningSolutionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ExportPlanningSolutionDaysOutputFormat_DaysOutputFormat", scope = ExportPlanningSolutionJobParameters.class)
    public JAXBElement<String> createExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormatDaysOutputFormat(String value) {
        return new JAXBElement<String>(_ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormatDaysOutputFormat_QNAME, String.class, ExportPlanningSolutionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ExportPlanningSolutionTimeZoneOption_TimeZoneOption", scope = ExportPlanningSolutionJobParameters.class)
    public JAXBElement<String> createExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOptionTimeZoneOption(String value) {
        return new JAXBElement<String>(_ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOptionTimeZoneOption_QNAME, String.class, ExportPlanningSolutionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ExportPlanningSolutionWeeksOutputFormat_WeeksOutputFormat", scope = ExportPlanningSolutionJobParameters.class)
    public JAXBElement<String> createExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormatWeeksOutputFormat(String value) {
        return new JAXBElement<String>(_ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormatWeeksOutputFormat_QNAME, String.class, ExportPlanningSolutionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "LatLongPercision", scope = ExportPlanningSolutionJobParameters.class)
    public JAXBElement<Integer> createExportPlanningSolutionJobParametersLatLongPercision(Integer value) {
        return new JAXBElement<Integer>(_ExportPlanningSolutionJobParametersLatLongPercision_QNAME, Integer.class, ExportPlanningSolutionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategicRoutingSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PlanningSession", scope = ExportPlanningSolutionJobParameters.class)
    public JAXBElement<StrategicRoutingSession> createExportPlanningSolutionJobParametersPlanningSession(StrategicRoutingSession value) {
        return new JAXBElement<StrategicRoutingSession>(_ExportPlanningSolutionJobParametersPlanningSession_QNAME, StrategicRoutingSession.class, ExportPlanningSolutionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopNumberFormat_AssignStopNumbersBy", scope = ExportPlanningSolutionJobParameters.class)
    public JAXBElement<String> createExportPlanningSolutionJobParametersStopNumberFormatAssignStopNumbersBy(String value) {
        return new JAXBElement<String>(_SendOrdersParametersStopNumberFormatAssignStopNumbersBy_QNAME, String.class, ExportPlanningSolutionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityExportTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Template", scope = ExportPlanningSolutionJobParameters.class)
    public JAXBElement<EntityExportTemplate> createExportPlanningSolutionJobParametersTemplate(EntityExportTemplate value) {
        return new JAXBElement<EntityExportTemplate>(_SendOrdersParametersTemplate_QNAME, EntityExportTemplate.class, ExportPlanningSolutionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Territories", scope = ExportPlanningSolutionJobParameters.class)
    public JAXBElement<ArrayOflong> createExportPlanningSolutionJobParametersTerritories(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RecurringOrderManipulationResultTerritories_QNAME, ArrayOflong.class, ExportPlanningSolutionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "VariableServiceTimeFormat_ServiceTimeFormat", scope = ExportPlanningSolutionJobParameters.class)
    public JAXBElement<String> createExportPlanningSolutionJobParametersVariableServiceTimeFormatServiceTimeFormat(String value) {
        return new JAXBElement<String>(_SendOrdersParametersVariableServiceTimeFormatServiceTimeFormat_QNAME, String.class, ExportPlanningSolutionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "WorldTimeZone_TimeZone", scope = ExportPlanningSolutionJobParameters.class)
    public JAXBElement<String> createExportPlanningSolutionJobParametersWorldTimeZoneTimeZone(String value) {
        return new JAXBElement<String>(_SendOrdersParametersWorldTimeZoneTimeZone_QNAME, String.class, ExportPlanningSolutionJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteTerritories", name = "TerritoryKeys", scope = DeleteTerritoriesJobParameters.class)
    public JAXBElement<ArrayOflong> createDeleteTerritoriesJobParametersTerritoryKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_DeleteTerritoriesJobParametersTerritoryKeys_QNAME, ArrayOflong.class, DeleteTerritoriesJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Error", scope = SaveTerritoryResult.class)
    public JAXBElement<SaveErrorInfo> createSaveTerritoryResultError(SaveErrorInfo value) {
        return new JAXBElement<SaveErrorInfo>(_SaveRouteTemplateFromRouteResultError_QNAME, SaveErrorInfo.class, SaveTerritoryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveOptions", scope = SaveOrderOptions.class)
    public JAXBElement<SaveOptions> createSaveOrderOptionsSaveOptions(SaveOptions value) {
        return new JAXBElement<SaveOptions>(_SaveOrderOptionsSaveOptions_QNAME, SaveOptions.class, SaveOrderOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.CalculateOptimal", name = "RouteInstances", scope = CalculateOptimalRouteMetricsParameters.class)
    public JAXBElement<ArrayOfDomainInstance> createCalculateOptimalRouteMetricsParametersRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_CalculateOptimalRouteMetricsParametersRouteInstances_QNAME, ArrayOfDomainInstance.class, CalculateOptimalRouteMetricsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DistanceToDestination", scope = RouteActuals.class)
    public JAXBElement<Distance> createRouteActualsDistanceToDestination(Distance value) {
        return new JAXBElement<Distance>(_CompleteRouteActionDistanceToDestination_QNAME, Distance.class, RouteActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStopActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Stops", scope = RouteActuals.class)
    public JAXBElement<ArrayOfStopActuals> createRouteActualsStops(ArrayOfStopActuals value) {
        return new JAXBElement<ArrayOfStopActuals>(_ResequencePendingStopsActionStops_QNAME, ArrayOfStopActuals.class, RouteActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStopOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RemoveStopOptions", scope = AutoCompleteRouteOptions.class)
    public JAXBElement<RemoveStopOptions> createAutoCompleteRouteOptionsRemoveStopOptions(RemoveStopOptions value) {
        return new JAXBElement<RemoveStopOptions>(_RemoveStopOptions_QNAME, RemoveStopOptions.class, AutoCompleteRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Expression", scope = CalculateRoutesArgs.class)
    public JAXBElement<SimpleExpressionBase> createCalculateRoutesArgsExpression(SimpleExpressionBase value) {
        return new JAXBElement<SimpleExpressionBase>(_SendOrdersParametersExpression_QNAME, SimpleExpressionBase.class, CalculateRoutesArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteInstances", scope = CalculateRoutesArgs.class)
    public JAXBElement<ArrayOfDomainInstance> createCalculateRoutesArgsRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_SaveRouteTemplateFromRouteArgsRouteInstances_QNAME, ArrayOfDomainInstance.class, CalculateRoutesArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SessionEntityKey", scope = CalculateRoutesArgs.class)
    public JAXBElement<Long> createCalculateRoutesArgsSessionEntityKey(Long value) {
        return new JAXBElement<Long>(_CalculateRoutesArgsSessionEntityKey_QNAME, Long.class, CalculateRoutesArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Errors", scope = CreateCellsFromRoutesResult.class)
    public JAXBElement<ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError> createCreateCellsFromRoutesResultErrors(ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError value) {
        return new JAXBElement<ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError>(_SendOrdersResultsErrors_QNAME, ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError.class, CreateCellsFromRoutesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SavedCellSet", scope = CreateCellsFromRoutesResult.class)
    public JAXBElement<CellSet> createCreateCellsFromRoutesResultSavedCellSet(CellSet value) {
        return new JAXBElement<CellSet>(_CreateCellsFromRoutesResultSavedCellSet_QNAME, CellSet.class, CreateCellsFromRoutesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SavedCells", scope = CreateCellsFromRoutesResult.class)
    public JAXBElement<ArrayOfCell> createCreateCellsFromRoutesResultSavedCells(ArrayOfCell value) {
        return new JAXBElement<ArrayOfCell>(_CreateCellsFromRoutesResultSavedCells_QNAME, ArrayOfCell.class, CreateCellsFromRoutesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "NewCellSetID", scope = CreateCellsFromRoutesOptions.class)
    public JAXBElement<String> createCreateCellsFromRoutesOptionsNewCellSetID(String value) {
        return new JAXBElement<String>(_CreateCellsFromRoutesOptionsNewCellSetID_QNAME, String.class, CreateCellsFromRoutesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSuggestLayoverResultSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Suggestions", scope = SuggestLayoverResult.class)
    public JAXBElement<ArrayOfSuggestLayoverResultSuggestion> createSuggestLayoverResultSuggestions(ArrayOfSuggestLayoverResultSuggestion value) {
        return new JAXBElement<ArrayOfSuggestLayoverResultSuggestion>(_SuggestRouteTemplateResultSuggestions_QNAME, ArrayOfSuggestLayoverResultSuggestion.class, SuggestLayoverResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "AdditionalLayoverLocationEntityKeys", scope = SuggestLayoverOptions.class)
    public JAXBElement<ArrayOflong> createSuggestLayoverOptionsAdditionalLayoverLocationEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SuggestLayoverTemplateOptionsAdditionalLayoverLocationEntityKeys_QNAME, ArrayOflong.class, SuggestLayoverOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayoverDeparture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "DepartureType", scope = SuggestLayoverOptions.class)
    public JAXBElement<LayoverDeparture> createSuggestLayoverOptionsDepartureType(LayoverDeparture value) {
        return new JAXBElement<LayoverDeparture>(_SuggestLayoverTemplateOptionsDepartureType_QNAME, LayoverDeparture.class, SuggestLayoverOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Placement", scope = SuggestLayoverOptions.class)
    public JAXBElement<Placement> createSuggestLayoverOptionsPlacement(Placement value) {
        return new JAXBElement<Placement>(_Placement_QNAME, Placement.class, SuggestLayoverOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Error", scope = SaveRouteResult.class)
    public JAXBElement<SaveErrorInfo> createSaveRouteResultError(SaveErrorInfo value) {
        return new JAXBElement<SaveErrorInfo>(_SaveRouteTemplateFromRouteResultError_QNAME, SaveErrorInfo.class, SaveRouteResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DeleteRoutes", name = "RouteKeys", scope = DeleteRoutesJobParameters.class)
    public JAXBElement<ArrayOflong> createDeleteRoutesJobParametersRouteKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_DeleteRoutesJobParametersRouteKeys_QNAME, ArrayOflong.class, DeleteRoutesJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StopCancelReasonCodeEntityKey", scope = RemoveStopOptions.class)
    public JAXBElement<Long> createRemoveStopOptionsStopCancelReasonCodeEntityKey(Long value) {
        return new JAXBElement<Long>(_RemoveStopOptionsStopCancelReasonCodeEntityKey_QNAME, Long.class, RemoveStopOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "IgnoreFlags_RouteExceptionsToIgnore", scope = SequenceOptions.class)
    public JAXBElement<String> createSequenceOptionsIgnoreFlagsRouteExceptionsToIgnore(String value) {
        return new JAXBElement<String>(_SequenceOptionsIgnoreFlagsRouteExceptionsToIgnore_QNAME, String.class, SequenceOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "SequencingGoal_Goal", scope = SequenceOptions.class)
    public JAXBElement<String> createSequenceOptionsSequencingGoalGoal(String value) {
        return new JAXBElement<String>(_SequenceOptionsSequencingGoalGoal_QNAME, String.class, SequenceOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteConstraintFlags_ConstraintsEncountered", scope = OptimizeResult.class)
    public JAXBElement<String> createOptimizeResultRouteConstraintFlagsConstraintsEncountered(String value) {
        return new JAXBElement<String>(_ManipulationResultRouteConstraintFlagsConstraintsEncountered_QNAME, String.class, OptimizeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteResults", scope = OptimizeResult.class)
    public JAXBElement<ArrayOfRouteResult> createOptimizeResultRouteResults(ArrayOfRouteResult value) {
        return new JAXBElement<ArrayOfRouteResult>(_OptimizeResultRouteResults_QNAME, ArrayOfRouteResult.class, OptimizeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "IgnoreFlags_RouteExceptionsToIgnore", scope = OptimizeOptions.class)
    public JAXBElement<String> createOptimizeOptionsIgnoreFlagsRouteExceptionsToIgnore(String value) {
        return new JAXBElement<String>(_SequenceOptionsIgnoreFlagsRouteExceptionsToIgnore_QNAME, String.class, OptimizeOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "OptimizingGoal_Goal", scope = OptimizeOptions.class)
    public JAXBElement<String> createOptimizeOptionsOptimizingGoalGoal(String value) {
        return new JAXBElement<String>(_OptimizeOptionsOptimizingGoalGoal_QNAME, String.class, OptimizeOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteStopInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Stops", scope = MoveToRouteParameters.class)
    public JAXBElement<ArrayOfRouteStopInstances> createMoveToRouteParametersStops(ArrayOfRouteStopInstances value) {
        return new JAXBElement<ArrayOfRouteStopInstances>(_ResequencePendingStopsActionStops_QNAME, ArrayOfRouteStopInstances.class, MoveToRouteParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UnassignedOrderGroups", scope = MoveToRouteParameters.class)
    public JAXBElement<ArrayOfDomainInstance> createMoveToRouteParametersUnassignedOrderGroups(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_MoveToRouteParametersUnassignedOrderGroups_QNAME, ArrayOfDomainInstance.class, MoveToRouteParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", name = "PropertyOptions", scope = RouteRetrievalOptions.class)
    public JAXBElement<RoutePropertyOptions> createRouteRetrievalOptionsPropertyOptions(RoutePropertyOptions value) {
        return new JAXBElement<RoutePropertyOptions>(_RouteRetrievalOptionsPropertyOptions_QNAME, RoutePropertyOptions.class, RouteRetrievalOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteTenderReasonCodeEntityKey", scope = UpdateRouteTenderOptions.class)
    public JAXBElement<Long> createUpdateRouteTenderOptionsRouteTenderReasonCodeEntityKey(Long value) {
        return new JAXBElement<Long>(_UpdateRouteTenderOptionsRouteTenderReasonCodeEntityKey_QNAME, Long.class, UpdateRouteTenderOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSettingsPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "PropertyOptions", scope = UpdateUserSettingsParameters.class)
    public JAXBElement<UserSettingsPropertyOptions> createUpdateUserSettingsParametersPropertyOptions(UserSettingsPropertyOptions value) {
        return new JAXBElement<UserSettingsPropertyOptions>(_PreviewRouteOptionsPropertyOptions_QNAME, UserSettingsPropertyOptions.class, UpdateUserSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "UserSettings", scope = UpdateUserSettingsParameters.class)
    public JAXBElement<UserSettings> createUpdateUserSettingsParametersUserSettings(UserSettings value) {
        return new JAXBElement<UserSettings>(_UpdateUserSettingsParametersUserSettings_QNAME, UserSettings.class, UpdateUserSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EntityKeys", scope = UndeleteEntityOptions.class)
    public JAXBElement<ArrayOflong> createUndeleteEntityOptionsEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SuggestRouteTemplateCandidatesEntityKeys_QNAME, ArrayOflong.class, UndeleteEntityOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EntityType", scope = UndeleteEntityOptions.class)
    public JAXBElement<String> createUndeleteEntityOptionsEntityType(String value) {
        return new JAXBElement<String>(_UndeleteEntityOptionsEntityType_QNAME, String.class, UndeleteEntityOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ReturnPropertyOptions", scope = UpdateRouteFromPointsArgs.class)
    public JAXBElement<PropertyOptions> createUpdateRouteFromPointsArgsReturnPropertyOptions(PropertyOptions value) {
        return new JAXBElement<PropertyOptions>(_CopyRouteToSessionOptionsReturnPropertyOptions_QNAME, PropertyOptions.class, UpdateRouteFromPointsArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveStopFromPointArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveStopFromPointArgsList", scope = UpdateRouteFromPointsArgs.class)
    public JAXBElement<ArrayOfSaveStopFromPointArgs> createUpdateRouteFromPointsArgsSaveStopFromPointArgsList(ArrayOfSaveStopFromPointArgs value) {
        return new JAXBElement<ArrayOfSaveStopFromPointArgs>(_UpdateRouteFromPointsArgsSaveStopFromPointArgsList_QNAME, ArrayOfSaveStopFromPointArgs.class, UpdateRouteFromPointsArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "OriginCoordinate", scope = CreateRouteFromPointsArgs.class)
    public JAXBElement<Coordinate> createCreateRouteFromPointsArgsOriginCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_StartWorkActionOriginCoordinate_QNAME, Coordinate.class, CreateRouteFromPointsArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ReturnPropertyOptions", scope = CreateRouteFromPointsArgs.class)
    public JAXBElement<PropertyOptions> createCreateRouteFromPointsArgsReturnPropertyOptions(PropertyOptions value) {
        return new JAXBElement<PropertyOptions>(_CopyRouteToSessionOptionsReturnPropertyOptions_QNAME, PropertyOptions.class, CreateRouteFromPointsArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteDescription", scope = CreateRouteFromPointsArgs.class)
    public JAXBElement<String> createCreateRouteFromPointsArgsRouteDescription(String value) {
        return new JAXBElement<String>(_CreateRouteFromPointsArgsRouteDescription_QNAME, String.class, CreateRouteFromPointsArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "RouteIdentifier", scope = CreateRouteFromPointsArgs.class)
    public JAXBElement<String> createCreateRouteFromPointsArgsRouteIdentifier(String value) {
        return new JAXBElement<String>(_CreateRouteFromPointsArgsRouteIdentifier_QNAME, String.class, CreateRouteFromPointsArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveStopFromPointArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "SaveStopFromPointArgsList", scope = CreateRouteFromPointsArgs.class)
    public JAXBElement<ArrayOfSaveStopFromPointArgs> createCreateRouteFromPointsArgsSaveStopFromPointArgsList(ArrayOfSaveStopFromPointArgs value) {
        return new JAXBElement<ArrayOfSaveStopFromPointArgs>(_UpdateRouteFromPointsArgsSaveStopFromPointArgsList_QNAME, ArrayOfSaveStopFromPointArgs.class, CreateRouteFromPointsArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "ReturnPropertyOptions", scope = SaveRoutePlanOptions.class)
    public JAXBElement<PropertyOptions> createSaveRoutePlanOptionsReturnPropertyOptions(PropertyOptions value) {
        return new JAXBElement<PropertyOptions>(_CopyRouteToSessionOptionsReturnPropertyOptions_QNAME, PropertyOptions.class, SaveRoutePlanOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Description", scope = SaveRoutePlanRouteArgs.class)
    public JAXBElement<String> createSaveRoutePlanRouteArgsDescription(String value) {
        return new JAXBElement<String>(_SaveRouteTemplateArgsDescription_QNAME, String.class, SaveRoutePlanRouteArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EquipmentEntityKeys", scope = SaveRoutePlanRouteArgs.class)
    public JAXBElement<ArrayOflong> createSaveRoutePlanRouteArgsEquipmentEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SaveRoutePlanRouteArgsEquipmentEntityKeys_QNAME, ArrayOflong.class, SaveRoutePlanRouteArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "EquipmentIdentifiers", scope = SaveRoutePlanRouteArgs.class)
    public JAXBElement<ArrayOfstring> createSaveRoutePlanRouteArgsEquipmentIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SaveRoutePlanRouteArgsEquipmentIdentifiers_QNAME, ArrayOfstring.class, SaveRoutePlanRouteArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Identifier", scope = SaveRoutePlanRouteArgs.class)
    public JAXBElement<String> createSaveRoutePlanRouteArgsIdentifier(String value) {
        return new JAXBElement<String>(_CreateCellsFromRoutesResultCreateCellsFromRoutesErrorIdentifier_QNAME, String.class, SaveRoutePlanRouteArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Route", scope = SaveRoutePlanRouteArgs.class)
    public JAXBElement<DomainInstance> createSaveRoutePlanRouteArgsRoute(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SaveRoutePlanRouteArgsRoute_QNAME, DomainInstance.class, SaveRoutePlanRouteArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "StartTime", scope = SaveRoutePlanRouteArgs.class)
    public JAXBElement<XMLGregorianCalendar> createSaveRoutePlanRouteArgsStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartRouteActionStartTime_QNAME, XMLGregorianCalendar.class, SaveRoutePlanRouteArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRoutePlanStopArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "Stops", scope = SaveRoutePlanRouteArgs.class)
    public JAXBElement<ArrayOfSaveRoutePlanStopArgs> createSaveRoutePlanRouteArgsStops(ArrayOfSaveRoutePlanStopArgs value) {
        return new JAXBElement<ArrayOfSaveRoutePlanStopArgs>(_ResequencePendingStopsActionStops_QNAME, ArrayOfSaveRoutePlanStopArgs.class, SaveRoutePlanRouteArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", name = "WorkerIdentifiers", scope = SaveRoutePlanRouteArgs.class)
    public JAXBElement<ArrayOfstring> createSaveRoutePlanRouteArgsWorkerIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SaveRoutePlanRouteArgsWorkerIdentifiers_QNAME, ArrayOfstring.class, SaveRoutePlanRouteArgs.class, value);
    }

}
