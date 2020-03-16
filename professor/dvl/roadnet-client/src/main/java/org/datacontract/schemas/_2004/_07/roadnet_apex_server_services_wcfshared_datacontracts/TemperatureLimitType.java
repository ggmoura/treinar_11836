
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TemperatureLimitType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TemperatureLimitType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Min"/&gt;
 *     &lt;enumeration value="Max"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TemperatureLimitType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions")
@XmlEnum
public enum TemperatureLimitType {

    @XmlEnumValue("Min")
    MIN("Min"),
    @XmlEnumValue("Max")
    MAX("Max");
    private final String value;

    TemperatureLimitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemperatureLimitType fromValue(String v) {
        for (TemperatureLimitType c: TemperatureLimitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
