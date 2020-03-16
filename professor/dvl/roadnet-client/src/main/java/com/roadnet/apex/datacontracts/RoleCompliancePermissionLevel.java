
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Role.CompliancePermissionLevel.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Role.CompliancePermissionLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoCompliance"/&gt;
 *     &lt;enumeration value="HOSReports"/&gt;
 *     &lt;enumeration value="FullHOS"/&gt;
 *     &lt;enumeration value="FullCompliance"/&gt;
 *     &lt;enumeration value="Administrator"/&gt;
 *     &lt;enumeration value="DvirManager"/&gt;
 *     &lt;enumeration value="FullDvir"/&gt;
 *     &lt;enumeration value="FullIfta"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Role.CompliancePermissionLevel")
@XmlEnum
public enum RoleCompliancePermissionLevel {

    @XmlEnumValue("NoCompliance")
    NO_COMPLIANCE("NoCompliance"),
    @XmlEnumValue("HOSReports")
    HOS_REPORTS("HOSReports"),
    @XmlEnumValue("FullHOS")
    FULL_HOS("FullHOS"),
    @XmlEnumValue("FullCompliance")
    FULL_COMPLIANCE("FullCompliance"),
    @XmlEnumValue("Administrator")
    ADMINISTRATOR("Administrator"),
    @XmlEnumValue("DvirManager")
    DVIR_MANAGER("DvirManager"),
    @XmlEnumValue("FullDvir")
    FULL_DVIR("FullDvir"),
    @XmlEnumValue("FullIfta")
    FULL_IFTA("FullIfta");
    private final String value;

    RoleCompliancePermissionLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleCompliancePermissionLevel fromValue(String v) {
        for (RoleCompliancePermissionLevel c: RoleCompliancePermissionLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
