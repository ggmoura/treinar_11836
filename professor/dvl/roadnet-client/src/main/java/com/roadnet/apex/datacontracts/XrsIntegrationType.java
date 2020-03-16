
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de XrsIntegrationType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="XrsIntegrationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="LegacyIntegrationV3_65"/&gt;
 *     &lt;enumeration value="LegacyIntegrationV4_40"/&gt;
 *     &lt;enumeration value="IntegrationV4_40"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "XrsIntegrationType")
@XmlEnum
public enum XrsIntegrationType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("LegacyIntegrationV3_65")
    LEGACY_INTEGRATION_V_3_65("LegacyIntegrationV3_65"),
    @XmlEnumValue("LegacyIntegrationV4_40")
    LEGACY_INTEGRATION_V_4_40("LegacyIntegrationV4_40"),
    @XmlEnumValue("IntegrationV4_40")
    INTEGRATION_V_4_40("IntegrationV4_40");
    private final String value;

    XrsIntegrationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XrsIntegrationType fromValue(String v) {
        for (XrsIntegrationType c: XrsIntegrationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
