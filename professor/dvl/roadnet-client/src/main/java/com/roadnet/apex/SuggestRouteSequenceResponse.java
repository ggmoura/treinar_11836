
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RouteOptimizationSuggestion;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuggestRouteSequenceResult" type="{http://roadnet.com/apex/DataContracts/}RouteOptimizationSuggestion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "suggestRouteSequenceResult"
})
@XmlRootElement(name = "SuggestRouteSequenceResponse")
public class SuggestRouteSequenceResponse {

    @XmlElementRef(name = "SuggestRouteSequenceResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteOptimizationSuggestion> suggestRouteSequenceResult;

    /**
     * Obtém o valor da propriedade suggestRouteSequenceResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteOptimizationSuggestion }{@code >}
     *     
     */
    public JAXBElement<RouteOptimizationSuggestion> getSuggestRouteSequenceResult() {
        return suggestRouteSequenceResult;
    }

    /**
     * Define o valor da propriedade suggestRouteSequenceResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteOptimizationSuggestion }{@code >}
     *     
     */
    public void setSuggestRouteSequenceResult(JAXBElement<RouteOptimizationSuggestion> value) {
        this.suggestRouteSequenceResult = value;
    }

}
