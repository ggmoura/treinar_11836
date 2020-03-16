
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WorkerDutyStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkerDutyStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="OffDuty"/&gt;
 *     &lt;enumeration value="SleeperBerth"/&gt;
 *     &lt;enumeration value="Driving"/&gt;
 *     &lt;enumeration value="OnDuty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkerDutyStatus")
@XmlEnum
public enum WorkerDutyStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("OffDuty")
    OFF_DUTY("OffDuty"),
    @XmlEnumValue("SleeperBerth")
    SLEEPER_BERTH("SleeperBerth"),
    @XmlEnumValue("Driving")
    DRIVING("Driving"),
    @XmlEnumValue("OnDuty")
    ON_DUTY("OnDuty");
    private final String value;

    WorkerDutyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkerDutyStatus fromValue(String v) {
        for (WorkerDutyStatus c: WorkerDutyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
