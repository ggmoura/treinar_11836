
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ScorecardTemplateCriteriaPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScorecardTemplateCriteriaPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxScoreThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinScoreThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRuleEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Scale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Weighting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardTemplateCriteriaPropertyOptions", propOrder = {
    "maxScoreThreshold",
    "minScoreThreshold",
    "resourceExceptionRuleEntityKey",
    "scale",
    "type",
    "weighting"
})
public class ScorecardTemplateCriteriaPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "MaxScoreThreshold")
    protected Boolean maxScoreThreshold;
    @XmlElement(name = "MinScoreThreshold")
    protected Boolean minScoreThreshold;
    @XmlElement(name = "ResourceExceptionRuleEntityKey")
    protected Boolean resourceExceptionRuleEntityKey;
    @XmlElement(name = "Scale")
    protected Boolean scale;
    @XmlElement(name = "Type")
    protected Boolean type;
    @XmlElement(name = "Weighting")
    protected Boolean weighting;

    /**
     * Obtém o valor da propriedade maxScoreThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxScoreThreshold() {
        return maxScoreThreshold;
    }

    /**
     * Define o valor da propriedade maxScoreThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxScoreThreshold(Boolean value) {
        this.maxScoreThreshold = value;
    }

    /**
     * Obtém o valor da propriedade minScoreThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinScoreThreshold() {
        return minScoreThreshold;
    }

    /**
     * Define o valor da propriedade minScoreThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinScoreThreshold(Boolean value) {
        this.minScoreThreshold = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionRuleEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResourceExceptionRuleEntityKey() {
        return resourceExceptionRuleEntityKey;
    }

    /**
     * Define o valor da propriedade resourceExceptionRuleEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResourceExceptionRuleEntityKey(Boolean value) {
        this.resourceExceptionRuleEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade scale.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScale() {
        return scale;
    }

    /**
     * Define o valor da propriedade scale.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScale(Boolean value) {
        this.scale = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setType(Boolean value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade weighting.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeighting() {
        return weighting;
    }

    /**
     * Define o valor da propriedade weighting.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeighting(Boolean value) {
        this.weighting = value;
    }

}
