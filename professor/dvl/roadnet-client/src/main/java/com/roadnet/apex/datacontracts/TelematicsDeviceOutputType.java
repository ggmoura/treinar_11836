
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelematicsDeviceOutputType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TelematicsDeviceOutputType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotAssigned"/&gt;
 *     &lt;enumeration value="IgnitionKillSwitch"/&gt;
 *     &lt;enumeration value="EngineDeratingDevice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelematicsDeviceOutputType")
@XmlEnum
public enum TelematicsDeviceOutputType {

    @XmlEnumValue("NotAssigned")
    NOT_ASSIGNED("NotAssigned"),
    @XmlEnumValue("IgnitionKillSwitch")
    IGNITION_KILL_SWITCH("IgnitionKillSwitch"),
    @XmlEnumValue("EngineDeratingDevice")
    ENGINE_DERATING_DEVICE("EngineDeratingDevice");
    private final String value;

    TelematicsDeviceOutputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelematicsDeviceOutputType fromValue(String v) {
        for (TelematicsDeviceOutputType c: TelematicsDeviceOutputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
