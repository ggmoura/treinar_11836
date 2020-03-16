
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AllowDisallow.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AllowDisallow"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disallowed"/&gt;
 *     &lt;enumeration value="Allowed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AllowDisallow")
@XmlEnum
public enum AllowDisallow {

    @XmlEnumValue("Disallowed")
    DISALLOWED("Disallowed"),
    @XmlEnumValue("Allowed")
    ALLOWED("Allowed");
    private final String value;

    AllowDisallow(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllowDisallow fromValue(String v) {
        for (AllowDisallow c: AllowDisallow.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
