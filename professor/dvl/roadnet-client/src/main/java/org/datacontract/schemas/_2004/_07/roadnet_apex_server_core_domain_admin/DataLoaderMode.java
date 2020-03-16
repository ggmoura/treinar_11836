
package org.datacontract.schemas._2004._07.roadnet_apex_server_core_domain_admin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataLoaderMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataLoaderMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RouteOnly"/&gt;
 *     &lt;enumeration value="NonRouteOnly"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataLoaderMode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain.Admin.DataWarehouse")
@XmlEnum
public enum DataLoaderMode {

    @XmlEnumValue("RouteOnly")
    ROUTE_ONLY("RouteOnly"),
    @XmlEnumValue("NonRouteOnly")
    NON_ROUTE_ONLY("NonRouteOnly"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    DataLoaderMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataLoaderMode fromValue(String v) {
        for (DataLoaderMode c: DataLoaderMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
