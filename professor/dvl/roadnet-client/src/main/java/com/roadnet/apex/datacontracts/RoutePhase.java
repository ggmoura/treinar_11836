
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoutePhase.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutePhase"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Schedule"/&gt;
 *     &lt;enumeration value="Plan"/&gt;
 *     &lt;enumeration value="Dispatch"/&gt;
 *     &lt;enumeration value="Archive"/&gt;
 *     &lt;enumeration value="Strategic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoutePhase")
@XmlEnum
public enum RoutePhase {

    @XmlEnumValue("Schedule")
    SCHEDULE("Schedule"),
    @XmlEnumValue("Plan")
    PLAN("Plan"),
    @XmlEnumValue("Dispatch")
    DISPATCH("Dispatch"),
    @XmlEnumValue("Archive")
    ARCHIVE("Archive"),
    @XmlEnumValue("Strategic")
    STRATEGIC("Strategic");
    private final String value;

    RoutePhase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutePhase fromValue(String v) {
        for (RoutePhase c: RoutePhase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
