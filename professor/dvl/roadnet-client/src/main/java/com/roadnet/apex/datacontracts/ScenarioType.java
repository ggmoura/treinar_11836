
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ScenarioType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ScenarioType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AsIs"/&gt;
 *     &lt;enumeration value="Path"/&gt;
 *     &lt;enumeration value="Sequence"/&gt;
 *     &lt;enumeration value="Daily"/&gt;
 *     &lt;enumeration value="Cycle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScenarioType")
@XmlEnum
public enum ScenarioType {

    @XmlEnumValue("AsIs")
    AS_IS("AsIs"),
    @XmlEnumValue("Path")
    PATH("Path"),
    @XmlEnumValue("Sequence")
    SEQUENCE("Sequence"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Cycle")
    CYCLE("Cycle");
    private final String value;

    ScenarioType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScenarioType fromValue(String v) {
        for (ScenarioType c: ScenarioType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
