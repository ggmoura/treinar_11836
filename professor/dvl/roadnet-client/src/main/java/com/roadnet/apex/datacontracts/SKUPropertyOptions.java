
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SKUPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SKUPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PackageTypeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PackageTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PackageTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProductTypeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProductTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProductTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimeDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimeDetailsOptions" type="{http://roadnet.com/apex/DataContracts/}OrderClassifiedServiceTimeDetailPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SKUPropertyOptions", propOrder = {
    "description",
    "identifier",
    "isDeleted",
    "packageTypeDescription",
    "packageTypeEntityKey",
    "packageTypeIdentifier",
    "productTypeDescription",
    "productTypeEntityKey",
    "productTypeIdentifier",
    "serviceTimeDetails",
    "serviceTimeDetailsOptions"
})
public class SKUPropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "PackageTypeDescription")
    protected Boolean packageTypeDescription;
    @XmlElement(name = "PackageTypeEntityKey")
    protected Boolean packageTypeEntityKey;
    @XmlElement(name = "PackageTypeIdentifier")
    protected Boolean packageTypeIdentifier;
    @XmlElement(name = "ProductTypeDescription")
    protected Boolean productTypeDescription;
    @XmlElement(name = "ProductTypeEntityKey")
    protected Boolean productTypeEntityKey;
    @XmlElement(name = "ProductTypeIdentifier")
    protected Boolean productTypeIdentifier;
    @XmlElement(name = "ServiceTimeDetails")
    protected Boolean serviceTimeDetails;
    @XmlElementRef(name = "ServiceTimeDetailsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderClassifiedServiceTimeDetailPropertyOptions> serviceTimeDetailsOptions;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade packageTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPackageTypeDescription() {
        return packageTypeDescription;
    }

    /**
     * Define o valor da propriedade packageTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPackageTypeDescription(Boolean value) {
        this.packageTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade packageTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPackageTypeEntityKey() {
        return packageTypeEntityKey;
    }

    /**
     * Define o valor da propriedade packageTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPackageTypeEntityKey(Boolean value) {
        this.packageTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade packageTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPackageTypeIdentifier() {
        return packageTypeIdentifier;
    }

    /**
     * Define o valor da propriedade packageTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPackageTypeIdentifier(Boolean value) {
        this.packageTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade productTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductTypeDescription() {
        return productTypeDescription;
    }

    /**
     * Define o valor da propriedade productTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductTypeDescription(Boolean value) {
        this.productTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade productTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductTypeEntityKey() {
        return productTypeEntityKey;
    }

    /**
     * Define o valor da propriedade productTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductTypeEntityKey(Boolean value) {
        this.productTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade productTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductTypeIdentifier() {
        return productTypeIdentifier;
    }

    /**
     * Define o valor da propriedade productTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductTypeIdentifier(Boolean value) {
        this.productTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimeDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceTimeDetails() {
        return serviceTimeDetails;
    }

    /**
     * Define o valor da propriedade serviceTimeDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceTimeDetails(Boolean value) {
        this.serviceTimeDetails = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimeDetailsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedServiceTimeDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OrderClassifiedServiceTimeDetailPropertyOptions> getServiceTimeDetailsOptions() {
        return serviceTimeDetailsOptions;
    }

    /**
     * Define o valor da propriedade serviceTimeDetailsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedServiceTimeDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceTimeDetailsOptions(JAXBElement<OrderClassifiedServiceTimeDetailPropertyOptions> value) {
        this.serviceTimeDetailsOptions = value;
    }

}
