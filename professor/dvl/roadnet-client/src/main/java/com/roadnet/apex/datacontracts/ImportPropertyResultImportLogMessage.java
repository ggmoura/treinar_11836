
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImportPropertyResult.ImportLogMessage.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportPropertyResult.ImportLogMessage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DefaultValueWithWarning"/&gt;
 *     &lt;enumeration value="MissingValue"/&gt;
 *     &lt;enumeration value="ConversionNotSupported"/&gt;
 *     &lt;enumeration value="IncorrectFormat"/&gt;
 *     &lt;enumeration value="Overflow"/&gt;
 *     &lt;enumeration value="InvalidOrderType"/&gt;
 *     &lt;enumeration value="ValidationFailure"/&gt;
 *     &lt;enumeration value="NotEnoughPropertiesSpecifiedToLoad"/&gt;
 *     &lt;enumeration value="UnableToLoadRelatedEntity"/&gt;
 *     &lt;enumeration value="EnumerationMemberNotFound"/&gt;
 *     &lt;enumeration value="UnableToParseDateUsingDefaultMask"/&gt;
 *     &lt;enumeration value="UnableToParseDate"/&gt;
 *     &lt;enumeration value="UnableToParseDateTimeUsingDefaultMask"/&gt;
 *     &lt;enumeration value="UnableToParseDateTime"/&gt;
 *     &lt;enumeration value="UnableToParseTimeUsingDefaultMask"/&gt;
 *     &lt;enumeration value="UnableToParseTime"/&gt;
 *     &lt;enumeration value="UnableToLoadRelatedEntityDefaultUsed"/&gt;
 *     &lt;enumeration value="Duplicate"/&gt;
 *     &lt;enumeration value="InvalidTimeWindowDetail"/&gt;
 *     &lt;enumeration value="UnsupportedFutureOrderType"/&gt;
 *     &lt;enumeration value="UnsupportedReturnOrderType"/&gt;
 *     &lt;enumeration value="LicenseViolation"/&gt;
 *     &lt;enumeration value="LineItemHasNoMatchingOrder"/&gt;
 *     &lt;enumeration value="LineItemHasBothPickupAndDeliveryQuantities"/&gt;
 *     &lt;enumeration value="AmbiguousTransferOrderLocation"/&gt;
 *     &lt;enumeration value="PickupAndDeliveryQuantitiesDoNotMatchForTransferOrder"/&gt;
 *     &lt;enumeration value="SamePickupAndDeliveryLocationSpecifiedForTransferOrder"/&gt;
 *     &lt;enumeration value="DepotUnmappedAndNoDefaultSpecified"/&gt;
 *     &lt;enumeration value="SessionWithThisDescriptionAlreadyExists"/&gt;
 *     &lt;enumeration value="SessionWithThisDescriptionAndDateAlreadyExists"/&gt;
 *     &lt;enumeration value="EquipmentUnmappedAndNoDefaultSpecified"/&gt;
 *     &lt;enumeration value="OrderClassUnmappedAndNoDefaultSpecified"/&gt;
 *     &lt;enumeration value="OnlyOneDepotIsCurrentlyAllowedPerTerritory"/&gt;
 *     &lt;enumeration value="PropertyValueConvertedDueToInvalidCharacters"/&gt;
 *     &lt;enumeration value="AddressConvertedDueToSuppliedCoordinate"/&gt;
 *     &lt;enumeration value="CannotChangePropertyValue"/&gt;
 *     &lt;enumeration value="EngineHoursOutsideOfRange"/&gt;
 *     &lt;enumeration value="InvalidEmailForActiveAlertRecipient"/&gt;
 *     &lt;enumeration value="InvalidPhoneNumberForActiveAlertRecipient"/&gt;
 *     &lt;enumeration value="UnmappedActiveAlertError"/&gt;
 *     &lt;enumeration value="PickupAndDeliveryIncreaseQuantitiesDoNoMatchForTransferOrder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImportPropertyResult.ImportLogMessage")
@XmlEnum
public enum ImportPropertyResultImportLogMessage {

