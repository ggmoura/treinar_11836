
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
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de EquipmentStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceleratorState_AcceleratorState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataCommunicationsType_TelematicsDeviceCurrentDataComms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepotAtLastKnownPositionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentCalculatedDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasIgnitionKillSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionKillSwitchState_IgnitionKillSwitchState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionState_IgnitionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownHeading" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPosition" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPositionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPositionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MotionStateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MotionState_LastKnownMotionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfActiveExceptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMissedServiceWindows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfNavigationEvents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OffPlanTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PanicButtonState_PanicButtonState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedMissedServiceWindows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RouteCompleteTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteLastContactTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RoutePhase_RoutePhase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteRegionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteState_RouteState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceHasDeRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumberOfExceptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentStatus", propOrder = {
    "acceleratorStateAcceleratorState",
    "dataCommunicationsTypeTelematicsDeviceCurrentDataComms",
    "depotAtLastKnownPositionEntityKey",
    "equipmentCalculatedDistance",
    "equipmentDescription",
    "equipmentEntityKey",
    "equipmentIdentifier",
    "hasIgnitionKillSwitch",
    "ignitionKillSwitchStateIgnitionKillSwitchState",
    "ignitionStateIgnitionState",
    "lastKnownHeading",
    "lastKnownPosition",
    "lastKnownPositionText",
    "lastKnownPositionTime",
    "motionStateDuration",
    "motionStateLastKnownMotionState",
    "numberOfActiveExceptions",
    "numberOfMissedServiceWindows",
    "numberOfNavigationEvents",
    "offPlanTime",
    "panicButtonStatePanicButtonState",
    "projectedMissedServiceWindows",
    "routeCompleteTime",
    "routeEntityKey",
    "routeLastContactTime",
    "routePhaseRoutePhase",
    "routeRegionDescription",
    "routeRegionIdentifier",
    "routeStateRouteState",
    "telematicsDeviceHasDeRate",
    "totalNumberOfExceptions"
})
@XmlSeeAlso({
    EquipmentStatusDetails.class
})
public class EquipmentStatus
    extends DataTransferObject
{

    @XmlElementRef(name = "AcceleratorState_AcceleratorState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acceleratorStateAcceleratorState;
    @XmlElementRef(name = "DataCommunicationsType_TelematicsDeviceCurrentDataComms", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCommunicationsTypeTelematicsDeviceCurrentDataComms;
    @XmlElementRef(name = "DepotAtLastKnownPositionEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> depotAtLastKnownPositionEntityKey;
    @XmlElementRef(name = "EquipmentCalculatedDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> equipmentCalculatedDistance;
    @XmlElementRef(name = "EquipmentDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentDescription;
    @XmlElement(name = "EquipmentEntityKey")
    protected Long equipmentEntityKey;
    @XmlElementRef(name = "EquipmentIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentIdentifier;
    @XmlElement(name = "HasIgnitionKillSwitch")
    protected Boolean hasIgnitionKillSwitch;
    @XmlElementRef(name = "IgnitionKillSwitchState_IgnitionKillSwitchState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ignitionKillSwitchStateIgnitionKillSwitchState;
    @XmlElementRef(name = "IgnitionState_IgnitionState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ignitionStateIgnitionState;
    @XmlElementRef(name = "LastKnownHeading", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastKnownHeading;
    @XmlElementRef(name = "LastKnownPosition", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> lastKnownPosition;
    @XmlElementRef(name = "LastKnownPositionText", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastKnownPositionText;
    @XmlElementRef(name = "LastKnownPositionTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastKnownPositionTime;
    @XmlElementRef(name = "MotionStateDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> motionStateDuration;
    @XmlElementRef(name = "MotionState_LastKnownMotionState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motionStateLastKnownMotionState;
    @XmlElementRef(name = "NumberOfActiveExceptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfActiveExceptions;
    @XmlElement(name = "NumberOfMissedServiceWindows")
    protected Integer numberOfMissedServiceWindows;
    @XmlElement(name = "NumberOfNavigationEvents")
    protected Integer numberOfNavigationEvents;
    @XmlElement(name = "OffPlanTime")
    protected Duration offPlanTime;
    @XmlElementRef(name = "PanicButtonState_PanicButtonState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> panicButtonStatePanicButtonState;
    @XmlElement(name = "ProjectedMissedServiceWindows")
    protected Integer projectedMissedServiceWindows;
    @XmlElementRef(name = "RouteCompleteTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> routeCompleteTime;
    @XmlElementRef(name = "RouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeEntityKey;
    @XmlElementRef(name = "RouteLastContactTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> routeLastContactTime;
    @XmlElementRef(name = "RoutePhase_RoutePhase", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routePhaseRoutePhase;
    @XmlElementRef(name = "RouteRegionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeRegionDescription;
    @XmlElementRef(name = "RouteRegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeRegionIdentifier;
    @XmlElementRef(name = "RouteState_RouteState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeStateRouteState;
    @XmlElement(name = "TelematicsDeviceHasDeRate")
    protected Boolean telematicsDeviceHasDeRate;
    @XmlElement(name = "TotalNumberOfExceptions")
    protected Integer totalNumberOfExceptions;

    /**
     * Obtém o valor da propriedade acceleratorStateAcceleratorState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcceleratorStateAcceleratorState() {
        return acceleratorStateAcceleratorState;
    }

    /**
     * Define o valor da propriedade acceleratorStateAcceleratorState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcceleratorStateAcceleratorState(JAXBElement<String> value) {
        this.acceleratorStateAcceleratorState = value;
    }

    /**
     * Obtém o valor da propriedade dataCommunicationsTypeTelematicsDeviceCurrentDataComms.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCommunicationsTypeTelematicsDeviceCurrentDataComms() {
        return dataCommunicationsTypeTelematicsDeviceCurrentDataComms;
    }

    /**
     * Define o valor da propriedade dataCommunicationsTypeTelematicsDeviceCurrentDataComms.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCommunicationsTypeTelematicsDeviceCurrentDataComms(JAXBElement<String> value) {
        this.dataCommunicationsTypeTelematicsDeviceCurrentDataComms = value;
    }

    /**
     * Obtém o valor da propriedade depotAtLastKnownPositionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDepotAtLastKnownPositionEntityKey() {
        return depotAtLastKnownPositionEntityKey;
    }

    /**
     * Define o valor da propriedade depotAtLastKnownPositionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDepotAtLastKnownPositionEntityKey(JAXBElement<Long> value) {
        this.depotAtLastKnownPositionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentCalculatedDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getEquipmentCalculatedDistance() {
        return equipmentCalculatedDistance;
    }

    /**
     * Define o valor da propriedade equipmentCalculatedDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setEquipmentCalculatedDistance(JAXBElement<Distance> value) {
        this.equipmentCalculatedDistance = value;
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
     *     {@link Long }
     *     
     */
    public Long getEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipmentEntityKey(Long value) {
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
     * Obtém o valor da propriedade hasIgnitionKillSwitch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasIgnitionKillSwitch() {
        return hasIgnitionKillSwitch;
    }

    /**
     * Define o valor da propriedade hasIgnitionKillSwitch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasIgnitionKillSwitch(Boolean value) {
        this.hasIgnitionKillSwitch = value;
    }

    /**
     * Obtém o valor da propriedade ignitionKillSwitchStateIgnitionKillSwitchState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIgnitionKillSwitchStateIgnitionKillSwitchState() {
        return ignitionKillSwitchStateIgnitionKillSwitchState;
    }

    /**
     * Define o valor da propriedade ignitionKillSwitchStateIgnitionKillSwitchState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIgnitionKillSwitchStateIgnitionKillSwitchState(JAXBElement<String> value) {
        this.ignitionKillSwitchStateIgnitionKillSwitchState = value;
    }

    /**
     * Obtém o valor da propriedade ignitionStateIgnitionState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIgnitionStateIgnitionState() {
        return ignitionStateIgnitionState;
    }

    /**
     * Define o valor da propriedade ignitionStateIgnitionState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIgnitionStateIgnitionState(JAXBElement<String> value) {
        this.ignitionStateIgnitionState = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownHeading.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastKnownHeading() {
        return lastKnownHeading;
    }

    /**
     * Define o valor da propriedade lastKnownHeading.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastKnownHeading(JAXBElement<Double> value) {
        this.lastKnownHeading = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPosition.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getLastKnownPosition() {
        return lastKnownPosition;
    }

    /**
     * Define o valor da propriedade lastKnownPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setLastKnownPosition(JAXBElement<Coordinate> value) {
        this.lastKnownPosition = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPositionText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastKnownPositionText() {
        return lastKnownPositionText;
    }

    /**
     * Define o valor da propriedade lastKnownPositionText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastKnownPositionText(JAXBElement<String> value) {
        this.lastKnownPositionText = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPositionTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastKnownPositionTime() {
        return lastKnownPositionTime;
    }

    /**
     * Define o valor da propriedade lastKnownPositionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastKnownPositionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastKnownPositionTime = value;
    }

    /**
     * Obtém o valor da propriedade motionStateDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMotionStateDuration() {
        return motionStateDuration;
    }

    /**
     * Define o valor da propriedade motionStateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMotionStateDuration(JAXBElement<Duration> value) {
        this.motionStateDuration = value;
    }

    /**
     * Obtém o valor da propriedade motionStateLastKnownMotionState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMotionStateLastKnownMotionState() {
        return motionStateLastKnownMotionState;
    }

    /**
     * Define o valor da propriedade motionStateLastKnownMotionState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMotionStateLastKnownMotionState(JAXBElement<String> value) {
        this.motionStateLastKnownMotionState = value;
    }

    /**
     * Obtém o valor da propriedade numberOfActiveExceptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfActiveExceptions() {
        return numberOfActiveExceptions;
    }

    /**
     * Define o valor da propriedade numberOfActiveExceptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfActiveExceptions(JAXBElement<Integer> value) {
        this.numberOfActiveExceptions = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMissedServiceWindows.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfMissedServiceWindows() {
        return numberOfMissedServiceWindows;
    }

    /**
     * Define o valor da propriedade numberOfMissedServiceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfMissedServiceWindows(Integer value) {
        this.numberOfMissedServiceWindows = value;
    }

    /**
     * Obtém o valor da propriedade numberOfNavigationEvents.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfNavigationEvents() {
        return numberOfNavigationEvents;
    }

    /**
     * Define o valor da propriedade numberOfNavigationEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfNavigationEvents(Integer value) {
        this.numberOfNavigationEvents = value;
    }

    /**
     * Obtém o valor da propriedade offPlanTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOffPlanTime() {
        return offPlanTime;
    }

    /**
     * Define o valor da propriedade offPlanTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOffPlanTime(Duration value) {
        this.offPlanTime = value;
    }

    /**
     * Obtém o valor da propriedade panicButtonStatePanicButtonState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPanicButtonStatePanicButtonState() {
        return panicButtonStatePanicButtonState;
    }

    /**
     * Define o valor da propriedade panicButtonStatePanicButtonState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPanicButtonStatePanicButtonState(JAXBElement<String> value) {
        this.panicButtonStatePanicButtonState = value;
    }

    /**
     * Obtém o valor da propriedade projectedMissedServiceWindows.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectedMissedServiceWindows() {
        return projectedMissedServiceWindows;
    }

    /**
     * Define o valor da propriedade projectedMissedServiceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectedMissedServiceWindows(Integer value) {
        this.projectedMissedServiceWindows = value;
    }

    /**
     * Obtém o valor da propriedade routeCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getRouteCompleteTime() {
        return routeCompleteTime;
    }

    /**
     * Define o valor da propriedade routeCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setRouteCompleteTime(JAXBElement<QualityPairedDateTime> value) {
        this.routeCompleteTime = value;
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
     * Obtém o valor da propriedade routeLastContactTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRouteLastContactTime() {
        return routeLastContactTime;
    }

    /**
     * Define o valor da propriedade routeLastContactTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRouteLastContactTime(JAXBElement<XMLGregorianCalendar> value) {
        this.routeLastContactTime = value;
    }

    /**
     * Obtém o valor da propriedade routePhaseRoutePhase.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutePhaseRoutePhase() {
        return routePhaseRoutePhase;
    }

    /**
     * Define o valor da propriedade routePhaseRoutePhase.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutePhaseRoutePhase(JAXBElement<String> value) {
        this.routePhaseRoutePhase = value;
    }

    /**
     * Obtém o valor da propriedade routeRegionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteRegionDescription() {
        return routeRegionDescription;
    }

    /**
     * Define o valor da propriedade routeRegionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteRegionDescription(JAXBElement<String> value) {
        this.routeRegionDescription = value;
    }

    /**
     * Obtém o valor da propriedade routeRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteRegionIdentifier() {
        return routeRegionIdentifier;
    }

    /**
     * Define o valor da propriedade routeRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteRegionIdentifier(JAXBElement<String> value) {
        this.routeRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade routeStateRouteState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteStateRouteState() {
        return routeStateRouteState;
    }

    /**
     * Define o valor da propriedade routeStateRouteState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteStateRouteState(JAXBElement<String> value) {
        this.routeStateRouteState = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceHasDeRate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceHasDeRate() {
        return telematicsDeviceHasDeRate;
    }

    /**
     * Define o valor da propriedade telematicsDeviceHasDeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceHasDeRate(Boolean value) {
        this.telematicsDeviceHasDeRate = value;
    }

    /**
     * Obtém o valor da propriedade totalNumberOfExceptions.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfExceptions() {
        return totalNumberOfExceptions;
    }

    /**
     * Define o valor da propriedade totalNumberOfExceptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfExceptions(Integer value) {
        this.totalNumberOfExceptions = value;
    }

}
