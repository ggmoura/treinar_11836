
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WorkerLogCreationMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkerLogCreationMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkerLogCreationMethod", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS")
@XmlEnum
public enum WorkerLogCreationMethod {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Auto")
    AUTO("Auto");
    private final String value;

    WorkerLogCreationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkerLogCreationMethod fromValue(String v) {
        for (WorkerLogCreationMethod c: WorkerLogCreationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
