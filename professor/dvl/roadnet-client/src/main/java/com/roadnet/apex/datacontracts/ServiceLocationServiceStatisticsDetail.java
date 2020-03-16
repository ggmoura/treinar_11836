
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ServiceLocationServiceStatisticsDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocationServiceStatisticsDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alerts" type="{http://roadnet.com/apex/DataContracts/}StopAlertFlags" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="HasBeenDepartedFrom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocalTimeZone" type="{http://roadnet.com/apex/DataContracts/}WorldTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="MissedOpenCloseEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedOpenCloseLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowsEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowsLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceableStopOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="PlannedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedOpenCloseEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedOpenCloseLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedServiceWindowsEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedMissedServiceWindowsLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedServiceStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIdentifer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ServiceStartTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceableStopServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocationServiceStatisticsDetail", propOrder = {
    "alerts",
    "arrivalTime",
    "hasBeenDepartedFrom",
    "isCancelled",
    "localTimeZone",
    "missedOpenCloseEarlyDuration",
    "missedOpenCloseLateDuration",
    "missedServiceWindowsEarlyDuration",
    "missedServiceWindowsLateDuration",
    "openCloseDetails",
    "plannedArrivalTime",
    "plannedMissedOpenCloseEarlyDuration",
    "plannedMissedOpenCloseLateDuration",
    "plannedMissedServiceWindowsEarlyDuration",
    "plannedMissedServiceWindowsLateDuration",
    "plannedServiceStartTime",
    "routeIdentifier",
    "serviceLocationIdentifer",
    "serviceStartDate",
    "serviceStartTime",
    "serviceWindowDetails",
    "totalDeliveryQuantities",
    "totalPickupQuantities",
    "totalPlannedDeliveryQuantities",
    "totalPlannedPickupQuantities",
    "totalPlannedServiceTime",
    "totalServiceTime"
})
public class ServiceLocationServiceStatisticsDetail {

