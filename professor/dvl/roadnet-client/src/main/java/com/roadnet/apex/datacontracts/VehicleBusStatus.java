
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleBusStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleBusStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Detected"/&gt;
 *     &lt;enumeration value="NotDetectedVinSent"/&gt;
 *     &lt;enumeration value="NotDetectedNoVinConfigured"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleBusStatus")
@XmlEnum
public enum VehicleBusStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Detected")
    DETECTED("Detected"),
    @XmlEnumValue("NotDetectedVinSent")
    NOT_DETECTED_VIN_SENT("NotDetectedVinSent"),
    @XmlEnumValue("NotDetectedNoVinConfigured")
    NOT_DETECTED_NO_VIN_CONFIGURED("NotDetectedNoVinConfigured");
    private final String value;

    VehicleBusStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleBusStatus fromValue(String v) {
        for (VehicleBusStatus c: VehicleBusStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
