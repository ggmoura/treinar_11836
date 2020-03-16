
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de WorkerComplianceStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerComplianceStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccumulatedDutyTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BerthTimeToday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BerthTimeYesterday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRuleSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DriveTimeAccumulatedThisWeek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DriveTimeToday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DriveTimeYesterday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DriverSid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DutyTimeAccumulatedThisWeek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DutyTimeRemainingThisWeek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsLoggedIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastDutyStatusChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastLoginDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastLogoutDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastResetDateTimeBegan" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastStatusCalculationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NextAvailableResetPeriod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OffDutyTimeToday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OffDutyTimeYesterday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OnDutyTimeToday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OnDutyTimeYesterday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlmEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlmStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RemainingDriverTimeToday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RemainingDutyTimeToday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ResetCompleteOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="VehicleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerDutyStatus_LastKnownDutyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerComplianceStatus", propOrder = {
    "accumulatedDutyTime",
    "berthTimeToday",
    "berthTimeYesterday",
    "currentRegionEntityKey",
    "currentRuleSet",
    "driveTimeAccumulatedThisWeek",
    "driveTimeToday",
    "driveTimeYesterday",
    "driverSid",
    "dutyTimeAccumulatedThisWeek",
    "dutyTimeRemainingThisWeek",
    "equipmentIdentifier",
    "isLoggedIn",
    "lastDutyStatusChange",
    "lastLoginDateTime",
    "lastLogoutDateTime",
    "lastResetDateTimeBegan",
    "lastStatusCalculationTime",
    "nextAvailableResetPeriod",
    "offDutyTimeToday",
    "offDutyTimeYesterday",
    "onDutyTimeToday",
    "onDutyTimeYesterday",
    "plmEnd",
    "plmStart",
    "remainingDriverTimeToday",
    "remainingDutyTimeToday",
    "resetCompleteOn",
    "vehicleName",
    "workerDutyStatusLastKnownDutyStatus",
    "workerIdentifier",
    "workerName",
    "worldTimeZoneTimeZone"
})
public class WorkerComplianceStatus {

