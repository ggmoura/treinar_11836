
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de OpportunityScenarioPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OpportunityScenarioPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Examples" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExamplesOptions" type="{http://roadnet.com/apex/DataContracts/}OpportunityExamplePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ScenarioType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalMetrics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalMetricsOptions" type="{http://roadnet.com/apex/DataContracts/}OpportunityMetricsPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityScenarioPropertyOptions", propOrder = {
    "examples",
    "examplesOptions",
    "scenarioTypeType",
    "totalMetrics",
    "totalMetricsOptions"
})
public class OpportunityScenarioPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Examples")
    protected Boolean examples;
    @XmlElementRef(name = "ExamplesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityExamplePropertyOptions> examplesOptions;
    @XmlElement(name = "ScenarioType_Type")
    protected Boolean scenarioTypeType;
    @XmlElement(name = "TotalMetrics")
    protected Boolean totalMetrics;
    @XmlElementRef(name = "TotalMetricsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityMetricsPropertyOptions> totalMetricsOptions;

    /**
     * Obtém o valor da propriedade examples.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExamples() {
        return examples;
    }

    /**
     * Define o valor da propriedade examples.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExamples(Boolean value) {
        this.examples = value;
    }

    /**
     * Obtém o valor da propriedade examplesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityExamplePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpportunityExamplePropertyOptions> getExamplesOptions() {
        return examplesOptions;
    }

    /**
     * Define o valor da propriedade examplesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityExamplePropertyOptions }{@code >}
     *     
     */
    public void setExamplesOptions(JAXBElement<OpportunityExamplePropertyOptions> value) {
        this.examplesOptions = value;
    }

    /**
     * Obtém o valor da propriedade scenarioTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScenarioTypeType() {
        return scenarioTypeType;
    }

    /**
     * Define o valor da propriedade scenarioTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScenarioTypeType(Boolean value) {
        this.scenarioTypeType = value;
    }

    /**
     * Obtém o valor da propriedade totalMetrics.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalMetrics() {
        return totalMetrics;
    }

    /**
     * Define o valor da propriedade totalMetrics.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalMetrics(Boolean value) {
        this.totalMetrics = value;
    }

    /**
     * Obtém o valor da propriedade totalMetricsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetricsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpportunityMetricsPropertyOptions> getTotalMetricsOptions() {
        return totalMetricsOptions;
    }

    /**
     * Define o valor da propriedade totalMetricsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetricsPropertyOptions }{@code >}
     *     
     */
    public void setTotalMetricsOptions(JAXBElement<OpportunityMetricsPropertyOptions> value) {
        this.totalMetricsOptions = value;
    }

}
