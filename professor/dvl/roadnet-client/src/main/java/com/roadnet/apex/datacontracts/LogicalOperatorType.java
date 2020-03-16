
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LogicalOperatorType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LogicalOperatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="And"/&gt;
 *     &lt;enumeration value="Or"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogicalOperatorType")
@XmlEnum
public enum LogicalOperatorType {

    @XmlEnumValue("And")
    AND("And"),
    @XmlEnumValue("Or")
    OR("Or");
    private final String value;

    LogicalOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogicalOperatorType fromValue(String v) {
        for (LogicalOperatorType c: LogicalOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
