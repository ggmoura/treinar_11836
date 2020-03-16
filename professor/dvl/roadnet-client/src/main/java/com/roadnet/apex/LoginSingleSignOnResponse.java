
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
 *         &lt;element name="LoginSingleSignOnResult" type="{http://roadnet.com/apex/DataContracts/}LoginResult" minOccurs="0"/&gt;
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
    "loginSingleSignOnResult"
})
@XmlRootElement(name = "LoginSingleSignOnResponse")
public class LoginSingleSignOnResponse {

    @XmlElementRef(name = "LoginSingleSignOnResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<LoginResult> loginSingleSignOnResult;

    /**
     * Obtém o valor da propriedade loginSingleSignOnResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoginResult }{@code >}
     *     
     */
    public JAXBElement<LoginResult> getLoginSingleSignOnResult() {
        return loginSingleSignOnResult;
    }

    /**
     * Define o valor da propriedade loginSingleSignOnResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoginResult }{@code >}
     *     
     */
    public void setLoginSingleSignOnResult(JAXBElement<LoginResult> value) {
        this.loginSingleSignOnResult = value;
    }

}
