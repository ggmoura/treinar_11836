
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NotificationType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TextMessageToDriver"/&gt;
 *     &lt;enumeration value="StopSequence"/&gt;
 *     &lt;enumeration value="RouteChange"/&gt;
 *     &lt;enumeration value="TelematicsDeviceParameterChange"/&gt;
 *     &lt;enumeration value="TelematicsDeviceOutputChange"/&gt;
 *     &lt;enumeration value="StopStateChange"/&gt;
 *     &lt;enumeration value="RouteStateChange"/&gt;
 *     &lt;enumeration value="RoutePhaseChange"/&gt;
 *     &lt;enumeration value="RouteStatusChange"/&gt;
 *     &lt;enumeration value="StopDeliveryDetailsUpdate"/&gt;
 *     &lt;enumeration value="TelematicsDeviceIgnitionKillSwitchChange"/&gt;
 *     &lt;enumeration value="TelematicsDeviceRequestReboot"/&gt;
 *     &lt;enumeration value="RequestDeviceToCheckIn"/&gt;
 *     &lt;enumeration value="WorkerLoginStateChange"/&gt;
 *     &lt;enumeration value="RouteLoaded"/&gt;
 *     &lt;enumeration value="RouteDeparted"/&gt;
 *     &lt;enumeration value="RouteTender"/&gt;
 *     &lt;enumeration value="RouteOptimization"/&gt;
 *     &lt;enumeration value="CorrespondenceSent"/&gt;
 *     &lt;enumeration value="InternalMilesAhead"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationType")
@XmlEnum
public enum NotificationType {

    @XmlEnumValue("TextMessageToDriver")
    TEXT_MESSAGE_TO_DRIVER("TextMessageToDriver"),
    @XmlEnumValue("StopSequence")
    STOP_SEQUENCE("StopSequence"),
    @XmlEnumValue("RouteChange")
    ROUTE_CHANGE("RouteChange"),
    @XmlEnumValue("TelematicsDeviceParameterChange")
    TELEMATICS_DEVICE_PARAMETER_CHANGE("TelematicsDeviceParameterChange"),
    @XmlEnumValue("TelematicsDeviceOutputChange")
    TELEMATICS_DEVICE_OUTPUT_CHANGE("TelematicsDeviceOutputChange"),
    @XmlEnumValue("StopStateChange")
    STOP_STATE_CHANGE("StopStateChange"),
    @XmlEnumValue("RouteStateChange")
    ROUTE_STATE_CHANGE("RouteStateChange"),
    @XmlEnumValue("RoutePhaseChange")
    ROUTE_PHASE_CHANGE("RoutePhaseChange"),
    @XmlEnumValue("RouteStatusChange")
    ROUTE_STATUS_CHANGE("RouteStatusChange"),
    @XmlEnumValue("StopDeliveryDetailsUpdate")
    STOP_DELIVERY_DETAILS_UPDATE("StopDeliveryDetailsUpdate"),
    @XmlEnumValue("TelematicsDeviceIgnitionKillSwitchChange")
    TELEMATICS_DEVICE_IGNITION_KILL_SWITCH_CHANGE("TelematicsDeviceIgnitionKillSwitchChange"),
    @XmlEnumValue("TelematicsDeviceRequestReboot")
    TELEMATICS_DEVICE_REQUEST_REBOOT("TelematicsDeviceRequestReboot"),
    @XmlEnumValue("RequestDeviceToCheckIn")
    REQUEST_DEVICE_TO_CHECK_IN("RequestDeviceToCheckIn"),
    @XmlEnumValue("WorkerLoginStateChange")
    WORKER_LOGIN_STATE_CHANGE("WorkerLoginStateChange"),
    @XmlEnumValue("RouteLoaded")
    ROUTE_LOADED("RouteLoaded"),
    @XmlEnumValue("RouteDeparted")
    ROUTE_DEPARTED("RouteDeparted"),
    @XmlEnumValue("RouteTender")
    ROUTE_TENDER("RouteTender"),
    @XmlEnumValue("RouteOptimization")
    ROUTE_OPTIMIZATION("RouteOptimization"),
    @XmlEnumValue("CorrespondenceSent")
    CORRESPONDENCE_SENT("CorrespondenceSent"),
    @XmlEnumValue("InternalMilesAhead")
    INTERNAL_MILES_AHEAD("InternalMilesAhead");
    private final String value;

    NotificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationType fromValue(String v) {
        for (NotificationType c: NotificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
