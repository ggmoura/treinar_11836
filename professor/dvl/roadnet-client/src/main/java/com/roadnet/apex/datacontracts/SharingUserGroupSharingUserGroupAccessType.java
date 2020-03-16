
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SharingUserGroup.SharingUserGroupAccessType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SharingUserGroup.SharingUserGroupAccessType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="Public"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SharingUserGroup.SharingUserGroupAccessType")
@XmlEnum
public enum SharingUserGroupSharingUserGroupAccessType {

    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Public")
    PUBLIC("Public");
    private final String value;

    SharingUserGroupSharingUserGroupAccessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SharingUserGroupSharingUserGroupAccessType fromValue(String v) {
        for (SharingUserGroupSharingUserGroupAccessType c: SharingUserGroupSharingUserGroupAccessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
