
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HosPrefillComment.CommentType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HosPrefillComment.CommentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OnDuty"/&gt;
 *     &lt;enumeration value="OffDuty"/&gt;
 *     &lt;enumeration value="SleeperBerth"/&gt;
 *     &lt;enumeration value="MobileRemarks"/&gt;
 *     &lt;enumeration value="EditingComments"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HosPrefillComment.CommentType")
@XmlEnum
public enum HosPrefillCommentCommentType {

    @XmlEnumValue("OnDuty")
    ON_DUTY("OnDuty"),
    @XmlEnumValue("OffDuty")
    OFF_DUTY("OffDuty"),
    @XmlEnumValue("SleeperBerth")
    SLEEPER_BERTH("SleeperBerth"),
    @XmlEnumValue("MobileRemarks")
    MOBILE_REMARKS("MobileRemarks"),
    @XmlEnumValue("EditingComments")
    EDITING_COMMENTS("EditingComments");
    private final String value;

    HosPrefillCommentCommentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HosPrefillCommentCommentType fromValue(String v) {
        for (HosPrefillCommentCommentType c: HosPrefillCommentCommentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
