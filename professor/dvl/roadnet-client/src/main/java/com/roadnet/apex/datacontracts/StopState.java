
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StopState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StopState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Arrived"/&gt;
 *     &lt;enumeration value="Servicing"/&gt;
 *     &lt;enumeration value="Departed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StopState")
@XmlEnum
public enum StopState {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Arrived")
    ARRIVED("Arrived"),
    @XmlEnumValue("Servicing")
    SERVICING("Servicing"),
    @XmlEnumValue("Departed")
    DEPARTED("Departed");
    private final String value;

    StopState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopState fromValue(String v) {
        for (StopState c: StopState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
