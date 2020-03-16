
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PrepareForNextDayError.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PrepareForNextDayError"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="DuplicateSession"/&gt;
 *     &lt;enumeration value="FailedToResetRoute"/&gt;
 *     &lt;enumeration value="FailedToMoveRouteToPlan"/&gt;
 *     &lt;enumeration value="FailedToDeleteActiveRoutesFromOriginalSession"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrepareForNextDayError")
@XmlEnum
public enum PrepareForNextDayError {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("DuplicateSession")
    DUPLICATE_SESSION("DuplicateSession"),
    @XmlEnumValue("FailedToResetRoute")
    FAILED_TO_RESET_ROUTE("FailedToResetRoute"),
    @XmlEnumValue("FailedToMoveRouteToPlan")
    FAILED_TO_MOVE_ROUTE_TO_PLAN("FailedToMoveRouteToPlan"),
    @XmlEnumValue("FailedToDeleteActiveRoutesFromOriginalSession")
    FAILED_TO_DELETE_ACTIVE_ROUTES_FROM_ORIGINAL_SESSION("FailedToDeleteActiveRoutesFromOriginalSession");
    private final String value;

    PrepareForNextDayError(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrepareForNextDayError fromValue(String v) {
        for (PrepareForNextDayError c: PrepareForNextDayError.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
