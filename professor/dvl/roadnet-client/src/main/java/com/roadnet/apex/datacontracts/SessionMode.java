
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SessionMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SessionMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Operational"/&gt;
 *     &lt;enumeration value="Modeling"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SessionMode")
@XmlEnum
public enum SessionMode {

    @XmlEnumValue("Operational")
    OPERATIONAL("Operational"),
    @XmlEnumValue("Modeling")
    MODELING("Modeling");
    private final String value;

    SessionMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SessionMode fromValue(String v) {
        for (SessionMode c: SessionMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
