
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MapSyncRoadClassOperation.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MapSyncRoadClassOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="AbsoluteValue"/&gt;
 *     &lt;enumeration value="PercentIncrease"/&gt;
 *     &lt;enumeration value="PercentDecrease"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MapSyncRoadClassOperation")
@XmlEnum
public enum MapSyncRoadClassOperation {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("AbsoluteValue")
    ABSOLUTE_VALUE("AbsoluteValue"),
    @XmlEnumValue("PercentIncrease")
    PERCENT_INCREASE("PercentIncrease"),
    @XmlEnumValue("PercentDecrease")
    PERCENT_DECREASE("PercentDecrease");
    private final String value;

    MapSyncRoadClassOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MapSyncRoadClassOperation fromValue(String v) {
        for (MapSyncRoadClassOperation c: MapSyncRoadClassOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
