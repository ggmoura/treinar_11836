
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseDataLoaderMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseDataLoaderMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RouteOnly"/&gt;
 *     &lt;enumeration value="NonRouteOnly"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseDataLoaderMode")
@XmlEnum
public enum DataWarehouseDataLoaderMode {

    @XmlEnumValue("RouteOnly")
    ROUTE_ONLY("RouteOnly"),
    @XmlEnumValue("NonRouteOnly")
    NON_ROUTE_ONLY("NonRouteOnly"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    DataWarehouseDataLoaderMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseDataLoaderMode fromValue(String v) {
        for (DataWarehouseDataLoaderMode c: DataWarehouseDataLoaderMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
