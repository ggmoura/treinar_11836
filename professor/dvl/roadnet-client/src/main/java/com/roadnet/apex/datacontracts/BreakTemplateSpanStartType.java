
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BreakTemplate.SpanStartType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BreakTemplate.SpanStartType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BeginningOfRoute"/&gt;
 *     &lt;enumeration value="LastBreak"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BreakTemplate.SpanStartType")
@XmlEnum
public enum BreakTemplateSpanStartType {

    @XmlEnumValue("BeginningOfRoute")
    BEGINNING_OF_ROUTE("BeginningOfRoute"),
    @XmlEnumValue("LastBreak")
    LAST_BREAK("LastBreak");
    private final String value;

    BreakTemplateSpanStartType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BreakTemplateSpanStartType fromValue(String v) {
        for (BreakTemplateSpanStartType c: BreakTemplateSpanStartType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
