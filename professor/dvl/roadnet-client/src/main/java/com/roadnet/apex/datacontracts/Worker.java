
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Worker complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Worker"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustServiceTimePercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CdlEndorsements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CdlExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CdlIssuingCountryISO3Abbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CdlIssuingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CdlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://roadnet.com/apex/DataContracts/}Color" minOccurs="0"/&gt;
 *         &lt;element name="ContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Costs" type="{http://roadnet.com/apex/DataContracts/}WorkerCosts" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EnableAutoArriveDepart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableStopResequencing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="HelperCosts" type="{http://roadnet.com/apex/DataContracts/}WorkerCosts" minOccurs="0"/&gt;
 *         &lt;element name="HosDefaultReportingLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="HosDefaultRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosEldExemptExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosEnableAdverseWeather" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEnableBigDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEnablePersonalConveyance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEnableYardMove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEnabledRules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosIsEldExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosMaxConveyanceDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HosStatus" type="{http://roadnet.com/apex/DataContracts/}WorkerHosStatus" minOccurs="0"/&gt;
 *         &lt;element name="HosUseOrganizationSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosYardMoveTerminationOptions_HosYardMoveTermination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTopLevelComplianceEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsXrsDriver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KeyFobIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MedicalExamExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MobileApplicationType_MobileApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileCredentials" type="{http://roadnet.com/apex/DataContracts/}WorkerMobileCredentials" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneSystem_OmnitracsOneSystemOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerDvirInspectionSetting_DvirInspectionOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="XrsDriverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsDriverSid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
