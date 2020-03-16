
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EquipmentMaintenanceInfoState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentMaintenanceInfoState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Upcoming"/&gt;
 *     &lt;enumeration value="ScheduledForService"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentMaintenanceInfoState")
@XmlEnum
public enum EquipmentMaintenanceInfoState {

    @XmlEnumValue("Upcoming")
    UPCOMING("Upcoming"),
    @XmlEnumValue("ScheduledForService")
    SCHEDULED_FOR_SERVICE("ScheduledForService"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed");
    private final String value;

    EquipmentMaintenanceInfoState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentMaintenanceInfoState fromValue(String v) {
        for (EquipmentMaintenanceInfoState c: EquipmentMaintenanceInfoState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
