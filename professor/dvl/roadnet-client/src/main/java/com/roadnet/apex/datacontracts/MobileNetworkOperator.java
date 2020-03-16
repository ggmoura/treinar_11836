
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MobileNetworkOperator.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileNetworkOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sprint"/&gt;
 *     &lt;enumeration value="Verizon"/&gt;
 *     &lt;enumeration value="ATT"/&gt;
 *     &lt;enumeration value="TMobile"/&gt;
 *     &lt;enumeration value="BellCanada"/&gt;
 *     &lt;enumeration value="Telus"/&gt;
 *     &lt;enumeration value="Rogers"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileNetworkOperator")
@XmlEnum
public enum MobileNetworkOperator {

    @XmlEnumValue("Sprint")
    SPRINT("Sprint"),
    @XmlEnumValue("Verizon")
    VERIZON("Verizon"),
    ATT("ATT"),
    @XmlEnumValue("TMobile")
    T_MOBILE("TMobile"),
    @XmlEnumValue("BellCanada")
    BELL_CANADA("BellCanada"),
    @XmlEnumValue("Telus")
    TELUS("Telus"),
    @XmlEnumValue("Rogers")
    ROGERS("Rogers"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    MobileNetworkOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobileNetworkOperator fromValue(String v) {
        for (MobileNetworkOperator c: MobileNetworkOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
