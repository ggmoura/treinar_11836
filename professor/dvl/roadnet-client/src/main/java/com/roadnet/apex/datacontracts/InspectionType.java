
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InspectionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="InspectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MidRoute"/&gt;
 *     &lt;enumeration value="PreRoute"/&gt;
 *     &lt;enumeration value="PostRoute"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InspectionType")
@XmlEnum
public enum InspectionType {

    @XmlEnumValue("MidRoute")
    MID_ROUTE("MidRoute"),
    @XmlEnumValue("PreRoute")
    PRE_ROUTE("PreRoute"),
    @XmlEnumValue("PostRoute")
    POST_ROUTE("PostRoute");
    private final String value;

    InspectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InspectionType fromValue(String v) {
        for (InspectionType c: InspectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
