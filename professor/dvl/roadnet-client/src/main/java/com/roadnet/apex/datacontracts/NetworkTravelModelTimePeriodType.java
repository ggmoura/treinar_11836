
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkTravelModelTimePeriodType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkTravelModelTimePeriodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Explicit"/&gt;
 *     &lt;enumeration value="TimePeriod1"/&gt;
 *     &lt;enumeration value="TimePeriod2"/&gt;
 *     &lt;enumeration value="TimePeriod3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkTravelModelTimePeriodType")
@XmlEnum
public enum NetworkTravelModelTimePeriodType {

    @XmlEnumValue("Explicit")
    EXPLICIT("Explicit"),
    @XmlEnumValue("TimePeriod1")
    TIME_PERIOD_1("TimePeriod1"),
    @XmlEnumValue("TimePeriod2")
    TIME_PERIOD_2("TimePeriod2"),
    @XmlEnumValue("TimePeriod3")
    TIME_PERIOD_3("TimePeriod3");
    private final String value;

    NetworkTravelModelTimePeriodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkTravelModelTimePeriodType fromValue(String v) {
        for (NetworkTravelModelTimePeriodType c: NetworkTravelModelTimePeriodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
