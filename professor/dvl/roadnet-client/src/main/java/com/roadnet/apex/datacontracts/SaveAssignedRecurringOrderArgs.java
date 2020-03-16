
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SaveAssignedRecurringOrderArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveAssignedRecurringOrderArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AnchorDaysRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AnchorWeeksRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CurrentServicePatternEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_PreviousDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="ForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsConsideredForAssignDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://roadnet.com/apex/DataContracts/}ArrayOfLineItem" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfDaysToShift" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskOpenCloseOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PreviousDeliveryWeeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousOriginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTerritoryIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousWeek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RequiredOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RequiredRouteOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Selector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskServiceWindowOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorWeeks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveAssignedRecurringOrderArgs", propOrder = {
    "additionalServiceTime",
    "anchorDaysRange",
    "anchorWeeksRange",
    "currentServicePatternEntityKey",
    "customProperties",
    "dayOfWeekFlagsPreviousDays",
    "deliveryQuantities",
    "forceBulkServiceTime",
    "identifier",
    "isConsideredForAssignDays",
    "lineItems",
    "numberOfDaysToShift",
    "openCloseOverrides",
    "orderClassEntityKey",
    "pickupQuantities",
    "previousDeliveryWeeks",
    "previousOriginId",
    "previousTerritoryIds",
    "previousWeek",
    "requiredOriginEntityKey",
    "requiredRouteOriginEntityKey",
    "selector",
    "serviceLocationEntityKey",
    "servicePatternSetEntityKey",
    "serviceWindowOverrides",
    "shouldUseAnchorDays",
    "shouldUseAnchorWeeks",
    "uploadSelector"
})
public class SaveAssignedRecurringOrderArgs
    extends DataTransferObject
{

    @XmlElement(name = "AdditionalServiceTime")
    protected Duration additionalServiceTime;
    @XmlElement(name = "AnchorDaysRange")
    protected Integer anchorDaysRange;
    @XmlElement(name = "AnchorWeeksRange")
    protected Integer anchorWeeksRange;
    @XmlElementRef(name = "CurrentServicePatternEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> currentServicePatternEntityKey;
    @XmlElementRef(name = "CustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> customProperties;
    @XmlElementRef(name = "DayOfWeekFlags_PreviousDays", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsPreviousDays;
    @XmlElementRef(name = "DeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryQuantities;
    @XmlElement(name = "ForceBulkServiceTime")
    protected Boolean forceBulkServiceTime;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsConsideredForAssignDays")
    protected Boolean isConsideredForAssignDays;
    @XmlElementRef(name = "LineItems", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineItem> lineItems;
    @XmlElement(name = "NumberOfDaysToShift")
    protected Integer numberOfDaysToShift;
    @XmlElementRef(name = "OpenCloseOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> openCloseOverrides;
    @XmlElement(name = "OrderClassEntityKey")
    protected Long orderClassEntityKey;
    @XmlElementRef(name = "PickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupQuantities;
    @XmlElementRef(name = "PreviousDeliveryWeeks", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousDeliveryWeeks;
    @XmlElementRef(name = "PreviousOriginId", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousOriginId;
    @XmlElementRef(name = "PreviousTerritoryIds", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousTerritoryIds;
    @XmlElement(name = "PreviousWeek")
    protected Integer previousWeek;
    @XmlElementRef(name = "RequiredOriginEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requiredOriginEntityKey;
    @XmlElementRef(name = "RequiredRouteOriginEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requiredRouteOriginEntityKey;
    @XmlElementRef(name = "Selector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> selector;
    @XmlElementRef(name = "ServiceLocationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceLocationEntityKey;
    @XmlElementRef(name = "ServicePatternSetEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> servicePatternSetEntityKey;
    @XmlElementRef(name = "ServiceWindowOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> serviceWindowOverrides;
    @XmlElement(name = "ShouldUseAnchorDays")
    protected Boolean shouldUseAnchorDays;
    @XmlElement(name = "ShouldUseAnchorWeeks")
    protected Boolean shouldUseAnchorWeeks;
    @XmlElementRef(name = "UploadSelector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uploadSelector;

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
     * Obtém o valor da propriedade anchorDaysRange.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnchorDaysRange() {
        return anchorDaysRange;
    }

    /**
     * Define o valor da propriedade anchorDaysRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnchorDaysRange(Integer value) {
        this.anchorDaysRange = value;
    }

    /**
     * Obtém o valor da propriedade anchorWeeksRange.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnchorWeeksRange() {
        return anchorWeeksRange;
    }

    /**
     * Define o valor da propriedade anchorWeeksRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnchorWeeksRange(Integer value) {
        this.anchorWeeksRange = value;
    }

    /**
     * Obtém o valor da propriedade currentServicePatternEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCurrentServicePatternEntityKey() {
        return currentServicePatternEntityKey;
    }

    /**
     * Define o valor da propriedade currentServicePatternEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCurrentServicePatternEntityKey(JAXBElement<Long> value) {
        this.currentServicePatternEntityKey = value;
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
     * Obtém o valor da propriedade dayOfWeekFlagsPreviousDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlagsPreviousDays() {
        return dayOfWeekFlagsPreviousDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsPreviousDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlagsPreviousDays(JAXBElement<String> value) {
        this.dayOfWeekFlagsPreviousDays = value;
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
     * Obtém o valor da propriedade numberOfDaysToShift.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDaysToShift() {
        return numberOfDaysToShift;
    }

    /**
     * Define o valor da propriedade numberOfDaysToShift.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDaysToShift(Integer value) {
        this.numberOfDaysToShift = value;
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
     * Obtém o valor da propriedade previousDeliveryWeeks.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousDeliveryWeeks() {
        return previousDeliveryWeeks;
    }

    /**
     * Define o valor da propriedade previousDeliveryWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousDeliveryWeeks(JAXBElement<String> value) {
        this.previousDeliveryWeeks = value;
    }

    /**
     * Obtém o valor da propriedade previousOriginId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousOriginId() {
        return previousOriginId;
    }

    /**
     * Define o valor da propriedade previousOriginId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousOriginId(JAXBElement<String> value) {
        this.previousOriginId = value;
    }

    /**
     * Obtém o valor da propriedade previousTerritoryIds.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousTerritoryIds() {
        return previousTerritoryIds;
    }

    /**
     * Define o valor da propriedade previousTerritoryIds.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousTerritoryIds(JAXBElement<String> value) {
        this.previousTerritoryIds = value;
    }

    /**
     * Obtém o valor da propriedade previousWeek.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousWeek() {
        return previousWeek;
    }

    /**
     * Define o valor da propriedade previousWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousWeek(Integer value) {
        this.previousWeek = value;
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
     * Obtém o valor da propriedade serviceLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceLocationEntityKey() {
        return serviceLocationEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceLocationEntityKey(JAXBElement<Long> value) {
        this.serviceLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade servicePatternSetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServicePatternSetEntityKey() {
        return servicePatternSetEntityKey;
    }

    /**
     * Define o valor da propriedade servicePatternSetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServicePatternSetEntityKey(JAXBElement<Long> value) {
        this.servicePatternSetEntityKey = value;
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

}
