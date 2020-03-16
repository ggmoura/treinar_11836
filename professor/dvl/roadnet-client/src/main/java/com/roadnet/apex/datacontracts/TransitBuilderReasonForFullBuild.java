
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransitBuilderReasonForFullBuild.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransitBuilderReasonForFullBuild"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="ChangedPointsGreaterThanHalf"/&gt;
 *     &lt;enumeration value="ChangedPointsGreaterThanMax"/&gt;
 *     &lt;enumeration value="BuildAttributesChanged"/&gt;
 *     &lt;enumeration value="ForceFullBuild"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransitBuilderReasonForFullBuild")
@XmlEnum
public enum TransitBuilderReasonForFullBuild {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ChangedPointsGreaterThanHalf")
    CHANGED_POINTS_GREATER_THAN_HALF("ChangedPointsGreaterThanHalf"),
    @XmlEnumValue("ChangedPointsGreaterThanMax")
    CHANGED_POINTS_GREATER_THAN_MAX("ChangedPointsGreaterThanMax"),
    @XmlEnumValue("BuildAttributesChanged")
    BUILD_ATTRIBUTES_CHANGED("BuildAttributesChanged"),
    @XmlEnumValue("ForceFullBuild")
    FORCE_FULL_BUILD("ForceFullBuild");
    private final String value;

    TransitBuilderReasonForFullBuild(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitBuilderReasonForFullBuild fromValue(String v) {
        for (TransitBuilderReasonForFullBuild c: TransitBuilderReasonForFullBuild.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
