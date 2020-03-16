
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_controllers.DefaultHostMode;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ClientInstallInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_login.LicenseComplianceViolationInfo;


/**
 * <p>Classe Java de LoginResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LoginResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientInstallInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login}ClientInstallInfo" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceModuleCompanyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceModuleDefaultHostMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Controllers.XrsEntityManager}DefaultHostMode" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceModuleWebPortalUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DaysLeftUntilPasswordExpiration" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="DefaultRoutingServiceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Environment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseComplianceViolationInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts}LicenseComplianceViolationInfo" minOccurs="0"/&gt;
 *         &lt;element name="LoginStatus_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QueryServiceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SystemMessages" type="{http://roadnet.com/apex/DataContracts/}ArrayOfSystemMessageInfo" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://roadnet.com/apex/DataContracts/}User" minOccurs="0"/&gt;
 *         &lt;element name="UserSession" type="{http://roadnet.com/apex/DataContracts/}UserSession" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResult", propOrder = {
    "clientInstallInfo",
    "complianceModuleCompanyId",
    "complianceModuleDefaultHostMode",
    "complianceModuleWebPortalUrl",
    "customerDescription",
    "customerEntityKey",
    "customerIdentifier",
    "daysLeftUntilPasswordExpiration",
    "defaultRoutingServiceUrl",
    "environment",
    "licenseComplianceViolationInfo",
    "loginStatusStatus",
    "queryServiceUrl",
    "systemMessages",
    "user",
    "userSession"
})
public class LoginResult {

    @XmlElementRef(name = "ClientInstallInfo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientInstallInfo> clientInstallInfo;
    @XmlElementRef(name = "ComplianceModuleCompanyId", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceModuleCompanyId;
    @XmlElement(name = "ComplianceModuleDefaultHostMode")
    @XmlSchemaType(name = "string")
    protected DefaultHostMode complianceModuleDefaultHostMode;
    @XmlElementRef(name = "ComplianceModuleWebPortalUrl", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceModuleWebPortalUrl;
    @XmlElementRef(name = "CustomerDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerDescription;
    @XmlElement(name = "CustomerEntityKey")
    protected Long customerEntityKey;
    @XmlElementRef(name = "CustomerIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerIdentifier;
    @XmlElementRef(name = "DaysLeftUntilPasswordExpiration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> daysLeftUntilPasswordExpiration;
    @XmlElementRef(name = "DefaultRoutingServiceUrl", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultRoutingServiceUrl;
    @XmlElementRef(name = "Environment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> environment;
    @XmlElementRef(name = "LicenseComplianceViolationInfo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LicenseComplianceViolationInfo> licenseComplianceViolationInfo;
    @XmlElementRef(name = "LoginStatus_Status", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginStatusStatus;
    @XmlElementRef(name = "QueryServiceUrl", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queryServiceUrl;
    @XmlElementRef(name = "SystemMessages", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSystemMessageInfo> systemMessages;
    @XmlElementRef(name = "User", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<User> user;
    @XmlElementRef(name = "UserSession", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserSession> userSession;

    /**
     * Obtém o valor da propriedade clientInstallInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClientInstallInfo }{@code >}
     *     
     */
    public JAXBElement<ClientInstallInfo> getClientInstallInfo() {
        return clientInstallInfo;
    }

    /**
     * Define o valor da propriedade clientInstallInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientInstallInfo }{@code >}
     *     
     */
    public void setClientInstallInfo(JAXBElement<ClientInstallInfo> value) {
        this.clientInstallInfo = value;
    }

    /**
     * Obtém o valor da propriedade complianceModuleCompanyId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceModuleCompanyId() {
        return complianceModuleCompanyId;
    }

    /**
     * Define o valor da propriedade complianceModuleCompanyId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceModuleCompanyId(JAXBElement<String> value) {
        this.complianceModuleCompanyId = value;
    }

    /**
     * Obtém o valor da propriedade complianceModuleDefaultHostMode.
     * 
     * @return
     *     possible object is
     *     {@link DefaultHostMode }
     *     
     */
    public DefaultHostMode getComplianceModuleDefaultHostMode() {
        return complianceModuleDefaultHostMode;
    }

    /**
     * Define o valor da propriedade complianceModuleDefaultHostMode.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultHostMode }
     *     
     */
    public void setComplianceModuleDefaultHostMode(DefaultHostMode value) {
        this.complianceModuleDefaultHostMode = value;
    }

    /**
     * Obtém o valor da propriedade complianceModuleWebPortalUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceModuleWebPortalUrl() {
        return complianceModuleWebPortalUrl;
    }

    /**
     * Define o valor da propriedade complianceModuleWebPortalUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceModuleWebPortalUrl(JAXBElement<String> value) {
        this.complianceModuleWebPortalUrl = value;
    }

    /**
     * Obtém o valor da propriedade customerDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerDescription() {
        return customerDescription;
    }

    /**
     * Define o valor da propriedade customerDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerDescription(JAXBElement<String> value) {
        this.customerDescription = value;
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
     * Obtém o valor da propriedade customerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Define o valor da propriedade customerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerIdentifier(JAXBElement<String> value) {
        this.customerIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade daysLeftUntilPasswordExpiration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDaysLeftUntilPasswordExpiration() {
        return daysLeftUntilPasswordExpiration;
    }

    /**
     * Define o valor da propriedade daysLeftUntilPasswordExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDaysLeftUntilPasswordExpiration(JAXBElement<Short> value) {
        this.daysLeftUntilPasswordExpiration = value;
    }

    /**
     * Obtém o valor da propriedade defaultRoutingServiceUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultRoutingServiceUrl() {
        return defaultRoutingServiceUrl;
    }

    /**
     * Define o valor da propriedade defaultRoutingServiceUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultRoutingServiceUrl(JAXBElement<String> value) {
        this.defaultRoutingServiceUrl = value;
    }

    /**
     * Obtém o valor da propriedade environment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnvironment() {
        return environment;
    }

    /**
     * Define o valor da propriedade environment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnvironment(JAXBElement<String> value) {
        this.environment = value;
    }

    /**
     * Obtém o valor da propriedade licenseComplianceViolationInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LicenseComplianceViolationInfo }{@code >}
     *     
     */
    public JAXBElement<LicenseComplianceViolationInfo> getLicenseComplianceViolationInfo() {
        return licenseComplianceViolationInfo;
    }

    /**
     * Define o valor da propriedade licenseComplianceViolationInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LicenseComplianceViolationInfo }{@code >}
     *     
     */
    public void setLicenseComplianceViolationInfo(JAXBElement<LicenseComplianceViolationInfo> value) {
        this.licenseComplianceViolationInfo = value;
    }

    /**
     * Obtém o valor da propriedade loginStatusStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginStatusStatus() {
        return loginStatusStatus;
    }

    /**
     * Define o valor da propriedade loginStatusStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginStatusStatus(JAXBElement<String> value) {
        this.loginStatusStatus = value;
    }

    /**
     * Obtém o valor da propriedade queryServiceUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueryServiceUrl() {
        return queryServiceUrl;
    }

    /**
     * Define o valor da propriedade queryServiceUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueryServiceUrl(JAXBElement<String> value) {
        this.queryServiceUrl = value;
    }

    /**
     * Obtém o valor da propriedade systemMessages.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSystemMessageInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSystemMessageInfo> getSystemMessages() {
        return systemMessages;
    }

    /**
     * Define o valor da propriedade systemMessages.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSystemMessageInfo }{@code >}
     *     
     */
    public void setSystemMessages(JAXBElement<ArrayOfSystemMessageInfo> value) {
        this.systemMessages = value;
    }

    /**
     * Obtém o valor da propriedade user.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getUser() {
        return user;
    }

    /**
     * Define o valor da propriedade user.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setUser(JAXBElement<User> value) {
        this.user = value;
    }

    /**
     * Obtém o valor da propriedade userSession.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserSession }{@code >}
     *     
     */
    public JAXBElement<UserSession> getUserSession() {
        return userSession;
    }

    /**
     * Define o valor da propriedade userSession.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserSession }{@code >}
     *     
     */
    public void setUserSession(JAXBElement<UserSession> value) {
        this.userSession = value;
    }

}
