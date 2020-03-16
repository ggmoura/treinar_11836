
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LineItemTypeDefault.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemTypeDefault"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pickup"/&gt;
 *     &lt;enumeration value="Delivery"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LineItemTypeDefault")
@XmlEnum
public enum LineItemTypeDefault {

    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery");
    private final String value;

    LineItemTypeDefault(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineItemTypeDefault fromValue(String v) {
        for (LineItemTypeDefault c: LineItemTypeDefault.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
