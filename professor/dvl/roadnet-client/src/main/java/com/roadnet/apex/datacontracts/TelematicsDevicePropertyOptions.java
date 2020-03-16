
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelematicsDevicePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelematicsDevicePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BaseMobileDevicePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentRegionDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOmnitracsNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOmnitracsNavigationPlus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableVoiceNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasPendingUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input0" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input5" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input6" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input7" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InputOutputConfigurationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InstalledHardware" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationActivationCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PendingFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PendingScriptVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PendingVehicleDatabaseVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PendingVehicleInterfaceFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PowerSource_CurrentPowerSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SatelliteModemIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScriptVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceHardwarePlatform_HardwarePlatform" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsProviderType_ProviderType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusStatus_VehicleBusStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleDatabaseVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleInterfaceFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleInterface_RoadnetTelematicsVehicleInterface" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelematicsDevicePropertyOptions", propOrder = {
    "currentRegionDescription",
    "currentRegionIdentifier",
    "enableOmnitracsNavigation",
    "enableOmnitracsNavigationPlus",
    "enableVoiceNavigation",
    "firmwareVersion",
    "hasPendingUpdate",
    "input0",
    "input1",
    "input2",
    "input3",
    "input4",
    "input5",
    "input6",
    "input7",
    "inputOutputConfigurationEntityKey",
    "installedHardware",
    "model",
    "omnitracsNavigationActivationCode",
    "pendingFirmwareVersion",
    "pendingScriptVersion",
    "pendingVehicleDatabaseVersion",
    "pendingVehicleInterfaceFirmwareVersion",
    "powerSourceCurrentPowerSource",
    "satelliteModemIdentifier",
    "scriptVersion",
    "telematicsDeviceHardwarePlatformHardwarePlatform",
    "telematicsProviderTypeProviderType",
    "vehicleBusStatusVehicleBusStatus",
    "vehicleDatabaseVersion",
    "vehicleInterfaceFirmwareVersion",
    "vehicleInterfaceRoadnetTelematicsVehicleInterface"
})
public class TelematicsDevicePropertyOptions
    extends BaseMobileDevicePropertyOptions
{

    @XmlElement(name = "CurrentRegionDescription")
    protected Boolean currentRegionDescription;
    @XmlElement(name = "CurrentRegionIdentifier")
    protected Boolean currentRegionIdentifier;
    @XmlElement(name = "EnableOmnitracsNavigation")
    protected Boolean enableOmnitracsNavigation;
    @XmlElement(name = "EnableOmnitracsNavigationPlus")
    protected Boolean enableOmnitracsNavigationPlus;
    @XmlElement(name = "EnableVoiceNavigation")
    protected Boolean enableVoiceNavigation;
    @XmlElement(name = "FirmwareVersion")
    protected Boolean firmwareVersion;
    @XmlElement(name = "HasPendingUpdate")
    protected Boolean hasPendingUpdate;
    @XmlElement(name = "Input0")
    protected Boolean input0;
    @XmlElement(name = "Input1")
    protected Boolean input1;
    @XmlElement(name = "Input2")
    protected Boolean input2;
    @XmlElement(name = "Input3")
    protected Boolean input3;
    @XmlElement(name = "Input4")
    protected Boolean input4;
    @XmlElement(name = "Input5")
    protected Boolean input5;
    @XmlElement(name = "Input6")
    protected Boolean input6;
    @XmlElement(name = "Input7")
    protected Boolean input7;
    @XmlElement(name = "InputOutputConfigurationEntityKey")
    protected Boolean inputOutputConfigurationEntityKey;
    @XmlElement(name = "InstalledHardware")
    protected Boolean installedHardware;
    @XmlElement(name = "Model")
    protected Boolean model;
    @XmlElement(name = "OmnitracsNavigationActivationCode")
    protected Boolean omnitracsNavigationActivationCode;
    @XmlElement(name = "PendingFirmwareVersion")
    protected Boolean pendingFirmwareVersion;
    @XmlElement(name = "PendingScriptVersion")
    protected Boolean pendingScriptVersion;
    @XmlElement(name = "PendingVehicleDatabaseVersion")
    protected Boolean pendingVehicleDatabaseVersion;
    @XmlElement(name = "PendingVehicleInterfaceFirmwareVersion")
    protected Boolean pendingVehicleInterfaceFirmwareVersion;
    @XmlElement(name = "PowerSource_CurrentPowerSource")
    protected Boolean powerSourceCurrentPowerSource;
    @XmlElement(name = "SatelliteModemIdentifier")
    protected Boolean satelliteModemIdentifier;
    @XmlElement(name = "ScriptVersion")
    protected Boolean scriptVersion;
    @XmlElement(name = "TelematicsDeviceHardwarePlatform_HardwarePlatform")
    protected Boolean telematicsDeviceHardwarePlatformHardwarePlatform;
    @XmlElement(name = "TelematicsProviderType_ProviderType")
    protected Boolean telematicsProviderTypeProviderType;
    @XmlElement(name = "VehicleBusStatus_VehicleBusStatus")
    protected Boolean vehicleBusStatusVehicleBusStatus;
    @XmlElement(name = "VehicleDatabaseVersion")
    protected Boolean vehicleDatabaseVersion;
    @XmlElement(name = "VehicleInterfaceFirmwareVersion")
    protected Boolean vehicleInterfaceFirmwareVersion;
    @XmlElement(name = "VehicleInterface_RoadnetTelematicsVehicleInterface")
    protected Boolean vehicleInterfaceRoadnetTelematicsVehicleInterface;

    /**
     * Obtém o valor da propriedade currentRegionDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentRegionDescription() {
        return currentRegionDescription;
    }

    /**
     * Define o valor da propriedade currentRegionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentRegionDescription(Boolean value) {
        this.currentRegionDescription = value;
    }

    /**
     * Obtém o valor da propriedade currentRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentRegionIdentifier() {
        return currentRegionIdentifier;
    }

    /**
     * Define o valor da propriedade currentRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentRegionIdentifier(Boolean value) {
        this.currentRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade enableOmnitracsNavigation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableOmnitracsNavigation() {
        return enableOmnitracsNavigation;
    }

    /**
     * Define o valor da propriedade enableOmnitracsNavigation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableOmnitracsNavigation(Boolean value) {
        this.enableOmnitracsNavigation = value;
    }

    /**
     * Obtém o valor da propriedade enableOmnitracsNavigationPlus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableOmnitracsNavigationPlus() {
        return enableOmnitracsNavigationPlus;
    }

    /**
     * Define o valor da propriedade enableOmnitracsNavigationPlus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableOmnitracsNavigationPlus(Boolean value) {
        this.enableOmnitracsNavigationPlus = value;
    }

    /**
     * Obtém o valor da propriedade enableVoiceNavigation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableVoiceNavigation() {
        return enableVoiceNavigation;
    }

    /**
     * Define o valor da propriedade enableVoiceNavigation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableVoiceNavigation(Boolean value) {
        this.enableVoiceNavigation = value;
    }

    /**
     * Obtém o valor da propriedade firmwareVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Define o valor da propriedade firmwareVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirmwareVersion(Boolean value) {
        this.firmwareVersion = value;
    }

    /**
     * Obtém o valor da propriedade hasPendingUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPendingUpdate() {
        return hasPendingUpdate;
    }

    /**
     * Define o valor da propriedade hasPendingUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPendingUpdate(Boolean value) {
        this.hasPendingUpdate = value;
    }

    /**
     * Obtém o valor da propriedade input0.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput0() {
        return input0;
    }

    /**
     * Define o valor da propriedade input0.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput0(Boolean value) {
        this.input0 = value;
    }

    /**
     * Obtém o valor da propriedade input1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput1() {
        return input1;
    }

    /**
     * Define o valor da propriedade input1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput1(Boolean value) {
        this.input1 = value;
    }

    /**
     * Obtém o valor da propriedade input2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput2() {
        return input2;
    }

    /**
     * Define o valor da propriedade input2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput2(Boolean value) {
        this.input2 = value;
    }

    /**
     * Obtém o valor da propriedade input3.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput3() {
        return input3;
    }

    /**
     * Define o valor da propriedade input3.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput3(Boolean value) {
        this.input3 = value;
    }

    /**
     * Obtém o valor da propriedade input4.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput4() {
        return input4;
    }

    /**
     * Define o valor da propriedade input4.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput4(Boolean value) {
        this.input4 = value;
    }

    /**
     * Obtém o valor da propriedade input5.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput5() {
        return input5;
    }

    /**
     * Define o valor da propriedade input5.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput5(Boolean value) {
        this.input5 = value;
    }

    /**
     * Obtém o valor da propriedade input6.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput6() {
        return input6;
    }

    /**
     * Define o valor da propriedade input6.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput6(Boolean value) {
        this.input6 = value;
    }

    /**
     * Obtém o valor da propriedade input7.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput7() {
        return input7;
    }

    /**
     * Define o valor da propriedade input7.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput7(Boolean value) {
        this.input7 = value;
    }

    /**
     * Obtém o valor da propriedade inputOutputConfigurationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInputOutputConfigurationEntityKey() {
        return inputOutputConfigurationEntityKey;
    }

    /**
     * Define o valor da propriedade inputOutputConfigurationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInputOutputConfigurationEntityKey(Boolean value) {
        this.inputOutputConfigurationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade installedHardware.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstalledHardware() {
        return installedHardware;
    }

    /**
     * Define o valor da propriedade installedHardware.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstalledHardware(Boolean value) {
        this.installedHardware = value;
    }

    /**
     * Obtém o valor da propriedade model.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModel() {
        return model;
    }

    /**
     * Define o valor da propriedade model.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModel(Boolean value) {
        this.model = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigationActivationCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsNavigationActivationCode() {
        return omnitracsNavigationActivationCode;
    }

    /**
     * Define o valor da propriedade omnitracsNavigationActivationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsNavigationActivationCode(Boolean value) {
        this.omnitracsNavigationActivationCode = value;
    }

    /**
     * Obtém o valor da propriedade pendingFirmwareVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPendingFirmwareVersion() {
        return pendingFirmwareVersion;
    }

    /**
     * Define o valor da propriedade pendingFirmwareVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendingFirmwareVersion(Boolean value) {
        this.pendingFirmwareVersion = value;
    }

    /**
     * Obtém o valor da propriedade pendingScriptVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPendingScriptVersion() {
        return pendingScriptVersion;
    }

    /**
     * Define o valor da propriedade pendingScriptVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendingScriptVersion(Boolean value) {
        this.pendingScriptVersion = value;
    }

    /**
     * Obtém o valor da propriedade pendingVehicleDatabaseVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPendingVehicleDatabaseVersion() {
        return pendingVehicleDatabaseVersion;
    }

    /**
     * Define o valor da propriedade pendingVehicleDatabaseVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendingVehicleDatabaseVersion(Boolean value) {
        this.pendingVehicleDatabaseVersion = value;
    }

    /**
     * Obtém o valor da propriedade pendingVehicleInterfaceFirmwareVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPendingVehicleInterfaceFirmwareVersion() {
        return pendingVehicleInterfaceFirmwareVersion;
    }

    /**
     * Define o valor da propriedade pendingVehicleInterfaceFirmwareVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendingVehicleInterfaceFirmwareVersion(Boolean value) {
        this.pendingVehicleInterfaceFirmwareVersion = value;
    }

    /**
     * Obtém o valor da propriedade powerSourceCurrentPowerSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowerSourceCurrentPowerSource() {
        return powerSourceCurrentPowerSource;
    }

    /**
     * Define o valor da propriedade powerSourceCurrentPowerSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowerSourceCurrentPowerSource(Boolean value) {
        this.powerSourceCurrentPowerSource = value;
    }

    /**
     * Obtém o valor da propriedade satelliteModemIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSatelliteModemIdentifier() {
        return satelliteModemIdentifier;
    }

    /**
     * Define o valor da propriedade satelliteModemIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSatelliteModemIdentifier(Boolean value) {
        this.satelliteModemIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade scriptVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScriptVersion() {
        return scriptVersion;
    }

    /**
     * Define o valor da propriedade scriptVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScriptVersion(Boolean value) {
        this.scriptVersion = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceHardwarePlatformHardwarePlatform.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceHardwarePlatformHardwarePlatform() {
        return telematicsDeviceHardwarePlatformHardwarePlatform;
    }

    /**
     * Define o valor da propriedade telematicsDeviceHardwarePlatformHardwarePlatform.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceHardwarePlatformHardwarePlatform(Boolean value) {
        this.telematicsDeviceHardwarePlatformHardwarePlatform = value;
    }

    /**
     * Obtém o valor da propriedade telematicsProviderTypeProviderType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsProviderTypeProviderType() {
        return telematicsProviderTypeProviderType;
    }

    /**
     * Define o valor da propriedade telematicsProviderTypeProviderType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsProviderTypeProviderType(Boolean value) {
        this.telematicsProviderTypeProviderType = value;
    }

    /**
     * Obtém o valor da propriedade vehicleBusStatusVehicleBusStatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleBusStatusVehicleBusStatus() {
        return vehicleBusStatusVehicleBusStatus;
    }

    /**
     * Define o valor da propriedade vehicleBusStatusVehicleBusStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleBusStatusVehicleBusStatus(Boolean value) {
        this.vehicleBusStatusVehicleBusStatus = value;
    }

    /**
     * Obtém o valor da propriedade vehicleDatabaseVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleDatabaseVersion() {
        return vehicleDatabaseVersion;
    }

    /**
     * Define o valor da propriedade vehicleDatabaseVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleDatabaseVersion(Boolean value) {
        this.vehicleDatabaseVersion = value;
    }

    /**
     * Obtém o valor da propriedade vehicleInterfaceFirmwareVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleInterfaceFirmwareVersion() {
        return vehicleInterfaceFirmwareVersion;
    }

    /**
     * Define o valor da propriedade vehicleInterfaceFirmwareVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleInterfaceFirmwareVersion(Boolean value) {
        this.vehicleInterfaceFirmwareVersion = value;
    }

    /**
     * Obtém o valor da propriedade vehicleInterfaceRoadnetTelematicsVehicleInterface.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleInterfaceRoadnetTelematicsVehicleInterface() {
        return vehicleInterfaceRoadnetTelematicsVehicleInterface;
    }

    /**
     * Define o valor da propriedade vehicleInterfaceRoadnetTelematicsVehicleInterface.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleInterfaceRoadnetTelematicsVehicleInterface(Boolean value) {
        this.vehicleInterfaceRoadnetTelematicsVehicleInterface = value;
    }

}
