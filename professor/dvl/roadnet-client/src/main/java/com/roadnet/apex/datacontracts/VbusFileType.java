
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VbusFileType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VbusFileType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="vPodFirmware"/&gt;
 *     &lt;enumeration value="vPodVehicleDatabase"/&gt;
 *     &lt;enumeration value="jPodFirmware"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VbusFileType")
@XmlEnum
public enum VbusFileType {

    @XmlEnumValue("vPodFirmware")
    V_POD_FIRMWARE("vPodFirmware"),
    @XmlEnumValue("vPodVehicleDatabase")
    V_POD_VEHICLE_DATABASE("vPodVehicleDatabase"),
    @XmlEnumValue("jPodFirmware")
    J_POD_FIRMWARE("jPodFirmware");
    private final String value;

    VbusFileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VbusFileType fromValue(String v) {
        for (VbusFileType c: VbusFileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
