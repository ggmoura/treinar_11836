
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MoveRecurringOrderOptions.PlacementMethodType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MoveRecurringOrderOptions.PlacementMethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AssignToBestPosition"/&gt;
 *     &lt;enumeration value="MaintainCurrentAssignment"/&gt;
 *     &lt;enumeration value="MaintainCurrentAndAssignUnroutedToBest"/&gt;
 *     &lt;enumeration value="RemoveFromRoute"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MoveRecurringOrderOptions.PlacementMethodType")
@XmlEnum
public enum MoveRecurringOrderOptionsPlacementMethodType {

    @XmlEnumValue("AssignToBestPosition")
    ASSIGN_TO_BEST_POSITION("AssignToBestPosition"),
    @XmlEnumValue("MaintainCurrentAssignment")
    MAINTAIN_CURRENT_ASSIGNMENT("MaintainCurrentAssignment"),
    @XmlEnumValue("MaintainCurrentAndAssignUnroutedToBest")
    MAINTAIN_CURRENT_AND_ASSIGN_UNROUTED_TO_BEST("MaintainCurrentAndAssignUnroutedToBest"),
    @XmlEnumValue("RemoveFromRoute")
    REMOVE_FROM_ROUTE("RemoveFromRoute");
    private final String value;

    MoveRecurringOrderOptionsPlacementMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MoveRecurringOrderOptionsPlacementMethodType fromValue(String v) {
        for (MoveRecurringOrderOptionsPlacementMethodType c: MoveRecurringOrderOptionsPlacementMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
