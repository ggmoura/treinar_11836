
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HosYardMoveTerminationOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HosYardMoveTerminationOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PowerCycle"/&gt;
 *     &lt;enumeration value="Speed"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HosYardMoveTerminationOptions")
@XmlEnum
public enum HosYardMoveTerminationOptions {

    @XmlEnumValue("PowerCycle")
    POWER_CYCLE("PowerCycle"),
    @XmlEnumValue("Speed")
    SPEED("Speed"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    HosYardMoveTerminationOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HosYardMoveTerminationOptions fromValue(String v) {
        for (HosYardMoveTerminationOptions c: HosYardMoveTerminationOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
