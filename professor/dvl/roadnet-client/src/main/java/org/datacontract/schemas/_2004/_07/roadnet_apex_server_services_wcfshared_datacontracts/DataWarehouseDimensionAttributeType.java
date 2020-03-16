
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseDimensionAttributeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseDimensionAttributeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EquipmentDimension_Model"/&gt;
 *     &lt;enumeration value="EquipmentDimension_ModelYear"/&gt;
 *     &lt;enumeration value="LocationDimension_LocationType"/&gt;
 *     &lt;enumeration value="RouteInfoDimension_PlannedAndActual"/&gt;
 *     &lt;enumeration value="RouteInfoDimension_RouteEndTimeVarianceType"/&gt;
 *     &lt;enumeration value="RouteInfoDimension_RouteStartTimeVarianceType"/&gt;
 *     &lt;enumeration value="StopInfoDimension_Type"/&gt;
 *     &lt;enumeration value="StopInfoDimension_ArrivalVarianceType"/&gt;
 *     &lt;enumeration value="StopInfoDimension_DepartureVarianceType"/&gt;
 *     &lt;enumeration value="StopInfoDimension_ExecutionType"/&gt;
 *     &lt;enumeration value="StopInfoDimension_ServicedDuringOffDay"/&gt;
 *     &lt;enumeration value="StopInfoDimension_PlannedTimeWindowVarianceType"/&gt;
 *     &lt;enumeration value="StopInfoDimension_ActualTimeWindowVarianceType"/&gt;
 *     &lt;enumeration value="RouteInfoDimension_RouteArrivalTimeVarianceType"/&gt;
 *     &lt;enumeration value="RouteInfoDimension_RouteDepartureTimeVarianceType"/&gt;
 *     &lt;enumeration value="RouteInfoDimension_CeaseDispatchUsed"/&gt;
 *     &lt;enumeration value="RouteInfoDimension_RouteDataTransferUsed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseDimensionAttributeType")
@XmlEnum
public enum DataWarehouseDimensionAttributeType {

    @XmlEnumValue("EquipmentDimension_Model")
    EQUIPMENT_DIMENSION_MODEL("EquipmentDimension_Model"),
    @XmlEnumValue("EquipmentDimension_ModelYear")
    EQUIPMENT_DIMENSION_MODEL_YEAR("EquipmentDimension_ModelYear"),
    @XmlEnumValue("LocationDimension_LocationType")
    LOCATION_DIMENSION_LOCATION_TYPE("LocationDimension_LocationType"),
    @XmlEnumValue("RouteInfoDimension_PlannedAndActual")
    ROUTE_INFO_DIMENSION_PLANNED_AND_ACTUAL("RouteInfoDimension_PlannedAndActual"),
    @XmlEnumValue("RouteInfoDimension_RouteEndTimeVarianceType")
    ROUTE_INFO_DIMENSION_ROUTE_END_TIME_VARIANCE_TYPE("RouteInfoDimension_RouteEndTimeVarianceType"),
    @XmlEnumValue("RouteInfoDimension_RouteStartTimeVarianceType")
    ROUTE_INFO_DIMENSION_ROUTE_START_TIME_VARIANCE_TYPE("RouteInfoDimension_RouteStartTimeVarianceType"),
    @XmlEnumValue("StopInfoDimension_Type")
    STOP_INFO_DIMENSION_TYPE("StopInfoDimension_Type"),
    @XmlEnumValue("StopInfoDimension_ArrivalVarianceType")
    STOP_INFO_DIMENSION_ARRIVAL_VARIANCE_TYPE("StopInfoDimension_ArrivalVarianceType"),
    @XmlEnumValue("StopInfoDimension_DepartureVarianceType")
    STOP_INFO_DIMENSION_DEPARTURE_VARIANCE_TYPE("StopInfoDimension_DepartureVarianceType"),
    @XmlEnumValue("StopInfoDimension_ExecutionType")
    STOP_INFO_DIMENSION_EXECUTION_TYPE("StopInfoDimension_ExecutionType"),
    @XmlEnumValue("StopInfoDimension_ServicedDuringOffDay")
    STOP_INFO_DIMENSION_SERVICED_DURING_OFF_DAY("StopInfoDimension_ServicedDuringOffDay"),
    @XmlEnumValue("StopInfoDimension_PlannedTimeWindowVarianceType")
    STOP_INFO_DIMENSION_PLANNED_TIME_WINDOW_VARIANCE_TYPE("StopInfoDimension_PlannedTimeWindowVarianceType"),
    @XmlEnumValue("StopInfoDimension_ActualTimeWindowVarianceType")
    STOP_INFO_DIMENSION_ACTUAL_TIME_WINDOW_VARIANCE_TYPE("StopInfoDimension_ActualTimeWindowVarianceType"),
    @XmlEnumValue("RouteInfoDimension_RouteArrivalTimeVarianceType")
    ROUTE_INFO_DIMENSION_ROUTE_ARRIVAL_TIME_VARIANCE_TYPE("RouteInfoDimension_RouteArrivalTimeVarianceType"),
    @XmlEnumValue("RouteInfoDimension_RouteDepartureTimeVarianceType")
    ROUTE_INFO_DIMENSION_ROUTE_DEPARTURE_TIME_VARIANCE_TYPE("RouteInfoDimension_RouteDepartureTimeVarianceType"),
    @XmlEnumValue("RouteInfoDimension_CeaseDispatchUsed")
    ROUTE_INFO_DIMENSION_CEASE_DISPATCH_USED("RouteInfoDimension_CeaseDispatchUsed"),
    @XmlEnumValue("RouteInfoDimension_RouteDataTransferUsed")
    ROUTE_INFO_DIMENSION_ROUTE_DATA_TRANSFER_USED("RouteInfoDimension_RouteDataTransferUsed");
    private final String value;

    DataWarehouseDimensionAttributeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseDimensionAttributeType fromValue(String v) {
        for (DataWarehouseDimensionAttributeType c: DataWarehouseDimensionAttributeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
