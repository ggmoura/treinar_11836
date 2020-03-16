
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseStagedStopType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseStagedStopType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Service"/&gt;
 *     &lt;enumeration value="Break"/&gt;
 *     &lt;enumeration value="Wait"/&gt;
 *     &lt;enumeration value="Layover"/&gt;
 *     &lt;enumeration value="Reload"/&gt;
 *     &lt;enumeration value="Restricted"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseStagedStopType")
@XmlEnum
public enum DataWarehouseStagedStopType {

    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Break")
    BREAK("Break"),
    @XmlEnumValue("Wait")
    WAIT("Wait"),
    @XmlEnumValue("Layover")
    LAYOVER("Layover"),
    @XmlEnumValue("Reload")
    RELOAD("Reload"),
    @XmlEnumValue("Restricted")
    RESTRICTED("Restricted"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DataWarehouseStagedStopType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseStagedStopType fromValue(String v) {
        for (DataWarehouseStagedStopType c: DataWarehouseStagedStopType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
