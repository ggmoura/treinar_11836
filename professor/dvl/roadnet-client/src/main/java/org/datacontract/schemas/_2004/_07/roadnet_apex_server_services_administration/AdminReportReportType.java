
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AdminReport.ReportType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AdminReport.ReportType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CustomerActivity"/&gt;
 *     &lt;enumeration value="TomTomUsage"/&gt;
 *     &lt;enumeration value="GooglePageView"/&gt;
 *     &lt;enumeration value="InrixUsage"/&gt;
 *     &lt;enumeration value="PartnerActivity"/&gt;
 *     &lt;enumeration value="HEREUsage"/&gt;
 *     &lt;enumeration value="CustomerUsage"/&gt;
 *     &lt;enumeration value="CustomerActivityExtendedWeekly"/&gt;
 *     &lt;enumeration value="CustomerActivityExtendedMonthly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdminReport.ReportType")
@XmlEnum
public enum AdminReportReportType {

    @XmlEnumValue("CustomerActivity")
    CUSTOMER_ACTIVITY("CustomerActivity"),
    @XmlEnumValue("TomTomUsage")
    TOM_TOM_USAGE("TomTomUsage"),
    @XmlEnumValue("GooglePageView")
    GOOGLE_PAGE_VIEW("GooglePageView"),
    @XmlEnumValue("InrixUsage")
    INRIX_USAGE("InrixUsage"),
    @XmlEnumValue("PartnerActivity")
    PARTNER_ACTIVITY("PartnerActivity"),
    @XmlEnumValue("HEREUsage")
    HERE_USAGE("HEREUsage"),
    @XmlEnumValue("CustomerUsage")
    CUSTOMER_USAGE("CustomerUsage"),
    @XmlEnumValue("CustomerActivityExtendedWeekly")
    CUSTOMER_ACTIVITY_EXTENDED_WEEKLY("CustomerActivityExtendedWeekly"),
    @XmlEnumValue("CustomerActivityExtendedMonthly")
    CUSTOMER_ACTIVITY_EXTENDED_MONTHLY("CustomerActivityExtendedMonthly");
    private final String value;

    AdminReportReportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdminReportReportType fromValue(String v) {
        for (AdminReportReportType c: AdminReportReportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
