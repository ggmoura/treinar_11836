
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FormControlResponseType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FormControlResponseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="Numeric"/&gt;
 *     &lt;enumeration value="Boolean"/&gt;
 *     &lt;enumeration value="PickList"/&gt;
 *     &lt;enumeration value="Inspection"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Image"/&gt;
 *     &lt;enumeration value="Position"/&gt;
 *     &lt;enumeration value="SafeToOperate"/&gt;
 *     &lt;enumeration value="Signature"/&gt;
 *     &lt;enumeration value="DynamicPickList"/&gt;
 *     &lt;enumeration value="ServiceLocation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FormControlResponseType")
@XmlEnum
public enum FormControlResponseType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("PickList")
    PICK_LIST("PickList"),
    @XmlEnumValue("Inspection")
    INSPECTION("Inspection"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Position")
    POSITION("Position"),
    @XmlEnumValue("SafeToOperate")
    SAFE_TO_OPERATE("SafeToOperate"),
    @XmlEnumValue("Signature")
    SIGNATURE("Signature"),
    @XmlEnumValue("DynamicPickList")
    DYNAMIC_PICK_LIST("DynamicPickList"),
    @XmlEnumValue("ServiceLocation")
    SERVICE_LOCATION("ServiceLocation");
    private final String value;

    FormControlResponseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormControlResponseType fromValue(String v) {
        for (FormControlResponseType c: FormControlResponseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
