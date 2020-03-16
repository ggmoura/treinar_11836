
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.HosSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.HosSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllowAobrdLogEditing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowCoDriverUseWhileVehicleInMotion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowCoDrivers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowDriverToChangeRuleSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoSelectShortHaul" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutomaticBigResetSelection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryISO3Abbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultReportingLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DefaultRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnableAdverseWeather" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableBigDayException" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnablePersonalConveyance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableShortHaulExemption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableYardMove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnabledRules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FleetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosDriverDutyStatusNumberOfCommentsOptions_DriverDutyStatusNumberOfComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosInMotionMobileWarningTimeOptions_InMotionMobileWarningTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosLowOnDutyFirstWarnTimeOptions_LowOnDutyFirstWarnTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosLowOnDutySecondWarnTimeOptions_LowOnDutySecondWarnTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosManualTimeAdjustmentOfDutyStatusOptions_AllowManualTimeAdjustmentOfDutyStatusChanges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosShippingIdMethodOptions_ShippingIdMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosShortHaulWarnDistanceOptions_ShortHaulWarnDistance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosTimeToTriggerDToOnOptions_TimeToTriggerDToOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosYardMoveTerminationOptions_YardMoveTermination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfHosPrefillCommentPermissionType_DriverDutyStatusPrefill" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="ListOfHosPrefillCommentPermissionType_HostEditorPrefill" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="ListOfHosPrefillCommentPermissionType_MobileEditorPrefill" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="ListOfHosPrefillCommentPermissionType_MobileRemarksPrefill" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="MaxConveyanceDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationAddress" type="{http://roadnet.com/apex/DataContracts/}Region.OrganizationAddress" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrefillComments" type="{http://roadnet.com/apex/DataContracts/}ArrayOfHosPrefillComment" minOccurs="0"/&gt;
 *         &lt;element name="PromptForOffDutyAtLogout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PromptForOnDutyAtLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UvaMilesThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.HosSettings", propOrder = {
    "address",
    "allowAobrdLogEditing",
    "allowCoDriverUseWhileVehicleInMotion",
    "allowCoDrivers",
    "allowDriverToChangeRuleSet",
    "autoSelectShortHaul",
    "automaticBigResetSelection",
    "city",
    "countryISO3Abbr",
    "defaultReportingLocationEntityKey",
    "defaultRule",
    "enableAdverseWeather",
    "enableBigDayException",
    "enablePersonalConveyance",
    "enableShortHaulExemption",
    "enableYardMove",
    "enabledRules",
    "fleetName",
    "hosDriverDutyStatusNumberOfCommentsOptionsDriverDutyStatusNumberOfComments",
    "hosInMotionMobileWarningTimeOptionsInMotionMobileWarningTime",
    "hosLowOnDutyFirstWarnTimeOptionsLowOnDutyFirstWarnTime",
    "hosLowOnDutySecondWarnTimeOptionsLowOnDutySecondWarnTime",
    "hosManualTimeAdjustmentOfDutyStatusOptionsAllowManualTimeAdjustmentOfDutyStatusChanges",
    "hosShippingIdMethodOptionsShippingIdMethod",
    "hosShortHaulWarnDistanceOptionsShortHaulWarnDistance",
    "hosTimeToTriggerDToOnOptionsTimeToTriggerDToOn",
    "hosYardMoveTerminationOptionsYardMoveTermination",
    "listOfHosPrefillCommentPermissionTypeDriverDutyStatusPrefill",
    "listOfHosPrefillCommentPermissionTypeHostEditorPrefill",
    "listOfHosPrefillCommentPermissionTypeMobileEditorPrefill",
    "listOfHosPrefillCommentPermissionTypeMobileRemarksPrefill",
    "maxConveyanceDistance",
    "organizationAddress",
    "postalCode",
    "prefillComments",
    "promptForOffDutyAtLogout",
    "promptForOnDutyAtLogin",
    "state",
    "uvaMilesThreshold"
})
public class RegionHosSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "Address", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElement(name = "AllowAobrdLogEditing")
    protected Boolean allowAobrdLogEditing;
    @XmlElement(name = "AllowCoDriverUseWhileVehicleInMotion")
    protected Boolean allowCoDriverUseWhileVehicleInMotion;
    @XmlElement(name = "AllowCoDrivers")
    protected Boolean allowCoDrivers;
    @XmlElement(name = "AllowDriverToChangeRuleSet")
    protected Boolean allowDriverToChangeRuleSet;
    @XmlElement(name = "AutoSelectShortHaul")
    protected Boolean autoSelectShortHaul;
    @XmlElement(name = "AutomaticBigResetSelection")
    protected Boolean automaticBigResetSelection;
    @XmlElementRef(name = "City", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "CountryISO3Abbr", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryISO3Abbr;
    @XmlElementRef(name = "DefaultReportingLocationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> defaultReportingLocationEntityKey;
    @XmlElementRef(name = "DefaultRule", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultRule;
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
    @XmlElementRef(name = "EnabledRules", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enabledRules;
    @XmlElementRef(name = "FleetName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fleetName;
    @XmlElementRef(name = "HosDriverDutyStatusNumberOfCommentsOptions_DriverDutyStatusNumberOfComments", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosDriverDutyStatusNumberOfCommentsOptionsDriverDutyStatusNumberOfComments;
    @XmlElementRef(name = "HosInMotionMobileWarningTimeOptions_InMotionMobileWarningTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosInMotionMobileWarningTimeOptionsInMotionMobileWarningTime;
    @XmlElementRef(name = "HosLowOnDutyFirstWarnTimeOptions_LowOnDutyFirstWarnTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosLowOnDutyFirstWarnTimeOptionsLowOnDutyFirstWarnTime;
    @XmlElementRef(name = "HosLowOnDutySecondWarnTimeOptions_LowOnDutySecondWarnTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosLowOnDutySecondWarnTimeOptionsLowOnDutySecondWarnTime;
    @XmlElementRef(name = "HosManualTimeAdjustmentOfDutyStatusOptions_AllowManualTimeAdjustmentOfDutyStatusChanges", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosManualTimeAdjustmentOfDutyStatusOptionsAllowManualTimeAdjustmentOfDutyStatusChanges;
    @XmlElementRef(name = "HosShippingIdMethodOptions_ShippingIdMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosShippingIdMethodOptionsShippingIdMethod;
    @XmlElementRef(name = "HosShortHaulWarnDistanceOptions_ShortHaulWarnDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosShortHaulWarnDistanceOptionsShortHaulWarnDistance;
    @XmlElementRef(name = "HosTimeToTriggerDToOnOptions_TimeToTriggerDToOn", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosTimeToTriggerDToOnOptionsTimeToTriggerDToOn;
    @XmlElementRef(name = "HosYardMoveTerminationOptions_YardMoveTermination", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosYardMoveTerminationOptionsYardMoveTermination;
    @XmlElementRef(name = "ListOfHosPrefillCommentPermissionType_DriverDutyStatusPrefill", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfHosPrefillCommentPermissionTypeDriverDutyStatusPrefill;
    @XmlElementRef(name = "ListOfHosPrefillCommentPermissionType_HostEditorPrefill", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfHosPrefillCommentPermissionTypeHostEditorPrefill;
    @XmlElementRef(name = "ListOfHosPrefillCommentPermissionType_MobileEditorPrefill", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfHosPrefillCommentPermissionTypeMobileEditorPrefill;
    @XmlElementRef(name = "ListOfHosPrefillCommentPermissionType_MobileRemarksPrefill", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfHosPrefillCommentPermissionTypeMobileRemarksPrefill;
    @XmlElement(name = "MaxConveyanceDistance")
    protected Double maxConveyanceDistance;
    @XmlElementRef(name = "OrganizationAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionOrganizationAddress> organizationAddress;
    @XmlElementRef(name = "PostalCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "PrefillComments", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHosPrefillComment> prefillComments;
    @XmlElement(name = "PromptForOffDutyAtLogout")
    protected Boolean promptForOffDutyAtLogout;
    @XmlElement(name = "PromptForOnDutyAtLogin")
    protected Boolean promptForOnDutyAtLogin;
    @XmlElementRef(name = "State", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElement(name = "UvaMilesThreshold")
    protected Integer uvaMilesThreshold;

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

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
     * Obtém o valor da propriedade defaultReportingLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDefaultReportingLocationEntityKey() {
        return defaultReportingLocationEntityKey;
    }

    /**
     * Define o valor da propriedade defaultReportingLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDefaultReportingLocationEntityKey(JAXBElement<Long> value) {
        this.defaultReportingLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade defaultRule.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultRule() {
        return defaultRule;
    }

    /**
     * Define o valor da propriedade defaultRule.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultRule(JAXBElement<String> value) {
        this.defaultRule = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnabledRules() {
        return enabledRules;
    }

    /**
     * Define o valor da propriedade enabledRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnabledRules(JAXBElement<String> value) {
        this.enabledRules = value;
    }

    /**
     * Obtém o valor da propriedade fleetName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFleetName() {
        return fleetName;
    }

    /**
     * Define o valor da propriedade fleetName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFleetName(JAXBElement<String> value) {
        this.fleetName = value;
    }

    /**
     * Obtém o valor da propriedade hosDriverDutyStatusNumberOfCommentsOptionsDriverDutyStatusNumberOfComments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosDriverDutyStatusNumberOfCommentsOptionsDriverDutyStatusNumberOfComments() {
        return hosDriverDutyStatusNumberOfCommentsOptionsDriverDutyStatusNumberOfComments;
    }

    /**
     * Define o valor da propriedade hosDriverDutyStatusNumberOfCommentsOptionsDriverDutyStatusNumberOfComments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosDriverDutyStatusNumberOfCommentsOptionsDriverDutyStatusNumberOfComments(JAXBElement<String> value) {
        this.hosDriverDutyStatusNumberOfCommentsOptionsDriverDutyStatusNumberOfComments = value;
    }

    /**
     * Obtém o valor da propriedade hosInMotionMobileWarningTimeOptionsInMotionMobileWarningTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosInMotionMobileWarningTimeOptionsInMotionMobileWarningTime() {
        return hosInMotionMobileWarningTimeOptionsInMotionMobileWarningTime;
    }

    /**
     * Define o valor da propriedade hosInMotionMobileWarningTimeOptionsInMotionMobileWarningTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosInMotionMobileWarningTimeOptionsInMotionMobileWarningTime(JAXBElement<String> value) {
        this.hosInMotionMobileWarningTimeOptionsInMotionMobileWarningTime = value;
    }

    /**
     * Obtém o valor da propriedade hosLowOnDutyFirstWarnTimeOptionsLowOnDutyFirstWarnTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosLowOnDutyFirstWarnTimeOptionsLowOnDutyFirstWarnTime() {
        return hosLowOnDutyFirstWarnTimeOptionsLowOnDutyFirstWarnTime;
    }

    /**
     * Define o valor da propriedade hosLowOnDutyFirstWarnTimeOptionsLowOnDutyFirstWarnTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosLowOnDutyFirstWarnTimeOptionsLowOnDutyFirstWarnTime(JAXBElement<String> value) {
        this.hosLowOnDutyFirstWarnTimeOptionsLowOnDutyFirstWarnTime = value;
    }

    /**
     * Obtém o valor da propriedade hosLowOnDutySecondWarnTimeOptionsLowOnDutySecondWarnTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosLowOnDutySecondWarnTimeOptionsLowOnDutySecondWarnTime() {
        return hosLowOnDutySecondWarnTimeOptionsLowOnDutySecondWarnTime;
    }

    /**
     * Define o valor da propriedade hosLowOnDutySecondWarnTimeOptionsLowOnDutySecondWarnTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosLowOnDutySecondWarnTimeOptionsLowOnDutySecondWarnTime(JAXBElement<String> value) {
        this.hosLowOnDutySecondWarnTimeOptionsLowOnDutySecondWarnTime = value;
    }

    /**
     * Obtém o valor da propriedade hosManualTimeAdjustmentOfDutyStatusOptionsAllowManualTimeAdjustmentOfDutyStatusChanges.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosManualTimeAdjustmentOfDutyStatusOptionsAllowManualTimeAdjustmentOfDutyStatusChanges() {
        return hosManualTimeAdjustmentOfDutyStatusOptionsAllowManualTimeAdjustmentOfDutyStatusChanges;
    }

    /**
     * Define o valor da propriedade hosManualTimeAdjustmentOfDutyStatusOptionsAllowManualTimeAdjustmentOfDutyStatusChanges.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosManualTimeAdjustmentOfDutyStatusOptionsAllowManualTimeAdjustmentOfDutyStatusChanges(JAXBElement<String> value) {
        this.hosManualTimeAdjustmentOfDutyStatusOptionsAllowManualTimeAdjustmentOfDutyStatusChanges = value;
    }

    /**
     * Obtém o valor da propriedade hosShippingIdMethodOptionsShippingIdMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosShippingIdMethodOptionsShippingIdMethod() {
        return hosShippingIdMethodOptionsShippingIdMethod;
    }

    /**
     * Define o valor da propriedade hosShippingIdMethodOptionsShippingIdMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosShippingIdMethodOptionsShippingIdMethod(JAXBElement<String> value) {
        this.hosShippingIdMethodOptionsShippingIdMethod = value;
    }

    /**
     * Obtém o valor da propriedade hosShortHaulWarnDistanceOptionsShortHaulWarnDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosShortHaulWarnDistanceOptionsShortHaulWarnDistance() {
        return hosShortHaulWarnDistanceOptionsShortHaulWarnDistance;
    }

    /**
     * Define o valor da propriedade hosShortHaulWarnDistanceOptionsShortHaulWarnDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosShortHaulWarnDistanceOptionsShortHaulWarnDistance(JAXBElement<String> value) {
        this.hosShortHaulWarnDistanceOptionsShortHaulWarnDistance = value;
    }

    /**
     * Obtém o valor da propriedade hosTimeToTriggerDToOnOptionsTimeToTriggerDToOn.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosTimeToTriggerDToOnOptionsTimeToTriggerDToOn() {
        return hosTimeToTriggerDToOnOptionsTimeToTriggerDToOn;
    }

    /**
     * Define o valor da propriedade hosTimeToTriggerDToOnOptionsTimeToTriggerDToOn.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosTimeToTriggerDToOnOptionsTimeToTriggerDToOn(JAXBElement<String> value) {
        this.hosTimeToTriggerDToOnOptionsTimeToTriggerDToOn = value;
    }

    /**
     * Obtém o valor da propriedade hosYardMoveTerminationOptionsYardMoveTermination.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosYardMoveTerminationOptionsYardMoveTermination() {
        return hosYardMoveTerminationOptionsYardMoveTermination;
    }

    /**
     * Define o valor da propriedade hosYardMoveTerminationOptionsYardMoveTermination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosYardMoveTerminationOptionsYardMoveTermination(JAXBElement<String> value) {
        this.hosYardMoveTerminationOptionsYardMoveTermination = value;
    }

    /**
     * Obtém o valor da propriedade listOfHosPrefillCommentPermissionTypeDriverDutyStatusPrefill.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfHosPrefillCommentPermissionTypeDriverDutyStatusPrefill() {
        return listOfHosPrefillCommentPermissionTypeDriverDutyStatusPrefill;
    }

    /**
     * Define o valor da propriedade listOfHosPrefillCommentPermissionTypeDriverDutyStatusPrefill.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfHosPrefillCommentPermissionTypeDriverDutyStatusPrefill(JAXBElement<ArrayOfstring> value) {
        this.listOfHosPrefillCommentPermissionTypeDriverDutyStatusPrefill = value;
    }

    /**
     * Obtém o valor da propriedade listOfHosPrefillCommentPermissionTypeHostEditorPrefill.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfHosPrefillCommentPermissionTypeHostEditorPrefill() {
        return listOfHosPrefillCommentPermissionTypeHostEditorPrefill;
    }

    /**
     * Define o valor da propriedade listOfHosPrefillCommentPermissionTypeHostEditorPrefill.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfHosPrefillCommentPermissionTypeHostEditorPrefill(JAXBElement<ArrayOfstring> value) {
        this.listOfHosPrefillCommentPermissionTypeHostEditorPrefill = value;
    }

    /**
     * Obtém o valor da propriedade listOfHosPrefillCommentPermissionTypeMobileEditorPrefill.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfHosPrefillCommentPermissionTypeMobileEditorPrefill() {
        return listOfHosPrefillCommentPermissionTypeMobileEditorPrefill;
    }

    /**
     * Define o valor da propriedade listOfHosPrefillCommentPermissionTypeMobileEditorPrefill.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfHosPrefillCommentPermissionTypeMobileEditorPrefill(JAXBElement<ArrayOfstring> value) {
        this.listOfHosPrefillCommentPermissionTypeMobileEditorPrefill = value;
    }

    /**
     * Obtém o valor da propriedade listOfHosPrefillCommentPermissionTypeMobileRemarksPrefill.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfHosPrefillCommentPermissionTypeMobileRemarksPrefill() {
        return listOfHosPrefillCommentPermissionTypeMobileRemarksPrefill;
    }

    /**
     * Define o valor da propriedade listOfHosPrefillCommentPermissionTypeMobileRemarksPrefill.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfHosPrefillCommentPermissionTypeMobileRemarksPrefill(JAXBElement<ArrayOfstring> value) {
        this.listOfHosPrefillCommentPermissionTypeMobileRemarksPrefill = value;
    }

    /**
     * Obtém o valor da propriedade maxConveyanceDistance.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxConveyanceDistance() {
        return maxConveyanceDistance;
    }

    /**
     * Define o valor da propriedade maxConveyanceDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxConveyanceDistance(Double value) {
        this.maxConveyanceDistance = value;
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
     * Obtém o valor da propriedade prefillComments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHosPrefillComment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHosPrefillComment> getPrefillComments() {
        return prefillComments;
    }

    /**
     * Define o valor da propriedade prefillComments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHosPrefillComment }{@code >}
     *     
     */
    public void setPrefillComments(JAXBElement<ArrayOfHosPrefillComment> value) {
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
     * Obtém o valor da propriedade uvaMilesThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUvaMilesThreshold() {
        return uvaMilesThreshold;
    }

    /**
     * Define o valor da propriedade uvaMilesThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUvaMilesThreshold(Integer value) {
        this.uvaMilesThreshold = value;
    }

}
