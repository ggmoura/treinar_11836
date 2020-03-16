
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseAtomicMeasureType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseAtomicMeasureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TravelTime"/&gt;
 *     &lt;enumeration value="TravelDistance"/&gt;
 *     &lt;enumeration value="FuelQuantity"/&gt;
 *     &lt;enumeration value="HarshBrakingCount"/&gt;
 *     &lt;enumeration value="HarshCorneringCount"/&gt;
 *     &lt;enumeration value="HarshAccelerationCount"/&gt;
 *     &lt;enumeration value="SpeedingDistance"/&gt;
 *     &lt;enumeration value="SpeedingDuration"/&gt;
 *     &lt;enumeration value="SpeedingCount"/&gt;
 *     &lt;enumeration value="StopDuration"/&gt;
 *     &lt;enumeration value="StopTimeWindowVariance"/&gt;
 *     &lt;enumeration value="CargoQuantity"/&gt;
 *     &lt;enumeration value="RouteCount"/&gt;
 *     &lt;enumeration value="StopCount"/&gt;
 *     &lt;enumeration value="ServiceWindowEarlyArrivalCount"/&gt;
 *     &lt;enumeration value="ServiceWindowLateArrivalCount"/&gt;
 *     &lt;enumeration value="ServiceWindowOnTimeArrivalCount"/&gt;
 *     &lt;enumeration value="StopTransportationCost"/&gt;
 *     &lt;enumeration value="EngineIdleTime"/&gt;
 *     &lt;enumeration value="EngineIdleCount"/&gt;
 *     &lt;enumeration value="OrderNonTransportationCost"/&gt;
 *     &lt;enumeration value="OffDayOrdersCount"/&gt;
 *     &lt;enumeration value="NetRevenue"/&gt;
 *     &lt;enumeration value="CargoExceptionsQuantity"/&gt;
 *     &lt;enumeration value="CargoCapacity"/&gt;
 *     &lt;enumeration value="RouteMaxCargoQuantity"/&gt;
 *     &lt;enumeration value="DoorStateExceptionCount"/&gt;
 *     &lt;enumeration value="DoorStateExceptionDuration"/&gt;
 *     &lt;enumeration value="TemperatureExceptionCount"/&gt;
 *     &lt;enumeration value="TemperatureExceptionDuration"/&gt;
 *     &lt;enumeration value="RouteCost"/&gt;
 *     &lt;enumeration value="RouteStartTimeVariance"/&gt;
 *     &lt;enumeration value="RouteEndTimeVariance"/&gt;
 *     &lt;enumeration value="EngineIdleFuelUsed"/&gt;
 *     &lt;enumeration value="OrderCount"/&gt;
 *     &lt;enumeration value="StopArrivalTimeVariance"/&gt;
 *     &lt;enumeration value="StopDepartureTimeVariance"/&gt;
 *     &lt;enumeration value="TravelDistanceGps"/&gt;
 *     &lt;enumeration value="TravelDistanceOdometer"/&gt;
 *     &lt;enumeration value="RouteArrivalTimeVariance"/&gt;
 *     &lt;enumeration value="RouteDepartureTimeVariance"/&gt;
 *     &lt;enumeration value="PtoMotionTime"/&gt;
 *     &lt;enumeration value="PtoStationaryTime"/&gt;
 *     &lt;enumeration value="PtoDistance"/&gt;
 *     &lt;enumeration value="PtoCount"/&gt;
 *     &lt;enumeration value="CostOfEngineIdleFuelUsed"/&gt;
 *     &lt;enumeration value="PtoMotionFuelUsed"/&gt;
 *     &lt;enumeration value="PtoStationaryFuelUsed"/&gt;
 *     &lt;enumeration value="DriveTime"/&gt;
 *     &lt;enumeration value="DriveFuelUsed"/&gt;
 *     &lt;enumeration value="MovingTime"/&gt;
 *     &lt;enumeration value="MovingFuelUsed"/&gt;
 *     &lt;enumeration value="EngineRunTime"/&gt;
 *     &lt;enumeration value="ExcessiveOverSpeedTime"/&gt;
 *     &lt;enumeration value="OverSpeedTime"/&gt;
 *     &lt;enumeration value="ExcessiveFuelUsed"/&gt;
 *     &lt;enumeration value="OverSpeedFuelUsed"/&gt;
 *     &lt;enumeration value="ParkTime"/&gt;
 *     &lt;enumeration value="ParkFuelUsed"/&gt;
 *     &lt;enumeration value="TopGearTime"/&gt;
 *     &lt;enumeration value="StopEngineRunTime"/&gt;
 *     &lt;enumeration value="TravelEngineRunTime"/&gt;
 *     &lt;enumeration value="NavRecalculationCount"/&gt;
 *     &lt;enumeration value="NavRecalculationCalculationDuration"/&gt;
 *     &lt;enumeration value="NavRecalculationRemainingDistance"/&gt;
 *     &lt;enumeration value="NavRecalculationRemainingDuration"/&gt;
 *     &lt;enumeration value="StopSequenceScore"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseAtomicMeasureType")
