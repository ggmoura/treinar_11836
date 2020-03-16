
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


/**
 * <p>Classe Java de SaveRouteArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveRouteArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Color" type="{http://roadnet.com/apex/DataContracts/}Color" minOccurs="0"/&gt;
 *         &lt;element name="CustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DispatcherEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Equipment" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteEquipmentBase" minOccurs="0"/&gt;
 *         &lt;element name="FirstStopIsOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Helper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Instance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
 *         &lt;element name="Jurisdictions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteJurisdiction" minOccurs="0"/&gt;
 *         &lt;element name="KeepRelativeSequenceOfLockedStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumRuntime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OriginLoadAction" type="{http://roadnet.com/apex/DataContracts/}LoadAction" minOccurs="0"/&gt;
 *         &lt;element name="PassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Phase" type="{http://roadnet.com/apex/DataContracts/}RoutePhase" minOccurs="0"/&gt;
 *         &lt;element name="PostRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRuntime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenders" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteTender" minOccurs="0"/&gt;
 *         &lt;element name="RouterEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ShouldTreatAsTemplateOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TeamSplit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Workers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteWorker" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveRouteArgs", propOrder = {
    "color",
    "customProperties",
    "description",
    "destinationEntityKey",
    "dispatcherEntityKey",
    "equipment",
    "firstStopIsOrigin",
    "helper",
    "identifier",
    "instance",
    "jurisdictions",
    "keepRelativeSequenceOfLockedStops",
    "lastStopIsDestination",
    "maximumRuntime",
    "maximumTravelTime",
    "originDepotEntityKey",
    "originLoadAction",
    "passEntityKey",
    "phase",
    "postRouteTime",
    "preRouteTime",
    "preferredRuntime",
    "routeTenders",
    "routerEntityKey",
    "shouldTreatAsTemplateOverride",
    "startTime",
    "teamSplit",
    "territoryEntityKey",
    "workers"
})
public class SaveRouteArgs {

    @XmlElementRef(name = "Color", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Color> color;
    @XmlElementRef(name = "CustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> customProperties;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DestinationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> destinationEntityKey;
    @XmlElement(name = "DispatcherEntityKey")
    protected Long dispatcherEntityKey;
    @XmlElementRef(name = "Equipment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteEquipmentBase> equipment;
    @XmlElement(name = "FirstStopIsOrigin")
    protected Boolean firstStopIsOrigin;
    @XmlElement(name = "Helper")
    protected Boolean helper;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "Instance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> instance;
    @XmlElementRef(name = "Jurisdictions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteJurisdiction> jurisdictions;
    @XmlElement(name = "KeepRelativeSequenceOfLockedStops")
    protected Boolean keepRelativeSequenceOfLockedStops;
    @XmlElement(name = "LastStopIsDestination")
    protected Boolean lastStopIsDestination;
    @XmlElement(name = "MaximumRuntime")
    protected Duration maximumRuntime;
    @XmlElementRef(name = "MaximumTravelTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> maximumTravelTime;
    @XmlElementRef(name = "OriginDepotEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> originDepotEntityKey;
    @XmlElement(name = "OriginLoadAction")
    @XmlSchemaType(name = "string")
    protected LoadAction originLoadAction;
    @XmlElement(name = "PassEntityKey")
    protected Long passEntityKey;
    @XmlElement(name = "Phase")
    @XmlSchemaType(name = "string")
    protected RoutePhase phase;
    @XmlElement(name = "PostRouteTime")
    protected Duration postRouteTime;
    @XmlElement(name = "PreRouteTime")
    protected Duration preRouteTime;
    @XmlElement(name = "PreferredRuntime")
    protected Duration preferredRuntime;
    @XmlElementRef(name = "RouteTenders", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteTender> routeTenders;
    @XmlElement(name = "RouterEntityKey")
    protected Long routerEntityKey;
    @XmlElement(name = "ShouldTreatAsTemplateOverride")
    protected Boolean shouldTreatAsTemplateOverride;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "TeamSplit")
    protected Boolean teamSplit;
    @XmlElementRef(name = "TerritoryEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> territoryEntityKey;
    @XmlElementRef(name = "Workers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteWorker> workers;

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
     * Obtém o valor da propriedade destinationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDestinationEntityKey() {
        return destinationEntityKey;
    }

    /**
     * Define o valor da propriedade destinationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDestinationEntityKey(JAXBElement<Long> value) {
        this.destinationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade dispatcherEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDispatcherEntityKey() {
        return dispatcherEntityKey;
    }

    /**
     * Define o valor da propriedade dispatcherEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDispatcherEntityKey(Long value) {
        this.dispatcherEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteEquipmentBase }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteEquipmentBase> getEquipment() {
        return equipment;
    }

    /**
     * Define o valor da propriedade equipment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteEquipmentBase }{@code >}
     *     
     */
    public void setEquipment(JAXBElement<ArrayOfRouteEquipmentBase> value) {
        this.equipment = value;
    }

    /**
     * Obtém o valor da propriedade firstStopIsOrigin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstStopIsOrigin() {
        return firstStopIsOrigin;
    }

    /**
     * Define o valor da propriedade firstStopIsOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstStopIsOrigin(Boolean value) {
        this.firstStopIsOrigin = value;
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
     * Obtém o valor da propriedade instance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public JAXBElement<DomainInstance> getInstance() {
        return instance;
    }

    /**
     * Define o valor da propriedade instance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public void setInstance(JAXBElement<DomainInstance> value) {
        this.instance = value;
    }

    /**
     * Obtém o valor da propriedade jurisdictions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteJurisdiction }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteJurisdiction> getJurisdictions() {
        return jurisdictions;
    }

    /**
     * Define o valor da propriedade jurisdictions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteJurisdiction }{@code >}
     *     
     */
    public void setJurisdictions(JAXBElement<ArrayOfRouteJurisdiction> value) {
        this.jurisdictions = value;
    }

    /**
     * Obtém o valor da propriedade keepRelativeSequenceOfLockedStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepRelativeSequenceOfLockedStops() {
        return keepRelativeSequenceOfLockedStops;
    }

    /**
     * Define o valor da propriedade keepRelativeSequenceOfLockedStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepRelativeSequenceOfLockedStops(Boolean value) {
        this.keepRelativeSequenceOfLockedStops = value;
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
     * Obtém o valor da propriedade maximumRuntime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumRuntime() {
        return maximumRuntime;
    }

    /**
     * Define o valor da propriedade maximumRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumRuntime(Duration value) {
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
     * Obtém o valor da propriedade originDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOriginDepotEntityKey() {
        return originDepotEntityKey;
    }

    /**
     * Define o valor da propriedade originDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOriginDepotEntityKey(JAXBElement<Long> value) {
        this.originDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade originLoadAction.
     * 
     * @return
     *     possible object is
     *     {@link LoadAction }
     *     
     */
    public LoadAction getOriginLoadAction() {
        return originLoadAction;
    }

    /**
     * Define o valor da propriedade originLoadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadAction }
     *     
     */
    public void setOriginLoadAction(LoadAction value) {
        this.originLoadAction = value;
    }

    /**
     * Obtém o valor da propriedade passEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassEntityKey() {
        return passEntityKey;
    }

    /**
     * Define o valor da propriedade passEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassEntityKey(Long value) {
        this.passEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade phase.
     * 
     * @return
     *     possible object is
     *     {@link RoutePhase }
     *     
     */
    public RoutePhase getPhase() {
        return phase;
    }

    /**
     * Define o valor da propriedade phase.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePhase }
     *     
     */
    public void setPhase(RoutePhase value) {
        this.phase = value;
    }

    /**
     * Obtém o valor da propriedade postRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPostRouteTime() {
        return postRouteTime;
    }

    /**
     * Define o valor da propriedade postRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPostRouteTime(Duration value) {
        this.postRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreRouteTime() {
        return preRouteTime;
    }

    /**
     * Define o valor da propriedade preRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreRouteTime(Duration value) {
        this.preRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preferredRuntime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreferredRuntime() {
        return preferredRuntime;
    }

    /**
     * Define o valor da propriedade preferredRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreferredRuntime(Duration value) {
        this.preferredRuntime = value;
    }

    /**
     * Obtém o valor da propriedade routeTenders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteTender }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteTender> getRouteTenders() {
        return routeTenders;
    }

    /**
     * Define o valor da propriedade routeTenders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteTender }{@code >}
     *     
     */
    public void setRouteTenders(JAXBElement<ArrayOfRouteTender> value) {
        this.routeTenders = value;
    }

    /**
     * Obtém o valor da propriedade routerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRouterEntityKey() {
        return routerEntityKey;
    }

    /**
     * Define o valor da propriedade routerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRouterEntityKey(Long value) {
        this.routerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade shouldTreatAsTemplateOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldTreatAsTemplateOverride() {
        return shouldTreatAsTemplateOverride;
    }

    /**
     * Define o valor da propriedade shouldTreatAsTemplateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldTreatAsTemplateOverride(Boolean value) {
        this.shouldTreatAsTemplateOverride = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
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
     * Obtém o valor da propriedade territoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTerritoryEntityKey() {
        return territoryEntityKey;
    }

    /**
     * Define o valor da propriedade territoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTerritoryEntityKey(JAXBElement<Long> value) {
        this.territoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteWorker }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteWorker> getWorkers() {
        return workers;
    }

    /**
     * Define o valor da propriedade workers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteWorker }{@code >}
     *     
     */
    public void setWorkers(JAXBElement<ArrayOfRouteWorker> value) {
        this.workers = value;
    }

}
