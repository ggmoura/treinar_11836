
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UnassignedOrderGroupPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UnassignedOrderGroupPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_LocationDeliveryDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasPriorityOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastAutonomousPlacementAttemptTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastAutonomousPlacementManipulationError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationAlternateContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationPriority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationStandardInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManagedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxUrgency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfAutonomousPlacementAttempts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseDetailsOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderClasses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderHeaders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderIdentifiers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderSpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProductTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteConstraintFlags_LastAutonomousPlacementAttemptConstraintsEncountered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Selectors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCustomProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEquipmentTypeRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetailsOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="SessionDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionMode_SessionMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalFixedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalVariableServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelectors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnassignedOrderGroupPropertyOptions", propOrder = {
    "beginDate",
    "coordinate",
    "coordinateOverride",
    "dayOfWeekFlagsLocationDeliveryDays",
    "endDate",
    "hasPriorityOverride",
    "lastAutonomousPlacementAttemptTime",
    "lastAutonomousPlacementManipulationError",
    "location",
    "locationAddress",
    "locationAlternateContact",
    "locationContact",
    "locationDescription",
    "locationEntityKey",
    "locationIdentifier",
    "locationIsDeleted",
    "locationPriority",
    "locationStandardInstructions",
    "locationType",
    "locationVersion",
    "locationZone",
    "managedByUserEntityKey",
    "maxUrgency",
    "netRevenue",
    "numberOfAutonomousPlacementAttempts",
    "numberOfOrders",
    "openCloseDetails",
    "openCloseDetailsOptions",
    "openCloseOverride",
    "orderClasses",
    "orderEntityKeys",
    "orderHeaders",
    "orderIdentifiers",
    "orderSpecialInstructions",
    "plannedTotalDeliveryCategory1Quantities",
    "plannedTotalDeliveryCategory2Quantities",
    "plannedTotalDeliveryCategory3Quantities",
    "plannedTotalPickupCategory1Quantities",
    "plannedTotalPickupCategory2Quantities",
    "plannedTotalPickupCategory3Quantities",
    "priority",
    "productTypes",
    "routeConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered",
    "selectors",
    "serviceLocationCustomProperties",
    "serviceLocationEquipmentTypeRestrictions",
    "serviceWindowDetails",
    "serviceWindowDetailsOptions",
    "sessionDate",
    "sessionDescription",
    "sessionEntityKey",
    "sessionModeSessionMode",
    "totalDeliveryQuantities",
    "totalFee",
    "totalFixedServiceTime",
    "totalPickupQuantities",
    "totalServiceTime",
    "totalVariableServiceTime",
    "uploadSelectors"
})
public class UnassignedOrderGroupPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "BeginDate")
    protected Boolean beginDate;
    @XmlElement(name = "Coordinate")
    protected Boolean coordinate;
    @XmlElement(name = "CoordinateOverride")
    protected Boolean coordinateOverride;
    @XmlElement(name = "DayOfWeekFlags_LocationDeliveryDays")
    protected Boolean dayOfWeekFlagsLocationDeliveryDays;
    @XmlElement(name = "EndDate")
    protected Boolean endDate;
    @XmlElement(name = "HasPriorityOverride")
    protected Boolean hasPriorityOverride;
    @XmlElement(name = "LastAutonomousPlacementAttemptTime")
    protected Boolean lastAutonomousPlacementAttemptTime;
    @XmlElement(name = "LastAutonomousPlacementManipulationError")
    protected Boolean lastAutonomousPlacementManipulationError;
    @XmlElement(name = "Location")
    protected Boolean location;
    @XmlElement(name = "LocationAddress")
    protected Boolean locationAddress;
    @XmlElement(name = "LocationAlternateContact")
    protected Boolean locationAlternateContact;
    @XmlElement(name = "LocationContact")
    protected Boolean locationContact;
    @XmlElement(name = "LocationDescription")
    protected Boolean locationDescription;
    @XmlElement(name = "LocationEntityKey")
    protected Boolean locationEntityKey;
    @XmlElement(name = "LocationIdentifier")
    protected Boolean locationIdentifier;
    @XmlElement(name = "LocationIsDeleted")
    protected Boolean locationIsDeleted;
    @XmlElement(name = "LocationPriority")
    protected Boolean locationPriority;
    @XmlElement(name = "LocationStandardInstructions")
    protected Boolean locationStandardInstructions;
    @XmlElement(name = "LocationType")
    protected Boolean locationType;
    @XmlElement(name = "LocationVersion")
    protected Boolean locationVersion;
    @XmlElement(name = "LocationZone")
    protected Boolean locationZone;
    @XmlElement(name = "ManagedByUserEntityKey")
    protected Boolean managedByUserEntityKey;
    @XmlElement(name = "MaxUrgency")
    protected Boolean maxUrgency;
    @XmlElement(name = "NetRevenue")
    protected Boolean netRevenue;
    @XmlElement(name = "NumberOfAutonomousPlacementAttempts")
    protected Boolean numberOfAutonomousPlacementAttempts;
    @XmlElement(name = "NumberOfOrders")
    protected Boolean numberOfOrders;
    @XmlElement(name = "OpenCloseDetails")
    protected Boolean openCloseDetails;
    @XmlElementRef(name = "OpenCloseDetailsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> openCloseDetailsOptions;
    @XmlElement(name = "OpenCloseOverride")
    protected Boolean openCloseOverride;
    @XmlElement(name = "OrderClasses")
    protected Boolean orderClasses;
    @XmlElement(name = "OrderEntityKeys")
    protected Boolean orderEntityKeys;
    @XmlElement(name = "OrderHeaders")
    protected Boolean orderHeaders;
    @XmlElement(name = "OrderIdentifiers")
    protected Boolean orderIdentifiers;
    @XmlElement(name = "OrderSpecialInstructions")
    protected Boolean orderSpecialInstructions;
    @XmlElement(name = "PlannedTotalDeliveryCategory1Quantities")
    protected Boolean plannedTotalDeliveryCategory1Quantities;
    @XmlElement(name = "PlannedTotalDeliveryCategory2Quantities")
    protected Boolean plannedTotalDeliveryCategory2Quantities;
    @XmlElement(name = "PlannedTotalDeliveryCategory3Quantities")
    protected Boolean plannedTotalDeliveryCategory3Quantities;
    @XmlElement(name = "PlannedTotalPickupCategory1Quantities")
    protected Boolean plannedTotalPickupCategory1Quantities;
    @XmlElement(name = "PlannedTotalPickupCategory2Quantities")
    protected Boolean plannedTotalPickupCategory2Quantities;
    @XmlElement(name = "PlannedTotalPickupCategory3Quantities")
    protected Boolean plannedTotalPickupCategory3Quantities;
    @XmlElement(name = "Priority")
    protected Boolean priority;
    @XmlElement(name = "ProductTypes")
    protected Boolean productTypes;
    @XmlElement(name = "RouteConstraintFlags_LastAutonomousPlacementAttemptConstraintsEncountered")
    protected Boolean routeConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered;
    @XmlElement(name = "Selectors")
    protected Boolean selectors;
    @XmlElement(name = "ServiceLocationCustomProperties")
    protected Boolean serviceLocationCustomProperties;
    @XmlElement(name = "ServiceLocationEquipmentTypeRestrictions")
    protected Boolean serviceLocationEquipmentTypeRestrictions;
    @XmlElement(name = "ServiceWindowDetails")
    protected Boolean serviceWindowDetails;
    @XmlElementRef(name = "ServiceWindowDetailsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceWindowDetailPropertyOptions> serviceWindowDetailsOptions;
    @XmlElement(name = "SessionDate")
    protected Boolean sessionDate;
    @XmlElement(name = "SessionDescription")
    protected Boolean sessionDescription;
    @XmlElement(name = "SessionEntityKey")
    protected Boolean sessionEntityKey;
    @XmlElement(name = "SessionMode_SessionMode")
    protected Boolean sessionModeSessionMode;
    @XmlElement(name = "TotalDeliveryQuantities")
    protected Boolean totalDeliveryQuantities;
    @XmlElement(name = "TotalFee")
    protected Boolean totalFee;
    @XmlElement(name = "TotalFixedServiceTime")
    protected Boolean totalFixedServiceTime;
    @XmlElement(name = "TotalPickupQuantities")
    protected Boolean totalPickupQuantities;
    @XmlElement(name = "TotalServiceTime")
    protected Boolean totalServiceTime;
    @XmlElement(name = "TotalVariableServiceTime")
    protected Boolean totalVariableServiceTime;
    @XmlElement(name = "UploadSelectors")
    protected Boolean uploadSelectors;

    /**
     * Obtém o valor da propriedade beginDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeginDate() {
        return beginDate;
    }

    /**
     * Define o valor da propriedade beginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeginDate(Boolean value) {
        this.beginDate = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoordinate(Boolean value) {
        this.coordinate = value;
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
     * Obtém o valor da propriedade endDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndDate() {
        return endDate;
    }

    /**
     * Define o valor da propriedade endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndDate(Boolean value) {
        this.endDate = value;
    }

    /**
     * Obtém o valor da propriedade hasPriorityOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPriorityOverride() {
        return hasPriorityOverride;
    }

    /**
     * Define o valor da propriedade hasPriorityOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPriorityOverride(Boolean value) {
        this.hasPriorityOverride = value;
    }

    /**
     * Obtém o valor da propriedade lastAutonomousPlacementAttemptTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastAutonomousPlacementAttemptTime() {
        return lastAutonomousPlacementAttemptTime;
    }

    /**
     * Define o valor da propriedade lastAutonomousPlacementAttemptTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastAutonomousPlacementAttemptTime(Boolean value) {
        this.lastAutonomousPlacementAttemptTime = value;
    }

    /**
     * Obtém o valor da propriedade lastAutonomousPlacementManipulationError.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastAutonomousPlacementManipulationError() {
        return lastAutonomousPlacementManipulationError;
    }

    /**
     * Define o valor da propriedade lastAutonomousPlacementManipulationError.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastAutonomousPlacementManipulationError(Boolean value) {
        this.lastAutonomousPlacementManipulationError = value;
    }

    /**
     * Obtém o valor da propriedade location.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocation() {
        return location;
    }

    /**
     * Define o valor da propriedade location.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocation(Boolean value) {
        this.location = value;
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
     * Obtém o valor da propriedade locationVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationVersion() {
        return locationVersion;
    }

    /**
     * Define o valor da propriedade locationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationVersion(Boolean value) {
        this.locationVersion = value;
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
     * Obtém o valor da propriedade managedByUserEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManagedByUserEntityKey() {
        return managedByUserEntityKey;
    }

    /**
     * Define o valor da propriedade managedByUserEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagedByUserEntityKey(Boolean value) {
        this.managedByUserEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade maxUrgency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxUrgency() {
        return maxUrgency;
    }

    /**
     * Define o valor da propriedade maxUrgency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxUrgency(Boolean value) {
        this.maxUrgency = value;
    }

    /**
     * Obtém o valor da propriedade netRevenue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetRevenue() {
        return netRevenue;
    }

    /**
     * Define o valor da propriedade netRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetRevenue(Boolean value) {
        this.netRevenue = value;
    }

    /**
     * Obtém o valor da propriedade numberOfAutonomousPlacementAttempts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfAutonomousPlacementAttempts() {
        return numberOfAutonomousPlacementAttempts;
    }

    /**
     * Define o valor da propriedade numberOfAutonomousPlacementAttempts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfAutonomousPlacementAttempts(Boolean value) {
        this.numberOfAutonomousPlacementAttempts = value;
    }

    /**
     * Obtém o valor da propriedade numberOfOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfOrders() {
        return numberOfOrders;
    }

    /**
     * Define o valor da propriedade numberOfOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfOrders(Boolean value) {
        this.numberOfOrders = value;
    }

    /**
     * Obtém o valor da propriedade openCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenCloseDetails() {
        return openCloseDetails;
    }

    /**
     * Define o valor da propriedade openCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenCloseDetails(Boolean value) {
        this.openCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade openCloseDetailsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpenCloseDetailPropertyOptions> getOpenCloseDetailsOptions() {
        return openCloseDetailsOptions;
    }

    /**
     * Define o valor da propriedade openCloseDetailsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setOpenCloseDetailsOptions(JAXBElement<OpenCloseDetailPropertyOptions> value) {
        this.openCloseDetailsOptions = value;
    }

    /**
     * Obtém o valor da propriedade openCloseOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenCloseOverride() {
        return openCloseOverride;
    }

    /**
     * Define o valor da propriedade openCloseOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenCloseOverride(Boolean value) {
        this.openCloseOverride = value;
    }

    /**
     * Obtém o valor da propriedade orderClasses.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderClasses() {
        return orderClasses;
    }

    /**
     * Define o valor da propriedade orderClasses.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderClasses(Boolean value) {
        this.orderClasses = value;
    }

    /**
     * Obtém o valor da propriedade orderEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderEntityKeys() {
        return orderEntityKeys;
    }

    /**
     * Define o valor da propriedade orderEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderEntityKeys(Boolean value) {
        this.orderEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade orderHeaders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderHeaders() {
        return orderHeaders;
    }

    /**
     * Define o valor da propriedade orderHeaders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderHeaders(Boolean value) {
        this.orderHeaders = value;
    }

    /**
     * Obtém o valor da propriedade orderIdentifiers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderIdentifiers() {
        return orderIdentifiers;
    }

    /**
     * Define o valor da propriedade orderIdentifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderIdentifiers(Boolean value) {
        this.orderIdentifiers = value;
    }

    /**
     * Obtém o valor da propriedade orderSpecialInstructions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderSpecialInstructions() {
        return orderSpecialInstructions;
    }

    /**
     * Define o valor da propriedade orderSpecialInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderSpecialInstructions(Boolean value) {
        this.orderSpecialInstructions = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalDeliveryCategory1Quantities() {
        return plannedTotalDeliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalDeliveryCategory1Quantities(Boolean value) {
        this.plannedTotalDeliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalDeliveryCategory2Quantities() {
        return plannedTotalDeliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalDeliveryCategory2Quantities(Boolean value) {
        this.plannedTotalDeliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalDeliveryCategory3Quantities() {
        return plannedTotalDeliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalDeliveryCategory3Quantities(Boolean value) {
        this.plannedTotalDeliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalPickupCategory1Quantities() {
        return plannedTotalPickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalPickupCategory1Quantities(Boolean value) {
        this.plannedTotalPickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalPickupCategory2Quantities() {
        return plannedTotalPickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalPickupCategory2Quantities(Boolean value) {
        this.plannedTotalPickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedTotalPickupCategory3Quantities() {
        return plannedTotalPickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedTotalPickupCategory3Quantities(Boolean value) {
        this.plannedTotalPickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriority(Boolean value) {
        this.priority = value;
    }

    /**
     * Obtém o valor da propriedade productTypes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductTypes() {
        return productTypes;
    }

    /**
     * Define o valor da propriedade productTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductTypes(Boolean value) {
        this.productTypes = value;
    }

    /**
     * Obtém o valor da propriedade routeConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered() {
        return routeConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered;
    }

    /**
     * Define o valor da propriedade routeConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered(Boolean value) {
        this.routeConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered = value;
    }

    /**
     * Obtém o valor da propriedade selectors.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectors() {
        return selectors;
    }

    /**
     * Define o valor da propriedade selectors.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectors(Boolean value) {
        this.selectors = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationCustomProperties() {
        return serviceLocationCustomProperties;
    }

    /**
     * Define o valor da propriedade serviceLocationCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationCustomProperties(Boolean value) {
        this.serviceLocationCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationEquipmentTypeRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationEquipmentTypeRestrictions() {
        return serviceLocationEquipmentTypeRestrictions;
    }

    /**
     * Define o valor da propriedade serviceLocationEquipmentTypeRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationEquipmentTypeRestrictions(Boolean value) {
        this.serviceLocationEquipmentTypeRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceWindowDetails() {
        return serviceWindowDetails;
    }

    /**
     * Define o valor da propriedade serviceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceWindowDetails(Boolean value) {
        this.serviceWindowDetails = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetailsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceWindowDetailPropertyOptions> getServiceWindowDetailsOptions() {
        return serviceWindowDetailsOptions;
    }

    /**
     * Define o valor da propriedade serviceWindowDetailsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceWindowDetailsOptions(JAXBElement<ServiceWindowDetailPropertyOptions> value) {
        this.serviceWindowDetailsOptions = value;
    }

    /**
     * Obtém o valor da propriedade sessionDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionDate() {
        return sessionDate;
    }

    /**
     * Define o valor da propriedade sessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionDate(Boolean value) {
        this.sessionDate = value;
    }

    /**
     * Obtém o valor da propriedade sessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionDescription() {
        return sessionDescription;
    }

    /**
     * Define o valor da propriedade sessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionDescription(Boolean value) {
        this.sessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionEntityKey(Boolean value) {
        this.sessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sessionModeSessionMode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionModeSessionMode() {
        return sessionModeSessionMode;
    }

    /**
     * Define o valor da propriedade sessionModeSessionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionModeSessionMode(Boolean value) {
        this.sessionModeSessionMode = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDeliveryQuantities() {
        return totalDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade totalDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDeliveryQuantities(Boolean value) {
        this.totalDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalFee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalFee() {
        return totalFee;
    }

    /**
     * Define o valor da propriedade totalFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalFee(Boolean value) {
        this.totalFee = value;
    }

    /**
     * Obtém o valor da propriedade totalFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalFixedServiceTime() {
        return totalFixedServiceTime;
    }

    /**
     * Define o valor da propriedade totalFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalFixedServiceTime(Boolean value) {
        this.totalFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalPickupQuantities() {
        return totalPickupQuantities;
    }

    /**
     * Define o valor da propriedade totalPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalPickupQuantities(Boolean value) {
        this.totalPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalServiceTime() {
        return totalServiceTime;
    }

    /**
     * Define o valor da propriedade totalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalServiceTime(Boolean value) {
        this.totalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalVariableServiceTime() {
        return totalVariableServiceTime;
    }

    /**
     * Define o valor da propriedade totalVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalVariableServiceTime(Boolean value) {
        this.totalVariableServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade uploadSelectors.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUploadSelectors() {
        return uploadSelectors;
    }

    /**
     * Define o valor da propriedade uploadSelectors.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUploadSelectors(Boolean value) {
        this.uploadSelectors = value;
    }

}
