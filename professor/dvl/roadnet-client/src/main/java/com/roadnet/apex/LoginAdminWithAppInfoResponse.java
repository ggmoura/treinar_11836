
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
 *         &lt;element name="LoginAdminWithAppInfoResult" type="{http://roadnet.com/apex/DataContracts/}LoginAdminResult" minOccurs="0"/&gt;
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
    "loginAdminWithAppInfoResult"
})
@XmlRootElement(name = "LoginAdminWithAppInfoResponse")
public class LoginAdminWithAppInfoResponse {

    @XmlElementRef(name = "LoginAdminWithAppInfoResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<LoginAdminResult> loginAdminWithAppInfoResult;

    /**
     * Obtém o valor da propriedade loginAdminWithAppInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoginAdminResult }{@code >}
     *     
     */
    public JAXBElement<LoginAdminResult> getLoginAdminWithAppInfoResult() {
        return loginAdminWithAppInfoResult;
    }

    /**
     * Define o valor da propriedade loginAdminWithAppInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoginAdminResult }{@code >}
     *     
     */
    public void setLoginAdminWithAppInfoResult(JAXBElement<LoginAdminResult> value) {
        this.loginAdminWithAppInfoResult = value;
    }

}
