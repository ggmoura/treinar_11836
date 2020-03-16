
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.HosLowOnDutyFirstWarnTimeOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.HosLowOnDutyFirstWarnTimeOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="DurationMinutes60"/&gt;
 *     &lt;enumeration value="DurationMinutes90"/&gt;
 *     &lt;enumeration value="DurationMinutes120"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.HosLowOnDutyFirstWarnTimeOptions")
@XmlEnum
public enum RegionHosLowOnDutyFirstWarnTimeOptions {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("DurationMinutes60")
    DURATION_MINUTES_60("DurationMinutes60"),
    @XmlEnumValue("DurationMinutes90")
    DURATION_MINUTES_90("DurationMinutes90"),
    @XmlEnumValue("DurationMinutes120")
    DURATION_MINUTES_120("DurationMinutes120");
    private final String value;

    RegionHosLowOnDutyFirstWarnTimeOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionHosLowOnDutyFirstWarnTimeOptions fromValue(String v) {
        for (RegionHosLowOnDutyFirstWarnTimeOptions c: RegionHosLowOnDutyFirstWarnTimeOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
