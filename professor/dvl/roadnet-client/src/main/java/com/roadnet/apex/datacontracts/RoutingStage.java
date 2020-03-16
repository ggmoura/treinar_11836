
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoutingStage.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutingStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PreparingData"/&gt;
 *     &lt;enumeration value="CreatingRoutes"/&gt;
 *     &lt;enumeration value="OptimizingRoutes"/&gt;
 *     &lt;enumeration value="SavingRoutes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoutingStage")
@XmlEnum
public enum RoutingStage {

    @XmlEnumValue("PreparingData")
    PREPARING_DATA("PreparingData"),
    @XmlEnumValue("CreatingRoutes")
    CREATING_ROUTES("CreatingRoutes"),
    @XmlEnumValue("OptimizingRoutes")
    OPTIMIZING_ROUTES("OptimizingRoutes"),
    @XmlEnumValue("SavingRoutes")
    SAVING_ROUTES("SavingRoutes");
    private final String value;

    RoutingStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutingStage fromValue(String v) {
        for (RoutingStage c: RoutingStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
