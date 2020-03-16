
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ComplianceAlert.AlertTypeOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplianceAlert.AlertTypeOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Hos16HourBigDayDeclared"/&gt;
 *     &lt;enumeration value="HosViolations"/&gt;
 *     &lt;enumeration value="MobileLogEdit"/&gt;
 *     &lt;enumeration value="DriverRejectionOfAssignedUva"/&gt;
 *     &lt;enumeration value="DriverRejectionOfPendingEdits"/&gt;
 *     &lt;enumeration value="HosLowDriveTime"/&gt;
 *     &lt;enumeration value="HosLowDutyTime"/&gt;
 *     &lt;enumeration value="DvirInspectionFailure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComplianceAlert.AlertTypeOptions")
@XmlEnum
public enum ComplianceAlertAlertTypeOptions {

    @XmlEnumValue("Hos16HourBigDayDeclared")
    HOS_16_HOUR_BIG_DAY_DECLARED("Hos16HourBigDayDeclared"),
    @XmlEnumValue("HosViolations")
    HOS_VIOLATIONS("HosViolations"),
    @XmlEnumValue("MobileLogEdit")
    MOBILE_LOG_EDIT("MobileLogEdit"),
    @XmlEnumValue("DriverRejectionOfAssignedUva")
    DRIVER_REJECTION_OF_ASSIGNED_UVA("DriverRejectionOfAssignedUva"),
    @XmlEnumValue("DriverRejectionOfPendingEdits")
    DRIVER_REJECTION_OF_PENDING_EDITS("DriverRejectionOfPendingEdits"),
    @XmlEnumValue("HosLowDriveTime")
    HOS_LOW_DRIVE_TIME("HosLowDriveTime"),
    @XmlEnumValue("HosLowDutyTime")
    HOS_LOW_DUTY_TIME("HosLowDutyTime"),
    @XmlEnumValue("DvirInspectionFailure")
    DVIR_INSPECTION_FAILURE("DvirInspectionFailure");
    private final String value;

    ComplianceAlertAlertTypeOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplianceAlertAlertTypeOptions fromValue(String v) {
        for (ComplianceAlertAlertTypeOptions c: ComplianceAlertAlertTypeOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
