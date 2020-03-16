
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EquipmentInspectionAssetType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentInspectionAssetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unkonwn"/&gt;
 *     &lt;enumeration value="Vehicle"/&gt;
 *     &lt;enumeration value="Trailer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentInspectionAssetType")
@XmlEnum
public enum EquipmentInspectionAssetType {

    @XmlEnumValue("Unkonwn")
    UNKONWN("Unkonwn"),
    @XmlEnumValue("Vehicle")
    VEHICLE("Vehicle"),
    @XmlEnumValue("Trailer")
    TRAILER("Trailer");
    private final String value;

    EquipmentInspectionAssetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentInspectionAssetType fromValue(String v) {
        for (EquipmentInspectionAssetType c: EquipmentInspectionAssetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
