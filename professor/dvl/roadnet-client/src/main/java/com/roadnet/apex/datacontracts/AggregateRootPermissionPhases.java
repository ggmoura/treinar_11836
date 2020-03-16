
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AggregateRootPermission.Phases.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AggregateRootPermission.Phases"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All_Phases"/&gt;
 *     &lt;enumeration value="Route_Plan"/&gt;
 *     &lt;enumeration value="Route_Archive"/&gt;
 *     &lt;enumeration value="Route_Dispatch"/&gt;
 *     &lt;enumeration value="Route_Schedule"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AggregateRootPermission.Phases")
@XmlEnum
public enum AggregateRootPermissionPhases {

    @XmlEnumValue("All_Phases")
    ALL_PHASES("All_Phases"),
    @XmlEnumValue("Route_Plan")
    ROUTE_PLAN("Route_Plan"),
    @XmlEnumValue("Route_Archive")
    ROUTE_ARCHIVE("Route_Archive"),
    @XmlEnumValue("Route_Dispatch")
    ROUTE_DISPATCH("Route_Dispatch"),
    @XmlEnumValue("Route_Schedule")
    ROUTE_SCHEDULE("Route_Schedule");
    private final String value;

    AggregateRootPermissionPhases(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AggregateRootPermissionPhases fromValue(String v) {
        for (AggregateRootPermissionPhases c: AggregateRootPermissionPhases.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
