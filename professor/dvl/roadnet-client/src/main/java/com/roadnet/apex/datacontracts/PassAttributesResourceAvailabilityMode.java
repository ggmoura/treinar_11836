
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PassAttributes.ResourceAvailabilityMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PassAttributes.ResourceAvailabilityMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Simple"/&gt;
 *     &lt;enumeration value="Advanced"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassAttributes.ResourceAvailabilityMode")
@XmlEnum
public enum PassAttributesResourceAvailabilityMode {

    @XmlEnumValue("Simple")
    SIMPLE("Simple"),
    @XmlEnumValue("Advanced")
    ADVANCED("Advanced");
    private final String value;

    PassAttributesResourceAvailabilityMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassAttributesResourceAvailabilityMode fromValue(String v) {
        for (PassAttributesResourceAvailabilityMode c: PassAttributesResourceAvailabilityMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
