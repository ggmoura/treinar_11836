
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PercentFormat.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PercentFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Percent"/&gt;
 *     &lt;enumeration value="Decimal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PercentFormat")
@XmlEnum
public enum PercentFormat {

    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal");
    private final String value;

    PercentFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PercentFormat fromValue(String v) {
        for (PercentFormat c: PercentFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
