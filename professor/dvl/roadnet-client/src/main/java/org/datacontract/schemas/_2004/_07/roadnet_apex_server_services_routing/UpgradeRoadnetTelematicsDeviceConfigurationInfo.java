
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UpgradeRoadnetTelematicsDeviceConfigurationInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpgradeRoadnetTelematicsDeviceConfigurationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScriptVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UpgradeFirmware" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpgradeScript" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpgradeVehicleDatabase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpgradeVehicleInterfaceFirmware" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleDatabaseVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleInterfaceFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeRoadnetTelematicsDeviceConfigurationInfo", propOrder = {
    "configVersion",
    "firmwareVersion",
    "scriptVersion",
    "telematicsDeviceEntityKey",
    "upgradeFirmware",
    "upgradeScript",
    "upgradeVehicleDatabase",
    "upgradeVehicleInterfaceFirmware",
    "vehicleDatabaseVersion",
    "vehicleInterfaceFirmwareVersion"
})
public class UpgradeRoadnetTelematicsDeviceConfigurationInfo {

    @XmlElementRef(name = "ConfigVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> configVersion;
    @XmlElementRef(name = "FirmwareVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firmwareVersion;
    @XmlElementRef(name = "ScriptVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scriptVersion;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Long telematicsDeviceEntityKey;
    @XmlElement(name = "UpgradeFirmware")
    protected Boolean upgradeFirmware;
    @XmlElement(name = "UpgradeScript")
    protected Boolean upgradeScript;
    @XmlElement(name = "UpgradeVehicleDatabase")
    protected Boolean upgradeVehicleDatabase;
    @XmlElement(name = "UpgradeVehicleInterfaceFirmware")
    protected Boolean upgradeVehicleInterfaceFirmware;
    @XmlElementRef(name = "VehicleDatabaseVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleDatabaseVersion;
    @XmlElementRef(name = "VehicleInterfaceFirmwareVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleInterfaceFirmwareVersion;

    /**
     * Obtém o valor da propriedade configVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConfigVersion() {
        return configVersion;
    }

    /**
     * Define o valor da propriedade configVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConfigVersion(JAXBElement<String> value) {
        this.configVersion = value;
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
     * Obtém o valor da propriedade upgradeFirmware.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgradeFirmware() {
        return upgradeFirmware;
    }

    /**
     * Define o valor da propriedade upgradeFirmware.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpgradeFirmware(Boolean value) {
        this.upgradeFirmware = value;
    }

    /**
     * Obtém o valor da propriedade upgradeScript.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgradeScript() {
        return upgradeScript;
    }

    /**
     * Define o valor da propriedade upgradeScript.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpgradeScript(Boolean value) {
        this.upgradeScript = value;
    }

    /**
     * Obtém o valor da propriedade upgradeVehicleDatabase.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgradeVehicleDatabase() {
        return upgradeVehicleDatabase;
    }

    /**
     * Define o valor da propriedade upgradeVehicleDatabase.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpgradeVehicleDatabase(Boolean value) {
        this.upgradeVehicleDatabase = value;
    }

    /**
     * Obtém o valor da propriedade upgradeVehicleInterfaceFirmware.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgradeVehicleInterfaceFirmware() {
        return upgradeVehicleInterfaceFirmware;
    }

    /**
     * Define o valor da propriedade upgradeVehicleInterfaceFirmware.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpgradeVehicleInterfaceFirmware(Boolean value) {
        this.upgradeVehicleInterfaceFirmware = value;
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

}
