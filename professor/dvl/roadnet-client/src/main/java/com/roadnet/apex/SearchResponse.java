
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfCompositeSearchResult;


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
 *         &lt;element name="SearchResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCompositeSearchResult" minOccurs="0"/&gt;
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
    "searchResult"
})
@XmlRootElement(name = "SearchResponse")
public class SearchResponse {

    @XmlElementRef(name = "SearchResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCompositeSearchResult> searchResult;

    /**
     * Obtém o valor da propriedade searchResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompositeSearchResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCompositeSearchResult> getSearchResult() {
        return searchResult;
    }

    /**
     * Define o valor da propriedade searchResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompositeSearchResult }{@code >}
     *     
     */
    public void setSearchResult(JAXBElement<ArrayOfCompositeSearchResult> value) {
        this.searchResult = value;
    }

}
