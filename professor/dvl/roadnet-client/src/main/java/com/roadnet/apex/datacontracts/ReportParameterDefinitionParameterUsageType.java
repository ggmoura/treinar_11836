
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReportParameterDefinition.ParameterUsageType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportParameterDefinition.ParameterUsageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Server"/&gt;
 *     &lt;enumeration value="Criteria"/&gt;
 *     &lt;enumeration value="Option"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportParameterDefinition.ParameterUsageType")
@XmlEnum
public enum ReportParameterDefinitionParameterUsageType {

    @XmlEnumValue("Server")
    SERVER("Server"),
    @XmlEnumValue("Criteria")
    CRITERIA("Criteria"),
    @XmlEnumValue("Option")
    OPTION("Option");
    private final String value;

    ReportParameterDefinitionParameterUsageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportParameterDefinitionParameterUsageType fromValue(String v) {
        for (ReportParameterDefinitionParameterUsageType c: ReportParameterDefinitionParameterUsageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
