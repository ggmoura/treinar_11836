
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.roadnet.apex.datacontracts.AdminUserSession;
import com.roadnet.apex.datacontracts.ArrayOfAggregateRootEntity;
import com.roadnet.apex.datacontracts.ArrayOfClientApplicationVersion;
import com.roadnet.apex.datacontracts.ArrayOfCompositeSearchResult;
import com.roadnet.apex.datacontracts.ArrayOfCoordinate;
import com.roadnet.apex.datacontracts.ArrayOfCorrespondence;
import com.roadnet.apex.datacontracts.ArrayOfCountry;
import com.roadnet.apex.datacontracts.ArrayOfCreateRouteArgs;
import com.roadnet.apex.datacontracts.ArrayOfCustomEntityMetaData;
import com.roadnet.apex.datacontracts.ArrayOfDailyRoutingSession;
import com.roadnet.apex.datacontracts.ArrayOfDiscussion;
import com.roadnet.apex.datacontracts.ArrayOfDomainInstance;
import com.roadnet.apex.datacontracts.ArrayOfEntityType;
import com.roadnet.apex.datacontracts.ArrayOfEquipmentDataPoint;
import com.roadnet.apex.datacontracts.ArrayOfEquipmentMaintenanceInfo;
import com.roadnet.apex.datacontracts.ArrayOfEquipmentPosition;
import com.roadnet.apex.datacontracts.ArrayOfEquipmentStatus;
import com.roadnet.apex.datacontracts.ArrayOfEquipmentStatusDetails;
import com.roadnet.apex.datacontracts.ArrayOfGeocodeResult;
import com.roadnet.apex.datacontracts.ArrayOfHosRuleSet;
import com.roadnet.apex.datacontracts.ArrayOfMobileDeviceStatus;
import com.roadnet.apex.datacontracts.ArrayOfNetworkArc;
import com.roadnet.apex.datacontracts.ArrayOfNetworkID;
import com.roadnet.apex.datacontracts.ArrayOfNotificationResult;
import com.roadnet.apex.datacontracts.ArrayOfOrderBaseSpec;
import com.roadnet.apex.datacontracts.ArrayOfRegion;
import com.roadnet.apex.datacontracts.ArrayOfReport;
import com.roadnet.apex.datacontracts.ArrayOfResetPasswordResult;
import com.roadnet.apex.datacontracts.ArrayOfResourceExceptionRuleEx;
import com.roadnet.apex.datacontracts.ArrayOfRetrievalOptions;
import com.roadnet.apex.datacontracts.ArrayOfRetrievalResults;
import com.roadnet.apex.datacontracts.ArrayOfRoadnetTelematicsFirmwareVersion;
import com.roadnet.apex.datacontracts.ArrayOfRoadnetTelematicsScriptVersion;
import com.roadnet.apex.datacontracts.ArrayOfRoadnetTelematicsVbusFileVersion;
import com.roadnet.apex.datacontracts.ArrayOfRoute;
import com.roadnet.apex.datacontracts.ArrayOfRoutePosition;
import com.roadnet.apex.datacontracts.ArrayOfRouteTemplate;
import com.roadnet.apex.datacontracts.ArrayOfSaveResult;
import com.roadnet.apex.datacontracts.ArrayOfSaveRouteArgs;
import com.roadnet.apex.datacontracts.ArrayOfSaveTerritoryArgs;
import com.roadnet.apex.datacontracts.ArrayOfShareableEntityAccessor;
import com.roadnet.apex.datacontracts.ArrayOfStopIdentity;
import com.roadnet.apex.datacontracts.ArrayOfUpdateCorrespondenceStatusForWorkerArgs;
import com.roadnet.apex.datacontracts.ArrayOfWorkerComplianceStatus;
import com.roadnet.apex.datacontracts.BusinessUnitActiveAlertSettings;
import com.roadnet.apex.datacontracts.CalculateCreateTerritoriesTargetsParameters;
import com.roadnet.apex.datacontracts.ClientApplicationVersion;
import com.roadnet.apex.datacontracts.ClientStatistics;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.CorrespondencePropertyOptions;
import com.roadnet.apex.datacontracts.Country;
import com.roadnet.apex.datacontracts.CreateCorrespondenceForWorkerArgs;
import com.roadnet.apex.datacontracts.CreateTerritoriesParameters;
import com.roadnet.apex.datacontracts.CreateTerritoriesTargetValues;
import com.roadnet.apex.datacontracts.CustomFormAssignmentResult;
import com.roadnet.apex.datacontracts.DiagnosticTroubleCodeLibrary;
import com.roadnet.apex.datacontracts.DispatchRouteSummaryStatistics;
import com.roadnet.apex.datacontracts.DomainInstance;
import com.roadnet.apex.datacontracts.EquipmentDataHistoryResult;
import com.roadnet.apex.datacontracts.EquipmentMaintenanceInfoRetrievalOptions;
import com.roadnet.apex.datacontracts.EquipmentPositionHistoryResult;
import com.roadnet.apex.datacontracts.ExecuteReportGroupParameters;
import com.roadnet.apex.datacontracts.ExecuteReportParameters;
import com.roadnet.apex.datacontracts.ExecuteScorecardParameters;
import com.roadnet.apex.datacontracts.HosRulesValidationResult;
import com.roadnet.apex.datacontracts.LoginAdminResult;
import com.roadnet.apex.datacontracts.LoginResult;
import com.roadnet.apex.datacontracts.MobileDeviceStatus;
import com.roadnet.apex.datacontracts.NetworkRestrictedPath;
import com.roadnet.apex.datacontracts.NetworkTravelModel;
import com.roadnet.apex.datacontracts.NetworkTravelPolygon;
import com.roadnet.apex.datacontracts.OperationalMetrics;
import com.roadnet.apex.datacontracts.OptimizeTerritoriesParameters;
import com.roadnet.apex.datacontracts.PasswordPolicy;
import com.roadnet.apex.datacontracts.PositionTextListResult;
import com.roadnet.apex.datacontracts.RegionContext;
import com.roadnet.apex.datacontracts.RegionRetrievalOptions;
import com.roadnet.apex.datacontracts.Report;
import com.roadnet.apex.datacontracts.ReportPropertyOptions;
import com.roadnet.apex.datacontracts.RequestSalesContactInfo;
import com.roadnet.apex.datacontracts.RetrievalOptions;
import com.roadnet.apex.datacontracts.RetrievalResults;
import com.roadnet.apex.datacontracts.RetrieveCorrespondenceArgs;
import com.roadnet.apex.datacontracts.RetrieveCorrespondenceForWorkerOptions;
import com.roadnet.apex.datacontracts.RetrieveCorrespondenceForWorkerResult;
import com.roadnet.apex.datacontracts.RetrieveDataFeedStatusOptions;
import com.roadnet.apex.datacontracts.RetrieveDataFeedStatusResult;
import com.roadnet.apex.datacontracts.RetrieveDispatchRouteSummaryStatisticsArgs;
import com.roadnet.apex.datacontracts.RetrieveDriverLogOptions;
import com.roadnet.apex.datacontracts.RetrieveEquipmentDataHistoryOptions;
import com.roadnet.apex.datacontracts.RetrieveEquipmentOverviewListOptions;
import com.roadnet.apex.datacontracts.RetrieveEquipmentOverviewListResult;
import com.roadnet.apex.datacontracts.RetrieveEquipmentPositionHistoryOptions;
import com.roadnet.apex.datacontracts.RetrieveEquipmentPositionUpdatesOptions;
import com.roadnet.apex.datacontracts.RetrieveEquipmentStatusDetailsOptions;
import com.roadnet.apex.datacontracts.RetrieveEquipmentStatusDetailsResults;
import com.roadnet.apex.datacontracts.RetrieveEquipmentStatusOptions;
import com.roadnet.apex.datacontracts.RetrieveMobileDeviceStatusesOptions;
import com.roadnet.apex.datacontracts.RetrieveOperationalMetricsOptions;
import com.roadnet.apex.datacontracts.RetrieveOperationalRegionsOptions;
import com.roadnet.apex.datacontracts.RetrievePerformanceMonitoringInfoOptions;
import com.roadnet.apex.datacontracts.RetrievePerformanceMonitoringInfoResult;
import com.roadnet.apex.datacontracts.RetrievePositionTextOptions;
import com.roadnet.apex.datacontracts.RetrievePositionTextResult;
import com.roadnet.apex.datacontracts.RetrieveServiceLocationServiceStatisticsArgs;
import com.roadnet.apex.datacontracts.RetrieveTelematicsDeviceStatusesOptions;
import com.roadnet.apex.datacontracts.RetrieveTelematicsDeviceStatusesResults;
import com.roadnet.apex.datacontracts.RetrieveWorkerComplianceStatusOptions;
import com.roadnet.apex.datacontracts.RetrieveWorkerOverviewOptions;
import com.roadnet.apex.datacontracts.RetrieveWorkerOverviewResult;
import com.roadnet.apex.datacontracts.Route;
import com.roadnet.apex.datacontracts.RouteOptimizationSuggestion;
import com.roadnet.apex.datacontracts.RoutePathResult;
import com.roadnet.apex.datacontracts.RoutePropertyOptions;
import com.roadnet.apex.datacontracts.RouteTemplate;
import com.roadnet.apex.datacontracts.RouteTemplatePropertyOptions;
import com.roadnet.apex.datacontracts.RoutingParameters;
import com.roadnet.apex.datacontracts.RoutingSession;
import com.roadnet.apex.datacontracts.SaveEquipmentServiceArgs;
import com.roadnet.apex.datacontracts.SaveLayoverStopArgs;
import com.roadnet.apex.datacontracts.SaveMidRouteDepotStopArgs;
import com.roadnet.apex.datacontracts.SaveNonServiceableStopArgs;
import com.roadnet.apex.datacontracts.SaveOptions;
import com.roadnet.apex.datacontracts.SaveResult;
import com.roadnet.apex.datacontracts.SaveRouteArgs;
import com.roadnet.apex.datacontracts.SaveRouteDelayArgs;
import com.roadnet.apex.datacontracts.SaveTerritoryArgs;
import com.roadnet.apex.datacontracts.SearchEquipmentStatusDetailsOptions;
import com.roadnet.apex.datacontracts.SearchOptions;
import com.roadnet.apex.datacontracts.SearchTypeOptions;
import com.roadnet.apex.datacontracts.ServiceLocationServiceStatistics;
import com.roadnet.apex.datacontracts.SessionHeader;
import com.roadnet.apex.datacontracts.StrategicRoutingParameters;
import com.roadnet.apex.datacontracts.StrategicRoutingSession;
import com.roadnet.apex.datacontracts.SuggestTerritoryParameters;
import com.roadnet.apex.datacontracts.SystemInfo;
import com.roadnet.apex.datacontracts.TelematicsDeviceStatus;
import com.roadnet.apex.datacontracts.TerritoryPropertyOptions;
import com.roadnet.apex.datacontracts.TravelPathResult;
import com.roadnet.apex.datacontracts.UpdateActivePassesParameters;
import com.roadnet.apex.datacontracts.UrlSet;
import com.roadnet.apex.datacontracts.UserPermissions;
import com.roadnet.apex.datacontracts.UserSettings;
import com.roadnet.apex.datacontracts.ValidateHosRulesParameters;
import com.roadnet.apex.datacontracts.Viewport;
import com.roadnet.apex.datacontracts.WorkerAlertAssignmentResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_core.ArrayOfRolePermission;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ClearActiveTroubleCodesParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ClientApplicationInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.CultureOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ImportParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.LookupMobileDeviceResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.LookupTelematicsDeviceResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.MoveResourcesToRegionParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.SaveCorrespondenceParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.SplitRouteOptionsDto;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.ArrayOfAdminReport;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.ArrayOfCustomer;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.ArrayOfMatrixBuildResultExt;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.AttachCustomerParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.CreateCustomerParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.CreateDatabaseParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.Customer;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.CustomerRegionMatrixStatisticsResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.DeviceLookupParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.DeviceLookupResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.FindCustomersParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.ImportOBD2DiagnosticTroubleCodesParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.InitializeDataWarehouseParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.LoggingSettings;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.MatrixBuildRequestMessages;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.MatrixBuildRequestResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.MatrixBuildResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.RdcMigrationParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.RetrieveMatrixResultsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.ShadowProductionParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.TestCustomerXrsSettingsParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.TestCustomerXrsSettingsResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.UpdateCustomerRegionsParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.UploadCustomReportParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.UploadCustomReportResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.XrsMigrationParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ApplyArcUpdatesCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ApplyArcUpdatesOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ApplyArcUpdatesResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ArrayOfMapRegionInfoDto;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ArrayOfPopulateArcResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ArrayOfRouteShield;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.CalculateDistanceByJurisdictionOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.CalculateDistanceByJurisdictionResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.GenerateTravelPathOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.GeocodeCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.GeocodeOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ImpasseNode;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.MapLocalSearchCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.MapLocalSearchOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.MapLocalSearchResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.MapSyncCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.MapSyncOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.NetworkEditRecord;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.PopulateArcsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ProcessCommunityEditRequestArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ProcessCommunityEditRequestResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveArcsCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveArcsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveArcsResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveDeltaMapEditsResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveEditOperationsCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveEditOperationsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveEditOperationsResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveFullMapEditsResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveGeocodeCandidateOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveMapChangedAreasOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveMapChangedAreasResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveMapInfoResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveNodesCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveNodesDetailCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveNodesDetailOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveNodesDetailResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveNodesOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveNodesResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveRestrictedPathsAndPolygonsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveRestrictedPathsAndPolygonsResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveTravelModelResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.RetrieveTravelPathsAndPolygonsCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.UpdateArcsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.UpdateArcsResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.UpdateNodeCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.UpdateRestrictedPathOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.UpdateRestrictedPathResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.UpdateTravelPolygonOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.UpdateTravelPolygonResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.ArrayOfKpiQuery;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.ArrayOfMeasureMetadata;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.ArrayOfOrderInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.CustomerPlanningLicenseInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.DVIRRetrievalJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.DataWarehouseKpiExecutionJobInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.DataWarehouseKpiResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.DataWarehouseMetadata;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.DriverLogResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.EquipmentDataHistoryEncodedResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.ExecuteServicePatternAnalyzerParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.GetNextOrPreviousRouteOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.InternalRetrieveEquipmentDataHistoryEncodedOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.KpiExportParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.KpiQueryResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.KpiQueryResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.LocationCommentResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.LookupEquipmentOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.LookupEquipmentResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.RetrievePositionHistoryReportOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.RetrieveStopTemplateResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.SampleDataGeneratorParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.ServiceableStopTemplateRetrievalOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.AddStopsUsingStationaryResourceEventOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.AdvancedLoggingOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfCalculateRouteResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfClientDiagnosticsInformation;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfManipulationResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfMobileDeviceAction;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfNavDeviceStatusDto;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfRouteRetrievalOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfRouteStopInstances;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfRouteStopTaskInstances;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfSaveRouteResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfSaveRouteTemplateArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfSaveRouteTemplateFromRouteResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfSaveTerritoryResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfScheduleEquipmentMaintenanceArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfSendSmsResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfUndeleteEntityResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.AssociateStationaryResourceEventWithStopsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.AutoCompleteRouteOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.AutomaticPlacement;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.BuildSameDayMatricesOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.CalculateOptimalRouteMetricsParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.CalculateRoutesArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ClientDiagnosticsInformation;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.CopyRouteToSessionOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.CreateCellsFromRoutesOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.CreateCellsFromRoutesResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.CreateRouteFromPointsArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.DeleteRoutesJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.DeleteStrategicRoutingSessionJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.DeleteTerritoriesJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ExportCustomFormsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ExportCustomFormsResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ExportPlanningSolutionJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.GenerateRoutePathOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.GenerateRouteTemplateTravelPathOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.GenerateRouteTravelPathOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.LoadRouteOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.LockOrderOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.LockOrderResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ManipulationResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.MarkStopAsUnserviceableOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.MoveStrategicStopsParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.MoveToRouteParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.MoveUnassignedOrderGroupsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.MoveUnassignedOrdersToSessionJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.NavClientActivationCodeRefreshStatus;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.OptimizeOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.OptimizeResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.Placement;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.PrepareForNextDayJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.PreviewRouteOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RecurringOrderManipulationResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RecurringOrderPlacement;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RemoveOrderOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RemoveStopOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ResumeDataFeedOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ResumeDataFeedResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RetrieveRoutesOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RouteActuals;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RouteRetrievalOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveLayoverStopTemplateArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveMidRouteDepotStopTemplateArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveOrderOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveRoutePlanOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveRoutePlanRouteArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveRouteResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveRouteTemplateArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveRouteTemplateFromRouteArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveSessionAsJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveTerritoryResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SendOrdersParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SendOrdersResults;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SequenceOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ServiceTimeAdjustmentOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ShiftDaysJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestLayoverOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestLayoverResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestLayoverTemplateOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestRouteParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestRouteResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestRouteTemplateCandidates;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestRouteTemplateResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SwitchRecurringOrderServicePatternParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.TemplatePlacement;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.TransferRecurringOrdersParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.UndeleteEntityOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.UpdateDailyRoutesJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.UpdateRouteFromPointsArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.UpdateRouteTenderOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.UpdateServiceTimeParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.UpdateStrategicPlanningSessionCacheJobParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.UpdateUserSettingsParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts.ArrayOfDataWarehouseStagedRoute;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared.ArrayOfTransferableEntityInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared.ScorecardTemplateCriteriaInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared.TransferableEntityInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ArrayOfDataWarehouseKpiExportJobInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ArrayOfWorkerLogEvent;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ComplianceCompanySettings;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseIntegrationStatus;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiBase;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseOperationsUnitDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseOperationsUnitLevel;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.EquipmentProfileResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.KpiExportResultDto;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.MeasureUnitOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.RetrieveNavRecalculationDetailsOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.RetrieveNavRecalculationDetailsResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.SimpleExpressionBase;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.roadnet.apex package. 
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

    private final static QName _LoginAdminEmailAddress_QNAME = new QName("http://roadnet.com/apex/", "emailAddress");
    private final static QName _LoginAdminPassword_QNAME = new QName("http://roadnet.com/apex/", "password");
    private final static QName _LoginAdminResponseLoginAdminResult_QNAME = new QName("http://roadnet.com/apex/", "LoginAdminResult");
    private final static QName _LoginAdminWithAppInfoAppInfo_QNAME = new QName("http://roadnet.com/apex/", "appInfo");
    private final static QName _LoginAdminWithAppInfoResponseLoginAdminWithAppInfoResult_QNAME = new QName("http://roadnet.com/apex/", "LoginAdminWithAppInfoResult");
    private final static QName _LoginCultureOptions_QNAME = new QName("http://roadnet.com/apex/", "cultureOptions");
    private final static QName _LoginResponseLoginResult_QNAME = new QName("http://roadnet.com/apex/", "LoginResult");
    private final static QName _LogoutSessionHeader_QNAME = new QName("http://roadnet.com/apex/", "sessionHeader");
    private final static QName _LookupPasswordPolicyResponseLookupPasswordPolicyResult_QNAME = new QName("http://roadnet.com/apex/", "LookupPasswordPolicyResult");
    private final static QName _LookupAdminPasswordPolicyResponseLookupAdminPasswordPolicyResult_QNAME = new QName("http://roadnet.com/apex/", "LookupAdminPasswordPolicyResult");
    private final static QName _ChangePasswordNewPassword_QNAME = new QName("http://roadnet.com/apex/", "newPassword");
    private final static QName _LookupMobileDeviceDeviceIdentifier_QNAME = new QName("http://roadnet.com/apex/", "deviceIdentifier");
    private final static QName _LookupMobileDeviceResponseLookupMobileDeviceResult_QNAME = new QName("http://roadnet.com/apex/", "LookupMobileDeviceResult");
    private final static QName _LookupTelematicsDeviceIdentifier_QNAME = new QName("http://roadnet.com/apex/", "identifier");
    private final static QName _LookupTelematicsDeviceProviderType_QNAME = new QName("http://roadnet.com/apex/", "providerType");
    private final static QName _LookupTelematicsDeviceResponseLookupTelematicsDeviceResult_QNAME = new QName("http://roadnet.com/apex/", "LookupTelematicsDeviceResult");
    private final static QName _LoginSupportAdminSession_QNAME = new QName("http://roadnet.com/apex/", "adminSession");
    private final static QName _LoginSupportResponseLoginSupportResult_QNAME = new QName("http://roadnet.com/apex/", "LoginSupportResult");
    private final static QName _LoginSingleSignOnAuthTokenString_QNAME = new QName("http://roadnet.com/apex/", "authTokenString");
    private final static QName _LoginSingleSignOnResponseLoginSingleSignOnResult_QNAME = new QName("http://roadnet.com/apex/", "LoginSingleSignOnResult");
    private final static QName _LookupLoginResultResponseLookupLoginResultResult_QNAME = new QName("http://roadnet.com/apex/", "LookupLoginResultResult");
    private final static QName _RetrieveCustomerByXrsCompanyLoginIdXrsCompanyLoginId_QNAME = new QName("http://roadnet.com/apex/", "xrsCompanyLoginId");
    private final static QName _RetrieveCustomerByXrsCompanyLoginIdResponseRetrieveCustomerByXrsCompanyLoginIdResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveCustomerByXrsCompanyLoginIdResult");
    private final static QName _MultiRetrieveRegionContext_QNAME = new QName("http://roadnet.com/apex/", "regionContext");
    private final static QName _MultiRetrieveOptions_QNAME = new QName("http://roadnet.com/apex/", "options");
    private final static QName _MultiRetrieveResponseMultiRetrieveResult_QNAME = new QName("http://roadnet.com/apex/", "MultiRetrieveResult");
    private final static QName _RetrieveResponseRetrieveResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveResult");
    private final static QName _RetrieveDiscussionsByEntityResponseRetrieveDiscussionsByEntityResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveDiscussionsByEntityResult");
    private final static QName _RetrieveDiscussionNotificationsTypesToRetrieve_QNAME = new QName("http://roadnet.com/apex/", "typesToRetrieve");
    private final static QName _RetrieveDiscussionNotificationsResponseRetrieveDiscussionNotificationsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveDiscussionNotificationsResult");
    private final static QName _RetrieveBusinessUnitsGrantingPermissionsPermissions_QNAME = new QName("http://roadnet.com/apex/", "permissions");
    private final static QName _RetrieveBusinessUnitsGrantingPermissionsResponseRetrieveBusinessUnitsGrantingPermissionsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveBusinessUnitsGrantingPermissionsResult");
    private final static QName _RetrieveRegionsGrantingPermissionsResponseRetrieveRegionsGrantingPermissionsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveRegionsGrantingPermissionsResult");
    private final static QName _RetrieveRegionsResponseRetrieveRegionsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveRegionsResult");
    private final static QName _RetrieveOperationalRegionsResponseRetrieveOperationalRegionsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveOperationalRegionsResult");
    private final static QName _RetrieveUserPermissionsResponseRetrieveUserPermissionsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveUserPermissionsResult");
    private final static QName _RetrieveReportsResponseRetrieveReportsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveReportsResult");
    private final static QName _RetrieveTransferableEntityNamesResponseRetrieveTransferableEntityNamesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveTransferableEntityNamesResult");
    private final static QName _RetrieveTransferableEntitiesContext_QNAME = new QName("http://roadnet.com/apex/", "context");
    private final static QName _RetrieveTransferableEntitiesResponseRetrieveTransferableEntitiesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveTransferableEntitiesResult");
    private final static QName _RetrieveScorecardTemplateCriteriaInfoResponseRetrieveScorecardTemplateCriteriaInfoResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveScorecardTemplateCriteriaInfoResult");
    private final static QName _RetrieveTransferableEntityEntityName_QNAME = new QName("http://roadnet.com/apex/", "entityName");
    private final static QName _RetrieveTransferableEntityResponseRetrieveTransferableEntityResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveTransferableEntityResult");
    private final static QName _RetrieveUrlsForContextResponseRetrieveUrlsForContextResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveUrlsForContextResult");
    private final static QName _RetrieveSystemInfoResponseRetrieveSystemInfoResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveSystemInfoResult");
    private final static QName _RetrieveCountriesResponseRetrieveCountriesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveCountriesResult");
    private final static QName _RetrieveLocationCommentsResponseRetrieveLocationCommentsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveLocationCommentsResult");
    private final static QName _RetrieveServiceLocationServiceStatisticsArgs_QNAME = new QName("http://roadnet.com/apex/", "args");
    private final static QName _RetrieveServiceLocationServiceStatisticsResponseRetrieveServiceLocationServiceStatisticsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveServiceLocationServiceStatisticsResult");
    private final static QName _RetrieveDispatchRouteSummaryStatisticsResponseRetrieveDispatchRouteSummaryStatisticsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveDispatchRouteSummaryStatisticsResult");
    private final static QName _AuthenticateWorkerLogin_QNAME = new QName("http://roadnet.com/apex/", "login");
    private final static QName _RetrieveRouteSignaturesResponseRetrieveRouteSignaturesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveRouteSignaturesResult");
    private final static QName _SearchSearchString_QNAME = new QName("http://roadnet.com/apex/", "searchString");
    private final static QName _SearchResponseSearchResult_QNAME = new QName("http://roadnet.com/apex/", "SearchResult");
    private final static QName _SearchByTypeResponseSearchByTypeResult_QNAME = new QName("http://roadnet.com/apex/", "SearchByTypeResult");
    private final static QName _ExecuteReportParameter_QNAME = new QName("http://roadnet.com/apex/", "parameter");
    private final static QName _RetrieveDriverLogsResponseRetrieveDriverLogsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveDriverLogsResult");
    private final static QName _RetrieveDVIRResultsParameters_QNAME = new QName("http://roadnet.com/apex/", "parameters");
    private final static QName _RetrieveAvailableLevelsForRegionResponseRetrieveAvailableLevelsForRegionResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveAvailableLevelsForRegionResult");
    private final static QName _RequestSalesContactInfo_QNAME = new QName("http://roadnet.com/apex/", "info");
    private final static QName _RetrieveOrderInfosServiceLocationEntityKeys_QNAME = new QName("http://roadnet.com/apex/", "serviceLocationEntityKeys");
    private final static QName _RetrieveOrderInfosStartServiceDate_QNAME = new QName("http://roadnet.com/apex/", "startServiceDate");
    private final static QName _RetrieveOrderInfosEndServiceDate_QNAME = new QName("http://roadnet.com/apex/", "endServiceDate");
    private final static QName _RetrieveOrderInfosShowPosition_QNAME = new QName("http://roadnet.com/apex/", "showPosition");
    private final static QName _RetrieveOrderInfosDistanceUnit_QNAME = new QName("http://roadnet.com/apex/", "distanceUnit");
    private final static QName _RetrieveOrderInfosResponseRetrieveOrderInfosResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveOrderInfosResult");
    private final static QName _RetrieveLocalizedCulturesResponseRetrieveLocalizedCulturesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveLocalizedCulturesResult");
    private final static QName _RetrieveSharedEntityAccessorsResponseRetrieveSharedEntityAccessorsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveSharedEntityAccessorsResult");
    private final static QName _RetrieveCustomFormsForRouteResponseRetrieveCustomFormsForRouteResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveCustomFormsForRouteResult");
    private final static QName _RetrieveRoutelessCustomFormsResponseRetrieveRoutelessCustomFormsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveRoutelessCustomFormsResult");
    private final static QName _RetrieveWorkerAlertAssignmentsForRouteResponseRetrieveWorkerAlertAssignmentsForRouteResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveWorkerAlertAssignmentsForRouteResult");
    private final static QName _RetrieveHosRuleSetsResponseRetrieveHosRuleSetsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveHosRuleSetsResult");
    private final static QName _ValidateHosRuleSetsResponseValidateHosRuleSetsResult_QNAME = new QName("http://roadnet.com/apex/", "ValidateHosRuleSetsResult");
    private final static QName _RetrieveEldComplianceDateResponseRetrieveEldComplianceDateResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEldComplianceDateResult");
    private final static QName _RetrieveEquipmentProfileForTelematicsDeviceResponseRetrieveEquipmentProfileForTelematicsDeviceResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEquipmentProfileForTelematicsDeviceResult");
    private final static QName _RetrieveComplianceCountriesResponseRetrieveComplianceCountriesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveComplianceCountriesResult");
    private final static QName _RetrieveComplianceDriverLicenseCountriesResponseRetrieveComplianceDriverLicenseCountriesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveComplianceDriverLicenseCountriesResult");
    private final static QName _RetrieveComplianceStateNamesForCountryCountryDto_QNAME = new QName("http://roadnet.com/apex/", "countryDto");
    private final static QName _RetrieveComplianceStateNamesForCountryResponseRetrieveComplianceStateNamesForCountryResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveComplianceStateNamesForCountryResult");
    private final static QName _RetrieveIftaStateNamesForCountryResponseRetrieveIftaStateNamesForCountryResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveIftaStateNamesForCountryResult");
    private final static QName _RetrieveComplianceCompanySettingsResponseRetrieveComplianceCompanySettingsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveComplianceCompanySettingsResult");
    private final static QName _RetrieveDiagnosticTroubleCodeLibraryResponseRetrieveDiagnosticTroubleCodeLibraryResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveDiagnosticTroubleCodeLibraryResult");
    private final static QName _RetrieveEquipmentMaintenanceInfoResponseRetrieveEquipmentMaintenanceInfoResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEquipmentMaintenanceInfoResult");
    private final static QName _RetrieveEquipmentStatusResponseRetrieveEquipmentStatusResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEquipmentStatusResult");
    private final static QName _RetrieveEquipmentPositionUpdatesResponseRetrieveEquipmentPositionUpdatesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEquipmentPositionUpdatesResult");
    private final static QName _RetrieveEquipmentDataHistoryResponseRetrieveEquipmentDataHistoryResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEquipmentDataHistoryResult");
    private final static QName _InternalRetrieveEquipmentDataHistoryEncodedResponseInternalRetrieveEquipmentDataHistoryEncodedResult_QNAME = new QName("http://roadnet.com/apex/", "InternalRetrieveEquipmentDataHistoryEncodedResult");
    private final static QName _RetrievePositionHistoryReportResponseRetrievePositionHistoryReportResult_QNAME = new QName("http://roadnet.com/apex/", "RetrievePositionHistoryReportResult");
    private final static QName _RetrieveEquipmentPositionHistoryResponseRetrieveEquipmentPositionHistoryResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEquipmentPositionHistoryResult");
    private final static QName _RetrieveWorkerComplianceStatusesResponseRetrieveWorkerComplianceStatusesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveWorkerComplianceStatusesResult");
    private final static QName _RetrieveEquipmentStatusDetailsResponseRetrieveEquipmentStatusDetailsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEquipmentStatusDetailsResult");
    private final static QName _RetrieveEquipmentStatusDetailsByKeysEquipmentEntityKeys_QNAME = new QName("http://roadnet.com/apex/", "equipmentEntityKeys");
    private final static QName _RetrieveEquipmentStatusDetailsByKeysResponseRetrieveEquipmentStatusDetailsByKeysResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEquipmentStatusDetailsByKeysResult");
    private final static QName _RetrieveStopTemplatesRetrievalOptions_QNAME = new QName("http://roadnet.com/apex/", "retrievalOptions");
    private final static QName _RetrieveStopTemplatesResponseRetrieveStopTemplatesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveStopTemplatesResult");
    private final static QName _GetPreviousRouteResponseGetPreviousRouteResult_QNAME = new QName("http://roadnet.com/apex/", "GetPreviousRouteResult");
    private final static QName _GetNextRouteResponseGetNextRouteResult_QNAME = new QName("http://roadnet.com/apex/", "GetNextRouteResult");
    private final static QName _SearchEquipmentStatusDetailsResponseSearchEquipmentStatusDetailsResult_QNAME = new QName("http://roadnet.com/apex/", "SearchEquipmentStatusDetailsResult");
    private final static QName _RetrieveAvailableFirmwareVersionsResponseRetrieveAvailableFirmwareVersionsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveAvailableFirmwareVersionsResult");
    private final static QName _RetrieveAvailableScriptVersionsResponseRetrieveAvailableScriptVersionsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveAvailableScriptVersionsResult");
    private final static QName _RetrieveAvailableVbusFileVersionsResponseRetrieveAvailableVbusFileVersionsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveAvailableVbusFileVersionsResult");
    private final static QName _RetrieveTelematicsDeviceStatusesResponseRetrieveTelematicsDeviceStatusesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveTelematicsDeviceStatusesResult");
    private final static QName _RetrieveTeleamticsDeviceStatusByKeyResponseRetrieveTeleamticsDeviceStatusByKeyResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveTeleamticsDeviceStatusByKeyResult");
    private final static QName _RetrieveMobileDeviceStatusesResponseRetrieveMobileDeviceStatusesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveMobileDeviceStatusesResult");
    private final static QName _RetrieveMobileDeviceStatusByKeyResponseRetrieveMobileDeviceStatusByKeyResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveMobileDeviceStatusByKeyResult");
    private final static QName _RetrieveDataFeedStatusResponseRetrieveDataFeedStatusResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveDataFeedStatusResult");
    private final static QName _RetrieveNavRecalculationDetailsResponseRetrieveNavRecalculationDetailsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveNavRecalculationDetailsResult");
    private final static QName _RetrieveUserSettingsResponseRetrieveUserSettingsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveUserSettingsResult");
    private final static QName _RetrievePerformanceMonitoringInfoResponseRetrievePerformanceMonitoringInfoResult_QNAME = new QName("http://roadnet.com/apex/", "RetrievePerformanceMonitoringInfoResult");
    private final static QName _RetrieveEquipmentTelematicsDeviceAssociationResponseRetrieveEquipmentTelematicsDeviceAssociationResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEquipmentTelematicsDeviceAssociationResult");
    private final static QName _RetrieveRoutePositionsResponseRetrieveRoutePositionsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveRoutePositionsResult");
    private final static QName _RetrieveDefaultResourceExceptionRulesResponseRetrieveDefaultResourceExceptionRulesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveDefaultResourceExceptionRulesResult");
    private final static QName _RetrieveWorkerOverviewResponseRetrieveWorkerOverviewResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveWorkerOverviewResult");
    private final static QName _RetrieveOperationalMetricsResponseRetrieveOperationalMetricsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveOperationalMetricsResult");
    private final static QName _RetrieveCustomerPlanningLicenseInfoResponseRetrieveCustomerPlanningLicenseInfoResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveCustomerPlanningLicenseInfoResult");
    private final static QName _RetrieveEquipmentOverviewListResponseRetrieveEquipmentOverviewListResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEquipmentOverviewListResult");
    private final static QName _RetrieveRelevantDownloadableClientApplicationVersionsMobileDeviceIdentifier_QNAME = new QName("http://roadnet.com/apex/", "mobileDeviceIdentifier");
    private final static QName _RetrieveRelevantDownloadableClientApplicationVersionsResponseRetrieveRelevantDownloadableClientApplicationVersionsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveRelevantDownloadableClientApplicationVersionsResult");
    private final static QName _RetrieveTrashCorrespondencePropertyOptions_QNAME = new QName("http://roadnet.com/apex/", "propertyOptions");
    private final static QName _RetrieveTrashCorrespondenceResponseRetrieveTrashCorrespondenceResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveTrashCorrespondenceResult");
    private final static QName _RetrieveCorrespondenceForWorkerResponseRetrieveCorrespondenceForWorkerResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveCorrespondenceForWorkerResult");
    private final static QName _RetrieveKpisQueries_QNAME = new QName("http://roadnet.com/apex/", "queries");
    private final static QName _RetrieveKpisResponseRetrieveKpisResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveKpisResult");
    private final static QName _RetrieveKpiDataKpiBaseDto_QNAME = new QName("http://roadnet.com/apex/", "kpiBaseDto");
    private final static QName _RetrieveKpiDataMeasureUnitOptionsDto_QNAME = new QName("http://roadnet.com/apex/", "measureUnitOptionsDto");
    private final static QName _RetrieveKpiDataResponseRetrieveKpiDataResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveKpiDataResult");
    private final static QName _RetrieveKpiQueryResultsResponseRetrieveKpiQueryResultsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveKpiQueryResultsResult");
    private final static QName _RetrieveKpiExecutionJobResultResponseRetrieveKpiExecutionJobResultResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveKpiExecutionJobResultResult");
    private final static QName _RetrieveDataWarehouseMetadataResponseRetrieveDataWarehouseMetadataResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveDataWarehouseMetadataResult");
    private final static QName _RetrieveAllMeasureMetadataResponseRetrieveAllMeasureMetadataResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveAllMeasureMetadataResult");
    private final static QName _GenerateDataWarehouseSampleDataStartDate_QNAME = new QName("http://roadnet.com/apex/", "startDate");
    private final static QName _GetUserKpiExportsResponseGetUserKpiExportsResult_QNAME = new QName("http://roadnet.com/apex/", "GetUserKpiExportsResult");
    private final static QName _RetrieveKpiDownloadFileResponseRetrieveKpiDownloadFileResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveKpiDownloadFileResult");
    private final static QName _GetZippedClientLogFilesFileNames_QNAME = new QName("http://roadnet.com/apex/", "fileNames");
    private final static QName _GetZippedClientLogFilesResponseGetZippedClientLogFilesResult_QNAME = new QName("http://roadnet.com/apex/", "GetZippedClientLogFilesResult");
    private final static QName _SaveRoutePlanRouteArgs_QNAME = new QName("http://roadnet.com/apex/", "routeArgs");
    private final static QName _SaveRoutePlanResponseSaveRoutePlanResult_QNAME = new QName("http://roadnet.com/apex/", "SaveRoutePlanResult");
    private final static QName _CreateRouteFromPointsResponseCreateRouteFromPointsResult_QNAME = new QName("http://roadnet.com/apex/", "CreateRouteFromPointsResult");
    private final static QName _UpdateRouteFromPointsResponseUpdateRouteFromPointsResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateRouteFromPointsResult");
    private final static QName _UndeleteResponseUndeleteResult_QNAME = new QName("http://roadnet.com/apex/", "UndeleteResult");
    private final static QName _ResumeDataFeedResponseResumeDataFeedResult_QNAME = new QName("http://roadnet.com/apex/", "ResumeDataFeedResult");
    private final static QName _CombineRoutesDestinationRouteInstance_QNAME = new QName("http://roadnet.com/apex/", "destinationRouteInstance");
    private final static QName _CombineRoutesSourceRouteInstances_QNAME = new QName("http://roadnet.com/apex/", "sourceRouteInstances");
    private final static QName _CombineRoutesResponseCombineRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "CombineRoutesResult");
    private final static QName _SplitRouteRouteInstance_QNAME = new QName("http://roadnet.com/apex/", "routeInstance");
    private final static QName _SplitRouteSplitRouteOptions_QNAME = new QName("http://roadnet.com/apex/", "splitRouteOptions");
    private final static QName _SplitRouteResponseSplitRouteResult_QNAME = new QName("http://roadnet.com/apex/", "SplitRouteResult");
    private final static QName _MoveStopsOwningRouteInstance_QNAME = new QName("http://roadnet.com/apex/", "owningRouteInstance");
    private final static QName _MoveStopsStopEntityKeys_QNAME = new QName("http://roadnet.com/apex/", "stopEntityKeys");
    private final static QName _MoveStopsPlacement_QNAME = new QName("http://roadnet.com/apex/", "placement");
    private final static QName _MoveStopsResponseMoveStopsResult_QNAME = new QName("http://roadnet.com/apex/", "MoveStopsResult");
    private final static QName _MoveStopsByIdentitiesStopIdentities_QNAME = new QName("http://roadnet.com/apex/", "stopIdentities");
    private final static QName _MoveStopsByIdentitiesResponseMoveStopsByIdentitiesResult_QNAME = new QName("http://roadnet.com/apex/", "MoveStopsByIdentitiesResult");
    private final static QName _MoveStopsToBestPositionResponseMoveStopsToBestPositionResult_QNAME = new QName("http://roadnet.com/apex/", "MoveStopsToBestPositionResult");
    private final static QName _MoveOrdersOrderInstances_QNAME = new QName("http://roadnet.com/apex/", "orderInstances");
    private final static QName _MoveOrdersResponseMoveOrdersResult_QNAME = new QName("http://roadnet.com/apex/", "MoveOrdersResult");
    private final static QName _MoveOrdersToBestPositionResponseMoveOrdersToBestPositionResult_QNAME = new QName("http://roadnet.com/apex/", "MoveOrdersToBestPositionResult");
    private final static QName _MoveToRouteMoveToRouteParameters_QNAME = new QName("http://roadnet.com/apex/", "moveToRouteParameters");
    private final static QName _MoveToRouteResponseMoveToRouteResult_QNAME = new QName("http://roadnet.com/apex/", "MoveToRouteResult");
    private final static QName _MoveToRouteAndTemporaryGeocodeResponseMoveToRouteAndTemporaryGeocodeResult_QNAME = new QName("http://roadnet.com/apex/", "MoveToRouteAndTemporaryGeocodeResult");
    private final static QName _MoveToBestPositionOnRouteResponseMoveToBestPositionOnRouteResult_QNAME = new QName("http://roadnet.com/apex/", "MoveToBestPositionOnRouteResult");
    private final static QName _OptimizeRoutesRouteInstances_QNAME = new QName("http://roadnet.com/apex/", "routeInstances");
    private final static QName _OptimizeRoutesResponseOptimizeRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "OptimizeRoutesResult");
    private final static QName _SequenceRouteResponseSequenceRouteResult_QNAME = new QName("http://roadnet.com/apex/", "SequenceRouteResult");
    private final static QName _SequenceRangeResponseSequenceRangeResult_QNAME = new QName("http://roadnet.com/apex/", "SequenceRangeResult");
    private final static QName _SuggestRouteSequenceOptionsDto_QNAME = new QName("http://roadnet.com/apex/", "optionsDto");
    private final static QName _SuggestRouteSequenceResponseSuggestRouteSequenceResult_QNAME = new QName("http://roadnet.com/apex/", "SuggestRouteSequenceResult");
    private final static QName _UnassignOrdersOrderEntityKeys_QNAME = new QName("http://roadnet.com/apex/", "orderEntityKeys");
    private final static QName _UnassignOrdersRemoveOrderOptions_QNAME = new QName("http://roadnet.com/apex/", "removeOrderOptions");
    private final static QName _UnassignOrdersResponseUnassignOrdersResult_QNAME = new QName("http://roadnet.com/apex/", "UnassignOrdersResult");
    private final static QName _RemoveStopsStops_QNAME = new QName("http://roadnet.com/apex/", "stops");
    private final static QName _RemoveStopsRemoveStopOptions_QNAME = new QName("http://roadnet.com/apex/", "removeStopOptions");
    private final static QName _RemoveStopsResponseRemoveStopsResult_QNAME = new QName("http://roadnet.com/apex/", "RemoveStopsResult");
    private final static QName _ChangeTaskCancellationStateTasks_QNAME = new QName("http://roadnet.com/apex/", "tasks");
    private final static QName _ChangeTaskCancellationStateResponseChangeTaskCancellationStateResult_QNAME = new QName("http://roadnet.com/apex/", "ChangeTaskCancellationStateResult");
    private final static QName _MoveUnassignedOrderGroupsUnassignedOrderGroupInstances_QNAME = new QName("http://roadnet.com/apex/", "unassignedOrderGroupInstances");
    private final static QName _MoveUnassignedOrderGroupsResponseMoveUnassignedOrderGroupsResult_QNAME = new QName("http://roadnet.com/apex/", "MoveUnassignedOrderGroupsResult");
    private final static QName _MoveUnassignedOrderGroupsExMoveUnassignedOrderGroupsOptions_QNAME = new QName("http://roadnet.com/apex/", "moveUnassignedOrderGroupsOptions");
    private final static QName _MoveUnassignedOrderGroupsExResponseMoveUnassignedOrderGroupsExResult_QNAME = new QName("http://roadnet.com/apex/", "MoveUnassignedOrderGroupsExResult");
    private final static QName _MoveUnassignedOrderGroupsToBestPositionResponseMoveUnassignedOrderGroupsToBestPositionResult_QNAME = new QName("http://roadnet.com/apex/", "MoveUnassignedOrderGroupsToBestPositionResult");
    private final static QName _DeleteRoutesResponseDeleteRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "DeleteRoutesResult");
    private final static QName _FlipRoutesResponseFlipRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "FlipRoutesResult");
    private final static QName _CreateRouteResponseCreateRouteResult_QNAME = new QName("http://roadnet.com/apex/", "CreateRouteResult");
    private final static QName _UpdateRoutesRouteArgsList_QNAME = new QName("http://roadnet.com/apex/", "routeArgsList");
    private final static QName _UpdateRoutesResponseUpdateRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateRoutesResult");
    private final static QName _InsertNonServiceableStopNonServiceableStopArgs_QNAME = new QName("http://roadnet.com/apex/", "nonServiceableStopArgs");
    private final static QName _InsertNonServiceableStopResponseInsertNonServiceableStopResult_QNAME = new QName("http://roadnet.com/apex/", "InsertNonServiceableStopResult");
    private final static QName _UpdateNonServiceableStopResponseUpdateNonServiceableStopResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateNonServiceableStopResult");
    private final static QName _InsertLayoverStopLayoverStopArgs_QNAME = new QName("http://roadnet.com/apex/", "layoverStopArgs");
    private final static QName _InsertLayoverStopResponseInsertLayoverStopResult_QNAME = new QName("http://roadnet.com/apex/", "InsertLayoverStopResult");
    private final static QName _UpdateLayoverStopResponseUpdateLayoverStopResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateLayoverStopResult");
    private final static QName _SuggestLayoversResponseSuggestLayoversResult_QNAME = new QName("http://roadnet.com/apex/", "SuggestLayoversResult");
    private final static QName _InsertMidRouteDepotStopMidRouteDepotStopArgs_QNAME = new QName("http://roadnet.com/apex/", "midRouteDepotStopArgs");
    private final static QName _InsertMidRouteDepotStopResponseInsertMidRouteDepotStopResult_QNAME = new QName("http://roadnet.com/apex/", "InsertMidRouteDepotStopResult");
    private final static QName _UpdateMidRouteDepotStopResponseUpdateMidRouteDepotStopResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateMidRouteDepotStopResult");
    private final static QName _InsertRouteDelayRouteDelayArgs_QNAME = new QName("http://roadnet.com/apex/", "routeDelayArgs");
    private final static QName _InsertRouteDelayResponseInsertRouteDelayResult_QNAME = new QName("http://roadnet.com/apex/", "InsertRouteDelayResult");
    private final static QName _UpdateRouteDelayResponseUpdateRouteDelayResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateRouteDelayResult");
    private final static QName _AdjustServiceTimesForRoutesAdjustFixedServiceTimeOptions_QNAME = new QName("http://roadnet.com/apex/", "adjustFixedServiceTimeOptions");
    private final static QName _AdjustServiceTimesForRoutesAdjustPerUnitServiceTimeOptions_QNAME = new QName("http://roadnet.com/apex/", "adjustPerUnitServiceTimeOptions");
    private final static QName _AdjustServiceTimesForRoutesResponseAdjustServiceTimesForRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "AdjustServiceTimesForRoutesResult");
    private final static QName _AdjustServiceTimesForStopsResponseAdjustServiceTimesForStopsResult_QNAME = new QName("http://roadnet.com/apex/", "AdjustServiceTimesForStopsResult");
    private final static QName _CreateCellsFromRoutesCreateCellsFromRoutesOptions_QNAME = new QName("http://roadnet.com/apex/", "createCellsFromRoutesOptions");
    private final static QName _CreateCellsFromRoutesResponseCreateCellsFromRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "CreateCellsFromRoutesResult");
    private final static QName _OverrideCoordinateForStopCoordinate_QNAME = new QName("http://roadnet.com/apex/", "coordinate");
    private final static QName _OverrideCoordinateForStopResponseOverrideCoordinateForStopResult_QNAME = new QName("http://roadnet.com/apex/", "OverrideCoordinateForStopResult");
    private final static QName _AssignIdentifierForRoutesSeed_QNAME = new QName("http://roadnet.com/apex/", "seed");
    private final static QName _AssignIdentifierForRoutesResponseAssignIdentifierForRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "AssignIdentifierForRoutesResult");
    private final static QName _ChangeRoutePhaseResponseChangeRoutePhaseResult_QNAME = new QName("http://roadnet.com/apex/", "ChangeRoutePhaseResult");
    private final static QName _ChangeRouteStatusResponseChangeRouteStatusResult_QNAME = new QName("http://roadnet.com/apex/", "ChangeRouteStatusResult");
    private final static QName _CalculateRoutesCalculateRouteArgs_QNAME = new QName("http://roadnet.com/apex/", "calculateRouteArgs");
    private final static QName _CalculateRoutesResponseCalculateRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "CalculateRoutesResult");
    private final static QName _AcknowledgeResourceExceptionsExceptionInstances_QNAME = new QName("http://roadnet.com/apex/", "exceptionInstances");
    private final static QName _AcknowledgeRouteNotesRouteNoteInstances_QNAME = new QName("http://roadnet.com/apex/", "routeNoteInstances");
    private final static QName _ResetRoutesToPlanResponseResetRoutesToPlanResult_QNAME = new QName("http://roadnet.com/apex/", "ResetRoutesToPlanResult");
    private final static QName _AdjustActualsRouteActuals_QNAME = new QName("http://roadnet.com/apex/", "routeActuals");
    private final static QName _AdjustActualsResponseAdjustActualsResult_QNAME = new QName("http://roadnet.com/apex/", "AdjustActualsResult");
    private final static QName _RetrieveAssociatedStopsResponseRetrieveAssociatedStopsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveAssociatedStopsResult");
    private final static QName _SuspendRouteResponseSuspendRouteResult_QNAME = new QName("http://roadnet.com/apex/", "SuspendRouteResult");
    private final static QName _EnableAutonomousDispatchResponseEnableAutonomousDispatchResult_QNAME = new QName("http://roadnet.com/apex/", "EnableAutonomousDispatchResult");
    private final static QName _DisableAutonomousDispatchResponseDisableAutonomousDispatchResult_QNAME = new QName("http://roadnet.com/apex/", "DisableAutonomousDispatchResult");
    private final static QName _SaveOrdersOrderSpecDtos_QNAME = new QName("http://roadnet.com/apex/", "orderSpecDtos");
    private final static QName _SaveOrdersResponseSaveOrdersResult_QNAME = new QName("http://roadnet.com/apex/", "SaveOrdersResult");
    private final static QName _SaveOrdersExResponseSaveOrdersExResult_QNAME = new QName("http://roadnet.com/apex/", "SaveOrdersExResult");
    private final static QName _CreateTerritoryTerritoryArgs_QNAME = new QName("http://roadnet.com/apex/", "territoryArgs");
    private final static QName _CreateTerritoryResponseCreateTerritoryResult_QNAME = new QName("http://roadnet.com/apex/", "CreateTerritoryResult");
    private final static QName _UpdateTerritoriesTerritoryArgsList_QNAME = new QName("http://roadnet.com/apex/", "territoryArgsList");
    private final static QName _UpdateTerritoriesResponseUpdateTerritoriesResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateTerritoriesResult");
    private final static QName _DeleteTerritoriesTerritoryInstances_QNAME = new QName("http://roadnet.com/apex/", "territoryInstances");
    private final static QName _DeleteTerritoriesResponseDeleteTerritoriesResult_QNAME = new QName("http://roadnet.com/apex/", "DeleteTerritoriesResult");
    private final static QName _SaveCorrespondenceResponseSaveCorrespondenceResult_QNAME = new QName("http://roadnet.com/apex/", "SaveCorrespondenceResult");
    private final static QName _CreateCorrespondenceForWorkerResponseCreateCorrespondenceForWorkerResult_QNAME = new QName("http://roadnet.com/apex/", "CreateCorrespondenceForWorkerResult");
    private final static QName _UpdateCorrespondenceStatusForWorkerArgsList_QNAME = new QName("http://roadnet.com/apex/", "argsList");
    private final static QName _UpdateCorrespondenceStatusForWorkerResponseUpdateCorrespondenceStatusForWorkerResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateCorrespondenceStatusForWorkerResult");
    private final static QName _SuggestTerritoryForRecurringOrderRecurringOrderInstance_QNAME = new QName("http://roadnet.com/apex/", "recurringOrderInstance");
    private final static QName _ScheduleEquipmentMaintenanceScheduleParameters_QNAME = new QName("http://roadnet.com/apex/", "scheduleParameters");
    private final static QName _CreateEquipmentServiceSaveEquipmentServiceArgs_QNAME = new QName("http://roadnet.com/apex/", "saveEquipmentServiceArgs");
    private final static QName _MoveStrategicStopsToBestPositionMoveStrategicStopsParameters_QNAME = new QName("http://roadnet.com/apex/", "moveStrategicStopsParameters");
    private final static QName _MoveStrategicStopsToBestPositionPlacementDto_QNAME = new QName("http://roadnet.com/apex/", "placementDto");
    private final static QName _MoveStrategicStopsToBestPositionResponseMoveStrategicStopsToBestPositionResult_QNAME = new QName("http://roadnet.com/apex/", "MoveStrategicStopsToBestPositionResult");
    private final static QName _MoveStrategicStopsResponseMoveStrategicStopsResult_QNAME = new QName("http://roadnet.com/apex/", "MoveStrategicStopsResult");
    private final static QName _RemoveStrategicStopsFromTerritoriesResponseRemoveStrategicStopsFromTerritoriesResult_QNAME = new QName("http://roadnet.com/apex/", "RemoveStrategicStopsFromTerritoriesResult");
    private final static QName _SaveWorkerLogEventsWorkerLogEventDtos_QNAME = new QName("http://roadnet.com/apex/", "workerLogEventDtos");
    private final static QName _SaveWorkerLogEventsResponseSaveWorkerLogEventsResult_QNAME = new QName("http://roadnet.com/apex/", "SaveWorkerLogEventsResult");
    private final static QName _MoveRecurringOrdersToTerritoryRecurringOrderInstances_QNAME = new QName("http://roadnet.com/apex/", "recurringOrderInstances");
    private final static QName _MoveRecurringOrdersToTerritoryTerritoryInstance_QNAME = new QName("http://roadnet.com/apex/", "territoryInstance");
    private final static QName _MoveRecurringOrdersToTerritoryResponseMoveRecurringOrdersToTerritoryResult_QNAME = new QName("http://roadnet.com/apex/", "MoveRecurringOrdersToTerritoryResult");
    private final static QName _MoveRecurringOrdersToBestPositionResponseMoveRecurringOrdersToBestPositionResult_QNAME = new QName("http://roadnet.com/apex/", "MoveRecurringOrdersToBestPositionResult");
    private final static QName _MoveRecurringOrdersResponseMoveRecurringOrdersResult_QNAME = new QName("http://roadnet.com/apex/", "MoveRecurringOrdersResult");
    private final static QName _RemoveRecurringOrdersFromTerritoriesResponseRemoveRecurringOrdersFromTerritoriesResult_QNAME = new QName("http://roadnet.com/apex/", "RemoveRecurringOrdersFromTerritoriesResult");
    private final static QName _SwitchRecurringOrderServicePatternSwitchRecurringOrderServicePatternParameters_QNAME = new QName("http://roadnet.com/apex/", "switchRecurringOrderServicePatternParameters");
    private final static QName _SwitchRecurringOrderServicePatternResponseSwitchRecurringOrderServicePatternResult_QNAME = new QName("http://roadnet.com/apex/", "SwitchRecurringOrderServicePatternResult");
    private final static QName _OverrideCoordinateForRecurringOrderOrderInstance_QNAME = new QName("http://roadnet.com/apex/", "orderInstance");
    private final static QName _OverrideCoordinateForRecurringOrderResponseOverrideCoordinateForRecurringOrderResult_QNAME = new QName("http://roadnet.com/apex/", "OverrideCoordinateForRecurringOrderResult");
    private final static QName _ShareEntityShareableEntityAccessors_QNAME = new QName("http://roadnet.com/apex/", "shareableEntityAccessors");
    private final static QName _ShareEntityResponseShareEntityResult_QNAME = new QName("http://roadnet.com/apex/", "ShareEntityResult");
    private final static QName _CreateAndUpdateSharedEntityAccessResponseCreateAndUpdateSharedEntityAccessResult_QNAME = new QName("http://roadnet.com/apex/", "CreateAndUpdateSharedEntityAccessResult");
    private final static QName _CreateTerritoriesRecurringOrders_QNAME = new QName("http://roadnet.com/apex/", "recurringOrders");
    private final static QName _CreateStrategicRoutesTerritories_QNAME = new QName("http://roadnet.com/apex/", "territories");
    private final static QName _CalculateCreateTerritoriesTargetsResponseCalculateCreateTerritoriesTargetsResult_QNAME = new QName("http://roadnet.com/apex/", "CalculateCreateTerritoriesTargetsResult");
    private final static QName _CalculateCreateTerritoriesTargetsForPassResponseCalculateCreateTerritoriesTargetsForPassResult_QNAME = new QName("http://roadnet.com/apex/", "CalculateCreateTerritoriesTargetsForPassResult");
    private final static QName _RemoveRouteBasedDataProcessedRouteKeys_QNAME = new QName("http://roadnet.com/apex/", "processedRouteKeys");
    private final static QName _SaveStagedRoutesStagedRouteDtos_QNAME = new QName("http://roadnet.com/apex/", "stagedRouteDtos");
    private final static QName _SaveStagedRoutesResponseSaveStagedRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "SaveStagedRoutesResult");
    private final static QName _SaveRegionAsOperationsUnitRegionIdentifier_QNAME = new QName("http://roadnet.com/apex/", "regionIdentifier");
    private final static QName _SaveRegionAsOperationsUnitRegionDescription_QNAME = new QName("http://roadnet.com/apex/", "regionDescription");
    private final static QName _SaveDepotAsOperationsUnitDepotIdentifier_QNAME = new QName("http://roadnet.com/apex/", "depotIdentifier");
    private final static QName _SaveDepotAsOperationsUnitDepotDescription_QNAME = new QName("http://roadnet.com/apex/", "depotDescription");
    private final static QName _SaveOperationsHierarchyOperationsUnits_QNAME = new QName("http://roadnet.com/apex/", "operationsUnits");
    private final static QName _SaveOperationsUnitLevelOperationsUnitLevel_QNAME = new QName("http://roadnet.com/apex/", "operationsUnitLevel");
    private final static QName _SaveOperationsUnitLevelResponseSaveOperationsUnitLevelResult_QNAME = new QName("http://roadnet.com/apex/", "SaveOperationsUnitLevelResult");
    private final static QName _SaveOperationsUnitDimensionOperationsUnitDimension_QNAME = new QName("http://roadnet.com/apex/", "operationsUnitDimension");
    private final static QName _SaveOperationsUnitDimensionResponseSaveOperationsUnitDimensionResult_QNAME = new QName("http://roadnet.com/apex/", "SaveOperationsUnitDimensionResult");
    private final static QName _ActiveAlertUnsubscribeEncryptedRecipient_QNAME = new QName("http://roadnet.com/apex/", "encryptedRecipient");
    private final static QName _EnqueueTestSmsMessageActiveAlertSettings_QNAME = new QName("http://roadnet.com/apex/", "activeAlertSettings");
    private final static QName _EnqueueTestSmsMessageRecipient_QNAME = new QName("http://roadnet.com/apex/", "recipient");
    private final static QName _OpenStrategicRoutingSessionResponseOpenStrategicRoutingSessionResult_QNAME = new QName("http://roadnet.com/apex/", "OpenStrategicRoutingSessionResult");
    private final static QName _CloseStrategicRoutingSessionResponseCloseStrategicRoutingSessionResult_QNAME = new QName("http://roadnet.com/apex/", "CloseStrategicRoutingSessionResult");
    private final static QName _GetOrAddModelingSessionForOperationalSessionSessionDescription_QNAME = new QName("http://roadnet.com/apex/", "sessionDescription");
    private final static QName _GetOrAddModelingSessionForOperationalSessionResponseGetOrAddModelingSessionForOperationalSessionResult_QNAME = new QName("http://roadnet.com/apex/", "GetOrAddModelingSessionForOperationalSessionResult");
    private final static QName _CopyRouteToSessionResponseCopyRouteToSessionResult_QNAME = new QName("http://roadnet.com/apex/", "CopyRouteToSessionResult");
    private final static QName _ReleaseStrategicSessionLockStrategicSessionDto_QNAME = new QName("http://roadnet.com/apex/", "strategicSessionDto");
    private final static QName _ReleaseStrategicSessionLockResponseReleaseStrategicSessionLockResult_QNAME = new QName("http://roadnet.com/apex/", "ReleaseStrategicSessionLockResult");
    private final static QName _RetrieveFromPlanningSessionResponseRetrieveFromPlanningSessionResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveFromPlanningSessionResult");
    private final static QName _ExportCustomFormsResponseExportCustomFormsResult_QNAME = new QName("http://roadnet.com/apex/", "ExportCustomFormsResult");
    private final static QName _LockOrdersForStopsResponseLockOrdersForStopsResult_QNAME = new QName("http://roadnet.com/apex/", "LockOrdersForStopsResult");
    private final static QName _LockOrdersForRoutesResponseLockOrdersForRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "LockOrdersForRoutesResult");
    private final static QName _UnlockOrdersForStopsResponseUnlockOrdersForStopsResult_QNAME = new QName("http://roadnet.com/apex/", "UnlockOrdersForStopsResult");
    private final static QName _UnlockOrdersForRoutesResponseUnlockOrdersForRoutesResult_QNAME = new QName("http://roadnet.com/apex/", "UnlockOrdersForRoutesResult");
    private final static QName _LoadRouteResponseLoadRouteResult_QNAME = new QName("http://roadnet.com/apex/", "LoadRouteResult");
    private final static QName _RetrieveRoutesForDeviceResponseRetrieveRoutesForDeviceResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveRoutesForDeviceResult");
    private final static QName _PreviewRouteResponsePreviewRouteResult_QNAME = new QName("http://roadnet.com/apex/", "PreviewRouteResult");
    private final static QName _ProcessMobileDeviceActionsWorkerEntityKey_QNAME = new QName("http://roadnet.com/apex/", "workerEntityKey");
    private final static QName _ProcessMobileDeviceActionsActions_QNAME = new QName("http://roadnet.com/apex/", "actions");
    private final static QName _SendTextMessageToDriverMessage_QNAME = new QName("http://roadnet.com/apex/", "message");
    private final static QName _SendInstallUriToDevicesMobileDeviceEntityKeys_QNAME = new QName("http://roadnet.com/apex/", "mobileDeviceEntityKeys");
    private final static QName _SendInstallUriToDevicesResponseSendInstallUriToDevicesResult_QNAME = new QName("http://roadnet.com/apex/", "SendInstallUriToDevicesResult");
    private final static QName _SendTelematicsDeviceConfigurationTelematicsDeviceEntityKeys_QNAME = new QName("http://roadnet.com/apex/", "telematicsDeviceEntityKeys");
    private final static QName _UpgradeRoadnetTelematicsDeviceConfigurationDeviceUpgradeInfo_QNAME = new QName("http://roadnet.com/apex/", "deviceUpgradeInfo");
    private final static QName _IgnoreRouteErrorsRouteInstanceList_QNAME = new QName("http://roadnet.com/apex/", "routeInstanceList");
    private final static QName _IgnoreRouteErrorsResponseIgnoreRouteErrorsResult_QNAME = new QName("http://roadnet.com/apex/", "IgnoreRouteErrorsResult");
    private final static QName _RefreshOmnitracsNavigationDeviceActivationCodeResponseRefreshOmnitracsNavigationDeviceActivationCodeResult_QNAME = new QName("http://roadnet.com/apex/", "RefreshOmnitracsNavigationDeviceActivationCodeResult");
    private final static QName _RetrieveNavigationDeviceStatusResponseRetrieveNavigationDeviceStatusResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveNavigationDeviceStatusResult");
    private final static QName _DeleteUnassignedOrderGroupsGroupInstances_QNAME = new QName("http://roadnet.com/apex/", "groupInstances");
    private final static QName _OverrideCoordinateForUnassignedOrderGroupGroupInstance_QNAME = new QName("http://roadnet.com/apex/", "groupInstance");
    private final static QName _CreateRouteTemplateRouteTemplateArgs_QNAME = new QName("http://roadnet.com/apex/", "routeTemplateArgs");
    private final static QName _CreateRouteTemplateResponseCreateRouteTemplateResult_QNAME = new QName("http://roadnet.com/apex/", "CreateRouteTemplateResult");
    private final static QName _UpdateRouteTemplatesResponseUpdateRouteTemplatesResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateRouteTemplatesResult");
    private final static QName _UpdateRouteTemplateResponseUpdateRouteTemplateResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateRouteTemplateResult");
    private final static QName _DeleteRouteTemplatesRouteTemplateInstances_QNAME = new QName("http://roadnet.com/apex/", "routeTemplateInstances");
    private final static QName _CombineRouteTemplatesDestinationRouteTemplateInstance_QNAME = new QName("http://roadnet.com/apex/", "destinationRouteTemplateInstance");
    private final static QName _CombineRouteTemplatesResponseCombineRouteTemplatesResult_QNAME = new QName("http://roadnet.com/apex/", "CombineRouteTemplatesResult");
    private final static QName _FlipRouteTemplateRouteTemplateInstance_QNAME = new QName("http://roadnet.com/apex/", "routeTemplateInstance");
    private final static QName _FlipRouteTemplateResponseFlipRouteTemplateResult_QNAME = new QName("http://roadnet.com/apex/", "FlipRouteTemplateResult");
    private final static QName _BalanceRouteTemplatesResponseBalanceRouteTemplatesResult_QNAME = new QName("http://roadnet.com/apex/", "BalanceRouteTemplatesResult");
    private final static QName _SequenceRouteTemplateResponseSequenceRouteTemplateResult_QNAME = new QName("http://roadnet.com/apex/", "SequenceRouteTemplateResult");
    private final static QName _SequenceRouteTemplateRangeResponseSequenceRouteTemplateRangeResult_QNAME = new QName("http://roadnet.com/apex/", "SequenceRouteTemplateRangeResult");
    private final static QName _InsertStopTemplatesResponseInsertStopTemplatesResult_QNAME = new QName("http://roadnet.com/apex/", "InsertStopTemplatesResult");
    private final static QName _InsertStopTemplatesAtBestPositionResponseInsertStopTemplatesAtBestPositionResult_QNAME = new QName("http://roadnet.com/apex/", "InsertStopTemplatesAtBestPositionResult");
    private final static QName _DeleteStopTemplatesStopTemplateEntityKeys_QNAME = new QName("http://roadnet.com/apex/", "stopTemplateEntityKeys");
    private final static QName _DeleteStopTemplatesResponseDeleteStopTemplatesResult_QNAME = new QName("http://roadnet.com/apex/", "DeleteStopTemplatesResult");
    private final static QName _MoveStopTemplatesResponseMoveStopTemplatesResult_QNAME = new QName("http://roadnet.com/apex/", "MoveStopTemplatesResult");
    private final static QName _MoveStopTemplatesAndLocationsResponseMoveStopTemplatesAndLocationsResult_QNAME = new QName("http://roadnet.com/apex/", "MoveStopTemplatesAndLocationsResult");
    private final static QName _MoveStopTemplatesToBestPositionResponseMoveStopTemplatesToBestPositionResult_QNAME = new QName("http://roadnet.com/apex/", "MoveStopTemplatesToBestPositionResult");
    private final static QName _MoveStopTemplatesAndLocationsToBestPositionResponseMoveStopTemplatesAndLocationsToBestPositionResult_QNAME = new QName("http://roadnet.com/apex/", "MoveStopTemplatesAndLocationsToBestPositionResult");
    private final static QName _InsertMidRouteDepotStopTemplateResponseInsertMidRouteDepotStopTemplateResult_QNAME = new QName("http://roadnet.com/apex/", "InsertMidRouteDepotStopTemplateResult");
    private final static QName _UpdateMidRouteDepotStopTemplateOwningRouteTemplateInstance_QNAME = new QName("http://roadnet.com/apex/", "owningRouteTemplateInstance");
    private final static QName _UpdateMidRouteDepotStopTemplateResponseUpdateMidRouteDepotStopTemplateResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateMidRouteDepotStopTemplateResult");
    private final static QName _InsertLayoverStopTemplateResponseInsertLayoverStopTemplateResult_QNAME = new QName("http://roadnet.com/apex/", "InsertLayoverStopTemplateResult");
    private final static QName _UpdateLayoverStopTemplateResponseUpdateLayoverStopTemplateResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateLayoverStopTemplateResult");
    private final static QName _SuggestTemplateLayoversResponseSuggestTemplateLayoversResult_QNAME = new QName("http://roadnet.com/apex/", "SuggestTemplateLayoversResult");
    private final static QName _SuggestRouteTemplateForServiceLocationCandidates_QNAME = new QName("http://roadnet.com/apex/", "candidates");
    private final static QName _SuggestRouteTemplateForServiceLocationResponseSuggestRouteTemplateForServiceLocationResult_QNAME = new QName("http://roadnet.com/apex/", "SuggestRouteTemplateForServiceLocationResult");
    private final static QName _SaveRouteTemplateFromRouteSaveArgs_QNAME = new QName("http://roadnet.com/apex/", "saveArgs");
    private final static QName _SaveRouteTemplateFromRouteResponseSaveRouteTemplateFromRouteResult_QNAME = new QName("http://roadnet.com/apex/", "SaveRouteTemplateFromRouteResult");
    private final static QName _SendOrdersResponseSendOrdersResult_QNAME = new QName("http://roadnet.com/apex/", "SendOrdersResult");
    private final static QName _SuggestRouteForUnassignedOrderGroupUnassignedOrderGroupInstance_QNAME = new QName("http://roadnet.com/apex/", "unassignedOrderGroupInstance");
    private final static QName _SuggestRouteForUnassignedOrderGroupResponseSuggestRouteForUnassignedOrderGroupResult_QNAME = new QName("http://roadnet.com/apex/", "SuggestRouteForUnassignedOrderGroupResult");
    private final static QName _SuggestRouteForServiceableStopResponseSuggestRouteForServiceableStopResult_QNAME = new QName("http://roadnet.com/apex/", "SuggestRouteForServiceableStopResult");
    private final static QName _SaveObjects_QNAME = new QName("http://roadnet.com/apex/", "objects");
    private final static QName _SaveResponseSaveResult_QNAME = new QName("http://roadnet.com/apex/", "SaveResult");
    private final static QName _ApplyCustomExtensionsResponseApplyCustomExtensionsResult_QNAME = new QName("http://roadnet.com/apex/", "ApplyCustomExtensionsResult");
    private final static QName _AutoCreateRoutingSessionDate_QNAME = new QName("http://roadnet.com/apex/", "date");
    private final static QName _AutoCreateRoutingSessionResponseAutoCreateRoutingSessionResult_QNAME = new QName("http://roadnet.com/apex/", "AutoCreateRoutingSessionResult");
    private final static QName _AutoCreateRoutingSessionAdvancedAdditionalDescription_QNAME = new QName("http://roadnet.com/apex/", "additionalDescription");
    private final static QName _AutoCreateRoutingSessionAdvancedDepotEntityKey_QNAME = new QName("http://roadnet.com/apex/", "depotEntityKey");
    private final static QName _AutoCreateRoutingSessionAdvancedResponseAutoCreateRoutingSessionAdvancedResult_QNAME = new QName("http://roadnet.com/apex/", "AutoCreateRoutingSessionAdvancedResult");
    private final static QName _UpdateActivePassRoutingSessions_QNAME = new QName("http://roadnet.com/apex/", "routingSessions");
    private final static QName _RouteUnassignedOrdersUnassignedOrders_QNAME = new QName("http://roadnet.com/apex/", "unassignedOrders");
    private final static QName _RouteUnassignedOrderGroupsUnassignedOrderGroups_QNAME = new QName("http://roadnet.com/apex/", "unassignedOrderGroups");
    private final static QName _FindAndRouteUnassignedOrdersOrderCriteria_QNAME = new QName("http://roadnet.com/apex/", "orderCriteria");
    private final static QName _GenerateRouteTravelPathResponseGenerateRouteTravelPathResult_QNAME = new QName("http://roadnet.com/apex/", "GenerateRouteTravelPathResult");
    private final static QName _GenerateRoutePathResponseGenerateRoutePathResult_QNAME = new QName("http://roadnet.com/apex/", "GenerateRoutePathResult");
    private final static QName _GenerateRouteTemplateTravelPathResponseGenerateRouteTemplateTravelPathResult_QNAME = new QName("http://roadnet.com/apex/", "GenerateRouteTemplateTravelPathResult");
    private final static QName _ReportClientStatisticsClientStatistics_QNAME = new QName("http://roadnet.com/apex/", "clientStatistics");
    private final static QName _CreateStaticRoutesFromTemplateSetWithSessionKeyRouteTemplateSetKey_QNAME = new QName("http://roadnet.com/apex/", "routeTemplateSetKey");
    private final static QName _CreateStaticRoutesFromTemplateSetWithSessionDateSessionDate_QNAME = new QName("http://roadnet.com/apex/", "sessionDate");
    private final static QName _UploadDiagnosticsInformationDiagnosticsInformation_QNAME = new QName("http://roadnet.com/apex/", "diagnosticsInformation");
    private final static QName _RetrieveClientLogListResponseRetrieveClientLogListResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveClientLogListResult");
    private final static QName _GetMergedClientLogFileResponseGetMergedClientLogFileResult_QNAME = new QName("http://roadnet.com/apex/", "GetMergedClientLogFileResult");
    private final static QName _RetrieveClientApplicationVersionResponseRetrieveClientApplicationVersionResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveClientApplicationVersionResult");
    private final static QName _RetrieveClientApplicationVersionsResponseRetrieveClientApplicationVersionsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveClientApplicationVersionsResult");
    private final static QName _RetrieveGeneralReleaseClientApplicationVersionResponseRetrieveGeneralReleaseClientApplicationVersionResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveGeneralReleaseClientApplicationVersionResult");
    private final static QName _RetrieveAdminResponseRetrieveAdminResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveAdminResult");
    private final static QName _RetrieveQueuedMatrixBuildRequestMessagesResponseRetrieveQueuedMatrixBuildRequestMessagesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveQueuedMatrixBuildRequestMessagesResult");
    private final static QName _RetrieveQueuedMatrixBuildRequestResultsResponseRetrieveQueuedMatrixBuildRequestResultsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveQueuedMatrixBuildRequestResultsResult");
    private final static QName _RetrieveCustomerRegionMatrixStatisticsStatsDate_QNAME = new QName("http://roadnet.com/apex/", "statsDate");
    private final static QName _RetrieveCustomerRegionMatrixStatisticsResponseRetrieveCustomerRegionMatrixStatisticsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveCustomerRegionMatrixStatisticsResult");
    private final static QName _MultiRetrieveAdminResponseMultiRetrieveAdminResult_QNAME = new QName("http://roadnet.com/apex/", "MultiRetrieveAdminResult");
    private final static QName _RetrieveMatrixResultsResponseRetrieveMatrixResultsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveMatrixResultsResult");
    private final static QName _RetrieveCurrentlyBuildingMatrixBuildResultsFileResponseRetrieveCurrentlyBuildingMatrixBuildResultsFileResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveCurrentlyBuildingMatrixBuildResultsFileResult");
    private final static QName _RetrieveMatrixBuildResultsFileResponseRetrieveMatrixBuildResultsFileResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveMatrixBuildResultsFileResult");
    private final static QName _RetrieveAdminReportsResponseRetrieveAdminReportsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveAdminReportsResult");
    private final static QName _SaveAdminResponseSaveAdminResult_QNAME = new QName("http://roadnet.com/apex/", "SaveAdminResult");
    private final static QName _SendNewUserEmailUserEntityKeys_QNAME = new QName("http://roadnet.com/apex/", "userEntityKeys");
    private final static QName _SendNewUserEmailResponseSendNewUserEmailResult_QNAME = new QName("http://roadnet.com/apex/", "SendNewUserEmailResult");
    private final static QName _ToggleMatrixBuildEnabledForCustomerRegionsRegionEntityKeys_QNAME = new QName("http://roadnet.com/apex/", "regionEntityKeys");
    private final static QName _ToggleMatrixBuildEnabledForCustomerRegionsResponseToggleMatrixBuildEnabledForCustomerRegionsResult_QNAME = new QName("http://roadnet.com/apex/", "ToggleMatrixBuildEnabledForCustomerRegionsResult");
    private final static QName _RetrieveDataWarehouseIntegrationStatusResponseRetrieveDataWarehouseIntegrationStatusResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveDataWarehouseIntegrationStatusResult");
    private final static QName _ResetDataWarehouseIntegrationStatusResponseResetDataWarehouseIntegrationStatusResult_QNAME = new QName("http://roadnet.com/apex/", "ResetDataWarehouseIntegrationStatusResult");
    private final static QName _TestCustomerXrsSettingsResponseTestCustomerXrsSettingsResult_QNAME = new QName("http://roadnet.com/apex/", "TestCustomerXrsSettingsResult");
    private final static QName _UploadCustomReportResponseUploadCustomReportResult_QNAME = new QName("http://roadnet.com/apex/", "UploadCustomReportResult");
    private final static QName _RetrieveCustomReportsReportOptions_QNAME = new QName("http://roadnet.com/apex/", "reportOptions");
    private final static QName _RetrieveCustomReportsResponseRetrieveCustomReportsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveCustomReportsResult");
    private final static QName _RetrieveCustomReportResponseRetrieveCustomReportResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveCustomReportResult");
    private final static QName _LookupMobileDevicesResponseLookupMobileDevicesResult_QNAME = new QName("http://roadnet.com/apex/", "LookupMobileDevicesResult");
    private final static QName _CreateTopLevelComplianceRegionResponseCreateTopLevelComplianceRegionResult_QNAME = new QName("http://roadnet.com/apex/", "CreateTopLevelComplianceRegionResult");
    private final static QName _CreateTopLevelComplianceRegion2ResponseCreateTopLevelComplianceRegion2Result_QNAME = new QName("http://roadnet.com/apex/", "CreateTopLevelComplianceRegion2Result");
    private final static QName _RetrieveCustomersWithXrsServiceUrlResponseRetrieveCustomersWithXrsServiceUrlResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveCustomersWithXrsServiceUrlResult");
    private final static QName _RetrieveCustomerLoggingSettingsResponseRetrieveCustomerLoggingSettingsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveCustomerLoggingSettingsResult");
    private final static QName _ApplyEditEditRecordDto_QNAME = new QName("http://roadnet.com/apex/", "editRecordDto");
    private final static QName _RetrieveEditOperationsCriteria_QNAME = new QName("http://roadnet.com/apex/", "criteria");
    private final static QName _RetrieveEditOperationsResponseRetrieveEditOperationsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveEditOperationsResult");
    private final static QName _ProcessCommunityEditRequestResponseProcessCommunityEditRequestResult_QNAME = new QName("http://roadnet.com/apex/", "ProcessCommunityEditRequestResult");
    private final static QName _RetrieveMapInfoResponseRetrieveMapInfoResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveMapInfoResult");
    private final static QName _RetrieveDeltaMapEditsResponseRetrieveDeltaMapEditsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveDeltaMapEditsResult");
    private final static QName _RetrieveFullMapEditsResponseRetrieveFullMapEditsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveFullMapEditsResult");
    private final static QName _RetrieveNodesDetailResponseRetrieveNodesDetailResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveNodesDetailResult");
    private final static QName _UpdateArcsArcsToUpdate_QNAME = new QName("http://roadnet.com/apex/", "arcsToUpdate");
    private final static QName _UpdateArcsResponseUpdateArcsResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateArcsResult");
    private final static QName _UpdateImpasseImpasseDto_QNAME = new QName("http://roadnet.com/apex/", "impasseDto");
    private final static QName _RetrieveMapDataRegionInfoResponseRetrieveMapDataRegionInfoResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveMapDataRegionInfoResult");
    private final static QName _RetrieveArcsResponseRetrieveArcsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveArcsResult");
    private final static QName _PopulateArcsNetworkIDs_QNAME = new QName("http://roadnet.com/apex/", "networkIDs");
    private final static QName _PopulateArcsResponsePopulateArcsResult_QNAME = new QName("http://roadnet.com/apex/", "PopulateArcsResult");
    private final static QName _RetrieveMapChangedAreasViewport_QNAME = new QName("http://roadnet.com/apex/", "viewport");
    private final static QName _RetrieveMapChangedAreasResponseRetrieveMapChangedAreasResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveMapChangedAreasResult");
    private final static QName _RetrieveNodesResponseRetrieveNodesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveNodesResult");
    private final static QName _ApplyArcUpdatesResponseApplyArcUpdatesResult_QNAME = new QName("http://roadnet.com/apex/", "ApplyArcUpdatesResult");
    private final static QName _GeocodeResponseGeocodeResult_QNAME = new QName("http://roadnet.com/apex/", "GeocodeResult");
    private final static QName _StartGeocodeLocationsJobLocationEntityKeys_QNAME = new QName("http://roadnet.com/apex/", "LocationEntityKeys");
    private final static QName _RetrieveGeocodeCandidatesResponseRetrieveGeocodeCandidatesResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveGeocodeCandidatesResult");
    private final static QName _GenerateTravelPathResponseGenerateTravelPathResult_QNAME = new QName("http://roadnet.com/apex/", "GenerateTravelPathResult");
    private final static QName _RetrieveRouteShieldsResponseRetrieveRouteShieldsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveRouteShieldsResult");
    private final static QName _RetrievePositionTextResponseRetrievePositionTextResult_QNAME = new QName("http://roadnet.com/apex/", "RetrievePositionTextResult");
    private final static QName _RetrievePositionTextListCoordinates_QNAME = new QName("http://roadnet.com/apex/", "coordinates");
    private final static QName _RetrievePositionTextListResponseRetrievePositionTextListResult_QNAME = new QName("http://roadnet.com/apex/", "RetrievePositionTextListResult");
    private final static QName _CalculateDistanceByJurisdictionFromCoordinate_QNAME = new QName("http://roadnet.com/apex/", "fromCoordinate");
    private final static QName _CalculateDistanceByJurisdictionToCoordinate_QNAME = new QName("http://roadnet.com/apex/", "toCoordinate");
    private final static QName _CalculateDistanceByJurisdictionResponseCalculateDistanceByJurisdictionResult_QNAME = new QName("http://roadnet.com/apex/", "CalculateDistanceByJurisdictionResult");
    private final static QName _RetrieveTravelModelResponseRetrieveTravelModelResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveTravelModelResult");
    private final static QName _UpdateTravelModelTravelModelDto_QNAME = new QName("http://roadnet.com/apex/", "travelModelDto");
    private final static QName _RetrieveRestrictedPathsAndPolygonsResponseRetrieveRestrictedPathsAndPolygonsResult_QNAME = new QName("http://roadnet.com/apex/", "RetrieveRestrictedPathsAndPolygonsResult");
    private final static QName _UpdateRestrictedPathTravelPath_QNAME = new QName("http://roadnet.com/apex/", "travelPath");
    private final static QName _UpdateRestrictedPathResponseUpdateRestrictedPathResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateRestrictedPathResult");
    private final static QName _UpdateTravelPolygonTravelPolygon_QNAME = new QName("http://roadnet.com/apex/", "travelPolygon");
    private final static QName _UpdateTravelPolygonResponseUpdateTravelPolygonResult_QNAME = new QName("http://roadnet.com/apex/", "UpdateTravelPolygonResult");
    private final static QName _PerformSearchResponsePerformSearchResult_QNAME = new QName("http://roadnet.com/apex/", "PerformSearchResult");
    private final static QName _SavePositionsParametersDataPoints_QNAME = new QName("http://roadnet.com/apex/", "DataPoints");
    private final static QName _SavePositionsParametersEquipmentEntityKey_QNAME = new QName("http://roadnet.com/apex/", "EquipmentEntityKey");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.roadnet.apex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginAdmin }
     * 
     */
    public LoginAdmin createLoginAdmin() {
        return new LoginAdmin();
    }

    /**
     * Create an instance of {@link LoginAdminResponse }
     * 
     */
    public LoginAdminResponse createLoginAdminResponse() {
        return new LoginAdminResponse();
    }

    /**
     * Create an instance of {@link LoginAdminWithAppInfo }
     * 
     */
    public LoginAdminWithAppInfo createLoginAdminWithAppInfo() {
        return new LoginAdminWithAppInfo();
    }

    /**
     * Create an instance of {@link LoginAdminWithAppInfoResponse }
     * 
     */
    public LoginAdminWithAppInfoResponse createLoginAdminWithAppInfoResponse() {
        return new LoginAdminWithAppInfoResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link LookupPasswordPolicy }
     * 
     */
    public LookupPasswordPolicy createLookupPasswordPolicy() {
        return new LookupPasswordPolicy();
    }

    /**
     * Create an instance of {@link LookupPasswordPolicyResponse }
     * 
     */
    public LookupPasswordPolicyResponse createLookupPasswordPolicyResponse() {
        return new LookupPasswordPolicyResponse();
    }

    /**
     * Create an instance of {@link LookupAdminPasswordPolicy }
     * 
     */
    public LookupAdminPasswordPolicy createLookupAdminPasswordPolicy() {
        return new LookupAdminPasswordPolicy();
    }

    /**
     * Create an instance of {@link LookupAdminPasswordPolicyResponse }
     * 
     */
    public LookupAdminPasswordPolicyResponse createLookupAdminPasswordPolicyResponse() {
        return new LookupAdminPasswordPolicyResponse();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link ChangeAdminPassword }
     * 
     */
    public ChangeAdminPassword createChangeAdminPassword() {
        return new ChangeAdminPassword();
    }

    /**
     * Create an instance of {@link ChangeAdminPasswordResponse }
     * 
     */
    public ChangeAdminPasswordResponse createChangeAdminPasswordResponse() {
        return new ChangeAdminPasswordResponse();
    }

    /**
     * Create an instance of {@link ForgotPassword }
     * 
     */
    public ForgotPassword createForgotPassword() {
        return new ForgotPassword();
    }

    /**
     * Create an instance of {@link ForgotPasswordResponse }
     * 
     */
    public ForgotPasswordResponse createForgotPasswordResponse() {
        return new ForgotPasswordResponse();
    }

    /**
     * Create an instance of {@link ForgotAdminPassword }
     * 
     */
    public ForgotAdminPassword createForgotAdminPassword() {
        return new ForgotAdminPassword();
    }

    /**
     * Create an instance of {@link ForgotAdminPasswordResponse }
     * 
     */
    public ForgotAdminPasswordResponse createForgotAdminPasswordResponse() {
        return new ForgotAdminPasswordResponse();
    }

    /**
     * Create an instance of {@link LookupMobileDevice }
     * 
     */
    public LookupMobileDevice createLookupMobileDevice() {
        return new LookupMobileDevice();
    }

    /**
     * Create an instance of {@link LookupMobileDeviceResponse }
     * 
     */
    public LookupMobileDeviceResponse createLookupMobileDeviceResponse() {
        return new LookupMobileDeviceResponse();
    }

    /**
     * Create an instance of {@link LookupTelematicsDevice }
     * 
     */
    public LookupTelematicsDevice createLookupTelematicsDevice() {
        return new LookupTelematicsDevice();
    }

    /**
     * Create an instance of {@link LookupTelematicsDeviceResponse }
     * 
     */
    public LookupTelematicsDeviceResponse createLookupTelematicsDeviceResponse() {
        return new LookupTelematicsDeviceResponse();
    }

    /**
     * Create an instance of {@link LoginSupport }
     * 
     */
    public LoginSupport createLoginSupport() {
        return new LoginSupport();
    }

    /**
     * Create an instance of {@link LoginSupportResponse }
     * 
     */
    public LoginSupportResponse createLoginSupportResponse() {
        return new LoginSupportResponse();
    }

    /**
     * Create an instance of {@link LoginSingleSignOn }
     * 
     */
    public LoginSingleSignOn createLoginSingleSignOn() {
        return new LoginSingleSignOn();
    }

    /**
     * Create an instance of {@link LoginSingleSignOnResponse }
     * 
     */
    public LoginSingleSignOnResponse createLoginSingleSignOnResponse() {
        return new LoginSingleSignOnResponse();
    }

    /**
     * Create an instance of {@link LookupLoginResult }
     * 
     */
    public LookupLoginResult createLookupLoginResult() {
        return new LookupLoginResult();
    }

    /**
     * Create an instance of {@link LookupLoginResultResponse }
     * 
     */
    public LookupLoginResultResponse createLookupLoginResultResponse() {
        return new LookupLoginResultResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerByXrsCompanyLoginId }
     * 
     */
    public RetrieveCustomerByXrsCompanyLoginId createRetrieveCustomerByXrsCompanyLoginId() {
        return new RetrieveCustomerByXrsCompanyLoginId();
    }

    /**
     * Create an instance of {@link RetrieveCustomerByXrsCompanyLoginIdResponse }
     * 
     */
    public RetrieveCustomerByXrsCompanyLoginIdResponse createRetrieveCustomerByXrsCompanyLoginIdResponse() {
        return new RetrieveCustomerByXrsCompanyLoginIdResponse();
    }

    /**
     * Create an instance of {@link MultiRetrieve }
     * 
     */
    public MultiRetrieve createMultiRetrieve() {
        return new MultiRetrieve();
    }

    /**
     * Create an instance of {@link MultiRetrieveResponse }
     * 
     */
    public MultiRetrieveResponse createMultiRetrieveResponse() {
        return new MultiRetrieveResponse();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link RetrieveDiscussionsByEntity }
     * 
     */
    public RetrieveDiscussionsByEntity createRetrieveDiscussionsByEntity() {
        return new RetrieveDiscussionsByEntity();
    }

    /**
     * Create an instance of {@link RetrieveDiscussionsByEntityResponse }
     * 
     */
    public RetrieveDiscussionsByEntityResponse createRetrieveDiscussionsByEntityResponse() {
        return new RetrieveDiscussionsByEntityResponse();
    }

    /**
     * Create an instance of {@link RetrieveDiscussionNotifications }
     * 
     */
    public RetrieveDiscussionNotifications createRetrieveDiscussionNotifications() {
        return new RetrieveDiscussionNotifications();
    }

    /**
     * Create an instance of {@link RetrieveDiscussionNotificationsResponse }
     * 
     */
    public RetrieveDiscussionNotificationsResponse createRetrieveDiscussionNotificationsResponse() {
        return new RetrieveDiscussionNotificationsResponse();
    }

    /**
     * Create an instance of {@link ResetUserDiscussionActivity }
     * 
     */
    public ResetUserDiscussionActivity createResetUserDiscussionActivity() {
        return new ResetUserDiscussionActivity();
    }

    /**
     * Create an instance of {@link ResetUserDiscussionActivityResponse }
     * 
     */
    public ResetUserDiscussionActivityResponse createResetUserDiscussionActivityResponse() {
        return new ResetUserDiscussionActivityResponse();
    }

    /**
     * Create an instance of {@link RetrieveBusinessUnitsGrantingPermissions }
     * 
     */
    public RetrieveBusinessUnitsGrantingPermissions createRetrieveBusinessUnitsGrantingPermissions() {
        return new RetrieveBusinessUnitsGrantingPermissions();
    }

    /**
     * Create an instance of {@link RetrieveBusinessUnitsGrantingPermissionsResponse }
     * 
     */
    public RetrieveBusinessUnitsGrantingPermissionsResponse createRetrieveBusinessUnitsGrantingPermissionsResponse() {
        return new RetrieveBusinessUnitsGrantingPermissionsResponse();
    }

    /**
     * Create an instance of {@link RetrieveRegionsGrantingPermissions }
     * 
     */
    public RetrieveRegionsGrantingPermissions createRetrieveRegionsGrantingPermissions() {
        return new RetrieveRegionsGrantingPermissions();
    }

    /**
     * Create an instance of {@link RetrieveRegionsGrantingPermissionsResponse }
     * 
     */
    public RetrieveRegionsGrantingPermissionsResponse createRetrieveRegionsGrantingPermissionsResponse() {
        return new RetrieveRegionsGrantingPermissionsResponse();
    }

    /**
     * Create an instance of {@link RetrieveRegions }
     * 
     */
    public RetrieveRegions createRetrieveRegions() {
        return new RetrieveRegions();
    }

    /**
     * Create an instance of {@link RetrieveRegionsResponse }
     * 
     */
    public RetrieveRegionsResponse createRetrieveRegionsResponse() {
        return new RetrieveRegionsResponse();
    }

    /**
     * Create an instance of {@link RetrieveOperationalRegions }
     * 
     */
    public RetrieveOperationalRegions createRetrieveOperationalRegions() {
        return new RetrieveOperationalRegions();
    }

    /**
     * Create an instance of {@link RetrieveOperationalRegionsResponse }
     * 
     */
    public RetrieveOperationalRegionsResponse createRetrieveOperationalRegionsResponse() {
        return new RetrieveOperationalRegionsResponse();
    }

    /**
     * Create an instance of {@link RetrieveUserPermissions }
     * 
     */
    public RetrieveUserPermissions createRetrieveUserPermissions() {
        return new RetrieveUserPermissions();
    }

    /**
     * Create an instance of {@link RetrieveUserPermissionsResponse }
     * 
     */
    public RetrieveUserPermissionsResponse createRetrieveUserPermissionsResponse() {
        return new RetrieveUserPermissionsResponse();
    }

    /**
     * Create an instance of {@link RetrieveReports }
     * 
     */
    public RetrieveReports createRetrieveReports() {
        return new RetrieveReports();
    }

    /**
     * Create an instance of {@link RetrieveReportsResponse }
     * 
     */
    public RetrieveReportsResponse createRetrieveReportsResponse() {
        return new RetrieveReportsResponse();
    }

    /**
     * Create an instance of {@link RetrieveTransferableEntityNames }
     * 
     */
    public RetrieveTransferableEntityNames createRetrieveTransferableEntityNames() {
        return new RetrieveTransferableEntityNames();
    }

    /**
     * Create an instance of {@link RetrieveTransferableEntityNamesResponse }
     * 
     */
    public RetrieveTransferableEntityNamesResponse createRetrieveTransferableEntityNamesResponse() {
        return new RetrieveTransferableEntityNamesResponse();
    }

    /**
     * Create an instance of {@link RetrieveTransferableEntities }
     * 
     */
    public RetrieveTransferableEntities createRetrieveTransferableEntities() {
        return new RetrieveTransferableEntities();
    }

    /**
     * Create an instance of {@link RetrieveTransferableEntitiesResponse }
     * 
     */
    public RetrieveTransferableEntitiesResponse createRetrieveTransferableEntitiesResponse() {
        return new RetrieveTransferableEntitiesResponse();
    }

    /**
     * Create an instance of {@link RetrieveScorecardTemplateCriteriaInfo }
     * 
     */
    public RetrieveScorecardTemplateCriteriaInfo createRetrieveScorecardTemplateCriteriaInfo() {
        return new RetrieveScorecardTemplateCriteriaInfo();
    }

    /**
     * Create an instance of {@link RetrieveScorecardTemplateCriteriaInfoResponse }
     * 
     */
    public RetrieveScorecardTemplateCriteriaInfoResponse createRetrieveScorecardTemplateCriteriaInfoResponse() {
        return new RetrieveScorecardTemplateCriteriaInfoResponse();
    }

    /**
     * Create an instance of {@link RetrieveTransferableEntity }
     * 
     */
    public RetrieveTransferableEntity createRetrieveTransferableEntity() {
        return new RetrieveTransferableEntity();
    }

    /**
     * Create an instance of {@link RetrieveTransferableEntityResponse }
     * 
     */
    public RetrieveTransferableEntityResponse createRetrieveTransferableEntityResponse() {
        return new RetrieveTransferableEntityResponse();
    }

    /**
     * Create an instance of {@link RetrieveUrlsForContext }
     * 
     */
    public RetrieveUrlsForContext createRetrieveUrlsForContext() {
        return new RetrieveUrlsForContext();
    }

    /**
     * Create an instance of {@link RetrieveUrlsForContextResponse }
     * 
     */
    public RetrieveUrlsForContextResponse createRetrieveUrlsForContextResponse() {
        return new RetrieveUrlsForContextResponse();
    }

    /**
     * Create an instance of {@link RetrieveSystemInfo }
     * 
     */
    public RetrieveSystemInfo createRetrieveSystemInfo() {
        return new RetrieveSystemInfo();
    }

    /**
     * Create an instance of {@link RetrieveSystemInfoResponse }
     * 
     */
    public RetrieveSystemInfoResponse createRetrieveSystemInfoResponse() {
        return new RetrieveSystemInfoResponse();
    }

    /**
     * Create an instance of {@link RetrieveCountries }
     * 
     */
    public RetrieveCountries createRetrieveCountries() {
        return new RetrieveCountries();
    }

    /**
     * Create an instance of {@link RetrieveCountriesResponse }
     * 
     */
    public RetrieveCountriesResponse createRetrieveCountriesResponse() {
        return new RetrieveCountriesResponse();
    }

    /**
     * Create an instance of {@link RetrieveLocationComments }
     * 
     */
    public RetrieveLocationComments createRetrieveLocationComments() {
        return new RetrieveLocationComments();
    }

    /**
     * Create an instance of {@link RetrieveLocationCommentsResponse }
     * 
     */
    public RetrieveLocationCommentsResponse createRetrieveLocationCommentsResponse() {
        return new RetrieveLocationCommentsResponse();
    }

    /**
     * Create an instance of {@link RetrieveServiceLocationServiceStatistics }
     * 
     */
    public RetrieveServiceLocationServiceStatistics createRetrieveServiceLocationServiceStatistics() {
        return new RetrieveServiceLocationServiceStatistics();
    }

    /**
     * Create an instance of {@link RetrieveServiceLocationServiceStatisticsResponse }
     * 
     */
    public RetrieveServiceLocationServiceStatisticsResponse createRetrieveServiceLocationServiceStatisticsResponse() {
        return new RetrieveServiceLocationServiceStatisticsResponse();
    }

    /**
     * Create an instance of {@link RetrieveDispatchRouteSummaryStatistics }
     * 
     */
    public RetrieveDispatchRouteSummaryStatistics createRetrieveDispatchRouteSummaryStatistics() {
        return new RetrieveDispatchRouteSummaryStatistics();
    }

    /**
     * Create an instance of {@link RetrieveDispatchRouteSummaryStatisticsResponse }
     * 
     */
    public RetrieveDispatchRouteSummaryStatisticsResponse createRetrieveDispatchRouteSummaryStatisticsResponse() {
        return new RetrieveDispatchRouteSummaryStatisticsResponse();
    }

    /**
     * Create an instance of {@link AuthenticateWorker }
     * 
     */
    public AuthenticateWorker createAuthenticateWorker() {
        return new AuthenticateWorker();
    }

    /**
     * Create an instance of {@link AuthenticateWorkerResponse }
     * 
     */
    public AuthenticateWorkerResponse createAuthenticateWorkerResponse() {
        return new AuthenticateWorkerResponse();
    }

    /**
     * Create an instance of {@link RetrieveRouteSignatures }
     * 
     */
    public RetrieveRouteSignatures createRetrieveRouteSignatures() {
        return new RetrieveRouteSignatures();
    }

    /**
     * Create an instance of {@link RetrieveRouteSignaturesResponse }
     * 
     */
    public RetrieveRouteSignaturesResponse createRetrieveRouteSignaturesResponse() {
        return new RetrieveRouteSignaturesResponse();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link SearchByType }
     * 
     */
    public SearchByType createSearchByType() {
        return new SearchByType();
    }

    /**
     * Create an instance of {@link SearchByTypeResponse }
     * 
     */
    public SearchByTypeResponse createSearchByTypeResponse() {
        return new SearchByTypeResponse();
    }

    /**
     * Create an instance of {@link ExecuteReport }
     * 
     */
    public ExecuteReport createExecuteReport() {
        return new ExecuteReport();
    }

    /**
     * Create an instance of {@link ExecuteReportResponse }
     * 
     */
    public ExecuteReportResponse createExecuteReportResponse() {
        return new ExecuteReportResponse();
    }

    /**
     * Create an instance of {@link RetrieveDriverLogs }
     * 
     */
    public RetrieveDriverLogs createRetrieveDriverLogs() {
        return new RetrieveDriverLogs();
    }

    /**
     * Create an instance of {@link RetrieveDriverLogsResponse }
     * 
     */
    public RetrieveDriverLogsResponse createRetrieveDriverLogsResponse() {
        return new RetrieveDriverLogsResponse();
    }

    /**
     * Create an instance of {@link RetrieveDVIRResults }
     * 
     */
    public RetrieveDVIRResults createRetrieveDVIRResults() {
        return new RetrieveDVIRResults();
    }

    /**
     * Create an instance of {@link RetrieveDVIRResultsResponse }
     * 
     */
    public RetrieveDVIRResultsResponse createRetrieveDVIRResultsResponse() {
        return new RetrieveDVIRResultsResponse();
    }

    /**
     * Create an instance of {@link RetrieveAvailableLevelsForRegion }
     * 
     */
    public RetrieveAvailableLevelsForRegion createRetrieveAvailableLevelsForRegion() {
        return new RetrieveAvailableLevelsForRegion();
    }

    /**
     * Create an instance of {@link RetrieveAvailableLevelsForRegionResponse }
     * 
     */
    public RetrieveAvailableLevelsForRegionResponse createRetrieveAvailableLevelsForRegionResponse() {
        return new RetrieveAvailableLevelsForRegionResponse();
    }

    /**
     * Create an instance of {@link ExecuteScorecard }
     * 
     */
    public ExecuteScorecard createExecuteScorecard() {
        return new ExecuteScorecard();
    }

    /**
     * Create an instance of {@link ExecuteScorecardResponse }
     * 
     */
    public ExecuteScorecardResponse createExecuteScorecardResponse() {
        return new ExecuteScorecardResponse();
    }

    /**
     * Create an instance of {@link RequestSalesContact }
     * 
     */
    public RequestSalesContact createRequestSalesContact() {
        return new RequestSalesContact();
    }

    /**
     * Create an instance of {@link RequestSalesContactResponse }
     * 
     */
    public RequestSalesContactResponse createRequestSalesContactResponse() {
        return new RequestSalesContactResponse();
    }

    /**
     * Create an instance of {@link RetrieveOrderInfos }
     * 
     */
    public RetrieveOrderInfos createRetrieveOrderInfos() {
        return new RetrieveOrderInfos();
    }

    /**
     * Create an instance of {@link RetrieveOrderInfosResponse }
     * 
     */
    public RetrieveOrderInfosResponse createRetrieveOrderInfosResponse() {
        return new RetrieveOrderInfosResponse();
    }

    /**
     * Create an instance of {@link ExecuteReportGroup }
     * 
     */
    public ExecuteReportGroup createExecuteReportGroup() {
        return new ExecuteReportGroup();
    }

    /**
     * Create an instance of {@link ExecuteReportGroupResponse }
     * 
     */
    public ExecuteReportGroupResponse createExecuteReportGroupResponse() {
        return new ExecuteReportGroupResponse();
    }

    /**
     * Create an instance of {@link RetrieveLocalizedCultures }
     * 
     */
    public RetrieveLocalizedCultures createRetrieveLocalizedCultures() {
        return new RetrieveLocalizedCultures();
    }

    /**
     * Create an instance of {@link RetrieveLocalizedCulturesResponse }
     * 
     */
    public RetrieveLocalizedCulturesResponse createRetrieveLocalizedCulturesResponse() {
        return new RetrieveLocalizedCulturesResponse();
    }

    /**
     * Create an instance of {@link RetrieveSharedEntityAccessors }
     * 
     */
    public RetrieveSharedEntityAccessors createRetrieveSharedEntityAccessors() {
        return new RetrieveSharedEntityAccessors();
    }

    /**
     * Create an instance of {@link RetrieveSharedEntityAccessorsResponse }
     * 
     */
    public RetrieveSharedEntityAccessorsResponse createRetrieveSharedEntityAccessorsResponse() {
        return new RetrieveSharedEntityAccessorsResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomFormsForRoute }
     * 
     */
    public RetrieveCustomFormsForRoute createRetrieveCustomFormsForRoute() {
        return new RetrieveCustomFormsForRoute();
    }

    /**
     * Create an instance of {@link RetrieveCustomFormsForRouteResponse }
     * 
     */
    public RetrieveCustomFormsForRouteResponse createRetrieveCustomFormsForRouteResponse() {
        return new RetrieveCustomFormsForRouteResponse();
    }

    /**
     * Create an instance of {@link RetrieveRoutelessCustomForms }
     * 
     */
    public RetrieveRoutelessCustomForms createRetrieveRoutelessCustomForms() {
        return new RetrieveRoutelessCustomForms();
    }

    /**
     * Create an instance of {@link RetrieveRoutelessCustomFormsResponse }
     * 
     */
    public RetrieveRoutelessCustomFormsResponse createRetrieveRoutelessCustomFormsResponse() {
        return new RetrieveRoutelessCustomFormsResponse();
    }

    /**
     * Create an instance of {@link RetrieveWorkerAlertAssignmentsForRoute }
     * 
     */
    public RetrieveWorkerAlertAssignmentsForRoute createRetrieveWorkerAlertAssignmentsForRoute() {
        return new RetrieveWorkerAlertAssignmentsForRoute();
    }

    /**
     * Create an instance of {@link RetrieveWorkerAlertAssignmentsForRouteResponse }
     * 
     */
    public RetrieveWorkerAlertAssignmentsForRouteResponse createRetrieveWorkerAlertAssignmentsForRouteResponse() {
        return new RetrieveWorkerAlertAssignmentsForRouteResponse();
    }

    /**
     * Create an instance of {@link ExecuteServicePatternAnalyzer }
     * 
     */
    public ExecuteServicePatternAnalyzer createExecuteServicePatternAnalyzer() {
        return new ExecuteServicePatternAnalyzer();
    }

    /**
     * Create an instance of {@link ExecuteServicePatternAnalyzerResponse }
     * 
     */
    public ExecuteServicePatternAnalyzerResponse createExecuteServicePatternAnalyzerResponse() {
        return new ExecuteServicePatternAnalyzerResponse();
    }

    /**
     * Create an instance of {@link RetrieveHosRuleSets }
     * 
     */
    public RetrieveHosRuleSets createRetrieveHosRuleSets() {
        return new RetrieveHosRuleSets();
    }

    /**
     * Create an instance of {@link RetrieveHosRuleSetsResponse }
     * 
     */
    public RetrieveHosRuleSetsResponse createRetrieveHosRuleSetsResponse() {
        return new RetrieveHosRuleSetsResponse();
    }

    /**
     * Create an instance of {@link ValidateHosRuleSets }
     * 
     */
    public ValidateHosRuleSets createValidateHosRuleSets() {
        return new ValidateHosRuleSets();
    }

    /**
     * Create an instance of {@link ValidateHosRuleSetsResponse }
     * 
     */
    public ValidateHosRuleSetsResponse createValidateHosRuleSetsResponse() {
        return new ValidateHosRuleSetsResponse();
    }

    /**
     * Create an instance of {@link RetrieveEldComplianceDate }
     * 
     */
    public RetrieveEldComplianceDate createRetrieveEldComplianceDate() {
        return new RetrieveEldComplianceDate();
    }

    /**
     * Create an instance of {@link RetrieveEldComplianceDateResponse }
     * 
     */
    public RetrieveEldComplianceDateResponse createRetrieveEldComplianceDateResponse() {
        return new RetrieveEldComplianceDateResponse();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentProfileForTelematicsDevice }
     * 
     */
    public RetrieveEquipmentProfileForTelematicsDevice createRetrieveEquipmentProfileForTelematicsDevice() {
        return new RetrieveEquipmentProfileForTelematicsDevice();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentProfileForTelematicsDeviceResponse }
     * 
     */
    public RetrieveEquipmentProfileForTelematicsDeviceResponse createRetrieveEquipmentProfileForTelematicsDeviceResponse() {
        return new RetrieveEquipmentProfileForTelematicsDeviceResponse();
    }

    /**
     * Create an instance of {@link RetrieveComplianceCountries }
     * 
     */
    public RetrieveComplianceCountries createRetrieveComplianceCountries() {
        return new RetrieveComplianceCountries();
    }

    /**
     * Create an instance of {@link RetrieveComplianceCountriesResponse }
     * 
     */
    public RetrieveComplianceCountriesResponse createRetrieveComplianceCountriesResponse() {
        return new RetrieveComplianceCountriesResponse();
    }

    /**
     * Create an instance of {@link RetrieveComplianceDriverLicenseCountries }
     * 
     */
    public RetrieveComplianceDriverLicenseCountries createRetrieveComplianceDriverLicenseCountries() {
        return new RetrieveComplianceDriverLicenseCountries();
    }

    /**
     * Create an instance of {@link RetrieveComplianceDriverLicenseCountriesResponse }
     * 
     */
    public RetrieveComplianceDriverLicenseCountriesResponse createRetrieveComplianceDriverLicenseCountriesResponse() {
        return new RetrieveComplianceDriverLicenseCountriesResponse();
    }

    /**
     * Create an instance of {@link RetrieveComplianceStateNamesForCountry }
     * 
     */
    public RetrieveComplianceStateNamesForCountry createRetrieveComplianceStateNamesForCountry() {
        return new RetrieveComplianceStateNamesForCountry();
    }

    /**
     * Create an instance of {@link RetrieveComplianceStateNamesForCountryResponse }
     * 
     */
    public RetrieveComplianceStateNamesForCountryResponse createRetrieveComplianceStateNamesForCountryResponse() {
        return new RetrieveComplianceStateNamesForCountryResponse();
    }

    /**
     * Create an instance of {@link RetrieveIftaStateNamesForCountry }
     * 
     */
    public RetrieveIftaStateNamesForCountry createRetrieveIftaStateNamesForCountry() {
        return new RetrieveIftaStateNamesForCountry();
    }

    /**
     * Create an instance of {@link RetrieveIftaStateNamesForCountryResponse }
     * 
     */
    public RetrieveIftaStateNamesForCountryResponse createRetrieveIftaStateNamesForCountryResponse() {
        return new RetrieveIftaStateNamesForCountryResponse();
    }

    /**
     * Create an instance of {@link RetrieveComplianceCompanySettings }
     * 
     */
    public RetrieveComplianceCompanySettings createRetrieveComplianceCompanySettings() {
        return new RetrieveComplianceCompanySettings();
    }

    /**
     * Create an instance of {@link RetrieveComplianceCompanySettingsResponse }
     * 
     */
    public RetrieveComplianceCompanySettingsResponse createRetrieveComplianceCompanySettingsResponse() {
        return new RetrieveComplianceCompanySettingsResponse();
    }

    /**
     * Create an instance of {@link RetrieveDiagnosticTroubleCodeLibrary }
     * 
     */
    public RetrieveDiagnosticTroubleCodeLibrary createRetrieveDiagnosticTroubleCodeLibrary() {
        return new RetrieveDiagnosticTroubleCodeLibrary();
    }

    /**
     * Create an instance of {@link RetrieveDiagnosticTroubleCodeLibraryResponse }
     * 
     */
    public RetrieveDiagnosticTroubleCodeLibraryResponse createRetrieveDiagnosticTroubleCodeLibraryResponse() {
        return new RetrieveDiagnosticTroubleCodeLibraryResponse();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentMaintenanceInfo }
     * 
     */
    public RetrieveEquipmentMaintenanceInfo createRetrieveEquipmentMaintenanceInfo() {
        return new RetrieveEquipmentMaintenanceInfo();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentMaintenanceInfoResponse }
     * 
     */
    public RetrieveEquipmentMaintenanceInfoResponse createRetrieveEquipmentMaintenanceInfoResponse() {
        return new RetrieveEquipmentMaintenanceInfoResponse();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentStatus }
     * 
     */
    public RetrieveEquipmentStatus createRetrieveEquipmentStatus() {
        return new RetrieveEquipmentStatus();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentStatusResponse }
     * 
     */
    public RetrieveEquipmentStatusResponse createRetrieveEquipmentStatusResponse() {
        return new RetrieveEquipmentStatusResponse();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentPositionUpdates }
     * 
     */
    public RetrieveEquipmentPositionUpdates createRetrieveEquipmentPositionUpdates() {
        return new RetrieveEquipmentPositionUpdates();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentPositionUpdatesResponse }
     * 
     */
    public RetrieveEquipmentPositionUpdatesResponse createRetrieveEquipmentPositionUpdatesResponse() {
        return new RetrieveEquipmentPositionUpdatesResponse();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentDataHistory }
     * 
     */
    public RetrieveEquipmentDataHistory createRetrieveEquipmentDataHistory() {
        return new RetrieveEquipmentDataHistory();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentDataHistoryResponse }
     * 
     */
    public RetrieveEquipmentDataHistoryResponse createRetrieveEquipmentDataHistoryResponse() {
        return new RetrieveEquipmentDataHistoryResponse();
    }

    /**
     * Create an instance of {@link InternalRetrieveEquipmentDataHistoryEncoded }
     * 
     */
    public InternalRetrieveEquipmentDataHistoryEncoded createInternalRetrieveEquipmentDataHistoryEncoded() {
        return new InternalRetrieveEquipmentDataHistoryEncoded();
    }

    /**
     * Create an instance of {@link InternalRetrieveEquipmentDataHistoryEncodedResponse }
     * 
     */
    public InternalRetrieveEquipmentDataHistoryEncodedResponse createInternalRetrieveEquipmentDataHistoryEncodedResponse() {
        return new InternalRetrieveEquipmentDataHistoryEncodedResponse();
    }

    /**
     * Create an instance of {@link RetrievePositionHistoryReport }
     * 
     */
    public RetrievePositionHistoryReport createRetrievePositionHistoryReport() {
        return new RetrievePositionHistoryReport();
    }

    /**
     * Create an instance of {@link RetrievePositionHistoryReportResponse }
     * 
     */
    public RetrievePositionHistoryReportResponse createRetrievePositionHistoryReportResponse() {
        return new RetrievePositionHistoryReportResponse();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentPositionHistory }
     * 
     */
    public RetrieveEquipmentPositionHistory createRetrieveEquipmentPositionHistory() {
        return new RetrieveEquipmentPositionHistory();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentPositionHistoryResponse }
     * 
     */
    public RetrieveEquipmentPositionHistoryResponse createRetrieveEquipmentPositionHistoryResponse() {
        return new RetrieveEquipmentPositionHistoryResponse();
    }

    /**
     * Create an instance of {@link RetrieveWorkerComplianceStatuses }
     * 
     */
    public RetrieveWorkerComplianceStatuses createRetrieveWorkerComplianceStatuses() {
        return new RetrieveWorkerComplianceStatuses();
    }

    /**
     * Create an instance of {@link RetrieveWorkerComplianceStatusesResponse }
     * 
     */
    public RetrieveWorkerComplianceStatusesResponse createRetrieveWorkerComplianceStatusesResponse() {
        return new RetrieveWorkerComplianceStatusesResponse();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentStatusDetails }
     * 
     */
    public RetrieveEquipmentStatusDetails createRetrieveEquipmentStatusDetails() {
        return new RetrieveEquipmentStatusDetails();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentStatusDetailsResponse }
     * 
     */
    public RetrieveEquipmentStatusDetailsResponse createRetrieveEquipmentStatusDetailsResponse() {
        return new RetrieveEquipmentStatusDetailsResponse();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentStatusDetailsByKeys }
     * 
     */
    public RetrieveEquipmentStatusDetailsByKeys createRetrieveEquipmentStatusDetailsByKeys() {
        return new RetrieveEquipmentStatusDetailsByKeys();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentStatusDetailsByKeysResponse }
     * 
     */
    public RetrieveEquipmentStatusDetailsByKeysResponse createRetrieveEquipmentStatusDetailsByKeysResponse() {
        return new RetrieveEquipmentStatusDetailsByKeysResponse();
    }

    /**
     * Create an instance of {@link RetrieveStopTemplates }
     * 
     */
    public RetrieveStopTemplates createRetrieveStopTemplates() {
        return new RetrieveStopTemplates();
    }

    /**
     * Create an instance of {@link RetrieveStopTemplatesResponse }
     * 
     */
    public RetrieveStopTemplatesResponse createRetrieveStopTemplatesResponse() {
        return new RetrieveStopTemplatesResponse();
    }

    /**
     * Create an instance of {@link GetPreviousRoute }
     * 
     */
    public GetPreviousRoute createGetPreviousRoute() {
        return new GetPreviousRoute();
    }

    /**
     * Create an instance of {@link GetPreviousRouteResponse }
     * 
     */
    public GetPreviousRouteResponse createGetPreviousRouteResponse() {
        return new GetPreviousRouteResponse();
    }

    /**
     * Create an instance of {@link GetNextRoute }
     * 
     */
    public GetNextRoute createGetNextRoute() {
        return new GetNextRoute();
    }

    /**
     * Create an instance of {@link GetNextRouteResponse }
     * 
     */
    public GetNextRouteResponse createGetNextRouteResponse() {
        return new GetNextRouteResponse();
    }

    /**
     * Create an instance of {@link SearchEquipmentStatusDetails }
     * 
     */
    public SearchEquipmentStatusDetails createSearchEquipmentStatusDetails() {
        return new SearchEquipmentStatusDetails();
    }

    /**
     * Create an instance of {@link SearchEquipmentStatusDetailsResponse }
     * 
     */
    public SearchEquipmentStatusDetailsResponse createSearchEquipmentStatusDetailsResponse() {
        return new SearchEquipmentStatusDetailsResponse();
    }

    /**
     * Create an instance of {@link RetrieveAvailableFirmwareVersions }
     * 
     */
    public RetrieveAvailableFirmwareVersions createRetrieveAvailableFirmwareVersions() {
        return new RetrieveAvailableFirmwareVersions();
    }

    /**
     * Create an instance of {@link RetrieveAvailableFirmwareVersionsResponse }
     * 
     */
    public RetrieveAvailableFirmwareVersionsResponse createRetrieveAvailableFirmwareVersionsResponse() {
        return new RetrieveAvailableFirmwareVersionsResponse();
    }

    /**
     * Create an instance of {@link RetrieveAvailableScriptVersions }
     * 
     */
    public RetrieveAvailableScriptVersions createRetrieveAvailableScriptVersions() {
        return new RetrieveAvailableScriptVersions();
    }

    /**
     * Create an instance of {@link RetrieveAvailableScriptVersionsResponse }
     * 
     */
    public RetrieveAvailableScriptVersionsResponse createRetrieveAvailableScriptVersionsResponse() {
        return new RetrieveAvailableScriptVersionsResponse();
    }

    /**
     * Create an instance of {@link RetrieveAvailableVbusFileVersions }
     * 
     */
    public RetrieveAvailableVbusFileVersions createRetrieveAvailableVbusFileVersions() {
        return new RetrieveAvailableVbusFileVersions();
    }

    /**
     * Create an instance of {@link RetrieveAvailableVbusFileVersionsResponse }
     * 
     */
    public RetrieveAvailableVbusFileVersionsResponse createRetrieveAvailableVbusFileVersionsResponse() {
        return new RetrieveAvailableVbusFileVersionsResponse();
    }

    /**
     * Create an instance of {@link RetrieveTelematicsDeviceStatuses }
     * 
     */
    public RetrieveTelematicsDeviceStatuses createRetrieveTelematicsDeviceStatuses() {
        return new RetrieveTelematicsDeviceStatuses();
    }

    /**
     * Create an instance of {@link RetrieveTelematicsDeviceStatusesResponse }
     * 
     */
    public RetrieveTelematicsDeviceStatusesResponse createRetrieveTelematicsDeviceStatusesResponse() {
        return new RetrieveTelematicsDeviceStatusesResponse();
    }

    /**
     * Create an instance of {@link RetrieveTeleamticsDeviceStatusByKey }
     * 
     */
    public RetrieveTeleamticsDeviceStatusByKey createRetrieveTeleamticsDeviceStatusByKey() {
        return new RetrieveTeleamticsDeviceStatusByKey();
    }

    /**
     * Create an instance of {@link RetrieveTeleamticsDeviceStatusByKeyResponse }
     * 
     */
    public RetrieveTeleamticsDeviceStatusByKeyResponse createRetrieveTeleamticsDeviceStatusByKeyResponse() {
        return new RetrieveTeleamticsDeviceStatusByKeyResponse();
    }

    /**
     * Create an instance of {@link RetrieveMobileDeviceStatuses }
     * 
     */
    public RetrieveMobileDeviceStatuses createRetrieveMobileDeviceStatuses() {
        return new RetrieveMobileDeviceStatuses();
    }

    /**
     * Create an instance of {@link RetrieveMobileDeviceStatusesResponse }
     * 
     */
    public RetrieveMobileDeviceStatusesResponse createRetrieveMobileDeviceStatusesResponse() {
        return new RetrieveMobileDeviceStatusesResponse();
    }

    /**
     * Create an instance of {@link RetrieveMobileDeviceStatusByKey }
     * 
     */
    public RetrieveMobileDeviceStatusByKey createRetrieveMobileDeviceStatusByKey() {
        return new RetrieveMobileDeviceStatusByKey();
    }

    /**
     * Create an instance of {@link RetrieveMobileDeviceStatusByKeyResponse }
     * 
     */
    public RetrieveMobileDeviceStatusByKeyResponse createRetrieveMobileDeviceStatusByKeyResponse() {
        return new RetrieveMobileDeviceStatusByKeyResponse();
    }

    /**
     * Create an instance of {@link RetrieveDataFeedStatus }
     * 
     */
    public RetrieveDataFeedStatus createRetrieveDataFeedStatus() {
        return new RetrieveDataFeedStatus();
    }

    /**
     * Create an instance of {@link RetrieveDataFeedStatusResponse }
     * 
     */
    public RetrieveDataFeedStatusResponse createRetrieveDataFeedStatusResponse() {
        return new RetrieveDataFeedStatusResponse();
    }

    /**
     * Create an instance of {@link RetrieveNavRecalculationDetails }
     * 
     */
    public RetrieveNavRecalculationDetails createRetrieveNavRecalculationDetails() {
        return new RetrieveNavRecalculationDetails();
    }

    /**
     * Create an instance of {@link RetrieveNavRecalculationDetailsResponse }
     * 
     */
    public RetrieveNavRecalculationDetailsResponse createRetrieveNavRecalculationDetailsResponse() {
        return new RetrieveNavRecalculationDetailsResponse();
    }

    /**
     * Create an instance of {@link RetrieveUserSettings }
     * 
     */
    public RetrieveUserSettings createRetrieveUserSettings() {
        return new RetrieveUserSettings();
    }

    /**
     * Create an instance of {@link RetrieveUserSettingsResponse }
     * 
     */
    public RetrieveUserSettingsResponse createRetrieveUserSettingsResponse() {
        return new RetrieveUserSettingsResponse();
    }

    /**
     * Create an instance of {@link RetrievePerformanceMonitoringInfo }
     * 
     */
    public RetrievePerformanceMonitoringInfo createRetrievePerformanceMonitoringInfo() {
        return new RetrievePerformanceMonitoringInfo();
    }

    /**
     * Create an instance of {@link RetrievePerformanceMonitoringInfoResponse }
     * 
     */
    public RetrievePerformanceMonitoringInfoResponse createRetrievePerformanceMonitoringInfoResponse() {
        return new RetrievePerformanceMonitoringInfoResponse();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentTelematicsDeviceAssociation }
     * 
     */
    public RetrieveEquipmentTelematicsDeviceAssociation createRetrieveEquipmentTelematicsDeviceAssociation() {
        return new RetrieveEquipmentTelematicsDeviceAssociation();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentTelematicsDeviceAssociationResponse }
     * 
     */
    public RetrieveEquipmentTelematicsDeviceAssociationResponse createRetrieveEquipmentTelematicsDeviceAssociationResponse() {
        return new RetrieveEquipmentTelematicsDeviceAssociationResponse();
    }

    /**
     * Create an instance of {@link RetrieveRoutePositions }
     * 
     */
    public RetrieveRoutePositions createRetrieveRoutePositions() {
        return new RetrieveRoutePositions();
    }

    /**
     * Create an instance of {@link RetrieveRoutePositionsResponse }
     * 
     */
    public RetrieveRoutePositionsResponse createRetrieveRoutePositionsResponse() {
        return new RetrieveRoutePositionsResponse();
    }

    /**
     * Create an instance of {@link RetrieveDefaultResourceExceptionRules }
     * 
     */
    public RetrieveDefaultResourceExceptionRules createRetrieveDefaultResourceExceptionRules() {
        return new RetrieveDefaultResourceExceptionRules();
    }

    /**
     * Create an instance of {@link RetrieveDefaultResourceExceptionRulesResponse }
     * 
     */
    public RetrieveDefaultResourceExceptionRulesResponse createRetrieveDefaultResourceExceptionRulesResponse() {
        return new RetrieveDefaultResourceExceptionRulesResponse();
    }

    /**
     * Create an instance of {@link RetrieveWorkerOverview }
     * 
     */
    public RetrieveWorkerOverview createRetrieveWorkerOverview() {
        return new RetrieveWorkerOverview();
    }

    /**
     * Create an instance of {@link RetrieveWorkerOverviewResponse }
     * 
     */
    public RetrieveWorkerOverviewResponse createRetrieveWorkerOverviewResponse() {
        return new RetrieveWorkerOverviewResponse();
    }

    /**
     * Create an instance of {@link RetrieveOperationalMetrics }
     * 
     */
    public RetrieveOperationalMetrics createRetrieveOperationalMetrics() {
        return new RetrieveOperationalMetrics();
    }

    /**
     * Create an instance of {@link RetrieveOperationalMetricsResponse }
     * 
     */
    public RetrieveOperationalMetricsResponse createRetrieveOperationalMetricsResponse() {
        return new RetrieveOperationalMetricsResponse();
    }

    /**
     * Create an instance of {@link RetrieveOperationalSessionsTerritoryCount }
     * 
     */
    public RetrieveOperationalSessionsTerritoryCount createRetrieveOperationalSessionsTerritoryCount() {
        return new RetrieveOperationalSessionsTerritoryCount();
    }

    /**
     * Create an instance of {@link RetrieveOperationalSessionsTerritoryCountResponse }
     * 
     */
    public RetrieveOperationalSessionsTerritoryCountResponse createRetrieveOperationalSessionsTerritoryCountResponse() {
        return new RetrieveOperationalSessionsTerritoryCountResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerPlanningLicenseInfo }
     * 
     */
    public RetrieveCustomerPlanningLicenseInfo createRetrieveCustomerPlanningLicenseInfo() {
        return new RetrieveCustomerPlanningLicenseInfo();
    }

    /**
     * Create an instance of {@link RetrieveCustomerPlanningLicenseInfoResponse }
     * 
     */
    public RetrieveCustomerPlanningLicenseInfoResponse createRetrieveCustomerPlanningLicenseInfoResponse() {
        return new RetrieveCustomerPlanningLicenseInfoResponse();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentOverviewList }
     * 
     */
    public RetrieveEquipmentOverviewList createRetrieveEquipmentOverviewList() {
        return new RetrieveEquipmentOverviewList();
    }

    /**
     * Create an instance of {@link RetrieveEquipmentOverviewListResponse }
     * 
     */
    public RetrieveEquipmentOverviewListResponse createRetrieveEquipmentOverviewListResponse() {
        return new RetrieveEquipmentOverviewListResponse();
    }

    /**
     * Create an instance of {@link RetrieveRelevantDownloadableClientApplicationVersions }
     * 
     */
    public RetrieveRelevantDownloadableClientApplicationVersions createRetrieveRelevantDownloadableClientApplicationVersions() {
        return new RetrieveRelevantDownloadableClientApplicationVersions();
    }

    /**
     * Create an instance of {@link RetrieveRelevantDownloadableClientApplicationVersionsResponse }
     * 
     */
    public RetrieveRelevantDownloadableClientApplicationVersionsResponse createRetrieveRelevantDownloadableClientApplicationVersionsResponse() {
        return new RetrieveRelevantDownloadableClientApplicationVersionsResponse();
    }

    /**
     * Create an instance of {@link RetrieveTrashCorrespondence }
     * 
     */
    public RetrieveTrashCorrespondence createRetrieveTrashCorrespondence() {
        return new RetrieveTrashCorrespondence();
    }

    /**
     * Create an instance of {@link RetrieveTrashCorrespondenceResponse }
     * 
     */
    public RetrieveTrashCorrespondenceResponse createRetrieveTrashCorrespondenceResponse() {
        return new RetrieveTrashCorrespondenceResponse();
    }

    /**
     * Create an instance of {@link RetrieveCorrespondenceForWorker }
     * 
     */
    public RetrieveCorrespondenceForWorker createRetrieveCorrespondenceForWorker() {
        return new RetrieveCorrespondenceForWorker();
    }

    /**
     * Create an instance of {@link RetrieveCorrespondenceForWorkerResponse }
     * 
     */
    public RetrieveCorrespondenceForWorkerResponse createRetrieveCorrespondenceForWorkerResponse() {
        return new RetrieveCorrespondenceForWorkerResponse();
    }

    /**
     * Create an instance of {@link RetrieveKpis }
     * 
     */
    public RetrieveKpis createRetrieveKpis() {
        return new RetrieveKpis();
    }

    /**
     * Create an instance of {@link RetrieveKpisResponse }
     * 
     */
    public RetrieveKpisResponse createRetrieveKpisResponse() {
        return new RetrieveKpisResponse();
    }

    /**
     * Create an instance of {@link RetrieveKpiData }
     * 
     */
    public RetrieveKpiData createRetrieveKpiData() {
        return new RetrieveKpiData();
    }

    /**
     * Create an instance of {@link RetrieveKpiDataResponse }
     * 
     */
    public RetrieveKpiDataResponse createRetrieveKpiDataResponse() {
        return new RetrieveKpiDataResponse();
    }

    /**
     * Create an instance of {@link RetrieveKpiQueryResults }
     * 
     */
    public RetrieveKpiQueryResults createRetrieveKpiQueryResults() {
        return new RetrieveKpiQueryResults();
    }

    /**
     * Create an instance of {@link RetrieveKpiQueryResultsResponse }
     * 
     */
    public RetrieveKpiQueryResultsResponse createRetrieveKpiQueryResultsResponse() {
        return new RetrieveKpiQueryResultsResponse();
    }

    /**
     * Create an instance of {@link RetrieveKpiExecutionJobResult }
     * 
     */
    public RetrieveKpiExecutionJobResult createRetrieveKpiExecutionJobResult() {
        return new RetrieveKpiExecutionJobResult();
    }

    /**
     * Create an instance of {@link RetrieveKpiExecutionJobResultResponse }
     * 
     */
    public RetrieveKpiExecutionJobResultResponse createRetrieveKpiExecutionJobResultResponse() {
        return new RetrieveKpiExecutionJobResultResponse();
    }

    /**
     * Create an instance of {@link CancelKpiExecutionJob }
     * 
     */
    public CancelKpiExecutionJob createCancelKpiExecutionJob() {
        return new CancelKpiExecutionJob();
    }

    /**
     * Create an instance of {@link CancelKpiExecutionJobResponse }
     * 
     */
    public CancelKpiExecutionJobResponse createCancelKpiExecutionJobResponse() {
        return new CancelKpiExecutionJobResponse();
    }

    /**
     * Create an instance of {@link RetrieveDataWarehouseMetadata }
     * 
     */
    public RetrieveDataWarehouseMetadata createRetrieveDataWarehouseMetadata() {
        return new RetrieveDataWarehouseMetadata();
    }

    /**
     * Create an instance of {@link RetrieveDataWarehouseMetadataResponse }
     * 
     */
    public RetrieveDataWarehouseMetadataResponse createRetrieveDataWarehouseMetadataResponse() {
        return new RetrieveDataWarehouseMetadataResponse();
    }

    /**
     * Create an instance of {@link RetrieveAllMeasureMetadata }
     * 
     */
    public RetrieveAllMeasureMetadata createRetrieveAllMeasureMetadata() {
        return new RetrieveAllMeasureMetadata();
    }

    /**
     * Create an instance of {@link RetrieveAllMeasureMetadataResponse }
     * 
     */
    public RetrieveAllMeasureMetadataResponse createRetrieveAllMeasureMetadataResponse() {
        return new RetrieveAllMeasureMetadataResponse();
    }

    /**
     * Create an instance of {@link ClearDataWarehouse }
     * 
     */
    public ClearDataWarehouse createClearDataWarehouse() {
        return new ClearDataWarehouse();
    }

    /**
     * Create an instance of {@link ClearDataWarehouseResponse }
     * 
     */
    public ClearDataWarehouseResponse createClearDataWarehouseResponse() {
        return new ClearDataWarehouseResponse();
    }

    /**
     * Create an instance of {@link GenerateDataWarehouseSampleData }
     * 
     */
    public GenerateDataWarehouseSampleData createGenerateDataWarehouseSampleData() {
        return new GenerateDataWarehouseSampleData();
    }

    /**
     * Create an instance of {@link GenerateDataWarehouseSampleDataResponse }
     * 
     */
    public GenerateDataWarehouseSampleDataResponse createGenerateDataWarehouseSampleDataResponse() {
        return new GenerateDataWarehouseSampleDataResponse();
    }

    /**
     * Create an instance of {@link GenerateSampleDataForDataWarehouse }
     * 
     */
    public GenerateSampleDataForDataWarehouse createGenerateSampleDataForDataWarehouse() {
        return new GenerateSampleDataForDataWarehouse();
    }

    /**
     * Create an instance of {@link GenerateSampleDataForDataWarehouseResponse }
     * 
     */
    public GenerateSampleDataForDataWarehouseResponse createGenerateSampleDataForDataWarehouseResponse() {
        return new GenerateSampleDataForDataWarehouseResponse();
    }

    /**
     * Create an instance of {@link TriggerDataWarehouseIntegrator }
     * 
     */
    public TriggerDataWarehouseIntegrator createTriggerDataWarehouseIntegrator() {
        return new TriggerDataWarehouseIntegrator();
    }

    /**
     * Create an instance of {@link TriggerDataWarehouseIntegratorResponse }
     * 
     */
    public TriggerDataWarehouseIntegratorResponse createTriggerDataWarehouseIntegratorResponse() {
        return new TriggerDataWarehouseIntegratorResponse();
    }

    /**
     * Create an instance of {@link SynchronizeOperationsHierarchy }
     * 
     */
    public SynchronizeOperationsHierarchy createSynchronizeOperationsHierarchy() {
        return new SynchronizeOperationsHierarchy();
    }

    /**
     * Create an instance of {@link SynchronizeOperationsHierarchyResponse }
     * 
     */
    public SynchronizeOperationsHierarchyResponse createSynchronizeOperationsHierarchyResponse() {
        return new SynchronizeOperationsHierarchyResponse();
    }

    /**
     * Create an instance of {@link IsCustomHierarchyEnabled }
     * 
     */
    public IsCustomHierarchyEnabled createIsCustomHierarchyEnabled() {
        return new IsCustomHierarchyEnabled();
    }

    /**
     * Create an instance of {@link IsCustomHierarchyEnabledResponse }
     * 
     */
    public IsCustomHierarchyEnabledResponse createIsCustomHierarchyEnabledResponse() {
        return new IsCustomHierarchyEnabledResponse();
    }

    /**
     * Create an instance of {@link ExportKpi }
     * 
     */
    public ExportKpi createExportKpi() {
        return new ExportKpi();
    }

    /**
     * Create an instance of {@link ExportKpiResponse }
     * 
     */
    public ExportKpiResponse createExportKpiResponse() {
        return new ExportKpiResponse();
    }

    /**
     * Create an instance of {@link GetUserKpiExports }
     * 
     */
    public GetUserKpiExports createGetUserKpiExports() {
        return new GetUserKpiExports();
    }

    /**
     * Create an instance of {@link GetUserKpiExportsResponse }
     * 
     */
    public GetUserKpiExportsResponse createGetUserKpiExportsResponse() {
        return new GetUserKpiExportsResponse();
    }

    /**
     * Create an instance of {@link RetrieveKpiDownloadFile }
     * 
     */
    public RetrieveKpiDownloadFile createRetrieveKpiDownloadFile() {
        return new RetrieveKpiDownloadFile();
    }

    /**
     * Create an instance of {@link RetrieveKpiDownloadFileResponse }
     * 
     */
    public RetrieveKpiDownloadFileResponse createRetrieveKpiDownloadFileResponse() {
        return new RetrieveKpiDownloadFileResponse();
    }

    /**
     * Create an instance of {@link RetrieveDataWarehouseMaxDownloadDays }
     * 
     */
    public RetrieveDataWarehouseMaxDownloadDays createRetrieveDataWarehouseMaxDownloadDays() {
        return new RetrieveDataWarehouseMaxDownloadDays();
    }

    /**
     * Create an instance of {@link RetrieveDataWarehouseMaxDownloadDaysResponse }
     * 
     */
    public RetrieveDataWarehouseMaxDownloadDaysResponse createRetrieveDataWarehouseMaxDownloadDaysResponse() {
        return new RetrieveDataWarehouseMaxDownloadDaysResponse();
    }

    /**
     * Create an instance of {@link GetZippedClientLogFiles }
     * 
     */
    public GetZippedClientLogFiles createGetZippedClientLogFiles() {
        return new GetZippedClientLogFiles();
    }

    /**
     * Create an instance of {@link GetZippedClientLogFilesResponse }
     * 
     */
    public GetZippedClientLogFilesResponse createGetZippedClientLogFilesResponse() {
        return new GetZippedClientLogFilesResponse();
    }

    /**
     * Create an instance of {@link SaveRoutePlan }
     * 
     */
    public SaveRoutePlan createSaveRoutePlan() {
        return new SaveRoutePlan();
    }

    /**
     * Create an instance of {@link SaveRoutePlanResponse }
     * 
     */
    public SaveRoutePlanResponse createSaveRoutePlanResponse() {
        return new SaveRoutePlanResponse();
    }

    /**
     * Create an instance of {@link CreateRouteFromPoints }
     * 
     */
    public CreateRouteFromPoints createCreateRouteFromPoints() {
        return new CreateRouteFromPoints();
    }

    /**
     * Create an instance of {@link CreateRouteFromPointsResponse }
     * 
     */
    public CreateRouteFromPointsResponse createCreateRouteFromPointsResponse() {
        return new CreateRouteFromPointsResponse();
    }

    /**
     * Create an instance of {@link UpdateRouteFromPoints }
     * 
     */
    public UpdateRouteFromPoints createUpdateRouteFromPoints() {
        return new UpdateRouteFromPoints();
    }

    /**
     * Create an instance of {@link UpdateRouteFromPointsResponse }
     * 
     */
    public UpdateRouteFromPointsResponse createUpdateRouteFromPointsResponse() {
        return new UpdateRouteFromPointsResponse();
    }

    /**
     * Create an instance of {@link MoveResourcesToRegion }
     * 
     */
    public MoveResourcesToRegion createMoveResourcesToRegion() {
        return new MoveResourcesToRegion();
    }

    /**
     * Create an instance of {@link MoveResourcesToRegionResponse }
     * 
     */
    public MoveResourcesToRegionResponse createMoveResourcesToRegionResponse() {
        return new MoveResourcesToRegionResponse();
    }

    /**
     * Create an instance of {@link DeleteRegion }
     * 
     */
    public DeleteRegion createDeleteRegion() {
        return new DeleteRegion();
    }

    /**
     * Create an instance of {@link DeleteRegionResponse }
     * 
     */
    public DeleteRegionResponse createDeleteRegionResponse() {
        return new DeleteRegionResponse();
    }

    /**
     * Create an instance of {@link Undelete }
     * 
     */
    public Undelete createUndelete() {
        return new Undelete();
    }

    /**
     * Create an instance of {@link UndeleteResponse }
     * 
     */
    public UndeleteResponse createUndeleteResponse() {
        return new UndeleteResponse();
    }

    /**
     * Create an instance of {@link ResumeDataFeed }
     * 
     */
    public ResumeDataFeed createResumeDataFeed() {
        return new ResumeDataFeed();
    }

    /**
     * Create an instance of {@link ResumeDataFeedResponse }
     * 
     */
    public ResumeDataFeedResponse createResumeDataFeedResponse() {
        return new ResumeDataFeedResponse();
    }

    /**
     * Create an instance of {@link UpdateUserSettings }
     * 
     */
    public UpdateUserSettings createUpdateUserSettings() {
        return new UpdateUserSettings();
    }

    /**
     * Create an instance of {@link UpdateUserSettingsResponse }
     * 
     */
    public UpdateUserSettingsResponse createUpdateUserSettingsResponse() {
        return new UpdateUserSettingsResponse();
    }

    /**
     * Create an instance of {@link UpdateRouteTender }
     * 
     */
    public UpdateRouteTender createUpdateRouteTender() {
        return new UpdateRouteTender();
    }

    /**
     * Create an instance of {@link UpdateRouteTenderResponse }
     * 
     */
    public UpdateRouteTenderResponse createUpdateRouteTenderResponse() {
        return new UpdateRouteTenderResponse();
    }

    /**
     * Create an instance of {@link DeleteBusinessUnit }
     * 
     */
    public DeleteBusinessUnit createDeleteBusinessUnit() {
        return new DeleteBusinessUnit();
    }

    /**
     * Create an instance of {@link DeleteBusinessUnitResponse }
     * 
     */
    public DeleteBusinessUnitResponse createDeleteBusinessUnitResponse() {
        return new DeleteBusinessUnitResponse();
    }

    /**
     * Create an instance of {@link SavePositions }
     * 
     */
    public SavePositions createSavePositions() {
        return new SavePositions();
    }

    /**
     * Create an instance of {@link SavePositionsParameters }
     * 
     */
    public SavePositionsParameters createSavePositionsParameters() {
        return new SavePositionsParameters();
    }

    /**
     * Create an instance of {@link SavePositionsResponse }
     * 
     */
    public SavePositionsResponse createSavePositionsResponse() {
        return new SavePositionsResponse();
    }

    /**
     * Create an instance of {@link CombineRoutes }
     * 
     */
    public CombineRoutes createCombineRoutes() {
        return new CombineRoutes();
    }

    /**
     * Create an instance of {@link CombineRoutesResponse }
     * 
     */
    public CombineRoutesResponse createCombineRoutesResponse() {
        return new CombineRoutesResponse();
    }

    /**
     * Create an instance of {@link SplitRoute }
     * 
     */
    public SplitRoute createSplitRoute() {
        return new SplitRoute();
    }

    /**
     * Create an instance of {@link SplitRouteResponse }
     * 
     */
    public SplitRouteResponse createSplitRouteResponse() {
        return new SplitRouteResponse();
    }

    /**
     * Create an instance of {@link MoveStops }
     * 
     */
    public MoveStops createMoveStops() {
        return new MoveStops();
    }

    /**
     * Create an instance of {@link MoveStopsResponse }
     * 
     */
    public MoveStopsResponse createMoveStopsResponse() {
        return new MoveStopsResponse();
    }

    /**
     * Create an instance of {@link MoveStopsByIdentities }
     * 
     */
    public MoveStopsByIdentities createMoveStopsByIdentities() {
        return new MoveStopsByIdentities();
    }

    /**
     * Create an instance of {@link MoveStopsByIdentitiesResponse }
     * 
     */
    public MoveStopsByIdentitiesResponse createMoveStopsByIdentitiesResponse() {
        return new MoveStopsByIdentitiesResponse();
    }

    /**
     * Create an instance of {@link MoveStopsToBestPosition }
     * 
     */
    public MoveStopsToBestPosition createMoveStopsToBestPosition() {
        return new MoveStopsToBestPosition();
    }

    /**
     * Create an instance of {@link MoveStopsToBestPositionResponse }
     * 
     */
    public MoveStopsToBestPositionResponse createMoveStopsToBestPositionResponse() {
        return new MoveStopsToBestPositionResponse();
    }

    /**
     * Create an instance of {@link MoveOrders }
     * 
     */
    public MoveOrders createMoveOrders() {
        return new MoveOrders();
    }

    /**
     * Create an instance of {@link MoveOrdersResponse }
     * 
     */
    public MoveOrdersResponse createMoveOrdersResponse() {
        return new MoveOrdersResponse();
    }

    /**
     * Create an instance of {@link MoveOrdersToBestPosition }
     * 
     */
    public MoveOrdersToBestPosition createMoveOrdersToBestPosition() {
        return new MoveOrdersToBestPosition();
    }

    /**
     * Create an instance of {@link MoveOrdersToBestPositionResponse }
     * 
     */
    public MoveOrdersToBestPositionResponse createMoveOrdersToBestPositionResponse() {
        return new MoveOrdersToBestPositionResponse();
    }

    /**
     * Create an instance of {@link MoveToRoute }
     * 
     */
    public MoveToRoute createMoveToRoute() {
        return new MoveToRoute();
    }

    /**
     * Create an instance of {@link MoveToRouteResponse }
     * 
     */
    public MoveToRouteResponse createMoveToRouteResponse() {
        return new MoveToRouteResponse();
    }

    /**
     * Create an instance of {@link MoveToRouteAndTemporaryGeocode }
     * 
     */
    public MoveToRouteAndTemporaryGeocode createMoveToRouteAndTemporaryGeocode() {
        return new MoveToRouteAndTemporaryGeocode();
    }

    /**
     * Create an instance of {@link MoveToRouteAndTemporaryGeocodeResponse }
     * 
     */
    public MoveToRouteAndTemporaryGeocodeResponse createMoveToRouteAndTemporaryGeocodeResponse() {
        return new MoveToRouteAndTemporaryGeocodeResponse();
    }

    /**
     * Create an instance of {@link MoveToBestPositionOnRoute }
     * 
     */
    public MoveToBestPositionOnRoute createMoveToBestPositionOnRoute() {
        return new MoveToBestPositionOnRoute();
    }

    /**
     * Create an instance of {@link MoveToBestPositionOnRouteResponse }
     * 
     */
    public MoveToBestPositionOnRouteResponse createMoveToBestPositionOnRouteResponse() {
        return new MoveToBestPositionOnRouteResponse();
    }

    /**
     * Create an instance of {@link OptimizeRoutes }
     * 
     */
    public OptimizeRoutes createOptimizeRoutes() {
        return new OptimizeRoutes();
    }

    /**
     * Create an instance of {@link OptimizeRoutesResponse }
     * 
     */
    public OptimizeRoutesResponse createOptimizeRoutesResponse() {
        return new OptimizeRoutesResponse();
    }

    /**
     * Create an instance of {@link SequenceRoute }
     * 
     */
    public SequenceRoute createSequenceRoute() {
        return new SequenceRoute();
    }

    /**
     * Create an instance of {@link SequenceRouteResponse }
     * 
     */
    public SequenceRouteResponse createSequenceRouteResponse() {
        return new SequenceRouteResponse();
    }

    /**
     * Create an instance of {@link SequenceRange }
     * 
     */
    public SequenceRange createSequenceRange() {
        return new SequenceRange();
    }

    /**
     * Create an instance of {@link SequenceRangeResponse }
     * 
     */
    public SequenceRangeResponse createSequenceRangeResponse() {
        return new SequenceRangeResponse();
    }

    /**
     * Create an instance of {@link SuggestRouteSequence }
     * 
     */
    public SuggestRouteSequence createSuggestRouteSequence() {
        return new SuggestRouteSequence();
    }

    /**
     * Create an instance of {@link SuggestRouteSequenceResponse }
     * 
     */
    public SuggestRouteSequenceResponse createSuggestRouteSequenceResponse() {
        return new SuggestRouteSequenceResponse();
    }

    /**
     * Create an instance of {@link UnassignOrders }
     * 
     */
    public UnassignOrders createUnassignOrders() {
        return new UnassignOrders();
    }

    /**
     * Create an instance of {@link UnassignOrdersResponse }
     * 
     */
    public UnassignOrdersResponse createUnassignOrdersResponse() {
        return new UnassignOrdersResponse();
    }

    /**
     * Create an instance of {@link RemoveStops }
     * 
     */
    public RemoveStops createRemoveStops() {
        return new RemoveStops();
    }

    /**
     * Create an instance of {@link RemoveStopsResponse }
     * 
     */
    public RemoveStopsResponse createRemoveStopsResponse() {
        return new RemoveStopsResponse();
    }

    /**
     * Create an instance of {@link ChangeTaskCancellationState }
     * 
     */
    public ChangeTaskCancellationState createChangeTaskCancellationState() {
        return new ChangeTaskCancellationState();
    }

    /**
     * Create an instance of {@link ChangeTaskCancellationStateResponse }
     * 
     */
    public ChangeTaskCancellationStateResponse createChangeTaskCancellationStateResponse() {
        return new ChangeTaskCancellationStateResponse();
    }

    /**
     * Create an instance of {@link MoveUnassignedOrderGroups }
     * 
     */
    public MoveUnassignedOrderGroups createMoveUnassignedOrderGroups() {
        return new MoveUnassignedOrderGroups();
    }

    /**
     * Create an instance of {@link MoveUnassignedOrderGroupsResponse }
     * 
     */
    public MoveUnassignedOrderGroupsResponse createMoveUnassignedOrderGroupsResponse() {
        return new MoveUnassignedOrderGroupsResponse();
    }

    /**
     * Create an instance of {@link MoveUnassignedOrderGroupsEx }
     * 
     */
    public MoveUnassignedOrderGroupsEx createMoveUnassignedOrderGroupsEx() {
        return new MoveUnassignedOrderGroupsEx();
    }

    /**
     * Create an instance of {@link MoveUnassignedOrderGroupsExResponse }
     * 
     */
    public MoveUnassignedOrderGroupsExResponse createMoveUnassignedOrderGroupsExResponse() {
        return new MoveUnassignedOrderGroupsExResponse();
    }

    /**
     * Create an instance of {@link MoveUnassignedOrderGroupsToBestPosition }
     * 
     */
    public MoveUnassignedOrderGroupsToBestPosition createMoveUnassignedOrderGroupsToBestPosition() {
        return new MoveUnassignedOrderGroupsToBestPosition();
    }

    /**
     * Create an instance of {@link MoveUnassignedOrderGroupsToBestPositionResponse }
     * 
     */
    public MoveUnassignedOrderGroupsToBestPositionResponse createMoveUnassignedOrderGroupsToBestPositionResponse() {
        return new MoveUnassignedOrderGroupsToBestPositionResponse();
    }

    /**
     * Create an instance of {@link DeleteRoutes }
     * 
     */
    public DeleteRoutes createDeleteRoutes() {
        return new DeleteRoutes();
    }

    /**
     * Create an instance of {@link DeleteRoutesResponse }
     * 
     */
    public DeleteRoutesResponse createDeleteRoutesResponse() {
        return new DeleteRoutesResponse();
    }

    /**
     * Create an instance of {@link StartDeleteRoutesJob }
     * 
     */
    public StartDeleteRoutesJob createStartDeleteRoutesJob() {
        return new StartDeleteRoutesJob();
    }

    /**
     * Create an instance of {@link StartDeleteRoutesJobResponse }
     * 
     */
    public StartDeleteRoutesJobResponse createStartDeleteRoutesJobResponse() {
        return new StartDeleteRoutesJobResponse();
    }

    /**
     * Create an instance of {@link FlipRoutes }
     * 
     */
    public FlipRoutes createFlipRoutes() {
        return new FlipRoutes();
    }

    /**
     * Create an instance of {@link FlipRoutesResponse }
     * 
     */
    public FlipRoutesResponse createFlipRoutesResponse() {
        return new FlipRoutesResponse();
    }

    /**
     * Create an instance of {@link CreateRoute }
     * 
     */
    public CreateRoute createCreateRoute() {
        return new CreateRoute();
    }

    /**
     * Create an instance of {@link CreateRouteResponse }
     * 
     */
    public CreateRouteResponse createCreateRouteResponse() {
        return new CreateRouteResponse();
    }

    /**
     * Create an instance of {@link UpdateRoutes }
     * 
     */
    public UpdateRoutes createUpdateRoutes() {
        return new UpdateRoutes();
    }

    /**
     * Create an instance of {@link UpdateRoutesResponse }
     * 
     */
    public UpdateRoutesResponse createUpdateRoutesResponse() {
        return new UpdateRoutesResponse();
    }

    /**
     * Create an instance of {@link InsertNonServiceableStop }
     * 
     */
    public InsertNonServiceableStop createInsertNonServiceableStop() {
        return new InsertNonServiceableStop();
    }

    /**
     * Create an instance of {@link InsertNonServiceableStopResponse }
     * 
     */
    public InsertNonServiceableStopResponse createInsertNonServiceableStopResponse() {
        return new InsertNonServiceableStopResponse();
    }

    /**
     * Create an instance of {@link UpdateNonServiceableStop }
     * 
     */
    public UpdateNonServiceableStop createUpdateNonServiceableStop() {
        return new UpdateNonServiceableStop();
    }

    /**
     * Create an instance of {@link UpdateNonServiceableStopResponse }
     * 
     */
    public UpdateNonServiceableStopResponse createUpdateNonServiceableStopResponse() {
        return new UpdateNonServiceableStopResponse();
    }

    /**
     * Create an instance of {@link InsertLayoverStop }
     * 
     */
    public InsertLayoverStop createInsertLayoverStop() {
        return new InsertLayoverStop();
    }

    /**
     * Create an instance of {@link InsertLayoverStopResponse }
     * 
     */
    public InsertLayoverStopResponse createInsertLayoverStopResponse() {
        return new InsertLayoverStopResponse();
    }

    /**
     * Create an instance of {@link UpdateLayoverStop }
     * 
     */
    public UpdateLayoverStop createUpdateLayoverStop() {
        return new UpdateLayoverStop();
    }

    /**
     * Create an instance of {@link UpdateLayoverStopResponse }
     * 
     */
    public UpdateLayoverStopResponse createUpdateLayoverStopResponse() {
        return new UpdateLayoverStopResponse();
    }

    /**
     * Create an instance of {@link SuggestLayovers }
     * 
     */
    public SuggestLayovers createSuggestLayovers() {
        return new SuggestLayovers();
    }

    /**
     * Create an instance of {@link SuggestLayoversResponse }
     * 
     */
    public SuggestLayoversResponse createSuggestLayoversResponse() {
        return new SuggestLayoversResponse();
    }

    /**
     * Create an instance of {@link InsertMidRouteDepotStop }
     * 
     */
    public InsertMidRouteDepotStop createInsertMidRouteDepotStop() {
        return new InsertMidRouteDepotStop();
    }

    /**
     * Create an instance of {@link InsertMidRouteDepotStopResponse }
     * 
     */
    public InsertMidRouteDepotStopResponse createInsertMidRouteDepotStopResponse() {
        return new InsertMidRouteDepotStopResponse();
    }

    /**
     * Create an instance of {@link UpdateMidRouteDepotStop }
     * 
     */
    public UpdateMidRouteDepotStop createUpdateMidRouteDepotStop() {
        return new UpdateMidRouteDepotStop();
    }

    /**
     * Create an instance of {@link UpdateMidRouteDepotStopResponse }
     * 
     */
    public UpdateMidRouteDepotStopResponse createUpdateMidRouteDepotStopResponse() {
        return new UpdateMidRouteDepotStopResponse();
    }

    /**
     * Create an instance of {@link InsertRouteDelay }
     * 
     */
    public InsertRouteDelay createInsertRouteDelay() {
        return new InsertRouteDelay();
    }

    /**
     * Create an instance of {@link InsertRouteDelayResponse }
     * 
     */
    public InsertRouteDelayResponse createInsertRouteDelayResponse() {
        return new InsertRouteDelayResponse();
    }

    /**
     * Create an instance of {@link UpdateRouteDelay }
     * 
     */
    public UpdateRouteDelay createUpdateRouteDelay() {
        return new UpdateRouteDelay();
    }

    /**
     * Create an instance of {@link UpdateRouteDelayResponse }
     * 
     */
    public UpdateRouteDelayResponse createUpdateRouteDelayResponse() {
        return new UpdateRouteDelayResponse();
    }

    /**
     * Create an instance of {@link AdjustServiceTimesForRoutes }
     * 
     */
    public AdjustServiceTimesForRoutes createAdjustServiceTimesForRoutes() {
        return new AdjustServiceTimesForRoutes();
    }

    /**
     * Create an instance of {@link AdjustServiceTimesForRoutesResponse }
     * 
     */
    public AdjustServiceTimesForRoutesResponse createAdjustServiceTimesForRoutesResponse() {
        return new AdjustServiceTimesForRoutesResponse();
    }

    /**
     * Create an instance of {@link AdjustServiceTimesForStops }
     * 
     */
    public AdjustServiceTimesForStops createAdjustServiceTimesForStops() {
        return new AdjustServiceTimesForStops();
    }

    /**
     * Create an instance of {@link AdjustServiceTimesForStopsResponse }
     * 
     */
    public AdjustServiceTimesForStopsResponse createAdjustServiceTimesForStopsResponse() {
        return new AdjustServiceTimesForStopsResponse();
    }

    /**
     * Create an instance of {@link CreateCellsFromRoutes }
     * 
     */
    public CreateCellsFromRoutes createCreateCellsFromRoutes() {
        return new CreateCellsFromRoutes();
    }

    /**
     * Create an instance of {@link CreateCellsFromRoutesResponse }
     * 
     */
    public CreateCellsFromRoutesResponse createCreateCellsFromRoutesResponse() {
        return new CreateCellsFromRoutesResponse();
    }

    /**
     * Create an instance of {@link OverrideCoordinateForStop }
     * 
     */
    public OverrideCoordinateForStop createOverrideCoordinateForStop() {
        return new OverrideCoordinateForStop();
    }

    /**
     * Create an instance of {@link OverrideCoordinateForStopResponse }
     * 
     */
    public OverrideCoordinateForStopResponse createOverrideCoordinateForStopResponse() {
        return new OverrideCoordinateForStopResponse();
    }

    /**
     * Create an instance of {@link AssignIdentifierForRoutes }
     * 
     */
    public AssignIdentifierForRoutes createAssignIdentifierForRoutes() {
        return new AssignIdentifierForRoutes();
    }

    /**
     * Create an instance of {@link AssignIdentifierForRoutesResponse }
     * 
     */
    public AssignIdentifierForRoutesResponse createAssignIdentifierForRoutesResponse() {
        return new AssignIdentifierForRoutesResponse();
    }

    /**
     * Create an instance of {@link ChangeRoutePhase }
     * 
     */
    public ChangeRoutePhase createChangeRoutePhase() {
        return new ChangeRoutePhase();
    }

    /**
     * Create an instance of {@link ChangeRoutePhaseResponse }
     * 
     */
    public ChangeRoutePhaseResponse createChangeRoutePhaseResponse() {
        return new ChangeRoutePhaseResponse();
    }

    /**
     * Create an instance of {@link ChangeRouteStatus }
     * 
     */
    public ChangeRouteStatus createChangeRouteStatus() {
        return new ChangeRouteStatus();
    }

    /**
     * Create an instance of {@link ChangeRouteStatusResponse }
     * 
     */
    public ChangeRouteStatusResponse createChangeRouteStatusResponse() {
        return new ChangeRouteStatusResponse();
    }

    /**
     * Create an instance of {@link CalculateRoutes }
     * 
     */
    public CalculateRoutes createCalculateRoutes() {
        return new CalculateRoutes();
    }

    /**
     * Create an instance of {@link CalculateRoutesResponse }
     * 
     */
    public CalculateRoutesResponse createCalculateRoutesResponse() {
        return new CalculateRoutesResponse();
    }

    /**
     * Create an instance of {@link AcknowledgeResourceExceptions }
     * 
     */
    public AcknowledgeResourceExceptions createAcknowledgeResourceExceptions() {
        return new AcknowledgeResourceExceptions();
    }

    /**
     * Create an instance of {@link AcknowledgeResourceExceptionsResponse }
     * 
     */
    public AcknowledgeResourceExceptionsResponse createAcknowledgeResourceExceptionsResponse() {
        return new AcknowledgeResourceExceptionsResponse();
    }

    /**
     * Create an instance of {@link AcknowledgeResourceExceptionsForRoutes }
     * 
     */
    public AcknowledgeResourceExceptionsForRoutes createAcknowledgeResourceExceptionsForRoutes() {
        return new AcknowledgeResourceExceptionsForRoutes();
    }

    /**
     * Create an instance of {@link AcknowledgeResourceExceptionsForRoutesResponse }
     * 
     */
    public AcknowledgeResourceExceptionsForRoutesResponse createAcknowledgeResourceExceptionsForRoutesResponse() {
        return new AcknowledgeResourceExceptionsForRoutesResponse();
    }

    /**
     * Create an instance of {@link AcknowledgeRouteNotes }
     * 
     */
    public AcknowledgeRouteNotes createAcknowledgeRouteNotes() {
        return new AcknowledgeRouteNotes();
    }

    /**
     * Create an instance of {@link AcknowledgeRouteNotesResponse }
     * 
     */
    public AcknowledgeRouteNotesResponse createAcknowledgeRouteNotesResponse() {
        return new AcknowledgeRouteNotesResponse();
    }

    /**
     * Create an instance of {@link AcknowledgeRouteNotesForRoutes }
     * 
     */
    public AcknowledgeRouteNotesForRoutes createAcknowledgeRouteNotesForRoutes() {
        return new AcknowledgeRouteNotesForRoutes();
    }

    /**
     * Create an instance of {@link AcknowledgeRouteNotesForRoutesResponse }
     * 
     */
    public AcknowledgeRouteNotesForRoutesResponse createAcknowledgeRouteNotesForRoutesResponse() {
        return new AcknowledgeRouteNotesForRoutesResponse();
    }

    /**
     * Create an instance of {@link AssignRouter }
     * 
     */
    public AssignRouter createAssignRouter() {
        return new AssignRouter();
    }

    /**
     * Create an instance of {@link AssignRouterResponse }
     * 
     */
    public AssignRouterResponse createAssignRouterResponse() {
        return new AssignRouterResponse();
    }

    /**
     * Create an instance of {@link AssignDispatcher }
     * 
     */
    public AssignDispatcher createAssignDispatcher() {
        return new AssignDispatcher();
    }

    /**
     * Create an instance of {@link AssignDispatcherResponse }
     * 
     */
    public AssignDispatcherResponse createAssignDispatcherResponse() {
        return new AssignDispatcherResponse();
    }

    /**
     * Create an instance of {@link AutoCompleteRoute }
     * 
     */
    public AutoCompleteRoute createAutoCompleteRoute() {
        return new AutoCompleteRoute();
    }

    /**
     * Create an instance of {@link AutoCompleteRouteResponse }
     * 
     */
    public AutoCompleteRouteResponse createAutoCompleteRouteResponse() {
        return new AutoCompleteRouteResponse();
    }

    /**
     * Create an instance of {@link ResetRoutesToPlan }
     * 
     */
    public ResetRoutesToPlan createResetRoutesToPlan() {
        return new ResetRoutesToPlan();
    }

    /**
     * Create an instance of {@link ResetRoutesToPlanResponse }
     * 
     */
    public ResetRoutesToPlanResponse createResetRoutesToPlanResponse() {
        return new ResetRoutesToPlanResponse();
    }

    /**
     * Create an instance of {@link AdjustActuals }
     * 
     */
    public AdjustActuals createAdjustActuals() {
        return new AdjustActuals();
    }

    /**
     * Create an instance of {@link AdjustActualsResponse }
     * 
     */
    public AdjustActualsResponse createAdjustActualsResponse() {
        return new AdjustActualsResponse();
    }

    /**
     * Create an instance of {@link AcknowledgeCanceledStops }
     * 
     */
    public AcknowledgeCanceledStops createAcknowledgeCanceledStops() {
        return new AcknowledgeCanceledStops();
    }

    /**
     * Create an instance of {@link AcknowledgeCanceledStopsResponse }
     * 
     */
    public AcknowledgeCanceledStopsResponse createAcknowledgeCanceledStopsResponse() {
        return new AcknowledgeCanceledStopsResponse();
    }

    /**
     * Create an instance of {@link AcknowledgeUnknownStops }
     * 
     */
    public AcknowledgeUnknownStops createAcknowledgeUnknownStops() {
        return new AcknowledgeUnknownStops();
    }

    /**
     * Create an instance of {@link AcknowledgeUnknownStopsResponse }
     * 
     */
    public AcknowledgeUnknownStopsResponse createAcknowledgeUnknownStopsResponse() {
        return new AcknowledgeUnknownStopsResponse();
    }

    /**
     * Create an instance of {@link AssociateStationaryResourceEventWithStops }
     * 
     */
    public AssociateStationaryResourceEventWithStops createAssociateStationaryResourceEventWithStops() {
        return new AssociateStationaryResourceEventWithStops();
    }

    /**
     * Create an instance of {@link AssociateStationaryResourceEventWithStopsResponse }
     * 
     */
    public AssociateStationaryResourceEventWithStopsResponse createAssociateStationaryResourceEventWithStopsResponse() {
        return new AssociateStationaryResourceEventWithStopsResponse();
    }

    /**
     * Create an instance of {@link AddStopsUsingStationaryResourceEvent }
     * 
     */
    public AddStopsUsingStationaryResourceEvent createAddStopsUsingStationaryResourceEvent() {
        return new AddStopsUsingStationaryResourceEvent();
    }

    /**
     * Create an instance of {@link AddStopsUsingStationaryResourceEventResponse }
     * 
     */
    public AddStopsUsingStationaryResourceEventResponse createAddStopsUsingStationaryResourceEventResponse() {
        return new AddStopsUsingStationaryResourceEventResponse();
    }

    /**
     * Create an instance of {@link RetrieveAssociatedStops }
     * 
     */
    public RetrieveAssociatedStops createRetrieveAssociatedStops() {
        return new RetrieveAssociatedStops();
    }

    /**
     * Create an instance of {@link RetrieveAssociatedStopsResponse }
     * 
     */
    public RetrieveAssociatedStopsResponse createRetrieveAssociatedStopsResponse() {
        return new RetrieveAssociatedStopsResponse();
    }

    /**
     * Create an instance of {@link MarkStopAsUnserviceable }
     * 
     */
    public MarkStopAsUnserviceable createMarkStopAsUnserviceable() {
        return new MarkStopAsUnserviceable();
    }

    /**
     * Create an instance of {@link MarkStopAsUnserviceableResponse }
     * 
     */
    public MarkStopAsUnserviceableResponse createMarkStopAsUnserviceableResponse() {
        return new MarkStopAsUnserviceableResponse();
    }

    /**
     * Create an instance of {@link UnarriveStops }
     * 
     */
    public UnarriveStops createUnarriveStops() {
        return new UnarriveStops();
    }

    /**
     * Create an instance of {@link UnarriveStopsResponse }
     * 
     */
    public UnarriveStopsResponse createUnarriveStopsResponse() {
        return new UnarriveStopsResponse();
    }

    /**
     * Create an instance of {@link TransferResourceEventSet }
     * 
     */
    public TransferResourceEventSet createTransferResourceEventSet() {
        return new TransferResourceEventSet();
    }

    /**
     * Create an instance of {@link TransferResourceEventSetResponse }
     * 
     */
    public TransferResourceEventSetResponse createTransferResourceEventSetResponse() {
        return new TransferResourceEventSetResponse();
    }

    /**
     * Create an instance of {@link SuspendRoute }
     * 
     */
    public SuspendRoute createSuspendRoute() {
        return new SuspendRoute();
    }

    /**
     * Create an instance of {@link SuspendRouteResponse }
     * 
     */
    public SuspendRouteResponse createSuspendRouteResponse() {
        return new SuspendRouteResponse();
    }

    /**
     * Create an instance of {@link EnableAutonomousDispatch }
     * 
     */
    public EnableAutonomousDispatch createEnableAutonomousDispatch() {
        return new EnableAutonomousDispatch();
    }

    /**
     * Create an instance of {@link EnableAutonomousDispatchResponse }
     * 
     */
    public EnableAutonomousDispatchResponse createEnableAutonomousDispatchResponse() {
        return new EnableAutonomousDispatchResponse();
    }

    /**
     * Create an instance of {@link DisableAutonomousDispatch }
     * 
     */
    public DisableAutonomousDispatch createDisableAutonomousDispatch() {
        return new DisableAutonomousDispatch();
    }

    /**
     * Create an instance of {@link DisableAutonomousDispatchResponse }
     * 
     */
    public DisableAutonomousDispatchResponse createDisableAutonomousDispatchResponse() {
        return new DisableAutonomousDispatchResponse();
    }

    /**
     * Create an instance of {@link CalculateOptimalRouteMetrics }
     * 
     */
    public CalculateOptimalRouteMetrics createCalculateOptimalRouteMetrics() {
        return new CalculateOptimalRouteMetrics();
    }

    /**
     * Create an instance of {@link CalculateOptimalRouteMetricsResponse }
     * 
     */
    public CalculateOptimalRouteMetricsResponse createCalculateOptimalRouteMetricsResponse() {
        return new CalculateOptimalRouteMetricsResponse();
    }

    /**
     * Create an instance of {@link SaveOrders }
     * 
     */
    public SaveOrders createSaveOrders() {
        return new SaveOrders();
    }

    /**
     * Create an instance of {@link SaveOrdersResponse }
     * 
     */
    public SaveOrdersResponse createSaveOrdersResponse() {
        return new SaveOrdersResponse();
    }

    /**
     * Create an instance of {@link SaveOrdersEx }
     * 
     */
    public SaveOrdersEx createSaveOrdersEx() {
        return new SaveOrdersEx();
    }

    /**
     * Create an instance of {@link SaveOrdersExResponse }
     * 
     */
    public SaveOrdersExResponse createSaveOrdersExResponse() {
        return new SaveOrdersExResponse();
    }

    /**
     * Create an instance of {@link MoveUnassignedOrdersToSession }
     * 
     */
    public MoveUnassignedOrdersToSession createMoveUnassignedOrdersToSession() {
        return new MoveUnassignedOrdersToSession();
    }

    /**
     * Create an instance of {@link MoveUnassignedOrdersToSessionResponse }
     * 
     */
    public MoveUnassignedOrdersToSessionResponse createMoveUnassignedOrdersToSessionResponse() {
        return new MoveUnassignedOrdersToSessionResponse();
    }

    /**
     * Create an instance of {@link CreateTerritory }
     * 
     */
    public CreateTerritory createCreateTerritory() {
        return new CreateTerritory();
    }

    /**
     * Create an instance of {@link CreateTerritoryResponse }
     * 
     */
    public CreateTerritoryResponse createCreateTerritoryResponse() {
        return new CreateTerritoryResponse();
    }

    /**
     * Create an instance of {@link UpdateTerritories }
     * 
     */
    public UpdateTerritories createUpdateTerritories() {
        return new UpdateTerritories();
    }

    /**
     * Create an instance of {@link UpdateTerritoriesResponse }
     * 
     */
    public UpdateTerritoriesResponse createUpdateTerritoriesResponse() {
        return new UpdateTerritoriesResponse();
    }

    /**
     * Create an instance of {@link DeleteTerritories }
     * 
     */
    public DeleteTerritories createDeleteTerritories() {
        return new DeleteTerritories();
    }

    /**
     * Create an instance of {@link DeleteTerritoriesResponse }
     * 
     */
    public DeleteTerritoriesResponse createDeleteTerritoriesResponse() {
        return new DeleteTerritoriesResponse();
    }

    /**
     * Create an instance of {@link StartDeleteTerritoriesJob }
     * 
     */
    public StartDeleteTerritoriesJob createStartDeleteTerritoriesJob() {
        return new StartDeleteTerritoriesJob();
    }

    /**
     * Create an instance of {@link StartDeleteTerritoriesJobResponse }
     * 
     */
    public StartDeleteTerritoriesJobResponse createStartDeleteTerritoriesJobResponse() {
        return new StartDeleteTerritoriesJobResponse();
    }

    /**
     * Create an instance of {@link OptimizeTerritories }
     * 
     */
    public OptimizeTerritories createOptimizeTerritories() {
        return new OptimizeTerritories();
    }

    /**
     * Create an instance of {@link OptimizeTerritoriesResponse }
     * 
     */
    public OptimizeTerritoriesResponse createOptimizeTerritoriesResponse() {
        return new OptimizeTerritoriesResponse();
    }

    /**
     * Create an instance of {@link ExportPlanningSolution }
     * 
     */
    public ExportPlanningSolution createExportPlanningSolution() {
        return new ExportPlanningSolution();
    }

    /**
     * Create an instance of {@link ExportPlanningSolutionResponse }
     * 
     */
    public ExportPlanningSolutionResponse createExportPlanningSolutionResponse() {
        return new ExportPlanningSolutionResponse();
    }

    /**
     * Create an instance of {@link BuildSameDayMatrices }
     * 
     */
    public BuildSameDayMatrices createBuildSameDayMatrices() {
        return new BuildSameDayMatrices();
    }

    /**
     * Create an instance of {@link BuildSameDayMatricesResponse }
     * 
     */
    public BuildSameDayMatricesResponse createBuildSameDayMatricesResponse() {
        return new BuildSameDayMatricesResponse();
    }

    /**
     * Create an instance of {@link SaveCorrespondence }
     * 
     */
    public SaveCorrespondence createSaveCorrespondence() {
        return new SaveCorrespondence();
    }

    /**
     * Create an instance of {@link SaveCorrespondenceResponse }
     * 
     */
    public SaveCorrespondenceResponse createSaveCorrespondenceResponse() {
        return new SaveCorrespondenceResponse();
    }

    /**
     * Create an instance of {@link CreateCorrespondenceForWorker }
     * 
     */
    public CreateCorrespondenceForWorker createCreateCorrespondenceForWorker() {
        return new CreateCorrespondenceForWorker();
    }

    /**
     * Create an instance of {@link CreateCorrespondenceForWorkerResponse }
     * 
     */
    public CreateCorrespondenceForWorkerResponse createCreateCorrespondenceForWorkerResponse() {
        return new CreateCorrespondenceForWorkerResponse();
    }

    /**
     * Create an instance of {@link UpdateCorrespondenceStatusForWorker }
     * 
     */
    public UpdateCorrespondenceStatusForWorker createUpdateCorrespondenceStatusForWorker() {
        return new UpdateCorrespondenceStatusForWorker();
    }

    /**
     * Create an instance of {@link UpdateCorrespondenceStatusForWorkerResponse }
     * 
     */
    public UpdateCorrespondenceStatusForWorkerResponse createUpdateCorrespondenceStatusForWorkerResponse() {
        return new UpdateCorrespondenceStatusForWorkerResponse();
    }

    /**
     * Create an instance of {@link UpdateEmailSenderVerificationStatus }
     * 
     */
    public UpdateEmailSenderVerificationStatus createUpdateEmailSenderVerificationStatus() {
        return new UpdateEmailSenderVerificationStatus();
    }

    /**
     * Create an instance of {@link UpdateEmailSenderVerificationStatusResponse }
     * 
     */
    public UpdateEmailSenderVerificationStatusResponse createUpdateEmailSenderVerificationStatusResponse() {
        return new UpdateEmailSenderVerificationStatusResponse();
    }

    /**
     * Create an instance of {@link SuggestTerritoryForRecurringOrder }
     * 
     */
    public SuggestTerritoryForRecurringOrder createSuggestTerritoryForRecurringOrder() {
        return new SuggestTerritoryForRecurringOrder();
    }

    /**
     * Create an instance of {@link SuggestTerritoryForRecurringOrderResponse }
     * 
     */
    public SuggestTerritoryForRecurringOrderResponse createSuggestTerritoryForRecurringOrderResponse() {
        return new SuggestTerritoryForRecurringOrderResponse();
    }

    /**
     * Create an instance of {@link ScheduleEquipmentMaintenance }
     * 
     */
    public ScheduleEquipmentMaintenance createScheduleEquipmentMaintenance() {
        return new ScheduleEquipmentMaintenance();
    }

    /**
     * Create an instance of {@link ScheduleEquipmentMaintenanceResponse }
     * 
     */
    public ScheduleEquipmentMaintenanceResponse createScheduleEquipmentMaintenanceResponse() {
        return new ScheduleEquipmentMaintenanceResponse();
    }

    /**
     * Create an instance of {@link CreateEquipmentService }
     * 
     */
    public CreateEquipmentService createCreateEquipmentService() {
        return new CreateEquipmentService();
    }

    /**
     * Create an instance of {@link CreateEquipmentServiceResponse }
     * 
     */
    public CreateEquipmentServiceResponse createCreateEquipmentServiceResponse() {
        return new CreateEquipmentServiceResponse();
    }

    /**
     * Create an instance of {@link UpdateEquipmentService }
     * 
     */
    public UpdateEquipmentService createUpdateEquipmentService() {
        return new UpdateEquipmentService();
    }

    /**
     * Create an instance of {@link UpdateEquipmentServiceResponse }
     * 
     */
    public UpdateEquipmentServiceResponse createUpdateEquipmentServiceResponse() {
        return new UpdateEquipmentServiceResponse();
    }

    /**
     * Create an instance of {@link DeleteEquipmentService }
     * 
     */
    public DeleteEquipmentService createDeleteEquipmentService() {
        return new DeleteEquipmentService();
    }

    /**
     * Create an instance of {@link DeleteEquipmentServiceResponse }
     * 
     */
    public DeleteEquipmentServiceResponse createDeleteEquipmentServiceResponse() {
        return new DeleteEquipmentServiceResponse();
    }

    /**
     * Create an instance of {@link MoveStrategicStopsToBestPosition }
     * 
     */
    public MoveStrategicStopsToBestPosition createMoveStrategicStopsToBestPosition() {
        return new MoveStrategicStopsToBestPosition();
    }

    /**
     * Create an instance of {@link MoveStrategicStopsToBestPositionResponse }
     * 
     */
    public MoveStrategicStopsToBestPositionResponse createMoveStrategicStopsToBestPositionResponse() {
        return new MoveStrategicStopsToBestPositionResponse();
    }

    /**
     * Create an instance of {@link MoveStrategicStops }
     * 
     */
    public MoveStrategicStops createMoveStrategicStops() {
        return new MoveStrategicStops();
    }

    /**
     * Create an instance of {@link MoveStrategicStopsResponse }
     * 
     */
    public MoveStrategicStopsResponse createMoveStrategicStopsResponse() {
        return new MoveStrategicStopsResponse();
    }

    /**
     * Create an instance of {@link RemoveStrategicStopsFromTerritories }
     * 
     */
    public RemoveStrategicStopsFromTerritories createRemoveStrategicStopsFromTerritories() {
        return new RemoveStrategicStopsFromTerritories();
    }

    /**
     * Create an instance of {@link RemoveStrategicStopsFromTerritoriesResponse }
     * 
     */
    public RemoveStrategicStopsFromTerritoriesResponse createRemoveStrategicStopsFromTerritoriesResponse() {
        return new RemoveStrategicStopsFromTerritoriesResponse();
    }

    /**
     * Create an instance of {@link SaveWorkerLogEvents }
     * 
     */
    public SaveWorkerLogEvents createSaveWorkerLogEvents() {
        return new SaveWorkerLogEvents();
    }

    /**
     * Create an instance of {@link SaveWorkerLogEventsResponse }
     * 
     */
    public SaveWorkerLogEventsResponse createSaveWorkerLogEventsResponse() {
        return new SaveWorkerLogEventsResponse();
    }

    /**
     * Create an instance of {@link MoveRecurringOrdersToTerritory }
     * 
     */
    public MoveRecurringOrdersToTerritory createMoveRecurringOrdersToTerritory() {
        return new MoveRecurringOrdersToTerritory();
    }

    /**
     * Create an instance of {@link MoveRecurringOrdersToTerritoryResponse }
     * 
     */
    public MoveRecurringOrdersToTerritoryResponse createMoveRecurringOrdersToTerritoryResponse() {
        return new MoveRecurringOrdersToTerritoryResponse();
    }

    /**
     * Create an instance of {@link MoveRecurringOrdersToBestPosition }
     * 
     */
    public MoveRecurringOrdersToBestPosition createMoveRecurringOrdersToBestPosition() {
        return new MoveRecurringOrdersToBestPosition();
    }

    /**
     * Create an instance of {@link MoveRecurringOrdersToBestPositionResponse }
     * 
     */
    public MoveRecurringOrdersToBestPositionResponse createMoveRecurringOrdersToBestPositionResponse() {
        return new MoveRecurringOrdersToBestPositionResponse();
    }

    /**
     * Create an instance of {@link MoveRecurringOrders }
     * 
     */
    public MoveRecurringOrders createMoveRecurringOrders() {
        return new MoveRecurringOrders();
    }

    /**
     * Create an instance of {@link MoveRecurringOrdersResponse }
     * 
     */
    public MoveRecurringOrdersResponse createMoveRecurringOrdersResponse() {
        return new MoveRecurringOrdersResponse();
    }

    /**
     * Create an instance of {@link RemoveRecurringOrdersFromTerritories }
     * 
     */
    public RemoveRecurringOrdersFromTerritories createRemoveRecurringOrdersFromTerritories() {
        return new RemoveRecurringOrdersFromTerritories();
    }

    /**
     * Create an instance of {@link RemoveRecurringOrdersFromTerritoriesResponse }
     * 
     */
    public RemoveRecurringOrdersFromTerritoriesResponse createRemoveRecurringOrdersFromTerritoriesResponse() {
        return new RemoveRecurringOrdersFromTerritoriesResponse();
    }

    /**
     * Create an instance of {@link SwitchRecurringOrderServicePattern }
     * 
     */
    public SwitchRecurringOrderServicePattern createSwitchRecurringOrderServicePattern() {
        return new SwitchRecurringOrderServicePattern();
    }

    /**
     * Create an instance of {@link SwitchRecurringOrderServicePatternResponse }
     * 
     */
    public SwitchRecurringOrderServicePatternResponse createSwitchRecurringOrderServicePatternResponse() {
        return new SwitchRecurringOrderServicePatternResponse();
    }

    /**
     * Create an instance of {@link OverrideCoordinateForRecurringOrder }
     * 
     */
    public OverrideCoordinateForRecurringOrder createOverrideCoordinateForRecurringOrder() {
        return new OverrideCoordinateForRecurringOrder();
    }

    /**
     * Create an instance of {@link OverrideCoordinateForRecurringOrderResponse }
     * 
     */
    public OverrideCoordinateForRecurringOrderResponse createOverrideCoordinateForRecurringOrderResponse() {
        return new OverrideCoordinateForRecurringOrderResponse();
    }

    /**
     * Create an instance of {@link ShareEntity }
     * 
     */
    public ShareEntity createShareEntity() {
        return new ShareEntity();
    }

    /**
     * Create an instance of {@link ShareEntityResponse }
     * 
     */
    public ShareEntityResponse createShareEntityResponse() {
        return new ShareEntityResponse();
    }

    /**
     * Create an instance of {@link CreateAndUpdateSharedEntityAccess }
     * 
     */
    public CreateAndUpdateSharedEntityAccess createCreateAndUpdateSharedEntityAccess() {
        return new CreateAndUpdateSharedEntityAccess();
    }

    /**
     * Create an instance of {@link CreateAndUpdateSharedEntityAccessResponse }
     * 
     */
    public CreateAndUpdateSharedEntityAccessResponse createCreateAndUpdateSharedEntityAccessResponse() {
        return new CreateAndUpdateSharedEntityAccessResponse();
    }

    /**
     * Create an instance of {@link CreateTerritories }
     * 
     */
    public CreateTerritories createCreateTerritories() {
        return new CreateTerritories();
    }

    /**
     * Create an instance of {@link CreateTerritoriesResponse }
     * 
     */
    public CreateTerritoriesResponse createCreateTerritoriesResponse() {
        return new CreateTerritoriesResponse();
    }

    /**
     * Create an instance of {@link CreateStrategicRoutes }
     * 
     */
    public CreateStrategicRoutes createCreateStrategicRoutes() {
        return new CreateStrategicRoutes();
    }

    /**
     * Create an instance of {@link CreateStrategicRoutesResponse }
     * 
     */
    public CreateStrategicRoutesResponse createCreateStrategicRoutesResponse() {
        return new CreateStrategicRoutesResponse();
    }

    /**
     * Create an instance of {@link CalculateCreateTerritoriesTargets }
     * 
     */
    public CalculateCreateTerritoriesTargets createCalculateCreateTerritoriesTargets() {
        return new CalculateCreateTerritoriesTargets();
    }

    /**
     * Create an instance of {@link CalculateCreateTerritoriesTargetsResponse }
     * 
     */
    public CalculateCreateTerritoriesTargetsResponse createCalculateCreateTerritoriesTargetsResponse() {
        return new CalculateCreateTerritoriesTargetsResponse();
    }

    /**
     * Create an instance of {@link CalculateCreateTerritoriesTargetsForPass }
     * 
     */
    public CalculateCreateTerritoriesTargetsForPass createCalculateCreateTerritoriesTargetsForPass() {
        return new CalculateCreateTerritoriesTargetsForPass();
    }

    /**
     * Create an instance of {@link CalculateCreateTerritoriesTargetsForPassResponse }
     * 
     */
    public CalculateCreateTerritoriesTargetsForPassResponse createCalculateCreateTerritoriesTargetsForPassResponse() {
        return new CalculateCreateTerritoriesTargetsForPassResponse();
    }

    /**
     * Create an instance of {@link UpdateDailyRoutesJob }
     * 
     */
    public UpdateDailyRoutesJob createUpdateDailyRoutesJob() {
        return new UpdateDailyRoutesJob();
    }

    /**
     * Create an instance of {@link UpdateDailyRoutesJobResponse }
     * 
     */
    public UpdateDailyRoutesJobResponse createUpdateDailyRoutesJobResponse() {
        return new UpdateDailyRoutesJobResponse();
    }

    /**
     * Create an instance of {@link ShiftDaysJob }
     * 
     */
    public ShiftDaysJob createShiftDaysJob() {
        return new ShiftDaysJob();
    }

    /**
     * Create an instance of {@link ShiftDaysJobResponse }
     * 
     */
    public ShiftDaysJobResponse createShiftDaysJobResponse() {
        return new ShiftDaysJobResponse();
    }

    /**
     * Create an instance of {@link TransferRecurringOrdersToSession }
     * 
     */
    public TransferRecurringOrdersToSession createTransferRecurringOrdersToSession() {
        return new TransferRecurringOrdersToSession();
    }

    /**
     * Create an instance of {@link TransferRecurringOrdersToSessionResponse }
     * 
     */
    public TransferRecurringOrdersToSessionResponse createTransferRecurringOrdersToSessionResponse() {
        return new TransferRecurringOrdersToSessionResponse();
    }

    /**
     * Create an instance of {@link RemoveRouteBasedData }
     * 
     */
    public RemoveRouteBasedData createRemoveRouteBasedData() {
        return new RemoveRouteBasedData();
    }

    /**
     * Create an instance of {@link RemoveRouteBasedDataResponse }
     * 
     */
    public RemoveRouteBasedDataResponse createRemoveRouteBasedDataResponse() {
        return new RemoveRouteBasedDataResponse();
    }

    /**
     * Create an instance of {@link SaveStagedRoutes }
     * 
     */
    public SaveStagedRoutes createSaveStagedRoutes() {
        return new SaveStagedRoutes();
    }

    /**
     * Create an instance of {@link SaveStagedRoutesResponse }
     * 
     */
    public SaveStagedRoutesResponse createSaveStagedRoutesResponse() {
        return new SaveStagedRoutesResponse();
    }

    /**
     * Create an instance of {@link SaveRegionAsOperationsUnit }
     * 
     */
    public SaveRegionAsOperationsUnit createSaveRegionAsOperationsUnit() {
        return new SaveRegionAsOperationsUnit();
    }

    /**
     * Create an instance of {@link SaveRegionAsOperationsUnitResponse }
     * 
     */
    public SaveRegionAsOperationsUnitResponse createSaveRegionAsOperationsUnitResponse() {
        return new SaveRegionAsOperationsUnitResponse();
    }

    /**
     * Create an instance of {@link SaveDepotAsOperationsUnit }
     * 
     */
    public SaveDepotAsOperationsUnit createSaveDepotAsOperationsUnit() {
        return new SaveDepotAsOperationsUnit();
    }

    /**
     * Create an instance of {@link SaveDepotAsOperationsUnitResponse }
     * 
     */
    public SaveDepotAsOperationsUnitResponse createSaveDepotAsOperationsUnitResponse() {
        return new SaveDepotAsOperationsUnitResponse();
    }

    /**
     * Create an instance of {@link SaveOperationsHierarchy }
     * 
     */
    public SaveOperationsHierarchy createSaveOperationsHierarchy() {
        return new SaveOperationsHierarchy();
    }

    /**
     * Create an instance of {@link SaveOperationsHierarchyResponse }
     * 
     */
    public SaveOperationsHierarchyResponse createSaveOperationsHierarchyResponse() {
        return new SaveOperationsHierarchyResponse();
    }

    /**
     * Create an instance of {@link SaveOperationsUnitLevel }
     * 
     */
    public SaveOperationsUnitLevel createSaveOperationsUnitLevel() {
        return new SaveOperationsUnitLevel();
    }

    /**
     * Create an instance of {@link SaveOperationsUnitLevelResponse }
     * 
     */
    public SaveOperationsUnitLevelResponse createSaveOperationsUnitLevelResponse() {
        return new SaveOperationsUnitLevelResponse();
    }

    /**
     * Create an instance of {@link SaveOperationsUnitDimension }
     * 
     */
    public SaveOperationsUnitDimension createSaveOperationsUnitDimension() {
        return new SaveOperationsUnitDimension();
    }

    /**
     * Create an instance of {@link SaveOperationsUnitDimensionResponse }
     * 
     */
    public SaveOperationsUnitDimensionResponse createSaveOperationsUnitDimensionResponse() {
        return new SaveOperationsUnitDimensionResponse();
    }

    /**
     * Create an instance of {@link ActiveAlertUnsubscribe }
     * 
     */
    public ActiveAlertUnsubscribe createActiveAlertUnsubscribe() {
        return new ActiveAlertUnsubscribe();
    }

    /**
     * Create an instance of {@link ActiveAlertUnsubscribeResponse }
     * 
     */
    public ActiveAlertUnsubscribeResponse createActiveAlertUnsubscribeResponse() {
        return new ActiveAlertUnsubscribeResponse();
    }

    /**
     * Create an instance of {@link EnqueueTestSmsMessage }
     * 
     */
    public EnqueueTestSmsMessage createEnqueueTestSmsMessage() {
        return new EnqueueTestSmsMessage();
    }

    /**
     * Create an instance of {@link EnqueueTestSmsMessageResponse }
     * 
     */
    public EnqueueTestSmsMessageResponse createEnqueueTestSmsMessageResponse() {
        return new EnqueueTestSmsMessageResponse();
    }

    /**
     * Create an instance of {@link OpenStrategicRoutingSession }
     * 
     */
    public OpenStrategicRoutingSession createOpenStrategicRoutingSession() {
        return new OpenStrategicRoutingSession();
    }

    /**
     * Create an instance of {@link OpenStrategicRoutingSessionResponse }
     * 
     */
    public OpenStrategicRoutingSessionResponse createOpenStrategicRoutingSessionResponse() {
        return new OpenStrategicRoutingSessionResponse();
    }

    /**
     * Create an instance of {@link CloseStrategicRoutingSession }
     * 
     */
    public CloseStrategicRoutingSession createCloseStrategicRoutingSession() {
        return new CloseStrategicRoutingSession();
    }

    /**
     * Create an instance of {@link CloseStrategicRoutingSessionResponse }
     * 
     */
    public CloseStrategicRoutingSessionResponse createCloseStrategicRoutingSessionResponse() {
        return new CloseStrategicRoutingSessionResponse();
    }

    /**
     * Create an instance of {@link DeleteStrategicRoutingSession }
     * 
     */
    public DeleteStrategicRoutingSession createDeleteStrategicRoutingSession() {
        return new DeleteStrategicRoutingSession();
    }

    /**
     * Create an instance of {@link DeleteStrategicRoutingSessionResponse }
     * 
     */
    public DeleteStrategicRoutingSessionResponse createDeleteStrategicRoutingSessionResponse() {
        return new DeleteStrategicRoutingSessionResponse();
    }

    /**
     * Create an instance of {@link SaveSessionAs }
     * 
     */
    public SaveSessionAs createSaveSessionAs() {
        return new SaveSessionAs();
    }

    /**
     * Create an instance of {@link SaveSessionAsResponse }
     * 
     */
    public SaveSessionAsResponse createSaveSessionAsResponse() {
        return new SaveSessionAsResponse();
    }

    /**
     * Create an instance of {@link PrepareForNextDay }
     * 
     */
    public PrepareForNextDay createPrepareForNextDay() {
        return new PrepareForNextDay();
    }

    /**
     * Create an instance of {@link PrepareForNextDayResponse }
     * 
     */
    public PrepareForNextDayResponse createPrepareForNextDayResponse() {
        return new PrepareForNextDayResponse();
    }

    /**
     * Create an instance of {@link GetOrAddModelingSessionForOperationalSession }
     * 
     */
    public GetOrAddModelingSessionForOperationalSession createGetOrAddModelingSessionForOperationalSession() {
        return new GetOrAddModelingSessionForOperationalSession();
    }

    /**
     * Create an instance of {@link GetOrAddModelingSessionForOperationalSessionResponse }
     * 
     */
    public GetOrAddModelingSessionForOperationalSessionResponse createGetOrAddModelingSessionForOperationalSessionResponse() {
        return new GetOrAddModelingSessionForOperationalSessionResponse();
    }

    /**
     * Create an instance of {@link CopyRouteToSession }
     * 
     */
    public CopyRouteToSession createCopyRouteToSession() {
        return new CopyRouteToSession();
    }

    /**
     * Create an instance of {@link CopyRouteToSessionResponse }
     * 
     */
    public CopyRouteToSessionResponse createCopyRouteToSessionResponse() {
        return new CopyRouteToSessionResponse();
    }

    /**
     * Create an instance of {@link ReleaseStrategicSessionLock }
     * 
     */
    public ReleaseStrategicSessionLock createReleaseStrategicSessionLock() {
        return new ReleaseStrategicSessionLock();
    }

    /**
     * Create an instance of {@link ReleaseStrategicSessionLockResponse }
     * 
     */
    public ReleaseStrategicSessionLockResponse createReleaseStrategicSessionLockResponse() {
        return new ReleaseStrategicSessionLockResponse();
    }

    /**
     * Create an instance of {@link RetrieveFromPlanningSession }
     * 
     */
    public RetrieveFromPlanningSession createRetrieveFromPlanningSession() {
        return new RetrieveFromPlanningSession();
    }

    /**
     * Create an instance of {@link RetrieveFromPlanningSessionResponse }
     * 
     */
    public RetrieveFromPlanningSessionResponse createRetrieveFromPlanningSessionResponse() {
        return new RetrieveFromPlanningSessionResponse();
    }

    /**
     * Create an instance of {@link InitializeStrategicRoutingSessionCache }
     * 
     */
    public InitializeStrategicRoutingSessionCache createInitializeStrategicRoutingSessionCache() {
        return new InitializeStrategicRoutingSessionCache();
    }

    /**
     * Create an instance of {@link InitializeStrategicRoutingSessionCacheResponse }
     * 
     */
    public InitializeStrategicRoutingSessionCacheResponse createInitializeStrategicRoutingSessionCacheResponse() {
        return new InitializeStrategicRoutingSessionCacheResponse();
    }

    /**
     * Create an instance of {@link UpdateStrategicRoutingSessionCache }
     * 
     */
    public UpdateStrategicRoutingSessionCache createUpdateStrategicRoutingSessionCache() {
        return new UpdateStrategicRoutingSessionCache();
    }

    /**
     * Create an instance of {@link UpdateStrategicRoutingSessionCacheResponse }
     * 
     */
    public UpdateStrategicRoutingSessionCacheResponse createUpdateStrategicRoutingSessionCacheResponse() {
        return new UpdateStrategicRoutingSessionCacheResponse();
    }

    /**
     * Create an instance of {@link Import }
     * 
     */
    public Import createImport() {
        return new Import();
    }

    /**
     * Create an instance of {@link ImportResponse }
     * 
     */
    public ImportResponse createImportResponse() {
        return new ImportResponse();
    }

    /**
     * Create an instance of {@link ExportCustomForms }
     * 
     */
    public ExportCustomForms createExportCustomForms() {
        return new ExportCustomForms();
    }

    /**
     * Create an instance of {@link ExportCustomFormsResponse }
     * 
     */
    public ExportCustomFormsResponse createExportCustomFormsResponse() {
        return new ExportCustomFormsResponse();
    }

    /**
     * Create an instance of {@link LockOrdersForStops }
     * 
     */
    public LockOrdersForStops createLockOrdersForStops() {
        return new LockOrdersForStops();
    }

    /**
     * Create an instance of {@link LockOrdersForStopsResponse }
     * 
     */
    public LockOrdersForStopsResponse createLockOrdersForStopsResponse() {
        return new LockOrdersForStopsResponse();
    }

    /**
     * Create an instance of {@link LockOrdersForRoutes }
     * 
     */
    public LockOrdersForRoutes createLockOrdersForRoutes() {
        return new LockOrdersForRoutes();
    }

    /**
     * Create an instance of {@link LockOrdersForRoutesResponse }
     * 
     */
    public LockOrdersForRoutesResponse createLockOrdersForRoutesResponse() {
        return new LockOrdersForRoutesResponse();
    }

    /**
     * Create an instance of {@link UnlockOrdersForStops }
     * 
     */
    public UnlockOrdersForStops createUnlockOrdersForStops() {
        return new UnlockOrdersForStops();
    }

    /**
     * Create an instance of {@link UnlockOrdersForStopsResponse }
     * 
     */
    public UnlockOrdersForStopsResponse createUnlockOrdersForStopsResponse() {
        return new UnlockOrdersForStopsResponse();
    }

    /**
     * Create an instance of {@link UnlockOrdersForRoutes }
     * 
     */
    public UnlockOrdersForRoutes createUnlockOrdersForRoutes() {
        return new UnlockOrdersForRoutes();
    }

    /**
     * Create an instance of {@link UnlockOrdersForRoutesResponse }
     * 
     */
    public UnlockOrdersForRoutesResponse createUnlockOrdersForRoutesResponse() {
        return new UnlockOrdersForRoutesResponse();
    }

    /**
     * Create an instance of {@link LoadRoute }
     * 
     */
    public LoadRoute createLoadRoute() {
        return new LoadRoute();
    }

    /**
     * Create an instance of {@link LoadRouteResponse }
     * 
     */
    public LoadRouteResponse createLoadRouteResponse() {
        return new LoadRouteResponse();
    }

    /**
     * Create an instance of {@link RetrieveRoutesForDevice }
     * 
     */
    public RetrieveRoutesForDevice createRetrieveRoutesForDevice() {
        return new RetrieveRoutesForDevice();
    }

    /**
     * Create an instance of {@link RetrieveRoutesForDeviceResponse }
     * 
     */
    public RetrieveRoutesForDeviceResponse createRetrieveRoutesForDeviceResponse() {
        return new RetrieveRoutesForDeviceResponse();
    }

    /**
     * Create an instance of {@link PreviewRoute }
     * 
     */
    public PreviewRoute createPreviewRoute() {
        return new PreviewRoute();
    }

    /**
     * Create an instance of {@link PreviewRouteResponse }
     * 
     */
    public PreviewRouteResponse createPreviewRouteResponse() {
        return new PreviewRouteResponse();
    }

    /**
     * Create an instance of {@link ProcessMobileDeviceActions }
     * 
     */
    public ProcessMobileDeviceActions createProcessMobileDeviceActions() {
        return new ProcessMobileDeviceActions();
    }

    /**
     * Create an instance of {@link ProcessMobileDeviceActionsResponse }
     * 
     */
    public ProcessMobileDeviceActionsResponse createProcessMobileDeviceActionsResponse() {
        return new ProcessMobileDeviceActionsResponse();
    }

    /**
     * Create an instance of {@link SendTextMessageToDriver }
     * 
     */
    public SendTextMessageToDriver createSendTextMessageToDriver() {
        return new SendTextMessageToDriver();
    }

    /**
     * Create an instance of {@link SendTextMessageToDriverResponse }
     * 
     */
    public SendTextMessageToDriverResponse createSendTextMessageToDriverResponse() {
        return new SendTextMessageToDriverResponse();
    }

    /**
     * Create an instance of {@link SendTextMessageToDrivers }
     * 
     */
    public SendTextMessageToDrivers createSendTextMessageToDrivers() {
        return new SendTextMessageToDrivers();
    }

    /**
     * Create an instance of {@link SendTextMessageToDriversResponse }
     * 
     */
    public SendTextMessageToDriversResponse createSendTextMessageToDriversResponse() {
        return new SendTextMessageToDriversResponse();
    }

    /**
     * Create an instance of {@link SendInstallUriToDevices }
     * 
     */
    public SendInstallUriToDevices createSendInstallUriToDevices() {
        return new SendInstallUriToDevices();
    }

    /**
     * Create an instance of {@link SendInstallUriToDevicesResponse }
     * 
     */
    public SendInstallUriToDevicesResponse createSendInstallUriToDevicesResponse() {
        return new SendInstallUriToDevicesResponse();
    }

    /**
     * Create an instance of {@link SendTelematicsDeviceConfiguration }
     * 
     */
    public SendTelematicsDeviceConfiguration createSendTelematicsDeviceConfiguration() {
        return new SendTelematicsDeviceConfiguration();
    }

    /**
     * Create an instance of {@link SendTelematicsDeviceConfigurationResponse }
     * 
     */
    public SendTelematicsDeviceConfigurationResponse createSendTelematicsDeviceConfigurationResponse() {
        return new SendTelematicsDeviceConfigurationResponse();
    }

    /**
     * Create an instance of {@link UpgradeRoadnetTelematicsDeviceConfiguration }
     * 
     */
    public UpgradeRoadnetTelematicsDeviceConfiguration createUpgradeRoadnetTelematicsDeviceConfiguration() {
        return new UpgradeRoadnetTelematicsDeviceConfiguration();
    }

    /**
     * Create an instance of {@link UpgradeRoadnetTelematicsDeviceConfigurationResponse }
     * 
     */
    public UpgradeRoadnetTelematicsDeviceConfigurationResponse createUpgradeRoadnetTelematicsDeviceConfigurationResponse() {
        return new UpgradeRoadnetTelematicsDeviceConfigurationResponse();
    }

    /**
     * Create an instance of {@link RebootRoadnetTelematicsDevices }
     * 
     */
    public RebootRoadnetTelematicsDevices createRebootRoadnetTelematicsDevices() {
        return new RebootRoadnetTelematicsDevices();
    }

    /**
     * Create an instance of {@link RebootRoadnetTelematicsDevicesResponse }
     * 
     */
    public RebootRoadnetTelematicsDevicesResponse createRebootRoadnetTelematicsDevicesResponse() {
        return new RebootRoadnetTelematicsDevicesResponse();
    }

    /**
     * Create an instance of {@link IgnoreRouteErrors }
     * 
     */
    public IgnoreRouteErrors createIgnoreRouteErrors() {
        return new IgnoreRouteErrors();
    }

    /**
     * Create an instance of {@link IgnoreRouteErrorsResponse }
     * 
     */
    public IgnoreRouteErrorsResponse createIgnoreRouteErrorsResponse() {
        return new IgnoreRouteErrorsResponse();
    }

    /**
     * Create an instance of {@link ClearActiveTroubleCodes }
     * 
     */
    public ClearActiveTroubleCodes createClearActiveTroubleCodes() {
        return new ClearActiveTroubleCodes();
    }

    /**
     * Create an instance of {@link ClearActiveTroubleCodesResponse }
     * 
     */
    public ClearActiveTroubleCodesResponse createClearActiveTroubleCodesResponse() {
        return new ClearActiveTroubleCodesResponse();
    }

    /**
     * Create an instance of {@link RefreshOmnitracsNavigationDeviceActivationCode }
     * 
     */
    public RefreshOmnitracsNavigationDeviceActivationCode createRefreshOmnitracsNavigationDeviceActivationCode() {
        return new RefreshOmnitracsNavigationDeviceActivationCode();
    }

    /**
     * Create an instance of {@link RefreshOmnitracsNavigationDeviceActivationCodeResponse }
     * 
     */
    public RefreshOmnitracsNavigationDeviceActivationCodeResponse createRefreshOmnitracsNavigationDeviceActivationCodeResponse() {
        return new RefreshOmnitracsNavigationDeviceActivationCodeResponse();
    }

    /**
     * Create an instance of {@link RetrieveNavigationDeviceStatus }
     * 
     */
    public RetrieveNavigationDeviceStatus createRetrieveNavigationDeviceStatus() {
        return new RetrieveNavigationDeviceStatus();
    }

    /**
     * Create an instance of {@link RetrieveNavigationDeviceStatusResponse }
     * 
     */
    public RetrieveNavigationDeviceStatusResponse createRetrieveNavigationDeviceStatusResponse() {
        return new RetrieveNavigationDeviceStatusResponse();
    }

    /**
     * Create an instance of {@link DeleteUnassignedOrderGroups }
     * 
     */
    public DeleteUnassignedOrderGroups createDeleteUnassignedOrderGroups() {
        return new DeleteUnassignedOrderGroups();
    }

    /**
     * Create an instance of {@link DeleteUnassignedOrderGroupsResponse }
     * 
     */
    public DeleteUnassignedOrderGroupsResponse createDeleteUnassignedOrderGroupsResponse() {
        return new DeleteUnassignedOrderGroupsResponse();
    }

    /**
     * Create an instance of {@link OverrideCoordinateForUnassignedOrderGroup }
     * 
     */
    public OverrideCoordinateForUnassignedOrderGroup createOverrideCoordinateForUnassignedOrderGroup() {
        return new OverrideCoordinateForUnassignedOrderGroup();
    }

    /**
     * Create an instance of {@link OverrideCoordinateForUnassignedOrderGroupResponse }
     * 
     */
    public OverrideCoordinateForUnassignedOrderGroupResponse createOverrideCoordinateForUnassignedOrderGroupResponse() {
        return new OverrideCoordinateForUnassignedOrderGroupResponse();
    }

    /**
     * Create an instance of {@link OverrideCoordinateForOrder }
     * 
     */
    public OverrideCoordinateForOrder createOverrideCoordinateForOrder() {
        return new OverrideCoordinateForOrder();
    }

    /**
     * Create an instance of {@link OverrideCoordinateForOrderResponse }
     * 
     */
    public OverrideCoordinateForOrderResponse createOverrideCoordinateForOrderResponse() {
        return new OverrideCoordinateForOrderResponse();
    }

    /**
     * Create an instance of {@link CreateRouteTemplate }
     * 
     */
    public CreateRouteTemplate createCreateRouteTemplate() {
        return new CreateRouteTemplate();
    }

    /**
     * Create an instance of {@link CreateRouteTemplateResponse }
     * 
     */
    public CreateRouteTemplateResponse createCreateRouteTemplateResponse() {
        return new CreateRouteTemplateResponse();
    }

    /**
     * Create an instance of {@link UpdateRouteTemplates }
     * 
     */
    public UpdateRouteTemplates createUpdateRouteTemplates() {
        return new UpdateRouteTemplates();
    }

    /**
     * Create an instance of {@link UpdateRouteTemplatesResponse }
     * 
     */
    public UpdateRouteTemplatesResponse createUpdateRouteTemplatesResponse() {
        return new UpdateRouteTemplatesResponse();
    }

    /**
     * Create an instance of {@link UpdateRouteTemplate }
     * 
     */
    public UpdateRouteTemplate createUpdateRouteTemplate() {
        return new UpdateRouteTemplate();
    }

    /**
     * Create an instance of {@link UpdateRouteTemplateResponse }
     * 
     */
    public UpdateRouteTemplateResponse createUpdateRouteTemplateResponse() {
        return new UpdateRouteTemplateResponse();
    }

    /**
     * Create an instance of {@link DeleteRouteTemplates }
     * 
     */
    public DeleteRouteTemplates createDeleteRouteTemplates() {
        return new DeleteRouteTemplates();
    }

    /**
     * Create an instance of {@link DeleteRouteTemplatesResponse }
     * 
     */
    public DeleteRouteTemplatesResponse createDeleteRouteTemplatesResponse() {
        return new DeleteRouteTemplatesResponse();
    }

    /**
     * Create an instance of {@link CombineRouteTemplates }
     * 
     */
    public CombineRouteTemplates createCombineRouteTemplates() {
        return new CombineRouteTemplates();
    }

    /**
     * Create an instance of {@link CombineRouteTemplatesResponse }
     * 
     */
    public CombineRouteTemplatesResponse createCombineRouteTemplatesResponse() {
        return new CombineRouteTemplatesResponse();
    }

    /**
     * Create an instance of {@link FlipRouteTemplate }
     * 
     */
    public FlipRouteTemplate createFlipRouteTemplate() {
        return new FlipRouteTemplate();
    }

    /**
     * Create an instance of {@link FlipRouteTemplateResponse }
     * 
     */
    public FlipRouteTemplateResponse createFlipRouteTemplateResponse() {
        return new FlipRouteTemplateResponse();
    }

    /**
     * Create an instance of {@link BalanceRouteTemplates }
     * 
     */
    public BalanceRouteTemplates createBalanceRouteTemplates() {
        return new BalanceRouteTemplates();
    }

    /**
     * Create an instance of {@link BalanceRouteTemplatesResponse }
     * 
     */
    public BalanceRouteTemplatesResponse createBalanceRouteTemplatesResponse() {
        return new BalanceRouteTemplatesResponse();
    }

    /**
     * Create an instance of {@link SequenceRouteTemplate }
     * 
     */
    public SequenceRouteTemplate createSequenceRouteTemplate() {
        return new SequenceRouteTemplate();
    }

    /**
     * Create an instance of {@link SequenceRouteTemplateResponse }
     * 
     */
    public SequenceRouteTemplateResponse createSequenceRouteTemplateResponse() {
        return new SequenceRouteTemplateResponse();
    }

    /**
     * Create an instance of {@link SequenceRouteTemplateRange }
     * 
     */
    public SequenceRouteTemplateRange createSequenceRouteTemplateRange() {
        return new SequenceRouteTemplateRange();
    }

    /**
     * Create an instance of {@link SequenceRouteTemplateRangeResponse }
     * 
     */
    public SequenceRouteTemplateRangeResponse createSequenceRouteTemplateRangeResponse() {
        return new SequenceRouteTemplateRangeResponse();
    }

    /**
     * Create an instance of {@link InsertStopTemplates }
     * 
     */
    public InsertStopTemplates createInsertStopTemplates() {
        return new InsertStopTemplates();
    }

    /**
     * Create an instance of {@link InsertStopTemplatesResponse }
     * 
     */
    public InsertStopTemplatesResponse createInsertStopTemplatesResponse() {
        return new InsertStopTemplatesResponse();
    }

    /**
     * Create an instance of {@link InsertStopTemplatesAtBestPosition }
     * 
     */
    public InsertStopTemplatesAtBestPosition createInsertStopTemplatesAtBestPosition() {
        return new InsertStopTemplatesAtBestPosition();
    }

    /**
     * Create an instance of {@link InsertStopTemplatesAtBestPositionResponse }
     * 
     */
    public InsertStopTemplatesAtBestPositionResponse createInsertStopTemplatesAtBestPositionResponse() {
        return new InsertStopTemplatesAtBestPositionResponse();
    }

    /**
     * Create an instance of {@link DeleteStopTemplates }
     * 
     */
    public DeleteStopTemplates createDeleteStopTemplates() {
        return new DeleteStopTemplates();
    }

    /**
     * Create an instance of {@link DeleteStopTemplatesResponse }
     * 
     */
    public DeleteStopTemplatesResponse createDeleteStopTemplatesResponse() {
        return new DeleteStopTemplatesResponse();
    }

    /**
     * Create an instance of {@link MoveStopTemplates }
     * 
     */
    public MoveStopTemplates createMoveStopTemplates() {
        return new MoveStopTemplates();
    }

    /**
     * Create an instance of {@link MoveStopTemplatesResponse }
     * 
     */
    public MoveStopTemplatesResponse createMoveStopTemplatesResponse() {
        return new MoveStopTemplatesResponse();
    }

    /**
     * Create an instance of {@link MoveStopTemplatesAndLocations }
     * 
     */
    public MoveStopTemplatesAndLocations createMoveStopTemplatesAndLocations() {
        return new MoveStopTemplatesAndLocations();
    }

    /**
     * Create an instance of {@link MoveStopTemplatesAndLocationsResponse }
     * 
     */
    public MoveStopTemplatesAndLocationsResponse createMoveStopTemplatesAndLocationsResponse() {
        return new MoveStopTemplatesAndLocationsResponse();
    }

    /**
     * Create an instance of {@link MoveStopTemplatesToBestPosition }
     * 
     */
    public MoveStopTemplatesToBestPosition createMoveStopTemplatesToBestPosition() {
        return new MoveStopTemplatesToBestPosition();
    }

    /**
     * Create an instance of {@link MoveStopTemplatesToBestPositionResponse }
     * 
     */
    public MoveStopTemplatesToBestPositionResponse createMoveStopTemplatesToBestPositionResponse() {
        return new MoveStopTemplatesToBestPositionResponse();
    }

    /**
     * Create an instance of {@link MoveStopTemplatesAndLocationsToBestPosition }
     * 
     */
    public MoveStopTemplatesAndLocationsToBestPosition createMoveStopTemplatesAndLocationsToBestPosition() {
        return new MoveStopTemplatesAndLocationsToBestPosition();
    }

    /**
     * Create an instance of {@link MoveStopTemplatesAndLocationsToBestPositionResponse }
     * 
     */
    public MoveStopTemplatesAndLocationsToBestPositionResponse createMoveStopTemplatesAndLocationsToBestPositionResponse() {
        return new MoveStopTemplatesAndLocationsToBestPositionResponse();
    }

    /**
     * Create an instance of {@link InsertMidRouteDepotStopTemplate }
     * 
     */
    public InsertMidRouteDepotStopTemplate createInsertMidRouteDepotStopTemplate() {
        return new InsertMidRouteDepotStopTemplate();
    }

    /**
     * Create an instance of {@link InsertMidRouteDepotStopTemplateResponse }
     * 
     */
    public InsertMidRouteDepotStopTemplateResponse createInsertMidRouteDepotStopTemplateResponse() {
        return new InsertMidRouteDepotStopTemplateResponse();
    }

    /**
     * Create an instance of {@link UpdateMidRouteDepotStopTemplate }
     * 
     */
    public UpdateMidRouteDepotStopTemplate createUpdateMidRouteDepotStopTemplate() {
        return new UpdateMidRouteDepotStopTemplate();
    }

    /**
     * Create an instance of {@link UpdateMidRouteDepotStopTemplateResponse }
     * 
     */
    public UpdateMidRouteDepotStopTemplateResponse createUpdateMidRouteDepotStopTemplateResponse() {
        return new UpdateMidRouteDepotStopTemplateResponse();
    }

    /**
     * Create an instance of {@link InsertLayoverStopTemplate }
     * 
     */
    public InsertLayoverStopTemplate createInsertLayoverStopTemplate() {
        return new InsertLayoverStopTemplate();
    }

    /**
     * Create an instance of {@link InsertLayoverStopTemplateResponse }
     * 
     */
    public InsertLayoverStopTemplateResponse createInsertLayoverStopTemplateResponse() {
        return new InsertLayoverStopTemplateResponse();
    }

    /**
     * Create an instance of {@link UpdateLayoverStopTemplate }
     * 
     */
    public UpdateLayoverStopTemplate createUpdateLayoverStopTemplate() {
        return new UpdateLayoverStopTemplate();
    }

    /**
     * Create an instance of {@link UpdateLayoverStopTemplateResponse }
     * 
     */
    public UpdateLayoverStopTemplateResponse createUpdateLayoverStopTemplateResponse() {
        return new UpdateLayoverStopTemplateResponse();
    }

    /**
     * Create an instance of {@link SuggestTemplateLayovers }
     * 
     */
    public SuggestTemplateLayovers createSuggestTemplateLayovers() {
        return new SuggestTemplateLayovers();
    }

    /**
     * Create an instance of {@link SuggestTemplateLayoversResponse }
     * 
     */
    public SuggestTemplateLayoversResponse createSuggestTemplateLayoversResponse() {
        return new SuggestTemplateLayoversResponse();
    }

    /**
     * Create an instance of {@link SuggestRouteTemplateForServiceLocation }
     * 
     */
    public SuggestRouteTemplateForServiceLocation createSuggestRouteTemplateForServiceLocation() {
        return new SuggestRouteTemplateForServiceLocation();
    }

    /**
     * Create an instance of {@link SuggestRouteTemplateForServiceLocationResponse }
     * 
     */
    public SuggestRouteTemplateForServiceLocationResponse createSuggestRouteTemplateForServiceLocationResponse() {
        return new SuggestRouteTemplateForServiceLocationResponse();
    }

    /**
     * Create an instance of {@link SaveRouteTemplateFromRoute }
     * 
     */
    public SaveRouteTemplateFromRoute createSaveRouteTemplateFromRoute() {
        return new SaveRouteTemplateFromRoute();
    }

    /**
     * Create an instance of {@link SaveRouteTemplateFromRouteResponse }
     * 
     */
    public SaveRouteTemplateFromRouteResponse createSaveRouteTemplateFromRouteResponse() {
        return new SaveRouteTemplateFromRouteResponse();
    }

    /**
     * Create an instance of {@link SendOrders }
     * 
     */
    public SendOrders createSendOrders() {
        return new SendOrders();
    }

    /**
     * Create an instance of {@link SendOrdersResponse }
     * 
     */
    public SendOrdersResponse createSendOrdersResponse() {
        return new SendOrdersResponse();
    }

    /**
     * Create an instance of {@link SuggestRouteForUnassignedOrderGroup }
     * 
     */
    public SuggestRouteForUnassignedOrderGroup createSuggestRouteForUnassignedOrderGroup() {
        return new SuggestRouteForUnassignedOrderGroup();
    }

    /**
     * Create an instance of {@link SuggestRouteForUnassignedOrderGroupResponse }
     * 
     */
    public SuggestRouteForUnassignedOrderGroupResponse createSuggestRouteForUnassignedOrderGroupResponse() {
        return new SuggestRouteForUnassignedOrderGroupResponse();
    }

    /**
     * Create an instance of {@link SuggestRouteForServiceableStop }
     * 
     */
    public SuggestRouteForServiceableStop createSuggestRouteForServiceableStop() {
        return new SuggestRouteForServiceableStop();
    }

    /**
     * Create an instance of {@link SuggestRouteForServiceableStopResponse }
     * 
     */
    public SuggestRouteForServiceableStopResponse createSuggestRouteForServiceableStopResponse() {
        return new SuggestRouteForServiceableStopResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link SetWorkerPassword }
     * 
     */
    public SetWorkerPassword createSetWorkerPassword() {
        return new SetWorkerPassword();
    }

    /**
     * Create an instance of {@link SetWorkerPasswordResponse }
     * 
     */
    public SetWorkerPasswordResponse createSetWorkerPasswordResponse() {
        return new SetWorkerPasswordResponse();
    }

    /**
     * Create an instance of {@link ApplyCustomExtensions }
     * 
     */
    public ApplyCustomExtensions createApplyCustomExtensions() {
        return new ApplyCustomExtensions();
    }

    /**
     * Create an instance of {@link ApplyCustomExtensionsResponse }
     * 
     */
    public ApplyCustomExtensionsResponse createApplyCustomExtensionsResponse() {
        return new ApplyCustomExtensionsResponse();
    }

    /**
     * Create an instance of {@link DismissJob }
     * 
     */
    public DismissJob createDismissJob() {
        return new DismissJob();
    }

    /**
     * Create an instance of {@link DismissJobResponse }
     * 
     */
    public DismissJobResponse createDismissJobResponse() {
        return new DismissJobResponse();
    }

    /**
     * Create an instance of {@link CancelJob }
     * 
     */
    public CancelJob createCancelJob() {
        return new CancelJob();
    }

    /**
     * Create an instance of {@link CancelJobResponse }
     * 
     */
    public CancelJobResponse createCancelJobResponse() {
        return new CancelJobResponse();
    }

    /**
     * Create an instance of {@link AcceptJob }
     * 
     */
    public AcceptJob createAcceptJob() {
        return new AcceptJob();
    }

    /**
     * Create an instance of {@link AcceptJobResponse }
     * 
     */
    public AcceptJobResponse createAcceptJobResponse() {
        return new AcceptJobResponse();
    }

    /**
     * Create an instance of {@link AutoCreateRoutingSession }
     * 
     */
    public AutoCreateRoutingSession createAutoCreateRoutingSession() {
        return new AutoCreateRoutingSession();
    }

    /**
     * Create an instance of {@link AutoCreateRoutingSessionResponse }
     * 
     */
    public AutoCreateRoutingSessionResponse createAutoCreateRoutingSessionResponse() {
        return new AutoCreateRoutingSessionResponse();
    }

    /**
     * Create an instance of {@link AutoCreateRoutingSessionAdvanced }
     * 
     */
    public AutoCreateRoutingSessionAdvanced createAutoCreateRoutingSessionAdvanced() {
        return new AutoCreateRoutingSessionAdvanced();
    }

    /**
     * Create an instance of {@link AutoCreateRoutingSessionAdvancedResponse }
     * 
     */
    public AutoCreateRoutingSessionAdvancedResponse createAutoCreateRoutingSessionAdvancedResponse() {
        return new AutoCreateRoutingSessionAdvancedResponse();
    }

    /**
     * Create an instance of {@link UpdatePassTemplate }
     * 
     */
    public UpdatePassTemplate createUpdatePassTemplate() {
        return new UpdatePassTemplate();
    }

    /**
     * Create an instance of {@link UpdatePassTemplateResponse }
     * 
     */
    public UpdatePassTemplateResponse createUpdatePassTemplateResponse() {
        return new UpdatePassTemplateResponse();
    }

    /**
     * Create an instance of {@link UpdateActivePass }
     * 
     */
    public UpdateActivePass createUpdateActivePass() {
        return new UpdateActivePass();
    }

    /**
     * Create an instance of {@link UpdateActivePassResponse }
     * 
     */
    public UpdateActivePassResponse createUpdateActivePassResponse() {
        return new UpdateActivePassResponse();
    }

    /**
     * Create an instance of {@link UpdateActivePasses }
     * 
     */
    public UpdateActivePasses createUpdateActivePasses() {
        return new UpdateActivePasses();
    }

    /**
     * Create an instance of {@link UpdateActivePassesResponse }
     * 
     */
    public UpdateActivePassesResponse createUpdateActivePassesResponse() {
        return new UpdateActivePassesResponse();
    }

    /**
     * Create an instance of {@link RouteUnassignedOrders }
     * 
     */
    public RouteUnassignedOrders createRouteUnassignedOrders() {
        return new RouteUnassignedOrders();
    }

    /**
     * Create an instance of {@link RouteUnassignedOrdersResponse }
     * 
     */
    public RouteUnassignedOrdersResponse createRouteUnassignedOrdersResponse() {
        return new RouteUnassignedOrdersResponse();
    }

    /**
     * Create an instance of {@link RouteUnassignedOrderGroups }
     * 
     */
    public RouteUnassignedOrderGroups createRouteUnassignedOrderGroups() {
        return new RouteUnassignedOrderGroups();
    }

    /**
     * Create an instance of {@link RouteUnassignedOrderGroupsResponse }
     * 
     */
    public RouteUnassignedOrderGroupsResponse createRouteUnassignedOrderGroupsResponse() {
        return new RouteUnassignedOrderGroupsResponse();
    }

    /**
     * Create an instance of {@link FindAndRouteUnassignedOrders }
     * 
     */
    public FindAndRouteUnassignedOrders createFindAndRouteUnassignedOrders() {
        return new FindAndRouteUnassignedOrders();
    }

    /**
     * Create an instance of {@link FindAndRouteUnassignedOrdersResponse }
     * 
     */
    public FindAndRouteUnassignedOrdersResponse createFindAndRouteUnassignedOrdersResponse() {
        return new FindAndRouteUnassignedOrdersResponse();
    }

    /**
     * Create an instance of {@link GenerateRouteTravelPath }
     * 
     */
    public GenerateRouteTravelPath createGenerateRouteTravelPath() {
        return new GenerateRouteTravelPath();
    }

    /**
     * Create an instance of {@link GenerateRouteTravelPathResponse }
     * 
     */
    public GenerateRouteTravelPathResponse createGenerateRouteTravelPathResponse() {
        return new GenerateRouteTravelPathResponse();
    }

    /**
     * Create an instance of {@link GenerateRoutePath }
     * 
     */
    public GenerateRoutePath createGenerateRoutePath() {
        return new GenerateRoutePath();
    }

    /**
     * Create an instance of {@link GenerateRoutePathResponse }
     * 
     */
    public GenerateRoutePathResponse createGenerateRoutePathResponse() {
        return new GenerateRoutePathResponse();
    }

    /**
     * Create an instance of {@link GenerateRouteTemplateTravelPath }
     * 
     */
    public GenerateRouteTemplateTravelPath createGenerateRouteTemplateTravelPath() {
        return new GenerateRouteTemplateTravelPath();
    }

    /**
     * Create an instance of {@link GenerateRouteTemplateTravelPathResponse }
     * 
     */
    public GenerateRouteTemplateTravelPathResponse createGenerateRouteTemplateTravelPathResponse() {
        return new GenerateRouteTemplateTravelPathResponse();
    }

    /**
     * Create an instance of {@link ConfigureAdvancedLogging }
     * 
     */
    public ConfigureAdvancedLogging createConfigureAdvancedLogging() {
        return new ConfigureAdvancedLogging();
    }

    /**
     * Create an instance of {@link ConfigureAdvancedLoggingResponse }
     * 
     */
    public ConfigureAdvancedLoggingResponse createConfigureAdvancedLoggingResponse() {
        return new ConfigureAdvancedLoggingResponse();
    }

    /**
     * Create an instance of {@link UpdateServiceTime }
     * 
     */
    public UpdateServiceTime createUpdateServiceTime() {
        return new UpdateServiceTime();
    }

    /**
     * Create an instance of {@link UpdateServiceTimeResponse }
     * 
     */
    public UpdateServiceTimeResponse createUpdateServiceTimeResponse() {
        return new UpdateServiceTimeResponse();
    }

    /**
     * Create an instance of {@link ReportClientStatistics }
     * 
     */
    public ReportClientStatistics createReportClientStatistics() {
        return new ReportClientStatistics();
    }

    /**
     * Create an instance of {@link ReportClientStatisticsResponse }
     * 
     */
    public ReportClientStatisticsResponse createReportClientStatisticsResponse() {
        return new ReportClientStatisticsResponse();
    }

    /**
     * Create an instance of {@link CreateRoutes }
     * 
     */
    public CreateRoutes createCreateRoutes() {
        return new CreateRoutes();
    }

    /**
     * Create an instance of {@link CreateRoutesResponse }
     * 
     */
    public CreateRoutesResponse createCreateRoutesResponse() {
        return new CreateRoutesResponse();
    }

    /**
     * Create an instance of {@link CreateStaticRoutesFromTemplateSetWithSessionKey }
     * 
     */
    public CreateStaticRoutesFromTemplateSetWithSessionKey createCreateStaticRoutesFromTemplateSetWithSessionKey() {
        return new CreateStaticRoutesFromTemplateSetWithSessionKey();
    }

    /**
     * Create an instance of {@link CreateStaticRoutesFromTemplateSetWithSessionKeyResponse }
     * 
     */
    public CreateStaticRoutesFromTemplateSetWithSessionKeyResponse createCreateStaticRoutesFromTemplateSetWithSessionKeyResponse() {
        return new CreateStaticRoutesFromTemplateSetWithSessionKeyResponse();
    }

    /**
     * Create an instance of {@link CreateStaticRoutesFromTemplateSetWithSessionDate }
     * 
     */
    public CreateStaticRoutesFromTemplateSetWithSessionDate createCreateStaticRoutesFromTemplateSetWithSessionDate() {
        return new CreateStaticRoutesFromTemplateSetWithSessionDate();
    }

    /**
     * Create an instance of {@link CreateStaticRoutesFromTemplateSetWithSessionDateResponse }
     * 
     */
    public CreateStaticRoutesFromTemplateSetWithSessionDateResponse createCreateStaticRoutesFromTemplateSetWithSessionDateResponse() {
        return new CreateStaticRoutesFromTemplateSetWithSessionDateResponse();
    }

    /**
     * Create an instance of {@link ShutdownEquipment }
     * 
     */
    public ShutdownEquipment createShutdownEquipment() {
        return new ShutdownEquipment();
    }

    /**
     * Create an instance of {@link ShutdownEquipmentResponse }
     * 
     */
    public ShutdownEquipmentResponse createShutdownEquipmentResponse() {
        return new ShutdownEquipmentResponse();
    }

    /**
     * Create an instance of {@link ReEnableEquipment }
     * 
     */
    public ReEnableEquipment createReEnableEquipment() {
        return new ReEnableEquipment();
    }

    /**
     * Create an instance of {@link ReEnableEquipmentResponse }
     * 
     */
    public ReEnableEquipmentResponse createReEnableEquipmentResponse() {
        return new ReEnableEquipmentResponse();
    }

    /**
     * Create an instance of {@link ClearEquipmentPanicButton }
     * 
     */
    public ClearEquipmentPanicButton createClearEquipmentPanicButton() {
        return new ClearEquipmentPanicButton();
    }

    /**
     * Create an instance of {@link ClearEquipmentPanicButtonResponse }
     * 
     */
    public ClearEquipmentPanicButtonResponse createClearEquipmentPanicButtonResponse() {
        return new ClearEquipmentPanicButtonResponse();
    }

    /**
     * Create an instance of {@link UploadDiagnosticsInformation }
     * 
     */
    public UploadDiagnosticsInformation createUploadDiagnosticsInformation() {
        return new UploadDiagnosticsInformation();
    }

    /**
     * Create an instance of {@link UploadDiagnosticsInformationResponse }
     * 
     */
    public UploadDiagnosticsInformationResponse createUploadDiagnosticsInformationResponse() {
        return new UploadDiagnosticsInformationResponse();
    }

    /**
     * Create an instance of {@link RetrieveClientLogList }
     * 
     */
    public RetrieveClientLogList createRetrieveClientLogList() {
        return new RetrieveClientLogList();
    }

    /**
     * Create an instance of {@link RetrieveClientLogListResponse }
     * 
     */
    public RetrieveClientLogListResponse createRetrieveClientLogListResponse() {
        return new RetrieveClientLogListResponse();
    }

    /**
     * Create an instance of {@link GetMergedClientLogFile }
     * 
     */
    public GetMergedClientLogFile createGetMergedClientLogFile() {
        return new GetMergedClientLogFile();
    }

    /**
     * Create an instance of {@link GetMergedClientLogFileResponse }
     * 
     */
    public GetMergedClientLogFileResponse createGetMergedClientLogFileResponse() {
        return new GetMergedClientLogFileResponse();
    }

    /**
     * Create an instance of {@link RetrieveClientApplicationVersion }
     * 
     */
    public RetrieveClientApplicationVersion createRetrieveClientApplicationVersion() {
        return new RetrieveClientApplicationVersion();
    }

    /**
     * Create an instance of {@link RetrieveClientApplicationVersionResponse }
     * 
     */
    public RetrieveClientApplicationVersionResponse createRetrieveClientApplicationVersionResponse() {
        return new RetrieveClientApplicationVersionResponse();
    }

    /**
     * Create an instance of {@link RetrieveClientApplicationVersions }
     * 
     */
    public RetrieveClientApplicationVersions createRetrieveClientApplicationVersions() {
        return new RetrieveClientApplicationVersions();
    }

    /**
     * Create an instance of {@link RetrieveClientApplicationVersionsResponse }
     * 
     */
    public RetrieveClientApplicationVersionsResponse createRetrieveClientApplicationVersionsResponse() {
        return new RetrieveClientApplicationVersionsResponse();
    }

    /**
     * Create an instance of {@link RetrieveGeneralReleaseClientApplicationVersion }
     * 
     */
    public RetrieveGeneralReleaseClientApplicationVersion createRetrieveGeneralReleaseClientApplicationVersion() {
        return new RetrieveGeneralReleaseClientApplicationVersion();
    }

    /**
     * Create an instance of {@link RetrieveGeneralReleaseClientApplicationVersionResponse }
     * 
     */
    public RetrieveGeneralReleaseClientApplicationVersionResponse createRetrieveGeneralReleaseClientApplicationVersionResponse() {
        return new RetrieveGeneralReleaseClientApplicationVersionResponse();
    }

    /**
     * Create an instance of {@link RetrieveAdmin }
     * 
     */
    public RetrieveAdmin createRetrieveAdmin() {
        return new RetrieveAdmin();
    }

    /**
     * Create an instance of {@link RetrieveAdminResponse }
     * 
     */
    public RetrieveAdminResponse createRetrieveAdminResponse() {
        return new RetrieveAdminResponse();
    }

    /**
     * Create an instance of {@link RetrieveQueuedMatrixBuildRequestMessages }
     * 
     */
    public RetrieveQueuedMatrixBuildRequestMessages createRetrieveQueuedMatrixBuildRequestMessages() {
        return new RetrieveQueuedMatrixBuildRequestMessages();
    }

    /**
     * Create an instance of {@link RetrieveQueuedMatrixBuildRequestMessagesResponse }
     * 
     */
    public RetrieveQueuedMatrixBuildRequestMessagesResponse createRetrieveQueuedMatrixBuildRequestMessagesResponse() {
        return new RetrieveQueuedMatrixBuildRequestMessagesResponse();
    }

    /**
     * Create an instance of {@link RetrieveQueuedMatrixBuildRequestResults }
     * 
     */
    public RetrieveQueuedMatrixBuildRequestResults createRetrieveQueuedMatrixBuildRequestResults() {
        return new RetrieveQueuedMatrixBuildRequestResults();
    }

    /**
     * Create an instance of {@link RetrieveQueuedMatrixBuildRequestResultsResponse }
     * 
     */
    public RetrieveQueuedMatrixBuildRequestResultsResponse createRetrieveQueuedMatrixBuildRequestResultsResponse() {
        return new RetrieveQueuedMatrixBuildRequestResultsResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerRegionMatrixStatistics }
     * 
     */
    public RetrieveCustomerRegionMatrixStatistics createRetrieveCustomerRegionMatrixStatistics() {
        return new RetrieveCustomerRegionMatrixStatistics();
    }

    /**
     * Create an instance of {@link RetrieveCustomerRegionMatrixStatisticsResponse }
     * 
     */
    public RetrieveCustomerRegionMatrixStatisticsResponse createRetrieveCustomerRegionMatrixStatisticsResponse() {
        return new RetrieveCustomerRegionMatrixStatisticsResponse();
    }

    /**
     * Create an instance of {@link MultiRetrieveAdmin }
     * 
     */
    public MultiRetrieveAdmin createMultiRetrieveAdmin() {
        return new MultiRetrieveAdmin();
    }

    /**
     * Create an instance of {@link MultiRetrieveAdminResponse }
     * 
     */
    public MultiRetrieveAdminResponse createMultiRetrieveAdminResponse() {
        return new MultiRetrieveAdminResponse();
    }

    /**
     * Create an instance of {@link RetrieveMatrixResults }
     * 
     */
    public RetrieveMatrixResults createRetrieveMatrixResults() {
        return new RetrieveMatrixResults();
    }

    /**
     * Create an instance of {@link RetrieveMatrixResultsResponse }
     * 
     */
    public RetrieveMatrixResultsResponse createRetrieveMatrixResultsResponse() {
        return new RetrieveMatrixResultsResponse();
    }

    /**
     * Create an instance of {@link RetrieveCurrentlyBuildingMatrixBuildResultsFile }
     * 
     */
    public RetrieveCurrentlyBuildingMatrixBuildResultsFile createRetrieveCurrentlyBuildingMatrixBuildResultsFile() {
        return new RetrieveCurrentlyBuildingMatrixBuildResultsFile();
    }

    /**
     * Create an instance of {@link RetrieveCurrentlyBuildingMatrixBuildResultsFileResponse }
     * 
     */
    public RetrieveCurrentlyBuildingMatrixBuildResultsFileResponse createRetrieveCurrentlyBuildingMatrixBuildResultsFileResponse() {
        return new RetrieveCurrentlyBuildingMatrixBuildResultsFileResponse();
    }

    /**
     * Create an instance of {@link RetrieveMatrixBuildResultsFile }
     * 
     */
    public RetrieveMatrixBuildResultsFile createRetrieveMatrixBuildResultsFile() {
        return new RetrieveMatrixBuildResultsFile();
    }

    /**
     * Create an instance of {@link RetrieveMatrixBuildResultsFileResponse }
     * 
     */
    public RetrieveMatrixBuildResultsFileResponse createRetrieveMatrixBuildResultsFileResponse() {
        return new RetrieveMatrixBuildResultsFileResponse();
    }

    /**
     * Create an instance of {@link RetrieveAdminReports }
     * 
     */
    public RetrieveAdminReports createRetrieveAdminReports() {
        return new RetrieveAdminReports();
    }

    /**
     * Create an instance of {@link RetrieveAdminReportsResponse }
     * 
     */
    public RetrieveAdminReportsResponse createRetrieveAdminReportsResponse() {
        return new RetrieveAdminReportsResponse();
    }

    /**
     * Create an instance of {@link SaveAdmin }
     * 
     */
    public SaveAdmin createSaveAdmin() {
        return new SaveAdmin();
    }

    /**
     * Create an instance of {@link SaveAdminResponse }
     * 
     */
    public SaveAdminResponse createSaveAdminResponse() {
        return new SaveAdminResponse();
    }

    /**
     * Create an instance of {@link AttachCustomer }
     * 
     */
    public AttachCustomer createAttachCustomer() {
        return new AttachCustomer();
    }

    /**
     * Create an instance of {@link AttachCustomerResponse }
     * 
     */
    public AttachCustomerResponse createAttachCustomerResponse() {
        return new AttachCustomerResponse();
    }

    /**
     * Create an instance of {@link UpdateCustomerRegions }
     * 
     */
    public UpdateCustomerRegions createUpdateCustomerRegions() {
        return new UpdateCustomerRegions();
    }

    /**
     * Create an instance of {@link UpdateCustomerRegionsResponse }
     * 
     */
    public UpdateCustomerRegionsResponse createUpdateCustomerRegionsResponse() {
        return new UpdateCustomerRegionsResponse();
    }

    /**
     * Create an instance of {@link SendNewUserEmail }
     * 
     */
    public SendNewUserEmail createSendNewUserEmail() {
        return new SendNewUserEmail();
    }

    /**
     * Create an instance of {@link SendNewUserEmailResponse }
     * 
     */
    public SendNewUserEmailResponse createSendNewUserEmailResponse() {
        return new SendNewUserEmailResponse();
    }

    /**
     * Create an instance of {@link ToggleMatrixBuildEnabledForCustomerRegions }
     * 
     */
    public ToggleMatrixBuildEnabledForCustomerRegions createToggleMatrixBuildEnabledForCustomerRegions() {
        return new ToggleMatrixBuildEnabledForCustomerRegions();
    }

    /**
     * Create an instance of {@link ToggleMatrixBuildEnabledForCustomerRegionsResponse }
     * 
     */
    public ToggleMatrixBuildEnabledForCustomerRegionsResponse createToggleMatrixBuildEnabledForCustomerRegionsResponse() {
        return new ToggleMatrixBuildEnabledForCustomerRegionsResponse();
    }

    /**
     * Create an instance of {@link ShadowProduction }
     * 
     */
    public ShadowProduction createShadowProduction() {
        return new ShadowProduction();
    }

    /**
     * Create an instance of {@link ShadowProductionResponse }
     * 
     */
    public ShadowProductionResponse createShadowProductionResponse() {
        return new ShadowProductionResponse();
    }

    /**
     * Create an instance of {@link CreateCustomer }
     * 
     */
    public CreateCustomer createCreateCustomer() {
        return new CreateCustomer();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link FindCustomerUsageData }
     * 
     */
    public FindCustomerUsageData createFindCustomerUsageData() {
        return new FindCustomerUsageData();
    }

    /**
     * Create an instance of {@link FindCustomerUsageDataResponse }
     * 
     */
    public FindCustomerUsageDataResponse createFindCustomerUsageDataResponse() {
        return new FindCustomerUsageDataResponse();
    }

    /**
     * Create an instance of {@link CreateDatabase }
     * 
     */
    public CreateDatabase createCreateDatabase() {
        return new CreateDatabase();
    }

    /**
     * Create an instance of {@link CreateDatabaseResponse }
     * 
     */
    public CreateDatabaseResponse createCreateDatabaseResponse() {
        return new CreateDatabaseResponse();
    }

    /**
     * Create an instance of {@link InitializeDataWarehouse }
     * 
     */
    public InitializeDataWarehouse createInitializeDataWarehouse() {
        return new InitializeDataWarehouse();
    }

    /**
     * Create an instance of {@link InitializeDataWarehouseResponse }
     * 
     */
    public InitializeDataWarehouseResponse createInitializeDataWarehouseResponse() {
        return new InitializeDataWarehouseResponse();
    }

    /**
     * Create an instance of {@link RetrieveDataWarehouseIntegrationStatus }
     * 
     */
    public RetrieveDataWarehouseIntegrationStatus createRetrieveDataWarehouseIntegrationStatus() {
        return new RetrieveDataWarehouseIntegrationStatus();
    }

    /**
     * Create an instance of {@link RetrieveDataWarehouseIntegrationStatusResponse }
     * 
     */
    public RetrieveDataWarehouseIntegrationStatusResponse createRetrieveDataWarehouseIntegrationStatusResponse() {
        return new RetrieveDataWarehouseIntegrationStatusResponse();
    }

    /**
     * Create an instance of {@link ResetDataWarehouseIntegrationStatus }
     * 
     */
    public ResetDataWarehouseIntegrationStatus createResetDataWarehouseIntegrationStatus() {
        return new ResetDataWarehouseIntegrationStatus();
    }

    /**
     * Create an instance of {@link ResetDataWarehouseIntegrationStatusResponse }
     * 
     */
    public ResetDataWarehouseIntegrationStatusResponse createResetDataWarehouseIntegrationStatusResponse() {
        return new ResetDataWarehouseIntegrationStatusResponse();
    }

    /**
     * Create an instance of {@link UpdateConvertedCustomer }
     * 
     */
    public UpdateConvertedCustomer createUpdateConvertedCustomer() {
        return new UpdateConvertedCustomer();
    }

    /**
     * Create an instance of {@link UpdateConvertedCustomerResponse }
     * 
     */
    public UpdateConvertedCustomerResponse createUpdateConvertedCustomerResponse() {
        return new UpdateConvertedCustomerResponse();
    }

    /**
     * Create an instance of {@link SwitchDataWarehouseMappingMode }
     * 
     */
    public SwitchDataWarehouseMappingMode createSwitchDataWarehouseMappingMode() {
        return new SwitchDataWarehouseMappingMode();
    }

    /**
     * Create an instance of {@link SwitchDataWarehouseMappingModeResponse }
     * 
     */
    public SwitchDataWarehouseMappingModeResponse createSwitchDataWarehouseMappingModeResponse() {
        return new SwitchDataWarehouseMappingModeResponse();
    }

    /**
     * Create an instance of {@link TestCustomerXrsSettings }
     * 
     */
    public TestCustomerXrsSettings createTestCustomerXrsSettings() {
        return new TestCustomerXrsSettings();
    }

    /**
     * Create an instance of {@link TestCustomerXrsSettingsResponse }
     * 
     */
    public TestCustomerXrsSettingsResponse createTestCustomerXrsSettingsResponse() {
        return new TestCustomerXrsSettingsResponse();
    }

    /**
     * Create an instance of {@link UploadCustomReport }
     * 
     */
    public UploadCustomReport createUploadCustomReport() {
        return new UploadCustomReport();
    }

    /**
     * Create an instance of {@link UploadCustomReportResponse }
     * 
     */
    public UploadCustomReportResponse createUploadCustomReportResponse() {
        return new UploadCustomReportResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomReports }
     * 
     */
    public RetrieveCustomReports createRetrieveCustomReports() {
        return new RetrieveCustomReports();
    }

    /**
     * Create an instance of {@link RetrieveCustomReportsResponse }
     * 
     */
    public RetrieveCustomReportsResponse createRetrieveCustomReportsResponse() {
        return new RetrieveCustomReportsResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomReport }
     * 
     */
    public RetrieveCustomReport createRetrieveCustomReport() {
        return new RetrieveCustomReport();
    }

    /**
     * Create an instance of {@link RetrieveCustomReportResponse }
     * 
     */
    public RetrieveCustomReportResponse createRetrieveCustomReportResponse() {
        return new RetrieveCustomReportResponse();
    }

    /**
     * Create an instance of {@link ImportOBD2DiagnosticsTroubleCodes }
     * 
     */
    public ImportOBD2DiagnosticsTroubleCodes createImportOBD2DiagnosticsTroubleCodes() {
        return new ImportOBD2DiagnosticsTroubleCodes();
    }

    /**
     * Create an instance of {@link ImportOBD2DiagnosticsTroubleCodesResponse }
     * 
     */
    public ImportOBD2DiagnosticsTroubleCodesResponse createImportOBD2DiagnosticsTroubleCodesResponse() {
        return new ImportOBD2DiagnosticsTroubleCodesResponse();
    }

    /**
     * Create an instance of {@link GenerateRdcMigrationExcelWorkbook }
     * 
     */
    public GenerateRdcMigrationExcelWorkbook createGenerateRdcMigrationExcelWorkbook() {
        return new GenerateRdcMigrationExcelWorkbook();
    }

    /**
     * Create an instance of {@link GenerateRdcMigrationExcelWorkbookResponse }
     * 
     */
    public GenerateRdcMigrationExcelWorkbookResponse createGenerateRdcMigrationExcelWorkbookResponse() {
        return new GenerateRdcMigrationExcelWorkbookResponse();
    }

    /**
     * Create an instance of {@link StartRdcMigration }
     * 
     */
    public StartRdcMigration createStartRdcMigration() {
        return new StartRdcMigration();
    }

    /**
     * Create an instance of {@link StartRdcMigrationResponse }
     * 
     */
    public StartRdcMigrationResponse createStartRdcMigrationResponse() {
        return new StartRdcMigrationResponse();
    }

    /**
     * Create an instance of {@link CreateXrsMigrationWorkbook }
     * 
     */
    public CreateXrsMigrationWorkbook createCreateXrsMigrationWorkbook() {
        return new CreateXrsMigrationWorkbook();
    }

    /**
     * Create an instance of {@link CreateXrsMigrationWorkbookResponse }
     * 
     */
    public CreateXrsMigrationWorkbookResponse createCreateXrsMigrationWorkbookResponse() {
        return new CreateXrsMigrationWorkbookResponse();
    }

    /**
     * Create an instance of {@link ProcessXrsMigrationWorkbook }
     * 
     */
    public ProcessXrsMigrationWorkbook createProcessXrsMigrationWorkbook() {
        return new ProcessXrsMigrationWorkbook();
    }

    /**
     * Create an instance of {@link ProcessXrsMigrationWorkbookResponse }
     * 
     */
    public ProcessXrsMigrationWorkbookResponse createProcessXrsMigrationWorkbookResponse() {
        return new ProcessXrsMigrationWorkbookResponse();
    }

    /**
     * Create an instance of {@link LookupMobileDevices }
     * 
     */
    public LookupMobileDevices createLookupMobileDevices() {
        return new LookupMobileDevices();
    }

    /**
     * Create an instance of {@link LookupMobileDevicesResponse }
     * 
     */
    public LookupMobileDevicesResponse createLookupMobileDevicesResponse() {
        return new LookupMobileDevicesResponse();
    }

    /**
     * Create an instance of {@link CreateTopLevelComplianceRegion }
     * 
     */
    public CreateTopLevelComplianceRegion createCreateTopLevelComplianceRegion() {
        return new CreateTopLevelComplianceRegion();
    }

    /**
     * Create an instance of {@link CreateTopLevelComplianceRegionResponse }
     * 
     */
    public CreateTopLevelComplianceRegionResponse createCreateTopLevelComplianceRegionResponse() {
        return new CreateTopLevelComplianceRegionResponse();
    }

    /**
     * Create an instance of {@link CreateTopLevelComplianceRegion2 }
     * 
     */
    public CreateTopLevelComplianceRegion2 createCreateTopLevelComplianceRegion2() {
        return new CreateTopLevelComplianceRegion2();
    }

    /**
     * Create an instance of {@link CreateTopLevelComplianceRegion2Response }
     * 
     */
    public CreateTopLevelComplianceRegion2Response createCreateTopLevelComplianceRegion2Response() {
        return new CreateTopLevelComplianceRegion2Response();
    }

    /**
     * Create an instance of {@link RetrieveCustomersWithXrsServiceUrl }
     * 
     */
    public RetrieveCustomersWithXrsServiceUrl createRetrieveCustomersWithXrsServiceUrl() {
        return new RetrieveCustomersWithXrsServiceUrl();
    }

    /**
     * Create an instance of {@link RetrieveCustomersWithXrsServiceUrlResponse }
     * 
     */
    public RetrieveCustomersWithXrsServiceUrlResponse createRetrieveCustomersWithXrsServiceUrlResponse() {
        return new RetrieveCustomersWithXrsServiceUrlResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerLoggingSettings }
     * 
     */
    public RetrieveCustomerLoggingSettings createRetrieveCustomerLoggingSettings() {
        return new RetrieveCustomerLoggingSettings();
    }

    /**
     * Create an instance of {@link RetrieveCustomerLoggingSettingsResponse }
     * 
     */
    public RetrieveCustomerLoggingSettingsResponse createRetrieveCustomerLoggingSettingsResponse() {
        return new RetrieveCustomerLoggingSettingsResponse();
    }

    /**
     * Create an instance of {@link ApplyEdit }
     * 
     */
    public ApplyEdit createApplyEdit() {
        return new ApplyEdit();
    }

    /**
     * Create an instance of {@link ApplyEditResponse }
     * 
     */
    public ApplyEditResponse createApplyEditResponse() {
        return new ApplyEditResponse();
    }

    /**
     * Create an instance of {@link RetrieveEditOperations }
     * 
     */
    public RetrieveEditOperations createRetrieveEditOperations() {
        return new RetrieveEditOperations();
    }

    /**
     * Create an instance of {@link RetrieveEditOperationsResponse }
     * 
     */
    public RetrieveEditOperationsResponse createRetrieveEditOperationsResponse() {
        return new RetrieveEditOperationsResponse();
    }

    /**
     * Create an instance of {@link ProcessCommunityEditRequest }
     * 
     */
    public ProcessCommunityEditRequest createProcessCommunityEditRequest() {
        return new ProcessCommunityEditRequest();
    }

    /**
     * Create an instance of {@link ProcessCommunityEditRequestResponse }
     * 
     */
    public ProcessCommunityEditRequestResponse createProcessCommunityEditRequestResponse() {
        return new ProcessCommunityEditRequestResponse();
    }

    /**
     * Create an instance of {@link RetrieveMapInfo }
     * 
     */
    public RetrieveMapInfo createRetrieveMapInfo() {
        return new RetrieveMapInfo();
    }

    /**
     * Create an instance of {@link RetrieveMapInfoResponse }
     * 
     */
    public RetrieveMapInfoResponse createRetrieveMapInfoResponse() {
        return new RetrieveMapInfoResponse();
    }

    /**
     * Create an instance of {@link RetrieveDeltaMapEdits }
     * 
     */
    public RetrieveDeltaMapEdits createRetrieveDeltaMapEdits() {
        return new RetrieveDeltaMapEdits();
    }

    /**
     * Create an instance of {@link RetrieveDeltaMapEditsResponse }
     * 
     */
    public RetrieveDeltaMapEditsResponse createRetrieveDeltaMapEditsResponse() {
        return new RetrieveDeltaMapEditsResponse();
    }

    /**
     * Create an instance of {@link RetrieveFullMapEdits }
     * 
     */
    public RetrieveFullMapEdits createRetrieveFullMapEdits() {
        return new RetrieveFullMapEdits();
    }

    /**
     * Create an instance of {@link RetrieveFullMapEditsResponse }
     * 
     */
    public RetrieveFullMapEditsResponse createRetrieveFullMapEditsResponse() {
        return new RetrieveFullMapEditsResponse();
    }

    /**
     * Create an instance of {@link RetrieveNodesDetail }
     * 
     */
    public RetrieveNodesDetail createRetrieveNodesDetail() {
        return new RetrieveNodesDetail();
    }

    /**
     * Create an instance of {@link RetrieveNodesDetailResponse }
     * 
     */
    public RetrieveNodesDetailResponse createRetrieveNodesDetailResponse() {
        return new RetrieveNodesDetailResponse();
    }

    /**
     * Create an instance of {@link UpdateArcs }
     * 
     */
    public UpdateArcs createUpdateArcs() {
        return new UpdateArcs();
    }

    /**
     * Create an instance of {@link UpdateArcsResponse }
     * 
     */
    public UpdateArcsResponse createUpdateArcsResponse() {
        return new UpdateArcsResponse();
    }

    /**
     * Create an instance of {@link UpdateNode }
     * 
     */
    public UpdateNode createUpdateNode() {
        return new UpdateNode();
    }

    /**
     * Create an instance of {@link UpdateNodeResponse }
     * 
     */
    public UpdateNodeResponse createUpdateNodeResponse() {
        return new UpdateNodeResponse();
    }

    /**
     * Create an instance of {@link UpdateImpasse }
     * 
     */
    public UpdateImpasse createUpdateImpasse() {
        return new UpdateImpasse();
    }

    /**
     * Create an instance of {@link UpdateImpasseResponse }
     * 
     */
    public UpdateImpasseResponse createUpdateImpasseResponse() {
        return new UpdateImpasseResponse();
    }

    /**
     * Create an instance of {@link RetrieveMapDataRegionInfo }
     * 
     */
    public RetrieveMapDataRegionInfo createRetrieveMapDataRegionInfo() {
        return new RetrieveMapDataRegionInfo();
    }

    /**
     * Create an instance of {@link RetrieveMapDataRegionInfoResponse }
     * 
     */
    public RetrieveMapDataRegionInfoResponse createRetrieveMapDataRegionInfoResponse() {
        return new RetrieveMapDataRegionInfoResponse();
    }

    /**
     * Create an instance of {@link RetrieveArcs }
     * 
     */
    public RetrieveArcs createRetrieveArcs() {
        return new RetrieveArcs();
    }

    /**
     * Create an instance of {@link RetrieveArcsResponse }
     * 
     */
    public RetrieveArcsResponse createRetrieveArcsResponse() {
        return new RetrieveArcsResponse();
    }

    /**
     * Create an instance of {@link PopulateArcs }
     * 
     */
    public PopulateArcs createPopulateArcs() {
        return new PopulateArcs();
    }

    /**
     * Create an instance of {@link PopulateArcsResponse }
     * 
     */
    public PopulateArcsResponse createPopulateArcsResponse() {
        return new PopulateArcsResponse();
    }

    /**
     * Create an instance of {@link RetrieveMapChangedAreas }
     * 
     */
    public RetrieveMapChangedAreas createRetrieveMapChangedAreas() {
        return new RetrieveMapChangedAreas();
    }

    /**
     * Create an instance of {@link RetrieveMapChangedAreasResponse }
     * 
     */
    public RetrieveMapChangedAreasResponse createRetrieveMapChangedAreasResponse() {
        return new RetrieveMapChangedAreasResponse();
    }

    /**
     * Create an instance of {@link RetrieveNodes }
     * 
     */
    public RetrieveNodes createRetrieveNodes() {
        return new RetrieveNodes();
    }

    /**
     * Create an instance of {@link RetrieveNodesResponse }
     * 
     */
    public RetrieveNodesResponse createRetrieveNodesResponse() {
        return new RetrieveNodesResponse();
    }

    /**
     * Create an instance of {@link ApplyArcUpdates }
     * 
     */
    public ApplyArcUpdates createApplyArcUpdates() {
        return new ApplyArcUpdates();
    }

    /**
     * Create an instance of {@link ApplyArcUpdatesResponse }
     * 
     */
    public ApplyArcUpdatesResponse createApplyArcUpdatesResponse() {
        return new ApplyArcUpdatesResponse();
    }

    /**
     * Create an instance of {@link Geocode }
     * 
     */
    public Geocode createGeocode() {
        return new Geocode();
    }

    /**
     * Create an instance of {@link GeocodeResponse }
     * 
     */
    public GeocodeResponse createGeocodeResponse() {
        return new GeocodeResponse();
    }

    /**
     * Create an instance of {@link StartGeocodeJob }
     * 
     */
    public StartGeocodeJob createStartGeocodeJob() {
        return new StartGeocodeJob();
    }

    /**
     * Create an instance of {@link StartGeocodeJobResponse }
     * 
     */
    public StartGeocodeJobResponse createStartGeocodeJobResponse() {
        return new StartGeocodeJobResponse();
    }

    /**
     * Create an instance of {@link StartGeocodeLocationsJob }
     * 
     */
    public StartGeocodeLocationsJob createStartGeocodeLocationsJob() {
        return new StartGeocodeLocationsJob();
    }

    /**
     * Create an instance of {@link StartGeocodeLocationsJobResponse }
     * 
     */
    public StartGeocodeLocationsJobResponse createStartGeocodeLocationsJobResponse() {
        return new StartGeocodeLocationsJobResponse();
    }

    /**
     * Create an instance of {@link RetrieveGeocodeCandidates }
     * 
     */
    public RetrieveGeocodeCandidates createRetrieveGeocodeCandidates() {
        return new RetrieveGeocodeCandidates();
    }

    /**
     * Create an instance of {@link RetrieveGeocodeCandidatesResponse }
     * 
     */
    public RetrieveGeocodeCandidatesResponse createRetrieveGeocodeCandidatesResponse() {
        return new RetrieveGeocodeCandidatesResponse();
    }

    /**
     * Create an instance of {@link GenerateTravelPath }
     * 
     */
    public GenerateTravelPath createGenerateTravelPath() {
        return new GenerateTravelPath();
    }

    /**
     * Create an instance of {@link GenerateTravelPathResponse }
     * 
     */
    public GenerateTravelPathResponse createGenerateTravelPathResponse() {
        return new GenerateTravelPathResponse();
    }

    /**
     * Create an instance of {@link RetrieveRouteShields }
     * 
     */
    public RetrieveRouteShields createRetrieveRouteShields() {
        return new RetrieveRouteShields();
    }

    /**
     * Create an instance of {@link RetrieveRouteShieldsResponse }
     * 
     */
    public RetrieveRouteShieldsResponse createRetrieveRouteShieldsResponse() {
        return new RetrieveRouteShieldsResponse();
    }

    /**
     * Create an instance of {@link RetrievePositionText }
     * 
     */
    public RetrievePositionText createRetrievePositionText() {
        return new RetrievePositionText();
    }

    /**
     * Create an instance of {@link RetrievePositionTextResponse }
     * 
     */
    public RetrievePositionTextResponse createRetrievePositionTextResponse() {
        return new RetrievePositionTextResponse();
    }

    /**
     * Create an instance of {@link RetrievePositionTextList }
     * 
     */
    public RetrievePositionTextList createRetrievePositionTextList() {
        return new RetrievePositionTextList();
    }

    /**
     * Create an instance of {@link RetrievePositionTextListResponse }
     * 
     */
    public RetrievePositionTextListResponse createRetrievePositionTextListResponse() {
        return new RetrievePositionTextListResponse();
    }

    /**
     * Create an instance of {@link CalculateDistanceByJurisdiction }
     * 
     */
    public CalculateDistanceByJurisdiction createCalculateDistanceByJurisdiction() {
        return new CalculateDistanceByJurisdiction();
    }

    /**
     * Create an instance of {@link CalculateDistanceByJurisdictionResponse }
     * 
     */
    public CalculateDistanceByJurisdictionResponse createCalculateDistanceByJurisdictionResponse() {
        return new CalculateDistanceByJurisdictionResponse();
    }

    /**
     * Create an instance of {@link RetrieveTravelModel }
     * 
     */
    public RetrieveTravelModel createRetrieveTravelModel() {
        return new RetrieveTravelModel();
    }

    /**
     * Create an instance of {@link RetrieveTravelModelResponse }
     * 
     */
    public RetrieveTravelModelResponse createRetrieveTravelModelResponse() {
        return new RetrieveTravelModelResponse();
    }

    /**
     * Create an instance of {@link UpdateTravelModel }
     * 
     */
    public UpdateTravelModel createUpdateTravelModel() {
        return new UpdateTravelModel();
    }

    /**
     * Create an instance of {@link UpdateTravelModelResponse }
     * 
     */
    public UpdateTravelModelResponse createUpdateTravelModelResponse() {
        return new UpdateTravelModelResponse();
    }

    /**
     * Create an instance of {@link RetrieveRestrictedPathsAndPolygons }
     * 
     */
    public RetrieveRestrictedPathsAndPolygons createRetrieveRestrictedPathsAndPolygons() {
        return new RetrieveRestrictedPathsAndPolygons();
    }

    /**
     * Create an instance of {@link RetrieveRestrictedPathsAndPolygonsResponse }
     * 
     */
    public RetrieveRestrictedPathsAndPolygonsResponse createRetrieveRestrictedPathsAndPolygonsResponse() {
        return new RetrieveRestrictedPathsAndPolygonsResponse();
    }

    /**
     * Create an instance of {@link UpdateRestrictedPath }
     * 
     */
    public UpdateRestrictedPath createUpdateRestrictedPath() {
        return new UpdateRestrictedPath();
    }

    /**
     * Create an instance of {@link UpdateRestrictedPathResponse }
     * 
     */
    public UpdateRestrictedPathResponse createUpdateRestrictedPathResponse() {
        return new UpdateRestrictedPathResponse();
    }

    /**
     * Create an instance of {@link UpdateTravelPolygon }
     * 
     */
    public UpdateTravelPolygon createUpdateTravelPolygon() {
        return new UpdateTravelPolygon();
    }

    /**
     * Create an instance of {@link UpdateTravelPolygonResponse }
     * 
     */
    public UpdateTravelPolygonResponse createUpdateTravelPolygonResponse() {
        return new UpdateTravelPolygonResponse();
    }

    /**
     * Create an instance of {@link PerformSearch }
     * 
     */
    public PerformSearch createPerformSearch() {
        return new PerformSearch();
    }

    /**
     * Create an instance of {@link PerformSearchResponse }
     * 
     */
    public PerformSearchResponse createPerformSearchResponse() {
        return new PerformSearchResponse();
    }

    /**
     * Create an instance of {@link MapSync }
     * 
     */
    public MapSync createMapSync() {
        return new MapSync();
    }

    /**
     * Create an instance of {@link MapSyncResponse }
     * 
     */
    public MapSyncResponse createMapSyncResponse() {
        return new MapSyncResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "emailAddress", scope = LoginAdmin.class)
    public JAXBElement<String> createLoginAdminEmailAddress(String value) {
        return new JAXBElement<String>(_LoginAdminEmailAddress_QNAME, String.class, LoginAdmin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "password", scope = LoginAdmin.class)
    public JAXBElement<String> createLoginAdminPassword(String value) {
        return new JAXBElement<String>(_LoginAdminPassword_QNAME, String.class, LoginAdmin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAdminResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LoginAdminResult", scope = LoginAdminResponse.class)
    public JAXBElement<LoginAdminResult> createLoginAdminResponseLoginAdminResult(LoginAdminResult value) {
        return new JAXBElement<LoginAdminResult>(_LoginAdminResponseLoginAdminResult_QNAME, LoginAdminResult.class, LoginAdminResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "emailAddress", scope = LoginAdminWithAppInfo.class)
    public JAXBElement<String> createLoginAdminWithAppInfoEmailAddress(String value) {
        return new JAXBElement<String>(_LoginAdminEmailAddress_QNAME, String.class, LoginAdminWithAppInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "password", scope = LoginAdminWithAppInfo.class)
    public JAXBElement<String> createLoginAdminWithAppInfoPassword(String value) {
        return new JAXBElement<String>(_LoginAdminPassword_QNAME, String.class, LoginAdminWithAppInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientApplicationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "appInfo", scope = LoginAdminWithAppInfo.class)
    public JAXBElement<ClientApplicationInfo> createLoginAdminWithAppInfoAppInfo(ClientApplicationInfo value) {
        return new JAXBElement<ClientApplicationInfo>(_LoginAdminWithAppInfoAppInfo_QNAME, ClientApplicationInfo.class, LoginAdminWithAppInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAdminResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LoginAdminWithAppInfoResult", scope = LoginAdminWithAppInfoResponse.class)
    public JAXBElement<LoginAdminResult> createLoginAdminWithAppInfoResponseLoginAdminWithAppInfoResult(LoginAdminResult value) {
        return new JAXBElement<LoginAdminResult>(_LoginAdminWithAppInfoResponseLoginAdminWithAppInfoResult_QNAME, LoginAdminResult.class, LoginAdminWithAppInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "emailAddress", scope = Login.class)
    public JAXBElement<String> createLoginEmailAddress(String value) {
        return new JAXBElement<String>(_LoginAdminEmailAddress_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "password", scope = Login.class)
    public JAXBElement<String> createLoginPassword(String value) {
        return new JAXBElement<String>(_LoginAdminPassword_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CultureOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "cultureOptions", scope = Login.class)
    public JAXBElement<CultureOptions> createLoginCultureOptions(CultureOptions value) {
        return new JAXBElement<CultureOptions>(_LoginCultureOptions_QNAME, CultureOptions.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientApplicationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "appInfo", scope = Login.class)
    public JAXBElement<ClientApplicationInfo> createLoginAppInfo(ClientApplicationInfo value) {
        return new JAXBElement<ClientApplicationInfo>(_LoginAdminWithAppInfoAppInfo_QNAME, ClientApplicationInfo.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LoginResult", scope = LoginResponse.class)
    public JAXBElement<LoginResult> createLoginResponseLoginResult(LoginResult value) {
        return new JAXBElement<LoginResult>(_LoginResponseLoginResult_QNAME, LoginResult.class, LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "sessionHeader", scope = Logout.class)
    public JAXBElement<SessionHeader> createLogoutSessionHeader(SessionHeader value) {
        return new JAXBElement<SessionHeader>(_LogoutSessionHeader_QNAME, SessionHeader.class, Logout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "emailAddress", scope = LookupPasswordPolicy.class)
    public JAXBElement<String> createLookupPasswordPolicyEmailAddress(String value) {
        return new JAXBElement<String>(_LoginAdminEmailAddress_QNAME, String.class, LookupPasswordPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LookupPasswordPolicyResult", scope = LookupPasswordPolicyResponse.class)
    public JAXBElement<PasswordPolicy> createLookupPasswordPolicyResponseLookupPasswordPolicyResult(PasswordPolicy value) {
        return new JAXBElement<PasswordPolicy>(_LookupPasswordPolicyResponseLookupPasswordPolicyResult_QNAME, PasswordPolicy.class, LookupPasswordPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "emailAddress", scope = LookupAdminPasswordPolicy.class)
    public JAXBElement<String> createLookupAdminPasswordPolicyEmailAddress(String value) {
        return new JAXBElement<String>(_LoginAdminEmailAddress_QNAME, String.class, LookupAdminPasswordPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LookupAdminPasswordPolicyResult", scope = LookupAdminPasswordPolicyResponse.class)
    public JAXBElement<PasswordPolicy> createLookupAdminPasswordPolicyResponseLookupAdminPasswordPolicyResult(PasswordPolicy value) {
        return new JAXBElement<PasswordPolicy>(_LookupAdminPasswordPolicyResponseLookupAdminPasswordPolicyResult_QNAME, PasswordPolicy.class, LookupAdminPasswordPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "emailAddress", scope = ChangePassword.class)
    public JAXBElement<String> createChangePasswordEmailAddress(String value) {
        return new JAXBElement<String>(_LoginAdminEmailAddress_QNAME, String.class, ChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "password", scope = ChangePassword.class)
    public JAXBElement<String> createChangePasswordPassword(String value) {
        return new JAXBElement<String>(_LoginAdminPassword_QNAME, String.class, ChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "newPassword", scope = ChangePassword.class)
    public JAXBElement<String> createChangePasswordNewPassword(String value) {
        return new JAXBElement<String>(_ChangePasswordNewPassword_QNAME, String.class, ChangePassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "emailAddress", scope = ChangeAdminPassword.class)
    public JAXBElement<String> createChangeAdminPasswordEmailAddress(String value) {
        return new JAXBElement<String>(_LoginAdminEmailAddress_QNAME, String.class, ChangeAdminPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "password", scope = ChangeAdminPassword.class)
    public JAXBElement<String> createChangeAdminPasswordPassword(String value) {
        return new JAXBElement<String>(_LoginAdminPassword_QNAME, String.class, ChangeAdminPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "newPassword", scope = ChangeAdminPassword.class)
    public JAXBElement<String> createChangeAdminPasswordNewPassword(String value) {
        return new JAXBElement<String>(_ChangePasswordNewPassword_QNAME, String.class, ChangeAdminPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "emailAddress", scope = ForgotPassword.class)
    public JAXBElement<String> createForgotPasswordEmailAddress(String value) {
        return new JAXBElement<String>(_LoginAdminEmailAddress_QNAME, String.class, ForgotPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "emailAddress", scope = ForgotAdminPassword.class)
    public JAXBElement<String> createForgotAdminPasswordEmailAddress(String value) {
        return new JAXBElement<String>(_LoginAdminEmailAddress_QNAME, String.class, ForgotAdminPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "deviceIdentifier", scope = LookupMobileDevice.class)
    public JAXBElement<String> createLookupMobileDeviceDeviceIdentifier(String value) {
        return new JAXBElement<String>(_LookupMobileDeviceDeviceIdentifier_QNAME, String.class, LookupMobileDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupMobileDeviceResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LookupMobileDeviceResult", scope = LookupMobileDeviceResponse.class)
    public JAXBElement<LookupMobileDeviceResult> createLookupMobileDeviceResponseLookupMobileDeviceResult(LookupMobileDeviceResult value) {
        return new JAXBElement<LookupMobileDeviceResult>(_LookupMobileDeviceResponseLookupMobileDeviceResult_QNAME, LookupMobileDeviceResult.class, LookupMobileDeviceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "identifier", scope = LookupTelematicsDevice.class)
    public JAXBElement<String> createLookupTelematicsDeviceIdentifier(String value) {
        return new JAXBElement<String>(_LookupTelematicsDeviceIdentifier_QNAME, String.class, LookupTelematicsDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "providerType", scope = LookupTelematicsDevice.class)
    public JAXBElement<String> createLookupTelematicsDeviceProviderType(String value) {
        return new JAXBElement<String>(_LookupTelematicsDeviceProviderType_QNAME, String.class, LookupTelematicsDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupTelematicsDeviceResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LookupTelematicsDeviceResult", scope = LookupTelematicsDeviceResponse.class)
    public JAXBElement<LookupTelematicsDeviceResult> createLookupTelematicsDeviceResponseLookupTelematicsDeviceResult(LookupTelematicsDeviceResult value) {
        return new JAXBElement<LookupTelematicsDeviceResult>(_LookupTelematicsDeviceResponseLookupTelematicsDeviceResult_QNAME, LookupTelematicsDeviceResult.class, LookupTelematicsDeviceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminUserSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "adminSession", scope = LoginSupport.class)
    public JAXBElement<AdminUserSession> createLoginSupportAdminSession(AdminUserSession value) {
        return new JAXBElement<AdminUserSession>(_LoginSupportAdminSession_QNAME, AdminUserSession.class, LoginSupport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "emailAddress", scope = LoginSupport.class)
    public JAXBElement<String> createLoginSupportEmailAddress(String value) {
        return new JAXBElement<String>(_LoginAdminEmailAddress_QNAME, String.class, LoginSupport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CultureOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "cultureOptions", scope = LoginSupport.class)
    public JAXBElement<CultureOptions> createLoginSupportCultureOptions(CultureOptions value) {
        return new JAXBElement<CultureOptions>(_LoginCultureOptions_QNAME, CultureOptions.class, LoginSupport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientApplicationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "appInfo", scope = LoginSupport.class)
    public JAXBElement<ClientApplicationInfo> createLoginSupportAppInfo(ClientApplicationInfo value) {
        return new JAXBElement<ClientApplicationInfo>(_LoginAdminWithAppInfoAppInfo_QNAME, ClientApplicationInfo.class, LoginSupport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LoginSupportResult", scope = LoginSupportResponse.class)
    public JAXBElement<LoginResult> createLoginSupportResponseLoginSupportResult(LoginResult value) {
        return new JAXBElement<LoginResult>(_LoginSupportResponseLoginSupportResult_QNAME, LoginResult.class, LoginSupportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "authTokenString", scope = LoginSingleSignOn.class)
    public JAXBElement<String> createLoginSingleSignOnAuthTokenString(String value) {
        return new JAXBElement<String>(_LoginSingleSignOnAuthTokenString_QNAME, String.class, LoginSingleSignOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CultureOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "cultureOptions", scope = LoginSingleSignOn.class)
    public JAXBElement<CultureOptions> createLoginSingleSignOnCultureOptions(CultureOptions value) {
        return new JAXBElement<CultureOptions>(_LoginCultureOptions_QNAME, CultureOptions.class, LoginSingleSignOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientApplicationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "appInfo", scope = LoginSingleSignOn.class)
    public JAXBElement<ClientApplicationInfo> createLoginSingleSignOnAppInfo(ClientApplicationInfo value) {
        return new JAXBElement<ClientApplicationInfo>(_LoginAdminWithAppInfoAppInfo_QNAME, ClientApplicationInfo.class, LoginSingleSignOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LoginSingleSignOnResult", scope = LoginSingleSignOnResponse.class)
    public JAXBElement<LoginResult> createLoginSingleSignOnResponseLoginSingleSignOnResult(LoginResult value) {
        return new JAXBElement<LoginResult>(_LoginSingleSignOnResponseLoginSingleSignOnResult_QNAME, LoginResult.class, LoginSingleSignOnResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "sessionHeader", scope = LookupLoginResult.class)
    public JAXBElement<SessionHeader> createLookupLoginResultSessionHeader(SessionHeader value) {
        return new JAXBElement<SessionHeader>(_LogoutSessionHeader_QNAME, SessionHeader.class, LookupLoginResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CultureOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "cultureOptions", scope = LookupLoginResult.class)
    public JAXBElement<CultureOptions> createLookupLoginResultCultureOptions(CultureOptions value) {
        return new JAXBElement<CultureOptions>(_LoginCultureOptions_QNAME, CultureOptions.class, LookupLoginResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientApplicationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "appInfo", scope = LookupLoginResult.class)
    public JAXBElement<ClientApplicationInfo> createLookupLoginResultAppInfo(ClientApplicationInfo value) {
        return new JAXBElement<ClientApplicationInfo>(_LoginAdminWithAppInfoAppInfo_QNAME, ClientApplicationInfo.class, LookupLoginResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LookupLoginResultResult", scope = LookupLoginResultResponse.class)
    public JAXBElement<LoginResult> createLookupLoginResultResponseLookupLoginResultResult(LoginResult value) {
        return new JAXBElement<LoginResult>(_LookupLoginResultResponseLookupLoginResultResult_QNAME, LoginResult.class, LookupLoginResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "xrsCompanyLoginId", scope = RetrieveCustomerByXrsCompanyLoginId.class)
    public JAXBElement<String> createRetrieveCustomerByXrsCompanyLoginIdXrsCompanyLoginId(String value) {
        return new JAXBElement<String>(_RetrieveCustomerByXrsCompanyLoginIdXrsCompanyLoginId_QNAME, String.class, RetrieveCustomerByXrsCompanyLoginId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveCustomerByXrsCompanyLoginIdResult", scope = RetrieveCustomerByXrsCompanyLoginIdResponse.class)
    public JAXBElement<Customer> createRetrieveCustomerByXrsCompanyLoginIdResponseRetrieveCustomerByXrsCompanyLoginIdResult(Customer value) {
        return new JAXBElement<Customer>(_RetrieveCustomerByXrsCompanyLoginIdResponseRetrieveCustomerByXrsCompanyLoginIdResult_QNAME, Customer.class, RetrieveCustomerByXrsCompanyLoginIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = MultiRetrieve.class)
    public JAXBElement<RegionContext> createMultiRetrieveRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, MultiRetrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = MultiRetrieve.class)
    public JAXBElement<ArrayOfRetrievalOptions> createMultiRetrieveOptions(ArrayOfRetrievalOptions value) {
        return new JAXBElement<ArrayOfRetrievalOptions>(_MultiRetrieveOptions_QNAME, ArrayOfRetrievalOptions.class, MultiRetrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRetrievalResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MultiRetrieveResult", scope = MultiRetrieveResponse.class)
    public JAXBElement<ArrayOfRetrievalResults> createMultiRetrieveResponseMultiRetrieveResult(ArrayOfRetrievalResults value) {
        return new JAXBElement<ArrayOfRetrievalResults>(_MultiRetrieveResponseMultiRetrieveResult_QNAME, ArrayOfRetrievalResults.class, MultiRetrieveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = Retrieve.class)
    public JAXBElement<RegionContext> createRetrieveRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, Retrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = Retrieve.class)
    public JAXBElement<RetrievalOptions> createRetrieveOptions(RetrievalOptions value) {
        return new JAXBElement<RetrievalOptions>(_MultiRetrieveOptions_QNAME, RetrievalOptions.class, Retrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveResult", scope = RetrieveResponse.class)
    public JAXBElement<RetrievalResults> createRetrieveResponseRetrieveResult(RetrievalResults value) {
        return new JAXBElement<RetrievalResults>(_RetrieveResponseRetrieveResult_QNAME, RetrievalResults.class, RetrieveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiscussion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveDiscussionsByEntityResult", scope = RetrieveDiscussionsByEntityResponse.class)
    public JAXBElement<ArrayOfDiscussion> createRetrieveDiscussionsByEntityResponseRetrieveDiscussionsByEntityResult(ArrayOfDiscussion value) {
        return new JAXBElement<ArrayOfDiscussion>(_RetrieveDiscussionsByEntityResponseRetrieveDiscussionsByEntityResult_QNAME, ArrayOfDiscussion.class, RetrieveDiscussionsByEntityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "typesToRetrieve", scope = RetrieveDiscussionNotifications.class)
    public JAXBElement<ArrayOfEntityType> createRetrieveDiscussionNotificationsTypesToRetrieve(ArrayOfEntityType value) {
        return new JAXBElement<ArrayOfEntityType>(_RetrieveDiscussionNotificationsTypesToRetrieve_QNAME, ArrayOfEntityType.class, RetrieveDiscussionNotifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotificationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveDiscussionNotificationsResult", scope = RetrieveDiscussionNotificationsResponse.class)
    public JAXBElement<ArrayOfNotificationResult> createRetrieveDiscussionNotificationsResponseRetrieveDiscussionNotificationsResult(ArrayOfNotificationResult value) {
        return new JAXBElement<ArrayOfNotificationResult>(_RetrieveDiscussionNotificationsResponseRetrieveDiscussionNotificationsResult_QNAME, ArrayOfNotificationResult.class, RetrieveDiscussionNotificationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRolePermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "permissions", scope = RetrieveBusinessUnitsGrantingPermissions.class)
    public JAXBElement<ArrayOfRolePermission> createRetrieveBusinessUnitsGrantingPermissionsPermissions(ArrayOfRolePermission value) {
        return new JAXBElement<ArrayOfRolePermission>(_RetrieveBusinessUnitsGrantingPermissionsPermissions_QNAME, ArrayOfRolePermission.class, RetrieveBusinessUnitsGrantingPermissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveBusinessUnitsGrantingPermissionsResult", scope = RetrieveBusinessUnitsGrantingPermissionsResponse.class)
    public JAXBElement<RetrievalResults> createRetrieveBusinessUnitsGrantingPermissionsResponseRetrieveBusinessUnitsGrantingPermissionsResult(RetrievalResults value) {
        return new JAXBElement<RetrievalResults>(_RetrieveBusinessUnitsGrantingPermissionsResponseRetrieveBusinessUnitsGrantingPermissionsResult_QNAME, RetrievalResults.class, RetrieveBusinessUnitsGrantingPermissionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRolePermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "permissions", scope = RetrieveRegionsGrantingPermissions.class)
    public JAXBElement<ArrayOfRolePermission> createRetrieveRegionsGrantingPermissionsPermissions(ArrayOfRolePermission value) {
        return new JAXBElement<ArrayOfRolePermission>(_RetrieveBusinessUnitsGrantingPermissionsPermissions_QNAME, ArrayOfRolePermission.class, RetrieveRegionsGrantingPermissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveRegionsGrantingPermissionsResult", scope = RetrieveRegionsGrantingPermissionsResponse.class)
    public JAXBElement<RetrievalResults> createRetrieveRegionsGrantingPermissionsResponseRetrieveRegionsGrantingPermissionsResult(RetrievalResults value) {
        return new JAXBElement<RetrievalResults>(_RetrieveRegionsGrantingPermissionsResponseRetrieveRegionsGrantingPermissionsResult_QNAME, RetrievalResults.class, RetrieveRegionsGrantingPermissionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveRegions.class)
    public JAXBElement<RegionRetrievalOptions> createRetrieveRegionsOptions(RegionRetrievalOptions value) {
        return new JAXBElement<RegionRetrievalOptions>(_MultiRetrieveOptions_QNAME, RegionRetrievalOptions.class, RetrieveRegions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveRegionsResult", scope = RetrieveRegionsResponse.class)
    public JAXBElement<RetrievalResults> createRetrieveRegionsResponseRetrieveRegionsResult(RetrievalResults value) {
        return new JAXBElement<RetrievalResults>(_RetrieveRegionsResponseRetrieveRegionsResult_QNAME, RetrievalResults.class, RetrieveRegionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveOperationalRegionsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveOperationalRegions.class)
    public JAXBElement<RetrieveOperationalRegionsOptions> createRetrieveOperationalRegionsOptions(RetrieveOperationalRegionsOptions value) {
        return new JAXBElement<RetrieveOperationalRegionsOptions>(_MultiRetrieveOptions_QNAME, RetrieveOperationalRegionsOptions.class, RetrieveOperationalRegions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveOperationalRegionsResult", scope = RetrieveOperationalRegionsResponse.class)
    public JAXBElement<ArrayOfRegion> createRetrieveOperationalRegionsResponseRetrieveOperationalRegionsResult(ArrayOfRegion value) {
        return new JAXBElement<ArrayOfRegion>(_RetrieveOperationalRegionsResponseRetrieveOperationalRegionsResult_QNAME, ArrayOfRegion.class, RetrieveOperationalRegionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveUserPermissions.class)
    public JAXBElement<RegionContext> createRetrieveUserPermissionsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveUserPermissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPermissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveUserPermissionsResult", scope = RetrieveUserPermissionsResponse.class)
    public JAXBElement<UserPermissions> createRetrieveUserPermissionsResponseRetrieveUserPermissionsResult(UserPermissions value) {
        return new JAXBElement<UserPermissions>(_RetrieveUserPermissionsResponseRetrieveUserPermissionsResult_QNAME, UserPermissions.class, RetrieveUserPermissionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveReports.class)
    public JAXBElement<RegionContext> createRetrieveReportsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveReportsResult", scope = RetrieveReportsResponse.class)
    public JAXBElement<ArrayOfReport> createRetrieveReportsResponseRetrieveReportsResult(ArrayOfReport value) {
        return new JAXBElement<ArrayOfReport>(_RetrieveReportsResponseRetrieveReportsResult_QNAME, ArrayOfReport.class, RetrieveReportsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveTransferableEntityNamesResult", scope = RetrieveTransferableEntityNamesResponse.class)
    public JAXBElement<ArrayOfstring> createRetrieveTransferableEntityNamesResponseRetrieveTransferableEntityNamesResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_RetrieveTransferableEntityNamesResponseRetrieveTransferableEntityNamesResult_QNAME, ArrayOfstring.class, RetrieveTransferableEntityNamesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveTransferableEntities.class)
    public JAXBElement<RegionContext> createRetrieveTransferableEntitiesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveTransferableEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransferableEntityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveTransferableEntitiesResult", scope = RetrieveTransferableEntitiesResponse.class)
    public JAXBElement<ArrayOfTransferableEntityInfo> createRetrieveTransferableEntitiesResponseRetrieveTransferableEntitiesResult(ArrayOfTransferableEntityInfo value) {
        return new JAXBElement<ArrayOfTransferableEntityInfo>(_RetrieveTransferableEntitiesResponseRetrieveTransferableEntitiesResult_QNAME, ArrayOfTransferableEntityInfo.class, RetrieveTransferableEntitiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveScorecardTemplateCriteriaInfo.class)
    public JAXBElement<RegionContext> createRetrieveScorecardTemplateCriteriaInfoContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveScorecardTemplateCriteriaInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScorecardTemplateCriteriaInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveScorecardTemplateCriteriaInfoResult", scope = RetrieveScorecardTemplateCriteriaInfoResponse.class)
    public JAXBElement<ScorecardTemplateCriteriaInfo> createRetrieveScorecardTemplateCriteriaInfoResponseRetrieveScorecardTemplateCriteriaInfoResult(ScorecardTemplateCriteriaInfo value) {
        return new JAXBElement<ScorecardTemplateCriteriaInfo>(_RetrieveScorecardTemplateCriteriaInfoResponseRetrieveScorecardTemplateCriteriaInfoResult_QNAME, ScorecardTemplateCriteriaInfo.class, RetrieveScorecardTemplateCriteriaInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveTransferableEntity.class)
    public JAXBElement<RegionContext> createRetrieveTransferableEntityContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveTransferableEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "entityName", scope = RetrieveTransferableEntity.class)
    public JAXBElement<String> createRetrieveTransferableEntityEntityName(String value) {
        return new JAXBElement<String>(_RetrieveTransferableEntityEntityName_QNAME, String.class, RetrieveTransferableEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferableEntityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveTransferableEntityResult", scope = RetrieveTransferableEntityResponse.class)
    public JAXBElement<TransferableEntityInfo> createRetrieveTransferableEntityResponseRetrieveTransferableEntityResult(TransferableEntityInfo value) {
        return new JAXBElement<TransferableEntityInfo>(_RetrieveTransferableEntityResponseRetrieveTransferableEntityResult_QNAME, TransferableEntityInfo.class, RetrieveTransferableEntityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveUrlsForContext.class)
    public JAXBElement<RegionContext> createRetrieveUrlsForContextContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveUrlsForContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrlSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveUrlsForContextResult", scope = RetrieveUrlsForContextResponse.class)
    public JAXBElement<UrlSet> createRetrieveUrlsForContextResponseRetrieveUrlsForContextResult(UrlSet value) {
        return new JAXBElement<UrlSet>(_RetrieveUrlsForContextResponseRetrieveUrlsForContextResult_QNAME, UrlSet.class, RetrieveUrlsForContextResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveSystemInfo.class)
    public JAXBElement<RegionContext> createRetrieveSystemInfoContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveSystemInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveSystemInfoResult", scope = RetrieveSystemInfoResponse.class)
    public JAXBElement<SystemInfo> createRetrieveSystemInfoResponseRetrieveSystemInfoResult(SystemInfo value) {
        return new JAXBElement<SystemInfo>(_RetrieveSystemInfoResponseRetrieveSystemInfoResult_QNAME, SystemInfo.class, RetrieveSystemInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveCountriesResult", scope = RetrieveCountriesResponse.class)
    public JAXBElement<ArrayOfCountry> createRetrieveCountriesResponseRetrieveCountriesResult(ArrayOfCountry value) {
        return new JAXBElement<ArrayOfCountry>(_RetrieveCountriesResponseRetrieveCountriesResult_QNAME, ArrayOfCountry.class, RetrieveCountriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveLocationComments.class)
    public JAXBElement<RegionContext> createRetrieveLocationCommentsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveLocationComments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveLocationComments.class)
    public JAXBElement<RetrievalOptions> createRetrieveLocationCommentsOptions(RetrievalOptions value) {
        return new JAXBElement<RetrievalOptions>(_MultiRetrieveOptions_QNAME, RetrievalOptions.class, RetrieveLocationComments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCommentResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveLocationCommentsResult", scope = RetrieveLocationCommentsResponse.class)
    public JAXBElement<LocationCommentResults> createRetrieveLocationCommentsResponseRetrieveLocationCommentsResult(LocationCommentResults value) {
        return new JAXBElement<LocationCommentResults>(_RetrieveLocationCommentsResponseRetrieveLocationCommentsResult_QNAME, LocationCommentResults.class, RetrieveLocationCommentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveServiceLocationServiceStatistics.class)
    public JAXBElement<RegionContext> createRetrieveServiceLocationServiceStatisticsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveServiceLocationServiceStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveServiceLocationServiceStatisticsArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "args", scope = RetrieveServiceLocationServiceStatistics.class)
    public JAXBElement<RetrieveServiceLocationServiceStatisticsArgs> createRetrieveServiceLocationServiceStatisticsArgs(RetrieveServiceLocationServiceStatisticsArgs value) {
        return new JAXBElement<RetrieveServiceLocationServiceStatisticsArgs>(_RetrieveServiceLocationServiceStatisticsArgs_QNAME, RetrieveServiceLocationServiceStatisticsArgs.class, RetrieveServiceLocationServiceStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceLocationServiceStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveServiceLocationServiceStatisticsResult", scope = RetrieveServiceLocationServiceStatisticsResponse.class)
    public JAXBElement<ServiceLocationServiceStatistics> createRetrieveServiceLocationServiceStatisticsResponseRetrieveServiceLocationServiceStatisticsResult(ServiceLocationServiceStatistics value) {
        return new JAXBElement<ServiceLocationServiceStatistics>(_RetrieveServiceLocationServiceStatisticsResponseRetrieveServiceLocationServiceStatisticsResult_QNAME, ServiceLocationServiceStatistics.class, RetrieveServiceLocationServiceStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveDispatchRouteSummaryStatistics.class)
    public JAXBElement<RegionContext> createRetrieveDispatchRouteSummaryStatisticsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveDispatchRouteSummaryStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDispatchRouteSummaryStatisticsArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "args", scope = RetrieveDispatchRouteSummaryStatistics.class)
    public JAXBElement<RetrieveDispatchRouteSummaryStatisticsArgs> createRetrieveDispatchRouteSummaryStatisticsArgs(RetrieveDispatchRouteSummaryStatisticsArgs value) {
        return new JAXBElement<RetrieveDispatchRouteSummaryStatisticsArgs>(_RetrieveServiceLocationServiceStatisticsArgs_QNAME, RetrieveDispatchRouteSummaryStatisticsArgs.class, RetrieveDispatchRouteSummaryStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DispatchRouteSummaryStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveDispatchRouteSummaryStatisticsResult", scope = RetrieveDispatchRouteSummaryStatisticsResponse.class)
    public JAXBElement<DispatchRouteSummaryStatistics> createRetrieveDispatchRouteSummaryStatisticsResponseRetrieveDispatchRouteSummaryStatisticsResult(DispatchRouteSummaryStatistics value) {
        return new JAXBElement<DispatchRouteSummaryStatistics>(_RetrieveDispatchRouteSummaryStatisticsResponseRetrieveDispatchRouteSummaryStatisticsResult_QNAME, DispatchRouteSummaryStatistics.class, RetrieveDispatchRouteSummaryStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AuthenticateWorker.class)
    public JAXBElement<RegionContext> createAuthenticateWorkerContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AuthenticateWorker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "login", scope = AuthenticateWorker.class)
    public JAXBElement<String> createAuthenticateWorkerLogin(String value) {
        return new JAXBElement<String>(_AuthenticateWorkerLogin_QNAME, String.class, AuthenticateWorker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "password", scope = AuthenticateWorker.class)
    public JAXBElement<String> createAuthenticateWorkerPassword(String value) {
        return new JAXBElement<String>(_LoginAdminPassword_QNAME, String.class, AuthenticateWorker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveRouteSignatures.class)
    public JAXBElement<RegionContext> createRetrieveRouteSignaturesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveRouteSignatures.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveRouteSignaturesResult", scope = RetrieveRouteSignaturesResponse.class)
    public JAXBElement<Route> createRetrieveRouteSignaturesResponseRetrieveRouteSignaturesResult(Route value) {
        return new JAXBElement<Route>(_RetrieveRouteSignaturesResponseRetrieveRouteSignaturesResult_QNAME, Route.class, RetrieveRouteSignaturesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = Search.class)
    public JAXBElement<RegionContext> createSearchContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, Search.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "searchString", scope = Search.class)
    public JAXBElement<String> createSearchSearchString(String value) {
        return new JAXBElement<String>(_SearchSearchString_QNAME, String.class, Search.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = Search.class)
    public JAXBElement<SearchOptions> createSearchOptions(SearchOptions value) {
        return new JAXBElement<SearchOptions>(_MultiRetrieveOptions_QNAME, SearchOptions.class, Search.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompositeSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SearchResult", scope = SearchResponse.class)
    public JAXBElement<ArrayOfCompositeSearchResult> createSearchResponseSearchResult(ArrayOfCompositeSearchResult value) {
        return new JAXBElement<ArrayOfCompositeSearchResult>(_SearchResponseSearchResult_QNAME, ArrayOfCompositeSearchResult.class, SearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SearchByType.class)
    public JAXBElement<RegionContext> createSearchByTypeContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SearchByType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "searchString", scope = SearchByType.class)
    public JAXBElement<String> createSearchByTypeSearchString(String value) {
        return new JAXBElement<String>(_SearchSearchString_QNAME, String.class, SearchByType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTypeOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = SearchByType.class)
    public JAXBElement<SearchTypeOptions> createSearchByTypeOptions(SearchTypeOptions value) {
        return new JAXBElement<SearchTypeOptions>(_MultiRetrieveOptions_QNAME, SearchTypeOptions.class, SearchByType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SearchByTypeResult", scope = SearchByTypeResponse.class)
    public JAXBElement<RetrievalResults> createSearchByTypeResponseSearchByTypeResult(RetrievalResults value) {
        return new JAXBElement<RetrievalResults>(_SearchByTypeResponseSearchByTypeResult_QNAME, RetrievalResults.class, SearchByTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ExecuteReport.class)
    public JAXBElement<RegionContext> createExecuteReportContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ExecuteReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteReportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameter", scope = ExecuteReport.class)
    public JAXBElement<ExecuteReportParameters> createExecuteReportParameter(ExecuteReportParameters value) {
        return new JAXBElement<ExecuteReportParameters>(_ExecuteReportParameter_QNAME, ExecuteReportParameters.class, ExecuteReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveDriverLogs.class)
    public JAXBElement<RegionContext> createRetrieveDriverLogsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveDriverLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDriverLogOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveDriverLogs.class)
    public JAXBElement<RetrieveDriverLogOptions> createRetrieveDriverLogsOptions(RetrieveDriverLogOptions value) {
        return new JAXBElement<RetrieveDriverLogOptions>(_MultiRetrieveOptions_QNAME, RetrieveDriverLogOptions.class, RetrieveDriverLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverLogResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveDriverLogsResult", scope = RetrieveDriverLogsResponse.class)
    public JAXBElement<DriverLogResults> createRetrieveDriverLogsResponseRetrieveDriverLogsResult(DriverLogResults value) {
        return new JAXBElement<DriverLogResults>(_RetrieveDriverLogsResponseRetrieveDriverLogsResult_QNAME, DriverLogResults.class, RetrieveDriverLogsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveDVIRResults.class)
    public JAXBElement<RegionContext> createRetrieveDVIRResultsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveDVIRResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DVIRRetrievalJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = RetrieveDVIRResults.class)
    public JAXBElement<DVIRRetrievalJobParameters> createRetrieveDVIRResultsParameters(DVIRRetrievalJobParameters value) {
        return new JAXBElement<DVIRRetrievalJobParameters>(_RetrieveDVIRResultsParameters_QNAME, DVIRRetrievalJobParameters.class, RetrieveDVIRResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveAvailableLevelsForRegionResult", scope = RetrieveAvailableLevelsForRegionResponse.class)
    public JAXBElement<ArrayOflong> createRetrieveAvailableLevelsForRegionResponseRetrieveAvailableLevelsForRegionResult(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RetrieveAvailableLevelsForRegionResponseRetrieveAvailableLevelsForRegionResult_QNAME, ArrayOflong.class, RetrieveAvailableLevelsForRegionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ExecuteScorecard.class)
    public JAXBElement<RegionContext> createExecuteScorecardContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ExecuteScorecard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteScorecardParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = ExecuteScorecard.class)
    public JAXBElement<ExecuteScorecardParameters> createExecuteScorecardParameters(ExecuteScorecardParameters value) {
        return new JAXBElement<ExecuteScorecardParameters>(_RetrieveDVIRResultsParameters_QNAME, ExecuteScorecardParameters.class, ExecuteScorecard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestSalesContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "info", scope = RequestSalesContact.class)
    public JAXBElement<RequestSalesContactInfo> createRequestSalesContactInfo(RequestSalesContactInfo value) {
        return new JAXBElement<RequestSalesContactInfo>(_RequestSalesContactInfo_QNAME, RequestSalesContactInfo.class, RequestSalesContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveOrderInfos.class)
    public JAXBElement<RegionContext> createRetrieveOrderInfosRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveOrderInfos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "serviceLocationEntityKeys", scope = RetrieveOrderInfos.class)
    public JAXBElement<ArrayOflong> createRetrieveOrderInfosServiceLocationEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RetrieveOrderInfosServiceLocationEntityKeys_QNAME, ArrayOflong.class, RetrieveOrderInfos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "startServiceDate", scope = RetrieveOrderInfos.class)
    public JAXBElement<XMLGregorianCalendar> createRetrieveOrderInfosStartServiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RetrieveOrderInfosStartServiceDate_QNAME, XMLGregorianCalendar.class, RetrieveOrderInfos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "endServiceDate", scope = RetrieveOrderInfos.class)
    public JAXBElement<XMLGregorianCalendar> createRetrieveOrderInfosEndServiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RetrieveOrderInfosEndServiceDate_QNAME, XMLGregorianCalendar.class, RetrieveOrderInfos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "showPosition", scope = RetrieveOrderInfos.class)
    public JAXBElement<Boolean> createRetrieveOrderInfosShowPosition(Boolean value) {
        return new JAXBElement<Boolean>(_RetrieveOrderInfosShowPosition_QNAME, Boolean.class, RetrieveOrderInfos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "distanceUnit", scope = RetrieveOrderInfos.class)
    public JAXBElement<String> createRetrieveOrderInfosDistanceUnit(String value) {
        return new JAXBElement<String>(_RetrieveOrderInfosDistanceUnit_QNAME, String.class, RetrieveOrderInfos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveOrderInfosResult", scope = RetrieveOrderInfosResponse.class)
    public JAXBElement<ArrayOfOrderInfo> createRetrieveOrderInfosResponseRetrieveOrderInfosResult(ArrayOfOrderInfo value) {
        return new JAXBElement<ArrayOfOrderInfo>(_RetrieveOrderInfosResponseRetrieveOrderInfosResult_QNAME, ArrayOfOrderInfo.class, RetrieveOrderInfosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ExecuteReportGroup.class)
    public JAXBElement<RegionContext> createExecuteReportGroupContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ExecuteReportGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteReportGroupParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameter", scope = ExecuteReportGroup.class)
    public JAXBElement<ExecuteReportGroupParameters> createExecuteReportGroupParameter(ExecuteReportGroupParameters value) {
        return new JAXBElement<ExecuteReportGroupParameters>(_ExecuteReportParameter_QNAME, ExecuteReportGroupParameters.class, ExecuteReportGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveLocalizedCulturesResult", scope = RetrieveLocalizedCulturesResponse.class)
    public JAXBElement<ArrayOfstring> createRetrieveLocalizedCulturesResponseRetrieveLocalizedCulturesResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_RetrieveLocalizedCulturesResponseRetrieveLocalizedCulturesResult_QNAME, ArrayOfstring.class, RetrieveLocalizedCulturesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShareableEntityAccessor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveSharedEntityAccessorsResult", scope = RetrieveSharedEntityAccessorsResponse.class)
    public JAXBElement<ArrayOfShareableEntityAccessor> createRetrieveSharedEntityAccessorsResponseRetrieveSharedEntityAccessorsResult(ArrayOfShareableEntityAccessor value) {
        return new JAXBElement<ArrayOfShareableEntityAccessor>(_RetrieveSharedEntityAccessorsResponseRetrieveSharedEntityAccessorsResult_QNAME, ArrayOfShareableEntityAccessor.class, RetrieveSharedEntityAccessorsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveCustomFormsForRoute.class)
    public JAXBElement<RegionContext> createRetrieveCustomFormsForRouteRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveCustomFormsForRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomFormAssignmentResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveCustomFormsForRouteResult", scope = RetrieveCustomFormsForRouteResponse.class)
    public JAXBElement<CustomFormAssignmentResult> createRetrieveCustomFormsForRouteResponseRetrieveCustomFormsForRouteResult(CustomFormAssignmentResult value) {
        return new JAXBElement<CustomFormAssignmentResult>(_RetrieveCustomFormsForRouteResponseRetrieveCustomFormsForRouteResult_QNAME, CustomFormAssignmentResult.class, RetrieveCustomFormsForRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveRoutelessCustomForms.class)
    public JAXBElement<RegionContext> createRetrieveRoutelessCustomFormsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveRoutelessCustomForms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomFormAssignmentResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveRoutelessCustomFormsResult", scope = RetrieveRoutelessCustomFormsResponse.class)
    public JAXBElement<CustomFormAssignmentResult> createRetrieveRoutelessCustomFormsResponseRetrieveRoutelessCustomFormsResult(CustomFormAssignmentResult value) {
        return new JAXBElement<CustomFormAssignmentResult>(_RetrieveRoutelessCustomFormsResponseRetrieveRoutelessCustomFormsResult_QNAME, CustomFormAssignmentResult.class, RetrieveRoutelessCustomFormsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveWorkerAlertAssignmentsForRoute.class)
    public JAXBElement<RegionContext> createRetrieveWorkerAlertAssignmentsForRouteRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveWorkerAlertAssignmentsForRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerAlertAssignmentResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveWorkerAlertAssignmentsForRouteResult", scope = RetrieveWorkerAlertAssignmentsForRouteResponse.class)
    public JAXBElement<WorkerAlertAssignmentResult> createRetrieveWorkerAlertAssignmentsForRouteResponseRetrieveWorkerAlertAssignmentsForRouteResult(WorkerAlertAssignmentResult value) {
        return new JAXBElement<WorkerAlertAssignmentResult>(_RetrieveWorkerAlertAssignmentsForRouteResponseRetrieveWorkerAlertAssignmentsForRouteResult_QNAME, WorkerAlertAssignmentResult.class, RetrieveWorkerAlertAssignmentsForRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ExecuteServicePatternAnalyzer.class)
    public JAXBElement<RegionContext> createExecuteServicePatternAnalyzerContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ExecuteServicePatternAnalyzer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteServicePatternAnalyzerParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = ExecuteServicePatternAnalyzer.class)
    public JAXBElement<ExecuteServicePatternAnalyzerParameters> createExecuteServicePatternAnalyzerParameters(ExecuteServicePatternAnalyzerParameters value) {
        return new JAXBElement<ExecuteServicePatternAnalyzerParameters>(_RetrieveDVIRResultsParameters_QNAME, ExecuteServicePatternAnalyzerParameters.class, ExecuteServicePatternAnalyzer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHosRuleSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveHosRuleSetsResult", scope = RetrieveHosRuleSetsResponse.class)
    public JAXBElement<ArrayOfHosRuleSet> createRetrieveHosRuleSetsResponseRetrieveHosRuleSetsResult(ArrayOfHosRuleSet value) {
        return new JAXBElement<ArrayOfHosRuleSet>(_RetrieveHosRuleSetsResponseRetrieveHosRuleSetsResult_QNAME, ArrayOfHosRuleSet.class, RetrieveHosRuleSetsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateHosRulesParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = ValidateHosRuleSets.class)
    public JAXBElement<ValidateHosRulesParameters> createValidateHosRuleSetsParameters(ValidateHosRulesParameters value) {
        return new JAXBElement<ValidateHosRulesParameters>(_RetrieveDVIRResultsParameters_QNAME, ValidateHosRulesParameters.class, ValidateHosRuleSets.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HosRulesValidationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ValidateHosRuleSetsResult", scope = ValidateHosRuleSetsResponse.class)
    public JAXBElement<HosRulesValidationResult> createValidateHosRuleSetsResponseValidateHosRuleSetsResult(HosRulesValidationResult value) {
        return new JAXBElement<HosRulesValidationResult>(_ValidateHosRuleSetsResponseValidateHosRuleSetsResult_QNAME, HosRulesValidationResult.class, ValidateHosRuleSetsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEldComplianceDateResult", scope = RetrieveEldComplianceDateResponse.class)
    public JAXBElement<XMLGregorianCalendar> createRetrieveEldComplianceDateResponseRetrieveEldComplianceDateResult(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RetrieveEldComplianceDateResponseRetrieveEldComplianceDateResult_QNAME, XMLGregorianCalendar.class, RetrieveEldComplianceDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveEquipmentProfileForTelematicsDevice.class)
    public JAXBElement<RegionContext> createRetrieveEquipmentProfileForTelematicsDeviceRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveEquipmentProfileForTelematicsDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentProfileResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEquipmentProfileForTelematicsDeviceResult", scope = RetrieveEquipmentProfileForTelematicsDeviceResponse.class)
    public JAXBElement<EquipmentProfileResult> createRetrieveEquipmentProfileForTelematicsDeviceResponseRetrieveEquipmentProfileForTelematicsDeviceResult(EquipmentProfileResult value) {
        return new JAXBElement<EquipmentProfileResult>(_RetrieveEquipmentProfileForTelematicsDeviceResponseRetrieveEquipmentProfileForTelematicsDeviceResult_QNAME, EquipmentProfileResult.class, RetrieveEquipmentProfileForTelematicsDeviceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveComplianceCountriesResult", scope = RetrieveComplianceCountriesResponse.class)
    public JAXBElement<ArrayOfCountry> createRetrieveComplianceCountriesResponseRetrieveComplianceCountriesResult(ArrayOfCountry value) {
        return new JAXBElement<ArrayOfCountry>(_RetrieveComplianceCountriesResponseRetrieveComplianceCountriesResult_QNAME, ArrayOfCountry.class, RetrieveComplianceCountriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveComplianceDriverLicenseCountriesResult", scope = RetrieveComplianceDriverLicenseCountriesResponse.class)
    public JAXBElement<ArrayOfCountry> createRetrieveComplianceDriverLicenseCountriesResponseRetrieveComplianceDriverLicenseCountriesResult(ArrayOfCountry value) {
        return new JAXBElement<ArrayOfCountry>(_RetrieveComplianceDriverLicenseCountriesResponseRetrieveComplianceDriverLicenseCountriesResult_QNAME, ArrayOfCountry.class, RetrieveComplianceDriverLicenseCountriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Country }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "countryDto", scope = RetrieveComplianceStateNamesForCountry.class)
    public JAXBElement<Country> createRetrieveComplianceStateNamesForCountryCountryDto(Country value) {
        return new JAXBElement<Country>(_RetrieveComplianceStateNamesForCountryCountryDto_QNAME, Country.class, RetrieveComplianceStateNamesForCountry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveComplianceStateNamesForCountryResult", scope = RetrieveComplianceStateNamesForCountryResponse.class)
    public JAXBElement<ArrayOfstring> createRetrieveComplianceStateNamesForCountryResponseRetrieveComplianceStateNamesForCountryResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_RetrieveComplianceStateNamesForCountryResponseRetrieveComplianceStateNamesForCountryResult_QNAME, ArrayOfstring.class, RetrieveComplianceStateNamesForCountryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Country }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "countryDto", scope = RetrieveIftaStateNamesForCountry.class)
    public JAXBElement<Country> createRetrieveIftaStateNamesForCountryCountryDto(Country value) {
        return new JAXBElement<Country>(_RetrieveComplianceStateNamesForCountryCountryDto_QNAME, Country.class, RetrieveIftaStateNamesForCountry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveIftaStateNamesForCountryResult", scope = RetrieveIftaStateNamesForCountryResponse.class)
    public JAXBElement<ArrayOfstring> createRetrieveIftaStateNamesForCountryResponseRetrieveIftaStateNamesForCountryResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_RetrieveIftaStateNamesForCountryResponseRetrieveIftaStateNamesForCountryResult_QNAME, ArrayOfstring.class, RetrieveIftaStateNamesForCountryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplianceCompanySettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveComplianceCompanySettingsResult", scope = RetrieveComplianceCompanySettingsResponse.class)
    public JAXBElement<ComplianceCompanySettings> createRetrieveComplianceCompanySettingsResponseRetrieveComplianceCompanySettingsResult(ComplianceCompanySettings value) {
        return new JAXBElement<ComplianceCompanySettings>(_RetrieveComplianceCompanySettingsResponseRetrieveComplianceCompanySettingsResult_QNAME, ComplianceCompanySettings.class, RetrieveComplianceCompanySettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticTroubleCodeLibrary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveDiagnosticTroubleCodeLibraryResult", scope = RetrieveDiagnosticTroubleCodeLibraryResponse.class)
    public JAXBElement<DiagnosticTroubleCodeLibrary> createRetrieveDiagnosticTroubleCodeLibraryResponseRetrieveDiagnosticTroubleCodeLibraryResult(DiagnosticTroubleCodeLibrary value) {
        return new JAXBElement<DiagnosticTroubleCodeLibrary>(_RetrieveDiagnosticTroubleCodeLibraryResponseRetrieveDiagnosticTroubleCodeLibraryResult_QNAME, DiagnosticTroubleCodeLibrary.class, RetrieveDiagnosticTroubleCodeLibraryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveEquipmentMaintenanceInfo.class)
    public JAXBElement<RegionContext> createRetrieveEquipmentMaintenanceInfoRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveEquipmentMaintenanceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentMaintenanceInfoRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveEquipmentMaintenanceInfo.class)
    public JAXBElement<EquipmentMaintenanceInfoRetrievalOptions> createRetrieveEquipmentMaintenanceInfoOptions(EquipmentMaintenanceInfoRetrievalOptions value) {
        return new JAXBElement<EquipmentMaintenanceInfoRetrievalOptions>(_MultiRetrieveOptions_QNAME, EquipmentMaintenanceInfoRetrievalOptions.class, RetrieveEquipmentMaintenanceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentMaintenanceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEquipmentMaintenanceInfoResult", scope = RetrieveEquipmentMaintenanceInfoResponse.class)
    public JAXBElement<ArrayOfEquipmentMaintenanceInfo> createRetrieveEquipmentMaintenanceInfoResponseRetrieveEquipmentMaintenanceInfoResult(ArrayOfEquipmentMaintenanceInfo value) {
        return new JAXBElement<ArrayOfEquipmentMaintenanceInfo>(_RetrieveEquipmentMaintenanceInfoResponseRetrieveEquipmentMaintenanceInfoResult_QNAME, ArrayOfEquipmentMaintenanceInfo.class, RetrieveEquipmentMaintenanceInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveEquipmentStatus.class)
    public JAXBElement<RegionContext> createRetrieveEquipmentStatusRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveEquipmentStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEquipmentStatusOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveEquipmentStatus.class)
    public JAXBElement<RetrieveEquipmentStatusOptions> createRetrieveEquipmentStatusOptions(RetrieveEquipmentStatusOptions value) {
        return new JAXBElement<RetrieveEquipmentStatusOptions>(_MultiRetrieveOptions_QNAME, RetrieveEquipmentStatusOptions.class, RetrieveEquipmentStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEquipmentStatusResult", scope = RetrieveEquipmentStatusResponse.class)
    public JAXBElement<ArrayOfEquipmentStatus> createRetrieveEquipmentStatusResponseRetrieveEquipmentStatusResult(ArrayOfEquipmentStatus value) {
        return new JAXBElement<ArrayOfEquipmentStatus>(_RetrieveEquipmentStatusResponseRetrieveEquipmentStatusResult_QNAME, ArrayOfEquipmentStatus.class, RetrieveEquipmentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEquipmentPositionUpdatesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveEquipmentPositionUpdates.class)
    public JAXBElement<RetrieveEquipmentPositionUpdatesOptions> createRetrieveEquipmentPositionUpdatesOptions(RetrieveEquipmentPositionUpdatesOptions value) {
        return new JAXBElement<RetrieveEquipmentPositionUpdatesOptions>(_MultiRetrieveOptions_QNAME, RetrieveEquipmentPositionUpdatesOptions.class, RetrieveEquipmentPositionUpdates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEquipmentPositionUpdatesResult", scope = RetrieveEquipmentPositionUpdatesResponse.class)
    public JAXBElement<ArrayOfEquipmentPosition> createRetrieveEquipmentPositionUpdatesResponseRetrieveEquipmentPositionUpdatesResult(ArrayOfEquipmentPosition value) {
        return new JAXBElement<ArrayOfEquipmentPosition>(_RetrieveEquipmentPositionUpdatesResponseRetrieveEquipmentPositionUpdatesResult_QNAME, ArrayOfEquipmentPosition.class, RetrieveEquipmentPositionUpdatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEquipmentDataHistoryOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveEquipmentDataHistory.class)
    public JAXBElement<RetrieveEquipmentDataHistoryOptions> createRetrieveEquipmentDataHistoryOptions(RetrieveEquipmentDataHistoryOptions value) {
        return new JAXBElement<RetrieveEquipmentDataHistoryOptions>(_MultiRetrieveOptions_QNAME, RetrieveEquipmentDataHistoryOptions.class, RetrieveEquipmentDataHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDataHistoryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEquipmentDataHistoryResult", scope = RetrieveEquipmentDataHistoryResponse.class)
    public JAXBElement<EquipmentDataHistoryResult> createRetrieveEquipmentDataHistoryResponseRetrieveEquipmentDataHistoryResult(EquipmentDataHistoryResult value) {
        return new JAXBElement<EquipmentDataHistoryResult>(_RetrieveEquipmentDataHistoryResponseRetrieveEquipmentDataHistoryResult_QNAME, EquipmentDataHistoryResult.class, RetrieveEquipmentDataHistoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalRetrieveEquipmentDataHistoryEncodedOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = InternalRetrieveEquipmentDataHistoryEncoded.class)
    public JAXBElement<InternalRetrieveEquipmentDataHistoryEncodedOptions> createInternalRetrieveEquipmentDataHistoryEncodedOptions(InternalRetrieveEquipmentDataHistoryEncodedOptions value) {
        return new JAXBElement<InternalRetrieveEquipmentDataHistoryEncodedOptions>(_MultiRetrieveOptions_QNAME, InternalRetrieveEquipmentDataHistoryEncodedOptions.class, InternalRetrieveEquipmentDataHistoryEncoded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDataHistoryEncodedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "InternalRetrieveEquipmentDataHistoryEncodedResult", scope = InternalRetrieveEquipmentDataHistoryEncodedResponse.class)
    public JAXBElement<EquipmentDataHistoryEncodedResult> createInternalRetrieveEquipmentDataHistoryEncodedResponseInternalRetrieveEquipmentDataHistoryEncodedResult(EquipmentDataHistoryEncodedResult value) {
        return new JAXBElement<EquipmentDataHistoryEncodedResult>(_InternalRetrieveEquipmentDataHistoryEncodedResponseInternalRetrieveEquipmentDataHistoryEncodedResult_QNAME, EquipmentDataHistoryEncodedResult.class, InternalRetrieveEquipmentDataHistoryEncodedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePositionHistoryReportOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrievePositionHistoryReport.class)
    public JAXBElement<RetrievePositionHistoryReportOptions> createRetrievePositionHistoryReportOptions(RetrievePositionHistoryReportOptions value) {
        return new JAXBElement<RetrievePositionHistoryReportOptions>(_MultiRetrieveOptions_QNAME, RetrievePositionHistoryReportOptions.class, RetrievePositionHistoryReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrievePositionHistoryReportResult", scope = RetrievePositionHistoryReportResponse.class)
    public JAXBElement<byte[]> createRetrievePositionHistoryReportResponseRetrievePositionHistoryReportResult(byte[] value) {
        return new JAXBElement<byte[]>(_RetrievePositionHistoryReportResponseRetrievePositionHistoryReportResult_QNAME, byte[].class, RetrievePositionHistoryReportResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEquipmentPositionHistoryOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveEquipmentPositionHistory.class)
    public JAXBElement<RetrieveEquipmentPositionHistoryOptions> createRetrieveEquipmentPositionHistoryOptions(RetrieveEquipmentPositionHistoryOptions value) {
        return new JAXBElement<RetrieveEquipmentPositionHistoryOptions>(_MultiRetrieveOptions_QNAME, RetrieveEquipmentPositionHistoryOptions.class, RetrieveEquipmentPositionHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentPositionHistoryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEquipmentPositionHistoryResult", scope = RetrieveEquipmentPositionHistoryResponse.class)
    public JAXBElement<EquipmentPositionHistoryResult> createRetrieveEquipmentPositionHistoryResponseRetrieveEquipmentPositionHistoryResult(EquipmentPositionHistoryResult value) {
        return new JAXBElement<EquipmentPositionHistoryResult>(_RetrieveEquipmentPositionHistoryResponseRetrieveEquipmentPositionHistoryResult_QNAME, EquipmentPositionHistoryResult.class, RetrieveEquipmentPositionHistoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveWorkerComplianceStatusOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveWorkerComplianceStatuses.class)
    public JAXBElement<RetrieveWorkerComplianceStatusOptions> createRetrieveWorkerComplianceStatusesOptions(RetrieveWorkerComplianceStatusOptions value) {
        return new JAXBElement<RetrieveWorkerComplianceStatusOptions>(_MultiRetrieveOptions_QNAME, RetrieveWorkerComplianceStatusOptions.class, RetrieveWorkerComplianceStatuses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkerComplianceStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveWorkerComplianceStatusesResult", scope = RetrieveWorkerComplianceStatusesResponse.class)
    public JAXBElement<ArrayOfWorkerComplianceStatus> createRetrieveWorkerComplianceStatusesResponseRetrieveWorkerComplianceStatusesResult(ArrayOfWorkerComplianceStatus value) {
        return new JAXBElement<ArrayOfWorkerComplianceStatus>(_RetrieveWorkerComplianceStatusesResponseRetrieveWorkerComplianceStatusesResult_QNAME, ArrayOfWorkerComplianceStatus.class, RetrieveWorkerComplianceStatusesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveEquipmentStatusDetails.class)
    public JAXBElement<RegionContext> createRetrieveEquipmentStatusDetailsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveEquipmentStatusDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEquipmentStatusDetailsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveEquipmentStatusDetails.class)
    public JAXBElement<RetrieveEquipmentStatusDetailsOptions> createRetrieveEquipmentStatusDetailsOptions(RetrieveEquipmentStatusDetailsOptions value) {
        return new JAXBElement<RetrieveEquipmentStatusDetailsOptions>(_MultiRetrieveOptions_QNAME, RetrieveEquipmentStatusDetailsOptions.class, RetrieveEquipmentStatusDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEquipmentStatusDetailsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEquipmentStatusDetailsResult", scope = RetrieveEquipmentStatusDetailsResponse.class)
    public JAXBElement<RetrieveEquipmentStatusDetailsResults> createRetrieveEquipmentStatusDetailsResponseRetrieveEquipmentStatusDetailsResult(RetrieveEquipmentStatusDetailsResults value) {
        return new JAXBElement<RetrieveEquipmentStatusDetailsResults>(_RetrieveEquipmentStatusDetailsResponseRetrieveEquipmentStatusDetailsResult_QNAME, RetrieveEquipmentStatusDetailsResults.class, RetrieveEquipmentStatusDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveEquipmentStatusDetailsByKeys.class)
    public JAXBElement<RegionContext> createRetrieveEquipmentStatusDetailsByKeysRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveEquipmentStatusDetailsByKeys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "equipmentEntityKeys", scope = RetrieveEquipmentStatusDetailsByKeys.class)
    public JAXBElement<ArrayOflong> createRetrieveEquipmentStatusDetailsByKeysEquipmentEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RetrieveEquipmentStatusDetailsByKeysEquipmentEntityKeys_QNAME, ArrayOflong.class, RetrieveEquipmentStatusDetailsByKeys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentStatusDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEquipmentStatusDetailsByKeysResult", scope = RetrieveEquipmentStatusDetailsByKeysResponse.class)
    public JAXBElement<ArrayOfEquipmentStatusDetails> createRetrieveEquipmentStatusDetailsByKeysResponseRetrieveEquipmentStatusDetailsByKeysResult(ArrayOfEquipmentStatusDetails value) {
        return new JAXBElement<ArrayOfEquipmentStatusDetails>(_RetrieveEquipmentStatusDetailsByKeysResponseRetrieveEquipmentStatusDetailsByKeysResult_QNAME, ArrayOfEquipmentStatusDetails.class, RetrieveEquipmentStatusDetailsByKeysResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveStopTemplates.class)
    public JAXBElement<RegionContext> createRetrieveStopTemplatesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceableStopTemplateRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = RetrieveStopTemplates.class)
    public JAXBElement<ServiceableStopTemplateRetrievalOptions> createRetrieveStopTemplatesRetrievalOptions(ServiceableStopTemplateRetrievalOptions value) {
        return new JAXBElement<ServiceableStopTemplateRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ServiceableStopTemplateRetrievalOptions.class, RetrieveStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveStopTemplateResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveStopTemplatesResult", scope = RetrieveStopTemplatesResponse.class)
    public JAXBElement<RetrieveStopTemplateResults> createRetrieveStopTemplatesResponseRetrieveStopTemplatesResult(RetrieveStopTemplateResults value) {
        return new JAXBElement<RetrieveStopTemplateResults>(_RetrieveStopTemplatesResponseRetrieveStopTemplatesResult_QNAME, RetrieveStopTemplateResults.class, RetrieveStopTemplatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = GetPreviousRoute.class)
    public JAXBElement<RegionContext> createGetPreviousRouteRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, GetPreviousRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextOrPreviousRouteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = GetPreviousRoute.class)
    public JAXBElement<GetNextOrPreviousRouteOptions> createGetPreviousRouteOptions(GetNextOrPreviousRouteOptions value) {
        return new JAXBElement<GetNextOrPreviousRouteOptions>(_MultiRetrieveOptions_QNAME, GetNextOrPreviousRouteOptions.class, GetPreviousRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "GetPreviousRouteResult", scope = GetPreviousRouteResponse.class)
    public JAXBElement<Route> createGetPreviousRouteResponseGetPreviousRouteResult(Route value) {
        return new JAXBElement<Route>(_GetPreviousRouteResponseGetPreviousRouteResult_QNAME, Route.class, GetPreviousRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = GetNextRoute.class)
    public JAXBElement<RegionContext> createGetNextRouteRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, GetNextRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextOrPreviousRouteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = GetNextRoute.class)
    public JAXBElement<GetNextOrPreviousRouteOptions> createGetNextRouteOptions(GetNextOrPreviousRouteOptions value) {
        return new JAXBElement<GetNextOrPreviousRouteOptions>(_MultiRetrieveOptions_QNAME, GetNextOrPreviousRouteOptions.class, GetNextRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "GetNextRouteResult", scope = GetNextRouteResponse.class)
    public JAXBElement<Route> createGetNextRouteResponseGetNextRouteResult(Route value) {
        return new JAXBElement<Route>(_GetNextRouteResponseGetNextRouteResult_QNAME, Route.class, GetNextRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = SearchEquipmentStatusDetails.class)
    public JAXBElement<RegionContext> createSearchEquipmentStatusDetailsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, SearchEquipmentStatusDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEquipmentStatusDetailsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = SearchEquipmentStatusDetails.class)
    public JAXBElement<SearchEquipmentStatusDetailsOptions> createSearchEquipmentStatusDetailsOptions(SearchEquipmentStatusDetailsOptions value) {
        return new JAXBElement<SearchEquipmentStatusDetailsOptions>(_MultiRetrieveOptions_QNAME, SearchEquipmentStatusDetailsOptions.class, SearchEquipmentStatusDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEquipmentStatusDetailsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SearchEquipmentStatusDetailsResult", scope = SearchEquipmentStatusDetailsResponse.class)
    public JAXBElement<RetrieveEquipmentStatusDetailsResults> createSearchEquipmentStatusDetailsResponseSearchEquipmentStatusDetailsResult(RetrieveEquipmentStatusDetailsResults value) {
        return new JAXBElement<RetrieveEquipmentStatusDetailsResults>(_SearchEquipmentStatusDetailsResponseSearchEquipmentStatusDetailsResult_QNAME, RetrieveEquipmentStatusDetailsResults.class, SearchEquipmentStatusDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoadnetTelematicsFirmwareVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveAvailableFirmwareVersionsResult", scope = RetrieveAvailableFirmwareVersionsResponse.class)
    public JAXBElement<ArrayOfRoadnetTelematicsFirmwareVersion> createRetrieveAvailableFirmwareVersionsResponseRetrieveAvailableFirmwareVersionsResult(ArrayOfRoadnetTelematicsFirmwareVersion value) {
        return new JAXBElement<ArrayOfRoadnetTelematicsFirmwareVersion>(_RetrieveAvailableFirmwareVersionsResponseRetrieveAvailableFirmwareVersionsResult_QNAME, ArrayOfRoadnetTelematicsFirmwareVersion.class, RetrieveAvailableFirmwareVersionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoadnetTelematicsScriptVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveAvailableScriptVersionsResult", scope = RetrieveAvailableScriptVersionsResponse.class)
    public JAXBElement<ArrayOfRoadnetTelematicsScriptVersion> createRetrieveAvailableScriptVersionsResponseRetrieveAvailableScriptVersionsResult(ArrayOfRoadnetTelematicsScriptVersion value) {
        return new JAXBElement<ArrayOfRoadnetTelematicsScriptVersion>(_RetrieveAvailableScriptVersionsResponseRetrieveAvailableScriptVersionsResult_QNAME, ArrayOfRoadnetTelematicsScriptVersion.class, RetrieveAvailableScriptVersionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoadnetTelematicsVbusFileVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveAvailableVbusFileVersionsResult", scope = RetrieveAvailableVbusFileVersionsResponse.class)
    public JAXBElement<ArrayOfRoadnetTelematicsVbusFileVersion> createRetrieveAvailableVbusFileVersionsResponseRetrieveAvailableVbusFileVersionsResult(ArrayOfRoadnetTelematicsVbusFileVersion value) {
        return new JAXBElement<ArrayOfRoadnetTelematicsVbusFileVersion>(_RetrieveAvailableVbusFileVersionsResponseRetrieveAvailableVbusFileVersionsResult_QNAME, ArrayOfRoadnetTelematicsVbusFileVersion.class, RetrieveAvailableVbusFileVersionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveTelematicsDeviceStatuses.class)
    public JAXBElement<RegionContext> createRetrieveTelematicsDeviceStatusesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveTelematicsDeviceStatuses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveTelematicsDeviceStatusesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveTelematicsDeviceStatuses.class)
    public JAXBElement<RetrieveTelematicsDeviceStatusesOptions> createRetrieveTelematicsDeviceStatusesOptions(RetrieveTelematicsDeviceStatusesOptions value) {
        return new JAXBElement<RetrieveTelematicsDeviceStatusesOptions>(_MultiRetrieveOptions_QNAME, RetrieveTelematicsDeviceStatusesOptions.class, RetrieveTelematicsDeviceStatuses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveTelematicsDeviceStatusesResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveTelematicsDeviceStatusesResult", scope = RetrieveTelematicsDeviceStatusesResponse.class)
    public JAXBElement<RetrieveTelematicsDeviceStatusesResults> createRetrieveTelematicsDeviceStatusesResponseRetrieveTelematicsDeviceStatusesResult(RetrieveTelematicsDeviceStatusesResults value) {
        return new JAXBElement<RetrieveTelematicsDeviceStatusesResults>(_RetrieveTelematicsDeviceStatusesResponseRetrieveTelematicsDeviceStatusesResult_QNAME, RetrieveTelematicsDeviceStatusesResults.class, RetrieveTelematicsDeviceStatusesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveTeleamticsDeviceStatusByKey.class)
    public JAXBElement<RegionContext> createRetrieveTeleamticsDeviceStatusByKeyRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveTeleamticsDeviceStatusByKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveTeleamticsDeviceStatusByKeyResult", scope = RetrieveTeleamticsDeviceStatusByKeyResponse.class)
    public JAXBElement<TelematicsDeviceStatus> createRetrieveTeleamticsDeviceStatusByKeyResponseRetrieveTeleamticsDeviceStatusByKeyResult(TelematicsDeviceStatus value) {
        return new JAXBElement<TelematicsDeviceStatus>(_RetrieveTeleamticsDeviceStatusByKeyResponseRetrieveTeleamticsDeviceStatusByKeyResult_QNAME, TelematicsDeviceStatus.class, RetrieveTeleamticsDeviceStatusByKeyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveMobileDeviceStatuses.class)
    public JAXBElement<RegionContext> createRetrieveMobileDeviceStatusesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveMobileDeviceStatuses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMobileDeviceStatusesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveMobileDeviceStatuses.class)
    public JAXBElement<RetrieveMobileDeviceStatusesOptions> createRetrieveMobileDeviceStatusesOptions(RetrieveMobileDeviceStatusesOptions value) {
        return new JAXBElement<RetrieveMobileDeviceStatusesOptions>(_MultiRetrieveOptions_QNAME, RetrieveMobileDeviceStatusesOptions.class, RetrieveMobileDeviceStatuses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMobileDeviceStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveMobileDeviceStatusesResult", scope = RetrieveMobileDeviceStatusesResponse.class)
    public JAXBElement<ArrayOfMobileDeviceStatus> createRetrieveMobileDeviceStatusesResponseRetrieveMobileDeviceStatusesResult(ArrayOfMobileDeviceStatus value) {
        return new JAXBElement<ArrayOfMobileDeviceStatus>(_RetrieveMobileDeviceStatusesResponseRetrieveMobileDeviceStatusesResult_QNAME, ArrayOfMobileDeviceStatus.class, RetrieveMobileDeviceStatusesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveMobileDeviceStatusByKey.class)
    public JAXBElement<RegionContext> createRetrieveMobileDeviceStatusByKeyRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveMobileDeviceStatusByKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileDeviceStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveMobileDeviceStatusByKeyResult", scope = RetrieveMobileDeviceStatusByKeyResponse.class)
    public JAXBElement<MobileDeviceStatus> createRetrieveMobileDeviceStatusByKeyResponseRetrieveMobileDeviceStatusByKeyResult(MobileDeviceStatus value) {
        return new JAXBElement<MobileDeviceStatus>(_RetrieveMobileDeviceStatusByKeyResponseRetrieveMobileDeviceStatusByKeyResult_QNAME, MobileDeviceStatus.class, RetrieveMobileDeviceStatusByKeyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDataFeedStatusOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveDataFeedStatus.class)
    public JAXBElement<RetrieveDataFeedStatusOptions> createRetrieveDataFeedStatusOptions(RetrieveDataFeedStatusOptions value) {
        return new JAXBElement<RetrieveDataFeedStatusOptions>(_MultiRetrieveOptions_QNAME, RetrieveDataFeedStatusOptions.class, RetrieveDataFeedStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDataFeedStatusResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveDataFeedStatusResult", scope = RetrieveDataFeedStatusResponse.class)
    public JAXBElement<RetrieveDataFeedStatusResult> createRetrieveDataFeedStatusResponseRetrieveDataFeedStatusResult(RetrieveDataFeedStatusResult value) {
        return new JAXBElement<RetrieveDataFeedStatusResult>(_RetrieveDataFeedStatusResponseRetrieveDataFeedStatusResult_QNAME, RetrieveDataFeedStatusResult.class, RetrieveDataFeedStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveNavRecalculationDetails.class)
    public JAXBElement<RegionContext> createRetrieveNavRecalculationDetailsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveNavRecalculationDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNavRecalculationDetailsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveNavRecalculationDetails.class)
    public JAXBElement<RetrieveNavRecalculationDetailsOptions> createRetrieveNavRecalculationDetailsOptions(RetrieveNavRecalculationDetailsOptions value) {
        return new JAXBElement<RetrieveNavRecalculationDetailsOptions>(_MultiRetrieveOptions_QNAME, RetrieveNavRecalculationDetailsOptions.class, RetrieveNavRecalculationDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNavRecalculationDetailsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveNavRecalculationDetailsResult", scope = RetrieveNavRecalculationDetailsResponse.class)
    public JAXBElement<RetrieveNavRecalculationDetailsResult> createRetrieveNavRecalculationDetailsResponseRetrieveNavRecalculationDetailsResult(RetrieveNavRecalculationDetailsResult value) {
        return new JAXBElement<RetrieveNavRecalculationDetailsResult>(_RetrieveNavRecalculationDetailsResponseRetrieveNavRecalculationDetailsResult_QNAME, RetrieveNavRecalculationDetailsResult.class, RetrieveNavRecalculationDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveUserSettingsResult", scope = RetrieveUserSettingsResponse.class)
    public JAXBElement<UserSettings> createRetrieveUserSettingsResponseRetrieveUserSettingsResult(UserSettings value) {
        return new JAXBElement<UserSettings>(_RetrieveUserSettingsResponseRetrieveUserSettingsResult_QNAME, UserSettings.class, RetrieveUserSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrievePerformanceMonitoringInfo.class)
    public JAXBElement<RegionContext> createRetrievePerformanceMonitoringInfoRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrievePerformanceMonitoringInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePerformanceMonitoringInfoOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrievePerformanceMonitoringInfo.class)
    public JAXBElement<RetrievePerformanceMonitoringInfoOptions> createRetrievePerformanceMonitoringInfoOptions(RetrievePerformanceMonitoringInfoOptions value) {
        return new JAXBElement<RetrievePerformanceMonitoringInfoOptions>(_MultiRetrieveOptions_QNAME, RetrievePerformanceMonitoringInfoOptions.class, RetrievePerformanceMonitoringInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePerformanceMonitoringInfoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrievePerformanceMonitoringInfoResult", scope = RetrievePerformanceMonitoringInfoResponse.class)
    public JAXBElement<RetrievePerformanceMonitoringInfoResult> createRetrievePerformanceMonitoringInfoResponseRetrievePerformanceMonitoringInfoResult(RetrievePerformanceMonitoringInfoResult value) {
        return new JAXBElement<RetrievePerformanceMonitoringInfoResult>(_RetrievePerformanceMonitoringInfoResponseRetrievePerformanceMonitoringInfoResult_QNAME, RetrievePerformanceMonitoringInfoResult.class, RetrievePerformanceMonitoringInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveEquipmentTelematicsDeviceAssociation.class)
    public JAXBElement<RegionContext> createRetrieveEquipmentTelematicsDeviceAssociationRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveEquipmentTelematicsDeviceAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupEquipmentOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveEquipmentTelematicsDeviceAssociation.class)
    public JAXBElement<LookupEquipmentOptions> createRetrieveEquipmentTelematicsDeviceAssociationOptions(LookupEquipmentOptions value) {
        return new JAXBElement<LookupEquipmentOptions>(_MultiRetrieveOptions_QNAME, LookupEquipmentOptions.class, RetrieveEquipmentTelematicsDeviceAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupEquipmentResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEquipmentTelematicsDeviceAssociationResult", scope = RetrieveEquipmentTelematicsDeviceAssociationResponse.class)
    public JAXBElement<LookupEquipmentResult> createRetrieveEquipmentTelematicsDeviceAssociationResponseRetrieveEquipmentTelematicsDeviceAssociationResult(LookupEquipmentResult value) {
        return new JAXBElement<LookupEquipmentResult>(_RetrieveEquipmentTelematicsDeviceAssociationResponseRetrieveEquipmentTelematicsDeviceAssociationResult_QNAME, LookupEquipmentResult.class, RetrieveEquipmentTelematicsDeviceAssociationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveRoutePositions.class)
    public JAXBElement<RegionContext> createRetrieveRoutePositionsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveRoutePositions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveRoutePositions.class)
    public JAXBElement<RetrievalOptions> createRetrieveRoutePositionsOptions(RetrievalOptions value) {
        return new JAXBElement<RetrievalOptions>(_MultiRetrieveOptions_QNAME, RetrievalOptions.class, RetrieveRoutePositions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutePosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveRoutePositionsResult", scope = RetrieveRoutePositionsResponse.class)
    public JAXBElement<ArrayOfRoutePosition> createRetrieveRoutePositionsResponseRetrieveRoutePositionsResult(ArrayOfRoutePosition value) {
        return new JAXBElement<ArrayOfRoutePosition>(_RetrieveRoutePositionsResponseRetrieveRoutePositionsResult_QNAME, ArrayOfRoutePosition.class, RetrieveRoutePositionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveDefaultResourceExceptionRules.class)
    public JAXBElement<RegionContext> createRetrieveDefaultResourceExceptionRulesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveDefaultResourceExceptionRules.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceExceptionRuleEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveDefaultResourceExceptionRulesResult", scope = RetrieveDefaultResourceExceptionRulesResponse.class)
    public JAXBElement<ArrayOfResourceExceptionRuleEx> createRetrieveDefaultResourceExceptionRulesResponseRetrieveDefaultResourceExceptionRulesResult(ArrayOfResourceExceptionRuleEx value) {
        return new JAXBElement<ArrayOfResourceExceptionRuleEx>(_RetrieveDefaultResourceExceptionRulesResponseRetrieveDefaultResourceExceptionRulesResult_QNAME, ArrayOfResourceExceptionRuleEx.class, RetrieveDefaultResourceExceptionRulesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveWorkerOverview.class)
    public JAXBElement<RegionContext> createRetrieveWorkerOverviewRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveWorkerOverview.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveWorkerOverviewOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveWorkerOverview.class)
    public JAXBElement<RetrieveWorkerOverviewOptions> createRetrieveWorkerOverviewOptions(RetrieveWorkerOverviewOptions value) {
        return new JAXBElement<RetrieveWorkerOverviewOptions>(_MultiRetrieveOptions_QNAME, RetrieveWorkerOverviewOptions.class, RetrieveWorkerOverview.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveWorkerOverviewResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveWorkerOverviewResult", scope = RetrieveWorkerOverviewResponse.class)
    public JAXBElement<RetrieveWorkerOverviewResult> createRetrieveWorkerOverviewResponseRetrieveWorkerOverviewResult(RetrieveWorkerOverviewResult value) {
        return new JAXBElement<RetrieveWorkerOverviewResult>(_RetrieveWorkerOverviewResponseRetrieveWorkerOverviewResult_QNAME, RetrieveWorkerOverviewResult.class, RetrieveWorkerOverviewResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveOperationalMetrics.class)
    public JAXBElement<RegionContext> createRetrieveOperationalMetricsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveOperationalMetrics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveOperationalMetricsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveOperationalMetrics.class)
    public JAXBElement<RetrieveOperationalMetricsOptions> createRetrieveOperationalMetricsOptions(RetrieveOperationalMetricsOptions value) {
        return new JAXBElement<RetrieveOperationalMetricsOptions>(_MultiRetrieveOptions_QNAME, RetrieveOperationalMetricsOptions.class, RetrieveOperationalMetrics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationalMetrics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveOperationalMetricsResult", scope = RetrieveOperationalMetricsResponse.class)
    public JAXBElement<OperationalMetrics> createRetrieveOperationalMetricsResponseRetrieveOperationalMetricsResult(OperationalMetrics value) {
        return new JAXBElement<OperationalMetrics>(_RetrieveOperationalMetricsResponseRetrieveOperationalMetricsResult_QNAME, OperationalMetrics.class, RetrieveOperationalMetricsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPlanningLicenseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveCustomerPlanningLicenseInfoResult", scope = RetrieveCustomerPlanningLicenseInfoResponse.class)
    public JAXBElement<CustomerPlanningLicenseInfo> createRetrieveCustomerPlanningLicenseInfoResponseRetrieveCustomerPlanningLicenseInfoResult(CustomerPlanningLicenseInfo value) {
        return new JAXBElement<CustomerPlanningLicenseInfo>(_RetrieveCustomerPlanningLicenseInfoResponseRetrieveCustomerPlanningLicenseInfoResult_QNAME, CustomerPlanningLicenseInfo.class, RetrieveCustomerPlanningLicenseInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveEquipmentOverviewList.class)
    public JAXBElement<RegionContext> createRetrieveEquipmentOverviewListRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveEquipmentOverviewList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEquipmentOverviewListOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveEquipmentOverviewList.class)
    public JAXBElement<RetrieveEquipmentOverviewListOptions> createRetrieveEquipmentOverviewListOptions(RetrieveEquipmentOverviewListOptions value) {
        return new JAXBElement<RetrieveEquipmentOverviewListOptions>(_MultiRetrieveOptions_QNAME, RetrieveEquipmentOverviewListOptions.class, RetrieveEquipmentOverviewList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEquipmentOverviewListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEquipmentOverviewListResult", scope = RetrieveEquipmentOverviewListResponse.class)
    public JAXBElement<RetrieveEquipmentOverviewListResult> createRetrieveEquipmentOverviewListResponseRetrieveEquipmentOverviewListResult(RetrieveEquipmentOverviewListResult value) {
        return new JAXBElement<RetrieveEquipmentOverviewListResult>(_RetrieveEquipmentOverviewListResponseRetrieveEquipmentOverviewListResult_QNAME, RetrieveEquipmentOverviewListResult.class, RetrieveEquipmentOverviewListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "mobileDeviceIdentifier", scope = RetrieveRelevantDownloadableClientApplicationVersions.class)
    public JAXBElement<String> createRetrieveRelevantDownloadableClientApplicationVersionsMobileDeviceIdentifier(String value) {
        return new JAXBElement<String>(_RetrieveRelevantDownloadableClientApplicationVersionsMobileDeviceIdentifier_QNAME, String.class, RetrieveRelevantDownloadableClientApplicationVersions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClientApplicationVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveRelevantDownloadableClientApplicationVersionsResult", scope = RetrieveRelevantDownloadableClientApplicationVersionsResponse.class)
    public JAXBElement<ArrayOfClientApplicationVersion> createRetrieveRelevantDownloadableClientApplicationVersionsResponseRetrieveRelevantDownloadableClientApplicationVersionsResult(ArrayOfClientApplicationVersion value) {
        return new JAXBElement<ArrayOfClientApplicationVersion>(_RetrieveRelevantDownloadableClientApplicationVersionsResponseRetrieveRelevantDownloadableClientApplicationVersionsResult_QNAME, ArrayOfClientApplicationVersion.class, RetrieveRelevantDownloadableClientApplicationVersionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondencePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "propertyOptions", scope = RetrieveTrashCorrespondence.class)
    public JAXBElement<CorrespondencePropertyOptions> createRetrieveTrashCorrespondencePropertyOptions(CorrespondencePropertyOptions value) {
        return new JAXBElement<CorrespondencePropertyOptions>(_RetrieveTrashCorrespondencePropertyOptions_QNAME, CorrespondencePropertyOptions.class, RetrieveTrashCorrespondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCorrespondenceArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "args", scope = RetrieveTrashCorrespondence.class)
    public JAXBElement<RetrieveCorrespondenceArgs> createRetrieveTrashCorrespondenceArgs(RetrieveCorrespondenceArgs value) {
        return new JAXBElement<RetrieveCorrespondenceArgs>(_RetrieveServiceLocationServiceStatisticsArgs_QNAME, RetrieveCorrespondenceArgs.class, RetrieveTrashCorrespondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCorrespondence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveTrashCorrespondenceResult", scope = RetrieveTrashCorrespondenceResponse.class)
    public JAXBElement<ArrayOfCorrespondence> createRetrieveTrashCorrespondenceResponseRetrieveTrashCorrespondenceResult(ArrayOfCorrespondence value) {
        return new JAXBElement<ArrayOfCorrespondence>(_RetrieveTrashCorrespondenceResponseRetrieveTrashCorrespondenceResult_QNAME, ArrayOfCorrespondence.class, RetrieveTrashCorrespondenceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCorrespondenceForWorkerOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveCorrespondenceForWorker.class)
    public JAXBElement<RetrieveCorrespondenceForWorkerOptions> createRetrieveCorrespondenceForWorkerOptions(RetrieveCorrespondenceForWorkerOptions value) {
        return new JAXBElement<RetrieveCorrespondenceForWorkerOptions>(_MultiRetrieveOptions_QNAME, RetrieveCorrespondenceForWorkerOptions.class, RetrieveCorrespondenceForWorker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCorrespondenceForWorkerResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveCorrespondenceForWorkerResult", scope = RetrieveCorrespondenceForWorkerResponse.class)
    public JAXBElement<RetrieveCorrespondenceForWorkerResult> createRetrieveCorrespondenceForWorkerResponseRetrieveCorrespondenceForWorkerResult(RetrieveCorrespondenceForWorkerResult value) {
        return new JAXBElement<RetrieveCorrespondenceForWorkerResult>(_RetrieveCorrespondenceForWorkerResponseRetrieveCorrespondenceForWorkerResult_QNAME, RetrieveCorrespondenceForWorkerResult.class, RetrieveCorrespondenceForWorkerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKpiQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "queries", scope = RetrieveKpis.class)
    public JAXBElement<ArrayOfKpiQuery> createRetrieveKpisQueries(ArrayOfKpiQuery value) {
        return new JAXBElement<ArrayOfKpiQuery>(_RetrieveKpisQueries_QNAME, ArrayOfKpiQuery.class, RetrieveKpis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiQueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveKpisResult", scope = RetrieveKpisResponse.class)
    public JAXBElement<KpiQueryResult> createRetrieveKpisResponseRetrieveKpisResult(KpiQueryResult value) {
        return new JAXBElement<KpiQueryResult>(_RetrieveKpisResponseRetrieveKpisResult_QNAME, KpiQueryResult.class, RetrieveKpisResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "kpiBaseDto", scope = RetrieveKpiData.class)
    public JAXBElement<DataWarehouseKpiBase> createRetrieveKpiDataKpiBaseDto(DataWarehouseKpiBase value) {
        return new JAXBElement<DataWarehouseKpiBase>(_RetrieveKpiDataKpiBaseDto_QNAME, DataWarehouseKpiBase.class, RetrieveKpiData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "measureUnitOptionsDto", scope = RetrieveKpiData.class)
    public JAXBElement<MeasureUnitOptions> createRetrieveKpiDataMeasureUnitOptionsDto(MeasureUnitOptions value) {
        return new JAXBElement<MeasureUnitOptions>(_RetrieveKpiDataMeasureUnitOptionsDto_QNAME, MeasureUnitOptions.class, RetrieveKpiData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveKpiDataResult", scope = RetrieveKpiDataResponse.class)
    public JAXBElement<DataWarehouseKpiResult> createRetrieveKpiDataResponseRetrieveKpiDataResult(DataWarehouseKpiResult value) {
        return new JAXBElement<DataWarehouseKpiResult>(_RetrieveKpiDataResponseRetrieveKpiDataResult_QNAME, DataWarehouseKpiResult.class, RetrieveKpiDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKpiQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "queries", scope = RetrieveKpiQueryResults.class)
    public JAXBElement<ArrayOfKpiQuery> createRetrieveKpiQueryResultsQueries(ArrayOfKpiQuery value) {
        return new JAXBElement<ArrayOfKpiQuery>(_RetrieveKpisQueries_QNAME, ArrayOfKpiQuery.class, RetrieveKpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiQueryResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveKpiQueryResultsResult", scope = RetrieveKpiQueryResultsResponse.class)
    public JAXBElement<KpiQueryResults> createRetrieveKpiQueryResultsResponseRetrieveKpiQueryResultsResult(KpiQueryResults value) {
        return new JAXBElement<KpiQueryResults>(_RetrieveKpiQueryResultsResponseRetrieveKpiQueryResultsResult_QNAME, KpiQueryResults.class, RetrieveKpiQueryResultsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiExecutionJobInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveKpiExecutionJobResultResult", scope = RetrieveKpiExecutionJobResultResponse.class)
    public JAXBElement<DataWarehouseKpiExecutionJobInfo> createRetrieveKpiExecutionJobResultResponseRetrieveKpiExecutionJobResultResult(DataWarehouseKpiExecutionJobInfo value) {
        return new JAXBElement<DataWarehouseKpiExecutionJobInfo>(_RetrieveKpiExecutionJobResultResponseRetrieveKpiExecutionJobResultResult_QNAME, DataWarehouseKpiExecutionJobInfo.class, RetrieveKpiExecutionJobResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveDataWarehouseMetadataResult", scope = RetrieveDataWarehouseMetadataResponse.class)
    public JAXBElement<DataWarehouseMetadata> createRetrieveDataWarehouseMetadataResponseRetrieveDataWarehouseMetadataResult(DataWarehouseMetadata value) {
        return new JAXBElement<DataWarehouseMetadata>(_RetrieveDataWarehouseMetadataResponseRetrieveDataWarehouseMetadataResult_QNAME, DataWarehouseMetadata.class, RetrieveDataWarehouseMetadataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeasureMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveAllMeasureMetadataResult", scope = RetrieveAllMeasureMetadataResponse.class)
    public JAXBElement<ArrayOfMeasureMetadata> createRetrieveAllMeasureMetadataResponseRetrieveAllMeasureMetadataResult(ArrayOfMeasureMetadata value) {
        return new JAXBElement<ArrayOfMeasureMetadata>(_RetrieveAllMeasureMetadataResponseRetrieveAllMeasureMetadataResult_QNAME, ArrayOfMeasureMetadata.class, RetrieveAllMeasureMetadataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "startDate", scope = GenerateDataWarehouseSampleData.class)
    public JAXBElement<XMLGregorianCalendar> createGenerateDataWarehouseSampleDataStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GenerateDataWarehouseSampleDataStartDate_QNAME, XMLGregorianCalendar.class, GenerateDataWarehouseSampleData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleDataGeneratorParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = GenerateSampleDataForDataWarehouse.class)
    public JAXBElement<SampleDataGeneratorParameters> createGenerateSampleDataForDataWarehouseParameters(SampleDataGeneratorParameters value) {
        return new JAXBElement<SampleDataGeneratorParameters>(_RetrieveDVIRResultsParameters_QNAME, SampleDataGeneratorParameters.class, GenerateSampleDataForDataWarehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ExportKpi.class)
    public JAXBElement<RegionContext> createExportKpiContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ExportKpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiExportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = ExportKpi.class)
    public JAXBElement<KpiExportParameters> createExportKpiParameters(KpiExportParameters value) {
        return new JAXBElement<KpiExportParameters>(_RetrieveDVIRResultsParameters_QNAME, KpiExportParameters.class, ExportKpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiExportJobInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "GetUserKpiExportsResult", scope = GetUserKpiExportsResponse.class)
    public JAXBElement<ArrayOfDataWarehouseKpiExportJobInfo> createGetUserKpiExportsResponseGetUserKpiExportsResult(ArrayOfDataWarehouseKpiExportJobInfo value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiExportJobInfo>(_GetUserKpiExportsResponseGetUserKpiExportsResult_QNAME, ArrayOfDataWarehouseKpiExportJobInfo.class, GetUserKpiExportsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiExportResultDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveKpiDownloadFileResult", scope = RetrieveKpiDownloadFileResponse.class)
    public JAXBElement<KpiExportResultDto> createRetrieveKpiDownloadFileResponseRetrieveKpiDownloadFileResult(KpiExportResultDto value) {
        return new JAXBElement<KpiExportResultDto>(_RetrieveKpiDownloadFileResponseRetrieveKpiDownloadFileResult_QNAME, KpiExportResultDto.class, RetrieveKpiDownloadFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "fileNames", scope = GetZippedClientLogFiles.class)
    public JAXBElement<ArrayOfstring> createGetZippedClientLogFilesFileNames(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetZippedClientLogFilesFileNames_QNAME, ArrayOfstring.class, GetZippedClientLogFiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "GetZippedClientLogFilesResult", scope = GetZippedClientLogFilesResponse.class)
    public JAXBElement<byte[]> createGetZippedClientLogFilesResponseGetZippedClientLogFilesResult(byte[] value) {
        return new JAXBElement<byte[]>(_GetZippedClientLogFilesResponseGetZippedClientLogFilesResult_QNAME, byte[].class, GetZippedClientLogFilesResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = SaveRoutePlan.class)
    public JAXBElement<RegionContext> createSaveRoutePlanRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, SaveRoutePlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRoutePlanRouteArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeArgs", scope = SaveRoutePlan.class)
    public JAXBElement<SaveRoutePlanRouteArgs> createSaveRoutePlanRouteArgs(SaveRoutePlanRouteArgs value) {
        return new JAXBElement<SaveRoutePlanRouteArgs>(_SaveRoutePlanRouteArgs_QNAME, SaveRoutePlanRouteArgs.class, SaveRoutePlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRoutePlanOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = SaveRoutePlan.class)
    public JAXBElement<SaveRoutePlanOptions> createSaveRoutePlanOptions(SaveRoutePlanOptions value) {
        return new JAXBElement<SaveRoutePlanOptions>(_MultiRetrieveOptions_QNAME, SaveRoutePlanOptions.class, SaveRoutePlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SaveRoutePlanResult", scope = SaveRoutePlanResponse.class)
    public JAXBElement<Route> createSaveRoutePlanResponseSaveRoutePlanResult(Route value) {
        return new JAXBElement<Route>(_SaveRoutePlanResponseSaveRoutePlanResult_QNAME, Route.class, SaveRoutePlanResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = CreateRouteFromPoints.class)
    public JAXBElement<RegionContext> createCreateRouteFromPointsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, CreateRouteFromPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRouteFromPointsArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = CreateRouteFromPoints.class)
    public JAXBElement<CreateRouteFromPointsArgs> createCreateRouteFromPointsOptions(CreateRouteFromPointsArgs value) {
        return new JAXBElement<CreateRouteFromPointsArgs>(_MultiRetrieveOptions_QNAME, CreateRouteFromPointsArgs.class, CreateRouteFromPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CreateRouteFromPointsResult", scope = CreateRouteFromPointsResponse.class)
    public JAXBElement<Route> createCreateRouteFromPointsResponseCreateRouteFromPointsResult(Route value) {
        return new JAXBElement<Route>(_CreateRouteFromPointsResponseCreateRouteFromPointsResult_QNAME, Route.class, CreateRouteFromPointsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateRouteFromPoints.class)
    public JAXBElement<RegionContext> createUpdateRouteFromPointsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateRouteFromPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRouteFromPointsArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = UpdateRouteFromPoints.class)
    public JAXBElement<UpdateRouteFromPointsArgs> createUpdateRouteFromPointsOptions(UpdateRouteFromPointsArgs value) {
        return new JAXBElement<UpdateRouteFromPointsArgs>(_MultiRetrieveOptions_QNAME, UpdateRouteFromPointsArgs.class, UpdateRouteFromPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateRouteFromPointsResult", scope = UpdateRouteFromPointsResponse.class)
    public JAXBElement<Route> createUpdateRouteFromPointsResponseUpdateRouteFromPointsResult(Route value) {
        return new JAXBElement<Route>(_UpdateRouteFromPointsResponseUpdateRouteFromPointsResult_QNAME, Route.class, UpdateRouteFromPointsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveResourcesToRegionParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = MoveResourcesToRegion.class)
    public JAXBElement<MoveResourcesToRegionParameters> createMoveResourcesToRegionParameters(MoveResourcesToRegionParameters value) {
        return new JAXBElement<MoveResourcesToRegionParameters>(_RetrieveDVIRResultsParameters_QNAME, MoveResourcesToRegionParameters.class, MoveResourcesToRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = Undelete.class)
    public JAXBElement<RegionContext> createUndeleteRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, Undelete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndeleteEntityOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = Undelete.class)
    public JAXBElement<UndeleteEntityOptions> createUndeleteOptions(UndeleteEntityOptions value) {
        return new JAXBElement<UndeleteEntityOptions>(_MultiRetrieveOptions_QNAME, UndeleteEntityOptions.class, Undelete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUndeleteEntityResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UndeleteResult", scope = UndeleteResponse.class)
    public JAXBElement<ArrayOfUndeleteEntityResult> createUndeleteResponseUndeleteResult(ArrayOfUndeleteEntityResult value) {
        return new JAXBElement<ArrayOfUndeleteEntityResult>(_UndeleteResponseUndeleteResult_QNAME, ArrayOfUndeleteEntityResult.class, UndeleteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeDataFeedOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = ResumeDataFeed.class)
    public JAXBElement<ResumeDataFeedOptions> createResumeDataFeedOptions(ResumeDataFeedOptions value) {
        return new JAXBElement<ResumeDataFeedOptions>(_MultiRetrieveOptions_QNAME, ResumeDataFeedOptions.class, ResumeDataFeed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeDataFeedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ResumeDataFeedResult", scope = ResumeDataFeedResponse.class)
    public JAXBElement<ResumeDataFeedResult> createResumeDataFeedResponseResumeDataFeedResult(ResumeDataFeedResult value) {
        return new JAXBElement<ResumeDataFeedResult>(_ResumeDataFeedResponseResumeDataFeedResult_QNAME, ResumeDataFeedResult.class, ResumeDataFeedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserSettingsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = UpdateUserSettings.class)
    public JAXBElement<UpdateUserSettingsParameters> createUpdateUserSettingsParameters(UpdateUserSettingsParameters value) {
        return new JAXBElement<UpdateUserSettingsParameters>(_RetrieveDVIRResultsParameters_QNAME, UpdateUserSettingsParameters.class, UpdateUserSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateRouteTender.class)
    public JAXBElement<RegionContext> createUpdateRouteTenderRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateRouteTender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRouteTenderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = UpdateRouteTender.class)
    public JAXBElement<UpdateRouteTenderOptions> createUpdateRouteTenderOptions(UpdateRouteTenderOptions value) {
        return new JAXBElement<UpdateRouteTenderOptions>(_MultiRetrieveOptions_QNAME, UpdateRouteTenderOptions.class, UpdateRouteTender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = SavePositions.class)
    public JAXBElement<RegionContext> createSavePositionsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, SavePositions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePositionsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = SavePositions.class)
    public JAXBElement<SavePositionsParameters> createSavePositionsParameters(SavePositionsParameters value) {
        return new JAXBElement<SavePositionsParameters>(_RetrieveDVIRResultsParameters_QNAME, SavePositionsParameters.class, SavePositions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CombineRoutes.class)
    public JAXBElement<RegionContext> createCombineRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CombineRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "destinationRouteInstance", scope = CombineRoutes.class)
    public JAXBElement<DomainInstance> createCombineRoutesDestinationRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_CombineRoutesDestinationRouteInstance_QNAME, DomainInstance.class, CombineRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "sourceRouteInstances", scope = CombineRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createCombineRoutesSourceRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_CombineRoutesSourceRouteInstances_QNAME, ArrayOfDomainInstance.class, CombineRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = CombineRoutes.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createCombineRoutesRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, CombineRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CombineRoutesResult", scope = CombineRoutesResponse.class)
    public JAXBElement<ManipulationResult> createCombineRoutesResponseCombineRoutesResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_CombineRoutesResponseCombineRoutesResult_QNAME, ManipulationResult.class, CombineRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SplitRoute.class)
    public JAXBElement<RegionContext> createSplitRouteContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SplitRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = SplitRoute.class)
    public JAXBElement<DomainInstance> createSplitRouteRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, SplitRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SplitRouteOptionsDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "splitRouteOptions", scope = SplitRoute.class)
    public JAXBElement<SplitRouteOptionsDto> createSplitRouteSplitRouteOptions(SplitRouteOptionsDto value) {
        return new JAXBElement<SplitRouteOptionsDto>(_SplitRouteSplitRouteOptions_QNAME, SplitRouteOptionsDto.class, SplitRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = SplitRoute.class)
    public JAXBElement<RouteRetrievalOptions> createSplitRouteRetrievalOptions(RouteRetrievalOptions value) {
        return new JAXBElement<RouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, RouteRetrievalOptions.class, SplitRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SplitRouteResult", scope = SplitRouteResponse.class)
    public JAXBElement<ManipulationResult> createSplitRouteResponseSplitRouteResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_SplitRouteResponseSplitRouteResult_QNAME, ManipulationResult.class, SplitRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveStops.class)
    public JAXBElement<RegionContext> createMoveStopsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = MoveStops.class)
    public JAXBElement<DomainInstance> createMoveStopsOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, MoveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopEntityKeys", scope = MoveStops.class)
    public JAXBElement<ArrayOflong> createMoveStopsStopEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveStopsStopEntityKeys_QNAME, ArrayOflong.class, MoveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveStops.class)
    public JAXBElement<Placement> createMoveStopsPlacement(Placement value) {
        return new JAXBElement<Placement>(_MoveStopsPlacement_QNAME, Placement.class, MoveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = MoveStops.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createMoveStopsRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, MoveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveStopsResult", scope = MoveStopsResponse.class)
    public JAXBElement<ManipulationResult> createMoveStopsResponseMoveStopsResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveStopsResponseMoveStopsResult_QNAME, ManipulationResult.class, MoveStopsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveStopsByIdentities.class)
    public JAXBElement<RegionContext> createMoveStopsByIdentitiesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveStopsByIdentities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = MoveStopsByIdentities.class)
    public JAXBElement<DomainInstance> createMoveStopsByIdentitiesOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, MoveStopsByIdentities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopIdentities", scope = MoveStopsByIdentities.class)
    public JAXBElement<ArrayOfStopIdentity> createMoveStopsByIdentitiesStopIdentities(ArrayOfStopIdentity value) {
        return new JAXBElement<ArrayOfStopIdentity>(_MoveStopsByIdentitiesStopIdentities_QNAME, ArrayOfStopIdentity.class, MoveStopsByIdentities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveStopsByIdentities.class)
    public JAXBElement<Placement> createMoveStopsByIdentitiesPlacement(Placement value) {
        return new JAXBElement<Placement>(_MoveStopsPlacement_QNAME, Placement.class, MoveStopsByIdentities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = MoveStopsByIdentities.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createMoveStopsByIdentitiesRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, MoveStopsByIdentities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveStopsByIdentitiesResult", scope = MoveStopsByIdentitiesResponse.class)
    public JAXBElement<ManipulationResult> createMoveStopsByIdentitiesResponseMoveStopsByIdentitiesResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveStopsByIdentitiesResponseMoveStopsByIdentitiesResult_QNAME, ManipulationResult.class, MoveStopsByIdentitiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveStopsToBestPosition.class)
    public JAXBElement<RegionContext> createMoveStopsToBestPositionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveStopsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = MoveStopsToBestPosition.class)
    public JAXBElement<DomainInstance> createMoveStopsToBestPositionOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, MoveStopsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopEntityKeys", scope = MoveStopsToBestPosition.class)
    public JAXBElement<ArrayOflong> createMoveStopsToBestPositionStopEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveStopsStopEntityKeys_QNAME, ArrayOflong.class, MoveStopsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutomaticPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveStopsToBestPosition.class)
    public JAXBElement<AutomaticPlacement> createMoveStopsToBestPositionPlacement(AutomaticPlacement value) {
        return new JAXBElement<AutomaticPlacement>(_MoveStopsPlacement_QNAME, AutomaticPlacement.class, MoveStopsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = MoveStopsToBestPosition.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createMoveStopsToBestPositionRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, MoveStopsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveStopsToBestPositionResult", scope = MoveStopsToBestPositionResponse.class)
    public JAXBElement<ManipulationResult> createMoveStopsToBestPositionResponseMoveStopsToBestPositionResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveStopsToBestPositionResponseMoveStopsToBestPositionResult_QNAME, ManipulationResult.class, MoveStopsToBestPositionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveOrders.class)
    public JAXBElement<RegionContext> createMoveOrdersContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "orderInstances", scope = MoveOrders.class)
    public JAXBElement<ArrayOfDomainInstance> createMoveOrdersOrderInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_MoveOrdersOrderInstances_QNAME, ArrayOfDomainInstance.class, MoveOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveOrders.class)
    public JAXBElement<Placement> createMoveOrdersPlacement(Placement value) {
        return new JAXBElement<Placement>(_MoveStopsPlacement_QNAME, Placement.class, MoveOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = MoveOrders.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createMoveOrdersRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, MoveOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveOrdersResult", scope = MoveOrdersResponse.class)
    public JAXBElement<ManipulationResult> createMoveOrdersResponseMoveOrdersResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveOrdersResponseMoveOrdersResult_QNAME, ManipulationResult.class, MoveOrdersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveOrdersToBestPosition.class)
    public JAXBElement<RegionContext> createMoveOrdersToBestPositionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveOrdersToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "orderInstances", scope = MoveOrdersToBestPosition.class)
    public JAXBElement<ArrayOfDomainInstance> createMoveOrdersToBestPositionOrderInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_MoveOrdersOrderInstances_QNAME, ArrayOfDomainInstance.class, MoveOrdersToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutomaticPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveOrdersToBestPosition.class)
    public JAXBElement<AutomaticPlacement> createMoveOrdersToBestPositionPlacement(AutomaticPlacement value) {
        return new JAXBElement<AutomaticPlacement>(_MoveStopsPlacement_QNAME, AutomaticPlacement.class, MoveOrdersToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = MoveOrdersToBestPosition.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createMoveOrdersToBestPositionRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, MoveOrdersToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveOrdersToBestPositionResult", scope = MoveOrdersToBestPositionResponse.class)
    public JAXBElement<ManipulationResult> createMoveOrdersToBestPositionResponseMoveOrdersToBestPositionResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveOrdersToBestPositionResponseMoveOrdersToBestPositionResult_QNAME, ManipulationResult.class, MoveOrdersToBestPositionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveToRoute.class)
    public JAXBElement<RegionContext> createMoveToRouteContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveToRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveToRouteParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "moveToRouteParameters", scope = MoveToRoute.class)
    public JAXBElement<MoveToRouteParameters> createMoveToRouteMoveToRouteParameters(MoveToRouteParameters value) {
        return new JAXBElement<MoveToRouteParameters>(_MoveToRouteMoveToRouteParameters_QNAME, MoveToRouteParameters.class, MoveToRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveToRoute.class)
    public JAXBElement<Placement> createMoveToRoutePlacement(Placement value) {
        return new JAXBElement<Placement>(_MoveStopsPlacement_QNAME, Placement.class, MoveToRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = MoveToRoute.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createMoveToRouteRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, MoveToRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveToRouteResult", scope = MoveToRouteResponse.class)
    public JAXBElement<ManipulationResult> createMoveToRouteResponseMoveToRouteResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveToRouteResponseMoveToRouteResult_QNAME, ManipulationResult.class, MoveToRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveToRouteAndTemporaryGeocode.class)
    public JAXBElement<RegionContext> createMoveToRouteAndTemporaryGeocodeContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveToRouteAndTemporaryGeocode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveToRouteParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "moveToRouteParameters", scope = MoveToRouteAndTemporaryGeocode.class)
    public JAXBElement<MoveToRouteParameters> createMoveToRouteAndTemporaryGeocodeMoveToRouteParameters(MoveToRouteParameters value) {
        return new JAXBElement<MoveToRouteParameters>(_MoveToRouteMoveToRouteParameters_QNAME, MoveToRouteParameters.class, MoveToRouteAndTemporaryGeocode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveToRouteAndTemporaryGeocode.class)
    public JAXBElement<Placement> createMoveToRouteAndTemporaryGeocodePlacement(Placement value) {
        return new JAXBElement<Placement>(_MoveStopsPlacement_QNAME, Placement.class, MoveToRouteAndTemporaryGeocode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = MoveToRouteAndTemporaryGeocode.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createMoveToRouteAndTemporaryGeocodeRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, MoveToRouteAndTemporaryGeocode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveToRouteAndTemporaryGeocodeResult", scope = MoveToRouteAndTemporaryGeocodeResponse.class)
    public JAXBElement<ManipulationResult> createMoveToRouteAndTemporaryGeocodeResponseMoveToRouteAndTemporaryGeocodeResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveToRouteAndTemporaryGeocodeResponseMoveToRouteAndTemporaryGeocodeResult_QNAME, ManipulationResult.class, MoveToRouteAndTemporaryGeocodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveToBestPositionOnRoute.class)
    public JAXBElement<RegionContext> createMoveToBestPositionOnRouteContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveToBestPositionOnRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveToRouteParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "moveToRouteParameters", scope = MoveToBestPositionOnRoute.class)
    public JAXBElement<MoveToRouteParameters> createMoveToBestPositionOnRouteMoveToRouteParameters(MoveToRouteParameters value) {
        return new JAXBElement<MoveToRouteParameters>(_MoveToRouteMoveToRouteParameters_QNAME, MoveToRouteParameters.class, MoveToBestPositionOnRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutomaticPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveToBestPositionOnRoute.class)
    public JAXBElement<AutomaticPlacement> createMoveToBestPositionOnRoutePlacement(AutomaticPlacement value) {
        return new JAXBElement<AutomaticPlacement>(_MoveStopsPlacement_QNAME, AutomaticPlacement.class, MoveToBestPositionOnRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = MoveToBestPositionOnRoute.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createMoveToBestPositionOnRouteRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, MoveToBestPositionOnRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveToBestPositionOnRouteResult", scope = MoveToBestPositionOnRouteResponse.class)
    public JAXBElement<ManipulationResult> createMoveToBestPositionOnRouteResponseMoveToBestPositionOnRouteResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveToBestPositionOnRouteResponseMoveToBestPositionOnRouteResult_QNAME, ManipulationResult.class, MoveToBestPositionOnRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = OptimizeRoutes.class)
    public JAXBElement<RegionContext> createOptimizeRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, OptimizeRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = OptimizeRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createOptimizeRoutesRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, OptimizeRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptimizeOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = OptimizeRoutes.class)
    public JAXBElement<OptimizeOptions> createOptimizeRoutesOptions(OptimizeOptions value) {
        return new JAXBElement<OptimizeOptions>(_MultiRetrieveOptions_QNAME, OptimizeOptions.class, OptimizeRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptimizeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "OptimizeRoutesResult", scope = OptimizeRoutesResponse.class)
    public JAXBElement<OptimizeResult> createOptimizeRoutesResponseOptimizeRoutesResult(OptimizeResult value) {
        return new JAXBElement<OptimizeResult>(_OptimizeRoutesResponseOptimizeRoutesResult_QNAME, OptimizeResult.class, OptimizeRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SequenceRoute.class)
    public JAXBElement<RegionContext> createSequenceRouteContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SequenceRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = SequenceRoute.class)
    public JAXBElement<DomainInstance> createSequenceRouteRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, SequenceRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = SequenceRoute.class)
    public JAXBElement<SequenceOptions> createSequenceRouteOptions(SequenceOptions value) {
        return new JAXBElement<SequenceOptions>(_MultiRetrieveOptions_QNAME, SequenceOptions.class, SequenceRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = SequenceRoute.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createSequenceRouteRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, SequenceRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SequenceRouteResult", scope = SequenceRouteResponse.class)
    public JAXBElement<ManipulationResult> createSequenceRouteResponseSequenceRouteResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_SequenceRouteResponseSequenceRouteResult_QNAME, ManipulationResult.class, SequenceRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SequenceRange.class)
    public JAXBElement<RegionContext> createSequenceRangeContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SequenceRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = SequenceRange.class)
    public JAXBElement<DomainInstance> createSequenceRangeRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, SequenceRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = SequenceRange.class)
    public JAXBElement<SequenceOptions> createSequenceRangeOptions(SequenceOptions value) {
        return new JAXBElement<SequenceOptions>(_MultiRetrieveOptions_QNAME, SequenceOptions.class, SequenceRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = SequenceRange.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createSequenceRangeRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, SequenceRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SequenceRangeResult", scope = SequenceRangeResponse.class)
    public JAXBElement<ManipulationResult> createSequenceRangeResponseSequenceRangeResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_SequenceRangeResponseSequenceRangeResult_QNAME, ManipulationResult.class, SequenceRangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SuggestRouteSequence.class)
    public JAXBElement<RegionContext> createSuggestRouteSequenceContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SuggestRouteSequence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = SuggestRouteSequence.class)
    public JAXBElement<DomainInstance> createSuggestRouteSequenceRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, SuggestRouteSequence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "optionsDto", scope = SuggestRouteSequence.class)
    public JAXBElement<SequenceOptions> createSuggestRouteSequenceOptionsDto(SequenceOptions value) {
        return new JAXBElement<SequenceOptions>(_SuggestRouteSequenceOptionsDto_QNAME, SequenceOptions.class, SuggestRouteSequence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteOptimizationSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SuggestRouteSequenceResult", scope = SuggestRouteSequenceResponse.class)
    public JAXBElement<RouteOptimizationSuggestion> createSuggestRouteSequenceResponseSuggestRouteSequenceResult(RouteOptimizationSuggestion value) {
        return new JAXBElement<RouteOptimizationSuggestion>(_SuggestRouteSequenceResponseSuggestRouteSequenceResult_QNAME, RouteOptimizationSuggestion.class, SuggestRouteSequenceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UnassignOrders.class)
    public JAXBElement<RegionContext> createUnassignOrdersContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UnassignOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "orderEntityKeys", scope = UnassignOrders.class)
    public JAXBElement<ArrayOfDomainInstance> createUnassignOrdersOrderEntityKeys(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_UnassignOrdersOrderEntityKeys_QNAME, ArrayOfDomainInstance.class, UnassignOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveOrderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "removeOrderOptions", scope = UnassignOrders.class)
    public JAXBElement<RemoveOrderOptions> createUnassignOrdersRemoveOrderOptions(RemoveOrderOptions value) {
        return new JAXBElement<RemoveOrderOptions>(_UnassignOrdersRemoveOrderOptions_QNAME, RemoveOrderOptions.class, UnassignOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = UnassignOrders.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createUnassignOrdersRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, UnassignOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UnassignOrdersResult", scope = UnassignOrdersResponse.class)
    public JAXBElement<ManipulationResult> createUnassignOrdersResponseUnassignOrdersResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_UnassignOrdersResponseUnassignOrdersResult_QNAME, ManipulationResult.class, UnassignOrdersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RemoveStops.class)
    public JAXBElement<RegionContext> createRemoveStopsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RemoveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteStopInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stops", scope = RemoveStops.class)
    public JAXBElement<ArrayOfRouteStopInstances> createRemoveStopsStops(ArrayOfRouteStopInstances value) {
        return new JAXBElement<ArrayOfRouteStopInstances>(_RemoveStopsStops_QNAME, ArrayOfRouteStopInstances.class, RemoveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStopOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "removeStopOptions", scope = RemoveStops.class)
    public JAXBElement<RemoveStopOptions> createRemoveStopsRemoveStopOptions(RemoveStopOptions value) {
        return new JAXBElement<RemoveStopOptions>(_RemoveStopsRemoveStopOptions_QNAME, RemoveStopOptions.class, RemoveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = RemoveStops.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createRemoveStopsRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, RemoveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RemoveStopsResult", scope = RemoveStopsResponse.class)
    public JAXBElement<ManipulationResult> createRemoveStopsResponseRemoveStopsResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_RemoveStopsResponseRemoveStopsResult_QNAME, ManipulationResult.class, RemoveStopsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ChangeTaskCancellationState.class)
    public JAXBElement<RegionContext> createChangeTaskCancellationStateContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ChangeTaskCancellationState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteStopTaskInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "tasks", scope = ChangeTaskCancellationState.class)
    public JAXBElement<ArrayOfRouteStopTaskInstances> createChangeTaskCancellationStateTasks(ArrayOfRouteStopTaskInstances value) {
        return new JAXBElement<ArrayOfRouteStopTaskInstances>(_ChangeTaskCancellationStateTasks_QNAME, ArrayOfRouteStopTaskInstances.class, ChangeTaskCancellationState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = ChangeTaskCancellationState.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createChangeTaskCancellationStateRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, ChangeTaskCancellationState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ChangeTaskCancellationStateResult", scope = ChangeTaskCancellationStateResponse.class)
    public JAXBElement<ManipulationResult> createChangeTaskCancellationStateResponseChangeTaskCancellationStateResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_ChangeTaskCancellationStateResponseChangeTaskCancellationStateResult_QNAME, ManipulationResult.class, ChangeTaskCancellationStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveUnassignedOrderGroups.class)
    public JAXBElement<RegionContext> createMoveUnassignedOrderGroupsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveUnassignedOrderGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "unassignedOrderGroupInstances", scope = MoveUnassignedOrderGroups.class)
    public JAXBElement<ArrayOfDomainInstance> createMoveUnassignedOrderGroupsUnassignedOrderGroupInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_MoveUnassignedOrderGroupsUnassignedOrderGroupInstances_QNAME, ArrayOfDomainInstance.class, MoveUnassignedOrderGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveUnassignedOrderGroups.class)
    public JAXBElement<Placement> createMoveUnassignedOrderGroupsPlacement(Placement value) {
        return new JAXBElement<Placement>(_MoveStopsPlacement_QNAME, Placement.class, MoveUnassignedOrderGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = MoveUnassignedOrderGroups.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createMoveUnassignedOrderGroupsRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, MoveUnassignedOrderGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveUnassignedOrderGroupsResult", scope = MoveUnassignedOrderGroupsResponse.class)
    public JAXBElement<ManipulationResult> createMoveUnassignedOrderGroupsResponseMoveUnassignedOrderGroupsResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveUnassignedOrderGroupsResponseMoveUnassignedOrderGroupsResult_QNAME, ManipulationResult.class, MoveUnassignedOrderGroupsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveUnassignedOrderGroupsEx.class)
    public JAXBElement<RegionContext> createMoveUnassignedOrderGroupsExContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveUnassignedOrderGroupsEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "unassignedOrderGroupInstances", scope = MoveUnassignedOrderGroupsEx.class)
    public JAXBElement<ArrayOfDomainInstance> createMoveUnassignedOrderGroupsExUnassignedOrderGroupInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_MoveUnassignedOrderGroupsUnassignedOrderGroupInstances_QNAME, ArrayOfDomainInstance.class, MoveUnassignedOrderGroupsEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveUnassignedOrderGroupsEx.class)
    public JAXBElement<Placement> createMoveUnassignedOrderGroupsExPlacement(Placement value) {
        return new JAXBElement<Placement>(_MoveStopsPlacement_QNAME, Placement.class, MoveUnassignedOrderGroupsEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveUnassignedOrderGroupsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "moveUnassignedOrderGroupsOptions", scope = MoveUnassignedOrderGroupsEx.class)
    public JAXBElement<MoveUnassignedOrderGroupsOptions> createMoveUnassignedOrderGroupsExMoveUnassignedOrderGroupsOptions(MoveUnassignedOrderGroupsOptions value) {
        return new JAXBElement<MoveUnassignedOrderGroupsOptions>(_MoveUnassignedOrderGroupsExMoveUnassignedOrderGroupsOptions_QNAME, MoveUnassignedOrderGroupsOptions.class, MoveUnassignedOrderGroupsEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = MoveUnassignedOrderGroupsEx.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createMoveUnassignedOrderGroupsExRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, MoveUnassignedOrderGroupsEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveUnassignedOrderGroupsExResult", scope = MoveUnassignedOrderGroupsExResponse.class)
    public JAXBElement<ManipulationResult> createMoveUnassignedOrderGroupsExResponseMoveUnassignedOrderGroupsExResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveUnassignedOrderGroupsExResponseMoveUnassignedOrderGroupsExResult_QNAME, ManipulationResult.class, MoveUnassignedOrderGroupsExResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveUnassignedOrderGroupsToBestPosition.class)
    public JAXBElement<RegionContext> createMoveUnassignedOrderGroupsToBestPositionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveUnassignedOrderGroupsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "unassignedOrderGroupInstances", scope = MoveUnassignedOrderGroupsToBestPosition.class)
    public JAXBElement<ArrayOfDomainInstance> createMoveUnassignedOrderGroupsToBestPositionUnassignedOrderGroupInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_MoveUnassignedOrderGroupsUnassignedOrderGroupInstances_QNAME, ArrayOfDomainInstance.class, MoveUnassignedOrderGroupsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutomaticPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveUnassignedOrderGroupsToBestPosition.class)
    public JAXBElement<AutomaticPlacement> createMoveUnassignedOrderGroupsToBestPositionPlacement(AutomaticPlacement value) {
        return new JAXBElement<AutomaticPlacement>(_MoveStopsPlacement_QNAME, AutomaticPlacement.class, MoveUnassignedOrderGroupsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = MoveUnassignedOrderGroupsToBestPosition.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createMoveUnassignedOrderGroupsToBestPositionRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, MoveUnassignedOrderGroupsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveUnassignedOrderGroupsToBestPositionResult", scope = MoveUnassignedOrderGroupsToBestPositionResponse.class)
    public JAXBElement<ManipulationResult> createMoveUnassignedOrderGroupsToBestPositionResponseMoveUnassignedOrderGroupsToBestPositionResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveUnassignedOrderGroupsToBestPositionResponseMoveUnassignedOrderGroupsToBestPositionResult_QNAME, ManipulationResult.class, MoveUnassignedOrderGroupsToBestPositionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = DeleteRoutes.class)
    public JAXBElement<RegionContext> createDeleteRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, DeleteRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = DeleteRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createDeleteRoutesRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, DeleteRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "DeleteRoutesResult", scope = DeleteRoutesResponse.class)
    public JAXBElement<ArrayOfManipulationResult> createDeleteRoutesResponseDeleteRoutesResult(ArrayOfManipulationResult value) {
        return new JAXBElement<ArrayOfManipulationResult>(_DeleteRoutesResponseDeleteRoutesResult_QNAME, ArrayOfManipulationResult.class, DeleteRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = StartDeleteRoutesJob.class)
    public JAXBElement<RegionContext> createStartDeleteRoutesJobContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, StartDeleteRoutesJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRoutesJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = StartDeleteRoutesJob.class)
    public JAXBElement<DeleteRoutesJobParameters> createStartDeleteRoutesJobParameters(DeleteRoutesJobParameters value) {
        return new JAXBElement<DeleteRoutesJobParameters>(_RetrieveDVIRResultsParameters_QNAME, DeleteRoutesJobParameters.class, StartDeleteRoutesJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = FlipRoutes.class)
    public JAXBElement<RegionContext> createFlipRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, FlipRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = FlipRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createFlipRoutesRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, FlipRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = FlipRoutes.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createFlipRoutesRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, FlipRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "FlipRoutesResult", scope = FlipRoutesResponse.class)
    public JAXBElement<ArrayOfManipulationResult> createFlipRoutesResponseFlipRoutesResult(ArrayOfManipulationResult value) {
        return new JAXBElement<ArrayOfManipulationResult>(_FlipRoutesResponseFlipRoutesResult_QNAME, ArrayOfManipulationResult.class, FlipRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CreateRoute.class)
    public JAXBElement<RegionContext> createCreateRouteContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CreateRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeArgs", scope = CreateRoute.class)
    public JAXBElement<SaveRouteArgs> createCreateRouteRouteArgs(SaveRouteArgs value) {
        return new JAXBElement<SaveRouteArgs>(_SaveRoutePlanRouteArgs_QNAME, SaveRouteArgs.class, CreateRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CreateRouteResult", scope = CreateRouteResponse.class)
    public JAXBElement<SaveRouteResult> createCreateRouteResponseCreateRouteResult(SaveRouteResult value) {
        return new JAXBElement<SaveRouteResult>(_CreateRouteResponseCreateRouteResult_QNAME, SaveRouteResult.class, CreateRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateRoutes.class)
    public JAXBElement<RegionContext> createUpdateRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeArgsList", scope = UpdateRoutes.class)
    public JAXBElement<ArrayOfSaveRouteArgs> createUpdateRoutesRouteArgsList(ArrayOfSaveRouteArgs value) {
        return new JAXBElement<ArrayOfSaveRouteArgs>(_UpdateRoutesRouteArgsList_QNAME, ArrayOfSaveRouteArgs.class, UpdateRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "propertyOptions", scope = UpdateRoutes.class)
    public JAXBElement<RoutePropertyOptions> createUpdateRoutesPropertyOptions(RoutePropertyOptions value) {
        return new JAXBElement<RoutePropertyOptions>(_RetrieveTrashCorrespondencePropertyOptions_QNAME, RoutePropertyOptions.class, UpdateRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateRoutesResult", scope = UpdateRoutesResponse.class)
    public JAXBElement<ArrayOfSaveRouteResult> createUpdateRoutesResponseUpdateRoutesResult(ArrayOfSaveRouteResult value) {
        return new JAXBElement<ArrayOfSaveRouteResult>(_UpdateRoutesResponseUpdateRoutesResult_QNAME, ArrayOfSaveRouteResult.class, UpdateRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = InsertNonServiceableStop.class)
    public JAXBElement<RegionContext> createInsertNonServiceableStopContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, InsertNonServiceableStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNonServiceableStopArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "nonServiceableStopArgs", scope = InsertNonServiceableStop.class)
    public JAXBElement<SaveNonServiceableStopArgs> createInsertNonServiceableStopNonServiceableStopArgs(SaveNonServiceableStopArgs value) {
        return new JAXBElement<SaveNonServiceableStopArgs>(_InsertNonServiceableStopNonServiceableStopArgs_QNAME, SaveNonServiceableStopArgs.class, InsertNonServiceableStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = InsertNonServiceableStop.class)
    public JAXBElement<Placement> createInsertNonServiceableStopPlacement(Placement value) {
        return new JAXBElement<Placement>(_MoveStopsPlacement_QNAME, Placement.class, InsertNonServiceableStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = InsertNonServiceableStop.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createInsertNonServiceableStopRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, InsertNonServiceableStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "InsertNonServiceableStopResult", scope = InsertNonServiceableStopResponse.class)
    public JAXBElement<ManipulationResult> createInsertNonServiceableStopResponseInsertNonServiceableStopResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_InsertNonServiceableStopResponseInsertNonServiceableStopResult_QNAME, ManipulationResult.class, InsertNonServiceableStopResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateNonServiceableStop.class)
    public JAXBElement<RegionContext> createUpdateNonServiceableStopContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateNonServiceableStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNonServiceableStopArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "nonServiceableStopArgs", scope = UpdateNonServiceableStop.class)
    public JAXBElement<SaveNonServiceableStopArgs> createUpdateNonServiceableStopNonServiceableStopArgs(SaveNonServiceableStopArgs value) {
        return new JAXBElement<SaveNonServiceableStopArgs>(_InsertNonServiceableStopNonServiceableStopArgs_QNAME, SaveNonServiceableStopArgs.class, UpdateNonServiceableStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = UpdateNonServiceableStop.class)
    public JAXBElement<DomainInstance> createUpdateNonServiceableStopOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, UpdateNonServiceableStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = UpdateNonServiceableStop.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createUpdateNonServiceableStopRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, UpdateNonServiceableStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateNonServiceableStopResult", scope = UpdateNonServiceableStopResponse.class)
    public JAXBElement<ManipulationResult> createUpdateNonServiceableStopResponseUpdateNonServiceableStopResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_UpdateNonServiceableStopResponseUpdateNonServiceableStopResult_QNAME, ManipulationResult.class, UpdateNonServiceableStopResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = InsertLayoverStop.class)
    public JAXBElement<RegionContext> createInsertLayoverStopContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, InsertLayoverStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveLayoverStopArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "layoverStopArgs", scope = InsertLayoverStop.class)
    public JAXBElement<SaveLayoverStopArgs> createInsertLayoverStopLayoverStopArgs(SaveLayoverStopArgs value) {
        return new JAXBElement<SaveLayoverStopArgs>(_InsertLayoverStopLayoverStopArgs_QNAME, SaveLayoverStopArgs.class, InsertLayoverStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = InsertLayoverStop.class)
    public JAXBElement<Placement> createInsertLayoverStopPlacement(Placement value) {
        return new JAXBElement<Placement>(_MoveStopsPlacement_QNAME, Placement.class, InsertLayoverStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = InsertLayoverStop.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createInsertLayoverStopRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, InsertLayoverStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "InsertLayoverStopResult", scope = InsertLayoverStopResponse.class)
    public JAXBElement<ManipulationResult> createInsertLayoverStopResponseInsertLayoverStopResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_InsertLayoverStopResponseInsertLayoverStopResult_QNAME, ManipulationResult.class, InsertLayoverStopResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateLayoverStop.class)
    public JAXBElement<RegionContext> createUpdateLayoverStopContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateLayoverStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveLayoverStopArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "layoverStopArgs", scope = UpdateLayoverStop.class)
    public JAXBElement<SaveLayoverStopArgs> createUpdateLayoverStopLayoverStopArgs(SaveLayoverStopArgs value) {
        return new JAXBElement<SaveLayoverStopArgs>(_InsertLayoverStopLayoverStopArgs_QNAME, SaveLayoverStopArgs.class, UpdateLayoverStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = UpdateLayoverStop.class)
    public JAXBElement<DomainInstance> createUpdateLayoverStopOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, UpdateLayoverStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = UpdateLayoverStop.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createUpdateLayoverStopRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, UpdateLayoverStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateLayoverStopResult", scope = UpdateLayoverStopResponse.class)
    public JAXBElement<ManipulationResult> createUpdateLayoverStopResponseUpdateLayoverStopResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_UpdateLayoverStopResponseUpdateLayoverStopResult_QNAME, ManipulationResult.class, UpdateLayoverStopResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SuggestLayovers.class)
    public JAXBElement<RegionContext> createSuggestLayoversContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SuggestLayovers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestLayoverOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = SuggestLayovers.class)
    public JAXBElement<SuggestLayoverOptions> createSuggestLayoversOptions(SuggestLayoverOptions value) {
        return new JAXBElement<SuggestLayoverOptions>(_MultiRetrieveOptions_QNAME, SuggestLayoverOptions.class, SuggestLayovers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestLayoverResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SuggestLayoversResult", scope = SuggestLayoversResponse.class)
    public JAXBElement<SuggestLayoverResult> createSuggestLayoversResponseSuggestLayoversResult(SuggestLayoverResult value) {
        return new JAXBElement<SuggestLayoverResult>(_SuggestLayoversResponseSuggestLayoversResult_QNAME, SuggestLayoverResult.class, SuggestLayoversResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = InsertMidRouteDepotStop.class)
    public JAXBElement<RegionContext> createInsertMidRouteDepotStopContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, InsertMidRouteDepotStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMidRouteDepotStopArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "midRouteDepotStopArgs", scope = InsertMidRouteDepotStop.class)
    public JAXBElement<SaveMidRouteDepotStopArgs> createInsertMidRouteDepotStopMidRouteDepotStopArgs(SaveMidRouteDepotStopArgs value) {
        return new JAXBElement<SaveMidRouteDepotStopArgs>(_InsertMidRouteDepotStopMidRouteDepotStopArgs_QNAME, SaveMidRouteDepotStopArgs.class, InsertMidRouteDepotStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = InsertMidRouteDepotStop.class)
    public JAXBElement<Placement> createInsertMidRouteDepotStopPlacement(Placement value) {
        return new JAXBElement<Placement>(_MoveStopsPlacement_QNAME, Placement.class, InsertMidRouteDepotStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = InsertMidRouteDepotStop.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createInsertMidRouteDepotStopRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, InsertMidRouteDepotStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "InsertMidRouteDepotStopResult", scope = InsertMidRouteDepotStopResponse.class)
    public JAXBElement<ManipulationResult> createInsertMidRouteDepotStopResponseInsertMidRouteDepotStopResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_InsertMidRouteDepotStopResponseInsertMidRouteDepotStopResult_QNAME, ManipulationResult.class, InsertMidRouteDepotStopResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateMidRouteDepotStop.class)
    public JAXBElement<RegionContext> createUpdateMidRouteDepotStopContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateMidRouteDepotStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMidRouteDepotStopArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "midRouteDepotStopArgs", scope = UpdateMidRouteDepotStop.class)
    public JAXBElement<SaveMidRouteDepotStopArgs> createUpdateMidRouteDepotStopMidRouteDepotStopArgs(SaveMidRouteDepotStopArgs value) {
        return new JAXBElement<SaveMidRouteDepotStopArgs>(_InsertMidRouteDepotStopMidRouteDepotStopArgs_QNAME, SaveMidRouteDepotStopArgs.class, UpdateMidRouteDepotStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = UpdateMidRouteDepotStop.class)
    public JAXBElement<DomainInstance> createUpdateMidRouteDepotStopOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, UpdateMidRouteDepotStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = UpdateMidRouteDepotStop.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createUpdateMidRouteDepotStopRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, UpdateMidRouteDepotStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateMidRouteDepotStopResult", scope = UpdateMidRouteDepotStopResponse.class)
    public JAXBElement<ManipulationResult> createUpdateMidRouteDepotStopResponseUpdateMidRouteDepotStopResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_UpdateMidRouteDepotStopResponseUpdateMidRouteDepotStopResult_QNAME, ManipulationResult.class, UpdateMidRouteDepotStopResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = InsertRouteDelay.class)
    public JAXBElement<RegionContext> createInsertRouteDelayContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, InsertRouteDelay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteDelayArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeDelayArgs", scope = InsertRouteDelay.class)
    public JAXBElement<SaveRouteDelayArgs> createInsertRouteDelayRouteDelayArgs(SaveRouteDelayArgs value) {
        return new JAXBElement<SaveRouteDelayArgs>(_InsertRouteDelayRouteDelayArgs_QNAME, SaveRouteDelayArgs.class, InsertRouteDelay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = InsertRouteDelay.class)
    public JAXBElement<DomainInstance> createInsertRouteDelayPlacement(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsPlacement_QNAME, DomainInstance.class, InsertRouteDelay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = InsertRouteDelay.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createInsertRouteDelayRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, InsertRouteDelay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "InsertRouteDelayResult", scope = InsertRouteDelayResponse.class)
    public JAXBElement<ManipulationResult> createInsertRouteDelayResponseInsertRouteDelayResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_InsertRouteDelayResponseInsertRouteDelayResult_QNAME, ManipulationResult.class, InsertRouteDelayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateRouteDelay.class)
    public JAXBElement<RegionContext> createUpdateRouteDelayContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateRouteDelay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteDelayArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeDelayArgs", scope = UpdateRouteDelay.class)
    public JAXBElement<SaveRouteDelayArgs> createUpdateRouteDelayRouteDelayArgs(SaveRouteDelayArgs value) {
        return new JAXBElement<SaveRouteDelayArgs>(_InsertRouteDelayRouteDelayArgs_QNAME, SaveRouteDelayArgs.class, UpdateRouteDelay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = UpdateRouteDelay.class)
    public JAXBElement<DomainInstance> createUpdateRouteDelayOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, UpdateRouteDelay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = UpdateRouteDelay.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createUpdateRouteDelayRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, UpdateRouteDelay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateRouteDelayResult", scope = UpdateRouteDelayResponse.class)
    public JAXBElement<ManipulationResult> createUpdateRouteDelayResponseUpdateRouteDelayResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_UpdateRouteDelayResponseUpdateRouteDelayResult_QNAME, ManipulationResult.class, UpdateRouteDelayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AdjustServiceTimesForRoutes.class)
    public JAXBElement<RegionContext> createAdjustServiceTimesForRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AdjustServiceTimesForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = AdjustServiceTimesForRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createAdjustServiceTimesForRoutesRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, AdjustServiceTimesForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTimeAdjustmentOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "adjustFixedServiceTimeOptions", scope = AdjustServiceTimesForRoutes.class)
    public JAXBElement<ServiceTimeAdjustmentOptions> createAdjustServiceTimesForRoutesAdjustFixedServiceTimeOptions(ServiceTimeAdjustmentOptions value) {
        return new JAXBElement<ServiceTimeAdjustmentOptions>(_AdjustServiceTimesForRoutesAdjustFixedServiceTimeOptions_QNAME, ServiceTimeAdjustmentOptions.class, AdjustServiceTimesForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTimeAdjustmentOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "adjustPerUnitServiceTimeOptions", scope = AdjustServiceTimesForRoutes.class)
    public JAXBElement<ServiceTimeAdjustmentOptions> createAdjustServiceTimesForRoutesAdjustPerUnitServiceTimeOptions(ServiceTimeAdjustmentOptions value) {
        return new JAXBElement<ServiceTimeAdjustmentOptions>(_AdjustServiceTimesForRoutesAdjustPerUnitServiceTimeOptions_QNAME, ServiceTimeAdjustmentOptions.class, AdjustServiceTimesForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = AdjustServiceTimesForRoutes.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createAdjustServiceTimesForRoutesRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, AdjustServiceTimesForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "AdjustServiceTimesForRoutesResult", scope = AdjustServiceTimesForRoutesResponse.class)
    public JAXBElement<ArrayOfManipulationResult> createAdjustServiceTimesForRoutesResponseAdjustServiceTimesForRoutesResult(ArrayOfManipulationResult value) {
        return new JAXBElement<ArrayOfManipulationResult>(_AdjustServiceTimesForRoutesResponseAdjustServiceTimesForRoutesResult_QNAME, ArrayOfManipulationResult.class, AdjustServiceTimesForRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AdjustServiceTimesForStops.class)
    public JAXBElement<RegionContext> createAdjustServiceTimesForStopsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AdjustServiceTimesForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = AdjustServiceTimesForStops.class)
    public JAXBElement<DomainInstance> createAdjustServiceTimesForStopsOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, AdjustServiceTimesForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopEntityKeys", scope = AdjustServiceTimesForStops.class)
    public JAXBElement<ArrayOflong> createAdjustServiceTimesForStopsStopEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveStopsStopEntityKeys_QNAME, ArrayOflong.class, AdjustServiceTimesForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTimeAdjustmentOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "adjustFixedServiceTimeOptions", scope = AdjustServiceTimesForStops.class)
    public JAXBElement<ServiceTimeAdjustmentOptions> createAdjustServiceTimesForStopsAdjustFixedServiceTimeOptions(ServiceTimeAdjustmentOptions value) {
        return new JAXBElement<ServiceTimeAdjustmentOptions>(_AdjustServiceTimesForRoutesAdjustFixedServiceTimeOptions_QNAME, ServiceTimeAdjustmentOptions.class, AdjustServiceTimesForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTimeAdjustmentOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "adjustPerUnitServiceTimeOptions", scope = AdjustServiceTimesForStops.class)
    public JAXBElement<ServiceTimeAdjustmentOptions> createAdjustServiceTimesForStopsAdjustPerUnitServiceTimeOptions(ServiceTimeAdjustmentOptions value) {
        return new JAXBElement<ServiceTimeAdjustmentOptions>(_AdjustServiceTimesForRoutesAdjustPerUnitServiceTimeOptions_QNAME, ServiceTimeAdjustmentOptions.class, AdjustServiceTimesForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = AdjustServiceTimesForStops.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createAdjustServiceTimesForStopsRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, AdjustServiceTimesForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "AdjustServiceTimesForStopsResult", scope = AdjustServiceTimesForStopsResponse.class)
    public JAXBElement<ManipulationResult> createAdjustServiceTimesForStopsResponseAdjustServiceTimesForStopsResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_AdjustServiceTimesForStopsResponseAdjustServiceTimesForStopsResult_QNAME, ManipulationResult.class, AdjustServiceTimesForStopsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CreateCellsFromRoutes.class)
    public JAXBElement<RegionContext> createCreateCellsFromRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CreateCellsFromRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = CreateCellsFromRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createCreateCellsFromRoutesRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, CreateCellsFromRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCellsFromRoutesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "createCellsFromRoutesOptions", scope = CreateCellsFromRoutes.class)
    public JAXBElement<CreateCellsFromRoutesOptions> createCreateCellsFromRoutesCreateCellsFromRoutesOptions(CreateCellsFromRoutesOptions value) {
        return new JAXBElement<CreateCellsFromRoutesOptions>(_CreateCellsFromRoutesCreateCellsFromRoutesOptions_QNAME, CreateCellsFromRoutesOptions.class, CreateCellsFromRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCellsFromRoutesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CreateCellsFromRoutesResult", scope = CreateCellsFromRoutesResponse.class)
    public JAXBElement<CreateCellsFromRoutesResult> createCreateCellsFromRoutesResponseCreateCellsFromRoutesResult(CreateCellsFromRoutesResult value) {
        return new JAXBElement<CreateCellsFromRoutesResult>(_CreateCellsFromRoutesResponseCreateCellsFromRoutesResult_QNAME, CreateCellsFromRoutesResult.class, CreateCellsFromRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = OverrideCoordinateForStop.class)
    public JAXBElement<RegionContext> createOverrideCoordinateForStopContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, OverrideCoordinateForStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = OverrideCoordinateForStop.class)
    public JAXBElement<DomainInstance> createOverrideCoordinateForStopRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, OverrideCoordinateForStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "coordinate", scope = OverrideCoordinateForStop.class)
    public JAXBElement<Coordinate> createOverrideCoordinateForStopCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_OverrideCoordinateForStopCoordinate_QNAME, Coordinate.class, OverrideCoordinateForStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = OverrideCoordinateForStop.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createOverrideCoordinateForStopRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, OverrideCoordinateForStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "OverrideCoordinateForStopResult", scope = OverrideCoordinateForStopResponse.class)
    public JAXBElement<ManipulationResult> createOverrideCoordinateForStopResponseOverrideCoordinateForStopResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_OverrideCoordinateForStopResponseOverrideCoordinateForStopResult_QNAME, ManipulationResult.class, OverrideCoordinateForStopResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AssignIdentifierForRoutes.class)
    public JAXBElement<RegionContext> createAssignIdentifierForRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AssignIdentifierForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "seed", scope = AssignIdentifierForRoutes.class)
    public JAXBElement<String> createAssignIdentifierForRoutesSeed(String value) {
        return new JAXBElement<String>(_AssignIdentifierForRoutesSeed_QNAME, String.class, AssignIdentifierForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = AssignIdentifierForRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createAssignIdentifierForRoutesRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, AssignIdentifierForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "AssignIdentifierForRoutesResult", scope = AssignIdentifierForRoutesResponse.class)
    public JAXBElement<ArrayOfSaveRouteResult> createAssignIdentifierForRoutesResponseAssignIdentifierForRoutesResult(ArrayOfSaveRouteResult value) {
        return new JAXBElement<ArrayOfSaveRouteResult>(_AssignIdentifierForRoutesResponseAssignIdentifierForRoutesResult_QNAME, ArrayOfSaveRouteResult.class, AssignIdentifierForRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ChangeRoutePhase.class)
    public JAXBElement<RegionContext> createChangeRoutePhaseContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ChangeRoutePhase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = ChangeRoutePhase.class)
    public JAXBElement<ArrayOfDomainInstance> createChangeRoutePhaseRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, ChangeRoutePhase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ChangeRoutePhaseResult", scope = ChangeRoutePhaseResponse.class)
    public JAXBElement<ArrayOfSaveRouteResult> createChangeRoutePhaseResponseChangeRoutePhaseResult(ArrayOfSaveRouteResult value) {
        return new JAXBElement<ArrayOfSaveRouteResult>(_ChangeRoutePhaseResponseChangeRoutePhaseResult_QNAME, ArrayOfSaveRouteResult.class, ChangeRoutePhaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ChangeRouteStatus.class)
    public JAXBElement<RegionContext> createChangeRouteStatusContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ChangeRouteStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = ChangeRouteStatus.class)
    public JAXBElement<ArrayOfDomainInstance> createChangeRouteStatusRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, ChangeRouteStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ChangeRouteStatusResult", scope = ChangeRouteStatusResponse.class)
    public JAXBElement<ArrayOfSaveRouteResult> createChangeRouteStatusResponseChangeRouteStatusResult(ArrayOfSaveRouteResult value) {
        return new JAXBElement<ArrayOfSaveRouteResult>(_ChangeRouteStatusResponseChangeRouteStatusResult_QNAME, ArrayOfSaveRouteResult.class, ChangeRouteStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CalculateRoutes.class)
    public JAXBElement<RegionContext> createCalculateRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CalculateRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateRoutesArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "calculateRouteArgs", scope = CalculateRoutes.class)
    public JAXBElement<CalculateRoutesArgs> createCalculateRoutesCalculateRouteArgs(CalculateRoutesArgs value) {
        return new JAXBElement<CalculateRoutesArgs>(_CalculateRoutesCalculateRouteArgs_QNAME, CalculateRoutesArgs.class, CalculateRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCalculateRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CalculateRoutesResult", scope = CalculateRoutesResponse.class)
    public JAXBElement<ArrayOfCalculateRouteResult> createCalculateRoutesResponseCalculateRoutesResult(ArrayOfCalculateRouteResult value) {
        return new JAXBElement<ArrayOfCalculateRouteResult>(_CalculateRoutesResponseCalculateRoutesResult_QNAME, ArrayOfCalculateRouteResult.class, CalculateRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AcknowledgeResourceExceptions.class)
    public JAXBElement<RegionContext> createAcknowledgeResourceExceptionsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AcknowledgeResourceExceptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "exceptionInstances", scope = AcknowledgeResourceExceptions.class)
    public JAXBElement<ArrayOfDomainInstance> createAcknowledgeResourceExceptionsExceptionInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_AcknowledgeResourceExceptionsExceptionInstances_QNAME, ArrayOfDomainInstance.class, AcknowledgeResourceExceptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AcknowledgeResourceExceptionsForRoutes.class)
    public JAXBElement<RegionContext> createAcknowledgeResourceExceptionsForRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AcknowledgeResourceExceptionsForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = AcknowledgeResourceExceptionsForRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createAcknowledgeResourceExceptionsForRoutesRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, AcknowledgeResourceExceptionsForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AcknowledgeRouteNotes.class)
    public JAXBElement<RegionContext> createAcknowledgeRouteNotesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AcknowledgeRouteNotes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeNoteInstances", scope = AcknowledgeRouteNotes.class)
    public JAXBElement<ArrayOfDomainInstance> createAcknowledgeRouteNotesRouteNoteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_AcknowledgeRouteNotesRouteNoteInstances_QNAME, ArrayOfDomainInstance.class, AcknowledgeRouteNotes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AcknowledgeRouteNotesForRoutes.class)
    public JAXBElement<RegionContext> createAcknowledgeRouteNotesForRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AcknowledgeRouteNotesForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = AcknowledgeRouteNotesForRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createAcknowledgeRouteNotesForRoutesRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, AcknowledgeRouteNotesForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AssignRouter.class)
    public JAXBElement<RegionContext> createAssignRouterContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AssignRouter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = AssignRouter.class)
    public JAXBElement<ArrayOfDomainInstance> createAssignRouterRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, AssignRouter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AssignDispatcher.class)
    public JAXBElement<RegionContext> createAssignDispatcherContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AssignDispatcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = AssignDispatcher.class)
    public JAXBElement<ArrayOfDomainInstance> createAssignDispatcherRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, AssignDispatcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AutoCompleteRoute.class)
    public JAXBElement<RegionContext> createAutoCompleteRouteContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AutoCompleteRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = AutoCompleteRoute.class)
    public JAXBElement<DomainInstance> createAutoCompleteRouteRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, AutoCompleteRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCompleteRouteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = AutoCompleteRoute.class)
    public JAXBElement<AutoCompleteRouteOptions> createAutoCompleteRouteOptions(AutoCompleteRouteOptions value) {
        return new JAXBElement<AutoCompleteRouteOptions>(_MultiRetrieveOptions_QNAME, AutoCompleteRouteOptions.class, AutoCompleteRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ResetRoutesToPlan.class)
    public JAXBElement<RegionContext> createResetRoutesToPlanContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ResetRoutesToPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = ResetRoutesToPlan.class)
    public JAXBElement<ArrayOfDomainInstance> createResetRoutesToPlanRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, ResetRoutesToPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ResetRoutesToPlanResult", scope = ResetRoutesToPlanResponse.class)
    public JAXBElement<ArrayOfSaveRouteResult> createResetRoutesToPlanResponseResetRoutesToPlanResult(ArrayOfSaveRouteResult value) {
        return new JAXBElement<ArrayOfSaveRouteResult>(_ResetRoutesToPlanResponseResetRoutesToPlanResult_QNAME, ArrayOfSaveRouteResult.class, ResetRoutesToPlanResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AdjustActuals.class)
    public JAXBElement<RegionContext> createAdjustActualsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AdjustActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = AdjustActuals.class)
    public JAXBElement<DomainInstance> createAdjustActualsRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, AdjustActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteActuals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeActuals", scope = AdjustActuals.class)
    public JAXBElement<RouteActuals> createAdjustActualsRouteActuals(RouteActuals value) {
        return new JAXBElement<RouteActuals>(_AdjustActualsRouteActuals_QNAME, RouteActuals.class, AdjustActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "retrievalOptions", scope = AdjustActuals.class)
    public JAXBElement<ArrayOfRouteRetrievalOptions> createAdjustActualsRetrievalOptions(ArrayOfRouteRetrievalOptions value) {
        return new JAXBElement<ArrayOfRouteRetrievalOptions>(_RetrieveStopTemplatesRetrievalOptions_QNAME, ArrayOfRouteRetrievalOptions.class, AdjustActuals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "AdjustActualsResult", scope = AdjustActualsResponse.class)
    public JAXBElement<ManipulationResult> createAdjustActualsResponseAdjustActualsResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_AdjustActualsResponseAdjustActualsResult_QNAME, ManipulationResult.class, AdjustActualsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AcknowledgeCanceledStops.class)
    public JAXBElement<RegionContext> createAcknowledgeCanceledStopsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AcknowledgeCanceledStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = AcknowledgeCanceledStops.class)
    public JAXBElement<DomainInstance> createAcknowledgeCanceledStopsOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, AcknowledgeCanceledStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopEntityKeys", scope = AcknowledgeCanceledStops.class)
    public JAXBElement<ArrayOflong> createAcknowledgeCanceledStopsStopEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveStopsStopEntityKeys_QNAME, ArrayOflong.class, AcknowledgeCanceledStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AcknowledgeUnknownStops.class)
    public JAXBElement<RegionContext> createAcknowledgeUnknownStopsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AcknowledgeUnknownStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = AcknowledgeUnknownStops.class)
    public JAXBElement<DomainInstance> createAcknowledgeUnknownStopsOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, AcknowledgeUnknownStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopEntityKeys", scope = AcknowledgeUnknownStops.class)
    public JAXBElement<ArrayOflong> createAcknowledgeUnknownStopsStopEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveStopsStopEntityKeys_QNAME, ArrayOflong.class, AcknowledgeUnknownStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AssociateStationaryResourceEventWithStops.class)
    public JAXBElement<RegionContext> createAssociateStationaryResourceEventWithStopsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AssociateStationaryResourceEventWithStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = AssociateStationaryResourceEventWithStops.class)
    public JAXBElement<DomainInstance> createAssociateStationaryResourceEventWithStopsRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, AssociateStationaryResourceEventWithStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopEntityKeys", scope = AssociateStationaryResourceEventWithStops.class)
    public JAXBElement<ArrayOflong> createAssociateStationaryResourceEventWithStopsStopEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveStopsStopEntityKeys_QNAME, ArrayOflong.class, AssociateStationaryResourceEventWithStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateStationaryResourceEventWithStopsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = AssociateStationaryResourceEventWithStops.class)
    public JAXBElement<AssociateStationaryResourceEventWithStopsOptions> createAssociateStationaryResourceEventWithStopsOptions(AssociateStationaryResourceEventWithStopsOptions value) {
        return new JAXBElement<AssociateStationaryResourceEventWithStopsOptions>(_MultiRetrieveOptions_QNAME, AssociateStationaryResourceEventWithStopsOptions.class, AssociateStationaryResourceEventWithStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = AddStopsUsingStationaryResourceEvent.class)
    public JAXBElement<RegionContext> createAddStopsUsingStationaryResourceEventContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, AddStopsUsingStationaryResourceEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = AddStopsUsingStationaryResourceEvent.class)
    public JAXBElement<DomainInstance> createAddStopsUsingStationaryResourceEventRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, AddStopsUsingStationaryResourceEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "serviceLocationEntityKeys", scope = AddStopsUsingStationaryResourceEvent.class)
    public JAXBElement<ArrayOflong> createAddStopsUsingStationaryResourceEventServiceLocationEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RetrieveOrderInfosServiceLocationEntityKeys_QNAME, ArrayOflong.class, AddStopsUsingStationaryResourceEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStopsUsingStationaryResourceEventOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = AddStopsUsingStationaryResourceEvent.class)
    public JAXBElement<AddStopsUsingStationaryResourceEventOptions> createAddStopsUsingStationaryResourceEventOptions(AddStopsUsingStationaryResourceEventOptions value) {
        return new JAXBElement<AddStopsUsingStationaryResourceEventOptions>(_MultiRetrieveOptions_QNAME, AddStopsUsingStationaryResourceEventOptions.class, AddStopsUsingStationaryResourceEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveAssociatedStops.class)
    public JAXBElement<RegionContext> createRetrieveAssociatedStopsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveAssociatedStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = RetrieveAssociatedStops.class)
    public JAXBElement<DomainInstance> createRetrieveAssociatedStopsRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, RetrieveAssociatedStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveAssociatedStopsResult", scope = RetrieveAssociatedStopsResponse.class)
    public JAXBElement<ArrayOflong> createRetrieveAssociatedStopsResponseRetrieveAssociatedStopsResult(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RetrieveAssociatedStopsResponseRetrieveAssociatedStopsResult_QNAME, ArrayOflong.class, RetrieveAssociatedStopsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MarkStopAsUnserviceable.class)
    public JAXBElement<RegionContext> createMarkStopAsUnserviceableContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MarkStopAsUnserviceable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = MarkStopAsUnserviceable.class)
    public JAXBElement<DomainInstance> createMarkStopAsUnserviceableRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, MarkStopAsUnserviceable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkStopAsUnserviceableOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = MarkStopAsUnserviceable.class)
    public JAXBElement<MarkStopAsUnserviceableOptions> createMarkStopAsUnserviceableOptions(MarkStopAsUnserviceableOptions value) {
        return new JAXBElement<MarkStopAsUnserviceableOptions>(_MultiRetrieveOptions_QNAME, MarkStopAsUnserviceableOptions.class, MarkStopAsUnserviceable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UnarriveStops.class)
    public JAXBElement<RegionContext> createUnarriveStopsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UnarriveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = UnarriveStops.class)
    public JAXBElement<DomainInstance> createUnarriveStopsRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, UnarriveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopEntityKeys", scope = UnarriveStops.class)
    public JAXBElement<ArrayOflong> createUnarriveStopsStopEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveStopsStopEntityKeys_QNAME, ArrayOflong.class, UnarriveStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = TransferResourceEventSet.class)
    public JAXBElement<RegionContext> createTransferResourceEventSetContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, TransferResourceEventSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "destinationRouteInstance", scope = TransferResourceEventSet.class)
    public JAXBElement<DomainInstance> createTransferResourceEventSetDestinationRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_CombineRoutesDestinationRouteInstance_QNAME, DomainInstance.class, TransferResourceEventSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SuspendRoute.class)
    public JAXBElement<RegionContext> createSuspendRouteContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SuspendRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = SuspendRoute.class)
    public JAXBElement<DomainInstance> createSuspendRouteRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, SuspendRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SuspendRouteResult", scope = SuspendRouteResponse.class)
    public JAXBElement<ManipulationResult> createSuspendRouteResponseSuspendRouteResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_SuspendRouteResponseSuspendRouteResult_QNAME, ManipulationResult.class, SuspendRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = EnableAutonomousDispatch.class)
    public JAXBElement<RegionContext> createEnableAutonomousDispatchContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, EnableAutonomousDispatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = EnableAutonomousDispatch.class)
    public JAXBElement<ArrayOfDomainInstance> createEnableAutonomousDispatchRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, EnableAutonomousDispatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "EnableAutonomousDispatchResult", scope = EnableAutonomousDispatchResponse.class)
    public JAXBElement<ArrayOfManipulationResult> createEnableAutonomousDispatchResponseEnableAutonomousDispatchResult(ArrayOfManipulationResult value) {
        return new JAXBElement<ArrayOfManipulationResult>(_EnableAutonomousDispatchResponseEnableAutonomousDispatchResult_QNAME, ArrayOfManipulationResult.class, EnableAutonomousDispatchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = DisableAutonomousDispatch.class)
    public JAXBElement<RegionContext> createDisableAutonomousDispatchContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, DisableAutonomousDispatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = DisableAutonomousDispatch.class)
    public JAXBElement<ArrayOfDomainInstance> createDisableAutonomousDispatchRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, DisableAutonomousDispatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "DisableAutonomousDispatchResult", scope = DisableAutonomousDispatchResponse.class)
    public JAXBElement<ArrayOfManipulationResult> createDisableAutonomousDispatchResponseDisableAutonomousDispatchResult(ArrayOfManipulationResult value) {
        return new JAXBElement<ArrayOfManipulationResult>(_DisableAutonomousDispatchResponseDisableAutonomousDispatchResult_QNAME, ArrayOfManipulationResult.class, DisableAutonomousDispatchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CalculateOptimalRouteMetrics.class)
    public JAXBElement<RegionContext> createCalculateOptimalRouteMetricsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CalculateOptimalRouteMetrics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateOptimalRouteMetricsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = CalculateOptimalRouteMetrics.class)
    public JAXBElement<CalculateOptimalRouteMetricsParameters> createCalculateOptimalRouteMetricsParameters(CalculateOptimalRouteMetricsParameters value) {
        return new JAXBElement<CalculateOptimalRouteMetricsParameters>(_RetrieveDVIRResultsParameters_QNAME, CalculateOptimalRouteMetricsParameters.class, CalculateOptimalRouteMetrics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = SaveOrders.class)
    public JAXBElement<RegionContext> createSaveOrdersRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, SaveOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderBaseSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "orderSpecDtos", scope = SaveOrders.class)
    public JAXBElement<ArrayOfOrderBaseSpec> createSaveOrdersOrderSpecDtos(ArrayOfOrderBaseSpec value) {
        return new JAXBElement<ArrayOfOrderBaseSpec>(_SaveOrdersOrderSpecDtos_QNAME, ArrayOfOrderBaseSpec.class, SaveOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = SaveOrders.class)
    public JAXBElement<SaveOptions> createSaveOrdersOptions(SaveOptions value) {
        return new JAXBElement<SaveOptions>(_MultiRetrieveOptions_QNAME, SaveOptions.class, SaveOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SaveOrdersResult", scope = SaveOrdersResponse.class)
    public JAXBElement<ArrayOfSaveResult> createSaveOrdersResponseSaveOrdersResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_SaveOrdersResponseSaveOrdersResult_QNAME, ArrayOfSaveResult.class, SaveOrdersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = SaveOrdersEx.class)
    public JAXBElement<RegionContext> createSaveOrdersExRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, SaveOrdersEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderBaseSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "orderSpecDtos", scope = SaveOrdersEx.class)
    public JAXBElement<ArrayOfOrderBaseSpec> createSaveOrdersExOrderSpecDtos(ArrayOfOrderBaseSpec value) {
        return new JAXBElement<ArrayOfOrderBaseSpec>(_SaveOrdersOrderSpecDtos_QNAME, ArrayOfOrderBaseSpec.class, SaveOrdersEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOrderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = SaveOrdersEx.class)
    public JAXBElement<SaveOrderOptions> createSaveOrdersExOptions(SaveOrderOptions value) {
        return new JAXBElement<SaveOrderOptions>(_MultiRetrieveOptions_QNAME, SaveOrderOptions.class, SaveOrdersEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SaveOrdersExResult", scope = SaveOrdersExResponse.class)
    public JAXBElement<ArrayOfSaveResult> createSaveOrdersExResponseSaveOrdersExResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_SaveOrdersExResponseSaveOrdersExResult_QNAME, ArrayOfSaveResult.class, SaveOrdersExResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveUnassignedOrdersToSession.class)
    public JAXBElement<RegionContext> createMoveUnassignedOrdersToSessionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveUnassignedOrdersToSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveUnassignedOrdersToSessionJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = MoveUnassignedOrdersToSession.class)
    public JAXBElement<MoveUnassignedOrdersToSessionJobParameters> createMoveUnassignedOrdersToSessionParameters(MoveUnassignedOrdersToSessionJobParameters value) {
        return new JAXBElement<MoveUnassignedOrdersToSessionJobParameters>(_RetrieveDVIRResultsParameters_QNAME, MoveUnassignedOrdersToSessionJobParameters.class, MoveUnassignedOrdersToSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CreateTerritory.class)
    public JAXBElement<RegionContext> createCreateTerritoryContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CreateTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTerritoryArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "territoryArgs", scope = CreateTerritory.class)
    public JAXBElement<SaveTerritoryArgs> createCreateTerritoryTerritoryArgs(SaveTerritoryArgs value) {
        return new JAXBElement<SaveTerritoryArgs>(_CreateTerritoryTerritoryArgs_QNAME, SaveTerritoryArgs.class, CreateTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTerritoryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CreateTerritoryResult", scope = CreateTerritoryResponse.class)
    public JAXBElement<SaveTerritoryResult> createCreateTerritoryResponseCreateTerritoryResult(SaveTerritoryResult value) {
        return new JAXBElement<SaveTerritoryResult>(_CreateTerritoryResponseCreateTerritoryResult_QNAME, SaveTerritoryResult.class, CreateTerritoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateTerritories.class)
    public JAXBElement<RegionContext> createUpdateTerritoriesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveTerritoryArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "territoryArgsList", scope = UpdateTerritories.class)
    public JAXBElement<ArrayOfSaveTerritoryArgs> createUpdateTerritoriesTerritoryArgsList(ArrayOfSaveTerritoryArgs value) {
        return new JAXBElement<ArrayOfSaveTerritoryArgs>(_UpdateTerritoriesTerritoryArgsList_QNAME, ArrayOfSaveTerritoryArgs.class, UpdateTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerritoryPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "propertyOptions", scope = UpdateTerritories.class)
    public JAXBElement<TerritoryPropertyOptions> createUpdateTerritoriesPropertyOptions(TerritoryPropertyOptions value) {
        return new JAXBElement<TerritoryPropertyOptions>(_RetrieveTrashCorrespondencePropertyOptions_QNAME, TerritoryPropertyOptions.class, UpdateTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveTerritoryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateTerritoriesResult", scope = UpdateTerritoriesResponse.class)
    public JAXBElement<ArrayOfSaveTerritoryResult> createUpdateTerritoriesResponseUpdateTerritoriesResult(ArrayOfSaveTerritoryResult value) {
        return new JAXBElement<ArrayOfSaveTerritoryResult>(_UpdateTerritoriesResponseUpdateTerritoriesResult_QNAME, ArrayOfSaveTerritoryResult.class, UpdateTerritoriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = DeleteTerritories.class)
    public JAXBElement<RegionContext> createDeleteTerritoriesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, DeleteTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "territoryInstances", scope = DeleteTerritories.class)
    public JAXBElement<ArrayOfDomainInstance> createDeleteTerritoriesTerritoryInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_DeleteTerritoriesTerritoryInstances_QNAME, ArrayOfDomainInstance.class, DeleteTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "DeleteTerritoriesResult", scope = DeleteTerritoriesResponse.class)
    public JAXBElement<ArrayOfManipulationResult> createDeleteTerritoriesResponseDeleteTerritoriesResult(ArrayOfManipulationResult value) {
        return new JAXBElement<ArrayOfManipulationResult>(_DeleteTerritoriesResponseDeleteTerritoriesResult_QNAME, ArrayOfManipulationResult.class, DeleteTerritoriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = StartDeleteTerritoriesJob.class)
    public JAXBElement<RegionContext> createStartDeleteTerritoriesJobContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, StartDeleteTerritoriesJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTerritoriesJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = StartDeleteTerritoriesJob.class)
    public JAXBElement<DeleteTerritoriesJobParameters> createStartDeleteTerritoriesJobParameters(DeleteTerritoriesJobParameters value) {
        return new JAXBElement<DeleteTerritoriesJobParameters>(_RetrieveDVIRResultsParameters_QNAME, DeleteTerritoriesJobParameters.class, StartDeleteTerritoriesJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = OptimizeTerritories.class)
    public JAXBElement<RegionContext> createOptimizeTerritoriesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, OptimizeTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptimizeTerritoriesParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = OptimizeTerritories.class)
    public JAXBElement<OptimizeTerritoriesParameters> createOptimizeTerritoriesParameters(OptimizeTerritoriesParameters value) {
        return new JAXBElement<OptimizeTerritoriesParameters>(_RetrieveDVIRResultsParameters_QNAME, OptimizeTerritoriesParameters.class, OptimizeTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = ExportPlanningSolution.class)
    public JAXBElement<RegionContext> createExportPlanningSolutionRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, ExportPlanningSolution.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportPlanningSolutionJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = ExportPlanningSolution.class)
    public JAXBElement<ExportPlanningSolutionJobParameters> createExportPlanningSolutionParameters(ExportPlanningSolutionJobParameters value) {
        return new JAXBElement<ExportPlanningSolutionJobParameters>(_RetrieveDVIRResultsParameters_QNAME, ExportPlanningSolutionJobParameters.class, ExportPlanningSolution.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = BuildSameDayMatrices.class)
    public JAXBElement<RegionContext> createBuildSameDayMatricesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, BuildSameDayMatrices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildSameDayMatricesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = BuildSameDayMatrices.class)
    public JAXBElement<BuildSameDayMatricesOptions> createBuildSameDayMatricesOptions(BuildSameDayMatricesOptions value) {
        return new JAXBElement<BuildSameDayMatricesOptions>(_MultiRetrieveOptions_QNAME, BuildSameDayMatricesOptions.class, BuildSameDayMatrices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCorrespondenceParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = SaveCorrespondence.class)
    public JAXBElement<SaveCorrespondenceParameters> createSaveCorrespondenceParameters(SaveCorrespondenceParameters value) {
        return new JAXBElement<SaveCorrespondenceParameters>(_RetrieveDVIRResultsParameters_QNAME, SaveCorrespondenceParameters.class, SaveCorrespondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SaveCorrespondenceResult", scope = SaveCorrespondenceResponse.class)
    public JAXBElement<SaveResult> createSaveCorrespondenceResponseSaveCorrespondenceResult(SaveResult value) {
        return new JAXBElement<SaveResult>(_SaveCorrespondenceResponseSaveCorrespondenceResult_QNAME, SaveResult.class, SaveCorrespondenceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCorrespondenceForWorkerArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "args", scope = CreateCorrespondenceForWorker.class)
    public JAXBElement<CreateCorrespondenceForWorkerArgs> createCreateCorrespondenceForWorkerArgs(CreateCorrespondenceForWorkerArgs value) {
        return new JAXBElement<CreateCorrespondenceForWorkerArgs>(_RetrieveServiceLocationServiceStatisticsArgs_QNAME, CreateCorrespondenceForWorkerArgs.class, CreateCorrespondenceForWorker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CreateCorrespondenceForWorkerResult", scope = CreateCorrespondenceForWorkerResponse.class)
    public JAXBElement<SaveResult> createCreateCorrespondenceForWorkerResponseCreateCorrespondenceForWorkerResult(SaveResult value) {
        return new JAXBElement<SaveResult>(_CreateCorrespondenceForWorkerResponseCreateCorrespondenceForWorkerResult_QNAME, SaveResult.class, CreateCorrespondenceForWorkerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdateCorrespondenceStatusForWorkerArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "argsList", scope = UpdateCorrespondenceStatusForWorker.class)
    public JAXBElement<ArrayOfUpdateCorrespondenceStatusForWorkerArgs> createUpdateCorrespondenceStatusForWorkerArgsList(ArrayOfUpdateCorrespondenceStatusForWorkerArgs value) {
        return new JAXBElement<ArrayOfUpdateCorrespondenceStatusForWorkerArgs>(_UpdateCorrespondenceStatusForWorkerArgsList_QNAME, ArrayOfUpdateCorrespondenceStatusForWorkerArgs.class, UpdateCorrespondenceStatusForWorker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateCorrespondenceStatusForWorkerResult", scope = UpdateCorrespondenceStatusForWorkerResponse.class)
    public JAXBElement<ArrayOfSaveResult> createUpdateCorrespondenceStatusForWorkerResponseUpdateCorrespondenceStatusForWorkerResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_UpdateCorrespondenceStatusForWorkerResponseUpdateCorrespondenceStatusForWorkerResult_QNAME, ArrayOfSaveResult.class, UpdateCorrespondenceStatusForWorkerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateEmailSenderVerificationStatus.class)
    public JAXBElement<RegionContext> createUpdateEmailSenderVerificationStatusRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateEmailSenderVerificationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = SuggestTerritoryForRecurringOrder.class)
    public JAXBElement<RegionContext> createSuggestTerritoryForRecurringOrderRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, SuggestTerritoryForRecurringOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestTerritoryParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = SuggestTerritoryForRecurringOrder.class)
    public JAXBElement<SuggestTerritoryParameters> createSuggestTerritoryForRecurringOrderParameters(SuggestTerritoryParameters value) {
        return new JAXBElement<SuggestTerritoryParameters>(_RetrieveDVIRResultsParameters_QNAME, SuggestTerritoryParameters.class, SuggestTerritoryForRecurringOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "recurringOrderInstance", scope = SuggestTerritoryForRecurringOrder.class)
    public JAXBElement<DomainInstance> createSuggestTerritoryForRecurringOrderRecurringOrderInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SuggestTerritoryForRecurringOrderRecurringOrderInstance_QNAME, DomainInstance.class, SuggestTerritoryForRecurringOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfScheduleEquipmentMaintenanceArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "scheduleParameters", scope = ScheduleEquipmentMaintenance.class)
    public JAXBElement<ArrayOfScheduleEquipmentMaintenanceArgs> createScheduleEquipmentMaintenanceScheduleParameters(ArrayOfScheduleEquipmentMaintenanceArgs value) {
        return new JAXBElement<ArrayOfScheduleEquipmentMaintenanceArgs>(_ScheduleEquipmentMaintenanceScheduleParameters_QNAME, ArrayOfScheduleEquipmentMaintenanceArgs.class, ScheduleEquipmentMaintenance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = CreateEquipmentService.class)
    public JAXBElement<RegionContext> createCreateEquipmentServiceRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, CreateEquipmentService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEquipmentServiceArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "saveEquipmentServiceArgs", scope = CreateEquipmentService.class)
    public JAXBElement<SaveEquipmentServiceArgs> createCreateEquipmentServiceSaveEquipmentServiceArgs(SaveEquipmentServiceArgs value) {
        return new JAXBElement<SaveEquipmentServiceArgs>(_CreateEquipmentServiceSaveEquipmentServiceArgs_QNAME, SaveEquipmentServiceArgs.class, CreateEquipmentService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateEquipmentService.class)
    public JAXBElement<RegionContext> createUpdateEquipmentServiceRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateEquipmentService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEquipmentServiceArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "saveEquipmentServiceArgs", scope = UpdateEquipmentService.class)
    public JAXBElement<SaveEquipmentServiceArgs> createUpdateEquipmentServiceSaveEquipmentServiceArgs(SaveEquipmentServiceArgs value) {
        return new JAXBElement<SaveEquipmentServiceArgs>(_CreateEquipmentServiceSaveEquipmentServiceArgs_QNAME, SaveEquipmentServiceArgs.class, UpdateEquipmentService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = DeleteEquipmentService.class)
    public JAXBElement<RegionContext> createDeleteEquipmentServiceRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, DeleteEquipmentService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveStrategicStopsToBestPosition.class)
    public JAXBElement<RegionContext> createMoveStrategicStopsToBestPositionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveStrategicStopsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveStrategicStopsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "moveStrategicStopsParameters", scope = MoveStrategicStopsToBestPosition.class)
    public JAXBElement<MoveStrategicStopsParameters> createMoveStrategicStopsToBestPositionMoveStrategicStopsParameters(MoveStrategicStopsParameters value) {
        return new JAXBElement<MoveStrategicStopsParameters>(_MoveStrategicStopsToBestPositionMoveStrategicStopsParameters_QNAME, MoveStrategicStopsParameters.class, MoveStrategicStopsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutomaticPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placementDto", scope = MoveStrategicStopsToBestPosition.class)
    public JAXBElement<AutomaticPlacement> createMoveStrategicStopsToBestPositionPlacementDto(AutomaticPlacement value) {
        return new JAXBElement<AutomaticPlacement>(_MoveStrategicStopsToBestPositionPlacementDto_QNAME, AutomaticPlacement.class, MoveStrategicStopsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveStrategicStopsToBestPositionResult", scope = MoveStrategicStopsToBestPositionResponse.class)
    public JAXBElement<ManipulationResult> createMoveStrategicStopsToBestPositionResponseMoveStrategicStopsToBestPositionResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveStrategicStopsToBestPositionResponseMoveStrategicStopsToBestPositionResult_QNAME, ManipulationResult.class, MoveStrategicStopsToBestPositionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveStrategicStops.class)
    public JAXBElement<RegionContext> createMoveStrategicStopsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveStrategicStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveStrategicStopsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "moveStrategicStopsParameters", scope = MoveStrategicStops.class)
    public JAXBElement<MoveStrategicStopsParameters> createMoveStrategicStopsMoveStrategicStopsParameters(MoveStrategicStopsParameters value) {
        return new JAXBElement<MoveStrategicStopsParameters>(_MoveStrategicStopsToBestPositionMoveStrategicStopsParameters_QNAME, MoveStrategicStopsParameters.class, MoveStrategicStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placementDto", scope = MoveStrategicStops.class)
    public JAXBElement<Placement> createMoveStrategicStopsPlacementDto(Placement value) {
        return new JAXBElement<Placement>(_MoveStrategicStopsToBestPositionPlacementDto_QNAME, Placement.class, MoveStrategicStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveStrategicStopsResult", scope = MoveStrategicStopsResponse.class)
    public JAXBElement<ManipulationResult> createMoveStrategicStopsResponseMoveStrategicStopsResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_MoveStrategicStopsResponseMoveStrategicStopsResult_QNAME, ManipulationResult.class, MoveStrategicStopsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RemoveStrategicStopsFromTerritories.class)
    public JAXBElement<RegionContext> createRemoveStrategicStopsFromTerritoriesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RemoveStrategicStopsFromTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveStrategicStopsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "moveStrategicStopsParameters", scope = RemoveStrategicStopsFromTerritories.class)
    public JAXBElement<MoveStrategicStopsParameters> createRemoveStrategicStopsFromTerritoriesMoveStrategicStopsParameters(MoveStrategicStopsParameters value) {
        return new JAXBElement<MoveStrategicStopsParameters>(_MoveStrategicStopsToBestPositionMoveStrategicStopsParameters_QNAME, MoveStrategicStopsParameters.class, RemoveStrategicStopsFromTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "territoryInstances", scope = RemoveStrategicStopsFromTerritories.class)
    public JAXBElement<ArrayOfDomainInstance> createRemoveStrategicStopsFromTerritoriesTerritoryInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_DeleteTerritoriesTerritoryInstances_QNAME, ArrayOfDomainInstance.class, RemoveStrategicStopsFromTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RemoveStrategicStopsFromTerritoriesResult", scope = RemoveStrategicStopsFromTerritoriesResponse.class)
    public JAXBElement<ManipulationResult> createRemoveStrategicStopsFromTerritoriesResponseRemoveStrategicStopsFromTerritoriesResult(ManipulationResult value) {
        return new JAXBElement<ManipulationResult>(_RemoveStrategicStopsFromTerritoriesResponseRemoveStrategicStopsFromTerritoriesResult_QNAME, ManipulationResult.class, RemoveStrategicStopsFromTerritoriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = SaveWorkerLogEvents.class)
    public JAXBElement<RegionContext> createSaveWorkerLogEventsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, SaveWorkerLogEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkerLogEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "workerLogEventDtos", scope = SaveWorkerLogEvents.class)
    public JAXBElement<ArrayOfWorkerLogEvent> createSaveWorkerLogEventsWorkerLogEventDtos(ArrayOfWorkerLogEvent value) {
        return new JAXBElement<ArrayOfWorkerLogEvent>(_SaveWorkerLogEventsWorkerLogEventDtos_QNAME, ArrayOfWorkerLogEvent.class, SaveWorkerLogEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SaveWorkerLogEventsResult", scope = SaveWorkerLogEventsResponse.class)
    public JAXBElement<ArrayOfSaveResult> createSaveWorkerLogEventsResponseSaveWorkerLogEventsResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_SaveWorkerLogEventsResponseSaveWorkerLogEventsResult_QNAME, ArrayOfSaveResult.class, SaveWorkerLogEventsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveRecurringOrdersToTerritory.class)
    public JAXBElement<RegionContext> createMoveRecurringOrdersToTerritoryContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveRecurringOrdersToTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "recurringOrderInstances", scope = MoveRecurringOrdersToTerritory.class)
    public JAXBElement<ArrayOfDomainInstance> createMoveRecurringOrdersToTerritoryRecurringOrderInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_MoveRecurringOrdersToTerritoryRecurringOrderInstances_QNAME, ArrayOfDomainInstance.class, MoveRecurringOrdersToTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "territoryInstance", scope = MoveRecurringOrdersToTerritory.class)
    public JAXBElement<DomainInstance> createMoveRecurringOrdersToTerritoryTerritoryInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveRecurringOrdersToTerritoryTerritoryInstance_QNAME, DomainInstance.class, MoveRecurringOrdersToTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutomaticPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placementDto", scope = MoveRecurringOrdersToTerritory.class)
    public JAXBElement<AutomaticPlacement> createMoveRecurringOrdersToTerritoryPlacementDto(AutomaticPlacement value) {
        return new JAXBElement<AutomaticPlacement>(_MoveStrategicStopsToBestPositionPlacementDto_QNAME, AutomaticPlacement.class, MoveRecurringOrdersToTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringOrderManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveRecurringOrdersToTerritoryResult", scope = MoveRecurringOrdersToTerritoryResponse.class)
    public JAXBElement<RecurringOrderManipulationResult> createMoveRecurringOrdersToTerritoryResponseMoveRecurringOrdersToTerritoryResult(RecurringOrderManipulationResult value) {
        return new JAXBElement<RecurringOrderManipulationResult>(_MoveRecurringOrdersToTerritoryResponseMoveRecurringOrdersToTerritoryResult_QNAME, RecurringOrderManipulationResult.class, MoveRecurringOrdersToTerritoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveRecurringOrdersToBestPosition.class)
    public JAXBElement<RegionContext> createMoveRecurringOrdersToBestPositionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveRecurringOrdersToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "recurringOrderInstances", scope = MoveRecurringOrdersToBestPosition.class)
    public JAXBElement<ArrayOfDomainInstance> createMoveRecurringOrdersToBestPositionRecurringOrderInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_MoveRecurringOrdersToTerritoryRecurringOrderInstances_QNAME, ArrayOfDomainInstance.class, MoveRecurringOrdersToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutomaticPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveRecurringOrdersToBestPosition.class)
    public JAXBElement<AutomaticPlacement> createMoveRecurringOrdersToBestPositionPlacement(AutomaticPlacement value) {
        return new JAXBElement<AutomaticPlacement>(_MoveStopsPlacement_QNAME, AutomaticPlacement.class, MoveRecurringOrdersToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringOrderManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveRecurringOrdersToBestPositionResult", scope = MoveRecurringOrdersToBestPositionResponse.class)
    public JAXBElement<RecurringOrderManipulationResult> createMoveRecurringOrdersToBestPositionResponseMoveRecurringOrdersToBestPositionResult(RecurringOrderManipulationResult value) {
        return new JAXBElement<RecurringOrderManipulationResult>(_MoveRecurringOrdersToBestPositionResponseMoveRecurringOrdersToBestPositionResult_QNAME, RecurringOrderManipulationResult.class, MoveRecurringOrdersToBestPositionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveRecurringOrders.class)
    public JAXBElement<RegionContext> createMoveRecurringOrdersContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveRecurringOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "recurringOrderInstances", scope = MoveRecurringOrders.class)
    public JAXBElement<ArrayOfDomainInstance> createMoveRecurringOrdersRecurringOrderInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_MoveRecurringOrdersToTerritoryRecurringOrderInstances_QNAME, ArrayOfDomainInstance.class, MoveRecurringOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveRecurringOrders.class)
    public JAXBElement<Placement> createMoveRecurringOrdersPlacement(Placement value) {
        return new JAXBElement<Placement>(_MoveStopsPlacement_QNAME, Placement.class, MoveRecurringOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringOrderManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveRecurringOrdersResult", scope = MoveRecurringOrdersResponse.class)
    public JAXBElement<RecurringOrderManipulationResult> createMoveRecurringOrdersResponseMoveRecurringOrdersResult(RecurringOrderManipulationResult value) {
        return new JAXBElement<RecurringOrderManipulationResult>(_MoveRecurringOrdersResponseMoveRecurringOrdersResult_QNAME, RecurringOrderManipulationResult.class, MoveRecurringOrdersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RemoveRecurringOrdersFromTerritories.class)
    public JAXBElement<RegionContext> createRemoveRecurringOrdersFromTerritoriesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RemoveRecurringOrdersFromTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "recurringOrderInstances", scope = RemoveRecurringOrdersFromTerritories.class)
    public JAXBElement<ArrayOfDomainInstance> createRemoveRecurringOrdersFromTerritoriesRecurringOrderInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_MoveRecurringOrdersToTerritoryRecurringOrderInstances_QNAME, ArrayOfDomainInstance.class, RemoveRecurringOrdersFromTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "territoryInstances", scope = RemoveRecurringOrdersFromTerritories.class)
    public JAXBElement<ArrayOfDomainInstance> createRemoveRecurringOrdersFromTerritoriesTerritoryInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_DeleteTerritoriesTerritoryInstances_QNAME, ArrayOfDomainInstance.class, RemoveRecurringOrdersFromTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringOrderManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RemoveRecurringOrdersFromTerritoriesResult", scope = RemoveRecurringOrdersFromTerritoriesResponse.class)
    public JAXBElement<RecurringOrderManipulationResult> createRemoveRecurringOrdersFromTerritoriesResponseRemoveRecurringOrdersFromTerritoriesResult(RecurringOrderManipulationResult value) {
        return new JAXBElement<RecurringOrderManipulationResult>(_RemoveRecurringOrdersFromTerritoriesResponseRemoveRecurringOrdersFromTerritoriesResult_QNAME, RecurringOrderManipulationResult.class, RemoveRecurringOrdersFromTerritoriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SwitchRecurringOrderServicePattern.class)
    public JAXBElement<RegionContext> createSwitchRecurringOrderServicePatternContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SwitchRecurringOrderServicePattern.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwitchRecurringOrderServicePatternParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "switchRecurringOrderServicePatternParameters", scope = SwitchRecurringOrderServicePattern.class)
    public JAXBElement<SwitchRecurringOrderServicePatternParameters> createSwitchRecurringOrderServicePatternSwitchRecurringOrderServicePatternParameters(SwitchRecurringOrderServicePatternParameters value) {
        return new JAXBElement<SwitchRecurringOrderServicePatternParameters>(_SwitchRecurringOrderServicePatternSwitchRecurringOrderServicePatternParameters_QNAME, SwitchRecurringOrderServicePatternParameters.class, SwitchRecurringOrderServicePattern.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringOrderPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = SwitchRecurringOrderServicePattern.class)
    public JAXBElement<RecurringOrderPlacement> createSwitchRecurringOrderServicePatternPlacement(RecurringOrderPlacement value) {
        return new JAXBElement<RecurringOrderPlacement>(_MoveStopsPlacement_QNAME, RecurringOrderPlacement.class, SwitchRecurringOrderServicePattern.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringOrderManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SwitchRecurringOrderServicePatternResult", scope = SwitchRecurringOrderServicePatternResponse.class)
    public JAXBElement<RecurringOrderManipulationResult> createSwitchRecurringOrderServicePatternResponseSwitchRecurringOrderServicePatternResult(RecurringOrderManipulationResult value) {
        return new JAXBElement<RecurringOrderManipulationResult>(_SwitchRecurringOrderServicePatternResponseSwitchRecurringOrderServicePatternResult_QNAME, RecurringOrderManipulationResult.class, SwitchRecurringOrderServicePatternResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = OverrideCoordinateForRecurringOrder.class)
    public JAXBElement<RegionContext> createOverrideCoordinateForRecurringOrderContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, OverrideCoordinateForRecurringOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "orderInstance", scope = OverrideCoordinateForRecurringOrder.class)
    public JAXBElement<DomainInstance> createOverrideCoordinateForRecurringOrderOrderInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_OverrideCoordinateForRecurringOrderOrderInstance_QNAME, DomainInstance.class, OverrideCoordinateForRecurringOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "coordinate", scope = OverrideCoordinateForRecurringOrder.class)
    public JAXBElement<Coordinate> createOverrideCoordinateForRecurringOrderCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_OverrideCoordinateForStopCoordinate_QNAME, Coordinate.class, OverrideCoordinateForRecurringOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringOrderManipulationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "OverrideCoordinateForRecurringOrderResult", scope = OverrideCoordinateForRecurringOrderResponse.class)
    public JAXBElement<RecurringOrderManipulationResult> createOverrideCoordinateForRecurringOrderResponseOverrideCoordinateForRecurringOrderResult(RecurringOrderManipulationResult value) {
        return new JAXBElement<RecurringOrderManipulationResult>(_OverrideCoordinateForRecurringOrderResponseOverrideCoordinateForRecurringOrderResult_QNAME, RecurringOrderManipulationResult.class, OverrideCoordinateForRecurringOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShareableEntityAccessor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "shareableEntityAccessors", scope = ShareEntity.class)
    public JAXBElement<ArrayOfShareableEntityAccessor> createShareEntityShareableEntityAccessors(ArrayOfShareableEntityAccessor value) {
        return new JAXBElement<ArrayOfShareableEntityAccessor>(_ShareEntityShareableEntityAccessors_QNAME, ArrayOfShareableEntityAccessor.class, ShareEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ShareEntityResult", scope = ShareEntityResponse.class)
    public JAXBElement<ArrayOfSaveResult> createShareEntityResponseShareEntityResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_ShareEntityResponseShareEntityResult_QNAME, ArrayOfSaveResult.class, ShareEntityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShareableEntityAccessor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "shareableEntityAccessors", scope = CreateAndUpdateSharedEntityAccess.class)
    public JAXBElement<ArrayOfShareableEntityAccessor> createCreateAndUpdateSharedEntityAccessShareableEntityAccessors(ArrayOfShareableEntityAccessor value) {
        return new JAXBElement<ArrayOfShareableEntityAccessor>(_ShareEntityShareableEntityAccessors_QNAME, ArrayOfShareableEntityAccessor.class, CreateAndUpdateSharedEntityAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CreateAndUpdateSharedEntityAccessResult", scope = CreateAndUpdateSharedEntityAccessResponse.class)
    public JAXBElement<ArrayOfSaveResult> createCreateAndUpdateSharedEntityAccessResponseCreateAndUpdateSharedEntityAccessResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_CreateAndUpdateSharedEntityAccessResponseCreateAndUpdateSharedEntityAccessResult_QNAME, ArrayOfSaveResult.class, CreateAndUpdateSharedEntityAccessResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = CreateTerritories.class)
    public JAXBElement<RegionContext> createCreateTerritoriesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, CreateTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "recurringOrders", scope = CreateTerritories.class)
    public JAXBElement<ArrayOfDomainInstance> createCreateTerritoriesRecurringOrders(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_CreateTerritoriesRecurringOrders_QNAME, ArrayOfDomainInstance.class, CreateTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTerritoriesParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = CreateTerritories.class)
    public JAXBElement<CreateTerritoriesParameters> createCreateTerritoriesOptions(CreateTerritoriesParameters value) {
        return new JAXBElement<CreateTerritoriesParameters>(_MultiRetrieveOptions_QNAME, CreateTerritoriesParameters.class, CreateTerritories.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = CreateStrategicRoutes.class)
    public JAXBElement<RegionContext> createCreateStrategicRoutesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, CreateStrategicRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "territories", scope = CreateStrategicRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createCreateStrategicRoutesTerritories(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_CreateStrategicRoutesTerritories_QNAME, ArrayOfDomainInstance.class, CreateStrategicRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategicRoutingParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = CreateStrategicRoutes.class)
    public JAXBElement<StrategicRoutingParameters> createCreateStrategicRoutesOptions(StrategicRoutingParameters value) {
        return new JAXBElement<StrategicRoutingParameters>(_MultiRetrieveOptions_QNAME, StrategicRoutingParameters.class, CreateStrategicRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = CalculateCreateTerritoriesTargets.class)
    public JAXBElement<RegionContext> createCalculateCreateTerritoriesTargetsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, CalculateCreateTerritoriesTargets.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "recurringOrders", scope = CalculateCreateTerritoriesTargets.class)
    public JAXBElement<ArrayOfDomainInstance> createCalculateCreateTerritoriesTargetsRecurringOrders(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_CreateTerritoriesRecurringOrders_QNAME, ArrayOfDomainInstance.class, CalculateCreateTerritoriesTargets.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateCreateTerritoriesTargetsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = CalculateCreateTerritoriesTargets.class)
    public JAXBElement<CalculateCreateTerritoriesTargetsParameters> createCalculateCreateTerritoriesTargetsParameters(CalculateCreateTerritoriesTargetsParameters value) {
        return new JAXBElement<CalculateCreateTerritoriesTargetsParameters>(_RetrieveDVIRResultsParameters_QNAME, CalculateCreateTerritoriesTargetsParameters.class, CalculateCreateTerritoriesTargets.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTerritoriesTargetValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CalculateCreateTerritoriesTargetsResult", scope = CalculateCreateTerritoriesTargetsResponse.class)
    public JAXBElement<CreateTerritoriesTargetValues> createCalculateCreateTerritoriesTargetsResponseCalculateCreateTerritoriesTargetsResult(CreateTerritoriesTargetValues value) {
        return new JAXBElement<CreateTerritoriesTargetValues>(_CalculateCreateTerritoriesTargetsResponseCalculateCreateTerritoriesTargetsResult_QNAME, CreateTerritoriesTargetValues.class, CalculateCreateTerritoriesTargetsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = CalculateCreateTerritoriesTargetsForPass.class)
    public JAXBElement<RegionContext> createCalculateCreateTerritoriesTargetsForPassRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, CalculateCreateTerritoriesTargetsForPass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "recurringOrders", scope = CalculateCreateTerritoriesTargetsForPass.class)
    public JAXBElement<ArrayOfDomainInstance> createCalculateCreateTerritoriesTargetsForPassRecurringOrders(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_CreateTerritoriesRecurringOrders_QNAME, ArrayOfDomainInstance.class, CalculateCreateTerritoriesTargetsForPass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTerritoriesParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = CalculateCreateTerritoriesTargetsForPass.class)
    public JAXBElement<CreateTerritoriesParameters> createCalculateCreateTerritoriesTargetsForPassParameters(CreateTerritoriesParameters value) {
        return new JAXBElement<CreateTerritoriesParameters>(_RetrieveDVIRResultsParameters_QNAME, CreateTerritoriesParameters.class, CalculateCreateTerritoriesTargetsForPass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTerritoriesTargetValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CalculateCreateTerritoriesTargetsForPassResult", scope = CalculateCreateTerritoriesTargetsForPassResponse.class)
    public JAXBElement<CreateTerritoriesTargetValues> createCalculateCreateTerritoriesTargetsForPassResponseCalculateCreateTerritoriesTargetsForPassResult(CreateTerritoriesTargetValues value) {
        return new JAXBElement<CreateTerritoriesTargetValues>(_CalculateCreateTerritoriesTargetsForPassResponseCalculateCreateTerritoriesTargetsForPassResult_QNAME, CreateTerritoriesTargetValues.class, CalculateCreateTerritoriesTargetsForPassResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateDailyRoutesJob.class)
    public JAXBElement<RegionContext> createUpdateDailyRoutesJobRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateDailyRoutesJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDailyRoutesJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = UpdateDailyRoutesJob.class)
    public JAXBElement<UpdateDailyRoutesJobParameters> createUpdateDailyRoutesJobParameters(UpdateDailyRoutesJobParameters value) {
        return new JAXBElement<UpdateDailyRoutesJobParameters>(_RetrieveDVIRResultsParameters_QNAME, UpdateDailyRoutesJobParameters.class, UpdateDailyRoutesJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = ShiftDaysJob.class)
    public JAXBElement<RegionContext> createShiftDaysJobRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, ShiftDaysJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShiftDaysJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = ShiftDaysJob.class)
    public JAXBElement<ShiftDaysJobParameters> createShiftDaysJobParameters(ShiftDaysJobParameters value) {
        return new JAXBElement<ShiftDaysJobParameters>(_RetrieveDVIRResultsParameters_QNAME, ShiftDaysJobParameters.class, ShiftDaysJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = TransferRecurringOrdersToSession.class)
    public JAXBElement<RegionContext> createTransferRecurringOrdersToSessionRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, TransferRecurringOrdersToSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferRecurringOrdersParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = TransferRecurringOrdersToSession.class)
    public JAXBElement<TransferRecurringOrdersParameters> createTransferRecurringOrdersToSessionParameters(TransferRecurringOrdersParameters value) {
        return new JAXBElement<TransferRecurringOrdersParameters>(_RetrieveDVIRResultsParameters_QNAME, TransferRecurringOrdersParameters.class, TransferRecurringOrdersToSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "processedRouteKeys", scope = RemoveRouteBasedData.class)
    public JAXBElement<ArrayOflong> createRemoveRouteBasedDataProcessedRouteKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RemoveRouteBasedDataProcessedRouteKeys_QNAME, ArrayOflong.class, RemoveRouteBasedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stagedRouteDtos", scope = SaveStagedRoutes.class)
    public JAXBElement<ArrayOfDataWarehouseStagedRoute> createSaveStagedRoutesStagedRouteDtos(ArrayOfDataWarehouseStagedRoute value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedRoute>(_SaveStagedRoutesStagedRouteDtos_QNAME, ArrayOfDataWarehouseStagedRoute.class, SaveStagedRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = SaveStagedRoutes.class)
    public JAXBElement<SaveOptions> createSaveStagedRoutesOptions(SaveOptions value) {
        return new JAXBElement<SaveOptions>(_MultiRetrieveOptions_QNAME, SaveOptions.class, SaveStagedRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SaveStagedRoutesResult", scope = SaveStagedRoutesResponse.class)
    public JAXBElement<ArrayOfSaveResult> createSaveStagedRoutesResponseSaveStagedRoutesResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_SaveStagedRoutesResponseSaveStagedRoutesResult_QNAME, ArrayOfSaveResult.class, SaveStagedRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionIdentifier", scope = SaveRegionAsOperationsUnit.class)
    public JAXBElement<String> createSaveRegionAsOperationsUnitRegionIdentifier(String value) {
        return new JAXBElement<String>(_SaveRegionAsOperationsUnitRegionIdentifier_QNAME, String.class, SaveRegionAsOperationsUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionDescription", scope = SaveRegionAsOperationsUnit.class)
    public JAXBElement<String> createSaveRegionAsOperationsUnitRegionDescription(String value) {
        return new JAXBElement<String>(_SaveRegionAsOperationsUnitRegionDescription_QNAME, String.class, SaveRegionAsOperationsUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionIdentifier", scope = SaveDepotAsOperationsUnit.class)
    public JAXBElement<String> createSaveDepotAsOperationsUnitRegionIdentifier(String value) {
        return new JAXBElement<String>(_SaveRegionAsOperationsUnitRegionIdentifier_QNAME, String.class, SaveDepotAsOperationsUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "depotIdentifier", scope = SaveDepotAsOperationsUnit.class)
    public JAXBElement<String> createSaveDepotAsOperationsUnitDepotIdentifier(String value) {
        return new JAXBElement<String>(_SaveDepotAsOperationsUnitDepotIdentifier_QNAME, String.class, SaveDepotAsOperationsUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "depotDescription", scope = SaveDepotAsOperationsUnit.class)
    public JAXBElement<String> createSaveDepotAsOperationsUnitDepotDescription(String value) {
        return new JAXBElement<String>(_SaveDepotAsOperationsUnitDepotDescription_QNAME, String.class, SaveDepotAsOperationsUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "operationsUnits", scope = SaveOperationsHierarchy.class)
    public JAXBElement<ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi> createSaveOperationsHierarchyOperationsUnits(ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi value) {
        return new JAXBElement<ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi>(_SaveOperationsHierarchyOperationsUnits_QNAME, ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi.class, SaveOperationsHierarchy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseOperationsUnitLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "operationsUnitLevel", scope = SaveOperationsUnitLevel.class)
    public JAXBElement<DataWarehouseOperationsUnitLevel> createSaveOperationsUnitLevelOperationsUnitLevel(DataWarehouseOperationsUnitLevel value) {
        return new JAXBElement<DataWarehouseOperationsUnitLevel>(_SaveOperationsUnitLevelOperationsUnitLevel_QNAME, DataWarehouseOperationsUnitLevel.class, SaveOperationsUnitLevel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseOperationsUnitLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SaveOperationsUnitLevelResult", scope = SaveOperationsUnitLevelResponse.class)
    public JAXBElement<DataWarehouseOperationsUnitLevel> createSaveOperationsUnitLevelResponseSaveOperationsUnitLevelResult(DataWarehouseOperationsUnitLevel value) {
        return new JAXBElement<DataWarehouseOperationsUnitLevel>(_SaveOperationsUnitLevelResponseSaveOperationsUnitLevelResult_QNAME, DataWarehouseOperationsUnitLevel.class, SaveOperationsUnitLevelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseOperationsUnitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "operationsUnitDimension", scope = SaveOperationsUnitDimension.class)
    public JAXBElement<DataWarehouseOperationsUnitDimension> createSaveOperationsUnitDimensionOperationsUnitDimension(DataWarehouseOperationsUnitDimension value) {
        return new JAXBElement<DataWarehouseOperationsUnitDimension>(_SaveOperationsUnitDimensionOperationsUnitDimension_QNAME, DataWarehouseOperationsUnitDimension.class, SaveOperationsUnitDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseOperationsUnitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SaveOperationsUnitDimensionResult", scope = SaveOperationsUnitDimensionResponse.class)
    public JAXBElement<DataWarehouseOperationsUnitDimension> createSaveOperationsUnitDimensionResponseSaveOperationsUnitDimensionResult(DataWarehouseOperationsUnitDimension value) {
        return new JAXBElement<DataWarehouseOperationsUnitDimension>(_SaveOperationsUnitDimensionResponseSaveOperationsUnitDimensionResult_QNAME, DataWarehouseOperationsUnitDimension.class, SaveOperationsUnitDimensionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = ActiveAlertUnsubscribe.class)
    public JAXBElement<RegionContext> createActiveAlertUnsubscribeRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, ActiveAlertUnsubscribe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "encryptedRecipient", scope = ActiveAlertUnsubscribe.class)
    public JAXBElement<String> createActiveAlertUnsubscribeEncryptedRecipient(String value) {
        return new JAXBElement<String>(_ActiveAlertUnsubscribeEncryptedRecipient_QNAME, String.class, ActiveAlertUnsubscribe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = EnqueueTestSmsMessage.class)
    public JAXBElement<RegionContext> createEnqueueTestSmsMessageRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, EnqueueTestSmsMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessUnitActiveAlertSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "activeAlertSettings", scope = EnqueueTestSmsMessage.class)
    public JAXBElement<BusinessUnitActiveAlertSettings> createEnqueueTestSmsMessageActiveAlertSettings(BusinessUnitActiveAlertSettings value) {
        return new JAXBElement<BusinessUnitActiveAlertSettings>(_EnqueueTestSmsMessageActiveAlertSettings_QNAME, BusinessUnitActiveAlertSettings.class, EnqueueTestSmsMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "recipient", scope = EnqueueTestSmsMessage.class)
    public JAXBElement<String> createEnqueueTestSmsMessageRecipient(String value) {
        return new JAXBElement<String>(_EnqueueTestSmsMessageRecipient_QNAME, String.class, EnqueueTestSmsMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = OpenStrategicRoutingSession.class)
    public JAXBElement<RegionContext> createOpenStrategicRoutingSessionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, OpenStrategicRoutingSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategicRoutingSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "OpenStrategicRoutingSessionResult", scope = OpenStrategicRoutingSessionResponse.class)
    public JAXBElement<StrategicRoutingSession> createOpenStrategicRoutingSessionResponseOpenStrategicRoutingSessionResult(StrategicRoutingSession value) {
        return new JAXBElement<StrategicRoutingSession>(_OpenStrategicRoutingSessionResponseOpenStrategicRoutingSessionResult_QNAME, StrategicRoutingSession.class, OpenStrategicRoutingSessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CloseStrategicRoutingSession.class)
    public JAXBElement<RegionContext> createCloseStrategicRoutingSessionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CloseStrategicRoutingSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategicRoutingSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CloseStrategicRoutingSessionResult", scope = CloseStrategicRoutingSessionResponse.class)
    public JAXBElement<StrategicRoutingSession> createCloseStrategicRoutingSessionResponseCloseStrategicRoutingSessionResult(StrategicRoutingSession value) {
        return new JAXBElement<StrategicRoutingSession>(_CloseStrategicRoutingSessionResponseCloseStrategicRoutingSessionResult_QNAME, StrategicRoutingSession.class, CloseStrategicRoutingSessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = DeleteStrategicRoutingSession.class)
    public JAXBElement<RegionContext> createDeleteStrategicRoutingSessionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, DeleteStrategicRoutingSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStrategicRoutingSessionJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = DeleteStrategicRoutingSession.class)
    public JAXBElement<DeleteStrategicRoutingSessionJobParameters> createDeleteStrategicRoutingSessionParameters(DeleteStrategicRoutingSessionJobParameters value) {
        return new JAXBElement<DeleteStrategicRoutingSessionJobParameters>(_RetrieveDVIRResultsParameters_QNAME, DeleteStrategicRoutingSessionJobParameters.class, DeleteStrategicRoutingSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SaveSessionAs.class)
    public JAXBElement<RegionContext> createSaveSessionAsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SaveSessionAs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveSessionAsJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = SaveSessionAs.class)
    public JAXBElement<SaveSessionAsJobParameters> createSaveSessionAsParameters(SaveSessionAsJobParameters value) {
        return new JAXBElement<SaveSessionAsJobParameters>(_RetrieveDVIRResultsParameters_QNAME, SaveSessionAsJobParameters.class, SaveSessionAs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = PrepareForNextDay.class)
    public JAXBElement<RegionContext> createPrepareForNextDayContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, PrepareForNextDay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareForNextDayJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = PrepareForNextDay.class)
    public JAXBElement<PrepareForNextDayJobParameters> createPrepareForNextDayParameters(PrepareForNextDayJobParameters value) {
        return new JAXBElement<PrepareForNextDayJobParameters>(_RetrieveDVIRResultsParameters_QNAME, PrepareForNextDayJobParameters.class, PrepareForNextDay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = GetOrAddModelingSessionForOperationalSession.class)
    public JAXBElement<RegionContext> createGetOrAddModelingSessionForOperationalSessionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, GetOrAddModelingSessionForOperationalSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "sessionDescription", scope = GetOrAddModelingSessionForOperationalSession.class)
    public JAXBElement<String> createGetOrAddModelingSessionForOperationalSessionSessionDescription(String value) {
        return new JAXBElement<String>(_GetOrAddModelingSessionForOperationalSessionSessionDescription_QNAME, String.class, GetOrAddModelingSessionForOperationalSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "GetOrAddModelingSessionForOperationalSessionResult", scope = GetOrAddModelingSessionForOperationalSessionResponse.class)
    public JAXBElement<RoutingSession> createGetOrAddModelingSessionForOperationalSessionResponseGetOrAddModelingSessionForOperationalSessionResult(RoutingSession value) {
        return new JAXBElement<RoutingSession>(_GetOrAddModelingSessionForOperationalSessionResponseGetOrAddModelingSessionForOperationalSessionResult_QNAME, RoutingSession.class, GetOrAddModelingSessionForOperationalSessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CopyRouteToSession.class)
    public JAXBElement<RegionContext> createCopyRouteToSessionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CopyRouteToSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyRouteToSessionOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = CopyRouteToSession.class)
    public JAXBElement<CopyRouteToSessionOptions> createCopyRouteToSessionOptions(CopyRouteToSessionOptions value) {
        return new JAXBElement<CopyRouteToSessionOptions>(_MultiRetrieveOptions_QNAME, CopyRouteToSessionOptions.class, CopyRouteToSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CopyRouteToSessionResult", scope = CopyRouteToSessionResponse.class)
    public JAXBElement<Route> createCopyRouteToSessionResponseCopyRouteToSessionResult(Route value) {
        return new JAXBElement<Route>(_CopyRouteToSessionResponseCopyRouteToSessionResult_QNAME, Route.class, CopyRouteToSessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ReleaseStrategicSessionLock.class)
    public JAXBElement<RegionContext> createReleaseStrategicSessionLockContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ReleaseStrategicSessionLock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "strategicSessionDto", scope = ReleaseStrategicSessionLock.class)
    public JAXBElement<DomainInstance> createReleaseStrategicSessionLockStrategicSessionDto(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_ReleaseStrategicSessionLockStrategicSessionDto_QNAME, DomainInstance.class, ReleaseStrategicSessionLock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategicRoutingSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ReleaseStrategicSessionLockResult", scope = ReleaseStrategicSessionLockResponse.class)
    public JAXBElement<StrategicRoutingSession> createReleaseStrategicSessionLockResponseReleaseStrategicSessionLockResult(StrategicRoutingSession value) {
        return new JAXBElement<StrategicRoutingSession>(_ReleaseStrategicSessionLockResponseReleaseStrategicSessionLockResult_QNAME, StrategicRoutingSession.class, ReleaseStrategicSessionLockResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = RetrieveFromPlanningSession.class)
    public JAXBElement<RegionContext> createRetrieveFromPlanningSessionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, RetrieveFromPlanningSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveFromPlanningSession.class)
    public JAXBElement<RetrievalOptions> createRetrieveFromPlanningSessionOptions(RetrievalOptions value) {
        return new JAXBElement<RetrievalOptions>(_MultiRetrieveOptions_QNAME, RetrievalOptions.class, RetrieveFromPlanningSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveFromPlanningSessionResult", scope = RetrieveFromPlanningSessionResponse.class)
    public JAXBElement<RetrievalResults> createRetrieveFromPlanningSessionResponseRetrieveFromPlanningSessionResult(RetrievalResults value) {
        return new JAXBElement<RetrievalResults>(_RetrieveFromPlanningSessionResponseRetrieveFromPlanningSessionResult_QNAME, RetrievalResults.class, RetrieveFromPlanningSessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = InitializeStrategicRoutingSessionCache.class)
    public JAXBElement<RegionContext> createInitializeStrategicRoutingSessionCacheContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, InitializeStrategicRoutingSessionCache.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateStrategicRoutingSessionCache.class)
    public JAXBElement<RegionContext> createUpdateStrategicRoutingSessionCacheContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateStrategicRoutingSessionCache.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStrategicPlanningSessionCacheJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = UpdateStrategicRoutingSessionCache.class)
    public JAXBElement<UpdateStrategicPlanningSessionCacheJobParameters> createUpdateStrategicRoutingSessionCacheParameters(UpdateStrategicPlanningSessionCacheJobParameters value) {
        return new JAXBElement<UpdateStrategicPlanningSessionCacheJobParameters>(_RetrieveDVIRResultsParameters_QNAME, UpdateStrategicPlanningSessionCacheJobParameters.class, UpdateStrategicRoutingSessionCache.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = Import.class)
    public JAXBElement<RegionContext> createImportRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, Import.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = Import.class)
    public JAXBElement<ImportParameters> createImportParameters(ImportParameters value) {
        return new JAXBElement<ImportParameters>(_RetrieveDVIRResultsParameters_QNAME, ImportParameters.class, Import.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCustomFormsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = ExportCustomForms.class)
    public JAXBElement<ExportCustomFormsOptions> createExportCustomFormsOptions(ExportCustomFormsOptions value) {
        return new JAXBElement<ExportCustomFormsOptions>(_MultiRetrieveOptions_QNAME, ExportCustomFormsOptions.class, ExportCustomForms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCustomFormsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ExportCustomFormsResult", scope = ExportCustomFormsResponse.class)
    public JAXBElement<ExportCustomFormsResult> createExportCustomFormsResponseExportCustomFormsResult(ExportCustomFormsResult value) {
        return new JAXBElement<ExportCustomFormsResult>(_ExportCustomFormsResponseExportCustomFormsResult_QNAME, ExportCustomFormsResult.class, ExportCustomFormsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = LockOrdersForStops.class)
    public JAXBElement<RegionContext> createLockOrdersForStopsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, LockOrdersForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = LockOrdersForStops.class)
    public JAXBElement<DomainInstance> createLockOrdersForStopsOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, LockOrdersForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopEntityKeys", scope = LockOrdersForStops.class)
    public JAXBElement<ArrayOflong> createLockOrdersForStopsStopEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveStopsStopEntityKeys_QNAME, ArrayOflong.class, LockOrdersForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = LockOrdersForStops.class)
    public JAXBElement<LockOrderOptions> createLockOrdersForStopsOptions(LockOrderOptions value) {
        return new JAXBElement<LockOrderOptions>(_MultiRetrieveOptions_QNAME, LockOrderOptions.class, LockOrdersForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LockOrdersForStopsResult", scope = LockOrdersForStopsResponse.class)
    public JAXBElement<LockOrderResults> createLockOrdersForStopsResponseLockOrdersForStopsResult(LockOrderResults value) {
        return new JAXBElement<LockOrderResults>(_LockOrdersForStopsResponseLockOrdersForStopsResult_QNAME, LockOrderResults.class, LockOrdersForStopsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = LockOrdersForRoutes.class)
    public JAXBElement<RegionContext> createLockOrdersForRoutesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, LockOrdersForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = LockOrdersForRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createLockOrdersForRoutesRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, LockOrdersForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = LockOrdersForRoutes.class)
    public JAXBElement<LockOrderOptions> createLockOrdersForRoutesOptions(LockOrderOptions value) {
        return new JAXBElement<LockOrderOptions>(_MultiRetrieveOptions_QNAME, LockOrderOptions.class, LockOrdersForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LockOrdersForRoutesResult", scope = LockOrdersForRoutesResponse.class)
    public JAXBElement<LockOrderResults> createLockOrdersForRoutesResponseLockOrdersForRoutesResult(LockOrderResults value) {
        return new JAXBElement<LockOrderResults>(_LockOrdersForRoutesResponseLockOrdersForRoutesResult_QNAME, LockOrderResults.class, LockOrdersForRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UnlockOrdersForStops.class)
    public JAXBElement<RegionContext> createUnlockOrdersForStopsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UnlockOrdersForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = UnlockOrdersForStops.class)
    public JAXBElement<DomainInstance> createUnlockOrdersForStopsOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, UnlockOrdersForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopEntityKeys", scope = UnlockOrdersForStops.class)
    public JAXBElement<ArrayOflong> createUnlockOrdersForStopsStopEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveStopsStopEntityKeys_QNAME, ArrayOflong.class, UnlockOrdersForStops.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UnlockOrdersForStopsResult", scope = UnlockOrdersForStopsResponse.class)
    public JAXBElement<LockOrderResults> createUnlockOrdersForStopsResponseUnlockOrdersForStopsResult(LockOrderResults value) {
        return new JAXBElement<LockOrderResults>(_UnlockOrdersForStopsResponseUnlockOrdersForStopsResult_QNAME, LockOrderResults.class, UnlockOrdersForStopsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UnlockOrdersForRoutes.class)
    public JAXBElement<RegionContext> createUnlockOrdersForRoutesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UnlockOrdersForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = UnlockOrdersForRoutes.class)
    public JAXBElement<ArrayOfDomainInstance> createUnlockOrdersForRoutesRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, UnlockOrdersForRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockOrderResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UnlockOrdersForRoutesResult", scope = UnlockOrdersForRoutesResponse.class)
    public JAXBElement<LockOrderResults> createUnlockOrdersForRoutesResponseUnlockOrdersForRoutesResult(LockOrderResults value) {
        return new JAXBElement<LockOrderResults>(_UnlockOrdersForRoutesResponseUnlockOrdersForRoutesResult_QNAME, LockOrderResults.class, UnlockOrdersForRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = LoadRoute.class)
    public JAXBElement<RegionContext> createLoadRouteRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, LoadRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadRouteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = LoadRoute.class)
    public JAXBElement<LoadRouteOptions> createLoadRouteOptions(LoadRouteOptions value) {
        return new JAXBElement<LoadRouteOptions>(_MultiRetrieveOptions_QNAME, LoadRouteOptions.class, LoadRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LoadRouteResult", scope = LoadRouteResponse.class)
    public JAXBElement<Route> createLoadRouteResponseLoadRouteResult(Route value) {
        return new JAXBElement<Route>(_LoadRouteResponseLoadRouteResult_QNAME, Route.class, LoadRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveRoutesForDevice.class)
    public JAXBElement<RegionContext> createRetrieveRoutesForDeviceRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveRoutesForDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRoutesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveRoutesForDevice.class)
    public JAXBElement<RetrieveRoutesOptions> createRetrieveRoutesForDeviceOptions(RetrieveRoutesOptions value) {
        return new JAXBElement<RetrieveRoutesOptions>(_MultiRetrieveOptions_QNAME, RetrieveRoutesOptions.class, RetrieveRoutesForDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveRoutesForDeviceResult", scope = RetrieveRoutesForDeviceResponse.class)
    public JAXBElement<ArrayOfRoute> createRetrieveRoutesForDeviceResponseRetrieveRoutesForDeviceResult(ArrayOfRoute value) {
        return new JAXBElement<ArrayOfRoute>(_RetrieveRoutesForDeviceResponseRetrieveRoutesForDeviceResult_QNAME, ArrayOfRoute.class, RetrieveRoutesForDeviceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = PreviewRoute.class)
    public JAXBElement<RegionContext> createPreviewRouteRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, PreviewRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreviewRouteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = PreviewRoute.class)
    public JAXBElement<PreviewRouteOptions> createPreviewRouteOptions(PreviewRouteOptions value) {
        return new JAXBElement<PreviewRouteOptions>(_MultiRetrieveOptions_QNAME, PreviewRouteOptions.class, PreviewRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "PreviewRouteResult", scope = PreviewRouteResponse.class)
    public JAXBElement<Route> createPreviewRouteResponsePreviewRouteResult(Route value) {
        return new JAXBElement<Route>(_PreviewRouteResponsePreviewRouteResult_QNAME, Route.class, PreviewRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = ProcessMobileDeviceActions.class)
    public JAXBElement<RegionContext> createProcessMobileDeviceActionsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, ProcessMobileDeviceActions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = ProcessMobileDeviceActions.class)
    public JAXBElement<DomainInstance> createProcessMobileDeviceActionsRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, ProcessMobileDeviceActions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "workerEntityKey", scope = ProcessMobileDeviceActions.class)
    public JAXBElement<Long> createProcessMobileDeviceActionsWorkerEntityKey(Long value) {
        return new JAXBElement<Long>(_ProcessMobileDeviceActionsWorkerEntityKey_QNAME, Long.class, ProcessMobileDeviceActions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMobileDeviceAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "actions", scope = ProcessMobileDeviceActions.class)
    public JAXBElement<ArrayOfMobileDeviceAction> createProcessMobileDeviceActionsActions(ArrayOfMobileDeviceAction value) {
        return new JAXBElement<ArrayOfMobileDeviceAction>(_ProcessMobileDeviceActionsActions_QNAME, ArrayOfMobileDeviceAction.class, ProcessMobileDeviceActions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SendTextMessageToDriver.class)
    public JAXBElement<RegionContext> createSendTextMessageToDriverContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SendTextMessageToDriver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstance", scope = SendTextMessageToDriver.class)
    public JAXBElement<DomainInstance> createSendTextMessageToDriverRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SplitRouteRouteInstance_QNAME, DomainInstance.class, SendTextMessageToDriver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "message", scope = SendTextMessageToDriver.class)
    public JAXBElement<String> createSendTextMessageToDriverMessage(String value) {
        return new JAXBElement<String>(_SendTextMessageToDriverMessage_QNAME, String.class, SendTextMessageToDriver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SendTextMessageToDrivers.class)
    public JAXBElement<RegionContext> createSendTextMessageToDriversContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SendTextMessageToDrivers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstances", scope = SendTextMessageToDrivers.class)
    public JAXBElement<ArrayOfDomainInstance> createSendTextMessageToDriversRouteInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_OptimizeRoutesRouteInstances_QNAME, ArrayOfDomainInstance.class, SendTextMessageToDrivers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "message", scope = SendTextMessageToDrivers.class)
    public JAXBElement<String> createSendTextMessageToDriversMessage(String value) {
        return new JAXBElement<String>(_SendTextMessageToDriverMessage_QNAME, String.class, SendTextMessageToDrivers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SendInstallUriToDevices.class)
    public JAXBElement<RegionContext> createSendInstallUriToDevicesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SendInstallUriToDevices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "mobileDeviceEntityKeys", scope = SendInstallUriToDevices.class)
    public JAXBElement<ArrayOflong> createSendInstallUriToDevicesMobileDeviceEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SendInstallUriToDevicesMobileDeviceEntityKeys_QNAME, ArrayOflong.class, SendInstallUriToDevices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSendSmsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SendInstallUriToDevicesResult", scope = SendInstallUriToDevicesResponse.class)
    public JAXBElement<ArrayOfSendSmsResult> createSendInstallUriToDevicesResponseSendInstallUriToDevicesResult(ArrayOfSendSmsResult value) {
        return new JAXBElement<ArrayOfSendSmsResult>(_SendInstallUriToDevicesResponseSendInstallUriToDevicesResult_QNAME, ArrayOfSendSmsResult.class, SendInstallUriToDevicesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "telematicsDeviceEntityKeys", scope = SendTelematicsDeviceConfiguration.class)
    public JAXBElement<ArrayOflong> createSendTelematicsDeviceConfigurationTelematicsDeviceEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SendTelematicsDeviceConfigurationTelematicsDeviceEntityKeys_QNAME, ArrayOflong.class, SendTelematicsDeviceConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpgradeRoadnetTelematicsDeviceConfiguration.class)
    public JAXBElement<RegionContext> createUpgradeRoadnetTelematicsDeviceConfigurationRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpgradeRoadnetTelematicsDeviceConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "deviceUpgradeInfo", scope = UpgradeRoadnetTelematicsDeviceConfiguration.class)
    public JAXBElement<ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo> createUpgradeRoadnetTelematicsDeviceConfigurationDeviceUpgradeInfo(ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo value) {
        return new JAXBElement<ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo>(_UpgradeRoadnetTelematicsDeviceConfigurationDeviceUpgradeInfo_QNAME, ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo.class, UpgradeRoadnetTelematicsDeviceConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RebootRoadnetTelematicsDevices.class)
    public JAXBElement<RegionContext> createRebootRoadnetTelematicsDevicesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RebootRoadnetTelematicsDevices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "telematicsDeviceEntityKeys", scope = RebootRoadnetTelematicsDevices.class)
    public JAXBElement<ArrayOflong> createRebootRoadnetTelematicsDevicesTelematicsDeviceEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SendTelematicsDeviceConfigurationTelematicsDeviceEntityKeys_QNAME, ArrayOflong.class, RebootRoadnetTelematicsDevices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = IgnoreRouteErrors.class)
    public JAXBElement<RegionContext> createIgnoreRouteErrorsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, IgnoreRouteErrors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeInstanceList", scope = IgnoreRouteErrors.class)
    public JAXBElement<ArrayOfDomainInstance> createIgnoreRouteErrorsRouteInstanceList(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_IgnoreRouteErrorsRouteInstanceList_QNAME, ArrayOfDomainInstance.class, IgnoreRouteErrors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "IgnoreRouteErrorsResult", scope = IgnoreRouteErrorsResponse.class)
    public JAXBElement<ArrayOfSaveRouteResult> createIgnoreRouteErrorsResponseIgnoreRouteErrorsResult(ArrayOfSaveRouteResult value) {
        return new JAXBElement<ArrayOfSaveRouteResult>(_IgnoreRouteErrorsResponseIgnoreRouteErrorsResult_QNAME, ArrayOfSaveRouteResult.class, IgnoreRouteErrorsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = ClearActiveTroubleCodes.class)
    public JAXBElement<RegionContext> createClearActiveTroubleCodesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, ClearActiveTroubleCodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearActiveTroubleCodesParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = ClearActiveTroubleCodes.class)
    public JAXBElement<ClearActiveTroubleCodesParameters> createClearActiveTroubleCodesParameters(ClearActiveTroubleCodesParameters value) {
        return new JAXBElement<ClearActiveTroubleCodesParameters>(_RetrieveDVIRResultsParameters_QNAME, ClearActiveTroubleCodesParameters.class, ClearActiveTroubleCodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RefreshOmnitracsNavigationDeviceActivationCode.class)
    public JAXBElement<RegionContext> createRefreshOmnitracsNavigationDeviceActivationCodeRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RefreshOmnitracsNavigationDeviceActivationCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientActivationCodeRefreshStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RefreshOmnitracsNavigationDeviceActivationCodeResult", scope = RefreshOmnitracsNavigationDeviceActivationCodeResponse.class)
    public JAXBElement<NavClientActivationCodeRefreshStatus> createRefreshOmnitracsNavigationDeviceActivationCodeResponseRefreshOmnitracsNavigationDeviceActivationCodeResult(NavClientActivationCodeRefreshStatus value) {
        return new JAXBElement<NavClientActivationCodeRefreshStatus>(_RefreshOmnitracsNavigationDeviceActivationCodeResponseRefreshOmnitracsNavigationDeviceActivationCodeResult_QNAME, NavClientActivationCodeRefreshStatus.class, RefreshOmnitracsNavigationDeviceActivationCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveNavigationDeviceStatus.class)
    public JAXBElement<RegionContext> createRetrieveNavigationDeviceStatusRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveNavigationDeviceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "mobileDeviceEntityKeys", scope = RetrieveNavigationDeviceStatus.class)
    public JAXBElement<ArrayOflong> createRetrieveNavigationDeviceStatusMobileDeviceEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SendInstallUriToDevicesMobileDeviceEntityKeys_QNAME, ArrayOflong.class, RetrieveNavigationDeviceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNavDeviceStatusDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveNavigationDeviceStatusResult", scope = RetrieveNavigationDeviceStatusResponse.class)
    public JAXBElement<ArrayOfNavDeviceStatusDto> createRetrieveNavigationDeviceStatusResponseRetrieveNavigationDeviceStatusResult(ArrayOfNavDeviceStatusDto value) {
        return new JAXBElement<ArrayOfNavDeviceStatusDto>(_RetrieveNavigationDeviceStatusResponseRetrieveNavigationDeviceStatusResult_QNAME, ArrayOfNavDeviceStatusDto.class, RetrieveNavigationDeviceStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = DeleteUnassignedOrderGroups.class)
    public JAXBElement<RegionContext> createDeleteUnassignedOrderGroupsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, DeleteUnassignedOrderGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "groupInstances", scope = DeleteUnassignedOrderGroups.class)
    public JAXBElement<ArrayOfDomainInstance> createDeleteUnassignedOrderGroupsGroupInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_DeleteUnassignedOrderGroupsGroupInstances_QNAME, ArrayOfDomainInstance.class, DeleteUnassignedOrderGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = OverrideCoordinateForUnassignedOrderGroup.class)
    public JAXBElement<RegionContext> createOverrideCoordinateForUnassignedOrderGroupContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, OverrideCoordinateForUnassignedOrderGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "groupInstance", scope = OverrideCoordinateForUnassignedOrderGroup.class)
    public JAXBElement<DomainInstance> createOverrideCoordinateForUnassignedOrderGroupGroupInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_OverrideCoordinateForUnassignedOrderGroupGroupInstance_QNAME, DomainInstance.class, OverrideCoordinateForUnassignedOrderGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "coordinate", scope = OverrideCoordinateForUnassignedOrderGroup.class)
    public JAXBElement<Coordinate> createOverrideCoordinateForUnassignedOrderGroupCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_OverrideCoordinateForStopCoordinate_QNAME, Coordinate.class, OverrideCoordinateForUnassignedOrderGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = OverrideCoordinateForOrder.class)
    public JAXBElement<RegionContext> createOverrideCoordinateForOrderContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, OverrideCoordinateForOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "orderInstance", scope = OverrideCoordinateForOrder.class)
    public JAXBElement<DomainInstance> createOverrideCoordinateForOrderOrderInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_OverrideCoordinateForRecurringOrderOrderInstance_QNAME, DomainInstance.class, OverrideCoordinateForOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "coordinate", scope = OverrideCoordinateForOrder.class)
    public JAXBElement<Coordinate> createOverrideCoordinateForOrderCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_OverrideCoordinateForStopCoordinate_QNAME, Coordinate.class, OverrideCoordinateForOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CreateRouteTemplate.class)
    public JAXBElement<RegionContext> createCreateRouteTemplateContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CreateRouteTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteTemplateArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateArgs", scope = CreateRouteTemplate.class)
    public JAXBElement<SaveRouteTemplateArgs> createCreateRouteTemplateRouteTemplateArgs(SaveRouteTemplateArgs value) {
        return new JAXBElement<SaveRouteTemplateArgs>(_CreateRouteTemplateRouteTemplateArgs_QNAME, SaveRouteTemplateArgs.class, CreateRouteTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CreateRouteTemplateResult", scope = CreateRouteTemplateResponse.class)
    public JAXBElement<SaveResult> createCreateRouteTemplateResponseCreateRouteTemplateResult(SaveResult value) {
        return new JAXBElement<SaveResult>(_CreateRouteTemplateResponseCreateRouteTemplateResult_QNAME, SaveResult.class, CreateRouteTemplateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateRouteTemplates.class)
    public JAXBElement<RegionContext> createUpdateRouteTemplatesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateRouteTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteTemplateArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeArgsList", scope = UpdateRouteTemplates.class)
    public JAXBElement<ArrayOfSaveRouteTemplateArgs> createUpdateRouteTemplatesRouteArgsList(ArrayOfSaveRouteTemplateArgs value) {
        return new JAXBElement<ArrayOfSaveRouteTemplateArgs>(_UpdateRoutesRouteArgsList_QNAME, ArrayOfSaveRouteTemplateArgs.class, UpdateRouteTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplatePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "propertyOptions", scope = UpdateRouteTemplates.class)
    public JAXBElement<RouteTemplatePropertyOptions> createUpdateRouteTemplatesPropertyOptions(RouteTemplatePropertyOptions value) {
        return new JAXBElement<RouteTemplatePropertyOptions>(_RetrieveTrashCorrespondencePropertyOptions_QNAME, RouteTemplatePropertyOptions.class, UpdateRouteTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateRouteTemplatesResult", scope = UpdateRouteTemplatesResponse.class)
    public JAXBElement<ArrayOfSaveResult> createUpdateRouteTemplatesResponseUpdateRouteTemplatesResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_UpdateRouteTemplatesResponseUpdateRouteTemplatesResult_QNAME, ArrayOfSaveResult.class, UpdateRouteTemplatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateRouteTemplate.class)
    public JAXBElement<RegionContext> createUpdateRouteTemplateContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateRouteTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteTemplateArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateArgs", scope = UpdateRouteTemplate.class)
    public JAXBElement<SaveRouteTemplateArgs> createUpdateRouteTemplateRouteTemplateArgs(SaveRouteTemplateArgs value) {
        return new JAXBElement<SaveRouteTemplateArgs>(_CreateRouteTemplateRouteTemplateArgs_QNAME, SaveRouteTemplateArgs.class, UpdateRouteTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateRouteTemplateResult", scope = UpdateRouteTemplateResponse.class)
    public JAXBElement<SaveResult> createUpdateRouteTemplateResponseUpdateRouteTemplateResult(SaveResult value) {
        return new JAXBElement<SaveResult>(_UpdateRouteTemplateResponseUpdateRouteTemplateResult_QNAME, SaveResult.class, UpdateRouteTemplateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = DeleteRouteTemplates.class)
    public JAXBElement<RegionContext> createDeleteRouteTemplatesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, DeleteRouteTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateInstances", scope = DeleteRouteTemplates.class)
    public JAXBElement<ArrayOfDomainInstance> createDeleteRouteTemplatesRouteTemplateInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_DeleteRouteTemplatesRouteTemplateInstances_QNAME, ArrayOfDomainInstance.class, DeleteRouteTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CombineRouteTemplates.class)
    public JAXBElement<RegionContext> createCombineRouteTemplatesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CombineRouteTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "destinationRouteTemplateInstance", scope = CombineRouteTemplates.class)
    public JAXBElement<DomainInstance> createCombineRouteTemplatesDestinationRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_CombineRouteTemplatesDestinationRouteTemplateInstance_QNAME, DomainInstance.class, CombineRouteTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateInstances", scope = CombineRouteTemplates.class)
    public JAXBElement<ArrayOfDomainInstance> createCombineRouteTemplatesRouteTemplateInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_DeleteRouteTemplatesRouteTemplateInstances_QNAME, ArrayOfDomainInstance.class, CombineRouteTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CombineRouteTemplatesResult", scope = CombineRouteTemplatesResponse.class)
    public JAXBElement<RouteTemplate> createCombineRouteTemplatesResponseCombineRouteTemplatesResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_CombineRouteTemplatesResponseCombineRouteTemplatesResult_QNAME, RouteTemplate.class, CombineRouteTemplatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = FlipRouteTemplate.class)
    public JAXBElement<RegionContext> createFlipRouteTemplateContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, FlipRouteTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateInstance", scope = FlipRouteTemplate.class)
    public JAXBElement<DomainInstance> createFlipRouteTemplateRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_FlipRouteTemplateRouteTemplateInstance_QNAME, DomainInstance.class, FlipRouteTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "FlipRouteTemplateResult", scope = FlipRouteTemplateResponse.class)
    public JAXBElement<RouteTemplate> createFlipRouteTemplateResponseFlipRouteTemplateResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_FlipRouteTemplateResponseFlipRouteTemplateResult_QNAME, RouteTemplate.class, FlipRouteTemplateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = BalanceRouteTemplates.class)
    public JAXBElement<RegionContext> createBalanceRouteTemplatesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, BalanceRouteTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateInstances", scope = BalanceRouteTemplates.class)
    public JAXBElement<ArrayOfDomainInstance> createBalanceRouteTemplatesRouteTemplateInstances(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_DeleteRouteTemplatesRouteTemplateInstances_QNAME, ArrayOfDomainInstance.class, BalanceRouteTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "BalanceRouteTemplatesResult", scope = BalanceRouteTemplatesResponse.class)
    public JAXBElement<ArrayOfRouteTemplate> createBalanceRouteTemplatesResponseBalanceRouteTemplatesResult(ArrayOfRouteTemplate value) {
        return new JAXBElement<ArrayOfRouteTemplate>(_BalanceRouteTemplatesResponseBalanceRouteTemplatesResult_QNAME, ArrayOfRouteTemplate.class, BalanceRouteTemplatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SequenceRouteTemplate.class)
    public JAXBElement<RegionContext> createSequenceRouteTemplateContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SequenceRouteTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateInstance", scope = SequenceRouteTemplate.class)
    public JAXBElement<DomainInstance> createSequenceRouteTemplateRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_FlipRouteTemplateRouteTemplateInstance_QNAME, DomainInstance.class, SequenceRouteTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SequenceRouteTemplateResult", scope = SequenceRouteTemplateResponse.class)
    public JAXBElement<RouteTemplate> createSequenceRouteTemplateResponseSequenceRouteTemplateResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_SequenceRouteTemplateResponseSequenceRouteTemplateResult_QNAME, RouteTemplate.class, SequenceRouteTemplateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SequenceRouteTemplateRange.class)
    public JAXBElement<RegionContext> createSequenceRouteTemplateRangeContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SequenceRouteTemplateRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateInstance", scope = SequenceRouteTemplateRange.class)
    public JAXBElement<DomainInstance> createSequenceRouteTemplateRangeRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_FlipRouteTemplateRouteTemplateInstance_QNAME, DomainInstance.class, SequenceRouteTemplateRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SequenceRouteTemplateRangeResult", scope = SequenceRouteTemplateRangeResponse.class)
    public JAXBElement<RouteTemplate> createSequenceRouteTemplateRangeResponseSequenceRouteTemplateRangeResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_SequenceRouteTemplateRangeResponseSequenceRouteTemplateRangeResult_QNAME, RouteTemplate.class, SequenceRouteTemplateRangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = InsertStopTemplates.class)
    public JAXBElement<RegionContext> createInsertStopTemplatesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, InsertStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "serviceLocationEntityKeys", scope = InsertStopTemplates.class)
    public JAXBElement<ArrayOflong> createInsertStopTemplatesServiceLocationEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RetrieveOrderInfosServiceLocationEntityKeys_QNAME, ArrayOflong.class, InsertStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = InsertStopTemplates.class)
    public JAXBElement<TemplatePlacement> createInsertStopTemplatesPlacement(TemplatePlacement value) {
        return new JAXBElement<TemplatePlacement>(_MoveStopsPlacement_QNAME, TemplatePlacement.class, InsertStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "InsertStopTemplatesResult", scope = InsertStopTemplatesResponse.class)
    public JAXBElement<RouteTemplate> createInsertStopTemplatesResponseInsertStopTemplatesResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_InsertStopTemplatesResponseInsertStopTemplatesResult_QNAME, RouteTemplate.class, InsertStopTemplatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = InsertStopTemplatesAtBestPosition.class)
    public JAXBElement<RegionContext> createInsertStopTemplatesAtBestPositionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, InsertStopTemplatesAtBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "serviceLocationEntityKeys", scope = InsertStopTemplatesAtBestPosition.class)
    public JAXBElement<ArrayOflong> createInsertStopTemplatesAtBestPositionServiceLocationEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RetrieveOrderInfosServiceLocationEntityKeys_QNAME, ArrayOflong.class, InsertStopTemplatesAtBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "destinationRouteTemplateInstance", scope = InsertStopTemplatesAtBestPosition.class)
    public JAXBElement<DomainInstance> createInsertStopTemplatesAtBestPositionDestinationRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_CombineRouteTemplatesDestinationRouteTemplateInstance_QNAME, DomainInstance.class, InsertStopTemplatesAtBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "InsertStopTemplatesAtBestPositionResult", scope = InsertStopTemplatesAtBestPositionResponse.class)
    public JAXBElement<RouteTemplate> createInsertStopTemplatesAtBestPositionResponseInsertStopTemplatesAtBestPositionResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_InsertStopTemplatesAtBestPositionResponseInsertStopTemplatesAtBestPositionResult_QNAME, RouteTemplate.class, InsertStopTemplatesAtBestPositionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = DeleteStopTemplates.class)
    public JAXBElement<RegionContext> createDeleteStopTemplatesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, DeleteStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateInstance", scope = DeleteStopTemplates.class)
    public JAXBElement<DomainInstance> createDeleteStopTemplatesRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_FlipRouteTemplateRouteTemplateInstance_QNAME, DomainInstance.class, DeleteStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopTemplateEntityKeys", scope = DeleteStopTemplates.class)
    public JAXBElement<ArrayOflong> createDeleteStopTemplatesStopTemplateEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_DeleteStopTemplatesStopTemplateEntityKeys_QNAME, ArrayOflong.class, DeleteStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "DeleteStopTemplatesResult", scope = DeleteStopTemplatesResponse.class)
    public JAXBElement<RouteTemplate> createDeleteStopTemplatesResponseDeleteStopTemplatesResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_DeleteStopTemplatesResponseDeleteStopTemplatesResult_QNAME, RouteTemplate.class, DeleteStopTemplatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveStopTemplates.class)
    public JAXBElement<RegionContext> createMoveStopTemplatesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateInstance", scope = MoveStopTemplates.class)
    public JAXBElement<DomainInstance> createMoveStopTemplatesRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_FlipRouteTemplateRouteTemplateInstance_QNAME, DomainInstance.class, MoveStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopTemplateEntityKeys", scope = MoveStopTemplates.class)
    public JAXBElement<ArrayOflong> createMoveStopTemplatesStopTemplateEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_DeleteStopTemplatesStopTemplateEntityKeys_QNAME, ArrayOflong.class, MoveStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveStopTemplates.class)
    public JAXBElement<TemplatePlacement> createMoveStopTemplatesPlacement(TemplatePlacement value) {
        return new JAXBElement<TemplatePlacement>(_MoveStopsPlacement_QNAME, TemplatePlacement.class, MoveStopTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveStopTemplatesResult", scope = MoveStopTemplatesResponse.class)
    public JAXBElement<RouteTemplate> createMoveStopTemplatesResponseMoveStopTemplatesResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_MoveStopTemplatesResponseMoveStopTemplatesResult_QNAME, RouteTemplate.class, MoveStopTemplatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveStopTemplatesAndLocations.class)
    public JAXBElement<RegionContext> createMoveStopTemplatesAndLocationsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveStopTemplatesAndLocations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateInstance", scope = MoveStopTemplatesAndLocations.class)
    public JAXBElement<DomainInstance> createMoveStopTemplatesAndLocationsRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_FlipRouteTemplateRouteTemplateInstance_QNAME, DomainInstance.class, MoveStopTemplatesAndLocations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopTemplateEntityKeys", scope = MoveStopTemplatesAndLocations.class)
    public JAXBElement<ArrayOflong> createMoveStopTemplatesAndLocationsStopTemplateEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_DeleteStopTemplatesStopTemplateEntityKeys_QNAME, ArrayOflong.class, MoveStopTemplatesAndLocations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "serviceLocationEntityKeys", scope = MoveStopTemplatesAndLocations.class)
    public JAXBElement<ArrayOflong> createMoveStopTemplatesAndLocationsServiceLocationEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RetrieveOrderInfosServiceLocationEntityKeys_QNAME, ArrayOflong.class, MoveStopTemplatesAndLocations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = MoveStopTemplatesAndLocations.class)
    public JAXBElement<TemplatePlacement> createMoveStopTemplatesAndLocationsPlacement(TemplatePlacement value) {
        return new JAXBElement<TemplatePlacement>(_MoveStopsPlacement_QNAME, TemplatePlacement.class, MoveStopTemplatesAndLocations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveStopTemplatesAndLocationsResult", scope = MoveStopTemplatesAndLocationsResponse.class)
    public JAXBElement<RouteTemplate> createMoveStopTemplatesAndLocationsResponseMoveStopTemplatesAndLocationsResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_MoveStopTemplatesAndLocationsResponseMoveStopTemplatesAndLocationsResult_QNAME, RouteTemplate.class, MoveStopTemplatesAndLocationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveStopTemplatesToBestPosition.class)
    public JAXBElement<RegionContext> createMoveStopTemplatesToBestPositionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveStopTemplatesToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateInstance", scope = MoveStopTemplatesToBestPosition.class)
    public JAXBElement<DomainInstance> createMoveStopTemplatesToBestPositionRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_FlipRouteTemplateRouteTemplateInstance_QNAME, DomainInstance.class, MoveStopTemplatesToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopTemplateEntityKeys", scope = MoveStopTemplatesToBestPosition.class)
    public JAXBElement<ArrayOflong> createMoveStopTemplatesToBestPositionStopTemplateEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_DeleteStopTemplatesStopTemplateEntityKeys_QNAME, ArrayOflong.class, MoveStopTemplatesToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "destinationRouteTemplateInstance", scope = MoveStopTemplatesToBestPosition.class)
    public JAXBElement<DomainInstance> createMoveStopTemplatesToBestPositionDestinationRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_CombineRouteTemplatesDestinationRouteTemplateInstance_QNAME, DomainInstance.class, MoveStopTemplatesToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveStopTemplatesToBestPositionResult", scope = MoveStopTemplatesToBestPositionResponse.class)
    public JAXBElement<RouteTemplate> createMoveStopTemplatesToBestPositionResponseMoveStopTemplatesToBestPositionResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_MoveStopTemplatesToBestPositionResponseMoveStopTemplatesToBestPositionResult_QNAME, RouteTemplate.class, MoveStopTemplatesToBestPositionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = MoveStopTemplatesAndLocationsToBestPosition.class)
    public JAXBElement<RegionContext> createMoveStopTemplatesAndLocationsToBestPositionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, MoveStopTemplatesAndLocationsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateInstance", scope = MoveStopTemplatesAndLocationsToBestPosition.class)
    public JAXBElement<DomainInstance> createMoveStopTemplatesAndLocationsToBestPositionRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_FlipRouteTemplateRouteTemplateInstance_QNAME, DomainInstance.class, MoveStopTemplatesAndLocationsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "stopTemplateEntityKeys", scope = MoveStopTemplatesAndLocationsToBestPosition.class)
    public JAXBElement<ArrayOflong> createMoveStopTemplatesAndLocationsToBestPositionStopTemplateEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_DeleteStopTemplatesStopTemplateEntityKeys_QNAME, ArrayOflong.class, MoveStopTemplatesAndLocationsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "serviceLocationEntityKeys", scope = MoveStopTemplatesAndLocationsToBestPosition.class)
    public JAXBElement<ArrayOflong> createMoveStopTemplatesAndLocationsToBestPositionServiceLocationEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_RetrieveOrderInfosServiceLocationEntityKeys_QNAME, ArrayOflong.class, MoveStopTemplatesAndLocationsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "destinationRouteTemplateInstance", scope = MoveStopTemplatesAndLocationsToBestPosition.class)
    public JAXBElement<DomainInstance> createMoveStopTemplatesAndLocationsToBestPositionDestinationRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_CombineRouteTemplatesDestinationRouteTemplateInstance_QNAME, DomainInstance.class, MoveStopTemplatesAndLocationsToBestPosition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MoveStopTemplatesAndLocationsToBestPositionResult", scope = MoveStopTemplatesAndLocationsToBestPositionResponse.class)
    public JAXBElement<RouteTemplate> createMoveStopTemplatesAndLocationsToBestPositionResponseMoveStopTemplatesAndLocationsToBestPositionResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_MoveStopTemplatesAndLocationsToBestPositionResponseMoveStopTemplatesAndLocationsToBestPositionResult_QNAME, RouteTemplate.class, MoveStopTemplatesAndLocationsToBestPositionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = InsertMidRouteDepotStopTemplate.class)
    public JAXBElement<RegionContext> createInsertMidRouteDepotStopTemplateContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, InsertMidRouteDepotStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMidRouteDepotStopTemplateArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "midRouteDepotStopArgs", scope = InsertMidRouteDepotStopTemplate.class)
    public JAXBElement<SaveMidRouteDepotStopTemplateArgs> createInsertMidRouteDepotStopTemplateMidRouteDepotStopArgs(SaveMidRouteDepotStopTemplateArgs value) {
        return new JAXBElement<SaveMidRouteDepotStopTemplateArgs>(_InsertMidRouteDepotStopMidRouteDepotStopArgs_QNAME, SaveMidRouteDepotStopTemplateArgs.class, InsertMidRouteDepotStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = InsertMidRouteDepotStopTemplate.class)
    public JAXBElement<TemplatePlacement> createInsertMidRouteDepotStopTemplatePlacement(TemplatePlacement value) {
        return new JAXBElement<TemplatePlacement>(_MoveStopsPlacement_QNAME, TemplatePlacement.class, InsertMidRouteDepotStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "InsertMidRouteDepotStopTemplateResult", scope = InsertMidRouteDepotStopTemplateResponse.class)
    public JAXBElement<RouteTemplate> createInsertMidRouteDepotStopTemplateResponseInsertMidRouteDepotStopTemplateResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_InsertMidRouteDepotStopTemplateResponseInsertMidRouteDepotStopTemplateResult_QNAME, RouteTemplate.class, InsertMidRouteDepotStopTemplateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateMidRouteDepotStopTemplate.class)
    public JAXBElement<RegionContext> createUpdateMidRouteDepotStopTemplateContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateMidRouteDepotStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMidRouteDepotStopTemplateArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "midRouteDepotStopArgs", scope = UpdateMidRouteDepotStopTemplate.class)
    public JAXBElement<SaveMidRouteDepotStopTemplateArgs> createUpdateMidRouteDepotStopTemplateMidRouteDepotStopArgs(SaveMidRouteDepotStopTemplateArgs value) {
        return new JAXBElement<SaveMidRouteDepotStopTemplateArgs>(_InsertMidRouteDepotStopMidRouteDepotStopArgs_QNAME, SaveMidRouteDepotStopTemplateArgs.class, UpdateMidRouteDepotStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteTemplateInstance", scope = UpdateMidRouteDepotStopTemplate.class)
    public JAXBElement<DomainInstance> createUpdateMidRouteDepotStopTemplateOwningRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_UpdateMidRouteDepotStopTemplateOwningRouteTemplateInstance_QNAME, DomainInstance.class, UpdateMidRouteDepotStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateMidRouteDepotStopTemplateResult", scope = UpdateMidRouteDepotStopTemplateResponse.class)
    public JAXBElement<RouteTemplate> createUpdateMidRouteDepotStopTemplateResponseUpdateMidRouteDepotStopTemplateResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_UpdateMidRouteDepotStopTemplateResponseUpdateMidRouteDepotStopTemplateResult_QNAME, RouteTemplate.class, UpdateMidRouteDepotStopTemplateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = InsertLayoverStopTemplate.class)
    public JAXBElement<RegionContext> createInsertLayoverStopTemplateContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, InsertLayoverStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveLayoverStopTemplateArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "args", scope = InsertLayoverStopTemplate.class)
    public JAXBElement<SaveLayoverStopTemplateArgs> createInsertLayoverStopTemplateArgs(SaveLayoverStopTemplateArgs value) {
        return new JAXBElement<SaveLayoverStopTemplateArgs>(_RetrieveServiceLocationServiceStatisticsArgs_QNAME, SaveLayoverStopTemplateArgs.class, InsertLayoverStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "placement", scope = InsertLayoverStopTemplate.class)
    public JAXBElement<TemplatePlacement> createInsertLayoverStopTemplatePlacement(TemplatePlacement value) {
        return new JAXBElement<TemplatePlacement>(_MoveStopsPlacement_QNAME, TemplatePlacement.class, InsertLayoverStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "InsertLayoverStopTemplateResult", scope = InsertLayoverStopTemplateResponse.class)
    public JAXBElement<RouteTemplate> createInsertLayoverStopTemplateResponseInsertLayoverStopTemplateResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_InsertLayoverStopTemplateResponseInsertLayoverStopTemplateResult_QNAME, RouteTemplate.class, InsertLayoverStopTemplateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateLayoverStopTemplate.class)
    public JAXBElement<RegionContext> createUpdateLayoverStopTemplateContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateLayoverStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveLayoverStopTemplateArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "args", scope = UpdateLayoverStopTemplate.class)
    public JAXBElement<SaveLayoverStopTemplateArgs> createUpdateLayoverStopTemplateArgs(SaveLayoverStopTemplateArgs value) {
        return new JAXBElement<SaveLayoverStopTemplateArgs>(_RetrieveServiceLocationServiceStatisticsArgs_QNAME, SaveLayoverStopTemplateArgs.class, UpdateLayoverStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteTemplateInstance", scope = UpdateLayoverStopTemplate.class)
    public JAXBElement<DomainInstance> createUpdateLayoverStopTemplateOwningRouteTemplateInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_UpdateMidRouteDepotStopTemplateOwningRouteTemplateInstance_QNAME, DomainInstance.class, UpdateLayoverStopTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateLayoverStopTemplateResult", scope = UpdateLayoverStopTemplateResponse.class)
    public JAXBElement<RouteTemplate> createUpdateLayoverStopTemplateResponseUpdateLayoverStopTemplateResult(RouteTemplate value) {
        return new JAXBElement<RouteTemplate>(_UpdateLayoverStopTemplateResponseUpdateLayoverStopTemplateResult_QNAME, RouteTemplate.class, UpdateLayoverStopTemplateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SuggestTemplateLayovers.class)
    public JAXBElement<RegionContext> createSuggestTemplateLayoversContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SuggestTemplateLayovers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestLayoverTemplateOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = SuggestTemplateLayovers.class)
    public JAXBElement<SuggestLayoverTemplateOptions> createSuggestTemplateLayoversOptions(SuggestLayoverTemplateOptions value) {
        return new JAXBElement<SuggestLayoverTemplateOptions>(_MultiRetrieveOptions_QNAME, SuggestLayoverTemplateOptions.class, SuggestTemplateLayovers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestLayoverResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SuggestTemplateLayoversResult", scope = SuggestTemplateLayoversResponse.class)
    public JAXBElement<SuggestLayoverResult> createSuggestTemplateLayoversResponseSuggestTemplateLayoversResult(SuggestLayoverResult value) {
        return new JAXBElement<SuggestLayoverResult>(_SuggestTemplateLayoversResponseSuggestTemplateLayoversResult_QNAME, SuggestLayoverResult.class, SuggestTemplateLayoversResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SuggestRouteTemplateForServiceLocation.class)
    public JAXBElement<RegionContext> createSuggestRouteTemplateForServiceLocationContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SuggestRouteTemplateForServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteTemplateCandidates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "candidates", scope = SuggestRouteTemplateForServiceLocation.class)
    public JAXBElement<SuggestRouteTemplateCandidates> createSuggestRouteTemplateForServiceLocationCandidates(SuggestRouteTemplateCandidates value) {
        return new JAXBElement<SuggestRouteTemplateCandidates>(_SuggestRouteTemplateForServiceLocationCandidates_QNAME, SuggestRouteTemplateCandidates.class, SuggestRouteTemplateForServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteTemplateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SuggestRouteTemplateForServiceLocationResult", scope = SuggestRouteTemplateForServiceLocationResponse.class)
    public JAXBElement<SuggestRouteTemplateResult> createSuggestRouteTemplateForServiceLocationResponseSuggestRouteTemplateForServiceLocationResult(SuggestRouteTemplateResult value) {
        return new JAXBElement<SuggestRouteTemplateResult>(_SuggestRouteTemplateForServiceLocationResponseSuggestRouteTemplateForServiceLocationResult_QNAME, SuggestRouteTemplateResult.class, SuggestRouteTemplateForServiceLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = SaveRouteTemplateFromRoute.class)
    public JAXBElement<RegionContext> createSaveRouteTemplateFromRouteContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, SaveRouteTemplateFromRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRouteTemplateFromRouteArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "saveArgs", scope = SaveRouteTemplateFromRoute.class)
    public JAXBElement<SaveRouteTemplateFromRouteArgs> createSaveRouteTemplateFromRouteSaveArgs(SaveRouteTemplateFromRouteArgs value) {
        return new JAXBElement<SaveRouteTemplateFromRouteArgs>(_SaveRouteTemplateFromRouteSaveArgs_QNAME, SaveRouteTemplateFromRouteArgs.class, SaveRouteTemplateFromRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteTemplateFromRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SaveRouteTemplateFromRouteResult", scope = SaveRouteTemplateFromRouteResponse.class)
    public JAXBElement<ArrayOfSaveRouteTemplateFromRouteResult> createSaveRouteTemplateFromRouteResponseSaveRouteTemplateFromRouteResult(ArrayOfSaveRouteTemplateFromRouteResult value) {
        return new JAXBElement<ArrayOfSaveRouteTemplateFromRouteResult>(_SaveRouteTemplateFromRouteResponseSaveRouteTemplateFromRouteResult_QNAME, ArrayOfSaveRouteTemplateFromRouteResult.class, SaveRouteTemplateFromRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = SendOrders.class)
    public JAXBElement<RegionContext> createSendOrdersRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, SendOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOrdersParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = SendOrders.class)
    public JAXBElement<SendOrdersParameters> createSendOrdersParameters(SendOrdersParameters value) {
        return new JAXBElement<SendOrdersParameters>(_RetrieveDVIRResultsParameters_QNAME, SendOrdersParameters.class, SendOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOrdersResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SendOrdersResult", scope = SendOrdersResponse.class)
    public JAXBElement<SendOrdersResults> createSendOrdersResponseSendOrdersResult(SendOrdersResults value) {
        return new JAXBElement<SendOrdersResults>(_SendOrdersResponseSendOrdersResult_QNAME, SendOrdersResults.class, SendOrdersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = SuggestRouteForUnassignedOrderGroup.class)
    public JAXBElement<RegionContext> createSuggestRouteForUnassignedOrderGroupRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, SuggestRouteForUnassignedOrderGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = SuggestRouteForUnassignedOrderGroup.class)
    public JAXBElement<SuggestRouteParameters> createSuggestRouteForUnassignedOrderGroupParameters(SuggestRouteParameters value) {
        return new JAXBElement<SuggestRouteParameters>(_RetrieveDVIRResultsParameters_QNAME, SuggestRouteParameters.class, SuggestRouteForUnassignedOrderGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "unassignedOrderGroupInstance", scope = SuggestRouteForUnassignedOrderGroup.class)
    public JAXBElement<DomainInstance> createSuggestRouteForUnassignedOrderGroupUnassignedOrderGroupInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_SuggestRouteForUnassignedOrderGroupUnassignedOrderGroupInstance_QNAME, DomainInstance.class, SuggestRouteForUnassignedOrderGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SuggestRouteForUnassignedOrderGroupResult", scope = SuggestRouteForUnassignedOrderGroupResponse.class)
    public JAXBElement<SuggestRouteResult> createSuggestRouteForUnassignedOrderGroupResponseSuggestRouteForUnassignedOrderGroupResult(SuggestRouteResult value) {
        return new JAXBElement<SuggestRouteResult>(_SuggestRouteForUnassignedOrderGroupResponseSuggestRouteForUnassignedOrderGroupResult_QNAME, SuggestRouteResult.class, SuggestRouteForUnassignedOrderGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = SuggestRouteForServiceableStop.class)
    public JAXBElement<RegionContext> createSuggestRouteForServiceableStopRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, SuggestRouteForServiceableStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = SuggestRouteForServiceableStop.class)
    public JAXBElement<SuggestRouteParameters> createSuggestRouteForServiceableStopParameters(SuggestRouteParameters value) {
        return new JAXBElement<SuggestRouteParameters>(_RetrieveDVIRResultsParameters_QNAME, SuggestRouteParameters.class, SuggestRouteForServiceableStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "owningRouteInstance", scope = SuggestRouteForServiceableStop.class)
    public JAXBElement<DomainInstance> createSuggestRouteForServiceableStopOwningRouteInstance(DomainInstance value) {
        return new JAXBElement<DomainInstance>(_MoveStopsOwningRouteInstance_QNAME, DomainInstance.class, SuggestRouteForServiceableStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SuggestRouteForServiceableStopResult", scope = SuggestRouteForServiceableStopResponse.class)
    public JAXBElement<SuggestRouteResult> createSuggestRouteForServiceableStopResponseSuggestRouteForServiceableStopResult(SuggestRouteResult value) {
        return new JAXBElement<SuggestRouteResult>(_SuggestRouteForServiceableStopResponseSuggestRouteForServiceableStopResult_QNAME, SuggestRouteResult.class, SuggestRouteForServiceableStopResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = Save.class)
    public JAXBElement<RegionContext> createSaveRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, Save.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAggregateRootEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "objects", scope = Save.class)
    public JAXBElement<ArrayOfAggregateRootEntity> createSaveObjects(ArrayOfAggregateRootEntity value) {
        return new JAXBElement<ArrayOfAggregateRootEntity>(_SaveObjects_QNAME, ArrayOfAggregateRootEntity.class, Save.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = Save.class)
    public JAXBElement<SaveOptions> createSaveOptions(SaveOptions value) {
        return new JAXBElement<SaveOptions>(_MultiRetrieveOptions_QNAME, SaveOptions.class, Save.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SaveResult", scope = SaveResponse.class)
    public JAXBElement<ArrayOfSaveResult> createSaveResponseSaveResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_SaveResponseSaveResult_QNAME, ArrayOfSaveResult.class, SaveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "newPassword", scope = SetWorkerPassword.class)
    public JAXBElement<String> createSetWorkerPasswordNewPassword(String value) {
        return new JAXBElement<String>(_ChangePasswordNewPassword_QNAME, String.class, SetWorkerPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomEntityMetaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "objects", scope = ApplyCustomExtensions.class)
    public JAXBElement<ArrayOfCustomEntityMetaData> createApplyCustomExtensionsObjects(ArrayOfCustomEntityMetaData value) {
        return new JAXBElement<ArrayOfCustomEntityMetaData>(_SaveObjects_QNAME, ArrayOfCustomEntityMetaData.class, ApplyCustomExtensions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = ApplyCustomExtensions.class)
    public JAXBElement<SaveOptions> createApplyCustomExtensionsOptions(SaveOptions value) {
        return new JAXBElement<SaveOptions>(_MultiRetrieveOptions_QNAME, SaveOptions.class, ApplyCustomExtensions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ApplyCustomExtensionsResult", scope = ApplyCustomExtensionsResponse.class)
    public JAXBElement<ArrayOfSaveResult> createApplyCustomExtensionsResponseApplyCustomExtensionsResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_ApplyCustomExtensionsResponseApplyCustomExtensionsResult_QNAME, ArrayOfSaveResult.class, ApplyCustomExtensionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = AutoCreateRoutingSession.class)
    public JAXBElement<RegionContext> createAutoCreateRoutingSessionRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, AutoCreateRoutingSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "date", scope = AutoCreateRoutingSession.class)
    public JAXBElement<XMLGregorianCalendar> createAutoCreateRoutingSessionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AutoCreateRoutingSessionDate_QNAME, XMLGregorianCalendar.class, AutoCreateRoutingSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "AutoCreateRoutingSessionResult", scope = AutoCreateRoutingSessionResponse.class)
    public JAXBElement<RoutingSession> createAutoCreateRoutingSessionResponseAutoCreateRoutingSessionResult(RoutingSession value) {
        return new JAXBElement<RoutingSession>(_AutoCreateRoutingSessionResponseAutoCreateRoutingSessionResult_QNAME, RoutingSession.class, AutoCreateRoutingSessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = AutoCreateRoutingSessionAdvanced.class)
    public JAXBElement<RegionContext> createAutoCreateRoutingSessionAdvancedRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, AutoCreateRoutingSessionAdvanced.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "date", scope = AutoCreateRoutingSessionAdvanced.class)
    public JAXBElement<XMLGregorianCalendar> createAutoCreateRoutingSessionAdvancedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AutoCreateRoutingSessionDate_QNAME, XMLGregorianCalendar.class, AutoCreateRoutingSessionAdvanced.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "additionalDescription", scope = AutoCreateRoutingSessionAdvanced.class)
    public JAXBElement<String> createAutoCreateRoutingSessionAdvancedAdditionalDescription(String value) {
        return new JAXBElement<String>(_AutoCreateRoutingSessionAdvancedAdditionalDescription_QNAME, String.class, AutoCreateRoutingSessionAdvanced.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "depotEntityKey", scope = AutoCreateRoutingSessionAdvanced.class)
    public JAXBElement<Long> createAutoCreateRoutingSessionAdvancedDepotEntityKey(Long value) {
        return new JAXBElement<Long>(_AutoCreateRoutingSessionAdvancedDepotEntityKey_QNAME, Long.class, AutoCreateRoutingSessionAdvanced.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "AutoCreateRoutingSessionAdvancedResult", scope = AutoCreateRoutingSessionAdvancedResponse.class)
    public JAXBElement<RoutingSession> createAutoCreateRoutingSessionAdvancedResponseAutoCreateRoutingSessionAdvancedResult(RoutingSession value) {
        return new JAXBElement<RoutingSession>(_AutoCreateRoutingSessionAdvancedResponseAutoCreateRoutingSessionAdvancedResult_QNAME, RoutingSession.class, AutoCreateRoutingSessionAdvancedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDailyRoutingSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routingSessions", scope = UpdateActivePass.class)
    public JAXBElement<ArrayOfDailyRoutingSession> createUpdateActivePassRoutingSessions(ArrayOfDailyRoutingSession value) {
        return new JAXBElement<ArrayOfDailyRoutingSession>(_UpdateActivePassRoutingSessions_QNAME, ArrayOfDailyRoutingSession.class, UpdateActivePass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateActivePasses.class)
    public JAXBElement<RegionContext> createUpdateActivePassesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateActivePasses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateActivePassesParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = UpdateActivePasses.class)
    public JAXBElement<UpdateActivePassesParameters> createUpdateActivePassesOptions(UpdateActivePassesParameters value) {
        return new JAXBElement<UpdateActivePassesParameters>(_MultiRetrieveOptions_QNAME, UpdateActivePassesParameters.class, UpdateActivePasses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RouteUnassignedOrders.class)
    public JAXBElement<RegionContext> createRouteUnassignedOrdersRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RouteUnassignedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "unassignedOrders", scope = RouteUnassignedOrders.class)
    public JAXBElement<ArrayOfDomainInstance> createRouteUnassignedOrdersUnassignedOrders(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_RouteUnassignedOrdersUnassignedOrders_QNAME, ArrayOfDomainInstance.class, RouteUnassignedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RouteUnassignedOrders.class)
    public JAXBElement<RoutingParameters> createRouteUnassignedOrdersOptions(RoutingParameters value) {
        return new JAXBElement<RoutingParameters>(_MultiRetrieveOptions_QNAME, RoutingParameters.class, RouteUnassignedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RouteUnassignedOrderGroups.class)
    public JAXBElement<RegionContext> createRouteUnassignedOrderGroupsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RouteUnassignedOrderGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "unassignedOrderGroups", scope = RouteUnassignedOrderGroups.class)
    public JAXBElement<ArrayOfDomainInstance> createRouteUnassignedOrderGroupsUnassignedOrderGroups(ArrayOfDomainInstance value) {
        return new JAXBElement<ArrayOfDomainInstance>(_RouteUnassignedOrderGroupsUnassignedOrderGroups_QNAME, ArrayOfDomainInstance.class, RouteUnassignedOrderGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RouteUnassignedOrderGroups.class)
    public JAXBElement<RoutingParameters> createRouteUnassignedOrderGroupsOptions(RoutingParameters value) {
        return new JAXBElement<RoutingParameters>(_MultiRetrieveOptions_QNAME, RoutingParameters.class, RouteUnassignedOrderGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = FindAndRouteUnassignedOrders.class)
    public JAXBElement<RegionContext> createFindAndRouteUnassignedOrdersRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, FindAndRouteUnassignedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "orderCriteria", scope = FindAndRouteUnassignedOrders.class)
    public JAXBElement<SimpleExpressionBase> createFindAndRouteUnassignedOrdersOrderCriteria(SimpleExpressionBase value) {
        return new JAXBElement<SimpleExpressionBase>(_FindAndRouteUnassignedOrdersOrderCriteria_QNAME, SimpleExpressionBase.class, FindAndRouteUnassignedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = FindAndRouteUnassignedOrders.class)
    public JAXBElement<RoutingParameters> createFindAndRouteUnassignedOrdersOptions(RoutingParameters value) {
        return new JAXBElement<RoutingParameters>(_MultiRetrieveOptions_QNAME, RoutingParameters.class, FindAndRouteUnassignedOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = GenerateRouteTravelPath.class)
    public JAXBElement<RegionContext> createGenerateRouteTravelPathRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, GenerateRouteTravelPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateRouteTravelPathOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = GenerateRouteTravelPath.class)
    public JAXBElement<GenerateRouteTravelPathOptions> createGenerateRouteTravelPathOptions(GenerateRouteTravelPathOptions value) {
        return new JAXBElement<GenerateRouteTravelPathOptions>(_MultiRetrieveOptions_QNAME, GenerateRouteTravelPathOptions.class, GenerateRouteTravelPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelPathResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "GenerateRouteTravelPathResult", scope = GenerateRouteTravelPathResponse.class)
    public JAXBElement<TravelPathResult> createGenerateRouteTravelPathResponseGenerateRouteTravelPathResult(TravelPathResult value) {
        return new JAXBElement<TravelPathResult>(_GenerateRouteTravelPathResponseGenerateRouteTravelPathResult_QNAME, TravelPathResult.class, GenerateRouteTravelPathResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = GenerateRoutePath.class)
    public JAXBElement<RegionContext> createGenerateRoutePathRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, GenerateRoutePath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateRoutePathOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = GenerateRoutePath.class)
    public JAXBElement<GenerateRoutePathOptions> createGenerateRoutePathOptions(GenerateRoutePathOptions value) {
        return new JAXBElement<GenerateRoutePathOptions>(_MultiRetrieveOptions_QNAME, GenerateRoutePathOptions.class, GenerateRoutePath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePathResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "GenerateRoutePathResult", scope = GenerateRoutePathResponse.class)
    public JAXBElement<RoutePathResult> createGenerateRoutePathResponseGenerateRoutePathResult(RoutePathResult value) {
        return new JAXBElement<RoutePathResult>(_GenerateRoutePathResponseGenerateRoutePathResult_QNAME, RoutePathResult.class, GenerateRoutePathResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = GenerateRouteTemplateTravelPath.class)
    public JAXBElement<RegionContext> createGenerateRouteTemplateTravelPathContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, GenerateRouteTemplateTravelPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateRouteTemplateTravelPathOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = GenerateRouteTemplateTravelPath.class)
    public JAXBElement<GenerateRouteTemplateTravelPathOptions> createGenerateRouteTemplateTravelPathOptions(GenerateRouteTemplateTravelPathOptions value) {
        return new JAXBElement<GenerateRouteTemplateTravelPathOptions>(_MultiRetrieveOptions_QNAME, GenerateRouteTemplateTravelPathOptions.class, GenerateRouteTemplateTravelPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelPathResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "GenerateRouteTemplateTravelPathResult", scope = GenerateRouteTemplateTravelPathResponse.class)
    public JAXBElement<TravelPathResult> createGenerateRouteTemplateTravelPathResponseGenerateRouteTemplateTravelPathResult(TravelPathResult value) {
        return new JAXBElement<TravelPathResult>(_GenerateRouteTemplateTravelPathResponseGenerateRouteTemplateTravelPathResult_QNAME, TravelPathResult.class, GenerateRouteTemplateTravelPathResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvancedLoggingOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = ConfigureAdvancedLogging.class)
    public JAXBElement<AdvancedLoggingOptions> createConfigureAdvancedLoggingOptions(AdvancedLoggingOptions value) {
        return new JAXBElement<AdvancedLoggingOptions>(_MultiRetrieveOptions_QNAME, AdvancedLoggingOptions.class, ConfigureAdvancedLogging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = UpdateServiceTime.class)
    public JAXBElement<RegionContext> createUpdateServiceTimeContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, UpdateServiceTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateServiceTimeParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = UpdateServiceTime.class)
    public JAXBElement<UpdateServiceTimeParameters> createUpdateServiceTimeParameters(UpdateServiceTimeParameters value) {
        return new JAXBElement<UpdateServiceTimeParameters>(_RetrieveDVIRResultsParameters_QNAME, UpdateServiceTimeParameters.class, UpdateServiceTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ReportClientStatistics.class)
    public JAXBElement<RegionContext> createReportClientStatisticsContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ReportClientStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "date", scope = ReportClientStatistics.class)
    public JAXBElement<XMLGregorianCalendar> createReportClientStatisticsDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AutoCreateRoutingSessionDate_QNAME, XMLGregorianCalendar.class, ReportClientStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "clientStatistics", scope = ReportClientStatistics.class)
    public JAXBElement<ClientStatistics> createReportClientStatisticsClientStatistics(ClientStatistics value) {
        return new JAXBElement<ClientStatistics>(_ReportClientStatisticsClientStatistics_QNAME, ClientStatistics.class, ReportClientStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CreateRoutes.class)
    public JAXBElement<RegionContext> createCreateRoutesContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CreateRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateRouteArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = CreateRoutes.class)
    public JAXBElement<ArrayOfCreateRouteArgs> createCreateRoutesParameters(ArrayOfCreateRouteArgs value) {
        return new JAXBElement<ArrayOfCreateRouteArgs>(_RetrieveDVIRResultsParameters_QNAME, ArrayOfCreateRouteArgs.class, CreateRoutes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CreateStaticRoutesFromTemplateSetWithSessionKey.class)
    public JAXBElement<RegionContext> createCreateStaticRoutesFromTemplateSetWithSessionKeyContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CreateStaticRoutesFromTemplateSetWithSessionKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateSetKey", scope = CreateStaticRoutesFromTemplateSetWithSessionKey.class)
    public JAXBElement<ArrayOflong> createCreateStaticRoutesFromTemplateSetWithSessionKeyRouteTemplateSetKey(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_CreateStaticRoutesFromTemplateSetWithSessionKeyRouteTemplateSetKey_QNAME, ArrayOflong.class, CreateStaticRoutesFromTemplateSetWithSessionKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = CreateStaticRoutesFromTemplateSetWithSessionDate.class)
    public JAXBElement<RegionContext> createCreateStaticRoutesFromTemplateSetWithSessionDateContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, CreateStaticRoutesFromTemplateSetWithSessionDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "routeTemplateSetKey", scope = CreateStaticRoutesFromTemplateSetWithSessionDate.class)
    public JAXBElement<ArrayOflong> createCreateStaticRoutesFromTemplateSetWithSessionDateRouteTemplateSetKey(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_CreateStaticRoutesFromTemplateSetWithSessionKeyRouteTemplateSetKey_QNAME, ArrayOflong.class, CreateStaticRoutesFromTemplateSetWithSessionDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "sessionDate", scope = CreateStaticRoutesFromTemplateSetWithSessionDate.class)
    public JAXBElement<XMLGregorianCalendar> createCreateStaticRoutesFromTemplateSetWithSessionDateSessionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateStaticRoutesFromTemplateSetWithSessionDateSessionDate_QNAME, XMLGregorianCalendar.class, CreateStaticRoutesFromTemplateSetWithSessionDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ShutdownEquipment.class)
    public JAXBElement<RegionContext> createShutdownEquipmentContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ShutdownEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "context", scope = ReEnableEquipment.class)
    public JAXBElement<RegionContext> createReEnableEquipmentContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_RetrieveTransferableEntitiesContext_QNAME, RegionContext.class, ReEnableEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = ClearEquipmentPanicButton.class)
    public JAXBElement<RegionContext> createClearEquipmentPanicButtonRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, ClearEquipmentPanicButton.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDiagnosticsInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "diagnosticsInformation", scope = UploadDiagnosticsInformation.class)
    public JAXBElement<ClientDiagnosticsInformation> createUploadDiagnosticsInformationDiagnosticsInformation(ClientDiagnosticsInformation value) {
        return new JAXBElement<ClientDiagnosticsInformation>(_UploadDiagnosticsInformationDiagnosticsInformation_QNAME, ClientDiagnosticsInformation.class, UploadDiagnosticsInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClientDiagnosticsInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveClientLogListResult", scope = RetrieveClientLogListResponse.class)
    public JAXBElement<ArrayOfClientDiagnosticsInformation> createRetrieveClientLogListResponseRetrieveClientLogListResult(ArrayOfClientDiagnosticsInformation value) {
        return new JAXBElement<ArrayOfClientDiagnosticsInformation>(_RetrieveClientLogListResponseRetrieveClientLogListResult_QNAME, ArrayOfClientDiagnosticsInformation.class, RetrieveClientLogListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "fileNames", scope = GetMergedClientLogFile.class)
    public JAXBElement<ArrayOfstring> createGetMergedClientLogFileFileNames(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetZippedClientLogFilesFileNames_QNAME, ArrayOfstring.class, GetMergedClientLogFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "GetMergedClientLogFileResult", scope = GetMergedClientLogFileResponse.class)
    public JAXBElement<byte[]> createGetMergedClientLogFileResponseGetMergedClientLogFileResult(byte[] value) {
        return new JAXBElement<byte[]>(_GetMergedClientLogFileResponseGetMergedClientLogFileResult_QNAME, byte[].class, GetMergedClientLogFileResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientApplicationVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveClientApplicationVersionResult", scope = RetrieveClientApplicationVersionResponse.class)
    public JAXBElement<ClientApplicationVersion> createRetrieveClientApplicationVersionResponseRetrieveClientApplicationVersionResult(ClientApplicationVersion value) {
        return new JAXBElement<ClientApplicationVersion>(_RetrieveClientApplicationVersionResponseRetrieveClientApplicationVersionResult_QNAME, ClientApplicationVersion.class, RetrieveClientApplicationVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClientApplicationVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveClientApplicationVersionsResult", scope = RetrieveClientApplicationVersionsResponse.class)
    public JAXBElement<ArrayOfClientApplicationVersion> createRetrieveClientApplicationVersionsResponseRetrieveClientApplicationVersionsResult(ArrayOfClientApplicationVersion value) {
        return new JAXBElement<ArrayOfClientApplicationVersion>(_RetrieveClientApplicationVersionsResponseRetrieveClientApplicationVersionsResult_QNAME, ArrayOfClientApplicationVersion.class, RetrieveClientApplicationVersionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientApplicationVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveGeneralReleaseClientApplicationVersionResult", scope = RetrieveGeneralReleaseClientApplicationVersionResponse.class)
    public JAXBElement<ClientApplicationVersion> createRetrieveGeneralReleaseClientApplicationVersionResponseRetrieveGeneralReleaseClientApplicationVersionResult(ClientApplicationVersion value) {
        return new JAXBElement<ClientApplicationVersion>(_RetrieveGeneralReleaseClientApplicationVersionResponseRetrieveGeneralReleaseClientApplicationVersionResult_QNAME, ClientApplicationVersion.class, RetrieveGeneralReleaseClientApplicationVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveAdmin.class)
    public JAXBElement<RetrievalOptions> createRetrieveAdminOptions(RetrievalOptions value) {
        return new JAXBElement<RetrievalOptions>(_MultiRetrieveOptions_QNAME, RetrievalOptions.class, RetrieveAdmin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveAdminResult", scope = RetrieveAdminResponse.class)
    public JAXBElement<RetrievalResults> createRetrieveAdminResponseRetrieveAdminResult(RetrievalResults value) {
        return new JAXBElement<RetrievalResults>(_RetrieveAdminResponseRetrieveAdminResult_QNAME, RetrievalResults.class, RetrieveAdminResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixBuildRequestMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveQueuedMatrixBuildRequestMessagesResult", scope = RetrieveQueuedMatrixBuildRequestMessagesResponse.class)
    public JAXBElement<MatrixBuildRequestMessages> createRetrieveQueuedMatrixBuildRequestMessagesResponseRetrieveQueuedMatrixBuildRequestMessagesResult(MatrixBuildRequestMessages value) {
        return new JAXBElement<MatrixBuildRequestMessages>(_RetrieveQueuedMatrixBuildRequestMessagesResponseRetrieveQueuedMatrixBuildRequestMessagesResult_QNAME, MatrixBuildRequestMessages.class, RetrieveQueuedMatrixBuildRequestMessagesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixBuildRequestResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveQueuedMatrixBuildRequestResultsResult", scope = RetrieveQueuedMatrixBuildRequestResultsResponse.class)
    public JAXBElement<MatrixBuildRequestResults> createRetrieveQueuedMatrixBuildRequestResultsResponseRetrieveQueuedMatrixBuildRequestResultsResult(MatrixBuildRequestResults value) {
        return new JAXBElement<MatrixBuildRequestResults>(_RetrieveQueuedMatrixBuildRequestResultsResponseRetrieveQueuedMatrixBuildRequestResultsResult_QNAME, MatrixBuildRequestResults.class, RetrieveQueuedMatrixBuildRequestResultsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "statsDate", scope = RetrieveCustomerRegionMatrixStatistics.class)
    public JAXBElement<XMLGregorianCalendar> createRetrieveCustomerRegionMatrixStatisticsStatsDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RetrieveCustomerRegionMatrixStatisticsStatsDate_QNAME, XMLGregorianCalendar.class, RetrieveCustomerRegionMatrixStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRegionMatrixStatisticsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveCustomerRegionMatrixStatisticsResult", scope = RetrieveCustomerRegionMatrixStatisticsResponse.class)
    public JAXBElement<CustomerRegionMatrixStatisticsResults> createRetrieveCustomerRegionMatrixStatisticsResponseRetrieveCustomerRegionMatrixStatisticsResult(CustomerRegionMatrixStatisticsResults value) {
        return new JAXBElement<CustomerRegionMatrixStatisticsResults>(_RetrieveCustomerRegionMatrixStatisticsResponseRetrieveCustomerRegionMatrixStatisticsResult_QNAME, CustomerRegionMatrixStatisticsResults.class, RetrieveCustomerRegionMatrixStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = MultiRetrieveAdmin.class)
    public JAXBElement<ArrayOfRetrievalOptions> createMultiRetrieveAdminOptions(ArrayOfRetrievalOptions value) {
        return new JAXBElement<ArrayOfRetrievalOptions>(_MultiRetrieveOptions_QNAME, ArrayOfRetrievalOptions.class, MultiRetrieveAdmin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRetrievalResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "MultiRetrieveAdminResult", scope = MultiRetrieveAdminResponse.class)
    public JAXBElement<ArrayOfRetrievalResults> createMultiRetrieveAdminResponseMultiRetrieveAdminResult(ArrayOfRetrievalResults value) {
        return new JAXBElement<ArrayOfRetrievalResults>(_MultiRetrieveAdminResponseMultiRetrieveAdminResult_QNAME, ArrayOfRetrievalResults.class, MultiRetrieveAdminResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMatrixResultsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "optionsDto", scope = RetrieveMatrixResults.class)
    public JAXBElement<RetrieveMatrixResultsOptions> createRetrieveMatrixResultsOptionsDto(RetrieveMatrixResultsOptions value) {
        return new JAXBElement<RetrieveMatrixResultsOptions>(_SuggestRouteSequenceOptionsDto_QNAME, RetrieveMatrixResultsOptions.class, RetrieveMatrixResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMatrixBuildResultExt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveMatrixResultsResult", scope = RetrieveMatrixResultsResponse.class)
    public JAXBElement<ArrayOfMatrixBuildResultExt> createRetrieveMatrixResultsResponseRetrieveMatrixResultsResult(ArrayOfMatrixBuildResultExt value) {
        return new JAXBElement<ArrayOfMatrixBuildResultExt>(_RetrieveMatrixResultsResponseRetrieveMatrixResultsResult_QNAME, ArrayOfMatrixBuildResultExt.class, RetrieveMatrixResultsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixBuildResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveCurrentlyBuildingMatrixBuildResultsFileResult", scope = RetrieveCurrentlyBuildingMatrixBuildResultsFileResponse.class)
    public JAXBElement<MatrixBuildResults> createRetrieveCurrentlyBuildingMatrixBuildResultsFileResponseRetrieveCurrentlyBuildingMatrixBuildResultsFileResult(MatrixBuildResults value) {
        return new JAXBElement<MatrixBuildResults>(_RetrieveCurrentlyBuildingMatrixBuildResultsFileResponseRetrieveCurrentlyBuildingMatrixBuildResultsFileResult_QNAME, MatrixBuildResults.class, RetrieveCurrentlyBuildingMatrixBuildResultsFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMatrixResultsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "optionsDto", scope = RetrieveMatrixBuildResultsFile.class)
    public JAXBElement<RetrieveMatrixResultsOptions> createRetrieveMatrixBuildResultsFileOptionsDto(RetrieveMatrixResultsOptions value) {
        return new JAXBElement<RetrieveMatrixResultsOptions>(_SuggestRouteSequenceOptionsDto_QNAME, RetrieveMatrixResultsOptions.class, RetrieveMatrixBuildResultsFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixBuildResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveMatrixBuildResultsFileResult", scope = RetrieveMatrixBuildResultsFileResponse.class)
    public JAXBElement<MatrixBuildResults> createRetrieveMatrixBuildResultsFileResponseRetrieveMatrixBuildResultsFileResult(MatrixBuildResults value) {
        return new JAXBElement<MatrixBuildResults>(_RetrieveMatrixBuildResultsFileResponseRetrieveMatrixBuildResultsFileResult_QNAME, MatrixBuildResults.class, RetrieveMatrixBuildResultsFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdminReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveAdminReportsResult", scope = RetrieveAdminReportsResponse.class)
    public JAXBElement<ArrayOfAdminReport> createRetrieveAdminReportsResponseRetrieveAdminReportsResult(ArrayOfAdminReport value) {
        return new JAXBElement<ArrayOfAdminReport>(_RetrieveAdminReportsResponseRetrieveAdminReportsResult_QNAME, ArrayOfAdminReport.class, RetrieveAdminReportsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAggregateRootEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "objects", scope = SaveAdmin.class)
    public JAXBElement<ArrayOfAggregateRootEntity> createSaveAdminObjects(ArrayOfAggregateRootEntity value) {
        return new JAXBElement<ArrayOfAggregateRootEntity>(_SaveObjects_QNAME, ArrayOfAggregateRootEntity.class, SaveAdmin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = SaveAdmin.class)
    public JAXBElement<SaveOptions> createSaveAdminOptions(SaveOptions value) {
        return new JAXBElement<SaveOptions>(_MultiRetrieveOptions_QNAME, SaveOptions.class, SaveAdmin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SaveAdminResult", scope = SaveAdminResponse.class)
    public JAXBElement<ArrayOfSaveResult> createSaveAdminResponseSaveAdminResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_SaveAdminResponseSaveAdminResult_QNAME, ArrayOfSaveResult.class, SaveAdminResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachCustomerParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = AttachCustomer.class)
    public JAXBElement<AttachCustomerParameters> createAttachCustomerParameters(AttachCustomerParameters value) {
        return new JAXBElement<AttachCustomerParameters>(_RetrieveDVIRResultsParameters_QNAME, AttachCustomerParameters.class, AttachCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerRegionsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = UpdateCustomerRegions.class)
    public JAXBElement<UpdateCustomerRegionsParameters> createUpdateCustomerRegionsParameters(UpdateCustomerRegionsParameters value) {
        return new JAXBElement<UpdateCustomerRegionsParameters>(_RetrieveDVIRResultsParameters_QNAME, UpdateCustomerRegionsParameters.class, UpdateCustomerRegions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "userEntityKeys", scope = SendNewUserEmail.class)
    public JAXBElement<ArrayOflong> createSendNewUserEmailUserEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SendNewUserEmailUserEntityKeys_QNAME, ArrayOflong.class, SendNewUserEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResetPasswordResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "SendNewUserEmailResult", scope = SendNewUserEmailResponse.class)
    public JAXBElement<ArrayOfResetPasswordResult> createSendNewUserEmailResponseSendNewUserEmailResult(ArrayOfResetPasswordResult value) {
        return new JAXBElement<ArrayOfResetPasswordResult>(_SendNewUserEmailResponseSendNewUserEmailResult_QNAME, ArrayOfResetPasswordResult.class, SendNewUserEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionEntityKeys", scope = ToggleMatrixBuildEnabledForCustomerRegions.class)
    public JAXBElement<ArrayOflong> createToggleMatrixBuildEnabledForCustomerRegionsRegionEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ToggleMatrixBuildEnabledForCustomerRegionsRegionEntityKeys_QNAME, ArrayOflong.class, ToggleMatrixBuildEnabledForCustomerRegions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ToggleMatrixBuildEnabledForCustomerRegionsResult", scope = ToggleMatrixBuildEnabledForCustomerRegionsResponse.class)
    public JAXBElement<ArrayOfSaveResult> createToggleMatrixBuildEnabledForCustomerRegionsResponseToggleMatrixBuildEnabledForCustomerRegionsResult(ArrayOfSaveResult value) {
        return new JAXBElement<ArrayOfSaveResult>(_ToggleMatrixBuildEnabledForCustomerRegionsResponseToggleMatrixBuildEnabledForCustomerRegionsResult_QNAME, ArrayOfSaveResult.class, ToggleMatrixBuildEnabledForCustomerRegionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShadowProductionParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = ShadowProduction.class)
    public JAXBElement<ShadowProductionParameters> createShadowProductionParameters(ShadowProductionParameters value) {
        return new JAXBElement<ShadowProductionParameters>(_RetrieveDVIRResultsParameters_QNAME, ShadowProductionParameters.class, ShadowProduction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = CreateCustomer.class)
    public JAXBElement<CreateCustomerParameters> createCreateCustomerParameters(CreateCustomerParameters value) {
        return new JAXBElement<CreateCustomerParameters>(_RetrieveDVIRResultsParameters_QNAME, CreateCustomerParameters.class, CreateCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomersParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = FindCustomerUsageData.class)
    public JAXBElement<FindCustomersParameters> createFindCustomerUsageDataParameters(FindCustomersParameters value) {
        return new JAXBElement<FindCustomersParameters>(_RetrieveDVIRResultsParameters_QNAME, FindCustomersParameters.class, FindCustomerUsageData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDatabaseParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = CreateDatabase.class)
    public JAXBElement<CreateDatabaseParameters> createCreateDatabaseParameters(CreateDatabaseParameters value) {
        return new JAXBElement<CreateDatabaseParameters>(_RetrieveDVIRResultsParameters_QNAME, CreateDatabaseParameters.class, CreateDatabase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeDataWarehouseParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = InitializeDataWarehouse.class)
    public JAXBElement<InitializeDataWarehouseParameters> createInitializeDataWarehouseParameters(InitializeDataWarehouseParameters value) {
        return new JAXBElement<InitializeDataWarehouseParameters>(_RetrieveDVIRResultsParameters_QNAME, InitializeDataWarehouseParameters.class, InitializeDataWarehouse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseIntegrationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveDataWarehouseIntegrationStatusResult", scope = RetrieveDataWarehouseIntegrationStatusResponse.class)
    public JAXBElement<DataWarehouseIntegrationStatus> createRetrieveDataWarehouseIntegrationStatusResponseRetrieveDataWarehouseIntegrationStatusResult(DataWarehouseIntegrationStatus value) {
        return new JAXBElement<DataWarehouseIntegrationStatus>(_RetrieveDataWarehouseIntegrationStatusResponseRetrieveDataWarehouseIntegrationStatusResult_QNAME, DataWarehouseIntegrationStatus.class, RetrieveDataWarehouseIntegrationStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseIntegrationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ResetDataWarehouseIntegrationStatusResult", scope = ResetDataWarehouseIntegrationStatusResponse.class)
    public JAXBElement<DataWarehouseIntegrationStatus> createResetDataWarehouseIntegrationStatusResponseResetDataWarehouseIntegrationStatusResult(DataWarehouseIntegrationStatus value) {
        return new JAXBElement<DataWarehouseIntegrationStatus>(_ResetDataWarehouseIntegrationStatusResponseResetDataWarehouseIntegrationStatusResult_QNAME, DataWarehouseIntegrationStatus.class, ResetDataWarehouseIntegrationStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestCustomerXrsSettingsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = TestCustomerXrsSettings.class)
    public JAXBElement<TestCustomerXrsSettingsParameters> createTestCustomerXrsSettingsParameters(TestCustomerXrsSettingsParameters value) {
        return new JAXBElement<TestCustomerXrsSettingsParameters>(_RetrieveDVIRResultsParameters_QNAME, TestCustomerXrsSettingsParameters.class, TestCustomerXrsSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestCustomerXrsSettingsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "TestCustomerXrsSettingsResult", scope = TestCustomerXrsSettingsResponse.class)
    public JAXBElement<TestCustomerXrsSettingsResults> createTestCustomerXrsSettingsResponseTestCustomerXrsSettingsResult(TestCustomerXrsSettingsResults value) {
        return new JAXBElement<TestCustomerXrsSettingsResults>(_TestCustomerXrsSettingsResponseTestCustomerXrsSettingsResult_QNAME, TestCustomerXrsSettingsResults.class, TestCustomerXrsSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadCustomReportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = UploadCustomReport.class)
    public JAXBElement<UploadCustomReportParameters> createUploadCustomReportParameters(UploadCustomReportParameters value) {
        return new JAXBElement<UploadCustomReportParameters>(_RetrieveDVIRResultsParameters_QNAME, UploadCustomReportParameters.class, UploadCustomReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadCustomReportResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UploadCustomReportResult", scope = UploadCustomReportResponse.class)
    public JAXBElement<UploadCustomReportResults> createUploadCustomReportResponseUploadCustomReportResult(UploadCustomReportResults value) {
        return new JAXBElement<UploadCustomReportResults>(_UploadCustomReportResponseUploadCustomReportResult_QNAME, UploadCustomReportResults.class, UploadCustomReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "reportOptions", scope = RetrieveCustomReports.class)
    public JAXBElement<ReportPropertyOptions> createRetrieveCustomReportsReportOptions(ReportPropertyOptions value) {
        return new JAXBElement<ReportPropertyOptions>(_RetrieveCustomReportsReportOptions_QNAME, ReportPropertyOptions.class, RetrieveCustomReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveCustomReportsResult", scope = RetrieveCustomReportsResponse.class)
    public JAXBElement<ArrayOfReport> createRetrieveCustomReportsResponseRetrieveCustomReportsResult(ArrayOfReport value) {
        return new JAXBElement<ArrayOfReport>(_RetrieveCustomReportsResponseRetrieveCustomReportsResult_QNAME, ArrayOfReport.class, RetrieveCustomReportsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "reportOptions", scope = RetrieveCustomReport.class)
    public JAXBElement<ReportPropertyOptions> createRetrieveCustomReportReportOptions(ReportPropertyOptions value) {
        return new JAXBElement<ReportPropertyOptions>(_RetrieveCustomReportsReportOptions_QNAME, ReportPropertyOptions.class, RetrieveCustomReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Report }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveCustomReportResult", scope = RetrieveCustomReportResponse.class)
    public JAXBElement<Report> createRetrieveCustomReportResponseRetrieveCustomReportResult(Report value) {
        return new JAXBElement<Report>(_RetrieveCustomReportResponseRetrieveCustomReportResult_QNAME, Report.class, RetrieveCustomReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportOBD2DiagnosticTroubleCodesParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = ImportOBD2DiagnosticsTroubleCodes.class)
    public JAXBElement<ImportOBD2DiagnosticTroubleCodesParameters> createImportOBD2DiagnosticsTroubleCodesParameters(ImportOBD2DiagnosticTroubleCodesParameters value) {
        return new JAXBElement<ImportOBD2DiagnosticTroubleCodesParameters>(_RetrieveDVIRResultsParameters_QNAME, ImportOBD2DiagnosticTroubleCodesParameters.class, ImportOBD2DiagnosticsTroubleCodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RdcMigrationParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = StartRdcMigration.class)
    public JAXBElement<RdcMigrationParameters> createStartRdcMigrationParameters(RdcMigrationParameters value) {
        return new JAXBElement<RdcMigrationParameters>(_RetrieveDVIRResultsParameters_QNAME, RdcMigrationParameters.class, StartRdcMigration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XrsMigrationParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = ProcessXrsMigrationWorkbook.class)
    public JAXBElement<XrsMigrationParameters> createProcessXrsMigrationWorkbookParameters(XrsMigrationParameters value) {
        return new JAXBElement<XrsMigrationParameters>(_RetrieveDVIRResultsParameters_QNAME, XrsMigrationParameters.class, ProcessXrsMigrationWorkbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceLookupParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "parameters", scope = LookupMobileDevices.class)
    public JAXBElement<DeviceLookupParameters> createLookupMobileDevicesParameters(DeviceLookupParameters value) {
        return new JAXBElement<DeviceLookupParameters>(_RetrieveDVIRResultsParameters_QNAME, DeviceLookupParameters.class, LookupMobileDevices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = LookupMobileDevices.class)
    public JAXBElement<RetrievalOptions> createLookupMobileDevicesOptions(RetrievalOptions value) {
        return new JAXBElement<RetrievalOptions>(_MultiRetrieveOptions_QNAME, RetrievalOptions.class, LookupMobileDevices.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceLookupResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LookupMobileDevicesResult", scope = LookupMobileDevicesResponse.class)
    public JAXBElement<DeviceLookupResults> createLookupMobileDevicesResponseLookupMobileDevicesResult(DeviceLookupResults value) {
        return new JAXBElement<DeviceLookupResults>(_LookupMobileDevicesResponseLookupMobileDevicesResult_QNAME, DeviceLookupResults.class, LookupMobileDevicesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CreateTopLevelComplianceRegionResult", scope = CreateTopLevelComplianceRegionResponse.class)
    public JAXBElement<SaveResult> createCreateTopLevelComplianceRegionResponseCreateTopLevelComplianceRegionResult(SaveResult value) {
        return new JAXBElement<SaveResult>(_CreateTopLevelComplianceRegionResponseCreateTopLevelComplianceRegionResult_QNAME, SaveResult.class, CreateTopLevelComplianceRegionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CreateTopLevelComplianceRegion2Result", scope = CreateTopLevelComplianceRegion2Response.class)
    public JAXBElement<SaveResult> createCreateTopLevelComplianceRegion2ResponseCreateTopLevelComplianceRegion2Result(SaveResult value) {
        return new JAXBElement<SaveResult>(_CreateTopLevelComplianceRegion2ResponseCreateTopLevelComplianceRegion2Result_QNAME, SaveResult.class, CreateTopLevelComplianceRegion2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveCustomersWithXrsServiceUrlResult", scope = RetrieveCustomersWithXrsServiceUrlResponse.class)
    public JAXBElement<ArrayOfCustomer> createRetrieveCustomersWithXrsServiceUrlResponseRetrieveCustomersWithXrsServiceUrlResult(ArrayOfCustomer value) {
        return new JAXBElement<ArrayOfCustomer>(_RetrieveCustomersWithXrsServiceUrlResponseRetrieveCustomersWithXrsServiceUrlResult_QNAME, ArrayOfCustomer.class, RetrieveCustomersWithXrsServiceUrlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoggingSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveCustomerLoggingSettingsResult", scope = RetrieveCustomerLoggingSettingsResponse.class)
    public JAXBElement<LoggingSettings> createRetrieveCustomerLoggingSettingsResponseRetrieveCustomerLoggingSettingsResult(LoggingSettings value) {
        return new JAXBElement<LoggingSettings>(_RetrieveCustomerLoggingSettingsResponseRetrieveCustomerLoggingSettingsResult_QNAME, LoggingSettings.class, RetrieveCustomerLoggingSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = ApplyEdit.class)
    public JAXBElement<RegionContext> createApplyEditRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, ApplyEdit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkEditRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "editRecordDto", scope = ApplyEdit.class)
    public JAXBElement<NetworkEditRecord> createApplyEditEditRecordDto(NetworkEditRecord value) {
        return new JAXBElement<NetworkEditRecord>(_ApplyEditEditRecordDto_QNAME, NetworkEditRecord.class, ApplyEdit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveEditOperations.class)
    public JAXBElement<RegionContext> createRetrieveEditOperationsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveEditOperations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEditOperationsCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = RetrieveEditOperations.class)
    public JAXBElement<RetrieveEditOperationsCriteria> createRetrieveEditOperationsCriteria(RetrieveEditOperationsCriteria value) {
        return new JAXBElement<RetrieveEditOperationsCriteria>(_RetrieveEditOperationsCriteria_QNAME, RetrieveEditOperationsCriteria.class, RetrieveEditOperations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEditOperationsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveEditOperations.class)
    public JAXBElement<RetrieveEditOperationsOptions> createRetrieveEditOperationsOptions(RetrieveEditOperationsOptions value) {
        return new JAXBElement<RetrieveEditOperationsOptions>(_MultiRetrieveOptions_QNAME, RetrieveEditOperationsOptions.class, RetrieveEditOperations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEditOperationsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveEditOperationsResult", scope = RetrieveEditOperationsResponse.class)
    public JAXBElement<RetrieveEditOperationsResult> createRetrieveEditOperationsResponseRetrieveEditOperationsResult(RetrieveEditOperationsResult value) {
        return new JAXBElement<RetrieveEditOperationsResult>(_RetrieveEditOperationsResponseRetrieveEditOperationsResult_QNAME, RetrieveEditOperationsResult.class, RetrieveEditOperationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = ProcessCommunityEditRequest.class)
    public JAXBElement<RegionContext> createProcessCommunityEditRequestRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, ProcessCommunityEditRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCommunityEditRequestArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "args", scope = ProcessCommunityEditRequest.class)
    public JAXBElement<ProcessCommunityEditRequestArgs> createProcessCommunityEditRequestArgs(ProcessCommunityEditRequestArgs value) {
        return new JAXBElement<ProcessCommunityEditRequestArgs>(_RetrieveServiceLocationServiceStatisticsArgs_QNAME, ProcessCommunityEditRequestArgs.class, ProcessCommunityEditRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCommunityEditRequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ProcessCommunityEditRequestResult", scope = ProcessCommunityEditRequestResponse.class)
    public JAXBElement<ProcessCommunityEditRequestResult> createProcessCommunityEditRequestResponseProcessCommunityEditRequestResult(ProcessCommunityEditRequestResult value) {
        return new JAXBElement<ProcessCommunityEditRequestResult>(_ProcessCommunityEditRequestResponseProcessCommunityEditRequestResult_QNAME, ProcessCommunityEditRequestResult.class, ProcessCommunityEditRequestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveMapInfo.class)
    public JAXBElement<RegionContext> createRetrieveMapInfoRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveMapInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMapInfoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveMapInfoResult", scope = RetrieveMapInfoResponse.class)
    public JAXBElement<RetrieveMapInfoResult> createRetrieveMapInfoResponseRetrieveMapInfoResult(RetrieveMapInfoResult value) {
        return new JAXBElement<RetrieveMapInfoResult>(_RetrieveMapInfoResponseRetrieveMapInfoResult_QNAME, RetrieveMapInfoResult.class, RetrieveMapInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveDeltaMapEdits.class)
    public JAXBElement<RegionContext> createRetrieveDeltaMapEditsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveDeltaMapEdits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDeltaMapEditsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveDeltaMapEditsResult", scope = RetrieveDeltaMapEditsResponse.class)
    public JAXBElement<RetrieveDeltaMapEditsResult> createRetrieveDeltaMapEditsResponseRetrieveDeltaMapEditsResult(RetrieveDeltaMapEditsResult value) {
        return new JAXBElement<RetrieveDeltaMapEditsResult>(_RetrieveDeltaMapEditsResponseRetrieveDeltaMapEditsResult_QNAME, RetrieveDeltaMapEditsResult.class, RetrieveDeltaMapEditsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveFullMapEdits.class)
    public JAXBElement<RegionContext> createRetrieveFullMapEditsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveFullMapEdits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveFullMapEditsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveFullMapEditsResult", scope = RetrieveFullMapEditsResponse.class)
    public JAXBElement<RetrieveFullMapEditsResult> createRetrieveFullMapEditsResponseRetrieveFullMapEditsResult(RetrieveFullMapEditsResult value) {
        return new JAXBElement<RetrieveFullMapEditsResult>(_RetrieveFullMapEditsResponseRetrieveFullMapEditsResult_QNAME, RetrieveFullMapEditsResult.class, RetrieveFullMapEditsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveNodesDetail.class)
    public JAXBElement<RegionContext> createRetrieveNodesDetailRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveNodesDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesDetailCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = RetrieveNodesDetail.class)
    public JAXBElement<RetrieveNodesDetailCriteria> createRetrieveNodesDetailCriteria(RetrieveNodesDetailCriteria value) {
        return new JAXBElement<RetrieveNodesDetailCriteria>(_RetrieveEditOperationsCriteria_QNAME, RetrieveNodesDetailCriteria.class, RetrieveNodesDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesDetailOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveNodesDetail.class)
    public JAXBElement<RetrieveNodesDetailOptions> createRetrieveNodesDetailOptions(RetrieveNodesDetailOptions value) {
        return new JAXBElement<RetrieveNodesDetailOptions>(_MultiRetrieveOptions_QNAME, RetrieveNodesDetailOptions.class, RetrieveNodesDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesDetailResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveNodesDetailResult", scope = RetrieveNodesDetailResponse.class)
    public JAXBElement<RetrieveNodesDetailResults> createRetrieveNodesDetailResponseRetrieveNodesDetailResult(RetrieveNodesDetailResults value) {
        return new JAXBElement<RetrieveNodesDetailResults>(_RetrieveNodesDetailResponseRetrieveNodesDetailResult_QNAME, RetrieveNodesDetailResults.class, RetrieveNodesDetailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateArcs.class)
    public JAXBElement<RegionContext> createUpdateArcsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateArcs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "arcsToUpdate", scope = UpdateArcs.class)
    public JAXBElement<ArrayOfNetworkArc> createUpdateArcsArcsToUpdate(ArrayOfNetworkArc value) {
        return new JAXBElement<ArrayOfNetworkArc>(_UpdateArcsArcsToUpdate_QNAME, ArrayOfNetworkArc.class, UpdateArcs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArcsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = UpdateArcs.class)
    public JAXBElement<UpdateArcsOptions> createUpdateArcsOptions(UpdateArcsOptions value) {
        return new JAXBElement<UpdateArcsOptions>(_MultiRetrieveOptions_QNAME, UpdateArcsOptions.class, UpdateArcs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArcsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateArcsResult", scope = UpdateArcsResponse.class)
    public JAXBElement<UpdateArcsResults> createUpdateArcsResponseUpdateArcsResult(UpdateArcsResults value) {
        return new JAXBElement<UpdateArcsResults>(_UpdateArcsResponseUpdateArcsResult_QNAME, UpdateArcsResults.class, UpdateArcsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateNode.class)
    public JAXBElement<RegionContext> createUpdateNodeRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNodeCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = UpdateNode.class)
    public JAXBElement<UpdateNodeCriteria> createUpdateNodeCriteria(UpdateNodeCriteria value) {
        return new JAXBElement<UpdateNodeCriteria>(_RetrieveEditOperationsCriteria_QNAME, UpdateNodeCriteria.class, UpdateNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateImpasse.class)
    public JAXBElement<RegionContext> createUpdateImpasseRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateImpasse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpasseNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "impasseDto", scope = UpdateImpasse.class)
    public JAXBElement<ImpasseNode> createUpdateImpasseImpasseDto(ImpasseNode value) {
        return new JAXBElement<ImpasseNode>(_UpdateImpasseImpasseDto_QNAME, ImpasseNode.class, UpdateImpasse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveMapDataRegionInfo.class)
    public JAXBElement<RegionContext> createRetrieveMapDataRegionInfoRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveMapDataRegionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMapRegionInfoDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveMapDataRegionInfoResult", scope = RetrieveMapDataRegionInfoResponse.class)
    public JAXBElement<ArrayOfMapRegionInfoDto> createRetrieveMapDataRegionInfoResponseRetrieveMapDataRegionInfoResult(ArrayOfMapRegionInfoDto value) {
        return new JAXBElement<ArrayOfMapRegionInfoDto>(_RetrieveMapDataRegionInfoResponseRetrieveMapDataRegionInfoResult_QNAME, ArrayOfMapRegionInfoDto.class, RetrieveMapDataRegionInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveArcs.class)
    public JAXBElement<RegionContext> createRetrieveArcsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveArcs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveArcsCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = RetrieveArcs.class)
    public JAXBElement<RetrieveArcsCriteria> createRetrieveArcsCriteria(RetrieveArcsCriteria value) {
        return new JAXBElement<RetrieveArcsCriteria>(_RetrieveEditOperationsCriteria_QNAME, RetrieveArcsCriteria.class, RetrieveArcs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveArcsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveArcs.class)
    public JAXBElement<RetrieveArcsOptions> createRetrieveArcsOptions(RetrieveArcsOptions value) {
        return new JAXBElement<RetrieveArcsOptions>(_MultiRetrieveOptions_QNAME, RetrieveArcsOptions.class, RetrieveArcs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveArcsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveArcsResult", scope = RetrieveArcsResponse.class)
    public JAXBElement<RetrieveArcsResults> createRetrieveArcsResponseRetrieveArcsResult(RetrieveArcsResults value) {
        return new JAXBElement<RetrieveArcsResults>(_RetrieveArcsResponseRetrieveArcsResult_QNAME, RetrieveArcsResults.class, RetrieveArcsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = PopulateArcs.class)
    public JAXBElement<RegionContext> createPopulateArcsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, PopulateArcs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "networkIDs", scope = PopulateArcs.class)
    public JAXBElement<ArrayOfNetworkID> createPopulateArcsNetworkIDs(ArrayOfNetworkID value) {
        return new JAXBElement<ArrayOfNetworkID>(_PopulateArcsNetworkIDs_QNAME, ArrayOfNetworkID.class, PopulateArcs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PopulateArcsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = PopulateArcs.class)
    public JAXBElement<PopulateArcsOptions> createPopulateArcsOptions(PopulateArcsOptions value) {
        return new JAXBElement<PopulateArcsOptions>(_MultiRetrieveOptions_QNAME, PopulateArcsOptions.class, PopulateArcs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPopulateArcResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "PopulateArcsResult", scope = PopulateArcsResponse.class)
    public JAXBElement<ArrayOfPopulateArcResult> createPopulateArcsResponsePopulateArcsResult(ArrayOfPopulateArcResult value) {
        return new JAXBElement<ArrayOfPopulateArcResult>(_PopulateArcsResponsePopulateArcsResult_QNAME, ArrayOfPopulateArcResult.class, PopulateArcsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveMapChangedAreas.class)
    public JAXBElement<RegionContext> createRetrieveMapChangedAreasRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveMapChangedAreas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Viewport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "viewport", scope = RetrieveMapChangedAreas.class)
    public JAXBElement<Viewport> createRetrieveMapChangedAreasViewport(Viewport value) {
        return new JAXBElement<Viewport>(_RetrieveMapChangedAreasViewport_QNAME, Viewport.class, RetrieveMapChangedAreas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMapChangedAreasOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveMapChangedAreas.class)
    public JAXBElement<RetrieveMapChangedAreasOptions> createRetrieveMapChangedAreasOptions(RetrieveMapChangedAreasOptions value) {
        return new JAXBElement<RetrieveMapChangedAreasOptions>(_MultiRetrieveOptions_QNAME, RetrieveMapChangedAreasOptions.class, RetrieveMapChangedAreas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMapChangedAreasResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveMapChangedAreasResult", scope = RetrieveMapChangedAreasResponse.class)
    public JAXBElement<RetrieveMapChangedAreasResults> createRetrieveMapChangedAreasResponseRetrieveMapChangedAreasResult(RetrieveMapChangedAreasResults value) {
        return new JAXBElement<RetrieveMapChangedAreasResults>(_RetrieveMapChangedAreasResponseRetrieveMapChangedAreasResult_QNAME, RetrieveMapChangedAreasResults.class, RetrieveMapChangedAreasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveNodes.class)
    public JAXBElement<RegionContext> createRetrieveNodesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveNodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = RetrieveNodes.class)
    public JAXBElement<RetrieveNodesCriteria> createRetrieveNodesCriteria(RetrieveNodesCriteria value) {
        return new JAXBElement<RetrieveNodesCriteria>(_RetrieveEditOperationsCriteria_QNAME, RetrieveNodesCriteria.class, RetrieveNodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveNodes.class)
    public JAXBElement<RetrieveNodesOptions> createRetrieveNodesOptions(RetrieveNodesOptions value) {
        return new JAXBElement<RetrieveNodesOptions>(_MultiRetrieveOptions_QNAME, RetrieveNodesOptions.class, RetrieveNodes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveNodesResult", scope = RetrieveNodesResponse.class)
    public JAXBElement<RetrieveNodesResults> createRetrieveNodesResponseRetrieveNodesResult(RetrieveNodesResults value) {
        return new JAXBElement<RetrieveNodesResults>(_RetrieveNodesResponseRetrieveNodesResult_QNAME, RetrieveNodesResults.class, RetrieveNodesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = ApplyArcUpdates.class)
    public JAXBElement<RegionContext> createApplyArcUpdatesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, ApplyArcUpdates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyArcUpdatesCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = ApplyArcUpdates.class)
    public JAXBElement<ApplyArcUpdatesCriteria> createApplyArcUpdatesCriteria(ApplyArcUpdatesCriteria value) {
        return new JAXBElement<ApplyArcUpdatesCriteria>(_RetrieveEditOperationsCriteria_QNAME, ApplyArcUpdatesCriteria.class, ApplyArcUpdates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyArcUpdatesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = ApplyArcUpdates.class)
    public JAXBElement<ApplyArcUpdatesOptions> createApplyArcUpdatesOptions(ApplyArcUpdatesOptions value) {
        return new JAXBElement<ApplyArcUpdatesOptions>(_MultiRetrieveOptions_QNAME, ApplyArcUpdatesOptions.class, ApplyArcUpdates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyArcUpdatesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "ApplyArcUpdatesResult", scope = ApplyArcUpdatesResponse.class)
    public JAXBElement<ApplyArcUpdatesResult> createApplyArcUpdatesResponseApplyArcUpdatesResult(ApplyArcUpdatesResult value) {
        return new JAXBElement<ApplyArcUpdatesResult>(_ApplyArcUpdatesResponseApplyArcUpdatesResult_QNAME, ApplyArcUpdatesResult.class, ApplyArcUpdatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = Geocode.class)
    public JAXBElement<RegionContext> createGeocodeRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, Geocode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = Geocode.class)
    public JAXBElement<GeocodeCriteria> createGeocodeCriteria(GeocodeCriteria value) {
        return new JAXBElement<GeocodeCriteria>(_RetrieveEditOperationsCriteria_QNAME, GeocodeCriteria.class, Geocode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = Geocode.class)
    public JAXBElement<GeocodeOptions> createGeocodeOptions(GeocodeOptions value) {
        return new JAXBElement<GeocodeOptions>(_MultiRetrieveOptions_QNAME, GeocodeOptions.class, Geocode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeocodeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "GeocodeResult", scope = GeocodeResponse.class)
    public JAXBElement<ArrayOfGeocodeResult> createGeocodeResponseGeocodeResult(ArrayOfGeocodeResult value) {
        return new JAXBElement<ArrayOfGeocodeResult>(_GeocodeResponseGeocodeResult_QNAME, ArrayOfGeocodeResult.class, GeocodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = StartGeocodeJob.class)
    public JAXBElement<RegionContext> createStartGeocodeJobRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, StartGeocodeJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = StartGeocodeJob.class)
    public JAXBElement<GeocodeCriteria> createStartGeocodeJobCriteria(GeocodeCriteria value) {
        return new JAXBElement<GeocodeCriteria>(_RetrieveEditOperationsCriteria_QNAME, GeocodeCriteria.class, StartGeocodeJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = StartGeocodeJob.class)
    public JAXBElement<GeocodeOptions> createStartGeocodeJobOptions(GeocodeOptions value) {
        return new JAXBElement<GeocodeOptions>(_MultiRetrieveOptions_QNAME, GeocodeOptions.class, StartGeocodeJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = StartGeocodeLocationsJob.class)
    public JAXBElement<RegionContext> createStartGeocodeLocationsJobRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, StartGeocodeLocationsJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "LocationEntityKeys", scope = StartGeocodeLocationsJob.class)
    public JAXBElement<ArrayOflong> createStartGeocodeLocationsJobLocationEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_StartGeocodeLocationsJobLocationEntityKeys_QNAME, ArrayOflong.class, StartGeocodeLocationsJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveGeocodeCandidates.class)
    public JAXBElement<RegionContext> createRetrieveGeocodeCandidatesRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveGeocodeCandidates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = RetrieveGeocodeCandidates.class)
    public JAXBElement<GeocodeCriteria> createRetrieveGeocodeCandidatesCriteria(GeocodeCriteria value) {
        return new JAXBElement<GeocodeCriteria>(_RetrieveEditOperationsCriteria_QNAME, GeocodeCriteria.class, RetrieveGeocodeCandidates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveGeocodeCandidateOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveGeocodeCandidates.class)
    public JAXBElement<RetrieveGeocodeCandidateOptions> createRetrieveGeocodeCandidatesOptions(RetrieveGeocodeCandidateOptions value) {
        return new JAXBElement<RetrieveGeocodeCandidateOptions>(_MultiRetrieveOptions_QNAME, RetrieveGeocodeCandidateOptions.class, RetrieveGeocodeCandidates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeocodeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveGeocodeCandidatesResult", scope = RetrieveGeocodeCandidatesResponse.class)
    public JAXBElement<ArrayOfGeocodeResult> createRetrieveGeocodeCandidatesResponseRetrieveGeocodeCandidatesResult(ArrayOfGeocodeResult value) {
        return new JAXBElement<ArrayOfGeocodeResult>(_RetrieveGeocodeCandidatesResponseRetrieveGeocodeCandidatesResult_QNAME, ArrayOfGeocodeResult.class, RetrieveGeocodeCandidatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = GenerateTravelPath.class)
    public JAXBElement<RegionContext> createGenerateTravelPathRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, GenerateTravelPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateTravelPathOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = GenerateTravelPath.class)
    public JAXBElement<GenerateTravelPathOptions> createGenerateTravelPathOptions(GenerateTravelPathOptions value) {
        return new JAXBElement<GenerateTravelPathOptions>(_MultiRetrieveOptions_QNAME, GenerateTravelPathOptions.class, GenerateTravelPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelPathResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "GenerateTravelPathResult", scope = GenerateTravelPathResponse.class)
    public JAXBElement<TravelPathResult> createGenerateTravelPathResponseGenerateTravelPathResult(TravelPathResult value) {
        return new JAXBElement<TravelPathResult>(_GenerateTravelPathResponseGenerateTravelPathResult_QNAME, TravelPathResult.class, GenerateTravelPathResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteShield }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveRouteShieldsResult", scope = RetrieveRouteShieldsResponse.class)
    public JAXBElement<ArrayOfRouteShield> createRetrieveRouteShieldsResponseRetrieveRouteShieldsResult(ArrayOfRouteShield value) {
        return new JAXBElement<ArrayOfRouteShield>(_RetrieveRouteShieldsResponseRetrieveRouteShieldsResult_QNAME, ArrayOfRouteShield.class, RetrieveRouteShieldsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrievePositionText.class)
    public JAXBElement<RegionContext> createRetrievePositionTextRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrievePositionText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "coordinate", scope = RetrievePositionText.class)
    public JAXBElement<Coordinate> createRetrievePositionTextCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_OverrideCoordinateForStopCoordinate_QNAME, Coordinate.class, RetrievePositionText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePositionTextOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrievePositionText.class)
    public JAXBElement<RetrievePositionTextOptions> createRetrievePositionTextOptions(RetrievePositionTextOptions value) {
        return new JAXBElement<RetrievePositionTextOptions>(_MultiRetrieveOptions_QNAME, RetrievePositionTextOptions.class, RetrievePositionText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePositionTextResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrievePositionTextResult", scope = RetrievePositionTextResponse.class)
    public JAXBElement<RetrievePositionTextResult> createRetrievePositionTextResponseRetrievePositionTextResult(RetrievePositionTextResult value) {
        return new JAXBElement<RetrievePositionTextResult>(_RetrievePositionTextResponseRetrievePositionTextResult_QNAME, RetrievePositionTextResult.class, RetrievePositionTextResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrievePositionTextList.class)
    public JAXBElement<RegionContext> createRetrievePositionTextListRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrievePositionTextList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "coordinates", scope = RetrievePositionTextList.class)
    public JAXBElement<ArrayOfCoordinate> createRetrievePositionTextListCoordinates(ArrayOfCoordinate value) {
        return new JAXBElement<ArrayOfCoordinate>(_RetrievePositionTextListCoordinates_QNAME, ArrayOfCoordinate.class, RetrievePositionTextList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePositionTextOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrievePositionTextList.class)
    public JAXBElement<RetrievePositionTextOptions> createRetrievePositionTextListOptions(RetrievePositionTextOptions value) {
        return new JAXBElement<RetrievePositionTextOptions>(_MultiRetrieveOptions_QNAME, RetrievePositionTextOptions.class, RetrievePositionTextList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionTextListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrievePositionTextListResult", scope = RetrievePositionTextListResponse.class)
    public JAXBElement<PositionTextListResult> createRetrievePositionTextListResponseRetrievePositionTextListResult(PositionTextListResult value) {
        return new JAXBElement<PositionTextListResult>(_RetrievePositionTextListResponseRetrievePositionTextListResult_QNAME, PositionTextListResult.class, RetrievePositionTextListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = CalculateDistanceByJurisdiction.class)
    public JAXBElement<RegionContext> createCalculateDistanceByJurisdictionRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, CalculateDistanceByJurisdiction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "fromCoordinate", scope = CalculateDistanceByJurisdiction.class)
    public JAXBElement<Coordinate> createCalculateDistanceByJurisdictionFromCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_CalculateDistanceByJurisdictionFromCoordinate_QNAME, Coordinate.class, CalculateDistanceByJurisdiction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "toCoordinate", scope = CalculateDistanceByJurisdiction.class)
    public JAXBElement<Coordinate> createCalculateDistanceByJurisdictionToCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_CalculateDistanceByJurisdictionToCoordinate_QNAME, Coordinate.class, CalculateDistanceByJurisdiction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateDistanceByJurisdictionOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = CalculateDistanceByJurisdiction.class)
    public JAXBElement<CalculateDistanceByJurisdictionOptions> createCalculateDistanceByJurisdictionOptions(CalculateDistanceByJurisdictionOptions value) {
        return new JAXBElement<CalculateDistanceByJurisdictionOptions>(_MultiRetrieveOptions_QNAME, CalculateDistanceByJurisdictionOptions.class, CalculateDistanceByJurisdiction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateDistanceByJurisdictionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "CalculateDistanceByJurisdictionResult", scope = CalculateDistanceByJurisdictionResponse.class)
    public JAXBElement<CalculateDistanceByJurisdictionResult> createCalculateDistanceByJurisdictionResponseCalculateDistanceByJurisdictionResult(CalculateDistanceByJurisdictionResult value) {
        return new JAXBElement<CalculateDistanceByJurisdictionResult>(_CalculateDistanceByJurisdictionResponseCalculateDistanceByJurisdictionResult_QNAME, CalculateDistanceByJurisdictionResult.class, CalculateDistanceByJurisdictionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveTravelModel.class)
    public JAXBElement<RegionContext> createRetrieveTravelModelRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveTravelModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveTravelModelResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveTravelModelResult", scope = RetrieveTravelModelResponse.class)
    public JAXBElement<RetrieveTravelModelResults> createRetrieveTravelModelResponseRetrieveTravelModelResult(RetrieveTravelModelResults value) {
        return new JAXBElement<RetrieveTravelModelResults>(_RetrieveTravelModelResponseRetrieveTravelModelResult_QNAME, RetrieveTravelModelResults.class, RetrieveTravelModelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateTravelModel.class)
    public JAXBElement<RegionContext> createUpdateTravelModelRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateTravelModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkTravelModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "travelModelDto", scope = UpdateTravelModel.class)
    public JAXBElement<NetworkTravelModel> createUpdateTravelModelTravelModelDto(NetworkTravelModel value) {
        return new JAXBElement<NetworkTravelModel>(_UpdateTravelModelTravelModelDto_QNAME, NetworkTravelModel.class, UpdateTravelModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = RetrieveRestrictedPathsAndPolygons.class)
    public JAXBElement<RegionContext> createRetrieveRestrictedPathsAndPolygonsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, RetrieveRestrictedPathsAndPolygons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveTravelPathsAndPolygonsCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = RetrieveRestrictedPathsAndPolygons.class)
    public JAXBElement<RetrieveTravelPathsAndPolygonsCriteria> createRetrieveRestrictedPathsAndPolygonsCriteria(RetrieveTravelPathsAndPolygonsCriteria value) {
        return new JAXBElement<RetrieveTravelPathsAndPolygonsCriteria>(_RetrieveEditOperationsCriteria_QNAME, RetrieveTravelPathsAndPolygonsCriteria.class, RetrieveRestrictedPathsAndPolygons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRestrictedPathsAndPolygonsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = RetrieveRestrictedPathsAndPolygons.class)
    public JAXBElement<RetrieveRestrictedPathsAndPolygonsOptions> createRetrieveRestrictedPathsAndPolygonsOptions(RetrieveRestrictedPathsAndPolygonsOptions value) {
        return new JAXBElement<RetrieveRestrictedPathsAndPolygonsOptions>(_MultiRetrieveOptions_QNAME, RetrieveRestrictedPathsAndPolygonsOptions.class, RetrieveRestrictedPathsAndPolygons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRestrictedPathsAndPolygonsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "RetrieveRestrictedPathsAndPolygonsResult", scope = RetrieveRestrictedPathsAndPolygonsResponse.class)
    public JAXBElement<RetrieveRestrictedPathsAndPolygonsResults> createRetrieveRestrictedPathsAndPolygonsResponseRetrieveRestrictedPathsAndPolygonsResult(RetrieveRestrictedPathsAndPolygonsResults value) {
        return new JAXBElement<RetrieveRestrictedPathsAndPolygonsResults>(_RetrieveRestrictedPathsAndPolygonsResponseRetrieveRestrictedPathsAndPolygonsResult_QNAME, RetrieveRestrictedPathsAndPolygonsResults.class, RetrieveRestrictedPathsAndPolygonsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateRestrictedPath.class)
    public JAXBElement<RegionContext> createUpdateRestrictedPathRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateRestrictedPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkRestrictedPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "travelPath", scope = UpdateRestrictedPath.class)
    public JAXBElement<NetworkRestrictedPath> createUpdateRestrictedPathTravelPath(NetworkRestrictedPath value) {
        return new JAXBElement<NetworkRestrictedPath>(_UpdateRestrictedPathTravelPath_QNAME, NetworkRestrictedPath.class, UpdateRestrictedPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRestrictedPathOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = UpdateRestrictedPath.class)
    public JAXBElement<UpdateRestrictedPathOptions> createUpdateRestrictedPathOptions(UpdateRestrictedPathOptions value) {
        return new JAXBElement<UpdateRestrictedPathOptions>(_MultiRetrieveOptions_QNAME, UpdateRestrictedPathOptions.class, UpdateRestrictedPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRestrictedPathResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateRestrictedPathResult", scope = UpdateRestrictedPathResponse.class)
    public JAXBElement<UpdateRestrictedPathResult> createUpdateRestrictedPathResponseUpdateRestrictedPathResult(UpdateRestrictedPathResult value) {
        return new JAXBElement<UpdateRestrictedPathResult>(_UpdateRestrictedPathResponseUpdateRestrictedPathResult_QNAME, UpdateRestrictedPathResult.class, UpdateRestrictedPathResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = UpdateTravelPolygon.class)
    public JAXBElement<RegionContext> createUpdateTravelPolygonRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, UpdateTravelPolygon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkTravelPolygon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "travelPolygon", scope = UpdateTravelPolygon.class)
    public JAXBElement<NetworkTravelPolygon> createUpdateTravelPolygonTravelPolygon(NetworkTravelPolygon value) {
        return new JAXBElement<NetworkTravelPolygon>(_UpdateTravelPolygonTravelPolygon_QNAME, NetworkTravelPolygon.class, UpdateTravelPolygon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTravelPolygonOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = UpdateTravelPolygon.class)
    public JAXBElement<UpdateTravelPolygonOptions> createUpdateTravelPolygonOptions(UpdateTravelPolygonOptions value) {
        return new JAXBElement<UpdateTravelPolygonOptions>(_MultiRetrieveOptions_QNAME, UpdateTravelPolygonOptions.class, UpdateTravelPolygon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTravelPolygonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "UpdateTravelPolygonResult", scope = UpdateTravelPolygonResponse.class)
    public JAXBElement<UpdateTravelPolygonResult> createUpdateTravelPolygonResponseUpdateTravelPolygonResult(UpdateTravelPolygonResult value) {
        return new JAXBElement<UpdateTravelPolygonResult>(_UpdateTravelPolygonResponseUpdateTravelPolygonResult_QNAME, UpdateTravelPolygonResult.class, UpdateTravelPolygonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = PerformSearch.class)
    public JAXBElement<RegionContext> createPerformSearchRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, PerformSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapLocalSearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = PerformSearch.class)
    public JAXBElement<MapLocalSearchCriteria> createPerformSearchCriteria(MapLocalSearchCriteria value) {
        return new JAXBElement<MapLocalSearchCriteria>(_RetrieveEditOperationsCriteria_QNAME, MapLocalSearchCriteria.class, PerformSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapLocalSearchOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = PerformSearch.class)
    public JAXBElement<MapLocalSearchOptions> createPerformSearchOptions(MapLocalSearchOptions value) {
        return new JAXBElement<MapLocalSearchOptions>(_MultiRetrieveOptions_QNAME, MapLocalSearchOptions.class, PerformSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapLocalSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "PerformSearchResult", scope = PerformSearchResponse.class)
    public JAXBElement<MapLocalSearchResult> createPerformSearchResponsePerformSearchResult(MapLocalSearchResult value) {
        return new JAXBElement<MapLocalSearchResult>(_PerformSearchResponsePerformSearchResult_QNAME, MapLocalSearchResult.class, PerformSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "regionContext", scope = MapSync.class)
    public JAXBElement<RegionContext> createMapSyncRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_MultiRetrieveRegionContext_QNAME, RegionContext.class, MapSync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapSyncCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "criteria", scope = MapSync.class)
    public JAXBElement<MapSyncCriteria> createMapSyncCriteria(MapSyncCriteria value) {
        return new JAXBElement<MapSyncCriteria>(_RetrieveEditOperationsCriteria_QNAME, MapSyncCriteria.class, MapSync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapSyncOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "options", scope = MapSync.class)
    public JAXBElement<MapSyncOptions> createMapSyncOptions(MapSyncOptions value) {
        return new JAXBElement<MapSyncOptions>(_MultiRetrieveOptions_QNAME, MapSyncOptions.class, MapSync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDataPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "DataPoints", scope = SavePositionsParameters.class)
    public JAXBElement<ArrayOfEquipmentDataPoint> createSavePositionsParametersDataPoints(ArrayOfEquipmentDataPoint value) {
        return new JAXBElement<ArrayOfEquipmentDataPoint>(_SavePositionsParametersDataPoints_QNAME, ArrayOfEquipmentDataPoint.class, SavePositionsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://roadnet.com/apex/", name = "EquipmentEntityKey", scope = SavePositionsParameters.class)
    public JAXBElement<Long> createSavePositionsParametersEquipmentEntityKey(Long value) {
        return new JAXBElement<Long>(_SavePositionsParametersEquipmentEntityKey_QNAME, Long.class, SavePositionsParameters.class, value);
    }

}
