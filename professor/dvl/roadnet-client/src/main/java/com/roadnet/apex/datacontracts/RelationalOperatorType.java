
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RelationalOperatorType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationalOperatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GreaterThanOrEqualTo"/&gt;
 *     &lt;enumeration value="GreaterThan"/&gt;
 *     &lt;enumeration value="EqualTo"/&gt;
 *     &lt;enumeration value="LessThan"/&gt;
 *     &lt;enumeration value="LessThanOrEqualTo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelationalOperatorType")
@XmlEnum
public enum RelationalOperatorType {

    @XmlEnumValue("GreaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("GreaterThanOrEqualTo"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("EqualTo")
    EQUAL_TO("EqualTo"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("LessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("LessThanOrEqualTo");
    private final String value;

    RelationalOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationalOperatorType fromValue(String v) {
        for (RelationalOperatorType c: RelationalOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
