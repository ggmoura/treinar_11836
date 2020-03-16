
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseCompositeMeasureType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseCompositeMeasureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RunTime"/&gt;
 *     &lt;enumeration value="CargoCapacityUtilization"/&gt;
 *     &lt;enumeration value="MissedTimeWindowsCount"/&gt;
 *     &lt;enumeration value="PercentOnTime"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseCompositeMeasureType")
@XmlEnum
public enum DataWarehouseCompositeMeasureType {

    @XmlEnumValue("RunTime")
    RUN_TIME("RunTime"),
    @XmlEnumValue("CargoCapacityUtilization")
    CARGO_CAPACITY_UTILIZATION("CargoCapacityUtilization"),
    @XmlEnumValue("MissedTimeWindowsCount")
    MISSED_TIME_WINDOWS_COUNT("MissedTimeWindowsCount"),
    @XmlEnumValue("PercentOnTime")
    PERCENT_ON_TIME("PercentOnTime"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    DataWarehouseCompositeMeasureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseCompositeMeasureType fromValue(String v) {
        for (DataWarehouseCompositeMeasureType c: DataWarehouseCompositeMeasureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
