
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OmnitracsOneSystem.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OmnitracsOneSystem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RoadnetAnywhere"/&gt;
 *     &lt;enumeration value="CustomerPortal"/&gt;
 *     &lt;enumeration value="ServicesPortal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OmnitracsOneSystem")
@XmlEnum
public enum OmnitracsOneSystem {

    @XmlEnumValue("RoadnetAnywhere")
    ROADNET_ANYWHERE("RoadnetAnywhere"),
    @XmlEnumValue("CustomerPortal")
    CUSTOMER_PORTAL("CustomerPortal"),
    @XmlEnumValue("ServicesPortal")
    SERVICES_PORTAL("ServicesPortal");
    private final String value;

    OmnitracsOneSystem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OmnitracsOneSystem fromValue(String v) {
        for (OmnitracsOneSystem c: OmnitracsOneSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
