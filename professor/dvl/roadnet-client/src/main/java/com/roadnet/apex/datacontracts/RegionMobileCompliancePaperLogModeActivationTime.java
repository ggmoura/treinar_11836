
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.MobileCompliancePaperLogModeActivationTime.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.MobileCompliancePaperLogModeActivationTime"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="DurationMinutes5"/&gt;
 *     &lt;enumeration value="DurationMinutes10"/&gt;
 *     &lt;enumeration value="DurationMinutes15"/&gt;
 *     &lt;enumeration value="DurationMinutes20"/&gt;
 *     &lt;enumeration value="DurationMinutes30"/&gt;
 *     &lt;enumeration value="DurationMinutes60"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.MobileCompliancePaperLogModeActivationTime")
@XmlEnum
public enum RegionMobileCompliancePaperLogModeActivationTime {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("DurationMinutes5")
    DURATION_MINUTES_5("DurationMinutes5"),
    @XmlEnumValue("DurationMinutes10")
    DURATION_MINUTES_10("DurationMinutes10"),
    @XmlEnumValue("DurationMinutes15")
    DURATION_MINUTES_15("DurationMinutes15"),
    @XmlEnumValue("DurationMinutes20")
    DURATION_MINUTES_20("DurationMinutes20"),
    @XmlEnumValue("DurationMinutes30")
    DURATION_MINUTES_30("DurationMinutes30"),
    @XmlEnumValue("DurationMinutes60")
    DURATION_MINUTES_60("DurationMinutes60");
    private final String value;

    RegionMobileCompliancePaperLogModeActivationTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionMobileCompliancePaperLogModeActivationTime fromValue(String v) {
        for (RegionMobileCompliancePaperLogModeActivationTime c: RegionMobileCompliancePaperLogModeActivationTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
