
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de KeyFobAuthenticationBuzzerState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyFobAuthenticationBuzzerState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UseRegionSetting"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyFobAuthenticationBuzzerState")
@XmlEnum
public enum KeyFobAuthenticationBuzzerState {

    @XmlEnumValue("UseRegionSetting")
    USE_REGION_SETTING("UseRegionSetting"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled");
    private final String value;

    KeyFobAuthenticationBuzzerState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyFobAuthenticationBuzzerState fromValue(String v) {
        for (KeyFobAuthenticationBuzzerState c: KeyFobAuthenticationBuzzerState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
