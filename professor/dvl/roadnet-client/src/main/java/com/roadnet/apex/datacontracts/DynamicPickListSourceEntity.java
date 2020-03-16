
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DynamicPickListSourceEntity.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DynamicPickListSourceEntity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="StopServiceLocation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DynamicPickListSourceEntity")
@XmlEnum
public enum DynamicPickListSourceEntity {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("StopServiceLocation")
    STOP_SERVICE_LOCATION("StopServiceLocation");
    private final String value;

    DynamicPickListSourceEntity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicPickListSourceEntity fromValue(String v) {
        for (DynamicPickListSourceEntity c: DynamicPickListSourceEntity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
