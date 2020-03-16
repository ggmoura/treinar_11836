
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DiagnosticTroubleCodeEventPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticTroubleCodeEventPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CoolantTemperatureValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndOdometer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndTotalEngineHours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EngineRPM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EngineTemperatureValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FailureModeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GearState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsProprietaryCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MessageIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParameterIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartOdometer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTotalEngineHours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SubsystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SuspectParameterNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TroubleCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticTroubleCodeEventPropertyOptions", propOrder = {
    "code",
    "coolantTemperatureValue",
    "coordinate",
    "coordinateTime",
    "description",
    "endOdometer",
    "endTime",
    "endTotalEngineHours",
    "engineRPM",
    "engineTemperatureValue",
    "equipmentEntityKey",
    "failureModeIdentifier",
    "gearState",
    "isActive",
    "isProprietaryCode",
    "messageIdentifier",
    "parameterIdentifier",
    "sourceAddress",
    "startOdometer",
    "startTime",
    "startTotalEngineHours",
    "subsystemIdentifier",
    "suspectParameterNumber",
    "troubleCode"
})
@XmlSeeAlso({
    J1587TroubleCodeEventPropertyOptions.class,
    J1939TroubleCodeEventPropertyOptions.class,
    OBD2TroubleCodeEventPropertyOptions.class
})
public class DiagnosticTroubleCodeEventPropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Code")
    protected Boolean code;
    @XmlElement(name = "CoolantTemperatureValue")
    protected Boolean coolantTemperatureValue;
    @XmlElement(name = "Coordinate")
    protected Boolean coordinate;
    @XmlElement(name = "CoordinateTime")
    protected Boolean coordinateTime;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EndOdometer")
    protected Boolean endOdometer;
    @XmlElement(name = "EndTime")
    protected Boolean endTime;
    @XmlElement(name = "EndTotalEngineHours")
    protected Boolean endTotalEngineHours;
    @XmlElement(name = "EngineRPM")
    protected Boolean engineRPM;
    @XmlElement(name = "EngineTemperatureValue")
    protected Boolean engineTemperatureValue;
    @XmlElement(name = "EquipmentEntityKey")
    protected Boolean equipmentEntityKey;
    @XmlElement(name = "FailureModeIdentifier")
    protected Boolean failureModeIdentifier;
    @XmlElement(name = "GearState")
    protected Boolean gearState;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "IsProprietaryCode")
    protected Boolean isProprietaryCode;
    @XmlElement(name = "MessageIdentifier")
    protected Boolean messageIdentifier;
    @XmlElement(name = "ParameterIdentifier")
    protected Boolean parameterIdentifier;
    @XmlElement(name = "SourceAddress")
    protected Boolean sourceAddress;
    @XmlElement(name = "StartOdometer")
    protected Boolean startOdometer;
    @XmlElement(name = "StartTime")
    protected Boolean startTime;
    @XmlElement(name = "StartTotalEngineHours")
    protected Boolean startTotalEngineHours;
    @XmlElement(name = "SubsystemIdentifier")
    protected Boolean subsystemIdentifier;
    @XmlElement(name = "SuspectParameterNumber")
    protected Boolean suspectParameterNumber;
    @XmlElement(name = "TroubleCode")
    protected Boolean troubleCode;

    /**
     * Obtém o valor da propriedade code.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCode() {
        return code;
    }

    /**
     * Define o valor da propriedade code.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCode(Boolean value) {
        this.code = value;
    }

    /**
     * Obtém o valor da propriedade coolantTemperatureValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoolantTemperatureValue() {
        return coolantTemperatureValue;
    }

    /**
     * Define o valor da propriedade coolantTemperatureValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoolantTemperatureValue(Boolean value) {
        this.coolantTemperatureValue = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoordinate(Boolean value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade coordinateTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoordinateTime() {
        return coordinateTime;
    }

    /**
     * Define o valor da propriedade coordinateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoordinateTime(Boolean value) {
        this.coordinateTime = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade endOdometer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndOdometer() {
        return endOdometer;
    }

    /**
     * Define o valor da propriedade endOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndOdometer(Boolean value) {
        this.endOdometer = value;
    }

    /**
     * Obtém o valor da propriedade endTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndTime() {
        return endTime;
    }

    /**
     * Define o valor da propriedade endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndTime(Boolean value) {
        this.endTime = value;
    }

    /**
     * Obtém o valor da propriedade endTotalEngineHours.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndTotalEngineHours() {
        return endTotalEngineHours;
    }

    /**
     * Define o valor da propriedade endTotalEngineHours.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndTotalEngineHours(Boolean value) {
        this.endTotalEngineHours = value;
    }

    /**
     * Obtém o valor da propriedade engineRPM.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEngineRPM() {
        return engineRPM;
    }

    /**
     * Define o valor da propriedade engineRPM.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEngineRPM(Boolean value) {
        this.engineRPM = value;
    }

    /**
     * Obtém o valor da propriedade engineTemperatureValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEngineTemperatureValue() {
        return engineTemperatureValue;
    }

    /**
     * Define o valor da propriedade engineTemperatureValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEngineTemperatureValue(Boolean value) {
        this.engineTemperatureValue = value;
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
     * Obtém o valor da propriedade failureModeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailureModeIdentifier() {
        return failureModeIdentifier;
    }

    /**
     * Define o valor da propriedade failureModeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailureModeIdentifier(Boolean value) {
        this.failureModeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade gearState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGearState() {
        return gearState;
    }

    /**
     * Define o valor da propriedade gearState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGearState(Boolean value) {
        this.gearState = value;
    }

    /**
     * Obtém o valor da propriedade isActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Define o valor da propriedade isActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Obtém o valor da propriedade isProprietaryCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProprietaryCode() {
        return isProprietaryCode;
    }

    /**
     * Define o valor da propriedade isProprietaryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProprietaryCode(Boolean value) {
        this.isProprietaryCode = value;
    }

    /**
     * Obtém o valor da propriedade messageIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Define o valor da propriedade messageIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessageIdentifier(Boolean value) {
        this.messageIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade parameterIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParameterIdentifier() {
        return parameterIdentifier;
    }

    /**
     * Define o valor da propriedade parameterIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParameterIdentifier(Boolean value) {
        this.parameterIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade sourceAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSourceAddress() {
        return sourceAddress;
    }

    /**
     * Define o valor da propriedade sourceAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSourceAddress(Boolean value) {
        this.sourceAddress = value;
    }

    /**
     * Obtém o valor da propriedade startOdometer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartOdometer() {
        return startOdometer;
    }

    /**
     * Define o valor da propriedade startOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartOdometer(Boolean value) {
        this.startOdometer = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTime(Boolean value) {
        this.startTime = value;
    }

    /**
     * Obtém o valor da propriedade startTotalEngineHours.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTotalEngineHours() {
        return startTotalEngineHours;
    }

    /**
     * Define o valor da propriedade startTotalEngineHours.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTotalEngineHours(Boolean value) {
        this.startTotalEngineHours = value;
    }

    /**
     * Obtém o valor da propriedade subsystemIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubsystemIdentifier() {
        return subsystemIdentifier;
    }

    /**
     * Define o valor da propriedade subsystemIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubsystemIdentifier(Boolean value) {
        this.subsystemIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade suspectParameterNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspectParameterNumber() {
        return suspectParameterNumber;
    }

    /**
     * Define o valor da propriedade suspectParameterNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspectParameterNumber(Boolean value) {
        this.suspectParameterNumber = value;
    }

    /**
     * Obtém o valor da propriedade troubleCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTroubleCode() {
        return troubleCode;
    }

    /**
     * Define o valor da propriedade troubleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTroubleCode(Boolean value) {
        this.troubleCode = value;
    }

}
