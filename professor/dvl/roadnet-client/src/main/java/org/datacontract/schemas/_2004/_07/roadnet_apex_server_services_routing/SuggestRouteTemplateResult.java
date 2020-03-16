
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SuggestRouteTemplateResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SuggestRouteTemplateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Suggestions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfSuggestRouteTemplateResult.Suggestion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestRouteTemplateResult", propOrder = {
    "suggestions"
})
public class SuggestRouteTemplateResult
    extends DataTransferObject
{

    @XmlElementRef(name = "Suggestions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSuggestRouteTemplateResultSuggestion> suggestions;

    /**
     * Obtém o valor da propriedade suggestions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSuggestRouteTemplateResultSuggestion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSuggestRouteTemplateResultSuggestion> getSuggestions() {
        return suggestions;
    }

    /**
     * Define o valor da propriedade suggestions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSuggestRouteTemplateResultSuggestion }{@code >}
     *     
     */
    public void setSuggestions(JAXBElement<ArrayOfSuggestRouteTemplateResultSuggestion> value) {
        this.suggestions = value;
    }

}
