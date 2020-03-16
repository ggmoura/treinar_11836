
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.TravelPathCalculatorSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.TravelPathCalculatorSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplyToLocalRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidDirtRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidLocalRoadShortcuts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidTollways" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidUTurns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreLegalRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LeftTurnsExtraTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LeftTurnsPenalty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferOmnitracsRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferTruckingRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RightTurnsExtraTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RightTurnsPenalty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseHistoricTravelSpeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.TravelPathCalculatorSettings", propOrder = {
    "applyToLocalRoads",
    "avoidDirtRoads",
    "avoidLocalRoadShortcuts",
    "avoidTollways",
    "avoidUTurns",
    "ignoreLegalRestrictions",
    "leftTurnsExtraTime",
    "leftTurnsPenalty",
    "preferOmnitracsRoads",
    "preferTruckingRoads",
    "rightTurnsExtraTime",
    "rightTurnsPenalty",
    "useHistoricTravelSpeeds"
})
public class OverridableRegionPropertiesTravelPathCalculatorSettings
    extends DataTransferObject
{

    @XmlElement(name = "ApplyToLocalRoads")
    protected Boolean applyToLocalRoads;
    @XmlElement(name = "AvoidDirtRoads")
    protected Boolean avoidDirtRoads;
    @XmlElement(name = "AvoidLocalRoadShortcuts")
    protected Boolean avoidLocalRoadShortcuts;
    @XmlElement(name = "AvoidTollways")
    protected Boolean avoidTollways;
    @XmlElement(name = "AvoidUTurns")
    protected Boolean avoidUTurns;
    @XmlElement(name = "IgnoreLegalRestrictions")
    protected Boolean ignoreLegalRestrictions;
    @XmlElement(name = "LeftTurnsExtraTime")
    protected Boolean leftTurnsExtraTime;
    @XmlElement(name = "LeftTurnsPenalty")
    protected Boolean leftTurnsPenalty;
    @XmlElement(name = "PreferOmnitracsRoads")
    protected Boolean preferOmnitracsRoads;
    @XmlElement(name = "PreferTruckingRoads")
    protected Boolean preferTruckingRoads;
    @XmlElement(name = "RightTurnsExtraTime")
    protected Boolean rightTurnsExtraTime;
    @XmlElement(name = "RightTurnsPenalty")
    protected Boolean rightTurnsPenalty;
    @XmlElement(name = "UseHistoricTravelSpeeds")
    protected Boolean useHistoricTravelSpeeds;

    /**
     * Obtém o valor da propriedade applyToLocalRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToLocalRoads() {
        return applyToLocalRoads;
    }

    /**
     * Define o valor da propriedade applyToLocalRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToLocalRoads(Boolean value) {
        this.applyToLocalRoads = value;
    }

    /**
     * Obtém o valor da propriedade avoidDirtRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvoidDirtRoads() {
        return avoidDirtRoads;
    }

    /**
     * Define o valor da propriedade avoidDirtRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvoidDirtRoads(Boolean value) {
        this.avoidDirtRoads = value;
    }

    /**
     * Obtém o valor da propriedade avoidLocalRoadShortcuts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvoidLocalRoadShortcuts() {
        return avoidLocalRoadShortcuts;
    }

    /**
     * Define o valor da propriedade avoidLocalRoadShortcuts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvoidLocalRoadShortcuts(Boolean value) {
        this.avoidLocalRoadShortcuts = value;
    }

    /**
     * Obtém o valor da propriedade avoidTollways.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvoidTollways() {
        return avoidTollways;
    }

    /**
     * Define o valor da propriedade avoidTollways.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvoidTollways(Boolean value) {
        this.avoidTollways = value;
    }

    /**
     * Obtém o valor da propriedade avoidUTurns.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvoidUTurns() {
        return avoidUTurns;
    }

    /**
     * Define o valor da propriedade avoidUTurns.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvoidUTurns(Boolean value) {
        this.avoidUTurns = value;
    }

    /**
     * Obtém o valor da propriedade ignoreLegalRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreLegalRestrictions() {
        return ignoreLegalRestrictions;
    }

    /**
     * Define o valor da propriedade ignoreLegalRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreLegalRestrictions(Boolean value) {
        this.ignoreLegalRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade leftTurnsExtraTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeftTurnsExtraTime() {
        return leftTurnsExtraTime;
    }

    /**
     * Define o valor da propriedade leftTurnsExtraTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeftTurnsExtraTime(Boolean value) {
        this.leftTurnsExtraTime = value;
    }

    /**
     * Obtém o valor da propriedade leftTurnsPenalty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeftTurnsPenalty() {
        return leftTurnsPenalty;
    }

    /**
     * Define o valor da propriedade leftTurnsPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeftTurnsPenalty(Boolean value) {
        this.leftTurnsPenalty = value;
    }

    /**
     * Obtém o valor da propriedade preferOmnitracsRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferOmnitracsRoads() {
        return preferOmnitracsRoads;
    }

    /**
     * Define o valor da propriedade preferOmnitracsRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferOmnitracsRoads(Boolean value) {
        this.preferOmnitracsRoads = value;
    }

    /**
     * Obtém o valor da propriedade preferTruckingRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferTruckingRoads() {
        return preferTruckingRoads;
    }

    /**
     * Define o valor da propriedade preferTruckingRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferTruckingRoads(Boolean value) {
        this.preferTruckingRoads = value;
    }

    /**
     * Obtém o valor da propriedade rightTurnsExtraTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightTurnsExtraTime() {
        return rightTurnsExtraTime;
    }

    /**
     * Define o valor da propriedade rightTurnsExtraTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightTurnsExtraTime(Boolean value) {
        this.rightTurnsExtraTime = value;
    }

    /**
     * Obtém o valor da propriedade rightTurnsPenalty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightTurnsPenalty() {
        return rightTurnsPenalty;
    }

    /**
     * Define o valor da propriedade rightTurnsPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightTurnsPenalty(Boolean value) {
        this.rightTurnsPenalty = value;
    }

    /**
     * Obtém o valor da propriedade useHistoricTravelSpeeds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseHistoricTravelSpeeds() {
        return useHistoricTravelSpeeds;
    }

    /**
     * Define o valor da propriedade useHistoricTravelSpeeds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseHistoricTravelSpeeds(Boolean value) {
        this.useHistoricTravelSpeeds = value;
    }

}