@XmlType(name = "Worker", propOrder = {
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
public class Worker
    extends VisibleInMultipleRegionsAggregateRootEntity
{

    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "AdjustServiceTimePercent")
    protected Double adjustServiceTimePercent;
    @XmlElementRef(name = "CdlEndorsements", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cdlEndorsements;
    @XmlElementRef(name = "CdlExpiration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> cdlExpiration;
    @XmlElementRef(name = "CdlIssuingCountryISO3Abbr", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cdlIssuingCountryISO3Abbr;
    @XmlElementRef(name = "CdlIssuingState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cdlIssuingState;
    @XmlElementRef(name = "CdlNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cdlNumber;
    @XmlElementRef(name = "Color", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Color> color;
    @XmlElementRef(name = "ContactNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactNumber;
    @XmlElementRef(name = "Costs", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkerCosts> costs;
    @XmlElementRef(name = "CurrentRegionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRegionDescription;
    @XmlElement(name = "CurrentRegionEntityKey")
    protected Long currentRegionEntityKey;
    @XmlElementRef(name = "CurrentRegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRegionIdentifier;
    @XmlElementRef(name = "DepotEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> depotEntityKey;
    @XmlElement(name = "EnableAutoArriveDepart")
    protected Boolean enableAutoArriveDepart;
    @XmlElement(name = "EnableStopResequencing")
    protected Boolean enableStopResequencing;
    @XmlElementRef(name = "EquipmentEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentEntityKey;
    @XmlElementRef(name = "HelperCosts", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkerCosts> helperCosts;
    @XmlElementRef(name = "HosDefaultReportingLocationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> hosDefaultReportingLocationEntityKey;
    @XmlElementRef(name = "HosDefaultRule", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosDefaultRule;
    @XmlElementRef(name = "HosEldExemptExplanation", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosEldExemptExplanation;
    @XmlElement(name = "HosEnableAdverseWeather")
    protected Boolean hosEnableAdverseWeather;
    @XmlElement(name = "HosEnableBigDay")
    protected Boolean hosEnableBigDay;
    @XmlElement(name = "HosEnablePersonalConveyance")
    protected Boolean hosEnablePersonalConveyance;
    @XmlElement(name = "HosEnableYardMove")
    protected Boolean hosEnableYardMove;
    @XmlElementRef(name = "HosEnabledRules", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosEnabledRules;
    @XmlElement(name = "HosIsEldExempt")
    protected Boolean hosIsEldExempt;
    @XmlElement(name = "HosMaxConveyanceDistance")
    protected Double hosMaxConveyanceDistance;
    @XmlElementRef(name = "HosStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkerHosStatus> hosStatus;
    @XmlElement(name = "HosUseOrganizationSettings")
    protected Boolean hosUseOrganizationSettings;
    @XmlElementRef(name = "HosYardMoveTerminationOptions_HosYardMoveTermination", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosYardMoveTerminationOptionsHosYardMoveTermination;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "IsTopLevelComplianceEntity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isTopLevelComplianceEntity;
    @XmlElement(name = "IsXrsDriver")
    protected Boolean isXrsDriver;
    @XmlElementRef(name = "KeyFobIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keyFobIdentifier;
    @XmlElementRef(name = "MedicalExamExpiration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> medicalExamExpiration;
    @XmlElementRef(name = "MobileApplicationType_MobileApplicationType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileApplicationTypeMobileApplicationType;
    @XmlElementRef(name = "MobileCredentials", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkerMobileCredentials> mobileCredentials;
    @XmlElementRef(name = "Name", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> name;
    @XmlElementRef(name = "OmnitracsOneGuid", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omnitracsOneGuid;
    @XmlElementRef(name = "OmnitracsOneSystem_OmnitracsOneSystemOfOrigin", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    @XmlElementRef(name = "WorkerDvirInspectionSetting_DvirInspectionOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerDvirInspectionSettingDvirInspectionOverride;
    @XmlElement(name = "WorkerTypeEntityKey")
    protected Long workerTypeEntityKey;
    @XmlElementRef(name = "XrsDriverId", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsDriverId;
    @XmlElementRef(name = "XrsDriverSid", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> xrsDriverSid;
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
     *     {@link Double }
     *     
     */
    public Double getAdjustServiceTimePercent() {
        return adjustServiceTimePercent;
    }

    /**
     * Define o valor da propriedade adjustServiceTimePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustServiceTimePercent(Double value) {
        this.adjustServiceTimePercent = value;
    }

    /**
     * Obtém o valor da propriedade cdlEndorsements.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCdlEndorsements() {
        return cdlEndorsements;
    }

    /**
     * Define o valor da propriedade cdlEndorsements.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCdlEndorsements(JAXBElement<String> value) {
        this.cdlEndorsements = value;
    }

    /**
     * Obtém o valor da propriedade cdlExpiration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCdlExpiration() {
        return cdlExpiration;
    }

    /**
     * Define o valor da propriedade cdlExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCdlExpiration(JAXBElement<XMLGregorianCalendar> value) {
        this.cdlExpiration = value;
    }

    /**
     * Obtém o valor da propriedade cdlIssuingCountryISO3Abbr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCdlIssuingCountryISO3Abbr() {
        return cdlIssuingCountryISO3Abbr;
    }

    /**
     * Define o valor da propriedade cdlIssuingCountryISO3Abbr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCdlIssuingCountryISO3Abbr(JAXBElement<String> value) {
        this.cdlIssuingCountryISO3Abbr = value;
    }

    /**
     * Obtém o valor da propriedade cdlIssuingState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCdlIssuingState() {
        return cdlIssuingState;
    }

    /**
     * Define o valor da propriedade cdlIssuingState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCdlIssuingState(JAXBElement<String> value) {
        this.cdlIssuingState = value;
    }

    /**
     * Obtém o valor da propriedade cdlNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCdlNumber() {
        return cdlNumber;
    }

    /**
     * Define o valor da propriedade cdlNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCdlNumber(JAXBElement<String> value) {
        this.cdlNumber = value;
    }

    /**
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public JAXBElement<Color> getColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public void setColor(JAXBElement<Color> value) {
        this.color = value;
    }

    /**
     * Obtém o valor da propriedade contactNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactNumber() {
        return contactNumber;
    }

    /**
     * Define o valor da propriedade contactNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactNumber(JAXBElement<String> value) {
        this.contactNumber = value;
    }

    /**
     * Obtém o valor da propriedade costs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkerCosts }{@code >}
     *     
     */
    public JAXBElement<WorkerCosts> getCosts() {
        return costs;
    }

    /**
     * Define o valor da propriedade costs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkerCosts }{@code >}
     *     
     */
    public void setCosts(JAXBElement<WorkerCosts> value) {
        this.costs = value;
    }

    /**
     * Obtém o valor da propriedade currentRegionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentRegionDescription() {
        return currentRegionDescription;
    }

    /**
     * Define o valor da propriedade currentRegionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentRegionDescription(JAXBElement<String> value) {
        this.currentRegionDescription = value;
    }

    /**
     * Obtém o valor da propriedade currentRegionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentRegionEntityKey() {
        return currentRegionEntityKey;
    }

    /**
     * Define o valor da propriedade currentRegionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentRegionEntityKey(Long value) {
        this.currentRegionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade currentRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentRegionIdentifier() {
        return currentRegionIdentifier;
    }

    /**
     * Define o valor da propriedade currentRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentRegionIdentifier(JAXBElement<String> value) {
        this.currentRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade depotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDepotEntityKey() {
        return depotEntityKey;
    }

    /**
     * Define o valor da propriedade depotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDepotEntityKey(JAXBElement<Long> value) {
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
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipmentEntityKey(JAXBElement<Long> value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade helperCosts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkerCosts }{@code >}
     *     
     */
    public JAXBElement<WorkerCosts> getHelperCosts() {
        return helperCosts;
    }

    /**
     * Define o valor da propriedade helperCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkerCosts }{@code >}
     *     
     */
    public void setHelperCosts(JAXBElement<WorkerCosts> value) {
        this.helperCosts = value;
    }

    /**
     * Obtém o valor da propriedade hosDefaultReportingLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getHosDefaultReportingLocationEntityKey() {
        return hosDefaultReportingLocationEntityKey;
    }

    /**
     * Define o valor da propriedade hosDefaultReportingLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setHosDefaultReportingLocationEntityKey(JAXBElement<Long> value) {
        this.hosDefaultReportingLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade hosDefaultRule.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosDefaultRule() {
        return hosDefaultRule;
    }

    /**
     * Define o valor da propriedade hosDefaultRule.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosDefaultRule(JAXBElement<String> value) {
        this.hosDefaultRule = value;
    }

    /**
     * Obtém o valor da propriedade hosEldExemptExplanation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosEldExemptExplanation() {
        return hosEldExemptExplanation;
    }

    /**
     * Define o valor da propriedade hosEldExemptExplanation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosEldExemptExplanation(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosEnabledRules() {
        return hosEnabledRules;
    }

    /**
     * Define o valor da propriedade hosEnabledRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosEnabledRules(JAXBElement<String> value) {
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
     *     {@link Double }
     *     
     */
    public Double getHosMaxConveyanceDistance() {
        return hosMaxConveyanceDistance;
    }

    /**
     * Define o valor da propriedade hosMaxConveyanceDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHosMaxConveyanceDistance(Double value) {
        this.hosMaxConveyanceDistance = value;
    }

    /**
     * Obtém o valor da propriedade hosStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkerHosStatus }{@code >}
     *     
     */
    public JAXBElement<WorkerHosStatus> getHosStatus() {
        return hosStatus;
    }

    /**
     * Define o valor da propriedade hosStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkerHosStatus }{@code >}
     *     
     */
    public void setHosStatus(JAXBElement<WorkerHosStatus> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosYardMoveTerminationOptionsHosYardMoveTermination() {
        return hosYardMoveTerminationOptionsHosYardMoveTermination;
    }

    /**
     * Define o valor da propriedade hosYardMoveTerminationOptionsHosYardMoveTermination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosYardMoveTerminationOptionsHosYardMoveTermination(JAXBElement<String> value) {
        this.hosYardMoveTerminationOptionsHosYardMoveTermination = value;
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
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsTopLevelComplianceEntity() {
        return isTopLevelComplianceEntity;
    }

    /**
     * Define o valor da propriedade isTopLevelComplianceEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsTopLevelComplianceEntity(JAXBElement<Boolean> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyFobIdentifier() {
        return keyFobIdentifier;
    }

    /**
     * Define o valor da propriedade keyFobIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyFobIdentifier(JAXBElement<String> value) {
        this.keyFobIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade medicalExamExpiration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMedicalExamExpiration() {
        return medicalExamExpiration;
    }

    /**
     * Define o valor da propriedade medicalExamExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMedicalExamExpiration(JAXBElement<XMLGregorianCalendar> value) {
        this.medicalExamExpiration = value;
    }

    /**
     * Obtém o valor da propriedade mobileApplicationTypeMobileApplicationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileApplicationTypeMobileApplicationType() {
        return mobileApplicationTypeMobileApplicationType;
    }

    /**
     * Define o valor da propriedade mobileApplicationTypeMobileApplicationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileApplicationTypeMobileApplicationType(JAXBElement<String> value) {
        this.mobileApplicationTypeMobileApplicationType = value;
    }

    /**
     * Obtém o valor da propriedade mobileCredentials.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkerMobileCredentials }{@code >}
     *     
     */
    public JAXBElement<WorkerMobileCredentials> getMobileCredentials() {
        return mobileCredentials;
    }

    /**
     * Define o valor da propriedade mobileCredentials.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkerMobileCredentials }{@code >}
     *     
     */
    public void setMobileCredentials(JAXBElement<WorkerMobileCredentials> value) {
        this.mobileCredentials = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setName(JAXBElement<PersonName> value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneGuid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOmnitracsOneGuid() {
        return omnitracsOneGuid;
    }

    /**
     * Define o valor da propriedade omnitracsOneGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOmnitracsOneGuid(JAXBElement<String> value) {
        this.omnitracsOneGuid = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOneSystemOmnitracsOneSystemOfOrigin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOmnitracsOneSystemOmnitracsOneSystemOfOrigin() {
        return omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    }

    /**
     * Define o valor da propriedade omnitracsOneSystemOmnitracsOneSystemOfOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOmnitracsOneSystemOmnitracsOneSystemOfOrigin(JAXBElement<String> value) {
        this.omnitracsOneSystemOmnitracsOneSystemOfOrigin = value;
    }

    /**
     * Obtém o valor da propriedade workerDvirInspectionSettingDvirInspectionOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerDvirInspectionSettingDvirInspectionOverride() {
        return workerDvirInspectionSettingDvirInspectionOverride;
    }

    /**
     * Define o valor da propriedade workerDvirInspectionSettingDvirInspectionOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerDvirInspectionSettingDvirInspectionOverride(JAXBElement<String> value) {
        this.workerDvirInspectionSettingDvirInspectionOverride = value;
    }

    /**
     * Obtém o valor da propriedade workerTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkerTypeEntityKey() {
        return workerTypeEntityKey;
    }

    /**
     * Define o valor da propriedade workerTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkerTypeEntityKey(Long value) {
        this.workerTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade xrsDriverId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsDriverId() {
        return xrsDriverId;
    }

    /**
     * Define o valor da propriedade xrsDriverId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsDriverId(JAXBElement<String> value) {
        this.xrsDriverId = value;
    }

    /**
     * Obtém o valor da propriedade xrsDriverSid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getXrsDriverSid() {
        return xrsDriverSid;
    }

    /**
     * Define o valor da propriedade xrsDriverSid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setXrsDriverSid(JAXBElement<Long> value) {
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
