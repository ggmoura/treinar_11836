
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RetrieveDataFeedStatusResult;


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
 *         &lt;element name="RetrieveDataFeedStatusResult" type="{http://roadnet.com/apex/DataContracts/}RetrieveDataFeedStatusResult" minOccurs="0"/&gt;
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
    "retrieveDataFeedStatusResult"
})
@XmlRootElement(name = "RetrieveDataFeedStatusResponse")
public class RetrieveDataFeedStatusResponse {

    @XmlElementRef(name = "RetrieveDataFeedStatusResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RetrieveDataFeedStatusResult> retrieveDataFeedStatusResult;

    /**
     * Obtém o valor da propriedade retrieveDataFeedStatusResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveDataFeedStatusResult }{@code >}
     *     
     */
    public JAXBElement<RetrieveDataFeedStatusResult> getRetrieveDataFeedStatusResult() {
        return retrieveDataFeedStatusResult;
    }

    /**
     * Define o valor da propriedade retrieveDataFeedStatusResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveDataFeedStatusResult }{@code >}
     *     
     */
    public void setRetrieveDataFeedStatusResult(JAXBElement<RetrieveDataFeedStatusResult> value) {
        this.retrieveDataFeedStatusResult = value;
    }

}
