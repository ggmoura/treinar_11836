
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.TelematicsSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.TelematicsSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsiderIdlingWhilePTOIsRunning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultTelematicsDeviceInputOutputConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingBuzzerEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KeyFobAuthenticationBuzzerEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumIdlingEventDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoadnetTelematicsHDOPThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpeedBuzzerThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseOBDSpeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.TelematicsSettings", propOrder = {
    "considerIdlingWhilePTOIsRunning",
    "defaultTelematicsDeviceInputOutputConfiguration",
    "harshDrivingBuzzerEnabled",
    "isEnabled",
    "keyFobAuthenticationBuzzerEnabled",
    "minimumIdlingEventDuration",
    "roadnetTelematicsHDOPThreshold",
    "speedBuzzerThreshold",
    "telematicsProvider",
    "useOBDSpeed"
})
public class OverridableRegionPropertiesTelematicsSettings
    extends DataTransferObject
{

    @XmlElement(name = "ConsiderIdlingWhilePTOIsRunning")
    protected Boolean considerIdlingWhilePTOIsRunning;
    @XmlElement(name = "DefaultTelematicsDeviceInputOutputConfiguration")
    protected Boolean defaultTelematicsDeviceInputOutputConfiguration;
    @XmlElement(name = "HarshDrivingBuzzerEnabled")
    protected Boolean harshDrivingBuzzerEnabled;
    @XmlElement(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlElement(name = "KeyFobAuthenticationBuzzerEnabled")
    protected Boolean keyFobAuthenticationBuzzerEnabled;
    @XmlElement(name = "MinimumIdlingEventDuration")
    protected Boolean minimumIdlingEventDuration;
    @XmlElement(name = "RoadnetTelematicsHDOPThreshold")
    protected Boolean roadnetTelematicsHDOPThreshold;
    @XmlElement(name = "SpeedBuzzerThreshold")
    protected Boolean speedBuzzerThreshold;
    @XmlElement(name = "TelematicsProvider")
    protected Boolean telematicsProvider;
    @XmlElement(name = "UseOBDSpeed")
    protected Boolean useOBDSpeed;

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
     * Obtém o valor da propriedade defaultTelematicsDeviceInputOutputConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultTelematicsDeviceInputOutputConfiguration() {
        return defaultTelematicsDeviceInputOutputConfiguration;
    }

    /**
     * Define o valor da propriedade defaultTelematicsDeviceInputOutputConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultTelematicsDeviceInputOutputConfiguration(Boolean value) {
        this.defaultTelematicsDeviceInputOutputConfiguration = value;
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
     * Obtém o valor da propriedade minimumIdlingEventDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumIdlingEventDuration() {
        return minimumIdlingEventDuration;
    }

    /**
     * Define o valor da propriedade minimumIdlingEventDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumIdlingEventDuration(Boolean value) {
        this.minimumIdlingEventDuration = value;
    }

    /**
     * Obtém o valor da propriedade roadnetTelematicsHDOPThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoadnetTelematicsHDOPThreshold() {
        return roadnetTelematicsHDOPThreshold;
    }

    /**
     * Define o valor da propriedade roadnetTelematicsHDOPThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoadnetTelematicsHDOPThreshold(Boolean value) {
        this.roadnetTelematicsHDOPThreshold = value;
    }

    /**
     * Obtém o valor da propriedade speedBuzzerThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpeedBuzzerThreshold() {
        return speedBuzzerThreshold;
    }

    /**
     * Define o valor da propriedade speedBuzzerThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpeedBuzzerThreshold(Boolean value) {
        this.speedBuzzerThreshold = value;
    }

    /**
     * Obtém o valor da propriedade telematicsProvider.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsProvider() {
        return telematicsProvider;
    }

    /**
     * Define o valor da propriedade telematicsProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsProvider(Boolean value) {
        this.telematicsProvider = value;
    }

    /**
     * Obtém o valor da propriedade useOBDSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseOBDSpeed() {
        return useOBDSpeed;
    }

    /**
     * Define o valor da propriedade useOBDSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOBDSpeed(Boolean value) {
        this.useOBDSpeed = value;
    }

}
