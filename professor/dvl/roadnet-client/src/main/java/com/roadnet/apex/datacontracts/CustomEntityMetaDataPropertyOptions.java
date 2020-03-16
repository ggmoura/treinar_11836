
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CustomEntityMetaDataPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomEntityMetaDataPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomEntityProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomEntityPropertiesOptions" type="{http://roadnet.com/apex/DataContracts/}CustomEntityPropertyMetaDataPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DomainEntityName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomEntityMetaDataPropertyOptions", propOrder = {
    "customEntityProperties",
    "customEntityPropertiesOptions",
    "description",
    "displayName",
    "domainEntityName",
    "name"
})
public class CustomEntityMetaDataPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "CustomEntityProperties")
    protected Boolean customEntityProperties;
    @XmlElementRef(name = "CustomEntityPropertiesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomEntityPropertyMetaDataPropertyOptions> customEntityPropertiesOptions;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "DisplayName")
    protected Boolean displayName;
    @XmlElement(name = "DomainEntityName")
    protected Boolean domainEntityName;
    @XmlElement(name = "Name")
    protected Boolean name;

    /**
     * Obtém o valor da propriedade customEntityProperties.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomEntityProperties() {
        return customEntityProperties;
    }

    /**
     * Define o valor da propriedade customEntityProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomEntityProperties(Boolean value) {
        this.customEntityProperties = value;
    }

    /**
     * Obtém o valor da propriedade customEntityPropertiesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomEntityPropertyMetaDataPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<CustomEntityPropertyMetaDataPropertyOptions> getCustomEntityPropertiesOptions() {
        return customEntityPropertiesOptions;
    }

    /**
     * Define o valor da propriedade customEntityPropertiesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomEntityPropertyMetaDataPropertyOptions }{@code >}
     *     
     */
    public void setCustomEntityPropertiesOptions(JAXBElement<CustomEntityPropertyMetaDataPropertyOptions> value) {
        this.customEntityPropertiesOptions = value;
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
     * Obtém o valor da propriedade domainEntityName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDomainEntityName() {
        return domainEntityName;
    }

    /**
     * Define o valor da propriedade domainEntityName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDomainEntityName(Boolean value) {
        this.domainEntityName = value;
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

}
