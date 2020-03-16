
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SaveStopFromPointArgs.StopCreationMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SaveStopFromPointArgs.StopCreationMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FromLocation"/&gt;
 *     &lt;enumeration value="FromAdress"/&gt;
 *     &lt;enumeration value="FromCoordinate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SaveStopFromPointArgs.StopCreationMethod")
@XmlEnum
public enum SaveStopFromPointArgsStopCreationMethod {

    @XmlEnumValue("FromLocation")
    FROM_LOCATION("FromLocation"),
    @XmlEnumValue("FromAdress")
    FROM_ADRESS("FromAdress"),
    @XmlEnumValue("FromCoordinate")
    FROM_COORDINATE("FromCoordinate");
    private final String value;

    SaveStopFromPointArgsStopCreationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SaveStopFromPointArgsStopCreationMethod fromValue(String v) {
        for (SaveStopFromPointArgsStopCreationMethod c: SaveStopFromPointArgsStopCreationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
