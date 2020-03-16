
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PasswordPolicyViolation.ViolationType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PasswordPolicyViolation.ViolationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TooShort"/&gt;
 *     &lt;enumeration value="TooFewAlphaCharacters"/&gt;
 *     &lt;enumeration value="TooFewNumericCharacters"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="UsernameMatch"/&gt;
 *     &lt;enumeration value="AlreadyUsed"/&gt;
 *     &lt;enumeration value="TooFewUppercaseCharacters"/&gt;
 *     &lt;enumeration value="TooFewLowercaseCharacters"/&gt;
 *     &lt;enumeration value="TooFewSpecialCharacters"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PasswordPolicyViolation.ViolationType")
@XmlEnum
public enum PasswordPolicyViolationViolationType {

    @XmlEnumValue("TooShort")
    TOO_SHORT("TooShort"),
    @XmlEnumValue("TooFewAlphaCharacters")
    TOO_FEW_ALPHA_CHARACTERS("TooFewAlphaCharacters"),
    @XmlEnumValue("TooFewNumericCharacters")
    TOO_FEW_NUMERIC_CHARACTERS("TooFewNumericCharacters"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("UsernameMatch")
    USERNAME_MATCH("UsernameMatch"),
    @XmlEnumValue("AlreadyUsed")
    ALREADY_USED("AlreadyUsed"),
    @XmlEnumValue("TooFewUppercaseCharacters")
    TOO_FEW_UPPERCASE_CHARACTERS("TooFewUppercaseCharacters"),
    @XmlEnumValue("TooFewLowercaseCharacters")
    TOO_FEW_LOWERCASE_CHARACTERS("TooFewLowercaseCharacters"),
    @XmlEnumValue("TooFewSpecialCharacters")
    TOO_FEW_SPECIAL_CHARACTERS("TooFewSpecialCharacters");
    private final String value;

    PasswordPolicyViolationViolationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PasswordPolicyViolationViolationType fromValue(String v) {
        for (PasswordPolicyViolationViolationType c: PasswordPolicyViolationViolationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
