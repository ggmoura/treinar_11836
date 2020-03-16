
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Permission.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Permission"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CanEditMaps"/&gt;
 *     &lt;enumeration value="CanAccessConfidentialWorkerFields"/&gt;
 *     &lt;enumeration value="CanAccessConfidentialRegionFields"/&gt;
 *     &lt;enumeration value="CanModifyClientSharedPreferences"/&gt;
 *     &lt;enumeration value="CanUseRouteNavigator"/&gt;
 *     &lt;enumeration value="CanUseRIC"/&gt;
 *     &lt;enumeration value="CanUseInsight"/&gt;
 *     &lt;enumeration value="CanManageInsight"/&gt;
 *     &lt;enumeration value="CanAccessConfidentialInsightMeasures"/&gt;
 *     &lt;enumeration value="CanUseCompliance"/&gt;
 *     &lt;enumeration value="CanUseEnvision"/&gt;
 *     &lt;enumeration value="CanShutDownVehiclesRemotely"/&gt;
 *     &lt;enumeration value="CanManageRegionVisibility"/&gt;
 *     &lt;enumeration value="CanScheduleKpis"/&gt;
 *     &lt;enumeration value="CanSendKpiToNonUsers"/&gt;
 *     &lt;enumeration value="CanAccessCriticalEvents"/&gt;
 *     &lt;enumeration value="CanManageOperationalData"/&gt;
 *     &lt;enumeration value="CanManageModelingData"/&gt;
 *     &lt;enumeration value="CanUseRoadnetMobileManager"/&gt;
 *     &lt;enumeration value="CanUnlockStrategicRoutingSessions"/&gt;
 *     &lt;enumeration value="CanManageCamera"/&gt;
 *     &lt;enumeration value="CanRequestVideo"/&gt;
 *     &lt;enumeration value="CanRequestVideoExtension"/&gt;
 *     &lt;enumeration value="CanViewUserRequestedVideo"/&gt;
 *     &lt;enumeration value="CanViewCriticalEventVideo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Permission")
@XmlEnum
public enum Permission {

    @XmlEnumValue("CanEditMaps")
    CAN_EDIT_MAPS("CanEditMaps"),
    @XmlEnumValue("CanAccessConfidentialWorkerFields")
    CAN_ACCESS_CONFIDENTIAL_WORKER_FIELDS("CanAccessConfidentialWorkerFields"),
    @XmlEnumValue("CanAccessConfidentialRegionFields")
    CAN_ACCESS_CONFIDENTIAL_REGION_FIELDS("CanAccessConfidentialRegionFields"),
    @XmlEnumValue("CanModifyClientSharedPreferences")
    CAN_MODIFY_CLIENT_SHARED_PREFERENCES("CanModifyClientSharedPreferences"),
    @XmlEnumValue("CanUseRouteNavigator")
    CAN_USE_ROUTE_NAVIGATOR("CanUseRouteNavigator"),
    @XmlEnumValue("CanUseRIC")
    CAN_USE_RIC("CanUseRIC"),
    @XmlEnumValue("CanUseInsight")
    CAN_USE_INSIGHT("CanUseInsight"),
    @XmlEnumValue("CanManageInsight")
    CAN_MANAGE_INSIGHT("CanManageInsight"),
    @XmlEnumValue("CanAccessConfidentialInsightMeasures")
    CAN_ACCESS_CONFIDENTIAL_INSIGHT_MEASURES("CanAccessConfidentialInsightMeasures"),
    @XmlEnumValue("CanUseCompliance")
    CAN_USE_COMPLIANCE("CanUseCompliance"),
    @XmlEnumValue("CanUseEnvision")
    CAN_USE_ENVISION("CanUseEnvision"),
    @XmlEnumValue("CanShutDownVehiclesRemotely")
    CAN_SHUT_DOWN_VEHICLES_REMOTELY("CanShutDownVehiclesRemotely"),
    @XmlEnumValue("CanManageRegionVisibility")
    CAN_MANAGE_REGION_VISIBILITY("CanManageRegionVisibility"),
    @XmlEnumValue("CanScheduleKpis")
    CAN_SCHEDULE_KPIS("CanScheduleKpis"),
    @XmlEnumValue("CanSendKpiToNonUsers")
    CAN_SEND_KPI_TO_NON_USERS("CanSendKpiToNonUsers"),
    @XmlEnumValue("CanAccessCriticalEvents")
    CAN_ACCESS_CRITICAL_EVENTS("CanAccessCriticalEvents"),
    @XmlEnumValue("CanManageOperationalData")
    CAN_MANAGE_OPERATIONAL_DATA("CanManageOperationalData"),
    @XmlEnumValue("CanManageModelingData")
    CAN_MANAGE_MODELING_DATA("CanManageModelingData"),
    @XmlEnumValue("CanUseRoadnetMobileManager")
    CAN_USE_ROADNET_MOBILE_MANAGER("CanUseRoadnetMobileManager"),
    @XmlEnumValue("CanUnlockStrategicRoutingSessions")
    CAN_UNLOCK_STRATEGIC_ROUTING_SESSIONS("CanUnlockStrategicRoutingSessions"),
    @XmlEnumValue("CanManageCamera")
    CAN_MANAGE_CAMERA("CanManageCamera"),
    @XmlEnumValue("CanRequestVideo")
    CAN_REQUEST_VIDEO("CanRequestVideo"),
    @XmlEnumValue("CanRequestVideoExtension")
    CAN_REQUEST_VIDEO_EXTENSION("CanRequestVideoExtension"),
    @XmlEnumValue("CanViewUserRequestedVideo")
    CAN_VIEW_USER_REQUESTED_VIDEO("CanViewUserRequestedVideo"),
    @XmlEnumValue("CanViewCriticalEventVideo")
    CAN_VIEW_CRITICAL_EVENT_VIDEO("CanViewCriticalEventVideo");
    private final String value;

    Permission(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Permission fromValue(String v) {
        for (Permission c: Permission.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
