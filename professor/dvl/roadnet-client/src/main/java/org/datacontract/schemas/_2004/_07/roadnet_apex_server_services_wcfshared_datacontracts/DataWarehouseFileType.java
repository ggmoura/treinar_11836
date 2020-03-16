
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseFileType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseFileType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Csv"/&gt;
 *     &lt;enumeration value="Xls"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseFileType")
@XmlEnum
public enum DataWarehouseFileType {

    @XmlEnumValue("Csv")
    CSV("Csv"),
    @XmlEnumValue("Xls")
    XLS("Xls");
    private final String value;

    DataWarehouseFileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseFileType fromValue(String v) {
        for (DataWarehouseFileType c: DataWarehouseFileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
