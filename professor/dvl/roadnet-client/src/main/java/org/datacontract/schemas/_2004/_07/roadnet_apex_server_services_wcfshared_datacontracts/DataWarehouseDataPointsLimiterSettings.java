
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseDataPointsLimiterSettings.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataWarehouseDataPointsLimiterSettings"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Count"/&gt;
 *     &lt;enumeration value="PercentOfValue"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataWarehouseDataPointsLimiterSettings")
@XmlEnum
public enum DataWarehouseDataPointsLimiterSettings {

    @XmlEnumValue("Count")
    COUNT("Count"),
    @XmlEnumValue("PercentOfValue")
    PERCENT_OF_VALUE("PercentOfValue");
    private final String value;

    DataWarehouseDataPointsLimiterSettings(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataWarehouseDataPointsLimiterSettings fromValue(String v) {
        for (DataWarehouseDataPointsLimiterSettings c: DataWarehouseDataPointsLimiterSettings.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
