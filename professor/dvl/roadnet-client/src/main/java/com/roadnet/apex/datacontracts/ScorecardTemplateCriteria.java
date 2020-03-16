
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de ScorecardTemplateCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScorecardTemplateCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxScoreThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MinScoreThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRuleEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ScorecardTemplateCriteria_CriteriaType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScorecardTemplateCriteria_ScaleType_Scale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Weighting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardTemplateCriteria", propOrder = {
    "maxScoreThreshold",
    "minScoreThreshold",
    "resourceExceptionRuleEntityKey",
    "scorecardTemplateCriteriaCriteriaTypeType",
    "scorecardTemplateCriteriaScaleTypeScale",
    "weighting"
})
public class ScorecardTemplateCriteria
    extends DomainEntity
{

    @XmlElement(name = "MaxScoreThreshold")
    protected Double maxScoreThreshold;
    @XmlElement(name = "MinScoreThreshold")
    protected Double minScoreThreshold;
    @XmlElementRef(name = "ResourceExceptionRuleEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> resourceExceptionRuleEntityKey;
    @XmlElementRef(name = "ScorecardTemplateCriteria_CriteriaType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scorecardTemplateCriteriaCriteriaTypeType;
    @XmlElementRef(name = "ScorecardTemplateCriteria_ScaleType_Scale", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scorecardTemplateCriteriaScaleTypeScale;
    @XmlElement(name = "Weighting")
    protected Long weighting;

    /**
     * Obtém o valor da propriedade maxScoreThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxScoreThreshold() {
        return maxScoreThreshold;
    }

    /**
     * Define o valor da propriedade maxScoreThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxScoreThreshold(Double value) {
        this.maxScoreThreshold = value;
    }

    /**
     * Obtém o valor da propriedade minScoreThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinScoreThreshold() {
        return minScoreThreshold;
    }

    /**
     * Define o valor da propriedade minScoreThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinScoreThreshold(Double value) {
        this.minScoreThreshold = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionRuleEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getResourceExceptionRuleEntityKey() {
        return resourceExceptionRuleEntityKey;
    }

    /**
     * Define o valor da propriedade resourceExceptionRuleEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setResourceExceptionRuleEntityKey(JAXBElement<Long> value) {
        this.resourceExceptionRuleEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade scorecardTemplateCriteriaCriteriaTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScorecardTemplateCriteriaCriteriaTypeType() {
        return scorecardTemplateCriteriaCriteriaTypeType;
    }

    /**
     * Define o valor da propriedade scorecardTemplateCriteriaCriteriaTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScorecardTemplateCriteriaCriteriaTypeType(JAXBElement<String> value) {
        this.scorecardTemplateCriteriaCriteriaTypeType = value;
    }

    /**
     * Obtém o valor da propriedade scorecardTemplateCriteriaScaleTypeScale.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScorecardTemplateCriteriaScaleTypeScale() {
        return scorecardTemplateCriteriaScaleTypeScale;
    }

    /**
     * Define o valor da propriedade scorecardTemplateCriteriaScaleTypeScale.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScorecardTemplateCriteriaScaleTypeScale(JAXBElement<String> value) {
        this.scorecardTemplateCriteriaScaleTypeScale = value;
    }

    /**
     * Obtém o valor da propriedade weighting.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWeighting() {
        return weighting;
    }

    /**
     * Define o valor da propriedade weighting.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWeighting(Long value) {
        this.weighting = value;
    }

}
