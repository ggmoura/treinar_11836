
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransitBuilderBuildType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransitBuilderBuildType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="Update"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransitBuilderBuildType")
@XmlEnum
public enum TransitBuilderBuildType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Update")
    UPDATE("Update");
    private final String value;

    TransitBuilderBuildType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitBuilderBuildType fromValue(String v) {
        for (TransitBuilderBuildType c: TransitBuilderBuildType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
