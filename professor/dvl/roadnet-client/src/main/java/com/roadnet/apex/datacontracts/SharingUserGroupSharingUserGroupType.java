
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SharingUserGroup.SharingUserGroupType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SharingUserGroup.SharingUserGroupType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Regular"/&gt;
 *     &lt;enumeration value="Everyone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SharingUserGroup.SharingUserGroupType")
@XmlEnum
public enum SharingUserGroupSharingUserGroupType {

    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Everyone")
    EVERYONE("Everyone");
    private final String value;

    SharingUserGroupSharingUserGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SharingUserGroupSharingUserGroupType fromValue(String v) {
        for (SharingUserGroupSharingUserGroupType c: SharingUserGroupSharingUserGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
