
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelematicsDeviceDiagnosticsUpdateAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelematicsDeviceDiagnosticsUpdateAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DevicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SatelliteModemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScriptVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleDatabaseVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleInterfaceFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleInterface_RoadnetTelematicsVehicleInterface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleTopGearValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelematicsDeviceDiagnosticsUpdateAction", propOrder = {
    "applicationIdentifier",
    "deviceFirmwareVersion",
    "devicePhoneNumber",
    "satelliteModemIdentifier",
    "scriptVersion",
    "vehicleDatabaseVersion",
    "vehicleIdentificationNumber",
    "vehicleInterfaceFirmwareVersion",
    "vehicleInterfaceRoadnetTelematicsVehicleInterface",
    "vehicleTopGearValue"
})
public class TelematicsDeviceDiagnosticsUpdateAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "ApplicationIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicationIdentifier;
    @XmlElementRef(name = "DeviceFirmwareVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deviceFirmwareVersion;
    @XmlElementRef(name = "DevicePhoneNumber", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> devicePhoneNumber;
    @XmlElementRef(name = "SatelliteModemIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> satelliteModemIdentifier;
    @XmlElementRef(name = "ScriptVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scriptVersion;
    @XmlElementRef(name = "VehicleDatabaseVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleDatabaseVersion;
    @XmlElementRef(name = "VehicleIdentificationNumber", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleIdentificationNumber;
    @XmlElementRef(name = "VehicleInterfaceFirmwareVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleInterfaceFirmwareVersion;
    @XmlElementRef(name = "VehicleInterface_RoadnetTelematicsVehicleInterface", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleInterfaceRoadnetTelematicsVehicleInterface;
    @XmlElementRef(name = "VehicleTopGearValue", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> vehicleTopGearValue;

    /**
     * Obtém o valor da propriedade applicationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationIdentifier() {
        return applicationIdentifier;
    }

    /**
     * Define o valor da propriedade applicationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationIdentifier(JAXBElement<String> value) {
        this.applicationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade deviceFirmwareVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeviceFirmwareVersion() {
        return deviceFirmwareVersion;
    }

    /**
     * Define o valor da propriedade deviceFirmwareVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeviceFirmwareVersion(JAXBElement<String> value) {
        this.deviceFirmwareVersion = value;
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

    /**
     * Obtém o valor da propriedade vehicleTopGearValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVehicleTopGearValue() {
        return vehicleTopGearValue;
    }

    /**
     * Define o valor da propriedade vehicleTopGearValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVehicleTopGearValue(JAXBElement<Integer> value) {
        this.vehicleTopGearValue = value;
    }

}
