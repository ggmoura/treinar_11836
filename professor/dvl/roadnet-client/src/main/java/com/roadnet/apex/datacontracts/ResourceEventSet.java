
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ResourceEventSet complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResourceEventSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="IdlingEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionStateChangedEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="InputValueChangedEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NavAppStateChangedEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="NavCancellationEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="NavMapVersionChangedEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="NavRecalculationEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="NavRoutePathDeviationEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="NavSpeedAlertEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="NavWorkerChangedEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="PanicButtonTriggeredEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="PositionEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="PowerTakeOffResourceEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="RemoteVehicleShutdownEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StartTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StationaryEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="StatusEvents" type="{http://roadnet.com/apex/DataContracts/}ResourceEventList" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WorkerNames" type="{http://roadnet.com/apex/DataContracts/}ArrayOfPersonName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceEventSet", propOrder = {
    "endTimestamp",
    "equipmentDescription",
    "equipmentEntityKey",
    "equipmentIdentifier",
    "harshDrivingEvents",
    "idlingEvents",
    "ignitionStateChangedEvents",
    "inputValueChangedEvents",
    "mobileDeviceEntityKey",
    "navAppStateChangedEvents",
    "navCancellationEvents",
    "navMapVersionChangedEvents",
    "navRecalculationEvents",
    "navRoutePathDeviationEvents",
    "navSpeedAlertEvents",
    "navWorkerChangedEvents",
    "panicButtonTriggeredEvents",
    "positionEvents",
    "powerTakeOffResourceEvents",
    "remoteVehicleShutdownEvents",
    "routeEntityKey",
    "startTimestamp",
    "stationaryEvents",
    "statusEvents",
    "telematicsDeviceEntityKey",
    "workerNames"
})
public class ResourceEventSet
    extends RegionBasedAggregateRootEntity
{

    @XmlElement(name = "EndTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimestamp;
    @XmlElementRef(name = "EquipmentDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentDescription;
    @XmlElementRef(name = "EquipmentEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentEntityKey;
    @XmlElementRef(name = "EquipmentIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentIdentifier;
    @XmlElementRef(name = "HarshDrivingEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> harshDrivingEvents;
    @XmlElementRef(name = "IdlingEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> idlingEvents;
    @XmlElementRef(name = "IgnitionStateChangedEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> ignitionStateChangedEvents;
    @XmlElementRef(name = "InputValueChangedEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> inputValueChangedEvents;
    @XmlElementRef(name = "MobileDeviceEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mobileDeviceEntityKey;
    @XmlElementRef(name = "NavAppStateChangedEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> navAppStateChangedEvents;
    @XmlElementRef(name = "NavCancellationEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> navCancellationEvents;
    @XmlElementRef(name = "NavMapVersionChangedEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> navMapVersionChangedEvents;
    @XmlElementRef(name = "NavRecalculationEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> navRecalculationEvents;
    @XmlElementRef(name = "NavRoutePathDeviationEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> navRoutePathDeviationEvents;
    @XmlElementRef(name = "NavSpeedAlertEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> navSpeedAlertEvents;
    @XmlElementRef(name = "NavWorkerChangedEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> navWorkerChangedEvents;
    @XmlElementRef(name = "PanicButtonTriggeredEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> panicButtonTriggeredEvents;
    @XmlElementRef(name = "PositionEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> positionEvents;
    @XmlElementRef(name = "PowerTakeOffResourceEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> powerTakeOffResourceEvents;
    @XmlElementRef(name = "RemoteVehicleShutdownEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> remoteVehicleShutdownEvents;
    @XmlElementRef(name = "RouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeEntityKey;
    @XmlElement(name = "StartTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTimestamp;
    @XmlElementRef(name = "StationaryEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> stationaryEvents;
    @XmlElementRef(name = "StatusEvents", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventList> statusEvents;
    @XmlElementRef(name = "TelematicsDeviceEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> telematicsDeviceEntityKey;
    @XmlElementRef(name = "WorkerNames", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPersonName> workerNames;

    /**
     * Obtém o valor da propriedade endTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * Define o valor da propriedade endTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimestamp(XMLGregorianCalendar value) {
        this.endTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade equipmentDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentDescription() {
        return equipmentDescription;
    }

    /**
     * Define o valor da propriedade equipmentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentDescription(JAXBElement<String> value) {
        this.equipmentDescription = value;
    }

    /**
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipmentEntityKey(JAXBElement<Long> value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentIdentifier() {
        return equipmentIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentIdentifier(JAXBElement<String> value) {
        this.equipmentIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade harshDrivingEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getHarshDrivingEvents() {
        return harshDrivingEvents;
    }

    /**
     * Define o valor da propriedade harshDrivingEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setHarshDrivingEvents(JAXBElement<ResourceEventList> value) {
        this.harshDrivingEvents = value;
    }

    /**
     * Obtém o valor da propriedade idlingEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getIdlingEvents() {
        return idlingEvents;
    }

    /**
     * Define o valor da propriedade idlingEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setIdlingEvents(JAXBElement<ResourceEventList> value) {
        this.idlingEvents = value;
    }

    /**
     * Obtém o valor da propriedade ignitionStateChangedEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getIgnitionStateChangedEvents() {
        return ignitionStateChangedEvents;
    }

    /**
     * Define o valor da propriedade ignitionStateChangedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setIgnitionStateChangedEvents(JAXBElement<ResourceEventList> value) {
        this.ignitionStateChangedEvents = value;
    }

    /**
     * Obtém o valor da propriedade inputValueChangedEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getInputValueChangedEvents() {
        return inputValueChangedEvents;
    }

    /**
     * Define o valor da propriedade inputValueChangedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setInputValueChangedEvents(JAXBElement<ResourceEventList> value) {
        this.inputValueChangedEvents = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMobileDeviceEntityKey() {
        return mobileDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade mobileDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMobileDeviceEntityKey(JAXBElement<Long> value) {
        this.mobileDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade navAppStateChangedEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getNavAppStateChangedEvents() {
        return navAppStateChangedEvents;
    }

    /**
     * Define o valor da propriedade navAppStateChangedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setNavAppStateChangedEvents(JAXBElement<ResourceEventList> value) {
        this.navAppStateChangedEvents = value;
    }

    /**
     * Obtém o valor da propriedade navCancellationEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getNavCancellationEvents() {
        return navCancellationEvents;
    }

    /**
     * Define o valor da propriedade navCancellationEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setNavCancellationEvents(JAXBElement<ResourceEventList> value) {
        this.navCancellationEvents = value;
    }

    /**
     * Obtém o valor da propriedade navMapVersionChangedEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getNavMapVersionChangedEvents() {
        return navMapVersionChangedEvents;
    }

    /**
     * Define o valor da propriedade navMapVersionChangedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setNavMapVersionChangedEvents(JAXBElement<ResourceEventList> value) {
        this.navMapVersionChangedEvents = value;
    }

    /**
     * Obtém o valor da propriedade navRecalculationEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getNavRecalculationEvents() {
        return navRecalculationEvents;
    }

    /**
     * Define o valor da propriedade navRecalculationEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setNavRecalculationEvents(JAXBElement<ResourceEventList> value) {
        this.navRecalculationEvents = value;
    }

    /**
     * Obtém o valor da propriedade navRoutePathDeviationEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getNavRoutePathDeviationEvents() {
        return navRoutePathDeviationEvents;
    }

    /**
     * Define o valor da propriedade navRoutePathDeviationEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setNavRoutePathDeviationEvents(JAXBElement<ResourceEventList> value) {
        this.navRoutePathDeviationEvents = value;
    }

    /**
     * Obtém o valor da propriedade navSpeedAlertEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getNavSpeedAlertEvents() {
        return navSpeedAlertEvents;
    }

    /**
     * Define o valor da propriedade navSpeedAlertEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setNavSpeedAlertEvents(JAXBElement<ResourceEventList> value) {
        this.navSpeedAlertEvents = value;
    }

    /**
     * Obtém o valor da propriedade navWorkerChangedEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getNavWorkerChangedEvents() {
        return navWorkerChangedEvents;
    }

    /**
     * Define o valor da propriedade navWorkerChangedEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setNavWorkerChangedEvents(JAXBElement<ResourceEventList> value) {
        this.navWorkerChangedEvents = value;
    }

    /**
     * Obtém o valor da propriedade panicButtonTriggeredEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getPanicButtonTriggeredEvents() {
        return panicButtonTriggeredEvents;
    }

    /**
     * Define o valor da propriedade panicButtonTriggeredEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setPanicButtonTriggeredEvents(JAXBElement<ResourceEventList> value) {
        this.panicButtonTriggeredEvents = value;
    }

    /**
     * Obtém o valor da propriedade positionEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getPositionEvents() {
        return positionEvents;
    }

    /**
     * Define o valor da propriedade positionEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setPositionEvents(JAXBElement<ResourceEventList> value) {
        this.positionEvents = value;
    }

    /**
     * Obtém o valor da propriedade powerTakeOffResourceEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getPowerTakeOffResourceEvents() {
        return powerTakeOffResourceEvents;
    }

    /**
     * Define o valor da propriedade powerTakeOffResourceEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setPowerTakeOffResourceEvents(JAXBElement<ResourceEventList> value) {
        this.powerTakeOffResourceEvents = value;
    }

    /**
     * Obtém o valor da propriedade remoteVehicleShutdownEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getRemoteVehicleShutdownEvents() {
        return remoteVehicleShutdownEvents;
    }

    /**
     * Define o valor da propriedade remoteVehicleShutdownEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setRemoteVehicleShutdownEvents(JAXBElement<ResourceEventList> value) {
        this.remoteVehicleShutdownEvents = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteEntityKey(JAXBElement<Long> value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade startTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * Define o valor da propriedade startTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimestamp(XMLGregorianCalendar value) {
        this.startTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade stationaryEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getStationaryEvents() {
        return stationaryEvents;
    }

    /**
     * Define o valor da propriedade stationaryEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setStationaryEvents(JAXBElement<ResourceEventList> value) {
        this.stationaryEvents = value;
    }

    /**
     * Obtém o valor da propriedade statusEvents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public JAXBElement<ResourceEventList> getStatusEvents() {
        return statusEvents;
    }

    /**
     * Define o valor da propriedade statusEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventList }{@code >}
     *     
     */
    public void setStatusEvents(JAXBElement<ResourceEventList> value) {
        this.statusEvents = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTelematicsDeviceEntityKey() {
        return telematicsDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTelematicsDeviceEntityKey(JAXBElement<Long> value) {
        this.telematicsDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workerNames.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPersonName }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPersonName> getWorkerNames() {
        return workerNames;
    }

    /**
     * Define o valor da propriedade workerNames.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPersonName }{@code >}
     *     
     */
    public void setWorkerNames(JAXBElement<ArrayOfPersonName> value) {
        this.workerNames = value;
    }

}
