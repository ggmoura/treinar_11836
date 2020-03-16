
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.HosShortHaulWarnDistanceOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.HosShortHaulWarnDistanceOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="DistanceMiles5"/&gt;
 *     &lt;enumeration value="DistanceMiles10"/&gt;
 *     &lt;enumeration value="DistanceMiles15"/&gt;
 *     &lt;enumeration value="DistanceMiles20"/&gt;
 *     &lt;enumeration value="DistanceMiles25"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.HosShortHaulWarnDistanceOptions")
@XmlEnum
public enum RegionHosShortHaulWarnDistanceOptions {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("DistanceMiles5")
    DISTANCE_MILES_5("DistanceMiles5"),
    @XmlEnumValue("DistanceMiles10")
    DISTANCE_MILES_10("DistanceMiles10"),
    @XmlEnumValue("DistanceMiles15")
    DISTANCE_MILES_15("DistanceMiles15"),
    @XmlEnumValue("DistanceMiles20")
    DISTANCE_MILES_20("DistanceMiles20"),
    @XmlEnumValue("DistanceMiles25")
    DISTANCE_MILES_25("DistanceMiles25");
    private final String value;

    RegionHosShortHaulWarnDistanceOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionHosShortHaulWarnDistanceOptions fromValue(String v) {
        for (RegionHosShortHaulWarnDistanceOptions c: RegionHosShortHaulWarnDistanceOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
