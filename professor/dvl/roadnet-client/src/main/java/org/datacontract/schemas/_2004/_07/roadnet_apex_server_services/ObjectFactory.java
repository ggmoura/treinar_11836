
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.roadnet.apex.datacontracts.ArrayOfStopIdentity;
import com.roadnet.apex.datacontracts.Speed;
import com.roadnet.apex.datacontracts.TravelPathCalculatorOptions;
import com.roadnet.apex.datacontracts.Weight;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.roadnet_apex_server_services package. 
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

    private final static QName _DomainEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", "DomainEntity");
    private final static QName _DataTransferObject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", "DataTransferObject");
    private final static QName _ImmutableObject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", "ImmutableObject");
    private final static QName _ActionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", "ActionType");
    private final static QName _PropertyInclusionMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", "PropertyInclusionMode");
    private final static QName _PropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", "PropertyOptions");
    private final static QName _DomainEntityPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", "DomainEntityPropertyOptions");
    private final static QName _ArrayOfDomainEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", "ArrayOfDomainEntity");
    private final static QName _LoginStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "LoginStatus");
    private final static QName _ClientApplicationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "ClientApplicationInfo");
    private final static QName _CultureOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "CultureOptions");
    private final static QName _ClientInstallInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "ClientInstallInfo");
    private final static QName _LookupMobileDeviceResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "LookupMobileDeviceResult");
    private final static QName _LookupDeviceResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "LookupDeviceResult");
    private final static QName _LookupTelematicsDeviceResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "LookupTelematicsDeviceResult");
    private final static QName _TelematicsDeviceHardwarePlatform_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "TelematicsDeviceHardwarePlatform");
    private final static QName _MapDataRegionsEx_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "MapDataRegionsEx");
    private final static QName _TotalEngineRuntimeSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "TotalEngineRuntimeSource");
    private final static QName _RequestDeviceToCheckInNotification_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "RequestDeviceToCheckInNotification");
    private final static QName _TelematicsDeviceIgnitionKillSwitchNotification_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "TelematicsDeviceIgnitionKillSwitchNotification");
    private final static QName _TelematicsDeviceOutputChangeNotification_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "TelematicsDeviceOutputChangeNotification");
    private final static QName _TelematicsDeviceParameterChangeNotification_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "TelematicsDeviceParameterChangeNotification");
    private final static QName _TelematicsDeviceRequestRebootNotification_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "TelematicsDeviceRequestRebootNotification");
    private final static QName _ArrayOfSortingDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "ArrayOfSortingDetail");
    private final static QName _SortingDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "SortingDetail");
    private final static QName _SortingDetailOrderType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "SortingDetail.OrderType");
    private final static QName _CoordinateFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "CoordinateFormat");
    private final static QName _ImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "ImportParameters");
    private final static QName _LocationImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "LocationImportParameters");
    private final static QName _DepotImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "DepotImportParameters");
    private final static QName _ServiceLocationImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "ServiceLocationImportParameters");
    private final static QName _LayoverLocationImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "LayoverLocationImportParameters");
    private final static QName _OrderImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "OrderImportParameters");
    private final static QName _OrderBaseImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "OrderBaseImportParameters");
    private final static QName _OrderBaseImportParametersPlaceImportedOrderIgnoreFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "OrderBaseImportParameters.PlaceImportedOrderIgnoreFlags");
    private final static QName _RecurringOrderImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "RecurringOrderImportParameters");
    private final static QName _OnboardImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "OnboardImportParameters");
    private final static QName _RoutedSolutionImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "RoutedSolutionImportParameters");
    private final static QName _TravelPairImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "TravelPairImportParameters");
    private final static QName _MobileDeviceImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "MobileDeviceImportParameters");
    private final static QName _CustomFormImportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "CustomFormImportParameters");
    private final static QName _OrderImportParametersAddToRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "OrderImportParameters.AddToRoute");
    private final static QName _SplitRouteOptionsDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "SplitRouteOptionsDto");
    private final static QName _MoveResourcesToRegionParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "MoveResourcesToRegionParameters");
    private final static QName _SaveCorrespondenceParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "SaveCorrespondenceParameters");
    private final static QName _ClearActiveTroubleCodesParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "ClearActiveTroubleCodesParameters");
    private final static QName _ImportParametersFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "File");
    private final static QName _ImportParametersImportTemplateEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "ImportTemplateEntityKey");
    private final static QName _ImportParametersImportTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "ImportTypeName");
    private final static QName _ImportParametersTransferTemplateSetEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "TransferTemplateSetEntityKey");
    private final static QName _TravelPairImportParametersTravelPathCalculatorOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "TravelPathCalculatorOptions");
    private final static QName _RoutedSolutionImportParametersMaximumRuntime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "MaximumRuntime");
    private final static QName _RoutedSolutionImportParametersMaximumTravelTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "MaximumTravelTime");
    private final static QName _RoutedSolutionImportParametersPreferredRuntime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "PreferredRuntime");
    private final static QName _RoutedSolutionImportParametersRoutingSessionDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "RoutingSessionDescription");
    private final static QName _RoutedSolutionImportParametersRoutingSessionEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "RoutingSessionEntityKey");
    private final static QName _OrderBaseImportParametersLineItemFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "LineItemFile");
    private final static QName _RecurringOrderImportParametersSessionEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "SessionEntityKey");
    private final static QName _OrderImportParametersManagedByEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", "ManagedByEntityKey");
    private final static QName _DomainEntityCustomProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", "CustomProperties");
    private final static QName _DomainEntityCustomRelatedEntities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", "CustomRelatedEntities");
    private final static QName _SortingDetailProperty_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "Property");
    private final static QName _TelematicsDeviceParameterChangeNotificationEquipmentWeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "EquipmentWeight");
    private final static QName _TelematicsDeviceParameterChangeNotificationHarshAccelerationThreshold_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "HarshAccelerationThreshold");
    private final static QName _TelematicsDeviceParameterChangeNotificationHarshBrakingThreshold_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "HarshBrakingThreshold");
    private final static QName _TelematicsDeviceParameterChangeNotificationHarshCorneringThreshold_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "HarshCorneringThreshold");
    private final static QName _TelematicsDeviceParameterChangeNotificationInputBiasTypeInput0Bias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "InputBiasType_Input0Bias");
    private final static QName _TelematicsDeviceParameterChangeNotificationInputBiasTypeInput1Bias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "InputBiasType_Input1Bias");
    private final static QName _TelematicsDeviceParameterChangeNotificationInputBiasTypeInput2Bias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "InputBiasType_Input2Bias");
    private final static QName _TelematicsDeviceParameterChangeNotificationInputBiasTypeInput3Bias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "InputBiasType_Input3Bias");
    private final static QName _TelematicsDeviceParameterChangeNotificationInputBiasTypeInput4Bias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "InputBiasType_Input4Bias");
    private final static QName _TelematicsDeviceParameterChangeNotificationInputBiasTypeInput5Bias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "InputBiasType_Input5Bias");
    private final static QName _TelematicsDeviceParameterChangeNotificationInputBiasTypeInput6Bias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "InputBiasType_Input6Bias");
    private final static QName _TelematicsDeviceParameterChangeNotificationInputBiasTypeInput7Bias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "InputBiasType_Input7Bias");
    private final static QName _TelematicsDeviceParameterChangeNotificationSpeedBuzzerThreshold_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", "SpeedBuzzerThreshold");
    private final static QName _LookupDeviceResultCustomerIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "CustomerIdentifier");
    private final static QName _ClientInstallInfoBuildType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "BuildType");
    private final static QName _ClientInstallInfoCultureUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "CultureUrl");
    private final static QName _ClientInstallInfoCultureVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "CultureVersion");
    private final static QName _ClientInstallInfoUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "Url");
    private final static QName _ClientInstallInfoVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "Version");
    private final static QName _ClearActiveTroubleCodesParametersActiveTroubleCodeEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "ActiveTroubleCodeEntityKeys");
    private final static QName _SaveCorrespondenceParametersDepotRecipients_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "DepotRecipients");
    private final static QName _SaveCorrespondenceParametersEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "EntityKey");
    private final static QName _SaveCorrespondenceParametersMailingListRecipients_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "MailingListRecipients");
    private final static QName _SaveCorrespondenceParametersRegionRecipients_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "RegionRecipients");
    private final static QName _SaveCorrespondenceParametersRouteRecipients_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "RouteRecipients");
    private final static QName _SaveCorrespondenceParametersText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "Text");
    private final static QName _SaveCorrespondenceParametersWorkerRecipients_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "WorkerRecipients");
    private final static QName _SplitRouteOptionsDtoIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "Identifier");
    private final static QName _SplitRouteOptionsDtoStopIdentities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "StopIdentities");
    private final static QName _MoveResourcesToRegionParametersEquipmentEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "EquipmentEntityKeys");
    private final static QName _MoveResourcesToRegionParametersMobileDeviceEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "MobileDeviceEntityKeys");
    private final static QName _MoveResourcesToRegionParametersWorkerEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", "WorkerEntityKeys");
    private final static QName _LookupTelematicsDeviceResultIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "Identifier");
    private final static QName _CultureOptionsName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", "Name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.roadnet_apex_server_services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClientApplicationInfo }
     * 
     */
    public ClientApplicationInfo createClientApplicationInfo() {
        return new ClientApplicationInfo();
    }

    /**
     * Create an instance of {@link CultureOptions }
     * 
     */
    public CultureOptions createCultureOptions() {
        return new CultureOptions();
    }

    /**
     * Create an instance of {@link LookupMobileDeviceResult }
     * 
     */
    public LookupMobileDeviceResult createLookupMobileDeviceResult() {
        return new LookupMobileDeviceResult();
    }

    /**
     * Create an instance of {@link LookupTelematicsDeviceResult }
     * 
     */
    public LookupTelematicsDeviceResult createLookupTelematicsDeviceResult() {
        return new LookupTelematicsDeviceResult();
    }

    /**
     * Create an instance of {@link MoveResourcesToRegionParameters }
     * 
     */
    public MoveResourcesToRegionParameters createMoveResourcesToRegionParameters() {
        return new MoveResourcesToRegionParameters();
    }

    /**
     * Create an instance of {@link SplitRouteOptionsDto }
     * 
     */
    public SplitRouteOptionsDto createSplitRouteOptionsDto() {
        return new SplitRouteOptionsDto();
    }

    /**
     * Create an instance of {@link SaveCorrespondenceParameters }
     * 
     */
    public SaveCorrespondenceParameters createSaveCorrespondenceParameters() {
        return new SaveCorrespondenceParameters();
    }

    /**
     * Create an instance of {@link ImportParameters }
     * 
     */
    public ImportParameters createImportParameters() {
        return new ImportParameters();
    }

    /**
     * Create an instance of {@link ClearActiveTroubleCodesParameters }
     * 
     */
    public ClearActiveTroubleCodesParameters createClearActiveTroubleCodesParameters() {
        return new ClearActiveTroubleCodesParameters();
    }

    /**
     * Create an instance of {@link DomainEntity }
     * 
     */
    public DomainEntity createDomainEntity() {
        return new DomainEntity();
    }

    /**
     * Create an instance of {@link DataTransferObject }
     * 
     */
    public DataTransferObject createDataTransferObject() {
        return new DataTransferObject();
    }

    /**
     * Create an instance of {@link ImmutableObject }
     * 
     */
    public ImmutableObject createImmutableObject() {
        return new ImmutableObject();
    }

    /**
     * Create an instance of {@link PropertyOptions }
     * 
     */
    public PropertyOptions createPropertyOptions() {
        return new PropertyOptions();
    }

    /**
     * Create an instance of {@link DomainEntityPropertyOptions }
     * 
     */
    public DomainEntityPropertyOptions createDomainEntityPropertyOptions() {
        return new DomainEntityPropertyOptions();
    }

    /**
     * Create an instance of {@link ArrayOfDomainEntity }
     * 
     */
    public ArrayOfDomainEntity createArrayOfDomainEntity() {
        return new ArrayOfDomainEntity();
    }

    /**
     * Create an instance of {@link ClientInstallInfo }
     * 
     */
    public ClientInstallInfo createClientInstallInfo() {
        return new ClientInstallInfo();
    }

    /**
     * Create an instance of {@link LookupDeviceResult }
     * 
     */
    public LookupDeviceResult createLookupDeviceResult() {
        return new LookupDeviceResult();
    }

    /**
     * Create an instance of {@link RequestDeviceToCheckInNotification }
     * 
     */
    public RequestDeviceToCheckInNotification createRequestDeviceToCheckInNotification() {
        return new RequestDeviceToCheckInNotification();
    }

    /**
     * Create an instance of {@link TelematicsDeviceIgnitionKillSwitchNotification }
     * 
     */
    public TelematicsDeviceIgnitionKillSwitchNotification createTelematicsDeviceIgnitionKillSwitchNotification() {
        return new TelematicsDeviceIgnitionKillSwitchNotification();
    }

    /**
     * Create an instance of {@link TelematicsDeviceOutputChangeNotification }
     * 
     */
    public TelematicsDeviceOutputChangeNotification createTelematicsDeviceOutputChangeNotification() {
        return new TelematicsDeviceOutputChangeNotification();
    }

    /**
     * Create an instance of {@link TelematicsDeviceParameterChangeNotification }
     * 
     */
    public TelematicsDeviceParameterChangeNotification createTelematicsDeviceParameterChangeNotification() {
        return new TelematicsDeviceParameterChangeNotification();
    }

    /**
     * Create an instance of {@link TelematicsDeviceRequestRebootNotification }
     * 
     */
    public TelematicsDeviceRequestRebootNotification createTelematicsDeviceRequestRebootNotification() {
        return new TelematicsDeviceRequestRebootNotification();
    }

    /**
     * Create an instance of {@link ArrayOfSortingDetail }
     * 
     */
    public ArrayOfSortingDetail createArrayOfSortingDetail() {
        return new ArrayOfSortingDetail();
    }

    /**
     * Create an instance of {@link SortingDetail }
     * 
     */
    public SortingDetail createSortingDetail() {
        return new SortingDetail();
    }

    /**
     * Create an instance of {@link LocationImportParameters }
     * 
     */
    public LocationImportParameters createLocationImportParameters() {
        return new LocationImportParameters();
    }

    /**
     * Create an instance of {@link DepotImportParameters }
     * 
     */
    public DepotImportParameters createDepotImportParameters() {
        return new DepotImportParameters();
    }

    /**
     * Create an instance of {@link ServiceLocationImportParameters }
     * 
     */
    public ServiceLocationImportParameters createServiceLocationImportParameters() {
        return new ServiceLocationImportParameters();
    }

    /**
     * Create an instance of {@link LayoverLocationImportParameters }
     * 
     */
    public LayoverLocationImportParameters createLayoverLocationImportParameters() {
        return new LayoverLocationImportParameters();
    }

    /**
     * Create an instance of {@link OrderImportParameters }
     * 
     */
    public OrderImportParameters createOrderImportParameters() {
        return new OrderImportParameters();
    }

    /**
     * Create an instance of {@link OrderBaseImportParameters }
     * 
     */
    public OrderBaseImportParameters createOrderBaseImportParameters() {
        return new OrderBaseImportParameters();
    }

    /**
     * Create an instance of {@link RecurringOrderImportParameters }
     * 
     */
    public RecurringOrderImportParameters createRecurringOrderImportParameters() {
        return new RecurringOrderImportParameters();
    }

    /**
     * Create an instance of {@link OnboardImportParameters }
     * 
     */
    public OnboardImportParameters createOnboardImportParameters() {
        return new OnboardImportParameters();
    }

    /**
     * Create an instance of {@link RoutedSolutionImportParameters }
     * 
     */
    public RoutedSolutionImportParameters createRoutedSolutionImportParameters() {
        return new RoutedSolutionImportParameters();
    }

    /**
     * Create an instance of {@link TravelPairImportParameters }
     * 
     */
    public TravelPairImportParameters createTravelPairImportParameters() {
        return new TravelPairImportParameters();
    }

    /**
     * Create an instance of {@link MobileDeviceImportParameters }
     * 
     */
    public MobileDeviceImportParameters createMobileDeviceImportParameters() {
        return new MobileDeviceImportParameters();
    }

    /**
     * Create an instance of {@link CustomFormImportParameters }
     * 
     */
    public CustomFormImportParameters createCustomFormImportParameters() {
        return new CustomFormImportParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", name = "DomainEntity")
    public JAXBElement<DomainEntity> createDomainEntity(DomainEntity value) {
        return new JAXBElement<DomainEntity>(_DomainEntity_QNAME, DomainEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTransferObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", name = "DataTransferObject")
    public JAXBElement<DataTransferObject> createDataTransferObject(DataTransferObject value) {
        return new JAXBElement<DataTransferObject>(_DataTransferObject_QNAME, DataTransferObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImmutableObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", name = "ImmutableObject")
    public JAXBElement<ImmutableObject> createImmutableObject(ImmutableObject value) {
        return new JAXBElement<ImmutableObject>(_ImmutableObject_QNAME, ImmutableObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", name = "ActionType")
    public JAXBElement<ActionType> createActionType(ActionType value) {
        return new JAXBElement<ActionType>(_ActionType_QNAME, ActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyInclusionMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", name = "PropertyInclusionMode")
    public JAXBElement<PropertyInclusionMode> createPropertyInclusionMode(PropertyInclusionMode value) {
        return new JAXBElement<PropertyInclusionMode>(_PropertyInclusionMode_QNAME, PropertyInclusionMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", name = "PropertyOptions")
    public JAXBElement<PropertyOptions> createPropertyOptions(PropertyOptions value) {
        return new JAXBElement<PropertyOptions>(_PropertyOptions_QNAME, PropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainEntityPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", name = "DomainEntityPropertyOptions")
    public JAXBElement<DomainEntityPropertyOptions> createDomainEntityPropertyOptions(DomainEntityPropertyOptions value) {
        return new JAXBElement<DomainEntityPropertyOptions>(_DomainEntityPropertyOptions_QNAME, DomainEntityPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", name = "ArrayOfDomainEntity")
    public JAXBElement<ArrayOfDomainEntity> createArrayOfDomainEntity(ArrayOfDomainEntity value) {
        return new JAXBElement<ArrayOfDomainEntity>(_ArrayOfDomainEntity_QNAME, ArrayOfDomainEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "LoginStatus")
    public JAXBElement<LoginStatus> createLoginStatus(LoginStatus value) {
        return new JAXBElement<LoginStatus>(_LoginStatus_QNAME, LoginStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientApplicationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "ClientApplicationInfo")
    public JAXBElement<ClientApplicationInfo> createClientApplicationInfo(ClientApplicationInfo value) {
        return new JAXBElement<ClientApplicationInfo>(_ClientApplicationInfo_QNAME, ClientApplicationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CultureOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "CultureOptions")
    public JAXBElement<CultureOptions> createCultureOptions(CultureOptions value) {
        return new JAXBElement<CultureOptions>(_CultureOptions_QNAME, CultureOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientInstallInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "ClientInstallInfo")
    public JAXBElement<ClientInstallInfo> createClientInstallInfo(ClientInstallInfo value) {
        return new JAXBElement<ClientInstallInfo>(_ClientInstallInfo_QNAME, ClientInstallInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupMobileDeviceResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "LookupMobileDeviceResult")
    public JAXBElement<LookupMobileDeviceResult> createLookupMobileDeviceResult(LookupMobileDeviceResult value) {
        return new JAXBElement<LookupMobileDeviceResult>(_LookupMobileDeviceResult_QNAME, LookupMobileDeviceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupDeviceResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "LookupDeviceResult")
    public JAXBElement<LookupDeviceResult> createLookupDeviceResult(LookupDeviceResult value) {
        return new JAXBElement<LookupDeviceResult>(_LookupDeviceResult_QNAME, LookupDeviceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupTelematicsDeviceResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "LookupTelematicsDeviceResult")
    public JAXBElement<LookupTelematicsDeviceResult> createLookupTelematicsDeviceResult(LookupTelematicsDeviceResult value) {
        return new JAXBElement<LookupTelematicsDeviceResult>(_LookupTelematicsDeviceResult_QNAME, LookupTelematicsDeviceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceHardwarePlatform }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "TelematicsDeviceHardwarePlatform")
    public JAXBElement<TelematicsDeviceHardwarePlatform> createTelematicsDeviceHardwarePlatform(TelematicsDeviceHardwarePlatform value) {
        return new JAXBElement<TelematicsDeviceHardwarePlatform>(_TelematicsDeviceHardwarePlatform_QNAME, TelematicsDeviceHardwarePlatform.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapDataRegionsEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "MapDataRegionsEx")
    public JAXBElement<MapDataRegionsEx> createMapDataRegionsEx(MapDataRegionsEx value) {
        return new JAXBElement<MapDataRegionsEx>(_MapDataRegionsEx_QNAME, MapDataRegionsEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalEngineRuntimeSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "TotalEngineRuntimeSource")
    public JAXBElement<TotalEngineRuntimeSource> createTotalEngineRuntimeSource(TotalEngineRuntimeSource value) {
        return new JAXBElement<TotalEngineRuntimeSource>(_TotalEngineRuntimeSource_QNAME, TotalEngineRuntimeSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDeviceToCheckInNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "RequestDeviceToCheckInNotification")
    public JAXBElement<RequestDeviceToCheckInNotification> createRequestDeviceToCheckInNotification(RequestDeviceToCheckInNotification value) {
        return new JAXBElement<RequestDeviceToCheckInNotification>(_RequestDeviceToCheckInNotification_QNAME, RequestDeviceToCheckInNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceIgnitionKillSwitchNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "TelematicsDeviceIgnitionKillSwitchNotification")
    public JAXBElement<TelematicsDeviceIgnitionKillSwitchNotification> createTelematicsDeviceIgnitionKillSwitchNotification(TelematicsDeviceIgnitionKillSwitchNotification value) {
        return new JAXBElement<TelematicsDeviceIgnitionKillSwitchNotification>(_TelematicsDeviceIgnitionKillSwitchNotification_QNAME, TelematicsDeviceIgnitionKillSwitchNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceOutputChangeNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "TelematicsDeviceOutputChangeNotification")
    public JAXBElement<TelematicsDeviceOutputChangeNotification> createTelematicsDeviceOutputChangeNotification(TelematicsDeviceOutputChangeNotification value) {
        return new JAXBElement<TelematicsDeviceOutputChangeNotification>(_TelematicsDeviceOutputChangeNotification_QNAME, TelematicsDeviceOutputChangeNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceParameterChangeNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "TelematicsDeviceParameterChangeNotification")
    public JAXBElement<TelematicsDeviceParameterChangeNotification> createTelematicsDeviceParameterChangeNotification(TelematicsDeviceParameterChangeNotification value) {
        return new JAXBElement<TelematicsDeviceParameterChangeNotification>(_TelematicsDeviceParameterChangeNotification_QNAME, TelematicsDeviceParameterChangeNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceRequestRebootNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "TelematicsDeviceRequestRebootNotification")
    public JAXBElement<TelematicsDeviceRequestRebootNotification> createTelematicsDeviceRequestRebootNotification(TelematicsDeviceRequestRebootNotification value) {
        return new JAXBElement<TelematicsDeviceRequestRebootNotification>(_TelematicsDeviceRequestRebootNotification_QNAME, TelematicsDeviceRequestRebootNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSortingDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "ArrayOfSortingDetail")
    public JAXBElement<ArrayOfSortingDetail> createArrayOfSortingDetail(ArrayOfSortingDetail value) {
        return new JAXBElement<ArrayOfSortingDetail>(_ArrayOfSortingDetail_QNAME, ArrayOfSortingDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortingDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "SortingDetail")
    public JAXBElement<SortingDetail> createSortingDetail(SortingDetail value) {
        return new JAXBElement<SortingDetail>(_SortingDetail_QNAME, SortingDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortingDetailOrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "SortingDetail.OrderType")
    public JAXBElement<SortingDetailOrderType> createSortingDetailOrderType(SortingDetailOrderType value) {
        return new JAXBElement<SortingDetailOrderType>(_SortingDetailOrderType_QNAME, SortingDetailOrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "CoordinateFormat")
    public JAXBElement<CoordinateFormat> createCoordinateFormat(CoordinateFormat value) {
        return new JAXBElement<CoordinateFormat>(_CoordinateFormat_QNAME, CoordinateFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "ImportParameters")
    public JAXBElement<ImportParameters> createImportParameters(ImportParameters value) {
        return new JAXBElement<ImportParameters>(_ImportParameters_QNAME, ImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "LocationImportParameters")
    public JAXBElement<LocationImportParameters> createLocationImportParameters(LocationImportParameters value) {
        return new JAXBElement<LocationImportParameters>(_LocationImportParameters_QNAME, LocationImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepotImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "DepotImportParameters")
    public JAXBElement<DepotImportParameters> createDepotImportParameters(DepotImportParameters value) {
        return new JAXBElement<DepotImportParameters>(_DepotImportParameters_QNAME, DepotImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceLocationImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "ServiceLocationImportParameters")
    public JAXBElement<ServiceLocationImportParameters> createServiceLocationImportParameters(ServiceLocationImportParameters value) {
        return new JAXBElement<ServiceLocationImportParameters>(_ServiceLocationImportParameters_QNAME, ServiceLocationImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayoverLocationImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "LayoverLocationImportParameters")
    public JAXBElement<LayoverLocationImportParameters> createLayoverLocationImportParameters(LayoverLocationImportParameters value) {
        return new JAXBElement<LayoverLocationImportParameters>(_LayoverLocationImportParameters_QNAME, LayoverLocationImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "OrderImportParameters")
    public JAXBElement<OrderImportParameters> createOrderImportParameters(OrderImportParameters value) {
        return new JAXBElement<OrderImportParameters>(_OrderImportParameters_QNAME, OrderImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBaseImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "OrderBaseImportParameters")
    public JAXBElement<OrderBaseImportParameters> createOrderBaseImportParameters(OrderBaseImportParameters value) {
        return new JAXBElement<OrderBaseImportParameters>(_OrderBaseImportParameters_QNAME, OrderBaseImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "OrderBaseImportParameters.PlaceImportedOrderIgnoreFlags")
    public JAXBElement<List<String>> createOrderBaseImportParametersPlaceImportedOrderIgnoreFlags(List<String> value) {
        return new JAXBElement<List<String>>(_OrderBaseImportParametersPlaceImportedOrderIgnoreFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringOrderImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "RecurringOrderImportParameters")
    public JAXBElement<RecurringOrderImportParameters> createRecurringOrderImportParameters(RecurringOrderImportParameters value) {
        return new JAXBElement<RecurringOrderImportParameters>(_RecurringOrderImportParameters_QNAME, RecurringOrderImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnboardImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "OnboardImportParameters")
    public JAXBElement<OnboardImportParameters> createOnboardImportParameters(OnboardImportParameters value) {
        return new JAXBElement<OnboardImportParameters>(_OnboardImportParameters_QNAME, OnboardImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutedSolutionImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "RoutedSolutionImportParameters")
    public JAXBElement<RoutedSolutionImportParameters> createRoutedSolutionImportParameters(RoutedSolutionImportParameters value) {
        return new JAXBElement<RoutedSolutionImportParameters>(_RoutedSolutionImportParameters_QNAME, RoutedSolutionImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelPairImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "TravelPairImportParameters")
    public JAXBElement<TravelPairImportParameters> createTravelPairImportParameters(TravelPairImportParameters value) {
        return new JAXBElement<TravelPairImportParameters>(_TravelPairImportParameters_QNAME, TravelPairImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileDeviceImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "MobileDeviceImportParameters")
    public JAXBElement<MobileDeviceImportParameters> createMobileDeviceImportParameters(MobileDeviceImportParameters value) {
        return new JAXBElement<MobileDeviceImportParameters>(_MobileDeviceImportParameters_QNAME, MobileDeviceImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomFormImportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "CustomFormImportParameters")
    public JAXBElement<CustomFormImportParameters> createCustomFormImportParameters(CustomFormImportParameters value) {
        return new JAXBElement<CustomFormImportParameters>(_CustomFormImportParameters_QNAME, CustomFormImportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "OrderImportParameters.AddToRoute")
    public JAXBElement<List<String>> createOrderImportParametersAddToRoute(List<String> value) {
        return new JAXBElement<List<String>>(_OrderImportParametersAddToRoute_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SplitRouteOptionsDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "SplitRouteOptionsDto")
    public JAXBElement<SplitRouteOptionsDto> createSplitRouteOptionsDto(SplitRouteOptionsDto value) {
        return new JAXBElement<SplitRouteOptionsDto>(_SplitRouteOptionsDto_QNAME, SplitRouteOptionsDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveResourcesToRegionParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "MoveResourcesToRegionParameters")
    public JAXBElement<MoveResourcesToRegionParameters> createMoveResourcesToRegionParameters(MoveResourcesToRegionParameters value) {
        return new JAXBElement<MoveResourcesToRegionParameters>(_MoveResourcesToRegionParameters_QNAME, MoveResourcesToRegionParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCorrespondenceParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "SaveCorrespondenceParameters")
    public JAXBElement<SaveCorrespondenceParameters> createSaveCorrespondenceParameters(SaveCorrespondenceParameters value) {
        return new JAXBElement<SaveCorrespondenceParameters>(_SaveCorrespondenceParameters_QNAME, SaveCorrespondenceParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearActiveTroubleCodesParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "ClearActiveTroubleCodesParameters")
    public JAXBElement<ClearActiveTroubleCodesParameters> createClearActiveTroubleCodesParameters(ClearActiveTroubleCodesParameters value) {
        return new JAXBElement<ClearActiveTroubleCodesParameters>(_ClearActiveTroubleCodesParameters_QNAME, ClearActiveTroubleCodesParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "File", scope = ImportParameters.class)
    public JAXBElement<byte[]> createImportParametersFile(byte[] value) {
        return new JAXBElement<byte[]>(_ImportParametersFile_QNAME, byte[].class, ImportParameters.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "ImportTemplateEntityKey", scope = ImportParameters.class)
    public JAXBElement<Long> createImportParametersImportTemplateEntityKey(Long value) {
        return new JAXBElement<Long>(_ImportParametersImportTemplateEntityKey_QNAME, Long.class, ImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "ImportTypeName", scope = ImportParameters.class)
    public JAXBElement<String> createImportParametersImportTypeName(String value) {
        return new JAXBElement<String>(_ImportParametersImportTypeName_QNAME, String.class, ImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "TransferTemplateSetEntityKey", scope = ImportParameters.class)
    public JAXBElement<Long> createImportParametersTransferTemplateSetEntityKey(Long value) {
        return new JAXBElement<Long>(_ImportParametersTransferTemplateSetEntityKey_QNAME, Long.class, ImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelPathCalculatorOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "TravelPathCalculatorOptions", scope = TravelPairImportParameters.class)
    public JAXBElement<TravelPathCalculatorOptions> createTravelPairImportParametersTravelPathCalculatorOptions(TravelPathCalculatorOptions value) {
        return new JAXBElement<TravelPathCalculatorOptions>(_TravelPairImportParametersTravelPathCalculatorOptions_QNAME, TravelPathCalculatorOptions.class, TravelPairImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "MaximumRuntime", scope = RoutedSolutionImportParameters.class)
    public JAXBElement<Duration> createRoutedSolutionImportParametersMaximumRuntime(Duration value) {
        return new JAXBElement<Duration>(_RoutedSolutionImportParametersMaximumRuntime_QNAME, Duration.class, RoutedSolutionImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "MaximumTravelTime", scope = RoutedSolutionImportParameters.class)
    public JAXBElement<Duration> createRoutedSolutionImportParametersMaximumTravelTime(Duration value) {
        return new JAXBElement<Duration>(_RoutedSolutionImportParametersMaximumTravelTime_QNAME, Duration.class, RoutedSolutionImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "PreferredRuntime", scope = RoutedSolutionImportParameters.class)
    public JAXBElement<Duration> createRoutedSolutionImportParametersPreferredRuntime(Duration value) {
        return new JAXBElement<Duration>(_RoutedSolutionImportParametersPreferredRuntime_QNAME, Duration.class, RoutedSolutionImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "RoutingSessionDescription", scope = RoutedSolutionImportParameters.class)
    public JAXBElement<String> createRoutedSolutionImportParametersRoutingSessionDescription(String value) {
        return new JAXBElement<String>(_RoutedSolutionImportParametersRoutingSessionDescription_QNAME, String.class, RoutedSolutionImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "RoutingSessionEntityKey", scope = RoutedSolutionImportParameters.class)
    public JAXBElement<Long> createRoutedSolutionImportParametersRoutingSessionEntityKey(Long value) {
        return new JAXBElement<Long>(_RoutedSolutionImportParametersRoutingSessionEntityKey_QNAME, Long.class, RoutedSolutionImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "RoutingSessionEntityKey", scope = OnboardImportParameters.class)
    public JAXBElement<Long> createOnboardImportParametersRoutingSessionEntityKey(Long value) {
        return new JAXBElement<Long>(_RoutedSolutionImportParametersRoutingSessionEntityKey_QNAME, Long.class, OnboardImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "LineItemFile", scope = OrderBaseImportParameters.class)
    public JAXBElement<byte[]> createOrderBaseImportParametersLineItemFile(byte[] value) {
        return new JAXBElement<byte[]>(_OrderBaseImportParametersLineItemFile_QNAME, byte[].class, OrderBaseImportParameters.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "SessionEntityKey", scope = RecurringOrderImportParameters.class)
    public JAXBElement<Long> createRecurringOrderImportParametersSessionEntityKey(Long value) {
        return new JAXBElement<Long>(_RecurringOrderImportParametersSessionEntityKey_QNAME, Long.class, RecurringOrderImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "ManagedByEntityKey", scope = OrderImportParameters.class)
    public JAXBElement<Long> createOrderImportParametersManagedByEntityKey(Long value) {
        return new JAXBElement<Long>(_OrderImportParametersManagedByEntityKey_QNAME, Long.class, OrderImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", name = "SessionEntityKey", scope = OrderImportParameters.class)
    public JAXBElement<Long> createOrderImportParametersSessionEntityKey(Long value) {
        return new JAXBElement<Long>(_RecurringOrderImportParametersSessionEntityKey_QNAME, Long.class, OrderImportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", name = "CustomProperties", scope = DomainEntity.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createDomainEntityCustomProperties(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_DomainEntityCustomProperties_QNAME, ArrayOfKeyValueOfstringanyType.class, DomainEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", name = "CustomRelatedEntities", scope = DomainEntity.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createDomainEntityCustomRelatedEntities(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_DomainEntityCustomRelatedEntities_QNAME, ArrayOfKeyValueOfstringanyType.class, DomainEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "Property", scope = SortingDetail.class)
    public JAXBElement<String> createSortingDetailProperty(String value) {
        return new JAXBElement<String>(_SortingDetailProperty_QNAME, String.class, SortingDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Weight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "EquipmentWeight", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<Weight> createTelematicsDeviceParameterChangeNotificationEquipmentWeight(Weight value) {
        return new JAXBElement<Weight>(_TelematicsDeviceParameterChangeNotificationEquipmentWeight_QNAME, Weight.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "HarshAccelerationThreshold", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<Double> createTelematicsDeviceParameterChangeNotificationHarshAccelerationThreshold(Double value) {
        return new JAXBElement<Double>(_TelematicsDeviceParameterChangeNotificationHarshAccelerationThreshold_QNAME, Double.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "HarshBrakingThreshold", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<Double> createTelematicsDeviceParameterChangeNotificationHarshBrakingThreshold(Double value) {
        return new JAXBElement<Double>(_TelematicsDeviceParameterChangeNotificationHarshBrakingThreshold_QNAME, Double.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "HarshCorneringThreshold", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<Double> createTelematicsDeviceParameterChangeNotificationHarshCorneringThreshold(Double value) {
        return new JAXBElement<Double>(_TelematicsDeviceParameterChangeNotificationHarshCorneringThreshold_QNAME, Double.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "InputBiasType_Input0Bias", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<String> createTelematicsDeviceParameterChangeNotificationInputBiasTypeInput0Bias(String value) {
        return new JAXBElement<String>(_TelematicsDeviceParameterChangeNotificationInputBiasTypeInput0Bias_QNAME, String.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "InputBiasType_Input1Bias", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<String> createTelematicsDeviceParameterChangeNotificationInputBiasTypeInput1Bias(String value) {
        return new JAXBElement<String>(_TelematicsDeviceParameterChangeNotificationInputBiasTypeInput1Bias_QNAME, String.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "InputBiasType_Input2Bias", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<String> createTelematicsDeviceParameterChangeNotificationInputBiasTypeInput2Bias(String value) {
        return new JAXBElement<String>(_TelematicsDeviceParameterChangeNotificationInputBiasTypeInput2Bias_QNAME, String.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "InputBiasType_Input3Bias", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<String> createTelematicsDeviceParameterChangeNotificationInputBiasTypeInput3Bias(String value) {
        return new JAXBElement<String>(_TelematicsDeviceParameterChangeNotificationInputBiasTypeInput3Bias_QNAME, String.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "InputBiasType_Input4Bias", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<String> createTelematicsDeviceParameterChangeNotificationInputBiasTypeInput4Bias(String value) {
        return new JAXBElement<String>(_TelematicsDeviceParameterChangeNotificationInputBiasTypeInput4Bias_QNAME, String.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "InputBiasType_Input5Bias", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<String> createTelematicsDeviceParameterChangeNotificationInputBiasTypeInput5Bias(String value) {
        return new JAXBElement<String>(_TelematicsDeviceParameterChangeNotificationInputBiasTypeInput5Bias_QNAME, String.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "InputBiasType_Input6Bias", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<String> createTelematicsDeviceParameterChangeNotificationInputBiasTypeInput6Bias(String value) {
        return new JAXBElement<String>(_TelematicsDeviceParameterChangeNotificationInputBiasTypeInput6Bias_QNAME, String.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "InputBiasType_Input7Bias", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<String> createTelematicsDeviceParameterChangeNotificationInputBiasTypeInput7Bias(String value) {
        return new JAXBElement<String>(_TelematicsDeviceParameterChangeNotificationInputBiasTypeInput7Bias_QNAME, String.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", name = "SpeedBuzzerThreshold", scope = TelematicsDeviceParameterChangeNotification.class)
    public JAXBElement<Speed> createTelematicsDeviceParameterChangeNotificationSpeedBuzzerThreshold(Speed value) {
        return new JAXBElement<Speed>(_TelematicsDeviceParameterChangeNotificationSpeedBuzzerThreshold_QNAME, Speed.class, TelematicsDeviceParameterChangeNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "CustomerIdentifier", scope = LookupDeviceResult.class)
    public JAXBElement<String> createLookupDeviceResultCustomerIdentifier(String value) {
        return new JAXBElement<String>(_LookupDeviceResultCustomerIdentifier_QNAME, String.class, LookupDeviceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "BuildType", scope = ClientInstallInfo.class)
    public JAXBElement<String> createClientInstallInfoBuildType(String value) {
        return new JAXBElement<String>(_ClientInstallInfoBuildType_QNAME, String.class, ClientInstallInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "CultureUrl", scope = ClientInstallInfo.class)
    public JAXBElement<String> createClientInstallInfoCultureUrl(String value) {
        return new JAXBElement<String>(_ClientInstallInfoCultureUrl_QNAME, String.class, ClientInstallInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "CultureVersion", scope = ClientInstallInfo.class)
    public JAXBElement<String> createClientInstallInfoCultureVersion(String value) {
        return new JAXBElement<String>(_ClientInstallInfoCultureVersion_QNAME, String.class, ClientInstallInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "Url", scope = ClientInstallInfo.class)
    public JAXBElement<String> createClientInstallInfoUrl(String value) {
        return new JAXBElement<String>(_ClientInstallInfoUrl_QNAME, String.class, ClientInstallInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "Version", scope = ClientInstallInfo.class)
    public JAXBElement<String> createClientInstallInfoVersion(String value) {
        return new JAXBElement<String>(_ClientInstallInfoVersion_QNAME, String.class, ClientInstallInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "ActiveTroubleCodeEntityKeys", scope = ClearActiveTroubleCodesParameters.class)
    public JAXBElement<ArrayOflong> createClearActiveTroubleCodesParametersActiveTroubleCodeEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ClearActiveTroubleCodesParametersActiveTroubleCodeEntityKeys_QNAME, ArrayOflong.class, ClearActiveTroubleCodesParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "DepotRecipients", scope = SaveCorrespondenceParameters.class)
    public JAXBElement<ArrayOflong> createSaveCorrespondenceParametersDepotRecipients(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SaveCorrespondenceParametersDepotRecipients_QNAME, ArrayOflong.class, SaveCorrespondenceParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "EntityKey", scope = SaveCorrespondenceParameters.class)
    public JAXBElement<Long> createSaveCorrespondenceParametersEntityKey(Long value) {
        return new JAXBElement<Long>(_SaveCorrespondenceParametersEntityKey_QNAME, Long.class, SaveCorrespondenceParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "MailingListRecipients", scope = SaveCorrespondenceParameters.class)
    public JAXBElement<ArrayOflong> createSaveCorrespondenceParametersMailingListRecipients(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SaveCorrespondenceParametersMailingListRecipients_QNAME, ArrayOflong.class, SaveCorrespondenceParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "RegionRecipients", scope = SaveCorrespondenceParameters.class)
    public JAXBElement<ArrayOflong> createSaveCorrespondenceParametersRegionRecipients(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SaveCorrespondenceParametersRegionRecipients_QNAME, ArrayOflong.class, SaveCorrespondenceParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "RouteRecipients", scope = SaveCorrespondenceParameters.class)
    public JAXBElement<ArrayOflong> createSaveCorrespondenceParametersRouteRecipients(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SaveCorrespondenceParametersRouteRecipients_QNAME, ArrayOflong.class, SaveCorrespondenceParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "Text", scope = SaveCorrespondenceParameters.class)
    public JAXBElement<String> createSaveCorrespondenceParametersText(String value) {
        return new JAXBElement<String>(_SaveCorrespondenceParametersText_QNAME, String.class, SaveCorrespondenceParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "WorkerRecipients", scope = SaveCorrespondenceParameters.class)
    public JAXBElement<ArrayOflong> createSaveCorrespondenceParametersWorkerRecipients(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SaveCorrespondenceParametersWorkerRecipients_QNAME, ArrayOflong.class, SaveCorrespondenceParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "Identifier", scope = SplitRouteOptionsDto.class)
    public JAXBElement<String> createSplitRouteOptionsDtoIdentifier(String value) {
        return new JAXBElement<String>(_SplitRouteOptionsDtoIdentifier_QNAME, String.class, SplitRouteOptionsDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "StopIdentities", scope = SplitRouteOptionsDto.class)
    public JAXBElement<ArrayOfStopIdentity> createSplitRouteOptionsDtoStopIdentities(ArrayOfStopIdentity value) {
        return new JAXBElement<ArrayOfStopIdentity>(_SplitRouteOptionsDtoStopIdentities_QNAME, ArrayOfStopIdentity.class, SplitRouteOptionsDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "EquipmentEntityKeys", scope = MoveResourcesToRegionParameters.class)
    public JAXBElement<ArrayOflong> createMoveResourcesToRegionParametersEquipmentEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveResourcesToRegionParametersEquipmentEntityKeys_QNAME, ArrayOflong.class, MoveResourcesToRegionParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "MobileDeviceEntityKeys", scope = MoveResourcesToRegionParameters.class)
    public JAXBElement<ArrayOflong> createMoveResourcesToRegionParametersMobileDeviceEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveResourcesToRegionParametersMobileDeviceEntityKeys_QNAME, ArrayOflong.class, MoveResourcesToRegionParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", name = "WorkerEntityKeys", scope = MoveResourcesToRegionParameters.class)
    public JAXBElement<ArrayOflong> createMoveResourcesToRegionParametersWorkerEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MoveResourcesToRegionParametersWorkerEntityKeys_QNAME, ArrayOflong.class, MoveResourcesToRegionParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "Identifier", scope = LookupTelematicsDeviceResult.class)
    public JAXBElement<String> createLookupTelematicsDeviceResultIdentifier(String value) {
        return new JAXBElement<String>(_LookupTelematicsDeviceResultIdentifier_QNAME, String.class, LookupTelematicsDeviceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "Name", scope = CultureOptions.class)
    public JAXBElement<String> createCultureOptionsName(String value) {
        return new JAXBElement<String>(_CultureOptionsName_QNAME, String.class, CultureOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "Version", scope = CultureOptions.class)
    public JAXBElement<String> createCultureOptionsVersion(String value) {
        return new JAXBElement<String>(_ClientInstallInfoVersion_QNAME, String.class, CultureOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "BuildType", scope = ClientApplicationInfo.class)
    public JAXBElement<String> createClientApplicationInfoBuildType(String value) {
        return new JAXBElement<String>(_ClientInstallInfoBuildType_QNAME, String.class, ClientApplicationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", name = "Version", scope = ClientApplicationInfo.class)
    public JAXBElement<String> createClientApplicationInfoVersion(String value) {
        return new JAXBElement<String>(_ClientInstallInfoVersion_QNAME, String.class, ClientApplicationInfo.class, value);
    }

}
