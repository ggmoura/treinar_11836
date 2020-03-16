
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WorkerAlertTriggerProximity.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkerAlertTriggerProximity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Arrived"/&gt;
 *     &lt;enumeration value="Arriving"/&gt;
 *     &lt;enumeration value="Approaching"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkerAlertTriggerProximity")
@XmlEnum
public enum WorkerAlertTriggerProximity {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Arrived")
    ARRIVED("Arrived"),
    @XmlEnumValue("Arriving")
    ARRIVING("Arriving"),
    @XmlEnumValue("Approaching")
    APPROACHING("Approaching");
    private final String value;

    WorkerAlertTriggerProximity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkerAlertTriggerProximity fromValue(String v) {
        for (WorkerAlertTriggerProximity c: WorkerAlertTriggerProximity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
