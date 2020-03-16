
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LockOrderResults.LockOrderFailure.LockOrderErrorCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LockOrderResults.LockOrderFailure.LockOrderErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RouteNotFound"/&gt;
 *     &lt;enumeration value="StopNotFound"/&gt;
 *     &lt;enumeration value="StaleRoute"/&gt;
 *     &lt;enumeration value="LockFailure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LockOrderResults.LockOrderFailure.LockOrderErrorCode")
@XmlEnum
public enum LockOrderResultsLockOrderFailureLockOrderErrorCode {

    @XmlEnumValue("RouteNotFound")
    ROUTE_NOT_FOUND("RouteNotFound"),
    @XmlEnumValue("StopNotFound")
    STOP_NOT_FOUND("StopNotFound"),
    @XmlEnumValue("StaleRoute")
    STALE_ROUTE("StaleRoute"),
    @XmlEnumValue("LockFailure")
    LOCK_FAILURE("LockFailure");
    private final String value;

    LockOrderResultsLockOrderFailureLockOrderErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LockOrderResultsLockOrderFailureLockOrderErrorCode fromValue(String v) {
        for (LockOrderResultsLockOrderFailureLockOrderErrorCode c: LockOrderResultsLockOrderFailureLockOrderErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
