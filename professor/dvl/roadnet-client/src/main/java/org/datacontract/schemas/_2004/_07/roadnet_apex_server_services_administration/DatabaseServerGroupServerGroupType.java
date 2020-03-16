
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DatabaseServerGroup.ServerGroupType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DatabaseServerGroup.ServerGroupType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SingleServer"/&gt;
 *     &lt;enumeration value="MirroredServers"/&gt;
 *     &lt;enumeration value="AlwaysOnAvailabilityGroup"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DatabaseServerGroup.ServerGroupType")
@XmlEnum
public enum DatabaseServerGroupServerGroupType {

    @XmlEnumValue("SingleServer")
    SINGLE_SERVER("SingleServer"),
    @XmlEnumValue("MirroredServers")
    MIRRORED_SERVERS("MirroredServers"),
    @XmlEnumValue("AlwaysOnAvailabilityGroup")
    ALWAYS_ON_AVAILABILITY_GROUP("AlwaysOnAvailabilityGroup");
    private final String value;

    DatabaseServerGroupServerGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatabaseServerGroupServerGroupType fromValue(String v) {
        for (DatabaseServerGroupServerGroupType c: DatabaseServerGroupServerGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
