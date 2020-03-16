
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TimeWindowImportance.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeWindowImportance"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Lowest"/&gt;
 *     &lt;enumeration value="Lower"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Higher"/&gt;
 *     &lt;enumeration value="Highest"/&gt;
 *     &lt;enumeration value="MustMake"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeWindowImportance")
@XmlEnum
public enum TimeWindowImportance {

    @XmlEnumValue("Lowest")
    LOWEST("Lowest"),
    @XmlEnumValue("Lower")
    LOWER("Lower"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Higher")
    HIGHER("Higher"),
    @XmlEnumValue("Highest")
    HIGHEST("Highest"),
    @XmlEnumValue("MustMake")
    MUST_MAKE("MustMake");
    private final String value;

    TimeWindowImportance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeWindowImportance fromValue(String v) {
        for (TimeWindowImportance c: TimeWindowImportance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
