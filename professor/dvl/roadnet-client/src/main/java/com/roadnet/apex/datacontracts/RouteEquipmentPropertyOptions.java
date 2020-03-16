
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de RouteEquipmentPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteEquipmentPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceleratorState_EquipmentAcceleratorState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BeginAtStopEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndAtStopEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentRemoteShutdownState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIsPowerUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionKillSwitchState_EquipmentIgnitionKillSwitchState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MotionState_LastKnownMotionState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PanicButtonState_EquipmentPanicButtonState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "RouteEquipmentPropertyOptions", propOrder = {
    "acceleratorStateEquipmentAcceleratorState",
    "beginAtStopEntityKey",
    "endAtStopEntityKey",
    "equipmentDescription",
    "equipmentEntityKey",
    "equipmentIdentifier",
    "equipmentRemoteShutdownState",
    "equipmentTypeEntityKey",
    "equipmentTypeIsPowerUnit",
    "ignitionKillSwitchStateEquipmentIgnitionKillSwitchState",
    "motionStateLastKnownMotionState",
    "panicButtonStateEquipmentPanicButtonState",
    "telematicsDeviceEntityKey",
    "telematicsDeviceHasDeRate",
    "telematicsDeviceHasKillSwitch"
})
public class RouteEquipmentPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AcceleratorState_EquipmentAcceleratorState")
    protected Boolean acceleratorStateEquipmentAcceleratorState;
    @XmlElement(name = "BeginAtStopEntityKey")
    protected Boolean beginAtStopEntityKey;
    @XmlElement(name = "EndAtStopEntityKey")
    protected Boolean endAtStopEntityKey;
    @XmlElement(name = "EquipmentDescription")
    protected Boolean equipmentDescription;
    @XmlElement(name = "EquipmentEntityKey")
    protected Boolean equipmentEntityKey;
    @XmlElement(name = "EquipmentIdentifier")
    protected Boolean equipmentIdentifier;
    @XmlElement(name = "EquipmentRemoteShutdownState")
    protected Boolean equipmentRemoteShutdownState;
    @XmlElement(name = "EquipmentTypeEntityKey")
    protected Boolean equipmentTypeEntityKey;
    @XmlElement(name = "EquipmentTypeIsPowerUnit")
    protected Boolean equipmentTypeIsPowerUnit;
    @XmlElement(name = "IgnitionKillSwitchState_EquipmentIgnitionKillSwitchState")
    protected Boolean ignitionKillSwitchStateEquipmentIgnitionKillSwitchState;
    @XmlElement(name = "MotionState_LastKnownMotionState")
    protected Boolean motionStateLastKnownMotionState;
    @XmlElement(name = "PanicButtonState_EquipmentPanicButtonState")
    protected Boolean panicButtonStateEquipmentPanicButtonState;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Boolean telematicsDeviceEntityKey;
    @XmlElement(name = "TelematicsDeviceHasDeRate")
    protected Boolean telematicsDeviceHasDeRate;
    @XmlElement(name = "TelematicsDeviceHasKillSwitch")
    protected Boolean telematicsDeviceHasKillSwitch;

    /**
     * Obtém o valor da propriedade acceleratorStateEquipmentAcceleratorState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceleratorStateEquipmentAcceleratorState() {
        return acceleratorStateEquipmentAcceleratorState;
    }

    /**
     * Define o valor da propriedade acceleratorStateEquipmentAcceleratorState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceleratorStateEquipmentAcceleratorState(Boolean value) {
        this.acceleratorStateEquipmentAcceleratorState = value;
    }

    /**
     * Obtém o valor da propriedade beginAtStopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeginAtStopEntityKey() {
        return beginAtStopEntityKey;
    }

    /**
     * Define o valor da propriedade beginAtStopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeginAtStopEntityKey(Boolean value) {
        this.beginAtStopEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade endAtStopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndAtStopEntityKey() {
        return endAtStopEntityKey;
    }

    /**
     * Define o valor da propriedade endAtStopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndAtStopEntityKey(Boolean value) {
        this.endAtStopEntityKey = value;
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
     * Obtém o valor da propriedade equipmentRemoteShutdownState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentRemoteShutdownState() {
        return equipmentRemoteShutdownState;
    }

    /**
     * Define o valor da propriedade equipmentRemoteShutdownState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentRemoteShutdownState(Boolean value) {
        this.equipmentRemoteShutdownState = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeEntityKey() {
        return equipmentTypeEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeEntityKey(Boolean value) {
        this.equipmentTypeEntityKey = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnitionKillSwitchStateEquipmentIgnitionKillSwitchState() {
        return ignitionKillSwitchStateEquipmentIgnitionKillSwitchState;
    }

    /**
     * Define o valor da propriedade ignitionKillSwitchStateEquipmentIgnitionKillSwitchState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnitionKillSwitchStateEquipmentIgnitionKillSwitchState(Boolean value) {
        this.ignitionKillSwitchStateEquipmentIgnitionKillSwitchState = value;
    }

    /**
     * Obtém o valor da propriedade motionStateLastKnownMotionState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMotionStateLastKnownMotionState() {
        return motionStateLastKnownMotionState;
    }

    /**
     * Define o valor da propriedade motionStateLastKnownMotionState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMotionStateLastKnownMotionState(Boolean value) {
        this.motionStateLastKnownMotionState = value;
    }

    /**
     * Obtém o valor da propriedade panicButtonStateEquipmentPanicButtonState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPanicButtonStateEquipmentPanicButtonState() {
        return panicButtonStateEquipmentPanicButtonState;
    }

    /**
     * Define o valor da propriedade panicButtonStateEquipmentPanicButtonState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPanicButtonStateEquipmentPanicButtonState(Boolean value) {
        this.panicButtonStateEquipmentPanicButtonState = value;
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
