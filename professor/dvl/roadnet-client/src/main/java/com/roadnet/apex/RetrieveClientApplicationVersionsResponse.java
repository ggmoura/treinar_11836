
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfClientApplicationVersion;


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
 *         &lt;element name="RetrieveClientApplicationVersionsResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfClientApplicationVersion" minOccurs="0"/&gt;
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
    "retrieveClientApplicationVersionsResult"
})
@XmlRootElement(name = "RetrieveClientApplicationVersionsResponse")
public class RetrieveClientApplicationVersionsResponse {

    @XmlElementRef(name = "RetrieveClientApplicationVersionsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClientApplicationVersion> retrieveClientApplicationVersionsResult;

    /**
     * Obtém o valor da propriedade retrieveClientApplicationVersionsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClientApplicationVersion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClientApplicationVersion> getRetrieveClientApplicationVersionsResult() {
        return retrieveClientApplicationVersionsResult;
    }

    /**
     * Define o valor da propriedade retrieveClientApplicationVersionsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClientApplicationVersion }{@code >}
     *     
     */
    public void setRetrieveClientApplicationVersionsResult(JAXBElement<ArrayOfClientApplicationVersion> value) {
        this.retrieveClientApplicationVersionsResult = value;
    }

}
