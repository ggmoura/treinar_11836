
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.DVIRCommentOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.DVIRCommentOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Required"/&gt;
 *     &lt;enumeration value="Optional"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.DVIRCommentOptions")
@XmlEnum
public enum RegionDVIRCommentOptions {

    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional");
    private final String value;

    RegionDVIRCommentOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionDVIRCommentOptions fromValue(String v) {
        for (RegionDVIRCommentOptions c: RegionDVIRCommentOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
