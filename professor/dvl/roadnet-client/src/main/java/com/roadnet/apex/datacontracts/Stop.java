
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de Stop complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Stop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrivalTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTimeDifference" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CancelNeedsAttention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CancelledReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CancelledReasonCodeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTimeDifference" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTimePercentageDifference" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DeviceStopId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DistanceTo" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDistance" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToDifference" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToPercentageDifference" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="EngineIdleTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="EngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="EngineRunTimeTo" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="FuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="FuelUsedTo" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="HasBeenArrivedAt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasBeenDepartedFrom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasCoordinateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManipulationSource_CancelSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDistanceTo" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="PlannedIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTravelTimeTo" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StopReasonCodeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopState_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelTimeTo" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stop", propOrder = {
    "arrivalTime",
    "arrivalTimeDifference",
    "arrivalTimePercentageDifference",
    "cancelNeedsAttention",
    "cancelledReasonCodeEntityKey",
    "cancelledReasonCodeIdentifier",
    "coordinate",
    "departureTime",
    "departureTimeDifference",
    "departureTimePercentageDifference",
    "deviceStopId",
    "distanceTo",
    "distanceToDifference",
    "distanceToPercentageDifference",
    "engineIdleTime",
    "engineRunTime",
    "engineRunTimeTo",
    "fuelUsed",
    "fuelUsedTo",
    "hasBeenArrivedAt",
    "hasBeenDepartedFrom",
    "hasCoordinateOverride",
    "index",
    "isCancelled",
    "manipulationSourceCancelSource",
    "planVersion",
    "plannedArrivalTime",
    "plannedDepartureTime",
    "plannedDistanceTo",
    "plannedIndex",
    "plannedTravelTimeTo",
    "stopReasonCodeDescription",
    "stopReasonCodeEntityKey",
    "stopReasonCodeIdentifier",
    "stopStateState",
    "travelTimeTo",
    "worldTimeZoneTimeZone"
})
@XmlSeeAlso({
    DiversionStop.class,
    NonServiceableStop.class,
    ServiceableStop.class,
    MidRouteDepotStop.class
})
public class Stop
    extends DomainEntity
{

    @XmlElementRef(name = "ArrivalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> arrivalTime;
    @XmlElement(name = "ArrivalTimeDifference")
    protected Duration arrivalTimeDifference;
    @XmlElement(name = "ArrivalTimePercentageDifference")
    protected Double arrivalTimePercentageDifference;
    @XmlElement(name = "CancelNeedsAttention")
    protected Boolean cancelNeedsAttention;
    @XmlElementRef(name = "CancelledReasonCodeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cancelledReasonCodeEntityKey;
    @XmlElementRef(name = "CancelledReasonCodeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cancelledReasonCodeIdentifier;
    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "DepartureTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> departureTime;
    @XmlElement(name = "DepartureTimeDifference")
    protected Duration departureTimeDifference;
    @XmlElement(name = "DepartureTimePercentageDifference")
    protected Double departureTimePercentageDifference;
    @XmlElementRef(name = "DeviceStopId", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> deviceStopId;
    @XmlElementRef(name = "DistanceTo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDistance> distanceTo;
    @XmlElementRef(name = "DistanceToDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distanceToDifference;
    @XmlElement(name = "DistanceToPercentageDifference")
    protected Double distanceToPercentageDifference;
    @XmlElementRef(name = "EngineIdleTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> engineIdleTime;
    @XmlElementRef(name = "EngineRunTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> engineRunTime;
    @XmlElementRef(name = "EngineRunTimeTo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> engineRunTimeTo;
    @XmlElementRef(name = "FuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> fuelUsed;
    @XmlElementRef(name = "FuelUsedTo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> fuelUsedTo;
    @XmlElement(name = "HasBeenArrivedAt")
    protected Boolean hasBeenArrivedAt;
    @XmlElement(name = "HasBeenDepartedFrom")
    protected Boolean hasBeenDepartedFrom;
    @XmlElement(name = "HasCoordinateOverride")
    protected Boolean hasCoordinateOverride;
    @XmlElement(name = "Index")
    protected Integer index;
    @XmlElement(name = "IsCancelled")
    protected Boolean isCancelled;
    @XmlElementRef(name = "ManipulationSource_CancelSource", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manipulationSourceCancelSource;
    @XmlElementRef(name = "PlanVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> planVersion;
    @XmlElementRef(name = "PlannedArrivalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedArrivalTime;
    @XmlElementRef(name = "PlannedDepartureTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedDepartureTime;
    @XmlElementRef(name = "PlannedDistanceTo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> plannedDistanceTo;
    @XmlElementRef(name = "PlannedIndex", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedIndex;
    @XmlElementRef(name = "PlannedTravelTimeTo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedTravelTimeTo;
    @XmlElementRef(name = "StopReasonCodeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopReasonCodeDescription;
    @XmlElementRef(name = "StopReasonCodeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> stopReasonCodeEntityKey;
    @XmlElementRef(name = "StopReasonCodeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopReasonCodeIdentifier;
    @XmlElementRef(name = "StopState_State", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopStateState;
    @XmlElementRef(name = "TravelTimeTo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> travelTimeTo;
    @XmlElementRef(name = "WorldTimeZone_TimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade arrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Define o valor da propriedade arrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setArrivalTime(JAXBElement<QualityPairedDateTime> value) {
        this.arrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade arrivalTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getArrivalTimeDifference() {
        return arrivalTimeDifference;
    }

    /**
     * Define o valor da propriedade arrivalTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setArrivalTimeDifference(Duration value) {
        this.arrivalTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade arrivalTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getArrivalTimePercentageDifference() {
        return arrivalTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade arrivalTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setArrivalTimePercentageDifference(Double value) {
        this.arrivalTimePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade cancelNeedsAttention.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelNeedsAttention() {
        return cancelNeedsAttention;
    }

    /**
     * Define o valor da propriedade cancelNeedsAttention.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelNeedsAttention(Boolean value) {
        this.cancelNeedsAttention = value;
    }

    /**
     * Obtém o valor da propriedade cancelledReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCancelledReasonCodeEntityKey() {
        return cancelledReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade cancelledReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCancelledReasonCodeEntityKey(JAXBElement<Long> value) {
        this.cancelledReasonCodeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade cancelledReasonCodeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCancelledReasonCodeIdentifier() {
        return cancelledReasonCodeIdentifier;
    }

    /**
     * Define o valor da propriedade cancelledReasonCodeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCancelledReasonCodeIdentifier(JAXBElement<String> value) {
        this.cancelledReasonCodeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<Coordinate> value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade departureTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getDepartureTime() {
        return departureTime;
    }

    /**
     * Define o valor da propriedade departureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setDepartureTime(JAXBElement<QualityPairedDateTime> value) {
        this.departureTime = value;
    }

    /**
     * Obtém o valor da propriedade departureTimeDifference.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDepartureTimeDifference() {
        return departureTimeDifference;
    }

    /**
     * Define o valor da propriedade departureTimeDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDepartureTimeDifference(Duration value) {
        this.departureTimeDifference = value;
    }

    /**
     * Obtém o valor da propriedade departureTimePercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepartureTimePercentageDifference() {
        return departureTimePercentageDifference;
    }

    /**
     * Define o valor da propriedade departureTimePercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepartureTimePercentageDifference(Double value) {
        this.departureTimePercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade deviceStopId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDeviceStopId() {
        return deviceStopId;
    }

    /**
     * Define o valor da propriedade deviceStopId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDeviceStopId(JAXBElement<Long> value) {
        this.deviceStopId = value;
    }

    /**
     * Obtém o valor da propriedade distanceTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDistance }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDistance> getDistanceTo() {
        return distanceTo;
    }

    /**
     * Define o valor da propriedade distanceTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDistance }{@code >}
     *     
     */
    public void setDistanceTo(JAXBElement<QualityPairedDistance> value) {
        this.distanceTo = value;
    }

    /**
     * Obtém o valor da propriedade distanceToDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistanceToDifference() {
        return distanceToDifference;
    }

    /**
     * Define o valor da propriedade distanceToDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistanceToDifference(JAXBElement<Distance> value) {
        this.distanceToDifference = value;
    }

    /**
     * Obtém o valor da propriedade distanceToPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistanceToPercentageDifference() {
        return distanceToPercentageDifference;
    }

    /**
     * Define o valor da propriedade distanceToPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistanceToPercentageDifference(Double value) {
        this.distanceToPercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade engineIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getEngineIdleTime() {
        return engineIdleTime;
    }

    /**
     * Define o valor da propriedade engineIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setEngineIdleTime(JAXBElement<Duration> value) {
        this.engineIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade engineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getEngineRunTime() {
        return engineRunTime;
    }

    /**
     * Define o valor da propriedade engineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setEngineRunTime(JAXBElement<Duration> value) {
        this.engineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade engineRunTimeTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getEngineRunTimeTo() {
        return engineRunTimeTo;
    }

    /**
     * Define o valor da propriedade engineRunTimeTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setEngineRunTimeTo(JAXBElement<Duration> value) {
        this.engineRunTimeTo = value;
    }

    /**
     * Obtém o valor da propriedade fuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getFuelUsed() {
        return fuelUsed;
    }

    /**
     * Define o valor da propriedade fuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setFuelUsed(JAXBElement<LiquidVolume> value) {
        this.fuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade fuelUsedTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getFuelUsedTo() {
        return fuelUsedTo;
    }

    /**
     * Define o valor da propriedade fuelUsedTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setFuelUsedTo(JAXBElement<LiquidVolume> value) {
        this.fuelUsedTo = value;
    }

    /**
     * Obtém o valor da propriedade hasBeenArrivedAt.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBeenArrivedAt() {
        return hasBeenArrivedAt;
    }

    /**
     * Define o valor da propriedade hasBeenArrivedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBeenArrivedAt(Boolean value) {
        this.hasBeenArrivedAt = value;
    }

    /**
     * Obtém o valor da propriedade hasBeenDepartedFrom.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBeenDepartedFrom() {
        return hasBeenDepartedFrom;
    }

    /**
     * Define o valor da propriedade hasBeenDepartedFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBeenDepartedFrom(Boolean value) {
        this.hasBeenDepartedFrom = value;
    }

    /**
     * Obtém o valor da propriedade hasCoordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasCoordinateOverride() {
        return hasCoordinateOverride;
    }

    /**
     * Define o valor da propriedade hasCoordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCoordinateOverride(Boolean value) {
        this.hasCoordinateOverride = value;
    }

    /**
     * Obtém o valor da propriedade index.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Define o valor da propriedade index.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Obtém o valor da propriedade isCancelled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelled() {
        return isCancelled;
    }

    /**
     * Define o valor da propriedade isCancelled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelled(Boolean value) {
        this.isCancelled = value;
    }

    /**
     * Obtém o valor da propriedade manipulationSourceCancelSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManipulationSourceCancelSource() {
        return manipulationSourceCancelSource;
    }

    /**
     * Define o valor da propriedade manipulationSourceCancelSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManipulationSourceCancelSource(JAXBElement<String> value) {
        this.manipulationSourceCancelSource = value;
    }

    /**
     * Obtém o valor da propriedade planVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlanVersion() {
        return planVersion;
    }

    /**
     * Define o valor da propriedade planVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlanVersion(JAXBElement<Integer> value) {
        this.planVersion = value;
    }

    /**
     * Obtém o valor da propriedade plannedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedArrivalTime() {
        return plannedArrivalTime;
    }

    /**
     * Define o valor da propriedade plannedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedArrivalTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedDepartureTime() {
        return plannedDepartureTime;
    }

    /**
     * Define o valor da propriedade plannedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedDepartureTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedDistanceTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getPlannedDistanceTo() {
        return plannedDistanceTo;
    }

    /**
     * Define o valor da propriedade plannedDistanceTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setPlannedDistanceTo(JAXBElement<Distance> value) {
        this.plannedDistanceTo = value;
    }

    /**
     * Obtém o valor da propriedade plannedIndex.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedIndex() {
        return plannedIndex;
    }

    /**
     * Define o valor da propriedade plannedIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedIndex(JAXBElement<Integer> value) {
        this.plannedIndex = value;
    }

    /**
     * Obtém o valor da propriedade plannedTravelTimeTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedTravelTimeTo() {
        return plannedTravelTimeTo;
    }

    /**
     * Define o valor da propriedade plannedTravelTimeTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedTravelTimeTo(JAXBElement<Duration> value) {
        this.plannedTravelTimeTo = value;
    }

    /**
     * Obtém o valor da propriedade stopReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopReasonCodeDescription() {
        return stopReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade stopReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopReasonCodeDescription(JAXBElement<String> value) {
        this.stopReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade stopReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStopReasonCodeEntityKey() {
        return stopReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade stopReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStopReasonCodeEntityKey(JAXBElement<Long> value) {
        this.stopReasonCodeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade stopReasonCodeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopReasonCodeIdentifier() {
        return stopReasonCodeIdentifier;
    }

    /**
     * Define o valor da propriedade stopReasonCodeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopReasonCodeIdentifier(JAXBElement<String> value) {
        this.stopReasonCodeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade stopStateState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopStateState() {
        return stopStateState;
    }

    /**
     * Define o valor da propriedade stopStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopStateState(JAXBElement<String> value) {
        this.stopStateState = value;
    }

    /**
     * Obtém o valor da propriedade travelTimeTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTravelTimeTo() {
        return travelTimeTo;
    }

    /**
     * Define o valor da propriedade travelTimeTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTravelTimeTo(JAXBElement<Duration> value) {
        this.travelTimeTo = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneTimeZone = value;
    }

}
