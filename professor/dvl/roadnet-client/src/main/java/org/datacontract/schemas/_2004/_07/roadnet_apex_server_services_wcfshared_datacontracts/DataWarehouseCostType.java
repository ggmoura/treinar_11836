
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseCostType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseCostType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Total"/&gt;
 *     &lt;enumeration value="EquipmentFixedCost"/&gt;
 *     &lt;enumeration value="EquipmentDistanceCost"/&gt;
 *     &lt;enumeration value="WorkerHourlyCost"/&gt;
 *     &lt;enumeration value="WorkerOvertimeCost"/&gt;
 *     &lt;enumeration value="WorkerStopCost"/&gt;
 *     &lt;enumeration value="WorkerDistanceCost"/&gt;
 *     &lt;enumeration value="WorkerPerQuantityCost"/&gt;
 *     &lt;enumeration value="WorkerFixedCost"/&gt;
 *     &lt;enumeration value="Fee"/&gt;
 *     &lt;enumeration value="FuelUsedCost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseCostType")
@XmlEnum
public enum DataWarehouseCostType {

    @XmlEnumValue("Total")
    TOTAL("Total"),
    @XmlEnumValue("EquipmentFixedCost")
    EQUIPMENT_FIXED_COST("EquipmentFixedCost"),
    @XmlEnumValue("EquipmentDistanceCost")
    EQUIPMENT_DISTANCE_COST("EquipmentDistanceCost"),
    @XmlEnumValue("WorkerHourlyCost")
    WORKER_HOURLY_COST("WorkerHourlyCost"),
    @XmlEnumValue("WorkerOvertimeCost")
    WORKER_OVERTIME_COST("WorkerOvertimeCost"),
    @XmlEnumValue("WorkerStopCost")
    WORKER_STOP_COST("WorkerStopCost"),
    @XmlEnumValue("WorkerDistanceCost")
    WORKER_DISTANCE_COST("WorkerDistanceCost"),
    @XmlEnumValue("WorkerPerQuantityCost")
    WORKER_PER_QUANTITY_COST("WorkerPerQuantityCost"),
    @XmlEnumValue("WorkerFixedCost")
    WORKER_FIXED_COST("WorkerFixedCost"),
    @XmlEnumValue("Fee")
    FEE("Fee"),
    @XmlEnumValue("FuelUsedCost")
    FUEL_USED_COST("FuelUsedCost");
    private final String value;

    DataWarehouseCostType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseCostType fromValue(String v) {
        for (DataWarehouseCostType c: DataWarehouseCostType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
