
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QuantityInputQuality.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="QuantityInputQuality"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSet"/&gt;
 *     &lt;enumeration value="Scanned"/&gt;
 *     &lt;enumeration value="Checked"/&gt;
 *     &lt;enumeration value="Entered"/&gt;
 *     &lt;enumeration value="GroupScanned"/&gt;
 *     &lt;enumeration value="GroupChecked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuantityInputQuality")
@XmlEnum
public enum QuantityInputQuality {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Scanned")
    SCANNED("Scanned"),
    @XmlEnumValue("Checked")
    CHECKED("Checked"),
    @XmlEnumValue("Entered")
    ENTERED("Entered"),
    @XmlEnumValue("GroupScanned")
    GROUP_SCANNED("GroupScanned"),
    @XmlEnumValue("GroupChecked")
    GROUP_CHECKED("GroupChecked");
    private final String value;

    QuantityInputQuality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantityInputQuality fromValue(String v) {
        for (QuantityInputQuality c: QuantityInputQuality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
