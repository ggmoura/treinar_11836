
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.MobileScanningOption.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.MobileScanningOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Checkoff"/&gt;
 *     &lt;enumeration value="Increment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.MobileScanningOption")
@XmlEnum
public enum RegionMobileScanningOption {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Checkoff")
    CHECKOFF("Checkoff"),
    @XmlEnumValue("Increment")
    INCREMENT("Increment");
    private final String value;

    RegionMobileScanningOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionMobileScanningOption fromValue(String v) {
        for (RegionMobileScanningOption c: RegionMobileScanningOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