    @XmlList
    @XmlElement(name = "Alerts")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> alerts;
    @XmlElementRef(name = "ArrivalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> arrivalTime;
    @XmlElement(name = "HasBeenDepartedFrom")
    protected Boolean hasBeenDepartedFrom;
    @XmlElement(name = "IsCancelled")
    protected Boolean isCancelled;
    @XmlElement(name = "LocalTimeZone")
    @XmlSchemaType(name = "string")
    protected WorldTimeZone localTimeZone;
    @XmlElementRef(name = "MissedOpenCloseEarlyDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> missedOpenCloseEarlyDuration;
    @XmlElementRef(name = "MissedOpenCloseLateDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> missedOpenCloseLateDuration;
    @XmlElementRef(name = "MissedServiceWindowsEarlyDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> missedServiceWindowsEarlyDuration;
    @XmlElementRef(name = "MissedServiceWindowsLateDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> missedServiceWindowsLateDuration;
    @XmlElementRef(name = "OpenCloseDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceableStopOpenCloseDetail> openCloseDetails;
    @XmlElementRef(name = "PlannedArrivalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedArrivalTime;
    @XmlElementRef(name = "PlannedMissedOpenCloseEarlyDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedMissedOpenCloseEarlyDuration;
    @XmlElementRef(name = "PlannedMissedOpenCloseLateDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedMissedOpenCloseLateDuration;
    @XmlElementRef(name = "PlannedMissedServiceWindowsEarlyDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedMissedServiceWindowsEarlyDuration;
    @XmlElementRef(name = "PlannedMissedServiceWindowsLateDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedMissedServiceWindowsLateDuration;
    @XmlElementRef(name = "PlannedServiceStartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedServiceStartTime;
    @XmlElementRef(name = "RouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeIdentifier;
    @XmlElementRef(name = "ServiceLocationIdentifer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationIdentifer;
    @XmlElementRef(name = "ServiceStartDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> serviceStartDate;
    @XmlElementRef(name = "ServiceStartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> serviceStartTime;
    @XmlElementRef(name = "ServiceWindowDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceableStopServiceWindowDetail> serviceWindowDetails;
    @XmlElementRef(name = "TotalDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryQuantities;
    @XmlElementRef(name = "TotalPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupQuantities;
    @XmlElementRef(name = "TotalPlannedDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPlannedDeliveryQuantities;
    @XmlElementRef(name = "TotalPlannedPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPlannedPickupQuantities;
    @XmlElementRef(name = "TotalPlannedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalPlannedServiceTime;
    @XmlElementRef(name = "TotalServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalServiceTime;

    /**
     * Gets the value of the alerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlerts() {
        if (alerts == null) {
            alerts = new ArrayList<String>();
        }
        return this.alerts;
    }

    /**
     * Obtém o valor da propriedade arrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Define o valor da propriedade arrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setArrivalTime(JAXBElement<QualityPairedDateTime> value) {
        this.arrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade hasBeenDepartedFrom.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBeenDepartedFrom() {
        return hasBeenDepartedFrom;
    }

    /**
     * Define o valor da propriedade hasBeenDepartedFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBeenDepartedFrom(Boolean value) {
        this.hasBeenDepartedFrom = value;
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
     * Obtém o valor da propriedade localTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link WorldTimeZone }
     *     
     */
    public WorldTimeZone getLocalTimeZone() {
        return localTimeZone;
    }

    /**
     * Define o valor da propriedade localTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link WorldTimeZone }
     *     
     */
    public void setLocalTimeZone(WorldTimeZone value) {
        this.localTimeZone = value;
    }

    /**
     * Obtém o valor da propriedade missedOpenCloseEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMissedOpenCloseEarlyDuration() {
        return missedOpenCloseEarlyDuration;
    }

    /**
     * Define o valor da propriedade missedOpenCloseEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMissedOpenCloseEarlyDuration(JAXBElement<Duration> value) {
        this.missedOpenCloseEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedOpenCloseLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMissedOpenCloseLateDuration() {
        return missedOpenCloseLateDuration;
    }

    /**
     * Define o valor da propriedade missedOpenCloseLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMissedOpenCloseLateDuration(JAXBElement<Duration> value) {
        this.missedOpenCloseLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedServiceWindowsEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMissedServiceWindowsEarlyDuration() {
        return missedServiceWindowsEarlyDuration;
    }

    /**
     * Define o valor da propriedade missedServiceWindowsEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMissedServiceWindowsEarlyDuration(JAXBElement<Duration> value) {
        this.missedServiceWindowsEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedServiceWindowsLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMissedServiceWindowsLateDuration() {
        return missedServiceWindowsLateDuration;
    }

    /**
     * Define o valor da propriedade missedServiceWindowsLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMissedServiceWindowsLateDuration(JAXBElement<Duration> value) {
        this.missedServiceWindowsLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade openCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceableStopOpenCloseDetail> getOpenCloseDetails() {
        return openCloseDetails;
    }

    /**
     * Define o valor da propriedade openCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopOpenCloseDetail }{@code >}
     *     
     */
    public void setOpenCloseDetails(JAXBElement<ArrayOfServiceableStopOpenCloseDetail> value) {
        this.openCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade plannedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedArrivalTime() {
        return plannedArrivalTime;
    }

    /**
     * Define o valor da propriedade plannedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedArrivalTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedOpenCloseEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedMissedOpenCloseEarlyDuration() {
        return plannedMissedOpenCloseEarlyDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedOpenCloseEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedMissedOpenCloseEarlyDuration(JAXBElement<Duration> value) {
        this.plannedMissedOpenCloseEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedOpenCloseLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedMissedOpenCloseLateDuration() {
        return plannedMissedOpenCloseLateDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedOpenCloseLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedMissedOpenCloseLateDuration(JAXBElement<Duration> value) {
        this.plannedMissedOpenCloseLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedServiceWindowsEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedMissedServiceWindowsEarlyDuration() {
        return plannedMissedServiceWindowsEarlyDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedServiceWindowsEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedMissedServiceWindowsEarlyDuration(JAXBElement<Duration> value) {
        this.plannedMissedServiceWindowsEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedMissedServiceWindowsLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedMissedServiceWindowsLateDuration() {
        return plannedMissedServiceWindowsLateDuration;
    }

    /**
     * Define o valor da propriedade plannedMissedServiceWindowsLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedMissedServiceWindowsLateDuration(JAXBElement<Duration> value) {
        this.plannedMissedServiceWindowsLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedServiceStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedServiceStartTime() {
        return plannedServiceStartTime;
    }

    /**
     * Define o valor da propriedade plannedServiceStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedServiceStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedServiceStartTime = value;
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
     * Obtém o valor da propriedade serviceLocationIdentifer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationIdentifer() {
        return serviceLocationIdentifer;
    }

    /**
     * Define o valor da propriedade serviceLocationIdentifer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationIdentifer(JAXBElement<String> value) {
        this.serviceLocationIdentifer = value;
    }

    /**
     * Obtém o valor da propriedade serviceStartDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getServiceStartDate() {
        return serviceStartDate;
    }

    /**
     * Define o valor da propriedade serviceStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setServiceStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.serviceStartDate = value;
    }

    /**
     * Obtém o valor da propriedade serviceStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getServiceStartTime() {
        return serviceStartTime;
    }

    /**
     * Define o valor da propriedade serviceStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setServiceStartTime(JAXBElement<QualityPairedDateTime> value) {
        this.serviceStartTime = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopServiceWindowDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceableStopServiceWindowDetail> getServiceWindowDetails() {
        return serviceWindowDetails;
    }

    /**
     * Define o valor da propriedade serviceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopServiceWindowDetail }{@code >}
     *     
     */
    public void setServiceWindowDetails(JAXBElement<ArrayOfServiceableStopServiceWindowDetail> value) {
        this.serviceWindowDetails = value;
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
     * Obtém o valor da propriedade totalPlannedDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPlannedDeliveryQuantities() {
        return totalPlannedDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade totalPlannedDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPlannedDeliveryQuantities(JAXBElement<Quantities> value) {
        this.totalPlannedDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPlannedPickupQuantities() {
        return totalPlannedPickupQuantities;
    }

    /**
     * Define o valor da propriedade totalPlannedPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPlannedPickupQuantities(JAXBElement<Quantities> value) {
        this.totalPlannedPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalPlannedServiceTime() {
        return totalPlannedServiceTime;
    }

    /**
     * Define o valor da propriedade totalPlannedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalPlannedServiceTime(JAXBElement<Duration> value) {
        this.totalPlannedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalServiceTime() {
        return totalServiceTime;
    }

    /**
     * Define o valor da propriedade totalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalServiceTime(JAXBElement<Duration> value) {
        this.totalServiceTime = value;
    }

}
