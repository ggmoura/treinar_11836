
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImportErrorMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportErrorMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ThrowError"/&gt;
 *     &lt;enumeration value="SaveAndContinue"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImportErrorMode")
@XmlEnum
public enum ImportErrorMode {

    @XmlEnumValue("ThrowError")
    THROW_ERROR("ThrowError"),
    @XmlEnumValue("SaveAndContinue")
    SAVE_AND_CONTINUE("SaveAndContinue");
    private final String value;

    ImportErrorMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportErrorMode fromValue(String v) {
        for (ImportErrorMode c: ImportErrorMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
