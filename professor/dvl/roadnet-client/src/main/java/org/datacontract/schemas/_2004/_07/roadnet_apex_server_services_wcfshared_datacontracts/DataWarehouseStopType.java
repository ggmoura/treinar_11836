
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseStopType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseStopType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Break"/&gt;
 *     &lt;enumeration value="Wait"/&gt;
 *     &lt;enumeration value="Layover"/&gt;
 *     &lt;enumeration value="RouteStart"/&gt;
 *     &lt;enumeration value="RouteEnd"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *     &lt;enumeration value="Reload"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Delay"/&gt;
 *     &lt;enumeration value="Restricted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseStopType")
@XmlEnum
public enum DataWarehouseStopType {

    @XmlEnumValue("Break")
    BREAK("Break"),
    @XmlEnumValue("Wait")
    WAIT("Wait"),
    @XmlEnumValue("Layover")
    LAYOVER("Layover"),
    @XmlEnumValue("RouteStart")
    ROUTE_START("RouteStart"),
    @XmlEnumValue("RouteEnd")
    ROUTE_END("RouteEnd"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Reload")
    RELOAD("Reload"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Delay")
    DELAY("Delay"),
    @XmlEnumValue("Restricted")
    RESTRICTED("Restricted");
    private final String value;

    DataWarehouseStopType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseStopType fromValue(String v) {
        for (DataWarehouseStopType c: DataWarehouseStopType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
