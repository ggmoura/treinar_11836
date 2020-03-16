
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfDayOfWeekintFfzvU1AO;


/**
 * <p>Classe Java de ServiceLocationServiceStatistics complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocationServiceStatistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlertSummary" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1aOl0R0m5ou" minOccurs="0"/&gt;
 *         &lt;element name="AveragePlanServiceWindowsEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AveragePlanServiceWindowsLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AverageServiceStartEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AverageServiceStartLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AverageServiceWindowsEarlyDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AverageServiceWindowsLateDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AverageTotalDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="AverageTotalPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="AverageTotalPlannedDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="AverageTotalPlannedPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Details" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceLocationServiceStatisticsDetail" minOccurs="0"/&gt;
 *         &lt;element name="InstancesPlanServiceWindowsEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InstancesPlanServiceWindowsLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InstancesServiceStartedEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InstancesServiceStartedLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InstancesServiceWindowsEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InstancesServiceWindowsLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfStopsPerDay" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfDayOfWeekintFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="PercentMadePlanServiceWindows" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PercentMadeServiceWindows" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PercentServiceStartedOnTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PlannedNumberOfStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocationServiceStatistics", propOrder = {
    "alertSummary",
    "averagePlanServiceWindowsEarlyDuration",
    "averagePlanServiceWindowsLateDuration",
    "averageServiceStartEarlyDuration",
    "averageServiceStartLateDuration",
    "averageServiceWindowsEarlyDuration",
    "averageServiceWindowsLateDuration",
    "averageTotalDeliveryQuantities",
    "averageTotalPickupQuantities",
    "averageTotalPlannedDeliveryQuantities",
    "averageTotalPlannedPickupQuantities",
    "details",
    "instancesPlanServiceWindowsEarly",
    "instancesPlanServiceWindowsLate",
    "instancesServiceStartedEarly",
    "instancesServiceStartedLate",
    "instancesServiceWindowsEarly",
    "instancesServiceWindowsLate",
    "numberOfStops",
    "numberOfStopsPerDay",
    "percentMadePlanServiceWindows",
    "percentMadeServiceWindows",
    "percentServiceStartedOnTime",
    "plannedNumberOfStops",
    "totalDeliveryQuantities",
    "totalPickupQuantities",
    "totalPlannedDeliveryQuantities",
    "totalPlannedPickupQuantities"
})
public class ServiceLocationServiceStatistics {

    @XmlElementRef(name = "AlertSummary", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou> alertSummary;
    @XmlElement(name = "AveragePlanServiceWindowsEarlyDuration")
    protected Duration averagePlanServiceWindowsEarlyDuration;
    @XmlElement(name = "AveragePlanServiceWindowsLateDuration")
    protected Duration averagePlanServiceWindowsLateDuration;
    @XmlElement(name = "AverageServiceStartEarlyDuration")
    protected Duration averageServiceStartEarlyDuration;
    @XmlElement(name = "AverageServiceStartLateDuration")
    protected Duration averageServiceStartLateDuration;
    @XmlElement(name = "AverageServiceWindowsEarlyDuration")
    protected Duration averageServiceWindowsEarlyDuration;
    @XmlElement(name = "AverageServiceWindowsLateDuration")
    protected Duration averageServiceWindowsLateDuration;
    @XmlElementRef(name = "AverageTotalDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> averageTotalDeliveryQuantities;
    @XmlElementRef(name = "AverageTotalPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> averageTotalPickupQuantities;
    @XmlElementRef(name = "AverageTotalPlannedDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> averageTotalPlannedDeliveryQuantities;
    @XmlElementRef(name = "AverageTotalPlannedPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> averageTotalPlannedPickupQuantities;
    @XmlElementRef(name = "Details", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceLocationServiceStatisticsDetail> details;
    @XmlElement(name = "InstancesPlanServiceWindowsEarly")
    protected Integer instancesPlanServiceWindowsEarly;
    @XmlElement(name = "InstancesPlanServiceWindowsLate")
    protected Integer instancesPlanServiceWindowsLate;
    @XmlElement(name = "InstancesServiceStartedEarly")
    protected Integer instancesServiceStartedEarly;
    @XmlElement(name = "InstancesServiceStartedLate")
    protected Integer instancesServiceStartedLate;
    @XmlElement(name = "InstancesServiceWindowsEarly")
    protected Integer instancesServiceWindowsEarly;
    @XmlElement(name = "InstancesServiceWindowsLate")
    protected Integer instancesServiceWindowsLate;
    @XmlElement(name = "NumberOfStops")
    protected Integer numberOfStops;
    @XmlElementRef(name = "NumberOfStopsPerDay", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfDayOfWeekintFfzvU1AO> numberOfStopsPerDay;
    @XmlElement(name = "PercentMadePlanServiceWindows")
    protected Double percentMadePlanServiceWindows;
    @XmlElement(name = "PercentMadeServiceWindows")
    protected Double percentMadeServiceWindows;
    @XmlElement(name = "PercentServiceStartedOnTime")
    protected Double percentServiceStartedOnTime;
    @XmlElement(name = "PlannedNumberOfStops")
    protected Integer plannedNumberOfStops;
    @XmlElementRef(name = "TotalDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryQuantities;
    @XmlElementRef(name = "TotalPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupQuantities;
    @XmlElementRef(name = "TotalPlannedDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPlannedDeliveryQuantities;
    @XmlElementRef(name = "TotalPlannedPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPlannedPickupQuantities;

    /**
     * Obtém o valor da propriedade alertSummary.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou> getAlertSummary() {
        return alertSummary;
    }

    /**
     * Define o valor da propriedade alertSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou }{@code >}
     *     
     */
    public void setAlertSummary(JAXBElement<ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou> value) {
        this.alertSummary = value;
    }

    /**
     * Obtém o valor da propriedade averagePlanServiceWindowsEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAveragePlanServiceWindowsEarlyDuration() {
        return averagePlanServiceWindowsEarlyDuration;
    }

    /**
     * Define o valor da propriedade averagePlanServiceWindowsEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAveragePlanServiceWindowsEarlyDuration(Duration value) {
        this.averagePlanServiceWindowsEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade averagePlanServiceWindowsLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAveragePlanServiceWindowsLateDuration() {
        return averagePlanServiceWindowsLateDuration;
    }

    /**
     * Define o valor da propriedade averagePlanServiceWindowsLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAveragePlanServiceWindowsLateDuration(Duration value) {
        this.averagePlanServiceWindowsLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade averageServiceStartEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAverageServiceStartEarlyDuration() {
        return averageServiceStartEarlyDuration;
    }

    /**
     * Define o valor da propriedade averageServiceStartEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAverageServiceStartEarlyDuration(Duration value) {
        this.averageServiceStartEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade averageServiceStartLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAverageServiceStartLateDuration() {
        return averageServiceStartLateDuration;
    }

    /**
     * Define o valor da propriedade averageServiceStartLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAverageServiceStartLateDuration(Duration value) {
        this.averageServiceStartLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade averageServiceWindowsEarlyDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAverageServiceWindowsEarlyDuration() {
        return averageServiceWindowsEarlyDuration;
    }

    /**
     * Define o valor da propriedade averageServiceWindowsEarlyDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAverageServiceWindowsEarlyDuration(Duration value) {
        this.averageServiceWindowsEarlyDuration = value;
    }

    /**
     * Obtém o valor da propriedade averageServiceWindowsLateDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAverageServiceWindowsLateDuration() {
        return averageServiceWindowsLateDuration;
    }

    /**
     * Define o valor da propriedade averageServiceWindowsLateDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAverageServiceWindowsLateDuration(Duration value) {
        this.averageServiceWindowsLateDuration = value;
    }

    /**
     * Obtém o valor da propriedade averageTotalDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getAverageTotalDeliveryQuantities() {
        return averageTotalDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade averageTotalDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setAverageTotalDeliveryQuantities(JAXBElement<Quantities> value) {
        this.averageTotalDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade averageTotalPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getAverageTotalPickupQuantities() {
        return averageTotalPickupQuantities;
    }

    /**
     * Define o valor da propriedade averageTotalPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setAverageTotalPickupQuantities(JAXBElement<Quantities> value) {
        this.averageTotalPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade averageTotalPlannedDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getAverageTotalPlannedDeliveryQuantities() {
        return averageTotalPlannedDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade averageTotalPlannedDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setAverageTotalPlannedDeliveryQuantities(JAXBElement<Quantities> value) {
        this.averageTotalPlannedDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade averageTotalPlannedPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getAverageTotalPlannedPickupQuantities() {
        return averageTotalPlannedPickupQuantities;
    }

    /**
     * Define o valor da propriedade averageTotalPlannedPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setAverageTotalPlannedPickupQuantities(JAXBElement<Quantities> value) {
        this.averageTotalPlannedPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade details.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationServiceStatisticsDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceLocationServiceStatisticsDetail> getDetails() {
        return details;
    }

    /**
     * Define o valor da propriedade details.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationServiceStatisticsDetail }{@code >}
     *     
     */
    public void setDetails(JAXBElement<ArrayOfServiceLocationServiceStatisticsDetail> value) {
        this.details = value;
    }

    /**
     * Obtém o valor da propriedade instancesPlanServiceWindowsEarly.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstancesPlanServiceWindowsEarly() {
        return instancesPlanServiceWindowsEarly;
    }

    /**
     * Define o valor da propriedade instancesPlanServiceWindowsEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstancesPlanServiceWindowsEarly(Integer value) {
        this.instancesPlanServiceWindowsEarly = value;
    }

    /**
     * Obtém o valor da propriedade instancesPlanServiceWindowsLate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstancesPlanServiceWindowsLate() {
        return instancesPlanServiceWindowsLate;
    }

    /**
     * Define o valor da propriedade instancesPlanServiceWindowsLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstancesPlanServiceWindowsLate(Integer value) {
        this.instancesPlanServiceWindowsLate = value;
    }

    /**
     * Obtém o valor da propriedade instancesServiceStartedEarly.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstancesServiceStartedEarly() {
        return instancesServiceStartedEarly;
    }

    /**
     * Define o valor da propriedade instancesServiceStartedEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstancesServiceStartedEarly(Integer value) {
        this.instancesServiceStartedEarly = value;
    }

    /**
     * Obtém o valor da propriedade instancesServiceStartedLate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstancesServiceStartedLate() {
        return instancesServiceStartedLate;
    }

    /**
     * Define o valor da propriedade instancesServiceStartedLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstancesServiceStartedLate(Integer value) {
        this.instancesServiceStartedLate = value;
    }

    /**
     * Obtém o valor da propriedade instancesServiceWindowsEarly.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstancesServiceWindowsEarly() {
        return instancesServiceWindowsEarly;
    }

    /**
     * Define o valor da propriedade instancesServiceWindowsEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstancesServiceWindowsEarly(Integer value) {
        this.instancesServiceWindowsEarly = value;
    }

    /**
     * Obtém o valor da propriedade instancesServiceWindowsLate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstancesServiceWindowsLate() {
        return instancesServiceWindowsLate;
    }

    /**
     * Define o valor da propriedade instancesServiceWindowsLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstancesServiceWindowsLate(Integer value) {
        this.instancesServiceWindowsLate = value;
    }

    /**
     * Obtém o valor da propriedade numberOfStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfStops() {
        return numberOfStops;
    }

    /**
     * Define o valor da propriedade numberOfStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfStops(Integer value) {
        this.numberOfStops = value;
    }

    /**
     * Obtém o valor da propriedade numberOfStopsPerDay.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfDayOfWeekintFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfDayOfWeekintFfzvU1AO> getNumberOfStopsPerDay() {
        return numberOfStopsPerDay;
    }

    /**
     * Define o valor da propriedade numberOfStopsPerDay.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfDayOfWeekintFfzvU1AO }{@code >}
     *     
     */
    public void setNumberOfStopsPerDay(JAXBElement<ArrayOfKeyValueOfDayOfWeekintFfzvU1AO> value) {
        this.numberOfStopsPerDay = value;
    }

    /**
     * Obtém o valor da propriedade percentMadePlanServiceWindows.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentMadePlanServiceWindows() {
        return percentMadePlanServiceWindows;
    }

    /**
     * Define o valor da propriedade percentMadePlanServiceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentMadePlanServiceWindows(Double value) {
        this.percentMadePlanServiceWindows = value;
    }

    /**
     * Obtém o valor da propriedade percentMadeServiceWindows.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentMadeServiceWindows() {
        return percentMadeServiceWindows;
    }

    /**
     * Define o valor da propriedade percentMadeServiceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentMadeServiceWindows(Double value) {
        this.percentMadeServiceWindows = value;
    }

    /**
     * Obtém o valor da propriedade percentServiceStartedOnTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentServiceStartedOnTime() {
        return percentServiceStartedOnTime;
    }

    /**
     * Define o valor da propriedade percentServiceStartedOnTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentServiceStartedOnTime(Double value) {
        this.percentServiceStartedOnTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedNumberOfStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlannedNumberOfStops() {
        return plannedNumberOfStops;
    }

    /**
     * Define o valor da propriedade plannedNumberOfStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlannedNumberOfStops(Integer value) {
        this.plannedNumberOfStops = value;
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

}
