
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActiveTroubleCodesUpdateAction.J1939TroubleCode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ActiveTroubleCodesUpdateAction.J1939TroubleCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ActiveTroubleCodesUpdateAction.DiagnosticTroubleCode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailureModeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FlashStatus_AmberWarningFlashStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlashStatus_MalfunctionIndicatorFlashStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlashStatus_ProtectFlashStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlashStatus_RedStopFlashStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LampStatus_AmberWarningLampStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LampStatus_MalfunctionIndicatorLampStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LampStatus_ProtectLampStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LampStatus_RedStopLampStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ActiveTroubleCodesUpdateAction.J1939TroubleCode", propOrder = {
    "failureModeIdentifier",
    "flashStatusAmberWarningFlashStatus",
    "flashStatusMalfunctionIndicatorFlashStatus",
    "flashStatusProtectFlashStatus",
    "flashStatusRedStopFlashStatus",
    "lampStatusAmberWarningLampStatus",
    "lampStatusMalfunctionIndicatorLampStatus",
    "lampStatusProtectLampStatus",
    "lampStatusRedStopLampStatus",
    "occurrenceCount",
    "sourceAddress",
    "suspectParameterNumber"
})
public class ActiveTroubleCodesUpdateActionJ1939TroubleCode
    extends ActiveTroubleCodesUpdateActionDiagnosticTroubleCode
{

    @XmlElement(name = "FailureModeIdentifier")
    protected Integer failureModeIdentifier;
    @XmlElementRef(name = "FlashStatus_AmberWarningFlashStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flashStatusAmberWarningFlashStatus;
    @XmlElementRef(name = "FlashStatus_MalfunctionIndicatorFlashStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flashStatusMalfunctionIndicatorFlashStatus;
    @XmlElementRef(name = "FlashStatus_ProtectFlashStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flashStatusProtectFlashStatus;
    @XmlElementRef(name = "FlashStatus_RedStopFlashStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flashStatusRedStopFlashStatus;
    @XmlElementRef(name = "LampStatus_AmberWarningLampStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lampStatusAmberWarningLampStatus;
    @XmlElementRef(name = "LampStatus_MalfunctionIndicatorLampStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lampStatusMalfunctionIndicatorLampStatus;
    @XmlElementRef(name = "LampStatus_ProtectLampStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lampStatusProtectLampStatus;
    @XmlElementRef(name = "LampStatus_RedStopLampStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lampStatusRedStopLampStatus;
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
     * Obtém o valor da propriedade flashStatusAmberWarningFlashStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlashStatusAmberWarningFlashStatus() {
        return flashStatusAmberWarningFlashStatus;
    }

    /**
     * Define o valor da propriedade flashStatusAmberWarningFlashStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlashStatusAmberWarningFlashStatus(JAXBElement<String> value) {
        this.flashStatusAmberWarningFlashStatus = value;
    }

    /**
     * Obtém o valor da propriedade flashStatusMalfunctionIndicatorFlashStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlashStatusMalfunctionIndicatorFlashStatus() {
        return flashStatusMalfunctionIndicatorFlashStatus;
    }

    /**
     * Define o valor da propriedade flashStatusMalfunctionIndicatorFlashStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlashStatusMalfunctionIndicatorFlashStatus(JAXBElement<String> value) {
        this.flashStatusMalfunctionIndicatorFlashStatus = value;
    }

    /**
     * Obtém o valor da propriedade flashStatusProtectFlashStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlashStatusProtectFlashStatus() {
        return flashStatusProtectFlashStatus;
    }

    /**
     * Define o valor da propriedade flashStatusProtectFlashStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlashStatusProtectFlashStatus(JAXBElement<String> value) {
        this.flashStatusProtectFlashStatus = value;
    }

    /**
     * Obtém o valor da propriedade flashStatusRedStopFlashStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlashStatusRedStopFlashStatus() {
        return flashStatusRedStopFlashStatus;
    }

    /**
     * Define o valor da propriedade flashStatusRedStopFlashStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlashStatusRedStopFlashStatus(JAXBElement<String> value) {
        this.flashStatusRedStopFlashStatus = value;
    }

    /**
     * Obtém o valor da propriedade lampStatusAmberWarningLampStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLampStatusAmberWarningLampStatus() {
        return lampStatusAmberWarningLampStatus;
    }

    /**
     * Define o valor da propriedade lampStatusAmberWarningLampStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLampStatusAmberWarningLampStatus(JAXBElement<String> value) {
        this.lampStatusAmberWarningLampStatus = value;
    }

    /**
     * Obtém o valor da propriedade lampStatusMalfunctionIndicatorLampStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLampStatusMalfunctionIndicatorLampStatus() {
        return lampStatusMalfunctionIndicatorLampStatus;
    }

    /**
     * Define o valor da propriedade lampStatusMalfunctionIndicatorLampStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLampStatusMalfunctionIndicatorLampStatus(JAXBElement<String> value) {
        this.lampStatusMalfunctionIndicatorLampStatus = value;
    }

    /**
     * Obtém o valor da propriedade lampStatusProtectLampStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLampStatusProtectLampStatus() {
        return lampStatusProtectLampStatus;
    }

    /**
     * Define o valor da propriedade lampStatusProtectLampStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLampStatusProtectLampStatus(JAXBElement<String> value) {
        this.lampStatusProtectLampStatus = value;
    }

    /**
     * Obtém o valor da propriedade lampStatusRedStopLampStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLampStatusRedStopLampStatus() {
        return lampStatusRedStopLampStatus;
    }

    /**
     * Define o valor da propriedade lampStatusRedStopLampStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLampStatusRedStopLampStatus(JAXBElement<String> value) {
        this.lampStatusRedStopLampStatus = value;
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
