
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StationaryTriggerType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StationaryTriggerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GPS"/&gt;
 *     &lt;enumeration value="IgnitionOff"/&gt;
 *     &lt;enumeration value="Device"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StationaryTriggerType")
@XmlEnum
public enum StationaryTriggerType {

    GPS("GPS"),
    @XmlEnumValue("IgnitionOff")
    IGNITION_OFF("IgnitionOff"),
    @XmlEnumValue("Device")
    DEVICE("Device");
    private final String value;

    StationaryTriggerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StationaryTriggerType fromValue(String v) {
        for (StationaryTriggerType c: StationaryTriggerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
