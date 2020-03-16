
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelematicsInputOutputAccessoryType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TelematicsInputOutputAccessoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PowerTakeOff"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelematicsInputOutputAccessoryType")
@XmlEnum
public enum TelematicsInputOutputAccessoryType {

    @XmlEnumValue("PowerTakeOff")
    POWER_TAKE_OFF("PowerTakeOff");
    private final String value;

    TelematicsInputOutputAccessoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelematicsInputOutputAccessoryType fromValue(String v) {
        for (TelematicsInputOutputAccessoryType c: TelematicsInputOutputAccessoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
