
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NotificationMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *     &lt;enumeration value="Voice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationMethod")
@XmlEnum
public enum NotificationMethod {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    SMS("SMS"),
    @XmlEnumValue("Voice")
    VOICE("Voice");
    private final String value;

    NotificationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationMethod fromValue(String v) {
        for (NotificationMethod c: NotificationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
