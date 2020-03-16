
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ImportPropertyResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportPropertyResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImportLogMessage_Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportLogType_LogType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportStage_Stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvalidValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidationFailurePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidationFailureRangeMaximum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidationFailureRangeMinimum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidationFailure_FailureType_ValidationFailureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportPropertyResult", propOrder = {
    "importLogMessageMessage",
    "importLogTypeLogType",
    "importStageStage",
    "invalidValue",
    "label",
    "propertyPath",
    "validationFailurePattern",
    "validationFailureRangeMaximum",
    "validationFailureRangeMinimum",
    "validationFailureFailureTypeValidationFailureType"
})
public class ImportPropertyResult
    extends DataTransferObject
{

    @XmlElementRef(name = "ImportLogMessage_Message", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importLogMessageMessage;
    @XmlElementRef(name = "ImportLogType_LogType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importLogTypeLogType;
    @XmlElementRef(name = "ImportStage_Stage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importStageStage;
    @XmlElementRef(name = "InvalidValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invalidValue;
    @XmlElementRef(name = "Label", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> label;
    @XmlElementRef(name = "PropertyPath", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> propertyPath;
    @XmlElementRef(name = "ValidationFailurePattern", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validationFailurePattern;
    @XmlElementRef(name = "ValidationFailureRangeMaximum", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validationFailureRangeMaximum;
    @XmlElementRef(name = "ValidationFailureRangeMinimum", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validationFailureRangeMinimum;
    @XmlElementRef(name = "ValidationFailure_FailureType_ValidationFailureType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validationFailureFailureTypeValidationFailureType;

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
     * Obtém o valor da propriedade importStageStage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportStageStage() {
        return importStageStage;
    }

    /**
     * Define o valor da propriedade importStageStage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportStageStage(JAXBElement<String> value) {
        this.importStageStage = value;
    }

    /**
     * Obtém o valor da propriedade invalidValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvalidValue() {
        return invalidValue;
    }

    /**
     * Define o valor da propriedade invalidValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvalidValue(JAXBElement<String> value) {
        this.invalidValue = value;
    }

    /**
     * Obtém o valor da propriedade label.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLabel() {
        return label;
    }

    /**
     * Define o valor da propriedade label.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLabel(JAXBElement<String> value) {
        this.label = value;
    }

    /**
     * Obtém o valor da propriedade propertyPath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPropertyPath() {
        return propertyPath;
    }

    /**
     * Define o valor da propriedade propertyPath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPropertyPath(JAXBElement<String> value) {
        this.propertyPath = value;
    }

    /**
     * Obtém o valor da propriedade validationFailurePattern.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidationFailurePattern() {
        return validationFailurePattern;
    }

    /**
     * Define o valor da propriedade validationFailurePattern.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidationFailurePattern(JAXBElement<String> value) {
        this.validationFailurePattern = value;
    }

    /**
     * Obtém o valor da propriedade validationFailureRangeMaximum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidationFailureRangeMaximum() {
        return validationFailureRangeMaximum;
    }

    /**
     * Define o valor da propriedade validationFailureRangeMaximum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidationFailureRangeMaximum(JAXBElement<String> value) {
        this.validationFailureRangeMaximum = value;
    }

    /**
     * Obtém o valor da propriedade validationFailureRangeMinimum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidationFailureRangeMinimum() {
        return validationFailureRangeMinimum;
    }

    /**
     * Define o valor da propriedade validationFailureRangeMinimum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidationFailureRangeMinimum(JAXBElement<String> value) {
        this.validationFailureRangeMinimum = value;
    }

    /**
     * Obtém o valor da propriedade validationFailureFailureTypeValidationFailureType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidationFailureFailureTypeValidationFailureType() {
        return validationFailureFailureTypeValidationFailureType;
    }

    /**
     * Define o valor da propriedade validationFailureFailureTypeValidationFailureType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidationFailureFailureTypeValidationFailureType(JAXBElement<String> value) {
        this.validationFailureFailureTypeValidationFailureType = value;
    }

}
