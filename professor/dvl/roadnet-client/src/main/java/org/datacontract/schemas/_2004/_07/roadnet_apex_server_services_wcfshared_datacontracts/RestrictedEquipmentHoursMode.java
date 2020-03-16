
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RestrictedEquipmentHoursMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RestrictedEquipmentHoursMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ConsiderDepotOpenCloseTimes"/&gt;
 *     &lt;enumeration value="ConsiderRegionRestrictedOperatingTimes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RestrictedEquipmentHoursMode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions")
@XmlEnum
public enum RestrictedEquipmentHoursMode {

    @XmlEnumValue("ConsiderDepotOpenCloseTimes")
    CONSIDER_DEPOT_OPEN_CLOSE_TIMES("ConsiderDepotOpenCloseTimes"),
    @XmlEnumValue("ConsiderRegionRestrictedOperatingTimes")
    CONSIDER_REGION_RESTRICTED_OPERATING_TIMES("ConsiderRegionRestrictedOperatingTimes");
    private final String value;

    RestrictedEquipmentHoursMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestrictedEquipmentHoursMode fromValue(String v) {
        for (RestrictedEquipmentHoursMode c: RestrictedEquipmentHoursMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
