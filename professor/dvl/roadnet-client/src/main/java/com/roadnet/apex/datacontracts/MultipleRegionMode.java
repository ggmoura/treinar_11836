
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MultipleRegionMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MultipleRegionMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="AccordingToList"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MultipleRegionMode")
@XmlEnum
public enum MultipleRegionMode {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("AccordingToList")
    ACCORDING_TO_LIST("AccordingToList");
    private final String value;

    MultipleRegionMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MultipleRegionMode fromValue(String v) {
        for (MultipleRegionMode c: MultipleRegionMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
