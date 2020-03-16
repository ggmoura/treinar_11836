
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.FuelEconomy;
import com.roadnet.apex.datacontracts.LiquidVolume;
import com.roadnet.apex.datacontracts.Speed;
import com.roadnet.apex.datacontracts.Temperature;
import com.roadnet.apex.datacontracts.TransmissionGearState;


/**
 * <p>Classe Java de VehicleStatusUpdateAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleStatusUpdateAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceleratorPosition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AmbientAirTemperature" type="{http://roadnet.com/apex/DataContracts/}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="BatteryVoltage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CoolantLevelPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CoolantTemperatureValue" type="{http://roadnet.com/apex/DataContracts/}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="CruiseControlStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeviceCalculatedEngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="DeviceCalculatedOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="ECMSpeed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="EngineAverageFuelEconomy" type="{http://roadnet.com/apex/DataContracts/}FuelEconomy" minOccurs="0"/&gt;
 *         &lt;element name="EngineOilLevelPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="EngineOilTemperature" type="{http://roadnet.com/apex/DataContracts/}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="EngineRPM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EngineTotalIdleFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="EngineTotalIdleHours" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="GearState" type="{http://roadnet.com/apex/DataContracts/}TransmissionGearState" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionState_IgnitionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Input0Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input1Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input2Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input3Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input4Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input5Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input6Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input7Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTelemetrySnapshot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Odometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="ParkBrakeStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PowerTakeOffState_PowerTakeOffState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedSignalStrengthIndicator" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TemperatureSensorValue" type="{http://roadnet.com/apex/DataContracts/}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusReportedBatteryVoltage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleStatusUpdateAction", propOrder = {
    "acceleratorPosition",
    "ambientAirTemperature",
    "batteryVoltage",
    "coolantLevelPercentage",
    "coolantTemperatureValue",
    "cruiseControlStatus",
    "deviceCalculatedEngineRunTime",
    "deviceCalculatedOdometer",
    "ecmSpeed",
    "engineAverageFuelEconomy",
    "engineOilLevelPercentage",
    "engineOilTemperature",
    "engineRPM",
    "engineTotalIdleFuelUsed",
    "engineTotalIdleHours",
    "gearState",
    "ignitionStateIgnitionState",
    "input0Value",
    "input1Value",
    "input2Value",
    "input3Value",
    "input4Value",
    "input5Value",
    "input6Value",
    "input7Value",
    "isTelemetrySnapshot",
    "odometer",
    "parkBrakeStatus",
    "powerTakeOffStatePowerTakeOffState",
    "receivedSignalStrengthIndicator",
    "temperatureSensorValue",
    "totalEngineRunTime",
    "totalFuelUsed",
    "vehicleBusReportedBatteryVoltage"
})
public class VehicleStatusUpdateAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "AcceleratorPosition", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> acceleratorPosition;
    @XmlElementRef(name = "AmbientAirTemperature", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Temperature> ambientAirTemperature;
    @XmlElementRef(name = "BatteryVoltage", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> batteryVoltage;
    @XmlElementRef(name = "CoolantLevelPercentage", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> coolantLevelPercentage;
    @XmlElementRef(name = "CoolantTemperatureValue", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Temperature> coolantTemperatureValue;
    @XmlElementRef(name = "CruiseControlStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cruiseControlStatus;
    @XmlElementRef(name = "DeviceCalculatedEngineRunTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> deviceCalculatedEngineRunTime;
    @XmlElementRef(name = "DeviceCalculatedOdometer", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> deviceCalculatedOdometer;
    @XmlElementRef(name = "ECMSpeed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> ecmSpeed;
    @XmlElementRef(name = "EngineAverageFuelEconomy", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<FuelEconomy> engineAverageFuelEconomy;
    @XmlElementRef(name = "EngineOilLevelPercentage", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> engineOilLevelPercentage;
    @XmlElementRef(name = "EngineOilTemperature", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Temperature> engineOilTemperature;
    @XmlElementRef(name = "EngineRPM", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> engineRPM;
    @XmlElementRef(name = "EngineTotalIdleFuelUsed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> engineTotalIdleFuelUsed;
    @XmlElementRef(name = "EngineTotalIdleHours", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> engineTotalIdleHours;
    @XmlElementRef(name = "GearState", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<TransmissionGearState> gearState;
    @XmlElementRef(name = "IgnitionState_IgnitionState", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ignitionStateIgnitionState;
    @XmlElementRef(name = "Input0Value", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input0Value;
    @XmlElementRef(name = "Input1Value", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input1Value;
    @XmlElementRef(name = "Input2Value", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input2Value;
    @XmlElementRef(name = "Input3Value", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input3Value;
    @XmlElementRef(name = "Input4Value", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input4Value;
    @XmlElementRef(name = "Input5Value", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input5Value;
    @XmlElementRef(name = "Input6Value", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input6Value;
    @XmlElementRef(name = "Input7Value", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input7Value;
    @XmlElement(name = "IsTelemetrySnapshot")
    protected Boolean isTelemetrySnapshot;
    @XmlElementRef(name = "Odometer", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> odometer;
    @XmlElementRef(name = "ParkBrakeStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> parkBrakeStatus;
    @XmlElementRef(name = "PowerTakeOffState_PowerTakeOffState", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> powerTakeOffStatePowerTakeOffState;
    @XmlElementRef(name = "ReceivedSignalStrengthIndicator", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receivedSignalStrengthIndicator;
    @XmlElementRef(name = "TemperatureSensorValue", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Temperature> temperatureSensorValue;
    @XmlElementRef(name = "TotalEngineRunTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalEngineRunTime;
    @XmlElementRef(name = "TotalFuelUsed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> totalFuelUsed;
    @XmlElementRef(name = "VehicleBusReportedBatteryVoltage", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vehicleBusReportedBatteryVoltage;

    /**
     * Obtém o valor da propriedade acceleratorPosition.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAcceleratorPosition() {
        return acceleratorPosition;
    }

    /**
     * Define o valor da propriedade acceleratorPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAcceleratorPosition(JAXBElement<Double> value) {
        this.acceleratorPosition = value;
    }

    /**
     * Obtém o valor da propriedade ambientAirTemperature.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public JAXBElement<Temperature> getAmbientAirTemperature() {
        return ambientAirTemperature;
    }

    /**
     * Define o valor da propriedade ambientAirTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public void setAmbientAirTemperature(JAXBElement<Temperature> value) {
        this.ambientAirTemperature = value;
    }

    /**
     * Obtém o valor da propriedade batteryVoltage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBatteryVoltage() {
        return batteryVoltage;
    }

    /**
     * Define o valor da propriedade batteryVoltage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBatteryVoltage(JAXBElement<Double> value) {
        this.batteryVoltage = value;
    }

    /**
     * Obtém o valor da propriedade coolantLevelPercentage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCoolantLevelPercentage() {
        return coolantLevelPercentage;
    }

    /**
     * Define o valor da propriedade coolantLevelPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCoolantLevelPercentage(JAXBElement<Double> value) {
        this.coolantLevelPercentage = value;
    }

    /**
     * Obtém o valor da propriedade coolantTemperatureValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public JAXBElement<Temperature> getCoolantTemperatureValue() {
        return coolantTemperatureValue;
    }

    /**
     * Define o valor da propriedade coolantTemperatureValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public void setCoolantTemperatureValue(JAXBElement<Temperature> value) {
        this.coolantTemperatureValue = value;
    }

    /**
     * Obtém o valor da propriedade cruiseControlStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCruiseControlStatus() {
        return cruiseControlStatus;
    }

    /**
     * Define o valor da propriedade cruiseControlStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCruiseControlStatus(JAXBElement<Boolean> value) {
        this.cruiseControlStatus = value;
    }

    /**
     * Obtém o valor da propriedade deviceCalculatedEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getDeviceCalculatedEngineRunTime() {
        return deviceCalculatedEngineRunTime;
    }

    /**
     * Define o valor da propriedade deviceCalculatedEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setDeviceCalculatedEngineRunTime(JAXBElement<Duration> value) {
        this.deviceCalculatedEngineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade deviceCalculatedOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDeviceCalculatedOdometer() {
        return deviceCalculatedOdometer;
    }

    /**
     * Define o valor da propriedade deviceCalculatedOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDeviceCalculatedOdometer(JAXBElement<Distance> value) {
        this.deviceCalculatedOdometer = value;
    }

    /**
     * Obtém o valor da propriedade ecmSpeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getECMSpeed() {
        return ecmSpeed;
    }

    /**
     * Define o valor da propriedade ecmSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setECMSpeed(JAXBElement<Speed> value) {
        this.ecmSpeed = value;
    }

    /**
     * Obtém o valor da propriedade engineAverageFuelEconomy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FuelEconomy }{@code >}
     *     
     */
    public JAXBElement<FuelEconomy> getEngineAverageFuelEconomy() {
        return engineAverageFuelEconomy;
    }

    /**
     * Define o valor da propriedade engineAverageFuelEconomy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FuelEconomy }{@code >}
     *     
     */
    public void setEngineAverageFuelEconomy(JAXBElement<FuelEconomy> value) {
        this.engineAverageFuelEconomy = value;
    }

    /**
     * Obtém o valor da propriedade engineOilLevelPercentage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getEngineOilLevelPercentage() {
        return engineOilLevelPercentage;
    }

    /**
     * Define o valor da propriedade engineOilLevelPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setEngineOilLevelPercentage(JAXBElement<Double> value) {
        this.engineOilLevelPercentage = value;
    }

    /**
     * Obtém o valor da propriedade engineOilTemperature.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public JAXBElement<Temperature> getEngineOilTemperature() {
        return engineOilTemperature;
    }

    /**
     * Define o valor da propriedade engineOilTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public void setEngineOilTemperature(JAXBElement<Temperature> value) {
        this.engineOilTemperature = value;
    }

    /**
     * Obtém o valor da propriedade engineRPM.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEngineRPM() {
        return engineRPM;
    }

    /**
     * Define o valor da propriedade engineRPM.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEngineRPM(JAXBElement<Integer> value) {
        this.engineRPM = value;
    }

    /**
     * Obtém o valor da propriedade engineTotalIdleFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getEngineTotalIdleFuelUsed() {
        return engineTotalIdleFuelUsed;
    }

    /**
     * Define o valor da propriedade engineTotalIdleFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setEngineTotalIdleFuelUsed(JAXBElement<LiquidVolume> value) {
        this.engineTotalIdleFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade engineTotalIdleHours.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getEngineTotalIdleHours() {
        return engineTotalIdleHours;
    }

    /**
     * Define o valor da propriedade engineTotalIdleHours.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setEngineTotalIdleHours(JAXBElement<Duration> value) {
        this.engineTotalIdleHours = value;
    }

    /**
     * Obtém o valor da propriedade gearState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransmissionGearState }{@code >}
     *     
     */
    public JAXBElement<TransmissionGearState> getGearState() {
        return gearState;
    }

    /**
     * Define o valor da propriedade gearState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransmissionGearState }{@code >}
     *     
     */
    public void setGearState(JAXBElement<TransmissionGearState> value) {
        this.gearState = value;
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
     * Obtém o valor da propriedade input0Value.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput0Value() {
        return input0Value;
    }

    /**
     * Define o valor da propriedade input0Value.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput0Value(JAXBElement<Boolean> value) {
        this.input0Value = value;
    }

    /**
     * Obtém o valor da propriedade input1Value.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput1Value() {
        return input1Value;
    }

    /**
     * Define o valor da propriedade input1Value.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput1Value(JAXBElement<Boolean> value) {
        this.input1Value = value;
    }

    /**
     * Obtém o valor da propriedade input2Value.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput2Value() {
        return input2Value;
    }

    /**
     * Define o valor da propriedade input2Value.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput2Value(JAXBElement<Boolean> value) {
        this.input2Value = value;
    }

    /**
     * Obtém o valor da propriedade input3Value.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput3Value() {
        return input3Value;
    }

    /**
     * Define o valor da propriedade input3Value.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput3Value(JAXBElement<Boolean> value) {
        this.input3Value = value;
    }

    /**
     * Obtém o valor da propriedade input4Value.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput4Value() {
        return input4Value;
    }

    /**
     * Define o valor da propriedade input4Value.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput4Value(JAXBElement<Boolean> value) {
        this.input4Value = value;
    }

    /**
     * Obtém o valor da propriedade input5Value.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput5Value() {
        return input5Value;
    }

    /**
     * Define o valor da propriedade input5Value.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput5Value(JAXBElement<Boolean> value) {
        this.input5Value = value;
    }

    /**
     * Obtém o valor da propriedade input6Value.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput6Value() {
        return input6Value;
    }

    /**
     * Define o valor da propriedade input6Value.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput6Value(JAXBElement<Boolean> value) {
        this.input6Value = value;
    }

    /**
     * Obtém o valor da propriedade input7Value.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput7Value() {
        return input7Value;
    }

    /**
     * Define o valor da propriedade input7Value.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput7Value(JAXBElement<Boolean> value) {
        this.input7Value = value;
    }

    /**
     * Obtém o valor da propriedade isTelemetrySnapshot.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTelemetrySnapshot() {
        return isTelemetrySnapshot;
    }

    /**
     * Define o valor da propriedade isTelemetrySnapshot.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTelemetrySnapshot(Boolean value) {
        this.isTelemetrySnapshot = value;
    }

    /**
     * Obtém o valor da propriedade odometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getOdometer() {
        return odometer;
    }

    /**
     * Define o valor da propriedade odometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setOdometer(JAXBElement<Distance> value) {
        this.odometer = value;
    }

    /**
     * Obtém o valor da propriedade parkBrakeStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getParkBrakeStatus() {
        return parkBrakeStatus;
    }

    /**
     * Define o valor da propriedade parkBrakeStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setParkBrakeStatus(JAXBElement<Boolean> value) {
        this.parkBrakeStatus = value;
    }

    /**
     * Obtém o valor da propriedade powerTakeOffStatePowerTakeOffState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPowerTakeOffStatePowerTakeOffState() {
        return powerTakeOffStatePowerTakeOffState;
    }

    /**
     * Define o valor da propriedade powerTakeOffStatePowerTakeOffState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPowerTakeOffStatePowerTakeOffState(JAXBElement<String> value) {
        this.powerTakeOffStatePowerTakeOffState = value;
    }

    /**
     * Obtém o valor da propriedade receivedSignalStrengthIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceivedSignalStrengthIndicator() {
        return receivedSignalStrengthIndicator;
    }

    /**
     * Define o valor da propriedade receivedSignalStrengthIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceivedSignalStrengthIndicator(JAXBElement<Double> value) {
        this.receivedSignalStrengthIndicator = value;
    }

    /**
     * Obtém o valor da propriedade temperatureSensorValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public JAXBElement<Temperature> getTemperatureSensorValue() {
        return temperatureSensorValue;
    }

    /**
     * Define o valor da propriedade temperatureSensorValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public void setTemperatureSensorValue(JAXBElement<Temperature> value) {
        this.temperatureSensorValue = value;
    }

    /**
     * Obtém o valor da propriedade totalEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalEngineRunTime() {
        return totalEngineRunTime;
    }

    /**
     * Define o valor da propriedade totalEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalEngineRunTime(JAXBElement<Duration> value) {
        this.totalEngineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade totalFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getTotalFuelUsed() {
        return totalFuelUsed;
    }

    /**
     * Define o valor da propriedade totalFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setTotalFuelUsed(JAXBElement<LiquidVolume> value) {
        this.totalFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade vehicleBusReportedBatteryVoltage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVehicleBusReportedBatteryVoltage() {
        return vehicleBusReportedBatteryVoltage;
    }

    /**
     * Define o valor da propriedade vehicleBusReportedBatteryVoltage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVehicleBusReportedBatteryVoltage(JAXBElement<Double> value) {
        this.vehicleBusReportedBatteryVoltage = value;
    }

}
