
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LengthUnit.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LengthUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Centimeters"/&gt;
 *     &lt;enumeration value="Inches"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LengthUnit")
@XmlEnum
public enum LengthUnit {

    @XmlEnumValue("Centimeters")
    CENTIMETERS("Centimeters"),
    @XmlEnumValue("Inches")
    INCHES("Inches");
    private final String value;

    LengthUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LengthUnit fromValue(String v) {
        for (LengthUnit c: LengthUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
