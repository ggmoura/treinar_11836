
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CustomEntityPropertyMetaDataPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomEntityPropertyMetaDataPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomEntityPropertyType_DataType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegularExpression" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomEntityPropertyMetaDataPropertyOptions", propOrder = {
    "customEntityPropertyTypeDataType",
    "description",
    "displayName",
    "length",
    "maxValue",
    "minValue",
    "name",
    "regularExpression"
})
public class CustomEntityPropertyMetaDataPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "CustomEntityPropertyType_DataType")
    protected Boolean customEntityPropertyTypeDataType;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "DisplayName")
    protected Boolean displayName;
    @XmlElement(name = "Length")
    protected Boolean length;
    @XmlElement(name = "MaxValue")
    protected Boolean maxValue;
    @XmlElement(name = "MinValue")
    protected Boolean minValue;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "RegularExpression")
    protected Boolean regularExpression;

    /**
     * Obtém o valor da propriedade customEntityPropertyTypeDataType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomEntityPropertyTypeDataType() {
        return customEntityPropertyTypeDataType;
    }

    /**
     * Define o valor da propriedade customEntityPropertyTypeDataType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomEntityPropertyTypeDataType(Boolean value) {
        this.customEntityPropertyTypeDataType = value;
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
     * Obtém o valor da propriedade displayName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayName() {
        return displayName;
    }

    /**
     * Define o valor da propriedade displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayName(Boolean value) {
        this.displayName = value;
    }

    /**
     * Obtém o valor da propriedade length.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLength() {
        return length;
    }

    /**
     * Define o valor da propriedade length.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLength(Boolean value) {
        this.length = value;
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
     * Obtém o valor da propriedade regularExpression.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegularExpression() {
        return regularExpression;
    }

    /**
     * Define o valor da propriedade regularExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegularExpression(Boolean value) {
        this.regularExpression = value;
    }

}
