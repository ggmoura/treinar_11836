
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.HosTimeToTriggerDToOnOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.HosTimeToTriggerDToOnOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="DurationSeconds120"/&gt;
 *     &lt;enumeration value="DurationSeconds150"/&gt;
 *     &lt;enumeration value="DurationSeconds180"/&gt;
 *     &lt;enumeration value="DurationSeconds210"/&gt;
 *     &lt;enumeration value="DurationSeconds240"/&gt;
 *     &lt;enumeration value="DurationSeconds270"/&gt;
 *     &lt;enumeration value="DurationSeconds300"/&gt;
 *     &lt;enumeration value="DurationSeconds330"/&gt;
 *     &lt;enumeration value="DurationSeconds360"/&gt;
 *     &lt;enumeration value="DurationSeconds390"/&gt;
 *     &lt;enumeration value="DurationSeconds420"/&gt;
 *     &lt;enumeration value="DurationSeconds450"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.HosTimeToTriggerDToOnOptions")
@XmlEnum
public enum RegionHosTimeToTriggerDToOnOptions {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("DurationSeconds120")
    DURATION_SECONDS_120("DurationSeconds120"),
    @XmlEnumValue("DurationSeconds150")
    DURATION_SECONDS_150("DurationSeconds150"),
    @XmlEnumValue("DurationSeconds180")
    DURATION_SECONDS_180("DurationSeconds180"),
    @XmlEnumValue("DurationSeconds210")
    DURATION_SECONDS_210("DurationSeconds210"),
    @XmlEnumValue("DurationSeconds240")
    DURATION_SECONDS_240("DurationSeconds240"),
    @XmlEnumValue("DurationSeconds270")
    DURATION_SECONDS_270("DurationSeconds270"),
    @XmlEnumValue("DurationSeconds300")
    DURATION_SECONDS_300("DurationSeconds300"),
    @XmlEnumValue("DurationSeconds330")
    DURATION_SECONDS_330("DurationSeconds330"),
    @XmlEnumValue("DurationSeconds360")
    DURATION_SECONDS_360("DurationSeconds360"),
    @XmlEnumValue("DurationSeconds390")
    DURATION_SECONDS_390("DurationSeconds390"),
    @XmlEnumValue("DurationSeconds420")
    DURATION_SECONDS_420("DurationSeconds420"),
    @XmlEnumValue("DurationSeconds450")
    DURATION_SECONDS_450("DurationSeconds450");
    private final String value;

    RegionHosTimeToTriggerDToOnOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionHosTimeToTriggerDToOnOptions fromValue(String v) {
        for (RegionHosTimeToTriggerDToOnOptions c: RegionHosTimeToTriggerDToOnOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
