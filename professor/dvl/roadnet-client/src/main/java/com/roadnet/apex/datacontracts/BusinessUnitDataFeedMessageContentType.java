
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessUnit.DataFeedMessageContentType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessUnit.DataFeedMessageContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TextPlain"/&gt;
 *     &lt;enumeration value="ApplicationJson"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessUnit.DataFeedMessageContentType")
@XmlEnum
public enum BusinessUnitDataFeedMessageContentType {

    @XmlEnumValue("TextPlain")
    TEXT_PLAIN("TextPlain"),
    @XmlEnumValue("ApplicationJson")
    APPLICATION_JSON("ApplicationJson");
    private final String value;

    BusinessUnitDataFeedMessageContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessUnitDataFeedMessageContentType fromValue(String v) {
        for (BusinessUnitDataFeedMessageContentType c: BusinessUnitDataFeedMessageContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
