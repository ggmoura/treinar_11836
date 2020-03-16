
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.BreakArrivalDepartureMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.BreakArrivalDepartureMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AccordingToSequence"/&gt;
 *     &lt;enumeration value="BestFit"/&gt;
 *     &lt;enumeration value="OnDutyStatusChanged"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.BreakArrivalDepartureMethod")
@XmlEnum
public enum RegionBreakArrivalDepartureMethod {

    @XmlEnumValue("AccordingToSequence")
    ACCORDING_TO_SEQUENCE("AccordingToSequence"),
    @XmlEnumValue("BestFit")
    BEST_FIT("BestFit"),
    @XmlEnumValue("OnDutyStatusChanged")
    ON_DUTY_STATUS_CHANGED("OnDutyStatusChanged");
    private final String value;

    RegionBreakArrivalDepartureMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionBreakArrivalDepartureMethod fromValue(String v) {
        for (RegionBreakArrivalDepartureMethod c: RegionBreakArrivalDepartureMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
