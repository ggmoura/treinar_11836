
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfResetPasswordResult;


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
 *         &lt;element name="SendNewUserEmailResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfResetPasswordResult" minOccurs="0"/&gt;
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
    "sendNewUserEmailResult"
})
@XmlRootElement(name = "SendNewUserEmailResponse")
public class SendNewUserEmailResponse {

    @XmlElementRef(name = "SendNewUserEmailResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResetPasswordResult> sendNewUserEmailResult;

    /**
     * Obtém o valor da propriedade sendNewUserEmailResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResetPasswordResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResetPasswordResult> getSendNewUserEmailResult() {
        return sendNewUserEmailResult;
    }

    /**
     * Define o valor da propriedade sendNewUserEmailResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResetPasswordResult }{@code >}
     *     
     */
    public void setSendNewUserEmailResult(JAXBElement<ArrayOfResetPasswordResult> value) {
        this.sendNewUserEmailResult = value;
    }

}
