
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ExportPlanningSolutionJobParameters.ExportPlanningSolutionDaysOutputFormat.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportPlanningSolutionJobParameters.ExportPlanningSolutionDaysOutputFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BinaryDaysOutputFormat"/&gt;
 *     &lt;enumeration value="LetterDaysOutputFormat"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExportPlanningSolutionJobParameters.ExportPlanningSolutionDaysOutputFormat")
@XmlEnum
public enum ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat {

    @XmlEnumValue("BinaryDaysOutputFormat")
    BINARY_DAYS_OUTPUT_FORMAT("BinaryDaysOutputFormat"),
    @XmlEnumValue("LetterDaysOutputFormat")
    LETTER_DAYS_OUTPUT_FORMAT("LetterDaysOutputFormat");
    private final String value;

    ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat fromValue(String v) {
        for (ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat c: ExportPlanningSolutionJobParametersExportPlanningSolutionDaysOutputFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
