
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MobileQuantityItemSource.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileQuantityItemSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Planned"/&gt;
 *     &lt;enumeration value="DispatcherAdded"/&gt;
 *     &lt;enumeration value="DriverAdded"/&gt;
 *     &lt;enumeration value="HelperAdded"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileQuantityItemSource")
@XmlEnum
public enum MobileQuantityItemSource {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Planned")
    PLANNED("Planned"),
    @XmlEnumValue("DispatcherAdded")
    DISPATCHER_ADDED("DispatcherAdded"),
    @XmlEnumValue("DriverAdded")
    DRIVER_ADDED("DriverAdded"),
    @XmlEnumValue("HelperAdded")
    HELPER_ADDED("HelperAdded");
    private final String value;

    MobileQuantityItemSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobileQuantityItemSource fromValue(String v) {
        for (MobileQuantityItemSource c: MobileQuantityItemSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
