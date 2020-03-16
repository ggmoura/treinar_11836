
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de Equipment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Equipment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceleratorState_AcceleratorState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuxPowerUnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuddyEquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="CameraEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceCountryISO3Abbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EldVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentManufacturerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentProfileEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FuelDrawCapacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingBuzzerState_HarshDrivingBuzzerOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingThresholdOverrides" type="{http://roadnet.com/apex/DataContracts/}HarshDrivingThreshold" minOccurs="0"/&gt;
 *         &lt;element name="HasBerth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasElectronicEngine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HighwayUseTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Horsepower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HosExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IFTAQualified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionKillSwitchState_IgnitionKillSwitchState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionState_IgnitionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTopLevelComplianceEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVinFromEcm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KeyFobAuthenticationBuzzerState_KeyFobAuthenticationBuzzerOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPosition" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="LicensePlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MotionState_LastKnownMotionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfPowerAxles" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Odometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="OdometerOffset" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="OdometerSourceIsUserLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OdometerSource_OdometerSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneSystem_OmnitracsOneSystemOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OwnerOperated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PanicButtonState_PanicButtonState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreferredWorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RemoteConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RemoteShutdownState_RemoteShutdownState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetainManualVin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpeedBuzzerThresholdOverride" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceInstallDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceReportedOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceReportedOdometerOffset" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceReportedTotalEngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TemperatureSensorValue" type="{http://roadnet.com/apex/DataContracts/}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRuntimeSourceIsUserLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRuntimeSource_TotalEngineRuntimeSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransmissionManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransmissionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusReportedOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusReportedOdometerOffset" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="VehicleIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsSid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equipment", propOrder = {
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
public class Equipment
    extends VisibleInMultipleRegionsAggregateRootEntity
{

    @XmlElementRef(name = "AcceleratorState_AcceleratorState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acceleratorStateAcceleratorState;
    @XmlElementRef(name = "AuxPowerUnitType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auxPowerUnitType;
    @XmlElementRef(name = "BuddyEquipmentEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> buddyEquipmentEntityKey;
    @XmlElementRef(name = "CalculatedOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> calculatedOdometer;
    @XmlElementRef(name = "CameraEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> cameraEntityKeys;
    @XmlElementRef(name = "ComplianceCountryISO3Abbr", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceCountryISO3Abbr;
    @XmlElementRef(name = "ComplianceState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceState;
    @XmlElementRef(name = "CurrentRegionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRegionDescription;
    @XmlElement(name = "CurrentRegionEntityKey")
    protected Long currentRegionEntityKey;
    @XmlElementRef(name = "CurrentRegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRegionIdentifier;
    @XmlElementRef(name = "DepotEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> depotEntityKey;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "EldVehicle")
    protected Boolean eldVehicle;
    @XmlElementRef(name = "EquipmentManufacturerEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentManufacturerEntityKey;
    @XmlElementRef(name = "EquipmentProfileEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentProfileEntityKey;
    @XmlElement(name = "EquipmentTypeEntityKey")
    protected Long equipmentTypeEntityKey;
    @XmlElementRef(name = "FuelDrawCapacity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fuelDrawCapacity;
    @XmlElementRef(name = "HarshDrivingBuzzerState_HarshDrivingBuzzerOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> harshDrivingBuzzerStateHarshDrivingBuzzerOverride;
    @XmlElementRef(name = "HarshDrivingThresholdOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<HarshDrivingThreshold> harshDrivingThresholdOverrides;
    @XmlElementRef(name = "HasBerth", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hasBerth;
    @XmlElementRef(name = "HasElectronicEngine", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hasElectronicEngine;
    @XmlElementRef(name = "HighwayUseTax", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> highwayUseTax;
    @XmlElementRef(name = "Horsepower", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> horsepower;
    @XmlElement(name = "HosExempt")
    protected Boolean hosExempt;
    @XmlElementRef(name = "IFTAQualified", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> iftaQualified;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "IgnitionKillSwitchState_IgnitionKillSwitchState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ignitionKillSwitchStateIgnitionKillSwitchState;
    @XmlElementRef(name = "IgnitionState_IgnitionState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ignitionStateIgnitionState;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "IsTopLevelComplianceEntity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isTopLevelComplianceEntity;
    @XmlElement(name = "IsVinFromEcm")
    protected Boolean isVinFromEcm;
    @XmlElementRef(name = "KeyFobAuthenticationBuzzerState_KeyFobAuthenticationBuzzerOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride;
    @XmlElementRef(name = "LastKnownPosition", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> lastKnownPosition;
    @XmlElementRef(name = "LicensePlateNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licensePlateNumber;
    @XmlElementRef(name = "ManufacturedDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> manufacturedDate;
    @XmlElementRef(name = "Manufacturer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufacturer;
    @XmlElementRef(name = "Model", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "ModelYear", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modelYear;
    @XmlElementRef(name = "MotionState_LastKnownMotionState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motionStateLastKnownMotionState;
    @XmlElementRef(name = "NumberOfPowerAxles", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfPowerAxles;
    @XmlElementRef(name = "Odometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> odometer;
    @XmlElementRef(name = "OdometerOffset", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> odometerOffset;
    @XmlElement(name = "OdometerSourceIsUserLocked")
    protected Boolean odometerSourceIsUserLocked;
    @XmlElementRef(name = "OdometerSource_OdometerSource", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> odometerSourceOdometerSource;
    @XmlElementRef(name = "OmnitracsOneGuid", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omnitracsOneGuid;
    @XmlElementRef(name = "OmnitracsOneSystem_OmnitracsOneSystemOfOrigin", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    @XmlElementRef(name = "OwnerOperated", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ownerOperated;
    @XmlElementRef(name = "PanicButtonState_PanicButtonState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> panicButtonStatePanicButtonState;
    @XmlElementRef(name = "PreferredWorkerEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> preferredWorkerEntityKey;
    @XmlElement(name = "RemoteConfig")
    protected Boolean remoteConfig;
    @XmlElementRef(name = "RemoteShutdownState_RemoteShutdownState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remoteShutdownStateRemoteShutdownState;
    @XmlElement(name = "RetainManualVin")
    protected Boolean retainManualVin;
    @XmlElementRef(name = "SpeedBuzzerThresholdOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> speedBuzzerThresholdOverride;
    @XmlElementRef(name = "TelematicsDeviceDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telematicsDeviceDescription;
    @XmlElementRef(name = "TelematicsDeviceEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> telematicsDeviceEntityKey;
    @XmlElementRef(name = "TelematicsDeviceIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telematicsDeviceIdentifier;
    @XmlElementRef(name = "TelematicsDeviceInstallDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> telematicsDeviceInstallDate;
    @XmlElementRef(name = "TelematicsDeviceReportedOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> telematicsDeviceReportedOdometer;
    @XmlElementRef(name = "TelematicsDeviceReportedOdometerOffset", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> telematicsDeviceReportedOdometerOffset;
    @XmlElementRef(name = "TelematicsDeviceReportedTotalEngineRunTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> telematicsDeviceReportedTotalEngineRunTime;
    @XmlElementRef(name = "TemperatureSensorValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Temperature> temperatureSensorValue;
    @XmlElementRef(name = "TotalEngineRunTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalEngineRunTime;
    @XmlElement(name = "TotalEngineRuntimeSourceIsUserLocked")
    protected Boolean totalEngineRuntimeSourceIsUserLocked;
    @XmlElementRef(name = "TotalEngineRuntimeSource_TotalEngineRuntimeSource", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEngineRuntimeSourceTotalEngineRuntimeSource;
    @XmlElementRef(name = "TransmissionManufacturer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transmissionManufacturer;
    @XmlElementRef(name = "TransmissionType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transmissionType;
    @XmlElementRef(name = "VehicleBusReportedOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> vehicleBusReportedOdometer;
    @XmlElementRef(name = "VehicleBusReportedOdometerOffset", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> vehicleBusReportedOdometerOffset;
    @XmlElementRef(name = "VehicleIdentificationNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleIdentificationNumber;
    @XmlElementRef(name = "XrsSid", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> xrsSid;

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
     * Obtém o valor da propriedade auxPowerUnitType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuxPowerUnitType() {
        return auxPowerUnitType;
    }

    /**
     * Define o valor da propriedade auxPowerUnitType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuxPowerUnitType(JAXBElement<String> value) {
        this.auxPowerUnitType = value;
    }

    /**
     * Obtém o valor da propriedade buddyEquipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBuddyEquipmentEntityKey() {
        return buddyEquipmentEntityKey;
    }

    /**
     * Define o valor da propriedade buddyEquipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBuddyEquipmentEntityKey(JAXBElement<Long> value) {
        this.buddyEquipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade calculatedOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getCalculatedOdometer() {
        return calculatedOdometer;
    }

    /**
     * Define o valor da propriedade calculatedOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setCalculatedOdometer(JAXBElement<Distance> value) {
        this.calculatedOdometer = value;
    }

    /**
     * Obtém o valor da propriedade cameraEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getCameraEntityKeys() {
        return cameraEntityKeys;
    }

    /**
     * Define o valor da propriedade cameraEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setCameraEntityKeys(JAXBElement<ArrayOflong> value) {
        this.cameraEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade complianceCountryISO3Abbr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceCountryISO3Abbr() {
        return complianceCountryISO3Abbr;
    }

    /**
     * Define o valor da propriedade complianceCountryISO3Abbr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceCountryISO3Abbr(JAXBElement<String> value) {
        this.complianceCountryISO3Abbr = value;
    }

    /**
     * Obtém o valor da propriedade complianceState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceState() {
        return complianceState;
    }

    /**
     * Define o valor da propriedade complianceState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceState(JAXBElement<String> value) {
        this.complianceState = value;
    }

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
     * Obtém o valor da propriedade currentRegionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentRegionEntityKey() {
        return currentRegionEntityKey;
    }

    /**
     * Define o valor da propriedade currentRegionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentRegionEntityKey(Long value) {
        this.currentRegionEntityKey = value;
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
     * Obtém o valor da propriedade depotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDepotEntityKey() {
        return depotEntityKey;
    }

    /**
     * Define o valor da propriedade depotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDepotEntityKey(JAXBElement<Long> value) {
        this.depotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipmentManufacturerEntityKey() {
        return equipmentManufacturerEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentManufacturerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipmentManufacturerEntityKey(JAXBElement<Long> value) {
        this.equipmentManufacturerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentProfileEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipmentProfileEntityKey() {
        return equipmentProfileEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentProfileEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipmentProfileEntityKey(JAXBElement<Long> value) {
        this.equipmentProfileEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquipmentTypeEntityKey() {
        return equipmentTypeEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipmentTypeEntityKey(Long value) {
        this.equipmentTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade fuelDrawCapacity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFuelDrawCapacity() {
        return fuelDrawCapacity;
    }

    /**
     * Define o valor da propriedade fuelDrawCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFuelDrawCapacity(JAXBElement<Integer> value) {
        this.fuelDrawCapacity = value;
    }

    /**
     * Obtém o valor da propriedade harshDrivingBuzzerStateHarshDrivingBuzzerOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHarshDrivingBuzzerStateHarshDrivingBuzzerOverride() {
        return harshDrivingBuzzerStateHarshDrivingBuzzerOverride;
    }

    /**
     * Define o valor da propriedade harshDrivingBuzzerStateHarshDrivingBuzzerOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHarshDrivingBuzzerStateHarshDrivingBuzzerOverride(JAXBElement<String> value) {
        this.harshDrivingBuzzerStateHarshDrivingBuzzerOverride = value;
    }

    /**
     * Obtém o valor da propriedade harshDrivingThresholdOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HarshDrivingThreshold }{@code >}
     *     
     */
    public JAXBElement<HarshDrivingThreshold> getHarshDrivingThresholdOverrides() {
        return harshDrivingThresholdOverrides;
    }

    /**
     * Define o valor da propriedade harshDrivingThresholdOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HarshDrivingThreshold }{@code >}
     *     
     */
    public void setHarshDrivingThresholdOverrides(JAXBElement<HarshDrivingThreshold> value) {
        this.harshDrivingThresholdOverrides = value;
    }

    /**
     * Obtém o valor da propriedade hasBerth.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHasBerth() {
        return hasBerth;
    }

    /**
     * Define o valor da propriedade hasBerth.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHasBerth(JAXBElement<Boolean> value) {
        this.hasBerth = value;
    }

    /**
     * Obtém o valor da propriedade hasElectronicEngine.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHasElectronicEngine() {
        return hasElectronicEngine;
    }

    /**
     * Define o valor da propriedade hasElectronicEngine.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHasElectronicEngine(JAXBElement<Boolean> value) {
        this.hasElectronicEngine = value;
    }

    /**
     * Obtém o valor da propriedade highwayUseTax.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHighwayUseTax() {
        return highwayUseTax;
    }

    /**
     * Define o valor da propriedade highwayUseTax.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHighwayUseTax(JAXBElement<Boolean> value) {
        this.highwayUseTax = value;
    }

    /**
     * Obtém o valor da propriedade horsepower.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHorsepower() {
        return horsepower;
    }

    /**
     * Define o valor da propriedade horsepower.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHorsepower(JAXBElement<Integer> value) {
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
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIFTAQualified() {
        return iftaQualified;
    }

    /**
     * Define o valor da propriedade iftaQualified.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIFTAQualified(JAXBElement<Boolean> value) {
        this.iftaQualified = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
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
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsTopLevelComplianceEntity() {
        return isTopLevelComplianceEntity;
    }

    /**
     * Define o valor da propriedade isTopLevelComplianceEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsTopLevelComplianceEntity(JAXBElement<Boolean> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride() {
        return keyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride;
    }

    /**
     * Define o valor da propriedade keyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride(JAXBElement<String> value) {
        this.keyFobAuthenticationBuzzerStateKeyFobAuthenticationBuzzerOverride = value;
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
     * Obtém o valor da propriedade licensePlateNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
     * Define o valor da propriedade licensePlateNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicensePlateNumber(JAXBElement<String> value) {
        this.licensePlateNumber = value;
    }

    /**
     * Obtém o valor da propriedade manufacturedDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getManufacturedDate() {
        return manufacturedDate;
    }

    /**
     * Define o valor da propriedade manufacturedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setManufacturedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.manufacturedDate = value;
    }

    /**
     * Obtém o valor da propriedade manufacturer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufacturer() {
        return manufacturer;
    }

    /**
     * Define o valor da propriedade manufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufacturer(JAXBElement<String> value) {
        this.manufacturer = value;
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
     * Obtém o valor da propriedade modelYear.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModelYear() {
        return modelYear;
    }

    /**
     * Define o valor da propriedade modelYear.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModelYear(JAXBElement<String> value) {
        this.modelYear = value;
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
     * Obtém o valor da propriedade numberOfPowerAxles.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfPowerAxles() {
        return numberOfPowerAxles;
    }

    /**
     * Define o valor da propriedade numberOfPowerAxles.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfPowerAxles(JAXBElement<Integer> value) {
        this.numberOfPowerAxles = value;
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
     * Obtém o valor da propriedade odometerOffset.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getOdometerOffset() {
        return odometerOffset;
    }

    /**
     * Define o valor da propriedade odometerOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setOdometerOffset(JAXBElement<Distance> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdometerSourceOdometerSource() {
        return odometerSourceOdometerSource;
    }

    /**
     * Define o valor da propriedade odometerSourceOdometerSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdometerSourceOdometerSource(JAXBElement<String> value) {
        this.odometerSourceOdometerSource = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneGuid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOmnitracsOneGuid() {
        return omnitracsOneGuid;
    }

    /**
     * Define o valor da propriedade omnitracsOneGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOmnitracsOneGuid(JAXBElement<String> value) {
        this.omnitracsOneGuid = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneSystemOmnitracsOneSystemOfOrigin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOmnitracsOneSystemOmnitracsOneSystemOfOrigin() {
        return omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    }

    /**
     * Define o valor da propriedade omnitracsOneSystemOmnitracsOneSystemOfOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOmnitracsOneSystemOmnitracsOneSystemOfOrigin(JAXBElement<String> value) {
        this.omnitracsOneSystemOmnitracsOneSystemOfOrigin = value;
    }

    /**
     * Obtém o valor da propriedade ownerOperated.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOwnerOperated() {
        return ownerOperated;
    }

    /**
     * Define o valor da propriedade ownerOperated.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOwnerOperated(JAXBElement<Boolean> value) {
        this.ownerOperated = value;
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
     * Obtém o valor da propriedade preferredWorkerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPreferredWorkerEntityKey() {
        return preferredWorkerEntityKey;
    }

    /**
     * Define o valor da propriedade preferredWorkerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPreferredWorkerEntityKey(JAXBElement<Long> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemoteShutdownStateRemoteShutdownState() {
        return remoteShutdownStateRemoteShutdownState;
    }

    /**
     * Define o valor da propriedade remoteShutdownStateRemoteShutdownState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemoteShutdownStateRemoteShutdownState(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getSpeedBuzzerThresholdOverride() {
        return speedBuzzerThresholdOverride;
    }

    /**
     * Define o valor da propriedade speedBuzzerThresholdOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setSpeedBuzzerThresholdOverride(JAXBElement<Speed> value) {
        this.speedBuzzerThresholdOverride = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelematicsDeviceDescription() {
        return telematicsDeviceDescription;
    }

    /**
     * Define o valor da propriedade telematicsDeviceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelematicsDeviceDescription(JAXBElement<String> value) {
        this.telematicsDeviceDescription = value;
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
     * Obtém o valor da propriedade telematicsDeviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelematicsDeviceIdentifier() {
        return telematicsDeviceIdentifier;
    }

    /**
     * Define o valor da propriedade telematicsDeviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelematicsDeviceIdentifier(JAXBElement<String> value) {
        this.telematicsDeviceIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceInstallDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTelematicsDeviceInstallDate() {
        return telematicsDeviceInstallDate;
    }

    /**
     * Define o valor da propriedade telematicsDeviceInstallDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTelematicsDeviceInstallDate(JAXBElement<XMLGregorianCalendar> value) {
        this.telematicsDeviceInstallDate = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceReportedOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getTelematicsDeviceReportedOdometer() {
        return telematicsDeviceReportedOdometer;
    }

    /**
     * Define o valor da propriedade telematicsDeviceReportedOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setTelematicsDeviceReportedOdometer(JAXBElement<Distance> value) {
        this.telematicsDeviceReportedOdometer = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceReportedOdometerOffset.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getTelematicsDeviceReportedOdometerOffset() {
        return telematicsDeviceReportedOdometerOffset;
    }

    /**
     * Define o valor da propriedade telematicsDeviceReportedOdometerOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setTelematicsDeviceReportedOdometerOffset(JAXBElement<Distance> value) {
        this.telematicsDeviceReportedOdometerOffset = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceReportedTotalEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTelematicsDeviceReportedTotalEngineRunTime() {
        return telematicsDeviceReportedTotalEngineRunTime;
    }

    /**
     * Define o valor da propriedade telematicsDeviceReportedTotalEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTelematicsDeviceReportedTotalEngineRunTime(JAXBElement<Duration> value) {
        this.telematicsDeviceReportedTotalEngineRunTime = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEngineRuntimeSourceTotalEngineRuntimeSource() {
        return totalEngineRuntimeSourceTotalEngineRuntimeSource;
    }

    /**
     * Define o valor da propriedade totalEngineRuntimeSourceTotalEngineRuntimeSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEngineRuntimeSourceTotalEngineRuntimeSource(JAXBElement<String> value) {
        this.totalEngineRuntimeSourceTotalEngineRuntimeSource = value;
    }

    /**
     * Obtém o valor da propriedade transmissionManufacturer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransmissionManufacturer() {
        return transmissionManufacturer;
    }

    /**
     * Define o valor da propriedade transmissionManufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransmissionManufacturer(JAXBElement<String> value) {
        this.transmissionManufacturer = value;
    }

    /**
     * Obtém o valor da propriedade transmissionType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransmissionType() {
        return transmissionType;
    }

    /**
     * Define o valor da propriedade transmissionType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransmissionType(JAXBElement<String> value) {
        this.transmissionType = value;
    }

    /**
     * Obtém o valor da propriedade vehicleBusReportedOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getVehicleBusReportedOdometer() {
        return vehicleBusReportedOdometer;
    }

    /**
     * Define o valor da propriedade vehicleBusReportedOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setVehicleBusReportedOdometer(JAXBElement<Distance> value) {
        this.vehicleBusReportedOdometer = value;
    }

    /**
     * Obtém o valor da propriedade vehicleBusReportedOdometerOffset.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getVehicleBusReportedOdometerOffset() {
        return vehicleBusReportedOdometerOffset;
    }

    /**
     * Define o valor da propriedade vehicleBusReportedOdometerOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setVehicleBusReportedOdometerOffset(JAXBElement<Distance> value) {
        this.vehicleBusReportedOdometerOffset = value;
    }

    /**
     * Obtém o valor da propriedade vehicleIdentificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    /**
     * Define o valor da propriedade vehicleIdentificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleIdentificationNumber(JAXBElement<String> value) {
        this.vehicleIdentificationNumber = value;
    }

    /**
     * Obtém o valor da propriedade xrsSid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getXrsSid() {
        return xrsSid;
    }

    /**
     * Define o valor da propriedade xrsSid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setXrsSid(JAXBElement<Long> value) {
        this.xrsSid = value;
    }

}
