
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EquipmentClassification.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentClassification"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Car"/&gt;
 *     &lt;enumeration value="Van"/&gt;
 *     &lt;enumeration value="Pickup"/&gt;
 *     &lt;enumeration value="WalkIn"/&gt;
 *     &lt;enumeration value="StraightTruck"/&gt;
 *     &lt;enumeration value="Tractor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentClassification")
@XmlEnum
public enum EquipmentClassification {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Car")
    CAR("Car"),
    @XmlEnumValue("Van")
    VAN("Van"),
    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),
    @XmlEnumValue("WalkIn")
    WALK_IN("WalkIn"),
    @XmlEnumValue("StraightTruck")
    STRAIGHT_TRUCK("StraightTruck"),
    @XmlEnumValue("Tractor")
    TRACTOR("Tractor");
    private final String value;

    EquipmentClassification(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentClassification fromValue(String v) {
        for (EquipmentClassification c: EquipmentClassification.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
