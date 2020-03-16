
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SecondaryDimensionLevel.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SecondaryDimensionLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Detail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecondaryDimensionLevel")
@XmlEnum
public enum SecondaryDimensionLevel {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Detail")
    DETAIL("Detail");
    private final String value;

    SecondaryDimensionLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecondaryDimensionLevel fromValue(String v) {
        for (SecondaryDimensionLevel c: SecondaryDimensionLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
