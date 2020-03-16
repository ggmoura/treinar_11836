
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.HosSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.HosSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowAobrdLogEditing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowCoDriverUseWhileVehicleInMotion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowCoDrivers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowDriverToChangeRuleSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowManualTimeAdjustmentOfDutyStatusChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoSelectShortHaul" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutomaticBigResetSelection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultReportingLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DriverDutyStatusNumberOfComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DriverDutyStatusPrefill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableAdverseWeather" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableBigDayException" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnablePersonalConveyance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableShortHaulExemption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableYardMove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnabledRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FleetName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HostEditorPrefill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InMotionMobileWarningTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LowOnDutyFirstWarnTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LowOnDutySecondWarnTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxConveyanceDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileEditorPrefill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileRemarksPrefill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrefillComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PromptForOffDutyAtLogout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PromptForOnDutyAtLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShippingIdMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortHaulWarnDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeToTriggerDToOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UvaMilesThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="YardMoveTermination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.HosSettings", propOrder = {
    "allowAobrdLogEditing",
    "allowCoDriverUseWhileVehicleInMotion",
    "allowCoDrivers",
    "allowDriverToChangeRuleSet",
    "allowManualTimeAdjustmentOfDutyStatusChanges",
    "autoSelectShortHaul",
    "automaticBigResetSelection",
    "defaultReportingLocation",
    "defaultRule",
    "driverDutyStatusNumberOfComments",
    "driverDutyStatusPrefill",
    "enableAdverseWeather",
    "enableBigDayException",
    "enablePersonalConveyance",
    "enableShortHaulExemption",
    "enableYardMove",
    "enabledRules",
    "fleetName",
    "hostEditorPrefill",
    "inMotionMobileWarningTime",
    "lowOnDutyFirstWarnTime",
    "lowOnDutySecondWarnTime",
    "maxConveyanceDistance",
    "mobileEditorPrefill",
    "mobileRemarksPrefill",
    "organizationAddress",
    "prefillComments",
    "promptForOffDutyAtLogout",
    "promptForOnDutyAtLogin",
    "shippingIdMethod",
    "shortHaulWarnDistance",
    "timeToTriggerDToOn",
    "uvaMilesThreshold",
    "yardMoveTermination"
})
public class OverridableRegionPropertiesHosSettings
    extends DataTransferObject
{

    @XmlElement(name = "AllowAobrdLogEditing")
    protected Boolean allowAobrdLogEditing;
    @XmlElement(name = "AllowCoDriverUseWhileVehicleInMotion")
    protected Boolean allowCoDriverUseWhileVehicleInMotion;
    @XmlElement(name = "AllowCoDrivers")
    protected Boolean allowCoDrivers;
    @XmlElement(name = "AllowDriverToChangeRuleSet")
    protected Boolean allowDriverToChangeRuleSet;
    @XmlElement(name = "AllowManualTimeAdjustmentOfDutyStatusChanges")
    protected Boolean allowManualTimeAdjustmentOfDutyStatusChanges;
    @XmlElement(name = "AutoSelectShortHaul")
    protected Boolean autoSelectShortHaul;
    @XmlElement(name = "AutomaticBigResetSelection")
    protected Boolean automaticBigResetSelection;
    @XmlElement(name = "DefaultReportingLocation")
    protected Boolean defaultReportingLocation;
    @XmlElement(name = "DefaultRule")
    protected Boolean defaultRule;
    @XmlElement(name = "DriverDutyStatusNumberOfComments")
    protected Boolean driverDutyStatusNumberOfComments;
    @XmlElement(name = "DriverDutyStatusPrefill")
    protected Boolean driverDutyStatusPrefill;
    @XmlElement(name = "EnableAdverseWeather")
    protected Boolean enableAdverseWeather;
    @XmlElement(name = "EnableBigDayException")
    protected Boolean enableBigDayException;
    @XmlElement(name = "EnablePersonalConveyance")
    protected Boolean enablePersonalConveyance;
    @XmlElement(name = "EnableShortHaulExemption")
    protected Boolean enableShortHaulExemption;
    @XmlElement(name = "EnableYardMove")
    protected Boolean enableYardMove;
    @XmlElement(name = "EnabledRules")
    protected Boolean enabledRules;
    @XmlElement(name = "FleetName")
    protected Boolean fleetName;
    @XmlElement(name = "HostEditorPrefill")
    protected Boolean hostEditorPrefill;
    @XmlElement(name = "InMotionMobileWarningTime")
    protected Boolean inMotionMobileWarningTime;
    @XmlElement(name = "LowOnDutyFirstWarnTime")
    protected Boolean lowOnDutyFirstWarnTime;
    @XmlElement(name = "LowOnDutySecondWarnTime")
    protected Boolean lowOnDutySecondWarnTime;
    @XmlElement(name = "MaxConveyanceDistance")
    protected Boolean maxConveyanceDistance;
    @XmlElement(name = "MobileEditorPrefill")
    protected Boolean mobileEditorPrefill;
    @XmlElement(name = "MobileRemarksPrefill")
    protected Boolean mobileRemarksPrefill;
    @XmlElement(name = "OrganizationAddress")
    protected Boolean organizationAddress;
    @XmlElement(name = "PrefillComments")
    protected Boolean prefillComments;
    @XmlElement(name = "PromptForOffDutyAtLogout")
    protected Boolean promptForOffDutyAtLogout;
    @XmlElement(name = "PromptForOnDutyAtLogin")
    protected Boolean promptForOnDutyAtLogin;
    @XmlElement(name = "ShippingIdMethod")
    protected Boolean shippingIdMethod;
    @XmlElement(name = "ShortHaulWarnDistance")
    protected Boolean shortHaulWarnDistance;
    @XmlElement(name = "TimeToTriggerDToOn")
    protected Boolean timeToTriggerDToOn;
    @XmlElement(name = "UvaMilesThreshold")
    protected Boolean uvaMilesThreshold;
    @XmlElement(name = "YardMoveTermination")
    protected Boolean yardMoveTermination;

    /**
     * Obtém o valor da propriedade allowAobrdLogEditing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAobrdLogEditing() {
        return allowAobrdLogEditing;
    }

    /**
     * Define o valor da propriedade allowAobrdLogEditing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAobrdLogEditing(Boolean value) {
        this.allowAobrdLogEditing = value;
    }

    /**
     * Obtém o valor da propriedade allowCoDriverUseWhileVehicleInMotion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCoDriverUseWhileVehicleInMotion() {
        return allowCoDriverUseWhileVehicleInMotion;
    }

    /**
     * Define o valor da propriedade allowCoDriverUseWhileVehicleInMotion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCoDriverUseWhileVehicleInMotion(Boolean value) {
        this.allowCoDriverUseWhileVehicleInMotion = value;
    }

    /**
     * Obtém o valor da propriedade allowCoDrivers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCoDrivers() {
        return allowCoDrivers;
    }

    /**
     * Define o valor da propriedade allowCoDrivers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCoDrivers(Boolean value) {
        this.allowCoDrivers = value;
    }

    /**
     * Obtém o valor da propriedade allowDriverToChangeRuleSet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDriverToChangeRuleSet() {
        return allowDriverToChangeRuleSet;
    }

    /**
     * Define o valor da propriedade allowDriverToChangeRuleSet.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDriverToChangeRuleSet(Boolean value) {
        this.allowDriverToChangeRuleSet = value;
    }

    /**
     * Obtém o valor da propriedade allowManualTimeAdjustmentOfDutyStatusChanges.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowManualTimeAdjustmentOfDutyStatusChanges() {
        return allowManualTimeAdjustmentOfDutyStatusChanges;
    }

    /**
     * Define o valor da propriedade allowManualTimeAdjustmentOfDutyStatusChanges.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowManualTimeAdjustmentOfDutyStatusChanges(Boolean value) {
        this.allowManualTimeAdjustmentOfDutyStatusChanges = value;
    }

    /**
     * Obtém o valor da propriedade autoSelectShortHaul.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoSelectShortHaul() {
        return autoSelectShortHaul;
    }

    /**
     * Define o valor da propriedade autoSelectShortHaul.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSelectShortHaul(Boolean value) {
        this.autoSelectShortHaul = value;
    }

    /**
     * Obtém o valor da propriedade automaticBigResetSelection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticBigResetSelection() {
        return automaticBigResetSelection;
    }

    /**
     * Define o valor da propriedade automaticBigResetSelection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticBigResetSelection(Boolean value) {
        this.automaticBigResetSelection = value;
    }

    /**
     * Obtém o valor da propriedade defaultReportingLocation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultReportingLocation() {
        return defaultReportingLocation;
    }

    /**
     * Define o valor da propriedade defaultReportingLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultReportingLocation(Boolean value) {
        this.defaultReportingLocation = value;
    }

    /**
     * Obtém o valor da propriedade defaultRule.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultRule() {
        return defaultRule;
    }

    /**
     * Define o valor da propriedade defaultRule.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultRule(Boolean value) {
        this.defaultRule = value;
    }

    /**
     * Obtém o valor da propriedade driverDutyStatusNumberOfComments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDriverDutyStatusNumberOfComments() {
        return driverDutyStatusNumberOfComments;
    }

    /**
     * Define o valor da propriedade driverDutyStatusNumberOfComments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriverDutyStatusNumberOfComments(Boolean value) {
        this.driverDutyStatusNumberOfComments = value;
    }

    /**
     * Obtém o valor da propriedade driverDutyStatusPrefill.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDriverDutyStatusPrefill() {
        return driverDutyStatusPrefill;
    }

    /**
     * Define o valor da propriedade driverDutyStatusPrefill.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriverDutyStatusPrefill(Boolean value) {
        this.driverDutyStatusPrefill = value;
    }

    /**
     * Obtém o valor da propriedade enableAdverseWeather.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAdverseWeather() {
        return enableAdverseWeather;
    }

    /**
     * Define o valor da propriedade enableAdverseWeather.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAdverseWeather(Boolean value) {
        this.enableAdverseWeather = value;
    }

    /**
     * Obtém o valor da propriedade enableBigDayException.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableBigDayException() {
        return enableBigDayException;
    }

    /**
     * Define o valor da propriedade enableBigDayException.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableBigDayException(Boolean value) {
        this.enableBigDayException = value;
    }

    /**
     * Obtém o valor da propriedade enablePersonalConveyance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnablePersonalConveyance() {
        return enablePersonalConveyance;
    }

    /**
     * Define o valor da propriedade enablePersonalConveyance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablePersonalConveyance(Boolean value) {
        this.enablePersonalConveyance = value;
    }

    /**
     * Obtém o valor da propriedade enableShortHaulExemption.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableShortHaulExemption() {
        return enableShortHaulExemption;
    }

    /**
     * Define o valor da propriedade enableShortHaulExemption.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableShortHaulExemption(Boolean value) {
        this.enableShortHaulExemption = value;
    }

    /**
     * Obtém o valor da propriedade enableYardMove.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableYardMove() {
        return enableYardMove;
    }

    /**
     * Define o valor da propriedade enableYardMove.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableYardMove(Boolean value) {
        this.enableYardMove = value;
    }

    /**
     * Obtém o valor da propriedade enabledRules.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabledRules() {
        return enabledRules;
    }

    /**
     * Define o valor da propriedade enabledRules.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabledRules(Boolean value) {
        this.enabledRules = value;
    }

    /**
     * Obtém o valor da propriedade fleetName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFleetName() {
        return fleetName;
    }

    /**
     * Define o valor da propriedade fleetName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFleetName(Boolean value) {
        this.fleetName = value;
    }

    /**
     * Obtém o valor da propriedade hostEditorPrefill.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostEditorPrefill() {
        return hostEditorPrefill;
    }

    /**
     * Define o valor da propriedade hostEditorPrefill.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostEditorPrefill(Boolean value) {
        this.hostEditorPrefill = value;
    }

    /**
     * Obtém o valor da propriedade inMotionMobileWarningTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInMotionMobileWarningTime() {
        return inMotionMobileWarningTime;
    }

    /**
     * Define o valor da propriedade inMotionMobileWarningTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInMotionMobileWarningTime(Boolean value) {
        this.inMotionMobileWarningTime = value;
    }

    /**
     * Obtém o valor da propriedade lowOnDutyFirstWarnTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowOnDutyFirstWarnTime() {
        return lowOnDutyFirstWarnTime;
    }

    /**
     * Define o valor da propriedade lowOnDutyFirstWarnTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowOnDutyFirstWarnTime(Boolean value) {
        this.lowOnDutyFirstWarnTime = value;
    }

    /**
     * Obtém o valor da propriedade lowOnDutySecondWarnTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowOnDutySecondWarnTime() {
        return lowOnDutySecondWarnTime;
    }

    /**
     * Define o valor da propriedade lowOnDutySecondWarnTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowOnDutySecondWarnTime(Boolean value) {
        this.lowOnDutySecondWarnTime = value;
    }

    /**
     * Obtém o valor da propriedade maxConveyanceDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxConveyanceDistance() {
        return maxConveyanceDistance;
    }

    /**
     * Define o valor da propriedade maxConveyanceDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxConveyanceDistance(Boolean value) {
        this.maxConveyanceDistance = value;
    }

    /**
     * Obtém o valor da propriedade mobileEditorPrefill.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileEditorPrefill() {
        return mobileEditorPrefill;
    }

    /**
     * Define o valor da propriedade mobileEditorPrefill.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileEditorPrefill(Boolean value) {
        this.mobileEditorPrefill = value;
    }

    /**
     * Obtém o valor da propriedade mobileRemarksPrefill.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileRemarksPrefill() {
        return mobileRemarksPrefill;
    }

    /**
     * Define o valor da propriedade mobileRemarksPrefill.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileRemarksPrefill(Boolean value) {
        this.mobileRemarksPrefill = value;
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
     * Obtém o valor da propriedade prefillComments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrefillComments() {
        return prefillComments;
    }

    /**
     * Define o valor da propriedade prefillComments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrefillComments(Boolean value) {
        this.prefillComments = value;
    }

    /**
     * Obtém o valor da propriedade promptForOffDutyAtLogout.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptForOffDutyAtLogout() {
        return promptForOffDutyAtLogout;
    }

    /**
     * Define o valor da propriedade promptForOffDutyAtLogout.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptForOffDutyAtLogout(Boolean value) {
        this.promptForOffDutyAtLogout = value;
    }

    /**
     * Obtém o valor da propriedade promptForOnDutyAtLogin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptForOnDutyAtLogin() {
        return promptForOnDutyAtLogin;
    }

    /**
     * Define o valor da propriedade promptForOnDutyAtLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptForOnDutyAtLogin(Boolean value) {
        this.promptForOnDutyAtLogin = value;
    }

    /**
     * Obtém o valor da propriedade shippingIdMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippingIdMethod() {
        return shippingIdMethod;
    }

    /**
     * Define o valor da propriedade shippingIdMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippingIdMethod(Boolean value) {
        this.shippingIdMethod = value;
    }

    /**
     * Obtém o valor da propriedade shortHaulWarnDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortHaulWarnDistance() {
        return shortHaulWarnDistance;
    }

    /**
     * Define o valor da propriedade shortHaulWarnDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortHaulWarnDistance(Boolean value) {
        this.shortHaulWarnDistance = value;
    }

    /**
     * Obtém o valor da propriedade timeToTriggerDToOn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeToTriggerDToOn() {
        return timeToTriggerDToOn;
    }

    /**
     * Define o valor da propriedade timeToTriggerDToOn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeToTriggerDToOn(Boolean value) {
        this.timeToTriggerDToOn = value;
    }

    /**
     * Obtém o valor da propriedade uvaMilesThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUvaMilesThreshold() {
        return uvaMilesThreshold;
    }

    /**
     * Define o valor da propriedade uvaMilesThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUvaMilesThreshold(Boolean value) {
        this.uvaMilesThreshold = value;
    }

    /**
     * Obtém o valor da propriedade yardMoveTermination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYardMoveTermination() {
        return yardMoveTermination;
    }

    /**
     * Define o valor da propriedade yardMoveTermination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYardMoveTermination(Boolean value) {
        this.yardMoveTermination = value;
    }

}
