
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.IftaSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.IftaSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptableFuelEfficiencyMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AcceptableFuelEfficiencyMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryISO3Abbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FederalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FilingJurisdiction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FilingTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IftaReportFilingFrequencyOptions_ReportFilingFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JurisdictionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationAddress" type="{http://roadnet.com/apex/DataContracts/}Region.OrganizationAddress" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseCustomerSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseRegionAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.IftaSettings", propOrder = {
    "acceptableFuelEfficiencyMax",
    "acceptableFuelEfficiencyMin",
    "accountNumber",
    "address1",
    "address2",
    "city",
    "countryISO3Abbr",
    "federalId",
    "filingJurisdiction",
    "filingTitle",
    "iftaReportFilingFrequencyOptionsReportFilingFrequency",
    "jurisdictionId",
    "organizationAddress",
    "postalCode",
    "state",
    "useCustomerSettings",
    "useRegionAddress"
})
public class RegionIftaSettings
    extends DataTransferObject
{

    @XmlElement(name = "AcceptableFuelEfficiencyMax")
    protected Double acceptableFuelEfficiencyMax;
    @XmlElement(name = "AcceptableFuelEfficiencyMin")
    protected Double acceptableFuelEfficiencyMin;
    @XmlElementRef(name = "AccountNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountNumber;
    @XmlElementRef(name = "Address1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address1;
    @XmlElementRef(name = "Address2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address2;
    @XmlElementRef(name = "City", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "CountryISO3Abbr", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryISO3Abbr;
    @XmlElementRef(name = "FederalId", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> federalId;
    @XmlElementRef(name = "FilingJurisdiction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filingJurisdiction;
    @XmlElementRef(name = "FilingTitle", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filingTitle;
    @XmlElementRef(name = "IftaReportFilingFrequencyOptions_ReportFilingFrequency", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iftaReportFilingFrequencyOptionsReportFilingFrequency;
    @XmlElementRef(name = "JurisdictionId", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jurisdictionId;
    @XmlElementRef(name = "OrganizationAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionOrganizationAddress> organizationAddress;
    @XmlElementRef(name = "PostalCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "State", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElement(name = "UseCustomerSettings")
    protected Boolean useCustomerSettings;
    @XmlElement(name = "UseRegionAddress")
    protected Boolean useRegionAddress;

    /**
     * Obtém o valor da propriedade acceptableFuelEfficiencyMax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAcceptableFuelEfficiencyMax() {
        return acceptableFuelEfficiencyMax;
    }

    /**
     * Define o valor da propriedade acceptableFuelEfficiencyMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAcceptableFuelEfficiencyMax(Double value) {
        this.acceptableFuelEfficiencyMax = value;
    }

    /**
     * Obtém o valor da propriedade acceptableFuelEfficiencyMin.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAcceptableFuelEfficiencyMin() {
        return acceptableFuelEfficiencyMin;
    }

    /**
     * Define o valor da propriedade acceptableFuelEfficiencyMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAcceptableFuelEfficiencyMin(Double value) {
        this.acceptableFuelEfficiencyMin = value;
    }

    /**
     * Obtém o valor da propriedade accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define o valor da propriedade accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountNumber(JAXBElement<String> value) {
        this.accountNumber = value;
    }

    /**
     * Obtém o valor da propriedade address1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress1() {
        return address1;
    }

    /**
     * Define o valor da propriedade address1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress1(JAXBElement<String> value) {
        this.address1 = value;
    }

    /**
     * Obtém o valor da propriedade address2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress2() {
        return address2;
    }

    /**
     * Define o valor da propriedade address2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress2(JAXBElement<String> value) {
        this.address2 = value;
    }

    /**
     * Obtém o valor da propriedade city.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Define o valor da propriedade city.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Obtém o valor da propriedade countryISO3Abbr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryISO3Abbr() {
        return countryISO3Abbr;
    }

    /**
     * Define o valor da propriedade countryISO3Abbr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryISO3Abbr(JAXBElement<String> value) {
        this.countryISO3Abbr = value;
    }

    /**
     * Obtém o valor da propriedade federalId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFederalId() {
        return federalId;
    }

    /**
     * Define o valor da propriedade federalId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFederalId(JAXBElement<String> value) {
        this.federalId = value;
    }

    /**
     * Obtém o valor da propriedade filingJurisdiction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilingJurisdiction() {
        return filingJurisdiction;
    }

    /**
     * Define o valor da propriedade filingJurisdiction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilingJurisdiction(JAXBElement<String> value) {
        this.filingJurisdiction = value;
    }

    /**
     * Obtém o valor da propriedade filingTitle.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilingTitle() {
        return filingTitle;
    }

    /**
     * Define o valor da propriedade filingTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilingTitle(JAXBElement<String> value) {
        this.filingTitle = value;
    }

    /**
     * Obtém o valor da propriedade iftaReportFilingFrequencyOptionsReportFilingFrequency.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIftaReportFilingFrequencyOptionsReportFilingFrequency() {
        return iftaReportFilingFrequencyOptionsReportFilingFrequency;
    }

    /**
     * Define o valor da propriedade iftaReportFilingFrequencyOptionsReportFilingFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIftaReportFilingFrequencyOptionsReportFilingFrequency(JAXBElement<String> value) {
        this.iftaReportFilingFrequencyOptionsReportFilingFrequency = value;
    }

    /**
     * Obtém o valor da propriedade jurisdictionId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJurisdictionId() {
        return jurisdictionId;
    }

    /**
     * Define o valor da propriedade jurisdictionId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJurisdictionId(JAXBElement<String> value) {
        this.jurisdictionId = value;
    }

    /**
     * Obtém o valor da propriedade organizationAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionOrganizationAddress }{@code >}
     *     
     */
    public JAXBElement<RegionOrganizationAddress> getOrganizationAddress() {
        return organizationAddress;
    }

    /**
     * Define o valor da propriedade organizationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionOrganizationAddress }{@code >}
     *     
     */
    public void setOrganizationAddress(JAXBElement<RegionOrganizationAddress> value) {
        this.organizationAddress = value;
    }

    /**
     * Obtém o valor da propriedade postalCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Define o valor da propriedade postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = value;
    }

    /**
     * Obtém o valor da propriedade state.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Define o valor da propriedade state.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Obtém o valor da propriedade useCustomerSettings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCustomerSettings() {
        return useCustomerSettings;
    }

    /**
     * Define o valor da propriedade useCustomerSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCustomerSettings(Boolean value) {
        this.useCustomerSettings = value;
    }

    /**
     * Obtém o valor da propriedade useRegionAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseRegionAddress() {
        return useRegionAddress;
    }

    /**
     * Define o valor da propriedade useRegionAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseRegionAddress(Boolean value) {
        this.useRegionAddress = value;
    }

}
