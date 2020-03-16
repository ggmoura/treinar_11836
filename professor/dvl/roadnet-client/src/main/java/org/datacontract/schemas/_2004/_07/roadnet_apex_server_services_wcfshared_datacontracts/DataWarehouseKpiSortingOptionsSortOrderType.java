
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseKpiSortingOptions.SortOrderType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseKpiSortingOptions.SortOrderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ascending"/&gt;
 *     &lt;enumeration value="Descending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseKpiSortingOptions.SortOrderType")
@XmlEnum
public enum DataWarehouseKpiSortingOptionsSortOrderType {

    @XmlEnumValue("Ascending")
    ASCENDING("Ascending"),
    @XmlEnumValue("Descending")
    DESCENDING("Descending");
    private final String value;

    DataWarehouseKpiSortingOptionsSortOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseKpiSortingOptionsSortOrderType fromValue(String v) {
        for (DataWarehouseKpiSortingOptionsSortOrderType c: DataWarehouseKpiSortingOptionsSortOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
