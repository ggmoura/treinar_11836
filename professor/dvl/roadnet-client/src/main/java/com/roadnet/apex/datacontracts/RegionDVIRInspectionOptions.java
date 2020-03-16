
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.DVIRInspectionOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.DVIRInspectionOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Off"/&gt;
 *     &lt;enumeration value="FullInspectionRequired"/&gt;
 *     &lt;enumeration value="SafeToOperate"/&gt;
 *     &lt;enumeration value="On"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.DVIRInspectionOptions")
@XmlEnum
public enum RegionDVIRInspectionOptions {

    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("FullInspectionRequired")
    FULL_INSPECTION_REQUIRED("FullInspectionRequired"),
    @XmlEnumValue("SafeToOperate")
    SAFE_TO_OPERATE("SafeToOperate"),
    @XmlEnumValue("On")
    ON("On");
    private final String value;

    RegionDVIRInspectionOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionDVIRInspectionOptions fromValue(String v) {
        for (RegionDVIRInspectionOptions c: RegionDVIRInspectionOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
