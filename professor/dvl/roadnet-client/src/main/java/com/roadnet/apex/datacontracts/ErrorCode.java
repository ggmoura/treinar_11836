
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ErrorCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UnexpectedError"/&gt;
 *     &lt;enumeration value="ApplicationIdentificationFailed"/&gt;
 *     &lt;enumeration value="UserAuthenticationFailed"/&gt;
 *     &lt;enumeration value="UserAuthenticationFailedSuggestReset"/&gt;
 *     &lt;enumeration value="SessionAuthenticationFailed"/&gt;
 *     &lt;enumeration value="UserLocked"/&gt;
 *     &lt;enumeration value="UserDisabled"/&gt;
 *     &lt;enumeration value="InvalidQueryExpression"/&gt;
 *     &lt;enumeration value="InvalidSortExpression"/&gt;
 *     &lt;enumeration value="PasswordChangeRequired"/&gt;
 *     &lt;enumeration value="DataConstraintViolation"/&gt;
 *     &lt;enumeration value="ValidationFailure"/&gt;
 *     &lt;enumeration value="GrammarException"/&gt;
 *     &lt;enumeration value="StaleObjectState"/&gt;
 *     &lt;enumeration value="DuplicateData"/&gt;
 *     &lt;enumeration value="InvalidBusinessUnit"/&gt;
 *     &lt;enumeration value="InvalidRegion"/&gt;
 *     &lt;enumeration value="CannotPersistEmptyList"/&gt;
 *     &lt;enumeration value="SaveRequiresHomogenousList"/&gt;
 *     &lt;enumeration value="InvalidOrMissingPropertyOptions"/&gt;
 *     &lt;enumeration value="InvalidOrNullCriteria"/&gt;
 *     &lt;enumeration value="NoPermission"/&gt;
 *     &lt;enumeration value="InvalidParameter"/&gt;
 *     &lt;enumeration value="InvalidOperation"/&gt;
 *     &lt;enumeration value="RouteNotReady"/&gt;
 *     &lt;enumeration value="RouteAlreadyLoaded"/&gt;
 *     &lt;enumeration value="DeviceAlreadyLoaded"/&gt;
 *     &lt;enumeration value="MaxGeocodeCandidatesOutOfRange"/&gt;
 *     &lt;enumeration value="InvalidOrNullOptions"/&gt;
 *     &lt;enumeration value="MissingInclusionMode"/&gt;
 *     &lt;enumeration value="KeyNotFound"/&gt;
 *     &lt;enumeration value="NoResultsFound"/&gt;
 *     &lt;enumeration value="ActionAlreadyPerformed"/&gt;
 *     &lt;enumeration value="StopNotReady"/&gt;
 *     &lt;enumeration value="StopNotServiceable"/&gt;
 *     &lt;enumeration value="UnableToRedeliver"/&gt;
 *     &lt;enumeration value="UnableToCreateBreak"/&gt;
 *     &lt;enumeration value="RouteAlreadyArchived"/&gt;
 *     &lt;enumeration value="RouteLoadedToDevice"/&gt;
 *     &lt;enumeration value="RouteIncomplete"/&gt;
 *     &lt;enumeration value="RouteAlreadyComplete"/&gt;
 *     &lt;enumeration value="RoutePhaseOrStatusViolation"/&gt;
 *     &lt;enumeration value="InvalidTravelPath"/&gt;
 *     &lt;enumeration value="InvalidTravelPolygon"/&gt;
 *     &lt;enumeration value="NoDispatchLicense"/&gt;
 *     &lt;enumeration value="LicenseViolation"/&gt;
 *     &lt;enumeration value="WorkerInUse"/&gt;
 *     &lt;enumeration value="EquipmentInUse"/&gt;
 *     &lt;enumeration value="MapDataInvalidOrNotAccessible"/&gt;
 *     &lt;enumeration value="UnknownISOCountryAbbreviation"/&gt;
 *     &lt;enumeration value="LocalityDoesNotExist"/&gt;
 *     &lt;enumeration value="MapEntityInvalidOrDoesNotExist"/&gt;
 *     &lt;enumeration value="MapEntityDeleted"/&gt;
 *     &lt;enumeration value="CouldNotCombine"/&gt;
 *     &lt;enumeration value="SourceDispatchViolation"/&gt;
 *     &lt;enumeration value="DestinationDispatchViolation"/&gt;
 *     &lt;enumeration value="RouteConstraintViolation"/&gt;
 *     &lt;enumeration value="LockViolation"/&gt;
 *     &lt;enumeration value="SourceIsCancelled"/&gt;
 *     &lt;enumeration value="SourceNotModified"/&gt;
 *     &lt;enumeration value="PhaseOrStatusViolation"/&gt;
 *     &lt;enumeration value="ConcurrencyViolation"/&gt;
 *     &lt;enumeration value="OrderAssignedToRouteViolation"/&gt;
 *     &lt;enumeration value="InvalidUserType"/&gt;
 *     &lt;enumeration value="IsNotSupportAdminForCustomer"/&gt;
 *     &lt;enumeration value="VehicleLicenseComplianceViolation"/&gt;
 *     &lt;enumeration value="UnableToMoveStop"/&gt;
 *     &lt;enumeration value="NoMatchingPatternInSet"/&gt;
 *     &lt;enumeration value="MultipleMatchingPatternsInSet"/&gt;
 *     &lt;enumeration value="InvalidRoutingSession"/&gt;
 *     &lt;enumeration value="ApplicationCustomerAccessDenied"/&gt;
 *     &lt;enumeration value="UnableToAddServiceableStop"/&gt;
 *     &lt;enumeration value="RouteStarted"/&gt;
 *     &lt;enumeration value="InvalidStopArrivalTime"/&gt;
 *     &lt;enumeration value="InvalidStopDepartureTime"/&gt;
 *     &lt;enumeration value="InvalidStopServiceTime"/&gt;
 *     &lt;enumeration value="InvalidRouteCompleteTime"/&gt;
 *     &lt;enumeration value="InvalidRouteDepartureTime"/&gt;
 *     &lt;enumeration value="MobileDeviceNotActive"/&gt;
 *     &lt;enumeration value="RouteContainsNoStops"/&gt;
 *     &lt;enumeration value="DataWarehouseNotReady"/&gt;
 *     &lt;enumeration value="ConfidentialDataAccessDenied"/&gt;
 *     &lt;enumeration value="IncorrectMobileDevice"/&gt;
 *     &lt;enumeration value="RouteInModelingSession"/&gt;
 *     &lt;enumeration value="SessionModeViolation"/&gt;
 *     &lt;enumeration value="QuantityValidationViolation"/&gt;
 *     &lt;enumeration value="AddXrsEntityFailure"/&gt;
 *     &lt;enumeration value="UpdateXrsEntityFailure"/&gt;
 *     &lt;enumeration value="DeleteXrsEntityFailure"/&gt;
 *     &lt;enumeration value="SetXrsDriverPasswordFailure"/&gt;
 *     &lt;enumeration value="SetXrsUserPasswordFailure"/&gt;
 *     &lt;enumeration value="SendXrsDeviceInstallLinkFailure"/&gt;
 *     &lt;enumeration value="MobilePlatformNotSupportedInXrsIntegration"/&gt;
 *     &lt;enumeration value="InvalidXrsDevicePhoneNumber"/&gt;
 *     &lt;enumeration value="DefaultEquipmentNotFound"/&gt;
 *     &lt;enumeration value="InvalidEndpointRequest"/&gt;
 *     &lt;enumeration value="RequestCannotBeHandledAtThisTime"/&gt;
 *     &lt;enumeration value="LocationDeleted"/&gt;
 *     &lt;enumeration value="InvalidCustomerState"/&gt;
 *     &lt;enumeration value="PasswordViolatesPolicy"/&gt;
 *     &lt;enumeration value="XrsRelayNotFound"/&gt;
 *     &lt;enumeration value="CannotAlterEquipmentTypePowerUnitWithComplianceEnabled"/&gt;
 *     &lt;enumeration value="XrsDevicePhoneNumberInUse"/&gt;
 *     &lt;enumeration value="XrsRoleNotFound"/&gt;
 *     &lt;enumeration value="XrsOrganizationNotFound"/&gt;
 *     &lt;enumeration value="InvalidXrsDeviceCarrier"/&gt;
 *     &lt;enumeration value="CannotAssignNonUniqueXrsTrailerLicensePlate"/&gt;
 *     &lt;enumeration value="InvalidCustomerXrsCompanyInformation"/&gt;
 *     &lt;enumeration value="InvalidTimezoneXrsIntegration"/&gt;
 *     &lt;enumeration value="CannotAssignNonUniqueVINToEquipment"/&gt;
 *     &lt;enumeration value="CannotAssignInUseTelematicsDeviceToEquipment"/&gt;
 *     &lt;enumeration value="InvalidServiceableStopCoordinates"/&gt;
 *     &lt;enumeration value="LoginUsernameAlreadyExist"/&gt;
 *     &lt;enumeration value="NewPasswordMustBeDifferentThanOldPassword"/&gt;
 *     &lt;enumeration value="InvalidAddressStateXrsIntegration"/&gt;
 *     &lt;enumeration value="InvalidAddressForDefaultReportingLocationXrsIntegration"/&gt;
 *     &lt;enumeration value="RoutingSessionChangeNotAllowed"/&gt;
 *     &lt;enumeration value="ComplianceDriverIdAlreadyExists"/&gt;
 *     &lt;enumeration value="MobileDeviceInUse"/&gt;
 *     &lt;enumeration value="WorkerNotOffDuty"/&gt;
 *     &lt;enumeration value="InvalidRegionForTelematicsDevice"/&gt;
 *     &lt;enumeration value="SearchTimeout"/&gt;
 *     &lt;enumeration value="CdlNumberAlreadyExistsCompliance"/&gt;
 *     &lt;enumeration value="CannotAlterAutoCapturedVinCompliance"/&gt;
 *     &lt;enumeration value="CannotAlterEldVehicleCompliance"/&gt;
 *     &lt;enumeration value="CannotSetEldVehicleInAobrdModeCompliance"/&gt;
 *     &lt;enumeration value="InvalidCountryCompliance"/&gt;
 *     &lt;enumeration value="InvalidStateCompliance"/&gt;
 *     &lt;enumeration value="VehicleAlreadyExists"/&gt;
 *     &lt;enumeration value="TrailerAlreadyExists"/&gt;
 *     &lt;enumeration value="OrderAlreadyServiced"/&gt;
 *     &lt;enumeration value="InvalidCdlIssuingCountryCompliance"/&gt;
 *     &lt;enumeration value="InvalidCdlIssuingStateCompliance"/&gt;
 *     &lt;enumeration value="InvalidEnableYardMoveCompliance"/&gt;
 *     &lt;enumeration value="CriticalEventDataAccessDenied"/&gt;
 *     &lt;enumeration value="InvalidVehicleIdentificationNumber"/&gt;
 *     &lt;enumeration value="AddCustomerPortalEntityFailure"/&gt;
 *     &lt;enumeration value="UpdateCustomerPortalEntityFailure"/&gt;
 *     &lt;enumeration value="DeleteCustomerPortalEntityFailure"/&gt;
 *     &lt;enumeration value="CustomerPortalMobilePlatformNotSupported"/&gt;
 *     &lt;enumeration value="CustomerPortalAuthenticationFailed"/&gt;
 *     &lt;enumeration value="CustomerPortalAuthenticationURLMissing"/&gt;
 *     &lt;enumeration value="CustomerPortalUpsertRoadnetDeviceURLMissing"/&gt;
 *     &lt;enumeration value="QueryCustomerPortalWebServerFailed"/&gt;
 *     &lt;enumeration value="SaveDeviceEnumInvalid"/&gt;
 *     &lt;enumeration value="JSONResponseInvalid"/&gt;
 *     &lt;enumeration value="RegionHierarchyNotEnabled"/&gt;
 *     &lt;enumeration value="CannotAddChildToRegionWithRegionBasedEntities"/&gt;
 *     &lt;enumeration value="CannotAddRegionToItselfOrItsDescendant"/&gt;
 *     &lt;enumeration value="CannotDeleteParentRegion"/&gt;
 *     &lt;enumeration value="PasswordExpired"/&gt;
 *     &lt;enumeration value="RegionInheritableSettingsPropagationFailed"/&gt;
 *     &lt;enumeration value="CannotDeleteTopLevelComplianceRegion"/&gt;
 *     &lt;enumeration value="CannotAddMultipleTopLevelComplianceRegions"/&gt;
 *     &lt;enumeration value="CannotChangeTopLevelComplianceRegionIdentifier"/&gt;
 *     &lt;enumeration value="InvalidComplianceConfiguration"/&gt;
 *     &lt;enumeration value="CannotManageRegionVisibility"/&gt;
 *     &lt;enumeration value="CannotSaveEntityInParentRegion"/&gt;
 *     &lt;enumeration value="FailedToCreateTopLevelRegion"/&gt;
 *     &lt;enumeration value="MultipleBusinessUnitsOnHierarchicalComplianceCustomer"/&gt;
 *     &lt;enumeration value="NotAHierarchicalComplianceCustomer"/&gt;
 *     &lt;enumeration value="CannotUseCompanyIftaSettingsTopLevelRegion"/&gt;
 *     &lt;enumeration value="CannotUseMultipleBusinessUnitsWithCompliance"/&gt;
 *     &lt;enumeration value="InvalidBusinessUnitRegionCombination"/&gt;
 *     &lt;enumeration value="XrsOrganizationNameAlreadyExists"/&gt;
 *     &lt;enumeration value="OrganizationDisplayIdAlreadyExists"/&gt;
 *     &lt;enumeration value="InvalidDotNumber"/&gt;
 *     &lt;enumeration value="InvalidComplianceCarrierInformation"/&gt;
 *     &lt;enumeration value="UsernameAlreadyExists"/&gt;
 *     &lt;enumeration value="UnshiftableRouteAssignment"/&gt;
 *     &lt;enumeration value="InvalidCompressedDataSet"/&gt;
 *     &lt;enumeration value="OmnitracsOneManagedEntityRestricted"/&gt;
 *     &lt;enumeration value="OmnitracsOneManagedPropertyRestricted"/&gt;
 *     &lt;enumeration value="InvalidTelematicsDeviceIdentifier"/&gt;
 *     &lt;enumeration value="RecurringOrderAssignedToTerritoryViolation"/&gt;
 *     &lt;enumeration value="RouteAlreadyInOptimalForm"/&gt;
 *     &lt;enumeration value="RouteOptimizationSystemRejected"/&gt;
 *     &lt;enumeration value="EquipmentTypeNotVisible"/&gt;
 *     &lt;enumeration value="NotSupportedInRegion"/&gt;
 *     &lt;enumeration value="InvalidXrsTelematicsDeviceSerialNumber"/&gt;
 *     &lt;enumeration value="XrsTelematicsDeviceCustomerAssignmentFailure"/&gt;
 *     &lt;enumeration value="XrsTelematicsDeviceCustomerUnassignmentFailure"/&gt;
 *     &lt;enumeration value="UnmappedComplianceError"/&gt;
 *     &lt;enumeration value="InvalidDriverNameCompliance"/&gt;
 *     &lt;enumeration value="MoveStopOnUnplannedOriginRouteError"/&gt;
 *     &lt;enumeration value="InvalidEmailForActiveAlertRecipient"/&gt;
 *     &lt;enumeration value="InvalidPhoneNumberForActiveAlertRecipient"/&gt;
 *     &lt;enumeration value="LicenseViolationLimitExceeded"/&gt;
 *     &lt;enumeration value="CurrentRouteNotVisibleToDevice"/&gt;
 *     &lt;enumeration value="ResourceExceptionRuleIsReadOnly"/&gt;
 *     &lt;enumeration value="UserAlreadyHasAnotherPlanningSessionLocked"/&gt;
 *     &lt;enumeration value="PlanningSessionsLocked"/&gt;
 *     &lt;enumeration value="InvalidHosRulesValidation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorCode")
