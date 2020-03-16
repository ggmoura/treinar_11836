
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.CustomerClientApplicationVersionPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CustomerPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowedVehicleLicenseViolations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationVersions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceIntegrationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentVehicleLicenseViolations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerClientApplicationVersionPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}CustomerClientApplicationVersionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="CustomerSpecificSchema" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerState_State" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseMaxDownloadDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultMapDatasetEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeviceMessageProcessingFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableDataWarehouseCustomHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableDepotInRegionContext" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExperimentalFeatureCodes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForceComplianceUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsComplianceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCompressedDataSetMessageEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeviceDataPersistencEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeviceDataSetUsageEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsIntegrationServiceRequestLoggingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMilesAheadEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsNavigationOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRealTimeTrafficEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRegionHierarchyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTelematicsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastVehicleLicenseViolationDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LicenseComplianceState_VehicleLicenseComplianceState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPurchasableFeaturesEx_CalculatedPurchasedFeatures" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPurchasableFeaturesEx_PurchasedFeatures" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoggingLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoggingLevelSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MapRenderingFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MappingFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumDepots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileDevicesLicensed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileSsoEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationAuthenticateByActivationCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationLicenses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationPlusLicenses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneCompanyGuid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneQtracsEntityManagementEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PartnerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlanningModelingVehiclesLicensed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlanningVehiclesLicensed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PurchasableModules_PurchasedModules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PurchasedFeatureSets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QueryFacility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QueryFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetentionPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetentionPolicyOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}DataRetentionPolicyPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RoutingFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDevicesLicensed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseLegacyXrsIntegration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseRegionCaching" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleLicenseCompliancePeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleLicenseEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehiclesLicensed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VoiceNavigationLicenses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsCompanyId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsCompanyLoginId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsNonAdminUserRoleName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsPublicWebServicesUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsTopLevelOrganizationId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsUsername" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsWebPortalFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsWebPortalUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsWebPortalUrlFromFacility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsWebServicesFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsWebServicesUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPropertyOptions", propOrder = {
    "allowedVehicleLicenseViolations",
    "applicationVersions",
    "complianceIntegrationType",
    "currentVehicleLicenseViolations",
    "customerClientApplicationVersionPropertyOptions",
    "customerSpecificSchema",
    "customerStateState",
    "dataWarehouseMaxDownloadDays",
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
    "isIntegrationServiceRequestLoggingEnabled",
    "isMilesAheadEnabled",
    "isNavigationOnly",
    "isRealTimeTrafficEnabled",
    "isRegionHierarchyEnabled",
    "isTelematicsOnly",
    "lastVehicleLicenseViolationDate",
    "licenseComplianceStateVehicleLicenseComplianceState",
    "listOfPurchasableFeaturesExCalculatedPurchasedFeatures",
    "listOfPurchasableFeaturesExPurchasedFeatures",
    "loggingLevel",
    "loggingLevelSpecified",
    "mapRenderingFacilityEntityKey",
    "mappingFacilityEntityKey",
    "maximumDepots",
    "mobileDevicesLicensed",
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
    "queryFacility",
    "queryFacilityEntityKey",
    "retentionPolicy",
    "retentionPolicyOptions",
    "routingFacilityEntityKey",
    "telematicsDevicesLicensed",
    "useLegacyXrsIntegration",
    "useRegionCaching",
    "vehicleLicenseCompliancePeriod",
    "vehicleLicenseEffectiveDate",
    "vehiclesLicensed",
    "voiceNavigationLicenses",
    "worldTimeZoneTimeZone",
    "xrsCompanyId",
    "xrsCompanyLoginId",
    "xrsNonAdminUserRoleName",
    "xrsPassword",
    "xrsPublicWebServicesUrl",
    "xrsTopLevelOrganizationId",
    "xrsUsername",
    "xrsWebPortalFacilityEntityKey",
    "xrsWebPortalUrl",
    "xrsWebPortalUrlFromFacility",
    "xrsWebServicesFacilityEntityKey",
    "xrsWebServicesUrl"
})
public class CustomerPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AllowedVehicleLicenseViolations")
    protected Boolean allowedVehicleLicenseViolations;
    @XmlElement(name = "ApplicationVersions")
    protected Boolean applicationVersions;
    @XmlElement(name = "ComplianceIntegrationType")
    protected Boolean complianceIntegrationType;
    @XmlElement(name = "CurrentVehicleLicenseViolations")
    protected Boolean currentVehicleLicenseViolations;
    @XmlElementRef(name = "CustomerClientApplicationVersionPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerClientApplicationVersionPropertyOptions> customerClientApplicationVersionPropertyOptions;
    @XmlElement(name = "CustomerSpecificSchema")
    protected Boolean customerSpecificSchema;
    @XmlElement(name = "CustomerState_State")
    protected Boolean customerStateState;
    @XmlElement(name = "DataWarehouseMaxDownloadDays")
    protected Boolean dataWarehouseMaxDownloadDays;
    @XmlElement(name = "DefaultMapDatasetEntityKey")
    protected Boolean defaultMapDatasetEntityKey;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "DeviceMessageProcessingFacilityEntityKey")
    protected Boolean deviceMessageProcessingFacilityEntityKey;
    @XmlElement(name = "EnableDataWarehouseCustomHierarchy")
    protected Boolean enableDataWarehouseCustomHierarchy;
    @XmlElement(name = "EnableDepotInRegionContext")
    protected Boolean enableDepotInRegionContext;
    @XmlElement(name = "ExperimentalFeatureCodes")
    protected Boolean experimentalFeatureCodes;
    @XmlElement(name = "ForceComplianceUpdate")
    protected Boolean forceComplianceUpdate;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsComplianceOnly")
    protected Boolean isComplianceOnly;
    @XmlElement(name = "IsCompressedDataSetMessageEnabled")
    protected Boolean isCompressedDataSetMessageEnabled;
    @XmlElement(name = "IsDeviceDataPersistencEnabled")
    protected Boolean isDeviceDataPersistencEnabled;
    @XmlElement(name = "IsDeviceDataSetUsageEnabled")
    protected Boolean isDeviceDataSetUsageEnabled;
    @XmlElement(name = "IsIntegrationServiceRequestLoggingEnabled")
    protected Boolean isIntegrationServiceRequestLoggingEnabled;
    @XmlElement(name = "IsMilesAheadEnabled")
    protected Boolean isMilesAheadEnabled;
    @XmlElement(name = "IsNavigationOnly")
    protected Boolean isNavigationOnly;
    @XmlElement(name = "IsRealTimeTrafficEnabled")
    protected Boolean isRealTimeTrafficEnabled;
    @XmlElement(name = "IsRegionHierarchyEnabled")
    protected Boolean isRegionHierarchyEnabled;
    @XmlElement(name = "IsTelematicsOnly")
    protected Boolean isTelematicsOnly;
    @XmlElement(name = "LastVehicleLicenseViolationDate")
    protected Boolean lastVehicleLicenseViolationDate;
    @XmlElement(name = "LicenseComplianceState_VehicleLicenseComplianceState")
    protected Boolean licenseComplianceStateVehicleLicenseComplianceState;
    @XmlElement(name = "ListOfPurchasableFeaturesEx_CalculatedPurchasedFeatures")
    protected Boolean listOfPurchasableFeaturesExCalculatedPurchasedFeatures;
    @XmlElement(name = "ListOfPurchasableFeaturesEx_PurchasedFeatures")
    protected Boolean listOfPurchasableFeaturesExPurchasedFeatures;
    @XmlElement(name = "LoggingLevel")
    protected Boolean loggingLevel;
    @XmlElement(name = "LoggingLevelSpecified")
    protected Boolean loggingLevelSpecified;
    @XmlElement(name = "MapRenderingFacilityEntityKey")
    protected Boolean mapRenderingFacilityEntityKey;
    @XmlElement(name = "MappingFacilityEntityKey")
    protected Boolean mappingFacilityEntityKey;
    @XmlElement(name = "MaximumDepots")
    protected Boolean maximumDepots;
    @XmlElement(name = "MobileDevicesLicensed")
    protected Boolean mobileDevicesLicensed;
    @XmlElement(name = "MobileSsoEnabled")
    protected Boolean mobileSsoEnabled;
    @XmlElement(name = "OmnitracsNavigationAuthenticateByActivationCode")
    protected Boolean omnitracsNavigationAuthenticateByActivationCode;
    @XmlElement(name = "OmnitracsNavigationLicenses")
    protected Boolean omnitracsNavigationLicenses;
    @XmlElement(name = "OmnitracsNavigationPlusLicenses")
    protected Boolean omnitracsNavigationPlusLicenses;
    @XmlElement(name = "OmnitracsOneCompanyGuid")
    protected Boolean omnitracsOneCompanyGuid;
    @XmlElement(name = "OmnitracsOneEnabled")
    protected Boolean omnitracsOneEnabled;
    @XmlElement(name = "OmnitracsOneQtracsEntityManagementEnabled")
    protected Boolean omnitracsOneQtracsEntityManagementEnabled;
    @XmlElement(name = "PartnerEntityKey")
    protected Boolean partnerEntityKey;
    @XmlElement(name = "PlanningModelingVehiclesLicensed")
    protected Boolean planningModelingVehiclesLicensed;
    @XmlElement(name = "PlanningVehiclesLicensed")
    protected Boolean planningVehiclesLicensed;
    @XmlElement(name = "PurchasableModules_PurchasedModules")
    protected Boolean purchasableModulesPurchasedModules;
    @XmlElement(name = "PurchasedFeatureSets")
    protected Boolean purchasedFeatureSets;
    @XmlElement(name = "QueryFacility")
    protected Boolean queryFacility;
    @XmlElement(name = "QueryFacilityEntityKey")
    protected Boolean queryFacilityEntityKey;
    @XmlElement(name = "RetentionPolicy")
    protected Boolean retentionPolicy;
    @XmlElementRef(name = "RetentionPolicyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DataRetentionPolicyPropertyOptions> retentionPolicyOptions;
    @XmlElement(name = "RoutingFacilityEntityKey")
    protected Boolean routingFacilityEntityKey;
    @XmlElement(name = "TelematicsDevicesLicensed")
    protected Boolean telematicsDevicesLicensed;
    @XmlElement(name = "UseLegacyXrsIntegration")
    protected Boolean useLegacyXrsIntegration;
    @XmlElement(name = "UseRegionCaching")
    protected Boolean useRegionCaching;
    @XmlElement(name = "VehicleLicenseCompliancePeriod")
    protected Boolean vehicleLicenseCompliancePeriod;
    @XmlElement(name = "VehicleLicenseEffectiveDate")
    protected Boolean vehicleLicenseEffectiveDate;
    @XmlElement(name = "VehiclesLicensed")
    protected Boolean vehiclesLicensed;
    @XmlElement(name = "VoiceNavigationLicenses")
    protected Boolean voiceNavigationLicenses;
    @XmlElement(name = "WorldTimeZone_TimeZone")
    protected Boolean worldTimeZoneTimeZone;
    @XmlElement(name = "XrsCompanyId")
    protected Boolean xrsCompanyId;
    @XmlElement(name = "XrsCompanyLoginId")
    protected Boolean xrsCompanyLoginId;
    @XmlElement(name = "XrsNonAdminUserRoleName")
    protected Boolean xrsNonAdminUserRoleName;
    @XmlElement(name = "XrsPassword")
    protected Boolean xrsPassword;
    @XmlElement(name = "XrsPublicWebServicesUrl")
    protected Boolean xrsPublicWebServicesUrl;
    @XmlElement(name = "XrsTopLevelOrganizationId")
    protected Boolean xrsTopLevelOrganizationId;
    @XmlElement(name = "XrsUsername")
    protected Boolean xrsUsername;
    @XmlElement(name = "XrsWebPortalFacilityEntityKey")
    protected Boolean xrsWebPortalFacilityEntityKey;
    @XmlElement(name = "XrsWebPortalUrl")
    protected Boolean xrsWebPortalUrl;
    @XmlElement(name = "XrsWebPortalUrlFromFacility")
    protected Boolean xrsWebPortalUrlFromFacility;
    @XmlElement(name = "XrsWebServicesFacilityEntityKey")
    protected Boolean xrsWebServicesFacilityEntityKey;
    @XmlElement(name = "XrsWebServicesUrl")
    protected Boolean xrsWebServicesUrl;

    /**
     * Obtém o valor da propriedade allowedVehicleLicenseViolations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowedVehicleLicenseViolations() {
        return allowedVehicleLicenseViolations;
    }

    /**
     * Define o valor da propriedade allowedVehicleLicenseViolations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowedVehicleLicenseViolations(Boolean value) {
        this.allowedVehicleLicenseViolations = value;
    }

    /**
     * Obtém o valor da propriedade applicationVersions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicationVersions() {
        return applicationVersions;
    }

    /**
     * Define o valor da propriedade applicationVersions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicationVersions(Boolean value) {
        this.applicationVersions = value;
    }

    /**
     * Obtém o valor da propriedade complianceIntegrationType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplianceIntegrationType() {
        return complianceIntegrationType;
    }

    /**
     * Define o valor da propriedade complianceIntegrationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplianceIntegrationType(Boolean value) {
        this.complianceIntegrationType = value;
    }

    /**
     * Obtém o valor da propriedade currentVehicleLicenseViolations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentVehicleLicenseViolations() {
        return currentVehicleLicenseViolations;
    }

    /**
     * Define o valor da propriedade currentVehicleLicenseViolations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentVehicleLicenseViolations(Boolean value) {
        this.currentVehicleLicenseViolations = value;
    }

    /**
     * Obtém o valor da propriedade customerClientApplicationVersionPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerClientApplicationVersionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<CustomerClientApplicationVersionPropertyOptions> getCustomerClientApplicationVersionPropertyOptions() {
        return customerClientApplicationVersionPropertyOptions;
    }

    /**
     * Define o valor da propriedade customerClientApplicationVersionPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerClientApplicationVersionPropertyOptions }{@code >}
     *     
     */
    public void setCustomerClientApplicationVersionPropertyOptions(JAXBElement<CustomerClientApplicationVersionPropertyOptions> value) {
        this.customerClientApplicationVersionPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade customerSpecificSchema.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerSpecificSchema() {
        return customerSpecificSchema;
    }

    /**
     * Define o valor da propriedade customerSpecificSchema.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerSpecificSchema(Boolean value) {
        this.customerSpecificSchema = value;
    }

    /**
     * Obtém o valor da propriedade customerStateState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerStateState() {
        return customerStateState;
    }

    /**
     * Define o valor da propriedade customerStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerStateState(Boolean value) {
        this.customerStateState = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseMaxDownloadDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseMaxDownloadDays() {
        return dataWarehouseMaxDownloadDays;
    }

    /**
     * Define o valor da propriedade dataWarehouseMaxDownloadDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseMaxDownloadDays(Boolean value) {
        this.dataWarehouseMaxDownloadDays = value;
    }

    /**
     * Obtém o valor da propriedade defaultMapDatasetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultMapDatasetEntityKey() {
        return defaultMapDatasetEntityKey;
    }

    /**
     * Define o valor da propriedade defaultMapDatasetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultMapDatasetEntityKey(Boolean value) {
        this.defaultMapDatasetEntityKey = value;
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
     * Obtém o valor da propriedade deviceMessageProcessingFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviceMessageProcessingFacilityEntityKey() {
        return deviceMessageProcessingFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade deviceMessageProcessingFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviceMessageProcessingFacilityEntityKey(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isExperimentalFeatureCodes() {
        return experimentalFeatureCodes;
    }

    /**
     * Define o valor da propriedade experimentalFeatureCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExperimentalFeatureCodes(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isLastVehicleLicenseViolationDate() {
        return lastVehicleLicenseViolationDate;
    }

    /**
     * Define o valor da propriedade lastVehicleLicenseViolationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastVehicleLicenseViolationDate(Boolean value) {
        this.lastVehicleLicenseViolationDate = value;
    }

    /**
     * Obtém o valor da propriedade licenseComplianceStateVehicleLicenseComplianceState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLicenseComplianceStateVehicleLicenseComplianceState() {
        return licenseComplianceStateVehicleLicenseComplianceState;
    }

    /**
     * Define o valor da propriedade licenseComplianceStateVehicleLicenseComplianceState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLicenseComplianceStateVehicleLicenseComplianceState(Boolean value) {
        this.licenseComplianceStateVehicleLicenseComplianceState = value;
    }

    /**
     * Obtém o valor da propriedade listOfPurchasableFeaturesExCalculatedPurchasedFeatures.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListOfPurchasableFeaturesExCalculatedPurchasedFeatures() {
        return listOfPurchasableFeaturesExCalculatedPurchasedFeatures;
    }

    /**
     * Define o valor da propriedade listOfPurchasableFeaturesExCalculatedPurchasedFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListOfPurchasableFeaturesExCalculatedPurchasedFeatures(Boolean value) {
        this.listOfPurchasableFeaturesExCalculatedPurchasedFeatures = value;
    }

    /**
     * Obtém o valor da propriedade listOfPurchasableFeaturesExPurchasedFeatures.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListOfPurchasableFeaturesExPurchasedFeatures() {
        return listOfPurchasableFeaturesExPurchasedFeatures;
    }

    /**
     * Define o valor da propriedade listOfPurchasableFeaturesExPurchasedFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListOfPurchasableFeaturesExPurchasedFeatures(Boolean value) {
        this.listOfPurchasableFeaturesExPurchasedFeatures = value;
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
     * Obtém o valor da propriedade mapRenderingFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMapRenderingFacilityEntityKey() {
        return mapRenderingFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade mapRenderingFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMapRenderingFacilityEntityKey(Boolean value) {
        this.mapRenderingFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mappingFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMappingFacilityEntityKey() {
        return mappingFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade mappingFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMappingFacilityEntityKey(Boolean value) {
        this.mappingFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade maximumDepots.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumDepots() {
        return maximumDepots;
    }

    /**
     * Define o valor da propriedade maximumDepots.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumDepots(Boolean value) {
        this.maximumDepots = value;
    }

    /**
     * Obtém o valor da propriedade mobileDevicesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileDevicesLicensed() {
        return mobileDevicesLicensed;
    }

    /**
     * Define o valor da propriedade mobileDevicesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileDevicesLicensed(Boolean value) {
        this.mobileDevicesLicensed = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsNavigationLicenses() {
        return omnitracsNavigationLicenses;
    }

    /**
     * Define o valor da propriedade omnitracsNavigationLicenses.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsNavigationLicenses(Boolean value) {
        this.omnitracsNavigationLicenses = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigationPlusLicenses.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsNavigationPlusLicenses() {
        return omnitracsNavigationPlusLicenses;
    }

    /**
     * Define o valor da propriedade omnitracsNavigationPlusLicenses.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsNavigationPlusLicenses(Boolean value) {
        this.omnitracsNavigationPlusLicenses = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneCompanyGuid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsOneCompanyGuid() {
        return omnitracsOneCompanyGuid;
    }

    /**
     * Define o valor da propriedade omnitracsOneCompanyGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsOneCompanyGuid(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isPartnerEntityKey() {
        return partnerEntityKey;
    }

    /**
     * Define o valor da propriedade partnerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartnerEntityKey(Boolean value) {
        this.partnerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade planningModelingVehiclesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanningModelingVehiclesLicensed() {
        return planningModelingVehiclesLicensed;
    }

    /**
     * Define o valor da propriedade planningModelingVehiclesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanningModelingVehiclesLicensed(Boolean value) {
        this.planningModelingVehiclesLicensed = value;
    }

    /**
     * Obtém o valor da propriedade planningVehiclesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanningVehiclesLicensed() {
        return planningVehiclesLicensed;
    }

    /**
     * Define o valor da propriedade planningVehiclesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanningVehiclesLicensed(Boolean value) {
        this.planningVehiclesLicensed = value;
    }

    /**
     * Obtém o valor da propriedade purchasableModulesPurchasedModules.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchasableModulesPurchasedModules() {
        return purchasableModulesPurchasedModules;
    }

    /**
     * Define o valor da propriedade purchasableModulesPurchasedModules.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchasableModulesPurchasedModules(Boolean value) {
        this.purchasableModulesPurchasedModules = value;
    }

    /**
     * Obtém o valor da propriedade purchasedFeatureSets.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchasedFeatureSets() {
        return purchasedFeatureSets;
    }

    /**
     * Define o valor da propriedade purchasedFeatureSets.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchasedFeatureSets(Boolean value) {
        this.purchasedFeatureSets = value;
    }

    /**
     * Obtém o valor da propriedade queryFacility.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryFacility() {
        return queryFacility;
    }

    /**
     * Define o valor da propriedade queryFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryFacility(Boolean value) {
        this.queryFacility = value;
    }

    /**
     * Obtém o valor da propriedade queryFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryFacilityEntityKey() {
        return queryFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade queryFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryFacilityEntityKey(Boolean value) {
        this.queryFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade retentionPolicy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetentionPolicy() {
        return retentionPolicy;
    }

    /**
     * Define o valor da propriedade retentionPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetentionPolicy(Boolean value) {
        this.retentionPolicy = value;
    }

    /**
     * Obtém o valor da propriedade retentionPolicyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataRetentionPolicyPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<DataRetentionPolicyPropertyOptions> getRetentionPolicyOptions() {
        return retentionPolicyOptions;
    }

    /**
     * Define o valor da propriedade retentionPolicyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataRetentionPolicyPropertyOptions }{@code >}
     *     
     */
    public void setRetentionPolicyOptions(JAXBElement<DataRetentionPolicyPropertyOptions> value) {
        this.retentionPolicyOptions = value;
    }

    /**
     * Obtém o valor da propriedade routingFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutingFacilityEntityKey() {
        return routingFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade routingFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutingFacilityEntityKey(Boolean value) {
        this.routingFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDevicesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDevicesLicensed() {
        return telematicsDevicesLicensed;
    }

    /**
     * Define o valor da propriedade telematicsDevicesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDevicesLicensed(Boolean value) {
        this.telematicsDevicesLicensed = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleLicenseCompliancePeriod() {
        return vehicleLicenseCompliancePeriod;
    }

    /**
     * Define o valor da propriedade vehicleLicenseCompliancePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleLicenseCompliancePeriod(Boolean value) {
        this.vehicleLicenseCompliancePeriod = value;
    }

    /**
     * Obtém o valor da propriedade vehicleLicenseEffectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleLicenseEffectiveDate() {
        return vehicleLicenseEffectiveDate;
    }

    /**
     * Define o valor da propriedade vehicleLicenseEffectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleLicenseEffectiveDate(Boolean value) {
        this.vehicleLicenseEffectiveDate = value;
    }

    /**
     * Obtém o valor da propriedade vehiclesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehiclesLicensed() {
        return vehiclesLicensed;
    }

    /**
     * Define o valor da propriedade vehiclesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehiclesLicensed(Boolean value) {
        this.vehiclesLicensed = value;
    }

    /**
     * Obtém o valor da propriedade voiceNavigationLicenses.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoiceNavigationLicenses() {
        return voiceNavigationLicenses;
    }

    /**
     * Define o valor da propriedade voiceNavigationLicenses.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoiceNavigationLicenses(Boolean value) {
        this.voiceNavigationLicenses = value;
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

    /**
     * Obtém o valor da propriedade xrsCompanyId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsCompanyId() {
        return xrsCompanyId;
    }

    /**
     * Define o valor da propriedade xrsCompanyId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsCompanyId(Boolean value) {
        this.xrsCompanyId = value;
    }

    /**
     * Obtém o valor da propriedade xrsCompanyLoginId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsCompanyLoginId() {
        return xrsCompanyLoginId;
    }

    /**
     * Define o valor da propriedade xrsCompanyLoginId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsCompanyLoginId(Boolean value) {
        this.xrsCompanyLoginId = value;
    }

    /**
     * Obtém o valor da propriedade xrsNonAdminUserRoleName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsNonAdminUserRoleName() {
        return xrsNonAdminUserRoleName;
    }

    /**
     * Define o valor da propriedade xrsNonAdminUserRoleName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsNonAdminUserRoleName(Boolean value) {
        this.xrsNonAdminUserRoleName = value;
    }

    /**
     * Obtém o valor da propriedade xrsPassword.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsPassword() {
        return xrsPassword;
    }

    /**
     * Define o valor da propriedade xrsPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsPassword(Boolean value) {
        this.xrsPassword = value;
    }

    /**
     * Obtém o valor da propriedade xrsPublicWebServicesUrl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsPublicWebServicesUrl() {
        return xrsPublicWebServicesUrl;
    }

    /**
     * Define o valor da propriedade xrsPublicWebServicesUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsPublicWebServicesUrl(Boolean value) {
        this.xrsPublicWebServicesUrl = value;
    }

    /**
     * Obtém o valor da propriedade xrsTopLevelOrganizationId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsTopLevelOrganizationId() {
        return xrsTopLevelOrganizationId;
    }

    /**
     * Define o valor da propriedade xrsTopLevelOrganizationId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsTopLevelOrganizationId(Boolean value) {
        this.xrsTopLevelOrganizationId = value;
    }

    /**
     * Obtém o valor da propriedade xrsUsername.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsUsername() {
        return xrsUsername;
    }

    /**
     * Define o valor da propriedade xrsUsername.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsUsername(Boolean value) {
        this.xrsUsername = value;
    }

    /**
     * Obtém o valor da propriedade xrsWebPortalFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsWebPortalFacilityEntityKey() {
        return xrsWebPortalFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade xrsWebPortalFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsWebPortalFacilityEntityKey(Boolean value) {
        this.xrsWebPortalFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade xrsWebPortalUrl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsWebPortalUrl() {
        return xrsWebPortalUrl;
    }

    /**
     * Define o valor da propriedade xrsWebPortalUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsWebPortalUrl(Boolean value) {
        this.xrsWebPortalUrl = value;
    }

    /**
     * Obtém o valor da propriedade xrsWebPortalUrlFromFacility.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsWebPortalUrlFromFacility() {
        return xrsWebPortalUrlFromFacility;
    }

    /**
     * Define o valor da propriedade xrsWebPortalUrlFromFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsWebPortalUrlFromFacility(Boolean value) {
        this.xrsWebPortalUrlFromFacility = value;
    }

    /**
     * Obtém o valor da propriedade xrsWebServicesFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsWebServicesFacilityEntityKey() {
        return xrsWebServicesFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade xrsWebServicesFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsWebServicesFacilityEntityKey(Boolean value) {
        this.xrsWebServicesFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade xrsWebServicesUrl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsWebServicesUrl() {
        return xrsWebServicesUrl;
    }

    /**
     * Define o valor da propriedade xrsWebServicesUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsWebServicesUrl(Boolean value) {
        this.xrsWebServicesUrl = value;
    }

}
