
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnboardDataProvider.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OnboardDataProvider"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *     &lt;enumeration value="Cadec"/&gt;
 *     &lt;enumeration value="Xata"/&gt;
 *     &lt;enumeration value="Tripmaster"/&gt;
 *     &lt;enumeration value="InfoTrax"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnboardDataProvider")
@XmlEnum
public enum OnboardDataProvider {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom"),
    @XmlEnumValue("Cadec")
    CADEC("Cadec"),
    @XmlEnumValue("Xata")
    XATA("Xata"),
    @XmlEnumValue("Tripmaster")
    TRIPMASTER("Tripmaster"),
    @XmlEnumValue("InfoTrax")
    INFO_TRAX("InfoTrax");
    private final String value;

    OnboardDataProvider(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnboardDataProvider fromValue(String v) {
        for (OnboardDataProvider c: OnboardDataProvider.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
