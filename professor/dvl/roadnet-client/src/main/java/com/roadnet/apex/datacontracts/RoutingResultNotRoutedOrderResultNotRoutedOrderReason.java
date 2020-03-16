
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoutingResult.NotRoutedOrderResult.NotRoutedOrderReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutingResult.NotRoutedOrderResult.NotRoutedOrderReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CouldNotBeDetermined"/&gt;
 *     &lt;enumeration value="MaxTime"/&gt;
 *     &lt;enumeration value="StartTime"/&gt;
 *     &lt;enumeration value="RouteMinimums"/&gt;
 *     &lt;enumeration value="MaxQuantity"/&gt;
 *     &lt;enumeration value="Template"/&gt;
 *     &lt;enumeration value="ReloadAsLastStop"/&gt;
 *     &lt;enumeration value="MaxStops"/&gt;
 *     &lt;enumeration value="MaxReloads"/&gt;
 *     &lt;enumeration value="RequiredOrigin"/&gt;
 *     &lt;enumeration value="LocationEquipmentTypeRestrictions"/&gt;
 *     &lt;enumeration value="CellBoundaries"/&gt;
 *     &lt;enumeration value="PreferredRouteId"/&gt;
 *     &lt;enumeration value="CellEquipmentTypeRestrictions"/&gt;
 *     &lt;enumeration value="TripMaxTime"/&gt;
 *     &lt;enumeration value="TripMinimums"/&gt;
 *     &lt;enumeration value="RunningCap"/&gt;
 *     &lt;enumeration value="MustMakeTimeWindow"/&gt;
 *     &lt;enumeration value="Priority"/&gt;
 *     &lt;enumeration value="PickupsAtEnd"/&gt;
 *     &lt;enumeration value="ReloadCapThreshold"/&gt;
 *     &lt;enumeration value="AllowedDeliveryDays"/&gt;
 *     &lt;enumeration value="Filter"/&gt;
 *     &lt;enumeration value="TimeOfDay"/&gt;
 *     &lt;enumeration value="VehicleRestriction"/&gt;
 *     &lt;enumeration value="OrderBeginEndDate"/&gt;
 *     &lt;enumeration value="NoRoutes"/&gt;
 *     &lt;enumeration value="NoRemainingEquipment"/&gt;
 *     &lt;enumeration value="TemplateResources"/&gt;
 *     &lt;enumeration value="OnlyTemplateRouting"/&gt;
 *     &lt;enumeration value="OnlyCellRouting"/&gt;
 *     &lt;enumeration value="CellRouteLimit"/&gt;
 *     &lt;enumeration value="NoValidResourceAssignment"/&gt;
 *     &lt;enumeration value="RouteTemplateDeliveryDays"/&gt;
 *     &lt;enumeration value="TargetRouteIsBuilt"/&gt;
 *     &lt;enumeration value="LocationNotGeocoded"/&gt;
 *     &lt;enumeration value="LocationDeleted"/&gt;
 *     &lt;enumeration value="MaxTravelTime"/&gt;
 *     &lt;enumeration value="CompartmentCapacity"/&gt;
 *     &lt;enumeration value="NoMatchingCompartment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoutingResult.NotRoutedOrderResult.NotRoutedOrderReason")
@XmlEnum
public enum RoutingResultNotRoutedOrderResultNotRoutedOrderReason {

