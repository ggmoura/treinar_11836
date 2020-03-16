
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NavClientActivationCodeRefreshStatus.ErrorType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NavClientActivationCodeRefreshStatus.ErrorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="UnknownError"/&gt;
 *     &lt;enumeration value="MobileDeviceError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NavClientActivationCodeRefreshStatus.ErrorType")
@XmlEnum
public enum NavClientActivationCodeRefreshStatusErrorType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError"),
    @XmlEnumValue("MobileDeviceError")
    MOBILE_DEVICE_ERROR("MobileDeviceError");
    private final String value;

    NavClientActivationCodeRefreshStatusErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NavClientActivationCodeRefreshStatusErrorType fromValue(String v) {
        for (NavClientActivationCodeRefreshStatusErrorType c: NavClientActivationCodeRefreshStatusErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
