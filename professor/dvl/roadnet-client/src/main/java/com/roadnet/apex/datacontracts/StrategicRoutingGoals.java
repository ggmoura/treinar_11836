
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de StrategicRoutingGoals complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StrategicRoutingGoals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BalanceCapacityUtilizationBetweenTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BalanceCapacityUtilizationWithinTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BalanceLoadBetweenTerritoriesFactors" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BalanceLoadWithinTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BalanceNumberOfOrderGroupsBetweenTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BalanceNumberOfStopBetweenTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BalanceNumberOfStopsWithinTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BalanceRunTimeBetweenTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BalanceRunTimeWithinTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BalanceServiceTimeBetweenTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BalanceServiceTimeWithinTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ClusteredTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="EvenServiceGaps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowEarlyFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowLateFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRunTimeFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RouteClusteringFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategicRoutingGoals", propOrder = {
    "balanceCapacityUtilizationBetweenTerritoriesFactor",
    "balanceCapacityUtilizationWithinTerritoriesFactor",
    "balanceLoadBetweenTerritoriesFactors",
    "balanceLoadWithinTerritoriesFactor",
    "balanceNumberOfOrderGroupsBetweenTerritoriesFactor",
    "balanceNumberOfStopBetweenTerritoriesFactor",
    "balanceNumberOfStopsWithinTerritoriesFactor",
    "balanceRunTimeBetweenTerritoriesFactor",
    "balanceRunTimeWithinTerritoriesFactor",
    "balanceServiceTimeBetweenTerritoriesFactor",
    "balanceServiceTimeWithinTerritoriesFactor",
    "clusteredTerritoriesFactor",
    "evenServiceGaps",
    "missedTimeWindowEarlyFactor",
    "missedTimeWindowLateFactor",
    "preferredRunTimeFactor",
    "routeClusteringFactor"
})
public class StrategicRoutingGoals
    extends DataTransferObject
{

    @XmlElement(name = "BalanceCapacityUtilizationBetweenTerritoriesFactor")
    protected Double balanceCapacityUtilizationBetweenTerritoriesFactor;
    @XmlElement(name = "BalanceCapacityUtilizationWithinTerritoriesFactor")
    protected Double balanceCapacityUtilizationWithinTerritoriesFactor;
    @XmlElement(name = "BalanceLoadBetweenTerritoriesFactors")
    protected Double balanceLoadBetweenTerritoriesFactors;
    @XmlElement(name = "BalanceLoadWithinTerritoriesFactor")
    protected Double balanceLoadWithinTerritoriesFactor;
    @XmlElement(name = "BalanceNumberOfOrderGroupsBetweenTerritoriesFactor")
    protected Double balanceNumberOfOrderGroupsBetweenTerritoriesFactor;
    @XmlElement(name = "BalanceNumberOfStopBetweenTerritoriesFactor")
    protected Double balanceNumberOfStopBetweenTerritoriesFactor;
    @XmlElement(name = "BalanceNumberOfStopsWithinTerritoriesFactor")
    protected Double balanceNumberOfStopsWithinTerritoriesFactor;
    @XmlElement(name = "BalanceRunTimeBetweenTerritoriesFactor")
    protected Double balanceRunTimeBetweenTerritoriesFactor;
    @XmlElement(name = "BalanceRunTimeWithinTerritoriesFactor")
    protected Double balanceRunTimeWithinTerritoriesFactor;
    @XmlElement(name = "BalanceServiceTimeBetweenTerritoriesFactor")
    protected Double balanceServiceTimeBetweenTerritoriesFactor;
    @XmlElement(name = "BalanceServiceTimeWithinTerritoriesFactor")
    protected Double balanceServiceTimeWithinTerritoriesFactor;
    @XmlElement(name = "ClusteredTerritoriesFactor")
    protected Double clusteredTerritoriesFactor;
    @XmlElement(name = "EvenServiceGaps")
    protected Double evenServiceGaps;
    @XmlElement(name = "MissedTimeWindowEarlyFactor")
    protected Double missedTimeWindowEarlyFactor;
    @XmlElement(name = "MissedTimeWindowLateFactor")
    protected Double missedTimeWindowLateFactor;
    @XmlElement(name = "PreferredRunTimeFactor")
    protected Double preferredRunTimeFactor;
    @XmlElement(name = "RouteClusteringFactor")
    protected Double routeClusteringFactor;

    /**
     * Obtém o valor da propriedade balanceCapacityUtilizationBetweenTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceCapacityUtilizationBetweenTerritoriesFactor() {
        return balanceCapacityUtilizationBetweenTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceCapacityUtilizationBetweenTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceCapacityUtilizationBetweenTerritoriesFactor(Double value) {
        this.balanceCapacityUtilizationBetweenTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceCapacityUtilizationWithinTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceCapacityUtilizationWithinTerritoriesFactor() {
        return balanceCapacityUtilizationWithinTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceCapacityUtilizationWithinTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceCapacityUtilizationWithinTerritoriesFactor(Double value) {
        this.balanceCapacityUtilizationWithinTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceLoadBetweenTerritoriesFactors.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceLoadBetweenTerritoriesFactors() {
        return balanceLoadBetweenTerritoriesFactors;
    }

    /**
     * Define o valor da propriedade balanceLoadBetweenTerritoriesFactors.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceLoadBetweenTerritoriesFactors(Double value) {
        this.balanceLoadBetweenTerritoriesFactors = value;
    }

    /**
     * Obtém o valor da propriedade balanceLoadWithinTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceLoadWithinTerritoriesFactor() {
        return balanceLoadWithinTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceLoadWithinTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceLoadWithinTerritoriesFactor(Double value) {
        this.balanceLoadWithinTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceNumberOfOrderGroupsBetweenTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceNumberOfOrderGroupsBetweenTerritoriesFactor() {
        return balanceNumberOfOrderGroupsBetweenTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceNumberOfOrderGroupsBetweenTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceNumberOfOrderGroupsBetweenTerritoriesFactor(Double value) {
        this.balanceNumberOfOrderGroupsBetweenTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceNumberOfStopBetweenTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceNumberOfStopBetweenTerritoriesFactor() {
        return balanceNumberOfStopBetweenTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceNumberOfStopBetweenTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceNumberOfStopBetweenTerritoriesFactor(Double value) {
        this.balanceNumberOfStopBetweenTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceNumberOfStopsWithinTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceNumberOfStopsWithinTerritoriesFactor() {
        return balanceNumberOfStopsWithinTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceNumberOfStopsWithinTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceNumberOfStopsWithinTerritoriesFactor(Double value) {
        this.balanceNumberOfStopsWithinTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceRunTimeBetweenTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceRunTimeBetweenTerritoriesFactor() {
        return balanceRunTimeBetweenTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceRunTimeBetweenTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceRunTimeBetweenTerritoriesFactor(Double value) {
        this.balanceRunTimeBetweenTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceRunTimeWithinTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceRunTimeWithinTerritoriesFactor() {
        return balanceRunTimeWithinTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceRunTimeWithinTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceRunTimeWithinTerritoriesFactor(Double value) {
        this.balanceRunTimeWithinTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceServiceTimeBetweenTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceServiceTimeBetweenTerritoriesFactor() {
        return balanceServiceTimeBetweenTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceServiceTimeBetweenTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceServiceTimeBetweenTerritoriesFactor(Double value) {
        this.balanceServiceTimeBetweenTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceServiceTimeWithinTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceServiceTimeWithinTerritoriesFactor() {
        return balanceServiceTimeWithinTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceServiceTimeWithinTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceServiceTimeWithinTerritoriesFactor(Double value) {
        this.balanceServiceTimeWithinTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade clusteredTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClusteredTerritoriesFactor() {
        return clusteredTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade clusteredTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClusteredTerritoriesFactor(Double value) {
        this.clusteredTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade evenServiceGaps.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEvenServiceGaps() {
        return evenServiceGaps;
    }

    /**
     * Define o valor da propriedade evenServiceGaps.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEvenServiceGaps(Double value) {
        this.evenServiceGaps = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowEarlyFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMissedTimeWindowEarlyFactor() {
        return missedTimeWindowEarlyFactor;
    }

    /**
     * Define o valor da propriedade missedTimeWindowEarlyFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMissedTimeWindowEarlyFactor(Double value) {
        this.missedTimeWindowEarlyFactor = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowLateFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMissedTimeWindowLateFactor() {
        return missedTimeWindowLateFactor;
    }

    /**
     * Define o valor da propriedade missedTimeWindowLateFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMissedTimeWindowLateFactor(Double value) {
        this.missedTimeWindowLateFactor = value;
    }

    /**
     * Obtém o valor da propriedade preferredRunTimeFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreferredRunTimeFactor() {
        return preferredRunTimeFactor;
    }

    /**
     * Define o valor da propriedade preferredRunTimeFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreferredRunTimeFactor(Double value) {
        this.preferredRunTimeFactor = value;
    }

    /**
     * Obtém o valor da propriedade routeClusteringFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRouteClusteringFactor() {
        return routeClusteringFactor;
    }

    /**
     * Define o valor da propriedade routeClusteringFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRouteClusteringFactor(Double value) {
        this.routeClusteringFactor = value;
    }

}
