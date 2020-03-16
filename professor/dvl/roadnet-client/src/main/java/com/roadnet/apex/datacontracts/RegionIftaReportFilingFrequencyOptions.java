
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.IftaReportFilingFrequencyOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.IftaReportFilingFrequencyOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotFiled"/&gt;
 *     &lt;enumeration value="Quarterly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.IftaReportFilingFrequencyOptions")
@XmlEnum
public enum RegionIftaReportFilingFrequencyOptions {

    @XmlEnumValue("NotFiled")
    NOT_FILED("NotFiled"),
    @XmlEnumValue("Quarterly")
    QUARTERLY("Quarterly");
    private final String value;

    RegionIftaReportFilingFrequencyOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionIftaReportFilingFrequencyOptions fromValue(String v) {
        for (RegionIftaReportFilingFrequencyOptions c: RegionIftaReportFilingFrequencyOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
