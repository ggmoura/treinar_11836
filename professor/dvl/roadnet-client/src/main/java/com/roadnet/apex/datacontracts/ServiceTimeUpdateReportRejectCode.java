
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceTimeUpdateReport.RejectCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceTimeUpdateReport.RejectCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotEvaluated"/&gt;
 *     &lt;enumeration value="Accepted"/&gt;
 *     &lt;enumeration value="MinimumDeliveriesNotMet"/&gt;
 *     &lt;enumeration value="OutsideVariance"/&gt;
 *     &lt;enumeration value="MinimumPercentDeliveriesNotMet"/&gt;
 *     &lt;enumeration value="InsufficientData"/&gt;
 *     &lt;enumeration value="NegativeVariableTimeWrongBulkThreshold"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceTimeUpdateReport.RejectCode")
@XmlEnum
public enum ServiceTimeUpdateReportRejectCode {

    @XmlEnumValue("NotEvaluated")
    NOT_EVALUATED("NotEvaluated"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("MinimumDeliveriesNotMet")
    MINIMUM_DELIVERIES_NOT_MET("MinimumDeliveriesNotMet"),
    @XmlEnumValue("OutsideVariance")
    OUTSIDE_VARIANCE("OutsideVariance"),
    @XmlEnumValue("MinimumPercentDeliveriesNotMet")
    MINIMUM_PERCENT_DELIVERIES_NOT_MET("MinimumPercentDeliveriesNotMet"),
    @XmlEnumValue("InsufficientData")
    INSUFFICIENT_DATA("InsufficientData"),
    @XmlEnumValue("NegativeVariableTimeWrongBulkThreshold")
    NEGATIVE_VARIABLE_TIME_WRONG_BULK_THRESHOLD("NegativeVariableTimeWrongBulkThreshold");
    private final String value;

    ServiceTimeUpdateReportRejectCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceTimeUpdateReportRejectCode fromValue(String v) {
        for (ServiceTimeUpdateReportRejectCode c: ServiceTimeUpdateReportRejectCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
