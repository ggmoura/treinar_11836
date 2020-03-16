
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SendOrdersPropertyResult.ErrorType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SendOrdersPropertyResult.ErrorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="InvalidMaskDefaultWasUsed"/&gt;
 *     &lt;enumeration value="ValueWasTruncated"/&gt;
 *     &lt;enumeration value="OrderHasDeliveryAndPickupQuantities"/&gt;
 *     &lt;enumeration value="InvalidLayout"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SendOrdersPropertyResult.ErrorType")
@XmlEnum
public enum SendOrdersPropertyResultErrorType {

    @XmlEnumValue("InvalidMaskDefaultWasUsed")
    INVALID_MASK_DEFAULT_WAS_USED("InvalidMaskDefaultWasUsed"),
    @XmlEnumValue("ValueWasTruncated")
    VALUE_WAS_TRUNCATED("ValueWasTruncated"),
    @XmlEnumValue("OrderHasDeliveryAndPickupQuantities")
    ORDER_HAS_DELIVERY_AND_PICKUP_QUANTITIES("OrderHasDeliveryAndPickupQuantities"),
    @XmlEnumValue("InvalidLayout")
    INVALID_LAYOUT("InvalidLayout");
    private final String value;

    SendOrdersPropertyResultErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendOrdersPropertyResultErrorType fromValue(String v) {
        for (SendOrdersPropertyResultErrorType c: SendOrdersPropertyResultErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
