
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WorkerPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustServiceTimePercent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CdlEndorsements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CdlExpiration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CdlIssuingCountryISO3Abbr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CdlIssuingState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CdlNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContactNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Costs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableAutoArriveDepart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableStopResequencing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HelperCosts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDefaultReportingLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDefaultRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEldExemptExplanation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEnableAdverseWeather" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEnableBigDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEnablePersonalConveyance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEnableYardMove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEnabledRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosIsEldExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosMaxConveyanceDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosUseOrganizationSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosYardMoveTerminationOptions_HosYardMoveTermination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTopLevelComplianceEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsXrsDriver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KeyFobIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MedicalExamExpiration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileApplicationType_MobileApplicationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileCredentials" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneGuid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneSystem_OmnitracsOneSystemOfOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerDvirInspectionSetting_DvirInspectionOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsDriverId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsDriverSid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsEnableDriverPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsEnableTimeClock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerPropertyOptions", propOrder = {
    "active",
    "adjustServiceTimePercent",
    "cdlEndorsements",
    "cdlExpiration",
    "cdlIssuingCountryISO3Abbr",
    "cdlIssuingState",
    "cdlNumber",
    "color",
    "contactNumber",
    "costs",
    "currentRegionDescription",
    "currentRegionEntityKey",
    "currentRegionIdentifier",
    "depotEntityKey",
    "enableAutoArriveDepart",
    "enableStopResequencing",
    "equipmentEntityKey",
    "helperCosts",
    "hosDefaultReportingLocationEntityKey",
    "hosDefaultRule",
    "hosEldExemptExplanation",
    "hosEnableAdverseWeather",
    "hosEnableBigDay",
    "hosEnablePersonalConveyance",
    "hosEnableYardMove",
    "hosEnabledRules",
    "hosIsEldExempt",
    "hosMaxConveyanceDistance",
    "hosStatus",
    "hosUseOrganizationSettings",
    "hosYardMoveTerminationOptionsHosYardMoveTermination",
    "identifier",
    "isDeleted",
    "isTopLevelComplianceEntity",
    "isXrsDriver",
    "keyFobIdentifier",
    "medicalExamExpiration",
    "mobileApplicationTypeMobileApplicationType",
    "mobileCredentials",
    "name",
    "omnitracsOneGuid",
    "omnitracsOneSystemOmnitracsOneSystemOfOrigin",
    "workerDvirInspectionSettingDvirInspectionOverride",
    "workerTypeEntityKey",
    "xrsDriverId",
    "xrsDriverSid",
    "xrsEnableDriverPortal",
    "xrsEnableTimeClock"
})
public class WorkerPropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "AdjustServiceTimePercent")
    protected Boolean adjustServiceTimePercent;
    @XmlElement(name = "CdlEndorsements")
    protected Boolean cdlEndorsements;
    @XmlElement(name = "CdlExpiration")
    protected Boolean cdlExpiration;
    @XmlElement(name = "CdlIssuingCountryISO3Abbr")
    protected Boolean cdlIssuingCountryISO3Abbr;
    @XmlElement(name = "CdlIssuingState")
    protected Boolean cdlIssuingState;
    @XmlElement(name = "CdlNumber")
    protected Boolean cdlNumber;
    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "ContactNumber")
    protected Boolean contactNumber;
    @XmlElement(name = "Costs")
    protected Boolean costs;
    @XmlElement(name = "CurrentRegionDescription")
    protected Boolean currentRegionDescription;
    @XmlElement(name = "CurrentRegionEntityKey")
    protected Boolean currentRegionEntityKey;
    @XmlElement(name = "CurrentRegionIdentifier")
    protected Boolean currentRegionIdentifier;
    @XmlElement(name = "DepotEntityKey")
    protected Boolean depotEntityKey;
    @XmlElement(name = "EnableAutoArriveDepart")
    protected Boolean enableAutoArriveDepart;
    @XmlElement(name = "EnableStopResequencing")
    protected Boolean enableStopResequencing;
    @XmlElement(name = "EquipmentEntityKey")
    protected Boolean equipmentEntityKey;
    @XmlElement(name = "HelperCosts")
    protected Boolean helperCosts;
    @XmlElement(name = "HosDefaultReportingLocationEntityKey")
    protected Boolean hosDefaultReportingLocationEntityKey;
    @XmlElement(name = "HosDefaultRule")
    protected Boolean hosDefaultRule;
    @XmlElement(name = "HosEldExemptExplanation")
    protected Boolean hosEldExemptExplanation;
    @XmlElement(name = "HosEnableAdverseWeather")
    protected Boolean hosEnableAdverseWeather;
    @XmlElement(name = "HosEnableBigDay")
    protected Boolean hosEnableBigDay;
    @XmlElement(name = "HosEnablePersonalConveyance")
    protected Boolean hosEnablePersonalConveyance;
    @XmlElement(name = "HosEnableYardMove")
    protected Boolean hosEnableYardMove;
    @XmlElement(name = "HosEnabledRules")
    protected Boolean hosEnabledRules;
    @XmlElement(name = "HosIsEldExempt")
    protected Boolean hosIsEldExempt;
    @XmlElement(name = "HosMaxConveyanceDistance")
    protected Boolean hosMaxConveyanceDistance;
    @XmlElement(name = "HosStatus")
    protected Boolean hosStatus;
    @XmlElement(name = "HosUseOrganizationSettings")
    protected Boolean hosUseOrganizationSettings;
    @XmlElement(name = "HosYardMoveTerminationOptions_HosYardMoveTermination")
    protected Boolean hosYardMoveTerminationOptionsHosYardMoveTermination;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "IsTopLevelComplianceEntity")
    protected Boolean isTopLevelComplianceEntity;
    @XmlElement(name = "IsXrsDriver")
    protected Boolean isXrsDriver;
    @XmlElement(name = "KeyFobIdentifier")
    protected Boolean keyFobIdentifier;
    @XmlElement(name = "MedicalExamExpiration")
    protected Boolean medicalExamExpiration;
    @XmlElement(name = "MobileApplicationType_MobileApplicationType")
    protected Boolean mobileApplicationTypeMobileApplicationType;
    @XmlElement(name = "MobileCredentials")
    protected Boolean mobileCredentials;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "OmnitracsOneGuid")
    protected Boolean omnitracsOneGuid;
    @XmlElement(name = "OmnitracsOneSystem_OmnitracsOneSystemOfOrigin")
    protected Boolean omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    @XmlElement(name = "WorkerDvirInspectionSetting_DvirInspectionOverride")
    protected Boolean workerDvirInspectionSettingDvirInspectionOverride;
    @XmlElement(name = "WorkerTypeEntityKey")
    protected Boolean workerTypeEntityKey;
    @XmlElement(name = "XrsDriverId")
    protected Boolean xrsDriverId;
    @XmlElement(name = "XrsDriverSid")
    protected Boolean xrsDriverSid;
    @XmlElement(name = "XrsEnableDriverPortal")
    protected Boolean xrsEnableDriverPortal;
    @XmlElement(name = "XrsEnableTimeClock")
    protected Boolean xrsEnableTimeClock;

    /**
     * Obtém o valor da propriedade active.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Define o valor da propriedade active.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Obtém o valor da propriedade adjustServiceTimePercent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustServiceTimePercent() {
        return adjustServiceTimePercent;
    }

    /**
     * Define o valor da propriedade adjustServiceTimePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustServiceTimePercent(Boolean value) {
        this.adjustServiceTimePercent = value;
    }

    /**
     * Obtém o valor da propriedade cdlEndorsements.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdlEndorsements() {
        return cdlEndorsements;
    }

    /**
     * Define o valor da propriedade cdlEndorsements.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdlEndorsements(Boolean value) {
        this.cdlEndorsements = value;
    }

    /**
     * Obtém o valor da propriedade cdlExpiration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdlExpiration() {
        return cdlExpiration;
    }

    /**
     * Define o valor da propriedade cdlExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdlExpiration(Boolean value) {
        this.cdlExpiration = value;
    }

    /**
     * Obtém o valor da propriedade cdlIssuingCountryISO3Abbr.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdlIssuingCountryISO3Abbr() {
        return cdlIssuingCountryISO3Abbr;
    }

    /**
     * Define o valor da propriedade cdlIssuingCountryISO3Abbr.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdlIssuingCountryISO3Abbr(Boolean value) {
        this.cdlIssuingCountryISO3Abbr = value;
    }

    /**
     * Obtém o valor da propriedade cdlIssuingState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdlIssuingState() {
        return cdlIssuingState;
    }

    /**
     * Define o valor da propriedade cdlIssuingState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdlIssuingState(Boolean value) {
        this.cdlIssuingState = value;
    }

    /**
     * Obtém o valor da propriedade cdlNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdlNumber() {
        return cdlNumber;
    }

    /**
     * Define o valor da propriedade cdlNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdlNumber(Boolean value) {
        this.cdlNumber = value;
    }

    /**
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColor(Boolean value) {
        this.color = value;
    }

    /**
     * Obtém o valor da propriedade contactNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactNumber() {
        return contactNumber;
    }

    /**
     * Define o valor da propriedade contactNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactNumber(Boolean value) {
        this.contactNumber = value;
    }

    /**
     * Obtém o valor da propriedade costs.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCosts() {
        return costs;
    }

    /**
     * Define o valor da propriedade costs.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCosts(Boolean value) {
        this.costs = value;
    }

    /**
     * Obtém o valor da propriedade currentRegionDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentRegionDescription() {
        return currentRegionDescription;
    }

    /**
     * Define o valor da propriedade currentRegionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentRegionDescription(Boolean value) {
        this.currentRegionDescription = value;
    }

    /**
     * Obtém o valor da propriedade currentRegionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentRegionEntityKey() {
        return currentRegionEntityKey;
    }

    /**
     * Define o valor da propriedade currentRegionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentRegionEntityKey(Boolean value) {
        this.currentRegionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade currentRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentRegionIdentifier() {
        return currentRegionIdentifier;
    }

    /**
     * Define o valor da propriedade currentRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentRegionIdentifier(Boolean value) {
        this.currentRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade depotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotEntityKey() {
        return depotEntityKey;
    }

    /**
     * Define o valor da propriedade depotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotEntityKey(Boolean value) {
        this.depotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade enableAutoArriveDepart.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAutoArriveDepart() {
        return enableAutoArriveDepart;
    }

    /**
     * Define o valor da propriedade enableAutoArriveDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAutoArriveDepart(Boolean value) {
        this.enableAutoArriveDepart = value;
    }

    /**
     * Obtém o valor da propriedade enableStopResequencing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableStopResequencing() {
        return enableStopResequencing;
    }

    /**
     * Define o valor da propriedade enableStopResequencing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableStopResequencing(Boolean value) {
        this.enableStopResequencing = value;
    }

    /**
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentEntityKey(Boolean value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade helperCosts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHelperCosts() {
        return helperCosts;
    }

    /**
     * Define o valor da propriedade helperCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHelperCosts(Boolean value) {
        this.helperCosts = value;
    }

    /**
     * Obtém o valor da propriedade hosDefaultReportingLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDefaultReportingLocationEntityKey() {
        return hosDefaultReportingLocationEntityKey;
    }

    /**
     * Define o valor da propriedade hosDefaultReportingLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDefaultReportingLocationEntityKey(Boolean value) {
        this.hosDefaultReportingLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade hosDefaultRule.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDefaultRule() {
        return hosDefaultRule;
    }

    /**
     * Define o valor da propriedade hosDefaultRule.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDefaultRule(Boolean value) {
        this.hosDefaultRule = value;
    }

    /**
     * Obtém o valor da propriedade hosEldExemptExplanation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosEldExemptExplanation() {
        return hosEldExemptExplanation;
    }

    /**
     * Define o valor da propriedade hosEldExemptExplanation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosEldExemptExplanation(Boolean value) {
        this.hosEldExemptExplanation = value;
    }

    /**
     * Obtém o valor da propriedade hosEnableAdverseWeather.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosEnableAdverseWeather() {
        return hosEnableAdverseWeather;
    }

    /**
     * Define o valor da propriedade hosEnableAdverseWeather.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosEnableAdverseWeather(Boolean value) {
        this.hosEnableAdverseWeather = value;
    }

    /**
     * Obtém o valor da propriedade hosEnableBigDay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosEnableBigDay() {
        return hosEnableBigDay;
    }

    /**
     * Define o valor da propriedade hosEnableBigDay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosEnableBigDay(Boolean value) {
        this.hosEnableBigDay = value;
    }

    /**
     * Obtém o valor da propriedade hosEnablePersonalConveyance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosEnablePersonalConveyance() {
        return hosEnablePersonalConveyance;
    }

    /**
     * Define o valor da propriedade hosEnablePersonalConveyance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosEnablePersonalConveyance(Boolean value) {
        this.hosEnablePersonalConveyance = value;
    }

    /**
     * Obtém o valor da propriedade hosEnableYardMove.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosEnableYardMove() {
        return hosEnableYardMove;
    }

    /**
     * Define o valor da propriedade hosEnableYardMove.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosEnableYardMove(Boolean value) {
        this.hosEnableYardMove = value;
    }

    /**
     * Obtém o valor da propriedade hosEnabledRules.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosEnabledRules() {
        return hosEnabledRules;
    }

    /**
     * Define o valor da propriedade hosEnabledRules.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosEnabledRules(Boolean value) {
        this.hosEnabledRules = value;
    }

    /**
     * Obtém o valor da propriedade hosIsEldExempt.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosIsEldExempt() {
        return hosIsEldExempt;
    }

    /**
     * Define o valor da propriedade hosIsEldExempt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosIsEldExempt(Boolean value) {
        this.hosIsEldExempt = value;
    }

    /**
     * Obtém o valor da propriedade hosMaxConveyanceDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosMaxConveyanceDistance() {
        return hosMaxConveyanceDistance;
    }

    /**
     * Define o valor da propriedade hosMaxConveyanceDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosMaxConveyanceDistance(Boolean value) {
        this.hosMaxConveyanceDistance = value;
    }

    /**
     * Obtém o valor da propriedade hosStatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosStatus() {
        return hosStatus;
    }

    /**
     * Define o valor da propriedade hosStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosStatus(Boolean value) {
        this.hosStatus = value;
    }

    /**
     * Obtém o valor da propriedade hosUseOrganizationSettings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosUseOrganizationSettings() {
        return hosUseOrganizationSettings;
    }

    /**
     * Define o valor da propriedade hosUseOrganizationSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosUseOrganizationSettings(Boolean value) {
        this.hosUseOrganizationSettings = value;
    }

    /**
     * Obtém o valor da propriedade hosYardMoveTerminationOptionsHosYardMoveTermination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosYardMoveTerminationOptionsHosYardMoveTermination() {
        return hosYardMoveTerminationOptionsHosYardMoveTermination;
    }

    /**
     * Define o valor da propriedade hosYardMoveTerminationOptionsHosYardMoveTermination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosYardMoveTerminationOptionsHosYardMoveTermination(Boolean value) {
        this.hosYardMoveTerminationOptionsHosYardMoveTermination = value;
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
     * Obtém o valor da propriedade isTopLevelComplianceEntity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTopLevelComplianceEntity() {
        return isTopLevelComplianceEntity;
    }

    /**
     * Define o valor da propriedade isTopLevelComplianceEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTopLevelComplianceEntity(Boolean value) {
        this.isTopLevelComplianceEntity = value;
    }

    /**
     * Obtém o valor da propriedade isXrsDriver.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsXrsDriver() {
        return isXrsDriver;
    }

    /**
     * Define o valor da propriedade isXrsDriver.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsXrsDriver(Boolean value) {
        this.isXrsDriver = value;
    }

    /**
     * Obtém o valor da propriedade keyFobIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyFobIdentifier() {
        return keyFobIdentifier;
    }

    /**
     * Define o valor da propriedade keyFobIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyFobIdentifier(Boolean value) {
        this.keyFobIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade medicalExamExpiration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMedicalExamExpiration() {
        return medicalExamExpiration;
    }

    /**
     * Define o valor da propriedade medicalExamExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMedicalExamExpiration(Boolean value) {
        this.medicalExamExpiration = value;
    }

    /**
     * Obtém o valor da propriedade mobileApplicationTypeMobileApplicationType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileApplicationTypeMobileApplicationType() {
        return mobileApplicationTypeMobileApplicationType;
    }

    /**
     * Define o valor da propriedade mobileApplicationTypeMobileApplicationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileApplicationTypeMobileApplicationType(Boolean value) {
        this.mobileApplicationTypeMobileApplicationType = value;
    }

    /**
     * Obtém o valor da propriedade mobileCredentials.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileCredentials() {
        return mobileCredentials;
    }

    /**
     * Define o valor da propriedade mobileCredentials.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileCredentials(Boolean value) {
        this.mobileCredentials = value;
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
     * Obtém o valor da propriedade workerDvirInspectionSettingDvirInspectionOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerDvirInspectionSettingDvirInspectionOverride() {
        return workerDvirInspectionSettingDvirInspectionOverride;
    }

    /**
     * Define o valor da propriedade workerDvirInspectionSettingDvirInspectionOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerDvirInspectionSettingDvirInspectionOverride(Boolean value) {
        this.workerDvirInspectionSettingDvirInspectionOverride = value;
    }

    /**
     * Obtém o valor da propriedade workerTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerTypeEntityKey() {
        return workerTypeEntityKey;
    }

    /**
     * Define o valor da propriedade workerTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerTypeEntityKey(Boolean value) {
        this.workerTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade xrsDriverId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsDriverId() {
        return xrsDriverId;
    }

    /**
     * Define o valor da propriedade xrsDriverId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsDriverId(Boolean value) {
        this.xrsDriverId = value;
    }

    /**
     * Obtém o valor da propriedade xrsDriverSid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsDriverSid() {
        return xrsDriverSid;
    }

    /**
     * Define o valor da propriedade xrsDriverSid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsDriverSid(Boolean value) {
        this.xrsDriverSid = value;
    }

    /**
     * Obtém o valor da propriedade xrsEnableDriverPortal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsEnableDriverPortal() {
        return xrsEnableDriverPortal;
    }

    /**
     * Define o valor da propriedade xrsEnableDriverPortal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsEnableDriverPortal(Boolean value) {
        this.xrsEnableDriverPortal = value;
    }

    /**
     * Obtém o valor da propriedade xrsEnableTimeClock.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsEnableTimeClock() {
        return xrsEnableTimeClock;
    }

    /**
     * Define o valor da propriedade xrsEnableTimeClock.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsEnableTimeClock(Boolean value) {
        this.xrsEnableTimeClock = value;
    }

}
