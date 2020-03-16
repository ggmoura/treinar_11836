
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ImportEntityResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportEntityResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalResultMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportActionType_ActionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportLogMessage_Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportLogType_LogType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportPropertyResults" type="{http://roadnet.com/apex/DataContracts/}ArrayOfImportPropertyResult" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportEntityResult", propOrder = {
    "additionalResultMessage",
    "identifier",
    "importActionTypeActionType",
    "importLogMessageMessage",
    "importLogTypeLogType",
    "importPropertyResults",
    "lineNumber"
})
public class ImportEntityResult
    extends DataTransferObject
{

    @XmlElementRef(name = "AdditionalResultMessage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalResultMessage;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "ImportActionType_ActionType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importActionTypeActionType;
    @XmlElementRef(name = "ImportLogMessage_Message", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importLogMessageMessage;
    @XmlElementRef(name = "ImportLogType_LogType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importLogTypeLogType;
    @XmlElementRef(name = "ImportPropertyResults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfImportPropertyResult> importPropertyResults;
    @XmlElement(name = "LineNumber")
    protected Long lineNumber;

    /**
     * Obtém o valor da propriedade additionalResultMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalResultMessage() {
        return additionalResultMessage;
    }

    /**
     * Define o valor da propriedade additionalResultMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalResultMessage(JAXBElement<String> value) {
        this.additionalResultMessage = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade importActionTypeActionType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportActionTypeActionType() {
        return importActionTypeActionType;
    }

    /**
     * Define o valor da propriedade importActionTypeActionType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportActionTypeActionType(JAXBElement<String> value) {
        this.importActionTypeActionType = value;
    }

    /**
     * Obtém o valor da propriedade importLogMessageMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportLogMessageMessage() {
        return importLogMessageMessage;
    }

    /**
     * Define o valor da propriedade importLogMessageMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportLogMessageMessage(JAXBElement<String> value) {
        this.importLogMessageMessage = value;
    }

    /**
     * Obtém o valor da propriedade importLogTypeLogType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportLogTypeLogType() {
        return importLogTypeLogType;
    }

    /**
     * Define o valor da propriedade importLogTypeLogType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportLogTypeLogType(JAXBElement<String> value) {
        this.importLogTypeLogType = value;
    }

    /**
     * Obtém o valor da propriedade importPropertyResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImportPropertyResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfImportPropertyResult> getImportPropertyResults() {
        return importPropertyResults;
    }

    /**
     * Define o valor da propriedade importPropertyResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImportPropertyResult }{@code >}
     *     
     */
    public void setImportPropertyResults(JAXBElement<ArrayOfImportPropertyResult> value) {
        this.importPropertyResults = value;
    }

    /**
     * Obtém o valor da propriedade lineNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineNumber() {
        return lineNumber;
    }

    /**
     * Define o valor da propriedade lineNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineNumber(Long value) {
        this.lineNumber = value;
    }

}
