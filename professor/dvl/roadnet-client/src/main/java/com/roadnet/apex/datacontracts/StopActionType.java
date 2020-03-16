
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StopActionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StopActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Delivery"/&gt;
 *     &lt;enumeration value="Pickup"/&gt;
 *     &lt;enumeration value="Break"/&gt;
 *     &lt;enumeration value="Layover"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StopActionType")
@XmlEnum
public enum StopActionType {

    @XmlEnumValue("Delivery")
    DELIVERY("Delivery"),
    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),
    @XmlEnumValue("Break")
    BREAK("Break"),
    @XmlEnumValue("Layover")
    LAYOVER("Layover");
    private final String value;

    StopActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopActionType fromValue(String v) {
        for (StopActionType c: StopActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
