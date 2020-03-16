
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de GeocodeResultPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GeocodeResultPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Results" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResultsPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}GeocodeCandidateResultsPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeResultPropertyOptions", propOrder = {
    "results",
    "resultsPropertyOptions"
})
public class GeocodeResultPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "Results")
    protected Boolean results;
    @XmlElementRef(name = "ResultsPropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<GeocodeCandidateResultsPropertyOptions> resultsPropertyOptions;

    /**
     * Obtém o valor da propriedade results.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResults() {
        return results;
    }

    /**
     * Define o valor da propriedade results.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResults(Boolean value) {
        this.results = value;
    }

    /**
     * Obtém o valor da propriedade resultsPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeocodeCandidateResultsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<GeocodeCandidateResultsPropertyOptions> getResultsPropertyOptions() {
        return resultsPropertyOptions;
    }

    /**
     * Define o valor da propriedade resultsPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeocodeCandidateResultsPropertyOptions }{@code >}
     *     
     */
    public void setResultsPropertyOptions(JAXBElement<GeocodeCandidateResultsPropertyOptions> value) {
        this.resultsPropertyOptions = value;
    }

}
