
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BreakTemplate.TimeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BreakTemplate.TimeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RealTime"/&gt;
 *     &lt;enumeration value="DrivingTime"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BreakTemplate.TimeType")
@XmlEnum
public enum BreakTemplateTimeType {

    @XmlEnumValue("RealTime")
    REAL_TIME("RealTime"),
    @XmlEnumValue("DrivingTime")
    DRIVING_TIME("DrivingTime");
    private final String value;

    BreakTemplateTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BreakTemplateTimeType fromValue(String v) {
        for (BreakTemplateTimeType c: BreakTemplateTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
