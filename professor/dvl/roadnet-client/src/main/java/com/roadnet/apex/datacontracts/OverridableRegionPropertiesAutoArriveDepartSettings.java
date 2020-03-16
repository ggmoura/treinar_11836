
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.AutoArriveDepartSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.AutoArriveDepartSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociateUnknownStopsWithPOI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoArriveDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoArriveStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoCancelStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoCreateUnplannedServiceableStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoDepartOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoDepartStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoSequenceStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BreakArrivalDepartureMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BreakDepartureMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EarlyRouteDepartureTolerance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InactiveRouteCompletionTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LateRouteDepartureTolerance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumBreakDurationPercent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumRouteCompletionTimeAtDepot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumRouteDurationPercent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumUnknownStopTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PushBreaksAndLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequireTaskCompletionBeforeAutoDepart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAssignmentMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopResequenceMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseMinStopTimeForDestinationArrival" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UsePlannedCoArrivalSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.AutoArriveDepartSettings", propOrder = {
    "associateUnknownStopsWithPOI",
    "autoArriveDestination",
    "autoArriveStop",
    "autoCancelStops",
    "autoCreateUnplannedServiceableStops",
    "autoDepartOrigin",
    "autoDepartStop",
    "autoSequenceStops",
    "breakArrivalDepartureMethod",
    "breakDepartureMethod",
    "earlyRouteDepartureTolerance",
    "inactiveRouteCompletionTime",
    "lateRouteDepartureTolerance",
    "minimumBreakDurationPercent",
    "minimumRouteCompletionTimeAtDepot",
    "minimumRouteDurationPercent",
    "minimumServiceTime",
    "minimumUnknownStopTime",
    "pushBreaksAndLayovers",
    "requireTaskCompletionBeforeAutoDepart",
    "routeAssignmentMode",
    "stopResequenceMethod",
    "useMinStopTimeForDestinationArrival",
    "usePlannedCoArrivalSequence"
})
public class OverridableRegionPropertiesAutoArriveDepartSettings
    extends DataTransferObject
{

    @XmlElement(name = "AssociateUnknownStopsWithPOI")
    protected Boolean associateUnknownStopsWithPOI;
    @XmlElement(name = "AutoArriveDestination")
    protected Boolean autoArriveDestination;
    @XmlElement(name = "AutoArriveStop")
    protected Boolean autoArriveStop;
    @XmlElement(name = "AutoCancelStops")
    protected Boolean autoCancelStops;
    @XmlElement(name = "AutoCreateUnplannedServiceableStops")
    protected Boolean autoCreateUnplannedServiceableStops;
    @XmlElement(name = "AutoDepartOrigin")
    protected Boolean autoDepartOrigin;
    @XmlElement(name = "AutoDepartStop")
    protected Boolean autoDepartStop;
    @XmlElement(name = "AutoSequenceStops")
    protected Boolean autoSequenceStops;
    @XmlElement(name = "BreakArrivalDepartureMethod")
    protected Boolean breakArrivalDepartureMethod;
    @XmlElement(name = "BreakDepartureMethod")
    protected Boolean breakDepartureMethod;
    @XmlElement(name = "EarlyRouteDepartureTolerance")
    protected Boolean earlyRouteDepartureTolerance;
    @XmlElement(name = "InactiveRouteCompletionTime")
    protected Boolean inactiveRouteCompletionTime;
    @XmlElement(name = "LateRouteDepartureTolerance")
    protected Boolean lateRouteDepartureTolerance;
    @XmlElement(name = "MinimumBreakDurationPercent")
    protected Boolean minimumBreakDurationPercent;
    @XmlElement(name = "MinimumRouteCompletionTimeAtDepot")
    protected Boolean minimumRouteCompletionTimeAtDepot;
    @XmlElement(name = "MinimumRouteDurationPercent")
    protected Boolean minimumRouteDurationPercent;
    @XmlElement(name = "MinimumServiceTime")
    protected Boolean minimumServiceTime;
    @XmlElement(name = "MinimumUnknownStopTime")
    protected Boolean minimumUnknownStopTime;
    @XmlElement(name = "PushBreaksAndLayovers")
    protected Boolean pushBreaksAndLayovers;
    @XmlElement(name = "RequireTaskCompletionBeforeAutoDepart")
    protected Boolean requireTaskCompletionBeforeAutoDepart;
    @XmlElement(name = "RouteAssignmentMode")
    protected Boolean routeAssignmentMode;
    @XmlElement(name = "StopResequenceMethod")
    protected Boolean stopResequenceMethod;
    @XmlElement(name = "UseMinStopTimeForDestinationArrival")
    protected Boolean useMinStopTimeForDestinationArrival;
    @XmlElement(name = "UsePlannedCoArrivalSequence")
    protected Boolean usePlannedCoArrivalSequence;

    /**
     * Obtém o valor da propriedade associateUnknownStopsWithPOI.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssociateUnknownStopsWithPOI() {
        return associateUnknownStopsWithPOI;
    }

    /**
     * Define o valor da propriedade associateUnknownStopsWithPOI.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssociateUnknownStopsWithPOI(Boolean value) {
        this.associateUnknownStopsWithPOI = value;
    }

    /**
     * Obtém o valor da propriedade autoArriveDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoArriveDestination() {
        return autoArriveDestination;
    }

    /**
     * Define o valor da propriedade autoArriveDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoArriveDestination(Boolean value) {
        this.autoArriveDestination = value;
    }

    /**
     * Obtém o valor da propriedade autoArriveStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoArriveStop() {
        return autoArriveStop;
    }

    /**
     * Define o valor da propriedade autoArriveStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoArriveStop(Boolean value) {
        this.autoArriveStop = value;
    }

    /**
     * Obtém o valor da propriedade autoCancelStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCancelStops() {
        return autoCancelStops;
    }

    /**
     * Define o valor da propriedade autoCancelStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCancelStops(Boolean value) {
        this.autoCancelStops = value;
    }

    /**
     * Obtém o valor da propriedade autoCreateUnplannedServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCreateUnplannedServiceableStops() {
        return autoCreateUnplannedServiceableStops;
    }

    /**
     * Define o valor da propriedade autoCreateUnplannedServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCreateUnplannedServiceableStops(Boolean value) {
        this.autoCreateUnplannedServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade autoDepartOrigin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoDepartOrigin() {
        return autoDepartOrigin;
    }

    /**
     * Define o valor da propriedade autoDepartOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoDepartOrigin(Boolean value) {
        this.autoDepartOrigin = value;
    }

    /**
     * Obtém o valor da propriedade autoDepartStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoDepartStop() {
        return autoDepartStop;
    }

    /**
     * Define o valor da propriedade autoDepartStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoDepartStop(Boolean value) {
        this.autoDepartStop = value;
    }

    /**
     * Obtém o valor da propriedade autoSequenceStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoSequenceStops() {
        return autoSequenceStops;
    }

    /**
     * Define o valor da propriedade autoSequenceStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSequenceStops(Boolean value) {
        this.autoSequenceStops = value;
    }

    /**
     * Obtém o valor da propriedade breakArrivalDepartureMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBreakArrivalDepartureMethod() {
        return breakArrivalDepartureMethod;
    }

    /**
     * Define o valor da propriedade breakArrivalDepartureMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreakArrivalDepartureMethod(Boolean value) {
        this.breakArrivalDepartureMethod = value;
    }

    /**
     * Obtém o valor da propriedade breakDepartureMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBreakDepartureMethod() {
        return breakDepartureMethod;
    }

    /**
     * Define o valor da propriedade breakDepartureMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreakDepartureMethod(Boolean value) {
        this.breakDepartureMethod = value;
    }

    /**
     * Obtém o valor da propriedade earlyRouteDepartureTolerance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarlyRouteDepartureTolerance() {
        return earlyRouteDepartureTolerance;
    }

    /**
     * Define o valor da propriedade earlyRouteDepartureTolerance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEarlyRouteDepartureTolerance(Boolean value) {
        this.earlyRouteDepartureTolerance = value;
    }

    /**
     * Obtém o valor da propriedade inactiveRouteCompletionTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactiveRouteCompletionTime() {
        return inactiveRouteCompletionTime;
    }

    /**
     * Define o valor da propriedade inactiveRouteCompletionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactiveRouteCompletionTime(Boolean value) {
        this.inactiveRouteCompletionTime = value;
    }

    /**
     * Obtém o valor da propriedade lateRouteDepartureTolerance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLateRouteDepartureTolerance() {
        return lateRouteDepartureTolerance;
    }

    /**
     * Define o valor da propriedade lateRouteDepartureTolerance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLateRouteDepartureTolerance(Boolean value) {
        this.lateRouteDepartureTolerance = value;
    }

    /**
     * Obtém o valor da propriedade minimumBreakDurationPercent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumBreakDurationPercent() {
        return minimumBreakDurationPercent;
    }

    /**
     * Define o valor da propriedade minimumBreakDurationPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumBreakDurationPercent(Boolean value) {
        this.minimumBreakDurationPercent = value;
    }

    /**
     * Obtém o valor da propriedade minimumRouteCompletionTimeAtDepot.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumRouteCompletionTimeAtDepot() {
        return minimumRouteCompletionTimeAtDepot;
    }

    /**
     * Define o valor da propriedade minimumRouteCompletionTimeAtDepot.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumRouteCompletionTimeAtDepot(Boolean value) {
        this.minimumRouteCompletionTimeAtDepot = value;
    }

    /**
     * Obtém o valor da propriedade minimumRouteDurationPercent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumRouteDurationPercent() {
        return minimumRouteDurationPercent;
    }

    /**
     * Define o valor da propriedade minimumRouteDurationPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumRouteDurationPercent(Boolean value) {
        this.minimumRouteDurationPercent = value;
    }

    /**
     * Obtém o valor da propriedade minimumServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumServiceTime() {
        return minimumServiceTime;
    }

    /**
     * Define o valor da propriedade minimumServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumServiceTime(Boolean value) {
        this.minimumServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade minimumUnknownStopTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumUnknownStopTime() {
        return minimumUnknownStopTime;
    }

    /**
     * Define o valor da propriedade minimumUnknownStopTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumUnknownStopTime(Boolean value) {
        this.minimumUnknownStopTime = value;
    }

    /**
     * Obtém o valor da propriedade pushBreaksAndLayovers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPushBreaksAndLayovers() {
        return pushBreaksAndLayovers;
    }

    /**
     * Define o valor da propriedade pushBreaksAndLayovers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPushBreaksAndLayovers(Boolean value) {
        this.pushBreaksAndLayovers = value;
    }

    /**
     * Obtém o valor da propriedade requireTaskCompletionBeforeAutoDepart.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireTaskCompletionBeforeAutoDepart() {
        return requireTaskCompletionBeforeAutoDepart;
    }

    /**
     * Define o valor da propriedade requireTaskCompletionBeforeAutoDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireTaskCompletionBeforeAutoDepart(Boolean value) {
        this.requireTaskCompletionBeforeAutoDepart = value;
    }

    /**
     * Obtém o valor da propriedade routeAssignmentMode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteAssignmentMode() {
        return routeAssignmentMode;
    }

    /**
     * Define o valor da propriedade routeAssignmentMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteAssignmentMode(Boolean value) {
        this.routeAssignmentMode = value;
    }

    /**
     * Obtém o valor da propriedade stopResequenceMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopResequenceMethod() {
        return stopResequenceMethod;
    }

    /**
     * Define o valor da propriedade stopResequenceMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopResequenceMethod(Boolean value) {
        this.stopResequenceMethod = value;
    }

    /**
     * Obtém o valor da propriedade useMinStopTimeForDestinationArrival.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMinStopTimeForDestinationArrival() {
        return useMinStopTimeForDestinationArrival;
    }

    /**
     * Define o valor da propriedade useMinStopTimeForDestinationArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMinStopTimeForDestinationArrival(Boolean value) {
        this.useMinStopTimeForDestinationArrival = value;
    }

    /**
     * Obtém o valor da propriedade usePlannedCoArrivalSequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePlannedCoArrivalSequence() {
        return usePlannedCoArrivalSequence;
    }

    /**
     * Define o valor da propriedade usePlannedCoArrivalSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePlannedCoArrivalSequence(Boolean value) {
        this.usePlannedCoArrivalSequence = value;
    }

}
