
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseServiceType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Delivery"/&gt;
 *     &lt;enumeration value="Pickup"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseServiceType")
@XmlEnum
public enum DataWarehouseServiceType {

    @XmlEnumValue("Delivery")
    DELIVERY("Delivery"),
    @XmlEnumValue("Pickup")
    PICKUP("Pickup");
    private final String value;

    DataWarehouseServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseServiceType fromValue(String v) {
        for (DataWarehouseServiceType c: DataWarehouseServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
