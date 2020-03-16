
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
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de RouteOptimizationSuggestion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteOptimizationSuggestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeneratedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NewMissedTimeWindowCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NewMissedTimeWindowDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="NewTotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NewTotalDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="NewTotalTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreviousMissedTimeWindowCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreviousMissedTimeWindowDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTotalDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTotalTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RejectionReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RejectionReasonCodeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteSuggestionStatus_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteOptimizationSuggestion", propOrder = {
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
public class RouteOptimizationSuggestion
    extends DomainEntity
{

    @XmlElement(name = "GeneratedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generatedTime;
    @XmlElementRef(name = "NewMissedTimeWindowCount", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> newMissedTimeWindowCount;
    @XmlElementRef(name = "NewMissedTimeWindowDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> newMissedTimeWindowDuration;
    @XmlElementRef(name = "NewTotalCost", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> newTotalCost;
    @XmlElementRef(name = "NewTotalDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> newTotalDistance;
    @XmlElementRef(name = "NewTotalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> newTotalTime;
    @XmlElementRef(name = "PreviousMissedTimeWindowCount", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> previousMissedTimeWindowCount;
    @XmlElementRef(name = "PreviousMissedTimeWindowDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> previousMissedTimeWindowDuration;
    @XmlElementRef(name = "PreviousTotalCost", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> previousTotalCost;
    @XmlElementRef(name = "PreviousTotalDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> previousTotalDistance;
    @XmlElementRef(name = "PreviousTotalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> previousTotalTime;
    @XmlElementRef(name = "RejectionReasonCodeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> rejectionReasonCodeEntityKey;
    @XmlElementRef(name = "RejectionReasonCodeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rejectionReasonCodeIdentifier;
    @XmlElementRef(name = "ResponseTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> responseTime;
    @XmlElementRef(name = "RouteSuggestionStatus_Status", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeSuggestionStatusStatus;
    @XmlElementRef(name = "StopSequence", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopSequence;

    /**
     * Obtém o valor da propriedade generatedTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeneratedTime() {
        return generatedTime;
    }

    /**
     * Define o valor da propriedade generatedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeneratedTime(XMLGregorianCalendar value) {
        this.generatedTime = value;
    }

    /**
     * Obtém o valor da propriedade newMissedTimeWindowCount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNewMissedTimeWindowCount() {
        return newMissedTimeWindowCount;
    }

    /**
     * Define o valor da propriedade newMissedTimeWindowCount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNewMissedTimeWindowCount(JAXBElement<Integer> value) {
        this.newMissedTimeWindowCount = value;
    }

    /**
     * Obtém o valor da propriedade newMissedTimeWindowDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getNewMissedTimeWindowDuration() {
        return newMissedTimeWindowDuration;
    }

    /**
     * Define o valor da propriedade newMissedTimeWindowDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setNewMissedTimeWindowDuration(JAXBElement<Duration> value) {
        this.newMissedTimeWindowDuration = value;
    }

    /**
     * Obtém o valor da propriedade newTotalCost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNewTotalCost() {
        return newTotalCost;
    }

    /**
     * Define o valor da propriedade newTotalCost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNewTotalCost(JAXBElement<Double> value) {
        this.newTotalCost = value;
    }

    /**
     * Obtém o valor da propriedade newTotalDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getNewTotalDistance() {
        return newTotalDistance;
    }

    /**
     * Define o valor da propriedade newTotalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setNewTotalDistance(JAXBElement<Distance> value) {
        this.newTotalDistance = value;
    }

    /**
     * Obtém o valor da propriedade newTotalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getNewTotalTime() {
        return newTotalTime;
    }

    /**
     * Define o valor da propriedade newTotalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setNewTotalTime(JAXBElement<Duration> value) {
        this.newTotalTime = value;
    }

    /**
     * Obtém o valor da propriedade previousMissedTimeWindowCount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPreviousMissedTimeWindowCount() {
        return previousMissedTimeWindowCount;
    }

    /**
     * Define o valor da propriedade previousMissedTimeWindowCount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPreviousMissedTimeWindowCount(JAXBElement<Integer> value) {
        this.previousMissedTimeWindowCount = value;
    }

    /**
     * Obtém o valor da propriedade previousMissedTimeWindowDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPreviousMissedTimeWindowDuration() {
        return previousMissedTimeWindowDuration;
    }

    /**
     * Define o valor da propriedade previousMissedTimeWindowDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPreviousMissedTimeWindowDuration(JAXBElement<Duration> value) {
        this.previousMissedTimeWindowDuration = value;
    }

    /**
     * Obtém o valor da propriedade previousTotalCost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPreviousTotalCost() {
        return previousTotalCost;
    }

    /**
     * Define o valor da propriedade previousTotalCost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPreviousTotalCost(JAXBElement<Double> value) {
        this.previousTotalCost = value;
    }

    /**
     * Obtém o valor da propriedade previousTotalDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getPreviousTotalDistance() {
        return previousTotalDistance;
    }

    /**
     * Define o valor da propriedade previousTotalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setPreviousTotalDistance(JAXBElement<Distance> value) {
        this.previousTotalDistance = value;
    }

    /**
     * Obtém o valor da propriedade previousTotalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPreviousTotalTime() {
        return previousTotalTime;
    }

    /**
     * Define o valor da propriedade previousTotalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPreviousTotalTime(JAXBElement<Duration> value) {
        this.previousTotalTime = value;
    }

    /**
     * Obtém o valor da propriedade rejectionReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRejectionReasonCodeEntityKey() {
        return rejectionReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade rejectionReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRejectionReasonCodeEntityKey(JAXBElement<Long> value) {
        this.rejectionReasonCodeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade rejectionReasonCodeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRejectionReasonCodeIdentifier() {
        return rejectionReasonCodeIdentifier;
    }

    /**
     * Define o valor da propriedade rejectionReasonCodeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRejectionReasonCodeIdentifier(JAXBElement<String> value) {
        this.rejectionReasonCodeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade responseTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getResponseTime() {
        return responseTime;
    }

    /**
     * Define o valor da propriedade responseTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setResponseTime(JAXBElement<XMLGregorianCalendar> value) {
        this.responseTime = value;
    }

    /**
     * Obtém o valor da propriedade routeSuggestionStatusStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteSuggestionStatusStatus() {
        return routeSuggestionStatusStatus;
    }

    /**
     * Define o valor da propriedade routeSuggestionStatusStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteSuggestionStatusStatus(JAXBElement<String> value) {
        this.routeSuggestionStatusStatus = value;
    }

    /**
     * Obtém o valor da propriedade stopSequence.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopSequence() {
        return stopSequence;
    }

    /**
     * Define o valor da propriedade stopSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopSequence(JAXBElement<String> value) {
        this.stopSequence = value;
    }

}
