
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CompartmentTypePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompartmentTypePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMixable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProductTypeRestriction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProductTypeRestrictionOptions" type="{http://roadnet.com/apex/DataContracts/}ProductTypeRestrictionPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentTypePropertyOptions", propOrder = {
    "description",
    "identifier",
    "isDeleted",
    "isMixable",
    "productTypeRestriction",
    "productTypeRestrictionOptions"
})
public class CompartmentTypePropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "IsMixable")
    protected Boolean isMixable;
    @XmlElement(name = "ProductTypeRestriction")
    protected Boolean productTypeRestriction;
    @XmlElementRef(name = "ProductTypeRestrictionOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductTypeRestrictionPropertyOptions> productTypeRestrictionOptions;

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
     * Obtém o valor da propriedade isMixable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMixable() {
        return isMixable;
    }

    /**
     * Define o valor da propriedade isMixable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMixable(Boolean value) {
        this.isMixable = value;
    }

    /**
     * Obtém o valor da propriedade productTypeRestriction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductTypeRestriction() {
        return productTypeRestriction;
    }

    /**
     * Define o valor da propriedade productTypeRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductTypeRestriction(Boolean value) {
        this.productTypeRestriction = value;
    }

    /**
     * Obtém o valor da propriedade productTypeRestrictionOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductTypeRestrictionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ProductTypeRestrictionPropertyOptions> getProductTypeRestrictionOptions() {
        return productTypeRestrictionOptions;
    }

    /**
     * Define o valor da propriedade productTypeRestrictionOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductTypeRestrictionPropertyOptions }{@code >}
     *     
     */
    public void setProductTypeRestrictionOptions(JAXBElement<ProductTypeRestrictionPropertyOptions> value) {
        this.productTypeRestrictionOptions = value;
    }

}
