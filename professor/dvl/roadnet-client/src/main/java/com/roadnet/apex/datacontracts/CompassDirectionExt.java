
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CompassDirectionExt.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CompassDirectionExt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="North"/&gt;
 *     &lt;enumeration value="South"/&gt;
 *     &lt;enumeration value="East"/&gt;
 *     &lt;enumeration value="West"/&gt;
 *     &lt;enumeration value="Northeast"/&gt;
 *     &lt;enumeration value="Northwest"/&gt;
 *     &lt;enumeration value="Southeast"/&gt;
 *     &lt;enumeration value="Southwest"/&gt;
 *     &lt;enumeration value="NorthNortheast"/&gt;
 *     &lt;enumeration value="EastNortheast"/&gt;
 *     &lt;enumeration value="EastSoutheast"/&gt;
 *     &lt;enumeration value="SouthSoutheast"/&gt;
 *     &lt;enumeration value="SouthSouthwest"/&gt;
 *     &lt;enumeration value="WestSouthwest"/&gt;
 *     &lt;enumeration value="WestNorthwest"/&gt;
 *     &lt;enumeration value="NorthNorthwest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompassDirectionExt")
@XmlEnum
public enum CompassDirectionExt {

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
    SOUTHWEST("Southwest"),
    @XmlEnumValue("NorthNortheast")
    NORTH_NORTHEAST("NorthNortheast"),
    @XmlEnumValue("EastNortheast")
    EAST_NORTHEAST("EastNortheast"),
    @XmlEnumValue("EastSoutheast")
    EAST_SOUTHEAST("EastSoutheast"),
    @XmlEnumValue("SouthSoutheast")
    SOUTH_SOUTHEAST("SouthSoutheast"),
    @XmlEnumValue("SouthSouthwest")
    SOUTH_SOUTHWEST("SouthSouthwest"),
    @XmlEnumValue("WestSouthwest")
    WEST_SOUTHWEST("WestSouthwest"),
    @XmlEnumValue("WestNorthwest")
    WEST_NORTHWEST("WestNorthwest"),
    @XmlEnumValue("NorthNorthwest")
    NORTH_NORTHWEST("NorthNorthwest");
    private final String value;

    CompassDirectionExt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompassDirectionExt fromValue(String v) {
        for (CompassDirectionExt c: CompassDirectionExt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
