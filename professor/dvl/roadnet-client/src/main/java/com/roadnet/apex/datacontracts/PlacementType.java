
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PlacementType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PlacementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Attached"/&gt;
 *     &lt;enumeration value="Detached"/&gt;
 *     &lt;enumeration value="AttachedIndeterminateLocation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlacementType")
@XmlEnum
public enum PlacementType {

    @XmlEnumValue("Attached")
    ATTACHED("Attached"),
    @XmlEnumValue("Detached")
    DETACHED("Detached"),
    @XmlEnumValue("AttachedIndeterminateLocation")
    ATTACHED_INDETERMINATE_LOCATION("AttachedIndeterminateLocation");
    private final String value;

    PlacementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacementType fromValue(String v) {
        for (PlacementType c: PlacementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
