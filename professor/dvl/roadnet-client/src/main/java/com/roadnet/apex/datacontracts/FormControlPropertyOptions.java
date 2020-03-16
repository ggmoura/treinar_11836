
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FormControlPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FormControlPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DynamicPickListSourceEntity_SourceEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FormControlResponseType_ResponseType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCanned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResponseOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResponseOptionsOptions" type="{http://roadnet.com/apex/DataContracts/}FormControlResponseOptionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ValidationRegularExpression" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormControlPropertyOptions", propOrder = {
    "dynamicPickListSourceEntitySourceEntity",
    "formControlResponseTypeResponseType",
    "identifier",
    "isCanned",
    "isDeleted",
    "isHidden",
    "maxValue",
    "minValue",
    "propertyName",
    "responseOptions",
    "responseOptionsOptions",
    "text",
    "validationRegularExpression"
})
public class FormControlPropertyOptions
    extends BusinessUnitBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "DynamicPickListSourceEntity_SourceEntity")
    protected Boolean dynamicPickListSourceEntitySourceEntity;
    @XmlElement(name = "FormControlResponseType_ResponseType")
    protected Boolean formControlResponseTypeResponseType;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsCanned")
    protected Boolean isCanned;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "IsHidden")
    protected Boolean isHidden;
    @XmlElement(name = "MaxValue")
    protected Boolean maxValue;
    @XmlElement(name = "MinValue")
    protected Boolean minValue;
    @XmlElement(name = "PropertyName")
    protected Boolean propertyName;
    @XmlElement(name = "ResponseOptions")
    protected Boolean responseOptions;
    @XmlElementRef(name = "ResponseOptionsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<FormControlResponseOptionPropertyOptions> responseOptionsOptions;
    @XmlElement(name = "Text")
    protected Boolean text;
    @XmlElement(name = "ValidationRegularExpression")
    protected Boolean validationRegularExpression;

    /**
     * Obtém o valor da propriedade dynamicPickListSourceEntitySourceEntity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamicPickListSourceEntitySourceEntity() {
        return dynamicPickListSourceEntitySourceEntity;
    }

    /**
     * Define o valor da propriedade dynamicPickListSourceEntitySourceEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicPickListSourceEntitySourceEntity(Boolean value) {
        this.dynamicPickListSourceEntitySourceEntity = value;
    }

    /**
     * Obtém o valor da propriedade formControlResponseTypeResponseType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFormControlResponseTypeResponseType() {
        return formControlResponseTypeResponseType;
    }

    /**
     * Define o valor da propriedade formControlResponseTypeResponseType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormControlResponseTypeResponseType(Boolean value) {
        this.formControlResponseTypeResponseType = value;
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
     * Obtém o valor da propriedade isCanned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCanned() {
        return isCanned;
    }

    /**
     * Define o valor da propriedade isCanned.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCanned(Boolean value) {
        this.isCanned = value;
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
     * Obtém o valor da propriedade isHidden.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Define o valor da propriedade isHidden.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
    }

    /**
     * Obtém o valor da propriedade maxValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxValue() {
        return maxValue;
    }

    /**
     * Define o valor da propriedade maxValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxValue(Boolean value) {
        this.maxValue = value;
    }

    /**
     * Obtém o valor da propriedade minValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinValue() {
        return minValue;
    }

    /**
     * Define o valor da propriedade minValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinValue(Boolean value) {
        this.minValue = value;
    }

    /**
     * Obtém o valor da propriedade propertyName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyName() {
        return propertyName;
    }

    /**
     * Define o valor da propriedade propertyName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyName(Boolean value) {
        this.propertyName = value;
    }

    /**
     * Obtém o valor da propriedade responseOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResponseOptions() {
        return responseOptions;
    }

    /**
     * Define o valor da propriedade responseOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResponseOptions(Boolean value) {
        this.responseOptions = value;
    }

    /**
     * Obtém o valor da propriedade responseOptionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FormControlResponseOptionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<FormControlResponseOptionPropertyOptions> getResponseOptionsOptions() {
        return responseOptionsOptions;
    }

    /**
     * Define o valor da propriedade responseOptionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FormControlResponseOptionPropertyOptions }{@code >}
     *     
     */
    public void setResponseOptionsOptions(JAXBElement<FormControlResponseOptionPropertyOptions> value) {
        this.responseOptionsOptions = value;
    }

    /**
     * Obtém o valor da propriedade text.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isText() {
        return text;
    }

    /**
     * Define o valor da propriedade text.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setText(Boolean value) {
        this.text = value;
    }

    /**
     * Obtém o valor da propriedade validationRegularExpression.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidationRegularExpression() {
        return validationRegularExpression;
    }

    /**
     * Define o valor da propriedade validationRegularExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidationRegularExpression(Boolean value) {
        this.validationRegularExpression = value;
    }

}
