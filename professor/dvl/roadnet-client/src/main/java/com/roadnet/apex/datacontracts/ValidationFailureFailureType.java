
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ValidationFailure.FailureType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationFailure.FailureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="NotNull"/&gt;
 *     &lt;enumeration value="NotNullNotEmpty"/&gt;
 *     &lt;enumeration value="Range"/&gt;
 *     &lt;enumeration value="Size"/&gt;
 *     &lt;enumeration value="Length"/&gt;
 *     &lt;enumeration value="NotEmpty"/&gt;
 *     &lt;enumeration value="Future"/&gt;
 *     &lt;enumeration value="Past"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="Min"/&gt;
 *     &lt;enumeration value="Max"/&gt;
 *     &lt;enumeration value="GreaterThan"/&gt;
 *     &lt;enumeration value="Identifier"/&gt;
 *     &lt;enumeration value="Within"/&gt;
 *     &lt;enumeration value="Numeric"/&gt;
 *     &lt;enumeration value="IPAddress"/&gt;
 *     &lt;enumeration value="Digits"/&gt;
 *     &lt;enumeration value="CreditCardNumber"/&gt;
 *     &lt;enumeration value="Pattern"/&gt;
 *     &lt;enumeration value="InvalidTimeWindow"/&gt;
 *     &lt;enumeration value="InvalidStopArrivalTime"/&gt;
 *     &lt;enumeration value="InvalidStopDepartureTime"/&gt;
 *     &lt;enumeration value="InvalidStopRunningQuantityAfter"/&gt;
 *     &lt;enumeration value="InvalidStopTotalDeliveryQuantities"/&gt;
 *     &lt;enumeration value="InvalidStopTotalPickupQuantities"/&gt;
 *     &lt;enumeration value="ContainsOverlappingItems"/&gt;
 *     &lt;enumeration value="ServiceWindowNotWithinOpenCloseTime"/&gt;
 *     &lt;enumeration value="TooManyTimeWindowsForOrderClass"/&gt;
 *     &lt;enumeration value="TooManyTimeWindows"/&gt;
 *     &lt;enumeration value="Duplicate"/&gt;
 *     &lt;enumeration value="NotFound"/&gt;
 *     &lt;enumeration value="InvalidEquipmentAssignment"/&gt;
 *     &lt;enumeration value="InvalidWorkersAssignment"/&gt;
 *     &lt;enumeration value="TimePeriodOrVehicleConstraintNotNull"/&gt;
 *     &lt;enumeration value="InvalidSuggestRouteParameters"/&gt;
 *     &lt;enumeration value="NonTransferableObjectTypeSpecified"/&gt;
 *     &lt;enumeration value="NonImportableObjectTypeSpecified"/&gt;
 *     &lt;enumeration value="NonTransferablePropertySpecified"/&gt;
 *     &lt;enumeration value="ImportTypeCsvDoesNotAllowSpecifiedDelimiter"/&gt;
 *     &lt;enumeration value="NoDelimiterSpecified"/&gt;
 *     &lt;enumeration value="NoSheetNameSpecified"/&gt;
 *     &lt;enumeration value="DuplicateSequence"/&gt;
 *     &lt;enumeration value="FixedLengthFieldOverlap"/&gt;
 *     &lt;enumeration value="FixedLengthZeroLength"/&gt;
 *     &lt;enumeration value="PropertyNotFoundOnDto"/&gt;
 *     &lt;enumeration value="MissingRequiredAlertParameter"/&gt;
 *     &lt;enumeration value="MinFlags"/&gt;
 *     &lt;enumeration value="MaxFlags"/&gt;
 *     &lt;enumeration value="IncorrectPropertyTemplateType"/&gt;
 *     &lt;enumeration value="InvalidProcessingMode"/&gt;
 *     &lt;enumeration value="MultipleStopTypeConditions"/&gt;
 *     &lt;enumeration value="MultipleEquipmentConditions"/&gt;
 *     &lt;enumeration value="SpecialFunctionCombinedWithInvalidCondition"/&gt;
 *     &lt;enumeration value="InvalidConditionCombination"/&gt;
 *     &lt;enumeration value="NoConditionsOrSpecialFunction"/&gt;
 *     &lt;enumeration value="InvalidHorizontalChildMapping"/&gt;
 *     &lt;enumeration value="DuplicatePropertyTemplate"/&gt;
 *     &lt;enumeration value="InvalidExpression"/&gt;
 *     &lt;enumeration value="LicenseViolation"/&gt;
 *     &lt;enumeration value="CellWithWorkerInvalidRouteLimit"/&gt;
 *     &lt;enumeration value="CellWithRouteIdInvalidRouteLimit"/&gt;
 *     &lt;enumeration value="CellWithEquipmentInvalidRouteLimit"/&gt;
 *     &lt;enumeration value="CellWithoutWorkerUsingWorkerEquipment"/&gt;
 *     &lt;enumeration value="CellWithInvalidEquipmentType"/&gt;
 *     &lt;enumeration value="InvalidViewport"/&gt;
 *     &lt;enumeration value="InvalidSpeedModifier"/&gt;
 *     &lt;enumeration value="NoNullElements"/&gt;
 *     &lt;enumeration value="SpatialAndAddressCriteriaNotNull"/&gt;
 *     &lt;enumeration value="InvalidMoveToRouteParameters"/&gt;
 *     &lt;enumeration value="DuplicateNetworkDataItem"/&gt;
 *     &lt;enumeration value="RequiresFalse"/&gt;
 *     &lt;enumeration value="RequiresTrue"/&gt;
 *     &lt;enumeration value="EAN"/&gt;
 *     &lt;enumeration value="FileMustExist"/&gt;
 *     &lt;enumeration value="IBAN"/&gt;
 *     &lt;enumeration value="InvalidCustomPropertyValue"/&gt;
 *     &lt;enumeration value="InvalidRoutingBasicGoals"/&gt;
 *     &lt;enumeration value="InvalidStopActionLocking"/&gt;
 *     &lt;enumeration value="InvalidPolygon"/&gt;
 *     &lt;enumeration value="DuplicateIndex"/&gt;
 *     &lt;enumeration value="MissingUnassignedOrderGroup"/&gt;
 *     &lt;enumeration value="MissingAssignedRoute"/&gt;
 *     &lt;enumeration value="InvalidCustomProperty"/&gt;
 *     &lt;enumeration value="MissingWeeklyTravelSpeeds"/&gt;
 *     &lt;enumeration value="WeeklyTravelSpeedsOutOfOrderOrBadTimePeriod"/&gt;
 *     &lt;enumeration value="InvalidTasksForOrderType"/&gt;
 *     &lt;enumeration value="PatternMustRepeatWeeklyWithMultipleDays"/&gt;
 *     &lt;enumeration value="InvalidPercentQuantitiesPerVisit"/&gt;
 *     &lt;enumeration value="InvalidServicePatternLevelQuantities"/&gt;
 *     &lt;enumeration value="InvalidTimeUnit"/&gt;
 *     &lt;enumeration value="DailyPatternMustHaveOneVisit"/&gt;
 *     &lt;enumeration value="IncompatibleServicePattern"/&gt;
 *     &lt;enumeration value="IncompatibleStartDateForTimeUnitType"/&gt;
 *     &lt;enumeration value="InvalidPartnerAssignment"/&gt;
 *     &lt;enumeration value="InvalidScorecardCriteriaWeighting"/&gt;
 *     &lt;enumeration value="ComplianceWorkerMustBeInXrsTelematicsRegion"/&gt;
 *     &lt;enumeration value="ComplianceWorkerMustHaveCdlNumber"/&gt;
 *     &lt;enumeration value="ComplianceWorkerMustHaveLogin"/&gt;
 *     &lt;enumeration value="ComplianceWorkerMissingHosRuleSet"/&gt;
 *     &lt;enumeration value="InvalidPurchasableOptionsConfiguration"/&gt;
 *     &lt;enumeration value="ComplianceModuleMustBePurchasedToEnableComplianceOnRegion"/&gt;
 *     &lt;enumeration value="InvalidMinMaxRange"/&gt;
 *     &lt;enumeration value="RouteLoadedOrStarted"/&gt;
 *     &lt;enumeration value="InvalidRegionSharing"/&gt;
 *     &lt;enumeration value="MissingPassword"/&gt;
 *     &lt;enumeration value="BeginDateAfterEndDate"/&gt;
 *     &lt;enumeration value="InvalidRegionDVIRSettings"/&gt;
 *     &lt;enumeration value="InvalidDiagnosticTroubleCodeFunction"/&gt;
 *     &lt;enumeration value="InvalidRegionHosSettings"/&gt;
 *     &lt;enumeration value="InvalidRegionComplianceAddress"/&gt;
 *     &lt;enumeration value="InvalidEquipmentMaintenancePlan"/&gt;
 *     &lt;enumeration value="InvalidEquipmentMaintenancePlanNoSchedule"/&gt;
 *     &lt;enumeration value="InvalidEquipmentMaintenancePlanDistance"/&gt;
 *     &lt;enumeration value="InvalidEquipmentMaintenancePlanMonths"/&gt;
 *     &lt;enumeration value="InvalidEquipmentMaintenancePlanEngineHours"/&gt;
 *     &lt;enumeration value="InvalidEquipmentMaintenanceInfo"/&gt;
 *     &lt;enumeration value="InvalidPropertyValueForEquipmentTrailer"/&gt;
 *     &lt;enumeration value="PropertyRequiresComplianceModule"/&gt;
 *     &lt;enumeration value="InvalidRegionIftaSettings"/&gt;
 *     &lt;enumeration value="InvalidLastStopDestination"/&gt;
 *     &lt;enumeration value="InvalidTelematicsHardwareConfiguration"/&gt;
 *     &lt;enumeration value="InvalidVehicleIdentificationNumber"/&gt;
 *     &lt;enumeration value="ComplianceWorkerMustHaveHosEldExemptExplanation"/&gt;
 *     &lt;enumeration value="ComplianceWorkerMissingDefaultHosRule"/&gt;
 *     &lt;enumeration value="ComplianceWorkerMissingHosDefaultReportingLocation"/&gt;
 *     &lt;enumeration value="ComplianceWorkerHosPropertySetConflict"/&gt;
 *     &lt;enumeration value="InvalidEquipmentLicensePlateCompliance"/&gt;
 *     &lt;enumeration value="ComplianceCountryIsRequired"/&gt;
 *     &lt;enumeration value="ComplianceStateIsRequired"/&gt;
 *     &lt;enumeration value="InvalidCountryCompliance"/&gt;
 *     &lt;enumeration value="InvalidStateCompliance"/&gt;
 *     &lt;enumeration value="CdlIssuingCountryIsRequired"/&gt;
 *     &lt;enumeration value="CdlIssuingStateIsRequired"/&gt;
 *     &lt;enumeration value="WorkerFirstLastNameRequiredCompliance"/&gt;
 *     &lt;enumeration value="ComplianceWorkerInvalidDefaultHosRule"/&gt;
 *     &lt;enumeration value="InvalidPropertiesForNonComplianceWorker"/&gt;
 *     &lt;enumeration value="InvalidOperationOnParentRegion"/&gt;
 *     &lt;enumeration value="InvalidInputOutputConfigurationForProviderType"/&gt;
 *     &lt;enumeration value="InvalidTopLevelComplianceEntity"/&gt;
 *     &lt;enumeration value="EnableOmnitracsNavigationPlusMustHaveEnableNavigationExplanation"/&gt;
 *     &lt;enumeration value="InvalidHardwarePlatform"/&gt;
 *     &lt;enumeration value="CustomFormControlSequenceInvalid"/&gt;
 *     &lt;enumeration value="FormControlAssignmentInvalid"/&gt;
 *     &lt;enumeration value="EquivalencyDestinationIsUnitOfWorkerActuals"/&gt;
 *     &lt;enumeration value="RouteArchived"/&gt;
 *     &lt;enumeration value="OverSpeedThresholdGreaterThanOrEqualToExcessiveOverSpeedThreshold"/&gt;
 *     &lt;enumeration value="InvalidTelematicsDeviceInputOutputConfiguration"/&gt;
 *     &lt;enumeration value="ImageFileSizeExceeded"/&gt;
 *     &lt;enumeration value="InvalidOmnitracsOneConfiguration"/&gt;
 *     &lt;enumeration value="IncompatibleServicePatternDays"/&gt;
 *     &lt;enumeration value="IncompatibleServicePatternWeeks"/&gt;
 *     &lt;enumeration value="ActiveWeeksLengthMismatch"/&gt;
 *     &lt;enumeration value="AmbiguousDaysAndActiveWeeks"/&gt;
 *     &lt;enumeration value="MinCooldownTimeGreaterThanOrEqualToMaxCooldownTime"/&gt;
 *     &lt;enumeration value="MinWarmupTimeGreaterThanOrEqualToMaxWarmupTime"/&gt;
 *     &lt;enumeration value="NoValidServicePatternFoundInSet"/&gt;
 *     &lt;enumeration value="UnplannedOriginRequiresServiceableStop"/&gt;
 *     &lt;enumeration value="InvalidOriginLoadAction"/&gt;
 *     &lt;enumeration value="CannotUseVisibleInAllRegions"/&gt;
 *     &lt;enumeration value="CompartmentMinMaxMismatch"/&gt;
 *     &lt;enumeration value="CompartmentMaxLessThanMin"/&gt;
 *     &lt;enumeration value="InvalidPlanningModelingVehiclesLicensed"/&gt;
 *     &lt;enumeration value="NoPlanningVehiclesLicensed"/&gt;
 *     &lt;enumeration value="InvalidRegionVideoSettings"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValidationFailure.FailureType")
