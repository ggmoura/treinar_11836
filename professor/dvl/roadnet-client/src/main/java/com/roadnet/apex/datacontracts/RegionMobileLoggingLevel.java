
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.MobileLoggingLevel.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.MobileLoggingLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Debug"/&gt;
 *     &lt;enumeration value="Info"/&gt;
 *     &lt;enumeration value="Warn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.MobileLoggingLevel")
@XmlEnum
public enum RegionMobileLoggingLevel {

    @XmlEnumValue("Debug")
    DEBUG("Debug"),
    @XmlEnumValue("Info")
    INFO("Info"),
    @XmlEnumValue("Warn")
    WARN("Warn");
    private final String value;

    RegionMobileLoggingLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionMobileLoggingLevel fromValue(String v) {
        for (RegionMobileLoggingLevel c: RegionMobileLoggingLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
