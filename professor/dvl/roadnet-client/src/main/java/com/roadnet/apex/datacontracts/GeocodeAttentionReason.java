
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GeocodeAttentionReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GeocodeAttentionReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Ambiguous"/&gt;
 *     &lt;enumeration value="Threshold"/&gt;
 *     &lt;enumeration value="MissingFields"/&gt;
 *     &lt;enumeration value="NoMatches"/&gt;
 *     &lt;enumeration value="GeocodeError"/&gt;
 *     &lt;enumeration value="CountryNotSupported"/&gt;
 *     &lt;enumeration value="CountryNotFound"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeocodeAttentionReason")
@XmlEnum
public enum GeocodeAttentionReason {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Ambiguous")
    AMBIGUOUS("Ambiguous"),
    @XmlEnumValue("Threshold")
    THRESHOLD("Threshold"),
    @XmlEnumValue("MissingFields")
    MISSING_FIELDS("MissingFields"),
    @XmlEnumValue("NoMatches")
    NO_MATCHES("NoMatches"),
    @XmlEnumValue("GeocodeError")
    GEOCODE_ERROR("GeocodeError"),
    @XmlEnumValue("CountryNotSupported")
    COUNTRY_NOT_SUPPORTED("CountryNotSupported"),
    @XmlEnumValue("CountryNotFound")
    COUNTRY_NOT_FOUND("CountryNotFound");
    private final String value;

    GeocodeAttentionReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeocodeAttentionReason fromValue(String v) {
        for (GeocodeAttentionReason c: GeocodeAttentionReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
