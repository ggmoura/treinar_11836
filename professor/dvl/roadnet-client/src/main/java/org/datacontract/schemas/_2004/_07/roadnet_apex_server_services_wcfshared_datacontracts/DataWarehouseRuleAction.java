
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseRuleAction.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseRuleAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Filter"/&gt;
 *     &lt;enumeration value="Highlight"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseRuleAction")
@XmlEnum
public enum DataWarehouseRuleAction {

    @XmlEnumValue("Filter")
    FILTER("Filter"),
    @XmlEnumValue("Highlight")
    HIGHLIGHT("Highlight");
    private final String value;

    DataWarehouseRuleAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseRuleAction fromValue(String v) {
        for (DataWarehouseRuleAction c: DataWarehouseRuleAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
