
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SendOrdersParameters.StopNumberFormat.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SendOrdersParameters.StopNumberFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Stop"/&gt;
 *     &lt;enumeration value="Order"/&gt;
 *     &lt;enumeration value="Location"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SendOrdersParameters.StopNumberFormat")
@XmlEnum
public enum SendOrdersParametersStopNumberFormat {

    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("Location")
    LOCATION("Location");
    private final String value;

    SendOrdersParametersStopNumberFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendOrdersParametersStopNumberFormat fromValue(String v) {
        for (SendOrdersParametersStopNumberFormat c: SendOrdersParametersStopNumberFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
