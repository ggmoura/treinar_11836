
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FuelEconomyUnit.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FuelEconomyUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MilesPerGallon"/&gt;
 *     &lt;enumeration value="LitersPerHundredKilometers"/&gt;
 *     &lt;enumeration value="ImperialMilesPerGallon"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FuelEconomyUnit")
@XmlEnum
public enum FuelEconomyUnit {

    @XmlEnumValue("MilesPerGallon")
    MILES_PER_GALLON("MilesPerGallon"),
    @XmlEnumValue("LitersPerHundredKilometers")
    LITERS_PER_HUNDRED_KILOMETERS("LitersPerHundredKilometers"),
    @XmlEnumValue("ImperialMilesPerGallon")
    IMPERIAL_MILES_PER_GALLON("ImperialMilesPerGallon");
    private final String value;

    FuelEconomyUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelEconomyUnit fromValue(String v) {
        for (FuelEconomyUnit c: FuelEconomyUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
