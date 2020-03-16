
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataCommunicationsType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataCommunicationsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Cellular"/&gt;
 *     &lt;enumeration value="Satellite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataCommunicationsType")
@XmlEnum
public enum DataCommunicationsType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Cellular")
    CELLULAR("Cellular"),
    @XmlEnumValue("Satellite")
    SATELLITE("Satellite");
    private final String value;

    DataCommunicationsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataCommunicationsType fromValue(String v) {
        for (DataCommunicationsType c: DataCommunicationsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
