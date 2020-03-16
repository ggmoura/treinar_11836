
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PurchasableFeaturesEx.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchasableFeaturesEx"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="AdvancedInteractiveGeocoder"/&gt;
 *     &lt;enumeration value="AdvancedMapEditing"/&gt;
 *     &lt;enumeration value="TravelRulesHistoricalSpeeds"/&gt;
 *     &lt;enumeration value="TravelRulesRestrictedAreas"/&gt;
 *     &lt;enumeration value="TravelRulesCustomizeableRushHourArea"/&gt;
 *     &lt;enumeration value="TravelRulesHeightAndWeightRestrictions"/&gt;
 *     &lt;enumeration value="AdditionalBusinessUnitAndRegionCapability"/&gt;
 *     &lt;enumeration value="AdvancedUserSecurity"/&gt;
 *     &lt;enumeration value="CustomProperties"/&gt;
 *     &lt;enumeration value="AdvancedRulesBasedExceptions"/&gt;
 *     &lt;enumeration value="ServiceTimeUpdater"/&gt;
 *     &lt;enumeration value="AdvancedMobileFeatures"/&gt;
 *     &lt;enumeration value="AdvancedRoutingReloads"/&gt;
 *     &lt;enumeration value="AdvancedRoutingOrderLocking"/&gt;
 *     &lt;enumeration value="AdvancedRoutingCellRouting"/&gt;
 *     &lt;enumeration value="AdvancedRoutingTemplateRoutingWithDynamicOrders"/&gt;
 *     &lt;enumeration value="AdvancedRoutingRoutingGoals"/&gt;
 *     &lt;enumeration value="AdvancedRoutingOptimizeRoutes"/&gt;
 *     &lt;enumeration value="AdvancedRoutingSequenceWithNonePassGoals"/&gt;
 *     &lt;enumeration value="AdvancedRoutingHelper"/&gt;
 *     &lt;enumeration value="AdvancedRoutingMeetTimeWindows"/&gt;
 *     &lt;enumeration value="AdvancedRoutingPriorityStops"/&gt;
 *     &lt;enumeration value="AdvancedRoutingEquipmentRestrictions"/&gt;
 *     &lt;enumeration value="AdvancedRoutingSpeedAssign"/&gt;
 *     &lt;enumeration value="AdvancedRoutingRouteAlerts"/&gt;
 *     &lt;enumeration value="WebServiceIntegration"/&gt;
 *     &lt;enumeration value="AdvancedRoutingUseEquivalence"/&gt;
 *     &lt;enumeration value="AdvancedRoutingLastStopIsDestination"/&gt;
 *     &lt;enumeration value="AdvancedRoutingSameSideStreetRouting"/&gt;
 *     &lt;enumeration value="EnableLineItems"/&gt;
 *     &lt;enumeration value="AdvancedRoutingLimitStopsOnRoute"/&gt;
 *     &lt;enumeration value="AdvancedRoutingMultiRouter"/&gt;
 *     &lt;enumeration value="AdvancedRoutingServiceWaitTime"/&gt;
 *     &lt;enumeration value="AdvancedRoutingPreferredRouteId"/&gt;
 *     &lt;enumeration value="AdvancedRoutingRouteMinimums"/&gt;
 *     &lt;enumeration value="AdvancedRoutingRealtimeTraffic"/&gt;
 *     &lt;enumeration value="AdvancedRoutingFilterCriteria"/&gt;
 *     &lt;enumeration value="InsightRouting"/&gt;
 *     &lt;enumeration value="InsightDispatch"/&gt;
 *     &lt;enumeration value="InsightTelematics"/&gt;
 *     &lt;enumeration value="InsightEnterprise"/&gt;
 *     &lt;enumeration value="BasicRoutingForDispatchTelematics"/&gt;
 *     &lt;enumeration value="AdvancedStopAnalyzer"/&gt;
 *     &lt;enumeration value="ServicePatternAnalyzer"/&gt;
 *     &lt;enumeration value="AutoArriveDepart"/&gt;
 *     &lt;enumeration value="SignatureCapture"/&gt;
 *     &lt;enumeration value="Scanning"/&gt;
 *     &lt;enumeration value="PictureNotes"/&gt;
 *     &lt;enumeration value="MobileForms"/&gt;
 *     &lt;enumeration value="AddServiceableStops"/&gt;
 *     &lt;enumeration value="ManualRouting"/&gt;
 *     &lt;enumeration value="InsightExport"/&gt;
 *     &lt;enumeration value="TelematicsSecurity"/&gt;
 *     &lt;enumeration value="InsightDataDiscovery"/&gt;
 *     &lt;enumeration value="InsightScorecard"/&gt;
 *     &lt;enumeration value="NavistarIntegration"/&gt;
 *     &lt;enumeration value="OptimalMetricsForDispatchTelematics"/&gt;
 *     &lt;enumeration value="LegacyComplianceReports"/&gt;
 *     &lt;enumeration value="EquipmentMaintenancePlanning"/&gt;
 *     &lt;enumeration value="RouteSharing"/&gt;
 *     &lt;enumeration value="AmPmReport"/&gt;
 *     &lt;enumeration value="ExternalDataFeed"/&gt;
 *     &lt;enumeration value="NavigationPlus"/&gt;
 *     &lt;enumeration value="SingleSignOn"/&gt;
 *     &lt;enumeration value="PerformanceMonitoring"/&gt;
 *     &lt;enumeration value="OCMNotifications"/&gt;
 *     &lt;enumeration value="PanicButton"/&gt;
 *     &lt;enumeration value="IgnitionKillSwitch"/&gt;
 *     &lt;enumeration value="EngineDeratingDevice"/&gt;
 *     &lt;enumeration value="ActiveAlertSmsNotifications"/&gt;
 *     &lt;enumeration value="ActiveAlertEmailNotifications"/&gt;
 *     &lt;enumeration value="DtcMonitoring"/&gt;
 *     &lt;enumeration value="CriticalEventVideo"/&gt;
 *     &lt;enumeration value="InsightNavigation"/&gt;
 *     &lt;enumeration value="CriticalEventReporting"/&gt;
 *     &lt;enumeration value="TelematicsSatelliteCommunicationsSupport"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchasableFeaturesEx")
