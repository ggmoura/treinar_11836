
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OptimizingGoal.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OptimizingGoal"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Cost"/&gt;
 *     &lt;enumeration value="TimeWindow"/&gt;
 *     &lt;enumeration value="LoadBalance"/&gt;
 *     &lt;enumeration value="LoadPercentCapacityBalance"/&gt;
 *     &lt;enumeration value="RuntimeBalance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptimizingGoal", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options")
@XmlEnum
public enum OptimizingGoal {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Cost")
    COST("Cost"),
    @XmlEnumValue("TimeWindow")
    TIME_WINDOW("TimeWindow"),
    @XmlEnumValue("LoadBalance")
    LOAD_BALANCE("LoadBalance"),
    @XmlEnumValue("LoadPercentCapacityBalance")
    LOAD_PERCENT_CAPACITY_BALANCE("LoadPercentCapacityBalance"),
    @XmlEnumValue("RuntimeBalance")
    RUNTIME_BALANCE("RuntimeBalance");
    private final String value;

    OptimizingGoal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptimizingGoal fromValue(String v) {
        for (OptimizingGoal c: OptimizingGoal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
