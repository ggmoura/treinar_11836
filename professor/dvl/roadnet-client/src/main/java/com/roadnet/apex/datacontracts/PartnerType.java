
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PartnerType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PartnerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RoadnetPartner"/&gt;
 *     &lt;enumeration value="OmnitracsPartner"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartnerType")
@XmlEnum
public enum PartnerType {

    @XmlEnumValue("RoadnetPartner")
    ROADNET_PARTNER("RoadnetPartner"),
    @XmlEnumValue("OmnitracsPartner")
    OMNITRACS_PARTNER("OmnitracsPartner");
    private final String value;

    PartnerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartnerType fromValue(String v) {
        for (PartnerType c: PartnerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