@XmlEnum
public enum DataWarehouseAtomicMeasureType {

    @XmlEnumValue("TravelTime")
    TRAVEL_TIME("TravelTime"),
    @XmlEnumValue("TravelDistance")
    TRAVEL_DISTANCE("TravelDistance"),
    @XmlEnumValue("FuelQuantity")
    FUEL_QUANTITY("FuelQuantity"),
    @XmlEnumValue("HarshBrakingCount")
    HARSH_BRAKING_COUNT("HarshBrakingCount"),
    @XmlEnumValue("HarshCorneringCount")
    HARSH_CORNERING_COUNT("HarshCorneringCount"),
    @XmlEnumValue("HarshAccelerationCount")
    HARSH_ACCELERATION_COUNT("HarshAccelerationCount"),
    @XmlEnumValue("SpeedingDistance")
    SPEEDING_DISTANCE("SpeedingDistance"),
    @XmlEnumValue("SpeedingDuration")
    SPEEDING_DURATION("SpeedingDuration"),
    @XmlEnumValue("SpeedingCount")
    SPEEDING_COUNT("SpeedingCount"),
    @XmlEnumValue("StopDuration")
    STOP_DURATION("StopDuration"),
    @XmlEnumValue("StopTimeWindowVariance")
    STOP_TIME_WINDOW_VARIANCE("StopTimeWindowVariance"),
    @XmlEnumValue("CargoQuantity")
    CARGO_QUANTITY("CargoQuantity"),
    @XmlEnumValue("RouteCount")
    ROUTE_COUNT("RouteCount"),
    @XmlEnumValue("StopCount")
    STOP_COUNT("StopCount"),
    @XmlEnumValue("ServiceWindowEarlyArrivalCount")
    SERVICE_WINDOW_EARLY_ARRIVAL_COUNT("ServiceWindowEarlyArrivalCount"),
    @XmlEnumValue("ServiceWindowLateArrivalCount")
    SERVICE_WINDOW_LATE_ARRIVAL_COUNT("ServiceWindowLateArrivalCount"),
    @XmlEnumValue("ServiceWindowOnTimeArrivalCount")
    SERVICE_WINDOW_ON_TIME_ARRIVAL_COUNT("ServiceWindowOnTimeArrivalCount"),
    @XmlEnumValue("StopTransportationCost")
    STOP_TRANSPORTATION_COST("StopTransportationCost"),
    @XmlEnumValue("EngineIdleTime")
    ENGINE_IDLE_TIME("EngineIdleTime"),
    @XmlEnumValue("EngineIdleCount")
    ENGINE_IDLE_COUNT("EngineIdleCount"),
    @XmlEnumValue("OrderNonTransportationCost")
    ORDER_NON_TRANSPORTATION_COST("OrderNonTransportationCost"),
    @XmlEnumValue("OffDayOrdersCount")
    OFF_DAY_ORDERS_COUNT("OffDayOrdersCount"),
    @XmlEnumValue("NetRevenue")
    NET_REVENUE("NetRevenue"),
    @XmlEnumValue("CargoExceptionsQuantity")
    CARGO_EXCEPTIONS_QUANTITY("CargoExceptionsQuantity"),
    @XmlEnumValue("CargoCapacity")
    CARGO_CAPACITY("CargoCapacity"),
    @XmlEnumValue("RouteMaxCargoQuantity")
    ROUTE_MAX_CARGO_QUANTITY("RouteMaxCargoQuantity"),
    @XmlEnumValue("DoorStateExceptionCount")
    DOOR_STATE_EXCEPTION_COUNT("DoorStateExceptionCount"),
    @XmlEnumValue("DoorStateExceptionDuration")
    DOOR_STATE_EXCEPTION_DURATION("DoorStateExceptionDuration"),
    @XmlEnumValue("TemperatureExceptionCount")
    TEMPERATURE_EXCEPTION_COUNT("TemperatureExceptionCount"),
    @XmlEnumValue("TemperatureExceptionDuration")
    TEMPERATURE_EXCEPTION_DURATION("TemperatureExceptionDuration"),
    @XmlEnumValue("RouteCost")
    ROUTE_COST("RouteCost"),
    @XmlEnumValue("RouteStartTimeVariance")
    ROUTE_START_TIME_VARIANCE("RouteStartTimeVariance"),
    @XmlEnumValue("RouteEndTimeVariance")
    ROUTE_END_TIME_VARIANCE("RouteEndTimeVariance"),
    @XmlEnumValue("EngineIdleFuelUsed")
    ENGINE_IDLE_FUEL_USED("EngineIdleFuelUsed"),
    @XmlEnumValue("OrderCount")
    ORDER_COUNT("OrderCount"),
    @XmlEnumValue("StopArrivalTimeVariance")
    STOP_ARRIVAL_TIME_VARIANCE("StopArrivalTimeVariance"),
    @XmlEnumValue("StopDepartureTimeVariance")
    STOP_DEPARTURE_TIME_VARIANCE("StopDepartureTimeVariance"),
    @XmlEnumValue("TravelDistanceGps")
    TRAVEL_DISTANCE_GPS("TravelDistanceGps"),
    @XmlEnumValue("TravelDistanceOdometer")
    TRAVEL_DISTANCE_ODOMETER("TravelDistanceOdometer"),
    @XmlEnumValue("RouteArrivalTimeVariance")
    ROUTE_ARRIVAL_TIME_VARIANCE("RouteArrivalTimeVariance"),
    @XmlEnumValue("RouteDepartureTimeVariance")
    ROUTE_DEPARTURE_TIME_VARIANCE("RouteDepartureTimeVariance"),
    @XmlEnumValue("PtoMotionTime")
    PTO_MOTION_TIME("PtoMotionTime"),
    @XmlEnumValue("PtoStationaryTime")
    PTO_STATIONARY_TIME("PtoStationaryTime"),
    @XmlEnumValue("PtoDistance")
    PTO_DISTANCE("PtoDistance"),
    @XmlEnumValue("PtoCount")
    PTO_COUNT("PtoCount"),
    @XmlEnumValue("CostOfEngineIdleFuelUsed")
    COST_OF_ENGINE_IDLE_FUEL_USED("CostOfEngineIdleFuelUsed"),
    @XmlEnumValue("PtoMotionFuelUsed")
    PTO_MOTION_FUEL_USED("PtoMotionFuelUsed"),
    @XmlEnumValue("PtoStationaryFuelUsed")
    PTO_STATIONARY_FUEL_USED("PtoStationaryFuelUsed"),
    @XmlEnumValue("DriveTime")
    DRIVE_TIME("DriveTime"),
    @XmlEnumValue("DriveFuelUsed")
    DRIVE_FUEL_USED("DriveFuelUsed"),
    @XmlEnumValue("MovingTime")
    MOVING_TIME("MovingTime"),
    @XmlEnumValue("MovingFuelUsed")
    MOVING_FUEL_USED("MovingFuelUsed"),
    @XmlEnumValue("EngineRunTime")
    ENGINE_RUN_TIME("EngineRunTime"),
    @XmlEnumValue("ExcessiveOverSpeedTime")
    EXCESSIVE_OVER_SPEED_TIME("ExcessiveOverSpeedTime"),
    @XmlEnumValue("OverSpeedTime")
    OVER_SPEED_TIME("OverSpeedTime"),
    @XmlEnumValue("ExcessiveFuelUsed")
    EXCESSIVE_FUEL_USED("ExcessiveFuelUsed"),
    @XmlEnumValue("OverSpeedFuelUsed")
    OVER_SPEED_FUEL_USED("OverSpeedFuelUsed"),
    @XmlEnumValue("ParkTime")
    PARK_TIME("ParkTime"),
    @XmlEnumValue("ParkFuelUsed")
    PARK_FUEL_USED("ParkFuelUsed"),
    @XmlEnumValue("TopGearTime")
    TOP_GEAR_TIME("TopGearTime"),
    @XmlEnumValue("StopEngineRunTime")
    STOP_ENGINE_RUN_TIME("StopEngineRunTime"),
    @XmlEnumValue("TravelEngineRunTime")
    TRAVEL_ENGINE_RUN_TIME("TravelEngineRunTime"),
    @XmlEnumValue("NavRecalculationCount")
    NAV_RECALCULATION_COUNT("NavRecalculationCount"),
    @XmlEnumValue("NavRecalculationCalculationDuration")
    NAV_RECALCULATION_CALCULATION_DURATION("NavRecalculationCalculationDuration"),
    @XmlEnumValue("NavRecalculationRemainingDistance")
    NAV_RECALCULATION_REMAINING_DISTANCE("NavRecalculationRemainingDistance"),
    @XmlEnumValue("NavRecalculationRemainingDuration")
    NAV_RECALCULATION_REMAINING_DURATION("NavRecalculationRemainingDuration"),
    @XmlEnumValue("StopSequenceScore")
    STOP_SEQUENCE_SCORE("StopSequenceScore");
    private final String value;

    DataWarehouseAtomicMeasureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseAtomicMeasureType fromValue(String v) {
        for (DataWarehouseAtomicMeasureType c: DataWarehouseAtomicMeasureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
