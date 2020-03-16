
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehousePlannedActualType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehousePlannedActualType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Planned"/&gt;
 *     &lt;enumeration value="Actual"/&gt;
 *     &lt;enumeration value="PlannedOptimal"/&gt;
 *     &lt;enumeration value="PlannedOptimalConstrained"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehousePlannedActualType")
@XmlEnum
public enum DataWarehousePlannedActualType {

    @XmlEnumValue("Planned")
    PLANNED("Planned"),
    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("PlannedOptimal")
    PLANNED_OPTIMAL("PlannedOptimal"),
    @XmlEnumValue("PlannedOptimalConstrained")
    PLANNED_OPTIMAL_CONSTRAINED("PlannedOptimalConstrained");
    private final String value;

    DataWarehousePlannedActualType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehousePlannedActualType fromValue(String v) {
        for (DataWarehousePlannedActualType c: DataWarehousePlannedActualType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
