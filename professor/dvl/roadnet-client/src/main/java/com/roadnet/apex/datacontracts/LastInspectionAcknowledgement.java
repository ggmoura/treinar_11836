
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LastInspectionAcknowledgement.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LastInspectionAcknowledgement"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotAcknownledged"/&gt;
 *     &lt;enumeration value="YesAndWasAvailable"/&gt;
 *     &lt;enumeration value="YesAndNotAvailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LastInspectionAcknowledgement")
@XmlEnum
public enum LastInspectionAcknowledgement {

    @XmlEnumValue("NotAcknownledged")
    NOT_ACKNOWNLEDGED("NotAcknownledged"),
    @XmlEnumValue("YesAndWasAvailable")
    YES_AND_WAS_AVAILABLE("YesAndWasAvailable"),
    @XmlEnumValue("YesAndNotAvailable")
    YES_AND_NOT_AVAILABLE("YesAndNotAvailable");
    private final String value;

    LastInspectionAcknowledgement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LastInspectionAcknowledgement fromValue(String v) {
        for (LastInspectionAcknowledgement c: LastInspectionAcknowledgement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
