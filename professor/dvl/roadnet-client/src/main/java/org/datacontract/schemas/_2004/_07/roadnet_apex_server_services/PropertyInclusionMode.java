
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PropertyInclusionMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyInclusionMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="AllWithoutChildren"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="AccordingToPropertyOptions"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PropertyInclusionMode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping")
@XmlEnum
public enum PropertyInclusionMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("AllWithoutChildren")
    ALL_WITHOUT_CHILDREN("AllWithoutChildren"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("AccordingToPropertyOptions")
    ACCORDING_TO_PROPERTY_OPTIONS("AccordingToPropertyOptions");
    private final String value;

    PropertyInclusionMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyInclusionMode fromValue(String v) {
        for (PropertyInclusionMode c: PropertyInclusionMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
