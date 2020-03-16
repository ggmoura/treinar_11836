
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AutonomousOptimizationRouteGoal.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AutonomousOptimizationRouteGoal"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Cost"/&gt;
 *     &lt;enumeration value="TimeWindow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutonomousOptimizationRouteGoal")
@XmlEnum
public enum AutonomousOptimizationRouteGoal {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Cost")
    COST("Cost"),
    @XmlEnumValue("TimeWindow")
    TIME_WINDOW("TimeWindow");
    private final String value;

    AutonomousOptimizationRouteGoal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutonomousOptimizationRouteGoal fromValue(String v) {
        for (AutonomousOptimizationRouteGoal c: AutonomousOptimizationRouteGoal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
