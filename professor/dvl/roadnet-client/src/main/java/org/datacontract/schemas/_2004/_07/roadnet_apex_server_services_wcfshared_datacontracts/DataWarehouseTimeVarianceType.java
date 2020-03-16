
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseTimeVarianceType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseTimeVarianceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Early"/&gt;
 *     &lt;enumeration value="OnTime"/&gt;
 *     &lt;enumeration value="Late"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseTimeVarianceType")
@XmlEnum
public enum DataWarehouseTimeVarianceType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Early")
    EARLY("Early"),
    @XmlEnumValue("OnTime")
    ON_TIME("OnTime"),
    @XmlEnumValue("Late")
    LATE("Late");
    private final String value;

    DataWarehouseTimeVarianceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseTimeVarianceType fromValue(String v) {
        for (DataWarehouseTimeVarianceType c: DataWarehouseTimeVarianceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
