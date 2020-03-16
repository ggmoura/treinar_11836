
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FlashStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FlashStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SlowFlash"/&gt;
 *     &lt;enumeration value="FastFlash"/&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *     &lt;enumeration value="Unavailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlashStatus")
@XmlEnum
public enum FlashStatus {

    @XmlEnumValue("SlowFlash")
    SLOW_FLASH("SlowFlash"),
    @XmlEnumValue("FastFlash")
    FAST_FLASH("FastFlash"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable");
    private final String value;

    FlashStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlashStatus fromValue(String v) {
        for (FlashStatus c: FlashStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
