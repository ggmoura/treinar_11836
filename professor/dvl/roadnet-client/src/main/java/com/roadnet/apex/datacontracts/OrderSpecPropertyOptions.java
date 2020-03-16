
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de OrderSpecPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderSpecPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryAdditionalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryCoordinateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryOpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryOpenCloseOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryServiceWindowOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncreaseQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemsOptions" type="{http://roadnet.com/apex/DataContracts/}LineItemPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ManagedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupAdditionalServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupCoordinateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupOpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupOpenCloseOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupServiceWindowOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifierOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequiredDestinationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequiredOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Selector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TakenBy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UrgencyIncrease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderSpecPropertyOptions", propOrder = {
    "additionalServiceTime",
    "beginDate",
    "coordinateOverride",
    "deliveryAdditionalServiceTime",
    "deliveryCoordinateOverride",
    "deliveryLocationEntityKey",
    "deliveryOpenCloseOverrides",
    "deliveryOpenCloseOverridesOptions",
    "deliveryQuantities",
    "deliveryServiceWindowOverrides",
    "deliveryServiceWindowOverridesOptions",
    "endDate",
    "forceBulkServiceTime",
    "identifier",
    "increaseQuantities",
    "lineItems",
    "lineItemsOptions",
    "managedByUserEntityKey",
    "netRevenue",
    "openCloseOverrides",
    "openCloseOverridesOptions",
    "orderClassEntityKey",
    "pickupAdditionalServiceTime",
    "pickupCoordinateOverride",
    "pickupLocationEntityKey",
    "pickupOpenCloseOverrides",
    "pickupOpenCloseOverridesOptions",
    "pickupQuantities",
    "pickupServiceWindowOverrides",
    "pickupServiceWindowOverridesOptions",
    "plannedDeliveryCategory1Quantities",
    "plannedDeliveryCategory2Quantities",
    "plannedDeliveryCategory3Quantities",
    "plannedPickupCategory1Quantities",
    "plannedPickupCategory2Quantities",
    "plannedPickupCategory3Quantities",
    "preferredRouteIdentifierOverride",
    "quantities",
    "regionEntityKey",
    "requiredDestinationEntityKey",
    "requiredOriginEntityKey",
    "selector",
    "serviceLocationEntityKey",
    "serviceWindowOverrides",
    "serviceWindowOverridesOptions",
    "sessionEntityKey",
    "specialInstructions",
    "takenBy",
    "uploadSelector",
    "urgency",
    "urgencyIncrease"
})
public class OrderSpecPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AdditionalServiceTime")
    protected Boolean additionalServiceTime;
    @XmlElement(name = "BeginDate")
    protected Boolean beginDate;
    @XmlElement(name = "CoordinateOverride")
    protected Boolean coordinateOverride;
    @XmlElement(name = "DeliveryAdditionalServiceTime")
    protected Boolean deliveryAdditionalServiceTime;
    @XmlElement(name = "DeliveryCoordinateOverride")
    protected Boolean deliveryCoordinateOverride;
    @XmlElement(name = "DeliveryLocationEntityKey")
    protected Boolean deliveryLocationEntityKey;
    @XmlElement(name = "DeliveryOpenCloseOverrides")
    protected Boolean deliveryOpenCloseOverrides;
    @XmlElementRef(name = "DeliveryOpenCloseOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> deliveryOpenCloseOverridesOptions;
    @XmlElement(name = "DeliveryQuantities")
    protected Boolean deliveryQuantities;
    @XmlElement(name = "DeliveryServiceWindowOverrides")
    protected Boolean deliveryServiceWindowOverrides;
    @XmlElementRef(name = "DeliveryServiceWindowOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceWindowDetailPropertyOptions> deliveryServiceWindowOverridesOptions;
    @XmlElement(name = "EndDate")
    protected Boolean endDate;
    @XmlElement(name = "ForceBulkServiceTime")
    protected Boolean forceBulkServiceTime;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IncreaseQuantities")
    protected Boolean increaseQuantities;
    @XmlElement(name = "LineItems")
    protected Boolean lineItems;
    @XmlElementRef(name = "LineItemsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LineItemPropertyOptions> lineItemsOptions;
    @XmlElement(name = "ManagedByUserEntityKey")
    protected Boolean managedByUserEntityKey;
    @XmlElement(name = "NetRevenue")
    protected Boolean netRevenue;
    @XmlElement(name = "OpenCloseOverrides")
    protected Boolean openCloseOverrides;
    @XmlElementRef(name = "OpenCloseOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> openCloseOverridesOptions;
    @XmlElement(name = "OrderClassEntityKey")
    protected Boolean orderClassEntityKey;
    @XmlElement(name = "PickupAdditionalServiceTime")
    protected Boolean pickupAdditionalServiceTime;
    @XmlElement(name = "PickupCoordinateOverride")
    protected Boolean pickupCoordinateOverride;
    @XmlElement(name = "PickupLocationEntityKey")
    protected Boolean pickupLocationEntityKey;
    @XmlElement(name = "PickupOpenCloseOverrides")
    protected Boolean pickupOpenCloseOverrides;
    @XmlElementRef(name = "PickupOpenCloseOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> pickupOpenCloseOverridesOptions;
    @XmlElement(name = "PickupQuantities")
    protected Boolean pickupQuantities;
    @XmlElement(name = "PickupServiceWindowOverrides")
    protected Boolean pickupServiceWindowOverrides;
    @XmlElementRef(name = "PickupServiceWindowOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceWindowDetailPropertyOptions> pickupServiceWindowOverridesOptions;
    @XmlElement(name = "PlannedDeliveryCategory1Quantities")
    protected Boolean plannedDeliveryCategory1Quantities;
    @XmlElement(name = "PlannedDeliveryCategory2Quantities")
    protected Boolean plannedDeliveryCategory2Quantities;
    @XmlElement(name = "PlannedDeliveryCategory3Quantities")
    protected Boolean plannedDeliveryCategory3Quantities;
    @XmlElement(name = "PlannedPickupCategory1Quantities")
    protected Boolean plannedPickupCategory1Quantities;
    @XmlElement(name = "PlannedPickupCategory2Quantities")
    protected Boolean plannedPickupCategory2Quantities;
    @XmlElement(name = "PlannedPickupCategory3Quantities")
    protected Boolean plannedPickupCategory3Quantities;
    @XmlElement(name = "PreferredRouteIdentifierOverride")
    protected Boolean preferredRouteIdentifierOverride;
    @XmlElement(name = "Quantities")
    protected Boolean quantities;
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
    @XmlElement(name = "ServiceWindowOverrides")
    protected Boolean serviceWindowOverrides;
    @XmlElementRef(name = "ServiceWindowOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceWindowDetailPropertyOptions> serviceWindowOverridesOptions;
    @XmlElement(name = "SessionEntityKey")
    protected Boolean sessionEntityKey;
    @XmlElement(name = "SpecialInstructions")
    protected Boolean specialInstructions;
    @XmlElement(name = "TakenBy")
    protected Boolean takenBy;
    @XmlElement(name = "UploadSelector")
    protected Boolean uploadSelector;
    @XmlElement(name = "Urgency")
    protected Boolean urgency;
    @XmlElement(name = "UrgencyIncrease")
    protected Boolean urgencyIncrease;

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
     * Obtém o valor da propriedade deliveryAdditionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryAdditionalServiceTime() {
        return deliveryAdditionalServiceTime;
    }

    /**
     * Define o valor da propriedade deliveryAdditionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryAdditionalServiceTime(Boolean value) {
        this.deliveryAdditionalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade deliveryCoordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryCoordinateOverride() {
        return deliveryCoordinateOverride;
    }

    /**
     * Define o valor da propriedade deliveryCoordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryCoordinateOverride(Boolean value) {
        this.deliveryCoordinateOverride = value;
    }

    /**
     * Obtém o valor da propriedade deliveryLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryLocationEntityKey() {
        return deliveryLocationEntityKey;
    }

    /**
     * Define o valor da propriedade deliveryLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryLocationEntityKey(Boolean value) {
        this.deliveryLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade deliveryOpenCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryOpenCloseOverrides() {
        return deliveryOpenCloseOverrides;
    }

    /**
     * Define o valor da propriedade deliveryOpenCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryOpenCloseOverrides(Boolean value) {
        this.deliveryOpenCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade deliveryOpenCloseOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpenCloseDetailPropertyOptions> getDeliveryOpenCloseOverridesOptions() {
        return deliveryOpenCloseOverridesOptions;
    }

    /**
     * Define o valor da propriedade deliveryOpenCloseOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setDeliveryOpenCloseOverridesOptions(JAXBElement<OpenCloseDetailPropertyOptions> value) {
        this.deliveryOpenCloseOverridesOptions = value;
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
     * Obtém o valor da propriedade deliveryServiceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryServiceWindowOverrides() {
        return deliveryServiceWindowOverrides;
    }

    /**
     * Define o valor da propriedade deliveryServiceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryServiceWindowOverrides(Boolean value) {
        this.deliveryServiceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade deliveryServiceWindowOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceWindowDetailPropertyOptions> getDeliveryServiceWindowOverridesOptions() {
        return deliveryServiceWindowOverridesOptions;
    }

    /**
     * Define o valor da propriedade deliveryServiceWindowOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setDeliveryServiceWindowOverridesOptions(JAXBElement<ServiceWindowDetailPropertyOptions> value) {
        this.deliveryServiceWindowOverridesOptions = value;
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
     * Obtém o valor da propriedade pickupAdditionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupAdditionalServiceTime() {
        return pickupAdditionalServiceTime;
    }

    /**
     * Define o valor da propriedade pickupAdditionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupAdditionalServiceTime(Boolean value) {
        this.pickupAdditionalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade pickupCoordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupCoordinateOverride() {
        return pickupCoordinateOverride;
    }

    /**
     * Define o valor da propriedade pickupCoordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupCoordinateOverride(Boolean value) {
        this.pickupCoordinateOverride = value;
    }

    /**
     * Obtém o valor da propriedade pickupLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupLocationEntityKey() {
        return pickupLocationEntityKey;
    }

    /**
     * Define o valor da propriedade pickupLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupLocationEntityKey(Boolean value) {
        this.pickupLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade pickupOpenCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupOpenCloseOverrides() {
        return pickupOpenCloseOverrides;
    }

    /**
     * Define o valor da propriedade pickupOpenCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupOpenCloseOverrides(Boolean value) {
        this.pickupOpenCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade pickupOpenCloseOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpenCloseDetailPropertyOptions> getPickupOpenCloseOverridesOptions() {
        return pickupOpenCloseOverridesOptions;
    }

    /**
     * Define o valor da propriedade pickupOpenCloseOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setPickupOpenCloseOverridesOptions(JAXBElement<OpenCloseDetailPropertyOptions> value) {
        this.pickupOpenCloseOverridesOptions = value;
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
     * Obtém o valor da propriedade pickupServiceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupServiceWindowOverrides() {
        return pickupServiceWindowOverrides;
    }

    /**
     * Define o valor da propriedade pickupServiceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupServiceWindowOverrides(Boolean value) {
        this.pickupServiceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade pickupServiceWindowOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceWindowDetailPropertyOptions> getPickupServiceWindowOverridesOptions() {
        return pickupServiceWindowOverridesOptions;
    }

    /**
     * Define o valor da propriedade pickupServiceWindowOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setPickupServiceWindowOverridesOptions(JAXBElement<ServiceWindowDetailPropertyOptions> value) {
        this.pickupServiceWindowOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDeliveryCategory1Quantities() {
        return plannedDeliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDeliveryCategory1Quantities(Boolean value) {
        this.plannedDeliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDeliveryCategory2Quantities() {
        return plannedDeliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDeliveryCategory2Quantities(Boolean value) {
        this.plannedDeliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDeliveryCategory3Quantities() {
        return plannedDeliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDeliveryCategory3Quantities(Boolean value) {
        this.plannedDeliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedPickupCategory1Quantities() {
        return plannedPickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedPickupCategory1Quantities(Boolean value) {
        this.plannedPickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedPickupCategory2Quantities() {
        return plannedPickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedPickupCategory2Quantities(Boolean value) {
        this.plannedPickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedPickupCategory3Quantities() {
        return plannedPickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedPickupCategory3Quantities(Boolean value) {
        this.plannedPickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade preferredRouteIdentifierOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredRouteIdentifierOverride() {
        return preferredRouteIdentifierOverride;
    }

    /**
     * Define o valor da propriedade preferredRouteIdentifierOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredRouteIdentifierOverride(Boolean value) {
        this.preferredRouteIdentifierOverride = value;
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
     * Obtém o valor da propriedade specialInstructions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Define o valor da propriedade specialInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialInstructions(Boolean value) {
        this.specialInstructions = value;
    }

    /**
     * Obtém o valor da propriedade takenBy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTakenBy() {
        return takenBy;
    }

    /**
     * Define o valor da propriedade takenBy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTakenBy(Boolean value) {
        this.takenBy = value;
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

}
