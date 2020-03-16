
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de EntityTransferTemplatePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EntityTransferTemplatePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultFileName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultFilePath" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Delimiter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Preprocessor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Properties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferFileType_FileType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityTransferTemplatePropertyOptions", propOrder = {
    "defaultFileName",
    "defaultFilePath",
    "delimiter",
    "name",
    "preprocessor",
    "properties",
    "transferFileTypeFileType"
})
@XmlSeeAlso({
    EntityImportTemplatePropertyOptions.class,
    EntityExportTemplatePropertyOptions.class,
    EntitySendOrderTemplatePropertyOptions.class
})
public class EntityTransferTemplatePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DefaultFileName")
    protected Boolean defaultFileName;
    @XmlElement(name = "DefaultFilePath")
    protected Boolean defaultFilePath;
    @XmlElement(name = "Delimiter")
    protected Boolean delimiter;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "Preprocessor")
    protected Boolean preprocessor;
    @XmlElement(name = "Properties")
    protected Boolean properties;
    @XmlElement(name = "TransferFileType_FileType")
    protected Boolean transferFileTypeFileType;

    /**
     * Obtém o valor da propriedade defaultFileName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultFileName() {
        return defaultFileName;
    }

    /**
     * Define o valor da propriedade defaultFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultFileName(Boolean value) {
        this.defaultFileName = value;
    }

    /**
     * Obtém o valor da propriedade defaultFilePath.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultFilePath() {
        return defaultFilePath;
    }

    /**
     * Define o valor da propriedade defaultFilePath.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultFilePath(Boolean value) {
        this.defaultFilePath = value;
    }

    /**
     * Obtém o valor da propriedade delimiter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelimiter() {
        return delimiter;
    }

    /**
     * Define o valor da propriedade delimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelimiter(Boolean value) {
        this.delimiter = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade preprocessor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreprocessor() {
        return preprocessor;
    }

    /**
     * Define o valor da propriedade preprocessor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreprocessor(Boolean value) {
        this.preprocessor = value;
    }

    /**
     * Obtém o valor da propriedade properties.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProperties() {
        return properties;
    }

    /**
     * Define o valor da propriedade properties.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProperties(Boolean value) {
        this.properties = value;
    }

    /**
     * Obtém o valor da propriedade transferFileTypeFileType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferFileTypeFileType() {
        return transferFileTypeFileType;
    }

    /**
     * Define o valor da propriedade transferFileTypeFileType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferFileTypeFileType(Boolean value) {
        this.transferFileTypeFileType = value;
    }

}
