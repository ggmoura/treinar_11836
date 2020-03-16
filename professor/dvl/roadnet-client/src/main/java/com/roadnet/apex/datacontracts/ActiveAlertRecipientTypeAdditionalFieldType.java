
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActiveAlertRecipientTypeAdditionalFieldType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActiveAlertRecipientTypeAdditionalFieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CustomLocationProperty"/&gt;
 *     &lt;enumeration value="CustomOrderProperty"/&gt;
 *     &lt;enumeration value="StandardInstructions"/&gt;
 *     &lt;enumeration value="SpecialInstructions"/&gt;
 *     &lt;enumeration value="PlannedDeliveryQuantities"/&gt;
 *     &lt;enumeration value="DeliveryQuantities"/&gt;
 *     &lt;enumeration value="PlannedPickupQuantities"/&gt;
 *     &lt;enumeration value="PickupQuantities"/&gt;
 *     &lt;enumeration value="AddressLine1"/&gt;
 *     &lt;enumeration value="AddressLine2"/&gt;
 *     &lt;enumeration value="CrossStreet"/&gt;
 *     &lt;enumeration value="PostalCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActiveAlertRecipientTypeAdditionalFieldType")
@XmlEnum
public enum ActiveAlertRecipientTypeAdditionalFieldType {

    @XmlEnumValue("CustomLocationProperty")
    CUSTOM_LOCATION_PROPERTY("CustomLocationProperty"),
    @XmlEnumValue("CustomOrderProperty")
    CUSTOM_ORDER_PROPERTY("CustomOrderProperty"),
    @XmlEnumValue("StandardInstructions")
    STANDARD_INSTRUCTIONS("StandardInstructions"),
    @XmlEnumValue("SpecialInstructions")
    SPECIAL_INSTRUCTIONS("SpecialInstructions"),
    @XmlEnumValue("PlannedDeliveryQuantities")
    PLANNED_DELIVERY_QUANTITIES("PlannedDeliveryQuantities"),
    @XmlEnumValue("DeliveryQuantities")
    DELIVERY_QUANTITIES("DeliveryQuantities"),
    @XmlEnumValue("PlannedPickupQuantities")
    PLANNED_PICKUP_QUANTITIES("PlannedPickupQuantities"),
    @XmlEnumValue("PickupQuantities")
    PICKUP_QUANTITIES("PickupQuantities"),
    @XmlEnumValue("AddressLine1")
    ADDRESS_LINE_1("AddressLine1"),
    @XmlEnumValue("AddressLine2")
    ADDRESS_LINE_2("AddressLine2"),
    @XmlEnumValue("CrossStreet")
    CROSS_STREET("CrossStreet"),
    @XmlEnumValue("PostalCode")
    POSTAL_CODE("PostalCode");
    private final String value;

    ActiveAlertRecipientTypeAdditionalFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActiveAlertRecipientTypeAdditionalFieldType fromValue(String v) {
        for (ActiveAlertRecipientTypeAdditionalFieldType c: ActiveAlertRecipientTypeAdditionalFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
