
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de AuthenticationPolicyPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationPolicyPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PasswordOptions" type="{http://roadnet.com/apex/DataContracts/}PasswordPolicyOptions" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserOptions" type="{http://roadnet.com/apex/DataContracts/}UserPolicyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationPolicyPropertyOptions", propOrder = {
    "identifier",
    "password",
    "passwordOptions",
    "user",
    "userOptions"
})
public class AuthenticationPolicyPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "Password")
    protected Boolean password;
    @XmlElementRef(name = "PasswordOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PasswordPolicyOptions> passwordOptions;
    @XmlElement(name = "User")
    protected Boolean user;
    @XmlElementRef(name = "UserOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserPolicyOptions> userOptions;

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade password.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassword() {
        return password;
    }

    /**
     * Define o valor da propriedade password.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassword(Boolean value) {
        this.password = value;
    }

    /**
     * Obtém o valor da propriedade passwordOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PasswordPolicyOptions }{@code >}
     *     
     */
    public JAXBElement<PasswordPolicyOptions> getPasswordOptions() {
        return passwordOptions;
    }

    /**
     * Define o valor da propriedade passwordOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PasswordPolicyOptions }{@code >}
     *     
     */
    public void setPasswordOptions(JAXBElement<PasswordPolicyOptions> value) {
        this.passwordOptions = value;
    }

    /**
     * Obtém o valor da propriedade user.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUser() {
        return user;
    }

    /**
     * Define o valor da propriedade user.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUser(Boolean value) {
        this.user = value;
    }

    /**
     * Obtém o valor da propriedade userOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserPolicyOptions }{@code >}
     *     
     */
    public JAXBElement<UserPolicyOptions> getUserOptions() {
        return userOptions;
    }

    /**
     * Define o valor da propriedade userOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserPolicyOptions }{@code >}
     *     
     */
    public void setUserOptions(JAXBElement<UserPolicyOptions> value) {
        this.userOptions = value;
    }

}
