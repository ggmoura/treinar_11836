
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnStopPlacementInfo.OnStopPlacementStopType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OnStopPlacementInfo.OnStopPlacementStopType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="ServiceableStop"/&gt;
 *     &lt;enumeration value="NonServiceableStop"/&gt;
 *     &lt;enumeration value="MidRouteDepotStop"/&gt;
 *     &lt;enumeration value="RestrictedStop"/&gt;
 *     &lt;enumeration value="RouteDelayStop"/&gt;
 *     &lt;enumeration value="UnknownStop"/&gt;
 *     &lt;enumeration value="DiversionStop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnStopPlacementInfo.OnStopPlacementStopType")
@XmlEnum
public enum OnStopPlacementInfoOnStopPlacementStopType {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("ServiceableStop")
    SERVICEABLE_STOP("ServiceableStop"),
    @XmlEnumValue("NonServiceableStop")
    NON_SERVICEABLE_STOP("NonServiceableStop"),
    @XmlEnumValue("MidRouteDepotStop")
    MID_ROUTE_DEPOT_STOP("MidRouteDepotStop"),
    @XmlEnumValue("RestrictedStop")
    RESTRICTED_STOP("RestrictedStop"),
    @XmlEnumValue("RouteDelayStop")
    ROUTE_DELAY_STOP("RouteDelayStop"),
    @XmlEnumValue("UnknownStop")
    UNKNOWN_STOP("UnknownStop"),
    @XmlEnumValue("DiversionStop")
    DIVERSION_STOP("DiversionStop");
    private final String value;

    OnStopPlacementInfoOnStopPlacementStopType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnStopPlacementInfoOnStopPlacementStopType fromValue(String v) {
        for (OnStopPlacementInfoOnStopPlacementStopType c: OnStopPlacementInfoOnStopPlacementStopType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
