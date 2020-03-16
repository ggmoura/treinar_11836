
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UserType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UserType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NormalUser"/&gt;
 *     &lt;enumeration value="ServiceUser"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserType")
@XmlEnum
public enum UserType {

    @XmlEnumValue("NormalUser")
    NORMAL_USER("NormalUser"),
    @XmlEnumValue("ServiceUser")
    SERVICE_USER("ServiceUser");
    private final String value;

    UserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserType fromValue(String v) {
        for (UserType c: UserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
