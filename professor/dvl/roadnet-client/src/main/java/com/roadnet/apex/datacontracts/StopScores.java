
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de StopScores complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StopScores"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WeightedMissedTimeWindowMetric" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopScores", propOrder = {
    "weightedMissedTimeWindowMetric"
})
public class StopScores
    extends DataTransferObject
{

    @XmlElement(name = "WeightedMissedTimeWindowMetric")
    protected Double weightedMissedTimeWindowMetric;

    /**
     * Obtém o valor da propriedade weightedMissedTimeWindowMetric.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightedMissedTimeWindowMetric() {
        return weightedMissedTimeWindowMetric;
    }

    /**
     * Define o valor da propriedade weightedMissedTimeWindowMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightedMissedTimeWindowMetric(Double value) {
        this.weightedMissedTimeWindowMetric = value;
    }

}
