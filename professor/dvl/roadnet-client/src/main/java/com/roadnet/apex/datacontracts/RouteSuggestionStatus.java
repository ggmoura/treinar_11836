
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteSuggestionStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteSuggestionStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="DriverAccepted"/&gt;
 *     &lt;enumeration value="DriverRejected"/&gt;
 *     &lt;enumeration value="SystemRejected"/&gt;
 *     &lt;enumeration value="RejectedForRoute"/&gt;
 *     &lt;enumeration value="UnableToApplySuggestion"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RouteSuggestionStatus")
@XmlEnum
public enum RouteSuggestionStatus {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("DriverAccepted")
    DRIVER_ACCEPTED("DriverAccepted"),
    @XmlEnumValue("DriverRejected")
    DRIVER_REJECTED("DriverRejected"),
    @XmlEnumValue("SystemRejected")
    SYSTEM_REJECTED("SystemRejected"),
    @XmlEnumValue("RejectedForRoute")
    REJECTED_FOR_ROUTE("RejectedForRoute"),
    @XmlEnumValue("UnableToApplySuggestion")
    UNABLE_TO_APPLY_SUGGESTION("UnableToApplySuggestion");
    private final String value;

    RouteSuggestionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouteSuggestionStatus fromValue(String v) {
        for (RouteSuggestionStatus c: RouteSuggestionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
