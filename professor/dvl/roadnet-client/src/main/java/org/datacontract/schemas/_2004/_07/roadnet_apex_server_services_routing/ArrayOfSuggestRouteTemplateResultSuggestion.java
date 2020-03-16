
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSuggestRouteTemplateResult.Suggestion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSuggestRouteTemplateResult.Suggestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuggestRouteTemplateResult.Suggestion" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}SuggestRouteTemplateResult.Suggestion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSuggestRouteTemplateResult.Suggestion", propOrder = {
    "suggestRouteTemplateResultSuggestion"
})
public class ArrayOfSuggestRouteTemplateResultSuggestion {

    @XmlElement(name = "SuggestRouteTemplateResult.Suggestion", nillable = true)
    protected List<SuggestRouteTemplateResultSuggestion> suggestRouteTemplateResultSuggestion;

    /**
     * Gets the value of the suggestRouteTemplateResultSuggestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestRouteTemplateResultSuggestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestRouteTemplateResultSuggestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuggestRouteTemplateResultSuggestion }
     * 
     * 
     */
    public List<SuggestRouteTemplateResultSuggestion> getSuggestRouteTemplateResultSuggestion() {
        if (suggestRouteTemplateResultSuggestion == null) {
            suggestRouteTemplateResultSuggestion = new ArrayList<SuggestRouteTemplateResultSuggestion>();
        }
        return this.suggestRouteTemplateResultSuggestion;
    }

}
