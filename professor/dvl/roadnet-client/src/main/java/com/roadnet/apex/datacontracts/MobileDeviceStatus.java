
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de MobileDeviceStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MobileDeviceStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BatteryState" type="{http://roadnet.com/apex/DataContracts/}BatteryState" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRouteDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRoutingSessionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EnableCoPilotNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOtNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastContactTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPosition" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPositionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastUsedRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OTNavigationMapVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OTNavigationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtNavigationActivationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RNMobileVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeSinceLastContact" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDeviceStatus", propOrder = {
    "active",
    "batteryState",
    "currentRouteDisplayName",
    "currentRouteEntityKey",
    "currentRoutingSessionDate",
    "enableCoPilotNavigation",
    "enableOtNavigation",
    "lastContactTime",
    "lastKnownPosition",
    "lastKnownPositionTime",
    "lastUsedRegionIdentifier",
    "mobileDeviceDescription",
    "mobileDeviceEntityKey",
    "mobileDeviceIdentifier",
    "otNavigationMapVersion",
    "otNavigationVersion",
    "otNavigationActivationCode",
    "phoneNumber",
    "rnMobileVersion",
    "timeSinceLastContact"
})
public class MobileDeviceStatus
    extends DataTransferObject
{

    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElementRef(name = "BatteryState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BatteryState> batteryState;
    @XmlElementRef(name = "CurrentRouteDisplayName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRouteDisplayName;
    @XmlElementRef(name = "CurrentRouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> currentRouteEntityKey;
    @XmlElementRef(name = "CurrentRoutingSessionDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> currentRoutingSessionDate;
    @XmlElement(name = "EnableCoPilotNavigation")
    protected Boolean enableCoPilotNavigation;
    @XmlElement(name = "EnableOtNavigation")
    protected Boolean enableOtNavigation;
    @XmlElementRef(name = "LastContactTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastContactTime;
    @XmlElementRef(name = "LastKnownPosition", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> lastKnownPosition;
    @XmlElementRef(name = "LastKnownPositionTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastKnownPositionTime;
    @XmlElementRef(name = "LastUsedRegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUsedRegionIdentifier;
    @XmlElementRef(name = "MobileDeviceDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileDeviceDescription;
    @XmlElement(name = "MobileDeviceEntityKey")
    protected Long mobileDeviceEntityKey;
    @XmlElementRef(name = "MobileDeviceIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileDeviceIdentifier;
    @XmlElementRef(name = "OTNavigationMapVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otNavigationMapVersion;
    @XmlElementRef(name = "OTNavigationVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otNavigationVersion;
    @XmlElementRef(name = "OtNavigationActivationCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otNavigationActivationCode;
    @XmlElementRef(name = "PhoneNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumber;
    @XmlElementRef(name = "RNMobileVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rnMobileVersion;
    @XmlElementRef(name = "TimeSinceLastContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> timeSinceLastContact;

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
     * Obtém o valor da propriedade batteryState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BatteryState }{@code >}
     *     
     */
    public JAXBElement<BatteryState> getBatteryState() {
        return batteryState;
    }

    /**
     * Define o valor da propriedade batteryState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BatteryState }{@code >}
     *     
     */
    public void setBatteryState(JAXBElement<BatteryState> value) {
        this.batteryState = value;
    }

    /**
     * Obtém o valor da propriedade currentRouteDisplayName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentRouteDisplayName() {
        return currentRouteDisplayName;
    }

    /**
     * Define o valor da propriedade currentRouteDisplayName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentRouteDisplayName(JAXBElement<String> value) {
        this.currentRouteDisplayName = value;
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
     * Obtém o valor da propriedade enableCoPilotNavigation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCoPilotNavigation() {
        return enableCoPilotNavigation;
    }

    /**
     * Define o valor da propriedade enableCoPilotNavigation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCoPilotNavigation(Boolean value) {
        this.enableCoPilotNavigation = value;
    }

    /**
     * Obtém o valor da propriedade enableOtNavigation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableOtNavigation() {
        return enableOtNavigation;
    }

    /**
     * Define o valor da propriedade enableOtNavigation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableOtNavigation(Boolean value) {
        this.enableOtNavigation = value;
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
     * Obtém o valor da propriedade lastUsedRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUsedRegionIdentifier() {
        return lastUsedRegionIdentifier;
    }

    /**
     * Define o valor da propriedade lastUsedRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUsedRegionIdentifier(JAXBElement<String> value) {
        this.lastUsedRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileDeviceDescription() {
        return mobileDeviceDescription;
    }

    /**
     * Define o valor da propriedade mobileDeviceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileDeviceDescription(JAXBElement<String> value) {
        this.mobileDeviceDescription = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMobileDeviceEntityKey() {
        return mobileDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade mobileDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMobileDeviceEntityKey(Long value) {
        this.mobileDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileDeviceIdentifier() {
        return mobileDeviceIdentifier;
    }

    /**
     * Define o valor da propriedade mobileDeviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileDeviceIdentifier(JAXBElement<String> value) {
        this.mobileDeviceIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade otNavigationMapVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOTNavigationMapVersion() {
        return otNavigationMapVersion;
    }

    /**
     * Define o valor da propriedade otNavigationMapVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOTNavigationMapVersion(JAXBElement<String> value) {
        this.otNavigationMapVersion = value;
    }

    /**
     * Obtém o valor da propriedade otNavigationVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOTNavigationVersion() {
        return otNavigationVersion;
    }

    /**
     * Define o valor da propriedade otNavigationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOTNavigationVersion(JAXBElement<String> value) {
        this.otNavigationVersion = value;
    }

    /**
     * Obtém o valor da propriedade otNavigationActivationCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtNavigationActivationCode() {
        return otNavigationActivationCode;
    }

    /**
     * Define o valor da propriedade otNavigationActivationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtNavigationActivationCode(JAXBElement<String> value) {
        this.otNavigationActivationCode = value;
    }

    /**
     * Obtém o valor da propriedade phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define o valor da propriedade phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade rnMobileVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRNMobileVersion() {
        return rnMobileVersion;
    }

    /**
     * Define o valor da propriedade rnMobileVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRNMobileVersion(JAXBElement<String> value) {
        this.rnMobileVersion = value;
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

}
