
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DiagnosticTroubleCodeClassification.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticTroubleCodeClassification"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Engine"/&gt;
 *     &lt;enumeration value="Transmission"/&gt;
 *     &lt;enumeration value="Brakes"/&gt;
 *     &lt;enumeration value="ClimateControl"/&gt;
 *     &lt;enumeration value="GearSelector"/&gt;
 *     &lt;enumeration value="Steering"/&gt;
 *     &lt;enumeration value="CruiseControl"/&gt;
 *     &lt;enumeration value="Immobilizer"/&gt;
 *     &lt;enumeration value="Fuel"/&gt;
 *     &lt;enumeration value="Battery"/&gt;
 *     &lt;enumeration value="ElectronicControlUnit"/&gt;
 *     &lt;enumeration value="SpeedSensor"/&gt;
 *     &lt;enumeration value="RoughRoadSensor"/&gt;
 *     &lt;enumeration value="Body"/&gt;
 *     &lt;enumeration value="Chassis"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticTroubleCodeClassification")
@XmlEnum
public enum DiagnosticTroubleCodeClassification {

    @XmlEnumValue("Engine")
    ENGINE("Engine"),
    @XmlEnumValue("Transmission")
    TRANSMISSION("Transmission"),
    @XmlEnumValue("Brakes")
    BRAKES("Brakes"),
    @XmlEnumValue("ClimateControl")
    CLIMATE_CONTROL("ClimateControl"),
    @XmlEnumValue("GearSelector")
    GEAR_SELECTOR("GearSelector"),
    @XmlEnumValue("Steering")
    STEERING("Steering"),
    @XmlEnumValue("CruiseControl")
    CRUISE_CONTROL("CruiseControl"),
    @XmlEnumValue("Immobilizer")
    IMMOBILIZER("Immobilizer"),
    @XmlEnumValue("Fuel")
    FUEL("Fuel"),
    @XmlEnumValue("Battery")
    BATTERY("Battery"),
    @XmlEnumValue("ElectronicControlUnit")
    ELECTRONIC_CONTROL_UNIT("ElectronicControlUnit"),
    @XmlEnumValue("SpeedSensor")
    SPEED_SENSOR("SpeedSensor"),
    @XmlEnumValue("RoughRoadSensor")
    ROUGH_ROAD_SENSOR("RoughRoadSensor"),
    @XmlEnumValue("Body")
    BODY("Body"),
    @XmlEnumValue("Chassis")
    CHASSIS("Chassis"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DiagnosticTroubleCodeClassification(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosticTroubleCodeClassification fromValue(String v) {
        for (DiagnosticTroubleCodeClassification c: DiagnosticTroubleCodeClassification.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
