
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UpdateServiceTimeParameters.ServiceItemType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateServiceTimeParameters.ServiceItemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ServiceLocation"/&gt;
 *     &lt;enumeration value="ServiceTimeType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpdateServiceTimeParameters.ServiceItemType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater")
@XmlEnum
public enum UpdateServiceTimeParametersServiceItemType {

    @XmlEnumValue("ServiceLocation")
    SERVICE_LOCATION("ServiceLocation"),
    @XmlEnumValue("ServiceTimeType")
    SERVICE_TIME_TYPE("ServiceTimeType");
    private final String value;

    UpdateServiceTimeParametersServiceItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateServiceTimeParametersServiceItemType fromValue(String v) {
        for (UpdateServiceTimeParametersServiceItemType c: UpdateServiceTimeParametersServiceItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
