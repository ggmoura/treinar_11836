
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LoadAction.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LoadAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AsNeeded"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="Empty"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoadAction")
@XmlEnum
public enum LoadAction {

    @XmlEnumValue("AsNeeded")
    AS_NEEDED("AsNeeded"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    LoadAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadAction fromValue(String v) {
        for (LoadAction c: LoadAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
