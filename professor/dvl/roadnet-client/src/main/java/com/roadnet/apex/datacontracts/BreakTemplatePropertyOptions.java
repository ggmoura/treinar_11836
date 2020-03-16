
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de BreakTemplatePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BreakTemplatePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BreakLength" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRecurring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Paid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlacementRule_Placement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpanStartType_SpanStart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TargetSpan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeType_ConsideredTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakTemplatePropertyOptions", propOrder = {
    "breakLength",
    "isRecurring",
    "paid",
    "placementRulePlacement",
    "spanStartTypeSpanStart",
    "targetSpan",
    "timeTypeConsideredTime"
})
public class BreakTemplatePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "BreakLength")
    protected Boolean breakLength;
    @XmlElement(name = "IsRecurring")
    protected Boolean isRecurring;
    @XmlElement(name = "Paid")
    protected Boolean paid;
    @XmlElement(name = "PlacementRule_Placement")
    protected Boolean placementRulePlacement;
    @XmlElement(name = "SpanStartType_SpanStart")
    protected Boolean spanStartTypeSpanStart;
    @XmlElement(name = "TargetSpan")
    protected Boolean targetSpan;
    @XmlElement(name = "TimeType_ConsideredTime")
    protected Boolean timeTypeConsideredTime;

    /**
     * Obtém o valor da propriedade breakLength.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBreakLength() {
        return breakLength;
    }

    /**
     * Define o valor da propriedade breakLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreakLength(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isPlacementRulePlacement() {
        return placementRulePlacement;
    }

    /**
     * Define o valor da propriedade placementRulePlacement.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlacementRulePlacement(Boolean value) {
        this.placementRulePlacement = value;
    }

    /**
     * Obtém o valor da propriedade spanStartTypeSpanStart.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpanStartTypeSpanStart() {
        return spanStartTypeSpanStart;
    }

    /**
     * Define o valor da propriedade spanStartTypeSpanStart.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpanStartTypeSpanStart(Boolean value) {
        this.spanStartTypeSpanStart = value;
    }

    /**
     * Obtém o valor da propriedade targetSpan.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetSpan() {
        return targetSpan;
    }

    /**
     * Define o valor da propriedade targetSpan.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetSpan(Boolean value) {
        this.targetSpan = value;
    }

    /**
     * Obtém o valor da propriedade timeTypeConsideredTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeTypeConsideredTime() {
        return timeTypeConsideredTime;
    }

    /**
     * Define o valor da propriedade timeTypeConsideredTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeTypeConsideredTime(Boolean value) {
        this.timeTypeConsideredTime = value;
    }

}
