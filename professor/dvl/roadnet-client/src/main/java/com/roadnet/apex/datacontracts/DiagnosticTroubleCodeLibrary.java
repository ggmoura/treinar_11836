
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DiagnosticTroubleCodeLibrary complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticTroubleCodeLibrary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="J1587FailureModeIndicators" type="{http://roadnet.com/apex/DataContracts/}ArrayOfJ1587FailureModeIndicator" minOccurs="0"/&gt;
 *         &lt;element name="J1587MessageIdentifiers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfJ1587MessageIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="J1587ParameterIdentifiers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfJ1587ParameterIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="J1587SubsystemIdentifiers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfJ1587SubsystemIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="J1939FailureModeIndicators" type="{http://roadnet.com/apex/DataContracts/}ArrayOfJ1939FailureModeIndicator" minOccurs="0"/&gt;
 *         &lt;element name="J1939SourceAddresses" type="{http://roadnet.com/apex/DataContracts/}ArrayOfJ1939SourceAddress" minOccurs="0"/&gt;
 *         &lt;element name="J1939SuspectParameterNumbers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfJ1939SuspectParameterNumber" minOccurs="0"/&gt;
 *         &lt;element name="OBD2DiagnosticTroubleCodes" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOBD2DiagnosticTroubleCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticTroubleCodeLibrary", propOrder = {
    "j1587FailureModeIndicators",
    "j1587MessageIdentifiers",
    "j1587ParameterIdentifiers",
    "j1587SubsystemIdentifiers",
    "j1939FailureModeIndicators",
    "j1939SourceAddresses",
    "j1939SuspectParameterNumbers",
    "obd2DiagnosticTroubleCodes"
})
public class DiagnosticTroubleCodeLibrary
    extends DataTransferObject
{

    @XmlElementRef(name = "J1587FailureModeIndicators", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfJ1587FailureModeIndicator> j1587FailureModeIndicators;
    @XmlElementRef(name = "J1587MessageIdentifiers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfJ1587MessageIdentifier> j1587MessageIdentifiers;
    @XmlElementRef(name = "J1587ParameterIdentifiers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfJ1587ParameterIdentifier> j1587ParameterIdentifiers;
    @XmlElementRef(name = "J1587SubsystemIdentifiers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfJ1587SubsystemIdentifier> j1587SubsystemIdentifiers;
    @XmlElementRef(name = "J1939FailureModeIndicators", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfJ1939FailureModeIndicator> j1939FailureModeIndicators;
    @XmlElementRef(name = "J1939SourceAddresses", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfJ1939SourceAddress> j1939SourceAddresses;
    @XmlElementRef(name = "J1939SuspectParameterNumbers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfJ1939SuspectParameterNumber> j1939SuspectParameterNumbers;
    @XmlElementRef(name = "OBD2DiagnosticTroubleCodes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOBD2DiagnosticTroubleCode> obd2DiagnosticTroubleCodes;

    /**
     * Obtém o valor da propriedade j1587FailureModeIndicators.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1587FailureModeIndicator }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ1587FailureModeIndicator> getJ1587FailureModeIndicators() {
        return j1587FailureModeIndicators;
    }

    /**
     * Define o valor da propriedade j1587FailureModeIndicators.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1587FailureModeIndicator }{@code >}
     *     
     */
    public void setJ1587FailureModeIndicators(JAXBElement<ArrayOfJ1587FailureModeIndicator> value) {
        this.j1587FailureModeIndicators = value;
    }

    /**
     * Obtém o valor da propriedade j1587MessageIdentifiers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1587MessageIdentifier }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ1587MessageIdentifier> getJ1587MessageIdentifiers() {
        return j1587MessageIdentifiers;
    }

    /**
     * Define o valor da propriedade j1587MessageIdentifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1587MessageIdentifier }{@code >}
     *     
     */
    public void setJ1587MessageIdentifiers(JAXBElement<ArrayOfJ1587MessageIdentifier> value) {
        this.j1587MessageIdentifiers = value;
    }

    /**
     * Obtém o valor da propriedade j1587ParameterIdentifiers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1587ParameterIdentifier }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ1587ParameterIdentifier> getJ1587ParameterIdentifiers() {
        return j1587ParameterIdentifiers;
    }

    /**
     * Define o valor da propriedade j1587ParameterIdentifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1587ParameterIdentifier }{@code >}
     *     
     */
    public void setJ1587ParameterIdentifiers(JAXBElement<ArrayOfJ1587ParameterIdentifier> value) {
        this.j1587ParameterIdentifiers = value;
    }

    /**
     * Obtém o valor da propriedade j1587SubsystemIdentifiers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1587SubsystemIdentifier }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ1587SubsystemIdentifier> getJ1587SubsystemIdentifiers() {
        return j1587SubsystemIdentifiers;
    }

    /**
     * Define o valor da propriedade j1587SubsystemIdentifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1587SubsystemIdentifier }{@code >}
     *     
     */
    public void setJ1587SubsystemIdentifiers(JAXBElement<ArrayOfJ1587SubsystemIdentifier> value) {
        this.j1587SubsystemIdentifiers = value;
    }

    /**
     * Obtém o valor da propriedade j1939FailureModeIndicators.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1939FailureModeIndicator }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ1939FailureModeIndicator> getJ1939FailureModeIndicators() {
        return j1939FailureModeIndicators;
    }

    /**
     * Define o valor da propriedade j1939FailureModeIndicators.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1939FailureModeIndicator }{@code >}
     *     
     */
    public void setJ1939FailureModeIndicators(JAXBElement<ArrayOfJ1939FailureModeIndicator> value) {
        this.j1939FailureModeIndicators = value;
    }

    /**
     * Obtém o valor da propriedade j1939SourceAddresses.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1939SourceAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ1939SourceAddress> getJ1939SourceAddresses() {
        return j1939SourceAddresses;
    }

    /**
     * Define o valor da propriedade j1939SourceAddresses.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1939SourceAddress }{@code >}
     *     
     */
    public void setJ1939SourceAddresses(JAXBElement<ArrayOfJ1939SourceAddress> value) {
        this.j1939SourceAddresses = value;
    }

    /**
     * Obtém o valor da propriedade j1939SuspectParameterNumbers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1939SuspectParameterNumber }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ1939SuspectParameterNumber> getJ1939SuspectParameterNumbers() {
        return j1939SuspectParameterNumbers;
    }

    /**
     * Define o valor da propriedade j1939SuspectParameterNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ1939SuspectParameterNumber }{@code >}
     *     
     */
    public void setJ1939SuspectParameterNumbers(JAXBElement<ArrayOfJ1939SuspectParameterNumber> value) {
        this.j1939SuspectParameterNumbers = value;
    }

    /**
     * Obtém o valor da propriedade obd2DiagnosticTroubleCodes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOBD2DiagnosticTroubleCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOBD2DiagnosticTroubleCode> getOBD2DiagnosticTroubleCodes() {
        return obd2DiagnosticTroubleCodes;
    }

    /**
     * Define o valor da propriedade obd2DiagnosticTroubleCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOBD2DiagnosticTroubleCode }{@code >}
     *     
     */
    public void setOBD2DiagnosticTroubleCodes(JAXBElement<ArrayOfOBD2DiagnosticTroubleCode> value) {
        this.obd2DiagnosticTroubleCodes = value;
    }

}
