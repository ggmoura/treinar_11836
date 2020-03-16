
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CustomEntityPropertyType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomEntityPropertyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="Duration"/&gt;
 *     &lt;enumeration value="Decimal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomEntityPropertyType")
@XmlEnum
public enum CustomEntityPropertyType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal");
    private final String value;

    CustomEntityPropertyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomEntityPropertyType fromValue(String v) {
        for (CustomEntityPropertyType c: CustomEntityPropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
