
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de AdminUserPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AdminUserPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSupportOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MustChangePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NeverExpirePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneGuid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PartnerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Partner_Permissions_PartnerPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SuppressNewUserEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdminUserPropertyOptions", propOrder = {
    "emailAddress",
    "isDisabled",
    "isSupportOnly",
    "mustChangePassword",
    "name",
    "neverExpirePassword",
    "omnitracsOneGuid",
    "partnerEntityKey",
    "partnerPermissionsPartnerPermissions",
    "password",
    "suppressNewUserEmail",
    "userTypeType"
})
public class AdminUserPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "EmailAddress")
    protected Boolean emailAddress;
    @XmlElement(name = "IsDisabled")
    protected Boolean isDisabled;
    @XmlElement(name = "IsSupportOnly")
    protected Boolean isSupportOnly;
    @XmlElement(name = "MustChangePassword")
    protected Boolean mustChangePassword;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "NeverExpirePassword")
    protected Boolean neverExpirePassword;
    @XmlElement(name = "OmnitracsOneGuid")
    protected Boolean omnitracsOneGuid;
    @XmlElement(name = "PartnerEntityKey")
    protected Boolean partnerEntityKey;
    @XmlElement(name = "Partner_Permissions_PartnerPermissions")
    protected Boolean partnerPermissionsPartnerPermissions;
    @XmlElement(name = "Password")
    protected Boolean password;
    @XmlElement(name = "SuppressNewUserEmail")
    protected Boolean suppressNewUserEmail;
    @XmlElement(name = "UserType_Type")
    protected Boolean userTypeType;

    /**
     * Obtém o valor da propriedade emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailAddress() {
        return emailAddress;
    }

    /**
     * Define o valor da propriedade emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailAddress(Boolean value) {
        this.emailAddress = value;
    }

    /**
     * Obtém o valor da propriedade isDisabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisabled() {
        return isDisabled;
    }

    /**
     * Define o valor da propriedade isDisabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisabled(Boolean value) {
        this.isDisabled = value;
    }

    /**
     * Obtém o valor da propriedade isSupportOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupportOnly() {
        return isSupportOnly;
    }

    /**
     * Define o valor da propriedade isSupportOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupportOnly(Boolean value) {
        this.isSupportOnly = value;
    }

    /**
     * Obtém o valor da propriedade mustChangePassword.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustChangePassword() {
        return mustChangePassword;
    }

    /**
     * Define o valor da propriedade mustChangePassword.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustChangePassword(Boolean value) {
        this.mustChangePassword = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade neverExpirePassword.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeverExpirePassword() {
        return neverExpirePassword;
    }

    /**
     * Define o valor da propriedade neverExpirePassword.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeverExpirePassword(Boolean value) {
        this.neverExpirePassword = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneGuid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsOneGuid() {
        return omnitracsOneGuid;
    }

    /**
     * Define o valor da propriedade omnitracsOneGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsOneGuid(Boolean value) {
        this.omnitracsOneGuid = value;
    }

    /**
     * Obtém o valor da propriedade partnerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartnerEntityKey() {
        return partnerEntityKey;
    }

    /**
     * Define o valor da propriedade partnerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartnerEntityKey(Boolean value) {
        this.partnerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade partnerPermissionsPartnerPermissions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartnerPermissionsPartnerPermissions() {
        return partnerPermissionsPartnerPermissions;
    }

    /**
     * Define o valor da propriedade partnerPermissionsPartnerPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartnerPermissionsPartnerPermissions(Boolean value) {
        this.partnerPermissionsPartnerPermissions = value;
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
     * Obtém o valor da propriedade suppressNewUserEmail.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressNewUserEmail() {
        return suppressNewUserEmail;
    }

    /**
     * Define o valor da propriedade suppressNewUserEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressNewUserEmail(Boolean value) {
        this.suppressNewUserEmail = value;
    }

    /**
     * Obtém o valor da propriedade userTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserTypeType() {
        return userTypeType;
    }

    /**
     * Define o valor da propriedade userTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserTypeType(Boolean value) {
        this.userTypeType = value;
    }

}
