
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Scorecard.ScorecardType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Scorecard.ScorecardType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Worker"/&gt;
 *     &lt;enumeration value="Equipment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Scorecard.ScorecardType")
@XmlEnum
public enum ScorecardScorecardType {

    @XmlEnumValue("Worker")
    WORKER("Worker"),
    @XmlEnumValue("Equipment")
    EQUIPMENT("Equipment");
    private final String value;

    ScorecardScorecardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScorecardScorecardType fromValue(String v) {
        for (ScorecardScorecardType c: ScorecardScorecardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