    @XmlElement(name = "AccumulatedDutyTime")
    protected Integer accumulatedDutyTime;
    @XmlElement(name = "BerthTimeToday")
    protected Integer berthTimeToday;
    @XmlElement(name = "BerthTimeYesterday")
    protected Integer berthTimeYesterday;
    @XmlElement(name = "CurrentRegionEntityKey")
    protected Long currentRegionEntityKey;
    @XmlElementRef(name = "CurrentRuleSet", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRuleSet;
    @XmlElement(name = "DriveTimeAccumulatedThisWeek")
    protected Integer driveTimeAccumulatedThisWeek;
    @XmlElement(name = "DriveTimeToday")
    protected Integer driveTimeToday;
    @XmlElement(name = "DriveTimeYesterday")
    protected Integer driveTimeYesterday;
    @XmlElement(name = "DriverSid")
    protected Long driverSid;
    @XmlElement(name = "DutyTimeAccumulatedThisWeek")
    protected Integer dutyTimeAccumulatedThisWeek;
    @XmlElement(name = "DutyTimeRemainingThisWeek")
    protected Integer dutyTimeRemainingThisWeek;
    @XmlElementRef(name = "EquipmentIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentIdentifier;
    @XmlElement(name = "IsLoggedIn")
    protected Boolean isLoggedIn;
    @XmlElement(name = "LastDutyStatusChange")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDutyStatusChange;
    @XmlElement(name = "LastLoginDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginDateTime;
    @XmlElement(name = "LastLogoutDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLogoutDateTime;
    @XmlElement(name = "LastResetDateTimeBegan")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastResetDateTimeBegan;
    @XmlElement(name = "LastStatusCalculationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastStatusCalculationTime;
    @XmlElement(name = "NextAvailableResetPeriod")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextAvailableResetPeriod;
    @XmlElement(name = "OffDutyTimeToday")
    protected Integer offDutyTimeToday;
    @XmlElement(name = "OffDutyTimeYesterday")
    protected Integer offDutyTimeYesterday;
    @XmlElement(name = "OnDutyTimeToday")
    protected Integer onDutyTimeToday;
    @XmlElement(name = "OnDutyTimeYesterday")
    protected Integer onDutyTimeYesterday;
    @XmlElement(name = "PlmEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plmEnd;
    @XmlElement(name = "PlmStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plmStart;
    @XmlElement(name = "RemainingDriverTimeToday")
    protected Integer remainingDriverTimeToday;
    @XmlElement(name = "RemainingDutyTimeToday")
    protected Integer remainingDutyTimeToday;
    @XmlElement(name = "ResetCompleteOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resetCompleteOn;
    @XmlElementRef(name = "VehicleName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleName;
    @XmlElementRef(name = "WorkerDutyStatus_LastKnownDutyStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerDutyStatusLastKnownDutyStatus;
    @XmlElementRef(name = "WorkerIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerIdentifier;
    @XmlElementRef(name = "WorkerName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> workerName;
    @XmlElementRef(name = "WorldTimeZone_TimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade accumulatedDutyTime.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccumulatedDutyTime() {
        return accumulatedDutyTime;
    }

    /**
     * Define o valor da propriedade accumulatedDutyTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccumulatedDutyTime(Integer value) {
        this.accumulatedDutyTime = value;
    }

    /**
     * Obtém o valor da propriedade berthTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBerthTimeToday() {
        return berthTimeToday;
    }

    /**
     * Define o valor da propriedade berthTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBerthTimeToday(Integer value) {
        this.berthTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade berthTimeYesterday.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBerthTimeYesterday() {
        return berthTimeYesterday;
    }

    /**
     * Define o valor da propriedade berthTimeYesterday.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBerthTimeYesterday(Integer value) {
        this.berthTimeYesterday = value;
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
     * Obtém o valor da propriedade currentRuleSet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentRuleSet() {
        return currentRuleSet;
    }

    /**
     * Define o valor da propriedade currentRuleSet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentRuleSet(JAXBElement<String> value) {
        this.currentRuleSet = value;
    }

    /**
     * Obtém o valor da propriedade driveTimeAccumulatedThisWeek.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDriveTimeAccumulatedThisWeek() {
        return driveTimeAccumulatedThisWeek;
    }

    /**
     * Define o valor da propriedade driveTimeAccumulatedThisWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDriveTimeAccumulatedThisWeek(Integer value) {
        this.driveTimeAccumulatedThisWeek = value;
    }

    /**
     * Obtém o valor da propriedade driveTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDriveTimeToday() {
        return driveTimeToday;
    }

    /**
     * Define o valor da propriedade driveTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDriveTimeToday(Integer value) {
        this.driveTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade driveTimeYesterday.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDriveTimeYesterday() {
        return driveTimeYesterday;
    }

    /**
     * Define o valor da propriedade driveTimeYesterday.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDriveTimeYesterday(Integer value) {
        this.driveTimeYesterday = value;
    }

    /**
     * Obtém o valor da propriedade driverSid.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDriverSid() {
        return driverSid;
    }

    /**
     * Define o valor da propriedade driverSid.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDriverSid(Long value) {
        this.driverSid = value;
    }

    /**
     * Obtém o valor da propriedade dutyTimeAccumulatedThisWeek.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDutyTimeAccumulatedThisWeek() {
        return dutyTimeAccumulatedThisWeek;
    }

    /**
     * Define o valor da propriedade dutyTimeAccumulatedThisWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDutyTimeAccumulatedThisWeek(Integer value) {
        this.dutyTimeAccumulatedThisWeek = value;
    }

    /**
     * Obtém o valor da propriedade dutyTimeRemainingThisWeek.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDutyTimeRemainingThisWeek() {
        return dutyTimeRemainingThisWeek;
    }

    /**
     * Define o valor da propriedade dutyTimeRemainingThisWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDutyTimeRemainingThisWeek(Integer value) {
        this.dutyTimeRemainingThisWeek = value;
    }

    /**
     * Obtém o valor da propriedade equipmentIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentIdentifier() {
        return equipmentIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentIdentifier(JAXBElement<String> value) {
        this.equipmentIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade isLoggedIn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    /**
     * Define o valor da propriedade isLoggedIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoggedIn(Boolean value) {
        this.isLoggedIn = value;
    }

    /**
     * Obtém o valor da propriedade lastDutyStatusChange.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDutyStatusChange() {
        return lastDutyStatusChange;
    }

    /**
     * Define o valor da propriedade lastDutyStatusChange.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDutyStatusChange(XMLGregorianCalendar value) {
        this.lastDutyStatusChange = value;
    }

    /**
     * Obtém o valor da propriedade lastLoginDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    /**
     * Define o valor da propriedade lastLoginDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoginDateTime(XMLGregorianCalendar value) {
        this.lastLoginDateTime = value;
    }

    /**
     * Obtém o valor da propriedade lastLogoutDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLogoutDateTime() {
        return lastLogoutDateTime;
    }

    /**
     * Define o valor da propriedade lastLogoutDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLogoutDateTime(XMLGregorianCalendar value) {
        this.lastLogoutDateTime = value;
    }

    /**
     * Obtém o valor da propriedade lastResetDateTimeBegan.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastResetDateTimeBegan() {
        return lastResetDateTimeBegan;
    }

    /**
     * Define o valor da propriedade lastResetDateTimeBegan.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastResetDateTimeBegan(XMLGregorianCalendar value) {
        this.lastResetDateTimeBegan = value;
    }

    /**
     * Obtém o valor da propriedade lastStatusCalculationTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastStatusCalculationTime() {
        return lastStatusCalculationTime;
    }

    /**
     * Define o valor da propriedade lastStatusCalculationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastStatusCalculationTime(XMLGregorianCalendar value) {
        this.lastStatusCalculationTime = value;
    }

    /**
     * Obtém o valor da propriedade nextAvailableResetPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextAvailableResetPeriod() {
        return nextAvailableResetPeriod;
    }

    /**
     * Define o valor da propriedade nextAvailableResetPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextAvailableResetPeriod(XMLGregorianCalendar value) {
        this.nextAvailableResetPeriod = value;
    }

    /**
     * Obtém o valor da propriedade offDutyTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffDutyTimeToday() {
        return offDutyTimeToday;
    }

    /**
     * Define o valor da propriedade offDutyTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffDutyTimeToday(Integer value) {
        this.offDutyTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade offDutyTimeYesterday.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffDutyTimeYesterday() {
        return offDutyTimeYesterday;
    }

    /**
     * Define o valor da propriedade offDutyTimeYesterday.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffDutyTimeYesterday(Integer value) {
        this.offDutyTimeYesterday = value;
    }

    /**
     * Obtém o valor da propriedade onDutyTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOnDutyTimeToday() {
        return onDutyTimeToday;
    }

    /**
     * Define o valor da propriedade onDutyTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOnDutyTimeToday(Integer value) {
        this.onDutyTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade onDutyTimeYesterday.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOnDutyTimeYesterday() {
        return onDutyTimeYesterday;
    }

    /**
     * Define o valor da propriedade onDutyTimeYesterday.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOnDutyTimeYesterday(Integer value) {
        this.onDutyTimeYesterday = value;
    }

    /**
     * Obtém o valor da propriedade plmEnd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlmEnd() {
        return plmEnd;
    }

    /**
     * Define o valor da propriedade plmEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlmEnd(XMLGregorianCalendar value) {
        this.plmEnd = value;
    }

    /**
     * Obtém o valor da propriedade plmStart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlmStart() {
        return plmStart;
    }

    /**
     * Define o valor da propriedade plmStart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlmStart(XMLGregorianCalendar value) {
        this.plmStart = value;
    }

    /**
     * Obtém o valor da propriedade remainingDriverTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingDriverTimeToday() {
        return remainingDriverTimeToday;
    }

    /**
     * Define o valor da propriedade remainingDriverTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingDriverTimeToday(Integer value) {
        this.remainingDriverTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade remainingDutyTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingDutyTimeToday() {
        return remainingDutyTimeToday;
    }

    /**
     * Define o valor da propriedade remainingDutyTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingDutyTimeToday(Integer value) {
        this.remainingDutyTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade resetCompleteOn.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResetCompleteOn() {
        return resetCompleteOn;
    }

    /**
     * Define o valor da propriedade resetCompleteOn.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResetCompleteOn(XMLGregorianCalendar value) {
        this.resetCompleteOn = value;
    }

    /**
     * Obtém o valor da propriedade vehicleName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleName() {
        return vehicleName;
    }

    /**
     * Define o valor da propriedade vehicleName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleName(JAXBElement<String> value) {
        this.vehicleName = value;
    }

    /**
     * Obtém o valor da propriedade workerDutyStatusLastKnownDutyStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerDutyStatusLastKnownDutyStatus() {
        return workerDutyStatusLastKnownDutyStatus;
    }

    /**
     * Define o valor da propriedade workerDutyStatusLastKnownDutyStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerDutyStatusLastKnownDutyStatus(JAXBElement<String> value) {
        this.workerDutyStatusLastKnownDutyStatus = value;
    }

    /**
     * Obtém o valor da propriedade workerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerIdentifier() {
        return workerIdentifier;
    }

    /**
     * Define o valor da propriedade workerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerIdentifier(JAXBElement<String> value) {
        this.workerIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade workerName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getWorkerName() {
        return workerName;
    }

    /**
     * Define o valor da propriedade workerName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setWorkerName(JAXBElement<PersonName> value) {
        this.workerName = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneTimeZone = value;
    }

}
