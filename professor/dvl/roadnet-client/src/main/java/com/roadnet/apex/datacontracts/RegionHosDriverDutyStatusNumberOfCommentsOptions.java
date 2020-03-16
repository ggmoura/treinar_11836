
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.HosDriverDutyStatusNumberOfCommentsOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.HosDriverDutyStatusNumberOfCommentsOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="OneComment"/&gt;
 *     &lt;enumeration value="TwoComments"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.HosDriverDutyStatusNumberOfCommentsOptions")
@XmlEnum
public enum RegionHosDriverDutyStatusNumberOfCommentsOptions {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("OneComment")
    ONE_COMMENT("OneComment"),
    @XmlEnumValue("TwoComments")
    TWO_COMMENTS("TwoComments");
    private final String value;

    RegionHosDriverDutyStatusNumberOfCommentsOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionHosDriverDutyStatusNumberOfCommentsOptions fromValue(String v) {
        for (RegionHosDriverDutyStatusNumberOfCommentsOptions c: RegionHosDriverDutyStatusNumberOfCommentsOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
