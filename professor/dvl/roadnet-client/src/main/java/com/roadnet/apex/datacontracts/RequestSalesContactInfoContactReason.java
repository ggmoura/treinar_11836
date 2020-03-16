
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RequestSalesContactInfo.ContactReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestSalesContactInfo.ContactReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSpecified"/&gt;
 *     &lt;enumeration value="PurchaseableOptions"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestSalesContactInfo.ContactReason")
@XmlEnum
public enum RequestSalesContactInfoContactReason {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("PurchaseableOptions")
    PURCHASEABLE_OPTIONS("PurchaseableOptions");
    private final String value;

    RequestSalesContactInfoContactReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestSalesContactInfoContactReason fromValue(String v) {
        for (RequestSalesContactInfoContactReason c: RequestSalesContactInfoContactReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
