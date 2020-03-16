
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RestrictedEquipmentHoursType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RestrictedEquipmentHoursType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OriginDepotViolation"/&gt;
 *     &lt;enumeration value="DestinationDepotViolation"/&gt;
 *     &lt;enumeration value="RegionRestrictedOperatingTimesViolation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RestrictedEquipmentHoursType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions")
@XmlEnum
public enum RestrictedEquipmentHoursType {

    @XmlEnumValue("OriginDepotViolation")
    ORIGIN_DEPOT_VIOLATION("OriginDepotViolation"),
    @XmlEnumValue("DestinationDepotViolation")
    DESTINATION_DEPOT_VIOLATION("DestinationDepotViolation"),
    @XmlEnumValue("RegionRestrictedOperatingTimesViolation")
    REGION_RESTRICTED_OPERATING_TIMES_VIOLATION("RegionRestrictedOperatingTimesViolation");
    private final String value;

    RestrictedEquipmentHoursType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestrictedEquipmentHoursType fromValue(String v) {
        for (RestrictedEquipmentHoursType c: RestrictedEquipmentHoursType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
