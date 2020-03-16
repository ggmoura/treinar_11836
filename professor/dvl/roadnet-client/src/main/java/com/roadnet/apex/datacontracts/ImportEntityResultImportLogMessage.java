
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImportEntityResult.ImportLogMessage.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportEntityResult.ImportLogMessage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="NotAuthorizedToSaveEntity"/&gt;
 *     &lt;enumeration value="NotAuthorizedToDeleteEntity"/&gt;
 *     &lt;enumeration value="InternalError"/&gt;
 *     &lt;enumeration value="CannotAddNewServiceLocationBecauseOfUpdateExistingLocationsOnlyFlag"/&gt;
 *     &lt;enumeration value="DuplicateData"/&gt;
 *     &lt;enumeration value="ConstraintViolation"/&gt;
 *     &lt;enumeration value="CannotAlterOrdersOnBuiltRoutesDueToFlag"/&gt;
 *     &lt;enumeration value="CannotAlterManuallyEnteredOrdersDueToFlag"/&gt;
 *     &lt;enumeration value="CannotLockOrder"/&gt;
 *     &lt;enumeration value="CannotDeleteNonExistingEntity"/&gt;
 *     &lt;enumeration value="ChildMerged"/&gt;
 *     &lt;enumeration value="GeocodingAttentionReason"/&gt;
 *     &lt;enumeration value="LicenseViolation"/&gt;
 *     &lt;enumeration value="CannotAlterOrderOnLoadedRoute"/&gt;
 *     &lt;enumeration value="CannotAlterOrderOnCompletedRoute"/&gt;
 *     &lt;enumeration value="CannotAlterOrderOnArchivedRoute"/&gt;
 *     &lt;enumeration value="RecordsCombinedIntoTransferOrder"/&gt;
 *     &lt;enumeration value="RecordCombinedWExistingOrderIntoTransferOrder"/&gt;
 *     &lt;enumeration value="InvalidTelematicsDeviceNonExistentXrsRelay"/&gt;
 *     &lt;enumeration value="CannotAlterEquipmentTypePowerUnitWithComplianceEnabled"/&gt;
 *     &lt;enumeration value="XrsMobileDevicePhoneNumberInUse"/&gt;
 *     &lt;enumeration value="CannotAssignInUseTelematicsDeviceToEquipment"/&gt;
 *     &lt;enumeration value="CannotAssignNonUniqueVINToEquipment"/&gt;
 *     &lt;enumeration value="CannotAssignNonUniqueLicensePlateNumberToEquipment"/&gt;
 *     &lt;enumeration value="NotSupportedRegionTimeZoneCompliance"/&gt;
 *     &lt;enumeration value="NotSupportedDeviceCarrierCompliance"/&gt;
 *     &lt;enumeration value="InvalidCustomerXRSCompanyInformation"/&gt;
 *     &lt;enumeration value="CannotFindCorrespondingRoleForComplianceIntegration"/&gt;
 *     &lt;enumeration value="PasswordPolicyViolation"/&gt;
 *     &lt;enumeration value="InvalidDevicePhoneNumberCompliance"/&gt;
 *     &lt;enumeration value="RegionNotFoundCompliance"/&gt;
 *     &lt;enumeration value="EquipmentTrailerAlreadyExists"/&gt;
 *     &lt;enumeration value="EquipmentVehicleAlreadyExists"/&gt;
 *     &lt;enumeration value="MobileCredentialsAreRequired"/&gt;
 *     &lt;enumeration value="PasswordIsRequired"/&gt;
 *     &lt;enumeration value="XrsDriverUserNameInUse"/&gt;
 *     &lt;enumeration value="NewPasswordMustBeDifferentThanOldPassword"/&gt;
 *     &lt;enumeration value="LoginUsernameContainsInvalidCharacters"/&gt;
 *     &lt;enumeration value="PasswordContainsInvalidCharacters"/&gt;
 *     &lt;enumeration value="InvalidCountryCompliance"/&gt;
 *     &lt;enumeration value="InvalidStateCompliance"/&gt;
 *     &lt;enumeration value="ComplianceCountryIsRequired"/&gt;
 *     &lt;enumeration value="ComplianceStateIsRequired"/&gt;
 *     &lt;enumeration value="CdlIssuingCountryIsRequired"/&gt;
 *     &lt;enumeration value="CdlIssuingStateIsRequired"/&gt;
 *     &lt;enumeration value="InvalidCdlIssuingCountryCompliance"/&gt;
 *     &lt;enumeration value="InvalidCdlIssuingStateCompliance"/&gt;
 *     &lt;enumeration value="InvalidEquipmentLicensePlateCompliance"/&gt;
 *     &lt;enumeration value="NotSupportedMobilePlatformCompliance"/&gt;
 *     &lt;enumeration value="WorkerFirstLastNameRequiredCompliance"/&gt;
 *     &lt;enumeration value="ComplianceDriverIdAlreadyExists"/&gt;
 *     &lt;enumeration value="CdlNumberIsRequiredCompliance"/&gt;
 *     &lt;enumeration value="InvalidCdlNumberCompliance"/&gt;
 *     &lt;enumeration value="CdlNumberAlreadyExistsCompliance"/&gt;
 *     &lt;enumeration value="CannotAlterEldVehicleCompliance"/&gt;
 *     &lt;enumeration value="InvalidEnableYardMoveCompliance"/&gt;
 *     &lt;enumeration value="ValidVinIsRequiredCompliance"/&gt;
 *     &lt;enumeration value="CannotAlterAutoCapturedVinCompliance"/&gt;
 *     &lt;enumeration value="CannotSetEldVehicleInAobrdModeCompliance"/&gt;
 *     &lt;enumeration value="InvalidHosRulesValidationResult"/&gt;
 *     &lt;enumeration value="SetPasswordFailureCompliance"/&gt;
 *     &lt;enumeration value="InvalidMobilePlatformOmnitracsEntity"/&gt;
 *     &lt;enumeration value="InvalidMobileNetworkOmnitracsEntity"/&gt;
 *     &lt;enumeration value="DevicePhoneNumberLengthInvalidOmnitracsEntity"/&gt;
 *     &lt;enumeration value="DescriptionTooLongOmnitracsEntity"/&gt;
 *     &lt;enumeration value="FailedToAddOrUpdateCustomerPortalDeviceTryAgainLater"/&gt;
 *     &lt;enumeration value="FailedToDeleteCustomerPortalDeviceTryAgainLater"/&gt;
 *     &lt;enumeration value="CannotComputeTravelPathBetweenPoints"/&gt;
 *     &lt;enumeration value="InvalidInputOutputConfigurationForProviderType"/&gt;
 *     &lt;enumeration value="MaximumTravelPairsExceeded"/&gt;
 *     &lt;enumeration value="ServiceAreaPolygonNotSimple"/&gt;
 *     &lt;enumeration value="CoordinateFallsOutsideServiceAreaPolygon"/&gt;
 *     &lt;enumeration value="CannotValidateServiceAreaPolygon"/&gt;
 *     &lt;enumeration value="OmnitracsOneManagedEntityRestricted"/&gt;
 *     &lt;enumeration value="OmnitracsOneManagedPropertyRestricted"/&gt;
 *     &lt;enumeration value="UnmappedComplianceError"/&gt;
 *     &lt;enumeration value="InvalidDriverNameCompliance"/&gt;
 *     &lt;enumeration value="UnmappedActiveAlertError"/&gt;
 *     &lt;enumeration value="Ignored"/&gt;
 *     &lt;enumeration value="RecordsCombinedForRegionVisibility"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImportEntityResult.ImportLogMessage")
