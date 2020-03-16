
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IgnitionKillSwitchState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IgnitionKillSwitchState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IgnitionEnabled"/&gt;
 *     &lt;enumeration value="EnableIgnitionRequested"/&gt;
 *     &lt;enumeration value="EnableIgnitionRequestReceived"/&gt;
 *     &lt;enumeration value="IgnitionDisabled"/&gt;
 *     &lt;enumeration value="DisableIgnitionRequested"/&gt;
 *     &lt;enumeration value="DisableIgnitionRequestReceived"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IgnitionKillSwitchState")
@XmlEnum
public enum IgnitionKillSwitchState {

    @XmlEnumValue("IgnitionEnabled")
    IGNITION_ENABLED("IgnitionEnabled"),
    @XmlEnumValue("EnableIgnitionRequested")
    ENABLE_IGNITION_REQUESTED("EnableIgnitionRequested"),
    @XmlEnumValue("EnableIgnitionRequestReceived")
    ENABLE_IGNITION_REQUEST_RECEIVED("EnableIgnitionRequestReceived"),
    @XmlEnumValue("IgnitionDisabled")
    IGNITION_DISABLED("IgnitionDisabled"),
    @XmlEnumValue("DisableIgnitionRequested")
    DISABLE_IGNITION_REQUESTED("DisableIgnitionRequested"),
    @XmlEnumValue("DisableIgnitionRequestReceived")
    DISABLE_IGNITION_REQUEST_RECEIVED("DisableIgnitionRequestReceived");
    private final String value;

    IgnitionKillSwitchState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IgnitionKillSwitchState fromValue(String v) {
        for (IgnitionKillSwitchState c: IgnitionKillSwitchState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
