
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ScorecardTemplateCriteria.ScaleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ScorecardTemplateCriteria.ScaleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OccurencesPerHundredMiles"/&gt;
 *     &lt;enumeration value="PercentOfTotalRunTime"/&gt;
 *     &lt;enumeration value="PercentOfTotalTravelTime"/&gt;
 *     &lt;enumeration value="PercentOfTotalDistance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScorecardTemplateCriteria.ScaleType")
@XmlEnum
public enum ScorecardTemplateCriteriaScaleType {

    @XmlEnumValue("OccurencesPerHundredMiles")
    OCCURENCES_PER_HUNDRED_MILES("OccurencesPerHundredMiles"),
    @XmlEnumValue("PercentOfTotalRunTime")
    PERCENT_OF_TOTAL_RUN_TIME("PercentOfTotalRunTime"),
    @XmlEnumValue("PercentOfTotalTravelTime")
    PERCENT_OF_TOTAL_TRAVEL_TIME("PercentOfTotalTravelTime"),
    @XmlEnumValue("PercentOfTotalDistance")
    PERCENT_OF_TOTAL_DISTANCE("PercentOfTotalDistance");
    private final String value;

    ScorecardTemplateCriteriaScaleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScorecardTemplateCriteriaScaleType fromValue(String v) {
        for (ScorecardTemplateCriteriaScaleType c: ScorecardTemplateCriteriaScaleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
