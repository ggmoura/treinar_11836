
package org.datacontract.schemas._2004._07.roadnet_apex_server_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ExportPlanningSolutionPropertyResult.ErrorType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportPlanningSolutionPropertyResult.ErrorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ValueWasTruncated"/&gt;
 *     &lt;enumeration value="InvalidMaskDefaultWasUsed"/&gt;
 *     &lt;enumeration value="InvalidLayout"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExportPlanningSolutionPropertyResult.ErrorType")
@XmlEnum
public enum ExportPlanningSolutionPropertyResultErrorType {

    @XmlEnumValue("ValueWasTruncated")
    VALUE_WAS_TRUNCATED("ValueWasTruncated"),
    @XmlEnumValue("InvalidMaskDefaultWasUsed")
    INVALID_MASK_DEFAULT_WAS_USED("InvalidMaskDefaultWasUsed"),
    @XmlEnumValue("InvalidLayout")
    INVALID_LAYOUT("InvalidLayout");
    private final String value;

    ExportPlanningSolutionPropertyResultErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportPlanningSolutionPropertyResultErrorType fromValue(String v) {
        for (ExportPlanningSolutionPropertyResultErrorType c: ExportPlanningSolutionPropertyResultErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
