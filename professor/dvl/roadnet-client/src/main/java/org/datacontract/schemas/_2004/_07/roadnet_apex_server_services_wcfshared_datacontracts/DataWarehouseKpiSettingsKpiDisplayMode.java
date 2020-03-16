
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseKpiSettings.KpiDisplayMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseKpiSettings.KpiDisplayMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bar"/&gt;
 *     &lt;enumeration value="Column"/&gt;
 *     &lt;enumeration value="Pie"/&gt;
 *     &lt;enumeration value="Bubble"/&gt;
 *     &lt;enumeration value="Line"/&gt;
 *     &lt;enumeration value="Area"/&gt;
 *     &lt;enumeration value="AreaSpline"/&gt;
 *     &lt;enumeration value="Spline"/&gt;
 *     &lt;enumeration value="Grid"/&gt;
 *     &lt;enumeration value="Timeline"/&gt;
 *     &lt;enumeration value="Treemap"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseKpiSettings.KpiDisplayMode")
@XmlEnum
public enum DataWarehouseKpiSettingsKpiDisplayMode {

    @XmlEnumValue("Bar")
    BAR("Bar"),
    @XmlEnumValue("Column")
    COLUMN("Column"),
    @XmlEnumValue("Pie")
    PIE("Pie"),
    @XmlEnumValue("Bubble")
    BUBBLE("Bubble"),
    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("AreaSpline")
    AREA_SPLINE("AreaSpline"),
    @XmlEnumValue("Spline")
    SPLINE("Spline"),
    @XmlEnumValue("Grid")
    GRID("Grid"),
    @XmlEnumValue("Timeline")
    TIMELINE("Timeline"),
    @XmlEnumValue("Treemap")
    TREEMAP("Treemap");
    private final String value;

    DataWarehouseKpiSettingsKpiDisplayMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseKpiSettingsKpiDisplayMode fromValue(String v) {
        for (DataWarehouseKpiSettingsKpiDisplayMode c: DataWarehouseKpiSettingsKpiDisplayMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
