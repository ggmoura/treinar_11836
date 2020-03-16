
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GeocodeMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GeocodeMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GeocoderAuto"/&gt;
 *     &lt;enumeration value="GeocoderInteractive"/&gt;
 *     &lt;enumeration value="GPS"/&gt;
 *     &lt;enumeration value="UserSupplied"/&gt;
 *     &lt;enumeration value="UserInteractive"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeocodeMethod")
@XmlEnum
public enum GeocodeMethod {

    @XmlEnumValue("GeocoderAuto")
    GEOCODER_AUTO("GeocoderAuto"),
    @XmlEnumValue("GeocoderInteractive")
    GEOCODER_INTERACTIVE("GeocoderInteractive"),
    GPS("GPS"),
    @XmlEnumValue("UserSupplied")
    USER_SUPPLIED("UserSupplied"),
    @XmlEnumValue("UserInteractive")
    USER_INTERACTIVE("UserInteractive"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    GeocodeMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeocodeMethod fromValue(String v) {
        for (GeocodeMethod c: GeocodeMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
