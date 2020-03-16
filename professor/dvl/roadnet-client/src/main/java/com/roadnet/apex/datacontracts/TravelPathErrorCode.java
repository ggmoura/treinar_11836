
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TravelPathErrorCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelPathErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="NoPath"/&gt;
 *     &lt;enumeration value="TimeOfDayRestrictionViolation"/&gt;
 *     &lt;enumeration value="RestrictionViolation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelPathErrorCode")
@XmlEnum
public enum TravelPathErrorCode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("NoPath")
    NO_PATH("NoPath"),
    @XmlEnumValue("TimeOfDayRestrictionViolation")
    TIME_OF_DAY_RESTRICTION_VIOLATION("TimeOfDayRestrictionViolation"),
    @XmlEnumValue("RestrictionViolation")
    RESTRICTION_VIOLATION("RestrictionViolation");
    private final String value;

    TravelPathErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelPathErrorCode fromValue(String v) {
        for (TravelPathErrorCode c: TravelPathErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
