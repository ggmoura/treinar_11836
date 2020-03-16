
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RegionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RegionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcknowledgeRouteExceptionsOnArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AcknowledgeRouteNotesOnArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoArriveDepart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutonomousOptimization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BulkThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ChildRegionEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CombineOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceModuleEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CostOfFuel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DVIR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_BusinessWeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Defaults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Dispatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracyFlags_GeocodeAccuraciesRequiringAttention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Hos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Ifta" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsParentRegion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTopLevelComplianceRegion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverriddenProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentRegionDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Performance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionLevelEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedOperatingTimes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAlertOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Search" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRadius" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StationaryEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopAlertOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopTemplateAlertOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StreetSideTravelRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Telematics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimitToArchiveCompletedRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimitToArchivePlannedRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeSpanUnpaidBreakIsLayoverForHOS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixBuildRequestSenderEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixBuildStatus_TransitMatrixBuildStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixLastBuildCompleteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixLastBuildRequestSendTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixTimeOfDayToSendBuildRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelPathCalculator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseLineItemsToCalculateOrderSizes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseSingleFixedServiceTimeForSameCoordinateStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Video" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WarnBeforeDispatchingRouteWithNoEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WarnBeforeDispatchingRouteWithNoWorker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsOrganizationSid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionPropertyOptions", propOrder = {
    "acknowledgeRouteExceptionsOnArchive",
    "acknowledgeRouteNotesOnArchive",
    "autoArriveDepart",
    "autonomousOptimization",
    "bulkThreshold",
    "childRegionEntityKeys",
    "combineOrders",
    "complianceAddress",
    "complianceModuleEnabled",
    "costOfFuel",
    "dvir",
    "dayOfWeekFlagsBusinessWeek",
    "defaults",
    "description",
    "dispatch",
    "geocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention",
    "hos",
    "identifier",
    "ifta",
    "isDeleted",
    "isParentRegion",
    "isTopLevelComplianceRegion",
    "mobileDevice",
    "omnitracsNavigation",
    "overriddenProperties",
    "parentRegionDescription",
    "parentRegionEntityKey",
    "parentRegionIdentifier",
    "performance",
    "regionLevelEntityKey",
    "restrictedOperatingTimes",
    "routeAlertOptions",
    "routingSessions",
    "search",
    "serviceRadius",
    "stationaryEvent",
    "stopAlertOptions",
    "stopTemplateAlertOptions",
    "streetSideTravelRules",
    "telematics",
    "timeLimitToArchiveCompletedRoutes",
    "timeLimitToArchivePlannedRoutes",
    "timeSpanUnpaidBreakIsLayoverForHOS",
    "transitMatrixBuildRequestSenderEnabled",
    "transitMatrixBuildStatusTransitMatrixBuildStatus",
    "transitMatrixLastBuildCompleteTime",
    "transitMatrixLastBuildRequestSendTime",
    "transitMatrixTimeOfDayToSendBuildRequest",
    "travelPathCalculator",
    "useLineItemsToCalculateOrderSizes",
    "useSingleFixedServiceTimeForSameCoordinateStops",
    "video",
    "warnBeforeDispatchingRouteWithNoEquipment",
    "warnBeforeDispatchingRouteWithNoWorker",
    "xrsOrganizationSid"
})
public class RegionPropertyOptions
    extends BusinessUnitBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "AcknowledgeRouteExceptionsOnArchive")
    protected Boolean acknowledgeRouteExceptionsOnArchive;
    @XmlElement(name = "AcknowledgeRouteNotesOnArchive")
    protected Boolean acknowledgeRouteNotesOnArchive;
    @XmlElement(name = "AutoArriveDepart")
    protected Boolean autoArriveDepart;
    @XmlElement(name = "AutonomousOptimization")
    protected Boolean autonomousOptimization;
    @XmlElement(name = "BulkThreshold")
    protected Boolean bulkThreshold;
    @XmlElement(name = "ChildRegionEntityKeys")
    protected Boolean childRegionEntityKeys;
    @XmlElement(name = "CombineOrders")
    protected Boolean combineOrders;
    @XmlElement(name = "ComplianceAddress")
    protected Boolean complianceAddress;
    @XmlElement(name = "ComplianceModuleEnabled")
    protected Boolean complianceModuleEnabled;
    @XmlElement(name = "CostOfFuel")
    protected Boolean costOfFuel;
    @XmlElement(name = "DVIR")
    protected Boolean dvir;
    @XmlElement(name = "DayOfWeekFlags_BusinessWeek")
    protected Boolean dayOfWeekFlagsBusinessWeek;
    @XmlElement(name = "Defaults")
    protected Boolean defaults;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Dispatch")
    protected Boolean dispatch;
    @XmlElement(name = "GeocodeAccuracyFlags_GeocodeAccuraciesRequiringAttention")
    protected Boolean geocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention;
    @XmlElement(name = "Hos")
    protected Boolean hos;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "Ifta")
    protected Boolean ifta;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "IsParentRegion")
    protected Boolean isParentRegion;
    @XmlElement(name = "IsTopLevelComplianceRegion")
    protected Boolean isTopLevelComplianceRegion;
    @XmlElement(name = "MobileDevice")
    protected Boolean mobileDevice;
    @XmlElement(name = "OmnitracsNavigation")
    protected Boolean omnitracsNavigation;
    @XmlElement(name = "OverriddenProperties")
    protected Boolean overriddenProperties;
    @XmlElement(name = "ParentRegionDescription")
    protected Boolean parentRegionDescription;
    @XmlElement(name = "ParentRegionEntityKey")
    protected Boolean parentRegionEntityKey;
    @XmlElement(name = "ParentRegionIdentifier")
    protected Boolean parentRegionIdentifier;
    @XmlElement(name = "Performance")
    protected Boolean performance;
    @XmlElement(name = "RegionLevelEntityKey")
    protected Boolean regionLevelEntityKey;
    @XmlElement(name = "RestrictedOperatingTimes")
    protected Boolean restrictedOperatingTimes;
    @XmlElement(name = "RouteAlertOptions")
    protected Boolean routeAlertOptions;
    @XmlElement(name = "RoutingSessions")
    protected Boolean routingSessions;
    @XmlElement(name = "Search")
    protected Boolean search;
    @XmlElement(name = "ServiceRadius")
    protected Boolean serviceRadius;
    @XmlElement(name = "StationaryEvent")
    protected Boolean stationaryEvent;
    @XmlElement(name = "StopAlertOptions")
    protected Boolean stopAlertOptions;
    @XmlElement(name = "StopTemplateAlertOptions")
    protected Boolean stopTemplateAlertOptions;
    @XmlElement(name = "StreetSideTravelRules")
    protected Boolean streetSideTravelRules;
    @XmlElement(name = "Telematics")
    protected Boolean telematics;
    @XmlElement(name = "TimeLimitToArchiveCompletedRoutes")
    protected Boolean timeLimitToArchiveCompletedRoutes;
    @XmlElement(name = "TimeLimitToArchivePlannedRoutes")
    protected Boolean timeLimitToArchivePlannedRoutes;
    @XmlElement(name = "TimeSpanUnpaidBreakIsLayoverForHOS")
    protected Boolean timeSpanUnpaidBreakIsLayoverForHOS;
    @XmlElement(name = "TransitMatrixBuildRequestSenderEnabled")
    protected Boolean transitMatrixBuildRequestSenderEnabled;
    @XmlElement(name = "TransitMatrixBuildStatus_TransitMatrixBuildStatus")
    protected Boolean transitMatrixBuildStatusTransitMatrixBuildStatus;
    @XmlElement(name = "TransitMatrixLastBuildCompleteTime")
    protected Boolean transitMatrixLastBuildCompleteTime;
    @XmlElement(name = "TransitMatrixLastBuildRequestSendTime")
    protected Boolean transitMatrixLastBuildRequestSendTime;
    @XmlElement(name = "TransitMatrixTimeOfDayToSendBuildRequest")
    protected Boolean transitMatrixTimeOfDayToSendBuildRequest;
    @XmlElement(name = "TravelPathCalculator")
    protected Boolean travelPathCalculator;
    @XmlElement(name = "UseLineItemsToCalculateOrderSizes")
    protected Boolean useLineItemsToCalculateOrderSizes;
    @XmlElement(name = "UseSingleFixedServiceTimeForSameCoordinateStops")
    protected Boolean useSingleFixedServiceTimeForSameCoordinateStops;
    @XmlElement(name = "Video")
    protected Boolean video;
    @XmlElement(name = "WarnBeforeDispatchingRouteWithNoEquipment")
    protected Boolean warnBeforeDispatchingRouteWithNoEquipment;
    @XmlElement(name = "WarnBeforeDispatchingRouteWithNoWorker")
    protected Boolean warnBeforeDispatchingRouteWithNoWorker;
    @XmlElement(name = "XrsOrganizationSid")
    protected Boolean xrsOrganizationSid;

    /**
     * Obtém o valor da propriedade acknowledgeRouteExceptionsOnArchive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcknowledgeRouteExceptionsOnArchive() {
        return acknowledgeRouteExceptionsOnArchive;
    }

    /**
     * Define o valor da propriedade acknowledgeRouteExceptionsOnArchive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcknowledgeRouteExceptionsOnArchive(Boolean value) {
        this.acknowledgeRouteExceptionsOnArchive = value;
    }

    /**
     * Obtém o valor da propriedade acknowledgeRouteNotesOnArchive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcknowledgeRouteNotesOnArchive() {
        return acknowledgeRouteNotesOnArchive;
    }

    /**
     * Define o valor da propriedade acknowledgeRouteNotesOnArchive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcknowledgeRouteNotesOnArchive(Boolean value) {
        this.acknowledgeRouteNotesOnArchive = value;
    }

    /**
     * Obtém o valor da propriedade autoArriveDepart.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoArriveDepart() {
        return autoArriveDepart;
    }

    /**
     * Define o valor da propriedade autoArriveDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoArriveDepart(Boolean value) {
        this.autoArriveDepart = value;
    }

    /**
     * Obtém o valor da propriedade autonomousOptimization.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutonomousOptimization() {
        return autonomousOptimization;
    }

    /**
     * Define o valor da propriedade autonomousOptimization.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutonomousOptimization(Boolean value) {
        this.autonomousOptimization = value;
    }

    /**
     * Obtém o valor da propriedade bulkThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkThreshold() {
        return bulkThreshold;
    }

    /**
     * Define o valor da propriedade bulkThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkThreshold(Boolean value) {
        this.bulkThreshold = value;
    }

    /**
     * Obtém o valor da propriedade childRegionEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChildRegionEntityKeys() {
        return childRegionEntityKeys;
    }

    /**
     * Define o valor da propriedade childRegionEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChildRegionEntityKeys(Boolean value) {
        this.childRegionEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade combineOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCombineOrders() {
        return combineOrders;
    }

    /**
     * Define o valor da propriedade combineOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombineOrders(Boolean value) {
        this.combineOrders = value;
    }

    /**
     * Obtém o valor da propriedade complianceAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplianceAddress() {
        return complianceAddress;
    }

    /**
     * Define o valor da propriedade complianceAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplianceAddress(Boolean value) {
        this.complianceAddress = value;
    }

    /**
     * Obtém o valor da propriedade complianceModuleEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplianceModuleEnabled() {
        return complianceModuleEnabled;
    }

    /**
     * Define o valor da propriedade complianceModuleEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplianceModuleEnabled(Boolean value) {
        this.complianceModuleEnabled = value;
    }

    /**
     * Obtém o valor da propriedade costOfFuel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCostOfFuel() {
        return costOfFuel;
    }

    /**
     * Define o valor da propriedade costOfFuel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCostOfFuel(Boolean value) {
        this.costOfFuel = value;
    }

    /**
     * Obtém o valor da propriedade dvir.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDVIR() {
        return dvir;
    }

    /**
     * Define o valor da propriedade dvir.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDVIR(Boolean value) {
        this.dvir = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsBusinessWeek.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayOfWeekFlagsBusinessWeek() {
        return dayOfWeekFlagsBusinessWeek;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsBusinessWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayOfWeekFlagsBusinessWeek(Boolean value) {
        this.dayOfWeekFlagsBusinessWeek = value;
    }

    /**
     * Obtém o valor da propriedade defaults.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaults() {
        return defaults;
    }

    /**
     * Define o valor da propriedade defaults.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaults(Boolean value) {
        this.defaults = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade dispatch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispatch() {
        return dispatch;
    }

    /**
     * Define o valor da propriedade dispatch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispatch(Boolean value) {
        this.dispatch = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention() {
        return geocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention(Boolean value) {
        this.geocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention = value;
    }

    /**
     * Obtém o valor da propriedade hos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHos() {
        return hos;
    }

    /**
     * Define o valor da propriedade hos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHos(Boolean value) {
        this.hos = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade ifta.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIfta() {
        return ifta;
    }

    /**
     * Define o valor da propriedade ifta.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIfta(Boolean value) {
        this.ifta = value;
    }

    /**
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade isParentRegion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsParentRegion() {
        return isParentRegion;
    }

    /**
     * Define o valor da propriedade isParentRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsParentRegion(Boolean value) {
        this.isParentRegion = value;
    }

    /**
     * Obtém o valor da propriedade isTopLevelComplianceRegion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTopLevelComplianceRegion() {
        return isTopLevelComplianceRegion;
    }

    /**
     * Define o valor da propriedade isTopLevelComplianceRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTopLevelComplianceRegion(Boolean value) {
        this.isTopLevelComplianceRegion = value;
    }

    /**
     * Obtém o valor da propriedade mobileDevice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileDevice() {
        return mobileDevice;
    }

    /**
     * Define o valor da propriedade mobileDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileDevice(Boolean value) {
        this.mobileDevice = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsNavigation() {
        return omnitracsNavigation;
    }

    /**
     * Define o valor da propriedade omnitracsNavigation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsNavigation(Boolean value) {
        this.omnitracsNavigation = value;
    }

    /**
     * Obtém o valor da propriedade overriddenProperties.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverriddenProperties() {
        return overriddenProperties;
    }

    /**
     * Define o valor da propriedade overriddenProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverriddenProperties(Boolean value) {
        this.overriddenProperties = value;
    }

    /**
     * Obtém o valor da propriedade parentRegionDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParentRegionDescription() {
        return parentRegionDescription;
    }

    /**
     * Define o valor da propriedade parentRegionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParentRegionDescription(Boolean value) {
        this.parentRegionDescription = value;
    }

    /**
     * Obtém o valor da propriedade parentRegionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParentRegionEntityKey() {
        return parentRegionEntityKey;
    }

    /**
     * Define o valor da propriedade parentRegionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParentRegionEntityKey(Boolean value) {
        this.parentRegionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade parentRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParentRegionIdentifier() {
        return parentRegionIdentifier;
    }

    /**
     * Define o valor da propriedade parentRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParentRegionIdentifier(Boolean value) {
        this.parentRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade performance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformance() {
        return performance;
    }

    /**
     * Define o valor da propriedade performance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformance(Boolean value) {
        this.performance = value;
    }

    /**
     * Obtém o valor da propriedade regionLevelEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegionLevelEntityKey() {
        return regionLevelEntityKey;
    }

    /**
     * Define o valor da propriedade regionLevelEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegionLevelEntityKey(Boolean value) {
        this.regionLevelEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade restrictedOperatingTimes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedOperatingTimes() {
        return restrictedOperatingTimes;
    }

    /**
     * Define o valor da propriedade restrictedOperatingTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedOperatingTimes(Boolean value) {
        this.restrictedOperatingTimes = value;
    }

    /**
     * Obtém o valor da propriedade routeAlertOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteAlertOptions() {
        return routeAlertOptions;
    }

    /**
     * Define o valor da propriedade routeAlertOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteAlertOptions(Boolean value) {
        this.routeAlertOptions = value;
    }

    /**
     * Obtém o valor da propriedade routingSessions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutingSessions() {
        return routingSessions;
    }

    /**
     * Define o valor da propriedade routingSessions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutingSessions(Boolean value) {
        this.routingSessions = value;
    }

    /**
     * Obtém o valor da propriedade search.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearch() {
        return search;
    }

    /**
     * Define o valor da propriedade search.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearch(Boolean value) {
        this.search = value;
    }

    /**
     * Obtém o valor da propriedade serviceRadius.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceRadius() {
        return serviceRadius;
    }

    /**
     * Define o valor da propriedade serviceRadius.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceRadius(Boolean value) {
        this.serviceRadius = value;
    }

    /**
     * Obtém o valor da propriedade stationaryEvent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStationaryEvent() {
        return stationaryEvent;
    }

    /**
     * Define o valor da propriedade stationaryEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStationaryEvent(Boolean value) {
        this.stationaryEvent = value;
    }

    /**
     * Obtém o valor da propriedade stopAlertOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopAlertOptions() {
        return stopAlertOptions;
    }

    /**
     * Define o valor da propriedade stopAlertOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopAlertOptions(Boolean value) {
        this.stopAlertOptions = value;
    }

    /**
     * Obtém o valor da propriedade stopTemplateAlertOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopTemplateAlertOptions() {
        return stopTemplateAlertOptions;
    }

    /**
     * Define o valor da propriedade stopTemplateAlertOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopTemplateAlertOptions(Boolean value) {
        this.stopTemplateAlertOptions = value;
    }

    /**
     * Obtém o valor da propriedade streetSideTravelRules.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStreetSideTravelRules() {
        return streetSideTravelRules;
    }

    /**
     * Define o valor da propriedade streetSideTravelRules.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStreetSideTravelRules(Boolean value) {
        this.streetSideTravelRules = value;
    }

    /**
     * Obtém o valor da propriedade telematics.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematics() {
        return telematics;
    }

    /**
     * Define o valor da propriedade telematics.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematics(Boolean value) {
        this.telematics = value;
    }

    /**
     * Obtém o valor da propriedade timeLimitToArchiveCompletedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeLimitToArchiveCompletedRoutes() {
        return timeLimitToArchiveCompletedRoutes;
    }

    /**
     * Define o valor da propriedade timeLimitToArchiveCompletedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeLimitToArchiveCompletedRoutes(Boolean value) {
        this.timeLimitToArchiveCompletedRoutes = value;
    }

    /**
     * Obtém o valor da propriedade timeLimitToArchivePlannedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeLimitToArchivePlannedRoutes() {
        return timeLimitToArchivePlannedRoutes;
    }

    /**
     * Define o valor da propriedade timeLimitToArchivePlannedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeLimitToArchivePlannedRoutes(Boolean value) {
        this.timeLimitToArchivePlannedRoutes = value;
    }

    /**
     * Obtém o valor da propriedade timeSpanUnpaidBreakIsLayoverForHOS.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeSpanUnpaidBreakIsLayoverForHOS() {
        return timeSpanUnpaidBreakIsLayoverForHOS;
    }

    /**
     * Define o valor da propriedade timeSpanUnpaidBreakIsLayoverForHOS.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeSpanUnpaidBreakIsLayoverForHOS(Boolean value) {
        this.timeSpanUnpaidBreakIsLayoverForHOS = value;
    }

    /**
     * Obtém o valor da propriedade transitMatrixBuildRequestSenderEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransitMatrixBuildRequestSenderEnabled() {
        return transitMatrixBuildRequestSenderEnabled;
    }

    /**
     * Define o valor da propriedade transitMatrixBuildRequestSenderEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransitMatrixBuildRequestSenderEnabled(Boolean value) {
        this.transitMatrixBuildRequestSenderEnabled = value;
    }

    /**
     * Obtém o valor da propriedade transitMatrixBuildStatusTransitMatrixBuildStatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransitMatrixBuildStatusTransitMatrixBuildStatus() {
        return transitMatrixBuildStatusTransitMatrixBuildStatus;
    }

    /**
     * Define o valor da propriedade transitMatrixBuildStatusTransitMatrixBuildStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransitMatrixBuildStatusTransitMatrixBuildStatus(Boolean value) {
        this.transitMatrixBuildStatusTransitMatrixBuildStatus = value;
    }

    /**
     * Obtém o valor da propriedade transitMatrixLastBuildCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransitMatrixLastBuildCompleteTime() {
        return transitMatrixLastBuildCompleteTime;
    }

    /**
     * Define o valor da propriedade transitMatrixLastBuildCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransitMatrixLastBuildCompleteTime(Boolean value) {
        this.transitMatrixLastBuildCompleteTime = value;
    }

    /**
     * Obtém o valor da propriedade transitMatrixLastBuildRequestSendTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransitMatrixLastBuildRequestSendTime() {
        return transitMatrixLastBuildRequestSendTime;
    }

    /**
     * Define o valor da propriedade transitMatrixLastBuildRequestSendTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransitMatrixLastBuildRequestSendTime(Boolean value) {
        this.transitMatrixLastBuildRequestSendTime = value;
    }

    /**
     * Obtém o valor da propriedade transitMatrixTimeOfDayToSendBuildRequest.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransitMatrixTimeOfDayToSendBuildRequest() {
        return transitMatrixTimeOfDayToSendBuildRequest;
    }

    /**
     * Define o valor da propriedade transitMatrixTimeOfDayToSendBuildRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransitMatrixTimeOfDayToSendBuildRequest(Boolean value) {
        this.transitMatrixTimeOfDayToSendBuildRequest = value;
    }

    /**
     * Obtém o valor da propriedade travelPathCalculator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelPathCalculator() {
        return travelPathCalculator;
    }

    /**
     * Define o valor da propriedade travelPathCalculator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelPathCalculator(Boolean value) {
        this.travelPathCalculator = value;
    }

    /**
     * Obtém o valor da propriedade useLineItemsToCalculateOrderSizes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLineItemsToCalculateOrderSizes() {
        return useLineItemsToCalculateOrderSizes;
    }

    /**
     * Define o valor da propriedade useLineItemsToCalculateOrderSizes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLineItemsToCalculateOrderSizes(Boolean value) {
        this.useLineItemsToCalculateOrderSizes = value;
    }

    /**
     * Obtém o valor da propriedade useSingleFixedServiceTimeForSameCoordinateStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSingleFixedServiceTimeForSameCoordinateStops() {
        return useSingleFixedServiceTimeForSameCoordinateStops;
    }

    /**
     * Define o valor da propriedade useSingleFixedServiceTimeForSameCoordinateStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSingleFixedServiceTimeForSameCoordinateStops(Boolean value) {
        this.useSingleFixedServiceTimeForSameCoordinateStops = value;
    }

    /**
     * Obtém o valor da propriedade video.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVideo() {
        return video;
    }

    /**
     * Define o valor da propriedade video.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVideo(Boolean value) {
        this.video = value;
    }

    /**
     * Obtém o valor da propriedade warnBeforeDispatchingRouteWithNoEquipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarnBeforeDispatchingRouteWithNoEquipment() {
        return warnBeforeDispatchingRouteWithNoEquipment;
    }

    /**
     * Define o valor da propriedade warnBeforeDispatchingRouteWithNoEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarnBeforeDispatchingRouteWithNoEquipment(Boolean value) {
        this.warnBeforeDispatchingRouteWithNoEquipment = value;
    }

    /**
     * Obtém o valor da propriedade warnBeforeDispatchingRouteWithNoWorker.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarnBeforeDispatchingRouteWithNoWorker() {
        return warnBeforeDispatchingRouteWithNoWorker;
    }

    /**
     * Define o valor da propriedade warnBeforeDispatchingRouteWithNoWorker.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarnBeforeDispatchingRouteWithNoWorker(Boolean value) {
        this.warnBeforeDispatchingRouteWithNoWorker = value;
    }

    /**
     * Obtém o valor da propriedade xrsOrganizationSid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsOrganizationSid() {
        return xrsOrganizationSid;
    }

    /**
     * Define o valor da propriedade xrsOrganizationSid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsOrganizationSid(Boolean value) {
        this.xrsOrganizationSid = value;
    }

}
