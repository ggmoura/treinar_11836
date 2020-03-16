
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LiquidVolumeUnit.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LiquidVolumeUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Gallons"/&gt;
 *     &lt;enumeration value="Liters"/&gt;
 *     &lt;enumeration value="ImperialGallons"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LiquidVolumeUnit")
@XmlEnum
public enum LiquidVolumeUnit {

    @XmlEnumValue("Gallons")
    GALLONS("Gallons"),
    @XmlEnumValue("Liters")
    LITERS("Liters"),
    @XmlEnumValue("ImperialGallons")
    IMPERIAL_GALLONS("ImperialGallons");
    private final String value;

    LiquidVolumeUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LiquidVolumeUnit fromValue(String v) {
        for (LiquidVolumeUnit c: LiquidVolumeUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
