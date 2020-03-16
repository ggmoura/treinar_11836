
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VideoEventTriggerType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoEventTriggerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HardBrake"/&gt;
 *     &lt;enumeration value="AbsHardBrake"/&gt;
 *     &lt;enumeration value="LaneDepartureImminent"/&gt;
 *     &lt;enumeration value="StabilityControlWarning"/&gt;
 *     &lt;enumeration value="ForwardCollisionHapticWarning"/&gt;
 *     &lt;enumeration value="ForwardCollisionCmsWarning"/&gt;
 *     &lt;enumeration value="FollowingTimeViolation"/&gt;
 *     &lt;enumeration value="ForwardCollisionWarning"/&gt;
 *     &lt;enumeration value="LaneDepartureActual"/&gt;
 *     &lt;enumeration value="LaneDepartureDisabled"/&gt;
 *     &lt;enumeration value="Overspeed"/&gt;
 *     &lt;enumeration value="ExcessiveOverspeed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VideoEventTriggerType")
@XmlEnum
public enum VideoEventTriggerType {

    @XmlEnumValue("HardBrake")
    HARD_BRAKE("HardBrake"),
    @XmlEnumValue("AbsHardBrake")
    ABS_HARD_BRAKE("AbsHardBrake"),
    @XmlEnumValue("LaneDepartureImminent")
    LANE_DEPARTURE_IMMINENT("LaneDepartureImminent"),
    @XmlEnumValue("StabilityControlWarning")
    STABILITY_CONTROL_WARNING("StabilityControlWarning"),
    @XmlEnumValue("ForwardCollisionHapticWarning")
    FORWARD_COLLISION_HAPTIC_WARNING("ForwardCollisionHapticWarning"),
    @XmlEnumValue("ForwardCollisionCmsWarning")
    FORWARD_COLLISION_CMS_WARNING("ForwardCollisionCmsWarning"),
    @XmlEnumValue("FollowingTimeViolation")
    FOLLOWING_TIME_VIOLATION("FollowingTimeViolation"),
    @XmlEnumValue("ForwardCollisionWarning")
    FORWARD_COLLISION_WARNING("ForwardCollisionWarning"),
    @XmlEnumValue("LaneDepartureActual")
    LANE_DEPARTURE_ACTUAL("LaneDepartureActual"),
    @XmlEnumValue("LaneDepartureDisabled")
    LANE_DEPARTURE_DISABLED("LaneDepartureDisabled"),
    @XmlEnumValue("Overspeed")
    OVERSPEED("Overspeed"),
    @XmlEnumValue("ExcessiveOverspeed")
    EXCESSIVE_OVERSPEED("ExcessiveOverspeed");
    private final String value;

    VideoEventTriggerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoEventTriggerType fromValue(String v) {
        for (VideoEventTriggerType c: VideoEventTriggerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
