
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteEquipment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteEquipment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RouteEquipmentBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceleratorState_EquipmentAcceleratorState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIsPowerUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionKillSwitchState_EquipmentIgnitionKillSwitchState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MotionState_LastKnownMotionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PanicButtonState_EquipmentPanicButtonState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteShutdownState_EquipmentRemoteShutdownState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceHasDeRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceHasKillSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteEquipment", propOrder = {
    "acceleratorStateEquipmentAcceleratorState",
    "equipmentDescription",
    "equipmentEntityKey",
    "equipmentIdentifier",
    "equipmentTypeIsPowerUnit",
    "ignitionKillSwitchStateEquipmentIgnitionKillSwitchState",
    "motionStateLastKnownMotionState",
    "panicButtonStateEquipmentPanicButtonState",
    "remoteShutdownStateEquipmentRemoteShutdownState",
    "telematicsDeviceEntityKey",
    "telematicsDeviceHasDeRate",
    "telematicsDeviceHasKillSwitch"
})
public class RouteEquipment
    extends RouteEquipmentBase
{

    @XmlElementRef(name = "AcceleratorState_EquipmentAcceleratorState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acceleratorStateEquipmentAcceleratorState;
    @XmlElementRef(name = "EquipmentDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentDescription;
    @XmlElement(name = "EquipmentEntityKey")
    protected Long equipmentEntityKey;
    @XmlElementRef(name = "EquipmentIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentIdentifier;
    @XmlElement(name = "EquipmentTypeIsPowerUnit")
    protected Boolean equipmentTypeIsPowerUnit;
    @XmlElementRef(name = "IgnitionKillSwitchState_EquipmentIgnitionKillSwitchState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ignitionKillSwitchStateEquipmentIgnitionKillSwitchState;
    @XmlElementRef(name = "MotionState_LastKnownMotionState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motionStateLastKnownMotionState;
    @XmlElementRef(name = "PanicButtonState_EquipmentPanicButtonState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> panicButtonStateEquipmentPanicButtonState;
    @XmlElementRef(name = "RemoteShutdownState_EquipmentRemoteShutdownState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remoteShutdownStateEquipmentRemoteShutdownState;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Long telematicsDeviceEntityKey;
    @XmlElement(name = "TelematicsDeviceHasDeRate")
    protected Boolean telematicsDeviceHasDeRate;
    @XmlElement(name = "TelematicsDeviceHasKillSwitch")
    protected Boolean telematicsDeviceHasKillSwitch;

    /**
     * Obtém o valor da propriedade acceleratorStateEquipmentAcceleratorState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcceleratorStateEquipmentAcceleratorState() {
        return acceleratorStateEquipmentAcceleratorState;
    }

    /**
     * Define o valor da propriedade acceleratorStateEquipmentAcceleratorState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcceleratorStateEquipmentAcceleratorState(JAXBElement<String> value) {
        this.acceleratorStateEquipmentAcceleratorState = value;
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
     * Obtém o valor da propriedade equipmentTypeIsPowerUnit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeIsPowerUnit() {
        return equipmentTypeIsPowerUnit;
    }

    /**
     * Define o valor da propriedade equipmentTypeIsPowerUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeIsPowerUnit(Boolean value) {
        this.equipmentTypeIsPowerUnit = value;
    }

    /**
     * Obtém o valor da propriedade ignitionKillSwitchStateEquipmentIgnitionKillSwitchState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIgnitionKillSwitchStateEquipmentIgnitionKillSwitchState() {
        return ignitionKillSwitchStateEquipmentIgnitionKillSwitchState;
    }

    /**
     * Define o valor da propriedade ignitionKillSwitchStateEquipmentIgnitionKillSwitchState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIgnitionKillSwitchStateEquipmentIgnitionKillSwitchState(JAXBElement<String> value) {
        this.ignitionKillSwitchStateEquipmentIgnitionKillSwitchState = value;
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
     * Obtém o valor da propriedade panicButtonStateEquipmentPanicButtonState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPanicButtonStateEquipmentPanicButtonState() {
        return panicButtonStateEquipmentPanicButtonState;
    }

    /**
     * Define o valor da propriedade panicButtonStateEquipmentPanicButtonState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPanicButtonStateEquipmentPanicButtonState(JAXBElement<String> value) {
        this.panicButtonStateEquipmentPanicButtonState = value;
    }

    /**
     * Obtém o valor da propriedade remoteShutdownStateEquipmentRemoteShutdownState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemoteShutdownStateEquipmentRemoteShutdownState() {
        return remoteShutdownStateEquipmentRemoteShutdownState;
    }

    /**
     * Define o valor da propriedade remoteShutdownStateEquipmentRemoteShutdownState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemoteShutdownStateEquipmentRemoteShutdownState(JAXBElement<String> value) {
        this.remoteShutdownStateEquipmentRemoteShutdownState = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTelematicsDeviceEntityKey() {
        return telematicsDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTelematicsDeviceEntityKey(Long value) {
        this.telematicsDeviceEntityKey = value;
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
     * Obtém o valor da propriedade telematicsDeviceHasKillSwitch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceHasKillSwitch() {
        return telematicsDeviceHasKillSwitch;
    }

    /**
     * Define o valor da propriedade telematicsDeviceHasKillSwitch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceHasKillSwitch(Boolean value) {
        this.telematicsDeviceHasKillSwitch = value;
    }

}
