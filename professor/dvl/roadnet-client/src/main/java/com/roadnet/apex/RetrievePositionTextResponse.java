
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RetrievePositionTextResult;


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
 *         &lt;element name="RetrievePositionTextResult" type="{http://roadnet.com/apex/DataContracts/}RetrievePositionTextResult" minOccurs="0"/&gt;
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
    "retrievePositionTextResult"
})
@XmlRootElement(name = "RetrievePositionTextResponse")
public class RetrievePositionTextResponse {

    @XmlElementRef(name = "RetrievePositionTextResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RetrievePositionTextResult> retrievePositionTextResult;

    /**
     * Obtém o valor da propriedade retrievePositionTextResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrievePositionTextResult }{@code >}
     *     
     */
    public JAXBElement<RetrievePositionTextResult> getRetrievePositionTextResult() {
        return retrievePositionTextResult;
    }

    /**
     * Define o valor da propriedade retrievePositionTextResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrievePositionTextResult }{@code >}
     *     
     */
    public void setRetrievePositionTextResult(JAXBElement<RetrievePositionTextResult> value) {
        this.retrievePositionTextResult = value;
    }

}
