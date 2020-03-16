
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcknowledgeRouteExceptionsOnArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AcknowledgeRouteNotesOnArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoArriveDepart" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.AutoArriveDepartSettings" minOccurs="0"/&gt;
 *         &lt;element name="AutonomousOptimization" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.AutonomousOptimizationSettings" minOccurs="0"/&gt;
 *         &lt;element name="BusinessWeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CombineOrders" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.CombineOrdersSettings" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceAddress" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.ComplianceAddressSettings" minOccurs="0"/&gt;
 *         &lt;element name="CostOfFuel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DVIR" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.DVIRSettings" minOccurs="0"/&gt;
 *         &lt;element name="Defaults" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.DefaultSettings" minOccurs="0"/&gt;
 *         &lt;element name="Dispatch" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.DispatchSettings" minOccurs="0"/&gt;
 *         &lt;element name="EarliestRoutingSessionDateOfCalculatedRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuraciesRequiringAttention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Hos" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.HosSettings" minOccurs="0"/&gt;
 *         &lt;element name="Ifta" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.IftaSettings" minOccurs="0"/&gt;
 *         &lt;element name="MobileDevice" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.MobileDeviceSettings" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigation" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.OmnitracsNavigationSettings" minOccurs="0"/&gt;
 *         &lt;element name="Performance" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.PerformanceSettings" minOccurs="0"/&gt;
 *         &lt;element name="RecalculateConvertedRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedOperatingTimes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAlertOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessions" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.RoutingSessionsSettings" minOccurs="0"/&gt;
 *         &lt;element name="Search" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.SearchSettings" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRadius" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StationaryEvent" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.StationaryEventSettings" minOccurs="0"/&gt;
 *         &lt;element name="StopAlertOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopTemplateAlertOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StreetSideTravelRules" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.StreetSideLocationTravelRules" minOccurs="0"/&gt;
 *         &lt;element name="Telematics" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.TelematicsSettings" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimitToArchiveCompletedRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimitToArchivePlannedRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixBuildRequestSenderEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixBuildStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixLastBuildCompleteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixLastBuildRequestSendTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixLastBuildServerName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixLastMessageDequeuedSentTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixLastMessageDequeuedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransitMatrixTimeOfDayToSendBuildRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelPathCalculator" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.TravelPathCalculatorSettings" minOccurs="0"/&gt;
 *         &lt;element name="UseLineItemsToCalculateOrderSizes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseSingleFixedServiceTimeForSameCoordinateStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Video" type="{http://roadnet.com/apex/DataContracts/}OverridableRegionProperties.VideoSettings" minOccurs="0"/&gt;
 *         &lt;element name="WarnBeforeDispatchingRouteWithNoEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WarnBeforeDispatchingRouteWithNoWorker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties", propOrder = {
    "acknowledgeRouteExceptionsOnArchive",
    "acknowledgeRouteNotesOnArchive",
    "autoArriveDepart",
    "autonomousOptimization",
    "businessWeek",
    "combineOrders",
    "complianceAddress",
    "costOfFuel",
    "dvir",
    "defaults",
    "dispatch",
    "earliestRoutingSessionDateOfCalculatedRoutes",
    "geocodeAccuraciesRequiringAttention",
    "hos",
    "ifta",
    "mobileDevice",
    "omnitracsNavigation",
    "performance",
    "recalculateConvertedRoutes",
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
    "transitMatrixBuildStatus",
    "transitMatrixLastBuildCompleteTime",
    "transitMatrixLastBuildRequestSendTime",
    "transitMatrixLastBuildServerName",
    "transitMatrixLastMessageDequeuedSentTime",
    "transitMatrixLastMessageDequeuedTime",
    "transitMatrixTimeOfDayToSendBuildRequest",
    "travelPathCalculator",
    "useLineItemsToCalculateOrderSizes",
    "useSingleFixedServiceTimeForSameCoordinateStops",
    "video",
    "warnBeforeDispatchingRouteWithNoEquipment",
    "warnBeforeDispatchingRouteWithNoWorker"
})
public class OverridableRegionProperties
    extends DataTransferObject
{

    @XmlElement(name = "AcknowledgeRouteExceptionsOnArchive")
    protected Boolean acknowledgeRouteExceptionsOnArchive;
    @XmlElement(name = "AcknowledgeRouteNotesOnArchive")
    protected Boolean acknowledgeRouteNotesOnArchive;
    @XmlElementRef(name = "AutoArriveDepart", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesAutoArriveDepartSettings> autoArriveDepart;
    @XmlElementRef(name = "AutonomousOptimization", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesAutonomousOptimizationSettings> autonomousOptimization;
    @XmlElement(name = "BusinessWeek")
    protected Boolean businessWeek;
    @XmlElementRef(name = "CombineOrders", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesCombineOrdersSettings> combineOrders;
    @XmlElementRef(name = "ComplianceAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesComplianceAddressSettings> complianceAddress;
    @XmlElement(name = "CostOfFuel")
    protected Boolean costOfFuel;
    @XmlElementRef(name = "DVIR", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesDVIRSettings> dvir;
    @XmlElementRef(name = "Defaults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesDefaultSettings> defaults;
    @XmlElementRef(name = "Dispatch", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesDispatchSettings> dispatch;
    @XmlElement(name = "EarliestRoutingSessionDateOfCalculatedRoutes")
    protected Boolean earliestRoutingSessionDateOfCalculatedRoutes;
    @XmlElement(name = "GeocodeAccuraciesRequiringAttention")
    protected Boolean geocodeAccuraciesRequiringAttention;
    @XmlElementRef(name = "Hos", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesHosSettings> hos;
    @XmlElementRef(name = "Ifta", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesIftaSettings> ifta;
    @XmlElementRef(name = "MobileDevice", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesMobileDeviceSettings> mobileDevice;
    @XmlElementRef(name = "OmnitracsNavigation", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesOmnitracsNavigationSettings> omnitracsNavigation;
    @XmlElementRef(name = "Performance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesPerformanceSettings> performance;
    @XmlElement(name = "RecalculateConvertedRoutes")
    protected Boolean recalculateConvertedRoutes;
    @XmlElement(name = "RestrictedOperatingTimes")
    protected Boolean restrictedOperatingTimes;
    @XmlElement(name = "RouteAlertOptions")
    protected Boolean routeAlertOptions;
    @XmlElementRef(name = "RoutingSessions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesRoutingSessionsSettings> routingSessions;
    @XmlElementRef(name = "Search", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesSearchSettings> search;
    @XmlElement(name = "ServiceRadius")
    protected Boolean serviceRadius;
    @XmlElementRef(name = "StationaryEvent", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesStationaryEventSettings> stationaryEvent;
    @XmlElement(name = "StopAlertOptions")
    protected Boolean stopAlertOptions;
    @XmlElement(name = "StopTemplateAlertOptions")
    protected Boolean stopTemplateAlertOptions;
    @XmlElementRef(name = "StreetSideTravelRules", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesStreetSideLocationTravelRules> streetSideTravelRules;
    @XmlElementRef(name = "Telematics", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesTelematicsSettings> telematics;
    @XmlElement(name = "TimeLimitToArchiveCompletedRoutes")
    protected Boolean timeLimitToArchiveCompletedRoutes;
    @XmlElement(name = "TimeLimitToArchivePlannedRoutes")
    protected Boolean timeLimitToArchivePlannedRoutes;
    @XmlElement(name = "TransitMatrixBuildRequestSenderEnabled")
    protected Boolean transitMatrixBuildRequestSenderEnabled;
    @XmlElement(name = "TransitMatrixBuildStatus")
    protected Boolean transitMatrixBuildStatus;
    @XmlElement(name = "TransitMatrixLastBuildCompleteTime")
    protected Boolean transitMatrixLastBuildCompleteTime;
    @XmlElement(name = "TransitMatrixLastBuildRequestSendTime")
    protected Boolean transitMatrixLastBuildRequestSendTime;
    @XmlElement(name = "TransitMatrixLastBuildServerName")
    protected Boolean transitMatrixLastBuildServerName;
    @XmlElement(name = "TransitMatrixLastMessageDequeuedSentTime")
    protected Boolean transitMatrixLastMessageDequeuedSentTime;
    @XmlElement(name = "TransitMatrixLastMessageDequeuedTime")
    protected Boolean transitMatrixLastMessageDequeuedTime;
    @XmlElement(name = "TransitMatrixTimeOfDayToSendBuildRequest")
    protected Boolean transitMatrixTimeOfDayToSendBuildRequest;
    @XmlElementRef(name = "TravelPathCalculator", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesTravelPathCalculatorSettings> travelPathCalculator;
    @XmlElement(name = "UseLineItemsToCalculateOrderSizes")
    protected Boolean useLineItemsToCalculateOrderSizes;
    @XmlElement(name = "UseSingleFixedServiceTimeForSameCoordinateStops")
    protected Boolean useSingleFixedServiceTimeForSameCoordinateStops;
    @XmlElementRef(name = "Video", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OverridableRegionPropertiesVideoSettings> video;
    @XmlElement(name = "WarnBeforeDispatchingRouteWithNoEquipment")
    protected Boolean warnBeforeDispatchingRouteWithNoEquipment;
    @XmlElement(name = "WarnBeforeDispatchingRouteWithNoWorker")
    protected Boolean warnBeforeDispatchingRouteWithNoWorker;

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
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesAutoArriveDepartSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesAutoArriveDepartSettings> getAutoArriveDepart() {
        return autoArriveDepart;
    }

    /**
     * Define o valor da propriedade autoArriveDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesAutoArriveDepartSettings }{@code >}
     *     
     */
    public void setAutoArriveDepart(JAXBElement<OverridableRegionPropertiesAutoArriveDepartSettings> value) {
        this.autoArriveDepart = value;
    }

    /**
     * Obtém o valor da propriedade autonomousOptimization.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesAutonomousOptimizationSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesAutonomousOptimizationSettings> getAutonomousOptimization() {
        return autonomousOptimization;
    }

    /**
     * Define o valor da propriedade autonomousOptimization.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesAutonomousOptimizationSettings }{@code >}
     *     
     */
    public void setAutonomousOptimization(JAXBElement<OverridableRegionPropertiesAutonomousOptimizationSettings> value) {
        this.autonomousOptimization = value;
    }

    /**
     * Obtém o valor da propriedade businessWeek.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessWeek() {
        return businessWeek;
    }

    /**
     * Define o valor da propriedade businessWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessWeek(Boolean value) {
        this.businessWeek = value;
    }

    /**
     * Obtém o valor da propriedade combineOrders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesCombineOrdersSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesCombineOrdersSettings> getCombineOrders() {
        return combineOrders;
    }

    /**
     * Define o valor da propriedade combineOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesCombineOrdersSettings }{@code >}
     *     
     */
    public void setCombineOrders(JAXBElement<OverridableRegionPropertiesCombineOrdersSettings> value) {
        this.combineOrders = value;
    }

    /**
     * Obtém o valor da propriedade complianceAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesComplianceAddressSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesComplianceAddressSettings> getComplianceAddress() {
        return complianceAddress;
    }

    /**
     * Define o valor da propriedade complianceAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesComplianceAddressSettings }{@code >}
     *     
     */
    public void setComplianceAddress(JAXBElement<OverridableRegionPropertiesComplianceAddressSettings> value) {
        this.complianceAddress = value;
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
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesDVIRSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesDVIRSettings> getDVIR() {
        return dvir;
    }

    /**
     * Define o valor da propriedade dvir.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesDVIRSettings }{@code >}
     *     
     */
    public void setDVIR(JAXBElement<OverridableRegionPropertiesDVIRSettings> value) {
        this.dvir = value;
    }

    /**
     * Obtém o valor da propriedade defaults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesDefaultSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesDefaultSettings> getDefaults() {
        return defaults;
    }

    /**
     * Define o valor da propriedade defaults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesDefaultSettings }{@code >}
     *     
     */
    public void setDefaults(JAXBElement<OverridableRegionPropertiesDefaultSettings> value) {
        this.defaults = value;
    }

    /**
     * Obtém o valor da propriedade dispatch.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesDispatchSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesDispatchSettings> getDispatch() {
        return dispatch;
    }

    /**
     * Define o valor da propriedade dispatch.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesDispatchSettings }{@code >}
     *     
     */
    public void setDispatch(JAXBElement<OverridableRegionPropertiesDispatchSettings> value) {
        this.dispatch = value;
    }

    /**
     * Obtém o valor da propriedade earliestRoutingSessionDateOfCalculatedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarliestRoutingSessionDateOfCalculatedRoutes() {
        return earliestRoutingSessionDateOfCalculatedRoutes;
    }

    /**
     * Define o valor da propriedade earliestRoutingSessionDateOfCalculatedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEarliestRoutingSessionDateOfCalculatedRoutes(Boolean value) {
        this.earliestRoutingSessionDateOfCalculatedRoutes = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuraciesRequiringAttention.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAccuraciesRequiringAttention() {
        return geocodeAccuraciesRequiringAttention;
    }

    /**
     * Define o valor da propriedade geocodeAccuraciesRequiringAttention.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAccuraciesRequiringAttention(Boolean value) {
        this.geocodeAccuraciesRequiringAttention = value;
    }

    /**
     * Obtém o valor da propriedade hos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesHosSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesHosSettings> getHos() {
        return hos;
    }

    /**
     * Define o valor da propriedade hos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesHosSettings }{@code >}
     *     
     */
    public void setHos(JAXBElement<OverridableRegionPropertiesHosSettings> value) {
        this.hos = value;
    }

    /**
     * Obtém o valor da propriedade ifta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesIftaSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesIftaSettings> getIfta() {
        return ifta;
    }

    /**
     * Define o valor da propriedade ifta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesIftaSettings }{@code >}
     *     
     */
    public void setIfta(JAXBElement<OverridableRegionPropertiesIftaSettings> value) {
        this.ifta = value;
    }

    /**
     * Obtém o valor da propriedade mobileDevice.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesMobileDeviceSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesMobileDeviceSettings> getMobileDevice() {
        return mobileDevice;
    }

    /**
     * Define o valor da propriedade mobileDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesMobileDeviceSettings }{@code >}
     *     
     */
    public void setMobileDevice(JAXBElement<OverridableRegionPropertiesMobileDeviceSettings> value) {
        this.mobileDevice = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesOmnitracsNavigationSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesOmnitracsNavigationSettings> getOmnitracsNavigation() {
        return omnitracsNavigation;
    }

    /**
     * Define o valor da propriedade omnitracsNavigation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesOmnitracsNavigationSettings }{@code >}
     *     
     */
    public void setOmnitracsNavigation(JAXBElement<OverridableRegionPropertiesOmnitracsNavigationSettings> value) {
        this.omnitracsNavigation = value;
    }

    /**
     * Obtém o valor da propriedade performance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesPerformanceSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesPerformanceSettings> getPerformance() {
        return performance;
    }

    /**
     * Define o valor da propriedade performance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesPerformanceSettings }{@code >}
     *     
     */
    public void setPerformance(JAXBElement<OverridableRegionPropertiesPerformanceSettings> value) {
        this.performance = value;
    }

    /**
     * Obtém o valor da propriedade recalculateConvertedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecalculateConvertedRoutes() {
        return recalculateConvertedRoutes;
    }

    /**
     * Define o valor da propriedade recalculateConvertedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecalculateConvertedRoutes(Boolean value) {
        this.recalculateConvertedRoutes = value;
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
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesRoutingSessionsSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesRoutingSessionsSettings> getRoutingSessions() {
        return routingSessions;
    }

    /**
     * Define o valor da propriedade routingSessions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesRoutingSessionsSettings }{@code >}
     *     
     */
    public void setRoutingSessions(JAXBElement<OverridableRegionPropertiesRoutingSessionsSettings> value) {
        this.routingSessions = value;
    }

    /**
     * Obtém o valor da propriedade search.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesSearchSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesSearchSettings> getSearch() {
        return search;
    }

    /**
     * Define o valor da propriedade search.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesSearchSettings }{@code >}
     *     
     */
    public void setSearch(JAXBElement<OverridableRegionPropertiesSearchSettings> value) {
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
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesStationaryEventSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesStationaryEventSettings> getStationaryEvent() {
        return stationaryEvent;
    }

    /**
     * Define o valor da propriedade stationaryEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesStationaryEventSettings }{@code >}
     *     
     */
    public void setStationaryEvent(JAXBElement<OverridableRegionPropertiesStationaryEventSettings> value) {
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
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesStreetSideLocationTravelRules }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesStreetSideLocationTravelRules> getStreetSideTravelRules() {
        return streetSideTravelRules;
    }

    /**
     * Define o valor da propriedade streetSideTravelRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesStreetSideLocationTravelRules }{@code >}
     *     
     */
    public void setStreetSideTravelRules(JAXBElement<OverridableRegionPropertiesStreetSideLocationTravelRules> value) {
        this.streetSideTravelRules = value;
    }

    /**
     * Obtém o valor da propriedade telematics.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesTelematicsSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesTelematicsSettings> getTelematics() {
        return telematics;
    }

    /**
     * Define o valor da propriedade telematics.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesTelematicsSettings }{@code >}
     *     
     */
    public void setTelematics(JAXBElement<OverridableRegionPropertiesTelematicsSettings> value) {
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
     * Obtém o valor da propriedade transitMatrixBuildStatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransitMatrixBuildStatus() {
        return transitMatrixBuildStatus;
    }

    /**
     * Define o valor da propriedade transitMatrixBuildStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransitMatrixBuildStatus(Boolean value) {
        this.transitMatrixBuildStatus = value;
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
     * Obtém o valor da propriedade transitMatrixLastBuildServerName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransitMatrixLastBuildServerName() {
        return transitMatrixLastBuildServerName;
    }

    /**
     * Define o valor da propriedade transitMatrixLastBuildServerName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransitMatrixLastBuildServerName(Boolean value) {
        this.transitMatrixLastBuildServerName = value;
    }

    /**
     * Obtém o valor da propriedade transitMatrixLastMessageDequeuedSentTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransitMatrixLastMessageDequeuedSentTime() {
        return transitMatrixLastMessageDequeuedSentTime;
    }

    /**
     * Define o valor da propriedade transitMatrixLastMessageDequeuedSentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransitMatrixLastMessageDequeuedSentTime(Boolean value) {
        this.transitMatrixLastMessageDequeuedSentTime = value;
    }

    /**
     * Obtém o valor da propriedade transitMatrixLastMessageDequeuedTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransitMatrixLastMessageDequeuedTime() {
        return transitMatrixLastMessageDequeuedTime;
    }

    /**
     * Define o valor da propriedade transitMatrixLastMessageDequeuedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransitMatrixLastMessageDequeuedTime(Boolean value) {
        this.transitMatrixLastMessageDequeuedTime = value;
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
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesTravelPathCalculatorSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesTravelPathCalculatorSettings> getTravelPathCalculator() {
        return travelPathCalculator;
    }

    /**
     * Define o valor da propriedade travelPathCalculator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesTravelPathCalculatorSettings }{@code >}
     *     
     */
    public void setTravelPathCalculator(JAXBElement<OverridableRegionPropertiesTravelPathCalculatorSettings> value) {
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
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesVideoSettings }{@code >}
     *     
     */
    public JAXBElement<OverridableRegionPropertiesVideoSettings> getVideo() {
        return video;
    }

    /**
     * Define o valor da propriedade video.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OverridableRegionPropertiesVideoSettings }{@code >}
     *     
     */
    public void setVideo(JAXBElement<OverridableRegionPropertiesVideoSettings> value) {
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

}
