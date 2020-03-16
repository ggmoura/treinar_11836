
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;
import org.datacontract.schemas._2004._07.system.ArrayOfDictionaryEntry;


/**
 * <p>Classe Java de StopAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StopAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Consignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="EntryMethod_OrderEntryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLockedToRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemTypeDefault_OrderLineItemPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderAdditionalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OrderBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="OrderCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderCreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OrderCustomProperties" type="{http://schemas.datacontract.org/2004/07/System.Collections}ArrayOfDictionaryEntry" minOccurs="0"/&gt;
 *         &lt;element name="OrderEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="OrderEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderManagedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OrderNetRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumberOfLineItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderOpenCloseDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedDeliveryCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedDeliveryCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedDeliveryCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedPickupCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedPickupCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OrderPlannedPickupCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OrderPreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderPreferredRouteIdentifierOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderRequiredRouteOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderSelector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="OrderServiceWindowDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderSessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderSessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="OrderSpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderState_OrderState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderTakenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType_OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderUploadSelector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="OrderUrgency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="RecurringVisitNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="SignatureCaptureEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SkipSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopActionLineItemQuantities" type="{http://roadnet.com/apex/DataContracts/}ArrayOfStopActionLineItemQuantities" minOccurs="0"/&gt;
 *         &lt;element name="StopActionType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Task" type="{http://roadnet.com/apex/DataContracts/}Task" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopAction", propOrder = {
    "consignee",
    "damagedQuantities",
    "entryMethodOrderEntryMethod",
    "isCurrent",
    "isLockedToRoute",
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
    "stopActionTypeType",
    "task"
})
public class StopAction
    extends DomainEntity
{

    @XmlElementRef(name = "Consignee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consignee;
    @XmlElementRef(name = "DamagedQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> damagedQuantities;
    @XmlElementRef(name = "EntryMethod_OrderEntryMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entryMethodOrderEntryMethod;
    @XmlElement(name = "IsCurrent")
    protected Boolean isCurrent;
    @XmlElement(name = "IsLockedToRoute")
    protected Boolean isLockedToRoute;
    @XmlElementRef(name = "LineItemTypeDefault_OrderLineItemPreference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineItemTypeDefaultOrderLineItemPreference;
    @XmlElement(name = "OrderAdditionalServiceTime")
    protected Duration orderAdditionalServiceTime;
    @XmlElementRef(name = "OrderBeginDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> orderBeginDate;
    @XmlElement(name = "OrderClassEntityKey")
    protected Long orderClassEntityKey;
    @XmlElementRef(name = "OrderCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> orderCoordinate;
    @XmlElementRef(name = "OrderCreatedBy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderCreatedBy;
    @XmlElement(name = "OrderCreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderCreatedTime;
    @XmlElementRef(name = "OrderCustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDictionaryEntry> orderCustomProperties;
    @XmlElementRef(name = "OrderEndDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> orderEndDate;
    @XmlElement(name = "OrderEntityKey")
    protected Long orderEntityKey;
    @XmlElement(name = "OrderForceBulkServiceTime")
    protected Boolean orderForceBulkServiceTime;
    @XmlElementRef(name = "OrderIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderIdentifier;
    @XmlElement(name = "OrderManagedByUserEntityKey")
    protected Long orderManagedByUserEntityKey;
    @XmlElementRef(name = "OrderModifiedBy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderModifiedBy;
    @XmlElement(name = "OrderModifiedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderModifiedTime;
    @XmlElementRef(name = "OrderNetRevenue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> orderNetRevenue;
    @XmlElement(name = "OrderNumberOfLineItems")
    protected Integer orderNumberOfLineItems;
    @XmlElementRef(name = "OrderOpenCloseDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderOpenCloseDetail> orderOpenCloseDetails;
    @XmlElementRef(name = "OrderPlannedDeliveryCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> orderPlannedDeliveryCategory1Quantities;
    @XmlElementRef(name = "OrderPlannedDeliveryCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> orderPlannedDeliveryCategory2Quantities;
    @XmlElementRef(name = "OrderPlannedDeliveryCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> orderPlannedDeliveryCategory3Quantities;
    @XmlElementRef(name = "OrderPlannedPickupCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> orderPlannedPickupCategory1Quantities;
    @XmlElementRef(name = "OrderPlannedPickupCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> orderPlannedPickupCategory2Quantities;
    @XmlElementRef(name = "OrderPlannedPickupCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> orderPlannedPickupCategory3Quantities;
    @XmlElementRef(name = "OrderPreferredRouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderPreferredRouteIdentifier;
    @XmlElementRef(name = "OrderPreferredRouteIdentifierOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderPreferredRouteIdentifierOverride;
    @XmlElementRef(name = "OrderRequiredRouteOriginEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderRequiredRouteOriginEntityKey;
    @XmlElementRef(name = "OrderSelector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderSelector;
    @XmlElementRef(name = "OrderServiceWindowDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderServiceWindowDetail> orderServiceWindowDetails;
    @XmlElementRef(name = "OrderSessionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderSessionDescription;
    @XmlElementRef(name = "OrderSessionEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderSessionEntityKey;
    @XmlElementRef(name = "OrderSessionStartDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> orderSessionStartDate;
    @XmlElementRef(name = "OrderSpecialInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderSpecialInstructions;
    @XmlElementRef(name = "OrderState_OrderState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderStateOrderState;
    @XmlElementRef(name = "OrderTakenBy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderTakenBy;
    @XmlElementRef(name = "OrderType_OrderType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderTypeOrderType;
    @XmlElementRef(name = "OrderUploadSelector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderUploadSelector;
    @XmlElementRef(name = "OrderUrgency", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderUrgency;
    @XmlElement(name = "OrderVersion")
    protected Long orderVersion;
    @XmlElementRef(name = "OverQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> overQuantities;
    @XmlElementRef(name = "PlannedQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedQuantities;
    @XmlElementRef(name = "Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> quantities;
    @XmlElement(name = "RecurringVisitNumber")
    protected Integer recurringVisitNumber;
    @XmlElement(name = "Sequence")
    protected Integer sequence;
    @XmlElementRef(name = "ServiceLocationCustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> serviceLocationCustomProperties;
    @XmlElementRef(name = "ShortQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> shortQuantities;
    @XmlElementRef(name = "SignatureCaptureEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> signatureCaptureEntityKey;
    @XmlElement(name = "SkipSignature")
    protected Boolean skipSignature;
    @XmlElementRef(name = "StopActionLineItemQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStopActionLineItemQuantities> stopActionLineItemQuantities;
    @XmlElementRef(name = "StopActionType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopActionTypeType;
    @XmlElementRef(name = "Task", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Task> task;

    /**
     * Obtém o valor da propriedade consignee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsignee() {
        return consignee;
    }

    /**
     * Define o valor da propriedade consignee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsignee(JAXBElement<String> value) {
        this.consignee = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDamagedQuantities() {
        return damagedQuantities;
    }

    /**
     * Define o valor da propriedade damagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDamagedQuantities(JAXBElement<Quantities> value) {
        this.damagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade entryMethodOrderEntryMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntryMethodOrderEntryMethod() {
        return entryMethodOrderEntryMethod;
    }

    /**
     * Define o valor da propriedade entryMethodOrderEntryMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntryMethodOrderEntryMethod(JAXBElement<String> value) {
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
     * Obtém o valor da propriedade lineItemTypeDefaultOrderLineItemPreference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineItemTypeDefaultOrderLineItemPreference() {
        return lineItemTypeDefaultOrderLineItemPreference;
    }

    /**
     * Define o valor da propriedade lineItemTypeDefaultOrderLineItemPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineItemTypeDefaultOrderLineItemPreference(JAXBElement<String> value) {
        this.lineItemTypeDefaultOrderLineItemPreference = value;
    }

    /**
     * Obtém o valor da propriedade orderAdditionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOrderAdditionalServiceTime() {
        return orderAdditionalServiceTime;
    }

    /**
     * Define o valor da propriedade orderAdditionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOrderAdditionalServiceTime(Duration value) {
        this.orderAdditionalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade orderBeginDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOrderBeginDate() {
        return orderBeginDate;
    }

    /**
     * Define o valor da propriedade orderBeginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOrderBeginDate(JAXBElement<XMLGregorianCalendar> value) {
        this.orderBeginDate = value;
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
     * Obtém o valor da propriedade orderCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getOrderCoordinate() {
        return orderCoordinate;
    }

    /**
     * Define o valor da propriedade orderCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setOrderCoordinate(JAXBElement<Coordinate> value) {
        this.orderCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade orderCreatedBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderCreatedBy() {
        return orderCreatedBy;
    }

    /**
     * Define o valor da propriedade orderCreatedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderCreatedBy(JAXBElement<String> value) {
        this.orderCreatedBy = value;
    }

    /**
     * Obtém o valor da propriedade orderCreatedTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderCreatedTime() {
        return orderCreatedTime;
    }

    /**
     * Define o valor da propriedade orderCreatedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderCreatedTime(XMLGregorianCalendar value) {
        this.orderCreatedTime = value;
    }

    /**
     * Obtém o valor da propriedade orderCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDictionaryEntry }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDictionaryEntry> getOrderCustomProperties() {
        return orderCustomProperties;
    }

    /**
     * Define o valor da propriedade orderCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDictionaryEntry }{@code >}
     *     
     */
    public void setOrderCustomProperties(JAXBElement<ArrayOfDictionaryEntry> value) {
        this.orderCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade orderEndDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOrderEndDate() {
        return orderEndDate;
    }

    /**
     * Define o valor da propriedade orderEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOrderEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.orderEndDate = value;
    }

    /**
     * Obtém o valor da propriedade orderEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderEntityKey() {
        return orderEntityKey;
    }

    /**
     * Define o valor da propriedade orderEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderEntityKey(Long value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderIdentifier() {
        return orderIdentifier;
    }

    /**
     * Define o valor da propriedade orderIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderIdentifier(JAXBElement<String> value) {
        this.orderIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderManagedByUserEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderManagedByUserEntityKey() {
        return orderManagedByUserEntityKey;
    }

    /**
     * Define o valor da propriedade orderManagedByUserEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderManagedByUserEntityKey(Long value) {
        this.orderManagedByUserEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderModifiedBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderModifiedBy() {
        return orderModifiedBy;
    }

    /**
     * Define o valor da propriedade orderModifiedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderModifiedBy(JAXBElement<String> value) {
        this.orderModifiedBy = value;
    }

    /**
     * Obtém o valor da propriedade orderModifiedTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderModifiedTime() {
        return orderModifiedTime;
    }

    /**
     * Define o valor da propriedade orderModifiedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderModifiedTime(XMLGregorianCalendar value) {
        this.orderModifiedTime = value;
    }

    /**
     * Obtém o valor da propriedade orderNetRevenue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOrderNetRevenue() {
        return orderNetRevenue;
    }

    /**
     * Define o valor da propriedade orderNetRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOrderNetRevenue(JAXBElement<Double> value) {
        this.orderNetRevenue = value;
    }

    /**
     * Obtém o valor da propriedade orderNumberOfLineItems.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderNumberOfLineItems() {
        return orderNumberOfLineItems;
    }

    /**
     * Define o valor da propriedade orderNumberOfLineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderNumberOfLineItems(Integer value) {
        this.orderNumberOfLineItems = value;
    }

    /**
     * Obtém o valor da propriedade orderOpenCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderOpenCloseDetail> getOrderOpenCloseDetails() {
        return orderOpenCloseDetails;
    }

    /**
     * Define o valor da propriedade orderOpenCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderOpenCloseDetail }{@code >}
     *     
     */
    public void setOrderOpenCloseDetails(JAXBElement<ArrayOfOrderOpenCloseDetail> value) {
        this.orderOpenCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedDeliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOrderPlannedDeliveryCategory1Quantities() {
        return orderPlannedDeliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedDeliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOrderPlannedDeliveryCategory1Quantities(JAXBElement<Quantities> value) {
        this.orderPlannedDeliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedDeliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOrderPlannedDeliveryCategory2Quantities() {
        return orderPlannedDeliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedDeliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOrderPlannedDeliveryCategory2Quantities(JAXBElement<Quantities> value) {
        this.orderPlannedDeliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedDeliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOrderPlannedDeliveryCategory3Quantities() {
        return orderPlannedDeliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedDeliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOrderPlannedDeliveryCategory3Quantities(JAXBElement<Quantities> value) {
        this.orderPlannedDeliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedPickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOrderPlannedPickupCategory1Quantities() {
        return orderPlannedPickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedPickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOrderPlannedPickupCategory1Quantities(JAXBElement<Quantities> value) {
        this.orderPlannedPickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedPickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOrderPlannedPickupCategory2Quantities() {
        return orderPlannedPickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedPickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOrderPlannedPickupCategory2Quantities(JAXBElement<Quantities> value) {
        this.orderPlannedPickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPlannedPickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOrderPlannedPickupCategory3Quantities() {
        return orderPlannedPickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade orderPlannedPickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOrderPlannedPickupCategory3Quantities(JAXBElement<Quantities> value) {
        this.orderPlannedPickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade orderPreferredRouteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderPreferredRouteIdentifier() {
        return orderPreferredRouteIdentifier;
    }

    /**
     * Define o valor da propriedade orderPreferredRouteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderPreferredRouteIdentifier(JAXBElement<String> value) {
        this.orderPreferredRouteIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderPreferredRouteIdentifierOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderPreferredRouteIdentifierOverride() {
        return orderPreferredRouteIdentifierOverride;
    }

    /**
     * Define o valor da propriedade orderPreferredRouteIdentifierOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderPreferredRouteIdentifierOverride(JAXBElement<String> value) {
        this.orderPreferredRouteIdentifierOverride = value;
    }

    /**
     * Obtém o valor da propriedade orderRequiredRouteOriginEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderRequiredRouteOriginEntityKey() {
        return orderRequiredRouteOriginEntityKey;
    }

    /**
     * Define o valor da propriedade orderRequiredRouteOriginEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderRequiredRouteOriginEntityKey(JAXBElement<Long> value) {
        this.orderRequiredRouteOriginEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderSelector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderSelector() {
        return orderSelector;
    }

    /**
     * Define o valor da propriedade orderSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderSelector(JAXBElement<Integer> value) {
        this.orderSelector = value;
    }

    /**
     * Obtém o valor da propriedade orderServiceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderServiceWindowDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderServiceWindowDetail> getOrderServiceWindowDetails() {
        return orderServiceWindowDetails;
    }

    /**
     * Define o valor da propriedade orderServiceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderServiceWindowDetail }{@code >}
     *     
     */
    public void setOrderServiceWindowDetails(JAXBElement<ArrayOfOrderServiceWindowDetail> value) {
        this.orderServiceWindowDetails = value;
    }

    /**
     * Obtém o valor da propriedade orderSessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderSessionDescription() {
        return orderSessionDescription;
    }

    /**
     * Define o valor da propriedade orderSessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderSessionDescription(JAXBElement<String> value) {
        this.orderSessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade orderSessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderSessionEntityKey() {
        return orderSessionEntityKey;
    }

    /**
     * Define o valor da propriedade orderSessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderSessionEntityKey(JAXBElement<Long> value) {
        this.orderSessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderSessionStartDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOrderSessionStartDate() {
        return orderSessionStartDate;
    }

    /**
     * Define o valor da propriedade orderSessionStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOrderSessionStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.orderSessionStartDate = value;
    }

    /**
     * Obtém o valor da propriedade orderSpecialInstructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderSpecialInstructions() {
        return orderSpecialInstructions;
    }

    /**
     * Define o valor da propriedade orderSpecialInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderSpecialInstructions(JAXBElement<String> value) {
        this.orderSpecialInstructions = value;
    }

    /**
     * Obtém o valor da propriedade orderStateOrderState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderStateOrderState() {
        return orderStateOrderState;
    }

    /**
     * Define o valor da propriedade orderStateOrderState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderStateOrderState(JAXBElement<String> value) {
        this.orderStateOrderState = value;
    }

    /**
     * Obtém o valor da propriedade orderTakenBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderTakenBy() {
        return orderTakenBy;
    }

    /**
     * Define o valor da propriedade orderTakenBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderTakenBy(JAXBElement<String> value) {
        this.orderTakenBy = value;
    }

    /**
     * Obtém o valor da propriedade orderTypeOrderType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderTypeOrderType() {
        return orderTypeOrderType;
    }

    /**
     * Define o valor da propriedade orderTypeOrderType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderTypeOrderType(JAXBElement<String> value) {
        this.orderTypeOrderType = value;
    }

    /**
     * Obtém o valor da propriedade orderUploadSelector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderUploadSelector() {
        return orderUploadSelector;
    }

    /**
     * Define o valor da propriedade orderUploadSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderUploadSelector(JAXBElement<Integer> value) {
        this.orderUploadSelector = value;
    }

    /**
     * Obtém o valor da propriedade orderUrgency.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderUrgency() {
        return orderUrgency;
    }

    /**
     * Define o valor da propriedade orderUrgency.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderUrgency(JAXBElement<Integer> value) {
        this.orderUrgency = value;
    }

    /**
     * Obtém o valor da propriedade orderVersion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderVersion() {
        return orderVersion;
    }

    /**
     * Define o valor da propriedade orderVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderVersion(Long value) {
        this.orderVersion = value;
    }

    /**
     * Obtém o valor da propriedade overQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOverQuantities() {
        return overQuantities;
    }

    /**
     * Define o valor da propriedade overQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOverQuantities(JAXBElement<Quantities> value) {
        this.overQuantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedQuantities() {
        return plannedQuantities;
    }

    /**
     * Define o valor da propriedade plannedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedQuantities(JAXBElement<Quantities> value) {
        this.plannedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getQuantities() {
        return quantities;
    }

    /**
     * Define o valor da propriedade quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setQuantities(JAXBElement<Quantities> value) {
        this.quantities = value;
    }

    /**
     * Obtém o valor da propriedade recurringVisitNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurringVisitNumber() {
        return recurringVisitNumber;
    }

    /**
     * Define o valor da propriedade recurringVisitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurringVisitNumber(Integer value) {
        this.recurringVisitNumber = value;
    }

    /**
     * Obtém o valor da propriedade sequence.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Define o valor da propriedade sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getServiceLocationCustomProperties() {
        return serviceLocationCustomProperties;
    }

    /**
     * Define o valor da propriedade serviceLocationCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setServiceLocationCustomProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.serviceLocationCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getShortQuantities() {
        return shortQuantities;
    }

    /**
     * Define o valor da propriedade shortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setShortQuantities(JAXBElement<Quantities> value) {
        this.shortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade signatureCaptureEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSignatureCaptureEntityKey() {
        return signatureCaptureEntityKey;
    }

    /**
     * Define o valor da propriedade signatureCaptureEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSignatureCaptureEntityKey(JAXBElement<Long> value) {
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopActionLineItemQuantities }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStopActionLineItemQuantities> getStopActionLineItemQuantities() {
        return stopActionLineItemQuantities;
    }

    /**
     * Define o valor da propriedade stopActionLineItemQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopActionLineItemQuantities }{@code >}
     *     
     */
    public void setStopActionLineItemQuantities(JAXBElement<ArrayOfStopActionLineItemQuantities> value) {
        this.stopActionLineItemQuantities = value;
    }

    /**
     * Obtém o valor da propriedade stopActionTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopActionTypeType() {
        return stopActionTypeType;
    }

    /**
     * Define o valor da propriedade stopActionTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopActionTypeType(JAXBElement<String> value) {
        this.stopActionTypeType = value;
    }

    /**
     * Obtém o valor da propriedade task.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     
     */
    public JAXBElement<Task> getTask() {
        return task;
    }

    /**
     * Define o valor da propriedade task.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     
     */
    public void setTask(JAXBElement<Task> value) {
        this.task = value;
    }

}
