
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UserClientApplicationVersion.UserLoginResultCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UserClientApplicationVersion.UserLoginResultCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unset"/&gt;
 *     &lt;enumeration value="LoginFailedUnknownReason"/&gt;
 *     &lt;enumeration value="LoginFailedVersionOutOfDate"/&gt;
 *     &lt;enumeration value="LoginFailedAuthenticationFailure"/&gt;
 *     &lt;enumeration value="LoginSucceededLatestVersion"/&gt;
 *     &lt;enumeration value="LoginSucceededBackwardsCompatibility"/&gt;
 *     &lt;enumeration value="LoginFailedVehicleLicenseComplianceViolation"/&gt;
 *     &lt;enumeration value="LoginFailedLicenseViolation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserClientApplicationVersion.UserLoginResultCode")
@XmlEnum
public enum UserClientApplicationVersionUserLoginResultCode {

    @XmlEnumValue("Unset")
    UNSET("Unset"),
    @XmlEnumValue("LoginFailedUnknownReason")
    LOGIN_FAILED_UNKNOWN_REASON("LoginFailedUnknownReason"),
    @XmlEnumValue("LoginFailedVersionOutOfDate")
    LOGIN_FAILED_VERSION_OUT_OF_DATE("LoginFailedVersionOutOfDate"),
    @XmlEnumValue("LoginFailedAuthenticationFailure")
    LOGIN_FAILED_AUTHENTICATION_FAILURE("LoginFailedAuthenticationFailure"),
    @XmlEnumValue("LoginSucceededLatestVersion")
    LOGIN_SUCCEEDED_LATEST_VERSION("LoginSucceededLatestVersion"),
    @XmlEnumValue("LoginSucceededBackwardsCompatibility")
    LOGIN_SUCCEEDED_BACKWARDS_COMPATIBILITY("LoginSucceededBackwardsCompatibility"),
    @XmlEnumValue("LoginFailedVehicleLicenseComplianceViolation")
    LOGIN_FAILED_VEHICLE_LICENSE_COMPLIANCE_VIOLATION("LoginFailedVehicleLicenseComplianceViolation"),
    @XmlEnumValue("LoginFailedLicenseViolation")
    LOGIN_FAILED_LICENSE_VIOLATION("LoginFailedLicenseViolation");
    private final String value;

    UserClientApplicationVersionUserLoginResultCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserClientApplicationVersionUserLoginResultCode fromValue(String v) {
        for (UserClientApplicationVersionUserLoginResultCode c: UserClientApplicationVersionUserLoginResultCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
