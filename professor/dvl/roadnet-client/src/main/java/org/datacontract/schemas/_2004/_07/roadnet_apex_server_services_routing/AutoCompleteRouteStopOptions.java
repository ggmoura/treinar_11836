
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AutoCompleteRouteStopOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoCompleteRouteStopOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CompleteRemainingStopsAsProjected"/&gt;
 *     &lt;enumeration value="RemoveRemainingStops"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutoCompleteRouteStopOptions")
@XmlEnum
public enum AutoCompleteRouteStopOptions {

    @XmlEnumValue("CompleteRemainingStopsAsProjected")
    COMPLETE_REMAINING_STOPS_AS_PROJECTED("CompleteRemainingStopsAsProjected"),
    @XmlEnumValue("RemoveRemainingStops")
    REMOVE_REMAINING_STOPS("RemoveRemainingStops");
    private final String value;

    AutoCompleteRouteStopOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoCompleteRouteStopOptions fromValue(String v) {
        for (AutoCompleteRouteStopOptions c: AutoCompleteRouteStopOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
