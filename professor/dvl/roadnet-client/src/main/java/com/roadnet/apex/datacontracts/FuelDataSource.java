
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FuelDataSource.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FuelDataSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="ReportedByTelematicsDevice"/&gt;
 *     &lt;enumeration value="EstimatedUsingDuration"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FuelDataSource")
@XmlEnum
public enum FuelDataSource {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("ReportedByTelematicsDevice")
    REPORTED_BY_TELEMATICS_DEVICE("ReportedByTelematicsDevice"),
    @XmlEnumValue("EstimatedUsingDuration")
    ESTIMATED_USING_DURATION("EstimatedUsingDuration");
    private final String value;

    FuelDataSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelDataSource fromValue(String v) {
        for (FuelDataSource c: FuelDataSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
