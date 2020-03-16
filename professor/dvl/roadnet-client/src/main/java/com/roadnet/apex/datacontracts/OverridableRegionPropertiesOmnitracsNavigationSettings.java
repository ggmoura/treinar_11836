
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.OmnitracsNavigationSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.OmnitracsNavigationSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowUserToDownloadMapRegions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CalculatorOptionsRemoteConfigEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumSpeedingEventDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PathDeviationAlertDistanceThresholdOne" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PathDeviationAlertDistanceThresholdTwo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PathDeviationAlertEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PostedSpeedThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAutoCompleteRemoveRemainingStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpeedAlertEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpeedAlertNavEventGenerationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpeedAlertRemoteConfigEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpeedAlertSoundEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.OmnitracsNavigationSettings", propOrder = {
    "allowUserToDownloadMapRegions",
    "calculatorOptionsRemoteConfigEnabled",
    "minimumSpeedingEventDuration",
    "pathDeviationAlertDistanceThresholdOne",
    "pathDeviationAlertDistanceThresholdTwo",
    "pathDeviationAlertEnabled",
    "postedSpeedThreshold",
    "routeAutoCompleteRemoveRemainingStops",
    "speedAlertEnabled",
    "speedAlertNavEventGenerationEnabled",
    "speedAlertRemoteConfigEnabled",
    "speedAlertSoundEnabled"
})
public class OverridableRegionPropertiesOmnitracsNavigationSettings
    extends DataTransferObject
{

    @XmlElement(name = "AllowUserToDownloadMapRegions")
    protected Boolean allowUserToDownloadMapRegions;
    @XmlElement(name = "CalculatorOptionsRemoteConfigEnabled")
    protected Boolean calculatorOptionsRemoteConfigEnabled;
    @XmlElement(name = "MinimumSpeedingEventDuration")
    protected Boolean minimumSpeedingEventDuration;
    @XmlElement(name = "PathDeviationAlertDistanceThresholdOne")
    protected Boolean pathDeviationAlertDistanceThresholdOne;
    @XmlElement(name = "PathDeviationAlertDistanceThresholdTwo")
    protected Boolean pathDeviationAlertDistanceThresholdTwo;
    @XmlElement(name = "PathDeviationAlertEnabled")
    protected Boolean pathDeviationAlertEnabled;
    @XmlElement(name = "PostedSpeedThreshold")
    protected Boolean postedSpeedThreshold;
    @XmlElement(name = "RouteAutoCompleteRemoveRemainingStops")
    protected Boolean routeAutoCompleteRemoveRemainingStops;
    @XmlElement(name = "SpeedAlertEnabled")
    protected Boolean speedAlertEnabled;
    @XmlElement(name = "SpeedAlertNavEventGenerationEnabled")
    protected Boolean speedAlertNavEventGenerationEnabled;
    @XmlElement(name = "SpeedAlertRemoteConfigEnabled")
    protected Boolean speedAlertRemoteConfigEnabled;
    @XmlElement(name = "SpeedAlertSoundEnabled")
    protected Boolean speedAlertSoundEnabled;

    /**
     * Obtém o valor da propriedade allowUserToDownloadMapRegions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowUserToDownloadMapRegions() {
        return allowUserToDownloadMapRegions;
    }

    /**
     * Define o valor da propriedade allowUserToDownloadMapRegions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowUserToDownloadMapRegions(Boolean value) {
        this.allowUserToDownloadMapRegions = value;
    }

    /**
     * Obtém o valor da propriedade calculatorOptionsRemoteConfigEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculatorOptionsRemoteConfigEnabled() {
        return calculatorOptionsRemoteConfigEnabled;
    }

    /**
     * Define o valor da propriedade calculatorOptionsRemoteConfigEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculatorOptionsRemoteConfigEnabled(Boolean value) {
        this.calculatorOptionsRemoteConfigEnabled = value;
    }

    /**
     * Obtém o valor da propriedade minimumSpeedingEventDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumSpeedingEventDuration() {
        return minimumSpeedingEventDuration;
    }

    /**
     * Define o valor da propriedade minimumSpeedingEventDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumSpeedingEventDuration(Boolean value) {
        this.minimumSpeedingEventDuration = value;
    }

    /**
     * Obtém o valor da propriedade pathDeviationAlertDistanceThresholdOne.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPathDeviationAlertDistanceThresholdOne() {
        return pathDeviationAlertDistanceThresholdOne;
    }

    /**
     * Define o valor da propriedade pathDeviationAlertDistanceThresholdOne.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPathDeviationAlertDistanceThresholdOne(Boolean value) {
        this.pathDeviationAlertDistanceThresholdOne = value;
    }

    /**
     * Obtém o valor da propriedade pathDeviationAlertDistanceThresholdTwo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPathDeviationAlertDistanceThresholdTwo() {
        return pathDeviationAlertDistanceThresholdTwo;
    }

    /**
     * Define o valor da propriedade pathDeviationAlertDistanceThresholdTwo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPathDeviationAlertDistanceThresholdTwo(Boolean value) {
        this.pathDeviationAlertDistanceThresholdTwo = value;
    }

    /**
     * Obtém o valor da propriedade pathDeviationAlertEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPathDeviationAlertEnabled() {
        return pathDeviationAlertEnabled;
    }

    /**
     * Define o valor da propriedade pathDeviationAlertEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPathDeviationAlertEnabled(Boolean value) {
        this.pathDeviationAlertEnabled = value;
    }

    /**
     * Obtém o valor da propriedade postedSpeedThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostedSpeedThreshold() {
        return postedSpeedThreshold;
    }

    /**
     * Define o valor da propriedade postedSpeedThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostedSpeedThreshold(Boolean value) {
        this.postedSpeedThreshold = value;
    }

    /**
     * Obtém o valor da propriedade routeAutoCompleteRemoveRemainingStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteAutoCompleteRemoveRemainingStops() {
        return routeAutoCompleteRemoveRemainingStops;
    }

    /**
     * Define o valor da propriedade routeAutoCompleteRemoveRemainingStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteAutoCompleteRemoveRemainingStops(Boolean value) {
        this.routeAutoCompleteRemoveRemainingStops = value;
    }

    /**
     * Obtém o valor da propriedade speedAlertEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpeedAlertEnabled() {
        return speedAlertEnabled;
    }

    /**
     * Define o valor da propriedade speedAlertEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpeedAlertEnabled(Boolean value) {
        this.speedAlertEnabled = value;
    }

    /**
     * Obtém o valor da propriedade speedAlertNavEventGenerationEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpeedAlertNavEventGenerationEnabled() {
        return speedAlertNavEventGenerationEnabled;
    }

    /**
     * Define o valor da propriedade speedAlertNavEventGenerationEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpeedAlertNavEventGenerationEnabled(Boolean value) {
        this.speedAlertNavEventGenerationEnabled = value;
    }

    /**
     * Obtém o valor da propriedade speedAlertRemoteConfigEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpeedAlertRemoteConfigEnabled() {
        return speedAlertRemoteConfigEnabled;
    }

    /**
     * Define o valor da propriedade speedAlertRemoteConfigEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpeedAlertRemoteConfigEnabled(Boolean value) {
        this.speedAlertRemoteConfigEnabled = value;
    }

    /**
     * Obtém o valor da propriedade speedAlertSoundEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpeedAlertSoundEnabled() {
        return speedAlertSoundEnabled;
    }

    /**
     * Define o valor da propriedade speedAlertSoundEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpeedAlertSoundEnabled(Boolean value) {
        this.speedAlertSoundEnabled = value;
    }

}
