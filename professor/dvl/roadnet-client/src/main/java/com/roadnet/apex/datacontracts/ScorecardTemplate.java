
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ScorecardTemplate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScorecardTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Criteria" type="{http://roadnet.com/apex/DataContracts/}ArrayOfScorecardTemplateCriteria" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdConfiguration" type="{http://roadnet.com/apex/DataContracts/}ScorecardThresholdConfiguration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardTemplate", propOrder = {
    "criteria",
    "description",
    "identifier",
    "thresholdConfiguration"
})
public class ScorecardTemplate
    extends RegionBasedAggregateRootEntity
{

    @XmlElementRef(name = "Criteria", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfScorecardTemplateCriteria> criteria;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "ThresholdConfiguration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ScorecardThresholdConfiguration> thresholdConfiguration;

    /**
     * Obtém o valor da propriedade criteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorecardTemplateCriteria }{@code >}
     *     
     */
    public JAXBElement<ArrayOfScorecardTemplateCriteria> getCriteria() {
        return criteria;
    }

    /**
     * Define o valor da propriedade criteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorecardTemplateCriteria }{@code >}
     *     
     */
    public void setCriteria(JAXBElement<ArrayOfScorecardTemplateCriteria> value) {
        this.criteria = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade thresholdConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ScorecardThresholdConfiguration }{@code >}
     *     
     */
    public JAXBElement<ScorecardThresholdConfiguration> getThresholdConfiguration() {
        return thresholdConfiguration;
    }

    /**
     * Define o valor da propriedade thresholdConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ScorecardThresholdConfiguration }{@code >}
     *     
     */
    public void setThresholdConfiguration(JAXBElement<ScorecardThresholdConfiguration> value) {
        this.thresholdConfiguration = value;
    }

}
