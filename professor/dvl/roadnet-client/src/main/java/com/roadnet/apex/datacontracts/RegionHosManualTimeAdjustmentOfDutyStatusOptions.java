
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Region.HosManualTimeAdjustmentOfDutyStatusOptions.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Region.HosManualTimeAdjustmentOfDutyStatusOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="BackwardOnly"/&gt;
 *     &lt;enumeration value="ForwardOnly"/&gt;
 *     &lt;enumeration value="BackwardAndForward"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Region.HosManualTimeAdjustmentOfDutyStatusOptions")
@XmlEnum
public enum RegionHosManualTimeAdjustmentOfDutyStatusOptions {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("BackwardOnly")
    BACKWARD_ONLY("BackwardOnly"),
    @XmlEnumValue("ForwardOnly")
    FORWARD_ONLY("ForwardOnly"),
    @XmlEnumValue("BackwardAndForward")
    BACKWARD_AND_FORWARD("BackwardAndForward");
    private final String value;

    RegionHosManualTimeAdjustmentOfDutyStatusOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionHosManualTimeAdjustmentOfDutyStatusOptions fromValue(String v) {
        for (RegionHosManualTimeAdjustmentOfDutyStatusOptions c: RegionHosManualTimeAdjustmentOfDutyStatusOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
