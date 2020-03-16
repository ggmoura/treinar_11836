
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessUnit.EmailAddressStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessUnit.EmailAddressStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WaitingForVerification"/&gt;
 *     &lt;enumeration value="Verified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessUnit.EmailAddressStatus")
@XmlEnum
public enum BusinessUnitEmailAddressStatus {

    @XmlEnumValue("WaitingForVerification")
    WAITING_FOR_VERIFICATION("WaitingForVerification"),
    @XmlEnumValue("Verified")
    VERIFIED("Verified");
    private final String value;

    BusinessUnitEmailAddressStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessUnitEmailAddressStatus fromValue(String v) {
        for (BusinessUnitEmailAddressStatus c: BusinessUnitEmailAddressStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
