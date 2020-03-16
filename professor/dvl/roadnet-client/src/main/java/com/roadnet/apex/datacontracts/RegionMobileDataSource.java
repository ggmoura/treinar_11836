
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.MobileDataSource.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.MobileDataSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MobileDevice"/&gt;
 *     &lt;enumeration value="TelematicsDevice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.MobileDataSource")
@XmlEnum
public enum RegionMobileDataSource {

    @XmlEnumValue("MobileDevice")
    MOBILE_DEVICE("MobileDevice"),
    @XmlEnumValue("TelematicsDevice")
    TELEMATICS_DEVICE("TelematicsDevice");
    private final String value;

    RegionMobileDataSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionMobileDataSource fromValue(String v) {
        for (RegionMobileDataSource c: RegionMobileDataSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
