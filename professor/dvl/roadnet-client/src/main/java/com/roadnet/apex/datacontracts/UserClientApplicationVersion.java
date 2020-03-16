
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de UserClientApplicationVersion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UserClientApplicationVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowPriorApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ClientVersionOutOfDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CultureVersionOutOfDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LatestApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LatestCultureVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinimumApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCultureVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserCustomerLinkEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UserEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserLoginResultCode_LastLoginResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserClientApplicationVersion", propOrder = {
    "allowPriorApplicationVersion",
    "clientApplicationEntityKey",
    "clientVersionOutOfDate",
    "cultureVersionOutOfDate",
    "customerEntityKey",
    "lastLoginTime",
    "latestApplicationVersion",
    "latestCultureVersion",
    "minimumApplicationVersion",
    "userApplicationVersion",
    "userCultureVersion",
    "userCustomerLinkEntityKey",
    "userEmailAddress",
    "userLoginResultCodeLastLoginResultCode",
    "userName"
})
public class UserClientApplicationVersion
    extends AggregateRootEntity
{

    @XmlElementRef(name = "AllowPriorApplicationVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowPriorApplicationVersion;
    @XmlElement(name = "ClientApplicationEntityKey")
    protected Long clientApplicationEntityKey;
    @XmlElementRef(name = "ClientVersionOutOfDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> clientVersionOutOfDate;
    @XmlElementRef(name = "CultureVersionOutOfDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cultureVersionOutOfDate;
    @XmlElement(name = "CustomerEntityKey")
    protected Long customerEntityKey;
    @XmlElement(name = "LastLoginTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginTime;
    @XmlElementRef(name = "LatestApplicationVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> latestApplicationVersion;
    @XmlElementRef(name = "LatestCultureVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> latestCultureVersion;
    @XmlElementRef(name = "MinimumApplicationVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minimumApplicationVersion;
    @XmlElementRef(name = "UserApplicationVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userApplicationVersion;
    @XmlElementRef(name = "UserCultureVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userCultureVersion;
    @XmlElement(name = "UserCustomerLinkEntityKey")
    protected Long userCustomerLinkEntityKey;
    @XmlElementRef(name = "UserEmailAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userEmailAddress;
    @XmlElementRef(name = "UserLoginResultCode_LastLoginResultCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userLoginResultCodeLastLoginResultCode;
    @XmlElementRef(name = "UserName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> userName;

    /**
     * Obtém o valor da propriedade allowPriorApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowPriorApplicationVersion() {
        return allowPriorApplicationVersion;
    }

    /**
     * Define o valor da propriedade allowPriorApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowPriorApplicationVersion(JAXBElement<Boolean> value) {
        this.allowPriorApplicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientApplicationEntityKey() {
        return clientApplicationEntityKey;
    }

    /**
     * Define o valor da propriedade clientApplicationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientApplicationEntityKey(Long value) {
        this.clientApplicationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade clientVersionOutOfDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getClientVersionOutOfDate() {
        return clientVersionOutOfDate;
    }

    /**
     * Define o valor da propriedade clientVersionOutOfDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setClientVersionOutOfDate(JAXBElement<Boolean> value) {
        this.clientVersionOutOfDate = value;
    }

    /**
     * Obtém o valor da propriedade cultureVersionOutOfDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCultureVersionOutOfDate() {
        return cultureVersionOutOfDate;
    }

    /**
     * Define o valor da propriedade cultureVersionOutOfDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCultureVersionOutOfDate(JAXBElement<Boolean> value) {
        this.cultureVersionOutOfDate = value;
    }

    /**
     * Obtém o valor da propriedade customerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerEntityKey() {
        return customerEntityKey;
    }

    /**
     * Define o valor da propriedade customerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerEntityKey(Long value) {
        this.customerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lastLoginTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Define o valor da propriedade lastLoginTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoginTime(XMLGregorianCalendar value) {
        this.lastLoginTime = value;
    }

    /**
     * Obtém o valor da propriedade latestApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLatestApplicationVersion() {
        return latestApplicationVersion;
    }

    /**
     * Define o valor da propriedade latestApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLatestApplicationVersion(JAXBElement<String> value) {
        this.latestApplicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade latestCultureVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLatestCultureVersion() {
        return latestCultureVersion;
    }

    /**
     * Define o valor da propriedade latestCultureVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLatestCultureVersion(JAXBElement<String> value) {
        this.latestCultureVersion = value;
    }

    /**
     * Obtém o valor da propriedade minimumApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinimumApplicationVersion() {
        return minimumApplicationVersion;
    }

    /**
     * Define o valor da propriedade minimumApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinimumApplicationVersion(JAXBElement<String> value) {
        this.minimumApplicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade userApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserApplicationVersion() {
        return userApplicationVersion;
    }

    /**
     * Define o valor da propriedade userApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserApplicationVersion(JAXBElement<String> value) {
        this.userApplicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade userCultureVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserCultureVersion() {
        return userCultureVersion;
    }

    /**
     * Define o valor da propriedade userCultureVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserCultureVersion(JAXBElement<String> value) {
        this.userCultureVersion = value;
    }

    /**
     * Obtém o valor da propriedade userCustomerLinkEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserCustomerLinkEntityKey() {
        return userCustomerLinkEntityKey;
    }

    /**
     * Define o valor da propriedade userCustomerLinkEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserCustomerLinkEntityKey(Long value) {
        this.userCustomerLinkEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade userEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserEmailAddress() {
        return userEmailAddress;
    }

    /**
     * Define o valor da propriedade userEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserEmailAddress(JAXBElement<String> value) {
        this.userEmailAddress = value;
    }

    /**
     * Obtém o valor da propriedade userLoginResultCodeLastLoginResultCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLoginResultCodeLastLoginResultCode() {
        return userLoginResultCodeLastLoginResultCode;
    }

    /**
     * Define o valor da propriedade userLoginResultCodeLastLoginResultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLoginResultCodeLastLoginResultCode(JAXBElement<String> value) {
        this.userLoginResultCodeLastLoginResultCode = value;
    }

    /**
     * Obtém o valor da propriedade userName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getUserName() {
        return userName;
    }

    /**
     * Define o valor da propriedade userName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setUserName(JAXBElement<PersonName> value) {
        this.userName = value;
    }

}
