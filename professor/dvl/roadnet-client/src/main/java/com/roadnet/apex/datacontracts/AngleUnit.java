
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AngleUnit.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AngleUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Radians"/&gt;
 *     &lt;enumeration value="Degrees"/&gt;
 *     &lt;enumeration value="Revolutions"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AngleUnit")
@XmlEnum
public enum AngleUnit {

    @XmlEnumValue("Radians")
    RADIANS("Radians"),
    @XmlEnumValue("Degrees")
    DEGREES("Degrees"),
    @XmlEnumValue("Revolutions")
    REVOLUTIONS("Revolutions");
    private final String value;

    AngleUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AngleUnit fromValue(String v) {
        for (AngleUnit c: AngleUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
