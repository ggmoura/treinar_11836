
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseDimension.DimensionCategory.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseDimension.DimensionCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseDimension.DimensionCategory")
@XmlEnum
public enum DataWarehouseDimensionDimensionCategory {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined");
    private final String value;

    DataWarehouseDimensionDimensionCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseDimensionDimensionCategory fromValue(String v) {
        for (DataWarehouseDimensionDimensionCategory c: DataWarehouseDimensionDimensionCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
