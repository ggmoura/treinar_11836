
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.roadnet.apex.datacontracts.AggregateRootEntity;
import com.roadnet.apex.datacontracts.ArrayOfCustomerClientApplicationVersion;


/**
 * <p>Classe Java de Customer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Customer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveAlertWebAppFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AllowedVehicleLicenseViolations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationVersions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCustomerClientApplicationVersion" minOccurs="0"/&gt;
 *         &lt;element name="CalculateOpportunities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContractEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ContractStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CreationMethod_DatabaseSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentVehicleLicenseViolations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CustomerState_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseMaxDownloadDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeOfDayToUpdate" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="DatabaseEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DefaultMapDatasetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceMessageProcessingFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EnableDataWarehouseCustomHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableDepotInRegionContext" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExperimentalFeatureCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForceComplianceUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsComplianceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCompressedDataSetMessageEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeviceDataPersistencEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeviceDataSetUsageEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsESSEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsIntegrationServiceRequestLoggingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMilesAheadEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsNavigationOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsProduction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRealTimeTrafficEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRegionHierarchyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTelematicsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastVehicleLicenseViolationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LicenseComplianceState_VehicleLicenseComplianceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPurchasableFeaturesEx_CalculatedPurchasedFeatures" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPurchasableFeaturesEx_PurchasedFeatures" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="LoggingLevelSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoggingLevel_LoggingLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MapRenderingFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MappingFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MaximumDepots" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MobileDevicesLicensed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MobileOidcClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileOidcDiscoveryEndpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileOidcSsoEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileSsoEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationAuthenticateByActivationCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationLicenses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationPlusLicenses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneCompanyGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneQtracsEntityManagementEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PartnerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PlanningModelingVehiclesLicensed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlanningVehiclesLicensed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PurchasableModules_PurchasedModules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchasedFeatureSets" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}ArrayOfCustomerPurchasedFeatureSet" minOccurs="0"/&gt;
 *         &lt;element name="QueryFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RetentionPolicy" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}DataRetentionPolicy" minOccurs="0"/&gt;
 *         &lt;element name="RoutingFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDevicesLicensed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsQueryFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UseLegacyXrsIntegration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseRegionCaching" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleLicenseCompliancePeriod" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="VehicleLicenseEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VehicleLicenseViolationGracePeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VehiclesLicensed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VoiceNavigationLicenses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsCompanyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsCompanyLoginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsCustomerInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}XrsCustomerInfo" minOccurs="0"/&gt;
 *         &lt;element name="XrsIntegrationType_ComplianceIntegrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsNonAdminUserRoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsPublicWebServicesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsTopLevelOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsWebPortalFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="XrsWebPortalUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsWebPortalUrlFromFacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsWebServiceUrlFromFacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsWebServicesFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="XrsWebServicesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "activeAlertWebAppFacilityEntityKey",
    "allowedVehicleLicenseViolations",
    "applicationVersions",
    "calculateOpportunities",
    "contractEndDate",
    "contractStartDate",
    "creationMethodDatabaseSource",
    "currentVehicleLicenseViolations",
    "customerStateState",
    "dataWarehouseMaxDownloadDays",
    "dataWarehouseTimeOfDayToUpdate",
    "databaseEntityKey",
    "defaultMapDatasetEntityKey",
    "description",
    "deviceMessageProcessingFacilityEntityKey",
    "enableDataWarehouseCustomHierarchy",
    "enableDepotInRegionContext",
    "experimentalFeatureCodes",
    "forceComplianceUpdate",
    "identifier",
    "isComplianceOnly",
    "isCompressedDataSetMessageEnabled",
    "isDeviceDataPersistencEnabled",
    "isDeviceDataSetUsageEnabled",
    "isESSEnabled",
    "isEnabled",
    "isIntegrationServiceRequestLoggingEnabled",
    "isMilesAheadEnabled",
    "isNavigationOnly",
    "isProduction",
    "isRealTimeTrafficEnabled",
    "isRegionHierarchyEnabled",
    "isTelematicsOnly",
    "lastVehicleLicenseViolationDate",
    "licenseComplianceStateVehicleLicenseComplianceState",
    "listOfPurchasableFeaturesExCalculatedPurchasedFeatures",
    "listOfPurchasableFeaturesExPurchasedFeatures",
    "loggingLevelSpecified",
    "loggingLevelLoggingLevel",
    "mapRenderingFacilityEntityKey",
    "mappingFacilityEntityKey",
    "maximumDepots",
    "mobileDevicesLicensed",
    "mobileOidcClientId",
    "mobileOidcDiscoveryEndpoint",
    "mobileOidcSsoEnabled",
    "mobileSsoEnabled",
    "omnitracsNavigationAuthenticateByActivationCode",
    "omnitracsNavigationLicenses",
    "omnitracsNavigationPlusLicenses",
    "omnitracsOneCompanyGuid",
    "omnitracsOneEnabled",
    "omnitracsOneQtracsEntityManagementEnabled",
    "partnerEntityKey",
    "planningModelingVehiclesLicensed",
    "planningVehiclesLicensed",
    "purchasableModulesPurchasedModules",
    "purchasedFeatureSets",
    "queryFacilityEntityKey",
    "retentionPolicy",
    "routingFacilityEntityKey",
    "telematicsDevicesLicensed",
    "telematicsQueryFacilityEntityKey",
    "useLegacyXrsIntegration",
    "useRegionCaching",
    "vehicleLicenseCompliancePeriod",
    "vehicleLicenseEffectiveDate",
    "vehicleLicenseViolationGracePeriodEndDate",
    "vehiclesLicensed",
    "voiceNavigationLicenses",
    "worldTimeZoneTimeZone",
    "xrsCompanyId",
    "xrsCompanyLoginId",
    "xrsCustomerInfo",
    "xrsIntegrationTypeComplianceIntegrationType",
    "xrsNonAdminUserRoleName",
    "xrsPassword",
    "xrsPublicWebServicesUrl",
    "xrsTopLevelOrganizationId",
    "xrsUsername",
    "xrsWebPortalFacilityEntityKey",
    "xrsWebPortalUrl",
    "xrsWebPortalUrlFromFacility",
    "xrsWebServiceUrlFromFacility",
    "xrsWebServicesFacilityEntityKey",
    "xrsWebServicesUrl"
})
public class Customer
    extends AggregateRootEntity
{

    @XmlElement(name = "ActiveAlertWebAppFacilityEntityKey")
    protected Long activeAlertWebAppFacilityEntityKey;
    @XmlElement(name = "AllowedVehicleLicenseViolations")
    protected Integer allowedVehicleLicenseViolations;
    @XmlElementRef(name = "ApplicationVersions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomerClientApplicationVersion> applicationVersions;
    @XmlElement(name = "CalculateOpportunities")
    protected Boolean calculateOpportunities;
    @XmlElementRef(name = "ContractEndDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> contractEndDate;
    @XmlElementRef(name = "ContractStartDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> contractStartDate;
    @XmlElementRef(name = "CreationMethod_DatabaseSource", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creationMethodDatabaseSource;
    @XmlElement(name = "CurrentVehicleLicenseViolations")
    protected Integer currentVehicleLicenseViolations;
    @XmlElementRef(name = "CustomerState_State", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerStateState;
    @XmlElement(name = "DataWarehouseMaxDownloadDays")
    protected Integer dataWarehouseMaxDownloadDays;
    @XmlElementRef(name = "DataWarehouseTimeOfDayToUpdate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataWarehouseTimeOfDayToUpdate;
    @XmlElement(name = "DatabaseEntityKey")
    protected Long databaseEntityKey;
    @XmlElementRef(name = "DefaultMapDatasetEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> defaultMapDatasetEntityKey;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DeviceMessageProcessingFacilityEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> deviceMessageProcessingFacilityEntityKey;
    @XmlElement(name = "EnableDataWarehouseCustomHierarchy")
    protected Boolean enableDataWarehouseCustomHierarchy;
    @XmlElement(name = "EnableDepotInRegionContext")
    protected Boolean enableDepotInRegionContext;
    @XmlElementRef(name = "ExperimentalFeatureCodes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> experimentalFeatureCodes;
    @XmlElement(name = "ForceComplianceUpdate")
    protected Boolean forceComplianceUpdate;
    @XmlElementRef(name = "Identifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsComplianceOnly")
    protected Boolean isComplianceOnly;
    @XmlElement(name = "IsCompressedDataSetMessageEnabled")
    protected Boolean isCompressedDataSetMessageEnabled;
    @XmlElement(name = "IsDeviceDataPersistencEnabled")
    protected Boolean isDeviceDataPersistencEnabled;
    @XmlElement(name = "IsDeviceDataSetUsageEnabled")
    protected Boolean isDeviceDataSetUsageEnabled;
    @XmlElement(name = "IsESSEnabled")
    protected Boolean isESSEnabled;
    @XmlElement(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlElement(name = "IsIntegrationServiceRequestLoggingEnabled")
    protected Boolean isIntegrationServiceRequestLoggingEnabled;
    @XmlElement(name = "IsMilesAheadEnabled")
    protected Boolean isMilesAheadEnabled;
    @XmlElement(name = "IsNavigationOnly")
    protected Boolean isNavigationOnly;
    @XmlElement(name = "IsProduction")
    protected Boolean isProduction;
    @XmlElement(name = "IsRealTimeTrafficEnabled")
    protected Boolean isRealTimeTrafficEnabled;
    @XmlElement(name = "IsRegionHierarchyEnabled")
    protected Boolean isRegionHierarchyEnabled;
    @XmlElement(name = "IsTelematicsOnly")
    protected Boolean isTelematicsOnly;
    @XmlElementRef(name = "LastVehicleLicenseViolationDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastVehicleLicenseViolationDate;
    @XmlElementRef(name = "LicenseComplianceState_VehicleLicenseComplianceState", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licenseComplianceStateVehicleLicenseComplianceState;
    @XmlElementRef(name = "ListOfPurchasableFeaturesEx_CalculatedPurchasedFeatures", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfPurchasableFeaturesExCalculatedPurchasedFeatures;
    @XmlElementRef(name = "ListOfPurchasableFeaturesEx_PurchasedFeatures", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfPurchasableFeaturesExPurchasedFeatures;
    @XmlElement(name = "LoggingLevelSpecified")
    protected Boolean loggingLevelSpecified;
    @XmlElementRef(name = "LoggingLevel_LoggingLevel", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loggingLevelLoggingLevel;
    @XmlElement(name = "MapRenderingFacilityEntityKey")
    protected Long mapRenderingFacilityEntityKey;
    @XmlElement(name = "MappingFacilityEntityKey")
    protected Long mappingFacilityEntityKey;
    @XmlElementRef(name = "MaximumDepots", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumDepots;
    @XmlElementRef(name = "MobileDevicesLicensed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mobileDevicesLicensed;
    @XmlElementRef(name = "MobileOidcClientId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileOidcClientId;
    @XmlElementRef(name = "MobileOidcDiscoveryEndpoint", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileOidcDiscoveryEndpoint;
    @XmlElement(name = "MobileOidcSsoEnabled")
    protected Boolean mobileOidcSsoEnabled;
    @XmlElement(name = "MobileSsoEnabled")
    protected Boolean mobileSsoEnabled;
    @XmlElement(name = "OmnitracsNavigationAuthenticateByActivationCode")
    protected Boolean omnitracsNavigationAuthenticateByActivationCode;
    @XmlElementRef(name = "OmnitracsNavigationLicenses", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> omnitracsNavigationLicenses;
    @XmlElement(name = "OmnitracsNavigationPlusLicenses")
    protected Integer omnitracsNavigationPlusLicenses;
    @XmlElementRef(name = "OmnitracsOneCompanyGuid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omnitracsOneCompanyGuid;
    @XmlElement(name = "OmnitracsOneEnabled")
    protected Boolean omnitracsOneEnabled;
    @XmlElement(name = "OmnitracsOneQtracsEntityManagementEnabled")
    protected Boolean omnitracsOneQtracsEntityManagementEnabled;
    @XmlElementRef(name = "PartnerEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> partnerEntityKey;
    @XmlElement(name = "PlanningModelingVehiclesLicensed")
    protected Integer planningModelingVehiclesLicensed;
    @XmlElement(name = "PlanningVehiclesLicensed")
    protected Integer planningVehiclesLicensed;
    @XmlElementRef(name = "PurchasableModules_PurchasedModules", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchasableModulesPurchasedModules;
    @XmlElementRef(name = "PurchasedFeatureSets", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomerPurchasedFeatureSet> purchasedFeatureSets;
    @XmlElement(name = "QueryFacilityEntityKey")
    protected Long queryFacilityEntityKey;
    @XmlElementRef(name = "RetentionPolicy", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DataRetentionPolicy> retentionPolicy;
    @XmlElement(name = "RoutingFacilityEntityKey")
    protected Long routingFacilityEntityKey;
    @XmlElementRef(name = "TelematicsDevicesLicensed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> telematicsDevicesLicensed;
    @XmlElement(name = "TelematicsQueryFacilityEntityKey")
    protected Long telematicsQueryFacilityEntityKey;
    @XmlElement(name = "UseLegacyXrsIntegration")
    protected Boolean useLegacyXrsIntegration;
    @XmlElement(name = "UseRegionCaching")
    protected Boolean useRegionCaching;
    @XmlElement(name = "VehicleLicenseCompliancePeriod")
    protected Duration vehicleLicenseCompliancePeriod;
    @XmlElementRef(name = "VehicleLicenseEffectiveDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> vehicleLicenseEffectiveDate;
    @XmlElementRef(name = "VehicleLicenseViolationGracePeriodEndDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> vehicleLicenseViolationGracePeriodEndDate;
    @XmlElement(name = "VehiclesLicensed")
    protected Integer vehiclesLicensed;
    @XmlElement(name = "VoiceNavigationLicenses")
    protected Integer voiceNavigationLicenses;
    @XmlElementRef(name = "WorldTimeZone_TimeZone", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneTimeZone;
    @XmlElementRef(name = "XrsCompanyId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsCompanyId;
    @XmlElementRef(name = "XrsCompanyLoginId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsCompanyLoginId;
    @XmlElementRef(name = "XrsCustomerInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XrsCustomerInfo> xrsCustomerInfo;
    @XmlElementRef(name = "XrsIntegrationType_ComplianceIntegrationType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsIntegrationTypeComplianceIntegrationType;
    @XmlElementRef(name = "XrsNonAdminUserRoleName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsNonAdminUserRoleName;
    @XmlElementRef(name = "XrsPassword", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsPassword;
    @XmlElementRef(name = "XrsPublicWebServicesUrl", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsPublicWebServicesUrl;
    @XmlElementRef(name = "XrsTopLevelOrganizationId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsTopLevelOrganizationId;
    @XmlElementRef(name = "XrsUsername", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsUsername;
    @XmlElementRef(name = "XrsWebPortalFacilityEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> xrsWebPortalFacilityEntityKey;
    @XmlElementRef(name = "XrsWebPortalUrl", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsWebPortalUrl;
    @XmlElementRef(name = "XrsWebPortalUrlFromFacility", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsWebPortalUrlFromFacility;
    @XmlElementRef(name = "XrsWebServiceUrlFromFacility", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsWebServiceUrlFromFacility;
    @XmlElementRef(name = "XrsWebServicesFacilityEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> xrsWebServicesFacilityEntityKey;
    @XmlElementRef(name = "XrsWebServicesUrl", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsWebServicesUrl;

    /**
     * Obtém o valor da propriedade activeAlertWebAppFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActiveAlertWebAppFacilityEntityKey() {
        return activeAlertWebAppFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade activeAlertWebAppFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActiveAlertWebAppFacilityEntityKey(Long value) {
        this.activeAlertWebAppFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade allowedVehicleLicenseViolations.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllowedVehicleLicenseViolations() {
        return allowedVehicleLicenseViolations;
    }

    /**
     * Define o valor da propriedade allowedVehicleLicenseViolations.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllowedVehicleLicenseViolations(Integer value) {
        this.allowedVehicleLicenseViolations = value;
    }

    /**
     * Obtém o valor da propriedade applicationVersions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerClientApplicationVersion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomerClientApplicationVersion> getApplicationVersions() {
        return applicationVersions;
    }

    /**
     * Define o valor da propriedade applicationVersions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerClientApplicationVersion }{@code >}
     *     
     */
    public void setApplicationVersions(JAXBElement<ArrayOfCustomerClientApplicationVersion> value) {
        this.applicationVersions = value;
    }

    /**
     * Obtém o valor da propriedade calculateOpportunities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateOpportunities() {
        return calculateOpportunities;
    }

    /**
     * Define o valor da propriedade calculateOpportunities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateOpportunities(Boolean value) {
        this.calculateOpportunities = value;
    }

    /**
     * Obtém o valor da propriedade contractEndDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Define o valor da propriedade contractEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setContractEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.contractEndDate = value;
    }

    /**
     * Obtém o valor da propriedade contractStartDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getContractStartDate() {
        return contractStartDate;
    }

    /**
     * Define o valor da propriedade contractStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setContractStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.contractStartDate = value;
    }

    /**
     * Obtém o valor da propriedade creationMethodDatabaseSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreationMethodDatabaseSource() {
        return creationMethodDatabaseSource;
    }

    /**
     * Define o valor da propriedade creationMethodDatabaseSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreationMethodDatabaseSource(JAXBElement<String> value) {
        this.creationMethodDatabaseSource = value;
    }

    /**
     * Obtém o valor da propriedade currentVehicleLicenseViolations.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentVehicleLicenseViolations() {
        return currentVehicleLicenseViolations;
    }

    /**
     * Define o valor da propriedade currentVehicleLicenseViolations.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentVehicleLicenseViolations(Integer value) {
        this.currentVehicleLicenseViolations = value;
    }

    /**
     * Obtém o valor da propriedade customerStateState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerStateState() {
        return customerStateState;
    }

    /**
     * Define o valor da propriedade customerStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerStateState(JAXBElement<String> value) {
        this.customerStateState = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseMaxDownloadDays.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataWarehouseMaxDownloadDays() {
        return dataWarehouseMaxDownloadDays;
    }

    /**
     * Define o valor da propriedade dataWarehouseMaxDownloadDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataWarehouseMaxDownloadDays(Integer value) {
        this.dataWarehouseMaxDownloadDays = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeOfDayToUpdate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataWarehouseTimeOfDayToUpdate() {
        return dataWarehouseTimeOfDayToUpdate;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeOfDayToUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataWarehouseTimeOfDayToUpdate(JAXBElement<XMLGregorianCalendar> value) {
        this.dataWarehouseTimeOfDayToUpdate = value;
    }

    /**
     * Obtém o valor da propriedade databaseEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDatabaseEntityKey() {
        return databaseEntityKey;
    }

    /**
     * Define o valor da propriedade databaseEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDatabaseEntityKey(Long value) {
        this.databaseEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade defaultMapDatasetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDefaultMapDatasetEntityKey() {
        return defaultMapDatasetEntityKey;
    }

    /**
     * Define o valor da propriedade defaultMapDatasetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDefaultMapDatasetEntityKey(JAXBElement<Long> value) {
        this.defaultMapDatasetEntityKey = value;
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
     * Obtém o valor da propriedade deviceMessageProcessingFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDeviceMessageProcessingFacilityEntityKey() {
        return deviceMessageProcessingFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade deviceMessageProcessingFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDeviceMessageProcessingFacilityEntityKey(JAXBElement<Long> value) {
        this.deviceMessageProcessingFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade enableDataWarehouseCustomHierarchy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDataWarehouseCustomHierarchy() {
        return enableDataWarehouseCustomHierarchy;
    }

    /**
     * Define o valor da propriedade enableDataWarehouseCustomHierarchy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDataWarehouseCustomHierarchy(Boolean value) {
        this.enableDataWarehouseCustomHierarchy = value;
    }

    /**
     * Obtém o valor da propriedade enableDepotInRegionContext.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDepotInRegionContext() {
        return enableDepotInRegionContext;
    }

    /**
     * Define o valor da propriedade enableDepotInRegionContext.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDepotInRegionContext(Boolean value) {
        this.enableDepotInRegionContext = value;
    }

    /**
     * Obtém o valor da propriedade experimentalFeatureCodes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExperimentalFeatureCodes() {
        return experimentalFeatureCodes;
    }

    /**
     * Define o valor da propriedade experimentalFeatureCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExperimentalFeatureCodes(JAXBElement<String> value) {
        this.experimentalFeatureCodes = value;
    }

    /**
     * Obtém o valor da propriedade forceComplianceUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceComplianceUpdate() {
        return forceComplianceUpdate;
    }

    /**
     * Define o valor da propriedade forceComplianceUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceComplianceUpdate(Boolean value) {
        this.forceComplianceUpdate = value;
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
     * Obtém o valor da propriedade isComplianceOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplianceOnly() {
        return isComplianceOnly;
    }

    /**
     * Define o valor da propriedade isComplianceOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplianceOnly(Boolean value) {
        this.isComplianceOnly = value;
    }

    /**
     * Obtém o valor da propriedade isCompressedDataSetMessageEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompressedDataSetMessageEnabled() {
        return isCompressedDataSetMessageEnabled;
    }

    /**
     * Define o valor da propriedade isCompressedDataSetMessageEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompressedDataSetMessageEnabled(Boolean value) {
        this.isCompressedDataSetMessageEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isDeviceDataPersistencEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeviceDataPersistencEnabled() {
        return isDeviceDataPersistencEnabled;
    }

    /**
     * Define o valor da propriedade isDeviceDataPersistencEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeviceDataPersistencEnabled(Boolean value) {
        this.isDeviceDataPersistencEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isDeviceDataSetUsageEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeviceDataSetUsageEnabled() {
        return isDeviceDataSetUsageEnabled;
    }

    /**
     * Define o valor da propriedade isDeviceDataSetUsageEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeviceDataSetUsageEnabled(Boolean value) {
        this.isDeviceDataSetUsageEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isESSEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsESSEnabled() {
        return isESSEnabled;
    }

    /**
     * Define o valor da propriedade isESSEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsESSEnabled(Boolean value) {
        this.isESSEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Define o valor da propriedade isEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isIntegrationServiceRequestLoggingEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIntegrationServiceRequestLoggingEnabled() {
        return isIntegrationServiceRequestLoggingEnabled;
    }

    /**
     * Define o valor da propriedade isIntegrationServiceRequestLoggingEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntegrationServiceRequestLoggingEnabled(Boolean value) {
        this.isIntegrationServiceRequestLoggingEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isMilesAheadEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMilesAheadEnabled() {
        return isMilesAheadEnabled;
    }

    /**
     * Define o valor da propriedade isMilesAheadEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMilesAheadEnabled(Boolean value) {
        this.isMilesAheadEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isNavigationOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNavigationOnly() {
        return isNavigationOnly;
    }

    /**
     * Define o valor da propriedade isNavigationOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNavigationOnly(Boolean value) {
        this.isNavigationOnly = value;
    }

    /**
     * Obtém o valor da propriedade isProduction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProduction() {
        return isProduction;
    }

    /**
     * Define o valor da propriedade isProduction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProduction(Boolean value) {
        this.isProduction = value;
    }

    /**
     * Obtém o valor da propriedade isRealTimeTrafficEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRealTimeTrafficEnabled() {
        return isRealTimeTrafficEnabled;
    }

    /**
     * Define o valor da propriedade isRealTimeTrafficEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRealTimeTrafficEnabled(Boolean value) {
        this.isRealTimeTrafficEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isRegionHierarchyEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRegionHierarchyEnabled() {
        return isRegionHierarchyEnabled;
    }

    /**
     * Define o valor da propriedade isRegionHierarchyEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRegionHierarchyEnabled(Boolean value) {
        this.isRegionHierarchyEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isTelematicsOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTelematicsOnly() {
        return isTelematicsOnly;
    }

    /**
     * Define o valor da propriedade isTelematicsOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTelematicsOnly(Boolean value) {
        this.isTelematicsOnly = value;
    }

    /**
     * Obtém o valor da propriedade lastVehicleLicenseViolationDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastVehicleLicenseViolationDate() {
        return lastVehicleLicenseViolationDate;
    }

    /**
     * Define o valor da propriedade lastVehicleLicenseViolationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastVehicleLicenseViolationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastVehicleLicenseViolationDate = value;
    }

    /**
     * Obtém o valor da propriedade licenseComplianceStateVehicleLicenseComplianceState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenseComplianceStateVehicleLicenseComplianceState() {
        return licenseComplianceStateVehicleLicenseComplianceState;
    }

    /**
     * Define o valor da propriedade licenseComplianceStateVehicleLicenseComplianceState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenseComplianceStateVehicleLicenseComplianceState(JAXBElement<String> value) {
        this.licenseComplianceStateVehicleLicenseComplianceState = value;
    }

    /**
     * Obtém o valor da propriedade listOfPurchasableFeaturesExCalculatedPurchasedFeatures.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfPurchasableFeaturesExCalculatedPurchasedFeatures() {
        return listOfPurchasableFeaturesExCalculatedPurchasedFeatures;
    }

    /**
     * Define o valor da propriedade listOfPurchasableFeaturesExCalculatedPurchasedFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfPurchasableFeaturesExCalculatedPurchasedFeatures(JAXBElement<ArrayOfstring> value) {
        this.listOfPurchasableFeaturesExCalculatedPurchasedFeatures = value;
    }

    /**
     * Obtém o valor da propriedade listOfPurchasableFeaturesExPurchasedFeatures.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfPurchasableFeaturesExPurchasedFeatures() {
        return listOfPurchasableFeaturesExPurchasedFeatures;
    }

    /**
     * Define o valor da propriedade listOfPurchasableFeaturesExPurchasedFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfPurchasableFeaturesExPurchasedFeatures(JAXBElement<ArrayOfstring> value) {
        this.listOfPurchasableFeaturesExPurchasedFeatures = value;
    }

    /**
     * Obtém o valor da propriedade loggingLevelSpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoggingLevelSpecified() {
        return loggingLevelSpecified;
    }

    /**
     * Define o valor da propriedade loggingLevelSpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoggingLevelSpecified(Boolean value) {
        this.loggingLevelSpecified = value;
    }

    /**
     * Obtém o valor da propriedade loggingLevelLoggingLevel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoggingLevelLoggingLevel() {
        return loggingLevelLoggingLevel;
    }

    /**
     * Define o valor da propriedade loggingLevelLoggingLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoggingLevelLoggingLevel(JAXBElement<String> value) {
        this.loggingLevelLoggingLevel = value;
    }

    /**
     * Obtém o valor da propriedade mapRenderingFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMapRenderingFacilityEntityKey() {
        return mapRenderingFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade mapRenderingFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMapRenderingFacilityEntityKey(Long value) {
        this.mapRenderingFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mappingFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMappingFacilityEntityKey() {
        return mappingFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade mappingFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMappingFacilityEntityKey(Long value) {
        this.mappingFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade maximumDepots.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumDepots() {
        return maximumDepots;
    }

    /**
     * Define o valor da propriedade maximumDepots.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumDepots(JAXBElement<Integer> value) {
        this.maximumDepots = value;
    }

    /**
     * Obtém o valor da propriedade mobileDevicesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMobileDevicesLicensed() {
        return mobileDevicesLicensed;
    }

    /**
     * Define o valor da propriedade mobileDevicesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMobileDevicesLicensed(JAXBElement<Integer> value) {
        this.mobileDevicesLicensed = value;
    }

    /**
     * Obtém o valor da propriedade mobileOidcClientId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileOidcClientId() {
        return mobileOidcClientId;
    }

    /**
     * Define o valor da propriedade mobileOidcClientId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileOidcClientId(JAXBElement<String> value) {
        this.mobileOidcClientId = value;
    }

    /**
     * Obtém o valor da propriedade mobileOidcDiscoveryEndpoint.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileOidcDiscoveryEndpoint() {
        return mobileOidcDiscoveryEndpoint;
    }

    /**
     * Define o valor da propriedade mobileOidcDiscoveryEndpoint.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileOidcDiscoveryEndpoint(JAXBElement<String> value) {
        this.mobileOidcDiscoveryEndpoint = value;
    }

    /**
     * Obtém o valor da propriedade mobileOidcSsoEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileOidcSsoEnabled() {
        return mobileOidcSsoEnabled;
    }

    /**
     * Define o valor da propriedade mobileOidcSsoEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileOidcSsoEnabled(Boolean value) {
        this.mobileOidcSsoEnabled = value;
    }

    /**
     * Obtém o valor da propriedade mobileSsoEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileSsoEnabled() {
        return mobileSsoEnabled;
    }

    /**
     * Define o valor da propriedade mobileSsoEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileSsoEnabled(Boolean value) {
        this.mobileSsoEnabled = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigationAuthenticateByActivationCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsNavigationAuthenticateByActivationCode() {
        return omnitracsNavigationAuthenticateByActivationCode;
    }

    /**
     * Define o valor da propriedade omnitracsNavigationAuthenticateByActivationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsNavigationAuthenticateByActivationCode(Boolean value) {
        this.omnitracsNavigationAuthenticateByActivationCode = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigationLicenses.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOmnitracsNavigationLicenses() {
        return omnitracsNavigationLicenses;
    }

    /**
     * Define o valor da propriedade omnitracsNavigationLicenses.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOmnitracsNavigationLicenses(JAXBElement<Integer> value) {
        this.omnitracsNavigationLicenses = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigationPlusLicenses.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOmnitracsNavigationPlusLicenses() {
        return omnitracsNavigationPlusLicenses;
    }

    /**
     * Define o valor da propriedade omnitracsNavigationPlusLicenses.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOmnitracsNavigationPlusLicenses(Integer value) {
        this.omnitracsNavigationPlusLicenses = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneCompanyGuid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOmnitracsOneCompanyGuid() {
        return omnitracsOneCompanyGuid;
    }

    /**
     * Define o valor da propriedade omnitracsOneCompanyGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOmnitracsOneCompanyGuid(JAXBElement<String> value) {
        this.omnitracsOneCompanyGuid = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsOneEnabled() {
        return omnitracsOneEnabled;
    }

    /**
     * Define o valor da propriedade omnitracsOneEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsOneEnabled(Boolean value) {
        this.omnitracsOneEnabled = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneQtracsEntityManagementEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsOneQtracsEntityManagementEnabled() {
        return omnitracsOneQtracsEntityManagementEnabled;
    }

    /**
     * Define o valor da propriedade omnitracsOneQtracsEntityManagementEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsOneQtracsEntityManagementEnabled(Boolean value) {
        this.omnitracsOneQtracsEntityManagementEnabled = value;
    }

    /**
     * Obtém o valor da propriedade partnerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartnerEntityKey() {
        return partnerEntityKey;
    }

    /**
     * Define o valor da propriedade partnerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartnerEntityKey(JAXBElement<Long> value) {
        this.partnerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade planningModelingVehiclesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanningModelingVehiclesLicensed() {
        return planningModelingVehiclesLicensed;
    }

    /**
     * Define o valor da propriedade planningModelingVehiclesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanningModelingVehiclesLicensed(Integer value) {
        this.planningModelingVehiclesLicensed = value;
    }

    /**
     * Obtém o valor da propriedade planningVehiclesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanningVehiclesLicensed() {
        return planningVehiclesLicensed;
    }

    /**
     * Define o valor da propriedade planningVehiclesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanningVehiclesLicensed(Integer value) {
        this.planningVehiclesLicensed = value;
    }

    /**
     * Obtém o valor da propriedade purchasableModulesPurchasedModules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchasableModulesPurchasedModules() {
        return purchasableModulesPurchasedModules;
    }

    /**
     * Define o valor da propriedade purchasableModulesPurchasedModules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchasableModulesPurchasedModules(JAXBElement<String> value) {
        this.purchasableModulesPurchasedModules = value;
    }

    /**
     * Obtém o valor da propriedade purchasedFeatureSets.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerPurchasedFeatureSet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomerPurchasedFeatureSet> getPurchasedFeatureSets() {
        return purchasedFeatureSets;
    }

    /**
     * Define o valor da propriedade purchasedFeatureSets.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerPurchasedFeatureSet }{@code >}
     *     
     */
    public void setPurchasedFeatureSets(JAXBElement<ArrayOfCustomerPurchasedFeatureSet> value) {
        this.purchasedFeatureSets = value;
    }

    /**
     * Obtém o valor da propriedade queryFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQueryFacilityEntityKey() {
        return queryFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade queryFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQueryFacilityEntityKey(Long value) {
        this.queryFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade retentionPolicy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataRetentionPolicy }{@code >}
     *     
     */
    public JAXBElement<DataRetentionPolicy> getRetentionPolicy() {
        return retentionPolicy;
    }

    /**
     * Define o valor da propriedade retentionPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataRetentionPolicy }{@code >}
     *     
     */
    public void setRetentionPolicy(JAXBElement<DataRetentionPolicy> value) {
        this.retentionPolicy = value;
    }

    /**
     * Obtém o valor da propriedade routingFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoutingFacilityEntityKey() {
        return routingFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade routingFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoutingFacilityEntityKey(Long value) {
        this.routingFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDevicesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTelematicsDevicesLicensed() {
        return telematicsDevicesLicensed;
    }

    /**
     * Define o valor da propriedade telematicsDevicesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTelematicsDevicesLicensed(JAXBElement<Integer> value) {
        this.telematicsDevicesLicensed = value;
    }

    /**
     * Obtém o valor da propriedade telematicsQueryFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTelematicsQueryFacilityEntityKey() {
        return telematicsQueryFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsQueryFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTelematicsQueryFacilityEntityKey(Long value) {
        this.telematicsQueryFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade useLegacyXrsIntegration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLegacyXrsIntegration() {
        return useLegacyXrsIntegration;
    }

    /**
     * Define o valor da propriedade useLegacyXrsIntegration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLegacyXrsIntegration(Boolean value) {
        this.useLegacyXrsIntegration = value;
    }

    /**
     * Obtém o valor da propriedade useRegionCaching.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseRegionCaching() {
        return useRegionCaching;
    }

    /**
     * Define o valor da propriedade useRegionCaching.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseRegionCaching(Boolean value) {
        this.useRegionCaching = value;
    }

    /**
     * Obtém o valor da propriedade vehicleLicenseCompliancePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getVehicleLicenseCompliancePeriod() {
        return vehicleLicenseCompliancePeriod;
    }

    /**
     * Define o valor da propriedade vehicleLicenseCompliancePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setVehicleLicenseCompliancePeriod(Duration value) {
        this.vehicleLicenseCompliancePeriod = value;
    }

    /**
     * Obtém o valor da propriedade vehicleLicenseEffectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVehicleLicenseEffectiveDate() {
        return vehicleLicenseEffectiveDate;
    }

    /**
     * Define o valor da propriedade vehicleLicenseEffectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVehicleLicenseEffectiveDate(JAXBElement<XMLGregorianCalendar> value) {
        this.vehicleLicenseEffectiveDate = value;
    }

    /**
     * Obtém o valor da propriedade vehicleLicenseViolationGracePeriodEndDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVehicleLicenseViolationGracePeriodEndDate() {
        return vehicleLicenseViolationGracePeriodEndDate;
    }

    /**
     * Define o valor da propriedade vehicleLicenseViolationGracePeriodEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVehicleLicenseViolationGracePeriodEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.vehicleLicenseViolationGracePeriodEndDate = value;
    }

    /**
     * Obtém o valor da propriedade vehiclesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVehiclesLicensed() {
        return vehiclesLicensed;
    }

    /**
     * Define o valor da propriedade vehiclesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVehiclesLicensed(Integer value) {
        this.vehiclesLicensed = value;
    }

    /**
     * Obtém o valor da propriedade voiceNavigationLicenses.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVoiceNavigationLicenses() {
        return voiceNavigationLicenses;
    }

    /**
     * Define o valor da propriedade voiceNavigationLicenses.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVoiceNavigationLicenses(Integer value) {
        this.voiceNavigationLicenses = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneTimeZone = value;
    }

    /**
     * Obtém o valor da propriedade xrsCompanyId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsCompanyId() {
        return xrsCompanyId;
    }

    /**
     * Define o valor da propriedade xrsCompanyId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsCompanyId(JAXBElement<String> value) {
        this.xrsCompanyId = value;
    }

    /**
     * Obtém o valor da propriedade xrsCompanyLoginId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsCompanyLoginId() {
        return xrsCompanyLoginId;
    }

    /**
     * Define o valor da propriedade xrsCompanyLoginId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsCompanyLoginId(JAXBElement<String> value) {
        this.xrsCompanyLoginId = value;
    }

    /**
     * Obtém o valor da propriedade xrsCustomerInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XrsCustomerInfo }{@code >}
     *     
     */
    public JAXBElement<XrsCustomerInfo> getXrsCustomerInfo() {
        return xrsCustomerInfo;
    }

    /**
     * Define o valor da propriedade xrsCustomerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XrsCustomerInfo }{@code >}
     *     
     */
    public void setXrsCustomerInfo(JAXBElement<XrsCustomerInfo> value) {
        this.xrsCustomerInfo = value;
    }

    /**
     * Obtém o valor da propriedade xrsIntegrationTypeComplianceIntegrationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsIntegrationTypeComplianceIntegrationType() {
        return xrsIntegrationTypeComplianceIntegrationType;
    }

    /**
     * Define o valor da propriedade xrsIntegrationTypeComplianceIntegrationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsIntegrationTypeComplianceIntegrationType(JAXBElement<String> value) {
        this.xrsIntegrationTypeComplianceIntegrationType = value;
    }

    /**
     * Obtém o valor da propriedade xrsNonAdminUserRoleName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsNonAdminUserRoleName() {
        return xrsNonAdminUserRoleName;
    }

    /**
     * Define o valor da propriedade xrsNonAdminUserRoleName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsNonAdminUserRoleName(JAXBElement<String> value) {
        this.xrsNonAdminUserRoleName = value;
    }

    /**
     * Obtém o valor da propriedade xrsPassword.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsPassword() {
        return xrsPassword;
    }

    /**
     * Define o valor da propriedade xrsPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsPassword(JAXBElement<String> value) {
        this.xrsPassword = value;
    }

    /**
     * Obtém o valor da propriedade xrsPublicWebServicesUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsPublicWebServicesUrl() {
        return xrsPublicWebServicesUrl;
    }

    /**
     * Define o valor da propriedade xrsPublicWebServicesUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsPublicWebServicesUrl(JAXBElement<String> value) {
        this.xrsPublicWebServicesUrl = value;
    }

    /**
     * Obtém o valor da propriedade xrsTopLevelOrganizationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsTopLevelOrganizationId() {
        return xrsTopLevelOrganizationId;
    }

    /**
     * Define o valor da propriedade xrsTopLevelOrganizationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsTopLevelOrganizationId(JAXBElement<String> value) {
        this.xrsTopLevelOrganizationId = value;
    }

    /**
     * Obtém o valor da propriedade xrsUsername.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsUsername() {
        return xrsUsername;
    }

    /**
     * Define o valor da propriedade xrsUsername.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsUsername(JAXBElement<String> value) {
        this.xrsUsername = value;
    }

    /**
     * Obtém o valor da propriedade xrsWebPortalFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getXrsWebPortalFacilityEntityKey() {
        return xrsWebPortalFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade xrsWebPortalFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setXrsWebPortalFacilityEntityKey(JAXBElement<Long> value) {
        this.xrsWebPortalFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade xrsWebPortalUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsWebPortalUrl() {
        return xrsWebPortalUrl;
    }

    /**
     * Define o valor da propriedade xrsWebPortalUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsWebPortalUrl(JAXBElement<String> value) {
        this.xrsWebPortalUrl = value;
    }

    /**
     * Obtém o valor da propriedade xrsWebPortalUrlFromFacility.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsWebPortalUrlFromFacility() {
        return xrsWebPortalUrlFromFacility;
    }

    /**
     * Define o valor da propriedade xrsWebPortalUrlFromFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsWebPortalUrlFromFacility(JAXBElement<String> value) {
        this.xrsWebPortalUrlFromFacility = value;
    }

    /**
     * Obtém o valor da propriedade xrsWebServiceUrlFromFacility.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsWebServiceUrlFromFacility() {
        return xrsWebServiceUrlFromFacility;
    }

    /**
     * Define o valor da propriedade xrsWebServiceUrlFromFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsWebServiceUrlFromFacility(JAXBElement<String> value) {
        this.xrsWebServiceUrlFromFacility = value;
    }

    /**
     * Obtém o valor da propriedade xrsWebServicesFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getXrsWebServicesFacilityEntityKey() {
        return xrsWebServicesFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade xrsWebServicesFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setXrsWebServicesFacilityEntityKey(JAXBElement<Long> value) {
        this.xrsWebServicesFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade xrsWebServicesUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsWebServicesUrl() {
        return xrsWebServicesUrl;
    }

    /**
     * Define o valor da propriedade xrsWebServicesUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsWebServicesUrl(JAXBElement<String> value) {
        this.xrsWebServicesUrl = value;
    }

}
