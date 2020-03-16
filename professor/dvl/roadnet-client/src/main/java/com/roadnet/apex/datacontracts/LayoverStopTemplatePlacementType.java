
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LayoverStopTemplate.PlacementType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LayoverStopTemplate.PlacementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Attached"/&gt;
 *     &lt;enumeration value="Detached"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LayoverStopTemplate.PlacementType")
@XmlEnum
public enum LayoverStopTemplatePlacementType {

    @XmlEnumValue("Attached")
    ATTACHED("Attached"),
    @XmlEnumValue("Detached")
    DETACHED("Detached");
    private final String value;

    LayoverStopTemplatePlacementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LayoverStopTemplatePlacementType fromValue(String v) {
        for (LayoverStopTemplatePlacementType c: LayoverStopTemplatePlacementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
