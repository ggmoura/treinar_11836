
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de J1939TroubleCodeEvent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="J1939TroubleCodeEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}DiagnosticTroubleCodeEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailureModeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OccurrenceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SuspectParameterNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "J1939TroubleCodeEvent", propOrder = {
    "failureModeIdentifier",
    "occurrenceCount",
    "sourceAddress",
    "suspectParameterNumber"
})
public class J1939TroubleCodeEvent
    extends DiagnosticTroubleCodeEvent
{

    @XmlElement(name = "FailureModeIdentifier")
    protected Integer failureModeIdentifier;
    @XmlElement(name = "OccurrenceCount")
    protected Integer occurrenceCount;
    @XmlElement(name = "SourceAddress")
    protected Integer sourceAddress;
    @XmlElement(name = "SuspectParameterNumber")
    protected Integer suspectParameterNumber;

    /**
     * Obtém o valor da propriedade failureModeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailureModeIdentifier() {
        return failureModeIdentifier;
    }

    /**
     * Define o valor da propriedade failureModeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailureModeIdentifier(Integer value) {
        this.failureModeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade occurrenceCount.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOccurrenceCount() {
        return occurrenceCount;
    }

    /**
     * Define o valor da propriedade occurrenceCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOccurrenceCount(Integer value) {
        this.occurrenceCount = value;
    }

    /**
     * Obtém o valor da propriedade sourceAddress.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceAddress() {
        return sourceAddress;
    }

    /**
     * Define o valor da propriedade sourceAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceAddress(Integer value) {
        this.sourceAddress = value;
    }

    /**
     * Obtém o valor da propriedade suspectParameterNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuspectParameterNumber() {
        return suspectParameterNumber;
    }

    /**
     * Define o valor da propriedade suspectParameterNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuspectParameterNumber(Integer value) {
        this.suspectParameterNumber = value;
    }

}
