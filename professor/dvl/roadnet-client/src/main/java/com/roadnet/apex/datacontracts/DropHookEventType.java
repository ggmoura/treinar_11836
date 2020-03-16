
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DropHookEventType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DropHookEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Drop"/&gt;
 *     &lt;enumeration value="Hook"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DropHookEventType")
@XmlEnum
public enum DropHookEventType {

    @XmlEnumValue("Drop")
    DROP("Drop"),
    @XmlEnumValue("Hook")
    HOOK("Hook");
    private final String value;

    DropHookEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DropHookEventType fromValue(String v) {
        for (DropHookEventType c: DropHookEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
