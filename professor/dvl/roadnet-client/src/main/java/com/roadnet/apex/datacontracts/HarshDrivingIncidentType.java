
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HarshDrivingIncidentType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HarshDrivingIncidentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cornering"/&gt;
 *     &lt;enumeration value="Braking"/&gt;
 *     &lt;enumeration value="Acceleration"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HarshDrivingIncidentType")
@XmlEnum
public enum HarshDrivingIncidentType {

    @XmlEnumValue("Cornering")
    CORNERING("Cornering"),
    @XmlEnumValue("Braking")
    BRAKING("Braking"),
    @XmlEnumValue("Acceleration")
    ACCELERATION("Acceleration");
    private final String value;

    HarshDrivingIncidentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HarshDrivingIncidentType fromValue(String v) {
        for (HarshDrivingIncidentType c: HarshDrivingIncidentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
