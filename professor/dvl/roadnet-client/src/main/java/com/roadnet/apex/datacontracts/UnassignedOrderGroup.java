
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
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Classe Java de UnassignedOrderGroup complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UnassignedOrderGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateOverride" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_LocationDeliveryDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="HasPriorityOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastAutonomousPlacementAttemptTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastAutonomousPlacementManipulationError" type="{http://roadnet.com/apex/DataContracts/}TransferErrorCode" minOccurs="0"/&gt;
 *         &lt;element name="LocationAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="LocationAlternateContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="LocationContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationStandardInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationType" type="{http://roadnet.com/apex/DataContracts/}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="LocationVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MaxUrgency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfAutonomousPlacementAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOrders" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfUnassignedOrderGroupOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderClasses" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderClass" minOccurs="0"/&gt;
 *         &lt;element name="OrderEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="OrderHeaders" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderHeader" minOccurs="0"/&gt;
 *         &lt;element name="OrderIdentifiers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="OrderSpecialInstructions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalDeliveryCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTotalPickupCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProductTypes" type="{http://roadnet.com/apex/DataContracts/}ArrayOfProductType" minOccurs="0"/&gt;
 *         &lt;element name="RouteConstraintFlags_LastAutonomousPlacementAttemptConstraintsEncountered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Selectors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEquipmentTypeRestrictions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceLocationEquipmentTypeRestriction" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfUnassignedOrderGroupServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="SessionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SessionMode_SessionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalVariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelectors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnassignedOrderGroup", propOrder = {
    "beginDate",
    "coordinate",
    "coordinateOverride",
    "dayOfWeekFlagsLocationDeliveryDays",
    "endDate",
    "hasPriorityOverride",
    "lastAutonomousPlacementAttemptTime",
    "lastAutonomousPlacementManipulationError",
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
public class UnassignedOrderGroup
    extends RegionBasedAggregateRootEntity
{

    @XmlElementRef(name = "BeginDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> beginDate;
    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "CoordinateOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinateOverride;
    @XmlElementRef(name = "DayOfWeekFlags_LocationDeliveryDays", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsLocationDeliveryDays;
    @XmlElementRef(name = "EndDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElement(name = "HasPriorityOverride")
    protected Boolean hasPriorityOverride;
    @XmlElementRef(name = "LastAutonomousPlacementAttemptTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastAutonomousPlacementAttemptTime;
    @XmlElementRef(name = "LastAutonomousPlacementManipulationError", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransferErrorCode> lastAutonomousPlacementManipulationError;
    @XmlElementRef(name = "LocationAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> locationAddress;
    @XmlElementRef(name = "LocationAlternateContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> locationAlternateContact;
    @XmlElementRef(name = "LocationContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> locationContact;
    @XmlElementRef(name = "LocationDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationDescription;
    @XmlElement(name = "LocationEntityKey")
    protected Long locationEntityKey;
    @XmlElementRef(name = "LocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationIdentifier;
    @XmlElement(name = "LocationIsDeleted")
    protected Boolean locationIsDeleted;
    @XmlElement(name = "LocationPriority")
    protected Integer locationPriority;
    @XmlElementRef(name = "LocationStandardInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationStandardInstructions;
    @XmlElement(name = "LocationType")
    @XmlSchemaType(name = "string")
    protected LocationType locationType;
    @XmlElement(name = "LocationVersion")
    protected Long locationVersion;
    @XmlElementRef(name = "LocationZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationZone;
    @XmlElement(name = "ManagedByUserEntityKey")
    protected Long managedByUserEntityKey;
    @XmlElement(name = "MaxUrgency")
    protected Integer maxUrgency;
    @XmlElementRef(name = "NetRevenue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> netRevenue;
    @XmlElement(name = "NumberOfAutonomousPlacementAttempts")
    protected Integer numberOfAutonomousPlacementAttempts;
    @XmlElement(name = "NumberOfOrders")
    protected Integer numberOfOrders;
    @XmlElementRef(name = "OpenCloseDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUnassignedOrderGroupOpenCloseDetail> openCloseDetails;
    @XmlElementRef(name = "OrderClasses", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderClass> orderClasses;
    @XmlElementRef(name = "OrderEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> orderEntityKeys;
    @XmlElementRef(name = "OrderHeaders", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderHeader> orderHeaders;
    @XmlElementRef(name = "OrderIdentifiers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> orderIdentifiers;
    @XmlElementRef(name = "OrderSpecialInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> orderSpecialInstructions;
    @XmlElementRef(name = "PlannedTotalDeliveryCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalDeliveryCategory1Quantities;
    @XmlElementRef(name = "PlannedTotalDeliveryCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalDeliveryCategory2Quantities;
    @XmlElementRef(name = "PlannedTotalDeliveryCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalDeliveryCategory3Quantities;
    @XmlElementRef(name = "PlannedTotalPickupCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalPickupCategory1Quantities;
    @XmlElementRef(name = "PlannedTotalPickupCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalPickupCategory2Quantities;
    @XmlElementRef(name = "PlannedTotalPickupCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedTotalPickupCategory3Quantities;
    @XmlElementRef(name = "Priority", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> priority;
    @XmlElementRef(name = "ProductTypes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductType> productTypes;
    @XmlElementRef(name = "RouteConstraintFlags_LastAutonomousPlacementAttemptConstraintsEncountered", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered;
    @XmlElementRef(name = "Selectors", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectors;
    @XmlElementRef(name = "ServiceLocationCustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> serviceLocationCustomProperties;
    @XmlElementRef(name = "ServiceLocationEquipmentTypeRestrictions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> serviceLocationEquipmentTypeRestrictions;
    @XmlElementRef(name = "ServiceWindowDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUnassignedOrderGroupServiceWindowDetail> serviceWindowDetails;
    @XmlElementRef(name = "SessionDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sessionDate;
    @XmlElementRef(name = "SessionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionDescription;
    @XmlElementRef(name = "SessionEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sessionEntityKey;
    @XmlElementRef(name = "SessionMode_SessionMode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionModeSessionMode;
    @XmlElementRef(name = "TotalDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryQuantities;
    @XmlElement(name = "TotalFee")
    protected Double totalFee;
    @XmlElement(name = "TotalFixedServiceTime")
    protected Duration totalFixedServiceTime;
    @XmlElementRef(name = "TotalPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupQuantities;
    @XmlElement(name = "TotalServiceTime")
    protected Duration totalServiceTime;
    @XmlElement(name = "TotalVariableServiceTime")
    protected Duration totalVariableServiceTime;
    @XmlElementRef(name = "UploadSelectors", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uploadSelectors;

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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAutonomousPlacementAttemptTime() {
        return lastAutonomousPlacementAttemptTime;
    }

    /**
     * Define o valor da propriedade lastAutonomousPlacementAttemptTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAutonomousPlacementAttemptTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAutonomousPlacementAttemptTime = value;
    }

    /**
     * Obtém o valor da propriedade lastAutonomousPlacementManipulationError.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}
     *     
     */
    public JAXBElement<TransferErrorCode> getLastAutonomousPlacementManipulationError() {
        return lastAutonomousPlacementManipulationError;
    }

    /**
     * Define o valor da propriedade lastAutonomousPlacementManipulationError.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}
     *     
     */
    public void setLastAutonomousPlacementManipulationError(JAXBElement<TransferErrorCode> value) {
        this.lastAutonomousPlacementManipulationError = value;
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
     * Obtém o valor da propriedade locationVersion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationVersion() {
        return locationVersion;
    }

    /**
     * Define o valor da propriedade locationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationVersion(Long value) {
        this.locationVersion = value;
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
     * Obtém o valor da propriedade maxUrgency.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxUrgency() {
        return maxUrgency;
    }

    /**
     * Define o valor da propriedade maxUrgency.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxUrgency(Integer value) {
        this.maxUrgency = value;
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
     * Obtém o valor da propriedade numberOfAutonomousPlacementAttempts.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfAutonomousPlacementAttempts() {
        return numberOfAutonomousPlacementAttempts;
    }

    /**
     * Define o valor da propriedade numberOfAutonomousPlacementAttempts.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfAutonomousPlacementAttempts(Integer value) {
        this.numberOfAutonomousPlacementAttempts = value;
    }

    /**
     * Obtém o valor da propriedade numberOfOrders.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfOrders() {
        return numberOfOrders;
    }

    /**
     * Define o valor da propriedade numberOfOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfOrders(Integer value) {
        this.numberOfOrders = value;
    }

    /**
     * Obtém o valor da propriedade openCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnassignedOrderGroupOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUnassignedOrderGroupOpenCloseDetail> getOpenCloseDetails() {
        return openCloseDetails;
    }

    /**
     * Define o valor da propriedade openCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnassignedOrderGroupOpenCloseDetail }{@code >}
     *     
     */
    public void setOpenCloseDetails(JAXBElement<ArrayOfUnassignedOrderGroupOpenCloseDetail> value) {
        this.openCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade orderClasses.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderClass }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderClass> getOrderClasses() {
        return orderClasses;
    }

    /**
     * Define o valor da propriedade orderClasses.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderClass }{@code >}
     *     
     */
    public void setOrderClasses(JAXBElement<ArrayOfOrderClass> value) {
        this.orderClasses = value;
    }

    /**
     * Obtém o valor da propriedade orderEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getOrderEntityKeys() {
        return orderEntityKeys;
    }

    /**
     * Define o valor da propriedade orderEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setOrderEntityKeys(JAXBElement<ArrayOflong> value) {
        this.orderEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade orderHeaders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderHeader }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderHeader> getOrderHeaders() {
        return orderHeaders;
    }

    /**
     * Define o valor da propriedade orderHeaders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderHeader }{@code >}
     *     
     */
    public void setOrderHeaders(JAXBElement<ArrayOfOrderHeader> value) {
        this.orderHeaders = value;
    }

    /**
     * Obtém o valor da propriedade orderIdentifiers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getOrderIdentifiers() {
        return orderIdentifiers;
    }

    /**
     * Define o valor da propriedade orderIdentifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setOrderIdentifiers(JAXBElement<ArrayOfstring> value) {
        this.orderIdentifiers = value;
    }

    /**
     * Obtém o valor da propriedade orderSpecialInstructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getOrderSpecialInstructions() {
        return orderSpecialInstructions;
    }

    /**
     * Define o valor da propriedade orderSpecialInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setOrderSpecialInstructions(JAXBElement<ArrayOfstring> value) {
        this.orderSpecialInstructions = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalDeliveryCategory1Quantities() {
        return plannedTotalDeliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalDeliveryCategory1Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalDeliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalDeliveryCategory2Quantities() {
        return plannedTotalDeliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalDeliveryCategory2Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalDeliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalDeliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalDeliveryCategory3Quantities() {
        return plannedTotalDeliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalDeliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalDeliveryCategory3Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalDeliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalPickupCategory1Quantities() {
        return plannedTotalPickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalPickupCategory1Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalPickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalPickupCategory2Quantities() {
        return plannedTotalPickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalPickupCategory2Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalPickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedTotalPickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedTotalPickupCategory3Quantities() {
        return plannedTotalPickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedTotalPickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedTotalPickupCategory3Quantities(JAXBElement<Quantities> value) {
        this.plannedTotalPickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPriority(JAXBElement<Integer> value) {
        this.priority = value;
    }

    /**
     * Obtém o valor da propriedade productTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductType> getProductTypes() {
        return productTypes;
    }

    /**
     * Define o valor da propriedade productTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductType }{@code >}
     *     
     */
    public void setProductTypes(JAXBElement<ArrayOfProductType> value) {
        this.productTypes = value;
    }

    /**
     * Obtém o valor da propriedade routeConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered() {
        return routeConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered;
    }

    /**
     * Define o valor da propriedade routeConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered(JAXBElement<String> value) {
        this.routeConstraintFlagsLastAutonomousPlacementAttemptConstraintsEncountered = value;
    }

    /**
     * Obtém o valor da propriedade selectors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectors() {
        return selectors;
    }

    /**
     * Define o valor da propriedade selectors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectors(JAXBElement<String> value) {
        this.selectors = value;
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
     * Obtém o valor da propriedade serviceLocationEquipmentTypeRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationEquipmentTypeRestriction }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> getServiceLocationEquipmentTypeRestrictions() {
        return serviceLocationEquipmentTypeRestrictions;
    }

    /**
     * Define o valor da propriedade serviceLocationEquipmentTypeRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationEquipmentTypeRestriction }{@code >}
     *     
     */
    public void setServiceLocationEquipmentTypeRestrictions(JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> value) {
        this.serviceLocationEquipmentTypeRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnassignedOrderGroupServiceWindowDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUnassignedOrderGroupServiceWindowDetail> getServiceWindowDetails() {
        return serviceWindowDetails;
    }

    /**
     * Define o valor da propriedade serviceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnassignedOrderGroupServiceWindowDetail }{@code >}
     *     
     */
    public void setServiceWindowDetails(JAXBElement<ArrayOfUnassignedOrderGroupServiceWindowDetail> value) {
        this.serviceWindowDetails = value;
    }

    /**
     * Obtém o valor da propriedade sessionDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSessionDate() {
        return sessionDate;
    }

    /**
     * Define o valor da propriedade sessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSessionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.sessionDate = value;
    }

    /**
     * Obtém o valor da propriedade sessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionDescription() {
        return sessionDescription;
    }

    /**
     * Define o valor da propriedade sessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionDescription(JAXBElement<String> value) {
        this.sessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSessionEntityKey(JAXBElement<Long> value) {
        this.sessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sessionModeSessionMode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionModeSessionMode() {
        return sessionModeSessionMode;
    }

    /**
     * Define o valor da propriedade sessionModeSessionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionModeSessionMode(JAXBElement<String> value) {
        this.sessionModeSessionMode = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalDeliveryQuantities() {
        return totalDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade totalDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalDeliveryQuantities(JAXBElement<Quantities> value) {
        this.totalDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFee() {
        return totalFee;
    }

    /**
     * Define o valor da propriedade totalFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFee(Double value) {
        this.totalFee = value;
    }

    /**
     * Obtém o valor da propriedade totalFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalFixedServiceTime() {
        return totalFixedServiceTime;
    }

    /**
     * Define o valor da propriedade totalFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalFixedServiceTime(Duration value) {
        this.totalFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPickupQuantities() {
        return totalPickupQuantities;
    }

    /**
     * Define o valor da propriedade totalPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPickupQuantities(JAXBElement<Quantities> value) {
        this.totalPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalServiceTime() {
        return totalServiceTime;
    }

    /**
     * Define o valor da propriedade totalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalServiceTime(Duration value) {
        this.totalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalVariableServiceTime() {
        return totalVariableServiceTime;
    }

    /**
     * Define o valor da propriedade totalVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalVariableServiceTime(Duration value) {
        this.totalVariableServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade uploadSelectors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUploadSelectors() {
        return uploadSelectors;
    }

    /**
     * Define o valor da propriedade uploadSelectors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUploadSelectors(JAXBElement<String> value) {
        this.uploadSelectors = value;
    }

}
