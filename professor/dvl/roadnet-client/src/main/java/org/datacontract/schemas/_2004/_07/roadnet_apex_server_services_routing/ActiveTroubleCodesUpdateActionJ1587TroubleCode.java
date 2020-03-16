
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActiveTroubleCodesUpdateAction.J1587TroubleCode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ActiveTroubleCodesUpdateAction.J1587TroubleCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ActiveTroubleCodesUpdateAction.DiagnosticTroubleCode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailureModeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsProprietaryCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MessageIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OccurrenceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParameterIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubsystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveTroubleCodesUpdateAction.J1587TroubleCode", propOrder = {
    "failureModeIdentifier",
    "isProprietaryCode",
    "messageIdentifier",
    "occurrenceCount",
    "parameterIdentifier",
    "subsystemIdentifier"
})
public class ActiveTroubleCodesUpdateActionJ1587TroubleCode
    extends ActiveTroubleCodesUpdateActionDiagnosticTroubleCode
{

    @XmlElement(name = "FailureModeIdentifier")
    protected Integer failureModeIdentifier;
    @XmlElement(name = "IsProprietaryCode")
    protected Boolean isProprietaryCode;
    @XmlElement(name = "MessageIdentifier")
    protected Integer messageIdentifier;
    @XmlElement(name = "OccurrenceCount")
    protected Integer occurrenceCount;
    @XmlElementRef(name = "ParameterIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> parameterIdentifier;
    @XmlElementRef(name = "SubsystemIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> subsystemIdentifier;

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
     * Obtém o valor da propriedade isProprietaryCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProprietaryCode() {
        return isProprietaryCode;
    }

    /**
     * Define o valor da propriedade isProprietaryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProprietaryCode(Boolean value) {
        this.isProprietaryCode = value;
    }

    /**
     * Obtém o valor da propriedade messageIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Define o valor da propriedade messageIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMessageIdentifier(Integer value) {
        this.messageIdentifier = value;
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
     * Obtém o valor da propriedade parameterIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getParameterIdentifier() {
        return parameterIdentifier;
    }

    /**
     * Define o valor da propriedade parameterIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setParameterIdentifier(JAXBElement<Integer> value) {
        this.parameterIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade subsystemIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSubsystemIdentifier() {
        return subsystemIdentifier;
    }

    /**
     * Define o valor da propriedade subsystemIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSubsystemIdentifier(JAXBElement<Integer> value) {
        this.subsystemIdentifier = value;
    }

}
