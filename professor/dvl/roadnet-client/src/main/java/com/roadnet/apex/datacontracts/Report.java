
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Report complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Report"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowMultipleRegions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowRawDataExport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CriteriaSettings" type="{http://roadnet.com/apex/DataContracts/}ReportCriteriaSettings" minOccurs="0"/&gt;
 *         &lt;element name="DateRangeCriteriaLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExecuteReportParameters_OutputFormatType_ForcedOutputFormatType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForcedOutputFormatTypeSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsExternalReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSchedulable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParameterDefinitions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfReportParameterDefinition" minOccurs="0"/&gt;
 *         &lt;element name="PurchasableModules_ApplicablePurchasedOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportApplicableRoutePhaseFlags_ApplicableRoutePhases" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportCriteriaType_CriteriaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Report", propOrder = {
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
    "reportCriteriaTypeCriteriaType",
    "reportTypeType"
})
public class Report
    extends BusinessUnitBasedAggregateRootEntity
{

    @XmlElement(name = "AllowMultipleRegions")
    protected Boolean allowMultipleRegions;
    @XmlElement(name = "AllowRawDataExport")
    protected Boolean allowRawDataExport;
    @XmlElementRef(name = "CriteriaSettings", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportCriteriaSettings> criteriaSettings;
    @XmlElementRef(name = "DateRangeCriteriaLimit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dateRangeCriteriaLimit;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "ExecuteReportParameters_OutputFormatType_ForcedOutputFormatType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> executeReportParametersOutputFormatTypeForcedOutputFormatType;
    @XmlElementRef(name = "ExternalUrl", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalUrl;
    @XmlElement(name = "ForcedOutputFormatTypeSpecified")
    protected Boolean forcedOutputFormatTypeSpecified;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "IsExternalReport")
    protected Boolean isExternalReport;
    @XmlElement(name = "IsSchedulable")
    protected Boolean isSchedulable;
    @XmlElementRef(name = "Name", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "ParameterDefinitions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReportParameterDefinition> parameterDefinitions;
    @XmlElementRef(name = "PurchasableModules_ApplicablePurchasedOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchasableModulesApplicablePurchasedOptions;
    @XmlElementRef(name = "ReportApplicableRoutePhaseFlags_ApplicableRoutePhases", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportApplicableRoutePhaseFlagsApplicableRoutePhases;
    @XmlElementRef(name = "ReportCriteriaType_CriteriaType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportCriteriaTypeCriteriaType;
    @XmlElementRef(name = "ReportType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportTypeType;

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
     *     {@link JAXBElement }{@code <}{@link ReportCriteriaSettings }{@code >}
     *     
     */
    public JAXBElement<ReportCriteriaSettings> getCriteriaSettings() {
        return criteriaSettings;
    }

    /**
     * Define o valor da propriedade criteriaSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportCriteriaSettings }{@code >}
     *     
     */
    public void setCriteriaSettings(JAXBElement<ReportCriteriaSettings> value) {
        this.criteriaSettings = value;
    }

    /**
     * Obtém o valor da propriedade dateRangeCriteriaLimit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDateRangeCriteriaLimit() {
        return dateRangeCriteriaLimit;
    }

    /**
     * Define o valor da propriedade dateRangeCriteriaLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDateRangeCriteriaLimit(JAXBElement<Integer> value) {
        this.dateRangeCriteriaLimit = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade executeReportParametersOutputFormatTypeForcedOutputFormatType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExecuteReportParametersOutputFormatTypeForcedOutputFormatType() {
        return executeReportParametersOutputFormatTypeForcedOutputFormatType;
    }

    /**
     * Define o valor da propriedade executeReportParametersOutputFormatTypeForcedOutputFormatType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExecuteReportParametersOutputFormatTypeForcedOutputFormatType(JAXBElement<String> value) {
        this.executeReportParametersOutputFormatTypeForcedOutputFormatType = value;
    }

    /**
     * Obtém o valor da propriedade externalUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalUrl() {
        return externalUrl;
    }

    /**
     * Define o valor da propriedade externalUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalUrl(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade parameterDefinitions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReportParameterDefinition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReportParameterDefinition> getParameterDefinitions() {
        return parameterDefinitions;
    }

    /**
     * Define o valor da propriedade parameterDefinitions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReportParameterDefinition }{@code >}
     *     
     */
    public void setParameterDefinitions(JAXBElement<ArrayOfReportParameterDefinition> value) {
        this.parameterDefinitions = value;
    }

    /**
     * Obtém o valor da propriedade purchasableModulesApplicablePurchasedOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchasableModulesApplicablePurchasedOptions() {
        return purchasableModulesApplicablePurchasedOptions;
    }

    /**
     * Define o valor da propriedade purchasableModulesApplicablePurchasedOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchasableModulesApplicablePurchasedOptions(JAXBElement<String> value) {
        this.purchasableModulesApplicablePurchasedOptions = value;
    }

    /**
     * Obtém o valor da propriedade reportApplicableRoutePhaseFlagsApplicableRoutePhases.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportApplicableRoutePhaseFlagsApplicableRoutePhases() {
        return reportApplicableRoutePhaseFlagsApplicableRoutePhases;
    }

    /**
     * Define o valor da propriedade reportApplicableRoutePhaseFlagsApplicableRoutePhases.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportApplicableRoutePhaseFlagsApplicableRoutePhases(JAXBElement<String> value) {
        this.reportApplicableRoutePhaseFlagsApplicableRoutePhases = value;
    }

    /**
     * Obtém o valor da propriedade reportCriteriaTypeCriteriaType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportCriteriaTypeCriteriaType() {
        return reportCriteriaTypeCriteriaType;
    }

    /**
     * Define o valor da propriedade reportCriteriaTypeCriteriaType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportCriteriaTypeCriteriaType(JAXBElement<String> value) {
        this.reportCriteriaTypeCriteriaType = value;
    }

    /**
     * Obtém o valor da propriedade reportTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportTypeType() {
        return reportTypeType;
    }

    /**
     * Define o valor da propriedade reportTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportTypeType(JAXBElement<String> value) {
        this.reportTypeType = value;
    }

}
