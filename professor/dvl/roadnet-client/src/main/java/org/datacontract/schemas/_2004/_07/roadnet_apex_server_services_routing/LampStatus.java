
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LampStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LampStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Off"/&gt;
 *     &lt;enumeration value="On"/&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LampStatus")
@XmlEnum
public enum LampStatus {

    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved");
    private final String value;

    LampStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LampStatus fromValue(String v) {
        for (LampStatus c: LampStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
