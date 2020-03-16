
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NavRecalculationReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NavRecalculationReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DriverRequested"/&gt;
 *     &lt;enumeration value="ApiRequested"/&gt;
 *     &lt;enumeration value="AutoRecalculation"/&gt;
 *     &lt;enumeration value="DetourRequested"/&gt;
 *     &lt;enumeration value="DetourCanceled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NavRecalculationReason")
@XmlEnum
public enum NavRecalculationReason {

    @XmlEnumValue("DriverRequested")
    DRIVER_REQUESTED("DriverRequested"),
    @XmlEnumValue("ApiRequested")
    API_REQUESTED("ApiRequested"),
    @XmlEnumValue("AutoRecalculation")
    AUTO_RECALCULATION("AutoRecalculation"),
    @XmlEnumValue("DetourRequested")
    DETOUR_REQUESTED("DetourRequested"),
    @XmlEnumValue("DetourCanceled")
    DETOUR_CANCELED("DetourCanceled");
    private final String value;

    NavRecalculationReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NavRecalculationReason fromValue(String v) {
        for (NavRecalculationReason c: NavRecalculationReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
