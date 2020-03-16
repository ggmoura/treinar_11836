
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CustomFormType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFormType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Survey"/&gt;
 *     &lt;enumeration value="CannedSurvey"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomFormType")
@XmlEnum
public enum CustomFormType {

    @XmlEnumValue("Survey")
    SURVEY("Survey"),
    @XmlEnumValue("CannedSurvey")
    CANNED_SURVEY("CannedSurvey");
    private final String value;

    CustomFormType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomFormType fromValue(String v) {
        for (CustomFormType c: CustomFormType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
