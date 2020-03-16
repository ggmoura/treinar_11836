
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Started"/&gt;
 *     &lt;enumeration value="Traveling"/&gt;
 *     &lt;enumeration value="WaitingAtStop"/&gt;
 *     &lt;enumeration value="ServicingStop"/&gt;
 *     &lt;enumeration value="AtNonServiceableStop"/&gt;
 *     &lt;enumeration value="AtMidRouteDepotStop"/&gt;
 *     &lt;enumeration value="Arrived"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="Delayed"/&gt;
 *     &lt;enumeration value="PreStartDelay"/&gt;
 *     &lt;enumeration value="PostStartDelay"/&gt;
 *     &lt;enumeration value="AtUnknownStop"/&gt;
 *     &lt;enumeration value="AtRestrictedStop"/&gt;
 *     &lt;enumeration value="AtLayoverStop"/&gt;
 *     &lt;enumeration value="Suspended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RouteState")
@XmlEnum
public enum RouteState {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Started")
    STARTED("Started"),
    @XmlEnumValue("Traveling")
    TRAVELING("Traveling"),
    @XmlEnumValue("WaitingAtStop")
    WAITING_AT_STOP("WaitingAtStop"),
    @XmlEnumValue("ServicingStop")
    SERVICING_STOP("ServicingStop"),
    @XmlEnumValue("AtNonServiceableStop")
    AT_NON_SERVICEABLE_STOP("AtNonServiceableStop"),
    @XmlEnumValue("AtMidRouteDepotStop")
    AT_MID_ROUTE_DEPOT_STOP("AtMidRouteDepotStop"),
    @XmlEnumValue("Arrived")
    ARRIVED("Arrived"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Delayed")
    DELAYED("Delayed"),
    @XmlEnumValue("PreStartDelay")
    PRE_START_DELAY("PreStartDelay"),
    @XmlEnumValue("PostStartDelay")
    POST_START_DELAY("PostStartDelay"),
    @XmlEnumValue("AtUnknownStop")
    AT_UNKNOWN_STOP("AtUnknownStop"),
    @XmlEnumValue("AtRestrictedStop")
    AT_RESTRICTED_STOP("AtRestrictedStop"),
    @XmlEnumValue("AtLayoverStop")
    AT_LAYOVER_STOP("AtLayoverStop"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended");
    private final String value;

    RouteState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouteState fromValue(String v) {
        for (RouteState c: RouteState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
