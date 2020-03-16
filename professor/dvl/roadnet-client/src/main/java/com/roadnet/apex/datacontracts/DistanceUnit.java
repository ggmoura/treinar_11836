
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DistanceUnit.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DistanceUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Miles"/&gt;
 *     &lt;enumeration value="Kilometers"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistanceUnit")
@XmlEnum
public enum DistanceUnit {

    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("Kilometers")
    KILOMETERS("Kilometers");
    private final String value;

    DistanceUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistanceUnit fromValue(String v) {
        for (DistanceUnit c: DistanceUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
