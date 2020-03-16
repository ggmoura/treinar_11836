
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DispatchRouteSummaryStatistics complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DispatchRouteSummaryStatistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ActualDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ActualPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ArrivedStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CancelledStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NotArrivedStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NotStartedRoutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OnTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="StartedRoutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalExceptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalRoutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UnacknowledgedExceptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UnplannedStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DispatchRouteSummaryStatistics", propOrder = {
    "actualDeliveryQuantities",
    "actualDistance",
    "actualPickupQuantities",
    "arrivedStops",
    "cancelledStops",
    "damagedQuantities",
    "missedTimeWindows",
    "notArrivedStops",
    "notStartedRoutes",
    "onTime",
    "overQuantities",
    "plannedDeliveryQuantities",
    "plannedDistance",
    "plannedPickupQuantities",
    "shortQuantities",
    "startedRoutes",
    "totalExceptions",
    "totalRoutes",
    "totalStops",
    "unacknowledgedExceptions",
    "unplannedStops"
})
public class DispatchRouteSummaryStatistics {

    @XmlElement(name = "ActualDeliveryQuantities")
    protected Double actualDeliveryQuantities;
    @XmlElement(name = "ActualDistance")
    protected Double actualDistance;
    @XmlElement(name = "ActualPickupQuantities")
    protected Double actualPickupQuantities;
    @XmlElement(name = "ArrivedStops")
    protected Integer arrivedStops;
    @XmlElement(name = "CancelledStops")
    protected Integer cancelledStops;
    @XmlElement(name = "DamagedQuantities")
    protected Double damagedQuantities;
    @XmlElement(name = "MissedTimeWindows")
    protected Integer missedTimeWindows;
    @XmlElement(name = "NotArrivedStops")
    protected Integer notArrivedStops;
    @XmlElement(name = "NotStartedRoutes")
    protected Integer notStartedRoutes;
    @XmlElement(name = "OnTime")
    protected Integer onTime;
    @XmlElement(name = "OverQuantities")
    protected Double overQuantities;
    @XmlElement(name = "PlannedDeliveryQuantities")
    protected Double plannedDeliveryQuantities;
    @XmlElement(name = "PlannedDistance")
    protected Double plannedDistance;
    @XmlElement(name = "PlannedPickupQuantities")
    protected Double plannedPickupQuantities;
    @XmlElement(name = "ShortQuantities")
    protected Double shortQuantities;
    @XmlElement(name = "StartedRoutes")
    protected Integer startedRoutes;
    @XmlElement(name = "TotalExceptions")
    protected Integer totalExceptions;
    @XmlElement(name = "TotalRoutes")
    protected Integer totalRoutes;
    @XmlElement(name = "TotalStops")
    protected Integer totalStops;
    @XmlElement(name = "UnacknowledgedExceptions")
    protected Integer unacknowledgedExceptions;
    @XmlElement(name = "UnplannedStops")
    protected Integer unplannedStops;

    /**
     * Obtém o valor da propriedade actualDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualDeliveryQuantities() {
        return actualDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade actualDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualDeliveryQuantities(Double value) {
        this.actualDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade actualDistance.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualDistance() {
        return actualDistance;
    }

    /**
     * Define o valor da propriedade actualDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualDistance(Double value) {
        this.actualDistance = value;
    }

    /**
     * Obtém o valor da propriedade actualPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualPickupQuantities() {
        return actualPickupQuantities;
    }

    /**
     * Define o valor da propriedade actualPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualPickupQuantities(Double value) {
        this.actualPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade arrivedStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrivedStops() {
        return arrivedStops;
    }

    /**
     * Define o valor da propriedade arrivedStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrivedStops(Integer value) {
        this.arrivedStops = value;
    }

    /**
     * Obtém o valor da propriedade cancelledStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCancelledStops() {
        return cancelledStops;
    }

    /**
     * Define o valor da propriedade cancelledStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCancelledStops(Integer value) {
        this.cancelledStops = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDamagedQuantities() {
        return damagedQuantities;
    }

    /**
     * Define o valor da propriedade damagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDamagedQuantities(Double value) {
        this.damagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindows.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMissedTimeWindows() {
        return missedTimeWindows;
    }

    /**
     * Define o valor da propriedade missedTimeWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMissedTimeWindows(Integer value) {
        this.missedTimeWindows = value;
    }

    /**
     * Obtém o valor da propriedade notArrivedStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotArrivedStops() {
        return notArrivedStops;
    }

    /**
     * Define o valor da propriedade notArrivedStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotArrivedStops(Integer value) {
        this.notArrivedStops = value;
    }

    /**
     * Obtém o valor da propriedade notStartedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotStartedRoutes() {
        return notStartedRoutes;
    }

    /**
     * Define o valor da propriedade notStartedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotStartedRoutes(Integer value) {
        this.notStartedRoutes = value;
    }

    /**
     * Obtém o valor da propriedade onTime.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOnTime() {
        return onTime;
    }

    /**
     * Define o valor da propriedade onTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOnTime(Integer value) {
        this.onTime = value;
    }

    /**
     * Obtém o valor da propriedade overQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverQuantities() {
        return overQuantities;
    }

    /**
     * Define o valor da propriedade overQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverQuantities(Double value) {
        this.overQuantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlannedDeliveryQuantities() {
        return plannedDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlannedDeliveryQuantities(Double value) {
        this.plannedDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDistance.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlannedDistance() {
        return plannedDistance;
    }

    /**
     * Define o valor da propriedade plannedDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlannedDistance(Double value) {
        this.plannedDistance = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlannedPickupQuantities() {
        return plannedPickupQuantities;
    }

    /**
     * Define o valor da propriedade plannedPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlannedPickupQuantities(Double value) {
        this.plannedPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShortQuantities() {
        return shortQuantities;
    }

    /**
     * Define o valor da propriedade shortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShortQuantities(Double value) {
        this.shortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade startedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartedRoutes() {
        return startedRoutes;
    }

    /**
     * Define o valor da propriedade startedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartedRoutes(Integer value) {
        this.startedRoutes = value;
    }

    /**
     * Obtém o valor da propriedade totalExceptions.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalExceptions() {
        return totalExceptions;
    }

    /**
     * Define o valor da propriedade totalExceptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalExceptions(Integer value) {
        this.totalExceptions = value;
    }

    /**
     * Obtém o valor da propriedade totalRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRoutes() {
        return totalRoutes;
    }

    /**
     * Define o valor da propriedade totalRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRoutes(Integer value) {
        this.totalRoutes = value;
    }

    /**
     * Obtém o valor da propriedade totalStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalStops() {
        return totalStops;
    }

    /**
     * Define o valor da propriedade totalStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalStops(Integer value) {
        this.totalStops = value;
    }

    /**
     * Obtém o valor da propriedade unacknowledgedExceptions.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnacknowledgedExceptions() {
        return unacknowledgedExceptions;
    }

    /**
     * Define o valor da propriedade unacknowledgedExceptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnacknowledgedExceptions(Integer value) {
        this.unacknowledgedExceptions = value;
    }

    /**
     * Obtém o valor da propriedade unplannedStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnplannedStops() {
        return unplannedStops;
    }

    /**
     * Define o valor da propriedade unplannedStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnplannedStops(Integer value) {
        this.unplannedStops = value;
    }

}
