
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RemoteShutdownState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RemoteShutdownState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IgnitionEnabled"/&gt;
 *     &lt;enumeration value="IgnitionDisabled"/&gt;
 *     &lt;enumeration value="IgnitionDisabledWithDerate"/&gt;
 *     &lt;enumeration value="DisableIgnitionRequested"/&gt;
 *     &lt;enumeration value="DisableIgnitionWithDerateRequested"/&gt;
 *     &lt;enumeration value="EnableIgnitionRequested"/&gt;
 *     &lt;enumeration value="DisableIgnitionWithDeratePending"/&gt;
 *     &lt;enumeration value="DisableIgnitionPending"/&gt;
 *     &lt;enumeration value="EnableIgnitionPending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RemoteShutdownState")
@XmlEnum
public enum RemoteShutdownState {

    @XmlEnumValue("IgnitionEnabled")
    IGNITION_ENABLED("IgnitionEnabled"),
    @XmlEnumValue("IgnitionDisabled")
    IGNITION_DISABLED("IgnitionDisabled"),
    @XmlEnumValue("IgnitionDisabledWithDerate")
    IGNITION_DISABLED_WITH_DERATE("IgnitionDisabledWithDerate"),
    @XmlEnumValue("DisableIgnitionRequested")
    DISABLE_IGNITION_REQUESTED("DisableIgnitionRequested"),
    @XmlEnumValue("DisableIgnitionWithDerateRequested")
    DISABLE_IGNITION_WITH_DERATE_REQUESTED("DisableIgnitionWithDerateRequested"),
    @XmlEnumValue("EnableIgnitionRequested")
    ENABLE_IGNITION_REQUESTED("EnableIgnitionRequested"),
    @XmlEnumValue("DisableIgnitionWithDeratePending")
    DISABLE_IGNITION_WITH_DERATE_PENDING("DisableIgnitionWithDeratePending"),
    @XmlEnumValue("DisableIgnitionPending")
    DISABLE_IGNITION_PENDING("DisableIgnitionPending"),
    @XmlEnumValue("EnableIgnitionPending")
    ENABLE_IGNITION_PENDING("EnableIgnitionPending");
    private final String value;

    RemoteShutdownState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemoteShutdownState fromValue(String v) {
        for (RemoteShutdownState c: RemoteShutdownState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
