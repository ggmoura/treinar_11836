
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TotalEngineRuntimeSource.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TotalEngineRuntimeSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="VehicleBus"/&gt;
 *     &lt;enumeration value="Device"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TotalEngineRuntimeSource", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared")
@XmlEnum
public enum TotalEngineRuntimeSource {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("VehicleBus")
    VEHICLE_BUS("VehicleBus"),
    @XmlEnumValue("Device")
    DEVICE("Device");
    private final String value;

    TotalEngineRuntimeSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TotalEngineRuntimeSource fromValue(String v) {
        for (TotalEngineRuntimeSource c: TotalEngineRuntimeSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
