
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.OmnitracsNavigationSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.OmnitracsNavigationSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowUserToDownloadMapRegions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CalculatorOptionsRemoteConfigEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ListOfMapDataRegionsEx_MapDataRegions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="MinimumSpeedingEventDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PathDeviationAlertDistanceThresholdOne" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="PathDeviationAlertDistanceThresholdTwo" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="PathDeviationAlertEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PostedSpeedThreshold" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
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
@XmlType(name = "Region.OmnitracsNavigationSettings", propOrder = {
    "allowUserToDownloadMapRegions",
    "calculatorOptionsRemoteConfigEnabled",
    "listOfMapDataRegionsExMapDataRegions",
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
public class RegionOmnitracsNavigationSettings
    extends DataTransferObject
{

    @XmlElement(name = "AllowUserToDownloadMapRegions")
    protected Boolean allowUserToDownloadMapRegions;
    @XmlElement(name = "CalculatorOptionsRemoteConfigEnabled")
    protected Boolean calculatorOptionsRemoteConfigEnabled;
    @XmlElementRef(name = "ListOfMapDataRegionsEx_MapDataRegions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfMapDataRegionsExMapDataRegions;
    @XmlElement(name = "MinimumSpeedingEventDuration")
    protected Duration minimumSpeedingEventDuration;
    @XmlElementRef(name = "PathDeviationAlertDistanceThresholdOne", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> pathDeviationAlertDistanceThresholdOne;
    @XmlElementRef(name = "PathDeviationAlertDistanceThresholdTwo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> pathDeviationAlertDistanceThresholdTwo;
    @XmlElement(name = "PathDeviationAlertEnabled")
    protected Boolean pathDeviationAlertEnabled;
    @XmlElementRef(name = "PostedSpeedThreshold", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> postedSpeedThreshold;
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
     * Obtém o valor da propriedade listOfMapDataRegionsExMapDataRegions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfMapDataRegionsExMapDataRegions() {
        return listOfMapDataRegionsExMapDataRegions;
    }

    /**
     * Define o valor da propriedade listOfMapDataRegionsExMapDataRegions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfMapDataRegionsExMapDataRegions(JAXBElement<ArrayOfstring> value) {
        this.listOfMapDataRegionsExMapDataRegions = value;
    }

    /**
     * Obtém o valor da propriedade minimumSpeedingEventDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumSpeedingEventDuration() {
        return minimumSpeedingEventDuration;
    }

    /**
     * Define o valor da propriedade minimumSpeedingEventDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumSpeedingEventDuration(Duration value) {
        this.minimumSpeedingEventDuration = value;
    }

    /**
     * Obtém o valor da propriedade pathDeviationAlertDistanceThresholdOne.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getPathDeviationAlertDistanceThresholdOne() {
        return pathDeviationAlertDistanceThresholdOne;
    }

    /**
     * Define o valor da propriedade pathDeviationAlertDistanceThresholdOne.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setPathDeviationAlertDistanceThresholdOne(JAXBElement<Distance> value) {
        this.pathDeviationAlertDistanceThresholdOne = value;
    }

    /**
     * Obtém o valor da propriedade pathDeviationAlertDistanceThresholdTwo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getPathDeviationAlertDistanceThresholdTwo() {
        return pathDeviationAlertDistanceThresholdTwo;
    }

    /**
     * Define o valor da propriedade pathDeviationAlertDistanceThresholdTwo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setPathDeviationAlertDistanceThresholdTwo(JAXBElement<Distance> value) {
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
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getPostedSpeedThreshold() {
        return postedSpeedThreshold;
    }

    /**
     * Define o valor da propriedade postedSpeedThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setPostedSpeedThreshold(JAXBElement<Speed> value) {
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
