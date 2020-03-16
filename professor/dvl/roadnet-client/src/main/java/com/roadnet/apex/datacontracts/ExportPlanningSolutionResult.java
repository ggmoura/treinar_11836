
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ExportPlanningSolutionResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ExportPlanningSolutionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Errors" type="{http://roadnet.com/apex/DataContracts/}ArrayOfExportPlanningSolutionPropertyResult" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedTimeRemaining" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ExportItemsWritten" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryProcessingCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnassignedProcessingCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportPlanningSolutionResult", propOrder = {
    "errors",
    "estimatedTimeRemaining",
    "exportItemsWritten",
    "file",
    "percentComplete",
    "territoryProcessingCompleted",
    "unassignedProcessingCompleted"
})
public class ExportPlanningSolutionResult
    extends DataTransferObject
{

    @XmlElementRef(name = "Errors", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExportPlanningSolutionPropertyResult> errors;
    @XmlElementRef(name = "EstimatedTimeRemaining", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> estimatedTimeRemaining;
    @XmlElement(name = "ExportItemsWritten")
    protected Boolean exportItemsWritten;
    @XmlElementRef(name = "File", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> file;
    @XmlElement(name = "PercentComplete")
    protected Double percentComplete;
    @XmlElement(name = "TerritoryProcessingCompleted")
    protected Boolean territoryProcessingCompleted;
    @XmlElement(name = "UnassignedProcessingCompleted")
    protected Boolean unassignedProcessingCompleted;

    /**
     * Obtém o valor da propriedade errors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExportPlanningSolutionPropertyResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfExportPlanningSolutionPropertyResult> getErrors() {
        return errors;
    }

    /**
     * Define o valor da propriedade errors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExportPlanningSolutionPropertyResult }{@code >}
     *     
     */
    public void setErrors(JAXBElement<ArrayOfExportPlanningSolutionPropertyResult> value) {
        this.errors = value;
    }

    /**
     * Obtém o valor da propriedade estimatedTimeRemaining.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getEstimatedTimeRemaining() {
        return estimatedTimeRemaining;
    }

    /**
     * Define o valor da propriedade estimatedTimeRemaining.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setEstimatedTimeRemaining(JAXBElement<Duration> value) {
        this.estimatedTimeRemaining = value;
    }

    /**
     * Obtém o valor da propriedade exportItemsWritten.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExportItemsWritten() {
        return exportItemsWritten;
    }

    /**
     * Define o valor da propriedade exportItemsWritten.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExportItemsWritten(Boolean value) {
        this.exportItemsWritten = value;
    }

    /**
     * Obtém o valor da propriedade file.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFile() {
        return file;
    }

    /**
     * Define o valor da propriedade file.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFile(JAXBElement<byte[]> value) {
        this.file = value;
    }

    /**
     * Obtém o valor da propriedade percentComplete.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentComplete() {
        return percentComplete;
    }

    /**
     * Define o valor da propriedade percentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentComplete(Double value) {
        this.percentComplete = value;
    }

    /**
     * Obtém o valor da propriedade territoryProcessingCompleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerritoryProcessingCompleted() {
        return territoryProcessingCompleted;
    }

    /**
     * Define o valor da propriedade territoryProcessingCompleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerritoryProcessingCompleted(Boolean value) {
        this.territoryProcessingCompleted = value;
    }

    /**
     * Obtém o valor da propriedade unassignedProcessingCompleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnassignedProcessingCompleted() {
        return unassignedProcessingCompleted;
    }

    /**
     * Define o valor da propriedade unassignedProcessingCompleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnassignedProcessingCompleted(Boolean value) {
        this.unassignedProcessingCompleted = value;
    }

}
