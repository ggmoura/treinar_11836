
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Report.ReportCriteriaType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Report.ReportCriteriaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="RoutingSessionRouteId"/&gt;
 *     &lt;enumeration value="DateRange"/&gt;
 *     &lt;enumeration value="RoutingSessionId"/&gt;
 *     &lt;enumeration value="RouteTemplateId"/&gt;
 *     &lt;enumeration value="DateRangeSessionRouteId"/&gt;
 *     &lt;enumeration value="SessionTerritoryDayWeek"/&gt;
 *     &lt;enumeration value="StrategicRoutingSessions"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Report.ReportCriteriaType")
@XmlEnum
public enum ReportReportCriteriaType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("RoutingSessionRouteId")
    ROUTING_SESSION_ROUTE_ID("RoutingSessionRouteId"),
    @XmlEnumValue("DateRange")
    DATE_RANGE("DateRange"),
    @XmlEnumValue("RoutingSessionId")
    ROUTING_SESSION_ID("RoutingSessionId"),
    @XmlEnumValue("RouteTemplateId")
    ROUTE_TEMPLATE_ID("RouteTemplateId"),
    @XmlEnumValue("DateRangeSessionRouteId")
    DATE_RANGE_SESSION_ROUTE_ID("DateRangeSessionRouteId"),
    @XmlEnumValue("SessionTerritoryDayWeek")
    SESSION_TERRITORY_DAY_WEEK("SessionTerritoryDayWeek"),
    @XmlEnumValue("StrategicRoutingSessions")
    STRATEGIC_ROUTING_SESSIONS("StrategicRoutingSessions");
    private final String value;

    ReportReportCriteriaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportReportCriteriaType fromValue(String v) {
        for (ReportReportCriteriaType c: ReportReportCriteriaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
