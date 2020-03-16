
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RetrievalResults;


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
 *         &lt;element name="SearchByTypeResult" type="{http://roadnet.com/apex/DataContracts/}RetrievalResults" minOccurs="0"/&gt;
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
    "searchByTypeResult"
})
@XmlRootElement(name = "SearchByTypeResponse")
public class SearchByTypeResponse {

    @XmlElementRef(name = "SearchByTypeResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RetrievalResults> searchByTypeResult;

    /**
     * Obtém o valor da propriedade searchByTypeResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrievalResults }{@code >}
     *     
     */
    public JAXBElement<RetrievalResults> getSearchByTypeResult() {
        return searchByTypeResult;
    }

    /**
     * Define o valor da propriedade searchByTypeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrievalResults }{@code >}
     *     
     */
    public void setSearchByTypeResult(JAXBElement<RetrievalResults> value) {
        this.searchByTypeResult = value;
    }

}
