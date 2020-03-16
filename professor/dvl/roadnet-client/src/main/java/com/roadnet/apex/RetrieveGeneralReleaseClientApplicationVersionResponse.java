
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
 *         &lt;element name="RetrieveGeneralReleaseClientApplicationVersionResult" type="{http://roadnet.com/apex/DataContracts/}ClientApplicationVersion" minOccurs="0"/&gt;
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
    "retrieveGeneralReleaseClientApplicationVersionResult"
})
@XmlRootElement(name = "RetrieveGeneralReleaseClientApplicationVersionResponse")
public class RetrieveGeneralReleaseClientApplicationVersionResponse {

    @XmlElementRef(name = "RetrieveGeneralReleaseClientApplicationVersionResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientApplicationVersion> retrieveGeneralReleaseClientApplicationVersionResult;

    /**
     * Obtém o valor da propriedade retrieveGeneralReleaseClientApplicationVersionResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationVersion }{@code >}
     *     
     */
    public JAXBElement<ClientApplicationVersion> getRetrieveGeneralReleaseClientApplicationVersionResult() {
        return retrieveGeneralReleaseClientApplicationVersionResult;
    }

    /**
     * Define o valor da propriedade retrieveGeneralReleaseClientApplicationVersionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationVersion }{@code >}
     *     
     */
    public void setRetrieveGeneralReleaseClientApplicationVersionResult(JAXBElement<ClientApplicationVersion> value) {
        this.retrieveGeneralReleaseClientApplicationVersionResult = value;
    }

}
