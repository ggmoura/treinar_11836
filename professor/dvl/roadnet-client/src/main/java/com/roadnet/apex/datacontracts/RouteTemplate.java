
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de RouteTemplate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowAdditionalOrdersAfterSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowAdditionalOrdersBeforeSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowAdditionalOrdersInBetweenSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowAdditionalOrdersWithNoRouteId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlwaysCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://roadnet.com/apex/DataContracts/}Color" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_DeliveryDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DispatcherEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToDestination" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="Equipment" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteTemplateEquipmentBase" minOccurs="0"/&gt;
 *         &lt;element name="Helper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsStopSequenceLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_OriginLoadAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaximumRuntime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfLayoverStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfMidRouteDepotStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfServiceableStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PostRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRuntime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RouterEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="StartsOnPreviousDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Stops" type="{http://roadnet.com/apex/DataContracts/}ArrayOfStopTemplate" minOccurs="0"/&gt;
 *         &lt;element name="TeamSplit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TravelPathChangedVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Workers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteTemplateWorker" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteTemplate", propOrder = {
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
    "teamSplit",
    "totalDistance",
    "travelPathChangedVersion",
    "workers"
})
public class RouteTemplate
    extends RegionBasedAggregateRootEntity
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
    @XmlElementRef(name = "Color", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Color> color;
    @XmlElementRef(name = "DayOfWeekFlags_DeliveryDays", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsDeliveryDays;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DestinationDepotEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> destinationDepotEntityKey;
    @XmlElementRef(name = "DispatcherEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dispatcherEntityKey;
    @XmlElementRef(name = "DistanceToDestination", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distanceToDestination;
    @XmlElementRef(name = "Equipment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteTemplateEquipmentBase> equipment;
    @XmlElement(name = "Helper")
    protected Boolean helper;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsStopSequenceLocked")
    protected Boolean isStopSequenceLocked;
    @XmlElement(name = "LastStopIsDestination")
    protected Boolean lastStopIsDestination;
    @XmlElementRef(name = "LoadAction_OriginLoadAction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loadActionOriginLoadAction;
    @XmlElementRef(name = "MaximumRuntime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> maximumRuntime;
    @XmlElementRef(name = "MaximumTravelTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> maximumTravelTime;
    @XmlElement(name = "NumberOfLayoverStops")
    protected Integer numberOfLayoverStops;
    @XmlElement(name = "NumberOfMidRouteDepotStops")
    protected Integer numberOfMidRouteDepotStops;
    @XmlElement(name = "NumberOfServiceableStops")
    protected Integer numberOfServiceableStops;
    @XmlElement(name = "OriginDepotEntityKey")
    protected Long originDepotEntityKey;
    @XmlElementRef(name = "PostRouteTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> postRouteTime;
    @XmlElementRef(name = "PreRouteTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> preRouteTime;
    @XmlElementRef(name = "PreferredRuntime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> preferredRuntime;
    @XmlElementRef(name = "RouterEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routerEntityKey;
    @XmlElementRef(name = "StartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElement(name = "StartsOnPreviousDay")
    protected Boolean startsOnPreviousDay;
    @XmlElementRef(name = "Stops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStopTemplate> stops;
    @XmlElement(name = "TeamSplit")
    protected Boolean teamSplit;
    @XmlElementRef(name = "TotalDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> totalDistance;
    @XmlElement(name = "TravelPathChangedVersion")
    protected Long travelPathChangedVersion;
    @XmlElementRef(name = "Workers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteTemplateWorker> workers;

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
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public JAXBElement<Color> getColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public void setColor(JAXBElement<Color> value) {
        this.color = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsDeliveryDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlagsDeliveryDays() {
        return dayOfWeekFlagsDeliveryDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsDeliveryDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlagsDeliveryDays(JAXBElement<String> value) {
        this.dayOfWeekFlagsDeliveryDays = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade destinationDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDestinationDepotEntityKey() {
        return destinationDepotEntityKey;
    }

    /**
     * Define o valor da propriedade destinationDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDestinationDepotEntityKey(JAXBElement<Long> value) {
        this.destinationDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade dispatcherEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDispatcherEntityKey() {
        return dispatcherEntityKey;
    }

    /**
     * Define o valor da propriedade dispatcherEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDispatcherEntityKey(JAXBElement<Long> value) {
        this.dispatcherEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade distanceToDestination.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistanceToDestination() {
        return distanceToDestination;
    }

    /**
     * Define o valor da propriedade distanceToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistanceToDestination(JAXBElement<Distance> value) {
        this.distanceToDestination = value;
    }

    /**
     * Obtém o valor da propriedade equipment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteTemplateEquipmentBase }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteTemplateEquipmentBase> getEquipment() {
        return equipment;
    }

    /**
     * Define o valor da propriedade equipment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteTemplateEquipmentBase }{@code >}
     *     
     */
    public void setEquipment(JAXBElement<ArrayOfRouteTemplateEquipmentBase> value) {
        this.equipment = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoadActionOriginLoadAction() {
        return loadActionOriginLoadAction;
    }

    /**
     * Define o valor da propriedade loadActionOriginLoadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoadActionOriginLoadAction(JAXBElement<String> value) {
        this.loadActionOriginLoadAction = value;
    }

    /**
     * Obtém o valor da propriedade maximumRuntime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMaximumRuntime() {
        return maximumRuntime;
    }

    /**
     * Define o valor da propriedade maximumRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMaximumRuntime(JAXBElement<Duration> value) {
        this.maximumRuntime = value;
    }

    /**
     * Obtém o valor da propriedade maximumTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMaximumTravelTime() {
        return maximumTravelTime;
    }

    /**
     * Define o valor da propriedade maximumTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMaximumTravelTime(JAXBElement<Duration> value) {
        this.maximumTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade numberOfLayoverStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfLayoverStops() {
        return numberOfLayoverStops;
    }

    /**
     * Define o valor da propriedade numberOfLayoverStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfLayoverStops(Integer value) {
        this.numberOfLayoverStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfMidRouteDepotStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfMidRouteDepotStops() {
        return numberOfMidRouteDepotStops;
    }

    /**
     * Define o valor da propriedade numberOfMidRouteDepotStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfMidRouteDepotStops(Integer value) {
        this.numberOfMidRouteDepotStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfServiceableStops() {
        return numberOfServiceableStops;
    }

    /**
     * Define o valor da propriedade numberOfServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfServiceableStops(Integer value) {
        this.numberOfServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade originDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginDepotEntityKey() {
        return originDepotEntityKey;
    }

    /**
     * Define o valor da propriedade originDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginDepotEntityKey(Long value) {
        this.originDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade postRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPostRouteTime() {
        return postRouteTime;
    }

    /**
     * Define o valor da propriedade postRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPostRouteTime(JAXBElement<Duration> value) {
        this.postRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPreRouteTime() {
        return preRouteTime;
    }

    /**
     * Define o valor da propriedade preRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPreRouteTime(JAXBElement<Duration> value) {
        this.preRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preferredRuntime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPreferredRuntime() {
        return preferredRuntime;
    }

    /**
     * Define o valor da propriedade preferredRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPreferredRuntime(JAXBElement<Duration> value) {
        this.preferredRuntime = value;
    }

    /**
     * Obtém o valor da propriedade routerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouterEntityKey() {
        return routerEntityKey;
    }

    /**
     * Define o valor da propriedade routerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouterEntityKey(JAXBElement<Long> value) {
        this.routerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopTemplate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStopTemplate> getStops() {
        return stops;
    }

    /**
     * Define o valor da propriedade stops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopTemplate }{@code >}
     *     
     */
    public void setStops(JAXBElement<ArrayOfStopTemplate> value) {
        this.stops = value;
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
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getTotalDistance() {
        return totalDistance;
    }

    /**
     * Define o valor da propriedade totalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setTotalDistance(JAXBElement<Distance> value) {
        this.totalDistance = value;
    }

    /**
     * Obtém o valor da propriedade travelPathChangedVersion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTravelPathChangedVersion() {
        return travelPathChangedVersion;
    }

    /**
     * Define o valor da propriedade travelPathChangedVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTravelPathChangedVersion(Long value) {
        this.travelPathChangedVersion = value;
    }

    /**
     * Obtém o valor da propriedade workers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteTemplateWorker }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteTemplateWorker> getWorkers() {
        return workers;
    }

    /**
     * Define o valor da propriedade workers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteTemplateWorker }{@code >}
     *     
     */
    public void setWorkers(JAXBElement<ArrayOfRouteTemplateWorker> value) {
        this.workers = value;
    }

}
