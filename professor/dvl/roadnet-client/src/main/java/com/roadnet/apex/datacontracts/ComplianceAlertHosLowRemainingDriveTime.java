
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ComplianceAlert.HosLowRemainingDriveTime.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplianceAlert.HosLowRemainingDriveTime"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="DurationMinutes15"/&gt;
 *     &lt;enumeration value="DurationMinutes30"/&gt;
 *     &lt;enumeration value="DurationMinutes60"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComplianceAlert.HosLowRemainingDriveTime")
@XmlEnum
public enum ComplianceAlertHosLowRemainingDriveTime {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("DurationMinutes15")
    DURATION_MINUTES_15("DurationMinutes15"),
    @XmlEnumValue("DurationMinutes30")
    DURATION_MINUTES_30("DurationMinutes30"),
    @XmlEnumValue("DurationMinutes60")
    DURATION_MINUTES_60("DurationMinutes60");
    private final String value;

    ComplianceAlertHosLowRemainingDriveTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplianceAlertHosLowRemainingDriveTime fromValue(String v) {
        for (ComplianceAlertHosLowRemainingDriveTime c: ComplianceAlertHosLowRemainingDriveTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
