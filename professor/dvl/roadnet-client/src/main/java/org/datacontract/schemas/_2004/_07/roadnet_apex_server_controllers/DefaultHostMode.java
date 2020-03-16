
package org.datacontract.schemas._2004._07.roadnet_apex_server_controllers;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DefaultHostMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DefaultHostMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="Eld"/&gt;
 *     &lt;enumeration value="Mixed"/&gt;
 *     &lt;enumeration value="Aobrd"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DefaultHostMode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Controllers.XrsEntityManager")
@XmlEnum
public enum DefaultHostMode {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("Eld")
    ELD("Eld"),
    @XmlEnumValue("Mixed")
    MIXED("Mixed"),
    @XmlEnumValue("Aobrd")
    AOBRD("Aobrd");
    private final String value;

    DefaultHostMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefaultHostMode fromValue(String v) {
        for (DefaultHostMode c: DefaultHostMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
