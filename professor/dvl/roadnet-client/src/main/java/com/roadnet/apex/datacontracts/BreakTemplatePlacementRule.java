
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BreakTemplate.PlacementRule.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BreakTemplate.PlacementRule"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AfterClosestStopToThreshold"/&gt;
 *     &lt;enumeration value="AfterStopBeforeThreshold"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BreakTemplate.PlacementRule")
@XmlEnum
public enum BreakTemplatePlacementRule {

    @XmlEnumValue("AfterClosestStopToThreshold")
    AFTER_CLOSEST_STOP_TO_THRESHOLD("AfterClosestStopToThreshold"),
    @XmlEnumValue("AfterStopBeforeThreshold")
    AFTER_STOP_BEFORE_THRESHOLD("AfterStopBeforeThreshold");
    private final String value;

    BreakTemplatePlacementRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BreakTemplatePlacementRule fromValue(String v) {
        for (BreakTemplatePlacementRule c: BreakTemplatePlacementRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
