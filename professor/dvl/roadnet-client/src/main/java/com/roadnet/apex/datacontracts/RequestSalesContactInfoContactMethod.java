
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RequestSalesContactInfo.ContactMethod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestSalesContactInfo.ContactMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="Phone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestSalesContactInfo.ContactMethod")
@XmlEnum
public enum RequestSalesContactInfoContactMethod {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Phone")
    PHONE("Phone");
    private final String value;

    RequestSalesContactInfoContactMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestSalesContactInfoContactMethod fromValue(String v) {
        for (RequestSalesContactInfoContactMethod c: RequestSalesContactInfoContactMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
