
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReportPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowMultipleRegions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowRawDataExport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CriteriaSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DateRangeCriteriaLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExecuteReportParameters_OutputFormatType_ForcedOutputFormatType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExternalUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForcedOutputFormatTypeSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsExternalReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSchedulable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParameterDefinitions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PurchasableModules_ApplicablePurchasedOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportApplicableRoutePhaseFlags_ApplicableRoutePhases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportApplicableRoutePhaseFlags_ApplicableRoutePhasesSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportCriteriaType_CriteriaType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportPropertyOptions", propOrder = {
    "allowMultipleRegions",
    "allowRawDataExport",
    "criteriaSettings",
    "dateRangeCriteriaLimit",
    "description",
    "executeReportParametersOutputFormatTypeForcedOutputFormatType",
    "externalUrl",
    "forcedOutputFormatTypeSpecified",
    "identifier",
    "isActive",
    "isExternalReport",
    "isSchedulable",
    "name",
    "parameterDefinitions",
    "purchasableModulesApplicablePurchasedOptions",
    "reportApplicableRoutePhaseFlagsApplicableRoutePhases",
    "reportApplicableRoutePhaseFlagsApplicableRoutePhasesSpecified",
    "reportCriteriaTypeCriteriaType",
    "reportTypeType"
})
public class ReportPropertyOptions
    extends BusinessUnitBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "AllowMultipleRegions")
    protected Boolean allowMultipleRegions;
    @XmlElement(name = "AllowRawDataExport")
    protected Boolean allowRawDataExport;
    @XmlElement(name = "CriteriaSettings")
    protected Boolean criteriaSettings;
    @XmlElement(name = "DateRangeCriteriaLimit")
    protected Boolean dateRangeCriteriaLimit;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "ExecuteReportParameters_OutputFormatType_ForcedOutputFormatType")
    protected Boolean executeReportParametersOutputFormatTypeForcedOutputFormatType;
    @XmlElement(name = "ExternalUrl")
    protected Boolean externalUrl;
    @XmlElement(name = "ForcedOutputFormatTypeSpecified")
    protected Boolean forcedOutputFormatTypeSpecified;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "IsExternalReport")
    protected Boolean isExternalReport;
    @XmlElement(name = "IsSchedulable")
    protected Boolean isSchedulable;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "ParameterDefinitions")
    protected Boolean parameterDefinitions;
    @XmlElement(name = "PurchasableModules_ApplicablePurchasedOptions")
    protected Boolean purchasableModulesApplicablePurchasedOptions;
    @XmlElement(name = "ReportApplicableRoutePhaseFlags_ApplicableRoutePhases")
    protected Boolean reportApplicableRoutePhaseFlagsApplicableRoutePhases;
    @XmlElement(name = "ReportApplicableRoutePhaseFlags_ApplicableRoutePhasesSpecified")
    protected Boolean reportApplicableRoutePhaseFlagsApplicableRoutePhasesSpecified;
    @XmlElement(name = "ReportCriteriaType_CriteriaType")
    protected Boolean reportCriteriaTypeCriteriaType;
    @XmlElement(name = "ReportType_Type")
    protected Boolean reportTypeType;

    /**
     * Obtém o valor da propriedade allowMultipleRegions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMultipleRegions() {
        return allowMultipleRegions;
    }

    /**
     * Define o valor da propriedade allowMultipleRegions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMultipleRegions(Boolean value) {
        this.allowMultipleRegions = value;
    }

    /**
     * Obtém o valor da propriedade allowRawDataExport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowRawDataExport() {
        return allowRawDataExport;
    }

    /**
     * Define o valor da propriedade allowRawDataExport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowRawDataExport(Boolean value) {
        this.allowRawDataExport = value;
    }

    /**
     * Obtém o valor da propriedade criteriaSettings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCriteriaSettings() {
        return criteriaSettings;
    }

    /**
     * Define o valor da propriedade criteriaSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCriteriaSettings(Boolean value) {
        this.criteriaSettings = value;
    }

    /**
     * Obtém o valor da propriedade dateRangeCriteriaLimit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateRangeCriteriaLimit() {
        return dateRangeCriteriaLimit;
    }

    /**
     * Define o valor da propriedade dateRangeCriteriaLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateRangeCriteriaLimit(Boolean value) {
        this.dateRangeCriteriaLimit = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade executeReportParametersOutputFormatTypeForcedOutputFormatType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExecuteReportParametersOutputFormatTypeForcedOutputFormatType() {
        return executeReportParametersOutputFormatTypeForcedOutputFormatType;
    }

    /**
     * Define o valor da propriedade executeReportParametersOutputFormatTypeForcedOutputFormatType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExecuteReportParametersOutputFormatTypeForcedOutputFormatType(Boolean value) {
        this.executeReportParametersOutputFormatTypeForcedOutputFormatType = value;
    }

    /**
     * Obtém o valor da propriedade externalUrl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalUrl() {
        return externalUrl;
    }

    /**
     * Define o valor da propriedade externalUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalUrl(Boolean value) {
        this.externalUrl = value;
    }

    /**
     * Obtém o valor da propriedade forcedOutputFormatTypeSpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcedOutputFormatTypeSpecified() {
        return forcedOutputFormatTypeSpecified;
    }

    /**
     * Define o valor da propriedade forcedOutputFormatTypeSpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcedOutputFormatTypeSpecified(Boolean value) {
        this.forcedOutputFormatTypeSpecified = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade isActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Define o valor da propriedade isActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Obtém o valor da propriedade isExternalReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExternalReport() {
        return isExternalReport;
    }

    /**
     * Define o valor da propriedade isExternalReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternalReport(Boolean value) {
        this.isExternalReport = value;
    }

    /**
     * Obtém o valor da propriedade isSchedulable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSchedulable() {
        return isSchedulable;
    }

    /**
     * Define o valor da propriedade isSchedulable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSchedulable(Boolean value) {
        this.isSchedulable = value;
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
     * Obtém o valor da propriedade parameterDefinitions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParameterDefinitions() {
        return parameterDefinitions;
    }

    /**
     * Define o valor da propriedade parameterDefinitions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParameterDefinitions(Boolean value) {
        this.parameterDefinitions = value;
    }

    /**
     * Obtém o valor da propriedade purchasableModulesApplicablePurchasedOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchasableModulesApplicablePurchasedOptions() {
        return purchasableModulesApplicablePurchasedOptions;
    }

    /**
     * Define o valor da propriedade purchasableModulesApplicablePurchasedOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchasableModulesApplicablePurchasedOptions(Boolean value) {
        this.purchasableModulesApplicablePurchasedOptions = value;
    }

    /**
     * Obtém o valor da propriedade reportApplicableRoutePhaseFlagsApplicableRoutePhases.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportApplicableRoutePhaseFlagsApplicableRoutePhases() {
        return reportApplicableRoutePhaseFlagsApplicableRoutePhases;
    }

    /**
     * Define o valor da propriedade reportApplicableRoutePhaseFlagsApplicableRoutePhases.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportApplicableRoutePhaseFlagsApplicableRoutePhases(Boolean value) {
        this.reportApplicableRoutePhaseFlagsApplicableRoutePhases = value;
    }

    /**
     * Obtém o valor da propriedade reportApplicableRoutePhaseFlagsApplicableRoutePhasesSpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportApplicableRoutePhaseFlagsApplicableRoutePhasesSpecified() {
        return reportApplicableRoutePhaseFlagsApplicableRoutePhasesSpecified;
    }

    /**
     * Define o valor da propriedade reportApplicableRoutePhaseFlagsApplicableRoutePhasesSpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportApplicableRoutePhaseFlagsApplicableRoutePhasesSpecified(Boolean value) {
        this.reportApplicableRoutePhaseFlagsApplicableRoutePhasesSpecified = value;
    }

    /**
     * Obtém o valor da propriedade reportCriteriaTypeCriteriaType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportCriteriaTypeCriteriaType() {
        return reportCriteriaTypeCriteriaType;
    }

    /**
     * Define o valor da propriedade reportCriteriaTypeCriteriaType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportCriteriaTypeCriteriaType(Boolean value) {
        this.reportCriteriaTypeCriteriaType = value;
    }

    /**
     * Obtém o valor da propriedade reportTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportTypeType() {
        return reportTypeType;
    }

    /**
     * Define o valor da propriedade reportTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportTypeType(Boolean value) {
        this.reportTypeType = value;
    }

}
