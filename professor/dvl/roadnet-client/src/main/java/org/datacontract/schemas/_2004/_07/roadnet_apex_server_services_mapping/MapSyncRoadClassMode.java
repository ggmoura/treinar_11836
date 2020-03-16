
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MapSyncRoadClassMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MapSyncRoadClassMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="EntireDatabase"/&gt;
 *     &lt;enumeration value="LimitToState"/&gt;
 *     &lt;enumeration value="LimitToView"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MapSyncRoadClassMode")
@XmlEnum
public enum MapSyncRoadClassMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("EntireDatabase")
    ENTIRE_DATABASE("EntireDatabase"),
    @XmlEnumValue("LimitToState")
    LIMIT_TO_STATE("LimitToState"),
    @XmlEnumValue("LimitToView")
    LIMIT_TO_VIEW("LimitToView");
    private final String value;

    MapSyncRoadClassMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MapSyncRoadClassMode fromValue(String v) {
        for (MapSyncRoadClassMode c: MapSyncRoadClassMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
