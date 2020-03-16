
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Role.RoleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Role.RoleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SystemDefinedAdmin"/&gt;
 *     &lt;enumeration value="SystemDefinedNonAdmin"/&gt;
 *     &lt;enumeration value="UserDefined"/&gt;
 *     &lt;enumeration value="SystemDefinedReadOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Role.RoleType")
@XmlEnum
public enum RoleRoleType {

    @XmlEnumValue("SystemDefinedAdmin")
    SYSTEM_DEFINED_ADMIN("SystemDefinedAdmin"),
    @XmlEnumValue("SystemDefinedNonAdmin")
    SYSTEM_DEFINED_NON_ADMIN("SystemDefinedNonAdmin"),
    @XmlEnumValue("UserDefined")
    USER_DEFINED("UserDefined"),
    @XmlEnumValue("SystemDefinedReadOnly")
    SYSTEM_DEFINED_READ_ONLY("SystemDefinedReadOnly");
    private final String value;

    RoleRoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleRoleType fromValue(String v) {
        for (RoleRoleType c: RoleRoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
