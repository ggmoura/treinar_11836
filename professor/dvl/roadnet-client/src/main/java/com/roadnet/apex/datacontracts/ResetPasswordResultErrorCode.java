
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResetPasswordResult.ErrorCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ResetPasswordResult.ErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EmailAddressNotFound"/&gt;
 *     &lt;enumeration value="UserDisabled"/&gt;
 *     &lt;enumeration value="UserLocked"/&gt;
 *     &lt;enumeration value="ErrorSendingEmail"/&gt;
 *     &lt;enumeration value="UnknownError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResetPasswordResult.ErrorCode")
@XmlEnum
public enum ResetPasswordResultErrorCode {

    @XmlEnumValue("EmailAddressNotFound")
    EMAIL_ADDRESS_NOT_FOUND("EmailAddressNotFound"),
    @XmlEnumValue("UserDisabled")
    USER_DISABLED("UserDisabled"),
    @XmlEnumValue("UserLocked")
    USER_LOCKED("UserLocked"),
    @XmlEnumValue("ErrorSendingEmail")
    ERROR_SENDING_EMAIL("ErrorSendingEmail"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError");
    private final String value;

    ResetPasswordResultErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResetPasswordResultErrorCode fromValue(String v) {
        for (ResetPasswordResultErrorCode c: ResetPasswordResultErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
