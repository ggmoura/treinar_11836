
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BaseMobileDevicePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BaseMobileDevicePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRoutingSessionDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DevicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTopLevelComplianceEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastContactTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPosition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPositionTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NavDeviceActivationStatus_OmnitracsNavigationActivationStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationIsPreAuthenticated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneGuid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneSystem_OmnitracsOneSystemOfOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedSignalStrengthIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeSinceLastContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeSinceLastPositionUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMobileDevicePropertyOptions", propOrder = {
    "active",
    "currentRegionEntityKey",
    "currentRouteEntityKey",
    "currentRoutingSessionDate",
    "description",
    "devicePhoneNumber",
    "equipmentEntityKey",
    "identifier",
    "isDeleted",
    "isTopLevelComplianceEntity",
    "lastContactTime",
    "lastKnownPosition",
    "lastKnownPositionTime",
    "navDeviceActivationStatusOmnitracsNavigationActivationStatus",
    "omnitracsNavigationIsPreAuthenticated",
    "omnitracsOneGuid",
    "omnitracsOneSystemOmnitracsOneSystemOfOrigin",
    "receivedSignalStrengthIndicator",
    "timeSinceLastContact",
    "timeSinceLastPositionUpdate"
})
@XmlSeeAlso({
    TelematicsDevicePropertyOptions.class,
    MobileDevicePropertyOptions.class
})
public class BaseMobileDevicePropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "CurrentRegionEntityKey")
    protected Boolean currentRegionEntityKey;
    @XmlElement(name = "CurrentRouteEntityKey")
    protected Boolean currentRouteEntityKey;
    @XmlElement(name = "CurrentRoutingSessionDate")
    protected Boolean currentRoutingSessionDate;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "DevicePhoneNumber")
    protected Boolean devicePhoneNumber;
    @XmlElement(name = "EquipmentEntityKey")
    protected Boolean equipmentEntityKey;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "IsTopLevelComplianceEntity")
    protected Boolean isTopLevelComplianceEntity;
    @XmlElement(name = "LastContactTime")
    protected Boolean lastContactTime;
    @XmlElement(name = "LastKnownPosition")
    protected Boolean lastKnownPosition;
    @XmlElement(name = "LastKnownPositionTime")
    protected Boolean lastKnownPositionTime;
    @XmlElement(name = "NavDeviceActivationStatus_OmnitracsNavigationActivationStatus")
    protected Boolean navDeviceActivationStatusOmnitracsNavigationActivationStatus;
    @XmlElement(name = "OmnitracsNavigationIsPreAuthenticated")
    protected Boolean omnitracsNavigationIsPreAuthenticated;
    @XmlElement(name = "OmnitracsOneGuid")
    protected Boolean omnitracsOneGuid;
    @XmlElement(name = "OmnitracsOneSystem_OmnitracsOneSystemOfOrigin")
    protected Boolean omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    @XmlElement(name = "ReceivedSignalStrengthIndicator")
    protected Boolean receivedSignalStrengthIndicator;
    @XmlElement(name = "TimeSinceLastContact")
    protected Boolean timeSinceLastContact;
    @XmlElement(name = "TimeSinceLastPositionUpdate")
    protected Boolean timeSinceLastPositionUpdate;

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
     * Obtém o valor da propriedade currentRouteEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentRouteEntityKey() {
        return currentRouteEntityKey;
    }

    /**
     * Define o valor da propriedade currentRouteEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentRouteEntityKey(Boolean value) {
        this.currentRouteEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade currentRoutingSessionDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentRoutingSessionDate() {
        return currentRoutingSessionDate;
    }

    /**
     * Define o valor da propriedade currentRoutingSessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentRoutingSessionDate(Boolean value) {
        this.currentRoutingSessionDate = value;
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
     * Obtém o valor da propriedade devicePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDevicePhoneNumber() {
        return devicePhoneNumber;
    }

    /**
     * Define o valor da propriedade devicePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDevicePhoneNumber(Boolean value) {
        this.devicePhoneNumber = value;
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
     * Obtém o valor da propriedade lastContactTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastContactTime() {
        return lastContactTime;
    }

    /**
     * Define o valor da propriedade lastContactTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastContactTime(Boolean value) {
        this.lastContactTime = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPosition.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastKnownPosition() {
        return lastKnownPosition;
    }

    /**
     * Define o valor da propriedade lastKnownPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastKnownPosition(Boolean value) {
        this.lastKnownPosition = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPositionTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastKnownPositionTime() {
        return lastKnownPositionTime;
    }

    /**
     * Define o valor da propriedade lastKnownPositionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastKnownPositionTime(Boolean value) {
        this.lastKnownPositionTime = value;
    }

    /**
     * Obtém o valor da propriedade navDeviceActivationStatusOmnitracsNavigationActivationStatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNavDeviceActivationStatusOmnitracsNavigationActivationStatus() {
        return navDeviceActivationStatusOmnitracsNavigationActivationStatus;
    }

    /**
     * Define o valor da propriedade navDeviceActivationStatusOmnitracsNavigationActivationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNavDeviceActivationStatusOmnitracsNavigationActivationStatus(Boolean value) {
        this.navDeviceActivationStatusOmnitracsNavigationActivationStatus = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigationIsPreAuthenticated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsNavigationIsPreAuthenticated() {
        return omnitracsNavigationIsPreAuthenticated;
    }

    /**
     * Define o valor da propriedade omnitracsNavigationIsPreAuthenticated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsNavigationIsPreAuthenticated(Boolean value) {
        this.omnitracsNavigationIsPreAuthenticated = value;
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
     * Obtém o valor da propriedade receivedSignalStrengthIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceivedSignalStrengthIndicator() {
        return receivedSignalStrengthIndicator;
    }

    /**
     * Define o valor da propriedade receivedSignalStrengthIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceivedSignalStrengthIndicator(Boolean value) {
        this.receivedSignalStrengthIndicator = value;
    }

    /**
     * Obtém o valor da propriedade timeSinceLastContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeSinceLastContact() {
        return timeSinceLastContact;
    }

    /**
     * Define o valor da propriedade timeSinceLastContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeSinceLastContact(Boolean value) {
        this.timeSinceLastContact = value;
    }

    /**
     * Obtém o valor da propriedade timeSinceLastPositionUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeSinceLastPositionUpdate() {
        return timeSinceLastPositionUpdate;
    }

    /**
     * Define o valor da propriedade timeSinceLastPositionUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeSinceLastPositionUpdate(Boolean value) {
        this.timeSinceLastPositionUpdate = value;
    }

}
