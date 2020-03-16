
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ClientApplicationVersion;


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
 *         &lt;element name="RetrieveClientApplicationVersionResult" type="{http://roadnet.com/apex/DataContracts/}ClientApplicationVersion" minOccurs="0"/&gt;
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
    "retrieveClientApplicationVersionResult"
})
@XmlRootElement(name = "RetrieveClientApplicationVersionResponse")
public class RetrieveClientApplicationVersionResponse {

    @XmlElementRef(name = "RetrieveClientApplicationVersionResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientApplicationVersion> retrieveClientApplicationVersionResult;

    /**
     * Obtém o valor da propriedade retrieveClientApplicationVersionResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationVersion }{@code >}
     *     
     */
    public JAXBElement<ClientApplicationVersion> getRetrieveClientApplicationVersionResult() {
        return retrieveClientApplicationVersionResult;
    }

    /**
     * Define o valor da propriedade retrieveClientApplicationVersionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationVersion }{@code >}
     *     
     */
    public void setRetrieveClientApplicationVersionResult(JAXBElement<ClientApplicationVersion> value) {
        this.retrieveClientApplicationVersionResult = value;
    }

}
