
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.PositionTextListResult;


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
 *         &lt;element name="RetrievePositionTextListResult" type="{http://roadnet.com/apex/DataContracts/}PositionTextListResult" minOccurs="0"/&gt;
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
    "retrievePositionTextListResult"
})
@XmlRootElement(name = "RetrievePositionTextListResponse")
public class RetrievePositionTextListResponse {

    @XmlElementRef(name = "RetrievePositionTextListResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<PositionTextListResult> retrievePositionTextListResult;

    /**
     * Obtém o valor da propriedade retrievePositionTextListResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PositionTextListResult }{@code >}
     *     
     */
    public JAXBElement<PositionTextListResult> getRetrievePositionTextListResult() {
        return retrievePositionTextListResult;
    }

    /**
     * Define o valor da propriedade retrievePositionTextListResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PositionTextListResult }{@code >}
     *     
     */
    public void setRetrievePositionTextListResult(JAXBElement<PositionTextListResult> value) {
        this.retrievePositionTextListResult = value;
    }

}
