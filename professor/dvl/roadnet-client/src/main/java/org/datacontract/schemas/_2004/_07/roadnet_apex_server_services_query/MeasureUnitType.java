
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MeasureUnitType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasureUnitType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Hours"/&gt;
 *     &lt;enumeration value="Miles"/&gt;
 *     &lt;enumeration value="Currency"/&gt;
 *     &lt;enumeration value="Number"/&gt;
 *     &lt;enumeration value="Count"/&gt;
 *     &lt;enumeration value="Percent"/&gt;
 *     &lt;enumeration value="Gallons"/&gt;
 *     &lt;enumeration value="Kilometers"/&gt;
 *     &lt;enumeration value="Liters"/&gt;
 *     &lt;enumeration value="Minutes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeasureUnitType")
@XmlEnum
public enum MeasureUnitType {

    @XmlEnumValue("Hours")
    HOURS("Hours"),
    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("Count")
    COUNT("Count"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("Gallons")
    GALLONS("Gallons"),
    @XmlEnumValue("Kilometers")
    KILOMETERS("Kilometers"),
    @XmlEnumValue("Liters")
    LITERS("Liters"),
    @XmlEnumValue("Minutes")
    MINUTES("Minutes");
    private final String value;

    MeasureUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasureUnitType fromValue(String v) {
        for (MeasureUnitType c: MeasureUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
