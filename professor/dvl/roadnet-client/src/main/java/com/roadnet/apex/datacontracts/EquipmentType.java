
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de EquipmentType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustServiceTimePercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AdjustTravelTimePerStop" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AdjustTravelTimePerStopDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="AdjustTravelTimePercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AlternativeDeliveryVehicle" type="{http://roadnet.com/apex/DataContracts/}AlternativeDeliveryVehicle" minOccurs="0"/&gt;
 *         &lt;element name="AverageFuelConsumption" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Capacity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="CarbonFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Compartments" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentTypeCompartment" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentClassification_Classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FixedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *         &lt;element name="HourlyCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdlingFuelUsagePerHour" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *         &lt;element name="PowerUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedCommercialRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedHeightWeight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VariableCost" type="{http://roadnet.com/apex/DataContracts/}DistanceCost" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://roadnet.com/apex/DataContracts/}Weight" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentType", propOrder = {
    "adjustServiceTimePercent",
    "adjustTravelTimePerStop",
    "adjustTravelTimePerStopDistance",
    "adjustTravelTimePercent",
    "alternativeDeliveryVehicle",
    "averageFuelConsumption",
    "capacity",
    "carbonFactor",
    "compartments",
    "description",
    "equipmentClassificationClassification",
    "fixedCost",
    "height",
    "hourlyCost",
    "identifier",
    "idlingFuelUsagePerHour",
    "isDeleted",
    "length",
    "powerUnit",
    "restrictedCommercialRoads",
    "restrictedHeightWeight",
    "restrictedTimeOfDay",
    "variableCost",
    "weight",
    "width"
})
public class EquipmentType
    extends VisibleInMultipleRegionsAggregateRootEntity
{

    @XmlElement(name = "AdjustServiceTimePercent")
    protected Double adjustServiceTimePercent;
    @XmlElement(name = "AdjustTravelTimePerStop")
    protected Duration adjustTravelTimePerStop;
    @XmlElementRef(name = "AdjustTravelTimePerStopDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> adjustTravelTimePerStopDistance;
    @XmlElement(name = "AdjustTravelTimePercent")
    protected Double adjustTravelTimePercent;
    @XmlElementRef(name = "AlternativeDeliveryVehicle", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<AlternativeDeliveryVehicle> alternativeDeliveryVehicle;
    @XmlElement(name = "AverageFuelConsumption")
    protected Double averageFuelConsumption;
    @XmlElementRef(name = "Capacity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> capacity;
    @XmlElement(name = "CarbonFactor")
    protected Double carbonFactor;
    @XmlElementRef(name = "Compartments", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentTypeCompartment> compartments;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EquipmentClassification_Classification", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentClassificationClassification;
    @XmlElement(name = "FixedCost")
    protected Double fixedCost;
    @XmlElementRef(name = "Height", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> height;
    @XmlElement(name = "HourlyCost")
    protected Double hourlyCost;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "IdlingFuelUsagePerHour", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> idlingFuelUsagePerHour;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "Length", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> length;
    @XmlElement(name = "PowerUnit")
    protected Boolean powerUnit;
    @XmlElement(name = "RestrictedCommercialRoads")
    protected Boolean restrictedCommercialRoads;
    @XmlElement(name = "RestrictedHeightWeight")
    protected Boolean restrictedHeightWeight;
    @XmlElement(name = "RestrictedTimeOfDay")
    protected Boolean restrictedTimeOfDay;
    @XmlElementRef(name = "VariableCost", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceCost> variableCost;
    @XmlElementRef(name = "Weight", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Weight> weight;
    @XmlElementRef(name = "Width", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> width;

    /**
     * Obtém o valor da propriedade adjustServiceTimePercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustServiceTimePercent() {
        return adjustServiceTimePercent;
    }

    /**
     * Define o valor da propriedade adjustServiceTimePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustServiceTimePercent(Double value) {
        this.adjustServiceTimePercent = value;
    }

    /**
     * Obtém o valor da propriedade adjustTravelTimePerStop.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAdjustTravelTimePerStop() {
        return adjustTravelTimePerStop;
    }

    /**
     * Define o valor da propriedade adjustTravelTimePerStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAdjustTravelTimePerStop(Duration value) {
        this.adjustTravelTimePerStop = value;
    }

    /**
     * Obtém o valor da propriedade adjustTravelTimePerStopDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getAdjustTravelTimePerStopDistance() {
        return adjustTravelTimePerStopDistance;
    }

    /**
     * Define o valor da propriedade adjustTravelTimePerStopDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setAdjustTravelTimePerStopDistance(JAXBElement<Distance> value) {
        this.adjustTravelTimePerStopDistance = value;
    }

    /**
     * Obtém o valor da propriedade adjustTravelTimePercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustTravelTimePercent() {
        return adjustTravelTimePercent;
    }

    /**
     * Define o valor da propriedade adjustTravelTimePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustTravelTimePercent(Double value) {
        this.adjustTravelTimePercent = value;
    }

    /**
     * Obtém o valor da propriedade alternativeDeliveryVehicle.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlternativeDeliveryVehicle }{@code >}
     *     
     */
    public JAXBElement<AlternativeDeliveryVehicle> getAlternativeDeliveryVehicle() {
        return alternativeDeliveryVehicle;
    }

    /**
     * Define o valor da propriedade alternativeDeliveryVehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlternativeDeliveryVehicle }{@code >}
     *     
     */
    public void setAlternativeDeliveryVehicle(JAXBElement<AlternativeDeliveryVehicle> value) {
        this.alternativeDeliveryVehicle = value;
    }

    /**
     * Obtém o valor da propriedade averageFuelConsumption.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    /**
     * Define o valor da propriedade averageFuelConsumption.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageFuelConsumption(Double value) {
        this.averageFuelConsumption = value;
    }

    /**
     * Obtém o valor da propriedade capacity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getCapacity() {
        return capacity;
    }

    /**
     * Define o valor da propriedade capacity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setCapacity(JAXBElement<Quantities> value) {
        this.capacity = value;
    }

    /**
     * Obtém o valor da propriedade carbonFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCarbonFactor() {
        return carbonFactor;
    }

    /**
     * Define o valor da propriedade carbonFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCarbonFactor(Double value) {
        this.carbonFactor = value;
    }

    /**
     * Obtém o valor da propriedade compartments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentTypeCompartment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentTypeCompartment> getCompartments() {
        return compartments;
    }

    /**
     * Define o valor da propriedade compartments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentTypeCompartment }{@code >}
     *     
     */
    public void setCompartments(JAXBElement<ArrayOfEquipmentTypeCompartment> value) {
        this.compartments = value;
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
     * Obtém o valor da propriedade equipmentClassificationClassification.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentClassificationClassification() {
        return equipmentClassificationClassification;
    }

    /**
     * Define o valor da propriedade equipmentClassificationClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentClassificationClassification(JAXBElement<String> value) {
        this.equipmentClassificationClassification = value;
    }

    /**
     * Obtém o valor da propriedade fixedCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedCost() {
        return fixedCost;
    }

    /**
     * Define o valor da propriedade fixedCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedCost(Double value) {
        this.fixedCost = value;
    }

    /**
     * Obtém o valor da propriedade height.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getHeight() {
        return height;
    }

    /**
     * Define o valor da propriedade height.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setHeight(JAXBElement<Length> value) {
        this.height = value;
    }

    /**
     * Obtém o valor da propriedade hourlyCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHourlyCost() {
        return hourlyCost;
    }

    /**
     * Define o valor da propriedade hourlyCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHourlyCost(Double value) {
        this.hourlyCost = value;
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
     * Obtém o valor da propriedade idlingFuelUsagePerHour.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getIdlingFuelUsagePerHour() {
        return idlingFuelUsagePerHour;
    }

    /**
     * Define o valor da propriedade idlingFuelUsagePerHour.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setIdlingFuelUsagePerHour(JAXBElement<LiquidVolume> value) {
        this.idlingFuelUsagePerHour = value;
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
     * Obtém o valor da propriedade length.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getLength() {
        return length;
    }

    /**
     * Define o valor da propriedade length.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setLength(JAXBElement<Length> value) {
        this.length = value;
    }

    /**
     * Obtém o valor da propriedade powerUnit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowerUnit() {
        return powerUnit;
    }

    /**
     * Define o valor da propriedade powerUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowerUnit(Boolean value) {
        this.powerUnit = value;
    }

    /**
     * Obtém o valor da propriedade restrictedCommercialRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedCommercialRoads() {
        return restrictedCommercialRoads;
    }

    /**
     * Define o valor da propriedade restrictedCommercialRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedCommercialRoads(Boolean value) {
        this.restrictedCommercialRoads = value;
    }

    /**
     * Obtém o valor da propriedade restrictedHeightWeight.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedHeightWeight() {
        return restrictedHeightWeight;
    }

    /**
     * Define o valor da propriedade restrictedHeightWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedHeightWeight(Boolean value) {
        this.restrictedHeightWeight = value;
    }

    /**
     * Obtém o valor da propriedade restrictedTimeOfDay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedTimeOfDay() {
        return restrictedTimeOfDay;
    }

    /**
     * Define o valor da propriedade restrictedTimeOfDay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedTimeOfDay(Boolean value) {
        this.restrictedTimeOfDay = value;
    }

    /**
     * Obtém o valor da propriedade variableCost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceCost }{@code >}
     *     
     */
    public JAXBElement<DistanceCost> getVariableCost() {
        return variableCost;
    }

    /**
     * Define o valor da propriedade variableCost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceCost }{@code >}
     *     
     */
    public void setVariableCost(JAXBElement<DistanceCost> value) {
        this.variableCost = value;
    }

    /**
     * Obtém o valor da propriedade weight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public JAXBElement<Weight> getWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public void setWeight(JAXBElement<Weight> value) {
        this.weight = value;
    }

    /**
     * Obtém o valor da propriedade width.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getWidth() {
        return width;
    }

    /**
     * Define o valor da propriedade width.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setWidth(JAXBElement<Length> value) {
        this.width = value;
    }

}
