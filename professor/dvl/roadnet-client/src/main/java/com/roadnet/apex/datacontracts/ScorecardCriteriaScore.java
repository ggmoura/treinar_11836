
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ScorecardCriteriaScore complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScorecardCriteriaScore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Basis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRuleEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ScorecardTemplateCriteria_CriteriaType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardCriteriaScore", propOrder = {
    "basis",
    "resourceExceptionRuleEntityKey",
    "score",
    "scorecardTemplateCriteriaCriteriaTypeType"
})
public class ScorecardCriteriaScore
    extends DataTransferObject
{

    @XmlElement(name = "Basis")
    protected Double basis;
    @XmlElementRef(name = "ResourceExceptionRuleEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> resourceExceptionRuleEntityKey;
    @XmlElement(name = "Score")
    protected Double score;
    @XmlElementRef(name = "ScorecardTemplateCriteria_CriteriaType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scorecardTemplateCriteriaCriteriaTypeType;

    /**
     * Obtém o valor da propriedade basis.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBasis() {
        return basis;
    }

    /**
     * Define o valor da propriedade basis.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBasis(Double value) {
        this.basis = value;
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
     * Obtém o valor da propriedade score.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScore() {
        return score;
    }

    /**
     * Define o valor da propriedade score.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScore(Double value) {
        this.score = value;
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

}
