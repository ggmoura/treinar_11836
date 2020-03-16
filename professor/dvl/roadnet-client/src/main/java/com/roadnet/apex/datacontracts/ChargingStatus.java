
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ChargingStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargingStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="NotCharging"/&gt;
 *     &lt;enumeration value="Charging"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargingStatus")
@XmlEnum
public enum ChargingStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("NotCharging")
    NOT_CHARGING("NotCharging"),
    @XmlEnumValue("Charging")
    CHARGING("Charging"),
    @XmlEnumValue("Full")
    FULL("Full");
    private final String value;

    ChargingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargingStatus fromValue(String v) {
        for (ChargingStatus c: ChargingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
