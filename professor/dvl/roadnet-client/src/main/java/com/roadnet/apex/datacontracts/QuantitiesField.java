
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Quantities.Field.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Quantities.Field"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Size1"/&gt;
 *     &lt;enumeration value="Size2"/&gt;
 *     &lt;enumeration value="Size3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Quantities.Field")
@XmlEnum
public enum QuantitiesField {

    @XmlEnumValue("Size1")
    SIZE_1("Size1"),
    @XmlEnumValue("Size2")
    SIZE_2("Size2"),
    @XmlEnumValue("Size3")
    SIZE_3("Size3");
    private final String value;

    QuantitiesField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantitiesField fromValue(String v) {
        for (QuantitiesField c: QuantitiesField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
