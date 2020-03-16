
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FacilityType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FacilityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Query"/&gt;
 *     &lt;enumeration value="Routing"/&gt;
 *     &lt;enumeration value="Mapping"/&gt;
 *     &lt;enumeration value="MapRendering"/&gt;
 *     &lt;enumeration value="Administration"/&gt;
 *     &lt;enumeration value="ActiveAlertWebApp"/&gt;
 *     &lt;enumeration value="TelematicsQuery"/&gt;
 *     &lt;enumeration value="DeviceMessageProcessing"/&gt;
 *     &lt;enumeration value="XrsWebServices"/&gt;
 *     &lt;enumeration value="XrsWebPortal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FacilityType")
@XmlEnum
public enum FacilityType {

    @XmlEnumValue("Query")
    QUERY("Query"),
    @XmlEnumValue("Routing")
    ROUTING("Routing"),
    @XmlEnumValue("Mapping")
    MAPPING("Mapping"),
    @XmlEnumValue("MapRendering")
    MAP_RENDERING("MapRendering"),
    @XmlEnumValue("Administration")
    ADMINISTRATION("Administration"),
    @XmlEnumValue("ActiveAlertWebApp")
    ACTIVE_ALERT_WEB_APP("ActiveAlertWebApp"),
    @XmlEnumValue("TelematicsQuery")
    TELEMATICS_QUERY("TelematicsQuery"),
    @XmlEnumValue("DeviceMessageProcessing")
    DEVICE_MESSAGE_PROCESSING("DeviceMessageProcessing"),
    @XmlEnumValue("XrsWebServices")
    XRS_WEB_SERVICES("XrsWebServices"),
    @XmlEnumValue("XrsWebPortal")
    XRS_WEB_PORTAL("XrsWebPortal");
    private final String value;

    FacilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacilityType fromValue(String v) {
        for (FacilityType c: FacilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
