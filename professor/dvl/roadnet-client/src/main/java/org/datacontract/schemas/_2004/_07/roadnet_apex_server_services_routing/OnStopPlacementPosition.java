
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnStopPlacement.Position.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OnStopPlacement.Position"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="After"/&gt;
 *     &lt;enumeration value="Before"/&gt;
 *     &lt;enumeration value="Combine"/&gt;
 *     &lt;enumeration value="CombineIfAble"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnStopPlacement.Position")
@XmlEnum
public enum OnStopPlacementPosition {

    @XmlEnumValue("After")
    AFTER("After"),
    @XmlEnumValue("Before")
    BEFORE("Before"),
    @XmlEnumValue("Combine")
    COMBINE("Combine"),
    @XmlEnumValue("CombineIfAble")
    COMBINE_IF_ABLE("CombineIfAble");
    private final String value;

    OnStopPlacementPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnStopPlacementPosition fromValue(String v) {
        for (OnStopPlacementPosition c: OnStopPlacementPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
