
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Report.ReportType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Report.ReportType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *     &lt;enumeration value="ActualVersusPlanned"/&gt;
 *     &lt;enumeration value="DistanceByJurisdiction"/&gt;
 *     &lt;enumeration value="DriverManifest"/&gt;
 *     &lt;enumeration value="DriverPerformance"/&gt;
 *     &lt;enumeration value="KeyPerformanceIndicator"/&gt;
 *     &lt;enumeration value="LessThanMinimum"/&gt;
 *     &lt;enumeration value="LocationDeliveryCost"/&gt;
 *     &lt;enumeration value="LocationStatistics"/&gt;
 *     &lt;enumeration value="OffDayDelivery"/&gt;
 *     &lt;enumeration value="DailyOperations"/&gt;
 *     &lt;enumeration value="RouteExceptions"/&gt;
 *     &lt;enumeration value="RouteMetrics"/&gt;
 *     &lt;enumeration value="RouteSummaryStatistics"/&gt;
 *     &lt;enumeration value="RouteTemplate"/&gt;
 *     &lt;enumeration value="StopList"/&gt;
 *     &lt;enumeration value="TimeWindowExceptions"/&gt;
 *     &lt;enumeration value="TimeWindowOverride"/&gt;
 *     &lt;enumeration value="SalesLocation"/&gt;
 *     &lt;enumeration value="DriverSummary"/&gt;
 *     &lt;enumeration value="RouteSummary"/&gt;
 *     &lt;enumeration value="SimpleStopList"/&gt;
 *     &lt;enumeration value="KpiOperations"/&gt;
 *     &lt;enumeration value="ActualStopList"/&gt;
 *     &lt;enumeration value="ServiceDetail"/&gt;
 *     &lt;enumeration value="RouteDelay"/&gt;
 *     &lt;enumeration value="OnTimeService"/&gt;
 *     &lt;enumeration value="Idling"/&gt;
 *     &lt;enumeration value="Speeding"/&gt;
 *     &lt;enumeration value="HarshDriving"/&gt;
 *     &lt;enumeration value="RestrictedLocations"/&gt;
 *     &lt;enumeration value="DeviceCommunications"/&gt;
 *     &lt;enumeration value="RestrictedDriving"/&gt;
 *     &lt;enumeration value="CustomFormResults"/&gt;
 *     &lt;enumeration value="DeliveryDetail"/&gt;
 *     &lt;enumeration value="LocationProfitability"/&gt;
 *     &lt;enumeration value="EquipmentUtilization"/&gt;
 *     &lt;enumeration value="EquipmentPosition"/&gt;
 *     &lt;enumeration value="CustomFormDetail"/&gt;
 *     &lt;enumeration value="DriverAmPm"/&gt;
 *     &lt;enumeration value="DriverTimeClock"/&gt;
 *     &lt;enumeration value="DriverPerformanceExtended"/&gt;
 *     &lt;enumeration value="ActiveDiagnosticTroubleCodesReport"/&gt;
 *     &lt;enumeration value="DiagnosticTroubleCodeHistoryReport"/&gt;
 *     &lt;enumeration value="StrategicSessionSummary"/&gt;
 *     &lt;enumeration value="HOSDriverLogReport"/&gt;
 *     &lt;enumeration value="HOSDriverLogSummary"/&gt;
 *     &lt;enumeration value="HOSPaperLogMode"/&gt;
 *     &lt;enumeration value="HOSAvailableTimeReport"/&gt;
 *     &lt;enumeration value="HOSDriverLogEditSummary"/&gt;
 *     &lt;enumeration value="HOSDriverLogEditDetail"/&gt;
 *     &lt;enumeration value="HOSViolationsSummary"/&gt;
 *     &lt;enumeration value="HOSViolationsSummaryByDriver"/&gt;
 *     &lt;enumeration value="HOSViolationsDetail"/&gt;
 *     &lt;enumeration value="DVIRInspectionSummary"/&gt;
 *     &lt;enumeration value="DVIRInspectionDetail"/&gt;
 *     &lt;enumeration value="DVIRInspectionForm"/&gt;
 *     &lt;enumeration value="HOSPersonalConveyanceSummary"/&gt;
 *     &lt;enumeration value="HOSPersonalConveyanceDetail"/&gt;
 *     &lt;enumeration value="HOSSensorFailureSummary"/&gt;
 *     &lt;enumeration value="HOSSensorFailureDetail"/&gt;
 *     &lt;enumeration value="PerformanceIdleReport"/&gt;
 *     &lt;enumeration value="PerformanceAlertReport"/&gt;
 *     &lt;enumeration value="PerformanceBlackBoxReport"/&gt;
 *     &lt;enumeration value="PerformanceFaultCodeReport"/&gt;
 *     &lt;enumeration value="PerformanceOperationSummary"/&gt;
 *     &lt;enumeration value="PerformanceOperationProfileAnalysis"/&gt;
 *     &lt;enumeration value="DriverDelayDetail"/&gt;
 *     &lt;enumeration value="IFTADistanceByJurisdictionReport"/&gt;
 *     &lt;enumeration value="IFTADistanceDiscrepancyReport"/&gt;
 *     &lt;enumeration value="IFTAFleetReport"/&gt;
 *     &lt;enumeration value="IFTAFuelByJurisdictionReport"/&gt;
 *     &lt;enumeration value="IFTAFuelDetailReport"/&gt;
 *     &lt;enumeration value="IFTAFuelEfficiencyReport"/&gt;
 *     &lt;enumeration value="IFTAJurisdictionCrossingReport"/&gt;
 *     &lt;enumeration value="IFTAReconciliationReport"/&gt;
 *     &lt;enumeration value="IFTAFuelFileTracking"/&gt;
 *     &lt;enumeration value="IFTAOfficialReports"/&gt;
 *     &lt;enumeration value="UpcomingEquipmentMaintenanceReport"/&gt;
 *     &lt;enumeration value="SimpleActualStopList"/&gt;
 *     &lt;enumeration value="PanicButton"/&gt;
 *     &lt;enumeration value="HOSDiagnosticAndMalfunctionSummary"/&gt;
 *     &lt;enumeration value="HOSDiagnosticAndMalfunctionDetail"/&gt;
 *     &lt;enumeration value="HOSELDDriverLog"/&gt;
 *     &lt;enumeration value="HOSELDErodsExtract"/&gt;
 *     &lt;enumeration value="RemoteShutdown"/&gt;
 *     &lt;enumeration value="OperationProfile"/&gt;
 *     &lt;enumeration value="DistanceByJurisdictionExcel"/&gt;
 *     &lt;enumeration value="HOSPendingEditsDetails"/&gt;
 *     &lt;enumeration value="HOSPendingEditsSummary"/&gt;
 *     &lt;enumeration value="HOSRejectedEditsDetails"/&gt;
 *     &lt;enumeration value="HOSRejectedEditsSummary"/&gt;
 *     &lt;enumeration value="RelayInventoryStatus"/&gt;
 *     &lt;enumeration value="SpeedRpmMatrix"/&gt;
 *     &lt;enumeration value="TerritoryStopList"/&gt;
 *     &lt;enumeration value="RerouteAnalysis"/&gt;
 *     &lt;enumeration value="HOSSpecialDrivingConditions"/&gt;
 *     &lt;enumeration value="HOSDriverPayrollSummary"/&gt;
 *     &lt;enumeration value="TelematicsDiagnostics"/&gt;
 *     &lt;enumeration value="StrategicPlannerSessionAnalysis"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Report.ReportType")
