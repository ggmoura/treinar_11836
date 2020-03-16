
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FormControlType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FormControlType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Question"/&gt;
 *     &lt;enumeration value="RepeatGroup"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FormControlType")
@XmlEnum
public enum FormControlType {

    @XmlEnumValue("Question")
    QUESTION("Question"),
    @XmlEnumValue("RepeatGroup")
    REPEAT_GROUP("RepeatGroup");
    private final String value;

    FormControlType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormControlType fromValue(String v) {
        for (FormControlType c: FormControlType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
