
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TimeRangeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeRangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DateRange"/&gt;
 *     &lt;enumeration value="NumberOfTimeUnitsBeforeToday"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeRangeType")
@XmlEnum
public enum TimeRangeType {

    @XmlEnumValue("DateRange")
    DATE_RANGE("DateRange"),
    @XmlEnumValue("NumberOfTimeUnitsBeforeToday")
    NUMBER_OF_TIME_UNITS_BEFORE_TODAY("NumberOfTimeUnitsBeforeToday");
    private final String value;

    TimeRangeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeRangeType fromValue(String v) {
        for (TimeRangeType c: TimeRangeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
