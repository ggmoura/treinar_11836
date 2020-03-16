
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ExportPlanningSolutionJobParameters.ExportPlanningSolutionTimeZoneOption.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportPlanningSolutionJobParameters.ExportPlanningSolutionTimeZoneOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UseDriverTimeZone"/&gt;
 *     &lt;enumeration value="UseSpecifiedTimeZone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExportPlanningSolutionJobParameters.ExportPlanningSolutionTimeZoneOption")
@XmlEnum
public enum ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption {

    @XmlEnumValue("UseDriverTimeZone")
    USE_DRIVER_TIME_ZONE("UseDriverTimeZone"),
    @XmlEnumValue("UseSpecifiedTimeZone")
    USE_SPECIFIED_TIME_ZONE("UseSpecifiedTimeZone");
    private final String value;

    ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption fromValue(String v) {
        for (ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption c: ExportPlanningSolutionJobParametersExportPlanningSolutionTimeZoneOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
