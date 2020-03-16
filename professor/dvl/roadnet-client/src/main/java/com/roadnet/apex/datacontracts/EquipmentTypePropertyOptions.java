
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EquipmentTypePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentTypePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustServiceTimePercent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustTravelTimePerStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustTravelTimePerStopDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustTravelTimePercent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlternativeDeliveryVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AverageFuelConsumption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CarbonFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Compartments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompartmentsOptions" type="{http://roadnet.com/apex/DataContracts/}EquipmentTypeCompartmentPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentClassification_Classification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FixedCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HourlyCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IdlingFuelUsagePerHour" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PowerUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedCommercialRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedHeightWeight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VariableCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentTypePropertyOptions", propOrder = {
    "adjustServiceTimePercent",
    "adjustTravelTimePerStop",
    "adjustTravelTimePerStopDistance",
    "adjustTravelTimePercent",
    "alternativeDeliveryVehicle",
    "averageFuelConsumption",
    "capacity",
    "carbonFactor",
    "compartments",
    "compartmentsOptions",
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
public class EquipmentTypePropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "AdjustServiceTimePercent")
    protected Boolean adjustServiceTimePercent;
    @XmlElement(name = "AdjustTravelTimePerStop")
    protected Boolean adjustTravelTimePerStop;
    @XmlElement(name = "AdjustTravelTimePerStopDistance")
    protected Boolean adjustTravelTimePerStopDistance;
    @XmlElement(name = "AdjustTravelTimePercent")
    protected Boolean adjustTravelTimePercent;
    @XmlElement(name = "AlternativeDeliveryVehicle")
    protected Boolean alternativeDeliveryVehicle;
    @XmlElement(name = "AverageFuelConsumption")
    protected Boolean averageFuelConsumption;
    @XmlElement(name = "Capacity")
    protected Boolean capacity;
    @XmlElement(name = "CarbonFactor")
    protected Boolean carbonFactor;
    @XmlElement(name = "Compartments")
    protected Boolean compartments;
    @XmlElementRef(name = "CompartmentsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentTypeCompartmentPropertyOptions> compartmentsOptions;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EquipmentClassification_Classification")
    protected Boolean equipmentClassificationClassification;
    @XmlElement(name = "FixedCost")
    protected Boolean fixedCost;
    @XmlElement(name = "Height")
    protected Boolean height;
    @XmlElement(name = "HourlyCost")
    protected Boolean hourlyCost;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IdlingFuelUsagePerHour")
    protected Boolean idlingFuelUsagePerHour;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "Length")
    protected Boolean length;
    @XmlElement(name = "PowerUnit")
    protected Boolean powerUnit;
    @XmlElement(name = "RestrictedCommercialRoads")
    protected Boolean restrictedCommercialRoads;
    @XmlElement(name = "RestrictedHeightWeight")
    protected Boolean restrictedHeightWeight;
    @XmlElement(name = "RestrictedTimeOfDay")
    protected Boolean restrictedTimeOfDay;
    @XmlElement(name = "VariableCost")
    protected Boolean variableCost;
    @XmlElement(name = "Weight")
    protected Boolean weight;
    @XmlElement(name = "Width")
    protected Boolean width;

    /**
     * Obtém o valor da propriedade adjustServiceTimePercent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustServiceTimePercent() {
        return adjustServiceTimePercent;
    }

    /**
     * Define o valor da propriedade adjustServiceTimePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustServiceTimePercent(Boolean value) {
        this.adjustServiceTimePercent = value;
    }

    /**
     * Obtém o valor da propriedade adjustTravelTimePerStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustTravelTimePerStop() {
        return adjustTravelTimePerStop;
    }

    /**
     * Define o valor da propriedade adjustTravelTimePerStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustTravelTimePerStop(Boolean value) {
        this.adjustTravelTimePerStop = value;
    }

    /**
     * Obtém o valor da propriedade adjustTravelTimePerStopDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustTravelTimePerStopDistance() {
        return adjustTravelTimePerStopDistance;
    }

    /**
     * Define o valor da propriedade adjustTravelTimePerStopDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustTravelTimePerStopDistance(Boolean value) {
        this.adjustTravelTimePerStopDistance = value;
    }

    /**
     * Obtém o valor da propriedade adjustTravelTimePercent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustTravelTimePercent() {
        return adjustTravelTimePercent;
    }

    /**
     * Define o valor da propriedade adjustTravelTimePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustTravelTimePercent(Boolean value) {
        this.adjustTravelTimePercent = value;
    }

    /**
     * Obtém o valor da propriedade alternativeDeliveryVehicle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternativeDeliveryVehicle() {
        return alternativeDeliveryVehicle;
    }

    /**
     * Define o valor da propriedade alternativeDeliveryVehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternativeDeliveryVehicle(Boolean value) {
        this.alternativeDeliveryVehicle = value;
    }

    /**
     * Obtém o valor da propriedade averageFuelConsumption.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    /**
     * Define o valor da propriedade averageFuelConsumption.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAverageFuelConsumption(Boolean value) {
        this.averageFuelConsumption = value;
    }

    /**
     * Obtém o valor da propriedade capacity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCapacity() {
        return capacity;
    }

    /**
     * Define o valor da propriedade capacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCapacity(Boolean value) {
        this.capacity = value;
    }

    /**
     * Obtém o valor da propriedade carbonFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCarbonFactor() {
        return carbonFactor;
    }

    /**
     * Define o valor da propriedade carbonFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCarbonFactor(Boolean value) {
        this.carbonFactor = value;
    }

    /**
     * Obtém o valor da propriedade compartments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompartments() {
        return compartments;
    }

    /**
     * Define o valor da propriedade compartments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompartments(Boolean value) {
        this.compartments = value;
    }

    /**
     * Obtém o valor da propriedade compartmentsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeCompartmentPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<EquipmentTypeCompartmentPropertyOptions> getCompartmentsOptions() {
        return compartmentsOptions;
    }

    /**
     * Define o valor da propriedade compartmentsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeCompartmentPropertyOptions }{@code >}
     *     
     */
    public void setCompartmentsOptions(JAXBElement<EquipmentTypeCompartmentPropertyOptions> value) {
        this.compartmentsOptions = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade equipmentClassificationClassification.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentClassificationClassification() {
        return equipmentClassificationClassification;
    }

    /**
     * Define o valor da propriedade equipmentClassificationClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentClassificationClassification(Boolean value) {
        this.equipmentClassificationClassification = value;
    }

    /**
     * Obtém o valor da propriedade fixedCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedCost() {
        return fixedCost;
    }

    /**
     * Define o valor da propriedade fixedCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedCost(Boolean value) {
        this.fixedCost = value;
    }

    /**
     * Obtém o valor da propriedade height.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeight() {
        return height;
    }

    /**
     * Define o valor da propriedade height.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeight(Boolean value) {
        this.height = value;
    }

    /**
     * Obtém o valor da propriedade hourlyCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHourlyCost() {
        return hourlyCost;
    }

    /**
     * Define o valor da propriedade hourlyCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHourlyCost(Boolean value) {
        this.hourlyCost = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade idlingFuelUsagePerHour.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdlingFuelUsagePerHour() {
        return idlingFuelUsagePerHour;
    }

    /**
     * Define o valor da propriedade idlingFuelUsagePerHour.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdlingFuelUsagePerHour(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isLength() {
        return length;
    }

    /**
     * Define o valor da propriedade length.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLength(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isVariableCost() {
        return variableCost;
    }

    /**
     * Define o valor da propriedade variableCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariableCost(Boolean value) {
        this.variableCost = value;
    }

    /**
     * Obtém o valor da propriedade weight.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeight(Boolean value) {
        this.weight = value;
    }

    /**
     * Obtém o valor da propriedade width.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWidth() {
        return width;
    }

    /**
     * Define o valor da propriedade width.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWidth(Boolean value) {
        this.width = value;
    }

}
