
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
 * <p>Classe Java de Region.AutoArriveDepartSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.AutoArriveDepartSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociateUnknownStopsWithPOI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoArriveDepartEnabledForMobileDevices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoArriveDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoArriveStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoCancelStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoCreateUnplannedServiceableStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoDepartOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoDepartStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoSequenceStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BreakArrivalDepartureMethod_BreakArrivalDepartureMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BreakAutoDepartureMethod_BreakDepartureMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EarlyRouteDepartureTolerance" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="InactiveRouteCompletionTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="LateRouteDepartureTolerance" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinimumBreakDurationPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MinimumRouteCompletionTimeAtDepot" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinimumRouteDurationPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MinimumServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinimumUnknownStopTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PushBreaksAndLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequireTaskCompletionBeforeAutoDepart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAssignmentMode_RouteAssignmentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopResequenceMethod_StopResequenceMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Region.AutoArriveDepartSettings", propOrder = {
    "associateUnknownStopsWithPOI",
    "autoArriveDepartEnabledForMobileDevices",
    "autoArriveDestination",
    "autoArriveStop",
    "autoCancelStops",
    "autoCreateUnplannedServiceableStops",
    "autoDepartOrigin",
    "autoDepartStop",
    "autoSequenceStops",
    "breakArrivalDepartureMethodBreakArrivalDepartureMethod",
    "breakAutoDepartureMethodBreakDepartureMethod",
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
    "routeAssignmentModeRouteAssignmentMode",
    "stopResequenceMethodStopResequenceMethod",
    "useMinStopTimeForDestinationArrival",
    "usePlannedCoArrivalSequence"
})
public class RegionAutoArriveDepartSettings
    extends DataTransferObject
{

    @XmlElement(name = "AssociateUnknownStopsWithPOI")
    protected Boolean associateUnknownStopsWithPOI;
    @XmlElement(name = "AutoArriveDepartEnabledForMobileDevices")
    protected Boolean autoArriveDepartEnabledForMobileDevices;
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
    @XmlElementRef(name = "BreakArrivalDepartureMethod_BreakArrivalDepartureMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> breakArrivalDepartureMethodBreakArrivalDepartureMethod;
    @XmlElementRef(name = "BreakAutoDepartureMethod_BreakDepartureMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> breakAutoDepartureMethodBreakDepartureMethod;
    @XmlElement(name = "EarlyRouteDepartureTolerance")
    protected Duration earlyRouteDepartureTolerance;
    @XmlElementRef(name = "InactiveRouteCompletionTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> inactiveRouteCompletionTime;
    @XmlElement(name = "LateRouteDepartureTolerance")
    protected Duration lateRouteDepartureTolerance;
    @XmlElement(name = "MinimumBreakDurationPercent")
    protected Double minimumBreakDurationPercent;
    @XmlElement(name = "MinimumRouteCompletionTimeAtDepot")
    protected Duration minimumRouteCompletionTimeAtDepot;
    @XmlElement(name = "MinimumRouteDurationPercent")
    protected Double minimumRouteDurationPercent;
    @XmlElement(name = "MinimumServiceTime")
    protected Duration minimumServiceTime;
    @XmlElement(name = "MinimumUnknownStopTime")
    protected Duration minimumUnknownStopTime;
    @XmlElement(name = "PushBreaksAndLayovers")
    protected Boolean pushBreaksAndLayovers;
    @XmlElement(name = "RequireTaskCompletionBeforeAutoDepart")
    protected Boolean requireTaskCompletionBeforeAutoDepart;
    @XmlElementRef(name = "RouteAssignmentMode_RouteAssignmentMode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeAssignmentModeRouteAssignmentMode;
    @XmlElementRef(name = "StopResequenceMethod_StopResequenceMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopResequenceMethodStopResequenceMethod;
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
     * Obtém o valor da propriedade autoArriveDepartEnabledForMobileDevices.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoArriveDepartEnabledForMobileDevices() {
        return autoArriveDepartEnabledForMobileDevices;
    }

    /**
     * Define o valor da propriedade autoArriveDepartEnabledForMobileDevices.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoArriveDepartEnabledForMobileDevices(Boolean value) {
        this.autoArriveDepartEnabledForMobileDevices = value;
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
     * Obtém o valor da propriedade breakArrivalDepartureMethodBreakArrivalDepartureMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBreakArrivalDepartureMethodBreakArrivalDepartureMethod() {
        return breakArrivalDepartureMethodBreakArrivalDepartureMethod;
    }

    /**
     * Define o valor da propriedade breakArrivalDepartureMethodBreakArrivalDepartureMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBreakArrivalDepartureMethodBreakArrivalDepartureMethod(JAXBElement<String> value) {
        this.breakArrivalDepartureMethodBreakArrivalDepartureMethod = value;
    }

    /**
     * Obtém o valor da propriedade breakAutoDepartureMethodBreakDepartureMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBreakAutoDepartureMethodBreakDepartureMethod() {
        return breakAutoDepartureMethodBreakDepartureMethod;
    }

    /**
     * Define o valor da propriedade breakAutoDepartureMethodBreakDepartureMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBreakAutoDepartureMethodBreakDepartureMethod(JAXBElement<String> value) {
        this.breakAutoDepartureMethodBreakDepartureMethod = value;
    }

    /**
     * Obtém o valor da propriedade earlyRouteDepartureTolerance.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEarlyRouteDepartureTolerance() {
        return earlyRouteDepartureTolerance;
    }

    /**
     * Define o valor da propriedade earlyRouteDepartureTolerance.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEarlyRouteDepartureTolerance(Duration value) {
        this.earlyRouteDepartureTolerance = value;
    }

    /**
     * Obtém o valor da propriedade inactiveRouteCompletionTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getInactiveRouteCompletionTime() {
        return inactiveRouteCompletionTime;
    }

    /**
     * Define o valor da propriedade inactiveRouteCompletionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setInactiveRouteCompletionTime(JAXBElement<Duration> value) {
        this.inactiveRouteCompletionTime = value;
    }

    /**
     * Obtém o valor da propriedade lateRouteDepartureTolerance.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLateRouteDepartureTolerance() {
        return lateRouteDepartureTolerance;
    }

    /**
     * Define o valor da propriedade lateRouteDepartureTolerance.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLateRouteDepartureTolerance(Duration value) {
        this.lateRouteDepartureTolerance = value;
    }

    /**
     * Obtém o valor da propriedade minimumBreakDurationPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumBreakDurationPercent() {
        return minimumBreakDurationPercent;
    }

    /**
     * Define o valor da propriedade minimumBreakDurationPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumBreakDurationPercent(Double value) {
        this.minimumBreakDurationPercent = value;
    }

    /**
     * Obtém o valor da propriedade minimumRouteCompletionTimeAtDepot.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumRouteCompletionTimeAtDepot() {
        return minimumRouteCompletionTimeAtDepot;
    }

    /**
     * Define o valor da propriedade minimumRouteCompletionTimeAtDepot.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumRouteCompletionTimeAtDepot(Duration value) {
        this.minimumRouteCompletionTimeAtDepot = value;
    }

    /**
     * Obtém o valor da propriedade minimumRouteDurationPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumRouteDurationPercent() {
        return minimumRouteDurationPercent;
    }

    /**
     * Define o valor da propriedade minimumRouteDurationPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumRouteDurationPercent(Double value) {
        this.minimumRouteDurationPercent = value;
    }

    /**
     * Obtém o valor da propriedade minimumServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumServiceTime() {
        return minimumServiceTime;
    }

    /**
     * Define o valor da propriedade minimumServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumServiceTime(Duration value) {
        this.minimumServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade minimumUnknownStopTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumUnknownStopTime() {
        return minimumUnknownStopTime;
    }

    /**
     * Define o valor da propriedade minimumUnknownStopTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumUnknownStopTime(Duration value) {
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
     * Obtém o valor da propriedade routeAssignmentModeRouteAssignmentMode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteAssignmentModeRouteAssignmentMode() {
        return routeAssignmentModeRouteAssignmentMode;
    }

    /**
     * Define o valor da propriedade routeAssignmentModeRouteAssignmentMode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteAssignmentModeRouteAssignmentMode(JAXBElement<String> value) {
        this.routeAssignmentModeRouteAssignmentMode = value;
    }

    /**
     * Obtém o valor da propriedade stopResequenceMethodStopResequenceMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopResequenceMethodStopResequenceMethod() {
        return stopResequenceMethodStopResequenceMethod;
    }

    /**
     * Define o valor da propriedade stopResequenceMethodStopResequenceMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopResequenceMethodStopResequenceMethod(JAXBElement<String> value) {
        this.stopResequenceMethodStopResequenceMethod = value;
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
