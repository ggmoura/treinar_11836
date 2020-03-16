
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WorkerLogEventType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkerLogEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Login"/&gt;
 *     &lt;enumeration value="Logout"/&gt;
 *     &lt;enumeration value="Inspection"/&gt;
 *     &lt;enumeration value="DutyStatus"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkerLogEventType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS")
@XmlEnum
public enum WorkerLogEventType {

    @XmlEnumValue("Login")
    LOGIN("Login"),
    @XmlEnumValue("Logout")
    LOGOUT("Logout"),
    @XmlEnumValue("Inspection")
    INSPECTION("Inspection"),
    @XmlEnumValue("DutyStatus")
    DUTY_STATUS("DutyStatus");
    private final String value;

    WorkerLogEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkerLogEventType fromValue(String v) {
        for (WorkerLogEventType c: WorkerLogEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
