
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImportConstantOperation.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportConstantOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Append"/&gt;
 *     &lt;enumeration value="Prepend"/&gt;
 *     &lt;enumeration value="Replace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImportConstantOperation")
@XmlEnum
public enum ImportConstantOperation {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Append")
    APPEND("Append"),
    @XmlEnumValue("Prepend")
    PREPEND("Prepend"),
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    ImportConstantOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportConstantOperation fromValue(String v) {
        for (ImportConstantOperation c: ImportConstantOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
