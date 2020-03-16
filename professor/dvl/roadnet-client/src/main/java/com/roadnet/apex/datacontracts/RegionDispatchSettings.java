
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.DispatchSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.DispatchSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowPlanChangesForStartedRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsiderCurrentTimeWhenCalculatingRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreatePlannedOriginOnRouteLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableAutonomousDispatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableAutonomousOptimizationAssignOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableAutonomousOptimizationSequenceRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableDistanceByJurisdiction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FleetViewMissedServiceWindowThresholdMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FutureTimestampTolerance" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MobileDataSource_ArrivalDepartureDataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileDataSource_PositionDataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileDataSource_WorkerStatusSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseTelematicsAsMobileLocationDataSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseTravelSpeedAsFallback" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.DispatchSettings", propOrder = {
    "allowPlanChangesForStartedRoutes",
    "considerCurrentTimeWhenCalculatingRoutes",
    "createPlannedOriginOnRouteLoad",
    "enableAutonomousDispatch",
    "enableAutonomousOptimizationAssignOrders",
    "enableAutonomousOptimizationSequenceRoutes",
    "enableDistanceByJurisdiction",
    "fleetViewMissedServiceWindowThresholdMinutes",
    "futureTimestampTolerance",
    "mobileDataSourceArrivalDepartureDataSource",
    "mobileDataSourcePositionDataSource",
    "mobileDataSourceWorkerStatusSource",
    "useTelematicsAsMobileLocationDataSource",
    "useTravelSpeedAsFallback"
})
public class RegionDispatchSettings
    extends DataTransferObject
{

    @XmlElement(name = "AllowPlanChangesForStartedRoutes")
    protected Boolean allowPlanChangesForStartedRoutes;
    @XmlElement(name = "ConsiderCurrentTimeWhenCalculatingRoutes")
    protected Boolean considerCurrentTimeWhenCalculatingRoutes;
    @XmlElement(name = "CreatePlannedOriginOnRouteLoad")
    protected Boolean createPlannedOriginOnRouteLoad;
    @XmlElement(name = "EnableAutonomousDispatch")
    protected Boolean enableAutonomousDispatch;
    @XmlElement(name = "EnableAutonomousOptimizationAssignOrders")
    protected Boolean enableAutonomousOptimizationAssignOrders;
    @XmlElement(name = "EnableAutonomousOptimizationSequenceRoutes")
    protected Boolean enableAutonomousOptimizationSequenceRoutes;
    @XmlElement(name = "EnableDistanceByJurisdiction")
    protected Boolean enableDistanceByJurisdiction;
    @XmlElementRef(name = "FleetViewMissedServiceWindowThresholdMinutes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fleetViewMissedServiceWindowThresholdMinutes;
    @XmlElement(name = "FutureTimestampTolerance")
    protected Duration futureTimestampTolerance;
    @XmlElementRef(name = "MobileDataSource_ArrivalDepartureDataSource", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileDataSourceArrivalDepartureDataSource;
    @XmlElementRef(name = "MobileDataSource_PositionDataSource", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileDataSourcePositionDataSource;
    @XmlElementRef(name = "MobileDataSource_WorkerStatusSource", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileDataSourceWorkerStatusSource;
    @XmlElement(name = "UseTelematicsAsMobileLocationDataSource")
    protected Boolean useTelematicsAsMobileLocationDataSource;
    @XmlElement(name = "UseTravelSpeedAsFallback")
    protected Boolean useTravelSpeedAsFallback;

    /**
     * Obtém o valor da propriedade allowPlanChangesForStartedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPlanChangesForStartedRoutes() {
        return allowPlanChangesForStartedRoutes;
    }

    /**
     * Define o valor da propriedade allowPlanChangesForStartedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPlanChangesForStartedRoutes(Boolean value) {
        this.allowPlanChangesForStartedRoutes = value;
    }

    /**
     * Obtém o valor da propriedade considerCurrentTimeWhenCalculatingRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsiderCurrentTimeWhenCalculatingRoutes() {
        return considerCurrentTimeWhenCalculatingRoutes;
    }

    /**
     * Define o valor da propriedade considerCurrentTimeWhenCalculatingRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsiderCurrentTimeWhenCalculatingRoutes(Boolean value) {
        this.considerCurrentTimeWhenCalculatingRoutes = value;
    }

    /**
     * Obtém o valor da propriedade createPlannedOriginOnRouteLoad.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatePlannedOriginOnRouteLoad() {
        return createPlannedOriginOnRouteLoad;
    }

    /**
     * Define o valor da propriedade createPlannedOriginOnRouteLoad.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatePlannedOriginOnRouteLoad(Boolean value) {
        this.createPlannedOriginOnRouteLoad = value;
    }

    /**
     * Obtém o valor da propriedade enableAutonomousDispatch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAutonomousDispatch() {
        return enableAutonomousDispatch;
    }

    /**
     * Define o valor da propriedade enableAutonomousDispatch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAutonomousDispatch(Boolean value) {
        this.enableAutonomousDispatch = value;
    }

    /**
     * Obtém o valor da propriedade enableAutonomousOptimizationAssignOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAutonomousOptimizationAssignOrders() {
        return enableAutonomousOptimizationAssignOrders;
    }

    /**
     * Define o valor da propriedade enableAutonomousOptimizationAssignOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAutonomousOptimizationAssignOrders(Boolean value) {
        this.enableAutonomousOptimizationAssignOrders = value;
    }

    /**
     * Obtém o valor da propriedade enableAutonomousOptimizationSequenceRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAutonomousOptimizationSequenceRoutes() {
        return enableAutonomousOptimizationSequenceRoutes;
    }

    /**
     * Define o valor da propriedade enableAutonomousOptimizationSequenceRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAutonomousOptimizationSequenceRoutes(Boolean value) {
        this.enableAutonomousOptimizationSequenceRoutes = value;
    }

    /**
     * Obtém o valor da propriedade enableDistanceByJurisdiction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDistanceByJurisdiction() {
        return enableDistanceByJurisdiction;
    }

    /**
     * Define o valor da propriedade enableDistanceByJurisdiction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDistanceByJurisdiction(Boolean value) {
        this.enableDistanceByJurisdiction = value;
    }

    /**
     * Obtém o valor da propriedade fleetViewMissedServiceWindowThresholdMinutes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFleetViewMissedServiceWindowThresholdMinutes() {
        return fleetViewMissedServiceWindowThresholdMinutes;
    }

    /**
     * Define o valor da propriedade fleetViewMissedServiceWindowThresholdMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFleetViewMissedServiceWindowThresholdMinutes(JAXBElement<Integer> value) {
        this.fleetViewMissedServiceWindowThresholdMinutes = value;
    }

    /**
     * Obtém o valor da propriedade futureTimestampTolerance.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFutureTimestampTolerance() {
        return futureTimestampTolerance;
    }

    /**
     * Define o valor da propriedade futureTimestampTolerance.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFutureTimestampTolerance(Duration value) {
        this.futureTimestampTolerance = value;
    }

    /**
     * Obtém o valor da propriedade mobileDataSourceArrivalDepartureDataSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileDataSourceArrivalDepartureDataSource() {
        return mobileDataSourceArrivalDepartureDataSource;
    }

    /**
     * Define o valor da propriedade mobileDataSourceArrivalDepartureDataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileDataSourceArrivalDepartureDataSource(JAXBElement<String> value) {
        this.mobileDataSourceArrivalDepartureDataSource = value;
    }

    /**
     * Obtém o valor da propriedade mobileDataSourcePositionDataSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileDataSourcePositionDataSource() {
        return mobileDataSourcePositionDataSource;
    }

    /**
     * Define o valor da propriedade mobileDataSourcePositionDataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileDataSourcePositionDataSource(JAXBElement<String> value) {
        this.mobileDataSourcePositionDataSource = value;
    }

    /**
     * Obtém o valor da propriedade mobileDataSourceWorkerStatusSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileDataSourceWorkerStatusSource() {
        return mobileDataSourceWorkerStatusSource;
    }

    /**
     * Define o valor da propriedade mobileDataSourceWorkerStatusSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileDataSourceWorkerStatusSource(JAXBElement<String> value) {
        this.mobileDataSourceWorkerStatusSource = value;
    }

    /**
     * Obtém o valor da propriedade useTelematicsAsMobileLocationDataSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTelematicsAsMobileLocationDataSource() {
        return useTelematicsAsMobileLocationDataSource;
    }

    /**
     * Define o valor da propriedade useTelematicsAsMobileLocationDataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTelematicsAsMobileLocationDataSource(Boolean value) {
        this.useTelematicsAsMobileLocationDataSource = value;
    }

    /**
     * Obtém o valor da propriedade useTravelSpeedAsFallback.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTravelSpeedAsFallback() {
        return useTravelSpeedAsFallback;
    }

    /**
     * Define o valor da propriedade useTravelSpeedAsFallback.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTravelSpeedAsFallback(Boolean value) {
        this.useTravelSpeedAsFallback = value;
    }

}
