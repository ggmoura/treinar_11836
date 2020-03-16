
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SuggestRouteParameters.SuggestRouteGoal.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SuggestRouteParameters.SuggestRouteGoal"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Cost"/&gt;
 *     &lt;enumeration value="TimeWindow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SuggestRouteParameters.SuggestRouteGoal", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute")
@XmlEnum
public enum SuggestRouteParametersSuggestRouteGoal {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Cost")
    COST("Cost"),
    @XmlEnumValue("TimeWindow")
    TIME_WINDOW("TimeWindow");
    private final String value;

    SuggestRouteParametersSuggestRouteGoal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuggestRouteParametersSuggestRouteGoal fromValue(String v) {
        for (SuggestRouteParametersSuggestRouteGoal c: SuggestRouteParametersSuggestRouteGoal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
