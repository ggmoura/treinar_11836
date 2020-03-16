
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.MobileComplianceCachedLoginTimeLimit.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.MobileComplianceCachedLoginTimeLimit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DurationHours0"/&gt;
 *     &lt;enumeration value="DurationHours14"/&gt;
 *     &lt;enumeration value="DurationHours24"/&gt;
 *     &lt;enumeration value="DurationHours36"/&gt;
 *     &lt;enumeration value="DurationHours48"/&gt;
 *     &lt;enumeration value="DurationHours96"/&gt;
 *     &lt;enumeration value="DurationHours168"/&gt;
 *     &lt;enumeration value="DurationHours192"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.MobileComplianceCachedLoginTimeLimit")
@XmlEnum
public enum RegionMobileComplianceCachedLoginTimeLimit {

    @XmlEnumValue("DurationHours0")
    DURATION_HOURS_0("DurationHours0"),
    @XmlEnumValue("DurationHours14")
    DURATION_HOURS_14("DurationHours14"),
    @XmlEnumValue("DurationHours24")
    DURATION_HOURS_24("DurationHours24"),
    @XmlEnumValue("DurationHours36")
    DURATION_HOURS_36("DurationHours36"),
    @XmlEnumValue("DurationHours48")
    DURATION_HOURS_48("DurationHours48"),
    @XmlEnumValue("DurationHours96")
    DURATION_HOURS_96("DurationHours96"),
    @XmlEnumValue("DurationHours168")
    DURATION_HOURS_168("DurationHours168"),
    @XmlEnumValue("DurationHours192")
    DURATION_HOURS_192("DurationHours192");
    private final String value;

    RegionMobileComplianceCachedLoginTimeLimit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionMobileComplianceCachedLoginTimeLimit fromValue(String v) {
        for (RegionMobileComplianceCachedLoginTimeLimit c: RegionMobileComplianceCachedLoginTimeLimit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
