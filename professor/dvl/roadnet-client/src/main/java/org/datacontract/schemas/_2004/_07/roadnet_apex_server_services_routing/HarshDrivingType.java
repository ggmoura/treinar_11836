
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HarshDrivingType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HarshDrivingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Acceleration"/&gt;
 *     &lt;enumeration value="Braking"/&gt;
 *     &lt;enumeration value="Cornering"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HarshDrivingType")
@XmlEnum
public enum HarshDrivingType {

    @XmlEnumValue("Acceleration")
    ACCELERATION("Acceleration"),
    @XmlEnumValue("Braking")
    BRAKING("Braking"),
    @XmlEnumValue("Cornering")
    CORNERING("Cornering");
    private final String value;

    HarshDrivingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HarshDrivingType fromValue(String v) {
        for (HarshDrivingType c: HarshDrivingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
