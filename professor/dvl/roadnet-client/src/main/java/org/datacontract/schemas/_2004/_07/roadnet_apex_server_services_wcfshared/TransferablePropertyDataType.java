
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransferablePropertyDataType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferablePropertyDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="String"/&gt;
 *     &lt;enumeration value="Time"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Numeric"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferablePropertyDataType")
@XmlEnum
public enum TransferablePropertyDataType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric");
    private final String value;

    TransferablePropertyDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferablePropertyDataType fromValue(String v) {
        for (TransferablePropertyDataType c: TransferablePropertyDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
