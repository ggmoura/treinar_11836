
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LoggingLevel.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LoggingLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fatal"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Warn"/&gt;
 *     &lt;enumeration value="Info"/&gt;
 *     &lt;enumeration value="Debug"/&gt;
 *     &lt;enumeration value="Off"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoggingLevel")
@XmlEnum
public enum LoggingLevel {

    @XmlEnumValue("Fatal")
    FATAL("Fatal"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Warn")
    WARN("Warn"),
    @XmlEnumValue("Info")
    INFO("Info"),
    @XmlEnumValue("Debug")
    DEBUG("Debug"),
    @XmlEnumValue("Off")
    OFF("Off");
    private final String value;

    LoggingLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoggingLevel fromValue(String v) {
        for (LoggingLevel c: LoggingLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
