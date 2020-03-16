
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnboardCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OnboardCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Break"/&gt;
 *     &lt;enumeration value="Wait"/&gt;
 *     &lt;enumeration value="Layover"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnboardCodeType")
@XmlEnum
public enum OnboardCodeType {

    @XmlEnumValue("Break")
    BREAK("Break"),
    @XmlEnumValue("Wait")
    WAIT("Wait"),
    @XmlEnumValue("Layover")
    LAYOVER("Layover");
    private final String value;

    OnboardCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnboardCodeType fromValue(String v) {
        for (OnboardCodeType c: OnboardCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
