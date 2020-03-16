
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TerritoryLayoutMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TerritoryLayoutMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Clusters"/&gt;
 *     &lt;enumeration value="Spokes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TerritoryLayoutMethod")
@XmlEnum
public enum TerritoryLayoutMethod {

    @XmlEnumValue("Clusters")
    CLUSTERS("Clusters"),
    @XmlEnumValue("Spokes")
    SPOKES("Spokes");
    private final String value;

    TerritoryLayoutMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TerritoryLayoutMethod fromValue(String v) {
        for (TerritoryLayoutMethod c: TerritoryLayoutMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
