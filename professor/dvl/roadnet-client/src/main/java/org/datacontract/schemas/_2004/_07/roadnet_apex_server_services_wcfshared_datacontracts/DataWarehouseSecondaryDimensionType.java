
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseSecondaryDimensionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseSecondaryDimensionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Worker"/&gt;
 *     &lt;enumeration value="WorkerType"/&gt;
 *     &lt;enumeration value="RouteDescriptor"/&gt;
 *     &lt;enumeration value="ServiceType"/&gt;
 *     &lt;enumeration value="CargoUnitType"/&gt;
 *     &lt;enumeration value="Location"/&gt;
 *     &lt;enumeration value="Equipment"/&gt;
 *     &lt;enumeration value="EquipmentType"/&gt;
 *     &lt;enumeration value="CargoExceptionType"/&gt;
 *     &lt;enumeration value="StopType"/&gt;
 *     &lt;enumeration value="DayOfWeek"/&gt;
 *     &lt;enumeration value="EngineIdleExceptionRule"/&gt;
 *     &lt;enumeration value="SpeedingExceptionRule"/&gt;
 *     &lt;enumeration value="EquipmentClass"/&gt;
 *     &lt;enumeration value="PlannedAndActual"/&gt;
 *     &lt;enumeration value="EquipmentManufacturer"/&gt;
 *     &lt;enumeration value="ServiceLocationCategory"/&gt;
 *     &lt;enumeration value="Account"/&gt;
 *     &lt;enumeration value="DoorStateExceptionRule"/&gt;
 *     &lt;enumeration value="TemperatureExceptionRule"/&gt;
 *     &lt;enumeration value="CostType"/&gt;
 *     &lt;enumeration value="RouteInfo"/&gt;
 *     &lt;enumeration value="StopInfo"/&gt;
 *     &lt;enumeration value="TelematicsDeviceInputOutputAccessory"/&gt;
 *     &lt;enumeration value="PowerTakeOffExceptionRule"/&gt;
 *     &lt;enumeration value="IdlingType"/&gt;
 *     &lt;enumeration value="MobileDevice"/&gt;
 *     &lt;enumeration value="TelematicsDevice"/&gt;
 *     &lt;enumeration value="NavRecalculationReason"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseSecondaryDimensionType")
@XmlEnum
public enum DataWarehouseSecondaryDimensionType {

    @XmlEnumValue("Worker")
    WORKER("Worker"),
    @XmlEnumValue("WorkerType")
    WORKER_TYPE("WorkerType"),
    @XmlEnumValue("RouteDescriptor")
    ROUTE_DESCRIPTOR("RouteDescriptor"),
    @XmlEnumValue("ServiceType")
    SERVICE_TYPE("ServiceType"),
    @XmlEnumValue("CargoUnitType")
    CARGO_UNIT_TYPE("CargoUnitType"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Equipment")
    EQUIPMENT("Equipment"),
    @XmlEnumValue("EquipmentType")
    EQUIPMENT_TYPE("EquipmentType"),
    @XmlEnumValue("CargoExceptionType")
    CARGO_EXCEPTION_TYPE("CargoExceptionType"),
    @XmlEnumValue("StopType")
    STOP_TYPE("StopType"),
    @XmlEnumValue("DayOfWeek")
    DAY_OF_WEEK("DayOfWeek"),
    @XmlEnumValue("EngineIdleExceptionRule")
    ENGINE_IDLE_EXCEPTION_RULE("EngineIdleExceptionRule"),
    @XmlEnumValue("SpeedingExceptionRule")
    SPEEDING_EXCEPTION_RULE("SpeedingExceptionRule"),
    @XmlEnumValue("EquipmentClass")
    EQUIPMENT_CLASS("EquipmentClass"),
    @XmlEnumValue("PlannedAndActual")
    PLANNED_AND_ACTUAL("PlannedAndActual"),
    @XmlEnumValue("EquipmentManufacturer")
    EQUIPMENT_MANUFACTURER("EquipmentManufacturer"),
    @XmlEnumValue("ServiceLocationCategory")
    SERVICE_LOCATION_CATEGORY("ServiceLocationCategory"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("DoorStateExceptionRule")
    DOOR_STATE_EXCEPTION_RULE("DoorStateExceptionRule"),
    @XmlEnumValue("TemperatureExceptionRule")
    TEMPERATURE_EXCEPTION_RULE("TemperatureExceptionRule"),
    @XmlEnumValue("CostType")
    COST_TYPE("CostType"),
    @XmlEnumValue("RouteInfo")
    ROUTE_INFO("RouteInfo"),
    @XmlEnumValue("StopInfo")
    STOP_INFO("StopInfo"),
    @XmlEnumValue("TelematicsDeviceInputOutputAccessory")
    TELEMATICS_DEVICE_INPUT_OUTPUT_ACCESSORY("TelematicsDeviceInputOutputAccessory"),
    @XmlEnumValue("PowerTakeOffExceptionRule")
    POWER_TAKE_OFF_EXCEPTION_RULE("PowerTakeOffExceptionRule"),
    @XmlEnumValue("IdlingType")
    IDLING_TYPE("IdlingType"),
    @XmlEnumValue("MobileDevice")
    MOBILE_DEVICE("MobileDevice"),
    @XmlEnumValue("TelematicsDevice")
    TELEMATICS_DEVICE("TelematicsDevice"),
    @XmlEnumValue("NavRecalculationReason")
    NAV_RECALCULATION_REASON("NavRecalculationReason");
    private final String value;

    DataWarehouseSecondaryDimensionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseSecondaryDimensionType fromValue(String v) {
        for (DataWarehouseSecondaryDimensionType c: DataWarehouseSecondaryDimensionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
