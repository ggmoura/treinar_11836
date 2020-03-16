
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SuggestTerritoryParameters.SuggestTerritoryGoal.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SuggestTerritoryParameters.SuggestTerritoryGoal"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Cost"/&gt;
 *     &lt;enumeration value="TimeWindow"/&gt;
 *     &lt;enumeration value="Unroute"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SuggestTerritoryParameters.SuggestTerritoryGoal")
@XmlEnum
public enum SuggestTerritoryParametersSuggestTerritoryGoal {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Cost")
    COST("Cost"),
    @XmlEnumValue("TimeWindow")
    TIME_WINDOW("TimeWindow"),
    @XmlEnumValue("Unroute")
    UNROUTE("Unroute");
    private final String value;

    SuggestTerritoryParametersSuggestTerritoryGoal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuggestTerritoryParametersSuggestTerritoryGoal fromValue(String v) {
        for (SuggestTerritoryParametersSuggestTerritoryGoal c: SuggestTerritoryParametersSuggestTerritoryGoal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
