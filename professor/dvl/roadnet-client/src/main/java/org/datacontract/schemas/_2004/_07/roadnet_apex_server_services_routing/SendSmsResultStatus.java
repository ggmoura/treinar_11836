
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SendSmsResult.Status.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SendSmsResult.Status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="MobileDeviceNotFound"/&gt;
 *     &lt;enumeration value="ErrorSendingMessage"/&gt;
 *     &lt;enumeration value="UnknownError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SendSmsResult.Status")
@XmlEnum
public enum SendSmsResultStatus {

    OK("OK"),
    @XmlEnumValue("MobileDeviceNotFound")
    MOBILE_DEVICE_NOT_FOUND("MobileDeviceNotFound"),
    @XmlEnumValue("ErrorSendingMessage")
    ERROR_SENDING_MESSAGE("ErrorSendingMessage"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError");
    private final String value;

    SendSmsResultStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendSmsResultStatus fromValue(String v) {
        for (SendSmsResultStatus c: SendSmsResultStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
