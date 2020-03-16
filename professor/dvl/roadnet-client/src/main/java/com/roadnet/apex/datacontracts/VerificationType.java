
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VerificationType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ScanOn"/&gt;
 *     &lt;enumeration value="Pickup"/&gt;
 *     &lt;enumeration value="Delivery"/&gt;
 *     &lt;enumeration value="ScanOff"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerificationType")
@XmlEnum
public enum VerificationType {

    @XmlEnumValue("ScanOn")
    SCAN_ON("ScanOn"),
    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery"),
    @XmlEnumValue("ScanOff")
    SCAN_OFF("ScanOff");
    private final String value;

    VerificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerificationType fromValue(String v) {
        for (VerificationType c: VerificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
