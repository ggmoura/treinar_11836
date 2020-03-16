
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ExportPlanningSolutionJobParameters.ExportPlanningSolutionWeeksOutputFormat.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportPlanningSolutionJobParameters.ExportPlanningSolutionWeeksOutputFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BinaryWeeksOutputFormat"/&gt;
 *     &lt;enumeration value="XAndSpaceWeeksOutputFormat"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExportPlanningSolutionJobParameters.ExportPlanningSolutionWeeksOutputFormat")
@XmlEnum
public enum ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat {

    @XmlEnumValue("BinaryWeeksOutputFormat")
    BINARY_WEEKS_OUTPUT_FORMAT("BinaryWeeksOutputFormat"),
    @XmlEnumValue("XAndSpaceWeeksOutputFormat")
    X_AND_SPACE_WEEKS_OUTPUT_FORMAT("XAndSpaceWeeksOutputFormat");
    private final String value;

    ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat fromValue(String v) {
        for (ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat c: ExportPlanningSolutionJobParametersExportPlanningSolutionWeeksOutputFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
