
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WeightUnit.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WeightUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ounces"/&gt;
 *     &lt;enumeration value="Pounds"/&gt;
 *     &lt;enumeration value="Tons"/&gt;
 *     &lt;enumeration value="Grams"/&gt;
 *     &lt;enumeration value="Kilograms"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeightUnit")
@XmlEnum
public enum WeightUnit {

    @XmlEnumValue("Ounces")
    OUNCES("Ounces"),
    @XmlEnumValue("Pounds")
    POUNDS("Pounds"),
    @XmlEnumValue("Tons")
    TONS("Tons"),
    @XmlEnumValue("Grams")
    GRAMS("Grams"),
    @XmlEnumValue("Kilograms")
    KILOGRAMS("Kilograms");
    private final String value;

    WeightUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeightUnit fromValue(String v) {
        for (WeightUnit c: WeightUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
