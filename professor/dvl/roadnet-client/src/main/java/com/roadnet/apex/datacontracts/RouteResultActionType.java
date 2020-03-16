
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteResult.ActionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteResult.ActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Modified"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="CouldNotModify"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RouteResult.ActionType")
@XmlEnum
public enum RouteResultActionType {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Modified")
    MODIFIED("Modified"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("CouldNotModify")
    COULD_NOT_MODIFY("CouldNotModify");
    private final String value;

    RouteResultActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouteResultActionType fromValue(String v) {
        for (RouteResultActionType c: RouteResultActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
