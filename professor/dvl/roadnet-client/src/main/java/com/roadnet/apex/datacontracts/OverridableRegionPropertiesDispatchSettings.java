
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.DispatchSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.DispatchSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowPlanChangesForStartedRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalDepartureDataSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsiderCurrentTimeWhenCalculatingRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreatePlannedOriginOnRouteLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableAutonomousDispatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableAutonomousOptimizationAssignOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableAutonomousOptimizationSequenceRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableDistanceByJurisdiction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FleetViewMissedServiceWindowThresholdMinutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FutureTimestampTolerance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PositionDataSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseTelematicsAsMobileLocationDataSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseTravelSpeedAsFallback" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerStatusSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.DispatchSettings", propOrder = {
    "allowPlanChangesForStartedRoutes",
    "arrivalDepartureDataSource",
    "considerCurrentTimeWhenCalculatingRoutes",
    "createPlannedOriginOnRouteLoad",
    "enableAutonomousDispatch",
    "enableAutonomousOptimizationAssignOrders",
    "enableAutonomousOptimizationSequenceRoutes",
    "enableDistanceByJurisdiction",
    "fleetViewMissedServiceWindowThresholdMinutes",
    "futureTimestampTolerance",
    "positionDataSource",
    "useTelematicsAsMobileLocationDataSource",
    "useTravelSpeedAsFallback",
    "workerStatusSource"
})
public class OverridableRegionPropertiesDispatchSettings
    extends DataTransferObject
{

    @XmlElement(name = "AllowPlanChangesForStartedRoutes")
    protected Boolean allowPlanChangesForStartedRoutes;
    @XmlElement(name = "ArrivalDepartureDataSource")
    protected Boolean arrivalDepartureDataSource;
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
    @XmlElement(name = "FleetViewMissedServiceWindowThresholdMinutes")
    protected Boolean fleetViewMissedServiceWindowThresholdMinutes;
    @XmlElement(name = "FutureTimestampTolerance")
    protected Boolean futureTimestampTolerance;
    @XmlElement(name = "PositionDataSource")
    protected Boolean positionDataSource;
    @XmlElement(name = "UseTelematicsAsMobileLocationDataSource")
    protected Boolean useTelematicsAsMobileLocationDataSource;
    @XmlElement(name = "UseTravelSpeedAsFallback")
    protected Boolean useTravelSpeedAsFallback;
    @XmlElement(name = "WorkerStatusSource")
    protected Boolean workerStatusSource;

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
     * Obtém o valor da propriedade arrivalDepartureDataSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrivalDepartureDataSource() {
        return arrivalDepartureDataSource;
    }

    /**
     * Define o valor da propriedade arrivalDepartureDataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrivalDepartureDataSource(Boolean value) {
        this.arrivalDepartureDataSource = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isFleetViewMissedServiceWindowThresholdMinutes() {
        return fleetViewMissedServiceWindowThresholdMinutes;
    }

    /**
     * Define o valor da propriedade fleetViewMissedServiceWindowThresholdMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFleetViewMissedServiceWindowThresholdMinutes(Boolean value) {
        this.fleetViewMissedServiceWindowThresholdMinutes = value;
    }

    /**
     * Obtém o valor da propriedade futureTimestampTolerance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFutureTimestampTolerance() {
        return futureTimestampTolerance;
    }

    /**
     * Define o valor da propriedade futureTimestampTolerance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFutureTimestampTolerance(Boolean value) {
        this.futureTimestampTolerance = value;
    }

    /**
     * Obtém o valor da propriedade positionDataSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPositionDataSource() {
        return positionDataSource;
    }

    /**
     * Define o valor da propriedade positionDataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPositionDataSource(Boolean value) {
        this.positionDataSource = value;
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

    /**
     * Obtém o valor da propriedade workerStatusSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerStatusSource() {
        return workerStatusSource;
    }

    /**
     * Define o valor da propriedade workerStatusSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerStatusSource(Boolean value) {
        this.workerStatusSource = value;
    }

}
