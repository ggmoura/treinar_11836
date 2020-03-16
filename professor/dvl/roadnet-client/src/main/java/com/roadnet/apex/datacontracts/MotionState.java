
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MotionState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MotionState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Stopped"/&gt;
 *     &lt;enumeration value="Idling"/&gt;
 *     &lt;enumeration value="InMotion"/&gt;
 *     &lt;enumeration value="IndeterminateStationary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MotionState")
@XmlEnum
public enum MotionState {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Stopped")
    STOPPED("Stopped"),
    @XmlEnumValue("Idling")
    IDLING("Idling"),
    @XmlEnumValue("InMotion")
    IN_MOTION("InMotion"),
    @XmlEnumValue("IndeterminateStationary")
    INDETERMINATE_STATIONARY("IndeterminateStationary");
    private final String value;

    MotionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MotionState fromValue(String v) {
        for (MotionState c: MotionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
