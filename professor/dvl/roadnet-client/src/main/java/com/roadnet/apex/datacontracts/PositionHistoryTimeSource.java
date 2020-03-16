
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PositionHistoryTimeSource.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionHistoryTimeSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="System"/&gt;
 *     &lt;enumeration value="Device"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionHistoryTimeSource")
@XmlEnum
public enum PositionHistoryTimeSource {

    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Device")
    DEVICE("Device");
    private final String value;

    PositionHistoryTimeSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionHistoryTimeSource fromValue(String v) {
        for (PositionHistoryTimeSource c: PositionHistoryTimeSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
