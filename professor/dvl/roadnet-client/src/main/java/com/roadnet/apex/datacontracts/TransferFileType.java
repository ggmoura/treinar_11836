
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransferFileType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferFileType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FixedLength"/&gt;
 *     &lt;enumeration value="Delimited"/&gt;
 *     &lt;enumeration value="CSV"/&gt;
 *     &lt;enumeration value="Excel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferFileType")
@XmlEnum
public enum TransferFileType {

    @XmlEnumValue("FixedLength")
    FIXED_LENGTH("FixedLength"),
    @XmlEnumValue("Delimited")
    DELIMITED("Delimited"),
    CSV("CSV"),
    @XmlEnumValue("Excel")
    EXCEL("Excel");
    private final String value;

    TransferFileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferFileType fromValue(String v) {
        for (TransferFileType c: TransferFileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
