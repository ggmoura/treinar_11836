
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
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de Task complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Task"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AtEligibleLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CancelledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateOverride" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantitiesReasonCode" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_LocationDeliveryDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DependentOn" type="{http://roadnet.com/apex/DataContracts/}Task" minOccurs="0"/&gt;
 *         &lt;element name="IncreaseQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="IsCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://roadnet.com/apex/DataContracts/}ArrayOfLineItem" minOccurs="0"/&gt;
 *         &lt;element name="LocationAccountEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="LocationAlternateContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="LocationContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="LocationCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationEquipmentTypeRestrictions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceLocationEquipmentTypeRestriction" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationStandardInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationType" type="{http://roadnet.com/apex/DataContracts/}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="LocationZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManipulationSource_CancelSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskOpenCloseOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderCancelReasonCode" type="{http://roadnet.com/apex/DataContracts/}OrderCancelReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="OrderEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantitiesReasonCode" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlannedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PriorityOverride" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesReasonCode" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityInputQuality_QuantityInputQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityInputTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteHeaders" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteHeader" minOccurs="0"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskServiceWindowOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantitiesReasonCode" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopCancelReasonCode" type="{http://roadnet.com/apex/DataContracts/}StopCancelReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="TaskState_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaskType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_LocationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Task", propOrder = {
    "additionalServiceTime",
    "atEligibleLocation",
    "cancelledTime",
    "coordinateOverride",
    "damagedQuantities",
    "damagedQuantitiesReasonCode",
    "damagedQuantitiesReasonCodeDescription",
    "dayOfWeekFlagsLocationDeliveryDays",
    "dependentOn",
    "increaseQuantities",
    "isCancelled",
    "isPrimary",
    "lineItems",
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
    "orderCancelReasonCode",
    "orderEntityKey",
    "overQuantities",
    "overQuantitiesReasonCode",
    "overQuantitiesReasonCodeDescription",
    "plannedQuantities",
    "priorityOverride",
    "quantities",
    "quantitiesReasonCode",
    "quantitiesReasonCodeDescription",
    "quantityInputQualityQuantityInputQuality",
    "quantityInputTimestamp",
    "routeHeaders",
    "sequence",
    "serviceWindowOverrides",
    "shortQuantities",
    "shortQuantitiesReasonCode",
    "shortQuantitiesReasonCodeDescription",
    "stopCancelReasonCode",
    "taskStateState",
    "taskTypeType",
    "worldTimeZoneLocationTimeZone"
})
public class Task
    extends DomainEntity
{

    @XmlElement(name = "AdditionalServiceTime")
    protected Duration additionalServiceTime;
    @XmlElement(name = "AtEligibleLocation")
    protected Boolean atEligibleLocation;
    @XmlElementRef(name = "CancelledTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> cancelledTime;
    @XmlElementRef(name = "CoordinateOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinateOverride;
    @XmlElementRef(name = "DamagedQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> damagedQuantities;
    @XmlElementRef(name = "DamagedQuantitiesReasonCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCode> damagedQuantitiesReasonCode;
    @XmlElementRef(name = "DamagedQuantitiesReasonCodeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> damagedQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "DayOfWeekFlags_LocationDeliveryDays", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsLocationDeliveryDays;
    @XmlElementRef(name = "DependentOn", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Task> dependentOn;
    @XmlElementRef(name = "IncreaseQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> increaseQuantities;
    @XmlElement(name = "IsCancelled")
    protected Boolean isCancelled;
    @XmlElement(name = "IsPrimary")
    protected Boolean isPrimary;
    @XmlElementRef(name = "LineItems", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineItem> lineItems;
    @XmlElementRef(name = "LocationAccountEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> locationAccountEntityKey;
    @XmlElementRef(name = "LocationAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> locationAddress;
    @XmlElementRef(name = "LocationAlternateContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> locationAlternateContact;
    @XmlElementRef(name = "LocationContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> locationContact;
    @XmlElementRef(name = "LocationCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> locationCoordinate;
    @XmlElementRef(name = "LocationDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationDescription;
    @XmlElement(name = "LocationEntityKey")
    protected Long locationEntityKey;
    @XmlElementRef(name = "LocationEquipmentTypeRestrictions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> locationEquipmentTypeRestrictions;
    @XmlElementRef(name = "LocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationIdentifier;
    @XmlElement(name = "LocationIsDeleted")
    protected Boolean locationIsDeleted;
    @XmlElementRef(name = "LocationPhoneNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationPhoneNumber;
    @XmlElement(name = "LocationPriority")
    protected Integer locationPriority;
    @XmlElementRef(name = "LocationStandardInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationStandardInstructions;
    @XmlElement(name = "LocationType")
    @XmlSchemaType(name = "string")
    protected LocationType locationType;
    @XmlElementRef(name = "LocationZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationZone;
    @XmlElementRef(name = "ManipulationSource_CancelSource", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manipulationSourceCancelSource;
    @XmlElementRef(name = "OpenCloseOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> openCloseOverrides;
    @XmlElementRef(name = "OrderCancelReasonCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderCancelReasonCode> orderCancelReasonCode;
    @XmlElement(name = "OrderEntityKey")
    protected Long orderEntityKey;
    @XmlElementRef(name = "OverQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> overQuantities;
    @XmlElementRef(name = "OverQuantitiesReasonCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCode> overQuantitiesReasonCode;
    @XmlElementRef(name = "OverQuantitiesReasonCodeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "PlannedQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedQuantities;
    @XmlElementRef(name = "PriorityOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> priorityOverride;
    @XmlElementRef(name = "Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> quantities;
    @XmlElementRef(name = "QuantitiesReasonCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCode> quantitiesReasonCode;
    @XmlElementRef(name = "QuantitiesReasonCodeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantitiesReasonCodeDescription;
    @XmlElementRef(name = "QuantityInputQuality_QuantityInputQuality", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantityInputQualityQuantityInputQuality;
    @XmlElementRef(name = "QuantityInputTimestamp", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> quantityInputTimestamp;
    @XmlElementRef(name = "RouteHeaders", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteHeader> routeHeaders;
    @XmlElement(name = "Sequence")
    protected Integer sequence;
    @XmlElementRef(name = "ServiceWindowOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> serviceWindowOverrides;
    @XmlElementRef(name = "ShortQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> shortQuantities;
    @XmlElementRef(name = "ShortQuantitiesReasonCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCode> shortQuantitiesReasonCode;
    @XmlElementRef(name = "ShortQuantitiesReasonCodeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shortQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "StopCancelReasonCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StopCancelReasonCode> stopCancelReasonCode;
    @XmlElementRef(name = "TaskState_State", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taskStateState;
    @XmlElementRef(name = "TaskType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taskTypeType;
    @XmlElementRef(name = "WorldTimeZone_LocationTimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneLocationTimeZone;

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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCancelledTime() {
        return cancelledTime;
    }

    /**
     * Define o valor da propriedade cancelledTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCancelledTime(JAXBElement<XMLGregorianCalendar> value) {
        this.cancelledTime = value;
    }

    /**
     * Obtém o valor da propriedade coordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinateOverride() {
        return coordinateOverride;
    }

    /**
     * Define o valor da propriedade coordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinateOverride(JAXBElement<Coordinate> value) {
        this.coordinateOverride = value;
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
     * Obtém o valor da propriedade damagedQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCode> getDamagedQuantitiesReasonCode() {
        return damagedQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade damagedQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public void setDamagedQuantitiesReasonCode(JAXBElement<QuantityReasonCode> value) {
        this.damagedQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDamagedQuantitiesReasonCodeDescription() {
        return damagedQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade damagedQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDamagedQuantitiesReasonCodeDescription(JAXBElement<String> value) {
        this.damagedQuantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsLocationDeliveryDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlagsLocationDeliveryDays() {
        return dayOfWeekFlagsLocationDeliveryDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsLocationDeliveryDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlagsLocationDeliveryDays(JAXBElement<String> value) {
        this.dayOfWeekFlagsLocationDeliveryDays = value;
    }

    /**
     * Obtém o valor da propriedade dependentOn.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     
     */
    public JAXBElement<Task> getDependentOn() {
        return dependentOn;
    }

    /**
     * Define o valor da propriedade dependentOn.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     
     */
    public void setDependentOn(JAXBElement<Task> value) {
        this.dependentOn = value;
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
     * Obtém o valor da propriedade locationAccountEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationAccountEntityKey() {
        return locationAccountEntityKey;
    }

    /**
     * Define o valor da propriedade locationAccountEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationAccountEntityKey(JAXBElement<Long> value) {
        this.locationAccountEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getLocationAddress() {
        return locationAddress;
    }

    /**
     * Define o valor da propriedade locationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setLocationAddress(JAXBElement<Address> value) {
        this.locationAddress = value;
    }

    /**
     * Obtém o valor da propriedade locationAlternateContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getLocationAlternateContact() {
        return locationAlternateContact;
    }

    /**
     * Define o valor da propriedade locationAlternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setLocationAlternateContact(JAXBElement<PersonName> value) {
        this.locationAlternateContact = value;
    }

    /**
     * Obtém o valor da propriedade locationContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getLocationContact() {
        return locationContact;
    }

    /**
     * Define o valor da propriedade locationContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setLocationContact(JAXBElement<PersonName> value) {
        this.locationContact = value;
    }

    /**
     * Obtém o valor da propriedade locationCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getLocationCoordinate() {
        return locationCoordinate;
    }

    /**
     * Define o valor da propriedade locationCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setLocationCoordinate(JAXBElement<Coordinate> value) {
        this.locationCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade locationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationDescription() {
        return locationDescription;
    }

    /**
     * Define o valor da propriedade locationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationDescription(JAXBElement<String> value) {
        this.locationDescription = value;
    }

    /**
     * Obtém o valor da propriedade locationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationEntityKey() {
        return locationEntityKey;
    }

    /**
     * Define o valor da propriedade locationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationEntityKey(Long value) {
        this.locationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationEquipmentTypeRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationEquipmentTypeRestriction }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> getLocationEquipmentTypeRestrictions() {
        return locationEquipmentTypeRestrictions;
    }

    /**
     * Define o valor da propriedade locationEquipmentTypeRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationEquipmentTypeRestriction }{@code >}
     *     
     */
    public void setLocationEquipmentTypeRestrictions(JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> value) {
        this.locationEquipmentTypeRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade locationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Define o valor da propriedade locationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationIdentifier(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationPhoneNumber() {
        return locationPhoneNumber;
    }

    /**
     * Define o valor da propriedade locationPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationPhoneNumber(JAXBElement<String> value) {
        this.locationPhoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade locationPriority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationPriority() {
        return locationPriority;
    }

    /**
     * Define o valor da propriedade locationPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationPriority(Integer value) {
        this.locationPriority = value;
    }

    /**
     * Obtém o valor da propriedade locationStandardInstructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationStandardInstructions() {
        return locationStandardInstructions;
    }

    /**
     * Define o valor da propriedade locationStandardInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationStandardInstructions(JAXBElement<String> value) {
        this.locationStandardInstructions = value;
    }

    /**
     * Obtém o valor da propriedade locationType.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocationType() {
        return locationType;
    }

    /**
     * Define o valor da propriedade locationType.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocationType(LocationType value) {
        this.locationType = value;
    }

    /**
     * Obtém o valor da propriedade locationZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationZone() {
        return locationZone;
    }

    /**
     * Define o valor da propriedade locationZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationZone(JAXBElement<String> value) {
        this.locationZone = value;
    }

    /**
     * Obtém o valor da propriedade manipulationSourceCancelSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManipulationSourceCancelSource() {
        return manipulationSourceCancelSource;
    }

    /**
     * Define o valor da propriedade manipulationSourceCancelSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManipulationSourceCancelSource(JAXBElement<String> value) {
        this.manipulationSourceCancelSource = value;
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
     * Obtém o valor da propriedade orderCancelReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderCancelReasonCode }{@code >}
     *     
     */
    public JAXBElement<OrderCancelReasonCode> getOrderCancelReasonCode() {
        return orderCancelReasonCode;
    }

    /**
     * Define o valor da propriedade orderCancelReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderCancelReasonCode }{@code >}
     *     
     */
    public void setOrderCancelReasonCode(JAXBElement<OrderCancelReasonCode> value) {
        this.orderCancelReasonCode = value;
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
     * Obtém o valor da propriedade overQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCode> getOverQuantitiesReasonCode() {
        return overQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade overQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public void setOverQuantitiesReasonCode(JAXBElement<QuantityReasonCode> value) {
        this.overQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade overQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverQuantitiesReasonCodeDescription() {
        return overQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade overQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverQuantitiesReasonCodeDescription(JAXBElement<String> value) {
        this.overQuantitiesReasonCodeDescription = value;
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
     * Obtém o valor da propriedade quantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCode> getQuantitiesReasonCode() {
        return quantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade quantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public void setQuantitiesReasonCode(JAXBElement<QuantityReasonCode> value) {
        this.quantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantitiesReasonCodeDescription() {
        return quantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade quantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantitiesReasonCodeDescription(JAXBElement<String> value) {
        this.quantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade quantityInputQualityQuantityInputQuality.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantityInputQualityQuantityInputQuality() {
        return quantityInputQualityQuantityInputQuality;
    }

    /**
     * Define o valor da propriedade quantityInputQualityQuantityInputQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantityInputQualityQuantityInputQuality(JAXBElement<String> value) {
        this.quantityInputQualityQuantityInputQuality = value;
    }

    /**
     * Obtém o valor da propriedade quantityInputTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getQuantityInputTimestamp() {
        return quantityInputTimestamp;
    }

    /**
     * Define o valor da propriedade quantityInputTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setQuantityInputTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.quantityInputTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade routeHeaders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteHeader }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteHeader> getRouteHeaders() {
        return routeHeaders;
    }

    /**
     * Define o valor da propriedade routeHeaders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteHeader }{@code >}
     *     
     */
    public void setRouteHeaders(JAXBElement<ArrayOfRouteHeader> value) {
        this.routeHeaders = value;
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
     * Obtém o valor da propriedade shortQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCode> getShortQuantitiesReasonCode() {
        return shortQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade shortQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public void setShortQuantitiesReasonCode(JAXBElement<QuantityReasonCode> value) {
        this.shortQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShortQuantitiesReasonCodeDescription() {
        return shortQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade shortQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShortQuantitiesReasonCodeDescription(JAXBElement<String> value) {
        this.shortQuantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade stopCancelReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopCancelReasonCode }{@code >}
     *     
     */
    public JAXBElement<StopCancelReasonCode> getStopCancelReasonCode() {
        return stopCancelReasonCode;
    }

    /**
     * Define o valor da propriedade stopCancelReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopCancelReasonCode }{@code >}
     *     
     */
    public void setStopCancelReasonCode(JAXBElement<StopCancelReasonCode> value) {
        this.stopCancelReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade taskStateState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaskStateState() {
        return taskStateState;
    }

    /**
     * Define o valor da propriedade taskStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaskStateState(JAXBElement<String> value) {
        this.taskStateState = value;
    }

    /**
     * Obtém o valor da propriedade taskTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaskTypeType() {
        return taskTypeType;
    }

    /**
     * Define o valor da propriedade taskTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaskTypeType(JAXBElement<String> value) {
        this.taskTypeType = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneLocationTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneLocationTimeZone() {
        return worldTimeZoneLocationTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneLocationTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneLocationTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneLocationTimeZone = value;
    }

}
