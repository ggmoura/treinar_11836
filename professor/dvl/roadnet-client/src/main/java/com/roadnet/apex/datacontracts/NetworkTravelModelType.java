
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkTravelModelType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkTravelModelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RushHour"/&gt;
 *     &lt;enumeration value="Restricted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkTravelModelType")
@XmlEnum
public enum NetworkTravelModelType {

    @XmlEnumValue("RushHour")
    RUSH_HOUR("RushHour"),
    @XmlEnumValue("Restricted")
    RESTRICTED("Restricted");
    private final String value;

    NetworkTravelModelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkTravelModelType fromValue(String v) {
        for (NetworkTravelModelType c: NetworkTravelModelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
