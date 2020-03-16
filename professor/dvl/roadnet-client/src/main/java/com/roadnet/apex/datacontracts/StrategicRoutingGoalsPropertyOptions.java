
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de StrategicRoutingGoalsPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StrategicRoutingGoalsPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BalanceCapacityUtilizationBetweenTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BalanceCapacityUtilizationWithinTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BalanceLoadBetweenTerritoriesFactors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BalanceLoadWithinTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BalanceNumberOfOrderGroupsBetweenTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BalanceNumberOfStopBetweenTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BalanceNumberOfStopsWithinTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BalanceRunTimeBetweenTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BalanceRunTimeWithinTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BalanceServiceTimeBetweenTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BalanceServiceTimeWithinTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClusteredTerritoriesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EvenServiceGaps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowEarlyFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowLateFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRunTimeFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteClusteringFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategicRoutingGoalsPropertyOptions", propOrder = {
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
public class StrategicRoutingGoalsPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "BalanceCapacityUtilizationBetweenTerritoriesFactor")
    protected Boolean balanceCapacityUtilizationBetweenTerritoriesFactor;
    @XmlElement(name = "BalanceCapacityUtilizationWithinTerritoriesFactor")
    protected Boolean balanceCapacityUtilizationWithinTerritoriesFactor;
    @XmlElement(name = "BalanceLoadBetweenTerritoriesFactors")
    protected Boolean balanceLoadBetweenTerritoriesFactors;
    @XmlElement(name = "BalanceLoadWithinTerritoriesFactor")
    protected Boolean balanceLoadWithinTerritoriesFactor;
    @XmlElement(name = "BalanceNumberOfOrderGroupsBetweenTerritoriesFactor")
    protected Boolean balanceNumberOfOrderGroupsBetweenTerritoriesFactor;
    @XmlElement(name = "BalanceNumberOfStopBetweenTerritoriesFactor")
    protected Boolean balanceNumberOfStopBetweenTerritoriesFactor;
    @XmlElement(name = "BalanceNumberOfStopsWithinTerritoriesFactor")
    protected Boolean balanceNumberOfStopsWithinTerritoriesFactor;
    @XmlElement(name = "BalanceRunTimeBetweenTerritoriesFactor")
    protected Boolean balanceRunTimeBetweenTerritoriesFactor;
    @XmlElement(name = "BalanceRunTimeWithinTerritoriesFactor")
    protected Boolean balanceRunTimeWithinTerritoriesFactor;
    @XmlElement(name = "BalanceServiceTimeBetweenTerritoriesFactor")
    protected Boolean balanceServiceTimeBetweenTerritoriesFactor;
    @XmlElement(name = "BalanceServiceTimeWithinTerritoriesFactor")
    protected Boolean balanceServiceTimeWithinTerritoriesFactor;
    @XmlElement(name = "ClusteredTerritoriesFactor")
    protected Boolean clusteredTerritoriesFactor;
    @XmlElement(name = "EvenServiceGaps")
    protected Boolean evenServiceGaps;
    @XmlElement(name = "MissedTimeWindowEarlyFactor")
    protected Boolean missedTimeWindowEarlyFactor;
    @XmlElement(name = "MissedTimeWindowLateFactor")
    protected Boolean missedTimeWindowLateFactor;
    @XmlElement(name = "PreferredRunTimeFactor")
    protected Boolean preferredRunTimeFactor;
    @XmlElement(name = "RouteClusteringFactor")
    protected Boolean routeClusteringFactor;

    /**
     * Obtém o valor da propriedade balanceCapacityUtilizationBetweenTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceCapacityUtilizationBetweenTerritoriesFactor() {
        return balanceCapacityUtilizationBetweenTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceCapacityUtilizationBetweenTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceCapacityUtilizationBetweenTerritoriesFactor(Boolean value) {
        this.balanceCapacityUtilizationBetweenTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceCapacityUtilizationWithinTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceCapacityUtilizationWithinTerritoriesFactor() {
        return balanceCapacityUtilizationWithinTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceCapacityUtilizationWithinTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceCapacityUtilizationWithinTerritoriesFactor(Boolean value) {
        this.balanceCapacityUtilizationWithinTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceLoadBetweenTerritoriesFactors.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceLoadBetweenTerritoriesFactors() {
        return balanceLoadBetweenTerritoriesFactors;
    }

    /**
     * Define o valor da propriedade balanceLoadBetweenTerritoriesFactors.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceLoadBetweenTerritoriesFactors(Boolean value) {
        this.balanceLoadBetweenTerritoriesFactors = value;
    }

    /**
     * Obtém o valor da propriedade balanceLoadWithinTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceLoadWithinTerritoriesFactor() {
        return balanceLoadWithinTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceLoadWithinTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceLoadWithinTerritoriesFactor(Boolean value) {
        this.balanceLoadWithinTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceNumberOfOrderGroupsBetweenTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceNumberOfOrderGroupsBetweenTerritoriesFactor() {
        return balanceNumberOfOrderGroupsBetweenTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceNumberOfOrderGroupsBetweenTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceNumberOfOrderGroupsBetweenTerritoriesFactor(Boolean value) {
        this.balanceNumberOfOrderGroupsBetweenTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceNumberOfStopBetweenTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceNumberOfStopBetweenTerritoriesFactor() {
        return balanceNumberOfStopBetweenTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceNumberOfStopBetweenTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceNumberOfStopBetweenTerritoriesFactor(Boolean value) {
        this.balanceNumberOfStopBetweenTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceNumberOfStopsWithinTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceNumberOfStopsWithinTerritoriesFactor() {
        return balanceNumberOfStopsWithinTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceNumberOfStopsWithinTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceNumberOfStopsWithinTerritoriesFactor(Boolean value) {
        this.balanceNumberOfStopsWithinTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceRunTimeBetweenTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceRunTimeBetweenTerritoriesFactor() {
        return balanceRunTimeBetweenTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceRunTimeBetweenTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceRunTimeBetweenTerritoriesFactor(Boolean value) {
        this.balanceRunTimeBetweenTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceRunTimeWithinTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceRunTimeWithinTerritoriesFactor() {
        return balanceRunTimeWithinTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceRunTimeWithinTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceRunTimeWithinTerritoriesFactor(Boolean value) {
        this.balanceRunTimeWithinTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceServiceTimeBetweenTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceServiceTimeBetweenTerritoriesFactor() {
        return balanceServiceTimeBetweenTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceServiceTimeBetweenTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceServiceTimeBetweenTerritoriesFactor(Boolean value) {
        this.balanceServiceTimeBetweenTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade balanceServiceTimeWithinTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceServiceTimeWithinTerritoriesFactor() {
        return balanceServiceTimeWithinTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade balanceServiceTimeWithinTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceServiceTimeWithinTerritoriesFactor(Boolean value) {
        this.balanceServiceTimeWithinTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade clusteredTerritoriesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClusteredTerritoriesFactor() {
        return clusteredTerritoriesFactor;
    }

    /**
     * Define o valor da propriedade clusteredTerritoriesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClusteredTerritoriesFactor(Boolean value) {
        this.clusteredTerritoriesFactor = value;
    }

    /**
     * Obtém o valor da propriedade evenServiceGaps.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvenServiceGaps() {
        return evenServiceGaps;
    }

    /**
     * Define o valor da propriedade evenServiceGaps.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvenServiceGaps(Boolean value) {
        this.evenServiceGaps = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowEarlyFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedTimeWindowEarlyFactor() {
        return missedTimeWindowEarlyFactor;
    }

    /**
     * Define o valor da propriedade missedTimeWindowEarlyFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedTimeWindowEarlyFactor(Boolean value) {
        this.missedTimeWindowEarlyFactor = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowLateFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedTimeWindowLateFactor() {
        return missedTimeWindowLateFactor;
    }

    /**
     * Define o valor da propriedade missedTimeWindowLateFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedTimeWindowLateFactor(Boolean value) {
        this.missedTimeWindowLateFactor = value;
    }

    /**
     * Obtém o valor da propriedade preferredRunTimeFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredRunTimeFactor() {
        return preferredRunTimeFactor;
    }

    /**
     * Define o valor da propriedade preferredRunTimeFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredRunTimeFactor(Boolean value) {
        this.preferredRunTimeFactor = value;
    }

    /**
     * Obtém o valor da propriedade routeClusteringFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteClusteringFactor() {
        return routeClusteringFactor;
    }

    /**
     * Define o valor da propriedade routeClusteringFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteClusteringFactor(Boolean value) {
        this.routeClusteringFactor = value;
    }

}
