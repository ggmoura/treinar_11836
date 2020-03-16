
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CalculateOptimalRouteMetricsResult.CalculateOptimalError.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculateOptimalRouteMetricsResult.CalculateOptimalError"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="UnexpectedError"/&gt;
 *     &lt;enumeration value="LockViolation"/&gt;
 *     &lt;enumeration value="RouteAlreadyArchived"/&gt;
 *     &lt;enumeration value="NoPermission"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalculateOptimalRouteMetricsResult.CalculateOptimalError")
@XmlEnum
public enum CalculateOptimalRouteMetricsResultCalculateOptimalError {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("UnexpectedError")
    UNEXPECTED_ERROR("UnexpectedError"),
    @XmlEnumValue("LockViolation")
    LOCK_VIOLATION("LockViolation"),
    @XmlEnumValue("RouteAlreadyArchived")
    ROUTE_ALREADY_ARCHIVED("RouteAlreadyArchived"),
    @XmlEnumValue("NoPermission")
    NO_PERMISSION("NoPermission");
    private final String value;

    CalculateOptimalRouteMetricsResultCalculateOptimalError(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculateOptimalRouteMetricsResultCalculateOptimalError fromValue(String v) {
        for (CalculateOptimalRouteMetricsResultCalculateOptimalError c: CalculateOptimalRouteMetricsResultCalculateOptimalError.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
