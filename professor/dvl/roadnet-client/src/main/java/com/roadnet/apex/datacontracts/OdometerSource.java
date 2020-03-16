
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OdometerSource.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OdometerSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="VehicleBus"/&gt;
 *     &lt;enumeration value="Device"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OdometerSource")
@XmlEnum
public enum OdometerSource {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("VehicleBus")
    VEHICLE_BUS("VehicleBus"),
    @XmlEnumValue("Device")
    DEVICE("Device");
    private final String value;

    OdometerSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OdometerSource fromValue(String v) {
        for (OdometerSource c: OdometerSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
