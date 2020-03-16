
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessUnit.MessagingProviderType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessUnit.MessagingProviderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Twilio"/&gt;
 *     &lt;enumeration value="Nexmo"/&gt;
 *     &lt;enumeration value="Plivo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessUnit.MessagingProviderType")
@XmlEnum
public enum BusinessUnitMessagingProviderType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Twilio")
    TWILIO("Twilio"),
    @XmlEnumValue("Nexmo")
    NEXMO("Nexmo"),
    @XmlEnumValue("Plivo")
    PLIVO("Plivo");
    private final String value;

    BusinessUnitMessagingProviderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessUnitMessagingProviderType fromValue(String v) {
        for (BusinessUnitMessagingProviderType c: BusinessUnitMessagingProviderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
