
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ComplianceAlert.PriorityOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplianceAlert.PriorityOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComplianceAlert.PriorityOptions")
@XmlEnum
public enum ComplianceAlertPriorityOptions {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    ComplianceAlertPriorityOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplianceAlertPriorityOptions fromValue(String v) {
        for (ComplianceAlertPriorityOptions c: ComplianceAlertPriorityOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
