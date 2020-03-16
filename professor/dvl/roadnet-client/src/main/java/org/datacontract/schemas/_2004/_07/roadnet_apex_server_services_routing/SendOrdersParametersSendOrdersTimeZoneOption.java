
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SendOrdersParameters.SendOrdersTimeZoneOption.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SendOrdersParameters.SendOrdersTimeZoneOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UseLocationTimeZone"/&gt;
 *     &lt;enumeration value="UseSpecifiedTimeZone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SendOrdersParameters.SendOrdersTimeZoneOption")
@XmlEnum
public enum SendOrdersParametersSendOrdersTimeZoneOption {

    @XmlEnumValue("UseLocationTimeZone")
    USE_LOCATION_TIME_ZONE("UseLocationTimeZone"),
    @XmlEnumValue("UseSpecifiedTimeZone")
    USE_SPECIFIED_TIME_ZONE("UseSpecifiedTimeZone");
    private final String value;

    SendOrdersParametersSendOrdersTimeZoneOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendOrdersParametersSendOrdersTimeZoneOption fromValue(String v) {
        for (SendOrdersParametersSendOrdersTimeZoneOption c: SendOrdersParametersSendOrdersTimeZoneOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
