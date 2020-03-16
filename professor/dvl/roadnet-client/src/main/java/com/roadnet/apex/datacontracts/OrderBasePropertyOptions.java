
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderBasePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderBasePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DamagedDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DamagedPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FirstOpenCloseDetailEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FirstServiceWindowDetailEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FixedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemTypeDefault_LineItemPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemsOptions" type="{http://roadnet.com/apex/DataContracts/}LineItemPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfLineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderState_State" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitVariableServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryTaskEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequiredRouteDestinationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequiredRouteOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Selector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Tasks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UrgencyIncrease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VariableServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBasePropertyOptions", propOrder = {
    "additionalServiceTime",
    "coordinate",
    "damagedDeliveryQuantities",
    "damagedPickupQuantities",
    "deliveryQuantities",
    "fee",
    "firstOpenCloseDetailEntityKey",
    "firstServiceWindowDetailEntityKey",
    "fixedServiceTime",
    "forceBulkServiceTime",
    "identifier",
    "lineItemTypeDefaultLineItemPreference",
    "lineItems",
    "lineItemsOptions",
    "numberOfLineItems",
    "orderClassEntityKey",
    "orderStateState",
    "orderTypeType",
    "overDeliveryQuantities",
    "overPickupQuantities",
    "perUnitVariableServiceTime",
    "pickupQuantities",
    "primaryTaskEntityKey",
    "requiredRouteDestinationEntityKey",
    "requiredRouteOriginEntityKey",
    "selector",
    "serviceTime",
    "shortDeliveryQuantities",
    "shortPickupQuantities",
    "tasks",
    "uploadSelector",
    "urgency",
    "urgencyIncrease",
    "variableServiceTime"
})
@XmlSeeAlso({
    RecurringOrderPropertyOptions.class,
    OrderPropertyOptions.class
})
public class OrderBasePropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "AdditionalServiceTime")
    protected Boolean additionalServiceTime;
    @XmlElement(name = "Coordinate")
    protected Boolean coordinate;
    @XmlElement(name = "DamagedDeliveryQuantities")
    protected Boolean damagedDeliveryQuantities;
    @XmlElement(name = "DamagedPickupQuantities")
    protected Boolean damagedPickupQuantities;
    @XmlElement(name = "DeliveryQuantities")
    protected Boolean deliveryQuantities;
    @XmlElement(name = "Fee")
    protected Boolean fee;
    @XmlElement(name = "FirstOpenCloseDetailEntityKey")
    protected Boolean firstOpenCloseDetailEntityKey;
    @XmlElement(name = "FirstServiceWindowDetailEntityKey")
    protected Boolean firstServiceWindowDetailEntityKey;
    @XmlElement(name = "FixedServiceTime")
    protected Boolean fixedServiceTime;
    @XmlElement(name = "ForceBulkServiceTime")
    protected Boolean forceBulkServiceTime;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "LineItemTypeDefault_LineItemPreference")
    protected Boolean lineItemTypeDefaultLineItemPreference;
    @XmlElement(name = "LineItems")
    protected Boolean lineItems;
    @XmlElementRef(name = "LineItemsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LineItemPropertyOptions> lineItemsOptions;
    @XmlElement(name = "NumberOfLineItems")
    protected Boolean numberOfLineItems;
    @XmlElement(name = "OrderClassEntityKey")
    protected Boolean orderClassEntityKey;
    @XmlElement(name = "OrderState_State")
    protected Boolean orderStateState;
    @XmlElement(name = "OrderType_Type")
    protected Boolean orderTypeType;
    @XmlElement(name = "OverDeliveryQuantities")
    protected Boolean overDeliveryQuantities;
    @XmlElement(name = "OverPickupQuantities")
    protected Boolean overPickupQuantities;
    @XmlElement(name = "PerUnitVariableServiceTime")
    protected Boolean perUnitVariableServiceTime;
    @XmlElement(name = "PickupQuantities")
    protected Boolean pickupQuantities;
    @XmlElement(name = "PrimaryTaskEntityKey")
    protected Boolean primaryTaskEntityKey;
    @XmlElement(name = "RequiredRouteDestinationEntityKey")
    protected Boolean requiredRouteDestinationEntityKey;
    @XmlElement(name = "RequiredRouteOriginEntityKey")
    protected Boolean requiredRouteOriginEntityKey;
    @XmlElement(name = "Selector")
    protected Boolean selector;
    @XmlElement(name = "ServiceTime")
    protected Boolean serviceTime;
    @XmlElement(name = "ShortDeliveryQuantities")
    protected Boolean shortDeliveryQuantities;
    @XmlElement(name = "ShortPickupQuantities")
    protected Boolean shortPickupQuantities;
    @XmlElement(name = "Tasks")
    protected Boolean tasks;
    @XmlElement(name = "UploadSelector")
    protected Boolean uploadSelector;
    @XmlElement(name = "Urgency")
    protected Boolean urgency;
    @XmlElement(name = "UrgencyIncrease")
    protected Boolean urgencyIncrease;
    @XmlElement(name = "VariableServiceTime")
    protected Boolean variableServiceTime;

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
     * Obtém o valor da propriedade damagedDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDamagedDeliveryQuantities() {
        return damagedDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade damagedDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDamagedDeliveryQuantities(Boolean value) {
        this.damagedDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade damagedPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDamagedPickupQuantities() {
        return damagedPickupQuantities;
    }

    /**
     * Define o valor da propriedade damagedPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDamagedPickupQuantities(Boolean value) {
        this.damagedPickupQuantities = value;
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
     * Obtém o valor da propriedade fee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFee() {
        return fee;
    }

    /**
     * Define o valor da propriedade fee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFee(Boolean value) {
        this.fee = value;
    }

    /**
     * Obtém o valor da propriedade firstOpenCloseDetailEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstOpenCloseDetailEntityKey() {
        return firstOpenCloseDetailEntityKey;
    }

    /**
     * Define o valor da propriedade firstOpenCloseDetailEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstOpenCloseDetailEntityKey(Boolean value) {
        this.firstOpenCloseDetailEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade firstServiceWindowDetailEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstServiceWindowDetailEntityKey() {
        return firstServiceWindowDetailEntityKey;
    }

    /**
     * Define o valor da propriedade firstServiceWindowDetailEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstServiceWindowDetailEntityKey(Boolean value) {
        this.firstServiceWindowDetailEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade fixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedServiceTime() {
        return fixedServiceTime;
    }

    /**
     * Define o valor da propriedade fixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedServiceTime(Boolean value) {
        this.fixedServiceTime = value;
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
     * Obtém o valor da propriedade lineItemTypeDefaultLineItemPreference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemTypeDefaultLineItemPreference() {
        return lineItemTypeDefaultLineItemPreference;
    }

    /**
     * Define o valor da propriedade lineItemTypeDefaultLineItemPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemTypeDefaultLineItemPreference(Boolean value) {
        this.lineItemTypeDefaultLineItemPreference = value;
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
     * Obtém o valor da propriedade numberOfLineItems.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfLineItems() {
        return numberOfLineItems;
    }

    /**
     * Define o valor da propriedade numberOfLineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfLineItems(Boolean value) {
        this.numberOfLineItems = value;
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
     * Obtém o valor da propriedade orderStateState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderStateState() {
        return orderStateState;
    }

    /**
     * Define o valor da propriedade orderStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderStateState(Boolean value) {
        this.orderStateState = value;
    }

    /**
     * Obtém o valor da propriedade orderTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderTypeType() {
        return orderTypeType;
    }

    /**
     * Define o valor da propriedade orderTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderTypeType(Boolean value) {
        this.orderTypeType = value;
    }

    /**
     * Obtém o valor da propriedade overDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverDeliveryQuantities() {
        return overDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade overDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverDeliveryQuantities(Boolean value) {
        this.overDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade overPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverPickupQuantities() {
        return overPickupQuantities;
    }

    /**
     * Define o valor da propriedade overPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverPickupQuantities(Boolean value) {
        this.overPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade perUnitVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerUnitVariableServiceTime() {
        return perUnitVariableServiceTime;
    }

    /**
     * Define o valor da propriedade perUnitVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerUnitVariableServiceTime(Boolean value) {
        this.perUnitVariableServiceTime = value;
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
     * Obtém o valor da propriedade primaryTaskEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryTaskEntityKey() {
        return primaryTaskEntityKey;
    }

    /**
     * Define o valor da propriedade primaryTaskEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryTaskEntityKey(Boolean value) {
        this.primaryTaskEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade requiredRouteDestinationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredRouteDestinationEntityKey() {
        return requiredRouteDestinationEntityKey;
    }

    /**
     * Define o valor da propriedade requiredRouteDestinationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredRouteDestinationEntityKey(Boolean value) {
        this.requiredRouteDestinationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade requiredRouteOriginEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredRouteOriginEntityKey() {
        return requiredRouteOriginEntityKey;
    }

    /**
     * Define o valor da propriedade requiredRouteOriginEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredRouteOriginEntityKey(Boolean value) {
        this.requiredRouteOriginEntityKey = value;
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
     * Obtém o valor da propriedade serviceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceTime() {
        return serviceTime;
    }

    /**
     * Define o valor da propriedade serviceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceTime(Boolean value) {
        this.serviceTime = value;
    }

    /**
     * Obtém o valor da propriedade shortDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortDeliveryQuantities() {
        return shortDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade shortDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortDeliveryQuantities(Boolean value) {
        this.shortDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade shortPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortPickupQuantities() {
        return shortPickupQuantities;
    }

    /**
     * Define o valor da propriedade shortPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortPickupQuantities(Boolean value) {
        this.shortPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade tasks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTasks() {
        return tasks;
    }

    /**
     * Define o valor da propriedade tasks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTasks(Boolean value) {
        this.tasks = value;
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

    /**
     * Obtém o valor da propriedade urgency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgency() {
        return urgency;
    }

    /**
     * Define o valor da propriedade urgency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgency(Boolean value) {
        this.urgency = value;
    }

    /**
     * Obtém o valor da propriedade urgencyIncrease.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgencyIncrease() {
        return urgencyIncrease;
    }

    /**
     * Define o valor da propriedade urgencyIncrease.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgencyIncrease(Boolean value) {
        this.urgencyIncrease = value;
    }

    /**
     * Obtém o valor da propriedade variableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariableServiceTime() {
        return variableServiceTime;
    }

    /**
     * Define o valor da propriedade variableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariableServiceTime(Boolean value) {
        this.variableServiceTime = value;
    }

}
