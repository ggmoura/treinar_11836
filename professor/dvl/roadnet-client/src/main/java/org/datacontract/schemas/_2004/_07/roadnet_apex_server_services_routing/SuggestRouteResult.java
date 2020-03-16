
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SuggestRouteResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SuggestRouteResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteConstraintFlags_ConstraintsEncountered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Suggestions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute}ArrayOfSuggestRouteResult.Suggestion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestRouteResult", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", propOrder = {
    "routeConstraintFlagsConstraintsEncountered",
    "suggestions"
})
public class SuggestRouteResult
    extends DataTransferObject
{

    @XmlElementRef(name = "RouteConstraintFlags_ConstraintsEncountered", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeConstraintFlagsConstraintsEncountered;
    @XmlElementRef(name = "Suggestions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSuggestRouteResultSuggestion> suggestions;

    /**
     * Obtém o valor da propriedade routeConstraintFlagsConstraintsEncountered.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteConstraintFlagsConstraintsEncountered() {
        return routeConstraintFlagsConstraintsEncountered;
    }

    /**
     * Define o valor da propriedade routeConstraintFlagsConstraintsEncountered.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteConstraintFlagsConstraintsEncountered(JAXBElement<String> value) {
        this.routeConstraintFlagsConstraintsEncountered = value;
    }

    /**
     * Obtém o valor da propriedade suggestions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSuggestRouteResultSuggestion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSuggestRouteResultSuggestion> getSuggestions() {
        return suggestions;
    }

    /**
     * Define o valor da propriedade suggestions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSuggestRouteResultSuggestion }{@code >}
     *     
     */
    public void setSuggestions(JAXBElement<ArrayOfSuggestRouteResultSuggestion> value) {
        this.suggestions = value;
    }

}
