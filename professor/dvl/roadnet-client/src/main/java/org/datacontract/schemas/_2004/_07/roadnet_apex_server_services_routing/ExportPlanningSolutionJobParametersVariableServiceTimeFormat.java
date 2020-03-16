
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ExportPlanningSolutionJobParameters.VariableServiceTimeFormat.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportPlanningSolutionJobParameters.VariableServiceTimeFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Minutes"/&gt;
 *     &lt;enumeration value="TenthsofMinutes"/&gt;
 *     &lt;enumeration value="HundrethsofMinutes"/&gt;
 *     &lt;enumeration value="ThousandthsofMinutes"/&gt;
 *     &lt;enumeration value="TenThousandthsofMinutes"/&gt;
 *     &lt;enumeration value="HundredThousandthsofMinutes"/&gt;
 *     &lt;enumeration value="MillionthsofMinutes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExportPlanningSolutionJobParameters.VariableServiceTimeFormat")
@XmlEnum
public enum ExportPlanningSolutionJobParametersVariableServiceTimeFormat {

    @XmlEnumValue("Minutes")
    MINUTES("Minutes"),
    @XmlEnumValue("TenthsofMinutes")
    TENTHSOF_MINUTES("TenthsofMinutes"),
    @XmlEnumValue("HundrethsofMinutes")
    HUNDRETHSOF_MINUTES("HundrethsofMinutes"),
    @XmlEnumValue("ThousandthsofMinutes")
    THOUSANDTHSOF_MINUTES("ThousandthsofMinutes"),
    @XmlEnumValue("TenThousandthsofMinutes")
    TEN_THOUSANDTHSOF_MINUTES("TenThousandthsofMinutes"),
    @XmlEnumValue("HundredThousandthsofMinutes")
    HUNDRED_THOUSANDTHSOF_MINUTES("HundredThousandthsofMinutes"),
    @XmlEnumValue("MillionthsofMinutes")
    MILLIONTHSOF_MINUTES("MillionthsofMinutes");
    private final String value;

    ExportPlanningSolutionJobParametersVariableServiceTimeFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportPlanningSolutionJobParametersVariableServiceTimeFormat fromValue(String v) {
        for (ExportPlanningSolutionJobParametersVariableServiceTimeFormat c: ExportPlanningSolutionJobParametersVariableServiceTimeFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