@XmlEnum
public enum ValidationFailureFailureType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("NotNull")
    NOT_NULL("NotNull"),
    @XmlEnumValue("NotNullNotEmpty")
    NOT_NULL_NOT_EMPTY("NotNullNotEmpty"),
    @XmlEnumValue("Range")
    RANGE("Range"),
    @XmlEnumValue("Size")
    SIZE("Size"),
    @XmlEnumValue("Length")
    LENGTH("Length"),
    @XmlEnumValue("NotEmpty")
    NOT_EMPTY("NotEmpty"),
    @XmlEnumValue("Future")
    FUTURE("Future"),
    @XmlEnumValue("Past")
    PAST("Past"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Min")
    MIN("Min"),
    @XmlEnumValue("Max")
    MAX("Max"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("Identifier")
    IDENTIFIER("Identifier"),
    @XmlEnumValue("Within")
    WITHIN("Within"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("IPAddress")
    IP_ADDRESS("IPAddress"),
    @XmlEnumValue("Digits")
    DIGITS("Digits"),
    @XmlEnumValue("CreditCardNumber")
    CREDIT_CARD_NUMBER("CreditCardNumber"),
    @XmlEnumValue("Pattern")
    PATTERN("Pattern"),
    @XmlEnumValue("InvalidTimeWindow")
    INVALID_TIME_WINDOW("InvalidTimeWindow"),
    @XmlEnumValue("InvalidStopArrivalTime")
    INVALID_STOP_ARRIVAL_TIME("InvalidStopArrivalTime"),
    @XmlEnumValue("InvalidStopDepartureTime")
    INVALID_STOP_DEPARTURE_TIME("InvalidStopDepartureTime"),
    @XmlEnumValue("InvalidStopRunningQuantityAfter")
    INVALID_STOP_RUNNING_QUANTITY_AFTER("InvalidStopRunningQuantityAfter"),
    @XmlEnumValue("InvalidStopTotalDeliveryQuantities")
    INVALID_STOP_TOTAL_DELIVERY_QUANTITIES("InvalidStopTotalDeliveryQuantities"),
    @XmlEnumValue("InvalidStopTotalPickupQuantities")
    INVALID_STOP_TOTAL_PICKUP_QUANTITIES("InvalidStopTotalPickupQuantities"),
    @XmlEnumValue("ContainsOverlappingItems")
    CONTAINS_OVERLAPPING_ITEMS("ContainsOverlappingItems"),
    @XmlEnumValue("ServiceWindowNotWithinOpenCloseTime")
    SERVICE_WINDOW_NOT_WITHIN_OPEN_CLOSE_TIME("ServiceWindowNotWithinOpenCloseTime"),
    @XmlEnumValue("TooManyTimeWindowsForOrderClass")
    TOO_MANY_TIME_WINDOWS_FOR_ORDER_CLASS("TooManyTimeWindowsForOrderClass"),
    @XmlEnumValue("TooManyTimeWindows")
    TOO_MANY_TIME_WINDOWS("TooManyTimeWindows"),
    @XmlEnumValue("Duplicate")
    DUPLICATE("Duplicate"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("InvalidEquipmentAssignment")
    INVALID_EQUIPMENT_ASSIGNMENT("InvalidEquipmentAssignment"),
    @XmlEnumValue("InvalidWorkersAssignment")
    INVALID_WORKERS_ASSIGNMENT("InvalidWorkersAssignment"),
    @XmlEnumValue("TimePeriodOrVehicleConstraintNotNull")
    TIME_PERIOD_OR_VEHICLE_CONSTRAINT_NOT_NULL("TimePeriodOrVehicleConstraintNotNull"),
    @XmlEnumValue("InvalidSuggestRouteParameters")
    INVALID_SUGGEST_ROUTE_PARAMETERS("InvalidSuggestRouteParameters"),
    @XmlEnumValue("NonTransferableObjectTypeSpecified")
    NON_TRANSFERABLE_OBJECT_TYPE_SPECIFIED("NonTransferableObjectTypeSpecified"),
    @XmlEnumValue("NonImportableObjectTypeSpecified")
    NON_IMPORTABLE_OBJECT_TYPE_SPECIFIED("NonImportableObjectTypeSpecified"),
    @XmlEnumValue("NonTransferablePropertySpecified")
    NON_TRANSFERABLE_PROPERTY_SPECIFIED("NonTransferablePropertySpecified"),
    @XmlEnumValue("ImportTypeCsvDoesNotAllowSpecifiedDelimiter")
    IMPORT_TYPE_CSV_DOES_NOT_ALLOW_SPECIFIED_DELIMITER("ImportTypeCsvDoesNotAllowSpecifiedDelimiter"),
    @XmlEnumValue("NoDelimiterSpecified")
    NO_DELIMITER_SPECIFIED("NoDelimiterSpecified"),
    @XmlEnumValue("NoSheetNameSpecified")
    NO_SHEET_NAME_SPECIFIED("NoSheetNameSpecified"),
    @XmlEnumValue("DuplicateSequence")
    DUPLICATE_SEQUENCE("DuplicateSequence"),
    @XmlEnumValue("FixedLengthFieldOverlap")
    FIXED_LENGTH_FIELD_OVERLAP("FixedLengthFieldOverlap"),
    @XmlEnumValue("FixedLengthZeroLength")
    FIXED_LENGTH_ZERO_LENGTH("FixedLengthZeroLength"),
    @XmlEnumValue("PropertyNotFoundOnDto")
    PROPERTY_NOT_FOUND_ON_DTO("PropertyNotFoundOnDto"),
    @XmlEnumValue("MissingRequiredAlertParameter")
    MISSING_REQUIRED_ALERT_PARAMETER("MissingRequiredAlertParameter"),
    @XmlEnumValue("MinFlags")
    MIN_FLAGS("MinFlags"),
    @XmlEnumValue("MaxFlags")
    MAX_FLAGS("MaxFlags"),
    @XmlEnumValue("IncorrectPropertyTemplateType")
    INCORRECT_PROPERTY_TEMPLATE_TYPE("IncorrectPropertyTemplateType"),
    @XmlEnumValue("InvalidProcessingMode")
    INVALID_PROCESSING_MODE("InvalidProcessingMode"),
    @XmlEnumValue("MultipleStopTypeConditions")
    MULTIPLE_STOP_TYPE_CONDITIONS("MultipleStopTypeConditions"),
    @XmlEnumValue("MultipleEquipmentConditions")
    MULTIPLE_EQUIPMENT_CONDITIONS("MultipleEquipmentConditions"),
    @XmlEnumValue("SpecialFunctionCombinedWithInvalidCondition")
    SPECIAL_FUNCTION_COMBINED_WITH_INVALID_CONDITION("SpecialFunctionCombinedWithInvalidCondition"),
    @XmlEnumValue("InvalidConditionCombination")
    INVALID_CONDITION_COMBINATION("InvalidConditionCombination"),
    @XmlEnumValue("NoConditionsOrSpecialFunction")
    NO_CONDITIONS_OR_SPECIAL_FUNCTION("NoConditionsOrSpecialFunction"),
    @XmlEnumValue("InvalidHorizontalChildMapping")
    INVALID_HORIZONTAL_CHILD_MAPPING("InvalidHorizontalChildMapping"),
    @XmlEnumValue("DuplicatePropertyTemplate")
    DUPLICATE_PROPERTY_TEMPLATE("DuplicatePropertyTemplate"),
    @XmlEnumValue("InvalidExpression")
    INVALID_EXPRESSION("InvalidExpression"),
    @XmlEnumValue("LicenseViolation")
    LICENSE_VIOLATION("LicenseViolation"),
    @XmlEnumValue("CellWithWorkerInvalidRouteLimit")
    CELL_WITH_WORKER_INVALID_ROUTE_LIMIT("CellWithWorkerInvalidRouteLimit"),
    @XmlEnumValue("CellWithRouteIdInvalidRouteLimit")
    CELL_WITH_ROUTE_ID_INVALID_ROUTE_LIMIT("CellWithRouteIdInvalidRouteLimit"),
    @XmlEnumValue("CellWithEquipmentInvalidRouteLimit")
    CELL_WITH_EQUIPMENT_INVALID_ROUTE_LIMIT("CellWithEquipmentInvalidRouteLimit"),
    @XmlEnumValue("CellWithoutWorkerUsingWorkerEquipment")
    CELL_WITHOUT_WORKER_USING_WORKER_EQUIPMENT("CellWithoutWorkerUsingWorkerEquipment"),
    @XmlEnumValue("CellWithInvalidEquipmentType")
    CELL_WITH_INVALID_EQUIPMENT_TYPE("CellWithInvalidEquipmentType"),
    @XmlEnumValue("InvalidViewport")
    INVALID_VIEWPORT("InvalidViewport"),
    @XmlEnumValue("InvalidSpeedModifier")
    INVALID_SPEED_MODIFIER("InvalidSpeedModifier"),
    @XmlEnumValue("NoNullElements")
    NO_NULL_ELEMENTS("NoNullElements"),
    @XmlEnumValue("SpatialAndAddressCriteriaNotNull")
    SPATIAL_AND_ADDRESS_CRITERIA_NOT_NULL("SpatialAndAddressCriteriaNotNull"),
    @XmlEnumValue("InvalidMoveToRouteParameters")
    INVALID_MOVE_TO_ROUTE_PARAMETERS("InvalidMoveToRouteParameters"),
    @XmlEnumValue("DuplicateNetworkDataItem")
    DUPLICATE_NETWORK_DATA_ITEM("DuplicateNetworkDataItem"),
    @XmlEnumValue("RequiresFalse")
    REQUIRES_FALSE("RequiresFalse"),
    @XmlEnumValue("RequiresTrue")
    REQUIRES_TRUE("RequiresTrue"),
    EAN("EAN"),
    @XmlEnumValue("FileMustExist")
    FILE_MUST_EXIST("FileMustExist"),
    IBAN("IBAN"),
    @XmlEnumValue("InvalidCustomPropertyValue")
    INVALID_CUSTOM_PROPERTY_VALUE("InvalidCustomPropertyValue"),
    @XmlEnumValue("InvalidRoutingBasicGoals")
    INVALID_ROUTING_BASIC_GOALS("InvalidRoutingBasicGoals"),
    @XmlEnumValue("InvalidStopActionLocking")
    INVALID_STOP_ACTION_LOCKING("InvalidStopActionLocking"),
    @XmlEnumValue("InvalidPolygon")
    INVALID_POLYGON("InvalidPolygon"),
    @XmlEnumValue("DuplicateIndex")
    DUPLICATE_INDEX("DuplicateIndex"),
    @XmlEnumValue("MissingUnassignedOrderGroup")
    MISSING_UNASSIGNED_ORDER_GROUP("MissingUnassignedOrderGroup"),
    @XmlEnumValue("MissingAssignedRoute")
    MISSING_ASSIGNED_ROUTE("MissingAssignedRoute"),
    @XmlEnumValue("InvalidCustomProperty")
    INVALID_CUSTOM_PROPERTY("InvalidCustomProperty"),
    @XmlEnumValue("MissingWeeklyTravelSpeeds")
    MISSING_WEEKLY_TRAVEL_SPEEDS("MissingWeeklyTravelSpeeds"),
    @XmlEnumValue("WeeklyTravelSpeedsOutOfOrderOrBadTimePeriod")
    WEEKLY_TRAVEL_SPEEDS_OUT_OF_ORDER_OR_BAD_TIME_PERIOD("WeeklyTravelSpeedsOutOfOrderOrBadTimePeriod"),
    @XmlEnumValue("InvalidTasksForOrderType")
    INVALID_TASKS_FOR_ORDER_TYPE("InvalidTasksForOrderType"),
    @XmlEnumValue("PatternMustRepeatWeeklyWithMultipleDays")
    PATTERN_MUST_REPEAT_WEEKLY_WITH_MULTIPLE_DAYS("PatternMustRepeatWeeklyWithMultipleDays"),
    @XmlEnumValue("InvalidPercentQuantitiesPerVisit")
    INVALID_PERCENT_QUANTITIES_PER_VISIT("InvalidPercentQuantitiesPerVisit"),
    @XmlEnumValue("InvalidServicePatternLevelQuantities")
    INVALID_SERVICE_PATTERN_LEVEL_QUANTITIES("InvalidServicePatternLevelQuantities"),
    @XmlEnumValue("InvalidTimeUnit")
    INVALID_TIME_UNIT("InvalidTimeUnit"),
    @XmlEnumValue("DailyPatternMustHaveOneVisit")
    DAILY_PATTERN_MUST_HAVE_ONE_VISIT("DailyPatternMustHaveOneVisit"),
    @XmlEnumValue("IncompatibleServicePattern")
    INCOMPATIBLE_SERVICE_PATTERN("IncompatibleServicePattern"),
    @XmlEnumValue("IncompatibleStartDateForTimeUnitType")
    INCOMPATIBLE_START_DATE_FOR_TIME_UNIT_TYPE("IncompatibleStartDateForTimeUnitType"),
    @XmlEnumValue("InvalidPartnerAssignment")
    INVALID_PARTNER_ASSIGNMENT("InvalidPartnerAssignment"),
    @XmlEnumValue("InvalidScorecardCriteriaWeighting")
    INVALID_SCORECARD_CRITERIA_WEIGHTING("InvalidScorecardCriteriaWeighting"),
    @XmlEnumValue("ComplianceWorkerMustBeInXrsTelematicsRegion")
    COMPLIANCE_WORKER_MUST_BE_IN_XRS_TELEMATICS_REGION("ComplianceWorkerMustBeInXrsTelematicsRegion"),
    @XmlEnumValue("ComplianceWorkerMustHaveCdlNumber")
    COMPLIANCE_WORKER_MUST_HAVE_CDL_NUMBER("ComplianceWorkerMustHaveCdlNumber"),
    @XmlEnumValue("ComplianceWorkerMustHaveLogin")
    COMPLIANCE_WORKER_MUST_HAVE_LOGIN("ComplianceWorkerMustHaveLogin"),
    @XmlEnumValue("ComplianceWorkerMissingHosRuleSet")
    COMPLIANCE_WORKER_MISSING_HOS_RULE_SET("ComplianceWorkerMissingHosRuleSet"),
    @XmlEnumValue("InvalidPurchasableOptionsConfiguration")
    INVALID_PURCHASABLE_OPTIONS_CONFIGURATION("InvalidPurchasableOptionsConfiguration"),
    @XmlEnumValue("ComplianceModuleMustBePurchasedToEnableComplianceOnRegion")
    COMPLIANCE_MODULE_MUST_BE_PURCHASED_TO_ENABLE_COMPLIANCE_ON_REGION("ComplianceModuleMustBePurchasedToEnableComplianceOnRegion"),
    @XmlEnumValue("InvalidMinMaxRange")
    INVALID_MIN_MAX_RANGE("InvalidMinMaxRange"),
    @XmlEnumValue("RouteLoadedOrStarted")
    ROUTE_LOADED_OR_STARTED("RouteLoadedOrStarted"),
    @XmlEnumValue("InvalidRegionSharing")
    INVALID_REGION_SHARING("InvalidRegionSharing"),
    @XmlEnumValue("MissingPassword")
    MISSING_PASSWORD("MissingPassword"),
    @XmlEnumValue("BeginDateAfterEndDate")
    BEGIN_DATE_AFTER_END_DATE("BeginDateAfterEndDate"),
    @XmlEnumValue("InvalidRegionDVIRSettings")
    INVALID_REGION_DVIR_SETTINGS("InvalidRegionDVIRSettings"),
    @XmlEnumValue("InvalidDiagnosticTroubleCodeFunction")
    INVALID_DIAGNOSTIC_TROUBLE_CODE_FUNCTION("InvalidDiagnosticTroubleCodeFunction"),
    @XmlEnumValue("InvalidRegionHosSettings")
    INVALID_REGION_HOS_SETTINGS("InvalidRegionHosSettings"),
    @XmlEnumValue("InvalidRegionComplianceAddress")
    INVALID_REGION_COMPLIANCE_ADDRESS("InvalidRegionComplianceAddress"),
    @XmlEnumValue("InvalidEquipmentMaintenancePlan")
    INVALID_EQUIPMENT_MAINTENANCE_PLAN("InvalidEquipmentMaintenancePlan"),
    @XmlEnumValue("InvalidEquipmentMaintenancePlanNoSchedule")
    INVALID_EQUIPMENT_MAINTENANCE_PLAN_NO_SCHEDULE("InvalidEquipmentMaintenancePlanNoSchedule"),
    @XmlEnumValue("InvalidEquipmentMaintenancePlanDistance")
    INVALID_EQUIPMENT_MAINTENANCE_PLAN_DISTANCE("InvalidEquipmentMaintenancePlanDistance"),
    @XmlEnumValue("InvalidEquipmentMaintenancePlanMonths")
    INVALID_EQUIPMENT_MAINTENANCE_PLAN_MONTHS("InvalidEquipmentMaintenancePlanMonths"),
    @XmlEnumValue("InvalidEquipmentMaintenancePlanEngineHours")
    INVALID_EQUIPMENT_MAINTENANCE_PLAN_ENGINE_HOURS("InvalidEquipmentMaintenancePlanEngineHours"),
    @XmlEnumValue("InvalidEquipmentMaintenanceInfo")
    INVALID_EQUIPMENT_MAINTENANCE_INFO("InvalidEquipmentMaintenanceInfo"),
    @XmlEnumValue("InvalidPropertyValueForEquipmentTrailer")
    INVALID_PROPERTY_VALUE_FOR_EQUIPMENT_TRAILER("InvalidPropertyValueForEquipmentTrailer"),
    @XmlEnumValue("PropertyRequiresComplianceModule")
    PROPERTY_REQUIRES_COMPLIANCE_MODULE("PropertyRequiresComplianceModule"),
    @XmlEnumValue("InvalidRegionIftaSettings")
    INVALID_REGION_IFTA_SETTINGS("InvalidRegionIftaSettings"),
    @XmlEnumValue("InvalidLastStopDestination")
    INVALID_LAST_STOP_DESTINATION("InvalidLastStopDestination"),
    @XmlEnumValue("InvalidTelematicsHardwareConfiguration")
    INVALID_TELEMATICS_HARDWARE_CONFIGURATION("InvalidTelematicsHardwareConfiguration"),
    @XmlEnumValue("InvalidVehicleIdentificationNumber")
    INVALID_VEHICLE_IDENTIFICATION_NUMBER("InvalidVehicleIdentificationNumber"),
    @XmlEnumValue("ComplianceWorkerMustHaveHosEldExemptExplanation")
    COMPLIANCE_WORKER_MUST_HAVE_HOS_ELD_EXEMPT_EXPLANATION("ComplianceWorkerMustHaveHosEldExemptExplanation"),
    @XmlEnumValue("ComplianceWorkerMissingDefaultHosRule")
    COMPLIANCE_WORKER_MISSING_DEFAULT_HOS_RULE("ComplianceWorkerMissingDefaultHosRule"),
    @XmlEnumValue("ComplianceWorkerMissingHosDefaultReportingLocation")
    COMPLIANCE_WORKER_MISSING_HOS_DEFAULT_REPORTING_LOCATION("ComplianceWorkerMissingHosDefaultReportingLocation"),
    @XmlEnumValue("ComplianceWorkerHosPropertySetConflict")
    COMPLIANCE_WORKER_HOS_PROPERTY_SET_CONFLICT("ComplianceWorkerHosPropertySetConflict"),
    @XmlEnumValue("InvalidEquipmentLicensePlateCompliance")
    INVALID_EQUIPMENT_LICENSE_PLATE_COMPLIANCE("InvalidEquipmentLicensePlateCompliance"),
    @XmlEnumValue("ComplianceCountryIsRequired")
    COMPLIANCE_COUNTRY_IS_REQUIRED("ComplianceCountryIsRequired"),
    @XmlEnumValue("ComplianceStateIsRequired")
    COMPLIANCE_STATE_IS_REQUIRED("ComplianceStateIsRequired"),
    @XmlEnumValue("InvalidCountryCompliance")
    INVALID_COUNTRY_COMPLIANCE("InvalidCountryCompliance"),
    @XmlEnumValue("InvalidStateCompliance")
    INVALID_STATE_COMPLIANCE("InvalidStateCompliance"),
    @XmlEnumValue("CdlIssuingCountryIsRequired")
    CDL_ISSUING_COUNTRY_IS_REQUIRED("CdlIssuingCountryIsRequired"),
    @XmlEnumValue("CdlIssuingStateIsRequired")
    CDL_ISSUING_STATE_IS_REQUIRED("CdlIssuingStateIsRequired"),
    @XmlEnumValue("WorkerFirstLastNameRequiredCompliance")
    WORKER_FIRST_LAST_NAME_REQUIRED_COMPLIANCE("WorkerFirstLastNameRequiredCompliance"),
    @XmlEnumValue("ComplianceWorkerInvalidDefaultHosRule")
    COMPLIANCE_WORKER_INVALID_DEFAULT_HOS_RULE("ComplianceWorkerInvalidDefaultHosRule"),
    @XmlEnumValue("InvalidPropertiesForNonComplianceWorker")
    INVALID_PROPERTIES_FOR_NON_COMPLIANCE_WORKER("InvalidPropertiesForNonComplianceWorker"),
    @XmlEnumValue("InvalidOperationOnParentRegion")
    INVALID_OPERATION_ON_PARENT_REGION("InvalidOperationOnParentRegion"),
    @XmlEnumValue("InvalidInputOutputConfigurationForProviderType")
    INVALID_INPUT_OUTPUT_CONFIGURATION_FOR_PROVIDER_TYPE("InvalidInputOutputConfigurationForProviderType"),
    @XmlEnumValue("InvalidTopLevelComplianceEntity")
    INVALID_TOP_LEVEL_COMPLIANCE_ENTITY("InvalidTopLevelComplianceEntity"),
    @XmlEnumValue("EnableOmnitracsNavigationPlusMustHaveEnableNavigationExplanation")
    ENABLE_OMNITRACS_NAVIGATION_PLUS_MUST_HAVE_ENABLE_NAVIGATION_EXPLANATION("EnableOmnitracsNavigationPlusMustHaveEnableNavigationExplanation"),
    @XmlEnumValue("InvalidHardwarePlatform")
    INVALID_HARDWARE_PLATFORM("InvalidHardwarePlatform"),
    @XmlEnumValue("CustomFormControlSequenceInvalid")
    CUSTOM_FORM_CONTROL_SEQUENCE_INVALID("CustomFormControlSequenceInvalid"),
    @XmlEnumValue("FormControlAssignmentInvalid")
    FORM_CONTROL_ASSIGNMENT_INVALID("FormControlAssignmentInvalid"),
    @XmlEnumValue("EquivalencyDestinationIsUnitOfWorkerActuals")
    EQUIVALENCY_DESTINATION_IS_UNIT_OF_WORKER_ACTUALS("EquivalencyDestinationIsUnitOfWorkerActuals"),
    @XmlEnumValue("RouteArchived")
    ROUTE_ARCHIVED("RouteArchived"),
    @XmlEnumValue("OverSpeedThresholdGreaterThanOrEqualToExcessiveOverSpeedThreshold")
    OVER_SPEED_THRESHOLD_GREATER_THAN_OR_EQUAL_TO_EXCESSIVE_OVER_SPEED_THRESHOLD("OverSpeedThresholdGreaterThanOrEqualToExcessiveOverSpeedThreshold"),
    @XmlEnumValue("InvalidTelematicsDeviceInputOutputConfiguration")
    INVALID_TELEMATICS_DEVICE_INPUT_OUTPUT_CONFIGURATION("InvalidTelematicsDeviceInputOutputConfiguration"),
    @XmlEnumValue("ImageFileSizeExceeded")
    IMAGE_FILE_SIZE_EXCEEDED("ImageFileSizeExceeded"),
    @XmlEnumValue("InvalidOmnitracsOneConfiguration")
    INVALID_OMNITRACS_ONE_CONFIGURATION("InvalidOmnitracsOneConfiguration"),
    @XmlEnumValue("IncompatibleServicePatternDays")
    INCOMPATIBLE_SERVICE_PATTERN_DAYS("IncompatibleServicePatternDays"),
    @XmlEnumValue("IncompatibleServicePatternWeeks")
    INCOMPATIBLE_SERVICE_PATTERN_WEEKS("IncompatibleServicePatternWeeks"),
    @XmlEnumValue("ActiveWeeksLengthMismatch")
    ACTIVE_WEEKS_LENGTH_MISMATCH("ActiveWeeksLengthMismatch"),
    @XmlEnumValue("AmbiguousDaysAndActiveWeeks")
    AMBIGUOUS_DAYS_AND_ACTIVE_WEEKS("AmbiguousDaysAndActiveWeeks"),
    @XmlEnumValue("MinCooldownTimeGreaterThanOrEqualToMaxCooldownTime")
    MIN_COOLDOWN_TIME_GREATER_THAN_OR_EQUAL_TO_MAX_COOLDOWN_TIME("MinCooldownTimeGreaterThanOrEqualToMaxCooldownTime"),
    @XmlEnumValue("MinWarmupTimeGreaterThanOrEqualToMaxWarmupTime")
    MIN_WARMUP_TIME_GREATER_THAN_OR_EQUAL_TO_MAX_WARMUP_TIME("MinWarmupTimeGreaterThanOrEqualToMaxWarmupTime"),
    @XmlEnumValue("NoValidServicePatternFoundInSet")
    NO_VALID_SERVICE_PATTERN_FOUND_IN_SET("NoValidServicePatternFoundInSet"),
    @XmlEnumValue("UnplannedOriginRequiresServiceableStop")
    UNPLANNED_ORIGIN_REQUIRES_SERVICEABLE_STOP("UnplannedOriginRequiresServiceableStop"),
    @XmlEnumValue("InvalidOriginLoadAction")
    INVALID_ORIGIN_LOAD_ACTION("InvalidOriginLoadAction"),
    @XmlEnumValue("CannotUseVisibleInAllRegions")
    CANNOT_USE_VISIBLE_IN_ALL_REGIONS("CannotUseVisibleInAllRegions"),
    @XmlEnumValue("CompartmentMinMaxMismatch")
    COMPARTMENT_MIN_MAX_MISMATCH("CompartmentMinMaxMismatch"),
    @XmlEnumValue("CompartmentMaxLessThanMin")
    COMPARTMENT_MAX_LESS_THAN_MIN("CompartmentMaxLessThanMin"),
    @XmlEnumValue("InvalidPlanningModelingVehiclesLicensed")
    INVALID_PLANNING_MODELING_VEHICLES_LICENSED("InvalidPlanningModelingVehiclesLicensed"),
    @XmlEnumValue("NoPlanningVehiclesLicensed")
    NO_PLANNING_VEHICLES_LICENSED("NoPlanningVehiclesLicensed"),
    @XmlEnumValue("InvalidRegionVideoSettings")
    INVALID_REGION_VIDEO_SETTINGS("InvalidRegionVideoSettings");
    private final String value;

    ValidationFailureFailureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidationFailureFailureType fromValue(String v) {
        for (ValidationFailureFailureType c: ValidationFailureFailureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
