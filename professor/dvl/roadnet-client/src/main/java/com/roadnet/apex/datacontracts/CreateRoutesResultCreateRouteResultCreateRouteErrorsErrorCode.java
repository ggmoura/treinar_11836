
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CreateRoutesResult.CreateRouteResult.CreateRouteErrors.ErrorCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CreateRoutesResult.CreateRouteResult.CreateRouteErrors.ErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="ValidationFailure"/&gt;
 *     &lt;enumeration value="ManipulationFailure"/&gt;
 *     &lt;enumeration value="DataConstraintViolation"/&gt;
 *     &lt;enumeration value="RequestCannotBeHandledAtThisTime"/&gt;
 *     &lt;enumeration value="StaleObjectState"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreateRoutesResult.CreateRouteResult.CreateRouteErrors.ErrorCode")
@XmlEnum
public enum CreateRoutesResultCreateRouteResultCreateRouteErrorsErrorCode {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("ValidationFailure")
    VALIDATION_FAILURE("ValidationFailure"),
    @XmlEnumValue("ManipulationFailure")
    MANIPULATION_FAILURE("ManipulationFailure"),
    @XmlEnumValue("DataConstraintViolation")
    DATA_CONSTRAINT_VIOLATION("DataConstraintViolation"),
    @XmlEnumValue("RequestCannotBeHandledAtThisTime")
    REQUEST_CANNOT_BE_HANDLED_AT_THIS_TIME("RequestCannotBeHandledAtThisTime"),
    @XmlEnumValue("StaleObjectState")
    STALE_OBJECT_STATE("StaleObjectState");
    private final String value;

    CreateRoutesResultCreateRouteResultCreateRouteErrorsErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreateRoutesResultCreateRouteResultCreateRouteErrorsErrorCode fromValue(String v) {
        for (CreateRoutesResultCreateRouteResultCreateRouteErrorsErrorCode c: CreateRoutesResultCreateRouteResultCreateRouteErrorsErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
