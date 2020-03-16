
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VerificationLocationType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Origin"/&gt;
 *     &lt;enumeration value="Stop"/&gt;
 *     &lt;enumeration value="MidrouteDepot"/&gt;
 *     &lt;enumeration value="Destination"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerificationLocationType")
@XmlEnum
public enum VerificationLocationType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Origin")
    ORIGIN("Origin"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("MidrouteDepot")
    MIDROUTE_DEPOT("MidrouteDepot"),
    @XmlEnumValue("Destination")
    DESTINATION("Destination");
    private final String value;

    VerificationLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerificationLocationType fromValue(String v) {
        for (VerificationLocationType c: VerificationLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
