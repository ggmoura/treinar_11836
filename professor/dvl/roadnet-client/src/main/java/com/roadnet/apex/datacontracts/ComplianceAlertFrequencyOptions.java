
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ComplianceAlert.FrequencyOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplianceAlert.FrequencyOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OnDemand"/&gt;
 *     &lt;enumeration value="EveryOneHour"/&gt;
 *     &lt;enumeration value="EveryTwoHours"/&gt;
 *     &lt;enumeration value="EveryFourHours"/&gt;
 *     &lt;enumeration value="EveryEightHours"/&gt;
 *     &lt;enumeration value="Daily"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComplianceAlert.FrequencyOptions")
@XmlEnum
public enum ComplianceAlertFrequencyOptions {

    @XmlEnumValue("OnDemand")
    ON_DEMAND("OnDemand"),
    @XmlEnumValue("EveryOneHour")
    EVERY_ONE_HOUR("EveryOneHour"),
    @XmlEnumValue("EveryTwoHours")
    EVERY_TWO_HOURS("EveryTwoHours"),
    @XmlEnumValue("EveryFourHours")
    EVERY_FOUR_HOURS("EveryFourHours"),
    @XmlEnumValue("EveryEightHours")
    EVERY_EIGHT_HOURS("EveryEightHours"),
    @XmlEnumValue("Daily")
    DAILY("Daily");
    private final String value;

    ComplianceAlertFrequencyOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplianceAlertFrequencyOptions fromValue(String v) {
        for (ComplianceAlertFrequencyOptions c: ComplianceAlertFrequencyOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
