
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResourceExceptionRuleEx.RuleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceExceptionRuleEx.RuleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OutOfBounds"/&gt;
 *     &lt;enumeration value="GPSGap"/&gt;
 *     &lt;enumeration value="NetworkSpeed"/&gt;
 *     &lt;enumeration value="NoGPS"/&gt;
 *     &lt;enumeration value="OffPlanTime"/&gt;
 *     &lt;enumeration value="OutOfContact"/&gt;
 *     &lt;enumeration value="RoutePathDev"/&gt;
 *     &lt;enumeration value="StaticSpeed"/&gt;
 *     &lt;enumeration value="UnPlannedStop"/&gt;
 *     &lt;enumeration value="StopCancel"/&gt;
 *     &lt;enumeration value="UnDeliverableStop"/&gt;
 *     &lt;enumeration value="OutOfSequence"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *     &lt;enumeration value="ServiceTimeDeviation"/&gt;
 *     &lt;enumeration value="ProjectedServiceWindowDeviation"/&gt;
 *     &lt;enumeration value="DeviceLowBattery"/&gt;
 *     &lt;enumeration value="HarshBraking"/&gt;
 *     &lt;enumeration value="HarshAcceleration"/&gt;
 *     &lt;enumeration value="HarshCornering"/&gt;
 *     &lt;enumeration value="ExcessiveIdling"/&gt;
 *     &lt;enumeration value="RestrictedLocation"/&gt;
 *     &lt;enumeration value="RestrictedEquipmentHours"/&gt;
 *     &lt;enumeration value="PotentialHOSDutyTimeViolation"/&gt;
 *     &lt;enumeration value="PotentialHOSDriveTimeViolation"/&gt;
 *     &lt;enumeration value="HOSOnDutyWithoutActivity"/&gt;
 *     &lt;enumeration value="PanicButton"/&gt;
 *     &lt;enumeration value="RemoteVehicleShutdown"/&gt;
 *     &lt;enumeration value="SeatBeltViolation"/&gt;
 *     &lt;enumeration value="DiagnosticTroubleCode"/&gt;
 *     &lt;enumeration value="DoorState"/&gt;
 *     &lt;enumeration value="Temperature"/&gt;
 *     &lt;enumeration value="NavClientSpeedViolation"/&gt;
 *     &lt;enumeration value="NavClientRoutePathDeviation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResourceExceptionRuleEx.RuleType")
@XmlEnum
public enum ResourceExceptionRuleExRuleType {

    @XmlEnumValue("OutOfBounds")
    OUT_OF_BOUNDS("OutOfBounds"),
    @XmlEnumValue("GPSGap")
    GPS_GAP("GPSGap"),
    @XmlEnumValue("NetworkSpeed")
    NETWORK_SPEED("NetworkSpeed"),
    @XmlEnumValue("NoGPS")
    NO_GPS("NoGPS"),
    @XmlEnumValue("OffPlanTime")
    OFF_PLAN_TIME("OffPlanTime"),
    @XmlEnumValue("OutOfContact")
    OUT_OF_CONTACT("OutOfContact"),
    @XmlEnumValue("RoutePathDev")
    ROUTE_PATH_DEV("RoutePathDev"),
    @XmlEnumValue("StaticSpeed")
    STATIC_SPEED("StaticSpeed"),
    @XmlEnumValue("UnPlannedStop")
    UN_PLANNED_STOP("UnPlannedStop"),
    @XmlEnumValue("StopCancel")
    STOP_CANCEL("StopCancel"),
    @XmlEnumValue("UnDeliverableStop")
    UN_DELIVERABLE_STOP("UnDeliverableStop"),
    @XmlEnumValue("OutOfSequence")
    OUT_OF_SEQUENCE("OutOfSequence"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom"),
    @XmlEnumValue("ServiceTimeDeviation")
    SERVICE_TIME_DEVIATION("ServiceTimeDeviation"),
    @XmlEnumValue("ProjectedServiceWindowDeviation")
    PROJECTED_SERVICE_WINDOW_DEVIATION("ProjectedServiceWindowDeviation"),
    @XmlEnumValue("DeviceLowBattery")
    DEVICE_LOW_BATTERY("DeviceLowBattery"),
    @XmlEnumValue("HarshBraking")
    HARSH_BRAKING("HarshBraking"),
    @XmlEnumValue("HarshAcceleration")
    HARSH_ACCELERATION("HarshAcceleration"),
    @XmlEnumValue("HarshCornering")
    HARSH_CORNERING("HarshCornering"),
    @XmlEnumValue("ExcessiveIdling")
    EXCESSIVE_IDLING("ExcessiveIdling"),
    @XmlEnumValue("RestrictedLocation")
    RESTRICTED_LOCATION("RestrictedLocation"),
    @XmlEnumValue("RestrictedEquipmentHours")
    RESTRICTED_EQUIPMENT_HOURS("RestrictedEquipmentHours"),
    @XmlEnumValue("PotentialHOSDutyTimeViolation")
    POTENTIAL_HOS_DUTY_TIME_VIOLATION("PotentialHOSDutyTimeViolation"),
    @XmlEnumValue("PotentialHOSDriveTimeViolation")
    POTENTIAL_HOS_DRIVE_TIME_VIOLATION("PotentialHOSDriveTimeViolation"),
    @XmlEnumValue("HOSOnDutyWithoutActivity")
    HOS_ON_DUTY_WITHOUT_ACTIVITY("HOSOnDutyWithoutActivity"),
    @XmlEnumValue("PanicButton")
    PANIC_BUTTON("PanicButton"),
    @XmlEnumValue("RemoteVehicleShutdown")
    REMOTE_VEHICLE_SHUTDOWN("RemoteVehicleShutdown"),
    @XmlEnumValue("SeatBeltViolation")
    SEAT_BELT_VIOLATION("SeatBeltViolation"),
    @XmlEnumValue("DiagnosticTroubleCode")
    DIAGNOSTIC_TROUBLE_CODE("DiagnosticTroubleCode"),
    @XmlEnumValue("DoorState")
    DOOR_STATE("DoorState"),
    @XmlEnumValue("Temperature")
    TEMPERATURE("Temperature"),
    @XmlEnumValue("NavClientSpeedViolation")
    NAV_CLIENT_SPEED_VIOLATION("NavClientSpeedViolation"),
    @XmlEnumValue("NavClientRoutePathDeviation")
    NAV_CLIENT_ROUTE_PATH_DEVIATION("NavClientRoutePathDeviation");
    private final String value;

    ResourceExceptionRuleExRuleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceExceptionRuleExRuleType fromValue(String v) {
        for (ResourceExceptionRuleExRuleType c: ResourceExceptionRuleExRuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
