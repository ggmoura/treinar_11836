
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UpdateDailyRoutesJobErrorCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateDailyRoutesJobErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="DuplicateOrderConflict"/&gt;
 *     &lt;enumeration value="DuplicatePassConflict"/&gt;
 *     &lt;enumeration value="DuplicateRouteConflict"/&gt;
 *     &lt;enumeration value="EmptyRoute"/&gt;
 *     &lt;enumeration value="PlanningVehiclesLicenseViolation"/&gt;
 *     &lt;enumeration value="DispatchNoEquipmentWarning"/&gt;
 *     &lt;enumeration value="DispatchNoWorkerWarning"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpdateDailyRoutesJobErrorCode")
@XmlEnum
public enum UpdateDailyRoutesJobErrorCode {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("DuplicateOrderConflict")
    DUPLICATE_ORDER_CONFLICT("DuplicateOrderConflict"),
    @XmlEnumValue("DuplicatePassConflict")
    DUPLICATE_PASS_CONFLICT("DuplicatePassConflict"),
    @XmlEnumValue("DuplicateRouteConflict")
    DUPLICATE_ROUTE_CONFLICT("DuplicateRouteConflict"),
    @XmlEnumValue("EmptyRoute")
    EMPTY_ROUTE("EmptyRoute"),
    @XmlEnumValue("PlanningVehiclesLicenseViolation")
    PLANNING_VEHICLES_LICENSE_VIOLATION("PlanningVehiclesLicenseViolation"),
    @XmlEnumValue("DispatchNoEquipmentWarning")
    DISPATCH_NO_EQUIPMENT_WARNING("DispatchNoEquipmentWarning"),
    @XmlEnumValue("DispatchNoWorkerWarning")
    DISPATCH_NO_WORKER_WARNING("DispatchNoWorkerWarning");
    private final String value;

    UpdateDailyRoutesJobErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateDailyRoutesJobErrorCode fromValue(String v) {
        for (UpdateDailyRoutesJobErrorCode c: UpdateDailyRoutesJobErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
