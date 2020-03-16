
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DefectSeverity.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DefectSeverity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Minor"/&gt;
 *     &lt;enumeration value="Major"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DefectSeverity")
@XmlEnum
public enum DefectSeverity {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Minor")
    MINOR("Minor"),
    @XmlEnumValue("Major")
    MAJOR("Major");
    private final String value;

    DefectSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefectSeverity fromValue(String v) {
        for (DefectSeverity c: DefectSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
