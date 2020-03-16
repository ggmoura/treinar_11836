
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MobileApplicationType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileApplicationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Delivery"/&gt;
 *     &lt;enumeration value="Tracking"/&gt;
 *     &lt;enumeration value="Compliance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileApplicationType")
@XmlEnum
public enum MobileApplicationType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery"),
    @XmlEnumValue("Tracking")
    TRACKING("Tracking"),
    @XmlEnumValue("Compliance")
    COMPLIANCE("Compliance");
    private final String value;

    MobileApplicationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobileApplicationType fromValue(String v) {
        for (MobileApplicationType c: MobileApplicationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
