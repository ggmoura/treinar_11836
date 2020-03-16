
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TestCustomerXrsSettingsResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TestCustomerXrsSettingsResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllSettingsValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompanyIdValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompanyLoginIdValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoginCredentialsValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NonAdminUserRoleValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PublicWebServicesUrlValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TopLevelOrganizationIdValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WebPortalUrlValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WebServicesUrlValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestCustomerXrsSettingsResults", propOrder = {
    "allSettingsValid",
    "companyIdValid",
    "companyLoginIdValid",
    "loginCredentialsValid",
    "nonAdminUserRoleValid",
    "publicWebServicesUrlValid",
    "topLevelOrganizationIdValid",
    "webPortalUrlValid",
    "webServicesUrlValid"
})
public class TestCustomerXrsSettingsResults {

    @XmlElementRef(name = "AllSettingsValid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allSettingsValid;
    @XmlElementRef(name = "CompanyIdValid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> companyIdValid;
    @XmlElementRef(name = "CompanyLoginIdValid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> companyLoginIdValid;
    @XmlElementRef(name = "LoginCredentialsValid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> loginCredentialsValid;
    @XmlElementRef(name = "NonAdminUserRoleValid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nonAdminUserRoleValid;
    @XmlElementRef(name = "PublicWebServicesUrlValid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> publicWebServicesUrlValid;
    @XmlElementRef(name = "TopLevelOrganizationIdValid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> topLevelOrganizationIdValid;
    @XmlElementRef(name = "WebPortalUrlValid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> webPortalUrlValid;
    @XmlElementRef(name = "WebServicesUrlValid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> webServicesUrlValid;

    /**
     * Obtém o valor da propriedade allSettingsValid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllSettingsValid() {
        return allSettingsValid;
    }

    /**
     * Define o valor da propriedade allSettingsValid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllSettingsValid(JAXBElement<Boolean> value) {
        this.allSettingsValid = value;
    }

    /**
     * Obtém o valor da propriedade companyIdValid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCompanyIdValid() {
        return companyIdValid;
    }

    /**
     * Define o valor da propriedade companyIdValid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCompanyIdValid(JAXBElement<Boolean> value) {
        this.companyIdValid = value;
    }

    /**
     * Obtém o valor da propriedade companyLoginIdValid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCompanyLoginIdValid() {
        return companyLoginIdValid;
    }

    /**
     * Define o valor da propriedade companyLoginIdValid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCompanyLoginIdValid(JAXBElement<Boolean> value) {
        this.companyLoginIdValid = value;
    }

    /**
     * Obtém o valor da propriedade loginCredentialsValid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLoginCredentialsValid() {
        return loginCredentialsValid;
    }

    /**
     * Define o valor da propriedade loginCredentialsValid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLoginCredentialsValid(JAXBElement<Boolean> value) {
        this.loginCredentialsValid = value;
    }

    /**
     * Obtém o valor da propriedade nonAdminUserRoleValid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNonAdminUserRoleValid() {
        return nonAdminUserRoleValid;
    }

    /**
     * Define o valor da propriedade nonAdminUserRoleValid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNonAdminUserRoleValid(JAXBElement<Boolean> value) {
        this.nonAdminUserRoleValid = value;
    }

    /**
     * Obtém o valor da propriedade publicWebServicesUrlValid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPublicWebServicesUrlValid() {
        return publicWebServicesUrlValid;
    }

    /**
     * Define o valor da propriedade publicWebServicesUrlValid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPublicWebServicesUrlValid(JAXBElement<Boolean> value) {
        this.publicWebServicesUrlValid = value;
    }

    /**
     * Obtém o valor da propriedade topLevelOrganizationIdValid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTopLevelOrganizationIdValid() {
        return topLevelOrganizationIdValid;
    }

    /**
     * Define o valor da propriedade topLevelOrganizationIdValid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTopLevelOrganizationIdValid(JAXBElement<Boolean> value) {
        this.topLevelOrganizationIdValid = value;
    }

    /**
     * Obtém o valor da propriedade webPortalUrlValid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWebPortalUrlValid() {
        return webPortalUrlValid;
    }

    /**
     * Define o valor da propriedade webPortalUrlValid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWebPortalUrlValid(JAXBElement<Boolean> value) {
        this.webPortalUrlValid = value;
    }

    /**
     * Obtém o valor da propriedade webServicesUrlValid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWebServicesUrlValid() {
        return webServicesUrlValid;
    }

    /**
     * Define o valor da propriedade webServicesUrlValid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWebServicesUrlValid(JAXBElement<Boolean> value) {
        this.webServicesUrlValid = value;
    }

}
