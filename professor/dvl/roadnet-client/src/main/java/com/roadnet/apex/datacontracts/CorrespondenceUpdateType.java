
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CorrespondenceUpdateType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CorrespondenceUpdateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Received"/&gt;
 *     &lt;enumeration value="Read"/&gt;
 *     &lt;enumeration value="Trashed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorrespondenceUpdateType")
@XmlEnum
public enum CorrespondenceUpdateType {

    @XmlEnumValue("Received")
    RECEIVED("Received"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Trashed")
    TRASHED("Trashed");
    private final String value;

    CorrespondenceUpdateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CorrespondenceUpdateType fromValue(String v) {
        for (CorrespondenceUpdateType c: CorrespondenceUpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