    @XmlEnumValue("DefaultValueWithWarning")
    DEFAULT_VALUE_WITH_WARNING("DefaultValueWithWarning"),
    @XmlEnumValue("MissingValue")
    MISSING_VALUE("MissingValue"),
    @XmlEnumValue("ConversionNotSupported")
    CONVERSION_NOT_SUPPORTED("ConversionNotSupported"),
    @XmlEnumValue("IncorrectFormat")
    INCORRECT_FORMAT("IncorrectFormat"),
    @XmlEnumValue("Overflow")
    OVERFLOW("Overflow"),
    @XmlEnumValue("InvalidOrderType")
    INVALID_ORDER_TYPE("InvalidOrderType"),
    @XmlEnumValue("ValidationFailure")
    VALIDATION_FAILURE("ValidationFailure"),
    @XmlEnumValue("NotEnoughPropertiesSpecifiedToLoad")
    NOT_ENOUGH_PROPERTIES_SPECIFIED_TO_LOAD("NotEnoughPropertiesSpecifiedToLoad"),
    @XmlEnumValue("UnableToLoadRelatedEntity")
    UNABLE_TO_LOAD_RELATED_ENTITY("UnableToLoadRelatedEntity"),
    @XmlEnumValue("EnumerationMemberNotFound")
    ENUMERATION_MEMBER_NOT_FOUND("EnumerationMemberNotFound"),
    @XmlEnumValue("UnableToParseDateUsingDefaultMask")
    UNABLE_TO_PARSE_DATE_USING_DEFAULT_MASK("UnableToParseDateUsingDefaultMask"),
    @XmlEnumValue("UnableToParseDate")
    UNABLE_TO_PARSE_DATE("UnableToParseDate"),
    @XmlEnumValue("UnableToParseDateTimeUsingDefaultMask")
    UNABLE_TO_PARSE_DATE_TIME_USING_DEFAULT_MASK("UnableToParseDateTimeUsingDefaultMask"),
    @XmlEnumValue("UnableToParseDateTime")
    UNABLE_TO_PARSE_DATE_TIME("UnableToParseDateTime"),
    @XmlEnumValue("UnableToParseTimeUsingDefaultMask")
    UNABLE_TO_PARSE_TIME_USING_DEFAULT_MASK("UnableToParseTimeUsingDefaultMask"),
    @XmlEnumValue("UnableToParseTime")
    UNABLE_TO_PARSE_TIME("UnableToParseTime"),
    @XmlEnumValue("UnableToLoadRelatedEntityDefaultUsed")
    UNABLE_TO_LOAD_RELATED_ENTITY_DEFAULT_USED("UnableToLoadRelatedEntityDefaultUsed"),
    @XmlEnumValue("Duplicate")
    DUPLICATE("Duplicate"),
    @XmlEnumValue("InvalidTimeWindowDetail")
    INVALID_TIME_WINDOW_DETAIL("InvalidTimeWindowDetail"),
    @XmlEnumValue("UnsupportedFutureOrderType")
    UNSUPPORTED_FUTURE_ORDER_TYPE("UnsupportedFutureOrderType"),
    @XmlEnumValue("UnsupportedReturnOrderType")
    UNSUPPORTED_RETURN_ORDER_TYPE("UnsupportedReturnOrderType"),
    @XmlEnumValue("LicenseViolation")
    LICENSE_VIOLATION("LicenseViolation"),
    @XmlEnumValue("LineItemHasNoMatchingOrder")
    LINE_ITEM_HAS_NO_MATCHING_ORDER("LineItemHasNoMatchingOrder"),
    @XmlEnumValue("LineItemHasBothPickupAndDeliveryQuantities")
    LINE_ITEM_HAS_BOTH_PICKUP_AND_DELIVERY_QUANTITIES("LineItemHasBothPickupAndDeliveryQuantities"),
    @XmlEnumValue("AmbiguousTransferOrderLocation")
    AMBIGUOUS_TRANSFER_ORDER_LOCATION("AmbiguousTransferOrderLocation"),
    @XmlEnumValue("PickupAndDeliveryQuantitiesDoNotMatchForTransferOrder")
    PICKUP_AND_DELIVERY_QUANTITIES_DO_NOT_MATCH_FOR_TRANSFER_ORDER("PickupAndDeliveryQuantitiesDoNotMatchForTransferOrder"),
    @XmlEnumValue("SamePickupAndDeliveryLocationSpecifiedForTransferOrder")
    SAME_PICKUP_AND_DELIVERY_LOCATION_SPECIFIED_FOR_TRANSFER_ORDER("SamePickupAndDeliveryLocationSpecifiedForTransferOrder"),
    @XmlEnumValue("DepotUnmappedAndNoDefaultSpecified")
    DEPOT_UNMAPPED_AND_NO_DEFAULT_SPECIFIED("DepotUnmappedAndNoDefaultSpecified"),
    @XmlEnumValue("SessionWithThisDescriptionAlreadyExists")
    SESSION_WITH_THIS_DESCRIPTION_ALREADY_EXISTS("SessionWithThisDescriptionAlreadyExists"),
    @XmlEnumValue("SessionWithThisDescriptionAndDateAlreadyExists")
    SESSION_WITH_THIS_DESCRIPTION_AND_DATE_ALREADY_EXISTS("SessionWithThisDescriptionAndDateAlreadyExists"),
    @XmlEnumValue("EquipmentUnmappedAndNoDefaultSpecified")
    EQUIPMENT_UNMAPPED_AND_NO_DEFAULT_SPECIFIED("EquipmentUnmappedAndNoDefaultSpecified"),
    @XmlEnumValue("OrderClassUnmappedAndNoDefaultSpecified")
    ORDER_CLASS_UNMAPPED_AND_NO_DEFAULT_SPECIFIED("OrderClassUnmappedAndNoDefaultSpecified"),
    @XmlEnumValue("OnlyOneDepotIsCurrentlyAllowedPerTerritory")
    ONLY_ONE_DEPOT_IS_CURRENTLY_ALLOWED_PER_TERRITORY("OnlyOneDepotIsCurrentlyAllowedPerTerritory"),
    @XmlEnumValue("PropertyValueConvertedDueToInvalidCharacters")
    PROPERTY_VALUE_CONVERTED_DUE_TO_INVALID_CHARACTERS("PropertyValueConvertedDueToInvalidCharacters"),
    @XmlEnumValue("AddressConvertedDueToSuppliedCoordinate")
    ADDRESS_CONVERTED_DUE_TO_SUPPLIED_COORDINATE("AddressConvertedDueToSuppliedCoordinate"),
    @XmlEnumValue("CannotChangePropertyValue")
    CANNOT_CHANGE_PROPERTY_VALUE("CannotChangePropertyValue"),
    @XmlEnumValue("EngineHoursOutsideOfRange")
    ENGINE_HOURS_OUTSIDE_OF_RANGE("EngineHoursOutsideOfRange"),
    @XmlEnumValue("InvalidEmailForActiveAlertRecipient")
    INVALID_EMAIL_FOR_ACTIVE_ALERT_RECIPIENT("InvalidEmailForActiveAlertRecipient"),
    @XmlEnumValue("InvalidPhoneNumberForActiveAlertRecipient")
    INVALID_PHONE_NUMBER_FOR_ACTIVE_ALERT_RECIPIENT("InvalidPhoneNumberForActiveAlertRecipient"),
    @XmlEnumValue("UnmappedActiveAlertError")
    UNMAPPED_ACTIVE_ALERT_ERROR("UnmappedActiveAlertError"),
    @XmlEnumValue("PickupAndDeliveryIncreaseQuantitiesDoNoMatchForTransferOrder")
    PICKUP_AND_DELIVERY_INCREASE_QUANTITIES_DO_NO_MATCH_FOR_TRANSFER_ORDER("PickupAndDeliveryIncreaseQuantitiesDoNoMatchForTransferOrder");
    private final String value;

    ImportPropertyResultImportLogMessage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportPropertyResultImportLogMessage fromValue(String v) {
        for (ImportPropertyResultImportLogMessage c: ImportPropertyResultImportLogMessage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
