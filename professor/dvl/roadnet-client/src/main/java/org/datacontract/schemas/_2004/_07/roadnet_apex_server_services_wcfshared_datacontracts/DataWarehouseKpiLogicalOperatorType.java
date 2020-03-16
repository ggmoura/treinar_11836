
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseKpiLogicalOperatorType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseKpiLogicalOperatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="And"/&gt;
 *     &lt;enumeration value="Or"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseKpiLogicalOperatorType")
@XmlEnum
public enum DataWarehouseKpiLogicalOperatorType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("And")
    AND("And"),
    @XmlEnumValue("Or")
    OR("Or");
    private final String value;

    DataWarehouseKpiLogicalOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseKpiLogicalOperatorType fromValue(String v) {
        for (DataWarehouseKpiLogicalOperatorType c: DataWarehouseKpiLogicalOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
