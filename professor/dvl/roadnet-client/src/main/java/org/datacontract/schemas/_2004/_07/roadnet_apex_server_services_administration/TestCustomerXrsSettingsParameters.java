
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TestCustomerXrsSettingsParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TestCustomerXrsSettingsParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyLoginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceIntegrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonAdminUserRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublicWebServicesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TopLevelOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseLegacyXrsIntegration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WebPortalFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WebPortalUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WebServicesFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WebServicesPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WebServicesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WebServicesUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestCustomerXrsSettingsParameters", propOrder = {
    "companyId",
    "companyLoginId",
    "complianceIntegrationType",
    "nonAdminUserRole",
    "publicWebServicesUrl",
    "topLevelOrganizationId",
    "useLegacyXrsIntegration",
    "webPortalFacilityEntityKey",
    "webPortalUrl",
    "webServicesFacilityEntityKey",
    "webServicesPassword",
    "webServicesUrl",
    "webServicesUsername"
})
public class TestCustomerXrsSettingsParameters {

    @XmlElementRef(name = "CompanyId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyId;
    @XmlElementRef(name = "CompanyLoginId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyLoginId;
    @XmlElementRef(name = "ComplianceIntegrationType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceIntegrationType;
    @XmlElementRef(name = "NonAdminUserRole", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nonAdminUserRole;
    @XmlElementRef(name = "PublicWebServicesUrl", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> publicWebServicesUrl;
    @XmlElementRef(name = "TopLevelOrganizationId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topLevelOrganizationId;
    @XmlElement(name = "UseLegacyXrsIntegration")
    protected Boolean useLegacyXrsIntegration;
    @XmlElement(name = "WebPortalFacilityEntityKey")
    protected Long webPortalFacilityEntityKey;
    @XmlElementRef(name = "WebPortalUrl", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webPortalUrl;
    @XmlElement(name = "WebServicesFacilityEntityKey")
    protected Long webServicesFacilityEntityKey;
    @XmlElementRef(name = "WebServicesPassword", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webServicesPassword;
    @XmlElementRef(name = "WebServicesUrl", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webServicesUrl;
    @XmlElementRef(name = "WebServicesUsername", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webServicesUsername;

    /**
     * Obtém o valor da propriedade companyId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyId() {
        return companyId;
    }

    /**
     * Define o valor da propriedade companyId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyId(JAXBElement<String> value) {
        this.companyId = value;
    }

    /**
     * Obtém o valor da propriedade companyLoginId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyLoginId() {
        return companyLoginId;
    }

    /**
     * Define o valor da propriedade companyLoginId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyLoginId(JAXBElement<String> value) {
        this.companyLoginId = value;
    }

    /**
     * Obtém o valor da propriedade complianceIntegrationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceIntegrationType() {
        return complianceIntegrationType;
    }

    /**
     * Define o valor da propriedade complianceIntegrationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceIntegrationType(JAXBElement<String> value) {
        this.complianceIntegrationType = value;
    }

    /**
     * Obtém o valor da propriedade nonAdminUserRole.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNonAdminUserRole() {
        return nonAdminUserRole;
    }

    /**
     * Define o valor da propriedade nonAdminUserRole.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNonAdminUserRole(JAXBElement<String> value) {
        this.nonAdminUserRole = value;
    }

    /**
     * Obtém o valor da propriedade publicWebServicesUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublicWebServicesUrl() {
        return publicWebServicesUrl;
    }

    /**
     * Define o valor da propriedade publicWebServicesUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublicWebServicesUrl(JAXBElement<String> value) {
        this.publicWebServicesUrl = value;
    }

    /**
     * Obtém o valor da propriedade topLevelOrganizationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopLevelOrganizationId() {
        return topLevelOrganizationId;
    }

    /**
     * Define o valor da propriedade topLevelOrganizationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopLevelOrganizationId(JAXBElement<String> value) {
        this.topLevelOrganizationId = value;
    }

    /**
     * Obtém o valor da propriedade useLegacyXrsIntegration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLegacyXrsIntegration() {
        return useLegacyXrsIntegration;
    }

    /**
     * Define o valor da propriedade useLegacyXrsIntegration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLegacyXrsIntegration(Boolean value) {
        this.useLegacyXrsIntegration = value;
    }

    /**
     * Obtém o valor da propriedade webPortalFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWebPortalFacilityEntityKey() {
        return webPortalFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade webPortalFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWebPortalFacilityEntityKey(Long value) {
        this.webPortalFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade webPortalUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebPortalUrl() {
        return webPortalUrl;
    }

    /**
     * Define o valor da propriedade webPortalUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebPortalUrl(JAXBElement<String> value) {
        this.webPortalUrl = value;
    }

    /**
     * Obtém o valor da propriedade webServicesFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWebServicesFacilityEntityKey() {
        return webServicesFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade webServicesFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWebServicesFacilityEntityKey(Long value) {
        this.webServicesFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade webServicesPassword.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebServicesPassword() {
        return webServicesPassword;
    }

    /**
     * Define o valor da propriedade webServicesPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebServicesPassword(JAXBElement<String> value) {
        this.webServicesPassword = value;
    }

    /**
     * Obtém o valor da propriedade webServicesUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebServicesUrl() {
        return webServicesUrl;
    }

    /**
     * Define o valor da propriedade webServicesUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebServicesUrl(JAXBElement<String> value) {
        this.webServicesUrl = value;
    }

    /**
     * Obtém o valor da propriedade webServicesUsername.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebServicesUsername() {
        return webServicesUsername;
    }

    /**
     * Define o valor da propriedade webServicesUsername.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebServicesUsername(JAXBElement<String> value) {
        this.webServicesUsername = value;
    }

}
