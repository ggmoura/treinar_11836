
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de JobFailureReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="JobFailureReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="AbortedForInactivity"/&gt;
 *     &lt;enumeration value="UnexpectedError"/&gt;
 *     &lt;enumeration value="CannotAddGroupToUser"/&gt;
 *     &lt;enumeration value="CannotAddRoleToUser"/&gt;
 *     &lt;enumeration value="CannotModifyRole"/&gt;
 *     &lt;enumeration value="CannotModifyGroup"/&gt;
 *     &lt;enumeration value="CannotAccessRegion"/&gt;
 *     &lt;enumeration value="CannotModifyRoute"/&gt;
 *     &lt;enumeration value="CannotDeleteSelf"/&gt;
 *     &lt;enumeration value="CannotImportType"/&gt;
 *     &lt;enumeration value="CannotSaveType"/&gt;
 *     &lt;enumeration value="CannotDeleteRole"/&gt;
 *     &lt;enumeration value="CannotDeleteUser"/&gt;
 *     &lt;enumeration value="CannotDeleteUserGroup"/&gt;
 *     &lt;enumeration value="FileIsNotSupportedExcel"/&gt;
 *     &lt;enumeration value="InvalidSheet"/&gt;
 *     &lt;enumeration value="NotEnoughProperties"/&gt;
 *     &lt;enumeration value="InvalidColumn"/&gt;
 *     &lt;enumeration value="IncorrectImportParameters"/&gt;
 *     &lt;enumeration value="IncorrectUser"/&gt;
 *     &lt;enumeration value="IncorrectTransferTemplateSet"/&gt;
 *     &lt;enumeration value="IncorrectImportTemplate"/&gt;
 *     &lt;enumeration value="RouteSignatureConcurrency"/&gt;
 *     &lt;enumeration value="FailedToLockRequiredResource"/&gt;
 *     &lt;enumeration value="AutoGenerateOrdersMultiplePasses"/&gt;
 *     &lt;enumeration value="AutoGenerateOrdersNoOrderClass"/&gt;
 *     &lt;enumeration value="AutoGenerateOrdersUsingLineItems"/&gt;
 *     &lt;enumeration value="LineItemHasNoMatchingOrder"/&gt;
 *     &lt;enumeration value="DataWarehouseNotReady"/&gt;
 *     &lt;enumeration value="DuplicateData"/&gt;
 *     &lt;enumeration value="ImportInvalidSession"/&gt;
 *     &lt;enumeration value="KpiExportLocationInvalid"/&gt;
 *     &lt;enumeration value="NoPermission"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JobFailureReason")
@XmlEnum
public enum JobFailureReason {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("AbortedForInactivity")
    ABORTED_FOR_INACTIVITY("AbortedForInactivity"),
    @XmlEnumValue("UnexpectedError")
    UNEXPECTED_ERROR("UnexpectedError"),
    @XmlEnumValue("CannotAddGroupToUser")
    CANNOT_ADD_GROUP_TO_USER("CannotAddGroupToUser"),
    @XmlEnumValue("CannotAddRoleToUser")
    CANNOT_ADD_ROLE_TO_USER("CannotAddRoleToUser"),
    @XmlEnumValue("CannotModifyRole")
    CANNOT_MODIFY_ROLE("CannotModifyRole"),
    @XmlEnumValue("CannotModifyGroup")
    CANNOT_MODIFY_GROUP("CannotModifyGroup"),
    @XmlEnumValue("CannotAccessRegion")
    CANNOT_ACCESS_REGION("CannotAccessRegion"),
    @XmlEnumValue("CannotModifyRoute")
    CANNOT_MODIFY_ROUTE("CannotModifyRoute"),
    @XmlEnumValue("CannotDeleteSelf")
    CANNOT_DELETE_SELF("CannotDeleteSelf"),
    @XmlEnumValue("CannotImportType")
    CANNOT_IMPORT_TYPE("CannotImportType"),
    @XmlEnumValue("CannotSaveType")
    CANNOT_SAVE_TYPE("CannotSaveType"),
    @XmlEnumValue("CannotDeleteRole")
    CANNOT_DELETE_ROLE("CannotDeleteRole"),
    @XmlEnumValue("CannotDeleteUser")
    CANNOT_DELETE_USER("CannotDeleteUser"),
    @XmlEnumValue("CannotDeleteUserGroup")
    CANNOT_DELETE_USER_GROUP("CannotDeleteUserGroup"),
    @XmlEnumValue("FileIsNotSupportedExcel")
    FILE_IS_NOT_SUPPORTED_EXCEL("FileIsNotSupportedExcel"),
    @XmlEnumValue("InvalidSheet")
    INVALID_SHEET("InvalidSheet"),
    @XmlEnumValue("NotEnoughProperties")
    NOT_ENOUGH_PROPERTIES("NotEnoughProperties"),
    @XmlEnumValue("InvalidColumn")
    INVALID_COLUMN("InvalidColumn"),
    @XmlEnumValue("IncorrectImportParameters")
    INCORRECT_IMPORT_PARAMETERS("IncorrectImportParameters"),
    @XmlEnumValue("IncorrectUser")
    INCORRECT_USER("IncorrectUser"),
    @XmlEnumValue("IncorrectTransferTemplateSet")
    INCORRECT_TRANSFER_TEMPLATE_SET("IncorrectTransferTemplateSet"),
    @XmlEnumValue("IncorrectImportTemplate")
    INCORRECT_IMPORT_TEMPLATE("IncorrectImportTemplate"),
    @XmlEnumValue("RouteSignatureConcurrency")
    ROUTE_SIGNATURE_CONCURRENCY("RouteSignatureConcurrency"),
    @XmlEnumValue("FailedToLockRequiredResource")
    FAILED_TO_LOCK_REQUIRED_RESOURCE("FailedToLockRequiredResource"),
    @XmlEnumValue("AutoGenerateOrdersMultiplePasses")
    AUTO_GENERATE_ORDERS_MULTIPLE_PASSES("AutoGenerateOrdersMultiplePasses"),
    @XmlEnumValue("AutoGenerateOrdersNoOrderClass")
    AUTO_GENERATE_ORDERS_NO_ORDER_CLASS("AutoGenerateOrdersNoOrderClass"),
    @XmlEnumValue("AutoGenerateOrdersUsingLineItems")
    AUTO_GENERATE_ORDERS_USING_LINE_ITEMS("AutoGenerateOrdersUsingLineItems"),
    @XmlEnumValue("LineItemHasNoMatchingOrder")
    LINE_ITEM_HAS_NO_MATCHING_ORDER("LineItemHasNoMatchingOrder"),
    @XmlEnumValue("DataWarehouseNotReady")
    DATA_WAREHOUSE_NOT_READY("DataWarehouseNotReady"),
    @XmlEnumValue("DuplicateData")
    DUPLICATE_DATA("DuplicateData"),
    @XmlEnumValue("ImportInvalidSession")
    IMPORT_INVALID_SESSION("ImportInvalidSession"),
    @XmlEnumValue("KpiExportLocationInvalid")
    KPI_EXPORT_LOCATION_INVALID("KpiExportLocationInvalid"),
    @XmlEnumValue("NoPermission")
    NO_PERMISSION("NoPermission");
    private final String value;

    JobFailureReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobFailureReason fromValue(String v) {
        for (JobFailureReason c: JobFailureReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
