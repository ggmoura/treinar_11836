
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CertifiedStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CertifiedStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Uncertified"/&gt;
 *     &lt;enumeration value="Certified"/&gt;
 *     &lt;enumeration value="Instructed"/&gt;
 *     &lt;enumeration value="Reviewed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CertifiedStatus")
@XmlEnum
public enum CertifiedStatus {

    @XmlEnumValue("Uncertified")
    UNCERTIFIED("Uncertified"),
    @XmlEnumValue("Certified")
    CERTIFIED("Certified"),
    @XmlEnumValue("Instructed")
    INSTRUCTED("Instructed"),
    @XmlEnumValue("Reviewed")
    REVIEWED("Reviewed");
    private final String value;

    CertifiedStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertifiedStatus fromValue(String v) {
        for (CertifiedStatus c: CertifiedStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
