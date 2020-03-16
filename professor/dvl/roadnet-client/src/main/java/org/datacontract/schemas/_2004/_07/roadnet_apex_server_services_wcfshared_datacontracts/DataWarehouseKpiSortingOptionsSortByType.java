
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseKpiSortingOptions.SortByType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseKpiSortingOptions.SortByType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Labels"/&gt;
 *     &lt;enumeration value="Metric"/&gt;
 *     &lt;enumeration value="Chronological"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseKpiSortingOptions.SortByType")
@XmlEnum
public enum DataWarehouseKpiSortingOptionsSortByType {

    @XmlEnumValue("Labels")
    LABELS("Labels"),
    @XmlEnumValue("Metric")
    METRIC("Metric"),
    @XmlEnumValue("Chronological")
    CHRONOLOGICAL("Chronological");
    private final String value;

    DataWarehouseKpiSortingOptionsSortByType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseKpiSortingOptionsSortByType fromValue(String v) {
        for (DataWarehouseKpiSortingOptionsSortByType c: DataWarehouseKpiSortingOptionsSortByType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
