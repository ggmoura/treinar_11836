
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de J1939DiagnosticTroubleCodeCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="J1939DiagnosticTroubleCodeCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}DiagnosticTroubleCodeCriteria"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailureModeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "J1939DiagnosticTroubleCodeCriteria", propOrder = {
    "failureModeIdentifier",
    "sourceAddress",
    "suspectParameterNumber"
})
public class J1939DiagnosticTroubleCodeCriteria
    extends DiagnosticTroubleCodeCriteria
{

    @XmlElementRef(name = "FailureModeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failureModeIdentifier;
    @XmlElement(name = "SourceAddress")
    protected Integer sourceAddress;
    @XmlElementRef(name = "SuspectParameterNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> suspectParameterNumber;

    /**
     * Obtém o valor da propriedade failureModeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailureModeIdentifier() {
        return failureModeIdentifier;
    }

    /**
     * Define o valor da propriedade failureModeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailureModeIdentifier(JAXBElement<Integer> value) {
        this.failureModeIdentifier = value;
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
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSuspectParameterNumber() {
        return suspectParameterNumber;
    }

    /**
     * Define o valor da propriedade suspectParameterNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSuspectParameterNumber(JAXBElement<Integer> value) {
        this.suspectParameterNumber = value;
    }

}
