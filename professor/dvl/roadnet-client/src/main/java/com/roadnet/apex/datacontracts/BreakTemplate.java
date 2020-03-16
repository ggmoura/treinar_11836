
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de BreakTemplate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BreakTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BreakLength" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="IsRecurring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Paid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlacementRule_Placement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpanStartType_SpanStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TargetSpan" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TimeType_ConsideredTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakTemplate", propOrder = {
    "breakLength",
    "isRecurring",
    "paid",
    "placementRulePlacement",
    "spanStartTypeSpanStart",
    "targetSpan",
    "timeTypeConsideredTime"
})
@XmlSeeAlso({
    PassBreakTemplate.class,
    PassTemplateBreakTemplate.class
})
public class BreakTemplate
    extends DomainEntity
{

    @XmlElement(name = "BreakLength")
    protected Duration breakLength;
    @XmlElement(name = "IsRecurring")
    protected Boolean isRecurring;
    @XmlElement(name = "Paid")
    protected Boolean paid;
    @XmlElementRef(name = "PlacementRule_Placement", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placementRulePlacement;
    @XmlElementRef(name = "SpanStartType_SpanStart", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spanStartTypeSpanStart;
    @XmlElement(name = "TargetSpan")
    protected Duration targetSpan;
    @XmlElementRef(name = "TimeType_ConsideredTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeTypeConsideredTime;

    /**
     * Obtém o valor da propriedade breakLength.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBreakLength() {
        return breakLength;
    }

    /**
     * Define o valor da propriedade breakLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBreakLength(Duration value) {
        this.breakLength = value;
    }

    /**
     * Obtém o valor da propriedade isRecurring.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRecurring() {
        return isRecurring;
    }

    /**
     * Define o valor da propriedade isRecurring.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRecurring(Boolean value) {
        this.isRecurring = value;
    }

    /**
     * Obtém o valor da propriedade paid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaid() {
        return paid;
    }

    /**
     * Define o valor da propriedade paid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaid(Boolean value) {
        this.paid = value;
    }

    /**
     * Obtém o valor da propriedade placementRulePlacement.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlacementRulePlacement() {
        return placementRulePlacement;
    }

    /**
     * Define o valor da propriedade placementRulePlacement.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlacementRulePlacement(JAXBElement<String> value) {
        this.placementRulePlacement = value;
    }

    /**
     * Obtém o valor da propriedade spanStartTypeSpanStart.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpanStartTypeSpanStart() {
        return spanStartTypeSpanStart;
    }

    /**
     * Define o valor da propriedade spanStartTypeSpanStart.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpanStartTypeSpanStart(JAXBElement<String> value) {
        this.spanStartTypeSpanStart = value;
    }

    /**
     * Obtém o valor da propriedade targetSpan.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTargetSpan() {
        return targetSpan;
    }

    /**
     * Define o valor da propriedade targetSpan.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTargetSpan(Duration value) {
        this.targetSpan = value;
    }

    /**
     * Obtém o valor da propriedade timeTypeConsideredTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeTypeConsideredTime() {
        return timeTypeConsideredTime;
    }

    /**
     * Define o valor da propriedade timeTypeConsideredTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeTypeConsideredTime(JAXBElement<String> value) {
        this.timeTypeConsideredTime = value;
    }

}
