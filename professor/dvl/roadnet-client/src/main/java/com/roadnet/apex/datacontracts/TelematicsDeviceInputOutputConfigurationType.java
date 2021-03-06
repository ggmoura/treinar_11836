
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelematicsDeviceInputOutputConfigurationType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TelematicsDeviceInputOutputConfigurationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RoadnetTelematics"/&gt;
 *     &lt;enumeration value="Relay"/&gt;
 *     &lt;enumeration value="AMGC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelematicsDeviceInputOutputConfigurationType")
@XmlEnum
public enum TelematicsDeviceInputOutputConfigurationType {

    @XmlEnumValue("RoadnetTelematics")
    ROADNET_TELEMATICS("RoadnetTelematics"),
    @XmlEnumValue("Relay")
    RELAY("Relay"),
    AMGC("AMGC");
    private final String value;

    TelematicsDeviceInputOutputConfigurationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelematicsDeviceInputOutputConfigurationType fromValue(String v) {
        for (TelematicsDeviceInputOutputConfigurationType c: TelematicsDeviceInputOutputConfigurationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