@XmlEnum
public enum ErrorCode {

    @XmlEnumValue("UnexpectedError")
    UNEXPECTED_ERROR("UnexpectedError"),
    @XmlEnumValue("ApplicationIdentificationFailed")
    APPLICATION_IDENTIFICATION_FAILED("ApplicationIdentificationFailed"),
    @XmlEnumValue("UserAuthenticationFailed")
    USER_AUTHENTICATION_FAILED("UserAuthenticationFailed"),
    @XmlEnumValue("UserAuthenticationFailedSuggestReset")
    USER_AUTHENTICATION_FAILED_SUGGEST_RESET("UserAuthenticationFailedSuggestReset"),
    @XmlEnumValue("SessionAuthenticationFailed")
    SESSION_AUTHENTICATION_FAILED("SessionAuthenticationFailed"),
    @XmlEnumValue("UserLocked")
    USER_LOCKED("UserLocked"),
    @XmlEnumValue("UserDisabled")
    USER_DISABLED("UserDisabled"),
    @XmlEnumValue("InvalidQueryExpression")
    INVALID_QUERY_EXPRESSION("InvalidQueryExpression"),
    @XmlEnumValue("InvalidSortExpression")
    INVALID_SORT_EXPRESSION("InvalidSortExpression"),
    @XmlEnumValue("PasswordChangeRequired")
    PASSWORD_CHANGE_REQUIRED("PasswordChangeRequired"),
    @XmlEnumValue("DataConstraintViolation")
    DATA_CONSTRAINT_VIOLATION("DataConstraintViolation"),
    @XmlEnumValue("ValidationFailure")
    VALIDATION_FAILURE("ValidationFailure"),
    @XmlEnumValue("GrammarException")
    GRAMMAR_EXCEPTION("GrammarException"),
    @XmlEnumValue("StaleObjectState")
    STALE_OBJECT_STATE("StaleObjectState"),
    @XmlEnumValue("DuplicateData")
    DUPLICATE_DATA("DuplicateData"),
    @XmlEnumValue("InvalidBusinessUnit")
    INVALID_BUSINESS_UNIT("InvalidBusinessUnit"),
    @XmlEnumValue("InvalidRegion")
    INVALID_REGION("InvalidRegion"),
    @XmlEnumValue("CannotPersistEmptyList")
    CANNOT_PERSIST_EMPTY_LIST("CannotPersistEmptyList"),
    @XmlEnumValue("SaveRequiresHomogenousList")
    SAVE_REQUIRES_HOMOGENOUS_LIST("SaveRequiresHomogenousList"),
    @XmlEnumValue("InvalidOrMissingPropertyOptions")
    INVALID_OR_MISSING_PROPERTY_OPTIONS("InvalidOrMissingPropertyOptions"),
    @XmlEnumValue("InvalidOrNullCriteria")
    INVALID_OR_NULL_CRITERIA("InvalidOrNullCriteria"),
    @XmlEnumValue("NoPermission")
    NO_PERMISSION("NoPermission"),
    @XmlEnumValue("InvalidParameter")
    INVALID_PARAMETER("InvalidParameter"),
    @XmlEnumValue("InvalidOperation")
    INVALID_OPERATION("InvalidOperation"),
    @XmlEnumValue("RouteNotReady")
    ROUTE_NOT_READY("RouteNotReady"),
    @XmlEnumValue("RouteAlreadyLoaded")
    ROUTE_ALREADY_LOADED("RouteAlreadyLoaded"),
    @XmlEnumValue("DeviceAlreadyLoaded")
    DEVICE_ALREADY_LOADED("DeviceAlreadyLoaded"),
    @XmlEnumValue("MaxGeocodeCandidatesOutOfRange")
    MAX_GEOCODE_CANDIDATES_OUT_OF_RANGE("MaxGeocodeCandidatesOutOfRange"),
    @XmlEnumValue("InvalidOrNullOptions")
    INVALID_OR_NULL_OPTIONS("InvalidOrNullOptions"),
    @XmlEnumValue("MissingInclusionMode")
    MISSING_INCLUSION_MODE("MissingInclusionMode"),
    @XmlEnumValue("KeyNotFound")
    KEY_NOT_FOUND("KeyNotFound"),
    @XmlEnumValue("NoResultsFound")
    NO_RESULTS_FOUND("NoResultsFound"),
    @XmlEnumValue("ActionAlreadyPerformed")
    ACTION_ALREADY_PERFORMED("ActionAlreadyPerformed"),
    @XmlEnumValue("StopNotReady")
    STOP_NOT_READY("StopNotReady"),
    @XmlEnumValue("StopNotServiceable")
    STOP_NOT_SERVICEABLE("StopNotServiceable"),
    @XmlEnumValue("UnableToRedeliver")
    UNABLE_TO_REDELIVER("UnableToRedeliver"),
    @XmlEnumValue("UnableToCreateBreak")
    UNABLE_TO_CREATE_BREAK("UnableToCreateBreak"),
    @XmlEnumValue("RouteAlreadyArchived")
    ROUTE_ALREADY_ARCHIVED("RouteAlreadyArchived"),
    @XmlEnumValue("RouteLoadedToDevice")
    ROUTE_LOADED_TO_DEVICE("RouteLoadedToDevice"),
    @XmlEnumValue("RouteIncomplete")
    ROUTE_INCOMPLETE("RouteIncomplete"),
    @XmlEnumValue("RouteAlreadyComplete")
    ROUTE_ALREADY_COMPLETE("RouteAlreadyComplete"),
    @XmlEnumValue("RoutePhaseOrStatusViolation")
    ROUTE_PHASE_OR_STATUS_VIOLATION("RoutePhaseOrStatusViolation"),
    @XmlEnumValue("InvalidTravelPath")
    INVALID_TRAVEL_PATH("InvalidTravelPath"),
    @XmlEnumValue("InvalidTravelPolygon")
    INVALID_TRAVEL_POLYGON("InvalidTravelPolygon"),
    @XmlEnumValue("NoDispatchLicense")
    NO_DISPATCH_LICENSE("NoDispatchLicense"),
    @XmlEnumValue("LicenseViolation")
    LICENSE_VIOLATION("LicenseViolation"),
    @XmlEnumValue("WorkerInUse")
    WORKER_IN_USE("WorkerInUse"),
    @XmlEnumValue("EquipmentInUse")
    EQUIPMENT_IN_USE("EquipmentInUse"),
    @XmlEnumValue("MapDataInvalidOrNotAccessible")
    MAP_DATA_INVALID_OR_NOT_ACCESSIBLE("MapDataInvalidOrNotAccessible"),
    @XmlEnumValue("UnknownISOCountryAbbreviation")
    UNKNOWN_ISO_COUNTRY_ABBREVIATION("UnknownISOCountryAbbreviation"),
    @XmlEnumValue("LocalityDoesNotExist")
    LOCALITY_DOES_NOT_EXIST("LocalityDoesNotExist"),
    @XmlEnumValue("MapEntityInvalidOrDoesNotExist")
    MAP_ENTITY_INVALID_OR_DOES_NOT_EXIST("MapEntityInvalidOrDoesNotExist"),
    @XmlEnumValue("MapEntityDeleted")
    MAP_ENTITY_DELETED("MapEntityDeleted"),
    @XmlEnumValue("CouldNotCombine")
    COULD_NOT_COMBINE("CouldNotCombine"),
    @XmlEnumValue("SourceDispatchViolation")
    SOURCE_DISPATCH_VIOLATION("SourceDispatchViolation"),
    @XmlEnumValue("DestinationDispatchViolation")
    DESTINATION_DISPATCH_VIOLATION("DestinationDispatchViolation"),
    @XmlEnumValue("RouteConstraintViolation")
    ROUTE_CONSTRAINT_VIOLATION("RouteConstraintViolation"),
    @XmlEnumValue("LockViolation")
    LOCK_VIOLATION("LockViolation"),
    @XmlEnumValue("SourceIsCancelled")
    SOURCE_IS_CANCELLED("SourceIsCancelled"),
    @XmlEnumValue("SourceNotModified")
    SOURCE_NOT_MODIFIED("SourceNotModified"),
    @XmlEnumValue("PhaseOrStatusViolation")
    PHASE_OR_STATUS_VIOLATION("PhaseOrStatusViolation"),
    @XmlEnumValue("ConcurrencyViolation")
    CONCURRENCY_VIOLATION("ConcurrencyViolation"),
    @XmlEnumValue("OrderAssignedToRouteViolation")
    ORDER_ASSIGNED_TO_ROUTE_VIOLATION("OrderAssignedToRouteViolation"),
    @XmlEnumValue("InvalidUserType")
    INVALID_USER_TYPE("InvalidUserType"),
    @XmlEnumValue("IsNotSupportAdminForCustomer")
    IS_NOT_SUPPORT_ADMIN_FOR_CUSTOMER("IsNotSupportAdminForCustomer"),
    @XmlEnumValue("VehicleLicenseComplianceViolation")
    VEHICLE_LICENSE_COMPLIANCE_VIOLATION("VehicleLicenseComplianceViolation"),
    @XmlEnumValue("UnableToMoveStop")
    UNABLE_TO_MOVE_STOP("UnableToMoveStop"),
    @XmlEnumValue("NoMatchingPatternInSet")
    NO_MATCHING_PATTERN_IN_SET("NoMatchingPatternInSet"),
    @XmlEnumValue("MultipleMatchingPatternsInSet")
    MULTIPLE_MATCHING_PATTERNS_IN_SET("MultipleMatchingPatternsInSet"),
    @XmlEnumValue("InvalidRoutingSession")
    INVALID_ROUTING_SESSION("InvalidRoutingSession"),
    @XmlEnumValue("ApplicationCustomerAccessDenied")
    APPLICATION_CUSTOMER_ACCESS_DENIED("ApplicationCustomerAccessDenied"),
    @XmlEnumValue("UnableToAddServiceableStop")
    UNABLE_TO_ADD_SERVICEABLE_STOP("UnableToAddServiceableStop"),
    @XmlEnumValue("RouteStarted")
    ROUTE_STARTED("RouteStarted"),
    @XmlEnumValue("InvalidStopArrivalTime")
    INVALID_STOP_ARRIVAL_TIME("InvalidStopArrivalTime"),
    @XmlEnumValue("InvalidStopDepartureTime")
    INVALID_STOP_DEPARTURE_TIME("InvalidStopDepartureTime"),
    @XmlEnumValue("InvalidStopServiceTime")
    INVALID_STOP_SERVICE_TIME("InvalidStopServiceTime"),
    @XmlEnumValue("InvalidRouteCompleteTime")
    INVALID_ROUTE_COMPLETE_TIME("InvalidRouteCompleteTime"),
    @XmlEnumValue("InvalidRouteDepartureTime")
    INVALID_ROUTE_DEPARTURE_TIME("InvalidRouteDepartureTime"),
    @XmlEnumValue("MobileDeviceNotActive")
    MOBILE_DEVICE_NOT_ACTIVE("MobileDeviceNotActive"),
    @XmlEnumValue("RouteContainsNoStops")
    ROUTE_CONTAINS_NO_STOPS("RouteContainsNoStops"),
    @XmlEnumValue("DataWarehouseNotReady")
    DATA_WAREHOUSE_NOT_READY("DataWarehouseNotReady"),
    @XmlEnumValue("ConfidentialDataAccessDenied")
    CONFIDENTIAL_DATA_ACCESS_DENIED("ConfidentialDataAccessDenied"),
    @XmlEnumValue("IncorrectMobileDevice")
    INCORRECT_MOBILE_DEVICE("IncorrectMobileDevice"),
    @XmlEnumValue("RouteInModelingSession")
    ROUTE_IN_MODELING_SESSION("RouteInModelingSession"),
    @XmlEnumValue("SessionModeViolation")
    SESSION_MODE_VIOLATION("SessionModeViolation"),
    @XmlEnumValue("QuantityValidationViolation")
    QUANTITY_VALIDATION_VIOLATION("QuantityValidationViolation"),
    @XmlEnumValue("AddXrsEntityFailure")
    ADD_XRS_ENTITY_FAILURE("AddXrsEntityFailure"),
    @XmlEnumValue("UpdateXrsEntityFailure")
    UPDATE_XRS_ENTITY_FAILURE("UpdateXrsEntityFailure"),
    @XmlEnumValue("DeleteXrsEntityFailure")
    DELETE_XRS_ENTITY_FAILURE("DeleteXrsEntityFailure"),
    @XmlEnumValue("SetXrsDriverPasswordFailure")
    SET_XRS_DRIVER_PASSWORD_FAILURE("SetXrsDriverPasswordFailure"),
    @XmlEnumValue("SetXrsUserPasswordFailure")
    SET_XRS_USER_PASSWORD_FAILURE("SetXrsUserPasswordFailure"),
    @XmlEnumValue("SendXrsDeviceInstallLinkFailure")
    SEND_XRS_DEVICE_INSTALL_LINK_FAILURE("SendXrsDeviceInstallLinkFailure"),
    @XmlEnumValue("MobilePlatformNotSupportedInXrsIntegration")
    MOBILE_PLATFORM_NOT_SUPPORTED_IN_XRS_INTEGRATION("MobilePlatformNotSupportedInXrsIntegration"),
    @XmlEnumValue("InvalidXrsDevicePhoneNumber")
    INVALID_XRS_DEVICE_PHONE_NUMBER("InvalidXrsDevicePhoneNumber"),
    @XmlEnumValue("DefaultEquipmentNotFound")
    DEFAULT_EQUIPMENT_NOT_FOUND("DefaultEquipmentNotFound"),
    @XmlEnumValue("InvalidEndpointRequest")
    INVALID_ENDPOINT_REQUEST("InvalidEndpointRequest"),
    @XmlEnumValue("RequestCannotBeHandledAtThisTime")
    REQUEST_CANNOT_BE_HANDLED_AT_THIS_TIME("RequestCannotBeHandledAtThisTime"),
    @XmlEnumValue("LocationDeleted")
    LOCATION_DELETED("LocationDeleted"),
    @XmlEnumValue("InvalidCustomerState")
    INVALID_CUSTOMER_STATE("InvalidCustomerState"),
    @XmlEnumValue("PasswordViolatesPolicy")
    PASSWORD_VIOLATES_POLICY("PasswordViolatesPolicy"),
    @XmlEnumValue("XrsRelayNotFound")
    XRS_RELAY_NOT_FOUND("XrsRelayNotFound"),
    @XmlEnumValue("CannotAlterEquipmentTypePowerUnitWithComplianceEnabled")
    CANNOT_ALTER_EQUIPMENT_TYPE_POWER_UNIT_WITH_COMPLIANCE_ENABLED("CannotAlterEquipmentTypePowerUnitWithComplianceEnabled"),
    @XmlEnumValue("XrsDevicePhoneNumberInUse")
    XRS_DEVICE_PHONE_NUMBER_IN_USE("XrsDevicePhoneNumberInUse"),
    @XmlEnumValue("XrsRoleNotFound")
    XRS_ROLE_NOT_FOUND("XrsRoleNotFound"),
    @XmlEnumValue("XrsOrganizationNotFound")
    XRS_ORGANIZATION_NOT_FOUND("XrsOrganizationNotFound"),
    @XmlEnumValue("InvalidXrsDeviceCarrier")
    INVALID_XRS_DEVICE_CARRIER("InvalidXrsDeviceCarrier"),
    @XmlEnumValue("CannotAssignNonUniqueXrsTrailerLicensePlate")
    CANNOT_ASSIGN_NON_UNIQUE_XRS_TRAILER_LICENSE_PLATE("CannotAssignNonUniqueXrsTrailerLicensePlate"),
    @XmlEnumValue("InvalidCustomerXrsCompanyInformation")
    INVALID_CUSTOMER_XRS_COMPANY_INFORMATION("InvalidCustomerXrsCompanyInformation"),
    @XmlEnumValue("InvalidTimezoneXrsIntegration")
    INVALID_TIMEZONE_XRS_INTEGRATION("InvalidTimezoneXrsIntegration"),
    @XmlEnumValue("CannotAssignNonUniqueVINToEquipment")
    CANNOT_ASSIGN_NON_UNIQUE_VIN_TO_EQUIPMENT("CannotAssignNonUniqueVINToEquipment"),
    @XmlEnumValue("CannotAssignInUseTelematicsDeviceToEquipment")
    CANNOT_ASSIGN_IN_USE_TELEMATICS_DEVICE_TO_EQUIPMENT("CannotAssignInUseTelematicsDeviceToEquipment"),
    @XmlEnumValue("InvalidServiceableStopCoordinates")
    INVALID_SERVICEABLE_STOP_COORDINATES("InvalidServiceableStopCoordinates"),
    @XmlEnumValue("LoginUsernameAlreadyExist")
    LOGIN_USERNAME_ALREADY_EXIST("LoginUsernameAlreadyExist"),
    @XmlEnumValue("NewPasswordMustBeDifferentThanOldPassword")
    NEW_PASSWORD_MUST_BE_DIFFERENT_THAN_OLD_PASSWORD("NewPasswordMustBeDifferentThanOldPassword"),
    @XmlEnumValue("InvalidAddressStateXrsIntegration")
    INVALID_ADDRESS_STATE_XRS_INTEGRATION("InvalidAddressStateXrsIntegration"),
    @XmlEnumValue("InvalidAddressForDefaultReportingLocationXrsIntegration")
    INVALID_ADDRESS_FOR_DEFAULT_REPORTING_LOCATION_XRS_INTEGRATION("InvalidAddressForDefaultReportingLocationXrsIntegration"),
    @XmlEnumValue("RoutingSessionChangeNotAllowed")
    ROUTING_SESSION_CHANGE_NOT_ALLOWED("RoutingSessionChangeNotAllowed"),
    @XmlEnumValue("ComplianceDriverIdAlreadyExists")
    COMPLIANCE_DRIVER_ID_ALREADY_EXISTS("ComplianceDriverIdAlreadyExists"),
    @XmlEnumValue("MobileDeviceInUse")
    MOBILE_DEVICE_IN_USE("MobileDeviceInUse"),
    @XmlEnumValue("WorkerNotOffDuty")
    WORKER_NOT_OFF_DUTY("WorkerNotOffDuty"),
    @XmlEnumValue("InvalidRegionForTelematicsDevice")
    INVALID_REGION_FOR_TELEMATICS_DEVICE("InvalidRegionForTelematicsDevice"),
    @XmlEnumValue("SearchTimeout")
    SEARCH_TIMEOUT("SearchTimeout"),
    @XmlEnumValue("CdlNumberAlreadyExistsCompliance")
    CDL_NUMBER_ALREADY_EXISTS_COMPLIANCE("CdlNumberAlreadyExistsCompliance"),
    @XmlEnumValue("CannotAlterAutoCapturedVinCompliance")
    CANNOT_ALTER_AUTO_CAPTURED_VIN_COMPLIANCE("CannotAlterAutoCapturedVinCompliance"),
    @XmlEnumValue("CannotAlterEldVehicleCompliance")
    CANNOT_ALTER_ELD_VEHICLE_COMPLIANCE("CannotAlterEldVehicleCompliance"),
    @XmlEnumValue("CannotSetEldVehicleInAobrdModeCompliance")
    CANNOT_SET_ELD_VEHICLE_IN_AOBRD_MODE_COMPLIANCE("CannotSetEldVehicleInAobrdModeCompliance"),
    @XmlEnumValue("InvalidCountryCompliance")
    INVALID_COUNTRY_COMPLIANCE("InvalidCountryCompliance"),
    @XmlEnumValue("InvalidStateCompliance")
    INVALID_STATE_COMPLIANCE("InvalidStateCompliance"),
    @XmlEnumValue("VehicleAlreadyExists")
    VEHICLE_ALREADY_EXISTS("VehicleAlreadyExists"),
    @XmlEnumValue("TrailerAlreadyExists")
    TRAILER_ALREADY_EXISTS("TrailerAlreadyExists"),
    @XmlEnumValue("OrderAlreadyServiced")
    ORDER_ALREADY_SERVICED("OrderAlreadyServiced"),
    @XmlEnumValue("InvalidCdlIssuingCountryCompliance")
    INVALID_CDL_ISSUING_COUNTRY_COMPLIANCE("InvalidCdlIssuingCountryCompliance"),
    @XmlEnumValue("InvalidCdlIssuingStateCompliance")
    INVALID_CDL_ISSUING_STATE_COMPLIANCE("InvalidCdlIssuingStateCompliance"),
    @XmlEnumValue("InvalidEnableYardMoveCompliance")
    INVALID_ENABLE_YARD_MOVE_COMPLIANCE("InvalidEnableYardMoveCompliance"),
    @XmlEnumValue("CriticalEventDataAccessDenied")
    CRITICAL_EVENT_DATA_ACCESS_DENIED("CriticalEventDataAccessDenied"),
    @XmlEnumValue("InvalidVehicleIdentificationNumber")
    INVALID_VEHICLE_IDENTIFICATION_NUMBER("InvalidVehicleIdentificationNumber"),
    @XmlEnumValue("AddCustomerPortalEntityFailure")
    ADD_CUSTOMER_PORTAL_ENTITY_FAILURE("AddCustomerPortalEntityFailure"),
    @XmlEnumValue("UpdateCustomerPortalEntityFailure")
    UPDATE_CUSTOMER_PORTAL_ENTITY_FAILURE("UpdateCustomerPortalEntityFailure"),
    @XmlEnumValue("DeleteCustomerPortalEntityFailure")
    DELETE_CUSTOMER_PORTAL_ENTITY_FAILURE("DeleteCustomerPortalEntityFailure"),
    @XmlEnumValue("CustomerPortalMobilePlatformNotSupported")
    CUSTOMER_PORTAL_MOBILE_PLATFORM_NOT_SUPPORTED("CustomerPortalMobilePlatformNotSupported"),
    @XmlEnumValue("CustomerPortalAuthenticationFailed")
    CUSTOMER_PORTAL_AUTHENTICATION_FAILED("CustomerPortalAuthenticationFailed"),
    @XmlEnumValue("CustomerPortalAuthenticationURLMissing")
    CUSTOMER_PORTAL_AUTHENTICATION_URL_MISSING("CustomerPortalAuthenticationURLMissing"),
    @XmlEnumValue("CustomerPortalUpsertRoadnetDeviceURLMissing")
    CUSTOMER_PORTAL_UPSERT_ROADNET_DEVICE_URL_MISSING("CustomerPortalUpsertRoadnetDeviceURLMissing"),
    @XmlEnumValue("QueryCustomerPortalWebServerFailed")
    QUERY_CUSTOMER_PORTAL_WEB_SERVER_FAILED("QueryCustomerPortalWebServerFailed"),
    @XmlEnumValue("SaveDeviceEnumInvalid")
    SAVE_DEVICE_ENUM_INVALID("SaveDeviceEnumInvalid"),
    @XmlEnumValue("JSONResponseInvalid")
    JSON_RESPONSE_INVALID("JSONResponseInvalid"),
    @XmlEnumValue("RegionHierarchyNotEnabled")
    REGION_HIERARCHY_NOT_ENABLED("RegionHierarchyNotEnabled"),
    @XmlEnumValue("CannotAddChildToRegionWithRegionBasedEntities")
    CANNOT_ADD_CHILD_TO_REGION_WITH_REGION_BASED_ENTITIES("CannotAddChildToRegionWithRegionBasedEntities"),
    @XmlEnumValue("CannotAddRegionToItselfOrItsDescendant")
    CANNOT_ADD_REGION_TO_ITSELF_OR_ITS_DESCENDANT("CannotAddRegionToItselfOrItsDescendant"),
    @XmlEnumValue("CannotDeleteParentRegion")
    CANNOT_DELETE_PARENT_REGION("CannotDeleteParentRegion"),
    @XmlEnumValue("PasswordExpired")
    PASSWORD_EXPIRED("PasswordExpired"),
    @XmlEnumValue("RegionInheritableSettingsPropagationFailed")
    REGION_INHERITABLE_SETTINGS_PROPAGATION_FAILED("RegionInheritableSettingsPropagationFailed"),
    @XmlEnumValue("CannotDeleteTopLevelComplianceRegion")
    CANNOT_DELETE_TOP_LEVEL_COMPLIANCE_REGION("CannotDeleteTopLevelComplianceRegion"),
    @XmlEnumValue("CannotAddMultipleTopLevelComplianceRegions")
    CANNOT_ADD_MULTIPLE_TOP_LEVEL_COMPLIANCE_REGIONS("CannotAddMultipleTopLevelComplianceRegions"),
    @XmlEnumValue("CannotChangeTopLevelComplianceRegionIdentifier")
    CANNOT_CHANGE_TOP_LEVEL_COMPLIANCE_REGION_IDENTIFIER("CannotChangeTopLevelComplianceRegionIdentifier"),
    @XmlEnumValue("InvalidComplianceConfiguration")
    INVALID_COMPLIANCE_CONFIGURATION("InvalidComplianceConfiguration"),
    @XmlEnumValue("CannotManageRegionVisibility")
    CANNOT_MANAGE_REGION_VISIBILITY("CannotManageRegionVisibility"),
    @XmlEnumValue("CannotSaveEntityInParentRegion")
    CANNOT_SAVE_ENTITY_IN_PARENT_REGION("CannotSaveEntityInParentRegion"),
    @XmlEnumValue("FailedToCreateTopLevelRegion")
    FAILED_TO_CREATE_TOP_LEVEL_REGION("FailedToCreateTopLevelRegion"),
    @XmlEnumValue("MultipleBusinessUnitsOnHierarchicalComplianceCustomer")
    MULTIPLE_BUSINESS_UNITS_ON_HIERARCHICAL_COMPLIANCE_CUSTOMER("MultipleBusinessUnitsOnHierarchicalComplianceCustomer"),
    @XmlEnumValue("NotAHierarchicalComplianceCustomer")
    NOT_A_HIERARCHICAL_COMPLIANCE_CUSTOMER("NotAHierarchicalComplianceCustomer"),
    @XmlEnumValue("CannotUseCompanyIftaSettingsTopLevelRegion")
    CANNOT_USE_COMPANY_IFTA_SETTINGS_TOP_LEVEL_REGION("CannotUseCompanyIftaSettingsTopLevelRegion"),
    @XmlEnumValue("CannotUseMultipleBusinessUnitsWithCompliance")
    CANNOT_USE_MULTIPLE_BUSINESS_UNITS_WITH_COMPLIANCE("CannotUseMultipleBusinessUnitsWithCompliance"),
    @XmlEnumValue("InvalidBusinessUnitRegionCombination")
    INVALID_BUSINESS_UNIT_REGION_COMBINATION("InvalidBusinessUnitRegionCombination"),
    @XmlEnumValue("XrsOrganizationNameAlreadyExists")
    XRS_ORGANIZATION_NAME_ALREADY_EXISTS("XrsOrganizationNameAlreadyExists"),
    @XmlEnumValue("OrganizationDisplayIdAlreadyExists")
    ORGANIZATION_DISPLAY_ID_ALREADY_EXISTS("OrganizationDisplayIdAlreadyExists"),
    @XmlEnumValue("InvalidDotNumber")
    INVALID_DOT_NUMBER("InvalidDotNumber"),
    @XmlEnumValue("InvalidComplianceCarrierInformation")
    INVALID_COMPLIANCE_CARRIER_INFORMATION("InvalidComplianceCarrierInformation"),
    @XmlEnumValue("UsernameAlreadyExists")
    USERNAME_ALREADY_EXISTS("UsernameAlreadyExists"),
    @XmlEnumValue("UnshiftableRouteAssignment")
    UNSHIFTABLE_ROUTE_ASSIGNMENT("UnshiftableRouteAssignment"),
    @XmlEnumValue("InvalidCompressedDataSet")
    INVALID_COMPRESSED_DATA_SET("InvalidCompressedDataSet"),
    @XmlEnumValue("OmnitracsOneManagedEntityRestricted")
    OMNITRACS_ONE_MANAGED_ENTITY_RESTRICTED("OmnitracsOneManagedEntityRestricted"),
    @XmlEnumValue("OmnitracsOneManagedPropertyRestricted")
    OMNITRACS_ONE_MANAGED_PROPERTY_RESTRICTED("OmnitracsOneManagedPropertyRestricted"),
    @XmlEnumValue("InvalidTelematicsDeviceIdentifier")
    INVALID_TELEMATICS_DEVICE_IDENTIFIER("InvalidTelematicsDeviceIdentifier"),
    @XmlEnumValue("RecurringOrderAssignedToTerritoryViolation")
    RECURRING_ORDER_ASSIGNED_TO_TERRITORY_VIOLATION("RecurringOrderAssignedToTerritoryViolation"),
    @XmlEnumValue("RouteAlreadyInOptimalForm")
    ROUTE_ALREADY_IN_OPTIMAL_FORM("RouteAlreadyInOptimalForm"),
    @XmlEnumValue("RouteOptimizationSystemRejected")
    ROUTE_OPTIMIZATION_SYSTEM_REJECTED("RouteOptimizationSystemRejected"),
    @XmlEnumValue("EquipmentTypeNotVisible")
    EQUIPMENT_TYPE_NOT_VISIBLE("EquipmentTypeNotVisible"),
    @XmlEnumValue("NotSupportedInRegion")
    NOT_SUPPORTED_IN_REGION("NotSupportedInRegion"),
    @XmlEnumValue("InvalidXrsTelematicsDeviceSerialNumber")
    INVALID_XRS_TELEMATICS_DEVICE_SERIAL_NUMBER("InvalidXrsTelematicsDeviceSerialNumber"),
    @XmlEnumValue("XrsTelematicsDeviceCustomerAssignmentFailure")
    XRS_TELEMATICS_DEVICE_CUSTOMER_ASSIGNMENT_FAILURE("XrsTelematicsDeviceCustomerAssignmentFailure"),
    @XmlEnumValue("XrsTelematicsDeviceCustomerUnassignmentFailure")
    XRS_TELEMATICS_DEVICE_CUSTOMER_UNASSIGNMENT_FAILURE("XrsTelematicsDeviceCustomerUnassignmentFailure"),
    @XmlEnumValue("UnmappedComplianceError")
    UNMAPPED_COMPLIANCE_ERROR("UnmappedComplianceError"),
    @XmlEnumValue("InvalidDriverNameCompliance")
    INVALID_DRIVER_NAME_COMPLIANCE("InvalidDriverNameCompliance"),
    @XmlEnumValue("MoveStopOnUnplannedOriginRouteError")
    MOVE_STOP_ON_UNPLANNED_ORIGIN_ROUTE_ERROR("MoveStopOnUnplannedOriginRouteError"),
    @XmlEnumValue("InvalidEmailForActiveAlertRecipient")
    INVALID_EMAIL_FOR_ACTIVE_ALERT_RECIPIENT("InvalidEmailForActiveAlertRecipient"),
    @XmlEnumValue("InvalidPhoneNumberForActiveAlertRecipient")
    INVALID_PHONE_NUMBER_FOR_ACTIVE_ALERT_RECIPIENT("InvalidPhoneNumberForActiveAlertRecipient"),
    @XmlEnumValue("LicenseViolationLimitExceeded")
    LICENSE_VIOLATION_LIMIT_EXCEEDED("LicenseViolationLimitExceeded"),
    @XmlEnumValue("CurrentRouteNotVisibleToDevice")
    CURRENT_ROUTE_NOT_VISIBLE_TO_DEVICE("CurrentRouteNotVisibleToDevice"),
    @XmlEnumValue("ResourceExceptionRuleIsReadOnly")
    RESOURCE_EXCEPTION_RULE_IS_READ_ONLY("ResourceExceptionRuleIsReadOnly"),
    @XmlEnumValue("UserAlreadyHasAnotherPlanningSessionLocked")
    USER_ALREADY_HAS_ANOTHER_PLANNING_SESSION_LOCKED("UserAlreadyHasAnotherPlanningSessionLocked"),
    @XmlEnumValue("PlanningSessionsLocked")
    PLANNING_SESSIONS_LOCKED("PlanningSessionsLocked"),
    @XmlEnumValue("InvalidHosRulesValidation")
    INVALID_HOS_RULES_VALIDATION("InvalidHosRulesValidation");
    private final String value;

    ErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCode fromValue(String v) {
        for (ErrorCode c: ErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
