
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ImmutableObject;


/**
 * <p>Classe Java de DriverLog complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DriverLog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}ImmutableObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierDOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CoDriverID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CoDriverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistanceEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DriveTimeToday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DriverConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DriverID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DriverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EditFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FleetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FleetDOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FleetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOSRuleSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastResetDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LogDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfLogDetailDto" minOccurs="0"/&gt;
 *         &lt;element name="OffDutyTimeToday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OnDutyTimeToday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OnDutyTimeWeek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReportDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SensorFailure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShippingInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SleeperBerthTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalDistanceToday" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalViolationTimeToday" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TrailerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrailerLicensePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleEndOdometer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleLicensePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleStartOdometer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverLog", propOrder = {
    "carrierAddress",
    "carrierDOT",
    "carrierName",
    "coDriverID",
    "coDriverName",
    "distanceEdit",
    "distanceUnit",
    "driveTimeToday",
    "driverConfirmed",
    "driverID",
    "driverName",
    "editFlag",
    "fleetAddress",
    "fleetDOT",
    "fleetName",
    "fromLocation",
    "hosRuleSet",
    "lastResetDateTime",
    "logDetails",
    "offDutyTimeToday",
    "onDutyTimeToday",
    "onDutyTimeWeek",
    "reportDateTime",
    "sensorFailure",
    "shippingInformation",
    "sleeperBerthTime",
    "timeZone",
    "toLocation",
    "totalDistanceToday",
    "totalViolationTimeToday",
    "trailerID",
    "trailerLicensePlate",
    "vehicleEndOdometer",
    "vehicleID",
    "vehicleLicensePlate",
    "vehicleStartOdometer"
})
public class DriverLog
    extends ImmutableObject
{

    @XmlElementRef(name = "CarrierAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carrierAddress;
    @XmlElementRef(name = "CarrierDOT", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carrierDOT;
    @XmlElementRef(name = "CarrierName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carrierName;
    @XmlElementRef(name = "CoDriverID", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coDriverID;
    @XmlElementRef(name = "CoDriverName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coDriverName;
    @XmlElement(name = "DistanceEdit")
    protected Boolean distanceEdit;
    @XmlElementRef(name = "DistanceUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distanceUnit;
    @XmlElement(name = "DriveTimeToday")
    protected Integer driveTimeToday;
    @XmlElement(name = "DriverConfirmed")
    protected Boolean driverConfirmed;
    @XmlElementRef(name = "DriverID", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> driverID;
    @XmlElementRef(name = "DriverName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> driverName;
    @XmlElement(name = "EditFlag")
    protected Boolean editFlag;
    @XmlElementRef(name = "FleetAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fleetAddress;
    @XmlElementRef(name = "FleetDOT", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fleetDOT;
    @XmlElementRef(name = "FleetName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fleetName;
    @XmlElementRef(name = "FromLocation", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fromLocation;
    @XmlElementRef(name = "HOSRuleSet", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosRuleSet;
    @XmlElementRef(name = "LastResetDateTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastResetDateTime;
    @XmlElementRef(name = "LogDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLogDetailDto> logDetails;
    @XmlElement(name = "OffDutyTimeToday")
    protected Integer offDutyTimeToday;
    @XmlElement(name = "OnDutyTimeToday")
    protected Integer onDutyTimeToday;
    @XmlElement(name = "OnDutyTimeWeek")
    protected Integer onDutyTimeWeek;
    @XmlElement(name = "ReportDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportDateTime;
    @XmlElement(name = "SensorFailure")
    protected Boolean sensorFailure;
    @XmlElementRef(name = "ShippingInformation", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shippingInformation;
    @XmlElement(name = "SleeperBerthTime")
    protected Integer sleeperBerthTime;
    @XmlElementRef(name = "TimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeZone;
    @XmlElementRef(name = "ToLocation", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toLocation;
    @XmlElement(name = "TotalDistanceToday")
    protected Double totalDistanceToday;
    @XmlElement(name = "TotalViolationTimeToday")
    protected Integer totalViolationTimeToday;
    @XmlElementRef(name = "TrailerID", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trailerID;
    @XmlElementRef(name = "TrailerLicensePlate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trailerLicensePlate;
    @XmlElementRef(name = "VehicleEndOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleEndOdometer;
    @XmlElementRef(name = "VehicleID", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleID;
    @XmlElementRef(name = "VehicleLicensePlate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleLicensePlate;
    @XmlElementRef(name = "VehicleStartOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleStartOdometer;

    /**
     * Obtém o valor da propriedade carrierAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarrierAddress() {
        return carrierAddress;
    }

    /**
     * Define o valor da propriedade carrierAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarrierAddress(JAXBElement<String> value) {
        this.carrierAddress = value;
    }

    /**
     * Obtém o valor da propriedade carrierDOT.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarrierDOT() {
        return carrierDOT;
    }

    /**
     * Define o valor da propriedade carrierDOT.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarrierDOT(JAXBElement<String> value) {
        this.carrierDOT = value;
    }

    /**
     * Obtém o valor da propriedade carrierName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarrierName() {
        return carrierName;
    }

    /**
     * Define o valor da propriedade carrierName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarrierName(JAXBElement<String> value) {
        this.carrierName = value;
    }

    /**
     * Obtém o valor da propriedade coDriverID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoDriverID() {
        return coDriverID;
    }

    /**
     * Define o valor da propriedade coDriverID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoDriverID(JAXBElement<String> value) {
        this.coDriverID = value;
    }

    /**
     * Obtém o valor da propriedade coDriverName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoDriverName() {
        return coDriverName;
    }

    /**
     * Define o valor da propriedade coDriverName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoDriverName(JAXBElement<String> value) {
        this.coDriverName = value;
    }

    /**
     * Obtém o valor da propriedade distanceEdit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceEdit() {
        return distanceEdit;
    }

    /**
     * Define o valor da propriedade distanceEdit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceEdit(Boolean value) {
        this.distanceEdit = value;
    }

    /**
     * Obtém o valor da propriedade distanceUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * Define o valor da propriedade distanceUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistanceUnit(JAXBElement<String> value) {
        this.distanceUnit = value;
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
     * Obtém o valor da propriedade driverConfirmed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDriverConfirmed() {
        return driverConfirmed;
    }

    /**
     * Define o valor da propriedade driverConfirmed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriverConfirmed(Boolean value) {
        this.driverConfirmed = value;
    }

    /**
     * Obtém o valor da propriedade driverID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDriverID() {
        return driverID;
    }

    /**
     * Define o valor da propriedade driverID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDriverID(JAXBElement<String> value) {
        this.driverID = value;
    }

    /**
     * Obtém o valor da propriedade driverName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDriverName() {
        return driverName;
    }

    /**
     * Define o valor da propriedade driverName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDriverName(JAXBElement<String> value) {
        this.driverName = value;
    }

    /**
     * Obtém o valor da propriedade editFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditFlag() {
        return editFlag;
    }

    /**
     * Define o valor da propriedade editFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditFlag(Boolean value) {
        this.editFlag = value;
    }

    /**
     * Obtém o valor da propriedade fleetAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFleetAddress() {
        return fleetAddress;
    }

    /**
     * Define o valor da propriedade fleetAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFleetAddress(JAXBElement<String> value) {
        this.fleetAddress = value;
    }

    /**
     * Obtém o valor da propriedade fleetDOT.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFleetDOT() {
        return fleetDOT;
    }

    /**
     * Define o valor da propriedade fleetDOT.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFleetDOT(JAXBElement<String> value) {
        this.fleetDOT = value;
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
     * Obtém o valor da propriedade fromLocation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromLocation() {
        return fromLocation;
    }

    /**
     * Define o valor da propriedade fromLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromLocation(JAXBElement<String> value) {
        this.fromLocation = value;
    }

    /**
     * Obtém o valor da propriedade hosRuleSet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHOSRuleSet() {
        return hosRuleSet;
    }

    /**
     * Define o valor da propriedade hosRuleSet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHOSRuleSet(JAXBElement<String> value) {
        this.hosRuleSet = value;
    }

    /**
     * Obtém o valor da propriedade lastResetDateTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastResetDateTime() {
        return lastResetDateTime;
    }

    /**
     * Define o valor da propriedade lastResetDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastResetDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastResetDateTime = value;
    }

    /**
     * Obtém o valor da propriedade logDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLogDetailDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLogDetailDto> getLogDetails() {
        return logDetails;
    }

    /**
     * Define o valor da propriedade logDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLogDetailDto }{@code >}
     *     
     */
    public void setLogDetails(JAXBElement<ArrayOfLogDetailDto> value) {
        this.logDetails = value;
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
     * Obtém o valor da propriedade onDutyTimeWeek.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOnDutyTimeWeek() {
        return onDutyTimeWeek;
    }

    /**
     * Define o valor da propriedade onDutyTimeWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOnDutyTimeWeek(Integer value) {
        this.onDutyTimeWeek = value;
    }

    /**
     * Obtém o valor da propriedade reportDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDateTime() {
        return reportDateTime;
    }

    /**
     * Define o valor da propriedade reportDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDateTime(XMLGregorianCalendar value) {
        this.reportDateTime = value;
    }

    /**
     * Obtém o valor da propriedade sensorFailure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSensorFailure() {
        return sensorFailure;
    }

    /**
     * Define o valor da propriedade sensorFailure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSensorFailure(Boolean value) {
        this.sensorFailure = value;
    }

    /**
     * Obtém o valor da propriedade shippingInformation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingInformation() {
        return shippingInformation;
    }

    /**
     * Define o valor da propriedade shippingInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingInformation(JAXBElement<String> value) {
        this.shippingInformation = value;
    }

    /**
     * Obtém o valor da propriedade sleeperBerthTime.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSleeperBerthTime() {
        return sleeperBerthTime;
    }

    /**
     * Define o valor da propriedade sleeperBerthTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSleeperBerthTime(Integer value) {
        this.sleeperBerthTime = value;
    }

    /**
     * Obtém o valor da propriedade timeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeZone() {
        return timeZone;
    }

    /**
     * Define o valor da propriedade timeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeZone(JAXBElement<String> value) {
        this.timeZone = value;
    }

    /**
     * Obtém o valor da propriedade toLocation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToLocation() {
        return toLocation;
    }

    /**
     * Define o valor da propriedade toLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToLocation(JAXBElement<String> value) {
        this.toLocation = value;
    }

    /**
     * Obtém o valor da propriedade totalDistanceToday.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalDistanceToday() {
        return totalDistanceToday;
    }

    /**
     * Define o valor da propriedade totalDistanceToday.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalDistanceToday(Double value) {
        this.totalDistanceToday = value;
    }

    /**
     * Obtém o valor da propriedade totalViolationTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalViolationTimeToday() {
        return totalViolationTimeToday;
    }

    /**
     * Define o valor da propriedade totalViolationTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalViolationTimeToday(Integer value) {
        this.totalViolationTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade trailerID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrailerID() {
        return trailerID;
    }

    /**
     * Define o valor da propriedade trailerID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrailerID(JAXBElement<String> value) {
        this.trailerID = value;
    }

    /**
     * Obtém o valor da propriedade trailerLicensePlate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrailerLicensePlate() {
        return trailerLicensePlate;
    }

    /**
     * Define o valor da propriedade trailerLicensePlate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrailerLicensePlate(JAXBElement<String> value) {
        this.trailerLicensePlate = value;
    }

    /**
     * Obtém o valor da propriedade vehicleEndOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleEndOdometer() {
        return vehicleEndOdometer;
    }

    /**
     * Define o valor da propriedade vehicleEndOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleEndOdometer(JAXBElement<String> value) {
        this.vehicleEndOdometer = value;
    }

    /**
     * Obtém o valor da propriedade vehicleID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleID() {
        return vehicleID;
    }

    /**
     * Define o valor da propriedade vehicleID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleID(JAXBElement<String> value) {
        this.vehicleID = value;
    }

    /**
     * Obtém o valor da propriedade vehicleLicensePlate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    /**
     * Define o valor da propriedade vehicleLicensePlate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleLicensePlate(JAXBElement<String> value) {
        this.vehicleLicensePlate = value;
    }

    /**
     * Obtém o valor da propriedade vehicleStartOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleStartOdometer() {
        return vehicleStartOdometer;
    }

    /**
     * Define o valor da propriedade vehicleStartOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleStartOdometer(JAXBElement<String> value) {
        this.vehicleStartOdometer = value;
    }

}
