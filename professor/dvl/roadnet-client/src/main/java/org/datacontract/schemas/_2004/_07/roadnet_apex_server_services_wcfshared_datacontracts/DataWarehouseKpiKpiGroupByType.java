
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseKpi.KpiGroupByType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseKpi.KpiGroupByType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OpUnit"/&gt;
 *     &lt;enumeration value="Time"/&gt;
 *     &lt;enumeration value="SecondaryDimension"/&gt;
 *     &lt;enumeration value="Route"/&gt;
 *     &lt;enumeration value="Transaction"/&gt;
 *     &lt;enumeration value="DimensionList"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseKpi.KpiGroupByType")
@XmlEnum
public enum DataWarehouseKpiKpiGroupByType {

    @XmlEnumValue("OpUnit")
    OP_UNIT("OpUnit"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("SecondaryDimension")
    SECONDARY_DIMENSION("SecondaryDimension"),
    @XmlEnumValue("Route")
    ROUTE("Route"),
    @XmlEnumValue("Transaction")
    TRANSACTION("Transaction"),
    @XmlEnumValue("DimensionList")
    DIMENSION_LIST("DimensionList");
    private final String value;

    DataWarehouseKpiKpiGroupByType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseKpiKpiGroupByType fromValue(String v) {
        for (DataWarehouseKpiKpiGroupByType c: DataWarehouseKpiKpiGroupByType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
