
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LoginAdminResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LoginAdminResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdminUserSession" type="{http://roadnet.com/apex/DataContracts/}AdminUserSession" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://roadnet.com/apex/DataContracts/}AdminUser" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginAdminResult", propOrder = {
    "adminUserSession",
    "user"
})
public class LoginAdminResult {

    @XmlElementRef(name = "AdminUserSession", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<AdminUserSession> adminUserSession;
    @XmlElementRef(name = "User", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<AdminUser> user;

    /**
     * Obtém o valor da propriedade adminUserSession.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdminUserSession }{@code >}
     *     
     */
    public JAXBElement<AdminUserSession> getAdminUserSession() {
        return adminUserSession;
    }

    /**
     * Define o valor da propriedade adminUserSession.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdminUserSession }{@code >}
     *     
     */
    public void setAdminUserSession(JAXBElement<AdminUserSession> value) {
        this.adminUserSession = value;
    }

    /**
     * Obtém o valor da propriedade user.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdminUser }{@code >}
     *     
     */
    public JAXBElement<AdminUser> getUser() {
        return user;
    }

    /**
     * Define o valor da propriedade user.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdminUser }{@code >}
     *     
     */
    public void setUser(JAXBElement<AdminUser> value) {
        this.user = value;
    }

}
