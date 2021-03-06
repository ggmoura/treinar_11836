
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnStopTemplatePlacement.Position.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OnStopTemplatePlacement.Position"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="After"/&gt;
 *     &lt;enumeration value="Before"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnStopTemplatePlacement.Position")
@XmlEnum
public enum OnStopTemplatePlacementPosition {

    @XmlEnumValue("After")
    AFTER("After"),
    @XmlEnumValue("Before")
    BEFORE("Before");
    private final String value;

    OnStopTemplatePlacementPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnStopTemplatePlacementPosition fromValue(String v) {
        for (OnStopTemplatePlacementPosition c: OnStopTemplatePlacementPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
