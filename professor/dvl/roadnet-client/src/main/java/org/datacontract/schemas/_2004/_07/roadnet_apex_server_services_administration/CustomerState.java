
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CustomerState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Attached"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerState")
@XmlEnum
public enum CustomerState {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Attached")
    ATTACHED("Attached");
    private final String value;

    CustomerState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerState fromValue(String v) {
        for (CustomerState c: CustomerState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
