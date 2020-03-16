
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InputBiasType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="InputBiasType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BiasedLow"/&gt;
 *     &lt;enumeration value="BiasedHigh"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InputBiasType")
@XmlEnum
public enum InputBiasType {

    @XmlEnumValue("BiasedLow")
    BIASED_LOW("BiasedLow"),
    @XmlEnumValue("BiasedHigh")
    BIASED_HIGH("BiasedHigh");
    private final String value;

    InputBiasType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InputBiasType fromValue(String v) {
        for (InputBiasType c: InputBiasType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
