
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleInterface.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleInterface"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="jPod"/&gt;
 *     &lt;enumeration value="vPod"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleInterface")
@XmlEnum
public enum VehicleInterface {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("jPod")
    J_POD("jPod"),
    @XmlEnumValue("vPod")
    V_POD("vPod");
    private final String value;

    VehicleInterface(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleInterface fromValue(String v) {
        for (VehicleInterface c: VehicleInterface.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
