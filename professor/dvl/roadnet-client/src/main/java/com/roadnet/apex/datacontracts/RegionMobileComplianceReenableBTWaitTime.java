
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.MobileComplianceReenableBTWaitTime.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.MobileComplianceReenableBTWaitTime"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DoNotTryToTurnBackOn"/&gt;
 *     &lt;enumeration value="DurationSeconds60"/&gt;
 *     &lt;enumeration value="DurationSeconds120"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.MobileComplianceReenableBTWaitTime")
@XmlEnum
public enum RegionMobileComplianceReenableBTWaitTime {

    @XmlEnumValue("DoNotTryToTurnBackOn")
    DO_NOT_TRY_TO_TURN_BACK_ON("DoNotTryToTurnBackOn"),
    @XmlEnumValue("DurationSeconds60")
    DURATION_SECONDS_60("DurationSeconds60"),
    @XmlEnumValue("DurationSeconds120")
    DURATION_SECONDS_120("DurationSeconds120");
    private final String value;

    RegionMobileComplianceReenableBTWaitTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionMobileComplianceReenableBTWaitTime fromValue(String v) {
        for (RegionMobileComplianceReenableBTWaitTime c: RegionMobileComplianceReenableBTWaitTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
