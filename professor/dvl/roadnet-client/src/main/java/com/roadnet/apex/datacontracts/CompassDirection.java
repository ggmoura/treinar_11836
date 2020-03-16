
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CompassDirection.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CompassDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="North"/&gt;
 *     &lt;enumeration value="South"/&gt;
 *     &lt;enumeration value="East"/&gt;
 *     &lt;enumeration value="West"/&gt;
 *     &lt;enumeration value="Northeast"/&gt;
 *     &lt;enumeration value="Northwest"/&gt;
 *     &lt;enumeration value="Southeast"/&gt;
 *     &lt;enumeration value="Southwest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompassDirection")
@XmlEnum
public enum CompassDirection {

    @XmlEnumValue("North")
    NORTH("North"),
    @XmlEnumValue("South")
    SOUTH("South"),
    @XmlEnumValue("East")
    EAST("East"),
    @XmlEnumValue("West")
    WEST("West"),
    @XmlEnumValue("Northeast")
    NORTHEAST("Northeast"),
    @XmlEnumValue("Northwest")
    NORTHWEST("Northwest"),
    @XmlEnumValue("Southeast")
    SOUTHEAST("Southeast"),
    @XmlEnumValue("Southwest")
    SOUTHWEST("Southwest");
    private final String value;

    CompassDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompassDirection fromValue(String v) {
        for (CompassDirection c: CompassDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
