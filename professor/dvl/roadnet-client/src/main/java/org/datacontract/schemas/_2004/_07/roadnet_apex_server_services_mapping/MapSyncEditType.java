
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MapSyncEditType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MapSyncEditType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="AddArc"/&gt;
 *     &lt;enumeration value="DeleteArc"/&gt;
 *     &lt;enumeration value="UpdateArc"/&gt;
 *     &lt;enumeration value="AddPOI"/&gt;
 *     &lt;enumeration value="DeletePOI"/&gt;
 *     &lt;enumeration value="UpdatePOI"/&gt;
 *     &lt;enumeration value="TurnPenalty"/&gt;
 *     &lt;enumeration value="AddImpasse"/&gt;
 *     &lt;enumeration value="DeleteImpasse"/&gt;
 *     &lt;enumeration value="RoadClass"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MapSyncEditType")
@XmlEnum
public enum MapSyncEditType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("AddArc")
    ADD_ARC("AddArc"),
    @XmlEnumValue("DeleteArc")
    DELETE_ARC("DeleteArc"),
    @XmlEnumValue("UpdateArc")
    UPDATE_ARC("UpdateArc"),
    @XmlEnumValue("AddPOI")
    ADD_POI("AddPOI"),
    @XmlEnumValue("DeletePOI")
    DELETE_POI("DeletePOI"),
    @XmlEnumValue("UpdatePOI")
    UPDATE_POI("UpdatePOI"),
    @XmlEnumValue("TurnPenalty")
    TURN_PENALTY("TurnPenalty"),
    @XmlEnumValue("AddImpasse")
    ADD_IMPASSE("AddImpasse"),
    @XmlEnumValue("DeleteImpasse")
    DELETE_IMPASSE("DeleteImpasse"),
    @XmlEnumValue("RoadClass")
    ROAD_CLASS("RoadClass");
    private final String value;

    MapSyncEditType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MapSyncEditType fromValue(String v) {
        for (MapSyncEditType c: MapSyncEditType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
