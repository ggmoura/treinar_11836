
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SaveSessionAsError.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SaveSessionAsError"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="DuplicateSession"/&gt;
 *     &lt;enumeration value="FailedToResetRoute"/&gt;
 *     &lt;enumeration value="FailedToMoveRouteToPlan"/&gt;
 *     &lt;enumeration value="InvalidStartDate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SaveSessionAsError")
@XmlEnum
public enum SaveSessionAsError {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("DuplicateSession")
    DUPLICATE_SESSION("DuplicateSession"),
    @XmlEnumValue("FailedToResetRoute")
    FAILED_TO_RESET_ROUTE("FailedToResetRoute"),
    @XmlEnumValue("FailedToMoveRouteToPlan")
    FAILED_TO_MOVE_ROUTE_TO_PLAN("FailedToMoveRouteToPlan"),
    @XmlEnumValue("InvalidStartDate")
    INVALID_START_DATE("InvalidStartDate");
    private final String value;

    SaveSessionAsError(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SaveSessionAsError fromValue(String v) {
        for (SaveSessionAsError c: SaveSessionAsError.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
