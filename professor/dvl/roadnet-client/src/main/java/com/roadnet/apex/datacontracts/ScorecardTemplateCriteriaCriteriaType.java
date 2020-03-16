
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ScorecardTemplateCriteria.CriteriaType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ScorecardTemplateCriteria.CriteriaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ResourceExceptionRule"/&gt;
 *     &lt;enumeration value="IdlingEvent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScorecardTemplateCriteria.CriteriaType")
@XmlEnum
public enum ScorecardTemplateCriteriaCriteriaType {

    @XmlEnumValue("ResourceExceptionRule")
    RESOURCE_EXCEPTION_RULE("ResourceExceptionRule"),
    @XmlEnumValue("IdlingEvent")
    IDLING_EVENT("IdlingEvent");
    private final String value;

    ScorecardTemplateCriteriaCriteriaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScorecardTemplateCriteriaCriteriaType fromValue(String v) {
        for (ScorecardTemplateCriteriaCriteriaType c: ScorecardTemplateCriteriaCriteriaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
