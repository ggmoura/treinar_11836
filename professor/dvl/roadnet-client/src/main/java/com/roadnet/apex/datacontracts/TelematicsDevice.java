
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelematicsDevice complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelematicsDevice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BaseMobileDevice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentRegionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnableOmnitracsNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOmnitracsNavigationPlus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableVoiceNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasPendingUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input0" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input5" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input6" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input7" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InputOutputConfigurationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InstalledHardware" type="{http://roadnet.com/apex/DataContracts/}TelematicsDevice.TelematicsDeviceHardware" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationActivationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PendingFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PendingScriptVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PendingVehicleDatabaseVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PendingVehicleInterfaceFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PowerSource_CurrentPowerSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SatelliteModemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScriptVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceHardwarePlatform_HardwarePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsProviderType_ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusStatus_VehicleBusStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleDatabaseVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleInterfaceFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleInterface_RoadnetTelematicsVehicleInterface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelematicsDevice", propOrder = {
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
public class TelematicsDevice
    extends BaseMobileDevice
{

    @XmlElementRef(name = "CurrentRegionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRegionDescription;
    @XmlElementRef(name = "CurrentRegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRegionIdentifier;
    @XmlElement(name = "EnableOmnitracsNavigation")
    protected Boolean enableOmnitracsNavigation;
    @XmlElement(name = "EnableOmnitracsNavigationPlus")
    protected Boolean enableOmnitracsNavigationPlus;
    @XmlElement(name = "EnableVoiceNavigation")
    protected Boolean enableVoiceNavigation;
    @XmlElementRef(name = "FirmwareVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firmwareVersion;
    @XmlElement(name = "HasPendingUpdate")
    protected Boolean hasPendingUpdate;
    @XmlElementRef(name = "Input0", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input0;
    @XmlElementRef(name = "Input1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input1;
    @XmlElementRef(name = "Input2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input2;
    @XmlElementRef(name = "Input3", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input3;
    @XmlElementRef(name = "Input4", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input4;
    @XmlElementRef(name = "Input5", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input5;
    @XmlElementRef(name = "Input6", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input6;
    @XmlElementRef(name = "Input7", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> input7;
    @XmlElementRef(name = "InputOutputConfigurationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> inputOutputConfigurationEntityKey;
    @XmlElementRef(name = "InstalledHardware", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceTelematicsDeviceHardware> installedHardware;
    @XmlElementRef(name = "Model", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "OmnitracsNavigationActivationCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omnitracsNavigationActivationCode;
    @XmlElementRef(name = "PendingFirmwareVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pendingFirmwareVersion;
    @XmlElementRef(name = "PendingScriptVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pendingScriptVersion;
    @XmlElementRef(name = "PendingVehicleDatabaseVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pendingVehicleDatabaseVersion;
    @XmlElementRef(name = "PendingVehicleInterfaceFirmwareVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pendingVehicleInterfaceFirmwareVersion;
    @XmlElementRef(name = "PowerSource_CurrentPowerSource", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> powerSourceCurrentPowerSource;
    @XmlElementRef(name = "SatelliteModemIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> satelliteModemIdentifier;
    @XmlElementRef(name = "ScriptVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scriptVersion;
    @XmlElementRef(name = "TelematicsDeviceHardwarePlatform_HardwarePlatform", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telematicsDeviceHardwarePlatformHardwarePlatform;
    @XmlElementRef(name = "TelematicsProviderType_ProviderType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telematicsProviderTypeProviderType;
    @XmlElementRef(name = "VehicleBusStatus_VehicleBusStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleBusStatusVehicleBusStatus;
    @XmlElementRef(name = "VehicleDatabaseVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleDatabaseVersion;
    @XmlElementRef(name = "VehicleInterfaceFirmwareVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleInterfaceFirmwareVersion;
    @XmlElementRef(name = "VehicleInterface_RoadnetTelematicsVehicleInterface", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleInterfaceRoadnetTelematicsVehicleInterface;

    /**
     * Obtém o valor da propriedade currentRegionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentRegionDescription() {
        return currentRegionDescription;
    }

    /**
     * Define o valor da propriedade currentRegionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentRegionDescription(JAXBElement<String> value) {
        this.currentRegionDescription = value;
    }

    /**
     * Obtém o valor da propriedade currentRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentRegionIdentifier() {
        return currentRegionIdentifier;
    }

    /**
     * Define o valor da propriedade currentRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentRegionIdentifier(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Define o valor da propriedade firmwareVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirmwareVersion(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput0() {
        return input0;
    }

    /**
     * Define o valor da propriedade input0.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput0(JAXBElement<Boolean> value) {
        this.input0 = value;
    }

    /**
     * Obtém o valor da propriedade input1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput1() {
        return input1;
    }

    /**
     * Define o valor da propriedade input1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput1(JAXBElement<Boolean> value) {
        this.input1 = value;
    }

    /**
     * Obtém o valor da propriedade input2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput2() {
        return input2;
    }

    /**
     * Define o valor da propriedade input2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput2(JAXBElement<Boolean> value) {
        this.input2 = value;
    }

    /**
     * Obtém o valor da propriedade input3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput3() {
        return input3;
    }

    /**
     * Define o valor da propriedade input3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput3(JAXBElement<Boolean> value) {
        this.input3 = value;
    }

    /**
     * Obtém o valor da propriedade input4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput4() {
        return input4;
    }

    /**
     * Define o valor da propriedade input4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput4(JAXBElement<Boolean> value) {
        this.input4 = value;
    }

    /**
     * Obtém o valor da propriedade input5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput5() {
        return input5;
    }

    /**
     * Define o valor da propriedade input5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput5(JAXBElement<Boolean> value) {
        this.input5 = value;
    }

    /**
     * Obtém o valor da propriedade input6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput6() {
        return input6;
    }

    /**
     * Define o valor da propriedade input6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput6(JAXBElement<Boolean> value) {
        this.input6 = value;
    }

    /**
     * Obtém o valor da propriedade input7.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInput7() {
        return input7;
    }

    /**
     * Define o valor da propriedade input7.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInput7(JAXBElement<Boolean> value) {
        this.input7 = value;
    }

    /**
     * Obtém o valor da propriedade inputOutputConfigurationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInputOutputConfigurationEntityKey() {
        return inputOutputConfigurationEntityKey;
    }

    /**
     * Define o valor da propriedade inputOutputConfigurationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInputOutputConfigurationEntityKey(JAXBElement<Long> value) {
        this.inputOutputConfigurationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade installedHardware.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceTelematicsDeviceHardware }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceTelematicsDeviceHardware> getInstalledHardware() {
        return installedHardware;
    }

    /**
     * Define o valor da propriedade installedHardware.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceTelematicsDeviceHardware }{@code >}
     *     
     */
    public void setInstalledHardware(JAXBElement<TelematicsDeviceTelematicsDeviceHardware> value) {
        this.installedHardware = value;
    }

    /**
     * Obtém o valor da propriedade model.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModel() {
        return model;
    }

    /**
     * Define o valor da propriedade model.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModel(JAXBElement<String> value) {
        this.model = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigationActivationCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOmnitracsNavigationActivationCode() {
        return omnitracsNavigationActivationCode;
    }

    /**
     * Define o valor da propriedade omnitracsNavigationActivationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOmnitracsNavigationActivationCode(JAXBElement<String> value) {
        this.omnitracsNavigationActivationCode = value;
    }

    /**
     * Obtém o valor da propriedade pendingFirmwareVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPendingFirmwareVersion() {
        return pendingFirmwareVersion;
    }

    /**
     * Define o valor da propriedade pendingFirmwareVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPendingFirmwareVersion(JAXBElement<String> value) {
        this.pendingFirmwareVersion = value;
    }

    /**
     * Obtém o valor da propriedade pendingScriptVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPendingScriptVersion() {
        return pendingScriptVersion;
    }

    /**
     * Define o valor da propriedade pendingScriptVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPendingScriptVersion(JAXBElement<String> value) {
        this.pendingScriptVersion = value;
    }

    /**
     * Obtém o valor da propriedade pendingVehicleDatabaseVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPendingVehicleDatabaseVersion() {
        return pendingVehicleDatabaseVersion;
    }

    /**
     * Define o valor da propriedade pendingVehicleDatabaseVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPendingVehicleDatabaseVersion(JAXBElement<String> value) {
        this.pendingVehicleDatabaseVersion = value;
    }

    /**
     * Obtém o valor da propriedade pendingVehicleInterfaceFirmwareVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPendingVehicleInterfaceFirmwareVersion() {
        return pendingVehicleInterfaceFirmwareVersion;
    }

    /**
     * Define o valor da propriedade pendingVehicleInterfaceFirmwareVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPendingVehicleInterfaceFirmwareVersion(JAXBElement<String> value) {
        this.pendingVehicleInterfaceFirmwareVersion = value;
    }

    /**
     * Obtém o valor da propriedade powerSourceCurrentPowerSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPowerSourceCurrentPowerSource() {
        return powerSourceCurrentPowerSource;
    }

    /**
     * Define o valor da propriedade powerSourceCurrentPowerSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPowerSourceCurrentPowerSource(JAXBElement<String> value) {
        this.powerSourceCurrentPowerSource = value;
    }

    /**
     * Obtém o valor da propriedade satelliteModemIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSatelliteModemIdentifier() {
        return satelliteModemIdentifier;
    }

    /**
     * Define o valor da propriedade satelliteModemIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSatelliteModemIdentifier(JAXBElement<String> value) {
        this.satelliteModemIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade scriptVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScriptVersion() {
        return scriptVersion;
    }

    /**
     * Define o valor da propriedade scriptVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScriptVersion(JAXBElement<String> value) {
        this.scriptVersion = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceHardwarePlatformHardwarePlatform.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelematicsDeviceHardwarePlatformHardwarePlatform() {
        return telematicsDeviceHardwarePlatformHardwarePlatform;
    }

    /**
     * Define o valor da propriedade telematicsDeviceHardwarePlatformHardwarePlatform.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelematicsDeviceHardwarePlatformHardwarePlatform(JAXBElement<String> value) {
        this.telematicsDeviceHardwarePlatformHardwarePlatform = value;
    }

    /**
     * Obtém o valor da propriedade telematicsProviderTypeProviderType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelematicsProviderTypeProviderType() {
        return telematicsProviderTypeProviderType;
    }

    /**
     * Define o valor da propriedade telematicsProviderTypeProviderType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelematicsProviderTypeProviderType(JAXBElement<String> value) {
        this.telematicsProviderTypeProviderType = value;
    }

    /**
     * Obtém o valor da propriedade vehicleBusStatusVehicleBusStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleBusStatusVehicleBusStatus() {
        return vehicleBusStatusVehicleBusStatus;
    }

    /**
     * Define o valor da propriedade vehicleBusStatusVehicleBusStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleBusStatusVehicleBusStatus(JAXBElement<String> value) {
        this.vehicleBusStatusVehicleBusStatus = value;
    }

    /**
     * Obtém o valor da propriedade vehicleDatabaseVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleDatabaseVersion() {
        return vehicleDatabaseVersion;
    }

    /**
     * Define o valor da propriedade vehicleDatabaseVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleDatabaseVersion(JAXBElement<String> value) {
        this.vehicleDatabaseVersion = value;
    }

    /**
     * Obtém o valor da propriedade vehicleInterfaceFirmwareVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleInterfaceFirmwareVersion() {
        return vehicleInterfaceFirmwareVersion;
    }

    /**
     * Define o valor da propriedade vehicleInterfaceFirmwareVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleInterfaceFirmwareVersion(JAXBElement<String> value) {
        this.vehicleInterfaceFirmwareVersion = value;
    }

    /**
     * Obtém o valor da propriedade vehicleInterfaceRoadnetTelematicsVehicleInterface.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleInterfaceRoadnetTelematicsVehicleInterface() {
        return vehicleInterfaceRoadnetTelematicsVehicleInterface;
    }

    /**
     * Define o valor da propriedade vehicleInterfaceRoadnetTelematicsVehicleInterface.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleInterfaceRoadnetTelematicsVehicleInterface(JAXBElement<String> value) {
        this.vehicleInterfaceRoadnetTelematicsVehicleInterface = value;
    }

}
