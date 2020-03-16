
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehousePlannedAndActualType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehousePlannedAndActualType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="PlannedOnly"/&gt;
 *     &lt;enumeration value="ActualOnly"/&gt;
 *     &lt;enumeration value="PlannedAndActual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehousePlannedAndActualType")
@XmlEnum
public enum DataWarehousePlannedAndActualType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("PlannedOnly")
    PLANNED_ONLY("PlannedOnly"),
    @XmlEnumValue("ActualOnly")
    ACTUAL_ONLY("ActualOnly"),
    @XmlEnumValue("PlannedAndActual")
    PLANNED_AND_ACTUAL("PlannedAndActual");
    private final String value;

    DataWarehousePlannedAndActualType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehousePlannedAndActualType fromValue(String v) {
        for (DataWarehousePlannedAndActualType c: DataWarehousePlannedAndActualType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
