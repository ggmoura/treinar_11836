
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActiveTroubleCodesUpdateAction.TroubleCodeState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActiveTroubleCodesUpdateAction.TroubleCodeState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Current"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Permanent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActiveTroubleCodesUpdateAction.TroubleCodeState")
@XmlEnum
public enum ActiveTroubleCodesUpdateActionTroubleCodeState {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Permanent")
    PERMANENT("Permanent");
    private final String value;

    ActiveTroubleCodesUpdateActionTroubleCodeState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActiveTroubleCodesUpdateActionTroubleCodeState fromValue(String v) {
        for (ActiveTroubleCodesUpdateActionTroubleCodeState c: ActiveTroubleCodesUpdateActionTroubleCodeState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
