
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.RouteAlias.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.RouteAlias"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Route"/&gt;
 *     &lt;enumeration value="Trip"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.RouteAlias")
@XmlEnum
public enum RegionRouteAlias {

    @XmlEnumValue("Route")
    ROUTE("Route"),
    @XmlEnumValue("Trip")
    TRIP("Trip");
    private final String value;

    RegionRouteAlias(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionRouteAlias fromValue(String v) {
        for (RegionRouteAlias c: RegionRouteAlias.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
