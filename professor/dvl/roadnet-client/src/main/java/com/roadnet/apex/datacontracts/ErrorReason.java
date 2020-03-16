
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ErrorReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UnexpectedError"/&gt;
 *     &lt;enumeration value="ValidationFailure"/&gt;
 *     &lt;enumeration value="DatabaseTimeout"/&gt;
 *     &lt;enumeration value="Duplicate"/&gt;
 *     &lt;enumeration value="AlreadyLocked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorReason")
@XmlEnum
public enum ErrorReason {

    @XmlEnumValue("UnexpectedError")
    UNEXPECTED_ERROR("UnexpectedError"),
    @XmlEnumValue("ValidationFailure")
    VALIDATION_FAILURE("ValidationFailure"),
    @XmlEnumValue("DatabaseTimeout")
    DATABASE_TIMEOUT("DatabaseTimeout"),
    @XmlEnumValue("Duplicate")
    DUPLICATE("Duplicate"),
    @XmlEnumValue("AlreadyLocked")
    ALREADY_LOCKED("AlreadyLocked");
    private final String value;

    ErrorReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorReason fromValue(String v) {
        for (ErrorReason c: ErrorReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
