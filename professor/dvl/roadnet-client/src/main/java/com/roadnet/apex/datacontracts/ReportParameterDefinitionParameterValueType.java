
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReportParameterDefinition.ParameterValueType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportParameterDefinition.ParameterValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="Decimal"/&gt;
 *     &lt;enumeration value="Boolean"/&gt;
 *     &lt;enumeration value="RouteCriteria"/&gt;
 *     &lt;enumeration value="SortBy"/&gt;
 *     &lt;enumeration value="GroupBy"/&gt;
 *     &lt;enumeration value="RouteTemplateCriteria"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportParameterDefinition.ParameterValueType")
@XmlEnum
public enum ReportParameterDefinitionParameterValueType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("RouteCriteria")
    ROUTE_CRITERIA("RouteCriteria"),
    @XmlEnumValue("SortBy")
    SORT_BY("SortBy"),
    @XmlEnumValue("GroupBy")
    GROUP_BY("GroupBy"),
    @XmlEnumValue("RouteTemplateCriteria")
    ROUTE_TEMPLATE_CRITERIA("RouteTemplateCriteria");
    private final String value;

    ReportParameterDefinitionParameterValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportParameterDefinitionParameterValueType fromValue(String v) {
        for (ReportParameterDefinitionParameterValueType c: ReportParameterDefinitionParameterValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
