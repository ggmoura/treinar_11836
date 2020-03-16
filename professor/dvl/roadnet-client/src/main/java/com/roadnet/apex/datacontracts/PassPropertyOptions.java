
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PassPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PassPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommonAttributes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CommonAttributesOptions" type="{http://roadnet.com/apex/DataContracts/}PassAttributesPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassTemplateEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassPropertyOptions", propOrder = {
    "commonAttributes",
    "commonAttributesOptions",
    "description",
    "identifier",
    "isDeleted",
    "passTemplateEntityKey",
    "sessionEntityKey"
})
@XmlSeeAlso({
    DailyPassPropertyOptions.class,
    StrategicPassPropertyOptions.class
})
public class PassPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "CommonAttributes")
    protected Boolean commonAttributes;
    @XmlElementRef(name = "CommonAttributesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PassAttributesPropertyOptions> commonAttributesOptions;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "PassTemplateEntityKey")
    protected Boolean passTemplateEntityKey;
    @XmlElement(name = "SessionEntityKey")
    protected Boolean sessionEntityKey;

    /**
     * Obtém o valor da propriedade commonAttributes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommonAttributes() {
        return commonAttributes;
    }

    /**
     * Define o valor da propriedade commonAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommonAttributes(Boolean value) {
        this.commonAttributes = value;
    }

    /**
     * Obtém o valor da propriedade commonAttributesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PassAttributesPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<PassAttributesPropertyOptions> getCommonAttributesOptions() {
        return commonAttributesOptions;
    }

    /**
     * Define o valor da propriedade commonAttributesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PassAttributesPropertyOptions }{@code >}
     *     
     */
    public void setCommonAttributesOptions(JAXBElement<PassAttributesPropertyOptions> value) {
        this.commonAttributesOptions = value;
    }

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
     * Obtém o valor da propriedade passTemplateEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassTemplateEntityKey() {
        return passTemplateEntityKey;
    }

    /**
     * Define o valor da propriedade passTemplateEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassTemplateEntityKey(Boolean value) {
        this.passTemplateEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionEntityKey(Boolean value) {
        this.sessionEntityKey = value;
    }

}
