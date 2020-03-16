
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de UserClientApplicationVersionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UserClientApplicationVersionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowPriorApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientVersionOutOfDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CultureVersionOutOfDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LatestApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LatestCultureVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserCultureVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserCustomerLinkEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserEmailAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserLoginResultCode_LastLoginResultCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserClientApplicationVersionPropertyOptions", propOrder = {
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
public class UserClientApplicationVersionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AllowPriorApplicationVersion")
    protected Boolean allowPriorApplicationVersion;
    @XmlElement(name = "ClientApplicationEntityKey")
    protected Boolean clientApplicationEntityKey;
    @XmlElement(name = "ClientVersionOutOfDate")
    protected Boolean clientVersionOutOfDate;
    @XmlElement(name = "CultureVersionOutOfDate")
    protected Boolean cultureVersionOutOfDate;
    @XmlElement(name = "CustomerEntityKey")
    protected Boolean customerEntityKey;
    @XmlElement(name = "LastLoginTime")
    protected Boolean lastLoginTime;
    @XmlElement(name = "LatestApplicationVersion")
    protected Boolean latestApplicationVersion;
    @XmlElement(name = "LatestCultureVersion")
    protected Boolean latestCultureVersion;
    @XmlElement(name = "MinimumApplicationVersion")
    protected Boolean minimumApplicationVersion;
    @XmlElement(name = "UserApplicationVersion")
    protected Boolean userApplicationVersion;
    @XmlElement(name = "UserCultureVersion")
    protected Boolean userCultureVersion;
    @XmlElement(name = "UserCustomerLinkEntityKey")
    protected Boolean userCustomerLinkEntityKey;
    @XmlElement(name = "UserEmailAddress")
    protected Boolean userEmailAddress;
    @XmlElement(name = "UserLoginResultCode_LastLoginResultCode")
    protected Boolean userLoginResultCodeLastLoginResultCode;
    @XmlElement(name = "UserName")
    protected Boolean userName;

    /**
     * Obtém o valor da propriedade allowPriorApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPriorApplicationVersion() {
        return allowPriorApplicationVersion;
    }

    /**
     * Define o valor da propriedade allowPriorApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPriorApplicationVersion(Boolean value) {
        this.allowPriorApplicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientApplicationEntityKey() {
        return clientApplicationEntityKey;
    }

    /**
     * Define o valor da propriedade clientApplicationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientApplicationEntityKey(Boolean value) {
        this.clientApplicationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade clientVersionOutOfDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientVersionOutOfDate() {
        return clientVersionOutOfDate;
    }

    /**
     * Define o valor da propriedade clientVersionOutOfDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientVersionOutOfDate(Boolean value) {
        this.clientVersionOutOfDate = value;
    }

    /**
     * Obtém o valor da propriedade cultureVersionOutOfDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCultureVersionOutOfDate() {
        return cultureVersionOutOfDate;
    }

    /**
     * Define o valor da propriedade cultureVersionOutOfDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCultureVersionOutOfDate(Boolean value) {
        this.cultureVersionOutOfDate = value;
    }

    /**
     * Obtém o valor da propriedade customerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerEntityKey() {
        return customerEntityKey;
    }

    /**
     * Define o valor da propriedade customerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerEntityKey(Boolean value) {
        this.customerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lastLoginTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Define o valor da propriedade lastLoginTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastLoginTime(Boolean value) {
        this.lastLoginTime = value;
    }

    /**
     * Obtém o valor da propriedade latestApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatestApplicationVersion() {
        return latestApplicationVersion;
    }

    /**
     * Define o valor da propriedade latestApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatestApplicationVersion(Boolean value) {
        this.latestApplicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade latestCultureVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatestCultureVersion() {
        return latestCultureVersion;
    }

    /**
     * Define o valor da propriedade latestCultureVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatestCultureVersion(Boolean value) {
        this.latestCultureVersion = value;
    }

    /**
     * Obtém o valor da propriedade minimumApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumApplicationVersion() {
        return minimumApplicationVersion;
    }

    /**
     * Define o valor da propriedade minimumApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumApplicationVersion(Boolean value) {
        this.minimumApplicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade userApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserApplicationVersion() {
        return userApplicationVersion;
    }

    /**
     * Define o valor da propriedade userApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserApplicationVersion(Boolean value) {
        this.userApplicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade userCultureVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserCultureVersion() {
        return userCultureVersion;
    }

    /**
     * Define o valor da propriedade userCultureVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserCultureVersion(Boolean value) {
        this.userCultureVersion = value;
    }

    /**
     * Obtém o valor da propriedade userCustomerLinkEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserCustomerLinkEntityKey() {
        return userCustomerLinkEntityKey;
    }

    /**
     * Define o valor da propriedade userCustomerLinkEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserCustomerLinkEntityKey(Boolean value) {
        this.userCustomerLinkEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade userEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserEmailAddress() {
        return userEmailAddress;
    }

    /**
     * Define o valor da propriedade userEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserEmailAddress(Boolean value) {
        this.userEmailAddress = value;
    }

    /**
     * Obtém o valor da propriedade userLoginResultCodeLastLoginResultCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserLoginResultCodeLastLoginResultCode() {
        return userLoginResultCodeLastLoginResultCode;
    }

    /**
     * Define o valor da propriedade userLoginResultCodeLastLoginResultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserLoginResultCodeLastLoginResultCode(Boolean value) {
        this.userLoginResultCodeLastLoginResultCode = value;
    }

    /**
     * Obtém o valor da propriedade userName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserName() {
        return userName;
    }

    /**
     * Define o valor da propriedade userName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserName(Boolean value) {
        this.userName = value;
    }

}
