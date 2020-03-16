
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkSpatialItemType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkSpatialItemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Arc"/&gt;
 *     &lt;enumeration value="PointAddress"/&gt;
 *     &lt;enumeration value="POI"/&gt;
 *     &lt;enumeration value="TravelPolygon"/&gt;
 *     &lt;enumeration value="TravelPath"/&gt;
 *     &lt;enumeration value="Impasse"/&gt;
 *     &lt;enumeration value="TurnRule"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkSpatialItemType")
@XmlEnum
public enum NetworkSpatialItemType {

    @XmlEnumValue("Arc")
    ARC("Arc"),
    @XmlEnumValue("PointAddress")
    POINT_ADDRESS("PointAddress"),
    POI("POI"),
    @XmlEnumValue("TravelPolygon")
    TRAVEL_POLYGON("TravelPolygon"),
    @XmlEnumValue("TravelPath")
    TRAVEL_PATH("TravelPath"),
    @XmlEnumValue("Impasse")
    IMPASSE("Impasse"),
    @XmlEnumValue("TurnRule")
    TURN_RULE("TurnRule");
    private final String value;

    NetworkSpatialItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkSpatialItemType fromValue(String v) {
        for (NetworkSpatialItemType c: NetworkSpatialItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
