
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.DVIRSubmitOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.DVIRSubmitOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Always"/&gt;
 *     &lt;enumeration value="WhenDefectExists"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.DVIRSubmitOptions")
@XmlEnum
public enum RegionDVIRSubmitOptions {

    @XmlEnumValue("Always")
    ALWAYS("Always"),
    @XmlEnumValue("WhenDefectExists")
    WHEN_DEFECT_EXISTS("WhenDefectExists");
    private final String value;

    RegionDVIRSubmitOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionDVIRSubmitOptions fromValue(String v) {
        for (RegionDVIRSubmitOptions c: RegionDVIRSubmitOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
