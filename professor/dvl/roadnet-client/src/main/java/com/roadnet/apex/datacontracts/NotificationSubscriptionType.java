
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NotificationSubscriptionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationSubscriptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TextMessageToDriver"/&gt;
 *     &lt;enumeration value="StopSequence"/&gt;
 *     &lt;enumeration value="RouteChange"/&gt;
 *     &lt;enumeration value="TelematicsDeviceParameterChange"/&gt;
 *     &lt;enumeration value="StopArrived"/&gt;
 *     &lt;enumeration value="StopServicing"/&gt;
 *     &lt;enumeration value="StopDeparted"/&gt;
 *     &lt;enumeration value="StopCancelled"/&gt;
 *     &lt;enumeration value="RouteStarted"/&gt;
 *     &lt;enumeration value="RouteTraveling"/&gt;
 *     &lt;enumeration value="RouteWaitingAtStop"/&gt;
 *     &lt;enumeration value="RouteServicingStop"/&gt;
 *     &lt;enumeration value="RouteAtNonServiceableStop"/&gt;
 *     &lt;enumeration value="RouteAtMidRouteDepotStop"/&gt;
 *     &lt;enumeration value="RouteArrived"/&gt;
 *     &lt;enumeration value="RouteCompleted"/&gt;
 *     &lt;enumeration value="RouteDelayed"/&gt;
 *     &lt;enumeration value="RoutePreStartDelay"/&gt;
 *     &lt;enumeration value="RoutePostStartDelay"/&gt;
 *     &lt;enumeration value="RouteAtUnknownStop"/&gt;
 *     &lt;enumeration value="RouteAtRestrictedStop"/&gt;
 *     &lt;enumeration value="RoutePhaseChange"/&gt;
 *     &lt;enumeration value="RouteAtLayoverStop"/&gt;
 *     &lt;enumeration value="TelematicsDeviceOutputChange"/&gt;
 *     &lt;enumeration value="RouteSuspended"/&gt;
 *     &lt;enumeration value="RouteStatusChange"/&gt;
 *     &lt;enumeration value="StopDeliveryDetailsUpdated"/&gt;
 *     &lt;enumeration value="InternalRoadnetTelematics"/&gt;
 *     &lt;enumeration value="WorkerLogin"/&gt;
 *     &lt;enumeration value="WorkerLogout"/&gt;
 *     &lt;enumeration value="RouteLoaded"/&gt;
 *     &lt;enumeration value="RouteDeparted"/&gt;
 *     &lt;enumeration value="RouteTender"/&gt;
 *     &lt;enumeration value="RouteOptimization"/&gt;
 *     &lt;enumeration value="InternalMilesAhead"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationSubscriptionType")
@XmlEnum
public enum NotificationSubscriptionType {

    @XmlEnumValue("TextMessageToDriver")
    TEXT_MESSAGE_TO_DRIVER("TextMessageToDriver"),
    @XmlEnumValue("StopSequence")
    STOP_SEQUENCE("StopSequence"),
    @XmlEnumValue("RouteChange")
    ROUTE_CHANGE("RouteChange"),
    @XmlEnumValue("TelematicsDeviceParameterChange")
    TELEMATICS_DEVICE_PARAMETER_CHANGE("TelematicsDeviceParameterChange"),
    @XmlEnumValue("StopArrived")
    STOP_ARRIVED("StopArrived"),
    @XmlEnumValue("StopServicing")
    STOP_SERVICING("StopServicing"),
    @XmlEnumValue("StopDeparted")
    STOP_DEPARTED("StopDeparted"),
    @XmlEnumValue("StopCancelled")
    STOP_CANCELLED("StopCancelled"),
    @XmlEnumValue("RouteStarted")
    ROUTE_STARTED("RouteStarted"),
    @XmlEnumValue("RouteTraveling")
    ROUTE_TRAVELING("RouteTraveling"),
    @XmlEnumValue("RouteWaitingAtStop")
    ROUTE_WAITING_AT_STOP("RouteWaitingAtStop"),
    @XmlEnumValue("RouteServicingStop")
    ROUTE_SERVICING_STOP("RouteServicingStop"),
    @XmlEnumValue("RouteAtNonServiceableStop")
    ROUTE_AT_NON_SERVICEABLE_STOP("RouteAtNonServiceableStop"),
    @XmlEnumValue("RouteAtMidRouteDepotStop")
    ROUTE_AT_MID_ROUTE_DEPOT_STOP("RouteAtMidRouteDepotStop"),
    @XmlEnumValue("RouteArrived")
    ROUTE_ARRIVED("RouteArrived"),
    @XmlEnumValue("RouteCompleted")
    ROUTE_COMPLETED("RouteCompleted"),
    @XmlEnumValue("RouteDelayed")
    ROUTE_DELAYED("RouteDelayed"),
    @XmlEnumValue("RoutePreStartDelay")
    ROUTE_PRE_START_DELAY("RoutePreStartDelay"),
    @XmlEnumValue("RoutePostStartDelay")
    ROUTE_POST_START_DELAY("RoutePostStartDelay"),
    @XmlEnumValue("RouteAtUnknownStop")
    ROUTE_AT_UNKNOWN_STOP("RouteAtUnknownStop"),
    @XmlEnumValue("RouteAtRestrictedStop")
    ROUTE_AT_RESTRICTED_STOP("RouteAtRestrictedStop"),
    @XmlEnumValue("RoutePhaseChange")
    ROUTE_PHASE_CHANGE("RoutePhaseChange"),
    @XmlEnumValue("RouteAtLayoverStop")
    ROUTE_AT_LAYOVER_STOP("RouteAtLayoverStop"),
    @XmlEnumValue("TelematicsDeviceOutputChange")
    TELEMATICS_DEVICE_OUTPUT_CHANGE("TelematicsDeviceOutputChange"),
    @XmlEnumValue("RouteSuspended")
    ROUTE_SUSPENDED("RouteSuspended"),
    @XmlEnumValue("RouteStatusChange")
    ROUTE_STATUS_CHANGE("RouteStatusChange"),
    @XmlEnumValue("StopDeliveryDetailsUpdated")
    STOP_DELIVERY_DETAILS_UPDATED("StopDeliveryDetailsUpdated"),
    @XmlEnumValue("InternalRoadnetTelematics")
    INTERNAL_ROADNET_TELEMATICS("InternalRoadnetTelematics"),
    @XmlEnumValue("WorkerLogin")
    WORKER_LOGIN("WorkerLogin"),
    @XmlEnumValue("WorkerLogout")
    WORKER_LOGOUT("WorkerLogout"),
    @XmlEnumValue("RouteLoaded")
    ROUTE_LOADED("RouteLoaded"),
    @XmlEnumValue("RouteDeparted")
    ROUTE_DEPARTED("RouteDeparted"),
    @XmlEnumValue("RouteTender")
    ROUTE_TENDER("RouteTender"),
    @XmlEnumValue("RouteOptimization")
    ROUTE_OPTIMIZATION("RouteOptimization"),
    @XmlEnumValue("InternalMilesAhead")
    INTERNAL_MILES_AHEAD("InternalMilesAhead");
    private final String value;

    NotificationSubscriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationSubscriptionType fromValue(String v) {
        for (NotificationSubscriptionType c: NotificationSubscriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
