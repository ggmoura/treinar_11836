
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de OrderBase complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DamagedDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DamagedPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FirstOpenCloseDetailEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FirstServiceWindowDetailEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineItemTypeDefault_LineItemPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://roadnet.com/apex/DataContracts/}ArrayOfLineItem" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfLineItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderState_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OverPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitVariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryTaskEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RequiredRouteDestinationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RequiredRouteOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Selector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ShortDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="ShortPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Tasks" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTask" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UrgencyIncrease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBase", propOrder = {
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
    RecurringOrder.class,
    Order.class
})
public class OrderBase
    extends RegionBasedAggregateRootEntity
{

    @XmlElement(name = "AdditionalServiceTime")
    protected Duration additionalServiceTime;
    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "DamagedDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> damagedDeliveryQuantities;
    @XmlElementRef(name = "DamagedPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> damagedPickupQuantities;
    @XmlElementRef(name = "DeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryQuantities;
    @XmlElement(name = "Fee")
    protected Double fee;
    @XmlElement(name = "FirstOpenCloseDetailEntityKey")
    protected Long firstOpenCloseDetailEntityKey;
    @XmlElement(name = "FirstServiceWindowDetailEntityKey")
    protected Long firstServiceWindowDetailEntityKey;
    @XmlElement(name = "FixedServiceTime")
    protected Duration fixedServiceTime;
    @XmlElement(name = "ForceBulkServiceTime")
    protected Boolean forceBulkServiceTime;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "LineItemTypeDefault_LineItemPreference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineItemTypeDefaultLineItemPreference;
    @XmlElementRef(name = "LineItems", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineItem> lineItems;
    @XmlElement(name = "NumberOfLineItems")
    protected Integer numberOfLineItems;
    @XmlElement(name = "OrderClassEntityKey")
    protected Long orderClassEntityKey;
    @XmlElementRef(name = "OrderState_State", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderStateState;
    @XmlElementRef(name = "OrderType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderTypeType;
    @XmlElementRef(name = "OverDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> overDeliveryQuantities;
    @XmlElementRef(name = "OverPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> overPickupQuantities;
    @XmlElement(name = "PerUnitVariableServiceTime")
    protected Duration perUnitVariableServiceTime;
    @XmlElementRef(name = "PickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupQuantities;
    @XmlElement(name = "PrimaryTaskEntityKey")
    protected Long primaryTaskEntityKey;
    @XmlElementRef(name = "RequiredRouteDestinationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requiredRouteDestinationEntityKey;
    @XmlElementRef(name = "RequiredRouteOriginEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requiredRouteOriginEntityKey;
    @XmlElementRef(name = "Selector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> selector;
    @XmlElement(name = "ServiceTime")
    protected Duration serviceTime;
    @XmlElementRef(name = "ShortDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> shortDeliveryQuantities;
    @XmlElementRef(name = "ShortPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> shortPickupQuantities;
    @XmlElementRef(name = "Tasks", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTask> tasks;
    @XmlElementRef(name = "UploadSelector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uploadSelector;
    @XmlElementRef(name = "Urgency", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> urgency;
    @XmlElementRef(name = "UrgencyIncrease", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> urgencyIncrease;
    @XmlElement(name = "VariableServiceTime")
    protected Duration variableServiceTime;

    /**
     * Obtém o valor da propriedade additionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAdditionalServiceTime() {
        return additionalServiceTime;
    }

    /**
     * Define o valor da propriedade additionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAdditionalServiceTime(Duration value) {
        this.additionalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<Coordinate> value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade damagedDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDamagedDeliveryQuantities() {
        return damagedDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade damagedDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDamagedDeliveryQuantities(JAXBElement<Quantities> value) {
        this.damagedDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade damagedPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDamagedPickupQuantities() {
        return damagedPickupQuantities;
    }

    /**
     * Define o valor da propriedade damagedPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDamagedPickupQuantities(JAXBElement<Quantities> value) {
        this.damagedPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryQuantities() {
        return deliveryQuantities;
    }

    /**
     * Define o valor da propriedade deliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryQuantities(JAXBElement<Quantities> value) {
        this.deliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade fee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFee() {
        return fee;
    }

    /**
     * Define o valor da propriedade fee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFee(Double value) {
        this.fee = value;
    }

    /**
     * Obtém o valor da propriedade firstOpenCloseDetailEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirstOpenCloseDetailEntityKey() {
        return firstOpenCloseDetailEntityKey;
    }

    /**
     * Define o valor da propriedade firstOpenCloseDetailEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirstOpenCloseDetailEntityKey(Long value) {
        this.firstOpenCloseDetailEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade firstServiceWindowDetailEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirstServiceWindowDetailEntityKey() {
        return firstServiceWindowDetailEntityKey;
    }

    /**
     * Define o valor da propriedade firstServiceWindowDetailEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirstServiceWindowDetailEntityKey(Long value) {
        this.firstServiceWindowDetailEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade fixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFixedServiceTime() {
        return fixedServiceTime;
    }

    /**
     * Define o valor da propriedade fixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFixedServiceTime(Duration value) {
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
     * Obtém o valor da propriedade lineItemTypeDefaultLineItemPreference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineItemTypeDefaultLineItemPreference() {
        return lineItemTypeDefaultLineItemPreference;
    }

    /**
     * Define o valor da propriedade lineItemTypeDefaultLineItemPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineItemTypeDefaultLineItemPreference(JAXBElement<String> value) {
        this.lineItemTypeDefaultLineItemPreference = value;
    }

    /**
     * Obtém o valor da propriedade lineItems.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Define o valor da propriedade lineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItem }{@code >}
     *     
     */
    public void setLineItems(JAXBElement<ArrayOfLineItem> value) {
        this.lineItems = value;
    }

    /**
     * Obtém o valor da propriedade numberOfLineItems.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfLineItems() {
        return numberOfLineItems;
    }

    /**
     * Define o valor da propriedade numberOfLineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfLineItems(Integer value) {
        this.numberOfLineItems = value;
    }

    /**
     * Obtém o valor da propriedade orderClassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderClassEntityKey() {
        return orderClassEntityKey;
    }

    /**
     * Define o valor da propriedade orderClassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderClassEntityKey(Long value) {
        this.orderClassEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderStateState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderStateState() {
        return orderStateState;
    }

    /**
     * Define o valor da propriedade orderStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderStateState(JAXBElement<String> value) {
        this.orderStateState = value;
    }

    /**
     * Obtém o valor da propriedade orderTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderTypeType() {
        return orderTypeType;
    }

    /**
     * Define o valor da propriedade orderTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderTypeType(JAXBElement<String> value) {
        this.orderTypeType = value;
    }

    /**
     * Obtém o valor da propriedade overDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOverDeliveryQuantities() {
        return overDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade overDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOverDeliveryQuantities(JAXBElement<Quantities> value) {
        this.overDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade overPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOverPickupQuantities() {
        return overPickupQuantities;
    }

    /**
     * Define o valor da propriedade overPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOverPickupQuantities(JAXBElement<Quantities> value) {
        this.overPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade perUnitVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPerUnitVariableServiceTime() {
        return perUnitVariableServiceTime;
    }

    /**
     * Define o valor da propriedade perUnitVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPerUnitVariableServiceTime(Duration value) {
        this.perUnitVariableServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupQuantities() {
        return pickupQuantities;
    }

    /**
     * Define o valor da propriedade pickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupQuantities(JAXBElement<Quantities> value) {
        this.pickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade primaryTaskEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryTaskEntityKey() {
        return primaryTaskEntityKey;
    }

    /**
     * Define o valor da propriedade primaryTaskEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryTaskEntityKey(Long value) {
        this.primaryTaskEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade requiredRouteDestinationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequiredRouteDestinationEntityKey() {
        return requiredRouteDestinationEntityKey;
    }

    /**
     * Define o valor da propriedade requiredRouteDestinationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequiredRouteDestinationEntityKey(JAXBElement<Long> value) {
        this.requiredRouteDestinationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade requiredRouteOriginEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequiredRouteOriginEntityKey() {
        return requiredRouteOriginEntityKey;
    }

    /**
     * Define o valor da propriedade requiredRouteOriginEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequiredRouteOriginEntityKey(JAXBElement<Long> value) {
        this.requiredRouteOriginEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade selector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSelector() {
        return selector;
    }

    /**
     * Define o valor da propriedade selector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSelector(JAXBElement<Integer> value) {
        this.selector = value;
    }

    /**
     * Obtém o valor da propriedade serviceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getServiceTime() {
        return serviceTime;
    }

    /**
     * Define o valor da propriedade serviceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setServiceTime(Duration value) {
        this.serviceTime = value;
    }

    /**
     * Obtém o valor da propriedade shortDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getShortDeliveryQuantities() {
        return shortDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade shortDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setShortDeliveryQuantities(JAXBElement<Quantities> value) {
        this.shortDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade shortPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getShortPickupQuantities() {
        return shortPickupQuantities;
    }

    /**
     * Define o valor da propriedade shortPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setShortPickupQuantities(JAXBElement<Quantities> value) {
        this.shortPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade tasks.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTask> getTasks() {
        return tasks;
    }

    /**
     * Define o valor da propriedade tasks.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}
     *     
     */
    public void setTasks(JAXBElement<ArrayOfTask> value) {
        this.tasks = value;
    }

    /**
     * Obtém o valor da propriedade uploadSelector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUploadSelector() {
        return uploadSelector;
    }

    /**
     * Define o valor da propriedade uploadSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUploadSelector(JAXBElement<Integer> value) {
        this.uploadSelector = value;
    }

    /**
     * Obtém o valor da propriedade urgency.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUrgency() {
        return urgency;
    }

    /**
     * Define o valor da propriedade urgency.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUrgency(JAXBElement<Integer> value) {
        this.urgency = value;
    }

    /**
     * Obtém o valor da propriedade urgencyIncrease.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUrgencyIncrease() {
        return urgencyIncrease;
    }

    /**
     * Define o valor da propriedade urgencyIncrease.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUrgencyIncrease(JAXBElement<Integer> value) {
        this.urgencyIncrease = value;
    }

    /**
     * Obtém o valor da propriedade variableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getVariableServiceTime() {
        return variableServiceTime;
    }

    /**
     * Define o valor da propriedade variableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setVariableServiceTime(Duration value) {
        this.variableServiceTime = value;
    }

}
