
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HosRuleSetJurisdictionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HosRuleSetJurisdictionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UsFederal"/&gt;
 *     &lt;enumeration value="UsState"/&gt;
 *     &lt;enumeration value="Canadian"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HosRuleSetJurisdictionType")
@XmlEnum
public enum HosRuleSetJurisdictionType {

    @XmlEnumValue("UsFederal")
    US_FEDERAL("UsFederal"),
    @XmlEnumValue("UsState")
    US_STATE("UsState"),
    @XmlEnumValue("Canadian")
    CANADIAN("Canadian");
    private final String value;

    HosRuleSetJurisdictionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HosRuleSetJurisdictionType fromValue(String v) {
        for (HosRuleSetJurisdictionType c: HosRuleSetJurisdictionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
