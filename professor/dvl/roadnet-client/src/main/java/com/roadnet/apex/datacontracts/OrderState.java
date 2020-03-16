
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unassigned"/&gt;
 *     &lt;enumeration value="Assigned"/&gt;
 *     &lt;enumeration value="Dispatched"/&gt;
 *     &lt;enumeration value="Serviced"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="PartiallyAssigned"/&gt;
 *     &lt;enumeration value="PartiallyDispatched"/&gt;
 *     &lt;enumeration value="PartiallyServiced"/&gt;
 *     &lt;enumeration value="PartiallyInactive"/&gt;
 *     &lt;enumeration value="PartiallyCancelled"/&gt;
 *     &lt;enumeration value="Unrouted"/&gt;
 *     &lt;enumeration value="Routed"/&gt;
 *     &lt;enumeration value="PartiallyRouted"/&gt;
 *     &lt;enumeration value="Unserviceable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderState")
@XmlEnum
public enum OrderState {

    @XmlEnumValue("Unassigned")
    UNASSIGNED("Unassigned"),
    @XmlEnumValue("Assigned")
    ASSIGNED("Assigned"),
    @XmlEnumValue("Dispatched")
    DISPATCHED("Dispatched"),
    @XmlEnumValue("Serviced")
    SERVICED("Serviced"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("PartiallyAssigned")
    PARTIALLY_ASSIGNED("PartiallyAssigned"),
    @XmlEnumValue("PartiallyDispatched")
    PARTIALLY_DISPATCHED("PartiallyDispatched"),
    @XmlEnumValue("PartiallyServiced")
    PARTIALLY_SERVICED("PartiallyServiced"),
    @XmlEnumValue("PartiallyInactive")
    PARTIALLY_INACTIVE("PartiallyInactive"),
    @XmlEnumValue("PartiallyCancelled")
    PARTIALLY_CANCELLED("PartiallyCancelled"),
    @XmlEnumValue("Unrouted")
    UNROUTED("Unrouted"),
    @XmlEnumValue("Routed")
    ROUTED("Routed"),
    @XmlEnumValue("PartiallyRouted")
    PARTIALLY_ROUTED("PartiallyRouted"),
    @XmlEnumValue("Unserviceable")
    UNSERVICEABLE("Unserviceable");
    private final String value;

    OrderState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderState fromValue(String v) {
        for (OrderState c: OrderState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
