
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessUnit.RoundToNearest.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessUnit.RoundToNearest"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Minute"/&gt;
 *     &lt;enumeration value="FiveMinutes"/&gt;
 *     &lt;enumeration value="QuarterHour"/&gt;
 *     &lt;enumeration value="HalfHour"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessUnit.RoundToNearest")
@XmlEnum
public enum BusinessUnitRoundToNearest {

    @XmlEnumValue("Minute")
    MINUTE("Minute"),
    @XmlEnumValue("FiveMinutes")
    FIVE_MINUTES("FiveMinutes"),
    @XmlEnumValue("QuarterHour")
    QUARTER_HOUR("QuarterHour"),
    @XmlEnumValue("HalfHour")
    HALF_HOUR("HalfHour");
    private final String value;

    BusinessUnitRoundToNearest(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessUnitRoundToNearest fromValue(String v) {
        for (BusinessUnitRoundToNearest c: BusinessUnitRoundToNearest.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
