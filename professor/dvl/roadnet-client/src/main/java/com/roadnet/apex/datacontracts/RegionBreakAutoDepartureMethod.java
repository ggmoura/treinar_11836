
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.BreakAutoDepartureMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.BreakAutoDepartureMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="ProjectedTime"/&gt;
 *     &lt;enumeration value="GPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.BreakAutoDepartureMethod")
@XmlEnum
public enum RegionBreakAutoDepartureMethod {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("ProjectedTime")
    PROJECTED_TIME("ProjectedTime"),
    GPS("GPS");
    private final String value;

    RegionBreakAutoDepartureMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionBreakAutoDepartureMethod fromValue(String v) {
        for (RegionBreakAutoDepartureMethod c: RegionBreakAutoDepartureMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
