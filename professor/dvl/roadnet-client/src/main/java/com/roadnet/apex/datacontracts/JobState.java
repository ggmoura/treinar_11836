
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de JobState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="JobState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Running"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JobState")
@XmlEnum
public enum JobState {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    JobState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobState fromValue(String v) {
        for (JobState c: JobState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
