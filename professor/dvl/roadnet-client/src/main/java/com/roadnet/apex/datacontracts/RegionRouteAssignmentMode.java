
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.RouteAssignmentMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.RouteAssignmentMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QueryByEquipment"/&gt;
 *     &lt;enumeration value="QueryByWorker"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.RouteAssignmentMode")
@XmlEnum
public enum RegionRouteAssignmentMode {

    @XmlEnumValue("QueryByEquipment")
    QUERY_BY_EQUIPMENT("QueryByEquipment"),
    @XmlEnumValue("QueryByWorker")
    QUERY_BY_WORKER("QueryByWorker"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    RegionRouteAssignmentMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionRouteAssignmentMode fromValue(String v) {
        for (RegionRouteAssignmentMode c: RegionRouteAssignmentMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
