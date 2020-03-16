
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NonServiceableStopType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NonServiceableStopType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Break"/&gt;
 *     &lt;enumeration value="Layover"/&gt;
 *     &lt;enumeration value="Delay"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonServiceableStopType")
@XmlEnum
public enum NonServiceableStopType {

    @XmlEnumValue("Break")
    BREAK("Break"),
    @XmlEnumValue("Layover")
    LAYOVER("Layover"),
    @XmlEnumValue("Delay")
    DELAY("Delay"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    NonServiceableStopType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonServiceableStopType fromValue(String v) {
        for (NonServiceableStopType c: NonServiceableStopType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
