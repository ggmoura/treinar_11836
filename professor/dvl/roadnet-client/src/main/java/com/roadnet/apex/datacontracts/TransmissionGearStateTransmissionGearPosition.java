
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransmissionGearState.TransmissionGearPosition.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransmissionGearState.TransmissionGearPosition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Reverse"/&gt;
 *     &lt;enumeration value="Park"/&gt;
 *     &lt;enumeration value="Neutral"/&gt;
 *     &lt;enumeration value="Drive"/&gt;
 *     &lt;enumeration value="SpecificGear"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransmissionGearState.TransmissionGearPosition")
@XmlEnum
public enum TransmissionGearStateTransmissionGearPosition {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Reverse")
    REVERSE("Reverse"),
    @XmlEnumValue("Park")
    PARK("Park"),
    @XmlEnumValue("Neutral")
    NEUTRAL("Neutral"),
    @XmlEnumValue("Drive")
    DRIVE("Drive"),
    @XmlEnumValue("SpecificGear")
    SPECIFIC_GEAR("SpecificGear");
    private final String value;

    TransmissionGearStateTransmissionGearPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransmissionGearStateTransmissionGearPosition fromValue(String v) {
        for (TransmissionGearStateTransmissionGearPosition c: TransmissionGearStateTransmissionGearPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
