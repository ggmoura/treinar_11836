
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OperatorType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Subtract"/&gt;
 *     &lt;enumeration value="Multiply"/&gt;
 *     &lt;enumeration value="Divide"/&gt;
 *     &lt;enumeration value="Percent"/&gt;
 *     &lt;enumeration value="PercentChange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatorType")
@XmlEnum
public enum OperatorType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Subtract")
    SUBTRACT("Subtract"),
    @XmlEnumValue("Multiply")
    MULTIPLY("Multiply"),
    @XmlEnumValue("Divide")
    DIVIDE("Divide"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("PercentChange")
    PERCENT_CHANGE("PercentChange");
    private final String value;

    OperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorType fromValue(String v) {
        for (OperatorType c: OperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
