
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.DVIRPromptForCommentOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.DVIRPromptForCommentOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Always"/&gt;
 *     &lt;enumeration value="WhenDefectExists"/&gt;
 *     &lt;enumeration value="Never"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.DVIRPromptForCommentOptions")
@XmlEnum
public enum RegionDVIRPromptForCommentOptions {

    @XmlEnumValue("Always")
    ALWAYS("Always"),
    @XmlEnumValue("WhenDefectExists")
    WHEN_DEFECT_EXISTS("WhenDefectExists"),
    @XmlEnumValue("Never")
    NEVER("Never");
    private final String value;

    RegionDVIRPromptForCommentOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionDVIRPromptForCommentOptions fromValue(String v) {
        for (RegionDVIRPromptForCommentOptions c: RegionDVIRPromptForCommentOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
