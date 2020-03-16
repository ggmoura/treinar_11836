
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteTemplatePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteTemplatePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowAdditionalOrdersAfterSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowAdditionalOrdersBeforeSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowAdditionalOrdersInBetweenSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowAdditionalOrdersWithNoRouteId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlwaysCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_DeliveryDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DispatcherEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Equipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}RouteTemplateEquipmentPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Helper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsStopSequenceLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_OriginLoadAction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumRuntime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTravelTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfLayoverStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMidRouteDepotStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfServiceableStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PostRouteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreRouteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRuntime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouterEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartsOnPreviousDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Stops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopsPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}StopTemplatePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="TeamSplit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelPathChangedVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Workers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkersOptions" type="{http://roadnet.com/apex/DataContracts/}RouteTemplateWorkerPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteTemplatePropertyOptions", propOrder = {
    "allowAdditionalOrdersAfterSequence",
    "allowAdditionalOrdersBeforeSequence",
    "allowAdditionalOrdersInBetweenSequence",
    "allowAdditionalOrdersWithNoRouteId",
    "alwaysCreate",
    "color",
    "dayOfWeekFlagsDeliveryDays",
    "description",
    "destinationDepotEntityKey",
    "dispatcherEntityKey",
    "distanceToDestination",
    "equipment",
    "equipmentPropertyOptions",
    "helper",
    "identifier",
    "isStopSequenceLocked",
    "lastStopIsDestination",
    "loadActionOriginLoadAction",
    "maximumRuntime",
    "maximumTravelTime",
    "numberOfLayoverStops",
    "numberOfMidRouteDepotStops",
    "numberOfServiceableStops",
    "originDepotEntityKey",
    "postRouteTime",
    "preRouteTime",
    "preferredRuntime",
    "routerEntityKey",
    "startTime",
    "startsOnPreviousDay",
    "stops",
    "stopsPropertyOptions",
    "teamSplit",
    "totalDistance",
    "travelPathChangedVersion",
    "workers",
    "workersOptions"
})
public class RouteTemplatePropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "AllowAdditionalOrdersAfterSequence")
    protected Boolean allowAdditionalOrdersAfterSequence;
    @XmlElement(name = "AllowAdditionalOrdersBeforeSequence")
    protected Boolean allowAdditionalOrdersBeforeSequence;
    @XmlElement(name = "AllowAdditionalOrdersInBetweenSequence")
    protected Boolean allowAdditionalOrdersInBetweenSequence;
    @XmlElement(name = "AllowAdditionalOrdersWithNoRouteId")
    protected Boolean allowAdditionalOrdersWithNoRouteId;
    @XmlElement(name = "AlwaysCreate")
    protected Boolean alwaysCreate;
    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "DayOfWeekFlags_DeliveryDays")
    protected Boolean dayOfWeekFlagsDeliveryDays;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "DestinationDepotEntityKey")
    protected Boolean destinationDepotEntityKey;
    @XmlElement(name = "DispatcherEntityKey")
    protected Boolean dispatcherEntityKey;
    @XmlElement(name = "DistanceToDestination")
    protected Boolean distanceToDestination;
    @XmlElement(name = "Equipment")
    protected Boolean equipment;
    @XmlElementRef(name = "EquipmentPropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteTemplateEquipmentPropertyOptions> equipmentPropertyOptions;
    @XmlElement(name = "Helper")
    protected Boolean helper;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsStopSequenceLocked")
    protected Boolean isStopSequenceLocked;
    @XmlElement(name = "LastStopIsDestination")
    protected Boolean lastStopIsDestination;
    @XmlElement(name = "LoadAction_OriginLoadAction")
    protected Boolean loadActionOriginLoadAction;
    @XmlElement(name = "MaximumRuntime")
    protected Boolean maximumRuntime;
    @XmlElement(name = "MaximumTravelTime")
    protected Boolean maximumTravelTime;
    @XmlElement(name = "NumberOfLayoverStops")
    protected Boolean numberOfLayoverStops;
    @XmlElement(name = "NumberOfMidRouteDepotStops")
    protected Boolean numberOfMidRouteDepotStops;
    @XmlElement(name = "NumberOfServiceableStops")
    protected Boolean numberOfServiceableStops;
    @XmlElement(name = "OriginDepotEntityKey")
    protected Boolean originDepotEntityKey;
    @XmlElement(name = "PostRouteTime")
    protected Boolean postRouteTime;
    @XmlElement(name = "PreRouteTime")
    protected Boolean preRouteTime;
    @XmlElement(name = "PreferredRuntime")
    protected Boolean preferredRuntime;
    @XmlElement(name = "RouterEntityKey")
    protected Boolean routerEntityKey;
    @XmlElement(name = "StartTime")
    protected Boolean startTime;
    @XmlElement(name = "StartsOnPreviousDay")
    protected Boolean startsOnPreviousDay;
    @XmlElement(name = "Stops")
    protected Boolean stops;
    @XmlElementRef(name = "StopsPropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StopTemplatePropertyOptions> stopsPropertyOptions;
    @XmlElement(name = "TeamSplit")
    protected Boolean teamSplit;
    @XmlElement(name = "TotalDistance")
    protected Boolean totalDistance;
    @XmlElement(name = "TravelPathChangedVersion")
    protected Boolean travelPathChangedVersion;
    @XmlElement(name = "Workers")
    protected Boolean workers;
    @XmlElementRef(name = "WorkersOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteTemplateWorkerPropertyOptions> workersOptions;

    /**
     * Obtém o valor da propriedade allowAdditionalOrdersAfterSequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAdditionalOrdersAfterSequence() {
        return allowAdditionalOrdersAfterSequence;
    }

    /**
     * Define o valor da propriedade allowAdditionalOrdersAfterSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAdditionalOrdersAfterSequence(Boolean value) {
        this.allowAdditionalOrdersAfterSequence = value;
    }

    /**
     * Obtém o valor da propriedade allowAdditionalOrdersBeforeSequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAdditionalOrdersBeforeSequence() {
        return allowAdditionalOrdersBeforeSequence;
    }

    /**
     * Define o valor da propriedade allowAdditionalOrdersBeforeSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAdditionalOrdersBeforeSequence(Boolean value) {
        this.allowAdditionalOrdersBeforeSequence = value;
    }

    /**
     * Obtém o valor da propriedade allowAdditionalOrdersInBetweenSequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAdditionalOrdersInBetweenSequence() {
        return allowAdditionalOrdersInBetweenSequence;
    }

    /**
     * Define o valor da propriedade allowAdditionalOrdersInBetweenSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAdditionalOrdersInBetweenSequence(Boolean value) {
        this.allowAdditionalOrdersInBetweenSequence = value;
    }

    /**
     * Obtém o valor da propriedade allowAdditionalOrdersWithNoRouteId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAdditionalOrdersWithNoRouteId() {
        return allowAdditionalOrdersWithNoRouteId;
    }

    /**
     * Define o valor da propriedade allowAdditionalOrdersWithNoRouteId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAdditionalOrdersWithNoRouteId(Boolean value) {
        this.allowAdditionalOrdersWithNoRouteId = value;
    }

    /**
     * Obtém o valor da propriedade alwaysCreate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysCreate() {
        return alwaysCreate;
    }

    /**
     * Define o valor da propriedade alwaysCreate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysCreate(Boolean value) {
        this.alwaysCreate = value;
    }

    /**
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColor(Boolean value) {
        this.color = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsDeliveryDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayOfWeekFlagsDeliveryDays() {
        return dayOfWeekFlagsDeliveryDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsDeliveryDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayOfWeekFlagsDeliveryDays(Boolean value) {
        this.dayOfWeekFlagsDeliveryDays = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade destinationDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationDepotEntityKey() {
        return destinationDepotEntityKey;
    }

    /**
     * Define o valor da propriedade destinationDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationDepotEntityKey(Boolean value) {
        this.destinationDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade dispatcherEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispatcherEntityKey() {
        return dispatcherEntityKey;
    }

    /**
     * Define o valor da propriedade dispatcherEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispatcherEntityKey(Boolean value) {
        this.dispatcherEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade distanceToDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceToDestination() {
        return distanceToDestination;
    }

    /**
     * Define o valor da propriedade distanceToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceToDestination(Boolean value) {
        this.distanceToDestination = value;
    }

    /**
     * Obtém o valor da propriedade equipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipment() {
        return equipment;
    }

    /**
     * Define o valor da propriedade equipment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipment(Boolean value) {
        this.equipment = value;
    }

    /**
     * Obtém o valor da propriedade equipmentPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteTemplateEquipmentPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteTemplateEquipmentPropertyOptions> getEquipmentPropertyOptions() {
        return equipmentPropertyOptions;
    }

    /**
     * Define o valor da propriedade equipmentPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteTemplateEquipmentPropertyOptions }{@code >}
     *     
     */
    public void setEquipmentPropertyOptions(JAXBElement<RouteTemplateEquipmentPropertyOptions> value) {
        this.equipmentPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade helper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHelper() {
        return helper;
    }

    /**
     * Define o valor da propriedade helper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHelper(Boolean value) {
        this.helper = value;
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
     * Obtém o valor da propriedade isStopSequenceLocked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStopSequenceLocked() {
        return isStopSequenceLocked;
    }

    /**
     * Define o valor da propriedade isStopSequenceLocked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStopSequenceLocked(Boolean value) {
        this.isStopSequenceLocked = value;
    }

    /**
     * Obtém o valor da propriedade lastStopIsDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastStopIsDestination() {
        return lastStopIsDestination;
    }

    /**
     * Define o valor da propriedade lastStopIsDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastStopIsDestination(Boolean value) {
        this.lastStopIsDestination = value;
    }

    /**
     * Obtém o valor da propriedade loadActionOriginLoadAction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadActionOriginLoadAction() {
        return loadActionOriginLoadAction;
    }

    /**
     * Define o valor da propriedade loadActionOriginLoadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadActionOriginLoadAction(Boolean value) {
        this.loadActionOriginLoadAction = value;
    }

    /**
     * Obtém o valor da propriedade maximumRuntime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumRuntime() {
        return maximumRuntime;
    }

    /**
     * Define o valor da propriedade maximumRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumRuntime(Boolean value) {
        this.maximumRuntime = value;
    }

    /**
     * Obtém o valor da propriedade maximumTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumTravelTime() {
        return maximumTravelTime;
    }

    /**
     * Define o valor da propriedade maximumTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumTravelTime(Boolean value) {
        this.maximumTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade numberOfLayoverStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfLayoverStops() {
        return numberOfLayoverStops;
    }

    /**
     * Define o valor da propriedade numberOfLayoverStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfLayoverStops(Boolean value) {
        this.numberOfLayoverStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMidRouteDepotStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfMidRouteDepotStops() {
        return numberOfMidRouteDepotStops;
    }

    /**
     * Define o valor da propriedade numberOfMidRouteDepotStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfMidRouteDepotStops(Boolean value) {
        this.numberOfMidRouteDepotStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfServiceableStops() {
        return numberOfServiceableStops;
    }

    /**
     * Define o valor da propriedade numberOfServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfServiceableStops(Boolean value) {
        this.numberOfServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade originDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginDepotEntityKey() {
        return originDepotEntityKey;
    }

    /**
     * Define o valor da propriedade originDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginDepotEntityKey(Boolean value) {
        this.originDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade postRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostRouteTime() {
        return postRouteTime;
    }

    /**
     * Define o valor da propriedade postRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostRouteTime(Boolean value) {
        this.postRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreRouteTime() {
        return preRouteTime;
    }

    /**
     * Define o valor da propriedade preRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreRouteTime(Boolean value) {
        this.preRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preferredRuntime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredRuntime() {
        return preferredRuntime;
    }

    /**
     * Define o valor da propriedade preferredRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredRuntime(Boolean value) {
        this.preferredRuntime = value;
    }

    /**
     * Obtém o valor da propriedade routerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouterEntityKey() {
        return routerEntityKey;
    }

    /**
     * Define o valor da propriedade routerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouterEntityKey(Boolean value) {
        this.routerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTime(Boolean value) {
        this.startTime = value;
    }

    /**
     * Obtém o valor da propriedade startsOnPreviousDay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartsOnPreviousDay() {
        return startsOnPreviousDay;
    }

    /**
     * Define o valor da propriedade startsOnPreviousDay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartsOnPreviousDay(Boolean value) {
        this.startsOnPreviousDay = value;
    }

    /**
     * Obtém o valor da propriedade stops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStops() {
        return stops;
    }

    /**
     * Define o valor da propriedade stops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStops(Boolean value) {
        this.stops = value;
    }

    /**
     * Obtém o valor da propriedade stopsPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopTemplatePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<StopTemplatePropertyOptions> getStopsPropertyOptions() {
        return stopsPropertyOptions;
    }

    /**
     * Define o valor da propriedade stopsPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopTemplatePropertyOptions }{@code >}
     *     
     */
    public void setStopsPropertyOptions(JAXBElement<StopTemplatePropertyOptions> value) {
        this.stopsPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade teamSplit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeamSplit() {
        return teamSplit;
    }

    /**
     * Define o valor da propriedade teamSplit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeamSplit(Boolean value) {
        this.teamSplit = value;
    }

    /**
     * Obtém o valor da propriedade totalDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalDistance() {
        return totalDistance;
    }

    /**
     * Define o valor da propriedade totalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalDistance(Boolean value) {
        this.totalDistance = value;
    }

    /**
     * Obtém o valor da propriedade travelPathChangedVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelPathChangedVersion() {
        return travelPathChangedVersion;
    }

    /**
     * Define o valor da propriedade travelPathChangedVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelPathChangedVersion(Boolean value) {
        this.travelPathChangedVersion = value;
    }

    /**
     * Obtém o valor da propriedade workers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkers() {
        return workers;
    }

    /**
     * Define o valor da propriedade workers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkers(Boolean value) {
        this.workers = value;
    }

    /**
     * Obtém o valor da propriedade workersOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteTemplateWorkerPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteTemplateWorkerPropertyOptions> getWorkersOptions() {
        return workersOptions;
    }

    /**
     * Define o valor da propriedade workersOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteTemplateWorkerPropertyOptions }{@code >}
     *     
     */
    public void setWorkersOptions(JAXBElement<RouteTemplateWorkerPropertyOptions> value) {
        this.workersOptions = value;
    }

}
