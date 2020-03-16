
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseCargoExceptionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseCargoExceptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Over"/&gt;
 *     &lt;enumeration value="Short"/&gt;
 *     &lt;enumeration value="Damaged"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseCargoExceptionType")
@XmlEnum
public enum DataWarehouseCargoExceptionType {

    @XmlEnumValue("Over")
    OVER("Over"),
    @XmlEnumValue("Short")
    SHORT("Short"),
    @XmlEnumValue("Damaged")
    DAMAGED("Damaged");
    private final String value;

    DataWarehouseCargoExceptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseCargoExceptionType fromValue(String v) {
        for (DataWarehouseCargoExceptionType c: DataWarehouseCargoExceptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
