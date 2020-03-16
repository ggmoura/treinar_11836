
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.LoginResult;


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
 *         &lt;element name="LookupLoginResultResult" type="{http://roadnet.com/apex/DataContracts/}LoginResult" minOccurs="0"/&gt;
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
    "lookupLoginResultResult"
})
@XmlRootElement(name = "LookupLoginResultResponse")
public class LookupLoginResultResponse {

    @XmlElementRef(name = "LookupLoginResultResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<LoginResult> lookupLoginResultResult;

    /**
     * Obtém o valor da propriedade lookupLoginResultResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoginResult }{@code >}
     *     
     */
    public JAXBElement<LoginResult> getLookupLoginResultResult() {
        return lookupLoginResultResult;
    }

    /**
     * Define o valor da propriedade lookupLoginResultResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoginResult }{@code >}
     *     
     */
    public void setLookupLoginResultResult(JAXBElement<LoginResult> value) {
        this.lookupLoginResultResult = value;
    }

}
