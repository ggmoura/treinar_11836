
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ServicePatternAnalyzerResult.ServicePatternAnalyzerSummary complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServicePatternAnalyzerResult.ServicePatternAnalyzerSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfRecurringOrdersCreated" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfStopsAnalyzed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePatternAnalyzerResult.ServicePatternAnalyzerSummary", propOrder = {
    "numberOfRecurringOrdersCreated",
    "numberOfStopsAnalyzed"
})
public class ServicePatternAnalyzerResultServicePatternAnalyzerSummary
    extends DataTransferObject
{

    @XmlElement(name = "NumberOfRecurringOrdersCreated")
    protected Long numberOfRecurringOrdersCreated;
    @XmlElement(name = "NumberOfStopsAnalyzed")
    protected Long numberOfStopsAnalyzed;

    /**
     * Obtém o valor da propriedade numberOfRecurringOrdersCreated.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfRecurringOrdersCreated() {
        return numberOfRecurringOrdersCreated;
    }

    /**
     * Define o valor da propriedade numberOfRecurringOrdersCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfRecurringOrdersCreated(Long value) {
        this.numberOfRecurringOrdersCreated = value;
    }

    /**
     * Obtém o valor da propriedade numberOfStopsAnalyzed.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfStopsAnalyzed() {
        return numberOfStopsAnalyzed;
    }

    /**
     * Define o valor da propriedade numberOfStopsAnalyzed.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfStopsAnalyzed(Long value) {
        this.numberOfStopsAnalyzed = value;
    }

}
