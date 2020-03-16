
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LocationAccessPoint.AccessType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationAccessPoint.AccessType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EntryAndExit"/&gt;
 *     &lt;enumeration value="EntryOnly"/&gt;
 *     &lt;enumeration value="ExitOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationAccessPoint.AccessType")
@XmlEnum
public enum LocationAccessPointAccessType {

    @XmlEnumValue("EntryAndExit")
    ENTRY_AND_EXIT("EntryAndExit"),
    @XmlEnumValue("EntryOnly")
    ENTRY_ONLY("EntryOnly"),
    @XmlEnumValue("ExitOnly")
    EXIT_ONLY("ExitOnly");
    private final String value;

    LocationAccessPointAccessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationAccessPointAccessType fromValue(String v) {
        for (LocationAccessPointAccessType c: LocationAccessPointAccessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
