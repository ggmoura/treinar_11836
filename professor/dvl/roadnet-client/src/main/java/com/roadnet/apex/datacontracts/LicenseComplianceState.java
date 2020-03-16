
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LicenseComplianceState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseComplianceState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GoodStanding"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Locked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LicenseComplianceState")
@XmlEnum
public enum LicenseComplianceState {

    @XmlEnumValue("GoodStanding")
    GOOD_STANDING("GoodStanding"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Locked")
    LOCKED("Locked");
    private final String value;

    LicenseComplianceState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LicenseComplianceState fromValue(String v) {
        for (LicenseComplianceState c: LicenseComplianceState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
