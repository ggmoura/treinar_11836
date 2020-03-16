
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
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
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de KpiQueryResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KpiQueryResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KpiExecutionJobPKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedAccounts" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedCargoExceptionTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedCargoUnitTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedCostTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedDoorStateExceptionRules" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedEngineIdleExceptionRules" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedEquipmentClasses" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedEquipmentManufacturers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedEquipmentTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedEquipments" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedIdlingTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedLocations" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedMobileDevices" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedNavRecalculationReasons" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedOperationsUnits" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedPlannedAndActuals" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedPowerTakeOffExceptionRules" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedRouteDescriptors" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedRouteInfos" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedRoutes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedServiceLocationCategories" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedServiceTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedSpeedingExceptionRules" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedStopInfos" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedStopTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTelematicsDeviceInputOutputAccessories" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTelematicsDevices" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedTemperatureExceptionRules" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedWorkerTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedWorkers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf" minOccurs="0"/&gt;
 *         &lt;element name="Results" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}ArrayOfKpiQueryResultItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KpiQueryResults", propOrder = {
    "kpiExecutionJobPKey",
    "referencedAccounts",
    "referencedCargoExceptionTypes",
    "referencedCargoUnitTypes",
    "referencedCostTypes",
    "referencedDoorStateExceptionRules",
    "referencedEngineIdleExceptionRules",
    "referencedEquipmentClasses",
    "referencedEquipmentManufacturers",
    "referencedEquipmentTypes",
    "referencedEquipments",
    "referencedIdlingTypes",
    "referencedLocations",
    "referencedMobileDevices",
    "referencedNavRecalculationReasons",
    "referencedOperationsUnits",
    "referencedPlannedAndActuals",
    "referencedPowerTakeOffExceptionRules",
    "referencedRouteDescriptors",
    "referencedRouteInfos",
    "referencedRoutes",
    "referencedServiceLocationCategories",
    "referencedServiceTypes",
    "referencedSpeedingExceptionRules",
    "referencedStopInfos",
    "referencedStopTypes",
    "referencedTelematicsDeviceInputOutputAccessories",
    "referencedTelematicsDevices",
    "referencedTemperatureExceptionRules",
    "referencedWorkerTypes",
    "referencedWorkers",
    "results"
})
public class KpiQueryResults
    extends DataTransferObject
{

    @XmlElementRef(name = "KpiExecutionJobPKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> kpiExecutionJobPKey;
    @XmlElementRef(name = "ReferencedAccounts", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf> referencedAccounts;
    @XmlElementRef(name = "ReferencedCargoExceptionTypes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf> referencedCargoExceptionTypes;
    @XmlElementRef(name = "ReferencedCargoUnitTypes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf> referencedCargoUnitTypes;
    @XmlElementRef(name = "ReferencedCostTypes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf> referencedCostTypes;
    @XmlElementRef(name = "ReferencedDoorStateExceptionRules", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf> referencedDoorStateExceptionRules;
    @XmlElementRef(name = "ReferencedEngineIdleExceptionRules", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf> referencedEngineIdleExceptionRules;
    @XmlElementRef(name = "ReferencedEquipmentClasses", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf> referencedEquipmentClasses;
    @XmlElementRef(name = "ReferencedEquipmentManufacturers", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf> referencedEquipmentManufacturers;
    @XmlElementRef(name = "ReferencedEquipmentTypes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf> referencedEquipmentTypes;
    @XmlElementRef(name = "ReferencedEquipments", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf> referencedEquipments;
    @XmlElementRef(name = "ReferencedIdlingTypes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf> referencedIdlingTypes;
    @XmlElementRef(name = "ReferencedLocations", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf> referencedLocations;
    @XmlElementRef(name = "ReferencedMobileDevices", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf> referencedMobileDevices;
    @XmlElementRef(name = "ReferencedNavRecalculationReasons", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf> referencedNavRecalculationReasons;
    @XmlElementRef(name = "ReferencedOperationsUnits", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf> referencedOperationsUnits;
    @XmlElementRef(name = "ReferencedPlannedAndActuals", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf> referencedPlannedAndActuals;
    @XmlElementRef(name = "ReferencedPowerTakeOffExceptionRules", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf> referencedPowerTakeOffExceptionRules;
    @XmlElementRef(name = "ReferencedRouteDescriptors", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf> referencedRouteDescriptors;
    @XmlElementRef(name = "ReferencedRouteInfos", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf> referencedRouteInfos;
    @XmlElementRef(name = "ReferencedRoutes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf> referencedRoutes;
    @XmlElementRef(name = "ReferencedServiceLocationCategories", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf> referencedServiceLocationCategories;
    @XmlElementRef(name = "ReferencedServiceTypes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf> referencedServiceTypes;
    @XmlElementRef(name = "ReferencedSpeedingExceptionRules", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf> referencedSpeedingExceptionRules;
    @XmlElementRef(name = "ReferencedStopInfos", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf> referencedStopInfos;
    @XmlElementRef(name = "ReferencedStopTypes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf> referencedStopTypes;
    @XmlElementRef(name = "ReferencedTelematicsDeviceInputOutputAccessories", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf> referencedTelematicsDeviceInputOutputAccessories;
    @XmlElementRef(name = "ReferencedTelematicsDevices", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf> referencedTelematicsDevices;
    @XmlElementRef(name = "ReferencedTemperatureExceptionRules", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf> referencedTemperatureExceptionRules;
    @XmlElementRef(name = "ReferencedWorkerTypes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf> referencedWorkerTypes;
    @XmlElementRef(name = "ReferencedWorkers", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf> referencedWorkers;
    @XmlElementRef(name = "Results", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKpiQueryResultItem> results;

    /**
     * Obtém o valor da propriedade kpiExecutionJobPKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getKpiExecutionJobPKey() {
        return kpiExecutionJobPKey;
    }

    /**
     * Define o valor da propriedade kpiExecutionJobPKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setKpiExecutionJobPKey(JAXBElement<Long> value) {
        this.kpiExecutionJobPKey = value;
    }

    /**
     * Obtém o valor da propriedade referencedAccounts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf> getReferencedAccounts() {
        return referencedAccounts;
    }

    /**
     * Define o valor da propriedade referencedAccounts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedAccounts(JAXBElement<ArrayOfKeyValueOflongDataWarehouseAccountDimensionvLPJ3Huf> value) {
        this.referencedAccounts = value;
    }

    /**
     * Obtém o valor da propriedade referencedCargoExceptionTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf> getReferencedCargoExceptionTypes() {
        return referencedCargoExceptionTypes;
    }

    /**
     * Define o valor da propriedade referencedCargoExceptionTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedCargoExceptionTypes(JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoExceptionTypeDimensionvLPJ3Huf> value) {
        this.referencedCargoExceptionTypes = value;
    }

    /**
     * Obtém o valor da propriedade referencedCargoUnitTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf> getReferencedCargoUnitTypes() {
        return referencedCargoUnitTypes;
    }

    /**
     * Define o valor da propriedade referencedCargoUnitTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedCargoUnitTypes(JAXBElement<ArrayOfKeyValueOflongDataWarehouseCargoUnitTypeDimensionvLPJ3Huf> value) {
        this.referencedCargoUnitTypes = value;
    }

    /**
     * Obtém o valor da propriedade referencedCostTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf> getReferencedCostTypes() {
        return referencedCostTypes;
    }

    /**
     * Define o valor da propriedade referencedCostTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedCostTypes(JAXBElement<ArrayOfKeyValueOflongDataWarehouseCostTypeDimensionvLPJ3Huf> value) {
        this.referencedCostTypes = value;
    }

    /**
     * Obtém o valor da propriedade referencedDoorStateExceptionRules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf> getReferencedDoorStateExceptionRules() {
        return referencedDoorStateExceptionRules;
    }

    /**
     * Define o valor da propriedade referencedDoorStateExceptionRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedDoorStateExceptionRules(JAXBElement<ArrayOfKeyValueOflongDataWarehouseDoorStateExceptionRuleDimensionvLPJ3Huf> value) {
        this.referencedDoorStateExceptionRules = value;
    }

    /**
     * Obtém o valor da propriedade referencedEngineIdleExceptionRules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf> getReferencedEngineIdleExceptionRules() {
        return referencedEngineIdleExceptionRules;
    }

    /**
     * Define o valor da propriedade referencedEngineIdleExceptionRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedEngineIdleExceptionRules(JAXBElement<ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf> value) {
        this.referencedEngineIdleExceptionRules = value;
    }

    /**
     * Obtém o valor da propriedade referencedEquipmentClasses.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf> getReferencedEquipmentClasses() {
        return referencedEquipmentClasses;
    }

    /**
     * Define o valor da propriedade referencedEquipmentClasses.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedEquipmentClasses(JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentClassDimensionvLPJ3Huf> value) {
        this.referencedEquipmentClasses = value;
    }

    /**
     * Obtém o valor da propriedade referencedEquipmentManufacturers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf> getReferencedEquipmentManufacturers() {
        return referencedEquipmentManufacturers;
    }

    /**
     * Define o valor da propriedade referencedEquipmentManufacturers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedEquipmentManufacturers(JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentManufacturerDimensionvLPJ3Huf> value) {
        this.referencedEquipmentManufacturers = value;
    }

    /**
     * Obtém o valor da propriedade referencedEquipmentTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf> getReferencedEquipmentTypes() {
        return referencedEquipmentTypes;
    }

    /**
     * Define o valor da propriedade referencedEquipmentTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedEquipmentTypes(JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentTypeDimensionvLPJ3Huf> value) {
        this.referencedEquipmentTypes = value;
    }

    /**
     * Obtém o valor da propriedade referencedEquipments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf> getReferencedEquipments() {
        return referencedEquipments;
    }

    /**
     * Define o valor da propriedade referencedEquipments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedEquipments(JAXBElement<ArrayOfKeyValueOflongDataWarehouseEquipmentDimensionvLPJ3Huf> value) {
        this.referencedEquipments = value;
    }

    /**
     * Obtém o valor da propriedade referencedIdlingTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf> getReferencedIdlingTypes() {
        return referencedIdlingTypes;
    }

    /**
     * Define o valor da propriedade referencedIdlingTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedIdlingTypes(JAXBElement<ArrayOfKeyValueOflongDataWarehouseIdlingTypeDimensionvLPJ3Huf> value) {
        this.referencedIdlingTypes = value;
    }

    /**
     * Obtém o valor da propriedade referencedLocations.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf> getReferencedLocations() {
        return referencedLocations;
    }

    /**
     * Define o valor da propriedade referencedLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedLocations(JAXBElement<ArrayOfKeyValueOflongDataWarehouseLocationDimensionvLPJ3Huf> value) {
        this.referencedLocations = value;
    }

    /**
     * Obtém o valor da propriedade referencedMobileDevices.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf> getReferencedMobileDevices() {
        return referencedMobileDevices;
    }

    /**
     * Define o valor da propriedade referencedMobileDevices.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedMobileDevices(JAXBElement<ArrayOfKeyValueOflongDataWarehouseMobileDeviceDimensionvLPJ3Huf> value) {
        this.referencedMobileDevices = value;
    }

    /**
     * Obtém o valor da propriedade referencedNavRecalculationReasons.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf> getReferencedNavRecalculationReasons() {
        return referencedNavRecalculationReasons;
    }

    /**
     * Define o valor da propriedade referencedNavRecalculationReasons.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedNavRecalculationReasons(JAXBElement<ArrayOfKeyValueOflongDataWarehouseNavRecalculationReasonDimensionvLPJ3Huf> value) {
        this.referencedNavRecalculationReasons = value;
    }

    /**
     * Obtém o valor da propriedade referencedOperationsUnits.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf> getReferencedOperationsUnits() {
        return referencedOperationsUnits;
    }

    /**
     * Define o valor da propriedade referencedOperationsUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedOperationsUnits(JAXBElement<ArrayOfKeyValueOflongDataWarehouseOperationsUnitDimensionvLPJ3Huf> value) {
        this.referencedOperationsUnits = value;
    }

    /**
     * Obtém o valor da propriedade referencedPlannedAndActuals.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf> getReferencedPlannedAndActuals() {
        return referencedPlannedAndActuals;
    }

    /**
     * Define o valor da propriedade referencedPlannedAndActuals.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedPlannedAndActuals(JAXBElement<ArrayOfKeyValueOflongDataWarehousePlannedAndActualDimensionvLPJ3Huf> value) {
        this.referencedPlannedAndActuals = value;
    }

    /**
     * Obtém o valor da propriedade referencedPowerTakeOffExceptionRules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf> getReferencedPowerTakeOffExceptionRules() {
        return referencedPowerTakeOffExceptionRules;
    }

    /**
     * Define o valor da propriedade referencedPowerTakeOffExceptionRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedPowerTakeOffExceptionRules(JAXBElement<ArrayOfKeyValueOflongDataWarehousePowerTakeOffExceptionRuleDimensionvLPJ3Huf> value) {
        this.referencedPowerTakeOffExceptionRules = value;
    }

    /**
     * Obtém o valor da propriedade referencedRouteDescriptors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf> getReferencedRouteDescriptors() {
        return referencedRouteDescriptors;
    }

    /**
     * Define o valor da propriedade referencedRouteDescriptors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedRouteDescriptors(JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteDescriptorDimensionvLPJ3Huf> value) {
        this.referencedRouteDescriptors = value;
    }

    /**
     * Obtém o valor da propriedade referencedRouteInfos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf> getReferencedRouteInfos() {
        return referencedRouteInfos;
    }

    /**
     * Define o valor da propriedade referencedRouteInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedRouteInfos(JAXBElement<ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf> value) {
        this.referencedRouteInfos = value;
    }

    /**
     * Obtém o valor da propriedade referencedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf> getReferencedRoutes() {
        return referencedRoutes;
    }

    /**
     * Define o valor da propriedade referencedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedRoutes(JAXBElement<ArrayOfKeyValueOflongDataWarehouseRoutevLPJ3Huf> value) {
        this.referencedRoutes = value;
    }

    /**
     * Obtém o valor da propriedade referencedServiceLocationCategories.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf> getReferencedServiceLocationCategories() {
        return referencedServiceLocationCategories;
    }

    /**
     * Define o valor da propriedade referencedServiceLocationCategories.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedServiceLocationCategories(JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceLocationCategoryDimensionvLPJ3Huf> value) {
        this.referencedServiceLocationCategories = value;
    }

    /**
     * Obtém o valor da propriedade referencedServiceTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf> getReferencedServiceTypes() {
        return referencedServiceTypes;
    }

    /**
     * Define o valor da propriedade referencedServiceTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedServiceTypes(JAXBElement<ArrayOfKeyValueOflongDataWarehouseServiceTypeDimensionvLPJ3Huf> value) {
        this.referencedServiceTypes = value;
    }

    /**
     * Obtém o valor da propriedade referencedSpeedingExceptionRules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf> getReferencedSpeedingExceptionRules() {
        return referencedSpeedingExceptionRules;
    }

    /**
     * Define o valor da propriedade referencedSpeedingExceptionRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedSpeedingExceptionRules(JAXBElement<ArrayOfKeyValueOflongDataWarehouseSpeedingExceptionRuleDimensionvLPJ3Huf> value) {
        this.referencedSpeedingExceptionRules = value;
    }

    /**
     * Obtém o valor da propriedade referencedStopInfos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf> getReferencedStopInfos() {
        return referencedStopInfos;
    }

    /**
     * Define o valor da propriedade referencedStopInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedStopInfos(JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopInfoDimensionvLPJ3Huf> value) {
        this.referencedStopInfos = value;
    }

    /**
     * Obtém o valor da propriedade referencedStopTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf> getReferencedStopTypes() {
        return referencedStopTypes;
    }

    /**
     * Define o valor da propriedade referencedStopTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedStopTypes(JAXBElement<ArrayOfKeyValueOflongDataWarehouseStopTypeDimensionvLPJ3Huf> value) {
        this.referencedStopTypes = value;
    }

    /**
     * Obtém o valor da propriedade referencedTelematicsDeviceInputOutputAccessories.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf> getReferencedTelematicsDeviceInputOutputAccessories() {
        return referencedTelematicsDeviceInputOutputAccessories;
    }

    /**
     * Define o valor da propriedade referencedTelematicsDeviceInputOutputAccessories.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedTelematicsDeviceInputOutputAccessories(JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceInputOutputAccessoryDimensionvLPJ3Huf> value) {
        this.referencedTelematicsDeviceInputOutputAccessories = value;
    }

    /**
     * Obtém o valor da propriedade referencedTelematicsDevices.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf> getReferencedTelematicsDevices() {
        return referencedTelematicsDevices;
    }

    /**
     * Define o valor da propriedade referencedTelematicsDevices.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedTelematicsDevices(JAXBElement<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf> value) {
        this.referencedTelematicsDevices = value;
    }

    /**
     * Obtém o valor da propriedade referencedTemperatureExceptionRules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf> getReferencedTemperatureExceptionRules() {
        return referencedTemperatureExceptionRules;
    }

    /**
     * Define o valor da propriedade referencedTemperatureExceptionRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedTemperatureExceptionRules(JAXBElement<ArrayOfKeyValueOflongDataWarehouseTemperatureExceptionRuleDimensionvLPJ3Huf> value) {
        this.referencedTemperatureExceptionRules = value;
    }

    /**
     * Obtém o valor da propriedade referencedWorkerTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf> getReferencedWorkerTypes() {
        return referencedWorkerTypes;
    }

    /**
     * Define o valor da propriedade referencedWorkerTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedWorkerTypes(JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerTypeDimensionvLPJ3Huf> value) {
        this.referencedWorkerTypes = value;
    }

    /**
     * Obtém o valor da propriedade referencedWorkers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf> getReferencedWorkers() {
        return referencedWorkers;
    }

    /**
     * Define o valor da propriedade referencedWorkers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf }{@code >}
     *     
     */
    public void setReferencedWorkers(JAXBElement<ArrayOfKeyValueOflongDataWarehouseWorkerDimensionvLPJ3Huf> value) {
        this.referencedWorkers = value;
    }

    /**
     * Obtém o valor da propriedade results.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKpiQueryResultItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKpiQueryResultItem> getResults() {
        return results;
    }

    /**
     * Define o valor da propriedade results.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKpiQueryResultItem }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfKpiQueryResultItem> value) {
        this.results = value;
    }

}
