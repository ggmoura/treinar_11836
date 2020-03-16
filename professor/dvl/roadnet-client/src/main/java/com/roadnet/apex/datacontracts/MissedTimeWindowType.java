
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MissedTimeWindowType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MissedTimeWindowType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="ServiceWindowEarly"/&gt;
 *     &lt;enumeration value="ServiceWindowLate"/&gt;
 *     &lt;enumeration value="OpenCloseEarly"/&gt;
 *     &lt;enumeration value="OpenCloseLate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MissedTimeWindowType")
@XmlEnum
public enum MissedTimeWindowType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ServiceWindowEarly")
    SERVICE_WINDOW_EARLY("ServiceWindowEarly"),
    @XmlEnumValue("ServiceWindowLate")
    SERVICE_WINDOW_LATE("ServiceWindowLate"),
    @XmlEnumValue("OpenCloseEarly")
    OPEN_CLOSE_EARLY("OpenCloseEarly"),
    @XmlEnumValue("OpenCloseLate")
    OPEN_CLOSE_LATE("OpenCloseLate");
    private final String value;

    MissedTimeWindowType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MissedTimeWindowType fromValue(String v) {
        for (MissedTimeWindowType c: MissedTimeWindowType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
