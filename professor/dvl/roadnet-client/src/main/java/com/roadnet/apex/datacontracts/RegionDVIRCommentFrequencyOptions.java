
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.DVIRCommentFrequencyOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.DVIRCommentFrequencyOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OnePerDefect"/&gt;
 *     &lt;enumeration value="OnePerInspection"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.DVIRCommentFrequencyOptions")
@XmlEnum
public enum RegionDVIRCommentFrequencyOptions {

    @XmlEnumValue("OnePerDefect")
    ONE_PER_DEFECT("OnePerDefect"),
    @XmlEnumValue("OnePerInspection")
    ONE_PER_INSPECTION("OnePerInspection");
    private final String value;

    RegionDVIRCommentFrequencyOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionDVIRCommentFrequencyOptions fromValue(String v) {
        for (RegionDVIRCommentFrequencyOptions c: RegionDVIRCommentFrequencyOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
