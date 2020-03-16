
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MapSyncRoadClassLevel.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MapSyncRoadClassLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Interstates"/&gt;
 *     &lt;enumeration value="PrimaryRoads"/&gt;
 *     &lt;enumeration value="SecondaryRoads"/&gt;
 *     &lt;enumeration value="LocalRoads"/&gt;
 *     &lt;enumeration value="Ramps"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MapSyncRoadClassLevel")
@XmlEnum
public enum MapSyncRoadClassLevel {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Interstates")
    INTERSTATES("Interstates"),
    @XmlEnumValue("PrimaryRoads")
    PRIMARY_ROADS("PrimaryRoads"),
    @XmlEnumValue("SecondaryRoads")
    SECONDARY_ROADS("SecondaryRoads"),
    @XmlEnumValue("LocalRoads")
    LOCAL_ROADS("LocalRoads"),
    @XmlEnumValue("Ramps")
    RAMPS("Ramps");
    private final String value;

    MapSyncRoadClassLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MapSyncRoadClassLevel fromValue(String v) {
        for (MapSyncRoadClassLevel c: MapSyncRoadClassLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
