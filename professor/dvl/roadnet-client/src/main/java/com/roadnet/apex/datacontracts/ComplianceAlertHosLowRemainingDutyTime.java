
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ComplianceAlert.HosLowRemainingDutyTime.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplianceAlert.HosLowRemainingDutyTime"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="DurationMinutes30"/&gt;
 *     &lt;enumeration value="DurationMinutes60"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComplianceAlert.HosLowRemainingDutyTime")
@XmlEnum
public enum ComplianceAlertHosLowRemainingDutyTime {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("DurationMinutes30")
    DURATION_MINUTES_30("DurationMinutes30"),
    @XmlEnumValue("DurationMinutes60")
    DURATION_MINUTES_60("DurationMinutes60"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    ComplianceAlertHosLowRemainingDutyTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplianceAlertHosLowRemainingDutyTime fromValue(String v) {
        for (ComplianceAlertHosLowRemainingDutyTime c: ComplianceAlertHosLowRemainingDutyTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
