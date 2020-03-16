
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EquipmentPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceleratorState_AcceleratorState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AuxPowerUnitType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BuddyEquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedOdometer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CameraEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceCountryISO3Abbr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EldVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentManufacturerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentProfileEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FuelDrawCapacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingBuzzerState_HarshDrivingBuzzerOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingThresholdOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasBerth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasElectronicEngine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HighwayUseTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Horsepower" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IFTAQualified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionKillSwitchState_IgnitionKillSwitchState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionState_IgnitionState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTopLevelComplianceEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVinFromEcm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KeyFobAuthenticationBuzzerState_KeyFobAuthenticationBuzzerOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPosition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LicensePlateNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturedDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MotionState_LastKnownMotionState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfPowerAxles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Odometer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OdometerOffset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OdometerSourceIsUserLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OdometerSource_OdometerSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneGuid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneSystem_OmnitracsOneSystemOfOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OwnerOperated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PanicButtonState_PanicButtonState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredWorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RemoteConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RemoteShutdownState_RemoteShutdownState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetainManualVin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpeedBuzzerThresholdOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceInstallDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceReportedOdometer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceReportedOdometerOffset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceReportedTotalEngineRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TemperatureSensorValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRuntimeSourceIsUserLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRuntimeSource_TotalEngineRuntimeSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransmissionManufacturer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransmissionType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusReportedOdometer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusReportedOdometerOffset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsSid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentPropertyOptions", propOrder = {
    "acceleratorStateAcceleratorState",
    "auxPowerUnitType",
    "buddyEquipmentEntityKey",
    "calculatedOdometer",
    "cameraEntityKeys",
    "complianceCountryISO3Abbr",
    "complianceState",
    "currentRegionDescription",
    "currentRegionEntityKey",
    "currentRegionIdentifier",
    "depotEntityKey",
    "description",
    "eldVehicle",
    "equipmentManufacturerEntityKey",
    "equipmentProfileEntityKey",
    "equipmentTypeEntityKey",
    "fuelDrawCapacity",
    "harshDrivingBuzzerStateHarshDrivingBuzzerOverride",
    "harshDrivingThresholdOverrides",
    "hasBerth",
    "hasElectronicEngine",
    "highwayUseTax",
    "horsepower",
    "hosExempt",
    "iftaQualified",
    "identifier",
    "ignitionKillSwitchStateIgnitionKillSwitchState",
    "ignitionStateIgnitionState",
    "isActive",
    "isDeleted",
    "isTopLevelComplianceEntity",
    "isVinFromEcm",
    "keyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride",
    "lastKnownPosition",
    "licensePlateNumber",
    "manufacturedDate",
    "manufacturer",
    "model",
    "modelYear",
    "motionStateLastKnownMotionState",
    "numberOfPowerAxles",
    "odometer",
    "odometerOffset",
    "odometerSourceIsUserLocked",
    "odometerSourceOdometerSource",
    "omnitracsOneGuid",
    "omnitracsOneSystemOmnitracsOneSystemOfOrigin",
    "ownerOperated",
    "panicButtonStatePanicButtonState",
    "preferredWorkerEntityKey",
    "remoteConfig",
    "remoteShutdownStateRemoteShutdownState",
    "retainManualVin",
    "speedBuzzerThresholdOverride",
    "telematicsDeviceDescription",
    "telematicsDeviceEntityKey",
    "telematicsDeviceIdentifier",
    "telematicsDeviceInstallDate",
    "telematicsDeviceReportedOdometer",
    "telematicsDeviceReportedOdometerOffset",
    "telematicsDeviceReportedTotalEngineRunTime",
    "temperatureSensorValue",
    "totalEngineRunTime",
    "totalEngineRuntimeSourceIsUserLocked",
    "totalEngineRuntimeSourceTotalEngineRuntimeSource",
    "transmissionManufacturer",
    "transmissionType",
    "vehicleBusReportedOdometer",
    "vehicleBusReportedOdometerOffset",
    "vehicleIdentificationNumber",
    "xrsSid"
})
public class EquipmentPropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "AcceleratorState_AcceleratorState")
    protected Boolean acceleratorStateAcceleratorState;
    @XmlElement(name = "AuxPowerUnitType")
    protected Boolean auxPowerUnitType;
    @XmlElement(name = "BuddyEquipmentEntityKey")
    protected Boolean buddyEquipmentEntityKey;
    @XmlElement(name = "CalculatedOdometer")
    protected Boolean calculatedOdometer;
    @XmlElement(name = "CameraEntityKeys")
    protected Boolean cameraEntityKeys;
    @XmlElement(name = "ComplianceCountryISO3Abbr")
    protected Boolean complianceCountryISO3Abbr;
    @XmlElement(name = "ComplianceState")
    protected Boolean complianceState;
    @XmlElement(name = "CurrentRegionDescription")
    protected Boolean currentRegionDescription;
    @XmlElement(name = "CurrentRegionEntityKey")
    protected Boolean currentRegionEntityKey;
    @XmlElement(name = "CurrentRegionIdentifier")
    protected Boolean currentRegionIdentifier;
    @XmlElement(name = "DepotEntityKey")
    protected Boolean depotEntityKey;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EldVehicle")
    protected Boolean eldVehicle;
    @XmlElement(name = "EquipmentManufacturerEntityKey")
    protected Boolean equipmentManufacturerEntityKey;
    @XmlElement(name = "EquipmentProfileEntityKey")
    protected Boolean equipmentProfileEntityKey;
    @XmlElement(name = "EquipmentTypeEntityKey")
    protected Boolean equipmentTypeEntityKey;
    @XmlElement(name = "FuelDrawCapacity")
    protected Boolean fuelDrawCapacity;
    @XmlElement(name = "HarshDrivingBuzzerState_HarshDrivingBuzzerOverride")
    protected Boolean harshDrivingBuzzerStateHarshDrivingBuzzerOverride;
    @XmlElement(name = "HarshDrivingThresholdOverrides")
    protected Boolean harshDrivingThresholdOverrides;
    @XmlElement(name = "HasBerth")
    protected Boolean hasBerth;
    @XmlElement(name = "HasElectronicEngine")
    protected Boolean hasElectronicEngine;
    @XmlElement(name = "HighwayUseTax")
    protected Boolean highwayUseTax;
    @XmlElement(name = "Horsepower")
    protected Boolean horsepower;
    @XmlElement(name = "HosExempt")
    protected Boolean hosExempt;
    @XmlElement(name = "IFTAQualified")
    protected Boolean iftaQualified;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IgnitionKillSwitchState_IgnitionKillSwitchState")
    protected Boolean ignitionKillSwitchStateIgnitionKillSwitchState;
    @XmlElement(name = "IgnitionState_IgnitionState")
    protected Boolean ignitionStateIgnitionState;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "IsTopLevelComplianceEntity")
    protected Boolean isTopLevelComplianceEntity;
    @XmlElement(name = "IsVinFromEcm")
    protected Boolean isVinFromEcm;
    @XmlElement(name = "KeyFobAuthenticationBuzzerState_KeyFobAuthenticationBuzzerOverride")
    protected Boolean keyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride;
    @XmlElement(name = "LastKnownPosition")
    protected Boolean lastKnownPosition;
    @XmlElement(name = "LicensePlateNumber")
    protected Boolean licensePlateNumber;
    @XmlElement(name = "ManufacturedDate")
    protected Boolean manufacturedDate;
    @XmlElement(name = "Manufacturer")
    protected Boolean manufacturer;
    @XmlElement(name = "Model")
    protected Boolean model;
    @XmlElement(name = "ModelYear")
    protected Boolean modelYear;
    @XmlElement(name = "MotionState_LastKnownMotionState")
    protected Boolean motionStateLastKnownMotionState;
    @XmlElement(name = "NumberOfPowerAxles")
    protected Boolean numberOfPowerAxles;
    @XmlElement(name = "Odometer")
    protected Boolean odometer;
    @XmlElement(name = "OdometerOffset")
    protected Boolean odometerOffset;
    @XmlElement(name = "OdometerSourceIsUserLocked")
    protected Boolean odometerSourceIsUserLocked;
    @XmlElement(name = "OdometerSource_OdometerSource")
    protected Boolean odometerSourceOdometerSource;
    @XmlElement(name = "OmnitracsOneGuid")
    protected Boolean omnitracsOneGuid;
    @XmlElement(name = "OmnitracsOneSystem_OmnitracsOneSystemOfOrigin")
    protected Boolean omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    @XmlElement(name = "OwnerOperated")
    protected Boolean ownerOperated;
    @XmlElement(name = "PanicButtonState_PanicButtonState")
    protected Boolean panicButtonStatePanicButtonState;
    @XmlElement(name = "PreferredWorkerEntityKey")
    protected Boolean preferredWorkerEntityKey;
    @XmlElement(name = "RemoteConfig")
    protected Boolean remoteConfig;
    @XmlElement(name = "RemoteShutdownState_RemoteShutdownState")
    protected Boolean remoteShutdownStateRemoteShutdownState;
    @XmlElement(name = "RetainManualVin")
    protected Boolean retainManualVin;
    @XmlElement(name = "SpeedBuzzerThresholdOverride")
    protected Boolean speedBuzzerThresholdOverride;
    @XmlElement(name = "TelematicsDeviceDescription")
    protected Boolean telematicsDeviceDescription;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Boolean telematicsDeviceEntityKey;
    @XmlElement(name = "TelematicsDeviceIdentifier")
    protected Boolean telematicsDeviceIdentifier;
    @XmlElement(name = "TelematicsDeviceInstallDate")
    protected Boolean telematicsDeviceInstallDate;
    @XmlElement(name = "TelematicsDeviceReportedOdometer")
    protected Boolean telematicsDeviceReportedOdometer;
    @XmlElement(name = "TelematicsDeviceReportedOdometerOffset")
    protected Boolean telematicsDeviceReportedOdometerOffset;
    @XmlElement(name = "TelematicsDeviceReportedTotalEngineRunTime")
    protected Boolean telematicsDeviceReportedTotalEngineRunTime;
    @XmlElement(name = "TemperatureSensorValue")
    protected Boolean temperatureSensorValue;
    @XmlElement(name = "TotalEngineRunTime")
    protected Boolean totalEngineRunTime;
    @XmlElement(name = "TotalEngineRuntimeSourceIsUserLocked")
    protected Boolean totalEngineRuntimeSourceIsUserLocked;
    @XmlElement(name = "TotalEngineRuntimeSource_TotalEngineRuntimeSource")
    protected Boolean totalEngineRuntimeSourceTotalEngineRuntimeSource;
    @XmlElement(name = "TransmissionManufacturer")
    protected Boolean transmissionManufacturer;
    @XmlElement(name = "TransmissionType")
    protected Boolean transmissionType;
    @XmlElement(name = "VehicleBusReportedOdometer")
    protected Boolean vehicleBusReportedOdometer;
    @XmlElement(name = "VehicleBusReportedOdometerOffset")
    protected Boolean vehicleBusReportedOdometerOffset;
    @XmlElement(name = "VehicleIdentificationNumber")
    protected Boolean vehicleIdentificationNumber;
    @XmlElement(name = "XrsSid")
    protected Boolean xrsSid;

    /**
     * Obtém o valor da propriedade acceleratorStateAcceleratorState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceleratorStateAcceleratorState() {
        return acceleratorStateAcceleratorState;
    }

    /**
     * Define o valor da propriedade acceleratorStateAcceleratorState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceleratorStateAcceleratorState(Boolean value) {
        this.acceleratorStateAcceleratorState = value;
    }

    /**
     * Obtém o valor da propriedade auxPowerUnitType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuxPowerUnitType() {
        return auxPowerUnitType;
    }

    /**
     * Define o valor da propriedade auxPowerUnitType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuxPowerUnitType(Boolean value) {
        this.auxPowerUnitType = value;
    }

    /**
     * Obtém o valor da propriedade buddyEquipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuddyEquipmentEntityKey() {
        return buddyEquipmentEntityKey;
    }

    /**
     * Define o valor da propriedade buddyEquipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuddyEquipmentEntityKey(Boolean value) {
        this.buddyEquipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade calculatedOdometer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculatedOdometer() {
        return calculatedOdometer;
    }

    /**
     * Define o valor da propriedade calculatedOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculatedOdometer(Boolean value) {
        this.calculatedOdometer = value;
    }

    /**
     * Obtém o valor da propriedade cameraEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCameraEntityKeys() {
        return cameraEntityKeys;
    }

    /**
     * Define o valor da propriedade cameraEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCameraEntityKeys(Boolean value) {
        this.cameraEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade complianceCountryISO3Abbr.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplianceCountryISO3Abbr() {
        return complianceCountryISO3Abbr;
    }

    /**
     * Define o valor da propriedade complianceCountryISO3Abbr.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplianceCountryISO3Abbr(Boolean value) {
        this.complianceCountryISO3Abbr = value;
    }

    /**
     * Obtém o valor da propriedade complianceState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplianceState() {
        return complianceState;
    }

    /**
     * Define o valor da propriedade complianceState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplianceState(Boolean value) {
        this.complianceState = value;
    }

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
     * Obtém o valor da propriedade currentRegionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentRegionEntityKey() {
        return currentRegionEntityKey;
    }

    /**
     * Define o valor da propriedade currentRegionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentRegionEntityKey(Boolean value) {
        this.currentRegionEntityKey = value;
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
     * Obtém o valor da propriedade depotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotEntityKey() {
        return depotEntityKey;
    }

    /**
     * Define o valor da propriedade depotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotEntityKey(Boolean value) {
        this.depotEntityKey = value;
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
     * Obtém o valor da propriedade eldVehicle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEldVehicle() {
        return eldVehicle;
    }

    /**
     * Define o valor da propriedade eldVehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEldVehicle(Boolean value) {
        this.eldVehicle = value;
    }

    /**
     * Obtém o valor da propriedade equipmentManufacturerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentManufacturerEntityKey() {
        return equipmentManufacturerEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentManufacturerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentManufacturerEntityKey(Boolean value) {
        this.equipmentManufacturerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentProfileEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentProfileEntityKey() {
        return equipmentProfileEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentProfileEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentProfileEntityKey(Boolean value) {
        this.equipmentProfileEntityKey = value;
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
     * Obtém o valor da propriedade fuelDrawCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuelDrawCapacity() {
        return fuelDrawCapacity;
    }

    /**
     * Define o valor da propriedade fuelDrawCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuelDrawCapacity(Boolean value) {
        this.fuelDrawCapacity = value;
    }

    /**
     * Obtém o valor da propriedade harshDrivingBuzzerStateHarshDrivingBuzzerOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHarshDrivingBuzzerStateHarshDrivingBuzzerOverride() {
        return harshDrivingBuzzerStateHarshDrivingBuzzerOverride;
    }

    /**
     * Define o valor da propriedade harshDrivingBuzzerStateHarshDrivingBuzzerOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHarshDrivingBuzzerStateHarshDrivingBuzzerOverride(Boolean value) {
        this.harshDrivingBuzzerStateHarshDrivingBuzzerOverride = value;
    }

    /**
     * Obtém o valor da propriedade harshDrivingThresholdOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHarshDrivingThresholdOverrides() {
        return harshDrivingThresholdOverrides;
    }

    /**
     * Define o valor da propriedade harshDrivingThresholdOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHarshDrivingThresholdOverrides(Boolean value) {
        this.harshDrivingThresholdOverrides = value;
    }

    /**
     * Obtém o valor da propriedade hasBerth.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBerth() {
        return hasBerth;
    }

    /**
     * Define o valor da propriedade hasBerth.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBerth(Boolean value) {
        this.hasBerth = value;
    }

    /**
     * Obtém o valor da propriedade hasElectronicEngine.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasElectronicEngine() {
        return hasElectronicEngine;
    }

    /**
     * Define o valor da propriedade hasElectronicEngine.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasElectronicEngine(Boolean value) {
        this.hasElectronicEngine = value;
    }

    /**
     * Obtém o valor da propriedade highwayUseTax.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighwayUseTax() {
        return highwayUseTax;
    }

    /**
     * Define o valor da propriedade highwayUseTax.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighwayUseTax(Boolean value) {
        this.highwayUseTax = value;
    }

    /**
     * Obtém o valor da propriedade horsepower.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHorsepower() {
        return horsepower;
    }

    /**
     * Define o valor da propriedade horsepower.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHorsepower(Boolean value) {
        this.horsepower = value;
    }

    /**
     * Obtém o valor da propriedade hosExempt.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosExempt() {
        return hosExempt;
    }

    /**
     * Define o valor da propriedade hosExempt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosExempt(Boolean value) {
        this.hosExempt = value;
    }

    /**
     * Obtém o valor da propriedade iftaQualified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIFTAQualified() {
        return iftaQualified;
    }

    /**
     * Define o valor da propriedade iftaQualified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIFTAQualified(Boolean value) {
        this.iftaQualified = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade ignitionKillSwitchStateIgnitionKillSwitchState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnitionKillSwitchStateIgnitionKillSwitchState() {
        return ignitionKillSwitchStateIgnitionKillSwitchState;
    }

    /**
     * Define o valor da propriedade ignitionKillSwitchStateIgnitionKillSwitchState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnitionKillSwitchStateIgnitionKillSwitchState(Boolean value) {
        this.ignitionKillSwitchStateIgnitionKillSwitchState = value;
    }

    /**
     * Obtém o valor da propriedade ignitionStateIgnitionState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnitionStateIgnitionState() {
        return ignitionStateIgnitionState;
    }

    /**
     * Define o valor da propriedade ignitionStateIgnitionState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnitionStateIgnitionState(Boolean value) {
        this.ignitionStateIgnitionState = value;
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
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade isTopLevelComplianceEntity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTopLevelComplianceEntity() {
        return isTopLevelComplianceEntity;
    }

    /**
     * Define o valor da propriedade isTopLevelComplianceEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTopLevelComplianceEntity(Boolean value) {
        this.isTopLevelComplianceEntity = value;
    }

    /**
     * Obtém o valor da propriedade isVinFromEcm.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVinFromEcm() {
        return isVinFromEcm;
    }

    /**
     * Define o valor da propriedade isVinFromEcm.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVinFromEcm(Boolean value) {
        this.isVinFromEcm = value;
    }

    /**
     * Obtém o valor da propriedade keyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride() {
        return keyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride;
    }

    /**
     * Define o valor da propriedade keyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride(Boolean value) {
        this.keyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPosition.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastKnownPosition() {
        return lastKnownPosition;
    }

    /**
     * Define o valor da propriedade lastKnownPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastKnownPosition(Boolean value) {
        this.lastKnownPosition = value;
    }

    /**
     * Obtém o valor da propriedade licensePlateNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
     * Define o valor da propriedade licensePlateNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLicensePlateNumber(Boolean value) {
        this.licensePlateNumber = value;
    }

    /**
     * Obtém o valor da propriedade manufacturedDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManufacturedDate() {
        return manufacturedDate;
    }

    /**
     * Define o valor da propriedade manufacturedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManufacturedDate(Boolean value) {
        this.manufacturedDate = value;
    }

    /**
     * Obtém o valor da propriedade manufacturer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManufacturer() {
        return manufacturer;
    }

    /**
     * Define o valor da propriedade manufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManufacturer(Boolean value) {
        this.manufacturer = value;
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
     * Obtém o valor da propriedade modelYear.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModelYear() {
        return modelYear;
    }

    /**
     * Define o valor da propriedade modelYear.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModelYear(Boolean value) {
        this.modelYear = value;
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
     * Obtém o valor da propriedade numberOfPowerAxles.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfPowerAxles() {
        return numberOfPowerAxles;
    }

    /**
     * Define o valor da propriedade numberOfPowerAxles.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfPowerAxles(Boolean value) {
        this.numberOfPowerAxles = value;
    }

    /**
     * Obtém o valor da propriedade odometer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOdometer() {
        return odometer;
    }

    /**
     * Define o valor da propriedade odometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOdometer(Boolean value) {
        this.odometer = value;
    }

    /**
     * Obtém o valor da propriedade odometerOffset.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOdometerOffset() {
        return odometerOffset;
    }

    /**
     * Define o valor da propriedade odometerOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOdometerOffset(Boolean value) {
        this.odometerOffset = value;
    }

    /**
     * Obtém o valor da propriedade odometerSourceIsUserLocked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOdometerSourceIsUserLocked() {
        return odometerSourceIsUserLocked;
    }

    /**
     * Define o valor da propriedade odometerSourceIsUserLocked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOdometerSourceIsUserLocked(Boolean value) {
        this.odometerSourceIsUserLocked = value;
    }

    /**
     * Obtém o valor da propriedade odometerSourceOdometerSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOdometerSourceOdometerSource() {
        return odometerSourceOdometerSource;
    }

    /**
     * Define o valor da propriedade odometerSourceOdometerSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOdometerSourceOdometerSource(Boolean value) {
        this.odometerSourceOdometerSource = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneGuid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsOneGuid() {
        return omnitracsOneGuid;
    }

    /**
     * Define o valor da propriedade omnitracsOneGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsOneGuid(Boolean value) {
        this.omnitracsOneGuid = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneSystemOmnitracsOneSystemOfOrigin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsOneSystemOmnitracsOneSystemOfOrigin() {
        return omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    }

    /**
     * Define o valor da propriedade omnitracsOneSystemOmnitracsOneSystemOfOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsOneSystemOmnitracsOneSystemOfOrigin(Boolean value) {
        this.omnitracsOneSystemOmnitracsOneSystemOfOrigin = value;
    }

    /**
     * Obtém o valor da propriedade ownerOperated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerOperated() {
        return ownerOperated;
    }

    /**
     * Define o valor da propriedade ownerOperated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnerOperated(Boolean value) {
        this.ownerOperated = value;
    }

    /**
     * Obtém o valor da propriedade panicButtonStatePanicButtonState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPanicButtonStatePanicButtonState() {
        return panicButtonStatePanicButtonState;
    }

    /**
     * Define o valor da propriedade panicButtonStatePanicButtonState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPanicButtonStatePanicButtonState(Boolean value) {
        this.panicButtonStatePanicButtonState = value;
    }

    /**
     * Obtém o valor da propriedade preferredWorkerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredWorkerEntityKey() {
        return preferredWorkerEntityKey;
    }

    /**
     * Define o valor da propriedade preferredWorkerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredWorkerEntityKey(Boolean value) {
        this.preferredWorkerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade remoteConfig.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteConfig() {
        return remoteConfig;
    }

    /**
     * Define o valor da propriedade remoteConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteConfig(Boolean value) {
        this.remoteConfig = value;
    }

    /**
     * Obtém o valor da propriedade remoteShutdownStateRemoteShutdownState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteShutdownStateRemoteShutdownState() {
        return remoteShutdownStateRemoteShutdownState;
    }

    /**
     * Define o valor da propriedade remoteShutdownStateRemoteShutdownState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteShutdownStateRemoteShutdownState(Boolean value) {
        this.remoteShutdownStateRemoteShutdownState = value;
    }

    /**
     * Obtém o valor da propriedade retainManualVin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetainManualVin() {
        return retainManualVin;
    }

    /**
     * Define o valor da propriedade retainManualVin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetainManualVin(Boolean value) {
        this.retainManualVin = value;
    }

    /**
     * Obtém o valor da propriedade speedBuzzerThresholdOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpeedBuzzerThresholdOverride() {
        return speedBuzzerThresholdOverride;
    }

    /**
     * Define o valor da propriedade speedBuzzerThresholdOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpeedBuzzerThresholdOverride(Boolean value) {
        this.speedBuzzerThresholdOverride = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceDescription() {
        return telematicsDeviceDescription;
    }

    /**
     * Define o valor da propriedade telematicsDeviceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceDescription(Boolean value) {
        this.telematicsDeviceDescription = value;
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
     * Obtém o valor da propriedade telematicsDeviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceIdentifier() {
        return telematicsDeviceIdentifier;
    }

    /**
     * Define o valor da propriedade telematicsDeviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceIdentifier(Boolean value) {
        this.telematicsDeviceIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceInstallDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceInstallDate() {
        return telematicsDeviceInstallDate;
    }

    /**
     * Define o valor da propriedade telematicsDeviceInstallDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceInstallDate(Boolean value) {
        this.telematicsDeviceInstallDate = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceReportedOdometer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceReportedOdometer() {
        return telematicsDeviceReportedOdometer;
    }

    /**
     * Define o valor da propriedade telematicsDeviceReportedOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceReportedOdometer(Boolean value) {
        this.telematicsDeviceReportedOdometer = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceReportedOdometerOffset.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceReportedOdometerOffset() {
        return telematicsDeviceReportedOdometerOffset;
    }

    /**
     * Define o valor da propriedade telematicsDeviceReportedOdometerOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceReportedOdometerOffset(Boolean value) {
        this.telematicsDeviceReportedOdometerOffset = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceReportedTotalEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceReportedTotalEngineRunTime() {
        return telematicsDeviceReportedTotalEngineRunTime;
    }

    /**
     * Define o valor da propriedade telematicsDeviceReportedTotalEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceReportedTotalEngineRunTime(Boolean value) {
        this.telematicsDeviceReportedTotalEngineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade temperatureSensorValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemperatureSensorValue() {
        return temperatureSensorValue;
    }

    /**
     * Define o valor da propriedade temperatureSensorValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemperatureSensorValue(Boolean value) {
        this.temperatureSensorValue = value;
    }

    /**
     * Obtém o valor da propriedade totalEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalEngineRunTime() {
        return totalEngineRunTime;
    }

    /**
     * Define o valor da propriedade totalEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalEngineRunTime(Boolean value) {
        this.totalEngineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade totalEngineRuntimeSourceIsUserLocked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalEngineRuntimeSourceIsUserLocked() {
        return totalEngineRuntimeSourceIsUserLocked;
    }

    /**
     * Define o valor da propriedade totalEngineRuntimeSourceIsUserLocked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalEngineRuntimeSourceIsUserLocked(Boolean value) {
        this.totalEngineRuntimeSourceIsUserLocked = value;
    }

    /**
     * Obtém o valor da propriedade totalEngineRuntimeSourceTotalEngineRuntimeSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalEngineRuntimeSourceTotalEngineRuntimeSource() {
        return totalEngineRuntimeSourceTotalEngineRuntimeSource;
    }

    /**
     * Define o valor da propriedade totalEngineRuntimeSourceTotalEngineRuntimeSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalEngineRuntimeSourceTotalEngineRuntimeSource(Boolean value) {
        this.totalEngineRuntimeSourceTotalEngineRuntimeSource = value;
    }

    /**
     * Obtém o valor da propriedade transmissionManufacturer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransmissionManufacturer() {
        return transmissionManufacturer;
    }

    /**
     * Define o valor da propriedade transmissionManufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransmissionManufacturer(Boolean value) {
        this.transmissionManufacturer = value;
    }

    /**
     * Obtém o valor da propriedade transmissionType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransmissionType() {
        return transmissionType;
    }

    /**
     * Define o valor da propriedade transmissionType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransmissionType(Boolean value) {
        this.transmissionType = value;
    }

    /**
     * Obtém o valor da propriedade vehicleBusReportedOdometer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleBusReportedOdometer() {
        return vehicleBusReportedOdometer;
    }

    /**
     * Define o valor da propriedade vehicleBusReportedOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleBusReportedOdometer(Boolean value) {
        this.vehicleBusReportedOdometer = value;
    }

    /**
     * Obtém o valor da propriedade vehicleBusReportedOdometerOffset.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleBusReportedOdometerOffset() {
        return vehicleBusReportedOdometerOffset;
    }

    /**
     * Define o valor da propriedade vehicleBusReportedOdometerOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleBusReportedOdometerOffset(Boolean value) {
        this.vehicleBusReportedOdometerOffset = value;
    }

    /**
     * Obtém o valor da propriedade vehicleIdentificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    /**
     * Define o valor da propriedade vehicleIdentificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleIdentificationNumber(Boolean value) {
        this.vehicleIdentificationNumber = value;
    }

    /**
     * Obtém o valor da propriedade xrsSid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsSid() {
        return xrsSid;
    }

    /**
     * Define o valor da propriedade xrsSid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsSid(Boolean value) {
        this.xrsSid = value;
    }

}
