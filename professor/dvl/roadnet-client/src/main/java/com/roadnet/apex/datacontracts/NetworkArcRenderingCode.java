
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkArcRenderingCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkArcRenderingCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Interstate"/&gt;
 *     &lt;enumeration value="Primary"/&gt;
 *     &lt;enumeration value="Secondary"/&gt;
 *     &lt;enumeration value="Local"/&gt;
 *     &lt;enumeration value="HighwayRamp"/&gt;
 *     &lt;enumeration value="LocalRamp"/&gt;
 *     &lt;enumeration value="TrafficCircle"/&gt;
 *     &lt;enumeration value="UnpavedRoad"/&gt;
 *     &lt;enumeration value="VehicleFerry"/&gt;
 *     &lt;enumeration value="PassengerFerry"/&gt;
 *     &lt;enumeration value="Walkway"/&gt;
 *     &lt;enumeration value="Alley"/&gt;
 *     &lt;enumeration value="ParkingAisle"/&gt;
 *     &lt;enumeration value="Driveway"/&gt;
 *     &lt;enumeration value="RoughTerrain"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkArcRenderingCode")
@XmlEnum
public enum NetworkArcRenderingCode {

    @XmlEnumValue("Interstate")
    INTERSTATE("Interstate"),
    @XmlEnumValue("Primary")
    PRIMARY("Primary"),
    @XmlEnumValue("Secondary")
    SECONDARY("Secondary"),
    @XmlEnumValue("Local")
    LOCAL("Local"),
    @XmlEnumValue("HighwayRamp")
    HIGHWAY_RAMP("HighwayRamp"),
    @XmlEnumValue("LocalRamp")
    LOCAL_RAMP("LocalRamp"),
    @XmlEnumValue("TrafficCircle")
    TRAFFIC_CIRCLE("TrafficCircle"),
    @XmlEnumValue("UnpavedRoad")
    UNPAVED_ROAD("UnpavedRoad"),
    @XmlEnumValue("VehicleFerry")
    VEHICLE_FERRY("VehicleFerry"),
    @XmlEnumValue("PassengerFerry")
    PASSENGER_FERRY("PassengerFerry"),
    @XmlEnumValue("Walkway")
    WALKWAY("Walkway"),
    @XmlEnumValue("Alley")
    ALLEY("Alley"),
    @XmlEnumValue("ParkingAisle")
    PARKING_AISLE("ParkingAisle"),
    @XmlEnumValue("Driveway")
    DRIVEWAY("Driveway"),
    @XmlEnumValue("RoughTerrain")
    ROUGH_TERRAIN("RoughTerrain");
    private final String value;

    NetworkArcRenderingCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkArcRenderingCode fromValue(String v) {
        for (NetworkArcRenderingCode c: NetworkArcRenderingCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
