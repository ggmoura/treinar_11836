
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseStopInfoDimension.StopExecutionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseStopInfoDimension.StopExecutionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="PlannedOnly"/&gt;
 *     &lt;enumeration value="ExecutedOnly"/&gt;
 *     &lt;enumeration value="PlannedAndExecuted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseStopInfoDimension.StopExecutionType")
@XmlEnum
public enum DataWarehouseStopInfoDimensionStopExecutionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("PlannedOnly")
    PLANNED_ONLY("PlannedOnly"),
    @XmlEnumValue("ExecutedOnly")
    EXECUTED_ONLY("ExecutedOnly"),
    @XmlEnumValue("PlannedAndExecuted")
    PLANNED_AND_EXECUTED("PlannedAndExecuted");
    private final String value;

    DataWarehouseStopInfoDimensionStopExecutionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseStopInfoDimensionStopExecutionType fromValue(String v) {
        for (DataWarehouseStopInfoDimensionStopExecutionType c: DataWarehouseStopInfoDimensionStopExecutionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
