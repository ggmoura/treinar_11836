
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.roadnet.apex.datacontracts.Address;
import com.roadnet.apex.datacontracts.ArrayOfDiagnosticTroubleCodeClassification;
import com.roadnet.apex.datacontracts.ArrayOfDiagnosticTroubleCodeCriteria;
import com.roadnet.apex.datacontracts.ArrayOfServiceableStopOpenCloseDetail;
import com.roadnet.apex.datacontracts.ArrayOfServiceableStopServiceWindowDetail;
import com.roadnet.apex.datacontracts.BatteryState;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.DailyTimePeriod;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.Length;
import com.roadnet.apex.datacontracts.LiquidVolume;
import com.roadnet.apex.datacontracts.PersonName;
import com.roadnet.apex.datacontracts.Speed;
import com.roadnet.apex.datacontracts.Temperature;
import com.roadnet.apex.datacontracts.TransmissionGearState;
import com.roadnet.apex.datacontracts.Weight;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts package. 
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

    private final static QName _DataWarehouseSpeedingType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseSpeedingType");
    private final static QName _DataWarehouseDataLoaderMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDataLoaderMode");
    private final static QName _DataWarehouseResourceEventType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseResourceEventType");
    private final static QName _DataWarehouseTimeVarianceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTimeVarianceType");
    private final static QName _DataWarehouseCompositeMeasureType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCompositeMeasureType");
    private final static QName _DataWarehouseCostType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCostType");
    private final static QName _DataWarehouseDimensionAttributeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDimensionAttributeType");
    private final static QName _DataWarehouseLocationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseLocationType");
    private final static QName _DataWarehouseDataPointsLimiterSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDataPointsLimiterSettings");
    private final static QName _DataWarehouseFileType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseFileType");
    private final static QName _DataWarehouseKpiLogicalOperatorType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiLogicalOperatorType");
    private final static QName _DataWarehouseMeasureUsageOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseMeasureUsageOptions");
    private final static QName _DataWarehousePlannedActualType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehousePlannedActualType");
    private final static QName _DataWarehousePlannedAndActualType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehousePlannedAndActualType");
    private final static QName _DataWarehouseRuleAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseRuleAction");
    private final static QName _DataWarehouseTransactionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTransactionType");
    private final static QName _DataWarehouseAtomicMeasureType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseAtomicMeasureType");
    private final static QName _DataWarehouseSecondaryDimensionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseSecondaryDimensionType");
    private final static QName _DataWarehouseCargoExceptionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCargoExceptionType");
    private final static QName _IntegrationStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "IntegrationStatus");
    private final static QName _DataWarehouseServiceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseServiceType");
    private final static QName _DataWarehouseStopType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseStopType");
    private final static QName _DataWarehouseIdlingTypeDimensionIdlingType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseIdlingTypeDimension.IdlingType");
    private final static QName _DataWarehouseDimensionDimensionCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDimension.DimensionCategory");
    private final static QName _OperatorType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "OperatorType");
    private final static QName _DataWarehouseKpiSettingsKpiDisplayMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiSettings.KpiDisplayMode");
    private final static QName _DataWarehouseKpiKpiGroupByType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpi.KpiGroupByType");
    private final static QName _DataWarehouseKpiMeasureMeasureAverageSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiMeasure.MeasureAverageSetting");
    private final static QName _DataWarehouseKpiMeasureMeasureCompareSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiMeasure.MeasureCompareSetting");
    private final static QName _DataWarehouseKpiOutputType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiOutputType");
    private final static QName _DataWarehouseKpiSortingOptionsSortOrderType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiSortingOptions.SortOrderType");
    private final static QName _DataWarehouseKpiSortingOptionsSortByType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiSortingOptions.SortByType");
    private final static QName _DataWarehouseTravelLegTypeDimensionTravelLegType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTravelLegTypeDimension.TravelLegType");
    private final static QName _DataWarehouseStopInfoDimensionStopExecutionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseStopInfoDimension.StopExecutionType");
    private final static QName _DataWarehouseStopInfoDimensionIsOffDayStop_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseStopInfoDimension.IsOffDayStop");
    private final static QName _DataWarehouseKpiExportJobInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiExportJobInfo");
    private final static QName _DataWarehouseKpiExportFileResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiExportFileResult");
    private final static QName _DataWarehouseCleansingJobInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCleansingJobInfo");
    private final static QName _DataWarehouseCleansingResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCleansingResult");
    private final static QName _DataWarehouseMobileDeviceDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseMobileDeviceDimension");
    private final static QName _DataWarehouseNavRecalculationReasonDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseNavRecalculationReasonDimension");
    private final static QName _DataWarehouseTelematicsDeviceDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTelematicsDeviceDimension");
    private final static QName _DataWarehousePowerTakeOffExceptionRuleDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehousePowerTakeOffExceptionRuleDimension");
    private final static QName _DataWarehouseIdlingTypeDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseIdlingTypeDimension");
    private final static QName _DataWarehouseDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDimension");
    private final static QName _DataWarehouseOperationsUnitDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseOperationsUnitDimension");
    private final static QName _DataWarehouseTelematicsDeviceInputOutputAccessoryDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTelematicsDeviceInputOutputAccessoryDimension");
    private final static QName _DataWarehouseAccountDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseAccountDimension");
    private final static QName _DataWarehouseCostTypeDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCostTypeDimension");
    private final static QName _DataWarehouseCustomMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCustomMeasure");
    private final static QName _IMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "IMeasure");
    private final static QName _UserDefinedMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "UserDefinedMeasure");
    private final static QName _ArrayOfDimensionFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDimensionFilter");
    private final static QName _DimensionFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DimensionFilter");
    private final static QName _DimensionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DimensionDetail");
    private final static QName _DimensionDescriber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DimensionDescriber");
    private final static QName _WeekYearDimensionDescriber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "WeekYearDimensionDescriber");
    private final static QName _OperationsUnitDimensionDescriber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "OperationsUnitDimensionDescriber");
    private final static QName _TimeDimensionDescriber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TimeDimensionDescriber");
    private final static QName _SecondaryDimensionDescriber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "SecondaryDimensionDescriber");
    private final static QName _DataWarehouseDoorStateExceptionRuleDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDoorStateExceptionRuleDimension");
    private final static QName _DataWarehouseEquipmentManufacturerDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseEquipmentManufacturerDimension");
    private final static QName _DataWarehouseKpiBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiBase");
    private final static QName _ArrayOfDimensionDescriber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDimensionDescriber");
    private final static QName _DataWarehouseKpiFolder_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiFolder");
    private final static QName _DataWarehouseScorecardKpi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseScorecardKpi");
    private final static QName _ArrayOfDataWarehouseScorecardKpiMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDataWarehouseScorecardKpiMeasure");
    private final static QName _DataWarehouseScorecardKpiMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseScorecardKpiMeasure");
    private final static QName _DataWarehouseKpiMeasureBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiMeasureBase");
    private final static QName _DataWarehouseKpiMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiMeasure");
    private final static QName _DataWarehouseKpi_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpi");
    private final static QName _ArrayOfDataWarehouseKpiMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDataWarehouseKpiMeasure");
    private final static QName _DataWarehouseKpiSchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiSchedule");
    private final static QName _MeasureUnitOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "MeasureUnitOptions");
    private final static QName _DataWarehouseDailyKpiSchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDailyKpiSchedule");
    private final static QName _DataWarehouseMonthlyKpiSchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseMonthlyKpiSchedule");
    private final static QName _DataWarehouseRouteInfoDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseRouteInfoDimension");
    private final static QName _DataWarehouseServiceLocationCategoryDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseServiceLocationCategoryDimension");
    private final static QName _DataWarehouseTemperatureExceptionRuleDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTemperatureExceptionRuleDimension");
    private final static QName _DataWarehousePlannedAndActualDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehousePlannedAndActualDimension");
    private final static QName _DataWarehouseEquipmentClassDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseEquipmentClassDimension");
    private final static QName _DataWarehouseEngineIdleExceptionRuleDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseEngineIdleExceptionRuleDimension");
    private final static QName _DataWarehouseSpeedingExceptionRuleDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseSpeedingExceptionRuleDimension");
    private final static QName _DataWarehouseCargoExceptionTypeDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCargoExceptionTypeDimension");
    private final static QName _DataWarehouseCargoUnitTypeDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCargoUnitTypeDimension");
    private final static QName _DataWarehouseIntegrationStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseIntegrationStatus");
    private final static QName _DataWarehouseRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseRoute");
    private final static QName _DataWarehouseEquipmentTypeDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseEquipmentTypeDimension");
    private final static QName _DataWarehouseEquipmentDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseEquipmentDimension");
    private final static QName _DataWarehouseLocationDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseLocationDimension");
    private final static QName _DataWarehouseOperationsUnitLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseOperationsUnitLevel");
    private final static QName _DataWarehouseRouteDescriptorDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseRouteDescriptorDimension");
    private final static QName _DataWarehouseServiceTypeDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseServiceTypeDimension");
    private final static QName _DataWarehouseStopTypeDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseStopTypeDimension");
    private final static QName _DataWarehouseTimeDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTimeDimension");
    private final static QName _DataWarehouseTravelLegTypeDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTravelLegTypeDimension");
    private final static QName _DataWarehouseWorkerTypeDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseWorkerTypeDimension");
    private final static QName _DataWarehouseWorkerDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseWorkerDimension");
    private final static QName _DataWarehouseDepot_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDepot");
    private final static QName _DataWarehouseStopInfoDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseStopInfoDimension");
    private final static QName _DataWarehouseOperationsUnitPermission_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseOperationsUnitPermission");
    private final static QName _FileResultPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "FileResultPropertyOptions");
    private final static QName _KpiExportJobInfoPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiExportJobInfoPropertyOptions");
    private final static QName _MobileDeviceDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "MobileDeviceDimensionPropertyOptions");
    private final static QName _NavRecalculationReasonDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "NavRecalculationReasonDimensionPropertyOptions");
    private final static QName _TelematicsDeviceDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TelematicsDeviceDimensionPropertyOptions");
    private final static QName _PowerTakeOffExceptionRuleDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "PowerTakeOffExceptionRuleDimensionPropertyOptions");
    private final static QName _IdlingTypeDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "IdlingTypeDimensionPropertyOptions");
    private final static QName _DimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DimensionPropertyOptions");
    private final static QName _OperationsUnitDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "OperationsUnitDimensionPropertyOptions");
    private final static QName _TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions");
    private final static QName _StopInfoDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "StopInfoDimensionPropertyOptions");
    private final static QName _AccountDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "AccountDimensionPropertyOptions");
    private final static QName _CostTypeDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "CostTypeDimensionPropertyOptions");
    private final static QName _CustomMeasurePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "CustomMeasurePropertyOptions");
    private final static QName _DoorStateExceptionRuleDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DoorStateExceptionRuleDimensionPropertyOptions");
    private final static QName _EquipmentManufacturerDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentManufacturerDimensionPropertyOptions");
    private final static QName _KpiBasePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiBasePropertyOptions");
    private final static QName _KpiFolderPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiFolderPropertyOptions");
    private final static QName _ScorecardKpiPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ScorecardKpiPropertyOptions");
    private final static QName _KpiPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiPropertyOptions");
    private final static QName _KpiMeasureBasePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiMeasureBasePropertyOptions");
    private final static QName _ScorecardKpiMeasurePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ScorecardKpiMeasurePropertyOptions");
    private final static QName _KpiMeasurePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiMeasurePropertyOptions");
    private final static QName _KpiSchedulePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiSchedulePropertyOptions");
    private final static QName _DailyKpiSchedulePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DailyKpiSchedulePropertyOptions");
    private final static QName _MonthlyKpiSchedulePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "MonthlyKpiSchedulePropertyOptions");
    private final static QName _RouteInfoDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RouteInfoDimensionPropertyOptions");
    private final static QName _ServiceLocationCategoryDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ServiceLocationCategoryDimensionPropertyOptions");
    private final static QName _TemperatureExceptionRuleDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TemperatureExceptionRuleDimensionPropertyOptions");
    private final static QName _PlannedAndActualDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "PlannedAndActualDimensionPropertyOptions");
    private final static QName _EquipmentClassDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentClassDimensionPropertyOptions");
    private final static QName _EngineIdleExceptionRuleDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EngineIdleExceptionRuleDimensionPropertyOptions");
    private final static QName _SpeedingExceptionRuleDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "SpeedingExceptionRuleDimensionPropertyOptions");
    private final static QName _CargoExceptionTypeDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "CargoExceptionTypeDimensionPropertyOptions");
    private final static QName _CargoUnitTypeDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "CargoUnitTypeDimensionPropertyOptions");
    private final static QName _DataWarehouseIntegrationStatusPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseIntegrationStatusPropertyOptions");
    private final static QName _DataWarehouseRoutePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseRoutePropertyOptions");
    private final static QName _EquipmentTypeDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentTypeDimensionPropertyOptions");
    private final static QName _EquipmentDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentDimensionPropertyOptions");
    private final static QName _LocationDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "LocationDimensionPropertyOptions");
    private final static QName _OperationsUnitLevelPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "OperationsUnitLevelPropertyOptions");
    private final static QName _OperationsUnitPermissionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "OperationsUnitPermissionPropertyOptions");
    private final static QName _RouteDescriptorDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RouteDescriptorDimensionPropertyOptions");
    private final static QName _ServiceTypeDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ServiceTypeDimensionPropertyOptions");
    private final static QName _StopTypeDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "StopTypeDimensionPropertyOptions");
    private final static QName _TimeDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TimeDimensionPropertyOptions");
    private final static QName _TravelLegTypeDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TravelLegTypeDimensionPropertyOptions");
    private final static QName _WorkerTypeDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "WorkerTypeDimensionPropertyOptions");
    private final static QName _WorkerDimensionPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "WorkerDimensionPropertyOptions");
    private final static QName _DataWarehouseDepotPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDepotPropertyOptions");
    private final static QName _DataWarehouseRouteData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseRouteData");
    private final static QName _DataWarehouseStop_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseStop");
    private final static QName _DimensionFilterValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DimensionFilterValues");
    private final static QName _Filters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Filters");
    private final static QName _DataWarehouseKpiDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiDescription");
    private final static QName _ArrayOfDataWarehouseKpiMeasureDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDataWarehouseKpiMeasureDescription");
    private final static QName _DataWarehouseKpiMeasureDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiMeasureDescription");
    private final static QName _DataWarehouseKpiSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiSettings");
    private final static QName _DataWarehouseKpiSortingOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiSortingOptions");
    private final static QName _DataWarehouseResourceEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseResourceEvent");
    private final static QName _DataWarehouseNavEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseNavEvent");
    private final static QName _DataWarehouseNavRecalculationEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseNavRecalculationEvent");
    private final static QName _DataWarehouseTelematicsEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTelematicsEvent");
    private final static QName _DataWarehouseTelematicsDeviceInputOutputAccessoryEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTelematicsDeviceInputOutputAccessoryEvent");
    private final static QName _DataWarehouseDoorStateException_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDoorStateException");
    private final static QName _DataWarehouseEngineIdleEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseEngineIdleEvent");
    private final static QName _DataWarehouseHarshEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseHarshEvent");
    private final static QName _DataWarehouseHarshAccelerationEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseHarshAccelerationEvent");
    private final static QName _DataWarehouseHarshBrakingEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseHarshBrakingEvent");
    private final static QName _DataWarehouseHarshCorneringEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseHarshCorneringEvent");
    private final static QName _DataWarehouseSpeedingEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseSpeedingEvent");
    private final static QName _DataWarehouseTemperatureException_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTemperatureException");
    private final static QName _DimensionKeyDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DimensionKeyDetail");
    private final static QName _BooleanDimensionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "BooleanDimensionDetail");
    private final static QName _EnumDimensionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EnumDimensionDetail");
    private final static QName _TimeVarianceDimensionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TimeVarianceDimensionDetail");
    private final static QName _PlannedAndActualDimensionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "PlannedAndActualDimensionDetail");
    private final static QName _LocationTypeDimensionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "LocationTypeDimensionDetail");
    private final static QName _NumericDimensionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "NumericDimensionDetail");
    private final static QName _SecondaryDimensionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "SecondaryDimensionDetail");
    private final static QName _StringDimensionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "StringDimensionDetail");
    private final static QName _DataWarehouseKpiCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiCriteria");
    private final static QName _DataWarehouseKpiMeasureFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiMeasureFilter");
    private final static QName _ArrayOfDataWarehouseKpiMeasureDataFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDataWarehouseKpiMeasureDataFilter");
    private final static QName _DataWarehouseKpiMeasureDataFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiMeasureDataFilter");
    private final static QName _DataWarehouseKpiOperationsUnitDimensionsFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiOperationsUnitDimensionsFilter");
    private final static QName _DataWarehouseKpiRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiRule");
    private final static QName _ArrayOfDataWarehouseKpiCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDataWarehouseKpiCriteria");
    private final static QName _DataWarehouseKpiRulesSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiRulesSet");
    private final static QName _ArrayOfDataWarehouseKpiRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDataWarehouseKpiRule");
    private final static QName _AtomicMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "AtomicMeasure");
    private final static QName _CompositeMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "CompositeMeasure");
    private final static QName _DayCountMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DayCountMeasure");
    private final static QName _MultiMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "MultiMeasure");
    private final static QName _ArrayOfIMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfIMeasure");
    private final static QName _PredefinedCompositeMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "PredefinedCompositeMeasure");
    private final static QName _ScoreMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ScoreMeasure");
    private final static QName _ArrayOfScorecardBand_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfScorecardBand");
    private final static QName _ScorecardBand_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ScorecardBand");
    private final static QName _ScorecardBandThreshold_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ScorecardBandThreshold");
    private final static QName _SecondaryDimensionCountMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "SecondaryDimensionCountMeasure");
    private final static QName _ValueMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ValueMeasure");
    private final static QName _ArrayOfDataWarehouseOperationsUnitPermission_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDataWarehouseOperationsUnitPermission");
    private final static QName _ArrayOfDimensionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDimensionDetail");
    private final static QName _ArrayOfDataWarehouseSecondaryDimensionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDataWarehouseSecondaryDimensionType");
    private final static QName _ArrayOfDataWarehouseKpiExportJobInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ArrayOfDataWarehouseKpiExportJobInfo");
    private final static QName _KpiExportResultDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiExportResultDto");
    private final static QName _SimpleExpressionBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "SimpleExpressionBase");
    private final static QName _BinaryExpressionBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "BinaryExpressionBase");
    private final static QName _ArithmeticExpressionBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "ArithmeticExpressionBase");
    private final static QName _AddExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "AddExpression");
    private final static QName _MultiplyExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "MultiplyExpression");
    private final static QName _DivideExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "DivideExpression");
    private final static QName _SubtractExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "SubtractExpression");
    private final static QName _ComparisonExpressionBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "ComparisonExpressionBase");
    private final static QName _SpatialWithinExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "SpatialWithinExpression");
    private final static QName _EqualToExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "EqualToExpression");
    private final static QName _GreaterThanExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "GreaterThanExpression");
    private final static QName _GreaterThanOrEqualToExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "GreaterThanOrEqualToExpression");
    private final static QName _InExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "InExpression");
    private final static QName _LessThanExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "LessThanExpression");
    private final static QName _LessThanOrEqualToExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "LessThanOrEqualToExpression");
    private final static QName _LikeExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "LikeExpression");
    private final static QName _ValueExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "ValueExpression");
    private final static QName _PropertyExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "PropertyExpression");
    private final static QName _CompositeExpressionBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "CompositeExpressionBase");
    private final static QName _ArrayOfSimpleExpressionBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "ArrayOfSimpleExpressionBase");
    private final static QName _AndExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "AndExpression");
    private final static QName _OrExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "OrExpression");
    private final static QName _NotExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "NotExpression");
    private final static QName _RestrictedEquipmentHoursMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RestrictedEquipmentHoursMode");
    private final static QName _RestrictedEquipmentHoursType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RestrictedEquipmentHoursType");
    private final static QName _TemperatureLimitType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "TemperatureLimitType");
    private final static QName _ResourceExceptionRuleFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ResourceExceptionRuleFunction");
    private final static QName _NavClientRoutePathDeviationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "NavClientRoutePathDeviationFunction");
    private final static QName _NavClientSpeedViolationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "NavClientSpeedViolationFunction");
    private final static QName _DiagnosticTroubleCodeFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DiagnosticTroubleCodeFunction");
    private final static QName _ResourceExceptionSpecialDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ResourceExceptionSpecialDescriptor");
    private final static QName _NavClientRoutePathDeviationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "NavClientRoutePathDeviationDescriptor");
    private final static QName _DiagnosticTroubleCodeDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DiagnosticTroubleCodeDescriptor");
    private final static QName _ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ArrayOfDiagnosticTroubleCodeDescriptor.DiagnosticTroubleCodeDetail");
    private final static QName _DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DiagnosticTroubleCodeDescriptor.DiagnosticTroubleCodeDetail");
    private final static QName _DoorStateFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DoorStateFunction");
    private final static QName _RemoteVehicleShutdownFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RemoteVehicleShutdownFunction");
    private final static QName _SeatBeltViolatioFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "SeatBeltViolatioFunction");
    private final static QName _TemperatureFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "TemperatureFunction");
    private final static QName _HOSOnDutyWithoutActivityFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "HOSOnDutyWithoutActivityFunction");
    private final static QName _PanicButtonFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "PanicButtonFunction");
    private final static QName _PotentialHOSDriveTimeViolationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "PotentialHOSDriveTimeViolationFunction");
    private final static QName _PotentialHOSDutyTimeViolationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "PotentialHOSDutyTimeViolationFunction");
    private final static QName _DeviceLowBatteryFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DeviceLowBatteryFunction");
    private final static QName _ExcessiveIdlingFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ExcessiveIdlingFunction");
    private final static QName _HarshAccelerationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "HarshAccelerationFunction");
    private final static QName _HarshBrakingFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "HarshBrakingFunction");
    private final static QName _HarshCorneringFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "HarshCorneringFunction");
    private final static QName _ProjectedServiceWindowDeviationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ProjectedServiceWindowDeviationFunction");
    private final static QName _RestrictedEquipmentHoursFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RestrictedEquipmentHoursFunction");
    private final static QName _RestrictedLocationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RestrictedLocationFunction");
    private final static QName _ServiceableStopServiceTimeDeviationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ServiceableStopServiceTimeDeviationFunction");
    private final static QName _GpsDistanceToLocationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "GpsDistanceToLocationFunction");
    private final static QName _GpsGapFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "GpsGapFunction");
    private final static QName _NoGpsFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "NoGpsFunction");
    private final static QName _OutOfContactFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "OutOfContactFunction");
    private final static QName _OffPlannedCompleteTimeFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "OffPlannedCompleteTimeFunction");
    private final static QName _OutOfBoundsArriveDepartFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "OutOfBoundsArriveDepartFunction");
    private final static QName _RouteNetworkSpeedViolationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RouteNetworkSpeedViolationFunction");
    private final static QName _RoutePathDeviationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RoutePathDeviationFunction");
    private final static QName _StaticSpeedViolationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "StaticSpeedViolationFunction");
    private final static QName _UnplannedStopDistanceToLocationFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "UnplannedStopDistanceToLocationFunction");
    private final static QName _StationaryResourceFunction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "StationaryResourceFunction");
    private final static QName _DoorStateDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DoorStateDescriptor");
    private final static QName _NavClientSpeedViolationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "NavClientSpeedViolationDescriptor");
    private final static QName _RemoteVehicleShutdownDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RemoteVehicleShutdownDescriptor");
    private final static QName _SeatBeltViolationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "SeatBeltViolationDescriptor");
    private final static QName _TemperatureDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "TemperatureDescriptor");
    private final static QName _HOSOnDutyWithoutActivityDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "HOSOnDutyWithoutActivityDescriptor");
    private final static QName _PanicButtonDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "PanicButtonDescriptor");
    private final static QName _PotentialHOSDriveTimeViolationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "PotentialHOSDriveTimeViolationDescriptor");
    private final static QName _PotentialHOSDutyTimeViolationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "PotentialHOSDutyTimeViolationDescriptor");
    private final static QName _RestrictedEquipmentHoursDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RestrictedEquipmentHoursDescriptor");
    private final static QName _RestrictedLocationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RestrictedLocationDescriptor");
    private final static QName _DeviceLowBatteryDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DeviceLowBatteryDescriptor");
    private final static QName _ExcessiveIdlingDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ExcessiveIdlingDescriptor");
    private final static QName _ProjectedServiceWindowDeviationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ProjectedServiceWindowDeviationDescriptor");
    private final static QName _ServiceableStopServiceTimeDeviationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ServiceableStopServiceTimeDeviationDescriptor");
    private final static QName _GpsDistanceToLocationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "GpsDistanceToLocationDescriptor");
    private final static QName _GpsGapDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "GpsGapDescriptor");
    private final static QName _OffPlannedCompleteTimeDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "OffPlannedCompleteTimeDescriptor");
    private final static QName _OutOfBoundsArriveDepartDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "OutOfBoundsArriveDepartDescriptor");
    private final static QName _OutOfContactDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "OutOfContactDescriptor");
    private final static QName _RoutePathDeviationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RoutePathDeviationDescriptor");
    private final static QName _SpeedViolationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "SpeedViolationDescriptor");
    private final static QName _StationaryResourceDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "StationaryResourceDescriptor");
    private final static QName _UnplannedStopDistanceToLocationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "UnplannedStopDistanceToLocationDescriptor");
    private final static QName _HarshDrivingingDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "HarshDrivingingDescriptor");
    private final static QName _HarshAccelerationDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "HarshAccelerationDescriptor");
    private final static QName _HarshBrakingDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "HarshBrakingDescriptor");
    private final static QName _HarshCorneringDescriptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "HarshCorneringDescriptor");
    private final static QName _WorkerLogCreationMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "WorkerLogCreationMethod");
    private final static QName _WorkerLogEventType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "WorkerLogEventType");
    private final static QName _WorkerLogEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "WorkerLogEvent");
    private final static QName _WorkerLogEventPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "WorkerLogEventPropertyOptions");
    private final static QName _ArrayOfWorkerLogEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "ArrayOfWorkerLogEvent");
    private final static QName _MobileScreenComponentDisplay_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileScreenComponentDisplay");
    private final static QName _MobileScreenComponentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileScreenComponentType");
    private final static QName _MobileScreenConfigurationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileScreenConfigurationType");
    private final static QName _MobileTextAlias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileTextAlias");
    private final static QName _MobileScreenConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileScreenConfiguration");
    private final static QName _ArrayOfMobileScreenComponent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "ArrayOfMobileScreenComponent");
    private final static QName _MobileScreenComponent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileScreenComponent");
    private final static QName _MobileFormScreenComponent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileFormScreenComponent");
    private final static QName _MobileTextAliasPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileTextAliasPropertyOptions");
    private final static QName _MobileScreenConfigurationPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileScreenConfigurationPropertyOptions");
    private final static QName _MobileScreenComponentPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileScreenComponentPropertyOptions");
    private final static QName _RetrieveNavRecalculationDetailsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", "RetrieveNavRecalculationDetailsResult");
    private final static QName _EquipmentProfileResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", "EquipmentProfileResult");
    private final static QName _RetrieveNavRecalculationDetailsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", "RetrieveNavRecalculationDetailsOptions");
    private final static QName _ComplianceCompanySettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Compliance", "ComplianceCompanySettings");
    private final static QName _MobileScreenComponentAlias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "Alias");
    private final static QName _MobileScreenComponentMobileScreenComponentDisplayComponentDisplay_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileScreenComponentDisplay_ComponentDisplay");
    private final static QName _MobileScreenComponentMobileScreenComponentTypeComponentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileScreenComponentType_ComponentType");
    private final static QName _MobileFormScreenComponentCustomFormDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "CustomFormDescription");
    private final static QName _MobileFormScreenComponentCustomFormEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "CustomFormEntityKey");
    private final static QName _MobileFormScreenComponentCustomFormIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "CustomFormIdentifier");
    private final static QName _MobileScreenConfigurationMobileScreenConfigurationTypeConfigurationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "MobileScreenConfigurationType_ConfigurationType");
    private final static QName _MobileScreenConfigurationScreenComponents_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "ScreenComponents");
    private final static QName _MobileTextAliasAliasKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "AliasKey");
    private final static QName _MobileTextAliasAliasText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", "AliasText");
    private final static QName _WorkerLogEventCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "Coordinate");
    private final static QName _WorkerLogEventDeviceEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "DeviceEntityKey");
    private final static QName _WorkerLogEventEditTimestamp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "EditTimestamp");
    private final static QName _WorkerLogEventLocationDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "LocationDetail");
    private final static QName _WorkerLogEventOdometer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "Odometer");
    private final static QName _WorkerLogEventRemark_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "Remark");
    private final static QName _WorkerLogEventWorkerLogCreationMethodCreationMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "WorkerLogCreationMethod_CreationMethod");
    private final static QName _WorkerLogEventWorkerLogEventTypeEventType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", "WorkerLogEventType_EventType");
    private final static QName _HarshDrivingingDescriptorForwardGForce_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ForwardGForce");
    private final static QName _HarshDrivingingDescriptorGPSSpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "GPSSpeed");
    private final static QName _HarshDrivingingDescriptorLateralGForce_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "LateralGForce");
    private final static QName _HarshDrivingingDescriptorVerticalGForce_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "VerticalGForce");
    private final static QName _UnplannedStopDistanceToLocationDescriptorDistanceToLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DistanceToLocation");
    private final static QName _SpeedViolationDescriptorAllowedSpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "AllowedSpeed");
    private final static QName _SpeedViolationDescriptorDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "Distance");
    private final static QName _SpeedViolationDescriptorMaxViolatingSpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "MaxViolatingSpeed");
    private final static QName _RoutePathDeviationDescriptorEndDeviationPoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "EndDeviationPoint");
    private final static QName _RoutePathDeviationDescriptorEndDeviationTimestamp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "EndDeviationTimestamp");
    private final static QName _RoutePathDeviationDescriptorMaxDeviatedDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "MaxDeviatedDistance");
    private final static QName _OutOfBoundsArriveDepartDescriptorDistanceFromStop_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DistanceFromStop");
    private final static QName _GpsGapDescriptorDistanceWithoutGps_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DistanceWithoutGps");
    private final static QName _ProjectedServiceWindowDeviationDescriptorOpenCloseDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "OpenCloseDetails");
    private final static QName _ProjectedServiceWindowDeviationDescriptorServiceWindowDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ServiceWindowDetails");
    private final static QName _ExcessiveIdlingDescriptorFuelDataSourceIdlingFuelDataSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "FuelDataSource_IdlingFuelDataSource");
    private final static QName _ExcessiveIdlingDescriptorFuelUsedIdling_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "FuelUsedIdling");
    private final static QName _DeviceLowBatteryDescriptorBatteryState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "BatteryState");
    private final static QName _RestrictedEquipmentHoursDescriptorRestrictedEquipmentHoursTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RestrictedEquipmentHoursType_Type");
    private final static QName _RestrictedEquipmentHoursDescriptorViolatedDepotDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ViolatedDepotDescription");
    private final static QName _RestrictedEquipmentHoursDescriptorViolatedDepotIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ViolatedDepotIdentifier");
    private final static QName _RestrictedEquipmentHoursDescriptorViolatedDepotOpenCloseWindow_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ViolatedDepotOpenCloseWindow");
    private final static QName _RestrictedEquipmentHoursDescriptorViolatedRegionRestrictedOperatingTimes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ViolatedRegionRestrictedOperatingTimes");
    private final static QName _TemperatureDescriptorTemperature_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "Temperature");
    private final static QName _TemperatureDescriptorTemperatureLimitTypeLimitType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "TemperatureLimitType_LimitType");
    private final static QName _NavClientSpeedViolationDescriptorOverLimitThreshold_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "OverLimitThreshold");
    private final static QName _UnplannedStopDistanceToLocationFunctionLocationEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "LocationEntityKeys");
    private final static QName _UnplannedStopDistanceToLocationFunctionViolationRadius_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "ViolationRadius");
    private final static QName _StaticSpeedViolationFunctionSpeedLimit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "SpeedLimit");
    private final static QName _RoutePathDeviationFunctionDeviationLimit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DeviationLimit");
    private final static QName _RouteNetworkSpeedViolationFunctionOverLimitTolerance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "OverLimitTolerance");
    private final static QName _OutOfBoundsArriveDepartFunctionStopRadius_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "StopRadius");
    private final static QName _GpsGapFunctionMaxDistanceWithoutGps_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "MaxDistanceWithoutGps");
    private final static QName _RestrictedEquipmentHoursFunctionRestrictedEquipmentHoursModeMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "RestrictedEquipmentHoursMode_Mode");
    private final static QName _TemperatureFunctionTemperatureMaxLimit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "TemperatureMaxLimit");
    private final static QName _TemperatureFunctionTemperatureMinLimit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "TemperatureMinLimit");
    private final static QName _DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailCoolantTemperatureValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "CoolantTemperatureValue");
    private final static QName _DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailEngineRPM_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "EngineRPM");
    private final static QName _DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailEngineTemperatureValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "EngineTemperatureValue");
    private final static QName _DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailGearState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "GearState");
    private final static QName _DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailTroubleCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "TroubleCode");
    private final static QName _DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailTroubleCodeDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "TroubleCodeDescription");
    private final static QName _DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DiagnosticTroubleCodes");
    private final static QName _NavClientRoutePathDeviationDescriptorDeviationDistanceThreshold_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "DeviationDistanceThreshold");
    private final static QName _DiagnosticTroubleCodeFunctionAdvancedCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "AdvancedCriteria");
    private final static QName _DiagnosticTroubleCodeFunctionSelectedClassifications_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", "SelectedClassifications");
    private final static QName _SimpleExpressionBaseGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "Group");
    private final static QName _SimpleExpressionBaseType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "Type");
    private final static QName _NotExpressionExpression_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "Expression");
    private final static QName _CompositeExpressionBaseExpressions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "Expressions");
    private final static QName _PropertyExpressionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "Name");
    private final static QName _ValueExpressionValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "Value");
    private final static QName _BinaryExpressionBaseLeft_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "Left");
    private final static QName _BinaryExpressionBaseRight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", "Right");
    private final static QName _SecondaryDimensionCountMeasureDataWarehouseSecondaryDimensionTypeDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseSecondaryDimensionType_Dimension");
    private final static QName _SecondaryDimensionCountMeasureReferenceMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ReferenceMeasure");
    private final static QName _ScorecardBandHighThreshold_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "HighThreshold");
    private final static QName _ScorecardBandLowThreshold_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "LowThreshold");
    private final static QName _ScoreMeasureBands_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Bands");
    private final static QName _ScoreMeasureMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Measure");
    private final static QName _PredefinedCompositeMeasureConversionFactor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ConversionFactor");
    private final static QName _PredefinedCompositeMeasureDataWarehouseCompositeMeasureTypeMeasureType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCompositeMeasureType_MeasureType");
    private final static QName _PredefinedCompositeMeasureDataWarehousePlannedActualTypePlannedOrActual_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehousePlannedActualType_PlannedOrActual");
    private final static QName _PredefinedCompositeMeasureDimensionFilters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DimensionFilters");
    private final static QName _MultiMeasureMeasures_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Measures");
    private final static QName _CompositeMeasureOperand1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Operand1");
    private final static QName _CompositeMeasureOperand2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Operand2");
    private final static QName _CompositeMeasureOperatorTypeOperator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "OperatorType_Operator");
    private final static QName _AtomicMeasureDataWarehouseAtomicMeasureTypeMeasureType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseAtomicMeasureType_MeasureType");
    private final static QName _DataWarehouseKpiRulesSetDataWarehouseKpiKpiGroupByTypeGroupByType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpi_KpiGroupByType_GroupByType");
    private final static QName _DataWarehouseKpiRulesSetDataWarehouseRuleActionRuleAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseRuleAction_RuleAction");
    private final static QName _DataWarehouseKpiRulesSetGroupings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Groupings");
    private final static QName _DataWarehouseKpiRulesSetRules_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Rules");
    private final static QName _DataWarehouseKpiRuleCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Criteria");
    private final static QName _DataWarehouseKpiRuleDataWarehouseKpiLogicalOperatorTypeLogicalOperator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiLogicalOperatorType_LogicalOperator");
    private final static QName _DataWarehouseKpiRuleDataWarehouseKpiMeasureMeasureCompareSettingMeasureCompare_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiMeasure_MeasureCompareSetting_MeasureCompare");
    private final static QName _DataWarehouseKpiOperationsUnitDimensionsFilterOperationsUnitDimensions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "OperationsUnitDimensions");
    private final static QName _DataWarehouseKpiMeasureDataFilterDisplay_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Display");
    private final static QName _DataWarehouseKpiMeasureDataFilterText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Text");
    private final static QName _DataWarehouseKpiMeasureFilterDataFilters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataFilters");
    private final static QName _DataWarehouseKpiCriteriaRelationalOperatorTypeRelationalOperator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RelationalOperatorType_RelationalOperator");
    private final static QName _DataWarehouseKpiCriteriaValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Value");
    private final static QName _LocationTypeDimensionDetailDataWarehouseLocationTypeValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseLocationType_Value");
    private final static QName _PlannedAndActualDimensionDetailDataWarehousePlannedAndActualTypeValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehousePlannedAndActualType_Value");
    private final static QName _TimeVarianceDimensionDetailDataWarehouseTimeVarianceTypeValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTimeVarianceType_Value");
    private final static QName _EnumDimensionDetailDataWarehouseDimensionAttributeTypeDimensionAttribute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDimensionAttributeType_DimensionAttribute");
    private final static QName _DataWarehouseResourceEventDataWarehouseRouteInternalKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseRouteInternalKey");
    private final static QName _DataWarehouseResourceEventRouteDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RouteDate");
    private final static QName _DataWarehouseResourceEventRouteDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RouteDescription");
    private final static QName _DataWarehouseResourceEventRouteIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RouteIdentifier");
    private final static QName _DataWarehouseTemperatureExceptionTemperature_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Temperature");
    private final static QName _DataWarehouseSpeedingEventDataWarehouseSpeedingTypeEventType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseSpeedingType_EventType");
    private final static QName _DataWarehouseSpeedingEventDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Distance");
    private final static QName _DataWarehouseSpeedingEventMaxSpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "MaxSpeed");
    private final static QName _DataWarehouseSpeedingEventPositionText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "PositionText");
    private final static QName _DataWarehouseSpeedingEventSpeedLimit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "SpeedLimit");
    private final static QName _DataWarehouseSpeedingEventSpeedOver_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "SpeedOver");
    private final static QName _DataWarehouseKpiSortingOptionsDataWarehouseDataPointsLimiterSettingsResultsLimiterMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDataPointsLimiterSettings_ResultsLimiterMode");
    private final static QName _DataWarehouseKpiSortingOptionsDataWarehouseKpiMeasureMeasureCompareSettingSortMeasureCompareOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiMeasure_MeasureCompareSetting_SortMeasureCompareOption");
    private final static QName _DataWarehouseKpiSortingOptionsDataWarehouseKpiSortingOptionsSortByTypeSortBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiSortingOptions_SortByType_SortBy");
    private final static QName _DataWarehouseKpiSortingOptionsDataWarehouseKpiSortingOptionsSortOrderTypeSortOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiSortingOptions_SortOrderType_SortOrder");
    private final static QName _DataWarehouseKpiSettingsDataWarehouseKpiSettingsKpiDisplayModeDisplayMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiSettings_KpiDisplayMode_DisplayMode");
    private final static QName _DataWarehouseKpiSettingsSortingOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "SortingOptions");
    private final static QName _DataWarehouseKpiMeasureDescriptionAverageDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "AverageDescription");
    private final static QName _DataWarehouseKpiMeasureDescriptionCompareDescriptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "CompareDescriptions");
    private final static QName _DataWarehouseKpiMeasureDescriptionExclusiveFiltersDescriptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ExclusiveFiltersDescriptions");
    private final static QName _DataWarehouseKpiMeasureDescriptionInclusiveFiltersDescriptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "InclusiveFiltersDescriptions");
    private final static QName _DataWarehouseKpiMeasureDescriptionMeasureDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "MeasureDescription");
    private final static QName _DataWarehouseKpiMeasureDescriptionScorecardCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ScorecardCriteria");
    private final static QName _DataWarehouseKpiDescriptionDateRangeDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DateRangeDescription");
    private final static QName _DataWarehouseKpiDescriptionGroupingDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "GroupingDescription");
    private final static QName _DataWarehouseKpiDescriptionGroupingDescriptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "GroupingDescriptions");
    private final static QName _DataWarehouseKpiDescriptionKpiMeasureDescriptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiMeasureDescriptions");
    private final static QName _DataWarehouseKpiDescriptionRuleDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RuleDescription");
    private final static QName _DataWarehouseKpiDescriptionRuleDescriptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RuleDescriptions");
    private final static QName _DataWarehouseKpiDescriptionSortingDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "SortingDescription");
    private final static QName _DimensionFilterValuesEntityKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EntityKeys");
    private final static QName _DataWarehouseStopActualSequenceNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ActualSequenceNumber");
    private final static QName _DataWarehouseStopPlannedSequenceNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "PlannedSequenceNumber");
    private final static QName _DataWarehouseRouteDataActualEndTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ActualEndTime");
    private final static QName _DataWarehouseRouteDataActualRouteArrivalTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ActualRouteArrivalTime");
    private final static QName _DataWarehouseRouteDataActualRouteDepartureTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ActualRouteDepartureTime");
    private final static QName _DataWarehouseRouteDataActualStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ActualStartTime");
    private final static QName _DataWarehouseRouteDataPlannedEndTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "PlannedEndTime");
    private final static QName _DataWarehouseRouteDataPlannedRouteArrivalTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "PlannedRouteArrivalTime");
    private final static QName _DataWarehouseRouteDataPlannedRouteDepartureTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "PlannedRouteDepartureTime");
    private final static QName _DataWarehouseRouteDataPlannedStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "PlannedStartTime");
    private final static QName _LocationDimensionPropertyOptionsAccountOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "AccountOptions");
    private final static QName _LocationDimensionPropertyOptionsServiceLocationCategoryOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ServiceLocationCategoryOptions");
    private final static QName _EquipmentDimensionPropertyOptionsEquipmentManufacturerOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentManufacturerOptions");
    private final static QName _EquipmentDimensionPropertyOptionsEquipmentTypeOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentTypeOptions");
    private final static QName _EquipmentTypeDimensionPropertyOptionsEquipmentClassOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentClassOptions");
    private final static QName _KpiBasePropertyOptionsKpiFolderOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiFolderOptions");
    private final static QName _KpiExportJobInfoPropertyOptionsResultOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ResultOptions");
    private final static QName _DataWarehouseStopInfoDimensionDataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseStopInfoDimension_IsOffDayStop_ServicedDuringOffDay");
    private final static QName _DataWarehouseStopInfoDimensionDataWarehouseStopInfoDimensionStopExecutionTypeExecutionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseStopInfoDimension_StopExecutionType_ExecutionType");
    private final static QName _DataWarehouseStopInfoDimensionDataWarehouseStopTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseStopType_Type");
    private final static QName _DataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypeActualTimeWindowVarianceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTimeVarianceType_ActualTimeWindowVarianceType");
    private final static QName _DataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypeArrivalVarianceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTimeVarianceType_ArrivalVarianceType");
    private final static QName _DataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypeDepartureVarianceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTimeVarianceType_DepartureVarianceType");
    private final static QName _DataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTimeVarianceType_PlannedTimeWindowVarianceType");
    private final static QName _DataWarehouseDepotDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Description");
    private final static QName _DataWarehouseDepotDisabledDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DisabledDate");
    private final static QName _DataWarehouseDepotIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Identifier");
    private final static QName _DataWarehouseDepotOperationsUnitDimensionEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "OperationsUnitDimensionEntityKey");
    private final static QName _DataWarehouseDepotRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RegionIdentifier");
    private final static QName _DataWarehouseWorkerDimensionCreatedInRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "CreatedInRegionIdentifier");
    private final static QName _DataWarehouseWorkerDimensionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Name");
    private final static QName _DataWarehouseWorkerDimensionWorkerIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "WorkerIdentifier");
    private final static QName _DataWarehouseWorkerTypeDimensionWorkerTypeIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "WorkerTypeIdentifier");
    private final static QName _DataWarehouseTravelLegTypeDimensionDataWarehouseTravelLegTypeDimensionTravelLegTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTravelLegTypeDimension_TravelLegType_Type");
    private final static QName _DataWarehouseTimeDimensionDayOfWeekDayOfWeekLimiter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DayOfWeek_DayOfWeekLimiter");
    private final static QName _DataWarehouseTimeDimensionFirstDateInTimePeriod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "FirstDateInTimePeriod");
    private final static QName _DataWarehouseTimeDimensionGranularity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Granularity");
    private final static QName _DataWarehouseTimeDimensionLastDateInTimePeriod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "LastDateInTimePeriod");
    private final static QName _DataWarehouseTimeDimensionMonthLimiter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "MonthLimiter");
    private final static QName _DataWarehouseTimeDimensionQuarterLimiter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "QuarterLimiter");
    private final static QName _DataWarehouseTimeDimensionWeekLimiter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "WeekLimiter");
    private final static QName _DataWarehouseTimeDimensionYear_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Year");
    private final static QName _DataWarehouseServiceTypeDimensionDataWarehouseServiceTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseServiceType_Type");
    private final static QName _DataWarehouseServiceTypeDimensionStopActionTypeServiceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "StopActionType_ServiceType");
    private final static QName _DataWarehouseRouteDescriptorDimensionDisplayName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DisplayName");
    private final static QName _DataWarehouseRouteDescriptorDimensionScenarioIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ScenarioIdentifier");
    private final static QName _DataWarehouseLocationDimensionAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Account");
    private final static QName _DataWarehouseLocationDimensionDataWarehouseLocationTypeLocationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseLocationType_LocationType");
    private final static QName _DataWarehouseLocationDimensionLocationIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "LocationIdentifier");
    private final static QName _DataWarehouseLocationDimensionServiceLocationCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ServiceLocationCategory");
    private final static QName _DataWarehouseLocationDimensionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Type");
    private final static QName _DataWarehouseEquipmentDimensionEquipmentIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentIdentifier");
    private final static QName _DataWarehouseEquipmentDimensionEquipmentManufacturer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentManufacturer");
    private final static QName _DataWarehouseEquipmentDimensionEquipmentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentType");
    private final static QName _DataWarehouseEquipmentDimensionModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Model");
    private final static QName _DataWarehouseEquipmentDimensionModelYear_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ModelYear");
    private final static QName _DataWarehouseEquipmentTypeDimensionEquipmentClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentClass");
    private final static QName _DataWarehouseEquipmentTypeDimensionEquipmentTypeIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentTypeIdentifier");
    private final static QName _DataWarehouseRouteEquipmentClasses_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentClasses");
    private final static QName _DataWarehouseRouteEquipmentDescriptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentDescriptions");
    private final static QName _DataWarehouseRouteEquipmentIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentIds");
    private final static QName _DataWarehouseRouteEquipmentTypeDescriptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentTypeDescriptions");
    private final static QName _DataWarehouseRouteEquipmentTypeIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentTypeIds");
    private final static QName _DataWarehouseRouteWorkerIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "WorkerIds");
    private final static QName _DataWarehouseRouteWorkerNames_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "WorkerNames");
    private final static QName _DataWarehouseRouteWorkerTypeDescriptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "WorkerTypeDescriptions");
    private final static QName _DataWarehouseRouteWorkerTypeIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "WorkerTypeIds");
    private final static QName _DataWarehouseCargoUnitTypeDimensionCargoUnitType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "CargoUnitType");
    private final static QName _DataWarehouseCargoExceptionTypeDimensionDataWarehouseCargoExceptionTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCargoExceptionType_Type");
    private final static QName _DataWarehouseSpeedingExceptionRuleDimensionDataWarehouseResourceEventTypeEventType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseResourceEventType_EventType");
    private final static QName _DataWarehouseSpeedingExceptionRuleDimensionResourceExceptionRuleRuleTypeRuleType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ResourceExceptionRule_RuleType_RuleType");
    private final static QName _DataWarehouseSpeedingExceptionRuleDimensionRuleIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RuleIdentifier");
    private final static QName _DataWarehouseEquipmentClassDimensionEquipmentClassificationClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EquipmentClassification_Class");
    private final static QName _DataWarehousePlannedAndActualDimensionDataWarehousePlannedAndActualTypePlannedAndActual_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehousePlannedAndActualType_PlannedAndActual");
    private final static QName _DataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTimeVarianceType_RouteArrivalTimeVarianceType");
    private final static QName _DataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTimeVarianceType_RouteDepartureTimeVarianceType");
    private final static QName _DataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteEndTimeVarianceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTimeVarianceType_RouteEndTimeVarianceType");
    private final static QName _DataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteStartTimeVarianceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseTimeVarianceType_RouteStartTimeVarianceType");
    private final static QName _DataWarehouseKpiScheduleCultureName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "CultureName");
    private final static QName _DataWarehouseKpiScheduleDataWarehouseKpiOutputTypeOutputType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiOutputType_OutputType");
    private final static QName _DataWarehouseKpiScheduleEmailRecipients_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EmailRecipients");
    private final static QName _DataWarehouseKpiScheduleExecutionTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ExecutionTime");
    private final static QName _DataWarehouseKpiScheduleKpiName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiName");
    private final static QName _DataWarehouseKpiScheduleLastRunTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "LastRunTime");
    private final static QName _DataWarehouseKpiScheduleOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Options");
    private final static QName _DataWarehouseKpiScheduleWorldTimeZoneTimeZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "WorldTimeZone_TimeZone");
    private final static QName _DataWarehouseDailyKpiScheduleDayOfWeekFlagsDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DayOfWeekFlags_Days");
    private final static QName _DataWarehouseKpiBaseDataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseSecondaryDimensionType_GroupBySecondaryDimension");
    private final static QName _DataWarehouseKpiBaseEndDateTimeFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EndDateTimeFilter");
    private final static QName _DataWarehouseKpiBaseGroupBySecondaryDimensionAttribute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "GroupBySecondaryDimensionAttribute");
    private final static QName _DataWarehouseKpiBaseKpiFolder_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiFolder");
    private final static QName _DataWarehouseKpiBaseKpiSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "KpiSettings");
    private final static QName _DataWarehouseKpiBaseOperationsUnitDimensionFilterEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "OperationsUnitDimensionFilterEntityKey");
    private final static QName _DataWarehouseKpiBaseOperationsUnitDimensionsFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "OperationsUnitDimensionsFilter");
    private final static QName _DataWarehouseKpiBaseOwnerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "OwnerName");
    private final static QName _DataWarehouseKpiBaseRulesSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RulesSet");
    private final static QName _DataWarehouseKpiBaseSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Settings");
    private final static QName _DataWarehouseKpiBaseShareableEntityAccessPermissionPermission_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ShareableEntityAccessPermission_Permission");
    private final static QName _DataWarehouseKpiBaseStartDateTimeFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "StartDateTimeFilter");
    private final static QName _DataWarehouseKpiBaseStringifiedFilters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "StringifiedFilters");
    private final static QName _DataWarehouseKpiBaseTimeUnitGroupByTimeUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TimeUnit_GroupByTimeUnit");
    private final static QName _DataWarehouseKpiBaseTimeUnitSecondaryGroupByTimeUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TimeUnit_SecondaryGroupByTimeUnit");
    private final static QName _DataWarehouseKpiBaseTimeUnitTimeUnitFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TimeUnit_TimeUnitFilter");
    private final static QName _DataWarehouseKpiMeasureBaseCustomMeasureAverageEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "CustomMeasureAverageEntityKey");
    private final static QName _DataWarehouseKpiMeasureBaseCustomMeasureEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "CustomMeasureEntityKey");
    private final static QName _DataWarehouseKpiMeasureBaseDataWarehouseKpiMeasureMeasureAverageSettingAverageSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiMeasure_MeasureAverageSetting_AverageSetting");
    private final static QName _DataWarehouseKpiMeasureBaseDataWarehouseKpiMeasureMeasureCompareSettingCompareSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseKpiMeasure_MeasureCompareSetting_CompareSetting");
    private final static QName _SecondaryDimensionDescriberAttributeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "AttributeName");
    private final static QName _SecondaryDimensionDescriberDataWarehouseSecondaryDimensionTypeSecondaryDimension_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseSecondaryDimensionType_SecondaryDimension");
    private final static QName _TimeDimensionDescriberTimeUnitSecondaryTimeUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TimeUnit_SecondaryTimeUnit");
    private final static QName _TimeDimensionDescriberTimeUnitTimeUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TimeUnit_TimeUnit");
    private final static QName _DataWarehouseCustomMeasureAuthorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "AuthorName");
    private final static QName _DataWarehouseCustomMeasureDataWarehouseMeasureUsageOptionsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseMeasureUsageOptions_Options");
    private final static QName _DataWarehouseCustomMeasureFormula_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Formula");
    private final static QName _DataWarehouseCustomMeasureRawFormula_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "RawFormula");
    private final static QName _DataWarehouseCostTypeDimensionDataWarehouseCostTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseCostType_Type");
    private final static QName _DataWarehouseDimensionDataWarehouseDimensionDimensionCategoryCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDimension_DimensionCategory_Category");
    private final static QName _DataWarehouseIdlingTypeDimensionDataWarehouseIdlingTypeDimensionIdlingTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseIdlingTypeDimension_IdlingType_Type");
    private final static QName _DataWarehouseTelematicsDeviceDimensionTelematicsProviderTypeAccessoryType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "TelematicsProviderType_AccessoryType");
    private final static QName _DataWarehouseNavRecalculationReasonDimensionNavRecalculationReasonReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "NavRecalculationReason_Reason");
    private final static QName _DataWarehouseCleansingJobInfoResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Result");
    private final static QName _DataWarehouseKpiExportFileResultDataWarehouseFileTypeFileType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseFileType_FileType");
    private final static QName _DataWarehouseKpiExportFileResultFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "FileName");
    private final static QName _DataWarehouseKpiExportFileResultFileUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "FileUrl");
    private final static QName _DataWarehouseKpiExportJobInfoUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "UserName");
    private final static QName _DataWarehouseIntegrationStatusEndTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "EndTime");
    private final static QName _DataWarehouseIntegrationStatusIntegrationStatusStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "IntegrationStatus_Status");
    private final static QName _DataWarehouseOperationsUnitDimensionDataWarehouseDepotEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DataWarehouseDepotEntityKey");
    private final static QName _DataWarehouseOperationsUnitDimensionParentDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ParentDescription");
    private final static QName _DataWarehouseOperationsUnitDimensionParentEntityKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ParentEntityKey");
    private final static QName _DataWarehouseOperationsUnitDimensionParentIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "ParentIdentifier");
    private final static QName _DataWarehouseOperationsUnitLevelDepth_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Depth");
    private final static QName _KpiExportResultDtoContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "Content");
    private final static QName _MeasureUnitOptionsDistanceUnitDistanceUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "DistanceUnit_DistanceUnit");
    private final static QName _MeasureUnitOptionsLiquidVolumeUnitLiquidVolumeUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", "LiquidVolumeUnit_LiquidVolumeUnit");
    private final static QName _RetrieveNavRecalculationDetailsResultDestinationAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", "DestinationAddress");
    private final static QName _EquipmentProfileResultEquipmentTypeDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", "EquipmentTypeDescription");
    private final static QName _EquipmentProfileResultEquipmentTypeIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", "EquipmentTypeIdentifier");
    private final static QName _EquipmentProfileResultHeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", "Height");
    private final static QName _EquipmentProfileResultLength_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", "Length");
    private final static QName _EquipmentProfileResultWeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", "Weight");
    private final static QName _EquipmentProfileResultWidth_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", "Width");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EquipmentProfileResult }
     * 
     */
    public EquipmentProfileResult createEquipmentProfileResult() {
        return new EquipmentProfileResult();
    }

    /**
     * Create an instance of {@link ComplianceCompanySettings }
     * 
     */
    public ComplianceCompanySettings createComplianceCompanySettings() {
        return new ComplianceCompanySettings();
    }

    /**
     * Create an instance of {@link RetrieveNavRecalculationDetailsOptions }
     * 
     */
    public RetrieveNavRecalculationDetailsOptions createRetrieveNavRecalculationDetailsOptions() {
        return new RetrieveNavRecalculationDetailsOptions();
    }

    /**
     * Create an instance of {@link RetrieveNavRecalculationDetailsResult }
     * 
     */
    public RetrieveNavRecalculationDetailsResult createRetrieveNavRecalculationDetailsResult() {
        return new RetrieveNavRecalculationDetailsResult();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiBase }
     * 
     */
    public DataWarehouseKpiBase createDataWarehouseKpiBase() {
        return new DataWarehouseKpiBase();
    }

    /**
     * Create an instance of {@link MeasureUnitOptions }
     * 
     */
    public MeasureUnitOptions createMeasureUnitOptions() {
        return new MeasureUnitOptions();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseKpiExportJobInfo }
     * 
     */
    public ArrayOfDataWarehouseKpiExportJobInfo createArrayOfDataWarehouseKpiExportJobInfo() {
        return new ArrayOfDataWarehouseKpiExportJobInfo();
    }

    /**
     * Create an instance of {@link KpiExportResultDto }
     * 
     */
    public KpiExportResultDto createKpiExportResultDto() {
        return new KpiExportResultDto();
    }

    /**
     * Create an instance of {@link ArrayOfWorkerLogEvent }
     * 
     */
    public ArrayOfWorkerLogEvent createArrayOfWorkerLogEvent() {
        return new ArrayOfWorkerLogEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseOperationsUnitLevel }
     * 
     */
    public DataWarehouseOperationsUnitLevel createDataWarehouseOperationsUnitLevel() {
        return new DataWarehouseOperationsUnitLevel();
    }

    /**
     * Create an instance of {@link DataWarehouseOperationsUnitDimension }
     * 
     */
    public DataWarehouseOperationsUnitDimension createDataWarehouseOperationsUnitDimension() {
        return new DataWarehouseOperationsUnitDimension();
    }

    /**
     * Create an instance of {@link SimpleExpressionBase }
     * 
     */
    public SimpleExpressionBase createSimpleExpressionBase() {
        return new SimpleExpressionBase();
    }

    /**
     * Create an instance of {@link DataWarehouseIntegrationStatus }
     * 
     */
    public DataWarehouseIntegrationStatus createDataWarehouseIntegrationStatus() {
        return new DataWarehouseIntegrationStatus();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiExportJobInfo }
     * 
     */
    public DataWarehouseKpiExportJobInfo createDataWarehouseKpiExportJobInfo() {
        return new DataWarehouseKpiExportJobInfo();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiExportFileResult }
     * 
     */
    public DataWarehouseKpiExportFileResult createDataWarehouseKpiExportFileResult() {
        return new DataWarehouseKpiExportFileResult();
    }

    /**
     * Create an instance of {@link DataWarehouseCleansingJobInfo }
     * 
     */
    public DataWarehouseCleansingJobInfo createDataWarehouseCleansingJobInfo() {
        return new DataWarehouseCleansingJobInfo();
    }

    /**
     * Create an instance of {@link DataWarehouseCleansingResult }
     * 
     */
    public DataWarehouseCleansingResult createDataWarehouseCleansingResult() {
        return new DataWarehouseCleansingResult();
    }

    /**
     * Create an instance of {@link DataWarehouseMobileDeviceDimension }
     * 
     */
    public DataWarehouseMobileDeviceDimension createDataWarehouseMobileDeviceDimension() {
        return new DataWarehouseMobileDeviceDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseNavRecalculationReasonDimension }
     * 
     */
    public DataWarehouseNavRecalculationReasonDimension createDataWarehouseNavRecalculationReasonDimension() {
        return new DataWarehouseNavRecalculationReasonDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseTelematicsDeviceDimension }
     * 
     */
    public DataWarehouseTelematicsDeviceDimension createDataWarehouseTelematicsDeviceDimension() {
        return new DataWarehouseTelematicsDeviceDimension();
    }

    /**
     * Create an instance of {@link DataWarehousePowerTakeOffExceptionRuleDimension }
     * 
     */
    public DataWarehousePowerTakeOffExceptionRuleDimension createDataWarehousePowerTakeOffExceptionRuleDimension() {
        return new DataWarehousePowerTakeOffExceptionRuleDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseIdlingTypeDimension }
     * 
     */
    public DataWarehouseIdlingTypeDimension createDataWarehouseIdlingTypeDimension() {
        return new DataWarehouseIdlingTypeDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseDimension }
     * 
     */
    public DataWarehouseDimension createDataWarehouseDimension() {
        return new DataWarehouseDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseTelematicsDeviceInputOutputAccessoryDimension }
     * 
     */
    public DataWarehouseTelematicsDeviceInputOutputAccessoryDimension createDataWarehouseTelematicsDeviceInputOutputAccessoryDimension() {
        return new DataWarehouseTelematicsDeviceInputOutputAccessoryDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseAccountDimension }
     * 
     */
    public DataWarehouseAccountDimension createDataWarehouseAccountDimension() {
        return new DataWarehouseAccountDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseCostTypeDimension }
     * 
     */
    public DataWarehouseCostTypeDimension createDataWarehouseCostTypeDimension() {
        return new DataWarehouseCostTypeDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseCustomMeasure }
     * 
     */
    public DataWarehouseCustomMeasure createDataWarehouseCustomMeasure() {
        return new DataWarehouseCustomMeasure();
    }

    /**
     * Create an instance of {@link IMeasure }
     * 
     */
    public IMeasure createIMeasure() {
        return new IMeasure();
    }

    /**
     * Create an instance of {@link UserDefinedMeasure }
     * 
     */
    public UserDefinedMeasure createUserDefinedMeasure() {
        return new UserDefinedMeasure();
    }

    /**
     * Create an instance of {@link ArrayOfDimensionFilter }
     * 
     */
    public ArrayOfDimensionFilter createArrayOfDimensionFilter() {
        return new ArrayOfDimensionFilter();
    }

    /**
     * Create an instance of {@link DimensionFilter }
     * 
     */
    public DimensionFilter createDimensionFilter() {
        return new DimensionFilter();
    }

    /**
     * Create an instance of {@link DimensionDetail }
     * 
     */
    public DimensionDetail createDimensionDetail() {
        return new DimensionDetail();
    }

    /**
     * Create an instance of {@link DimensionDescriber }
     * 
     */
    public DimensionDescriber createDimensionDescriber() {
        return new DimensionDescriber();
    }

    /**
     * Create an instance of {@link WeekYearDimensionDescriber }
     * 
     */
    public WeekYearDimensionDescriber createWeekYearDimensionDescriber() {
        return new WeekYearDimensionDescriber();
    }

    /**
     * Create an instance of {@link OperationsUnitDimensionDescriber }
     * 
     */
    public OperationsUnitDimensionDescriber createOperationsUnitDimensionDescriber() {
        return new OperationsUnitDimensionDescriber();
    }

    /**
     * Create an instance of {@link TimeDimensionDescriber }
     * 
     */
    public TimeDimensionDescriber createTimeDimensionDescriber() {
        return new TimeDimensionDescriber();
    }

    /**
     * Create an instance of {@link SecondaryDimensionDescriber }
     * 
     */
    public SecondaryDimensionDescriber createSecondaryDimensionDescriber() {
        return new SecondaryDimensionDescriber();
    }

    /**
     * Create an instance of {@link DataWarehouseDoorStateExceptionRuleDimension }
     * 
     */
    public DataWarehouseDoorStateExceptionRuleDimension createDataWarehouseDoorStateExceptionRuleDimension() {
        return new DataWarehouseDoorStateExceptionRuleDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseEquipmentManufacturerDimension }
     * 
     */
    public DataWarehouseEquipmentManufacturerDimension createDataWarehouseEquipmentManufacturerDimension() {
        return new DataWarehouseEquipmentManufacturerDimension();
    }

    /**
     * Create an instance of {@link ArrayOfDimensionDescriber }
     * 
     */
    public ArrayOfDimensionDescriber createArrayOfDimensionDescriber() {
        return new ArrayOfDimensionDescriber();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiFolder }
     * 
     */
    public DataWarehouseKpiFolder createDataWarehouseKpiFolder() {
        return new DataWarehouseKpiFolder();
    }

    /**
     * Create an instance of {@link DataWarehouseScorecardKpi }
     * 
     */
    public DataWarehouseScorecardKpi createDataWarehouseScorecardKpi() {
        return new DataWarehouseScorecardKpi();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseScorecardKpiMeasure }
     * 
     */
    public ArrayOfDataWarehouseScorecardKpiMeasure createArrayOfDataWarehouseScorecardKpiMeasure() {
        return new ArrayOfDataWarehouseScorecardKpiMeasure();
    }

    /**
     * Create an instance of {@link DataWarehouseScorecardKpiMeasure }
     * 
     */
    public DataWarehouseScorecardKpiMeasure createDataWarehouseScorecardKpiMeasure() {
        return new DataWarehouseScorecardKpiMeasure();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiMeasureBase }
     * 
     */
    public DataWarehouseKpiMeasureBase createDataWarehouseKpiMeasureBase() {
        return new DataWarehouseKpiMeasureBase();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiMeasure }
     * 
     */
    public DataWarehouseKpiMeasure createDataWarehouseKpiMeasure() {
        return new DataWarehouseKpiMeasure();
    }

    /**
     * Create an instance of {@link DataWarehouseKpi }
     * 
     */
    public DataWarehouseKpi createDataWarehouseKpi() {
        return new DataWarehouseKpi();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseKpiMeasure }
     * 
     */
    public ArrayOfDataWarehouseKpiMeasure createArrayOfDataWarehouseKpiMeasure() {
        return new ArrayOfDataWarehouseKpiMeasure();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiSchedule }
     * 
     */
    public DataWarehouseKpiSchedule createDataWarehouseKpiSchedule() {
        return new DataWarehouseKpiSchedule();
    }

    /**
     * Create an instance of {@link DataWarehouseDailyKpiSchedule }
     * 
     */
    public DataWarehouseDailyKpiSchedule createDataWarehouseDailyKpiSchedule() {
        return new DataWarehouseDailyKpiSchedule();
    }

    /**
     * Create an instance of {@link DataWarehouseMonthlyKpiSchedule }
     * 
     */
    public DataWarehouseMonthlyKpiSchedule createDataWarehouseMonthlyKpiSchedule() {
        return new DataWarehouseMonthlyKpiSchedule();
    }

    /**
     * Create an instance of {@link DataWarehouseRouteInfoDimension }
     * 
     */
    public DataWarehouseRouteInfoDimension createDataWarehouseRouteInfoDimension() {
        return new DataWarehouseRouteInfoDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseServiceLocationCategoryDimension }
     * 
     */
    public DataWarehouseServiceLocationCategoryDimension createDataWarehouseServiceLocationCategoryDimension() {
        return new DataWarehouseServiceLocationCategoryDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseTemperatureExceptionRuleDimension }
     * 
     */
    public DataWarehouseTemperatureExceptionRuleDimension createDataWarehouseTemperatureExceptionRuleDimension() {
        return new DataWarehouseTemperatureExceptionRuleDimension();
    }

    /**
     * Create an instance of {@link DataWarehousePlannedAndActualDimension }
     * 
     */
    public DataWarehousePlannedAndActualDimension createDataWarehousePlannedAndActualDimension() {
        return new DataWarehousePlannedAndActualDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseEquipmentClassDimension }
     * 
     */
    public DataWarehouseEquipmentClassDimension createDataWarehouseEquipmentClassDimension() {
        return new DataWarehouseEquipmentClassDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseEngineIdleExceptionRuleDimension }
     * 
     */
    public DataWarehouseEngineIdleExceptionRuleDimension createDataWarehouseEngineIdleExceptionRuleDimension() {
        return new DataWarehouseEngineIdleExceptionRuleDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseSpeedingExceptionRuleDimension }
     * 
     */
    public DataWarehouseSpeedingExceptionRuleDimension createDataWarehouseSpeedingExceptionRuleDimension() {
        return new DataWarehouseSpeedingExceptionRuleDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseCargoExceptionTypeDimension }
     * 
     */
    public DataWarehouseCargoExceptionTypeDimension createDataWarehouseCargoExceptionTypeDimension() {
        return new DataWarehouseCargoExceptionTypeDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseCargoUnitTypeDimension }
     * 
     */
    public DataWarehouseCargoUnitTypeDimension createDataWarehouseCargoUnitTypeDimension() {
        return new DataWarehouseCargoUnitTypeDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseRoute }
     * 
     */
    public DataWarehouseRoute createDataWarehouseRoute() {
        return new DataWarehouseRoute();
    }

    /**
     * Create an instance of {@link DataWarehouseEquipmentTypeDimension }
     * 
     */
    public DataWarehouseEquipmentTypeDimension createDataWarehouseEquipmentTypeDimension() {
        return new DataWarehouseEquipmentTypeDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseEquipmentDimension }
     * 
     */
    public DataWarehouseEquipmentDimension createDataWarehouseEquipmentDimension() {
        return new DataWarehouseEquipmentDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseLocationDimension }
     * 
     */
    public DataWarehouseLocationDimension createDataWarehouseLocationDimension() {
        return new DataWarehouseLocationDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseRouteDescriptorDimension }
     * 
     */
    public DataWarehouseRouteDescriptorDimension createDataWarehouseRouteDescriptorDimension() {
        return new DataWarehouseRouteDescriptorDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseServiceTypeDimension }
     * 
     */
    public DataWarehouseServiceTypeDimension createDataWarehouseServiceTypeDimension() {
        return new DataWarehouseServiceTypeDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseStopTypeDimension }
     * 
     */
    public DataWarehouseStopTypeDimension createDataWarehouseStopTypeDimension() {
        return new DataWarehouseStopTypeDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseTimeDimension }
     * 
     */
    public DataWarehouseTimeDimension createDataWarehouseTimeDimension() {
        return new DataWarehouseTimeDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseTravelLegTypeDimension }
     * 
     */
    public DataWarehouseTravelLegTypeDimension createDataWarehouseTravelLegTypeDimension() {
        return new DataWarehouseTravelLegTypeDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseWorkerTypeDimension }
     * 
     */
    public DataWarehouseWorkerTypeDimension createDataWarehouseWorkerTypeDimension() {
        return new DataWarehouseWorkerTypeDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseWorkerDimension }
     * 
     */
    public DataWarehouseWorkerDimension createDataWarehouseWorkerDimension() {
        return new DataWarehouseWorkerDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseDepot }
     * 
     */
    public DataWarehouseDepot createDataWarehouseDepot() {
        return new DataWarehouseDepot();
    }

    /**
     * Create an instance of {@link DataWarehouseStopInfoDimension }
     * 
     */
    public DataWarehouseStopInfoDimension createDataWarehouseStopInfoDimension() {
        return new DataWarehouseStopInfoDimension();
    }

    /**
     * Create an instance of {@link DataWarehouseOperationsUnitPermission }
     * 
     */
    public DataWarehouseOperationsUnitPermission createDataWarehouseOperationsUnitPermission() {
        return new DataWarehouseOperationsUnitPermission();
    }

    /**
     * Create an instance of {@link FileResultPropertyOptions }
     * 
     */
    public FileResultPropertyOptions createFileResultPropertyOptions() {
        return new FileResultPropertyOptions();
    }

    /**
     * Create an instance of {@link KpiExportJobInfoPropertyOptions }
     * 
     */
    public KpiExportJobInfoPropertyOptions createKpiExportJobInfoPropertyOptions() {
        return new KpiExportJobInfoPropertyOptions();
    }

    /**
     * Create an instance of {@link MobileDeviceDimensionPropertyOptions }
     * 
     */
    public MobileDeviceDimensionPropertyOptions createMobileDeviceDimensionPropertyOptions() {
        return new MobileDeviceDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link NavRecalculationReasonDimensionPropertyOptions }
     * 
     */
    public NavRecalculationReasonDimensionPropertyOptions createNavRecalculationReasonDimensionPropertyOptions() {
        return new NavRecalculationReasonDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link TelematicsDeviceDimensionPropertyOptions }
     * 
     */
    public TelematicsDeviceDimensionPropertyOptions createTelematicsDeviceDimensionPropertyOptions() {
        return new TelematicsDeviceDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link PowerTakeOffExceptionRuleDimensionPropertyOptions }
     * 
     */
    public PowerTakeOffExceptionRuleDimensionPropertyOptions createPowerTakeOffExceptionRuleDimensionPropertyOptions() {
        return new PowerTakeOffExceptionRuleDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link IdlingTypeDimensionPropertyOptions }
     * 
     */
    public IdlingTypeDimensionPropertyOptions createIdlingTypeDimensionPropertyOptions() {
        return new IdlingTypeDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link DimensionPropertyOptions }
     * 
     */
    public DimensionPropertyOptions createDimensionPropertyOptions() {
        return new DimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link OperationsUnitDimensionPropertyOptions }
     * 
     */
    public OperationsUnitDimensionPropertyOptions createOperationsUnitDimensionPropertyOptions() {
        return new OperationsUnitDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions }
     * 
     */
    public TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions createTelematicsDeviceInputOutputAccessoryDimensionPropertyOptions() {
        return new TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link StopInfoDimensionPropertyOptions }
     * 
     */
    public StopInfoDimensionPropertyOptions createStopInfoDimensionPropertyOptions() {
        return new StopInfoDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link AccountDimensionPropertyOptions }
     * 
     */
    public AccountDimensionPropertyOptions createAccountDimensionPropertyOptions() {
        return new AccountDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link CostTypeDimensionPropertyOptions }
     * 
     */
    public CostTypeDimensionPropertyOptions createCostTypeDimensionPropertyOptions() {
        return new CostTypeDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link CustomMeasurePropertyOptions }
     * 
     */
    public CustomMeasurePropertyOptions createCustomMeasurePropertyOptions() {
        return new CustomMeasurePropertyOptions();
    }

    /**
     * Create an instance of {@link DoorStateExceptionRuleDimensionPropertyOptions }
     * 
     */
    public DoorStateExceptionRuleDimensionPropertyOptions createDoorStateExceptionRuleDimensionPropertyOptions() {
        return new DoorStateExceptionRuleDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link EquipmentManufacturerDimensionPropertyOptions }
     * 
     */
    public EquipmentManufacturerDimensionPropertyOptions createEquipmentManufacturerDimensionPropertyOptions() {
        return new EquipmentManufacturerDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link KpiBasePropertyOptions }
     * 
     */
    public KpiBasePropertyOptions createKpiBasePropertyOptions() {
        return new KpiBasePropertyOptions();
    }

    /**
     * Create an instance of {@link KpiFolderPropertyOptions }
     * 
     */
    public KpiFolderPropertyOptions createKpiFolderPropertyOptions() {
        return new KpiFolderPropertyOptions();
    }

    /**
     * Create an instance of {@link ScorecardKpiPropertyOptions }
     * 
     */
    public ScorecardKpiPropertyOptions createScorecardKpiPropertyOptions() {
        return new ScorecardKpiPropertyOptions();
    }

    /**
     * Create an instance of {@link KpiPropertyOptions }
     * 
     */
    public KpiPropertyOptions createKpiPropertyOptions() {
        return new KpiPropertyOptions();
    }

    /**
     * Create an instance of {@link KpiMeasureBasePropertyOptions }
     * 
     */
    public KpiMeasureBasePropertyOptions createKpiMeasureBasePropertyOptions() {
        return new KpiMeasureBasePropertyOptions();
    }

    /**
     * Create an instance of {@link ScorecardKpiMeasurePropertyOptions }
     * 
     */
    public ScorecardKpiMeasurePropertyOptions createScorecardKpiMeasurePropertyOptions() {
        return new ScorecardKpiMeasurePropertyOptions();
    }

    /**
     * Create an instance of {@link KpiMeasurePropertyOptions }
     * 
     */
    public KpiMeasurePropertyOptions createKpiMeasurePropertyOptions() {
        return new KpiMeasurePropertyOptions();
    }

    /**
     * Create an instance of {@link KpiSchedulePropertyOptions }
     * 
     */
    public KpiSchedulePropertyOptions createKpiSchedulePropertyOptions() {
        return new KpiSchedulePropertyOptions();
    }

    /**
     * Create an instance of {@link DailyKpiSchedulePropertyOptions }
     * 
     */
    public DailyKpiSchedulePropertyOptions createDailyKpiSchedulePropertyOptions() {
        return new DailyKpiSchedulePropertyOptions();
    }

    /**
     * Create an instance of {@link MonthlyKpiSchedulePropertyOptions }
     * 
     */
    public MonthlyKpiSchedulePropertyOptions createMonthlyKpiSchedulePropertyOptions() {
        return new MonthlyKpiSchedulePropertyOptions();
    }

    /**
     * Create an instance of {@link RouteInfoDimensionPropertyOptions }
     * 
     */
    public RouteInfoDimensionPropertyOptions createRouteInfoDimensionPropertyOptions() {
        return new RouteInfoDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link ServiceLocationCategoryDimensionPropertyOptions }
     * 
     */
    public ServiceLocationCategoryDimensionPropertyOptions createServiceLocationCategoryDimensionPropertyOptions() {
        return new ServiceLocationCategoryDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link TemperatureExceptionRuleDimensionPropertyOptions }
     * 
     */
    public TemperatureExceptionRuleDimensionPropertyOptions createTemperatureExceptionRuleDimensionPropertyOptions() {
        return new TemperatureExceptionRuleDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link PlannedAndActualDimensionPropertyOptions }
     * 
     */
    public PlannedAndActualDimensionPropertyOptions createPlannedAndActualDimensionPropertyOptions() {
        return new PlannedAndActualDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link EquipmentClassDimensionPropertyOptions }
     * 
     */
    public EquipmentClassDimensionPropertyOptions createEquipmentClassDimensionPropertyOptions() {
        return new EquipmentClassDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link EngineIdleExceptionRuleDimensionPropertyOptions }
     * 
     */
    public EngineIdleExceptionRuleDimensionPropertyOptions createEngineIdleExceptionRuleDimensionPropertyOptions() {
        return new EngineIdleExceptionRuleDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link SpeedingExceptionRuleDimensionPropertyOptions }
     * 
     */
    public SpeedingExceptionRuleDimensionPropertyOptions createSpeedingExceptionRuleDimensionPropertyOptions() {
        return new SpeedingExceptionRuleDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link CargoExceptionTypeDimensionPropertyOptions }
     * 
     */
    public CargoExceptionTypeDimensionPropertyOptions createCargoExceptionTypeDimensionPropertyOptions() {
        return new CargoExceptionTypeDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link CargoUnitTypeDimensionPropertyOptions }
     * 
     */
    public CargoUnitTypeDimensionPropertyOptions createCargoUnitTypeDimensionPropertyOptions() {
        return new CargoUnitTypeDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link DataWarehouseIntegrationStatusPropertyOptions }
     * 
     */
    public DataWarehouseIntegrationStatusPropertyOptions createDataWarehouseIntegrationStatusPropertyOptions() {
        return new DataWarehouseIntegrationStatusPropertyOptions();
    }

    /**
     * Create an instance of {@link DataWarehouseRoutePropertyOptions }
     * 
     */
    public DataWarehouseRoutePropertyOptions createDataWarehouseRoutePropertyOptions() {
        return new DataWarehouseRoutePropertyOptions();
    }

    /**
     * Create an instance of {@link EquipmentTypeDimensionPropertyOptions }
     * 
     */
    public EquipmentTypeDimensionPropertyOptions createEquipmentTypeDimensionPropertyOptions() {
        return new EquipmentTypeDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link EquipmentDimensionPropertyOptions }
     * 
     */
    public EquipmentDimensionPropertyOptions createEquipmentDimensionPropertyOptions() {
        return new EquipmentDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link LocationDimensionPropertyOptions }
     * 
     */
    public LocationDimensionPropertyOptions createLocationDimensionPropertyOptions() {
        return new LocationDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link OperationsUnitLevelPropertyOptions }
     * 
     */
    public OperationsUnitLevelPropertyOptions createOperationsUnitLevelPropertyOptions() {
        return new OperationsUnitLevelPropertyOptions();
    }

    /**
     * Create an instance of {@link OperationsUnitPermissionPropertyOptions }
     * 
     */
    public OperationsUnitPermissionPropertyOptions createOperationsUnitPermissionPropertyOptions() {
        return new OperationsUnitPermissionPropertyOptions();
    }

    /**
     * Create an instance of {@link RouteDescriptorDimensionPropertyOptions }
     * 
     */
    public RouteDescriptorDimensionPropertyOptions createRouteDescriptorDimensionPropertyOptions() {
        return new RouteDescriptorDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link ServiceTypeDimensionPropertyOptions }
     * 
     */
    public ServiceTypeDimensionPropertyOptions createServiceTypeDimensionPropertyOptions() {
        return new ServiceTypeDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link StopTypeDimensionPropertyOptions }
     * 
     */
    public StopTypeDimensionPropertyOptions createStopTypeDimensionPropertyOptions() {
        return new StopTypeDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link TimeDimensionPropertyOptions }
     * 
     */
    public TimeDimensionPropertyOptions createTimeDimensionPropertyOptions() {
        return new TimeDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link TravelLegTypeDimensionPropertyOptions }
     * 
     */
    public TravelLegTypeDimensionPropertyOptions createTravelLegTypeDimensionPropertyOptions() {
        return new TravelLegTypeDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link WorkerTypeDimensionPropertyOptions }
     * 
     */
    public WorkerTypeDimensionPropertyOptions createWorkerTypeDimensionPropertyOptions() {
        return new WorkerTypeDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link WorkerDimensionPropertyOptions }
     * 
     */
    public WorkerDimensionPropertyOptions createWorkerDimensionPropertyOptions() {
        return new WorkerDimensionPropertyOptions();
    }

    /**
     * Create an instance of {@link DataWarehouseDepotPropertyOptions }
     * 
     */
    public DataWarehouseDepotPropertyOptions createDataWarehouseDepotPropertyOptions() {
        return new DataWarehouseDepotPropertyOptions();
    }

    /**
     * Create an instance of {@link DataWarehouseRouteData }
     * 
     */
    public DataWarehouseRouteData createDataWarehouseRouteData() {
        return new DataWarehouseRouteData();
    }

    /**
     * Create an instance of {@link DataWarehouseStop }
     * 
     */
    public DataWarehouseStop createDataWarehouseStop() {
        return new DataWarehouseStop();
    }

    /**
     * Create an instance of {@link DimensionFilterValues }
     * 
     */
    public DimensionFilterValues createDimensionFilterValues() {
        return new DimensionFilterValues();
    }

    /**
     * Create an instance of {@link Filters }
     * 
     */
    public Filters createFilters() {
        return new Filters();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiDescription }
     * 
     */
    public DataWarehouseKpiDescription createDataWarehouseKpiDescription() {
        return new DataWarehouseKpiDescription();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseKpiMeasureDescription }
     * 
     */
    public ArrayOfDataWarehouseKpiMeasureDescription createArrayOfDataWarehouseKpiMeasureDescription() {
        return new ArrayOfDataWarehouseKpiMeasureDescription();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiMeasureDescription }
     * 
     */
    public DataWarehouseKpiMeasureDescription createDataWarehouseKpiMeasureDescription() {
        return new DataWarehouseKpiMeasureDescription();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiSettings }
     * 
     */
    public DataWarehouseKpiSettings createDataWarehouseKpiSettings() {
        return new DataWarehouseKpiSettings();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiSortingOptions }
     * 
     */
    public DataWarehouseKpiSortingOptions createDataWarehouseKpiSortingOptions() {
        return new DataWarehouseKpiSortingOptions();
    }

    /**
     * Create an instance of {@link DataWarehouseResourceEvent }
     * 
     */
    public DataWarehouseResourceEvent createDataWarehouseResourceEvent() {
        return new DataWarehouseResourceEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseNavEvent }
     * 
     */
    public DataWarehouseNavEvent createDataWarehouseNavEvent() {
        return new DataWarehouseNavEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseNavRecalculationEvent }
     * 
     */
    public DataWarehouseNavRecalculationEvent createDataWarehouseNavRecalculationEvent() {
        return new DataWarehouseNavRecalculationEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseTelematicsEvent }
     * 
     */
    public DataWarehouseTelematicsEvent createDataWarehouseTelematicsEvent() {
        return new DataWarehouseTelematicsEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseTelematicsDeviceInputOutputAccessoryEvent }
     * 
     */
    public DataWarehouseTelematicsDeviceInputOutputAccessoryEvent createDataWarehouseTelematicsDeviceInputOutputAccessoryEvent() {
        return new DataWarehouseTelematicsDeviceInputOutputAccessoryEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseDoorStateException }
     * 
     */
    public DataWarehouseDoorStateException createDataWarehouseDoorStateException() {
        return new DataWarehouseDoorStateException();
    }

    /**
     * Create an instance of {@link DataWarehouseEngineIdleEvent }
     * 
     */
    public DataWarehouseEngineIdleEvent createDataWarehouseEngineIdleEvent() {
        return new DataWarehouseEngineIdleEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseHarshEvent }
     * 
     */
    public DataWarehouseHarshEvent createDataWarehouseHarshEvent() {
        return new DataWarehouseHarshEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseHarshAccelerationEvent }
     * 
     */
    public DataWarehouseHarshAccelerationEvent createDataWarehouseHarshAccelerationEvent() {
        return new DataWarehouseHarshAccelerationEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseHarshBrakingEvent }
     * 
     */
    public DataWarehouseHarshBrakingEvent createDataWarehouseHarshBrakingEvent() {
        return new DataWarehouseHarshBrakingEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseHarshCorneringEvent }
     * 
     */
    public DataWarehouseHarshCorneringEvent createDataWarehouseHarshCorneringEvent() {
        return new DataWarehouseHarshCorneringEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseSpeedingEvent }
     * 
     */
    public DataWarehouseSpeedingEvent createDataWarehouseSpeedingEvent() {
        return new DataWarehouseSpeedingEvent();
    }

    /**
     * Create an instance of {@link DataWarehouseTemperatureException }
     * 
     */
    public DataWarehouseTemperatureException createDataWarehouseTemperatureException() {
        return new DataWarehouseTemperatureException();
    }

    /**
     * Create an instance of {@link DimensionKeyDetail }
     * 
     */
    public DimensionKeyDetail createDimensionKeyDetail() {
        return new DimensionKeyDetail();
    }

    /**
     * Create an instance of {@link BooleanDimensionDetail }
     * 
     */
    public BooleanDimensionDetail createBooleanDimensionDetail() {
        return new BooleanDimensionDetail();
    }

    /**
     * Create an instance of {@link EnumDimensionDetail }
     * 
     */
    public EnumDimensionDetail createEnumDimensionDetail() {
        return new EnumDimensionDetail();
    }

    /**
     * Create an instance of {@link TimeVarianceDimensionDetail }
     * 
     */
    public TimeVarianceDimensionDetail createTimeVarianceDimensionDetail() {
        return new TimeVarianceDimensionDetail();
    }

    /**
     * Create an instance of {@link PlannedAndActualDimensionDetail }
     * 
     */
    public PlannedAndActualDimensionDetail createPlannedAndActualDimensionDetail() {
        return new PlannedAndActualDimensionDetail();
    }

    /**
     * Create an instance of {@link LocationTypeDimensionDetail }
     * 
     */
    public LocationTypeDimensionDetail createLocationTypeDimensionDetail() {
        return new LocationTypeDimensionDetail();
    }

    /**
     * Create an instance of {@link NumericDimensionDetail }
     * 
     */
    public NumericDimensionDetail createNumericDimensionDetail() {
        return new NumericDimensionDetail();
    }

    /**
     * Create an instance of {@link SecondaryDimensionDetail }
     * 
     */
    public SecondaryDimensionDetail createSecondaryDimensionDetail() {
        return new SecondaryDimensionDetail();
    }

    /**
     * Create an instance of {@link StringDimensionDetail }
     * 
     */
    public StringDimensionDetail createStringDimensionDetail() {
        return new StringDimensionDetail();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiCriteria }
     * 
     */
    public DataWarehouseKpiCriteria createDataWarehouseKpiCriteria() {
        return new DataWarehouseKpiCriteria();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiMeasureFilter }
     * 
     */
    public DataWarehouseKpiMeasureFilter createDataWarehouseKpiMeasureFilter() {
        return new DataWarehouseKpiMeasureFilter();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseKpiMeasureDataFilter }
     * 
     */
    public ArrayOfDataWarehouseKpiMeasureDataFilter createArrayOfDataWarehouseKpiMeasureDataFilter() {
        return new ArrayOfDataWarehouseKpiMeasureDataFilter();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiMeasureDataFilter }
     * 
     */
    public DataWarehouseKpiMeasureDataFilter createDataWarehouseKpiMeasureDataFilter() {
        return new DataWarehouseKpiMeasureDataFilter();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiOperationsUnitDimensionsFilter }
     * 
     */
    public DataWarehouseKpiOperationsUnitDimensionsFilter createDataWarehouseKpiOperationsUnitDimensionsFilter() {
        return new DataWarehouseKpiOperationsUnitDimensionsFilter();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiRule }
     * 
     */
    public DataWarehouseKpiRule createDataWarehouseKpiRule() {
        return new DataWarehouseKpiRule();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseKpiCriteria }
     * 
     */
    public ArrayOfDataWarehouseKpiCriteria createArrayOfDataWarehouseKpiCriteria() {
        return new ArrayOfDataWarehouseKpiCriteria();
    }

    /**
     * Create an instance of {@link DataWarehouseKpiRulesSet }
     * 
     */
    public DataWarehouseKpiRulesSet createDataWarehouseKpiRulesSet() {
        return new DataWarehouseKpiRulesSet();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseKpiRule }
     * 
     */
    public ArrayOfDataWarehouseKpiRule createArrayOfDataWarehouseKpiRule() {
        return new ArrayOfDataWarehouseKpiRule();
    }

    /**
     * Create an instance of {@link AtomicMeasure }
     * 
     */
    public AtomicMeasure createAtomicMeasure() {
        return new AtomicMeasure();
    }

    /**
     * Create an instance of {@link CompositeMeasure }
     * 
     */
    public CompositeMeasure createCompositeMeasure() {
        return new CompositeMeasure();
    }

    /**
     * Create an instance of {@link DayCountMeasure }
     * 
     */
    public DayCountMeasure createDayCountMeasure() {
        return new DayCountMeasure();
    }

    /**
     * Create an instance of {@link MultiMeasure }
     * 
     */
    public MultiMeasure createMultiMeasure() {
        return new MultiMeasure();
    }

    /**
     * Create an instance of {@link ArrayOfIMeasure }
     * 
     */
    public ArrayOfIMeasure createArrayOfIMeasure() {
        return new ArrayOfIMeasure();
    }

    /**
     * Create an instance of {@link PredefinedCompositeMeasure }
     * 
     */
    public PredefinedCompositeMeasure createPredefinedCompositeMeasure() {
        return new PredefinedCompositeMeasure();
    }

    /**
     * Create an instance of {@link ScoreMeasure }
     * 
     */
    public ScoreMeasure createScoreMeasure() {
        return new ScoreMeasure();
    }

    /**
     * Create an instance of {@link ArrayOfScorecardBand }
     * 
     */
    public ArrayOfScorecardBand createArrayOfScorecardBand() {
        return new ArrayOfScorecardBand();
    }

    /**
     * Create an instance of {@link ScorecardBand }
     * 
     */
    public ScorecardBand createScorecardBand() {
        return new ScorecardBand();
    }

    /**
     * Create an instance of {@link ScorecardBandThreshold }
     * 
     */
    public ScorecardBandThreshold createScorecardBandThreshold() {
        return new ScorecardBandThreshold();
    }

    /**
     * Create an instance of {@link SecondaryDimensionCountMeasure }
     * 
     */
    public SecondaryDimensionCountMeasure createSecondaryDimensionCountMeasure() {
        return new SecondaryDimensionCountMeasure();
    }

    /**
     * Create an instance of {@link ValueMeasure }
     * 
     */
    public ValueMeasure createValueMeasure() {
        return new ValueMeasure();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseOperationsUnitPermission }
     * 
     */
    public ArrayOfDataWarehouseOperationsUnitPermission createArrayOfDataWarehouseOperationsUnitPermission() {
        return new ArrayOfDataWarehouseOperationsUnitPermission();
    }

    /**
     * Create an instance of {@link ArrayOfDimensionDetail }
     * 
     */
    public ArrayOfDimensionDetail createArrayOfDimensionDetail() {
        return new ArrayOfDimensionDetail();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseSecondaryDimensionType }
     * 
     */
    public ArrayOfDataWarehouseSecondaryDimensionType createArrayOfDataWarehouseSecondaryDimensionType() {
        return new ArrayOfDataWarehouseSecondaryDimensionType();
    }

    /**
     * Create an instance of {@link DataWarehouseScorecardKpiMeasureCriteria }
     * 
     */
    public DataWarehouseScorecardKpiMeasureCriteria createDataWarehouseScorecardKpiMeasureCriteria() {
        return new DataWarehouseScorecardKpiMeasureCriteria();
    }

    /**
     * Create an instance of {@link BinaryExpressionBase }
     * 
     */
    public BinaryExpressionBase createBinaryExpressionBase() {
        return new BinaryExpressionBase();
    }

    /**
     * Create an instance of {@link ArithmeticExpressionBase }
     * 
     */
    public ArithmeticExpressionBase createArithmeticExpressionBase() {
        return new ArithmeticExpressionBase();
    }

    /**
     * Create an instance of {@link AddExpression }
     * 
     */
    public AddExpression createAddExpression() {
        return new AddExpression();
    }

    /**
     * Create an instance of {@link MultiplyExpression }
     * 
     */
    public MultiplyExpression createMultiplyExpression() {
        return new MultiplyExpression();
    }

    /**
     * Create an instance of {@link DivideExpression }
     * 
     */
    public DivideExpression createDivideExpression() {
        return new DivideExpression();
    }

    /**
     * Create an instance of {@link SubtractExpression }
     * 
     */
    public SubtractExpression createSubtractExpression() {
        return new SubtractExpression();
    }

    /**
     * Create an instance of {@link ComparisonExpressionBase }
     * 
     */
    public ComparisonExpressionBase createComparisonExpressionBase() {
        return new ComparisonExpressionBase();
    }

    /**
     * Create an instance of {@link SpatialWithinExpression }
     * 
     */
    public SpatialWithinExpression createSpatialWithinExpression() {
        return new SpatialWithinExpression();
    }

    /**
     * Create an instance of {@link EqualToExpression }
     * 
     */
    public EqualToExpression createEqualToExpression() {
        return new EqualToExpression();
    }

    /**
     * Create an instance of {@link GreaterThanExpression }
     * 
     */
    public GreaterThanExpression createGreaterThanExpression() {
        return new GreaterThanExpression();
    }

    /**
     * Create an instance of {@link GreaterThanOrEqualToExpression }
     * 
     */
    public GreaterThanOrEqualToExpression createGreaterThanOrEqualToExpression() {
        return new GreaterThanOrEqualToExpression();
    }

    /**
     * Create an instance of {@link InExpression }
     * 
     */
    public InExpression createInExpression() {
        return new InExpression();
    }

    /**
     * Create an instance of {@link LessThanExpression }
     * 
     */
    public LessThanExpression createLessThanExpression() {
        return new LessThanExpression();
    }

    /**
     * Create an instance of {@link LessThanOrEqualToExpression }
     * 
     */
    public LessThanOrEqualToExpression createLessThanOrEqualToExpression() {
        return new LessThanOrEqualToExpression();
    }

    /**
     * Create an instance of {@link LikeExpression }
     * 
     */
    public LikeExpression createLikeExpression() {
        return new LikeExpression();
    }

    /**
     * Create an instance of {@link ValueExpression }
     * 
     */
    public ValueExpression createValueExpression() {
        return new ValueExpression();
    }

    /**
     * Create an instance of {@link PropertyExpression }
     * 
     */
    public PropertyExpression createPropertyExpression() {
        return new PropertyExpression();
    }

    /**
     * Create an instance of {@link CompositeExpressionBase }
     * 
     */
    public CompositeExpressionBase createCompositeExpressionBase() {
        return new CompositeExpressionBase();
    }

    /**
     * Create an instance of {@link ArrayOfSimpleExpressionBase }
     * 
     */
    public ArrayOfSimpleExpressionBase createArrayOfSimpleExpressionBase() {
        return new ArrayOfSimpleExpressionBase();
    }

    /**
     * Create an instance of {@link AndExpression }
     * 
     */
    public AndExpression createAndExpression() {
        return new AndExpression();
    }

    /**
     * Create an instance of {@link OrExpression }
     * 
     */
    public OrExpression createOrExpression() {
        return new OrExpression();
    }

    /**
     * Create an instance of {@link NotExpression }
     * 
     */
    public NotExpression createNotExpression() {
        return new NotExpression();
    }

    /**
     * Create an instance of {@link ResourceExceptionRuleFunction }
     * 
     */
    public ResourceExceptionRuleFunction createResourceExceptionRuleFunction() {
        return new ResourceExceptionRuleFunction();
    }

    /**
     * Create an instance of {@link NavClientRoutePathDeviationFunction }
     * 
     */
    public NavClientRoutePathDeviationFunction createNavClientRoutePathDeviationFunction() {
        return new NavClientRoutePathDeviationFunction();
    }

    /**
     * Create an instance of {@link NavClientSpeedViolationFunction }
     * 
     */
    public NavClientSpeedViolationFunction createNavClientSpeedViolationFunction() {
        return new NavClientSpeedViolationFunction();
    }

    /**
     * Create an instance of {@link DiagnosticTroubleCodeFunction }
     * 
     */
    public DiagnosticTroubleCodeFunction createDiagnosticTroubleCodeFunction() {
        return new DiagnosticTroubleCodeFunction();
    }

    /**
     * Create an instance of {@link ResourceExceptionSpecialDescriptor }
     * 
     */
    public ResourceExceptionSpecialDescriptor createResourceExceptionSpecialDescriptor() {
        return new ResourceExceptionSpecialDescriptor();
    }

    /**
     * Create an instance of {@link NavClientRoutePathDeviationDescriptor }
     * 
     */
    public NavClientRoutePathDeviationDescriptor createNavClientRoutePathDeviationDescriptor() {
        return new NavClientRoutePathDeviationDescriptor();
    }

    /**
     * Create an instance of {@link DiagnosticTroubleCodeDescriptor }
     * 
     */
    public DiagnosticTroubleCodeDescriptor createDiagnosticTroubleCodeDescriptor() {
        return new DiagnosticTroubleCodeDescriptor();
    }

    /**
     * Create an instance of {@link ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail }
     * 
     */
    public ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail createArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail() {
        return new ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail();
    }

    /**
     * Create an instance of {@link DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail }
     * 
     */
    public DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail createDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail() {
        return new DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail();
    }

    /**
     * Create an instance of {@link DoorStateFunction }
     * 
     */
    public DoorStateFunction createDoorStateFunction() {
        return new DoorStateFunction();
    }

    /**
     * Create an instance of {@link RemoteVehicleShutdownFunction }
     * 
     */
    public RemoteVehicleShutdownFunction createRemoteVehicleShutdownFunction() {
        return new RemoteVehicleShutdownFunction();
    }

    /**
     * Create an instance of {@link SeatBeltViolatioFunction }
     * 
     */
    public SeatBeltViolatioFunction createSeatBeltViolatioFunction() {
        return new SeatBeltViolatioFunction();
    }

    /**
     * Create an instance of {@link TemperatureFunction }
     * 
     */
    public TemperatureFunction createTemperatureFunction() {
        return new TemperatureFunction();
    }

    /**
     * Create an instance of {@link HOSOnDutyWithoutActivityFunction }
     * 
     */
    public HOSOnDutyWithoutActivityFunction createHOSOnDutyWithoutActivityFunction() {
        return new HOSOnDutyWithoutActivityFunction();
    }

    /**
     * Create an instance of {@link PanicButtonFunction }
     * 
     */
    public PanicButtonFunction createPanicButtonFunction() {
        return new PanicButtonFunction();
    }

    /**
     * Create an instance of {@link PotentialHOSDriveTimeViolationFunction }
     * 
     */
    public PotentialHOSDriveTimeViolationFunction createPotentialHOSDriveTimeViolationFunction() {
        return new PotentialHOSDriveTimeViolationFunction();
    }

    /**
     * Create an instance of {@link PotentialHOSDutyTimeViolationFunction }
     * 
     */
    public PotentialHOSDutyTimeViolationFunction createPotentialHOSDutyTimeViolationFunction() {
        return new PotentialHOSDutyTimeViolationFunction();
    }

    /**
     * Create an instance of {@link DeviceLowBatteryFunction }
     * 
     */
    public DeviceLowBatteryFunction createDeviceLowBatteryFunction() {
        return new DeviceLowBatteryFunction();
    }

    /**
     * Create an instance of {@link ExcessiveIdlingFunction }
     * 
     */
    public ExcessiveIdlingFunction createExcessiveIdlingFunction() {
        return new ExcessiveIdlingFunction();
    }

    /**
     * Create an instance of {@link HarshAccelerationFunction }
     * 
     */
    public HarshAccelerationFunction createHarshAccelerationFunction() {
        return new HarshAccelerationFunction();
    }

    /**
     * Create an instance of {@link HarshBrakingFunction }
     * 
     */
    public HarshBrakingFunction createHarshBrakingFunction() {
        return new HarshBrakingFunction();
    }

    /**
     * Create an instance of {@link HarshCorneringFunction }
     * 
     */
    public HarshCorneringFunction createHarshCorneringFunction() {
        return new HarshCorneringFunction();
    }

    /**
     * Create an instance of {@link ProjectedServiceWindowDeviationFunction }
     * 
     */
    public ProjectedServiceWindowDeviationFunction createProjectedServiceWindowDeviationFunction() {
        return new ProjectedServiceWindowDeviationFunction();
    }

    /**
     * Create an instance of {@link RestrictedEquipmentHoursFunction }
     * 
     */
    public RestrictedEquipmentHoursFunction createRestrictedEquipmentHoursFunction() {
        return new RestrictedEquipmentHoursFunction();
    }

    /**
     * Create an instance of {@link RestrictedLocationFunction }
     * 
     */
    public RestrictedLocationFunction createRestrictedLocationFunction() {
        return new RestrictedLocationFunction();
    }

    /**
     * Create an instance of {@link ServiceableStopServiceTimeDeviationFunction }
     * 
     */
    public ServiceableStopServiceTimeDeviationFunction createServiceableStopServiceTimeDeviationFunction() {
        return new ServiceableStopServiceTimeDeviationFunction();
    }

    /**
     * Create an instance of {@link GpsDistanceToLocationFunction }
     * 
     */
    public GpsDistanceToLocationFunction createGpsDistanceToLocationFunction() {
        return new GpsDistanceToLocationFunction();
    }

    /**
     * Create an instance of {@link GpsGapFunction }
     * 
     */
    public GpsGapFunction createGpsGapFunction() {
        return new GpsGapFunction();
    }

    /**
     * Create an instance of {@link NoGpsFunction }
     * 
     */
    public NoGpsFunction createNoGpsFunction() {
        return new NoGpsFunction();
    }

    /**
     * Create an instance of {@link OutOfContactFunction }
     * 
     */
    public OutOfContactFunction createOutOfContactFunction() {
        return new OutOfContactFunction();
    }

    /**
     * Create an instance of {@link OffPlannedCompleteTimeFunction }
     * 
     */
    public OffPlannedCompleteTimeFunction createOffPlannedCompleteTimeFunction() {
        return new OffPlannedCompleteTimeFunction();
    }

    /**
     * Create an instance of {@link OutOfBoundsArriveDepartFunction }
     * 
     */
    public OutOfBoundsArriveDepartFunction createOutOfBoundsArriveDepartFunction() {
        return new OutOfBoundsArriveDepartFunction();
    }

    /**
     * Create an instance of {@link RouteNetworkSpeedViolationFunction }
     * 
     */
    public RouteNetworkSpeedViolationFunction createRouteNetworkSpeedViolationFunction() {
        return new RouteNetworkSpeedViolationFunction();
    }

    /**
     * Create an instance of {@link RoutePathDeviationFunction }
     * 
     */
    public RoutePathDeviationFunction createRoutePathDeviationFunction() {
        return new RoutePathDeviationFunction();
    }

    /**
     * Create an instance of {@link StaticSpeedViolationFunction }
     * 
     */
    public StaticSpeedViolationFunction createStaticSpeedViolationFunction() {
        return new StaticSpeedViolationFunction();
    }

    /**
     * Create an instance of {@link UnplannedStopDistanceToLocationFunction }
     * 
     */
    public UnplannedStopDistanceToLocationFunction createUnplannedStopDistanceToLocationFunction() {
        return new UnplannedStopDistanceToLocationFunction();
    }

    /**
     * Create an instance of {@link StationaryResourceFunction }
     * 
     */
    public StationaryResourceFunction createStationaryResourceFunction() {
        return new StationaryResourceFunction();
    }

    /**
     * Create an instance of {@link DoorStateDescriptor }
     * 
     */
    public DoorStateDescriptor createDoorStateDescriptor() {
        return new DoorStateDescriptor();
    }

    /**
     * Create an instance of {@link NavClientSpeedViolationDescriptor }
     * 
     */
    public NavClientSpeedViolationDescriptor createNavClientSpeedViolationDescriptor() {
        return new NavClientSpeedViolationDescriptor();
    }

    /**
     * Create an instance of {@link RemoteVehicleShutdownDescriptor }
     * 
     */
    public RemoteVehicleShutdownDescriptor createRemoteVehicleShutdownDescriptor() {
        return new RemoteVehicleShutdownDescriptor();
    }

    /**
     * Create an instance of {@link SeatBeltViolationDescriptor }
     * 
     */
    public SeatBeltViolationDescriptor createSeatBeltViolationDescriptor() {
        return new SeatBeltViolationDescriptor();
    }

    /**
     * Create an instance of {@link TemperatureDescriptor }
     * 
     */
    public TemperatureDescriptor createTemperatureDescriptor() {
        return new TemperatureDescriptor();
    }

    /**
     * Create an instance of {@link HOSOnDutyWithoutActivityDescriptor }
     * 
     */
    public HOSOnDutyWithoutActivityDescriptor createHOSOnDutyWithoutActivityDescriptor() {
        return new HOSOnDutyWithoutActivityDescriptor();
    }

    /**
     * Create an instance of {@link PanicButtonDescriptor }
     * 
     */
    public PanicButtonDescriptor createPanicButtonDescriptor() {
        return new PanicButtonDescriptor();
    }

    /**
     * Create an instance of {@link PotentialHOSDriveTimeViolationDescriptor }
     * 
     */
    public PotentialHOSDriveTimeViolationDescriptor createPotentialHOSDriveTimeViolationDescriptor() {
        return new PotentialHOSDriveTimeViolationDescriptor();
    }

    /**
     * Create an instance of {@link PotentialHOSDutyTimeViolationDescriptor }
     * 
     */
    public PotentialHOSDutyTimeViolationDescriptor createPotentialHOSDutyTimeViolationDescriptor() {
        return new PotentialHOSDutyTimeViolationDescriptor();
    }

    /**
     * Create an instance of {@link RestrictedEquipmentHoursDescriptor }
     * 
     */
    public RestrictedEquipmentHoursDescriptor createRestrictedEquipmentHoursDescriptor() {
        return new RestrictedEquipmentHoursDescriptor();
    }

    /**
     * Create an instance of {@link RestrictedLocationDescriptor }
     * 
     */
    public RestrictedLocationDescriptor createRestrictedLocationDescriptor() {
        return new RestrictedLocationDescriptor();
    }

    /**
     * Create an instance of {@link DeviceLowBatteryDescriptor }
     * 
     */
    public DeviceLowBatteryDescriptor createDeviceLowBatteryDescriptor() {
        return new DeviceLowBatteryDescriptor();
    }

    /**
     * Create an instance of {@link ExcessiveIdlingDescriptor }
     * 
     */
    public ExcessiveIdlingDescriptor createExcessiveIdlingDescriptor() {
        return new ExcessiveIdlingDescriptor();
    }

    /**
     * Create an instance of {@link ProjectedServiceWindowDeviationDescriptor }
     * 
     */
    public ProjectedServiceWindowDeviationDescriptor createProjectedServiceWindowDeviationDescriptor() {
        return new ProjectedServiceWindowDeviationDescriptor();
    }

    /**
     * Create an instance of {@link ServiceableStopServiceTimeDeviationDescriptor }
     * 
     */
    public ServiceableStopServiceTimeDeviationDescriptor createServiceableStopServiceTimeDeviationDescriptor() {
        return new ServiceableStopServiceTimeDeviationDescriptor();
    }

    /**
     * Create an instance of {@link GpsDistanceToLocationDescriptor }
     * 
     */
    public GpsDistanceToLocationDescriptor createGpsDistanceToLocationDescriptor() {
        return new GpsDistanceToLocationDescriptor();
    }

    /**
     * Create an instance of {@link GpsGapDescriptor }
     * 
     */
    public GpsGapDescriptor createGpsGapDescriptor() {
        return new GpsGapDescriptor();
    }

    /**
     * Create an instance of {@link OffPlannedCompleteTimeDescriptor }
     * 
     */
    public OffPlannedCompleteTimeDescriptor createOffPlannedCompleteTimeDescriptor() {
        return new OffPlannedCompleteTimeDescriptor();
    }

    /**
     * Create an instance of {@link OutOfBoundsArriveDepartDescriptor }
     * 
     */
    public OutOfBoundsArriveDepartDescriptor createOutOfBoundsArriveDepartDescriptor() {
        return new OutOfBoundsArriveDepartDescriptor();
    }

    /**
     * Create an instance of {@link OutOfContactDescriptor }
     * 
     */
    public OutOfContactDescriptor createOutOfContactDescriptor() {
        return new OutOfContactDescriptor();
    }

    /**
     * Create an instance of {@link RoutePathDeviationDescriptor }
     * 
     */
    public RoutePathDeviationDescriptor createRoutePathDeviationDescriptor() {
        return new RoutePathDeviationDescriptor();
    }

    /**
     * Create an instance of {@link SpeedViolationDescriptor }
     * 
     */
    public SpeedViolationDescriptor createSpeedViolationDescriptor() {
        return new SpeedViolationDescriptor();
    }

    /**
     * Create an instance of {@link StationaryResourceDescriptor }
     * 
     */
    public StationaryResourceDescriptor createStationaryResourceDescriptor() {
        return new StationaryResourceDescriptor();
    }

    /**
     * Create an instance of {@link UnplannedStopDistanceToLocationDescriptor }
     * 
     */
    public UnplannedStopDistanceToLocationDescriptor createUnplannedStopDistanceToLocationDescriptor() {
        return new UnplannedStopDistanceToLocationDescriptor();
    }

    /**
     * Create an instance of {@link HarshDrivingingDescriptor }
     * 
     */
    public HarshDrivingingDescriptor createHarshDrivingingDescriptor() {
        return new HarshDrivingingDescriptor();
    }

    /**
     * Create an instance of {@link HarshAccelerationDescriptor }
     * 
     */
    public HarshAccelerationDescriptor createHarshAccelerationDescriptor() {
        return new HarshAccelerationDescriptor();
    }

    /**
     * Create an instance of {@link HarshBrakingDescriptor }
     * 
     */
    public HarshBrakingDescriptor createHarshBrakingDescriptor() {
        return new HarshBrakingDescriptor();
    }

    /**
     * Create an instance of {@link HarshCorneringDescriptor }
     * 
     */
    public HarshCorneringDescriptor createHarshCorneringDescriptor() {
        return new HarshCorneringDescriptor();
    }

    /**
     * Create an instance of {@link WorkerLogEvent }
     * 
     */
    public WorkerLogEvent createWorkerLogEvent() {
        return new WorkerLogEvent();
    }

    /**
     * Create an instance of {@link WorkerLogEventPropertyOptions }
     * 
     */
    public WorkerLogEventPropertyOptions createWorkerLogEventPropertyOptions() {
        return new WorkerLogEventPropertyOptions();
    }

    /**
     * Create an instance of {@link MobileTextAlias }
     * 
     */
    public MobileTextAlias createMobileTextAlias() {
        return new MobileTextAlias();
    }

    /**
     * Create an instance of {@link MobileScreenConfiguration }
     * 
     */
    public MobileScreenConfiguration createMobileScreenConfiguration() {
        return new MobileScreenConfiguration();
    }

    /**
     * Create an instance of {@link ArrayOfMobileScreenComponent }
     * 
     */
    public ArrayOfMobileScreenComponent createArrayOfMobileScreenComponent() {
        return new ArrayOfMobileScreenComponent();
    }

    /**
     * Create an instance of {@link MobileScreenComponent }
     * 
     */
    public MobileScreenComponent createMobileScreenComponent() {
        return new MobileScreenComponent();
    }

    /**
     * Create an instance of {@link MobileFormScreenComponent }
     * 
     */
    public MobileFormScreenComponent createMobileFormScreenComponent() {
        return new MobileFormScreenComponent();
    }

    /**
     * Create an instance of {@link MobileTextAliasPropertyOptions }
     * 
     */
    public MobileTextAliasPropertyOptions createMobileTextAliasPropertyOptions() {
        return new MobileTextAliasPropertyOptions();
    }

    /**
     * Create an instance of {@link MobileScreenConfigurationPropertyOptions }
     * 
     */
    public MobileScreenConfigurationPropertyOptions createMobileScreenConfigurationPropertyOptions() {
        return new MobileScreenConfigurationPropertyOptions();
    }

    /**
     * Create an instance of {@link MobileScreenComponentPropertyOptions }
     * 
     */
    public MobileScreenComponentPropertyOptions createMobileScreenComponentPropertyOptions() {
        return new MobileScreenComponentPropertyOptions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseSpeedingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseSpeedingType")
    public JAXBElement<DataWarehouseSpeedingType> createDataWarehouseSpeedingType(DataWarehouseSpeedingType value) {
        return new JAXBElement<DataWarehouseSpeedingType>(_DataWarehouseSpeedingType_QNAME, DataWarehouseSpeedingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseDataLoaderMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDataLoaderMode")
    public JAXBElement<DataWarehouseDataLoaderMode> createDataWarehouseDataLoaderMode(DataWarehouseDataLoaderMode value) {
        return new JAXBElement<DataWarehouseDataLoaderMode>(_DataWarehouseDataLoaderMode_QNAME, DataWarehouseDataLoaderMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseResourceEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseResourceEventType")
    public JAXBElement<DataWarehouseResourceEventType> createDataWarehouseResourceEventType(DataWarehouseResourceEventType value) {
        return new JAXBElement<DataWarehouseResourceEventType>(_DataWarehouseResourceEventType_QNAME, DataWarehouseResourceEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTimeVarianceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTimeVarianceType")
    public JAXBElement<DataWarehouseTimeVarianceType> createDataWarehouseTimeVarianceType(DataWarehouseTimeVarianceType value) {
        return new JAXBElement<DataWarehouseTimeVarianceType>(_DataWarehouseTimeVarianceType_QNAME, DataWarehouseTimeVarianceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseCompositeMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCompositeMeasureType")
    public JAXBElement<DataWarehouseCompositeMeasureType> createDataWarehouseCompositeMeasureType(DataWarehouseCompositeMeasureType value) {
        return new JAXBElement<DataWarehouseCompositeMeasureType>(_DataWarehouseCompositeMeasureType_QNAME, DataWarehouseCompositeMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseCostType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCostType")
    public JAXBElement<DataWarehouseCostType> createDataWarehouseCostType(DataWarehouseCostType value) {
        return new JAXBElement<DataWarehouseCostType>(_DataWarehouseCostType_QNAME, DataWarehouseCostType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseDimensionAttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDimensionAttributeType")
    public JAXBElement<DataWarehouseDimensionAttributeType> createDataWarehouseDimensionAttributeType(DataWarehouseDimensionAttributeType value) {
        return new JAXBElement<DataWarehouseDimensionAttributeType>(_DataWarehouseDimensionAttributeType_QNAME, DataWarehouseDimensionAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseLocationType")
    public JAXBElement<DataWarehouseLocationType> createDataWarehouseLocationType(DataWarehouseLocationType value) {
        return new JAXBElement<DataWarehouseLocationType>(_DataWarehouseLocationType_QNAME, DataWarehouseLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseDataPointsLimiterSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDataPointsLimiterSettings")
    public JAXBElement<DataWarehouseDataPointsLimiterSettings> createDataWarehouseDataPointsLimiterSettings(DataWarehouseDataPointsLimiterSettings value) {
        return new JAXBElement<DataWarehouseDataPointsLimiterSettings>(_DataWarehouseDataPointsLimiterSettings_QNAME, DataWarehouseDataPointsLimiterSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseFileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseFileType")
    public JAXBElement<DataWarehouseFileType> createDataWarehouseFileType(DataWarehouseFileType value) {
        return new JAXBElement<DataWarehouseFileType>(_DataWarehouseFileType_QNAME, DataWarehouseFileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiLogicalOperatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiLogicalOperatorType")
    public JAXBElement<DataWarehouseKpiLogicalOperatorType> createDataWarehouseKpiLogicalOperatorType(DataWarehouseKpiLogicalOperatorType value) {
        return new JAXBElement<DataWarehouseKpiLogicalOperatorType>(_DataWarehouseKpiLogicalOperatorType_QNAME, DataWarehouseKpiLogicalOperatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseMeasureUsageOptions")
    public JAXBElement<List<String>> createDataWarehouseMeasureUsageOptions(List<String> value) {
        return new JAXBElement<List<String>>(_DataWarehouseMeasureUsageOptions_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehousePlannedActualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehousePlannedActualType")
    public JAXBElement<DataWarehousePlannedActualType> createDataWarehousePlannedActualType(DataWarehousePlannedActualType value) {
        return new JAXBElement<DataWarehousePlannedActualType>(_DataWarehousePlannedActualType_QNAME, DataWarehousePlannedActualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehousePlannedAndActualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehousePlannedAndActualType")
    public JAXBElement<DataWarehousePlannedAndActualType> createDataWarehousePlannedAndActualType(DataWarehousePlannedAndActualType value) {
        return new JAXBElement<DataWarehousePlannedAndActualType>(_DataWarehousePlannedAndActualType_QNAME, DataWarehousePlannedAndActualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseRuleAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseRuleAction")
    public JAXBElement<DataWarehouseRuleAction> createDataWarehouseRuleAction(DataWarehouseRuleAction value) {
        return new JAXBElement<DataWarehouseRuleAction>(_DataWarehouseRuleAction_QNAME, DataWarehouseRuleAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTransactionType")
    public JAXBElement<DataWarehouseTransactionType> createDataWarehouseTransactionType(DataWarehouseTransactionType value) {
        return new JAXBElement<DataWarehouseTransactionType>(_DataWarehouseTransactionType_QNAME, DataWarehouseTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseAtomicMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseAtomicMeasureType")
    public JAXBElement<DataWarehouseAtomicMeasureType> createDataWarehouseAtomicMeasureType(DataWarehouseAtomicMeasureType value) {
        return new JAXBElement<DataWarehouseAtomicMeasureType>(_DataWarehouseAtomicMeasureType_QNAME, DataWarehouseAtomicMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseSecondaryDimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseSecondaryDimensionType")
    public JAXBElement<DataWarehouseSecondaryDimensionType> createDataWarehouseSecondaryDimensionType(DataWarehouseSecondaryDimensionType value) {
        return new JAXBElement<DataWarehouseSecondaryDimensionType>(_DataWarehouseSecondaryDimensionType_QNAME, DataWarehouseSecondaryDimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseCargoExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCargoExceptionType")
    public JAXBElement<DataWarehouseCargoExceptionType> createDataWarehouseCargoExceptionType(DataWarehouseCargoExceptionType value) {
        return new JAXBElement<DataWarehouseCargoExceptionType>(_DataWarehouseCargoExceptionType_QNAME, DataWarehouseCargoExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "IntegrationStatus")
    public JAXBElement<List<String>> createIntegrationStatus(List<String> value) {
        return new JAXBElement<List<String>>(_IntegrationStatus_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseServiceType")
    public JAXBElement<DataWarehouseServiceType> createDataWarehouseServiceType(DataWarehouseServiceType value) {
        return new JAXBElement<DataWarehouseServiceType>(_DataWarehouseServiceType_QNAME, DataWarehouseServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStopType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseStopType")
    public JAXBElement<DataWarehouseStopType> createDataWarehouseStopType(DataWarehouseStopType value) {
        return new JAXBElement<DataWarehouseStopType>(_DataWarehouseStopType_QNAME, DataWarehouseStopType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseIdlingTypeDimensionIdlingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseIdlingTypeDimension.IdlingType")
    public JAXBElement<DataWarehouseIdlingTypeDimensionIdlingType> createDataWarehouseIdlingTypeDimensionIdlingType(DataWarehouseIdlingTypeDimensionIdlingType value) {
        return new JAXBElement<DataWarehouseIdlingTypeDimensionIdlingType>(_DataWarehouseIdlingTypeDimensionIdlingType_QNAME, DataWarehouseIdlingTypeDimensionIdlingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseDimensionDimensionCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDimension.DimensionCategory")
    public JAXBElement<DataWarehouseDimensionDimensionCategory> createDataWarehouseDimensionDimensionCategory(DataWarehouseDimensionDimensionCategory value) {
        return new JAXBElement<DataWarehouseDimensionDimensionCategory>(_DataWarehouseDimensionDimensionCategory_QNAME, DataWarehouseDimensionDimensionCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OperatorType")
    public JAXBElement<OperatorType> createOperatorType(OperatorType value) {
        return new JAXBElement<OperatorType>(_OperatorType_QNAME, OperatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiSettingsKpiDisplayMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiSettings.KpiDisplayMode")
    public JAXBElement<DataWarehouseKpiSettingsKpiDisplayMode> createDataWarehouseKpiSettingsKpiDisplayMode(DataWarehouseKpiSettingsKpiDisplayMode value) {
        return new JAXBElement<DataWarehouseKpiSettingsKpiDisplayMode>(_DataWarehouseKpiSettingsKpiDisplayMode_QNAME, DataWarehouseKpiSettingsKpiDisplayMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiKpiGroupByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpi.KpiGroupByType")
    public JAXBElement<DataWarehouseKpiKpiGroupByType> createDataWarehouseKpiKpiGroupByType(DataWarehouseKpiKpiGroupByType value) {
        return new JAXBElement<DataWarehouseKpiKpiGroupByType>(_DataWarehouseKpiKpiGroupByType_QNAME, DataWarehouseKpiKpiGroupByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiMeasure.MeasureAverageSetting")
    public JAXBElement<List<String>> createDataWarehouseKpiMeasureMeasureAverageSetting(List<String> value) {
        return new JAXBElement<List<String>>(_DataWarehouseKpiMeasureMeasureAverageSetting_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiMeasure.MeasureCompareSetting")
    public JAXBElement<List<String>> createDataWarehouseKpiMeasureMeasureCompareSetting(List<String> value) {
        return new JAXBElement<List<String>>(_DataWarehouseKpiMeasureMeasureCompareSetting_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiOutputType")
    public JAXBElement<DataWarehouseKpiOutputType> createDataWarehouseKpiOutputType(DataWarehouseKpiOutputType value) {
        return new JAXBElement<DataWarehouseKpiOutputType>(_DataWarehouseKpiOutputType_QNAME, DataWarehouseKpiOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiSortingOptionsSortOrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiSortingOptions.SortOrderType")
    public JAXBElement<DataWarehouseKpiSortingOptionsSortOrderType> createDataWarehouseKpiSortingOptionsSortOrderType(DataWarehouseKpiSortingOptionsSortOrderType value) {
        return new JAXBElement<DataWarehouseKpiSortingOptionsSortOrderType>(_DataWarehouseKpiSortingOptionsSortOrderType_QNAME, DataWarehouseKpiSortingOptionsSortOrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiSortingOptionsSortByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiSortingOptions.SortByType")
    public JAXBElement<DataWarehouseKpiSortingOptionsSortByType> createDataWarehouseKpiSortingOptionsSortByType(DataWarehouseKpiSortingOptionsSortByType value) {
        return new JAXBElement<DataWarehouseKpiSortingOptionsSortByType>(_DataWarehouseKpiSortingOptionsSortByType_QNAME, DataWarehouseKpiSortingOptionsSortByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTravelLegTypeDimensionTravelLegType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTravelLegTypeDimension.TravelLegType")
    public JAXBElement<DataWarehouseTravelLegTypeDimensionTravelLegType> createDataWarehouseTravelLegTypeDimensionTravelLegType(DataWarehouseTravelLegTypeDimensionTravelLegType value) {
        return new JAXBElement<DataWarehouseTravelLegTypeDimensionTravelLegType>(_DataWarehouseTravelLegTypeDimensionTravelLegType_QNAME, DataWarehouseTravelLegTypeDimensionTravelLegType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStopInfoDimensionStopExecutionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseStopInfoDimension.StopExecutionType")
    public JAXBElement<DataWarehouseStopInfoDimensionStopExecutionType> createDataWarehouseStopInfoDimensionStopExecutionType(DataWarehouseStopInfoDimensionStopExecutionType value) {
        return new JAXBElement<DataWarehouseStopInfoDimensionStopExecutionType>(_DataWarehouseStopInfoDimensionStopExecutionType_QNAME, DataWarehouseStopInfoDimensionStopExecutionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStopInfoDimensionIsOffDayStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseStopInfoDimension.IsOffDayStop")
    public JAXBElement<DataWarehouseStopInfoDimensionIsOffDayStop> createDataWarehouseStopInfoDimensionIsOffDayStop(DataWarehouseStopInfoDimensionIsOffDayStop value) {
        return new JAXBElement<DataWarehouseStopInfoDimensionIsOffDayStop>(_DataWarehouseStopInfoDimensionIsOffDayStop_QNAME, DataWarehouseStopInfoDimensionIsOffDayStop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiExportJobInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiExportJobInfo")
    public JAXBElement<DataWarehouseKpiExportJobInfo> createDataWarehouseKpiExportJobInfo(DataWarehouseKpiExportJobInfo value) {
        return new JAXBElement<DataWarehouseKpiExportJobInfo>(_DataWarehouseKpiExportJobInfo_QNAME, DataWarehouseKpiExportJobInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiExportFileResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiExportFileResult")
    public JAXBElement<DataWarehouseKpiExportFileResult> createDataWarehouseKpiExportFileResult(DataWarehouseKpiExportFileResult value) {
        return new JAXBElement<DataWarehouseKpiExportFileResult>(_DataWarehouseKpiExportFileResult_QNAME, DataWarehouseKpiExportFileResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseCleansingJobInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCleansingJobInfo")
    public JAXBElement<DataWarehouseCleansingJobInfo> createDataWarehouseCleansingJobInfo(DataWarehouseCleansingJobInfo value) {
        return new JAXBElement<DataWarehouseCleansingJobInfo>(_DataWarehouseCleansingJobInfo_QNAME, DataWarehouseCleansingJobInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseCleansingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCleansingResult")
    public JAXBElement<DataWarehouseCleansingResult> createDataWarehouseCleansingResult(DataWarehouseCleansingResult value) {
        return new JAXBElement<DataWarehouseCleansingResult>(_DataWarehouseCleansingResult_QNAME, DataWarehouseCleansingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseMobileDeviceDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseMobileDeviceDimension")
    public JAXBElement<DataWarehouseMobileDeviceDimension> createDataWarehouseMobileDeviceDimension(DataWarehouseMobileDeviceDimension value) {
        return new JAXBElement<DataWarehouseMobileDeviceDimension>(_DataWarehouseMobileDeviceDimension_QNAME, DataWarehouseMobileDeviceDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseNavRecalculationReasonDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseNavRecalculationReasonDimension")
    public JAXBElement<DataWarehouseNavRecalculationReasonDimension> createDataWarehouseNavRecalculationReasonDimension(DataWarehouseNavRecalculationReasonDimension value) {
        return new JAXBElement<DataWarehouseNavRecalculationReasonDimension>(_DataWarehouseNavRecalculationReasonDimension_QNAME, DataWarehouseNavRecalculationReasonDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTelematicsDeviceDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTelematicsDeviceDimension")
    public JAXBElement<DataWarehouseTelematicsDeviceDimension> createDataWarehouseTelematicsDeviceDimension(DataWarehouseTelematicsDeviceDimension value) {
        return new JAXBElement<DataWarehouseTelematicsDeviceDimension>(_DataWarehouseTelematicsDeviceDimension_QNAME, DataWarehouseTelematicsDeviceDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehousePowerTakeOffExceptionRuleDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehousePowerTakeOffExceptionRuleDimension")
    public JAXBElement<DataWarehousePowerTakeOffExceptionRuleDimension> createDataWarehousePowerTakeOffExceptionRuleDimension(DataWarehousePowerTakeOffExceptionRuleDimension value) {
        return new JAXBElement<DataWarehousePowerTakeOffExceptionRuleDimension>(_DataWarehousePowerTakeOffExceptionRuleDimension_QNAME, DataWarehousePowerTakeOffExceptionRuleDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseIdlingTypeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseIdlingTypeDimension")
    public JAXBElement<DataWarehouseIdlingTypeDimension> createDataWarehouseIdlingTypeDimension(DataWarehouseIdlingTypeDimension value) {
        return new JAXBElement<DataWarehouseIdlingTypeDimension>(_DataWarehouseIdlingTypeDimension_QNAME, DataWarehouseIdlingTypeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDimension")
    public JAXBElement<DataWarehouseDimension> createDataWarehouseDimension(DataWarehouseDimension value) {
        return new JAXBElement<DataWarehouseDimension>(_DataWarehouseDimension_QNAME, DataWarehouseDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseOperationsUnitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseOperationsUnitDimension")
    public JAXBElement<DataWarehouseOperationsUnitDimension> createDataWarehouseOperationsUnitDimension(DataWarehouseOperationsUnitDimension value) {
        return new JAXBElement<DataWarehouseOperationsUnitDimension>(_DataWarehouseOperationsUnitDimension_QNAME, DataWarehouseOperationsUnitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTelematicsDeviceInputOutputAccessoryDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTelematicsDeviceInputOutputAccessoryDimension")
    public JAXBElement<DataWarehouseTelematicsDeviceInputOutputAccessoryDimension> createDataWarehouseTelematicsDeviceInputOutputAccessoryDimension(DataWarehouseTelematicsDeviceInputOutputAccessoryDimension value) {
        return new JAXBElement<DataWarehouseTelematicsDeviceInputOutputAccessoryDimension>(_DataWarehouseTelematicsDeviceInputOutputAccessoryDimension_QNAME, DataWarehouseTelematicsDeviceInputOutputAccessoryDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseAccountDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseAccountDimension")
    public JAXBElement<DataWarehouseAccountDimension> createDataWarehouseAccountDimension(DataWarehouseAccountDimension value) {
        return new JAXBElement<DataWarehouseAccountDimension>(_DataWarehouseAccountDimension_QNAME, DataWarehouseAccountDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseCostTypeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCostTypeDimension")
    public JAXBElement<DataWarehouseCostTypeDimension> createDataWarehouseCostTypeDimension(DataWarehouseCostTypeDimension value) {
        return new JAXBElement<DataWarehouseCostTypeDimension>(_DataWarehouseCostTypeDimension_QNAME, DataWarehouseCostTypeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseCustomMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCustomMeasure")
    public JAXBElement<DataWarehouseCustomMeasure> createDataWarehouseCustomMeasure(DataWarehouseCustomMeasure value) {
        return new JAXBElement<DataWarehouseCustomMeasure>(_DataWarehouseCustomMeasure_QNAME, DataWarehouseCustomMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "IMeasure")
    public JAXBElement<IMeasure> createIMeasure(IMeasure value) {
        return new JAXBElement<IMeasure>(_IMeasure_QNAME, IMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "UserDefinedMeasure")
    public JAXBElement<UserDefinedMeasure> createUserDefinedMeasure(UserDefinedMeasure value) {
        return new JAXBElement<UserDefinedMeasure>(_UserDefinedMeasure_QNAME, UserDefinedMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDimensionFilter")
    public JAXBElement<ArrayOfDimensionFilter> createArrayOfDimensionFilter(ArrayOfDimensionFilter value) {
        return new JAXBElement<ArrayOfDimensionFilter>(_ArrayOfDimensionFilter_QNAME, ArrayOfDimensionFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionFilter")
    public JAXBElement<DimensionFilter> createDimensionFilter(DimensionFilter value) {
        return new JAXBElement<DimensionFilter>(_DimensionFilter_QNAME, DimensionFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionDetail")
    public JAXBElement<DimensionDetail> createDimensionDetail(DimensionDetail value) {
        return new JAXBElement<DimensionDetail>(_DimensionDetail_QNAME, DimensionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionDescriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionDescriber")
    public JAXBElement<DimensionDescriber> createDimensionDescriber(DimensionDescriber value) {
        return new JAXBElement<DimensionDescriber>(_DimensionDescriber_QNAME, DimensionDescriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeekYearDimensionDescriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "WeekYearDimensionDescriber")
    public JAXBElement<WeekYearDimensionDescriber> createWeekYearDimensionDescriber(WeekYearDimensionDescriber value) {
        return new JAXBElement<WeekYearDimensionDescriber>(_WeekYearDimensionDescriber_QNAME, WeekYearDimensionDescriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationsUnitDimensionDescriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OperationsUnitDimensionDescriber")
    public JAXBElement<OperationsUnitDimensionDescriber> createOperationsUnitDimensionDescriber(OperationsUnitDimensionDescriber value) {
        return new JAXBElement<OperationsUnitDimensionDescriber>(_OperationsUnitDimensionDescriber_QNAME, OperationsUnitDimensionDescriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeDimensionDescriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TimeDimensionDescriber")
    public JAXBElement<TimeDimensionDescriber> createTimeDimensionDescriber(TimeDimensionDescriber value) {
        return new JAXBElement<TimeDimensionDescriber>(_TimeDimensionDescriber_QNAME, TimeDimensionDescriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondaryDimensionDescriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "SecondaryDimensionDescriber")
    public JAXBElement<SecondaryDimensionDescriber> createSecondaryDimensionDescriber(SecondaryDimensionDescriber value) {
        return new JAXBElement<SecondaryDimensionDescriber>(_SecondaryDimensionDescriber_QNAME, SecondaryDimensionDescriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseDoorStateExceptionRuleDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDoorStateExceptionRuleDimension")
    public JAXBElement<DataWarehouseDoorStateExceptionRuleDimension> createDataWarehouseDoorStateExceptionRuleDimension(DataWarehouseDoorStateExceptionRuleDimension value) {
        return new JAXBElement<DataWarehouseDoorStateExceptionRuleDimension>(_DataWarehouseDoorStateExceptionRuleDimension_QNAME, DataWarehouseDoorStateExceptionRuleDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseEquipmentManufacturerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseEquipmentManufacturerDimension")
    public JAXBElement<DataWarehouseEquipmentManufacturerDimension> createDataWarehouseEquipmentManufacturerDimension(DataWarehouseEquipmentManufacturerDimension value) {
        return new JAXBElement<DataWarehouseEquipmentManufacturerDimension>(_DataWarehouseEquipmentManufacturerDimension_QNAME, DataWarehouseEquipmentManufacturerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiBase")
    public JAXBElement<DataWarehouseKpiBase> createDataWarehouseKpiBase(DataWarehouseKpiBase value) {
        return new JAXBElement<DataWarehouseKpiBase>(_DataWarehouseKpiBase_QNAME, DataWarehouseKpiBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionDescriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDimensionDescriber")
    public JAXBElement<ArrayOfDimensionDescriber> createArrayOfDimensionDescriber(ArrayOfDimensionDescriber value) {
        return new JAXBElement<ArrayOfDimensionDescriber>(_ArrayOfDimensionDescriber_QNAME, ArrayOfDimensionDescriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiFolder")
    public JAXBElement<DataWarehouseKpiFolder> createDataWarehouseKpiFolder(DataWarehouseKpiFolder value) {
        return new JAXBElement<DataWarehouseKpiFolder>(_DataWarehouseKpiFolder_QNAME, DataWarehouseKpiFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseScorecardKpi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseScorecardKpi")
    public JAXBElement<DataWarehouseScorecardKpi> createDataWarehouseScorecardKpi(DataWarehouseScorecardKpi value) {
        return new JAXBElement<DataWarehouseScorecardKpi>(_DataWarehouseScorecardKpi_QNAME, DataWarehouseScorecardKpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseScorecardKpiMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseScorecardKpiMeasure")
    public JAXBElement<ArrayOfDataWarehouseScorecardKpiMeasure> createArrayOfDataWarehouseScorecardKpiMeasure(ArrayOfDataWarehouseScorecardKpiMeasure value) {
        return new JAXBElement<ArrayOfDataWarehouseScorecardKpiMeasure>(_ArrayOfDataWarehouseScorecardKpiMeasure_QNAME, ArrayOfDataWarehouseScorecardKpiMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseScorecardKpiMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseScorecardKpiMeasure")
    public JAXBElement<DataWarehouseScorecardKpiMeasure> createDataWarehouseScorecardKpiMeasure(DataWarehouseScorecardKpiMeasure value) {
        return new JAXBElement<DataWarehouseScorecardKpiMeasure>(_DataWarehouseScorecardKpiMeasure_QNAME, DataWarehouseScorecardKpiMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiMeasureBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiMeasureBase")
    public JAXBElement<DataWarehouseKpiMeasureBase> createDataWarehouseKpiMeasureBase(DataWarehouseKpiMeasureBase value) {
        return new JAXBElement<DataWarehouseKpiMeasureBase>(_DataWarehouseKpiMeasureBase_QNAME, DataWarehouseKpiMeasureBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiMeasure")
    public JAXBElement<DataWarehouseKpiMeasure> createDataWarehouseKpiMeasure(DataWarehouseKpiMeasure value) {
        return new JAXBElement<DataWarehouseKpiMeasure>(_DataWarehouseKpiMeasure_QNAME, DataWarehouseKpiMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpi")
    public JAXBElement<DataWarehouseKpi> createDataWarehouseKpi(DataWarehouseKpi value) {
        return new JAXBElement<DataWarehouseKpi>(_DataWarehouseKpi_QNAME, DataWarehouseKpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseKpiMeasure")
    public JAXBElement<ArrayOfDataWarehouseKpiMeasure> createArrayOfDataWarehouseKpiMeasure(ArrayOfDataWarehouseKpiMeasure value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiMeasure>(_ArrayOfDataWarehouseKpiMeasure_QNAME, ArrayOfDataWarehouseKpiMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiSchedule")
    public JAXBElement<DataWarehouseKpiSchedule> createDataWarehouseKpiSchedule(DataWarehouseKpiSchedule value) {
        return new JAXBElement<DataWarehouseKpiSchedule>(_DataWarehouseKpiSchedule_QNAME, DataWarehouseKpiSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "MeasureUnitOptions")
    public JAXBElement<MeasureUnitOptions> createMeasureUnitOptions(MeasureUnitOptions value) {
        return new JAXBElement<MeasureUnitOptions>(_MeasureUnitOptions_QNAME, MeasureUnitOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseDailyKpiSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDailyKpiSchedule")
    public JAXBElement<DataWarehouseDailyKpiSchedule> createDataWarehouseDailyKpiSchedule(DataWarehouseDailyKpiSchedule value) {
        return new JAXBElement<DataWarehouseDailyKpiSchedule>(_DataWarehouseDailyKpiSchedule_QNAME, DataWarehouseDailyKpiSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseMonthlyKpiSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseMonthlyKpiSchedule")
    public JAXBElement<DataWarehouseMonthlyKpiSchedule> createDataWarehouseMonthlyKpiSchedule(DataWarehouseMonthlyKpiSchedule value) {
        return new JAXBElement<DataWarehouseMonthlyKpiSchedule>(_DataWarehouseMonthlyKpiSchedule_QNAME, DataWarehouseMonthlyKpiSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseRouteInfoDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseRouteInfoDimension")
    public JAXBElement<DataWarehouseRouteInfoDimension> createDataWarehouseRouteInfoDimension(DataWarehouseRouteInfoDimension value) {
        return new JAXBElement<DataWarehouseRouteInfoDimension>(_DataWarehouseRouteInfoDimension_QNAME, DataWarehouseRouteInfoDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseServiceLocationCategoryDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseServiceLocationCategoryDimension")
    public JAXBElement<DataWarehouseServiceLocationCategoryDimension> createDataWarehouseServiceLocationCategoryDimension(DataWarehouseServiceLocationCategoryDimension value) {
        return new JAXBElement<DataWarehouseServiceLocationCategoryDimension>(_DataWarehouseServiceLocationCategoryDimension_QNAME, DataWarehouseServiceLocationCategoryDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTemperatureExceptionRuleDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTemperatureExceptionRuleDimension")
    public JAXBElement<DataWarehouseTemperatureExceptionRuleDimension> createDataWarehouseTemperatureExceptionRuleDimension(DataWarehouseTemperatureExceptionRuleDimension value) {
        return new JAXBElement<DataWarehouseTemperatureExceptionRuleDimension>(_DataWarehouseTemperatureExceptionRuleDimension_QNAME, DataWarehouseTemperatureExceptionRuleDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehousePlannedAndActualDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehousePlannedAndActualDimension")
    public JAXBElement<DataWarehousePlannedAndActualDimension> createDataWarehousePlannedAndActualDimension(DataWarehousePlannedAndActualDimension value) {
        return new JAXBElement<DataWarehousePlannedAndActualDimension>(_DataWarehousePlannedAndActualDimension_QNAME, DataWarehousePlannedAndActualDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseEquipmentClassDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseEquipmentClassDimension")
    public JAXBElement<DataWarehouseEquipmentClassDimension> createDataWarehouseEquipmentClassDimension(DataWarehouseEquipmentClassDimension value) {
        return new JAXBElement<DataWarehouseEquipmentClassDimension>(_DataWarehouseEquipmentClassDimension_QNAME, DataWarehouseEquipmentClassDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseEngineIdleExceptionRuleDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseEngineIdleExceptionRuleDimension")
    public JAXBElement<DataWarehouseEngineIdleExceptionRuleDimension> createDataWarehouseEngineIdleExceptionRuleDimension(DataWarehouseEngineIdleExceptionRuleDimension value) {
        return new JAXBElement<DataWarehouseEngineIdleExceptionRuleDimension>(_DataWarehouseEngineIdleExceptionRuleDimension_QNAME, DataWarehouseEngineIdleExceptionRuleDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseSpeedingExceptionRuleDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseSpeedingExceptionRuleDimension")
    public JAXBElement<DataWarehouseSpeedingExceptionRuleDimension> createDataWarehouseSpeedingExceptionRuleDimension(DataWarehouseSpeedingExceptionRuleDimension value) {
        return new JAXBElement<DataWarehouseSpeedingExceptionRuleDimension>(_DataWarehouseSpeedingExceptionRuleDimension_QNAME, DataWarehouseSpeedingExceptionRuleDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseCargoExceptionTypeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCargoExceptionTypeDimension")
    public JAXBElement<DataWarehouseCargoExceptionTypeDimension> createDataWarehouseCargoExceptionTypeDimension(DataWarehouseCargoExceptionTypeDimension value) {
        return new JAXBElement<DataWarehouseCargoExceptionTypeDimension>(_DataWarehouseCargoExceptionTypeDimension_QNAME, DataWarehouseCargoExceptionTypeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseCargoUnitTypeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCargoUnitTypeDimension")
    public JAXBElement<DataWarehouseCargoUnitTypeDimension> createDataWarehouseCargoUnitTypeDimension(DataWarehouseCargoUnitTypeDimension value) {
        return new JAXBElement<DataWarehouseCargoUnitTypeDimension>(_DataWarehouseCargoUnitTypeDimension_QNAME, DataWarehouseCargoUnitTypeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseIntegrationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseIntegrationStatus")
    public JAXBElement<DataWarehouseIntegrationStatus> createDataWarehouseIntegrationStatus(DataWarehouseIntegrationStatus value) {
        return new JAXBElement<DataWarehouseIntegrationStatus>(_DataWarehouseIntegrationStatus_QNAME, DataWarehouseIntegrationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseRoute")
    public JAXBElement<DataWarehouseRoute> createDataWarehouseRoute(DataWarehouseRoute value) {
        return new JAXBElement<DataWarehouseRoute>(_DataWarehouseRoute_QNAME, DataWarehouseRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseEquipmentTypeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseEquipmentTypeDimension")
    public JAXBElement<DataWarehouseEquipmentTypeDimension> createDataWarehouseEquipmentTypeDimension(DataWarehouseEquipmentTypeDimension value) {
        return new JAXBElement<DataWarehouseEquipmentTypeDimension>(_DataWarehouseEquipmentTypeDimension_QNAME, DataWarehouseEquipmentTypeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseEquipmentDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseEquipmentDimension")
    public JAXBElement<DataWarehouseEquipmentDimension> createDataWarehouseEquipmentDimension(DataWarehouseEquipmentDimension value) {
        return new JAXBElement<DataWarehouseEquipmentDimension>(_DataWarehouseEquipmentDimension_QNAME, DataWarehouseEquipmentDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseLocationDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseLocationDimension")
    public JAXBElement<DataWarehouseLocationDimension> createDataWarehouseLocationDimension(DataWarehouseLocationDimension value) {
        return new JAXBElement<DataWarehouseLocationDimension>(_DataWarehouseLocationDimension_QNAME, DataWarehouseLocationDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseOperationsUnitLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseOperationsUnitLevel")
    public JAXBElement<DataWarehouseOperationsUnitLevel> createDataWarehouseOperationsUnitLevel(DataWarehouseOperationsUnitLevel value) {
        return new JAXBElement<DataWarehouseOperationsUnitLevel>(_DataWarehouseOperationsUnitLevel_QNAME, DataWarehouseOperationsUnitLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseRouteDescriptorDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseRouteDescriptorDimension")
    public JAXBElement<DataWarehouseRouteDescriptorDimension> createDataWarehouseRouteDescriptorDimension(DataWarehouseRouteDescriptorDimension value) {
        return new JAXBElement<DataWarehouseRouteDescriptorDimension>(_DataWarehouseRouteDescriptorDimension_QNAME, DataWarehouseRouteDescriptorDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseServiceTypeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseServiceTypeDimension")
    public JAXBElement<DataWarehouseServiceTypeDimension> createDataWarehouseServiceTypeDimension(DataWarehouseServiceTypeDimension value) {
        return new JAXBElement<DataWarehouseServiceTypeDimension>(_DataWarehouseServiceTypeDimension_QNAME, DataWarehouseServiceTypeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStopTypeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseStopTypeDimension")
    public JAXBElement<DataWarehouseStopTypeDimension> createDataWarehouseStopTypeDimension(DataWarehouseStopTypeDimension value) {
        return new JAXBElement<DataWarehouseStopTypeDimension>(_DataWarehouseStopTypeDimension_QNAME, DataWarehouseStopTypeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTimeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTimeDimension")
    public JAXBElement<DataWarehouseTimeDimension> createDataWarehouseTimeDimension(DataWarehouseTimeDimension value) {
        return new JAXBElement<DataWarehouseTimeDimension>(_DataWarehouseTimeDimension_QNAME, DataWarehouseTimeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTravelLegTypeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTravelLegTypeDimension")
    public JAXBElement<DataWarehouseTravelLegTypeDimension> createDataWarehouseTravelLegTypeDimension(DataWarehouseTravelLegTypeDimension value) {
        return new JAXBElement<DataWarehouseTravelLegTypeDimension>(_DataWarehouseTravelLegTypeDimension_QNAME, DataWarehouseTravelLegTypeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseWorkerTypeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseWorkerTypeDimension")
    public JAXBElement<DataWarehouseWorkerTypeDimension> createDataWarehouseWorkerTypeDimension(DataWarehouseWorkerTypeDimension value) {
        return new JAXBElement<DataWarehouseWorkerTypeDimension>(_DataWarehouseWorkerTypeDimension_QNAME, DataWarehouseWorkerTypeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseWorkerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseWorkerDimension")
    public JAXBElement<DataWarehouseWorkerDimension> createDataWarehouseWorkerDimension(DataWarehouseWorkerDimension value) {
        return new JAXBElement<DataWarehouseWorkerDimension>(_DataWarehouseWorkerDimension_QNAME, DataWarehouseWorkerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseDepot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDepot")
    public JAXBElement<DataWarehouseDepot> createDataWarehouseDepot(DataWarehouseDepot value) {
        return new JAXBElement<DataWarehouseDepot>(_DataWarehouseDepot_QNAME, DataWarehouseDepot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStopInfoDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseStopInfoDimension")
    public JAXBElement<DataWarehouseStopInfoDimension> createDataWarehouseStopInfoDimension(DataWarehouseStopInfoDimension value) {
        return new JAXBElement<DataWarehouseStopInfoDimension>(_DataWarehouseStopInfoDimension_QNAME, DataWarehouseStopInfoDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseOperationsUnitPermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseOperationsUnitPermission")
    public JAXBElement<DataWarehouseOperationsUnitPermission> createDataWarehouseOperationsUnitPermission(DataWarehouseOperationsUnitPermission value) {
        return new JAXBElement<DataWarehouseOperationsUnitPermission>(_DataWarehouseOperationsUnitPermission_QNAME, DataWarehouseOperationsUnitPermission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResultPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "FileResultPropertyOptions")
    public JAXBElement<FileResultPropertyOptions> createFileResultPropertyOptions(FileResultPropertyOptions value) {
        return new JAXBElement<FileResultPropertyOptions>(_FileResultPropertyOptions_QNAME, FileResultPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiExportJobInfoPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiExportJobInfoPropertyOptions")
    public JAXBElement<KpiExportJobInfoPropertyOptions> createKpiExportJobInfoPropertyOptions(KpiExportJobInfoPropertyOptions value) {
        return new JAXBElement<KpiExportJobInfoPropertyOptions>(_KpiExportJobInfoPropertyOptions_QNAME, KpiExportJobInfoPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileDeviceDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "MobileDeviceDimensionPropertyOptions")
    public JAXBElement<MobileDeviceDimensionPropertyOptions> createMobileDeviceDimensionPropertyOptions(MobileDeviceDimensionPropertyOptions value) {
        return new JAXBElement<MobileDeviceDimensionPropertyOptions>(_MobileDeviceDimensionPropertyOptions_QNAME, MobileDeviceDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavRecalculationReasonDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "NavRecalculationReasonDimensionPropertyOptions")
    public JAXBElement<NavRecalculationReasonDimensionPropertyOptions> createNavRecalculationReasonDimensionPropertyOptions(NavRecalculationReasonDimensionPropertyOptions value) {
        return new JAXBElement<NavRecalculationReasonDimensionPropertyOptions>(_NavRecalculationReasonDimensionPropertyOptions_QNAME, NavRecalculationReasonDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TelematicsDeviceDimensionPropertyOptions")
    public JAXBElement<TelematicsDeviceDimensionPropertyOptions> createTelematicsDeviceDimensionPropertyOptions(TelematicsDeviceDimensionPropertyOptions value) {
        return new JAXBElement<TelematicsDeviceDimensionPropertyOptions>(_TelematicsDeviceDimensionPropertyOptions_QNAME, TelematicsDeviceDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerTakeOffExceptionRuleDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "PowerTakeOffExceptionRuleDimensionPropertyOptions")
    public JAXBElement<PowerTakeOffExceptionRuleDimensionPropertyOptions> createPowerTakeOffExceptionRuleDimensionPropertyOptions(PowerTakeOffExceptionRuleDimensionPropertyOptions value) {
        return new JAXBElement<PowerTakeOffExceptionRuleDimensionPropertyOptions>(_PowerTakeOffExceptionRuleDimensionPropertyOptions_QNAME, PowerTakeOffExceptionRuleDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdlingTypeDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "IdlingTypeDimensionPropertyOptions")
    public JAXBElement<IdlingTypeDimensionPropertyOptions> createIdlingTypeDimensionPropertyOptions(IdlingTypeDimensionPropertyOptions value) {
        return new JAXBElement<IdlingTypeDimensionPropertyOptions>(_IdlingTypeDimensionPropertyOptions_QNAME, IdlingTypeDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionPropertyOptions")
    public JAXBElement<DimensionPropertyOptions> createDimensionPropertyOptions(DimensionPropertyOptions value) {
        return new JAXBElement<DimensionPropertyOptions>(_DimensionPropertyOptions_QNAME, DimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationsUnitDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OperationsUnitDimensionPropertyOptions")
    public JAXBElement<OperationsUnitDimensionPropertyOptions> createOperationsUnitDimensionPropertyOptions(OperationsUnitDimensionPropertyOptions value) {
        return new JAXBElement<OperationsUnitDimensionPropertyOptions>(_OperationsUnitDimensionPropertyOptions_QNAME, OperationsUnitDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions")
    public JAXBElement<TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions> createTelematicsDeviceInputOutputAccessoryDimensionPropertyOptions(TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions value) {
        return new JAXBElement<TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions>(_TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions_QNAME, TelematicsDeviceInputOutputAccessoryDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopInfoDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "StopInfoDimensionPropertyOptions")
    public JAXBElement<StopInfoDimensionPropertyOptions> createStopInfoDimensionPropertyOptions(StopInfoDimensionPropertyOptions value) {
        return new JAXBElement<StopInfoDimensionPropertyOptions>(_StopInfoDimensionPropertyOptions_QNAME, StopInfoDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "AccountDimensionPropertyOptions")
    public JAXBElement<AccountDimensionPropertyOptions> createAccountDimensionPropertyOptions(AccountDimensionPropertyOptions value) {
        return new JAXBElement<AccountDimensionPropertyOptions>(_AccountDimensionPropertyOptions_QNAME, AccountDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostTypeDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CostTypeDimensionPropertyOptions")
    public JAXBElement<CostTypeDimensionPropertyOptions> createCostTypeDimensionPropertyOptions(CostTypeDimensionPropertyOptions value) {
        return new JAXBElement<CostTypeDimensionPropertyOptions>(_CostTypeDimensionPropertyOptions_QNAME, CostTypeDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomMeasurePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CustomMeasurePropertyOptions")
    public JAXBElement<CustomMeasurePropertyOptions> createCustomMeasurePropertyOptions(CustomMeasurePropertyOptions value) {
        return new JAXBElement<CustomMeasurePropertyOptions>(_CustomMeasurePropertyOptions_QNAME, CustomMeasurePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoorStateExceptionRuleDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DoorStateExceptionRuleDimensionPropertyOptions")
    public JAXBElement<DoorStateExceptionRuleDimensionPropertyOptions> createDoorStateExceptionRuleDimensionPropertyOptions(DoorStateExceptionRuleDimensionPropertyOptions value) {
        return new JAXBElement<DoorStateExceptionRuleDimensionPropertyOptions>(_DoorStateExceptionRuleDimensionPropertyOptions_QNAME, DoorStateExceptionRuleDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentManufacturerDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentManufacturerDimensionPropertyOptions")
    public JAXBElement<EquipmentManufacturerDimensionPropertyOptions> createEquipmentManufacturerDimensionPropertyOptions(EquipmentManufacturerDimensionPropertyOptions value) {
        return new JAXBElement<EquipmentManufacturerDimensionPropertyOptions>(_EquipmentManufacturerDimensionPropertyOptions_QNAME, EquipmentManufacturerDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiBasePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiBasePropertyOptions")
    public JAXBElement<KpiBasePropertyOptions> createKpiBasePropertyOptions(KpiBasePropertyOptions value) {
        return new JAXBElement<KpiBasePropertyOptions>(_KpiBasePropertyOptions_QNAME, KpiBasePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiFolderPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiFolderPropertyOptions")
    public JAXBElement<KpiFolderPropertyOptions> createKpiFolderPropertyOptions(KpiFolderPropertyOptions value) {
        return new JAXBElement<KpiFolderPropertyOptions>(_KpiFolderPropertyOptions_QNAME, KpiFolderPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScorecardKpiPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ScorecardKpiPropertyOptions")
    public JAXBElement<ScorecardKpiPropertyOptions> createScorecardKpiPropertyOptions(ScorecardKpiPropertyOptions value) {
        return new JAXBElement<ScorecardKpiPropertyOptions>(_ScorecardKpiPropertyOptions_QNAME, ScorecardKpiPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiPropertyOptions")
    public JAXBElement<KpiPropertyOptions> createKpiPropertyOptions(KpiPropertyOptions value) {
        return new JAXBElement<KpiPropertyOptions>(_KpiPropertyOptions_QNAME, KpiPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiMeasureBasePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiMeasureBasePropertyOptions")
    public JAXBElement<KpiMeasureBasePropertyOptions> createKpiMeasureBasePropertyOptions(KpiMeasureBasePropertyOptions value) {
        return new JAXBElement<KpiMeasureBasePropertyOptions>(_KpiMeasureBasePropertyOptions_QNAME, KpiMeasureBasePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScorecardKpiMeasurePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ScorecardKpiMeasurePropertyOptions")
    public JAXBElement<ScorecardKpiMeasurePropertyOptions> createScorecardKpiMeasurePropertyOptions(ScorecardKpiMeasurePropertyOptions value) {
        return new JAXBElement<ScorecardKpiMeasurePropertyOptions>(_ScorecardKpiMeasurePropertyOptions_QNAME, ScorecardKpiMeasurePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiMeasurePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiMeasurePropertyOptions")
    public JAXBElement<KpiMeasurePropertyOptions> createKpiMeasurePropertyOptions(KpiMeasurePropertyOptions value) {
        return new JAXBElement<KpiMeasurePropertyOptions>(_KpiMeasurePropertyOptions_QNAME, KpiMeasurePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiSchedulePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiSchedulePropertyOptions")
    public JAXBElement<KpiSchedulePropertyOptions> createKpiSchedulePropertyOptions(KpiSchedulePropertyOptions value) {
        return new JAXBElement<KpiSchedulePropertyOptions>(_KpiSchedulePropertyOptions_QNAME, KpiSchedulePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DailyKpiSchedulePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DailyKpiSchedulePropertyOptions")
    public JAXBElement<DailyKpiSchedulePropertyOptions> createDailyKpiSchedulePropertyOptions(DailyKpiSchedulePropertyOptions value) {
        return new JAXBElement<DailyKpiSchedulePropertyOptions>(_DailyKpiSchedulePropertyOptions_QNAME, DailyKpiSchedulePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthlyKpiSchedulePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "MonthlyKpiSchedulePropertyOptions")
    public JAXBElement<MonthlyKpiSchedulePropertyOptions> createMonthlyKpiSchedulePropertyOptions(MonthlyKpiSchedulePropertyOptions value) {
        return new JAXBElement<MonthlyKpiSchedulePropertyOptions>(_MonthlyKpiSchedulePropertyOptions_QNAME, MonthlyKpiSchedulePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteInfoDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RouteInfoDimensionPropertyOptions")
    public JAXBElement<RouteInfoDimensionPropertyOptions> createRouteInfoDimensionPropertyOptions(RouteInfoDimensionPropertyOptions value) {
        return new JAXBElement<RouteInfoDimensionPropertyOptions>(_RouteInfoDimensionPropertyOptions_QNAME, RouteInfoDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceLocationCategoryDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ServiceLocationCategoryDimensionPropertyOptions")
    public JAXBElement<ServiceLocationCategoryDimensionPropertyOptions> createServiceLocationCategoryDimensionPropertyOptions(ServiceLocationCategoryDimensionPropertyOptions value) {
        return new JAXBElement<ServiceLocationCategoryDimensionPropertyOptions>(_ServiceLocationCategoryDimensionPropertyOptions_QNAME, ServiceLocationCategoryDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureExceptionRuleDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TemperatureExceptionRuleDimensionPropertyOptions")
    public JAXBElement<TemperatureExceptionRuleDimensionPropertyOptions> createTemperatureExceptionRuleDimensionPropertyOptions(TemperatureExceptionRuleDimensionPropertyOptions value) {
        return new JAXBElement<TemperatureExceptionRuleDimensionPropertyOptions>(_TemperatureExceptionRuleDimensionPropertyOptions_QNAME, TemperatureExceptionRuleDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlannedAndActualDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "PlannedAndActualDimensionPropertyOptions")
    public JAXBElement<PlannedAndActualDimensionPropertyOptions> createPlannedAndActualDimensionPropertyOptions(PlannedAndActualDimensionPropertyOptions value) {
        return new JAXBElement<PlannedAndActualDimensionPropertyOptions>(_PlannedAndActualDimensionPropertyOptions_QNAME, PlannedAndActualDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentClassDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentClassDimensionPropertyOptions")
    public JAXBElement<EquipmentClassDimensionPropertyOptions> createEquipmentClassDimensionPropertyOptions(EquipmentClassDimensionPropertyOptions value) {
        return new JAXBElement<EquipmentClassDimensionPropertyOptions>(_EquipmentClassDimensionPropertyOptions_QNAME, EquipmentClassDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EngineIdleExceptionRuleDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EngineIdleExceptionRuleDimensionPropertyOptions")
    public JAXBElement<EngineIdleExceptionRuleDimensionPropertyOptions> createEngineIdleExceptionRuleDimensionPropertyOptions(EngineIdleExceptionRuleDimensionPropertyOptions value) {
        return new JAXBElement<EngineIdleExceptionRuleDimensionPropertyOptions>(_EngineIdleExceptionRuleDimensionPropertyOptions_QNAME, EngineIdleExceptionRuleDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpeedingExceptionRuleDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "SpeedingExceptionRuleDimensionPropertyOptions")
    public JAXBElement<SpeedingExceptionRuleDimensionPropertyOptions> createSpeedingExceptionRuleDimensionPropertyOptions(SpeedingExceptionRuleDimensionPropertyOptions value) {
        return new JAXBElement<SpeedingExceptionRuleDimensionPropertyOptions>(_SpeedingExceptionRuleDimensionPropertyOptions_QNAME, SpeedingExceptionRuleDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoExceptionTypeDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CargoExceptionTypeDimensionPropertyOptions")
    public JAXBElement<CargoExceptionTypeDimensionPropertyOptions> createCargoExceptionTypeDimensionPropertyOptions(CargoExceptionTypeDimensionPropertyOptions value) {
        return new JAXBElement<CargoExceptionTypeDimensionPropertyOptions>(_CargoExceptionTypeDimensionPropertyOptions_QNAME, CargoExceptionTypeDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoUnitTypeDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CargoUnitTypeDimensionPropertyOptions")
    public JAXBElement<CargoUnitTypeDimensionPropertyOptions> createCargoUnitTypeDimensionPropertyOptions(CargoUnitTypeDimensionPropertyOptions value) {
        return new JAXBElement<CargoUnitTypeDimensionPropertyOptions>(_CargoUnitTypeDimensionPropertyOptions_QNAME, CargoUnitTypeDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseIntegrationStatusPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseIntegrationStatusPropertyOptions")
    public JAXBElement<DataWarehouseIntegrationStatusPropertyOptions> createDataWarehouseIntegrationStatusPropertyOptions(DataWarehouseIntegrationStatusPropertyOptions value) {
        return new JAXBElement<DataWarehouseIntegrationStatusPropertyOptions>(_DataWarehouseIntegrationStatusPropertyOptions_QNAME, DataWarehouseIntegrationStatusPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseRoutePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseRoutePropertyOptions")
    public JAXBElement<DataWarehouseRoutePropertyOptions> createDataWarehouseRoutePropertyOptions(DataWarehouseRoutePropertyOptions value) {
        return new JAXBElement<DataWarehouseRoutePropertyOptions>(_DataWarehouseRoutePropertyOptions_QNAME, DataWarehouseRoutePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentTypeDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentTypeDimensionPropertyOptions")
    public JAXBElement<EquipmentTypeDimensionPropertyOptions> createEquipmentTypeDimensionPropertyOptions(EquipmentTypeDimensionPropertyOptions value) {
        return new JAXBElement<EquipmentTypeDimensionPropertyOptions>(_EquipmentTypeDimensionPropertyOptions_QNAME, EquipmentTypeDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentDimensionPropertyOptions")
    public JAXBElement<EquipmentDimensionPropertyOptions> createEquipmentDimensionPropertyOptions(EquipmentDimensionPropertyOptions value) {
        return new JAXBElement<EquipmentDimensionPropertyOptions>(_EquipmentDimensionPropertyOptions_QNAME, EquipmentDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "LocationDimensionPropertyOptions")
    public JAXBElement<LocationDimensionPropertyOptions> createLocationDimensionPropertyOptions(LocationDimensionPropertyOptions value) {
        return new JAXBElement<LocationDimensionPropertyOptions>(_LocationDimensionPropertyOptions_QNAME, LocationDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationsUnitLevelPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OperationsUnitLevelPropertyOptions")
    public JAXBElement<OperationsUnitLevelPropertyOptions> createOperationsUnitLevelPropertyOptions(OperationsUnitLevelPropertyOptions value) {
        return new JAXBElement<OperationsUnitLevelPropertyOptions>(_OperationsUnitLevelPropertyOptions_QNAME, OperationsUnitLevelPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationsUnitPermissionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OperationsUnitPermissionPropertyOptions")
    public JAXBElement<OperationsUnitPermissionPropertyOptions> createOperationsUnitPermissionPropertyOptions(OperationsUnitPermissionPropertyOptions value) {
        return new JAXBElement<OperationsUnitPermissionPropertyOptions>(_OperationsUnitPermissionPropertyOptions_QNAME, OperationsUnitPermissionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteDescriptorDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RouteDescriptorDimensionPropertyOptions")
    public JAXBElement<RouteDescriptorDimensionPropertyOptions> createRouteDescriptorDimensionPropertyOptions(RouteDescriptorDimensionPropertyOptions value) {
        return new JAXBElement<RouteDescriptorDimensionPropertyOptions>(_RouteDescriptorDimensionPropertyOptions_QNAME, RouteDescriptorDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTypeDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ServiceTypeDimensionPropertyOptions")
    public JAXBElement<ServiceTypeDimensionPropertyOptions> createServiceTypeDimensionPropertyOptions(ServiceTypeDimensionPropertyOptions value) {
        return new JAXBElement<ServiceTypeDimensionPropertyOptions>(_ServiceTypeDimensionPropertyOptions_QNAME, ServiceTypeDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTypeDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "StopTypeDimensionPropertyOptions")
    public JAXBElement<StopTypeDimensionPropertyOptions> createStopTypeDimensionPropertyOptions(StopTypeDimensionPropertyOptions value) {
        return new JAXBElement<StopTypeDimensionPropertyOptions>(_StopTypeDimensionPropertyOptions_QNAME, StopTypeDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TimeDimensionPropertyOptions")
    public JAXBElement<TimeDimensionPropertyOptions> createTimeDimensionPropertyOptions(TimeDimensionPropertyOptions value) {
        return new JAXBElement<TimeDimensionPropertyOptions>(_TimeDimensionPropertyOptions_QNAME, TimeDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelLegTypeDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TravelLegTypeDimensionPropertyOptions")
    public JAXBElement<TravelLegTypeDimensionPropertyOptions> createTravelLegTypeDimensionPropertyOptions(TravelLegTypeDimensionPropertyOptions value) {
        return new JAXBElement<TravelLegTypeDimensionPropertyOptions>(_TravelLegTypeDimensionPropertyOptions_QNAME, TravelLegTypeDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerTypeDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "WorkerTypeDimensionPropertyOptions")
    public JAXBElement<WorkerTypeDimensionPropertyOptions> createWorkerTypeDimensionPropertyOptions(WorkerTypeDimensionPropertyOptions value) {
        return new JAXBElement<WorkerTypeDimensionPropertyOptions>(_WorkerTypeDimensionPropertyOptions_QNAME, WorkerTypeDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "WorkerDimensionPropertyOptions")
    public JAXBElement<WorkerDimensionPropertyOptions> createWorkerDimensionPropertyOptions(WorkerDimensionPropertyOptions value) {
        return new JAXBElement<WorkerDimensionPropertyOptions>(_WorkerDimensionPropertyOptions_QNAME, WorkerDimensionPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseDepotPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDepotPropertyOptions")
    public JAXBElement<DataWarehouseDepotPropertyOptions> createDataWarehouseDepotPropertyOptions(DataWarehouseDepotPropertyOptions value) {
        return new JAXBElement<DataWarehouseDepotPropertyOptions>(_DataWarehouseDepotPropertyOptions_QNAME, DataWarehouseDepotPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseRouteData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseRouteData")
    public JAXBElement<DataWarehouseRouteData> createDataWarehouseRouteData(DataWarehouseRouteData value) {
        return new JAXBElement<DataWarehouseRouteData>(_DataWarehouseRouteData_QNAME, DataWarehouseRouteData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseStop")
    public JAXBElement<DataWarehouseStop> createDataWarehouseStop(DataWarehouseStop value) {
        return new JAXBElement<DataWarehouseStop>(_DataWarehouseStop_QNAME, DataWarehouseStop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionFilterValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionFilterValues")
    public JAXBElement<DimensionFilterValues> createDimensionFilterValues(DimensionFilterValues value) {
        return new JAXBElement<DimensionFilterValues>(_DimensionFilterValues_QNAME, DimensionFilterValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Filters")
    public JAXBElement<Filters> createFilters(Filters value) {
        return new JAXBElement<Filters>(_Filters_QNAME, Filters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiDescription")
    public JAXBElement<DataWarehouseKpiDescription> createDataWarehouseKpiDescription(DataWarehouseKpiDescription value) {
        return new JAXBElement<DataWarehouseKpiDescription>(_DataWarehouseKpiDescription_QNAME, DataWarehouseKpiDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiMeasureDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseKpiMeasureDescription")
    public JAXBElement<ArrayOfDataWarehouseKpiMeasureDescription> createArrayOfDataWarehouseKpiMeasureDescription(ArrayOfDataWarehouseKpiMeasureDescription value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiMeasureDescription>(_ArrayOfDataWarehouseKpiMeasureDescription_QNAME, ArrayOfDataWarehouseKpiMeasureDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiMeasureDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiMeasureDescription")
    public JAXBElement<DataWarehouseKpiMeasureDescription> createDataWarehouseKpiMeasureDescription(DataWarehouseKpiMeasureDescription value) {
        return new JAXBElement<DataWarehouseKpiMeasureDescription>(_DataWarehouseKpiMeasureDescription_QNAME, DataWarehouseKpiMeasureDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiSettings")
    public JAXBElement<DataWarehouseKpiSettings> createDataWarehouseKpiSettings(DataWarehouseKpiSettings value) {
        return new JAXBElement<DataWarehouseKpiSettings>(_DataWarehouseKpiSettings_QNAME, DataWarehouseKpiSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiSortingOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiSortingOptions")
    public JAXBElement<DataWarehouseKpiSortingOptions> createDataWarehouseKpiSortingOptions(DataWarehouseKpiSortingOptions value) {
        return new JAXBElement<DataWarehouseKpiSortingOptions>(_DataWarehouseKpiSortingOptions_QNAME, DataWarehouseKpiSortingOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseResourceEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseResourceEvent")
    public JAXBElement<DataWarehouseResourceEvent> createDataWarehouseResourceEvent(DataWarehouseResourceEvent value) {
        return new JAXBElement<DataWarehouseResourceEvent>(_DataWarehouseResourceEvent_QNAME, DataWarehouseResourceEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseNavEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseNavEvent")
    public JAXBElement<DataWarehouseNavEvent> createDataWarehouseNavEvent(DataWarehouseNavEvent value) {
        return new JAXBElement<DataWarehouseNavEvent>(_DataWarehouseNavEvent_QNAME, DataWarehouseNavEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseNavRecalculationEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseNavRecalculationEvent")
    public JAXBElement<DataWarehouseNavRecalculationEvent> createDataWarehouseNavRecalculationEvent(DataWarehouseNavRecalculationEvent value) {
        return new JAXBElement<DataWarehouseNavRecalculationEvent>(_DataWarehouseNavRecalculationEvent_QNAME, DataWarehouseNavRecalculationEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTelematicsEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTelematicsEvent")
    public JAXBElement<DataWarehouseTelematicsEvent> createDataWarehouseTelematicsEvent(DataWarehouseTelematicsEvent value) {
        return new JAXBElement<DataWarehouseTelematicsEvent>(_DataWarehouseTelematicsEvent_QNAME, DataWarehouseTelematicsEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTelematicsDeviceInputOutputAccessoryEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTelematicsDeviceInputOutputAccessoryEvent")
    public JAXBElement<DataWarehouseTelematicsDeviceInputOutputAccessoryEvent> createDataWarehouseTelematicsDeviceInputOutputAccessoryEvent(DataWarehouseTelematicsDeviceInputOutputAccessoryEvent value) {
        return new JAXBElement<DataWarehouseTelematicsDeviceInputOutputAccessoryEvent>(_DataWarehouseTelematicsDeviceInputOutputAccessoryEvent_QNAME, DataWarehouseTelematicsDeviceInputOutputAccessoryEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseDoorStateException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDoorStateException")
    public JAXBElement<DataWarehouseDoorStateException> createDataWarehouseDoorStateException(DataWarehouseDoorStateException value) {
        return new JAXBElement<DataWarehouseDoorStateException>(_DataWarehouseDoorStateException_QNAME, DataWarehouseDoorStateException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseEngineIdleEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseEngineIdleEvent")
    public JAXBElement<DataWarehouseEngineIdleEvent> createDataWarehouseEngineIdleEvent(DataWarehouseEngineIdleEvent value) {
        return new JAXBElement<DataWarehouseEngineIdleEvent>(_DataWarehouseEngineIdleEvent_QNAME, DataWarehouseEngineIdleEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseHarshEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseHarshEvent")
    public JAXBElement<DataWarehouseHarshEvent> createDataWarehouseHarshEvent(DataWarehouseHarshEvent value) {
        return new JAXBElement<DataWarehouseHarshEvent>(_DataWarehouseHarshEvent_QNAME, DataWarehouseHarshEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseHarshAccelerationEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseHarshAccelerationEvent")
    public JAXBElement<DataWarehouseHarshAccelerationEvent> createDataWarehouseHarshAccelerationEvent(DataWarehouseHarshAccelerationEvent value) {
        return new JAXBElement<DataWarehouseHarshAccelerationEvent>(_DataWarehouseHarshAccelerationEvent_QNAME, DataWarehouseHarshAccelerationEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseHarshBrakingEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseHarshBrakingEvent")
    public JAXBElement<DataWarehouseHarshBrakingEvent> createDataWarehouseHarshBrakingEvent(DataWarehouseHarshBrakingEvent value) {
        return new JAXBElement<DataWarehouseHarshBrakingEvent>(_DataWarehouseHarshBrakingEvent_QNAME, DataWarehouseHarshBrakingEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseHarshCorneringEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseHarshCorneringEvent")
    public JAXBElement<DataWarehouseHarshCorneringEvent> createDataWarehouseHarshCorneringEvent(DataWarehouseHarshCorneringEvent value) {
        return new JAXBElement<DataWarehouseHarshCorneringEvent>(_DataWarehouseHarshCorneringEvent_QNAME, DataWarehouseHarshCorneringEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseSpeedingEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseSpeedingEvent")
    public JAXBElement<DataWarehouseSpeedingEvent> createDataWarehouseSpeedingEvent(DataWarehouseSpeedingEvent value) {
        return new JAXBElement<DataWarehouseSpeedingEvent>(_DataWarehouseSpeedingEvent_QNAME, DataWarehouseSpeedingEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseTemperatureException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTemperatureException")
    public JAXBElement<DataWarehouseTemperatureException> createDataWarehouseTemperatureException(DataWarehouseTemperatureException value) {
        return new JAXBElement<DataWarehouseTemperatureException>(_DataWarehouseTemperatureException_QNAME, DataWarehouseTemperatureException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionKeyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionKeyDetail")
    public JAXBElement<DimensionKeyDetail> createDimensionKeyDetail(DimensionKeyDetail value) {
        return new JAXBElement<DimensionKeyDetail>(_DimensionKeyDetail_QNAME, DimensionKeyDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanDimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "BooleanDimensionDetail")
    public JAXBElement<BooleanDimensionDetail> createBooleanDimensionDetail(BooleanDimensionDetail value) {
        return new JAXBElement<BooleanDimensionDetail>(_BooleanDimensionDetail_QNAME, BooleanDimensionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumDimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EnumDimensionDetail")
    public JAXBElement<EnumDimensionDetail> createEnumDimensionDetail(EnumDimensionDetail value) {
        return new JAXBElement<EnumDimensionDetail>(_EnumDimensionDetail_QNAME, EnumDimensionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeVarianceDimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TimeVarianceDimensionDetail")
    public JAXBElement<TimeVarianceDimensionDetail> createTimeVarianceDimensionDetail(TimeVarianceDimensionDetail value) {
        return new JAXBElement<TimeVarianceDimensionDetail>(_TimeVarianceDimensionDetail_QNAME, TimeVarianceDimensionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlannedAndActualDimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "PlannedAndActualDimensionDetail")
    public JAXBElement<PlannedAndActualDimensionDetail> createPlannedAndActualDimensionDetail(PlannedAndActualDimensionDetail value) {
        return new JAXBElement<PlannedAndActualDimensionDetail>(_PlannedAndActualDimensionDetail_QNAME, PlannedAndActualDimensionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationTypeDimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "LocationTypeDimensionDetail")
    public JAXBElement<LocationTypeDimensionDetail> createLocationTypeDimensionDetail(LocationTypeDimensionDetail value) {
        return new JAXBElement<LocationTypeDimensionDetail>(_LocationTypeDimensionDetail_QNAME, LocationTypeDimensionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumericDimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "NumericDimensionDetail")
    public JAXBElement<NumericDimensionDetail> createNumericDimensionDetail(NumericDimensionDetail value) {
        return new JAXBElement<NumericDimensionDetail>(_NumericDimensionDetail_QNAME, NumericDimensionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondaryDimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "SecondaryDimensionDetail")
    public JAXBElement<SecondaryDimensionDetail> createSecondaryDimensionDetail(SecondaryDimensionDetail value) {
        return new JAXBElement<SecondaryDimensionDetail>(_SecondaryDimensionDetail_QNAME, SecondaryDimensionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringDimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "StringDimensionDetail")
    public JAXBElement<StringDimensionDetail> createStringDimensionDetail(StringDimensionDetail value) {
        return new JAXBElement<StringDimensionDetail>(_StringDimensionDetail_QNAME, StringDimensionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiCriteria")
    public JAXBElement<DataWarehouseKpiCriteria> createDataWarehouseKpiCriteria(DataWarehouseKpiCriteria value) {
        return new JAXBElement<DataWarehouseKpiCriteria>(_DataWarehouseKpiCriteria_QNAME, DataWarehouseKpiCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiMeasureFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiMeasureFilter")
    public JAXBElement<DataWarehouseKpiMeasureFilter> createDataWarehouseKpiMeasureFilter(DataWarehouseKpiMeasureFilter value) {
        return new JAXBElement<DataWarehouseKpiMeasureFilter>(_DataWarehouseKpiMeasureFilter_QNAME, DataWarehouseKpiMeasureFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiMeasureDataFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseKpiMeasureDataFilter")
    public JAXBElement<ArrayOfDataWarehouseKpiMeasureDataFilter> createArrayOfDataWarehouseKpiMeasureDataFilter(ArrayOfDataWarehouseKpiMeasureDataFilter value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiMeasureDataFilter>(_ArrayOfDataWarehouseKpiMeasureDataFilter_QNAME, ArrayOfDataWarehouseKpiMeasureDataFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiMeasureDataFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiMeasureDataFilter")
    public JAXBElement<DataWarehouseKpiMeasureDataFilter> createDataWarehouseKpiMeasureDataFilter(DataWarehouseKpiMeasureDataFilter value) {
        return new JAXBElement<DataWarehouseKpiMeasureDataFilter>(_DataWarehouseKpiMeasureDataFilter_QNAME, DataWarehouseKpiMeasureDataFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiOperationsUnitDimensionsFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiOperationsUnitDimensionsFilter")
    public JAXBElement<DataWarehouseKpiOperationsUnitDimensionsFilter> createDataWarehouseKpiOperationsUnitDimensionsFilter(DataWarehouseKpiOperationsUnitDimensionsFilter value) {
        return new JAXBElement<DataWarehouseKpiOperationsUnitDimensionsFilter>(_DataWarehouseKpiOperationsUnitDimensionsFilter_QNAME, DataWarehouseKpiOperationsUnitDimensionsFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiRule")
    public JAXBElement<DataWarehouseKpiRule> createDataWarehouseKpiRule(DataWarehouseKpiRule value) {
        return new JAXBElement<DataWarehouseKpiRule>(_DataWarehouseKpiRule_QNAME, DataWarehouseKpiRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseKpiCriteria")
    public JAXBElement<ArrayOfDataWarehouseKpiCriteria> createArrayOfDataWarehouseKpiCriteria(ArrayOfDataWarehouseKpiCriteria value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiCriteria>(_ArrayOfDataWarehouseKpiCriteria_QNAME, ArrayOfDataWarehouseKpiCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiRulesSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiRulesSet")
    public JAXBElement<DataWarehouseKpiRulesSet> createDataWarehouseKpiRulesSet(DataWarehouseKpiRulesSet value) {
        return new JAXBElement<DataWarehouseKpiRulesSet>(_DataWarehouseKpiRulesSet_QNAME, DataWarehouseKpiRulesSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseKpiRule")
    public JAXBElement<ArrayOfDataWarehouseKpiRule> createArrayOfDataWarehouseKpiRule(ArrayOfDataWarehouseKpiRule value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiRule>(_ArrayOfDataWarehouseKpiRule_QNAME, ArrayOfDataWarehouseKpiRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomicMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "AtomicMeasure")
    public JAXBElement<AtomicMeasure> createAtomicMeasure(AtomicMeasure value) {
        return new JAXBElement<AtomicMeasure>(_AtomicMeasure_QNAME, AtomicMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CompositeMeasure")
    public JAXBElement<CompositeMeasure> createCompositeMeasure(CompositeMeasure value) {
        return new JAXBElement<CompositeMeasure>(_CompositeMeasure_QNAME, CompositeMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayCountMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DayCountMeasure")
    public JAXBElement<DayCountMeasure> createDayCountMeasure(DayCountMeasure value) {
        return new JAXBElement<DayCountMeasure>(_DayCountMeasure_QNAME, DayCountMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "MultiMeasure")
    public JAXBElement<MultiMeasure> createMultiMeasure(MultiMeasure value) {
        return new JAXBElement<MultiMeasure>(_MultiMeasure_QNAME, MultiMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfIMeasure")
    public JAXBElement<ArrayOfIMeasure> createArrayOfIMeasure(ArrayOfIMeasure value) {
        return new JAXBElement<ArrayOfIMeasure>(_ArrayOfIMeasure_QNAME, ArrayOfIMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredefinedCompositeMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "PredefinedCompositeMeasure")
    public JAXBElement<PredefinedCompositeMeasure> createPredefinedCompositeMeasure(PredefinedCompositeMeasure value) {
        return new JAXBElement<PredefinedCompositeMeasure>(_PredefinedCompositeMeasure_QNAME, PredefinedCompositeMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ScoreMeasure")
    public JAXBElement<ScoreMeasure> createScoreMeasure(ScoreMeasure value) {
        return new JAXBElement<ScoreMeasure>(_ScoreMeasure_QNAME, ScoreMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfScorecardBand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfScorecardBand")
    public JAXBElement<ArrayOfScorecardBand> createArrayOfScorecardBand(ArrayOfScorecardBand value) {
        return new JAXBElement<ArrayOfScorecardBand>(_ArrayOfScorecardBand_QNAME, ArrayOfScorecardBand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScorecardBand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ScorecardBand")
    public JAXBElement<ScorecardBand> createScorecardBand(ScorecardBand value) {
        return new JAXBElement<ScorecardBand>(_ScorecardBand_QNAME, ScorecardBand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScorecardBandThreshold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ScorecardBandThreshold")
    public JAXBElement<ScorecardBandThreshold> createScorecardBandThreshold(ScorecardBandThreshold value) {
        return new JAXBElement<ScorecardBandThreshold>(_ScorecardBandThreshold_QNAME, ScorecardBandThreshold.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondaryDimensionCountMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "SecondaryDimensionCountMeasure")
    public JAXBElement<SecondaryDimensionCountMeasure> createSecondaryDimensionCountMeasure(SecondaryDimensionCountMeasure value) {
        return new JAXBElement<SecondaryDimensionCountMeasure>(_SecondaryDimensionCountMeasure_QNAME, SecondaryDimensionCountMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ValueMeasure")
    public JAXBElement<ValueMeasure> createValueMeasure(ValueMeasure value) {
        return new JAXBElement<ValueMeasure>(_ValueMeasure_QNAME, ValueMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseOperationsUnitPermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseOperationsUnitPermission")
    public JAXBElement<ArrayOfDataWarehouseOperationsUnitPermission> createArrayOfDataWarehouseOperationsUnitPermission(ArrayOfDataWarehouseOperationsUnitPermission value) {
        return new JAXBElement<ArrayOfDataWarehouseOperationsUnitPermission>(_ArrayOfDataWarehouseOperationsUnitPermission_QNAME, ArrayOfDataWarehouseOperationsUnitPermission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDimensionDetail")
    public JAXBElement<ArrayOfDimensionDetail> createArrayOfDimensionDetail(ArrayOfDimensionDetail value) {
        return new JAXBElement<ArrayOfDimensionDetail>(_ArrayOfDimensionDetail_QNAME, ArrayOfDimensionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseSecondaryDimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseSecondaryDimensionType")
    public JAXBElement<ArrayOfDataWarehouseSecondaryDimensionType> createArrayOfDataWarehouseSecondaryDimensionType(ArrayOfDataWarehouseSecondaryDimensionType value) {
        return new JAXBElement<ArrayOfDataWarehouseSecondaryDimensionType>(_ArrayOfDataWarehouseSecondaryDimensionType_QNAME, ArrayOfDataWarehouseSecondaryDimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiExportJobInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseKpiExportJobInfo")
    public JAXBElement<ArrayOfDataWarehouseKpiExportJobInfo> createArrayOfDataWarehouseKpiExportJobInfo(ArrayOfDataWarehouseKpiExportJobInfo value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiExportJobInfo>(_ArrayOfDataWarehouseKpiExportJobInfo_QNAME, ArrayOfDataWarehouseKpiExportJobInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiExportResultDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiExportResultDto")
    public JAXBElement<KpiExportResultDto> createKpiExportResultDto(KpiExportResultDto value) {
        return new JAXBElement<KpiExportResultDto>(_KpiExportResultDto_QNAME, KpiExportResultDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "SimpleExpressionBase")
    public JAXBElement<SimpleExpressionBase> createSimpleExpressionBase(SimpleExpressionBase value) {
        return new JAXBElement<SimpleExpressionBase>(_SimpleExpressionBase_QNAME, SimpleExpressionBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "BinaryExpressionBase")
    public JAXBElement<BinaryExpressionBase> createBinaryExpressionBase(BinaryExpressionBase value) {
        return new JAXBElement<BinaryExpressionBase>(_BinaryExpressionBase_QNAME, BinaryExpressionBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArithmeticExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "ArithmeticExpressionBase")
    public JAXBElement<ArithmeticExpressionBase> createArithmeticExpressionBase(ArithmeticExpressionBase value) {
        return new JAXBElement<ArithmeticExpressionBase>(_ArithmeticExpressionBase_QNAME, ArithmeticExpressionBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "AddExpression")
    public JAXBElement<AddExpression> createAddExpression(AddExpression value) {
        return new JAXBElement<AddExpression>(_AddExpression_QNAME, AddExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "MultiplyExpression")
    public JAXBElement<MultiplyExpression> createMultiplyExpression(MultiplyExpression value) {
        return new JAXBElement<MultiplyExpression>(_MultiplyExpression_QNAME, MultiplyExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "DivideExpression")
    public JAXBElement<DivideExpression> createDivideExpression(DivideExpression value) {
        return new JAXBElement<DivideExpression>(_DivideExpression_QNAME, DivideExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "SubtractExpression")
    public JAXBElement<SubtractExpression> createSubtractExpression(SubtractExpression value) {
        return new JAXBElement<SubtractExpression>(_SubtractExpression_QNAME, SubtractExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComparisonExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "ComparisonExpressionBase")
    public JAXBElement<ComparisonExpressionBase> createComparisonExpressionBase(ComparisonExpressionBase value) {
        return new JAXBElement<ComparisonExpressionBase>(_ComparisonExpressionBase_QNAME, ComparisonExpressionBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpatialWithinExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "SpatialWithinExpression")
    public JAXBElement<SpatialWithinExpression> createSpatialWithinExpression(SpatialWithinExpression value) {
        return new JAXBElement<SpatialWithinExpression>(_SpatialWithinExpression_QNAME, SpatialWithinExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EqualToExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "EqualToExpression")
    public JAXBElement<EqualToExpression> createEqualToExpression(EqualToExpression value) {
        return new JAXBElement<EqualToExpression>(_EqualToExpression_QNAME, EqualToExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreaterThanExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "GreaterThanExpression")
    public JAXBElement<GreaterThanExpression> createGreaterThanExpression(GreaterThanExpression value) {
        return new JAXBElement<GreaterThanExpression>(_GreaterThanExpression_QNAME, GreaterThanExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreaterThanOrEqualToExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "GreaterThanOrEqualToExpression")
    public JAXBElement<GreaterThanOrEqualToExpression> createGreaterThanOrEqualToExpression(GreaterThanOrEqualToExpression value) {
        return new JAXBElement<GreaterThanOrEqualToExpression>(_GreaterThanOrEqualToExpression_QNAME, GreaterThanOrEqualToExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "InExpression")
    public JAXBElement<InExpression> createInExpression(InExpression value) {
        return new JAXBElement<InExpression>(_InExpression_QNAME, InExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LessThanExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "LessThanExpression")
    public JAXBElement<LessThanExpression> createLessThanExpression(LessThanExpression value) {
        return new JAXBElement<LessThanExpression>(_LessThanExpression_QNAME, LessThanExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LessThanOrEqualToExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "LessThanOrEqualToExpression")
    public JAXBElement<LessThanOrEqualToExpression> createLessThanOrEqualToExpression(LessThanOrEqualToExpression value) {
        return new JAXBElement<LessThanOrEqualToExpression>(_LessThanOrEqualToExpression_QNAME, LessThanOrEqualToExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LikeExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "LikeExpression")
    public JAXBElement<LikeExpression> createLikeExpression(LikeExpression value) {
        return new JAXBElement<LikeExpression>(_LikeExpression_QNAME, LikeExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "ValueExpression")
    public JAXBElement<ValueExpression> createValueExpression(ValueExpression value) {
        return new JAXBElement<ValueExpression>(_ValueExpression_QNAME, ValueExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "PropertyExpression")
    public JAXBElement<PropertyExpression> createPropertyExpression(PropertyExpression value) {
        return new JAXBElement<PropertyExpression>(_PropertyExpression_QNAME, PropertyExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "CompositeExpressionBase")
    public JAXBElement<CompositeExpressionBase> createCompositeExpressionBase(CompositeExpressionBase value) {
        return new JAXBElement<CompositeExpressionBase>(_CompositeExpressionBase_QNAME, CompositeExpressionBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSimpleExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "ArrayOfSimpleExpressionBase")
    public JAXBElement<ArrayOfSimpleExpressionBase> createArrayOfSimpleExpressionBase(ArrayOfSimpleExpressionBase value) {
        return new JAXBElement<ArrayOfSimpleExpressionBase>(_ArrayOfSimpleExpressionBase_QNAME, ArrayOfSimpleExpressionBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AndExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "AndExpression")
    public JAXBElement<AndExpression> createAndExpression(AndExpression value) {
        return new JAXBElement<AndExpression>(_AndExpression_QNAME, AndExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "OrExpression")
    public JAXBElement<OrExpression> createOrExpression(OrExpression value) {
        return new JAXBElement<OrExpression>(_OrExpression_QNAME, OrExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "NotExpression")
    public JAXBElement<NotExpression> createNotExpression(NotExpression value) {
        return new JAXBElement<NotExpression>(_NotExpression_QNAME, NotExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictedEquipmentHoursMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RestrictedEquipmentHoursMode")
    public JAXBElement<RestrictedEquipmentHoursMode> createRestrictedEquipmentHoursMode(RestrictedEquipmentHoursMode value) {
        return new JAXBElement<RestrictedEquipmentHoursMode>(_RestrictedEquipmentHoursMode_QNAME, RestrictedEquipmentHoursMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictedEquipmentHoursType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RestrictedEquipmentHoursType")
    public JAXBElement<RestrictedEquipmentHoursType> createRestrictedEquipmentHoursType(RestrictedEquipmentHoursType value) {
        return new JAXBElement<RestrictedEquipmentHoursType>(_RestrictedEquipmentHoursType_QNAME, RestrictedEquipmentHoursType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "TemperatureLimitType")
    public JAXBElement<TemperatureLimitType> createTemperatureLimitType(TemperatureLimitType value) {
        return new JAXBElement<TemperatureLimitType>(_TemperatureLimitType_QNAME, TemperatureLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceExceptionRuleFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ResourceExceptionRuleFunction")
    public JAXBElement<ResourceExceptionRuleFunction> createResourceExceptionRuleFunction(ResourceExceptionRuleFunction value) {
        return new JAXBElement<ResourceExceptionRuleFunction>(_ResourceExceptionRuleFunction_QNAME, ResourceExceptionRuleFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientRoutePathDeviationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "NavClientRoutePathDeviationFunction")
    public JAXBElement<NavClientRoutePathDeviationFunction> createNavClientRoutePathDeviationFunction(NavClientRoutePathDeviationFunction value) {
        return new JAXBElement<NavClientRoutePathDeviationFunction>(_NavClientRoutePathDeviationFunction_QNAME, NavClientRoutePathDeviationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientSpeedViolationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "NavClientSpeedViolationFunction")
    public JAXBElement<NavClientSpeedViolationFunction> createNavClientSpeedViolationFunction(NavClientSpeedViolationFunction value) {
        return new JAXBElement<NavClientSpeedViolationFunction>(_NavClientSpeedViolationFunction_QNAME, NavClientSpeedViolationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticTroubleCodeFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DiagnosticTroubleCodeFunction")
    public JAXBElement<DiagnosticTroubleCodeFunction> createDiagnosticTroubleCodeFunction(DiagnosticTroubleCodeFunction value) {
        return new JAXBElement<DiagnosticTroubleCodeFunction>(_DiagnosticTroubleCodeFunction_QNAME, DiagnosticTroubleCodeFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceExceptionSpecialDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ResourceExceptionSpecialDescriptor")
    public JAXBElement<ResourceExceptionSpecialDescriptor> createResourceExceptionSpecialDescriptor(ResourceExceptionSpecialDescriptor value) {
        return new JAXBElement<ResourceExceptionSpecialDescriptor>(_ResourceExceptionSpecialDescriptor_QNAME, ResourceExceptionSpecialDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientRoutePathDeviationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "NavClientRoutePathDeviationDescriptor")
    public JAXBElement<NavClientRoutePathDeviationDescriptor> createNavClientRoutePathDeviationDescriptor(NavClientRoutePathDeviationDescriptor value) {
        return new JAXBElement<NavClientRoutePathDeviationDescriptor>(_NavClientRoutePathDeviationDescriptor_QNAME, NavClientRoutePathDeviationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticTroubleCodeDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DiagnosticTroubleCodeDescriptor")
    public JAXBElement<DiagnosticTroubleCodeDescriptor> createDiagnosticTroubleCodeDescriptor(DiagnosticTroubleCodeDescriptor value) {
        return new JAXBElement<DiagnosticTroubleCodeDescriptor>(_DiagnosticTroubleCodeDescriptor_QNAME, DiagnosticTroubleCodeDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ArrayOfDiagnosticTroubleCodeDescriptor.DiagnosticTroubleCodeDetail")
    public JAXBElement<ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail> createArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail(ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail value) {
        return new JAXBElement<ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail>(_ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail_QNAME, ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DiagnosticTroubleCodeDescriptor.DiagnosticTroubleCodeDetail")
    public JAXBElement<DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail> createDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail(DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail value) {
        return new JAXBElement<DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail_QNAME, DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoorStateFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DoorStateFunction")
    public JAXBElement<DoorStateFunction> createDoorStateFunction(DoorStateFunction value) {
        return new JAXBElement<DoorStateFunction>(_DoorStateFunction_QNAME, DoorStateFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteVehicleShutdownFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RemoteVehicleShutdownFunction")
    public JAXBElement<RemoteVehicleShutdownFunction> createRemoteVehicleShutdownFunction(RemoteVehicleShutdownFunction value) {
        return new JAXBElement<RemoteVehicleShutdownFunction>(_RemoteVehicleShutdownFunction_QNAME, RemoteVehicleShutdownFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatBeltViolatioFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "SeatBeltViolatioFunction")
    public JAXBElement<SeatBeltViolatioFunction> createSeatBeltViolatioFunction(SeatBeltViolatioFunction value) {
        return new JAXBElement<SeatBeltViolatioFunction>(_SeatBeltViolatioFunction_QNAME, SeatBeltViolatioFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "TemperatureFunction")
    public JAXBElement<TemperatureFunction> createTemperatureFunction(TemperatureFunction value) {
        return new JAXBElement<TemperatureFunction>(_TemperatureFunction_QNAME, TemperatureFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HOSOnDutyWithoutActivityFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "HOSOnDutyWithoutActivityFunction")
    public JAXBElement<HOSOnDutyWithoutActivityFunction> createHOSOnDutyWithoutActivityFunction(HOSOnDutyWithoutActivityFunction value) {
        return new JAXBElement<HOSOnDutyWithoutActivityFunction>(_HOSOnDutyWithoutActivityFunction_QNAME, HOSOnDutyWithoutActivityFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PanicButtonFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "PanicButtonFunction")
    public JAXBElement<PanicButtonFunction> createPanicButtonFunction(PanicButtonFunction value) {
        return new JAXBElement<PanicButtonFunction>(_PanicButtonFunction_QNAME, PanicButtonFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotentialHOSDriveTimeViolationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "PotentialHOSDriveTimeViolationFunction")
    public JAXBElement<PotentialHOSDriveTimeViolationFunction> createPotentialHOSDriveTimeViolationFunction(PotentialHOSDriveTimeViolationFunction value) {
        return new JAXBElement<PotentialHOSDriveTimeViolationFunction>(_PotentialHOSDriveTimeViolationFunction_QNAME, PotentialHOSDriveTimeViolationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotentialHOSDutyTimeViolationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "PotentialHOSDutyTimeViolationFunction")
    public JAXBElement<PotentialHOSDutyTimeViolationFunction> createPotentialHOSDutyTimeViolationFunction(PotentialHOSDutyTimeViolationFunction value) {
        return new JAXBElement<PotentialHOSDutyTimeViolationFunction>(_PotentialHOSDutyTimeViolationFunction_QNAME, PotentialHOSDutyTimeViolationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceLowBatteryFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DeviceLowBatteryFunction")
    public JAXBElement<DeviceLowBatteryFunction> createDeviceLowBatteryFunction(DeviceLowBatteryFunction value) {
        return new JAXBElement<DeviceLowBatteryFunction>(_DeviceLowBatteryFunction_QNAME, DeviceLowBatteryFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcessiveIdlingFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ExcessiveIdlingFunction")
    public JAXBElement<ExcessiveIdlingFunction> createExcessiveIdlingFunction(ExcessiveIdlingFunction value) {
        return new JAXBElement<ExcessiveIdlingFunction>(_ExcessiveIdlingFunction_QNAME, ExcessiveIdlingFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HarshAccelerationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "HarshAccelerationFunction")
    public JAXBElement<HarshAccelerationFunction> createHarshAccelerationFunction(HarshAccelerationFunction value) {
        return new JAXBElement<HarshAccelerationFunction>(_HarshAccelerationFunction_QNAME, HarshAccelerationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HarshBrakingFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "HarshBrakingFunction")
    public JAXBElement<HarshBrakingFunction> createHarshBrakingFunction(HarshBrakingFunction value) {
        return new JAXBElement<HarshBrakingFunction>(_HarshBrakingFunction_QNAME, HarshBrakingFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HarshCorneringFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "HarshCorneringFunction")
    public JAXBElement<HarshCorneringFunction> createHarshCorneringFunction(HarshCorneringFunction value) {
        return new JAXBElement<HarshCorneringFunction>(_HarshCorneringFunction_QNAME, HarshCorneringFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectedServiceWindowDeviationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ProjectedServiceWindowDeviationFunction")
    public JAXBElement<ProjectedServiceWindowDeviationFunction> createProjectedServiceWindowDeviationFunction(ProjectedServiceWindowDeviationFunction value) {
        return new JAXBElement<ProjectedServiceWindowDeviationFunction>(_ProjectedServiceWindowDeviationFunction_QNAME, ProjectedServiceWindowDeviationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictedEquipmentHoursFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RestrictedEquipmentHoursFunction")
    public JAXBElement<RestrictedEquipmentHoursFunction> createRestrictedEquipmentHoursFunction(RestrictedEquipmentHoursFunction value) {
        return new JAXBElement<RestrictedEquipmentHoursFunction>(_RestrictedEquipmentHoursFunction_QNAME, RestrictedEquipmentHoursFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictedLocationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RestrictedLocationFunction")
    public JAXBElement<RestrictedLocationFunction> createRestrictedLocationFunction(RestrictedLocationFunction value) {
        return new JAXBElement<RestrictedLocationFunction>(_RestrictedLocationFunction_QNAME, RestrictedLocationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceableStopServiceTimeDeviationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ServiceableStopServiceTimeDeviationFunction")
    public JAXBElement<ServiceableStopServiceTimeDeviationFunction> createServiceableStopServiceTimeDeviationFunction(ServiceableStopServiceTimeDeviationFunction value) {
        return new JAXBElement<ServiceableStopServiceTimeDeviationFunction>(_ServiceableStopServiceTimeDeviationFunction_QNAME, ServiceableStopServiceTimeDeviationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GpsDistanceToLocationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "GpsDistanceToLocationFunction")
    public JAXBElement<GpsDistanceToLocationFunction> createGpsDistanceToLocationFunction(GpsDistanceToLocationFunction value) {
        return new JAXBElement<GpsDistanceToLocationFunction>(_GpsDistanceToLocationFunction_QNAME, GpsDistanceToLocationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GpsGapFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "GpsGapFunction")
    public JAXBElement<GpsGapFunction> createGpsGapFunction(GpsGapFunction value) {
        return new JAXBElement<GpsGapFunction>(_GpsGapFunction_QNAME, GpsGapFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoGpsFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "NoGpsFunction")
    public JAXBElement<NoGpsFunction> createNoGpsFunction(NoGpsFunction value) {
        return new JAXBElement<NoGpsFunction>(_NoGpsFunction_QNAME, NoGpsFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutOfContactFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "OutOfContactFunction")
    public JAXBElement<OutOfContactFunction> createOutOfContactFunction(OutOfContactFunction value) {
        return new JAXBElement<OutOfContactFunction>(_OutOfContactFunction_QNAME, OutOfContactFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffPlannedCompleteTimeFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "OffPlannedCompleteTimeFunction")
    public JAXBElement<OffPlannedCompleteTimeFunction> createOffPlannedCompleteTimeFunction(OffPlannedCompleteTimeFunction value) {
        return new JAXBElement<OffPlannedCompleteTimeFunction>(_OffPlannedCompleteTimeFunction_QNAME, OffPlannedCompleteTimeFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutOfBoundsArriveDepartFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "OutOfBoundsArriveDepartFunction")
    public JAXBElement<OutOfBoundsArriveDepartFunction> createOutOfBoundsArriveDepartFunction(OutOfBoundsArriveDepartFunction value) {
        return new JAXBElement<OutOfBoundsArriveDepartFunction>(_OutOfBoundsArriveDepartFunction_QNAME, OutOfBoundsArriveDepartFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteNetworkSpeedViolationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RouteNetworkSpeedViolationFunction")
    public JAXBElement<RouteNetworkSpeedViolationFunction> createRouteNetworkSpeedViolationFunction(RouteNetworkSpeedViolationFunction value) {
        return new JAXBElement<RouteNetworkSpeedViolationFunction>(_RouteNetworkSpeedViolationFunction_QNAME, RouteNetworkSpeedViolationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePathDeviationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RoutePathDeviationFunction")
    public JAXBElement<RoutePathDeviationFunction> createRoutePathDeviationFunction(RoutePathDeviationFunction value) {
        return new JAXBElement<RoutePathDeviationFunction>(_RoutePathDeviationFunction_QNAME, RoutePathDeviationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaticSpeedViolationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "StaticSpeedViolationFunction")
    public JAXBElement<StaticSpeedViolationFunction> createStaticSpeedViolationFunction(StaticSpeedViolationFunction value) {
        return new JAXBElement<StaticSpeedViolationFunction>(_StaticSpeedViolationFunction_QNAME, StaticSpeedViolationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnplannedStopDistanceToLocationFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "UnplannedStopDistanceToLocationFunction")
    public JAXBElement<UnplannedStopDistanceToLocationFunction> createUnplannedStopDistanceToLocationFunction(UnplannedStopDistanceToLocationFunction value) {
        return new JAXBElement<UnplannedStopDistanceToLocationFunction>(_UnplannedStopDistanceToLocationFunction_QNAME, UnplannedStopDistanceToLocationFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationaryResourceFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "StationaryResourceFunction")
    public JAXBElement<StationaryResourceFunction> createStationaryResourceFunction(StationaryResourceFunction value) {
        return new JAXBElement<StationaryResourceFunction>(_StationaryResourceFunction_QNAME, StationaryResourceFunction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoorStateDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DoorStateDescriptor")
    public JAXBElement<DoorStateDescriptor> createDoorStateDescriptor(DoorStateDescriptor value) {
        return new JAXBElement<DoorStateDescriptor>(_DoorStateDescriptor_QNAME, DoorStateDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavClientSpeedViolationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "NavClientSpeedViolationDescriptor")
    public JAXBElement<NavClientSpeedViolationDescriptor> createNavClientSpeedViolationDescriptor(NavClientSpeedViolationDescriptor value) {
        return new JAXBElement<NavClientSpeedViolationDescriptor>(_NavClientSpeedViolationDescriptor_QNAME, NavClientSpeedViolationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteVehicleShutdownDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RemoteVehicleShutdownDescriptor")
    public JAXBElement<RemoteVehicleShutdownDescriptor> createRemoteVehicleShutdownDescriptor(RemoteVehicleShutdownDescriptor value) {
        return new JAXBElement<RemoteVehicleShutdownDescriptor>(_RemoteVehicleShutdownDescriptor_QNAME, RemoteVehicleShutdownDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatBeltViolationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "SeatBeltViolationDescriptor")
    public JAXBElement<SeatBeltViolationDescriptor> createSeatBeltViolationDescriptor(SeatBeltViolationDescriptor value) {
        return new JAXBElement<SeatBeltViolationDescriptor>(_SeatBeltViolationDescriptor_QNAME, SeatBeltViolationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "TemperatureDescriptor")
    public JAXBElement<TemperatureDescriptor> createTemperatureDescriptor(TemperatureDescriptor value) {
        return new JAXBElement<TemperatureDescriptor>(_TemperatureDescriptor_QNAME, TemperatureDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HOSOnDutyWithoutActivityDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "HOSOnDutyWithoutActivityDescriptor")
    public JAXBElement<HOSOnDutyWithoutActivityDescriptor> createHOSOnDutyWithoutActivityDescriptor(HOSOnDutyWithoutActivityDescriptor value) {
        return new JAXBElement<HOSOnDutyWithoutActivityDescriptor>(_HOSOnDutyWithoutActivityDescriptor_QNAME, HOSOnDutyWithoutActivityDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PanicButtonDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "PanicButtonDescriptor")
    public JAXBElement<PanicButtonDescriptor> createPanicButtonDescriptor(PanicButtonDescriptor value) {
        return new JAXBElement<PanicButtonDescriptor>(_PanicButtonDescriptor_QNAME, PanicButtonDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotentialHOSDriveTimeViolationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "PotentialHOSDriveTimeViolationDescriptor")
    public JAXBElement<PotentialHOSDriveTimeViolationDescriptor> createPotentialHOSDriveTimeViolationDescriptor(PotentialHOSDriveTimeViolationDescriptor value) {
        return new JAXBElement<PotentialHOSDriveTimeViolationDescriptor>(_PotentialHOSDriveTimeViolationDescriptor_QNAME, PotentialHOSDriveTimeViolationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotentialHOSDutyTimeViolationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "PotentialHOSDutyTimeViolationDescriptor")
    public JAXBElement<PotentialHOSDutyTimeViolationDescriptor> createPotentialHOSDutyTimeViolationDescriptor(PotentialHOSDutyTimeViolationDescriptor value) {
        return new JAXBElement<PotentialHOSDutyTimeViolationDescriptor>(_PotentialHOSDutyTimeViolationDescriptor_QNAME, PotentialHOSDutyTimeViolationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictedEquipmentHoursDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RestrictedEquipmentHoursDescriptor")
    public JAXBElement<RestrictedEquipmentHoursDescriptor> createRestrictedEquipmentHoursDescriptor(RestrictedEquipmentHoursDescriptor value) {
        return new JAXBElement<RestrictedEquipmentHoursDescriptor>(_RestrictedEquipmentHoursDescriptor_QNAME, RestrictedEquipmentHoursDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictedLocationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RestrictedLocationDescriptor")
    public JAXBElement<RestrictedLocationDescriptor> createRestrictedLocationDescriptor(RestrictedLocationDescriptor value) {
        return new JAXBElement<RestrictedLocationDescriptor>(_RestrictedLocationDescriptor_QNAME, RestrictedLocationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceLowBatteryDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DeviceLowBatteryDescriptor")
    public JAXBElement<DeviceLowBatteryDescriptor> createDeviceLowBatteryDescriptor(DeviceLowBatteryDescriptor value) {
        return new JAXBElement<DeviceLowBatteryDescriptor>(_DeviceLowBatteryDescriptor_QNAME, DeviceLowBatteryDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcessiveIdlingDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ExcessiveIdlingDescriptor")
    public JAXBElement<ExcessiveIdlingDescriptor> createExcessiveIdlingDescriptor(ExcessiveIdlingDescriptor value) {
        return new JAXBElement<ExcessiveIdlingDescriptor>(_ExcessiveIdlingDescriptor_QNAME, ExcessiveIdlingDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectedServiceWindowDeviationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ProjectedServiceWindowDeviationDescriptor")
    public JAXBElement<ProjectedServiceWindowDeviationDescriptor> createProjectedServiceWindowDeviationDescriptor(ProjectedServiceWindowDeviationDescriptor value) {
        return new JAXBElement<ProjectedServiceWindowDeviationDescriptor>(_ProjectedServiceWindowDeviationDescriptor_QNAME, ProjectedServiceWindowDeviationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceableStopServiceTimeDeviationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ServiceableStopServiceTimeDeviationDescriptor")
    public JAXBElement<ServiceableStopServiceTimeDeviationDescriptor> createServiceableStopServiceTimeDeviationDescriptor(ServiceableStopServiceTimeDeviationDescriptor value) {
        return new JAXBElement<ServiceableStopServiceTimeDeviationDescriptor>(_ServiceableStopServiceTimeDeviationDescriptor_QNAME, ServiceableStopServiceTimeDeviationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GpsDistanceToLocationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "GpsDistanceToLocationDescriptor")
    public JAXBElement<GpsDistanceToLocationDescriptor> createGpsDistanceToLocationDescriptor(GpsDistanceToLocationDescriptor value) {
        return new JAXBElement<GpsDistanceToLocationDescriptor>(_GpsDistanceToLocationDescriptor_QNAME, GpsDistanceToLocationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GpsGapDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "GpsGapDescriptor")
    public JAXBElement<GpsGapDescriptor> createGpsGapDescriptor(GpsGapDescriptor value) {
        return new JAXBElement<GpsGapDescriptor>(_GpsGapDescriptor_QNAME, GpsGapDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffPlannedCompleteTimeDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "OffPlannedCompleteTimeDescriptor")
    public JAXBElement<OffPlannedCompleteTimeDescriptor> createOffPlannedCompleteTimeDescriptor(OffPlannedCompleteTimeDescriptor value) {
        return new JAXBElement<OffPlannedCompleteTimeDescriptor>(_OffPlannedCompleteTimeDescriptor_QNAME, OffPlannedCompleteTimeDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutOfBoundsArriveDepartDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "OutOfBoundsArriveDepartDescriptor")
    public JAXBElement<OutOfBoundsArriveDepartDescriptor> createOutOfBoundsArriveDepartDescriptor(OutOfBoundsArriveDepartDescriptor value) {
        return new JAXBElement<OutOfBoundsArriveDepartDescriptor>(_OutOfBoundsArriveDepartDescriptor_QNAME, OutOfBoundsArriveDepartDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutOfContactDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "OutOfContactDescriptor")
    public JAXBElement<OutOfContactDescriptor> createOutOfContactDescriptor(OutOfContactDescriptor value) {
        return new JAXBElement<OutOfContactDescriptor>(_OutOfContactDescriptor_QNAME, OutOfContactDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePathDeviationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RoutePathDeviationDescriptor")
    public JAXBElement<RoutePathDeviationDescriptor> createRoutePathDeviationDescriptor(RoutePathDeviationDescriptor value) {
        return new JAXBElement<RoutePathDeviationDescriptor>(_RoutePathDeviationDescriptor_QNAME, RoutePathDeviationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpeedViolationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "SpeedViolationDescriptor")
    public JAXBElement<SpeedViolationDescriptor> createSpeedViolationDescriptor(SpeedViolationDescriptor value) {
        return new JAXBElement<SpeedViolationDescriptor>(_SpeedViolationDescriptor_QNAME, SpeedViolationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationaryResourceDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "StationaryResourceDescriptor")
    public JAXBElement<StationaryResourceDescriptor> createStationaryResourceDescriptor(StationaryResourceDescriptor value) {
        return new JAXBElement<StationaryResourceDescriptor>(_StationaryResourceDescriptor_QNAME, StationaryResourceDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnplannedStopDistanceToLocationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "UnplannedStopDistanceToLocationDescriptor")
    public JAXBElement<UnplannedStopDistanceToLocationDescriptor> createUnplannedStopDistanceToLocationDescriptor(UnplannedStopDistanceToLocationDescriptor value) {
        return new JAXBElement<UnplannedStopDistanceToLocationDescriptor>(_UnplannedStopDistanceToLocationDescriptor_QNAME, UnplannedStopDistanceToLocationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HarshDrivingingDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "HarshDrivingingDescriptor")
    public JAXBElement<HarshDrivingingDescriptor> createHarshDrivingingDescriptor(HarshDrivingingDescriptor value) {
        return new JAXBElement<HarshDrivingingDescriptor>(_HarshDrivingingDescriptor_QNAME, HarshDrivingingDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HarshAccelerationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "HarshAccelerationDescriptor")
    public JAXBElement<HarshAccelerationDescriptor> createHarshAccelerationDescriptor(HarshAccelerationDescriptor value) {
        return new JAXBElement<HarshAccelerationDescriptor>(_HarshAccelerationDescriptor_QNAME, HarshAccelerationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HarshBrakingDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "HarshBrakingDescriptor")
    public JAXBElement<HarshBrakingDescriptor> createHarshBrakingDescriptor(HarshBrakingDescriptor value) {
        return new JAXBElement<HarshBrakingDescriptor>(_HarshBrakingDescriptor_QNAME, HarshBrakingDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HarshCorneringDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "HarshCorneringDescriptor")
    public JAXBElement<HarshCorneringDescriptor> createHarshCorneringDescriptor(HarshCorneringDescriptor value) {
        return new JAXBElement<HarshCorneringDescriptor>(_HarshCorneringDescriptor_QNAME, HarshCorneringDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerLogCreationMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "WorkerLogCreationMethod")
    public JAXBElement<WorkerLogCreationMethod> createWorkerLogCreationMethod(WorkerLogCreationMethod value) {
        return new JAXBElement<WorkerLogCreationMethod>(_WorkerLogCreationMethod_QNAME, WorkerLogCreationMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerLogEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "WorkerLogEventType")
    public JAXBElement<WorkerLogEventType> createWorkerLogEventType(WorkerLogEventType value) {
        return new JAXBElement<WorkerLogEventType>(_WorkerLogEventType_QNAME, WorkerLogEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerLogEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "WorkerLogEvent")
    public JAXBElement<WorkerLogEvent> createWorkerLogEvent(WorkerLogEvent value) {
        return new JAXBElement<WorkerLogEvent>(_WorkerLogEvent_QNAME, WorkerLogEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkerLogEventPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "WorkerLogEventPropertyOptions")
    public JAXBElement<WorkerLogEventPropertyOptions> createWorkerLogEventPropertyOptions(WorkerLogEventPropertyOptions value) {
        return new JAXBElement<WorkerLogEventPropertyOptions>(_WorkerLogEventPropertyOptions_QNAME, WorkerLogEventPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkerLogEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "ArrayOfWorkerLogEvent")
    public JAXBElement<ArrayOfWorkerLogEvent> createArrayOfWorkerLogEvent(ArrayOfWorkerLogEvent value) {
        return new JAXBElement<ArrayOfWorkerLogEvent>(_ArrayOfWorkerLogEvent_QNAME, ArrayOfWorkerLogEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileScreenComponentDisplay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileScreenComponentDisplay")
    public JAXBElement<MobileScreenComponentDisplay> createMobileScreenComponentDisplay(MobileScreenComponentDisplay value) {
        return new JAXBElement<MobileScreenComponentDisplay>(_MobileScreenComponentDisplay_QNAME, MobileScreenComponentDisplay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileScreenComponentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileScreenComponentType")
    public JAXBElement<MobileScreenComponentType> createMobileScreenComponentType(MobileScreenComponentType value) {
        return new JAXBElement<MobileScreenComponentType>(_MobileScreenComponentType_QNAME, MobileScreenComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileScreenConfigurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileScreenConfigurationType")
    public JAXBElement<MobileScreenConfigurationType> createMobileScreenConfigurationType(MobileScreenConfigurationType value) {
        return new JAXBElement<MobileScreenConfigurationType>(_MobileScreenConfigurationType_QNAME, MobileScreenConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileTextAlias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileTextAlias")
    public JAXBElement<MobileTextAlias> createMobileTextAlias(MobileTextAlias value) {
        return new JAXBElement<MobileTextAlias>(_MobileTextAlias_QNAME, MobileTextAlias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileScreenConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileScreenConfiguration")
    public JAXBElement<MobileScreenConfiguration> createMobileScreenConfiguration(MobileScreenConfiguration value) {
        return new JAXBElement<MobileScreenConfiguration>(_MobileScreenConfiguration_QNAME, MobileScreenConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMobileScreenComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "ArrayOfMobileScreenComponent")
    public JAXBElement<ArrayOfMobileScreenComponent> createArrayOfMobileScreenComponent(ArrayOfMobileScreenComponent value) {
        return new JAXBElement<ArrayOfMobileScreenComponent>(_ArrayOfMobileScreenComponent_QNAME, ArrayOfMobileScreenComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileScreenComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileScreenComponent")
    public JAXBElement<MobileScreenComponent> createMobileScreenComponent(MobileScreenComponent value) {
        return new JAXBElement<MobileScreenComponent>(_MobileScreenComponent_QNAME, MobileScreenComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileFormScreenComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileFormScreenComponent")
    public JAXBElement<MobileFormScreenComponent> createMobileFormScreenComponent(MobileFormScreenComponent value) {
        return new JAXBElement<MobileFormScreenComponent>(_MobileFormScreenComponent_QNAME, MobileFormScreenComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileTextAliasPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileTextAliasPropertyOptions")
    public JAXBElement<MobileTextAliasPropertyOptions> createMobileTextAliasPropertyOptions(MobileTextAliasPropertyOptions value) {
        return new JAXBElement<MobileTextAliasPropertyOptions>(_MobileTextAliasPropertyOptions_QNAME, MobileTextAliasPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileScreenConfigurationPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileScreenConfigurationPropertyOptions")
    public JAXBElement<MobileScreenConfigurationPropertyOptions> createMobileScreenConfigurationPropertyOptions(MobileScreenConfigurationPropertyOptions value) {
        return new JAXBElement<MobileScreenConfigurationPropertyOptions>(_MobileScreenConfigurationPropertyOptions_QNAME, MobileScreenConfigurationPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileScreenComponentPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileScreenComponentPropertyOptions")
    public JAXBElement<MobileScreenComponentPropertyOptions> createMobileScreenComponentPropertyOptions(MobileScreenComponentPropertyOptions value) {
        return new JAXBElement<MobileScreenComponentPropertyOptions>(_MobileScreenComponentPropertyOptions_QNAME, MobileScreenComponentPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNavRecalculationDetailsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", name = "RetrieveNavRecalculationDetailsResult")
    public JAXBElement<RetrieveNavRecalculationDetailsResult> createRetrieveNavRecalculationDetailsResult(RetrieveNavRecalculationDetailsResult value) {
        return new JAXBElement<RetrieveNavRecalculationDetailsResult>(_RetrieveNavRecalculationDetailsResult_QNAME, RetrieveNavRecalculationDetailsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentProfileResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", name = "EquipmentProfileResult")
    public JAXBElement<EquipmentProfileResult> createEquipmentProfileResult(EquipmentProfileResult value) {
        return new JAXBElement<EquipmentProfileResult>(_EquipmentProfileResult_QNAME, EquipmentProfileResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNavRecalculationDetailsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", name = "RetrieveNavRecalculationDetailsOptions")
    public JAXBElement<RetrieveNavRecalculationDetailsOptions> createRetrieveNavRecalculationDetailsOptions(RetrieveNavRecalculationDetailsOptions value) {
        return new JAXBElement<RetrieveNavRecalculationDetailsOptions>(_RetrieveNavRecalculationDetailsOptions_QNAME, RetrieveNavRecalculationDetailsOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplianceCompanySettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Compliance", name = "ComplianceCompanySettings")
    public JAXBElement<ComplianceCompanySettings> createComplianceCompanySettings(ComplianceCompanySettings value) {
        return new JAXBElement<ComplianceCompanySettings>(_ComplianceCompanySettings_QNAME, ComplianceCompanySettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "Alias", scope = MobileScreenComponent.class)
    public JAXBElement<String> createMobileScreenComponentAlias(String value) {
        return new JAXBElement<String>(_MobileScreenComponentAlias_QNAME, String.class, MobileScreenComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileScreenComponentDisplay_ComponentDisplay", scope = MobileScreenComponent.class)
    public JAXBElement<String> createMobileScreenComponentMobileScreenComponentDisplayComponentDisplay(String value) {
        return new JAXBElement<String>(_MobileScreenComponentMobileScreenComponentDisplayComponentDisplay_QNAME, String.class, MobileScreenComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileScreenComponentType_ComponentType", scope = MobileScreenComponent.class)
    public JAXBElement<String> createMobileScreenComponentMobileScreenComponentTypeComponentType(String value) {
        return new JAXBElement<String>(_MobileScreenComponentMobileScreenComponentTypeComponentType_QNAME, String.class, MobileScreenComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "CustomFormDescription", scope = MobileFormScreenComponent.class)
    public JAXBElement<String> createMobileFormScreenComponentCustomFormDescription(String value) {
        return new JAXBElement<String>(_MobileFormScreenComponentCustomFormDescription_QNAME, String.class, MobileFormScreenComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "CustomFormEntityKey", scope = MobileFormScreenComponent.class)
    public JAXBElement<Long> createMobileFormScreenComponentCustomFormEntityKey(Long value) {
        return new JAXBElement<Long>(_MobileFormScreenComponentCustomFormEntityKey_QNAME, Long.class, MobileFormScreenComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "CustomFormIdentifier", scope = MobileFormScreenComponent.class)
    public JAXBElement<String> createMobileFormScreenComponentCustomFormIdentifier(String value) {
        return new JAXBElement<String>(_MobileFormScreenComponentCustomFormIdentifier_QNAME, String.class, MobileFormScreenComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "MobileScreenConfigurationType_ConfigurationType", scope = MobileScreenConfiguration.class)
    public JAXBElement<String> createMobileScreenConfigurationMobileScreenConfigurationTypeConfigurationType(String value) {
        return new JAXBElement<String>(_MobileScreenConfigurationMobileScreenConfigurationTypeConfigurationType_QNAME, String.class, MobileScreenConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMobileScreenComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "ScreenComponents", scope = MobileScreenConfiguration.class)
    public JAXBElement<ArrayOfMobileScreenComponent> createMobileScreenConfigurationScreenComponents(ArrayOfMobileScreenComponent value) {
        return new JAXBElement<ArrayOfMobileScreenComponent>(_MobileScreenConfigurationScreenComponents_QNAME, ArrayOfMobileScreenComponent.class, MobileScreenConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "AliasKey", scope = MobileTextAlias.class)
    public JAXBElement<String> createMobileTextAliasAliasKey(String value) {
        return new JAXBElement<String>(_MobileTextAliasAliasKey_QNAME, String.class, MobileTextAlias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", name = "AliasText", scope = MobileTextAlias.class)
    public JAXBElement<String> createMobileTextAliasAliasText(String value) {
        return new JAXBElement<String>(_MobileTextAliasAliasText_QNAME, String.class, MobileTextAlias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "Coordinate", scope = WorkerLogEvent.class)
    public JAXBElement<Coordinate> createWorkerLogEventCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_WorkerLogEventCoordinate_QNAME, Coordinate.class, WorkerLogEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "DeviceEntityKey", scope = WorkerLogEvent.class)
    public JAXBElement<Long> createWorkerLogEventDeviceEntityKey(Long value) {
        return new JAXBElement<Long>(_WorkerLogEventDeviceEntityKey_QNAME, Long.class, WorkerLogEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "EditTimestamp", scope = WorkerLogEvent.class)
    public JAXBElement<XMLGregorianCalendar> createWorkerLogEventEditTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkerLogEventEditTimestamp_QNAME, XMLGregorianCalendar.class, WorkerLogEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "LocationDetail", scope = WorkerLogEvent.class)
    public JAXBElement<String> createWorkerLogEventLocationDetail(String value) {
        return new JAXBElement<String>(_WorkerLogEventLocationDetail_QNAME, String.class, WorkerLogEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "Odometer", scope = WorkerLogEvent.class)
    public JAXBElement<Distance> createWorkerLogEventOdometer(Distance value) {
        return new JAXBElement<Distance>(_WorkerLogEventOdometer_QNAME, Distance.class, WorkerLogEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "Remark", scope = WorkerLogEvent.class)
    public JAXBElement<String> createWorkerLogEventRemark(String value) {
        return new JAXBElement<String>(_WorkerLogEventRemark_QNAME, String.class, WorkerLogEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "WorkerLogCreationMethod_CreationMethod", scope = WorkerLogEvent.class)
    public JAXBElement<String> createWorkerLogEventWorkerLogCreationMethodCreationMethod(String value) {
        return new JAXBElement<String>(_WorkerLogEventWorkerLogCreationMethodCreationMethod_QNAME, String.class, WorkerLogEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", name = "WorkerLogEventType_EventType", scope = WorkerLogEvent.class)
    public JAXBElement<String> createWorkerLogEventWorkerLogEventTypeEventType(String value) {
        return new JAXBElement<String>(_WorkerLogEventWorkerLogEventTypeEventType_QNAME, String.class, WorkerLogEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ForwardGForce", scope = HarshDrivingingDescriptor.class)
    public JAXBElement<Double> createHarshDrivingingDescriptorForwardGForce(Double value) {
        return new JAXBElement<Double>(_HarshDrivingingDescriptorForwardGForce_QNAME, Double.class, HarshDrivingingDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "GPSSpeed", scope = HarshDrivingingDescriptor.class)
    public JAXBElement<Speed> createHarshDrivingingDescriptorGPSSpeed(Speed value) {
        return new JAXBElement<Speed>(_HarshDrivingingDescriptorGPSSpeed_QNAME, Speed.class, HarshDrivingingDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "LateralGForce", scope = HarshDrivingingDescriptor.class)
    public JAXBElement<Double> createHarshDrivingingDescriptorLateralGForce(Double value) {
        return new JAXBElement<Double>(_HarshDrivingingDescriptorLateralGForce_QNAME, Double.class, HarshDrivingingDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "VerticalGForce", scope = HarshDrivingingDescriptor.class)
    public JAXBElement<Double> createHarshDrivingingDescriptorVerticalGForce(Double value) {
        return new JAXBElement<Double>(_HarshDrivingingDescriptorVerticalGForce_QNAME, Double.class, HarshDrivingingDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DistanceToLocation", scope = UnplannedStopDistanceToLocationDescriptor.class)
    public JAXBElement<Distance> createUnplannedStopDistanceToLocationDescriptorDistanceToLocation(Distance value) {
        return new JAXBElement<Distance>(_UnplannedStopDistanceToLocationDescriptorDistanceToLocation_QNAME, Distance.class, UnplannedStopDistanceToLocationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "AllowedSpeed", scope = SpeedViolationDescriptor.class)
    public JAXBElement<Speed> createSpeedViolationDescriptorAllowedSpeed(Speed value) {
        return new JAXBElement<Speed>(_SpeedViolationDescriptorAllowedSpeed_QNAME, Speed.class, SpeedViolationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "Distance", scope = SpeedViolationDescriptor.class)
    public JAXBElement<Distance> createSpeedViolationDescriptorDistance(Distance value) {
        return new JAXBElement<Distance>(_SpeedViolationDescriptorDistance_QNAME, Distance.class, SpeedViolationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "MaxViolatingSpeed", scope = SpeedViolationDescriptor.class)
    public JAXBElement<Speed> createSpeedViolationDescriptorMaxViolatingSpeed(Speed value) {
        return new JAXBElement<Speed>(_SpeedViolationDescriptorMaxViolatingSpeed_QNAME, Speed.class, SpeedViolationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "EndDeviationPoint", scope = RoutePathDeviationDescriptor.class)
    public JAXBElement<Coordinate> createRoutePathDeviationDescriptorEndDeviationPoint(Coordinate value) {
        return new JAXBElement<Coordinate>(_RoutePathDeviationDescriptorEndDeviationPoint_QNAME, Coordinate.class, RoutePathDeviationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "EndDeviationTimestamp", scope = RoutePathDeviationDescriptor.class)
    public JAXBElement<XMLGregorianCalendar> createRoutePathDeviationDescriptorEndDeviationTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RoutePathDeviationDescriptorEndDeviationTimestamp_QNAME, XMLGregorianCalendar.class, RoutePathDeviationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "MaxDeviatedDistance", scope = RoutePathDeviationDescriptor.class)
    public JAXBElement<Distance> createRoutePathDeviationDescriptorMaxDeviatedDistance(Distance value) {
        return new JAXBElement<Distance>(_RoutePathDeviationDescriptorMaxDeviatedDistance_QNAME, Distance.class, RoutePathDeviationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DistanceFromStop", scope = OutOfBoundsArriveDepartDescriptor.class)
    public JAXBElement<Distance> createOutOfBoundsArriveDepartDescriptorDistanceFromStop(Distance value) {
        return new JAXBElement<Distance>(_OutOfBoundsArriveDepartDescriptorDistanceFromStop_QNAME, Distance.class, OutOfBoundsArriveDepartDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DistanceWithoutGps", scope = GpsGapDescriptor.class)
    public JAXBElement<Distance> createGpsGapDescriptorDistanceWithoutGps(Distance value) {
        return new JAXBElement<Distance>(_GpsGapDescriptorDistanceWithoutGps_QNAME, Distance.class, GpsGapDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DistanceToLocation", scope = GpsDistanceToLocationDescriptor.class)
    public JAXBElement<Distance> createGpsDistanceToLocationDescriptorDistanceToLocation(Distance value) {
        return new JAXBElement<Distance>(_UnplannedStopDistanceToLocationDescriptorDistanceToLocation_QNAME, Distance.class, GpsDistanceToLocationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopOpenCloseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "OpenCloseDetails", scope = ProjectedServiceWindowDeviationDescriptor.class)
    public JAXBElement<ArrayOfServiceableStopOpenCloseDetail> createProjectedServiceWindowDeviationDescriptorOpenCloseDetails(ArrayOfServiceableStopOpenCloseDetail value) {
        return new JAXBElement<ArrayOfServiceableStopOpenCloseDetail>(_ProjectedServiceWindowDeviationDescriptorOpenCloseDetails_QNAME, ArrayOfServiceableStopOpenCloseDetail.class, ProjectedServiceWindowDeviationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopServiceWindowDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ServiceWindowDetails", scope = ProjectedServiceWindowDeviationDescriptor.class)
    public JAXBElement<ArrayOfServiceableStopServiceWindowDetail> createProjectedServiceWindowDeviationDescriptorServiceWindowDetails(ArrayOfServiceableStopServiceWindowDetail value) {
        return new JAXBElement<ArrayOfServiceableStopServiceWindowDetail>(_ProjectedServiceWindowDeviationDescriptorServiceWindowDetails_QNAME, ArrayOfServiceableStopServiceWindowDetail.class, ProjectedServiceWindowDeviationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "FuelDataSource_IdlingFuelDataSource", scope = ExcessiveIdlingDescriptor.class)
    public JAXBElement<String> createExcessiveIdlingDescriptorFuelDataSourceIdlingFuelDataSource(String value) {
        return new JAXBElement<String>(_ExcessiveIdlingDescriptorFuelDataSourceIdlingFuelDataSource_QNAME, String.class, ExcessiveIdlingDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "FuelUsedIdling", scope = ExcessiveIdlingDescriptor.class)
    public JAXBElement<LiquidVolume> createExcessiveIdlingDescriptorFuelUsedIdling(LiquidVolume value) {
        return new JAXBElement<LiquidVolume>(_ExcessiveIdlingDescriptorFuelUsedIdling_QNAME, LiquidVolume.class, ExcessiveIdlingDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatteryState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "BatteryState", scope = DeviceLowBatteryDescriptor.class)
    public JAXBElement<BatteryState> createDeviceLowBatteryDescriptorBatteryState(BatteryState value) {
        return new JAXBElement<BatteryState>(_DeviceLowBatteryDescriptorBatteryState_QNAME, BatteryState.class, DeviceLowBatteryDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RestrictedEquipmentHoursType_Type", scope = RestrictedEquipmentHoursDescriptor.class)
    public JAXBElement<String> createRestrictedEquipmentHoursDescriptorRestrictedEquipmentHoursTypeType(String value) {
        return new JAXBElement<String>(_RestrictedEquipmentHoursDescriptorRestrictedEquipmentHoursTypeType_QNAME, String.class, RestrictedEquipmentHoursDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ViolatedDepotDescription", scope = RestrictedEquipmentHoursDescriptor.class)
    public JAXBElement<String> createRestrictedEquipmentHoursDescriptorViolatedDepotDescription(String value) {
        return new JAXBElement<String>(_RestrictedEquipmentHoursDescriptorViolatedDepotDescription_QNAME, String.class, RestrictedEquipmentHoursDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ViolatedDepotIdentifier", scope = RestrictedEquipmentHoursDescriptor.class)
    public JAXBElement<String> createRestrictedEquipmentHoursDescriptorViolatedDepotIdentifier(String value) {
        return new JAXBElement<String>(_RestrictedEquipmentHoursDescriptorViolatedDepotIdentifier_QNAME, String.class, RestrictedEquipmentHoursDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ViolatedDepotOpenCloseWindow", scope = RestrictedEquipmentHoursDescriptor.class)
    public JAXBElement<DailyTimePeriod> createRestrictedEquipmentHoursDescriptorViolatedDepotOpenCloseWindow(DailyTimePeriod value) {
        return new JAXBElement<DailyTimePeriod>(_RestrictedEquipmentHoursDescriptorViolatedDepotOpenCloseWindow_QNAME, DailyTimePeriod.class, RestrictedEquipmentHoursDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ViolatedRegionRestrictedOperatingTimes", scope = RestrictedEquipmentHoursDescriptor.class)
    public JAXBElement<DailyTimePeriod> createRestrictedEquipmentHoursDescriptorViolatedRegionRestrictedOperatingTimes(DailyTimePeriod value) {
        return new JAXBElement<DailyTimePeriod>(_RestrictedEquipmentHoursDescriptorViolatedRegionRestrictedOperatingTimes_QNAME, DailyTimePeriod.class, RestrictedEquipmentHoursDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "Temperature", scope = TemperatureDescriptor.class)
    public JAXBElement<Temperature> createTemperatureDescriptorTemperature(Temperature value) {
        return new JAXBElement<Temperature>(_TemperatureDescriptorTemperature_QNAME, Temperature.class, TemperatureDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "TemperatureLimitType_LimitType", scope = TemperatureDescriptor.class)
    public JAXBElement<String> createTemperatureDescriptorTemperatureLimitTypeLimitType(String value) {
        return new JAXBElement<String>(_TemperatureDescriptorTemperatureLimitTypeLimitType_QNAME, String.class, TemperatureDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "AllowedSpeed", scope = NavClientSpeedViolationDescriptor.class)
    public JAXBElement<Speed> createNavClientSpeedViolationDescriptorAllowedSpeed(Speed value) {
        return new JAXBElement<Speed>(_SpeedViolationDescriptorAllowedSpeed_QNAME, Speed.class, NavClientSpeedViolationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "Distance", scope = NavClientSpeedViolationDescriptor.class)
    public JAXBElement<Distance> createNavClientSpeedViolationDescriptorDistance(Distance value) {
        return new JAXBElement<Distance>(_SpeedViolationDescriptorDistance_QNAME, Distance.class, NavClientSpeedViolationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "MaxViolatingSpeed", scope = NavClientSpeedViolationDescriptor.class)
    public JAXBElement<Speed> createNavClientSpeedViolationDescriptorMaxViolatingSpeed(Speed value) {
        return new JAXBElement<Speed>(_SpeedViolationDescriptorMaxViolatingSpeed_QNAME, Speed.class, NavClientSpeedViolationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "OverLimitThreshold", scope = NavClientSpeedViolationDescriptor.class)
    public JAXBElement<Speed> createNavClientSpeedViolationDescriptorOverLimitThreshold(Speed value) {
        return new JAXBElement<Speed>(_NavClientSpeedViolationDescriptorOverLimitThreshold_QNAME, Speed.class, NavClientSpeedViolationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "LocationEntityKeys", scope = UnplannedStopDistanceToLocationFunction.class)
    public JAXBElement<ArrayOflong> createUnplannedStopDistanceToLocationFunctionLocationEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_UnplannedStopDistanceToLocationFunctionLocationEntityKeys_QNAME, ArrayOflong.class, UnplannedStopDistanceToLocationFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ViolationRadius", scope = UnplannedStopDistanceToLocationFunction.class)
    public JAXBElement<Distance> createUnplannedStopDistanceToLocationFunctionViolationRadius(Distance value) {
        return new JAXBElement<Distance>(_UnplannedStopDistanceToLocationFunctionViolationRadius_QNAME, Distance.class, UnplannedStopDistanceToLocationFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "SpeedLimit", scope = StaticSpeedViolationFunction.class)
    public JAXBElement<Speed> createStaticSpeedViolationFunctionSpeedLimit(Speed value) {
        return new JAXBElement<Speed>(_StaticSpeedViolationFunctionSpeedLimit_QNAME, Speed.class, StaticSpeedViolationFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DeviationLimit", scope = RoutePathDeviationFunction.class)
    public JAXBElement<Distance> createRoutePathDeviationFunctionDeviationLimit(Distance value) {
        return new JAXBElement<Distance>(_RoutePathDeviationFunctionDeviationLimit_QNAME, Distance.class, RoutePathDeviationFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "OverLimitTolerance", scope = RouteNetworkSpeedViolationFunction.class)
    public JAXBElement<Speed> createRouteNetworkSpeedViolationFunctionOverLimitTolerance(Speed value) {
        return new JAXBElement<Speed>(_RouteNetworkSpeedViolationFunctionOverLimitTolerance_QNAME, Speed.class, RouteNetworkSpeedViolationFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "StopRadius", scope = OutOfBoundsArriveDepartFunction.class)
    public JAXBElement<Distance> createOutOfBoundsArriveDepartFunctionStopRadius(Distance value) {
        return new JAXBElement<Distance>(_OutOfBoundsArriveDepartFunctionStopRadius_QNAME, Distance.class, OutOfBoundsArriveDepartFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "MaxDistanceWithoutGps", scope = GpsGapFunction.class)
    public JAXBElement<Distance> createGpsGapFunctionMaxDistanceWithoutGps(Distance value) {
        return new JAXBElement<Distance>(_GpsGapFunctionMaxDistanceWithoutGps_QNAME, Distance.class, GpsGapFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "LocationEntityKeys", scope = GpsDistanceToLocationFunction.class)
    public JAXBElement<ArrayOflong> createGpsDistanceToLocationFunctionLocationEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_UnplannedStopDistanceToLocationFunctionLocationEntityKeys_QNAME, ArrayOflong.class, GpsDistanceToLocationFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "ViolationRadius", scope = GpsDistanceToLocationFunction.class)
    public JAXBElement<Distance> createGpsDistanceToLocationFunctionViolationRadius(Distance value) {
        return new JAXBElement<Distance>(_UnplannedStopDistanceToLocationFunctionViolationRadius_QNAME, Distance.class, GpsDistanceToLocationFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "RestrictedEquipmentHoursMode_Mode", scope = RestrictedEquipmentHoursFunction.class)
    public JAXBElement<String> createRestrictedEquipmentHoursFunctionRestrictedEquipmentHoursModeMode(String value) {
        return new JAXBElement<String>(_RestrictedEquipmentHoursFunctionRestrictedEquipmentHoursModeMode_QNAME, String.class, RestrictedEquipmentHoursFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "TemperatureMaxLimit", scope = TemperatureFunction.class)
    public JAXBElement<Temperature> createTemperatureFunctionTemperatureMaxLimit(Temperature value) {
        return new JAXBElement<Temperature>(_TemperatureFunctionTemperatureMaxLimit_QNAME, Temperature.class, TemperatureFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "TemperatureMinLimit", scope = TemperatureFunction.class)
    public JAXBElement<Temperature> createTemperatureFunctionTemperatureMinLimit(Temperature value) {
        return new JAXBElement<Temperature>(_TemperatureFunctionTemperatureMinLimit_QNAME, Temperature.class, TemperatureFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "CoolantTemperatureValue", scope = DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class)
    public JAXBElement<Temperature> createDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailCoolantTemperatureValue(Temperature value) {
        return new JAXBElement<Temperature>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailCoolantTemperatureValue_QNAME, Temperature.class, DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "EngineRPM", scope = DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class)
    public JAXBElement<Integer> createDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailEngineRPM(Integer value) {
        return new JAXBElement<Integer>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailEngineRPM_QNAME, Integer.class, DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "EngineTemperatureValue", scope = DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class)
    public JAXBElement<Temperature> createDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailEngineTemperatureValue(Temperature value) {
        return new JAXBElement<Temperature>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailEngineTemperatureValue_QNAME, Temperature.class, DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransmissionGearState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "GearState", scope = DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class)
    public JAXBElement<TransmissionGearState> createDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailGearState(TransmissionGearState value) {
        return new JAXBElement<TransmissionGearState>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailGearState_QNAME, TransmissionGearState.class, DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "TroubleCode", scope = DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class)
    public JAXBElement<String> createDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailTroubleCode(String value) {
        return new JAXBElement<String>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailTroubleCode_QNAME, String.class, DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "TroubleCodeDescription", scope = DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class)
    public JAXBElement<String> createDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailTroubleCodeDescription(String value) {
        return new JAXBElement<String>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailTroubleCodeDescription_QNAME, String.class, DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "CoolantTemperatureValue", scope = DiagnosticTroubleCodeDescriptor.class)
    public JAXBElement<Temperature> createDiagnosticTroubleCodeDescriptorCoolantTemperatureValue(Temperature value) {
        return new JAXBElement<Temperature>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailCoolantTemperatureValue_QNAME, Temperature.class, DiagnosticTroubleCodeDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DiagnosticTroubleCodes", scope = DiagnosticTroubleCodeDescriptor.class)
    public JAXBElement<ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail> createDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodes(ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail value) {
        return new JAXBElement<ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodes_QNAME, ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail.class, DiagnosticTroubleCodeDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "EngineRPM", scope = DiagnosticTroubleCodeDescriptor.class)
    public JAXBElement<Integer> createDiagnosticTroubleCodeDescriptorEngineRPM(Integer value) {
        return new JAXBElement<Integer>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailEngineRPM_QNAME, Integer.class, DiagnosticTroubleCodeDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "EngineTemperatureValue", scope = DiagnosticTroubleCodeDescriptor.class)
    public JAXBElement<Temperature> createDiagnosticTroubleCodeDescriptorEngineTemperatureValue(Temperature value) {
        return new JAXBElement<Temperature>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailEngineTemperatureValue_QNAME, Temperature.class, DiagnosticTroubleCodeDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransmissionGearState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "GearState", scope = DiagnosticTroubleCodeDescriptor.class)
    public JAXBElement<TransmissionGearState> createDiagnosticTroubleCodeDescriptorGearState(TransmissionGearState value) {
        return new JAXBElement<TransmissionGearState>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailGearState_QNAME, TransmissionGearState.class, DiagnosticTroubleCodeDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "TroubleCode", scope = DiagnosticTroubleCodeDescriptor.class)
    public JAXBElement<String> createDiagnosticTroubleCodeDescriptorTroubleCode(String value) {
        return new JAXBElement<String>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailTroubleCode_QNAME, String.class, DiagnosticTroubleCodeDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "TroubleCodeDescription", scope = DiagnosticTroubleCodeDescriptor.class)
    public JAXBElement<String> createDiagnosticTroubleCodeDescriptorTroubleCodeDescription(String value) {
        return new JAXBElement<String>(_DiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetailTroubleCodeDescription_QNAME, String.class, DiagnosticTroubleCodeDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "DeviationDistanceThreshold", scope = NavClientRoutePathDeviationDescriptor.class)
    public JAXBElement<Distance> createNavClientRoutePathDeviationDescriptorDeviationDistanceThreshold(Distance value) {
        return new JAXBElement<Distance>(_NavClientRoutePathDeviationDescriptorDeviationDistanceThreshold_QNAME, Distance.class, NavClientRoutePathDeviationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "EndDeviationPoint", scope = NavClientRoutePathDeviationDescriptor.class)
    public JAXBElement<Coordinate> createNavClientRoutePathDeviationDescriptorEndDeviationPoint(Coordinate value) {
        return new JAXBElement<Coordinate>(_RoutePathDeviationDescriptorEndDeviationPoint_QNAME, Coordinate.class, NavClientRoutePathDeviationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "MaxDeviatedDistance", scope = NavClientRoutePathDeviationDescriptor.class)
    public JAXBElement<Distance> createNavClientRoutePathDeviationDescriptorMaxDeviatedDistance(Distance value) {
        return new JAXBElement<Distance>(_RoutePathDeviationDescriptorMaxDeviatedDistance_QNAME, Distance.class, NavClientRoutePathDeviationDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "AdvancedCriteria", scope = DiagnosticTroubleCodeFunction.class)
    public JAXBElement<ArrayOfDiagnosticTroubleCodeCriteria> createDiagnosticTroubleCodeFunctionAdvancedCriteria(ArrayOfDiagnosticTroubleCodeCriteria value) {
        return new JAXBElement<ArrayOfDiagnosticTroubleCodeCriteria>(_DiagnosticTroubleCodeFunctionAdvancedCriteria_QNAME, ArrayOfDiagnosticTroubleCodeCriteria.class, DiagnosticTroubleCodeFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeClassification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", name = "SelectedClassifications", scope = DiagnosticTroubleCodeFunction.class)
    public JAXBElement<ArrayOfDiagnosticTroubleCodeClassification> createDiagnosticTroubleCodeFunctionSelectedClassifications(ArrayOfDiagnosticTroubleCodeClassification value) {
        return new JAXBElement<ArrayOfDiagnosticTroubleCodeClassification>(_DiagnosticTroubleCodeFunctionSelectedClassifications_QNAME, ArrayOfDiagnosticTroubleCodeClassification.class, DiagnosticTroubleCodeFunction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "Group", scope = SimpleExpressionBase.class)
    public JAXBElement<String> createSimpleExpressionBaseGroup(String value) {
        return new JAXBElement<String>(_SimpleExpressionBaseGroup_QNAME, String.class, SimpleExpressionBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "Type", scope = SimpleExpressionBase.class)
    public JAXBElement<String> createSimpleExpressionBaseType(String value) {
        return new JAXBElement<String>(_SimpleExpressionBaseType_QNAME, String.class, SimpleExpressionBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "Expression", scope = NotExpression.class)
    public JAXBElement<SimpleExpressionBase> createNotExpressionExpression(SimpleExpressionBase value) {
        return new JAXBElement<SimpleExpressionBase>(_NotExpressionExpression_QNAME, SimpleExpressionBase.class, NotExpression.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSimpleExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "Expressions", scope = CompositeExpressionBase.class)
    public JAXBElement<ArrayOfSimpleExpressionBase> createCompositeExpressionBaseExpressions(ArrayOfSimpleExpressionBase value) {
        return new JAXBElement<ArrayOfSimpleExpressionBase>(_CompositeExpressionBaseExpressions_QNAME, ArrayOfSimpleExpressionBase.class, CompositeExpressionBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "Name", scope = PropertyExpression.class)
    public JAXBElement<String> createPropertyExpressionName(String value) {
        return new JAXBElement<String>(_PropertyExpressionName_QNAME, String.class, PropertyExpression.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "Value", scope = ValueExpression.class)
    public JAXBElement<Object> createValueExpressionValue(Object value) {
        return new JAXBElement<Object>(_ValueExpressionValue_QNAME, Object.class, ValueExpression.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "Left", scope = BinaryExpressionBase.class)
    public JAXBElement<SimpleExpressionBase> createBinaryExpressionBaseLeft(SimpleExpressionBase value) {
        return new JAXBElement<SimpleExpressionBase>(_BinaryExpressionBaseLeft_QNAME, SimpleExpressionBase.class, BinaryExpressionBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression", name = "Right", scope = BinaryExpressionBase.class)
    public JAXBElement<SimpleExpressionBase> createBinaryExpressionBaseRight(SimpleExpressionBase value) {
        return new JAXBElement<SimpleExpressionBase>(_BinaryExpressionBaseRight_QNAME, SimpleExpressionBase.class, BinaryExpressionBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseSecondaryDimensionType_Dimension", scope = SecondaryDimensionCountMeasure.class)
    public JAXBElement<String> createSecondaryDimensionCountMeasureDataWarehouseSecondaryDimensionTypeDimension(String value) {
        return new JAXBElement<String>(_SecondaryDimensionCountMeasureDataWarehouseSecondaryDimensionTypeDimension_QNAME, String.class, SecondaryDimensionCountMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomicMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ReferenceMeasure", scope = SecondaryDimensionCountMeasure.class)
    public JAXBElement<AtomicMeasure> createSecondaryDimensionCountMeasureReferenceMeasure(AtomicMeasure value) {
        return new JAXBElement<AtomicMeasure>(_SecondaryDimensionCountMeasureReferenceMeasure_QNAME, AtomicMeasure.class, SecondaryDimensionCountMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScorecardBandThreshold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "HighThreshold", scope = ScorecardBand.class)
    public JAXBElement<ScorecardBandThreshold> createScorecardBandHighThreshold(ScorecardBandThreshold value) {
        return new JAXBElement<ScorecardBandThreshold>(_ScorecardBandHighThreshold_QNAME, ScorecardBandThreshold.class, ScorecardBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScorecardBandThreshold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "LowThreshold", scope = ScorecardBand.class)
    public JAXBElement<ScorecardBandThreshold> createScorecardBandLowThreshold(ScorecardBandThreshold value) {
        return new JAXBElement<ScorecardBandThreshold>(_ScorecardBandLowThreshold_QNAME, ScorecardBandThreshold.class, ScorecardBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfScorecardBand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Bands", scope = ScoreMeasure.class)
    public JAXBElement<ArrayOfScorecardBand> createScoreMeasureBands(ArrayOfScorecardBand value) {
        return new JAXBElement<ArrayOfScorecardBand>(_ScoreMeasureBands_QNAME, ArrayOfScorecardBand.class, ScoreMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Measure", scope = ScoreMeasure.class)
    public JAXBElement<IMeasure> createScoreMeasureMeasure(IMeasure value) {
        return new JAXBElement<IMeasure>(_ScoreMeasureMeasure_QNAME, IMeasure.class, ScoreMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ConversionFactor", scope = PredefinedCompositeMeasure.class)
    public JAXBElement<Double> createPredefinedCompositeMeasureConversionFactor(Double value) {
        return new JAXBElement<Double>(_PredefinedCompositeMeasureConversionFactor_QNAME, Double.class, PredefinedCompositeMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCompositeMeasureType_MeasureType", scope = PredefinedCompositeMeasure.class)
    public JAXBElement<String> createPredefinedCompositeMeasureDataWarehouseCompositeMeasureTypeMeasureType(String value) {
        return new JAXBElement<String>(_PredefinedCompositeMeasureDataWarehouseCompositeMeasureTypeMeasureType_QNAME, String.class, PredefinedCompositeMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehousePlannedActualType_PlannedOrActual", scope = PredefinedCompositeMeasure.class)
    public JAXBElement<String> createPredefinedCompositeMeasureDataWarehousePlannedActualTypePlannedOrActual(String value) {
        return new JAXBElement<String>(_PredefinedCompositeMeasureDataWarehousePlannedActualTypePlannedOrActual_QNAME, String.class, PredefinedCompositeMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionFilters", scope = PredefinedCompositeMeasure.class)
    public JAXBElement<ArrayOfDimensionFilter> createPredefinedCompositeMeasureDimensionFilters(ArrayOfDimensionFilter value) {
        return new JAXBElement<ArrayOfDimensionFilter>(_PredefinedCompositeMeasureDimensionFilters_QNAME, ArrayOfDimensionFilter.class, PredefinedCompositeMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Filters", scope = PredefinedCompositeMeasure.class)
    public JAXBElement<Filters> createPredefinedCompositeMeasureFilters(Filters value) {
        return new JAXBElement<Filters>(_Filters_QNAME, Filters.class, PredefinedCompositeMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Measures", scope = MultiMeasure.class)
    public JAXBElement<ArrayOfIMeasure> createMultiMeasureMeasures(ArrayOfIMeasure value) {
        return new JAXBElement<ArrayOfIMeasure>(_MultiMeasureMeasures_QNAME, ArrayOfIMeasure.class, MultiMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomicMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ReferenceMeasure", scope = DayCountMeasure.class)
    public JAXBElement<AtomicMeasure> createDayCountMeasureReferenceMeasure(AtomicMeasure value) {
        return new JAXBElement<AtomicMeasure>(_SecondaryDimensionCountMeasureReferenceMeasure_QNAME, AtomicMeasure.class, DayCountMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionFilters", scope = CompositeMeasure.class)
    public JAXBElement<ArrayOfDimensionFilter> createCompositeMeasureDimensionFilters(ArrayOfDimensionFilter value) {
        return new JAXBElement<ArrayOfDimensionFilter>(_PredefinedCompositeMeasureDimensionFilters_QNAME, ArrayOfDimensionFilter.class, CompositeMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Operand1", scope = CompositeMeasure.class)
    public JAXBElement<IMeasure> createCompositeMeasureOperand1(IMeasure value) {
        return new JAXBElement<IMeasure>(_CompositeMeasureOperand1_QNAME, IMeasure.class, CompositeMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Operand2", scope = CompositeMeasure.class)
    public JAXBElement<IMeasure> createCompositeMeasureOperand2(IMeasure value) {
        return new JAXBElement<IMeasure>(_CompositeMeasureOperand2_QNAME, IMeasure.class, CompositeMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OperatorType_Operator", scope = CompositeMeasure.class)
    public JAXBElement<String> createCompositeMeasureOperatorTypeOperator(String value) {
        return new JAXBElement<String>(_CompositeMeasureOperatorTypeOperator_QNAME, String.class, CompositeMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ConversionFactor", scope = AtomicMeasure.class)
    public JAXBElement<Double> createAtomicMeasureConversionFactor(Double value) {
        return new JAXBElement<Double>(_PredefinedCompositeMeasureConversionFactor_QNAME, Double.class, AtomicMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseAtomicMeasureType_MeasureType", scope = AtomicMeasure.class)
    public JAXBElement<String> createAtomicMeasureDataWarehouseAtomicMeasureTypeMeasureType(String value) {
        return new JAXBElement<String>(_AtomicMeasureDataWarehouseAtomicMeasureTypeMeasureType_QNAME, String.class, AtomicMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehousePlannedActualType_PlannedOrActual", scope = AtomicMeasure.class)
    public JAXBElement<String> createAtomicMeasureDataWarehousePlannedActualTypePlannedOrActual(String value) {
        return new JAXBElement<String>(_PredefinedCompositeMeasureDataWarehousePlannedActualTypePlannedOrActual_QNAME, String.class, AtomicMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionFilters", scope = AtomicMeasure.class)
    public JAXBElement<ArrayOfDimensionFilter> createAtomicMeasureDimensionFilters(ArrayOfDimensionFilter value) {
        return new JAXBElement<ArrayOfDimensionFilter>(_PredefinedCompositeMeasureDimensionFilters_QNAME, ArrayOfDimensionFilter.class, AtomicMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Filters", scope = AtomicMeasure.class)
    public JAXBElement<Filters> createAtomicMeasureFilters(Filters value) {
        return new JAXBElement<Filters>(_Filters_QNAME, Filters.class, AtomicMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpi_KpiGroupByType_GroupByType", scope = DataWarehouseKpiRulesSet.class)
    public JAXBElement<String> createDataWarehouseKpiRulesSetDataWarehouseKpiKpiGroupByTypeGroupByType(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiRulesSetDataWarehouseKpiKpiGroupByTypeGroupByType_QNAME, String.class, DataWarehouseKpiRulesSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseRuleAction_RuleAction", scope = DataWarehouseKpiRulesSet.class)
    public JAXBElement<String> createDataWarehouseKpiRulesSetDataWarehouseRuleActionRuleAction(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiRulesSetDataWarehouseRuleActionRuleAction_QNAME, String.class, DataWarehouseKpiRulesSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionDescriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Groupings", scope = DataWarehouseKpiRulesSet.class)
    public JAXBElement<ArrayOfDimensionDescriber> createDataWarehouseKpiRulesSetGroupings(ArrayOfDimensionDescriber value) {
        return new JAXBElement<ArrayOfDimensionDescriber>(_DataWarehouseKpiRulesSetGroupings_QNAME, ArrayOfDimensionDescriber.class, DataWarehouseKpiRulesSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Rules", scope = DataWarehouseKpiRulesSet.class)
    public JAXBElement<ArrayOfDataWarehouseKpiRule> createDataWarehouseKpiRulesSetRules(ArrayOfDataWarehouseKpiRule value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiRule>(_DataWarehouseKpiRulesSetRules_QNAME, ArrayOfDataWarehouseKpiRule.class, DataWarehouseKpiRulesSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Criteria", scope = DataWarehouseKpiRule.class)
    public JAXBElement<ArrayOfDataWarehouseKpiCriteria> createDataWarehouseKpiRuleCriteria(ArrayOfDataWarehouseKpiCriteria value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiCriteria>(_DataWarehouseKpiRuleCriteria_QNAME, ArrayOfDataWarehouseKpiCriteria.class, DataWarehouseKpiRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiLogicalOperatorType_LogicalOperator", scope = DataWarehouseKpiRule.class)
    public JAXBElement<String> createDataWarehouseKpiRuleDataWarehouseKpiLogicalOperatorTypeLogicalOperator(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiRuleDataWarehouseKpiLogicalOperatorTypeLogicalOperator_QNAME, String.class, DataWarehouseKpiRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiMeasure_MeasureCompareSetting_MeasureCompare", scope = DataWarehouseKpiRule.class)
    public JAXBElement<String> createDataWarehouseKpiRuleDataWarehouseKpiMeasureMeasureCompareSettingMeasureCompare(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiRuleDataWarehouseKpiMeasureMeasureCompareSettingMeasureCompare_QNAME, String.class, DataWarehouseKpiRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OperationsUnitDimensions", scope = DataWarehouseKpiOperationsUnitDimensionsFilter.class)
    public JAXBElement<ArrayOflong> createDataWarehouseKpiOperationsUnitDimensionsFilterOperationsUnitDimensions(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_DataWarehouseKpiOperationsUnitDimensionsFilterOperationsUnitDimensions_QNAME, ArrayOflong.class, DataWarehouseKpiOperationsUnitDimensionsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Display", scope = DataWarehouseKpiMeasureDataFilter.class)
    public JAXBElement<String> createDataWarehouseKpiMeasureDataFilterDisplay(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiMeasureDataFilterDisplay_QNAME, String.class, DataWarehouseKpiMeasureDataFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Text", scope = DataWarehouseKpiMeasureDataFilter.class)
    public JAXBElement<String> createDataWarehouseKpiMeasureDataFilterText(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiMeasureDataFilterText_QNAME, String.class, DataWarehouseKpiMeasureDataFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiMeasureDataFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataFilters", scope = DataWarehouseKpiMeasureFilter.class)
    public JAXBElement<ArrayOfDataWarehouseKpiMeasureDataFilter> createDataWarehouseKpiMeasureFilterDataFilters(ArrayOfDataWarehouseKpiMeasureDataFilter value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiMeasureDataFilter>(_DataWarehouseKpiMeasureFilterDataFilters_QNAME, ArrayOfDataWarehouseKpiMeasureDataFilter.class, DataWarehouseKpiMeasureFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiLogicalOperatorType_LogicalOperator", scope = DataWarehouseKpiCriteria.class)
    public JAXBElement<String> createDataWarehouseKpiCriteriaDataWarehouseKpiLogicalOperatorTypeLogicalOperator(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiRuleDataWarehouseKpiLogicalOperatorTypeLogicalOperator_QNAME, String.class, DataWarehouseKpiCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RelationalOperatorType_RelationalOperator", scope = DataWarehouseKpiCriteria.class)
    public JAXBElement<String> createDataWarehouseKpiCriteriaRelationalOperatorTypeRelationalOperator(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiCriteriaRelationalOperatorTypeRelationalOperator_QNAME, String.class, DataWarehouseKpiCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Value", scope = DataWarehouseKpiCriteria.class)
    public JAXBElement<Double> createDataWarehouseKpiCriteriaValue(Double value) {
        return new JAXBElement<Double>(_DataWarehouseKpiCriteriaValue_QNAME, Double.class, DataWarehouseKpiCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionDescriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionDescriber", scope = DimensionDetail.class)
    public JAXBElement<DimensionDescriber> createDimensionDetailDimensionDescriber(DimensionDescriber value) {
        return new JAXBElement<DimensionDescriber>(_DimensionDescriber_QNAME, DimensionDescriber.class, DimensionDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Value", scope = StringDimensionDetail.class)
    public JAXBElement<String> createStringDimensionDetailValue(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiCriteriaValue_QNAME, String.class, StringDimensionDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Display", scope = SecondaryDimensionDetail.class)
    public JAXBElement<String> createSecondaryDimensionDetailDisplay(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiMeasureDataFilterDisplay_QNAME, String.class, SecondaryDimensionDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Text", scope = SecondaryDimensionDetail.class)
    public JAXBElement<String> createSecondaryDimensionDetailText(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiMeasureDataFilterText_QNAME, String.class, SecondaryDimensionDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseLocationType_Value", scope = LocationTypeDimensionDetail.class)
    public JAXBElement<String> createLocationTypeDimensionDetailDataWarehouseLocationTypeValue(String value) {
        return new JAXBElement<String>(_LocationTypeDimensionDetailDataWarehouseLocationTypeValue_QNAME, String.class, LocationTypeDimensionDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehousePlannedAndActualType_Value", scope = PlannedAndActualDimensionDetail.class)
    public JAXBElement<String> createPlannedAndActualDimensionDetailDataWarehousePlannedAndActualTypeValue(String value) {
        return new JAXBElement<String>(_PlannedAndActualDimensionDetailDataWarehousePlannedAndActualTypeValue_QNAME, String.class, PlannedAndActualDimensionDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTimeVarianceType_Value", scope = TimeVarianceDimensionDetail.class)
    public JAXBElement<String> createTimeVarianceDimensionDetailDataWarehouseTimeVarianceTypeValue(String value) {
        return new JAXBElement<String>(_TimeVarianceDimensionDetailDataWarehouseTimeVarianceTypeValue_QNAME, String.class, TimeVarianceDimensionDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDimensionAttributeType_DimensionAttribute", scope = EnumDimensionDetail.class)
    public JAXBElement<String> createEnumDimensionDetailDataWarehouseDimensionAttributeTypeDimensionAttribute(String value) {
        return new JAXBElement<String>(_EnumDimensionDetailDataWarehouseDimensionAttributeTypeDimensionAttribute_QNAME, String.class, EnumDimensionDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Display", scope = DimensionKeyDetail.class)
    public JAXBElement<String> createDimensionKeyDetailDisplay(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiMeasureDataFilterDisplay_QNAME, String.class, DimensionKeyDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Text", scope = DimensionKeyDetail.class)
    public JAXBElement<String> createDimensionKeyDetailText(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiMeasureDataFilterText_QNAME, String.class, DimensionKeyDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseRouteInternalKey", scope = DataWarehouseResourceEvent.class)
    public JAXBElement<Long> createDataWarehouseResourceEventDataWarehouseRouteInternalKey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseResourceEventDataWarehouseRouteInternalKey_QNAME, Long.class, DataWarehouseResourceEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RouteDate", scope = DataWarehouseResourceEvent.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseResourceEventRouteDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseResourceEventRouteDate_QNAME, XMLGregorianCalendar.class, DataWarehouseResourceEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RouteDescription", scope = DataWarehouseResourceEvent.class)
    public JAXBElement<String> createDataWarehouseResourceEventRouteDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseResourceEventRouteDescription_QNAME, String.class, DataWarehouseResourceEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RouteIdentifier", scope = DataWarehouseResourceEvent.class)
    public JAXBElement<String> createDataWarehouseResourceEventRouteIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseResourceEventRouteIdentifier_QNAME, String.class, DataWarehouseResourceEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Temperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Temperature", scope = DataWarehouseTemperatureException.class)
    public JAXBElement<Temperature> createDataWarehouseTemperatureExceptionTemperature(Temperature value) {
        return new JAXBElement<Temperature>(_DataWarehouseTemperatureExceptionTemperature_QNAME, Temperature.class, DataWarehouseTemperatureException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseSpeedingType_EventType", scope = DataWarehouseSpeedingEvent.class)
    public JAXBElement<String> createDataWarehouseSpeedingEventDataWarehouseSpeedingTypeEventType(String value) {
        return new JAXBElement<String>(_DataWarehouseSpeedingEventDataWarehouseSpeedingTypeEventType_QNAME, String.class, DataWarehouseSpeedingEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Distance", scope = DataWarehouseSpeedingEvent.class)
    public JAXBElement<Float> createDataWarehouseSpeedingEventDistance(Float value) {
        return new JAXBElement<Float>(_DataWarehouseSpeedingEventDistance_QNAME, Float.class, DataWarehouseSpeedingEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "MaxSpeed", scope = DataWarehouseSpeedingEvent.class)
    public JAXBElement<Float> createDataWarehouseSpeedingEventMaxSpeed(Float value) {
        return new JAXBElement<Float>(_DataWarehouseSpeedingEventMaxSpeed_QNAME, Float.class, DataWarehouseSpeedingEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "PositionText", scope = DataWarehouseSpeedingEvent.class)
    public JAXBElement<String> createDataWarehouseSpeedingEventPositionText(String value) {
        return new JAXBElement<String>(_DataWarehouseSpeedingEventPositionText_QNAME, String.class, DataWarehouseSpeedingEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "SpeedLimit", scope = DataWarehouseSpeedingEvent.class)
    public JAXBElement<Float> createDataWarehouseSpeedingEventSpeedLimit(Float value) {
        return new JAXBElement<Float>(_DataWarehouseSpeedingEventSpeedLimit_QNAME, Float.class, DataWarehouseSpeedingEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "SpeedOver", scope = DataWarehouseSpeedingEvent.class)
    public JAXBElement<Float> createDataWarehouseSpeedingEventSpeedOver(Float value) {
        return new JAXBElement<Float>(_DataWarehouseSpeedingEventSpeedOver_QNAME, Float.class, DataWarehouseSpeedingEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDataPointsLimiterSettings_ResultsLimiterMode", scope = DataWarehouseKpiSortingOptions.class)
    public JAXBElement<String> createDataWarehouseKpiSortingOptionsDataWarehouseDataPointsLimiterSettingsResultsLimiterMode(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiSortingOptionsDataWarehouseDataPointsLimiterSettingsResultsLimiterMode_QNAME, String.class, DataWarehouseKpiSortingOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiMeasure_MeasureCompareSetting_SortMeasureCompareOption", scope = DataWarehouseKpiSortingOptions.class)
    public JAXBElement<String> createDataWarehouseKpiSortingOptionsDataWarehouseKpiMeasureMeasureCompareSettingSortMeasureCompareOption(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiSortingOptionsDataWarehouseKpiMeasureMeasureCompareSettingSortMeasureCompareOption_QNAME, String.class, DataWarehouseKpiSortingOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiSortingOptions_SortByType_SortBy", scope = DataWarehouseKpiSortingOptions.class)
    public JAXBElement<String> createDataWarehouseKpiSortingOptionsDataWarehouseKpiSortingOptionsSortByTypeSortBy(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiSortingOptionsDataWarehouseKpiSortingOptionsSortByTypeSortBy_QNAME, String.class, DataWarehouseKpiSortingOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiSortingOptions_SortOrderType_SortOrder", scope = DataWarehouseKpiSortingOptions.class)
    public JAXBElement<String> createDataWarehouseKpiSortingOptionsDataWarehouseKpiSortingOptionsSortOrderTypeSortOrder(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiSortingOptionsDataWarehouseKpiSortingOptionsSortOrderTypeSortOrder_QNAME, String.class, DataWarehouseKpiSortingOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiSettings_KpiDisplayMode_DisplayMode", scope = DataWarehouseKpiSettings.class)
    public JAXBElement<String> createDataWarehouseKpiSettingsDataWarehouseKpiSettingsKpiDisplayModeDisplayMode(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiSettingsDataWarehouseKpiSettingsKpiDisplayModeDisplayMode_QNAME, String.class, DataWarehouseKpiSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiSortingOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "SortingOptions", scope = DataWarehouseKpiSettings.class)
    public JAXBElement<DataWarehouseKpiSortingOptions> createDataWarehouseKpiSettingsSortingOptions(DataWarehouseKpiSortingOptions value) {
        return new JAXBElement<DataWarehouseKpiSortingOptions>(_DataWarehouseKpiSettingsSortingOptions_QNAME, DataWarehouseKpiSortingOptions.class, DataWarehouseKpiSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "AverageDescription", scope = DataWarehouseKpiMeasureDescription.class)
    public JAXBElement<String> createDataWarehouseKpiMeasureDescriptionAverageDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiMeasureDescriptionAverageDescription_QNAME, String.class, DataWarehouseKpiMeasureDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CompareDescriptions", scope = DataWarehouseKpiMeasureDescription.class)
    public JAXBElement<ArrayOfstring> createDataWarehouseKpiMeasureDescriptionCompareDescriptions(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DataWarehouseKpiMeasureDescriptionCompareDescriptions_QNAME, ArrayOfstring.class, DataWarehouseKpiMeasureDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ExclusiveFiltersDescriptions", scope = DataWarehouseKpiMeasureDescription.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createDataWarehouseKpiMeasureDescriptionExclusiveFiltersDescriptions(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_DataWarehouseKpiMeasureDescriptionExclusiveFiltersDescriptions_QNAME, ArrayOfKeyValueOfstringstring.class, DataWarehouseKpiMeasureDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "InclusiveFiltersDescriptions", scope = DataWarehouseKpiMeasureDescription.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createDataWarehouseKpiMeasureDescriptionInclusiveFiltersDescriptions(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_DataWarehouseKpiMeasureDescriptionInclusiveFiltersDescriptions_QNAME, ArrayOfKeyValueOfstringstring.class, DataWarehouseKpiMeasureDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "MeasureDescription", scope = DataWarehouseKpiMeasureDescription.class)
    public JAXBElement<String> createDataWarehouseKpiMeasureDescriptionMeasureDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiMeasureDescriptionMeasureDescription_QNAME, String.class, DataWarehouseKpiMeasureDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseScorecardKpiMeasureCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ScorecardCriteria", scope = DataWarehouseKpiMeasureDescription.class)
    public JAXBElement<DataWarehouseScorecardKpiMeasureCriteria> createDataWarehouseKpiMeasureDescriptionScorecardCriteria(DataWarehouseScorecardKpiMeasureCriteria value) {
        return new JAXBElement<DataWarehouseScorecardKpiMeasureCriteria>(_DataWarehouseKpiMeasureDescriptionScorecardCriteria_QNAME, DataWarehouseScorecardKpiMeasureCriteria.class, DataWarehouseKpiMeasureDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DateRangeDescription", scope = DataWarehouseKpiDescription.class)
    public JAXBElement<String> createDataWarehouseKpiDescriptionDateRangeDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiDescriptionDateRangeDescription_QNAME, String.class, DataWarehouseKpiDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ExclusiveFiltersDescriptions", scope = DataWarehouseKpiDescription.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createDataWarehouseKpiDescriptionExclusiveFiltersDescriptions(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_DataWarehouseKpiMeasureDescriptionExclusiveFiltersDescriptions_QNAME, ArrayOfKeyValueOfstringstring.class, DataWarehouseKpiDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "GroupingDescription", scope = DataWarehouseKpiDescription.class)
    public JAXBElement<String> createDataWarehouseKpiDescriptionGroupingDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiDescriptionGroupingDescription_QNAME, String.class, DataWarehouseKpiDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "GroupingDescriptions", scope = DataWarehouseKpiDescription.class)
    public JAXBElement<ArrayOfKeyValueOfintstring> createDataWarehouseKpiDescriptionGroupingDescriptions(ArrayOfKeyValueOfintstring value) {
        return new JAXBElement<ArrayOfKeyValueOfintstring>(_DataWarehouseKpiDescriptionGroupingDescriptions_QNAME, ArrayOfKeyValueOfintstring.class, DataWarehouseKpiDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "InclusiveFiltersDescriptions", scope = DataWarehouseKpiDescription.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createDataWarehouseKpiDescriptionInclusiveFiltersDescriptions(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_DataWarehouseKpiMeasureDescriptionInclusiveFiltersDescriptions_QNAME, ArrayOfKeyValueOfstringstring.class, DataWarehouseKpiDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiMeasureDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiMeasureDescriptions", scope = DataWarehouseKpiDescription.class)
    public JAXBElement<ArrayOfDataWarehouseKpiMeasureDescription> createDataWarehouseKpiDescriptionKpiMeasureDescriptions(ArrayOfDataWarehouseKpiMeasureDescription value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiMeasureDescription>(_DataWarehouseKpiDescriptionKpiMeasureDescriptions_QNAME, ArrayOfDataWarehouseKpiMeasureDescription.class, DataWarehouseKpiDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleDescription", scope = DataWarehouseKpiDescription.class)
    public JAXBElement<String> createDataWarehouseKpiDescriptionRuleDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiDescriptionRuleDescription_QNAME, String.class, DataWarehouseKpiDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleDescriptions", scope = DataWarehouseKpiDescription.class)
    public JAXBElement<ArrayOfKeyValueOfintstring> createDataWarehouseKpiDescriptionRuleDescriptions(ArrayOfKeyValueOfintstring value) {
        return new JAXBElement<ArrayOfKeyValueOfintstring>(_DataWarehouseKpiDescriptionRuleDescriptions_QNAME, ArrayOfKeyValueOfintstring.class, DataWarehouseKpiDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "SortingDescription", scope = DataWarehouseKpiDescription.class)
    public JAXBElement<String> createDataWarehouseKpiDescriptionSortingDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiDescriptionSortingDescription_QNAME, String.class, DataWarehouseKpiDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionFilters", scope = Filters.class)
    public JAXBElement<ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs> createFiltersDimensionFilters(ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs value) {
        return new JAXBElement<ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs>(_PredefinedCompositeMeasureDimensionFilters_QNAME, ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs.class, Filters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EntityKeys", scope = DimensionFilterValues.class)
    public JAXBElement<ArrayOflong> createDimensionFilterValuesEntityKeys(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_DimensionFilterValuesEntityKeys_QNAME, ArrayOflong.class, DimensionFilterValues.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ActualSequenceNumber", scope = DataWarehouseStop.class)
    public JAXBElement<Integer> createDataWarehouseStopActualSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_DataWarehouseStopActualSequenceNumber_QNAME, Integer.class, DataWarehouseStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseRouteInternalKey", scope = DataWarehouseStop.class)
    public JAXBElement<Long> createDataWarehouseStopDataWarehouseRouteInternalKey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseResourceEventDataWarehouseRouteInternalKey_QNAME, Long.class, DataWarehouseStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "PlannedSequenceNumber", scope = DataWarehouseStop.class)
    public JAXBElement<Integer> createDataWarehouseStopPlannedSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_DataWarehouseStopPlannedSequenceNumber_QNAME, Integer.class, DataWarehouseStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RouteDate", scope = DataWarehouseStop.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseStopRouteDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseResourceEventRouteDate_QNAME, XMLGregorianCalendar.class, DataWarehouseStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RouteDescription", scope = DataWarehouseStop.class)
    public JAXBElement<String> createDataWarehouseStopRouteDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseResourceEventRouteDescription_QNAME, String.class, DataWarehouseStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RouteIdentifier", scope = DataWarehouseStop.class)
    public JAXBElement<String> createDataWarehouseStopRouteIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseResourceEventRouteIdentifier_QNAME, String.class, DataWarehouseStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ActualEndTime", scope = DataWarehouseRouteData.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseRouteDataActualEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseRouteDataActualEndTime_QNAME, XMLGregorianCalendar.class, DataWarehouseRouteData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ActualRouteArrivalTime", scope = DataWarehouseRouteData.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseRouteDataActualRouteArrivalTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseRouteDataActualRouteArrivalTime_QNAME, XMLGregorianCalendar.class, DataWarehouseRouteData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ActualRouteDepartureTime", scope = DataWarehouseRouteData.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseRouteDataActualRouteDepartureTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseRouteDataActualRouteDepartureTime_QNAME, XMLGregorianCalendar.class, DataWarehouseRouteData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ActualStartTime", scope = DataWarehouseRouteData.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseRouteDataActualStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseRouteDataActualStartTime_QNAME, XMLGregorianCalendar.class, DataWarehouseRouteData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "PlannedEndTime", scope = DataWarehouseRouteData.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseRouteDataPlannedEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseRouteDataPlannedEndTime_QNAME, XMLGregorianCalendar.class, DataWarehouseRouteData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "PlannedRouteArrivalTime", scope = DataWarehouseRouteData.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseRouteDataPlannedRouteArrivalTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseRouteDataPlannedRouteArrivalTime_QNAME, XMLGregorianCalendar.class, DataWarehouseRouteData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "PlannedRouteDepartureTime", scope = DataWarehouseRouteData.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseRouteDataPlannedRouteDepartureTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseRouteDataPlannedRouteDepartureTime_QNAME, XMLGregorianCalendar.class, DataWarehouseRouteData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "PlannedStartTime", scope = DataWarehouseRouteData.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseRouteDataPlannedStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseRouteDataPlannedStartTime_QNAME, XMLGregorianCalendar.class, DataWarehouseRouteData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "AccountOptions", scope = LocationDimensionPropertyOptions.class)
    public JAXBElement<AccountDimensionPropertyOptions> createLocationDimensionPropertyOptionsAccountOptions(AccountDimensionPropertyOptions value) {
        return new JAXBElement<AccountDimensionPropertyOptions>(_LocationDimensionPropertyOptionsAccountOptions_QNAME, AccountDimensionPropertyOptions.class, LocationDimensionPropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceLocationCategoryDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ServiceLocationCategoryOptions", scope = LocationDimensionPropertyOptions.class)
    public JAXBElement<ServiceLocationCategoryDimensionPropertyOptions> createLocationDimensionPropertyOptionsServiceLocationCategoryOptions(ServiceLocationCategoryDimensionPropertyOptions value) {
        return new JAXBElement<ServiceLocationCategoryDimensionPropertyOptions>(_LocationDimensionPropertyOptionsServiceLocationCategoryOptions_QNAME, ServiceLocationCategoryDimensionPropertyOptions.class, LocationDimensionPropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentManufacturerDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentManufacturerOptions", scope = EquipmentDimensionPropertyOptions.class)
    public JAXBElement<EquipmentManufacturerDimensionPropertyOptions> createEquipmentDimensionPropertyOptionsEquipmentManufacturerOptions(EquipmentManufacturerDimensionPropertyOptions value) {
        return new JAXBElement<EquipmentManufacturerDimensionPropertyOptions>(_EquipmentDimensionPropertyOptionsEquipmentManufacturerOptions_QNAME, EquipmentManufacturerDimensionPropertyOptions.class, EquipmentDimensionPropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentTypeDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentTypeOptions", scope = EquipmentDimensionPropertyOptions.class)
    public JAXBElement<EquipmentTypeDimensionPropertyOptions> createEquipmentDimensionPropertyOptionsEquipmentTypeOptions(EquipmentTypeDimensionPropertyOptions value) {
        return new JAXBElement<EquipmentTypeDimensionPropertyOptions>(_EquipmentDimensionPropertyOptionsEquipmentTypeOptions_QNAME, EquipmentTypeDimensionPropertyOptions.class, EquipmentDimensionPropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentClassDimensionPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentClassOptions", scope = EquipmentTypeDimensionPropertyOptions.class)
    public JAXBElement<EquipmentClassDimensionPropertyOptions> createEquipmentTypeDimensionPropertyOptionsEquipmentClassOptions(EquipmentClassDimensionPropertyOptions value) {
        return new JAXBElement<EquipmentClassDimensionPropertyOptions>(_EquipmentTypeDimensionPropertyOptionsEquipmentClassOptions_QNAME, EquipmentClassDimensionPropertyOptions.class, EquipmentTypeDimensionPropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KpiFolderPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiFolderOptions", scope = KpiBasePropertyOptions.class)
    public JAXBElement<KpiFolderPropertyOptions> createKpiBasePropertyOptionsKpiFolderOptions(KpiFolderPropertyOptions value) {
        return new JAXBElement<KpiFolderPropertyOptions>(_KpiBasePropertyOptionsKpiFolderOptions_QNAME, KpiFolderPropertyOptions.class, KpiBasePropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResultPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ResultOptions", scope = KpiExportJobInfoPropertyOptions.class)
    public JAXBElement<FileResultPropertyOptions> createKpiExportJobInfoPropertyOptionsResultOptions(FileResultPropertyOptions value) {
        return new JAXBElement<FileResultPropertyOptions>(_KpiExportJobInfoPropertyOptionsResultOptions_QNAME, FileResultPropertyOptions.class, KpiExportJobInfoPropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseStopInfoDimension_IsOffDayStop_ServicedDuringOffDay", scope = DataWarehouseStopInfoDimension.class)
    public JAXBElement<String> createDataWarehouseStopInfoDimensionDataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay(String value) {
        return new JAXBElement<String>(_DataWarehouseStopInfoDimensionDataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay_QNAME, String.class, DataWarehouseStopInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseStopInfoDimension_StopExecutionType_ExecutionType", scope = DataWarehouseStopInfoDimension.class)
    public JAXBElement<String> createDataWarehouseStopInfoDimensionDataWarehouseStopInfoDimensionStopExecutionTypeExecutionType(String value) {
        return new JAXBElement<String>(_DataWarehouseStopInfoDimensionDataWarehouseStopInfoDimensionStopExecutionTypeExecutionType_QNAME, String.class, DataWarehouseStopInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseStopType_Type", scope = DataWarehouseStopInfoDimension.class)
    public JAXBElement<String> createDataWarehouseStopInfoDimensionDataWarehouseStopTypeType(String value) {
        return new JAXBElement<String>(_DataWarehouseStopInfoDimensionDataWarehouseStopTypeType_QNAME, String.class, DataWarehouseStopInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTimeVarianceType_ActualTimeWindowVarianceType", scope = DataWarehouseStopInfoDimension.class)
    public JAXBElement<String> createDataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypeActualTimeWindowVarianceType(String value) {
        return new JAXBElement<String>(_DataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypeActualTimeWindowVarianceType_QNAME, String.class, DataWarehouseStopInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTimeVarianceType_ArrivalVarianceType", scope = DataWarehouseStopInfoDimension.class)
    public JAXBElement<String> createDataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypeArrivalVarianceType(String value) {
        return new JAXBElement<String>(_DataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypeArrivalVarianceType_QNAME, String.class, DataWarehouseStopInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTimeVarianceType_DepartureVarianceType", scope = DataWarehouseStopInfoDimension.class)
    public JAXBElement<String> createDataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypeDepartureVarianceType(String value) {
        return new JAXBElement<String>(_DataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypeDepartureVarianceType_QNAME, String.class, DataWarehouseStopInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTimeVarianceType_PlannedTimeWindowVarianceType", scope = DataWarehouseStopInfoDimension.class)
    public JAXBElement<String> createDataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType(String value) {
        return new JAXBElement<String>(_DataWarehouseStopInfoDimensionDataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType_QNAME, String.class, DataWarehouseStopInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseDepot.class)
    public JAXBElement<String> createDataWarehouseDepotDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseDepot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DisabledDate", scope = DataWarehouseDepot.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseDepotDisabledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseDepotDisabledDate_QNAME, XMLGregorianCalendar.class, DataWarehouseDepot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Identifier", scope = DataWarehouseDepot.class)
    public JAXBElement<String> createDataWarehouseDepotIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotIdentifier_QNAME, String.class, DataWarehouseDepot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OperationsUnitDimensionEntityKey", scope = DataWarehouseDepot.class)
    public JAXBElement<Long> createDataWarehouseDepotOperationsUnitDimensionEntityKey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseDepotOperationsUnitDimensionEntityKey_QNAME, Long.class, DataWarehouseDepot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RegionIdentifier", scope = DataWarehouseDepot.class)
    public JAXBElement<String> createDataWarehouseDepotRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotRegionIdentifier_QNAME, String.class, DataWarehouseDepot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CreatedInRegionIdentifier", scope = DataWarehouseWorkerDimension.class)
    public JAXBElement<String> createDataWarehouseWorkerDimensionCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerDimensionCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseWorkerDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Name", scope = DataWarehouseWorkerDimension.class)
    public JAXBElement<PersonName> createDataWarehouseWorkerDimensionName(PersonName value) {
        return new JAXBElement<PersonName>(_DataWarehouseWorkerDimensionName_QNAME, PersonName.class, DataWarehouseWorkerDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "WorkerIdentifier", scope = DataWarehouseWorkerDimension.class)
    public JAXBElement<String> createDataWarehouseWorkerDimensionWorkerIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerDimensionWorkerIdentifier_QNAME, String.class, DataWarehouseWorkerDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CreatedInRegionIdentifier", scope = DataWarehouseWorkerTypeDimension.class)
    public JAXBElement<String> createDataWarehouseWorkerTypeDimensionCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerDimensionCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseWorkerTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseWorkerTypeDimension.class)
    public JAXBElement<String> createDataWarehouseWorkerTypeDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseWorkerTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "WorkerTypeIdentifier", scope = DataWarehouseWorkerTypeDimension.class)
    public JAXBElement<String> createDataWarehouseWorkerTypeDimensionWorkerTypeIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerTypeDimensionWorkerTypeIdentifier_QNAME, String.class, DataWarehouseWorkerTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTravelLegTypeDimension_TravelLegType_Type", scope = DataWarehouseTravelLegTypeDimension.class)
    public JAXBElement<String> createDataWarehouseTravelLegTypeDimensionDataWarehouseTravelLegTypeDimensionTravelLegTypeType(String value) {
        return new JAXBElement<String>(_DataWarehouseTravelLegTypeDimensionDataWarehouseTravelLegTypeDimensionTravelLegTypeType_QNAME, String.class, DataWarehouseTravelLegTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DayOfWeek_DayOfWeekLimiter", scope = DataWarehouseTimeDimension.class)
    public JAXBElement<String> createDataWarehouseTimeDimensionDayOfWeekDayOfWeekLimiter(String value) {
        return new JAXBElement<String>(_DataWarehouseTimeDimensionDayOfWeekDayOfWeekLimiter_QNAME, String.class, DataWarehouseTimeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "FirstDateInTimePeriod", scope = DataWarehouseTimeDimension.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseTimeDimensionFirstDateInTimePeriod(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseTimeDimensionFirstDateInTimePeriod_QNAME, XMLGregorianCalendar.class, DataWarehouseTimeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Granularity", scope = DataWarehouseTimeDimension.class)
    public JAXBElement<String> createDataWarehouseTimeDimensionGranularity(String value) {
        return new JAXBElement<String>(_DataWarehouseTimeDimensionGranularity_QNAME, String.class, DataWarehouseTimeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "LastDateInTimePeriod", scope = DataWarehouseTimeDimension.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseTimeDimensionLastDateInTimePeriod(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseTimeDimensionLastDateInTimePeriod_QNAME, XMLGregorianCalendar.class, DataWarehouseTimeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "MonthLimiter", scope = DataWarehouseTimeDimension.class)
    public JAXBElement<Integer> createDataWarehouseTimeDimensionMonthLimiter(Integer value) {
        return new JAXBElement<Integer>(_DataWarehouseTimeDimensionMonthLimiter_QNAME, Integer.class, DataWarehouseTimeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "QuarterLimiter", scope = DataWarehouseTimeDimension.class)
    public JAXBElement<Integer> createDataWarehouseTimeDimensionQuarterLimiter(Integer value) {
        return new JAXBElement<Integer>(_DataWarehouseTimeDimensionQuarterLimiter_QNAME, Integer.class, DataWarehouseTimeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "WeekLimiter", scope = DataWarehouseTimeDimension.class)
    public JAXBElement<Integer> createDataWarehouseTimeDimensionWeekLimiter(Integer value) {
        return new JAXBElement<Integer>(_DataWarehouseTimeDimensionWeekLimiter_QNAME, Integer.class, DataWarehouseTimeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Year", scope = DataWarehouseTimeDimension.class)
    public JAXBElement<Integer> createDataWarehouseTimeDimensionYear(Integer value) {
        return new JAXBElement<Integer>(_DataWarehouseTimeDimensionYear_QNAME, Integer.class, DataWarehouseTimeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseStopType_Type", scope = DataWarehouseStopTypeDimension.class)
    public JAXBElement<String> createDataWarehouseStopTypeDimensionDataWarehouseStopTypeType(String value) {
        return new JAXBElement<String>(_DataWarehouseStopInfoDimensionDataWarehouseStopTypeType_QNAME, String.class, DataWarehouseStopTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseServiceType_Type", scope = DataWarehouseServiceTypeDimension.class)
    public JAXBElement<String> createDataWarehouseServiceTypeDimensionDataWarehouseServiceTypeType(String value) {
        return new JAXBElement<String>(_DataWarehouseServiceTypeDimensionDataWarehouseServiceTypeType_QNAME, String.class, DataWarehouseServiceTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "StopActionType_ServiceType", scope = DataWarehouseServiceTypeDimension.class)
    public JAXBElement<String> createDataWarehouseServiceTypeDimensionStopActionTypeServiceType(String value) {
        return new JAXBElement<String>(_DataWarehouseServiceTypeDimensionStopActionTypeServiceType_QNAME, String.class, DataWarehouseServiceTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseRouteDescriptorDimension.class)
    public JAXBElement<String> createDataWarehouseRouteDescriptorDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseRouteDescriptorDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DisplayName", scope = DataWarehouseRouteDescriptorDimension.class)
    public JAXBElement<String> createDataWarehouseRouteDescriptorDimensionDisplayName(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteDescriptorDimensionDisplayName_QNAME, String.class, DataWarehouseRouteDescriptorDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RegionIdentifier", scope = DataWarehouseRouteDescriptorDimension.class)
    public JAXBElement<String> createDataWarehouseRouteDescriptorDimensionRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotRegionIdentifier_QNAME, String.class, DataWarehouseRouteDescriptorDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RouteIdentifier", scope = DataWarehouseRouteDescriptorDimension.class)
    public JAXBElement<String> createDataWarehouseRouteDescriptorDimensionRouteIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseResourceEventRouteIdentifier_QNAME, String.class, DataWarehouseRouteDescriptorDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ScenarioIdentifier", scope = DataWarehouseRouteDescriptorDimension.class)
    public JAXBElement<String> createDataWarehouseRouteDescriptorDimensionScenarioIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteDescriptorDimensionScenarioIdentifier_QNAME, String.class, DataWarehouseRouteDescriptorDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseAccountDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Account", scope = DataWarehouseLocationDimension.class)
    public JAXBElement<DataWarehouseAccountDimension> createDataWarehouseLocationDimensionAccount(DataWarehouseAccountDimension value) {
        return new JAXBElement<DataWarehouseAccountDimension>(_DataWarehouseLocationDimensionAccount_QNAME, DataWarehouseAccountDimension.class, DataWarehouseLocationDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CreatedInRegionIdentifier", scope = DataWarehouseLocationDimension.class)
    public JAXBElement<String> createDataWarehouseLocationDimensionCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerDimensionCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseLocationDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseLocationType_LocationType", scope = DataWarehouseLocationDimension.class)
    public JAXBElement<String> createDataWarehouseLocationDimensionDataWarehouseLocationTypeLocationType(String value) {
        return new JAXBElement<String>(_DataWarehouseLocationDimensionDataWarehouseLocationTypeLocationType_QNAME, String.class, DataWarehouseLocationDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseLocationDimension.class)
    public JAXBElement<String> createDataWarehouseLocationDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseLocationDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "LocationIdentifier", scope = DataWarehouseLocationDimension.class)
    public JAXBElement<String> createDataWarehouseLocationDimensionLocationIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseLocationDimensionLocationIdentifier_QNAME, String.class, DataWarehouseLocationDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseServiceLocationCategoryDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ServiceLocationCategory", scope = DataWarehouseLocationDimension.class)
    public JAXBElement<DataWarehouseServiceLocationCategoryDimension> createDataWarehouseLocationDimensionServiceLocationCategory(DataWarehouseServiceLocationCategoryDimension value) {
        return new JAXBElement<DataWarehouseServiceLocationCategoryDimension>(_DataWarehouseLocationDimensionServiceLocationCategory_QNAME, DataWarehouseServiceLocationCategoryDimension.class, DataWarehouseLocationDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Type", scope = DataWarehouseLocationDimension.class)
    public JAXBElement<String> createDataWarehouseLocationDimensionType(String value) {
        return new JAXBElement<String>(_DataWarehouseLocationDimensionType_QNAME, String.class, DataWarehouseLocationDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CreatedInRegionIdentifier", scope = DataWarehouseEquipmentDimension.class)
    public JAXBElement<String> createDataWarehouseEquipmentDimensionCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerDimensionCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseEquipmentDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseEquipmentDimension.class)
    public JAXBElement<String> createDataWarehouseEquipmentDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseEquipmentDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentIdentifier", scope = DataWarehouseEquipmentDimension.class)
    public JAXBElement<String> createDataWarehouseEquipmentDimensionEquipmentIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseEquipmentDimensionEquipmentIdentifier_QNAME, String.class, DataWarehouseEquipmentDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseEquipmentManufacturerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentManufacturer", scope = DataWarehouseEquipmentDimension.class)
    public JAXBElement<DataWarehouseEquipmentManufacturerDimension> createDataWarehouseEquipmentDimensionEquipmentManufacturer(DataWarehouseEquipmentManufacturerDimension value) {
        return new JAXBElement<DataWarehouseEquipmentManufacturerDimension>(_DataWarehouseEquipmentDimensionEquipmentManufacturer_QNAME, DataWarehouseEquipmentManufacturerDimension.class, DataWarehouseEquipmentDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseEquipmentTypeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentType", scope = DataWarehouseEquipmentDimension.class)
    public JAXBElement<DataWarehouseEquipmentTypeDimension> createDataWarehouseEquipmentDimensionEquipmentType(DataWarehouseEquipmentTypeDimension value) {
        return new JAXBElement<DataWarehouseEquipmentTypeDimension>(_DataWarehouseEquipmentDimensionEquipmentType_QNAME, DataWarehouseEquipmentTypeDimension.class, DataWarehouseEquipmentDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Model", scope = DataWarehouseEquipmentDimension.class)
    public JAXBElement<String> createDataWarehouseEquipmentDimensionModel(String value) {
        return new JAXBElement<String>(_DataWarehouseEquipmentDimensionModel_QNAME, String.class, DataWarehouseEquipmentDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ModelYear", scope = DataWarehouseEquipmentDimension.class)
    public JAXBElement<String> createDataWarehouseEquipmentDimensionModelYear(String value) {
        return new JAXBElement<String>(_DataWarehouseEquipmentDimensionModelYear_QNAME, String.class, DataWarehouseEquipmentDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CreatedInRegionIdentifier", scope = DataWarehouseEquipmentTypeDimension.class)
    public JAXBElement<String> createDataWarehouseEquipmentTypeDimensionCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerDimensionCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseEquipmentTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseEquipmentTypeDimension.class)
    public JAXBElement<String> createDataWarehouseEquipmentTypeDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseEquipmentTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseEquipmentClassDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentClass", scope = DataWarehouseEquipmentTypeDimension.class)
    public JAXBElement<DataWarehouseEquipmentClassDimension> createDataWarehouseEquipmentTypeDimensionEquipmentClass(DataWarehouseEquipmentClassDimension value) {
        return new JAXBElement<DataWarehouseEquipmentClassDimension>(_DataWarehouseEquipmentTypeDimensionEquipmentClass_QNAME, DataWarehouseEquipmentClassDimension.class, DataWarehouseEquipmentTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentTypeIdentifier", scope = DataWarehouseEquipmentTypeDimension.class)
    public JAXBElement<String> createDataWarehouseEquipmentTypeDimensionEquipmentTypeIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseEquipmentTypeDimensionEquipmentTypeIdentifier_QNAME, String.class, DataWarehouseEquipmentTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentClasses", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteEquipmentClasses(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteEquipmentClasses_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentDescriptions", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteEquipmentDescriptions(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteEquipmentDescriptions_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentIds", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteEquipmentIds(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteEquipmentIds_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentTypeDescriptions", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteEquipmentTypeDescriptions(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteEquipmentTypeDescriptions_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentTypeIds", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteEquipmentTypeIds(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteEquipmentTypeIds_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RegionIdentifier", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotRegionIdentifier_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RouteDate", scope = DataWarehouseRoute.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseRouteRouteDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseResourceEventRouteDate_QNAME, XMLGregorianCalendar.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RouteIdentifier", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteRouteIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseResourceEventRouteIdentifier_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ScenarioIdentifier", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteScenarioIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteDescriptorDimensionScenarioIdentifier_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "WorkerIds", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteWorkerIds(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteWorkerIds_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "WorkerNames", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteWorkerNames(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteWorkerNames_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "WorkerTypeDescriptions", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteWorkerTypeDescriptions(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteWorkerTypeDescriptions_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "WorkerTypeIds", scope = DataWarehouseRoute.class)
    public JAXBElement<String> createDataWarehouseRouteWorkerTypeIds(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteWorkerTypeIds_QNAME, String.class, DataWarehouseRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CargoUnitType", scope = DataWarehouseCargoUnitTypeDimension.class)
    public JAXBElement<String> createDataWarehouseCargoUnitTypeDimensionCargoUnitType(String value) {
        return new JAXBElement<String>(_DataWarehouseCargoUnitTypeDimensionCargoUnitType_QNAME, String.class, DataWarehouseCargoUnitTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCargoExceptionType_Type", scope = DataWarehouseCargoExceptionTypeDimension.class)
    public JAXBElement<String> createDataWarehouseCargoExceptionTypeDimensionDataWarehouseCargoExceptionTypeType(String value) {
        return new JAXBElement<String>(_DataWarehouseCargoExceptionTypeDimensionDataWarehouseCargoExceptionTypeType_QNAME, String.class, DataWarehouseCargoExceptionTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseResourceEventType_EventType", scope = DataWarehouseSpeedingExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehouseSpeedingExceptionRuleDimensionDataWarehouseResourceEventTypeEventType(String value) {
        return new JAXBElement<String>(_DataWarehouseSpeedingExceptionRuleDimensionDataWarehouseResourceEventTypeEventType_QNAME, String.class, DataWarehouseSpeedingExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ResourceExceptionRule_RuleType_RuleType", scope = DataWarehouseSpeedingExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehouseSpeedingExceptionRuleDimensionResourceExceptionRuleRuleTypeRuleType(String value) {
        return new JAXBElement<String>(_DataWarehouseSpeedingExceptionRuleDimensionResourceExceptionRuleRuleTypeRuleType_QNAME, String.class, DataWarehouseSpeedingExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleDescription", scope = DataWarehouseSpeedingExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehouseSpeedingExceptionRuleDimensionRuleDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiDescriptionRuleDescription_QNAME, String.class, DataWarehouseSpeedingExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleIdentifier", scope = DataWarehouseSpeedingExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehouseSpeedingExceptionRuleDimensionRuleIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseSpeedingExceptionRuleDimensionRuleIdentifier_QNAME, String.class, DataWarehouseSpeedingExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleDescription", scope = DataWarehouseEngineIdleExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehouseEngineIdleExceptionRuleDimensionRuleDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiDescriptionRuleDescription_QNAME, String.class, DataWarehouseEngineIdleExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleIdentifier", scope = DataWarehouseEngineIdleExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehouseEngineIdleExceptionRuleDimensionRuleIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseSpeedingExceptionRuleDimensionRuleIdentifier_QNAME, String.class, DataWarehouseEngineIdleExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EquipmentClassification_Class", scope = DataWarehouseEquipmentClassDimension.class)
    public JAXBElement<String> createDataWarehouseEquipmentClassDimensionEquipmentClassificationClass(String value) {
        return new JAXBElement<String>(_DataWarehouseEquipmentClassDimensionEquipmentClassificationClass_QNAME, String.class, DataWarehouseEquipmentClassDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehousePlannedAndActualType_PlannedAndActual", scope = DataWarehousePlannedAndActualDimension.class)
    public JAXBElement<String> createDataWarehousePlannedAndActualDimensionDataWarehousePlannedAndActualTypePlannedAndActual(String value) {
        return new JAXBElement<String>(_DataWarehousePlannedAndActualDimensionDataWarehousePlannedAndActualTypePlannedAndActual_QNAME, String.class, DataWarehousePlannedAndActualDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleDescription", scope = DataWarehouseTemperatureExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehouseTemperatureExceptionRuleDimensionRuleDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiDescriptionRuleDescription_QNAME, String.class, DataWarehouseTemperatureExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleIdentifier", scope = DataWarehouseTemperatureExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehouseTemperatureExceptionRuleDimensionRuleIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseSpeedingExceptionRuleDimensionRuleIdentifier_QNAME, String.class, DataWarehouseTemperatureExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseServiceLocationCategoryDimension.class)
    public JAXBElement<String> createDataWarehouseServiceLocationCategoryDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseServiceLocationCategoryDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Identifier", scope = DataWarehouseServiceLocationCategoryDimension.class)
    public JAXBElement<String> createDataWarehouseServiceLocationCategoryDimensionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotIdentifier_QNAME, String.class, DataWarehouseServiceLocationCategoryDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehousePlannedAndActualType_PlannedAndActual", scope = DataWarehouseRouteInfoDimension.class)
    public JAXBElement<String> createDataWarehouseRouteInfoDimensionDataWarehousePlannedAndActualTypePlannedAndActual(String value) {
        return new JAXBElement<String>(_DataWarehousePlannedAndActualDimensionDataWarehousePlannedAndActualTypePlannedAndActual_QNAME, String.class, DataWarehouseRouteInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTimeVarianceType_RouteArrivalTimeVarianceType", scope = DataWarehouseRouteInfoDimension.class)
    public JAXBElement<String> createDataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType_QNAME, String.class, DataWarehouseRouteInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTimeVarianceType_RouteDepartureTimeVarianceType", scope = DataWarehouseRouteInfoDimension.class)
    public JAXBElement<String> createDataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType_QNAME, String.class, DataWarehouseRouteInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTimeVarianceType_RouteEndTimeVarianceType", scope = DataWarehouseRouteInfoDimension.class)
    public JAXBElement<String> createDataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteEndTimeVarianceType(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteEndTimeVarianceType_QNAME, String.class, DataWarehouseRouteInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseTimeVarianceType_RouteStartTimeVarianceType", scope = DataWarehouseRouteInfoDimension.class)
    public JAXBElement<String> createDataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteStartTimeVarianceType(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteInfoDimensionDataWarehouseTimeVarianceTypeRouteStartTimeVarianceType_QNAME, String.class, DataWarehouseRouteInfoDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CultureName", scope = DataWarehouseKpiSchedule.class)
    public JAXBElement<String> createDataWarehouseKpiScheduleCultureName(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiScheduleCultureName_QNAME, String.class, DataWarehouseKpiSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiOutputType_OutputType", scope = DataWarehouseKpiSchedule.class)
    public JAXBElement<String> createDataWarehouseKpiScheduleDataWarehouseKpiOutputTypeOutputType(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiScheduleDataWarehouseKpiOutputTypeOutputType_QNAME, String.class, DataWarehouseKpiSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseKpiSchedule.class)
    public JAXBElement<String> createDataWarehouseKpiScheduleDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseKpiSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EmailRecipients", scope = DataWarehouseKpiSchedule.class)
    public JAXBElement<ArrayOfstring> createDataWarehouseKpiScheduleEmailRecipients(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DataWarehouseKpiScheduleEmailRecipients_QNAME, ArrayOfstring.class, DataWarehouseKpiSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ExecutionTime", scope = DataWarehouseKpiSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseKpiScheduleExecutionTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseKpiScheduleExecutionTime_QNAME, XMLGregorianCalendar.class, DataWarehouseKpiSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiName", scope = DataWarehouseKpiSchedule.class)
    public JAXBElement<String> createDataWarehouseKpiScheduleKpiName(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiScheduleKpiName_QNAME, String.class, DataWarehouseKpiSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "LastRunTime", scope = DataWarehouseKpiSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseKpiScheduleLastRunTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseKpiScheduleLastRunTime_QNAME, XMLGregorianCalendar.class, DataWarehouseKpiSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Options", scope = DataWarehouseKpiSchedule.class)
    public JAXBElement<MeasureUnitOptions> createDataWarehouseKpiScheduleOptions(MeasureUnitOptions value) {
        return new JAXBElement<MeasureUnitOptions>(_DataWarehouseKpiScheduleOptions_QNAME, MeasureUnitOptions.class, DataWarehouseKpiSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "WorldTimeZone_TimeZone", scope = DataWarehouseKpiSchedule.class)
    public JAXBElement<String> createDataWarehouseKpiScheduleWorldTimeZoneTimeZone(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiScheduleWorldTimeZoneTimeZone_QNAME, String.class, DataWarehouseKpiSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DayOfWeekFlags_Days", scope = DataWarehouseDailyKpiSchedule.class)
    public JAXBElement<String> createDataWarehouseDailyKpiScheduleDayOfWeekFlagsDays(String value) {
        return new JAXBElement<String>(_DataWarehouseDailyKpiScheduleDayOfWeekFlagsDays_QNAME, String.class, DataWarehouseDailyKpiSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpi_KpiGroupByType_GroupByType", scope = DataWarehouseKpiBase.class)
    public JAXBElement<String> createDataWarehouseKpiBaseDataWarehouseKpiKpiGroupByTypeGroupByType(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiRulesSetDataWarehouseKpiKpiGroupByTypeGroupByType_QNAME, String.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseSecondaryDimensionType_GroupBySecondaryDimension", scope = DataWarehouseKpiBase.class)
    public JAXBElement<String> createDataWarehouseKpiBaseDataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiBaseDataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension_QNAME, String.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionFilters", scope = DataWarehouseKpiBase.class)
    public JAXBElement<ArrayOfDimensionFilter> createDataWarehouseKpiBaseDimensionFilters(ArrayOfDimensionFilter value) {
        return new JAXBElement<ArrayOfDimensionFilter>(_PredefinedCompositeMeasureDimensionFilters_QNAME, ArrayOfDimensionFilter.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EndDateTimeFilter", scope = DataWarehouseKpiBase.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseKpiBaseEndDateTimeFilter(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseKpiBaseEndDateTimeFilter_QNAME, XMLGregorianCalendar.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionDescriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "GroupBySecondaryDimensionAttribute", scope = DataWarehouseKpiBase.class)
    public JAXBElement<DimensionDescriber> createDataWarehouseKpiBaseGroupBySecondaryDimensionAttribute(DimensionDescriber value) {
        return new JAXBElement<DimensionDescriber>(_DataWarehouseKpiBaseGroupBySecondaryDimensionAttribute_QNAME, DimensionDescriber.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionDescriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Groupings", scope = DataWarehouseKpiBase.class)
    public JAXBElement<ArrayOfDimensionDescriber> createDataWarehouseKpiBaseGroupings(ArrayOfDimensionDescriber value) {
        return new JAXBElement<ArrayOfDimensionDescriber>(_DataWarehouseKpiRulesSetGroupings_QNAME, ArrayOfDimensionDescriber.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiFolder", scope = DataWarehouseKpiBase.class)
    public JAXBElement<DataWarehouseKpiFolder> createDataWarehouseKpiBaseKpiFolder(DataWarehouseKpiFolder value) {
        return new JAXBElement<DataWarehouseKpiFolder>(_DataWarehouseKpiBaseKpiFolder_QNAME, DataWarehouseKpiFolder.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiSettings", scope = DataWarehouseKpiBase.class)
    public JAXBElement<DataWarehouseKpiSettings> createDataWarehouseKpiBaseKpiSettings(DataWarehouseKpiSettings value) {
        return new JAXBElement<DataWarehouseKpiSettings>(_DataWarehouseKpiBaseKpiSettings_QNAME, DataWarehouseKpiSettings.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Name", scope = DataWarehouseKpiBase.class)
    public JAXBElement<String> createDataWarehouseKpiBaseName(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerDimensionName_QNAME, String.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OperationsUnitDimensionFilterEntityKey", scope = DataWarehouseKpiBase.class)
    public JAXBElement<Long> createDataWarehouseKpiBaseOperationsUnitDimensionFilterEntityKey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseKpiBaseOperationsUnitDimensionFilterEntityKey_QNAME, Long.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiOperationsUnitDimensionsFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OperationsUnitDimensionsFilter", scope = DataWarehouseKpiBase.class)
    public JAXBElement<DataWarehouseKpiOperationsUnitDimensionsFilter> createDataWarehouseKpiBaseOperationsUnitDimensionsFilter(DataWarehouseKpiOperationsUnitDimensionsFilter value) {
        return new JAXBElement<DataWarehouseKpiOperationsUnitDimensionsFilter>(_DataWarehouseKpiBaseOperationsUnitDimensionsFilter_QNAME, DataWarehouseKpiOperationsUnitDimensionsFilter.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OwnerName", scope = DataWarehouseKpiBase.class)
    public JAXBElement<PersonName> createDataWarehouseKpiBaseOwnerName(PersonName value) {
        return new JAXBElement<PersonName>(_DataWarehouseKpiBaseOwnerName_QNAME, PersonName.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiRulesSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RulesSet", scope = DataWarehouseKpiBase.class)
    public JAXBElement<DataWarehouseKpiRulesSet> createDataWarehouseKpiBaseRulesSet(DataWarehouseKpiRulesSet value) {
        return new JAXBElement<DataWarehouseKpiRulesSet>(_DataWarehouseKpiBaseRulesSet_QNAME, DataWarehouseKpiRulesSet.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Settings", scope = DataWarehouseKpiBase.class)
    public JAXBElement<byte[]> createDataWarehouseKpiBaseSettings(byte[] value) {
        return new JAXBElement<byte[]>(_DataWarehouseKpiBaseSettings_QNAME, byte[].class, DataWarehouseKpiBase.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ShareableEntityAccessPermission_Permission", scope = DataWarehouseKpiBase.class)
    public JAXBElement<String> createDataWarehouseKpiBaseShareableEntityAccessPermissionPermission(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiBaseShareableEntityAccessPermissionPermission_QNAME, String.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiSortingOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "SortingOptions", scope = DataWarehouseKpiBase.class)
    public JAXBElement<DataWarehouseKpiSortingOptions> createDataWarehouseKpiBaseSortingOptions(DataWarehouseKpiSortingOptions value) {
        return new JAXBElement<DataWarehouseKpiSortingOptions>(_DataWarehouseKpiSettingsSortingOptions_QNAME, DataWarehouseKpiSortingOptions.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "StartDateTimeFilter", scope = DataWarehouseKpiBase.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseKpiBaseStartDateTimeFilter(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseKpiBaseStartDateTimeFilter_QNAME, XMLGregorianCalendar.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "StringifiedFilters", scope = DataWarehouseKpiBase.class)
    public JAXBElement<String> createDataWarehouseKpiBaseStringifiedFilters(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiBaseStringifiedFilters_QNAME, String.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TimeUnit_GroupByTimeUnit", scope = DataWarehouseKpiBase.class)
    public JAXBElement<String> createDataWarehouseKpiBaseTimeUnitGroupByTimeUnit(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiBaseTimeUnitGroupByTimeUnit_QNAME, String.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TimeUnit_SecondaryGroupByTimeUnit", scope = DataWarehouseKpiBase.class)
    public JAXBElement<String> createDataWarehouseKpiBaseTimeUnitSecondaryGroupByTimeUnit(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiBaseTimeUnitSecondaryGroupByTimeUnit_QNAME, String.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TimeUnit_TimeUnitFilter", scope = DataWarehouseKpiBase.class)
    public JAXBElement<String> createDataWarehouseKpiBaseTimeUnitTimeUnitFilter(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiBaseTimeUnitTimeUnitFilter_QNAME, String.class, DataWarehouseKpiBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Measures", scope = DataWarehouseKpi.class)
    public JAXBElement<ArrayOfDataWarehouseKpiMeasure> createDataWarehouseKpiMeasures(ArrayOfDataWarehouseKpiMeasure value) {
        return new JAXBElement<ArrayOfDataWarehouseKpiMeasure>(_MultiMeasureMeasures_QNAME, ArrayOfDataWarehouseKpiMeasure.class, DataWarehouseKpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CustomMeasureAverageEntityKey", scope = DataWarehouseKpiMeasureBase.class)
    public JAXBElement<Long> createDataWarehouseKpiMeasureBaseCustomMeasureAverageEntityKey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseKpiMeasureBaseCustomMeasureAverageEntityKey_QNAME, Long.class, DataWarehouseKpiMeasureBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CustomMeasureEntityKey", scope = DataWarehouseKpiMeasureBase.class)
    public JAXBElement<Long> createDataWarehouseKpiMeasureBaseCustomMeasureEntityKey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseKpiMeasureBaseCustomMeasureEntityKey_QNAME, Long.class, DataWarehouseKpiMeasureBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiMeasure_MeasureAverageSetting_AverageSetting", scope = DataWarehouseKpiMeasureBase.class)
    public JAXBElement<String> createDataWarehouseKpiMeasureBaseDataWarehouseKpiMeasureMeasureAverageSettingAverageSetting(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiMeasureBaseDataWarehouseKpiMeasureMeasureAverageSettingAverageSetting_QNAME, String.class, DataWarehouseKpiMeasureBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseKpiMeasure_MeasureCompareSetting_CompareSetting", scope = DataWarehouseKpiMeasureBase.class)
    public JAXBElement<String> createDataWarehouseKpiMeasureBaseDataWarehouseKpiMeasureMeasureCompareSettingCompareSetting(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiMeasureBaseDataWarehouseKpiMeasureMeasureCompareSettingCompareSetting_QNAME, String.class, DataWarehouseKpiMeasureBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionFilters", scope = DataWarehouseKpiMeasureBase.class)
    public JAXBElement<ArrayOfDimensionFilter> createDataWarehouseKpiMeasureBaseDimensionFilters(ArrayOfDimensionFilter value) {
        return new JAXBElement<ArrayOfDimensionFilter>(_PredefinedCompositeMeasureDimensionFilters_QNAME, ArrayOfDimensionFilter.class, DataWarehouseKpiMeasureBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DisplayName", scope = DataWarehouseKpiMeasureBase.class)
    public JAXBElement<String> createDataWarehouseKpiMeasureBaseDisplayName(String value) {
        return new JAXBElement<String>(_DataWarehouseRouteDescriptorDimensionDisplayName_QNAME, String.class, DataWarehouseKpiMeasureBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Measure", scope = DataWarehouseKpiMeasureBase.class)
    public JAXBElement<String> createDataWarehouseKpiMeasureBaseMeasure(String value) {
        return new JAXBElement<String>(_ScoreMeasureMeasure_QNAME, String.class, DataWarehouseKpiMeasureBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Settings", scope = DataWarehouseKpiMeasureBase.class)
    public JAXBElement<byte[]> createDataWarehouseKpiMeasureBaseSettings(byte[] value) {
        return new JAXBElement<byte[]>(_DataWarehouseKpiBaseSettings_QNAME, byte[].class, DataWarehouseKpiMeasureBase.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "StringifiedFilters", scope = DataWarehouseKpiMeasureBase.class)
    public JAXBElement<String> createDataWarehouseKpiMeasureBaseStringifiedFilters(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiBaseStringifiedFilters_QNAME, String.class, DataWarehouseKpiMeasureBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseScorecardKpiMeasureCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Criteria", scope = DataWarehouseScorecardKpiMeasure.class)
    public JAXBElement<DataWarehouseScorecardKpiMeasureCriteria> createDataWarehouseScorecardKpiMeasureCriteria(DataWarehouseScorecardKpiMeasureCriteria value) {
        return new JAXBElement<DataWarehouseScorecardKpiMeasureCriteria>(_DataWarehouseKpiRuleCriteria_QNAME, DataWarehouseScorecardKpiMeasureCriteria.class, DataWarehouseScorecardKpiMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseScorecardKpiMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Measures", scope = DataWarehouseScorecardKpi.class)
    public JAXBElement<ArrayOfDataWarehouseScorecardKpiMeasure> createDataWarehouseScorecardKpiMeasures(ArrayOfDataWarehouseScorecardKpiMeasure value) {
        return new JAXBElement<ArrayOfDataWarehouseScorecardKpiMeasure>(_MultiMeasureMeasures_QNAME, ArrayOfDataWarehouseScorecardKpiMeasure.class, DataWarehouseScorecardKpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Name", scope = DataWarehouseKpiFolder.class)
    public JAXBElement<String> createDataWarehouseKpiFolderName(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerDimensionName_QNAME, String.class, DataWarehouseKpiFolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "OwnerName", scope = DataWarehouseKpiFolder.class)
    public JAXBElement<PersonName> createDataWarehouseKpiFolderOwnerName(PersonName value) {
        return new JAXBElement<PersonName>(_DataWarehouseKpiBaseOwnerName_QNAME, PersonName.class, DataWarehouseKpiFolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Settings", scope = DataWarehouseKpiFolder.class)
    public JAXBElement<byte[]> createDataWarehouseKpiFolderSettings(byte[] value) {
        return new JAXBElement<byte[]>(_DataWarehouseKpiBaseSettings_QNAME, byte[].class, DataWarehouseKpiFolder.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ShareableEntityAccessPermission_Permission", scope = DataWarehouseKpiFolder.class)
    public JAXBElement<String> createDataWarehouseKpiFolderShareableEntityAccessPermissionPermission(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiBaseShareableEntityAccessPermissionPermission_QNAME, String.class, DataWarehouseKpiFolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseEquipmentManufacturerDimension.class)
    public JAXBElement<String> createDataWarehouseEquipmentManufacturerDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseEquipmentManufacturerDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Identifier", scope = DataWarehouseEquipmentManufacturerDimension.class)
    public JAXBElement<String> createDataWarehouseEquipmentManufacturerDimensionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotIdentifier_QNAME, String.class, DataWarehouseEquipmentManufacturerDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleDescription", scope = DataWarehouseDoorStateExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehouseDoorStateExceptionRuleDimensionRuleDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiDescriptionRuleDescription_QNAME, String.class, DataWarehouseDoorStateExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleIdentifier", scope = DataWarehouseDoorStateExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehouseDoorStateExceptionRuleDimensionRuleIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseSpeedingExceptionRuleDimensionRuleIdentifier_QNAME, String.class, DataWarehouseDoorStateExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "AttributeName", scope = SecondaryDimensionDescriber.class)
    public JAXBElement<String> createSecondaryDimensionDescriberAttributeName(String value) {
        return new JAXBElement<String>(_SecondaryDimensionDescriberAttributeName_QNAME, String.class, SecondaryDimensionDescriber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseSecondaryDimensionType_SecondaryDimension", scope = SecondaryDimensionDescriber.class)
    public JAXBElement<String> createSecondaryDimensionDescriberDataWarehouseSecondaryDimensionTypeSecondaryDimension(String value) {
        return new JAXBElement<String>(_SecondaryDimensionDescriberDataWarehouseSecondaryDimensionTypeSecondaryDimension_QNAME, String.class, SecondaryDimensionDescriber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TimeUnit_SecondaryTimeUnit", scope = TimeDimensionDescriber.class)
    public JAXBElement<String> createTimeDimensionDescriberTimeUnitSecondaryTimeUnit(String value) {
        return new JAXBElement<String>(_TimeDimensionDescriberTimeUnitSecondaryTimeUnit_QNAME, String.class, TimeDimensionDescriber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TimeUnit_TimeUnit", scope = TimeDimensionDescriber.class)
    public JAXBElement<String> createTimeDimensionDescriberTimeUnitTimeUnit(String value) {
        return new JAXBElement<String>(_TimeDimensionDescriberTimeUnitTimeUnit_QNAME, String.class, TimeDimensionDescriber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionDetail", scope = DimensionFilter.class)
    public JAXBElement<DimensionDetail> createDimensionFilterDimensionDetail(DimensionDetail value) {
        return new JAXBElement<DimensionDetail>(_DimensionDetail_QNAME, DimensionDetail.class, DimensionFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ConversionFactor", scope = UserDefinedMeasure.class)
    public JAXBElement<Double> createUserDefinedMeasureConversionFactor(Double value) {
        return new JAXBElement<Double>(_PredefinedCompositeMeasureConversionFactor_QNAME, Double.class, UserDefinedMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehousePlannedActualType_PlannedOrActual", scope = UserDefinedMeasure.class)
    public JAXBElement<String> createUserDefinedMeasureDataWarehousePlannedActualTypePlannedOrActual(String value) {
        return new JAXBElement<String>(_PredefinedCompositeMeasureDataWarehousePlannedActualTypePlannedOrActual_QNAME, String.class, UserDefinedMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimensionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DimensionFilters", scope = UserDefinedMeasure.class)
    public JAXBElement<ArrayOfDimensionFilter> createUserDefinedMeasureDimensionFilters(ArrayOfDimensionFilter value) {
        return new JAXBElement<ArrayOfDimensionFilter>(_PredefinedCompositeMeasureDimensionFilters_QNAME, ArrayOfDimensionFilter.class, UserDefinedMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "AuthorName", scope = DataWarehouseCustomMeasure.class)
    public JAXBElement<PersonName> createDataWarehouseCustomMeasureAuthorName(PersonName value) {
        return new JAXBElement<PersonName>(_DataWarehouseCustomMeasureAuthorName_QNAME, PersonName.class, DataWarehouseCustomMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseMeasureUsageOptions_Options", scope = DataWarehouseCustomMeasure.class)
    public JAXBElement<String> createDataWarehouseCustomMeasureDataWarehouseMeasureUsageOptionsOptions(String value) {
        return new JAXBElement<String>(_DataWarehouseCustomMeasureDataWarehouseMeasureUsageOptionsOptions_QNAME, String.class, DataWarehouseCustomMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseCustomMeasure.class)
    public JAXBElement<String> createDataWarehouseCustomMeasureDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseCustomMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Formula", scope = DataWarehouseCustomMeasure.class)
    public JAXBElement<IMeasure> createDataWarehouseCustomMeasureFormula(IMeasure value) {
        return new JAXBElement<IMeasure>(_DataWarehouseCustomMeasureFormula_QNAME, IMeasure.class, DataWarehouseCustomMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Name", scope = DataWarehouseCustomMeasure.class)
    public JAXBElement<String> createDataWarehouseCustomMeasureName(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerDimensionName_QNAME, String.class, DataWarehouseCustomMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RawFormula", scope = DataWarehouseCustomMeasure.class)
    public JAXBElement<String> createDataWarehouseCustomMeasureRawFormula(String value) {
        return new JAXBElement<String>(_DataWarehouseCustomMeasureRawFormula_QNAME, String.class, DataWarehouseCustomMeasure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseCostType_Type", scope = DataWarehouseCostTypeDimension.class)
    public JAXBElement<String> createDataWarehouseCostTypeDimensionDataWarehouseCostTypeType(String value) {
        return new JAXBElement<String>(_DataWarehouseCostTypeDimensionDataWarehouseCostTypeType_QNAME, String.class, DataWarehouseCostTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseAccountDimension.class)
    public JAXBElement<String> createDataWarehouseAccountDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseAccountDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Identifier", scope = DataWarehouseAccountDimension.class)
    public JAXBElement<String> createDataWarehouseAccountDimensionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotIdentifier_QNAME, String.class, DataWarehouseAccountDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseTelematicsDeviceInputOutputAccessoryDimension.class)
    public JAXBElement<String> createDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseTelematicsDeviceInputOutputAccessoryDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Identifier", scope = DataWarehouseTelematicsDeviceInputOutputAccessoryDimension.class)
    public JAXBElement<String> createDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotIdentifier_QNAME, String.class, DataWarehouseTelematicsDeviceInputOutputAccessoryDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDimension_DimensionCategory_Category", scope = DataWarehouseDimension.class)
    public JAXBElement<String> createDataWarehouseDimensionDataWarehouseDimensionDimensionCategoryCategory(String value) {
        return new JAXBElement<String>(_DataWarehouseDimensionDataWarehouseDimensionDimensionCategoryCategory_QNAME, String.class, DataWarehouseDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseIdlingTypeDimension_IdlingType_Type", scope = DataWarehouseIdlingTypeDimension.class)
    public JAXBElement<String> createDataWarehouseIdlingTypeDimensionDataWarehouseIdlingTypeDimensionIdlingTypeType(String value) {
        return new JAXBElement<String>(_DataWarehouseIdlingTypeDimensionDataWarehouseIdlingTypeDimensionIdlingTypeType_QNAME, String.class, DataWarehouseIdlingTypeDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleDescription", scope = DataWarehousePowerTakeOffExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehousePowerTakeOffExceptionRuleDimensionRuleDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiDescriptionRuleDescription_QNAME, String.class, DataWarehousePowerTakeOffExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "RuleIdentifier", scope = DataWarehousePowerTakeOffExceptionRuleDimension.class)
    public JAXBElement<String> createDataWarehousePowerTakeOffExceptionRuleDimensionRuleIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseSpeedingExceptionRuleDimensionRuleIdentifier_QNAME, String.class, DataWarehousePowerTakeOffExceptionRuleDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CreatedInRegionIdentifier", scope = DataWarehouseTelematicsDeviceDimension.class)
    public JAXBElement<String> createDataWarehouseTelematicsDeviceDimensionCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerDimensionCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseTelematicsDeviceDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseTelematicsDeviceDimension.class)
    public JAXBElement<String> createDataWarehouseTelematicsDeviceDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseTelematicsDeviceDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Identifier", scope = DataWarehouseTelematicsDeviceDimension.class)
    public JAXBElement<String> createDataWarehouseTelematicsDeviceDimensionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotIdentifier_QNAME, String.class, DataWarehouseTelematicsDeviceDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "TelematicsProviderType_AccessoryType", scope = DataWarehouseTelematicsDeviceDimension.class)
    public JAXBElement<String> createDataWarehouseTelematicsDeviceDimensionTelematicsProviderTypeAccessoryType(String value) {
        return new JAXBElement<String>(_DataWarehouseTelematicsDeviceDimensionTelematicsProviderTypeAccessoryType_QNAME, String.class, DataWarehouseTelematicsDeviceDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "NavRecalculationReason_Reason", scope = DataWarehouseNavRecalculationReasonDimension.class)
    public JAXBElement<String> createDataWarehouseNavRecalculationReasonDimensionNavRecalculationReasonReason(String value) {
        return new JAXBElement<String>(_DataWarehouseNavRecalculationReasonDimensionNavRecalculationReasonReason_QNAME, String.class, DataWarehouseNavRecalculationReasonDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "CreatedInRegionIdentifier", scope = DataWarehouseMobileDeviceDimension.class)
    public JAXBElement<String> createDataWarehouseMobileDeviceDimensionCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseWorkerDimensionCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseMobileDeviceDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseMobileDeviceDimension.class)
    public JAXBElement<String> createDataWarehouseMobileDeviceDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseMobileDeviceDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Identifier", scope = DataWarehouseMobileDeviceDimension.class)
    public JAXBElement<String> createDataWarehouseMobileDeviceDimensionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotIdentifier_QNAME, String.class, DataWarehouseMobileDeviceDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseCleansingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Result", scope = DataWarehouseCleansingJobInfo.class)
    public JAXBElement<DataWarehouseCleansingResult> createDataWarehouseCleansingJobInfoResult(DataWarehouseCleansingResult value) {
        return new JAXBElement<DataWarehouseCleansingResult>(_DataWarehouseCleansingJobInfoResult_QNAME, DataWarehouseCleansingResult.class, DataWarehouseCleansingJobInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseFileType_FileType", scope = DataWarehouseKpiExportFileResult.class)
    public JAXBElement<String> createDataWarehouseKpiExportFileResultDataWarehouseFileTypeFileType(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiExportFileResultDataWarehouseFileTypeFileType_QNAME, String.class, DataWarehouseKpiExportFileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "FileName", scope = DataWarehouseKpiExportFileResult.class)
    public JAXBElement<String> createDataWarehouseKpiExportFileResultFileName(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiExportFileResultFileName_QNAME, String.class, DataWarehouseKpiExportFileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "FileUrl", scope = DataWarehouseKpiExportFileResult.class)
    public JAXBElement<String> createDataWarehouseKpiExportFileResultFileUrl(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiExportFileResultFileUrl_QNAME, String.class, DataWarehouseKpiExportFileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "KpiName", scope = DataWarehouseKpiExportFileResult.class)
    public JAXBElement<String> createDataWarehouseKpiExportFileResultKpiName(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiScheduleKpiName_QNAME, String.class, DataWarehouseKpiExportFileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseKpiExportFileResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Result", scope = DataWarehouseKpiExportJobInfo.class)
    public JAXBElement<DataWarehouseKpiExportFileResult> createDataWarehouseKpiExportJobInfoResult(DataWarehouseKpiExportFileResult value) {
        return new JAXBElement<DataWarehouseKpiExportFileResult>(_DataWarehouseCleansingJobInfoResult_QNAME, DataWarehouseKpiExportFileResult.class, DataWarehouseKpiExportJobInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "UserName", scope = DataWarehouseKpiExportJobInfo.class)
    public JAXBElement<String> createDataWarehouseKpiExportJobInfoUserName(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiExportJobInfoUserName_QNAME, String.class, DataWarehouseKpiExportJobInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "EndTime", scope = DataWarehouseIntegrationStatus.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseIntegrationStatusEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseIntegrationStatusEndTime_QNAME, XMLGregorianCalendar.class, DataWarehouseIntegrationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "IntegrationStatus_Status", scope = DataWarehouseIntegrationStatus.class)
    public JAXBElement<String> createDataWarehouseIntegrationStatusIntegrationStatusStatus(String value) {
        return new JAXBElement<String>(_DataWarehouseIntegrationStatusIntegrationStatusStatus_QNAME, String.class, DataWarehouseIntegrationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DataWarehouseDepotEntityKey", scope = DataWarehouseOperationsUnitDimension.class)
    public JAXBElement<Long> createDataWarehouseOperationsUnitDimensionDataWarehouseDepotEntityKey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseOperationsUnitDimensionDataWarehouseDepotEntityKey_QNAME, Long.class, DataWarehouseOperationsUnitDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseOperationsUnitDimension.class)
    public JAXBElement<String> createDataWarehouseOperationsUnitDimensionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseOperationsUnitDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DisabledDate", scope = DataWarehouseOperationsUnitDimension.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseOperationsUnitDimensionDisabledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseDepotDisabledDate_QNAME, XMLGregorianCalendar.class, DataWarehouseOperationsUnitDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Identifier", scope = DataWarehouseOperationsUnitDimension.class)
    public JAXBElement<String> createDataWarehouseOperationsUnitDimensionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotIdentifier_QNAME, String.class, DataWarehouseOperationsUnitDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ParentDescription", scope = DataWarehouseOperationsUnitDimension.class)
    public JAXBElement<String> createDataWarehouseOperationsUnitDimensionParentDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseOperationsUnitDimensionParentDescription_QNAME, String.class, DataWarehouseOperationsUnitDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ParentEntityKey", scope = DataWarehouseOperationsUnitDimension.class)
    public JAXBElement<Long> createDataWarehouseOperationsUnitDimensionParentEntityKey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseOperationsUnitDimensionParentEntityKey_QNAME, Long.class, DataWarehouseOperationsUnitDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "ParentIdentifier", scope = DataWarehouseOperationsUnitDimension.class)
    public JAXBElement<String> createDataWarehouseOperationsUnitDimensionParentIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseOperationsUnitDimensionParentIdentifier_QNAME, String.class, DataWarehouseOperationsUnitDimension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Depth", scope = DataWarehouseOperationsUnitLevel.class)
    public JAXBElement<Integer> createDataWarehouseOperationsUnitLevelDepth(Integer value) {
        return new JAXBElement<Integer>(_DataWarehouseOperationsUnitLevelDepth_QNAME, Integer.class, DataWarehouseOperationsUnitLevel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseOperationsUnitLevel.class)
    public JAXBElement<String> createDataWarehouseOperationsUnitLevelDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotDescription_QNAME, String.class, DataWarehouseOperationsUnitLevel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Identifier", scope = DataWarehouseOperationsUnitLevel.class)
    public JAXBElement<String> createDataWarehouseOperationsUnitLevelIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseDepotIdentifier_QNAME, String.class, DataWarehouseOperationsUnitLevel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "Content", scope = KpiExportResultDto.class)
    public JAXBElement<byte[]> createKpiExportResultDtoContent(byte[] value) {
        return new JAXBElement<byte[]>(_KpiExportResultDtoContent_QNAME, byte[].class, KpiExportResultDto.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "FileName", scope = KpiExportResultDto.class)
    public JAXBElement<String> createKpiExportResultDtoFileName(String value) {
        return new JAXBElement<String>(_DataWarehouseKpiExportFileResultFileName_QNAME, String.class, KpiExportResultDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "DistanceUnit_DistanceUnit", scope = MeasureUnitOptions.class)
    public JAXBElement<String> createMeasureUnitOptionsDistanceUnitDistanceUnit(String value) {
        return new JAXBElement<String>(_MeasureUnitOptionsDistanceUnitDistanceUnit_QNAME, String.class, MeasureUnitOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", name = "LiquidVolumeUnit_LiquidVolumeUnit", scope = MeasureUnitOptions.class)
    public JAXBElement<String> createMeasureUnitOptionsLiquidVolumeUnitLiquidVolumeUnit(String value) {
        return new JAXBElement<String>(_MeasureUnitOptionsLiquidVolumeUnitLiquidVolumeUnit_QNAME, String.class, MeasureUnitOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", name = "DestinationAddress", scope = RetrieveNavRecalculationDetailsResult.class)
    public JAXBElement<Address> createRetrieveNavRecalculationDetailsResultDestinationAddress(Address value) {
        return new JAXBElement<Address>(_RetrieveNavRecalculationDetailsResultDestinationAddress_QNAME, Address.class, RetrieveNavRecalculationDetailsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", name = "EquipmentTypeDescription", scope = EquipmentProfileResult.class)
    public JAXBElement<String> createEquipmentProfileResultEquipmentTypeDescription(String value) {
        return new JAXBElement<String>(_EquipmentProfileResultEquipmentTypeDescription_QNAME, String.class, EquipmentProfileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", name = "EquipmentTypeIdentifier", scope = EquipmentProfileResult.class)
    public JAXBElement<String> createEquipmentProfileResultEquipmentTypeIdentifier(String value) {
        return new JAXBElement<String>(_EquipmentProfileResultEquipmentTypeIdentifier_QNAME, String.class, EquipmentProfileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Length }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", name = "Height", scope = EquipmentProfileResult.class)
    public JAXBElement<Length> createEquipmentProfileResultHeight(Length value) {
        return new JAXBElement<Length>(_EquipmentProfileResultHeight_QNAME, Length.class, EquipmentProfileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Length }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", name = "Length", scope = EquipmentProfileResult.class)
    public JAXBElement<Length> createEquipmentProfileResultLength(Length value) {
        return new JAXBElement<Length>(_EquipmentProfileResultLength_QNAME, Length.class, EquipmentProfileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Weight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", name = "Weight", scope = EquipmentProfileResult.class)
    public JAXBElement<Weight> createEquipmentProfileResultWeight(Weight value) {
        return new JAXBElement<Weight>(_EquipmentProfileResultWeight_QNAME, Weight.class, EquipmentProfileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Length }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", name = "Width", scope = EquipmentProfileResult.class)
    public JAXBElement<Length> createEquipmentProfileResultWidth(Length value) {
        return new JAXBElement<Length>(_EquipmentProfileResultWidth_QNAME, Length.class, EquipmentProfileResult.class, value);
    }

}
