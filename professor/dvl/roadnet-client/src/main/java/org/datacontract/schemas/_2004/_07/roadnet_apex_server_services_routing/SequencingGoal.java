
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SequencingGoal.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SequencingGoal"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Cost"/&gt;
 *     &lt;enumeration value="TimeWindow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SequencingGoal", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options")
@XmlEnum
public enum SequencingGoal {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Cost")
    COST("Cost"),
    @XmlEnumValue("TimeWindow")
    TIME_WINDOW("TimeWindow");
    private final String value;

    SequencingGoal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SequencingGoal fromValue(String v) {
        for (SequencingGoal c: SequencingGoal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
