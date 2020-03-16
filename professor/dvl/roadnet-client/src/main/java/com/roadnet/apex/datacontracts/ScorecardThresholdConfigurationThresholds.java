
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ScorecardThresholdConfiguration.Thresholds.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ScorecardThresholdConfiguration.Thresholds"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoThresholds"/&gt;
 *     &lt;enumeration value="OneThreshold"/&gt;
 *     &lt;enumeration value="TwoThresholds"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScorecardThresholdConfiguration.Thresholds")
@XmlEnum
public enum ScorecardThresholdConfigurationThresholds {

    @XmlEnumValue("NoThresholds")
    NO_THRESHOLDS("NoThresholds"),
    @XmlEnumValue("OneThreshold")
    ONE_THRESHOLD("OneThreshold"),
    @XmlEnumValue("TwoThresholds")
    TWO_THRESHOLDS("TwoThresholds");
    private final String value;

    ScorecardThresholdConfigurationThresholds(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScorecardThresholdConfigurationThresholds fromValue(String v) {
        for (ScorecardThresholdConfigurationThresholds c: ScorecardThresholdConfigurationThresholds.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
