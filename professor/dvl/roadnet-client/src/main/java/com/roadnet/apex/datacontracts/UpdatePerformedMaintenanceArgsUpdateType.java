
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UpdatePerformedMaintenanceArgs.UpdateType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdatePerformedMaintenanceArgs.UpdateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AddUsingEquipmentMaintenanceInfoEntitKey"/&gt;
 *     &lt;enumeration value="AddUsingEquipmentMaintenancePlanEntitKey"/&gt;
 *     &lt;enumeration value="DeleteUsingEquipmentMaintenanceInfoEntitKey"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpdatePerformedMaintenanceArgs.UpdateType")
@XmlEnum
public enum UpdatePerformedMaintenanceArgsUpdateType {

    @XmlEnumValue("AddUsingEquipmentMaintenanceInfoEntitKey")
    ADD_USING_EQUIPMENT_MAINTENANCE_INFO_ENTIT_KEY("AddUsingEquipmentMaintenanceInfoEntitKey"),
    @XmlEnumValue("AddUsingEquipmentMaintenancePlanEntitKey")
    ADD_USING_EQUIPMENT_MAINTENANCE_PLAN_ENTIT_KEY("AddUsingEquipmentMaintenancePlanEntitKey"),
    @XmlEnumValue("DeleteUsingEquipmentMaintenanceInfoEntitKey")
    DELETE_USING_EQUIPMENT_MAINTENANCE_INFO_ENTIT_KEY("DeleteUsingEquipmentMaintenanceInfoEntitKey");
    private final String value;

    UpdatePerformedMaintenanceArgsUpdateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdatePerformedMaintenanceArgsUpdateType fromValue(String v) {
        for (UpdatePerformedMaintenanceArgsUpdateType c: UpdatePerformedMaintenanceArgsUpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
