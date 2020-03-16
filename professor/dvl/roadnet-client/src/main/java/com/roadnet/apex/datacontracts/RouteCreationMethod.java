
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteCreationMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteCreationMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="Dynamic"/&gt;
 *     &lt;enumeration value="Template"/&gt;
 *     &lt;enumeration value="Import"/&gt;
 *     &lt;enumeration value="GeneratedByTelematicsDeviceData"/&gt;
 *     &lt;enumeration value="GeneratedByMobileDeviceData"/&gt;
 *     &lt;enumeration value="FromPoints"/&gt;
 *     &lt;enumeration value="FromSplit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RouteCreationMethod")
@XmlEnum
public enum RouteCreationMethod {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Dynamic")
    DYNAMIC("Dynamic"),
    @XmlEnumValue("Template")
    TEMPLATE("Template"),
    @XmlEnumValue("Import")
    IMPORT("Import"),
    @XmlEnumValue("GeneratedByTelematicsDeviceData")
    GENERATED_BY_TELEMATICS_DEVICE_DATA("GeneratedByTelematicsDeviceData"),
    @XmlEnumValue("GeneratedByMobileDeviceData")
    GENERATED_BY_MOBILE_DEVICE_DATA("GeneratedByMobileDeviceData"),
    @XmlEnumValue("FromPoints")
    FROM_POINTS("FromPoints"),
    @XmlEnumValue("FromSplit")
    FROM_SPLIT("FromSplit");
    private final String value;

    RouteCreationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouteCreationMethod fromValue(String v) {
        for (RouteCreationMethod c: RouteCreationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
