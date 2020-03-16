
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HosRulesValidationResultType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HosRulesValidationResultType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Valid"/&gt;
 *     &lt;enumeration value="Invalid"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HosRulesValidationResultType")
@XmlEnum
public enum HosRulesValidationResultType {

    @XmlEnumValue("Valid")
    VALID("Valid"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Warning")
    WARNING("Warning");
    private final String value;

    HosRulesValidationResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HosRulesValidationResultType fromValue(String v) {
        for (HosRulesValidationResultType c: HosRulesValidationResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
