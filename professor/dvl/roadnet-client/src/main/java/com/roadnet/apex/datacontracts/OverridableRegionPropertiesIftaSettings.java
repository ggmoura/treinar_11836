
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.IftaSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.IftaSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptableFuelEfficiencyMax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AcceptableFuelEfficiencyMin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FederalId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FilingJurisdiction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FilingTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="JurisdictionId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportFilingFrequency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "OverridableRegionProperties.IftaSettings", propOrder = {
    "acceptableFuelEfficiencyMax",
    "acceptableFuelEfficiencyMin",
    "accountNumber",
    "federalId",
    "filingJurisdiction",
    "filingTitle",
    "jurisdictionId",
    "organizationAddress",
    "reportFilingFrequency",
    "useCustomerSettings",
    "useRegionAddress"
})
public class OverridableRegionPropertiesIftaSettings
    extends DataTransferObject
{

    @XmlElement(name = "AcceptableFuelEfficiencyMax")
    protected Boolean acceptableFuelEfficiencyMax;
    @XmlElement(name = "AcceptableFuelEfficiencyMin")
    protected Boolean acceptableFuelEfficiencyMin;
    @XmlElement(name = "AccountNumber")
    protected Boolean accountNumber;
    @XmlElement(name = "FederalId")
    protected Boolean federalId;
    @XmlElement(name = "FilingJurisdiction")
    protected Boolean filingJurisdiction;
    @XmlElement(name = "FilingTitle")
    protected Boolean filingTitle;
    @XmlElement(name = "JurisdictionId")
    protected Boolean jurisdictionId;
    @XmlElement(name = "OrganizationAddress")
    protected Boolean organizationAddress;
    @XmlElement(name = "ReportFilingFrequency")
    protected Boolean reportFilingFrequency;
    @XmlElement(name = "UseCustomerSettings")
    protected Boolean useCustomerSettings;
    @XmlElement(name = "UseRegionAddress")
    protected Boolean useRegionAddress;

    /**
     * Obtém o valor da propriedade acceptableFuelEfficiencyMax.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptableFuelEfficiencyMax() {
        return acceptableFuelEfficiencyMax;
    }

    /**
     * Define o valor da propriedade acceptableFuelEfficiencyMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptableFuelEfficiencyMax(Boolean value) {
        this.acceptableFuelEfficiencyMax = value;
    }

    /**
     * Obtém o valor da propriedade acceptableFuelEfficiencyMin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptableFuelEfficiencyMin() {
        return acceptableFuelEfficiencyMin;
    }

    /**
     * Define o valor da propriedade acceptableFuelEfficiencyMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptableFuelEfficiencyMin(Boolean value) {
        this.acceptableFuelEfficiencyMin = value;
    }

    /**
     * Obtém o valor da propriedade accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountNumber() {
        return accountNumber;
    }

    /**
     * Define o valor da propriedade accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountNumber(Boolean value) {
        this.accountNumber = value;
    }

    /**
     * Obtém o valor da propriedade federalId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederalId() {
        return federalId;
    }

    /**
     * Define o valor da propriedade federalId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederalId(Boolean value) {
        this.federalId = value;
    }

    /**
     * Obtém o valor da propriedade filingJurisdiction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilingJurisdiction() {
        return filingJurisdiction;
    }

    /**
     * Define o valor da propriedade filingJurisdiction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilingJurisdiction(Boolean value) {
        this.filingJurisdiction = value;
    }

    /**
     * Obtém o valor da propriedade filingTitle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilingTitle() {
        return filingTitle;
    }

    /**
     * Define o valor da propriedade filingTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilingTitle(Boolean value) {
        this.filingTitle = value;
    }

    /**
     * Obtém o valor da propriedade jurisdictionId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJurisdictionId() {
        return jurisdictionId;
    }

    /**
     * Define o valor da propriedade jurisdictionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJurisdictionId(Boolean value) {
        this.jurisdictionId = value;
    }

    /**
     * Obtém o valor da propriedade organizationAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationAddress() {
        return organizationAddress;
    }

    /**
     * Define o valor da propriedade organizationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationAddress(Boolean value) {
        this.organizationAddress = value;
    }

    /**
     * Obtém o valor da propriedade reportFilingFrequency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportFilingFrequency() {
        return reportFilingFrequency;
    }

    /**
     * Define o valor da propriedade reportFilingFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportFilingFrequency(Boolean value) {
        this.reportFilingFrequency = value;
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
