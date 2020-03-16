
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkPOIType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkPOIType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Undefined"/&gt;
 *     &lt;enumeration value="Administrative"/&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Cultural"/&gt;
 *     &lt;enumeration value="Lodging"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Public"/&gt;
 *     &lt;enumeration value="Recreation"/&gt;
 *     &lt;enumeration value="Restaurant"/&gt;
 *     &lt;enumeration value="Retail"/&gt;
 *     &lt;enumeration value="Transportation"/&gt;
 *     &lt;enumeration value="Building"/&gt;
 *     &lt;enumeration value="PhoneNumber"/&gt;
 *     &lt;enumeration value="EmergencyServices"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkPOIType")
@XmlEnum
public enum NetworkPOIType {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Administrative")
    ADMINISTRATIVE("Administrative"),
    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Cultural")
    CULTURAL("Cultural"),
    @XmlEnumValue("Lodging")
    LODGING("Lodging"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("Recreation")
    RECREATION("Recreation"),
    @XmlEnumValue("Restaurant")
    RESTAURANT("Restaurant"),
    @XmlEnumValue("Retail")
    RETAIL("Retail"),
    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation"),
    @XmlEnumValue("Building")
    BUILDING("Building"),
    @XmlEnumValue("PhoneNumber")
    PHONE_NUMBER("PhoneNumber"),
    @XmlEnumValue("EmergencyServices")
    EMERGENCY_SERVICES("EmergencyServices");
    private final String value;

    NetworkPOIType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkPOIType fromValue(String v) {
        for (NetworkPOIType c: NetworkPOIType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
