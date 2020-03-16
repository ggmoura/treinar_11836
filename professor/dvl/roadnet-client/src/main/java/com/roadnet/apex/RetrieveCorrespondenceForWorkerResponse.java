
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RetrieveCorrespondenceForWorkerResult;


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
 *         &lt;element name="RetrieveCorrespondenceForWorkerResult" type="{http://roadnet.com/apex/DataContracts/}RetrieveCorrespondenceForWorkerResult" minOccurs="0"/&gt;
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
    "retrieveCorrespondenceForWorkerResult"
})
@XmlRootElement(name = "RetrieveCorrespondenceForWorkerResponse")
public class RetrieveCorrespondenceForWorkerResponse {

    @XmlElementRef(name = "RetrieveCorrespondenceForWorkerResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RetrieveCorrespondenceForWorkerResult> retrieveCorrespondenceForWorkerResult;

    /**
     * Obtém o valor da propriedade retrieveCorrespondenceForWorkerResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveCorrespondenceForWorkerResult }{@code >}
     *     
     */
    public JAXBElement<RetrieveCorrespondenceForWorkerResult> getRetrieveCorrespondenceForWorkerResult() {
        return retrieveCorrespondenceForWorkerResult;
    }

    /**
     * Define o valor da propriedade retrieveCorrespondenceForWorkerResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveCorrespondenceForWorkerResult }{@code >}
     *     
     */
    public void setRetrieveCorrespondenceForWorkerResult(JAXBElement<RetrieveCorrespondenceForWorkerResult> value) {
        this.retrieveCorrespondenceForWorkerResult = value;
    }

}
