
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SaveRouteTemplateFromRouteResult.OperationResult.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SaveRouteTemplateFromRouteResult.OperationResult"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Updated"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SaveRouteTemplateFromRouteResult.OperationResult")
@XmlEnum
public enum SaveRouteTemplateFromRouteResultOperationResult {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Updated")
    UPDATED("Updated"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    SaveRouteTemplateFromRouteResultOperationResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SaveRouteTemplateFromRouteResultOperationResult fromValue(String v) {
        for (SaveRouteTemplateFromRouteResultOperationResult c: SaveRouteTemplateFromRouteResultOperationResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
