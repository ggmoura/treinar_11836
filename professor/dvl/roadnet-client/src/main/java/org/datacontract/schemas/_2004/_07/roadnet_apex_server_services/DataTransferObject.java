
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ActiveAlertRecipientTypeAdditionalField;
import com.roadnet.apex.datacontracts.AlertOption;
import com.roadnet.apex.datacontracts.AlternativeDeliveryVehicle;
import com.roadnet.apex.datacontracts.Angle;
import com.roadnet.apex.datacontracts.AttachCustomerResult;
import com.roadnet.apex.datacontracts.BatteryState;
import com.roadnet.apex.datacontracts.BusinessUnitActiveAlertSettings;
import com.roadnet.apex.datacontracts.BusinessUnitDefaultSettings;
import com.roadnet.apex.datacontracts.BusinessUnitExternalDataFeedSettings;
import com.roadnet.apex.datacontracts.BusinessUnitMessagingProviderSettings;
import com.roadnet.apex.datacontracts.BusinessUnitOmnitracsOneSettings;
import com.roadnet.apex.datacontracts.CalculateCreateTerritoriesTargetsParameters;
import com.roadnet.apex.datacontracts.CalculateOptimalRouteMetricsResult;
import com.roadnet.apex.datacontracts.CalculateOptimalRouteMetricsResultCalculateOptimalResult;
import com.roadnet.apex.datacontracts.ClientStatistics;
import com.roadnet.apex.datacontracts.ComplianceAlertParameter;
import com.roadnet.apex.datacontracts.CompliancePermissions;
import com.roadnet.apex.datacontracts.CompliancePermissionsDvirPermissions;
import com.roadnet.apex.datacontracts.CompliancePermissionsHosPermissions;
import com.roadnet.apex.datacontracts.CompliancePermissionsIftaPermissions;
import com.roadnet.apex.datacontracts.CompliancePermissionsMiscPermissions;
import com.roadnet.apex.datacontracts.CompositeEntityIdentity;
import com.roadnet.apex.datacontracts.CompositeSearchResult;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.CorrespondenceSenderStatus;
import com.roadnet.apex.datacontracts.CorrespondenceView;
import com.roadnet.apex.datacontracts.Correspondent;
import com.roadnet.apex.datacontracts.Country;
import com.roadnet.apex.datacontracts.CreateCustomerResult;
import com.roadnet.apex.datacontracts.CreateDatabaseResult;
import com.roadnet.apex.datacontracts.CreateRouteArgs;
import com.roadnet.apex.datacontracts.CreateRoutesResult;
import com.roadnet.apex.datacontracts.CreateRoutesResultCreateRouteResult;
import com.roadnet.apex.datacontracts.CreateRoutesResultCreateRouteResultCreateRouteErrors;
import com.roadnet.apex.datacontracts.CreateTerritoriesParameters;
import com.roadnet.apex.datacontracts.CreateTerritoriesResult;
import com.roadnet.apex.datacontracts.CreateTerritoriesTargetValues;
import com.roadnet.apex.datacontracts.CustomFormAssignment;
import com.roadnet.apex.datacontracts.CustomFormAssignmentResult;
import com.roadnet.apex.datacontracts.CustomFormInfo;
import com.roadnet.apex.datacontracts.DVIRResult;
import com.roadnet.apex.datacontracts.DailyPassAttributes;
import com.roadnet.apex.datacontracts.DailyRoutingGoals;
import com.roadnet.apex.datacontracts.DailyStopPosition;
import com.roadnet.apex.datacontracts.DeleteBusinessUnitResult;
import com.roadnet.apex.datacontracts.DeleteRegionResult;
import com.roadnet.apex.datacontracts.DeleteRouteDetail;
import com.roadnet.apex.datacontracts.DeleteRoutesResult;
import com.roadnet.apex.datacontracts.DeleteStrategicRoutingSessionDetail;
import com.roadnet.apex.datacontracts.DeleteStrategicRoutingSessionResult;
import com.roadnet.apex.datacontracts.DeleteTerritoriesResult;
import com.roadnet.apex.datacontracts.DeleteTerritoriesResultError;
import com.roadnet.apex.datacontracts.DepotEquipmentTypeQuantity;
import com.roadnet.apex.datacontracts.DiagnosticTroubleCodeCriteria;
import com.roadnet.apex.datacontracts.DiagnosticTroubleCodeLibrary;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.DistanceCost;
import com.roadnet.apex.datacontracts.DomainInstance;
import com.roadnet.apex.datacontracts.EquipmentDataHistory;
import com.roadnet.apex.datacontracts.EquipmentDataHistoryResult;
import com.roadnet.apex.datacontracts.EquipmentDataPoint;
import com.roadnet.apex.datacontracts.EquipmentDescriptor;
import com.roadnet.apex.datacontracts.EquipmentInformation;
import com.roadnet.apex.datacontracts.EquipmentInspection;
import com.roadnet.apex.datacontracts.EquipmentOverview;
import com.roadnet.apex.datacontracts.EquipmentPositionHistoryResult;
import com.roadnet.apex.datacontracts.EquipmentStatus;
import com.roadnet.apex.datacontracts.EquipmentStatusWorkerDetail;
import com.roadnet.apex.datacontracts.EquipmentTypeRestriction;
import com.roadnet.apex.datacontracts.ExecuteReportGroupParameters;
import com.roadnet.apex.datacontracts.ExecuteReportParameters;
import com.roadnet.apex.datacontracts.ExecuteReportResult;
import com.roadnet.apex.datacontracts.ExecuteScorecardParameters;
import com.roadnet.apex.datacontracts.ExportPlanningSolutionPropertyResult;
import com.roadnet.apex.datacontracts.ExportPlanningSolutionResult;
import com.roadnet.apex.datacontracts.FacilityEndpointInfo;
import com.roadnet.apex.datacontracts.FormControlInfo;
import com.roadnet.apex.datacontracts.FormControlResponseValue;
import com.roadnet.apex.datacontracts.FuelEconomy;
import com.roadnet.apex.datacontracts.GeocodeCandidate;
import com.roadnet.apex.datacontracts.HarshDrivingThreshold;
import com.roadnet.apex.datacontracts.HosPrefillComment;
import com.roadnet.apex.datacontracts.HosRuleSet;
import com.roadnet.apex.datacontracts.HosRulesValidationResult;
import com.roadnet.apex.datacontracts.ImportEntityResult;
import com.roadnet.apex.datacontracts.ImportOBD2DiagnosticCodesError;
import com.roadnet.apex.datacontracts.ImportOBD2DiagnosticCodesResult;
import com.roadnet.apex.datacontracts.ImportPropertyResult;
import com.roadnet.apex.datacontracts.ImportResult;
import com.roadnet.apex.datacontracts.ImportResultDetail;
import com.roadnet.apex.datacontracts.InitializeDataWarehouseResult;
import com.roadnet.apex.datacontracts.InspectionDefect;
import com.roadnet.apex.datacontracts.J1587FailureModeIndicator;
import com.roadnet.apex.datacontracts.J1587MessageIdentifier;
import com.roadnet.apex.datacontracts.J1587ParameterIdentifier;
import com.roadnet.apex.datacontracts.J1587SubsystemIdentifier;
import com.roadnet.apex.datacontracts.J1939FailureModeIndicator;
import com.roadnet.apex.datacontracts.J1939SourceAddress;
import com.roadnet.apex.datacontracts.J1939SuspectParameterNumber;
import com.roadnet.apex.datacontracts.Jurisdiction;
import com.roadnet.apex.datacontracts.LayoverDeparture;
import com.roadnet.apex.datacontracts.Length;
import com.roadnet.apex.datacontracts.LiquidVolume;
import com.roadnet.apex.datacontracts.MeasurementOptions;
import com.roadnet.apex.datacontracts.MobileDeviceStatus;
import com.roadnet.apex.datacontracts.MoveResourcesToRegionResult;
import com.roadnet.apex.datacontracts.MoveUnassignedOrderToSessionFailure;
import com.roadnet.apex.datacontracts.MoveUnassignedOrdersToSessionResult;
import com.roadnet.apex.datacontracts.MultiDayRoutingOptions;
import com.roadnet.apex.datacontracts.NamedPlace;
import com.roadnet.apex.datacontracts.NavRecalculationCalculatorOptions;
import com.roadnet.apex.datacontracts.NavRecalculationVehicleOptions;
import com.roadnet.apex.datacontracts.NetworkDataStoreEntity;
import com.roadnet.apex.datacontracts.NetworkDateTimePeriod;
import com.roadnet.apex.datacontracts.NetworkPenalizedTurn;
import com.roadnet.apex.datacontracts.NetworkStreet;
import com.roadnet.apex.datacontracts.NetworkTravelModel;
import com.roadnet.apex.datacontracts.NetworkTravelRule;
import com.roadnet.apex.datacontracts.NetworkTurnRule;
import com.roadnet.apex.datacontracts.NetworkVehicleConstraint;
import com.roadnet.apex.datacontracts.NotMigratedMobileDevice;
import com.roadnet.apex.datacontracts.NotificationResult;
import com.roadnet.apex.datacontracts.OpportunityMetrics;
import com.roadnet.apex.datacontracts.OptimizeTerritoriesParameters;
import com.roadnet.apex.datacontracts.OptimizeTerritoriesResult;
import com.roadnet.apex.datacontracts.OrderBaseSpec;
import com.roadnet.apex.datacontracts.OverridableRegionProperties;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesAutoArriveDepartSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesAutonomousOptimizationSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesCombineOrdersSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesComplianceAddressSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesDVIRSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesDefaultSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesDispatchSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesHosSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesIftaSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesMobileDeviceSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesOmnitracsNavigationSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesPerformanceSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesRoutingSessionsSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesSearchSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesStationaryEventSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesStreetSideLocationTravelRules;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesTelematicsSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesTravelPathCalculatorSettings;
import com.roadnet.apex.datacontracts.OverridableRegionPropertiesVideoSettings;
import com.roadnet.apex.datacontracts.ParameterValue;
import com.roadnet.apex.datacontracts.PassAttributes;
import com.roadnet.apex.datacontracts.PasswordPolicy;
import com.roadnet.apex.datacontracts.Percent;
import com.roadnet.apex.datacontracts.PositionDataPoint;
import com.roadnet.apex.datacontracts.PositionText;
import com.roadnet.apex.datacontracts.PositionTextBuilderOptions;
import com.roadnet.apex.datacontracts.PositionTextListResult;
import com.roadnet.apex.datacontracts.PrepareForNextDayResult;
import com.roadnet.apex.datacontracts.ProductTypeRestriction;
import com.roadnet.apex.datacontracts.Quantities;
import com.roadnet.apex.datacontracts.RdcEntityMigrationResult;
import com.roadnet.apex.datacontracts.RdcMigrationResult;
import com.roadnet.apex.datacontracts.RegionAutoArriveDepartSettings;
import com.roadnet.apex.datacontracts.RegionAutonomousOptimizationSettings;
import com.roadnet.apex.datacontracts.RegionCombineOrdersSettings;
import com.roadnet.apex.datacontracts.RegionComplianceAddressSettings;
import com.roadnet.apex.datacontracts.RegionDVIRSettings;
import com.roadnet.apex.datacontracts.RegionDefaultSettings;
import com.roadnet.apex.datacontracts.RegionDispatchSettings;
import com.roadnet.apex.datacontracts.RegionHosSettings;
import com.roadnet.apex.datacontracts.RegionIftaSettings;
import com.roadnet.apex.datacontracts.RegionMobileDeviceSettings;
import com.roadnet.apex.datacontracts.RegionOmnitracsNavigationSettings;
import com.roadnet.apex.datacontracts.RegionOrganizationAddress;
import com.roadnet.apex.datacontracts.RegionPerformanceSettings;
import com.roadnet.apex.datacontracts.RegionRoutingSessionSettings;
import com.roadnet.apex.datacontracts.RegionSearchSettings;
import com.roadnet.apex.datacontracts.RegionStationaryEventSettings;
import com.roadnet.apex.datacontracts.RegionStreetSideLocationTravelRules;
import com.roadnet.apex.datacontracts.RegionTelematicsSettings;
import com.roadnet.apex.datacontracts.RegionTelematicsSettingsTelematicsProviderSettings;
import com.roadnet.apex.datacontracts.RegionTravelPathCalculatorSettings;
import com.roadnet.apex.datacontracts.RegionVideoSettings;
import com.roadnet.apex.datacontracts.RelativeDateTime;
import com.roadnet.apex.datacontracts.RelativePositionDetail;
import com.roadnet.apex.datacontracts.ReloadOptions;
import com.roadnet.apex.datacontracts.ReportCriteriaSettings;
import com.roadnet.apex.datacontracts.ReportGroupReportResult;
import com.roadnet.apex.datacontracts.ReportParameter;
import com.roadnet.apex.datacontracts.ReportParameterDefinition;
import com.roadnet.apex.datacontracts.ReportRouteCriteriaSettings;
import com.roadnet.apex.datacontracts.ReportRouteCriteriaSettingsFilter;
import com.roadnet.apex.datacontracts.RequestSalesContactInfo;
import com.roadnet.apex.datacontracts.ResetPasswordResult;
import com.roadnet.apex.datacontracts.ResourceEventList;
import com.roadnet.apex.datacontracts.RetrieveEquipmentPositionHistoryOptions;
import com.roadnet.apex.datacontracts.RetrievePositionTextResult;
import com.roadnet.apex.datacontracts.RoadnetTelematicsFirmwareVersion;
import com.roadnet.apex.datacontracts.RoadnetTelematicsScriptVersion;
import com.roadnet.apex.datacontracts.RoadnetTelematicsVbusFileVersion;
import com.roadnet.apex.datacontracts.RouteChangeNotificationChangedEntity;
import com.roadnet.apex.datacontracts.RouteChangeNotificationChangedStop;
import com.roadnet.apex.datacontracts.RouteCosts;
import com.roadnet.apex.datacontracts.RouteInformation;
import com.roadnet.apex.datacontracts.RoutePathResult;
import com.roadnet.apex.datacontracts.RoutePosition;
import com.roadnet.apex.datacontracts.RouteResult;
import com.roadnet.apex.datacontracts.RouteResultRouteDeltas;
import com.roadnet.apex.datacontracts.RouteScores;
import com.roadnet.apex.datacontracts.RoutingParameters;
import com.roadnet.apex.datacontracts.RoutingResult;
import com.roadnet.apex.datacontracts.RoutingResultNotRoutedOrderResult;
import com.roadnet.apex.datacontracts.RoutingResultPassResult;
import com.roadnet.apex.datacontracts.SaveAssignedOrderArgs;
import com.roadnet.apex.datacontracts.SaveAssignedRecurringOrderArgs;
import com.roadnet.apex.datacontracts.SaveEquipmentServiceArgs;
import com.roadnet.apex.datacontracts.SaveSessionAsResult;
import com.roadnet.apex.datacontracts.SaveStopArgs;
import com.roadnet.apex.datacontracts.Scorecard;
import com.roadnet.apex.datacontracts.ScorecardCriteriaScore;
import com.roadnet.apex.datacontracts.ScorecardScore;
import com.roadnet.apex.datacontracts.ScorecardThresholdConfiguration;
import com.roadnet.apex.datacontracts.SearchResult;
import com.roadnet.apex.datacontracts.ServiceAreaBase;
import com.roadnet.apex.datacontracts.ServicePatternAnalyzerResult;
import com.roadnet.apex.datacontracts.ServicePatternAnalyzerResultServicePatternAnalyzerSummary;
import com.roadnet.apex.datacontracts.ServiceTimeUpdateReport;
import com.roadnet.apex.datacontracts.ServiceTimeUpdateReportRecord;
import com.roadnet.apex.datacontracts.ShadowProductionResult;
import com.roadnet.apex.datacontracts.ShareableEntityAccessor;
import com.roadnet.apex.datacontracts.ShiftDaysResult;
import com.roadnet.apex.datacontracts.ShiftDaysResultShiftDaysResultItem;
import com.roadnet.apex.datacontracts.Speed;
import com.roadnet.apex.datacontracts.SpeedBracket;
import com.roadnet.apex.datacontracts.SpeedRpmMatrix;
import com.roadnet.apex.datacontracts.StopIdentity;
import com.roadnet.apex.datacontracts.StopScores;
import com.roadnet.apex.datacontracts.StrategicPassAttributes;
import com.roadnet.apex.datacontracts.StrategicRoutingGoals;
import com.roadnet.apex.datacontracts.StrategicRoutingParameters;
import com.roadnet.apex.datacontracts.StrategicRoutingResult;
import com.roadnet.apex.datacontracts.SuggestTerritoryParameters;
import com.roadnet.apex.datacontracts.SuggestTerritoryResult;
import com.roadnet.apex.datacontracts.SuggestTerritoryResultSuggestion;
import com.roadnet.apex.datacontracts.SystemInfo;
import com.roadnet.apex.datacontracts.TaskSpec;
import com.roadnet.apex.datacontracts.TelematicsDeviceInputPortInfo;
import com.roadnet.apex.datacontracts.TelematicsDeviceOutputPortInfo;
import com.roadnet.apex.datacontracts.TelematicsDeviceStatus;
import com.roadnet.apex.datacontracts.TelematicsDeviceTelematicsDeviceHardware;
import com.roadnet.apex.datacontracts.TelemetryDataPoint;
import com.roadnet.apex.datacontracts.Temperature;
import com.roadnet.apex.datacontracts.TerritoryDeltas;
import com.roadnet.apex.datacontracts.TerritoryResult;
import com.roadnet.apex.datacontracts.TransferRecurringOrderDetail;
import com.roadnet.apex.datacontracts.TransferRecurringOrdersResult;
import com.roadnet.apex.datacontracts.TransitMatrixBuildRequest;
import com.roadnet.apex.datacontracts.TransmissionGearState;
import com.roadnet.apex.datacontracts.TravelDirectionsStep;
import com.roadnet.apex.datacontracts.TravelPairPathInfoResult;
import com.roadnet.apex.datacontracts.TravelPathCalculatorOptions;
import com.roadnet.apex.datacontracts.TravelPathResult;
import com.roadnet.apex.datacontracts.TravelPointPenalty;
import com.roadnet.apex.datacontracts.TravelVehicle;
import com.roadnet.apex.datacontracts.UpdateDailyRoutesJobError;
import com.roadnet.apex.datacontracts.UpdateDailyRoutesJobResult;
import com.roadnet.apex.datacontracts.UpdatePerformedMaintenanceArgs;
import com.roadnet.apex.datacontracts.UserPolicy;
import com.roadnet.apex.datacontracts.UserSettings;
import com.roadnet.apex.datacontracts.ValidateHosRulesParameters;
import com.roadnet.apex.datacontracts.ValidationFailure;
import com.roadnet.apex.datacontracts.VerificationHistoryItem;
import com.roadnet.apex.datacontracts.Viewport;
import com.roadnet.apex.datacontracts.Weight;
import com.roadnet.apex.datacontracts.WorkerAlertAssignment;
import com.roadnet.apex.datacontracts.WorkerAlertAssignmentResult;
import com.roadnet.apex.datacontracts.WorkerCosts;
import com.roadnet.apex.datacontracts.WorkerDescriptor;
import com.roadnet.apex.datacontracts.WorkerHosStatus;
import com.roadnet.apex.datacontracts.WorkerInformation;
import com.roadnet.apex.datacontracts.WorkerMobileCredentials;
import com.roadnet.apex.datacontracts.WorkerOverview;
import com.roadnet.apex.datacontracts.XrsMigrationResult;
import com.roadnet.apex.datacontracts.XrsMigrationResultEntityResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.CustomerInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.DataRetentionPolicy;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.DeviceLookupResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.FindCustomersResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.ImportOBD2DiagnosticTroubleCodesParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.RetrieveMatrixResultsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.XrsCustomerInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.AddressCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.CalculateDistanceByJurisdictionResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.GeocodeOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.JurisdictionDistance;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.MapLocalSearchCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.MapLocalSearchResultData;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.NetworkChangedAreas;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.NetworkSplitArcInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveArcsCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveDeltaMapEditsResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveEditOperationsCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveFullMapEditsResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveGeocodeCandidateOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveNodesCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveTravelPathsAndPolygonsCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RouteShield;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.SpatialCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.DataWarehouseKpiExecutionJobResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.DataWarehouseKpiResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.DriverLogResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.EquipmentDataHistoryEncodedResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.EquipmentDataSetEncoded;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.EquipmentInitialState;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.ExecuteServicePatternAnalyzerParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.GetNextOrPreviousRouteOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.Grouping;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.IMeasureRule;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.KpiExportParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.KpiQuery;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.KpiQueryResultItem;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.KpiQueryResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.MeasureResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.MeasureResultDataPoint;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.MeasureResultValuePoint;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.RetrieveStopTemplateResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.ServiceableStopTemplateRetrievalOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.X0020XRSDataRetrievalJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ActiveTroubleCodesUpdateActionDiagnosticTroubleCode;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.AutomaticPlacement;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.BuildSameDayMatricesOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.CopyRouteToSessionOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.CreateCellsFromRoutesOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.CreateRouteFromPointsArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.CustomFormResponseInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.DailyDistribution;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.DayShiftOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.DeliveryDetailsUpdateActionDetailItemQuantities;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.DetailItem;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.DrivingDirectionsStep;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.LineItemActuals;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.LoadRouteOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.LocationCommentParam;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ManipulationResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ManipulationResultManipulationError;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.MobileDeviceAction;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.MoveRecurringOrderOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.MoveUnassignedOrderGroupsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.NavClientActivationCodeRefreshStatus;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.NavDeviceStatusDto;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.OnRouteByIndicesPlacementTaskTypeToIndex;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.OnStopPlacementInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.OptimizeOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.OptimizeResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.OrderActuals;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.Placement;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.PrepareForNextDayJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.PreviewRouteOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RecurringOrderPlacement;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RemoveOrderOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RemoveStopOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RetrieveRoutesOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RouteActuals;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveRoutePlanOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveRoutePlanRouteArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveRoutePlanStopArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveSessionAsJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveStopFromPointArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ScheduleEquipmentMaintenanceArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SendNoteActionRouteNoteMessageArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SendSmsResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SequenceOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ServiceConfirmationActionOrderIdentity;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ServiceConfirmationInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ServiceTimeAdjustmentOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ShortestPathCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.StopActuals;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestLayoverResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestLayoverResultSuggestion;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestRouteParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestRouteResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestRouteResultSuggestion;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestRouteTemplateResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestRouteTemplateResultSuggestion;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.TemplatePlacement;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.UnplannedOriginParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.UpdateDailyRoutesJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.UpdateRouteFromPointsArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.UpdateServiceTimeParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.VehicleBusComponent;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts.DataWarehouseStagedRouteCost;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseCleansingResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiDescription;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiExportFileResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiMeasureDataFilter;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiMeasureDescription;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiMeasureFilter;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiOperationsUnitDimensionsFilter;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiRule;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiRulesSet;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiSettings;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiSortingOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseResourceEvent;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseRouteData;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseScorecardKpiMeasureCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseStop;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DimensionDescriber;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DimensionDetail;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DimensionFilter;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DimensionFilterValues;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.EquipmentProfileResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.Filters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.IMeasure;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.MeasureUnitOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ResourceExceptionRuleFunction;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ResourceExceptionSpecialDescriptor;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.RetrieveNavRecalculationDetailsResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ScorecardBand;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ScorecardBandThreshold;


