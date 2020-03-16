
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnTerritoryPlacement.Position.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OnTerritoryPlacement.Position"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="First"/&gt;
 *     &lt;enumeration value="Last"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnTerritoryPlacement.Position")
@XmlEnum
public enum OnTerritoryPlacementPosition {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Last")
    LAST("Last");
    private final String value;

    OnTerritoryPlacementPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnTerritoryPlacementPosition fromValue(String v) {
        for (OnTerritoryPlacementPosition c: OnTerritoryPlacementPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
