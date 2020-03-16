
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.TelematicsSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.TelematicsSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsiderIdlingWhilePTOIsRunning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultTelematicsDeviceInputOutputConfigurationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingBuzzerEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KeyFobAuthenticationBuzzerEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoadnetTelematicsHDOPThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SpeedBuzzerThreshold" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsProvider" type="{http://roadnet.com/apex/DataContracts/}Region.TelematicsSettings.TelematicsProviderSettings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.TelematicsSettings", propOrder = {
    "considerIdlingWhilePTOIsRunning",
    "defaultTelematicsDeviceInputOutputConfigurationEntityKey",
    "harshDrivingBuzzerEnabled",
    "isEnabled",
    "keyFobAuthenticationBuzzerEnabled",
    "roadnetTelematicsHDOPThreshold",
    "speedBuzzerThreshold",
    "telematicsProvider"
})
public class RegionTelematicsSettings
    extends DataTransferObject
{

    @XmlElement(name = "ConsiderIdlingWhilePTOIsRunning")
    protected Boolean considerIdlingWhilePTOIsRunning;
    @XmlElementRef(name = "DefaultTelematicsDeviceInputOutputConfigurationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> defaultTelematicsDeviceInputOutputConfigurationEntityKey;
    @XmlElement(name = "HarshDrivingBuzzerEnabled")
    protected Boolean harshDrivingBuzzerEnabled;
    @XmlElement(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlElement(name = "KeyFobAuthenticationBuzzerEnabled")
    protected Boolean keyFobAuthenticationBuzzerEnabled;
    @XmlElement(name = "RoadnetTelematicsHDOPThreshold")
    protected Double roadnetTelematicsHDOPThreshold;
    @XmlElementRef(name = "SpeedBuzzerThreshold", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> speedBuzzerThreshold;
    @XmlElementRef(name = "TelematicsProvider", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionTelematicsSettingsTelematicsProviderSettings> telematicsProvider;

    /**
     * Obtém o valor da propriedade considerIdlingWhilePTOIsRunning.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsiderIdlingWhilePTOIsRunning() {
        return considerIdlingWhilePTOIsRunning;
    }

    /**
     * Define o valor da propriedade considerIdlingWhilePTOIsRunning.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsiderIdlingWhilePTOIsRunning(Boolean value) {
        this.considerIdlingWhilePTOIsRunning = value;
    }

    /**
     * Obtém o valor da propriedade defaultTelematicsDeviceInputOutputConfigurationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDefaultTelematicsDeviceInputOutputConfigurationEntityKey() {
        return defaultTelematicsDeviceInputOutputConfigurationEntityKey;
    }

    /**
     * Define o valor da propriedade defaultTelematicsDeviceInputOutputConfigurationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDefaultTelematicsDeviceInputOutputConfigurationEntityKey(JAXBElement<Long> value) {
        this.defaultTelematicsDeviceInputOutputConfigurationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade harshDrivingBuzzerEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHarshDrivingBuzzerEnabled() {
        return harshDrivingBuzzerEnabled;
    }

    /**
     * Define o valor da propriedade harshDrivingBuzzerEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHarshDrivingBuzzerEnabled(Boolean value) {
        this.harshDrivingBuzzerEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Define o valor da propriedade isEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    /**
     * Obtém o valor da propriedade keyFobAuthenticationBuzzerEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyFobAuthenticationBuzzerEnabled() {
        return keyFobAuthenticationBuzzerEnabled;
    }

    /**
     * Define o valor da propriedade keyFobAuthenticationBuzzerEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyFobAuthenticationBuzzerEnabled(Boolean value) {
        this.keyFobAuthenticationBuzzerEnabled = value;
    }

    /**
     * Obtém o valor da propriedade roadnetTelematicsHDOPThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRoadnetTelematicsHDOPThreshold() {
        return roadnetTelematicsHDOPThreshold;
    }

    /**
     * Define o valor da propriedade roadnetTelematicsHDOPThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRoadnetTelematicsHDOPThreshold(Double value) {
        this.roadnetTelematicsHDOPThreshold = value;
    }

    /**
     * Obtém o valor da propriedade speedBuzzerThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getSpeedBuzzerThreshold() {
        return speedBuzzerThreshold;
    }

    /**
     * Define o valor da propriedade speedBuzzerThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setSpeedBuzzerThreshold(JAXBElement<Speed> value) {
        this.speedBuzzerThreshold = value;
    }

    /**
     * Obtém o valor da propriedade telematicsProvider.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionTelematicsSettingsTelematicsProviderSettings }{@code >}
     *     
     */
    public JAXBElement<RegionTelematicsSettingsTelematicsProviderSettings> getTelematicsProvider() {
        return telematicsProvider;
    }

    /**
     * Define o valor da propriedade telematicsProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionTelematicsSettingsTelematicsProviderSettings }{@code >}
     *     
     */
    public void setTelematicsProvider(JAXBElement<RegionTelematicsSettingsTelematicsProviderSettings> value) {
        this.telematicsProvider = value;
    }

}
