
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ScorecardScore complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScorecardScore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CriteriaScores" type="{http://roadnet.com/apex/DataContracts/}ArrayOfScorecardCriteriaScore" minOccurs="0"/&gt;
 *         &lt;element name="TotalScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardScore", propOrder = {
    "criteriaScores",
    "totalScore"
})
@XmlSeeAlso({
    ScorecardEquipmentScore.class,
    ScorecardWorkerScore.class
})
public class ScorecardScore
    extends DataTransferObject
{

    @XmlElementRef(name = "CriteriaScores", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfScorecardCriteriaScore> criteriaScores;
    @XmlElement(name = "TotalScore")
    protected Double totalScore;

    /**
     * Obtém o valor da propriedade criteriaScores.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorecardCriteriaScore }{@code >}
     *     
     */
    public JAXBElement<ArrayOfScorecardCriteriaScore> getCriteriaScores() {
        return criteriaScores;
    }

    /**
     * Define o valor da propriedade criteriaScores.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScorecardCriteriaScore }{@code >}
     *     
     */
    public void setCriteriaScores(JAXBElement<ArrayOfScorecardCriteriaScore> value) {
        this.criteriaScores = value;
    }

    /**
     * Obtém o valor da propriedade totalScore.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalScore() {
        return totalScore;
    }

    /**
     * Define o valor da propriedade totalScore.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalScore(Double value) {
        this.totalScore = value;
    }

}
