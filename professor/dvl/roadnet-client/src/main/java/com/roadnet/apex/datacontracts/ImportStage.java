
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImportStage.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Initialization"/&gt;
 *     &lt;enumeration value="Validation"/&gt;
 *     &lt;enumeration value="Transferring"/&gt;
 *     &lt;enumeration value="Submitting"/&gt;
 *     &lt;enumeration value="Geocoding"/&gt;
 *     &lt;enumeration value="Routing"/&gt;
 *     &lt;enumeration value="GeneratingPath"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImportStage")
@XmlEnum
public enum ImportStage {

    @XmlEnumValue("Initialization")
    INITIALIZATION("Initialization"),
    @XmlEnumValue("Validation")
    VALIDATION("Validation"),
    @XmlEnumValue("Transferring")
    TRANSFERRING("Transferring"),
    @XmlEnumValue("Submitting")
    SUBMITTING("Submitting"),
    @XmlEnumValue("Geocoding")
    GEOCODING("Geocoding"),
    @XmlEnumValue("Routing")
    ROUTING("Routing"),
    @XmlEnumValue("GeneratingPath")
    GENERATING_PATH("GeneratingPath");
    private final String value;

    ImportStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportStage fromValue(String v) {
        for (ImportStage c: ImportStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
