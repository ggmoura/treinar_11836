
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
 *         &lt;element name="RetrieveRegionsResult" type="{http://roadnet.com/apex/DataContracts/}RetrievalResults" minOccurs="0"/&gt;
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
    "retrieveRegionsResult"
})
@XmlRootElement(name = "RetrieveRegionsResponse")
public class RetrieveRegionsResponse {

    @XmlElementRef(name = "RetrieveRegionsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RetrievalResults> retrieveRegionsResult;

    /**
     * Obtém o valor da propriedade retrieveRegionsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrievalResults }{@code >}
     *     
     */
    public JAXBElement<RetrievalResults> getRetrieveRegionsResult() {
        return retrieveRegionsResult;
    }

    /**
     * Define o valor da propriedade retrieveRegionsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrievalResults }{@code >}
     *     
     */
    public void setRetrieveRegionsResult(JAXBElement<RetrievalResults> value) {
        this.retrieveRegionsResult = value;
    }

}
