
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GeocodeAccuracy.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GeocodeAccuracy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StreetExact"/&gt;
 *     &lt;enumeration value="RooftopExact"/&gt;
 *     &lt;enumeration value="StreetHigh"/&gt;
 *     &lt;enumeration value="RooftopHigh"/&gt;
 *     &lt;enumeration value="StreetMedium"/&gt;
 *     &lt;enumeration value="RooftopMedium"/&gt;
 *     &lt;enumeration value="StreetLow"/&gt;
 *     &lt;enumeration value="RooftopLow"/&gt;
 *     &lt;enumeration value="PostalDetail"/&gt;
 *     &lt;enumeration value="Postal"/&gt;
 *     &lt;enumeration value="City"/&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeocodeAccuracy")
@XmlEnum
public enum GeocodeAccuracy {

    @XmlEnumValue("StreetExact")
    STREET_EXACT("StreetExact"),
    @XmlEnumValue("RooftopExact")
    ROOFTOP_EXACT("RooftopExact"),
    @XmlEnumValue("StreetHigh")
    STREET_HIGH("StreetHigh"),
    @XmlEnumValue("RooftopHigh")
    ROOFTOP_HIGH("RooftopHigh"),
    @XmlEnumValue("StreetMedium")
    STREET_MEDIUM("StreetMedium"),
    @XmlEnumValue("RooftopMedium")
    ROOFTOP_MEDIUM("RooftopMedium"),
    @XmlEnumValue("StreetLow")
    STREET_LOW("StreetLow"),
    @XmlEnumValue("RooftopLow")
    ROOFTOP_LOW("RooftopLow"),
    @XmlEnumValue("PostalDetail")
    POSTAL_DETAIL("PostalDetail"),
    @XmlEnumValue("Postal")
    POSTAL("Postal"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    GeocodeAccuracy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeocodeAccuracy fromValue(String v) {
        for (GeocodeAccuracy c: GeocodeAccuracy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
