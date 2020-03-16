
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NonServiceableStopPlacementMethodType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NonServiceableStopPlacementMethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="CompleteCurrentStop"/&gt;
 *     &lt;enumeration value="UnserviceCurrentStop"/&gt;
 *     &lt;enumeration value="SuspendCurrentStop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonServiceableStopPlacementMethodType")
@XmlEnum
public enum NonServiceableStopPlacementMethodType {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("CompleteCurrentStop")
    COMPLETE_CURRENT_STOP("CompleteCurrentStop"),
    @XmlEnumValue("UnserviceCurrentStop")
    UNSERVICE_CURRENT_STOP("UnserviceCurrentStop"),
    @XmlEnumValue("SuspendCurrentStop")
    SUSPEND_CURRENT_STOP("SuspendCurrentStop");
    private final String value;

    NonServiceableStopPlacementMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonServiceableStopPlacementMethodType fromValue(String v) {
        for (NonServiceableStopPlacementMethodType c: NonServiceableStopPlacementMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
