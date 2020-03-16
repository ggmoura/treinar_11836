
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReportRouteCriteriaSettingsFilter.ReportRoutePlanType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportRouteCriteriaSettingsFilter.ReportRoutePlanType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Planned"/&gt;
 *     &lt;enumeration value="Unplanned"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportRouteCriteriaSettingsFilter.ReportRoutePlanType")
@XmlEnum
public enum ReportRouteCriteriaSettingsFilterReportRoutePlanType {

    @XmlEnumValue("Planned")
    PLANNED("Planned"),
    @XmlEnumValue("Unplanned")
    UNPLANNED("Unplanned");
    private final String value;

    ReportRouteCriteriaSettingsFilterReportRoutePlanType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportRouteCriteriaSettingsFilterReportRoutePlanType fromValue(String v) {
        for (ReportRouteCriteriaSettingsFilterReportRoutePlanType c: ReportRouteCriteriaSettingsFilterReportRoutePlanType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
