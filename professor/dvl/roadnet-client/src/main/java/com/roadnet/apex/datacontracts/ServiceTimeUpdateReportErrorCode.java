
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceTimeUpdateReport.ErrorCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceTimeUpdateReport.ErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="NotFound"/&gt;
 *     &lt;enumeration value="Stale"/&gt;
 *     &lt;enumeration value="Unexpected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceTimeUpdateReport.ErrorCode")
@XmlEnum
public enum ServiceTimeUpdateReportErrorCode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("Stale")
    STALE("Stale"),
    @XmlEnumValue("Unexpected")
    UNEXPECTED("Unexpected");
    private final String value;

    ServiceTimeUpdateReportErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceTimeUpdateReportErrorCode fromValue(String v) {
        for (ServiceTimeUpdateReportErrorCode c: ServiceTimeUpdateReportErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
