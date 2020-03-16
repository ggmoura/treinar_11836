
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.HosLowOnDutySecondWarnTimeOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.HosLowOnDutySecondWarnTimeOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="DurationMinutes5"/&gt;
 *     &lt;enumeration value="DurationMinutes10"/&gt;
 *     &lt;enumeration value="DurationMinutes15"/&gt;
 *     &lt;enumeration value="DurationMinutes30"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.HosLowOnDutySecondWarnTimeOptions")
@XmlEnum
public enum RegionHosLowOnDutySecondWarnTimeOptions {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("DurationMinutes5")
    DURATION_MINUTES_5("DurationMinutes5"),
    @XmlEnumValue("DurationMinutes10")
    DURATION_MINUTES_10("DurationMinutes10"),
    @XmlEnumValue("DurationMinutes15")
    DURATION_MINUTES_15("DurationMinutes15"),
    @XmlEnumValue("DurationMinutes30")
    DURATION_MINUTES_30("DurationMinutes30");
    private final String value;

    RegionHosLowOnDutySecondWarnTimeOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionHosLowOnDutySecondWarnTimeOptions fromValue(String v) {
        for (RegionHosLowOnDutySecondWarnTimeOptions c: RegionHosLowOnDutySecondWarnTimeOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
