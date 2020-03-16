
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.UrlSet;


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
 *         &lt;element name="RetrieveUrlsForContextResult" type="{http://roadnet.com/apex/DataContracts/}UrlSet" minOccurs="0"/&gt;
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
    "retrieveUrlsForContextResult"
})
@XmlRootElement(name = "RetrieveUrlsForContextResponse")
public class RetrieveUrlsForContextResponse {

    @XmlElementRef(name = "RetrieveUrlsForContextResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<UrlSet> retrieveUrlsForContextResult;

    /**
     * Obtém o valor da propriedade retrieveUrlsForContextResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UrlSet }{@code >}
     *     
     */
    public JAXBElement<UrlSet> getRetrieveUrlsForContextResult() {
        return retrieveUrlsForContextResult;
    }

    /**
     * Define o valor da propriedade retrieveUrlsForContextResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UrlSet }{@code >}
     *     
     */
    public void setRetrieveUrlsForContextResult(JAXBElement<UrlSet> value) {
        this.retrieveUrlsForContextResult = value;
    }

}
