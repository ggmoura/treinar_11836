
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de Region complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcknowledgeRouteExceptionsOnArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AcknowledgeRouteNotesOnArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoArriveDepart" type="{http://roadnet.com/apex/DataContracts/}Region.AutoArriveDepartSettings" minOccurs="0"/&gt;
 *         &lt;element name="AutonomousOptimization" type="{http://roadnet.com/apex/DataContracts/}Region.AutonomousOptimizationSettings" minOccurs="0"/&gt;
 *         &lt;element name="ChildRegionEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="CombineOrders" type="{http://roadnet.com/apex/DataContracts/}Region.CombineOrdersSettings" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceAddress" type="{http://roadnet.com/apex/DataContracts/}Region.ComplianceAddressSettings" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceModuleEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CostOfFuel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DVIR" type="{http://roadnet.com/apex/DataContracts/}Region.DVIRSettings" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_BusinessWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Defaults" type="{http://roadnet.com/apex/DataContracts/}Region.DefaultSettings" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Dispatch" type="{http://roadnet.com/apex/DataContracts/}Region.DispatchSettings" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracyFlags_GeocodeAccuraciesRequiringAttention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hos" type="{http://roadnet.com/apex/DataContracts/}Region.HosSettings" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ifta" type="{http://roadnet.com/apex/DataContracts/}Region.IftaSettings" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsParentRegion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTopLevelComplianceRegion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileDevice" type="{http://roadnet.com/apex/DataContracts/}Region.MobileDeviceSettings" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigation" type="{http://roadnet.com/apex/DataContracts/}Region.OmnitracsNavigationSettings" minOccurs="0"/&gt;
 *         &lt;element name="OverriddenProperties" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties" minOccurs="0"/&gt;
 *         &lt;element name="ParentRegionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ParentRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Performance" type="{http://roadnet.com/apex/DataContracts/}Region.PerformanceSettings" minOccurs="0"/&gt;
 *         &lt;element name="RegionLevelEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedOperatingTimes" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRegionRestrictedOperatingTimeDetail" minOccurs="0"/&gt;
 *         &lt;element name="RouteAlertOptions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteAlertOption" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessions" type="{http://roadnet.com/apex/DataContracts/}Region.RoutingSessionSettings" minOccurs="0"/&gt;
 *         &lt;element name="Search" type="{http://roadnet.com/apex/DataContracts/}Region.SearchSettings" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRadius" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="StationaryEvent" type="{http://roadnet.com/apex/DataContracts/}Region.StationaryEventSettings" minOccurs="0"/&gt;
 *         &lt;element name="StopAlertOptions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfStopAlertOption" minOccurs="0"/&gt;
 *         &lt;element name="StopTemplateAlertOptions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfStopTemplateAlertOption" minOccurs="0"/&gt;
 *         &lt;element name="StreetSideTravelRules" type="{http://roadnet.com/apex/DataContracts/}Region.StreetSideLocationTravelRules" minOccurs="0"/&gt;
 *         &lt;element name="Telematics" type="{http://roadnet.com/apex/DataContracts/}Region.TelematicsSettings" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimitToArchiveCompletedRoutes" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimitToArchivePlannedRoutes" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixBuildRequestSenderEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixBuildStatus_TransitMatrixBuildStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixLastBuildCompleteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixLastBuildRequestSendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixTimeOfDayToSendBuildRequest" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="TravelPathCalculator" type="{http://roadnet.com/apex/DataContracts/}Region.TravelPathCalculatorSettings" minOccurs="0"/&gt;
 *         &lt;element name="UseLineItemsToCalculateOrderSizes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseSingleFixedServiceTimeForSameCoordinateStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Video" type="{http://roadnet.com/apex/DataContracts/}Region.VideoSettings" minOccurs="0"/&gt;
 *         &lt;element name="WarnBeforeDispatchingRouteWithNoEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WarnBeforeDispatchingRouteWithNoWorker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsOrganizationSid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region", propOrder = {
    "acknowledgeRouteExceptionsOnArchive",
    "acknowledgeRouteNotesOnArchive",
    "autoArriveDepart",
    "autonomousOptimization",
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
public class Region
    extends BusinessUnitBasedAggregateRootEntity
{

    @XmlElement(name = "AcknowledgeRouteExceptionsOnArchive")
    protected Boolean acknowledgeRouteExceptionsOnArchive;
    @XmlElement(name = "AcknowledgeRouteNotesOnArchive")
    protected Boolean acknowledgeRouteNotesOnArchive;
    @XmlElementRef(name = "AutoArriveDepart", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionAutoArriveDepartSettings> autoArriveDepart;
    @XmlElementRef(name = "AutonomousOptimization", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionAutonomousOptimizationSettings> autonomousOptimization;
    @XmlElementRef(name = "ChildRegionEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> childRegionEntityKeys;
    @XmlElementRef(name = "CombineOrders", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionCombineOrdersSettings> combineOrders;
    @XmlElementRef(name = "ComplianceAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionComplianceAddressSettings> complianceAddress;
    @XmlElement(name = "ComplianceModuleEnabled")
    protected Boolean complianceModuleEnabled;
    @XmlElement(name = "CostOfFuel")
    protected Double costOfFuel;
    @XmlElementRef(name = "DVIR", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionDVIRSettings> dvir;
    @XmlElementRef(name = "DayOfWeekFlags_BusinessWeek", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsBusinessWeek;
    @XmlElementRef(name = "Defaults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionDefaultSettings> defaults;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Dispatch", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionDispatchSettings> dispatch;
    @XmlElementRef(name = "GeocodeAccuracyFlags_GeocodeAccuraciesRequiringAttention", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention;
    @XmlElementRef(name = "Hos", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionHosSettings> hos;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "Ifta", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionIftaSettings> ifta;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "IsParentRegion")
    protected Boolean isParentRegion;
    @XmlElement(name = "IsTopLevelComplianceRegion")
    protected Boolean isTopLevelComplianceRegion;
    @XmlElementRef(name = "MobileDevice", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionMobileDeviceSettings> mobileDevice;
    @XmlElementRef(name = "OmnitracsNavigation", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionOmnitracsNavigationSettings> omnitracsNavigation;
    @XmlElementRef(name = "OverriddenProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionProperties> overriddenProperties;
    @XmlElementRef(name = "ParentRegionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentRegionDescription;
    @XmlElementRef(name = "ParentRegionEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> parentRegionEntityKey;
    @XmlElementRef(name = "ParentRegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentRegionIdentifier;
    @XmlElementRef(name = "Performance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionPerformanceSettings> performance;
    @XmlElement(name = "RegionLevelEntityKey")
    protected Long regionLevelEntityKey;
    @XmlElementRef(name = "RestrictedOperatingTimes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRegionRestrictedOperatingTimeDetail> restrictedOperatingTimes;
    @XmlElementRef(name = "RouteAlertOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteAlertOption> routeAlertOptions;
    @XmlElementRef(name = "RoutingSessions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionRoutingSessionSettings> routingSessions;
    @XmlElementRef(name = "Search", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionSearchSettings> search;
    @XmlElementRef(name = "ServiceRadius", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> serviceRadius;
    @XmlElementRef(name = "StationaryEvent", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionStationaryEventSettings> stationaryEvent;
    @XmlElementRef(name = "StopAlertOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStopAlertOption> stopAlertOptions;
    @XmlElementRef(name = "StopTemplateAlertOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStopTemplateAlertOption> stopTemplateAlertOptions;
    @XmlElementRef(name = "StreetSideTravelRules", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionStreetSideLocationTravelRules> streetSideTravelRules;
    @XmlElementRef(name = "Telematics", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionTelematicsSettings> telematics;
    @XmlElement(name = "TimeLimitToArchiveCompletedRoutes")
    protected Duration timeLimitToArchiveCompletedRoutes;
    @XmlElement(name = "TimeLimitToArchivePlannedRoutes")
    protected Duration timeLimitToArchivePlannedRoutes;
    @XmlElement(name = "TransitMatrixBuildRequestSenderEnabled")
    protected Boolean transitMatrixBuildRequestSenderEnabled;
    @XmlElementRef(name = "TransitMatrixBuildStatus_TransitMatrixBuildStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transitMatrixBuildStatusTransitMatrixBuildStatus;
    @XmlElementRef(name = "TransitMatrixLastBuildCompleteTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> transitMatrixLastBuildCompleteTime;
    @XmlElementRef(name = "TransitMatrixLastBuildRequestSendTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> transitMatrixLastBuildRequestSendTime;
    @XmlElementRef(name = "TransitMatrixTimeOfDayToSendBuildRequest", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> transitMatrixTimeOfDayToSendBuildRequest;
    @XmlElementRef(name = "TravelPathCalculator", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionTravelPathCalculatorSettings> travelPathCalculator;
    @XmlElement(name = "UseLineItemsToCalculateOrderSizes")
    protected Boolean useLineItemsToCalculateOrderSizes;
    @XmlElement(name = "UseSingleFixedServiceTimeForSameCoordinateStops")
    protected Boolean useSingleFixedServiceTimeForSameCoordinateStops;
    @XmlElementRef(name = "Video", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionVideoSettings> video;
    @XmlElement(name = "WarnBeforeDispatchingRouteWithNoEquipment")
    protected Boolean warnBeforeDispatchingRouteWithNoEquipment;
    @XmlElement(name = "WarnBeforeDispatchingRouteWithNoWorker")
    protected Boolean warnBeforeDispatchingRouteWithNoWorker;
    @XmlElementRef(name = "XrsOrganizationSid", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> xrsOrganizationSid;

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
     *     {@link JAXBElement }{@code <}{@link RegionAutoArriveDepartSettings }{@code >}
     *     
     */
    public JAXBElement<RegionAutoArriveDepartSettings> getAutoArriveDepart() {
        return autoArriveDepart;
    }

    /**
     * Define o valor da propriedade autoArriveDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionAutoArriveDepartSettings }{@code >}
     *     
     */
    public void setAutoArriveDepart(JAXBElement<RegionAutoArriveDepartSettings> value) {
        this.autoArriveDepart = value;
    }

    /**
     * Obtém o valor da propriedade autonomousOptimization.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionAutonomousOptimizationSettings }{@code >}
     *     
     */
    public JAXBElement<RegionAutonomousOptimizationSettings> getAutonomousOptimization() {
        return autonomousOptimization;
    }

    /**
     * Define o valor da propriedade autonomousOptimization.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionAutonomousOptimizationSettings }{@code >}
     *     
     */
    public void setAutonomousOptimization(JAXBElement<RegionAutonomousOptimizationSettings> value) {
        this.autonomousOptimization = value;
    }

    /**
     * Obtém o valor da propriedade childRegionEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getChildRegionEntityKeys() {
        return childRegionEntityKeys;
    }

    /**
     * Define o valor da propriedade childRegionEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setChildRegionEntityKeys(JAXBElement<ArrayOflong> value) {
        this.childRegionEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade combineOrders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionCombineOrdersSettings }{@code >}
     *     
     */
    public JAXBElement<RegionCombineOrdersSettings> getCombineOrders() {
        return combineOrders;
    }

    /**
     * Define o valor da propriedade combineOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionCombineOrdersSettings }{@code >}
     *     
     */
    public void setCombineOrders(JAXBElement<RegionCombineOrdersSettings> value) {
        this.combineOrders = value;
    }

    /**
     * Obtém o valor da propriedade complianceAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionComplianceAddressSettings }{@code >}
     *     
     */
    public JAXBElement<RegionComplianceAddressSettings> getComplianceAddress() {
        return complianceAddress;
    }

    /**
     * Define o valor da propriedade complianceAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionComplianceAddressSettings }{@code >}
     *     
     */
    public void setComplianceAddress(JAXBElement<RegionComplianceAddressSettings> value) {
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
     *     {@link Double }
     *     
     */
    public Double getCostOfFuel() {
        return costOfFuel;
    }

    /**
     * Define o valor da propriedade costOfFuel.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCostOfFuel(Double value) {
        this.costOfFuel = value;
    }

    /**
     * Obtém o valor da propriedade dvir.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionDVIRSettings }{@code >}
     *     
     */
    public JAXBElement<RegionDVIRSettings> getDVIR() {
        return dvir;
    }

    /**
     * Define o valor da propriedade dvir.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionDVIRSettings }{@code >}
     *     
     */
    public void setDVIR(JAXBElement<RegionDVIRSettings> value) {
        this.dvir = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsBusinessWeek.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlagsBusinessWeek() {
        return dayOfWeekFlagsBusinessWeek;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsBusinessWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlagsBusinessWeek(JAXBElement<String> value) {
        this.dayOfWeekFlagsBusinessWeek = value;
    }

    /**
     * Obtém o valor da propriedade defaults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionDefaultSettings }{@code >}
     *     
     */
    public JAXBElement<RegionDefaultSettings> getDefaults() {
        return defaults;
    }

    /**
     * Define o valor da propriedade defaults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionDefaultSettings }{@code >}
     *     
     */
    public void setDefaults(JAXBElement<RegionDefaultSettings> value) {
        this.defaults = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade dispatch.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionDispatchSettings }{@code >}
     *     
     */
    public JAXBElement<RegionDispatchSettings> getDispatch() {
        return dispatch;
    }

    /**
     * Define o valor da propriedade dispatch.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionDispatchSettings }{@code >}
     *     
     */
    public void setDispatch(JAXBElement<RegionDispatchSettings> value) {
        this.dispatch = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention() {
        return geocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention(JAXBElement<String> value) {
        this.geocodeAccuracyFlagsGeocodeAccuraciesRequiringAttention = value;
    }

    /**
     * Obtém o valor da propriedade hos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionHosSettings }{@code >}
     *     
     */
    public JAXBElement<RegionHosSettings> getHos() {
        return hos;
    }

    /**
     * Define o valor da propriedade hos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionHosSettings }{@code >}
     *     
     */
    public void setHos(JAXBElement<RegionHosSettings> value) {
        this.hos = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade ifta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionIftaSettings }{@code >}
     *     
     */
    public JAXBElement<RegionIftaSettings> getIfta() {
        return ifta;
    }

    /**
     * Define o valor da propriedade ifta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionIftaSettings }{@code >}
     *     
     */
    public void setIfta(JAXBElement<RegionIftaSettings> value) {
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
     *     {@link JAXBElement }{@code <}{@link RegionMobileDeviceSettings }{@code >}
     *     
     */
    public JAXBElement<RegionMobileDeviceSettings> getMobileDevice() {
        return mobileDevice;
    }

    /**
     * Define o valor da propriedade mobileDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionMobileDeviceSettings }{@code >}
     *     
     */
    public void setMobileDevice(JAXBElement<RegionMobileDeviceSettings> value) {
        this.mobileDevice = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionOmnitracsNavigationSettings }{@code >}
     *     
     */
    public JAXBElement<RegionOmnitracsNavigationSettings> getOmnitracsNavigation() {
        return omnitracsNavigation;
    }

    /**
     * Define o valor da propriedade omnitracsNavigation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionOmnitracsNavigationSettings }{@code >}
     *     
     */
    public void setOmnitracsNavigation(JAXBElement<RegionOmnitracsNavigationSettings> value) {
        this.omnitracsNavigation = value;
    }

    /**
     * Obtém o valor da propriedade overriddenProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionProperties }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionProperties> getOverriddenProperties() {
        return overriddenProperties;
    }

    /**
     * Define o valor da propriedade overriddenProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionProperties }{@code >}
     *     
     */
    public void setOverriddenProperties(JAXBElement<OverridableRegionProperties> value) {
        this.overriddenProperties = value;
    }

    /**
     * Obtém o valor da propriedade parentRegionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentRegionDescription() {
        return parentRegionDescription;
    }

    /**
     * Define o valor da propriedade parentRegionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentRegionDescription(JAXBElement<String> value) {
        this.parentRegionDescription = value;
    }

    /**
     * Obtém o valor da propriedade parentRegionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getParentRegionEntityKey() {
        return parentRegionEntityKey;
    }

    /**
     * Define o valor da propriedade parentRegionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setParentRegionEntityKey(JAXBElement<Long> value) {
        this.parentRegionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade parentRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentRegionIdentifier() {
        return parentRegionIdentifier;
    }

    /**
     * Define o valor da propriedade parentRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentRegionIdentifier(JAXBElement<String> value) {
        this.parentRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade performance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionPerformanceSettings }{@code >}
     *     
     */
    public JAXBElement<RegionPerformanceSettings> getPerformance() {
        return performance;
    }

    /**
     * Define o valor da propriedade performance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionPerformanceSettings }{@code >}
     *     
     */
    public void setPerformance(JAXBElement<RegionPerformanceSettings> value) {
        this.performance = value;
    }

    /**
     * Obtém o valor da propriedade regionLevelEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegionLevelEntityKey() {
        return regionLevelEntityKey;
    }

    /**
     * Define o valor da propriedade regionLevelEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegionLevelEntityKey(Long value) {
        this.regionLevelEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade restrictedOperatingTimes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegionRestrictedOperatingTimeDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRegionRestrictedOperatingTimeDetail> getRestrictedOperatingTimes() {
        return restrictedOperatingTimes;
    }

    /**
     * Define o valor da propriedade restrictedOperatingTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegionRestrictedOperatingTimeDetail }{@code >}
     *     
     */
    public void setRestrictedOperatingTimes(JAXBElement<ArrayOfRegionRestrictedOperatingTimeDetail> value) {
        this.restrictedOperatingTimes = value;
    }

    /**
     * Obtém o valor da propriedade routeAlertOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteAlertOption }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteAlertOption> getRouteAlertOptions() {
        return routeAlertOptions;
    }

    /**
     * Define o valor da propriedade routeAlertOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteAlertOption }{@code >}
     *     
     */
    public void setRouteAlertOptions(JAXBElement<ArrayOfRouteAlertOption> value) {
        this.routeAlertOptions = value;
    }

    /**
     * Obtém o valor da propriedade routingSessions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionRoutingSessionSettings }{@code >}
     *     
     */
    public JAXBElement<RegionRoutingSessionSettings> getRoutingSessions() {
        return routingSessions;
    }

    /**
     * Define o valor da propriedade routingSessions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionRoutingSessionSettings }{@code >}
     *     
     */
    public void setRoutingSessions(JAXBElement<RegionRoutingSessionSettings> value) {
        this.routingSessions = value;
    }

    /**
     * Obtém o valor da propriedade search.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionSearchSettings }{@code >}
     *     
     */
    public JAXBElement<RegionSearchSettings> getSearch() {
        return search;
    }

    /**
     * Define o valor da propriedade search.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionSearchSettings }{@code >}
     *     
     */
    public void setSearch(JAXBElement<RegionSearchSettings> value) {
        this.search = value;
    }

    /**
     * Obtém o valor da propriedade serviceRadius.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getServiceRadius() {
        return serviceRadius;
    }

    /**
     * Define o valor da propriedade serviceRadius.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setServiceRadius(JAXBElement<Distance> value) {
        this.serviceRadius = value;
    }

    /**
     * Obtém o valor da propriedade stationaryEvent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionStationaryEventSettings }{@code >}
     *     
     */
    public JAXBElement<RegionStationaryEventSettings> getStationaryEvent() {
        return stationaryEvent;
    }

    /**
     * Define o valor da propriedade stationaryEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionStationaryEventSettings }{@code >}
     *     
     */
    public void setStationaryEvent(JAXBElement<RegionStationaryEventSettings> value) {
        this.stationaryEvent = value;
    }

    /**
     * Obtém o valor da propriedade stopAlertOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopAlertOption }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStopAlertOption> getStopAlertOptions() {
        return stopAlertOptions;
    }

    /**
     * Define o valor da propriedade stopAlertOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopAlertOption }{@code >}
     *     
     */
    public void setStopAlertOptions(JAXBElement<ArrayOfStopAlertOption> value) {
        this.stopAlertOptions = value;
    }

    /**
     * Obtém o valor da propriedade stopTemplateAlertOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopTemplateAlertOption }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStopTemplateAlertOption> getStopTemplateAlertOptions() {
        return stopTemplateAlertOptions;
    }

    /**
     * Define o valor da propriedade stopTemplateAlertOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopTemplateAlertOption }{@code >}
     *     
     */
    public void setStopTemplateAlertOptions(JAXBElement<ArrayOfStopTemplateAlertOption> value) {
        this.stopTemplateAlertOptions = value;
    }

    /**
     * Obtém o valor da propriedade streetSideTravelRules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionStreetSideLocationTravelRules }{@code >}
     *     
     */
    public JAXBElement<RegionStreetSideLocationTravelRules> getStreetSideTravelRules() {
        return streetSideTravelRules;
    }

    /**
     * Define o valor da propriedade streetSideTravelRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionStreetSideLocationTravelRules }{@code >}
     *     
     */
    public void setStreetSideTravelRules(JAXBElement<RegionStreetSideLocationTravelRules> value) {
        this.streetSideTravelRules = value;
    }

    /**
     * Obtém o valor da propriedade telematics.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionTelematicsSettings }{@code >}
     *     
     */
    public JAXBElement<RegionTelematicsSettings> getTelematics() {
        return telematics;
    }

    /**
     * Define o valor da propriedade telematics.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionTelematicsSettings }{@code >}
     *     
     */
    public void setTelematics(JAXBElement<RegionTelematicsSettings> value) {
        this.telematics = value;
    }

    /**
     * Obtém o valor da propriedade timeLimitToArchiveCompletedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeLimitToArchiveCompletedRoutes() {
        return timeLimitToArchiveCompletedRoutes;
    }

    /**
     * Define o valor da propriedade timeLimitToArchiveCompletedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeLimitToArchiveCompletedRoutes(Duration value) {
        this.timeLimitToArchiveCompletedRoutes = value;
    }

    /**
     * Obtém o valor da propriedade timeLimitToArchivePlannedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeLimitToArchivePlannedRoutes() {
        return timeLimitToArchivePlannedRoutes;
    }

    /**
     * Define o valor da propriedade timeLimitToArchivePlannedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeLimitToArchivePlannedRoutes(Duration value) {
        this.timeLimitToArchivePlannedRoutes = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransitMatrixBuildStatusTransitMatrixBuildStatus() {
        return transitMatrixBuildStatusTransitMatrixBuildStatus;
    }

    /**
     * Define o valor da propriedade transitMatrixBuildStatusTransitMatrixBuildStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransitMatrixBuildStatusTransitMatrixBuildStatus(JAXBElement<String> value) {
        this.transitMatrixBuildStatusTransitMatrixBuildStatus = value;
    }

    /**
     * Obtém o valor da propriedade transitMatrixLastBuildCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTransitMatrixLastBuildCompleteTime() {
        return transitMatrixLastBuildCompleteTime;
    }

    /**
     * Define o valor da propriedade transitMatrixLastBuildCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTransitMatrixLastBuildCompleteTime(JAXBElement<XMLGregorianCalendar> value) {
        this.transitMatrixLastBuildCompleteTime = value;
    }

    /**
     * Obtém o valor da propriedade transitMatrixLastBuildRequestSendTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTransitMatrixLastBuildRequestSendTime() {
        return transitMatrixLastBuildRequestSendTime;
    }

    /**
     * Define o valor da propriedade transitMatrixLastBuildRequestSendTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTransitMatrixLastBuildRequestSendTime(JAXBElement<XMLGregorianCalendar> value) {
        this.transitMatrixLastBuildRequestSendTime = value;
    }

    /**
     * Obtém o valor da propriedade transitMatrixTimeOfDayToSendBuildRequest.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTransitMatrixTimeOfDayToSendBuildRequest() {
        return transitMatrixTimeOfDayToSendBuildRequest;
    }

    /**
     * Define o valor da propriedade transitMatrixTimeOfDayToSendBuildRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTransitMatrixTimeOfDayToSendBuildRequest(JAXBElement<XMLGregorianCalendar> value) {
        this.transitMatrixTimeOfDayToSendBuildRequest = value;
    }

    /**
     * Obtém o valor da propriedade travelPathCalculator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionTravelPathCalculatorSettings }{@code >}
     *     
     */
    public JAXBElement<RegionTravelPathCalculatorSettings> getTravelPathCalculator() {
        return travelPathCalculator;
    }

    /**
     * Define o valor da propriedade travelPathCalculator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionTravelPathCalculatorSettings }{@code >}
     *     
     */
    public void setTravelPathCalculator(JAXBElement<RegionTravelPathCalculatorSettings> value) {
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
     *     {@link JAXBElement }{@code <}{@link RegionVideoSettings }{@code >}
     *     
     */
    public JAXBElement<RegionVideoSettings> getVideo() {
        return video;
    }

    /**
     * Define o valor da propriedade video.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionVideoSettings }{@code >}
     *     
     */
    public void setVideo(JAXBElement<RegionVideoSettings> value) {
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
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getXrsOrganizationSid() {
        return xrsOrganizationSid;
    }

    /**
     * Define o valor da propriedade xrsOrganizationSid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setXrsOrganizationSid(JAXBElement<Long> value) {
        this.xrsOrganizationSid = value;
    }

}
