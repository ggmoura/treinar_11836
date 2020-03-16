
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TelematicsDeviceStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelematicsDeviceStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveTroubleCodes" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDiagnosticTroubleCodeEvent" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRouteDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRoutingSessionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DataCommunicationsType_CurrentDataCommunicationsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DevicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasPendingUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionState_IgnitionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Input0" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input5" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input6" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input7" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastContactTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPosition" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPositionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastUsedRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OdometerOffset" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="OdometerSource_OdometerSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PendingFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PendingScriptVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PendingVehicleDatabaseVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PendingVehicleInterfaceFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PowerSource_CurrentPowerSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedSignalStrengthIndicator" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SatelliteModemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScriptVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceHardwarePlatform_HardwarePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceReportedOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceReportedOdometerOffset" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsProviderType_ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemperatureSensorValue" type="{http://roadnet.com/apex/DataContracts/}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="TimeSinceLastContact" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TimeSinceLastPositionUpdate" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRuntimeSource_TotalEngineRuntimeSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusReportedOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusReportedOdometerOffset" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusStatus_VehicleBusStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleDatabaseVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TelematicsDeviceStatus", propOrder = {
    "activeTroubleCodes",
    "calculatedOdometer",
    "currentRouteDisplayName",
    "currentRouteEntityKey",
    "currentRoutingSessionDate",
    "dataCommunicationsTypeCurrentDataCommunicationsType",
    "devicePhoneNumber",
    "equipmentEntityKey",
    "equipmentIdentifier",
    "equipmentTypeIdentifier",
    "firmwareVersion",
    "hasPendingUpdate",
    "ignitionStateIgnitionState",
    "input0",
    "input1",
    "input2",
    "input3",
    "input4",
    "input5",
    "input6",
    "input7",
    "lastContactTime",
    "lastKnownPosition",
    "lastKnownPositionTime",
    "lastUsedRegionIdentifier",
    "model",
    "odometerOffset",
    "odometerSourceOdometerSource",
    "pendingFirmwareVersion",
    "pendingScriptVersion",
    "pendingVehicleDatabaseVersion",
    "pendingVehicleInterfaceFirmwareVersion",
    "powerSourceCurrentPowerSource",
    "receivedSignalStrengthIndicator",
    "satelliteModemIdentifier",
    "scriptVersion",
    "telematicsDeviceDescription",
    "telematicsDeviceEntityKey",
    "telematicsDeviceHardwarePlatformHardwarePlatform",
    "telematicsDeviceIdentifier",
    "telematicsDeviceReportedOdometer",
    "telematicsDeviceReportedOdometerOffset",
    "telematicsProviderTypeProviderType",
    "temperatureSensorValue",
    "timeSinceLastContact",
    "timeSinceLastPositionUpdate",
    "totalEngineRunTime",
    "totalEngineRuntimeSourceTotalEngineRuntimeSource",
    "vehicleBusReportedOdometer",
    "vehicleBusReportedOdometerOffset",
    "vehicleBusStatusVehicleBusStatus",
    "vehicleDatabaseVersion",
    "vehicleIdentificationNumber",
    "vehicleInterfaceFirmwareVersion",
    "vehicleInterfaceRoadnetTelematicsVehicleInterface"
})
public class TelematicsDeviceStatus
    extends DataTransferObject
{

    @XmlElementRef(name = "ActiveTroubleCodes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDiagnosticTroubleCodeEvent> activeTroubleCodes;
    @XmlElementRef(name = "CalculatedOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> calculatedOdometer;
    @XmlElementRef(name = "CurrentRouteDisplayName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRouteDisplayName;
    @XmlElementRef(name = "CurrentRouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> currentRouteEntityKey;
    @XmlElementRef(name = "CurrentRoutingSessionDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> currentRoutingSessionDate;
    @XmlElementRef(name = "DataCommunicationsType_CurrentDataCommunicationsType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCommunicationsTypeCurrentDataCommunicationsType;
    @XmlElementRef(name = "DevicePhoneNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> devicePhoneNumber;
    @XmlElementRef(name = "EquipmentEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentEntityKey;
    @XmlElementRef(name = "EquipmentIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentIdentifier;
    @XmlElementRef(name = "EquipmentTypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentTypeIdentifier;
    @XmlElementRef(name = "FirmwareVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firmwareVersion;
    @XmlElement(name = "HasPendingUpdate")
    protected Boolean hasPendingUpdate;
    @XmlElementRef(name = "IgnitionState_IgnitionState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ignitionStateIgnitionState;
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
    @XmlElementRef(name = "LastContactTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastContactTime;
    @XmlElementRef(name = "LastKnownPosition", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> lastKnownPosition;
    @XmlElementRef(name = "LastKnownPositionTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastKnownPositionTime;
    @XmlElementRef(name = "LastUsedRegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUsedRegionIdentifier;
    @XmlElementRef(name = "Model", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "OdometerOffset", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> odometerOffset;
    @XmlElementRef(name = "OdometerSource_OdometerSource", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> odometerSourceOdometerSource;
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
    @XmlElementRef(name = "ReceivedSignalStrengthIndicator", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receivedSignalStrengthIndicator;
    @XmlElementRef(name = "SatelliteModemIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> satelliteModemIdentifier;
    @XmlElementRef(name = "ScriptVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scriptVersion;
    @XmlElementRef(name = "TelematicsDeviceDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telematicsDeviceDescription;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Long telematicsDeviceEntityKey;
    @XmlElementRef(name = "TelematicsDeviceHardwarePlatform_HardwarePlatform", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telematicsDeviceHardwarePlatformHardwarePlatform;
    @XmlElementRef(name = "TelematicsDeviceIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telematicsDeviceIdentifier;
    @XmlElementRef(name = "TelematicsDeviceReportedOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> telematicsDeviceReportedOdometer;
    @XmlElementRef(name = "TelematicsDeviceReportedOdometerOffset", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> telematicsDeviceReportedOdometerOffset;
    @XmlElementRef(name = "TelematicsProviderType_ProviderType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telematicsProviderTypeProviderType;
    @XmlElementRef(name = "TemperatureSensorValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Temperature> temperatureSensorValue;
    @XmlElementRef(name = "TimeSinceLastContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> timeSinceLastContact;
    @XmlElementRef(name = "TimeSinceLastPositionUpdate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> timeSinceLastPositionUpdate;
    @XmlElementRef(name = "TotalEngineRunTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalEngineRunTime;
    @XmlElementRef(name = "TotalEngineRuntimeSource_TotalEngineRuntimeSource", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEngineRuntimeSourceTotalEngineRuntimeSource;
    @XmlElementRef(name = "VehicleBusReportedOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> vehicleBusReportedOdometer;
    @XmlElementRef(name = "VehicleBusReportedOdometerOffset", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> vehicleBusReportedOdometerOffset;
    @XmlElementRef(name = "VehicleBusStatus_VehicleBusStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleBusStatusVehicleBusStatus;
    @XmlElementRef(name = "VehicleDatabaseVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleDatabaseVersion;
    @XmlElementRef(name = "VehicleIdentificationNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleIdentificationNumber;
    @XmlElementRef(name = "VehicleInterfaceFirmwareVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleInterfaceFirmwareVersion;
    @XmlElementRef(name = "VehicleInterface_RoadnetTelematicsVehicleInterface", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleInterfaceRoadnetTelematicsVehicleInterface;

    /**
     * Obtém o valor da propriedade activeTroubleCodes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeEvent }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDiagnosticTroubleCodeEvent> getActiveTroubleCodes() {
        return activeTroubleCodes;
    }

    /**
     * Define o valor da propriedade activeTroubleCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeEvent }{@code >}
     *     
     */
    public void setActiveTroubleCodes(JAXBElement<ArrayOfDiagnosticTroubleCodeEvent> value) {
        this.activeTroubleCodes = value;
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
     * Obtém o valor da propriedade currentRouteDisplayName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentRouteDisplayName() {
        return currentRouteDisplayName;
    }

    /**
     * Define o valor da propriedade currentRouteDisplayName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentRouteDisplayName(JAXBElement<String> value) {
        this.currentRouteDisplayName = value;
    }

    /**
     * Obtém o valor da propriedade currentRouteEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCurrentRouteEntityKey() {
        return currentRouteEntityKey;
    }

    /**
     * Define o valor da propriedade currentRouteEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCurrentRouteEntityKey(JAXBElement<Long> value) {
        this.currentRouteEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade currentRoutingSessionDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCurrentRoutingSessionDate() {
        return currentRoutingSessionDate;
    }

    /**
     * Define o valor da propriedade currentRoutingSessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCurrentRoutingSessionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.currentRoutingSessionDate = value;
    }

    /**
     * Obtém o valor da propriedade dataCommunicationsTypeCurrentDataCommunicationsType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCommunicationsTypeCurrentDataCommunicationsType() {
        return dataCommunicationsTypeCurrentDataCommunicationsType;
    }

    /**
     * Define o valor da propriedade dataCommunicationsTypeCurrentDataCommunicationsType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCommunicationsTypeCurrentDataCommunicationsType(JAXBElement<String> value) {
        this.dataCommunicationsTypeCurrentDataCommunicationsType = value;
    }

    /**
     * Obtém o valor da propriedade devicePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDevicePhoneNumber() {
        return devicePhoneNumber;
    }

    /**
     * Define o valor da propriedade devicePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDevicePhoneNumber(JAXBElement<String> value) {
        this.devicePhoneNumber = value;
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
     * Obtém o valor da propriedade equipmentTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentTypeIdentifier() {
        return equipmentTypeIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentTypeIdentifier(JAXBElement<String> value) {
        this.equipmentTypeIdentifier = value;
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
     * Obtém o valor da propriedade lastContactTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastContactTime() {
        return lastContactTime;
    }

    /**
     * Define o valor da propriedade lastContactTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastContactTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastContactTime = value;
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
     * Obtém o valor da propriedade lastUsedRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUsedRegionIdentifier() {
        return lastUsedRegionIdentifier;
    }

    /**
     * Define o valor da propriedade lastUsedRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUsedRegionIdentifier(JAXBElement<String> value) {
        this.lastUsedRegionIdentifier = value;
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
     * Obtém o valor da propriedade timeSinceLastContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTimeSinceLastContact() {
        return timeSinceLastContact;
    }

    /**
     * Define o valor da propriedade timeSinceLastContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTimeSinceLastContact(JAXBElement<Duration> value) {
        this.timeSinceLastContact = value;
    }

    /**
     * Obtém o valor da propriedade timeSinceLastPositionUpdate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTimeSinceLastPositionUpdate() {
        return timeSinceLastPositionUpdate;
    }

    /**
     * Define o valor da propriedade timeSinceLastPositionUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTimeSinceLastPositionUpdate(JAXBElement<Duration> value) {
        this.timeSinceLastPositionUpdate = value;
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
