
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HarshDrivingBuzzerState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HarshDrivingBuzzerState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UseRegionSetting"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HarshDrivingBuzzerState")
@XmlEnum
public enum HarshDrivingBuzzerState {

    @XmlEnumValue("UseRegionSetting")
    USE_REGION_SETTING("UseRegionSetting"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled");
    private final String value;

    HarshDrivingBuzzerState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HarshDrivingBuzzerState fromValue(String v) {
        for (HarshDrivingBuzzerState c: HarshDrivingBuzzerState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