@XmlEnum
public enum PurchasableFeaturesEx {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("AdvancedInteractiveGeocoder")
    ADVANCED_INTERACTIVE_GEOCODER("AdvancedInteractiveGeocoder"),
    @XmlEnumValue("AdvancedMapEditing")
    ADVANCED_MAP_EDITING("AdvancedMapEditing"),
    @XmlEnumValue("TravelRulesHistoricalSpeeds")
    TRAVEL_RULES_HISTORICAL_SPEEDS("TravelRulesHistoricalSpeeds"),
    @XmlEnumValue("TravelRulesRestrictedAreas")
    TRAVEL_RULES_RESTRICTED_AREAS("TravelRulesRestrictedAreas"),
    @XmlEnumValue("TravelRulesCustomizeableRushHourArea")
    TRAVEL_RULES_CUSTOMIZEABLE_RUSH_HOUR_AREA("TravelRulesCustomizeableRushHourArea"),
    @XmlEnumValue("TravelRulesHeightAndWeightRestrictions")
    TRAVEL_RULES_HEIGHT_AND_WEIGHT_RESTRICTIONS("TravelRulesHeightAndWeightRestrictions"),
    @XmlEnumValue("AdditionalBusinessUnitAndRegionCapability")
    ADDITIONAL_BUSINESS_UNIT_AND_REGION_CAPABILITY("AdditionalBusinessUnitAndRegionCapability"),
    @XmlEnumValue("AdvancedUserSecurity")
    ADVANCED_USER_SECURITY("AdvancedUserSecurity"),
    @XmlEnumValue("CustomProperties")
    CUSTOM_PROPERTIES("CustomProperties"),
    @XmlEnumValue("AdvancedRulesBasedExceptions")
    ADVANCED_RULES_BASED_EXCEPTIONS("AdvancedRulesBasedExceptions"),
    @XmlEnumValue("ServiceTimeUpdater")
    SERVICE_TIME_UPDATER("ServiceTimeUpdater"),
    @XmlEnumValue("AdvancedMobileFeatures")
    ADVANCED_MOBILE_FEATURES("AdvancedMobileFeatures"),
    @XmlEnumValue("AdvancedRoutingReloads")
    ADVANCED_ROUTING_RELOADS("AdvancedRoutingReloads"),
    @XmlEnumValue("AdvancedRoutingOrderLocking")
    ADVANCED_ROUTING_ORDER_LOCKING("AdvancedRoutingOrderLocking"),
    @XmlEnumValue("AdvancedRoutingCellRouting")
    ADVANCED_ROUTING_CELL_ROUTING("AdvancedRoutingCellRouting"),
    @XmlEnumValue("AdvancedRoutingTemplateRoutingWithDynamicOrders")
    ADVANCED_ROUTING_TEMPLATE_ROUTING_WITH_DYNAMIC_ORDERS("AdvancedRoutingTemplateRoutingWithDynamicOrders"),
    @XmlEnumValue("AdvancedRoutingRoutingGoals")
    ADVANCED_ROUTING_ROUTING_GOALS("AdvancedRoutingRoutingGoals"),
    @XmlEnumValue("AdvancedRoutingOptimizeRoutes")
    ADVANCED_ROUTING_OPTIMIZE_ROUTES("AdvancedRoutingOptimizeRoutes"),
    @XmlEnumValue("AdvancedRoutingSequenceWithNonePassGoals")
    ADVANCED_ROUTING_SEQUENCE_WITH_NONE_PASS_GOALS("AdvancedRoutingSequenceWithNonePassGoals"),
    @XmlEnumValue("AdvancedRoutingHelper")
    ADVANCED_ROUTING_HELPER("AdvancedRoutingHelper"),
    @XmlEnumValue("AdvancedRoutingMeetTimeWindows")
    ADVANCED_ROUTING_MEET_TIME_WINDOWS("AdvancedRoutingMeetTimeWindows"),
    @XmlEnumValue("AdvancedRoutingPriorityStops")
    ADVANCED_ROUTING_PRIORITY_STOPS("AdvancedRoutingPriorityStops"),
    @XmlEnumValue("AdvancedRoutingEquipmentRestrictions")
    ADVANCED_ROUTING_EQUIPMENT_RESTRICTIONS("AdvancedRoutingEquipmentRestrictions"),
    @XmlEnumValue("AdvancedRoutingSpeedAssign")
    ADVANCED_ROUTING_SPEED_ASSIGN("AdvancedRoutingSpeedAssign"),
    @XmlEnumValue("AdvancedRoutingRouteAlerts")
    ADVANCED_ROUTING_ROUTE_ALERTS("AdvancedRoutingRouteAlerts"),
    @XmlEnumValue("WebServiceIntegration")
    WEB_SERVICE_INTEGRATION("WebServiceIntegration"),
    @XmlEnumValue("AdvancedRoutingUseEquivalence")
    ADVANCED_ROUTING_USE_EQUIVALENCE("AdvancedRoutingUseEquivalence"),
    @XmlEnumValue("AdvancedRoutingLastStopIsDestination")
    ADVANCED_ROUTING_LAST_STOP_IS_DESTINATION("AdvancedRoutingLastStopIsDestination"),
    @XmlEnumValue("AdvancedRoutingSameSideStreetRouting")
    ADVANCED_ROUTING_SAME_SIDE_STREET_ROUTING("AdvancedRoutingSameSideStreetRouting"),
    @XmlEnumValue("EnableLineItems")
    ENABLE_LINE_ITEMS("EnableLineItems"),
    @XmlEnumValue("AdvancedRoutingLimitStopsOnRoute")
    ADVANCED_ROUTING_LIMIT_STOPS_ON_ROUTE("AdvancedRoutingLimitStopsOnRoute"),
    @XmlEnumValue("AdvancedRoutingMultiRouter")
    ADVANCED_ROUTING_MULTI_ROUTER("AdvancedRoutingMultiRouter"),
    @XmlEnumValue("AdvancedRoutingServiceWaitTime")
    ADVANCED_ROUTING_SERVICE_WAIT_TIME("AdvancedRoutingServiceWaitTime"),
    @XmlEnumValue("AdvancedRoutingPreferredRouteId")
    ADVANCED_ROUTING_PREFERRED_ROUTE_ID("AdvancedRoutingPreferredRouteId"),
    @XmlEnumValue("AdvancedRoutingRouteMinimums")
    ADVANCED_ROUTING_ROUTE_MINIMUMS("AdvancedRoutingRouteMinimums"),
    @XmlEnumValue("AdvancedRoutingRealtimeTraffic")
    ADVANCED_ROUTING_REALTIME_TRAFFIC("AdvancedRoutingRealtimeTraffic"),
    @XmlEnumValue("AdvancedRoutingFilterCriteria")
    ADVANCED_ROUTING_FILTER_CRITERIA("AdvancedRoutingFilterCriteria"),
    @XmlEnumValue("InsightRouting")
    INSIGHT_ROUTING("InsightRouting"),
    @XmlEnumValue("InsightDispatch")
    INSIGHT_DISPATCH("InsightDispatch"),
    @XmlEnumValue("InsightTelematics")
    INSIGHT_TELEMATICS("InsightTelematics"),
    @XmlEnumValue("InsightEnterprise")
    INSIGHT_ENTERPRISE("InsightEnterprise"),
    @XmlEnumValue("BasicRoutingForDispatchTelematics")
    BASIC_ROUTING_FOR_DISPATCH_TELEMATICS("BasicRoutingForDispatchTelematics"),
    @XmlEnumValue("AdvancedStopAnalyzer")
    ADVANCED_STOP_ANALYZER("AdvancedStopAnalyzer"),
    @XmlEnumValue("ServicePatternAnalyzer")
    SERVICE_PATTERN_ANALYZER("ServicePatternAnalyzer"),
    @XmlEnumValue("AutoArriveDepart")
    AUTO_ARRIVE_DEPART("AutoArriveDepart"),
    @XmlEnumValue("SignatureCapture")
    SIGNATURE_CAPTURE("SignatureCapture"),
    @XmlEnumValue("Scanning")
    SCANNING("Scanning"),
    @XmlEnumValue("PictureNotes")
    PICTURE_NOTES("PictureNotes"),
    @XmlEnumValue("MobileForms")
    MOBILE_FORMS("MobileForms"),
    @XmlEnumValue("AddServiceableStops")
    ADD_SERVICEABLE_STOPS("AddServiceableStops"),
    @XmlEnumValue("ManualRouting")
    MANUAL_ROUTING("ManualRouting"),
    @XmlEnumValue("InsightExport")
    INSIGHT_EXPORT("InsightExport"),
    @XmlEnumValue("TelematicsSecurity")
    TELEMATICS_SECURITY("TelematicsSecurity"),
    @XmlEnumValue("InsightDataDiscovery")
    INSIGHT_DATA_DISCOVERY("InsightDataDiscovery"),
    @XmlEnumValue("InsightScorecard")
    INSIGHT_SCORECARD("InsightScorecard"),
    @XmlEnumValue("NavistarIntegration")
    NAVISTAR_INTEGRATION("NavistarIntegration"),
    @XmlEnumValue("OptimalMetricsForDispatchTelematics")
    OPTIMAL_METRICS_FOR_DISPATCH_TELEMATICS("OptimalMetricsForDispatchTelematics"),
    @XmlEnumValue("LegacyComplianceReports")
    LEGACY_COMPLIANCE_REPORTS("LegacyComplianceReports"),
    @XmlEnumValue("EquipmentMaintenancePlanning")
    EQUIPMENT_MAINTENANCE_PLANNING("EquipmentMaintenancePlanning"),
    @XmlEnumValue("RouteSharing")
    ROUTE_SHARING("RouteSharing"),
    @XmlEnumValue("AmPmReport")
    AM_PM_REPORT("AmPmReport"),
    @XmlEnumValue("ExternalDataFeed")
    EXTERNAL_DATA_FEED("ExternalDataFeed"),
    @XmlEnumValue("NavigationPlus")
    NAVIGATION_PLUS("NavigationPlus"),
    @XmlEnumValue("SingleSignOn")
    SINGLE_SIGN_ON("SingleSignOn"),
    @XmlEnumValue("PerformanceMonitoring")
    PERFORMANCE_MONITORING("PerformanceMonitoring"),
    @XmlEnumValue("OCMNotifications")
    OCM_NOTIFICATIONS("OCMNotifications"),
    @XmlEnumValue("PanicButton")
    PANIC_BUTTON("PanicButton"),
    @XmlEnumValue("IgnitionKillSwitch")
    IGNITION_KILL_SWITCH("IgnitionKillSwitch"),
    @XmlEnumValue("EngineDeratingDevice")
    ENGINE_DERATING_DEVICE("EngineDeratingDevice"),
    @XmlEnumValue("ActiveAlertSmsNotifications")
    ACTIVE_ALERT_SMS_NOTIFICATIONS("ActiveAlertSmsNotifications"),
    @XmlEnumValue("ActiveAlertEmailNotifications")
    ACTIVE_ALERT_EMAIL_NOTIFICATIONS("ActiveAlertEmailNotifications"),
    @XmlEnumValue("DtcMonitoring")
    DTC_MONITORING("DtcMonitoring"),
    @XmlEnumValue("CriticalEventVideo")
    CRITICAL_EVENT_VIDEO("CriticalEventVideo"),
    @XmlEnumValue("InsightNavigation")
    INSIGHT_NAVIGATION("InsightNavigation"),
    @XmlEnumValue("CriticalEventReporting")
    CRITICAL_EVENT_REPORTING("CriticalEventReporting"),
    @XmlEnumValue("TelematicsSatelliteCommunicationsSupport")
    TELEMATICS_SATELLITE_COMMUNICATIONS_SUPPORT("TelematicsSatelliteCommunicationsSupport");
    private final String value;

    PurchasableFeaturesEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchasableFeaturesEx fromValue(String v) {
        for (PurchasableFeaturesEx c: PurchasableFeaturesEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
