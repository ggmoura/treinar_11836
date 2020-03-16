
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TemperatureUnit.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TemperatureUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Celsius"/&gt;
 *     &lt;enumeration value="Fahrenheit"/&gt;
 *     &lt;enumeration value="Kelvin"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TemperatureUnit")
@XmlEnum
public enum TemperatureUnit {

    @XmlEnumValue("Celsius")
    CELSIUS("Celsius"),
    @XmlEnumValue("Fahrenheit")
    FAHRENHEIT("Fahrenheit"),
    @XmlEnumValue("Kelvin")
    KELVIN("Kelvin");
    private final String value;

    TemperatureUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemperatureUnit fromValue(String v) {
        for (TemperatureUnit c: TemperatureUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
