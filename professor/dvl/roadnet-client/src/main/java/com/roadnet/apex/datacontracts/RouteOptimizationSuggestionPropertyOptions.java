
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de RouteOptimizationSuggestionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteOptimizationSuggestionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeneratedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NewMissedTimeWindowCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NewMissedTimeWindowDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NewTotalCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NewTotalDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NewTotalTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousMissedTimeWindowCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousMissedTimeWindowDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTotalCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTotalDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTotalTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RejectionReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RejectionReasonCodeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteSuggestionStatus_Status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteOptimizationSuggestionPropertyOptions", propOrder = {
    "generatedTime",
    "newMissedTimeWindowCount",
    "newMissedTimeWindowDuration",
    "newTotalCost",
    "newTotalDistance",
    "newTotalTime",
    "previousMissedTimeWindowCount",
    "previousMissedTimeWindowDuration",
    "previousTotalCost",
    "previousTotalDistance",
    "previousTotalTime",
    "rejectionReasonCodeEntityKey",
    "rejectionReasonCodeIdentifier",
    "responseTime",
    "routeSuggestionStatusStatus",
    "stopSequence"
})
public class RouteOptimizationSuggestionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "GeneratedTime")
    protected Boolean generatedTime;
    @XmlElement(name = "NewMissedTimeWindowCount")
    protected Boolean newMissedTimeWindowCount;
    @XmlElement(name = "NewMissedTimeWindowDuration")
    protected Boolean newMissedTimeWindowDuration;
    @XmlElement(name = "NewTotalCost")
    protected Boolean newTotalCost;
    @XmlElement(name = "NewTotalDistance")
    protected Boolean newTotalDistance;
    @XmlElement(name = "NewTotalTime")
    protected Boolean newTotalTime;
    @XmlElement(name = "PreviousMissedTimeWindowCount")
    protected Boolean previousMissedTimeWindowCount;
    @XmlElement(name = "PreviousMissedTimeWindowDuration")
    protected Boolean previousMissedTimeWindowDuration;
    @XmlElement(name = "PreviousTotalCost")
    protected Boolean previousTotalCost;
    @XmlElement(name = "PreviousTotalDistance")
    protected Boolean previousTotalDistance;
    @XmlElement(name = "PreviousTotalTime")
    protected Boolean previousTotalTime;
    @XmlElement(name = "RejectionReasonCodeEntityKey")
    protected Boolean rejectionReasonCodeEntityKey;
    @XmlElement(name = "RejectionReasonCodeIdentifier")
    protected Boolean rejectionReasonCodeIdentifier;
    @XmlElement(name = "ResponseTime")
    protected Boolean responseTime;
    @XmlElement(name = "RouteSuggestionStatus_Status")
    protected Boolean routeSuggestionStatusStatus;
    @XmlElement(name = "StopSequence")
    protected Boolean stopSequence;

    /**
     * Obtém o valor da propriedade generatedTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeneratedTime() {
        return generatedTime;
    }

    /**
     * Define o valor da propriedade generatedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeneratedTime(Boolean value) {
        this.generatedTime = value;
    }

    /**
     * Obtém o valor da propriedade newMissedTimeWindowCount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewMissedTimeWindowCount() {
        return newMissedTimeWindowCount;
    }

    /**
     * Define o valor da propriedade newMissedTimeWindowCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewMissedTimeWindowCount(Boolean value) {
        this.newMissedTimeWindowCount = value;
    }

    /**
     * Obtém o valor da propriedade newMissedTimeWindowDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewMissedTimeWindowDuration() {
        return newMissedTimeWindowDuration;
    }

    /**
     * Define o valor da propriedade newMissedTimeWindowDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewMissedTimeWindowDuration(Boolean value) {
        this.newMissedTimeWindowDuration = value;
    }

    /**
     * Obtém o valor da propriedade newTotalCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewTotalCost() {
        return newTotalCost;
    }

    /**
     * Define o valor da propriedade newTotalCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewTotalCost(Boolean value) {
        this.newTotalCost = value;
    }

    /**
     * Obtém o valor da propriedade newTotalDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewTotalDistance() {
        return newTotalDistance;
    }

    /**
     * Define o valor da propriedade newTotalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewTotalDistance(Boolean value) {
        this.newTotalDistance = value;
    }

    /**
     * Obtém o valor da propriedade newTotalTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewTotalTime() {
        return newTotalTime;
    }

    /**
     * Define o valor da propriedade newTotalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewTotalTime(Boolean value) {
        this.newTotalTime = value;
    }

    /**
     * Obtém o valor da propriedade previousMissedTimeWindowCount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousMissedTimeWindowCount() {
        return previousMissedTimeWindowCount;
    }

    /**
     * Define o valor da propriedade previousMissedTimeWindowCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousMissedTimeWindowCount(Boolean value) {
        this.previousMissedTimeWindowCount = value;
    }

    /**
     * Obtém o valor da propriedade previousMissedTimeWindowDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousMissedTimeWindowDuration() {
        return previousMissedTimeWindowDuration;
    }

    /**
     * Define o valor da propriedade previousMissedTimeWindowDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousMissedTimeWindowDuration(Boolean value) {
        this.previousMissedTimeWindowDuration = value;
    }

    /**
     * Obtém o valor da propriedade previousTotalCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousTotalCost() {
        return previousTotalCost;
    }

    /**
     * Define o valor da propriedade previousTotalCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousTotalCost(Boolean value) {
        this.previousTotalCost = value;
    }

    /**
     * Obtém o valor da propriedade previousTotalDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousTotalDistance() {
        return previousTotalDistance;
    }

    /**
     * Define o valor da propriedade previousTotalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousTotalDistance(Boolean value) {
        this.previousTotalDistance = value;
    }

    /**
     * Obtém o valor da propriedade previousTotalTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviousTotalTime() {
        return previousTotalTime;
    }

    /**
     * Define o valor da propriedade previousTotalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviousTotalTime(Boolean value) {
        this.previousTotalTime = value;
    }

    /**
     * Obtém o valor da propriedade rejectionReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRejectionReasonCodeEntityKey() {
        return rejectionReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade rejectionReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRejectionReasonCodeEntityKey(Boolean value) {
        this.rejectionReasonCodeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade rejectionReasonCodeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRejectionReasonCodeIdentifier() {
        return rejectionReasonCodeIdentifier;
    }

    /**
     * Define o valor da propriedade rejectionReasonCodeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRejectionReasonCodeIdentifier(Boolean value) {
        this.rejectionReasonCodeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade responseTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResponseTime() {
        return responseTime;
    }

    /**
     * Define o valor da propriedade responseTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResponseTime(Boolean value) {
        this.responseTime = value;
    }

    /**
     * Obtém o valor da propriedade routeSuggestionStatusStatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteSuggestionStatusStatus() {
        return routeSuggestionStatusStatus;
    }

    /**
     * Define o valor da propriedade routeSuggestionStatusStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteSuggestionStatusStatus(Boolean value) {
        this.routeSuggestionStatusStatus = value;
    }

    /**
     * Obtém o valor da propriedade stopSequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopSequence() {
        return stopSequence;
    }

    /**
     * Define o valor da propriedade stopSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopSequence(Boolean value) {
        this.stopSequence = value;
    }

}
