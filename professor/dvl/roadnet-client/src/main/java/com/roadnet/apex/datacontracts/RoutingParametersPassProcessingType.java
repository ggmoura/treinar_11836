
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoutingParameters.PassProcessingType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutingParameters.PassProcessingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CompareAndUseBest"/&gt;
 *     &lt;enumeration value="UseAll"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoutingParameters.PassProcessingType")
@XmlEnum
public enum RoutingParametersPassProcessingType {

    @XmlEnumValue("CompareAndUseBest")
    COMPARE_AND_USE_BEST("CompareAndUseBest"),
    @XmlEnumValue("UseAll")
    USE_ALL("UseAll");
    private final String value;

    RoutingParametersPassProcessingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutingParametersPassProcessingType fromValue(String v) {
        for (RoutingParametersPassProcessingType c: RoutingParametersPassProcessingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
