
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MobilePlatform.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilePlatform"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Java"/&gt;
 *     &lt;enumeration value="Android"/&gt;
 *     &lt;enumeration value="iOS"/&gt;
 *     &lt;enumeration value="WindowsMobile"/&gt;
 *     &lt;enumeration value="Omnitracs"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobilePlatform")
@XmlEnum
public enum MobilePlatform {

    @XmlEnumValue("Java")
    JAVA("Java"),
    @XmlEnumValue("Android")
    ANDROID("Android"),
    @XmlEnumValue("iOS")
    I_OS("iOS"),
    @XmlEnumValue("WindowsMobile")
    WINDOWS_MOBILE("WindowsMobile"),
    @XmlEnumValue("Omnitracs")
    OMNITRACS("Omnitracs");
    private final String value;

    MobilePlatform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilePlatform fromValue(String v) {
        for (MobilePlatform c: MobilePlatform.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
