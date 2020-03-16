
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Delivery"/&gt;
 *     &lt;enumeration value="Pickup"/&gt;
 *     &lt;enumeration value="DeliveryAndPickup"/&gt;
 *     &lt;enumeration value="Transfer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderType")
@XmlEnum
public enum OrderType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery"),
    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),
    @XmlEnumValue("DeliveryAndPickup")
    DELIVERY_AND_PICKUP("DeliveryAndPickup"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer");
    private final String value;

    OrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderType fromValue(String v) {
        for (OrderType c: OrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
