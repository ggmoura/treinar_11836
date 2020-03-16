
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SpeedUnit.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SpeedUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KilometersPerHour"/&gt;
 *     &lt;enumeration value="MilesPerHour"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpeedUnit")
@XmlEnum
public enum SpeedUnit {

    @XmlEnumValue("KilometersPerHour")
    KILOMETERS_PER_HOUR("KilometersPerHour"),
    @XmlEnumValue("MilesPerHour")
    MILES_PER_HOUR("MilesPerHour");
    private final String value;

    SpeedUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedUnit fromValue(String v) {
        for (SpeedUnit c: SpeedUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
