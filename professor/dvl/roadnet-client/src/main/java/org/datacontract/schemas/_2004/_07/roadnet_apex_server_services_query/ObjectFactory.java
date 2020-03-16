
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.roadnet.apex.datacontracts.ArrayOfDriverLog;
import com.roadnet.apex.datacontracts.ArrayOfServiceableStopTemplate;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.LocationComment;
import com.roadnet.apex.datacontracts.PersonName;
import com.roadnet.apex.datacontracts.QualityPairedDateTime;
import com.roadnet.apex.datacontracts.Quantities;
import com.roadnet.apex.datacontracts.RegionContext;
import com.roadnet.apex.datacontracts.RoutePropertyOptions;
import com.roadnet.apex.datacontracts.StopTemplatePropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ArrayOfDataWarehouseSecondaryDimensionType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ArrayOfDimensionDescriber;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ArrayOfDimensionDetail;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.CompositeMeasure;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiBase;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiDescription;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseResourceEvent;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseRouteData;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseStop;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseTimeDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.IMeasure;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.MeasureUnitOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.SimpleExpressionBase;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.roadnet_apex_server_services_query package. 
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

    private final static QName _DriverLogResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "DriverLogResults");
    private final static QName _EquipmentDataHistoryEncodedResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "EquipmentDataHistoryEncodedResult");
    private final static QName _ArrayOfEquipmentDataSetEncoded_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "ArrayOfEquipmentDataSetEncoded");
    private final static QName _EquipmentDataSetEncoded_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "EquipmentDataSetEncoded");
    private final static QName _EquipmentInitialState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "EquipmentInitialState");
    private final static QName _RetrieveStopTemplateResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "RetrieveStopTemplateResults");
    private final static QName _ServiceableStopTemplateRetrievalOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "ServiceableStopTemplateRetrievalOptions");
    private final static QName _X0020XRSDataRetrievalJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "_x0020_XRSDataRetrievalJobParameters");
    private final static QName _DVIRRetrievalJobParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "DVIRRetrievalJobParameters");
    private final static QName _GetNextOrPreviousRouteOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "GetNextOrPreviousRouteOptions");
    private final static QName _LocationCommentResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "LocationCommentResults");
    private final static QName _ArrayOfLocationCommentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "ArrayOfLocationCommentInfo");
    private final static QName _LocationCommentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "LocationCommentInfo");
    private final static QName _ArrayOfOrderInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "ArrayOfOrderInfo");
    private final static QName _OrderInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "OrderInfo");
    private final static QName _ArrayOfOrderInfoWorkerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "ArrayOfOrderInfo.WorkerInfo");
    private final static QName _OrderInfoWorkerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "OrderInfo.WorkerInfo");
    private final static QName _InternalRetrieveEquipmentDataHistoryEncodedOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "InternalRetrieveEquipmentDataHistoryEncodedOptions");
    private final static QName _RetrievePositionHistoryReportOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "RetrievePositionHistoryReportOptions");
    private final static QName _LookupEquipmentOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "LookupEquipmentOptions");
    private final static QName _LookupEquipmentResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "LookupEquipmentResult");
    private final static QName _CustomerPlanningLicenseInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "CustomerPlanningLicenseInfo");
    private final static QName _ExecuteServicePatternAnalyzerParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.ServicePatternAnalyzer", "ExecuteServicePatternAnalyzerParameters");
    private final static QName _MeasureUnitType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "MeasureUnitType");
    private final static QName _SecondaryDimensionLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "SecondaryDimensionLevel");
    private final static QName _TimeRangeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "TimeRangeType");
    private final static QName _DataWarehouseKpiExecutionJobInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWarehouseKpiExecutionJobInfo");
    private final static QName _KpiQueryResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "KpiQueryResults");
    private final static QName _KpiExportParametersPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "KpiExportParametersPropertyOptions");
    private final static QName _DataWarehouseKpiExecutionJobResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWarehouseKpiExecutionJobResult");
    private final static QName _DataWarehouseKpiResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWarehouseKpiResult");
    private final static QName _KpiExportParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "KpiExportParameters");
    private final static QName _KpiQuery_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "KpiQuery");
    private final static QName _Grouping_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Grouping");
    private final static QName _IMeasureRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "IMeasureRule");
    private final static QName _CompositeMeasureRuleBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "CompositeMeasureRuleBase");
    private final static QName _ArrayOfIMeasureRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ArrayOfIMeasureRule");
    private final static QName _MeasureRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "MeasureRule");
    private final static QName _KpiQueryResultItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "KpiQueryResultItem");
    private final static QName _ArrayOfMeasureResultDataPoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ArrayOfMeasureResultDataPoint");
    private final static QName _MeasureResultDataPoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "MeasureResultDataPoint");
    private final static QName _MeasureResultValuePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "MeasureResultValuePoint");
    private final static QName _MeasureResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "MeasureResult");
    private final static QName _ArrayOfMeasureResultValuePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ArrayOfMeasureResultValuePoint");
    private final static QName _ArrayOfKpiQueryResultItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ArrayOfKpiQueryResultItem");
    private final static QName _ArrayOfKpiQuery_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ArrayOfKpiQuery");
    private final static QName _KpiQueryResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "KpiQueryResult");
    private final static QName _ArrayOfMeasureResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ArrayOfMeasureResult");
    private final static QName _DataWarehouseMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWarehouseMetadata");
    private final static QName _ArrayOfMeasureMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ArrayOfMeasureMetadata");
    private final static QName _MeasureMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "MeasureMetadata");
    private final static QName _MeasureTypeMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "MeasureTypeMetadata");
    private final static QName _AtomicMeasureTypeMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "AtomicMeasureTypeMetadata");
    private final static QName _CompositeMeasureTypeMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "CompositeMeasureTypeMetadata");
    private final static QName _CustomMeasureTypeMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "CustomMeasureTypeMetadata");
    private final static QName _ArrayOfSecondaryDimensionMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ArrayOfSecondaryDimensionMetadata");
    private final static QName _SecondaryDimensionMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "SecondaryDimensionMetadata");
    private final static QName _DimensionMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DimensionMetadata");
    private final static QName _BooleanDimensionMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "BooleanDimensionMetadata");
    private final static QName _EnumDimensionMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "EnumDimensionMetadata");
    private final static QName _NumericDimensionMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "NumericDimensionMetadata");
    private final static QName _StringDimensionMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "StringDimensionMetadata");
    private final static QName _ArrayOfDimensionMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ArrayOfDimensionMetadata");
    private final static QName _SampleDataGeneratorParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "SampleDataGeneratorParameters");
    private final static QName _CompositeMeasureRuleBaseRules_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Rules");
    private final static QName _StringDimensionMetadataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Name");
    private final static QName _NumericDimensionMetadataMax_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Max");
    private final static QName _NumericDimensionMetadataMin_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Min");
    private final static QName _NumericDimensionMetadataPrecision_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Precision");
    private final static QName _SecondaryDimensionMetadataAttributes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Attributes");
    private final static QName _CustomMeasureTypeMetadataMeasureName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "MeasureName");
    private final static QName _CompositeMeasureTypeMetadataCompositeMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "CompositeMeasure");
    private final static QName _MeasureMetadataDataWarehouseMeasureUsageOptionsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWarehouseMeasureUsageOptions_Options");
    private final static QName _MeasureMetadataSecondaryDimensions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "SecondaryDimensions");
    private final static QName _MeasureResultDataPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataPoints");
    private final static QName _MeasureResultDataWithoutFeatureExcluded_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWithoutFeatureExcluded");
    private final static QName _MeasureResultListOfMeasureUnitTypeUnitTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ListOfMeasureUnitType_UnitTypes");
    private final static QName _MeasureResultMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Measure");
    private final static QName _MeasureResultOperationsUnitAncestors_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "OperationsUnitAncestors");
    private final static QName _MeasureResultDataPointDataWarehouseResourceEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWarehouseResourceEvent");
    private final static QName _MeasureResultDataPointDimensionDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DimensionDetails");
    private final static QName _MeasureResultDataPointRouteData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "RouteData");
    private final static QName _MeasureResultDataPointRouteInternalKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "RouteInternalKey");
    private final static QName _MeasureResultDataPointStopHeader_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "StopHeader");
    private final static QName _MeasureResultDataPointTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Time");
    private final static QName _MeasureResultDataPointValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Values");
    private final static QName _MeasureRuleCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Criteria");
    private final static QName _GroupingDimensionDescribers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DimensionDescribers");
    private final static QName _KpiQueryDataPointsLimiter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataPointsLimiter");
    private final static QName _KpiQueryDataWarehouseDataPointsLimiterSettingsDataPointsLimiterSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWarehouseDataPointsLimiterSettings_DataPointsLimiterSetting");
    private final static QName _KpiQueryDataWarehouseKpiSortingOptionsSortByTypeSortBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWarehouseKpiSortingOptions_SortByType_SortBy");
    private final static QName _KpiQueryDataWarehouseKpiSortingOptionsSortOrderTypeSortOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWarehouseKpiSortingOptions_SortOrderType_SortOrder");
    private final static QName _KpiQueryDataWarehouseRuleActionRuleAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWarehouseRuleAction_RuleAction");
    private final static QName _KpiQueryFirstDateInDateRange_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "FirstDateInDateRange");
    private final static QName _KpiQueryGroupings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Groupings");
    private final static QName _KpiQueryLastDateInDateRange_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "LastDateInDateRange");
    private final static QName _KpiQueryMeasureUnitOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "MeasureUnitOptions");
    private final static QName _KpiQueryOperationsUnitAncestorEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "OperationsUnitAncestorEntityKeys");
    private final static QName _KpiQueryRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Rule");
    private final static QName _KpiQueryRuleLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "RuleLevel");
    private final static QName _KpiQueryTimeRangeTypeTimeRangeToUse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "TimeRangeType_TimeRangeToUse");
    private final static QName _KpiQueryTimeUnitTimeUnitTypeInBeforeTodayRange_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "TimeUnit_TimeUnitTypeInBeforeTodayRange");
    private final static QName _DataWarehouseKpiExecutionJobResultKpiResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "KpiResult");
    private final static QName _OrderInfoWorkerInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "Name");
    private final static QName _OrderInfoCancelledDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "CancelledDate");
    private final static QName _OrderInfoConsignee_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "Consignee");
    private final static QName _OrderInfoDeliveryQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "DeliveryQuantities");
    private final static QName _OrderInfoDepartureTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "DepartureTime");
    private final static QName _OrderInfoIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "Identifier");
    private final static QName _OrderInfoLastKnownDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "LastKnownDistance");
    private final static QName _OrderInfoLastKnownPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "LastKnownPosition");
    private final static QName _OrderInfoOrderCustomProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "OrderCustomProperties");
    private final static QName _OrderInfoPickupQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "PickupQuantities");
    private final static QName _OrderInfoPlannedDeliveryQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "PlannedDeliveryQuantities");
    private final static QName _OrderInfoPlannedPickupQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "PlannedPickupQuantities");
    private final static QName _OrderInfoRouteWorkerInfos_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "RouteWorkerInfos");
    private final static QName _OrderInfoServiceStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "ServiceStartDate");
    private final static QName _OrderInfoServiceStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "ServiceStartTime");
    private final static QName _OrderInfoSpecialInstructions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "SpecialInstructions");
    private final static QName _LocationCommentInfoLocationComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "LocationComment");
    private final static QName _LocationCommentInfoLocationDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "LocationDescription");
    private final static QName _LocationCommentInfoLocationIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "LocationIdentifier");
    private final static QName _X0020XRSDataRetrievalJobParametersWorkerEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "WorkerEntityKeys");
    private final static QName _EquipmentInitialStateIgnitionStateIgnitionState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "IgnitionState_IgnitionState");
    private final static QName _EquipmentDataSetEncodedPositionDataPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "PositionDataPoints");
    private final static QName _EquipmentDataSetEncodedTelemetryDataPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "TelemetryDataPoints");
    private final static QName _KpiExportParametersDataWarehouseFileTypeFileType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DataWarehouseFileType_FileType");
    private final static QName _KpiExportParametersDownloadCenterUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "DownloadCenterUrl");
    private final static QName _KpiExportParametersFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "FileName");
    private final static QName _KpiExportParametersKpi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Kpi");
    private final static QName _SampleDataGeneratorParametersStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "StartDate");
    private final static QName _DataWarehouseMetadataMeasures_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Measures");
    private final static QName _DataWarehouseKpiExecutionJobInfoQueryResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "QueryResults");
    private final static QName _DataWarehouseKpiExecutionJobInfoResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Result");
    private final static QName _KpiQueryResultsKpiExecutionJobPKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "KpiExecutionJobPKey");
    private final static QName _KpiQueryResultsReferencedAccounts_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedAccounts");
    private final static QName _KpiQueryResultsReferencedCargoExceptionTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedCargoExceptionTypes");
    private final static QName _KpiQueryResultsReferencedCargoUnitTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedCargoUnitTypes");
    private final static QName _KpiQueryResultsReferencedCostTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedCostTypes");
    private final static QName _KpiQueryResultsReferencedDoorStateExceptionRules_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedDoorStateExceptionRules");
    private final static QName _KpiQueryResultsReferencedEngineIdleExceptionRules_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedEngineIdleExceptionRules");
    private final static QName _KpiQueryResultsReferencedEquipmentClasses_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedEquipmentClasses");
    private final static QName _KpiQueryResultsReferencedEquipmentManufacturers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedEquipmentManufacturers");
    private final static QName _KpiQueryResultsReferencedEquipmentTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedEquipmentTypes");
    private final static QName _KpiQueryResultsReferencedEquipments_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedEquipments");
    private final static QName _KpiQueryResultsReferencedIdlingTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedIdlingTypes");
    private final static QName _KpiQueryResultsReferencedLocations_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedLocations");
    private final static QName _KpiQueryResultsReferencedMobileDevices_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedMobileDevices");
    private final static QName _KpiQueryResultsReferencedNavRecalculationReasons_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedNavRecalculationReasons");
    private final static QName _KpiQueryResultsReferencedOperationsUnits_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedOperationsUnits");
    private final static QName _KpiQueryResultsReferencedPlannedAndActuals_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedPlannedAndActuals");
    private final static QName _KpiQueryResultsReferencedPowerTakeOffExceptionRules_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedPowerTakeOffExceptionRules");
    private final static QName _KpiQueryResultsReferencedRouteDescriptors_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedRouteDescriptors");
    private final static QName _KpiQueryResultsReferencedRouteInfos_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedRouteInfos");
    private final static QName _KpiQueryResultsReferencedRoutes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedRoutes");
    private final static QName _KpiQueryResultsReferencedServiceLocationCategories_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedServiceLocationCategories");
    private final static QName _KpiQueryResultsReferencedServiceTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedServiceTypes");
    private final static QName _KpiQueryResultsReferencedSpeedingExceptionRules_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedSpeedingExceptionRules");
    private final static QName _KpiQueryResultsReferencedStopInfos_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedStopInfos");
    private final static QName _KpiQueryResultsReferencedStopTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedStopTypes");
    private final static QName _KpiQueryResultsReferencedTelematicsDeviceInputOutputAccessories_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedTelematicsDeviceInputOutputAccessories");
    private final static QName _KpiQueryResultsReferencedTelematicsDevices_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedTelematicsDevices");
    private final static QName _KpiQueryResultsReferencedTemperatureExceptionRules_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedTemperatureExceptionRules");
    private final static QName _KpiQueryResultsReferencedWorkerTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedWorkerTypes");
    private final static QName _KpiQueryResultsReferencedWorkers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "ReferencedWorkers");
    private final static QName _KpiQueryResultsResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "Results");
    private final static QName _DataWarehouseKpiResultKpiDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", "KpiDescription");
    private final static QName _LookupEquipmentOptionsEquipmentIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "EquipmentIdentifier");
    private final static QName _GetNextOrPreviousRouteOptionsEquipmentEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "EquipmentEntityKey");
    private final static QName _GetNextOrPreviousRouteOptionsReturnPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "ReturnPropertyOptions");
    private final static QName _GetNextOrPreviousRouteOptionsWorkerEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "WorkerEntityKey");
    private final static QName _RetrieveStopTemplateResultsServiceableStopTemplates_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "ServiceableStopTemplates");
    private final static QName _ServiceableStopTemplateRetrievalOptionsRetrievalPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "RetrievalPropertyOptions");
    private final static QName _ServiceableStopTemplateRetrievalOptionsSearchString_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "SearchString");
    private final static QName _InternalRetrieveEquipmentDataHistoryEncodedOptionsRegionContext_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "RegionContext");
    private final static QName _InternalRetrieveEquipmentDataHistoryEncodedOptionsRegionMobileDataSourceGpsStreamSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "Region_MobileDataSource_GpsStreamSource");
    private final static QName _EquipmentDataHistoryEncodedResultEncodedEquipmentDataSets_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "EncodedEquipmentDataSets");
    private final static QName _EquipmentDataHistoryEncodedResultInitialState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "InitialState");
    private final static QName _DriverLogResultsItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "Items");
    private final static QName _LocationCommentResultsLocationComments_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", "LocationComments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.roadnet_apex_server_services_query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LocationCommentResults }
     * 
     */
    public LocationCommentResults createLocationCommentResults() {
        return new LocationCommentResults();
    }

    /**
     * Create an instance of {@link DriverLogResults }
     * 
     */
    public DriverLogResults createDriverLogResults() {
        return new DriverLogResults();
    }

    /**
     * Create an instance of {@link DVIRRetrievalJobParameters }
     * 
     */
    public DVIRRetrievalJobParameters createDVIRRetrievalJobParameters() {
        return new DVIRRetrievalJobParameters();
    }

    /**
     * Create an instance of {@link ArrayOfOrderInfo }
     * 
     */
    public ArrayOfOrderInfo createArrayOfOrderInfo() {
        return new ArrayOfOrderInfo();
    }

    /**
     * Create an instance of {@link ExecuteServicePatternAnalyzerParameters }
     * 
     */
    public ExecuteServicePatternAnalyzerParameters createExecuteServicePatternAnalyzerParameters() {
        return new ExecuteServicePatternAnalyzerParameters();
    }

    /**
     * Create an instance of {@link InternalRetrieveEquipmentDataHistoryEncodedOptions }
     * 
     */
    public InternalRetrieveEquipmentDataHistoryEncodedOptions createInternalRetrieveEquipmentDataHistoryEncodedOptions() {
        return new InternalRetrieveEquipmentDataHistoryEncodedOptions();
    }

    /**
     * Create an instance of {@link EquipmentDataHistoryEncodedResult }
     * 
     */
    public EquipmentDataHistoryEncodedResult createEquipmentDataHistoryEncodedResult() {
        return new EquipmentDataHistoryEncodedResult();
    }

    /**
     * Create an instance of {@link RetrievePositionHistoryReportOptions }
     * 
     */
    public RetrievePositionHistoryReportOptions createRetrievePositionHistoryReportOptions() {
        return new RetrievePositionHistoryReportOptions();
    }

    /**
     * Create an instance of {@link ServiceableStopTemplateRetrievalOptions }
     * 
     */
    public ServiceableStopTemplateRetrievalOptions createServiceableStopTemplateRetrievalOptions() {
        return new ServiceableStopTemplateRetrievalOptions();
    }

    /**
     * Create an instance of {@link RetrieveStopTemplateResults }
     * 
     */
    public RetrieveStopTemplateResults createRetrieveStopTemplateResults() {
        return new RetrieveStopTemplateResults();
    }

    /**
     * Create an instance of {@link GetNextOrPreviousRouteOptions }
     * 
     */
    public GetNextOrPreviousRouteOptions createGetNextOrPreviousRouteOptions() {
        return new GetNextOrPreviousRouteOptions();
    }

    /**
     * Create an instance of {@link LookupEquipmentOptions }
     * 
     */
    public LookupEquipmentOptions createLookupEquipmentOptions() {
        return new LookupEquipmentOptions();
    }

    /**
     * Create an instance of {@link LookupEquipmentResult }
     * 
     */
    public LookupEquipmentResult createLookupEquipmentResult() {
        return new LookupEquipmentResult();
    }

    /**
     * Create an instance of {@link CustomerPlanningLicenseInfo }
     * 
     */
    public CustomerPlanningLicenseInfo createCustomerPlanningLicenseInfo() {
        return new CustomerPlanningLicenseInfo();
    }

    /**
     * Create an instance of {@link ArrayOfKpiQuery }
     * 
     */
    public ArrayOfKpiQuery createArrayOfKpiQuery() {
        return new ArrayOfKpiQuery();
    }

    /**
     * Create an instance of {@link KpiQueryResult }
     * 
     */
    public KpiQueryResult createKpiQueryResult() {
        return new KpiQueryResult();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiResult }
     * 
     */
    public DataWarehouseKpiResult createDataWarehouseKpiResult() {
        return new DataWarehouseKpiResult();
    }

    /**
     * Create an instance of {@link KpiQueryResults }
     * 
     */
    public KpiQueryResults createKpiQueryResults() {
        return new KpiQueryResults();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiExecutionJobInfo }
     * 
     */
    public DataWarehouseKpiExecutionJobInfo createDataWarehouseKpiExecutionJobInfo() {
        return new DataWarehouseKpiExecutionJobInfo();
    }

    /**
     * Create an instance of {@link DataWarehouseMetadata }
     * 
     */
    public DataWarehouseMetadata createDataWarehouseMetadata() {
        return new DataWarehouseMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfMeasureMetadata }
     * 
     */
    public ArrayOfMeasureMetadata createArrayOfMeasureMetadata() {
        return new ArrayOfMeasureMetadata();
    }

    /**
     * Create an instance of {@link SampleDataGeneratorParameters }
     * 
     */
    public SampleDataGeneratorParameters createSampleDataGeneratorParameters() {
        return new SampleDataGeneratorParameters();
    }

    /**
     * Create an instance of {@link KpiExportParameters }
     * 
     */
    public KpiExportParameters createKpiExportParameters() {
        return new KpiExportParameters();
    }

    /**
     * Create an instance of {@link ArrayOfEquipmentDataSetEncoded }
     * 
     */
    public ArrayOfEquipmentDataSetEncoded createArrayOfEquipmentDataSetEncoded() {
        return new ArrayOfEquipmentDataSetEncoded();
    }

    /**
     * Create an instance of {@link EquipmentDataSetEncoded }
     * 
     */
    public EquipmentDataSetEncoded createEquipmentDataSetEncoded() {
        return new EquipmentDataSetEncoded();
    }

    /**
     * Create an instance of {@link EquipmentInitialState }
     * 
     */
    public EquipmentInitialState createEquipmentInitialState() {
        return new EquipmentInitialState();
    }

    /**
     * Create an instance of {@link X0020XRSDataRetrievalJobParameters }
     * 
     */
    public X0020XRSDataRetrievalJobParameters createX0020XRSDataRetrievalJobParameters() {
        return new X0020XRSDataRetrievalJobParameters();
    }

    /**
     * Create an instance of {@link ArrayOfLocationCommentInfo }
     * 
     */
    public ArrayOfLocationCommentInfo createArrayOfLocationCommentInfo() {
        return new ArrayOfLocationCommentInfo();
    }

    /**
     * Create an instance of {@link LocationCommentInfo }
     * 
     */
    public LocationCommentInfo createLocationCommentInfo() {
        return new LocationCommentInfo();
    }

    /**
     * Create an instance of {@link OrderInfo }
     * 
     */
    public OrderInfo createOrderInfo() {
        return new OrderInfo();
    }

    /**
     * Create an instance of {@link ArrayOfOrderInfoWorkerInfo }
     * 
     */
    public ArrayOfOrderInfoWorkerInfo createArrayOfOrderInfoWorkerInfo() {
        return new ArrayOfOrderInfoWorkerInfo();
    }

    /**
     * Create an instance of {@link OrderInfoWorkerInfo }
     * 
     */
    public OrderInfoWorkerInfo createOrderInfoWorkerInfo() {
        return new OrderInfoWorkerInfo();
    }

    /**
     * Create an instance of {@link KpiExportParametersPropertyOptions }
     * 
     */
    public KpiExportParametersPropertyOptions createKpiExportParametersPropertyOptions() {
        return new KpiExportParametersPropertyOptions();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiExecutionJobResult }
     * 
     */
    public DataWarehouseKpiExecutionJobResult createDataWarehouseKpiExecutionJobResult() {
        return new DataWarehouseKpiExecutionJobResult();
    }

    /**
     * Create an instance of {@link KpiQuery }
     * 
     */
    public KpiQuery createKpiQuery() {
        return new KpiQuery();
    }

    /**
     * Create an instance of {@link Grouping }
     * 
     */
    public Grouping createGrouping() {
        return new Grouping();
    }

    /**
     * Create an instance of {@link IMeasureRule }
     * 
     */
    public IMeasureRule createIMeasureRule() {
        return new IMeasureRule();
    }

    /**
     * Create an instance of {@link CompositeMeasureRuleBase }
     * 
     */
    public CompositeMeasureRuleBase createCompositeMeasureRuleBase() {
        return new CompositeMeasureRuleBase();
    }

    /**
     * Create an instance of {@link ArrayOfIMeasureRule }
     * 
     */
    public ArrayOfIMeasureRule createArrayOfIMeasureRule() {
        return new ArrayOfIMeasureRule();
    }

    /**
     * Create an instance of {@link MeasureRule }
     * 
     */
    public MeasureRule createMeasureRule() {
        return new MeasureRule();
    }

    /**
     * Create an instance of {@link KpiQueryResultItem }
     * 
     */
    public KpiQueryResultItem createKpiQueryResultItem() {
        return new KpiQueryResultItem();
    }

    /**
     * Create an instance of {@link ArrayOfMeasureResultDataPoint }
     * 
     */
    public ArrayOfMeasureResultDataPoint createArrayOfMeasureResultDataPoint() {
        return new ArrayOfMeasureResultDataPoint();
    }

    /**
     * Create an instance of {@link MeasureResultDataPoint }
     * 
     */
    public MeasureResultDataPoint createMeasureResultDataPoint() {
        return new MeasureResultDataPoint();
    }

    /**
     * Create an instance of {@link MeasureResultValuePoint }
     * 
     */
    public MeasureResultValuePoint createMeasureResultValuePoint() {
        return new MeasureResultValuePoint();
    }

    /**
     * Create an instance of {@link MeasureResult }
     * 
     */
    public MeasureResult createMeasureResult() {
        return new MeasureResult();
    }

    /**
     * Create an instance of {@link ArrayOfMeasureResultValuePoint }
     * 
     */
    public ArrayOfMeasureResultValuePoint createArrayOfMeasureResultValuePoint() {
        return new ArrayOfMeasureResultValuePoint();
    }

    /**
     * Create an instance of {@link ArrayOfKpiQueryResultItem }
     * 
     */
    public ArrayOfKpiQueryResultItem createArrayOfKpiQueryResultItem() {
        return new ArrayOfKpiQueryResultItem();
    }

    /**
     * Create an instance of {@link ArrayOfMeasureResult }
     * 
     */
    public ArrayOfMeasureResult createArrayOfMeasureResult() {
        return new ArrayOfMeasureResult();
    }

    /**
     * Create an instance of {@link MeasureMetadata }
     * 
     */
    public MeasureMetadata createMeasureMetadata() {
        return new MeasureMetadata();
    }

    /**
     * Create an instance of {@link MeasureTypeMetadata }
     * 
     */
    public MeasureTypeMetadata createMeasureTypeMetadata() {
        return new MeasureTypeMetadata();
    }

    /**
     * Create an instance of {@link AtomicMeasureTypeMetadata }
     * 
     */
    public AtomicMeasureTypeMetadata createAtomicMeasureTypeMetadata() {
        return new AtomicMeasureTypeMetadata();
    }

    /**
     * Create an instance of {@link CompositeMeasureTypeMetadata }
     * 
     */
    public CompositeMeasureTypeMetadata createCompositeMeasureTypeMetadata() {
        return new CompositeMeasureTypeMetadata();
    }

    /**
     * Create an instance of {@link CustomMeasureTypeMetadata }
     * 
     */
    public CustomMeasureTypeMetadata createCustomMeasureTypeMetadata() {
        return new CustomMeasureTypeMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfSecondaryDimensionMetadata }
     * 
     */
    public ArrayOfSecondaryDimensionMetadata createArrayOfSecondaryDimensionMetadata() {
        return new ArrayOfSecondaryDimensionMetadata();
    }

    /**
     * Create an instance of {@link SecondaryDimensionMetadata }
     * 
     */
    public SecondaryDimensionMetadata createSecondaryDimensionMetadata() {
        return new SecondaryDimensionMetadata();
    }

    /**
     * Create an instance of {@link DimensionMetadata }
     * 
     */
    public DimensionMetadata createDimensionMetadata() {
        return new DimensionMetadata();
    }

    /**
     * Create an instance of {@link BooleanDimensionMetadata }
     * 
     */
    public BooleanDimensionMetadata createBooleanDimensionMetadata() {
        return new BooleanDimensionMetadata();
    }

    /**
     * Create an instance of {@link EnumDimensionMetadata }
     * 
     */
    public EnumDimensionMetadata createEnumDimensionMetadata() {
        return new EnumDimensionMetadata();
    }

    /**
     * Create an instance of {@link NumericDimensionMetadata }
     * 
     */
    public NumericDimensionMetadata createNumericDimensionMetadata() {
        return new NumericDimensionMetadata();
    }

    /**
     * Create an instance of {@link StringDimensionMetadata }
     * 
     */
    public StringDimensionMetadata createStringDimensionMetadata() {
        return new StringDimensionMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfDimensionMetadata }
     * 
     */
    public ArrayOfDimensionMetadata createArrayOfDimensionMetadata() {
        return new ArrayOfDimensionMetadata();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverLogResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "DriverLogResults")
    public JAXBElement<DriverLogResults> createDriverLogResults(DriverLogResults value) {
        return new JAXBElement<DriverLogResults>(_DriverLogResults_QNAME, DriverLogResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDataHistoryEncodedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "EquipmentDataHistoryEncodedResult")
    public JAXBElement<EquipmentDataHistoryEncodedResult> createEquipmentDataHistoryEncodedResult(EquipmentDataHistoryEncodedResult value) {
        return new JAXBElement<EquipmentDataHistoryEncodedResult>(_EquipmentDataHistoryEncodedResult_QNAME, EquipmentDataHistoryEncodedResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDataSetEncoded }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "ArrayOfEquipmentDataSetEncoded")
    public JAXBElement<ArrayOfEquipmentDataSetEncoded> createArrayOfEquipmentDataSetEncoded(ArrayOfEquipmentDataSetEncoded value) {
        return new JAXBElement<ArrayOfEquipmentDataSetEncoded>(_ArrayOfEquipmentDataSetEncoded_QNAME, ArrayOfEquipmentDataSetEncoded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDataSetEncoded }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "EquipmentDataSetEncoded")
    public JAXBElement<EquipmentDataSetEncoded> createEquipmentDataSetEncoded(EquipmentDataSetEncoded value) {
        return new JAXBElement<EquipmentDataSetEncoded>(_EquipmentDataSetEncoded_QNAME, EquipmentDataSetEncoded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentInitialState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "EquipmentInitialState")
    public JAXBElement<EquipmentInitialState> createEquipmentInitialState(EquipmentInitialState value) {
        return new JAXBElement<EquipmentInitialState>(_EquipmentInitialState_QNAME, EquipmentInitialState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveStopTemplateResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "RetrieveStopTemplateResults")
    public JAXBElement<RetrieveStopTemplateResults> createRetrieveStopTemplateResults(RetrieveStopTemplateResults value) {
        return new JAXBElement<RetrieveStopTemplateResults>(_RetrieveStopTemplateResults_QNAME, RetrieveStopTemplateResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceableStopTemplateRetrievalOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "ServiceableStopTemplateRetrievalOptions")
    public JAXBElement<ServiceableStopTemplateRetrievalOptions> createServiceableStopTemplateRetrievalOptions(ServiceableStopTemplateRetrievalOptions value) {
        return new JAXBElement<ServiceableStopTemplateRetrievalOptions>(_ServiceableStopTemplateRetrievalOptions_QNAME, ServiceableStopTemplateRetrievalOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X0020XRSDataRetrievalJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "_x0020_XRSDataRetrievalJobParameters")
    public JAXBElement<X0020XRSDataRetrievalJobParameters> createX0020XRSDataRetrievalJobParameters(X0020XRSDataRetrievalJobParameters value) {
        return new JAXBElement<X0020XRSDataRetrievalJobParameters>(_X0020XRSDataRetrievalJobParameters_QNAME, X0020XRSDataRetrievalJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DVIRRetrievalJobParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "DVIRRetrievalJobParameters")
    public JAXBElement<DVIRRetrievalJobParameters> createDVIRRetrievalJobParameters(DVIRRetrievalJobParameters value) {
        return new JAXBElement<DVIRRetrievalJobParameters>(_DVIRRetrievalJobParameters_QNAME, DVIRRetrievalJobParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextOrPreviousRouteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "GetNextOrPreviousRouteOptions")
    public JAXBElement<GetNextOrPreviousRouteOptions> createGetNextOrPreviousRouteOptions(GetNextOrPreviousRouteOptions value) {
        return new JAXBElement<GetNextOrPreviousRouteOptions>(_GetNextOrPreviousRouteOptions_QNAME, GetNextOrPreviousRouteOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCommentResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "LocationCommentResults")
    public JAXBElement<LocationCommentResults> createLocationCommentResults(LocationCommentResults value) {
        return new JAXBElement<LocationCommentResults>(_LocationCommentResults_QNAME, LocationCommentResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationCommentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "ArrayOfLocationCommentInfo")
    public JAXBElement<ArrayOfLocationCommentInfo> createArrayOfLocationCommentInfo(ArrayOfLocationCommentInfo value) {
        return new JAXBElement<ArrayOfLocationCommentInfo>(_ArrayOfLocationCommentInfo_QNAME, ArrayOfLocationCommentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCommentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "LocationCommentInfo")
    public JAXBElement<LocationCommentInfo> createLocationCommentInfo(LocationCommentInfo value) {
        return new JAXBElement<LocationCommentInfo>(_LocationCommentInfo_QNAME, LocationCommentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "ArrayOfOrderInfo")
    public JAXBElement<ArrayOfOrderInfo> createArrayOfOrderInfo(ArrayOfOrderInfo value) {
        return new JAXBElement<ArrayOfOrderInfo>(_ArrayOfOrderInfo_QNAME, ArrayOfOrderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "OrderInfo")
    public JAXBElement<OrderInfo> createOrderInfo(OrderInfo value) {
        return new JAXBElement<OrderInfo>(_OrderInfo_QNAME, OrderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderInfoWorkerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "ArrayOfOrderInfo.WorkerInfo")
    public JAXBElement<ArrayOfOrderInfoWorkerInfo> createArrayOfOrderInfoWorkerInfo(ArrayOfOrderInfoWorkerInfo value) {
        return new JAXBElement<ArrayOfOrderInfoWorkerInfo>(_ArrayOfOrderInfoWorkerInfo_QNAME, ArrayOfOrderInfoWorkerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfoWorkerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "OrderInfo.WorkerInfo")
    public JAXBElement<OrderInfoWorkerInfo> createOrderInfoWorkerInfo(OrderInfoWorkerInfo value) {
        return new JAXBElement<OrderInfoWorkerInfo>(_OrderInfoWorkerInfo_QNAME, OrderInfoWorkerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalRetrieveEquipmentDataHistoryEncodedOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "InternalRetrieveEquipmentDataHistoryEncodedOptions")
    public JAXBElement<InternalRetrieveEquipmentDataHistoryEncodedOptions> createInternalRetrieveEquipmentDataHistoryEncodedOptions(InternalRetrieveEquipmentDataHistoryEncodedOptions value) {
        return new JAXBElement<InternalRetrieveEquipmentDataHistoryEncodedOptions>(_InternalRetrieveEquipmentDataHistoryEncodedOptions_QNAME, InternalRetrieveEquipmentDataHistoryEncodedOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePositionHistoryReportOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "RetrievePositionHistoryReportOptions")
    public JAXBElement<RetrievePositionHistoryReportOptions> createRetrievePositionHistoryReportOptions(RetrievePositionHistoryReportOptions value) {
        return new JAXBElement<RetrievePositionHistoryReportOptions>(_RetrievePositionHistoryReportOptions_QNAME, RetrievePositionHistoryReportOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupEquipmentOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "LookupEquipmentOptions")
    public JAXBElement<LookupEquipmentOptions> createLookupEquipmentOptions(LookupEquipmentOptions value) {
        return new JAXBElement<LookupEquipmentOptions>(_LookupEquipmentOptions_QNAME, LookupEquipmentOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupEquipmentResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "LookupEquipmentResult")
    public JAXBElement<LookupEquipmentResult> createLookupEquipmentResult(LookupEquipmentResult value) {
        return new JAXBElement<LookupEquipmentResult>(_LookupEquipmentResult_QNAME, LookupEquipmentResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPlanningLicenseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "CustomerPlanningLicenseInfo")
    public JAXBElement<CustomerPlanningLicenseInfo> createCustomerPlanningLicenseInfo(CustomerPlanningLicenseInfo value) {
        return new JAXBElement<CustomerPlanningLicenseInfo>(_CustomerPlanningLicenseInfo_QNAME, CustomerPlanningLicenseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteServicePatternAnalyzerParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.ServicePatternAnalyzer", name = "ExecuteServicePatternAnalyzerParameters")
    public JAXBElement<ExecuteServicePatternAnalyzerParameters> createExecuteServicePatternAnalyzerParameters(ExecuteServicePatternAnalyzerParameters value) {
        return new JAXBElement<ExecuteServicePatternAnalyzerParameters>(_ExecuteServicePatternAnalyzerParameters_QNAME, ExecuteServicePatternAnalyzerParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "MeasureUnitType")
    public JAXBElement<MeasureUnitType> createMeasureUnitType(MeasureUnitType value) {
        return new JAXBElement<MeasureUnitType>(_MeasureUnitType_QNAME, MeasureUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondaryDimensionLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "SecondaryDimensionLevel")
    public JAXBElement<SecondaryDimensionLevel> createSecondaryDimensionLevel(SecondaryDimensionLevel value) {
        return new JAXBElement<SecondaryDimensionLevel>(_SecondaryDimensionLevel_QNAME, SecondaryDimensionLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "TimeRangeType")
    public JAXBElement<TimeRangeType> createTimeRangeType(TimeRangeType value) {
        return new JAXBElement<TimeRangeType>(_TimeRangeType_QNAME, TimeRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiExecutionJobInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWarehouseKpiExecutionJobInfo")
    public JAXBElement<DataWarehouseKpiExecutionJobInfo> createDataWarehouseKpiExecutionJobInfo(DataWarehouseKpiExecutionJobInfo value) {
        return new JAXBElement<DataWarehouseKpiExecutionJobInfo>(_DataWarehouseKpiExecutionJobInfo_QNAME, DataWarehouseKpiExecutionJobInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiQueryResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiQueryResults")
    public JAXBElement<KpiQueryResults> createKpiQueryResults(KpiQueryResults value) {
        return new JAXBElement<KpiQueryResults>(_KpiQueryResults_QNAME, KpiQueryResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiExportParametersPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiExportParametersPropertyOptions")
    public JAXBElement<KpiExportParametersPropertyOptions> createKpiExportParametersPropertyOptions(KpiExportParametersPropertyOptions value) {
        return new JAXBElement<KpiExportParametersPropertyOptions>(_KpiExportParametersPropertyOptions_QNAME, KpiExportParametersPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiExecutionJobResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWarehouseKpiExecutionJobResult")
    public JAXBElement<DataWarehouseKpiExecutionJobResult> createDataWarehouseKpiExecutionJobResult(DataWarehouseKpiExecutionJobResult value) {
        return new JAXBElement<DataWarehouseKpiExecutionJobResult>(_DataWarehouseKpiExecutionJobResult_QNAME, DataWarehouseKpiExecutionJobResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWarehouseKpiResult")
    public JAXBElement<DataWarehouseKpiResult> createDataWarehouseKpiResult(DataWarehouseKpiResult value) {
        return new JAXBElement<DataWarehouseKpiResult>(_DataWarehouseKpiResult_QNAME, DataWarehouseKpiResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiExportParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiExportParameters")
    public JAXBElement<KpiExportParameters> createKpiExportParameters(KpiExportParameters value) {
        return new JAXBElement<KpiExportParameters>(_KpiExportParameters_QNAME, KpiExportParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiQuery")
    public JAXBElement<KpiQuery> createKpiQuery(KpiQuery value) {
        return new JAXBElement<KpiQuery>(_KpiQuery_QNAME, KpiQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Grouping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Grouping")
    public JAXBElement<Grouping> createGrouping(Grouping value) {
        return new JAXBElement<Grouping>(_Grouping_QNAME, Grouping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMeasureRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "IMeasureRule")
    public JAXBElement<IMeasureRule> createIMeasureRule(IMeasureRule value) {
        return new JAXBElement<IMeasureRule>(_IMeasureRule_QNAME, IMeasureRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeMeasureRuleBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "CompositeMeasureRuleBase")
    public JAXBElement<CompositeMeasureRuleBase> createCompositeMeasureRuleBase(CompositeMeasureRuleBase value) {
        return new JAXBElement<CompositeMeasureRuleBase>(_CompositeMeasureRuleBase_QNAME, CompositeMeasureRuleBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIMeasureRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ArrayOfIMeasureRule")
    public JAXBElement<ArrayOfIMeasureRule> createArrayOfIMeasureRule(ArrayOfIMeasureRule value) {
        return new JAXBElement<ArrayOfIMeasureRule>(_ArrayOfIMeasureRule_QNAME, ArrayOfIMeasureRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "MeasureRule")
    public JAXBElement<MeasureRule> createMeasureRule(MeasureRule value) {
        return new JAXBElement<MeasureRule>(_MeasureRule_QNAME, MeasureRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiQueryResultItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiQueryResultItem")
    public JAXBElement<KpiQueryResultItem> createKpiQueryResultItem(KpiQueryResultItem value) {
        return new JAXBElement<KpiQueryResultItem>(_KpiQueryResultItem_QNAME, KpiQueryResultItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeasureResultDataPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ArrayOfMeasureResultDataPoint")
    public JAXBElement<ArrayOfMeasureResultDataPoint> createArrayOfMeasureResultDataPoint(ArrayOfMeasureResultDataPoint value) {
        return new JAXBElement<ArrayOfMeasureResultDataPoint>(_ArrayOfMeasureResultDataPoint_QNAME, ArrayOfMeasureResultDataPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureResultDataPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "MeasureResultDataPoint")
    public JAXBElement<MeasureResultDataPoint> createMeasureResultDataPoint(MeasureResultDataPoint value) {
        return new JAXBElement<MeasureResultDataPoint>(_MeasureResultDataPoint_QNAME, MeasureResultDataPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureResultValuePoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "MeasureResultValuePoint")
    public JAXBElement<MeasureResultValuePoint> createMeasureResultValuePoint(MeasureResultValuePoint value) {
        return new JAXBElement<MeasureResultValuePoint>(_MeasureResultValuePoint_QNAME, MeasureResultValuePoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "MeasureResult")
    public JAXBElement<MeasureResult> createMeasureResult(MeasureResult value) {
        return new JAXBElement<MeasureResult>(_MeasureResult_QNAME, MeasureResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeasureResultValuePoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ArrayOfMeasureResultValuePoint")
    public JAXBElement<ArrayOfMeasureResultValuePoint> createArrayOfMeasureResultValuePoint(ArrayOfMeasureResultValuePoint value) {
        return new JAXBElement<ArrayOfMeasureResultValuePoint>(_ArrayOfMeasureResultValuePoint_QNAME, ArrayOfMeasureResultValuePoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKpiQueryResultItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ArrayOfKpiQueryResultItem")
    public JAXBElement<ArrayOfKpiQueryResultItem> createArrayOfKpiQueryResultItem(ArrayOfKpiQueryResultItem value) {
        return new JAXBElement<ArrayOfKpiQueryResultItem>(_ArrayOfKpiQueryResultItem_QNAME, ArrayOfKpiQueryResultItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKpiQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ArrayOfKpiQuery")
    public JAXBElement<ArrayOfKpiQuery> createArrayOfKpiQuery(ArrayOfKpiQuery value) {
        return new JAXBElement<ArrayOfKpiQuery>(_ArrayOfKpiQuery_QNAME, ArrayOfKpiQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiQueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiQueryResult")
    public JAXBElement<KpiQueryResult> createKpiQueryResult(KpiQueryResult value) {
        return new JAXBElement<KpiQueryResult>(_KpiQueryResult_QNAME, KpiQueryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeasureResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ArrayOfMeasureResult")
    public JAXBElement<ArrayOfMeasureResult> createArrayOfMeasureResult(ArrayOfMeasureResult value) {
        return new JAXBElement<ArrayOfMeasureResult>(_ArrayOfMeasureResult_QNAME, ArrayOfMeasureResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWarehouseMetadata")
    public JAXBElement<DataWarehouseMetadata> createDataWarehouseMetadata(DataWarehouseMetadata value) {
        return new JAXBElement<DataWarehouseMetadata>(_DataWarehouseMetadata_QNAME, DataWarehouseMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeasureMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ArrayOfMeasureMetadata")
    public JAXBElement<ArrayOfMeasureMetadata> createArrayOfMeasureMetadata(ArrayOfMeasureMetadata value) {
        return new JAXBElement<ArrayOfMeasureMetadata>(_ArrayOfMeasureMetadata_QNAME, ArrayOfMeasureMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "MeasureMetadata")
    public JAXBElement<MeasureMetadata> createMeasureMetadata(MeasureMetadata value) {
        return new JAXBElement<MeasureMetadata>(_MeasureMetadata_QNAME, MeasureMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureTypeMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "MeasureTypeMetadata")
    public JAXBElement<MeasureTypeMetadata> createMeasureTypeMetadata(MeasureTypeMetadata value) {
        return new JAXBElement<MeasureTypeMetadata>(_MeasureTypeMetadata_QNAME, MeasureTypeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomicMeasureTypeMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "AtomicMeasureTypeMetadata")
    public JAXBElement<AtomicMeasureTypeMetadata> createAtomicMeasureTypeMetadata(AtomicMeasureTypeMetadata value) {
        return new JAXBElement<AtomicMeasureTypeMetadata>(_AtomicMeasureTypeMetadata_QNAME, AtomicMeasureTypeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeMeasureTypeMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "CompositeMeasureTypeMetadata")
    public JAXBElement<CompositeMeasureTypeMetadata> createCompositeMeasureTypeMetadata(CompositeMeasureTypeMetadata value) {
        return new JAXBElement<CompositeMeasureTypeMetadata>(_CompositeMeasureTypeMetadata_QNAME, CompositeMeasureTypeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomMeasureTypeMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "CustomMeasureTypeMetadata")
    public JAXBElement<CustomMeasureTypeMetadata> createCustomMeasureTypeMetadata(CustomMeasureTypeMetadata value) {
        return new JAXBElement<CustomMeasureTypeMetadata>(_CustomMeasureTypeMetadata_QNAME, CustomMeasureTypeMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSecondaryDimensionMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ArrayOfSecondaryDimensionMetadata")
    public JAXBElement<ArrayOfSecondaryDimensionMetadata> createArrayOfSecondaryDimensionMetadata(ArrayOfSecondaryDimensionMetadata value) {
        return new JAXBElement<ArrayOfSecondaryDimensionMetadata>(_ArrayOfSecondaryDimensionMetadata_QNAME, ArrayOfSecondaryDimensionMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondaryDimensionMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "SecondaryDimensionMetadata")
    public JAXBElement<SecondaryDimensionMetadata> createSecondaryDimensionMetadata(SecondaryDimensionMetadata value) {
        return new JAXBElement<SecondaryDimensionMetadata>(_SecondaryDimensionMetadata_QNAME, SecondaryDimensionMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DimensionMetadata")
    public JAXBElement<DimensionMetadata> createDimensionMetadata(DimensionMetadata value) {
        return new JAXBElement<DimensionMetadata>(_DimensionMetadata_QNAME, DimensionMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanDimensionMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "BooleanDimensionMetadata")
    public JAXBElement<BooleanDimensionMetadata> createBooleanDimensionMetadata(BooleanDimensionMetadata value) {
        return new JAXBElement<BooleanDimensionMetadata>(_BooleanDimensionMetadata_QNAME, BooleanDimensionMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumDimensionMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "EnumDimensionMetadata")
    public JAXBElement<EnumDimensionMetadata> createEnumDimensionMetadata(EnumDimensionMetadata value) {
        return new JAXBElement<EnumDimensionMetadata>(_EnumDimensionMetadata_QNAME, EnumDimensionMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumericDimensionMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "NumericDimensionMetadata")
    public JAXBElement<NumericDimensionMetadata> createNumericDimensionMetadata(NumericDimensionMetadata value) {
        return new JAXBElement<NumericDimensionMetadata>(_NumericDimensionMetadata_QNAME, NumericDimensionMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringDimensionMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "StringDimensionMetadata")
    public JAXBElement<StringDimensionMetadata> createStringDimensionMetadata(StringDimensionMetadata value) {
        return new JAXBElement<StringDimensionMetadata>(_StringDimensionMetadata_QNAME, StringDimensionMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ArrayOfDimensionMetadata")
    public JAXBElement<ArrayOfDimensionMetadata> createArrayOfDimensionMetadata(ArrayOfDimensionMetadata value) {
        return new JAXBElement<ArrayOfDimensionMetadata>(_ArrayOfDimensionMetadata_QNAME, ArrayOfDimensionMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleDataGeneratorParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "SampleDataGeneratorParameters")
    public JAXBElement<SampleDataGeneratorParameters> createSampleDataGeneratorParameters(SampleDataGeneratorParameters value) {
        return new JAXBElement<SampleDataGeneratorParameters>(_SampleDataGeneratorParameters_QNAME, SampleDataGeneratorParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIMeasureRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Rules", scope = CompositeMeasureRuleBase.class)
    public JAXBElement<ArrayOfIMeasureRule> createCompositeMeasureRuleBaseRules(ArrayOfIMeasureRule value) {
        return new JAXBElement<ArrayOfIMeasureRule>(_CompositeMeasureRuleBaseRules_QNAME, ArrayOfIMeasureRule.class, CompositeMeasureRuleBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Name", scope = StringDimensionMetadata.class)
    public JAXBElement<String> createStringDimensionMetadataName(String value) {
        return new JAXBElement<String>(_StringDimensionMetadataName_QNAME, String.class, StringDimensionMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Max", scope = NumericDimensionMetadata.class)
    public JAXBElement<Double> createNumericDimensionMetadataMax(Double value) {
        return new JAXBElement<Double>(_NumericDimensionMetadataMax_QNAME, Double.class, NumericDimensionMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Min", scope = NumericDimensionMetadata.class)
    public JAXBElement<Double> createNumericDimensionMetadataMin(Double value) {
        return new JAXBElement<Double>(_NumericDimensionMetadataMin_QNAME, Double.class, NumericDimensionMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Name", scope = NumericDimensionMetadata.class)
    public JAXBElement<String> createNumericDimensionMetadataName(String value) {
        return new JAXBElement<String>(_StringDimensionMetadataName_QNAME, String.class, NumericDimensionMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Precision", scope = NumericDimensionMetadata.class)
    public JAXBElement<Integer> createNumericDimensionMetadataPrecision(Integer value) {
        return new JAXBElement<Integer>(_NumericDimensionMetadataPrecision_QNAME, Integer.class, NumericDimensionMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Name", scope = EnumDimensionMetadata.class)
    public JAXBElement<String> createEnumDimensionMetadataName(String value) {
        return new JAXBElement<String>(_StringDimensionMetadataName_QNAME, String.class, EnumDimensionMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Name", scope = BooleanDimensionMetadata.class)
    public JAXBElement<String> createBooleanDimensionMetadataName(String value) {
        return new JAXBElement<String>(_StringDimensionMetadataName_QNAME, String.class, BooleanDimensionMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Attributes", scope = SecondaryDimensionMetadata.class)
    public JAXBElement<ArrayOfDimensionMetadata> createSecondaryDimensionMetadataAttributes(ArrayOfDimensionMetadata value) {
        return new JAXBElement<ArrayOfDimensionMetadata>(_SecondaryDimensionMetadataAttributes_QNAME, ArrayOfDimensionMetadata.class, SecondaryDimensionMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "MeasureName", scope = CustomMeasureTypeMetadata.class)
    public JAXBElement<String> createCustomMeasureTypeMetadataMeasureName(String value) {
        return new JAXBElement<String>(_CustomMeasureTypeMetadataMeasureName_QNAME, String.class, CustomMeasureTypeMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "CompositeMeasure", scope = CompositeMeasureTypeMetadata.class)
    public JAXBElement<CompositeMeasure> createCompositeMeasureTypeMetadataCompositeMeasure(CompositeMeasure value) {
        return new JAXBElement<CompositeMeasure>(_CompositeMeasureTypeMetadataCompositeMeasure_QNAME, CompositeMeasure.class, CompositeMeasureTypeMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWarehouseMeasureUsageOptions_Options", scope = MeasureMetadata.class)
    public JAXBElement<String> createMeasureMetadataDataWarehouseMeasureUsageOptionsOptions(String value) {
        return new JAXBElement<String>(_MeasureMetadataDataWarehouseMeasureUsageOptionsOptions_QNAME, String.class, MeasureMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureTypeMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "MeasureTypeMetadata", scope = MeasureMetadata.class)
    public JAXBElement<MeasureTypeMetadata> createMeasureMetadataMeasureTypeMetadata(MeasureTypeMetadata value) {
        return new JAXBElement<MeasureTypeMetadata>(_MeasureTypeMetadata_QNAME, MeasureTypeMetadata.class, MeasureMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseSecondaryDimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "SecondaryDimensions", scope = MeasureMetadata.class)
    public JAXBElement<ArrayOfDataWarehouseSecondaryDimensionType> createMeasureMetadataSecondaryDimensions(ArrayOfDataWarehouseSecondaryDimensionType value) {
        return new JAXBElement<ArrayOfDataWarehouseSecondaryDimensionType>(_MeasureMetadataSecondaryDimensions_QNAME, ArrayOfDataWarehouseSecondaryDimensionType.class, MeasureMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeasureResultDataPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataPoints", scope = MeasureResult.class)
    public JAXBElement<ArrayOfMeasureResultDataPoint> createMeasureResultDataPoints(ArrayOfMeasureResultDataPoint value) {
        return new JAXBElement<ArrayOfMeasureResultDataPoint>(_MeasureResultDataPoints_QNAME, ArrayOfMeasureResultDataPoint.class, MeasureResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWithoutFeatureExcluded", scope = MeasureResult.class)
    public JAXBElement<Boolean> createMeasureResultDataWithoutFeatureExcluded(Boolean value) {
        return new JAXBElement<Boolean>(_MeasureResultDataWithoutFeatureExcluded_QNAME, Boolean.class, MeasureResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ListOfMeasureUnitType_UnitTypes", scope = MeasureResult.class)
    public JAXBElement<ArrayOfstring> createMeasureResultListOfMeasureUnitTypeUnitTypes(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_MeasureResultListOfMeasureUnitTypeUnitTypes_QNAME, ArrayOfstring.class, MeasureResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Measure", scope = MeasureResult.class)
    public JAXBElement<IMeasure> createMeasureResultMeasure(IMeasure value) {
        return new JAXBElement<IMeasure>(_MeasureResultMeasure_QNAME, IMeasure.class, MeasureResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "OperationsUnitAncestors", scope = MeasureResult.class)
    public JAXBElement<ArrayOflong> createMeasureResultOperationsUnitAncestors(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MeasureResultOperationsUnitAncestors_QNAME, ArrayOflong.class, MeasureResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseResourceEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWarehouseResourceEvent", scope = MeasureResultDataPoint.class)
    public JAXBElement<DataWarehouseResourceEvent> createMeasureResultDataPointDataWarehouseResourceEvent(DataWarehouseResourceEvent value) {
        return new JAXBElement<DataWarehouseResourceEvent>(_MeasureResultDataPointDataWarehouseResourceEvent_QNAME, DataWarehouseResourceEvent.class, MeasureResultDataPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DimensionDetails", scope = MeasureResultDataPoint.class)
    public JAXBElement<ArrayOfDimensionDetail> createMeasureResultDataPointDimensionDetails(ArrayOfDimensionDetail value) {
        return new JAXBElement<ArrayOfDimensionDetail>(_MeasureResultDataPointDimensionDetails_QNAME, ArrayOfDimensionDetail.class, MeasureResultDataPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseRouteData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "RouteData", scope = MeasureResultDataPoint.class)
    public JAXBElement<DataWarehouseRouteData> createMeasureResultDataPointRouteData(DataWarehouseRouteData value) {
        return new JAXBElement<DataWarehouseRouteData>(_MeasureResultDataPointRouteData_QNAME, DataWarehouseRouteData.class, MeasureResultDataPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "RouteInternalKey", scope = MeasureResultDataPoint.class)
    public JAXBElement<Long> createMeasureResultDataPointRouteInternalKey(Long value) {
        return new JAXBElement<Long>(_MeasureResultDataPointRouteInternalKey_QNAME, Long.class, MeasureResultDataPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "StopHeader", scope = MeasureResultDataPoint.class)
    public JAXBElement<DataWarehouseStop> createMeasureResultDataPointStopHeader(DataWarehouseStop value) {
        return new JAXBElement<DataWarehouseStop>(_MeasureResultDataPointStopHeader_QNAME, DataWarehouseStop.class, MeasureResultDataPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTimeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Time", scope = MeasureResultDataPoint.class)
    public JAXBElement<DataWarehouseTimeDimension> createMeasureResultDataPointTime(DataWarehouseTimeDimension value) {
        return new JAXBElement<DataWarehouseTimeDimension>(_MeasureResultDataPointTime_QNAME, DataWarehouseTimeDimension.class, MeasureResultDataPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeasureResultValuePoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Values", scope = MeasureResultDataPoint.class)
    public JAXBElement<ArrayOfMeasureResultValuePoint> createMeasureResultDataPointValues(ArrayOfMeasureResultValuePoint value) {
        return new JAXBElement<ArrayOfMeasureResultValuePoint>(_MeasureResultDataPointValues_QNAME, ArrayOfMeasureResultValuePoint.class, MeasureResultDataPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeasureResultDataPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataPoints", scope = KpiQueryResultItem.class)
    public JAXBElement<ArrayOfMeasureResultDataPoint> createKpiQueryResultItemDataPoints(ArrayOfMeasureResultDataPoint value) {
        return new JAXBElement<ArrayOfMeasureResultDataPoint>(_MeasureResultDataPoints_QNAME, ArrayOfMeasureResultDataPoint.class, KpiQueryResultItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWithoutFeatureExcluded", scope = KpiQueryResultItem.class)
    public JAXBElement<Boolean> createKpiQueryResultItemDataWithoutFeatureExcluded(Boolean value) {
        return new JAXBElement<Boolean>(_MeasureResultDataWithoutFeatureExcluded_QNAME, Boolean.class, KpiQueryResultItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ListOfMeasureUnitType_UnitTypes", scope = KpiQueryResultItem.class)
    public JAXBElement<ArrayOfstring> createKpiQueryResultItemListOfMeasureUnitTypeUnitTypes(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_MeasureResultListOfMeasureUnitTypeUnitTypes_QNAME, ArrayOfstring.class, KpiQueryResultItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Measure", scope = KpiQueryResultItem.class)
    public JAXBElement<IMeasure> createKpiQueryResultItemMeasure(IMeasure value) {
        return new JAXBElement<IMeasure>(_MeasureResultMeasure_QNAME, IMeasure.class, KpiQueryResultItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "OperationsUnitAncestors", scope = KpiQueryResultItem.class)
    public JAXBElement<ArrayOflong> createKpiQueryResultItemOperationsUnitAncestors(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_MeasureResultOperationsUnitAncestors_QNAME, ArrayOflong.class, KpiQueryResultItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Criteria", scope = MeasureRule.class)
    public JAXBElement<SimpleExpressionBase> createMeasureRuleCriteria(SimpleExpressionBase value) {
        return new JAXBElement<SimpleExpressionBase>(_MeasureRuleCriteria_QNAME, SimpleExpressionBase.class, MeasureRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Measure", scope = MeasureRule.class)
    public JAXBElement<IMeasure> createMeasureRuleMeasure(IMeasure value) {
        return new JAXBElement<IMeasure>(_MeasureResultMeasure_QNAME, IMeasure.class, MeasureRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionDescriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DimensionDescribers", scope = Grouping.class)
    public JAXBElement<ArrayOfDimensionDescriber> createGroupingDimensionDescribers(ArrayOfDimensionDescriber value) {
        return new JAXBElement<ArrayOfDimensionDescriber>(_GroupingDimensionDescribers_QNAME, ArrayOfDimensionDescriber.class, Grouping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataPointsLimiter", scope = KpiQuery.class)
    public JAXBElement<Integer> createKpiQueryDataPointsLimiter(Integer value) {
        return new JAXBElement<Integer>(_KpiQueryDataPointsLimiter_QNAME, Integer.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWarehouseDataPointsLimiterSettings_DataPointsLimiterSetting", scope = KpiQuery.class)
    public JAXBElement<String> createKpiQueryDataWarehouseDataPointsLimiterSettingsDataPointsLimiterSetting(String value) {
        return new JAXBElement<String>(_KpiQueryDataWarehouseDataPointsLimiterSettingsDataPointsLimiterSetting_QNAME, String.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWarehouseKpiSortingOptions_SortByType_SortBy", scope = KpiQuery.class)
    public JAXBElement<String> createKpiQueryDataWarehouseKpiSortingOptionsSortByTypeSortBy(String value) {
        return new JAXBElement<String>(_KpiQueryDataWarehouseKpiSortingOptionsSortByTypeSortBy_QNAME, String.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWarehouseKpiSortingOptions_SortOrderType_SortOrder", scope = KpiQuery.class)
    public JAXBElement<String> createKpiQueryDataWarehouseKpiSortingOptionsSortOrderTypeSortOrder(String value) {
        return new JAXBElement<String>(_KpiQueryDataWarehouseKpiSortingOptionsSortOrderTypeSortOrder_QNAME, String.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWarehouseRuleAction_RuleAction", scope = KpiQuery.class)
    public JAXBElement<String> createKpiQueryDataWarehouseRuleActionRuleAction(String value) {
        return new JAXBElement<String>(_KpiQueryDataWarehouseRuleActionRuleAction_QNAME, String.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "FirstDateInDateRange", scope = KpiQuery.class)
    public JAXBElement<XMLGregorianCalendar> createKpiQueryFirstDateInDateRange(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KpiQueryFirstDateInDateRange_QNAME, XMLGregorianCalendar.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Grouping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Groupings", scope = KpiQuery.class)
    public JAXBElement<Grouping> createKpiQueryGroupings(Grouping value) {
        return new JAXBElement<Grouping>(_KpiQueryGroupings_QNAME, Grouping.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "LastDateInDateRange", scope = KpiQuery.class)
    public JAXBElement<XMLGregorianCalendar> createKpiQueryLastDateInDateRange(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_KpiQueryLastDateInDateRange_QNAME, XMLGregorianCalendar.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Measure", scope = KpiQuery.class)
    public JAXBElement<IMeasure> createKpiQueryMeasure(IMeasure value) {
        return new JAXBElement<IMeasure>(_MeasureResultMeasure_QNAME, IMeasure.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "MeasureUnitOptions", scope = KpiQuery.class)
    public JAXBElement<MeasureUnitOptions> createKpiQueryMeasureUnitOptions(MeasureUnitOptions value) {
        return new JAXBElement<MeasureUnitOptions>(_KpiQueryMeasureUnitOptions_QNAME, MeasureUnitOptions.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "OperationsUnitAncestorEntityKeys", scope = KpiQuery.class)
    public JAXBElement<ArrayOflong> createKpiQueryOperationsUnitAncestorEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_KpiQueryOperationsUnitAncestorEntityKeys_QNAME, ArrayOflong.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMeasureRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Rule", scope = KpiQuery.class)
    public JAXBElement<IMeasureRule> createKpiQueryRule(IMeasureRule value) {
        return new JAXBElement<IMeasureRule>(_KpiQueryRule_QNAME, IMeasureRule.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Grouping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "RuleLevel", scope = KpiQuery.class)
    public JAXBElement<Grouping> createKpiQueryRuleLevel(Grouping value) {
        return new JAXBElement<Grouping>(_KpiQueryRuleLevel_QNAME, Grouping.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "TimeRangeType_TimeRangeToUse", scope = KpiQuery.class)
    public JAXBElement<String> createKpiQueryTimeRangeTypeTimeRangeToUse(String value) {
        return new JAXBElement<String>(_KpiQueryTimeRangeTypeTimeRangeToUse_QNAME, String.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "TimeUnit_TimeUnitTypeInBeforeTodayRange", scope = KpiQuery.class)
    public JAXBElement<String> createKpiQueryTimeUnitTimeUnitTypeInBeforeTodayRange(String value) {
        return new JAXBElement<String>(_KpiQueryTimeUnitTimeUnitTypeInBeforeTodayRange_QNAME, String.class, KpiQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiQueryResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiQueryResults", scope = DataWarehouseKpiExecutionJobResult.class)
    public JAXBElement<KpiQueryResults> createDataWarehouseKpiExecutionJobResultKpiQueryResults(KpiQueryResults value) {
        return new JAXBElement<KpiQueryResults>(_KpiQueryResults_QNAME, KpiQueryResults.class, DataWarehouseKpiExecutionJobResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiResult", scope = DataWarehouseKpiExecutionJobResult.class)
    public JAXBElement<DataWarehouseKpiResult> createDataWarehouseKpiExecutionJobResultKpiResult(DataWarehouseKpiResult value) {
        return new JAXBElement<DataWarehouseKpiResult>(_DataWarehouseKpiExecutionJobResultKpiResult_QNAME, DataWarehouseKpiResult.class, DataWarehouseKpiExecutionJobResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "Name", scope = OrderInfoWorkerInfo.class)
    public JAXBElement<PersonName> createOrderInfoWorkerInfoName(PersonName value) {
        return new JAXBElement<PersonName>(_OrderInfoWorkerInfoName_QNAME, PersonName.class, OrderInfoWorkerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "CancelledDate", scope = OrderInfo.class)
    public JAXBElement<XMLGregorianCalendar> createOrderInfoCancelledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderInfoCancelledDate_QNAME, XMLGregorianCalendar.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "Consignee", scope = OrderInfo.class)
    public JAXBElement<String> createOrderInfoConsignee(String value) {
        return new JAXBElement<String>(_OrderInfoConsignee_QNAME, String.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "DeliveryQuantities", scope = OrderInfo.class)
    public JAXBElement<Quantities> createOrderInfoDeliveryQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_OrderInfoDeliveryQuantities_QNAME, Quantities.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "DepartureTime", scope = OrderInfo.class)
    public JAXBElement<QualityPairedDateTime> createOrderInfoDepartureTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_OrderInfoDepartureTime_QNAME, QualityPairedDateTime.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "Identifier", scope = OrderInfo.class)
    public JAXBElement<String> createOrderInfoIdentifier(String value) {
        return new JAXBElement<String>(_OrderInfoIdentifier_QNAME, String.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "LastKnownDistance", scope = OrderInfo.class)
    public JAXBElement<Distance> createOrderInfoLastKnownDistance(Distance value) {
        return new JAXBElement<Distance>(_OrderInfoLastKnownDistance_QNAME, Distance.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "LastKnownPosition", scope = OrderInfo.class)
    public JAXBElement<Coordinate> createOrderInfoLastKnownPosition(Coordinate value) {
        return new JAXBElement<Coordinate>(_OrderInfoLastKnownPosition_QNAME, Coordinate.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "OrderCustomProperties", scope = OrderInfo.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createOrderInfoOrderCustomProperties(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_OrderInfoOrderCustomProperties_QNAME, ArrayOfKeyValueOfstringanyType.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "PickupQuantities", scope = OrderInfo.class)
    public JAXBElement<Quantities> createOrderInfoPickupQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_OrderInfoPickupQuantities_QNAME, Quantities.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "PlannedDeliveryQuantities", scope = OrderInfo.class)
    public JAXBElement<Quantities> createOrderInfoPlannedDeliveryQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_OrderInfoPlannedDeliveryQuantities_QNAME, Quantities.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "PlannedPickupQuantities", scope = OrderInfo.class)
    public JAXBElement<Quantities> createOrderInfoPlannedPickupQuantities(Quantities value) {
        return new JAXBElement<Quantities>(_OrderInfoPlannedPickupQuantities_QNAME, Quantities.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderInfoWorkerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "RouteWorkerInfos", scope = OrderInfo.class)
    public JAXBElement<ArrayOfOrderInfoWorkerInfo> createOrderInfoRouteWorkerInfos(ArrayOfOrderInfoWorkerInfo value) {
        return new JAXBElement<ArrayOfOrderInfoWorkerInfo>(_OrderInfoRouteWorkerInfos_QNAME, ArrayOfOrderInfoWorkerInfo.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "ServiceStartDate", scope = OrderInfo.class)
    public JAXBElement<XMLGregorianCalendar> createOrderInfoServiceStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderInfoServiceStartDate_QNAME, XMLGregorianCalendar.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "ServiceStartTime", scope = OrderInfo.class)
    public JAXBElement<QualityPairedDateTime> createOrderInfoServiceStartTime(QualityPairedDateTime value) {
        return new JAXBElement<QualityPairedDateTime>(_OrderInfoServiceStartTime_QNAME, QualityPairedDateTime.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "SpecialInstructions", scope = OrderInfo.class)
    public JAXBElement<String> createOrderInfoSpecialInstructions(String value) {
        return new JAXBElement<String>(_OrderInfoSpecialInstructions_QNAME, String.class, OrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "LocationComment", scope = LocationCommentInfo.class)
    public JAXBElement<LocationComment> createLocationCommentInfoLocationComment(LocationComment value) {
        return new JAXBElement<LocationComment>(_LocationCommentInfoLocationComment_QNAME, LocationComment.class, LocationCommentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "LocationDescription", scope = LocationCommentInfo.class)
    public JAXBElement<String> createLocationCommentInfoLocationDescription(String value) {
        return new JAXBElement<String>(_LocationCommentInfoLocationDescription_QNAME, String.class, LocationCommentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "LocationIdentifier", scope = LocationCommentInfo.class)
    public JAXBElement<String> createLocationCommentInfoLocationIdentifier(String value) {
        return new JAXBElement<String>(_LocationCommentInfoLocationIdentifier_QNAME, String.class, LocationCommentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "WorkerEntityKeys", scope = X0020XRSDataRetrievalJobParameters.class)
    public JAXBElement<ArrayOflong> createX0020XRSDataRetrievalJobParametersWorkerEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_X0020XRSDataRetrievalJobParametersWorkerEntityKeys_QNAME, ArrayOflong.class, X0020XRSDataRetrievalJobParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "IgnitionState_IgnitionState", scope = EquipmentInitialState.class)
    public JAXBElement<String> createEquipmentInitialStateIgnitionStateIgnitionState(String value) {
        return new JAXBElement<String>(_EquipmentInitialStateIgnitionStateIgnitionState_QNAME, String.class, EquipmentInitialState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "PositionDataPoints", scope = EquipmentDataSetEncoded.class)
    public JAXBElement<byte[]> createEquipmentDataSetEncodedPositionDataPoints(byte[] value) {
        return new JAXBElement<byte[]>(_EquipmentDataSetEncodedPositionDataPoints_QNAME, byte[].class, EquipmentDataSetEncoded.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "TelemetryDataPoints", scope = EquipmentDataSetEncoded.class)
    public JAXBElement<byte[]> createEquipmentDataSetEncodedTelemetryDataPoints(byte[] value) {
        return new JAXBElement<byte[]>(_EquipmentDataSetEncodedTelemetryDataPoints_QNAME, byte[].class, EquipmentDataSetEncoded.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DataWarehouseFileType_FileType", scope = KpiExportParameters.class)
    public JAXBElement<String> createKpiExportParametersDataWarehouseFileTypeFileType(String value) {
        return new JAXBElement<String>(_KpiExportParametersDataWarehouseFileTypeFileType_QNAME, String.class, KpiExportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "DownloadCenterUrl", scope = KpiExportParameters.class)
    public JAXBElement<String> createKpiExportParametersDownloadCenterUrl(String value) {
        return new JAXBElement<String>(_KpiExportParametersDownloadCenterUrl_QNAME, String.class, KpiExportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "FileName", scope = KpiExportParameters.class)
    public JAXBElement<String> createKpiExportParametersFileName(String value) {
        return new JAXBElement<String>(_KpiExportParametersFileName_QNAME, String.class, KpiExportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Kpi", scope = KpiExportParameters.class)
    public JAXBElement<DataWarehouseKpiBase> createKpiExportParametersKpi(DataWarehouseKpiBase value) {
        return new JAXBElement<DataWarehouseKpiBase>(_KpiExportParametersKpi_QNAME, DataWarehouseKpiBase.class, KpiExportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiQuery", scope = KpiExportParameters.class)
    public JAXBElement<KpiQuery> createKpiExportParametersKpiQuery(KpiQuery value) {
        return new JAXBElement<KpiQuery>(_KpiQuery_QNAME, KpiQuery.class, KpiExportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "MeasureUnitOptions", scope = KpiExportParameters.class)
    public JAXBElement<MeasureUnitOptions> createKpiExportParametersMeasureUnitOptions(MeasureUnitOptions value) {
        return new JAXBElement<MeasureUnitOptions>(_KpiQueryMeasureUnitOptions_QNAME, MeasureUnitOptions.class, KpiExportParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "StartDate", scope = SampleDataGeneratorParameters.class)
    public JAXBElement<XMLGregorianCalendar> createSampleDataGeneratorParametersStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SampleDataGeneratorParametersStartDate_QNAME, XMLGregorianCalendar.class, SampleDataGeneratorParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeasureMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Measures", scope = DataWarehouseMetadata.class)
    public JAXBElement<ArrayOfMeasureMetadata> createDataWarehouseMetadataMeasures(ArrayOfMeasureMetadata value) {
        return new JAXBElement<ArrayOfMeasureMetadata>(_DataWarehouseMetadataMeasures_QNAME, ArrayOfMeasureMetadata.class, DataWarehouseMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSecondaryDimensionMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "SecondaryDimensions", scope = DataWarehouseMetadata.class)
    public JAXBElement<ArrayOfSecondaryDimensionMetadata> createDataWarehouseMetadataSecondaryDimensions(ArrayOfSecondaryDimensionMetadata value) {
        return new JAXBElement<ArrayOfSecondaryDimensionMetadata>(_MeasureMetadataSecondaryDimensions_QNAME, ArrayOfSecondaryDimensionMetadata.class, DataWarehouseMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiQueryResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "QueryResults", scope = DataWarehouseKpiExecutionJobInfo.class)
    public JAXBElement<KpiQueryResults> createDataWarehouseKpiExecutionJobInfoQueryResults(KpiQueryResults value) {
        return new JAXBElement<KpiQueryResults>(_DataWarehouseKpiExecutionJobInfoQueryResults_QNAME, KpiQueryResults.class, DataWarehouseKpiExecutionJobInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiExecutionJobResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Result", scope = DataWarehouseKpiExecutionJobInfo.class)
    public JAXBElement<DataWarehouseKpiExecutionJobResult> createDataWarehouseKpiExecutionJobInfoResult(DataWarehouseKpiExecutionJobResult value) {
        return new JAXBElement<DataWarehouseKpiExecutionJobResult>(_DataWarehouseKpiExecutionJobInfoResult_QNAME, DataWarehouseKpiExecutionJobResult.class, DataWarehouseKpiExecutionJobInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiExecutionJobPKey", scope = KpiQueryResults.class)
    public JAXBElement<Long> createKpiQueryResultsKpiExecutionJobPKey(Long value) {
        return new JAXBElement<Long>(_KpiQueryResultsKpiExecutionJobPKey_QNAME, Long.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedAccounts", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf> createKpiQueryResultsReferencedAccounts(ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf>(_KpiQueryResultsReferencedAccounts_QNAME, ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedCargoExceptionTypes", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf> createKpiQueryResultsReferencedCargoExceptionTypes(ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedCargoExceptionTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedCargoUnitTypes", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf> createKpiQueryResultsReferencedCargoUnitTypes(ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedCargoUnitTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedCostTypes", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf> createKpiQueryResultsReferencedCostTypes(ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedCostTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedDoorStateExceptionRules", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf> createKpiQueryResultsReferencedDoorStateExceptionRules(ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf>(_KpiQueryResultsReferencedDoorStateExceptionRules_QNAME, ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedEngineIdleExceptionRules", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf> createKpiQueryResultsReferencedEngineIdleExceptionRules(ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf>(_KpiQueryResultsReferencedEngineIdleExceptionRules_QNAME, ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedEquipmentClasses", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf> createKpiQueryResultsReferencedEquipmentClasses(ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf>(_KpiQueryResultsReferencedEquipmentClasses_QNAME, ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedEquipmentManufacturers", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf> createKpiQueryResultsReferencedEquipmentManufacturers(ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf>(_KpiQueryResultsReferencedEquipmentManufacturers_QNAME, ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedEquipmentTypes", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf> createKpiQueryResultsReferencedEquipmentTypes(ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedEquipmentTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedEquipments", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf> createKpiQueryResultsReferencedEquipments(ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf>(_KpiQueryResultsReferencedEquipments_QNAME, ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedIdlingTypes", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf> createKpiQueryResultsReferencedIdlingTypes(ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedIdlingTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedLocations", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf> createKpiQueryResultsReferencedLocations(ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf>(_KpiQueryResultsReferencedLocations_QNAME, ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedMobileDevices", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf> createKpiQueryResultsReferencedMobileDevices(ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf>(_KpiQueryResultsReferencedMobileDevices_QNAME, ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedNavRecalculationReasons", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf> createKpiQueryResultsReferencedNavRecalculationReasons(ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf>(_KpiQueryResultsReferencedNavRecalculationReasons_QNAME, ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedOperationsUnits", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf> createKpiQueryResultsReferencedOperationsUnits(ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf>(_KpiQueryResultsReferencedOperationsUnits_QNAME, ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedPlannedAndActuals", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf> createKpiQueryResultsReferencedPlannedAndActuals(ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf>(_KpiQueryResultsReferencedPlannedAndActuals_QNAME, ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedPowerTakeOffExceptionRules", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf> createKpiQueryResultsReferencedPowerTakeOffExceptionRules(ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf>(_KpiQueryResultsReferencedPowerTakeOffExceptionRules_QNAME, ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedRouteDescriptors", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf> createKpiQueryResultsReferencedRouteDescriptors(ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf>(_KpiQueryResultsReferencedRouteDescriptors_QNAME, ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedRouteInfos", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf> createKpiQueryResultsReferencedRouteInfos(ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf>(_KpiQueryResultsReferencedRouteInfos_QNAME, ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedRoutes", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf> createKpiQueryResultsReferencedRoutes(ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf>(_KpiQueryResultsReferencedRoutes_QNAME, ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedServiceLocationCategories", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf> createKpiQueryResultsReferencedServiceLocationCategories(ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf>(_KpiQueryResultsReferencedServiceLocationCategories_QNAME, ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedServiceTypes", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf> createKpiQueryResultsReferencedServiceTypes(ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedServiceTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedSpeedingExceptionRules", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf> createKpiQueryResultsReferencedSpeedingExceptionRules(ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf>(_KpiQueryResultsReferencedSpeedingExceptionRules_QNAME, ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedStopInfos", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf> createKpiQueryResultsReferencedStopInfos(ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf>(_KpiQueryResultsReferencedStopInfos_QNAME, ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedStopTypes", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf> createKpiQueryResultsReferencedStopTypes(ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedStopTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedTelematicsDeviceInputOutputAccessories", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf> createKpiQueryResultsReferencedTelematicsDeviceInputOutputAccessories(ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf>(_KpiQueryResultsReferencedTelematicsDeviceInputOutputAccessories_QNAME, ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedTelematicsDevices", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf> createKpiQueryResultsReferencedTelematicsDevices(ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf>(_KpiQueryResultsReferencedTelematicsDevices_QNAME, ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedTemperatureExceptionRules", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf> createKpiQueryResultsReferencedTemperatureExceptionRules(ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf>(_KpiQueryResultsReferencedTemperatureExceptionRules_QNAME, ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedWorkerTypes", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf> createKpiQueryResultsReferencedWorkerTypes(ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedWorkerTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedWorkers", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf> createKpiQueryResultsReferencedWorkers(ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf>(_KpiQueryResultsReferencedWorkers_QNAME, ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKpiQueryResultItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Results", scope = KpiQueryResults.class)
    public JAXBElement<ArrayOfKpiQueryResultItem> createKpiQueryResultsResults(ArrayOfKpiQueryResultItem value) {
        return new JAXBElement<ArrayOfKpiQueryResultItem>(_KpiQueryResultsResults_QNAME, ArrayOfKpiQueryResultItem.class, KpiQueryResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiDescription", scope = DataWarehouseKpiResult.class)
    public JAXBElement<DataWarehouseKpiDescription> createDataWarehouseKpiResultKpiDescription(DataWarehouseKpiDescription value) {
        return new JAXBElement<DataWarehouseKpiDescription>(_DataWarehouseKpiResultKpiDescription_QNAME, DataWarehouseKpiDescription.class, DataWarehouseKpiResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiQueryResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "KpiQueryResults", scope = DataWarehouseKpiResult.class)
    public JAXBElement<KpiQueryResults> createDataWarehouseKpiResultKpiQueryResults(KpiQueryResults value) {
        return new JAXBElement<KpiQueryResults>(_KpiQueryResults_QNAME, KpiQueryResults.class, DataWarehouseKpiResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedAccounts", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf> createKpiQueryResultReferencedAccounts(ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf>(_KpiQueryResultsReferencedAccounts_QNAME, ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedCargoExceptionTypes", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf> createKpiQueryResultReferencedCargoExceptionTypes(ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedCargoExceptionTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedCargoUnitTypes", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf> createKpiQueryResultReferencedCargoUnitTypes(ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedCargoUnitTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedCostTypes", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf> createKpiQueryResultReferencedCostTypes(ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedCostTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedDoorStateExceptionRules", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf> createKpiQueryResultReferencedDoorStateExceptionRules(ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf>(_KpiQueryResultsReferencedDoorStateExceptionRules_QNAME, ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedEngineIdleExceptionRules", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf> createKpiQueryResultReferencedEngineIdleExceptionRules(ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf>(_KpiQueryResultsReferencedEngineIdleExceptionRules_QNAME, ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedEquipmentClasses", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf> createKpiQueryResultReferencedEquipmentClasses(ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf>(_KpiQueryResultsReferencedEquipmentClasses_QNAME, ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedEquipmentManufacturers", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf> createKpiQueryResultReferencedEquipmentManufacturers(ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf>(_KpiQueryResultsReferencedEquipmentManufacturers_QNAME, ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedEquipmentTypes", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf> createKpiQueryResultReferencedEquipmentTypes(ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedEquipmentTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedEquipments", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf> createKpiQueryResultReferencedEquipments(ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf>(_KpiQueryResultsReferencedEquipments_QNAME, ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedLocations", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf> createKpiQueryResultReferencedLocations(ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf>(_KpiQueryResultsReferencedLocations_QNAME, ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedMobileDevices", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf> createKpiQueryResultReferencedMobileDevices(ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf>(_KpiQueryResultsReferencedMobileDevices_QNAME, ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedNavRecalculationReasons", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf> createKpiQueryResultReferencedNavRecalculationReasons(ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf>(_KpiQueryResultsReferencedNavRecalculationReasons_QNAME, ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedOperationsUnits", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf> createKpiQueryResultReferencedOperationsUnits(ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf>(_KpiQueryResultsReferencedOperationsUnits_QNAME, ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedPlannedAndActuals", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf> createKpiQueryResultReferencedPlannedAndActuals(ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf>(_KpiQueryResultsReferencedPlannedAndActuals_QNAME, ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedPowerTakeOffExceptionRules", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf> createKpiQueryResultReferencedPowerTakeOffExceptionRules(ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf>(_KpiQueryResultsReferencedPowerTakeOffExceptionRules_QNAME, ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedRouteDescriptors", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf> createKpiQueryResultReferencedRouteDescriptors(ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf>(_KpiQueryResultsReferencedRouteDescriptors_QNAME, ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedRouteInfos", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf> createKpiQueryResultReferencedRouteInfos(ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf>(_KpiQueryResultsReferencedRouteInfos_QNAME, ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedRoutes", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf> createKpiQueryResultReferencedRoutes(ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf>(_KpiQueryResultsReferencedRoutes_QNAME, ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedServiceLocationCategories", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf> createKpiQueryResultReferencedServiceLocationCategories(ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf>(_KpiQueryResultsReferencedServiceLocationCategories_QNAME, ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedServiceTypes", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf> createKpiQueryResultReferencedServiceTypes(ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedServiceTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedSpeedingExceptionRules", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf> createKpiQueryResultReferencedSpeedingExceptionRules(ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf>(_KpiQueryResultsReferencedSpeedingExceptionRules_QNAME, ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedStopInfos", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf> createKpiQueryResultReferencedStopInfos(ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf>(_KpiQueryResultsReferencedStopInfos_QNAME, ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedStopTypes", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf> createKpiQueryResultReferencedStopTypes(ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedStopTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedTelematicsDeviceInputOutputAccessories", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf> createKpiQueryResultReferencedTelematicsDeviceInputOutputAccessories(ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf>(_KpiQueryResultsReferencedTelematicsDeviceInputOutputAccessories_QNAME, ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedTelematicsDevices", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf> createKpiQueryResultReferencedTelematicsDevices(ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf>(_KpiQueryResultsReferencedTelematicsDevices_QNAME, ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedTemperatureExceptionRules", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf> createKpiQueryResultReferencedTemperatureExceptionRules(ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf>(_KpiQueryResultsReferencedTemperatureExceptionRules_QNAME, ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedWorkerTypes", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf> createKpiQueryResultReferencedWorkerTypes(ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf>(_KpiQueryResultsReferencedWorkerTypes_QNAME, ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "ReferencedWorkers", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf> createKpiQueryResultReferencedWorkers(ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf value) {
        return new JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf>(_KpiQueryResultsReferencedWorkers_QNAME, ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeasureResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "Results", scope = KpiQueryResult.class)
    public JAXBElement<ArrayOfMeasureResult> createKpiQueryResultResults(ArrayOfMeasureResult value) {
        return new JAXBElement<ArrayOfMeasureResult>(_KpiQueryResultsResults_QNAME, ArrayOfMeasureResult.class, KpiQueryResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "EquipmentIdentifier", scope = LookupEquipmentOptions.class)
    public JAXBElement<String> createLookupEquipmentOptionsEquipmentIdentifier(String value) {
        return new JAXBElement<String>(_LookupEquipmentOptionsEquipmentIdentifier_QNAME, String.class, LookupEquipmentOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "EquipmentEntityKey", scope = GetNextOrPreviousRouteOptions.class)
    public JAXBElement<Long> createGetNextOrPreviousRouteOptionsEquipmentEntityKey(Long value) {
        return new JAXBElement<Long>(_GetNextOrPreviousRouteOptionsEquipmentEntityKey_QNAME, Long.class, GetNextOrPreviousRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "ReturnPropertyOptions", scope = GetNextOrPreviousRouteOptions.class)
    public JAXBElement<RoutePropertyOptions> createGetNextOrPreviousRouteOptionsReturnPropertyOptions(RoutePropertyOptions value) {
        return new JAXBElement<RoutePropertyOptions>(_GetNextOrPreviousRouteOptionsReturnPropertyOptions_QNAME, RoutePropertyOptions.class, GetNextOrPreviousRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "WorkerEntityKey", scope = GetNextOrPreviousRouteOptions.class)
    public JAXBElement<Long> createGetNextOrPreviousRouteOptionsWorkerEntityKey(Long value) {
        return new JAXBElement<Long>(_GetNextOrPreviousRouteOptionsWorkerEntityKey_QNAME, Long.class, GetNextOrPreviousRouteOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "ServiceableStopTemplates", scope = RetrieveStopTemplateResults.class)
    public JAXBElement<ArrayOfServiceableStopTemplate> createRetrieveStopTemplateResultsServiceableStopTemplates(ArrayOfServiceableStopTemplate value) {
        return new JAXBElement<ArrayOfServiceableStopTemplate>(_RetrieveStopTemplateResultsServiceableStopTemplates_QNAME, ArrayOfServiceableStopTemplate.class, RetrieveStopTemplateResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTemplatePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "RetrievalPropertyOptions", scope = ServiceableStopTemplateRetrievalOptions.class)
    public JAXBElement<StopTemplatePropertyOptions> createServiceableStopTemplateRetrievalOptionsRetrievalPropertyOptions(StopTemplatePropertyOptions value) {
        return new JAXBElement<StopTemplatePropertyOptions>(_ServiceableStopTemplateRetrievalOptionsRetrievalPropertyOptions_QNAME, StopTemplatePropertyOptions.class, ServiceableStopTemplateRetrievalOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "SearchString", scope = ServiceableStopTemplateRetrievalOptions.class)
    public JAXBElement<String> createServiceableStopTemplateRetrievalOptionsSearchString(String value) {
        return new JAXBElement<String>(_ServiceableStopTemplateRetrievalOptionsSearchString_QNAME, String.class, ServiceableStopTemplateRetrievalOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "RegionContext", scope = InternalRetrieveEquipmentDataHistoryEncodedOptions.class)
    public JAXBElement<RegionContext> createInternalRetrieveEquipmentDataHistoryEncodedOptionsRegionContext(RegionContext value) {
        return new JAXBElement<RegionContext>(_InternalRetrieveEquipmentDataHistoryEncodedOptionsRegionContext_QNAME, RegionContext.class, InternalRetrieveEquipmentDataHistoryEncodedOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "Region_MobileDataSource_GpsStreamSource", scope = InternalRetrieveEquipmentDataHistoryEncodedOptions.class)
    public JAXBElement<String> createInternalRetrieveEquipmentDataHistoryEncodedOptionsRegionMobileDataSourceGpsStreamSource(String value) {
        return new JAXBElement<String>(_InternalRetrieveEquipmentDataHistoryEncodedOptionsRegionMobileDataSourceGpsStreamSource_QNAME, String.class, InternalRetrieveEquipmentDataHistoryEncodedOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDataSetEncoded }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "EncodedEquipmentDataSets", scope = EquipmentDataHistoryEncodedResult.class)
    public JAXBElement<ArrayOfEquipmentDataSetEncoded> createEquipmentDataHistoryEncodedResultEncodedEquipmentDataSets(ArrayOfEquipmentDataSetEncoded value) {
        return new JAXBElement<ArrayOfEquipmentDataSetEncoded>(_EquipmentDataHistoryEncodedResultEncodedEquipmentDataSets_QNAME, ArrayOfEquipmentDataSetEncoded.class, EquipmentDataHistoryEncodedResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentInitialState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "InitialState", scope = EquipmentDataHistoryEncodedResult.class)
    public JAXBElement<EquipmentInitialState> createEquipmentDataHistoryEncodedResultInitialState(EquipmentInitialState value) {
        return new JAXBElement<EquipmentInitialState>(_EquipmentDataHistoryEncodedResultInitialState_QNAME, EquipmentInitialState.class, EquipmentDataHistoryEncodedResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDriverLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "Items", scope = DriverLogResults.class)
    public JAXBElement<ArrayOfDriverLog> createDriverLogResultsItems(ArrayOfDriverLog value) {
        return new JAXBElement<ArrayOfDriverLog>(_DriverLogResultsItems_QNAME, ArrayOfDriverLog.class, DriverLogResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationCommentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", name = "LocationComments", scope = LocationCommentResults.class)
    public JAXBElement<ArrayOfLocationCommentInfo> createLocationCommentResultsLocationComments(ArrayOfLocationCommentInfo value) {
        return new JAXBElement<ArrayOfLocationCommentInfo>(_LocationCommentResultsLocationComments_QNAME, ArrayOfLocationCommentInfo.class, LocationCommentResults.class, value);
    }

}
