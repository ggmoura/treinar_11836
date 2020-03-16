
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteTenderState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteTenderState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Tendered"/&gt;
 *     &lt;enumeration value="Accepted"/&gt;
 *     &lt;enumeration value="Declined"/&gt;
 *     &lt;enumeration value="Withdrawn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RouteTenderState")
@XmlEnum
public enum RouteTenderState {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Tendered")
    TENDERED("Tendered"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn");
    private final String value;

    RouteTenderState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouteTenderState fromValue(String v) {
        for (RouteTenderState c: RouteTenderState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
