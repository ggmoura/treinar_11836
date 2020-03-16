
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImportCaseOperation.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportCaseOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="LowerCase"/&gt;
 *     &lt;enumeration value="UpperCase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImportCaseOperation")
@XmlEnum
public enum ImportCaseOperation {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("LowerCase")
    LOWER_CASE("LowerCase"),
    @XmlEnumValue("UpperCase")
    UPPER_CASE("UpperCase");
    private final String value;

    ImportCaseOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportCaseOperation fromValue(String v) {
        for (ImportCaseOperation c: ImportCaseOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
