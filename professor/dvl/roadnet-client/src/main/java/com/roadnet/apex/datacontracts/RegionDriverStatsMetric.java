
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.DriverStatsMetric.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.DriverStatsMetric"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="StopsCompletedVsPlan"/&gt;
 *     &lt;enumeration value="ProjectedCompleteVsPlan"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.DriverStatsMetric")
@XmlEnum
public enum RegionDriverStatsMetric {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("StopsCompletedVsPlan")
    STOPS_COMPLETED_VS_PLAN("StopsCompletedVsPlan"),
    @XmlEnumValue("ProjectedCompleteVsPlan")
    PROJECTED_COMPLETE_VS_PLAN("ProjectedCompleteVsPlan");
    private final String value;

    RegionDriverStatsMetric(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionDriverStatsMetric fromValue(String v) {
        for (RegionDriverStatsMetric c: RegionDriverStatsMetric.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
