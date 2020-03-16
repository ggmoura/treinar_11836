
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessUnit.AlertDateFormat.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessUnit.AlertDateFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MonthDayYear"/&gt;
 *     &lt;enumeration value="MonthDayShortYear"/&gt;
 *     &lt;enumeration value="DayMonthYear"/&gt;
 *     &lt;enumeration value="YearMonthDay"/&gt;
 *     &lt;enumeration value="DayMonthAbbreviationYear"/&gt;
 *     &lt;enumeration value="YearMonthAbbreviationDay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessUnit.AlertDateFormat")
@XmlEnum
public enum BusinessUnitAlertDateFormat {

    @XmlEnumValue("MonthDayYear")
    MONTH_DAY_YEAR("MonthDayYear"),
    @XmlEnumValue("MonthDayShortYear")
    MONTH_DAY_SHORT_YEAR("MonthDayShortYear"),
    @XmlEnumValue("DayMonthYear")
    DAY_MONTH_YEAR("DayMonthYear"),
    @XmlEnumValue("YearMonthDay")
    YEAR_MONTH_DAY("YearMonthDay"),
    @XmlEnumValue("DayMonthAbbreviationYear")
    DAY_MONTH_ABBREVIATION_YEAR("DayMonthAbbreviationYear"),
    @XmlEnumValue("YearMonthAbbreviationDay")
    YEAR_MONTH_ABBREVIATION_DAY("YearMonthAbbreviationDay");
    private final String value;

    BusinessUnitAlertDateFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessUnitAlertDateFormat fromValue(String v) {
        for (BusinessUnitAlertDateFormat c: BusinessUnitAlertDateFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
