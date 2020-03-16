
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SameDayMatricesStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SameDayMatricesStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="BuildRequestQueued"/&gt;
 *     &lt;enumeration value="BuildStarted"/&gt;
 *     &lt;enumeration value="BuildCompleted"/&gt;
 *     &lt;enumeration value="BuildFailed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SameDayMatricesStatus")
@XmlEnum
public enum SameDayMatricesStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("BuildRequestQueued")
    BUILD_REQUEST_QUEUED("BuildRequestQueued"),
    @XmlEnumValue("BuildStarted")
    BUILD_STARTED("BuildStarted"),
    @XmlEnumValue("BuildCompleted")
    BUILD_COMPLETED("BuildCompleted"),
    @XmlEnumValue("BuildFailed")
    BUILD_FAILED("BuildFailed");
    private final String value;

    SameDayMatricesStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SameDayMatricesStatus fromValue(String v) {
        for (SameDayMatricesStatus c: SameDayMatricesStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
