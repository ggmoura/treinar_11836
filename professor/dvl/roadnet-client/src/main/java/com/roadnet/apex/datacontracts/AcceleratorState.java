
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AcceleratorState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AcceleratorState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AcceleratorEnabled"/&gt;
 *     &lt;enumeration value="EnableAcceleratorRequested"/&gt;
 *     &lt;enumeration value="EnableAcceleratorRequestReceived"/&gt;
 *     &lt;enumeration value="AcceleratorDisabled"/&gt;
 *     &lt;enumeration value="DisableAcceleratorRequested"/&gt;
 *     &lt;enumeration value="DisableAcceleratorRequestReceived"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcceleratorState")
@XmlEnum
public enum AcceleratorState {

    @XmlEnumValue("AcceleratorEnabled")
    ACCELERATOR_ENABLED("AcceleratorEnabled"),
    @XmlEnumValue("EnableAcceleratorRequested")
    ENABLE_ACCELERATOR_REQUESTED("EnableAcceleratorRequested"),
    @XmlEnumValue("EnableAcceleratorRequestReceived")
    ENABLE_ACCELERATOR_REQUEST_RECEIVED("EnableAcceleratorRequestReceived"),
    @XmlEnumValue("AcceleratorDisabled")
    ACCELERATOR_DISABLED("AcceleratorDisabled"),
    @XmlEnumValue("DisableAcceleratorRequested")
    DISABLE_ACCELERATOR_REQUESTED("DisableAcceleratorRequested"),
    @XmlEnumValue("DisableAcceleratorRequestReceived")
    DISABLE_ACCELERATOR_REQUEST_RECEIVED("DisableAcceleratorRequestReceived");
    private final String value;

    AcceleratorState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcceleratorState fromValue(String v) {
        for (AcceleratorState c: AcceleratorState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
