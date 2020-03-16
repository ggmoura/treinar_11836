
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ExecuteReportParameters.OutputFormatType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecuteReportParameters.OutputFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MSWord"/&gt;
 *     &lt;enumeration value="MSExcel"/&gt;
 *     &lt;enumeration value="RTF"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *     &lt;enumeration value="PDF"/&gt;
 *     &lt;enumeration value="XML"/&gt;
 *     &lt;enumeration value="CharacterSeparatedValues"/&gt;
 *     &lt;enumeration value="CharacterSeparatedValuesRaw"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExecuteReportParameters.OutputFormatType")
@XmlEnum
public enum ExecuteReportParametersOutputFormatType {

    @XmlEnumValue("MSWord")
    MS_WORD("MSWord"),
    @XmlEnumValue("MSExcel")
    MS_EXCEL("MSExcel"),
    RTF("RTF"),
    HTML("HTML"),
    PDF("PDF"),
    XML("XML"),
    @XmlEnumValue("CharacterSeparatedValues")
    CHARACTER_SEPARATED_VALUES("CharacterSeparatedValues"),
    @XmlEnumValue("CharacterSeparatedValuesRaw")
    CHARACTER_SEPARATED_VALUES_RAW("CharacterSeparatedValuesRaw");
    private final String value;

    ExecuteReportParametersOutputFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecuteReportParametersOutputFormatType fromValue(String v) {
        for (ExecuteReportParametersOutputFormatType c: ExecuteReportParametersOutputFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
