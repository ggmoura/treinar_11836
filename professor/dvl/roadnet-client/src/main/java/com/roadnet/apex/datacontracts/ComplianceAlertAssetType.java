
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ComplianceAlert.AssetType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplianceAlert.AssetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="Vehicle"/&gt;
 *     &lt;enumeration value="Trailer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComplianceAlert.AssetType")
@XmlEnum
public enum ComplianceAlertAssetType {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("Vehicle")
    VEHICLE("Vehicle"),
    @XmlEnumValue("Trailer")
    TRAILER("Trailer");
    private final String value;

    ComplianceAlertAssetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplianceAlertAssetType fromValue(String v) {
        for (ComplianceAlertAssetType c: ComplianceAlertAssetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
