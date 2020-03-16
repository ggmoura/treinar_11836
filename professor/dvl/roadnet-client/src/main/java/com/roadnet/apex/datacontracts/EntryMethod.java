
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EntryMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EntryMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Manually"/&gt;
 *     &lt;enumeration value="Imported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntryMethod")
@XmlEnum
public enum EntryMethod {

    @XmlEnumValue("Manually")
    MANUALLY("Manually"),
    @XmlEnumValue("Imported")
    IMPORTED("Imported");
    private final String value;

    EntryMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntryMethod fromValue(String v) {
        for (EntryMethod c: EntryMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