    @XmlEnumValue("CouldNotBeDetermined")
    COULD_NOT_BE_DETERMINED("CouldNotBeDetermined"),
    @XmlEnumValue("MaxTime")
    MAX_TIME("MaxTime"),
    @XmlEnumValue("StartTime")
    START_TIME("StartTime"),
    @XmlEnumValue("RouteMinimums")
    ROUTE_MINIMUMS("RouteMinimums"),
    @XmlEnumValue("MaxQuantity")
    MAX_QUANTITY("MaxQuantity"),
    @XmlEnumValue("Template")
    TEMPLATE("Template"),
    @XmlEnumValue("ReloadAsLastStop")
    RELOAD_AS_LAST_STOP("ReloadAsLastStop"),
    @XmlEnumValue("MaxStops")
    MAX_STOPS("MaxStops"),
    @XmlEnumValue("MaxReloads")
    MAX_RELOADS("MaxReloads"),
    @XmlEnumValue("RequiredOrigin")
    REQUIRED_ORIGIN("RequiredOrigin"),
    @XmlEnumValue("LocationEquipmentTypeRestrictions")
    LOCATION_EQUIPMENT_TYPE_RESTRICTIONS("LocationEquipmentTypeRestrictions"),
    @XmlEnumValue("CellBoundaries")
    CELL_BOUNDARIES("CellBoundaries"),
    @XmlEnumValue("PreferredRouteId")
    PREFERRED_ROUTE_ID("PreferredRouteId"),
    @XmlEnumValue("CellEquipmentTypeRestrictions")
    CELL_EQUIPMENT_TYPE_RESTRICTIONS("CellEquipmentTypeRestrictions"),
    @XmlEnumValue("TripMaxTime")
    TRIP_MAX_TIME("TripMaxTime"),
    @XmlEnumValue("TripMinimums")
    TRIP_MINIMUMS("TripMinimums"),
    @XmlEnumValue("RunningCap")
    RUNNING_CAP("RunningCap"),
    @XmlEnumValue("MustMakeTimeWindow")
    MUST_MAKE_TIME_WINDOW("MustMakeTimeWindow"),
    @XmlEnumValue("Priority")
    PRIORITY("Priority"),
    @XmlEnumValue("PickupsAtEnd")
    PICKUPS_AT_END("PickupsAtEnd"),
    @XmlEnumValue("ReloadCapThreshold")
    RELOAD_CAP_THRESHOLD("ReloadCapThreshold"),
    @XmlEnumValue("AllowedDeliveryDays")
    ALLOWED_DELIVERY_DAYS("AllowedDeliveryDays"),
    @XmlEnumValue("Filter")
    FILTER("Filter"),
    @XmlEnumValue("TimeOfDay")
    TIME_OF_DAY("TimeOfDay"),
    @XmlEnumValue("VehicleRestriction")
    VEHICLE_RESTRICTION("VehicleRestriction"),
    @XmlEnumValue("OrderBeginEndDate")
    ORDER_BEGIN_END_DATE("OrderBeginEndDate"),
    @XmlEnumValue("NoRoutes")
    NO_ROUTES("NoRoutes"),
    @XmlEnumValue("NoRemainingEquipment")
    NO_REMAINING_EQUIPMENT("NoRemainingEquipment"),
    @XmlEnumValue("TemplateResources")
    TEMPLATE_RESOURCES("TemplateResources"),
    @XmlEnumValue("OnlyTemplateRouting")
    ONLY_TEMPLATE_ROUTING("OnlyTemplateRouting"),
    @XmlEnumValue("OnlyCellRouting")
    ONLY_CELL_ROUTING("OnlyCellRouting"),
    @XmlEnumValue("CellRouteLimit")
    CELL_ROUTE_LIMIT("CellRouteLimit"),
    @XmlEnumValue("NoValidResourceAssignment")
    NO_VALID_RESOURCE_ASSIGNMENT("NoValidResourceAssignment"),
    @XmlEnumValue("RouteTemplateDeliveryDays")
    ROUTE_TEMPLATE_DELIVERY_DAYS("RouteTemplateDeliveryDays"),
    @XmlEnumValue("TargetRouteIsBuilt")
    TARGET_ROUTE_IS_BUILT("TargetRouteIsBuilt"),
    @XmlEnumValue("LocationNotGeocoded")
    LOCATION_NOT_GEOCODED("LocationNotGeocoded"),
    @XmlEnumValue("LocationDeleted")
    LOCATION_DELETED("LocationDeleted"),
    @XmlEnumValue("MaxTravelTime")
    MAX_TRAVEL_TIME("MaxTravelTime"),
    @XmlEnumValue("CompartmentCapacity")
    COMPARTMENT_CAPACITY("CompartmentCapacity"),
    @XmlEnumValue("NoMatchingCompartment")
    NO_MATCHING_COMPARTMENT("NoMatchingCompartment");
    private final String value;

    RoutingResultNotRoutedOrderResultNotRoutedOrderReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutingResultNotRoutedOrderResultNotRoutedOrderReason fromValue(String v) {
        for (RoutingResultNotRoutedOrderResultNotRoutedOrderReason c: RoutingResultNotRoutedOrderResultNotRoutedOrderReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
