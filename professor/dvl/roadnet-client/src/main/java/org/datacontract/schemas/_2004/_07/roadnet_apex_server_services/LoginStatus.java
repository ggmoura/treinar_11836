
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LoginStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LoginStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LoggedIn"/&gt;
 *     &lt;enumeration value="VersionOutOfDate"/&gt;
 *     &lt;enumeration value="CultureOutOfDate"/&gt;
 *     &lt;enumeration value="BackwardsCompatibilityMode"/&gt;
 *     &lt;enumeration value="ForwardCompatibilityMode"/&gt;
 *     &lt;enumeration value="VersionExceedsAllowedMaximum"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoginStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login")
@XmlEnum
public enum LoginStatus {

    @XmlEnumValue("LoggedIn")
    LOGGED_IN("LoggedIn"),
    @XmlEnumValue("VersionOutOfDate")
    VERSION_OUT_OF_DATE("VersionOutOfDate"),
    @XmlEnumValue("CultureOutOfDate")
    CULTURE_OUT_OF_DATE("CultureOutOfDate"),
    @XmlEnumValue("BackwardsCompatibilityMode")
    BACKWARDS_COMPATIBILITY_MODE("BackwardsCompatibilityMode"),
    @XmlEnumValue("ForwardCompatibilityMode")
    FORWARD_COMPATIBILITY_MODE("ForwardCompatibilityMode"),
    @XmlEnumValue("VersionExceedsAllowedMaximum")
    VERSION_EXCEEDS_ALLOWED_MAXIMUM("VersionExceedsAllowedMaximum");
    private final String value;

    LoginStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoginStatus fromValue(String v) {
        for (LoginStatus c: LoginStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
