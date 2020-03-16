
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de UserPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UserPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GroupEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InvalidLoginCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOpportunitySubscriber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSingleSignOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MustChangePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NeverExpirePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneGuid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneSystem_OmnitracsOneSystemOfOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoleAssignments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Settings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SettingsOptions" type="{http://roadnet.com/apex/DataContracts/}UserSettingsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="SharingUserGroupEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "UserPropertyOptions", propOrder = {
    "emailAddress",
    "groupEntityKeys",
    "invalidLoginCount",
    "isDeleted",
    "isDisabled",
    "isLocked",
    "isOpportunitySubscriber",
    "isSingleSignOn",
    "lastLoginTime",
    "mustChangePassword",
    "name",
    "neverExpirePassword",
    "omnitracsOneGuid",
    "omnitracsOneSystemOmnitracsOneSystemOfOrigin",
    "password",
    "roleAssignments",
    "settings",
    "settingsOptions",
    "sharingUserGroupEntityKeys",
    "suppressNewUserEmail",
    "userTypeType"
})
public class UserPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "EmailAddress")
    protected Boolean emailAddress;
    @XmlElement(name = "GroupEntityKeys")
    protected Boolean groupEntityKeys;
    @XmlElement(name = "InvalidLoginCount")
    protected Boolean invalidLoginCount;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "IsDisabled")
    protected Boolean isDisabled;
    @XmlElement(name = "IsLocked")
    protected Boolean isLocked;
    @XmlElement(name = "IsOpportunitySubscriber")
    protected Boolean isOpportunitySubscriber;
    @XmlElement(name = "IsSingleSignOn")
    protected Boolean isSingleSignOn;
    @XmlElement(name = "LastLoginTime")
    protected Boolean lastLoginTime;
    @XmlElement(name = "MustChangePassword")
    protected Boolean mustChangePassword;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "NeverExpirePassword")
    protected Boolean neverExpirePassword;
    @XmlElement(name = "OmnitracsOneGuid")
    protected Boolean omnitracsOneGuid;
    @XmlElement(name = "OmnitracsOneSystem_OmnitracsOneSystemOfOrigin")
    protected Boolean omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    @XmlElement(name = "Password")
    protected Boolean password;
    @XmlElement(name = "RoleAssignments")
    protected Boolean roleAssignments;
    @XmlElement(name = "Settings")
    protected Boolean settings;
    @XmlElementRef(name = "SettingsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserSettingsPropertyOptions> settingsOptions;
    @XmlElement(name = "SharingUserGroupEntityKeys")
    protected Boolean sharingUserGroupEntityKeys;
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
     * Obtém o valor da propriedade groupEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupEntityKeys() {
        return groupEntityKeys;
    }

    /**
     * Define o valor da propriedade groupEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupEntityKeys(Boolean value) {
        this.groupEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade invalidLoginCount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvalidLoginCount() {
        return invalidLoginCount;
    }

    /**
     * Define o valor da propriedade invalidLoginCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvalidLoginCount(Boolean value) {
        this.invalidLoginCount = value;
    }

    /**
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
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
     * Obtém o valor da propriedade isLocked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Define o valor da propriedade isLocked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
    }

    /**
     * Obtém o valor da propriedade isOpportunitySubscriber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOpportunitySubscriber() {
        return isOpportunitySubscriber;
    }

    /**
     * Define o valor da propriedade isOpportunitySubscriber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOpportunitySubscriber(Boolean value) {
        this.isOpportunitySubscriber = value;
    }

    /**
     * Obtém o valor da propriedade isSingleSignOn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSingleSignOn() {
        return isSingleSignOn;
    }

    /**
     * Define o valor da propriedade isSingleSignOn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSingleSignOn(Boolean value) {
        this.isSingleSignOn = value;
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
     * Obtém o valor da propriedade omnitracsOneSystemOmnitracsOneSystemOfOrigin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsOneSystemOmnitracsOneSystemOfOrigin() {
        return omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    }

    /**
     * Define o valor da propriedade omnitracsOneSystemOmnitracsOneSystemOfOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsOneSystemOmnitracsOneSystemOfOrigin(Boolean value) {
        this.omnitracsOneSystemOmnitracsOneSystemOfOrigin = value;
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
     * Obtém o valor da propriedade roleAssignments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoleAssignments() {
        return roleAssignments;
    }

    /**
     * Define o valor da propriedade roleAssignments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoleAssignments(Boolean value) {
        this.roleAssignments = value;
    }

    /**
     * Obtém o valor da propriedade settings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSettings() {
        return settings;
    }

    /**
     * Define o valor da propriedade settings.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSettings(Boolean value) {
        this.settings = value;
    }

    /**
     * Obtém o valor da propriedade settingsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserSettingsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<UserSettingsPropertyOptions> getSettingsOptions() {
        return settingsOptions;
    }

    /**
     * Define o valor da propriedade settingsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserSettingsPropertyOptions }{@code >}
     *     
     */
    public void setSettingsOptions(JAXBElement<UserSettingsPropertyOptions> value) {
        this.settingsOptions = value;
    }

    /**
     * Obtém o valor da propriedade sharingUserGroupEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharingUserGroupEntityKeys() {
        return sharingUserGroupEntityKeys;
    }

    /**
     * Define o valor da propriedade sharingUserGroupEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharingUserGroupEntityKeys(Boolean value) {
        this.sharingUserGroupEntityKeys = value;
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
