
package com.roadnet.apex.datacontracts;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImportJobInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportJobInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}JobInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImportStage_Stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverallPercentComplete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://roadnet.com/apex/DataContracts/}ImportResult" minOccurs="0"/&gt;
 *         &lt;element name="StagePercentComplete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportJobInfo", propOrder = {
    "importStageStage",
    "overallPercentComplete",
    "result",
    "stagePercentComplete"
})
public class ImportJobInfo
    extends JobInfo
{

    @XmlElementRef(name = "ImportStage_Stage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importStageStage;
    @XmlElement(name = "OverallPercentComplete")
    protected BigDecimal overallPercentComplete;
    @XmlElementRef(name = "Result", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportResult> result;
    @XmlElement(name = "StagePercentComplete")
    protected BigDecimal stagePercentComplete;

    /**
     * Obtém o valor da propriedade importStageStage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportStageStage() {
        return importStageStage;
    }

    /**
     * Define o valor da propriedade importStageStage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportStageStage(JAXBElement<String> value) {
        this.importStageStage = value;
    }

    /**
     * Obtém o valor da propriedade overallPercentComplete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverallPercentComplete() {
        return overallPercentComplete;
    }

    /**
     * Define o valor da propriedade overallPercentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverallPercentComplete(BigDecimal value) {
        this.overallPercentComplete = value;
    }

    /**
     * Obtém o valor da propriedade result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportResult }{@code >}
     *     
     */
    public JAXBElement<ImportResult> getResult() {
        return result;
    }

    /**
     * Define o valor da propriedade result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportResult }{@code >}
     *     
     */
    public void setResult(JAXBElement<ImportResult> value) {
        this.result = value;
    }

    /**
     * Obtém o valor da propriedade stagePercentComplete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStagePercentComplete() {
        return stagePercentComplete;
    }

    /**
     * Define o valor da propriedade stagePercentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStagePercentComplete(BigDecimal value) {
        this.stagePercentComplete = value;
    }

}
