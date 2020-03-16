
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResourceEventSetPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResourceEventSetPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="IdlingEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IdlingEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionStateChangedEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionStateChangedEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="InputValueChangedEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InputValueChangedEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NavAppStateChangedEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NavAppStateChangedEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="NavCancellationEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NavCancellationEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="NavMapVersionChangedEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NavMapVersionChangedEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="NavRecalculationEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NavRecalculationEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="NavRoutePathDeviationEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NavRoutePathDeviationEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="NavSpeedAlertEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NavSpeedAlertEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="NavWorkerChangedEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NavWorkerChangedEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="PanicButtonTriggeredEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PanicButtonTriggeredEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="PositionEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PositionEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="PowerTakeOffResourceEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PowerTakeOffResourceEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RemoteVehicleShutdownEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RemoteVehicleShutdownEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StationaryEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StationaryEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="StatusEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StatusEventsOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventListPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerNames" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceEventSetPropertyOptions", propOrder = {
    "endTimestamp",
    "equipmentDescription",
    "equipmentEntityKey",
    "equipmentIdentifier",
    "harshDrivingEvents",
    "harshDrivingEventsOptions",
    "idlingEvents",
    "idlingEventsOptions",
    "ignitionStateChangedEvents",
    "ignitionStateChangedEventsOptions",
    "inputValueChangedEvents",
    "inputValueChangedEventsOptions",
    "mobileDeviceEntityKey",
    "navAppStateChangedEvents",
    "navAppStateChangedEventsOptions",
    "navCancellationEvents",
    "navCancellationEventsOptions",
    "navMapVersionChangedEvents",
    "navMapVersionChangedEventsOptions",
    "navRecalculationEvents",
    "navRecalculationEventsOptions",
    "navRoutePathDeviationEvents",
    "navRoutePathDeviationEventsOptions",
    "navSpeedAlertEvents",
    "navSpeedAlertEventsOptions",
    "navWorkerChangedEvents",
    "navWorkerChangedEventsOptions",
    "panicButtonTriggeredEvents",
    "panicButtonTriggeredEventsOptions",
    "positionEvents",
    "positionEventsOptions",
    "powerTakeOffResourceEvents",
    "powerTakeOffResourceEventsOptions",
    "remoteVehicleShutdownEvents",
    "remoteVehicleShutdownEventsOptions",
    "routeEntityKey",
    "startTimestamp",
    "stationaryEvents",
    "stationaryEventsOptions",
    "statusEvents",
    "statusEventsOptions",
    "telematicsDeviceEntityKey",
    "workerNames"
})
public class ResourceEventSetPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "EndTimestamp")
    protected Boolean endTimestamp;
    @XmlElement(name = "EquipmentDescription")
    protected Boolean equipmentDescription;
    @XmlElement(name = "EquipmentEntityKey")
    protected Boolean equipmentEntityKey;
    @XmlElement(name = "EquipmentIdentifier")
    protected Boolean equipmentIdentifier;
    @XmlElement(name = "HarshDrivingEvents")
    protected Boolean harshDrivingEvents;
    @XmlElementRef(name = "HarshDrivingEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> harshDrivingEventsOptions;
    @XmlElement(name = "IdlingEvents")
    protected Boolean idlingEvents;
    @XmlElementRef(name = "IdlingEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> idlingEventsOptions;
    @XmlElement(name = "IgnitionStateChangedEvents")
    protected Boolean ignitionStateChangedEvents;
    @XmlElementRef(name = "IgnitionStateChangedEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> ignitionStateChangedEventsOptions;
    @XmlElement(name = "InputValueChangedEvents")
    protected Boolean inputValueChangedEvents;
    @XmlElementRef(name = "InputValueChangedEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> inputValueChangedEventsOptions;
    @XmlElement(name = "MobileDeviceEntityKey")
    protected Boolean mobileDeviceEntityKey;
    @XmlElement(name = "NavAppStateChangedEvents")
    protected Boolean navAppStateChangedEvents;
    @XmlElementRef(name = "NavAppStateChangedEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> navAppStateChangedEventsOptions;
    @XmlElement(name = "NavCancellationEvents")
    protected Boolean navCancellationEvents;
    @XmlElementRef(name = "NavCancellationEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> navCancellationEventsOptions;
    @XmlElement(name = "NavMapVersionChangedEvents")
    protected Boolean navMapVersionChangedEvents;
    @XmlElementRef(name = "NavMapVersionChangedEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> navMapVersionChangedEventsOptions;
    @XmlElement(name = "NavRecalculationEvents")
    protected Boolean navRecalculationEvents;
    @XmlElementRef(name = "NavRecalculationEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> navRecalculationEventsOptions;
    @XmlElement(name = "NavRoutePathDeviationEvents")
    protected Boolean navRoutePathDeviationEvents;
    @XmlElementRef(name = "NavRoutePathDeviationEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> navRoutePathDeviationEventsOptions;
    @XmlElement(name = "NavSpeedAlertEvents")
    protected Boolean navSpeedAlertEvents;
    @XmlElementRef(name = "NavSpeedAlertEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> navSpeedAlertEventsOptions;
    @XmlElement(name = "NavWorkerChangedEvents")
    protected Boolean navWorkerChangedEvents;
    @XmlElementRef(name = "NavWorkerChangedEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> navWorkerChangedEventsOptions;
    @XmlElement(name = "PanicButtonTriggeredEvents")
    protected Boolean panicButtonTriggeredEvents;
    @XmlElementRef(name = "PanicButtonTriggeredEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> panicButtonTriggeredEventsOptions;
    @XmlElement(name = "PositionEvents")
    protected Boolean positionEvents;
    @XmlElementRef(name = "PositionEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> positionEventsOptions;
    @XmlElement(name = "PowerTakeOffResourceEvents")
    protected Boolean powerTakeOffResourceEvents;
    @XmlElementRef(name = "PowerTakeOffResourceEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> powerTakeOffResourceEventsOptions;
    @XmlElement(name = "RemoteVehicleShutdownEvents")
    protected Boolean remoteVehicleShutdownEvents;
    @XmlElementRef(name = "RemoteVehicleShutdownEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> remoteVehicleShutdownEventsOptions;
    @XmlElement(name = "RouteEntityKey")
    protected Boolean routeEntityKey;
    @XmlElement(name = "StartTimestamp")
    protected Boolean startTimestamp;
    @XmlElement(name = "StationaryEvents")
    protected Boolean stationaryEvents;
    @XmlElementRef(name = "StationaryEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> stationaryEventsOptions;
    @XmlElement(name = "StatusEvents")
    protected Boolean statusEvents;
    @XmlElementRef(name = "StatusEventsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventListPropertyOptions> statusEventsOptions;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Boolean telematicsDeviceEntityKey;
    @XmlElement(name = "WorkerNames")
    protected Boolean workerNames;

    /**
     * Obtém o valor da propriedade endTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndTimestamp() {
        return endTimestamp;
    }

    /**
     * Define o valor da propriedade endTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndTimestamp(Boolean value) {
        this.endTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade equipmentDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentDescription() {
        return equipmentDescription;
    }

    /**
     * Define o valor da propriedade equipmentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentDescription(Boolean value) {
        this.equipmentDescription = value;
    }

    /**
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentEntityKey(Boolean value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentIdentifier() {
        return equipmentIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentIdentifier(Boolean value) {
        this.equipmentIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade harshDrivingEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHarshDrivingEvents() {
        return harshDrivingEvents;
    }

    /**
     * Define o valor da propriedade harshDrivingEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHarshDrivingEvents(Boolean value) {
        this.harshDrivingEvents = value;
    }

    /**
     * Obtém o valor da propriedade harshDrivingEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getHarshDrivingEventsOptions() {
        return harshDrivingEventsOptions;
    }

    /**
     * Define o valor da propriedade harshDrivingEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setHarshDrivingEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.harshDrivingEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade idlingEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdlingEvents() {
        return idlingEvents;
    }

    /**
     * Define o valor da propriedade idlingEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdlingEvents(Boolean value) {
        this.idlingEvents = value;
    }

    /**
     * Obtém o valor da propriedade idlingEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getIdlingEventsOptions() {
        return idlingEventsOptions;
    }

    /**
     * Define o valor da propriedade idlingEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setIdlingEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.idlingEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade ignitionStateChangedEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnitionStateChangedEvents() {
        return ignitionStateChangedEvents;
    }

    /**
     * Define o valor da propriedade ignitionStateChangedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnitionStateChangedEvents(Boolean value) {
        this.ignitionStateChangedEvents = value;
    }

    /**
     * Obtém o valor da propriedade ignitionStateChangedEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getIgnitionStateChangedEventsOptions() {
        return ignitionStateChangedEventsOptions;
    }

    /**
     * Define o valor da propriedade ignitionStateChangedEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setIgnitionStateChangedEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.ignitionStateChangedEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade inputValueChangedEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInputValueChangedEvents() {
        return inputValueChangedEvents;
    }

    /**
     * Define o valor da propriedade inputValueChangedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInputValueChangedEvents(Boolean value) {
        this.inputValueChangedEvents = value;
    }

    /**
     * Obtém o valor da propriedade inputValueChangedEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getInputValueChangedEventsOptions() {
        return inputValueChangedEventsOptions;
    }

    /**
     * Define o valor da propriedade inputValueChangedEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setInputValueChangedEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.inputValueChangedEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileDeviceEntityKey() {
        return mobileDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade mobileDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileDeviceEntityKey(Boolean value) {
        this.mobileDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade navAppStateChangedEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNavAppStateChangedEvents() {
        return navAppStateChangedEvents;
    }

    /**
     * Define o valor da propriedade navAppStateChangedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNavAppStateChangedEvents(Boolean value) {
        this.navAppStateChangedEvents = value;
    }

    /**
     * Obtém o valor da propriedade navAppStateChangedEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getNavAppStateChangedEventsOptions() {
        return navAppStateChangedEventsOptions;
    }

    /**
     * Define o valor da propriedade navAppStateChangedEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setNavAppStateChangedEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.navAppStateChangedEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade navCancellationEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNavCancellationEvents() {
        return navCancellationEvents;
    }

    /**
     * Define o valor da propriedade navCancellationEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNavCancellationEvents(Boolean value) {
        this.navCancellationEvents = value;
    }

    /**
     * Obtém o valor da propriedade navCancellationEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getNavCancellationEventsOptions() {
        return navCancellationEventsOptions;
    }

    /**
     * Define o valor da propriedade navCancellationEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setNavCancellationEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.navCancellationEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade navMapVersionChangedEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNavMapVersionChangedEvents() {
        return navMapVersionChangedEvents;
    }

    /**
     * Define o valor da propriedade navMapVersionChangedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNavMapVersionChangedEvents(Boolean value) {
        this.navMapVersionChangedEvents = value;
    }

    /**
     * Obtém o valor da propriedade navMapVersionChangedEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getNavMapVersionChangedEventsOptions() {
        return navMapVersionChangedEventsOptions;
    }

    /**
     * Define o valor da propriedade navMapVersionChangedEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setNavMapVersionChangedEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.navMapVersionChangedEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade navRecalculationEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNavRecalculationEvents() {
        return navRecalculationEvents;
    }

    /**
     * Define o valor da propriedade navRecalculationEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNavRecalculationEvents(Boolean value) {
        this.navRecalculationEvents = value;
    }

    /**
     * Obtém o valor da propriedade navRecalculationEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getNavRecalculationEventsOptions() {
        return navRecalculationEventsOptions;
    }

    /**
     * Define o valor da propriedade navRecalculationEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setNavRecalculationEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.navRecalculationEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade navRoutePathDeviationEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNavRoutePathDeviationEvents() {
        return navRoutePathDeviationEvents;
    }

    /**
     * Define o valor da propriedade navRoutePathDeviationEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNavRoutePathDeviationEvents(Boolean value) {
        this.navRoutePathDeviationEvents = value;
    }

    /**
     * Obtém o valor da propriedade navRoutePathDeviationEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getNavRoutePathDeviationEventsOptions() {
        return navRoutePathDeviationEventsOptions;
    }

    /**
     * Define o valor da propriedade navRoutePathDeviationEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setNavRoutePathDeviationEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.navRoutePathDeviationEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade navSpeedAlertEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNavSpeedAlertEvents() {
        return navSpeedAlertEvents;
    }

    /**
     * Define o valor da propriedade navSpeedAlertEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNavSpeedAlertEvents(Boolean value) {
        this.navSpeedAlertEvents = value;
    }

    /**
     * Obtém o valor da propriedade navSpeedAlertEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getNavSpeedAlertEventsOptions() {
        return navSpeedAlertEventsOptions;
    }

    /**
     * Define o valor da propriedade navSpeedAlertEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setNavSpeedAlertEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.navSpeedAlertEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade navWorkerChangedEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNavWorkerChangedEvents() {
        return navWorkerChangedEvents;
    }

    /**
     * Define o valor da propriedade navWorkerChangedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNavWorkerChangedEvents(Boolean value) {
        this.navWorkerChangedEvents = value;
    }

    /**
     * Obtém o valor da propriedade navWorkerChangedEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getNavWorkerChangedEventsOptions() {
        return navWorkerChangedEventsOptions;
    }

    /**
     * Define o valor da propriedade navWorkerChangedEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setNavWorkerChangedEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.navWorkerChangedEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade panicButtonTriggeredEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPanicButtonTriggeredEvents() {
        return panicButtonTriggeredEvents;
    }

    /**
     * Define o valor da propriedade panicButtonTriggeredEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPanicButtonTriggeredEvents(Boolean value) {
        this.panicButtonTriggeredEvents = value;
    }

    /**
     * Obtém o valor da propriedade panicButtonTriggeredEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getPanicButtonTriggeredEventsOptions() {
        return panicButtonTriggeredEventsOptions;
    }

    /**
     * Define o valor da propriedade panicButtonTriggeredEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setPanicButtonTriggeredEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.panicButtonTriggeredEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade positionEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPositionEvents() {
        return positionEvents;
    }

    /**
     * Define o valor da propriedade positionEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPositionEvents(Boolean value) {
        this.positionEvents = value;
    }

    /**
     * Obtém o valor da propriedade positionEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getPositionEventsOptions() {
        return positionEventsOptions;
    }

    /**
     * Define o valor da propriedade positionEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setPositionEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.positionEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade powerTakeOffResourceEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowerTakeOffResourceEvents() {
        return powerTakeOffResourceEvents;
    }

    /**
     * Define o valor da propriedade powerTakeOffResourceEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowerTakeOffResourceEvents(Boolean value) {
        this.powerTakeOffResourceEvents = value;
    }

    /**
     * Obtém o valor da propriedade powerTakeOffResourceEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getPowerTakeOffResourceEventsOptions() {
        return powerTakeOffResourceEventsOptions;
    }

    /**
     * Define o valor da propriedade powerTakeOffResourceEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setPowerTakeOffResourceEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.powerTakeOffResourceEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade remoteVehicleShutdownEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteVehicleShutdownEvents() {
        return remoteVehicleShutdownEvents;
    }

    /**
     * Define o valor da propriedade remoteVehicleShutdownEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteVehicleShutdownEvents(Boolean value) {
        this.remoteVehicleShutdownEvents = value;
    }

    /**
     * Obtém o valor da propriedade remoteVehicleShutdownEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getRemoteVehicleShutdownEventsOptions() {
        return remoteVehicleShutdownEventsOptions;
    }

    /**
     * Define o valor da propriedade remoteVehicleShutdownEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setRemoteVehicleShutdownEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.remoteVehicleShutdownEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteEntityKey(Boolean value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade startTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTimestamp() {
        return startTimestamp;
    }

    /**
     * Define o valor da propriedade startTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTimestamp(Boolean value) {
        this.startTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade stationaryEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStationaryEvents() {
        return stationaryEvents;
    }

    /**
     * Define o valor da propriedade stationaryEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStationaryEvents(Boolean value) {
        this.stationaryEvents = value;
    }

    /**
     * Obtém o valor da propriedade stationaryEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getStationaryEventsOptions() {
        return stationaryEventsOptions;
    }

    /**
     * Define o valor da propriedade stationaryEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setStationaryEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.stationaryEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade statusEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusEvents() {
        return statusEvents;
    }

    /**
     * Define o valor da propriedade statusEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusEvents(Boolean value) {
        this.statusEvents = value;
    }

    /**
     * Obtém o valor da propriedade statusEventsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventListPropertyOptions> getStatusEventsOptions() {
        return statusEventsOptions;
    }

    /**
     * Define o valor da propriedade statusEventsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventListPropertyOptions }{@code >}
     *     
     */
    public void setStatusEventsOptions(JAXBElement<ResourceEventListPropertyOptions> value) {
        this.statusEventsOptions = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceEntityKey() {
        return telematicsDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceEntityKey(Boolean value) {
        this.telematicsDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workerNames.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerNames() {
        return workerNames;
    }

    /**
     * Define o valor da propriedade workerNames.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerNames(Boolean value) {
        this.workerNames = value;
    }

}
