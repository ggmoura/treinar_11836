
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseSpeedingType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseSpeedingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Static"/&gt;
 *     &lt;enumeration value="Network"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseSpeedingType")
@XmlEnum
public enum DataWarehouseSpeedingType {

    @XmlEnumValue("Static")
    STATIC("Static"),
    @XmlEnumValue("Network")
    NETWORK("Network");
    private final String value;

    DataWarehouseSpeedingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseSpeedingType fromValue(String v) {
        for (DataWarehouseSpeedingType c: DataWarehouseSpeedingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
