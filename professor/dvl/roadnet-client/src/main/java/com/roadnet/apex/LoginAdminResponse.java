
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.LoginAdminResult;


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
 *         &lt;element name="LoginAdminResult" type="{http://roadnet.com/apex/DataContracts/}LoginAdminResult" minOccurs="0"/&gt;
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
    "loginAdminResult"
})
@XmlRootElement(name = "LoginAdminResponse")
public class LoginAdminResponse {

    @XmlElementRef(name = "LoginAdminResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<LoginAdminResult> loginAdminResult;

    /**
     * Obtém o valor da propriedade loginAdminResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoginAdminResult }{@code >}
     *     
     */
    public JAXBElement<LoginAdminResult> getLoginAdminResult() {
        return loginAdminResult;
    }

    /**
     * Define o valor da propriedade loginAdminResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoginAdminResult }{@code >}
     *     
     */
    public void setLoginAdminResult(JAXBElement<LoginAdminResult> value) {
        this.loginAdminResult = value;
    }

}