/**
 * <p>Classe Java de DataTransferObject complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataTransferObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTransferObject", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping")
@XmlSeeAlso({
    PasswordPolicy.class,
    SystemInfo.class,
    ExecuteReportParameters.class,
    DriverLogResults.class,
    ExecuteScorecardParameters.class,
    RequestSalesContactInfo.class,
    ExecuteReportGroupParameters.class,
    CustomFormAssignmentResult.class,
    WorkerAlertAssignmentResult.class,
    ExecuteServicePatternAnalyzerParameters.class,
    ValidateHosRulesParameters.class,
    HosRulesValidationResult.class,
    EquipmentProfileResult.class,
    Country.class,
    DiagnosticTroubleCodeLibrary.class,
    EquipmentDataHistoryResult.class,
    EquipmentDataHistoryEncodedResult.class,
    RetrieveEquipmentPositionHistoryOptions.class,
    EquipmentPositionHistoryResult.class,
    ServiceableStopTemplateRetrievalOptions.class,
    RetrieveStopTemplateResults.class,
    GetNextOrPreviousRouteOptions.class,
    TelematicsDeviceStatus.class,
    MobileDeviceStatus.class,
    RetrieveNavRecalculationDetailsResult.class,
    UserSettings.class,
    MeasureUnitOptions.class,
    DataWarehouseKpiResult.class,
    KpiQueryResults.class,
    KpiExportParameters.class,
    SaveRoutePlanRouteArgs.class,
    SaveRoutePlanOptions.class,
    CreateRouteFromPointsArgs.class,
    UpdateRouteFromPointsArgs.class,
    DomainInstance.class,
    SplitRouteOptionsDto.class,
    OptimizeOptions.class,
    OptimizeResult.class,
    SequenceOptions.class,
    RemoveOrderOptions.class,
    RemoveStopOptions.class,
    MoveUnassignedOrderGroupsOptions.class,
    SuggestLayoverResult.class,
    CreateCellsFromRoutesOptions.class,
    Coordinate.class,
    RouteActuals.class,
    OptimizeTerritoriesParameters.class,
    BuildSameDayMatricesOptions.class,
    SuggestTerritoryParameters.class,
    SaveEquipmentServiceArgs.class,
    ManipulationResult.class,
    CreateTerritoriesParameters.class,
    StrategicRoutingParameters.class,
    CalculateCreateTerritoriesTargetsParameters.class,
    CreateTerritoriesTargetValues.class,
    UpdateDailyRoutesJobParameters.class,
    BusinessUnitActiveAlertSettings.class,
    SaveSessionAsJobParameters.class,
    PrepareForNextDayJobParameters.class,
    CopyRouteToSessionOptions.class,
    LoadRouteOptions.class,
    RetrieveRoutesOptions.class,
    PreviewRouteOptions.class,
    NavClientActivationCodeRefreshStatus.class,
    SuggestRouteTemplateResult.class,
    SuggestRouteParameters.class,
    SuggestRouteResult.class,
    RoutingParameters.class,
    TravelPathResult.class,
    RoutePathResult.class,
    UpdateServiceTimeParameters.class,
    ClientStatistics.class,
    RetrieveMatrixResultsOptions.class,
    ImportOBD2DiagnosticTroubleCodesParameters.class,
    RetrieveEditOperationsCriteria.class,
    RetrieveDeltaMapEditsResult.class,
    RetrieveFullMapEditsResult.class,
    RetrieveArcsCriteria.class,
    Viewport.class,
    RetrieveNodesCriteria.class,
    GeocodeOptions.class,
    RetrieveGeocodeCandidateOptions.class,
    RetrievePositionTextResult.class,
    PositionTextListResult.class,
    CalculateDistanceByJurisdictionResult.class,
    NetworkTravelModel.class,
    RetrieveTravelPathsAndPolygonsCriteria.class,
    MapLocalSearchCriteria.class,
    Quantities.class,
    Speed.class,
    Distance.class,
    NavRecalculationCalculatorOptions.class,
    Angle.class,
    LiquidVolume.class,
    OpportunityMetrics.class,
    ReportParameterDefinition.class,
    ParameterValue.class,
    LayoverDeparture.class,
    NetworkPenalizedTurn.class,
    MeasurementOptions.class,
    EquipmentTypeRestriction.class,
    ServiceAreaBase.class,
    StopScores.class,
    ActiveAlertRecipientTypeAdditionalField.class,
    SpeedBracket.class,
    FacilityEndpointInfo.class,
    Weight.class,
    RouteChangeNotificationChangedEntity.class,
    StopIdentity.class,
    ProductTypeRestriction.class,
    DeleteTerritoriesResult.class,
    DeleteTerritoriesResultError.class,
    ExportPlanningSolutionResult.class,
    ExportPlanningSolutionPropertyResult.class,
    DeleteStrategicRoutingSessionResult.class,
    DeleteStrategicRoutingSessionDetail.class,
    DeleteBusinessUnitResult.class,
    ShiftDaysResult.class,
    ShiftDaysResultShiftDaysResultItem.class,
    TransferRecurringOrdersResult.class,
    TransferRecurringOrderDetail.class,
    SuggestTerritoryResult.class,
    SuggestTerritoryResultSuggestion.class,
    TerritoryDeltas.class,
    UpdateDailyRoutesJobResult.class,
    UpdateDailyRoutesJobError.class,
    AttachCustomerResult.class,
    ValidationFailure.class,
    CalculateOptimalRouteMetricsResult.class,
    CalculateOptimalRouteMetricsResultCalculateOptimalResult.class,
    DeleteRoutesResult.class,
    DeleteRouteDetail.class,
    DeleteRegionResult.class,
    MoveResourcesToRegionResult.class,
    HarshDrivingThreshold.class,
    MoveUnassignedOrdersToSessionResult.class,
    MoveUnassignedOrderToSessionFailure.class,
    OptimizeTerritoriesResult.class,
    RdcMigrationResult.class,
    DVIRResult.class,
    InspectionDefect.class,
    EquipmentInspection.class,
    XrsMigrationResult.class,
    XrsMigrationResultEntityResult.class,
    ImportOBD2DiagnosticCodesResult.class,
    ImportOBD2DiagnosticCodesError.class,
    PrepareForNextDayResult.class,
    ServicePatternAnalyzerResult.class,
    ServicePatternAnalyzerResultServicePatternAnalyzerSummary.class,
    SaveSessionAsResult.class,
    InitializeDataWarehouseResult.class,
    Scorecard.class,
    ScorecardCriteriaScore.class,
    CreateCustomerResult.class,
    CreateDatabaseResult.class,
    ReportGroupReportResult.class,
    ExecuteReportResult.class,
    ShadowProductionResult.class,
    CreateRoutesResult.class,
    CreateRoutesResultCreateRouteResult.class,
    CreateRoutesResultCreateRouteResultCreateRouteErrors.class,
    ServiceTimeUpdateReport.class,
    ServiceTimeUpdateReportRecord.class,
    ComplianceAlertParameter.class,
    ImportResult.class,
    ImportEntityResult.class,
    ImportPropertyResult.class,
    TelematicsDeviceInputPortInfo.class,
    ReportRouteCriteriaSettings.class,
    ReportRouteCriteriaSettingsFilter.class,
    DiagnosticTroubleCodeCriteria.class,
    TelematicsDeviceTelematicsDeviceHardware.class,
    Temperature.class,
    ReportParameter.class,
    AlternativeDeliveryVehicle.class,
    RegionAutoArriveDepartSettings.class,
    BusinessUnitMessagingProviderSettings.class,
    SpeedRpmMatrix.class,
    ResourceEventList.class,
    ScorecardThresholdConfiguration.class,
    VerificationHistoryItem.class,
    PassAttributes.class,
    DepotEquipmentTypeQuantity.class,
    DailyPassAttributes.class,
    DailyRoutingGoals.class,
    StrategicPassAttributes.class,
    StrategicRoutingGoals.class,
    TransmissionGearState.class,
    DistanceCost.class,
    CompliancePermissions.class,
    CompliancePermissionsDvirPermissions.class,
    NetworkStreet.class,
    Jurisdiction.class,
    NamedPlace.class,
    CorrespondenceView.class,
    Correspondent.class,
    EquipmentInformation.class,
    BatteryState.class,
    RouteInformation.class,
    DailyStopPosition.class,
    EquipmentDescriptor.class,
    HosPrefillComment.class,
    PositionText.class,
    RelativePositionDetail.class,
    RoutePosition.class,
    WorkerDescriptor.class,
    EquipmentOverview.class,
    WorkerInformation.class,
    CompositeEntityIdentity.class,
    PositionTextBuilderOptions.class,
    EquipmentDataHistory.class,
    EquipmentDataPoint.class,
    PositionDataPoint.class,
    TelemetryDataPoint.class,
    TelematicsDeviceOutputPortInfo.class,
    OverridableRegionProperties.class,
    OverridableRegionPropertiesAutoArriveDepartSettings.class,
    RoadnetTelematicsScriptVersion.class,
    RoadnetTelematicsFirmwareVersion.class,
    RoadnetTelematicsVbusFileVersion.class,
    TravelPairPathInfoResult.class,
    TravelPointPenalty.class,
    TravelVehicle.class,
    Length.class,
    TransitMatrixBuildRequest.class,
    CreateTerritoriesResult.class,
    J1587FailureModeIndicator.class,
    UserPolicy.class,
    UpdatePerformedMaintenanceArgs.class,
    EquipmentStatusWorkerDetail.class,
    J1587MessageIdentifier.class,
    J1587ParameterIdentifier.class,
    J1587SubsystemIdentifier.class,
    J1939FailureModeIndicator.class,
    J1939SourceAddress.class,
    J1939SuspectParameterNumber.class,
    NotMigratedMobileDevice.class,
    NavRecalculationVehicleOptions.class,
    SaveAssignedRecurringOrderArgs.class,
    StrategicRoutingResult.class,
    WorkerAlertAssignment.class,
    FuelEconomy.class,
    MultiDayRoutingOptions.class,
    TaskSpec.class,
    OrderBaseSpec.class,
    ShareableEntityAccessor.class,
    CustomFormAssignment.class,
    CustomFormInfo.class,
    FormControlInfo.class,
    CreateRouteArgs.class,
    SaveAssignedOrderArgs.class,
    ImportResultDetail.class,
    TravelDirectionsStep.class,
    SaveStopArgs.class,
    TerritoryResult.class,
    ResetPasswordResult.class,
    NetworkVehicleConstraint.class,
    GeocodeCandidate.class,
    NetworkDateTimePeriod.class,
    Percent.class,
    RouteResult.class,
    RouteResultRouteDeltas.class,
    RouteScores.class,
    ReloadOptions.class,
    RoutingResult.class,
    RoutingResultNotRoutedOrderResult.class,
    NetworkTravelRule.class,
    NetworkTurnRule.class,
    TravelPathCalculatorOptions.class,
    RelativeDateTime.class,
    HosRuleSet.class,
    NotificationResult.class,
    WorkerOverview.class,
    CompliancePermissionsMiscPermissions.class,
    CompliancePermissionsHosPermissions.class,
    CompliancePermissionsIftaPermissions.class,
    OverridableRegionPropertiesDefaultSettings.class,
    OverridableRegionPropertiesDispatchSettings.class,
    OverridableRegionPropertiesAutonomousOptimizationSettings.class,
    OverridableRegionPropertiesMobileDeviceSettings.class,
    OverridableRegionPropertiesStationaryEventSettings.class,
    OverridableRegionPropertiesCombineOrdersSettings.class,
    OverridableRegionPropertiesStreetSideLocationTravelRules.class,
    OverridableRegionPropertiesRoutingSessionsSettings.class,
    OverridableRegionPropertiesTelematicsSettings.class,
    OverridableRegionPropertiesOmnitracsNavigationSettings.class,
    OverridableRegionPropertiesTravelPathCalculatorSettings.class,
    OverridableRegionPropertiesComplianceAddressSettings.class,
    OverridableRegionPropertiesHosSettings.class,
    OverridableRegionPropertiesIftaSettings.class,
    OverridableRegionPropertiesDVIRSettings.class,
    OverridableRegionPropertiesSearchSettings.class,
    OverridableRegionPropertiesPerformanceSettings.class,
    OverridableRegionPropertiesVideoSettings.class,
    RouteChangeNotificationChangedStop.class,
    RoutingResultPassResult.class,
    BusinessUnitDefaultSettings.class,
    BusinessUnitOmnitracsOneSettings.class,
    BusinessUnitExternalDataFeedSettings.class,
    RegionDefaultSettings.class,
    RegionCombineOrdersSettings.class,
    RegionStreetSideLocationTravelRules.class,
    RegionRoutingSessionSettings.class,
    RegionDispatchSettings.class,
    RegionAutonomousOptimizationSettings.class,
    RegionMobileDeviceSettings.class,
    RegionStationaryEventSettings.class,
    RegionSearchSettings.class,
    RegionTelematicsSettings.class,
    RegionTelematicsSettingsTelematicsProviderSettings.class,
    RegionOmnitracsNavigationSettings.class,
    RegionTravelPathCalculatorSettings.class,
    RegionPerformanceSettings.class,
    RegionDVIRSettings.class,
    RegionHosSettings.class,
    RegionOrganizationAddress.class,
    RegionIftaSettings.class,
    RegionComplianceAddressSettings.class,
    RegionVideoSettings.class,
    AlertOption.class,
    ScorecardScore.class,
    RdcEntityMigrationResult.class,
    CompositeSearchResult.class,
    SearchResult.class,
    EquipmentStatus.class,
    FormControlResponseValue.class,
    WorkerHosStatus.class,
    CorrespondenceSenderStatus.class,
    ReportCriteriaSettings.class,
    RouteCosts.class,
    WorkerCosts.class,
    WorkerMobileCredentials.class,
    DataWarehouseKpiExportFileResult.class,
    DataWarehouseCleansingResult.class,
    DimensionFilter.class,
    DimensionDescriber.class,
    DataWarehouseRouteData.class,
    DataWarehouseStop.class,
    DimensionFilterValues.class,
    Filters.class,
    DataWarehouseKpiDescription.class,
    DataWarehouseKpiMeasureDescription.class,
    DataWarehouseKpiSettings.class,
    DataWarehouseKpiSortingOptions.class,
    DataWarehouseResourceEvent.class,
    DimensionDetail.class,
    DataWarehouseKpiCriteria.class,
    DataWarehouseKpiMeasureFilter.class,
    DataWarehouseKpiMeasureDataFilter.class,
    DataWarehouseKpiOperationsUnitDimensionsFilter.class,
    DataWarehouseKpiRule.class,
    DataWarehouseKpiRulesSet.class,
    ScorecardBand.class,
    ScorecardBandThreshold.class,
    IMeasure.class,
    DataWarehouseScorecardKpiMeasureCriteria.class,
    DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class,
    ResourceExceptionRuleFunction.class,
    ResourceExceptionSpecialDescriptor.class,
    DeviceLookupResult.class,
    FindCustomersResult.class,
    CustomerInfo.class,
    XrsCustomerInfo.class,
    DataRetentionPolicy.class,
    ImmutableObject.class,
    AddressCriteria.class,
    JurisdictionDistance.class,
    MapLocalSearchResultData.class,
    NetworkChangedAreas.class,
    NetworkSplitArcInfo.class,
    SpatialCriteria.class,
    RouteShield.class,
    NetworkDataStoreEntity.class,
    EquipmentDataSetEncoded.class,
    EquipmentInitialState.class,
    X0020XRSDataRetrievalJobParameters.class,
    DataWarehouseKpiExecutionJobResult.class,
    KpiQuery.class,
    Grouping.class,
    KpiQueryResultItem.class,
    MeasureResultDataPoint.class,
    MeasureResultValuePoint.class,
    MeasureResult.class,
    IMeasureRule.class,
    DomainEntity.class,
    DataWarehouseStagedRouteCost.class,
    NavDeviceStatusDto.class,
    DayShiftOptions.class,
    ManipulationResultManipulationError.class,
    SaveRoutePlanStopArgs.class,
    UnplannedOriginParameters.class,
    ServiceConfirmationInfo.class,
    ServiceConfirmationActionOrderIdentity.class,
    VehicleBusComponent.class,
    CustomFormResponseInfo.class,
    DailyDistribution.class,
    LocationCommentParam.class,
    MoveRecurringOrderOptions.class,
    RecurringOrderPlacement.class,
    SaveStopFromPointArgs.class,
    ScheduleEquipmentMaintenanceArgs.class,
    SuggestLayoverResultSuggestion.class,
    OnStopPlacementInfo.class,
    SendSmsResult.class,
    AutomaticPlacement.class,
    DrivingDirectionsStep.class,
    LineItemActuals.class,
    ActiveTroubleCodesUpdateActionDiagnosticTroubleCode.class,
    DeliveryDetailsUpdateActionDetailItemQuantities.class,
    OnRouteByIndicesPlacementTaskTypeToIndex.class,
    SendNoteActionRouteNoteMessageArgs.class,
    MobileDeviceAction.class,
    OrderActuals.class,
    Placement.class,
    StopActuals.class,
    ServiceTimeAdjustmentOptions.class,
    SuggestRouteTemplateResultSuggestion.class,
    TemplatePlacement.class,
    ShortestPathCriteria.class,
    DetailItem.class,
    SuggestRouteResultSuggestion.class
})
public class DataTransferObject {


}
