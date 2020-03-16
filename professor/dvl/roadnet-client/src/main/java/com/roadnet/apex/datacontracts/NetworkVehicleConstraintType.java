
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkVehicleConstraintType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkVehicleConstraintType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Commercial"/&gt;
 *     &lt;enumeration value="Hazmat"/&gt;
 *     &lt;enumeration value="MaxHeight"/&gt;
 *     &lt;enumeration value="MaxWeight"/&gt;
 *     &lt;enumeration value="MaxWidth"/&gt;
 *     &lt;enumeration value="HighOccupancy"/&gt;
 *     &lt;enumeration value="Delivery"/&gt;
 *     &lt;enumeration value="TotalLength"/&gt;
 *     &lt;enumeration value="KpraLength"/&gt;
 *     &lt;enumeration value="AxleCount"/&gt;
 *     &lt;enumeration value="WeightPerAxle"/&gt;
 *     &lt;enumeration value="TrailerCount"/&gt;
 *     &lt;enumeration value="TrailerLength"/&gt;
 *     &lt;enumeration value="HazmatClass"/&gt;
 *     &lt;enumeration value="PhysicalHeight"/&gt;
 *     &lt;enumeration value="LegalHeight"/&gt;
 *     &lt;enumeration value="PhysicalWeight"/&gt;
 *     &lt;enumeration value="LegalWeight"/&gt;
 *     &lt;enumeration value="PhysicalWidth"/&gt;
 *     &lt;enumeration value="LegalWidth"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkVehicleConstraintType")
@XmlEnum
public enum NetworkVehicleConstraintType {

    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial"),
    @XmlEnumValue("Hazmat")
    HAZMAT("Hazmat"),
    @XmlEnumValue("MaxHeight")
    MAX_HEIGHT("MaxHeight"),
    @XmlEnumValue("MaxWeight")
    MAX_WEIGHT("MaxWeight"),
    @XmlEnumValue("MaxWidth")
    MAX_WIDTH("MaxWidth"),
    @XmlEnumValue("HighOccupancy")
    HIGH_OCCUPANCY("HighOccupancy"),
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery"),
    @XmlEnumValue("TotalLength")
    TOTAL_LENGTH("TotalLength"),
    @XmlEnumValue("KpraLength")
    KPRA_LENGTH("KpraLength"),
    @XmlEnumValue("AxleCount")
    AXLE_COUNT("AxleCount"),
    @XmlEnumValue("WeightPerAxle")
    WEIGHT_PER_AXLE("WeightPerAxle"),
    @XmlEnumValue("TrailerCount")
    TRAILER_COUNT("TrailerCount"),
    @XmlEnumValue("TrailerLength")
    TRAILER_LENGTH("TrailerLength"),
    @XmlEnumValue("HazmatClass")
    HAZMAT_CLASS("HazmatClass"),
    @XmlEnumValue("PhysicalHeight")
    PHYSICAL_HEIGHT("PhysicalHeight"),
    @XmlEnumValue("LegalHeight")
    LEGAL_HEIGHT("LegalHeight"),
    @XmlEnumValue("PhysicalWeight")
    PHYSICAL_WEIGHT("PhysicalWeight"),
    @XmlEnumValue("LegalWeight")
    LEGAL_WEIGHT("LegalWeight"),
    @XmlEnumValue("PhysicalWidth")
    PHYSICAL_WIDTH("PhysicalWidth"),
    @XmlEnumValue("LegalWidth")
    LEGAL_WIDTH("LegalWidth");
    private final String value;

    NetworkVehicleConstraintType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkVehicleConstraintType fromValue(String v) {
        for (NetworkVehicleConstraintType c: NetworkVehicleConstraintType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
