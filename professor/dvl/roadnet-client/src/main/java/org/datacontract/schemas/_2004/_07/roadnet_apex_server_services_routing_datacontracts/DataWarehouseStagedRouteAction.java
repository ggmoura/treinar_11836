
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseStagedRouteAction.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseStagedRouteAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Remove"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseStagedRouteAction")
@XmlEnum
public enum DataWarehouseStagedRouteAction {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Remove")
    REMOVE("Remove");
    private final String value;

    DataWarehouseStagedRouteAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseStagedRouteAction fromValue(String v) {
        for (DataWarehouseStagedRouteAction c: DataWarehouseStagedRouteAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
