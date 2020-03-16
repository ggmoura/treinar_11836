
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseTransactionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseTransactionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Route"/&gt;
 *     &lt;enumeration value="TravelLeg"/&gt;
 *     &lt;enumeration value="Stop"/&gt;
 *     &lt;enumeration value="TelematicsEvent"/&gt;
 *     &lt;enumeration value="NavEvent"/&gt;
 *     &lt;enumeration value="Event"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseTransactionType")
@XmlEnum
public enum DataWarehouseTransactionType {

    @XmlEnumValue("Route")
    ROUTE("Route"),
    @XmlEnumValue("TravelLeg")
    TRAVEL_LEG("TravelLeg"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("TelematicsEvent")
    TELEMATICS_EVENT("TelematicsEvent"),
    @XmlEnumValue("NavEvent")
    NAV_EVENT("NavEvent"),
    @XmlEnumValue("Event")
    EVENT("Event");
    private final String value;

    DataWarehouseTransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseTransactionType fromValue(String v) {
        for (DataWarehouseTransactionType c: DataWarehouseTransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
