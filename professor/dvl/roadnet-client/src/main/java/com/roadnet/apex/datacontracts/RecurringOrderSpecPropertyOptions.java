
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de RecurringOrderSpecPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RecurringOrderSpecPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AnchorDaysRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AnchorWeeksRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentServicePatternEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CycleNumberOfTimeUnits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CycleTimeUnitType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsConsideredForAssignDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxDaysServiceGap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinDaysServiceGap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfDaysToShift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousDeliveryWeeks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousOriginId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTerritoryIds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousVisitDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousWeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecurringOrderInstance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequiredDestinationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequiredOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Selector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldConsiderPreviousVisit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorWeeks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringOrderSpecPropertyOptions", propOrder = {
    "additionalServiceTime",
    "anchorDaysRange",
    "anchorWeeksRange",
    "coordinateOverride",
    "currentServicePatternEntityKey",
    "cycleNumberOfTimeUnits",
    "cycleTimeUnitType",
    "deliveryQuantities",
    "forceBulkServiceTime",
    "identifier",
    "isConsideredForAssignDays",
    "lineItems",
    "maxDaysServiceGap",
    "minDaysServiceGap",
    "numberOfDaysToShift",
    "openCloseOverrides",
    "openCloseOverridesOptions",
    "orderClassEntityKey",
    "pickupQuantities",
    "previousDays",
    "previousDeliveryWeeks",
    "previousOriginId",
    "previousTerritoryIds",
    "previousVisitDate",
    "previousWeek",
    "quantities",
    "recurringOrderInstance",
    "regionEntityKey",
    "requiredDestinationEntityKey",
    "requiredOriginEntityKey",
    "selector",
    "serviceLocationEntityKey",
    "servicePatternSetEntityKey",
    "serviceWindowOverrides",
    "serviceWindowOverridesOptions",
    "sessionEntityKey",
    "shouldConsiderPreviousVisit",
    "shouldUseAnchorDays",
    "shouldUseAnchorWeeks",
    "territoryEntityKeys",
    "uploadSelector"
})
public class RecurringOrderSpecPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AdditionalServiceTime")
    protected Boolean additionalServiceTime;
    @XmlElement(name = "AnchorDaysRange")
    protected Boolean anchorDaysRange;
    @XmlElement(name = "AnchorWeeksRange")
    protected Boolean anchorWeeksRange;
    @XmlElement(name = "CoordinateOverride")
    protected Boolean coordinateOverride;
    @XmlElement(name = "CurrentServicePatternEntityKey")
    protected Boolean currentServicePatternEntityKey;
    @XmlElement(name = "CycleNumberOfTimeUnits")
    protected Boolean cycleNumberOfTimeUnits;
    @XmlElement(name = "CycleTimeUnitType")
    protected Boolean cycleTimeUnitType;
    @XmlElement(name = "DeliveryQuantities")
    protected Boolean deliveryQuantities;
    @XmlElement(name = "ForceBulkServiceTime")
    protected Boolean forceBulkServiceTime;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsConsideredForAssignDays")
    protected Boolean isConsideredForAssignDays;
    @XmlElement(name = "LineItems")
    protected Boolean lineItems;
    @XmlElement(name = "MaxDaysServiceGap")
    protected Boolean maxDaysServiceGap;
    @XmlElement(name = "MinDaysServiceGap")
    protected Boolean minDaysServiceGap;
    @XmlElement(name = "NumberOfDaysToShift")
    protected Boolean numberOfDaysToShift;
    @XmlElement(name = "OpenCloseOverrides")
    protected Boolean openCloseOverrides;
    @XmlElementRef(name = "OpenCloseOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> openCloseOverridesOptions;
    @XmlElement(name = "OrderClassEntityKey")
    protected Boolean orderClassEntityKey;
    @XmlElement(name = "PickupQuantities")
    protected Boolean pickupQuantities;
    @XmlElement(name = "PreviousDays")
    protected Boolean previousDays;
    @XmlElement(name = "PreviousDeliveryWeeks")
    protected Boolean previousDeliveryWeeks;
    @XmlElement(name = "PreviousOriginId")
    protected Boolean previousOriginId;
    @XmlElement(name = "PreviousTerritoryIds")
    protected Boolean previousTerritoryIds;
    @XmlElement(name = "PreviousVisitDate")
    protected Boolean previousVisitDate;
    @XmlElement(name = "PreviousWeek")
    protected Boolean previousWeek;
    @XmlElement(name = "Quantities")
    protected Boolean quantities;
    @XmlElement(name = "RecurringOrderInstance")
    protected Boolean recurringOrderInstance;
    @XmlElement(name = "RegionEntityKey")
    protected Boolean regionEntityKey;
    @XmlElement(name = "RequiredDestinationEntityKey")
    protected Boolean requiredDestinationEntityKey;
    @XmlElement(name = "RequiredOriginEntityKey")
    protected Boolean requiredOriginEntityKey;
    @XmlElement(name = "Selector")
    protected Boolean selector;
    @XmlElement(name = "ServiceLocationEntityKey")
    protected Boolean serviceLocationEntityKey;
    @XmlElement(name = "ServicePatternSetEntityKey")
    protected Boolean servicePatternSetEntityKey;
    @XmlElement(name = "ServiceWindowOverrides")
    protected Boolean serviceWindowOverrides;
    @XmlElementRef(name = "ServiceWindowOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceWindowDetailPropertyOptions> serviceWindowOverridesOptions;
    @XmlElement(name = "SessionEntityKey")
    protected Boolean sessionEntityKey;
    @XmlElement(name = "ShouldConsiderPreviousVisit")
    protected Boolean shouldConsiderPreviousVisit;
    @XmlElement(name = "ShouldUseAnchorDays")
    protected Boolean shouldUseAnchorDays;
    @XmlElement(name = "ShouldUseAnchorWeeks")
    protected Boolean shouldUseAnchorWeeks;
    @XmlElement(name = "TerritoryEntityKeys")
    protected Boolean territoryEntityKeys;
    @XmlElement(name = "UploadSelector")
    protected Boolean uploadSelector;

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
     * Obtém o valor da propriedade anchorDaysRange.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnchorDaysRange() {
        return anchorDaysRange;
    }

    /**
     * Define o valor da propriedade anchorDaysRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnchorDaysRange(Boolean value) {
        this.anchorDaysRange = value;
    }

    /**
     * Obtém o valor da propriedade anchorWeeksRange.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnchorWeeksRange() {
        return anchorWeeksRange;
    }

    /**
     * Define o valor da propriedade anchorWeeksRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnchorWeeksRange(Boolean value) {
        this.anchorWeeksRange = value;
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
     * Obtém o valor da propriedade currentServicePatternEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentServicePatternEntityKey() {
        return currentServicePatternEntityKey;
    }

    /**
     * Define o valor da propriedade currentServicePatternEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentServicePatternEntityKey(Boolean value) {
        this.currentServicePatternEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade cycleNumberOfTimeUnits.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCycleNumberOfTimeUnits() {
        return cycleNumberOfTimeUnits;
    }

    /**
     * Define o valor da propriedade cycleNumberOfTimeUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCycleNumberOfTimeUnits(Boolean value) {
        this.cycleNumberOfTimeUnits = value;
    }

    /**
     * Obtém o valor da propriedade cycleTimeUnitType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCycleTimeUnitType() {
        return cycleTimeUnitType;
    }

    /**
     * Define o valor da propriedade cycleTimeUnitType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCycleTimeUnitType(Boolean value) {
        this.cycleTimeUnitType = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryQuantities() {
        return deliveryQuantities;
    }

    /**
     * Define o valor da propriedade deliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryQuantities(Boolean value) {
        this.deliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade forceBulkServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceBulkServiceTime() {
        return forceBulkServiceTime;
    }

    /**
     * Define o valor da propriedade forceBulkServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceBulkServiceTime(Boolean value) {
        this.forceBulkServiceTime = value;
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
     * Obtém o valor da propriedade isConsideredForAssignDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConsideredForAssignDays() {
        return isConsideredForAssignDays;
    }

    /**
     * Define o valor da propriedade isConsideredForAssignDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConsideredForAssignDays(Boolean value) {
        this.isConsideredForAssignDays = value;
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
     * Obtém o valor da propriedade maxDaysServiceGap.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxDaysServiceGap() {
        return maxDaysServiceGap;
    }

    /**
     * Define o valor da propriedade maxDaysServiceGap.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxDaysServiceGap(Boolean value) {
        this.maxDaysServiceGap = value;
    }

    /**
     * Obtém o valor da propriedade minDaysServiceGap.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinDaysServiceGap() {
        return minDaysServiceGap;
    }

    /**
     * Define o valor da propriedade minDaysServiceGap.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinDaysServiceGap(Boolean value) {
        this.minDaysServiceGap = value;
    }

    /**
     * Obtém o valor da propriedade numberOfDaysToShift.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfDaysToShift() {
        return numberOfDaysToShift;
    }

    /**
     * Define o valor da propriedade numberOfDaysToShift.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfDaysToShift(Boolean value) {
        this.numberOfDaysToShift = value;
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
     * Obtém o valor da propriedade orderClassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderClassEntityKey() {
        return orderClassEntityKey;
    }

    /**
     * Define o valor da propriedade orderClassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderClassEntityKey(Boolean value) {
        this.orderClassEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupQuantities() {
        return pickupQuantities;
    }

    /**
     * Define o valor da propriedade pickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupQuantities(Boolean value) {
        this.pickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade previousDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousDays() {
        return previousDays;
    }

    /**
     * Define o valor da propriedade previousDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousDays(Boolean value) {
        this.previousDays = value;
    }

    /**
     * Obtém o valor da propriedade previousDeliveryWeeks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousDeliveryWeeks() {
        return previousDeliveryWeeks;
    }

    /**
     * Define o valor da propriedade previousDeliveryWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousDeliveryWeeks(Boolean value) {
        this.previousDeliveryWeeks = value;
    }

    /**
     * Obtém o valor da propriedade previousOriginId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousOriginId() {
        return previousOriginId;
    }

    /**
     * Define o valor da propriedade previousOriginId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousOriginId(Boolean value) {
        this.previousOriginId = value;
    }

    /**
     * Obtém o valor da propriedade previousTerritoryIds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousTerritoryIds() {
        return previousTerritoryIds;
    }

    /**
     * Define o valor da propriedade previousTerritoryIds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousTerritoryIds(Boolean value) {
        this.previousTerritoryIds = value;
    }

    /**
     * Obtém o valor da propriedade previousVisitDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousVisitDate() {
        return previousVisitDate;
    }

    /**
     * Define o valor da propriedade previousVisitDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousVisitDate(Boolean value) {
        this.previousVisitDate = value;
    }

    /**
     * Obtém o valor da propriedade previousWeek.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousWeek() {
        return previousWeek;
    }

    /**
     * Define o valor da propriedade previousWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousWeek(Boolean value) {
        this.previousWeek = value;
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
     * Obtém o valor da propriedade recurringOrderInstance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurringOrderInstance() {
        return recurringOrderInstance;
    }

    /**
     * Define o valor da propriedade recurringOrderInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurringOrderInstance(Boolean value) {
        this.recurringOrderInstance = value;
    }

    /**
     * Obtém o valor da propriedade regionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegionEntityKey() {
        return regionEntityKey;
    }

    /**
     * Define o valor da propriedade regionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegionEntityKey(Boolean value) {
        this.regionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade requiredDestinationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredDestinationEntityKey() {
        return requiredDestinationEntityKey;
    }

    /**
     * Define o valor da propriedade requiredDestinationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredDestinationEntityKey(Boolean value) {
        this.requiredDestinationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade requiredOriginEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredOriginEntityKey() {
        return requiredOriginEntityKey;
    }

    /**
     * Define o valor da propriedade requiredOriginEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredOriginEntityKey(Boolean value) {
        this.requiredOriginEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade selector.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelector() {
        return selector;
    }

    /**
     * Define o valor da propriedade selector.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelector(Boolean value) {
        this.selector = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationEntityKey() {
        return serviceLocationEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationEntityKey(Boolean value) {
        this.serviceLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade servicePatternSetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServicePatternSetEntityKey() {
        return servicePatternSetEntityKey;
    }

    /**
     * Define o valor da propriedade servicePatternSetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServicePatternSetEntityKey(Boolean value) {
        this.servicePatternSetEntityKey = value;
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
     * Obtém o valor da propriedade shouldConsiderPreviousVisit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldConsiderPreviousVisit() {
        return shouldConsiderPreviousVisit;
    }

    /**
     * Define o valor da propriedade shouldConsiderPreviousVisit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldConsiderPreviousVisit(Boolean value) {
        this.shouldConsiderPreviousVisit = value;
    }

    /**
     * Obtém o valor da propriedade shouldUseAnchorDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldUseAnchorDays() {
        return shouldUseAnchorDays;
    }

    /**
     * Define o valor da propriedade shouldUseAnchorDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldUseAnchorDays(Boolean value) {
        this.shouldUseAnchorDays = value;
    }

    /**
     * Obtém o valor da propriedade shouldUseAnchorWeeks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldUseAnchorWeeks() {
        return shouldUseAnchorWeeks;
    }

    /**
     * Define o valor da propriedade shouldUseAnchorWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldUseAnchorWeeks(Boolean value) {
        this.shouldUseAnchorWeeks = value;
    }

    /**
     * Obtém o valor da propriedade territoryEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerritoryEntityKeys() {
        return territoryEntityKeys;
    }

    /**
     * Define o valor da propriedade territoryEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerritoryEntityKeys(Boolean value) {
        this.territoryEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade uploadSelector.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUploadSelector() {
        return uploadSelector;
    }

    /**
     * Define o valor da propriedade uploadSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUploadSelector(Boolean value) {
        this.uploadSelector = value;
    }

}
