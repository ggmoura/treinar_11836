
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de User complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="InvalidLoginCount" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOpportunitySubscriber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSingleSignOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MustChangePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="NeverExpirePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneSystem_OmnitracsOneSystemOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoleAssignments" type="{http://roadnet.com/apex/DataContracts/}ArrayOfUserRoleAssignment" minOccurs="0"/&gt;
 *         &lt;element name="Settings" type="{http://roadnet.com/apex/DataContracts/}UserSettings" minOccurs="0"/&gt;
 *         &lt;element name="SharingUserGroupEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="SuppressNewUserEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
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
    "sharingUserGroupEntityKeys",
    "suppressNewUserEmail",
    "userTypeType"
})
public class User
    extends AggregateRootEntity
{

    @XmlElementRef(name = "EmailAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "GroupEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> groupEntityKeys;
    @XmlElement(name = "InvalidLoginCount")
    protected Short invalidLoginCount;
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
    @XmlElementRef(name = "LastLoginTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastLoginTime;
    @XmlElement(name = "MustChangePassword")
    protected Boolean mustChangePassword;
    @XmlElementRef(name = "Name", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> name;
    @XmlElement(name = "NeverExpirePassword")
    protected Boolean neverExpirePassword;
    @XmlElementRef(name = "OmnitracsOneGuid", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omnitracsOneGuid;
    @XmlElementRef(name = "OmnitracsOneSystem_OmnitracsOneSystemOfOrigin", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    @XmlElementRef(name = "Password", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "RoleAssignments", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUserRoleAssignment> roleAssignments;
    @XmlElementRef(name = "Settings", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserSettings> settings;
    @XmlElementRef(name = "SharingUserGroupEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> sharingUserGroupEntityKeys;
    @XmlElement(name = "SuppressNewUserEmail")
    protected Boolean suppressNewUserEmail;
    @XmlElementRef(name = "UserType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userTypeType;

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
     * Obtém o valor da propriedade groupEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getGroupEntityKeys() {
        return groupEntityKeys;
    }

    /**
     * Define o valor da propriedade groupEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setGroupEntityKeys(JAXBElement<ArrayOflong> value) {
        this.groupEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade invalidLoginCount.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getInvalidLoginCount() {
        return invalidLoginCount;
    }

    /**
     * Define o valor da propriedade invalidLoginCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setInvalidLoginCount(Short value) {
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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Define o valor da propriedade lastLoginTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastLoginTime(JAXBElement<XMLGregorianCalendar> value) {
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
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setName(JAXBElement<PersonName> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOmnitracsOneGuid() {
        return omnitracsOneGuid;
    }

    /**
     * Define o valor da propriedade omnitracsOneGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOmnitracsOneGuid(JAXBElement<String> value) {
        this.omnitracsOneGuid = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneSystemOmnitracsOneSystemOfOrigin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOmnitracsOneSystemOmnitracsOneSystemOfOrigin() {
        return omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    }

    /**
     * Define o valor da propriedade omnitracsOneSystemOmnitracsOneSystemOfOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOmnitracsOneSystemOmnitracsOneSystemOfOrigin(JAXBElement<String> value) {
        this.omnitracsOneSystemOmnitracsOneSystemOfOrigin = value;
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
     * Obtém o valor da propriedade roleAssignments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserRoleAssignment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUserRoleAssignment> getRoleAssignments() {
        return roleAssignments;
    }

    /**
     * Define o valor da propriedade roleAssignments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserRoleAssignment }{@code >}
     *     
     */
    public void setRoleAssignments(JAXBElement<ArrayOfUserRoleAssignment> value) {
        this.roleAssignments = value;
    }

    /**
     * Obtém o valor da propriedade settings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserSettings }{@code >}
     *     
     */
    public JAXBElement<UserSettings> getSettings() {
        return settings;
    }

    /**
     * Define o valor da propriedade settings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserSettings }{@code >}
     *     
     */
    public void setSettings(JAXBElement<UserSettings> value) {
        this.settings = value;
    }

    /**
     * Obtém o valor da propriedade sharingUserGroupEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getSharingUserGroupEntityKeys() {
        return sharingUserGroupEntityKeys;
    }

    /**
     * Define o valor da propriedade sharingUserGroupEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setSharingUserGroupEntityKeys(JAXBElement<ArrayOflong> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserTypeType() {
        return userTypeType;
    }

    /**
     * Define o valor da propriedade userTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserTypeType(JAXBElement<String> value) {
        this.userTypeType = value;
    }

}
