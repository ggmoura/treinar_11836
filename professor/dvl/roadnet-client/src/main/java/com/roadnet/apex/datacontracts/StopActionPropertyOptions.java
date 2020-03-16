
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de StopActionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StopActionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Consignee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EntryMethod_OrderEntryMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLockedToRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemTypeDefault_OrderLineItemPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderAdditionalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderBeginDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCreatedBy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCreatedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderEndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderManagedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderModifiedBy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderModifiedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderNetRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumberOfLineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderOpenCloseDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedDeliveryCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedDeliveryCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedDeliveryCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedPickupCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedPickupCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedPickupCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderPreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderPreferredRouteIdentifierOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderRequiredRouteOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderSelector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderServiceWindowDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderSessionDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderSessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderSpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderState_OrderState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderTakenBy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderType_OrderType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderUploadSelector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderUrgency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecurringVisitNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCustomProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SignatureCaptureEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SkipSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopActionLineItemQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopActionLineItemQuantitiesOptions" type="{http://roadnet.com/apex/DataContracts/}StopActionLineItemQuantitiesPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="StopActionType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Task" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TaskOptions" type="{http://roadnet.com/apex/DataContracts/}TaskPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopActionPropertyOptions", propOrder = {
    "consignee",
    "damagedQuantities",
    "entryMethodOrderEntryMethod",
    "isCurrent",
    "isLockedToRoute",
    "lineItemQuantities",
    "lineItemTypeDefaultOrderLineItemPreference",
    "orderAdditionalServiceTime",
    "orderBeginDate",
    "orderClassEntityKey",
    "orderCoordinate",
    "orderCreatedBy",
    "orderCreatedTime",
    "orderCustomProperties",
    "orderEndDate",
    "orderEntityKey",
    "orderForceBulkServiceTime",
    "orderIdentifier",
    "orderManagedByUserEntityKey",
    "orderModifiedBy",
    "orderModifiedTime",
    "orderNetRevenue",
    "orderNumberOfLineItems",
    "orderOpenCloseDetails",
    "orderPlannedDeliveryCategory1Quantities",
    "orderPlannedDeliveryCategory2Quantities",
    "orderPlannedDeliveryCategory3Quantities",
    "orderPlannedPickupCategory1Quantities",
    "orderPlannedPickupCategory2Quantities",
    "orderPlannedPickupCategory3Quantities",
    "orderPreferredRouteIdentifier",
    "orderPreferredRouteIdentifierOverride",
    "orderRequiredRouteOriginEntityKey",
    "orderSelector",
    "orderServiceWindowDetails",
    "orderSessionDescription",
    "orderSessionEntityKey",
    "orderSessionStartDate",
    "orderSpecialInstructions",
    "orderStateOrderState",
    "orderTakenBy",
    "orderTypeOrderType",
    "orderUploadSelector",
    "orderUrgency",
    "orderVersion",
    "overQuantities",
    "plannedQuantities",
    "quantities",
    "recurringVisitNumber",
    "sequence",
    "serviceLocationCustomProperties",
    "shortQuantities",
    "signatureCaptureEntityKey",
    "skipSignature",
    "stopActionLineItemQuantities",
    "stopActionLineItemQuantitiesOptions",
    "stopActionTypeType",
    "task",
    "taskOptions"
})
public class StopActionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Consignee")
    protected Boolean consignee;
    @XmlElement(name = "DamagedQuantities")
    protected Boolean damagedQuantities;
    @XmlElement(name = "EntryMethod_OrderEntryMethod")
    protected Boolean entryMethodOrderEntryMethod;
    @XmlElement(name = "IsCurrent")
    protected Boolean isCurrent;
    @XmlElement(name = "IsLockedToRoute")
    protected Boolean isLockedToRoute;
    @XmlElement(name = "LineItemQuantities")
    protected Boolean lineItemQuantities;
    @XmlElement(name = "LineItemTypeDefault_OrderLineItemPreference")
    protected Boolean lineItemTypeDefaultOrderLineItemPreference;
    @XmlElement(name = "OrderAdditionalServiceTime")
    protected Boolean orderAdditionalServiceTime;
    @XmlElement(name = "OrderBeginDate")
    protected Boolean orderBeginDate;
    @XmlElement(name = "OrderClassEntityKey")
    protected Boolean orderClassEntityKey;
    @XmlElement(name = "OrderCoordinate")
    protected Boolean orderCoordinate;
    @XmlElement(name = "OrderCreatedBy")
    protected Boolean orderCreatedBy;
    @XmlElement(name = "OrderCreatedTime")
    protected Boolean orderCreatedTime;
    @XmlElement(name = "OrderCustomProperties")
    protected Boolean orderCustomProperties;
    @XmlElement(name = "OrderEndDate")
    protected Boolean orderEndDate;
    @XmlElement(name = "OrderEntityKey")
    protected Boolean orderEntityKey;
    @XmlElement(name = "OrderForceBulkServiceTime")
    protected Boolean orderForceBulkServiceTime;
    @XmlElement(name = "OrderIdentifier")
    protected Boolean orderIdentifier;
    @XmlElement(name = "OrderManagedByUserEntityKey")
    protected Boolean orderManagedByUserEntityKey;
    @XmlElement(name = "OrderModifiedBy")
    protected Boolean orderModifiedBy;
    @XmlElement(name = "OrderModifiedTime")
    protected Boolean orderModifiedTime;
    @XmlElement(name = "OrderNetRevenue")
    protected Boolean orderNetRevenue;
    @XmlElement(name = "OrderNumberOfLineItems")
    protected Boolean orderNumberOfLineItems;
    @XmlElement(name = "OrderOpenCloseDetails")
    protected Boolean orderOpenCloseDetails;
    @XmlElement(name = "OrderPlannedDeliveryCategory1Quantities")
    protected Boolean orderPlannedDeliveryCategory1Quantities;
    @XmlElement(name = "OrderPlannedDeliveryCategory2Quantities")
    protected Boolean orderPlannedDeliveryCategory2Quantities;
    @XmlElement(name = "OrderPlannedDeliveryCategory3Quantities")
    protected Boolean orderPlannedDeliveryCategory3Quantities;
    @XmlElement(name = "OrderPlannedPickupCategory1Quantities")
    protected Boolean orderPlannedPickupCategory1Quantities;
    @XmlElement(name = "OrderPlannedPickupCategory2Quantities")
    protected Boolean orderPlannedPickupCategory2Quantities;
    @XmlElement(name = "OrderPlannedPickupCategory3Quantities")
    protected Boolean orderPlannedPickupCategory3Quantities;
    @XmlElement(name = "OrderPreferredRouteIdentifier")
    protected Boolean orderPreferredRouteIdentifier;
    @XmlElement(name = "OrderPreferredRouteIdentifierOverride")
    protected Boolean orderPreferredRouteIdentifierOverride;
    @XmlElement(name = "OrderRequiredRouteOriginEntityKey")
    protected Boolean orderRequiredRouteOriginEntityKey;
    @XmlElement(name = "OrderSelector")
    protected Boolean orderSelector;
    @XmlElement(name = "OrderServiceWindowDetails")
    protected Boolean orderServiceWindowDetails;
    @XmlElement(name = "OrderSessionDescription")
    protected Boolean orderSessionDescription;
    @XmlElement(name = "OrderSessionEntityKey")
    protected Boolean orderSessionEntityKey;
    @XmlElement(name = "OrderSessionStartDate")
    protected Boolean orderSessionStartDate;
    @XmlElement(name = "OrderSpecialInstructions")
    protected Boolean orderSpecialInstructions;
    @XmlElement(name = "OrderState_OrderState")
    protected Boolean orderStateOrderState;
    @XmlElement(name = "OrderTakenBy")
    protected Boolean orderTakenBy;
    @XmlElement(name = "OrderType_OrderType")
    protected Boolean orderTypeOrderType;
    @XmlElement(name = "OrderUploadSelector")
    protected Boolean orderUploadSelector;
    @XmlElement(name = "OrderUrgency")
    protected Boolean orderUrgency;
    @XmlElement(name = "OrderVersion")
    protected Boolean orderVersion;
    @XmlElement(name = "OverQuantities")
    protected Boolean overQuantities;
    @XmlElement(name = "PlannedQuantities")
    protected Boolean plannedQuantities;
    @XmlElement(name = "Quantities")
    protected Boolean quantities;
    @XmlElement(name = "RecurringVisitNumber")
    protected Boolean recurringVisitNumber;
    @XmlElement(name = "Sequence")
    protected Boolean sequence;
    @XmlElement(name = "ServiceLocationCustomProperties")
    protected Boolean serviceLocationCustomProperties;
    @XmlElement(name = "ShortQuantities")
    protected Boolean shortQuantities;
    @XmlElement(name = "SignatureCaptureEntityKey")
    protected Boolean signatureCaptureEntityKey;
    @XmlElement(name = "SkipSignature")
    protected Boolean skipSignature;
    @XmlElement(name = "StopActionLineItemQuantities")
    protected Boolean stopActionLineItemQuantities;
    @XmlElementRef(name = "StopActionLineItemQuantitiesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StopActionLineItemQuantitiesPropertyOptions> stopActionLineItemQuantitiesOptions;
    @XmlElement(name = "StopActionType_Type")
    protected Boolean stopActionTypeType;
    @XmlElement(name = "Task")
    protected Boolean task;
    @XmlElementRef(name = "TaskOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TaskPropertyOptions> taskOptions;

    /**
     * Obtém o valor da propriedade consignee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsignee() {
        return consignee;
    }

    /**
     * Define o valor da propriedade consignee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsignee(Boolean value) {
        this.consignee = value;
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
     * Obtém o valor da propriedade entryMethodOrderEntryMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntryMethodOrderEntryMethod() {
        return entryMethodOrderEntryMethod;
    }

    /**
     * Define o valor da propriedade entryMethodOrderEntryMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntryMethodOrderEntryMethod(Boolean value) {
        this.entryMethodOrderEntryMethod = value;
    }

    /**
     * Obtém o valor da propriedade isCurrent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCurrent() {
        return isCurrent;
    }

    /**
     * Define o valor da propriedade isCurrent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCurrent(Boolean value) {
        this.isCurrent = value;
    }

    /**
     * Obtém o valor da propriedade isLockedToRoute.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLockedToRoute() {
        return isLockedToRoute;
    }

    /**
     * Define o valor da propriedade isLockedToRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLockedToRoute(Boolean value) {
        this.isLockedToRoute = value;
    }

    /**
     * Obtém o valor da propriedade lineItemQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemQuantities() {
        return lineItemQuantities;
    }

    /**
     * Define o valor da propriedade lineItemQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemQuantities(Boolean value) {
        this.lineItemQuantities = value;
    }

    /**
     * Obtém o valor da propriedade lineItemTypeDefaultOrderLineItemPreference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemTypeDefaultOrderLineItemPreference() {
        return lineItemTypeDefaultOrderLineItemPreference;
    }

    /**
     * Define o valor da propriedade lineItemTypeDefaultOrderLineItemPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemTypeDefaultOrderLineItemPreference(Boolean value) {
        this.lineItemTypeDefaultOrderLineItemPreference = value;
    }

    /**
     * Obtém o valor da propriedade orderAdditionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderAdditionalServiceTime() {
        return orderAdditionalServiceTime;
    }

    /**
     * Define o valor da propriedade orderAdditionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderAdditionalServiceTime(Boolean value) {
        this.orderAdditionalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade orderBeginDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderBeginDate() {
        return orderBeginDate;
    }

    /**
     * Define o valor da propriedade orderBeginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderBeginDate(Boolean value) {
        this.orderBeginDate = value;
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
     * Obtém o valor da propriedade orderCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCoordinate() {
        return orderCoordinate;
    }

    /**
     * Define o valor da propriedade orderCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCoordinate(Boolean value) {
        this.orderCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade orderCreatedBy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCreatedBy() {
        return orderCreatedBy;
    }

    /**
     * Define o valor da propriedade orderCreatedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCreatedBy(Boolean value) {
        this.orderCreatedBy = value;
    }

    /**
     * Obtém o valor da propriedade orderCreatedTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCreatedTime() {
        return orderCreatedTime;
    }

    /**
     * Define o valor da propriedade orderCreatedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCreatedTime(Boolean value) {
        this.orderCreatedTime = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCustomProperties() {
        return orderCustomProperties;
    }

    /**
     * Define o valor da propriedade orderCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCustomProperties(Boolean value) {
        this.orderCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade orderEndDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderEndDate() {
        return orderEndDate;
    }

    /**
     * Define o valor da propriedade orderEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderEndDate(Boolean value) {
        this.orderEndDate = value;
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
     * Obtém o valor da propriedade orderForceBulkServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderForceBulkServiceTime() {
        return orderForceBulkServiceTime;
    }

    /**
     * Define o valor da propriedade orderForceBulkServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderForceBulkServiceTime(Boolean value) {
        this.orderForceBulkServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade orderIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderIdentifier() {
        return orderIdentifier;
    }

    /**
     * Define o valor da propriedade orderIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderIdentifier(Boolean value) {
        this.orderIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderManagedByUserEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderManagedByUserEntityKey() {
        return orderManagedByUserEntityKey;
    }

    /**
     * Define o valor da propriedade orderManagedByUserEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderManagedByUserEntityKey(Boolean value) {
        this.orderManagedByUserEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderModifiedBy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderModifiedBy() {
        return orderModifiedBy;
    }

    /**
     * Define o valor da propriedade orderModifiedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderModifiedBy(Boolean value) {
        this.orderModifiedBy = value;
    }

    /**
     * Obtém o valor da propriedade orderModifiedTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderModifiedTime() {
        return orderModifiedTime;
    }

    /**
     * Define o valor da propriedade orderModifiedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderModifiedTime(Boolean value) {
        this.orderModifiedTime = value;
    }

    /**
     * Obtém o valor da propriedade orderNetRevenue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderNetRevenue() {
        return orderNetRevenue;
    }

    /**
     * Define o valor da propriedade orderNetRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderNetRevenue(Boolean value) {
        this.orderNetRevenue = value;
    }

    /**
     * Obtém o valor da propriedade orderNumberOfLineItems.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderNumberOfLineItems() {
        return orderNumberOfLineItems;
    }

    /**
     * Define o valor da propriedade orderNumberOfLineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderNumberOfLineItems(Boolean value) {
        this.orderNumberOfLineItems = value;
    }

    /**
     * Obtém o valor da propriedade orderOpenCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderOpenCloseDetails() {
        return orderOpenCloseDetails;
    }

    /**
     * Define o valor da propriedade orderOpenCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderOpenCloseDetails(Boolean value) {
        this.orderOpenCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedDeliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderPlannedDeliveryCategory1Quantities() {
        return orderPlannedDeliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedDeliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderPlannedDeliveryCategory1Quantities(Boolean value) {
        this.orderPlannedDeliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedDeliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderPlannedDeliveryCategory2Quantities() {
        return orderPlannedDeliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedDeliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderPlannedDeliveryCategory2Quantities(Boolean value) {
        this.orderPlannedDeliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedDeliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderPlannedDeliveryCategory3Quantities() {
        return orderPlannedDeliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedDeliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderPlannedDeliveryCategory3Quantities(Boolean value) {
        this.orderPlannedDeliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedPickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderPlannedPickupCategory1Quantities() {
        return orderPlannedPickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedPickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderPlannedPickupCategory1Quantities(Boolean value) {
        this.orderPlannedPickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedPickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderPlannedPickupCategory2Quantities() {
        return orderPlannedPickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedPickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderPlannedPickupCategory2Quantities(Boolean value) {
        this.orderPlannedPickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedPickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderPlannedPickupCategory3Quantities() {
        return orderPlannedPickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedPickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderPlannedPickupCategory3Quantities(Boolean value) {
        this.orderPlannedPickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPreferredRouteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderPreferredRouteIdentifier() {
        return orderPreferredRouteIdentifier;
    }

    /**
     * Define o valor da propriedade orderPreferredRouteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderPreferredRouteIdentifier(Boolean value) {
        this.orderPreferredRouteIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderPreferredRouteIdentifierOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderPreferredRouteIdentifierOverride() {
        return orderPreferredRouteIdentifierOverride;
    }

    /**
     * Define o valor da propriedade orderPreferredRouteIdentifierOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderPreferredRouteIdentifierOverride(Boolean value) {
        this.orderPreferredRouteIdentifierOverride = value;
    }

    /**
     * Obtém o valor da propriedade orderRequiredRouteOriginEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderRequiredRouteOriginEntityKey() {
        return orderRequiredRouteOriginEntityKey;
    }

    /**
     * Define o valor da propriedade orderRequiredRouteOriginEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderRequiredRouteOriginEntityKey(Boolean value) {
        this.orderRequiredRouteOriginEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderSelector.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderSelector() {
        return orderSelector;
    }

    /**
     * Define o valor da propriedade orderSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderSelector(Boolean value) {
        this.orderSelector = value;
    }

    /**
     * Obtém o valor da propriedade orderServiceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderServiceWindowDetails() {
        return orderServiceWindowDetails;
    }

    /**
     * Define o valor da propriedade orderServiceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderServiceWindowDetails(Boolean value) {
        this.orderServiceWindowDetails = value;
    }

    /**
     * Obtém o valor da propriedade orderSessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderSessionDescription() {
        return orderSessionDescription;
    }

    /**
     * Define o valor da propriedade orderSessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderSessionDescription(Boolean value) {
        this.orderSessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade orderSessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderSessionEntityKey() {
        return orderSessionEntityKey;
    }

    /**
     * Define o valor da propriedade orderSessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderSessionEntityKey(Boolean value) {
        this.orderSessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderSessionStartDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderSessionStartDate() {
        return orderSessionStartDate;
    }

    /**
     * Define o valor da propriedade orderSessionStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderSessionStartDate(Boolean value) {
        this.orderSessionStartDate = value;
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
     * Obtém o valor da propriedade orderStateOrderState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderStateOrderState() {
        return orderStateOrderState;
    }

    /**
     * Define o valor da propriedade orderStateOrderState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderStateOrderState(Boolean value) {
        this.orderStateOrderState = value;
    }

    /**
     * Obtém o valor da propriedade orderTakenBy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderTakenBy() {
        return orderTakenBy;
    }

    /**
     * Define o valor da propriedade orderTakenBy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderTakenBy(Boolean value) {
        this.orderTakenBy = value;
    }

    /**
     * Obtém o valor da propriedade orderTypeOrderType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderTypeOrderType() {
        return orderTypeOrderType;
    }

    /**
     * Define o valor da propriedade orderTypeOrderType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderTypeOrderType(Boolean value) {
        this.orderTypeOrderType = value;
    }

    /**
     * Obtém o valor da propriedade orderUploadSelector.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderUploadSelector() {
        return orderUploadSelector;
    }

    /**
     * Define o valor da propriedade orderUploadSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderUploadSelector(Boolean value) {
        this.orderUploadSelector = value;
    }

    /**
     * Obtém o valor da propriedade orderUrgency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderUrgency() {
        return orderUrgency;
    }

    /**
     * Define o valor da propriedade orderUrgency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderUrgency(Boolean value) {
        this.orderUrgency = value;
    }

    /**
     * Obtém o valor da propriedade orderVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderVersion() {
        return orderVersion;
    }

    /**
     * Define o valor da propriedade orderVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderVersion(Boolean value) {
        this.orderVersion = value;
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
     * Obtém o valor da propriedade recurringVisitNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurringVisitNumber() {
        return recurringVisitNumber;
    }

    /**
     * Define o valor da propriedade recurringVisitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurringVisitNumber(Boolean value) {
        this.recurringVisitNumber = value;
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
     * Obtém o valor da propriedade signatureCaptureEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignatureCaptureEntityKey() {
        return signatureCaptureEntityKey;
    }

    /**
     * Define o valor da propriedade signatureCaptureEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignatureCaptureEntityKey(Boolean value) {
        this.signatureCaptureEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade skipSignature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipSignature() {
        return skipSignature;
    }

    /**
     * Define o valor da propriedade skipSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipSignature(Boolean value) {
        this.skipSignature = value;
    }

    /**
     * Obtém o valor da propriedade stopActionLineItemQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopActionLineItemQuantities() {
        return stopActionLineItemQuantities;
    }

    /**
     * Define o valor da propriedade stopActionLineItemQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopActionLineItemQuantities(Boolean value) {
        this.stopActionLineItemQuantities = value;
    }

    /**
     * Obtém o valor da propriedade stopActionLineItemQuantitiesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopActionLineItemQuantitiesPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<StopActionLineItemQuantitiesPropertyOptions> getStopActionLineItemQuantitiesOptions() {
        return stopActionLineItemQuantitiesOptions;
    }

    /**
     * Define o valor da propriedade stopActionLineItemQuantitiesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopActionLineItemQuantitiesPropertyOptions }{@code >}
     *     
     */
    public void setStopActionLineItemQuantitiesOptions(JAXBElement<StopActionLineItemQuantitiesPropertyOptions> value) {
        this.stopActionLineItemQuantitiesOptions = value;
    }

    /**
     * Obtém o valor da propriedade stopActionTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopActionTypeType() {
        return stopActionTypeType;
    }

    /**
     * Define o valor da propriedade stopActionTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopActionTypeType(Boolean value) {
        this.stopActionTypeType = value;
    }

    /**
     * Obtém o valor da propriedade task.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTask() {
        return task;
    }

    /**
     * Define o valor da propriedade task.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTask(Boolean value) {
        this.task = value;
    }

    /**
     * Obtém o valor da propriedade taskOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaskPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<TaskPropertyOptions> getTaskOptions() {
        return taskOptions;
    }

    /**
     * Define o valor da propriedade taskOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaskPropertyOptions }{@code >}
     *     
     */
    public void setTaskOptions(JAXBElement<TaskPropertyOptions> value) {
        this.taskOptions = value;
    }

}
