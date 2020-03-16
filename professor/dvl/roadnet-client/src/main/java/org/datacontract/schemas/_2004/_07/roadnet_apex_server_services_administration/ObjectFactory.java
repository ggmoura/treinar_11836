
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.roadnet.apex.datacontracts.ArrayOfCustomerClientApplicationVersion;
import com.roadnet.apex.datacontracts.ArrayOfReportParameterDefinition;
import com.roadnet.apex.datacontracts.ArrayOfTransitMatrixBuildRequest;
import com.roadnet.apex.datacontracts.CustomerClientApplicationVersionPropertyOptions;
import com.roadnet.apex.datacontracts.Report;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration package. 
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

    private final static QName _DeviceLookupResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DeviceLookupResult");
    private final static QName _RetrieveMatrixResultsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "RetrieveMatrixResultsOptions");
    private final static QName _FindCustomersResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "FindCustomersResult");
    private final static QName _ArrayOfCustomerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ArrayOfCustomerInfo");
    private final static QName _CustomerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerInfo");
    private final static QName _XrsCustomerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsCustomerInfo");
    private final static QName _DataRetentionPolicy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DataRetentionPolicy");
    private final static QName _SystemMessageLocalized_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "SystemMessageLocalized");
    private final static QName _CustomerPurchasedFeatureSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerPurchasedFeatureSet");
    private final static QName _CustomerUsageFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerUsageFlags");
    private final static QName _OmnitracsOneFeatureUsageFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "OmnitracsOneFeatureUsageFlags");
    private final static QName _CustomerState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerState");
    private final static QName _LoggingLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "LoggingLevel");
    private final static QName _MobileDeviceUsageFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MobileDeviceUsageFlags");
    private final static QName _OrderUsageFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "OrderUsageFlags");
    private final static QName _RouteUsageFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "RouteUsageFlags");
    private final static QName _DatabaseServerGroupServerGroupType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DatabaseServerGroup.ServerGroupType");
    private final static QName _AdminReportReportType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "AdminReport.ReportType");
    private final static QName _TransitMatrixBuildStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "TransitMatrixBuildStatus");
    private final static QName _DatabaseServerGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DatabaseServerGroup");
    private final static QName _AlwaysOnAvailabilityGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "AlwaysOnAvailabilityGroup");
    private final static QName _SingleDatabaseServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "SingleDatabaseServer");
    private final static QName _MirroredDatabaseServerGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MirroredDatabaseServerGroup");
    private final static QName _MatrixBuildResultExt_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MatrixBuildResultExt");
    private final static QName _CustomerBusinessUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerBusinessUnit");
    private final static QName _CustomerRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerRegion");
    private final static QName _Database_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Database");
    private final static QName _MatrixBuildResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MatrixBuildResult");
    private final static QName _ServiceInstanceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ServiceInstanceInfo");
    private final static QName _SystemMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "SystemMessage");
    private final static QName _ArrayOfSystemMessageLocalized_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ArrayOfSystemMessageLocalized");
    private final static QName _AdminReport_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "AdminReport");
    private final static QName _Customer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Customer");
    private final static QName _ArrayOfCustomerPurchasedFeatureSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ArrayOfCustomerPurchasedFeatureSet");
    private final static QName _MapDataset_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MapDataset");
    private final static QName _QueuedMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "QueuedMessage");
    private final static QName _FindCustomersJobInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "FindCustomersJobInfo");
    private final static QName _DataRetentionPolicyPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DataRetentionPolicyPropertyOptions");
    private final static QName _DatabaseServerGroupPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DatabaseServerGroupPropertyOptions");
    private final static QName _DatabasePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DatabasePropertyOptions");
    private final static QName _ServiceInstanceInfoPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ServiceInstanceInfoPropertyOptions");
    private final static QName _SystemMessageLocalizedPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "SystemMessageLocalizedPropertyOptions");
    private final static QName _SystemMessagePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "SystemMessagePropertyOptions");
    private final static QName _AdminReportPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "AdminReportPropertyOptions");
    private final static QName _CustomerPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerPropertyOptions");
    private final static QName _MapDatasetPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MapDatasetPropertyOptions");
    private final static QName _QueuedMessagePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "QueuedMessagePropertyOptions");
    private final static QName _MatrixBuildRequestMessages_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MatrixBuildRequestMessages");
    private final static QName _MatrixBuildRequestResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MatrixBuildRequestResults");
    private final static QName _CustomerRegionMatrixStatisticsResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerRegionMatrixStatisticsResults");
    private final static QName _ArrayOfMatrixBuildResultExt_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ArrayOfMatrixBuildResultExt");
    private final static QName _MatrixBuildResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MatrixBuildResults");
    private final static QName _ArrayOfAdminReport_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ArrayOfAdminReport");
    private final static QName _TestCustomerXrsSettingsParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "TestCustomerXrsSettingsParameters");
    private final static QName _TestCustomerXrsSettingsResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "TestCustomerXrsSettingsResults");
    private final static QName _UploadCustomReportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "UploadCustomReportParameters");
    private final static QName _UploadCustomReportResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "UploadCustomReportResults");
    private final static QName _DeviceLookupParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DeviceLookupParameters");
    private final static QName _DeviceLookupResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DeviceLookupResults");
    private final static QName _ArrayOfDeviceLookupResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ArrayOfDeviceLookupResult");
    private final static QName _ArrayOfCustomer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ArrayOfCustomer");
    private final static QName _LoggingSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "LoggingSettings");
    private final static QName _ImportOBD2DiagnosticTroubleCodesParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.ImportOBD2", "ImportOBD2DiagnosticTroubleCodesParameters");
    private final static QName _AttachCustomerParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", "AttachCustomerParameters");
    private final static QName _UpdateCustomerRegionsParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", "UpdateCustomerRegionsParameters");
    private final static QName _ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", "ArrayOfUpdateCustomerRegionsParameters.TransferHistoricRoutesRegionInfo");
    private final static QName _UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", "UpdateCustomerRegionsParameters.TransferHistoricRoutesRegionInfo");
    private final static QName _ShadowProductionParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.ShadowProduction", "ShadowProductionParameters");
    private final static QName _CreateCustomerParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DatabaseCreator", "CreateCustomerParameters");
    private final static QName _CreateDatabaseParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DatabaseCreator", "CreateDatabaseParameters");
    private final static QName _FindCustomersParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.FindCustomerUsage", "FindCustomersParameters");
    private final static QName _InitializeDataWarehouseParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.InitializeDataWarehouse", "InitializeDataWarehouseParameters");
    private final static QName _RdcMigrationParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.RdcMigration", "RdcMigrationParameters");
    private final static QName _XrsMigrationParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.XrsMigration", "XrsMigrationParameters");
    private final static QName _UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfoEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", "EndDate");
    private final static QName _UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfoStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", "StartDate");
    private final static QName _CustomerPropertyOptionsCustomerClientApplicationVersionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerClientApplicationVersionPropertyOptions");
    private final static QName _CustomerPropertyOptionsRetentionPolicyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "RetentionPolicyOptions");
    private final static QName _FindCustomersJobInfoResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Result");
    private final static QName _QueuedMessageBody_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Body");
    private final static QName _QueuedMessageNotificationMethodMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "NotificationMethod_Method");
    private final static QName _QueuedMessageRecipient_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Recipient");
    private final static QName _QueuedMessageSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Subject");
    private final static QName _MapDatasetDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Description");
    private final static QName _MapDatasetIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Identifier");
    private final static QName _MapDatasetMapVendorIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MapVendorIdentifier");
    private final static QName _MapDatasetMapVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MapVersion");
    private final static QName _MapDatasetRootPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "RootPath");
    private final static QName _AdminReportName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Name");
    private final static QName _AdminReportParameterDefinitions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ParameterDefinitions");
    private final static QName _AdminReportReportTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ReportType_Type");
    private final static QName _SystemMessageLocalizedMessages_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "LocalizedMessages");
    private final static QName _ServiceInstanceInfoMachineName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MachineName");
    private final static QName _MatrixBuildResultBuildCompleteTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "BuildCompleteTime");
    private final static QName _MatrixBuildResultBuildDurationInSeconds_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "BuildDurationInSeconds");
    private final static QName _MatrixBuildResultBuildMsgSendTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "BuildMsgSendTime");
    private final static QName _MatrixBuildResultBuildServerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "BuildServerName");
    private final static QName _MatrixBuildResultBuildStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "BuildStartTime");
    private final static QName _MatrixBuildResultBuildType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "BuildType");
    private final static QName _MatrixBuildResultMapDatasetPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MapDatasetPkey");
    private final static QName _MatrixBuildResultMatricesBuilt_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MatricesBuilt");
    private final static QName _MatrixBuildResultNewDepots_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "NewDepots");
    private final static QName _MatrixBuildResultNewLocations_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "NewLocations");
    private final static QName _MatrixBuildResultQueueDurationInSeconds_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "QueueDurationInSeconds");
    private final static QName _MatrixBuildResultReasonForFullBuild_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ReasonForFullBuild");
    private final static QName _MatrixBuildResultRequestServerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "RequestServerName");
    private final static QName _MatrixBuildResultTotalDepots_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "TotalDepots");
    private final static QName _MatrixBuildResultTotalLocations_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "TotalLocations");
    private final static QName _DatabasePhysicalName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "PhysicalName");
    private final static QName _CustomerRegionBusinessUnitIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "BusinessUnitIdentifier");
    private final static QName _CustomerRegionOldestRoutingSessionDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "OldestRoutingSessionDate");
    private final static QName _CustomerRegionRoutingFacilityEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "RoutingFacilityEntityKey");
    private final static QName _CustomerRegionTransitMatrixLastBuildRequestSendTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "TransitMatrixLastBuildRequestSendTime");
    private final static QName _MatrixBuildResultExtBuildStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "BuildStatus");
    private final static QName _MatrixBuildResultExtCustomerDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerDescription");
    private final static QName _MatrixBuildResultExtCustomerIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerIdentifier");
    private final static QName _MatrixBuildResultExtMapPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MapPath");
    private final static QName _MatrixBuildResultExtMapPathOverride_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MapPathOverride");
    private final static QName _MatrixBuildResultExtNewMapEditsExist_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "NewMapEditsExist");
    private final static QName _MatrixBuildResultExtRegionDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "RegionDescription");
    private final static QName _MatrixBuildResultExtRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "RegionIdentifier");
    private final static QName _DatabaseServerGroupBackupDirectory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "BackupDirectory");
    private final static QName _DatabaseServerGroupServerGroupTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ServerGroupType_Type");
    private final static QName _MirroredDatabaseServerGroupMirrorServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MirrorServer");
    private final static QName _MirroredDatabaseServerGroupMirrorServerPort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MirrorServerPort");
    private final static QName _MirroredDatabaseServerGroupPrincipalServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "PrincipalServer");
    private final static QName _MirroredDatabaseServerGroupPrincipalServerPort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "PrincipalServerPort");
    private final static QName _MirroredDatabaseServerGroupWitnessServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "WitnessServer");
    private final static QName _MirroredDatabaseServerGroupWitnessServerPort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "WitnessServerPort");
    private final static QName _SingleDatabaseServerServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Server");
    private final static QName _AlwaysOnAvailabilityGroupAvailabilityGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "AvailabilityGroup");
    private final static QName _AlwaysOnAvailabilityGroupListener_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Listener");
    private final static QName _AlwaysOnAvailabilityGroupPrimaryReplicaServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "PrimaryReplicaServer");
    private final static QName _SystemMessageLocalizedCulture_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Culture");
    private final static QName _SystemMessageLocalizedMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Message");
    private final static QName _XrsCustomerInfoXrsCompanyIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsCompanyIdentity");
    private final static QName _XrsCustomerInfoXrsCompanySid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsCompanySid");
    private final static QName _XrsCustomerInfoXrsTopLevelOrganizationSid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsTopLevelOrganizationSid");
    private final static QName _CustomerInfoPartnerDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "PartnerDescription");
    private final static QName _FindCustomersResultCustomerInfos_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerInfos");
    private final static QName _DeviceLookupResultDeviceDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DeviceDescription");
    private final static QName _DeviceLookupResultDeviceIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DeviceIdentifier");
    private final static QName _DeviceLookupResultDevicePhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DevicePhoneNumber");
    private final static QName _LoggingSettingsLoggingLevelLoggingLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "LoggingLevel_LoggingLevel");
    private final static QName _DeviceLookupResultsLookupResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "LookupResults");
    private final static QName _DeviceLookupParametersCustomerEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerEntityKey");
    private final static QName _XrsMigrationParametersWorkbook_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.XrsMigration", "Workbook");
    private final static QName _RdcMigrationParametersWorkbook_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.RdcMigration", "Workbook");
    private final static QName _ImportOBD2DiagnosticTroubleCodesParametersFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.ImportOBD2", "File");
    private final static QName _UploadCustomReportParametersBusinessUnitEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "BusinessUnitEntityKeys");
    private final static QName _UploadCustomReportParametersReport_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Report");
    private final static QName _UploadCustomReportParametersReportFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ReportFileName");
    private final static QName _UploadCustomReportParametersStoredProcedureScriptFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "StoredProcedureScriptFileName");
    private final static QName _TestCustomerXrsSettingsResultsAllSettingsValid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "AllSettingsValid");
    private final static QName _TestCustomerXrsSettingsResultsCompanyIdValid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CompanyIdValid");
    private final static QName _TestCustomerXrsSettingsResultsCompanyLoginIdValid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CompanyLoginIdValid");
    private final static QName _TestCustomerXrsSettingsResultsLoginCredentialsValid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "LoginCredentialsValid");
    private final static QName _TestCustomerXrsSettingsResultsNonAdminUserRoleValid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "NonAdminUserRoleValid");
    private final static QName _TestCustomerXrsSettingsResultsPublicWebServicesUrlValid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "PublicWebServicesUrlValid");
    private final static QName _TestCustomerXrsSettingsResultsTopLevelOrganizationIdValid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "TopLevelOrganizationIdValid");
    private final static QName _TestCustomerXrsSettingsResultsWebPortalUrlValid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "WebPortalUrlValid");
    private final static QName _TestCustomerXrsSettingsResultsWebServicesUrlValid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "WebServicesUrlValid");
    private final static QName _TestCustomerXrsSettingsParametersCompanyId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CompanyId");
    private final static QName _TestCustomerXrsSettingsParametersCompanyLoginId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CompanyLoginId");
    private final static QName _TestCustomerXrsSettingsParametersComplianceIntegrationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ComplianceIntegrationType");
    private final static QName _TestCustomerXrsSettingsParametersNonAdminUserRole_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "NonAdminUserRole");
    private final static QName _TestCustomerXrsSettingsParametersPublicWebServicesUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "PublicWebServicesUrl");
    private final static QName _TestCustomerXrsSettingsParametersTopLevelOrganizationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "TopLevelOrganizationId");
    private final static QName _TestCustomerXrsSettingsParametersWebPortalUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "WebPortalUrl");
    private final static QName _TestCustomerXrsSettingsParametersWebServicesPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "WebServicesPassword");
    private final static QName _TestCustomerXrsSettingsParametersWebServicesUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "WebServicesUrl");
    private final static QName _TestCustomerXrsSettingsParametersWebServicesUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "WebServicesUsername");
    private final static QName _CreateDatabaseParametersDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DatabaseCreator", "Description");
    private final static QName _CreateDatabaseParametersIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DatabaseCreator", "Identifier");
    private final static QName _CreateCustomerParametersCustomerIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DatabaseCreator", "CustomerIdentifier");
    private final static QName _UpdateCustomerRegionsParametersRegionsToUpdate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", "RegionsToUpdate");
    private final static QName _UpdateCustomerRegionsParametersUpdateLegacyDBFilePath_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", "UpdateLegacyDBFilePath");
    private final static QName _AttachCustomerParametersBusinessUnitIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", "BusinessUnitIdentifier");
    private final static QName _AttachCustomerParametersRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", "RegionIdentifier");
    private final static QName _AttachCustomerParametersUploadedCustomerDBFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", "UploadedCustomerDBFileName");
    private final static QName _AttachCustomerParametersUserEmailAdress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", "UserEmailAdress");
    private final static QName _MatrixBuildResultsResultsWorkbook_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ResultsWorkbook");
    private final static QName _CustomerRegionMatrixStatisticsResultsStatisticsWorkbook_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "StatisticsWorkbook");
    private final static QName _MatrixBuildRequestResultsRequestsWorkbook_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "RequestsWorkbook");
    private final static QName _MatrixBuildRequestMessagesMessages_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "Messages");
    private final static QName _CustomerApplicationVersions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ApplicationVersions");
    private final static QName _CustomerContractEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ContractEndDate");
    private final static QName _CustomerContractStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ContractStartDate");
    private final static QName _CustomerCreationMethodDatabaseSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CreationMethod_DatabaseSource");
    private final static QName _CustomerCustomerStateState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "CustomerState_State");
    private final static QName _CustomerDataWarehouseTimeOfDayToUpdate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DataWarehouseTimeOfDayToUpdate");
    private final static QName _CustomerDefaultMapDatasetEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DefaultMapDatasetEntityKey");
    private final static QName _CustomerDeviceMessageProcessingFacilityEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "DeviceMessageProcessingFacilityEntityKey");
    private final static QName _CustomerExperimentalFeatureCodes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ExperimentalFeatureCodes");
    private final static QName _CustomerLastVehicleLicenseViolationDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "LastVehicleLicenseViolationDate");
    private final static QName _CustomerLicenseComplianceStateVehicleLicenseComplianceState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "LicenseComplianceState_VehicleLicenseComplianceState");
    private final static QName _CustomerListOfPurchasableFeaturesExCalculatedPurchasedFeatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ListOfPurchasableFeaturesEx_CalculatedPurchasedFeatures");
    private final static QName _CustomerListOfPurchasableFeaturesExPurchasedFeatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "ListOfPurchasableFeaturesEx_PurchasedFeatures");
    private final static QName _CustomerMaximumDepots_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MaximumDepots");
    private final static QName _CustomerMobileDevicesLicensed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MobileDevicesLicensed");
    private final static QName _CustomerMobileOidcClientId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MobileOidcClientId");
    private final static QName _CustomerMobileOidcDiscoveryEndpoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "MobileOidcDiscoveryEndpoint");
    private final static QName _CustomerOmnitracsNavigationLicenses_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "OmnitracsNavigationLicenses");
    private final static QName _CustomerOmnitracsOneCompanyGuid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "OmnitracsOneCompanyGuid");
    private final static QName _CustomerPartnerEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "PartnerEntityKey");
    private final static QName _CustomerPurchasableModulesPurchasedModules_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "PurchasableModules_PurchasedModules");
    private final static QName _CustomerPurchasedFeatureSets_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "PurchasedFeatureSets");
    private final static QName _CustomerRetentionPolicy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "RetentionPolicy");
    private final static QName _CustomerTelematicsDevicesLicensed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "TelematicsDevicesLicensed");
    private final static QName _CustomerVehicleLicenseEffectiveDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "VehicleLicenseEffectiveDate");
    private final static QName _CustomerVehicleLicenseViolationGracePeriodEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "VehicleLicenseViolationGracePeriodEndDate");
    private final static QName _CustomerWorldTimeZoneTimeZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "WorldTimeZone_TimeZone");
    private final static QName _CustomerXrsCompanyId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsCompanyId");
    private final static QName _CustomerXrsCompanyLoginId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsCompanyLoginId");
    private final static QName _CustomerXrsIntegrationTypeComplianceIntegrationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsIntegrationType_ComplianceIntegrationType");
    private final static QName _CustomerXrsNonAdminUserRoleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsNonAdminUserRoleName");
    private final static QName _CustomerXrsPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsPassword");
    private final static QName _CustomerXrsPublicWebServicesUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsPublicWebServicesUrl");
    private final static QName _CustomerXrsTopLevelOrganizationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsTopLevelOrganizationId");
    private final static QName _CustomerXrsUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsUsername");
    private final static QName _CustomerXrsWebPortalFacilityEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsWebPortalFacilityEntityKey");
    private final static QName _CustomerXrsWebPortalUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsWebPortalUrl");
    private final static QName _CustomerXrsWebPortalUrlFromFacility_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsWebPortalUrlFromFacility");
    private final static QName _CustomerXrsWebServiceUrlFromFacility_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsWebServiceUrlFromFacility");
    private final static QName _CustomerXrsWebServicesFacilityEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsWebServicesFacilityEntityKey");
    private final static QName _CustomerXrsWebServicesUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", "XrsWebServicesUrl");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link MatrixBuildRequestMessages }
     * 
     */
    public MatrixBuildRequestMessages createMatrixBuildRequestMessages() {
        return new MatrixBuildRequestMessages();
    }

    /**
     * Create an instance of {@link MatrixBuildRequestResults }
     * 
     */
    public MatrixBuildRequestResults createMatrixBuildRequestResults() {
        return new MatrixBuildRequestResults();
    }

    /**
     * Create an instance of {@link CustomerRegionMatrixStatisticsResults }
     * 
     */
    public CustomerRegionMatrixStatisticsResults createCustomerRegionMatrixStatisticsResults() {
        return new CustomerRegionMatrixStatisticsResults();
    }

    /**
     * Create an instance of {@link RetrieveMatrixResultsOptions }
     * 
     */
    public RetrieveMatrixResultsOptions createRetrieveMatrixResultsOptions() {
        return new RetrieveMatrixResultsOptions();
    }

    /**
     * Create an instance of {@link ArrayOfMatrixBuildResultExt }
     * 
     */
    public ArrayOfMatrixBuildResultExt createArrayOfMatrixBuildResultExt() {
        return new ArrayOfMatrixBuildResultExt();
    }

    /**
     * Create an instance of {@link MatrixBuildResults }
     * 
     */
    public MatrixBuildResults createMatrixBuildResults() {
        return new MatrixBuildResults();
    }

    /**
     * Create an instance of {@link ArrayOfAdminReport }
     * 
     */
    public ArrayOfAdminReport createArrayOfAdminReport() {
        return new ArrayOfAdminReport();
    }

    /**
     * Create an instance of {@link AttachCustomerParameters }
     * 
     */
    public AttachCustomerParameters createAttachCustomerParameters() {
        return new AttachCustomerParameters();
    }

    /**
     * Create an instance of {@link UpdateCustomerRegionsParameters }
     * 
     */
    public UpdateCustomerRegionsParameters createUpdateCustomerRegionsParameters() {
        return new UpdateCustomerRegionsParameters();
    }

    /**
     * Create an instance of {@link ShadowProductionParameters }
     * 
     */
    public ShadowProductionParameters createShadowProductionParameters() {
        return new ShadowProductionParameters();
    }

    /**
     * Create an instance of {@link CreateCustomerParameters }
     * 
     */
    public CreateCustomerParameters createCreateCustomerParameters() {
        return new CreateCustomerParameters();
    }

    /**
     * Create an instance of {@link FindCustomersParameters }
     * 
     */
    public FindCustomersParameters createFindCustomersParameters() {
        return new FindCustomersParameters();
    }

    /**
     * Create an instance of {@link CreateDatabaseParameters }
     * 
     */
    public CreateDatabaseParameters createCreateDatabaseParameters() {
        return new CreateDatabaseParameters();
    }

    /**
     * Create an instance of {@link InitializeDataWarehouseParameters }
     * 
     */
    public InitializeDataWarehouseParameters createInitializeDataWarehouseParameters() {
        return new InitializeDataWarehouseParameters();
    }

    /**
     * Create an instance of {@link TestCustomerXrsSettingsParameters }
     * 
     */
    public TestCustomerXrsSettingsParameters createTestCustomerXrsSettingsParameters() {
        return new TestCustomerXrsSettingsParameters();
    }

    /**
     * Create an instance of {@link TestCustomerXrsSettingsResults }
     * 
     */
    public TestCustomerXrsSettingsResults createTestCustomerXrsSettingsResults() {
        return new TestCustomerXrsSettingsResults();
    }

    /**
     * Create an instance of {@link UploadCustomReportParameters }
     * 
     */
    public UploadCustomReportParameters createUploadCustomReportParameters() {
        return new UploadCustomReportParameters();
    }

    /**
     * Create an instance of {@link UploadCustomReportResults }
     * 
     */
    public UploadCustomReportResults createUploadCustomReportResults() {
        return new UploadCustomReportResults();
    }

    /**
     * Create an instance of {@link ImportOBD2DiagnosticTroubleCodesParameters }
     * 
     */
    public ImportOBD2DiagnosticTroubleCodesParameters createImportOBD2DiagnosticTroubleCodesParameters() {
        return new ImportOBD2DiagnosticTroubleCodesParameters();
    }

    /**
     * Create an instance of {@link RdcMigrationParameters }
     * 
     */
    public RdcMigrationParameters createRdcMigrationParameters() {
        return new RdcMigrationParameters();
    }

    /**
     * Create an instance of {@link XrsMigrationParameters }
     * 
     */
    public XrsMigrationParameters createXrsMigrationParameters() {
        return new XrsMigrationParameters();
    }

    /**
     * Create an instance of {@link DeviceLookupParameters }
     * 
     */
    public DeviceLookupParameters createDeviceLookupParameters() {
        return new DeviceLookupParameters();
    }

    /**
     * Create an instance of {@link DeviceLookupResults }
     * 
     */
    public DeviceLookupResults createDeviceLookupResults() {
        return new DeviceLookupResults();
    }

    /**
     * Create an instance of {@link ArrayOfCustomer }
     * 
     */
    public ArrayOfCustomer createArrayOfCustomer() {
        return new ArrayOfCustomer();
    }

    /**
     * Create an instance of {@link LoggingSettings }
     * 
     */
    public LoggingSettings createLoggingSettings() {
        return new LoggingSettings();
    }

    /**
     * Create an instance of {@link DeviceLookupResult }
     * 
     */
    public DeviceLookupResult createDeviceLookupResult() {
        return new DeviceLookupResult();
    }

    /**
     * Create an instance of {@link FindCustomersResult }
     * 
     */
    public FindCustomersResult createFindCustomersResult() {
        return new FindCustomersResult();
    }

    /**
     * Create an instance of {@link ArrayOfCustomerInfo }
     * 
     */
    public ArrayOfCustomerInfo createArrayOfCustomerInfo() {
        return new ArrayOfCustomerInfo();
    }

    /**
     * Create an instance of {@link CustomerInfo }
     * 
     */
    public CustomerInfo createCustomerInfo() {
        return new CustomerInfo();
    }

    /**
     * Create an instance of {@link XrsCustomerInfo }
     * 
     */
    public XrsCustomerInfo createXrsCustomerInfo() {
        return new XrsCustomerInfo();
    }

    /**
     * Create an instance of {@link DataRetentionPolicy }
     * 
     */
    public DataRetentionPolicy createDataRetentionPolicy() {
        return new DataRetentionPolicy();
    }

    /**
     * Create an instance of {@link SystemMessageLocalized }
     * 
     */
    public SystemMessageLocalized createSystemMessageLocalized() {
        return new SystemMessageLocalized();
    }

    /**
     * Create an instance of {@link CustomerPurchasedFeatureSet }
     * 
     */
    public CustomerPurchasedFeatureSet createCustomerPurchasedFeatureSet() {
        return new CustomerPurchasedFeatureSet();
    }

    /**
     * Create an instance of {@link DatabaseServerGroup }
     * 
     */
    public DatabaseServerGroup createDatabaseServerGroup() {
        return new DatabaseServerGroup();
    }

    /**
     * Create an instance of {@link AlwaysOnAvailabilityGroup }
     * 
     */
    public AlwaysOnAvailabilityGroup createAlwaysOnAvailabilityGroup() {
        return new AlwaysOnAvailabilityGroup();
    }

    /**
     * Create an instance of {@link SingleDatabaseServer }
     * 
     */
    public SingleDatabaseServer createSingleDatabaseServer() {
        return new SingleDatabaseServer();
    }

    /**
     * Create an instance of {@link MirroredDatabaseServerGroup }
     * 
     */
    public MirroredDatabaseServerGroup createMirroredDatabaseServerGroup() {
        return new MirroredDatabaseServerGroup();
    }

    /**
     * Create an instance of {@link MatrixBuildResultExt }
     * 
     */
    public MatrixBuildResultExt createMatrixBuildResultExt() {
        return new MatrixBuildResultExt();
    }

    /**
     * Create an instance of {@link CustomerBusinessUnit }
     * 
     */
    public CustomerBusinessUnit createCustomerBusinessUnit() {
        return new CustomerBusinessUnit();
    }

    /**
     * Create an instance of {@link CustomerRegion }
     * 
     */
    public CustomerRegion createCustomerRegion() {
        return new CustomerRegion();
    }

    /**
     * Create an instance of {@link Database }
     * 
     */
    public Database createDatabase() {
        return new Database();
    }

    /**
     * Create an instance of {@link MatrixBuildResult }
     * 
     */
    public MatrixBuildResult createMatrixBuildResult() {
        return new MatrixBuildResult();
    }

    /**
     * Create an instance of {@link ServiceInstanceInfo }
     * 
     */
    public ServiceInstanceInfo createServiceInstanceInfo() {
        return new ServiceInstanceInfo();
    }

    /**
     * Create an instance of {@link SystemMessage }
     * 
     */
    public SystemMessage createSystemMessage() {
        return new SystemMessage();
    }

    /**
     * Create an instance of {@link ArrayOfSystemMessageLocalized }
     * 
     */
    public ArrayOfSystemMessageLocalized createArrayOfSystemMessageLocalized() {
        return new ArrayOfSystemMessageLocalized();
    }

    /**
     * Create an instance of {@link AdminReport }
     * 
     */
    public AdminReport createAdminReport() {
        return new AdminReport();
    }

    /**
     * Create an instance of {@link ArrayOfCustomerPurchasedFeatureSet }
     * 
     */
    public ArrayOfCustomerPurchasedFeatureSet createArrayOfCustomerPurchasedFeatureSet() {
        return new ArrayOfCustomerPurchasedFeatureSet();
    }

    /**
     * Create an instance of {@link MapDataset }
     * 
     */
    public MapDataset createMapDataset() {
        return new MapDataset();
    }

    /**
     * Create an instance of {@link QueuedMessage }
     * 
     */
    public QueuedMessage createQueuedMessage() {
        return new QueuedMessage();
    }

    /**
     * Create an instance of {@link FindCustomersJobInfo }
     * 
     */
    public FindCustomersJobInfo createFindCustomersJobInfo() {
        return new FindCustomersJobInfo();
    }

    /**
     * Create an instance of {@link DataRetentionPolicyPropertyOptions }
     * 
     */
    public DataRetentionPolicyPropertyOptions createDataRetentionPolicyPropertyOptions() {
        return new DataRetentionPolicyPropertyOptions();
    }

    /**
     * Create an instance of {@link DatabaseServerGroupPropertyOptions }
     * 
     */
    public DatabaseServerGroupPropertyOptions createDatabaseServerGroupPropertyOptions() {
        return new DatabaseServerGroupPropertyOptions();
    }

    /**
     * Create an instance of {@link DatabasePropertyOptions }
     * 
     */
    public DatabasePropertyOptions createDatabasePropertyOptions() {
        return new DatabasePropertyOptions();
    }

    /**
     * Create an instance of {@link ServiceInstanceInfoPropertyOptions }
     * 
     */
    public ServiceInstanceInfoPropertyOptions createServiceInstanceInfoPropertyOptions() {
        return new ServiceInstanceInfoPropertyOptions();
    }

    /**
     * Create an instance of {@link SystemMessageLocalizedPropertyOptions }
     * 
     */
    public SystemMessageLocalizedPropertyOptions createSystemMessageLocalizedPropertyOptions() {
        return new SystemMessageLocalizedPropertyOptions();
    }

    /**
     * Create an instance of {@link SystemMessagePropertyOptions }
     * 
     */
    public SystemMessagePropertyOptions createSystemMessagePropertyOptions() {
        return new SystemMessagePropertyOptions();
    }

    /**
     * Create an instance of {@link AdminReportPropertyOptions }
     * 
     */
    public AdminReportPropertyOptions createAdminReportPropertyOptions() {
        return new AdminReportPropertyOptions();
    }

    /**
     * Create an instance of {@link CustomerPropertyOptions }
     * 
     */
    public CustomerPropertyOptions createCustomerPropertyOptions() {
        return new CustomerPropertyOptions();
    }

    /**
     * Create an instance of {@link MapDatasetPropertyOptions }
     * 
     */
    public MapDatasetPropertyOptions createMapDatasetPropertyOptions() {
        return new MapDatasetPropertyOptions();
    }

    /**
     * Create an instance of {@link QueuedMessagePropertyOptions }
     * 
     */
    public QueuedMessagePropertyOptions createQueuedMessagePropertyOptions() {
        return new QueuedMessagePropertyOptions();
    }

    /**
     * Create an instance of {@link ArrayOfDeviceLookupResult }
     * 
     */
    public ArrayOfDeviceLookupResult createArrayOfDeviceLookupResult() {
        return new ArrayOfDeviceLookupResult();
    }

    /**
     * Create an instance of {@link ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo }
     * 
     */
    public ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo createArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo() {
        return new ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo();
    }

    /**
     * Create an instance of {@link UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo }
     * 
     */
    public UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo createUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo() {
        return new UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceLookupResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DeviceLookupResult")
    public JAXBElement<DeviceLookupResult> createDeviceLookupResult(DeviceLookupResult value) {
        return new JAXBElement<DeviceLookupResult>(_DeviceLookupResult_QNAME, DeviceLookupResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMatrixResultsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RetrieveMatrixResultsOptions")
    public JAXBElement<RetrieveMatrixResultsOptions> createRetrieveMatrixResultsOptions(RetrieveMatrixResultsOptions value) {
        return new JAXBElement<RetrieveMatrixResultsOptions>(_RetrieveMatrixResultsOptions_QNAME, RetrieveMatrixResultsOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomersResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "FindCustomersResult")
    public JAXBElement<FindCustomersResult> createFindCustomersResult(FindCustomersResult value) {
        return new JAXBElement<FindCustomersResult>(_FindCustomersResult_QNAME, FindCustomersResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ArrayOfCustomerInfo")
    public JAXBElement<ArrayOfCustomerInfo> createArrayOfCustomerInfo(ArrayOfCustomerInfo value) {
        return new JAXBElement<ArrayOfCustomerInfo>(_ArrayOfCustomerInfo_QNAME, ArrayOfCustomerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerInfo")
    public JAXBElement<CustomerInfo> createCustomerInfo(CustomerInfo value) {
        return new JAXBElement<CustomerInfo>(_CustomerInfo_QNAME, CustomerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XrsCustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsCustomerInfo")
    public JAXBElement<XrsCustomerInfo> createXrsCustomerInfo(XrsCustomerInfo value) {
        return new JAXBElement<XrsCustomerInfo>(_XrsCustomerInfo_QNAME, XrsCustomerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataRetentionPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DataRetentionPolicy")
    public JAXBElement<DataRetentionPolicy> createDataRetentionPolicy(DataRetentionPolicy value) {
        return new JAXBElement<DataRetentionPolicy>(_DataRetentionPolicy_QNAME, DataRetentionPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemMessageLocalized }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "SystemMessageLocalized")
    public JAXBElement<SystemMessageLocalized> createSystemMessageLocalized(SystemMessageLocalized value) {
        return new JAXBElement<SystemMessageLocalized>(_SystemMessageLocalized_QNAME, SystemMessageLocalized.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPurchasedFeatureSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerPurchasedFeatureSet")
    public JAXBElement<CustomerPurchasedFeatureSet> createCustomerPurchasedFeatureSet(CustomerPurchasedFeatureSet value) {
        return new JAXBElement<CustomerPurchasedFeatureSet>(_CustomerPurchasedFeatureSet_QNAME, CustomerPurchasedFeatureSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerUsageFlags")
    public JAXBElement<List<String>> createCustomerUsageFlags(List<String> value) {
        return new JAXBElement<List<String>>(_CustomerUsageFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "OmnitracsOneFeatureUsageFlags")
    public JAXBElement<List<String>> createOmnitracsOneFeatureUsageFlags(List<String> value) {
        return new JAXBElement<List<String>>(_OmnitracsOneFeatureUsageFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerState")
    public JAXBElement<CustomerState> createCustomerState(CustomerState value) {
        return new JAXBElement<CustomerState>(_CustomerState_QNAME, CustomerState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoggingLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "LoggingLevel")
    public JAXBElement<LoggingLevel> createLoggingLevel(LoggingLevel value) {
        return new JAXBElement<LoggingLevel>(_LoggingLevel_QNAME, LoggingLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MobileDeviceUsageFlags")
    public JAXBElement<List<String>> createMobileDeviceUsageFlags(List<String> value) {
        return new JAXBElement<List<String>>(_MobileDeviceUsageFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "OrderUsageFlags")
    public JAXBElement<List<String>> createOrderUsageFlags(List<String> value) {
        return new JAXBElement<List<String>>(_OrderUsageFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RouteUsageFlags")
    public JAXBElement<List<String>> createRouteUsageFlags(List<String> value) {
        return new JAXBElement<List<String>>(_RouteUsageFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseServerGroupServerGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DatabaseServerGroup.ServerGroupType")
    public JAXBElement<DatabaseServerGroupServerGroupType> createDatabaseServerGroupServerGroupType(DatabaseServerGroupServerGroupType value) {
        return new JAXBElement<DatabaseServerGroupServerGroupType>(_DatabaseServerGroupServerGroupType_QNAME, DatabaseServerGroupServerGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminReportReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "AdminReport.ReportType")
    public JAXBElement<AdminReportReportType> createAdminReportReportType(AdminReportReportType value) {
        return new JAXBElement<AdminReportReportType>(_AdminReportReportType_QNAME, AdminReportReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitMatrixBuildStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "TransitMatrixBuildStatus")
    public JAXBElement<TransitMatrixBuildStatus> createTransitMatrixBuildStatus(TransitMatrixBuildStatus value) {
        return new JAXBElement<TransitMatrixBuildStatus>(_TransitMatrixBuildStatus_QNAME, TransitMatrixBuildStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseServerGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DatabaseServerGroup")
    public JAXBElement<DatabaseServerGroup> createDatabaseServerGroup(DatabaseServerGroup value) {
        return new JAXBElement<DatabaseServerGroup>(_DatabaseServerGroup_QNAME, DatabaseServerGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlwaysOnAvailabilityGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "AlwaysOnAvailabilityGroup")
    public JAXBElement<AlwaysOnAvailabilityGroup> createAlwaysOnAvailabilityGroup(AlwaysOnAvailabilityGroup value) {
        return new JAXBElement<AlwaysOnAvailabilityGroup>(_AlwaysOnAvailabilityGroup_QNAME, AlwaysOnAvailabilityGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleDatabaseServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "SingleDatabaseServer")
    public JAXBElement<SingleDatabaseServer> createSingleDatabaseServer(SingleDatabaseServer value) {
        return new JAXBElement<SingleDatabaseServer>(_SingleDatabaseServer_QNAME, SingleDatabaseServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MirroredDatabaseServerGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MirroredDatabaseServerGroup")
    public JAXBElement<MirroredDatabaseServerGroup> createMirroredDatabaseServerGroup(MirroredDatabaseServerGroup value) {
        return new JAXBElement<MirroredDatabaseServerGroup>(_MirroredDatabaseServerGroup_QNAME, MirroredDatabaseServerGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixBuildResultExt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MatrixBuildResultExt")
    public JAXBElement<MatrixBuildResultExt> createMatrixBuildResultExt(MatrixBuildResultExt value) {
        return new JAXBElement<MatrixBuildResultExt>(_MatrixBuildResultExt_QNAME, MatrixBuildResultExt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerBusinessUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerBusinessUnit")
    public JAXBElement<CustomerBusinessUnit> createCustomerBusinessUnit(CustomerBusinessUnit value) {
        return new JAXBElement<CustomerBusinessUnit>(_CustomerBusinessUnit_QNAME, CustomerBusinessUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerRegion")
    public JAXBElement<CustomerRegion> createCustomerRegion(CustomerRegion value) {
        return new JAXBElement<CustomerRegion>(_CustomerRegion_QNAME, CustomerRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Database }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Database")
    public JAXBElement<Database> createDatabase(Database value) {
        return new JAXBElement<Database>(_Database_QNAME, Database.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixBuildResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MatrixBuildResult")
    public JAXBElement<MatrixBuildResult> createMatrixBuildResult(MatrixBuildResult value) {
        return new JAXBElement<MatrixBuildResult>(_MatrixBuildResult_QNAME, MatrixBuildResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInstanceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ServiceInstanceInfo")
    public JAXBElement<ServiceInstanceInfo> createServiceInstanceInfo(ServiceInstanceInfo value) {
        return new JAXBElement<ServiceInstanceInfo>(_ServiceInstanceInfo_QNAME, ServiceInstanceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "SystemMessage")
    public JAXBElement<SystemMessage> createSystemMessage(SystemMessage value) {
        return new JAXBElement<SystemMessage>(_SystemMessage_QNAME, SystemMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSystemMessageLocalized }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ArrayOfSystemMessageLocalized")
    public JAXBElement<ArrayOfSystemMessageLocalized> createArrayOfSystemMessageLocalized(ArrayOfSystemMessageLocalized value) {
        return new JAXBElement<ArrayOfSystemMessageLocalized>(_ArrayOfSystemMessageLocalized_QNAME, ArrayOfSystemMessageLocalized.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "AdminReport")
    public JAXBElement<AdminReport> createAdminReport(AdminReport value) {
        return new JAXBElement<AdminReport>(_AdminReport_QNAME, AdminReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerPurchasedFeatureSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ArrayOfCustomerPurchasedFeatureSet")
    public JAXBElement<ArrayOfCustomerPurchasedFeatureSet> createArrayOfCustomerPurchasedFeatureSet(ArrayOfCustomerPurchasedFeatureSet value) {
        return new JAXBElement<ArrayOfCustomerPurchasedFeatureSet>(_ArrayOfCustomerPurchasedFeatureSet_QNAME, ArrayOfCustomerPurchasedFeatureSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapDataset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MapDataset")
    public JAXBElement<MapDataset> createMapDataset(MapDataset value) {
        return new JAXBElement<MapDataset>(_MapDataset_QNAME, MapDataset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueuedMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "QueuedMessage")
    public JAXBElement<QueuedMessage> createQueuedMessage(QueuedMessage value) {
        return new JAXBElement<QueuedMessage>(_QueuedMessage_QNAME, QueuedMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomersJobInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "FindCustomersJobInfo")
    public JAXBElement<FindCustomersJobInfo> createFindCustomersJobInfo(FindCustomersJobInfo value) {
        return new JAXBElement<FindCustomersJobInfo>(_FindCustomersJobInfo_QNAME, FindCustomersJobInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataRetentionPolicyPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DataRetentionPolicyPropertyOptions")
    public JAXBElement<DataRetentionPolicyPropertyOptions> createDataRetentionPolicyPropertyOptions(DataRetentionPolicyPropertyOptions value) {
        return new JAXBElement<DataRetentionPolicyPropertyOptions>(_DataRetentionPolicyPropertyOptions_QNAME, DataRetentionPolicyPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseServerGroupPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DatabaseServerGroupPropertyOptions")
    public JAXBElement<DatabaseServerGroupPropertyOptions> createDatabaseServerGroupPropertyOptions(DatabaseServerGroupPropertyOptions value) {
        return new JAXBElement<DatabaseServerGroupPropertyOptions>(_DatabaseServerGroupPropertyOptions_QNAME, DatabaseServerGroupPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabasePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DatabasePropertyOptions")
    public JAXBElement<DatabasePropertyOptions> createDatabasePropertyOptions(DatabasePropertyOptions value) {
        return new JAXBElement<DatabasePropertyOptions>(_DatabasePropertyOptions_QNAME, DatabasePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInstanceInfoPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ServiceInstanceInfoPropertyOptions")
    public JAXBElement<ServiceInstanceInfoPropertyOptions> createServiceInstanceInfoPropertyOptions(ServiceInstanceInfoPropertyOptions value) {
        return new JAXBElement<ServiceInstanceInfoPropertyOptions>(_ServiceInstanceInfoPropertyOptions_QNAME, ServiceInstanceInfoPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemMessageLocalizedPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "SystemMessageLocalizedPropertyOptions")
    public JAXBElement<SystemMessageLocalizedPropertyOptions> createSystemMessageLocalizedPropertyOptions(SystemMessageLocalizedPropertyOptions value) {
        return new JAXBElement<SystemMessageLocalizedPropertyOptions>(_SystemMessageLocalizedPropertyOptions_QNAME, SystemMessageLocalizedPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemMessagePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "SystemMessagePropertyOptions")
    public JAXBElement<SystemMessagePropertyOptions> createSystemMessagePropertyOptions(SystemMessagePropertyOptions value) {
        return new JAXBElement<SystemMessagePropertyOptions>(_SystemMessagePropertyOptions_QNAME, SystemMessagePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminReportPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "AdminReportPropertyOptions")
    public JAXBElement<AdminReportPropertyOptions> createAdminReportPropertyOptions(AdminReportPropertyOptions value) {
        return new JAXBElement<AdminReportPropertyOptions>(_AdminReportPropertyOptions_QNAME, AdminReportPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerPropertyOptions")
    public JAXBElement<CustomerPropertyOptions> createCustomerPropertyOptions(CustomerPropertyOptions value) {
        return new JAXBElement<CustomerPropertyOptions>(_CustomerPropertyOptions_QNAME, CustomerPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapDatasetPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MapDatasetPropertyOptions")
    public JAXBElement<MapDatasetPropertyOptions> createMapDatasetPropertyOptions(MapDatasetPropertyOptions value) {
        return new JAXBElement<MapDatasetPropertyOptions>(_MapDatasetPropertyOptions_QNAME, MapDatasetPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueuedMessagePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "QueuedMessagePropertyOptions")
    public JAXBElement<QueuedMessagePropertyOptions> createQueuedMessagePropertyOptions(QueuedMessagePropertyOptions value) {
        return new JAXBElement<QueuedMessagePropertyOptions>(_QueuedMessagePropertyOptions_QNAME, QueuedMessagePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixBuildRequestMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MatrixBuildRequestMessages")
    public JAXBElement<MatrixBuildRequestMessages> createMatrixBuildRequestMessages(MatrixBuildRequestMessages value) {
        return new JAXBElement<MatrixBuildRequestMessages>(_MatrixBuildRequestMessages_QNAME, MatrixBuildRequestMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixBuildRequestResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MatrixBuildRequestResults")
    public JAXBElement<MatrixBuildRequestResults> createMatrixBuildRequestResults(MatrixBuildRequestResults value) {
        return new JAXBElement<MatrixBuildRequestResults>(_MatrixBuildRequestResults_QNAME, MatrixBuildRequestResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRegionMatrixStatisticsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerRegionMatrixStatisticsResults")
    public JAXBElement<CustomerRegionMatrixStatisticsResults> createCustomerRegionMatrixStatisticsResults(CustomerRegionMatrixStatisticsResults value) {
        return new JAXBElement<CustomerRegionMatrixStatisticsResults>(_CustomerRegionMatrixStatisticsResults_QNAME, CustomerRegionMatrixStatisticsResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMatrixBuildResultExt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ArrayOfMatrixBuildResultExt")
    public JAXBElement<ArrayOfMatrixBuildResultExt> createArrayOfMatrixBuildResultExt(ArrayOfMatrixBuildResultExt value) {
        return new JAXBElement<ArrayOfMatrixBuildResultExt>(_ArrayOfMatrixBuildResultExt_QNAME, ArrayOfMatrixBuildResultExt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixBuildResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MatrixBuildResults")
    public JAXBElement<MatrixBuildResults> createMatrixBuildResults(MatrixBuildResults value) {
        return new JAXBElement<MatrixBuildResults>(_MatrixBuildResults_QNAME, MatrixBuildResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdminReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ArrayOfAdminReport")
    public JAXBElement<ArrayOfAdminReport> createArrayOfAdminReport(ArrayOfAdminReport value) {
        return new JAXBElement<ArrayOfAdminReport>(_ArrayOfAdminReport_QNAME, ArrayOfAdminReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestCustomerXrsSettingsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "TestCustomerXrsSettingsParameters")
    public JAXBElement<TestCustomerXrsSettingsParameters> createTestCustomerXrsSettingsParameters(TestCustomerXrsSettingsParameters value) {
        return new JAXBElement<TestCustomerXrsSettingsParameters>(_TestCustomerXrsSettingsParameters_QNAME, TestCustomerXrsSettingsParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestCustomerXrsSettingsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "TestCustomerXrsSettingsResults")
    public JAXBElement<TestCustomerXrsSettingsResults> createTestCustomerXrsSettingsResults(TestCustomerXrsSettingsResults value) {
        return new JAXBElement<TestCustomerXrsSettingsResults>(_TestCustomerXrsSettingsResults_QNAME, TestCustomerXrsSettingsResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadCustomReportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "UploadCustomReportParameters")
    public JAXBElement<UploadCustomReportParameters> createUploadCustomReportParameters(UploadCustomReportParameters value) {
        return new JAXBElement<UploadCustomReportParameters>(_UploadCustomReportParameters_QNAME, UploadCustomReportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadCustomReportResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "UploadCustomReportResults")
    public JAXBElement<UploadCustomReportResults> createUploadCustomReportResults(UploadCustomReportResults value) {
        return new JAXBElement<UploadCustomReportResults>(_UploadCustomReportResults_QNAME, UploadCustomReportResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceLookupParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DeviceLookupParameters")
    public JAXBElement<DeviceLookupParameters> createDeviceLookupParameters(DeviceLookupParameters value) {
        return new JAXBElement<DeviceLookupParameters>(_DeviceLookupParameters_QNAME, DeviceLookupParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceLookupResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DeviceLookupResults")
    public JAXBElement<DeviceLookupResults> createDeviceLookupResults(DeviceLookupResults value) {
        return new JAXBElement<DeviceLookupResults>(_DeviceLookupResults_QNAME, DeviceLookupResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeviceLookupResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ArrayOfDeviceLookupResult")
    public JAXBElement<ArrayOfDeviceLookupResult> createArrayOfDeviceLookupResult(ArrayOfDeviceLookupResult value) {
        return new JAXBElement<ArrayOfDeviceLookupResult>(_ArrayOfDeviceLookupResult_QNAME, ArrayOfDeviceLookupResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ArrayOfCustomer")
    public JAXBElement<ArrayOfCustomer> createArrayOfCustomer(ArrayOfCustomer value) {
        return new JAXBElement<ArrayOfCustomer>(_ArrayOfCustomer_QNAME, ArrayOfCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoggingSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "LoggingSettings")
    public JAXBElement<LoggingSettings> createLoggingSettings(LoggingSettings value) {
        return new JAXBElement<LoggingSettings>(_LoggingSettings_QNAME, LoggingSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportOBD2DiagnosticTroubleCodesParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.ImportOBD2", name = "ImportOBD2DiagnosticTroubleCodesParameters")
    public JAXBElement<ImportOBD2DiagnosticTroubleCodesParameters> createImportOBD2DiagnosticTroubleCodesParameters(ImportOBD2DiagnosticTroubleCodesParameters value) {
        return new JAXBElement<ImportOBD2DiagnosticTroubleCodesParameters>(_ImportOBD2DiagnosticTroubleCodesParameters_QNAME, ImportOBD2DiagnosticTroubleCodesParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachCustomerParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", name = "AttachCustomerParameters")
    public JAXBElement<AttachCustomerParameters> createAttachCustomerParameters(AttachCustomerParameters value) {
        return new JAXBElement<AttachCustomerParameters>(_AttachCustomerParameters_QNAME, AttachCustomerParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerRegionsParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", name = "UpdateCustomerRegionsParameters")
    public JAXBElement<UpdateCustomerRegionsParameters> createUpdateCustomerRegionsParameters(UpdateCustomerRegionsParameters value) {
        return new JAXBElement<UpdateCustomerRegionsParameters>(_UpdateCustomerRegionsParameters_QNAME, UpdateCustomerRegionsParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", name = "ArrayOfUpdateCustomerRegionsParameters.TransferHistoricRoutesRegionInfo")
    public JAXBElement<ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo> createArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo(ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo value) {
        return new JAXBElement<ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo>(_ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo_QNAME, ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", name = "UpdateCustomerRegionsParameters.TransferHistoricRoutesRegionInfo")
    public JAXBElement<UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo> createUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo(UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo value) {
        return new JAXBElement<UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo>(_UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo_QNAME, UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShadowProductionParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.ShadowProduction", name = "ShadowProductionParameters")
    public JAXBElement<ShadowProductionParameters> createShadowProductionParameters(ShadowProductionParameters value) {
        return new JAXBElement<ShadowProductionParameters>(_ShadowProductionParameters_QNAME, ShadowProductionParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DatabaseCreator", name = "CreateCustomerParameters")
    public JAXBElement<CreateCustomerParameters> createCreateCustomerParameters(CreateCustomerParameters value) {
        return new JAXBElement<CreateCustomerParameters>(_CreateCustomerParameters_QNAME, CreateCustomerParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDatabaseParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DatabaseCreator", name = "CreateDatabaseParameters")
    public JAXBElement<CreateDatabaseParameters> createCreateDatabaseParameters(CreateDatabaseParameters value) {
        return new JAXBElement<CreateDatabaseParameters>(_CreateDatabaseParameters_QNAME, CreateDatabaseParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomersParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.FindCustomerUsage", name = "FindCustomersParameters")
    public JAXBElement<FindCustomersParameters> createFindCustomersParameters(FindCustomersParameters value) {
        return new JAXBElement<FindCustomersParameters>(_FindCustomersParameters_QNAME, FindCustomersParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeDataWarehouseParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.InitializeDataWarehouse", name = "InitializeDataWarehouseParameters")
    public JAXBElement<InitializeDataWarehouseParameters> createInitializeDataWarehouseParameters(InitializeDataWarehouseParameters value) {
        return new JAXBElement<InitializeDataWarehouseParameters>(_InitializeDataWarehouseParameters_QNAME, InitializeDataWarehouseParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RdcMigrationParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.RdcMigration", name = "RdcMigrationParameters")
    public JAXBElement<RdcMigrationParameters> createRdcMigrationParameters(RdcMigrationParameters value) {
        return new JAXBElement<RdcMigrationParameters>(_RdcMigrationParameters_QNAME, RdcMigrationParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XrsMigrationParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.XrsMigration", name = "XrsMigrationParameters")
    public JAXBElement<XrsMigrationParameters> createXrsMigrationParameters(XrsMigrationParameters value) {
        return new JAXBElement<XrsMigrationParameters>(_XrsMigrationParameters_QNAME, XrsMigrationParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", name = "EndDate", scope = UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo.class)
    public JAXBElement<XMLGregorianCalendar> createUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfoEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfoEndDate_QNAME, XMLGregorianCalendar.class, UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", name = "StartDate", scope = UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo.class)
    public JAXBElement<XMLGregorianCalendar> createUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfoStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfoStartDate_QNAME, XMLGregorianCalendar.class, UpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerClientApplicationVersionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerClientApplicationVersionPropertyOptions", scope = CustomerPropertyOptions.class)
    public JAXBElement<CustomerClientApplicationVersionPropertyOptions> createCustomerPropertyOptionsCustomerClientApplicationVersionPropertyOptions(CustomerClientApplicationVersionPropertyOptions value) {
        return new JAXBElement<CustomerClientApplicationVersionPropertyOptions>(_CustomerPropertyOptionsCustomerClientApplicationVersionPropertyOptions_QNAME, CustomerClientApplicationVersionPropertyOptions.class, CustomerPropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataRetentionPolicyPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RetentionPolicyOptions", scope = CustomerPropertyOptions.class)
    public JAXBElement<DataRetentionPolicyPropertyOptions> createCustomerPropertyOptionsRetentionPolicyOptions(DataRetentionPolicyPropertyOptions value) {
        return new JAXBElement<DataRetentionPolicyPropertyOptions>(_CustomerPropertyOptionsRetentionPolicyOptions_QNAME, DataRetentionPolicyPropertyOptions.class, CustomerPropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomersResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Result", scope = FindCustomersJobInfo.class)
    public JAXBElement<FindCustomersResult> createFindCustomersJobInfoResult(FindCustomersResult value) {
        return new JAXBElement<FindCustomersResult>(_FindCustomersJobInfoResult_QNAME, FindCustomersResult.class, FindCustomersJobInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Body", scope = QueuedMessage.class)
    public JAXBElement<String> createQueuedMessageBody(String value) {
        return new JAXBElement<String>(_QueuedMessageBody_QNAME, String.class, QueuedMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "NotificationMethod_Method", scope = QueuedMessage.class)
    public JAXBElement<String> createQueuedMessageNotificationMethodMethod(String value) {
        return new JAXBElement<String>(_QueuedMessageNotificationMethodMethod_QNAME, String.class, QueuedMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Recipient", scope = QueuedMessage.class)
    public JAXBElement<String> createQueuedMessageRecipient(String value) {
        return new JAXBElement<String>(_QueuedMessageRecipient_QNAME, String.class, QueuedMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Subject", scope = QueuedMessage.class)
    public JAXBElement<String> createQueuedMessageSubject(String value) {
        return new JAXBElement<String>(_QueuedMessageSubject_QNAME, String.class, QueuedMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Description", scope = MapDataset.class)
    public JAXBElement<String> createMapDatasetDescription(String value) {
        return new JAXBElement<String>(_MapDatasetDescription_QNAME, String.class, MapDataset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Identifier", scope = MapDataset.class)
    public JAXBElement<String> createMapDatasetIdentifier(String value) {
        return new JAXBElement<String>(_MapDatasetIdentifier_QNAME, String.class, MapDataset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MapVendorIdentifier", scope = MapDataset.class)
    public JAXBElement<String> createMapDatasetMapVendorIdentifier(String value) {
        return new JAXBElement<String>(_MapDatasetMapVendorIdentifier_QNAME, String.class, MapDataset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MapVersion", scope = MapDataset.class)
    public JAXBElement<String> createMapDatasetMapVersion(String value) {
        return new JAXBElement<String>(_MapDatasetMapVersion_QNAME, String.class, MapDataset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RootPath", scope = MapDataset.class)
    public JAXBElement<String> createMapDatasetRootPath(String value) {
        return new JAXBElement<String>(_MapDatasetRootPath_QNAME, String.class, MapDataset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Description", scope = AdminReport.class)
    public JAXBElement<String> createAdminReportDescription(String value) {
        return new JAXBElement<String>(_MapDatasetDescription_QNAME, String.class, AdminReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Name", scope = AdminReport.class)
    public JAXBElement<String> createAdminReportName(String value) {
        return new JAXBElement<String>(_AdminReportName_QNAME, String.class, AdminReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReportParameterDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ParameterDefinitions", scope = AdminReport.class)
    public JAXBElement<ArrayOfReportParameterDefinition> createAdminReportParameterDefinitions(ArrayOfReportParameterDefinition value) {
        return new JAXBElement<ArrayOfReportParameterDefinition>(_AdminReportParameterDefinitions_QNAME, ArrayOfReportParameterDefinition.class, AdminReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ReportType_Type", scope = AdminReport.class)
    public JAXBElement<String> createAdminReportReportTypeType(String value) {
        return new JAXBElement<String>(_AdminReportReportTypeType_QNAME, String.class, AdminReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSystemMessageLocalized }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "LocalizedMessages", scope = SystemMessage.class)
    public JAXBElement<ArrayOfSystemMessageLocalized> createSystemMessageLocalizedMessages(ArrayOfSystemMessageLocalized value) {
        return new JAXBElement<ArrayOfSystemMessageLocalized>(_SystemMessageLocalizedMessages_QNAME, ArrayOfSystemMessageLocalized.class, SystemMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MachineName", scope = ServiceInstanceInfo.class)
    public JAXBElement<String> createServiceInstanceInfoMachineName(String value) {
        return new JAXBElement<String>(_ServiceInstanceInfoMachineName_QNAME, String.class, ServiceInstanceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildCompleteTime", scope = MatrixBuildResult.class)
    public JAXBElement<XMLGregorianCalendar> createMatrixBuildResultBuildCompleteTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MatrixBuildResultBuildCompleteTime_QNAME, XMLGregorianCalendar.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildDurationInSeconds", scope = MatrixBuildResult.class)
    public JAXBElement<Long> createMatrixBuildResultBuildDurationInSeconds(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultBuildDurationInSeconds_QNAME, Long.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildMsgSendTime", scope = MatrixBuildResult.class)
    public JAXBElement<XMLGregorianCalendar> createMatrixBuildResultBuildMsgSendTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MatrixBuildResultBuildMsgSendTime_QNAME, XMLGregorianCalendar.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildServerName", scope = MatrixBuildResult.class)
    public JAXBElement<String> createMatrixBuildResultBuildServerName(String value) {
        return new JAXBElement<String>(_MatrixBuildResultBuildServerName_QNAME, String.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildStartTime", scope = MatrixBuildResult.class)
    public JAXBElement<XMLGregorianCalendar> createMatrixBuildResultBuildStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MatrixBuildResultBuildStartTime_QNAME, XMLGregorianCalendar.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildType", scope = MatrixBuildResult.class)
    public JAXBElement<Long> createMatrixBuildResultBuildType(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultBuildType_QNAME, Long.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MapDatasetPkey", scope = MatrixBuildResult.class)
    public JAXBElement<Long> createMatrixBuildResultMapDatasetPkey(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultMapDatasetPkey_QNAME, Long.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MatricesBuilt", scope = MatrixBuildResult.class)
    public JAXBElement<Long> createMatrixBuildResultMatricesBuilt(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultMatricesBuilt_QNAME, Long.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "NewDepots", scope = MatrixBuildResult.class)
    public JAXBElement<Long> createMatrixBuildResultNewDepots(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultNewDepots_QNAME, Long.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "NewLocations", scope = MatrixBuildResult.class)
    public JAXBElement<Long> createMatrixBuildResultNewLocations(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultNewLocations_QNAME, Long.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "QueueDurationInSeconds", scope = MatrixBuildResult.class)
    public JAXBElement<Long> createMatrixBuildResultQueueDurationInSeconds(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultQueueDurationInSeconds_QNAME, Long.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ReasonForFullBuild", scope = MatrixBuildResult.class)
    public JAXBElement<Long> createMatrixBuildResultReasonForFullBuild(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultReasonForFullBuild_QNAME, Long.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RequestServerName", scope = MatrixBuildResult.class)
    public JAXBElement<String> createMatrixBuildResultRequestServerName(String value) {
        return new JAXBElement<String>(_MatrixBuildResultRequestServerName_QNAME, String.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "TotalDepots", scope = MatrixBuildResult.class)
    public JAXBElement<Long> createMatrixBuildResultTotalDepots(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultTotalDepots_QNAME, Long.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "TotalLocations", scope = MatrixBuildResult.class)
    public JAXBElement<Long> createMatrixBuildResultTotalLocations(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultTotalLocations_QNAME, Long.class, MatrixBuildResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Description", scope = Database.class)
    public JAXBElement<String> createDatabaseDescription(String value) {
        return new JAXBElement<String>(_MapDatasetDescription_QNAME, String.class, Database.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Identifier", scope = Database.class)
    public JAXBElement<String> createDatabaseIdentifier(String value) {
        return new JAXBElement<String>(_MapDatasetIdentifier_QNAME, String.class, Database.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "PhysicalName", scope = Database.class)
    public JAXBElement<String> createDatabasePhysicalName(String value) {
        return new JAXBElement<String>(_DatabasePhysicalName_QNAME, String.class, Database.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BusinessUnitIdentifier", scope = CustomerRegion.class)
    public JAXBElement<String> createCustomerRegionBusinessUnitIdentifier(String value) {
        return new JAXBElement<String>(_CustomerRegionBusinessUnitIdentifier_QNAME, String.class, CustomerRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Description", scope = CustomerRegion.class)
    public JAXBElement<String> createCustomerRegionDescription(String value) {
        return new JAXBElement<String>(_MapDatasetDescription_QNAME, String.class, CustomerRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Identifier", scope = CustomerRegion.class)
    public JAXBElement<String> createCustomerRegionIdentifier(String value) {
        return new JAXBElement<String>(_MapDatasetIdentifier_QNAME, String.class, CustomerRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "OldestRoutingSessionDate", scope = CustomerRegion.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerRegionOldestRoutingSessionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CustomerRegionOldestRoutingSessionDate_QNAME, XMLGregorianCalendar.class, CustomerRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RoutingFacilityEntityKey", scope = CustomerRegion.class)
    public JAXBElement<Long> createCustomerRegionRoutingFacilityEntityKey(Long value) {
        return new JAXBElement<Long>(_CustomerRegionRoutingFacilityEntityKey_QNAME, Long.class, CustomerRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "TransitMatrixLastBuildRequestSendTime", scope = CustomerRegion.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerRegionTransitMatrixLastBuildRequestSendTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CustomerRegionTransitMatrixLastBuildRequestSendTime_QNAME, XMLGregorianCalendar.class, CustomerRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Description", scope = CustomerBusinessUnit.class)
    public JAXBElement<String> createCustomerBusinessUnitDescription(String value) {
        return new JAXBElement<String>(_MapDatasetDescription_QNAME, String.class, CustomerBusinessUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Identifier", scope = CustomerBusinessUnit.class)
    public JAXBElement<String> createCustomerBusinessUnitIdentifier(String value) {
        return new JAXBElement<String>(_MapDatasetIdentifier_QNAME, String.class, CustomerBusinessUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildCompleteTime", scope = MatrixBuildResultExt.class)
    public JAXBElement<XMLGregorianCalendar> createMatrixBuildResultExtBuildCompleteTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MatrixBuildResultBuildCompleteTime_QNAME, XMLGregorianCalendar.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildDurationInSeconds", scope = MatrixBuildResultExt.class)
    public JAXBElement<Long> createMatrixBuildResultExtBuildDurationInSeconds(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultBuildDurationInSeconds_QNAME, Long.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildMsgSendTime", scope = MatrixBuildResultExt.class)
    public JAXBElement<XMLGregorianCalendar> createMatrixBuildResultExtBuildMsgSendTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MatrixBuildResultBuildMsgSendTime_QNAME, XMLGregorianCalendar.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildServerName", scope = MatrixBuildResultExt.class)
    public JAXBElement<String> createMatrixBuildResultExtBuildServerName(String value) {
        return new JAXBElement<String>(_MatrixBuildResultBuildServerName_QNAME, String.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildStartTime", scope = MatrixBuildResultExt.class)
    public JAXBElement<XMLGregorianCalendar> createMatrixBuildResultExtBuildStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MatrixBuildResultBuildStartTime_QNAME, XMLGregorianCalendar.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildStatus", scope = MatrixBuildResultExt.class)
    public JAXBElement<String> createMatrixBuildResultExtBuildStatus(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtBuildStatus_QNAME, String.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildType", scope = MatrixBuildResultExt.class)
    public JAXBElement<String> createMatrixBuildResultExtBuildType(String value) {
        return new JAXBElement<String>(_MatrixBuildResultBuildType_QNAME, String.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerDescription", scope = MatrixBuildResultExt.class)
    public JAXBElement<String> createMatrixBuildResultExtCustomerDescription(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtCustomerDescription_QNAME, String.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerIdentifier", scope = MatrixBuildResultExt.class)
    public JAXBElement<String> createMatrixBuildResultExtCustomerIdentifier(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtCustomerIdentifier_QNAME, String.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MapDatasetPkey", scope = MatrixBuildResultExt.class)
    public JAXBElement<Long> createMatrixBuildResultExtMapDatasetPkey(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultMapDatasetPkey_QNAME, Long.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MapPath", scope = MatrixBuildResultExt.class)
    public JAXBElement<String> createMatrixBuildResultExtMapPath(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtMapPath_QNAME, String.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MapPathOverride", scope = MatrixBuildResultExt.class)
    public JAXBElement<String> createMatrixBuildResultExtMapPathOverride(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtMapPathOverride_QNAME, String.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MatricesBuilt", scope = MatrixBuildResultExt.class)
    public JAXBElement<Long> createMatrixBuildResultExtMatricesBuilt(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultMatricesBuilt_QNAME, Long.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "NewDepots", scope = MatrixBuildResultExt.class)
    public JAXBElement<Long> createMatrixBuildResultExtNewDepots(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultNewDepots_QNAME, Long.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "NewLocations", scope = MatrixBuildResultExt.class)
    public JAXBElement<Long> createMatrixBuildResultExtNewLocations(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultNewLocations_QNAME, Long.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "NewMapEditsExist", scope = MatrixBuildResultExt.class)
    public JAXBElement<Boolean> createMatrixBuildResultExtNewMapEditsExist(Boolean value) {
        return new JAXBElement<Boolean>(_MatrixBuildResultExtNewMapEditsExist_QNAME, Boolean.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "QueueDurationInSeconds", scope = MatrixBuildResultExt.class)
    public JAXBElement<Long> createMatrixBuildResultExtQueueDurationInSeconds(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultQueueDurationInSeconds_QNAME, Long.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ReasonForFullBuild", scope = MatrixBuildResultExt.class)
    public JAXBElement<String> createMatrixBuildResultExtReasonForFullBuild(String value) {
        return new JAXBElement<String>(_MatrixBuildResultReasonForFullBuild_QNAME, String.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RegionDescription", scope = MatrixBuildResultExt.class)
    public JAXBElement<String> createMatrixBuildResultExtRegionDescription(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtRegionDescription_QNAME, String.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RegionIdentifier", scope = MatrixBuildResultExt.class)
    public JAXBElement<String> createMatrixBuildResultExtRegionIdentifier(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtRegionIdentifier_QNAME, String.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RequestServerName", scope = MatrixBuildResultExt.class)
    public JAXBElement<String> createMatrixBuildResultExtRequestServerName(String value) {
        return new JAXBElement<String>(_MatrixBuildResultRequestServerName_QNAME, String.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "TotalDepots", scope = MatrixBuildResultExt.class)
    public JAXBElement<Long> createMatrixBuildResultExtTotalDepots(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultTotalDepots_QNAME, Long.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "TotalLocations", scope = MatrixBuildResultExt.class)
    public JAXBElement<Long> createMatrixBuildResultExtTotalLocations(Long value) {
        return new JAXBElement<Long>(_MatrixBuildResultTotalLocations_QNAME, Long.class, MatrixBuildResultExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BackupDirectory", scope = DatabaseServerGroup.class)
    public JAXBElement<String> createDatabaseServerGroupBackupDirectory(String value) {
        return new JAXBElement<String>(_DatabaseServerGroupBackupDirectory_QNAME, String.class, DatabaseServerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Description", scope = DatabaseServerGroup.class)
    public JAXBElement<String> createDatabaseServerGroupDescription(String value) {
        return new JAXBElement<String>(_MapDatasetDescription_QNAME, String.class, DatabaseServerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Identifier", scope = DatabaseServerGroup.class)
    public JAXBElement<String> createDatabaseServerGroupIdentifier(String value) {
        return new JAXBElement<String>(_MapDatasetIdentifier_QNAME, String.class, DatabaseServerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ServerGroupType_Type", scope = DatabaseServerGroup.class)
    public JAXBElement<String> createDatabaseServerGroupServerGroupTypeType(String value) {
        return new JAXBElement<String>(_DatabaseServerGroupServerGroupTypeType_QNAME, String.class, DatabaseServerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MirrorServer", scope = MirroredDatabaseServerGroup.class)
    public JAXBElement<String> createMirroredDatabaseServerGroupMirrorServer(String value) {
        return new JAXBElement<String>(_MirroredDatabaseServerGroupMirrorServer_QNAME, String.class, MirroredDatabaseServerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MirrorServerPort", scope = MirroredDatabaseServerGroup.class)
    public JAXBElement<Integer> createMirroredDatabaseServerGroupMirrorServerPort(Integer value) {
        return new JAXBElement<Integer>(_MirroredDatabaseServerGroupMirrorServerPort_QNAME, Integer.class, MirroredDatabaseServerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "PrincipalServer", scope = MirroredDatabaseServerGroup.class)
    public JAXBElement<String> createMirroredDatabaseServerGroupPrincipalServer(String value) {
        return new JAXBElement<String>(_MirroredDatabaseServerGroupPrincipalServer_QNAME, String.class, MirroredDatabaseServerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "PrincipalServerPort", scope = MirroredDatabaseServerGroup.class)
    public JAXBElement<Integer> createMirroredDatabaseServerGroupPrincipalServerPort(Integer value) {
        return new JAXBElement<Integer>(_MirroredDatabaseServerGroupPrincipalServerPort_QNAME, Integer.class, MirroredDatabaseServerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "WitnessServer", scope = MirroredDatabaseServerGroup.class)
    public JAXBElement<String> createMirroredDatabaseServerGroupWitnessServer(String value) {
        return new JAXBElement<String>(_MirroredDatabaseServerGroupWitnessServer_QNAME, String.class, MirroredDatabaseServerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "WitnessServerPort", scope = MirroredDatabaseServerGroup.class)
    public JAXBElement<Integer> createMirroredDatabaseServerGroupWitnessServerPort(Integer value) {
        return new JAXBElement<Integer>(_MirroredDatabaseServerGroupWitnessServerPort_QNAME, Integer.class, MirroredDatabaseServerGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Server", scope = SingleDatabaseServer.class)
    public JAXBElement<String> createSingleDatabaseServerServer(String value) {
        return new JAXBElement<String>(_SingleDatabaseServerServer_QNAME, String.class, SingleDatabaseServer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "AvailabilityGroup", scope = AlwaysOnAvailabilityGroup.class)
    public JAXBElement<String> createAlwaysOnAvailabilityGroupAvailabilityGroup(String value) {
        return new JAXBElement<String>(_AlwaysOnAvailabilityGroupAvailabilityGroup_QNAME, String.class, AlwaysOnAvailabilityGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Listener", scope = AlwaysOnAvailabilityGroup.class)
    public JAXBElement<String> createAlwaysOnAvailabilityGroupListener(String value) {
        return new JAXBElement<String>(_AlwaysOnAvailabilityGroupListener_QNAME, String.class, AlwaysOnAvailabilityGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "PrimaryReplicaServer", scope = AlwaysOnAvailabilityGroup.class)
    public JAXBElement<String> createAlwaysOnAvailabilityGroupPrimaryReplicaServer(String value) {
        return new JAXBElement<String>(_AlwaysOnAvailabilityGroupPrimaryReplicaServer_QNAME, String.class, AlwaysOnAvailabilityGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Culture", scope = SystemMessageLocalized.class)
    public JAXBElement<String> createSystemMessageLocalizedCulture(String value) {
        return new JAXBElement<String>(_SystemMessageLocalizedCulture_QNAME, String.class, SystemMessageLocalized.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Message", scope = SystemMessageLocalized.class)
    public JAXBElement<String> createSystemMessageLocalizedMessage(String value) {
        return new JAXBElement<String>(_SystemMessageLocalizedMessage_QNAME, String.class, SystemMessageLocalized.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsCompanyIdentity", scope = XrsCustomerInfo.class)
    public JAXBElement<String> createXrsCustomerInfoXrsCompanyIdentity(String value) {
        return new JAXBElement<String>(_XrsCustomerInfoXrsCompanyIdentity_QNAME, String.class, XrsCustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsCompanySid", scope = XrsCustomerInfo.class)
    public JAXBElement<Long> createXrsCustomerInfoXrsCompanySid(Long value) {
        return new JAXBElement<Long>(_XrsCustomerInfoXrsCompanySid_QNAME, Long.class, XrsCustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsTopLevelOrganizationSid", scope = XrsCustomerInfo.class)
    public JAXBElement<Long> createXrsCustomerInfoXrsTopLevelOrganizationSid(Long value) {
        return new JAXBElement<Long>(_XrsCustomerInfoXrsTopLevelOrganizationSid_QNAME, Long.class, XrsCustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Description", scope = CustomerInfo.class)
    public JAXBElement<String> createCustomerInfoDescription(String value) {
        return new JAXBElement<String>(_MapDatasetDescription_QNAME, String.class, CustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Identifier", scope = CustomerInfo.class)
    public JAXBElement<String> createCustomerInfoIdentifier(String value) {
        return new JAXBElement<String>(_MapDatasetIdentifier_QNAME, String.class, CustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "PartnerDescription", scope = CustomerInfo.class)
    public JAXBElement<String> createCustomerInfoPartnerDescription(String value) {
        return new JAXBElement<String>(_CustomerInfoPartnerDescription_QNAME, String.class, CustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerInfos", scope = FindCustomersResult.class)
    public JAXBElement<ArrayOfCustomerInfo> createFindCustomersResultCustomerInfos(ArrayOfCustomerInfo value) {
        return new JAXBElement<ArrayOfCustomerInfo>(_FindCustomersResultCustomerInfos_QNAME, ArrayOfCustomerInfo.class, FindCustomersResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BusinessUnitIdentifier", scope = DeviceLookupResult.class)
    public JAXBElement<String> createDeviceLookupResultBusinessUnitIdentifier(String value) {
        return new JAXBElement<String>(_CustomerRegionBusinessUnitIdentifier_QNAME, String.class, DeviceLookupResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerDescription", scope = DeviceLookupResult.class)
    public JAXBElement<String> createDeviceLookupResultCustomerDescription(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtCustomerDescription_QNAME, String.class, DeviceLookupResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerIdentifier", scope = DeviceLookupResult.class)
    public JAXBElement<String> createDeviceLookupResultCustomerIdentifier(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtCustomerIdentifier_QNAME, String.class, DeviceLookupResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DeviceDescription", scope = DeviceLookupResult.class)
    public JAXBElement<String> createDeviceLookupResultDeviceDescription(String value) {
        return new JAXBElement<String>(_DeviceLookupResultDeviceDescription_QNAME, String.class, DeviceLookupResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DeviceIdentifier", scope = DeviceLookupResult.class)
    public JAXBElement<String> createDeviceLookupResultDeviceIdentifier(String value) {
        return new JAXBElement<String>(_DeviceLookupResultDeviceIdentifier_QNAME, String.class, DeviceLookupResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DevicePhoneNumber", scope = DeviceLookupResult.class)
    public JAXBElement<String> createDeviceLookupResultDevicePhoneNumber(String value) {
        return new JAXBElement<String>(_DeviceLookupResultDevicePhoneNumber_QNAME, String.class, DeviceLookupResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RegionIdentifier", scope = DeviceLookupResult.class)
    public JAXBElement<String> createDeviceLookupResultRegionIdentifier(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtRegionIdentifier_QNAME, String.class, DeviceLookupResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "LoggingLevel_LoggingLevel", scope = LoggingSettings.class)
    public JAXBElement<String> createLoggingSettingsLoggingLevelLoggingLevel(String value) {
        return new JAXBElement<String>(_LoggingSettingsLoggingLevelLoggingLevel_QNAME, String.class, LoggingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeviceLookupResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "LookupResults", scope = DeviceLookupResults.class)
    public JAXBElement<ArrayOfDeviceLookupResult> createDeviceLookupResultsLookupResults(ArrayOfDeviceLookupResult value) {
        return new JAXBElement<ArrayOfDeviceLookupResult>(_DeviceLookupResultsLookupResults_QNAME, ArrayOfDeviceLookupResult.class, DeviceLookupResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerEntityKey", scope = DeviceLookupParameters.class)
    public JAXBElement<Long> createDeviceLookupParametersCustomerEntityKey(Long value) {
        return new JAXBElement<Long>(_DeviceLookupParametersCustomerEntityKey_QNAME, Long.class, DeviceLookupParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DeviceIdentifier", scope = DeviceLookupParameters.class)
    public JAXBElement<String> createDeviceLookupParametersDeviceIdentifier(String value) {
        return new JAXBElement<String>(_DeviceLookupResultDeviceIdentifier_QNAME, String.class, DeviceLookupParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.XrsMigration", name = "Workbook", scope = XrsMigrationParameters.class)
    public JAXBElement<byte[]> createXrsMigrationParametersWorkbook(byte[] value) {
        return new JAXBElement<byte[]>(_XrsMigrationParametersWorkbook_QNAME, byte[].class, XrsMigrationParameters.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.RdcMigration", name = "Workbook", scope = RdcMigrationParameters.class)
    public JAXBElement<byte[]> createRdcMigrationParametersWorkbook(byte[] value) {
        return new JAXBElement<byte[]>(_RdcMigrationParametersWorkbook_QNAME, byte[].class, RdcMigrationParameters.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.ImportOBD2", name = "File", scope = ImportOBD2DiagnosticTroubleCodesParameters.class)
    public JAXBElement<byte[]> createImportOBD2DiagnosticTroubleCodesParametersFile(byte[] value) {
        return new JAXBElement<byte[]>(_ImportOBD2DiagnosticTroubleCodesParametersFile_QNAME, byte[].class, ImportOBD2DiagnosticTroubleCodesParameters.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BusinessUnitEntityKeys", scope = UploadCustomReportParameters.class)
    public JAXBElement<ArrayOflong> createUploadCustomReportParametersBusinessUnitEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_UploadCustomReportParametersBusinessUnitEntityKeys_QNAME, ArrayOflong.class, UploadCustomReportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Report }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Report", scope = UploadCustomReportParameters.class)
    public JAXBElement<Report> createUploadCustomReportParametersReport(Report value) {
        return new JAXBElement<Report>(_UploadCustomReportParametersReport_QNAME, Report.class, UploadCustomReportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ReportFileName", scope = UploadCustomReportParameters.class)
    public JAXBElement<String> createUploadCustomReportParametersReportFileName(String value) {
        return new JAXBElement<String>(_UploadCustomReportParametersReportFileName_QNAME, String.class, UploadCustomReportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "StoredProcedureScriptFileName", scope = UploadCustomReportParameters.class)
    public JAXBElement<String> createUploadCustomReportParametersStoredProcedureScriptFileName(String value) {
        return new JAXBElement<String>(_UploadCustomReportParametersStoredProcedureScriptFileName_QNAME, String.class, UploadCustomReportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "AllSettingsValid", scope = TestCustomerXrsSettingsResults.class)
    public JAXBElement<Boolean> createTestCustomerXrsSettingsResultsAllSettingsValid(Boolean value) {
        return new JAXBElement<Boolean>(_TestCustomerXrsSettingsResultsAllSettingsValid_QNAME, Boolean.class, TestCustomerXrsSettingsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CompanyIdValid", scope = TestCustomerXrsSettingsResults.class)
    public JAXBElement<Boolean> createTestCustomerXrsSettingsResultsCompanyIdValid(Boolean value) {
        return new JAXBElement<Boolean>(_TestCustomerXrsSettingsResultsCompanyIdValid_QNAME, Boolean.class, TestCustomerXrsSettingsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CompanyLoginIdValid", scope = TestCustomerXrsSettingsResults.class)
    public JAXBElement<Boolean> createTestCustomerXrsSettingsResultsCompanyLoginIdValid(Boolean value) {
        return new JAXBElement<Boolean>(_TestCustomerXrsSettingsResultsCompanyLoginIdValid_QNAME, Boolean.class, TestCustomerXrsSettingsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "LoginCredentialsValid", scope = TestCustomerXrsSettingsResults.class)
    public JAXBElement<Boolean> createTestCustomerXrsSettingsResultsLoginCredentialsValid(Boolean value) {
        return new JAXBElement<Boolean>(_TestCustomerXrsSettingsResultsLoginCredentialsValid_QNAME, Boolean.class, TestCustomerXrsSettingsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "NonAdminUserRoleValid", scope = TestCustomerXrsSettingsResults.class)
    public JAXBElement<Boolean> createTestCustomerXrsSettingsResultsNonAdminUserRoleValid(Boolean value) {
        return new JAXBElement<Boolean>(_TestCustomerXrsSettingsResultsNonAdminUserRoleValid_QNAME, Boolean.class, TestCustomerXrsSettingsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "PublicWebServicesUrlValid", scope = TestCustomerXrsSettingsResults.class)
    public JAXBElement<Boolean> createTestCustomerXrsSettingsResultsPublicWebServicesUrlValid(Boolean value) {
        return new JAXBElement<Boolean>(_TestCustomerXrsSettingsResultsPublicWebServicesUrlValid_QNAME, Boolean.class, TestCustomerXrsSettingsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "TopLevelOrganizationIdValid", scope = TestCustomerXrsSettingsResults.class)
    public JAXBElement<Boolean> createTestCustomerXrsSettingsResultsTopLevelOrganizationIdValid(Boolean value) {
        return new JAXBElement<Boolean>(_TestCustomerXrsSettingsResultsTopLevelOrganizationIdValid_QNAME, Boolean.class, TestCustomerXrsSettingsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "WebPortalUrlValid", scope = TestCustomerXrsSettingsResults.class)
    public JAXBElement<Boolean> createTestCustomerXrsSettingsResultsWebPortalUrlValid(Boolean value) {
        return new JAXBElement<Boolean>(_TestCustomerXrsSettingsResultsWebPortalUrlValid_QNAME, Boolean.class, TestCustomerXrsSettingsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "WebServicesUrlValid", scope = TestCustomerXrsSettingsResults.class)
    public JAXBElement<Boolean> createTestCustomerXrsSettingsResultsWebServicesUrlValid(Boolean value) {
        return new JAXBElement<Boolean>(_TestCustomerXrsSettingsResultsWebServicesUrlValid_QNAME, Boolean.class, TestCustomerXrsSettingsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CompanyId", scope = TestCustomerXrsSettingsParameters.class)
    public JAXBElement<String> createTestCustomerXrsSettingsParametersCompanyId(String value) {
        return new JAXBElement<String>(_TestCustomerXrsSettingsParametersCompanyId_QNAME, String.class, TestCustomerXrsSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CompanyLoginId", scope = TestCustomerXrsSettingsParameters.class)
    public JAXBElement<String> createTestCustomerXrsSettingsParametersCompanyLoginId(String value) {
        return new JAXBElement<String>(_TestCustomerXrsSettingsParametersCompanyLoginId_QNAME, String.class, TestCustomerXrsSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ComplianceIntegrationType", scope = TestCustomerXrsSettingsParameters.class)
    public JAXBElement<String> createTestCustomerXrsSettingsParametersComplianceIntegrationType(String value) {
        return new JAXBElement<String>(_TestCustomerXrsSettingsParametersComplianceIntegrationType_QNAME, String.class, TestCustomerXrsSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "NonAdminUserRole", scope = TestCustomerXrsSettingsParameters.class)
    public JAXBElement<String> createTestCustomerXrsSettingsParametersNonAdminUserRole(String value) {
        return new JAXBElement<String>(_TestCustomerXrsSettingsParametersNonAdminUserRole_QNAME, String.class, TestCustomerXrsSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "PublicWebServicesUrl", scope = TestCustomerXrsSettingsParameters.class)
    public JAXBElement<String> createTestCustomerXrsSettingsParametersPublicWebServicesUrl(String value) {
        return new JAXBElement<String>(_TestCustomerXrsSettingsParametersPublicWebServicesUrl_QNAME, String.class, TestCustomerXrsSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "TopLevelOrganizationId", scope = TestCustomerXrsSettingsParameters.class)
    public JAXBElement<String> createTestCustomerXrsSettingsParametersTopLevelOrganizationId(String value) {
        return new JAXBElement<String>(_TestCustomerXrsSettingsParametersTopLevelOrganizationId_QNAME, String.class, TestCustomerXrsSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "WebPortalUrl", scope = TestCustomerXrsSettingsParameters.class)
    public JAXBElement<String> createTestCustomerXrsSettingsParametersWebPortalUrl(String value) {
        return new JAXBElement<String>(_TestCustomerXrsSettingsParametersWebPortalUrl_QNAME, String.class, TestCustomerXrsSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "WebServicesPassword", scope = TestCustomerXrsSettingsParameters.class)
    public JAXBElement<String> createTestCustomerXrsSettingsParametersWebServicesPassword(String value) {
        return new JAXBElement<String>(_TestCustomerXrsSettingsParametersWebServicesPassword_QNAME, String.class, TestCustomerXrsSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "WebServicesUrl", scope = TestCustomerXrsSettingsParameters.class)
    public JAXBElement<String> createTestCustomerXrsSettingsParametersWebServicesUrl(String value) {
        return new JAXBElement<String>(_TestCustomerXrsSettingsParametersWebServicesUrl_QNAME, String.class, TestCustomerXrsSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "WebServicesUsername", scope = TestCustomerXrsSettingsParameters.class)
    public JAXBElement<String> createTestCustomerXrsSettingsParametersWebServicesUsername(String value) {
        return new JAXBElement<String>(_TestCustomerXrsSettingsParametersWebServicesUsername_QNAME, String.class, TestCustomerXrsSettingsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DatabaseCreator", name = "Description", scope = CreateDatabaseParameters.class)
    public JAXBElement<String> createCreateDatabaseParametersDescription(String value) {
        return new JAXBElement<String>(_CreateDatabaseParametersDescription_QNAME, String.class, CreateDatabaseParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DatabaseCreator", name = "Identifier", scope = CreateDatabaseParameters.class)
    public JAXBElement<String> createCreateDatabaseParametersIdentifier(String value) {
        return new JAXBElement<String>(_CreateDatabaseParametersIdentifier_QNAME, String.class, CreateDatabaseParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DatabaseCreator", name = "CustomerIdentifier", scope = CreateCustomerParameters.class)
    public JAXBElement<String> createCreateCustomerParametersCustomerIdentifier(String value) {
        return new JAXBElement<String>(_CreateCustomerParametersCustomerIdentifier_QNAME, String.class, CreateCustomerParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", name = "RegionsToUpdate", scope = UpdateCustomerRegionsParameters.class)
    public JAXBElement<ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo> createUpdateCustomerRegionsParametersRegionsToUpdate(ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo value) {
        return new JAXBElement<ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo>(_UpdateCustomerRegionsParametersRegionsToUpdate_QNAME, ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo.class, UpdateCustomerRegionsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", name = "UpdateLegacyDBFilePath", scope = UpdateCustomerRegionsParameters.class)
    public JAXBElement<String> createUpdateCustomerRegionsParametersUpdateLegacyDBFilePath(String value) {
        return new JAXBElement<String>(_UpdateCustomerRegionsParametersUpdateLegacyDBFilePath_QNAME, String.class, UpdateCustomerRegionsParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", name = "BusinessUnitIdentifier", scope = AttachCustomerParameters.class)
    public JAXBElement<String> createAttachCustomerParametersBusinessUnitIdentifier(String value) {
        return new JAXBElement<String>(_AttachCustomerParametersBusinessUnitIdentifier_QNAME, String.class, AttachCustomerParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", name = "RegionIdentifier", scope = AttachCustomerParameters.class)
    public JAXBElement<String> createAttachCustomerParametersRegionIdentifier(String value) {
        return new JAXBElement<String>(_AttachCustomerParametersRegionIdentifier_QNAME, String.class, AttachCustomerParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", name = "UploadedCustomerDBFileName", scope = AttachCustomerParameters.class)
    public JAXBElement<String> createAttachCustomerParametersUploadedCustomerDBFileName(String value) {
        return new JAXBElement<String>(_AttachCustomerParametersUploadedCustomerDBFileName_QNAME, String.class, AttachCustomerParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", name = "UserEmailAdress", scope = AttachCustomerParameters.class)
    public JAXBElement<String> createAttachCustomerParametersUserEmailAdress(String value) {
        return new JAXBElement<String>(_AttachCustomerParametersUserEmailAdress_QNAME, String.class, AttachCustomerParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ResultsWorkbook", scope = MatrixBuildResults.class)
    public JAXBElement<byte[]> createMatrixBuildResultsResultsWorkbook(byte[] value) {
        return new JAXBElement<byte[]>(_MatrixBuildResultsResultsWorkbook_QNAME, byte[].class, MatrixBuildResults.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildStatus", scope = RetrieveMatrixResultsOptions.class)
    public JAXBElement<String> createRetrieveMatrixResultsOptionsBuildStatus(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtBuildStatus_QNAME, String.class, RetrieveMatrixResultsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "BuildType", scope = RetrieveMatrixResultsOptions.class)
    public JAXBElement<String> createRetrieveMatrixResultsOptionsBuildType(String value) {
        return new JAXBElement<String>(_MatrixBuildResultBuildType_QNAME, String.class, RetrieveMatrixResultsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerIdentifier", scope = RetrieveMatrixResultsOptions.class)
    public JAXBElement<String> createRetrieveMatrixResultsOptionsCustomerIdentifier(String value) {
        return new JAXBElement<String>(_MatrixBuildResultExtCustomerIdentifier_QNAME, String.class, RetrieveMatrixResultsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "StatisticsWorkbook", scope = CustomerRegionMatrixStatisticsResults.class)
    public JAXBElement<byte[]> createCustomerRegionMatrixStatisticsResultsStatisticsWorkbook(byte[] value) {
        return new JAXBElement<byte[]>(_CustomerRegionMatrixStatisticsResultsStatisticsWorkbook_QNAME, byte[].class, CustomerRegionMatrixStatisticsResults.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RequestsWorkbook", scope = MatrixBuildRequestResults.class)
    public JAXBElement<byte[]> createMatrixBuildRequestResultsRequestsWorkbook(byte[] value) {
        return new JAXBElement<byte[]>(_MatrixBuildRequestResultsRequestsWorkbook_QNAME, byte[].class, MatrixBuildRequestResults.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransitMatrixBuildRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Messages", scope = MatrixBuildRequestMessages.class)
    public JAXBElement<ArrayOfTransitMatrixBuildRequest> createMatrixBuildRequestMessagesMessages(ArrayOfTransitMatrixBuildRequest value) {
        return new JAXBElement<ArrayOfTransitMatrixBuildRequest>(_MatrixBuildRequestMessagesMessages_QNAME, ArrayOfTransitMatrixBuildRequest.class, MatrixBuildRequestMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerClientApplicationVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ApplicationVersions", scope = Customer.class)
    public JAXBElement<ArrayOfCustomerClientApplicationVersion> createCustomerApplicationVersions(ArrayOfCustomerClientApplicationVersion value) {
        return new JAXBElement<ArrayOfCustomerClientApplicationVersion>(_CustomerApplicationVersions_QNAME, ArrayOfCustomerClientApplicationVersion.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ContractEndDate", scope = Customer.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerContractEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CustomerContractEndDate_QNAME, XMLGregorianCalendar.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ContractStartDate", scope = Customer.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerContractStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CustomerContractStartDate_QNAME, XMLGregorianCalendar.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CreationMethod_DatabaseSource", scope = Customer.class)
    public JAXBElement<String> createCustomerCreationMethodDatabaseSource(String value) {
        return new JAXBElement<String>(_CustomerCreationMethodDatabaseSource_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "CustomerState_State", scope = Customer.class)
    public JAXBElement<String> createCustomerCustomerStateState(String value) {
        return new JAXBElement<String>(_CustomerCustomerStateState_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DataWarehouseTimeOfDayToUpdate", scope = Customer.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerDataWarehouseTimeOfDayToUpdate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CustomerDataWarehouseTimeOfDayToUpdate_QNAME, XMLGregorianCalendar.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DefaultMapDatasetEntityKey", scope = Customer.class)
    public JAXBElement<Long> createCustomerDefaultMapDatasetEntityKey(Long value) {
        return new JAXBElement<Long>(_CustomerDefaultMapDatasetEntityKey_QNAME, Long.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Description", scope = Customer.class)
    public JAXBElement<String> createCustomerDescription(String value) {
        return new JAXBElement<String>(_MapDatasetDescription_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "DeviceMessageProcessingFacilityEntityKey", scope = Customer.class)
    public JAXBElement<Long> createCustomerDeviceMessageProcessingFacilityEntityKey(Long value) {
        return new JAXBElement<Long>(_CustomerDeviceMessageProcessingFacilityEntityKey_QNAME, Long.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ExperimentalFeatureCodes", scope = Customer.class)
    public JAXBElement<String> createCustomerExperimentalFeatureCodes(String value) {
        return new JAXBElement<String>(_CustomerExperimentalFeatureCodes_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "Identifier", scope = Customer.class)
    public JAXBElement<String> createCustomerIdentifier(String value) {
        return new JAXBElement<String>(_MapDatasetIdentifier_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "LastVehicleLicenseViolationDate", scope = Customer.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerLastVehicleLicenseViolationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CustomerLastVehicleLicenseViolationDate_QNAME, XMLGregorianCalendar.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "LicenseComplianceState_VehicleLicenseComplianceState", scope = Customer.class)
    public JAXBElement<String> createCustomerLicenseComplianceStateVehicleLicenseComplianceState(String value) {
        return new JAXBElement<String>(_CustomerLicenseComplianceStateVehicleLicenseComplianceState_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ListOfPurchasableFeaturesEx_CalculatedPurchasedFeatures", scope = Customer.class)
    public JAXBElement<ArrayOfstring> createCustomerListOfPurchasableFeaturesExCalculatedPurchasedFeatures(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CustomerListOfPurchasableFeaturesExCalculatedPurchasedFeatures_QNAME, ArrayOfstring.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "ListOfPurchasableFeaturesEx_PurchasedFeatures", scope = Customer.class)
    public JAXBElement<ArrayOfstring> createCustomerListOfPurchasableFeaturesExPurchasedFeatures(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CustomerListOfPurchasableFeaturesExPurchasedFeatures_QNAME, ArrayOfstring.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "LoggingLevel_LoggingLevel", scope = Customer.class)
    public JAXBElement<String> createCustomerLoggingLevelLoggingLevel(String value) {
        return new JAXBElement<String>(_LoggingSettingsLoggingLevelLoggingLevel_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MaximumDepots", scope = Customer.class)
    public JAXBElement<Integer> createCustomerMaximumDepots(Integer value) {
        return new JAXBElement<Integer>(_CustomerMaximumDepots_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MobileDevicesLicensed", scope = Customer.class)
    public JAXBElement<Integer> createCustomerMobileDevicesLicensed(Integer value) {
        return new JAXBElement<Integer>(_CustomerMobileDevicesLicensed_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MobileOidcClientId", scope = Customer.class)
    public JAXBElement<String> createCustomerMobileOidcClientId(String value) {
        return new JAXBElement<String>(_CustomerMobileOidcClientId_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "MobileOidcDiscoveryEndpoint", scope = Customer.class)
    public JAXBElement<String> createCustomerMobileOidcDiscoveryEndpoint(String value) {
        return new JAXBElement<String>(_CustomerMobileOidcDiscoveryEndpoint_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "OmnitracsNavigationLicenses", scope = Customer.class)
    public JAXBElement<Integer> createCustomerOmnitracsNavigationLicenses(Integer value) {
        return new JAXBElement<Integer>(_CustomerOmnitracsNavigationLicenses_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "OmnitracsOneCompanyGuid", scope = Customer.class)
    public JAXBElement<String> createCustomerOmnitracsOneCompanyGuid(String value) {
        return new JAXBElement<String>(_CustomerOmnitracsOneCompanyGuid_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "PartnerEntityKey", scope = Customer.class)
    public JAXBElement<Long> createCustomerPartnerEntityKey(Long value) {
        return new JAXBElement<Long>(_CustomerPartnerEntityKey_QNAME, Long.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "PurchasableModules_PurchasedModules", scope = Customer.class)
    public JAXBElement<String> createCustomerPurchasableModulesPurchasedModules(String value) {
        return new JAXBElement<String>(_CustomerPurchasableModulesPurchasedModules_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerPurchasedFeatureSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "PurchasedFeatureSets", scope = Customer.class)
    public JAXBElement<ArrayOfCustomerPurchasedFeatureSet> createCustomerPurchasedFeatureSets(ArrayOfCustomerPurchasedFeatureSet value) {
        return new JAXBElement<ArrayOfCustomerPurchasedFeatureSet>(_CustomerPurchasedFeatureSets_QNAME, ArrayOfCustomerPurchasedFeatureSet.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataRetentionPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "RetentionPolicy", scope = Customer.class)
    public JAXBElement<DataRetentionPolicy> createCustomerRetentionPolicy(DataRetentionPolicy value) {
        return new JAXBElement<DataRetentionPolicy>(_CustomerRetentionPolicy_QNAME, DataRetentionPolicy.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "TelematicsDevicesLicensed", scope = Customer.class)
    public JAXBElement<Integer> createCustomerTelematicsDevicesLicensed(Integer value) {
        return new JAXBElement<Integer>(_CustomerTelematicsDevicesLicensed_QNAME, Integer.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "VehicleLicenseEffectiveDate", scope = Customer.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerVehicleLicenseEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CustomerVehicleLicenseEffectiveDate_QNAME, XMLGregorianCalendar.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "VehicleLicenseViolationGracePeriodEndDate", scope = Customer.class)
    public JAXBElement<XMLGregorianCalendar> createCustomerVehicleLicenseViolationGracePeriodEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CustomerVehicleLicenseViolationGracePeriodEndDate_QNAME, XMLGregorianCalendar.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "WorldTimeZone_TimeZone", scope = Customer.class)
    public JAXBElement<String> createCustomerWorldTimeZoneTimeZone(String value) {
        return new JAXBElement<String>(_CustomerWorldTimeZoneTimeZone_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsCompanyId", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsCompanyId(String value) {
        return new JAXBElement<String>(_CustomerXrsCompanyId_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsCompanyLoginId", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsCompanyLoginId(String value) {
        return new JAXBElement<String>(_CustomerXrsCompanyLoginId_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XrsCustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsCustomerInfo", scope = Customer.class)
    public JAXBElement<XrsCustomerInfo> createCustomerXrsCustomerInfo(XrsCustomerInfo value) {
        return new JAXBElement<XrsCustomerInfo>(_XrsCustomerInfo_QNAME, XrsCustomerInfo.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsIntegrationType_ComplianceIntegrationType", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsIntegrationTypeComplianceIntegrationType(String value) {
        return new JAXBElement<String>(_CustomerXrsIntegrationTypeComplianceIntegrationType_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsNonAdminUserRoleName", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsNonAdminUserRoleName(String value) {
        return new JAXBElement<String>(_CustomerXrsNonAdminUserRoleName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsPassword", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsPassword(String value) {
        return new JAXBElement<String>(_CustomerXrsPassword_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsPublicWebServicesUrl", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsPublicWebServicesUrl(String value) {
        return new JAXBElement<String>(_CustomerXrsPublicWebServicesUrl_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsTopLevelOrganizationId", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsTopLevelOrganizationId(String value) {
        return new JAXBElement<String>(_CustomerXrsTopLevelOrganizationId_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsUsername", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsUsername(String value) {
        return new JAXBElement<String>(_CustomerXrsUsername_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsWebPortalFacilityEntityKey", scope = Customer.class)
    public JAXBElement<Long> createCustomerXrsWebPortalFacilityEntityKey(Long value) {
        return new JAXBElement<Long>(_CustomerXrsWebPortalFacilityEntityKey_QNAME, Long.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsWebPortalUrl", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsWebPortalUrl(String value) {
        return new JAXBElement<String>(_CustomerXrsWebPortalUrl_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsWebPortalUrlFromFacility", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsWebPortalUrlFromFacility(String value) {
        return new JAXBElement<String>(_CustomerXrsWebPortalUrlFromFacility_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsWebServiceUrlFromFacility", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsWebServiceUrlFromFacility(String value) {
        return new JAXBElement<String>(_CustomerXrsWebServiceUrlFromFacility_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsWebServicesFacilityEntityKey", scope = Customer.class)
    public JAXBElement<Long> createCustomerXrsWebServicesFacilityEntityKey(Long value) {
        return new JAXBElement<Long>(_CustomerXrsWebServicesFacilityEntityKey_QNAME, Long.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", name = "XrsWebServicesUrl", scope = Customer.class)
    public JAXBElement<String> createCustomerXrsWebServicesUrl(String value) {
        return new JAXBElement<String>(_CustomerXrsWebServicesUrl_QNAME, String.class, Customer.class, value);
    }

}
