
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteAutonomousDispatchState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteAutonomousDispatchState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UnsupportedInRegion"/&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *     &lt;enumeration value="DisabledByIneligibleRoute"/&gt;
 *     &lt;enumeration value="DisabledByDispatcher"/&gt;
 *     &lt;enumeration value="DisabledByDriver"/&gt;
 *     &lt;enumeration value="DisabledByExcessiveRejections"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RouteAutonomousDispatchState")
@XmlEnum
public enum RouteAutonomousDispatchState {

    @XmlEnumValue("UnsupportedInRegion")
    UNSUPPORTED_IN_REGION("UnsupportedInRegion"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("DisabledByIneligibleRoute")
    DISABLED_BY_INELIGIBLE_ROUTE("DisabledByIneligibleRoute"),
    @XmlEnumValue("DisabledByDispatcher")
    DISABLED_BY_DISPATCHER("DisabledByDispatcher"),
    @XmlEnumValue("DisabledByDriver")
    DISABLED_BY_DRIVER("DisabledByDriver"),
    @XmlEnumValue("DisabledByExcessiveRejections")
    DISABLED_BY_EXCESSIVE_REJECTIONS("DisabledByExcessiveRejections");
    private final String value;

    RouteAutonomousDispatchState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouteAutonomousDispatchState fromValue(String v) {
        for (RouteAutonomousDispatchState c: RouteAutonomousDispatchState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
