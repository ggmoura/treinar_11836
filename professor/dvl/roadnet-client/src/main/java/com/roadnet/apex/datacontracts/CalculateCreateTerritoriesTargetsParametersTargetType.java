
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CalculateCreateTerritoriesTargetsParameters.TargetType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculateCreateTerritoriesTargetsParameters.TargetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NumberOfTerritories"/&gt;
 *     &lt;enumeration value="QuantitySize1"/&gt;
 *     &lt;enumeration value="QuantitySize2"/&gt;
 *     &lt;enumeration value="QuantitySize3"/&gt;
 *     &lt;enumeration value="ServiceTime"/&gt;
 *     &lt;enumeration value="NumberOfStops"/&gt;
 *     &lt;enumeration value="NumberOfOrders"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalculateCreateTerritoriesTargetsParameters.TargetType")
@XmlEnum
public enum CalculateCreateTerritoriesTargetsParametersTargetType {

    @XmlEnumValue("NumberOfTerritories")
    NUMBER_OF_TERRITORIES("NumberOfTerritories"),
    @XmlEnumValue("QuantitySize1")
    QUANTITY_SIZE_1("QuantitySize1"),
    @XmlEnumValue("QuantitySize2")
    QUANTITY_SIZE_2("QuantitySize2"),
    @XmlEnumValue("QuantitySize3")
    QUANTITY_SIZE_3("QuantitySize3"),
    @XmlEnumValue("ServiceTime")
    SERVICE_TIME("ServiceTime"),
    @XmlEnumValue("NumberOfStops")
    NUMBER_OF_STOPS("NumberOfStops"),
    @XmlEnumValue("NumberOfOrders")
    NUMBER_OF_ORDERS("NumberOfOrders");
    private final String value;

    CalculateCreateTerritoriesTargetsParametersTargetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculateCreateTerritoriesTargetsParametersTargetType fromValue(String v) {
        for (CalculateCreateTerritoriesTargetsParametersTargetType c: CalculateCreateTerritoriesTargetsParametersTargetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