@XmlEnum
public enum ReportReportType {

    @XmlEnumValue("Custom")
    CUSTOM("Custom"),
    @XmlEnumValue("ActualVersusPlanned")
    ACTUAL_VERSUS_PLANNED("ActualVersusPlanned"),
    @XmlEnumValue("DistanceByJurisdiction")
    DISTANCE_BY_JURISDICTION("DistanceByJurisdiction"),
    @XmlEnumValue("DriverManifest")
    DRIVER_MANIFEST("DriverManifest"),
    @XmlEnumValue("DriverPerformance")
    DRIVER_PERFORMANCE("DriverPerformance"),
    @XmlEnumValue("KeyPerformanceIndicator")
    KEY_PERFORMANCE_INDICATOR("KeyPerformanceIndicator"),
    @XmlEnumValue("LessThanMinimum")
    LESS_THAN_MINIMUM("LessThanMinimum"),
    @XmlEnumValue("LocationDeliveryCost")
    LOCATION_DELIVERY_COST("LocationDeliveryCost"),
    @XmlEnumValue("LocationStatistics")
    LOCATION_STATISTICS("LocationStatistics"),
    @XmlEnumValue("OffDayDelivery")
    OFF_DAY_DELIVERY("OffDayDelivery"),
    @XmlEnumValue("DailyOperations")
    DAILY_OPERATIONS("DailyOperations"),
    @XmlEnumValue("RouteExceptions")
    ROUTE_EXCEPTIONS("RouteExceptions"),
    @XmlEnumValue("RouteMetrics")
    ROUTE_METRICS("RouteMetrics"),
    @XmlEnumValue("RouteSummaryStatistics")
    ROUTE_SUMMARY_STATISTICS("RouteSummaryStatistics"),
    @XmlEnumValue("RouteTemplate")
    ROUTE_TEMPLATE("RouteTemplate"),
    @XmlEnumValue("StopList")
    STOP_LIST("StopList"),
    @XmlEnumValue("TimeWindowExceptions")
    TIME_WINDOW_EXCEPTIONS("TimeWindowExceptions"),
    @XmlEnumValue("TimeWindowOverride")
    TIME_WINDOW_OVERRIDE("TimeWindowOverride"),
    @XmlEnumValue("SalesLocation")
    SALES_LOCATION("SalesLocation"),
    @XmlEnumValue("DriverSummary")
    DRIVER_SUMMARY("DriverSummary"),
    @XmlEnumValue("RouteSummary")
    ROUTE_SUMMARY("RouteSummary"),
    @XmlEnumValue("SimpleStopList")
    SIMPLE_STOP_LIST("SimpleStopList"),
    @XmlEnumValue("KpiOperations")
    KPI_OPERATIONS("KpiOperations"),
    @XmlEnumValue("ActualStopList")
    ACTUAL_STOP_LIST("ActualStopList"),
    @XmlEnumValue("ServiceDetail")
    SERVICE_DETAIL("ServiceDetail"),
    @XmlEnumValue("RouteDelay")
    ROUTE_DELAY("RouteDelay"),
    @XmlEnumValue("OnTimeService")
    ON_TIME_SERVICE("OnTimeService"),
    @XmlEnumValue("Idling")
    IDLING("Idling"),
    @XmlEnumValue("Speeding")
    SPEEDING("Speeding"),
    @XmlEnumValue("HarshDriving")
    HARSH_DRIVING("HarshDriving"),
    @XmlEnumValue("RestrictedLocations")
    RESTRICTED_LOCATIONS("RestrictedLocations"),
    @XmlEnumValue("DeviceCommunications")
    DEVICE_COMMUNICATIONS("DeviceCommunications"),
    @XmlEnumValue("RestrictedDriving")
    RESTRICTED_DRIVING("RestrictedDriving"),
    @XmlEnumValue("CustomFormResults")
    CUSTOM_FORM_RESULTS("CustomFormResults"),
    @XmlEnumValue("DeliveryDetail")
    DELIVERY_DETAIL("DeliveryDetail"),
    @XmlEnumValue("LocationProfitability")
    LOCATION_PROFITABILITY("LocationProfitability"),
    @XmlEnumValue("EquipmentUtilization")
    EQUIPMENT_UTILIZATION("EquipmentUtilization"),
    @XmlEnumValue("EquipmentPosition")
    EQUIPMENT_POSITION("EquipmentPosition"),
    @XmlEnumValue("CustomFormDetail")
    CUSTOM_FORM_DETAIL("CustomFormDetail"),
    @XmlEnumValue("DriverAmPm")
    DRIVER_AM_PM("DriverAmPm"),
    @XmlEnumValue("DriverTimeClock")
    DRIVER_TIME_CLOCK("DriverTimeClock"),
    @XmlEnumValue("DriverPerformanceExtended")
    DRIVER_PERFORMANCE_EXTENDED("DriverPerformanceExtended"),
    @XmlEnumValue("ActiveDiagnosticTroubleCodesReport")
    ACTIVE_DIAGNOSTIC_TROUBLE_CODES_REPORT("ActiveDiagnosticTroubleCodesReport"),
    @XmlEnumValue("DiagnosticTroubleCodeHistoryReport")
    DIAGNOSTIC_TROUBLE_CODE_HISTORY_REPORT("DiagnosticTroubleCodeHistoryReport"),
    @XmlEnumValue("StrategicSessionSummary")
    STRATEGIC_SESSION_SUMMARY("StrategicSessionSummary"),
    @XmlEnumValue("HOSDriverLogReport")
    HOS_DRIVER_LOG_REPORT("HOSDriverLogReport"),
    @XmlEnumValue("HOSDriverLogSummary")
    HOS_DRIVER_LOG_SUMMARY("HOSDriverLogSummary"),
    @XmlEnumValue("HOSPaperLogMode")
    HOS_PAPER_LOG_MODE("HOSPaperLogMode"),
    @XmlEnumValue("HOSAvailableTimeReport")
    HOS_AVAILABLE_TIME_REPORT("HOSAvailableTimeReport"),
    @XmlEnumValue("HOSDriverLogEditSummary")
    HOS_DRIVER_LOG_EDIT_SUMMARY("HOSDriverLogEditSummary"),
    @XmlEnumValue("HOSDriverLogEditDetail")
    HOS_DRIVER_LOG_EDIT_DETAIL("HOSDriverLogEditDetail"),
    @XmlEnumValue("HOSViolationsSummary")
    HOS_VIOLATIONS_SUMMARY("HOSViolationsSummary"),
    @XmlEnumValue("HOSViolationsSummaryByDriver")
    HOS_VIOLATIONS_SUMMARY_BY_DRIVER("HOSViolationsSummaryByDriver"),
    @XmlEnumValue("HOSViolationsDetail")
    HOS_VIOLATIONS_DETAIL("HOSViolationsDetail"),
    @XmlEnumValue("DVIRInspectionSummary")
    DVIR_INSPECTION_SUMMARY("DVIRInspectionSummary"),
    @XmlEnumValue("DVIRInspectionDetail")
    DVIR_INSPECTION_DETAIL("DVIRInspectionDetail"),
    @XmlEnumValue("DVIRInspectionForm")
    DVIR_INSPECTION_FORM("DVIRInspectionForm"),
    @XmlEnumValue("HOSPersonalConveyanceSummary")
    HOS_PERSONAL_CONVEYANCE_SUMMARY("HOSPersonalConveyanceSummary"),
    @XmlEnumValue("HOSPersonalConveyanceDetail")
    HOS_PERSONAL_CONVEYANCE_DETAIL("HOSPersonalConveyanceDetail"),
    @XmlEnumValue("HOSSensorFailureSummary")
    HOS_SENSOR_FAILURE_SUMMARY("HOSSensorFailureSummary"),
    @XmlEnumValue("HOSSensorFailureDetail")
    HOS_SENSOR_FAILURE_DETAIL("HOSSensorFailureDetail"),
    @XmlEnumValue("PerformanceIdleReport")
    PERFORMANCE_IDLE_REPORT("PerformanceIdleReport"),
    @XmlEnumValue("PerformanceAlertReport")
    PERFORMANCE_ALERT_REPORT("PerformanceAlertReport"),
    @XmlEnumValue("PerformanceBlackBoxReport")
    PERFORMANCE_BLACK_BOX_REPORT("PerformanceBlackBoxReport"),
    @XmlEnumValue("PerformanceFaultCodeReport")
    PERFORMANCE_FAULT_CODE_REPORT("PerformanceFaultCodeReport"),
    @XmlEnumValue("PerformanceOperationSummary")
    PERFORMANCE_OPERATION_SUMMARY("PerformanceOperationSummary"),
    @XmlEnumValue("PerformanceOperationProfileAnalysis")
    PERFORMANCE_OPERATION_PROFILE_ANALYSIS("PerformanceOperationProfileAnalysis"),
    @XmlEnumValue("DriverDelayDetail")
    DRIVER_DELAY_DETAIL("DriverDelayDetail"),
    @XmlEnumValue("IFTADistanceByJurisdictionReport")
    IFTA_DISTANCE_BY_JURISDICTION_REPORT("IFTADistanceByJurisdictionReport"),
    @XmlEnumValue("IFTADistanceDiscrepancyReport")
    IFTA_DISTANCE_DISCREPANCY_REPORT("IFTADistanceDiscrepancyReport"),
    @XmlEnumValue("IFTAFleetReport")
    IFTA_FLEET_REPORT("IFTAFleetReport"),
    @XmlEnumValue("IFTAFuelByJurisdictionReport")
    IFTA_FUEL_BY_JURISDICTION_REPORT("IFTAFuelByJurisdictionReport"),
    @XmlEnumValue("IFTAFuelDetailReport")
    IFTA_FUEL_DETAIL_REPORT("IFTAFuelDetailReport"),
    @XmlEnumValue("IFTAFuelEfficiencyReport")
    IFTA_FUEL_EFFICIENCY_REPORT("IFTAFuelEfficiencyReport"),
    @XmlEnumValue("IFTAJurisdictionCrossingReport")
    IFTA_JURISDICTION_CROSSING_REPORT("IFTAJurisdictionCrossingReport"),
    @XmlEnumValue("IFTAReconciliationReport")
    IFTA_RECONCILIATION_REPORT("IFTAReconciliationReport"),
    @XmlEnumValue("IFTAFuelFileTracking")
    IFTA_FUEL_FILE_TRACKING("IFTAFuelFileTracking"),
    @XmlEnumValue("IFTAOfficialReports")
    IFTA_OFFICIAL_REPORTS("IFTAOfficialReports"),
    @XmlEnumValue("UpcomingEquipmentMaintenanceReport")
    UPCOMING_EQUIPMENT_MAINTENANCE_REPORT("UpcomingEquipmentMaintenanceReport"),
    @XmlEnumValue("SimpleActualStopList")
    SIMPLE_ACTUAL_STOP_LIST("SimpleActualStopList"),
    @XmlEnumValue("PanicButton")
    PANIC_BUTTON("PanicButton"),
    @XmlEnumValue("HOSDiagnosticAndMalfunctionSummary")
    HOS_DIAGNOSTIC_AND_MALFUNCTION_SUMMARY("HOSDiagnosticAndMalfunctionSummary"),
    @XmlEnumValue("HOSDiagnosticAndMalfunctionDetail")
    HOS_DIAGNOSTIC_AND_MALFUNCTION_DETAIL("HOSDiagnosticAndMalfunctionDetail"),
    @XmlEnumValue("HOSELDDriverLog")
    HOSELD_DRIVER_LOG("HOSELDDriverLog"),
    @XmlEnumValue("HOSELDErodsExtract")
    HOSELD_ERODS_EXTRACT("HOSELDErodsExtract"),
    @XmlEnumValue("RemoteShutdown")
    REMOTE_SHUTDOWN("RemoteShutdown"),
    @XmlEnumValue("OperationProfile")
    OPERATION_PROFILE("OperationProfile"),
    @XmlEnumValue("DistanceByJurisdictionExcel")
    DISTANCE_BY_JURISDICTION_EXCEL("DistanceByJurisdictionExcel"),
    @XmlEnumValue("HOSPendingEditsDetails")
    HOS_PENDING_EDITS_DETAILS("HOSPendingEditsDetails"),
    @XmlEnumValue("HOSPendingEditsSummary")
    HOS_PENDING_EDITS_SUMMARY("HOSPendingEditsSummary"),
    @XmlEnumValue("HOSRejectedEditsDetails")
    HOS_REJECTED_EDITS_DETAILS("HOSRejectedEditsDetails"),
    @XmlEnumValue("HOSRejectedEditsSummary")
    HOS_REJECTED_EDITS_SUMMARY("HOSRejectedEditsSummary"),
    @XmlEnumValue("RelayInventoryStatus")
    RELAY_INVENTORY_STATUS("RelayInventoryStatus"),
    @XmlEnumValue("SpeedRpmMatrix")
    SPEED_RPM_MATRIX("SpeedRpmMatrix"),
    @XmlEnumValue("TerritoryStopList")
    TERRITORY_STOP_LIST("TerritoryStopList"),
    @XmlEnumValue("RerouteAnalysis")
    REROUTE_ANALYSIS("RerouteAnalysis"),
    @XmlEnumValue("HOSSpecialDrivingConditions")
    HOS_SPECIAL_DRIVING_CONDITIONS("HOSSpecialDrivingConditions"),
    @XmlEnumValue("HOSDriverPayrollSummary")
    HOS_DRIVER_PAYROLL_SUMMARY("HOSDriverPayrollSummary"),
    @XmlEnumValue("TelematicsDiagnostics")
    TELEMATICS_DIAGNOSTICS("TelematicsDiagnostics"),
    @XmlEnumValue("StrategicPlannerSessionAnalysis")
    STRATEGIC_PLANNER_SESSION_ANALYSIS("StrategicPlannerSessionAnalysis");
    private final String value;

    ReportReportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportReportType fromValue(String v) {
        for (ReportReportType c: ReportReportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
