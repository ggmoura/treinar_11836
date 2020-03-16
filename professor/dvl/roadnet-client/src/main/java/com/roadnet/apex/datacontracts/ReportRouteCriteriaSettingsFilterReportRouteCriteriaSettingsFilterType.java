
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReportRouteCriteriaSettingsFilter.ReportRouteCriteriaSettingsFilterType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportRouteCriteriaSettingsFilter.ReportRouteCriteriaSettingsFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ReportRoutePlanType"/&gt;
 *     &lt;enumeration value="RouteState"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportRouteCriteriaSettingsFilter.ReportRouteCriteriaSettingsFilterType")
@XmlEnum
public enum ReportRouteCriteriaSettingsFilterReportRouteCriteriaSettingsFilterType {

    @XmlEnumValue("ReportRoutePlanType")
    REPORT_ROUTE_PLAN_TYPE("ReportRoutePlanType"),
    @XmlEnumValue("RouteState")
    ROUTE_STATE("RouteState");
    private final String value;

    ReportRouteCriteriaSettingsFilterReportRouteCriteriaSettingsFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportRouteCriteriaSettingsFilterReportRouteCriteriaSettingsFilterType fromValue(String v) {
        for (ReportRouteCriteriaSettingsFilterReportRouteCriteriaSettingsFilterType c: ReportRouteCriteriaSettingsFilterReportRouteCriteriaSettingsFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
