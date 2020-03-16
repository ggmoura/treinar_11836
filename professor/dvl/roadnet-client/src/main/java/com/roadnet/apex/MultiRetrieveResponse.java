
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfRetrievalResults;


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
 *         &lt;element name="MultiRetrieveResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRetrievalResults" minOccurs="0"/&gt;
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
    "multiRetrieveResult"
})
@XmlRootElement(name = "MultiRetrieveResponse")
public class MultiRetrieveResponse {

    @XmlElementRef(name = "MultiRetrieveResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRetrievalResults> multiRetrieveResult;

    /**
     * Obtém o valor da propriedade multiRetrieveResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRetrievalResults }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRetrievalResults> getMultiRetrieveResult() {
        return multiRetrieveResult;
    }

    /**
     * Define o valor da propriedade multiRetrieveResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRetrievalResults }{@code >}
     *     
     */
    public void setMultiRetrieveResult(JAXBElement<ArrayOfRetrievalResults> value) {
        this.multiRetrieveResult = value;
    }

}
