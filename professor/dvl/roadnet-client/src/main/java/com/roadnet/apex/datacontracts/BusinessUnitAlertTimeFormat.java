
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessUnit.AlertTimeFormat.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessUnit.AlertTimeFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TwelveHour"/&gt;
 *     &lt;enumeration value="TwentyFourHour"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessUnit.AlertTimeFormat")
@XmlEnum
public enum BusinessUnitAlertTimeFormat {

    @XmlEnumValue("TwelveHour")
    TWELVE_HOUR("TwelveHour"),
    @XmlEnumValue("TwentyFourHour")
    TWENTY_FOUR_HOUR("TwentyFourHour");
    private final String value;

    BusinessUnitAlertTimeFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessUnitAlertTimeFormat fromValue(String v) {
        for (BusinessUnitAlertTimeFormat c: BusinessUnitAlertTimeFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
