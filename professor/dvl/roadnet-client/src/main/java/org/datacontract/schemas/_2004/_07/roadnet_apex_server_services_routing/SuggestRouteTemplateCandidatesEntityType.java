
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SuggestRouteTemplateCandidates.EntityType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SuggestRouteTemplateCandidates.EntityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RouteTemplate"/&gt;
 *     &lt;enumeration value="RouteTemplateSet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SuggestRouteTemplateCandidates.EntityType")
@XmlEnum
public enum SuggestRouteTemplateCandidatesEntityType {

    @XmlEnumValue("RouteTemplate")
    ROUTE_TEMPLATE("RouteTemplate"),
    @XmlEnumValue("RouteTemplateSet")
    ROUTE_TEMPLATE_SET("RouteTemplateSet");
    private final String value;

    SuggestRouteTemplateCandidatesEntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuggestRouteTemplateCandidatesEntityType fromValue(String v) {
        for (SuggestRouteTemplateCandidatesEntityType c: SuggestRouteTemplateCandidatesEntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
