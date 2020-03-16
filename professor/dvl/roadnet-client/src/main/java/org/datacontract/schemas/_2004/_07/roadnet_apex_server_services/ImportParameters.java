
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ImportTemplateEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ImportTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransferTemplateSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportParameters", propOrder = {
    "file",
    "importTemplateEntityKey",
    "importTypeName",
    "transferTemplateSetEntityKey"
})
@XmlSeeAlso({
    LocationImportParameters.class,
    OrderBaseImportParameters.class,
    OnboardImportParameters.class,
    RoutedSolutionImportParameters.class,
    TravelPairImportParameters.class,
    MobileDeviceImportParameters.class,
    CustomFormImportParameters.class
})
public class ImportParameters {

    @XmlElementRef(name = "File", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> file;
    @XmlElementRef(name = "ImportTemplateEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> importTemplateEntityKey;
    @XmlElementRef(name = "ImportTypeName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importTypeName;
    @XmlElementRef(name = "TransferTemplateSetEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> transferTemplateSetEntityKey;

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
     * Obtém o valor da propriedade importTemplateEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getImportTemplateEntityKey() {
        return importTemplateEntityKey;
    }

    /**
     * Define o valor da propriedade importTemplateEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setImportTemplateEntityKey(JAXBElement<Long> value) {
        this.importTemplateEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade importTypeName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportTypeName() {
        return importTypeName;
    }

    /**
     * Define o valor da propriedade importTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportTypeName(JAXBElement<String> value) {
        this.importTypeName = value;
    }

    /**
     * Obtém o valor da propriedade transferTemplateSetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTransferTemplateSetEntityKey() {
        return transferTemplateSetEntityKey;
    }

    /**
     * Define o valor da propriedade transferTemplateSetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTransferTemplateSetEntityKey(JAXBElement<Long> value) {
        this.transferTemplateSetEntityKey = value;
    }

}
