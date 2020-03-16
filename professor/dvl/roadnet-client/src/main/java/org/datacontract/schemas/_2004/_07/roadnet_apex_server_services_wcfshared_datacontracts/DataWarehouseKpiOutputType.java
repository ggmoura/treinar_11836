
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseKpiOutputType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseKpiOutputType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Csv"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseKpiOutputType")
@XmlEnum
public enum DataWarehouseKpiOutputType {

    @XmlEnumValue("Csv")
    CSV("Csv");
    private final String value;

    DataWarehouseKpiOutputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseKpiOutputType fromValue(String v) {
        for (DataWarehouseKpiOutputType c: DataWarehouseKpiOutputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
