
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.RoutingSessionDay.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.RoutingSessionDay"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Same"/&gt;
 *     &lt;enumeration value="Next"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.RoutingSessionDay")
@XmlEnum
public enum RegionRoutingSessionDay {

    @XmlEnumValue("Same")
    SAME("Same"),
    @XmlEnumValue("Next")
    NEXT("Next");
    private final String value;

    RegionRoutingSessionDay(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionRoutingSessionDay fromValue(String v) {
        for (RegionRoutingSessionDay c: RegionRoutingSessionDay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
