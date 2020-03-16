
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SpeedBracketSet.SpeedBracketSetType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SpeedBracketSet.SpeedBracketSetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SystemCreated"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpeedBracketSet.SpeedBracketSetType")
@XmlEnum
public enum SpeedBracketSetSpeedBracketSetType {

    @XmlEnumValue("SystemCreated")
    SYSTEM_CREATED("SystemCreated"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    SpeedBracketSetSpeedBracketSetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedBracketSetSpeedBracketSetType fromValue(String v) {
        for (SpeedBracketSetSpeedBracketSetType c: SpeedBracketSetSpeedBracketSetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
