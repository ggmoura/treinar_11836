
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de BaseMobileDevice complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BaseMobileDevice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRoutingSessionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DevicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTopLevelComplianceEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastContactTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPosition" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPositionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NavDeviceActivationStatus_OmnitracsNavigationActivationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationActivationCodeExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationIsPreAuthenticated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneSystem_OmnitracsOneSystemOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedSignalStrengthIndicator" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TimeSinceLastContact" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TimeSinceLastPositionUpdate" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMobileDevice", propOrder = {
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
    "omnitracsNavigationActivationCodeExpiration",
    "omnitracsNavigationIsPreAuthenticated",
    "omnitracsOneGuid",
    "omnitracsOneSystemOmnitracsOneSystemOfOrigin",
    "receivedSignalStrengthIndicator",
    "timeSinceLastContact",
    "timeSinceLastPositionUpdate"
})
@XmlSeeAlso({
    MobileDevice.class,
    TelematicsDevice.class
})
public class BaseMobileDevice
    extends VisibleInMultipleRegionsAggregateRootEntity
{

    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "CurrentRegionEntityKey")
    protected Long currentRegionEntityKey;
    @XmlElementRef(name = "CurrentRouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> currentRouteEntityKey;
    @XmlElementRef(name = "CurrentRoutingSessionDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> currentRoutingSessionDate;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DevicePhoneNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> devicePhoneNumber;
    @XmlElementRef(name = "EquipmentEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentEntityKey;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "IsTopLevelComplianceEntity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isTopLevelComplianceEntity;
    @XmlElementRef(name = "LastContactTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastContactTime;
    @XmlElementRef(name = "LastKnownPosition", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> lastKnownPosition;
    @XmlElementRef(name = "LastKnownPositionTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastKnownPositionTime;
    @XmlElementRef(name = "NavDeviceActivationStatus_OmnitracsNavigationActivationStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> navDeviceActivationStatusOmnitracsNavigationActivationStatus;
    @XmlElementRef(name = "OmnitracsNavigationActivationCodeExpiration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> omnitracsNavigationActivationCodeExpiration;
    @XmlElement(name = "OmnitracsNavigationIsPreAuthenticated")
    protected Boolean omnitracsNavigationIsPreAuthenticated;
    @XmlElementRef(name = "OmnitracsOneGuid", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omnitracsOneGuid;
    @XmlElementRef(name = "OmnitracsOneSystem_OmnitracsOneSystemOfOrigin", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omnitracsOneSystemOmnitracsOneSystemOfOrigin;
    @XmlElementRef(name = "ReceivedSignalStrengthIndicator", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receivedSignalStrengthIndicator;
    @XmlElementRef(name = "TimeSinceLastContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> timeSinceLastContact;
    @XmlElementRef(name = "TimeSinceLastPositionUpdate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> timeSinceLastPositionUpdate;

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
     * Obtém o valor da propriedade currentRouteEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCurrentRouteEntityKey() {
        return currentRouteEntityKey;
    }

    /**
     * Define o valor da propriedade currentRouteEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCurrentRouteEntityKey(JAXBElement<Long> value) {
        this.currentRouteEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade currentRoutingSessionDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCurrentRoutingSessionDate() {
        return currentRoutingSessionDate;
    }

    /**
     * Define o valor da propriedade currentRoutingSessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCurrentRoutingSessionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.currentRoutingSessionDate = value;
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
     * Obtém o valor da propriedade devicePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDevicePhoneNumber() {
        return devicePhoneNumber;
    }

    /**
     * Define o valor da propriedade devicePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDevicePhoneNumber(JAXBElement<String> value) {
        this.devicePhoneNumber = value;
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
     * Obtém o valor da propriedade lastContactTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastContactTime() {
        return lastContactTime;
    }

    /**
     * Define o valor da propriedade lastContactTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastContactTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastContactTime = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPosition.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getLastKnownPosition() {
        return lastKnownPosition;
    }

    /**
     * Define o valor da propriedade lastKnownPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setLastKnownPosition(JAXBElement<Coordinate> value) {
        this.lastKnownPosition = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPositionTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastKnownPositionTime() {
        return lastKnownPositionTime;
    }

    /**
     * Define o valor da propriedade lastKnownPositionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastKnownPositionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastKnownPositionTime = value;
    }

    /**
     * Obtém o valor da propriedade navDeviceActivationStatusOmnitracsNavigationActivationStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNavDeviceActivationStatusOmnitracsNavigationActivationStatus() {
        return navDeviceActivationStatusOmnitracsNavigationActivationStatus;
    }

    /**
     * Define o valor da propriedade navDeviceActivationStatusOmnitracsNavigationActivationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNavDeviceActivationStatusOmnitracsNavigationActivationStatus(JAXBElement<String> value) {
        this.navDeviceActivationStatusOmnitracsNavigationActivationStatus = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigationActivationCodeExpiration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOmnitracsNavigationActivationCodeExpiration() {
        return omnitracsNavigationActivationCodeExpiration;
    }

    /**
     * Define o valor da propriedade omnitracsNavigationActivationCodeExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOmnitracsNavigationActivationCodeExpiration(JAXBElement<XMLGregorianCalendar> value) {
        this.omnitracsNavigationActivationCodeExpiration = value;
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
     * Obtém o valor da propriedade receivedSignalStrengthIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceivedSignalStrengthIndicator() {
        return receivedSignalStrengthIndicator;
    }

    /**
     * Define o valor da propriedade receivedSignalStrengthIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceivedSignalStrengthIndicator(JAXBElement<Double> value) {
        this.receivedSignalStrengthIndicator = value;
    }

    /**
     * Obtém o valor da propriedade timeSinceLastContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTimeSinceLastContact() {
        return timeSinceLastContact;
    }

    /**
     * Define o valor da propriedade timeSinceLastContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTimeSinceLastContact(JAXBElement<Duration> value) {
        this.timeSinceLastContact = value;
    }

    /**
     * Obtém o valor da propriedade timeSinceLastPositionUpdate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTimeSinceLastPositionUpdate() {
        return timeSinceLastPositionUpdate;
    }

    /**
     * Define o valor da propriedade timeSinceLastPositionUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTimeSinceLastPositionUpdate(JAXBElement<Duration> value) {
        this.timeSinceLastPositionUpdate = value;
    }

}
