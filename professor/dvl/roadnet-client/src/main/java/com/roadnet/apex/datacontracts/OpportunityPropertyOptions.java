
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de OpportunityPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OpportunityPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Scenarios" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScenariosOptions" type="{http://roadnet.com/apex/DataContracts/}OpportunityScenarioPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityPropertyOptions", propOrder = {
    "endDate",
    "scenarios",
    "scenariosOptions",
    "startDate"
})
public class OpportunityPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "EndDate")
    protected Boolean endDate;
    @XmlElement(name = "Scenarios")
    protected Boolean scenarios;
    @XmlElementRef(name = "ScenariosOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityScenarioPropertyOptions> scenariosOptions;
    @XmlElement(name = "StartDate")
    protected Boolean startDate;

    /**
     * Obtém o valor da propriedade endDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndDate() {
        return endDate;
    }

    /**
     * Define o valor da propriedade endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndDate(Boolean value) {
        this.endDate = value;
    }

    /**
     * Obtém o valor da propriedade scenarios.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScenarios() {
        return scenarios;
    }

    /**
     * Define o valor da propriedade scenarios.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScenarios(Boolean value) {
        this.scenarios = value;
    }

    /**
     * Obtém o valor da propriedade scenariosOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityScenarioPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpportunityScenarioPropertyOptions> getScenariosOptions() {
        return scenariosOptions;
    }

    /**
     * Define o valor da propriedade scenariosOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityScenarioPropertyOptions }{@code >}
     *     
     */
    public void setScenariosOptions(JAXBElement<OpportunityScenarioPropertyOptions> value) {
        this.scenariosOptions = value;
    }

    /**
     * Obtém o valor da propriedade startDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartDate() {
        return startDate;
    }

    /**
     * Define o valor da propriedade startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartDate(Boolean value) {
        this.startDate = value;
    }

}
