
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PerformedAt.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PerformedAt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="PreRoute"/&gt;
 *     &lt;enumeration value="PostRoute"/&gt;
 *     &lt;enumeration value="Stop"/&gt;
 *     &lt;enumeration value="Order"/&gt;
 *     &lt;enumeration value="LineItem"/&gt;
 *     &lt;enumeration value="Anytime"/&gt;
 *     &lt;enumeration value="StopOrGroup"/&gt;
 *     &lt;enumeration value="PreStart"/&gt;
 *     &lt;enumeration value="PreLogout"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PerformedAt")
@XmlEnum
public enum PerformedAt {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("PreRoute")
    PRE_ROUTE("PreRoute"),
    @XmlEnumValue("PostRoute")
    POST_ROUTE("PostRoute"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("LineItem")
    LINE_ITEM("LineItem"),
    @XmlEnumValue("Anytime")
    ANYTIME("Anytime"),
    @XmlEnumValue("StopOrGroup")
    STOP_OR_GROUP("StopOrGroup"),
    @XmlEnumValue("PreStart")
    PRE_START("PreStart"),
    @XmlEnumValue("PreLogout")
    PRE_LOGOUT("PreLogout");
    private final String value;

    PerformedAt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformedAt fromValue(String v) {
        for (PerformedAt c: PerformedAt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
