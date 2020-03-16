
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de EntityTransferTemplate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EntityTransferTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Delimiter" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Preprocessor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Properties" type="{http://roadnet.com/apex/DataContracts/}ArrayOfPropertyTransferTemplate" minOccurs="0"/&gt;
 *         &lt;element name="TransferFileType_FileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityTransferTemplate", propOrder = {
    "defaultFileName",
    "defaultFilePath",
    "delimiter",
    "name",
    "preprocessor",
    "properties",
    "transferFileTypeFileType"
})
@XmlSeeAlso({
    EntityExportTemplate.class,
    EntitySendOrderTemplate.class,
    EntityImportTemplate.class
})
public class EntityTransferTemplate
    extends DomainEntity
{

    @XmlElementRef(name = "DefaultFileName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultFileName;
    @XmlElementRef(name = "DefaultFilePath", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultFilePath;
    @XmlElement(name = "Delimiter")
    protected Integer delimiter;
    @XmlElementRef(name = "Name", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Preprocessor", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preprocessor;
    @XmlElementRef(name = "Properties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPropertyTransferTemplate> properties;
    @XmlElementRef(name = "TransferFileType_FileType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferFileTypeFileType;

    /**
     * Obtém o valor da propriedade defaultFileName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultFileName() {
        return defaultFileName;
    }

    /**
     * Define o valor da propriedade defaultFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultFileName(JAXBElement<String> value) {
        this.defaultFileName = value;
    }

    /**
     * Obtém o valor da propriedade defaultFilePath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultFilePath() {
        return defaultFilePath;
    }

    /**
     * Define o valor da propriedade defaultFilePath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultFilePath(JAXBElement<String> value) {
        this.defaultFilePath = value;
    }

    /**
     * Obtém o valor da propriedade delimiter.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelimiter() {
        return delimiter;
    }

    /**
     * Define o valor da propriedade delimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelimiter(Integer value) {
        this.delimiter = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade preprocessor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreprocessor() {
        return preprocessor;
    }

    /**
     * Define o valor da propriedade preprocessor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreprocessor(JAXBElement<String> value) {
        this.preprocessor = value;
    }

    /**
     * Obtém o valor da propriedade properties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPropertyTransferTemplate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPropertyTransferTemplate> getProperties() {
        return properties;
    }

    /**
     * Define o valor da propriedade properties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPropertyTransferTemplate }{@code >}
     *     
     */
    public void setProperties(JAXBElement<ArrayOfPropertyTransferTemplate> value) {
        this.properties = value;
    }

    /**
     * Obtém o valor da propriedade transferFileTypeFileType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferFileTypeFileType() {
        return transferFileTypeFileType;
    }

    /**
     * Define o valor da propriedade transferFileTypeFileType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferFileTypeFileType(JAXBElement<String> value) {
        this.transferFileTypeFileType = value;
    }

}
