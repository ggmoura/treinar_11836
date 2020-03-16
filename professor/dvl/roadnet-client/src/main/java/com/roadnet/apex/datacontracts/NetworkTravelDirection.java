
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkTravelDirection.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkTravelDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TwoWay"/&gt;
 *     &lt;enumeration value="OneWayTowardStart"/&gt;
 *     &lt;enumeration value="OneWayTowardEnd"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkTravelDirection")
@XmlEnum
public enum NetworkTravelDirection {

    @XmlEnumValue("TwoWay")
    TWO_WAY("TwoWay"),
    @XmlEnumValue("OneWayTowardStart")
    ONE_WAY_TOWARD_START("OneWayTowardStart"),
    @XmlEnumValue("OneWayTowardEnd")
    ONE_WAY_TOWARD_END("OneWayTowardEnd");
    private final String value;

    NetworkTravelDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkTravelDirection fromValue(String v) {
        for (NetworkTravelDirection c: NetworkTravelDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
