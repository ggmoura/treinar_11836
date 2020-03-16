
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de OpportunityScenario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OpportunityScenario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Examples" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOpportunityExample" minOccurs="0"/&gt;
 *         &lt;element name="ScenarioType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalMetrics" type="{http://roadnet.com/apex/DataContracts/}OpportunityMetrics" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityScenario", propOrder = {
    "examples",
    "scenarioTypeType",
    "totalMetrics"
})
public class OpportunityScenario
    extends DomainEntity
{

    @XmlElementRef(name = "Examples", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOpportunityExample> examples;
    @XmlElementRef(name = "ScenarioType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scenarioTypeType;
    @XmlElementRef(name = "TotalMetrics", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityMetrics> totalMetrics;

    /**
     * Obtém o valor da propriedade examples.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOpportunityExample }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOpportunityExample> getExamples() {
        return examples;
    }

    /**
     * Define o valor da propriedade examples.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOpportunityExample }{@code >}
     *     
     */
    public void setExamples(JAXBElement<ArrayOfOpportunityExample> value) {
        this.examples = value;
    }

    /**
     * Obtém o valor da propriedade scenarioTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScenarioTypeType() {
        return scenarioTypeType;
    }

    /**
     * Define o valor da propriedade scenarioTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScenarioTypeType(JAXBElement<String> value) {
        this.scenarioTypeType = value;
    }

    /**
     * Obtém o valor da propriedade totalMetrics.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetrics }{@code >}
     *     
     */
    public JAXBElement<OpportunityMetrics> getTotalMetrics() {
        return totalMetrics;
    }

    /**
     * Define o valor da propriedade totalMetrics.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetrics }{@code >}
     *     
     */
    public void setTotalMetrics(JAXBElement<OpportunityMetrics> value) {
        this.totalMetrics = value;
    }

}
