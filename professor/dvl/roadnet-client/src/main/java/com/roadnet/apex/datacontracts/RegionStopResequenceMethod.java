
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.StopResequenceMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.StopResequenceMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MoveToNext"/&gt;
 *     &lt;enumeration value="MoveToLast"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.StopResequenceMethod")
@XmlEnum
public enum RegionStopResequenceMethod {

    @XmlEnumValue("MoveToNext")
    MOVE_TO_NEXT("MoveToNext"),
    @XmlEnumValue("MoveToLast")
    MOVE_TO_LAST("MoveToLast"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel");
    private final String value;

    RegionStopResequenceMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionStopResequenceMethod fromValue(String v) {
        for (RegionStopResequenceMethod c: RegionStopResequenceMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
