
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelematicsDeviceHardwarePlatform.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TelematicsDeviceHardwarePlatform"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="Relay"/&gt;
 *     &lt;enumeration value="AMGC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelematicsDeviceHardwarePlatform", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared")
@XmlEnum
public enum TelematicsDeviceHardwarePlatform {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("Relay")
    RELAY("Relay"),
    AMGC("AMGC");
    private final String value;

    TelematicsDeviceHardwarePlatform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelematicsDeviceHardwarePlatform fromValue(String v) {
        for (TelematicsDeviceHardwarePlatform c: TelematicsDeviceHardwarePlatform.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
