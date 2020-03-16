
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseScorecardKpiMeasureCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseScorecardKpiMeasureCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsReverseHighLowOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MinScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseScorecardKpiMeasureCriteria", propOrder = {
    "isReverseHighLowOrder",
    "maxScore",
    "minScore",
    "weight"
})
public class DataWarehouseScorecardKpiMeasureCriteria
    extends DataTransferObject
{

    @XmlElement(name = "IsReverseHighLowOrder")
    protected Boolean isReverseHighLowOrder;
    @XmlElement(name = "MaxScore")
    protected Double maxScore;
    @XmlElement(name = "MinScore")
    protected Double minScore;
    @XmlElement(name = "Weight")
    protected Double weight;

    /**
     * Obtém o valor da propriedade isReverseHighLowOrder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReverseHighLowOrder() {
        return isReverseHighLowOrder;
    }

    /**
     * Define o valor da propriedade isReverseHighLowOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReverseHighLowOrder(Boolean value) {
        this.isReverseHighLowOrder = value;
    }

    /**
     * Obtém o valor da propriedade maxScore.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxScore() {
        return maxScore;
    }

    /**
     * Define o valor da propriedade maxScore.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxScore(Double value) {
        this.maxScore = value;
    }

    /**
     * Obtém o valor da propriedade minScore.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinScore() {
        return minScore;
    }

    /**
     * Define o valor da propriedade minScore.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinScore(Double value) {
        this.minScore = value;
    }

    /**
     * Obtém o valor da propriedade weight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

}