@XmlEnum
public enum ImportEntityResultImportLogMessage {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("NotAuthorizedToSaveEntity")
    NOT_AUTHORIZED_TO_SAVE_ENTITY("NotAuthorizedToSaveEntity"),
    @XmlEnumValue("NotAuthorizedToDeleteEntity")
    NOT_AUTHORIZED_TO_DELETE_ENTITY("NotAuthorizedToDeleteEntity"),
    @XmlEnumValue("InternalError")
    INTERNAL_ERROR("InternalError"),
    @XmlEnumValue("CannotAddNewServiceLocationBecauseOfUpdateExistingLocationsOnlyFlag")
    CANNOT_ADD_NEW_SERVICE_LOCATION_BECAUSE_OF_UPDATE_EXISTING_LOCATIONS_ONLY_FLAG("CannotAddNewServiceLocationBecauseOfUpdateExistingLocationsOnlyFlag"),
    @XmlEnumValue("DuplicateData")
    DUPLICATE_DATA("DuplicateData"),
    @XmlEnumValue("ConstraintViolation")
    CONSTRAINT_VIOLATION("ConstraintViolation"),
    @XmlEnumValue("CannotAlterOrdersOnBuiltRoutesDueToFlag")
    CANNOT_ALTER_ORDERS_ON_BUILT_ROUTES_DUE_TO_FLAG("CannotAlterOrdersOnBuiltRoutesDueToFlag"),
    @XmlEnumValue("CannotAlterManuallyEnteredOrdersDueToFlag")
    CANNOT_ALTER_MANUALLY_ENTERED_ORDERS_DUE_TO_FLAG("CannotAlterManuallyEnteredOrdersDueToFlag"),
    @XmlEnumValue("CannotLockOrder")
    CANNOT_LOCK_ORDER("CannotLockOrder"),
    @XmlEnumValue("CannotDeleteNonExistingEntity")
    CANNOT_DELETE_NON_EXISTING_ENTITY("CannotDeleteNonExistingEntity"),
    @XmlEnumValue("ChildMerged")
    CHILD_MERGED("ChildMerged"),
    @XmlEnumValue("GeocodingAttentionReason")
    GEOCODING_ATTENTION_REASON("GeocodingAttentionReason"),
    @XmlEnumValue("LicenseViolation")
    LICENSE_VIOLATION("LicenseViolation"),
    @XmlEnumValue("CannotAlterOrderOnLoadedRoute")
    CANNOT_ALTER_ORDER_ON_LOADED_ROUTE("CannotAlterOrderOnLoadedRoute"),
    @XmlEnumValue("CannotAlterOrderOnCompletedRoute")
    CANNOT_ALTER_ORDER_ON_COMPLETED_ROUTE("CannotAlterOrderOnCompletedRoute"),
    @XmlEnumValue("CannotAlterOrderOnArchivedRoute")
    CANNOT_ALTER_ORDER_ON_ARCHIVED_ROUTE("CannotAlterOrderOnArchivedRoute"),
    @XmlEnumValue("RecordsCombinedIntoTransferOrder")
    RECORDS_COMBINED_INTO_TRANSFER_ORDER("RecordsCombinedIntoTransferOrder"),
    @XmlEnumValue("RecordCombinedWExistingOrderIntoTransferOrder")
    RECORD_COMBINED_W_EXISTING_ORDER_INTO_TRANSFER_ORDER("RecordCombinedWExistingOrderIntoTransferOrder"),
    @XmlEnumValue("InvalidTelematicsDeviceNonExistentXrsRelay")
    INVALID_TELEMATICS_DEVICE_NON_EXISTENT_XRS_RELAY("InvalidTelematicsDeviceNonExistentXrsRelay"),
    @XmlEnumValue("CannotAlterEquipmentTypePowerUnitWithComplianceEnabled")
    CANNOT_ALTER_EQUIPMENT_TYPE_POWER_UNIT_WITH_COMPLIANCE_ENABLED("CannotAlterEquipmentTypePowerUnitWithComplianceEnabled"),
    @XmlEnumValue("XrsMobileDevicePhoneNumberInUse")
    XRS_MOBILE_DEVICE_PHONE_NUMBER_IN_USE("XrsMobileDevicePhoneNumberInUse"),
    @XmlEnumValue("CannotAssignInUseTelematicsDeviceToEquipment")
    CANNOT_ASSIGN_IN_USE_TELEMATICS_DEVICE_TO_EQUIPMENT("CannotAssignInUseTelematicsDeviceToEquipment"),
    @XmlEnumValue("CannotAssignNonUniqueVINToEquipment")
    CANNOT_ASSIGN_NON_UNIQUE_VIN_TO_EQUIPMENT("CannotAssignNonUniqueVINToEquipment"),
    @XmlEnumValue("CannotAssignNonUniqueLicensePlateNumberToEquipment")
    CANNOT_ASSIGN_NON_UNIQUE_LICENSE_PLATE_NUMBER_TO_EQUIPMENT("CannotAssignNonUniqueLicensePlateNumberToEquipment"),
    @XmlEnumValue("NotSupportedRegionTimeZoneCompliance")
    NOT_SUPPORTED_REGION_TIME_ZONE_COMPLIANCE("NotSupportedRegionTimeZoneCompliance"),
    @XmlEnumValue("NotSupportedDeviceCarrierCompliance")
    NOT_SUPPORTED_DEVICE_CARRIER_COMPLIANCE("NotSupportedDeviceCarrierCompliance"),
    @XmlEnumValue("InvalidCustomerXRSCompanyInformation")
    INVALID_CUSTOMER_XRS_COMPANY_INFORMATION("InvalidCustomerXRSCompanyInformation"),
    @XmlEnumValue("CannotFindCorrespondingRoleForComplianceIntegration")
    CANNOT_FIND_CORRESPONDING_ROLE_FOR_COMPLIANCE_INTEGRATION("CannotFindCorrespondingRoleForComplianceIntegration"),
    @XmlEnumValue("PasswordPolicyViolation")
    PASSWORD_POLICY_VIOLATION("PasswordPolicyViolation"),
    @XmlEnumValue("InvalidDevicePhoneNumberCompliance")
    INVALID_DEVICE_PHONE_NUMBER_COMPLIANCE("InvalidDevicePhoneNumberCompliance"),
    @XmlEnumValue("RegionNotFoundCompliance")
    REGION_NOT_FOUND_COMPLIANCE("RegionNotFoundCompliance"),
    @XmlEnumValue("EquipmentTrailerAlreadyExists")
    EQUIPMENT_TRAILER_ALREADY_EXISTS("EquipmentTrailerAlreadyExists"),
    @XmlEnumValue("EquipmentVehicleAlreadyExists")
    EQUIPMENT_VEHICLE_ALREADY_EXISTS("EquipmentVehicleAlreadyExists"),
    @XmlEnumValue("MobileCredentialsAreRequired")
    MOBILE_CREDENTIALS_ARE_REQUIRED("MobileCredentialsAreRequired"),
    @XmlEnumValue("PasswordIsRequired")
    PASSWORD_IS_REQUIRED("PasswordIsRequired"),
    @XmlEnumValue("XrsDriverUserNameInUse")
    XRS_DRIVER_USER_NAME_IN_USE("XrsDriverUserNameInUse"),
    @XmlEnumValue("NewPasswordMustBeDifferentThanOldPassword")
    NEW_PASSWORD_MUST_BE_DIFFERENT_THAN_OLD_PASSWORD("NewPasswordMustBeDifferentThanOldPassword"),
    @XmlEnumValue("LoginUsernameContainsInvalidCharacters")
    LOGIN_USERNAME_CONTAINS_INVALID_CHARACTERS("LoginUsernameContainsInvalidCharacters"),
    @XmlEnumValue("PasswordContainsInvalidCharacters")
    PASSWORD_CONTAINS_INVALID_CHARACTERS("PasswordContainsInvalidCharacters"),
    @XmlEnumValue("InvalidCountryCompliance")
    INVALID_COUNTRY_COMPLIANCE("InvalidCountryCompliance"),
    @XmlEnumValue("InvalidStateCompliance")
    INVALID_STATE_COMPLIANCE("InvalidStateCompliance"),
    @XmlEnumValue("ComplianceCountryIsRequired")
    COMPLIANCE_COUNTRY_IS_REQUIRED("ComplianceCountryIsRequired"),
    @XmlEnumValue("ComplianceStateIsRequired")
    COMPLIANCE_STATE_IS_REQUIRED("ComplianceStateIsRequired"),
    @XmlEnumValue("CdlIssuingCountryIsRequired")
    CDL_ISSUING_COUNTRY_IS_REQUIRED("CdlIssuingCountryIsRequired"),
    @XmlEnumValue("CdlIssuingStateIsRequired")
    CDL_ISSUING_STATE_IS_REQUIRED("CdlIssuingStateIsRequired"),
    @XmlEnumValue("InvalidCdlIssuingCountryCompliance")
    INVALID_CDL_ISSUING_COUNTRY_COMPLIANCE("InvalidCdlIssuingCountryCompliance"),
    @XmlEnumValue("InvalidCdlIssuingStateCompliance")
    INVALID_CDL_ISSUING_STATE_COMPLIANCE("InvalidCdlIssuingStateCompliance"),
    @XmlEnumValue("InvalidEquipmentLicensePlateCompliance")
    INVALID_EQUIPMENT_LICENSE_PLATE_COMPLIANCE("InvalidEquipmentLicensePlateCompliance"),
    @XmlEnumValue("NotSupportedMobilePlatformCompliance")
    NOT_SUPPORTED_MOBILE_PLATFORM_COMPLIANCE("NotSupportedMobilePlatformCompliance"),
    @XmlEnumValue("WorkerFirstLastNameRequiredCompliance")
    WORKER_FIRST_LAST_NAME_REQUIRED_COMPLIANCE("WorkerFirstLastNameRequiredCompliance"),
    @XmlEnumValue("ComplianceDriverIdAlreadyExists")
    COMPLIANCE_DRIVER_ID_ALREADY_EXISTS("ComplianceDriverIdAlreadyExists"),
    @XmlEnumValue("CdlNumberIsRequiredCompliance")
    CDL_NUMBER_IS_REQUIRED_COMPLIANCE("CdlNumberIsRequiredCompliance"),
    @XmlEnumValue("InvalidCdlNumberCompliance")
    INVALID_CDL_NUMBER_COMPLIANCE("InvalidCdlNumberCompliance"),
    @XmlEnumValue("CdlNumberAlreadyExistsCompliance")
    CDL_NUMBER_ALREADY_EXISTS_COMPLIANCE("CdlNumberAlreadyExistsCompliance"),
    @XmlEnumValue("CannotAlterEldVehicleCompliance")
    CANNOT_ALTER_ELD_VEHICLE_COMPLIANCE("CannotAlterEldVehicleCompliance"),
    @XmlEnumValue("InvalidEnableYardMoveCompliance")
    INVALID_ENABLE_YARD_MOVE_COMPLIANCE("InvalidEnableYardMoveCompliance"),
    @XmlEnumValue("ValidVinIsRequiredCompliance")
    VALID_VIN_IS_REQUIRED_COMPLIANCE("ValidVinIsRequiredCompliance"),
    @XmlEnumValue("CannotAlterAutoCapturedVinCompliance")
    CANNOT_ALTER_AUTO_CAPTURED_VIN_COMPLIANCE("CannotAlterAutoCapturedVinCompliance"),
    @XmlEnumValue("CannotSetEldVehicleInAobrdModeCompliance")
    CANNOT_SET_ELD_VEHICLE_IN_AOBRD_MODE_COMPLIANCE("CannotSetEldVehicleInAobrdModeCompliance"),
    @XmlEnumValue("InvalidHosRulesValidationResult")
    INVALID_HOS_RULES_VALIDATION_RESULT("InvalidHosRulesValidationResult"),
    @XmlEnumValue("SetPasswordFailureCompliance")
    SET_PASSWORD_FAILURE_COMPLIANCE("SetPasswordFailureCompliance"),
    @XmlEnumValue("InvalidMobilePlatformOmnitracsEntity")
    INVALID_MOBILE_PLATFORM_OMNITRACS_ENTITY("InvalidMobilePlatformOmnitracsEntity"),
    @XmlEnumValue("InvalidMobileNetworkOmnitracsEntity")
    INVALID_MOBILE_NETWORK_OMNITRACS_ENTITY("InvalidMobileNetworkOmnitracsEntity"),
    @XmlEnumValue("DevicePhoneNumberLengthInvalidOmnitracsEntity")
    DEVICE_PHONE_NUMBER_LENGTH_INVALID_OMNITRACS_ENTITY("DevicePhoneNumberLengthInvalidOmnitracsEntity"),
    @XmlEnumValue("DescriptionTooLongOmnitracsEntity")
    DESCRIPTION_TOO_LONG_OMNITRACS_ENTITY("DescriptionTooLongOmnitracsEntity"),
    @XmlEnumValue("FailedToAddOrUpdateCustomerPortalDeviceTryAgainLater")
    FAILED_TO_ADD_OR_UPDATE_CUSTOMER_PORTAL_DEVICE_TRY_AGAIN_LATER("FailedToAddOrUpdateCustomerPortalDeviceTryAgainLater"),
    @XmlEnumValue("FailedToDeleteCustomerPortalDeviceTryAgainLater")
    FAILED_TO_DELETE_CUSTOMER_PORTAL_DEVICE_TRY_AGAIN_LATER("FailedToDeleteCustomerPortalDeviceTryAgainLater"),
    @XmlEnumValue("CannotComputeTravelPathBetweenPoints")
    CANNOT_COMPUTE_TRAVEL_PATH_BETWEEN_POINTS("CannotComputeTravelPathBetweenPoints"),
    @XmlEnumValue("InvalidInputOutputConfigurationForProviderType")
    INVALID_INPUT_OUTPUT_CONFIGURATION_FOR_PROVIDER_TYPE("InvalidInputOutputConfigurationForProviderType"),
    @XmlEnumValue("MaximumTravelPairsExceeded")
    MAXIMUM_TRAVEL_PAIRS_EXCEEDED("MaximumTravelPairsExceeded"),
    @XmlEnumValue("ServiceAreaPolygonNotSimple")
    SERVICE_AREA_POLYGON_NOT_SIMPLE("ServiceAreaPolygonNotSimple"),
    @XmlEnumValue("CoordinateFallsOutsideServiceAreaPolygon")
    COORDINATE_FALLS_OUTSIDE_SERVICE_AREA_POLYGON("CoordinateFallsOutsideServiceAreaPolygon"),
    @XmlEnumValue("CannotValidateServiceAreaPolygon")
    CANNOT_VALIDATE_SERVICE_AREA_POLYGON("CannotValidateServiceAreaPolygon"),
    @XmlEnumValue("OmnitracsOneManagedEntityRestricted")
    OMNITRACS_ONE_MANAGED_ENTITY_RESTRICTED("OmnitracsOneManagedEntityRestricted"),
    @XmlEnumValue("OmnitracsOneManagedPropertyRestricted")
    OMNITRACS_ONE_MANAGED_PROPERTY_RESTRICTED("OmnitracsOneManagedPropertyRestricted"),
    @XmlEnumValue("UnmappedComplianceError")
    UNMAPPED_COMPLIANCE_ERROR("UnmappedComplianceError"),
    @XmlEnumValue("InvalidDriverNameCompliance")
    INVALID_DRIVER_NAME_COMPLIANCE("InvalidDriverNameCompliance"),
    @XmlEnumValue("UnmappedActiveAlertError")
    UNMAPPED_ACTIVE_ALERT_ERROR("UnmappedActiveAlertError"),
    @XmlEnumValue("Ignored")
    IGNORED("Ignored"),
    @XmlEnumValue("RecordsCombinedForRegionVisibility")
    RECORDS_COMBINED_FOR_REGION_VISIBILITY("RecordsCombinedForRegionVisibility");
    private final String value;

    ImportEntityResultImportLogMessage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportEntityResultImportLogMessage fromValue(String v) {
        for (ImportEntityResultImportLogMessage c: ImportEntityResultImportLogMessage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
