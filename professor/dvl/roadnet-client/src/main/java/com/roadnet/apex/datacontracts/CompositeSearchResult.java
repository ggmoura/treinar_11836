
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CompositeSearchResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompositeSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelatedResults" type="{http://roadnet.com/apex/DataContracts/}ArrayOfSearchResult" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://roadnet.com/apex/DataContracts/}SearchResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeSearchResult", propOrder = {
    "relatedResults",
    "result"
})
public class CompositeSearchResult
    extends DataTransferObject
{

    @XmlElementRef(name = "RelatedResults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSearchResult> relatedResults;
    @XmlElementRef(name = "Result", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchResult> result;

    /**
     * Obtém o valor da propriedade relatedResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSearchResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSearchResult> getRelatedResults() {
        return relatedResults;
    }

    /**
     * Define o valor da propriedade relatedResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSearchResult }{@code >}
     *     
     */
    public void setRelatedResults(JAXBElement<ArrayOfSearchResult> value) {
        this.relatedResults = value;
    }

    /**
     * Obtém o valor da propriedade result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
     *     
     */
    public JAXBElement<SearchResult> getResult() {
        return result;
    }

    /**
     * Define o valor da propriedade result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
     *     
     */
    public void setResult(JAXBElement<SearchResult> value) {
        this.result = value;
    }

}
