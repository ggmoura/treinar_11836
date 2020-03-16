
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelematicsProviderType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TelematicsProviderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Geotab"/&gt;
 *     &lt;enumeration value="PeopleNet"/&gt;
 *     &lt;enumeration value="DriveCam"/&gt;
 *     &lt;enumeration value="Omnitracs"/&gt;
 *     &lt;enumeration value="Roadnet"/&gt;
 *     &lt;enumeration value="XRS"/&gt;
 *     &lt;enumeration value="Volvo"/&gt;
 *     &lt;enumeration value="OmnitracsMexico"/&gt;
 *     &lt;enumeration value="GpsInsight"/&gt;
 *     &lt;enumeration value="Inthinc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelematicsProviderType")
@XmlEnum
public enum TelematicsProviderType {

    @XmlEnumValue("Geotab")
    GEOTAB("Geotab"),
    @XmlEnumValue("PeopleNet")
    PEOPLE_NET("PeopleNet"),
    @XmlEnumValue("DriveCam")
    DRIVE_CAM("DriveCam"),
    @XmlEnumValue("Omnitracs")
    OMNITRACS("Omnitracs"),
    @XmlEnumValue("Roadnet")
    ROADNET("Roadnet"),
    XRS("XRS"),
    @XmlEnumValue("Volvo")
    VOLVO("Volvo"),
    @XmlEnumValue("OmnitracsMexico")
    OMNITRACS_MEXICO("OmnitracsMexico"),
    @XmlEnumValue("GpsInsight")
    GPS_INSIGHT("GpsInsight"),
    @XmlEnumValue("Inthinc")
    INTHINC("Inthinc");
    private final String value;

    TelematicsProviderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelematicsProviderType fromValue(String v) {
        for (TelematicsProviderType c: TelematicsProviderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
