
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de EquipmentStatusDetails complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentStatusDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}EquipmentStatus"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MissedServiceWindows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceBatteryState" type="{http://roadnet.com/apex/DataContracts/}BatteryState" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfCompletedServiceableStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfServiceableStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfUnacknowledgedNotes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreferredWorkerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreferredWorkerName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="RouteArrivalTimeValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteColor" type="{http://roadnet.com/apex/DataContracts/}Color" minOccurs="0"/&gt;
 *         &lt;element name="RouteCompleteTimeValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteCreationMethod_CreationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteDepartureTimeValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteSessionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RouteStartTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteStartTimeValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Workers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentStatusWorkerDetail" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_RouteOriginTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_RouteTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentStatusDetails", propOrder = {
    "missedServiceWindows",
    "mobileDeviceBatteryState",
    "mobileDeviceEntityKey",
    "mobileDeviceIdentifier",
    "mobileDeviceNumber",
    "numberOfCompletedServiceableStops",
    "numberOfServiceableStops",
    "numberOfUnacknowledgedNotes",
    "preferredWorkerIdentifier",
    "preferredWorkerName",
    "routeArrivalTimeValue",
    "routeColor",
    "routeCompleteTimeValue",
    "routeCreationMethodCreationMethod",
    "routeDepartureTimeValue",
    "routeDescription",
    "routeDisplayName",
    "routeIdentifier",
    "routeSessionDate",
    "routeStartTime",
    "routeStartTimeValue",
    "telematicsDeviceEntityKey",
    "workers",
    "worldTimeZoneRouteOriginTimeZone",
    "worldTimeZoneRouteTimeZone"
})
public class EquipmentStatusDetails
    extends EquipmentStatus
{

    @XmlElementRef(name = "MissedServiceWindows", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> missedServiceWindows;
    @XmlElementRef(name = "MobileDeviceBatteryState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BatteryState> mobileDeviceBatteryState;
    @XmlElementRef(name = "MobileDeviceEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mobileDeviceEntityKey;
    @XmlElementRef(name = "MobileDeviceIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileDeviceIdentifier;
    @XmlElementRef(name = "MobileDeviceNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileDeviceNumber;
    @XmlElementRef(name = "NumberOfCompletedServiceableStops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfCompletedServiceableStops;
    @XmlElementRef(name = "NumberOfServiceableStops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfServiceableStops;
    @XmlElementRef(name = "NumberOfUnacknowledgedNotes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfUnacknowledgedNotes;
    @XmlElementRef(name = "PreferredWorkerIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredWorkerIdentifier;
    @XmlElementRef(name = "PreferredWorkerName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> preferredWorkerName;
    @XmlElement(name = "RouteArrivalTimeValue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeArrivalTimeValue;
    @XmlElementRef(name = "RouteColor", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Color> routeColor;
    @XmlElement(name = "RouteCompleteTimeValue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeCompleteTimeValue;
    @XmlElementRef(name = "RouteCreationMethod_CreationMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeCreationMethodCreationMethod;
    @XmlElement(name = "RouteDepartureTimeValue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeDepartureTimeValue;
    @XmlElementRef(name = "RouteDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeDescription;
    @XmlElementRef(name = "RouteDisplayName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeDisplayName;
    @XmlElementRef(name = "RouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeIdentifier;
    @XmlElementRef(name = "RouteSessionDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> routeSessionDate;
    @XmlElementRef(name = "RouteStartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> routeStartTime;
    @XmlElement(name = "RouteStartTimeValue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeStartTimeValue;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Long telematicsDeviceEntityKey;
    @XmlElementRef(name = "Workers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentStatusWorkerDetail> workers;
    @XmlElementRef(name = "WorldTimeZone_RouteOriginTimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneRouteOriginTimeZone;
    @XmlElementRef(name = "WorldTimeZone_RouteTimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneRouteTimeZone;

    /**
     * Obtém o valor da propriedade missedServiceWindows.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMissedServiceWindows() {
        return missedServiceWindows;
    }

    /**
     * Define o valor da propriedade missedServiceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMissedServiceWindows(JAXBElement<Integer> value) {
        this.missedServiceWindows = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceBatteryState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BatteryState }{@code >}
     *     
     */
    public JAXBElement<BatteryState> getMobileDeviceBatteryState() {
        return mobileDeviceBatteryState;
    }

    /**
     * Define o valor da propriedade mobileDeviceBatteryState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BatteryState }{@code >}
     *     
     */
    public void setMobileDeviceBatteryState(JAXBElement<BatteryState> value) {
        this.mobileDeviceBatteryState = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMobileDeviceEntityKey() {
        return mobileDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade mobileDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMobileDeviceEntityKey(JAXBElement<Long> value) {
        this.mobileDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileDeviceIdentifier() {
        return mobileDeviceIdentifier;
    }

    /**
     * Define o valor da propriedade mobileDeviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileDeviceIdentifier(JAXBElement<String> value) {
        this.mobileDeviceIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileDeviceNumber() {
        return mobileDeviceNumber;
    }

    /**
     * Define o valor da propriedade mobileDeviceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileDeviceNumber(JAXBElement<String> value) {
        this.mobileDeviceNumber = value;
    }

    /**
     * Obtém o valor da propriedade numberOfCompletedServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfCompletedServiceableStops() {
        return numberOfCompletedServiceableStops;
    }

    /**
     * Define o valor da propriedade numberOfCompletedServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfCompletedServiceableStops(JAXBElement<Integer> value) {
        this.numberOfCompletedServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfServiceableStops() {
        return numberOfServiceableStops;
    }

    /**
     * Define o valor da propriedade numberOfServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfServiceableStops(JAXBElement<Integer> value) {
        this.numberOfServiceableStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfUnacknowledgedNotes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfUnacknowledgedNotes() {
        return numberOfUnacknowledgedNotes;
    }

    /**
     * Define o valor da propriedade numberOfUnacknowledgedNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfUnacknowledgedNotes(JAXBElement<Integer> value) {
        this.numberOfUnacknowledgedNotes = value;
    }

    /**
     * Obtém o valor da propriedade preferredWorkerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredWorkerIdentifier() {
        return preferredWorkerIdentifier;
    }

    /**
     * Define o valor da propriedade preferredWorkerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredWorkerIdentifier(JAXBElement<String> value) {
        this.preferredWorkerIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade preferredWorkerName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getPreferredWorkerName() {
        return preferredWorkerName;
    }

    /**
     * Define o valor da propriedade preferredWorkerName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setPreferredWorkerName(JAXBElement<PersonName> value) {
        this.preferredWorkerName = value;
    }

    /**
     * Obtém o valor da propriedade routeArrivalTimeValue.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteArrivalTimeValue() {
        return routeArrivalTimeValue;
    }

    /**
     * Define o valor da propriedade routeArrivalTimeValue.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteArrivalTimeValue(XMLGregorianCalendar value) {
        this.routeArrivalTimeValue = value;
    }

    /**
     * Obtém o valor da propriedade routeColor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public JAXBElement<Color> getRouteColor() {
        return routeColor;
    }

    /**
     * Define o valor da propriedade routeColor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public void setRouteColor(JAXBElement<Color> value) {
        this.routeColor = value;
    }

    /**
     * Obtém o valor da propriedade routeCompleteTimeValue.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteCompleteTimeValue() {
        return routeCompleteTimeValue;
    }

    /**
     * Define o valor da propriedade routeCompleteTimeValue.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteCompleteTimeValue(XMLGregorianCalendar value) {
        this.routeCompleteTimeValue = value;
    }

    /**
     * Obtém o valor da propriedade routeCreationMethodCreationMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteCreationMethodCreationMethod() {
        return routeCreationMethodCreationMethod;
    }

    /**
     * Define o valor da propriedade routeCreationMethodCreationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteCreationMethodCreationMethod(JAXBElement<String> value) {
        this.routeCreationMethodCreationMethod = value;
    }

    /**
     * Obtém o valor da propriedade routeDepartureTimeValue.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteDepartureTimeValue() {
        return routeDepartureTimeValue;
    }

    /**
     * Define o valor da propriedade routeDepartureTimeValue.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteDepartureTimeValue(XMLGregorianCalendar value) {
        this.routeDepartureTimeValue = value;
    }

    /**
     * Obtém o valor da propriedade routeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteDescription() {
        return routeDescription;
    }

    /**
     * Define o valor da propriedade routeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteDescription(JAXBElement<String> value) {
        this.routeDescription = value;
    }

    /**
     * Obtém o valor da propriedade routeDisplayName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteDisplayName() {
        return routeDisplayName;
    }

    /**
     * Define o valor da propriedade routeDisplayName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteDisplayName(JAXBElement<String> value) {
        this.routeDisplayName = value;
    }

    /**
     * Obtém o valor da propriedade routeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteIdentifier() {
        return routeIdentifier;
    }

    /**
     * Define o valor da propriedade routeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteIdentifier(JAXBElement<String> value) {
        this.routeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade routeSessionDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRouteSessionDate() {
        return routeSessionDate;
    }

    /**
     * Define o valor da propriedade routeSessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRouteSessionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.routeSessionDate = value;
    }

    /**
     * Obtém o valor da propriedade routeStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getRouteStartTime() {
        return routeStartTime;
    }

    /**
     * Define o valor da propriedade routeStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setRouteStartTime(JAXBElement<QualityPairedDateTime> value) {
        this.routeStartTime = value;
    }

    /**
     * Obtém o valor da propriedade routeStartTimeValue.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteStartTimeValue() {
        return routeStartTimeValue;
    }

    /**
     * Define o valor da propriedade routeStartTimeValue.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteStartTimeValue(XMLGregorianCalendar value) {
        this.routeStartTimeValue = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTelematicsDeviceEntityKey() {
        return telematicsDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTelematicsDeviceEntityKey(Long value) {
        this.telematicsDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentStatusWorkerDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentStatusWorkerDetail> getWorkers() {
        return workers;
    }

    /**
     * Define o valor da propriedade workers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentStatusWorkerDetail }{@code >}
     *     
     */
    public void setWorkers(JAXBElement<ArrayOfEquipmentStatusWorkerDetail> value) {
        this.workers = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneRouteOriginTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneRouteOriginTimeZone() {
        return worldTimeZoneRouteOriginTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneRouteOriginTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneRouteOriginTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneRouteOriginTimeZone = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneRouteTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneRouteTimeZone() {
        return worldTimeZoneRouteTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneRouteTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneRouteTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneRouteTimeZone = value;
    }

}
