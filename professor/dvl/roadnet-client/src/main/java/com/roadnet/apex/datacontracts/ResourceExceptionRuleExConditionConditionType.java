
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResourceExceptionRuleExCondition.ConditionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceExceptionRuleExCondition.ConditionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Route"/&gt;
 *     &lt;enumeration value="Worker"/&gt;
 *     &lt;enumeration value="EquipmentType"/&gt;
 *     &lt;enumeration value="Equipment"/&gt;
 *     &lt;enumeration value="Stop"/&gt;
 *     &lt;enumeration value="ServiceableStop"/&gt;
 *     &lt;enumeration value="NonServiceableStop"/&gt;
 *     &lt;enumeration value="MidRouteDepotStop"/&gt;
 *     &lt;enumeration value="Order"/&gt;
 *     &lt;enumeration value="LineItem"/&gt;
 *     &lt;enumeration value="ResourceEvent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResourceExceptionRuleExCondition.ConditionType")
@XmlEnum
public enum ResourceExceptionRuleExConditionConditionType {

    @XmlEnumValue("Route")
    ROUTE("Route"),
    @XmlEnumValue("Worker")
    WORKER("Worker"),
    @XmlEnumValue("EquipmentType")
    EQUIPMENT_TYPE("EquipmentType"),
    @XmlEnumValue("Equipment")
    EQUIPMENT("Equipment"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("ServiceableStop")
    SERVICEABLE_STOP("ServiceableStop"),
    @XmlEnumValue("NonServiceableStop")
    NON_SERVICEABLE_STOP("NonServiceableStop"),
    @XmlEnumValue("MidRouteDepotStop")
    MID_ROUTE_DEPOT_STOP("MidRouteDepotStop"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("LineItem")
    LINE_ITEM("LineItem"),
    @XmlEnumValue("ResourceEvent")
    RESOURCE_EVENT("ResourceEvent");
    private final String value;

    ResourceExceptionRuleExConditionConditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceExceptionRuleExConditionConditionType fromValue(String v) {
        for (ResourceExceptionRuleExConditionConditionType c: ResourceExceptionRuleExConditionConditionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
