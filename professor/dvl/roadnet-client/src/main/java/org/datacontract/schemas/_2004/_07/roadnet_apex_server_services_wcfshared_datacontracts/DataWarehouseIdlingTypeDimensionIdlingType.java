
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseIdlingTypeDimension.IdlingType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseIdlingTypeDimension.IdlingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Warmup"/&gt;
 *     &lt;enumeration value="Cooldown"/&gt;
 *     &lt;enumeration value="Excessive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseIdlingTypeDimension.IdlingType")
@XmlEnum
public enum DataWarehouseIdlingTypeDimensionIdlingType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Warmup")
    WARMUP("Warmup"),
    @XmlEnumValue("Cooldown")
    COOLDOWN("Cooldown"),
    @XmlEnumValue("Excessive")
    EXCESSIVE("Excessive");
    private final String value;

    DataWarehouseIdlingTypeDimensionIdlingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseIdlingTypeDimensionIdlingType fromValue(String v) {
        for (DataWarehouseIdlingTypeDimensionIdlingType c: DataWarehouseIdlingTypeDimensionIdlingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
