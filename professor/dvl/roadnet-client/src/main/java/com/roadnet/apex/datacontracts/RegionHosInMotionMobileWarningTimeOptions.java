
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.HosInMotionMobileWarningTimeOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.HosInMotionMobileWarningTimeOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="DurationSeconds5"/&gt;
 *     &lt;enumeration value="DurationSeconds10"/&gt;
 *     &lt;enumeration value="DurationSeconds15"/&gt;
 *     &lt;enumeration value="DurationSeconds30"/&gt;
 *     &lt;enumeration value="DurationSeconds60"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.HosInMotionMobileWarningTimeOptions")
@XmlEnum
public enum RegionHosInMotionMobileWarningTimeOptions {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("DurationSeconds5")
    DURATION_SECONDS_5("DurationSeconds5"),
    @XmlEnumValue("DurationSeconds10")
    DURATION_SECONDS_10("DurationSeconds10"),
    @XmlEnumValue("DurationSeconds15")
    DURATION_SECONDS_15("DurationSeconds15"),
    @XmlEnumValue("DurationSeconds30")
    DURATION_SECONDS_30("DurationSeconds30"),
    @XmlEnumValue("DurationSeconds60")
    DURATION_SECONDS_60("DurationSeconds60");
    private final String value;

    RegionHosInMotionMobileWarningTimeOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionHosInMotionMobileWarningTimeOptions fromValue(String v) {
        for (RegionHosInMotionMobileWarningTimeOptions c: RegionHosInMotionMobileWarningTimeOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
