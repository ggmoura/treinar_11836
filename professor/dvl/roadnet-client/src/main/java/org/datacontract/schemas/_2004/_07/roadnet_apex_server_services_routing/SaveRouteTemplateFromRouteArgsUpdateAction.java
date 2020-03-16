
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SaveRouteTemplateFromRouteArgs.UpdateAction.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SaveRouteTemplateFromRouteArgs.UpdateAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Merge"/&gt;
 *     &lt;enumeration value="Replace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SaveRouteTemplateFromRouteArgs.UpdateAction")
@XmlEnum
public enum SaveRouteTemplateFromRouteArgsUpdateAction {

    @XmlEnumValue("Merge")
    MERGE("Merge"),
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    SaveRouteTemplateFromRouteArgsUpdateAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SaveRouteTemplateFromRouteArgsUpdateAction fromValue(String v) {
        for (SaveRouteTemplateFromRouteArgsUpdateAction c: SaveRouteTemplateFromRouteArgsUpdateAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
