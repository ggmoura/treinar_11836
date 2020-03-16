
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.HosPrefillCommentPermissionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.HosPrefillCommentPermissionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FreeText"/&gt;
 *     &lt;enumeration value="Prefilled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.HosPrefillCommentPermissionType")
@XmlEnum
public enum RegionHosPrefillCommentPermissionType {

    @XmlEnumValue("FreeText")
    FREE_TEXT("FreeText"),
    @XmlEnumValue("Prefilled")
    PREFILLED("Prefilled");
    private final String value;

    RegionHosPrefillCommentPermissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionHosPrefillCommentPermissionType fromValue(String v) {
        for (RegionHosPrefillCommentPermissionType c: RegionHosPrefillCommentPermissionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
