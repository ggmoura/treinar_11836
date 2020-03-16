
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ManipulationSource.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ManipulationSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *     &lt;enumeration value="MobileDevice"/&gt;
 *     &lt;enumeration value="ClientApplication"/&gt;
 *     &lt;enumeration value="System"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ManipulationSource")
@XmlEnum
public enum ManipulationSource {

    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("MobileDevice")
    MOBILE_DEVICE("MobileDevice"),
    @XmlEnumValue("ClientApplication")
    CLIENT_APPLICATION("ClientApplication"),
    @XmlEnumValue("System")
    SYSTEM("System");
    private final String value;

    ManipulationSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManipulationSource fromValue(String v) {
        for (ManipulationSource c: ManipulationSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
