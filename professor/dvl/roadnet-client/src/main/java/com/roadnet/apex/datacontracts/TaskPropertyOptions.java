
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de TaskPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TaskPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AtEligibleLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CancelledTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantitiesReasonCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantitiesReasonCodeOptions" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_LocationDeliveryDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DependentOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncreaseQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemsOptions" type="{http://roadnet.com/apex/DataContracts/}LineItemPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="LocationAccountEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationAlternateContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationEquipmentTypeRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationPriority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationStandardInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManipulationSource_CancelSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OrderCancelReasonCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCancelReasonCodeOptions" type="{http://roadnet.com/apex/DataContracts/}OrderCancelReasonCodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OrderEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantitiesReasonCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantitiesReasonCodeOptions" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="PlannedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PriorityOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesReasonCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesReasonCodeOptions" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="QuantityInputQuality_QuantityInputQuality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantityInputTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteHeaders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantitiesReasonCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantitiesReasonCodeOptions" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="StopCancelReasonCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopCancelReasonCodeOptions" type="{http://roadnet.com/apex/DataContracts/}StopCancelReasonCodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="TaskState_State" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TaskType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_LocationTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskPropertyOptions", propOrder = {
    "additionalServiceTime",
    "atEligibleLocation",
    "cancelledTime",
    "coordinateOverride",
    "damagedQuantities",
    "damagedQuantitiesReasonCode",
    "damagedQuantitiesReasonCodeDescription",
    "damagedQuantitiesReasonCodeOptions",
    "dayOfWeekFlagsLocationDeliveryDays",
    "dependentOn",
    "increaseQuantities",
    "isCancelled",
    "isPrimary",
    "lineItems",
    "lineItemsOptions",
    "locationAccountEntityKey",
    "locationAddress",
    "locationAlternateContact",
    "locationContact",
    "locationCoordinate",
    "locationDescription",
    "locationEntityKey",
    "locationEquipmentTypeRestrictions",
    "locationIdentifier",
    "locationIsDeleted",
    "locationPhoneNumber",
    "locationPriority",
    "locationStandardInstructions",
    "locationType",
    "locationZone",
    "manipulationSourceCancelSource",
    "openCloseOverrides",
    "openCloseOverridesOptions",
    "orderCancelReasonCode",
    "orderCancelReasonCodeOptions",
    "orderEntityKey",
    "overQuantities",
    "overQuantitiesReasonCode",
    "overQuantitiesReasonCodeDescription",
    "overQuantitiesReasonCodeOptions",
    "plannedQuantities",
    "priorityOverride",
    "quantities",
    "quantitiesReasonCode",
    "quantitiesReasonCodeDescription",
    "quantitiesReasonCodeOptions",
    "quantityInputQualityQuantityInputQuality",
    "quantityInputTimestamp",
    "routeHeaders",
    "sequence",
    "serviceWindowOverrides",
    "serviceWindowOverridesOptions",
    "shortQuantities",
    "shortQuantitiesReasonCode",
    "shortQuantitiesReasonCodeDescription",
    "shortQuantitiesReasonCodeOptions",
    "stopCancelReasonCode",
    "stopCancelReasonCodeOptions",
    "taskStateState",
    "taskTypeType",
    "worldTimeZoneLocationTimeZone"
})
public class TaskPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AdditionalServiceTime")
    protected Boolean additionalServiceTime;
    @XmlElement(name = "AtEligibleLocation")
    protected Boolean atEligibleLocation;
    @XmlElement(name = "CancelledTime")
    protected Boolean cancelledTime;
    @XmlElement(name = "CoordinateOverride")
    protected Boolean coordinateOverride;
    @XmlElement(name = "DamagedQuantities")
    protected Boolean damagedQuantities;
    @XmlElement(name = "DamagedQuantitiesReasonCode")
    protected Boolean damagedQuantitiesReasonCode;
    @XmlElement(name = "DamagedQuantitiesReasonCodeDescription")
    protected Boolean damagedQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "DamagedQuantitiesReasonCodeOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCodePropertyOptions> damagedQuantitiesReasonCodeOptions;
    @XmlElement(name = "DayOfWeekFlags_LocationDeliveryDays")
    protected Boolean dayOfWeekFlagsLocationDeliveryDays;
    @XmlElement(name = "DependentOn")
    protected Boolean dependentOn;
    @XmlElement(name = "IncreaseQuantities")
    protected Boolean increaseQuantities;
    @XmlElement(name = "IsCancelled")
    protected Boolean isCancelled;
    @XmlElement(name = "IsPrimary")
    protected Boolean isPrimary;
    @XmlElement(name = "LineItems")
    protected Boolean lineItems;
    @XmlElementRef(name = "LineItemsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LineItemPropertyOptions> lineItemsOptions;
    @XmlElement(name = "LocationAccountEntityKey")
    protected Boolean locationAccountEntityKey;
    @XmlElement(name = "LocationAddress")
    protected Boolean locationAddress;
    @XmlElement(name = "LocationAlternateContact")
    protected Boolean locationAlternateContact;
    @XmlElement(name = "LocationContact")
    protected Boolean locationContact;
    @XmlElement(name = "LocationCoordinate")
    protected Boolean locationCoordinate;
    @XmlElement(name = "LocationDescription")
    protected Boolean locationDescription;
    @XmlElement(name = "LocationEntityKey")
    protected Boolean locationEntityKey;
    @XmlElement(name = "LocationEquipmentTypeRestrictions")
    protected Boolean locationEquipmentTypeRestrictions;
    @XmlElement(name = "LocationIdentifier")
    protected Boolean locationIdentifier;
    @XmlElement(name = "LocationIsDeleted")
    protected Boolean locationIsDeleted;
    @XmlElement(name = "LocationPhoneNumber")
    protected Boolean locationPhoneNumber;
    @XmlElement(name = "LocationPriority")
    protected Boolean locationPriority;
    @XmlElement(name = "LocationStandardInstructions")
    protected Boolean locationStandardInstructions;
    @XmlElement(name = "LocationType")
    protected Boolean locationType;
    @XmlElement(name = "LocationZone")
    protected Boolean locationZone;
    @XmlElement(name = "ManipulationSource_CancelSource")
    protected Boolean manipulationSourceCancelSource;
    @XmlElement(name = "OpenCloseOverrides")
    protected Boolean openCloseOverrides;
    @XmlElementRef(name = "OpenCloseOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> openCloseOverridesOptions;
    @XmlElement(name = "OrderCancelReasonCode")
    protected Boolean orderCancelReasonCode;
    @XmlElementRef(name = "OrderCancelReasonCodeOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderCancelReasonCodePropertyOptions> orderCancelReasonCodeOptions;
    @XmlElement(name = "OrderEntityKey")
    protected Boolean orderEntityKey;
    @XmlElement(name = "OverQuantities")
    protected Boolean overQuantities;
    @XmlElement(name = "OverQuantitiesReasonCode")
    protected Boolean overQuantitiesReasonCode;
    @XmlElement(name = "OverQuantitiesReasonCodeDescription")
    protected Boolean overQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "OverQuantitiesReasonCodeOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCodePropertyOptions> overQuantitiesReasonCodeOptions;
    @XmlElement(name = "PlannedQuantities")
    protected Boolean plannedQuantities;
    @XmlElement(name = "PriorityOverride")
    protected Boolean priorityOverride;
    @XmlElement(name = "Quantities")
    protected Boolean quantities;
    @XmlElement(name = "QuantitiesReasonCode")
    protected Boolean quantitiesReasonCode;
    @XmlElement(name = "QuantitiesReasonCodeDescription")
    protected Boolean quantitiesReasonCodeDescription;
    @XmlElementRef(name = "QuantitiesReasonCodeOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCodePropertyOptions> quantitiesReasonCodeOptions;
    @XmlElement(name = "QuantityInputQuality_QuantityInputQuality")
    protected Boolean quantityInputQualityQuantityInputQuality;
    @XmlElement(name = "QuantityInputTimestamp")
    protected Boolean quantityInputTimestamp;
    @XmlElement(name = "RouteHeaders")
    protected Boolean routeHeaders;
    @XmlElement(name = "Sequence")
    protected Boolean sequence;
    @XmlElement(name = "ServiceWindowOverrides")
    protected Boolean serviceWindowOverrides;
    @XmlElementRef(name = "ServiceWindowOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceWindowDetailPropertyOptions> serviceWindowOverridesOptions;
    @XmlElement(name = "ShortQuantities")
    protected Boolean shortQuantities;
    @XmlElement(name = "ShortQuantitiesReasonCode")
    protected Boolean shortQuantitiesReasonCode;
    @XmlElement(name = "ShortQuantitiesReasonCodeDescription")
    protected Boolean shortQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "ShortQuantitiesReasonCodeOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCodePropertyOptions> shortQuantitiesReasonCodeOptions;
    @XmlElement(name = "StopCancelReasonCode")
    protected Boolean stopCancelReasonCode;
    @XmlElementRef(name = "StopCancelReasonCodeOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StopCancelReasonCodePropertyOptions> stopCancelReasonCodeOptions;
    @XmlElement(name = "TaskState_State")
    protected Boolean taskStateState;
    @XmlElement(name = "TaskType_Type")
    protected Boolean taskTypeType;
    @XmlElement(name = "WorldTimeZone_LocationTimeZone")
    protected Boolean worldTimeZoneLocationTimeZone;

    /**
     * Obtém o valor da propriedade additionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalServiceTime() {
        return additionalServiceTime;
    }

    /**
     * Define o valor da propriedade additionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalServiceTime(Boolean value) {
        this.additionalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade atEligibleLocation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtEligibleLocation() {
        return atEligibleLocation;
    }

    /**
     * Define o valor da propriedade atEligibleLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtEligibleLocation(Boolean value) {
        this.atEligibleLocation = value;
    }

    /**
     * Obtém o valor da propriedade cancelledTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelledTime() {
        return cancelledTime;
    }

    /**
     * Define o valor da propriedade cancelledTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelledTime(Boolean value) {
        this.cancelledTime = value;
    }

    /**
     * Obtém o valor da propriedade coordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoordinateOverride() {
        return coordinateOverride;
    }

    /**
     * Define o valor da propriedade coordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoordinateOverride(Boolean value) {
        this.coordinateOverride = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDamagedQuantities() {
        return damagedQuantities;
    }

    /**
     * Define o valor da propriedade damagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDamagedQuantities(Boolean value) {
        this.damagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDamagedQuantitiesReasonCode() {
        return damagedQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade damagedQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDamagedQuantitiesReasonCode(Boolean value) {
        this.damagedQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDamagedQuantitiesReasonCodeDescription() {
        return damagedQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade damagedQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDamagedQuantitiesReasonCodeDescription(Boolean value) {
        this.damagedQuantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantitiesReasonCodeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCodePropertyOptions> getDamagedQuantitiesReasonCodeOptions() {
        return damagedQuantitiesReasonCodeOptions;
    }

    /**
     * Define o valor da propriedade damagedQuantitiesReasonCodeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public void setDamagedQuantitiesReasonCodeOptions(JAXBElement<QuantityReasonCodePropertyOptions> value) {
        this.damagedQuantitiesReasonCodeOptions = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsLocationDeliveryDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayOfWeekFlagsLocationDeliveryDays() {
        return dayOfWeekFlagsLocationDeliveryDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsLocationDeliveryDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayOfWeekFlagsLocationDeliveryDays(Boolean value) {
        this.dayOfWeekFlagsLocationDeliveryDays = value;
    }

    /**
     * Obtém o valor da propriedade dependentOn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDependentOn() {
        return dependentOn;
    }

    /**
     * Define o valor da propriedade dependentOn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDependentOn(Boolean value) {
        this.dependentOn = value;
    }

    /**
     * Obtém o valor da propriedade increaseQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncreaseQuantities() {
        return increaseQuantities;
    }

    /**
     * Define o valor da propriedade increaseQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncreaseQuantities(Boolean value) {
        this.increaseQuantities = value;
    }

    /**
     * Obtém o valor da propriedade isCancelled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelled() {
        return isCancelled;
    }

    /**
     * Define o valor da propriedade isCancelled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelled(Boolean value) {
        this.isCancelled = value;
    }

    /**
     * Obtém o valor da propriedade isPrimary.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimary() {
        return isPrimary;
    }

    /**
     * Define o valor da propriedade isPrimary.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimary(Boolean value) {
        this.isPrimary = value;
    }

    /**
     * Obtém o valor da propriedade lineItems.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItems() {
        return lineItems;
    }

    /**
     * Define o valor da propriedade lineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItems(Boolean value) {
        this.lineItems = value;
    }

    /**
     * Obtém o valor da propriedade lineItemsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineItemPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<LineItemPropertyOptions> getLineItemsOptions() {
        return lineItemsOptions;
    }

    /**
     * Define o valor da propriedade lineItemsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineItemPropertyOptions }{@code >}
     *     
     */
    public void setLineItemsOptions(JAXBElement<LineItemPropertyOptions> value) {
        this.lineItemsOptions = value;
    }

    /**
     * Obtém o valor da propriedade locationAccountEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationAccountEntityKey() {
        return locationAccountEntityKey;
    }

    /**
     * Define o valor da propriedade locationAccountEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationAccountEntityKey(Boolean value) {
        this.locationAccountEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationAddress() {
        return locationAddress;
    }

    /**
     * Define o valor da propriedade locationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationAddress(Boolean value) {
        this.locationAddress = value;
    }

    /**
     * Obtém o valor da propriedade locationAlternateContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationAlternateContact() {
        return locationAlternateContact;
    }

    /**
     * Define o valor da propriedade locationAlternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationAlternateContact(Boolean value) {
        this.locationAlternateContact = value;
    }

    /**
     * Obtém o valor da propriedade locationContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationContact() {
        return locationContact;
    }

    /**
     * Define o valor da propriedade locationContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationContact(Boolean value) {
        this.locationContact = value;
    }

    /**
     * Obtém o valor da propriedade locationCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationCoordinate() {
        return locationCoordinate;
    }

    /**
     * Define o valor da propriedade locationCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationCoordinate(Boolean value) {
        this.locationCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade locationDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationDescription() {
        return locationDescription;
    }

    /**
     * Define o valor da propriedade locationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationDescription(Boolean value) {
        this.locationDescription = value;
    }

    /**
     * Obtém o valor da propriedade locationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationEntityKey() {
        return locationEntityKey;
    }

    /**
     * Define o valor da propriedade locationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationEntityKey(Boolean value) {
        this.locationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationEquipmentTypeRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationEquipmentTypeRestrictions() {
        return locationEquipmentTypeRestrictions;
    }

    /**
     * Define o valor da propriedade locationEquipmentTypeRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationEquipmentTypeRestrictions(Boolean value) {
        this.locationEquipmentTypeRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade locationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Define o valor da propriedade locationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationIdentifier(Boolean value) {
        this.locationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade locationIsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationIsDeleted() {
        return locationIsDeleted;
    }

    /**
     * Define o valor da propriedade locationIsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationIsDeleted(Boolean value) {
        this.locationIsDeleted = value;
    }

    /**
     * Obtém o valor da propriedade locationPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationPhoneNumber() {
        return locationPhoneNumber;
    }

    /**
     * Define o valor da propriedade locationPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationPhoneNumber(Boolean value) {
        this.locationPhoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade locationPriority.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationPriority() {
        return locationPriority;
    }

    /**
     * Define o valor da propriedade locationPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationPriority(Boolean value) {
        this.locationPriority = value;
    }

    /**
     * Obtém o valor da propriedade locationStandardInstructions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationStandardInstructions() {
        return locationStandardInstructions;
    }

    /**
     * Define o valor da propriedade locationStandardInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationStandardInstructions(Boolean value) {
        this.locationStandardInstructions = value;
    }

    /**
     * Obtém o valor da propriedade locationType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationType() {
        return locationType;
    }

    /**
     * Define o valor da propriedade locationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationType(Boolean value) {
        this.locationType = value;
    }

    /**
     * Obtém o valor da propriedade locationZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationZone() {
        return locationZone;
    }

    /**
     * Define o valor da propriedade locationZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationZone(Boolean value) {
        this.locationZone = value;
    }

    /**
     * Obtém o valor da propriedade manipulationSourceCancelSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManipulationSourceCancelSource() {
        return manipulationSourceCancelSource;
    }

    /**
     * Define o valor da propriedade manipulationSourceCancelSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManipulationSourceCancelSource(Boolean value) {
        this.manipulationSourceCancelSource = value;
    }

    /**
     * Obtém o valor da propriedade openCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenCloseOverrides() {
        return openCloseOverrides;
    }

    /**
     * Define o valor da propriedade openCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenCloseOverrides(Boolean value) {
        this.openCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade openCloseOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpenCloseDetailPropertyOptions> getOpenCloseOverridesOptions() {
        return openCloseOverridesOptions;
    }

    /**
     * Define o valor da propriedade openCloseOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setOpenCloseOverridesOptions(JAXBElement<OpenCloseDetailPropertyOptions> value) {
        this.openCloseOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade orderCancelReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCancelReasonCode() {
        return orderCancelReasonCode;
    }

    /**
     * Define o valor da propriedade orderCancelReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCancelReasonCode(Boolean value) {
        this.orderCancelReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade orderCancelReasonCodeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderCancelReasonCodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OrderCancelReasonCodePropertyOptions> getOrderCancelReasonCodeOptions() {
        return orderCancelReasonCodeOptions;
    }

    /**
     * Define o valor da propriedade orderCancelReasonCodeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderCancelReasonCodePropertyOptions }{@code >}
     *     
     */
    public void setOrderCancelReasonCodeOptions(JAXBElement<OrderCancelReasonCodePropertyOptions> value) {
        this.orderCancelReasonCodeOptions = value;
    }

    /**
     * Obtém o valor da propriedade orderEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderEntityKey() {
        return orderEntityKey;
    }

    /**
     * Define o valor da propriedade orderEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderEntityKey(Boolean value) {
        this.orderEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade overQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverQuantities() {
        return overQuantities;
    }

    /**
     * Define o valor da propriedade overQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverQuantities(Boolean value) {
        this.overQuantities = value;
    }

    /**
     * Obtém o valor da propriedade overQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverQuantitiesReasonCode() {
        return overQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade overQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverQuantitiesReasonCode(Boolean value) {
        this.overQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade overQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverQuantitiesReasonCodeDescription() {
        return overQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade overQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverQuantitiesReasonCodeDescription(Boolean value) {
        this.overQuantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade overQuantitiesReasonCodeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCodePropertyOptions> getOverQuantitiesReasonCodeOptions() {
        return overQuantitiesReasonCodeOptions;
    }

    /**
     * Define o valor da propriedade overQuantitiesReasonCodeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public void setOverQuantitiesReasonCodeOptions(JAXBElement<QuantityReasonCodePropertyOptions> value) {
        this.overQuantitiesReasonCodeOptions = value;
    }

    /**
     * Obtém o valor da propriedade plannedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedQuantities() {
        return plannedQuantities;
    }

    /**
     * Define o valor da propriedade plannedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedQuantities(Boolean value) {
        this.plannedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade priorityOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriorityOverride() {
        return priorityOverride;
    }

    /**
     * Define o valor da propriedade priorityOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriorityOverride(Boolean value) {
        this.priorityOverride = value;
    }

    /**
     * Obtém o valor da propriedade quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantities() {
        return quantities;
    }

    /**
     * Define o valor da propriedade quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantities(Boolean value) {
        this.quantities = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesReasonCode() {
        return quantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade quantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesReasonCode(Boolean value) {
        this.quantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesReasonCodeDescription() {
        return quantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade quantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesReasonCodeDescription(Boolean value) {
        this.quantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesReasonCodeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCodePropertyOptions> getQuantitiesReasonCodeOptions() {
        return quantitiesReasonCodeOptions;
    }

    /**
     * Define o valor da propriedade quantitiesReasonCodeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public void setQuantitiesReasonCodeOptions(JAXBElement<QuantityReasonCodePropertyOptions> value) {
        this.quantitiesReasonCodeOptions = value;
    }

    /**
     * Obtém o valor da propriedade quantityInputQualityQuantityInputQuality.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityInputQualityQuantityInputQuality() {
        return quantityInputQualityQuantityInputQuality;
    }

    /**
     * Define o valor da propriedade quantityInputQualityQuantityInputQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityInputQualityQuantityInputQuality(Boolean value) {
        this.quantityInputQualityQuantityInputQuality = value;
    }

    /**
     * Obtém o valor da propriedade quantityInputTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityInputTimestamp() {
        return quantityInputTimestamp;
    }

    /**
     * Define o valor da propriedade quantityInputTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityInputTimestamp(Boolean value) {
        this.quantityInputTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade routeHeaders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteHeaders() {
        return routeHeaders;
    }

    /**
     * Define o valor da propriedade routeHeaders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteHeaders(Boolean value) {
        this.routeHeaders = value;
    }

    /**
     * Obtém o valor da propriedade sequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSequence() {
        return sequence;
    }

    /**
     * Define o valor da propriedade sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSequence(Boolean value) {
        this.sequence = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceWindowOverrides() {
        return serviceWindowOverrides;
    }

    /**
     * Define o valor da propriedade serviceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceWindowOverrides(Boolean value) {
        this.serviceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceWindowDetailPropertyOptions> getServiceWindowOverridesOptions() {
        return serviceWindowOverridesOptions;
    }

    /**
     * Define o valor da propriedade serviceWindowOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceWindowOverridesOptions(JAXBElement<ServiceWindowDetailPropertyOptions> value) {
        this.serviceWindowOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortQuantities() {
        return shortQuantities;
    }

    /**
     * Define o valor da propriedade shortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortQuantities(Boolean value) {
        this.shortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortQuantitiesReasonCode() {
        return shortQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade shortQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortQuantitiesReasonCode(Boolean value) {
        this.shortQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortQuantitiesReasonCodeDescription() {
        return shortQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade shortQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortQuantitiesReasonCodeDescription(Boolean value) {
        this.shortQuantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantitiesReasonCodeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCodePropertyOptions> getShortQuantitiesReasonCodeOptions() {
        return shortQuantitiesReasonCodeOptions;
    }

    /**
     * Define o valor da propriedade shortQuantitiesReasonCodeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public void setShortQuantitiesReasonCodeOptions(JAXBElement<QuantityReasonCodePropertyOptions> value) {
        this.shortQuantitiesReasonCodeOptions = value;
    }

    /**
     * Obtém o valor da propriedade stopCancelReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopCancelReasonCode() {
        return stopCancelReasonCode;
    }

    /**
     * Define o valor da propriedade stopCancelReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopCancelReasonCode(Boolean value) {
        this.stopCancelReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade stopCancelReasonCodeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopCancelReasonCodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<StopCancelReasonCodePropertyOptions> getStopCancelReasonCodeOptions() {
        return stopCancelReasonCodeOptions;
    }

    /**
     * Define o valor da propriedade stopCancelReasonCodeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopCancelReasonCodePropertyOptions }{@code >}
     *     
     */
    public void setStopCancelReasonCodeOptions(JAXBElement<StopCancelReasonCodePropertyOptions> value) {
        this.stopCancelReasonCodeOptions = value;
    }

    /**
     * Obtém o valor da propriedade taskStateState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaskStateState() {
        return taskStateState;
    }

    /**
     * Define o valor da propriedade taskStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaskStateState(Boolean value) {
        this.taskStateState = value;
    }

    /**
     * Obtém o valor da propriedade taskTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaskTypeType() {
        return taskTypeType;
    }

    /**
     * Define o valor da propriedade taskTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaskTypeType(Boolean value) {
        this.taskTypeType = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneLocationTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneLocationTimeZone() {
        return worldTimeZoneLocationTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneLocationTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneLocationTimeZone(Boolean value) {
        this.worldTimeZoneLocationTimeZone = value;
    }

}
