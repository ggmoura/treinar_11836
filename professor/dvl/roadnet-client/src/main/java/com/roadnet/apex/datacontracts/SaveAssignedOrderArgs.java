
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SaveAssignedOrderArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveAssignedOrderArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncreaseQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://roadnet.com/apex/DataContracts/}ArrayOfLineItem" minOccurs="0"/&gt;
 *         &lt;element name="ManagedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskOpenCloseOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifierOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriorityOverride" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RequiredOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RequiredRouteOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Selector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskServiceWindowOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TakenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UrgencyIncrease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveAssignedOrderArgs", propOrder = {
    "additionalServiceTime",
    "beginDate",
    "customProperties",
    "deliveryQuantities",
    "endDate",
    "forceBulkServiceTime",
    "identifier",
    "increaseQuantities",
    "lineItems",
    "managedByUserEntityKey",
    "netRevenue",
    "openCloseOverrides",
    "orderClassEntityKey",
    "pickupQuantities",
    "plannedDeliveryCategory1Quantities",
    "plannedDeliveryCategory2Quantities",
    "plannedDeliveryCategory3Quantities",
    "plannedPickupCategory1Quantities",
    "plannedPickupCategory2Quantities",
    "plannedPickupCategory3Quantities",
    "preferredRouteIdentifierOverride",
    "priorityOverride",
    "requiredOriginEntityKey",
    "requiredRouteOriginEntityKey",
    "selector",
    "serviceWindowOverrides",
    "specialInstructions",
    "takenBy",
    "uploadSelector",
    "urgency",
    "urgencyIncrease"
})
public class SaveAssignedOrderArgs
    extends DataTransferObject
{

    @XmlElement(name = "AdditionalServiceTime")
    protected Duration additionalServiceTime;
    @XmlElementRef(name = "BeginDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> beginDate;
    @XmlElementRef(name = "CustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> customProperties;
    @XmlElementRef(name = "DeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryQuantities;
    @XmlElementRef(name = "EndDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElement(name = "ForceBulkServiceTime")
    protected Boolean forceBulkServiceTime;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "IncreaseQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> increaseQuantities;
    @XmlElementRef(name = "LineItems", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineItem> lineItems;
    @XmlElement(name = "ManagedByUserEntityKey")
    protected Long managedByUserEntityKey;
    @XmlElementRef(name = "NetRevenue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> netRevenue;
    @XmlElementRef(name = "OpenCloseOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> openCloseOverrides;
    @XmlElement(name = "OrderClassEntityKey")
    protected Long orderClassEntityKey;
    @XmlElementRef(name = "PickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupQuantities;
    @XmlElementRef(name = "PlannedDeliveryCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedDeliveryCategory1Quantities;
    @XmlElementRef(name = "PlannedDeliveryCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedDeliveryCategory2Quantities;
    @XmlElementRef(name = "PlannedDeliveryCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedDeliveryCategory3Quantities;
    @XmlElementRef(name = "PlannedPickupCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedPickupCategory1Quantities;
    @XmlElementRef(name = "PlannedPickupCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedPickupCategory2Quantities;
    @XmlElementRef(name = "PlannedPickupCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedPickupCategory3Quantities;
    @XmlElementRef(name = "PreferredRouteIdentifierOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredRouteIdentifierOverride;
    @XmlElementRef(name = "PriorityOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> priorityOverride;
    @XmlElementRef(name = "RequiredOriginEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requiredOriginEntityKey;
    @XmlElementRef(name = "RequiredRouteOriginEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requiredRouteOriginEntityKey;
    @XmlElementRef(name = "Selector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> selector;
    @XmlElementRef(name = "ServiceWindowOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> serviceWindowOverrides;
    @XmlElementRef(name = "SpecialInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialInstructions;
    @XmlElementRef(name = "TakenBy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> takenBy;
    @XmlElementRef(name = "UploadSelector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uploadSelector;
    @XmlElement(name = "Urgency")
    protected Integer urgency;
    @XmlElement(name = "UrgencyIncrease")
    protected Integer urgencyIncrease;

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
     * Obtém o valor da propriedade beginDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBeginDate() {
        return beginDate;
    }

    /**
     * Define o valor da propriedade beginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBeginDate(JAXBElement<XMLGregorianCalendar> value) {
        this.beginDate = value;
    }

    /**
     * Obtém o valor da propriedade customProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getCustomProperties() {
        return customProperties;
    }

    /**
     * Define o valor da propriedade customProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setCustomProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.customProperties = value;
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
     * Obtém o valor da propriedade endDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Define o valor da propriedade endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = value;
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
     * Obtém o valor da propriedade increaseQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getIncreaseQuantities() {
        return increaseQuantities;
    }

    /**
     * Define o valor da propriedade increaseQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setIncreaseQuantities(JAXBElement<Quantities> value) {
        this.increaseQuantities = value;
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
     * Obtém o valor da propriedade managedByUserEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManagedByUserEntityKey() {
        return managedByUserEntityKey;
    }

    /**
     * Define o valor da propriedade managedByUserEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManagedByUserEntityKey(Long value) {
        this.managedByUserEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade netRevenue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNetRevenue() {
        return netRevenue;
    }

    /**
     * Define o valor da propriedade netRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNetRevenue(JAXBElement<Double> value) {
        this.netRevenue = value;
    }

    /**
     * Obtém o valor da propriedade openCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskOpenCloseOverrideDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> getOpenCloseOverrides() {
        return openCloseOverrides;
    }

    /**
     * Define o valor da propriedade openCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskOpenCloseOverrideDetail }{@code >}
     *     
     */
    public void setOpenCloseOverrides(JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> value) {
        this.openCloseOverrides = value;
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
     * Obtém o valor da propriedade plannedDeliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedDeliveryCategory1Quantities() {
        return plannedDeliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedDeliveryCategory1Quantities(JAXBElement<Quantities> value) {
        this.plannedDeliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedDeliveryCategory2Quantities() {
        return plannedDeliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedDeliveryCategory2Quantities(JAXBElement<Quantities> value) {
        this.plannedDeliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedDeliveryCategory3Quantities() {
        return plannedDeliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedDeliveryCategory3Quantities(JAXBElement<Quantities> value) {
        this.plannedDeliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedPickupCategory1Quantities() {
        return plannedPickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedPickupCategory1Quantities(JAXBElement<Quantities> value) {
        this.plannedPickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedPickupCategory2Quantities() {
        return plannedPickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedPickupCategory2Quantities(JAXBElement<Quantities> value) {
        this.plannedPickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedPickupCategory3Quantities() {
        return plannedPickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedPickupCategory3Quantities(JAXBElement<Quantities> value) {
        this.plannedPickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade preferredRouteIdentifierOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredRouteIdentifierOverride() {
        return preferredRouteIdentifierOverride;
    }

    /**
     * Define o valor da propriedade preferredRouteIdentifierOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredRouteIdentifierOverride(JAXBElement<String> value) {
        this.preferredRouteIdentifierOverride = value;
    }

    /**
     * Obtém o valor da propriedade priorityOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPriorityOverride() {
        return priorityOverride;
    }

    /**
     * Define o valor da propriedade priorityOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPriorityOverride(JAXBElement<Integer> value) {
        this.priorityOverride = value;
    }

    /**
     * Obtém o valor da propriedade requiredOriginEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequiredOriginEntityKey() {
        return requiredOriginEntityKey;
    }

    /**
     * Define o valor da propriedade requiredOriginEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequiredOriginEntityKey(JAXBElement<Long> value) {
        this.requiredOriginEntityKey = value;
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
     * Obtém o valor da propriedade serviceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskServiceWindowOverrideDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> getServiceWindowOverrides() {
        return serviceWindowOverrides;
    }

    /**
     * Define o valor da propriedade serviceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskServiceWindowOverrideDetail }{@code >}
     *     
     */
    public void setServiceWindowOverrides(JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> value) {
        this.serviceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade specialInstructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Define o valor da propriedade specialInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialInstructions(JAXBElement<String> value) {
        this.specialInstructions = value;
    }

    /**
     * Obtém o valor da propriedade takenBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTakenBy() {
        return takenBy;
    }

    /**
     * Define o valor da propriedade takenBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTakenBy(JAXBElement<String> value) {
        this.takenBy = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getUrgency() {
        return urgency;
    }

    /**
     * Define o valor da propriedade urgency.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUrgency(Integer value) {
        this.urgency = value;
    }

    /**
     * Obtém o valor da propriedade urgencyIncrease.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUrgencyIncrease() {
        return urgencyIncrease;
    }

    /**
     * Define o valor da propriedade urgencyIncrease.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUrgencyIncrease(Integer value) {
        this.urgencyIncrease = value;
    }

}
