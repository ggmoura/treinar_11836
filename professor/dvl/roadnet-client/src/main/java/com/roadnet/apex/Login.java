
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ClientApplicationInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.CultureOptions;


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
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cultureOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login}CultureOptions" minOccurs="0"/&gt;
 *         &lt;element name="appInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login}ClientApplicationInfo" minOccurs="0"/&gt;
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
    "emailAddress",
    "password",
    "cultureOptions",
    "appInfo"
})
@XmlRootElement(name = "Login")
public class Login {

    @XmlElementRef(name = "emailAddress", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "password", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "cultureOptions", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<CultureOptions> cultureOptions;
    @XmlElementRef(name = "appInfo", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientApplicationInfo> appInfo;

    /**
     * Obtém o valor da propriedade emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Define o valor da propriedade emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = value;
    }

    /**
     * Obtém o valor da propriedade password.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Define o valor da propriedade password.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Obtém o valor da propriedade cultureOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CultureOptions }{@code >}
     *     
     */
    public JAXBElement<CultureOptions> getCultureOptions() {
        return cultureOptions;
    }

    /**
     * Define o valor da propriedade cultureOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CultureOptions }{@code >}
     *     
     */
    public void setCultureOptions(JAXBElement<CultureOptions> value) {
        this.cultureOptions = value;
    }

    /**
     * Obtém o valor da propriedade appInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationInfo }{@code >}
     *     
     */
    public JAXBElement<ClientApplicationInfo> getAppInfo() {
        return appInfo;
    }

    /**
     * Define o valor da propriedade appInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationInfo }{@code >}
     *     
     */
    public void setAppInfo(JAXBElement<ClientApplicationInfo> value) {
        this.appInfo = value;
    }

}
