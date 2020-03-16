
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransferablePropertyInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransferablePropertyInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataContractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataType" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Transferable}TransferablePropertyDataType" minOccurs="0"/&gt;
 *         &lt;element name="IsDomainSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsParentDomainSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentDataContractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferablePropertyInfo", propOrder = {
    "dataContractName",
    "dataType",
    "isDomainSignature",
    "isIdentifier",
    "isList",
    "isParentDomainSignature",
    "isRequired",
    "label",
    "name",
    "parentDataContractName"
})
public class TransferablePropertyInfo {

    @XmlElementRef(name = "DataContractName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Transferable", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataContractName;
    @XmlElement(name = "DataType")
    @XmlSchemaType(name = "string")
    protected TransferablePropertyDataType dataType;
    @XmlElement(name = "IsDomainSignature")
    protected Boolean isDomainSignature;
    @XmlElement(name = "IsIdentifier")
    protected Boolean isIdentifier;
    @XmlElement(name = "IsList")
    protected Boolean isList;
    @XmlElement(name = "IsParentDomainSignature")
    protected Boolean isParentDomainSignature;
    @XmlElement(name = "IsRequired")
    protected Boolean isRequired;
    @XmlElementRef(name = "Label", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Transferable", type = JAXBElement.class, required = false)
    protected JAXBElement<String> label;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Transferable", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "ParentDataContractName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Transferable", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentDataContractName;

    /**
     * Obtém o valor da propriedade dataContractName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataContractName() {
        return dataContractName;
    }

    /**
     * Define o valor da propriedade dataContractName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataContractName(JAXBElement<String> value) {
        this.dataContractName = value;
    }

    /**
     * Obtém o valor da propriedade dataType.
     * 
     * @return
     *     possible object is
     *     {@link TransferablePropertyDataType }
     *     
     */
    public TransferablePropertyDataType getDataType() {
        return dataType;
    }

    /**
     * Define o valor da propriedade dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferablePropertyDataType }
     *     
     */
    public void setDataType(TransferablePropertyDataType value) {
        this.dataType = value;
    }

    /**
     * Obtém o valor da propriedade isDomainSignature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDomainSignature() {
        return isDomainSignature;
    }

    /**
     * Define o valor da propriedade isDomainSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDomainSignature(Boolean value) {
        this.isDomainSignature = value;
    }

    /**
     * Obtém o valor da propriedade isIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIdentifier() {
        return isIdentifier;
    }

    /**
     * Define o valor da propriedade isIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIdentifier(Boolean value) {
        this.isIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade isList.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsList() {
        return isList;
    }

    /**
     * Define o valor da propriedade isList.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsList(Boolean value) {
        this.isList = value;
    }

    /**
     * Obtém o valor da propriedade isParentDomainSignature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsParentDomainSignature() {
        return isParentDomainSignature;
    }

    /**
     * Define o valor da propriedade isParentDomainSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsParentDomainSignature(Boolean value) {
        this.isParentDomainSignature = value;
    }

    /**
     * Obtém o valor da propriedade isRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Define o valor da propriedade isRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
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
     * Obtém o valor da propriedade parentDataContractName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentDataContractName() {
        return parentDataContractName;
    }

    /**
     * Define o valor da propriedade parentDataContractName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentDataContractName(JAXBElement<String> value) {
        this.parentDataContractName = value;
    }

}
